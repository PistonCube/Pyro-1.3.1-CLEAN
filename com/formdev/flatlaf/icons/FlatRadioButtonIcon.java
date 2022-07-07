// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;

public class FlatRadioButtonIcon extends FlatCheckBoxIcon
{
    protected final int centerDiameter;
    
    public FlatRadioButtonIcon() {
        this.centerDiameter = FlatCheckBoxIcon.getUIInt("RadioButton.icon.centerDiameter", 8, this.style);
    }
    
    @Override
    protected void paintFocusBorder(final Graphics2D g2) {
        final int wh = 15 + this.focusWidth * 2;
        g2.fillOval(-this.focusWidth, -this.focusWidth, wh, wh);
    }
    
    @Override
    protected void paintBorder(final Graphics2D g2) {
        g2.fillOval(0, 0, 15, 15);
    }
    
    @Override
    protected void paintBackground(final Graphics2D g2) {
        g2.fillOval(1, 1, 13, 13);
    }
    
    @Override
    protected void paintCheckmark(final Graphics2D g2) {
        final float xy = (15 - this.centerDiameter) / 2.0f;
        g2.fill(new Ellipse2D.Float(xy, xy, (float)this.centerDiameter, (float)this.centerDiameter));
    }
}
