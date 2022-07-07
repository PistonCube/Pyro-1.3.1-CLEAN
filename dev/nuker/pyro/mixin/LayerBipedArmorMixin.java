// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f4N;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ LayerBipedArmor.class })
public abstract class LayerBipedArmorMixin
{
    @Inject(method = { "setModelSlotVisible" }, at = { @At("HEAD") }, cancellable = true)
    private void setModelSlotVisible(final ModelBiped p_188359_1_, final EntityEquipmentSlot slotIn, final CallbackInfo info) {
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.f().3()) {
            info.cancel();
            p_188359_1_.func_178719_a(false);
            if (slotIn == EntityEquipmentSlot.HEAD) {
                p_188359_1_.field_78116_c.field_78806_j = false;
                p_188359_1_.field_178720_f.field_78806_j = false;
            }
            else if (slotIn == EntityEquipmentSlot.CHEST) {
                p_188359_1_.field_78115_e.field_78806_j = false;
                p_188359_1_.field_178723_h.field_78806_j = false;
                p_188359_1_.field_178724_i.field_78806_j = false;
            }
            else if (slotIn == EntityEquipmentSlot.LEGS) {
                p_188359_1_.field_78115_e.field_78806_j = false;
                p_188359_1_.field_178721_j.field_78806_j = false;
                p_188359_1_.field_178722_k.field_78806_j = false;
            }
            else if (slotIn == EntityEquipmentSlot.FEET) {
                p_188359_1_.field_178721_j.field_78806_j = false;
                p_188359_1_.field_178722_k.field_78806_j = false;
            }
        }
    }
}
