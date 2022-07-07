// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JMenuBar;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatMenuBarBorder extends FlatMarginBorder
{
    private final Color borderColor;
    
    public FlatMenuBarBorder() {
        this.borderColor = UIManager.getColor("MenuBar.borderColor");
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            final float lineHeight = UIScale.scale(1.0f);
            FlatUIUtils.setRenderingHints(g2);
            g2.setColor(this.borderColor);
            g2.fill(new Rectangle2D.Float((float)x, y + height - lineHeight, (float)width, lineHeight));
        }
        finally {
            g2.dispose();
        }
    }
    
    @Override
    public Insets getBorderInsets(final Component c, final Insets insets) {
        final Insets margin = (c instanceof JMenuBar) ? ((JMenuBar)c).getMargin() : new Insets(0, 0, 0, 0);
        insets.top = UIScale.scale(margin.top);
        insets.left = UIScale.scale(margin.left);
        insets.bottom = UIScale.scale(margin.bottom + 1);
        insets.right = UIScale.scale(margin.right);
        return insets;
    }
}
