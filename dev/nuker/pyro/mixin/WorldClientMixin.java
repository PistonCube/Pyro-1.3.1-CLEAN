// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f3t;
import dev.nuker.pyro.Pyro;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldSettings;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ WorldClient.class })
public class WorldClientMixin
{
    @Inject(method = { "Lnet/minecraft/client/multiplayer/WorldClient;<init>(Lnet/minecraft/client/network/NetHandlerPlayClient;Lnet/minecraft/world/WorldSettings;ILnet/minecraft/world/EnumDifficulty;Lnet/minecraft/profiler/Profiler;)V" }, at = { @At("RETURN") })
    private void init(final NetHandlerPlayClient netHandler, final WorldSettings settings, final int dimension, final EnumDifficulty difficulty, final Profiler profilerIn, final CallbackInfo info) {
        Pyro.getEventManager().c(new f3t());
    }
}
