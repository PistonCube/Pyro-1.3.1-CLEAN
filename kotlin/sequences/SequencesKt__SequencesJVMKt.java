// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.internal.InlineOnly;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import java.util.Enumeration;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b¨\u0006\u0004" }, d2 = { "asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/Enumeration;", "kotlin-stdlib" }, xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt
{
    @InlineOnly
    private static final <T> Sequence<T> asSequence(@NotNull final Enumeration<T> $this$asSequence) {
        final int $i$f$asSequence = 0;
        return SequencesKt__SequencesKt.asSequence((Iterator<? extends T>)CollectionsKt__IteratorsJVMKt.iterator((Enumeration<? extends T>)$this$asSequence));
    }
    
    public SequencesKt__SequencesJVMKt() {
    }
}
