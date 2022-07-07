// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\r\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u001a\u001f\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010\u001b\u001a\u001f\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\u001f\u001a\u001f\u0010\"\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010!\u001a\u0017\u0010'\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010'\u001a\u00020\u0005*\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010\u0007\u001a\u0017\u0010'\u001a\u00020\b*\u00020\bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010'\u001a\u00020\u000b*\u00020\u000bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b0\u0010)\u001a\u0017\u0010/\u001a\u00020\u0005*\u00020\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b1\u0010\u0007\u001a\u0017\u0010/\u001a\u00020\b*\u00020\bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b2\u0010,\u001a\u0017\u0010/\u001a\u00020\u000b*\u00020\u000bH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b3\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064" }, d2 = { "countLeadingZeroBits", "", "Lkotlin/UByte;", "countLeadingZeroBits-7apg3OU", "(B)I", "Lkotlin/UInt;", "countLeadingZeroBits-WZ4Q5Ns", "(I)I", "Lkotlin/ULong;", "countLeadingZeroBits-VKZWuLQ", "(J)I", "Lkotlin/UShort;", "countLeadingZeroBits-xj2QHRw", "(S)I", "countOneBits", "countOneBits-7apg3OU", "countOneBits-WZ4Q5Ns", "countOneBits-VKZWuLQ", "countOneBits-xj2QHRw", "countTrailingZeroBits", "countTrailingZeroBits-7apg3OU", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits-VKZWuLQ", "countTrailingZeroBits-xj2QHRw", "rotateLeft", "bitCount", "rotateLeft-LxnNnR4", "(BI)B", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft-JSWoG40", "(JI)J", "rotateLeft-olVBNx4", "(SI)S", "rotateRight", "rotateRight-LxnNnR4", "rotateRight-V7xB4Y4", "rotateRight-JSWoG40", "rotateRight-olVBNx4", "takeHighestOneBit", "takeHighestOneBit-7apg3OU", "(B)B", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit", "takeLowestOneBit-7apg3OU", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit-VKZWuLQ", "takeLowestOneBit-xj2QHRw", "kotlin-stdlib" })
@JvmName(name = "UNumbersKt")
public final class UNumbersKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countOneBits-WZ4Q5Ns(final int $this$countOneBits) {
        final int n = 0;
        return Integer.bitCount($this$countOneBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countLeadingZeroBits-WZ4Q5Ns(final int $this$countLeadingZeroBits) {
        final int n = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countTrailingZeroBits-WZ4Q5Ns(final int $this$countTrailingZeroBits) {
        final int n = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int takeHighestOneBit-WZ4Q5Ns(final int $this$takeHighestOneBit) {
        final int n = 0;
        return UInt.constructor-impl(Integer.highestOneBit($this$takeHighestOneBit));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int takeLowestOneBit-WZ4Q5Ns(final int $this$takeLowestOneBit) {
        final int n = 0;
        return UInt.constructor-impl(Integer.lowestOneBit($this$takeLowestOneBit));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int rotateLeft-V7xB4Y4(final int $this$rotateLeft, final int bitCount) {
        final int n = 0;
        return UInt.constructor-impl(Integer.rotateLeft($this$rotateLeft, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int rotateRight-V7xB4Y4(final int $this$rotateRight, final int bitCount) {
        final int n = 0;
        return UInt.constructor-impl(Integer.rotateRight($this$rotateRight, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countOneBits-VKZWuLQ(final long $this$countOneBits) {
        final int n = 0;
        return Long.bitCount($this$countOneBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countLeadingZeroBits-VKZWuLQ(final long $this$countLeadingZeroBits) {
        final int n = 0;
        return Long.numberOfLeadingZeros($this$countLeadingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countTrailingZeroBits-VKZWuLQ(final long $this$countTrailingZeroBits) {
        final int n = 0;
        return Long.numberOfTrailingZeros($this$countTrailingZeroBits);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long takeHighestOneBit-VKZWuLQ(final long $this$takeHighestOneBit) {
        final int n = 0;
        return ULong.constructor-impl(Long.highestOneBit($this$takeHighestOneBit));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long takeLowestOneBit-VKZWuLQ(final long $this$takeLowestOneBit) {
        final int n = 0;
        return ULong.constructor-impl(Long.lowestOneBit($this$takeLowestOneBit));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long rotateLeft-JSWoG40(final long $this$rotateLeft, final int bitCount) {
        final int n = 0;
        return ULong.constructor-impl(Long.rotateLeft($this$rotateLeft, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long rotateRight-JSWoG40(final long $this$rotateRight, final int bitCount) {
        final int n = 0;
        return ULong.constructor-impl(Long.rotateRight($this$rotateRight, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countOneBits-7apg3OU(final byte $this$countOneBits) {
        final int n = 0;
        return Integer.bitCount(UInt.constructor-impl($this$countOneBits & 0xFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countLeadingZeroBits-7apg3OU(final byte $this$countLeadingZeroBits) {
        final int n = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 0xFF) - 24;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countTrailingZeroBits-7apg3OU(final byte $this$countTrailingZeroBits) {
        final int n = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 0x100);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte takeHighestOneBit-7apg3OU(final byte $this$takeHighestOneBit) {
        final int n = 0;
        return UByte.constructor-impl((byte)Integer.highestOneBit($this$takeHighestOneBit & 0xFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte takeLowestOneBit-7apg3OU(final byte $this$takeLowestOneBit) {
        final int n = 0;
        return UByte.constructor-impl((byte)Integer.lowestOneBit($this$takeLowestOneBit & 0xFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte rotateLeft-LxnNnR4(final byte $this$rotateLeft, final int bitCount) {
        final int n = 0;
        return UByte.constructor-impl(NumbersKt__NumbersKt.rotateLeft($this$rotateLeft, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte rotateRight-LxnNnR4(final byte $this$rotateRight, final int bitCount) {
        final int n = 0;
        return UByte.constructor-impl(NumbersKt__NumbersKt.rotateRight($this$rotateRight, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countOneBits-xj2QHRw(final short $this$countOneBits) {
        final int n = 0;
        return Integer.bitCount(UInt.constructor-impl($this$countOneBits & 0xFFFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countLeadingZeroBits-xj2QHRw(final short $this$countLeadingZeroBits) {
        final int n = 0;
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 0xFFFF) - 16;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int countTrailingZeroBits-xj2QHRw(final short $this$countTrailingZeroBits) {
        final int n = 0;
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 0x10000);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short takeHighestOneBit-xj2QHRw(final short $this$takeHighestOneBit) {
        final int n = 0;
        return UShort.constructor-impl((short)Integer.highestOneBit($this$takeHighestOneBit & 0xFFFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short takeLowestOneBit-xj2QHRw(final short $this$takeLowestOneBit) {
        final int n = 0;
        return UShort.constructor-impl((short)Integer.lowestOneBit($this$takeLowestOneBit & 0xFFFF));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short rotateLeft-olVBNx4(final short $this$rotateLeft, final int bitCount) {
        final int n = 0;
        return UShort.constructor-impl(NumbersKt__NumbersKt.rotateLeft($this$rotateLeft, bitCount));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short rotateRight-olVBNx4(final short $this$rotateRight, final int bitCount) {
        final int n = 0;
        return UShort.constructor-impl(NumbersKt__NumbersKt.rotateRight($this$rotateRight, bitCount));
    }
}
