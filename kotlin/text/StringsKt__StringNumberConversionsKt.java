// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.Nullable;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015" }, d2 = { "numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt
{
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull final String $this$toByteOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toByteOrNull, "$this$toByteOrNull");
        return toByteOrNull($this$toByteOrNull, 10);
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull final String $this$toByteOrNull, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toByteOrNull, "$this$toByteOrNull");
        final Integer intOrNull = toIntOrNull($this$toByteOrNull, radix);
        if (intOrNull == null) {
            return null;
        }
        final int int1 = intOrNull;
        if (int1 < -128 || int1 > 127) {
            return null;
        }
        return (byte)int1;
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull final String $this$toShortOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toShortOrNull, "$this$toShortOrNull");
        return toShortOrNull($this$toShortOrNull, 10);
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull final String $this$toShortOrNull, final int radix) {
        Intrinsics.checkParameterIsNotNull($this$toShortOrNull, "$this$toShortOrNull");
        final Integer intOrNull = toIntOrNull($this$toShortOrNull, radix);
        if (intOrNull == null) {
            return null;
        }
        final int int1 = intOrNull;
        if (int1 < -32768 || int1 > 32767) {
            return null;
        }
        return (short)int1;
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Integer toIntOrNull(@NotNull final String $this$toIntOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toIntOrNull, "$this$toIntOrNull");
        return toIntOrNull($this$toIntOrNull, 10);
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Integer toIntOrNull(@NotNull final String $this$toIntOrNull, final int radix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toIntOrNull"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iload_1         /* radix */
        //     7: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //    10: pop            
        //    11: aload_0         /* $this$toIntOrNull */
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: istore_2        /* length */
        //    16: iload_2         /* length */
        //    17: ifne            22
        //    20: aconst_null    
        //    21: areturn        
        //    22: iconst_0       
        //    23: istore_3        /* start */
        //    24: iconst_0       
        //    25: istore          isNegative
        //    27: iconst_0       
        //    28: istore          limit
        //    30: aload_0         /* $this$toIntOrNull */
        //    31: iconst_0       
        //    32: invokevirtual   java/lang/String.charAt:(I)C
        //    35: istore          firstChar
        //    37: iload           firstChar
        //    39: bipush          48
        //    41: if_icmpge       89
        //    44: iload_2         /* length */
        //    45: iconst_1       
        //    46: if_icmpne       51
        //    49: aconst_null    
        //    50: areturn        
        //    51: iconst_1       
        //    52: istore_3        /* start */
        //    53: iload           firstChar
        //    55: bipush          45
        //    57: if_icmpne       70
        //    60: iconst_1       
        //    61: istore          isNegative
        //    63: ldc             -2147483648
        //    65: istore          limit
        //    67: goto            98
        //    70: iload           firstChar
        //    72: bipush          43
        //    74: if_icmpne       87
        //    77: iconst_0       
        //    78: istore          isNegative
        //    80: ldc             -2147483647
        //    82: istore          limit
        //    84: goto            98
        //    87: aconst_null    
        //    88: areturn        
        //    89: iconst_0       
        //    90: istore_3        /* start */
        //    91: iconst_0       
        //    92: istore          isNegative
        //    94: ldc             -2147483647
        //    96: istore          limit
        //    98: iload           limit
        //   100: iload_1         /* radix */
        //   101: idiv           
        //   102: istore          limitBeforeMul
        //   104: iconst_0       
        //   105: istore          result
        //   107: iload_3         /* start */
        //   108: istore          9
        //   110: iload_2         /* length */
        //   111: iconst_1       
        //   112: isub           
        //   113: istore          10
        //   115: iload           9
        //   117: iload           10
        //   119: if_icmpgt       188
        //   122: aload_0         /* $this$toIntOrNull */
        //   123: iload           i
        //   125: invokevirtual   java/lang/String.charAt:(I)C
        //   128: iload_1         /* radix */
        //   129: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //   132: istore          digit
        //   134: iload           digit
        //   136: ifge            141
        //   139: aconst_null    
        //   140: areturn        
        //   141: iload           result
        //   143: iload           limitBeforeMul
        //   145: if_icmpge       150
        //   148: aconst_null    
        //   149: areturn        
        //   150: iload           result
        //   152: iload_1         /* radix */
        //   153: imul           
        //   154: istore          result
        //   156: iload           result
        //   158: iload           limit
        //   160: iload           digit
        //   162: iadd           
        //   163: if_icmpge       168
        //   166: aconst_null    
        //   167: areturn        
        //   168: iload           result
        //   170: iload           digit
        //   172: isub           
        //   173: istore          result
        //   175: iload           i
        //   177: iload           10
        //   179: if_icmpeq       188
        //   182: iinc            i, 1
        //   185: goto            122
        //   188: iload           isNegative
        //   190: ifeq            201
        //   193: iload           result
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: goto            207
        //   201: iload           result
        //   203: ineg           
        //   204: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   207: areturn        
        //    StackMapTable: 00 0D FC 00 16 01 FF 00 1C 00 07 07 00 59 01 01 01 01 01 01 00 00 12 10 01 08 FF 00 17 00 0B 07 00 59 01 01 01 01 01 01 01 01 01 01 00 00 FC 00 12 01 08 11 FA 00 13 0C 45 07 00 3A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Long toLongOrNull(@NotNull final String $this$toLongOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toLongOrNull, "$this$toLongOrNull");
        return toLongOrNull($this$toLongOrNull, 10);
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Long toLongOrNull(@NotNull final String $this$toLongOrNull, final int radix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toLongOrNull"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iload_1         /* radix */
        //     7: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //    10: pop            
        //    11: aload_0         /* $this$toLongOrNull */
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: istore_2        /* length */
        //    16: iload_2         /* length */
        //    17: ifne            22
        //    20: aconst_null    
        //    21: areturn        
        //    22: iconst_0       
        //    23: istore_3        /* start */
        //    24: iconst_0       
        //    25: istore          isNegative
        //    27: lconst_0       
        //    28: lstore          limit
        //    30: aload_0         /* $this$toLongOrNull */
        //    31: iconst_0       
        //    32: invokevirtual   java/lang/String.charAt:(I)C
        //    35: istore          firstChar
        //    37: iload           firstChar
        //    39: bipush          48
        //    41: if_icmpge       91
        //    44: iload_2         /* length */
        //    45: iconst_1       
        //    46: if_icmpne       51
        //    49: aconst_null    
        //    50: areturn        
        //    51: iconst_1       
        //    52: istore_3        /* start */
        //    53: iload           firstChar
        //    55: bipush          45
        //    57: if_icmpne       71
        //    60: iconst_1       
        //    61: istore          isNegative
        //    63: ldc2_w          -9223372036854775808
        //    66: lstore          limit
        //    68: goto            101
        //    71: iload           firstChar
        //    73: bipush          43
        //    75: if_icmpne       89
        //    78: iconst_0       
        //    79: istore          isNegative
        //    81: ldc2_w          -9223372036854775807
        //    84: lstore          limit
        //    86: goto            101
        //    89: aconst_null    
        //    90: areturn        
        //    91: iconst_0       
        //    92: istore_3        /* start */
        //    93: iconst_0       
        //    94: istore          isNegative
        //    96: ldc2_w          -9223372036854775807
        //    99: lstore          limit
        //   101: lload           limit
        //   103: iload_1         /* radix */
        //   104: i2l            
        //   105: ldiv           
        //   106: lstore          limitBeforeMul
        //   108: lconst_0       
        //   109: lstore          result
        //   111: iload_3         /* start */
        //   112: istore          12
        //   114: iload_2         /* length */
        //   115: iconst_1       
        //   116: isub           
        //   117: istore          13
        //   119: iload           12
        //   121: iload           13
        //   123: if_icmpgt       197
        //   126: aload_0         /* $this$toLongOrNull */
        //   127: iload           i
        //   129: invokevirtual   java/lang/String.charAt:(I)C
        //   132: iload_1         /* radix */
        //   133: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //   136: istore          digit
        //   138: iload           digit
        //   140: ifge            145
        //   143: aconst_null    
        //   144: areturn        
        //   145: lload           result
        //   147: lload           limitBeforeMul
        //   149: lcmp           
        //   150: ifge            155
        //   153: aconst_null    
        //   154: areturn        
        //   155: lload           result
        //   157: iload_1         /* radix */
        //   158: i2l            
        //   159: lmul           
        //   160: lstore          result
        //   162: lload           result
        //   164: lload           limit
        //   166: iload           digit
        //   168: i2l            
        //   169: ladd           
        //   170: lcmp           
        //   171: ifge            176
        //   174: aconst_null    
        //   175: areturn        
        //   176: lload           result
        //   178: iload           digit
        //   180: i2l            
        //   181: lsub           
        //   182: lstore          result
        //   184: iload           i
        //   186: iload           13
        //   188: if_icmpeq       197
        //   191: iinc            i, 1
        //   194: goto            126
        //   197: iload           isNegative
        //   199: ifeq            210
        //   202: lload           result
        //   204: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   207: goto            216
        //   210: lload           result
        //   212: lneg           
        //   213: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   216: areturn        
        //    StackMapTable: 00 0D FC 00 16 01 FF 00 1C 00 07 07 00 59 01 01 01 01 04 01 00 00 13 11 01 09 FF 00 18 00 0B 07 00 59 01 01 01 01 04 01 04 04 01 01 00 00 FC 00 12 01 09 14 FA 00 14 0C 45 07 00 7D
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Void numberFormatError(@NotNull final String input) {
        Intrinsics.checkParameterIsNotNull(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }
    
    public StringsKt__StringNumberConversionsKt() {
    }
}
