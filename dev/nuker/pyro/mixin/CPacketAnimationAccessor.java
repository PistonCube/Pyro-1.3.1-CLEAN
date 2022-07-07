// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.EnumHand;
import net.minecraft.network.play.client.CPacketAnimation;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ CPacketAnimation.class })
public interface CPacketAnimationAccessor
{
    @Accessor("hand")
    void setHand(final EnumHand p0);
}
