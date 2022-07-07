// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatCapsLockIcon extends FlatAbstractIcon
{
    public FlatCapsLockIcon() {
        super(16, 16, UIManager.getColor("PasswordField.capsLockIconColor"));
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        final Path2D path = new Path2D.Float(0);
        path.append(new RoundRectangle2D.Float(0.0f, 0.0f, 16.0f, 16.0f, 6.0f, 6.0f), false);
        path.append(new Rectangle2D.Float(5.0f, 12.0f, 6.0f, 2.0f), false);
        path.append(FlatUIUtils.createPath(2.0, 8.0, 8.0, 2.0, 14.0, 8.0, 11.0, 8.0, 11.0, 10.0, 5.0, 10.0, 5.0, 8.0), false);
        g.fill(path);
    }
}
