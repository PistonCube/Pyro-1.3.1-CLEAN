// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f3m;
import dev.nuker.pyro.Pyro;
import net.minecraft.util.MovementInput;
import dev.nuker.pyro.f9x;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ MovementInputFromOptions.class })
public class MovementInputOptionsMixin
{
    @Inject(method = { "updatePlayerMoveState" }, at = { @At("RETURN") }, cancellable = true)
    private void updatePlayerMoveStateReturn(final CallbackInfo ci) {
        if ((boolean)f4N.c.c.0() && f4N.c.c.0().3() == f9x.c) {
            ((MovementInputFromOptions)this).field_192832_b = 0.0f;
            ((MovementInputFromOptions)this).field_78902_a = 0.0f;
            ((MovementInputFromOptions)this).field_78901_c = false;
            ((MovementInputFromOptions)this).field_78899_d = false;
            ((MovementInputFromOptions)this).field_187255_c = false;
            ((MovementInputFromOptions)this).field_187256_d = false;
            ((MovementInputFromOptions)this).field_187257_e = false;
            ((MovementInputFromOptions)this).field_187258_f = false;
        }
        if (!((MovementInput)this).field_78901_c) {
            ((MovementInput)this).field_78901_c = ((boolean)f4N.c.c.0() && f4N.c.b());
        }
        if (((boolean)f4N.c.c.0() && f4N.c.1()) || ((boolean)f4N.c.c.0() && f4N.c.c().c())) {
            ((MovementInputFromOptions)this).field_78901_c = false;
            ((MovementInputFromOptions)this).field_192832_b = 0.0f;
            ((MovementInputFromOptions)this).field_78902_a = 0.0f;
        }
        Pyro.getEventManager().c(new f3m());
    }
}
