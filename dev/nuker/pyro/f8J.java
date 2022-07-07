// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8j extends Lambda implements Function1
{
    public static f8j c;
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2f(this, 2056776579, blockPos);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.0U(this, 553441746, o);
    }
    
    public f8j() {
        super(1);
    }
    
    static {
        f8j.c = new f8j();
    }
}
