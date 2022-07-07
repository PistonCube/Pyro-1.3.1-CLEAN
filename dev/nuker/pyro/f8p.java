// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8p extends Lambda implements Function1
{
    public static f8p c;
    
    @Override
    public Object invoke(final Object o) {
        return fbS.0Z(this, 539877929, o);
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2g(this, 80337339, blockPos);
    }
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 62000295;
                    break Label_0017;
                }
                n = 612777586;
            }
            switch (n ^ 0x81D008) {
                case 53730479: {
                    continue;
                }
                case 604499578: {
                    f8p.c = new f8p();
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public f8p() {
        super(1);
    }
}
