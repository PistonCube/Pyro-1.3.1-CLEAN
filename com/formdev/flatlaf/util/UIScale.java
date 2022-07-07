// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import javax.swing.plaf.InsetsUIResource;
import java.awt.Insets;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.UIResource;
import java.awt.Dimension;
import javax.swing.plaf.FontUIResource;
import com.formdev.flatlaf.FlatSystemProperties;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import java.beans.PropertyChangeEvent;
import java.awt.GraphicsConfiguration;
import java.awt.Graphics2D;
import java.lang.reflect.Method;
import java.awt.GraphicsEnvironment;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class UIScale
{
    private static final boolean DEBUG = false;
    private static PropertyChangeSupport changeSupport;
    private static Boolean jreHiDPI;
    private static float scaleFactor;
    private static boolean initialized;
    
    public static void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (UIScale.changeSupport == null) {
            UIScale.changeSupport = new PropertyChangeSupport(UIScale.class);
        }
        UIScale.changeSupport.addPropertyChangeListener(listener);
    }
    
    public static void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (UIScale.changeSupport == null) {
            return;
        }
        UIScale.changeSupport.removePropertyChangeListener(listener);
    }
    
    public static boolean isSystemScalingEnabled() {
        if (UIScale.jreHiDPI != null) {
            return UIScale.jreHiDPI;
        }
        UIScale.jreHiDPI = false;
        if (SystemInfo.IS_JAVA_9_OR_LATER) {
            UIScale.jreHiDPI = true;
        }
        else if (SystemInfo.IS_JETBRAINS_JVM) {
            try {
                final GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                final Class<?> sunGeClass = Class.forName("sun.java2d.SunGraphicsEnvironment");
                if (sunGeClass.isInstance(ge)) {
                    final Method m = sunGeClass.getDeclaredMethod("isUIScaleOn", (Class<?>[])new Class[0]);
                    UIScale.jreHiDPI = (Boolean)m.invoke(ge, new Object[0]);
                }
            }
            catch (Throwable t) {}
        }
        return UIScale.jreHiDPI;
    }
    
    public static double getSystemScaleFactor(final Graphics2D g) {
        return isSystemScalingEnabled() ? g.getDeviceConfiguration().getDefaultTransform().getScaleX() : 1.0;
    }
    
    public static double getSystemScaleFactor(final GraphicsConfiguration gc) {
        return (isSystemScalingEnabled() && gc != null) ? gc.getDefaultTransform().getScaleX() : 1.0;
    }
    
    private static void initialize() {
        if (UIScale.initialized) {
            return;
        }
        UIScale.initialized = true;
        if (!isUserScalingEnabled()) {
            return;
        }
        final PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                final String propertyName = e.getPropertyName();
                switch (propertyName) {
                    case "lookAndFeel": {
                        if (e.getNewValue() instanceof LookAndFeel) {
                            UIManager.getLookAndFeelDefaults().addPropertyChangeListener(this);
                        }
                        updateScaleFactor();
                        break;
                    }
                    case "defaultFont":
                    case "Label.font": {
                        updateScaleFactor();
                        break;
                    }
                }
            }
        };
        UIManager.addPropertyChangeListener(listener);
        UIManager.getDefaults().addPropertyChangeListener(listener);
        UIManager.getLookAndFeelDefaults().addPropertyChangeListener(listener);
        updateScaleFactor();
    }
    
    private static void updateScaleFactor() {
        if (!isUserScalingEnabled()) {
            return;
        }
        Font font = UIManager.getFont("defaultFont");
        if (font == null) {
            font = UIManager.getFont("Label.font");
        }
        setUserScaleFactor(computeScaleFactor(font));
    }
    
    private static float computeScaleFactor(final Font font) {
        float fontSizeDivider = 12.0f;
        if (SystemInfo.IS_WINDOWS) {
            if ("Tahoma".equals(font.getFamily())) {
                fontSizeDivider = 11.0f;
            }
        }
        else if (SystemInfo.IS_MAC) {
            fontSizeDivider = 13.0f;
        }
        else if (SystemInfo.IS_LINUX) {
            fontSizeDivider = (SystemInfo.IS_KDE ? 13.0f : 15.0f);
        }
        return font.getSize() / fontSizeDivider;
    }
    
    private static boolean isUserScalingEnabled() {
        return FlatSystemProperties.getBoolean("hidpi", true);
    }
    
    public static FontUIResource applyCustomScaleFactor(final FontUIResource font) {
        final String uiScale = System.getProperty("flatlaf.uiScale");
        final float scaleFactor = parseScaleFactor(uiScale);
        if (scaleFactor <= 0.0f) {
            return font;
        }
        final float fontScaleFactor = computeScaleFactor(font);
        if (scaleFactor == fontScaleFactor) {
            return font;
        }
        final int newFontSize = Math.round(font.getSize() / fontScaleFactor * scaleFactor);
        return new FontUIResource(font.deriveFont((float)newFontSize));
    }
    
    private static float parseScaleFactor(String s) {
        if (s == null) {
            return -1.0f;
        }
        float units = 1.0f;
        if (s.endsWith("x")) {
            s = s.substring(0, s.length() - 1);
        }
        else if (s.endsWith("dpi")) {
            units = 96.0f;
            s = s.substring(0, s.length() - 3);
        }
        else if (s.endsWith("%")) {
            units = 100.0f;
            s = s.substring(0, s.length() - 1);
        }
        try {
            final float scale = Float.parseFloat(s);
            return (scale > 0.0f) ? (scale / units) : -1.0f;
        }
        catch (NumberFormatException ex) {
            return -1.0f;
        }
    }
    
    public static float getUserScaleFactor() {
        initialize();
        return UIScale.scaleFactor;
    }
    
    private static void setUserScaleFactor(float scaleFactor) {
        if (scaleFactor <= 1.0f) {
            scaleFactor = 1.0f;
        }
        else {
            scaleFactor = Math.round(scaleFactor * 4.0f) / 4.0f;
        }
        final float oldScaleFactor = UIScale.scaleFactor;
        UIScale.scaleFactor = scaleFactor;
        if (UIScale.changeSupport != null) {
            UIScale.changeSupport.firePropertyChange("userScaleFactor", oldScaleFactor, scaleFactor);
        }
    }
    
    public static float scale(final float value) {
        initialize();
        return (UIScale.scaleFactor == 1.0f) ? value : (value * UIScale.scaleFactor);
    }
    
    public static int scale(final int value) {
        initialize();
        return (UIScale.scaleFactor == 1.0f) ? value : Math.round(value * UIScale.scaleFactor);
    }
    
    public static int scale2(final int value) {
        initialize();
        return (UIScale.scaleFactor == 1.0f) ? value : ((int)(value * UIScale.scaleFactor));
    }
    
    public static float unscale(final float value) {
        initialize();
        return (UIScale.scaleFactor == 1.0f) ? value : (value / UIScale.scaleFactor);
    }
    
    public static int unscale(final int value) {
        initialize();
        return (UIScale.scaleFactor == 1.0f) ? value : Math.round(value / UIScale.scaleFactor);
    }
    
    public static void scaleGraphics(final Graphics2D g) {
        initialize();
        if (UIScale.scaleFactor != 1.0f) {
            g.scale(UIScale.scaleFactor, UIScale.scaleFactor);
        }
    }
    
    public static Dimension scale(final Dimension dimension) {
        initialize();
        return (dimension == null || UIScale.scaleFactor == 1.0f) ? dimension : ((dimension instanceof UIResource) ? new DimensionUIResource(scale(dimension.width), scale(dimension.height)) : new Dimension(scale(dimension.width), scale(dimension.height)));
    }
    
    public static Insets scale(final Insets insets) {
        initialize();
        return (insets == null || UIScale.scaleFactor == 1.0f) ? insets : ((insets instanceof UIResource) ? new InsetsUIResource(scale(insets.top), scale(insets.left), scale(insets.bottom), scale(insets.right)) : new Insets(scale(insets.top), scale(insets.left), scale(insets.bottom), scale(insets.right)));
    }
    
    static {
        UIScale.scaleFactor = 1.0f;
    }
}
