// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.math.BigDecimal;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0012" }, d2 = { "dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "mod", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib" }, xs = "kotlin/NumbersKt")
class NumbersKt__BigDecimalsKt
{
    @InlineOnly
    private static final BigDecimal plus(@NotNull final BigDecimal $this$plus, final BigDecimal other) {
        final int $i$f$plus = 0;
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        final BigDecimal add = $this$plus.add(other);
        Intrinsics.checkExpressionValueIsNotNull(add, "this.add(other)");
        return add;
    }
    
    @InlineOnly
    private static final BigDecimal minus(@NotNull final BigDecimal $this$minus, final BigDecimal other) {
        final int $i$f$minus = 0;
        Intrinsics.checkParameterIsNotNull($this$minus, "$this$minus");
        final BigDecimal subtract = $this$minus.subtract(other);
        Intrinsics.checkExpressionValueIsNotNull(subtract, "this.subtract(other)");
        return subtract;
    }
    
    @InlineOnly
    private static final BigDecimal times(@NotNull final BigDecimal $this$times, final BigDecimal other) {
        final int $i$f$times = 0;
        Intrinsics.checkParameterIsNotNull($this$times, "$this$times");
        final BigDecimal multiply = $this$times.multiply(other);
        Intrinsics.checkExpressionValueIsNotNull(multiply, "this.multiply(other)");
        return multiply;
    }
    
    @InlineOnly
    private static final BigDecimal div(@NotNull final BigDecimal $this$div, final BigDecimal other) {
        final int $i$f$div = 0;
        Intrinsics.checkParameterIsNotNull($this$div, "$this$div");
        final BigDecimal divide = $this$div.divide(other, RoundingMode.HALF_EVEN);
        Intrinsics.checkExpressionValueIsNotNull(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }
    
    @Deprecated(message = "Use rem(other) instead", replaceWith = @ReplaceWith(imports = {}, expression = "rem(other)"), level = DeprecationLevel.ERROR)
    @InlineOnly
    @java.lang.Deprecated
    private static final BigDecimal mod(@NotNull final BigDecimal $this$mod, final BigDecimal other) {
        final int $i$f$mod = 0;
        Intrinsics.checkParameterIsNotNull($this$mod, "$this$mod");
        final BigDecimal remainder = $this$mod.remainder(other);
        Intrinsics.checkExpressionValueIsNotNull(remainder, "this.remainder(other)");
        return remainder;
    }
    
    @InlineOnly
    private static final BigDecimal rem(@NotNull final BigDecimal $this$rem, final BigDecimal other) {
        final int $i$f$rem = 0;
        Intrinsics.checkParameterIsNotNull($this$rem, "$this$rem");
        final BigDecimal remainder = $this$rem.remainder(other);
        Intrinsics.checkExpressionValueIsNotNull(remainder, "this.remainder(other)");
        return remainder;
    }
    
    @InlineOnly
    private static final BigDecimal unaryMinus(@NotNull final BigDecimal $this$unaryMinus) {
        final int $i$f$unaryMinus = 0;
        Intrinsics.checkParameterIsNotNull($this$unaryMinus, "$this$unaryMinus");
        final BigDecimal negate = $this$unaryMinus.negate();
        Intrinsics.checkExpressionValueIsNotNull(negate, "this.negate()");
        return negate;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal inc(@NotNull final BigDecimal $this$inc) {
        final int $i$f$inc = 0;
        Intrinsics.checkParameterIsNotNull($this$inc, "$this$inc");
        final BigDecimal add = $this$inc.add(BigDecimal.ONE);
        Intrinsics.checkExpressionValueIsNotNull(add, "this.add(BigDecimal.ONE)");
        return add;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal dec(@NotNull final BigDecimal $this$dec) {
        final int $i$f$dec = 0;
        Intrinsics.checkParameterIsNotNull($this$dec, "$this$dec");
        final BigDecimal subtract = $this$dec.subtract(BigDecimal.ONE);
        Intrinsics.checkExpressionValueIsNotNull(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final int $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        final BigDecimal value = BigDecimal.valueOf($this$toBigDecimal);
        Intrinsics.checkExpressionValueIsNotNull(value, "BigDecimal.valueOf(this.toLong())");
        return value;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final int $this$toBigDecimal, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal, mathContext);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final long $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        final BigDecimal value = BigDecimal.valueOf($this$toBigDecimal);
        Intrinsics.checkExpressionValueIsNotNull(value, "BigDecimal.valueOf(this)");
        return value;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final long $this$toBigDecimal, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal, mathContext);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final float $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal(String.valueOf($this$toBigDecimal));
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final float $this$toBigDecimal, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final double $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal(String.valueOf($this$toBigDecimal));
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(final double $this$toBigDecimal, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
    }
    
    public NumbersKt__BigDecimalsKt() {
    }
}
