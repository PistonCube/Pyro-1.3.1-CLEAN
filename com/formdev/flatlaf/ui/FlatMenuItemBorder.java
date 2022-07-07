// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import com.formdev.flatlaf.util.UIScale;
import javax.swing.JMenuBar;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Insets;

public class FlatMenuItemBorder extends FlatMarginBorder
{
    private final Insets menuBarItemMargins;
    
    public FlatMenuItemBorder() {
        this.menuBarItemMargins = UIManager.getInsets("MenuBar.itemMargins");
    }
    
    @Override
    public Insets getBorderInsets(final Component c, final Insets insets) {
        if (c.getParent() instanceof JMenuBar) {
            insets.top = UIScale.scale(this.menuBarItemMargins.top);
            insets.left = UIScale.scale(this.menuBarItemMargins.left);
            insets.bottom = UIScale.scale(this.menuBarItemMargins.bottom);
            insets.right = UIScale.scale(this.menuBarItemMargins.right);
            return insets;
        }
        return super.getBorderInsets(c, insets);
    }
}
