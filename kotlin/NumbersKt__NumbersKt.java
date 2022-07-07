// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.InlineOnly;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0087\b¨\u0006\u000b" }, d2 = { "countLeadingZeroBits", "", "", "", "countOneBits", "countTrailingZeroBits", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "kotlin-stdlib" }, xs = "kotlin/NumbersKt")
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countOneBits(final byte $this$countOneBits) {
        final int $i$f$countOneBits = 0;
        return Integer.bitCount($this$countOneBits & 0xFF);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countLeadingZeroBits(final byte $this$countLeadingZeroBits) {
        final int $i$f$countLeadingZeroBits = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 0xFF) - 24;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countTrailingZeroBits(final byte $this$countTrailingZeroBits) {
        final int $i$f$countTrailingZeroBits = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 0x100);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final byte takeHighestOneBit(final byte $this$takeHighestOneBit) {
        final int $i$f$takeHighestOneBit = 0;
        return (byte)Integer.highestOneBit($this$takeHighestOneBit & 0xFF);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final byte takeLowestOneBit(final byte $this$takeLowestOneBit) {
        final int $i$f$takeLowestOneBit = 0;
        return (byte)Integer.lowestOneBit($this$takeLowestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    public static final byte rotateLeft(final byte $this$rotateLeft, final int bitCount) {
        return (byte)($this$rotateLeft << (bitCount & 0x7) | ($this$rotateLeft & 0xFF) >>> 8 - (bitCount & 0x7));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    public static final byte rotateRight(final byte $this$rotateRight, final int bitCount) {
        return (byte)($this$rotateRight << 8 - (bitCount & 0x7) | ($this$rotateRight & 0xFF) >>> (bitCount & 0x7));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countOneBits(final short $this$countOneBits) {
        final int $i$f$countOneBits = 0;
        return Integer.bitCount($this$countOneBits & 0xFFFF);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countLeadingZeroBits(final short $this$countLeadingZeroBits) {
        final int $i$f$countLeadingZeroBits = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 0xFFFF) - 16;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int countTrailingZeroBits(final short $this$countTrailingZeroBits) {
        final int $i$f$countTrailingZeroBits = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 0x10000);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final short takeHighestOneBit(final short $this$takeHighestOneBit) {
        final int $i$f$takeHighestOneBit = 0;
        return (short)Integer.highestOneBit($this$takeHighestOneBit & 0xFFFF);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final short takeLowestOneBit(final short $this$takeLowestOneBit) {
        final int $i$f$takeLowestOneBit = 0;
        return (short)Integer.lowestOneBit($this$takeLowestOneBit);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    public static final short rotateLeft(final short $this$rotateLeft, final int bitCount) {
        return (short)($this$rotateLeft << (bitCount & 0xF) | ($this$rotateLeft & 0xFFFF) >>> 16 - (bitCount & 0xF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    public static final short rotateRight(final short $this$rotateRight, final int bitCount) {
        return (short)($this$rotateRight << 16 - (bitCount & 0xF) | ($this$rotateRight & 0xFFFF) >>> (bitCount & 0xF));
    }
    
    public NumbersKt__NumbersKt() {
    }
}
