// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import com.formdev.flatlaf.ui.FlatButtonUI;
import java.awt.Component;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatWindowCloseIcon extends FlatWindowAbstractIcon
{
    private final Color hoverForeground;
    private final Color pressedForeground;
    
    public FlatWindowCloseIcon() {
        super(UIManager.getDimension("TitlePane.buttonSize"), UIManager.getColor("TitlePane.closeHoverBackground"), UIManager.getColor("TitlePane.closePressedBackground"));
        this.hoverForeground = UIManager.getColor("TitlePane.closeHoverForeground");
        this.pressedForeground = UIManager.getColor("TitlePane.closePressedForeground");
    }
    
    @Override
    protected void paintIconAt1x(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
        final int iwh = (int)(10.0 * scaleFactor);
        final int ix = x + (width - iwh) / 2;
        final int iy = y + (height - iwh) / 2;
        final int ix2 = ix + iwh - 1;
        final int iy2 = iy + iwh - 1;
        final int thickness = (int)scaleFactor;
        final Path2D path = new Path2D.Float(0);
        path.append(new Line2D.Float((float)ix, (float)iy, (float)ix2, (float)iy2), false);
        path.append(new Line2D.Float((float)ix, (float)iy2, (float)ix2, (float)iy), false);
        g.setStroke(new BasicStroke((float)thickness));
        g.draw(path);
    }
    
    @Override
    protected Color getForeground(final Component c) {
        return FlatButtonUI.buttonStateColor(c, c.getForeground(), null, null, this.hoverForeground, this.pressedForeground);
    }
}
