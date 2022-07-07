// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.Color;

public class HSLColor
{
    private final Color rgb;
    private final float[] hsl;
    private final float alpha;
    
    public HSLColor(final Color rgb) {
        this.rgb = rgb;
        this.hsl = fromRGB(rgb);
        this.alpha = rgb.getAlpha() / 255.0f;
    }
    
    public HSLColor(final float h, final float s, final float l) {
        this(h, s, l, 1.0f);
    }
    
    public HSLColor(final float h, final float s, final float l, final float alpha) {
        this.hsl = new float[] { h, s, l };
        this.alpha = alpha;
        this.rgb = toRGB(this.hsl, alpha);
    }
    
    public HSLColor(final float[] hsl) {
        this(hsl, 1.0f);
    }
    
    public HSLColor(final float[] hsl, final float alpha) {
        this.hsl = hsl;
        this.alpha = alpha;
        this.rgb = toRGB(hsl, alpha);
    }
    
    public Color adjustHue(final float degrees) {
        return toRGB(degrees, this.hsl[1], this.hsl[2], this.alpha);
    }
    
    public Color adjustLuminance(final float percent) {
        return toRGB(this.hsl[0], this.hsl[1], percent, this.alpha);
    }
    
    public Color adjustSaturation(final float percent) {
        return toRGB(this.hsl[0], percent, this.hsl[2], this.alpha);
    }
    
    public Color adjustShade(final float percent) {
        final float multiplier = (100.0f - percent) / 100.0f;
        final float l = Math.max(0.0f, this.hsl[2] * multiplier);
        return toRGB(this.hsl[0], this.hsl[1], l, this.alpha);
    }
    
    public Color adjustTone(final float percent) {
        final float multiplier = (100.0f + percent) / 100.0f;
        final float l = Math.min(100.0f, this.hsl[2] * multiplier);
        return toRGB(this.hsl[0], this.hsl[1], l, this.alpha);
    }
    
    public float getAlpha() {
        return this.alpha;
    }
    
    public Color getComplementary() {
        final float hue = (this.hsl[0] + 180.0f) % 360.0f;
        return toRGB(hue, this.hsl[1], this.hsl[2]);
    }
    
    public float getHue() {
        return this.hsl[0];
    }
    
    public float[] getHSL() {
        return this.hsl;
    }
    
    public float getLuminance() {
        return this.hsl[2];
    }
    
    public Color getRGB() {
        return this.rgb;
    }
    
    public float getSaturation() {
        return this.hsl[1];
    }
    
    @Override
    public String toString() {
        final String toString = "HSLColor[h=" + this.hsl[0] + ",s=" + this.hsl[1] + ",l=" + this.hsl[2] + ",alpha=" + this.alpha + "]";
        return toString;
    }
    
    public static float[] fromRGB(final Color color) {
        final float[] rgb = color.getRGBColorComponents(null);
        final float r = rgb[0];
        final float g = rgb[1];
        final float b = rgb[2];
        final float min = Math.min(r, Math.min(g, b));
        final float max = Math.max(r, Math.max(g, b));
        float h = 0.0f;
        if (max == min) {
            h = 0.0f;
        }
        else if (max == r) {
            h = (60.0f * (g - b) / (max - min) + 360.0f) % 360.0f;
        }
        else if (max == g) {
            h = 60.0f * (b - r) / (max - min) + 120.0f;
        }
        else if (max == b) {
            h = 60.0f * (r - g) / (max - min) + 240.0f;
        }
        final float l = (max + min) / 2.0f;
        float s = 0.0f;
        if (max == min) {
            s = 0.0f;
        }
        else if (l <= 0.5f) {
            s = (max - min) / (max + min);
        }
        else {
            s = (max - min) / (2.0f - max - min);
        }
        return new float[] { h, s * 100.0f, l * 100.0f };
    }
    
    public static Color toRGB(final float[] hsl) {
        return toRGB(hsl, 1.0f);
    }
    
    public static Color toRGB(final float[] hsl, final float alpha) {
        return toRGB(hsl[0], hsl[1], hsl[2], alpha);
    }
    
    public static Color toRGB(final float h, final float s, final float l) {
        return toRGB(h, s, l, 1.0f);
    }
    
    public static Color toRGB(float h, float s, float l, final float alpha) {
        if (s < 0.0f || s > 100.0f) {
            final String message = "Color parameter outside of expected range - Saturation";
            throw new IllegalArgumentException(message);
        }
        if (l < 0.0f || l > 100.0f) {
            final String message = "Color parameter outside of expected range - Luminance";
            throw new IllegalArgumentException(message);
        }
        if (alpha < 0.0f || alpha > 1.0f) {
            final String message = "Color parameter outside of expected range - Alpha";
            throw new IllegalArgumentException(message);
        }
        h %= 360.0f;
        h /= 360.0f;
        s /= 100.0f;
        l /= 100.0f;
        float q = 0.0f;
        if (l < 0.5) {
            q = l * (1.0f + s);
        }
        else {
            q = l + s - s * l;
        }
        final float p = 2.0f * l - q;
        float r = Math.max(0.0f, HueToRGB(p, q, h + 0.33333334f));
        float g = Math.max(0.0f, HueToRGB(p, q, h));
        float b = Math.max(0.0f, HueToRGB(p, q, h - 0.33333334f));
        r = Math.min(r, 1.0f);
        g = Math.min(g, 1.0f);
        b = Math.min(b, 1.0f);
        return new Color(r, g, b, alpha);
    }
    
    private static float HueToRGB(final float p, final float q, float h) {
        if (h < 0.0f) {
            ++h;
        }
        if (h > 1.0f) {
            --h;
        }
        if (6.0f * h < 1.0f) {
            return p + (q - p) * 6.0f * h;
        }
        if (2.0f * h < 1.0f) {
            return q;
        }
        if (3.0f * h < 2.0f) {
            return p + (q - p) * 6.0f * (0.6666667f - h);
        }
        return p;
    }
}
