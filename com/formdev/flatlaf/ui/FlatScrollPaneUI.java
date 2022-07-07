// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.event.FocusEvent;
import java.awt.event.ContainerEvent;
import java.awt.Insets;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import java.awt.event.ContainerListener;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JButton;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Component;
import javax.swing.JScrollBar;
import javax.swing.JViewport;
import java.awt.Rectangle;
import javax.swing.Scrollable;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JScrollPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class FlatScrollPaneUI extends BasicScrollPaneUI
{
    private Handler handler;
    private static final double EPSILON = 1.0E-5;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatScrollPaneUI();
    }
    
    @Override
    public void installUI(final JComponent c) {
        super.installUI(c);
        final int focusWidth = UIManager.getInt("Component.focusWidth");
        LookAndFeel.installProperty(c, "opaque", focusWidth == 0);
        MigLayoutVisualPadding.install(this.scrollpane);
    }
    
    @Override
    public void uninstallUI(final JComponent c) {
        MigLayoutVisualPadding.uninstall(this.scrollpane);
        super.uninstallUI(c);
    }
    
    @Override
    protected void installListeners(final JScrollPane c) {
        super.installListeners(c);
        this.addViewportListeners(this.scrollpane.getViewport());
    }
    
    @Override
    protected void uninstallListeners(final JComponent c) {
        super.uninstallListeners(c);
        this.removeViewportListeners(this.scrollpane.getViewport());
        this.handler = null;
    }
    
    @Override
    protected MouseWheelListener createMouseWheelListener() {
        return new MouseWheelHandler() {
            @Override
            public void mouseWheelMoved(final MouseWheelEvent e) {
                if (UIManager.getBoolean("ScrollPane.smoothScrolling") && FlatScrollPaneUI.this.scrollpane.isWheelScrollingEnabled() && e.getScrollType() == 0 && e.getPreciseWheelRotation() != 0.0 && e.getPreciseWheelRotation() != e.getWheelRotation()) {
                    FlatScrollPaneUI.this.mouseWheelMovedSmooth(e);
                }
                else {
                    super.mouseWheelMoved(e);
                }
            }
        };
    }
    
    private void mouseWheelMovedSmooth(final MouseWheelEvent e) {
        final JViewport viewport = this.scrollpane.getViewport();
        if (viewport == null) {
            return;
        }
        JScrollBar scrollbar = this.scrollpane.getVerticalScrollBar();
        if (scrollbar == null || !scrollbar.isVisible() || e.isShiftDown()) {
            scrollbar = this.scrollpane.getHorizontalScrollBar();
            if (scrollbar == null || !scrollbar.isVisible()) {
                return;
            }
        }
        e.consume();
        final double rotation = e.getPreciseWheelRotation();
        final int orientation = scrollbar.getOrientation();
        final Component view = viewport.getView();
        int unitIncrement;
        int blockIncrement;
        if (view instanceof Scrollable) {
            final Scrollable scrollable = (Scrollable)view;
            final Rectangle visibleRect = new Rectangle(viewport.getViewSize());
            unitIncrement = scrollable.getScrollableUnitIncrement(visibleRect, orientation, 1);
            blockIncrement = scrollable.getScrollableBlockIncrement(visibleRect, orientation, 1);
            if (unitIncrement > 0) {
                if (orientation == 1) {
                    final Rectangle rectangle = visibleRect;
                    rectangle.y += unitIncrement;
                    final Rectangle rectangle2 = visibleRect;
                    rectangle2.height -= unitIncrement;
                }
                else {
                    final Rectangle rectangle3 = visibleRect;
                    rectangle3.x += unitIncrement;
                    final Rectangle rectangle4 = visibleRect;
                    rectangle4.width -= unitIncrement;
                }
                final int unitIncrement2 = scrollable.getScrollableUnitIncrement(visibleRect, orientation, 1);
                if (unitIncrement2 > 0) {
                    unitIncrement = Math.min(unitIncrement, unitIncrement2);
                }
            }
        }
        else {
            final int direction = (rotation < 0.0) ? -1 : 1;
            unitIncrement = scrollbar.getUnitIncrement(direction);
            blockIncrement = scrollbar.getBlockIncrement(direction);
        }
        int scrollAmount = e.getScrollAmount();
        final int viewportWH = (orientation == 1) ? viewport.getHeight() : viewport.getWidth();
        if (unitIncrement * scrollAmount > viewportWH) {
            scrollAmount = Math.max(viewportWH / unitIncrement, 1);
        }
        final double delta = rotation * scrollAmount * unitIncrement;
        final boolean adjustDelta = Math.abs(rotation) < 1.00001;
        final double adjustedDelta = adjustDelta ? Math.max(-blockIncrement, Math.min(delta, blockIncrement)) : delta;
        final int value = scrollbar.getValue();
        final double minDelta = scrollbar.getMinimum() - value;
        final double maxDelta = scrollbar.getMaximum() - scrollbar.getModel().getExtent() - value;
        final double boundedDelta = Math.max(minDelta, Math.min(adjustedDelta, maxDelta));
        final int newValue = value + (int)Math.round(boundedDelta);
        if (newValue != value) {
            scrollbar.setValue(newValue);
        }
    }
    
    @Override
    protected PropertyChangeListener createPropertyChangeListener() {
        return new PropertyChangeHandler() {
            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                super.propertyChange(e);
                final String propertyName = e.getPropertyName();
                switch (propertyName) {
                    case "JScrollBar.showButtons": {
                        final JScrollBar vsb = FlatScrollPaneUI.this.scrollpane.getVerticalScrollBar();
                        final JScrollBar hsb = FlatScrollPaneUI.this.scrollpane.getHorizontalScrollBar();
                        if (vsb != null) {
                            vsb.revalidate();
                            vsb.repaint();
                        }
                        if (hsb != null) {
                            hsb.revalidate();
                            hsb.repaint();
                            break;
                        }
                        break;
                    }
                    case "LOWER_LEFT_CORNER":
                    case "LOWER_RIGHT_CORNER":
                    case "UPPER_LEFT_CORNER":
                    case "UPPER_RIGHT_CORNER": {
                        final Object corner = e.getNewValue();
                        if (corner instanceof JButton && ((JButton)corner).getBorder() instanceof FlatButtonBorder && FlatScrollPaneUI.this.scrollpane.getViewport() != null && FlatScrollPaneUI.this.scrollpane.getViewport().getView() instanceof JTable) {
                            ((JButton)corner).setBorder(BorderFactory.createEmptyBorder());
                            ((JButton)corner).setFocusable(false);
                            break;
                        }
                        break;
                    }
                }
            }
        };
    }
    
    private Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler();
        }
        return this.handler;
    }
    
    @Override
    protected void updateViewport(final PropertyChangeEvent e) {
        super.updateViewport(e);
        final JViewport oldViewport = (JViewport)e.getOldValue();
        final JViewport newViewport = (JViewport)e.getNewValue();
        this.removeViewportListeners(oldViewport);
        this.addViewportListeners(newViewport);
    }
    
    private void addViewportListeners(final JViewport viewport) {
        if (viewport == null) {
            return;
        }
        viewport.addContainerListener(this.getHandler());
        final Component view = viewport.getView();
        if (view != null) {
            view.addFocusListener(this.getHandler());
        }
    }
    
    private void removeViewportListeners(final JViewport viewport) {
        if (viewport == null) {
            return;
        }
        viewport.removeContainerListener(this.getHandler());
        final Component view = viewport.getView();
        if (view != null) {
            view.removeFocusListener(this.getHandler());
        }
    }
    
    @Override
    public void update(final Graphics g, final JComponent c) {
        if (c.isOpaque()) {
            FlatUIUtils.paintParentBackground(g, c);
            final Insets insets = c.getInsets();
            g.setColor(c.getBackground());
            g.fillRect(insets.left, insets.top, c.getWidth() - insets.left - insets.right, c.getHeight() - insets.top - insets.bottom);
        }
        this.paint(g, c);
    }
    
    private class Handler implements ContainerListener, FocusListener
    {
        @Override
        public void componentAdded(final ContainerEvent e) {
            e.getChild().addFocusListener(this);
        }
        
        @Override
        public void componentRemoved(final ContainerEvent e) {
            e.getChild().removeFocusListener(this);
        }
        
        @Override
        public void focusGained(final FocusEvent e) {
            FlatScrollPaneUI.this.scrollpane.repaint();
        }
        
        @Override
        public void focusLost(final FocusEvent e) {
            FlatScrollPaneUI.this.scrollpane.repaint();
        }
    }
}
