// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import com.formdev.flatlaf.icons.FlatCheckBoxIcon;
import java.awt.Rectangle;
import javax.swing.plaf.UIResource;
import java.awt.Graphics;
import java.awt.Dimension;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import java.awt.Insets;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;
import javax.swing.plaf.basic.BasicRadioButtonUI;

public class FlatRadioButtonUI extends BasicRadioButtonUI
{
    protected int iconTextGap;
    protected Color disabledText;
    private boolean defaults_initialized;
    private static ComponentUI instance;
    private static Insets tempInsets;
    
    public FlatRadioButtonUI() {
        this.defaults_initialized = false;
    }
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatRadioButtonUI.instance == null) {
            FlatRadioButtonUI.instance = new FlatRadioButtonUI();
        }
        return FlatRadioButtonUI.instance;
    }
    
    public void installDefaults(final AbstractButton b) {
        super.installDefaults(b);
        if (!this.defaults_initialized) {
            final String prefix = this.getPropertyPrefix();
            this.iconTextGap = FlatUIUtils.getUIInt(prefix + "iconTextGap", 4);
            this.disabledText = UIManager.getColor(prefix + "disabledText");
            this.defaults_initialized = true;
        }
        LookAndFeel.installProperty(b, "opaque", false);
        LookAndFeel.installProperty(b, "iconTextGap", UIScale.scale(this.iconTextGap));
        MigLayoutVisualPadding.install(b, null);
    }
    
    @Override
    protected void uninstallDefaults(final AbstractButton b) {
        super.uninstallDefaults(b);
        MigLayoutVisualPadding.uninstall(b);
        this.defaults_initialized = false;
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        final Dimension size = super.getPreferredSize(c);
        if (size == null) {
            return null;
        }
        final int focusWidth = this.getIconFocusWidth(c);
        if (focusWidth > 0) {
            final Insets insets = c.getInsets(FlatRadioButtonUI.tempInsets);
            final Dimension dimension = size;
            dimension.width += Math.max(focusWidth - insets.left, 0) + Math.max(focusWidth - insets.right, 0);
            final Dimension dimension2 = size;
            dimension2.height += Math.max(focusWidth - insets.top, 0) + Math.max(focusWidth - insets.bottom, 0);
        }
        return size;
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        if (!c.isOpaque() && ((AbstractButton)c).isContentAreaFilled() && !(c.getBackground() instanceof UIResource)) {
            g.setColor(c.getBackground());
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }
        final int focusWidth = this.getIconFocusWidth(c);
        if (focusWidth > 0) {
            final boolean ltr = c.getComponentOrientation().isLeftToRight();
            final Insets insets = c.getInsets(FlatRadioButtonUI.tempInsets);
            final int leftOrRightInset = ltr ? insets.left : insets.right;
            if (focusWidth > leftOrRightInset) {
                int offset = focusWidth - leftOrRightInset;
                if (!ltr) {
                    offset = -offset;
                }
                g.translate(offset, 0);
                super.paint(g, c);
                g.translate(-offset, 0);
                return;
            }
        }
        super.paint(FlatLabelUI.createGraphicsHTMLTextYCorrection(g, c), c);
    }
    
    @Override
    protected void paintText(final Graphics g, final AbstractButton b, final Rectangle textRect, final String text) {
        FlatButtonUI.paintText(g, b, textRect, text, b.isEnabled() ? b.getForeground() : this.disabledText);
    }
    
    private int getIconFocusWidth(final JComponent c) {
        final AbstractButton b = (AbstractButton)c;
        return (b.getIcon() == null && this.getDefaultIcon() instanceof FlatCheckBoxIcon) ? UIScale.scale(((FlatCheckBoxIcon)this.getDefaultIcon()).focusWidth) : 0;
    }
    
    static {
        FlatRadioButtonUI.tempInsets = new Insets(0, 0, 0, 0);
    }
}
