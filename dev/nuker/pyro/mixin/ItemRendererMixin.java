// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f9Q;
import net.minecraft.util.EnumHandSide;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Items;
import com.google.common.base.MoreObjects;
import dev.nuker.pyro.f9x;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.EnumHand;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ ItemRenderer.class })
public class ItemRendererMixin
{
    @Shadow
    @Final
    private Minecraft field_78455_a;
    @Shadow
    private float field_187469_f;
    @Shadow
    private float field_187470_g;
    @Shadow
    private float field_187471_h;
    @Shadow
    private float field_187472_i;
    @Shadow
    private ItemStack field_187467_d;
    @Shadow
    private ItemStack field_187468_e;
    
    @Shadow
    private void func_178101_a(final float angle, final float angleY) {
    }
    
    @Shadow
    private void func_187464_b() {
    }
    
    @Shadow
    private void func_187458_c(final float p_187458_1_) {
    }
    
    @Shadow
    public void func_187457_a(final AbstractClientPlayer player, final float p_187457_2_, final float p_187457_3_, final EnumHand hand, final float p_187457_5_, final ItemStack stack, final float p_187457_7_) {
    }
    
    @Inject(method = { "renderFireInFirstPerson" }, at = { @At("HEAD") }, cancellable = true)
    private void stopFireRender(final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.g().3()) {
            ci.cancel();
        }
    }
    
    @Inject(method = { "renderWaterOverlayTexture" }, at = { @At("HEAD") }, cancellable = true)
    private void stopWaterRender(final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.e().3()) {
            ci.cancel();
        }
    }
    
    @Inject(method = { "renderSuffocationOverlay" }, at = { @At("HEAD") }, cancellable = true)
    private void stopBlocksRender(final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.8().3()) {
            ci.cancel();
        }
    }
    
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At("HEAD") }, cancellable = true)
    private void cancelFreecamHandRender(final AbstractClientPlayer player, final float p_187457_2_, final float p_187457_3_, final EnumHand hand, final float p_187457_5_, final ItemStack stack, final float p_187457_7_, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c) {
            ci.cancel();
        }
    }
    
    @Inject(method = { "Lnet/minecraft/client/renderer/ItemRenderer;renderItemInFirstPerson(F)V" }, at = { @At("HEAD") }, cancellable = true)
    public void renderItemInFirstPerson(final float partialTicks, final CallbackInfo info) {
        if (!(boolean)f4N.c.c.0()) {
            return;
        }
        info.cancel();
        final AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)this.field_78455_a.field_71439_g;
        final float f = abstractclientplayer.func_70678_g(partialTicks);
        final EnumHand enumhand = (EnumHand)MoreObjects.firstNonNull((Object)abstractclientplayer.field_184622_au, (Object)EnumHand.MAIN_HAND);
        final float f2 = abstractclientplayer.field_70127_C + (abstractclientplayer.field_70125_A - abstractclientplayer.field_70127_C) * partialTicks;
        final float f3 = abstractclientplayer.field_70126_B + (abstractclientplayer.field_70177_z - abstractclientplayer.field_70126_B) * partialTicks;
        boolean flag = true;
        boolean flag2 = true;
        if (abstractclientplayer.func_184587_cr()) {
            final ItemStack itemstack = abstractclientplayer.func_184607_cu();
            if (!itemstack.func_190926_b() && itemstack.func_77973_b() == Items.field_151031_f) {
                final EnumHand enumhand2 = abstractclientplayer.func_184600_cs();
                flag = (enumhand2 == EnumHand.MAIN_HAND);
                flag2 = !flag;
            }
        }
        this.func_178101_a(f2, f3);
        this.func_187464_b();
        this.func_187458_c(partialTicks);
        GlStateManager.func_179091_B();
        if (flag) {
            final float f4 = (enumhand == EnumHand.MAIN_HAND) ? f : 0.0f;
            final float f5 = 1.0f - (this.field_187470_g + (this.field_187469_f - this.field_187470_g) * partialTicks);
            if (!ForgeHooksClient.renderSpecificFirstPersonHand(EnumHand.MAIN_HAND, partialTicks, f2, f4, f5, this.field_187467_d)) {
                this.func_187457_a(abstractclientplayer, partialTicks, f2, EnumHand.MAIN_HAND, f4, this.field_187467_d, f5);
            }
        }
        if (flag2) {
            final float f6 = (enumhand == EnumHand.OFF_HAND) ? f : 0.0f;
            final float f7 = (float)(double)f4N.c.c.3();
            if (!ForgeHooksClient.renderSpecificFirstPersonHand(EnumHand.OFF_HAND, partialTicks, f2, f6, f7, this.field_187468_e)) {
                this.func_187457_a(abstractclientplayer, partialTicks, f2, EnumHand.OFF_HAND, f6, this.field_187468_e, f7);
            }
        }
        GlStateManager.func_179101_C();
        RenderHelper.func_74518_a();
    }
    
    @Inject(method = { "transformFirstPerson" }, at = { @At("RETURN") })
    private void doItemModelTransforms(final EnumHandSide hand, final float p_187453_2_, final CallbackInfo ci) {
        final f9Q mod = f4N.c;
        if (mod.c.0()) {
            mod.c(hand);
        }
    }
}
