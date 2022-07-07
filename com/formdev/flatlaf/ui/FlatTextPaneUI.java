// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.text.JTextComponent;
import javax.swing.plaf.UIResource;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextPaneUI;

public class FlatTextPaneUI extends BasicTextPaneUI
{
    protected int minimumWidth;
    protected boolean isIntelliJTheme;
    private Object oldHonorDisplayProperties;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTextPaneUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.minimumWidth = UIManager.getInt("Component.minimumWidth");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.oldHonorDisplayProperties = this.getComponent().getClientProperty("JEditorPane.honorDisplayProperties");
        this.getComponent().putClientProperty("JEditorPane.honorDisplayProperties", true);
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.getComponent().putClientProperty("JEditorPane.honorDisplayProperties", this.oldHonorDisplayProperties);
    }
    
    @Override
    protected void propertyChange(final PropertyChangeEvent e) {
        super.propertyChange(e);
        FlatEditorPaneUI.propertyChange(this.getComponent(), e);
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return FlatEditorPaneUI.applyMinimumWidth(c, super.getPreferredSize(c), this.minimumWidth);
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return FlatEditorPaneUI.applyMinimumWidth(c, super.getMinimumSize(c), this.minimumWidth);
    }
    
    @Override
    protected void paintSafely(final Graphics g) {
        super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
    }
    
    @Override
    protected void paintBackground(final Graphics g) {
        final JTextComponent c = this.getComponent();
        if (this.isIntelliJTheme && (!c.isEnabled() || !c.isEditable()) && c.getBackground() instanceof UIResource) {
            FlatUIUtils.paintParentBackground(g, c);
            return;
        }
        super.paintBackground(g);
    }
}
