// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import java.awt.Color;
import javax.swing.UIManager;

public class FlatTreeCollapsedIcon extends FlatAbstractIcon
{
    private final boolean chevron;
    
    public FlatTreeCollapsedIcon() {
        this(UIManager.getColor("Tree.icon.collapsedColor"));
    }
    
    FlatTreeCollapsedIcon(final Color color) {
        super(11, 11, color);
        this.chevron = "chevron".equals(UIManager.getString("Component.arrowType"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        this.rotate(c, g);
        if (this.chevron) {
            g.fill(FlatUIUtils.createPath(3.0, 1.0, 3.0, 2.5, 6.0, 5.5, 3.0, 8.5, 3.0, 10.0, 4.5, 10.0, 9.0, 5.5, 4.5, 1.0));
        }
        else {
            g.fill(FlatUIUtils.createPath(2.0, 1.0, 2.0, 10.0, 10.0, 5.5));
        }
    }
    
    void rotate(final Component c, final Graphics2D g) {
        if (!c.getComponentOrientation().isLeftToRight()) {
            g.rotate(Math.toRadians(180.0), this.width / 2.0, this.height / 2.0);
        }
    }
}
