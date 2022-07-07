// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f9x;
import dev.nuker.pyro.fl;
import net.minecraft.client.gui.GuiMainMenu;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.Pyro;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderPlayer.class })
public class RenderPlayerMixin
{
    private float renderPitch;
    private float renderYaw;
    private float renderHeadYaw;
    private float prevRenderHeadYaw;
    private float lastRenderHeadYaw;
    private float prevRenderPitch;
    private float lastRenderPitch;
    private float prevRenderYawOffset;
    private float prevPrevRenderYawOffset;
    
    public RenderPlayerMixin() {
        this.lastRenderHeadYaw = 0.0f;
        this.lastRenderPitch = 0.0f;
    }
    
    @Inject(method = { "doRender" }, at = { @At("HEAD") })
    private void rotateBegin(final AbstractClientPlayer entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo ci) {
        if (entity == Minecraft.func_71410_x().field_71439_g) {
            this.prevRenderHeadYaw = entity.field_70758_at;
            this.prevRenderPitch = entity.field_70127_C;
            this.renderPitch = entity.field_70125_A;
            this.renderYaw = entity.field_70177_z;
            this.renderHeadYaw = entity.field_70759_as;
            this.prevPrevRenderYawOffset = entity.field_70760_ar;
            this.prevRenderYawOffset = entity.field_70761_aq;
            if (Pyro.getRotationManager().3() != -1337.0f) {
                entity.field_70125_A = Pyro.getRotationManager().3();
                entity.field_70127_C = this.lastRenderPitch;
            }
            if (Pyro.getRotationManager().2() != -1337.0f) {
                entity.field_70177_z = Pyro.getRotationManager().2();
                entity.field_70759_as = Pyro.getRotationManager().2();
                entity.field_70758_at = Pyro.getRotationManager().2();
                entity.field_70760_ar = Pyro.getRotationManager().2();
                entity.field_70761_aq = Pyro.getRotationManager().2();
            }
        }
    }
    
    @Inject(method = { "doRender" }, at = { @At("RETURN") })
    private void rotateEnd(final AbstractClientPlayer entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo ci) {
        if (entity == Minecraft.func_71410_x().field_71439_g) {
            this.lastRenderHeadYaw = entity.field_70759_as;
            this.lastRenderPitch = entity.field_70125_A;
            entity.field_70125_A = this.renderPitch;
            entity.field_70177_z = this.renderYaw;
            entity.field_70759_as = this.renderHeadYaw;
            entity.field_70758_at = this.prevRenderHeadYaw;
            entity.field_70127_C = this.prevRenderPitch;
            entity.field_70758_at = this.prevRenderHeadYaw;
            entity.field_70761_aq = this.prevRenderYawOffset;
            entity.field_70760_ar = this.prevPrevRenderYawOffset;
        }
    }
    
    @Inject(method = { "renderEntityName" }, at = { @At("HEAD") }, cancellable = true)
    private void renderLivingLabel(final AbstractClientPlayer entityIn, final double x, final double y, final double z, final String name, final double distanceSq, final CallbackInfo info) {
        if (f4N.c.c.0()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "renderEntityName" }, at = { @At("HEAD") }, cancellable = true)
    private void dontRenderNameOnMenu(final AbstractClientPlayer entityIn, final double x, final double y, final double z, final String name, final double distanceSq, final CallbackInfo ci) {
        if (Minecraft.func_71410_x().field_71462_r instanceof GuiMainMenu || Minecraft.func_71410_x().field_71462_r instanceof fl) {
            ci.cancel();
        }
    }
    
    @Inject(method = { "doRender" }, at = { @At("HEAD") }, cancellable = true)
    private void cancelFreecamRender(final AbstractClientPlayer entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c && entity.func_145782_y() == -6969) {
            ci.cancel();
        }
    }
}
