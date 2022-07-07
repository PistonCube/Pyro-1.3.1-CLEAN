// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.text.AttributedCharacterIterator;
import java.awt.Paint;
import com.formdev.flatlaf.util.Graphics2DProxy;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JMenu;
import java.awt.Shape;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Component;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.text.View;
import java.awt.Graphics;
import java.awt.FontMetrics;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Rectangle;
import javax.swing.UIManager;
import javax.swing.KeyStroke;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JMenuItem;

public class FlatMenuItemRenderer
{
    protected final JMenuItem menuItem;
    protected final Icon checkIcon;
    protected final Icon arrowIcon;
    protected final Font acceleratorFont;
    protected final String acceleratorDelimiter;
    protected final int minimumWidth;
    protected final Dimension minimumIconSize;
    protected final int textAcceleratorGap;
    protected final int textNoAcceleratorGap;
    protected final int acceleratorArrowGap;
    protected final Color checkBackground;
    protected final Insets checkMargins;
    protected final Color underlineSelectionBackground;
    protected final Color underlineSelectionCheckBackground;
    protected final Color underlineSelectionColor;
    protected final int underlineSelectionHeight;
    private KeyStroke cachedAccelerator;
    private String cachedAcceleratorText;
    
    protected FlatMenuItemRenderer(final JMenuItem menuItem, final Icon checkIcon, final Icon arrowIcon, final Font acceleratorFont, final String acceleratorDelimiter) {
        this.minimumWidth = UIManager.getInt("MenuItem.minimumWidth");
        this.textAcceleratorGap = FlatUIUtils.getUIInt("MenuItem.textAcceleratorGap", 28);
        this.textNoAcceleratorGap = FlatUIUtils.getUIInt("MenuItem.textNoAcceleratorGap", 6);
        this.acceleratorArrowGap = FlatUIUtils.getUIInt("MenuItem.acceleratorArrowGap", 2);
        this.checkBackground = UIManager.getColor("MenuItem.checkBackground");
        this.checkMargins = UIManager.getInsets("MenuItem.checkMargins");
        this.underlineSelectionBackground = UIManager.getColor("MenuItem.underlineSelectionBackground");
        this.underlineSelectionCheckBackground = UIManager.getColor("MenuItem.underlineSelectionCheckBackground");
        this.underlineSelectionColor = UIManager.getColor("MenuItem.underlineSelectionColor");
        this.underlineSelectionHeight = UIManager.getInt("MenuItem.underlineSelectionHeight");
        this.menuItem = menuItem;
        this.checkIcon = checkIcon;
        this.arrowIcon = arrowIcon;
        this.acceleratorFont = acceleratorFont;
        this.acceleratorDelimiter = acceleratorDelimiter;
        final Dimension minimumIconSize = UIManager.getDimension("MenuItem.minimumIconSize");
        this.minimumIconSize = ((minimumIconSize != null) ? minimumIconSize : new Dimension(16, 16));
    }
    
    protected Dimension getPreferredMenuItemSize() {
        int width = 0;
        int height = 0;
        final boolean isTopLevelMenu = isTopLevelMenu(this.menuItem);
        final Rectangle viewRect = new Rectangle(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        final Rectangle iconRect = new Rectangle();
        final Rectangle textRect = new Rectangle();
        SwingUtilities.layoutCompoundLabel(this.menuItem, this.menuItem.getFontMetrics(this.menuItem.getFont()), this.menuItem.getText(), this.getIconForLayout(), this.menuItem.getVerticalAlignment(), this.menuItem.getHorizontalAlignment(), this.menuItem.getVerticalTextPosition(), this.menuItem.getHorizontalTextPosition(), viewRect, iconRect, textRect, UIScale.scale(this.menuItem.getIconTextGap()));
        final Rectangle labelRect = iconRect.union(textRect);
        width += labelRect.width;
        height = Math.max(labelRect.height, height);
        final String accelText = this.getAcceleratorText();
        if (accelText != null) {
            width += UIScale.scale(isTopLevelMenu ? this.menuItem.getIconTextGap() : this.textAcceleratorGap);
            final FontMetrics accelFm = this.menuItem.getFontMetrics(this.acceleratorFont);
            width += SwingUtilities.computeStringWidth(accelFm, accelText);
            height = Math.max(accelFm.getHeight(), height);
        }
        if (!isTopLevelMenu && this.arrowIcon != null) {
            if (accelText == null) {
                width += UIScale.scale(this.textNoAcceleratorGap);
            }
            width += UIScale.scale(this.acceleratorArrowGap);
            width += this.arrowIcon.getIconWidth();
            height = Math.max(this.arrowIcon.getIconHeight(), height);
        }
        final Insets insets = this.menuItem.getInsets();
        width += insets.left + insets.right;
        height += insets.top + insets.bottom;
        if (!isTopLevelMenu) {
            final int minimumWidth = FlatUIUtils.minimumWidth(this.menuItem, this.minimumWidth);
            width = Math.max(width, UIScale.scale(minimumWidth));
        }
        return new Dimension(width, height);
    }
    
    private void layout(final Rectangle viewRect, final Rectangle iconRect, final Rectangle textRect, final Rectangle accelRect, final Rectangle arrowRect, final Rectangle labelRect) {
        final boolean isTopLevelMenu = isTopLevelMenu(this.menuItem);
        if (!isTopLevelMenu && this.arrowIcon != null) {
            arrowRect.width = this.arrowIcon.getIconWidth();
            arrowRect.height = this.arrowIcon.getIconHeight();
        }
        else {
            arrowRect.setSize(0, 0);
        }
        arrowRect.y = viewRect.y + centerOffset(viewRect.height, arrowRect.height);
        final String accelText = this.getAcceleratorText();
        if (accelText != null) {
            final FontMetrics accelFm = this.menuItem.getFontMetrics(this.acceleratorFont);
            accelRect.width = SwingUtilities.computeStringWidth(accelFm, accelText);
            accelRect.height = accelFm.getHeight();
            accelRect.y = viewRect.y + centerOffset(viewRect.height, accelRect.height);
        }
        else {
            accelRect.setBounds(0, 0, 0, 0);
        }
        final int accelArrowGap = isTopLevelMenu ? 0 : UIScale.scale(this.acceleratorArrowGap);
        if (this.menuItem.getComponentOrientation().isLeftToRight()) {
            arrowRect.x = viewRect.x + viewRect.width - arrowRect.width;
            accelRect.x = arrowRect.x - accelArrowGap - accelRect.width;
        }
        else {
            arrowRect.x = viewRect.x;
            accelRect.x = arrowRect.x + accelArrowGap + arrowRect.width;
        }
        int accelArrowWidth = accelRect.width + arrowRect.width;
        if (accelText != null) {
            accelArrowWidth += UIScale.scale(isTopLevelMenu ? this.menuItem.getIconTextGap() : this.textAcceleratorGap);
        }
        if (!isTopLevelMenu && this.arrowIcon != null) {
            if (accelText == null) {
                accelArrowWidth += UIScale.scale(this.textNoAcceleratorGap);
            }
            accelArrowWidth += UIScale.scale(this.acceleratorArrowGap);
        }
        labelRect.setBounds(viewRect);
        labelRect.width -= accelArrowWidth;
        if (!this.menuItem.getComponentOrientation().isLeftToRight()) {
            labelRect.x += accelArrowWidth;
        }
        SwingUtilities.layoutCompoundLabel(this.menuItem, this.menuItem.getFontMetrics(this.menuItem.getFont()), this.menuItem.getText(), this.getIconForLayout(), this.menuItem.getVerticalAlignment(), this.menuItem.getHorizontalAlignment(), this.menuItem.getVerticalTextPosition(), this.menuItem.getHorizontalTextPosition(), labelRect, iconRect, textRect, UIScale.scale(this.menuItem.getIconTextGap()));
    }
    
    private static int centerOffset(final int wh1, final int wh2) {
        return wh1 / 2 - wh2 / 2;
    }
    
    protected void paintMenuItem(final Graphics g, final Color selectionBackground, final Color selectionForeground, final Color disabledForeground, final Color acceleratorForeground, final Color acceleratorSelectionForeground) {
        final Rectangle viewRect = new Rectangle(this.menuItem.getWidth(), this.menuItem.getHeight());
        final Insets insets = this.menuItem.getInsets();
        final Rectangle rectangle = viewRect;
        rectangle.x += insets.left;
        final Rectangle rectangle2 = viewRect;
        rectangle2.y += insets.top;
        final Rectangle rectangle3 = viewRect;
        rectangle3.width -= insets.left + insets.right;
        final Rectangle rectangle4 = viewRect;
        rectangle4.height -= insets.top + insets.bottom;
        final Rectangle iconRect = new Rectangle();
        final Rectangle textRect = new Rectangle();
        final Rectangle accelRect = new Rectangle();
        final Rectangle arrowRect = new Rectangle();
        final Rectangle labelRect = new Rectangle();
        this.layout(viewRect, iconRect, textRect, accelRect, arrowRect, labelRect);
        this.paintBackground(g, selectionBackground);
        this.paintIcon(g, iconRect, this.getIconForPainting());
        this.paintText(g, textRect, this.menuItem.getText(), selectionForeground, disabledForeground);
        this.paintAccelerator(g, accelRect, this.getAcceleratorText(), acceleratorForeground, acceleratorSelectionForeground, disabledForeground);
        if (!isTopLevelMenu(this.menuItem)) {
            this.paintArrowIcon(g, arrowRect, this.arrowIcon);
        }
    }
    
    protected void paintBackground(final Graphics g, final Color selectionBackground) {
        final boolean armedOrSelected = isArmedOrSelected(this.menuItem);
        if (this.menuItem.isOpaque() || armedOrSelected) {
            final int width = this.menuItem.getWidth();
            final int height = this.menuItem.getHeight();
            g.setColor(armedOrSelected ? (this.isUnderlineSelection() ? this.deriveBackground(this.underlineSelectionBackground) : selectionBackground) : this.menuItem.getBackground());
            g.fillRect(0, 0, width, height);
            if (armedOrSelected && this.isUnderlineSelection()) {
                final int underlineHeight = UIScale.scale(this.underlineSelectionHeight);
                g.setColor(this.underlineSelectionColor);
                if (isTopLevelMenu(this.menuItem)) {
                    g.fillRect(0, height - underlineHeight, width, underlineHeight);
                }
                else if (this.menuItem.getComponentOrientation().isLeftToRight()) {
                    g.fillRect(0, 0, underlineHeight, height);
                }
                else {
                    g.fillRect(width - underlineHeight, 0, underlineHeight, height);
                }
            }
        }
    }
    
    protected Color deriveBackground(final Color background) {
        final Color baseColor = this.menuItem.isOpaque() ? this.menuItem.getBackground() : FlatUIUtils.getParentBackground(this.menuItem);
        return FlatUIUtils.deriveColor(background, baseColor);
    }
    
    protected void paintIcon(final Graphics g, final Rectangle iconRect, final Icon icon) {
        if (this.menuItem.isSelected() && this.checkIcon != null && icon != this.checkIcon) {
            final Rectangle r = FlatUIUtils.addInsets(iconRect, UIScale.scale(this.checkMargins));
            g.setColor(this.deriveBackground(this.isUnderlineSelection() ? this.underlineSelectionCheckBackground : this.checkBackground));
            g.fillRect(r.x, r.y, r.width, r.height);
        }
        paintIcon(g, this.menuItem, icon, iconRect);
    }
    
    protected void paintText(final Graphics g, final Rectangle textRect, final String text, final Color selectionForeground, final Color disabledForeground) {
        final View htmlView = (View)this.menuItem.getClientProperty("html");
        if (htmlView != null) {
            paintHTMLText(g, this.menuItem, textRect, htmlView, this.isUnderlineSelection() ? null : selectionForeground);
            return;
        }
        final int mnemonicIndex = FlatLaf.isShowMnemonics() ? this.menuItem.getDisplayedMnemonicIndex() : -1;
        final Color foreground = (isTopLevelMenu(this.menuItem) ? this.menuItem.getParent() : this.menuItem).getForeground();
        paintText(g, this.menuItem, textRect, text, mnemonicIndex, this.menuItem.getFont(), foreground, this.isUnderlineSelection() ? foreground : selectionForeground, disabledForeground);
    }
    
    protected void paintAccelerator(final Graphics g, final Rectangle accelRect, final String accelText, final Color foreground, final Color selectionForeground, final Color disabledForeground) {
        paintText(g, this.menuItem, accelRect, accelText, -1, this.acceleratorFont, foreground, this.isUnderlineSelection() ? foreground : selectionForeground, disabledForeground);
    }
    
    protected void paintArrowIcon(final Graphics g, final Rectangle arrowRect, final Icon arrowIcon) {
        paintIcon(g, this.menuItem, arrowIcon, arrowRect);
    }
    
    protected static void paintIcon(final Graphics g, final JMenuItem menuItem, final Icon icon, final Rectangle iconRect) {
        if (icon == null) {
            return;
        }
        final int x = iconRect.x + centerOffset(iconRect.width, icon.getIconWidth());
        final int y = iconRect.y + centerOffset(iconRect.height, icon.getIconHeight());
        icon.paintIcon(menuItem, g, x, y);
    }
    
    protected static void paintText(final Graphics g, final JMenuItem menuItem, final Rectangle textRect, final String text, final int mnemonicIndex, final Font font, final Color foreground, final Color selectionForeground, final Color disabledForeground) {
        if (text == null || text.isEmpty()) {
            return;
        }
        final FontMetrics fm = menuItem.getFontMetrics(font);
        final Font oldFont = g.getFont();
        g.setFont(font);
        g.setColor(menuItem.isEnabled() ? (isArmedOrSelected(menuItem) ? selectionForeground : foreground) : disabledForeground);
        FlatUIUtils.drawStringUnderlineCharAt(menuItem, g, text, mnemonicIndex, textRect.x, textRect.y + fm.getAscent());
        g.setFont(oldFont);
    }
    
    protected static void paintHTMLText(Graphics g, final JMenuItem menuItem, final Rectangle textRect, final View htmlView, final Color selectionForeground) {
        if (isArmedOrSelected(menuItem) && selectionForeground != null) {
            g = new GraphicsProxyWithTextColor((Graphics2D)g, selectionForeground);
        }
        htmlView.paint(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g), textRect);
    }
    
    protected static boolean isArmedOrSelected(final JMenuItem menuItem) {
        return menuItem.isArmed() || (menuItem instanceof JMenu && menuItem.isSelected());
    }
    
    protected static boolean isTopLevelMenu(final JMenuItem menuItem) {
        return menuItem instanceof JMenu && ((JMenu)menuItem).isTopLevelMenu();
    }
    
    protected boolean isUnderlineSelection() {
        return "underline".equals(UIManager.getString("MenuItem.selectionType"));
    }
    
    private Icon getIconForPainting() {
        final Icon icon = this.menuItem.getIcon();
        if (icon == null && this.checkIcon != null && !isTopLevelMenu(this.menuItem)) {
            return this.checkIcon;
        }
        if (icon == null) {
            return null;
        }
        if (!this.menuItem.isEnabled()) {
            return this.menuItem.getDisabledIcon();
        }
        if (this.menuItem.getModel().isPressed() && this.menuItem.isArmed()) {
            final Icon pressedIcon = this.menuItem.getPressedIcon();
            if (pressedIcon != null) {
                return pressedIcon;
            }
        }
        return icon;
    }
    
    private Icon getIconForLayout() {
        final Icon icon = this.menuItem.getIcon();
        if (isTopLevelMenu(this.menuItem)) {
            return (icon != null) ? new MinSizeIcon(icon) : null;
        }
        return new MinSizeIcon((icon != null) ? icon : this.checkIcon);
    }
    
    private String getAcceleratorText() {
        final KeyStroke accelerator = this.menuItem.getAccelerator();
        if (accelerator == null) {
            return null;
        }
        if (accelerator == this.cachedAccelerator) {
            return this.cachedAcceleratorText;
        }
        this.cachedAccelerator = accelerator;
        return this.cachedAcceleratorText = this.getTextForAccelerator(accelerator);
    }
    
    protected String getTextForAccelerator(final KeyStroke accelerator) {
        final StringBuilder buf = new StringBuilder();
        final int modifiers = accelerator.getModifiers();
        if (modifiers != 0) {
            buf.append(InputEvent.getModifiersExText(modifiers)).append(this.acceleratorDelimiter);
        }
        final int keyCode = accelerator.getKeyCode();
        if (keyCode != 0) {
            buf.append(KeyEvent.getKeyText(keyCode));
        }
        else {
            buf.append(accelerator.getKeyChar());
        }
        return buf.toString();
    }
    
    private class MinSizeIcon implements Icon
    {
        private final Icon delegate;
        
        MinSizeIcon(final Icon delegate) {
            this.delegate = delegate;
        }
        
        @Override
        public int getIconWidth() {
            final int iconWidth = (this.delegate != null) ? this.delegate.getIconWidth() : 0;
            return Math.max(iconWidth, UIScale.scale(FlatMenuItemRenderer.this.minimumIconSize.width));
        }
        
        @Override
        public int getIconHeight() {
            final int iconHeight = (this.delegate != null) ? this.delegate.getIconHeight() : 0;
            return Math.max(iconHeight, UIScale.scale(FlatMenuItemRenderer.this.minimumIconSize.height));
        }
        
        @Override
        public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
        }
    }
    
    private static class GraphicsProxyWithTextColor extends Graphics2DProxy
    {
        private final Color textColor;
        
        GraphicsProxyWithTextColor(final Graphics2D delegate, final Color textColor) {
            super(delegate);
            this.textColor = textColor;
        }
        
        @Override
        public void drawString(final String str, final int x, final int y) {
            final Paint oldPaint = this.getPaint();
            this.setPaint(this.textColor);
            super.drawString(str, x, y);
            this.setPaint(oldPaint);
        }
        
        @Override
        public void drawString(final String str, final float x, final float y) {
            final Paint oldPaint = this.getPaint();
            this.setPaint(this.textColor);
            super.drawString(str, x, y);
            this.setPaint(oldPaint);
        }
        
        @Override
        public void drawString(final AttributedCharacterIterator iterator, final int x, final int y) {
            final Paint oldPaint = this.getPaint();
            this.setPaint(this.textColor);
            super.drawString(iterator, x, y);
            this.setPaint(oldPaint);
        }
        
        @Override
        public void drawString(final AttributedCharacterIterator iterator, final float x, final float y) {
            final Paint oldPaint = this.getPaint();
            this.setPaint(this.textColor);
            super.drawString(iterator, x, y);
            this.setPaint(oldPaint);
        }
        
        @Override
        public void drawChars(final char[] data, final int offset, final int length, final int x, final int y) {
            final Paint oldPaint = this.getPaint();
            this.setPaint(this.textColor);
            super.drawChars(data, offset, length, x, y);
            this.setPaint(oldPaint);
        }
    }
}
