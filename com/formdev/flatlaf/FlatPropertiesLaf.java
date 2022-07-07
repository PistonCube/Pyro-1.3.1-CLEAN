// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;

public class FlatPropertiesLaf extends FlatLaf
{
    private final String name;
    private final String baseTheme;
    private final boolean dark;
    private final Properties properties;
    
    public FlatPropertiesLaf(final String name, final File propertiesFile) throws IOException {
        this(name, new FileInputStream(propertiesFile));
    }
    
    public FlatPropertiesLaf(final String name, final InputStream in) throws IOException {
        this(name, loadProperties(in));
    }
    
    private static Properties loadProperties(final InputStream in) throws IOException {
        final Properties properties = new Properties();
        final InputStream in2 = in;
        try {
            properties.load(in2);
            if (in2 != null) {
                in2.close();
            }
        }
        catch (Throwable t) {
            if (in2 != null) {
                try {
                    in2.close();
                }
                catch (Throwable exception) {
                    t.addSuppressed(exception);
                }
            }
            throw t;
        }
        return properties;
    }
    
    public FlatPropertiesLaf(final String name, final Properties properties) {
        this.name = name;
        this.properties = properties;
        this.baseTheme = properties.getProperty("@baseTheme", "light");
        this.dark = ("dark".equalsIgnoreCase(this.baseTheme) || "darcula".equalsIgnoreCase(this.baseTheme));
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.name;
    }
    
    @Override
    public boolean isDark() {
        return this.dark;
    }
    
    @Override
    protected ArrayList<Class<?>> getLafClassesForDefaultsLoading() {
        final ArrayList<Class<?>> lafClasses = new ArrayList<Class<?>>();
        lafClasses.add(FlatLaf.class);
        final String lowerCase = this.baseTheme.toLowerCase();
        switch (lowerCase) {
            default: {
                lafClasses.add(FlatLightLaf.class);
                break;
            }
            case "dark": {
                lafClasses.add(FlatDarkLaf.class);
                break;
            }
            case "intellij": {
                lafClasses.add(FlatLightLaf.class);
                lafClasses.add(FlatIntelliJLaf.class);
                break;
            }
            case "darcula": {
                lafClasses.add(FlatDarkLaf.class);
                lafClasses.add(FlatDarculaLaf.class);
                break;
            }
        }
        return lafClasses;
    }
    
    @Override
    protected Properties getAdditionalDefaults() {
        return this.properties;
    }
}
