// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ChunkRenderWorker.class })
public class ChunkRenderWorkerMixin
{
    @Redirect(method = { "processTask" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;getRenderViewEntity()Lnet/minecraft/entity/Entity;"))
    private Entity getRenderOrFreecamEntity(final Minecraft minecraft) {
        return (Entity)(((boolean)f4N.c.c.0()) ? ((f4N.c.c.0().3() == f9x.c) ? minecraft.field_71439_g : f4N.c.c) : minecraft.func_175606_aa());
    }
}
