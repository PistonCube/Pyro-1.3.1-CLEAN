// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8s extends Lambda implements Function1
{
    public static f8s c;
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2l(this, 14067242, blockPos);
    }
    
    public f8s() {
        super(1);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1o(this, 1908665135, o);
    }
    
    static {
        f8s.c = new f8s();
    }
}
