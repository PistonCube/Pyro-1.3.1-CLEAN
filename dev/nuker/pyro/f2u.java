// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ConcurrentModificationException;

public class f2U extends f04
{
    public f2T c;
    
    public f2T c() {
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
                            if (fc.c < 0) {
                                continue Label_0038;
                            }
                            null;
                            return this.c;
                        }
                        catch (ConcurrentModificationException ex) {
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
    
    static {
        throw t;
    }
    
    public f2U() {
        this.c = f2T.c;
    }
    
    public f2U(final f2T c) {
        this.c = f2T.c;
        while (true) {
            int n = 0;
            Label_0024: {
                if (fc.0 != 0) {
                    n = 1564823414;
                    break Label_0024;
                }
                n = -738000735;
            }
            switch (n ^ 0xD3291617) {
                case -1905501855: {
                    continue;
                }
                case 120198838: {
                    while (true) {
                        int n2 = 0;
                        Label_0066: {
                            if (fc.0 != 0) {
                                n2 = -233243702;
                                break Label_0066;
                            }
                            n2 = 2111481117;
                        }
                        switch (n2 ^ 0x40816387) {
                            case -1298556851: {
                                continue;
                            }
                            case 1029424794: {
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final f2T c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0130:
            while (true) {
            Label_0113_Outer:
                do {
                    Label_0117: {
                        break Label_0117;
                    Label_0074_Outer:
                        while (true) {
                            try {
                                o = null;
                                if (fc.1 > 0) {
                                    continue Label_0130;
                                }
                                null;
                                // switch([Lcom.strobel.decompiler.ast.Label;@7136199e, n ^ 0xCE34849E)
                                // iftrue(Label_0027:, fc.1 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@b2e368e, n2 ^ 0x33C7CC5C)
                                // iftrue(Label_0072:, fc.0 == 0)
                                while (true) {
                                    Block_5: {
                                        while (true) {
                                            Label_0104: {
                                                this.c = c;
                                            }
                                            return;
                                            Label_0111:
                                            throw null;
                                            Block_4: {
                                                break Block_4;
                                                Label_0027:
                                                final int n = 750697268;
                                                continue Label_0113_Outer;
                                                Label_0060:
                                                break Block_5;
                                            }
                                            final int n = -26330485;
                                            continue Label_0113_Outer;
                                        }
                                        Label_0072: {
                                            final int n2 = -2052141210;
                                        }
                                        continue;
                                        Label_0109:
                                        throw null;
                                    }
                                    final int n2 = -350978777;
                                    continue;
                                }
                                continue Label_0074_Outer;
                            }
                            catch (AssertionError assertionError) {
                                if (assertionError != null) {
                                    throw assertionError;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0130;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
}
