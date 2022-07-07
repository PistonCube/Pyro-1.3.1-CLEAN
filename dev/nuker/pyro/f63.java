// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.Nullable;
import net.minecraft.entity.Entity;

public class f63 extends fH
{
    @Nullable
    public Entity c;
    
    public f63() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23ea\u149d\u8aea\ub3d0\uc9b0\ueded\ub221\ue6c0\ud971\ue9d9\ua72a"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23ca\u149d\u8aea\ub3d0\uc9b0\uedf0\ub200\ue6d6\ud97b\ue9ce\ua727\u1e4f"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: iconst_1       
        //    13: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    16: return         
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          863
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            855
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            847
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             915438214
        //    33: goto            38
        //    36: ldc             -1349570237
        //    38: ldc             -675343031
        //    40: ixor           
        //    41: lookupswitch {
        //          -516984881: 36
        //          2016420874: 68
        //          default: 822
        //        }
        //    68: iload_1        
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            80
        //    75: ldc             -978855106
        //    77: goto            82
        //    80: ldc             -350459839
        //    82: ldc             782278435
        //    84: ixor           
        //    85: lookupswitch {
        //          -977471646: 112
        //          -351845347: 80
        //          default: 818
        //        }
        //   112: aload_2        
        //   113: aload_3        
        //   114: getstatic       dev/nuker/pyro/fc.0:I
        //   117: ifeq            125
        //   120: ldc             -1426706841
        //   122: goto            127
        //   125: ldc             -241183257
        //   127: ldc             -502130459
        //   129: ixor           
        //   130: lookupswitch {
        //          328060162: 156
        //          1222915714: 125
        //          default: 814
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   163: goto            167
        //   166: athrow         
        //   167: iload_1        
        //   168: ifeq            562
        //   171: getstatic       dev/nuker/pyro/fc.1:I
        //   174: ifeq            182
        //   177: ldc             -1374088150
        //   179: goto            184
        //   182: ldc             2120634026
        //   184: ldc             -88144898
        //   186: ixor           
        //   187: lookupswitch {
        //          627155308: 182
        //          1420171220: 812
        //          default: 212
        //        }
        //   212: aload_0        
        //   213: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   216: getstatic       dev/nuker/pyro/fc.c:I
        //   219: ifge            227
        //   222: ldc             1351300584
        //   224: goto            229
        //   227: ldc             -335052953
        //   229: ldc             2092491687
        //   231: ixor           
        //   232: lookupswitch {
        //          741594703: 824
        //          1868597123: 227
        //          default: 260
        //        }
        //   260: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   263: dup            
        //   264: pop            
        //   265: getstatic       dev/nuker/pyro/fc.1:I
        //   268: ifeq            276
        //   271: ldc             82494222
        //   273: goto            278
        //   276: ldc             591724691
        //   278: ldc             1783924683
        //   280: ixor           
        //   281: lookupswitch {
        //          862521638: 276
        //          1857963205: 836
        //          default: 308
        //        }
        //   308: goto            312
        //   311: athrow         
        //   312: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //   315: goto            319
        //   318: athrow         
        //   319: ifeq            562
        //   322: getstatic       dev/nuker/pyro/fc.1:I
        //   325: ifeq            333
        //   328: ldc             1830956884
        //   330: goto            335
        //   333: ldc             -1657335654
        //   335: ldc             -1068062429
        //   337: ixor           
        //   338: lookupswitch {
        //          -1384872329: 820
        //          1484665917: 333
        //          default: 364
        //        }
        //   364: aload_0        
        //   365: aload_0        
        //   366: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   369: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   372: dup            
        //   373: pop            
        //   374: goto            378
        //   377: athrow         
        //   378: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   381: goto            385
        //   384: athrow         
        //   385: getstatic       dev/nuker/pyro/fc.c:I
        //   388: ifge            396
        //   391: ldc             979529253
        //   393: goto            398
        //   396: ldc             1972786284
        //   398: ldc             -2076882293
        //   400: ixor           
        //   401: lookupswitch {
        //          -1101585234: 816
        //          715937169: 396
        //          default: 428
        //        }
        //   428: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   431: aload_0        
        //   432: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   435: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   438: goto            442
        //   441: athrow         
        //   442: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184210_p:()V
        //   445: goto            449
        //   448: athrow         
        //   449: aload_0        
        //   450: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   453: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   456: getstatic       dev/nuker/pyro/fc.0:I
        //   459: ifeq            467
        //   462: ldc             2093866851
        //   464: goto            469
        //   467: ldc             -195702985
        //   469: ldc             -913271995
        //   471: ixor           
        //   472: lookupswitch {
        //          -1252176858: 467
        //          1036344434: 500
        //          default: 828
        //        }
        //   500: aload_0        
        //   501: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   504: getstatic       dev/nuker/pyro/fc.c:I
        //   507: ifge            515
        //   510: ldc             1658901890
        //   512: goto            517
        //   515: ldc             -1059032632
        //   517: ldc             273495782
        //   519: ixor           
        //   520: lookupswitch {
        //          440866822: 515
        //          1923998564: 834
        //          default: 548
        //        }
        //   548: goto            552
        //   551: athrow         
        //   552: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72900_e:(Lnet/minecraft/entity/Entity;)V
        //   555: goto            559
        //   558: athrow         
        //   559: goto            811
        //   562: iload_1        
        //   563: ifne            811
        //   566: aload_0        
        //   567: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   570: ifnull          578
        //   573: ldc             554897960
        //   575: goto            580
        //   578: ldc             554897961
        //   580: ldc             683807920
        //   582: ixor           
        //   583: tableswitch {
        //          329387312: 604
        //          329387313: 811
        //          default: 573
        //        }
        //   604: aload_0        
        //   605: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   608: dup            
        //   609: ifnonnull       623
        //   612: goto            616
        //   615: athrow         
        //   616: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   619: goto            623
        //   622: athrow         
        //   623: iconst_0       
        //   624: getstatic       dev/nuker/pyro/fc.0:I
        //   627: ifeq            635
        //   630: ldc             -1937335398
        //   632: goto            637
        //   635: ldc             -1529303668
        //   637: ldc             600640670
        //   639: ixor           
        //   640: lookupswitch {
        //          -1354000636: 830
        //          93789950: 635
        //          default: 668
        //        }
        //   668: putfield        net/minecraft/entity/Entity.field_70128_L:Z
        //   671: aload_0        
        //   672: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   675: getstatic       dev/nuker/pyro/fc.1:I
        //   678: ifeq            686
        //   681: ldc             272034086
        //   683: goto            688
        //   686: ldc             1264370018
        //   688: ldc             -1657277403
        //   690: ixor           
        //   691: lookupswitch {
        //          -1929306877: 686
        //          -697617081: 716
        //          default: 832
        //        }
        //   716: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   719: aload_0        
        //   720: getstatic       dev/nuker/pyro/fc.0:I
        //   723: ifeq            731
        //   726: ldc             368468891
        //   728: goto            733
        //   731: ldc             -2082172750
        //   733: ldc             1491893955
        //   735: ixor           
        //   736: lookupswitch {
        //          -620171663: 764
        //          1293557080: 731
        //          default: 826
        //        }
        //   764: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   767: goto            771
        //   770: athrow         
        //   771: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72838_d:(Lnet/minecraft/entity/Entity;)Z
        //   774: goto            778
        //   777: athrow         
        //   778: pop            
        //   779: aload_0        
        //   780: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   783: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   786: aload_0        
        //   787: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   790: iconst_1       
        //   791: goto            795
        //   794: athrow         
        //   795: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184205_a:(Lnet/minecraft/entity/Entity;Z)Z
        //   798: goto            802
        //   801: athrow         
        //   802: pop            
        //   803: aload_0        
        //   804: aconst_null    
        //   805: checkcast       Lnet/minecraft/entity/Entity;
        //   808: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   811: return         
        //   812: aconst_null    
        //   813: athrow         
        //   814: aconst_null    
        //   815: athrow         
        //   816: aconst_null    
        //   817: athrow         
        //   818: aconst_null    
        //   819: athrow         
        //   820: aconst_null    
        //   821: athrow         
        //   822: aconst_null    
        //   823: athrow         
        //   824: aconst_null    
        //   825: athrow         
        //   826: aconst_null    
        //   827: athrow         
        //   828: aconst_null    
        //   829: athrow         
        //   830: aconst_null    
        //   831: athrow         
        //   832: aconst_null    
        //   833: athrow         
        //   834: aconst_null    
        //   835: athrow         
        //   836: aconst_null    
        //   837: athrow         
        //   838: pop            
        //   839: goto            24
        //   842: pop            
        //   843: aconst_null    
        //   844: goto            838
        //   847: dup            
        //   848: ifnull          838
        //   851: checkcast       Ljava/lang/Throwable;
        //   854: athrow         
        //   855: dup            
        //   856: ifnull          842
        //   859: checkcast       Ljava/lang/Throwable;
        //   862: athrow         
        //   863: aconst_null    
        //   864: athrow         
        //    StackMapTable: 00 63 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FF 00 03 00 04 07 00 03 01 07 00 5D 07 00 A1 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 01 FF 00 0C 00 04 07 00 03 01 07 00 5D 07 00 A1 00 04 07 00 03 01 07 00 5D 07 00 A1 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 05 07 00 03 01 07 00 5D 07 00 A1 01 FF 00 1C 00 04 07 00 03 01 07 00 5D 07 00 A1 00 04 07 00 03 01 07 00 5D 07 00 A1 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 04 07 00 03 01 07 00 5D 07 00 A1 45 07 00 39 00 0E 41 01 1B 4E 07 00 54 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 54 01 5E 07 00 54 4F 07 00 5D FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 5D 01 5D 07 00 5D 42 07 00 39 40 07 00 5D 45 07 00 39 40 01 0D 41 01 1C 4C 07 00 30 FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 07 00 5D 45 07 00 39 FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 07 00 8D FF 00 0A 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 07 00 8D FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 03 07 00 8D 01 FF 00 1D 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 07 00 8D 4C 07 00 1C 40 07 00 5D 45 07 00 39 00 51 07 00 7C FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 01 5E 07 00 7C FF 00 0E 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 8D FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 7C 07 00 8D 01 FF 00 1E 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 8D FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 8D 45 07 00 39 00 02 0A 04 41 01 17 4A 07 00 39 40 07 00 8D 45 07 00 39 40 07 00 8D FF 00 0B 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 8D 01 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 8D 01 01 FF 00 1E 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 8D 01 51 07 00 54 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 54 01 5B 07 00 54 FF 00 0E 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 7C 07 00 03 01 FF 00 1E 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 03 45 07 00 2A FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 8D 45 07 00 39 40 01 4F 07 00 2C FF 00 00 00 04 07 00 03 01 07 00 5D 07 00 A1 00 03 07 00 5D 07 00 8D 01 45 07 00 39 40 01 08 00 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 04 07 00 03 01 07 00 5D 07 00 A1 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 07 00 8D FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 03 01 01 41 07 00 03 41 07 00 54 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 03 41 07 00 7C FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 8D 01 41 07 00 54 FF 00 01 00 04 07 00 03 01 07 00 5D 07 00 A1 00 02 07 00 7C 07 00 8D 41 07 00 5D 41 07 00 39 43 05 44 07 00 39 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     847    855    Any
        //  847    855    847    855    Any
        //  863    865    3      8      Ljava/lang/NumberFormatException;
        //  160    166    166    167    Any
        //  160    166    3      8      Ljava/lang/NegativeArraySizeException;
        //  160    166    3      8      Any
        //  160    166    166    167    Ljava/lang/IndexOutOfBoundsException;
        //  160    166    166    167    Any
        //  311    318    318    319    Any
        //  312    318    3      8      Ljava/lang/NullPointerException;
        //  312    318    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  312    318    318    319    Ljava/lang/UnsupportedOperationException;
        //  311    318    311    312    Any
        //  377    384    384    385    Any
        //  377    384    384    385    Ljava/lang/ClassCastException;
        //  377    384    377    378    Ljava/lang/UnsupportedOperationException;
        //  377    384    377    378    Ljava/lang/EnumConstantNotPresentException;
        //  378    384    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  441    448    448    449    Any
        //  441    448    448    449    Ljava/lang/EnumConstantNotPresentException;
        //  442    448    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  441    448    441    442    Ljava/lang/NegativeArraySizeException;
        //  441    448    3      8      Ljava/lang/NumberFormatException;
        //  552    558    558    559    Any
        //  552    558    558    559    Ljava/lang/ArithmeticException;
        //  552    558    3      8      Ljava/lang/AssertionError;
        //  552    558    558    559    Any
        //  552    558    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  615    622    622    623    Any
        //  616    622    615    616    Any
        //  616    622    622    623    Any
        //  615    622    615    616    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  615    622    3      8      Any
        //  770    777    777    778    Any
        //  771    777    770    771    Ljava/lang/StringIndexOutOfBoundsException;
        //  770    777    777    778    Any
        //  771    777    777    778    Ljava/lang/RuntimeException;
        //  770    777    3      8      Any
        //  794    801    801    802    Any
        //  794    801    801    802    Ljava/lang/IllegalStateException;
        //  794    801    801    802    Ljava/lang/RuntimeException;
        //  794    801    794    795    Ljava/lang/ArithmeticException;
        //  795    801    801    802    Ljava/lang/EnumConstantNotPresentException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:543)
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
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          359
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            351
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            343
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //    28: ifnull          325
        //    31: aload_0        
        //    32: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //    35: dup            
        //    36: ifnonnull       50
        //    39: goto            43
        //    42: athrow         
        //    43: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    46: goto            50
        //    49: athrow         
        //    50: aload_0        
        //    51: getstatic       dev/nuker/pyro/fc.c:I
        //    54: ifge            62
        //    57: ldc             -1993082461
        //    59: goto            64
        //    62: ldc             9662741
        //    64: ldc             -310914510
        //    66: ixor           
        //    67: lookupswitch {
        //          -303783129: 92
        //          1682189201: 62
        //          default: 326
        //        }
        //    92: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //    95: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    98: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   101: getstatic       dev/nuker/pyro/fc.1:I
        //   104: ifeq            112
        //   107: ldc             1926346996
        //   109: goto            114
        //   112: ldc             1160465238
        //   114: ldc             -2047226719
        //   116: ixor           
        //   117: lookupswitch {
        //          -1011908904: 112
        //          -148343723: 330
        //          default: 144
        //        }
        //   144: aload_0        
        //   145: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   148: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   151: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   154: aload_0        
        //   155: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   158: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   161: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   net/minecraft/entity/Entity.func_70107_b:(DDD)V
        //   171: goto            175
        //   174: athrow         
        //   175: aload_0        
        //   176: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   179: dup            
        //   180: pop            
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             960601806
        //   189: goto            194
        //   192: ldc             66490482
        //   194: ldc             1724472232
        //   196: ixor           
        //   197: lookupswitch {
        //          30328975: 192
        //          1602798950: 332
        //          default: 224
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   231: goto            235
        //   234: athrow         
        //   235: dup            
        //   236: ifnonnull       250
        //   239: goto            243
        //   242: athrow         
        //   243: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   246: goto            250
        //   249: athrow         
        //   250: new             Lnet/minecraft/network/play/client/CPacketVehicleMove;
        //   253: dup            
        //   254: getstatic       dev/nuker/pyro/fc.1:I
        //   257: ifeq            265
        //   260: ldc             171923555
        //   262: goto            267
        //   265: ldc             -1300878394
        //   267: ldc             721284709
        //   269: ixor           
        //   270: lookupswitch {
        //          -1102789114: 265
        //          549631494: 328
        //          default: 296
        //        }
        //   296: aload_0        
        //   297: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   300: goto            304
        //   303: athrow         
        //   304: invokespecial   net/minecraft/network/play/client/CPacketVehicleMove.<init>:(Lnet/minecraft/entity/Entity;)V
        //   307: goto            311
        //   310: athrow         
        //   311: checkcast       Lnet/minecraft/network/Packet;
        //   314: goto            318
        //   317: athrow         
        //   318: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   321: goto            325
        //   324: athrow         
        //   325: return         
        //   326: aconst_null    
        //   327: athrow         
        //   328: aconst_null    
        //   329: athrow         
        //   330: aconst_null    
        //   331: athrow         
        //   332: aconst_null    
        //   333: athrow         
        //   334: pop            
        //   335: goto            24
        //   338: pop            
        //   339: aconst_null    
        //   340: goto            334
        //   343: dup            
        //   344: ifnull          334
        //   347: checkcast       Ljava/lang/Throwable;
        //   350: athrow         
        //   351: dup            
        //   352: ifnull          338
        //   355: checkcast       Ljava/lang/Throwable;
        //   358: athrow         
        //   359: aconst_null    
        //   360: athrow         
        //    StackMapTable: 00 31 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FD 00 03 07 00 03 07 00 D2 FF 00 11 00 00 00 01 07 00 39 FF 00 00 00 02 07 00 03 07 00 D2 00 01 07 00 8D 45 07 00 39 40 07 00 8D FF 00 0B 00 02 07 00 03 07 00 D2 00 02 07 00 8D 07 00 03 FF 00 01 00 02 07 00 03 07 00 D2 00 03 07 00 8D 07 00 03 01 FF 00 1B 00 02 07 00 03 07 00 D2 00 02 07 00 8D 07 00 03 FF 00 13 00 02 07 00 03 07 00 D2 00 02 07 00 8D 03 FF 00 01 00 02 07 00 03 07 00 D2 00 03 07 00 8D 03 01 FF 00 1D 00 02 07 00 03 07 00 D2 00 02 07 00 8D 03 56 07 00 39 FF 00 00 00 02 07 00 03 07 00 D2 00 04 07 00 8D 03 03 03 45 07 00 39 00 50 07 00 54 FF 00 01 00 02 07 00 03 07 00 D2 00 02 07 00 54 01 5D 07 00 54 42 07 00 22 40 07 00 54 45 07 00 39 40 07 00 CC 46 07 00 39 40 07 00 CC 45 07 00 39 40 07 00 CC FF 00 0E 00 02 07 00 03 07 00 D2 00 03 07 00 CC 08 00 FA 08 00 FA FF 00 01 00 02 07 00 03 07 00 D2 00 04 07 00 CC 08 00 FA 08 00 FA 01 FF 00 1C 00 02 07 00 03 07 00 D2 00 03 07 00 CC 08 00 FA 08 00 FA 46 07 00 30 FF 00 00 00 02 07 00 03 07 00 D2 00 04 07 00 CC 08 00 FA 08 00 FA 07 00 8D 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 D2 00 02 07 00 CC 07 00 C3 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 D2 00 02 07 00 CC 07 00 CA 45 07 00 39 00 FF 00 00 00 02 07 00 03 07 00 D2 00 02 07 00 8D 07 00 03 FF 00 01 00 02 07 00 03 07 00 D2 00 03 07 00 CC 08 00 FA 08 00 FA FF 00 01 00 02 07 00 03 07 00 D2 00 02 07 00 8D 03 41 07 00 54 41 07 00 30 43 05 44 07 00 30 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     343    351    Ljava/lang/ClassCastException;
        //  343    351    343    351    Ljava/lang/RuntimeException;
        //  359    361    3      8      Any
        //  43     49     49     50     Any
        //  43     49     3      8      Any
        //  43     49     49     50     Ljava/lang/StringIndexOutOfBoundsException;
        //  43     49     49     50     Any
        //  43     49     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  167    174    174    175    Any
        //  168    174    3      8      Any
        //  168    174    3      8      Any
        //  168    174    174    175    Any
        //  168    174    167    168    Any
        //  227    234    234    235    Any
        //  228    234    234    235    Any
        //  228    234    3      8      Any
        //  228    234    227    228    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  228    234    3      8      Ljava/lang/IllegalStateException;
        //  242    249    249    250    Any
        //  242    249    3      8      Any
        //  243    249    249    250    Ljava/util/NoSuchElementException;
        //  242    249    249    250    Ljava/lang/StringIndexOutOfBoundsException;
        //  243    249    242    243    Any
        //  303    310    310    311    Any
        //  304    310    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  303    310    303    304    Ljava/lang/RuntimeException;
        //  304    310    310    311    Any
        //  304    310    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  317    324    324    325    Any
        //  318    324    3      8      Any
        //  317    324    317    318    Any
        //  317    324    3      8      Any
        //  318    324    317    318    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:543)
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
    
    @Nullable
    public Entity c() {
        return fbS.gW(this, 130375590);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2417
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2409
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2401
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    34: goto            38
        //    37: athrow         
        //    38: getstatic       dev/nuker/pyro/fc.1:I
        //    41: ifeq            49
        //    44: ldc             1806861557
        //    46: goto            51
        //    49: ldc             1704658285
        //    51: ldc             -1743623652
        //    53: ixor           
        //    54: lookupswitch {
        //          -207556887: 2348
        //          352879202: 49
        //          default: 80
        //        }
        //    80: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    83: if_acmpne       2331
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            97
        //    92: ldc             434963270
        //    94: goto            99
        //    97: ldc             -1404448033
        //    99: ldc             994242365
        //   101: ixor           
        //   102: lookupswitch {
        //          -1760870942: 128
        //          581954683: 97
        //          default: 2362
        //        }
        //   128: aload_1        
        //   129: goto            133
        //   132: athrow         
        //   133: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   136: goto            140
        //   139: athrow         
        //   140: instanceof      Lnet/minecraft/network/play/server/SPacketSetPassengers;
        //   143: ifeq            1593
        //   146: aload_0        
        //   147: getstatic       dev/nuker/pyro/fc.1:I
        //   150: ifeq            158
        //   153: ldc             1816616981
        //   155: goto            160
        //   158: ldc             -1858293039
        //   160: ldc             -1980529191
        //   162: ixor           
        //   163: lookupswitch {
        //          -441129524: 158
        //          416233224: 188
        //          default: 2388
        //        }
        //   188: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   191: ifnull          2331
        //   194: aload_1        
        //   195: getstatic       dev/nuker/pyro/fc.1:I
        //   198: ifeq            206
        //   201: ldc             565979880
        //   203: goto            208
        //   206: ldc             -796160995
        //   208: ldc             -2108140968
        //   210: ixor           
        //   211: lookupswitch {
        //          -1545307984: 206
        //          1389616709: 236
        //          default: 2368
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   243: goto            247
        //   246: athrow         
        //   247: dup            
        //   248: ifnonnull       324
        //   251: new             Lkotlin/TypeCastException;
        //   254: dup            
        //   255: ldc             "\u23e1\u1486\u8af2\ub1c4\ucf93\uedea\ub225\ue6dd\udb77\uefaf\ua73d\u1e0c\ue1f5\uc7b3\u8767\u8971\u57a5\u7705\ubf38\uc65c\u2b09\uc234\u6a5e\u2f49\ud1cd\u3584\u7d66\u89b3\u8215\u8a8b\u84a3\ufb72\u70d5\u981e\u1d85\uf16d\u493c\u887c\uc892\uf923\ub699\u41fe\ub9ee\ub157\u4a60\u8af9\u7c7b\uce37\u7f59\uecc6\ue699\u16d6\uee40\u358b\u40ad\ue1fc\u0a05\u86c9\u1b8a\u0942\u771e\u728c\uc7e0\ub9e5\u9cde\u6a1f\ue2f4\ud031\ua739\u23cf\u89f7\u4f92\u8b52\u1618\ua5c7\u70ce\u55a3\u1c64\u63ed\u178f\u8862\u0506\uf8d3\u2472\u1f16\ub9e6\u7cf6\u4b87\u1849\u228d\uce21"
        //   257: goto            261
        //   260: athrow         
        //   261: invokestatic    invokestatic   !!! ERROR
        //   264: goto            268
        //   267: athrow         
        //   268: getstatic       dev/nuker/pyro/fc.0:I
        //   271: ifeq            279
        //   274: ldc             -1560507761
        //   276: goto            282
        //   279: ldc_w           911637775
        //   282: ldc_w           -2027045123
        //   285: ixor           
        //   286: lookupswitch {
        //          -953503155: 279
        //          634467442: 2350
        //          default: 312
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   319: goto            323
        //   322: athrow         
        //   323: athrow         
        //   324: checkcast       Lnet/minecraft/network/play/server/SPacketSetPassengers;
        //   327: astore_2       
        //   328: aload_2        
        //   329: goto            333
        //   332: athrow         
        //   333: invokevirtual   net/minecraft/network/play/server/SPacketSetPassengers.func_186972_b:()I
        //   336: goto            340
        //   339: athrow         
        //   340: aload_0        
        //   341: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   344: dup            
        //   345: ifnonnull       359
        //   348: goto            352
        //   351: athrow         
        //   352: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   355: goto            359
        //   358: athrow         
        //   359: goto            363
        //   362: athrow         
        //   363: invokevirtual   net/minecraft/entity/Entity.func_145782_y:()I
        //   366: goto            370
        //   369: athrow         
        //   370: if_icmpne       379
        //   373: ldc_w           1658389692
        //   376: goto            382
        //   379: ldc_w           1658389693
        //   382: ldc_w           -259858616
        //   385: ixor           
        //   386: tableswitch {
        //          616019944: 408
        //          616019945: 843
        //          default: 373
        //        }
        //   408: getstatic       dev/nuker/pyro/fc.c:I
        //   411: ifge            420
        //   414: ldc_w           2078880944
        //   417: goto            423
        //   420: ldc_w           -658295314
        //   423: ldc_w           -1360686341
        //   426: ixor           
        //   427: lookupswitch {
        //          -720591285: 420
        //          1982244629: 452
        //          default: 2376
        //        }
        //   452: aload_2        
        //   453: goto            457
        //   456: athrow         
        //   457: invokevirtual   net/minecraft/network/play/server/SPacketSetPassengers.func_186971_a:()[I
        //   460: goto            464
        //   463: athrow         
        //   464: astore          5
        //   466: aload           5
        //   468: arraylength    
        //   469: istore          6
        //   471: iconst_0       
        //   472: istore          4
        //   474: getstatic       dev/nuker/pyro/fc.0:I
        //   477: ifeq            486
        //   480: ldc_w           -866794956
        //   483: goto            489
        //   486: ldc_w           982759377
        //   489: ldc_w           393278378
        //   492: ixor           
        //   493: lookupswitch {
        //          -618319458: 486
        //          769868923: 520
        //          default: 2344
        //        }
        //   520: iload           4
        //   522: iload           6
        //   524: if_icmpge       611
        //   527: aload           5
        //   529: getstatic       dev/nuker/pyro/fc.0:I
        //   532: ifeq            541
        //   535: ldc_w           1895070990
        //   538: goto            544
        //   541: ldc_w           26333168
        //   544: ldc_w           1515637929
        //   547: ixor           
        //   548: lookupswitch {
        //          -795388789: 541
        //          715305383: 2338
        //          default: 576
        //        }
        //   576: iload           4
        //   578: iaload         
        //   579: istore_3       
        //   580: iload_3        
        //   581: aload_0        
        //   582: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //   585: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   588: dup            
        //   589: pop            
        //   590: goto            594
        //   593: athrow         
        //   594: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_145782_y:()I
        //   597: goto            601
        //   600: athrow         
        //   601: if_icmpne       605
        //   604: return         
        //   605: iinc            4, 1
        //   608: goto            474
        //   611: getstatic       dev/nuker/pyro/fc.0:I
        //   614: ifeq            623
        //   617: ldc_w           -1702278080
        //   620: goto            626
        //   623: ldc_w           4902718
        //   626: ldc_w           158166889
        //   629: ixor           
        //   630: lookupswitch {
        //          -1813765335: 2386
        //          -66127388: 623
        //          default: 656
        //        }
        //   656: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   659: new             Ljava/lang/StringBuilder;
        //   662: dup            
        //   663: goto            667
        //   666: athrow         
        //   667: invokespecial   java/lang/StringBuilder.<init>:()V
        //   670: goto            674
        //   673: athrow         
        //   674: ldc_w           "\u23d4\u14b6\u8af0\ub1dc\ucfda\uedfd\ub23d\ue6f7\udb7c\uefb3\ua730\u1e42\ue1f4\uc78b\u877d\u8932"
        //   677: goto            681
        //   680: athrow         
        //   681: invokestatic    invokestatic   !!! ERROR
        //   684: goto            688
        //   687: athrow         
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   695: goto            699
        //   698: athrow         
        //   699: getstatic       dev/nuker/pyro/fc.c:I
        //   702: ifge            711
        //   705: ldc_w           1707171138
        //   708: goto            714
        //   711: ldc_w           -426782642
        //   714: ldc_w           -602125008
        //   717: ixor           
        //   718: lookupswitch {
        //          -1176694670: 2354
        //          -560839331: 711
        //          default: 744
        //        }
        //   744: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   747: goto            751
        //   750: athrow         
        //   751: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   754: goto            758
        //   757: athrow         
        //   758: ldc_w           "\u23db\u149b\u8afb\ub188\ucfc0\uedec\ub236\ue6c5\udb7c\uefb2\ua769\u1e44\ue1f6\uc7a5\u8767\u8979\u57ad\u7715\ubf27\uc619\u2b19\uc27b\u6a07\u2f48\ud1d7\u35ca\u7d24\u89bb\u8206\u8ac7\u84bb\ufb3a\u70c4\u9847\u1d87\uf161\u4978\u887b\uc899\uf930\ub697\u41f6\ub9e9\ub14d\u4a6c\u8aee\u7c70"
        //   761: goto            765
        //   764: athrow         
        //   765: invokestatic    invokestatic   !!! ERROR
        //   768: goto            772
        //   771: athrow         
        //   772: goto            776
        //   775: athrow         
        //   776: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   779: goto            783
        //   782: athrow         
        //   783: goto            787
        //   786: athrow         
        //   787: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   790: goto            794
        //   793: athrow         
        //   794: goto            798
        //   797: athrow         
        //   798: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   801: goto            805
        //   804: athrow         
        //   805: aload_0        
        //   806: aconst_null    
        //   807: checkcast       Lnet/minecraft/entity/Entity;
        //   810: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //   813: aload_0        
        //   814: getfield        dev/nuker/pyro/f63.c:Ldev/nuker/pyro/fw;
        //   817: iconst_0       
        //   818: goto            822
        //   821: athrow         
        //   822: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   825: goto            829
        //   828: athrow         
        //   829: goto            833
        //   832: athrow         
        //   833: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   836: goto            840
        //   839: athrow         
        //   840: goto            2331
        //   843: aload_2        
        //   844: getstatic       dev/nuker/pyro/fc.1:I
        //   847: ifeq            856
        //   850: ldc_w           1503178186
        //   853: goto            859
        //   856: ldc_w           955806858
        //   859: ldc_w           1348178783
        //   862: ixor           
        //   863: lookupswitch {
        //          163790485: 856
        //          1755572181: 888
        //          default: 2336
        //        }
        //   888: goto            892
        //   891: athrow         
        //   892: invokevirtual   net/minecraft/network/play/server/SPacketSetPassengers.func_186971_a:()[I
        //   895: goto            899
        //   898: athrow         
        //   899: getstatic       dev/nuker/pyro/fc.c:I
        //   902: ifge            911
        //   905: ldc_w           570430854
        //   908: goto            914
        //   911: ldc_w           1205878015
        //   914: ldc_w           1174081719
        //   917: ixor           
        //   918: lookupswitch {
        //          35335240: 944
        //          1744504113: 911
        //          default: 2374
        //        }
        //   944: astore          5
        //   946: aload           5
        //   948: arraylength    
        //   949: istore          6
        //   951: iconst_0       
        //   952: istore          4
        //   954: iload           4
        //   956: iload           6
        //   958: if_icmpge       1590
        //   961: aload           5
        //   963: getstatic       dev/nuker/pyro/fc.c:I
        //   966: ifge            975
        //   969: ldc_w           1573480746
        //   972: goto            978
        //   975: ldc_w           -869193500
        //   978: ldc_w           -2092900751
        //   981: ixor           
        //   982: lookupswitch {
        //          -561399973: 975
        //          1332868757: 1008
        //          default: 2358
        //        }
        //  1008: iload           4
        //  1010: iaload         
        //  1011: istore_3       
        //  1012: iload_3        
        //  1013: aload_0        
        //  1014: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/client/Minecraft;
        //  1017: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1020: dup            
        //  1021: pop            
        //  1022: getstatic       dev/nuker/pyro/fc.c:I
        //  1025: ifge            1034
        //  1028: ldc_w           528525083
        //  1031: goto            1037
        //  1034: ldc_w           -1404900082
        //  1037: ldc_w           -195806446
        //  1040: ixor           
        //  1041: lookupswitch {
        //          -1330653053: 1034
        //          -338387959: 2340
        //          default: 1068
        //        }
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_145782_y:()I
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: if_icmpne       1584
        //  1082: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1085: new             Ljava/lang/StringBuilder;
        //  1088: dup            
        //  1089: goto            1093
        //  1092: athrow         
        //  1093: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1096: goto            1100
        //  1099: athrow         
        //  1100: ldc_w           "\u23d4\u14b6\u8af0\ub1dc\ucfda\uedfd\ub23d\ue6f7\udb7c\uefb3\ua730\u1e42\ue1f4\uc78b\u877d\u8932"
        //  1103: goto            1107
        //  1106: athrow         
        //  1107: invokestatic    invokestatic   !!! ERROR
        //  1110: goto            1114
        //  1113: athrow         
        //  1114: getstatic       dev/nuker/pyro/fc.1:I
        //  1117: ifeq            1126
        //  1120: ldc_w           -580775515
        //  1123: goto            1129
        //  1126: ldc_w           -1562177327
        //  1129: ldc_w           -1691139571
        //  1132: ixor           
        //  1133: lookupswitch {
        //          -1291612371: 1126
        //          1179734952: 2332
        //          default: 1160
        //        }
        //  1160: goto            1164
        //  1163: athrow         
        //  1164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1167: goto            1171
        //  1170: athrow         
        //  1171: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1174: getstatic       dev/nuker/pyro/fc.0:I
        //  1177: ifeq            1186
        //  1180: ldc_w           125402246
        //  1183: goto            1189
        //  1186: ldc_w           -1494419618
        //  1189: ldc_w           1848646117
        //  1192: ixor           
        //  1193: lookupswitch {
        //          -925045061: 1220
        //          1766417763: 1186
        //          default: 2346
        //        }
        //  1220: goto            1224
        //  1223: athrow         
        //  1224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1227: goto            1231
        //  1230: athrow         
        //  1231: ldc_w           "\u23d6\u149c\u8aeb\ub188\ucfc0\uedfd\ub225\ue6c1\udb6d\uefa5\ua72d\u1e0c\ue1e5\uc7bf\u8723\u897b\u57aa\u7711\ubf6c\uc61d\u2b13\uc234\u6a0a\u2f4f\ud1c7\u3598\u7d6b\u89b8\u820e\u8a93\u84a6\ufb26\u70d8"
        //  1234: getstatic       dev/nuker/pyro/fc.0:I
        //  1237: ifeq            1246
        //  1240: ldc_w           -1759153201
        //  1243: goto            1249
        //  1246: ldc_w           2141674711
        //  1249: ldc_w           94597929
        //  1252: ixor           
        //  1253: lookupswitch {
        //          -1836711706: 2378
        //          -1340601530: 1246
        //          default: 1280
        //        }
        //  1280: goto            1284
        //  1283: athrow         
        //  1284: invokestatic    invokestatic   !!! ERROR
        //  1287: goto            1291
        //  1290: athrow         
        //  1291: getstatic       dev/nuker/pyro/fc.1:I
        //  1294: ifeq            1303
        //  1297: ldc_w           -395275018
        //  1300: goto            1306
        //  1303: ldc_w           864953374
        //  1306: ldc_w           226718067
        //  1309: ixor           
        //  1310: lookupswitch {
        //          -437000827: 1303
        //          1041061229: 1336
        //          default: 2360
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: getstatic       dev/nuker/pyro/fc.1:I
        //  1350: ifeq            1359
        //  1353: ldc_w           -1340363981
        //  1356: goto            1362
        //  1359: ldc_w           2111637804
        //  1362: ldc_w           197854685
        //  1365: ixor           
        //  1366: lookupswitch {
        //          -1143951634: 1359
        //          1981156593: 1392
        //          default: 2390
        //        }
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: goto            1407
        //  1406: athrow         
        //  1407: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: aload_0        
        //  1415: aconst_null    
        //  1416: checkcast       Lnet/minecraft/entity/Entity;
        //  1419: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //  1422: aload_0        
        //  1423: getstatic       dev/nuker/pyro/fc.c:I
        //  1426: ifge            1435
        //  1429: ldc_w           860815066
        //  1432: goto            1438
        //  1435: ldc_w           1723807091
        //  1438: ldc_w           1123092185
        //  1441: ixor           
        //  1442: lookupswitch {
        //          609104810: 1468
        //          1908406275: 1435
        //          default: 2352
        //        }
        //  1468: getfield        dev/nuker/pyro/f63.c:Ldev/nuker/pyro/fw;
        //  1471: iconst_0       
        //  1472: getstatic       dev/nuker/pyro/fc.0:I
        //  1475: ifeq            1484
        //  1478: ldc_w           1052347273
        //  1481: goto            1487
        //  1484: ldc_w           1926876550
        //  1487: ldc_w           1651778730
        //  1490: ixor           
        //  1491: lookupswitch {
        //          1045966260: 1484
        //          1556983587: 2370
        //          default: 1516
        //        }
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1523: goto            1527
        //  1526: athrow         
        //  1527: getstatic       dev/nuker/pyro/fc.0:I
        //  1530: ifeq            1539
        //  1533: ldc_w           -733640424
        //  1536: goto            1542
        //  1539: ldc_w           -292175226
        //  1542: ldc_w           1230720282
        //  1545: ixor           
        //  1546: lookupswitch {
        //          -1658928126: 2334
        //          1200814999: 1539
        //          default: 1572
        //        }
        //  1572: goto            1576
        //  1575: athrow         
        //  1576: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: return         
        //  1584: iinc            4, 1
        //  1587: goto            954
        //  1590: goto            2331
        //  1593: aload_1        
        //  1594: goto            1598
        //  1597: athrow         
        //  1598: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  1601: goto            1605
        //  1604: athrow         
        //  1605: instanceof      Lnet/minecraft/network/play/server/SPacketDestroyEntities;
        //  1608: ifeq            2234
        //  1611: aload_1        
        //  1612: goto            1616
        //  1615: athrow         
        //  1616: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  1619: goto            1623
        //  1622: athrow         
        //  1623: dup            
        //  1624: ifnonnull       1657
        //  1627: new             Lkotlin/TypeCastException;
        //  1630: dup            
        //  1631: ldc_w           "\u23e1\u1486\u8af2\ub1c4\ucf93\uedea\ub225\ue6dd\udb77\uefaf\ua73d\u1e0c\ue1f5\uc7b3\u8767\u8971\u57a5\u7705\ubf38\uc65c\u2b09\uc234\u6a5e\u2f49\ud1cd\u3584\u7d66\u89b3\u8215\u8a8b\u84a3\ufb72\u70d5\u981e\u1d85\uf16d\u493c\u887c\uc892\uf923\ub699\u41fe\ub9ee\ub157\u4a60\u8af9\u7c7b\uce37\u7f59\uecc6\ue699\u16d6\uee40\u358b\u40ad\ue1fc\u0a05\u86c9\u1b8a\u0942\u771e\u728c\uc7e0\ub9e5\u9cde\u6a1f\ue2f4\ud031\ua739\u23cf\u89f7\u4f92\u8b52\u1618\ua5c7\u70ce\u55a3\u1c64\u63fa\u178f\u8865\u0522\uf8c0\u246e\u1f1c\ub9c6\u7cf6\u4b94\u1845\u228b\uce3b\ub2fb\ued24"
        //  1634: goto            1638
        //  1637: athrow         
        //  1638: invokestatic    invokestatic   !!! ERROR
        //  1641: goto            1645
        //  1644: athrow         
        //  1645: goto            1649
        //  1648: athrow         
        //  1649: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1652: goto            1656
        //  1655: athrow         
        //  1656: athrow         
        //  1657: checkcast       Lnet/minecraft/network/play/server/SPacketDestroyEntities;
        //  1660: astore_2       
        //  1661: aload_0        
        //  1662: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //  1665: ifnull          2331
        //  1668: aload_2        
        //  1669: goto            1673
        //  1672: athrow         
        //  1673: invokevirtual   net/minecraft/network/play/server/SPacketDestroyEntities.func_149098_c:()[I
        //  1676: goto            1680
        //  1679: athrow         
        //  1680: getstatic       dev/nuker/pyro/fc.1:I
        //  1683: ifeq            1692
        //  1686: ldc_w           912047278
        //  1689: goto            1695
        //  1692: ldc_w           713567789
        //  1695: ldc_w           -1850991174
        //  1698: ixor           
        //  1699: lookupswitch {
        //          -1477402348: 2380
        //          1796714738: 1692
        //          default: 1724
        //        }
        //  1724: astore          5
        //  1726: getstatic       dev/nuker/pyro/fc.0:I
        //  1729: ifeq            1738
        //  1732: ldc_w           1843298764
        //  1735: goto            1741
        //  1738: ldc_w           240996858
        //  1741: ldc_w           1362716513
        //  1744: ixor           
        //  1745: lookupswitch {
        //          -2013877162: 1738
        //          1021830829: 2356
        //          default: 1772
        //        }
        //  1772: aload           5
        //  1774: arraylength    
        //  1775: istore          6
        //  1777: iconst_0       
        //  1778: istore          4
        //  1780: getstatic       dev/nuker/pyro/fc.1:I
        //  1783: ifeq            1792
        //  1786: ldc_w           1126688455
        //  1789: goto            1795
        //  1792: ldc_w           905589979
        //  1795: ldc_w           -1988037319
        //  1798: ixor           
        //  1799: lookupswitch {
        //          -895020034: 2364
        //          -133118570: 1792
        //          default: 1824
        //        }
        //  1824: iload           4
        //  1826: iload           6
        //  1828: if_icmpge       2331
        //  1831: getstatic       dev/nuker/pyro/fc.1:I
        //  1834: ifeq            1843
        //  1837: ldc_w           2056706366
        //  1840: goto            1846
        //  1843: ldc_w           1234100105
        //  1846: ldc_w           -1560779441
        //  1849: ixor           
        //  1850: lookupswitch {
        //          -663831439: 2342
        //          205147525: 1843
        //          default: 1876
        //        }
        //  1876: aload           5
        //  1878: iload           4
        //  1880: iaload         
        //  1881: istore_3       
        //  1882: iload_3        
        //  1883: aload_0        
        //  1884: getfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //  1887: dup            
        //  1888: ifnonnull       1947
        //  1891: getstatic       dev/nuker/pyro/fc.0:I
        //  1894: ifeq            1903
        //  1897: ldc_w           -148812670
        //  1900: goto            1906
        //  1903: ldc_w           -1713382023
        //  1906: ldc_w           -348836041
        //  1909: ixor           
        //  1910: lookupswitch {
        //          49557507: 1903
        //          471098293: 2382
        //          default: 1936
        //        }
        //  1936: goto            1940
        //  1939: athrow         
        //  1940: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1943: goto            1947
        //  1946: athrow         
        //  1947: goto            1951
        //  1950: athrow         
        //  1951: invokevirtual   net/minecraft/entity/Entity.func_145782_y:()I
        //  1954: goto            1958
        //  1957: athrow         
        //  1958: if_icmpne       1967
        //  1961: ldc_w           2141766742
        //  1964: goto            1970
        //  1967: ldc_w           2141766743
        //  1970: ldc_w           235161300
        //  1973: ixor           
        //  1974: tableswitch {
        //          -480705276: 1996
        //          -480705275: 2228
        //          default: 1961
        //        }
        //  1996: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1999: new             Ljava/lang/StringBuilder;
        //  2002: dup            
        //  2003: getstatic       dev/nuker/pyro/fc.0:I
        //  2006: ifeq            2015
        //  2009: ldc_w           -209551654
        //  2012: goto            2018
        //  2015: ldc_w           -690421074
        //  2018: ldc_w           -2007805628
        //  2021: ixor           
        //  2022: lookupswitch {
        //          1586123754: 2048
        //          2077306782: 2015
        //          default: 2366
        //        }
        //  2048: goto            2052
        //  2051: athrow         
        //  2052: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2055: goto            2059
        //  2058: athrow         
        //  2059: ldc_w           "\u23d4\u14b6\u8af0\ub1dc\ucfda\uedfd\ub23d\ue6f7\udb7c\uefb3\ua730\u1e42\ue1f4\uc78b\u877d\u8932"
        //  2062: goto            2066
        //  2065: athrow         
        //  2066: invokestatic    invokestatic   !!! ERROR
        //  2069: goto            2073
        //  2072: athrow         
        //  2073: goto            2077
        //  2076: athrow         
        //  2077: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2080: goto            2084
        //  2083: athrow         
        //  2084: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  2087: goto            2091
        //  2090: athrow         
        //  2091: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2094: goto            2098
        //  2097: athrow         
        //  2098: ldc_w           "\u23db\u149b\u8afb\ub188\ucfc0\uedec\ub236\ue6c5\udb7c\uefb2\ua769\u1e44\ue1f6\uc7a5\u8767\u8976\u57a1\u7705\ubf3c\uc61d\u2b0a\uc235\u6a1b\u2f43\ud182\u359e\u7d23\u89b8\u8240\u8a95\u84a6\ufb36\u70c8\u9809\u1d92\uf128\u4979\u887c\uc883\uf93e\ub6c3\u41ea"
        //  2101: goto            2105
        //  2104: athrow         
        //  2105: invokestatic    invokestatic   !!! ERROR
        //  2108: goto            2112
        //  2111: athrow         
        //  2112: goto            2116
        //  2115: athrow         
        //  2116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2119: goto            2123
        //  2122: athrow         
        //  2123: goto            2127
        //  2126: athrow         
        //  2127: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2130: goto            2134
        //  2133: athrow         
        //  2134: goto            2138
        //  2137: athrow         
        //  2138: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  2141: goto            2145
        //  2144: athrow         
        //  2145: aload_0        
        //  2146: aconst_null    
        //  2147: checkcast       Lnet/minecraft/entity/Entity;
        //  2150: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //  2153: getstatic       dev/nuker/pyro/fc.c:I
        //  2156: ifge            2165
        //  2159: ldc_w           -908874313
        //  2162: goto            2168
        //  2165: ldc_w           545877125
        //  2168: ldc_w           346444791
        //  2171: ixor           
        //  2172: lookupswitch {
        //          -579469760: 2384
        //          1942025346: 2165
        //          default: 2200
        //        }
        //  2200: aload_0        
        //  2201: getfield        dev/nuker/pyro/f63.c:Ldev/nuker/pyro/fw;
        //  2204: iconst_0       
        //  2205: goto            2209
        //  2208: athrow         
        //  2209: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2212: goto            2216
        //  2215: athrow         
        //  2216: goto            2220
        //  2219: athrow         
        //  2220: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  2223: goto            2227
        //  2226: athrow         
        //  2227: return         
        //  2228: iinc            4, 1
        //  2231: goto            1780
        //  2234: aload_1        
        //  2235: goto            2239
        //  2238: athrow         
        //  2239: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  2242: goto            2246
        //  2245: athrow         
        //  2246: instanceof      Lnet/minecraft/network/play/server/SPacketDisconnect;
        //  2249: ifeq            2331
        //  2252: aload_0        
        //  2253: aconst_null    
        //  2254: checkcast       Lnet/minecraft/entity/Entity;
        //  2257: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //  2260: aload_0        
        //  2261: getfield        dev/nuker/pyro/f63.c:Ldev/nuker/pyro/fw;
        //  2264: iconst_0       
        //  2265: goto            2269
        //  2268: athrow         
        //  2269: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2272: goto            2276
        //  2275: athrow         
        //  2276: getstatic       dev/nuker/pyro/fc.1:I
        //  2279: ifeq            2288
        //  2282: ldc_w           -1501114727
        //  2285: goto            2291
        //  2288: ldc_w           1103778889
        //  2291: ldc_w           1020717009
        //  2294: ixor           
        //  2295: lookupswitch {
        //          -1706022584: 2372
        //          -920163144: 2288
        //          default: 2320
        //        }
        //  2320: goto            2324
        //  2323: athrow         
        //  2324: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  2327: goto            2331
        //  2330: athrow         
        //  2331: return         
        //  2332: aconst_null    
        //  2333: athrow         
        //  2334: aconst_null    
        //  2335: athrow         
        //  2336: aconst_null    
        //  2337: athrow         
        //  2338: aconst_null    
        //  2339: athrow         
        //  2340: aconst_null    
        //  2341: athrow         
        //  2342: aconst_null    
        //  2343: athrow         
        //  2344: aconst_null    
        //  2345: athrow         
        //  2346: aconst_null    
        //  2347: athrow         
        //  2348: aconst_null    
        //  2349: athrow         
        //  2350: aconst_null    
        //  2351: athrow         
        //  2352: aconst_null    
        //  2353: athrow         
        //  2354: aconst_null    
        //  2355: athrow         
        //  2356: aconst_null    
        //  2357: athrow         
        //  2358: aconst_null    
        //  2359: athrow         
        //  2360: aconst_null    
        //  2361: athrow         
        //  2362: aconst_null    
        //  2363: athrow         
        //  2364: aconst_null    
        //  2365: athrow         
        //  2366: aconst_null    
        //  2367: athrow         
        //  2368: aconst_null    
        //  2369: athrow         
        //  2370: aconst_null    
        //  2371: athrow         
        //  2372: aconst_null    
        //  2373: athrow         
        //  2374: aconst_null    
        //  2375: athrow         
        //  2376: aconst_null    
        //  2377: athrow         
        //  2378: aconst_null    
        //  2379: athrow         
        //  2380: aconst_null    
        //  2381: athrow         
        //  2382: aconst_null    
        //  2383: athrow         
        //  2384: aconst_null    
        //  2385: athrow         
        //  2386: aconst_null    
        //  2387: athrow         
        //  2388: aconst_null    
        //  2389: athrow         
        //  2390: aconst_null    
        //  2391: athrow         
        //  2392: pop            
        //  2393: goto            24
        //  2396: pop            
        //  2397: aconst_null    
        //  2398: goto            2392
        //  2401: dup            
        //  2402: ifnull          2392
        //  2405: checkcast       Ljava/lang/Throwable;
        //  2408: athrow         
        //  2409: dup            
        //  2410: ifnull          2396
        //  2413: checkcast       Ljava/lang/Throwable;
        //  2416: athrow         
        //  2417: aconst_null    
        //  2418: athrow         
        //    StackMapTable: 01 66 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FD 00 03 07 00 03 07 00 E1 45 07 00 39 40 07 00 E1 45 07 00 39 40 07 00 E9 4A 07 00 E9 FF 00 01 00 02 07 00 03 07 00 E1 00 02 07 00 E9 01 5C 07 00 E9 10 41 01 1C 43 07 00 39 40 07 00 E1 45 07 00 39 40 07 00 CA 51 07 00 03 FF 00 01 00 02 07 00 03 07 00 E1 00 02 07 00 03 01 5B 07 00 03 51 07 00 E1 FF 00 01 00 02 07 00 03 07 00 E1 00 02 07 00 E1 01 5B 07 00 E1 42 07 00 39 40 07 00 E1 45 07 00 39 40 07 00 CA 4C 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 FF 00 0A 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 FF 00 02 00 02 07 00 03 07 00 E1 00 05 07 00 CA 08 00 FB 08 00 FB 07 01 A0 01 FF 00 1D 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 02 07 00 CA 07 00 FC 40 07 00 CA FF 00 07 00 03 07 00 03 07 00 E1 07 00 F4 00 01 07 00 A6 40 07 00 F4 45 07 00 39 40 01 4A 07 00 A6 FF 00 00 00 03 07 00 03 07 00 E1 07 00 F4 00 02 01 07 00 8D 45 07 00 39 FF 00 00 00 03 07 00 03 07 00 E1 07 00 F4 00 02 01 07 00 8D 42 07 00 39 FF 00 00 00 03 07 00 03 07 00 E1 07 00 F4 00 02 01 07 00 8D 45 07 00 39 FF 00 00 00 03 07 00 03 07 00 E1 07 00 F4 00 02 01 01 02 05 42 01 19 0B 42 01 1C 43 07 00 30 40 07 00 F4 45 07 00 39 40 07 01 A2 FF 00 09 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 0B 42 01 1E 54 07 01 A2 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 A2 01 5F 07 01 A2 FF 00 10 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 07 00 5D 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 01 03 FF 00 05 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 0B 42 01 1D 49 07 00 22 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 08 02 93 08 02 93 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 05 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 0B 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 DF FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 05 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 30 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 A0 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 A0 45 07 00 39 00 4F 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 4F 01 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 4F 07 01 49 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 4F 07 01 49 45 07 00 39 00 FF 00 02 00 03 07 00 03 07 00 E1 07 00 F4 00 00 4C 07 00 F4 FF 00 02 00 03 07 00 03 07 00 E1 07 00 F4 00 02 07 00 F4 01 5C 07 00 F4 42 07 00 39 40 07 00 F4 45 07 00 39 40 07 01 A2 4B 07 01 A2 FF 00 02 00 03 07 00 03 07 00 E1 07 00 F4 00 02 07 01 A2 01 5D 07 01 A2 FF 00 09 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 54 07 01 A2 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 A2 01 5D 07 01 A2 FF 00 19 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 07 00 5D FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 01 07 00 5D 01 FF 00 1E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 07 00 5D 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 07 00 5D 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 01 4C 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 08 04 3D 08 04 3D 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 26 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 0B 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 04 07 01 21 07 01 27 07 01 A0 01 FF 00 1E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 30 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 0E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 04 07 01 21 07 01 27 07 01 34 01 FF 00 1E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 0E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 04 07 01 21 07 01 27 07 01 A0 01 FF 00 1E 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 0B 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 04 07 01 21 07 01 27 07 01 A0 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 DF FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 0B 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 A0 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 A0 45 07 00 39 00 54 07 00 03 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 00 03 01 5D 07 00 03 FF 00 0F 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 01 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 4F 01 01 FF 00 1C 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 01 42 07 00 DF FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 01 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 FF 00 0B 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 FF 00 02 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 4F 07 01 49 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 45 07 00 39 00 00 FF 00 05 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 FF 00 02 00 02 07 00 03 07 00 E1 00 00 43 07 00 39 40 07 00 E1 45 07 00 39 40 07 00 CA 49 07 00 39 40 07 00 E1 45 07 00 39 40 07 00 CA 4D 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 06 5B 08 06 5B 07 01 A0 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 06 5B 08 06 5B 07 01 A0 42 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 06 5B 08 06 5B 07 01 A0 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 02 07 00 CA 07 00 FC 40 07 00 CA FF 00 0E 00 03 07 00 03 07 00 E1 07 01 7A 00 01 07 00 39 40 07 01 7A 45 07 00 39 40 07 01 A2 4B 07 01 A2 FF 00 02 00 03 07 00 03 07 00 E1 07 01 7A 00 02 07 01 A2 01 5C 07 01 A2 FE 00 0D 00 00 07 01 A2 42 01 1E FF 00 07 00 07 07 00 03 07 00 E1 07 01 7A 00 01 07 01 A2 01 00 00 0B 42 01 1C 12 42 01 1D FF 00 1A 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D FF 00 02 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 01 07 00 8D 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 01 02 05 42 01 19 FF 00 12 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 08 07 CF 08 07 CF FF 00 02 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 04 07 01 21 08 07 CF 08 07 CF 01 FF 00 1D 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 08 07 CF 08 07 CF 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 08 07 CF 08 07 CF 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 05 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 A0 42 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 21 07 01 A0 45 07 00 39 00 13 42 01 1F 47 07 00 30 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 4F 01 45 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 45 07 00 39 00 00 FF 00 05 00 02 07 00 03 07 00 E1 00 00 FF 00 03 00 00 00 01 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 01 07 00 E1 45 07 00 39 40 07 00 CA 55 07 00 1C FF 00 00 00 02 07 00 03 07 00 E1 00 02 07 01 4F 01 45 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 02 07 01 4F 07 01 49 FF 00 0B 00 02 07 00 03 07 00 E1 00 02 07 01 4F 07 01 49 FF 00 02 00 02 07 00 03 07 00 E1 00 03 07 01 4F 07 01 49 01 FF 00 1C 00 02 07 00 03 07 00 E1 00 02 07 01 4F 07 01 49 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 02 07 00 03 07 00 E1 00 02 07 01 4F 07 01 49 45 07 00 39 00 FF 00 00 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 07 01 49 FF 00 01 00 03 07 00 03 07 00 E1 07 00 F4 00 01 07 00 F4 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 01 07 01 A2 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 01 07 00 5D FF 00 01 00 07 07 00 03 07 00 E1 07 01 7A 00 01 07 01 A2 01 00 00 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 34 FF 00 01 00 02 07 00 03 07 00 E1 00 01 07 00 E9 FF 00 01 00 02 07 00 03 07 00 E1 00 04 07 00 CA 08 00 FB 08 00 FB 07 01 A0 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 01 00 06 07 00 03 07 00 E1 07 01 7A 00 00 07 01 A2 00 00 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 01 07 01 A2 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 01 00 02 07 00 03 07 00 E1 00 00 FF 00 01 00 07 07 00 03 07 00 E1 07 01 7A 00 01 07 01 A2 01 00 00 FF 00 01 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 03 07 01 21 08 07 CF 08 07 CF FF 00 01 00 02 07 00 03 07 00 E1 00 01 07 00 E1 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 4F 01 FF 00 01 00 02 07 00 03 07 00 E1 00 02 07 01 4F 07 01 49 FF 00 01 00 03 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 03 07 01 21 07 01 27 07 01 A0 FF 00 01 00 03 07 00 03 07 00 E1 07 01 7A 00 01 07 01 A2 FF 00 01 00 07 07 00 03 07 00 E1 07 01 7A 01 01 07 01 A2 01 00 02 01 07 00 8D 01 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 00 01 07 01 A2 01 00 00 FF 00 01 00 02 07 00 03 07 00 E1 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 E1 07 00 F4 01 01 07 01 A2 01 00 02 07 01 21 07 01 27 FF 00 01 00 02 07 00 03 07 00 E1 00 01 07 00 39 43 05 44 07 00 39 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2401   2409   Any
        //  2401   2409   2401   2409   Ljava/lang/IllegalArgumentException;
        //  2417   2419   3      8      Ljava/lang/ClassCastException;
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/RuntimeException;
        //  31     37     30     31     Ljava/lang/AssertionError;
        //  31     37     37     38     Any
        //  31     37     30     31     Any
        //  132    139    139    140    Any
        //  132    139    132    133    Any
        //  132    139    3      8      Any
        //  132    139    139    140    Any
        //  132    139    132    133    Ljava/lang/EnumConstantNotPresentException;
        //  239    246    246    247    Any
        //  240    246    239    240    Any
        //  240    246    239    240    Any
        //  240    246    246    247    Any
        //  240    246    239    240    Ljava/lang/NumberFormatException;
        //  260    267    267    268    Any
        //  261    267    260    261    Any
        //  261    267    260    261    Ljava/lang/NumberFormatException;
        //  261    267    3      8      Ljava/lang/NullPointerException;
        //  260    267    260    261    Any
        //  316    322    322    323    Any
        //  316    322    322    323    Any
        //  316    322    3      8      Ljava/util/NoSuchElementException;
        //  316    322    322    323    Any
        //  316    322    322    323    Any
        //  332    339    339    340    Any
        //  332    339    3      8      Any
        //  333    339    339    340    Ljava/lang/IllegalArgumentException;
        //  333    339    3      8      Ljava/lang/NullPointerException;
        //  332    339    332    333    Ljava/util/NoSuchElementException;
        //  351    358    358    359    Any
        //  351    358    358    359    Any
        //  352    358    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  352    358    351    352    Ljava/util/NoSuchElementException;
        //  351    358    3      8      Any
        //  362    369    369    370    Any
        //  362    369    3      8      Any
        //  363    369    362    363    Any
        //  363    369    3      8      Any
        //  362    369    369    370    Ljava/lang/StringIndexOutOfBoundsException;
        //  456    463    463    464    Any
        //  457    463    3      8      Ljava/util/ConcurrentModificationException;
        //  457    463    456    457    Ljava/lang/UnsupportedOperationException;
        //  457    463    456    457    Ljava/util/NoSuchElementException;
        //  457    463    456    457    Ljava/lang/RuntimeException;
        //  593    600    600    601    Any
        //  594    600    593    594    Ljava/lang/ClassCastException;
        //  593    600    3      8      Any
        //  593    600    600    601    Ljava/lang/UnsupportedOperationException;
        //  593    600    593    594    Any
        //  666    673    673    674    Any
        //  666    673    3      8      Any
        //  667    673    673    674    Any
        //  666    673    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  666    673    666    667    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  681    687    687    688    Any
        //  681    687    3      8      Ljava/lang/NegativeArraySizeException;
        //  681    687    3      8      Any
        //  681    687    3      8      Any
        //  681    687    687    688    Ljava/lang/ClassCastException;
        //  691    698    698    699    Any
        //  692    698    691    692    Any
        //  691    698    698    699    Any
        //  691    698    3      8      Any
        //  692    698    698    699    Ljava/util/NoSuchElementException;
        //  750    757    757    758    Any
        //  751    757    757    758    Ljava/lang/NegativeArraySizeException;
        //  750    757    3      8      Any
        //  751    757    3      8      Any
        //  751    757    750    751    Ljava/util/ConcurrentModificationException;
        //  765    771    771    772    Any
        //  765    771    771    772    Any
        //  765    771    3      8      Any
        //  765    771    771    772    Ljava/lang/ClassCastException;
        //  765    771    771    772    Ljava/lang/StringIndexOutOfBoundsException;
        //  775    782    782    783    Any
        //  775    782    3      8      Ljava/util/ConcurrentModificationException;
        //  775    782    775    776    Ljava/lang/IllegalArgumentException;
        //  776    782    775    776    Ljava/lang/ClassCastException;
        //  775    782    782    783    Any
        //  786    793    793    794    Any
        //  787    793    3      8      Any
        //  786    793    786    787    Any
        //  787    793    786    787    Ljava/lang/EnumConstantNotPresentException;
        //  786    793    793    794    Any
        //  798    804    804    805    Any
        //  798    804    804    805    Any
        //  798    804    3      8      Ljava/util/ConcurrentModificationException;
        //  798    804    804    805    Any
        //  798    804    3      8      Any
        //  821    828    828    829    Any
        //  821    828    828    829    Any
        //  821    828    821    822    Any
        //  821    828    828    829    Any
        //  822    828    821    822    Ljava/lang/ArithmeticException;
        //  832    839    839    840    Any
        //  832    839    839    840    Ljava/lang/NumberFormatException;
        //  832    839    832    833    Any
        //  832    839    839    840    Any
        //  832    839    3      8      Ljava/lang/IllegalStateException;
        //  891    898    898    899    Any
        //  892    898    898    899    Ljava/lang/IllegalStateException;
        //  892    898    891    892    Any
        //  892    898    898    899    Ljava/lang/EnumConstantNotPresentException;
        //  892    898    898    899    Ljava/lang/IndexOutOfBoundsException;
        //  1071   1078   1078   1079   Any
        //  1072   1078   1071   1072   Any
        //  1072   1078   3      8      Ljava/lang/ClassCastException;
        //  1071   1078   1071   1072   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1071   1078   1071   1072   Ljava/lang/ClassCastException;
        //  1092   1099   1099   1100   Any
        //  1093   1099   1099   1100   Ljava/lang/UnsupportedOperationException;
        //  1093   1099   1099   1100   Ljava/lang/AssertionError;
        //  1092   1099   1099   1100   Any
        //  1093   1099   1092   1093   Any
        //  1106   1113   1113   1114   Any
        //  1106   1113   1106   1107   Ljava/lang/ClassCastException;
        //  1107   1113   1113   1114   Ljava/lang/IndexOutOfBoundsException;
        //  1106   1113   3      8      Any
        //  1106   1113   3      8      Any
        //  1163   1170   1170   1171   Any
        //  1164   1170   1163   1164   Ljava/lang/StringIndexOutOfBoundsException;
        //  1163   1170   1170   1171   Any
        //  1164   1170   1163   1164   Ljava/lang/NullPointerException;
        //  1164   1170   3      8      Any
        //  1223   1230   1230   1231   Any
        //  1224   1230   3      8      Any
        //  1224   1230   3      8      Any
        //  1223   1230   1223   1224   Any
        //  1223   1230   1230   1231   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1283   1290   1290   1291   Any
        //  1283   1290   1283   1284   Any
        //  1284   1290   3      8      Ljava/lang/ArithmeticException;
        //  1284   1290   3      8      Any
        //  1283   1290   3      8      Any
        //  1339   1346   1346   1347   Any
        //  1339   1346   3      8      Any
        //  1340   1346   1346   1347   Ljava/lang/IndexOutOfBoundsException;
        //  1340   1346   1339   1340   Ljava/util/ConcurrentModificationException;
        //  1340   1346   3      8      Ljava/lang/AssertionError;
        //  1395   1402   1402   1403   Any
        //  1396   1402   1395   1396   Ljava/lang/ArithmeticException;
        //  1395   1402   3      8      Ljava/util/ConcurrentModificationException;
        //  1395   1402   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1395   1402   1395   1396   Any
        //  1406   1413   1413   1414   Any
        //  1407   1413   1406   1407   Any
        //  1406   1413   1413   1414   Ljava/util/ConcurrentModificationException;
        //  1407   1413   1413   1414   Ljava/lang/IllegalArgumentException;
        //  1407   1413   1413   1414   Ljava/lang/NumberFormatException;
        //  1519   1526   1526   1527   Any
        //  1520   1526   1526   1527   Ljava/lang/IllegalArgumentException;
        //  1520   1526   3      8      Any
        //  1520   1526   1519   1520   Ljava/util/ConcurrentModificationException;
        //  1520   1526   3      8      Any
        //  1576   1582   1582   1583   Any
        //  1576   1582   1582   1583   Any
        //  1576   1582   3      8      Ljava/lang/RuntimeException;
        //  1576   1582   1582   1583   Any
        //  1576   1582   1582   1583   Ljava/lang/StringIndexOutOfBoundsException;
        //  1597   1604   1604   1605   Any
        //  1598   1604   3      8      Any
        //  1598   1604   1597   1598   Ljava/lang/ArithmeticException;
        //  1598   1604   1597   1598   Any
        //  1598   1604   3      8      Any
        //  1615   1622   1622   1623   Any
        //  1616   1622   1622   1623   Ljava/lang/ArithmeticException;
        //  1615   1622   1615   1616   Any
        //  1616   1622   1622   1623   Any
        //  1616   1622   3      8      Any
        //  1637   1644   1644   1645   Any
        //  1637   1644   1644   1645   Any
        //  1638   1644   1637   1638   Any
        //  1638   1644   3      8      Ljava/lang/NegativeArraySizeException;
        //  1638   1644   1644   1645   Any
        //  1648   1655   1655   1656   Any
        //  1648   1655   1648   1649   Any
        //  1649   1655   1648   1649   Any
        //  1649   1655   1648   1649   Any
        //  1648   1655   1655   1656   Any
        //  1672   1679   1679   1680   Any
        //  1672   1679   1679   1680   Ljava/util/NoSuchElementException;
        //  1673   1679   1672   1673   Any
        //  1673   1679   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1672   1679   1679   1680   Any
        //  1939   1946   1946   1947   Any
        //  1939   1946   1946   1947   Any
        //  1940   1946   1939   1940   Any
        //  1940   1946   1939   1940   Any
        //  1940   1946   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1950   1957   1957   1958   Any
        //  1950   1957   1950   1951   Any
        //  1950   1957   1950   1951   Ljava/lang/ClassCastException;
        //  1950   1957   3      8      Ljava/lang/ArithmeticException;
        //  1951   1957   3      8      Any
        //  2051   2058   2058   2059   Any
        //  2052   2058   3      8      Ljava/lang/AssertionError;
        //  2052   2058   2051   2052   Any
        //  2052   2058   2058   2059   Any
        //  2051   2058   2051   2052   Any
        //  2065   2072   2072   2073   Any
        //  2065   2072   2065   2066   Any
        //  2065   2072   2072   2073   Any
        //  2065   2072   2065   2066   Any
        //  2065   2072   3      8      Ljava/util/ConcurrentModificationException;
        //  2077   2083   2083   2084   Any
        //  2077   2083   2083   2084   Ljava/lang/IllegalArgumentException;
        //  2077   2083   2083   2084   Ljava/lang/UnsupportedOperationException;
        //  2077   2083   3      8      Any
        //  2077   2083   2083   2084   Ljava/lang/ArithmeticException;
        //  2090   2097   2097   2098   Any
        //  2090   2097   3      8      Ljava/lang/IllegalArgumentException;
        //  2090   2097   2090   2091   Any
        //  2090   2097   2090   2091   Any
        //  2091   2097   2097   2098   Any
        //  2105   2111   2111   2112   Any
        //  2105   2111   3      8      Any
        //  2105   2111   3      8      Ljava/lang/AssertionError;
        //  2105   2111   2111   2112   Any
        //  2105   2111   2111   2112   Any
        //  2115   2122   2122   2123   Any
        //  2115   2122   2115   2116   Any
        //  2116   2122   2115   2116   Ljava/lang/UnsupportedOperationException;
        //  2115   2122   3      8      Any
        //  2115   2122   2115   2116   Ljava/lang/NumberFormatException;
        //  2126   2133   2133   2134   Any
        //  2127   2133   3      8      Any
        //  2127   2133   2133   2134   Any
        //  2126   2133   3      8      Ljava/lang/ClassCastException;
        //  2126   2133   2126   2127   Any
        //  2137   2144   2144   2145   Any
        //  2138   2144   2137   2138   Any
        //  2138   2144   2144   2145   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2137   2144   2137   2138   Ljava/lang/ClassCastException;
        //  2138   2144   2144   2145   Any
        //  2208   2215   2215   2216   Any
        //  2208   2215   2208   2209   Ljava/lang/IllegalStateException;
        //  2208   2215   2208   2209   Ljava/lang/IllegalArgumentException;
        //  2208   2215   2208   2209   Ljava/lang/IndexOutOfBoundsException;
        //  2209   2215   2215   2216   Ljava/lang/IllegalStateException;
        //  2220   2226   2226   2227   Any
        //  2220   2226   3      8      Ljava/lang/RuntimeException;
        //  2220   2226   2226   2227   Any
        //  2220   2226   2226   2227   Ljava/util/NoSuchElementException;
        //  2220   2226   2226   2227   Ljava/lang/RuntimeException;
        //  2239   2245   2245   2246   Any
        //  2239   2245   2245   2246   Ljava/lang/NullPointerException;
        //  2239   2245   2245   2246   Ljava/lang/ClassCastException;
        //  2239   2245   2245   2246   Any
        //  2239   2245   2245   2246   Any
        //  2268   2275   2275   2276   Any
        //  2269   2275   2275   2276   Any
        //  2268   2275   2275   2276   Any
        //  2268   2275   2268   2269   Ljava/lang/NegativeArraySizeException;
        //  2269   2275   2275   2276   Any
        //  2324   2330   2330   2331   Any
        //  2324   2330   3      8      Ljava/util/ConcurrentModificationException;
        //  2324   2330   2330   2331   Ljava/lang/IllegalStateException;
        //  2324   2330   2330   2331   Ljava/lang/ArithmeticException;
        //  2324   2330   2330   2331   Ljava/lang/StringIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:667)
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
    
    public void c(@Nullable final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/f63.c:Lnet/minecraft/entity/Entity;
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 39 FD 00 03 07 00 03 07 00 8D 45 07 00 39 43 05 44 07 00 39 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      12     31     39     Any
        //  31     39     31     39     Ljava/lang/AssertionError;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:543)
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
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3t f3t) {
        fbS.1t(this, 2095059229, f3t);
    }
    
    static {
        throw t;
    }
}
