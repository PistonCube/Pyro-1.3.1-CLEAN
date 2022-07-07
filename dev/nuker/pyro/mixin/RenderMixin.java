// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.fS;
import dev.nuker.pyro.f9p;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Render.class })
public class RenderMixin
{
    @Inject(method = { "getTeamColor" }, at = { @At("HEAD") }, cancellable = true)
    private void getEspColor(final Entity entityIn, final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.g().3() == f9p.0) {
            final fS color = f4N.c.0(entityIn);
            if (color != null) {
                cir.setReturnValue(color.5());
            }
        }
    }
}
