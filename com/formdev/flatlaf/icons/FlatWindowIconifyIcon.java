// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.Graphics2D;

public class FlatWindowIconifyIcon extends FlatWindowAbstractIcon
{
    @Override
    protected void paintIconAt1x(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
        final int iw = (int)(10.0 * scaleFactor);
        final int ih = (int)scaleFactor;
        final int ix = x + (width - iw) / 2;
        final int iy = y + (height - ih) / 2;
        g.fillRect(ix, iy, iw, ih);
    }
}
