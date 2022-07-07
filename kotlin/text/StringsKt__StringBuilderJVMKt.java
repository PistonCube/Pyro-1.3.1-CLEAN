// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0087\b\u001a\u0012\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u0007\u001a\u001f\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0087\b\u001a\u001f\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001f\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0087\b\u001a\u001f\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0087\b\u001a%\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u000e\u0010\u0003\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0087\b\u001a\u0014\u0010\u0013\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u0007H\u0007\u001a!\u0010\u0014\u001a\u00020\u0015*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\n¨\u0006\u0017" }, d2 = { "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "", "", "", "", "clear", "set", "", "index", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt
{
    @InlineOnly
    private static final void set(@NotNull final StringBuilder $this$set, final int index, final char value) {
        final int $i$f$set = 0;
        Intrinsics.checkParameterIsNotNull($this$set, "$this$set");
        $this$set.setCharAt(index, value);
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final StringBuilder clear(@NotNull final StringBuilder $this$clear) {
        Intrinsics.checkParameterIsNotNull($this$clear, "$this$clear");
        final StringBuilder $this$apply = $this$clear;
        final int n = 0;
        $this$apply.setLength(0);
        return $this$clear;
    }
    
    @NotNull
    public static final Appendable appendln(@NotNull final Appendable $this$appendln) {
        Intrinsics.checkParameterIsNotNull($this$appendln, "$this$appendln");
        final Appendable append = $this$appendln.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }
    
    @InlineOnly
    private static final Appendable appendln(@NotNull final Appendable $this$appendln, final CharSequence value) {
        final int $i$f$appendln = 0;
        final Appendable append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final Appendable appendln(@NotNull final Appendable $this$appendln, final char value) {
        final int $i$f$appendln = 0;
        final Appendable append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @NotNull
    public static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln) {
        Intrinsics.checkParameterIsNotNull($this$appendln, "$this$appendln");
        final StringBuilder append = $this$appendln.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final StringBuffer value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final CharSequence value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final String value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final Object value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final StringBuilder value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append((CharSequence)value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final char[] value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final char value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final boolean value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final int value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final short value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value.toInt())");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final byte value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value.toInt())");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final long value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final float value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    @InlineOnly
    private static final StringBuilder appendln(@NotNull final StringBuilder $this$appendln, final double value) {
        final int $i$f$appendln = 0;
        final StringBuilder append = $this$appendln.append(value);
        Intrinsics.checkExpressionValueIsNotNull(append, "append(value)");
        return appendln(append);
    }
    
    public StringsKt__StringBuilderJVMKt() {
    }
}
