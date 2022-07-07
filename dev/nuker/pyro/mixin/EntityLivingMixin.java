// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.EntityLiving;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityLiving.class })
public abstract class EntityLivingMixin extends EntityLivingBaseMixin
{
    @Shadow
    public abstract boolean func_184186_bw();
    
    @Shadow
    public abstract boolean func_82171_bF();
    
    @Shadow
    public void func_70659_e(final float speedIn) {
    }
}
