// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.Vec3d;

public class fa1
{
    @NotNull
    public Vec3d c;
    @NotNull
    public Block c;
    
    public fa1(@NotNull final Vec3d c, @NotNull final Block c2) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.0 != 0) {
                    n = -1853278169;
                    break Label_0015;
                }
                n = -1359493039;
            }
            switch (n ^ 0xF8942772) {
                case 779921648: {
                    continue;
                }
                default: {
                    this.c = c;
                    this.c = c2;
                }
                case 1763516245: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public Block c() {
        return fbS.1p(this, 1354575596);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public Vec3d 0() {
        return fbS.28(this, 341239508);
    }
    
    public void c(@NotNull final Block block) {
        fbS.4z(this, 885893056, block);
    }
    
    public void c(@NotNull final Vec3d vec3d) {
        fbS.2e(this, 1424173435, vec3d);
    }
}
