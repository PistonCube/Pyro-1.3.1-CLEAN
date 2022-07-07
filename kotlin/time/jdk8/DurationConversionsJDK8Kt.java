// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time.jdk8;

import kotlin.internal.InlineOnly;
import kotlin.time.ExperimentalTime;
import kotlin.SinceKotlin;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import java.time.Duration;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(D)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)D", "kotlin-stdlib-jdk8" }, pn = "kotlin.time")
@JvmName(name = "DurationConversionsJDK8Kt")
public final class DurationConversionsJDK8Kt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @InlineOnly
    private static final double toKotlinDuration(@NotNull final Duration $this$toKotlinDuration) {
        final int $i$f$toKotlinDuration = 0;
        return kotlin.time.Duration.plus-LRDsOJo(DurationKt.getSeconds($this$toKotlinDuration.getSeconds()), DurationKt.getNanoseconds($this$toKotlinDuration.getNano()));
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @InlineOnly
    private static final Duration toJavaDuration-LRDsOJo(final double $this$toJavaDuration) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$toJavaDuration-LRDsOJo */
        //     3: dload_0         /* $this$toJavaDuration */
        //     4: dstore_3        /* $this$iv */
        //     5: iconst_0       
        //     6: istore          $i$f$toComponents
        //     8: dload_3         /* $this$iv */
        //     9: invokestatic    kotlin/time/Duration.getInSeconds-impl:(D)D
        //    12: d2l            
        //    13: dload_3         /* $this$iv */
        //    14: invokestatic    kotlin/time/Duration.getNanosecondsComponent-impl:(D)I
        //    17: istore          6
        //    19: lstore          seconds
        //    21: iconst_0       
        //    22: istore          $i$a$-toComponents-DurationConversionsJDK8Kt$toJavaDuration$1
        //    24: lload           seconds
        //    26: iload           nanoseconds
        //    28: i2l            
        //    29: invokestatic    java/time/Duration.ofSeconds:(JJ)Ljava/time/Duration;
        //    32: dup            
        //    33: ldc             "java.time.Duration.ofSec\u2026ds, nanoseconds.toLong())"
        //    35: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    38: nop            
        //    39: dup            
        //    40: ldc             "toComponents { seconds, \u2026, nanoseconds.toLong()) }"
        //    42: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    45: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
