// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import javax.swing.SwingUtilities;
import java.awt.Graphics;
import java.beans.PropertyChangeListener;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.plaf.BorderUIResource;
import java.awt.Component;
import com.formdev.flatlaf.util.SystemInfo;
import java.awt.Rectangle;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.formdev.flatlaf.FlatLaf;
import javax.swing.JDialog;
import com.formdev.flatlaf.FlatSystemProperties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JRootPane;
import java.lang.reflect.Method;

public class JBRCustomDecorations
{
    private static boolean initialized;
    private static Method Window_hasCustomDecoration;
    private static Method Window_setHasCustomDecoration;
    private static Method WWindowPeer_setCustomDecorationHitTestSpots;
    private static Method WWindowPeer_setCustomDecorationTitleBarHeight;
    private static Method AWTAccessor_getComponentAccessor;
    private static Method AWTAccessor_ComponentAccessor_getPeer;
    
    public static boolean isSupported() {
        initialize();
        return JBRCustomDecorations.Window_setHasCustomDecoration != null;
    }
    
    static void install(final JRootPane rootPane) {
        if (!isSupported()) {
            return;
        }
        if (rootPane.getParent() != null) {
            return;
        }
        final HierarchyListener addListener = new HierarchyListener() {
            @Override
            public void hierarchyChanged(final HierarchyEvent e) {
                if (e.getChanged() != rootPane || (e.getChangeFlags() & 0x1L) == 0x0L) {
                    return;
                }
                final Container parent = e.getChangedParent();
                if (parent instanceof Window) {
                    JBRCustomDecorations.install((Window)parent);
                }
                EventQueue.invokeLater(() -> rootPane.removeHierarchyListener(this));
            }
        };
        rootPane.addHierarchyListener(addListener);
    }
    
    static void install(final Window window) {
        if (!isSupported()) {
            return;
        }
        if (UIManager.getLookAndFeel().getSupportsWindowDecorations()) {
            return;
        }
        if (window instanceof JFrame) {
            final JFrame frame = (JFrame)window;
            if (!JFrame.isDefaultLookAndFeelDecorated() && !FlatSystemProperties.getBoolean("flatlaf.useJetBrainsCustomDecorations", false)) {
                return;
            }
            if (frame.isUndecorated()) {
                return;
            }
            setHasCustomDecoration(frame);
            frame.getRootPane().setWindowDecorationStyle(1);
        }
        else if (window instanceof JDialog) {
            final JDialog dialog = (JDialog)window;
            if (!JDialog.isDefaultLookAndFeelDecorated() && !FlatSystemProperties.getBoolean("flatlaf.useJetBrainsCustomDecorations", false)) {
                return;
            }
            if (dialog.isUndecorated()) {
                return;
            }
            setHasCustomDecoration(dialog);
            dialog.getRootPane().setWindowDecorationStyle(2);
        }
    }
    
    static boolean hasCustomDecoration(final Window window) {
        if (!isSupported()) {
            return false;
        }
        try {
            return (boolean)JBRCustomDecorations.Window_hasCustomDecoration.invoke(window, new Object[0]);
        }
        catch (Exception ex) {
            Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    static void setHasCustomDecoration(final Window window) {
        if (!isSupported()) {
            return;
        }
        try {
            JBRCustomDecorations.Window_setHasCustomDecoration.invoke(window, new Object[0]);
        }
        catch (Exception ex) {
            Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void setHitTestSpotsAndTitleBarHeight(final Window window, final List<Rectangle> hitTestSpots, final int titleBarHeight) {
        if (!isSupported()) {
            return;
        }
        try {
            final Object compAccessor = JBRCustomDecorations.AWTAccessor_getComponentAccessor.invoke(null, new Object[0]);
            final Object peer = JBRCustomDecorations.AWTAccessor_ComponentAccessor_getPeer.invoke(compAccessor, window);
            JBRCustomDecorations.WWindowPeer_setCustomDecorationHitTestSpots.invoke(peer, hitTestSpots);
            JBRCustomDecorations.WWindowPeer_setCustomDecorationTitleBarHeight.invoke(peer, titleBarHeight);
        }
        catch (Exception ex) {
            Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void initialize() {
        if (JBRCustomDecorations.initialized) {
            return;
        }
        JBRCustomDecorations.initialized = true;
        if (!SystemInfo.IS_JETBRAINS_JVM_11_OR_LATER || !SystemInfo.IS_WINDOWS_10_OR_LATER) {
            return;
        }
        if (!FlatSystemProperties.getBoolean("flatlaf.useJetBrainsCustomDecorations", true)) {
            return;
        }
        try {
            final Class<?> awtAcessorClass = Class.forName("sun.awt.AWTAccessor");
            final Class<?> compAccessorClass = Class.forName("sun.awt.AWTAccessor$ComponentAccessor");
            JBRCustomDecorations.AWTAccessor_getComponentAccessor = awtAcessorClass.getDeclaredMethod("getComponentAccessor", (Class<?>[])new Class[0]);
            JBRCustomDecorations.AWTAccessor_ComponentAccessor_getPeer = compAccessorClass.getDeclaredMethod("getPeer", Component.class);
            final Class<?> peerClass = Class.forName("sun.awt.windows.WWindowPeer");
            JBRCustomDecorations.WWindowPeer_setCustomDecorationHitTestSpots = peerClass.getDeclaredMethod("setCustomDecorationHitTestSpots", List.class);
            JBRCustomDecorations.WWindowPeer_setCustomDecorationTitleBarHeight = peerClass.getDeclaredMethod("setCustomDecorationTitleBarHeight", Integer.TYPE);
            JBRCustomDecorations.WWindowPeer_setCustomDecorationHitTestSpots.setAccessible(true);
            JBRCustomDecorations.WWindowPeer_setCustomDecorationTitleBarHeight.setAccessible(true);
            JBRCustomDecorations.Window_hasCustomDecoration = Window.class.getDeclaredMethod("hasCustomDecoration", (Class<?>[])new Class[0]);
            JBRCustomDecorations.Window_setHasCustomDecoration = Window.class.getDeclaredMethod("setHasCustomDecoration", (Class<?>[])new Class[0]);
            JBRCustomDecorations.Window_hasCustomDecoration.setAccessible(true);
            JBRCustomDecorations.Window_setHasCustomDecoration.setAccessible(true);
        }
        catch (Exception ex) {}
    }
    
    static class JBRWindowTopBorder extends BorderUIResource.EmptyBorderUIResource
    {
        private static JBRWindowTopBorder instance;
        private final Color defaultActiveBorder;
        private final Color inactiveLightColor;
        private final Color inactiveDarkColor;
        private boolean colorizationAffectsBorders;
        private Color activeColor;
        
        static JBRWindowTopBorder getInstance() {
            if (JBRWindowTopBorder.instance == null) {
                JBRWindowTopBorder.instance = new JBRWindowTopBorder();
            }
            return JBRWindowTopBorder.instance;
        }
        
        private JBRWindowTopBorder() {
            super(1, 0, 0, 0);
            this.defaultActiveBorder = new Color(7368816);
            this.inactiveLightColor = new Color(11184810);
            this.inactiveDarkColor = new Color(4144959);
            this.activeColor = this.defaultActiveBorder;
            this.colorizationAffectsBorders = this.calculateAffectsBorders();
            this.activeColor = this.calculateActiveBorderColor();
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.addPropertyChangeListener("win.dwm.colorizationColor.affects.borders", e -> {
                this.colorizationAffectsBorders = this.calculateAffectsBorders();
                this.activeColor = this.calculateActiveBorderColor();
                return;
            });
            final PropertyChangeListener l = e -> this.activeColor = this.calculateActiveBorderColor();
            toolkit.addPropertyChangeListener("win.dwm.colorizationColor", l);
            toolkit.addPropertyChangeListener("win.dwm.colorizationColorBalance", l);
            toolkit.addPropertyChangeListener("win.frame.activeBorderColor", l);
        }
        
        private boolean calculateAffectsBorders() {
            final Object value = Toolkit.getDefaultToolkit().getDesktopProperty("win.dwm.colorizationColor.affects.borders");
            return !(value instanceof Boolean) || (boolean)value;
        }
        
        private Color calculateActiveBorderColor() {
            if (!this.colorizationAffectsBorders) {
                return this.defaultActiveBorder;
            }
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            final Color colorizationColor = (Color)toolkit.getDesktopProperty("win.dwm.colorizationColor");
            if (colorizationColor == null) {
                final Color activeBorderColor = (Color)toolkit.getDesktopProperty("win.frame.activeBorderColor");
                return (activeBorderColor != null) ? activeBorderColor : UIManager.getColor("MenuBar.borderColor");
            }
            final Object colorizationColorBalanceObj = toolkit.getDesktopProperty("win.dwm.colorizationColorBalance");
            if (!(colorizationColorBalanceObj instanceof Integer)) {
                return colorizationColor;
            }
            int colorizationColorBalance = (int)colorizationColorBalanceObj;
            if (colorizationColorBalance < 0) {
                colorizationColorBalance = 100;
            }
            if (colorizationColorBalance == 0) {
                return new Color(14277081);
            }
            if (colorizationColorBalance == 100) {
                return colorizationColor;
            }
            final float alpha = colorizationColorBalance / 100.0f;
            final float remainder = 1.0f - alpha;
            final int r = Math.round(colorizationColor.getRed() * alpha + 217.0f * remainder);
            final int g = Math.round(colorizationColor.getGreen() * alpha + 217.0f * remainder);
            final int b = Math.round(colorizationColor.getBlue() * alpha + 217.0f * remainder);
            return new Color(r, g, b);
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            final Window window = SwingUtilities.windowForComponent(c);
            final boolean active = window != null && window.isActive();
            g.setColor(active ? this.activeColor : (FlatLaf.isLafDark() ? this.inactiveDarkColor : this.inactiveLightColor));
            HiDPIUtils.paintAtScale1x((Graphics2D)g, x, y, width, height, this::paintImpl);
        }
        
        private void paintImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final double scaleFactor) {
            g.drawRect(x, y, width - 1, 0);
        }
        
        void repaintBorder(final Component c) {
            c.repaint(0, 0, c.getWidth(), 1);
        }
    }
}
