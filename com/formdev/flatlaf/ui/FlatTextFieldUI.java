// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import com.formdev.flatlaf.util.UIScale;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Insets;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.plaf.UIResource;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.text.JTextComponent;
import java.beans.PropertyChangeEvent;
import javax.swing.text.Caret;
import java.awt.Component;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.event.FocusListener;
import java.awt.Color;
import javax.swing.plaf.basic.BasicTextFieldUI;

public class FlatTextFieldUI extends BasicTextFieldUI
{
    protected int minimumWidth;
    protected boolean isIntelliJTheme;
    protected Color placeholderForeground;
    private FocusListener focusListener;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTextFieldUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        final String prefix = this.getPropertyPrefix();
        this.minimumWidth = UIManager.getInt("Component.minimumWidth");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.placeholderForeground = UIManager.getColor(prefix + ".placeholderForeground");
        LookAndFeel.installProperty(this.getComponent(), "opaque", false);
        MigLayoutVisualPadding.install(this.getComponent());
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.placeholderForeground = null;
        MigLayoutVisualPadding.uninstall(this.getComponent());
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.focusListener = new FlatUIUtils.RepaintFocusListener(this.getComponent());
        this.getComponent().addFocusListener(this.focusListener);
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.getComponent().removeFocusListener(this.focusListener);
        this.focusListener = null;
    }
    
    @Override
    protected Caret createCaret() {
        return new FlatCaret(UIManager.getString("TextComponent.selectAllOnFocusPolicy"));
    }
    
    @Override
    protected void propertyChange(final PropertyChangeEvent e) {
        super.propertyChange(e);
        propertyChange(this.getComponent(), e);
    }
    
    static void propertyChange(final JTextComponent c, final PropertyChangeEvent e) {
        final String propertyName = e.getPropertyName();
        switch (propertyName) {
            case "JTextField.placeholderText":
            case "JComponent.roundRect": {
                c.repaint();
                break;
            }
            case "JComponent.minimumWidth": {
                c.revalidate();
                break;
            }
        }
    }
    
    @Override
    protected void paintSafely(final Graphics g) {
        paintBackground(g, this.getComponent(), this.isIntelliJTheme);
        paintPlaceholder(g, this.getComponent(), this.placeholderForeground);
        super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
    }
    
    @Override
    protected void paintBackground(final Graphics g) {
    }
    
    static void paintBackground(final Graphics g, final JTextComponent c, final boolean isIntelliJTheme) {
        if (!c.isOpaque() && FlatUIUtils.getOutsideFlatBorder(c) == null && FlatUIUtils.hasOpaqueBeenExplicitlySet(c)) {
            return;
        }
        final float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
        final float arc = FlatUIUtils.getBorderArc(c);
        if (c.isOpaque() && (focusWidth > 0.0f || arc > 0.0f)) {
            FlatUIUtils.paintParentBackground(g, c);
        }
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            final Color background = c.getBackground();
            g2.setColor((background instanceof UIResource) ? ((isIntelliJTheme && (!c.isEnabled() || !c.isEditable())) ? FlatUIUtils.getParentBackground(c) : background) : background);
            FlatUIUtils.paintComponentBackground(g2, 0, 0, c.getWidth(), c.getHeight(), focusWidth, arc);
        }
        finally {
            g2.dispose();
        }
    }
    
    static void paintPlaceholder(final Graphics g, final JTextComponent c, final Color placeholderForeground) {
        if (c.getDocument().getLength() > 0) {
            return;
        }
        final Container parent = c.getParent();
        final JComponent jc = (parent instanceof JComboBox) ? ((JComboBox)parent) : c;
        final Object placeholder = jc.getClientProperty("JTextField.placeholderText");
        if (!(placeholder instanceof String)) {
            return;
        }
        final Insets insets = c.getInsets();
        final FontMetrics fm = c.getFontMetrics(c.getFont());
        final int x = insets.left;
        final int y = insets.top + fm.getAscent() + (c.getHeight() - insets.top - insets.bottom - fm.getHeight()) / 2;
        g.setColor(placeholderForeground);
        FlatUIUtils.drawString(c, g, (String)placeholder, x, y);
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
        if (c instanceof JTextField && ((JTextField)c).getColumns() > 0) {
            return size;
        }
        final Container parent = c.getParent();
        if (parent instanceof JComboBox || parent instanceof JSpinner || (parent != null && parent.getParent() instanceof JSpinner)) {
            return size;
        }
        minimumWidth = FlatUIUtils.minimumWidth(c, minimumWidth);
        final float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
        size.width = Math.max(size.width, UIScale.scale(minimumWidth) + Math.round(focusWidth * 2.0f));
        return size;
    }
}
