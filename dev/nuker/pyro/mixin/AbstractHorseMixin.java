// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.passive.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ AbstractHorse.class })
public abstract class AbstractHorseMixin
{
    @Inject(method = { "getHorseJumpStrength" }, at = { @At("HEAD") }, cancellable = true)
    private void getHorseJumpStrength(final CallbackInfoReturnable callbackInfoReturnable) {
        if (f4N.c.c.0()) {
            callbackInfoReturnable.setReturnValue(f4N.c.0().3());
        }
    }
    
    @Inject(method = { "canBeSteered" }, at = { @At("HEAD") }, cancellable = true)
    private void canBeSteered(final CallbackInfoReturnable info) {
        if (f4N.c.c.0()) {
            info.cancel();
            info.setReturnValue(true);
        }
    }
    
    @Inject(method = { "isHorseSaddled" }, at = { @At("HEAD") }, cancellable = true)
    private void isHorseSaddled(final CallbackInfoReturnable info) {
        if (f4N.c.c.0()) {
            info.cancel();
            info.setReturnValue(true);
        }
    }
}
