// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Entity.class })
public interface EntityFlagAccessor
{
    @Invoker("getFlag")
    boolean get(final int p0);
    
    @Invoker("setFlag")
    void set(final int p0, final boolean p1);
}
