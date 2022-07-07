// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.f9W;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.lwjgl.opengl.GL11;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ RenderManager.class })
public class RenderManagerMixin
{
    @Inject(method = { "renderEntity" }, at = { @At("HEAD") })
    private void renderChamsStart(final Entity entityIn, final double x, final double y, final double z, final float yaw, final float partialTicks, final boolean p_188391_10_, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() || ((boolean)f4N.c.c.0() && (boolean)f4N.c.n.3() && f4N.c.c == entityIn)) {
            GL11.glEnable(32823);
            GL11.glPolygonOffset(1.0f, -1000000.0f);
        }
    }
    
    @Inject(method = { "renderEntity" }, at = { @At("RETURN") })
    private void renderChamsEnd(final Entity entityIn, final double x, final double y, final double z, final float yaw, final float partialTicks, final boolean p_188391_10_, final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() || ((boolean)f4N.c.c.0() && (boolean)f4N.c.n.3() && f4N.c.c == entityIn)) {
            GL11.glPolygonOffset(1.0f, 1000000.0f);
            GL11.glDisable(32823);
        }
    }
    
    @Inject(method = { "renderEntityStatic" }, at = { @At("HEAD") }, cancellable = true)
    public void renderEntityStatic(final Entity entityIn, final float partialTicks, final boolean p_188388_3_, final CallbackInfo info) {
        if ((boolean)f4N.c.c.0() && entityIn instanceof EntityItem && f4N.c.0().3() == f9W.0) {
            info.cancel();
        }
    }
}
