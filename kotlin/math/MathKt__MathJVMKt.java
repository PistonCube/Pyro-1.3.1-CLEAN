// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.math;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b7\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0007\u001a\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0007\u001a\u0011\u0010,\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0019\u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0011\u00102\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00102\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0087\b\u001a\r\u0010;\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010;\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0001*\u00020\u00012\u0006\u0010=\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0087\b\u001a\r\u0010>\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010>\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010@\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010@\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006C" }, d2 = { "absoluteValue", "", "absoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "sign$annotations", "getSign", "(J)I", "ulp", "ulp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib" }, xs = "kotlin/math/MathKt")
class MathKt__MathJVMKt extends MathKt__MathHKt
{
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(final double x) {
        final int $i$f$sin = 0;
        return Math.sin(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(final double x) {
        final int $i$f$cos = 0;
        return Math.cos(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(final double x) {
        final int $i$f$tan = 0;
        return Math.tan(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(final double x) {
        final int $i$f$asin = 0;
        return Math.asin(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(final double x) {
        final int $i$f$acos = 0;
        return Math.acos(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(final double x) {
        final int $i$f$atan = 0;
        return Math.atan(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(final double y, final double x) {
        final int $i$f$atan2 = 0;
        return Math.atan2(y, x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(final double x) {
        final int $i$f$sinh = 0;
        return Math.sinh(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(final double x) {
        final int $i$f$cosh = 0;
        return Math.cosh(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(final double x) {
        final int $i$f$tanh = 0;
        return Math.tanh(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final double asinh(final double x) {
        double n;
        if (x >= Constants.taylor_n_bound) {
            n = ((x > Constants.upper_taylor_n_bound) ? ((x > Constants.upper_taylor_2_bound) ? (Math.log(x) + Constants.LN2) : Math.log(x * 2 + 1 / (x * 2))) : Math.log(x + Math.sqrt(x * x + 1)));
        }
        else if (x <= -Constants.taylor_n_bound) {
            n = -asinh(-x);
        }
        else {
            double result = x;
            if (Math.abs(x) >= Constants.taylor_2_bound) {
                result -= x * x * x / 6;
            }
            n = result;
        }
        return n;
    }
    
    @SinceKotlin(version = "1.2")
    public static final double acosh(final double x) {
        double n;
        if (x < 1) {
            n = DoubleCompanionObject.INSTANCE.getNaN();
        }
        else if (x > Constants.upper_taylor_2_bound) {
            n = Math.log(x) + Constants.LN2;
        }
        else if (x - 1 >= Constants.taylor_n_bound) {
            n = Math.log(x + Math.sqrt(x * x - 1));
        }
        else {
            double result;
            final double y = result = Math.sqrt(x - 1);
            if (y >= Constants.taylor_2_bound) {
                result -= y * y * y / 12;
            }
            n = Math.sqrt(2.0) * result;
        }
        return n;
    }
    
    @SinceKotlin(version = "1.2")
    public static final double atanh(final double x) {
        if (Math.abs(x) < Constants.taylor_n_bound) {
            double result = x;
            if (Math.abs(x) > Constants.taylor_2_bound) {
                result += x * x * x / 3;
            }
            return result;
        }
        return Math.log((1 + x) / (1 - x)) / 2;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(final double x, final double y) {
        final int $i$f$hypot = 0;
        return Math.hypot(x, y);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(final double x) {
        final int $i$f$sqrt = 0;
        return Math.sqrt(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(final double x) {
        final int $i$f$exp = 0;
        return Math.exp(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(final double x) {
        final int $i$f$expm1 = 0;
        return Math.expm1(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final double log(final double x, final double base) {
        if (base <= 0.0 || base == 1.0) {
            return DoubleCompanionObject.INSTANCE.getNaN();
        }
        return Math.log(x) / Math.log(base);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(final double x) {
        final int $i$f$ln = 0;
        return Math.log(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(final double x) {
        final int $i$f$log10 = 0;
        return Math.log10(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final double log2(final double x) {
        return Math.log(x) / Constants.LN2;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(final double x) {
        final int $i$f$ln1p = 0;
        return Math.log1p(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(final double x) {
        final int $i$f$ceil = 0;
        return Math.ceil(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(final double x) {
        final int $i$f$floor = 0;
        return Math.floor(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final double truncate(final double x) {
        return (Double.isNaN(x) || Double.isInfinite(x)) ? x : ((x > 0) ? Math.floor(x) : Math.ceil(x));
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(final double x) {
        final int $i$f$round = 0;
        return Math.rint(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(final double x) {
        final int $i$f$abs = 0;
        return Math.abs(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(final double x) {
        final int $i$f$sign = 0;
        return Math.signum(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(final double a, final double b) {
        final int $i$f$min = 0;
        return Math.min(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(final double a, final double b) {
        final int $i$f$max = 0;
        return Math.max(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(final double $this$pow, final double x) {
        final int $i$f$pow = 0;
        return Math.pow($this$pow, x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(final double $this$pow, final int n) {
        final int $i$f$pow = 0;
        return Math.pow($this$pow, n);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(final double $this$IEEErem, final double divisor) {
        final int $i$f$IEEErem = 0;
        return Math.IEEEremainder($this$IEEErem, divisor);
    }
    
    private static final double getAbsoluteValue(final double $this$absoluteValue) {
        final int $i$f$getAbsoluteValue = 0;
        return Math.abs($this$absoluteValue);
    }
    
    private static final double getSign(final double $this$sign) {
        final int $i$f$getSign = 0;
        return Math.signum($this$sign);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(final double $this$withSign, final double sign) {
        final int $i$f$withSign = 0;
        return Math.copySign($this$withSign, sign);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(final double $this$withSign, final int sign) {
        final int $i$f$withSign = 0;
        return Math.copySign($this$withSign, sign);
    }
    
    private static final double getUlp(final double $this$ulp) {
        final int $i$f$getUlp = 0;
        return Math.ulp($this$ulp);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(final double $this$nextUp) {
        final int $i$f$nextUp = 0;
        return Math.nextUp($this$nextUp);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(final double $this$nextDown) {
        final int $i$f$nextDown = 0;
        return Math.nextAfter($this$nextDown, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY());
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(final double $this$nextTowards, final double to) {
        final int $i$f$nextTowards = 0;
        return Math.nextAfter($this$nextTowards, to);
    }
    
    @SinceKotlin(version = "1.2")
    public static final int roundToInt(final double $this$roundToInt) {
        if (Double.isNaN($this$roundToInt)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return ($this$roundToInt > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (($this$roundToInt < Integer.MIN_VALUE) ? Integer.MIN_VALUE : ((int)Math.round($this$roundToInt)));
    }
    
    @SinceKotlin(version = "1.2")
    public static final long roundToLong(final double $this$roundToLong) {
        if (Double.isNaN($this$roundToLong)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round($this$roundToLong);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(final float x) {
        final int $i$f$sin = 0;
        return (float)Math.sin(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(final float x) {
        final int $i$f$cos = 0;
        return (float)Math.cos(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(final float x) {
        final int $i$f$tan = 0;
        return (float)Math.tan(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(final float x) {
        final int $i$f$asin = 0;
        return (float)Math.asin(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(final float x) {
        final int $i$f$acos = 0;
        return (float)Math.acos(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(final float x) {
        final int $i$f$atan = 0;
        return (float)Math.atan(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(final float y, final float x) {
        final int $i$f$atan2 = 0;
        return (float)Math.atan2(y, x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(final float x) {
        final int $i$f$sinh = 0;
        return (float)Math.sinh(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(final float x) {
        final int $i$f$cosh = 0;
        return (float)Math.cosh(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(final float x) {
        final int $i$f$tanh = 0;
        return (float)Math.tanh(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(final float x) {
        final int $i$f$asinh = 0;
        return (float)asinh((double)x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(final float x) {
        final int $i$f$acosh = 0;
        return (float)acosh((double)x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(final float x) {
        final int $i$f$atanh = 0;
        return (float)atanh((double)x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(final float x, final float y) {
        final int $i$f$hypot = 0;
        return (float)Math.hypot(x, y);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(final float x) {
        final int $i$f$sqrt = 0;
        return (float)Math.sqrt(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(final float x) {
        final int $i$f$exp = 0;
        return (float)Math.exp(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(final float x) {
        final int $i$f$expm1 = 0;
        return (float)Math.expm1(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final float log(final float x, final float base) {
        if (base <= 0.0f || base == 1.0f) {
            return FloatCompanionObject.INSTANCE.getNaN();
        }
        return (float)(Math.log(x) / Math.log(base));
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(final float x) {
        final int $i$f$ln = 0;
        return (float)Math.log(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(final float x) {
        final int $i$f$log10 = 0;
        return (float)Math.log10(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final float log2(final float x) {
        return (float)(Math.log(x) / Constants.LN2);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(final float x) {
        final int $i$f$ln1p = 0;
        return (float)Math.log1p(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(final float x) {
        final int $i$f$ceil = 0;
        return (float)Math.ceil(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(final float x) {
        final int $i$f$floor = 0;
        return (float)Math.floor(x);
    }
    
    @SinceKotlin(version = "1.2")
    public static final float truncate(final float x) {
        return (Float.isNaN(x) || Float.isInfinite(x)) ? x : ((x > 0) ? ((float)Math.floor(x)) : ((float)Math.ceil(x)));
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(final float x) {
        final int $i$f$round = 0;
        return (float)Math.rint(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(final float x) {
        final int $i$f$abs = 0;
        return Math.abs(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(final float x) {
        final int $i$f$sign = 0;
        return Math.signum(x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(final float a, final float b) {
        final int $i$f$min = 0;
        return Math.min(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(final float a, final float b) {
        final int $i$f$max = 0;
        return Math.max(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(final float $this$pow, final float x) {
        final int $i$f$pow = 0;
        return (float)Math.pow($this$pow, x);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(final float $this$pow, final int n) {
        final int $i$f$pow = 0;
        return (float)Math.pow($this$pow, n);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(final float $this$IEEErem, final float divisor) {
        final int $i$f$IEEErem = 0;
        return (float)Math.IEEEremainder($this$IEEErem, divisor);
    }
    
    private static final float getAbsoluteValue(final float $this$absoluteValue) {
        final int $i$f$getAbsoluteValue = 0;
        return Math.abs($this$absoluteValue);
    }
    
    private static final float getSign(final float $this$sign) {
        final int $i$f$getSign = 0;
        return Math.signum($this$sign);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(final float $this$withSign, final float sign) {
        final int $i$f$withSign = 0;
        return Math.copySign($this$withSign, sign);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(final float $this$withSign, final int sign) {
        final int $i$f$withSign = 0;
        return Math.copySign($this$withSign, (float)sign);
    }
    
    private static final float getUlp(final float $this$ulp) {
        final int $i$f$getUlp = 0;
        return Math.ulp($this$ulp);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(final float $this$nextUp) {
        final int $i$f$nextUp = 0;
        return Math.nextUp($this$nextUp);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(final float $this$nextDown) {
        final int $i$f$nextDown = 0;
        return Math.nextAfter($this$nextDown, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY());
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(final float $this$nextTowards, final float to) {
        final int $i$f$nextTowards = 0;
        return Math.nextAfter($this$nextTowards, to);
    }
    
    @SinceKotlin(version = "1.2")
    public static final int roundToInt(final float $this$roundToInt) {
        if (Float.isNaN($this$roundToInt)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round($this$roundToInt);
    }
    
    @SinceKotlin(version = "1.2")
    public static final long roundToLong(final float $this$roundToLong) {
        return roundToLong((double)$this$roundToLong);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(final int n) {
        final int $i$f$abs = 0;
        return Math.abs(n);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(final int a, final int b) {
        final int $i$f$min = 0;
        return Math.min(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(final int a, final int b) {
        final int $i$f$max = 0;
        return Math.max(a, b);
    }
    
    private static final int getAbsoluteValue(final int $this$absoluteValue) {
        final int $i$f$getAbsoluteValue = 0;
        return Math.abs($this$absoluteValue);
    }
    
    public static final int getSign(final int $this$sign) {
        return ($this$sign < 0) ? -1 : (($this$sign > 0) ? 1 : 0);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(final long n) {
        final int $i$f$abs = 0;
        return Math.abs(n);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(final long a, final long b) {
        final int $i$f$min = 0;
        return Math.min(a, b);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(final long a, final long b) {
        final int $i$f$max = 0;
        return Math.max(a, b);
    }
    
    private static final long getAbsoluteValue(final long $this$absoluteValue) {
        final int $i$f$getAbsoluteValue = 0;
        return Math.abs($this$absoluteValue);
    }
    
    public static final int getSign(final long $this$sign) {
        return ($this$sign < 0L) ? -1 : (($this$sign > 0L) ? 1 : 0);
    }
    
    public MathKt__MathJVMKt() {
    }
}
