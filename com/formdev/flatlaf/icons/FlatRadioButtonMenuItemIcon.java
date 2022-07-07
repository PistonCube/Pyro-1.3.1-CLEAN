// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Graphics2D;

public class FlatRadioButtonMenuItemIcon extends FlatCheckBoxMenuItemIcon
{
    @Override
    protected void paintCheckmark(final Graphics2D g2) {
        g2.fillOval(4, 4, 7, 7);
    }
}
