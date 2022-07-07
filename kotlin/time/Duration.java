// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.DoubleCompanionObject;
import org.jetbrains.annotations.Nullable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0000H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\tH\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010-J\u001b\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010,J\u0013\u0010/\u001a\u0002002\b\u0010&\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\tH\u00d6\u0001J\r\u00103\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u000200¢\u0006\u0004\b7\u00105J\r\u00108\u001a\u000200¢\u0006\u0004\b9\u00105J\r\u0010:\u001a\u000200¢\u0006\u0004\b;\u00105J\u001b\u0010<\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b=\u0010,J\u001b\u0010>\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010,J\u0017\u0010@\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010(J\u001b\u0010B\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010,J\u001b\u0010B\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\tH\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010-J\u008d\u0001\u0010D\u001a\u0002HE\"\u0004\b\u0000\u0010E2u\u0010F\u001aq\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(L\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HE0GH\u0086\b¢\u0006\u0004\bO\u0010PJx\u0010D\u001a\u0002HE\"\u0004\b\u0000\u0010E2`\u0010F\u001a\\\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(K\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(L\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HE0QH\u0086\b¢\u0006\u0004\bO\u0010RJc\u0010D\u001a\u0002HE\"\u0004\b\u0000\u0010E2K\u0010F\u001aG\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(L\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HE0SH\u0086\b¢\u0006\u0004\bO\u0010TJN\u0010D\u001a\u0002HE\"\u0004\b\u0000\u0010E26\u0010F\u001a2\u0012\u0013\u0012\u00110V¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\t¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(N\u0012\u0004\u0012\u0002HE0UH\u0086\b¢\u0006\u0004\bO\u0010WJ\u0019\u0010X\u001a\u00020\u00032\n\u0010Y\u001a\u00060Zj\u0002`[¢\u0006\u0004\b\\\u0010]J\u0019\u0010^\u001a\u00020\t2\n\u0010Y\u001a\u00060Zj\u0002`[¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u0019\u0010e\u001a\u00020V2\n\u0010Y\u001a\u00060Zj\u0002`[¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020V¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020V¢\u0006\u0004\bl\u0010jJ\u000f\u0010m\u001a\u00020bH\u0016¢\u0006\u0004\bn\u0010dJ#\u0010m\u001a\u00020b2\n\u0010Y\u001a\u00060Zj\u0002`[2\b\b\u0002\u0010o\u001a\u00020\t¢\u0006\u0004\bn\u0010pJ\u0013\u0010q\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\br\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00008F\u00f8\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001c\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006t" }, d2 = { "Lkotlin/time/Duration;", "", "value", "", "constructor-impl", "(D)D", "absoluteValue", "getAbsoluteValue-impl", "hoursComponent", "", "hoursComponent$annotations", "()V", "getHoursComponent-impl", "(D)I", "inDays", "getInDays-impl", "inHours", "getInHours-impl", "inMicroseconds", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds-impl", "inMinutes", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds-impl", "inSeconds", "getInSeconds-impl", "minutesComponent", "minutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "nanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "secondsComponent$annotations", "getSecondsComponent-impl", "compareTo", "other", "compareTo-LRDsOJo", "(DD)I", "div", "scale", "div-impl", "(DD)D", "(DI)D", "div-LRDsOJo", "equals", "", "", "hashCode", "isFinite", "isFinite-impl", "(D)Z", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "plus", "plus-LRDsOJo", "precision", "precision-impl", "times", "times-impl", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(DLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(DLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(DLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "(DLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "toDouble-impl", "(DLjava/util/concurrent/TimeUnit;)D", "toInt", "toInt-impl", "(DLjava/util/concurrent/TimeUnit;)I", "toIsoString", "", "toIsoString-impl", "(D)Ljava/lang/String;", "toLong", "toLong-impl", "(DLjava/util/concurrent/TimeUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "(D)J", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(DLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-impl", "Companion", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
@ExperimentalTime
public final class Duration implements Comparable<Duration>
{
    private final double value = value;
    private static final double ZERO;
    private static final double INFINITE;
    public static final Companion Companion;
    
    public int compareTo-LRDsOJo(final double other) {
        return compareTo-LRDsOJo(this.value, other);
    }
    
    @NotNull
    @Override
    public String toString() {
        return toString-impl(this.value);
    }
    
    public static final double unaryMinus-impl(final double $this) {
        return constructor-impl(-$this);
    }
    
    public static final double plus-LRDsOJo(final double $this, final double other) {
        return constructor-impl($this + other);
    }
    
    public static final double minus-LRDsOJo(final double $this, final double other) {
        return constructor-impl($this - other);
    }
    
    public static final double times-impl(final double $this, final int scale) {
        return constructor-impl($this * scale);
    }
    
    public static final double times-impl(final double $this, final double scale) {
        return constructor-impl($this * scale);
    }
    
    public static final double div-impl(final double $this, final int scale) {
        return constructor-impl($this / scale);
    }
    
    public static final double div-impl(final double $this, final double scale) {
        return constructor-impl($this / scale);
    }
    
    public static final double div-LRDsOJo(final double $this, final double other) {
        return $this / other;
    }
    
    public static final boolean isNegative-impl(final double $this) {
        return $this < 0;
    }
    
    public static final boolean isPositive-impl(final double $this) {
        return $this > 0;
    }
    
    public static final boolean isInfinite-impl(final double $this) {
        return Double.isInfinite($this);
    }
    
    public static final boolean isFinite-impl(final double $this) {
        return !Double.isInfinite($this) && !Double.isNaN($this);
    }
    
    public static final double getAbsoluteValue-impl(final double $this) {
        return isNegative-impl($this) ? unaryMinus-impl($this) : $this;
    }
    
    public static int compareTo-LRDsOJo(final double $this, final double other) {
        return Double.compare($this, other);
    }
    
    public static final <T> T toComponents-impl(final double $this, @NotNull final Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        final int $i$f$toComponents = 0;
        Intrinsics.checkParameterIsNotNull(action, "action");
        return (T)action.invoke((int)getInDays-impl($this), getHoursComponent-impl($this), getMinutesComponent-impl($this), getSecondsComponent-impl($this), getNanosecondsComponent-impl($this));
    }
    
    public static final <T> T toComponents-impl(final double $this, @NotNull final Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        final int $i$f$toComponents = 0;
        Intrinsics.checkParameterIsNotNull(action, "action");
        return (T)action.invoke((int)getInHours-impl($this), getMinutesComponent-impl($this), getSecondsComponent-impl($this), getNanosecondsComponent-impl($this));
    }
    
    public static final <T> T toComponents-impl(final double $this, @NotNull final Function3<? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        final int $i$f$toComponents = 0;
        Intrinsics.checkParameterIsNotNull(action, "action");
        return (T)action.invoke((int)getInMinutes-impl($this), getSecondsComponent-impl($this), getNanosecondsComponent-impl($this));
    }
    
    public static final <T> T toComponents-impl(final double $this, @NotNull final Function2<? super Long, ? super Integer, ? extends T> action) {
        final int $i$f$toComponents = 0;
        Intrinsics.checkParameterIsNotNull(action, "action");
        return (T)action.invoke((long)getInSeconds-impl($this), getNanosecondsComponent-impl($this));
    }
    
    public static final int getHoursComponent-impl(final double $this) {
        return (int)(getInHours-impl($this) % 24);
    }
    
    public static final int getMinutesComponent-impl(final double $this) {
        return (int)(getInMinutes-impl($this) % 60);
    }
    
    public static final int getSecondsComponent-impl(final double $this) {
        return (int)(getInSeconds-impl($this) % 60);
    }
    
    public static final int getNanosecondsComponent-impl(final double $this) {
        return (int)(getInNanoseconds-impl($this) % 1.0E9);
    }
    
    public static final double toDouble-impl(final double $this, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit($this, DurationKt.access$getStorageUnit$p(), unit);
    }
    
    public static final long toLong-impl(final double $this, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        return (long)toDouble-impl($this, unit);
    }
    
    public static final int toInt-impl(final double $this, @NotNull final TimeUnit unit) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        return (int)toDouble-impl($this, unit);
    }
    
    public static final double getInDays-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.DAYS);
    }
    
    public static final double getInHours-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.HOURS);
    }
    
    public static final double getInMinutes-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.MINUTES);
    }
    
    public static final double getInSeconds-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.SECONDS);
    }
    
    public static final double getInMilliseconds-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.MILLISECONDS);
    }
    
    public static final double getInMicroseconds-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.MICROSECONDS);
    }
    
    public static final double getInNanoseconds-impl(final double $this) {
        return toDouble-impl($this, TimeUnit.NANOSECONDS);
    }
    
    public static final long toLongNanoseconds-impl(final double $this) {
        return toLong-impl($this, TimeUnit.NANOSECONDS);
    }
    
    public static final long toLongMilliseconds-impl(final double $this) {
        return toLong-impl($this, TimeUnit.MILLISECONDS);
    }
    
    @NotNull
    public static String toString-impl(final double $this) {
        String s;
        if (isInfinite-impl($this)) {
            s = String.valueOf($this);
        }
        else if ($this == 0.0) {
            s = "0s";
        }
        else {
            final double absNs = getInNanoseconds-impl(getAbsoluteValue-impl($this));
            boolean scientific = false;
            int maxDecimals = 0;
            TimeUnit timeUnit;
            if (absNs < 1.0E-6) {
                final TimeUnit it = TimeUnit.SECONDS;
                final int n = 0;
                scientific = true;
                timeUnit = it;
            }
            else if (absNs < 1) {
                final TimeUnit it = TimeUnit.NANOSECONDS;
                final int n2 = 0;
                maxDecimals = 7;
                timeUnit = it;
            }
            else if (absNs < 1000.0) {
                timeUnit = TimeUnit.NANOSECONDS;
            }
            else if (absNs < 1000000.0) {
                timeUnit = TimeUnit.MICROSECONDS;
            }
            else if (absNs < 1.0E9) {
                timeUnit = TimeUnit.MILLISECONDS;
            }
            else if (absNs < 1.0E12) {
                timeUnit = TimeUnit.SECONDS;
            }
            else if (absNs < 6.0E13) {
                timeUnit = TimeUnit.MINUTES;
            }
            else if (absNs < 3.6E15) {
                timeUnit = TimeUnit.HOURS;
            }
            else if (absNs < 8.64E20) {
                timeUnit = TimeUnit.DAYS;
            }
            else {
                final TimeUnit it = TimeUnit.DAYS;
                final int n3 = 0;
                scientific = true;
                timeUnit = it;
            }
            final TimeUnit unit = timeUnit;
            final double value = toDouble-impl($this, unit);
            StringBuilder sb2;
            final StringBuilder sb = sb2 = new StringBuilder();
            String str;
            if (scientific) {
                str = FormatToDecimalsKt.formatScientific(value);
            }
            else if (maxDecimals > 0) {
                str = FormatToDecimalsKt.formatUpToDecimals(value, maxDecimals);
            }
            else {
                final double value2 = value;
                final StringBuilder sb3 = sb;
                final double abs = Math.abs(value);
                sb2 = sb3;
                str = FormatToDecimalsKt.formatToExactDecimals(value2, precision-impl($this, abs));
            }
            s = sb2.append(str).append(DurationUnitKt__DurationUnitKt.shortName(unit)).toString();
        }
        return s;
    }
    
    private static final int precision-impl(final double $this, final double value) {
        return (value < 1) ? 3 : ((value < 10) ? 2 : ((value < 100) ? 1 : 0));
    }
    
    @NotNull
    public static final String toString-impl(final double $this, @NotNull final TimeUnit unit, final int decimals) {
        Intrinsics.checkParameterIsNotNull(unit, "unit");
        if (decimals < 0) {
            final int n = 0;
            throw new IllegalArgumentException(("decimals must be not negative, but was " + decimals).toString());
        }
        if (isInfinite-impl($this)) {
            return String.valueOf($this);
        }
        final double number = toDouble-impl($this, unit);
        return ((Math.abs(number) < 1.0E14) ? FormatToDecimalsKt.formatToExactDecimals(number, RangesKt___RangesKt.coerceAtMost(decimals, 12)) : FormatToDecimalsKt.formatScientific(number)) + DurationUnitKt__DurationUnitKt.shortName(unit);
    }
    
    @NotNull
    public static final String toIsoString-impl(final double $this) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: new             Ljava/lang/StringBuilder;
        //     5: dup            
        //     6: invokespecial   java/lang/StringBuilder.<init>:()V
        //     9: astore_3       
        //    10: iconst_0       
        //    11: istore          4
        //    13: iconst_0       
        //    14: istore          5
        //    16: aload_3        
        //    17: astore          $this$buildString
        //    19: iconst_0       
        //    20: istore          $i$a$-buildString-Duration$toIsoString$1
        //    22: dload_0         /* $this */
        //    23: invokestatic    kotlin/time/Duration.isNegative-impl:(D)Z
        //    26: ifeq            37
        //    29: aload           $this$buildString
        //    31: bipush          45
        //    33: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload           $this$buildString
        //    39: ldc_w           "PT"
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: pop            
        //    46: dload_0         /* $this */
        //    47: invokestatic    kotlin/time/Duration.getAbsoluteValue-impl:(D)D
        //    50: dstore          $this$iv
        //    52: iconst_0       
        //    53: istore          $i$f$toComponents
        //    55: dload           $this$iv
        //    57: invokestatic    kotlin/time/Duration.getInHours-impl:(D)D
        //    60: d2i            
        //    61: dload           $this$iv
        //    63: invokestatic    kotlin/time/Duration.getMinutesComponent-impl:(D)I
        //    66: dload           $this$iv
        //    68: invokestatic    kotlin/time/Duration.getSecondsComponent-impl:(D)I
        //    71: dload           $this$iv
        //    73: invokestatic    kotlin/time/Duration.getNanosecondsComponent-impl:(D)I
        //    76: istore          11
        //    78: istore          12
        //    80: istore          13
        //    82: istore          hours
        //    84: iconst_0       
        //    85: istore          $i$a$-toComponents-Duration$toIsoString$1$1
        //    87: iload           hours
        //    89: ifeq            96
        //    92: iconst_1       
        //    93: goto            97
        //    96: iconst_0       
        //    97: istore          hasHours
        //    99: iload           seconds
        //   101: ifne            109
        //   104: iload           nanoseconds
        //   106: ifeq            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: istore          hasSeconds
        //   116: iload           minutes
        //   118: ifne            131
        //   121: iload           hasSeconds
        //   123: ifeq            135
        //   126: iload           hasHours
        //   128: ifeq            135
        //   131: iconst_1       
        //   132: goto            136
        //   135: iconst_0       
        //   136: istore          hasMinutes
        //   138: iload           hasHours
        //   140: ifeq            156
        //   143: aload           $this$buildString
        //   145: iload           hours
        //   147: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   150: bipush          72
        //   152: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   155: pop            
        //   156: iload           hasMinutes
        //   158: ifeq            174
        //   161: aload           $this$buildString
        //   163: iload           minutes
        //   165: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   168: bipush          77
        //   170: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   173: pop            
        //   174: iload           hasSeconds
        //   176: ifne            189
        //   179: iload           hasHours
        //   181: ifne            292
        //   184: iload           hasMinutes
        //   186: ifne            292
        //   189: aload           $this$buildString
        //   191: iload           seconds
        //   193: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   196: pop            
        //   197: iload           nanoseconds
        //   199: ifeq            284
        //   202: aload           $this$buildString
        //   204: bipush          46
        //   206: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   209: pop            
        //   210: iload           nanoseconds
        //   212: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   215: bipush          9
        //   217: bipush          48
        //   219: invokestatic    kotlin/text/StringsKt.padStart:(Ljava/lang/String;IC)Ljava/lang/String;
        //   222: astore          nss
        //   224: nop            
        //   225: iload           nanoseconds
        //   227: ldc_w           1000000
        //   230: irem           
        //   231: ifne            250
        //   234: aload           $this$buildString
        //   236: aload           nss
        //   238: checkcast       Ljava/lang/CharSequence;
        //   241: iconst_0       
        //   242: iconst_3       
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: goto            284
        //   250: iload           nanoseconds
        //   252: sipush          1000
        //   255: irem           
        //   256: ifne            276
        //   259: aload           $this$buildString
        //   261: aload           nss
        //   263: checkcast       Ljava/lang/CharSequence;
        //   266: iconst_0       
        //   267: bipush          6
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
        //   272: pop            
        //   273: goto            284
        //   276: aload           $this$buildString
        //   278: aload           nss
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: aload           $this$buildString
        //   286: bipush          83
        //   288: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: nop            
        //   293: nop            
        //   294: nop            
        //   295: nop            
        //   296: aload_3        
        //   297: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   300: dup            
        //   301: ldc_w           "StringBuilder().apply(builderAction).toString()"
        //   304: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   307: areturn        
        //    StackMapTable: 00 10 FF 00 25 00 07 03 01 07 01 35 01 01 07 01 35 01 00 00 FF 00 3A 00 0E 03 01 07 01 35 01 01 07 01 35 01 03 01 01 01 01 01 01 00 00 40 01 FC 00 0B 01 03 40 01 FC 00 10 01 03 40 01 FC 00 13 01 11 0E FC 00 3C 07 01 1F 19 FA 00 07 07
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static double constructor-impl(final double value) {
        return value;
    }
    
    public static int hashCode-impl(final double value) {
        final long doubleToLongBits = Double.doubleToLongBits(value);
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    public static boolean equals-impl(final double d1, @Nullable final Object o) {
        return o instanceof Duration && Double.compare(d1, ((Duration)o).unbox-impl()) == 0;
    }
    
    public static final boolean equals-impl0(final double p1, final double p2) {
        throw null;
    }
    
    public final /* synthetic */ double unbox-impl() {
        return this.value;
    }
    
    static {
        Companion = new Companion(null);
        ZERO = constructor-impl(0.0);
        INFINITE = constructor-impl(DoubleCompanionObject.INSTANCE.getPOSITIVE_INFINITY());
    }
    
    public static final /* synthetic */ double access$getZERO$cp() {
        return Duration.ZERO;
    }
    
    public static final /* synthetic */ double access$getINFINITE$cp() {
        return Duration.INFINITE;
    }
    
    @Override
    public int hashCode() {
        return hashCode-impl(this.value);
    }
    
    @Override
    public boolean equals(final Object o) {
        return equals-impl(this.value, o);
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u0016\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u0004\u00f8\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE", "()D", "D", "ZERO", "getZERO", "convert", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "kotlin-stdlib" })
    public static final class Companion
    {
        public final double getZERO() {
            return Duration.access$getZERO$cp();
        }
        
        public final double getINFINITE() {
            return Duration.access$getINFINITE$cp();
        }
        
        public final double convert(final double value, @NotNull final TimeUnit sourceUnit, @NotNull final TimeUnit targetUnit) {
            Intrinsics.checkParameterIsNotNull(sourceUnit, "sourceUnit");
            Intrinsics.checkParameterIsNotNull(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }
        
        private Companion() {
        }
    }
}
