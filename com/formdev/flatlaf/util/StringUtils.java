// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtils
{
    public static String removeLeading(final String string, final String leading) {
        return string.startsWith(leading) ? string.substring(leading.length()) : string;
    }
    
    public static String removeTrailing(final String string, final String trailing) {
        return string.endsWith(trailing) ? string.substring(0, string.length() - trailing.length()) : string;
    }
    
    public static List<String> split(final String str, final char delim) {
        final ArrayList<String> strs = new ArrayList<String>();
        int delimIndex;
        int index;
        for (delimIndex = str.indexOf(delim), index = 0; delimIndex >= 0; delimIndex = str.indexOf(delim, index)) {
            strs.add(str.substring(index, delimIndex));
            index = delimIndex + 1;
        }
        strs.add(str.substring(index));
        return strs;
    }
}
