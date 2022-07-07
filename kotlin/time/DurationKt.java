// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010%\u001a\u00020\u0007*\u00020\b2\u0006\u0010&\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010%\u001a\u00020\u0007*\u00020\r2\u0006\u0010&\u001a\u00020\u0007H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u0007*\u00020\b2\n\u0010,\u001a\u00060\u0001j\u0002`-H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010.\u001a \u0010+\u001a\u00020\u0007*\u00020\r2\n\u0010,\u001a\u00060\u0001j\u0002`-H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010/\u001a \u0010+\u001a\u00020\u0007*\u00020\u00102\n\u0010,\u001a\u00060\u0001j\u0002`-H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u00100\"\u001b\u0010\u0000\u001a\u00020\u00018\u00c2\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012\"!\u0010\u0013\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"!\u0010\u0013\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u000f\"!\u0010\u0013\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"!\u0010\u0016\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"!\u0010\u0016\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u000f\"!\u0010\u0016\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"!\u0010\u0019\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"!\u0010\u0019\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u000f\"!\u0010\u0019\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0012\"!\u0010\u001c\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"!\u0010\u001c\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u000f\"!\u0010\u001c\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0012\"!\u0010\u001f\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\n\u001a\u0004\b!\u0010\f\"!\u0010\u001f\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000f\"!\u0010\u001f\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0012\"!\u0010\"\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010\n\u001a\u0004\b$\u0010\f\"!\u0010\"\u001a\u00020\u0007*\u00020\r8FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u000f\"!\u0010\"\u001a\u00020\u0007*\u00020\u00108FX\u0087\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061" }, d2 = { "storageUnit", "Ljava/util/concurrent/TimeUnit;", "storageUnit$annotations", "()V", "getStorageUnit", "()Ljava/util/concurrent/TimeUnit;", "days", "Lkotlin/time/Duration;", "", "days$annotations", "(D)V", "getDays", "(D)D", "", "(I)V", "(I)D", "", "(J)V", "(J)D", "hours", "hours$annotations", "getHours", "microseconds", "microseconds$annotations", "getMicroseconds", "milliseconds", "milliseconds$annotations", "getMilliseconds", "minutes", "minutes$annotations", "getMinutes", "nanoseconds", "nanoseconds$annotations", "getNanoseconds", "seconds", "seconds$annotations", "getSeconds", "times", "duration", "times-kIfJnKk", "(DD)D", "times-mvk6XK0", "(ID)D", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLjava/util/concurrent/TimeUnit;)D", "(ILjava/util/concurrent/TimeUnit;)D", "(JLjava/util/concurrent/TimeUnit;)D", "kotlin-stdlib" })
public final class DurationKt
{
    private static final TimeUnit getStorageUnit() {
        final int $i$f$getStorageUnit = 0;
        return TimeUnit.NANOSECONDS;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double toDuration(final int $this$toDuration, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        return toDuration((double)$this$toDuration, unit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double toDuration(final long $this$toDuration, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        return toDuration((double)$this$toDuration, unit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double toDuration(final double $this$toDuration, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        final int $i$f$getStorageUnit = 0;
        return Duration.constructor-impl(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit($this$toDuration, unit, TimeUnit.NANOSECONDS));
    }
    
    public static final double getNanoseconds(final int $this$nanoseconds) {
        return toDuration($this$nanoseconds, TimeUnit.NANOSECONDS);
    }
    
    public static final double getNanoseconds(final long $this$nanoseconds) {
        return toDuration($this$nanoseconds, TimeUnit.NANOSECONDS);
    }
    
    public static final double getNanoseconds(final double $this$nanoseconds) {
        return toDuration($this$nanoseconds, TimeUnit.NANOSECONDS);
    }
    
    public static final double getMicroseconds(final int $this$microseconds) {
        return toDuration($this$microseconds, TimeUnit.MICROSECONDS);
    }
    
    public static final double getMicroseconds(final long $this$microseconds) {
        return toDuration($this$microseconds, TimeUnit.MICROSECONDS);
    }
    
    public static final double getMicroseconds(final double $this$microseconds) {
        return toDuration($this$microseconds, TimeUnit.MICROSECONDS);
    }
    
    public static final double getMilliseconds(final int $this$milliseconds) {
        return toDuration($this$milliseconds, TimeUnit.MILLISECONDS);
    }
    
    public static final double getMilliseconds(final long $this$milliseconds) {
        return toDuration($this$milliseconds, TimeUnit.MILLISECONDS);
    }
    
    public static final double getMilliseconds(final double $this$milliseconds) {
        return toDuration($this$milliseconds, TimeUnit.MILLISECONDS);
    }
    
    public static final double getSeconds(final int $this$seconds) {
        return toDuration($this$seconds, TimeUnit.SECONDS);
    }
    
    public static final double getSeconds(final long $this$seconds) {
        return toDuration($this$seconds, TimeUnit.SECONDS);
    }
    
    public static final double getSeconds(final double $this$seconds) {
        return toDuration($this$seconds, TimeUnit.SECONDS);
    }
    
    public static final double getMinutes(final int $this$minutes) {
        return toDuration($this$minutes, TimeUnit.MINUTES);
    }
    
    public static final double getMinutes(final long $this$minutes) {
        return toDuration($this$minutes, TimeUnit.MINUTES);
    }
    
    public static final double getMinutes(final double $this$minutes) {
        return toDuration($this$minutes, TimeUnit.MINUTES);
    }
    
    public static final double getHours(final int $this$hours) {
        return toDuration($this$hours, TimeUnit.HOURS);
    }
    
    public static final double getHours(final long $this$hours) {
        return toDuration($this$hours, TimeUnit.HOURS);
    }
    
    public static final double getHours(final double $this$hours) {
        return toDuration($this$hours, TimeUnit.HOURS);
    }
    
    public static final double getDays(final int $this$days) {
        return toDuration($this$days, TimeUnit.DAYS);
    }
    
    public static final double getDays(final long $this$days) {
        return toDuration($this$days, TimeUnit.DAYS);
    }
    
    public static final double getDays(final double $this$days) {
        return toDuration($this$days, TimeUnit.DAYS);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @InlineOnly
    private static final double times-mvk6XK0(final int $this$times, final double duration) {
        final int n = 0;
        return Duration.times-impl(duration, $this$times);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @InlineOnly
    private static final double times-kIfJnKk(final double $this$times, final double duration) {
        final int n = 0;
        return Duration.times-impl(duration, $this$times);
    }
}
