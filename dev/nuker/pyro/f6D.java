// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.function.Consumer;
import net.minecraft.item.ItemStack;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f6D extends fH
{
    @NotNull
    public f0d c;
    @NotNull
    public f0a c;
    @NotNull
    public fbu c;
    public boolean c;
    
    public f6D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23ce\u1496\u8acb\ub3d0\uc9bf\uedd6"
        //     3: getstatic       dev/nuker/pyro/fc.1:I
        //     6: ifeq            14
        //     9: ldc             1864319159
        //    11: goto            16
        //    14: ldc             -1163557758
        //    16: ldc             -861009300
        //    18: ixor           
        //    19: lookupswitch {
        //          -1548662053: 14
        //          1980468974: 44
        //          default: 361
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u23ee\u1496\u8acb\ub3d0\uc9bf\uedd6"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: ldc             "\u23ee\u1496\u8add\ub3d5\uc9b6\uedd4\ub22d\ue6f3\ud960\ue9c5\ua709\u1e0c\ue1dd\uc5a8\u8152\u8953\u57e4\u772d\ubd32\uc068\u2b2c\uc23a\u6a3f\u2d16\ud7ab\u35bf\u7d6b\u899a\u8019\u8ce2\u84dc\ufb21\u70e6\u9a17\u1bf6\uf150\u493c\u8848\uca95\uff17\ub6e7\u41fc\ub9d9\ub358\u4c04\u8add\u7c60\uce07\u7d42\ueab7\ue6a4\u16de\uee64\u3781\u46d7\ue180\u0a0e\u86fe\u19c0\u0f20\u7761\u7284\uc7c4\ubbac\u9aa8\u6a27\ue2f2\ud01b\ua53f\u25a4"
        //    54: getstatic       dev/nuker/pyro/fc.c:I
        //    57: ifge            65
        //    60: ldc             -680219498
        //    62: goto            67
        //    65: ldc             -92311837
        //    67: ldc             1612247384
        //    69: ixor           
        //    70: lookupswitch {
        //          -1704484933: 96
        //          -1217634866: 65
        //          default: 369
        //        }
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: getstatic       dev/nuker/pyro/fc.1:I
        //   102: ifeq            110
        //   105: ldc             -1779982770
        //   107: goto            112
        //   110: ldc             1793936669
        //   112: ldc             -890971240
        //   114: ixor           
        //   115: lookupswitch {
        //          -1609984379: 140
        //          1594050006: 110
        //          default: 365
        //        }
        //   140: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   143: aload_0        
        //   144: aload_0        
        //   145: new             Ldev/nuker/pyro/f0d;
        //   148: dup            
        //   149: ldc             "\u23d8\u1496\u8ac1\ub3d8\uc9aa"
        //   151: invokestatic    invokestatic   !!! ERROR
        //   154: ldc             "\u23f8\u1496\u8ac1\ub3d8\uc9aa"
        //   156: invokestatic    invokestatic   !!! ERROR
        //   159: aconst_null    
        //   160: dconst_1       
        //   161: dconst_0       
        //   162: ldc2_w          5.0
        //   165: dconst_0       
        //   166: bipush          64
        //   168: aconst_null    
        //   169: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   172: checkcast       Ldev/nuker/pyro/f0n;
        //   175: invokevirtual   dev/nuker/pyro/f6D.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   178: checkcast       Ldev/nuker/pyro/f0d;
        //   181: putfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/f0d;
        //   184: aload_0        
        //   185: aload_0        
        //   186: new             Ldev/nuker/pyro/f0a;
        //   189: dup            
        //   190: ldc             "\u23d5\u149d\u8ae4\ub3d7\uc9a5\ueddf\ub22a\ue6f4\ud967\ue9d2\ua703"
        //   192: getstatic       dev/nuker/pyro/fc.1:I
        //   195: ifeq            203
        //   198: ldc             -1222863935
        //   200: goto            205
        //   203: ldc             1186011491
        //   205: ldc             -1483638024
        //   207: ixor           
        //   208: lookupswitch {
        //          -517971045: 236
        //          277735737: 203
        //          default: 359
        //        }
        //   236: invokestatic    invokestatic   !!! ERROR
        //   239: ldc             "\u23f5\u149d\u8ae4\ub3d7\uc9a5\ueddf\ub22a\ue6f4\ud967\ue9d2\ua703"
        //   241: invokestatic    invokestatic   !!! ERROR
        //   244: aconst_null    
        //   245: iconst_1       
        //   246: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   249: checkcast       Ldev/nuker/pyro/f0n;
        //   252: invokevirtual   dev/nuker/pyro/f6D.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   255: checkcast       Ldev/nuker/pyro/f0a;
        //   258: putfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/f0a;
        //   261: getstatic       dev/nuker/pyro/fc.c:I
        //   264: ifge            272
        //   267: ldc             1948558637
        //   269: goto            274
        //   272: ldc             983449809
        //   274: ldc             -634762402
        //   276: ixor           
        //   277: lookupswitch {
        //          -1374753165: 367
        //          -949328960: 272
        //          default: 304
        //        }
        //   304: aload_0        
        //   305: new             Ldev/nuker/pyro/fbu;
        //   308: dup            
        //   309: getstatic       dev/nuker/pyro/fc.c:I
        //   312: ifge            320
        //   315: ldc             -920650442
        //   317: goto            322
        //   320: ldc             -1101043347
        //   322: ldc             119524784
        //   324: ixor           
        //   325: lookupswitch {
        //          -838848378: 363
        //          582264036: 320
        //          default: 352
        //        }
        //   352: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   355: putfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/fbu;
        //   358: return         
        //   359: aconst_null    
        //   360: athrow         
        //   361: aconst_null    
        //   362: athrow         
        //   363: aconst_null    
        //   364: athrow         
        //   365: aconst_null    
        //   366: athrow         
        //   367: aconst_null    
        //   368: athrow         
        //   369: aconst_null    
        //   370: athrow         
        //    StackMapTable: 00 18 FF 00 0E 00 01 06 00 02 06 07 00 5B FF 00 01 00 01 06 00 03 06 07 00 5B 01 FF 00 1B 00 01 06 00 02 06 07 00 5B FF 00 14 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B FF 00 01 00 01 06 00 05 06 07 00 5B 07 00 5B 07 00 5B 01 FF 00 1C 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B FF 00 0D 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B FF 00 01 00 01 06 00 05 06 07 00 5B 07 00 5B 07 00 5B 01 FF 00 1B 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B FF 00 3E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 BA 08 00 BA 07 00 5B FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 BA 08 00 BA 07 00 5B 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 BA 08 00 BA 07 00 5B 23 41 01 1D FF 00 0F 00 01 07 00 03 00 03 07 00 03 08 01 31 08 01 31 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 31 08 01 31 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 08 01 31 08 01 31 FF 00 06 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 BA 08 00 BA 07 00 5B FF 00 01 00 01 06 00 02 06 07 00 5B FF 00 01 00 01 07 00 03 00 03 07 00 03 08 01 31 08 01 31 FF 00 01 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 06 00 04 06 07 00 5B 07 00 5B 07 00 5B
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Invalid BootstrapMethods attribute entry: 21 additional arguments required for method a.a, but only 0 specified.
        //     at com.strobel.assembler.ir.Error.invalidBootstrapMethodEntry(Error.java:244)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:280)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:261)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1134)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:128)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:626)
        //     at com.strobel.assembler.metadata.MethodReference.resolve(MethodReference.java:177)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2438)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    
    public void c(final boolean b) {
        fbS.4a(this, 228879186, b);
    }
    
    @NotNull
    public fbu 1() {
        return fbS.75(this, 35899465);
    }
    
    @NotNull
    public f0d 0() {
        return fbS.gk(this, 80923125);
    }
    
    @NotNull
    public f0a c() {
        return fbS.0u(this, 610432702);
    }
    
    public void c(@NotNull final fbu fbu) {
        fbS.5F(this, 290448768, fbu);
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          803
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            795
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            787
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            36
        //    31: ldc             -509659517
        //    33: goto            38
        //    36: ldc             -1114061626
        //    38: ldc             -746986295
        //    40: ixor           
        //    41: lookupswitch {
        //          853987914: 36
        //          1860247567: 68
        //          default: 762
        //        }
        //    68: getfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/fbu;
        //    71: aload_0        
        //    72: getfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/f0d;
        //    75: getstatic       dev/nuker/pyro/fc.c:I
        //    78: ifge            86
        //    81: ldc             368004223
        //    83: goto            88
        //    86: ldc             -601274109
        //    88: ldc             1488141300
        //    90: ixor           
        //    91: lookupswitch {
        //          -2070252809: 116
        //          1297905547: 86
        //          default: 764
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   123: goto            127
        //   126: athrow         
        //   127: checkcast       Ljava/lang/Number;
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   java/lang/Number.doubleValue:()D
        //   137: goto            141
        //   140: athrow         
        //   141: sipush          1000
        //   144: i2d            
        //   145: dmul           
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            157
        //   152: ldc             -858311134
        //   154: goto            159
        //   157: ldc             1522879689
        //   159: ldc             966580479
        //   161: ixor           
        //   162: lookupswitch {
        //          -179573027: 157
        //          1666815030: 188
        //          default: 766
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   195: goto            199
        //   198: athrow         
        //   199: ifne            203
        //   202: return         
        //   203: aload_0        
        //   204: getstatic       dev/nuker/pyro/fc.c:I
        //   207: ifge            215
        //   210: ldc             -393388100
        //   212: goto            217
        //   215: ldc             1525852393
        //   217: ldc             -1094573695
        //   219: ixor           
        //   220: lookupswitch {
        //          -1876367878: 215
        //          1448050237: 768
        //          default: 248
        //        }
        //   248: getfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/fbu;
        //   251: goto            255
        //   254: athrow         
        //   255: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   258: goto            262
        //   261: athrow         
        //   262: aload_0        
        //   263: getfield        dev/nuker/pyro/f6D.c:Z
        //   266: ifne            335
        //   269: getstatic       dev/nuker/pyro/fc.c:I
        //   272: ifge            280
        //   275: ldc             -42640365
        //   277: goto            282
        //   280: ldc             -961650018
        //   282: ldc             1600720165
        //   284: ixor           
        //   285: lookupswitch {
        //          -1714982981: 312
        //          -1575202506: 280
        //          default: 774
        //        }
        //   312: aload_0        
        //   313: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   316: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   319: dup            
        //   320: pop            
        //   321: goto            325
        //   324: athrow         
        //   325: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184587_cr:()Z
        //   328: goto            332
        //   331: athrow         
        //   332: ifeq            336
        //   335: return         
        //   336: aload_0        
        //   337: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   340: getstatic       dev/nuker/pyro/fc.c:I
        //   343: ifge            351
        //   346: ldc             45893610
        //   348: goto            353
        //   351: ldc             -1315523208
        //   353: ldc             -1180413192
        //   355: ixor           
        //   356: lookupswitch {
        //          -1156049646: 760
        //          798485135: 351
        //          default: 384
        //        }
        //   384: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   387: instanceof      Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   390: ifeq            394
        //   393: return         
        //   394: aload_0        
        //   395: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   398: getstatic       dev/nuker/pyro/fc.0:I
        //   401: ifeq            409
        //   404: ldc             -1720297941
        //   406: goto            411
        //   409: ldc             -1356697168
        //   411: ldc             410933751
        //   413: ixor           
        //   414: lookupswitch {
        //          -2130178084: 770
        //          -2076816902: 409
        //          default: 440
        //        }
        //   440: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   443: instanceof      Lnet/minecraft/client/gui/inventory/GuiInventory;
        //   446: ifeq            482
        //   449: aload_0        
        //   450: getfield        dev/nuker/pyro/f6D.c:Ldev/nuker/pyro/f0a;
        //   453: goto            457
        //   456: athrow         
        //   457: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   460: goto            464
        //   463: athrow         
        //   464: checkcast       Ljava/lang/Boolean;
        //   467: goto            471
        //   470: athrow         
        //   471: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   474: goto            478
        //   477: athrow         
        //   478: ifne            482
        //   481: return         
        //   482: iconst_0       
        //   483: istore_2       
        //   484: bipush          8
        //   486: istore_3       
        //   487: iload_2        
        //   488: iload_3        
        //   489: if_icmpgt       759
        //   492: aload_0        
        //   493: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   496: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   499: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   502: iload_2        
        //   503: goto            507
        //   506: athrow         
        //   507: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   510: goto            514
        //   513: athrow         
        //   514: astore          4
        //   516: aload           4
        //   518: dup            
        //   519: pop            
        //   520: goto            524
        //   523: athrow         
        //   524: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   527: goto            531
        //   530: athrow         
        //   531: ifne            753
        //   534: aload           4
        //   536: goto            540
        //   539: athrow         
        //   540: invokevirtual   net/minecraft/item/ItemStack.func_77985_e:()Z
        //   543: goto            547
        //   546: athrow         
        //   547: ifeq            555
        //   550: ldc             2080458650
        //   552: goto            557
        //   555: ldc             2080458651
        //   557: ldc             1539474164
        //   559: ixor           
        //   560: tableswitch {
        //          1334282972: 584
        //          1334282973: 753
        //          default: 550
        //        }
        //   584: aload           4
        //   586: goto            590
        //   589: athrow         
        //   590: invokevirtual   net/minecraft/item/ItemStack.func_190916_E:()I
        //   593: goto            597
        //   596: athrow         
        //   597: aload           4
        //   599: getstatic       dev/nuker/pyro/fc.1:I
        //   602: ifeq            610
        //   605: ldc             -1059189410
        //   607: goto            612
        //   610: ldc             -1807186538
        //   612: ldc             660863644
        //   614: ixor           
        //   615: lookupswitch {
        //          -1288995062: 640
        //          -406980670: 610
        //          default: 776
        //        }
        //   640: goto            644
        //   643: athrow         
        //   644: invokevirtual   net/minecraft/item/ItemStack.func_77976_d:()I
        //   647: goto            651
        //   650: athrow         
        //   651: if_icmpge       753
        //   654: getstatic       dev/nuker/pyro/fc.c:I
        //   657: ifge            665
        //   660: ldc             -304633956
        //   662: goto            667
        //   665: ldc             -205118985
        //   667: ldc_w           -768709608
        //   670: ixor           
        //   671: lookupswitch {
        //          568872431: 696
        //          1073335172: 665
        //          default: 772
        //        }
        //   696: aload_0        
        //   697: aload           4
        //   699: iload_2        
        //   700: bipush          36
        //   702: iadd           
        //   703: goto            707
        //   706: athrow         
        //   707: invokespecial   dev/nuker/pyro/f6D.c:(Lnet/minecraft/item/ItemStack;I)Z
        //   710: goto            714
        //   713: athrow         
        //   714: ifeq            723
        //   717: ldc_w           -1927376506
        //   720: goto            726
        //   723: ldc_w           -1927376505
        //   726: ldc_w           -1468929142
        //   729: ixor           
        //   730: tableswitch {
        //          1256125464: 752
        //          1256125465: 753
        //          default: 717
        //        }
        //   752: return         
        //   753: iinc            2, 1
        //   756: goto            487
        //   759: return         
        //   760: aconst_null    
        //   761: athrow         
        //   762: aconst_null    
        //   763: athrow         
        //   764: aconst_null    
        //   765: athrow         
        //   766: aconst_null    
        //   767: athrow         
        //   768: aconst_null    
        //   769: athrow         
        //   770: aconst_null    
        //   771: athrow         
        //   772: aconst_null    
        //   773: athrow         
        //   774: aconst_null    
        //   775: athrow         
        //   776: aconst_null    
        //   777: athrow         
        //   778: pop            
        //   779: goto            24
        //   782: pop            
        //   783: aconst_null    
        //   784: goto            778
        //   787: dup            
        //   788: ifnull          778
        //   791: checkcast       Ljava/lang/Throwable;
        //   794: athrow         
        //   795: dup            
        //   796: ifnull          782
        //   799: checkcast       Ljava/lang/Throwable;
        //   802: athrow         
        //   803: aconst_null    
        //   804: athrow         
        //    StackMapTable: 00 71 43 07 00 9B 04 FF 00 0B 00 00 00 01 07 00 9B FD 00 03 07 00 03 07 01 08 4B 07 00 03 FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 03 01 5D 07 00 03 FF 00 11 00 02 07 00 03 07 01 08 00 02 07 00 52 07 00 2F FF 00 01 00 02 07 00 03 07 01 08 00 03 07 00 52 07 00 2F 01 FF 00 1B 00 02 07 00 03 07 01 08 00 02 07 00 52 07 00 2F 42 07 00 81 FF 00 00 00 02 07 00 03 07 01 08 00 02 07 00 52 07 00 2F 45 07 00 9B FF 00 00 00 02 07 00 03 07 01 08 00 02 07 00 52 07 01 0A 45 07 00 87 FF 00 00 00 02 07 00 03 07 01 08 00 02 07 00 52 07 00 A7 45 07 00 9B FF 00 00 00 02 07 00 03 07 01 08 00 02 07 00 52 03 FF 00 0F 00 02 07 00 03 07 01 08 00 02 07 00 52 03 FF 00 01 00 02 07 00 03 07 01 08 00 03 07 00 52 03 01 FF 00 1C 00 02 07 00 03 07 01 08 00 02 07 00 52 03 42 07 00 9B FF 00 00 00 02 07 00 03 07 01 08 00 02 07 00 52 03 45 07 00 9B 40 01 03 4B 07 00 03 FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 03 01 5E 07 00 03 45 07 00 8D 40 07 00 52 45 07 00 9B 00 11 41 01 1D 4B 07 00 9B 40 07 00 C6 45 07 00 9B 40 01 02 00 4E 07 00 C0 FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 C0 01 5E 07 00 C0 09 4E 07 00 C0 FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 C0 01 5C 07 00 C0 FF 00 0F 00 00 00 01 07 00 9B FF 00 00 00 02 07 00 03 07 01 08 00 01 07 00 41 45 07 00 9B 40 07 01 0A 45 07 00 91 40 07 00 DB 45 07 00 9B 40 01 03 FD 00 04 01 01 52 07 00 9B FF 00 00 00 04 07 00 03 07 01 08 01 01 00 02 07 00 E4 01 45 07 00 9B 40 07 00 EA FF 00 08 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 01 07 00 89 40 07 00 EA 45 07 00 9B 40 01 47 07 00 9B 40 07 00 EA 45 07 00 9B 40 01 02 04 41 01 1A 44 07 00 9B 40 07 00 EA 45 07 00 9B 40 01 FF 00 0C 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 02 01 07 00 EA FF 00 01 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 03 01 07 00 EA 01 FF 00 1B 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 02 01 07 00 EA 42 07 00 8D FF 00 00 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 02 01 07 00 EA 45 07 00 9B FF 00 00 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 02 01 01 0D 41 01 1C 49 07 00 9B FF 00 00 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 03 07 00 03 07 00 EA 01 45 07 00 9B 40 01 02 05 42 01 19 00 FA 00 05 FF 00 00 00 02 07 00 03 07 01 08 00 01 07 00 C0 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 52 07 00 2F FF 00 01 00 02 07 00 03 07 01 08 00 02 07 00 52 03 41 07 00 03 41 07 00 C0 FE 00 01 01 01 07 00 EA F8 00 01 FF 00 01 00 05 07 00 03 07 01 08 01 01 07 00 EA 00 02 01 07 00 EA FF 00 01 00 02 07 00 03 07 01 08 00 01 07 00 9B 43 05 44 07 00 9B 47 05 47 07 00 9B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     787    795    Any
        //  787    795    787    795    Any
        //  803    805    3      8      Any
        //  119    126    126    127    Any
        //  119    126    119    120    Ljava/util/NoSuchElementException;
        //  119    126    126    127    Ljava/lang/EnumConstantNotPresentException;
        //  120    126    126    127    Ljava/lang/StringIndexOutOfBoundsException;
        //  119    126    3      8      Any
        //  133    140    140    141    Any
        //  133    140    133    134    Ljava/util/ConcurrentModificationException;
        //  133    140    140    141    Any
        //  133    140    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  133    140    140    141    Any
        //  191    198    198    199    Any
        //  191    198    191    192    Ljava/lang/IllegalArgumentException;
        //  192    198    3      8      Any
        //  192    198    3      8      Ljava/lang/NumberFormatException;
        //  192    198    191    192    Any
        //  254    261    261    262    Any
        //  254    261    261    262    Any
        //  254    261    254    255    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  255    261    261    262    Any
        //  254    261    261    262    Any
        //  324    331    331    332    Any
        //  325    331    324    325    Any
        //  325    331    324    325    Ljava/lang/UnsupportedOperationException;
        //  325    331    331    332    Ljava/lang/StringIndexOutOfBoundsException;
        //  324    331    331    332    Ljava/lang/ClassCastException;
        //  457    463    463    464    Any
        //  457    463    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  457    463    463    464    Ljava/lang/IllegalStateException;
        //  457    463    463    464    Any
        //  457    463    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  470    477    477    478    Any
        //  471    477    3      8      Any
        //  470    477    3      8      Any
        //  470    477    477    478    Ljava/lang/NegativeArraySizeException;
        //  470    477    470    471    Ljava/lang/ClassCastException;
        //  506    513    513    514    Any
        //  506    513    506    507    Any
        //  506    513    506    507    Ljava/lang/NumberFormatException;
        //  507    513    3      8      Any
        //  506    513    3      8      Any
        //  523    530    530    531    Any
        //  523    530    3      8      Any
        //  523    530    530    531    Any
        //  523    530    3      8      Ljava/util/ConcurrentModificationException;
        //  523    530    523    524    Ljava/lang/IllegalArgumentException;
        //  539    546    546    547    Any
        //  539    546    539    540    Any
        //  540    546    546    547    Ljava/lang/IllegalArgumentException;
        //  540    546    3      8      Any
        //  540    546    3      8      Any
        //  589    596    596    597    Any
        //  589    596    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  590    596    589    590    Any
        //  589    596    596    597    Ljava/lang/IllegalArgumentException;
        //  589    596    589    590    Any
        //  643    650    650    651    Any
        //  643    650    643    644    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  643    650    3      8      Any
        //  644    650    650    651    Any
        //  643    650    3      8      Any
        //  706    713    713    714    Any
        //  706    713    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  706    713    706    707    Ljava/lang/EnumConstantNotPresentException;
        //  707    713    3      8      Any
        //  707    713    706    707    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.remove(ArrayList.java:535)
        //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public boolean c(final ItemStack p0, final int p1) {
        public class f6C implements Consumer
        {
            public f6D c;
            
            public void c(final Boolean b) {
                fbS.3x(this, 1284819579, b);
            }
            
            static {
                throw t;
            }
            
            public f6C(final f6D c) {
                this.c = c;
                while (true) {
                    int n = 0;
                    Label_0019: {
                        if (fc.1 != 0) {
                            n = 1252793400;
                            break Label_0019;
                        }
                        n = -1114529156;
                    }
                    switch (n ^ 0x6836CD52) {
                        case 580571498: {
                            continue;
                        }
                        case -710447314: {}
                        default: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public void accept(final Object o) {
                fbS.2B(this, 1739692204, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          380
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            372
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            364
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           -1420791528
        //    33: goto            39
        //    36: ldc_w           -577532252
        //    39: ldc_w           1125793463
        //    42: ixor           
        //    43: lookupswitch {
        //          -397783121: 349
        //          -122679667: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: aload_1        
        //    70: goto            74
        //    73: athrow         
        //    74: invokespecial   dev/nuker/pyro/f6D.c:(Lnet/minecraft/item/ItemStack;)I
        //    77: goto            81
        //    80: athrow         
        //    81: istore_3       
        //    82: iload_3        
        //    83: iconst_m1      
        //    84: if_icmpeq       93
        //    87: ldc_w           -1650736115
        //    90: goto            96
        //    93: ldc_w           -1650736116
        //    96: ldc_w           560004791
        //    99: ixor           
        //   100: tableswitch {
        //          2046195060: 124
        //          2046195061: 345
        //          default: 87
        //        }
        //   124: aload_0        
        //   125: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   128: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   131: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   134: dup            
        //   135: pop            
        //   136: getstatic       dev/nuker/pyro/fc.0:I
        //   139: ifeq            148
        //   142: ldc_w           437851845
        //   145: goto            151
        //   148: ldc_w           128850063
        //   151: ldc_w           1314382510
        //   154: ixor           
        //   155: lookupswitch {
        //          1414460523: 353
        //          2088757377: 148
        //          default: 180
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   187: goto            191
        //   190: athrow         
        //   191: iload_3        
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   199: goto            203
        //   202: athrow         
        //   203: dup            
        //   204: pop            
        //   205: checkcast       Lnet/minecraft/item/ItemStack;
        //   208: astore          4
        //   210: aload_0        
        //   211: iconst_1       
        //   212: getstatic       dev/nuker/pyro/fc.c:I
        //   215: ifge            224
        //   218: ldc_w           1767640239
        //   221: goto            227
        //   224: ldc_w           -889997904
        //   227: ldc_w           454105779
        //   230: ixor           
        //   231: lookupswitch {
        //          -773673213: 256
        //          1917654556: 224
        //          default: 347
        //        }
        //   256: putfield        dev/nuker/pyro/f6D.c:Z
        //   259: getstatic       dev/nuker/pyro/fc.c:I
        //   262: ifge            271
        //   265: ldc_w           1487079093
        //   268: goto            274
        //   271: ldc_w           1978914300
        //   274: ldc_w           348037592
        //   277: ixor           
        //   278: lookupswitch {
        //          1277011821: 271
        //          1632465956: 304
        //          default: 351
        //        }
        //   304: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   307: iconst_0       
        //   308: iload_3        
        //   309: iconst_0       
        //   310: getstatic       net/minecraft/inventory/ClickType.QUICK_MOVE:Lnet/minecraft/inventory/ClickType;
        //   313: new             Ldev/nuker/pyro/f6C;
        //   316: dup            
        //   317: aload_0        
        //   318: goto            322
        //   321: athrow         
        //   322: invokespecial   dev/nuker/pyro/f6C.<init>:(Ldev/nuker/pyro/f6D;)V
        //   325: goto            329
        //   328: athrow         
        //   329: checkcast       Ljava/util/function/Consumer;
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //   339: goto            343
        //   342: athrow         
        //   343: iconst_1       
        //   344: ireturn        
        //   345: iconst_0       
        //   346: ireturn        
        //   347: aconst_null    
        //   348: athrow         
        //   349: aconst_null    
        //   350: athrow         
        //   351: aconst_null    
        //   352: athrow         
        //   353: aconst_null    
        //   354: athrow         
        //   355: pop            
        //   356: goto            24
        //   359: pop            
        //   360: aconst_null    
        //   361: goto            355
        //   364: dup            
        //   365: ifnull          355
        //   368: checkcast       Ljava/lang/Throwable;
        //   371: athrow         
        //   372: dup            
        //   373: ifnull          359
        //   376: checkcast       Ljava/lang/Throwable;
        //   379: athrow         
        //   380: aconst_null    
        //   381: athrow         
        //    StackMapTable: 00 32 FF 00 03 00 04 07 00 03 07 00 EA 01 01 00 01 07 00 9B FA 00 04 FF 00 0B 00 00 00 01 07 00 9B FE 00 03 07 00 03 07 00 EA 01 0B 42 01 1C FF 00 04 00 00 00 01 07 00 9B FF 00 00 00 03 07 00 03 07 00 EA 01 00 02 07 00 03 07 00 EA 45 07 00 9B 40 01 FC 00 05 01 05 42 01 1B 57 07 01 1E FF 00 02 00 04 07 00 03 07 00 EA 01 01 00 02 07 01 1E 01 5C 07 01 1E 42 07 01 45 40 07 01 1E 45 07 00 9B 40 07 01 24 FF 00 03 00 00 00 01 07 00 9B FF 00 00 00 04 07 00 03 07 00 EA 01 01 00 02 07 01 24 01 45 07 00 9B 40 07 01 0A FF 00 14 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 03 01 FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 03 07 00 03 01 01 FF 00 1C 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 03 01 0E 42 01 1D 50 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 08 07 01 30 01 01 01 07 01 35 08 01 39 08 01 39 07 00 03 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 06 07 01 30 01 01 01 07 01 35 07 01 3B 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 06 07 01 30 01 01 01 07 01 35 07 01 40 45 07 00 9B 00 FA 00 01 FF 00 01 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 03 01 F9 00 01 FD 00 01 01 07 00 EA FF 00 01 00 04 07 00 03 07 00 EA 01 01 00 01 07 01 1E FF 00 01 00 03 07 00 03 07 00 EA 01 00 01 07 00 9B 43 05 44 07 00 9B 47 05 FF 00 07 00 04 07 00 03 07 00 EA 01 01 00 01 07 00 9B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     364    372    Any
        //  364    372    364    372    Ljava/lang/EnumConstantNotPresentException;
        //  380    382    3      8      Ljava/lang/ClassCastException;
        //  74     80     80     81     Any
        //  74     80     80     81     Any
        //  74     80     80     81     Any
        //  74     80     80     81     Any
        //  74     80     80     81     Any
        //  183    190    190    191    Any
        //  183    190    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  183    190    183    184    Ljava/lang/IllegalArgumentException;
        //  184    190    190    191    Ljava/util/ConcurrentModificationException;
        //  183    190    183    184    Ljava/util/NoSuchElementException;
        //  196    202    202    203    Any
        //  196    202    3      8      Any
        //  196    202    3      8      Any
        //  196    202    202    203    Ljava/lang/NullPointerException;
        //  196    202    202    203    Any
        //  321    328    328    329    Any
        //  321    328    3      8      Any
        //  322    328    321    322    Any
        //  321    328    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  322    328    3      8      Any
        //  335    342    342    343    Any
        //  336    342    342    343    Ljava/lang/NullPointerException;
        //  336    342    335    336    Ljava/lang/NumberFormatException;
        //  336    342    3      8      Ljava/util/NoSuchElementException;
        //  336    342    335    336    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.remove(ArrayList.java:535)
        //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    static {
        throw t;
    }
    
    public int c(final ItemStack p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1459
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1451
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1443
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: ifnonnull       36
        //    34: iconst_0       
        //    35: ireturn        
        //    36: iconst_0       
        //    37: istore_2       
        //    38: aload_0        
        //    39: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            54
        //    48: ldc_w           1047657622
        //    51: goto            57
        //    54: ldc_w           -1667554170
        //    57: ldc_w           204108554
        //    60: ixor           
        //    61: lookupswitch {
        //          737476826: 54
        //          844861340: 1410
        //          default: 88
        //        }
        //    88: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    91: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //    94: dup            
        //    95: pop            
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   103: goto            107
        //   106: athrow         
        //   107: dup            
        //   108: pop            
        //   109: checkcast       Ljava/util/Collection;
        //   112: goto            116
        //   115: athrow         
        //   116: invokeinterface java/util/Collection.size:()I
        //   121: goto            125
        //   124: athrow         
        //   125: istore_3       
        //   126: iload_2        
        //   127: getstatic       dev/nuker/pyro/fc.1:I
        //   130: ifeq            139
        //   133: ldc_w           1804870193
        //   136: goto            142
        //   139: ldc_w           -1505732006
        //   142: ldc_w           1650690948
        //   145: ixor           
        //   146: lookupswitch {
        //          167225781: 1412
        //          1268808056: 139
        //          default: 172
        //        }
        //   172: iload_3        
        //   173: if_icmpge       1400
        //   176: getstatic       dev/nuker/pyro/fc.1:I
        //   179: ifeq            188
        //   182: ldc_w           -279386123
        //   185: goto            191
        //   188: ldc_w           1801472268
        //   191: ldc_w           326288874
        //   194: ixor           
        //   195: lookupswitch {
        //          -2130851375: 188
        //          -64347617: 1406
        //          default: 220
        //        }
        //   220: iload_2        
        //   221: ifeq            1394
        //   224: iload_2        
        //   225: iconst_5       
        //   226: if_icmpeq       1394
        //   229: getstatic       dev/nuker/pyro/fc.c:I
        //   232: ifge            241
        //   235: ldc_w           -209233047
        //   238: goto            244
        //   241: ldc_w           -1610314831
        //   244: ldc_w           -566701080
        //   247: ixor           
        //   248: lookupswitch {
        //          -1886673843: 241
        //          767527041: 1402
        //          default: 276
        //        }
        //   276: iload_2        
        //   277: bipush          6
        //   279: if_icmpeq       1394
        //   282: iload_2        
        //   283: bipush          7
        //   285: if_icmpeq       1394
        //   288: getstatic       dev/nuker/pyro/fc.0:I
        //   291: ifeq            300
        //   294: ldc_w           -2040229325
        //   297: goto            303
        //   300: ldc_w           -1545705372
        //   303: ldc_w           292655252
        //   306: ixor           
        //   307: lookupswitch {
        //          -1760230745: 1424
        //          1803762239: 300
        //          default: 332
        //        }
        //   332: iload_2        
        //   333: bipush          8
        //   335: if_icmpne       341
        //   338: goto            1394
        //   341: iload_2        
        //   342: bipush          35
        //   344: if_icmple       350
        //   347: goto            1400
        //   350: getstatic       dev/nuker/pyro/fc.c:I
        //   353: ifge            362
        //   356: ldc_w           366786778
        //   359: goto            365
        //   362: ldc_w           -664510249
        //   365: ldc_w           2099221988
        //   368: ixor           
        //   369: lookupswitch {
        //          -335553391: 362
        //          1757621566: 1426
        //          default: 396
        //        }
        //   396: aload_0        
        //   397: getfield        dev/nuker/pyro/f6D.c:Lnet/minecraft/client/Minecraft;
        //   400: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   403: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   406: dup            
        //   407: pop            
        //   408: getstatic       dev/nuker/pyro/fc.0:I
        //   411: ifeq            420
        //   414: ldc_w           830429830
        //   417: goto            423
        //   420: ldc_w           878608978
        //   423: ldc_w           1926224447
        //   426: ixor           
        //   427: lookupswitch {
        //          -1173782743: 420
        //          1135640761: 1416
        //          default: 452
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   459: goto            463
        //   462: athrow         
        //   463: iload_2        
        //   464: goto            468
        //   467: athrow         
        //   468: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   471: goto            475
        //   474: athrow         
        //   475: dup            
        //   476: pop            
        //   477: checkcast       Lnet/minecraft/item/ItemStack;
        //   480: astore          4
        //   482: getstatic       dev/nuker/pyro/fc.c:I
        //   485: ifge            494
        //   488: ldc_w           1213412585
        //   491: goto            497
        //   494: ldc_w           2118237251
        //   497: ldc_w           128217595
        //   500: ixor           
        //   501: lookupswitch {
        //          1015140854: 494
        //          1341605138: 1432
        //          default: 528
        //        }
        //   528: aload           4
        //   530: goto            534
        //   533: athrow         
        //   534: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   537: goto            541
        //   540: athrow         
        //   541: ifeq            547
        //   544: goto            1394
        //   547: aload           4
        //   549: goto            553
        //   552: athrow         
        //   553: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   556: goto            560
        //   559: athrow         
        //   560: aload_1        
        //   561: goto            565
        //   564: athrow         
        //   565: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   568: goto            572
        //   571: athrow         
        //   572: goto            576
        //   575: athrow         
        //   576: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   579: goto            583
        //   582: athrow         
        //   583: ifeq            1394
        //   586: aload           4
        //   588: goto            592
        //   591: athrow         
        //   592: invokevirtual   net/minecraft/item/ItemStack.func_82833_r:()Ljava/lang/String;
        //   595: goto            599
        //   598: athrow         
        //   599: aload_1        
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   net/minecraft/item/ItemStack.func_82833_r:()Ljava/lang/String;
        //   607: goto            611
        //   610: athrow         
        //   611: getstatic       dev/nuker/pyro/fc.1:I
        //   614: ifeq            623
        //   617: ldc_w           -775107902
        //   620: goto            626
        //   623: ldc_w           4029967
        //   626: ldc_w           1569459875
        //   629: ixor           
        //   630: lookupswitch {
        //          -1941912479: 1420
        //          -1560018369: 623
        //          default: 656
        //        }
        //   656: goto            660
        //   659: athrow         
        //   660: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   663: goto            667
        //   666: athrow         
        //   667: ifeq            1394
        //   670: aload           4
        //   672: goto            676
        //   675: athrow         
        //   676: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   679: goto            683
        //   682: athrow         
        //   683: instanceof      Lnet/minecraft/item/ItemBlock;
        //   686: ifeq            1274
        //   689: aload           4
        //   691: goto            695
        //   694: athrow         
        //   695: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   698: goto            702
        //   701: athrow         
        //   702: dup            
        //   703: ifnonnull       736
        //   706: new             Lkotlin/TypeCastException;
        //   709: dup            
        //   710: ldc_w           "\u23d2\u1486\u8ac1\ub1c4\ucfe2\uedd9\ub225\ue6ee\udb77\uefde\ua70e\u1e0c\ue1c6\uc7b3\u8716\u8942\u57a5\u7736\ubf38\uc62d\u2b3a\uc234\u6a6d\u2f49\ud1bc\u35b7\u7d66\u8980\u8215\u8afa\u8490\ufb72\u70e6\u981e\u1df4\uf15e\u493c\u884f\uc892\uf952\ub6aa\u41fe\ub9dd\ub157\u4a11\u8aca\u7c7b\uce04\u7f59\uecb7\ue6aa\u16d1\uee62\u359a\u40c6\ue18e\u0a3e\u86e5\u1bc1\u092e\u7703\u7281\uc7c5\ub9a8\u9cb7"
        //   713: goto            717
        //   716: athrow         
        //   717: invokestatic    invokestatic   !!! ERROR
        //   720: goto            724
        //   723: athrow         
        //   724: goto            728
        //   727: athrow         
        //   728: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   731: goto            735
        //   734: athrow         
        //   735: athrow         
        //   736: checkcast       Lnet/minecraft/item/ItemBlock;
        //   739: getstatic       dev/nuker/pyro/fc.c:I
        //   742: ifge            751
        //   745: ldc_w           -1342708965
        //   748: goto            754
        //   751: ldc_w           771534582
        //   754: ldc_w           711710970
        //   757: ixor           
        //   758: lookupswitch {
        //          -2053358623: 751
        //          127366668: 784
        //          default: 1422
        //        }
        //   784: goto            788
        //   787: athrow         
        //   788: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //   791: goto            795
        //   794: athrow         
        //   795: dup            
        //   796: ifnonnull       805
        //   799: ldc_w           889029388
        //   802: goto            808
        //   805: ldc_w           889029389
        //   808: ldc_w           183211238
        //   811: ixor           
        //   812: tableswitch {
        //          2083270612: 836
        //          2083270613: 911
        //          default: 799
        //        }
        //   836: new             Lkotlin/TypeCastException;
        //   839: dup            
        //   840: ldc_w           "\u23d2\u1486\u8ac1\ub1c4\ucfe2\uedd9\ub225\ue6ee\udb77\uefde\ua70e\u1e0c\ue1c6\uc7b3\u8716\u8942\u57a5\u7736\ubf38\uc62d\u2b3a\uc234\u6a6d\u2f49\ud1bc\u35b7\u7d66\u8980\u8215\u8afa\u8490\ufb72\u70e6\u981e\u1df4\uf15e\u493c\u8845\uc892\uf950\ub6aa\u41fd\ub9c1\ub152\u4a11\u8adb\u7c27\uce15\u7f46\uecb1\ue6eb\u1696\uee7b\u3596\u40d3\ue1c9\u0a19\u86bf\u1be6\u092f\u772e\u728e\uc7c1\ub98a\u9cbf\u6a2a\ue2e3\ud007\ua72f\u23a3\u8998"
        //   843: getstatic       dev/nuker/pyro/fc.c:I
        //   846: ifge            855
        //   849: ldc_w           1770202442
        //   852: goto            858
        //   855: ldc_w           1981735297
        //   858: ldc_w           794244894
        //   861: ixor           
        //   862: lookupswitch {
        //          -1392440689: 855
        //          1188303444: 1408
        //          default: 888
        //        }
        //   888: goto            892
        //   891: athrow         
        //   892: invokestatic    invokestatic   !!! ERROR
        //   895: goto            899
        //   898: athrow         
        //   899: goto            903
        //   902: athrow         
        //   903: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   906: goto            910
        //   909: athrow         
        //   910: athrow         
        //   911: checkcast       Ldev/nuker/pyro/mixin/BlockAccessor;
        //   914: getstatic       dev/nuker/pyro/fc.1:I
        //   917: ifeq            926
        //   920: ldc_w           711387539
        //   923: goto            929
        //   926: ldc_w           1282032129
        //   929: ldc_w           -2091764981
        //   932: ixor           
        //   933: lookupswitch {
        //          -1456153960: 926
        //          -818384630: 960
        //          default: 1418
        //        }
        //   960: astore          5
        //   962: aload_1        
        //   963: getstatic       dev/nuker/pyro/fc.1:I
        //   966: ifeq            975
        //   969: ldc_w           -2045760152
        //   972: goto            978
        //   975: ldc_w           -1477110001
        //   978: ldc_w           35543406
        //   981: ixor           
        //   982: lookupswitch {
        //          -2079427578: 1414
        //          715650666: 975
        //          default: 1008
        //        }
        //  1008: goto            1012
        //  1011: athrow         
        //  1012: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1015: goto            1019
        //  1018: athrow         
        //  1019: dup            
        //  1020: ifnonnull       1029
        //  1023: ldc_w           -1538486925
        //  1026: goto            1032
        //  1029: ldc_w           -1538486928
        //  1032: ldc_w           412307838
        //  1035: ixor           
        //  1036: tableswitch {
        //          2042607642: 1060
        //          2042607643: 1090
        //          default: 1023
        //        }
        //  1060: new             Lkotlin/TypeCastException;
        //  1063: dup            
        //  1064: ldc_w           "\u23d2\u1486\u8ac1\ub1c4\ucfe2\uedd9\ub225\ue6ee\udb77\uefde\ua70e\u1e0c\ue1c6\uc7b3\u8716\u8942\u57a5\u7736\ubf38\uc62d\u2b3a\uc234\u6a6d\u2f49\ud1bc\u35b7\u7d66\u8980\u8215\u8afa\u8490\ufb72\u70e6\u981e\u1df4\uf15e\u493c\u884f\uc892\uf952\ub6aa\u41fe\ub9dd\ub157\u4a11\u8aca\u7c7b\uce04\u7f59\uecb7\ue6aa\u16d1\uee62\u359a\u40c6\ue18e\u0a3e\u86e5\u1bc1\u092e\u7703\u7281\uc7c5\ub9a8\u9cb7"
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: invokestatic    invokestatic   !!! ERROR
        //  1074: goto            1078
        //  1077: athrow         
        //  1078: goto            1082
        //  1081: athrow         
        //  1082: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1085: goto            1089
        //  1088: athrow         
        //  1089: athrow         
        //  1090: checkcast       Lnet/minecraft/item/ItemBlock;
        //  1093: goto            1097
        //  1096: athrow         
        //  1097: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //  1100: goto            1104
        //  1103: athrow         
        //  1104: dup            
        //  1105: ifnonnull       1114
        //  1108: ldc_w           386103227
        //  1111: goto            1117
        //  1114: ldc_w           386103226
        //  1117: ldc_w           1754711903
        //  1120: ixor           
        //  1121: tableswitch {
        //          -13934136: 1144
        //          -13934135: 1220
        //          default: 1108
        //        }
        //  1144: new             Lkotlin/TypeCastException;
        //  1147: dup            
        //  1148: ldc_w           "\u23d2\u1486\u8ac1\ub1c4\ucfe2\uedd9\ub225\ue6ee\udb77\uefde\ua70e\u1e0c\ue1c6\uc7b3\u8716\u8942\u57a5\u7736\ubf38\uc62d\u2b3a\uc234\u6a6d\u2f49\ud1bc\u35b7\u7d66\u8980\u8215\u8afa\u8490\ufb72\u70e6\u981e\u1df4\uf15e\u493c\u8845\uc892\uf950\ub6aa\u41fd\ub9c1\ub152\u4a11\u8adb\u7c27\uce15\u7f46\uecb1\ue6eb\u1696\uee7b\u3596\u40d3\ue1c9\u0a19\u86bf\u1be6\u092f\u772e\u728e\uc7c1\ub98a\u9cbf\u6a2a\ue2e3\ud007\ua72f\u23a3\u8998"
        //  1151: goto            1155
        //  1154: athrow         
        //  1155: invokestatic    invokestatic   !!! ERROR
        //  1158: goto            1162
        //  1161: athrow         
        //  1162: getstatic       dev/nuker/pyro/fc.0:I
        //  1165: ifeq            1174
        //  1168: ldc_w           -146790026
        //  1171: goto            1177
        //  1174: ldc_w           2028070749
        //  1177: ldc_w           -196065100
        //  1180: ixor           
        //  1181: lookupswitch {
        //          -883913086: 1174
        //          51405250: 1428
        //          default: 1208
        //        }
        //  1208: goto            1212
        //  1211: athrow         
        //  1212: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: athrow         
        //  1220: checkcast       Ldev/nuker/pyro/mixin/BlockAccessor;
        //  1223: astore          6
        //  1225: aload           5
        //  1227: goto            1231
        //  1230: athrow         
        //  1231: invokeinterface dev/nuker/pyro/mixin/BlockAccessor.getMaterial:()Lnet/minecraft/block/material/Material;
        //  1236: goto            1240
        //  1239: athrow         
        //  1240: aload           6
        //  1242: goto            1246
        //  1245: athrow         
        //  1246: invokeinterface dev/nuker/pyro/mixin/BlockAccessor.getMaterial:()Lnet/minecraft/block/material/Material;
        //  1251: goto            1255
        //  1254: athrow         
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1262: goto            1266
        //  1265: athrow         
        //  1266: iconst_1       
        //  1267: ixor           
        //  1268: ifeq            1274
        //  1271: goto            1394
        //  1274: aload           4
        //  1276: goto            1280
        //  1279: athrow         
        //  1280: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //  1283: goto            1287
        //  1286: athrow         
        //  1287: aload_1        
        //  1288: getstatic       dev/nuker/pyro/fc.c:I
        //  1291: ifge            1300
        //  1294: ldc_w           -1639338153
        //  1297: goto            1303
        //  1300: ldc_w           2127254173
        //  1303: ldc_w           1813962660
        //  1306: ixor           
        //  1307: lookupswitch {
        //          -229150477: 1300
        //          315985209: 1332
        //          default: 1430
        //        }
        //  1332: goto            1336
        //  1335: athrow         
        //  1336: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: if_icmpne       1394
        //  1346: getstatic       dev/nuker/pyro/fc.0:I
        //  1349: ifeq            1358
        //  1352: ldc_w           630274832
        //  1355: goto            1361
        //  1358: ldc_w           1710442872
        //  1361: ldc_w           -2041601571
        //  1364: ixor           
        //  1365: lookupswitch {
        //          -1545692467: 1358
        //          -474158939: 1392
        //          default: 1404
        //        }
        //  1392: iload_2        
        //  1393: ireturn        
        //  1394: iinc            2, 1
        //  1397: goto            126
        //  1400: iconst_m1      
        //  1401: ireturn        
        //  1402: aconst_null    
        //  1403: athrow         
        //  1404: aconst_null    
        //  1405: athrow         
        //  1406: aconst_null    
        //  1407: athrow         
        //  1408: aconst_null    
        //  1409: athrow         
        //  1410: aconst_null    
        //  1411: athrow         
        //  1412: aconst_null    
        //  1413: athrow         
        //  1414: aconst_null    
        //  1415: athrow         
        //  1416: aconst_null    
        //  1417: athrow         
        //  1418: aconst_null    
        //  1419: athrow         
        //  1420: aconst_null    
        //  1421: athrow         
        //  1422: aconst_null    
        //  1423: athrow         
        //  1424: aconst_null    
        //  1425: athrow         
        //  1426: aconst_null    
        //  1427: athrow         
        //  1428: aconst_null    
        //  1429: athrow         
        //  1430: aconst_null    
        //  1431: athrow         
        //  1432: aconst_null    
        //  1433: athrow         
        //  1434: pop            
        //  1435: goto            24
        //  1438: pop            
        //  1439: aconst_null    
        //  1440: goto            1434
        //  1443: dup            
        //  1444: ifnull          1434
        //  1447: checkcast       Ljava/lang/Throwable;
        //  1450: athrow         
        //  1451: dup            
        //  1452: ifnull          1438
        //  1455: checkcast       Ljava/lang/Throwable;
        //  1458: athrow         
        //  1459: aconst_null    
        //  1460: athrow         
        //    StackMapTable: 00 D5 FF 00 03 00 03 07 00 03 07 00 EA 01 00 01 07 00 9B FA 00 04 FF 00 0B 00 00 00 01 07 00 9B FD 00 03 07 00 03 07 00 EA 0B FF 00 11 00 03 07 00 03 07 00 EA 01 00 01 07 00 C0 FF 00 02 00 03 07 00 03 07 00 EA 01 00 02 07 00 C0 01 5E 07 00 C0 4A 07 00 9B 40 07 01 1E 45 07 00 9B 40 07 01 24 47 07 00 8D 40 07 01 50 47 07 00 9B 40 01 FC 00 00 01 4C 01 FF 00 02 00 04 07 00 03 07 00 EA 01 01 00 02 01 01 5D 01 0F 42 01 1C 14 42 01 1F 17 42 01 1C 08 08 0B 42 01 1E 57 07 01 1E FF 00 02 00 04 07 00 03 07 00 EA 01 01 00 02 07 01 1E 01 5C 07 01 1E 42 07 01 0C 40 07 01 1E 45 07 00 9B 40 07 01 24 43 07 00 9B FF 00 00 00 04 07 00 03 07 00 EA 01 01 00 02 07 01 24 01 45 07 00 9B 40 07 01 0A FC 00 12 07 00 EA 42 01 1E 44 07 00 9B 40 07 00 EA 45 07 00 9B 40 01 05 44 07 00 95 40 07 00 EA 45 07 00 9B 40 07 01 B1 43 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B1 07 00 EA 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B1 07 01 B1 42 07 01 49 FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B1 07 01 B1 45 07 00 9B 40 01 47 07 00 83 40 07 00 EA 45 07 00 9B 40 07 00 5B 43 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 EA 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 5B FF 00 0B 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 5B FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 03 07 00 5B 07 00 5B 01 FF 00 1D 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 5B 42 07 00 93 FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 5B 45 07 00 9B 40 01 47 07 00 9B 40 07 00 EA 45 07 00 9B 40 07 01 B1 FF 00 0A 00 00 00 01 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 01 07 00 EA 45 07 00 9B 40 07 01 B1 4D 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B1 08 02 C2 08 02 C2 07 00 5B 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B1 08 02 C2 08 02 C2 07 00 5B 42 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B1 08 02 C2 08 02 C2 07 00 5B 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B1 07 01 7D 40 07 01 B1 4E 07 01 7B FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 7B 01 5D 07 01 7B FF 00 02 00 00 00 01 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 01 07 01 7B 45 07 00 9B 40 07 01 B3 43 07 01 B3 45 07 01 B3 FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B3 01 5B 07 01 B3 FF 00 12 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 05 07 01 B3 08 03 44 08 03 44 07 00 5B 01 FF 00 1D 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B 42 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B 42 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 B3 07 01 7D 40 07 01 B3 4E 07 01 93 FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 01 93 01 5E 07 01 93 FF 00 0E 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 01 07 00 EA FF 00 02 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 02 07 00 EA 01 5D 07 00 EA 42 07 00 9B 40 07 00 EA 45 07 00 9B 40 07 01 B1 43 07 01 B1 45 07 01 B1 FF 00 02 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 02 07 01 B1 01 5B 07 01 B1 49 07 01 45 FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B1 08 04 24 08 04 24 07 00 5B 45 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B1 08 04 24 08 04 24 07 00 5B 42 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B1 08 04 24 08 04 24 07 00 5B 45 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 02 07 01 B1 07 01 7D 40 07 01 B1 45 07 01 45 40 07 01 7B 45 07 00 9B 40 07 01 B3 43 07 01 B3 45 07 01 B3 FF 00 02 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 02 07 01 B3 01 5A 07 01 B3 49 07 00 85 FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B 45 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B FF 00 0B 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B FF 00 02 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 05 07 01 B3 08 04 78 08 04 78 07 00 5B 01 FF 00 1E 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B 42 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B 45 07 00 9B FF 00 00 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 02 07 01 B3 07 01 7D 40 07 01 B3 FF 00 09 00 07 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 07 01 93 00 01 07 00 9B 40 07 01 93 47 07 00 9B 40 07 01 B5 44 07 00 8B FF 00 00 00 07 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 07 01 93 00 02 07 01 B5 07 01 93 47 07 00 9B FF 00 00 00 07 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 07 01 93 00 02 07 01 B5 07 01 B5 42 07 00 9B FF 00 00 00 07 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 07 01 93 00 02 07 01 B5 07 01 B5 45 07 00 9B 40 01 F9 00 07 44 07 00 9B 40 07 00 EA 45 07 00 9B 40 01 FF 00 0C 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 01 07 00 EA FF 00 02 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 03 01 07 00 EA 01 FF 00 1C 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 01 07 00 EA 42 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 01 07 00 EA 45 07 00 9B FF 00 00 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 01 01 0E 42 01 1E FA 00 01 05 01 FC 00 01 07 00 EA FA 00 01 FF 00 01 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 04 07 01 B3 08 03 44 08 03 44 07 00 5B FF 00 01 00 03 07 00 03 07 00 EA 01 00 01 07 00 C0 FF 00 01 00 04 07 00 03 07 00 EA 01 01 00 01 01 FF 00 01 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 01 07 00 EA FF 00 01 00 04 07 00 03 07 00 EA 01 01 00 01 07 01 1E FF 00 01 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 01 07 01 93 FF 00 01 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 07 00 5B 07 00 5B 41 07 01 7B FA 00 01 01 FF 00 01 00 06 07 00 03 07 00 EA 01 01 07 00 EA 07 01 93 00 04 07 01 B3 08 04 78 08 04 78 07 00 5B FF 00 01 00 05 07 00 03 07 00 EA 01 01 07 00 EA 00 02 01 07 00 EA 01 FF 00 01 00 02 07 00 03 07 00 EA 00 01 07 00 9B 43 05 44 07 00 9B 47 05 FF 00 07 00 03 07 00 03 07 00 EA 01 00 01 07 00 9B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1443   1451   Ljava/lang/AssertionError;
        //  1443   1451   1443   1451   Any
        //  1459   1461   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  99     106    106    107    Any
        //  100    106    3      8      Any
        //  99     106    106    107    Any
        //  100    106    99     100    Any
        //  99     106    99     100    Any
        //  115    124    124    125    Any
        //  115    124    115    116    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  116    124    3      8      Ljava/util/NoSuchElementException;
        //  115    124    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  116    124    124    125    Any
        //  455    462    462    463    Any
        //  456    462    462    463    Ljava/lang/IndexOutOfBoundsException;
        //  455    462    455    456    Ljava/lang/NullPointerException;
        //  455    462    3      8      Ljava/lang/IllegalArgumentException;
        //  455    462    455    456    Ljava/lang/NullPointerException;
        //  467    474    474    475    Any
        //  467    474    467    468    Any
        //  468    474    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  467    474    3      8      Any
        //  467    474    467    468    Any
        //  533    540    540    541    Any
        //  534    540    3      8      Any
        //  534    540    3      8      Ljava/lang/RuntimeException;
        //  534    540    533    534    Any
        //  534    540    540    541    Ljava/lang/UnsupportedOperationException;
        //  552    559    559    560    Any
        //  552    559    559    560    Ljava/lang/IndexOutOfBoundsException;
        //  552    559    559    560    Ljava/lang/IllegalStateException;
        //  552    559    552    553    Ljava/lang/NegativeArraySizeException;
        //  552    559    3      8      Any
        //  564    571    571    572    Any
        //  564    571    3      8      Any
        //  565    571    571    572    Any
        //  564    571    3      8      Ljava/lang/ClassCastException;
        //  564    571    564    565    Any
        //  575    582    582    583    Any
        //  575    582    582    583    Any
        //  576    582    3      8      Ljava/lang/NegativeArraySizeException;
        //  576    582    575    576    Ljava/lang/AssertionError;
        //  575    582    3      8      Ljava/lang/ArithmeticException;
        //  591    598    598    599    Any
        //  591    598    3      8      Any
        //  591    598    598    599    Any
        //  592    598    3      8      Any
        //  592    598    591    592    Ljava/lang/EnumConstantNotPresentException;
        //  603    610    610    611    Any
        //  603    610    603    604    Ljava/lang/UnsupportedOperationException;
        //  603    610    603    604    Any
        //  603    610    603    604    Ljava/util/ConcurrentModificationException;
        //  604    610    610    611    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  659    666    666    667    Any
        //  659    666    666    667    Ljava/lang/StringIndexOutOfBoundsException;
        //  659    666    659    660    Ljava/lang/IllegalStateException;
        //  660    666    666    667    Any
        //  659    666    666    667    Any
        //  675    682    682    683    Any
        //  676    682    3      8      Any
        //  675    682    675    676    Any
        //  676    682    3      8      Ljava/lang/ArithmeticException;
        //  676    682    682    683    Ljava/lang/EnumConstantNotPresentException;
        //  695    701    701    702    Any
        //  695    701    3      8      Any
        //  695    701    701    702    Any
        //  695    701    3      8      Any
        //  695    701    3      8      Ljava/util/NoSuchElementException;
        //  716    723    723    724    Any
        //  717    723    716    717    Ljava/lang/AssertionError;
        //  716    723    716    717    Any
        //  717    723    723    724    Any
        //  717    723    716    717    Ljava/util/ConcurrentModificationException;
        //  727    734    734    735    Any
        //  727    734    727    728    Ljava/lang/IllegalStateException;
        //  727    734    727    728    Ljava/util/ConcurrentModificationException;
        //  728    734    727    728    Any
        //  727    734    727    728    Ljava/util/ConcurrentModificationException;
        //  788    794    794    795    Any
        //  788    794    3      8      Any
        //  788    794    794    795    Any
        //  788    794    3      8      Any
        //  788    794    794    795    Ljava/lang/RuntimeException;
        //  891    898    898    899    Any
        //  892    898    891    892    Any
        //  892    898    891    892    Ljava/lang/ArithmeticException;
        //  892    898    3      8      Ljava/lang/ClassCastException;
        //  892    898    891    892    Ljava/lang/NegativeArraySizeException;
        //  902    909    909    910    Any
        //  903    909    902    903    Any
        //  902    909    3      8      Ljava/lang/NumberFormatException;
        //  903    909    902    903    Any
        //  902    909    3      8      Ljava/lang/IllegalArgumentException;
        //  1011   1018   1018   1019   Any
        //  1012   1018   1018   1019   Ljava/util/NoSuchElementException;
        //  1012   1018   1018   1019   Ljava/lang/ArithmeticException;
        //  1011   1018   1018   1019   Any
        //  1011   1018   1011   1012   Any
        //  1070   1077   1077   1078   Any
        //  1070   1077   3      8      Any
        //  1070   1077   1077   1078   Any
        //  1070   1077   1070   1071   Ljava/util/ConcurrentModificationException;
        //  1070   1077   1070   1071   Ljava/util/NoSuchElementException;
        //  1081   1088   1088   1089   Any
        //  1082   1088   3      8      Any
        //  1081   1088   1088   1089   Ljava/lang/NullPointerException;
        //  1081   1088   1081   1082   Any
        //  1082   1088   1088   1089   Ljava/lang/StringIndexOutOfBoundsException;
        //  1096   1103   1103   1104   Any
        //  1096   1103   1096   1097   Ljava/lang/IllegalArgumentException;
        //  1097   1103   1103   1104   Ljava/lang/IndexOutOfBoundsException;
        //  1096   1103   1103   1104   Any
        //  1096   1103   1096   1097   Ljava/util/ConcurrentModificationException;
        //  1154   1161   1161   1162   Any
        //  1155   1161   3      8      Any
        //  1154   1161   3      8      Ljava/lang/NullPointerException;
        //  1154   1161   1154   1155   Ljava/lang/StringIndexOutOfBoundsException;
        //  1155   1161   1161   1162   Any
        //  1211   1218   1218   1219   Any
        //  1212   1218   1211   1212   Any
        //  1211   1218   1218   1219   Ljava/lang/RuntimeException;
        //  1212   1218   1218   1219   Ljava/lang/NegativeArraySizeException;
        //  1212   1218   1218   1219   Any
        //  1230   1239   1239   1240   Any
        //  1230   1239   1230   1231   Any
        //  1231   1239   1230   1231   Ljava/lang/IndexOutOfBoundsException;
        //  1231   1239   1239   1240   Any
        //  1231   1239   1239   1240   Any
        //  1245   1254   1254   1255   Any
        //  1246   1254   1245   1246   Ljava/lang/NumberFormatException;
        //  1245   1254   3      8      Ljava/lang/AssertionError;
        //  1246   1254   1254   1255   Ljava/lang/IllegalStateException;
        //  1246   1254   3      8      Ljava/util/NoSuchElementException;
        //  1258   1265   1265   1266   Any
        //  1258   1265   1265   1266   Any
        //  1258   1265   1258   1259   Any
        //  1258   1265   1265   1266   Any
        //  1259   1265   1265   1266   Ljava/lang/StringIndexOutOfBoundsException;
        //  1279   1286   1286   1287   Any
        //  1280   1286   1279   1280   Any
        //  1280   1286   3      8      Any
        //  1280   1286   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1279   1286   3      8      Ljava/lang/AssertionError;
        //  1335   1342   1342   1343   Any
        //  1335   1342   1335   1336   Any
        //  1336   1342   3      8      Ljava/lang/NullPointerException;
        //  1335   1342   1342   1343   Any
        //  1336   1342   1342   1343   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.remove(ArrayList.java:535)
        //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:577)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public boolean 2() {
        return fbS.eD(this, 1567266404);
    }
}
