// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8u extends Lambda implements Function1
{
    public static f8u c;
    
    public f8u() {
        super(1);
    }
    
    static {
        f8u.c = new f8u();
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2k(this, 1453634465, blockPos);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.0Z(this, 539877928, o);
    }
}
