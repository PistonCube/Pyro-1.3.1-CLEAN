// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random.jdk8;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.Metadata;
import kotlin.random.AbstractPlatformRandom;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextDouble", "", "until", "nextInt", "", "from", "nextLong", "", "kotlin-stdlib-jdk8" })
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom
{
    @NotNull
    @Override
    public java.util.Random getImpl() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkExpressionValueIsNotNull(current, "ThreadLocalRandom.current()");
        return current;
    }
    
    @Override
    public int nextInt(final int from, final int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }
    
    @Override
    public long nextLong(final long until) {
        return ThreadLocalRandom.current().nextLong(until);
    }
    
    @Override
    public long nextLong(final long from, final long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }
    
    @Override
    public double nextDouble(final double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }
}
