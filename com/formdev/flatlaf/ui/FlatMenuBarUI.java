// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JMenu;
import java.awt.Component;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.MenuElement;
import com.formdev.flatlaf.util.SystemInfo;
import javax.swing.MenuSelectionManager;
import javax.swing.JMenuBar;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Action;
import javax.swing.plaf.ActionMapUIResource;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class FlatMenuBarUI extends BasicMenuBarUI
{
    public static ComponentUI createUI(final JComponent c) {
        return new FlatMenuBarUI();
    }
    
    @Override
    protected void installKeyboardActions() {
        super.installKeyboardActions();
        ActionMap map = SwingUtilities.getUIActionMap(this.menuBar);
        if (map == null) {
            map = new ActionMapUIResource();
            SwingUtilities.replaceUIActionMap(this.menuBar, map);
        }
        map.put("takeFocus", new TakeFocus());
    }
    
    private static class TakeFocus extends AbstractAction
    {
        @Override
        public void actionPerformed(final ActionEvent e) {
            final JMenuBar menuBar = (JMenuBar)e.getSource();
            final JMenu menu = menuBar.getMenu(0);
            if (menu != null) {
                MenuSelectionManager.defaultManager().setSelectedPath(SystemInfo.IS_WINDOWS ? new MenuElement[] { menuBar, menu } : new MenuElement[] { menuBar, menu, menu.getPopupMenu() });
                FlatLaf.showMnemonics(menuBar);
            }
        }
    }
}
