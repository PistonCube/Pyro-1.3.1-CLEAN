// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import dev.nuker.pyro.f3o;
import dev.nuker.pyro.fQ;
import org.lwjgl.opengl.Display;
import net.minecraft.util.math.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.RayTraceResult$Type;
import com.google.common.base.Predicates;
import net.minecraft.util.EntitySelectors;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup;
import net.minecraft.world.World;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import dev.nuker.pyro.f3n;
import dev.nuker.pyro.Pyro;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.injection.Redirect;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.resources.IResourceManager;
import dev.nuker.pyro.PyroLightmap;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public abstract class EntityRendererMixin
{
    @Shadow
    @Final
    private Minecraft field_78531_r;
    @Shadow
    private float field_78491_C;
    @Shadow
    private boolean field_78500_U;
    @Shadow
    private Entity field_78528_u;
    @Shadow
    private boolean field_78536_aa;
    @Shadow
    private float field_175080_Q;
    @Shadow
    private float field_175082_R;
    @Shadow
    private float field_175081_S;
    private PyroLightmap pyroLightmap;
    
    @Shadow
    private void func_78475_f(final float partialTicks) {
    }
    
    @Inject(method = { "<init>" }, at = { @At("RETURN") })
    private void init(final Minecraft mcIn, final IResourceManager resourceManagerIn, final CallbackInfo ci) {
        this.pyroLightmap = new PyroLightmap(mcIn);
        PyroLightmap.Companion.setINSTANCE(this.pyroLightmap);
    }
    
    @Redirect(method = { "setupCameraTransform", "renderHand" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;applyBobbing(F)V"))
    private void cancelKnockBob(final EntityRenderer entityRenderer, final float partialTicks) {
        if (!Minecraft.func_71410_x().field_71439_g.func_184613_cA() || !(boolean)f4N.c.c.0() || !Minecraft.func_71410_x().field_71439_g.field_71158_b.field_78901_c) {
            this.func_78475_f(partialTicks);
        }
    }
    
    @Redirect(method = { "renderWorldPass" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;setupTerrain(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V"))
    private void spectateFreecamTerrain(final RenderGlobal renderGlobal, final Entity viewEntity, final double partialTicks, final ICamera camera, final int frameCount, final boolean playerSpectator) {
        renderGlobal.func_174970_a(viewEntity, partialTicks, camera, frameCount, playerSpectator || (boolean)f4N.c.c.0() || f4N.c.0() != 255);
    }
    
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;renderEntities(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;F)V", shift = At.Shift.AFTER) })
    private void renderWorldPass(final int pass, final float partialTicks, final long finishTimeNano, final CallbackInfo callbackInfo) {
        Pyro.getEventManager().c(new f3n(partialTicks));
    }
    
    @Inject(method = { "updateLightmap" }, at = { @At("HEAD") })
    private void onLightmapUpdate(final float partialTicks, final CallbackInfo ci) {
        if (this.field_78536_aa) {
            f4N.c.9();
            if (f4N.c.8()) {
                this.pyroLightmap.updateLightmap(partialTicks);
            }
        }
    }
    
    @Inject(method = { "setupFog" }, at = { @At("HEAD") }, cancellable = true)
    private void increaseClipArea(final int startCoords, final float partialTicks, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.2().3()) {
            ci.cancel();
            GlStateManager.func_179094_E();
            GlStateManager.func_179095_a(0.0f);
            GlStateManager.func_179121_F();
        }
    }
    
    @Inject(method = { "hurtCameraEffect" }, at = { @At("HEAD") }, cancellable = true)
    private void cancelHurtcam(final float partialTicks, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.4().3()) {
            ci.cancel();
        }
    }
    
    @Redirect(method = { "setupFog" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/state/IBlockState;getMaterial()Lnet/minecraft/block/material/Material;"))
    private Material cancelLiquidFog(final IBlockState iBlockState) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.b().3()) {
            return Material.field_151579_a;
        }
        return iBlockState.func_185904_a();
    }
    
    @Inject(method = { "orientCamera" }, at = { @At("HEAD") }, cancellable = true)
    private void orientCamera(final float partialTicks, final CallbackInfo ci) {
        if (!(boolean)f4N.c.c.0()) {
            return;
        }
        ci.cancel();
        final Entity entity = this.field_78531_r.func_175606_aa();
        float f = entity.func_70047_e();
        double d0 = entity.field_70169_q + (entity.field_70165_t - entity.field_70169_q) * partialTicks;
        double d2 = entity.field_70167_r + (entity.field_70163_u - entity.field_70167_r) * partialTicks + f;
        double d3 = entity.field_70166_s + (entity.field_70161_v - entity.field_70166_s) * partialTicks;
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).func_70608_bn()) {
            ++f;
            GlStateManager.func_179109_b(0.0f, 0.3f, 0.0f);
            if (!this.field_78531_r.field_71474_y.field_74325_U) {
                final BlockPos blockpos = new BlockPos(entity);
                final IBlockState iblockstate = this.field_78531_r.field_71441_e.func_180495_p(blockpos);
                ForgeHooksClient.orientBedCamera((IBlockAccess)this.field_78531_r.field_71441_e, blockpos, iblockstate, entity);
                GlStateManager.func_179114_b(entity.field_70126_B + (entity.field_70177_z - entity.field_70126_B) * partialTicks + 180.0f, 0.0f, -1.0f, 0.0f);
                GlStateManager.func_179114_b(entity.field_70127_C + (entity.field_70125_A - entity.field_70127_C) * partialTicks, -1.0f, 0.0f, 0.0f);
            }
        }
        else if (this.field_78531_r.field_71474_y.field_74320_O > 0) {
            final double d4 = (double)f4N.c.c.3();
            if (this.field_78531_r.field_71474_y.field_74325_U) {
                GlStateManager.func_179109_b(0.0f, 0.0f, (float)(-d4));
            }
            else {
                final float f2 = entity.field_70177_z;
                float f3 = entity.field_70125_A;
                if (this.field_78531_r.field_71474_y.field_74320_O == 2) {
                    f3 += 180.0f;
                }
                final double d5 = -MathHelper.func_76126_a(f2 * 0.017453292f) * MathHelper.func_76134_b(f3 * 0.017453292f) * d4;
                final double d6 = MathHelper.func_76134_b(f2 * 0.017453292f) * MathHelper.func_76134_b(f3 * 0.017453292f) * d4;
                final double d7 = -MathHelper.func_76126_a(f3 * 0.017453292f) * d4;
                for (int i = 0; i < 8; ++i) {
                    float f4 = (float)((i & 0x1) * 2 - 1);
                    float f5 = (float)((i >> 1 & 0x1) * 2 - 1);
                    float f6 = (float)((i >> 2 & 0x1) * 2 - 1);
                    f4 *= 0.1f;
                    f5 *= 0.1f;
                    f6 *= 0.1f;
                }
                if (this.field_78531_r.field_71474_y.field_74320_O == 2) {
                    GlStateManager.func_179114_b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.func_179114_b(entity.field_70125_A - f3, 1.0f, 0.0f, 0.0f);
                GlStateManager.func_179114_b(entity.field_70177_z - f2, 0.0f, 1.0f, 0.0f);
                GlStateManager.func_179109_b(0.0f, 0.0f, (float)(-d4));
                GlStateManager.func_179114_b(f2 - entity.field_70177_z, 0.0f, 1.0f, 0.0f);
                GlStateManager.func_179114_b(f3 - entity.field_70125_A, 1.0f, 0.0f, 0.0f);
            }
        }
        else {
            GlStateManager.func_179109_b(0.0f, 0.0f, 0.05f);
        }
        if (!this.field_78531_r.field_71474_y.field_74325_U) {
            float yaw = entity.field_70126_B + (entity.field_70177_z - entity.field_70126_B) * partialTicks + 180.0f;
            final float pitch = entity.field_70127_C + (entity.field_70125_A - entity.field_70127_C) * partialTicks;
            final float roll = 0.0f;
            if (entity instanceof EntityAnimal) {
                final EntityAnimal entityanimal = (EntityAnimal)entity;
                yaw = entityanimal.field_70758_at + (entityanimal.field_70759_as - entityanimal.field_70758_at) * partialTicks + 180.0f;
            }
            final IBlockState state = ActiveRenderInfo.func_186703_a((World)this.field_78531_r.field_71441_e, entity, partialTicks);
            final EntityViewRenderEvent$CameraSetup event = new EntityViewRenderEvent$CameraSetup((EntityRenderer)this, entity, state, (double)partialTicks, yaw, pitch, roll);
            MinecraftForge.EVENT_BUS.post((Event)event);
            GlStateManager.func_179114_b(event.getRoll(), 0.0f, 0.0f, 1.0f);
            GlStateManager.func_179114_b(event.getPitch(), 1.0f, 0.0f, 0.0f);
            GlStateManager.func_179114_b(event.getYaw(), 0.0f, 1.0f, 0.0f);
        }
        GlStateManager.func_179109_b(0.0f, -f, 0.0f);
        d0 = entity.field_70169_q + (entity.field_70165_t - entity.field_70169_q) * partialTicks;
        d2 = entity.field_70167_r + (entity.field_70163_u - entity.field_70167_r) * partialTicks + f;
        d3 = entity.field_70166_s + (entity.field_70161_v - entity.field_70166_s) * partialTicks;
        this.field_78500_U = this.field_78531_r.field_71438_f.func_72721_a(d0, d2, d3, partialTicks);
    }
    
    @Inject(method = { "getMouseOver" }, at = { @At("HEAD") }, cancellable = true)
    public void getMouseOver(final float partialTicks, final CallbackInfo info) {
        final boolean reach = (boolean)f4N.c.c.0();
        final boolean miningTrace = (boolean)f4N.c.c.0();
        if (!miningTrace && !reach) {
            return;
        }
        boolean hasPickaxe = false;
        if (miningTrace) {
            hasPickaxe = (this.field_78531_r.field_71439_g != null && this.field_78531_r.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemPickaxe);
        }
        if (miningTrace && !reach && (boolean)f4N.c.c().3() && !hasPickaxe) {
            return;
        }
        info.cancel();
        final Entity entity = this.field_78531_r.func_175606_aa();
        if (entity != null && this.field_78531_r.field_71441_e != null) {
            this.field_78531_r.field_71424_I.func_76320_a("pick");
            this.field_78531_r.field_147125_j = null;
            double d0 = this.field_78531_r.field_71442_b.func_78757_d();
            if (reach) {
                d0 += (double)f4N.c.c().3();
            }
            this.field_78531_r.field_71476_x = entity.func_174822_a(d0, partialTicks);
            final Vec3d vec3d = entity.func_174824_e(partialTicks);
            boolean flag = false;
            final int i = 3;
            double d2 = d0;
            if (this.field_78531_r.field_71442_b.func_78749_i()) {
                d2 = (d0 = 6.0);
            }
            else if (d0 > 3.0) {
                flag = true;
            }
            if (this.field_78531_r.field_71476_x != null) {
                d2 = this.field_78531_r.field_71476_x.field_72307_f.func_72438_d(vec3d);
            }
            final Vec3d vec3d2 = entity.func_70676_i(1.0f);
            final Vec3d vec3d3 = vec3d.func_72441_c(vec3d2.field_72450_a * d0, vec3d2.field_72448_b * d0, vec3d2.field_72449_c * d0);
            this.field_78528_u = null;
            Vec3d vec3d4 = null;
            double d3 = d2;
            if (!hasPickaxe) {
                final List<Entity> list = (List<Entity>)this.field_78531_r.field_71441_e.func_175674_a(entity, entity.func_174813_aQ().func_72321_a(vec3d2.field_72450_a * d0, vec3d2.field_72448_b * d0, vec3d2.field_72449_c * d0).func_72314_b(1.0, 1.0, 1.0), Predicates.and(EntitySelectors.field_180132_d, Predicates.and(EntitySelectors.field_180132_d, Entity::func_70067_L)));
                for (int j = 0; j < list.size(); ++j) {
                    final Entity entity2 = list.get(j);
                    final AxisAlignedBB axisalignedbb = entity2.func_174813_aQ().func_186662_g((double)entity2.func_70111_Y());
                    final RayTraceResult raytraceresult = axisalignedbb.func_72327_a(vec3d, vec3d3);
                    if (axisalignedbb.func_72318_a(vec3d)) {
                        if (d3 >= 0.0) {
                            this.field_78528_u = entity2;
                            vec3d4 = ((raytraceresult == null) ? vec3d : raytraceresult.field_72307_f);
                            d3 = 0.0;
                        }
                    }
                    else if (raytraceresult != null) {
                        final double d4 = vec3d.func_72438_d(raytraceresult.field_72307_f);
                        if (d4 < d3 || d3 == 0.0) {
                            if (entity2.func_184208_bv() == entity.func_184208_bv() && !entity2.canRiderInteract()) {
                                if (d3 == 0.0) {
                                    this.field_78528_u = entity2;
                                    vec3d4 = raytraceresult.field_72307_f;
                                }
                            }
                            else {
                                this.field_78528_u = entity2;
                                vec3d4 = raytraceresult.field_72307_f;
                                d3 = d4;
                            }
                        }
                    }
                }
            }
            double dist = 3.0;
            if (reach) {
                dist += (double)f4N.c.c().3();
            }
            if (this.field_78528_u != null && flag && vec3d.func_72438_d(vec3d4) > dist) {
                this.field_78528_u = null;
                this.field_78531_r.field_71476_x = new RayTraceResult(RayTraceResult$Type.MISS, vec3d4, (EnumFacing)null, new BlockPos(vec3d4));
            }
            if (this.field_78528_u != null && (d3 < d2 || this.field_78531_r.field_71476_x == null)) {
                this.field_78531_r.field_71476_x = new RayTraceResult(this.field_78528_u, vec3d4);
                if (this.field_78528_u instanceof EntityLivingBase || this.field_78528_u instanceof EntityItemFrame) {
                    this.field_78531_r.field_147125_j = this.field_78528_u;
                }
            }
            this.field_78531_r.field_71424_I.func_76319_b();
        }
    }
    
    @Inject(method = { "updateFogColor" }, at = { @At("HEAD") }, cancellable = true)
    public void updateFogColor(final float partialTicks, final CallbackInfo callback) {
        if (f4N.c.c.0()) {
            callback.cancel();
            final float[] v = f4N.c.2();
            this.field_175080_Q = v[0];
            this.field_175082_R = v[1];
            this.field_175081_S = v[2];
            GlStateManager.func_179082_a(this.field_175080_Q, this.field_175082_R, this.field_175081_S, v[3]);
        }
    }
    
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/renderer/GlStateManager.clear(I)V", ordinal = 1, shift = At.Shift.AFTER) })
    private void renderHand(final int pass, final float partialTicks, final long finishTimeNano, final CallbackInfo callbackInfo) {
        if (Display.isActive() || Display.isVisible()) {
            fQ.c.c(partialTicks);
        }
    }
    
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;renderHand:Z", shift = At.Shift.BEFORE) })
    private void renderHandPre(final int pass, final float partialTicks, final long finishTimeNano, final CallbackInfo callbackInfo) {
        if (Display.isActive() || Display.isVisible()) {
            Pyro.getEventManager().c(new f3o(partialTicks));
        }
    }
    
    @Inject(method = { "getFOVModifier" }, at = { @At("HEAD") }, cancellable = true)
    private void getFOVModifier(final float partialTicks, final boolean useFOVSetting, final CallbackInfoReturnable callback) {
        if ((boolean)f4N.c.c.0() && useFOVSetting) {
            callback.setReturnValue((float)f4N.c.c().3());
        }
    }
}
