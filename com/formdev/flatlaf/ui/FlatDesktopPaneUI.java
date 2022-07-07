// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JInternalFrame;
import javax.swing.plaf.UIResource;
import javax.swing.DefaultDesktopManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicDesktopPaneUI;

public class FlatDesktopPaneUI extends BasicDesktopPaneUI
{
    public static ComponentUI createUI(final JComponent c) {
        return new FlatDesktopPaneUI();
    }
    
    @Override
    protected void installDesktopManager() {
        this.desktopManager = this.desktop.getDesktopManager();
        if (this.desktopManager == null) {
            this.desktopManager = new FlatDesktopManager();
            this.desktop.setDesktopManager(this.desktopManager);
        }
    }
    
    private class FlatDesktopManager extends DefaultDesktopManager implements UIResource
    {
        @Override
        public void iconifyFrame(final JInternalFrame f) {
            super.iconifyFrame(f);
            ((FlatDesktopIconUI)f.getDesktopIcon().getUI()).updateDockIcon();
        }
    }
}
