// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.geom.Path2D;
import java.awt.Shape;
import java.awt.Container;
import java.awt.Stroke;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicArrowButton;

public class FlatArrowButton extends BasicArrowButton implements UIResource
{
    public static final int DEFAULT_ARROW_WIDTH = 8;
    private final boolean chevron;
    private final Color foreground;
    private final Color disabledForeground;
    private final Color hoverForeground;
    private final Color hoverBackground;
    private final Color pressedBackground;
    private int arrowWidth;
    private int xOffset;
    private int yOffset;
    private boolean hover;
    private boolean pressed;
    
    public FlatArrowButton(final int direction, final String type, final Color foreground, final Color disabledForeground, final Color hoverForeground, final Color hoverBackground) {
        this(direction, type, foreground, disabledForeground, hoverForeground, hoverBackground, null);
    }
    
    public FlatArrowButton(final int direction, final String type, final Color foreground, final Color disabledForeground, final Color hoverForeground, final Color hoverBackground, final Color pressedBackground) {
        super(direction, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE);
        this.arrowWidth = 8;
        this.xOffset = 0;
        this.yOffset = 0;
        this.chevron = "chevron".equals(type);
        this.foreground = foreground;
        this.disabledForeground = disabledForeground;
        this.hoverForeground = hoverForeground;
        this.hoverBackground = hoverBackground;
        this.pressedBackground = pressedBackground;
        this.setOpaque(false);
        this.setBorder(null);
        if (hoverForeground != null || hoverBackground != null || pressedBackground != null) {
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(final MouseEvent e) {
                    FlatArrowButton.this.hover = true;
                    FlatArrowButton.this.repaint();
                }
                
                @Override
                public void mouseExited(final MouseEvent e) {
                    FlatArrowButton.this.hover = false;
                    FlatArrowButton.this.repaint();
                }
                
                @Override
                public void mousePressed(final MouseEvent e) {
                    FlatArrowButton.this.pressed = true;
                    FlatArrowButton.this.repaint();
                }
                
                @Override
                public void mouseReleased(final MouseEvent e) {
                    FlatArrowButton.this.pressed = false;
                    FlatArrowButton.this.repaint();
                }
            });
        }
    }
    
    public int getArrowWidth() {
        return this.arrowWidth;
    }
    
    public void setArrowWidth(final int arrowWidth) {
        this.arrowWidth = arrowWidth;
    }
    
    protected boolean isHover() {
        return this.hover;
    }
    
    protected boolean isPressed() {
        return this.pressed;
    }
    
    public int getXOffset() {
        return this.xOffset;
    }
    
    public void setXOffset(final int xOffset) {
        this.xOffset = xOffset;
    }
    
    public int getYOffset() {
        return this.yOffset;
    }
    
    public void setYOffset(final int yOffset) {
        this.yOffset = yOffset;
    }
    
    protected Color deriveBackground(final Color background) {
        return background;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return UIScale.scale(super.getPreferredSize());
    }
    
    @Override
    public Dimension getMinimumSize() {
        return UIScale.scale(super.getMinimumSize());
    }
    
    @Override
    public void paint(final Graphics g) {
        final Graphics2D g2 = (Graphics2D)g;
        FlatUIUtils.setRenderingHints(g2);
        final int width = this.getWidth();
        final int height = this.getHeight();
        final boolean enabled = this.isEnabled();
        if (enabled) {
            final Color background = (this.pressedBackground != null && this.isPressed()) ? this.deriveBackground(this.pressedBackground) : ((this.hoverBackground != null && this.isHover()) ? this.deriveBackground(this.hoverBackground) : null);
            if (background != null) {
                g.setColor(background);
                g.fillRect(0, 0, width, height);
            }
        }
        final int direction = this.getDirection();
        final boolean vert = direction == 1 || direction == 5;
        final int w = UIScale.scale(this.arrowWidth + (this.chevron ? 0 : 1));
        final int h = UIScale.scale(this.arrowWidth / 2 + (this.chevron ? 0 : 1));
        int rw = vert ? w : h;
        int rh = vert ? h : w;
        if (this.chevron) {
            ++rw;
            ++rh;
        }
        int x = Math.round((width - rw) / 2.0f + UIScale.scale((float)this.xOffset));
        final int y = Math.round((height - rh) / 2.0f + UIScale.scale((float)this.yOffset));
        final Container parent = this.getParent();
        if (vert && parent instanceof JComponent && FlatUIUtils.hasRoundBorder((JComponent)parent)) {
            x -= UIScale.scale(parent.getComponentOrientation().isLeftToRight() ? 1 : -1);
        }
        g.setColor(enabled ? ((this.isHover() && this.hoverForeground != null) ? this.hoverForeground : this.foreground) : this.disabledForeground);
        g.translate(x, y);
        final Shape arrowShape = createArrowShape(direction, this.chevron, (float)w, (float)h);
        if (this.chevron) {
            g2.setStroke(new BasicStroke(UIScale.scale(1.0f)));
            g2.draw(arrowShape);
        }
        else {
            g2.fill(arrowShape);
        }
        g.translate(-x, -y);
    }
    
    public static Shape createArrowShape(final int direction, final boolean chevron, final float w, final float h) {
        switch (direction) {
            case 1: {
                return FlatUIUtils.createPath(!chevron, 0.0, h, w / 2.0f, 0.0, w, h);
            }
            case 5: {
                return FlatUIUtils.createPath(!chevron, 0.0, 0.0, w / 2.0f, h, w, 0.0);
            }
            case 7: {
                return FlatUIUtils.createPath(!chevron, h, 0.0, 0.0, w / 2.0f, h, w);
            }
            case 3: {
                return FlatUIUtils.createPath(!chevron, 0.0, 0.0, h, w / 2.0f, 0.0, w);
            }
            default: {
                return new Path2D.Float();
            }
        }
    }
}
