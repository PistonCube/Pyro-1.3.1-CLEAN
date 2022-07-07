// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Path2D;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;

public class FlatOptionPaneQuestionIcon extends FlatOptionPaneAbstractIcon
{
    public FlatOptionPaneQuestionIcon() {
        super("OptionPane.icon.questionColor", "Actions.Blue");
    }
    
    @Override
    protected Shape createOutside() {
        return new Ellipse2D.Float(2.0f, 2.0f, 28.0f, 28.0f);
    }
    
    @Override
    protected Shape createInside() {
        final Path2D q = new Path2D.Float();
        q.moveTo(14.0, 20.0);
        q.lineTo(18.0, 20.0);
        q.curveTo(18.0, 16.0, 23.0, 16.0, 23.0, 12.0);
        q.curveTo(23.0, 8.0, 20.0, 6.0, 16.0, 6.0);
        q.curveTo(12.0, 6.0, 9.0, 8.0, 9.0, 12.0);
        q.curveTo(9.0, 12.0, 13.0, 12.0, 13.0, 12.0);
        q.curveTo(13.0, 10.0, 14.0, 9.0, 16.0, 9.0);
        q.curveTo(18.0, 9.0, 19.0, 10.0, 19.0, 12.0);
        q.curveTo(19.0, 15.0, 14.0, 15.0, 14.0, 20.0);
        q.closePath();
        final Path2D inside = new Path2D.Float(0);
        inside.append(new Rectangle2D.Float(14.0f, 22.0f, 4.0f, 4.0f), false);
        inside.append(q, false);
        return inside;
    }
}
