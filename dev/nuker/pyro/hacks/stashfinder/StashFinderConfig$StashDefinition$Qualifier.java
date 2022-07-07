// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.hacks.stashfinder;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011" }, d2 = { "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;", "", "min", "", "ids", "", "", "(I[Ljava/lang/String;)V", "", "getIds", "()Ljava/util/List;", "setIds", "(Ljava/util/List;)V", "getMin", "()I", "setMin", "(I)V", "pyroclient" })
public final class StashFinderConfig$StashDefinition$Qualifier
{
    @NotNull
    private List<String> ids;
    private int min;
    
    @NotNull
    public final List getIds() {
        return this.ids;
    }
    
    public final void setIds(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.ids = (List<String>)<set-?>;
    }
    
    public final int getMin() {
        return this.min;
    }
    
    public final void setMin(final int <set-?>) {
        this.min = <set-?>;
    }
    
    public StashFinderConfig$StashDefinition$Qualifier(final int min, @NotNull final String... ids) {
        Intrinsics.checkParameterIsNotNull(ids, "ids");
        this.ids = CollectionsKt__CollectionsKt.listOf((String[])Arrays.copyOf((T[])ids, ids.length));
        this.min = min;
    }
}
