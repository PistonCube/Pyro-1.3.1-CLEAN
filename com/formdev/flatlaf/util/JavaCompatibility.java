// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.formdev.flatlaf.FlatLaf;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.lang.reflect.Method;

public class JavaCompatibility
{
    private static Method drawStringUnderlineCharAtMethod;
    
    public static void drawStringUnderlineCharAt(final JComponent c, final Graphics g, final String text, final int underlinedIndex, final int x, final int y) {
        synchronized (JavaCompatibility.class) {
            if (JavaCompatibility.drawStringUnderlineCharAtMethod == null) {
                try {
                    final Class<?> cls = Class.forName(SystemInfo.IS_JAVA_9_OR_LATER ? "javax.swing.plaf.basic.BasicGraphicsUtils" : "sun.swing.SwingUtilities2");
                    JavaCompatibility.drawStringUnderlineCharAtMethod = cls.getMethod("drawStringUnderlineCharAt", (Class<?>[])(SystemInfo.IS_JAVA_9_OR_LATER ? new Class[] { JComponent.class, Graphics2D.class, String.class, Integer.TYPE, Float.TYPE, Float.TYPE } : new Class[] { JComponent.class, Graphics.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE }));
                }
                catch (Exception ex) {
                    Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex);
                    throw new RuntimeException(ex);
                }
            }
        }
        try {
            if (SystemInfo.IS_JAVA_9_OR_LATER) {
                JavaCompatibility.drawStringUnderlineCharAtMethod.invoke(null, c, g, text, underlinedIndex, Float.valueOf(x), Float.valueOf(y));
            }
            else {
                JavaCompatibility.drawStringUnderlineCharAtMethod.invoke(null, c, g, text, underlinedIndex, x, y);
            }
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex4) {
            final Exception ex3;
            final Exception ex2 = ex3;
            Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex2);
            throw new RuntimeException(ex2);
        }
    }
}
