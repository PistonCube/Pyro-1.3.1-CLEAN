// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Frame;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.Graphics;
import javax.swing.plaf.BorderUIResource;
import javax.swing.JMenuBar;
import java.awt.Insets;
import java.util.function.Function;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.beans.PropertyChangeEvent;
import javax.swing.JLayeredPane;
import java.awt.Component;
import javax.swing.LookAndFeel;
import java.awt.Color;
import java.awt.Container;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.util.SystemInfo;
import javax.swing.UIManager;
import javax.swing.plaf.UIResource;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class FlatRootPaneUI extends BasicRootPaneUI
{
    static final boolean canUseJBRCustomDecorations;
    protected JRootPane rootPane;
    protected FlatTitlePane titlePane;
    protected FlatWindowResizer windowResizer;
    private LayoutManager oldLayout;
    protected static final Integer TITLE_PANE_LAYER;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatRootPaneUI();
    }
    
    @Override
    public void installUI(final JComponent c) {
        super.installUI(c);
        this.rootPane = (JRootPane)c;
        if (this.rootPane.getWindowDecorationStyle() != 0) {
            this.installClientDecorations();
        }
        if (FlatRootPaneUI.canUseJBRCustomDecorations) {
            JBRCustomDecorations.install(this.rootPane);
        }
    }
    
    @Override
    public void uninstallUI(final JComponent c) {
        super.uninstallUI(c);
        this.uninstallClientDecorations();
        this.rootPane = null;
    }
    
    @Override
    protected void installDefaults(final JRootPane c) {
        super.installDefaults(c);
        final Container parent = c.getParent();
        if (parent instanceof JFrame || parent instanceof JDialog) {
            final Color background = parent.getBackground();
            if (background == null || background instanceof UIResource) {
                parent.setBackground(UIManager.getColor("control"));
            }
        }
        if (SystemInfo.IS_JETBRAINS_JVM && SystemInfo.IS_MAC_OS_10_14_MOJAVE) {
            final LookAndFeel laf = UIManager.getLookAndFeel();
            final boolean isDark = laf instanceof FlatLaf && ((FlatLaf)laf).isDark();
            c.putClientProperty("jetbrains.awt.windowDarkAppearance", isDark);
        }
    }
    
    protected void installClientDecorations() {
        final boolean isJBRSupported = FlatRootPaneUI.canUseJBRCustomDecorations && JBRCustomDecorations.isSupported();
        if (this.rootPane.getWindowDecorationStyle() != 0 && !isJBRSupported) {
            LookAndFeel.installBorder(this.rootPane, "RootPane.border");
        }
        else {
            LookAndFeel.uninstallBorder(this.rootPane);
        }
        this.setTitlePane(this.createTitlePane());
        this.oldLayout = this.rootPane.getLayout();
        this.rootPane.setLayout(this.createRootLayout());
        if (!isJBRSupported) {
            this.windowResizer = this.createWindowResizer();
        }
    }
    
    protected void uninstallClientDecorations() {
        LookAndFeel.uninstallBorder(this.rootPane);
        this.setTitlePane(null);
        if (this.windowResizer != null) {
            this.windowResizer.uninstall();
            this.windowResizer = null;
        }
        if (this.oldLayout != null) {
            this.rootPane.setLayout(this.oldLayout);
            this.oldLayout = null;
        }
        if (this.rootPane.getWindowDecorationStyle() == 0) {
            this.rootPane.revalidate();
            this.rootPane.repaint();
        }
    }
    
    protected FlatRootLayout createRootLayout() {
        return new FlatRootLayout();
    }
    
    protected FlatWindowResizer createWindowResizer() {
        return new FlatWindowResizer(this.rootPane);
    }
    
    protected FlatTitlePane createTitlePane() {
        return new FlatTitlePane(this.rootPane);
    }
    
    protected void setTitlePane(final FlatTitlePane newTitlePane) {
        final JLayeredPane layeredPane = this.rootPane.getLayeredPane();
        if (this.titlePane != null) {
            layeredPane.remove(this.titlePane);
        }
        if (newTitlePane != null) {
            layeredPane.add(newTitlePane, FlatRootPaneUI.TITLE_PANE_LAYER);
        }
        this.titlePane = newTitlePane;
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent e) {
        super.propertyChange(e);
        final String propertyName = e.getPropertyName();
        switch (propertyName) {
            case "windowDecorationStyle": {
                this.uninstallClientDecorations();
                if (this.rootPane.getWindowDecorationStyle() != 0) {
                    this.installClientDecorations();
                    break;
                }
                break;
            }
            case "JRootPane.menuBarEmbedded": {
                if (this.titlePane != null) {
                    this.titlePane.menuBarChanged();
                    this.rootPane.revalidate();
                    this.rootPane.repaint();
                    break;
                }
                break;
            }
        }
    }
    
    static {
        canUseJBRCustomDecorations = (SystemInfo.IS_JETBRAINS_JVM_11_OR_LATER && SystemInfo.IS_WINDOWS_10_OR_LATER);
        TITLE_PANE_LAYER = JLayeredPane.FRAME_CONTENT_LAYER - 1;
    }
    
    protected class FlatRootLayout implements LayoutManager2
    {
        @Override
        public void addLayoutComponent(final String name, final Component comp) {
        }
        
        @Override
        public void addLayoutComponent(final Component comp, final Object constraints) {
        }
        
        @Override
        public void removeLayoutComponent(final Component comp) {
        }
        
        @Override
        public Dimension preferredLayoutSize(final Container parent) {
            return this.computeLayoutSize(parent, c -> c.getPreferredSize());
        }
        
        @Override
        public Dimension minimumLayoutSize(final Container parent) {
            return this.computeLayoutSize(parent, c -> c.getMinimumSize());
        }
        
        @Override
        public Dimension maximumLayoutSize(final Container parent) {
            return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        
        private Dimension computeLayoutSize(final Container parent, final Function<Component, Dimension> getSizeFunc) {
            final JRootPane rootPane = (JRootPane)parent;
            final Dimension titlePaneSize = (FlatRootPaneUI.this.titlePane != null) ? getSizeFunc.apply(FlatRootPaneUI.this.titlePane) : new Dimension();
            final Dimension contentSize = (rootPane.getContentPane() != null) ? getSizeFunc.apply(rootPane.getContentPane()) : rootPane.getSize();
            int width = Math.max(titlePaneSize.width, contentSize.width);
            int height = titlePaneSize.height + contentSize.height;
            if (FlatRootPaneUI.this.titlePane == null || !FlatRootPaneUI.this.titlePane.isMenuBarEmbedded()) {
                final Dimension menuBarSize = (rootPane.getJMenuBar() != null) ? getSizeFunc.apply(rootPane.getJMenuBar()) : new Dimension();
                width = Math.max(width, menuBarSize.width);
                height += menuBarSize.height;
            }
            final Insets insets = rootPane.getInsets();
            return new Dimension(width + insets.left + insets.right, height + insets.top + insets.bottom);
        }
        
        @Override
        public void layoutContainer(final Container parent) {
            final JRootPane rootPane = (JRootPane)parent;
            final Insets insets = rootPane.getInsets();
            final int x = insets.left;
            final int y = insets.top;
            final int width = rootPane.getWidth() - insets.left - insets.right;
            final int height = rootPane.getHeight() - insets.top - insets.bottom;
            if (rootPane.getLayeredPane() != null) {
                rootPane.getLayeredPane().setBounds(x, y, width, height);
            }
            if (rootPane.getGlassPane() != null) {
                rootPane.getGlassPane().setBounds(x, y, width, height);
            }
            int nextY = 0;
            if (FlatRootPaneUI.this.titlePane != null) {
                final Dimension prefSize = FlatRootPaneUI.this.titlePane.getPreferredSize();
                FlatRootPaneUI.this.titlePane.setBounds(0, 0, width, prefSize.height);
                nextY += prefSize.height;
            }
            final JMenuBar menuBar = rootPane.getJMenuBar();
            if (menuBar != null) {
                if (FlatRootPaneUI.this.titlePane != null && FlatRootPaneUI.this.titlePane.isMenuBarEmbedded()) {
                    FlatRootPaneUI.this.titlePane.validate();
                    menuBar.setBounds(FlatRootPaneUI.this.titlePane.getMenuBarBounds());
                }
                else {
                    final Dimension prefSize2 = menuBar.getPreferredSize();
                    menuBar.setBounds(0, nextY, width, prefSize2.height);
                    nextY += prefSize2.height;
                }
            }
            final Container contentPane = rootPane.getContentPane();
            if (contentPane != null) {
                contentPane.setBounds(0, nextY, width, Math.max(height - nextY, 0));
            }
        }
        
        @Override
        public void invalidateLayout(final Container parent) {
            if (FlatRootPaneUI.this.titlePane != null) {
                FlatRootPaneUI.this.titlePane.menuBarChanged();
            }
        }
        
        @Override
        public float getLayoutAlignmentX(final Container target) {
            return 0.0f;
        }
        
        @Override
        public float getLayoutAlignmentY(final Container target) {
            return 0.0f;
        }
    }
    
    public static class FlatWindowBorder extends BorderUIResource.EmptyBorderUIResource
    {
        protected final Color activeBorderColor;
        protected final Color inactiveBorderColor;
        protected final Color baseBorderColor;
        
        public FlatWindowBorder() {
            super(1, 1, 1, 1);
            this.activeBorderColor = UIManager.getColor("RootPane.activeBorderColor");
            this.inactiveBorderColor = UIManager.getColor("RootPane.inactiveBorderColor");
            this.baseBorderColor = UIManager.getColor("Panel.background");
        }
        
        @Override
        public Insets getBorderInsets(final Component c, final Insets insets) {
            if (this.isWindowMaximized(c)) {
                final int n = 0;
                insets.right = n;
                insets.bottom = n;
                insets.left = n;
                insets.top = n;
                return insets;
            }
            return super.getBorderInsets(c, insets);
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            if (this.isWindowMaximized(c)) {
                return;
            }
            final Container parent = c.getParent();
            final boolean active = parent instanceof Window && ((Window)parent).isActive();
            g.setColor(FlatUIUtils.deriveColor(active ? this.activeBorderColor : this.inactiveBorderColor, this.baseBorderColor));
            HiDPIUtils.paintAtScale1x((Graphics2D)g, x, y, width, height, this::paintImpl);
        }
        
        private void paintImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
            g.drawRect(x, y, width - 1, height - 1);
        }
        
        protected boolean isWindowMaximized(final Component c) {
            final Container parent = c.getParent();
            return parent instanceof Frame && (((Frame)parent).getExtendedState() & 0x6) != 0x0;
        }
    }
}
