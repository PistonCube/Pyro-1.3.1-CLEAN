// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.entity.Entity;

public class f37 extends f2U
{
    public Entity c;
    
    public f37(final f2T f2T, final Entity c) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = -2016941249;
                    break Label_0013;
                }
                n = 491073730;
            }
            switch (n ^ 0xB08BAFE7) {
                case 1614939259: {
                    continue;
                }
                default: {
                    super(f2T);
                    while (true) {
                        int n2 = 0;
                        Label_0064: {
                            if (fc.c < 0) {
                                n2 = 1504268317;
                                break Label_0064;
                            }
                            n2 = -61519366;
                        }
                        switch (n2 ^ 0xB96E734) {
                            case 1567231526: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                return;
                            }
                            case 1379907369: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 927745240: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public Entity c() {
        return fbS.gX(this, 317012956);
    }
    
    static {
        throw t;
    }
    
    public void c(final Entity entity) {
        fbS.h0(this, 31378841, entity);
    }
}
