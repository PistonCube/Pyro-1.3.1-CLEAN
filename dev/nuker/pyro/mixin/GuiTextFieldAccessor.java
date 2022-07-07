// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.gui.GuiTextField;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiTextField.class })
public interface GuiTextFieldAccessor
{
    @Accessor("text")
    void set(final String p0);
}
