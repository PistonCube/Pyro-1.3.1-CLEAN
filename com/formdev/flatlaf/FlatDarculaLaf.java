// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import javax.swing.LookAndFeel;

public class FlatDarculaLaf extends FlatDarkLaf
{
    public static boolean install() {
        return FlatLaf.install(new FlatDarculaLaf());
    }
    
    @Override
    public String getName() {
        return "FlatLaf Darcula";
    }
    
    @Override
    public String getDescription() {
        return "FlatLaf Darcula Look and Feel";
    }
}
