// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.experimental;

import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f¨\u0006\u0007" }, d2 = { "and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib" })
public final class BitwiseOperationsKt
{
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(final byte $this$and, final byte other) {
        final int $i$f$and = 0;
        return (byte)($this$and & other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(final byte $this$or, final byte other) {
        final int $i$f$or = 0;
        return (byte)($this$or | other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(final byte $this$xor, final byte other) {
        final int $i$f$xor = 0;
        return (byte)($this$xor ^ other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(final byte $this$inv) {
        final int $i$f$inv = 0;
        return (byte)~$this$inv;
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(final short $this$and, final short other) {
        final int $i$f$and = 0;
        return (short)($this$and & other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(final short $this$or, final short other) {
        final int $i$f$or = 0;
        return (short)($this$or | other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(final short $this$xor, final short other) {
        final int $i$f$xor = 0;
        return (short)($this$xor ^ other);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(final short $this$inv) {
        final int $i$f$inv = 0;
        return (short)~$this$inv;
    }
}
