// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.fA;
import dev.nuker.pyro.f3p;
import dev.nuker.pyro.Pyro;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.GuiSubtitleOverlay;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiSubtitleOverlay.class })
public abstract class GuiSubtitleOverlayMixin
{
    @Inject(method = { "renderSubtitles" }, at = { @At("HEAD") })
    private void renderSubtitles(final CallbackInfo callbackInfo) {
        Pyro.eventManager.c(new f3p());
        fA.c.2();
    }
}
