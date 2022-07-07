// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import java.awt.Color;
import java.util.Objects;
import javax.swing.JComponent;

public interface FlatClientProperties
{
    public static final String BUTTON_TYPE = "JButton.buttonType";
    public static final String BUTTON_TYPE_SQUARE = "square";
    public static final String BUTTON_TYPE_ROUND_RECT = "roundRect";
    public static final String BUTTON_TYPE_TAB = "tab";
    public static final String BUTTON_TYPE_HELP = "help";
    public static final String BUTTON_TYPE_TOOLBAR_BUTTON = "toolBarButton";
    public static final String SELECTED_STATE = "JButton.selectedState";
    public static final String SELECTED_STATE_INDETERMINATE = "indeterminate";
    public static final String SQUARE_SIZE = "JButton.squareSize";
    public static final String MINIMUM_WIDTH = "JComponent.minimumWidth";
    public static final String MINIMUM_HEIGHT = "JComponent.minimumHeight";
    public static final String OUTLINE = "JComponent.outline";
    public static final String OUTLINE_ERROR = "error";
    public static final String OUTLINE_WARNING = "warning";
    public static final String COMPONENT_ROUND_RECT = "JComponent.roundRect";
    public static final String POPUP_DROP_SHADOW_PAINTED = "Popup.dropShadowPainted";
    public static final String PROGRESS_BAR_LARGE_HEIGHT = "JProgressBar.largeHeight";
    public static final String PROGRESS_BAR_SQUARE = "JProgressBar.square";
    public static final String MENU_BAR_EMBEDDED = "JRootPane.menuBarEmbedded";
    public static final String SCROLL_BAR_SHOW_BUTTONS = "JScrollBar.showButtons";
    public static final String TABBED_PANE_SHOW_TAB_SEPARATORS = "JTabbedPane.showTabSeparators";
    public static final String TABBED_PANE_HAS_FULL_BORDER = "JTabbedPane.hasFullBorder";
    public static final String TABBED_PANE_TAB_HEIGHT = "JTabbedPane.tabHeight";
    public static final String SELECT_ALL_ON_FOCUS_POLICY = "JTextField.selectAllOnFocusPolicy";
    public static final String SELECT_ALL_ON_FOCUS_POLICY_NEVER = "never";
    public static final String SELECT_ALL_ON_FOCUS_POLICY_ONCE = "once";
    public static final String SELECT_ALL_ON_FOCUS_POLICY_ALWAYS = "always";
    public static final String PLACEHOLDER_TEXT = "JTextField.placeholderText";
    public static final String TAB_BUTTON_UNDERLINE_HEIGHT = "JToggleButton.tab.underlineHeight";
    public static final String TAB_BUTTON_UNDERLINE_COLOR = "JToggleButton.tab.underlineColor";
    public static final String TAB_BUTTON_SELECTED_BACKGROUND = "JToggleButton.tab.selectedBackground";
    
    default boolean clientPropertyEquals(final JComponent c, final String key, final Object value) {
        return Objects.equals(c.getClientProperty(key), value);
    }
    
    default boolean clientPropertyBoolean(final JComponent c, final String key, final boolean defaultValue) {
        final Object value = c.getClientProperty(key);
        return (boolean)((value instanceof Boolean) ? value : defaultValue);
    }
    
    default int clientPropertyInt(final JComponent c, final String key, final int defaultValue) {
        final Object value = c.getClientProperty(key);
        return (int)((value instanceof Integer) ? value : defaultValue);
    }
    
    default Color clientPropertyColor(final JComponent c, final String key, final Color defaultValue) {
        final Object value = c.getClientProperty(key);
        return (Color)((value instanceof Color) ? value : defaultValue);
    }
    
    default int clientPropertyChoice(final JComponent c, final String key, final String... choices) {
        final Object value = c.getClientProperty(key);
        for (int i = 0; i < choices.length; ++i) {
            if (choices[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
