// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.experimental;

import kotlin.TypeCastException;
import kotlin.coroutines.experimental.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.NotImplementedError;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.Nullable;
import kotlin.coroutines.experimental.jvm.internal.CoroutineIntrinsics;
import kotlin.jvm.functions.Function1;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0081\b\u001a3\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0004\u0012\u00020\u00070\u000fH\u0087H\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t\"\u0004\b\u0000\u0010\u000e*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a]\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u000e*#\b\u0001\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u0002H\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a>\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0019\u001aW\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u000e*#\b\u0001\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u0002H\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0007\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u001b\u0010\u0000\u001a\u00020\u00018\u00c6\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\t¨\u0006\u001b" }, d2 = { "coroutineContext", "Lkotlin/coroutines/experimental/CoroutineContext;", "coroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "processBareContinuationResume", "", "completion", "Lkotlin/coroutines/experimental/Continuation;", "block", "Lkotlin/Function0;", "", "suspendCoroutine", "T", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "createCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)V", "kotlin-stdlib-coroutines" })
@JvmName(name = "CoroutinesKt")
public final class CoroutinesKt
{
    @SinceKotlin(version = "1.1")
    public static final <R, T> void startCoroutine(@NotNull final Function2<? super R, ? super Continuation<? super T>, ?> $this$startCoroutine, final R receiver, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$startCoroutine, "$this$startCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked((Function2<? super R, ? super Continuation<? super Object>, ?>)$this$startCoroutine, receiver, (Continuation<? super Object>)completion).resume(Unit.INSTANCE);
    }
    
    @SinceKotlin(version = "1.1")
    public static final <T> void startCoroutine(@NotNull final Function1<? super Continuation<? super T>, ?> $this$startCoroutine, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$startCoroutine, "$this$startCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked((Function1<? super Continuation<? super Object>, ?>)$this$startCoroutine, (Continuation<? super Object>)completion).resume(Unit.INSTANCE);
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <R, T> Continuation<Unit> createCoroutine(@NotNull final Function2<? super R, ? super Continuation<? super T>, ?> $this$createCoroutine, final R receiver, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$createCoroutine, "$this$createCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked((Function2<? super R, ? super Continuation<? super Object>, ?>)$this$createCoroutine, receiver, (Continuation<? super Object>)completion), IntrinsicsKt__IntrinsicsJvmKt.getCOROUTINE_SUSPENDED());
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> Continuation<Unit> createCoroutine(@NotNull final Function1<? super Continuation<? super T>, ?> $this$createCoroutine, @NotNull final Continuation<? super T> completion) {
        Intrinsics.checkParameterIsNotNull($this$createCoroutine, "$this$createCoroutine");
        Intrinsics.checkParameterIsNotNull(completion, "completion");
        return new SafeContinuation<Unit>(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnchecked((Function1<? super Continuation<? super Object>, ?>)$this$createCoroutine, (Continuation<? super Object>)completion), IntrinsicsKt__IntrinsicsJvmKt.getCOROUTINE_SUSPENDED());
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final <T> Object suspendCoroutine(@NotNull final Function1<? super Continuation<? super T>, Unit> block, @NotNull final Continuation<? super T> $completion) {
        final int $i$f$suspendCoroutine = 0;
        final Continuation c = CoroutineIntrinsics.normalizeContinuation((Continuation<? super Object>)$completion);
        final int n = 0;
        final SafeContinuation safe = new SafeContinuation(c);
        block.invoke((Object)safe);
        return safe.getResult();
    }
    
    @SinceKotlin(version = "1.1")
    @Nullable
    private static final Object suspendCoroutine$$forInline(@NotNull final Function1 block, @NotNull final Continuation continuation) {
        final int $i$f$suspendCoroutine = 0;
        InlineMarker.mark(0);
        final Continuation c = CoroutineIntrinsics.normalizeContinuation(continuation);
        final int n = 0;
        final SafeContinuation safe = new SafeContinuation(c);
        block.invoke(safe);
        final Object result = safe.getResult();
        InlineMarker.mark(1);
        return result;
    }
    
    private static final CoroutineContext getCoroutineContext() {
        final int $i$f$getCoroutineContext = 0;
        throw new NotImplementedError("Implemented as intrinsic");
    }
    
    @InlineOnly
    private static final void processBareContinuationResume(final Continuation<?> completion, final Function0<?> block) {
        final int $i$f$processBareContinuationResume = 0;
        try {
            final Object result = block.invoke();
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                if (completion == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
                }
                completion.resume(result);
            }
        }
        catch (Throwable t) {
            completion.resumeWithException(t);
        }
    }
}
