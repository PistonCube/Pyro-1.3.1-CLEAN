// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f2V;
import dev.nuker.pyro.f2T;
import dev.nuker.pyro.f2Y;
import org.lwjgl.input.Mouse;
import dev.nuker.pyro.f2X;
import org.lwjgl.input.Keyboard;
import dev.nuker.pyro.f38;
import dev.nuker.pyro.Pyro;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNo;
import dev.nuker.pyro.f4N;
import dev.nuker.pyro.f6g;
import net.minecraft.client.multiplayer.ServerData;
import dev.nuker.pyro.f02;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.main.GameConfiguration;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Minecraft.class })
public class MinecraftMixin
{
    @Shadow
    public EntityPlayerSP field_71439_g;
    
    @Shadow
    private void func_147116_af() {
    }
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    private void init(final GameConfiguration gameConfig, final CallbackInfo ci) {
    }
    
    @Inject(method = { "runGameLoop" }, at = { @At("HEAD") })
    private void runLoopDependants(final CallbackInfo ci) {
        f02.c.c();
    }
    
    @Inject(method = { "setServerData" }, at = { @At("HEAD") })
    public void setServerData(final ServerData serverDataIn, final CallbackInfo info) {
        if (serverDataIn != null) {
            f6g.c = serverDataIn;
        }
    }
    
    @Inject(method = { "rightClickMouse" }, at = { @At("HEAD") })
    private void rightClickMousePre(final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.0();
        }
    }
    
    @Inject(method = { "rightClickMouse" }, at = { @At("RETURN") })
    private void rightClickMousePost(final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.2();
        }
    }
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("HEAD") })
    private void sendClickBlockToControllerPre(final boolean leftClick, final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.c();
        }
    }
    
    @Inject(method = { "sendClickBlockToController" }, at = { @At("RETURN") })
    private void sendClickBlockToControllerPost(final boolean leftClick, final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.3();
            if (leftClick) {
                this.func_147116_af();
            }
        }
    }
    
    @Redirect(method = { "runGameLoop" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;shutdown()V"))
    private void mabeCancelShutdown(final Minecraft minecraft) {
        if (minecraft.field_71441_e != null && (boolean)f4N.c.c.0() && (boolean)f4N.c.0.3()) {
            final GuiScreen screen = minecraft.field_71462_r;
            final GuiYesNo g = new GuiYesNo((result, id) -> {
                if (result) {
                    minecraft.func_71400_g();
                }
                else {
                    Minecraft.func_71410_x().func_147108_a(screen);
                }
            }, "Do you really want to close minecraft?", "", 0);
            Minecraft.func_71410_x().func_147108_a((GuiScreen)g);
        }
        else {
            minecraft.func_71400_g();
        }
    }
    
    @Redirect(method = { "clickMouse" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;clickBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z"))
    public boolean clickBlock(final PlayerControllerMP controllerMP, final BlockPos pos, final EnumFacing facing) {
        Pyro.getEventManager().c(new f38(pos));
        return controllerMP.func_180511_b(pos, facing);
    }
    
    @Inject(method = { "runTickKeyboard" }, at = { @At(value = "INVOKE_ASSIGN", target = "org/lwjgl/input/Keyboard.getEventKeyState()Z", remap = false) })
    private void runTickKeyboard(final CallbackInfo callback) {
        Pyro.getEventManager().c(new f2X(Keyboard.getEventKeyState()));
    }
    
    @Inject(method = { "runTickMouse" }, at = { @At(value = "INVOKE_ASSIGN", target = "Lorg/lwjgl/input/Mouse;getEventButton()I", remap = false) })
    private void runTickMouse(final CallbackInfo callback) {
        Pyro.getEventManager().c(new f2Y(Mouse.getEventButtonState()));
    }
    
    @Inject(method = { "runTick" }, at = { @At("HEAD") })
    public void preRunTick(final CallbackInfo info) {
        Pyro.getEventManager().c(new f2V(f2T.c));
    }
    
    @Inject(method = { "runTick" }, at = { @At("RETURN") })
    public void postRunTick(final CallbackInfo info) {
        Pyro.getEventManager().c(new f2V(f2T.0));
    }
}
