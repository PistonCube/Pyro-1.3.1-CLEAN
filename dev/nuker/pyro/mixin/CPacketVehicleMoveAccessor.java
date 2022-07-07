// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.network.play.client.CPacketVehicleMove;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ CPacketVehicleMove.class })
public interface CPacketVehicleMoveAccessor
{
    @Accessor("y")
    void setY(final double p0);
}
