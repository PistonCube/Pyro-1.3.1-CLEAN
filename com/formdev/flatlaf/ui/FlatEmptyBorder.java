// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Component;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Insets;
import javax.swing.plaf.BorderUIResource;

public class FlatEmptyBorder extends BorderUIResource.EmptyBorderUIResource
{
    public FlatEmptyBorder() {
        super(0, 0, 0, 0);
    }
    
    public FlatEmptyBorder(final int top, final int left, final int bottom, final int right) {
        super(top, left, bottom, right);
    }
    
    public FlatEmptyBorder(final Insets insets) {
        super(insets);
    }
    
    @Override
    public Insets getBorderInsets() {
        return new Insets(UIScale.scale(this.top), UIScale.scale(this.left), UIScale.scale(this.bottom), UIScale.scale(this.right));
    }
    
    @Override
    public Insets getBorderInsets(final Component c, final Insets insets) {
        final boolean leftToRight = this.left == this.right || c.getComponentOrientation().isLeftToRight();
        insets.left = UIScale.scale(leftToRight ? this.left : this.right);
        insets.top = UIScale.scale(this.top);
        insets.right = UIScale.scale(leftToRight ? this.right : this.left);
        insets.bottom = UIScale.scale(this.bottom);
        return insets;
    }
}
