// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function0;
import kotlin.internal.InlineOnly;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000:\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u001a0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\tH\u0087\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a/\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e\u001aH\u0010\u000f\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0011\u001a\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\u0012H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0013\u001a9\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00050\tH\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a>\u0010\u0015\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u0012H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a?\u0010\u0016\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b*\u0002H\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\tH\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001aD\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u000b*\u0002H\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000b0\t¢\u0006\u0002\b\u0012H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a;\u0010\u0017\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00190\tH\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013\u001a;\u0010\u001a\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u0002H\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00190\tH\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0013¨\u0006\u001b" }, d2 = { "TODO", "", "reason", "", "repeat", "", "times", "", "action", "Lkotlin/Function1;", "run", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "with", "T", "receiver", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "also", "apply", "let", "takeIf", "predicate", "", "takeUnless", "kotlin-stdlib" }, xs = "kotlin/StandardKt")
class StandardKt__StandardKt
{
    @InlineOnly
    private static final Void TODO() {
        final int $i$f$TODO = 0;
        throw new NotImplementedError(null, 1, null);
    }
    
    @InlineOnly
    private static final Void TODO(final String reason) {
        final int $i$f$TODO = 0;
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }
    
    @InlineOnly
    private static final <R> R run(final Function0<? extends R> block) {
        final int $i$f$run = 0;
        return (R)block.invoke();
    }
    
    @InlineOnly
    private static final <T, R> R run(final T $this$run, final Function1<? super T, ? extends R> block) {
        final int $i$f$run = 0;
        return (R)block.invoke($this$run);
    }
    
    @InlineOnly
    private static final <T, R> R with(final T receiver, final Function1<? super T, ? extends R> block) {
        final int $i$f$with = 0;
        return (R)block.invoke(receiver);
    }
    
    @InlineOnly
    private static final <T> T apply(final T $this$apply, final Function1<? super T, Unit> block) {
        final int $i$f$apply = 0;
        block.invoke($this$apply);
        return $this$apply;
    }
    
    @InlineOnly
    @SinceKotlin(version = "1.1")
    private static final <T> T also(final T $this$also, final Function1<? super T, Unit> block) {
        final int $i$f$also = 0;
        block.invoke($this$also);
        return $this$also;
    }
    
    @InlineOnly
    private static final <T, R> R let(final T $this$let, final Function1<? super T, ? extends R> block) {
        final int $i$f$let = 0;
        return (R)block.invoke($this$let);
    }
    
    @InlineOnly
    @SinceKotlin(version = "1.1")
    private static final <T> T takeIf(final T $this$takeIf, final Function1<? super T, Boolean> predicate) {
        final int $i$f$takeIf = 0;
        return ((boolean)predicate.invoke($this$takeIf)) ? $this$takeIf : null;
    }
    
    @InlineOnly
    @SinceKotlin(version = "1.1")
    private static final <T> T takeUnless(final T $this$takeUnless, final Function1<? super T, Boolean> predicate) {
        final int $i$f$takeUnless = 0;
        return predicate.invoke($this$takeUnless) ? null : $this$takeUnless;
    }
    
    @InlineOnly
    private static final void repeat(final int times, final Function1<? super Integer, Unit> action) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$repeat */
        //     3: iconst_0       
        //     4: istore_3       
        //     5: iconst_0       
        //     6: istore_3       
        //     7: iload_0         /* times */
        //     8: istore          4
        //    10: iload_3        
        //    11: iload           4
        //    13: if_icmpge       33
        //    16: aload_1         /* action */
        //    17: iload_3         /* index */
        //    18: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    21: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: pop            
        //    27: iinc            index, 1
        //    30: goto            10
        //    33: return         
        //    Signature:
        //  (ILkotlin/jvm/functions/Function1<-Ljava/lang/Integer;Lkotlin/Unit;>;)V
        //    StackMapTable: 00 02 FE 00 0A 01 01 01 16
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public StandardKt__StandardKt() {
    }
}
