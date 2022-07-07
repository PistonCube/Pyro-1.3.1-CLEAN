// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.ButtonModel;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JMenu;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.plaf.basic.BasicMenuUI;

public class FlatMenuUI extends BasicMenuUI
{
    private Color hoverBackground;
    private FlatMenuItemRenderer renderer;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatMenuUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installProperty(this.menuItem, "iconTextGap", FlatUIUtils.getUIInt("MenuItem.iconTextGap", 4));
        this.menuItem.setRolloverEnabled(true);
        this.hoverBackground = UIManager.getColor("MenuBar.hoverBackground");
        this.renderer = this.createRenderer();
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.hoverBackground = null;
        this.renderer = null;
    }
    
    protected FlatMenuItemRenderer createRenderer() {
        return new FlatMenuRenderer(this.menuItem, this.checkIcon, this.arrowIcon, this.acceleratorFont, this.acceleratorDelimiter);
    }
    
    @Override
    protected MouseInputListener createMouseInputListener(final JComponent c) {
        return new MouseInputHandler() {
            @Override
            public void mouseEntered(final MouseEvent e) {
                super.mouseEntered(e);
                this.rollover(e, true);
            }
            
            @Override
            public void mouseExited(final MouseEvent e) {
                super.mouseExited(e);
                this.rollover(e, false);
            }
            
            private void rollover(final MouseEvent e, final boolean rollover) {
                final JMenu menu = (JMenu)e.getSource();
                if (menu.isTopLevelMenu() && menu.isRolloverEnabled()) {
                    menu.getModel().setRollover(rollover);
                    menu.repaint();
                }
            }
        };
    }
    
    @Override
    protected Dimension getPreferredMenuItemSize(final JComponent c, final Icon checkIcon, final Icon arrowIcon, final int defaultTextIconGap) {
        return this.renderer.getPreferredMenuItemSize();
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        this.renderer.paintMenuItem(g, this.selectionBackground, this.selectionForeground, this.disabledForeground, this.acceleratorForeground, this.acceleratorSelectionForeground);
    }
    
    protected class FlatMenuRenderer extends FlatMenuItemRenderer
    {
        protected FlatMenuRenderer(final JMenuItem menuItem, final Icon checkIcon, final Icon arrowIcon, final Font acceleratorFont, final String acceleratorDelimiter) {
            super(menuItem, checkIcon, arrowIcon, acceleratorFont, acceleratorDelimiter);
        }
        
        @Override
        protected void paintBackground(final Graphics g, final Color selectionBackground) {
            final ButtonModel model = this.menuItem.getModel();
            if (model.isRollover() && !model.isArmed() && !model.isSelected() && model.isEnabled() && ((JMenu)this.menuItem).isTopLevelMenu()) {
                g.setColor(this.deriveBackground(FlatMenuUI.this.hoverBackground));
                g.fillRect(0, 0, this.menuItem.getWidth(), this.menuItem.getHeight());
            }
            else {
                super.paintBackground(g, selectionBackground);
            }
        }
    }
}
