// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f34;
import io.netty.channel.ChannelHandlerContext;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.Pyro;
import dev.nuker.pyro.f30;
import dev.nuker.pyro.f2T;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.network.Packet;
import net.minecraft.network.NetworkManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ NetworkManager.class })
public class NetworkManagerMixin
{
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void sendPacketPre(final Packet packet, final CallbackInfo info) {
        final f30 event = new f30(packet, f2T.c);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("RETURN") })
    private void sendPacketPost(final Packet packet, final CallbackInfo callbackInfo) {
        Pyro.getEventManager().c(new f30(packet, f2T.0));
    }
    
    @Inject(method = { "channelRead0" }, at = { @At("HEAD") }, cancellable = true)
    private void channelReadPre(final ChannelHandlerContext context, final Packet packet, final CallbackInfo info) {
        final f34 event = new f34(packet, f2T.c);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "channelRead0" }, at = { @At("RETURN") })
    private void channelReadPost(final ChannelHandlerContext context, final Packet packet, final CallbackInfo info) {
        final f34 event = new f34(packet, f2T.0);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
    }
}
