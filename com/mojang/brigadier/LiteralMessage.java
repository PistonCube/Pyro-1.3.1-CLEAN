// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier;

public class LiteralMessage implements Message
{
    private final String string;
    
    public LiteralMessage(final String string) {
        this.string = string;
    }
    
    @Override
    public String getString() {
        return this.string;
    }
    
    @Override
    public String toString() {
        return this.string;
    }
}
