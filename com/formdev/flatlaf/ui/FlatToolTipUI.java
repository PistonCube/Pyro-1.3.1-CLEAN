// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.List;
import java.awt.Insets;
import java.awt.FontMetrics;
import javax.swing.SwingUtilities;
import com.formdev.flatlaf.util.StringUtils;
import java.awt.Dimension;
import javax.swing.JToolTip;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.basic.BasicToolTipUI;

public class FlatToolTipUI extends BasicToolTipUI
{
    private static PropertyChangeListener sharedPropertyChangedListener;
    private static ComponentUI instance;
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatToolTipUI.instance == null) {
            FlatToolTipUI.instance = new FlatToolTipUI();
        }
        return FlatToolTipUI.instance;
    }
    
    @Override
    public void installUI(final JComponent c) {
        super.installUI(c);
        FlatLabelUI.updateHTMLRenderer(c, ((JToolTip)c).getTipText(), false);
    }
    
    @Override
    protected void installListeners(final JComponent c) {
        super.installListeners(c);
        if (FlatToolTipUI.sharedPropertyChangedListener == null) {
            final String name;
            JToolTip toolTip;
            FlatToolTipUI.sharedPropertyChangedListener = (e -> {
                name = e.getPropertyName();
                if (name == "text" || name == "font" || name == "foreground") {
                    toolTip = (JToolTip)e.getSource();
                    FlatLabelUI.updateHTMLRenderer(toolTip, toolTip.getTipText(), false);
                }
                return;
            });
        }
        c.addPropertyChangeListener(FlatToolTipUI.sharedPropertyChangedListener);
    }
    
    @Override
    protected void uninstallListeners(final JComponent c) {
        super.uninstallListeners(c);
        c.removePropertyChangeListener(FlatToolTipUI.sharedPropertyChangedListener);
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        if (this.isMultiLine(c)) {
            final FontMetrics fm = c.getFontMetrics(c.getFont());
            final Insets insets = c.getInsets();
            final List<String> lines = StringUtils.split(((JToolTip)c).getTipText(), '\n');
            int width = 0;
            final int height = fm.getHeight() * Math.max(lines.size(), 1);
            for (final String line : lines) {
                width = Math.max(width, SwingUtilities.computeStringWidth(fm, line));
            }
            return new Dimension(insets.left + width + insets.right + 6, insets.top + height + insets.bottom);
        }
        return super.getPreferredSize(c);
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        if (this.isMultiLine(c)) {
            final FontMetrics fm = c.getFontMetrics(c.getFont());
            final Insets insets = c.getInsets();
            FlatUIUtils.setRenderingHints((Graphics2D)g);
            g.setColor(c.getForeground());
            final List<String> lines = StringUtils.split(((JToolTip)c).getTipText(), '\n');
            final int x = insets.left + 3;
            final int x2 = c.getWidth() - insets.right - 3;
            int y = insets.top - fm.getDescent();
            final int lineHeight = fm.getHeight();
            final JComponent comp = ((JToolTip)c).getComponent();
            final boolean leftToRight = ((comp != null) ? comp : c).getComponentOrientation().isLeftToRight();
            for (final String line : lines) {
                y += lineHeight;
                FlatUIUtils.drawString(c, g, line, leftToRight ? x : (x2 - SwingUtilities.computeStringWidth(fm, line)), y);
            }
        }
        else {
            super.paint(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g), c);
        }
    }
    
    private boolean isMultiLine(final JComponent c) {
        final String text = ((JToolTip)c).getTipText();
        return c.getClientProperty("html") == null && text != null && text.indexOf(10) >= 0;
    }
}
