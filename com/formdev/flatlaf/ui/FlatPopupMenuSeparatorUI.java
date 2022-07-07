// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class FlatPopupMenuSeparatorUI extends FlatSeparatorUI
{
    private static ComponentUI instance;
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatPopupMenuSeparatorUI.instance == null) {
            FlatPopupMenuSeparatorUI.instance = new FlatPopupMenuSeparatorUI();
        }
        return FlatPopupMenuSeparatorUI.instance;
    }
    
    @Override
    protected String getPropertyPrefix() {
        return "PopupMenuSeparator";
    }
}
