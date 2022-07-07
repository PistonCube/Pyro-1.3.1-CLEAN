// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatFileChooserUpFolderIcon extends FlatAbstractIcon
{
    private final Color blueColor;
    
    public FlatFileChooserUpFolderIcon() {
        super(16, 16, UIManager.getColor("Actions.Grey"));
        this.blueColor = UIManager.getColor("Actions.Blue");
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        g.fill(FlatUIUtils.createPath(2.0, 3.0, 5.5, 3.0, 7.0, 5.0, 9.0, 5.0, 9.0, 9.0, 13.0, 9.0, 13.0, 5.0, 14.0, 5.0, 14.0, 13.0, 2.0, 13.0));
        g.setColor(this.blueColor);
        g.fill(FlatUIUtils.createPath(12.0, 4.0, 12.0, 8.0, 10.0, 8.0, 10.0, 4.0, 8.0, 4.0, 11.0, 1.0, 14.0, 4.0, 12.0, 4.0));
    }
}
