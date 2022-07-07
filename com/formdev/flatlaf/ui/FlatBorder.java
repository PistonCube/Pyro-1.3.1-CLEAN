// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import java.awt.KeyboardFocusManager;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.text.JTextComponent;
import java.awt.Paint;
import com.formdev.flatlaf.util.DerivedColor;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.plaf.basic.BasicBorders;

public class FlatBorder extends BasicBorders.MarginBorder
{
    protected final int focusWidth;
    protected final float innerFocusWidth;
    protected final float innerOutlineWidth;
    protected final Color focusColor;
    protected final Color borderColor;
    protected final Color disabledBorderColor;
    protected final Color focusedBorderColor;
    protected final Color errorBorderColor;
    protected final Color errorFocusedBorderColor;
    protected final Color warningBorderColor;
    protected final Color warningFocusedBorderColor;
    protected final Color customBorderColor;
    
    public FlatBorder() {
        this.focusWidth = UIManager.getInt("Component.focusWidth");
        this.innerFocusWidth = FlatUIUtils.getUIFloat("Component.innerFocusWidth", 0.0f);
        this.innerOutlineWidth = FlatUIUtils.getUIFloat("Component.innerOutlineWidth", 0.0f);
        this.focusColor = UIManager.getColor("Component.focusColor");
        this.borderColor = UIManager.getColor("Component.borderColor");
        this.disabledBorderColor = UIManager.getColor("Component.disabledBorderColor");
        this.focusedBorderColor = UIManager.getColor("Component.focusedBorderColor");
        this.errorBorderColor = UIManager.getColor("Component.error.borderColor");
        this.errorFocusedBorderColor = UIManager.getColor("Component.error.focusedBorderColor");
        this.warningBorderColor = UIManager.getColor("Component.warning.borderColor");
        this.warningFocusedBorderColor = UIManager.getColor("Component.warning.focusedBorderColor");
        this.customBorderColor = UIManager.getColor("Component.custom.borderColor");
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            final boolean isCellEditor = this.isTableCellEditor(c);
            final float focusWidth = isCellEditor ? 0.0f : UIScale.scale((float)this.getFocusWidth(c));
            final float borderWidth = UIScale.scale((float)this.getBorderWidth(c));
            final float arc = isCellEditor ? 0.0f : UIScale.scale((float)this.getArc(c));
            final Color outlineColor = this.getOutlineColor(c);
            if (outlineColor != null || this.isFocused(c)) {
                final float innerFocusWidth = (c instanceof JScrollPane) ? 0.0f : ((outlineColor != null) ? this.innerOutlineWidth : this.innerFocusWidth);
                g2.setColor((outlineColor != null) ? outlineColor : this.getFocusColor(c));
                FlatUIUtils.paintComponentOuterBorder(g2, x, y, width, height, focusWidth, UIScale.scale((float)this.getLineWidth(c)) + UIScale.scale(innerFocusWidth), arc);
            }
            g2.setPaint((outlineColor != null) ? outlineColor : this.getBorderColor(c));
            FlatUIUtils.paintComponentBorder(g2, x, y, width, height, focusWidth, borderWidth, arc);
        }
        finally {
            g2.dispose();
        }
    }
    
    protected Color getOutlineColor(final Component c) {
        if (!(c instanceof JComponent)) {
            return null;
        }
        final Object outline = ((JComponent)c).getClientProperty("JComponent.outline");
        if (outline instanceof String) {
            final String s = (String)outline;
            switch (s) {
                case "error": {
                    return this.isFocused(c) ? this.errorFocusedBorderColor : this.errorBorderColor;
                }
                case "warning": {
                    return this.isFocused(c) ? this.warningFocusedBorderColor : this.warningBorderColor;
                }
            }
        }
        else {
            if (outline instanceof Color) {
                Color color = (Color)outline;
                if (!this.isFocused(c) && this.customBorderColor instanceof DerivedColor) {
                    color = ((DerivedColor)this.customBorderColor).derive(color);
                }
                return color;
            }
            if (outline instanceof Color[] && ((Color[])outline).length >= 2) {
                return ((Color[])outline)[!this.isFocused(c)];
            }
        }
        return null;
    }
    
    protected Color getFocusColor(final Component c) {
        return this.focusColor;
    }
    
    protected Paint getBorderColor(final Component c) {
        return this.isEnabled(c) ? (this.isFocused(c) ? this.focusedBorderColor : this.borderColor) : this.disabledBorderColor;
    }
    
    protected boolean isEnabled(final Component c) {
        if (c instanceof JScrollPane) {
            final JViewport viewport = ((JScrollPane)c).getViewport();
            final Component view = (viewport != null) ? viewport.getView() : null;
            if (view != null && !this.isEnabled(view)) {
                return false;
            }
        }
        return c.isEnabled() && (!(c instanceof JTextComponent) || ((JTextComponent)c).isEditable());
    }
    
    protected boolean isFocused(final Component c) {
        if (c instanceof JScrollPane) {
            final JViewport viewport = ((JScrollPane)c).getViewport();
            final Component view = (viewport != null) ? viewport.getView() : null;
            if (view != null) {
                if (FlatUIUtils.isPermanentFocusOwner(view)) {
                    return true;
                }
                if ((view instanceof JTable && ((JTable)view).isEditing()) || (view instanceof JTree && ((JTree)view).isEditing())) {
                    final Component focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                    if (focusOwner != null) {
                        return SwingUtilities.isDescendingFrom(focusOwner, view);
                    }
                }
            }
            return false;
        }
        if (c instanceof JComboBox && ((JComboBox)c).isEditable()) {
            final Component editorComponent = ((JComboBox)c).getEditor().getEditorComponent();
            return editorComponent != null && FlatUIUtils.isPermanentFocusOwner(editorComponent);
        }
        if (!(c instanceof JSpinner)) {
            return FlatUIUtils.isPermanentFocusOwner(c);
        }
        if (FlatUIUtils.isPermanentFocusOwner(c)) {
            return true;
        }
        final JComponent editor = ((JSpinner)c).getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            final JTextField textField = ((JSpinner.DefaultEditor)editor).getTextField();
            if (textField != null) {
                return FlatUIUtils.isPermanentFocusOwner(textField);
            }
        }
        return false;
    }
    
    protected boolean isTableCellEditor(final Component c) {
        return FlatUIUtils.isTableCellEditor(c);
    }
    
    @Override
    public Insets getBorderInsets(final Component c, Insets insets) {
        final boolean isCellEditor = this.isTableCellEditor(c);
        final float focusWidth = isCellEditor ? 0.0f : UIScale.scale((float)this.getFocusWidth(c));
        final float ow = focusWidth + UIScale.scale((float)this.getLineWidth(c));
        insets = super.getBorderInsets(c, insets);
        insets.top = Math.round(UIScale.scale((float)insets.top) + ow);
        insets.left = Math.round(UIScale.scale((float)insets.left) + ow);
        insets.bottom = Math.round(UIScale.scale((float)insets.bottom) + ow);
        insets.right = Math.round(UIScale.scale((float)insets.right) + ow);
        return insets;
    }
    
    protected int getFocusWidth(final Component c) {
        return this.focusWidth;
    }
    
    protected int getLineWidth(final Component c) {
        return 1;
    }
    
    protected int getBorderWidth(final Component c) {
        return this.getLineWidth(c);
    }
    
    protected int getArc(final Component c) {
        return 0;
    }
}
