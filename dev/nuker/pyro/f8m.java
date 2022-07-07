// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8m extends Lambda implements Function1
{
    public static f8m c;
    
    public f8m() {
        super(1);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.13(this, 763066952, o);
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2j(this, 276075057, blockPos);
    }
    
    static {
        final f8m c = new f8m();
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.1 != 0) {
                    n = -630829894;
                    break Label_0020;
                }
                n = 2067887906;
            }
            switch (n ^ 0x778EA6CB) {
                case 1403930518: {
                    continue;
                }
                default: {
                    f8m.c = c;
                }
                case -1377244559: {
                    throw null;
                }
            }
            break;
        }
    }
}
