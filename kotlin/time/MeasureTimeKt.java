// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a4\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)D", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/Clock;", "(Lkotlin/time/Clock;Lkotlin/jvm/functions/Function0;)D", "kotlin-stdlib" })
public final class MeasureTimeKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double measureTime(@NotNull final Function0<Unit> block) {
        final int $i$f$measureTime = 0;
        Intrinsics.checkParameterIsNotNull(block, "block");
        final Clock $this$measureTime$iv = MonoClock.INSTANCE;
        final int $i$f$measureTime2 = 0;
        final ClockMark mark$iv = $this$measureTime$iv.markNow();
        block.invoke();
        return mark$iv.elapsedNow();
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double measureTime(@NotNull final Clock $this$measureTime, @NotNull final Function0<Unit> block) {
        final int $i$f$measureTime = 0;
        Intrinsics.checkParameterIsNotNull($this$measureTime, "$this$measureTime");
        Intrinsics.checkParameterIsNotNull(block, "block");
        final ClockMark mark = $this$measureTime.markNow();
        block.invoke();
        return mark.elapsedNow();
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull final Function0<? extends T> block) {
        final int $i$f$measureTimedValue = 0;
        Intrinsics.checkParameterIsNotNull(block, "block");
        final Clock $this$measureTimedValue$iv = MonoClock.INSTANCE;
        final int $i$f$measureTimedValue2 = 0;
        final ClockMark mark$iv = $this$measureTimedValue$iv.markNow();
        final Object result$iv = block.invoke();
        return new TimedValue<T>(result$iv, mark$iv.elapsedNow(), null);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull final Clock $this$measureTimedValue, @NotNull final Function0<? extends T> block) {
        final int $i$f$measureTimedValue = 0;
        Intrinsics.checkParameterIsNotNull($this$measureTimedValue, "$this$measureTimedValue");
        Intrinsics.checkParameterIsNotNull(block, "block");
        final ClockMark mark = $this$measureTimedValue.markNow();
        final Object result = block.invoke();
        return new TimedValue<T>(result, mark.elapsedNow(), null);
    }
}
