// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.Comparator;
import kotlin.internal.LowPriorityInOverloadResolution;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import java.util.Collection;
import kotlin.ranges.IntRange;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import kotlin.collections.AbstractList;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import kotlin.internal.InlineOnly;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\n\u0010\u0017\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0087\b\u001a\n\u0010)\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a2\u00100\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00105\u001a:\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u00109\u001a\u00020#*\u00020(\u001a\u001d\u0010:\u001a\u00020\u0011*\u00020\u00022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010:\u001a\u00020\u0011*\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010?\u001a\u00020\u0011*\u00020\u00022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010?\u001a\u00020\u0011*\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u0011H\u0087\b\u001a4\u0010B\u001a\u00020#*\u00020(2\u0006\u0010C\u001a\u00020\u00112\u0006\u0010!\u001a\u00020(2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010B\u001a\u00020#*\u00020\u00022\u0006\u0010C\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010E\u001a\u00020\u0002*\u00020(2\u0006\u0010F\u001a\u00020\u0011\u001a$\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020N*\u00020(2\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010Q\u001a\u00020\u0011\u001a\u001c\u0010R\u001a\u00020#*\u00020\u00022\u0006\u0010S\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010R\u001a\u00020#*\u00020\u00022\u0006\u0010S\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010U\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010V\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010V\u001a\u00020\u0014*\u00020\u00022\u0006\u0010W\u001a\u00020\u00142\b\b\u0002\u0010X\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010V\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010Y\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010Z\u001a\u00020P*\u00020\u00022\b\b\u0002\u0010[\u001a\u00020\u0011H\u0087\b\u001a\r\u0010\\\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006]" }, d2 = { "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "charSequence", "", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt
{
    @InlineOnly
    private static final int nativeIndexOf(@NotNull final String $this$nativeIndexOf, final char ch, final int fromIndex) {
        final int $i$f$nativeIndexOf = 0;
        if ($this$nativeIndexOf == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$nativeIndexOf.indexOf(ch, fromIndex);
    }
    
    @InlineOnly
    private static final int nativeIndexOf(@NotNull final String $this$nativeIndexOf, final String str, final int fromIndex) {
        final int $i$f$nativeIndexOf = 0;
        if ($this$nativeIndexOf == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$nativeIndexOf.indexOf(str, fromIndex);
    }
    
    @InlineOnly
    private static final int nativeLastIndexOf(@NotNull final String $this$nativeLastIndexOf, final char ch, final int fromIndex) {
        final int $i$f$nativeLastIndexOf = 0;
        if ($this$nativeLastIndexOf == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$nativeLastIndexOf.lastIndexOf(ch, fromIndex);
    }
    
    @InlineOnly
    private static final int nativeLastIndexOf(@NotNull final String $this$nativeLastIndexOf, final String str, final int fromIndex) {
        final int $i$f$nativeLastIndexOf = 0;
        if ($this$nativeLastIndexOf == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$nativeLastIndexOf.lastIndexOf(str, fromIndex);
    }
    
    public static final boolean equals(@Nullable final String $this$equals, @Nullable final String other, final boolean ignoreCase) {
        if ($this$equals == null) {
            return other == null;
        }
        return ignoreCase ? $this$equals.equalsIgnoreCase(other) : $this$equals.equals(other);
    }
    
    @NotNull
    public static final String replace(@NotNull final String $this$replace, final char oldChar, final char newChar, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$replace, "$this$replace");
        if (!ignoreCase) {
            final String replace = $this$replace.replace(oldChar, newChar);
            Intrinsics.checkExpressionValueIsNotNull(replace, "(this as java.lang.Strin\u2026replace(oldChar, newChar)");
            return replace;
        }
        return SequencesKt___SequencesKt.joinToString$default(StringsKt__StringsKt.splitToSequence$default($this$replace, new char[] { oldChar }, ignoreCase, 0, 4, null), String.valueOf(newChar), null, null, 0, null, null, 62, null);
    }
    
    @NotNull
    public static final String replace(@NotNull final String $this$replace, @NotNull final String oldValue, @NotNull final String newValue, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$replace, "$this$replace");
        Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");
        Intrinsics.checkParameterIsNotNull(newValue, "newValue");
        return SequencesKt___SequencesKt.joinToString$default(StringsKt__StringsKt.splitToSequence$default($this$replace, new String[] { oldValue }, ignoreCase, 0, 4, null), newValue, null, null, 0, null, null, 62, null);
    }
    
    @NotNull
    public static final String replaceFirst(@NotNull final String $this$replaceFirst, final char oldChar, final char newChar, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$replaceFirst, "$this$replaceFirst");
        final int index = StringsKt__StringsKt.indexOf$default($this$replaceFirst, oldChar, 0, ignoreCase, 2, null);
        return (index < 0) ? $this$replaceFirst : StringsKt__StringsKt.replaceRange((CharSequence)$this$replaceFirst, index, index + 1, String.valueOf(newChar)).toString();
    }
    
    @NotNull
    public static final String replaceFirst(@NotNull final String $this$replaceFirst, @NotNull final String oldValue, @NotNull final String newValue, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$replaceFirst, "$this$replaceFirst");
        Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");
        Intrinsics.checkParameterIsNotNull(newValue, "newValue");
        final int index = StringsKt__StringsKt.indexOf$default($this$replaceFirst, oldValue, 0, ignoreCase, 2, null);
        return (index < 0) ? $this$replaceFirst : StringsKt__StringsKt.replaceRange((CharSequence)$this$replaceFirst, index, index + oldValue.length(), newValue).toString();
    }
    
    @InlineOnly
    private static final String toUpperCase(@NotNull final String $this$toUpperCase) {
        final int $i$f$toUpperCase = 0;
        if ($this$toUpperCase == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String upperCase = $this$toUpperCase.toUpperCase();
        Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }
    
    @InlineOnly
    private static final String toLowerCase(@NotNull final String $this$toLowerCase) {
        final int $i$f$toLowerCase = 0;
        if ($this$toLowerCase == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String lowerCase = $this$toLowerCase.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final String concatToString(@NotNull final char[] $this$concatToString) {
        Intrinsics.checkParameterIsNotNull($this$concatToString, "$this$concatToString");
        return new String($this$concatToString);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final String concatToString(@NotNull final char[] $this$concatToString, final int startIndex, final int endIndex) {
        Intrinsics.checkParameterIsNotNull($this$concatToString, "$this$concatToString");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$concatToString.length);
        return new String($this$concatToString, startIndex, endIndex - startIndex);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final char[] toCharArray(@NotNull final String $this$toCharArray, final int startIndex, final int endIndex) {
        Intrinsics.checkParameterIsNotNull($this$toCharArray, "$this$toCharArray");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toCharArray.length());
        final char[] dst = new char[endIndex - startIndex];
        $this$toCharArray.getChars(startIndex, endIndex, dst, 0);
        return dst;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final String decodeToString(@NotNull final byte[] $this$decodeToString) {
        Intrinsics.checkParameterIsNotNull($this$decodeToString, "$this$decodeToString");
        return new String($this$decodeToString, Charsets.UTF_8);
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final String decodeToString(@NotNull final byte[] $this$decodeToString, final int startIndex, final int endIndex, final boolean throwOnInvalidSequence) {
        Intrinsics.checkParameterIsNotNull($this$decodeToString, "$this$decodeToString");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$decodeToString.length);
        if (!throwOnInvalidSequence) {
            return new String($this$decodeToString, startIndex, endIndex - startIndex, Charsets.UTF_8);
        }
        final CharsetDecoder decoder = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        final String string = decoder.decode(ByteBuffer.wrap($this$decodeToString, startIndex, endIndex - startIndex)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "decoder.decode(ByteBuffe\u2026- startIndex)).toString()");
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull final String $this$encodeToByteArray) {
        Intrinsics.checkParameterIsNotNull($this$encodeToByteArray, "$this$encodeToByteArray");
        final byte[] bytes = $this$encodeToByteArray.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull final String $this$encodeToByteArray, final int startIndex, final int endIndex, final boolean throwOnInvalidSequence) {
        Intrinsics.checkParameterIsNotNull($this$encodeToByteArray, "$this$encodeToByteArray");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$encodeToByteArray.length());
        if (throwOnInvalidSequence) {
            final CharsetEncoder encoder = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
            final ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap($this$encodeToByteArray, startIndex, endIndex));
            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                final int remaining = byteBuffer.remaining();
                final byte[] array = byteBuffer.array();
                if (array == null) {
                    Intrinsics.throwNpe();
                }
                if (remaining == array.length) {
                    final byte[] array2;
                    Intrinsics.checkExpressionValueIsNotNull(array2 = byteBuffer.array(), "byteBuffer.array()");
                    return array2;
                }
            }
            final byte[] it = new byte[byteBuffer.remaining()];
            final int n = 0;
            byteBuffer.get(it);
            return it;
        }
        final String substring = $this$encodeToByteArray.substring(startIndex, endIndex);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String s = substring;
        final Charset utf_8 = Charsets.UTF_8;
        final String s2 = s;
        if (s2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s2.getBytes(utf_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    @InlineOnly
    private static final char[] toCharArray(@NotNull final String $this$toCharArray) {
        final int $i$f$toCharArray = 0;
        if ($this$toCharArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final char[] charArray = $this$toCharArray.toCharArray();
        Intrinsics.checkExpressionValueIsNotNull(charArray, "(this as java.lang.String).toCharArray()");
        return charArray;
    }
    
    @InlineOnly
    private static final char[] toCharArray(@NotNull final String $this$toCharArray, final char[] destination, final int destinationOffset, final int startIndex, final int endIndex) {
        final int $i$f$toCharArray = 0;
        if ($this$toCharArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
        return destination;
    }
    
    @InlineOnly
    private static final String format(@NotNull final String $this$format, final Object... args) {
        final int $i$f$format = 0;
        final String format = String.format($this$format, Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        return format;
    }
    
    @InlineOnly
    private static final String format(@NotNull final StringCompanionObject $this$format, final String format, final Object... args) {
        final int $i$f$format = 0;
        final String format2 = String.format(format, Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
        return format2;
    }
    
    @InlineOnly
    private static final String format(@NotNull final String $this$format, final Locale locale, final Object... args) {
        final int $i$f$format = 0;
        final String format = String.format(locale, $this$format, Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
    
    @InlineOnly
    private static final String format(@NotNull final StringCompanionObject $this$format, final Locale locale, final String format, final Object... args) {
        final int $i$f$format = 0;
        final String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }
    
    @NotNull
    public static final List<String> split(@NotNull final CharSequence $this$split, @NotNull final Pattern regex, final int limit) {
        Intrinsics.checkParameterIsNotNull($this$split, "$this$split");
        Intrinsics.checkParameterIsNotNull(regex, "regex");
        if (limit < 0) {
            final int n = 0;
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + limit + '.').toString());
        }
        final String[] split = regex.split($this$split, (limit == 0) ? -1 : limit);
        Intrinsics.checkExpressionValueIsNotNull(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return ArraysKt___ArraysJvmKt.asList(split);
    }
    
    @InlineOnly
    private static final String substring(@NotNull final String $this$substring, final int startIndex) {
        final int $i$f$substring = 0;
        if ($this$substring == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = $this$substring.substring(startIndex);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
    
    @InlineOnly
    private static final String substring(@NotNull final String $this$substring, final int startIndex, final int endIndex) {
        final int $i$f$substring = 0;
        if ($this$substring == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = $this$substring.substring(startIndex, endIndex);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    public static final boolean startsWith(@NotNull final String $this$startsWith, @NotNull final String prefix, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$startsWith, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if (!ignoreCase) {
            return $this$startsWith.startsWith(prefix);
        }
        return regionMatches($this$startsWith, 0, prefix, 0, prefix.length(), ignoreCase);
    }
    
    public static final boolean startsWith(@NotNull final String $this$startsWith, @NotNull final String prefix, final int startIndex, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$startsWith, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if (!ignoreCase) {
            return $this$startsWith.startsWith(prefix, startIndex);
        }
        return regionMatches($this$startsWith, startIndex, prefix, 0, prefix.length(), ignoreCase);
    }
    
    public static final boolean endsWith(@NotNull final String $this$endsWith, @NotNull final String suffix, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$endsWith, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        if (!ignoreCase) {
            return $this$endsWith.endsWith(suffix);
        }
        return regionMatches($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
    
    @InlineOnly
    private static final String String(final byte[] bytes, final int offset, final int length, final Charset charset) {
        final int $i$f$String = 0;
        return new String(bytes, offset, length, charset);
    }
    
    @InlineOnly
    private static final String String(final byte[] bytes, final Charset charset) {
        final int $i$f$String = 0;
        return new String(bytes, charset);
    }
    
    @InlineOnly
    private static final String String(final byte[] bytes, final int offset, final int length) {
        final int $i$f$String = 0;
        return new String(bytes, offset, length, Charsets.UTF_8);
    }
    
    @InlineOnly
    private static final String String(final byte[] bytes) {
        final int $i$f$String = 0;
        return new String(bytes, Charsets.UTF_8);
    }
    
    @InlineOnly
    private static final String String(final char[] chars) {
        final int $i$f$String = 0;
        return new String(chars);
    }
    
    @InlineOnly
    private static final String String(final char[] chars, final int offset, final int length) {
        final int $i$f$String = 0;
        return new String(chars, offset, length);
    }
    
    @InlineOnly
    private static final String String(final int[] codePoints, final int offset, final int length) {
        final int $i$f$String = 0;
        return new String(codePoints, offset, length);
    }
    
    @InlineOnly
    private static final String String(final StringBuffer stringBuffer) {
        final int $i$f$String = 0;
        return new String(stringBuffer);
    }
    
    @InlineOnly
    private static final String String(final StringBuilder stringBuilder) {
        final int $i$f$String = 0;
        return new String(stringBuilder);
    }
    
    @InlineOnly
    private static final int codePointAt(@NotNull final String $this$codePointAt, final int index) {
        final int $i$f$codePointAt = 0;
        if ($this$codePointAt == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$codePointAt.codePointAt(index);
    }
    
    @InlineOnly
    private static final int codePointBefore(@NotNull final String $this$codePointBefore, final int index) {
        final int $i$f$codePointBefore = 0;
        if ($this$codePointBefore == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$codePointBefore.codePointBefore(index);
    }
    
    @InlineOnly
    private static final int codePointCount(@NotNull final String $this$codePointCount, final int beginIndex, final int endIndex) {
        final int $i$f$codePointCount = 0;
        if ($this$codePointCount == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$codePointCount.codePointCount(beginIndex, endIndex);
    }
    
    public static final int compareTo(@NotNull final String $this$compareTo, @NotNull final String other, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$compareTo, "$this$compareTo");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if (ignoreCase) {
            return $this$compareTo.compareToIgnoreCase(other);
        }
        return $this$compareTo.compareTo(other);
    }
    
    @InlineOnly
    private static final boolean contentEquals(@NotNull final String $this$contentEquals, final CharSequence charSequence) {
        final int $i$f$contentEquals = 0;
        if ($this$contentEquals == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$contentEquals.contentEquals(charSequence);
    }
    
    @InlineOnly
    private static final boolean contentEquals(@NotNull final String $this$contentEquals, final StringBuffer stringBuilder) {
        final int $i$f$contentEquals = 0;
        if ($this$contentEquals == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$contentEquals.contentEquals(stringBuilder);
    }
    
    @InlineOnly
    private static final String intern(@NotNull final String $this$intern) {
        final int $i$f$intern = 0;
        if ($this$intern == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String intern = $this$intern.intern();
        Intrinsics.checkExpressionValueIsNotNull(intern, "(this as java.lang.String).intern()");
        return intern;
    }
    
    public static final boolean isBlank(@NotNull final CharSequence $this$isBlank) {
        Intrinsics.checkParameterIsNotNull($this$isBlank, "$this$isBlank");
        if ($this$isBlank.length() != 0) {
            final Iterable $this$all$iv = StringsKt__StringsKt.getIndices($this$isBlank);
            final int $i$f$all = 0;
            boolean b = false;
            Label_0100: {
                if ($this$all$iv instanceof Collection && ((Collection)$this$all$iv).isEmpty()) {
                    b = true;
                }
                else {
                    final Iterator iterator = $this$all$iv.iterator();
                    while (iterator.hasNext()) {
                        final int it;
                        final int element$iv = it = ((IntIterator)iterator).nextInt();
                        final int n = 0;
                        if (!CharsKt__CharJVMKt.isWhitespace($this$isBlank.charAt(it))) {
                            b = false;
                            break Label_0100;
                        }
                    }
                    b = true;
                }
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    @InlineOnly
    private static final int offsetByCodePoints(@NotNull final String $this$offsetByCodePoints, final int index, final int codePointOffset) {
        final int $i$f$offsetByCodePoints = 0;
        if ($this$offsetByCodePoints == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return $this$offsetByCodePoints.offsetByCodePoints(index, codePointOffset);
    }
    
    public static final boolean regionMatches(@NotNull final CharSequence $this$regionMatches, final int thisOffset, @NotNull final CharSequence other, final int otherOffset, final int length, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$regionMatches, "$this$regionMatches");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if ($this$regionMatches instanceof String && other instanceof String) {
            return regionMatches((String)$this$regionMatches, thisOffset, (String)other, otherOffset, length, ignoreCase);
        }
        return StringsKt__StringsKt.regionMatchesImpl($this$regionMatches, thisOffset, other, otherOffset, length, ignoreCase);
    }
    
    public static final boolean regionMatches(@NotNull final String $this$regionMatches, final int thisOffset, @NotNull final String other, final int otherOffset, final int length, final boolean ignoreCase) {
        Intrinsics.checkParameterIsNotNull($this$regionMatches, "$this$regionMatches");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return ignoreCase ? $this$regionMatches.regionMatches(ignoreCase, thisOffset, other, otherOffset, length) : $this$regionMatches.regionMatches(thisOffset, other, otherOffset, length);
    }
    
    @InlineOnly
    private static final String toLowerCase(@NotNull final String $this$toLowerCase, final Locale locale) {
        final int $i$f$toLowerCase = 0;
        if ($this$toLowerCase == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String lowerCase = $this$toLowerCase.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
    
    @InlineOnly
    private static final String toUpperCase(@NotNull final String $this$toUpperCase, final Locale locale) {
        final int $i$f$toUpperCase = 0;
        if ($this$toUpperCase == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String upperCase = $this$toUpperCase.toUpperCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
    
    @InlineOnly
    private static final byte[] toByteArray(@NotNull final String $this$toByteArray, final Charset charset) {
        final int $i$f$toByteArray = 0;
        if ($this$toByteArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = $this$toByteArray.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    @InlineOnly
    private static final Pattern toPattern(@NotNull final String $this$toPattern, final int flags) {
        final int $i$f$toPattern = 0;
        final Pattern compile = Pattern.compile($this$toPattern, flags);
        Intrinsics.checkExpressionValueIsNotNull(compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }
    
    @NotNull
    public static final String capitalize(@NotNull final String $this$capitalize) {
        Intrinsics.checkParameterIsNotNull($this$capitalize, "$this$capitalize");
        String string;
        if ($this$capitalize.length() > 0 && Character.isLowerCase($this$capitalize.charAt(0))) {
            final StringBuilder sb = new StringBuilder();
            final int beginIndex = 0;
            final int endIndex = 1;
            final StringBuilder sb2 = sb;
            final String substring = $this$capitalize.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s = substring;
            final StringBuilder sb3 = sb2;
            final String s2 = s;
            final StringBuilder sb4 = sb3;
            final String s3 = s2;
            if (s3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String upperCase = s3.toUpperCase();
            Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
            final StringBuilder append = sb4.append(upperCase);
            final int beginIndex2 = 1;
            final StringBuilder sb5 = append;
            final String substring2 = $this$capitalize.substring(beginIndex2);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            string = sb5.append(substring2).toString();
        }
        else {
            string = $this$capitalize;
        }
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String capitalize(@NotNull final String $this$capitalize, @NotNull final Locale locale) {
        Intrinsics.checkParameterIsNotNull($this$capitalize, "$this$capitalize");
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        if ($this$capitalize.length() > 0) {
            final char firstChar = $this$capitalize.charAt(0);
            if (Character.isLowerCase(firstChar)) {
                final StringBuilder $this$buildString;
                final StringBuilder sb = $this$buildString = new StringBuilder();
                final int n = 0;
                final char titleChar = Character.toTitleCase(firstChar);
                if (titleChar != Character.toUpperCase(firstChar)) {
                    $this$buildString.append(titleChar);
                }
                else {
                    final StringBuilder sb2 = $this$buildString;
                    final int beginIndex = 0;
                    final int endIndex = 1;
                    final StringBuilder sb3 = sb2;
                    final String substring = $this$capitalize.substring(beginIndex, endIndex);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    final String s = substring;
                    final StringBuilder sb4 = sb3;
                    final String s2 = s;
                    final StringBuilder sb5 = sb4;
                    final String s3 = s2;
                    if (s3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    final String upperCase = s3.toUpperCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    sb5.append(upperCase);
                }
                final StringBuilder sb6 = $this$buildString;
                final int beginIndex2 = 1;
                final StringBuilder sb7 = sb6;
                final String substring2 = $this$capitalize.substring(beginIndex2);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                sb7.append(substring2);
                final String string = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        }
        return $this$capitalize;
    }
    
    @NotNull
    public static final String decapitalize(@NotNull final String $this$decapitalize) {
        Intrinsics.checkParameterIsNotNull($this$decapitalize, "$this$decapitalize");
        String string;
        if ($this$decapitalize.length() > 0 && Character.isUpperCase($this$decapitalize.charAt(0))) {
            final StringBuilder sb = new StringBuilder();
            final int beginIndex = 0;
            final int endIndex = 1;
            final StringBuilder sb2 = sb;
            final String substring = $this$decapitalize.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s = substring;
            final StringBuilder sb3 = sb2;
            final String s2 = s;
            final StringBuilder sb4 = sb3;
            final String s3 = s2;
            if (s3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String lowerCase = s3.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            final StringBuilder append = sb4.append(lowerCase);
            final int beginIndex2 = 1;
            final StringBuilder sb5 = append;
            final String substring2 = $this$decapitalize.substring(beginIndex2);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            string = sb5.append(substring2).toString();
        }
        else {
            string = $this$decapitalize;
        }
        return string;
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalStdlibApi
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String decapitalize(@NotNull final String $this$decapitalize, @NotNull final Locale locale) {
        Intrinsics.checkParameterIsNotNull($this$decapitalize, "$this$decapitalize");
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        String string;
        if ($this$decapitalize.length() > 0 && !Character.isLowerCase($this$decapitalize.charAt(0))) {
            final StringBuilder sb = new StringBuilder();
            final int beginIndex = 0;
            final int endIndex = 1;
            final StringBuilder sb2 = sb;
            final String substring = $this$decapitalize.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s = substring;
            final StringBuilder sb3 = sb2;
            final String s2 = s;
            final StringBuilder sb4 = sb3;
            final String s3 = s2;
            if (s3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String lowerCase = s3.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            final StringBuilder append = sb4.append(lowerCase);
            final int beginIndex2 = 1;
            final StringBuilder sb5 = append;
            final String substring2 = $this$decapitalize.substring(beginIndex2);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            string = sb5.append(substring2).toString();
        }
        else {
            string = $this$decapitalize;
        }
        return string;
    }
    
    @NotNull
    public static final String repeat(@NotNull final CharSequence $this$repeat, final int n) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$repeat"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: iload_1         /* n */
        //     8: iflt            15
        //    11: iconst_1       
        //    12: goto            16
        //    15: iconst_0       
        //    16: istore_2       
        //    17: iconst_0       
        //    18: istore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: iload_2        
        //    23: ifne            72
        //    26: iconst_0       
        //    27: istore          $i$a$-require-StringsKt__StringsJVMKt$repeat$1
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: invokespecial   java/lang/StringBuilder.<init>:()V
        //    36: ldc_w           "Count 'n' must be non-negative, but was "
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: iload_1         /* n */
        //    43: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    46: bipush          46
        //    48: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: astore          4
        //    56: new             Ljava/lang/IllegalArgumentException;
        //    59: dup            
        //    60: aload           4
        //    62: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    65: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    68: checkcast       Ljava/lang/Throwable;
        //    71: athrow         
        //    72: iload_1         /* n */
        //    73: tableswitch {
        //                0: 96
        //                1: 102
        //          default: 109
        //        }
        //    96: ldc_w           ""
        //    99: goto            287
        //   102: aload_0         /* $this$repeat */
        //   103: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   106: goto            287
        //   109: aload_0         /* $this$repeat */
        //   110: invokeinterface java/lang/CharSequence.length:()I
        //   115: tableswitch {
        //                0: 136
        //                1: 142
        //          default: 231
        //        }
        //   136: ldc_w           ""
        //   139: goto            287
        //   142: aload_0         /* $this$repeat */
        //   143: iconst_0       
        //   144: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   149: istore_2       
        //   150: iconst_0       
        //   151: istore_3       
        //   152: iconst_0       
        //   153: istore          4
        //   155: iload_2        
        //   156: istore          char
        //   158: iconst_0       
        //   159: istore          $i$a$-let-StringsKt__StringsJVMKt$repeat$2
        //   161: iload_1         /* n */
        //   162: istore          7
        //   164: iload           7
        //   166: newarray        C
        //   168: astore          8
        //   170: iconst_0       
        //   171: istore          9
        //   173: iload           9
        //   175: iload           7
        //   177: if_icmpge       212
        //   180: aload           8
        //   182: iload           9
        //   184: iload           9
        //   186: istore          10
        //   188: istore          11
        //   190: astore          12
        //   192: iconst_0       
        //   193: istore          $i$a$-<init>-StringsKt__StringsJVMKt$repeat$2$1
        //   195: iload           char
        //   197: istore          14
        //   199: aload           12
        //   201: iload           11
        //   203: iload           14
        //   205: castore        
        //   206: iinc            9, 1
        //   209: goto            173
        //   212: aload           8
        //   214: astore          7
        //   216: iconst_0       
        //   217: istore          8
        //   219: new             Ljava/lang/String;
        //   222: dup            
        //   223: aload           7
        //   225: invokespecial   java/lang/String.<init>:([C)V
        //   228: goto            287
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: iload_1         /* n */
        //   236: aload_0         /* $this$repeat */
        //   237: invokeinterface java/lang/CharSequence.length:()I
        //   242: imul           
        //   243: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   246: astore_2        /* sb */
        //   247: iconst_1       
        //   248: istore_3       
        //   249: iload_1         /* n */
        //   250: istore          4
        //   252: iload_3        
        //   253: iload           4
        //   255: if_icmpgt       276
        //   258: aload_2         /* sb */
        //   259: aload_0         /* $this$repeat */
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: iload_3         /* i */
        //   265: iload           4
        //   267: if_icmpeq       276
        //   270: iinc            i, 1
        //   273: goto            258
        //   276: aload_2         /* sb */
        //   277: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   280: dup            
        //   281: ldc_w           "sb.toString()"
        //   284: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   287: areturn        
        //    StackMapTable: 00 0E 0F 40 01 FE 00 37 01 01 01 17 05 06 1A 05 FF 00 1E 00 0A 07 00 AC 01 01 01 01 01 01 01 07 01 A0 01 00 00 26 FF 00 12 00 05 07 00 AC 01 01 01 01 00 00 FF 00 1A 00 05 07 00 AC 01 07 01 BE 01 01 00 00 11 FF 00 0A 00 05 07 00 AC 01 00 01 01 00 01 07 00 75
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull final StringCompanionObject $this$CASE_INSENSITIVE_ORDER) {
        Intrinsics.checkParameterIsNotNull($this$CASE_INSENSITIVE_ORDER, "$this$CASE_INSENSITIVE_ORDER");
        final Comparator<String> case_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkExpressionValueIsNotNull(case_INSENSITIVE_ORDER, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return case_INSENSITIVE_ORDER;
    }
    
    public StringsKt__StringsJVMKt() {
    }
}
