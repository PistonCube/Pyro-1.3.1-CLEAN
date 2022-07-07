// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.resources.FallbackResourceManager;
import java.util.Map;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ SimpleReloadableResourceManager.class })
public class SRRRMMixin
{
    @Shadow
    @Final
    private Map<String, FallbackResourceManager> field_110548_a;
    
    @Inject(method = { "getResource" }, at = { @At("HEAD") }, cancellable = true)
    private void setPyroMCNamespace(final ResourceLocation location, final CallbackInfoReturnable cir) {
        if (location.func_110624_b().equals("pyro")) {
            cir.setReturnValue(this.field_110548_a.get("minecraft").func_110536_a(location));
        }
    }
}
