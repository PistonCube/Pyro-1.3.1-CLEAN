// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import java.util.Map;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderGlobal.class })
public interface RenderGlobalAccessor
{
    @Accessor("entityOutlineShader")
    ShaderGroup getEntityOutlineShader();
    
    @Accessor("damagedBlocks")
    Map getDamagedBlocks();
}
