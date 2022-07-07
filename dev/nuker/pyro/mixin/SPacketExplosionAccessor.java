// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.network.play.server.SPacketExplosion;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ SPacketExplosion.class })
public interface SPacketExplosionAccessor
{
    @Accessor("motionX")
    float getMotionX();
    
    @Accessor("motionX")
    void setMotionX(final float p0);
    
    @Accessor("motionY")
    float getMotionY();
    
    @Accessor("motionY")
    void setMotionY(final float p0);
    
    @Accessor("motionZ")
    float getMotionZ();
    
    @Accessor("motionZ")
    void setMotionZ(final float p0);
}
