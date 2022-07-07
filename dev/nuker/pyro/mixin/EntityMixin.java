// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f3l;
import dev.nuker.pyro.f2T;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.f9p;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.math.MathHelper;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.List;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.MoverType;
import java.util.Random;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Entity.class })
public abstract class EntityMixin
{
    @Shadow
    public float field_70125_A;
    @Shadow
    public float field_70177_z;
    @Shadow
    public double field_70165_t;
    @Shadow
    public double field_70163_u;
    @Shadow
    public double field_70161_v;
    @Shadow
    public double field_70159_w;
    @Shadow
    public double field_70181_x;
    @Shadow
    public double field_70179_y;
    @Shadow
    public boolean field_70122_E;
    @Shadow
    public boolean field_70123_F;
    @Shadow
    public boolean field_70124_G;
    @Shadow
    public boolean field_70132_H;
    @Shadow
    protected boolean field_71087_bX;
    @Shadow
    protected Random field_70146_Z;
    @Shadow
    public boolean field_70128_L;
    @Shadow
    public float field_70138_W;
    @Shadow
    public float field_70126_B;
    @Shadow
    public float field_70127_C;
    @Shadow
    public double field_70142_S;
    @Shadow
    public double field_70137_T;
    @Shadow
    public double field_70136_U;
    @Shadow
    public double field_70169_q;
    @Shadow
    public double field_70167_r;
    @Shadow
    public double field_70166_s;
    private float prevStepHeight;
    
    public EntityMixin() {
        this.prevStepHeight = 0.0f;
    }
    
    @Shadow
    public void func_70091_d(final MoverType type, final double x, final double y, final double z) {
    }
    
    @Shadow
    public abstract boolean func_70051_ag();
    
    @Shadow
    public abstract boolean func_70093_af();
    
    @Shadow
    public abstract AxisAlignedBB func_174813_aQ();
    
    @Shadow
    public abstract boolean func_184218_aH();
    
    @Shadow
    public abstract Entity func_184187_bx();
    
    @Shadow
    protected abstract boolean func_70083_f(final int p0);
    
    @Shadow
    public abstract boolean func_184207_aI();
    
    @Shadow
    public abstract List func_184188_bt();
    
    @Shadow
    public void func_70101_b(final float yaw, final float pitch) {
    }
    
    @Inject(method = { "turn" }, at = { @At("HEAD") }, cancellable = true)
    private void turnFreecam(final float yaw, final float pitch, final CallbackInfo ci) {
        if (this == Minecraft.func_71410_x().field_71439_g && (boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c && f4N.c.c != null) {
            f4N.c.2 += (float)(yaw * 0.15);
            f4N.c.1 -= (float)(pitch * 0.15);
            f4N.c.2 = MathHelper.func_76142_g(f4N.c.2);
            f4N.c.1 = Math.min(90.0f, Math.max(f4N.c.1, -90.0f));
            f4N.c.c.field_70125_A = f4N.c.1;
            f4N.c.c.field_70177_z = f4N.c.2;
            f4N.c.c.field_70759_as = f4N.c.2;
            f4N.c.c.field_70127_C = f4N.c.1;
            f4N.c.c.field_70126_B = f4N.c.2;
            f4N.c.c.field_70758_at = f4N.c.2;
            ci.cancel();
        }
    }
    
    @Inject(method = { "isGlowing" }, at = { @At("HEAD") }, cancellable = true)
    private void enableEspGlow(final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.g().3() == f9p.0 && f4N.c.0((Entity)this) != null) {
            cir.setReturnValue(true);
        }
    }
    
    @Inject(method = { "move" }, at = { @At(value = "FIELD", target = "net/minecraft/entity/Entity.onGround:Z", ordinal = 1) })
    private void stepBegin(final MoverType type, final double x, final double y, final double z, final CallbackInfo info) {
        final Entity self = (Entity)this;
        if (self instanceof EntityPlayerSP) {
            final f3l event = new f3l(this.func_174813_aQ(), this.field_70138_W, f2T.c);
            Pyro.getEventManager().c(event);
            this.prevStepHeight = this.field_70138_W;
            this.field_70138_W = event.c();
        }
    }
    
    @Inject(method = { "move" }, at = { @At(value = "INVOKE", target = "net/minecraft/entity/Entity.setEntityBoundingBox(Lnet/minecraft/util/math/AxisAlignedBB;)V", ordinal = 7, shift = At.Shift.AFTER) })
    private void stepEnd(final MoverType var1, final double x, final double y, final double z, final CallbackInfo info) {
        final Entity self = (Entity)this;
        if (self instanceof EntityPlayerSP) {
            final f3l event = new f3l(this.func_174813_aQ(), this.field_70138_W, f2T.0);
            Pyro.getEventManager().c(event);
        }
    }
    
    @Inject(method = { "move" }, at = { @At("RETURN") })
    private void resetStepHeight(final MoverType type, final double x, final double y, final double z, final CallbackInfo info) {
        final Entity self = (Entity)this;
        if (self instanceof EntityPlayerSP && this.prevStepHeight != 0.0f) {
            this.field_70138_W = this.prevStepHeight;
            this.prevStepHeight = 0.0f;
        }
    }
}
