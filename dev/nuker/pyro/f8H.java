// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public class f8h extends Lambda implements Function1
{
    public static f8h c;
    
    @Override
    public Object invoke(final Object o) {
        return fbS.1b(this, 1320980058, o);
    }
    
    public f8h() {
        super(1);
    }
    
    public BlockPos c(@NotNull final BlockPos blockPos) {
        return fbS.2i(this, 2013558511, blockPos);
    }
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 881070645;
                    break Label_0017;
                }
                n = 620355355;
            }
            switch (n ^ 0xC7045531) {
                case 153770761: {
                    continue;
                }
                default: {
                    final f8h c = new f8h();
                    while (true) {
                        int n2 = 0;
                        Label_0064: {
                            if (fc.c < 0) {
                                n2 = 1589644655;
                                break Label_0064;
                            }
                            n2 = -509979404;
                        }
                        switch (n2 ^ 0xE7243E2A) {
                            case -1342883950: {
                                continue;
                            }
                            default: {
                                f8h.c = c;
                                return;
                            }
                            case -1176227003: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -209697020: {
                    throw null;
                }
            }
            break;
        }
    }
}
