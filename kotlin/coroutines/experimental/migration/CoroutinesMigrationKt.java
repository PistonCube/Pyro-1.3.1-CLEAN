// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.experimental.migration;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function1;
import kotlin.coroutines.experimental.EmptyCoroutineContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.coroutines.Continuation;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0007\u001a\f\u0010\f\u001a\u00020\t*\u00020\bH\u0007\u001a^\u0010\r\u001a\"\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010\"\u0004\b\u0002\u0010\u0011*\"\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0000\u001aL\u0010\r\u001a\u001c\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0013\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0011*\u001c\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0013H\u0000\u001a:\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0014\"\u0004\b\u0000\u0010\u0011*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0014H\u0000¨\u0006\u0015" }, d2 = { "toContinuation", "Lkotlin/coroutines/Continuation;", "T", "Lkotlin/coroutines/experimental/Continuation;", "toContinuationInterceptor", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/experimental/ContinuationInterceptor;", "toCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/experimental/CoroutineContext;", "toExperimentalContinuation", "toExperimentalContinuationInterceptor", "toExperimentalCoroutineContext", "toExperimentalSuspendFunction", "Lkotlin/Function3;", "T1", "T2", "R", "", "Lkotlin/Function2;", "Lkotlin/Function1;", "kotlin-stdlib-coroutines" })
public final class CoroutinesMigrationKt
{
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> kotlin.coroutines.experimental.Continuation<T> toExperimentalContinuation(@NotNull final Continuation<? super T> $this$toExperimentalContinuation) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalContinuation, "$this$toExperimentalContinuation");
        ContinuationMigration<? super Object> continuationMigration = (ContinuationMigration<? super Object>)$this$toExperimentalContinuation;
        if (!($this$toExperimentalContinuation instanceof ContinuationMigration)) {
            continuationMigration = null;
        }
        final ContinuationMigration<? super Object> continuationMigration2 = continuationMigration;
        kotlin.coroutines.experimental.Continuation<T> continuation;
        if (continuationMigration2 == null || (continuation = continuationMigration2.getContinuation()) == null) {
            continuation = new ExperimentalContinuationMigration<T>($this$toExperimentalContinuation);
        }
        return continuation;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<T> toContinuation(@NotNull final kotlin.coroutines.experimental.Continuation<? super T> $this$toContinuation) {
        Intrinsics.checkParameterIsNotNull($this$toContinuation, "$this$toContinuation");
        ExperimentalContinuationMigration<? super Object> experimentalContinuationMigration = (ExperimentalContinuationMigration<? super Object>)$this$toContinuation;
        if (!($this$toContinuation instanceof ExperimentalContinuationMigration)) {
            experimentalContinuationMigration = null;
        }
        final ExperimentalContinuationMigration<? super Object> experimentalContinuationMigration2 = experimentalContinuationMigration;
        Continuation<T> continuation;
        if (experimentalContinuationMigration2 == null || (continuation = experimentalContinuationMigration2.getContinuation()) == null) {
            continuation = new ContinuationMigration<T>($this$toContinuation);
        }
        return continuation;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final kotlin.coroutines.experimental.CoroutineContext toExperimentalCoroutineContext(@NotNull final CoroutineContext $this$toExperimentalCoroutineContext) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalCoroutineContext, "$this$toExperimentalCoroutineContext");
        final ContinuationInterceptor interceptor = $this$toExperimentalCoroutineContext.get((CoroutineContext.Key<ContinuationInterceptor>)ContinuationInterceptor.Key);
        final ContextMigration migration = $this$toExperimentalCoroutineContext.get((CoroutineContext.Key<ContextMigration>)ContextMigration.Key);
        final CoroutineContext remainder = $this$toExperimentalCoroutineContext.minusKey((CoroutineContext.Key<?>)ContinuationInterceptor.Key).minusKey((CoroutineContext.Key<?>)ContextMigration.Key);
        final ContextMigration contextMigration = migration;
        kotlin.coroutines.experimental.CoroutineContext context;
        if (contextMigration == null || (context = contextMigration.getContext()) == null) {
            context = EmptyCoroutineContext.INSTANCE;
        }
        final kotlin.coroutines.experimental.CoroutineContext original = context;
        final kotlin.coroutines.experimental.CoroutineContext result = (remainder == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) ? original : original.plus(new ExperimentalContextMigration(remainder));
        return (interceptor == null) ? result : result.plus(toExperimentalContinuationInterceptor(interceptor));
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final CoroutineContext toCoroutineContext(@NotNull final kotlin.coroutines.experimental.CoroutineContext $this$toCoroutineContext) {
        Intrinsics.checkParameterIsNotNull($this$toCoroutineContext, "$this$toCoroutineContext");
        final kotlin.coroutines.experimental.ContinuationInterceptor interceptor = $this$toCoroutineContext.get((kotlin.coroutines.experimental.CoroutineContext.Key<kotlin.coroutines.experimental.ContinuationInterceptor>)kotlin.coroutines.experimental.ContinuationInterceptor.Key);
        final ExperimentalContextMigration migration = $this$toCoroutineContext.get((kotlin.coroutines.experimental.CoroutineContext.Key<ExperimentalContextMigration>)ExperimentalContextMigration.Key);
        final kotlin.coroutines.experimental.CoroutineContext remainder = $this$toCoroutineContext.minusKey((kotlin.coroutines.experimental.CoroutineContext.Key<?>)kotlin.coroutines.experimental.ContinuationInterceptor.Key).minusKey((kotlin.coroutines.experimental.CoroutineContext.Key<?>)ExperimentalContextMigration.Key);
        final ExperimentalContextMigration experimentalContextMigration = migration;
        CoroutineContext context;
        if (experimentalContextMigration == null || (context = experimentalContextMigration.getContext()) == null) {
            context = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        final CoroutineContext original = context;
        final CoroutineContext result = (remainder == EmptyCoroutineContext.INSTANCE) ? original : original.plus(new ContextMigration(remainder));
        return (interceptor == null) ? result : result.plus(toContinuationInterceptor(interceptor));
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final kotlin.coroutines.experimental.ContinuationInterceptor toExperimentalContinuationInterceptor(@NotNull final ContinuationInterceptor $this$toExperimentalContinuationInterceptor) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalContinuationInterceptor, "$this$toExperimentalContinuationInterceptor");
        ContinuationInterceptor continuationInterceptor = $this$toExperimentalContinuationInterceptor;
        if (!($this$toExperimentalContinuationInterceptor instanceof ContinuationInterceptorMigration)) {
            continuationInterceptor = null;
        }
        final ContinuationInterceptorMigration continuationInterceptorMigration = (ContinuationInterceptorMigration)continuationInterceptor;
        kotlin.coroutines.experimental.ContinuationInterceptor interceptor;
        if (continuationInterceptorMigration == null || (interceptor = continuationInterceptorMigration.getInterceptor()) == null) {
            interceptor = new ExperimentalContinuationInterceptorMigration($this$toExperimentalContinuationInterceptor);
        }
        return interceptor;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final ContinuationInterceptor toContinuationInterceptor(@NotNull final kotlin.coroutines.experimental.ContinuationInterceptor $this$toContinuationInterceptor) {
        Intrinsics.checkParameterIsNotNull($this$toContinuationInterceptor, "$this$toContinuationInterceptor");
        kotlin.coroutines.experimental.ContinuationInterceptor continuationInterceptor = $this$toContinuationInterceptor;
        if (!($this$toContinuationInterceptor instanceof ExperimentalContinuationInterceptorMigration)) {
            continuationInterceptor = null;
        }
        final ExperimentalContinuationInterceptorMigration experimentalContinuationInterceptorMigration = (ExperimentalContinuationInterceptorMigration)continuationInterceptor;
        ContinuationInterceptor interceptor;
        if (experimentalContinuationInterceptorMigration == null || (interceptor = experimentalContinuationInterceptorMigration.getInterceptor()) == null) {
            interceptor = new ContinuationInterceptorMigration($this$toContinuationInterceptor);
        }
        return interceptor;
    }
    
    @NotNull
    public static final <R> Function1<kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull final Function1<? super Continuation<? super R>, ?> $this$toExperimentalSuspendFunction) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalSuspendFunction, "$this$toExperimentalSuspendFunction");
        return (Function1<kotlin.coroutines.experimental.Continuation<? super R>, Object>)new ExperimentalSuspendFunction0Migration<Object>((Function1<? super Continuation<?>, ?>)$this$toExperimentalSuspendFunction);
    }
    
    @NotNull
    public static final <T1, R> Function2<T1, kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull final Function2<? super T1, ? super Continuation<? super R>, ?> $this$toExperimentalSuspendFunction) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalSuspendFunction, "$this$toExperimentalSuspendFunction");
        return (Function2<T1, kotlin.coroutines.experimental.Continuation<? super R>, Object>)new ExperimentalSuspendFunction1Migration<T1, Object>((Function2<? super T1, ? super Continuation<?>, ?>)$this$toExperimentalSuspendFunction);
    }
    
    @NotNull
    public static final <T1, T2, R> Function3<T1, T2, kotlin.coroutines.experimental.Continuation<? super R>, Object> toExperimentalSuspendFunction(@NotNull final Function3<? super T1, ? super T2, ? super Continuation<? super R>, ?> $this$toExperimentalSuspendFunction) {
        Intrinsics.checkParameterIsNotNull($this$toExperimentalSuspendFunction, "$this$toExperimentalSuspendFunction");
        return (Function3<T1, T2, kotlin.coroutines.experimental.Continuation<? super R>, Object>)new ExperimentalSuspendFunction2Migration<T1, T2, Object>((Function3<? super T1, ? super T2, ? super Continuation<?>, ?>)$this$toExperimentalSuspendFunction);
    }
}
