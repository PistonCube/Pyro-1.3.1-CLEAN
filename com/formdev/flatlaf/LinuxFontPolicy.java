// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import java.awt.GraphicsConfiguration;
import com.formdev.flatlaf.util.UIScale;
import java.util.Iterator;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import com.formdev.flatlaf.util.StringUtils;
import java.awt.GraphicsEnvironment;
import java.util.StringTokenizer;
import java.awt.Toolkit;
import com.formdev.flatlaf.util.SystemInfo;
import java.awt.Font;

class LinuxFontPolicy
{
    static Font getFont() {
        return SystemInfo.IS_KDE ? getKDEFont() : getGnomeFont();
    }
    
    private static Font getGnomeFont() {
        Object fontName = Toolkit.getDefaultToolkit().getDesktopProperty("gnome.Gtk/FontName");
        if (!(fontName instanceof String)) {
            fontName = "sans 10";
        }
        String family = "";
        int style = 0;
        int size = 10;
        final StringTokenizer st = new StringTokenizer((String)fontName);
        while (st.hasMoreTokens()) {
            final String word = st.nextToken();
            if (word.equalsIgnoreCase("italic")) {
                style |= 0x2;
            }
            else if (word.equalsIgnoreCase("bold")) {
                style |= 0x1;
            }
            else if (Character.isDigit(word.charAt(0))) {
                try {
                    size = Integer.parseInt(word);
                }
                catch (NumberFormatException ex) {}
            }
            else {
                family = (family.isEmpty() ? word : (family + ' ' + word));
            }
        }
        if (family.startsWith("Ubuntu") && !SystemInfo.IS_JETBRAINS_JVM && !FlatSystemProperties.getBoolean("flatlaf.useUbuntuFont", false)) {
            family = "Liberation Sans";
        }
        final double dsize = size * getGnomeFontScale();
        size = (int)(dsize + 0.5);
        if (size < 1) {
            size = 1;
        }
        final String logicalFamily = mapFcName(family.toLowerCase());
        if (logicalFamily != null) {
            family = logicalFamily;
        }
        return createFont(family, style, size, dsize);
    }
    
    private static Font createFont(final String family, final int style, final int size, final double dsize) {
        Font font = FlatLaf.createCompositeFont(family, style, size);
        font = font.deriveFont(style, (float)dsize);
        return font;
    }
    
    private static double getGnomeFontScale() {
        if (isSystemScaling()) {
            return 1.3333333333333333;
        }
        final Object value = Toolkit.getDefaultToolkit().getDesktopProperty("gnome.Xft/DPI");
        if (value instanceof Integer) {
            int dpi = (int)value / 1024;
            if (dpi == -1) {
                dpi = 96;
            }
            if (dpi < 50) {
                dpi = 50;
            }
            return dpi / 72.0;
        }
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getNormalizingTransform().getScaleY();
    }
    
    private static String mapFcName(final String name) {
        switch (name) {
            case "sans": {
                return "sansserif";
            }
            case "sans-serif": {
                return "sansserif";
            }
            case "serif": {
                return "serif";
            }
            case "monospace": {
                return "monospaced";
            }
            default: {
                return null;
            }
        }
    }
    
    private static Font getKDEFont() {
        final List<String> kdeglobals = readConfig("kdeglobals");
        final List<String> kcmfonts = readConfig("kcmfonts");
        final String generalFont = getConfigEntry(kdeglobals, "General", "font");
        final String forceFontDPI = getConfigEntry(kcmfonts, "General", "forceFontDPI");
        String family = "sansserif";
        int style = 0;
        int size = 10;
        if (generalFont != null) {
            final List<String> strs = StringUtils.split(generalFont, ',');
            try {
                family = strs.get(0);
                size = Integer.parseInt(strs.get(1));
                if ("75".equals(strs.get(4))) {
                    style |= 0x1;
                }
                if ("1".equals(strs.get(5))) {
                    style |= 0x2;
                }
            }
            catch (RuntimeException ex) {
                FlatLaf.LOG.log(Level.CONFIG, "FlatLaf: Failed to parse 'font=" + generalFont + "'.", ex);
            }
        }
        int dpi = 96;
        if (forceFontDPI != null && !isSystemScaling()) {
            try {
                dpi = Integer.parseInt(forceFontDPI);
                if (dpi <= 0) {
                    dpi = 96;
                }
                if (dpi < 50) {
                    dpi = 50;
                }
            }
            catch (NumberFormatException ex2) {
                FlatLaf.LOG.log(Level.CONFIG, "FlatLaf: Failed to parse 'forceFontDPI=" + forceFontDPI + "'.", ex2);
            }
        }
        final double fontScale = dpi / 72.0;
        final double dsize = size * fontScale;
        size = (int)(dsize + 0.5);
        if (size < 1) {
            size = 1;
        }
        return createFont(family, style, size, dsize);
    }
    
    private static List<String> readConfig(final String filename) {
        final File userHome = new File(System.getProperty("user.home"));
        final String[] configDirs = { ".config", ".kde4/share/config", ".kde/share/config" };
        File file = null;
        for (final String configDir : configDirs) {
            file = new File(userHome, configDir + "/" + filename);
            if (file.isFile()) {
                break;
            }
        }
        if (!file.isFile()) {
            return Collections.emptyList();
        }
        final ArrayList<String> lines = new ArrayList<String>(200);
        try {
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            try {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
                reader.close();
            }
            catch (Throwable t) {
                try {
                    reader.close();
                }
                catch (Throwable exception) {
                    t.addSuppressed(exception);
                }
                throw t;
            }
        }
        catch (IOException ex) {
            FlatLaf.LOG.log(Level.CONFIG, "FlatLaf: Failed to read '" + filename + "'.", ex);
        }
        return lines;
    }
    
    private static String getConfigEntry(final List<String> config, final String group, final String key) {
        final int groupLength = group.length();
        final int keyLength = key.length();
        boolean inGroup = false;
        for (final String line : config) {
            if (!inGroup) {
                if (line.length() < groupLength + 2 || line.charAt(0) != '[' || line.charAt(groupLength + 1) != ']' || line.indexOf(group) != 1) {
                    continue;
                }
                inGroup = true;
            }
            else {
                if (line.startsWith("[")) {
                    return null;
                }
                if (line.length() >= keyLength + 2 && line.charAt(keyLength) == '=' && line.startsWith(key)) {
                    return line.substring(keyLength + 1);
                }
                continue;
            }
        }
        return null;
    }
    
    private static boolean isSystemScaling() {
        final GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        return UIScale.getSystemScaleFactor(gc) > 1.0;
    }
}
