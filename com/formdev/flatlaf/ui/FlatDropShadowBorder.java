// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import com.formdev.flatlaf.util.UIScale;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Color;

public class FlatDropShadowBorder extends FlatEmptyBorder
{
    private final Color shadowColor;
    private final Insets shadowInsets;
    private final float shadowOpacity;
    private final int shadowSize;
    private Image shadowImage;
    private Color lastShadowColor;
    private double lastSystemScaleFactor;
    private float lastUserScaleFactor;
    
    public FlatDropShadowBorder() {
        this((Color)null);
    }
    
    public FlatDropShadowBorder(final Color shadowColor) {
        this(shadowColor, 4, 0.5f);
    }
    
    public FlatDropShadowBorder(final Color shadowColor, final int shadowSize, final float shadowOpacity) {
        this(shadowColor, new Insets(-shadowSize, -shadowSize, shadowSize, shadowSize), shadowOpacity);
    }
    
    public FlatDropShadowBorder(final Color shadowColor, final Insets shadowInsets, final float shadowOpacity) {
        super(Math.max(shadowInsets.top, 0), Math.max(shadowInsets.left, 0), Math.max(shadowInsets.bottom, 0), Math.max(shadowInsets.right, 0));
        this.shadowColor = shadowColor;
        this.shadowInsets = shadowInsets;
        this.shadowOpacity = shadowOpacity;
        this.shadowSize = Math.max(Math.max(shadowInsets.left, shadowInsets.right), Math.max(shadowInsets.top, shadowInsets.bottom));
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        if (this.shadowSize <= 0) {
            return;
        }
        HiDPIUtils.paintAtScale1x((Graphics2D)g, x, y, width, height, this::paintImpl);
    }
    
    private void paintImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
        final Color shadowColor = (this.shadowColor != null) ? this.shadowColor : g.getColor();
        final int shadowSize = this.scale(this.shadowSize, scaleFactor);
        final float userScaleFactor = UIScale.getUserScaleFactor();
        if (this.shadowImage == null || !shadowColor.equals(this.lastShadowColor) || this.lastSystemScaleFactor != scaleFactor || this.lastUserScaleFactor != userScaleFactor) {
            this.shadowImage = createShadowImage(shadowColor, shadowSize, this.shadowOpacity, (float)(scaleFactor * userScaleFactor));
            this.lastShadowColor = shadowColor;
            this.lastSystemScaleFactor = scaleFactor;
            this.lastUserScaleFactor = userScaleFactor;
        }
        final int left = this.scale(this.shadowInsets.left, scaleFactor);
        final int right = this.scale(this.shadowInsets.right, scaleFactor);
        final int top = this.scale(this.shadowInsets.top, scaleFactor);
        final int bottom = this.scale(this.shadowInsets.bottom, scaleFactor);
        final int x1o = x - Math.min(left, 0);
        final int y1o = y - Math.min(top, 0);
        final int x2o = x + width + Math.min(right, 0);
        final int y2o = y + height + Math.min(bottom, 0);
        final int x1i = x1o + shadowSize;
        final int y1i = y1o + shadowSize;
        final int x2i = x2o - shadowSize;
        final int y2i = y2o - shadowSize;
        final int wh = shadowSize * 2 - 1;
        final int center = shadowSize - 1;
        if (left > 0 || top > 0) {
            g.drawImage(this.shadowImage, x1o, y1o, x1i, y1i, 0, 0, center, center, null);
        }
        if (top > 0) {
            g.drawImage(this.shadowImage, x1i, y1o, x2i, y1i, center, 0, center + 1, center, null);
        }
        if (right > 0 || top > 0) {
            g.drawImage(this.shadowImage, x2i, y1o, x2o, y1i, center, 0, wh, center, null);
        }
        if (left > 0) {
            g.drawImage(this.shadowImage, x1o, y1i, x1i, y2i, 0, center, center, center + 1, null);
        }
        if (right > 0) {
            g.drawImage(this.shadowImage, x2i, y1i, x2o, y2i, center, center, wh, center + 1, null);
        }
        if (left > 0 || bottom > 0) {
            g.drawImage(this.shadowImage, x1o, y2i, x1i, y2o, 0, center, center, wh, null);
        }
        if (bottom > 0) {
            g.drawImage(this.shadowImage, x1i, y2i, x2i, y2o, center, center, center + 1, wh, null);
        }
        if (right > 0 || bottom > 0) {
            g.drawImage(this.shadowImage, x2i, y2i, x2o, y2o, center, center, wh, wh, null);
        }
    }
    
    private int scale(final int value, final double scaleFactor) {
        return (int)Math.ceil(UIScale.scale(value) * scaleFactor);
    }
    
    private static BufferedImage createShadowImage(final Color shadowColor, final int shadowSize, final float shadowOpacity, final float scaleFactor) {
        final int shadowRGB = shadowColor.getRGB() & 0xFFFFFF;
        final int shadowAlpha = (int)(255.0f * shadowOpacity);
        final Color startColor = new Color(shadowRGB | (shadowAlpha & 0xFF) << 24, true);
        final Color midColor = new Color(shadowRGB | (shadowAlpha / 2 & 0xFF) << 24, true);
        final Color endColor = new Color(shadowRGB, true);
        final int wh = shadowSize * 2 - 1;
        final int center = shadowSize - 1;
        final RadialGradientPaint p = new RadialGradientPaint((float)center, (float)center, shadowSize - 0.75f * scaleFactor, new float[] { 0.0f, 0.35f, 1.0f }, new Color[] { startColor, midColor, endColor });
        final BufferedImage image = new BufferedImage(wh, wh, 2);
        final Graphics2D g = image.createGraphics();
        try {
            g.setPaint(p);
            g.fillRect(0, 0, wh, wh);
        }
        finally {
            g.dispose();
        }
        return image;
    }
}
