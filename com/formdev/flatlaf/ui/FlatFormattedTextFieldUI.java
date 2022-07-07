// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;

public class FlatFormattedTextFieldUI extends FlatTextFieldUI
{
    public static ComponentUI createUI(final JComponent c) {
        return new FlatFormattedTextFieldUI();
    }
    
    @Override
    protected String getPropertyPrefix() {
        return "FormattedTextField";
    }
}
