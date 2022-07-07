// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.awt.Dialog;
import java.awt.Container;
import java.awt.Frame;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.JLayeredPane;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import java.awt.event.ComponentListener;
import java.awt.event.WindowStateListener;
import java.beans.PropertyChangeListener;

public class FlatWindowResizer implements PropertyChangeListener, WindowStateListener, ComponentListener
{
    protected static final Integer WINDOW_RESIZER_LAYER;
    protected final JRootPane rootPane;
    protected final int borderDragThickness;
    protected final int cornerDragWidth;
    protected final boolean honorFrameMinimumSizeOnResize;
    protected final boolean honorDialogMinimumSizeOnResize;
    protected final JComponent north;
    protected final JComponent south;
    protected final JComponent west;
    protected final JComponent east;
    protected Window window;
    
    public FlatWindowResizer(final JRootPane rootPane) {
        this.borderDragThickness = FlatUIUtils.getUIInt("RootPane.borderDragThickness", 5);
        this.cornerDragWidth = FlatUIUtils.getUIInt("RootPane.cornerDragWidth", 16);
        this.honorFrameMinimumSizeOnResize = UIManager.getBoolean("RootPane.honorFrameMinimumSizeOnResize");
        this.honorDialogMinimumSizeOnResize = UIManager.getBoolean("RootPane.honorDialogMinimumSizeOnResize");
        this.rootPane = rootPane;
        this.north = this.createDragBorderComponent(6, 8, 7);
        this.south = this.createDragBorderComponent(4, 9, 5);
        this.west = this.createDragBorderComponent(6, 10, 4);
        this.east = this.createDragBorderComponent(7, 11, 5);
        final JLayeredPane layeredPane = rootPane.getLayeredPane();
        layeredPane.add(this.north, FlatWindowResizer.WINDOW_RESIZER_LAYER);
        layeredPane.add(this.south, FlatWindowResizer.WINDOW_RESIZER_LAYER);
        layeredPane.add(this.west, FlatWindowResizer.WINDOW_RESIZER_LAYER);
        layeredPane.add(this.east, FlatWindowResizer.WINDOW_RESIZER_LAYER);
        rootPane.addComponentListener(this);
        rootPane.addPropertyChangeListener("ancestor", this);
        if (rootPane.isDisplayable()) {
            this.addNotify();
        }
    }
    
    protected DragBorderComponent createDragBorderComponent(final int leadingResizeDir, final int centerResizeDir, final int trailingResizeDir) {
        return new DragBorderComponent(leadingResizeDir, centerResizeDir, trailingResizeDir);
    }
    
    public void uninstall() {
        this.removeNotify();
        this.rootPane.removeComponentListener(this);
        this.rootPane.removePropertyChangeListener("ancestor", this);
        final JLayeredPane layeredPane = this.rootPane.getLayeredPane();
        layeredPane.remove(this.north);
        layeredPane.remove(this.south);
        layeredPane.remove(this.west);
        layeredPane.remove(this.east);
    }
    
    public void doLayout() {
        if (!this.north.isVisible()) {
            return;
        }
        final int x = 0;
        final int y = 0;
        final int width = this.rootPane.getWidth();
        final int height = this.rootPane.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        final int thickness = UIScale.scale(this.borderDragThickness);
        final int y2 = y + thickness;
        final int height2 = height - thickness * 2;
        this.north.setBounds(x, y, width, thickness);
        this.south.setBounds(x, y + height - thickness, width, thickness);
        this.west.setBounds(x, y2, thickness, height2);
        this.east.setBounds(x + width - thickness, y2, thickness, height2);
    }
    
    protected void addNotify() {
        final Container parent = this.rootPane.getParent();
        this.window = ((parent instanceof Window) ? ((Window)parent) : null);
        if (this.window instanceof Frame) {
            this.window.addPropertyChangeListener("resizable", this);
            this.window.addWindowStateListener(this);
        }
        this.updateVisibility();
    }
    
    protected void removeNotify() {
        if (this.window instanceof Frame) {
            this.window.removePropertyChangeListener("resizable", this);
            this.window.removeWindowStateListener(this);
        }
        this.window = null;
        this.updateVisibility();
    }
    
    protected void updateVisibility() {
        final boolean visible = this.isWindowResizable();
        if (visible == this.north.isVisible()) {
            return;
        }
        this.north.setVisible(visible);
        this.south.setVisible(visible);
        this.west.setVisible(visible);
        this.east.setEnabled(visible);
        if (visible) {
            this.east.setVisible(true);
            this.doLayout();
        }
        else {
            this.east.setBounds(0, 0, 1, 1);
        }
    }
    
    protected boolean isWindowResizable() {
        if (this.window instanceof Frame) {
            return ((Frame)this.window).isResizable() && (((Frame)this.window).getExtendedState() & 0x6) == 0x0;
        }
        return this.window instanceof Dialog && ((Dialog)this.window).isResizable();
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent e) {
        final String propertyName = e.getPropertyName();
        switch (propertyName) {
            case "ancestor": {
                if (e.getNewValue() != null) {
                    this.addNotify();
                    break;
                }
                this.removeNotify();
                break;
            }
            case "resizable": {
                this.updateVisibility();
                break;
            }
        }
    }
    
    @Override
    public void windowStateChanged(final WindowEvent e) {
        this.updateVisibility();
    }
    
    @Override
    public void componentResized(final ComponentEvent e) {
        this.doLayout();
    }
    
    @Override
    public void componentMoved(final ComponentEvent e) {
    }
    
    @Override
    public void componentShown(final ComponentEvent e) {
    }
    
    @Override
    public void componentHidden(final ComponentEvent e) {
    }
    
    static {
        WINDOW_RESIZER_LAYER = JLayeredPane.DRAG_LAYER + 1;
    }
    
    protected class DragBorderComponent extends JComponent implements MouseListener, MouseMotionListener
    {
        private final int leadingResizeDir;
        private final int centerResizeDir;
        private final int trailingResizeDir;
        private int resizeDir;
        private int dragStartMouseX;
        private int dragStartMouseY;
        private Rectangle dragStartWindowBounds;
        
        protected DragBorderComponent(final int leadingResizeDir, final int centerResizeDir, final int trailingResizeDir) {
            this.resizeDir = -1;
            this.leadingResizeDir = leadingResizeDir;
            this.centerResizeDir = centerResizeDir;
            this.trailingResizeDir = trailingResizeDir;
            this.setResizeDir(centerResizeDir);
            this.setVisible(false);
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
        }
        
        protected void setResizeDir(final int resizeDir) {
            if (this.resizeDir == resizeDir) {
                return;
            }
            this.resizeDir = resizeDir;
            this.setCursor(Cursor.getPredefinedCursor(resizeDir));
        }
        
        @Override
        public Dimension getPreferredSize() {
            final int thickness = UIScale.scale(FlatWindowResizer.this.borderDragThickness);
            return new Dimension(thickness, thickness);
        }
        
        @Override
        protected void paintComponent(final Graphics g) {
            super.paintChildren(g);
            if (FlatWindowResizer.this.window instanceof Dialog) {
                FlatWindowResizer.this.updateVisibility();
            }
        }
        
        @Override
        public void mouseClicked(final MouseEvent e) {
        }
        
        @Override
        public void mousePressed(final MouseEvent e) {
            if (FlatWindowResizer.this.window == null) {
                return;
            }
            this.dragStartMouseX = e.getXOnScreen();
            this.dragStartMouseY = e.getYOnScreen();
            this.dragStartWindowBounds = FlatWindowResizer.this.window.getBounds();
        }
        
        @Override
        public void mouseReleased(final MouseEvent e) {
            this.dragStartWindowBounds = null;
        }
        
        @Override
        public void mouseEntered(final MouseEvent e) {
        }
        
        @Override
        public void mouseExited(final MouseEvent e) {
        }
        
        @Override
        public void mouseMoved(final MouseEvent e) {
            final boolean topBottom = this.centerResizeDir == 8 || this.centerResizeDir == 9;
            final int xy = topBottom ? e.getX() : e.getY();
            final int wh = topBottom ? this.getWidth() : this.getHeight();
            final int cornerWH = UIScale.scale(FlatWindowResizer.this.cornerDragWidth - (topBottom ? 0 : FlatWindowResizer.this.borderDragThickness));
            this.setResizeDir((xy <= cornerWH) ? this.leadingResizeDir : ((xy >= wh - cornerWH) ? this.trailingResizeDir : this.centerResizeDir));
        }
        
        @Override
        public void mouseDragged(final MouseEvent e) {
            if (this.dragStartWindowBounds == null) {
                return;
            }
            if (!FlatWindowResizer.this.isWindowResizable()) {
                return;
            }
            final int mouseDeltaX = e.getXOnScreen() - this.dragStartMouseX;
            final int mouseDeltaY = e.getYOnScreen() - this.dragStartMouseY;
            int deltaX = 0;
            int deltaY = 0;
            int deltaWidth = 0;
            int deltaHeight = 0;
            if (this.resizeDir == 8 || this.resizeDir == 6 || this.resizeDir == 7) {
                deltaY = mouseDeltaY;
                deltaHeight = -mouseDeltaY;
            }
            if (this.resizeDir == 9 || this.resizeDir == 4 || this.resizeDir == 5) {
                deltaHeight = mouseDeltaY;
            }
            if (this.resizeDir == 10 || this.resizeDir == 6 || this.resizeDir == 4) {
                deltaX = mouseDeltaX;
                deltaWidth = -mouseDeltaX;
            }
            if (this.resizeDir == 11 || this.resizeDir == 7 || this.resizeDir == 5) {
                deltaWidth = mouseDeltaX;
            }
            final Rectangle rectangle;
            final Rectangle newBounds = rectangle = new Rectangle(this.dragStartWindowBounds);
            rectangle.x += deltaX;
            final Rectangle rectangle2 = newBounds;
            rectangle2.y += deltaY;
            final Rectangle rectangle3 = newBounds;
            rectangle3.width += deltaWidth;
            final Rectangle rectangle4 = newBounds;
            rectangle4.height += deltaHeight;
            final boolean honorMinimumSizeOnResize = (FlatWindowResizer.this.honorFrameMinimumSizeOnResize && FlatWindowResizer.this.window instanceof Frame) || (FlatWindowResizer.this.honorDialogMinimumSizeOnResize && FlatWindowResizer.this.window instanceof Dialog);
            Dimension minimumSize = honorMinimumSizeOnResize ? FlatWindowResizer.this.window.getMinimumSize() : null;
            if (minimumSize == null) {
                minimumSize = UIScale.scale(new Dimension(150, 50));
            }
            if (newBounds.width < minimumSize.width) {
                if (deltaX != 0) {
                    final Rectangle rectangle5 = newBounds;
                    rectangle5.x -= minimumSize.width - newBounds.width;
                }
                newBounds.width = minimumSize.width;
            }
            if (newBounds.height < minimumSize.height) {
                if (deltaY != 0) {
                    final Rectangle rectangle6 = newBounds;
                    rectangle6.y -= minimumSize.height - newBounds.height;
                }
                newBounds.height = minimumSize.height;
            }
            if (!newBounds.equals(this.dragStartWindowBounds)) {
                FlatWindowResizer.this.window.setBounds(newBounds);
                FlatWindowResizer.this.doLayout();
                if (Toolkit.getDefaultToolkit().isDynamicLayoutActive()) {
                    FlatWindowResizer.this.window.validate();
                    FlatWindowResizer.this.rootPane.repaint();
                }
            }
        }
    }
}
