// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.AxisAlignedBB;

public class f2S extends f2U
{
    @NotNull
    public AxisAlignedBB c;
    
    public void c(@NotNull final AxisAlignedBB c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0041:
            while (true) {
                do {
                    Label_0028: {
                        break Label_0028;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0033;
                            }
                            continue Label_0041;
                            this.c = c;
                            return;
                        }
                        catch (NullPointerException ex) {}
                    }
                    continue Label_0041;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f2S(@NotNull final AxisAlignedBB c, @NotNull final f2T f2T) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = -186275425;
                    break Label_0013;
                }
                n = -582816010;
            }
            switch (n ^ 0x48A1A13C) {
                case -1392582404: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0059: {
                            if (fc.c < 0) {
                                n2 = -1502675251;
                                break Label_0059;
                            }
                            n2 = -1251551324;
                        }
                        switch (n2 ^ 0x83D6CD4E) {
                            case -1340538108: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0103: {
                                        if (fc.c < 0) {
                                            n3 = 1546002390;
                                            break Label_0103;
                                        }
                                        n3 = -1753414731;
                                    }
                                    switch (n3 ^ 0x8B9B74EF) {
                                        case -675452103: {
                                            continue;
                                        }
                                        case 484865882: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0147: {
                                                    if (fc.c < 0) {
                                                        n4 = 686985881;
                                                        break Label_0147;
                                                    }
                                                    n4 = -741886694;
                                                }
                                                switch (n4 ^ 0x69A65C73) {
                                                    case 1545388609: {
                                                        continue;
                                                    }
                                                    default: {
                                                        super(f2T);
                                                        this.c = c;
                                                        return;
                                                    }
                                                    case 1096077034: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        default: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 632828803: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -1136392029: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public AxisAlignedBB c() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0083:
            while (true) {
            Block_4_Outer:
                do {
                    Label_0070: {
                        break Label_0070;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0075;
                            }
                            continue Label_0083;
                            // switch([Lcom.strobel.decompiler.ast.Label;@7cd90615, n ^ 0xEAA79BA1)
                            while (true) {
                                while (true) {
                                    int n = -2013251561;
                                    continue Block_4_Outer;
                                    Label_0060: {
                                        return this.c;
                                    }
                                    Label_0028:
                                    n = 1636728768;
                                    continue Block_4_Outer;
                                }
                                Label_0064: {
                                    throw null;
                                }
                                continue;
                            }
                        }
                        // iftrue(Label_0028:, fc.c >= 0)
                        catch (EnumConstantNotPresentException ex) {}
                    }
                    continue Label_0083;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        throw t;
    }
}
