// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Component;
import javax.swing.UIManager;

public class FlatRoundBorder extends FlatBorder
{
    protected final int arc;
    
    public FlatRoundBorder() {
        this.arc = UIManager.getInt("Component.arc");
    }
    
    @Override
    protected int getArc(final Component c) {
        return FlatUIUtils.isRoundRect(c) ? 32767 : this.arc;
    }
}
