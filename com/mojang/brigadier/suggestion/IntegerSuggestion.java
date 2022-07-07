// 
// Decompiled by Procyon v0.5.36
// 

package com.mojang.brigadier.suggestion;

import java.util.Objects;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.StringRange;

public class IntegerSuggestion extends Suggestion
{
    private int value;
    
    public IntegerSuggestion(final StringRange range, final int value) {
        this(range, value, null);
    }
    
    public IntegerSuggestion(final StringRange range, final int value, final Message tooltip) {
        super(range, Integer.toString(value), tooltip);
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegerSuggestion)) {
            return false;
        }
        final IntegerSuggestion that = (IntegerSuggestion)o;
        return this.value == that.value && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.value);
    }
    
    @Override
    public String toString() {
        return "IntegerSuggestion{value=" + this.value + ", range=" + this.getRange() + ", text='" + this.getText() + '\'' + ", tooltip='" + this.getTooltip() + '\'' + '}';
    }
    
    @Override
    public int compareTo(final Suggestion o) {
        if (o instanceof IntegerSuggestion) {
            return Integer.compare(this.value, ((IntegerSuggestion)o).value);
        }
        return super.compareTo(o);
    }
    
    @Override
    public int compareToIgnoreCase(final Suggestion b) {
        return this.compareTo(b);
    }
}
