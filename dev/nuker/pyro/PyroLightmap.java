// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import net.minecraft.client.renderer.texture.DynamicTexture;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e" }, d2 = { "Ldev/nuker/pyro/PyroLightmap;", "", "mc", "Lnet/minecraft/client/Minecraft;", "(Lnet/minecraft/client/Minecraft;)V", "lightmapColors", "", "getLightmapColors", "()[I", "lightmapTexture", "Lnet/minecraft/client/renderer/texture/DynamicTexture;", "getLightmapTexture", "()Lnet/minecraft/client/renderer/texture/DynamicTexture;", "locationLightMap", "Lnet/minecraft/util/ResourceLocation;", "getLocationLightMap", "()Lnet/minecraft/util/ResourceLocation;", "getMc", "()Lnet/minecraft/client/Minecraft;", "enableLightmap", "", "modifyColor", "", "r", "g", "b", "updateLightmap", "partialTicks", "", "Companion", "pyroclient" })
public final class PyroLightmap
{
    @NotNull
    private final DynamicTexture lightmapTexture;
    @NotNull
    private final int[] lightmapColors;
    @NotNull
    private final ResourceLocation locationLightMap;
    @NotNull
    private final Minecraft mc;
    @NotNull
    public static PyroLightmap INSTANCE;
    public static final PyroLightmap$Companion Companion;
    
    @NotNull
    public final DynamicTexture getLightmapTexture() {
        return this.lightmapTexture;
    }
    
    @NotNull
    public final int[] getLightmapColors() {
        return this.lightmapColors;
    }
    
    @NotNull
    public final ResourceLocation getLocationLightMap() {
        return this.locationLightMap;
    }
    
    public final void updateLightmap(final float partialTicks) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //     4: getfield        net/minecraft/client/Minecraft.field_71424_I:Lnet/minecraft/profiler/Profiler;
        //     7: ldc             "lightTex"
        //     9: invokevirtual   net/minecraft/profiler/Profiler.func_76320_a:(Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //    16: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    19: checkcast       Lnet/minecraft/world/World;
        //    22: astore_2        /* world */
        //    23: aload_2         /* world */
        //    24: ifnull          1082
        //    27: aload_2         /* world */
        //    28: fconst_1       
        //    29: invokevirtual   net/minecraft/world/World.func_72971_b:(F)F
        //    32: fstore_3        /* f */
        //    33: fload_3         /* f */
        //    34: ldc             0.95
        //    36: fmul           
        //    37: ldc             0.05
        //    39: fadd           
        //    40: fstore          f1
        //    42: iconst_0       
        //    43: istore          5
        //    45: sipush          256
        //    48: istore          6
        //    50: iload           5
        //    52: iload           6
        //    54: if_icmpge       1065
        //    57: aload_2         /* world */
        //    58: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //    61: dup            
        //    62: ldc             "world.provider"
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: invokevirtual   net/minecraft/world/WorldProvider.func_177497_p:()[F
        //    70: iload           i
        //    72: bipush          16
        //    74: idiv           
        //    75: faload         
        //    76: fload           f1
        //    78: fmul           
        //    79: fstore          f2
        //    81: aload_2         /* world */
        //    82: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //    85: dup            
        //    86: ldc             "world.provider"
        //    88: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    91: invokevirtual   net/minecraft/world/WorldProvider.func_177497_p:()[F
        //    94: iload           i
        //    96: bipush          16
        //    98: irem           
        //    99: faload         
        //   100: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   103: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   106: dup            
        //   107: ifnonnull       120
        //   110: new             Lkotlin/TypeCastException;
        //   113: dup            
        //   114: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   116: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   119: athrow         
        //   120: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   123: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getTorchFlickerX:()F
        //   128: ldc             0.1
        //   130: fmul           
        //   131: ldc             1.5
        //   133: fadd           
        //   134: fmul           
        //   135: fstore          f3
        //   137: aload_2         /* world */
        //   138: invokevirtual   net/minecraft/world/World.func_175658_ac:()I
        //   141: ifle            165
        //   144: aload_2         /* world */
        //   145: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //   148: dup            
        //   149: ldc             "world.provider"
        //   151: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   154: invokevirtual   net/minecraft/world/WorldProvider.func_177497_p:()[F
        //   157: iload           i
        //   159: bipush          16
        //   161: idiv           
        //   162: faload         
        //   163: fstore          f2
        //   165: fload           f2
        //   167: fload_3         /* f */
        //   168: ldc             0.65
        //   170: fmul           
        //   171: ldc             0.35
        //   173: fadd           
        //   174: fmul           
        //   175: fstore          f4
        //   177: fload           f2
        //   179: fload_3         /* f */
        //   180: ldc             0.65
        //   182: fmul           
        //   183: ldc             0.35
        //   185: fadd           
        //   186: fmul           
        //   187: fstore          f5
        //   189: fload           f3
        //   191: fload           f3
        //   193: ldc             0.6
        //   195: fmul           
        //   196: ldc             0.4
        //   198: fadd           
        //   199: ldc             0.6
        //   201: fmul           
        //   202: ldc             0.4
        //   204: fadd           
        //   205: fmul           
        //   206: fstore          f6
        //   208: fload           f3
        //   210: fload           f3
        //   212: fload           f3
        //   214: fmul           
        //   215: ldc             0.6
        //   217: fmul           
        //   218: ldc             0.4
        //   220: fadd           
        //   221: fmul           
        //   222: fstore          f7
        //   224: fload           f4
        //   226: fload           f3
        //   228: fadd           
        //   229: fstore          f8
        //   231: fload           f5
        //   233: fload           f6
        //   235: fadd           
        //   236: fstore          f9
        //   238: fload           f2
        //   240: fload           f7
        //   242: fadd           
        //   243: fstore          f10
        //   245: fload           f8
        //   247: ldc             0.96
        //   249: fmul           
        //   250: ldc             0.03
        //   252: fadd           
        //   253: fstore          f8
        //   255: fload           f9
        //   257: ldc             0.96
        //   259: fmul           
        //   260: ldc             0.03
        //   262: fadd           
        //   263: fstore          f9
        //   265: fload           f10
        //   267: ldc             0.96
        //   269: fmul           
        //   270: ldc             0.03
        //   272: fadd           
        //   273: fstore          f10
        //   275: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9X;
        //   278: getfield        dev/nuker/pyro/f9X.c:Ldev/nuker/pyro/fw;
        //   281: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   284: checkcast       Ljava/lang/Boolean;
        //   287: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   290: ifeq            311
        //   293: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9X;
        //   296: invokevirtual   dev/nuker/pyro/f9X.5:()Ldev/nuker/pyro/f0a;
        //   299: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   302: checkcast       Ljava/lang/Boolean;
        //   305: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   308: ifne            488
        //   311: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   314: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   317: dup            
        //   318: ifnonnull       331
        //   321: new             Lkotlin/TypeCastException;
        //   324: dup            
        //   325: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   327: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   330: athrow         
        //   331: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   334: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getBossColorModifier:()F
        //   339: fconst_0       
        //   340: fcmpl          
        //   341: ifle            488
        //   344: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   347: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   350: dup            
        //   351: ifnonnull       364
        //   354: new             Lkotlin/TypeCastException;
        //   357: dup            
        //   358: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   360: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   363: athrow         
        //   364: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   367: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getBossColorModifierPrev:()F
        //   372: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   375: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   378: dup            
        //   379: ifnonnull       392
        //   382: new             Lkotlin/TypeCastException;
        //   385: dup            
        //   386: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   388: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   391: athrow         
        //   392: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   395: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getBossColorModifier:()F
        //   400: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   403: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   406: dup            
        //   407: ifnonnull       420
        //   410: new             Lkotlin/TypeCastException;
        //   413: dup            
        //   414: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   416: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   419: athrow         
        //   420: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   423: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getBossColorModifierPrev:()F
        //   428: fsub           
        //   429: fload_1         /* partialTicks */
        //   430: fmul           
        //   431: fadd           
        //   432: fstore          f11
        //   434: fload           f8
        //   436: fconst_1       
        //   437: fload           f11
        //   439: fsub           
        //   440: fmul           
        //   441: fload           f8
        //   443: ldc             0.7
        //   445: fmul           
        //   446: fload           f11
        //   448: fmul           
        //   449: fadd           
        //   450: fstore          f8
        //   452: fload           f9
        //   454: fconst_1       
        //   455: fload           f11
        //   457: fsub           
        //   458: fmul           
        //   459: fload           f9
        //   461: ldc             0.6
        //   463: fmul           
        //   464: fload           f11
        //   466: fmul           
        //   467: fadd           
        //   468: fstore          f9
        //   470: fload           f10
        //   472: fconst_1       
        //   473: fload           f11
        //   475: fsub           
        //   476: fmul           
        //   477: fload           f10
        //   479: ldc             0.6
        //   481: fmul           
        //   482: fload           f11
        //   484: fmul           
        //   485: fadd           
        //   486: fstore          f10
        //   488: aload_2         /* world */
        //   489: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //   492: dup            
        //   493: ldc             "world.provider"
        //   495: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   498: invokevirtual   net/minecraft/world/WorldProvider.func_186058_p:()Lnet/minecraft/world/DimensionType;
        //   501: dup            
        //   502: ldc             "world.provider.dimensionType"
        //   504: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   507: invokevirtual   net/minecraft/world/DimensionType.func_186068_a:()I
        //   510: iconst_1       
        //   511: if_icmpne       544
        //   514: ldc             0.22
        //   516: fload           f3
        //   518: ldc             0.75
        //   520: fmul           
        //   521: fadd           
        //   522: fstore          f8
        //   524: ldc             0.28
        //   526: fload           f6
        //   528: ldc             0.75
        //   530: fmul           
        //   531: fadd           
        //   532: fstore          f9
        //   534: ldc             0.25
        //   536: fload           f7
        //   538: ldc             0.75
        //   540: fmul           
        //   541: fadd           
        //   542: fstore          f10
        //   544: iconst_3       
        //   545: newarray        F
        //   547: dup            
        //   548: iconst_0       
        //   549: fload           f8
        //   551: fastore        
        //   552: dup            
        //   553: iconst_1       
        //   554: fload           f9
        //   556: fastore        
        //   557: dup            
        //   558: iconst_2       
        //   559: fload           f10
        //   561: fastore        
        //   562: astore          colors
        //   564: aload_2         /* world */
        //   565: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //   568: fload_1         /* partialTicks */
        //   569: fload_3         /* f */
        //   570: fload           f2
        //   572: fload           f3
        //   574: aload           colors
        //   576: invokevirtual   net/minecraft/world/WorldProvider.getLightmapColors:(FFFF[F)V
        //   579: aload           colors
        //   581: iconst_0       
        //   582: faload         
        //   583: fstore          f8
        //   585: aload           colors
        //   587: iconst_1       
        //   588: faload         
        //   589: fstore          f9
        //   591: aload           colors
        //   593: iconst_2       
        //   594: faload         
        //   595: fstore          f10
        //   597: fload           f8
        //   599: fconst_0       
        //   600: fconst_1       
        //   601: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //   604: fstore          f8
        //   606: fload           f9
        //   608: fconst_0       
        //   609: fconst_1       
        //   610: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //   613: fstore          f9
        //   615: fload           f10
        //   617: fconst_0       
        //   618: fconst_1       
        //   619: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //   622: fstore          f10
        //   624: aload_0         /* this */
        //   625: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //   628: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   631: getstatic       net/minecraft/init/MobEffects.field_76439_r:Lnet/minecraft/potion/Potion;
        //   634: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70644_a:(Lnet/minecraft/potion/Potion;)Z
        //   637: ifeq            773
        //   640: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   643: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   646: dup            
        //   647: ifnonnull       660
        //   650: new             Lkotlin/TypeCastException;
        //   653: dup            
        //   654: ldc             "null cannot be cast to non-null type dev.nuker.pyro.mixin.EntityRendererAccessor"
        //   656: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   659: athrow         
        //   660: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   663: aload_0         /* this */
        //   664: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //   667: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   670: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //   673: fload_1         /* partialTicks */
        //   674: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.invokeGetNightVisionBrightness:(Lnet/minecraft/entity/EntityLivingBase;F)F
        //   679: fstore          f15
        //   681: fconst_1       
        //   682: fload           f8
        //   684: fdiv           
        //   685: fstore          f12
        //   687: fload           f12
        //   689: fconst_1       
        //   690: fload           f9
        //   692: fdiv           
        //   693: fcmpl          
        //   694: ifle            703
        //   697: fconst_1       
        //   698: fload           f9
        //   700: fdiv           
        //   701: fstore          f12
        //   703: fload           f12
        //   705: fconst_1       
        //   706: fload           f10
        //   708: fdiv           
        //   709: fcmpl          
        //   710: ifle            719
        //   713: fconst_1       
        //   714: fload           f10
        //   716: fdiv           
        //   717: fstore          f12
        //   719: fload           f8
        //   721: fconst_1       
        //   722: fload           f15
        //   724: fsub           
        //   725: fmul           
        //   726: fload           f8
        //   728: fload           f12
        //   730: fmul           
        //   731: fload           f15
        //   733: fmul           
        //   734: fadd           
        //   735: fstore          f8
        //   737: fload           f9
        //   739: fconst_1       
        //   740: fload           f15
        //   742: fsub           
        //   743: fmul           
        //   744: fload           f9
        //   746: fload           f12
        //   748: fmul           
        //   749: fload           f15
        //   751: fmul           
        //   752: fadd           
        //   753: fstore          f9
        //   755: fload           f10
        //   757: fconst_1       
        //   758: fload           f15
        //   760: fsub           
        //   761: fmul           
        //   762: fload           f10
        //   764: fload           f12
        //   766: fmul           
        //   767: fload           f15
        //   769: fmul           
        //   770: fadd           
        //   771: fstore          f10
        //   773: fload           f8
        //   775: fconst_1       
        //   776: fcmpl          
        //   777: ifle            783
        //   780: fconst_1       
        //   781: fstore          f8
        //   783: fload           f9
        //   785: fconst_1       
        //   786: fcmpl          
        //   787: ifle            793
        //   790: fconst_1       
        //   791: fstore          f9
        //   793: fload           f10
        //   795: fconst_1       
        //   796: fcmpl          
        //   797: ifle            803
        //   800: fconst_1       
        //   801: fstore          f10
        //   803: aload_0         /* this */
        //   804: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //   807: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   810: getfield        net/minecraft/client/settings/GameSettings.field_74333_Y:F
        //   813: fstore          f16
        //   815: fconst_1       
        //   816: fload           f8
        //   818: fsub           
        //   819: fstore          f17
        //   821: fconst_1       
        //   822: fload           f9
        //   824: fsub           
        //   825: fstore          f13
        //   827: fconst_1       
        //   828: fload           f10
        //   830: fsub           
        //   831: fstore          f14
        //   833: fconst_1       
        //   834: fload           f17
        //   836: fload           f17
        //   838: fmul           
        //   839: fload           f17
        //   841: fmul           
        //   842: fload           f17
        //   844: fmul           
        //   845: fsub           
        //   846: fstore          f17
        //   848: fconst_1       
        //   849: fload           f13
        //   851: fload           f13
        //   853: fmul           
        //   854: fload           f13
        //   856: fmul           
        //   857: fload           f13
        //   859: fmul           
        //   860: fsub           
        //   861: fstore          f13
        //   863: fconst_1       
        //   864: fload           f14
        //   866: fload           f14
        //   868: fmul           
        //   869: fload           f14
        //   871: fmul           
        //   872: fload           f14
        //   874: fmul           
        //   875: fsub           
        //   876: fstore          f14
        //   878: fload           f8
        //   880: fconst_1       
        //   881: fload           f16
        //   883: fsub           
        //   884: fmul           
        //   885: fload           f17
        //   887: fload           f16
        //   889: fmul           
        //   890: fadd           
        //   891: fstore          f8
        //   893: fload           f9
        //   895: fconst_1       
        //   896: fload           f16
        //   898: fsub           
        //   899: fmul           
        //   900: fload           f13
        //   902: fload           f16
        //   904: fmul           
        //   905: fadd           
        //   906: fstore          f9
        //   908: fload           f10
        //   910: fconst_1       
        //   911: fload           f16
        //   913: fsub           
        //   914: fmul           
        //   915: fload           f14
        //   917: fload           f16
        //   919: fmul           
        //   920: fadd           
        //   921: fstore          f10
        //   923: fload           f8
        //   925: ldc             0.96
        //   927: fmul           
        //   928: ldc             0.03
        //   930: fadd           
        //   931: fstore          f8
        //   933: fload           f9
        //   935: ldc             0.96
        //   937: fmul           
        //   938: ldc             0.03
        //   940: fadd           
        //   941: fstore          f9
        //   943: fload           f10
        //   945: ldc             0.96
        //   947: fmul           
        //   948: ldc             0.03
        //   950: fadd           
        //   951: fstore          f10
        //   953: fload           f8
        //   955: fconst_1       
        //   956: fcmpl          
        //   957: ifle            963
        //   960: fconst_1       
        //   961: fstore          f8
        //   963: fload           f9
        //   965: fconst_1       
        //   966: fcmpl          
        //   967: ifle            973
        //   970: fconst_1       
        //   971: fstore          f9
        //   973: fload           f10
        //   975: fconst_1       
        //   976: fcmpl          
        //   977: ifle            983
        //   980: fconst_1       
        //   981: fstore          f10
        //   983: fload           f8
        //   985: fconst_0       
        //   986: fcmpg          
        //   987: ifge            993
        //   990: fconst_0       
        //   991: fstore          f8
        //   993: fload           f9
        //   995: fconst_0       
        //   996: fcmpg          
        //   997: ifge            1003
        //  1000: fconst_0       
        //  1001: fstore          f9
        //  1003: fload           f10
        //  1005: fconst_0       
        //  1006: fcmpg          
        //  1007: ifge            1013
        //  1010: fconst_0       
        //  1011: fstore          f10
        //  1013: sipush          255
        //  1016: istore          j
        //  1018: fload           f8
        //  1020: ldc             255.0
        //  1022: fmul           
        //  1023: f2i            
        //  1024: istore          k
        //  1026: fload           f9
        //  1028: ldc             255.0
        //  1030: fmul           
        //  1031: f2i            
        //  1032: istore          l
        //  1034: fload           f10
        //  1036: ldc             255.0
        //  1038: fmul           
        //  1039: f2i            
        //  1040: istore          i1
        //  1042: aload_0         /* this */
        //  1043: getfield        dev/nuker/pyro/PyroLightmap.lightmapColors:[I
        //  1046: iload           i
        //  1048: aload_0         /* this */
        //  1049: iload           k
        //  1051: iload           l
        //  1053: iload           i1
        //  1055: invokespecial   dev/nuker/pyro/PyroLightmap.modifyColor:(III)I
        //  1058: iastore        
        //  1059: iinc            i, 1
        //  1062: goto            50
        //  1065: aload_0         /* this */
        //  1066: getfield        dev/nuker/pyro/PyroLightmap.lightmapTexture:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //  1069: invokevirtual   net/minecraft/client/renderer/texture/DynamicTexture.func_110564_a:()V
        //  1072: aload_0         /* this */
        //  1073: getfield        dev/nuker/pyro/PyroLightmap.mc:Lnet/minecraft/client/Minecraft;
        //  1076: getfield        net/minecraft/client/Minecraft.field_71424_I:Lnet/minecraft/profiler/Profiler;
        //  1079: invokevirtual   net/minecraft/profiler/Profiler.func_76319_b:()V
        //  1082: return         
        //    StackMapTable: 00 19 FF 00 32 00 07 07 00 03 02 07 00 4D 02 02 01 01 00 00 FF 00 45 00 08 07 00 03 02 07 00 4D 02 02 01 01 02 00 02 02 07 01 0E FC 00 2C 02 FF 00 91 00 10 07 00 03 02 07 00 4D 02 02 01 01 02 02 02 02 02 02 02 02 02 00 00 53 07 01 0E 60 07 01 0E FF 00 1B 00 10 07 00 03 02 07 00 4D 02 02 01 01 02 02 02 02 02 02 02 02 02 00 02 02 07 01 0E FF 00 1B 00 10 07 00 03 02 07 00 4D 02 02 01 01 02 02 02 02 02 02 02 02 02 00 03 02 02 07 01 0E FB 00 43 37 FF 00 73 00 11 07 00 03 02 07 00 4D 02 02 01 01 02 02 02 02 02 02 02 02 02 07 01 0F 00 01 07 01 0E FD 00 2A 02 02 0F F9 00 35 09 09 09 FF 00 9F 00 15 07 00 03 02 07 00 4D 02 02 01 01 02 02 02 02 02 02 02 02 02 07 01 0F 02 02 02 02 00 00 09 09 09 09 09 FF 00 33 00 07 07 00 03 02 07 00 4D 02 02 01 01 00 00 FF 00 10 00 03 07 00 03 02 07 00 4D 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final int modifyColor(final int r, final int g, final int b) {
        return new Color(r, g, b, f4N.c.0()).getRGB();
    }
    
    public final void enableLightmap() {
        GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
        GlStateManager.func_179128_n(5890);
        GlStateManager.func_179096_D();
        final float f = 0.00390625f;
        GlStateManager.func_179152_a(0.00390625f, 0.00390625f, 0.00390625f);
        GlStateManager.func_179109_b(8.0f, 8.0f, 8.0f);
        GlStateManager.func_179128_n(5888);
        this.mc.func_110434_K().func_110577_a(this.locationLightMap);
        GlStateManager.func_187421_b(3553, 10241, 9729);
        GlStateManager.func_187421_b(3553, 10240, 9729);
        GlStateManager.func_187421_b(3553, 10242, 10496);
        GlStateManager.func_187421_b(3553, 10243, 10496);
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.func_179098_w();
        GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
    }
    
    @NotNull
    public final Minecraft getMc() {
        return this.mc;
    }
    
    public PyroLightmap(@NotNull final Minecraft mc) {
        Intrinsics.checkParameterIsNotNull(mc, "mc");
        this.mc = mc;
        this.lightmapTexture = new DynamicTexture(16, 16);
        final int[] func_110565_c = this.lightmapTexture.func_110565_c();
        Intrinsics.checkExpressionValueIsNotNull(func_110565_c, "this.lightmapTexture.textureData");
        this.lightmapColors = func_110565_c;
        final ResourceLocation func_110578_a = this.mc.func_110434_K().func_110578_a("pyroBlockLightMap", this.lightmapTexture);
        Intrinsics.checkExpressionValueIsNotNull(func_110578_a, "mc.textureManager.getDyn\u2026p\", this.lightmapTexture)");
        this.locationLightMap = func_110578_a;
    }
    
    static {
        Companion = new PyroLightmap$Companion(null);
    }
}
