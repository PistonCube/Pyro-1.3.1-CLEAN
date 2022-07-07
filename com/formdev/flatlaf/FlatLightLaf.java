// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import javax.swing.LookAndFeel;

public class FlatLightLaf extends FlatLaf
{
    public static boolean install() {
        return FlatLaf.install(new FlatLightLaf());
    }
    
    @Override
    public String getName() {
        return "FlatLaf Light";
    }
    
    @Override
    public String getDescription() {
        return "FlatLaf Light Look and Feel";
    }
    
    @Override
    public boolean isDark() {
        return false;
    }
}
