// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import javax.swing.LookAndFeel;

public class FlatDarkLaf extends FlatLaf
{
    public static boolean install() {
        return FlatLaf.install(new FlatDarkLaf());
    }
    
    @Override
    public String getName() {
        return "FlatLaf Dark";
    }
    
    @Override
    public String getDescription() {
        return "FlatLaf Dark Look and Feel";
    }
    
    @Override
    public boolean isDark() {
        return true;
    }
}
