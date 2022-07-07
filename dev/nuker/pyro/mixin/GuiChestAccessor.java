// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.inventory.IInventory;
import net.minecraft.client.gui.inventory.GuiChest;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ GuiChest.class })
public interface GuiChestAccessor
{
    @Accessor("lowerChestInventory")
    IInventory getLowerChestInventory();
}
