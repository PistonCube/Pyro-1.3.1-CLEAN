// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatFileChooserListViewIcon extends FlatAbstractIcon
{
    public FlatFileChooserListViewIcon() {
        super(16, 16, UIManager.getColor("Actions.Grey"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        g.fillRect(3, 3, 4, 4);
        g.fillRect(3, 9, 4, 4);
        g.fillRect(9, 9, 4, 4);
        g.fillRect(9, 3, 4, 4);
    }
}
