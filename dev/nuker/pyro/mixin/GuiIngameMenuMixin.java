// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.realms.RealmsBridge;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiYesNo;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiIngameMenu.class })
public class GuiIngameMenuMixin
{
    @Inject(method = { "actionPerformed" }, at = { @At("HEAD") }, cancellable = true)
    private void onDisconnectPressed(final GuiButton button, final CallbackInfo ci) {
        if (button.field_146127_k == 1 && (boolean)f4N.c.c.0() && (boolean)f4N.c.c.3()) {
            final GuiYesNo g = new GuiYesNo((result, id) -> {
                if (result) {
                    final boolean flag = Minecraft.func_71410_x().func_71387_A();
                    final boolean flag2 = Minecraft.func_71410_x().func_181540_al();
                    button.field_146124_l = false;
                    Minecraft.func_71410_x().field_71441_e.func_72882_A();
                    Minecraft.func_71410_x().func_71403_a((WorldClient)null);
                    if (flag) {
                        Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiMainMenu());
                    }
                    else if (flag2) {
                        final RealmsBridge realmsbridge = new RealmsBridge();
                        realmsbridge.switchToRealms((GuiScreen)new GuiMainMenu());
                    }
                    else {
                        Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()));
                    }
                }
                else {
                    Minecraft.func_71410_x().func_147108_a((GuiScreen)this);
                }
            }, "Do you really want to disconnect?", "", 0);
            Minecraft.func_71410_x().func_147108_a((GuiScreen)g);
            ci.cancel();
        }
    }
}
