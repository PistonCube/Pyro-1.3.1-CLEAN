// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Ldev/nuker/pyro/PyroLightmap$Companion;", "", "()V", "INSTANCE", "Ldev/nuker/pyro/PyroLightmap;", "getINSTANCE", "()Ldev/nuker/pyro/PyroLightmap;", "setINSTANCE", "(Ldev/nuker/pyro/PyroLightmap;)V", "pyroclient" })
public final class PyroLightmap$Companion
{
    @NotNull
    public final PyroLightmap getINSTANCE() {
        final PyroLightmap access$getINSTANCE$cp = PyroLightmap.access$getINSTANCE$cp();
        if (access$getINSTANCE$cp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        }
        return access$getINSTANCE$cp;
    }
    
    public final void setINSTANCE(@NotNull final PyroLightmap <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        PyroLightmap.access$setINSTANCE$cp(<set-?>);
    }
    
    private PyroLightmap$Companion() {
    }
}
