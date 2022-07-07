// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f3b;
import dev.nuker.pyro.f3c;
import net.minecraft.entity.Entity;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import dev.nuker.pyro.f3a;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Redirect;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.MoverType;
import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f3g;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.IAttribute;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityLivingBase.class })
public abstract class EntityLivingBaseMixin extends EntityMixin
{
    @Shadow
    public int field_70725_aQ;
    @Shadow
    public float field_70761_aq;
    @Shadow
    public float field_70760_ar;
    @Shadow
    public float field_70759_as;
    @Shadow
    public float field_70758_at;
    @Shadow
    public float field_70747_aH;
    @Shadow
    public float field_184618_aE;
    @Shadow
    public float field_70721_aZ;
    @Shadow
    public float field_184619_aG;
    private boolean changeMovResult;
    private float lastPitch;
    private float lastYaw;
    
    public EntityLivingBaseMixin() {
        this.changeMovResult = false;
        this.lastPitch = 0.0f;
        this.lastYaw = 0.0f;
    }
    
    @Shadow
    public void func_191986_a(final float strafe, final float vertical, final float forward) {
    }
    
    @Shadow
    public abstract float func_70689_ay();
    
    @Shadow
    public abstract IAttributeInstance func_110148_a(final IAttribute p0);
    
    @Inject(method = { "travel" }, at = { @At("HEAD") }, cancellable = true)
    private void onTravel(final float strafe, final float vertical, final float forward, final CallbackInfo ci) {
        if (this == Minecraft.func_71410_x().field_71439_g) {
            final f3g travelEvent = new f3g();
            Pyro.getEventManager().c(travelEvent);
            if (travelEvent.0()) {
                Minecraft.func_71410_x().field_71439_g.func_70091_d(MoverType.SELF, this.field_70159_w, this.field_70181_x, this.field_70179_y);
                ci.cancel();
            }
            final EntityPlayer player = (EntityPlayer)this;
            this.lastPitch = player.field_70125_A;
            this.lastYaw = player.field_70177_z;
            if (Pyro.getRotationManager().1() != -1337.0f) {
                player.field_70125_A = Pyro.getRotationManager().1();
            }
            if (Pyro.getRotationManager().0() != -1337.0f) {
                player.field_70177_z = Pyro.getRotationManager().0();
            }
        }
    }
    
    @Inject(method = { "travel" }, at = { @At("RETURN") })
    private void revertRotations(final float strafe, final float vertical, final float forward, final CallbackInfo ci) {
        if (this == Minecraft.func_71410_x().field_71439_g) {
            final EntityPlayer player = (EntityPlayer)this;
            if (Pyro.getRotationManager().1() != -1337.0f) {
                player.field_70125_A = this.lastPitch;
            }
            if (Pyro.getRotationManager().0() != -1337.0f) {
                player.field_70177_z = this.lastYaw;
            }
        }
    }
    
    @Inject(method = { "travel" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;isElytraFlying()Z") })
    private void moveCallback(final float strafe, final float vertical, final float forward, final CallbackInfo ci) {
        if (this == Minecraft.func_71410_x().field_71439_g && ((Minecraft.func_71410_x().field_71439_g.func_184613_cA() && (boolean)f4N.c.c.0() && !f4N.c.c) || ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c))) {
            this.changeMovResult = true;
        }
    }
    
    @Redirect(method = { "travel" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;cos(F)F", ordinal = 0))
    private float newCos(float value) {
        return (float)Math.cos((this == Minecraft.func_71410_x().field_71439_g && Pyro.getRotationManager().1() != -1337.0f) ? ((double)(Pyro.getRotationManager().1() * 0.017453292f)) : ((double)value));
    }
    
    @Inject(method = { "isElytraFlying" }, at = { @At("HEAD") }, cancellable = true)
    private void modifyCheckFlight(final CallbackInfoReturnable cir) {
        if (this.changeMovResult) {
            this.changeMovResult = false;
            cir.setReturnValue(false);
            return;
        }
        if (this == Minecraft.func_71410_x().field_71439_g) {
            final f3a event = new f3a(this.func_70083_f(7));
            Pyro.getEventManager().c(event);
            cir.setReturnValue(event.c());
        }
    }
    
    @Inject(method = { "isPotionActive" }, at = { @At("HEAD") }, cancellable = true)
    private void isPotionActive(final Potion potionIn, final CallbackInfoReturnable cir) {
        if (potionIn == MobEffects.field_76440_q && (boolean)f4N.c.c.0() && (boolean)f4N.c.c().3()) {
            cir.setReturnValue(false);
        }
    }
    
    @Inject(method = { "onDeathUpdate" }, at = { @At("HEAD") })
    private void setDead(final CallbackInfo info) {
        if (this.field_70725_aQ == 19 && !this.field_70128_L && ((Entity)this) instanceof EntityPlayer) {
            Pyro.getEventManager().c(new f3c((Entity)this));
        }
    }
    
    @Inject(method = { "onItemUseFinish" }, at = { @At("HEAD") }, cancellable = true)
    public void onItemUseFinish(final CallbackInfo info) {
        final f3b event = new f3b();
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
    }
}
