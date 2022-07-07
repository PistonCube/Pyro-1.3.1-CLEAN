// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.jvm.internal.Intrinsics;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib" })
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T>
{
    private final Sequence<T> sequence;
    private final int count;
    
    @NotNull
    @Override
    public Sequence<T> drop(final int n) {
        final int n2 = this.count + n;
        final int n3 = 0;
        return (n2 < 0) ? new DropSequence(this, n) : new DropSequence(this.sequence, n2);
    }
    
    @NotNull
    @Override
    public Sequence<T> take(final int n) {
        final int n2 = this.count + n;
        final int n3 = 0;
        return (Sequence<T>)((n2 < 0) ? ((TakeSequence<Object>)new TakeSequence<Object>(this, n)) : ((SubSequence<Object>)new SubSequence<Object>(this.sequence, this.count, n2)));
    }
    
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)new DropSequence$iterator.DropSequence$iterator$1(this);
    }
    
    public DropSequence(@NotNull final Sequence<? extends T> sequence, final int count) {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        this.sequence = (Sequence<T>)sequence;
        this.count = count;
        if (this.count < 0) {
            final int n = 0;
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.count + '.').toString());
        }
    }
}
