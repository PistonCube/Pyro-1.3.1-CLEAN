// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import kotlin.jvm.JvmField;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;
import kotlin.text.MatchGroup;
import java.util.regex.MatchResult;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011" }, d2 = { "Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "ReflectAddSuppressedMethod", "kotlin-stdlib" })
public class PlatformImplementations
{
    public void addSuppressed(@NotNull final Throwable cause, @NotNull final Throwable exception) {
        Intrinsics.checkParameterIsNotNull(cause, "cause");
        Intrinsics.checkParameterIsNotNull(exception, "exception");
        final Method method = ReflectAddSuppressedMethod.method;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
    
    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull final MatchResult matchResult, @NotNull final String name) {
        Intrinsics.checkParameterIsNotNull(matchResult, "matchResult");
        Intrinsics.checkParameterIsNotNull(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
    
    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lkotlin/internal/PlatformImplementations$ReflectAddSuppressedMethod;", "", "()V", "method", "Ljava/lang/reflect/Method;", "kotlin-stdlib" })
    private static final class ReflectAddSuppressedMethod
    {
        @JvmField
        @Nullable
        public static final Method method;
        public static final ReflectAddSuppressedMethod INSTANCE;
        
        static {
            INSTANCE = new ReflectAddSuppressedMethod();
            final Class throwableClass = Throwable.class;
            final int n = 0;
            final Method[] methods = throwableClass.getMethods();
            Intrinsics.checkExpressionValueIsNotNull(methods, "throwableClass.methods");
            while (true) {
                for (final Method it : methods) {
                    final Method method2 = it;
                    final int n2 = 0;
                    final Method value = it;
                    Intrinsics.checkExpressionValueIsNotNull(value, "it");
                    boolean b = false;
                    Label_0130: {
                        if (Intrinsics.areEqual(value.getName(), "addSuppressed")) {
                            final Class<?>[] parameterTypes = it.getParameterTypes();
                            Intrinsics.checkExpressionValueIsNotNull(parameterTypes, "it.parameterTypes");
                            if (Intrinsics.areEqual(ArraysKt___ArraysKt.singleOrNull(parameterTypes), throwableClass)) {
                                b = true;
                                break Label_0130;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final Method method3 = method2;
                        method = method3;
                        return;
                    }
                }
                final Method method3 = null;
                continue;
            }
        }
    }
}
