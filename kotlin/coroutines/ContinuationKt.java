// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.NotImplementedError;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ResultKt;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00012\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0087\b\u00f8\u0001\u0000\u001a3\u0010\u000e\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0004\u0012\u00020\r0\u000bH\u0087H\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001b\u001a\u0002H\bH\u0087\b¢\u0006\u0002\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\b\u001a>\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010!\u001aW\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\"\"\u001b\u0010\u0000\u001a\u00020\u00018\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#" }, d2 = { "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Continuation", "Lkotlin/coroutines/Continuation;", "T", "context", "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resume", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", "exception", "", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib" })
public final class ContinuationKt
{
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resume(@NotNull final Continuation<? super T> $this$resume, final T value) {
        final int $i$f$resume = 0;
        final Result.Companion companion = Result.Companion;
        $this$resume.resumeWith(Result.constructor-impl(value));
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resumeWithException(@NotNull final Continuation<? super T> $this$resumeWithException, final Throwable exception) {
        final int $i$f$resumeWithException = 0;
        final Result.Companion companion = Result.Companion;
        $this$resumeWithException.resumeWith(Result.constructor-impl(ResultKt.createFailure(exception)));
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Continuation<T> Continuation(final CoroutineContext context, final Function1<? super Result<? extends T>, Unit> resumeWith) {
        final int $i$f$Continuation = 0;
        return (Continuation<T>)new ContinuationKt$Continuation.ContinuationKt$Continuation$1(context, (Function1)resumeWith);
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<Unit> createCoroutine(@NotNull final Function1<? super Continuation<? super T>, ?> $this$createCoroutine, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$createCoroutine, "$this$createCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt__IntrinsicsJvmKt.intercepted((Continuation<? super Unit>)IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted((Function1<? super Continuation<? super Object>, ?>)$this$createCoroutine, (Continuation<? super Object>)completion)), IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <R, T> Continuation<Unit> createCoroutine(@NotNull final Function2<? super R, ? super Continuation<? super T>, ?> $this$createCoroutine, final R receiver, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$createCoroutine, "$this$createCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt__IntrinsicsJvmKt.intercepted((Continuation<? super Unit>)IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted((Function2<? super R, ? super Continuation<? super Object>, ?>)$this$createCoroutine, receiver, (Continuation<? super Object>)completion)), IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }
    
    @SinceKotlin(version = "1.3")
    public static final <T> void startCoroutine(@NotNull final Function1<? super Continuation<? super T>, ?> $this$startCoroutine, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$startCoroutine, "$this$startCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        final Continuation<Object> intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted((Continuation<? super Object>)IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted((Function1<? super Continuation<? super Object>, ?>)$this$startCoroutine, (Continuation<? super Object>)completion));
        final Unit instance = Unit.INSTANCE;
        final Continuation<Object> continuation = intercepted;
        final Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.constructor-impl(instance));
    }
    
    @SinceKotlin(version = "1.3")
    public static final <R, T> void startCoroutine(@NotNull final Function2<? super R, ? super Continuation<? super T>, ?> $this$startCoroutine, final R receiver, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$startCoroutine, "$this$startCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        final Continuation<Object> intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted((Continuation<? super Object>)IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted((Function2<? super R, ? super Continuation<? super Object>, ?>)$this$startCoroutine, receiver, (Continuation<? super Object>)completion));
        final Unit instance = Unit.INSTANCE;
        final Continuation<Object> continuation = intercepted;
        final Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.constructor-impl(instance));
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object suspendCoroutine(final Function1<? super Continuation<? super T>, Unit> block, final Continuation<? super T> frame) {
        final int $i$f$suspendCoroutine = 0;
        InlineMarker.mark(0);
        final Continuation c = frame;
        final int n = 0;
        final SafeContinuation safe = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted((Continuation<? super T>)c));
        block.invoke((Object)safe);
        final Object orThrow = safe.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(frame);
        }
        InlineMarker.mark(1);
        return orThrow;
    }
    
    private static final CoroutineContext getCoroutineContext() {
        final int $i$f$getCoroutineContext = 0;
        throw new NotImplementedError("Implemented as intrinsic");
    }
}
