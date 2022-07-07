// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8e extends Lambda implements Function1
{
    public static f8e c;
    
    static {
        f8e.c = new f8e();
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1f(this, 1748302357, o);
    }
    
    public f8e() {
        super(1);
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2f(this, 2056776576, blockPos);
    }
}
