// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f0A;
import java.awt.Color;
import net.minecraft.util.text.TextFormatting;
import dev.nuker.pyro.f3u;
import dev.nuker.pyro.Config;
import net.minecraft.entity.player.EntityPlayer;
import dev.nuker.pyro.fl;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.Pyro;
import java.util.Iterator;
import net.minecraft.client.gui.GuiButton;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.alt.AltLogic;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.ResourceLocation;
import dev.nuker.pyro.fp;
import dev.nuker.pyro.fq;
import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.GuiScreen;

@Mixin({ GuiMainMenu.class })
public abstract class GuiMainMenuMixin extends GuiScreen
{
    private boolean valid;
    private boolean checkedValid;
    private fq rt;
    private fp pl;
    private int lowestButtonY;
    private static final ResourceLocation WATERMARK;
    
    public GuiMainMenuMixin() {
        this.lowestButtonY = 0;
    }
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    private void onInit(final CallbackInfo ci) {
        this.valid = false;
        this.checkedValid = false;
        new Thread(() -> {
            this.valid = (!AltLogic.isOffline() && AltLogic.sessionValid());
            this.checkedValid = true;
            return;
        }).start();
        this.rt = new fq();
    }
    
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    private void e(final CallbackInfo ci) {
        this.lowestButtonY = 0;
        for (final GuiButton guiButton : this.field_146292_n) {
            if (guiButton.field_146129_i > this.lowestButtonY) {
                this.lowestButtonY = guiButton.field_146129_i;
            }
        }
        this.field_146292_n.add(new GuiButton(-1337, this.field_146294_l / 2 + 104, this.lowestButtonY, 98, 20, "Alt Manager"));
        this.pl = this.rt.0(this.field_146297_k.func_110432_I().func_148256_e());
    }
    
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    private void drawPyroWatermark(final int mouseX, final int mouseY, final float partialTicks, final CallbackInfo ci) {
        Pyro.drawWMMain();
    }
    
    @Inject(method = { "actionPerformed" }, at = { @At("HEAD") }, cancellable = true)
    private void catchActions(final GuiButton button, final CallbackInfo ci) {
        if (button.field_146127_k == -1337) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new fl((GuiScreen)new GuiMainMenu()));
            ci.cancel();
        }
    }
    
    @Inject(method = { "drawScreen" }, at = { @At("RETURN") })
    private void onRender(final int mouseX, final int mouseY, final float partialTicks, final CallbackInfo ci) {
        final int y = this.lowestButtonY - 4;
        final int x = this.field_146294_l / 2 + 104 + 47;
        final int height = 47;
        this.rt.c(x, y, height, (EntityPlayer)this.pl.c);
        this.renderStats(x, y - 92);
        if (!Config.INSTANCE.seenInitialScreen) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new f3u(this));
        }
    }
    
    private void renderStats(final int x, final int y) {
        final String line1 = this.field_146297_k.func_110432_I().func_111285_a();
        final String line2 = AltLogic.isOffline() ? (TextFormatting.RED + "Cracked") : (this.checkedValid ? (this.valid ? (TextFormatting.GREEN + "Premium") : (TextFormatting.YELLOW + "Invalid Session")) : (TextFormatting.GRAY + "Unknown Status"));
        final int width1 = this.field_146289_q.func_78256_a(line1);
        final int width2 = this.field_146289_q.func_78256_a(line2);
        final int width3 = Math.max(width1, width2) + 2;
        GuiScreen.func_73734_a(x - width3 / 2, y - this.field_146289_q.field_78288_b * 2 - 2, x + width3 / 2, y, new Color(0, 0, 0, 70).getRGB());
        f0A.c.0(this.field_146289_q, line1, x - width1 / 2, y - this.field_146289_q.field_78288_b * 2 - 1, -1);
        f0A.c.0(this.field_146289_q, line2, x - width2 / 2, y - this.field_146289_q.field_78288_b, -1);
    }
    
    static {
        WATERMARK = new ResourceLocation("pyro:assets/textures/logosmall.png");
    }
}
