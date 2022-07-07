// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8n extends Lambda implements Function1
{
    public static f8n c;
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2m(this, 1742952859, blockPos);
    }
    
    @Override
    public Object invoke(final Object o) {
        return fbS.0P(this, 362835447, o);
    }
    
    public f8n() {
        super(1);
    }
    
    static {
        final f8n c = new f8n();
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.c < 0) {
                    n = 1739611740;
                    break Label_0020;
                }
                n = 1765665432;
            }
            switch (n ^ 0xC28E0FAF) {
                case -1522642445: {
                    continue;
                }
                case -1414273737: {
                    f8n.c = c;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
}
