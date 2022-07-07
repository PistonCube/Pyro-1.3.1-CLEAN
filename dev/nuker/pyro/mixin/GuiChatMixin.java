// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.gui.GuiScreen;
import dev.nuker.pyro.Config;
import dev.nuker.pyro.f3x;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.GuiChat;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiChat.class })
public class GuiChatMixin
{
    @Shadow
    protected GuiTextField field_146415_a;
    @Shadow
    private String field_146410_g;
    @Shadow
    private int field_146416_h;
    
    @Inject(method = { "Lnet/minecraft/client/gui/GuiChat;keyTyped(CI)V" }, at = { @At("RETURN") })
    public void returnKeyTyped(final char typedChar, final int keyCode, final CallbackInfo info) {
        if (!(Minecraft.func_71410_x().field_71462_r instanceof GuiChat) || Minecraft.func_71410_x().field_71462_r instanceof f3x) {
            return;
        }
        if (this.field_146415_a.func_146179_b().startsWith(Config.INSTANCE.chatPrefix)) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new f3x(this.field_146415_a.func_146179_b(), this.field_146410_g, this.field_146416_h));
        }
    }
}
