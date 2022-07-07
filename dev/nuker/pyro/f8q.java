// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8q extends Lambda implements Function1
{
    public static f8q c;
    
    @Override
    public Object invoke(final Object o) {
        return fbS.12(this, 702409644, o);
    }
    
    static {
        f8q.c = new f8q();
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2i(this, 2013558504, blockPos);
    }
    
    public f8q() {
        super(1);
    }
}
