// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import org.jetbrains.annotations.Nullable;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;
import kotlin.internal.InlineOnly;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001mB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\rH\u00d6\u0001J\u0013\u0010'\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010\u0005J\u0013\u0010)\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010\u0005J\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010\u001dJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010\u000bJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001b\u00100\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\b1\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b3\u0010\u001dJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b4\u0010\u001fJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b5\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b6\u0010\"J\u001b\u00107\u001a\u0002082\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010\u001dJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b=\u0010\u001fJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010\"J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010C\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\bF\u0010\u001dJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\bG\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000¢\u0006\u0004\bI\u0010\"J\u0010\u0010J\u001a\u00020KH\u0087\b¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020SH\u0087\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\rH\u0087\b¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bZ\u0010\u0005J\u0010\u0010[\u001a\u00020\\H\u0087\b¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u0013\u0010c\u001a\u00020\u000eH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bd\u0010MJ\u0013\u0010e\u001a\u00020\u0011H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bf\u0010XJ\u0013\u0010g\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bh\u0010\u0005J\u0013\u0010i\u001a\u00020\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\bj\u0010^J\u001b\u0010k\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f\u00f8\u0001\u0000¢\u0006\u0004\bl\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006n" }, d2 = { "Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "data$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-impl", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-impl", "shr", "shr-impl", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final class ULong implements Comparable<ULong>
{
    private final long data = data;
    public static final long MIN_VALUE = 0L;
    public static final long MAX_VALUE = -1L;
    public static final int SIZE_BYTES = 8;
    public static final int SIZE_BITS = 64;
    public static final Companion Companion;
    
    @InlineOnly
    private int compareTo-VKZWuLQ(final long other) {
        return compareTo-VKZWuLQ(this.data, other);
    }
    
    @NotNull
    @Override
    public String toString() {
        return toString-impl(this.data);
    }
    
    @InlineOnly
    private static final int compareTo-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return UnsignedKt.ulongCompare($this, constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final int compareTo-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return UnsignedKt.ulongCompare($this, constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final int compareTo-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return UnsignedKt.ulongCompare($this, constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static int compareTo-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return UnsignedKt.ulongCompare($this, other);
    }
    
    @InlineOnly
    private static final long plus-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return constructor-impl($this + constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final long plus-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return constructor-impl($this + constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final long plus-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return constructor-impl($this + constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static final long plus-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this + other);
    }
    
    @InlineOnly
    private static final long minus-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return constructor-impl($this - constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final long minus-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return constructor-impl($this - constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final long minus-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return constructor-impl($this - constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static final long minus-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this - other);
    }
    
    @InlineOnly
    private static final long times-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return constructor-impl($this * constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final long times-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return constructor-impl($this * constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final long times-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return constructor-impl($this * constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static final long times-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this * other);
    }
    
    @InlineOnly
    private static final long div-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return UnsignedKt.ulongDivide-eb3DHEI($this, constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final long div-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return UnsignedKt.ulongDivide-eb3DHEI($this, constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final long div-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return UnsignedKt.ulongDivide-eb3DHEI($this, constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static final long div-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return UnsignedKt.ulongDivide-eb3DHEI($this, other);
    }
    
    @InlineOnly
    private static final long rem-7apg3OU(final long $this, final byte other) {
        final int n = 0;
        return UnsignedKt.ulongRemainder-eb3DHEI($this, constructor-impl((long)other & 0xFFL));
    }
    
    @InlineOnly
    private static final long rem-xj2QHRw(final long $this, final short other) {
        final int n = 0;
        return UnsignedKt.ulongRemainder-eb3DHEI($this, constructor-impl((long)other & 0xFFFFL));
    }
    
    @InlineOnly
    private static final long rem-WZ4Q5Ns(final long $this, final int other) {
        final int n = 0;
        return UnsignedKt.ulongRemainder-eb3DHEI($this, constructor-impl((long)other & 0xFFFFFFFFL));
    }
    
    @InlineOnly
    private static final long rem-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return UnsignedKt.ulongRemainder-eb3DHEI($this, other);
    }
    
    @InlineOnly
    private static final long inc-impl(final long $this) {
        final int $i$f$inc = 0;
        return constructor-impl($this + 1L);
    }
    
    @InlineOnly
    private static final long dec-impl(final long $this) {
        final int $i$f$dec = 0;
        return constructor-impl($this - 1L);
    }
    
    @InlineOnly
    private static final ULongRange rangeTo-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return new ULongRange($this, other, null);
    }
    
    @InlineOnly
    private static final long shl-impl(final long $this, final int bitCount) {
        final int $i$f$shl = 0;
        return constructor-impl($this << bitCount);
    }
    
    @InlineOnly
    private static final long shr-impl(final long $this, final int bitCount) {
        final int $i$f$shr = 0;
        return constructor-impl($this >>> bitCount);
    }
    
    @InlineOnly
    private static final long and-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this & other);
    }
    
    @InlineOnly
    private static final long or-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this | other);
    }
    
    @InlineOnly
    private static final long xor-VKZWuLQ(final long $this, final long other) {
        final int n = 0;
        return constructor-impl($this ^ other);
    }
    
    @InlineOnly
    private static final long inv-impl(final long $this) {
        final int $i$f$inv = 0;
        return constructor-impl(~$this);
    }
    
    @InlineOnly
    private static final byte toByte-impl(final long $this) {
        final int $i$f$toByte = 0;
        return (byte)$this;
    }
    
    @InlineOnly
    private static final short toShort-impl(final long $this) {
        final int $i$f$toShort = 0;
        return (short)$this;
    }
    
    @InlineOnly
    private static final int toInt-impl(final long $this) {
        final int $i$f$toInt = 0;
        return (int)$this;
    }
    
    @InlineOnly
    private static final long toLong-impl(final long $this) {
        final int $i$f$toLong = 0;
        return $this;
    }
    
    @InlineOnly
    private static final byte toUByte-impl(final long $this) {
        final int $i$f$toUByte = 0;
        return UByte.constructor-impl((byte)$this);
    }
    
    @InlineOnly
    private static final short toUShort-impl(final long $this) {
        final int $i$f$toUShort = 0;
        return UShort.constructor-impl((short)$this);
    }
    
    @InlineOnly
    private static final int toUInt-impl(final long $this) {
        final int $i$f$toUInt = 0;
        return UInt.constructor-impl((int)$this);
    }
    
    @InlineOnly
    private static final long toULong-impl(final long $this) {
        final int $i$f$toULong = 0;
        return $this;
    }
    
    @InlineOnly
    private static final float toFloat-impl(final long $this) {
        final int $i$f$toFloat = 0;
        return (float)UnsignedKt.ulongToDouble($this);
    }
    
    @InlineOnly
    private static final double toDouble-impl(final long $this) {
        final int $i$f$toDouble = 0;
        return UnsignedKt.ulongToDouble($this);
    }
    
    @NotNull
    public static String toString-impl(final long $this) {
        return UnsignedKt.ulongToString($this);
    }
    
    @PublishedApi
    public static long constructor-impl(final long data) {
        return data;
    }
    
    public static int hashCode-impl(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static boolean equals-impl(final long n, @Nullable final Object o) {
        return o instanceof ULong && n == ((ULong)o).unbox-impl();
    }
    
    public static final boolean equals-impl0(final long p1, final long p2) {
        throw null;
    }
    
    public final /* synthetic */ long unbox-impl() {
        return this.data;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Override
    public int hashCode() {
        return hashCode-impl(this.data);
    }
    
    @Override
    public boolean equals(final Object o) {
        return equals-impl(this.data, o);
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086T\u00f8\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n" }, d2 = { "Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib" })
    public static final class Companion
    {
        private Companion() {
        }
    }
}
