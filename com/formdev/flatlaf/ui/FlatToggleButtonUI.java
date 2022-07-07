// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.ButtonModel;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Graphics;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JToggleButton;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;

public class FlatToggleButtonUI extends FlatButtonUI
{
    protected Color selectedBackground;
    protected Color selectedForeground;
    protected Color disabledSelectedBackground;
    protected Color toolbarSelectedBackground;
    protected int tabUnderlineHeight;
    protected Color tabUnderlineColor;
    protected Color tabDisabledUnderlineColor;
    protected Color tabSelectedBackground;
    protected Color tabHoverBackground;
    protected Color tabFocusBackground;
    private boolean defaults_initialized;
    private static ComponentUI instance;
    
    public FlatToggleButtonUI() {
        this.defaults_initialized = false;
    }
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatToggleButtonUI.instance == null) {
            FlatToggleButtonUI.instance = new FlatToggleButtonUI();
        }
        return FlatToggleButtonUI.instance;
    }
    
    @Override
    protected String getPropertyPrefix() {
        return "ToggleButton.";
    }
    
    @Override
    protected void installDefaults(final AbstractButton b) {
        super.installDefaults(b);
        if (!this.defaults_initialized) {
            this.selectedBackground = UIManager.getColor("ToggleButton.selectedBackground");
            this.selectedForeground = UIManager.getColor("ToggleButton.selectedForeground");
            this.disabledSelectedBackground = UIManager.getColor("ToggleButton.disabledSelectedBackground");
            this.toolbarSelectedBackground = UIManager.getColor("ToggleButton.toolbar.selectedBackground");
            this.tabUnderlineHeight = UIManager.getInt("ToggleButton.tab.underlineHeight");
            this.tabUnderlineColor = UIManager.getColor("ToggleButton.tab.underlineColor");
            this.tabDisabledUnderlineColor = UIManager.getColor("ToggleButton.tab.disabledUnderlineColor");
            this.tabSelectedBackground = UIManager.getColor("ToggleButton.tab.selectedBackground");
            this.tabHoverBackground = UIManager.getColor("ToggleButton.tab.hoverBackground");
            this.tabFocusBackground = UIManager.getColor("ToggleButton.tab.focusBackground");
            this.defaults_initialized = true;
        }
    }
    
    @Override
    protected void uninstallDefaults(final AbstractButton b) {
        super.uninstallDefaults(b);
        this.defaults_initialized = false;
    }
    
    @Override
    protected void propertyChange(final AbstractButton b, final PropertyChangeEvent e) {
        super.propertyChange(b, e);
        final String propertyName = e.getPropertyName();
        switch (propertyName) {
            case "JButton.buttonType": {
                if ("tab".equals(e.getOldValue()) || "tab".equals(e.getNewValue())) {
                    MigLayoutVisualPadding.uninstall(b);
                    MigLayoutVisualPadding.install(b);
                    b.revalidate();
                }
                b.repaint();
                break;
            }
            case "JToggleButton.tab.underlineHeight":
            case "JToggleButton.tab.underlineColor":
            case "JToggleButton.tab.selectedBackground": {
                b.repaint();
                break;
            }
        }
    }
    
    static boolean isTabButton(final Component c) {
        return c instanceof JToggleButton && FlatClientProperties.clientPropertyEquals((JComponent)c, "JButton.buttonType", "tab");
    }
    
    @Override
    protected void paintBackground(final Graphics g, final JComponent c) {
        if (isTabButton(c)) {
            final int height = c.getHeight();
            final int width = c.getWidth();
            final boolean selected = ((AbstractButton)c).isSelected();
            final Color background = FlatButtonUI.buttonStateColor(c, selected ? FlatClientProperties.clientPropertyColor(c, "JToggleButton.tab.selectedBackground", this.tabSelectedBackground) : null, null, this.tabFocusBackground, this.tabHoverBackground, null);
            if (background != null) {
                g.setColor(background);
                g.fillRect(0, 0, width, height);
            }
            if (selected) {
                final int underlineHeight = UIScale.scale(FlatClientProperties.clientPropertyInt(c, "JToggleButton.tab.underlineHeight", this.tabUnderlineHeight));
                g.setColor(c.isEnabled() ? FlatClientProperties.clientPropertyColor(c, "JToggleButton.tab.underlineColor", this.tabUnderlineColor) : this.tabDisabledUnderlineColor);
                g.fillRect(0, height - underlineHeight, width, underlineHeight);
            }
        }
        else {
            super.paintBackground(g, c);
        }
    }
    
    @Override
    protected Color getBackground(final JComponent c) {
        final ButtonModel model = ((AbstractButton)c).getModel();
        if (model.isSelected()) {
            final boolean toolBarButton = FlatButtonUI.isToolBarButton(c);
            return FlatButtonUI.buttonStateColor(c, toolBarButton ? this.toolbarSelectedBackground : this.selectedBackground, toolBarButton ? this.toolbarSelectedBackground : this.disabledSelectedBackground, null, null, toolBarButton ? this.toolbarPressedBackground : this.pressedBackground);
        }
        return super.getBackground(c);
    }
    
    @Override
    protected Color getForeground(final JComponent c) {
        if (c.isEnabled() && ((AbstractButton)c).isSelected() && !FlatButtonUI.isToolBarButton(c)) {
            return this.selectedForeground;
        }
        return super.getForeground(c);
    }
}
