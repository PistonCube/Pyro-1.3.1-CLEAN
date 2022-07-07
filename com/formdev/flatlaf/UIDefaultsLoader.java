// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import java.util.Hashtable;
import javax.swing.UIManager;
import com.formdev.flatlaf.util.StringUtils;
import com.formdev.flatlaf.util.GrayFilter;
import com.formdev.flatlaf.util.UIScale;
import com.formdev.flatlaf.util.DerivedColor;
import com.formdev.flatlaf.util.ColorFunctions;
import com.formdev.flatlaf.util.HSLColor;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Dimension;
import javax.swing.plaf.InsetsUIResource;
import java.awt.Color;
import java.awt.Insets;
import com.formdev.flatlaf.ui.FlatEmptyBorder;
import com.formdev.flatlaf.ui.FlatLineBorder;
import javax.swing.plaf.ColorUIResource;
import java.util.Locale;
import java.util.Collections;
import java.util.function.Function;
import java.io.InputStream;
import java.util.Iterator;
import java.io.IOException;
import java.util.logging.Level;
import java.util.HashMap;
import com.formdev.flatlaf.util.SystemInfo;
import java.util.Map;
import java.util.ArrayList;
import javax.swing.UIDefaults;
import java.util.Properties;
import java.util.List;

class UIDefaultsLoader
{
    private static final String TYPE_PREFIX = "{";
    private static final String TYPE_PREFIX_END = "}";
    private static final String VARIABLE_PREFIX = "@";
    private static final String PROPERTY_PREFIX = "$";
    private static final String OPTIONAL_PREFIX = "?";
    private static final String GLOBAL_PREFIX = "*.";
    private static ValueType[] tempResultValueType;
    
    static void loadDefaultsFromProperties(final Class<?> lookAndFeelClass, final List<FlatDefaultsAddon> addons, final Properties additionalDefaults, final boolean dark, final UIDefaults defaults) {
        final ArrayList<Class<?>> lafClasses = new ArrayList<Class<?>>();
        for (Class<?> lafClass = lookAndFeelClass; FlatLaf.class.isAssignableFrom(lafClass); lafClass = lafClass.getSuperclass()) {
            lafClasses.add(0, lafClass);
        }
        loadDefaultsFromProperties(lafClasses, addons, additionalDefaults, dark, defaults);
    }
    
    static void loadDefaultsFromProperties(final List<Class<?>> lafClasses, final List<FlatDefaultsAddon> addons, final Properties additionalDefaults, final boolean dark, final UIDefaults defaults) {
        try {
            final Properties properties = new Properties();
            for (final Class<?> lafClass : lafClasses) {
                final String propertiesName = '/' + lafClass.getName().replace('.', '/') + ".properties";
                final InputStream in = lafClass.getResourceAsStream(propertiesName);
                try {
                    if (in != null) {
                        properties.load(in);
                    }
                    if (in == null) {
                        continue;
                    }
                    in.close();
                }
                catch (Throwable t) {
                    if (in != null) {
                        try {
                            in.close();
                        }
                        catch (Throwable exception) {
                            t.addSuppressed(exception);
                        }
                    }
                    throw t;
                }
            }
            for (final FlatDefaultsAddon addon : addons) {
                for (final Class<?> lafClass2 : lafClasses) {
                    final InputStream in2 = addon.getDefaults(lafClass2);
                    try {
                        if (in2 != null) {
                            properties.load(in2);
                        }
                        if (in2 == null) {
                            continue;
                        }
                        in2.close();
                    }
                    catch (Throwable t2) {
                        if (in2 != null) {
                            try {
                                in2.close();
                            }
                            catch (Throwable exception2) {
                                t2.addSuppressed(exception2);
                            }
                        }
                        throw t2;
                    }
                }
            }
            final List<ClassLoader> addonClassLoaders = new ArrayList<ClassLoader>();
            for (final FlatDefaultsAddon addon2 : addons) {
                final ClassLoader addonClassLoader = addon2.getClass().getClassLoader();
                if (!addonClassLoaders.contains(addonClassLoader)) {
                    addonClassLoaders.add(addonClassLoader);
                }
            }
            if (additionalDefaults != null) {
                properties.putAll(additionalDefaults);
            }
            final ArrayList<String> platformSpecificKeys = new ArrayList<String>();
            for (final Object okey : properties.keySet()) {
                final String key2 = (String)okey;
                if (key2.startsWith("[") && (key2.startsWith("[win]") || key2.startsWith("[mac]") || key2.startsWith("[linux]") || key2.startsWith("[light]") || key2.startsWith("[dark]"))) {
                    platformSpecificKeys.add(key2);
                }
            }
            if (!platformSpecificKeys.isEmpty()) {
                final String lightOrDarkPrefix = dark ? "[dark]" : "[light]";
                for (final String key2 : platformSpecificKeys) {
                    if (key2.startsWith(lightOrDarkPrefix)) {
                        properties.put(key2.substring(lightOrDarkPrefix.length()), properties.remove(key2));
                    }
                }
                final String platformPrefix = SystemInfo.IS_WINDOWS ? "[win]" : (SystemInfo.IS_MAC ? "[mac]" : (SystemInfo.IS_LINUX ? "[linux]" : "[unknown]"));
                for (final String key3 : platformSpecificKeys) {
                    final Object value2 = properties.remove(key3);
                    if (key3.startsWith(platformPrefix)) {
                        properties.put(key3.substring(platformPrefix.length()), value2);
                    }
                }
            }
            final Function<String, String> propertiesGetter = (Function<String, String>)(key -> properties.getProperty(key));
            final Function<String, String> resolver = (Function<String, String>)(value -> resolveValue(value, propertiesGetter));
            final HashMap<String, Object> globals = new HashMap<String, Object>();
            for (final Map.Entry<Object, Object> e : properties.entrySet()) {
                final String key4 = e.getKey();
                if (!key4.startsWith("*.")) {
                    continue;
                }
                final String value3 = resolveValue(e.getValue(), propertiesGetter);
                try {
                    globals.put(key4.substring("*.".length()), parseValue(key4, value3, null, resolver, addonClassLoaders));
                }
                catch (RuntimeException ex) {
                    logParseError(Level.SEVERE, key4, value3, ex);
                }
            }
            for (final Object key5 : ((Hashtable<Object, V>)defaults).keySet()) {
                if (key5 instanceof String && ((String)key5).contains(".")) {
                    final String skey = (String)key5;
                    final String globalKey = skey.substring(skey.lastIndexOf(46) + 1);
                    final Object globalValue = globals.get(globalKey);
                    if (globalValue == null) {
                        continue;
                    }
                    defaults.put(key5, globalValue);
                }
            }
            for (final Map.Entry<Object, Object> e : properties.entrySet()) {
                final String key4 = e.getKey();
                if (!key4.startsWith("@")) {
                    if (key4.startsWith("*.")) {
                        continue;
                    }
                    final String value3 = resolveValue(e.getValue(), propertiesGetter);
                    try {
                        defaults.put(key4, parseValue(key4, value3, null, resolver, addonClassLoaders));
                    }
                    catch (RuntimeException ex) {
                        logParseError(Level.SEVERE, key4, value3, ex);
                    }
                }
            }
        }
        catch (IOException ex2) {
            FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to load properties files.", ex2);
        }
    }
    
    static void logParseError(final Level level, final String key, final String value, final RuntimeException ex) {
        FlatLaf.LOG.log(level, "FlatLaf: Failed to parse: '" + key + '=' + value + '\'', ex);
    }
    
    static String resolveValue(String value, final Function<String, String> propertiesGetter) {
        final String value2;
        value = (value2 = value.trim());
        if (value.startsWith("$")) {
            value = value.substring("$".length());
        }
        else if (!value.startsWith("@")) {
            return value;
        }
        boolean optional = false;
        if (value.startsWith("?")) {
            value = value.substring("?".length());
            optional = true;
        }
        final String newValue = propertiesGetter.apply(value);
        if (newValue == null) {
            if (optional) {
                return "null";
            }
            throw new IllegalArgumentException("variable or property '" + value + "' not found");
        }
        else {
            if (newValue.equals(value2)) {
                throw new IllegalArgumentException("endless recursion in variable or property '" + value + "'");
            }
            return resolveValue(newValue, propertiesGetter);
        }
    }
    
    static Object parseValue(final String key, final String value) {
        return parseValue(key, value, (ValueType[])null, v -> v, Collections.emptyList());
    }
    
    static Object parseValue(final String key, String value, ValueType[] resultValueType, final Function<String, String> resolver, final List<ClassLoader> addonClassLoaders) {
        if (resultValueType == null) {
            resultValueType = UIDefaultsLoader.tempResultValueType;
        }
        final String trim;
        value = (trim = value.trim());
        switch (trim) {
            case "null": {
                resultValueType[0] = ValueType.NULL;
                return null;
            }
            case "false": {
                resultValueType[0] = ValueType.BOOLEAN;
                return false;
            }
            case "true": {
                resultValueType[0] = ValueType.BOOLEAN;
                return true;
            }
            default: {
                if (value.startsWith("lazy(") && value.endsWith(")")) {
                    resultValueType[0] = ValueType.LAZY;
                    final String uiKey = value.substring(5, value.length() - 1).trim();
                    return t -> lazyUIManagerGet(uiKey);
                }
                ValueType valueType = ValueType.UNKNOWN;
                if (value.startsWith("#")) {
                    valueType = ValueType.COLOR;
                }
                else if (value.startsWith("\"") && value.endsWith("\"")) {
                    valueType = ValueType.STRING;
                    value = value.substring(1, value.length() - 1);
                }
                else if (value.startsWith("{")) {
                    final int end = value.indexOf("}");
                    if (end != -1) {
                        try {
                            final String typeStr = value.substring("{".length(), end);
                            valueType = ValueType.valueOf(typeStr.toUpperCase(Locale.ENGLISH));
                            value = value.substring(end + "}".length());
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                }
                if (valueType == ValueType.UNKNOWN) {
                    if (key.endsWith("ground") || key.endsWith("Color")) {
                        valueType = ValueType.COLOR;
                    }
                    else if (key.endsWith(".border") || key.endsWith("Border")) {
                        valueType = ValueType.BORDER;
                    }
                    else if (key.endsWith(".icon") || key.endsWith("Icon")) {
                        valueType = ValueType.ICON;
                    }
                    else if (key.endsWith(".margin") || key.endsWith(".padding") || key.endsWith("Margins") || key.endsWith("Insets")) {
                        valueType = ValueType.INSETS;
                    }
                    else if (key.endsWith("Size")) {
                        valueType = ValueType.DIMENSION;
                    }
                    else if (key.endsWith("Width") || key.endsWith("Height")) {
                        valueType = ValueType.INTEGER;
                    }
                    else if (key.endsWith("Char")) {
                        valueType = ValueType.CHARACTER;
                    }
                    else if (key.endsWith("UI")) {
                        valueType = ValueType.STRING;
                    }
                    else if (key.endsWith("grayFilter")) {
                        valueType = ValueType.GRAYFILTER;
                    }
                }
                resultValueType[0] = valueType;
                switch (valueType) {
                    case STRING: {
                        return value;
                    }
                    case CHARACTER: {
                        return parseCharacter(value);
                    }
                    case INTEGER: {
                        return parseInteger(value, true);
                    }
                    case FLOAT: {
                        return parseFloat(value, true);
                    }
                    case BORDER: {
                        return parseBorder(value, resolver, addonClassLoaders);
                    }
                    case ICON: {
                        return parseInstance(value, addonClassLoaders);
                    }
                    case INSETS: {
                        return parseInsets(value);
                    }
                    case DIMENSION: {
                        return parseDimension(value);
                    }
                    case COLOR: {
                        return parseColorOrFunction(value, resolver, true);
                    }
                    case SCALEDINTEGER: {
                        return parseScaledInteger(value);
                    }
                    case SCALEDFLOAT: {
                        return parseScaledFloat(value);
                    }
                    case SCALEDINSETS: {
                        return parseScaledInsets(value);
                    }
                    case SCALEDDIMENSION: {
                        return parseScaledDimension(value);
                    }
                    case INSTANCE: {
                        return parseInstance(value, addonClassLoaders);
                    }
                    case CLASS: {
                        return parseClass(value, addonClassLoaders);
                    }
                    case GRAYFILTER: {
                        return parseGrayFilter(value);
                    }
                    default: {
                        final Object color = parseColorOrFunction(value, resolver, false);
                        if (color != null) {
                            resultValueType[0] = ValueType.COLOR;
                            return color;
                        }
                        final Integer integer = parseInteger(value, false);
                        if (integer != null) {
                            resultValueType[0] = ValueType.INTEGER;
                            return integer;
                        }
                        final Float f = parseFloat(value, false);
                        if (f != null) {
                            resultValueType[0] = ValueType.FLOAT;
                            return f;
                        }
                        resultValueType[0] = ValueType.STRING;
                        return value;
                    }
                }
                break;
            }
        }
    }
    
    private static Object parseBorder(final String value, final Function<String, String> resolver, final List<ClassLoader> addonClassLoaders) {
        if (value.indexOf(44) >= 0) {
            final List<String> parts = split(value, ',');
            final Insets insets = parseInsets(value);
            final ColorUIResource lineColor = (parts.size() >= 5) ? ((ColorUIResource)parseColorOrFunction(resolver.apply(parts.get(4)), resolver, true)) : null;
            final float lineThickness = (parts.size() >= 6) ? parseFloat(parts.get(5), true) : 1.0f;
            final Color lineColor2;
            final Insets insets2;
            final float lineThickness2;
            final Object o3;
            return t -> {
                if (lineColor2 != null) {
                    // new(com.formdev.flatlaf.ui.FlatLineBorder.class)
                    new FlatLineBorder(insets2, lineColor2, lineThickness2);
                }
                else {
                    // new(com.formdev.flatlaf.ui.FlatEmptyBorder.class)
                    new FlatEmptyBorder(insets2);
                }
                return o3;
            };
        }
        return parseInstance(value, addonClassLoaders);
    }
    
    private static Object parseInstance(final String value, final List<ClassLoader> addonClassLoaders) {
        final ReflectiveOperationException ex2;
        ReflectiveOperationException ex;
        return t -> {
            try {
                return findClass(value, addonClassLoaders).newInstance();
            }
            catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex3) {
                ex = ex2;
                FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to instantiate '" + value + "'.", ex);
                return null;
            }
        };
    }
    
    private static Object parseClass(final String value, final List<ClassLoader> addonClassLoaders) {
        return t -> {
            try {
                return findClass(value, addonClassLoaders);
            }
            catch (ClassNotFoundException ex) {
                FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to find class '" + value + "'.", ex);
                return null;
            }
        };
    }
    
    private static Class<?> findClass(final String className, final List<ClassLoader> addonClassLoaders) throws ClassNotFoundException {
        try {
            return Class.forName(className);
        }
        catch (ClassNotFoundException ex) {
            for (final ClassLoader addonClassLoader : addonClassLoaders) {
                try {
                    return addonClassLoader.loadClass(className);
                }
                catch (ClassNotFoundException ex2) {
                    continue;
                }
                break;
            }
            throw ex;
        }
    }
    
    private static Insets parseInsets(final String value) {
        final List<String> numbers = split(value, ',');
        try {
            return new InsetsUIResource(Integer.parseInt(numbers.get(0)), Integer.parseInt(numbers.get(1)), Integer.parseInt(numbers.get(2)), Integer.parseInt(numbers.get(3)));
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException("invalid insets '" + value + "'");
        }
    }
    
    private static Dimension parseDimension(final String value) {
        final List<String> numbers = split(value, ',');
        try {
            return new DimensionUIResource(Integer.parseInt(numbers.get(0)), Integer.parseInt(numbers.get(1)));
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException("invalid size '" + value + "'");
        }
    }
    
    private static Object parseColorOrFunction(final String value, final Function<String, String> resolver, final boolean reportError) {
        if (value.endsWith(")")) {
            return parseColorFunctions(value, resolver, reportError);
        }
        return parseColor(value, reportError);
    }
    
    static ColorUIResource parseColor(final String value) {
        return parseColor(value, false);
    }
    
    private static ColorUIResource parseColor(final String value, final boolean reportError) {
        try {
            final int rgba = parseColorRGBA(value);
            ColorUIResource colorUIResource;
            if ((rgba & 0xFF000000) == 0xFF000000) {
                colorUIResource = new ColorUIResource(rgba);
            }
            else {
                final Color c;
                colorUIResource = new ColorUIResource(c);
                c = new Color(rgba, true);
            }
            return colorUIResource;
        }
        catch (IllegalArgumentException ex) {
            if (reportError) {
                throw new IllegalArgumentException("invalid color '" + value + "'");
            }
            return null;
        }
    }
    
    static int parseColorRGBA(final String value) {
        final int len = value.length();
        if ((len != 4 && len != 5 && len != 7 && len != 9) || value.charAt(0) != '#') {
            throw new IllegalArgumentException();
        }
        int n = 0;
        for (int i = 1; i < len; ++i) {
            final char ch = value.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            }
            else if (ch >= 'a' && ch <= 'f') {
                digit = ch - 'a' + 10;
            }
            else {
                if (ch < 'A' || ch > 'F') {
                    throw new IllegalArgumentException();
                }
                digit = ch - 'A' + 10;
            }
            n = (n << 4 | digit);
        }
        if (len <= 5) {
            final int n2 = n & 0xF000;
            final int n3 = n & 0xF00;
            final int n4 = n & 0xF0;
            final int n5 = n & 0xF;
            n = (n2 << 16 | n2 << 12 | n3 << 12 | n3 << 8 | n4 << 8 | n4 << 4 | n5 << 4 | n5);
        }
        return (len == 4 || len == 7) ? (0xFF000000 | n) : ((n >> 8 & 0xFFFFFF) | (n & 0xFF) << 24);
    }
    
    private static Object parseColorFunctions(final String value, final Function<String, String> resolver, final boolean reportError) {
        final int paramsStart = value.indexOf(40);
        if (paramsStart < 0) {
            if (reportError) {
                throw new IllegalArgumentException("missing opening parenthesis in function '" + value + "'");
            }
            return null;
        }
        else {
            final String function = value.substring(0, paramsStart).trim();
            final List<String> params = splitFunctionParams(value.substring(paramsStart + 1, value.length() - 1), ',');
            if (params.isEmpty()) {
                throw new IllegalArgumentException("missing parameters in function '" + value + "'");
            }
            final String s = function;
            switch (s) {
                case "rgb": {
                    return parseColorRgbOrRgba(false, params, resolver, reportError);
                }
                case "rgba": {
                    return parseColorRgbOrRgba(true, params, resolver, reportError);
                }
                case "hsl": {
                    return parseColorHslOrHsla(false, params);
                }
                case "hsla": {
                    return parseColorHslOrHsla(true, params);
                }
                case "lighten": {
                    return parseColorHSLIncreaseDecrease(2, true, params, resolver, reportError);
                }
                case "darken": {
                    return parseColorHSLIncreaseDecrease(2, false, params, resolver, reportError);
                }
                case "saturate": {
                    return parseColorHSLIncreaseDecrease(1, true, params, resolver, reportError);
                }
                case "desaturate": {
                    return parseColorHSLIncreaseDecrease(1, false, params, resolver, reportError);
                }
                default: {
                    throw new IllegalArgumentException("unknown color function '" + value + "'");
                }
            }
        }
    }
    
    private static ColorUIResource parseColorRgbOrRgba(final boolean hasAlpha, final List<String> params, final Function<String, String> resolver, final boolean reportError) {
        if (hasAlpha && params.size() == 2) {
            final String colorStr = params.get(0);
            final int alpha = parseInteger(params.get(1), 0, 255, true);
            final ColorUIResource color = (ColorUIResource)parseColorOrFunction(resolver.apply(colorStr), resolver, reportError);
            return new ColorUIResource(new Color((alpha & 0xFF) << 24 | (color.getRGB() & 0xFFFFFF), true));
        }
        final int red = parseInteger(params.get(0), 0, 255, true);
        final int green = parseInteger(params.get(1), 0, 255, true);
        final int blue = parseInteger(params.get(2), 0, 255, true);
        final int alpha2 = hasAlpha ? parseInteger(params.get(3), 0, 255, true) : 255;
        return hasAlpha ? new ColorUIResource(new Color(red, green, blue, alpha2)) : new ColorUIResource(red, green, blue);
    }
    
    private static ColorUIResource parseColorHslOrHsla(final boolean hasAlpha, final List<String> params) {
        final int hue = parseInteger(params.get(0), 0, 360, false);
        final int saturation = parsePercentage(params.get(1));
        final int lightness = parsePercentage(params.get(2));
        final int alpha = hasAlpha ? parsePercentage(params.get(3)) : 100;
        final float[] hsl = { (float)hue, (float)saturation, (float)lightness };
        return new ColorUIResource(HSLColor.toRGB(hsl, alpha / 100.0f));
    }
    
    private static Object parseColorHSLIncreaseDecrease(final int hslIndex, final boolean increase, final List<String> params, final Function<String, String> resolver, final boolean reportError) {
        final String colorStr = params.get(0);
        final int amount = parsePercentage(params.get(1));
        boolean relative = false;
        boolean autoInverse = false;
        boolean lazy = false;
        boolean derived = false;
        if (params.size() > 2) {
            final String options = params.get(2);
            relative = options.contains("relative");
            autoInverse = options.contains("autoInverse");
            lazy = options.contains("lazy");
            derived = options.contains("derived");
            if (derived && !options.contains("noAutoInverse")) {
                autoInverse = true;
            }
        }
        final ColorFunctions.ColorFunction function = new ColorFunctions.HSLIncreaseDecrease(hslIndex, increase, (float)amount, relative, autoInverse);
        if (lazy) {
            final String uiKey;
            final Object color;
            final ColorFunctions.ColorFunction colorFunction;
            Object o2 = null;
            return t -> {
                color = lazyUIManagerGet(uiKey);
                if (color instanceof Color) {
                    // new(javax.swing.plaf.ColorUIResource.class)
                    new ColorUIResource(ColorFunctions.applyFunctions((Color)color, colorFunction));
                }
                else {
                    o2 = null;
                }
                return o2;
            };
        }
        final String resolvedColorStr = resolver.apply(colorStr);
        final ColorUIResource baseColor = (ColorUIResource)parseColorOrFunction(resolvedColorStr, resolver, reportError);
        final Color newColor = ColorFunctions.applyFunctions(baseColor, function);
        if (derived) {
            ColorFunctions.ColorFunction[] functions;
            if (baseColor instanceof DerivedColor && resolvedColorStr == colorStr) {
                final ColorFunctions.ColorFunction[] baseFunctions = ((DerivedColor)baseColor).getFunctions();
                functions = new ColorFunctions.ColorFunction[baseFunctions.length + 1];
                System.arraycopy(baseFunctions, 0, functions, 0, baseFunctions.length);
                functions[baseFunctions.length] = function;
            }
            else {
                functions = new ColorFunctions.ColorFunction[] { function };
            }
            return new DerivedColor(newColor, functions);
        }
        return new ColorUIResource(newColor);
    }
    
    private static int parsePercentage(final String value) {
        if (!value.endsWith("%")) {
            throw new NumberFormatException("invalid percentage '" + value + "'");
        }
        int val;
        try {
            val = Integer.parseInt(value.substring(0, value.length() - 1));
        }
        catch (NumberFormatException ex) {
            throw new NumberFormatException("invalid percentage '" + value + "'");
        }
        if (val < 0 || val > 100) {
            throw new IllegalArgumentException("percentage out of range (0-100%) '" + value + "'");
        }
        return val;
    }
    
    private static Character parseCharacter(final String value) {
        if (value.length() != 1) {
            throw new IllegalArgumentException("invalid character '" + value + "'");
        }
        return value.charAt(0);
    }
    
    private static Integer parseInteger(final String value, final int min, final int max, final boolean allowPercentage) {
        if (allowPercentage && value.endsWith("%")) {
            final int percent = parsePercentage(value);
            return max * percent / 100;
        }
        final Integer integer = parseInteger(value, true);
        if (integer < min || integer > max) {
            throw new NumberFormatException("integer '" + value + "' out of range (" + min + '-' + max + ')');
        }
        return integer;
    }
    
    private static Integer parseInteger(final String value, final boolean reportError) {
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException ex) {
            if (reportError) {
                throw new NumberFormatException("invalid integer '" + value + "'");
            }
            return null;
        }
    }
    
    private static Float parseFloat(final String value, final boolean reportError) {
        try {
            return Float.parseFloat(value);
        }
        catch (NumberFormatException ex) {
            if (reportError) {
                throw new NumberFormatException("invalid float '" + value + "'");
            }
            return null;
        }
    }
    
    private static UIDefaults.ActiveValue parseScaledInteger(final String value) {
        final int val = parseInteger(value, true);
        return t -> UIScale.scale(val);
    }
    
    private static UIDefaults.ActiveValue parseScaledFloat(final String value) {
        final float val = parseFloat(value, true);
        return t -> UIScale.scale(val);
    }
    
    private static UIDefaults.ActiveValue parseScaledInsets(final String value) {
        final Insets insets = parseInsets(value);
        return t -> UIScale.scale(insets);
    }
    
    private static UIDefaults.ActiveValue parseScaledDimension(final String value) {
        final Dimension dimension = parseDimension(value);
        return t -> UIScale.scale(dimension);
    }
    
    private static Object parseGrayFilter(final String value) {
        final List<String> numbers = split(value, ',');
        try {
            final int brightness = Integer.parseInt(numbers.get(0));
            final int contrast = Integer.parseInt(numbers.get(1));
            final int alpha = Integer.parseInt(numbers.get(2));
            return t -> new GrayFilter(brightness, contrast, alpha);
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException("invalid gray filter '" + value + "'");
        }
    }
    
    private static List<String> split(final String str, final char delim) {
        final List<String> result = StringUtils.split(str, delim);
        for (int size = result.size(), i = 0; i < size; ++i) {
            result.set(i, result.get(i).trim());
        }
        return result;
    }
    
    private static List<String> splitFunctionParams(final String str, final char delim) {
        final ArrayList<String> strs = new ArrayList<String>();
        int nestLevel = 0;
        int start = 0;
        for (int strlen = str.length(), i = 0; i < strlen; ++i) {
            final char ch = str.charAt(i);
            if (ch == '(') {
                ++nestLevel;
            }
            else if (ch == ')') {
                --nestLevel;
            }
            else if (nestLevel == 0 && ch == delim) {
                strs.add(str.substring(start, i).trim());
                start = i + 1;
            }
        }
        strs.add(str.substring(start).trim());
        return strs;
    }
    
    private static Object lazyUIManagerGet(String uiKey) {
        boolean optional = false;
        if (uiKey.startsWith("?")) {
            uiKey = uiKey.substring("?".length());
            optional = true;
        }
        final Object value = UIManager.get(uiKey);
        if (value == null && !optional) {
            FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: '" + uiKey + "' not found in UI defaults.");
        }
        return value;
    }
    
    static {
        UIDefaultsLoader.tempResultValueType = new ValueType[1];
    }
    
    enum ValueType
    {
        UNKNOWN, 
        STRING, 
        BOOLEAN, 
        CHARACTER, 
        INTEGER, 
        FLOAT, 
        BORDER, 
        ICON, 
        INSETS, 
        DIMENSION, 
        COLOR, 
        SCALEDINTEGER, 
        SCALEDFLOAT, 
        SCALEDINSETS, 
        SCALEDDIMENSION, 
        INSTANCE, 
        CLASS, 
        GRAYFILTER, 
        NULL, 
        LAZY;
    }
}
