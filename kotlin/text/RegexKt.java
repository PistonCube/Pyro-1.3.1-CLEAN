// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.ranges.IntRange;
import java.util.regex.Matcher;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.functions.Function1;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014" }, d2 = { "fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", "value", "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib" })
public final class RegexKt
{
    private static final int toInt(@NotNull final Iterable<? extends FlagEnum> $this$toInt) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: iconst_0       
        //     3: istore_2        /* initial$iv */
        //     4: iconst_0       
        //     5: istore_3        /* $i$f$fold */
        //     6: iload_2         /* initial$iv */
        //     7: istore          accumulator$iv
        //     9: aload_1         /* $this$fold$iv */
        //    10: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    15: astore          5
        //    17: aload           5
        //    19: invokeinterface java/util/Iterator.hasNext:()Z
        //    24: ifeq            65
        //    27: aload           5
        //    29: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    34: astore          element$iv
        //    36: iload           accumulator$iv
        //    38: aload           element$iv
        //    40: checkcast       Lkotlin/text/FlagEnum;
        //    43: astore          7
        //    45: istore          value
        //    47: iconst_0       
        //    48: istore          $i$a$-fold-RegexKt$toInt$1
        //    50: iload           value
        //    52: aload           option
        //    54: invokeinterface kotlin/text/FlagEnum.getValue:()I
        //    59: ior            
        //    60: istore          accumulator$iv
        //    62: goto            17
        //    65: iload           accumulator$iv
        //    67: ireturn        
        //    Signature:
        //  (Ljava/lang/Iterable<+Lkotlin/text/FlagEnum;>;)I
        //    StackMapTable: 00 02 FF 00 11 00 06 07 00 26 07 00 26 01 01 01 07 00 2C 00 00 2F
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final MatchResult findNext(@NotNull final Matcher $this$findNext, final int from, final CharSequence input) {
        return $this$findNext.find(from) ? new MatcherMatchResult($this$findNext, input) : null;
    }
    
    private static final MatchResult matchEntire(@NotNull final Matcher $this$matchEntire, final CharSequence input) {
        return $this$matchEntire.matches() ? new MatcherMatchResult($this$matchEntire, input) : null;
    }
    
    private static final IntRange range(@NotNull final java.util.regex.MatchResult $this$range) {
        return RangesKt___RangesKt.until($this$range.start(), $this$range.end());
    }
    
    private static final IntRange range(@NotNull final java.util.regex.MatchResult $this$range, final int groupIndex) {
        return RangesKt___RangesKt.until($this$range.start(groupIndex), $this$range.end(groupIndex));
    }
}
