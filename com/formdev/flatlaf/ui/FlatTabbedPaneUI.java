// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.JTabbedPane;
import java.awt.Container;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.Component;
import javax.swing.text.View;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.plaf.UIResource;
import java.awt.Shape;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Insets;
import java.awt.AWTKeyStroke;
import java.util.Collections;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.util.Set;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class FlatTabbedPaneUI extends BasicTabbedPaneUI
{
    private static Set<KeyStroke> focusForwardTraversalKeys;
    private static Set<KeyStroke> focusBackwardTraversalKeys;
    protected Color disabledForeground;
    protected Color selectedBackground;
    protected Color selectedForeground;
    protected Color underlineColor;
    protected Color disabledUnderlineColor;
    protected Color hoverColor;
    protected Color focusColor;
    protected Color tabSeparatorColor;
    protected Color contentAreaColor;
    protected int tabHeight;
    protected int tabSelectionHeight;
    protected int contentSeparatorHeight;
    protected boolean showTabSeparators;
    protected boolean tabSeparatorsFullHeight;
    protected boolean hasFullBorder;
    protected boolean tabsOverlapBorder;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTabbedPaneUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.disabledForeground = UIManager.getColor("TabbedPane.disabledForeground");
        this.selectedBackground = UIManager.getColor("TabbedPane.selectedBackground");
        this.selectedForeground = UIManager.getColor("TabbedPane.selectedForeground");
        this.underlineColor = UIManager.getColor("TabbedPane.underlineColor");
        this.disabledUnderlineColor = UIManager.getColor("TabbedPane.disabledUnderlineColor");
        this.hoverColor = UIManager.getColor("TabbedPane.hoverColor");
        this.focusColor = UIManager.getColor("TabbedPane.focusColor");
        this.tabSeparatorColor = UIManager.getColor("TabbedPane.tabSeparatorColor");
        this.contentAreaColor = UIManager.getColor("TabbedPane.contentAreaColor");
        this.tabHeight = UIManager.getInt("TabbedPane.tabHeight");
        this.tabSelectionHeight = UIManager.getInt("TabbedPane.tabSelectionHeight");
        this.contentSeparatorHeight = UIManager.getInt("TabbedPane.contentSeparatorHeight");
        this.showTabSeparators = UIManager.getBoolean("TabbedPane.showTabSeparators");
        this.tabSeparatorsFullHeight = UIManager.getBoolean("TabbedPane.tabSeparatorsFullHeight");
        this.hasFullBorder = UIManager.getBoolean("TabbedPane.hasFullBorder");
        this.tabsOverlapBorder = UIManager.getBoolean("TabbedPane.tabsOverlapBorder");
        this.textIconGap = UIScale.scale(this.textIconGap);
        this.tabInsets = UIScale.scale(this.tabInsets);
        this.selectedTabPadInsets = UIScale.scale(this.selectedTabPadInsets);
        this.tabAreaInsets = UIScale.scale(this.tabAreaInsets);
        this.tabHeight = UIScale.scale(this.tabHeight);
        this.tabSelectionHeight = UIScale.scale(this.tabSelectionHeight);
        if (FlatTabbedPaneUI.focusForwardTraversalKeys == null) {
            FlatTabbedPaneUI.focusForwardTraversalKeys = Collections.singleton(KeyStroke.getKeyStroke(9, 0));
            FlatTabbedPaneUI.focusBackwardTraversalKeys = Collections.singleton(KeyStroke.getKeyStroke(9, 1));
        }
        this.tabPane.setFocusTraversalKeys(0, FlatTabbedPaneUI.focusForwardTraversalKeys);
        this.tabPane.setFocusTraversalKeys(1, FlatTabbedPaneUI.focusBackwardTraversalKeys);
        MigLayoutVisualPadding.install(this.tabPane, null);
    }
    
    @Override
    protected void uninstallDefaults() {
        this.tabPane.setFocusTraversalKeys(0, null);
        this.tabPane.setFocusTraversalKeys(1, null);
        super.uninstallDefaults();
        this.disabledForeground = null;
        this.selectedBackground = null;
        this.selectedForeground = null;
        this.underlineColor = null;
        this.disabledUnderlineColor = null;
        this.hoverColor = null;
        this.focusColor = null;
        this.tabSeparatorColor = null;
        this.contentAreaColor = null;
        MigLayoutVisualPadding.uninstall(this.tabPane);
    }
    
    @Override
    protected PropertyChangeListener createPropertyChangeListener() {
        return new PropertyChangeHandler() {
            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                super.propertyChange(e);
                final String propertyName = e.getPropertyName();
                switch (propertyName) {
                    case "JTabbedPane.showTabSeparators":
                    case "JTabbedPane.hasFullBorder":
                    case "JTabbedPane.tabHeight": {
                        FlatTabbedPaneUI.this.tabPane.revalidate();
                        FlatTabbedPaneUI.this.tabPane.repaint();
                        break;
                    }
                }
            }
        };
    }
    
    @Override
    protected JButton createScrollButton(final int direction) {
        return new FlatArrowButton(direction, UIManager.getString("Component.arrowType"), UIManager.getColor("TabbedPane.foreground"), UIManager.getColor("TabbedPane.disabledForeground"), null, UIManager.getColor("TabbedPane.hoverColor"));
    }
    
    @Override
    protected void setRolloverTab(final int index) {
        final int oldIndex = this.getRolloverTab();
        super.setRolloverTab(index);
        if (index == oldIndex) {
            return;
        }
        this.repaintTab(oldIndex);
        this.repaintTab(index);
    }
    
    private void repaintTab(final int tabIndex) {
        if (tabIndex < 0 || tabIndex >= this.tabPane.getTabCount()) {
            return;
        }
        final Rectangle r = this.getTabBounds(this.tabPane, tabIndex);
        if (r != null) {
            this.tabPane.repaint(r);
        }
    }
    
    @Override
    protected int calculateTabWidth(final int tabPlacement, final int tabIndex, final FontMetrics metrics) {
        return super.calculateTabWidth(tabPlacement, tabIndex, metrics) - 3;
    }
    
    @Override
    protected int calculateTabHeight(final int tabPlacement, final int tabIndex, final int fontHeight) {
        final int tabHeight = FlatClientProperties.clientPropertyInt(this.tabPane, "JTabbedPane.tabHeight", this.tabHeight);
        return Math.max(tabHeight, super.calculateTabHeight(tabPlacement, tabIndex, fontHeight) - 2);
    }
    
    @Override
    protected Insets getContentBorderInsets(final int tabPlacement) {
        final boolean hasFullBorder = FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.hasFullBorder", this.hasFullBorder);
        final int sh = UIScale.scale(this.contentSeparatorHeight);
        final Insets insets = hasFullBorder ? new Insets(sh, sh, sh, sh) : new Insets(sh, 0, 0, 0);
        final Insets contentBorderInsets = new Insets(0, 0, 0, 0);
        BasicTabbedPaneUI.rotateInsets(insets, contentBorderInsets, tabPlacement);
        return contentBorderInsets;
    }
    
    @Override
    protected int getTabLabelShiftX(final int tabPlacement, final int tabIndex, final boolean isSelected) {
        return 0;
    }
    
    @Override
    protected int getTabLabelShiftY(final int tabPlacement, final int tabIndex, final boolean isSelected) {
        return 0;
    }
    
    @Override
    public void update(final Graphics g, final JComponent c) {
        FlatUIUtils.setRenderingHints((Graphics2D)g);
        super.update(g, c);
    }
    
    @Override
    protected void paintText(final Graphics g, final int tabPlacement, final Font font, final FontMetrics metrics, final int tabIndex, final String title, final Rectangle textRect, final boolean isSelected) {
        g.setFont(font);
        final View view = this.getTextViewForTab(tabIndex);
        if (view != null) {
            view.paint(g, textRect);
            return;
        }
        Color color;
        if (this.tabPane.isEnabled() && this.tabPane.isEnabledAt(tabIndex)) {
            color = this.tabPane.getForegroundAt(tabIndex);
            if (isSelected && color instanceof UIResource && this.selectedForeground != null) {
                color = this.selectedForeground;
            }
        }
        else {
            color = this.disabledForeground;
        }
        final int mnemIndex = FlatLaf.isShowMnemonics() ? this.tabPane.getDisplayedMnemonicIndexAt(tabIndex) : -1;
        g.setColor(color);
        FlatUIUtils.drawStringUnderlineCharAt(this.tabPane, g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent());
    }
    
    @Override
    protected void paintTabBackground(final Graphics g, final int tabPlacement, final int tabIndex, final int x, final int y, final int w, final int h, final boolean isSelected) {
        final boolean enabled = this.tabPane.isEnabled();
        g.setColor((enabled && this.tabPane.isEnabledAt(tabIndex) && this.getRolloverTab() == tabIndex) ? this.hoverColor : ((enabled && isSelected && FlatUIUtils.isPermanentFocusOwner(this.tabPane)) ? this.focusColor : ((this.selectedBackground != null && enabled && isSelected) ? this.selectedBackground : this.tabPane.getBackgroundAt(tabIndex))));
        g.fillRect(x, y, w, h);
    }
    
    @Override
    protected void paintTabBorder(final Graphics g, final int tabPlacement, final int tabIndex, final int x, final int y, final int w, final int h, final boolean isSelected) {
        if (FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.showTabSeparators", this.showTabSeparators) && !this.isLastInRun(tabIndex)) {
            this.paintTabSeparator(g, tabPlacement, x, y, w, h);
        }
        if (isSelected) {
            this.paintTabSelection(g, tabPlacement, x, y, w, h);
        }
    }
    
    protected void paintTabSeparator(final Graphics g, final int tabPlacement, final int x, final int y, final int w, final int h) {
        final float sepWidth = UIScale.scale(1.0f);
        final float offset = this.tabSeparatorsFullHeight ? 0.0f : UIScale.scale(5.0f);
        g.setColor((this.tabSeparatorColor != null) ? this.tabSeparatorColor : this.contentAreaColor);
        if (tabPlacement == 2 || tabPlacement == 4) {
            ((Graphics2D)g).fill(new Rectangle2D.Float(x + offset, y + h - sepWidth, w - offset * 2.0f, sepWidth));
        }
        else if (this.tabPane.getComponentOrientation().isLeftToRight()) {
            ((Graphics2D)g).fill(new Rectangle2D.Float(x + w - sepWidth, y + offset, sepWidth, h - offset * 2.0f));
        }
        else {
            ((Graphics2D)g).fill(new Rectangle2D.Float((float)x, y + offset, sepWidth, h - offset * 2.0f));
        }
    }
    
    protected void paintTabSelection(final Graphics g, final int tabPlacement, final int x, final int y, final int w, final int h) {
        final Rectangle clipBounds = this.isScrollTabLayout() ? g.getClipBounds() : null;
        if (clipBounds != null) {
            final Rectangle newClipBounds = new Rectangle(clipBounds);
            final int contentSeparatorHeight = UIScale.scale(this.contentSeparatorHeight);
            switch (tabPlacement) {
                default: {
                    final Rectangle rectangle = newClipBounds;
                    rectangle.height += contentSeparatorHeight;
                    break;
                }
                case 3: {
                    final Rectangle rectangle2 = newClipBounds;
                    rectangle2.y -= contentSeparatorHeight;
                    final Rectangle rectangle3 = newClipBounds;
                    rectangle3.height += contentSeparatorHeight;
                    break;
                }
                case 2: {
                    final Rectangle rectangle4 = newClipBounds;
                    rectangle4.width += contentSeparatorHeight;
                    break;
                }
                case 4: {
                    final Rectangle rectangle5 = newClipBounds;
                    rectangle5.x -= contentSeparatorHeight;
                    final Rectangle rectangle6 = newClipBounds;
                    rectangle6.width += contentSeparatorHeight;
                    break;
                }
            }
            g.setClip(newClipBounds);
        }
        g.setColor(this.tabPane.isEnabled() ? this.underlineColor : this.disabledUnderlineColor);
        final Insets contentInsets = this.getContentBorderInsets(tabPlacement);
        switch (tabPlacement) {
            default: {
                final int sy = y + h + contentInsets.top - this.tabSelectionHeight;
                g.fillRect(x, sy, w, this.tabSelectionHeight);
                break;
            }
            case 3: {
                g.fillRect(x, y - contentInsets.bottom, w, this.tabSelectionHeight);
                break;
            }
            case 2: {
                final int sx = x + w + contentInsets.left - this.tabSelectionHeight;
                g.fillRect(sx, y, this.tabSelectionHeight, h);
                break;
            }
            case 4: {
                g.fillRect(x - contentInsets.right, y, this.tabSelectionHeight, h);
                break;
            }
        }
        if (clipBounds != null) {
            g.setClip(clipBounds);
        }
    }
    
    @Override
    protected void paintContentBorder(final Graphics g, final int tabPlacement, final int selectedIndex) {
        if (this.tabPane.getTabCount() <= 0) {
            return;
        }
        final Insets insets = this.tabPane.getInsets();
        final Insets tabAreaInsets = this.getTabAreaInsets(tabPlacement);
        int x = insets.left;
        int y = insets.top;
        int w = this.tabPane.getWidth() - insets.right - insets.left;
        int h = this.tabPane.getHeight() - insets.top - insets.bottom;
        switch (tabPlacement) {
            case 2: {
                x += this.calculateTabAreaWidth(tabPlacement, this.runCount, this.maxTabWidth);
                if (this.tabsOverlapBorder) {
                    x -= tabAreaInsets.right;
                }
                w -= x - insets.left;
                break;
            }
            case 4: {
                w -= this.calculateTabAreaWidth(tabPlacement, this.runCount, this.maxTabWidth);
                if (this.tabsOverlapBorder) {
                    w += tabAreaInsets.left;
                    break;
                }
                break;
            }
            case 3: {
                h -= this.calculateTabAreaHeight(tabPlacement, this.runCount, this.maxTabHeight);
                if (this.tabsOverlapBorder) {
                    h += tabAreaInsets.top;
                    break;
                }
                break;
            }
            default: {
                y += this.calculateTabAreaHeight(tabPlacement, this.runCount, this.maxTabHeight);
                if (this.tabsOverlapBorder) {
                    y -= tabAreaInsets.bottom;
                }
                h -= y - insets.top;
                break;
            }
        }
        final boolean hasFullBorder = FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.hasFullBorder", this.hasFullBorder);
        final int sh = UIScale.scale(this.contentSeparatorHeight * 100);
        final Insets ci = new Insets(0, 0, 0, 0);
        BasicTabbedPaneUI.rotateInsets(hasFullBorder ? new Insets(sh, sh, sh, sh) : new Insets(sh, 0, 0, 0), ci, tabPlacement);
        g.setColor(this.contentAreaColor);
        final Path2D path = new Path2D.Float(0);
        path.append(new Rectangle2D.Float((float)x, (float)y, (float)w, (float)h), false);
        path.append(new Rectangle2D.Float(x + ci.left / 100.0f, y + ci.top / 100.0f, w - ci.left / 100.0f - ci.right / 100.0f, h - ci.top / 100.0f - ci.bottom / 100.0f), false);
        ((Graphics2D)g).fill(path);
        if (this.isScrollTabLayout() && selectedIndex >= 0) {
            final Component scrollableTabViewport = this.findComponentByClassName(this.tabPane, BasicTabbedPaneUI.class.getName() + "$ScrollableTabViewport");
            if (scrollableTabViewport != null) {
                final Rectangle tabRect = this.getTabBounds(this.tabPane, selectedIndex);
                final Shape oldClip = g.getClip();
                g.setClip(scrollableTabViewport.getBounds());
                this.paintTabSelection(g, tabPlacement, tabRect.x, tabRect.y, tabRect.width, tabRect.height);
                g.setClip(oldClip);
            }
        }
    }
    
    @Override
    protected void paintFocusIndicator(final Graphics g, final int tabPlacement, final Rectangle[] rects, final int tabIndex, final Rectangle iconRect, final Rectangle textRect, final boolean isSelected) {
    }
    
    private boolean isLastInRun(final int tabIndex) {
        final int run = this.getRunForTab(this.tabPane.getTabCount(), tabIndex);
        return this.lastTabInRun(this.tabPane.getTabCount(), run) == tabIndex;
    }
    
    private boolean isScrollTabLayout() {
        return this.tabPane.getTabLayoutPolicy() == 1;
    }
    
    private Component findComponentByClassName(final Container c, final String className) {
        for (final Component child : c.getComponents()) {
            if (className.equals(child.getClass().getName())) {
                return child;
            }
            if (child instanceof Container) {
                final Component c2 = this.findComponentByClassName((Container)child, className);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }
}
