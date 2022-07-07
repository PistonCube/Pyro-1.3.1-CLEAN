// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Insets;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Graphics2D;
import javax.swing.JToolBar;
import java.awt.Graphics;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatToolBarBorder extends FlatMarginBorder
{
    private static final int DOT_COUNT = 4;
    private static final int DOT_SIZE = 2;
    private static final int GRIP_WIDTH = 6;
    protected final Color gripColor;
    
    public FlatToolBarBorder() {
        super(UIManager.getInsets("ToolBar.borderMargins"));
        this.gripColor = UIManager.getColor("ToolBar.gripColor");
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        if (c instanceof JToolBar && ((JToolBar)c).isFloatable()) {
            final Graphics2D g2 = (Graphics2D)g.create();
            try {
                FlatUIUtils.setRenderingHints(g2);
                g2.setColor(this.gripColor);
                this.paintGrip(c, g2, x, y, width, height);
            }
            finally {
                g2.dispose();
            }
        }
    }
    
    protected void paintGrip(final Component c, final Graphics g, int x, int y, final int width, final int height) {
        final int gapSize;
        final int dotSize = gapSize = UIScale.scale(2);
        final int gripSize = dotSize * 4 + gapSize * 3;
        final Insets insets = this.getBorderInsets(c);
        final boolean horizontal = ((JToolBar)c).getOrientation() == 0;
        if (horizontal) {
            if (c.getComponentOrientation().isLeftToRight()) {
                x += insets.left - dotSize * 2;
            }
            else {
                x += width - insets.right + dotSize;
            }
            y += Math.round((height - gripSize) / 2.0f);
        }
        else {
            x += Math.round((width - gripSize) / 2.0f);
            y += insets.top - dotSize * 2;
        }
        for (int i = 0; i < 4; ++i) {
            g.fillOval(x, y, dotSize, dotSize);
            if (horizontal) {
                y += dotSize + gapSize;
            }
            else {
                x += dotSize + gapSize;
            }
        }
    }
    
    @Override
    public Insets getBorderInsets(final Component c, Insets insets) {
        insets = super.getBorderInsets(c, insets);
        if (c instanceof JToolBar && ((JToolBar)c).isFloatable()) {
            final int gripInset = UIScale.scale(6);
            if (((JToolBar)c).getOrientation() == 0) {
                if (c.getComponentOrientation().isLeftToRight()) {
                    final Insets insets2 = insets;
                    insets2.left += gripInset;
                }
                else {
                    final Insets insets3 = insets;
                    insets3.right += gripInset;
                }
            }
            else {
                final Insets insets4 = insets;
                insets4.top += gripInset;
            }
        }
        return insets;
    }
}
