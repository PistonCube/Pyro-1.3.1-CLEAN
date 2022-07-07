// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.AxisAlignedBB;

public class f3l extends f2S
{
    public float c;
    
    public float c() {
        return fbS.aU(this, 79039365);
    }
    
    public f3l(@NotNull final AxisAlignedBB axisAlignedBB, final float c, @NotNull final f2T f2T) {
        while (true) {
            int n = 0;
            Label_0018: {
                if (fc.0 != 0) {
                    n = -2086458617;
                    break Label_0018;
                }
                n = 1012208715;
            }
            switch (n ^ 0xA3733A3E) {
                case -151862638: {
                    continue;
                }
                default: {
                    super(axisAlignedBB, f2T);
                    while (true) {
                        int n2 = 0;
                        Label_0066: {
                            if (fc.c < 0) {
                                n2 = -2102750450;
                                break Label_0066;
                            }
                            n2 = -290571748;
                        }
                        switch (n2 ^ 0xDE2A7ECA) {
                            case 1551953348: {
                                continue;
                            }
                            case 813974742: {
                                this.c = c;
                                return;
                            }
                            default: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 550506809: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final float n) {
        fbS.8g(this, 1393706497, n);
    }
    
    static {
        throw t;
    }
}
