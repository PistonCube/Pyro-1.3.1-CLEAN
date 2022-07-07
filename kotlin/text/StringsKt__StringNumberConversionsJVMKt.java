// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.jvm.functions.Function1;
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000X\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\r\u0010\u0012\u001a\u00020\u0013*\u00020\u0003H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001e\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u001f\u001a\u00020 *\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010!\u001a\u00020\"*\u00020\u0003H\u0087\b\u001a\u0015\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006$" }, d2 = { "screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt
{
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(final byte $this$toString, final int radix) {
        final int $i$f$toString = 0;
        final String string = Integer.toString($this$toString, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(radix)));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(final short $this$toString, final int radix) {
        final int $i$f$toString = 0;
        final String string = Integer.toString($this$toString, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(radix)));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(final int $this$toString, final int radix) {
        final int $i$f$toString = 0;
        final String string = Integer.toString($this$toString, CharsKt__CharJVMKt.checkRadix(radix));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(final long $this$toString, final int radix) {
        final int $i$f$toString = 0;
        final String string = Long.toString($this$toString, CharsKt__CharJVMKt.checkRadix(radix));
        Intrinsics.checkExpressionValueIsNotNull(string, "java.lang.Long.toString(this, checkRadix(radix))");
        return string;
    }
    
    @InlineOnly
    private static final boolean toBoolean(@NotNull final String $this$toBoolean) {
        final int $i$f$toBoolean = 0;
        return Boolean.parseBoolean($this$toBoolean);
    }
    
    @InlineOnly
    private static final byte toByte(@NotNull final String $this$toByte) {
        final int $i$f$toByte = 0;
        return Byte.parseByte($this$toByte);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(@NotNull final String $this$toByte, final int radix) {
        final int $i$f$toByte = 0;
        return Byte.parseByte($this$toByte, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @InlineOnly
    private static final short toShort(@NotNull final String $this$toShort) {
        final int $i$f$toShort = 0;
        return Short.parseShort($this$toShort);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(@NotNull final String $this$toShort, final int radix) {
        final int $i$f$toShort = 0;
        return Short.parseShort($this$toShort, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @InlineOnly
    private static final int toInt(@NotNull final String $this$toInt) {
        final int $i$f$toInt = 0;
        return Integer.parseInt($this$toInt);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(@NotNull final String $this$toInt, final int radix) {
        final int $i$f$toInt = 0;
        return Integer.parseInt($this$toInt, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @InlineOnly
    private static final long toLong(@NotNull final String $this$toLong) {
        final int $i$f$toLong = 0;
        return Long.parseLong($this$toLong);
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(@NotNull final String $this$toLong, final int radix) {
        final int $i$f$toLong = 0;
        return Long.parseLong($this$toLong, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @InlineOnly
    private static final float toFloat(@NotNull final String $this$toFloat) {
        final int $i$f$toFloat = 0;
        return Float.parseFloat($this$toFloat);
    }
    
    @InlineOnly
    private static final double toDouble(@NotNull final String $this$toDouble) {
        final int $i$f$toDouble = 0;
        return Double.parseDouble($this$toDouble);
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Float toFloatOrNull(@NotNull final String $this$toFloatOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toFloatOrNull, "$this$toFloatOrNull");
        final int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt = 0;
        Float n2;
        try {
            Float value;
            if (ScreenFloatValueRegEx.value.matches($this$toFloatOrNull)) {
                final String p1 = $this$toFloatOrNull;
                final int n = 0;
                value = Float.parseFloat(p1);
            }
            else {
                value = null;
            }
            n2 = value;
        }
        catch (NumberFormatException e$iv) {
            n2 = null;
        }
        return n2;
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Double toDoubleOrNull(@NotNull final String $this$toDoubleOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toDoubleOrNull, "$this$toDoubleOrNull");
        final int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt = 0;
        Double n2;
        try {
            Double value;
            if (ScreenFloatValueRegEx.value.matches($this$toDoubleOrNull)) {
                final String p1 = $this$toDoubleOrNull;
                final int n = 0;
                value = Double.parseDouble(p1);
            }
            else {
                value = null;
            }
            n2 = value;
        }
        catch (NumberFormatException e$iv) {
            n2 = null;
        }
        return n2;
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(@NotNull final String $this$toBigInteger) {
        final int $i$f$toBigInteger = 0;
        return new BigInteger($this$toBigInteger);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(@NotNull final String $this$toBigInteger, final int radix) {
        final int $i$f$toBigInteger = 0;
        return new BigInteger($this$toBigInteger, CharsKt__CharJVMKt.checkRadix(radix));
    }
    
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull final String $this$toBigIntegerOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toBigIntegerOrNull, "$this$toBigIntegerOrNull");
        return toBigIntegerOrNull($this$toBigIntegerOrNull, 10);
    }
    
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull final String $this$toBigIntegerOrNull, final int radix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toBigIntegerOrNull"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iload_1         /* radix */
        //     7: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //    10: pop            
        //    11: aload_0         /* $this$toBigIntegerOrNull */
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: istore_2        /* length */
        //    16: iload_2         /* length */
        //    17: tableswitch {
        //                0: 40
        //                1: 42
        //          default: 56
        //        }
        //    40: aconst_null    
        //    41: areturn        
        //    42: aload_0         /* $this$toBigIntegerOrNull */
        //    43: iconst_0       
        //    44: invokevirtual   java/lang/String.charAt:(I)C
        //    47: iload_1         /* radix */
        //    48: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //    51: ifge            106
        //    54: aconst_null    
        //    55: areturn        
        //    56: aload_0         /* $this$toBigIntegerOrNull */
        //    57: iconst_0       
        //    58: invokevirtual   java/lang/String.charAt:(I)C
        //    61: bipush          45
        //    63: if_icmpne       70
        //    66: iconst_1       
        //    67: goto            71
        //    70: iconst_0       
        //    71: istore_3        /* start */
        //    72: iload_3         /* start */
        //    73: istore          4
        //    75: iload_2         /* length */
        //    76: istore          5
        //    78: iload           4
        //    80: iload           5
        //    82: if_icmpge       106
        //    85: aload_0         /* $this$toBigIntegerOrNull */
        //    86: iload           index
        //    88: invokevirtual   java/lang/String.charAt:(I)C
        //    91: iload_1         /* radix */
        //    92: invokestatic    kotlin/text/CharsKt.digitOf:(CI)I
        //    95: ifge            100
        //    98: aconst_null    
        //    99: areturn        
        //   100: iinc            index, 1
        //   103: goto            78
        //   106: aload_0         /* $this$toBigIntegerOrNull */
        //   107: astore_3       
        //   108: iconst_0       
        //   109: istore          4
        //   111: new             Ljava/math/BigInteger;
        //   114: dup            
        //   115: aload_3        
        //   116: iload_1         /* radix */
        //   117: invokestatic    kotlin/text/CharsKt.checkRadix:(I)I
        //   120: invokespecial   java/math/BigInteger.<init>:(Ljava/lang/String;I)V
        //   123: areturn        
        //    StackMapTable: 00 08 FC 00 28 01 01 0D 0D 40 01 FE 00 06 01 01 01 15 F8 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(@NotNull final String $this$toBigDecimal) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(@NotNull final String $this$toBigDecimal, final MathContext mathContext) {
        final int $i$f$toBigDecimal = 0;
        return new BigDecimal($this$toBigDecimal, mathContext);
    }
    
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull final String $this$toBigDecimalOrNull) {
        Intrinsics.checkParameterIsNotNull($this$toBigDecimalOrNull, "$this$toBigDecimalOrNull");
        final int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt = 0;
        BigDecimal bigDecimal2;
        try {
            BigDecimal bigDecimal;
            if (ScreenFloatValueRegEx.value.matches($this$toBigDecimalOrNull)) {
                final String it = $this$toBigDecimalOrNull;
                final int n = 0;
                bigDecimal = new BigDecimal(it);
            }
            else {
                bigDecimal = null;
            }
            bigDecimal2 = bigDecimal;
        }
        catch (NumberFormatException e$iv) {
            bigDecimal2 = null;
        }
        return bigDecimal2;
    }
    
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull final String $this$toBigDecimalOrNull, @NotNull final MathContext mathContext) {
        Intrinsics.checkParameterIsNotNull($this$toBigDecimalOrNull, "$this$toBigDecimalOrNull");
        Intrinsics.checkParameterIsNotNull(mathContext, "mathContext");
        final int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt = 0;
        BigDecimal bigDecimal2;
        try {
            BigDecimal bigDecimal;
            if (ScreenFloatValueRegEx.value.matches($this$toBigDecimalOrNull)) {
                final String it = $this$toBigDecimalOrNull;
                final int n = 0;
                bigDecimal = new BigDecimal(it, mathContext);
            }
            else {
                bigDecimal = null;
            }
            bigDecimal2 = bigDecimal;
        }
        catch (NumberFormatException e$iv) {
            bigDecimal2 = null;
        }
        return bigDecimal2;
    }
    
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(final String str, final Function1<? super String, ? extends T> parse) {
        final int $i$f$screenFloatValue$StringsKt__StringNumberConversionsJVMKt = 0;
        T t;
        try {
            t = (ScreenFloatValueRegEx.value.matches(str) ? parse.invoke(str) : null);
        }
        catch (NumberFormatException e) {
            t = null;
        }
        return t;
    }
    
    public StringsKt__StringNumberConversionsJVMKt() {
    }
}
