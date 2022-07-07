// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;
import kotlin.SinceKotlin;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0001*\u001e\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nB\u0002\b\u000b¨\u0006\f" }, d2 = { "convertDurationUnit", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "DurationUnit", "Lkotlin/SinceKotlin;", "version", "1.3", "Lkotlin/time/ExperimentalTime;", "kotlin-stdlib" }, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double convertDurationUnit(final double value, @NotNull final TimeUnit sourceUnit, @NotNull final TimeUnit targetUnit) {
        Intrinsics.checkParameterIsNotNull(sourceUnit, "sourceUnit");
        Intrinsics.checkParameterIsNotNull(targetUnit, "targetUnit");
        final long sourceInTargets = targetUnit.convert(1L, sourceUnit);
        if (sourceInTargets > 0L) {
            return value * sourceInTargets;
        }
        final long otherInThis = sourceUnit.convert(1L, targetUnit);
        return value / otherInThis;
    }
    
    public DurationUnitKt__DurationUnitJvmKt() {
    }
}
