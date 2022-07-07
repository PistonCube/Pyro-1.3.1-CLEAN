// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Path2D;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;

public class FlatOptionPaneErrorIcon extends FlatOptionPaneAbstractIcon
{
    public FlatOptionPaneErrorIcon() {
        super("OptionPane.icon.errorColor", "Actions.Red");
    }
    
    @Override
    protected Shape createOutside() {
        return new Ellipse2D.Float(2.0f, 2.0f, 28.0f, 28.0f);
    }
    
    @Override
    protected Shape createInside() {
        final Path2D inside = new Path2D.Float(0);
        inside.append(new Rectangle2D.Float(14.0f, 7.0f, 4.0f, 11.0f), false);
        inside.append(new Rectangle2D.Float(14.0f, 21.0f, 4.0f, 4.0f), false);
        return inside;
    }
}
