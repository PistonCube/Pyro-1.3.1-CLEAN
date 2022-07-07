// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ SPacketEntityVelocity.class })
public interface SPacketEntityVelocityAccessor
{
    @Accessor("motionX")
    int getMotionX();
    
    @Accessor("motionX")
    void setMotionX(final int p0);
    
    @Accessor("motionY")
    int getMotionY();
    
    @Accessor("motionY")
    void setMotionY(final int p0);
    
    @Accessor("motionZ")
    int getMotionZ();
    
    @Accessor("motionZ")
    void setMotionZ(final int p0);
    
    @Accessor("entityID")
    int getEntityID();
}
