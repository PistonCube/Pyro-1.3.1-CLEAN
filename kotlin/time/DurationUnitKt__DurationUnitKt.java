// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0001¨\u0006\u0004" }, d2 = { "shortName", "", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "kotlin-stdlib" }, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final String shortName(@NotNull final TimeUnit $this$shortName) {
        Intrinsics.checkParameterIsNotNull($this$shortName, "$this$shortName");
        String s = null;
        switch (DurationUnitKt$WhenMappings.$EnumSwitchMapping$0[$this$shortName.ordinal()]) {
            case 1: {
                s = "ns";
                break;
            }
            case 2: {
                s = "us";
                break;
            }
            case 3: {
                s = "ms";
                break;
            }
            case 4: {
                s = "s";
                break;
            }
            case 5: {
                s = "m";
                break;
            }
            case 6: {
                s = "h";
                break;
            }
            case 7: {
                s = "d";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return s;
    }
    
    public DurationUnitKt__DurationUnitKt() {
    }
}
