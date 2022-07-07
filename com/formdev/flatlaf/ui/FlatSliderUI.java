// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.geom.Path2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import java.awt.Component;
import javax.swing.JSlider;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.plaf.basic.BasicSliderUI;

public class FlatSliderUI extends BasicSliderUI
{
    private int trackWidth;
    private int thumbWidth;
    private Color trackColor;
    private Color thumbColor;
    private Color focusColor;
    private Color hoverColor;
    private Color disabledForeground;
    private MouseListener hoverListener;
    private boolean hover;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatSliderUI();
    }
    
    public FlatSliderUI() {
        super(null);
    }
    
    @Override
    protected void installListeners(final JSlider slider) {
        super.installListeners(slider);
        slider.addMouseListener(this.hoverListener = new FlatUIUtils.HoverListener(slider, h -> this.hover = h));
    }
    
    @Override
    protected void uninstallListeners(final JSlider slider) {
        super.uninstallListeners(slider);
        slider.removeMouseListener(this.hoverListener);
        this.hoverListener = null;
    }
    
    @Override
    protected void installDefaults(final JSlider slider) {
        super.installDefaults(slider);
        LookAndFeel.installProperty(slider, "opaque", false);
        this.trackWidth = UIManager.getInt("Slider.trackWidth");
        this.thumbWidth = UIManager.getInt("Slider.thumbWidth");
        this.trackColor = UIManager.getColor("Slider.trackColor");
        this.thumbColor = UIManager.getColor("Slider.thumbColor");
        this.focusColor = FlatUIUtils.getUIColor("Slider.focusedColor", "Component.focusColor");
        this.hoverColor = FlatUIUtils.getUIColor("Slider.hoverColor", this.focusColor);
        this.disabledForeground = UIManager.getColor("Slider.disabledForeground");
    }
    
    @Override
    protected void uninstallDefaults(final JSlider slider) {
        super.uninstallDefaults(slider);
        this.trackColor = null;
        this.thumbColor = null;
        this.focusColor = null;
        this.hoverColor = null;
        this.disabledForeground = null;
    }
    
    @Override
    public Dimension getPreferredHorizontalSize() {
        return UIScale.scale(super.getPreferredHorizontalSize());
    }
    
    @Override
    public Dimension getPreferredVerticalSize() {
        return UIScale.scale(super.getPreferredVerticalSize());
    }
    
    @Override
    public Dimension getMinimumHorizontalSize() {
        return UIScale.scale(super.getMinimumHorizontalSize());
    }
    
    @Override
    public Dimension getMinimumVerticalSize() {
        return UIScale.scale(super.getMinimumVerticalSize());
    }
    
    @Override
    protected int getTickLength() {
        return UIScale.scale(super.getTickLength());
    }
    
    @Override
    protected Dimension getThumbSize() {
        return new Dimension(UIScale.scale(this.thumbWidth), UIScale.scale(this.thumbWidth));
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        FlatUIUtils.setRenderingHints((Graphics2D)g);
        super.paint(g, c);
    }
    
    @Override
    public void paintFocus(final Graphics g) {
    }
    
    @Override
    public void paintTrack(final Graphics g) {
        final boolean enabled = this.slider.isEnabled();
        final float arc;
        final float tw = arc = UIScale.scale((float)this.trackWidth);
        RoundRectangle2D coloredTrack = null;
        RoundRectangle2D track;
        if (this.slider.getOrientation() == 0) {
            final float y = this.trackRect.y + (this.trackRect.height - tw) / 2.0f;
            if (enabled && this.isRoundThumb()) {
                if (this.slider.getComponentOrientation().isLeftToRight()) {
                    final int cw = this.thumbRect.x + this.thumbRect.width / 2 - this.trackRect.x;
                    coloredTrack = new RoundRectangle2D.Float((float)this.trackRect.x, y, (float)cw, tw, arc, arc);
                    track = new RoundRectangle2D.Float((float)(this.trackRect.x + cw), y, (float)(this.trackRect.width - cw), tw, arc, arc);
                }
                else {
                    final int cw = this.trackRect.x + this.trackRect.width - this.thumbRect.x - this.thumbRect.width / 2;
                    coloredTrack = new RoundRectangle2D.Float((float)(this.trackRect.x + this.trackRect.width - cw), y, (float)cw, tw, arc, arc);
                    track = new RoundRectangle2D.Float((float)this.trackRect.x, y, (float)(this.trackRect.width - cw), tw, arc, arc);
                }
            }
            else {
                track = new RoundRectangle2D.Float((float)this.trackRect.x, y, (float)this.trackRect.width, tw, arc, arc);
            }
        }
        else {
            final float x = this.trackRect.x + (this.trackRect.width - tw) / 2.0f;
            if (enabled && this.isRoundThumb()) {
                final int ch = this.thumbRect.y + this.thumbRect.height / 2 - this.trackRect.y;
                track = new RoundRectangle2D.Float(x, (float)this.trackRect.y, tw, (float)ch, arc, arc);
                coloredTrack = new RoundRectangle2D.Float(x, (float)(this.trackRect.y + ch), tw, (float)(this.trackRect.height - ch), arc, arc);
            }
            else {
                track = new RoundRectangle2D.Float(x, (float)this.trackRect.y, tw, (float)this.trackRect.height, arc, arc);
            }
        }
        if (coloredTrack != null) {
            g.setColor(FlatUIUtils.deriveColor(FlatUIUtils.isPermanentFocusOwner(this.slider) ? this.focusColor : (this.hover ? this.hoverColor : this.thumbColor), this.thumbColor));
            ((Graphics2D)g).fill(coloredTrack);
        }
        g.setColor(enabled ? this.trackColor : this.disabledForeground);
        ((Graphics2D)g).fill(track);
    }
    
    @Override
    public void paintThumb(final Graphics g) {
        g.setColor(FlatUIUtils.deriveColor(this.slider.isEnabled() ? (FlatUIUtils.isPermanentFocusOwner(this.slider) ? this.focusColor : (this.hover ? this.hoverColor : this.thumbColor)) : this.disabledForeground, this.thumbColor));
        if (this.isRoundThumb()) {
            g.fillOval(this.thumbRect.x, this.thumbRect.y, this.thumbRect.width, this.thumbRect.height);
        }
        else {
            final double w = this.thumbRect.width;
            final double h = this.thumbRect.height;
            final double wh = w / 2.0;
            final Path2D thumb = FlatUIUtils.createPath(0.0, 0.0, w, 0.0, w, h - wh, wh, h, 0.0, h - wh);
            final Graphics2D g2 = (Graphics2D)g.create();
            try {
                g2.translate(this.thumbRect.x, this.thumbRect.y);
                if (this.slider.getOrientation() == 1) {
                    if (this.slider.getComponentOrientation().isLeftToRight()) {
                        g2.translate(0, this.thumbRect.height);
                        g2.rotate(Math.toRadians(270.0));
                    }
                    else {
                        g2.translate(this.thumbRect.width, 0);
                        g2.rotate(Math.toRadians(90.0));
                    }
                }
                g2.fill(thumb);
            }
            finally {
                g2.dispose();
            }
        }
    }
    
    private boolean isRoundThumb() {
        return !this.slider.getPaintTicks() && !this.slider.getPaintLabels();
    }
}
