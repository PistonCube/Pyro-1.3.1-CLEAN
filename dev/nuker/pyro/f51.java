// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.BlockPos;

public class f51 extends BlockPos
{
    public fbB c;
    public boolean c;
    public boolean 0;
    public f55 c;
    
    public f51(final f55 f55, final BlockPos blockPos, final fbB fbB, final boolean b) {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = 1914146763;
                    break Label_0014;
                }
                n = 1313981816;
            }
            switch (n ^ 0x7EEF87D3) {
                case 662392381: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.c < 0) {
                                n2 = -1238929571;
                                break Label_0058;
                            }
                            n2 = 421347022;
                        }
                        switch (n2 ^ 0x6B50EF64) {
                            case 2102558558: {
                                continue;
                            }
                            default: {
                                this(f55, blockPos, fbB, false, b);
                                return;
                            }
                            case -579370951: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 217581592: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public f51(final f55 c, final BlockPos blockPos, final fbB c2, final boolean c3, final boolean 0) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = 1257602931;
                    break Label_0013;
                }
                n = -1524295351;
            }
            switch (n ^ 0x13461B18) {
                case 2014963639: {
                    continue;
                }
                default: {
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0062: {
                            if (fc.c < 0) {
                                n2 = 2088471922;
                                break Label_0062;
                            }
                            n2 = -949531926;
                        }
                        switch (n2 ^ 0x351EE7E5) {
                            case 657975023: {
                                continue;
                            }
                            default: {
                                super((Vec3i)blockPos);
                                this.c = c2;
                                while (true) {
                                    int n3 = 0;
                                    Label_0115: {
                                        if (fc.0 != 0) {
                                            n3 = 860315785;
                                            break Label_0115;
                                        }
                                        n3 = -706455962;
                                    }
                                    switch (n3 ^ 0x1732E83F) {
                                        case -42947301: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c3;
                                            this.0 = 0;
                                            return;
                                        }
                                        case 611682486: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1231383191: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1504928875: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
}
