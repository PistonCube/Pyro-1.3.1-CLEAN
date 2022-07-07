// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatTreeExpandedIcon extends FlatTreeCollapsedIcon
{
    public FlatTreeExpandedIcon() {
        super(UIManager.getColor("Tree.icon.expandedColor"));
    }
    
    @Override
    void rotate(final Component c, final Graphics2D g) {
        g.rotate(Math.toRadians(90.0), this.width / 2.0, this.height / 2.0);
    }
}
