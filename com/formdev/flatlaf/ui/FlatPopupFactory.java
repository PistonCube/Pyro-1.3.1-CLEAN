// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Rectangle;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import javax.swing.JLayeredPane;
import javax.swing.RootPaneContainer;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ComponentListener;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.border.Border;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.UIManager;
import com.formdev.flatlaf.util.SystemInfo;
import javax.swing.Popup;
import java.awt.Component;
import java.lang.reflect.Method;
import javax.swing.PopupFactory;

public class FlatPopupFactory extends PopupFactory
{
    private Method java8getPopupMethod;
    private Method java9getPopupMethod;
    
    @Override
    public Popup getPopup(final Component owner, final Component contents, final int x, final int y) throws IllegalArgumentException {
        if (!this.isDropShadowPainted(owner, contents)) {
            return new NonFlashingPopup(super.getPopup(owner, contents, x, y), contents);
        }
        if (SystemInfo.IS_MAC || SystemInfo.IS_LINUX) {
            Popup popup = this.getHeavyWeightPopup(owner, contents, x, y);
            if (popup == null) {
                popup = super.getPopup(owner, contents, x, y);
            }
            return new NonFlashingPopup(popup, contents);
        }
        return new DropShadowPopup(super.getPopup(owner, contents, x, y), owner, contents);
    }
    
    private boolean isDropShadowPainted(final Component owner, final Component contents) {
        Boolean b = this.isDropShadowPainted(owner);
        if (b != null) {
            return b;
        }
        b = this.isDropShadowPainted(contents);
        if (b != null) {
            return b;
        }
        return UIManager.getBoolean("Popup.dropShadowPainted");
    }
    
    private Boolean isDropShadowPainted(final Component c) {
        if (!(c instanceof JComponent)) {
            return null;
        }
        final Object value = ((JComponent)c).getClientProperty("Popup.dropShadowPainted");
        return (value instanceof Boolean) ? ((Boolean)value) : null;
    }
    
    private Popup getHeavyWeightPopup(final Component owner, final Component contents, final int x, final int y) throws IllegalArgumentException {
        try {
            if (SystemInfo.IS_JAVA_9_OR_LATER) {
                if (this.java9getPopupMethod == null) {
                    this.java9getPopupMethod = PopupFactory.class.getDeclaredMethod("getPopup", Component.class, Component.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE);
                }
                return (Popup)this.java9getPopupMethod.invoke(this, owner, contents, x, y, true);
            }
            try {
                if (this.java8getPopupMethod == null) {
                    (this.java8getPopupMethod = PopupFactory.class.getDeclaredMethod("getPopup", Component.class, Component.class, Integer.TYPE, Integer.TYPE, Integer.TYPE)).setAccessible(true);
                }
                return (Popup)this.java8getPopupMethod.invoke(this, owner, contents, x, y, 2);
            }
            catch (SecurityException | IllegalAccessException ex3) {
                final Exception ex2;
                final Exception ex = ex2;
                return null;
            }
        }
        catch (NoSuchMethodException ex4) {}
        catch (SecurityException ex5) {}
        catch (IllegalAccessException ex6) {}
        catch (InvocationTargetException ex7) {}
    }
    
    private class NonFlashingPopup extends Popup
    {
        private Popup delegate;
        protected Window popupWindow;
        private Color oldPopupWindowBackground;
        
        NonFlashingPopup(final Popup delegate, final Component contents) {
            this.delegate = delegate;
            this.popupWindow = SwingUtilities.windowForComponent(contents);
            if (this.popupWindow != null) {
                this.oldPopupWindowBackground = this.popupWindow.getBackground();
                this.popupWindow.setBackground(contents.getBackground());
            }
        }
        
        @Override
        public void show() {
            if (this.delegate != null) {
                this.delegate.show();
            }
        }
        
        @Override
        public void hide() {
            if (this.delegate != null) {
                this.delegate.hide();
                this.delegate = null;
            }
            if (this.popupWindow != null) {
                this.popupWindow.setBackground(this.oldPopupWindowBackground);
                this.popupWindow = null;
            }
        }
    }
    
    private class DropShadowPopup extends NonFlashingPopup
    {
        private final Component owner;
        private JComponent lightComp;
        private Border oldBorder;
        private boolean oldOpaque;
        private boolean mediumWeightShown;
        private Panel mediumWeightPanel;
        private JPanel dropShadowPanel;
        private ComponentListener mediumPanelListener;
        private Popup dropShadowDelegate;
        private Window dropShadowWindow;
        private Color oldDropShadowWindowBackground;
        
        DropShadowPopup(final Popup delegate, final Component owner, final Component contents) {
            super(delegate, contents);
            this.owner = owner;
            final Dimension size = contents.getPreferredSize();
            if (size.width <= 0 || size.height <= 0) {
                return;
            }
            if (this.popupWindow != null) {
                final JPanel dropShadowPanel = new JPanel();
                dropShadowPanel.setBorder(this.createDropShadowBorder());
                dropShadowPanel.setOpaque(false);
                final Dimension prefSize = this.popupWindow.getPreferredSize();
                final Insets insets = dropShadowPanel.getInsets();
                dropShadowPanel.setPreferredSize(new Dimension(prefSize.width + insets.left + insets.right, prefSize.height + insets.top + insets.bottom));
                final int x = this.popupWindow.getX() - insets.left;
                final int y = this.popupWindow.getY() - insets.top;
                this.dropShadowDelegate = FlatPopupFactory.this.getHeavyWeightPopup(owner, dropShadowPanel, x, y);
                this.dropShadowWindow = SwingUtilities.windowForComponent(dropShadowPanel);
                if (this.dropShadowWindow != null) {
                    this.oldDropShadowWindowBackground = this.dropShadowWindow.getBackground();
                    this.dropShadowWindow.setBackground(new Color(0, true));
                }
            }
            else {
                this.mediumWeightPanel = (Panel)SwingUtilities.getAncestorOfClass(Panel.class, contents);
                if (this.mediumWeightPanel != null) {
                    (this.dropShadowPanel = new JPanel()).setBorder(this.createDropShadowBorder());
                    this.dropShadowPanel.setOpaque(false);
                    this.dropShadowPanel.setSize(FlatUIUtils.addInsets(this.mediumWeightPanel.getSize(), this.dropShadowPanel.getInsets()));
                }
                else {
                    final Container p = contents.getParent();
                    if (!(p instanceof JComponent)) {
                        return;
                    }
                    this.lightComp = (JComponent)p;
                    this.oldBorder = this.lightComp.getBorder();
                    this.oldOpaque = this.lightComp.isOpaque();
                    this.lightComp.setBorder(this.createDropShadowBorder());
                    this.lightComp.setOpaque(false);
                    this.lightComp.setSize(this.lightComp.getPreferredSize());
                }
            }
        }
        
        private Border createDropShadowBorder() {
            return new FlatDropShadowBorder(UIManager.getColor("Popup.dropShadowColor"), UIManager.getInsets("Popup.dropShadowInsets"), FlatUIUtils.getUIFloat("Popup.dropShadowOpacity", 0.5f));
        }
        
        @Override
        public void show() {
            if (this.dropShadowDelegate != null) {
                this.dropShadowDelegate.show();
            }
            if (this.mediumWeightPanel != null) {
                this.showMediumWeightDropShadow();
            }
            super.show();
            if (this.lightComp != null) {
                final Insets insets = this.lightComp.getInsets();
                if (insets.left != 0 || insets.top != 0) {
                    this.lightComp.setLocation(this.lightComp.getX() - insets.left, this.lightComp.getY() - insets.top);
                }
            }
        }
        
        @Override
        public void hide() {
            if (this.dropShadowDelegate != null) {
                this.dropShadowDelegate.hide();
                this.dropShadowDelegate = null;
            }
            if (this.mediumWeightPanel != null) {
                this.hideMediumWeightDropShadow();
                this.dropShadowPanel = null;
                this.mediumWeightPanel = null;
            }
            super.hide();
            if (this.dropShadowWindow != null) {
                this.dropShadowWindow.setBackground(this.oldDropShadowWindowBackground);
                this.dropShadowWindow = null;
            }
            if (this.lightComp != null) {
                this.lightComp.setBorder(this.oldBorder);
                this.lightComp.setOpaque(this.oldOpaque);
                this.lightComp = null;
            }
        }
        
        private void showMediumWeightDropShadow() {
            if (this.mediumWeightShown) {
                return;
            }
            this.mediumWeightShown = true;
            final Window window = SwingUtilities.windowForComponent(this.owner);
            if (window == null) {
                return;
            }
            if (!(window instanceof RootPaneContainer)) {
                return;
            }
            this.dropShadowPanel.setVisible(false);
            final JLayeredPane layeredPane = ((RootPaneContainer)window).getLayeredPane();
            layeredPane.add(this.dropShadowPanel, JLayeredPane.POPUP_LAYER, 0);
            this.mediumPanelListener = new ComponentListener() {
                @Override
                public void componentShown(final ComponentEvent e) {
                    if (DropShadowPopup.this.dropShadowPanel != null) {
                        DropShadowPopup.this.dropShadowPanel.setVisible(true);
                    }
                }
                
                @Override
                public void componentHidden(final ComponentEvent e) {
                    if (DropShadowPopup.this.dropShadowPanel != null) {
                        DropShadowPopup.this.dropShadowPanel.setVisible(false);
                    }
                }
                
                @Override
                public void componentMoved(final ComponentEvent e) {
                    if (DropShadowPopup.this.dropShadowPanel != null && DropShadowPopup.this.mediumWeightPanel != null) {
                        final Point location = DropShadowPopup.this.mediumWeightPanel.getLocation();
                        final Insets insets = DropShadowPopup.this.dropShadowPanel.getInsets();
                        DropShadowPopup.this.dropShadowPanel.setLocation(location.x - insets.left, location.y - insets.top);
                    }
                }
                
                @Override
                public void componentResized(final ComponentEvent e) {
                    if (DropShadowPopup.this.dropShadowPanel != null) {
                        DropShadowPopup.this.dropShadowPanel.setSize(FlatUIUtils.addInsets(DropShadowPopup.this.mediumWeightPanel.getSize(), DropShadowPopup.this.dropShadowPanel.getInsets()));
                    }
                }
            };
            this.mediumWeightPanel.addComponentListener(this.mediumPanelListener);
        }
        
        private void hideMediumWeightDropShadow() {
            this.mediumWeightPanel.removeComponentListener(this.mediumPanelListener);
            final Container parent = this.dropShadowPanel.getParent();
            if (parent != null) {
                final Rectangle bounds = this.dropShadowPanel.getBounds();
                parent.remove(this.dropShadowPanel);
                parent.repaint(bounds.x, bounds.y, bounds.width, bounds.height);
            }
        }
    }
}
