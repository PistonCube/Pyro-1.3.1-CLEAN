// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.inventory.IInventory;
import dev.nuker.pyro.f2u;
import dev.nuker.pyro.Config;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.init.SoundEvents;
import dev.nuker.pyro.f3j;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer$Rotation;
import net.minecraft.network.play.client.CPacketPlayer$Position;
import net.minecraft.network.play.client.CPacketPlayer$PositionRotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.network.Packet;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction$Action;
import dev.nuker.pyro.f3h;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.item.EntityBoat;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f3e;
import dev.nuker.pyro.f2T;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.MoverType;
import net.minecraft.util.MovementInput;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.network.NetHandlerPlayClient;
import dev.nuker.pyro.f3i;
import net.minecraft.client.entity.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPlayerSP.class })
public abstract class EntityPlayerSPMixin extends EntityPlayerMixin
{
    private f3i currWalkingPlayerEvent;
    @Shadow
    @Final
    private NetHandlerPlayClient field_71174_a;
    @Shadow
    private double field_175172_bI;
    @Shadow
    private double field_175166_bJ;
    @Shadow
    private double field_175167_bK;
    @Shadow
    private float field_175164_bL;
    @Shadow
    private float field_175165_bM;
    @Shadow
    private boolean field_184841_cd;
    @Shadow
    private boolean field_175170_bN;
    @Shadow
    private boolean field_175171_bO;
    @Shadow
    private int field_175168_bP;
    @Shadow
    private boolean field_189811_cr;
    @Shadow
    private Minecraft field_71159_c;
    @Shadow
    public float field_71086_bY;
    @Shadow
    public MovementInput field_71158_b;
    @Shadow
    private boolean field_184844_co;
    
    @Shadow
    public void func_175159_q() {
    }
    
    @Shadow
    public abstract boolean func_175160_A();
    
    @Inject(method = { "move" }, at = { @At("HEAD") }, cancellable = true)
    private void move(final MoverType type, final double x, final double y, final double z, final CallbackInfo info) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.0) {
            Minecraft.func_71410_x().field_71439_g.field_70145_X = true;
        }
        final f3e event = new f3e(f2T.c, type, x, y, z);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
            super.func_70091_d(event.1(), event.2(), event.c(), event.0());
            Pyro.getEventManager().c(new f3e(f2T.0, type, x, y, z));
        }
    }
    
    @Inject(method = { "move" }, at = { @At("RETURN") })
    private void movePost(final MoverType type, final double x, final double y, final double z, final CallbackInfo info) {
        Pyro.getEventManager().c(new f3e(f2T.0, type, x, y, z));
    }
    
    @Inject(method = { "updateRidden" }, at = { @At("RETURN") })
    private void updateRiddenPost(final CallbackInfo info) {
        if ((boolean)f4N.c.c.0() && this.func_184187_bx() instanceof EntityBoat) {
            final EntityBoat entityboat = (EntityBoat)this.func_184187_bx();
            entityboat.func_184442_a(this.field_71158_b.field_187257_e, this.field_71158_b.field_187258_f, this.field_71158_b.field_192832_b > 0.0f, this.field_71158_b.field_187256_d);
            this.field_184844_co |= (this.field_71158_b.field_187257_e || this.field_71158_b.field_187258_f || this.field_71158_b.field_192832_b > 0.0f || this.field_71158_b.field_187256_d);
        }
    }
    
    @Inject(method = { "isCurrentViewEntity" }, at = { @At("HEAD") }, cancellable = true)
    private void isFreecamOrRenderView(final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c) {
            cir.setReturnValue(true);
        }
    }
    
    @Inject(method = { "isUser" }, at = { @At("HEAD") }, cancellable = true)
    private void isFreecamingOrUser(final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c) {
            cir.setReturnValue(false);
        }
    }
    
    @Inject(method = { "onUpdate" }, at = { @At("HEAD") })
    public void onUpdate(final CallbackInfo ci) {
        Pyro.getEventManager().c(new f3h());
    }
    
    private void syncSprintSneakPackets() {
        final boolean flag = this.func_70051_ag();
        if (flag != this.field_175171_bO) {
            if (flag) {
                this.field_71174_a.func_147297_a((Packet)new CPacketEntityAction((Entity)this, CPacketEntityAction$Action.START_SPRINTING));
            }
            else {
                this.field_71174_a.func_147297_a((Packet)new CPacketEntityAction((Entity)this, CPacketEntityAction$Action.STOP_SPRINTING));
            }
            this.field_175171_bO = flag;
        }
        final boolean flag2 = this.func_70093_af();
        if (flag2 != this.field_175170_bN) {
            if (flag2) {
                this.field_71174_a.func_147297_a((Packet)new CPacketEntityAction((Entity)this, CPacketEntityAction$Action.START_SNEAKING));
            }
            else {
                this.field_71174_a.func_147297_a((Packet)new CPacketEntityAction((Entity)this, CPacketEntityAction$Action.STOP_SNEAKING));
            }
            this.field_175170_bN = flag2;
        }
    }
    
    private void sendPositionPackets(final AxisAlignedBB axisAlignedBB) {
        this.syncSprintSneakPackets();
        if (this.func_175160_A()) {
            final double d0 = this.field_70165_t - this.field_175172_bI;
            final double d2 = this.currWalkingPlayerEvent.4() - this.field_175166_bJ;
            final double d3 = this.field_70161_v - this.field_175167_bK;
            final double d4 = this.currWalkingPlayerEvent.6() - this.field_175164_bL;
            final double d5 = this.currWalkingPlayerEvent.2() - this.field_175165_bM;
            ++this.field_175168_bP;
            boolean flag2 = d0 * d0 + d2 * d2 + d3 * d3 > 9.0E-4 || this.field_175168_bP >= 20;
            final boolean flag3 = d4 != 0.0 || d5 != 0.0;
            if (this.func_184218_aH()) {
                this.field_71174_a.func_147297_a((Packet)new CPacketPlayer$PositionRotation(this.field_70159_w, -999.0, this.field_70179_y, this.currWalkingPlayerEvent.6(), this.currWalkingPlayerEvent.2(), this.currWalkingPlayerEvent.1()));
                flag2 = false;
            }
            else if (flag2 && flag3) {
                this.field_71174_a.func_147297_a((Packet)new CPacketPlayer$PositionRotation(this.field_70165_t, this.currWalkingPlayerEvent.4(), this.field_70161_v, this.currWalkingPlayerEvent.6(), this.currWalkingPlayerEvent.2(), this.currWalkingPlayerEvent.1()));
            }
            else if (flag2) {
                this.field_71174_a.func_147297_a((Packet)new CPacketPlayer$Position(this.field_70165_t, this.currWalkingPlayerEvent.4(), this.field_70161_v, this.currWalkingPlayerEvent.1()));
            }
            else if (flag3) {
                this.field_71174_a.func_147297_a((Packet)new CPacketPlayer$Rotation(this.currWalkingPlayerEvent.6(), this.currWalkingPlayerEvent.2(), this.currWalkingPlayerEvent.1()));
            }
            else if (this.field_184841_cd != this.currWalkingPlayerEvent.1()) {
                this.field_71174_a.func_147297_a((Packet)new CPacketPlayer(this.currWalkingPlayerEvent.1()));
            }
            if (flag2) {
                this.field_175172_bI = this.field_70165_t;
                this.field_175166_bJ = this.currWalkingPlayerEvent.4();
                this.field_175167_bK = this.field_70161_v;
                this.field_175168_bP = 0;
            }
            if (flag3) {
                this.field_175164_bL = this.currWalkingPlayerEvent.6();
                this.field_175165_bM = this.currWalkingPlayerEvent.2();
            }
            this.field_184841_cd = this.currWalkingPlayerEvent.1();
            this.field_189811_cr = this.field_71159_c.field_71474_y.field_189989_R;
        }
    }
    
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("HEAD") }, cancellable = true)
    public void onUpdateWalkingPlayer(final CallbackInfo ci) {
        final AxisAlignedBB axisalignedbb = this.func_174813_aQ();
        Pyro.getEventManager().c(this.currWalkingPlayerEvent = new f3i(f2T.c, this.field_70125_A, this.field_70177_z, axisalignedbb.field_72338_b, this.field_70122_E));
        if (this.currWalkingPlayerEvent.5()) {
            ci.cancel();
            this.syncSprintSneakPackets();
            this.currWalkingPlayerEvent.c(f2T.0);
            Pyro.getEventManager().c(this.currWalkingPlayerEvent);
            return;
        }
        if (this.currWalkingPlayerEvent.0()) {
            Pyro.rotationManager.c(this.currWalkingPlayerEvent.2());
            Pyro.rotationManager.0(this.currWalkingPlayerEvent.6());
            ci.cancel();
            Pyro.getEventManager().c(new f3j(f2T.c, this.currWalkingPlayerEvent));
            this.sendPositionPackets(axisalignedbb);
            if (this.currWalkingPlayerEvent.3() != null) {
                this.currWalkingPlayerEvent.3().accept(this);
            }
        }
        this.currWalkingPlayerEvent.c(f2T.0);
        Pyro.getEventManager().c(this.currWalkingPlayerEvent);
    }
    
    @Inject(method = { "pushOutOfBlocks" }, at = { @At("HEAD") }, cancellable = true)
    public void pushOutOfBlocks(final double x, final double y, final double z, final CallbackInfoReturnable info) {
        if (((boolean)f4N.c.c.0() && (boolean)f4N.c.1().3()) || (boolean)f4N.c.c.0() || (boolean)f4N.c.c.0()) {
            info.setReturnValue(false);
        }
    }
    
    @Inject(method = { "onLivingUpdate" }, at = { @At("HEAD") })
    public void preLivingUpdate(final CallbackInfo ci) {
        if (this.field_71087_bX) {
            if (this.field_71086_bY == 0.0f) {
                this.field_71159_c.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187814_ei, this.field_70146_Z.nextFloat() * 0.4f + 0.8f));
            }
            this.field_71086_bY += 0.0125f;
            if (this.field_71086_bY >= 1.0f) {
                this.field_71086_bY = 1.0f;
            }
            this.field_71087_bX = false;
        }
    }
    
    @Inject(method = { "sendChatMessage" }, at = { @At("HEAD") }, cancellable = true)
    public void sendChatMessage(final String originalMessage, final CallbackInfo info) {
        if (originalMessage.startsWith(Config.INSTANCE.chatPrefix)) {
            Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146239_a(originalMessage);
            f2u.0(originalMessage.substring(Config.INSTANCE.chatPrefix.length()));
            info.cancel();
        }
    }
    
    @Inject(method = { "displayGUIChest" }, at = { @At("HEAD") })
    public void displayGUIChest(final IInventory inv, final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.c(inv);
        }
    }
}
