// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.Nullable;
import kotlin.ULong;
import kotlin.UInt;
import kotlin.UShort;
import kotlin.UByte;
import kotlin.UnsignedKt;
import org.jetbrains.annotations.NotNull;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib" })
@JvmName(name = "UStringsKt")
public final class UStringsKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String toString-LxnNnR4(final byte $this$toString, final int radix) {
        final String string = Integer.toString($this$toString & 0xFF, CharsKt__CharJVMKt.checkRadix(radix));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String toString-olVBNx4(final short $this$toString, final int radix) {
        final String string = Integer.toString($this$toString & 0xFFFF, CharsKt__CharJVMKt.checkRadix(radix));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String toString-V7xB4Y4(final int $this$toString, final int radix) {
        final String string = Long.toString((long)$this$toString & 0xFFFFFFFFL, CharsKt__CharJVMKt.checkRadix(radix));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Long.toString(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String toString-JSWoG40(final long $this$toString, final int radix) {
        return UnsignedKt.ulongToString($this$toString, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte toUByte(@NotNull final String $this$toUByte) {
        Intrinsics.checkParameterIsNotNull($this$toUByte, "$this$toUByte");
        final UByte uByteOrNull = toUByteOrNull($this$toUByte);
        if (uByteOrNull != null) {
            return uByteOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUByte);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte toUByte(@NotNull final String $this$toUByte, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toUByte, "$this$toUByte");
        final UByte uByteOrNull = toUByteOrNull($this$toUByte, radix);
        if (uByteOrNull != null) {
            return uByteOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUByte);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short toUShort(@NotNull final String $this$toUShort) {
        Intrinsics.checkParameterIsNotNull($this$toUShort, "$this$toUShort");
        final UShort uShortOrNull = toUShortOrNull($this$toUShort);
        if (uShortOrNull != null) {
            return uShortOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUShort);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short toUShort(@NotNull final String $this$toUShort, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toUShort, "$this$toUShort");
        final UShort uShortOrNull = toUShortOrNull($this$toUShort, radix);
        if (uShortOrNull != null) {
            return uShortOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUShort);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int toUInt(@NotNull final String $this$toUInt) {
        Intrinsics.checkParameterIsNotNull($this$toUInt, "$this$toUInt");
        final UInt uIntOrNull = toUIntOrNull($this$toUInt);
        if (uIntOrNull != null) {
            return uIntOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUInt);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int toUInt(@NotNull final String $this$toUInt, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toUInt, "$this$toUInt");
        final UInt uIntOrNull = toUIntOrNull($this$toUInt, radix);
        if (uIntOrNull != null) {
            return uIntOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toUInt);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long toULong(@NotNull final String $this$toULong) {
        Intrinsics.checkParameterIsNotNull($this$toULong, "$this$toULong");
        final ULong uLongOrNull = toULongOrNull($this$toULong);
        if (uLongOrNull != null) {
            return uLongOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toULong);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long toULong(@NotNull final String $this$toULong, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toULong, "$this$toULong");
        final ULong uLongOrNull = toULongOrNull($this$toULong, radix);
        if (uLongOrNull != null) {
            return uLongOrNull.unbox-impl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError($this$toULong);
        throw null;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UByte toUByteOrNull(@NotNull final String $this$toUByteOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toUByteOrNull, "$this$toUByteOrNull");
        return toUByteOrNull($this$toUByteOrNull, 10);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UByte toUByteOrNull(@NotNull final String $this$toUByteOrNull, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toUByteOrNull, "$this$toUByteOrNull");
        final UInt uIntOrNull = toUIntOrNull($this$toUByteOrNull, radix);
        if (uIntOrNull == null) {
            return null;
        }
        final int int1 = uIntOrNull.unbox-impl();
        if (UnsignedKt.uintCompare(int1, UInt.constructor-impl(-1 & 0xFF)) > 0) {
            return null;
        }
        return UByte.box-impl(UByte.constructor-impl((byte)int1));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UShort toUShortOrNull(@NotNull final String $this$toUShortOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toUShortOrNull, "$this$toUShortOrNull");
        return toUShortOrNull($this$toUShortOrNull, 10);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UShort toUShortOrNull(@NotNull final String $this$toUShortOrNull, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toUShortOrNull, "$this$toUShortOrNull");
        final UInt uIntOrNull = toUIntOrNull($this$toUShortOrNull, radix);
        if (uIntOrNull == null) {
            return null;
        }
        final int int1 = uIntOrNull.unbox-impl();
        if (UnsignedKt.uintCompare(int1, UInt.constructor-impl(-1 & 0xFFFF)) > 0) {
            return null;
        }
        return UShort.box-impl(UShort.constructor-impl((short)int1));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UInt toUIntOrNull(@NotNull final String $this$toUIntOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toUIntOrNull, "$this$toUIntOrNull");
        return toUIntOrNull($this$toUIntOrNull, 10);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final UInt toUIntOrNull(@NotNull final String $this$toUIntOrNull, final int radix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toUIntOrNull"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iload_1         /* radix */
        //     7: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //    10: pop            
        //    11: aload_0         /* $this$toUIntOrNull */
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: istore_2        /* length */
        //    16: iload_2         /* length */
        //    17: ifne            22
        //    20: aconst_null    
        //    21: areturn        
        //    22: iconst_m1      
        //    23: istore_3        /* limit */
        //    24: iconst_0       
        //    25: istore          start
        //    27: aload_0         /* $this$toUIntOrNull */
        //    28: iconst_0       
        //    29: invokevirtual   java/lang/String.charAt:(I)C
        //    32: istore          firstChar
        //    34: iload           firstChar
        //    36: bipush          48
        //    38: if_icmpge       61
        //    41: iload_2         /* length */
        //    42: iconst_1       
        //    43: if_icmpeq       53
        //    46: iload           firstChar
        //    48: bipush          43
        //    50: if_icmpeq       55
        //    53: aconst_null    
        //    54: areturn        
        //    55: iconst_1       
        //    56: istore          start
        //    58: goto            64
        //    61: iconst_0       
        //    62: istore          start
        //    64: iload_1         /* radix */
        //    65: istore          7
        //    67: iconst_0       
        //    68: istore          8
        //    70: iload           7
        //    72: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //    75: istore          uradix
        //    77: iload_3         /* limit */
        //    78: istore          8
        //    80: iconst_0       
        //    81: istore          9
        //    83: iload           8
        //    85: iload           uradix
        //    87: invokestatic    kotlin/UnsignedKt.uintDivide-J1ME1BU:(II)I
        //    90: istore          limitBeforeMul
        //    92: iconst_0       
        //    93: istore          result
        //    95: iload           start
        //    97: istore          9
        //    99: iload_2         /* length */
        //   100: istore          10
        //   102: iload           9
        //   104: iload           10
        //   106: if_icmpge       224
        //   109: aload_0         /* $this$toUIntOrNull */
        //   110: iload           i
        //   112: invokevirtual   java/lang/String.charAt:(I)C
        //   115: iload_1         /* radix */
        //   116: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //   119: istore          digit
        //   121: iload           digit
        //   123: ifge            128
        //   126: aconst_null    
        //   127: areturn        
        //   128: iload           result
        //   130: istore          12
        //   132: iconst_0       
        //   133: istore          13
        //   135: iload           12
        //   137: iload           limitBeforeMul
        //   139: invokestatic    kotlin/UnsignedKt.uintCompare:(II)I
        //   142: ifle            147
        //   145: aconst_null    
        //   146: areturn        
        //   147: iload           result
        //   149: istore          12
        //   151: iconst_0       
        //   152: istore          13
        //   154: iload           12
        //   156: iload           uradix
        //   158: imul           
        //   159: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //   162: istore          result
        //   164: iload           result
        //   166: istore          beforeAdding
        //   168: iload           result
        //   170: istore          13
        //   172: iload           digit
        //   174: istore          14
        //   176: iconst_0       
        //   177: istore          15
        //   179: iload           14
        //   181: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //   184: istore          14
        //   186: iconst_0       
        //   187: istore          15
        //   189: iload           13
        //   191: iload           14
        //   193: iadd           
        //   194: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //   197: istore          result
        //   199: iload           result
        //   201: istore          13
        //   203: iconst_0       
        //   204: istore          14
        //   206: iload           13
        //   208: iload           beforeAdding
        //   210: invokestatic    kotlin/UnsignedKt.uintCompare:(II)I
        //   213: ifge            218
        //   216: aconst_null    
        //   217: areturn        
        //   218: iinc            i, 1
        //   221: goto            102
        //   224: iload           result
        //   226: invokestatic    kotlin/UInt.box-impl:(I)Lkotlin/UInt;
        //   229: areturn        
        //    StackMapTable: 00 0A FC 00 16 01 FE 00 1E 01 01 01 01 05 02 FF 00 25 00 0B 07 00 A9 01 01 01 01 01 01 01 01 01 01 00 00 FC 00 19 01 FD 00 12 01 01 FD 00 46 01 01 FF 00 05 00 0B 07 00 A9 01 01 01 01 01 01 01 01 01 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final ULong toULongOrNull(@NotNull final String $this$toULongOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toULongOrNull, "$this$toULongOrNull");
        return toULongOrNull($this$toULongOrNull, 10);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    public static final ULong toULongOrNull(@NotNull final String $this$toULongOrNull, final int radix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toULongOrNull"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iload_1         /* radix */
        //     7: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //    10: pop            
        //    11: aload_0         /* $this$toULongOrNull */
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: istore_2        /* length */
        //    16: iload_2         /* length */
        //    17: ifne            22
        //    20: aconst_null    
        //    21: areturn        
        //    22: ldc2_w          -1
        //    25: lstore_3        /* limit */
        //    26: iconst_0       
        //    27: istore          start
        //    29: aload_0         /* $this$toULongOrNull */
        //    30: iconst_0       
        //    31: invokevirtual   java/lang/String.charAt:(I)C
        //    34: istore          firstChar
        //    36: iload           firstChar
        //    38: bipush          48
        //    40: if_icmpge       63
        //    43: iload_2         /* length */
        //    44: iconst_1       
        //    45: if_icmpeq       55
        //    48: iload           firstChar
        //    50: bipush          43
        //    52: if_icmpeq       57
        //    55: aconst_null    
        //    56: areturn        
        //    57: iconst_1       
        //    58: istore          start
        //    60: goto            66
        //    63: iconst_0       
        //    64: istore          start
        //    66: iload_1         /* radix */
        //    67: istore          8
        //    69: iconst_0       
        //    70: istore          9
        //    72: iload           8
        //    74: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //    77: istore          uradix
        //    79: lload_3         /* limit */
        //    80: lstore          10
        //    82: iconst_0       
        //    83: istore          12
        //    85: lload           10
        //    87: lstore          13
        //    89: iload           uradix
        //    91: istore          15
        //    93: iconst_0       
        //    94: istore          16
        //    96: iload           15
        //    98: i2l            
        //    99: ldc2_w          4294967295
        //   102: land           
        //   103: invokestatic    kotlin/ULong.constructor-impl:(J)J
        //   106: lstore          17
        //   108: iconst_0       
        //   109: istore          19
        //   111: lload           13
        //   113: lload           17
        //   115: invokestatic    kotlin/UnsignedKt.ulongDivide-eb3DHEI:(JJ)J
        //   118: lstore          limitBeforeMul
        //   120: lconst_0       
        //   121: lstore          result
        //   123: iload           start
        //   125: istore          12
        //   127: iload_2         /* length */
        //   128: istore          13
        //   130: iload           12
        //   132: iload           13
        //   134: if_icmpge       304
        //   137: aload_0         /* $this$toULongOrNull */
        //   138: iload           i
        //   140: invokevirtual   java/lang/String.charAt:(I)C
        //   143: iload_1         /* radix */
        //   144: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //   147: istore          digit
        //   149: iload           digit
        //   151: ifge            156
        //   154: aconst_null    
        //   155: areturn        
        //   156: lload           result
        //   158: lstore          15
        //   160: iconst_0       
        //   161: istore          17
        //   163: lload           15
        //   165: lload           limitBeforeMul
        //   167: invokestatic    kotlin/UnsignedKt.ulongCompare:(JJ)I
        //   170: ifle            175
        //   173: aconst_null    
        //   174: areturn        
        //   175: lload           result
        //   177: lstore          15
        //   179: iconst_0       
        //   180: istore          17
        //   182: lload           15
        //   184: lstore          18
        //   186: iload           uradix
        //   188: istore          20
        //   190: iconst_0       
        //   191: istore          21
        //   193: iload           20
        //   195: i2l            
        //   196: ldc2_w          4294967295
        //   199: land           
        //   200: invokestatic    kotlin/ULong.constructor-impl:(J)J
        //   203: lstore          22
        //   205: iconst_0       
        //   206: istore          24
        //   208: lload           18
        //   210: lload           22
        //   212: lmul           
        //   213: invokestatic    kotlin/ULong.constructor-impl:(J)J
        //   216: lstore          result
        //   218: lload           result
        //   220: lstore          beforeAdding
        //   222: lload           result
        //   224: lstore          17
        //   226: iload           digit
        //   228: istore          19
        //   230: iconst_0       
        //   231: istore          20
        //   233: iload           19
        //   235: invokestatic    kotlin/UInt.constructor-impl:(I)I
        //   238: istore          19
        //   240: iconst_0       
        //   241: istore          20
        //   243: lload           17
        //   245: lstore          21
        //   247: iload           19
        //   249: istore          23
        //   251: iconst_0       
        //   252: istore          24
        //   254: iload           23
        //   256: i2l            
        //   257: ldc2_w          4294967295
        //   260: land           
        //   261: invokestatic    kotlin/ULong.constructor-impl:(J)J
        //   264: lstore          25
        //   266: iconst_0       
        //   267: istore          27
        //   269: lload           21
        //   271: lload           25
        //   273: ladd           
        //   274: invokestatic    kotlin/ULong.constructor-impl:(J)J
        //   277: lstore          result
        //   279: lload           result
        //   281: lstore          17
        //   283: iconst_0       
        //   284: istore          19
        //   286: lload           17
        //   288: lload           beforeAdding
        //   290: invokestatic    kotlin/UnsignedKt.ulongCompare:(JJ)I
        //   293: ifge            298
        //   296: aconst_null    
        //   297: areturn        
        //   298: iinc            i, 1
        //   301: goto            130
        //   304: lload           result
        //   306: invokestatic    kotlin/ULong.box-impl:(J)Lkotlin/ULong;
        //   309: areturn        
        //    StackMapTable: 00 0A FC 00 16 01 FE 00 20 04 01 01 01 05 02 FF 00 3F 00 10 07 00 A9 01 01 04 01 01 01 04 04 01 01 00 00 00 04 01 00 00 FF 00 19 00 10 07 00 A9 01 01 04 01 01 01 04 04 01 01 01 00 00 04 01 00 00 FF 00 12 00 10 07 00 A9 01 01 04 01 01 01 04 04 01 01 01 04 01 00 01 00 00 FF 00 7A 00 15 07 00 A9 01 01 04 01 01 01 04 04 01 01 01 04 04 01 01 04 01 01 04 01 00 00 FF 00 05 00 10 07 00 A9 01 01 04 01 01 01 04 04 01 01 00 00 00 04 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
