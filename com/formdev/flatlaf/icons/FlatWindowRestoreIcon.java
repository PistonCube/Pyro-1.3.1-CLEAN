// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.awt.geom.Area;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;

public class FlatWindowRestoreIcon extends FlatWindowAbstractIcon
{
    @Override
    protected void paintIconAt1x(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
        final int iwh = (int)(10.0 * scaleFactor);
        final int ix = x + (width - iwh) / 2;
        final int iy = y + (height - iwh) / 2;
        final int thickness = (int)scaleFactor;
        final int rwh = (int)(8.0 * scaleFactor);
        final int ro2 = iwh - rwh;
        final Path2D r1 = FlatUIUtils.createRectangle((float)(ix + ro2), (float)iy, (float)rwh, (float)rwh, (float)thickness);
        final Path2D r2 = FlatUIUtils.createRectangle((float)ix, (float)(iy + ro2), (float)rwh, (float)rwh, (float)thickness);
        final Area area = new Area(r1);
        area.subtract(new Area(new Rectangle2D.Float((float)ix, (float)(iy + ro2), (float)rwh, (float)rwh)));
        g.fill(area);
        g.fill(r2);
    }
}
