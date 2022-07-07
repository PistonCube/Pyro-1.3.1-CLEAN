// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.List;
import net.minecraft.client.shader.ShaderGroup;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ShaderGroup.class })
public interface ShaderGroupAccessor
{
    @Accessor("listShaders")
    List getShaders();
}
