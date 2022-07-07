// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.SwingUtilities;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Rectangle;
import javax.swing.Icon;
import java.awt.FontMetrics;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.plaf.basic.BasicHTML;
import java.beans.PropertyChangeEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;
import javax.swing.plaf.basic.BasicLabelUI;

public class FlatLabelUI extends BasicLabelUI
{
    private Color disabledForeground;
    private boolean defaults_initialized;
    private static ComponentUI instance;
    
    public FlatLabelUI() {
        this.defaults_initialized = false;
    }
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatLabelUI.instance == null) {
            FlatLabelUI.instance = new FlatLabelUI();
        }
        return FlatLabelUI.instance;
    }
    
    @Override
    protected void installDefaults(final JLabel c) {
        super.installDefaults(c);
        if (!this.defaults_initialized) {
            this.disabledForeground = UIManager.getColor("Label.disabledForeground");
            this.defaults_initialized = true;
        }
    }
    
    @Override
    protected void uninstallDefaults(final JLabel c) {
        super.uninstallDefaults(c);
        this.defaults_initialized = false;
    }
    
    @Override
    protected void installComponents(final JLabel c) {
        super.installComponents(c);
        updateHTMLRenderer(c, c.getText(), false);
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent e) {
        final String name = e.getPropertyName();
        if (name == "text" || name == "font" || name == "foreground") {
            final JLabel label = (JLabel)e.getSource();
            updateHTMLRenderer(label, label.getText(), true);
        }
        else {
            super.propertyChange(e);
        }
    }
    
    static void updateHTMLRenderer(final JComponent c, String text, final boolean always) {
        if (BasicHTML.isHTMLString(text) && c.getClientProperty("html.disable") != Boolean.TRUE && text.contains("<h") && (text.contains("<h1") || text.contains("<h2") || text.contains("<h3") || text.contains("<h4") || text.contains("<h5") || text.contains("<h6"))) {
            final int headIndex = text.indexOf("<head>");
            String style = "<style>BASE_SIZE " + c.getFont().getSize() + "</style>";
            if (headIndex < 0) {
                style = "<head>" + style + "</head>";
            }
            final int insertIndex = (headIndex >= 0) ? (headIndex + "<head>".length()) : "<html>".length();
            text = text.substring(0, insertIndex) + style + text.substring(insertIndex);
        }
        else if (!always) {
            return;
        }
        BasicHTML.updateRenderer(c, text);
    }
    
    static Graphics createGraphicsHTMLTextYCorrection(final Graphics g, final JComponent c) {
        return (c.getClientProperty("html") != null) ? HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g) : g;
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        super.paint(createGraphicsHTMLTextYCorrection(g, c), c);
    }
    
    @Override
    protected void paintEnabledText(final JLabel l, final Graphics g, final String s, final int textX, final int textY) {
        final int mnemIndex = FlatLaf.isShowMnemonics() ? l.getDisplayedMnemonicIndex() : -1;
        g.setColor(l.getForeground());
        FlatUIUtils.drawStringUnderlineCharAt(l, g, s, mnemIndex, textX, textY);
    }
    
    @Override
    protected void paintDisabledText(final JLabel l, final Graphics g, final String s, final int textX, final int textY) {
        final int mnemIndex = FlatLaf.isShowMnemonics() ? l.getDisplayedMnemonicIndex() : -1;
        g.setColor(this.disabledForeground);
        FlatUIUtils.drawStringUnderlineCharAt(l, g, s, mnemIndex, textX, textY);
    }
    
    @Override
    protected String layoutCL(final JLabel label, final FontMetrics fontMetrics, final String text, final Icon icon, final Rectangle viewR, final Rectangle iconR, final Rectangle textR) {
        return SwingUtilities.layoutCompoundLabel(label, fontMetrics, text, icon, label.getVerticalAlignment(), label.getHorizontalAlignment(), label.getVerticalTextPosition(), label.getHorizontalTextPosition(), viewR, iconR, textR, UIScale.scale(label.getIconTextGap()));
    }
}
