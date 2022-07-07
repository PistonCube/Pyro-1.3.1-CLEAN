// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JViewport;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicViewportUI;

public class FlatViewportUI extends BasicViewportUI
{
    private static ComponentUI instance;
    
    public static ComponentUI createUI(final JComponent c) {
        if (FlatViewportUI.instance == null) {
            FlatViewportUI.instance = new FlatViewportUI();
        }
        return FlatViewportUI.instance;
    }
    
    @Override
    public void update(final Graphics g, final JComponent c) {
        final Component view = ((JViewport)c).getView();
        if (c.isOpaque() && view instanceof JTable) {
            g.setColor(view.getBackground());
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
            this.paint(g, c);
        }
        else {
            super.update(g, c);
        }
    }
}
