// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.util.NonNullList;
import net.minecraft.inventory.InventoryBasic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ InventoryBasic.class })
public interface InventoryBasicAccessor
{
    @Accessor("inventoryContents")
    NonNullList getInventoryContents();
}
