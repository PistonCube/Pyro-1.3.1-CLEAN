// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderManager.class })
public interface RenderManagerAccessor
{
    @Accessor("renderPosX")
    double getRenderPosX();
    
    @Accessor("renderPosY")
    double getRenderPosY();
    
    @Accessor("renderPosZ")
    double getRenderPosZ();
}
