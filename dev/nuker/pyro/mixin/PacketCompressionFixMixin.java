// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.Overwrite;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import net.minecraft.util.text.ITextComponent;
import dev.nuker.pyro.Pyro;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.f4N;
import net.minecraft.network.PacketBuffer;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import java.util.zip.Inflater;
import net.minecraft.network.NettyCompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ NettyCompressionDecoder.class })
public class PacketCompressionFixMixin
{
    @Shadow
    @Final
    private Inflater field_179305_a;
    @Shadow
    private int field_179304_b;
    
    @Overwrite
    protected void decode(final ChannelHandlerContext p_decode_1_, final ByteBuf p_decode_2_, final List p_decode_3_) {
        if (p_decode_2_.readableBytes() != 0) {
            final PacketBuffer packetbuffer = new PacketBuffer(p_decode_2_);
            final int i = packetbuffer.func_150792_a();
            if (i == 0) {
                p_decode_3_.add(packetbuffer.readBytes(packetbuffer.readableBytes()));
            }
            else {
                if (f4N.c.c.0()) {
                    if ((i < this.field_179304_b || i > 2097152) && Minecraft.func_71410_x().field_71456_v != null) {
                        Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146227_a(new TextComponentString("").func_150257_a(Pyro.prefix).func_150257_a((ITextComponent)new TextComponentString("Recieved a bad packet, ignoring")));
                    }
                }
                else {
                    if (i < this.field_179304_b) {
                        throw new DecoderException("Badly compressed packet - size of " + i + " is below server threshold of " + this.field_179304_b);
                    }
                    if (i > 2097152) {
                        throw new DecoderException("Badly compressed packet - size of " + i + " is larger than protocol maximum of " + 2097152);
                    }
                }
                final byte[] abyte = new byte[packetbuffer.readableBytes()];
                packetbuffer.readBytes(abyte);
                this.field_179305_a.setInput(abyte);
                final byte[] abyte2 = new byte[i];
                this.field_179305_a.inflate(abyte2);
                p_decode_3_.add(Unpooled.wrappedBuffer(abyte2));
                this.field_179305_a.reset();
            }
        }
    }
}
