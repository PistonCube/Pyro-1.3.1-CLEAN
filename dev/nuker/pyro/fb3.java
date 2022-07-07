// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import java.util.Comparator;

public class fb3 implements Comparator
{
    @Nullable
    public fb4<Object> c;
    
    @Override
    public int compare(final Object o, final Object o2) {
        return fbS.3F(this, 746658873, o, o2);
    }
    
    @Nullable
    public fb4 c() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0084:
            while (true) {
                do {
                    Label_0071: {
                        break Label_0071;
                        while (true) {
                            try {
                                o = null;
                                if (fc.0 > 0) {
                                    continue Label_0084;
                                }
                                null;
                                Label_0065: {
                                    throw null;
                                }
                                Label_0027:
                                int n = -1496604852;
                                // iftrue(Label_0027:, fc.0 == 0)
                                Label_0029: {
                                    break Label_0029;
                                    Label_0060:
                                    return this.c;
                                    n = -1943485900;
                                    break Label_0029;
                                    continue;
                                }
                            }
                            // switch([Lcom.strobel.decompiler.ast.Label;@d620690, n ^ 0xFF85E30B)
                            catch (NumberFormatException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0084;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(@Nullable final fb4 fb4) {
        fbS.5Q(this, 792668160, fb4);
    }
    
    static {
        throw t;
    }
}
