// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ TileEntitySpecialRenderer.class })
public class TESRMixin
{
    @Inject(method = { "isGlobalRenderer" }, at = { @At("HEAD") }, cancellable = true)
    private void espGlobalRender(final TileEntity te, final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.0(te) && (boolean)f4N.c.q().3()) {
            cir.setReturnValue(true);
        }
    }
}
