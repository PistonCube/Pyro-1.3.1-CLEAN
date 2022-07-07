// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.UShort;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.UInt;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib" }, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt
{
    @JvmName(name = "sumOfUInt")
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int sumOfUInt(@NotNull final Sequence<UInt> $this$sum) {
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
    public static final long sumOfULong(@NotNull final Sequence<ULong> $this$sum) {
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
    public static final int sumOfUByte(@NotNull final Sequence<UByte> $this$sum) {
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
    public static final int sumOfUShort(@NotNull final Sequence<UShort> $this$sum) {
        Intrinsics.checkParameterIsNotNull($this$sum, "$this$sum");
        int sum = 0;
        final Iterator<UShort> iterator = $this$sum.iterator();
        while (iterator.hasNext()) {
            final short element = iterator.next().unbox-impl();
            sum = UInt.constructor-impl(sum + UInt.constructor-impl(element & 0xFFFF));
        }
        return sum;
    }
    
    public USequencesKt___USequencesKt() {
    }
}
