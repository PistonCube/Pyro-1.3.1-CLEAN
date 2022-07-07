// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.math.MathContext;
import java.math.BigDecimal;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.math.BigInteger;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019" }, d2 = { "and", "Ljava/math/BigInteger;", "other", "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib" }, xs = "kotlin/NumbersKt")
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt
{
    @InlineOnly
    private static final BigInteger plus(@NotNull final BigInteger $this$plus, final BigInteger other) {
        final int $i$f$plus = 0;
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        final BigInteger add = $this$plus.add(other);
        Intrinsics.checkExpressionValueIsNotNull(add, "this.add(other)");
        return add;
    }
    
    @InlineOnly
    private static final BigInteger minus(@NotNull final BigInteger $this$minus, final BigInteger other) {
        final int $i$f$minus = 0;
        Intrinsics.checkParameterIsNotNull($this$minus, "$this$minus");
        final BigInteger subtract = $this$minus.subtract(other);
        Intrinsics.checkExpressionValueIsNotNull(subtract, "this.subtract(other)");
        return subtract;
    }
    
    @InlineOnly
    private static final BigInteger times(@NotNull final BigInteger $this$times, final BigInteger other) {
        final int $i$f$times = 0;
        Intrinsics.checkParameterIsNotNull($this$times, "$this$times");
        final BigInteger multiply = $this$times.multiply(other);
        Intrinsics.checkExpressionValueIsNotNull(multiply, "this.multiply(other)");
        return multiply;
    }
    
    @InlineOnly
    private static final BigInteger div(@NotNull final BigInteger $this$div, final BigInteger other) {
        final int $i$f$div = 0;
        Intrinsics.checkParameterIsNotNull($this$div, "$this$div");
        final BigInteger divide = $this$div.divide(other);
        Intrinsics.checkExpressionValueIsNotNull(divide, "this.divide(other)");
        return divide;
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger rem(@NotNull final BigInteger $this$rem, final BigInteger other) {
        final int $i$f$rem = 0;
        Intrinsics.checkParameterIsNotNull($this$rem, "$this$rem");
        final BigInteger remainder = $this$rem.remainder(other);
        Intrinsics.checkExpressionValueIsNotNull(remainder, "this.remainder(other)");
        return remainder;
    }
    
    @InlineOnly
    private static final BigInteger unaryMinus(@NotNull final BigInteger $this$unaryMinus) {
        final int $i$f$unaryMinus = 0;
        Intrinsics.checkParameterIsNotNull($this$unaryMinus, "$this$unaryMinus");
        final BigInteger negate = $this$unaryMinus.negate();
        Intrinsics.checkExpressionValueIsNotNull(negate, "this.negate()");
        return negate;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inc(@NotNull final BigInteger $this$inc) {
        final int $i$f$inc = 0;
        Intrinsics.checkParameterIsNotNull($this$inc, "$this$inc");
        final BigInteger add = $this$inc.add(BigInteger.ONE);
        Intrinsics.checkExpressionValueIsNotNull(add, "this.add(BigInteger.ONE)");
        return add;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger dec(@NotNull final BigInteger $this$dec) {
        final int $i$f$dec = 0;
        Intrinsics.checkParameterIsNotNull($this$dec, "$this$dec");
        final BigInteger subtract = $this$dec.subtract(BigInteger.ONE);
        Intrinsics.checkExpressionValueIsNotNull(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inv(@NotNull final BigInteger $this$inv) {
        final int $i$f$inv = 0;
        final BigInteger not = $this$inv.not();
        Intrinsics.checkExpressionValueIsNotNull(not, "this.not()");
        return not;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger and(@NotNull final BigInteger $this$and, final BigInteger other) {
        final int $i$f$and = 0;
        final BigInteger and = $this$and.and(other);
        Intrinsics.checkExpressionValueIsNotNull(and, "this.and(other)");
        return and;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger or(@NotNull final BigInteger $this$or, final BigInteger other) {
        final int $i$f$or = 0;
        final BigInteger or = $this$or.or(other);
        Intrinsics.checkExpressionValueIsNotNull(or, "this.or(other)");
        return or;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger xor(@NotNull final BigInteger $this$xor, final BigInteger other) {
        final int $i$f$xor = 0;
        final BigInteger xor = $this$xor.xor(other);
        Intrinsics.checkExpressionValueIsNotNull(xor, "this.xor(other)");
        return xor;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shl(@NotNull final BigInteger $this$shl, final int n) {
        final int $i$f$shl = 0;
        final BigInteger shiftLeft = $this$shl.shiftLeft(n);
        Intrinsics.checkExpressionValueIsNotNull(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shr(@NotNull final BigInteger $this$shr, final int n) {
        final int $i$f$shr = 0;
        final BigInteger shiftRight = $this$shr.shiftRight(n);
        Intrinsics.checkExpressionValueIsNotNull(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(final int $this$toBigInteger) {
        final int $i$f$toBigInteger = 0;
        final BigInteger value = BigInteger.valueOf($this$toBigInteger);
        Intrinsics.checkExpressionValueIsNotNull(value, "BigInteger.valueOf(this.toLong())");
        return value;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(final long $this$toBigInteger) {
        final int $i$f$toBigInteger = 0;
        final BigInteger value = BigInteger.valueOf($this$toBigInteger);
        Intrinsics.checkExpressionValueIsNotNull(value, "BigInteger.valueOf(this)");
        return value;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(@NotNull final BigInteger $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(@NotNull final BigInteger $this$toBigDecimal, final int scale, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal, scale, mathContext);
    }
    
    public NumbersKt__BigIntegersKt() {
    }
}
