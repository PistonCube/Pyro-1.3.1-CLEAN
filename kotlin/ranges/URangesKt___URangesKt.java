// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.UShort;
import kotlin.UByte;
import kotlin.UnsignedKt;
import kotlin.ULong;
import kotlin.UInt;
import java.util.NoSuchElementException;
import kotlin.random.URandomKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.internal.InlineOnly;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\n\u00f8\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\n\u00f8\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010C\u001a\u00020\u0005*\u00020%H\u0087\b\u00f8\u0001\u0000¢\u0006\u0002\u0010D\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010C\u001a\u00020\b*\u00020/H\u0087\b\u00f8\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010C\u001a\u00020\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010H\u001a\f\u0010I\u001a\u000208*\u000208H\u0007\u001a\f\u0010I\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010J\u001a\u000208*\u0002082\u0006\u0010J\u001a\u00020KH\u0087\u0004\u001a\u0015\u0010J\u001a\u00020>*\u00020>2\u0006\u0010J\u001a\u00020LH\u0087\u0004\u001a\u001f\u0010M\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u001f\u0010M\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001f\u0010M\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u001f\u0010M\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V" }, d2 = { "coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib" }, xs = "kotlin/ranges/URangesKt")
class URangesKt___URangesKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int random(@NotNull final UIntRange $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long random(@NotNull final ULongRange $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int random(@NotNull final UIntRange $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return URandomKt.nextUInt(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long random(@NotNull final ULongRange $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return URandomKt.nextULong(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean contains-biwQdVI(@NotNull final UIntRange $this$contains, final UInt element) {
        final int n = 0;
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return element != null && $this$contains.contains-WZ4Q5Ns(element.unbox-impl());
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean contains-GYNo2lE(@NotNull final ULongRange $this$contains, final ULong element) {
        final int n = 0;
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return element != null && $this$contains.contains-VKZWuLQ(element.unbox-impl());
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-68kG9v0(@NotNull final UIntRange $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains-WZ4Q5Ns(UInt.constructor-impl(value & 0xFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-ULb-yJY(@NotNull final ULongRange $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains-VKZWuLQ(ULong.constructor-impl((long)value & 0xFFL));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-Gab390E(@NotNull final ULongRange $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains-VKZWuLQ(ULong.constructor-impl((long)value & 0xFFFFFFFFL));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-fz5IDCE(@NotNull final UIntRange $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return ULong.constructor-impl(value >>> 32) == 0L && $this$contains.contains-WZ4Q5Ns(UInt.constructor-impl((int)value));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-ZsK3CEQ(@NotNull final UIntRange $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains-WZ4Q5Ns(UInt.constructor-impl(value & 0xFFFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final boolean contains-uhHAxoY(@NotNull final ULongRange $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains-VKZWuLQ(ULong.constructor-impl((long)value & 0xFFFFL));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression downTo-Kr8caGY(final byte $this$downTo, final byte to) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(UInt.constructor-impl($this$downTo & 0xFF), UInt.constructor-impl(to & 0xFF), -1);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression downTo-J1ME1BU(final int $this$downTo, final int to) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs($this$downTo, to, -1);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongProgression downTo-eb3DHEI(final long $this$downTo, final long to) {
        return ULongProgression.Companion.fromClosedRange-7ftBX0g($this$downTo, to, -1L);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression downTo-5PvTz6A(final short $this$downTo, final short to) {
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs(UInt.constructor-impl($this$downTo & 0xFFFF), UInt.constructor-impl(to & 0xFFFF), -1);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression reversed(@NotNull final UIntProgression $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongProgression reversed(@NotNull final ULongProgression $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        return ULongProgression.Companion.fromClosedRange-7ftBX0g($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntProgression step(@NotNull final UIntProgression $this$step, final int step) {
        Intrinsics.checkParameterIsNotNull($this$step, "$this$step");
        RangesKt__RangesKt.checkStepIsPositive(step > 0, step);
        return UIntProgression.Companion.fromClosedRange-Nkh28Cs($this$step.getFirst(), $this$step.getLast(), ($this$step.getStep() > 0) ? step : (-step));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongProgression step(@NotNull final ULongProgression $this$step, final long step) {
        Intrinsics.checkParameterIsNotNull($this$step, "$this$step");
        RangesKt__RangesKt.checkStepIsPositive(step > 0L, step);
        return ULongProgression.Companion.fromClosedRange-7ftBX0g($this$step.getFirst(), $this$step.getLast(), ($this$step.getStep() > 0L) ? step : (-step));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntRange until-Kr8caGY(final byte $this$until, final byte to) {
        if (Intrinsics.compare(to & 0xFF, 0x0 & 0xFF) <= 0) {
            return UIntRange.Companion.getEMPTY();
        }
        return new UIntRange(UInt.constructor-impl($this$until & 0xFF), UInt.constructor-impl(UInt.constructor-impl(to & 0xFF) - 1), null);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntRange until-J1ME1BU(final int $this$until, final int to) {
        if (UnsignedKt.uintCompare(to, 0) <= 0) {
            return UIntRange.Companion.getEMPTY();
        }
        return new UIntRange($this$until, UInt.constructor-impl(to - 1), null);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULongRange until-eb3DHEI(final long $this$until, final long to) {
        if (UnsignedKt.ulongCompare(to, 0L) <= 0) {
            return ULongRange.Companion.getEMPTY();
        }
        return new ULongRange($this$until, ULong.constructor-impl(to - ULong.constructor-impl((long)1 & 0xFFFFFFFFL)), null);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UIntRange until-5PvTz6A(final short $this$until, final short to) {
        if (Intrinsics.compare(to & 0xFFFF, 0x0 & 0xFFFF) <= 0) {
            return UIntRange.Companion.getEMPTY();
        }
        return new UIntRange(UInt.constructor-impl($this$until & 0xFFFF), UInt.constructor-impl(UInt.constructor-impl(to & 0xFFFF) - 1), null);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int coerceAtLeast-J1ME1BU(final int $this$coerceAtLeast, final int minimumValue) {
        return (UnsignedKt.uintCompare($this$coerceAtLeast, minimumValue) < 0) ? minimumValue : $this$coerceAtLeast;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long coerceAtLeast-eb3DHEI(final long $this$coerceAtLeast, final long minimumValue) {
        return (UnsignedKt.ulongCompare($this$coerceAtLeast, minimumValue) < 0) ? minimumValue : $this$coerceAtLeast;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte coerceAtLeast-Kr8caGY(final byte $this$coerceAtLeast, final byte minimumValue) {
        return (Intrinsics.compare($this$coerceAtLeast & 0xFF, minimumValue & 0xFF) < 0) ? minimumValue : $this$coerceAtLeast;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short coerceAtLeast-5PvTz6A(final short $this$coerceAtLeast, final short minimumValue) {
        return (Intrinsics.compare($this$coerceAtLeast & 0xFFFF, minimumValue & 0xFFFF) < 0) ? minimumValue : $this$coerceAtLeast;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int coerceAtMost-J1ME1BU(final int $this$coerceAtMost, final int maximumValue) {
        return (UnsignedKt.uintCompare($this$coerceAtMost, maximumValue) > 0) ? maximumValue : $this$coerceAtMost;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long coerceAtMost-eb3DHEI(final long $this$coerceAtMost, final long maximumValue) {
        return (UnsignedKt.ulongCompare($this$coerceAtMost, maximumValue) > 0) ? maximumValue : $this$coerceAtMost;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte coerceAtMost-Kr8caGY(final byte $this$coerceAtMost, final byte maximumValue) {
        return (Intrinsics.compare($this$coerceAtMost & 0xFF, maximumValue & 0xFF) > 0) ? maximumValue : $this$coerceAtMost;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short coerceAtMost-5PvTz6A(final short $this$coerceAtMost, final short maximumValue) {
        return (Intrinsics.compare($this$coerceAtMost & 0xFFFF, maximumValue & 0xFFFF) > 0) ? maximumValue : $this$coerceAtMost;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int coerceIn-WZ9TVnA(final int $this$coerceIn, final int minimumValue, final int maximumValue) {
        if (UnsignedKt.uintCompare(minimumValue, maximumValue) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UInt.toString-impl(maximumValue) + " is less than minimum " + UInt.toString-impl(minimumValue) + '.');
        }
        if (UnsignedKt.uintCompare($this$coerceIn, minimumValue) < 0) {
            return minimumValue;
        }
        if (UnsignedKt.uintCompare($this$coerceIn, maximumValue) > 0) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long coerceIn-sambcqE(final long $this$coerceIn, final long minimumValue, final long maximumValue) {
        if (UnsignedKt.ulongCompare(minimumValue, maximumValue) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ULong.toString-impl(maximumValue) + " is less than minimum " + ULong.toString-impl(minimumValue) + '.');
        }
        if (UnsignedKt.ulongCompare($this$coerceIn, minimumValue) < 0) {
            return minimumValue;
        }
        if (UnsignedKt.ulongCompare($this$coerceIn, maximumValue) > 0) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte coerceIn-b33U2AM(final byte $this$coerceIn, final byte minimumValue, final byte maximumValue) {
        if (Intrinsics.compare(minimumValue & 0xFF, maximumValue & 0xFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UByte.toString-impl(maximumValue) + " is less than minimum " + UByte.toString-impl(minimumValue) + '.');
        }
        if (Intrinsics.compare($this$coerceIn & 0xFF, minimumValue & 0xFF) < 0) {
            return minimumValue;
        }
        if (Intrinsics.compare($this$coerceIn & 0xFF, maximumValue & 0xFF) > 0) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short coerceIn-VKSA0NQ(final short $this$coerceIn, final short minimumValue, final short maximumValue) {
        if (Intrinsics.compare(minimumValue & 0xFFFF, maximumValue & 0xFFFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + UShort.toString-impl(maximumValue) + " is less than minimum " + UShort.toString-impl(minimumValue) + '.');
        }
        if (Intrinsics.compare($this$coerceIn & 0xFFFF, minimumValue & 0xFFFF) < 0) {
            return minimumValue;
        }
        if (Intrinsics.compare($this$coerceIn & 0xFFFF, maximumValue & 0xFFFF) > 0) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int coerceIn-wuiCnnA(final int $this$coerceIn, @NotNull final ClosedRange<UInt> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return RangesKt___RangesKt.coerceIn(UInt.box-impl($this$coerceIn), (ClosedFloatingPointRange<UInt>)range).unbox-impl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return (UnsignedKt.uintCompare($this$coerceIn, range.getStart().unbox-impl()) < 0) ? range.getStart().unbox-impl() : ((UnsignedKt.uintCompare($this$coerceIn, range.getEndInclusive().unbox-impl()) > 0) ? range.getEndInclusive().unbox-impl() : $this$coerceIn);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long coerceIn-JPwROB0(final long $this$coerceIn, @NotNull final ClosedRange<ULong> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return RangesKt___RangesKt.coerceIn(ULong.box-impl($this$coerceIn), (ClosedFloatingPointRange<ULong>)range).unbox-impl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return (UnsignedKt.ulongCompare($this$coerceIn, range.getStart().unbox-impl()) < 0) ? range.getStart().unbox-impl() : ((UnsignedKt.ulongCompare($this$coerceIn, range.getEndInclusive().unbox-impl()) > 0) ? range.getEndInclusive().unbox-impl() : $this$coerceIn);
    }
    
    public URangesKt___URangesKt() {
    }
}
