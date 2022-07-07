// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatFileViewFloppyDriveIcon extends FlatAbstractIcon
{
    public FlatFileViewFloppyDriveIcon() {
        super(16, 16, UIManager.getColor("Objects.Grey"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        final Path2D path = new Path2D.Float(0);
        path.append(FlatUIUtils.createPath(11.0, 14.0, 11.0, 11.0, 5.0, 11.0, 5.0, 14.0, 2.0, 14.0, 2.0, 2.0, 14.0, 2.0, 14.0, 14.0, 11.0, 14.0), false);
        path.append(FlatUIUtils.createPath(4.0, 4.0, 4.0, 8.0, 12.0, 8.0, 12.0, 4.0, 4.0, 4.0), false);
        g.fill(path);
        g.fillRect(6, 12, 4, 2);
    }
}
