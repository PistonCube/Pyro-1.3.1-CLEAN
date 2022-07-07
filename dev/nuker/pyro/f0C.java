// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f0c
{
    @NotNull
    public fZ c;
    public float c;
    
    public f0c(@NotNull final fZ c, final float c2) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.1 != 0) {
                    n = 1213520544;
                    break Label_0015;
                }
                n = -141627163;
            }
            switch (n ^ 0xBBEEC7AB) {
                case -205906677: {
                    continue;
                }
                case 1281374030: {
                    this.c = c;
                    this.c = c2;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final float n) {
        fbS.8u(this, 1125410708, n);
    }
    
    public void c(@NotNull final fZ c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0087:
            while (true) {
            Label_0070_Outer:
                do {
                    Label_0074: {
                        break Label_0074;
                    Label_0070:
                        while (true) {
                            try {
                                o = null;
                                if (fc.0 > 0) {
                                    continue Label_0087;
                                }
                                null;
                                while (true) {
                                    int n = 482153853;
                                    continue Label_0070_Outer;
                                    Label_0060: {
                                        this.c = c;
                                    }
                                    return;
                                    continue Label_0070;
                                    Label_0068:
                                    throw null;
                                    Label_0027:
                                    n = -2061387893;
                                    continue Label_0070_Outer;
                                }
                            }
                            // switch([Lcom.strobel.decompiler.ast.Label;@17b2c2a1, n ^ 0x22CFC046)
                            // iftrue(Label_0027:, fc.c >= 0)
                            catch (IllegalArgumentException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue Label_0070;
                            }
                            break;
                        }
                    }
                    continue Label_0087;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        throw t;
    }
    
    public float c() {
        return fbS.aS(this, 302101038);
    }
    
    @NotNull
    public fZ 0() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.0 > 0) {
                                continue Label_0038;
                            }
                            null;
                            return this.c;
                            return this.c;
                        }
                        catch (RuntimeException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return this.c;
                        }
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
}
