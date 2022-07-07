// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f3d;
import dev.nuker.pyro.fl;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.player.EnumPlayerModelParts;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPlayer.class })
public abstract class EntityPlayerMixin extends EntityLivingBaseMixin
{
    @Shadow
    public Container field_71070_bA;
    
    @Redirect(method = { "getEyeHeight" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/EntityPlayer;isSneaking()Z"))
    private boolean noImNot(final EntityPlayer player) {
        return false;
    }
    
    @Inject(method = { "isPushedByWater" }, at = { @At("HEAD") }, cancellable = true)
    public void pushOutOfBlocks(final CallbackInfoReturnable info) {
        if (Minecraft.func_71410_x().field_71439_g == (EntityPlayer)this && (boolean)f4N.c.c.0() && (boolean)f4N.c.1().3()) {
            info.setReturnValue(false);
        }
    }
    
    @Inject(method = { "applyEntityCollision" }, at = { @At("HEAD") }, cancellable = true)
    public void applyEntityCollision(final Entity e, final CallbackInfo info) {
        if (Minecraft.func_71410_x().field_71439_g == (EntityPlayer)this && (boolean)f4N.c.c.0() && (boolean)f4N.c.1().3()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "isWearing" }, at = { @At("HEAD") }, cancellable = true)
    private void alwaysWearingMenu(final EnumPlayerModelParts part, final CallbackInfoReturnable cir) {
        if (Minecraft.func_71410_x().field_71462_r instanceof GuiMainMenu || Minecraft.func_71410_x().field_71462_r instanceof fl) {
            cir.setReturnValue(true);
        }
    }
    
    @Inject(method = { "jump" }, at = { @At("HEAD") }, cancellable = true)
    private void jump(final CallbackInfo ci) {
        if (Minecraft.func_71410_x().field_71439_g == (EntityPlayer)this) {
            final f3d event = new f3d();
            Pyro.getEventManager().c(event);
            if (event.0()) {
                ci.cancel();
            }
        }
    }
}
