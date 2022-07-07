// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8g extends Lambda implements Function1
{
    public static f8g c;
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2j(this, 276075056, blockPos);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1h(this, 552341640, o);
    }
    
    static {
        final f8g c = new f8g();
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.c < 0) {
                    n = -955089936;
                    break Label_0020;
                }
                n = 1077595521;
            }
            switch (n ^ 0x445C7E02) {
                case -1259902581: {
                    continue;
                }
                default: {
                    f8g.c = c;
                }
                case -2092038670: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public f8g() {
        super(1);
    }
}
