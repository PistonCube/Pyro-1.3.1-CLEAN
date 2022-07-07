// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.util.BlockRenderLayer;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Block.class })
public class BlockMixin
{
    @Inject(method = { "shouldSideBeRendered" }, at = { @At("HEAD") }, cancellable = true)
    public void shouldSideBeRendered(final IBlockState blockState, final IBlockAccess blockAccess, final BlockPos pos, final EnumFacing side, final CallbackInfoReturnable callback) {
        if ((boolean)f4N.c.c.0() && f4N.c.8()) {
            f4N.c.c((Block)this, blockState, blockAccess, pos, side, callback);
        }
    }
    
    @Inject(method = { "canRenderInLayer" }, at = { @At("HEAD") }, cancellable = true, remap = false)
    public void canRenderInLayer(final IBlockState state, final BlockRenderLayer layer, final CallbackInfoReturnable cir) {
        if ((boolean)f4N.c.c.0() && f4N.c.8()) {
            f4N.c.c((Block)this, layer, cir);
        }
    }
    
    @Inject(method = { "Lnet/minecraft/block/Block;getLightValue(Lnet/minecraft/block/state/IBlockState;)I" }, at = { @At("HEAD") }, cancellable = true)
    public void getLightValue(final IBlockState state, final CallbackInfoReturnable callback) {
        if ((boolean)f4N.c.c.0() && f4N.c.8()) {
            f4N.c.c((Block)this, callback);
        }
    }
}
