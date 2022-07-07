// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import dev.nuker.pyro.f4N;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ TileEntitySignRenderer.class })
public class TileEntitySignRendererMixin
{
    @Redirect(method = { "render" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/text/ITextComponent;getFormattedText()Ljava/lang/String;"))
    private String getSignText(final ITextComponent iTextComponent) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.9().3()) {
            return "";
        }
        return iTextComponent.func_150254_d();
    }
}
