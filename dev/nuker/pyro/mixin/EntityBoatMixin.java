// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.fbk;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.Shadow;
import dev.nuker.pyro.f4N;
import net.minecraft.entity.item.EntityBoat;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityBoat.class })
public abstract class EntityBoatMixin extends EntityMixin
{
    private boolean boatflyEnabled() {
        return (boolean)f4N.c.c.0();
    }
    
    @Shadow
    public abstract double func_70042_X();
    
    @Inject(method = { "updateMotion" }, at = { @At("RETURN") })
    private void updateMotion(final CallbackInfo info) {
        if (fbk.c.field_71439_g != null && fbk.c.field_71439_g.func_184218_aH() && (EntityBoat)this == fbk.c.field_71439_g.func_184187_bx() && this.boatflyEnabled()) {
            f4N.c.4();
        }
    }
    
    @Inject(method = { "applyOrientationToEntity" }, at = { @At("HEAD") }, cancellable = true)
    private void applyOrientationToEntity(final Entity passenger, final CallbackInfo info) {
        if (fbk.c.field_71439_g != null && fbk.c.field_71439_g.func_184218_aH() && fbk.c.field_71439_g == passenger && this.boatflyEnabled()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "controlBoat" }, at = { @At("HEAD") }, cancellable = true)
    private void controlBoat(final CallbackInfo info) {
        if (fbk.c.field_71439_g != null && fbk.c.field_71439_g.func_184218_aH() && (EntityBoat)this == fbk.c.field_71439_g.func_184187_bx() && this.boatflyEnabled()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "updatePassenger" }, at = { @At("HEAD") }, cancellable = true)
    private void updatePassenger(final Entity passenger, final CallbackInfo info) {
        if (fbk.c.field_71439_g != null && fbk.c.field_71439_g.func_184218_aH() && fbk.c.field_71439_g == passenger && this.boatflyEnabled()) {
            info.cancel();
            final float f = 0.0f;
            final float f2 = (float)((this.field_70128_L ? 0.009999999776482582 : this.func_70042_X()) + passenger.func_70033_W());
            final Vec3d vec3d = new Vec3d((double)f, 0.0, 0.0).func_178785_b(-this.field_70177_z * 0.017453292f - 1.5707964f);
            passenger.func_70107_b(this.field_70165_t + vec3d.field_72450_a, this.field_70163_u + f2, this.field_70161_v + vec3d.field_72449_c);
        }
    }
}
