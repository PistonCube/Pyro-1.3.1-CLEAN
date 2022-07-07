// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Insets;
import javax.swing.border.Border;
import java.awt.Component;
import javax.swing.AbstractButton;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolBarUI;

public class FlatToolBarUI extends BasicToolBarUI
{
    public static ComponentUI createUI(final JComponent c) {
        return new FlatToolBarUI();
    }
    
    @Override
    protected ContainerListener createToolBarContListener() {
        return new ToolBarContListener() {
            @Override
            public void componentAdded(final ContainerEvent e) {
                super.componentAdded(e);
                final Component c = e.getChild();
                if (c instanceof AbstractButton) {
                    c.setFocusable(false);
                }
            }
            
            @Override
            public void componentRemoved(final ContainerEvent e) {
                super.componentRemoved(e);
                final Component c = e.getChild();
                if (c instanceof AbstractButton) {
                    c.setFocusable(true);
                }
            }
        };
    }
    
    @Override
    protected void setBorderToRollover(final Component c) {
    }
    
    @Override
    protected void setBorderToNonRollover(final Component c) {
    }
    
    @Override
    protected void setBorderToNormal(final Component c) {
    }
    
    @Override
    protected void installRolloverBorders(final JComponent c) {
    }
    
    @Override
    protected void installNonRolloverBorders(final JComponent c) {
    }
    
    @Override
    protected void installNormalBorders(final JComponent c) {
    }
    
    @Override
    protected Border createRolloverBorder() {
        return null;
    }
    
    @Override
    protected Border createNonRolloverBorder() {
        return null;
    }
    
    @Override
    public void setOrientation(final int orientation) {
        if (orientation != this.toolBar.getOrientation()) {
            final Insets margin = this.toolBar.getMargin();
            final Insets newMargin = new Insets(margin.left, margin.top, margin.right, margin.bottom);
            if (!newMargin.equals(margin)) {
                this.toolBar.setMargin(newMargin);
            }
        }
        super.setOrientation(orientation);
    }
}
