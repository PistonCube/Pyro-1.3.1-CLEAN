// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.font.GlyphVector;
import java.text.AttributedCharacterIterator;
import java.awt.Graphics;
import com.formdev.flatlaf.FlatSystemProperties;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import javax.swing.JComponent;
import java.awt.Graphics2D;

public class HiDPIUtils
{
    private static Boolean useTextYCorrection;
    
    public static void paintAtScale1x(final Graphics2D g, final JComponent c, final Painter painter) {
        paintAtScale1x(g, 0, 0, c.getWidth(), c.getHeight(), painter);
    }
    
    public static void paintAtScale1x(final Graphics2D g, final int x, final int y, final int width, final int height, final Painter painter) {
        final AffineTransform transform = g.getTransform();
        if (transform.getScaleX() == 1.0 && transform.getScaleY() == 1.0) {
            painter.paint(g, x, y, width, height, 1.0);
            return;
        }
        final Rectangle2D.Double scaledRect = scale(transform, x, y, width, height);
        try {
            g.setTransform(new AffineTransform(1.0, 0.0, 0.0, 1.0, Math.floor(scaledRect.x), Math.floor(scaledRect.y)));
            final int swidth = (int)scaledRect.width;
            final int sheight = (int)scaledRect.height;
            painter.paint(g, 0, 0, swidth, sheight, transform.getScaleX());
        }
        finally {
            g.setTransform(transform);
        }
    }
    
    private static Rectangle2D.Double scale(final AffineTransform transform, final int x, final int y, final int width, final int height) {
        double dx1 = transform.getScaleX();
        double dy2 = transform.getScaleY();
        final double px = x * dx1 + transform.getTranslateX();
        final double py = y * dy2 + transform.getTranslateY();
        dx1 *= width;
        dy2 *= height;
        final double newx = normalize(px);
        final double newy = normalize(py);
        dx1 = normalize(px + dx1) - newx;
        dy2 = normalize(py + dy2) - newy;
        return new Rectangle2D.Double(newx, newy, dx1, dy2);
    }
    
    private static double normalize(final double value) {
        return Math.floor(value + 0.25) + 0.25;
    }
    
    private static boolean useTextYCorrection() {
        if (HiDPIUtils.useTextYCorrection == null) {
            HiDPIUtils.useTextYCorrection = FlatSystemProperties.getBoolean("flatlaf.useTextYCorrection", true);
        }
        return HiDPIUtils.useTextYCorrection;
    }
    
    public static float computeTextYCorrection(final Graphics2D g) {
        if (!useTextYCorrection() || !SystemInfo.IS_WINDOWS) {
            return 0.0f;
        }
        if (!SystemInfo.IS_JAVA_9_OR_LATER) {
            return (UIScale.getUserScaleFactor() > 1.0f) ? (-UIScale.scale(0.625f)) : 0.0f;
        }
        final AffineTransform t = g.getTransform();
        final double scaleY = t.getScaleY();
        if (scaleY < 1.25) {
            return 0.0f;
        }
        if (scaleY <= 1.25) {
            return -0.875f;
        }
        if (scaleY <= 1.5) {
            return -0.625f;
        }
        if (scaleY <= 1.75) {
            return -0.875f;
        }
        if (scaleY <= 2.0) {
            return -0.75f;
        }
        if (scaleY <= 2.25) {
            return -0.875f;
        }
        if (scaleY <= 3.5) {
            return -0.75f;
        }
        return -0.875f;
    }
    
    public static void drawStringWithYCorrection(final JComponent c, final Graphics2D g, final String text, final int x, final int y) {
        drawStringUnderlineCharAtWithYCorrection(c, g, text, -1, x, y);
    }
    
    public static void drawStringUnderlineCharAtWithYCorrection(final JComponent c, final Graphics2D g, final String text, final int underlinedIndex, final int x, final int y) {
        final float yCorrection = computeTextYCorrection(g);
        if (yCorrection != 0.0f) {
            g.translate(0.0, yCorrection);
            JavaCompatibility.drawStringUnderlineCharAt(c, g, text, underlinedIndex, x, y);
            g.translate(0.0, -yCorrection);
        }
        else {
            JavaCompatibility.drawStringUnderlineCharAt(c, g, text, underlinedIndex, x, y);
        }
    }
    
    public static Graphics2D createGraphicsTextYCorrection(final Graphics2D g) {
        final float yCorrection = computeTextYCorrection(g);
        if (yCorrection == 0.0f) {
            return g;
        }
        return new Graphics2DProxy(g) {
            @Override
            public void drawString(final String str, final int x, final int y) {
                super.drawString(str, (float)x, y + yCorrection);
            }
            
            @Override
            public void drawString(final String str, final float x, final float y) {
                super.drawString(str, x, y + yCorrection);
            }
            
            @Override
            public void drawString(final AttributedCharacterIterator iterator, final int x, final int y) {
                super.drawString(iterator, (float)x, y + yCorrection);
            }
            
            @Override
            public void drawString(final AttributedCharacterIterator iterator, final float x, final float y) {
                super.drawString(iterator, x, y + yCorrection);
            }
            
            @Override
            public void drawChars(final char[] data, final int offset, final int length, final int x, final int y) {
                super.drawChars(data, offset, length, x, Math.round(y + yCorrection));
            }
            
            @Override
            public void drawBytes(final byte[] data, final int offset, final int length, final int x, final int y) {
                super.drawBytes(data, offset, length, x, Math.round(y + yCorrection));
            }
            
            @Override
            public void drawGlyphVector(final GlyphVector g, final float x, final float y) {
                super.drawGlyphVector(g, x, y + yCorrection);
            }
        };
    }
    
    public interface Painter
    {
        void paint(final Graphics2D p0, final int p1, final int p2, final int p3, final int p4, final double p5);
    }
}
