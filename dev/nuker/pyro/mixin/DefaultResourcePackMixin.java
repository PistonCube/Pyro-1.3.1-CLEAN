// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import java.io.ByteArrayInputStream;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import java.io.IOException;
import dev.nuker.pyro.PyroClientLoadingPlugin;
import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.DefaultResourcePack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ DefaultResourcePack.class })
public class DefaultResourcePackMixin
{
    @Inject(method = { "resourceExists" }, at = { @At("HEAD") }, cancellable = true)
    private void pyroResourcesExist(final ResourceLocation location, final CallbackInfoReturnable cir) {
        if (location.func_110624_b().equals("pyro")) {
            try {
                if (Launch.classLoader.getClassBytes("net.minecraft.world.World") != null) {
                    cir.setReturnValue(Launch.classLoader.getResourceAsStream(location.func_110623_a()) != null);
                }
                else {
                    cir.setReturnValue(PyroClientLoadingPlugin.resources.containsKey(location.func_110623_a()));
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Inject(method = { "getResourceStream" }, at = { @At("HEAD") }, cancellable = true)
    private void getPyroResource(final ResourceLocation location, final CallbackInfoReturnable cir) {
        if (location.func_110624_b().equals("pyro")) {
            try {
                if (Launch.classLoader.getClassBytes("net.minecraft.world.World") != null) {
                    cir.setReturnValue(Launch.classLoader.getResourceAsStream(location.func_110623_a()));
                }
                else {
                    cir.setReturnValue(PyroClientLoadingPlugin.resources.containsKey(location.func_110623_a()) ? new ByteArrayInputStream(PyroClientLoadingPlugin.resources.get(location.func_110623_a())) : null);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
