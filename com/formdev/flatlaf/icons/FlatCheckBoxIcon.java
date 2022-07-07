// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.icons;

import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.geom.Path2D;
import com.formdev.flatlaf.ui.FlatButtonUI;
import javax.swing.AbstractButton;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Component;
import com.formdev.flatlaf.ui.FlatUIUtils;
import javax.swing.UIManager;
import java.awt.Color;

public class FlatCheckBoxIcon extends FlatAbstractIcon
{
    protected final String style;
    public final int focusWidth;
    protected final Color focusColor;
    protected final int arc;
    protected final Color borderColor;
    protected final Color background;
    protected final Color selectedBorderColor;
    protected final Color selectedBackground;
    protected final Color checkmarkColor;
    protected final Color disabledBorderColor;
    protected final Color disabledBackground;
    protected final Color disabledCheckmarkColor;
    protected final Color focusedBorderColor;
    protected final Color focusedBackground;
    protected final Color selectedFocusedBorderColor;
    protected final Color selectedFocusedBackground;
    protected final Color selectedFocusedCheckmarkColor;
    protected final Color hoverBorderColor;
    protected final Color hoverBackground;
    protected final Color selectedHoverBackground;
    protected final Color pressedBackground;
    protected final Color selectedPressedBackground;
    static final int ICON_SIZE = 15;
    
    protected static Color getUIColor(final String key, final String style) {
        if (style != null) {
            final Color color = UIManager.getColor(styleKey(key, style));
            if (color != null) {
                return color;
            }
        }
        return UIManager.getColor(key);
    }
    
    protected static int getUIInt(final String key, final int defaultValue, final String style) {
        if (style != null) {
            final Object value = UIManager.get(styleKey(key, style));
            if (value instanceof Integer) {
                return (int)value;
            }
        }
        return FlatUIUtils.getUIInt(key, defaultValue);
    }
    
    private static String styleKey(final String key, final String style) {
        return key.replace(".icon.", ".icon[" + style + "].");
    }
    
    public FlatCheckBoxIcon() {
        super(15, 15, null);
        this.style = UIManager.getString("CheckBox.icon.style");
        this.focusWidth = getUIInt("CheckBox.icon.focusWidth", UIManager.getInt("Component.focusWidth"), this.style);
        this.focusColor = FlatUIUtils.getUIColor("CheckBox.icon.focusColor", UIManager.getColor("Component.focusColor"));
        this.arc = FlatUIUtils.getUIInt("CheckBox.arc", 2);
        this.borderColor = getUIColor("CheckBox.icon.borderColor", this.style);
        this.background = getUIColor("CheckBox.icon.background", this.style);
        this.selectedBorderColor = getUIColor("CheckBox.icon.selectedBorderColor", this.style);
        this.selectedBackground = getUIColor("CheckBox.icon.selectedBackground", this.style);
        this.checkmarkColor = getUIColor("CheckBox.icon.checkmarkColor", this.style);
        this.disabledBorderColor = getUIColor("CheckBox.icon.disabledBorderColor", this.style);
        this.disabledBackground = getUIColor("CheckBox.icon.disabledBackground", this.style);
        this.disabledCheckmarkColor = getUIColor("CheckBox.icon.disabledCheckmarkColor", this.style);
        this.focusedBorderColor = getUIColor("CheckBox.icon.focusedBorderColor", this.style);
        this.focusedBackground = getUIColor("CheckBox.icon.focusedBackground", this.style);
        this.selectedFocusedBorderColor = getUIColor("CheckBox.icon.selectedFocusedBorderColor", this.style);
        this.selectedFocusedBackground = getUIColor("CheckBox.icon.selectedFocusedBackground", this.style);
        this.selectedFocusedCheckmarkColor = getUIColor("CheckBox.icon.selectedFocusedCheckmarkColor", this.style);
        this.hoverBorderColor = getUIColor("CheckBox.icon.hoverBorderColor", this.style);
        this.hoverBackground = getUIColor("CheckBox.icon.hoverBackground", this.style);
        this.selectedHoverBackground = getUIColor("CheckBox.icon.selectedHoverBackground", this.style);
        this.pressedBackground = getUIColor("CheckBox.icon.pressedBackground", this.style);
        this.selectedPressedBackground = getUIColor("CheckBox.icon.selectedPressedBackground", this.style);
    }
    
    @Override
    protected void paintIcon(final Component c, final Graphics2D g2) {
        final boolean indeterminate = c instanceof JComponent && FlatClientProperties.clientPropertyEquals((JComponent)c, "JButton.selectedState", "indeterminate");
        final boolean selected = indeterminate || (c instanceof AbstractButton && ((AbstractButton)c).isSelected());
        final boolean isFocused = FlatUIUtils.isPermanentFocusOwner(c);
        if (isFocused && this.focusWidth > 0 && FlatButtonUI.isFocusPainted(c)) {
            g2.setColor(this.focusColor);
            this.paintFocusBorder(g2);
        }
        g2.setColor(FlatButtonUI.buttonStateColor(c, selected ? this.selectedBorderColor : this.borderColor, this.disabledBorderColor, (selected && this.selectedFocusedBorderColor != null) ? this.selectedFocusedBorderColor : this.focusedBorderColor, this.hoverBorderColor, null));
        this.paintBorder(g2);
        g2.setColor(FlatUIUtils.deriveColor(FlatButtonUI.buttonStateColor(c, selected ? this.selectedBackground : this.background, this.disabledBackground, (selected && this.selectedFocusedBackground != null) ? this.selectedFocusedBackground : this.focusedBackground, (selected && this.selectedHoverBackground != null) ? this.selectedHoverBackground : this.hoverBackground, (selected && this.selectedPressedBackground != null) ? this.selectedPressedBackground : this.pressedBackground), this.background));
        this.paintBackground(g2);
        if (selected || indeterminate) {
            g2.setColor(c.isEnabled() ? ((selected && isFocused && this.selectedFocusedCheckmarkColor != null) ? this.selectedFocusedCheckmarkColor : this.checkmarkColor) : this.disabledCheckmarkColor);
            if (indeterminate) {
                this.paintIndeterminate(g2);
            }
            else {
                this.paintCheckmark(g2);
            }
        }
    }
    
    protected void paintFocusBorder(final Graphics2D g2) {
        final int wh = 14 + this.focusWidth * 2;
        final int arcwh = this.arc + this.focusWidth * 2;
        g2.fillRoundRect(-this.focusWidth + 1, -this.focusWidth, wh, wh, arcwh, arcwh);
    }
    
    protected void paintBorder(final Graphics2D g2) {
        final int arcwh = this.arc;
        g2.fillRoundRect(1, 0, 14, 14, arcwh, arcwh);
    }
    
    protected void paintBackground(final Graphics2D g2) {
        final int arcwh = this.arc - 1;
        g2.fillRoundRect(2, 1, 12, 12, arcwh, arcwh);
    }
    
    protected void paintCheckmark(final Graphics2D g2) {
        final Path2D.Float path = new Path2D.Float();
        path.moveTo(4.5f, 7.5f);
        path.lineTo(6.6f, 10.0f);
        path.lineTo(11.25f, 3.5f);
        g2.setStroke(new BasicStroke(1.9f, 1, 1));
        g2.draw(path);
    }
    
    protected void paintIndeterminate(final Graphics2D g2) {
        g2.fill(new RoundRectangle2D.Float(3.75f, 5.75f, 8.5f, 2.5f, 2.0f, 2.0f));
    }
}
