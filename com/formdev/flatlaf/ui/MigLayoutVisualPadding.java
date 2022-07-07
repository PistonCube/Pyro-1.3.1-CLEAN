// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import com.formdev.flatlaf.util.UIScale;
import java.util.function.Function;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JComponent;

public class MigLayoutVisualPadding
{
    public static String VISUAL_PADDING_PROPERTY;
    private static final FlatMigInsets ZERO;
    private static final boolean migLayoutAvailable;
    
    public static void install(final JComponent c, final Insets insets) {
        if (!MigLayoutVisualPadding.migLayoutAvailable) {
            return;
        }
        setVisualPadding(c, insets);
    }
    
    public static void install(final JComponent c) {
        if (!MigLayoutVisualPadding.migLayoutAvailable) {
            return;
        }
        final FlatBorder border;
        int focusWidth;
        install(c, c2 -> {
            border = FlatUIUtils.getOutsideFlatBorder(c2);
            if (border != null) {
                focusWidth = border.getFocusWidth(c2);
                return new Insets(focusWidth, focusWidth, focusWidth, focusWidth);
            }
            else {
                return null;
            }
        }, new String[] { "border" });
    }
    
    public static void install(final JComponent c, final Function<JComponent, Insets> getPaddingFunction, final String... propertyNames) {
        if (!MigLayoutVisualPadding.migLayoutAvailable) {
            return;
        }
        setVisualPadding(c, getPaddingFunction.apply(c));
        final String propertyName;
        final int length;
        int i = 0;
        String name;
        c.addPropertyChangeListener(e -> {
            propertyName = e.getPropertyName();
            length = propertyNames.length;
            while (i < length) {
                name = propertyNames[i];
                if (name == propertyName) {
                    setVisualPadding(c, getPaddingFunction.apply(c));
                    break;
                }
                else {
                    ++i;
                }
            }
        });
    }
    
    private static void setVisualPadding(final JComponent c, final Insets visualPadding) {
        final Object oldPadding = c.getClientProperty(MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY);
        if (oldPadding == null || oldPadding instanceof FlatMigInsets) {
            final FlatMigInsets flatVisualPadding = (visualPadding != null) ? new FlatMigInsets(UIScale.scale2(visualPadding.top), UIScale.scale2(visualPadding.left), UIScale.scale2(visualPadding.bottom), UIScale.scale2(visualPadding.right)) : MigLayoutVisualPadding.ZERO;
            c.putClientProperty(MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY, flatVisualPadding);
        }
    }
    
    public static void uninstall(final JComponent c) {
        if (!MigLayoutVisualPadding.migLayoutAvailable) {
            return;
        }
        for (final PropertyChangeListener l : c.getPropertyChangeListeners()) {
            if (l instanceof FlatMigListener) {
                c.removePropertyChangeListener(l);
                break;
            }
        }
        if (c.getClientProperty(MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY) instanceof FlatMigInsets) {
            c.putClientProperty(MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY, null);
        }
    }
    
    static {
        MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY = "visualPadding";
        ZERO = new FlatMigInsets(0, 0, 0, 0);
        boolean available = false;
        try {
            Class.forName("net.miginfocom.swing.MigLayout");
            available = true;
        }
        catch (ClassNotFoundException ex) {}
        migLayoutAvailable = available;
    }
    
    private static class FlatMigInsets extends Insets
    {
        FlatMigInsets(final int top, final int left, final int bottom, final int right) {
            super(top, left, bottom, right);
        }
    }
    
    private interface FlatMigListener extends PropertyChangeListener
    {
    }
}
