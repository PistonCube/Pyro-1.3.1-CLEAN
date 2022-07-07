// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.PublishedApi;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import kotlin.internal.InlineOnly;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u001e\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u001f\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 " }, d2 = { "category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "toLowerCase", "toTitleCase", "toUpperCase", "kotlin-stdlib" }, xs = "kotlin/text/CharsKt")
class CharsKt__CharJVMKt
{
    @InlineOnly
    private static final boolean isDefined(final char $this$isDefined) {
        final int $i$f$isDefined = 0;
        return Character.isDefined($this$isDefined);
    }
    
    @InlineOnly
    private static final boolean isLetter(final char $this$isLetter) {
        final int $i$f$isLetter = 0;
        return Character.isLetter($this$isLetter);
    }
    
    @InlineOnly
    private static final boolean isLetterOrDigit(final char $this$isLetterOrDigit) {
        final int $i$f$isLetterOrDigit = 0;
        return Character.isLetterOrDigit($this$isLetterOrDigit);
    }
    
    @InlineOnly
    private static final boolean isDigit(final char $this$isDigit) {
        final int $i$f$isDigit = 0;
        return Character.isDigit($this$isDigit);
    }
    
    @InlineOnly
    private static final boolean isIdentifierIgnorable(final char $this$isIdentifierIgnorable) {
        final int $i$f$isIdentifierIgnorable = 0;
        return Character.isIdentifierIgnorable($this$isIdentifierIgnorable);
    }
    
    @InlineOnly
    private static final boolean isISOControl(final char $this$isISOControl) {
        final int $i$f$isISOControl = 0;
        return Character.isISOControl($this$isISOControl);
    }
    
    @InlineOnly
    private static final boolean isJavaIdentifierPart(final char $this$isJavaIdentifierPart) {
        final int $i$f$isJavaIdentifierPart = 0;
        return Character.isJavaIdentifierPart($this$isJavaIdentifierPart);
    }
    
    @InlineOnly
    private static final boolean isJavaIdentifierStart(final char $this$isJavaIdentifierStart) {
        final int $i$f$isJavaIdentifierStart = 0;
        return Character.isJavaIdentifierStart($this$isJavaIdentifierStart);
    }
    
    public static final boolean isWhitespace(final char $this$isWhitespace) {
        return Character.isWhitespace($this$isWhitespace) || Character.isSpaceChar($this$isWhitespace);
    }
    
    @InlineOnly
    private static final boolean isUpperCase(final char $this$isUpperCase) {
        final int $i$f$isUpperCase = 0;
        return Character.isUpperCase($this$isUpperCase);
    }
    
    @InlineOnly
    private static final boolean isLowerCase(final char $this$isLowerCase) {
        final int $i$f$isLowerCase = 0;
        return Character.isLowerCase($this$isLowerCase);
    }
    
    @InlineOnly
    private static final char toUpperCase(final char $this$toUpperCase) {
        final int $i$f$toUpperCase = 0;
        return Character.toUpperCase($this$toUpperCase);
    }
    
    @InlineOnly
    private static final char toLowerCase(final char $this$toLowerCase) {
        final int $i$f$toLowerCase = 0;
        return Character.toLowerCase($this$toLowerCase);
    }
    
    @InlineOnly
    private static final boolean isTitleCase(final char $this$isTitleCase) {
        final int $i$f$isTitleCase = 0;
        return Character.isTitleCase($this$isTitleCase);
    }
    
    @InlineOnly
    private static final char toTitleCase(final char $this$toTitleCase) {
        final int $i$f$toTitleCase = 0;
        return Character.toTitleCase($this$toTitleCase);
    }
    
    @NotNull
    public static final CharCategory getCategory(final char $this$category) {
        return CharCategory.Companion.valueOf(Character.getType($this$category));
    }
    
    @NotNull
    public static final CharDirectionality getDirectionality(final char $this$directionality) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality($this$directionality));
    }
    
    @InlineOnly
    private static final boolean isHighSurrogate(final char $this$isHighSurrogate) {
        final int $i$f$isHighSurrogate = 0;
        return Character.isHighSurrogate($this$isHighSurrogate);
    }
    
    @InlineOnly
    private static final boolean isLowSurrogate(final char $this$isLowSurrogate) {
        final int $i$f$isLowSurrogate = 0;
        return Character.isLowSurrogate($this$isLowSurrogate);
    }
    
    public static final int digitOf(final char char, final int radix) {
        return Character.digit((int)char, radix);
    }
    
    @PublishedApi
    public static final int checkRadix(final int radix) {
        final int n = 36;
        if (2 <= radix) {
            if (n >= radix) {
                return radix;
            }
        }
        throw new IllegalArgumentException("radix " + radix + " was not in valid range " + new IntRange(2, 36));
    }
    
    public CharsKt__CharJVMKt() {
    }
}
