// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ BlockRendererDispatcher.class })
public class BlockRendererDispatcherMixin
{
    @Inject(method = { "renderBlock" }, at = { @At("HEAD") })
    private void renderBlock(final IBlockState iBlockState, final BlockPos blockPos, final IBlockAccess iBlockAccess, final BufferBuilder bufferBuilder, final CallbackInfoReturnable callbackInfoReturnable) {
        try {
            if (f4N.c.c.0()) {
                f4N.c.c(iBlockState, blockPos);
            }
        }
        catch (Exception ex) {}
    }
}
