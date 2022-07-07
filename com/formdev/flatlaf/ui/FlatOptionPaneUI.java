// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Insets;
import java.awt.Graphics;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicHTML;
import java.awt.GridBagConstraints;
import java.awt.Component;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import java.awt.Container;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class FlatOptionPaneUI extends BasicOptionPaneUI
{
    protected int iconMessageGap;
    protected int messagePadding;
    protected int maxCharactersPerLine;
    private int focusWidth;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatOptionPaneUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.iconMessageGap = UIManager.getInt("OptionPane.iconMessageGap");
        this.messagePadding = UIManager.getInt("OptionPane.messagePadding");
        this.maxCharactersPerLine = UIManager.getInt("OptionPane.maxCharactersPerLine");
        this.focusWidth = UIManager.getInt("Component.focusWidth");
    }
    
    @Override
    protected void installComponents() {
        super.installComponents();
        this.updateChildPanels(this.optionPane);
    }
    
    @Override
    public Dimension getMinimumOptionPaneSize() {
        return UIScale.scale(super.getMinimumOptionPaneSize());
    }
    
    @Override
    protected int getMaxCharactersPerLineCount() {
        final int max = super.getMaxCharactersPerLineCount();
        return (this.maxCharactersPerLine > 0 && max == Integer.MAX_VALUE) ? this.maxCharactersPerLine : max;
    }
    
    @Override
    protected Container createMessageArea() {
        final Container messageArea = super.createMessageArea();
        if (this.iconMessageGap > 0) {
            final Component iconMessageSeparator = this.findByName(messageArea, "OptionPane.separator");
            if (iconMessageSeparator != null) {
                iconMessageSeparator.setPreferredSize(new Dimension(UIScale.scale(this.iconMessageGap), 1));
            }
        }
        return messageArea;
    }
    
    @Override
    protected Container createButtonArea() {
        final Container buttonArea = super.createButtonArea();
        if (buttonArea.getLayout() instanceof ButtonAreaLayout) {
            final ButtonAreaLayout layout = (ButtonAreaLayout)buttonArea.getLayout();
            layout.setPadding(UIScale.scale(layout.getPadding() - this.focusWidth * 2));
        }
        return buttonArea;
    }
    
    @Override
    protected void addMessageComponents(final Container container, final GridBagConstraints cons, final Object msg, int maxll, final boolean internallyCreated) {
        if (this.messagePadding > 0) {
            cons.insets.bottom = UIScale.scale(this.messagePadding);
        }
        if (msg instanceof String && BasicHTML.isHTMLString((String)msg)) {
            maxll = Integer.MAX_VALUE;
        }
        super.addMessageComponents(container, cons, msg, maxll, internallyCreated);
    }
    
    private void updateChildPanels(final Container c) {
        for (final Component child : c.getComponents()) {
            if (child instanceof JPanel) {
                final JPanel panel = (JPanel)child;
                panel.setOpaque(false);
                final Border border = panel.getBorder();
                if (border instanceof UIResource) {
                    panel.setBorder(new NonUIResourceBorder(border));
                }
            }
            if (child instanceof Container) {
                this.updateChildPanels((Container)child);
            }
        }
    }
    
    private Component findByName(final Container c, final String name) {
        for (final Component child : c.getComponents()) {
            if (name.equals(child.getName())) {
                return child;
            }
            if (child instanceof Container) {
                final Component c2 = this.findByName((Container)child, name);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }
    
    private static class NonUIResourceBorder implements Border
    {
        private final Border delegate;
        
        NonUIResourceBorder(final Border delegate) {
            this.delegate = delegate;
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            this.delegate.paintBorder(c, g, x, y, width, height);
        }
        
        @Override
        public Insets getBorderInsets(final Component c) {
            return this.delegate.getBorderInsets(c);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return this.delegate.isBorderOpaque();
        }
    }
}
