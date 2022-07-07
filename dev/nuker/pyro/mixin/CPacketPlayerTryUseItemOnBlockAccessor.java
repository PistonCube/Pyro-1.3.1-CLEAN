// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.EnumFacing;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ CPacketPlayerTryUseItemOnBlock.class })
public interface CPacketPlayerTryUseItemOnBlockAccessor
{
    @Accessor("placedBlockDirection")
    void setPlacedBlockDirection(final EnumFacing p0);
}
