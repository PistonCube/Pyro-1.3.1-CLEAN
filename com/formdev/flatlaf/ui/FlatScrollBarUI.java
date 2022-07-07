// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.Objects;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import javax.swing.InputMap;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.UIManager;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class FlatScrollBarUI extends BasicScrollBarUI
{
    protected Insets trackInsets;
    protected Insets thumbInsets;
    protected int trackArc;
    protected int thumbArc;
    protected Color hoverTrackColor;
    protected Color hoverThumbColor;
    protected boolean hoverThumbWithTrack;
    protected Color pressedTrackColor;
    protected Color pressedThumbColor;
    protected boolean pressedThumbWithTrack;
    protected boolean showButtons;
    protected String arrowType;
    protected Color buttonArrowColor;
    protected Color buttonDisabledArrowColor;
    protected Color hoverButtonBackground;
    protected Color pressedButtonBackground;
    private MouseAdapter hoverListener;
    protected boolean hoverTrack;
    protected boolean hoverThumb;
    private static boolean isPressed;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatScrollBarUI();
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.hoverListener = new ScrollBarHoverListener();
        this.scrollbar.addMouseListener(this.hoverListener);
        this.scrollbar.addMouseMotionListener(this.hoverListener);
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.scrollbar.removeMouseListener(this.hoverListener);
        this.scrollbar.removeMouseMotionListener(this.hoverListener);
        this.hoverListener = null;
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.trackInsets = UIManager.getInsets("ScrollBar.trackInsets");
        this.thumbInsets = UIManager.getInsets("ScrollBar.thumbInsets");
        this.trackArc = UIManager.getInt("ScrollBar.trackArc");
        this.thumbArc = UIManager.getInt("ScrollBar.thumbArc");
        this.hoverTrackColor = UIManager.getColor("ScrollBar.hoverTrackColor");
        this.hoverThumbColor = UIManager.getColor("ScrollBar.hoverThumbColor");
        this.hoverThumbWithTrack = UIManager.getBoolean("ScrollBar.hoverThumbWithTrack");
        this.pressedTrackColor = UIManager.getColor("ScrollBar.pressedTrackColor");
        this.pressedThumbColor = UIManager.getColor("ScrollBar.pressedThumbColor");
        this.pressedThumbWithTrack = UIManager.getBoolean("ScrollBar.pressedThumbWithTrack");
        this.showButtons = UIManager.getBoolean("ScrollBar.showButtons");
        this.arrowType = UIManager.getString("Component.arrowType");
        this.buttonArrowColor = UIManager.getColor("ScrollBar.buttonArrowColor");
        this.buttonDisabledArrowColor = UIManager.getColor("ScrollBar.buttonDisabledArrowColor");
        this.hoverButtonBackground = UIManager.getColor("ScrollBar.hoverButtonBackground");
        this.pressedButtonBackground = UIManager.getColor("ScrollBar.pressedButtonBackground");
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.trackInsets = null;
        this.thumbInsets = null;
        this.hoverTrackColor = null;
        this.hoverThumbColor = null;
        this.pressedTrackColor = null;
        this.pressedThumbColor = null;
        this.buttonArrowColor = null;
        this.buttonDisabledArrowColor = null;
        this.hoverButtonBackground = null;
        this.pressedButtonBackground = null;
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
                        FlatScrollBarUI.this.scrollbar.revalidate();
                        FlatScrollBarUI.this.scrollbar.repaint();
                        break;
                    }
                    case "componentOrientation": {
                        InputMap inputMap = (InputMap)UIManager.get("ScrollBar.ancestorInputMap");
                        if (!FlatScrollBarUI.this.scrollbar.getComponentOrientation().isLeftToRight()) {
                            final InputMap rtlInputMap = (InputMap)UIManager.get("ScrollBar.ancestorInputMap.RightToLeft");
                            if (rtlInputMap != null) {
                                rtlInputMap.setParent(inputMap);
                                inputMap = rtlInputMap;
                            }
                        }
                        SwingUtilities.replaceUIInputMap(FlatScrollBarUI.this.scrollbar, 1, inputMap);
                        break;
                    }
                }
            }
        };
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return UIScale.scale(super.getPreferredSize(c));
    }
    
    @Override
    protected JButton createDecreaseButton(final int orientation) {
        return new FlatScrollBarButton(orientation);
    }
    
    @Override
    protected JButton createIncreaseButton(final int orientation) {
        return new FlatScrollBarButton(orientation);
    }
    
    protected boolean isShowButtons() {
        Object showButtons = this.scrollbar.getClientProperty("JScrollBar.showButtons");
        if (showButtons == null && this.scrollbar.getParent() instanceof JScrollPane) {
            showButtons = ((JScrollPane)this.scrollbar.getParent()).getClientProperty("JScrollBar.showButtons");
        }
        return (showButtons != null) ? Objects.equals(showButtons, true) : this.showButtons;
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        FlatUIUtils.setRenderingHints((Graphics2D)g);
        super.paint(g, c);
    }
    
    @Override
    protected void paintTrack(final Graphics g, final JComponent c, final Rectangle trackBounds) {
        g.setColor(this.getTrackColor(c, this.hoverTrack, FlatScrollBarUI.isPressed && this.hoverTrack && !this.hoverThumb));
        this.paintTrackOrThumb(g, c, trackBounds, this.trackInsets, this.trackArc);
    }
    
    @Override
    protected void paintThumb(final Graphics g, final JComponent c, final Rectangle thumbBounds) {
        if (thumbBounds.isEmpty() || !this.scrollbar.isEnabled()) {
            return;
        }
        g.setColor(this.getThumbColor(c, this.hoverThumb || (this.hoverThumbWithTrack && this.hoverTrack), FlatScrollBarUI.isPressed && (this.hoverThumb || (this.pressedThumbWithTrack && this.hoverTrack))));
        this.paintTrackOrThumb(g, c, thumbBounds, this.thumbInsets, this.thumbArc);
    }
    
    protected void paintTrackOrThumb(final Graphics g, final JComponent c, Rectangle bounds, Insets insets, int arc) {
        if (this.scrollbar.getOrientation() == 0) {
            insets = new Insets(insets.right, insets.top, insets.left, insets.bottom);
        }
        bounds = FlatUIUtils.subtractInsets(bounds, UIScale.scale(insets));
        if (arc <= 0) {
            g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        else {
            arc = Math.min(UIScale.scale(arc), Math.min(bounds.width, bounds.height));
            g.fillRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, arc, arc);
        }
    }
    
    @Override
    protected void paintDecreaseHighlight(final Graphics g) {
    }
    
    @Override
    protected void paintIncreaseHighlight(final Graphics g) {
    }
    
    protected Color getTrackColor(final JComponent c, final boolean hover, final boolean pressed) {
        final Color trackColor = FlatUIUtils.deriveColor(this.trackColor, c.getBackground());
        return (pressed && this.pressedTrackColor != null) ? FlatUIUtils.deriveColor(this.pressedTrackColor, trackColor) : ((hover && this.hoverTrackColor != null) ? FlatUIUtils.deriveColor(this.hoverTrackColor, trackColor) : trackColor);
    }
    
    protected Color getThumbColor(final JComponent c, final boolean hover, final boolean pressed) {
        final Color trackColor = FlatUIUtils.deriveColor(this.trackColor, c.getBackground());
        final Color thumbColor = FlatUIUtils.deriveColor(this.thumbColor, trackColor);
        return (pressed && this.pressedThumbColor != null) ? FlatUIUtils.deriveColor(this.pressedThumbColor, thumbColor) : ((hover && this.hoverThumbColor != null) ? FlatUIUtils.deriveColor(this.hoverThumbColor, thumbColor) : thumbColor);
    }
    
    @Override
    protected Dimension getMinimumThumbSize() {
        return UIScale.scale(super.getMinimumThumbSize());
    }
    
    @Override
    protected Dimension getMaximumThumbSize() {
        return UIScale.scale(super.getMaximumThumbSize());
    }
    
    private class ScrollBarHoverListener extends MouseAdapter
    {
        @Override
        public void mouseExited(final MouseEvent e) {
            if (!FlatScrollBarUI.isPressed) {
                final FlatScrollBarUI this$0 = FlatScrollBarUI.this;
                final FlatScrollBarUI this$2 = FlatScrollBarUI.this;
                final boolean b = false;
                this$2.hoverThumb = b;
                this$0.hoverTrack = b;
                this.repaint();
            }
        }
        
        @Override
        public void mouseMoved(final MouseEvent e) {
            if (!FlatScrollBarUI.isPressed) {
                this.update(e.getX(), e.getY());
            }
        }
        
        @Override
        public void mousePressed(final MouseEvent e) {
            FlatScrollBarUI.isPressed = true;
            this.repaint();
        }
        
        @Override
        public void mouseReleased(final MouseEvent e) {
            FlatScrollBarUI.isPressed = false;
            this.repaint();
            this.update(e.getX(), e.getY());
        }
        
        private void update(final int x, final int y) {
            final boolean inTrack = BasicScrollBarUI.this.getTrackBounds().contains(x, y);
            final boolean inThumb = BasicScrollBarUI.this.getThumbBounds().contains(x, y);
            if (inTrack != FlatScrollBarUI.this.hoverTrack || inThumb != FlatScrollBarUI.this.hoverThumb) {
                FlatScrollBarUI.this.hoverTrack = inTrack;
                FlatScrollBarUI.this.hoverThumb = inThumb;
                this.repaint();
            }
        }
        
        private void repaint() {
            if (FlatScrollBarUI.this.scrollbar.isEnabled()) {
                FlatScrollBarUI.this.scrollbar.repaint();
            }
        }
    }
    
    protected class FlatScrollBarButton extends FlatArrowButton
    {
        protected FlatScrollBarButton(final FlatScrollBarUI this$0, final int direction) {
            this(this$0, direction, this$0.arrowType, this$0.buttonArrowColor, this$0.buttonDisabledArrowColor, null, this$0.hoverButtonBackground, this$0.pressedButtonBackground);
        }
        
        protected FlatScrollBarButton(final int direction, final String type, final Color foreground, final Color disabledForeground, final Color hoverForeground, final Color hoverBackground, final Color pressedBackground) {
            super(direction, type, foreground, disabledForeground, hoverForeground, hoverBackground, pressedBackground);
            this.setArrowWidth(6);
            this.setFocusable(false);
            this.setRequestFocusEnabled(false);
        }
        
        @Override
        protected Color deriveBackground(final Color background) {
            return FlatUIUtils.deriveColor(background, FlatScrollBarUI.this.scrollbar.getBackground());
        }
        
        @Override
        public Dimension getPreferredSize() {
            if (FlatScrollBarUI.this.isShowButtons()) {
                final int w = UIScale.scale(FlatScrollBarUI.this.scrollBarWidth);
                return new Dimension(w, w);
            }
            return new Dimension();
        }
        
        @Override
        public Dimension getMinimumSize() {
            return FlatScrollBarUI.this.isShowButtons() ? super.getMinimumSize() : new Dimension();
        }
        
        @Override
        public Dimension getMaximumSize() {
            return FlatScrollBarUI.this.isShowButtons() ? super.getMaximumSize() : new Dimension();
        }
    }
}
