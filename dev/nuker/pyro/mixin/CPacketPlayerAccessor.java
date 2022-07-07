// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.network.play.client.CPacketPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ CPacketPlayer.class })
public interface CPacketPlayerAccessor
{
    @Accessor("y")
    void setPosY(final double p0);
    
    @Accessor("y")
    double getPosY();
    
    @Accessor("x")
    double getPosX();
    
    @Accessor("z")
    double getPosZ();
    
    @Accessor("onGround")
    void setOnGround(final boolean p0);
    
    @Accessor("rotating")
    boolean isRotating();
    
    @Accessor("rotating")
    void setRotating(final boolean p0);
    
    @Accessor("yaw")
    float getYaw();
    
    @Accessor("pitch")
    float getPitch();
    
    @Accessor("yaw")
    void setYaw(final float p0);
    
    @Accessor("pitch")
    void setPitch(final float p0);
}
