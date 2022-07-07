// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import dev.nuker.pyro.far;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import dev.nuker.pyro.f3s;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f3r;
import dev.nuker.pyro.Pyro;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ World.class })
public class WorldMixin
{
    @Inject(method = { "onEntityAdded" }, at = { @At("HEAD") })
    private void onEntityAdded(final Entity entityIn, final CallbackInfo info) {
        Pyro.getEventManager().c(new f3r(entityIn));
    }
    
    @Inject(method = { "onEntityRemoved" }, at = { @At("RETURN") })
    private void onEntityRemoved(final Entity entityIn, final CallbackInfo info) {
        Pyro.getEventManager().c(new f3s(entityIn));
    }
    
    @Inject(method = { "checkLightFor" }, at = { @At("HEAD") }, cancellable = true)
    public void checkLightFor(final EnumSkyBlock lightType, final BlockPos pos, final CallbackInfoReturnable callback) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.7().3()) {
            callback.cancel();
            callback.setReturnValue(true);
        }
    }
    
    @Inject(method = { "updateEntities" }, at = { @At("RETURN") })
    public void updateEntities(final CallbackInfo info) {
        f4N.c.c();
    }
    
    @Inject(method = { "getRainStrength" }, at = { @At("HEAD") }, cancellable = true)
    private void spoofWeatherRain(final float delta, final CallbackInfoReturnable cir) {
        if (f4N.c.c.0()) {
            cir.setReturnValue((f4N.c.c().3() == far.c) ? 0.0f : 1.0f);
        }
    }
    
    @Inject(method = { "getThunderStrength" }, at = { @At("HEAD") }, cancellable = true)
    private void spoofWeatherThunder(final float delta, final CallbackInfoReturnable cir) {
        if (f4N.c.c.0()) {
            cir.setReturnValue((f4N.c.c().3() == far.1) ? 1.0f : 0.0f);
        }
    }
    
    @Inject(method = { "getSkyColor" }, at = { @At("HEAD") }, cancellable = true)
    public void getSkyColor(final Entity entityIn, final float partialTicks, final CallbackInfoReturnable callback) {
        if (f4N.c.c.0()) {
            callback.setReturnValue(f4N.c.0());
        }
    }
}
