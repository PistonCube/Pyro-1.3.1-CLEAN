// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8f extends Lambda implements Function1
{
    public static f8f c;
    
    static {
        f8f.c = new f8f();
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1f(this, 1748302356, o);
    }
    
    public f8f() {
        super(1);
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2m(this, 1742952858, blockPos);
    }
}
