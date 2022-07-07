// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.image.RGBImageFilter;

public class GrayFilter extends RGBImageFilter
{
    private final float brightness;
    private final float contrast;
    private final int alpha;
    private final int origContrast;
    private final int origBrightness;
    
    public static GrayFilter createDisabledIconFilter(final boolean dark) {
        return dark ? new GrayFilter(-20, -70, 100) : new GrayFilter(25, -25, 100);
    }
    
    public GrayFilter(final int brightness, final int contrast, final int alpha) {
        this.origBrightness = Math.max(-100, Math.min(100, brightness));
        this.origContrast = Math.max(-100, Math.min(100, contrast));
        this.alpha = Math.max(0, Math.min(100, alpha));
        this.brightness = (float)(Math.pow(this.origBrightness, 3.0) / 10000.0);
        this.contrast = this.origContrast / 100.0f;
        this.canFilterIndexColorModel = true;
    }
    
    public GrayFilter() {
        this(0, 0, 100);
    }
    
    public int getBrightness() {
        return this.origBrightness;
    }
    
    public int getContrast() {
        return this.origContrast;
    }
    
    public int getAlpha() {
        return this.alpha;
    }
    
    @Override
    public int filterRGB(final int x, final int y, final int rgb) {
        int gray = (int)(0.3 * (rgb >> 16 & 0xFF) + 0.59 * (rgb >> 8 & 0xFF) + 0.11 * (rgb & 0xFF));
        if (this.brightness >= 0.0f) {
            gray = (int)((gray + this.brightness * 255.0f) / (1.0f + this.brightness));
        }
        else {
            gray /= (int)(1.0f - this.brightness);
        }
        if (this.contrast >= 0.0f) {
            if (gray >= 127) {
                gray += (int)((255 - gray) * this.contrast);
            }
            else {
                gray -= (int)(gray * this.contrast);
            }
        }
        else {
            gray = (int)(127.0f + (gray - 127) * (this.contrast + 1.0f));
        }
        final int a = (this.alpha != 100) ? ((rgb >> 24 & 0xFF) * this.alpha / 100 << 24) : (rgb & 0xFF000000);
        return a | gray << 16 | gray << 8 | gray;
    }
}
