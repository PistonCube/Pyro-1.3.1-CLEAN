// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.plaf.UIResource;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import javax.swing.text.JTextComponent;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicEditorPaneUI;

public class FlatEditorPaneUI extends BasicEditorPaneUI
{
    protected int minimumWidth;
    protected boolean isIntelliJTheme;
    private Object oldHonorDisplayProperties;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatEditorPaneUI();
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
        propertyChange(this.getComponent(), e);
    }
    
    static void propertyChange(final JTextComponent c, final PropertyChangeEvent e) {
        final String propertyName = e.getPropertyName();
        switch (propertyName) {
            case "JComponent.minimumWidth": {
                c.revalidate();
                break;
            }
        }
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return applyMinimumWidth(c, super.getPreferredSize(c), this.minimumWidth);
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return applyMinimumWidth(c, super.getMinimumSize(c), this.minimumWidth);
    }
    
    static Dimension applyMinimumWidth(final JComponent c, final Dimension size, int minimumWidth) {
        minimumWidth = FlatUIUtils.minimumWidth(c, minimumWidth);
        size.width = Math.max(size.width, UIScale.scale(minimumWidth) - UIScale.scale(1) * 2);
        return size;
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
