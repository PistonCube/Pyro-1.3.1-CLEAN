// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.geom.Path2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.BasicStroke;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatAscendingSortIcon extends FlatAbstractIcon
{
    protected final boolean chevron;
    protected final Color sortIconColor;
    
    public FlatAscendingSortIcon() {
        super(10, 5, null);
        this.chevron = "chevron".equals(UIManager.getString("Component.arrowType"));
        this.sortIconColor = UIManager.getColor("Table.sortIconColor");
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g) {
        g.setColor(this.sortIconColor);
        if (this.chevron) {
            final Path2D path = FlatUIUtils.createPath(false, 1.0, 4.0, 5.0, 0.0, 9.0, 4.0);
            g.setStroke(new BasicStroke(1.0f));
            g.draw(path);
        }
        else {
            g.fill(FlatUIUtils.createPath(0.5, 5.0, 5.0, 0.0, 9.5, 5.0));
        }
    }
}
