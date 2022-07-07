// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityRenderer.class })
public interface EntityRendererAccessor
{
    @Invoker("orientCamera")
    void orientCam(final float p0);
    
    @Invoker("applyBobbing")
    void viewBob(final float p0);
    
    @Accessor("lightmapColors")
    int[] getLightmapColors();
    
    @Accessor("lightmapTexture")
    DynamicTexture getLightmapTexture();
    
    @Accessor("torchFlickerX")
    float getTorchFlickerX();
    
    @Accessor("bossColorModifier")
    float getBossColorModifier();
    
    @Accessor("bossColorModifierPrev")
    float getBossColorModifierPrev();
    
    @Invoker("getNightVisionBrightness")
    float invokeGetNightVisionBrightness(final EntityLivingBase p0, final float p1);
    
    @Invoker("setupCameraTransform")
    void invokeSetupCameraTransform(final float p0, final int p1);
}
