// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Timer.class })
public interface TimerAccessor
{
    @Accessor("tickLength")
    float getTickLength();
    
    @Accessor("tickLength")
    void setTickLength(final float p0);
}
