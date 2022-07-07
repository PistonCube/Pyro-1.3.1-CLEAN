// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.entity.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPlayerSP.class })
public interface EntityPlayerSPAccessor
{
    @Accessor("prevOnGround")
    boolean getPrevOnGround();
    
    @Accessor("handActive")
    void setHandActive(final boolean p0);
    
    @Accessor("horseJumpPower")
    void setHorseJumpPower(final float p0);
}
