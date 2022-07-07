// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.text.JTextComponent;
import javax.swing.plaf.UIResource;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.plaf.basic.BasicTextAreaUI;

public class FlatTextAreaUI extends BasicTextAreaUI
{
    protected int minimumWidth;
    protected boolean isIntelliJTheme;
    protected Color disabledBackground;
    protected Color inactiveBackground;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTextAreaUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.minimumWidth = UIManager.getInt("Component.minimumWidth");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.disabledBackground = UIManager.getColor("TextArea.disabledBackground");
        this.inactiveBackground = UIManager.getColor("TextArea.inactiveBackground");
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.disabledBackground = null;
        this.inactiveBackground = null;
    }
    
    @Override
    protected void propertyChange(final PropertyChangeEvent e) {
        super.propertyChange(e);
        FlatEditorPaneUI.propertyChange(this.getComponent(), e);
    }
    
    @Override
    protected void paintSafely(final Graphics g) {
        super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
    }
    
    @Override
    protected void paintBackground(final Graphics g) {
        final JTextComponent c = this.getComponent();
        final Color background = c.getBackground();
        g.setColor((background instanceof UIResource) ? ((this.isIntelliJTheme && (!c.isEnabled() || !c.isEditable())) ? FlatUIUtils.getParentBackground(c) : (c.isEnabled() ? (c.isEditable() ? background : this.inactiveBackground) : this.disabledBackground)) : background);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return this.applyMinimumWidth(c, super.getPreferredSize(c));
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return this.applyMinimumWidth(c, super.getMinimumSize(c));
    }
    
    private Dimension applyMinimumWidth(final JComponent c, final Dimension size) {
        if (c instanceof JTextArea && ((JTextArea)c).getColumns() > 0) {
            return size;
        }
        return FlatEditorPaneUI.applyMinimumWidth(c, size, this.minimumWidth);
    }
}
