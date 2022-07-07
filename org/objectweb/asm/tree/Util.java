// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;

final class Util
{
    private Util() {
    }
    
    static <T> List<T> add(final List<T> list, final T element) {
        final List<T> newList = (list == null) ? new ArrayList<T>(1) : list;
        newList.add(element);
        return newList;
    }
    
    static <T> List<T> asArrayList(final int length) {
        final List<T> list = new ArrayList<T>(length);
        for (int i = 0; i < length; ++i) {
            list.add(null);
        }
        return list;
    }
    
    static <T> List<T> asArrayList(final T[] array) {
        if (array == null) {
            return new ArrayList<T>();
        }
        final ArrayList<T> list = new ArrayList<T>(array.length);
        for (final T t : array) {
            list.add(t);
        }
        return list;
    }
    
    static List<Byte> asArrayList(final byte[] byteArray) {
        if (byteArray == null) {
            return new ArrayList<Byte>();
        }
        final ArrayList<Byte> byteList = new ArrayList<Byte>(byteArray.length);
        for (final byte b : byteArray) {
            byteList.add(b);
        }
        return byteList;
    }
    
    static List<Boolean> asArrayList(final boolean[] booleanArray) {
        if (booleanArray == null) {
            return new ArrayList<Boolean>();
        }
        final ArrayList<Boolean> booleanList = new ArrayList<Boolean>(booleanArray.length);
        for (final boolean b : booleanArray) {
            booleanList.add(b);
        }
        return booleanList;
    }
    
    static List<Short> asArrayList(final short[] shortArray) {
        if (shortArray == null) {
            return new ArrayList<Short>();
        }
        final ArrayList<Short> shortList = new ArrayList<Short>(shortArray.length);
        for (final short s : shortArray) {
            shortList.add(s);
        }
        return shortList;
    }
    
    static List<Character> asArrayList(final char[] charArray) {
        if (charArray == null) {
            return new ArrayList<Character>();
        }
        final ArrayList<Character> charList = new ArrayList<Character>(charArray.length);
        for (final char c : charArray) {
            charList.add(c);
        }
        return charList;
    }
    
    static List<Integer> asArrayList(final int[] intArray) {
        if (intArray == null) {
            return new ArrayList<Integer>();
        }
        final ArrayList<Integer> intList = new ArrayList<Integer>(intArray.length);
        for (final int i : intArray) {
            intList.add(i);
        }
        return intList;
    }
    
    static List<Float> asArrayList(final float[] floatArray) {
        if (floatArray == null) {
            return new ArrayList<Float>();
        }
        final ArrayList<Float> floatList = new ArrayList<Float>(floatArray.length);
        for (final float f : floatArray) {
            floatList.add(f);
        }
        return floatList;
    }
    
    static List<Long> asArrayList(final long[] longArray) {
        if (longArray == null) {
            return new ArrayList<Long>();
        }
        final ArrayList<Long> longList = new ArrayList<Long>(longArray.length);
        for (final long l : longArray) {
            longList.add(l);
        }
        return longList;
    }
    
    static List<Double> asArrayList(final double[] doubleArray) {
        if (doubleArray == null) {
            return new ArrayList<Double>();
        }
        final ArrayList<Double> doubleList = new ArrayList<Double>(doubleArray.length);
        for (final double d : doubleArray) {
            doubleList.add(d);
        }
        return doubleList;
    }
    
    static <T> List<T> asArrayList(final int length, final T[] array) {
        final List<T> list = new ArrayList<T>(length);
        for (int i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
}
