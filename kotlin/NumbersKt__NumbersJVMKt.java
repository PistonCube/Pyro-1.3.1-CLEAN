// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.internal.InlineOnly;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\tH\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0001*\u00020\tH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\tH\u0087\b¨\u0006\u0016" }, d2 = { "countLeadingZeroBits", "", "", "countOneBits", "countTrailingZeroBits", "fromBits", "", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "isFinite", "", "isInfinite", "isNaN", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "toBits", "toRawBits", "kotlin-stdlib" }, xs = "kotlin/NumbersKt")
class NumbersKt__NumbersJVMKt extends NumbersKt__BigIntegersKt
{
    @InlineOnly
    private static final boolean isNaN(final double $this$isNaN) {
        final int $i$f$isNaN = 0;
        return Double.isNaN($this$isNaN);
    }
    
    @InlineOnly
    private static final boolean isNaN(final float $this$isNaN) {
        final int $i$f$isNaN = 0;
        return Float.isNaN($this$isNaN);
    }
    
    @InlineOnly
    private static final boolean isInfinite(final double $this$isInfinite) {
        final int $i$f$isInfinite = 0;
        return Double.isInfinite($this$isInfinite);
    }
    
    @InlineOnly
    private static final boolean isInfinite(final float $this$isInfinite) {
        final int $i$f$isInfinite = 0;
        return Float.isInfinite($this$isInfinite);
    }
    
    @InlineOnly
    private static final boolean isFinite(final double $this$isFinite) {
        final int $i$f$isFinite = 0;
        return !Double.isInfinite($this$isFinite) && !Double.isNaN($this$isFinite);
    }
    
    @InlineOnly
    private static final boolean isFinite(final float $this$isFinite) {
        final int $i$f$isFinite = 0;
        return !Float.isInfinite($this$isFinite) && !Float.isNaN($this$isFinite);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toBits(final double $this$toBits) {
        final int $i$f$toBits = 0;
        return Double.doubleToLongBits($this$toBits);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toRawBits(final double $this$toRawBits) {
        final int $i$f$toRawBits = 0;
        return Double.doubleToRawLongBits($this$toRawBits);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double fromBits(@NotNull final DoubleCompanionObject $this$fromBits, final long bits) {
        final int $i$f$fromBits = 0;
        return Double.longBitsToDouble(bits);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toBits(final float $this$toBits) {
        final int $i$f$toBits = 0;
        return Float.floatToIntBits($this$toBits);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toRawBits(final float $this$toRawBits) {
        final int $i$f$toRawBits = 0;
        return Float.floatToRawIntBits($this$toRawBits);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float fromBits(@NotNull final FloatCompanionObject $this$fromBits, final int bits) {
        final int $i$f$fromBits = 0;
        return Float.intBitsToFloat(bits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countOneBits(final int $this$countOneBits) {
        final int $i$f$countOneBits = 0;
        return Integer.bitCount($this$countOneBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countLeadingZeroBits(final int $this$countLeadingZeroBits) {
        final int $i$f$countLeadingZeroBits = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countTrailingZeroBits(final int $this$countTrailingZeroBits) {
        final int $i$f$countTrailingZeroBits = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int takeHighestOneBit(final int $this$takeHighestOneBit) {
        final int $i$f$takeHighestOneBit = 0;
        return Integer.highestOneBit($this$takeHighestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int takeLowestOneBit(final int $this$takeLowestOneBit) {
        final int $i$f$takeLowestOneBit = 0;
        return Integer.lowestOneBit($this$takeLowestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int rotateLeft(final int $this$rotateLeft, final int bitCount) {
        final int $i$f$rotateLeft = 0;
        return Integer.rotateLeft($this$rotateLeft, bitCount);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int rotateRight(final int $this$rotateRight, final int bitCount) {
        final int $i$f$rotateRight = 0;
        return Integer.rotateRight($this$rotateRight, bitCount);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countOneBits(final long $this$countOneBits) {
        final int $i$f$countOneBits = 0;
        return Long.bitCount($this$countOneBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countLeadingZeroBits(final long $this$countLeadingZeroBits) {
        final int $i$f$countLeadingZeroBits = 0;
        return Long.numberOfLeadingZeros($this$countLeadingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countTrailingZeroBits(final long $this$countTrailingZeroBits) {
        final int $i$f$countTrailingZeroBits = 0;
        return Long.numberOfTrailingZeros($this$countTrailingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final long takeHighestOneBit(final long $this$takeHighestOneBit) {
        final int $i$f$takeHighestOneBit = 0;
        return Long.highestOneBit($this$takeHighestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final long takeLowestOneBit(final long $this$takeLowestOneBit) {
        final int $i$f$takeLowestOneBit = 0;
        return Long.lowestOneBit($this$takeLowestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final long rotateLeft(final long $this$rotateLeft, final int bitCount) {
        final int $i$f$rotateLeft = 0;
        return Long.rotateLeft($this$rotateLeft, bitCount);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final long rotateRight(final long $this$rotateRight, final int bitCount) {
        final int $i$f$rotateRight = 0;
        return Long.rotateRight($this$rotateRight, bitCount);
    }
    
    public NumbersKt__NumbersJVMKt() {
    }
}
