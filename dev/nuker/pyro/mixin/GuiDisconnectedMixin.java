// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.f6g;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import java.util.Date;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.client.gui.GuiButton;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.gui.GuiDisconnected;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.gui.GuiScreen;

@Mixin({ GuiDisconnected.class })
public class GuiDisconnectedMixin extends GuiScreen
{
    @Shadow
    private int field_175353_i;
    @Shadow
    @Final
    private GuiScreen field_146307_h;
    private long startTime;
    private GuiButton reconnectButton;
    
    public GuiDisconnectedMixin() {
        this.startTime = -5L;
    }
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    private void startTimer(final GuiScreen screen, final String reasonLocalizationKey, final ITextComponent chatComp, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.0().3()) {
            this.startTime = new Date().getTime() + (int)((double)f4N.c.c().3() * 1000.0);
        }
    }
    
    @Inject(method = { "initGui" }, at = { @At("RETURN") })
    private void addButtons(final CallbackInfo ci) {
        if (f4N.c.0().3()) {
            this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 100, Math.min(this.field_146295_m / 2 + this.field_175353_i / 2 + this.field_146289_q.field_78288_b, this.field_146295_m - 30) + 21, "Reconnect"));
            this.reconnectButton = new GuiButton(0, this.field_146294_l / 2 - 100, Math.min(this.field_146295_m / 2 + this.field_175353_i / 2 + this.field_146289_q.field_78288_b, this.field_146295_m - 30) + 42, "Auto Reconnect");
            this.field_146292_n.add(this.reconnectButton);
        }
    }
    
    @Inject(method = { "actionPerformed" }, at = { @At("INVOKE") }, cancellable = true)
    private void handleButtons(final GuiButton button, final CallbackInfo ci) {
        if (f4N.c.0().3()) {
            if (this.field_146292_n.indexOf(button) == 1 && f6g.c != null) {
                Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiConnecting(this.field_146307_h, Minecraft.func_71410_x(), f6g.c));
                ci.cancel();
            }
            else if (this.field_146292_n.indexOf(button) == 2) {
                f4N.c.c.c(!(boolean)f4N.c.c.0());
                if (f4N.c.c.0()) {
                    this.startTime = new Date().getTime() + (int)((double)f4N.c.c().3() * 1000.0);
                }
                else {
                    this.startTime = -5L;
                }
                ci.cancel();
            }
        }
    }
    
    public void func_73876_c() {
        super.func_73876_c();
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.0().3() && f6g.c != null && this.startTime != -5L) {
            final long timeDiff = this.startTime - new Date().getTime();
            this.reconnectButton.field_146126_j = "Auto Reconnect (" + timeDiff / 1000L + ")";
            if (timeDiff < 0L) {
                Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiConnecting(this.field_146307_h, Minecraft.func_71410_x(), f6g.c));
            }
        }
    }
}
