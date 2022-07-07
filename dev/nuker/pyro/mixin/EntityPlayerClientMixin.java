// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.Entity;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.entity.AbstractClientPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ AbstractClientPlayer.class })
public class EntityPlayerClientMixin
{
    @Inject(method = { "isSpectator" }, at = { @At("HEAD") }, cancellable = true)
    private void markFreecamSpectator(final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c && ((Entity)this).func_145782_y() == -6969) {
            cir.setReturnValue(true);
        }
    }
}
