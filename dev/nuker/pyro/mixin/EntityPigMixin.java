// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.passive.EntityPig;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPig.class })
public abstract class EntityPigMixin extends EntityAnimalMixin
{
    @Shadow
    private boolean field_184765_bx;
    @Shadow
    private int field_184766_bz;
    @Shadow
    private int field_184767_bA;
    
    @Inject(method = { "canBeSteered" }, at = { @At("HEAD") }, cancellable = true)
    public void overCanBeSteered(final CallbackInfoReturnable callback) {
        if (f4N.c.c.0()) {
            callback.setReturnValue(true);
        }
    }
    
    @Inject(method = { "travel" }, at = { @At("HEAD") }, cancellable = true)
    private void travel(final float strafe, final float vertical, final float forward, final CallbackInfo info) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.c().3()) {
            info.cancel();
            final Entity entity = this.func_184188_bt().isEmpty() ? null : this.func_184188_bt().get(0);
            if (this.func_184207_aI() && this.func_82171_bF()) {
                this.field_70177_z = entity.field_70177_z;
                this.field_70126_B = this.field_70177_z;
                this.field_70125_A = entity.field_70125_A * 0.5f;
                this.func_70101_b(this.field_70177_z, this.field_70125_A);
                this.field_70761_aq = this.field_70177_z;
                this.field_70759_as = this.field_70177_z;
                this.field_70138_W = 1.0f;
                this.field_70747_aH = this.func_70689_ay() * 0.1f;
                if (this.field_184765_bx && this.field_184766_bz++ > this.field_184767_bA) {
                    this.field_184765_bx = false;
                }
                if (this.func_184186_bw()) {
                    float f = (float)this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e() * 0.225f;
                    if (this.field_184765_bx) {
                        f += f * 1.15f * MathHelper.func_76126_a(this.field_184766_bz / (float)this.field_184767_bA * 3.1415927f);
                    }
                    this.func_70659_e(f);
                }
                else {
                    this.field_70159_w = 0.0;
                    this.field_70181_x = 0.0;
                    this.field_70179_y = 0.0;
                }
                this.field_184618_aE = this.field_70721_aZ;
                final double d1 = this.field_70165_t - this.field_70169_q;
                final double d2 = this.field_70161_v - this.field_70166_s;
                float f2 = MathHelper.func_76133_a(d1 * d1 + d2 * d2) * 4.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                this.field_70721_aZ += (f2 - this.field_70721_aZ) * 0.4f;
                this.field_184619_aG += this.field_70721_aZ;
            }
            else {
                this.field_70138_W = 0.5f;
                this.field_70747_aH = 0.02f;
                super.func_191986_a(strafe, vertical, forward);
            }
        }
    }
}
