// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Graphics2D;
import java.awt.Component;

public class FlatInternalFrameIconifyIcon extends FlatInternalFrameAbstractIcon
{
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        this.paintBackground(c, g);
        g.setColor(c.getForeground());
        g.fillRect(this.width / 2 - 4, this.height / 2, 8, 1);
    }
}
