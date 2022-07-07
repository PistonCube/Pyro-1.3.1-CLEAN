// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.util.math.RayTraceResult;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import dev.nuker.pyro.PyroLightmap;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ViewFrustum;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderGlobal.class })
public abstract class RenderGlobalMixin
{
    @Shadow
    private double field_174992_B;
    @Shadow
    private double field_174993_C;
    @Shadow
    private double field_174987_D;
    @Shadow
    private int field_174988_E;
    @Shadow
    private int field_174989_F;
    @Shadow
    private int field_174990_G;
    @Shadow
    private WorldClient field_72769_h;
    private double _frustumUpdatePosX;
    private double _frustumUpdatePosY;
    private double _frustumUpdatePosZ;
    private int _frustumUpdatePosChunkX;
    private int _frustumUpdatePosChunkY;
    private int _frustumUpdatePosChunkZ;
    
    public RenderGlobalMixin() {
        this._frustumUpdatePosX = Double.MIN_VALUE;
        this._frustumUpdatePosY = Double.MIN_VALUE;
        this._frustumUpdatePosZ = Double.MIN_VALUE;
        this._frustumUpdatePosChunkX = Integer.MIN_VALUE;
        this._frustumUpdatePosChunkY = Integer.MIN_VALUE;
        this._frustumUpdatePosChunkZ = Integer.MIN_VALUE;
    }
    
    @Redirect(method = { "loadRenderers" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;getRenderViewEntity()Lnet/minecraft/entity/Entity;"))
    private Entity getRenderOrFreecamEntity(final Minecraft minecraft) {
        return (Entity)(((boolean)f4N.c.c.0()) ? ((f4N.c.c.0().3() == f9x.c) ? minecraft.field_71439_g : f4N.c.c) : minecraft.func_175606_aa());
    }
    
    @Redirect(method = { "setupTerrain" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ViewFrustum;updateChunkPositions(DD)V"))
    private void checkFreecamChunkUpdates(final ViewFrustum viewFrustum, final double viewEntityX, final double viewEntityZ) {
        if (f4N.c.c.0()) {
            final Entity viewEntity = (Entity)((f4N.c.c.0().3() == f9x.c) ? Minecraft.func_71410_x().field_71439_g : f4N.c.c);
            final double d0 = viewEntity.field_70165_t - this._frustumUpdatePosX;
            final double d2 = viewEntity.field_70163_u - this._frustumUpdatePosY;
            final double d3 = viewEntity.field_70161_v - this._frustumUpdatePosZ;
            if (this._frustumUpdatePosChunkX != viewEntity.field_70176_ah || this._frustumUpdatePosChunkY != viewEntity.field_70162_ai || this._frustumUpdatePosChunkZ != viewEntity.field_70164_aj || d0 * d0 + d2 * d2 + d3 * d3 > 16.0) {
                this._frustumUpdatePosX = viewEntity.field_70165_t;
                this._frustumUpdatePosY = viewEntity.field_70163_u;
                this._frustumUpdatePosZ = viewEntity.field_70161_v;
                this._frustumUpdatePosChunkX = viewEntity.field_70176_ah;
                this._frustumUpdatePosChunkY = viewEntity.field_70162_ai;
                this._frustumUpdatePosChunkZ = viewEntity.field_70164_aj;
                viewFrustum.func_178163_a(viewEntity.field_70165_t, viewEntity.field_70161_v);
            }
        }
        else {
            this._frustumUpdatePosX = this.field_174992_B;
            this._frustumUpdatePosY = this.field_174993_C;
            this._frustumUpdatePosZ = this.field_174987_D;
            this._frustumUpdatePosChunkX = this.field_174988_E;
            this._frustumUpdatePosChunkY = this.field_174989_F;
            this._frustumUpdatePosChunkZ = this.field_174990_G;
            viewFrustum.func_178163_a(viewEntityX, viewEntityZ);
        }
    }
    
    @Redirect(method = { "setupTerrain" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/state/IBlockState;isOpaqueCube()Z"))
    private boolean isOpaqueOrWallhacking(final IBlockState iBlockState) {
        return iBlockState.func_185914_p() || f4N.c.0() != 255;
    }
    
    @Redirect(method = { "renderBlockLayer(Lnet/minecraft/util/BlockRenderLayer;)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;enableLightmap()V"))
    private void enableFakeLightmap(final EntityRenderer entityRenderer) {
        if (f4N.c.8()) {
            PyroLightmap.Companion.getINSTANCE().enableLightmap();
        }
        else {
            entityRenderer.func_180436_i();
        }
    }
    
    @Redirect(method = { "renderSky(FI)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getRainStrength(F)F"))
    float getRainStrength(final WorldClient world, final float delta) {
        if (f4N.c.c.0()) {
            return f4N.c.1();
        }
        return world.func_72867_j(delta);
    }
    
    @Inject(method = { "makeEntityOutlineShader" }, at = { @At("RETURN") })
    private void updateESPShader(final CallbackInfo ci) {
        f4N.c.3();
    }
    
    @Inject(method = { "drawSelectionBox" }, at = { @At("HEAD") }, cancellable = true)
    public void drawSelectionBox(final EntityPlayer player, final RayTraceResult movingObjectPositionIn, final int execute, final float partialTicks, final CallbackInfo info) {
        if (f4N.c.c.0()) {
            f4N.c.c(player, movingObjectPositionIn, execute, partialTicks);
            info.cancel();
        }
    }
}
