// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8t extends Lambda implements Function1
{
    public static f8t c;
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2h(this, 1777720671, blockPos);
    }
    
    public f8t() {
        super(1);
    }
    
    static {
        f8t.c = new f8t();
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1d(this, 1113727037, o);
    }
}
