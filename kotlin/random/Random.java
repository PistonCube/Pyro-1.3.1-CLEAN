// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.DeprecationLevel;
import kotlin.Deprecated;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.DoubleCompanionObject;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0019" }, d2 = { "Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Companion", "Default", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
public abstract class Random
{
    private static final Random defaultRandom;
    @JvmField
    @NotNull
    @java.lang.Deprecated
    public static final Companion Companion;
    public static final Default Default;
    
    public abstract int nextBits(final int p0);
    
    public int nextInt() {
        return this.nextBits(32);
    }
    
    public int nextInt(final int until) {
        return this.nextInt(0, until);
    }
    
    public int nextInt(final int from, final int until) {
        RandomKt.checkRangeBounds(from, until);
        final int n = until - from;
        if (n > 0 || n == Integer.MIN_VALUE) {
            int nextBits;
            if ((n & -n) == n) {
                final int bitCount = RandomKt.fastLog2(n);
                nextBits = this.nextBits(bitCount);
            }
            else {
                int v = 0;
                int bits;
                do {
                    bits = this.nextInt() >>> 1;
                    v = bits % n;
                } while (bits - v + (n - 1) < 0);
                nextBits = v;
            }
            final int rnd = nextBits;
            return from + rnd;
        }
        int rnd;
        while (true) {
            final int nextInt;
            rnd = (nextInt = this.nextInt());
            if (from > nextInt) {
                continue;
            }
            if (until > nextInt) {
                break;
            }
        }
        return rnd;
    }
    
    public long nextLong() {
        return ((long)this.nextInt() << 32) + this.nextInt();
    }
    
    public long nextLong(final long until) {
        return this.nextLong(0L, until);
    }
    
    public long nextLong(final long from, final long until) {
        RandomKt.checkRangeBounds(from, until);
        final long n = until - from;
        if (n > 0L) {
            long rnd = 0L;
            if ((n & -n) == n) {
                final int nLow = (int)n;
                final int nHigh = (int)(n >>> 32);
                long n2;
                if (nLow != 0) {
                    final int bitCount = RandomKt.fastLog2(nLow);
                    n2 = ((long)this.nextBits(bitCount) & 0xFFFFFFFFL);
                }
                else if (nHigh == 1) {
                    n2 = ((long)this.nextInt() & 0xFFFFFFFFL);
                }
                else {
                    final int bitCount = RandomKt.fastLog2(nHigh);
                    n2 = ((long)this.nextBits(bitCount) << 32) + this.nextInt();
                }
                rnd = n2;
            }
            else {
                long v = 0L;
                long bits;
                do {
                    bits = this.nextLong() >>> 1;
                    v = bits % n;
                } while (bits - v + (n - 1L) < 0L);
                rnd = v;
            }
            return from + rnd;
        }
        long rnd;
        while (true) {
            final long nextLong;
            rnd = (nextLong = this.nextLong());
            if (from > nextLong) {
                continue;
            }
            if (until > nextLong) {
                break;
            }
        }
        return rnd;
    }
    
    public boolean nextBoolean() {
        return this.nextBits(1) != 0;
    }
    
    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(this.nextBits(26), this.nextBits(27));
    }
    
    public double nextDouble(final double until) {
        return this.nextDouble(0.0, until);
    }
    
    public double nextDouble(final double from, final double until) {
        RandomKt.checkRangeBounds(from, until);
        final double size = until - from;
        double n;
        if (Double.isInfinite(size) && (!Double.isInfinite(from) && !Double.isNaN(from)) && (!Double.isInfinite(until) && !Double.isNaN(until))) {
            final double r1 = this.nextDouble() * (until / 2 - from / 2);
            n = from + r1 + r1;
        }
        else {
            n = from + this.nextDouble() * size;
        }
        final double r2 = n;
        return (r2 >= until) ? Math.nextAfter(until, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY()) : r2;
    }
    
    public float nextFloat() {
        return this.nextBits(24) / (float)16777216;
    }
    
    @NotNull
    public byte[] nextBytes(@NotNull final byte[] array, final int fromIndex, final int toIndex) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "array"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* array */
        //     7: arraylength    
        //     8: iconst_0       
        //     9: iload_2         /* fromIndex */
        //    10: istore          4
        //    12: iload           4
        //    14: if_icmple       21
        //    17: pop            
        //    18: goto            50
        //    21: iload           4
        //    23: if_icmplt       50
        //    26: aload_1         /* array */
        //    27: arraylength    
        //    28: iconst_0       
        //    29: iload_3         /* toIndex */
        //    30: istore          4
        //    32: iload           4
        //    34: if_icmple       41
        //    37: pop            
        //    38: goto            50
        //    41: iload           4
        //    43: if_icmplt       50
        //    46: iconst_1       
        //    47: goto            51
        //    50: iconst_0       
        //    51: istore          4
        //    53: iconst_0       
        //    54: istore          5
        //    56: iconst_0       
        //    57: istore          6
        //    59: iload           4
        //    61: ifne            128
        //    64: iconst_0       
        //    65: istore          $i$a$-require-Random$nextBytes$1
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: ldc             "fromIndex ("
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: iload_2         /* fromIndex */
        //    80: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    83: ldc             ") or toIndex ("
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: iload_3         /* toIndex */
        //    89: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    92: ldc             ") are out of range: 0.."
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload_1         /* array */
        //    98: arraylength    
        //    99: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   102: bipush          46
        //   104: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   110: astore          6
        //   112: new             Ljava/lang/IllegalArgumentException;
        //   115: dup            
        //   116: aload           6
        //   118: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   121: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   124: checkcast       Ljava/lang/Throwable;
        //   127: athrow         
        //   128: iload_2         /* fromIndex */
        //   129: iload_3         /* toIndex */
        //   130: if_icmpgt       137
        //   133: iconst_1       
        //   134: goto            138
        //   137: iconst_0       
        //   138: istore          4
        //   140: iconst_0       
        //   141: istore          5
        //   143: iconst_0       
        //   144: istore          6
        //   146: iload           4
        //   148: ifne            205
        //   151: iconst_0       
        //   152: istore          $i$a$-require-Random$nextBytes$2
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: ldc             "fromIndex ("
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: iload_2         /* fromIndex */
        //   167: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   170: ldc             ") must be not greater than toIndex ("
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: iload_3         /* toIndex */
        //   176: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   179: ldc             ")."
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: astore          6
        //   189: new             Ljava/lang/IllegalArgumentException;
        //   192: dup            
        //   193: aload           6
        //   195: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   198: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   201: checkcast       Ljava/lang/Throwable;
        //   204: athrow         
        //   205: iload_3         /* toIndex */
        //   206: iload_2         /* fromIndex */
        //   207: isub           
        //   208: iconst_4       
        //   209: idiv           
        //   210: istore          steps
        //   212: iload_2         /* fromIndex */
        //   213: istore          position
        //   215: iconst_0       
        //   216: istore          6
        //   218: iconst_0       
        //   219: istore          7
        //   221: iconst_0       
        //   222: istore          7
        //   224: iload           steps
        //   226: istore          8
        //   228: iload           7
        //   230: iload           8
        //   232: if_icmpge       305
        //   235: iload           7
        //   237: istore          it
        //   239: iconst_0       
        //   240: istore          $i$a$-repeat-Random$nextBytes$3
        //   242: aload_0         /* this */
        //   243: invokevirtual   kotlin/random/Random.nextInt:()I
        //   246: istore          v
        //   248: aload_1         /* array */
        //   249: iload           position
        //   251: iload           v
        //   253: i2b            
        //   254: bastore        
        //   255: aload_1         /* array */
        //   256: iload           position
        //   258: iconst_1       
        //   259: iadd           
        //   260: iload           v
        //   262: bipush          8
        //   264: iushr          
        //   265: i2b            
        //   266: bastore        
        //   267: aload_1         /* array */
        //   268: iload           position
        //   270: iconst_2       
        //   271: iadd           
        //   272: iload           v
        //   274: bipush          16
        //   276: iushr          
        //   277: i2b            
        //   278: bastore        
        //   279: aload_1         /* array */
        //   280: iload           position
        //   282: iconst_3       
        //   283: iadd           
        //   284: iload           v
        //   286: bipush          24
        //   288: iushr          
        //   289: i2b            
        //   290: bastore        
        //   291: iload           position
        //   293: iconst_4       
        //   294: iadd           
        //   295: istore          position
        //   297: nop            
        //   298: nop            
        //   299: iinc            7, 1
        //   302: goto            228
        //   305: iload_3         /* toIndex */
        //   306: iload           position
        //   308: isub           
        //   309: istore          remainder
        //   311: aload_0         /* this */
        //   312: iload           remainder
        //   314: bipush          8
        //   316: imul           
        //   317: invokevirtual   kotlin/random/Random.nextBits:(I)I
        //   320: istore          vr
        //   322: iconst_0       
        //   323: istore          8
        //   325: iload           remainder
        //   327: istore          9
        //   329: iload           8
        //   331: iload           9
        //   333: if_icmpge       358
        //   336: aload_1         /* array */
        //   337: iload           position
        //   339: iload           i
        //   341: iadd           
        //   342: iload           vr
        //   344: iload           i
        //   346: bipush          8
        //   348: imul           
        //   349: iushr          
        //   350: i2b            
        //   351: bastore        
        //   352: iinc            i, 1
        //   355: goto            329
        //   358: aload_1         /* array */
        //   359: areturn        
        //    StackMapTable: 00 0C FF 00 15 00 05 07 00 02 07 00 8F 01 01 01 00 01 01 53 01 08 40 01 FD 00 4C 01 01 08 40 01 FB 00 42 FD 00 16 01 01 FB 00 4C FC 00 17 01 1C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public byte[] nextBytes(@NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return this.nextBytes(array, 0, array.length);
    }
    
    @NotNull
    public byte[] nextBytes(final int size) {
        return this.nextBytes(new byte[size]);
    }
    
    static {
        Default = new Default(null);
        defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
        Companion = Random.Companion.INSTANCE;
    }
    
    public static final /* synthetic */ Random access$getDefaultRandom$cp() {
        return Random.defaultRandom;
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b" }, d2 = { "Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "()V", "Companion", "Lkotlin/random/Random$Companion;", "Companion$annotations", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "kotlin-stdlib" })
    public static final class Default extends Random
    {
        @Override
        public int nextBits(final int bitCount) {
            return Random.access$getDefaultRandom$cp().nextBits(bitCount);
        }
        
        @Override
        public int nextInt() {
            return Random.access$getDefaultRandom$cp().nextInt();
        }
        
        @Override
        public int nextInt(final int until) {
            return Random.access$getDefaultRandom$cp().nextInt(until);
        }
        
        @Override
        public int nextInt(final int from, final int until) {
            return Random.access$getDefaultRandom$cp().nextInt(from, until);
        }
        
        @Override
        public long nextLong() {
            return Random.access$getDefaultRandom$cp().nextLong();
        }
        
        @Override
        public long nextLong(final long until) {
            return Random.access$getDefaultRandom$cp().nextLong(until);
        }
        
        @Override
        public long nextLong(final long from, final long until) {
            return Random.access$getDefaultRandom$cp().nextLong(from, until);
        }
        
        @Override
        public boolean nextBoolean() {
            return Random.access$getDefaultRandom$cp().nextBoolean();
        }
        
        @Override
        public double nextDouble() {
            return Random.access$getDefaultRandom$cp().nextDouble();
        }
        
        @Override
        public double nextDouble(final double until) {
            return Random.access$getDefaultRandom$cp().nextDouble(until);
        }
        
        @Override
        public double nextDouble(final double from, final double until) {
            return Random.access$getDefaultRandom$cp().nextDouble(from, until);
        }
        
        @Override
        public float nextFloat() {
            return Random.access$getDefaultRandom$cp().nextFloat();
        }
        
        @NotNull
        @Override
        public byte[] nextBytes(@NotNull final byte[] array) {
            Intrinsics.checkParameterIsNotNull(array, "array");
            return Random.access$getDefaultRandom$cp().nextBytes(array);
        }
        
        @NotNull
        @Override
        public byte[] nextBytes(final int size) {
            return Random.access$getDefaultRandom$cp().nextBytes(size);
        }
        
        @NotNull
        @Override
        public byte[] nextBytes(@NotNull final byte[] array, final int fromIndex, final int toIndex) {
            Intrinsics.checkParameterIsNotNull(array, "array");
            return Random.access$getDefaultRandom$cp().nextBytes(array, fromIndex, toIndex);
        }
        
        private Default() {
        }
    }
    
    @Deprecated(message = "Use Default companion object instead", level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006" }, d2 = { "Lkotlin/random/Random$Companion;", "Lkotlin/random/Random;", "()V", "nextBits", "", "bitCount", "kotlin-stdlib" })
    public static final class Companion extends Random
    {
        public static final Companion INSTANCE;
        
        @Override
        public int nextBits(final int bitCount) {
            return Random.Default.nextBits(bitCount);
        }
        
        private Companion() {
        }
        
        static {
            INSTANCE = new Companion();
        }
    }
}
