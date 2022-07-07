// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ PlayerControllerMP.class })
public interface PlayerControllerMPAccessor
{
    @Accessor("isHittingBlock")
    void setIsHittingBlock(final boolean p0);
    
    @Accessor("curBlockDamageMP")
    void setCurBlockDamageMP(final float p0);
    
    @Accessor("curBlockDamageMP")
    float getCurBlockDamageMP();
    
    @Accessor("blockHitDelay")
    void setBlockHitDelay(final int p0);
}
