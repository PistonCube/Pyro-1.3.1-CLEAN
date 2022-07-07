// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f3q;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiScreen.class })
public class GuiScreenMixin
{
    @Inject(method = { "renderToolTip" }, at = { @At("HEAD") }, cancellable = true)
    private void renderToolTip(final ItemStack stack, final int x, final int y, final CallbackInfo info) {
        final f3q event = new f3q(stack, x, y);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
    }
}
