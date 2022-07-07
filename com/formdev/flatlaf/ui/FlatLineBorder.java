// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import com.formdev.flatlaf.util.UIScale;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Color;

public class FlatLineBorder extends FlatEmptyBorder
{
    private final Color lineColor;
    private final float lineThickness;
    
    public FlatLineBorder(final Insets insets, final Color lineColor) {
        this(insets, lineColor, 1.0f);
    }
    
    public FlatLineBorder(final Insets insets, final Color lineColor, final float lineThickness) {
        super(insets);
        this.lineColor = lineColor;
        this.lineThickness = lineThickness;
    }
    
    public Color getLineColor() {
        return this.lineColor;
    }
    
    public float getLineThickness() {
        return this.lineThickness;
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            g2.setColor(this.lineColor);
            FlatUIUtils.paintComponentBorder(g2, x, y, width, height, 0.0f, UIScale.scale(this.lineThickness), 0.0f);
        }
        finally {
            g2.dispose();
        }
    }
}
