// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatTreeLeafIcon extends FlatAbstractIcon
{
    public FlatTreeLeafIcon() {
        super(16, 16, UIManager.getColor("Tree.icon.leafColor"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        g.fill(FlatUIUtils.createPath(8.0, 6.0, 8.0, 1.0, 13.0, 1.0, 13.0, 15.0, 3.0, 15.0, 3.0, 6.0));
        g.fill(FlatUIUtils.createPath(3.0, 5.0, 7.0, 5.0, 7.0, 1.0));
    }
}
