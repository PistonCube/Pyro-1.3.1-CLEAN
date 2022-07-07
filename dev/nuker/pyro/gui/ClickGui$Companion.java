// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.gui;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import dev.nuker.pyro.f0y;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012" }, d2 = { "Ldev/nuker/pyro/gui/ClickGui$Companion;", "", "()V", "DSCALE", "", "getDSCALE", "()D", "setDSCALE", "(D)V", "SCALE", "getSCALE", "setSCALE", "settings", "Ldev/nuker/pyro/api/ui/GuiSettings;", "getSettings", "()Ldev/nuker/pyro/api/ui/GuiSettings;", "setSettings", "(Ldev/nuker/pyro/api/ui/GuiSettings;)V", "pyroclient" })
public final class ClickGui$Companion
{
    public final double getSCALE() {
        return ClickGui.access$getSCALE$cp();
    }
    
    public final void setSCALE(final double <set-?>) {
        ClickGui.access$setSCALE$cp(<set-?>);
    }
    
    public final double getDSCALE() {
        return ClickGui.access$getDSCALE$cp();
    }
    
    public final void setDSCALE(final double <set-?>) {
        ClickGui.access$setDSCALE$cp(<set-?>);
    }
    
    @NotNull
    public final f0y getSettings() {
        return ClickGui.access$getSettings$cp();
    }
    
    public final void setSettings(@NotNull final f0y <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        ClickGui.access$setSettings$cp(<set-?>);
    }
    
    private ClickGui$Companion() {
    }
}
