// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.Color;

public class ColorFunctions
{
    public static Color applyFunctions(final Color color, final ColorFunction... functions) {
        final float[] hsl = HSLColor.fromRGB(color);
        final float alpha = color.getAlpha() / 255.0f;
        for (final ColorFunction function : functions) {
            function.apply(hsl);
        }
        return HSLColor.toRGB(hsl, alpha);
    }
    
    public static float clamp(final float value) {
        return (value < 0.0f) ? 0.0f : ((value > 100.0f) ? 100.0f : value);
    }
    
    public static class HSLIncreaseDecrease implements ColorFunction
    {
        public final int hslIndex;
        public final boolean increase;
        public final float amount;
        public final boolean relative;
        public final boolean autoInverse;
        
        public HSLIncreaseDecrease(final int hslIndex, final boolean increase, final float amount, final boolean relative, final boolean autoInverse) {
            this.hslIndex = hslIndex;
            this.increase = increase;
            this.amount = amount;
            this.relative = relative;
            this.autoInverse = autoInverse;
        }
        
        @Override
        public void apply(final float[] hsl) {
            float amount2 = this.increase ? this.amount : (-this.amount);
            amount2 = ((this.autoInverse && this.shouldInverse(hsl)) ? (-amount2) : amount2);
            hsl[this.hslIndex] = ColorFunctions.clamp(this.relative ? (hsl[this.hslIndex] * ((100.0f + amount2) / 100.0f)) : (hsl[this.hslIndex] + amount2));
        }
        
        protected boolean shouldInverse(final float[] hsl) {
            return this.increase ? (hsl[this.hslIndex] >= 50.0f) : (hsl[this.hslIndex] < 50.0f);
        }
    }
    
    public interface ColorFunction
    {
        void apply(final float[] p0);
    }
}
