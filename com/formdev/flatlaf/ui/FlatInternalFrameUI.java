// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Shape;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LookAndFeel;
import javax.swing.JInternalFrame;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class FlatInternalFrameUI extends BasicInternalFrameUI
{
    public static ComponentUI createUI(final JComponent c) {
        return new FlatInternalFrameUI((JInternalFrame)c);
    }
    
    public FlatInternalFrameUI(final JInternalFrame b) {
        super(b);
    }
    
    @Override
    public void installUI(final JComponent c) {
        super.installUI(c);
        LookAndFeel.installProperty(this.frame, "opaque", false);
    }
    
    @Override
    protected JComponent createNorthPane(final JInternalFrame w) {
        return new FlatInternalFrameTitlePane(w);
    }
    
    public static class FlatInternalFrameBorder extends FlatEmptyBorder
    {
        private final Color activeBorderColor;
        private final Color inactiveBorderColor;
        private final int borderLineWidth;
        private final boolean dropShadowPainted;
        private final FlatDropShadowBorder activeDropShadowBorder;
        private final FlatDropShadowBorder inactiveDropShadowBorder;
        
        public FlatInternalFrameBorder() {
            super(UIManager.getInsets("InternalFrame.borderMargins"));
            this.activeBorderColor = UIManager.getColor("InternalFrame.activeBorderColor");
            this.inactiveBorderColor = UIManager.getColor("InternalFrame.inactiveBorderColor");
            this.borderLineWidth = FlatUIUtils.getUIInt("InternalFrame.borderLineWidth", 1);
            this.dropShadowPainted = UIManager.getBoolean("InternalFrame.dropShadowPainted");
            this.activeDropShadowBorder = new FlatDropShadowBorder(UIManager.getColor("InternalFrame.activeDropShadowColor"), UIManager.getInsets("InternalFrame.activeDropShadowInsets"), FlatUIUtils.getUIFloat("InternalFrame.activeDropShadowOpacity", 0.5f));
            this.inactiveDropShadowBorder = new FlatDropShadowBorder(UIManager.getColor("InternalFrame.inactiveDropShadowColor"), UIManager.getInsets("InternalFrame.inactiveDropShadowInsets"), FlatUIUtils.getUIFloat("InternalFrame.inactiveDropShadowOpacity", 0.5f));
        }
        
        @Override
        public Insets getBorderInsets(final Component c, final Insets insets) {
            if (c instanceof JInternalFrame && ((JInternalFrame)c).isMaximum()) {
                insets.left = UIScale.scale(Math.min(this.borderLineWidth, this.left));
                insets.top = UIScale.scale(Math.min(this.borderLineWidth, this.top));
                insets.right = UIScale.scale(Math.min(this.borderLineWidth, this.right));
                insets.bottom = UIScale.scale(Math.min(this.borderLineWidth, this.bottom));
                return insets;
            }
            return super.getBorderInsets(c, insets);
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            final JInternalFrame f = (JInternalFrame)c;
            final Insets insets = this.getBorderInsets(c);
            final float lineWidth = UIScale.scale((float)this.borderLineWidth);
            final float rx = x + insets.left - lineWidth;
            final float ry = y + insets.top - lineWidth;
            final float rwidth = width - insets.left - insets.right + lineWidth * 2.0f;
            final float rheight = height - insets.top - insets.bottom + lineWidth * 2.0f;
            final Graphics2D g2 = (Graphics2D)g.create();
            try {
                FlatUIUtils.setRenderingHints(g2);
                g2.setColor(f.isSelected() ? this.activeBorderColor : this.inactiveBorderColor);
                if (this.dropShadowPainted) {
                    final FlatDropShadowBorder dropShadowBorder = f.isSelected() ? this.activeDropShadowBorder : this.inactiveDropShadowBorder;
                    final Insets dropShadowInsets = dropShadowBorder.getBorderInsets();
                    dropShadowBorder.paintBorder(c, g2, (int)rx - dropShadowInsets.left, (int)ry - dropShadowInsets.top, (int)rwidth + dropShadowInsets.left + dropShadowInsets.right, (int)rheight + dropShadowInsets.top + dropShadowInsets.bottom);
                }
                g2.fill(FlatUIUtils.createRectangle(rx, ry, rwidth, rheight, lineWidth));
            }
            finally {
                g2.dispose();
            }
        }
    }
}
