// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.hacks.stashfinder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001b" }, d2 = { "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition;", "", "name", "", "downloadChunks", "", "saveLargeLog", "blockQualifiers", "", "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;", "(Ljava/lang/String;ZZ[Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;)V", "getBlockQualifiers", "()[Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;", "setBlockQualifiers", "([Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;)V", "[Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition$Qualifier;", "getDownloadChunks", "()Z", "setDownloadChunks", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSaveLargeLog", "setSaveLargeLog", "Qualifier", "pyroclient" })
public final class StashFinderConfig$StashDefinition
{
    @NotNull
    private String name;
    private boolean downloadChunks;
    private boolean saveLargeLog;
    @NotNull
    private StashFinderConfig$StashDefinition$Qualifier[] blockQualifiers;
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    public final void setName(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.name = <set-?>;
    }
    
    public final boolean getDownloadChunks() {
        return this.downloadChunks;
    }
    
    public final void setDownloadChunks(final boolean <set-?>) {
        this.downloadChunks = <set-?>;
    }
    
    public final boolean getSaveLargeLog() {
        return this.saveLargeLog;
    }
    
    public final void setSaveLargeLog(final boolean <set-?>) {
        this.saveLargeLog = <set-?>;
    }
    
    @NotNull
    public final StashFinderConfig$StashDefinition$Qualifier[] getBlockQualifiers() {
        return this.blockQualifiers;
    }
    
    public final void setBlockQualifiers(@NotNull final StashFinderConfig$StashDefinition$Qualifier[] <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.blockQualifiers = <set-?>;
    }
    
    public StashFinderConfig$StashDefinition(@NotNull final String name, final boolean downloadChunks, final boolean saveLargeLog, @NotNull final StashFinderConfig$StashDefinition$Qualifier[] blockQualifiers) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(blockQualifiers, "blockQualifiers");
        this.name = name;
        this.downloadChunks = downloadChunks;
        this.saveLargeLog = saveLargeLog;
        this.blockQualifiers = blockQualifiers;
    }
}
