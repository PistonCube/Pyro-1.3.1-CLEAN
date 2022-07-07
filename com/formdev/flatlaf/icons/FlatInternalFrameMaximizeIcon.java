// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Shape;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;

public class FlatInternalFrameMaximizeIcon extends FlatInternalFrameAbstractIcon
{
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        this.paintBackground(c, g);
        g.setColor(c.getForeground());
        g.fill(FlatUIUtils.createRectangle((float)(this.width / 2 - 4), (float)(this.height / 2 - 4), 8.0f, 8.0f, 1.0f));
    }
}
