// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.network.play.client.CPacketCloseWindow;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ CPacketCloseWindow.class })
public interface CPacketCloseWindowAccessor
{
    @Accessor("windowId")
    int getWindowId();
}
