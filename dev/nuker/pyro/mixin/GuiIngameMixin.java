// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.renderer.GlStateManager;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiIngame.class })
public class GuiIngameMixin
{
    @Inject(method = { "renderVignette" }, at = { @At("HEAD") }, cancellable = true)
    private void dontRenderVignette(final float lightLevel, final ScaledResolution scaledRes, final CallbackInfo ci) {
        if (f4N.c.c.0()) {
            f4N.c.c(scaledRes);
            ci.cancel();
        }
        else if ((boolean)f4N.c.c.0() && (boolean)f4N.c.1().3()) {
            GlStateManager.func_179132_a(true);
            GlStateManager.func_179126_j();
            ci.cancel();
        }
    }
    
    @Inject(method = { "renderPotionEffects" }, at = { @At("HEAD") }, cancellable = true)
    private void renderPotionEffects(final ScaledResolution res, final CallbackInfo info) {
        info.cancel();
    }
}
