// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.gui.GuiChat;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiChat.class })
public interface GuiChatAccessor
{
    @Accessor("sentHistoryCursor")
    int getHistoryCursor();
    
    @Accessor("sentHistoryCursor")
    void setHistoryCursor(final int p0);
    
    @Accessor("historyBuffer")
    void setHistoryBuffer(final String p0);
}
