// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012" }, d2 = { "precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "rootNegativeExpFormatSymbols", "Ljava/text/DecimalFormatSymbols;", "rootPositiveExpFormatSymbols", "scientificFormat", "createFormatForDecimals", "decimals", "", "formatScientific", "", "value", "", "formatToExactDecimals", "formatUpToDecimals", "kotlin-stdlib" })
public final class FormatToDecimalsKt
{
    private static final DecimalFormatSymbols rootNegativeExpFormatSymbols;
    private static final DecimalFormatSymbols rootPositiveExpFormatSymbols;
    private static final ThreadLocal<DecimalFormat>[] precisionFormats;
    private static final ThreadLocal<DecimalFormat> scientificFormat;
    
    private static final DecimalFormat createFormatForDecimals(final int decimals) {
        final DecimalFormat $this$apply;
        final DecimalFormat decimalFormat = $this$apply = new DecimalFormat("0", FormatToDecimalsKt.rootNegativeExpFormatSymbols);
        final int n = 0;
        if (decimals > 0) {
            $this$apply.setMinimumFractionDigits(decimals);
        }
        $this$apply.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }
    
    @NotNull
    public static final String formatToExactDecimals(final double value, final int decimals) {
        DecimalFormat formatForDecimals2;
        if (decimals < FormatToDecimalsKt.precisionFormats.length) {
            final ThreadLocal<DecimalFormat> threadLocal = FormatToDecimalsKt.precisionFormats[decimals];
            DecimalFormat value2;
            if ((value2 = threadLocal.get()) == null) {
                final int n = 0;
                final DecimalFormat formatForDecimals = createFormatForDecimals(decimals);
                threadLocal.set(formatForDecimals);
                value2 = formatForDecimals;
            }
            formatForDecimals2 = value2;
        }
        else {
            formatForDecimals2 = createFormatForDecimals(decimals);
        }
        final DecimalFormat format = formatForDecimals2;
        final String format2 = format.format(value);
        Intrinsics.checkExpressionValueIsNotNull(format2, "format.format(value)");
        return format2;
    }
    
    @NotNull
    public static final String formatUpToDecimals(final double value, final int decimals) {
        final DecimalFormat $this$apply = createFormatForDecimals(0);
        final int n = 0;
        $this$apply.setMaximumFractionDigits(decimals);
        final String format = $this$apply.format(value);
        Intrinsics.checkExpressionValueIsNotNull(format, "createFormatForDecimals(\u2026 }\n        .format(value)");
        return format;
    }
    
    @NotNull
    public static final String formatScientific(final double value) {
        final ThreadLocal<DecimalFormat> scientificFormat = FormatToDecimalsKt.scientificFormat;
        DecimalFormat value2;
        if ((value2 = scientificFormat.get()) == null) {
            final int n = 0;
            final DecimalFormat $this$apply = new DecimalFormat("0E0", FormatToDecimalsKt.rootNegativeExpFormatSymbols);
            final int n2 = 0;
            $this$apply.setMinimumFractionDigits(2);
            final DecimalFormat value3 = $this$apply;
            scientificFormat.set(value3);
            value2 = value3;
        }
        final DecimalFormat decimalFormat = value2;
        final DecimalFormat $this$apply2 = decimalFormat;
        final int n3 = 0;
        $this$apply2.setDecimalFormatSymbols((value >= 1 || value <= -1) ? FormatToDecimalsKt.rootPositiveExpFormatSymbols : FormatToDecimalsKt.rootNegativeExpFormatSymbols);
        final String format = decimalFormat.format(value);
        Intrinsics.checkExpressionValueIsNotNull(format, "scientificFormat.getOrSe\u2026 }\n        .format(value)");
        return format;
    }
    
    static {
        DecimalFormatSymbols $this$apply = new DecimalFormatSymbols(Locale.ROOT);
        final int n = 0;
        $this$apply.setExponentSeparator("e");
        rootNegativeExpFormatSymbols = $this$apply;
        $this$apply = new DecimalFormatSymbols(Locale.ROOT);
        final int n2 = 0;
        $this$apply.setExponentSeparator("e+");
        rootPositiveExpFormatSymbols = $this$apply;
        final int n3 = 4;
        final ThreadLocal[] precisionFormats2 = new ThreadLocal[n3];
        for (int i = 0; i < n3; ++i) {
            final ThreadLocal[] array = precisionFormats2;
            final int n4 = i;
            final ThreadLocal[] array2 = array;
            final int n5 = 0;
            array2[n4] = new ThreadLocal();
        }
        precisionFormats = precisionFormats2;
        scientificFormat = new ThreadLocal<DecimalFormat>();
    }
}
