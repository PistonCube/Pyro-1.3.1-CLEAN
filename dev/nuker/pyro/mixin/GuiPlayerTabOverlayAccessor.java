// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiPlayerTabOverlay.class })
public interface GuiPlayerTabOverlayAccessor
{
    @Accessor("footer")
    ITextComponent getFooter();
    
    @Accessor("header")
    ITextComponent getHeader();
    
    @Accessor("lastTimeOpened")
    long getLastTimeOpened();
}
