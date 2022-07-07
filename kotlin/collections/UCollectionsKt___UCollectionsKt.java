// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.JvmName;
import kotlin.UShortArray;
import kotlin.UShort;
import kotlin.ULongArray;
import kotlin.ULong;
import kotlin.UIntArray;
import kotlin.UInt;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import java.util.Iterator;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.UByte;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib" }, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull final Collection<UByte> $this$toUByteArray) {
        Intrinsics.checkParameterIsNotNull($this$toUByteArray, "$this$toUByteArray");
        final byte[] result = UByteArray.constructor-impl($this$toUByteArray.size());
        int index = 0;
        final Iterator<UByte> iterator = $this$toUByteArray.iterator();
        while (iterator.hasNext()) {
            final byte element = iterator.next().unbox-impl();
            UByteArray.set-VurrAj0(result, index++, element);
        }
        return result;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull final Collection<UInt> $this$toUIntArray) {
        Intrinsics.checkParameterIsNotNull($this$toUIntArray, "$this$toUIntArray");
        final int[] result = UIntArray.constructor-impl($this$toUIntArray.size());
        int index = 0;
        final Iterator<UInt> iterator = $this$toUIntArray.iterator();
        while (iterator.hasNext()) {
            final int element = iterator.next().unbox-impl();
            UIntArray.set-VXSXFK8(result, index++, element);
        }
        return result;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull final Collection<ULong> $this$toULongArray) {
        Intrinsics.checkParameterIsNotNull($this$toULongArray, "$this$toULongArray");
        final long[] result = ULongArray.constructor-impl($this$toULongArray.size());
        int index = 0;
        final Iterator<ULong> iterator = $this$toULongArray.iterator();
        while (iterator.hasNext()) {
            final long element = iterator.next().unbox-impl();
            ULongArray.set-k8EXiF4(result, index++, element);
        }
        return result;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull final Collection<UShort> $this$toUShortArray) {
        Intrinsics.checkParameterIsNotNull($this$toUShortArray, "$this$toUShortArray");
        final short[] result = UShortArray.constructor-impl($this$toUShortArray.size());
        int index = 0;
        final Iterator<UShort> iterator = $this$toUShortArray.iterator();
        while (iterator.hasNext()) {
            final short element = iterator.next().unbox-impl();
            UShortArray.set-01HTLdE(result, index++, element);
        }
        return result;
    }
    
    @JvmName(name = "sumOfUInt")
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int sumOfUInt(@NotNull final Iterable<UInt> $this$sum) {
        Intrinsics.checkParameterIsNotNull($this$sum, "$this$sum");
        int sum = 0;
        final Iterator<UInt> iterator = $this$sum.iterator();
        while (iterator.hasNext()) {
            final int element = iterator.next().unbox-impl();
            sum = UInt.constructor-impl(sum + element);
        }
        return sum;
    }
    
    @JvmName(name = "sumOfULong")
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long sumOfULong(@NotNull final Iterable<ULong> $this$sum) {
        Intrinsics.checkParameterIsNotNull($this$sum, "$this$sum");
        long sum = 0L;
        final Iterator<ULong> iterator = $this$sum.iterator();
        while (iterator.hasNext()) {
            final long element = iterator.next().unbox-impl();
            sum = ULong.constructor-impl(sum + element);
        }
        return sum;
    }
    
    @JvmName(name = "sumOfUByte")
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int sumOfUByte(@NotNull final Iterable<UByte> $this$sum) {
        Intrinsics.checkParameterIsNotNull($this$sum, "$this$sum");
        int sum = 0;
        final Iterator<UByte> iterator = $this$sum.iterator();
        while (iterator.hasNext()) {
            final byte element = iterator.next().unbox-impl();
            sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & 0xFF));
        }
        return sum;
    }
    
    @JvmName(name = "sumOfUShort")
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int sumOfUShort(@NotNull final Iterable<UShort> $this$sum) {
        Intrinsics.checkParameterIsNotNull($this$sum, "$this$sum");
        int sum = 0;
        final Iterator<UShort> iterator = $this$sum.iterator();
        while (iterator.hasNext()) {
            final short element = iterator.next().unbox-impl();
            sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & 0xFFFF));
        }
        return sum;
    }
    
    public UCollectionsKt___UCollectionsKt() {
    }
}
