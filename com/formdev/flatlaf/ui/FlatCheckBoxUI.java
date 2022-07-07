// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class FlatCheckBoxUI extends FlatRadioButtonUI
{
    private static ComponentUI instance;
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatCheckBoxUI.instance == null) {
            FlatCheckBoxUI.instance = new FlatCheckBoxUI();
        }
        return FlatCheckBoxUI.instance;
    }
    
    public String getPropertyPrefix() {
        return "CheckBox.";
    }
}
