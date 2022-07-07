// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8l extends Lambda implements Function1
{
    public static f8l c;
    
    static {
        final f8l c = new f8l();
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.c < 0) {
                    n = 1213245376;
                    break Label_0020;
                }
                n = 271541748;
            }
            switch (n ^ 0xDA1FE2ED) {
                case -1156675240: {
                    continue;
                }
                default: {
                    f8l.c = c;
                }
                case -1840298707: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2k(this, 1453634466, blockPos);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1m(this, 323681574, o);
    }
    
    public f8l() {
        super(1);
    }
}
