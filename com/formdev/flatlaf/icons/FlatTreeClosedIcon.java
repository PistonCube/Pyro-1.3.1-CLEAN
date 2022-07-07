// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatTreeClosedIcon extends FlatAbstractIcon
{
    public FlatTreeClosedIcon() {
        super(16, 16, UIManager.getColor("Tree.icon.closedColor"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        g.fill(FlatUIUtils.createPath(1.0, 2.0, 6.0, 2.0, 8.0, 4.0, 15.0, 4.0, 15.0, 13.0, 1.0, 13.0));
    }
}
