// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import com.formdev.flatlaf.util.UIScale;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;
import javax.swing.plaf.UIResource;
import javax.swing.Icon;

public abstract class FlatAbstractIcon implements Icon, UIResource
{
    protected final int width;
    protected final int height;
    protected final Color color;
    
    public FlatAbstractIcon(final int width, final int height, final Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    @Override
    public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            g2.translate(x, y);
            UIScale.scaleGraphics(g2);
            if (this.color != null) {
                g2.setColor(this.color);
            }
            this.paintIcon(c, g2);
        }
        finally {
            g2.dispose();
        }
    }
    
    protected abstract void paintIcon(final Component p0, final Graphics2D p1);
    
    @Override
    public int getIconWidth() {
        return UIScale.scale(this.width);
    }
    
    @Override
    public int getIconHeight() {
        return UIScale.scale(this.height);
    }
}
