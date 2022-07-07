// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import javax.swing.LookAndFeel;

public class FlatIntelliJLaf extends FlatLightLaf
{
    public static boolean install() {
        return FlatLaf.install(new FlatIntelliJLaf());
    }
    
    @Override
    public String getName() {
        return "FlatLaf IntelliJ";
    }
    
    @Override
    public String getDescription() {
        return "FlatLaf IntelliJ Look and Feel";
    }
}
