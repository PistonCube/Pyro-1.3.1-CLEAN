// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPanelUI;

public class FlatPanelUI extends BasicPanelUI
{
    private static ComponentUI instance;
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatPanelUI.instance == null) {
            FlatPanelUI.instance = new FlatPanelUI();
        }
        return FlatPanelUI.instance;
    }
}
