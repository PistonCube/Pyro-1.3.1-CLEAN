// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.fS;
import net.minecraft.entity.Entity;
import dev.nuker.pyro.fl;
import net.minecraft.client.gui.GuiMainMenu;
import dev.nuker.pyro.f9p;
import net.minecraft.client.renderer.GlStateManager$DestFactor;
import net.minecraft.client.renderer.GlStateManager$SourceFactor;
import net.minecraft.client.renderer.GlStateManager;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderLivingBase.class })
public class RenderLivingBaseMixin
{
    @Shadow
    protected ModelBase field_77045_g;
    
    @Inject(method = { "isVisible" }, at = { @At("HEAD") }, cancellable = true)
    private void isFreecam(final EntityLivingBase entity, final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.0 && entity == Minecraft.func_71410_x().field_71439_g) {
            cir.setReturnValue(f4N.c.c.0().3() == f9x.0);
        }
    }
    
    @Inject(method = { "renderModel" }, at = { @At("HEAD") })
    private void addFreecamBlend(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.0 && entitylivingbaseIn == Minecraft.func_71410_x().field_71439_g) {
            GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 0.25f);
            GlStateManager.func_179132_a(false);
            GlStateManager.func_179147_l();
            GlStateManager.func_187401_a(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA);
            GlStateManager.func_179092_a(516, 0.003921569f);
        }
    }
    
    @Inject(method = { "renderModel" }, at = { @At("RETURN") })
    private void clearFreecamBlend(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.0 && entitylivingbaseIn == Minecraft.func_71410_x().field_71439_g) {
            GlStateManager.func_179084_k();
            GlStateManager.func_179092_a(516, 0.1f);
            GlStateManager.func_179132_a(true);
        }
    }
    
    @Inject(method = { "renderModel" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBase;render(Lnet/minecraft/entity/Entity;FFFFFF)V") })
    private void renderModelWrapper(final EntityLivingBase entitylivingbaseIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.g().3() == f9p.c && !(Minecraft.func_71410_x().field_71462_r instanceof GuiMainMenu) && !(Minecraft.func_71410_x().field_71462_r instanceof fl)) {
            f4N.c.c(() -> this.field_77045_g.func_78088_a((Entity)entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor), (Entity)entitylivingbaseIn);
        }
    }
    
    @Inject(method = { "getColorMultiplier" }, at = { @At("HEAD") }, cancellable = true)
    private void getAdditionalColorMultiplier(final EntityLivingBase entitylivingbaseIn, final float lightBrightness, final float partialTickTime, final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.n.3() && entitylivingbaseIn == f4N.c.c) {
            cir.setReturnValue(((fS)f4N.c.0.3()).5());
        }
    }
}
