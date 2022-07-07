// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ KeyBinding.class })
public interface KeyBindingAccessor
{
    @Accessor("pressed")
    void setPressed(final boolean p0);
}
