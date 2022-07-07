// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.collections.BooleanIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.ShortIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012" }, d2 = { "iterator", "Lkotlin/collections/BooleanIterator;", "array", "", "Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/ShortIterator;", "", "kotlin-stdlib" })
public final class ArrayIteratorsKt
{
    @NotNull
    public static final ByteIterator iterator(@NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayByteIterator(array);
    }
    
    @NotNull
    public static final CharIterator iterator(@NotNull final char[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayCharIterator(array);
    }
    
    @NotNull
    public static final ShortIterator iterator(@NotNull final short[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayShortIterator(array);
    }
    
    @NotNull
    public static final IntIterator iterator(@NotNull final int[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayIntIterator(array);
    }
    
    @NotNull
    public static final LongIterator iterator(@NotNull final long[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayLongIterator(array);
    }
    
    @NotNull
    public static final FloatIterator iterator(@NotNull final float[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayFloatIterator(array);
    }
    
    @NotNull
    public static final DoubleIterator iterator(@NotNull final double[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayDoubleIterator(array);
    }
    
    @NotNull
    public static final BooleanIterator iterator(@NotNull final boolean[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return new ArrayBooleanIterator(array);
    }
}