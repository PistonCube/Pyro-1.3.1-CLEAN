// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import com.mojang.brigadier.CommandDispatcher;

public class f20
{
    public static f20 c;
    
    static {
        final f20 c = new f20();
        while (true) {
            int n = 0;
            Label_0022: {
                if (fc.c < 0) {
                    n = -1333982328;
                    break Label_0022;
                }
                n = -1370651673;
            }
            switch (n ^ 0xEE64C142) {
                case 1578748618: {
                    continue;
                }
                case 1076445861: {
                    f20.c = c;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(@NotNull final CommandDispatcher commandDispatcher) {
        fbS.7E(this, 1869342246, commandDispatcher);
    }
}
