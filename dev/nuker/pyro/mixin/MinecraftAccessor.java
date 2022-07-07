// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.util.Session;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.Timer;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Minecraft.class })
public interface MinecraftAccessor
{
    @Accessor("timer")
    Timer getTimer();
    
    @Accessor("rightClickDelayTimer")
    int getRightClickDelayTimer();
    
    @Accessor("rightClickDelayTimer")
    void setRightClickDelayTimer(final int p0);
    
    @Accessor("session")
    void setSession(final Session p0);
    
    @Accessor("renderPartialTicksPaused")
    float getRenderPartialTicksPaused();
    
    @Accessor("leftClickCounter")
    void setLeftClickCounter(final int p0);
}
