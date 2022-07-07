// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4t extends f49
{
    public f4t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -708086896
        //     8: goto            13
        //    11: ldc             -626355478
        //    13: ldc             1170102864
        //    15: ixor           
        //    16: lookupswitch {
        //          -1871369792: 11
        //          -1626027846: 44
        //          default: 54
        //        }
        //    44: aload_0        
        //    45: ldc             "\u23d2\u149f\u8afa\ub3c0\uc9a4\uedf6\ub20d\ue6d8\ud96e\ue9dd"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: invokespecial   dev/nuker/pyro/f49.<init>:(Ljava/lang/String;)V
        //    53: return         
        //    54: aconst_null    
        //    55: athrow         
        //    StackMapTable: 00 04 0B 41 01 1E 09
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
    public float c() {
        return fbS.aV(this, 286621216);
    }
    
    @Override
    public boolean 4() {
        return fbS.es(this, 1524527461);
    }
    
    static {
        throw t;
    }
    
    @Override
    public float 3() {
        return fbS.aY(this, 1642319212);
    }
    
    @Override
    public void c(final f4d p0, final int p1, final ScaledResolution p2, final float p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1458
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1450
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1442
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    30: ifnull          86
        //    33: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //    36: getstatic       dev/nuker/pyro/fc.c:I
        //    39: ifge            47
        //    42: ldc             1831409161
        //    44: goto            49
        //    47: ldc             508252262
        //    49: ldc             1003373535
        //    51: ixor           
        //    52: lookupswitch {
        //          629478329: 80
        //          1458001366: 47
        //          default: 1403
        //        }
        //    80: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    83: ifnonnull       87
        //    86: return         
        //    87: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //    90: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    93: goto            97
        //    96: athrow         
        //    97: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //   100: goto            104
        //   103: athrow         
        //   104: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //   107: getstatic       dev/nuker/pyro/fc.1:I
        //   110: ifeq            118
        //   113: ldc             -871401522
        //   115: goto            120
        //   118: ldc             -1520648028
        //   120: ldc             -527962610
        //   122: ixor           
        //   123: lookupswitch {
        //          -2146586101: 118
        //          747149760: 1395
        //          default: 148
        //        }
        //   148: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   151: goto            155
        //   154: athrow         
        //   155: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110138_aP:()F
        //   158: goto            162
        //   161: athrow         
        //   162: fdiv           
        //   163: ldc             100.0
        //   165: fmul           
        //   166: fstore          6
        //   168: ldc             100.0
        //   170: fload           6
        //   172: fsub           
        //   173: fstore          7
        //   175: getstatic       dev/nuker/pyro/fc.c:I
        //   178: ifge            186
        //   181: ldc             -1174632501
        //   183: goto            188
        //   186: ldc             263781419
        //   188: ldc             -1957526870
        //   190: ixor           
        //   191: lookupswitch {
        //          -2065006975: 216
        //          850265441: 186
        //          default: 1421
        //        }
        //   216: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //   219: getstatic       dev/nuker/pyro/fc.c:I
        //   222: ifge            230
        //   225: ldc             -1594326787
        //   227: goto            232
        //   230: ldc             1806777139
        //   232: ldc             845377345
        //   234: ixor           
        //   235: lookupswitch {
        //          -1835274308: 1405
        //          -869880989: 230
        //          default: 260
        //        }
        //   260: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   263: goto            267
        //   266: athrow         
        //   267: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110139_bj:()F
        //   270: goto            274
        //   273: athrow         
        //   274: ldc             16.0
        //   276: fdiv           
        //   277: ldc             100.0
        //   279: fmul           
        //   280: fstore          8
        //   282: ldc             100.0
        //   284: fload           8
        //   286: fsub           
        //   287: fstore          9
        //   289: fconst_0       
        //   290: fconst_0       
        //   291: aload_0        
        //   292: getstatic       dev/nuker/pyro/fc.c:I
        //   295: ifge            303
        //   298: ldc             -2092934459
        //   300: goto            305
        //   303: ldc             -721832454
        //   305: ldc             682173275
        //   307: ixor           
        //   308: lookupswitch {
        //          -1410762338: 1417
        //          1611217103: 303
        //          default: 336
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   dev/nuker/pyro/f4t.c:()F
        //   343: goto            347
        //   346: athrow         
        //   347: aload_0        
        //   348: goto            352
        //   351: athrow         
        //   352: invokevirtual   dev/nuker/pyro/f4t.3:()F
        //   355: goto            359
        //   358: athrow         
        //   359: fconst_1       
        //   360: ldc             -1712965319
        //   362: goto            366
        //   365: athrow         
        //   366: invokestatic    dev/nuker/pyro/fbs.c:(FFFFFI)V
        //   369: goto            373
        //   372: athrow         
        //   373: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //   376: getstatic       dev/nuker/pyro/fc.c:I
        //   379: ifge            387
        //   382: ldc             1096893937
        //   384: goto            389
        //   387: ldc             -1899836023
        //   389: ldc             -1455377050
        //   391: ixor           
        //   392: lookupswitch {
        //          -400428905: 387
        //          662862063: 420
        //          default: 1425
        //        }
        //   420: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   423: goto            427
        //   426: athrow         
        //   427: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70005_c_:()Ljava/lang/String;
        //   430: goto            434
        //   433: athrow         
        //   434: getstatic       dev/nuker/pyro/fc.1:I
        //   437: ifeq            445
        //   440: ldc             -895757132
        //   442: goto            447
        //   445: ldc             -1419338368
        //   447: ldc             532833208
        //   449: ixor           
        //   450: lookupswitch {
        //          -839116779: 445
        //          -715540724: 1423
        //          default: 476
        //        }
        //   476: aload_0        
        //   477: goto            481
        //   480: athrow         
        //   481: invokevirtual   dev/nuker/pyro/f4t.c:()F
        //   484: goto            488
        //   487: athrow         
        //   488: ldc             128.0
        //   490: fsub           
        //   491: aload_0        
        //   492: getstatic       dev/nuker/pyro/fc.1:I
        //   495: ifeq            503
        //   498: ldc             -2141346670
        //   500: goto            505
        //   503: ldc             -328584248
        //   505: ldc             367709745
        //   507: ixor           
        //   508: lookupswitch {
        //          -1783141725: 1393
        //          148840541: 503
        //          default: 536
        //        }
        //   536: goto            540
        //   539: athrow         
        //   540: invokevirtual   dev/nuker/pyro/f4t.3:()F
        //   543: goto            547
        //   546: athrow         
        //   547: ldc             47.0
        //   549: fsub           
        //   550: iconst_m1      
        //   551: goto            555
        //   554: athrow         
        //   555: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //   558: goto            562
        //   561: athrow         
        //   562: getstatic       dev/nuker/pyro/fc.c:I
        //   565: ifge            573
        //   568: ldc             1748575754
        //   570: goto            575
        //   573: ldc             1678837350
        //   575: ldc             -945434217
        //   577: ixor           
        //   578: lookupswitch {
        //          -1548429327: 604
        //          -1348667491: 573
        //          default: 1427
        //        }
        //   604: aload_0        
        //   605: getstatic       dev/nuker/pyro/fc.0:I
        //   608: ifeq            616
        //   611: ldc             733659670
        //   613: goto            618
        //   616: ldc             1023713688
        //   618: ldc             -2076084127
        //   620: ixor           
        //   621: lookupswitch {
        //          -1342457225: 616
        //          -1186604551: 648
        //          default: 1419
        //        }
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   dev/nuker/pyro/f4t.c:()F
        //   655: goto            659
        //   658: athrow         
        //   659: f2i            
        //   660: bipush          116
        //   662: isub           
        //   663: aload_0        
        //   664: getstatic       dev/nuker/pyro/fc.1:I
        //   667: ifeq            675
        //   670: ldc             1688148939
        //   672: goto            677
        //   675: ldc             1882248288
        //   677: ldc             -1427207124
        //   679: ixor           
        //   680: lookupswitch {
        //          -1889826429: 675
        //          -831416345: 1401
        //          default: 708
        //        }
        //   708: goto            712
        //   711: athrow         
        //   712: invokevirtual   dev/nuker/pyro/f4t.3:()F
        //   715: goto            719
        //   718: athrow         
        //   719: f2i            
        //   720: iconst_4       
        //   721: isub           
        //   722: bipush          18
        //   724: fload           4
        //   726: fload           5
        //   728: getstatic       dev/nuker/pyro/fc.c:I
        //   731: ifge            739
        //   734: ldc             1248911020
        //   736: goto            741
        //   739: ldc             2046101639
        //   741: ldc             900114353
        //   743: ixor           
        //   744: lookupswitch {
        //          601968987: 739
        //          2144762141: 1429
        //          default: 772
        //        }
        //   772: getstatic       dev/nuker/pyro/f4t.c:Lnet/minecraft/client/Minecraft;
        //   775: getstatic       dev/nuker/pyro/fc.c:I
        //   778: ifge            786
        //   781: ldc             -1079936964
        //   783: goto            788
        //   786: ldc             -1781520411
        //   788: ldc             -1508660631
        //   790: ixor           
        //   791: lookupswitch {
        //          -1397083657: 786
        //          431149653: 1411
        //          default: 816
        //        }
        //   816: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   819: getstatic       dev/nuker/pyro/fc.1:I
        //   822: ifeq            830
        //   825: ldc             -1249390531
        //   827: goto            832
        //   830: ldc             1661436900
        //   832: ldc             715126722
        //   834: ixor           
        //   835: lookupswitch {
        //          -1625806849: 830
        //          1234727974: 860
        //          default: 1399
        //        }
        //   860: goto            864
        //   863: athrow         
        //   864: invokestatic    net/minecraft/client/gui/inventory/GuiInventory.func_147046_a:(IIIFFLnet/minecraft/entity/EntityLivingBase;)V
        //   867: goto            871
        //   870: athrow         
        //   871: ldc             31.0
        //   873: ldc             16.0
        //   875: aload_0        
        //   876: getstatic       dev/nuker/pyro/fc.c:I
        //   879: ifge            887
        //   882: ldc             159875566
        //   884: goto            889
        //   887: ldc             1593098014
        //   889: ldc             1381300494
        //   891: ixor           
        //   892: lookupswitch {
        //          -1903681796: 887
        //          1540585696: 1409
        //          default: 920
        //        }
        //   920: goto            924
        //   923: athrow         
        //   924: invokevirtual   dev/nuker/pyro/f4t.c:()F
        //   927: goto            931
        //   930: athrow         
        //   931: fload           7
        //   933: fsub           
        //   934: ldc             4.0
        //   936: fsub           
        //   937: ldc             29.0
        //   939: ldc             -1720975536
        //   941: goto            945
        //   944: athrow         
        //   945: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //   948: goto            952
        //   951: athrow         
        //   952: new             Ljava/lang/StringBuilder;
        //   955: dup            
        //   956: goto            960
        //   959: athrow         
        //   960: invokespecial   java/lang/StringBuilder.<init>:()V
        //   963: goto            967
        //   966: athrow         
        //   967: ldc             "\u23ca\u1496\u8afa\ub1c4\ucfc4\uedec\ub27e\ue696"
        //   969: getstatic       dev/nuker/pyro/fc.c:I
        //   972: ifge            980
        //   975: ldc             1143721129
        //   977: goto            982
        //   980: ldc             -1448955902
        //   982: ldc             225585479
        //   984: ixor           
        //   985: lookupswitch {
        //          -1783308764: 980
        //          1230628334: 1397
        //          default: 1012
        //        }
        //  1012: goto            1016
        //  1015: athrow         
        //  1016: invokestatic    invokestatic   !!! ERROR
        //  1019: goto            1023
        //  1022: athrow         
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1030: goto            1034
        //  1033: athrow         
        //  1034: fload           6
        //  1036: f2i            
        //  1037: goto            1041
        //  1040: athrow         
        //  1041: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1044: goto            1048
        //  1047: athrow         
        //  1048: ldc             "%"
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1057: goto            1061
        //  1060: athrow         
        //  1061: goto            1065
        //  1064: athrow         
        //  1065: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: ldc             34.0
        //  1074: ldc             19.0
        //  1076: iconst_m1      
        //  1077: goto            1081
        //  1080: athrow         
        //  1081: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1084: goto            1088
        //  1087: athrow         
        //  1088: ldc             31.0
        //  1090: ldc             33.0
        //  1092: getstatic       dev/nuker/pyro/fc.1:I
        //  1095: ifeq            1103
        //  1098: ldc             -434516445
        //  1100: goto            1105
        //  1103: ldc             -2108525220
        //  1105: ldc             834284479
        //  1107: ixor           
        //  1108: lookupswitch {
        //          -1276616989: 1136
        //          -677124708: 1103
        //          default: 1413
        //        }
        //  1136: aload_0        
        //  1137: getstatic       dev/nuker/pyro/fc.c:I
        //  1140: ifge            1148
        //  1143: ldc             -1480701213
        //  1145: goto            1150
        //  1148: ldc             171228040
        //  1150: ldc             1087943722
        //  1152: ixor           
        //  1153: lookupswitch {
        //          -412680503: 1148
        //          1256984482: 1180
        //          default: 1431
        //        }
        //  1180: goto            1184
        //  1183: athrow         
        //  1184: invokevirtual   dev/nuker/pyro/f4t.c:()F
        //  1187: goto            1191
        //  1190: athrow         
        //  1191: getstatic       dev/nuker/pyro/fc.1:I
        //  1194: ifeq            1202
        //  1197: ldc             -1027748080
        //  1199: goto            1204
        //  1202: ldc             -1314851446
        //  1204: ldc             1724182175
        //  1206: ixor           
        //  1207: lookupswitch {
        //          -1535565425: 1202
        //          -681305323: 1232
        //          default: 1407
        //        }
        //  1232: fload           9
        //  1234: fsub           
        //  1235: ldc             4.0
        //  1237: fsub           
        //  1238: ldc             46.0
        //  1240: ldc             -1711295152
        //  1242: goto            1246
        //  1245: athrow         
        //  1246: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: new             Ljava/lang/StringBuilder;
        //  1256: dup            
        //  1257: goto            1261
        //  1260: athrow         
        //  1261: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: ldc             "\u23c3\u1491\u8ae8\ub1c7\ucfc2\uedf4\ub230\ue6df\udb76\uefad\ua77e\u1e0c"
        //  1270: goto            1274
        //  1273: athrow         
        //  1274: invokestatic    invokestatic   !!! ERROR
        //  1277: goto            1281
        //  1280: athrow         
        //  1281: goto            1285
        //  1284: athrow         
        //  1285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1288: goto            1292
        //  1291: athrow         
        //  1292: fload           8
        //  1294: f2i            
        //  1295: goto            1299
        //  1298: athrow         
        //  1299: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1302: goto            1306
        //  1305: athrow         
        //  1306: ldc             "%"
        //  1308: goto            1312
        //  1311: athrow         
        //  1312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1315: goto            1319
        //  1318: athrow         
        //  1319: getstatic       dev/nuker/pyro/fc.1:I
        //  1322: ifeq            1330
        //  1325: ldc             1939541746
        //  1327: goto            1332
        //  1330: ldc             2126904519
        //  1332: ldc             -473993618
        //  1334: ixor           
        //  1335: lookupswitch {
        //          -1876664164: 1330
        //          -1652911447: 1360
        //          default: 1415
        //        }
        //  1360: goto            1364
        //  1363: athrow         
        //  1364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1367: goto            1371
        //  1370: athrow         
        //  1371: ldc             34.0
        //  1373: ldc             36.0
        //  1375: iconst_m1      
        //  1376: goto            1380
        //  1379: athrow         
        //  1380: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: goto            1392
        //  1390: astore          6
        //  1392: return         
        //  1393: aconst_null    
        //  1394: athrow         
        //  1395: aconst_null    
        //  1396: athrow         
        //  1397: aconst_null    
        //  1398: athrow         
        //  1399: aconst_null    
        //  1400: athrow         
        //  1401: aconst_null    
        //  1402: athrow         
        //  1403: aconst_null    
        //  1404: athrow         
        //  1405: aconst_null    
        //  1406: athrow         
        //  1407: aconst_null    
        //  1408: athrow         
        //  1409: aconst_null    
        //  1410: athrow         
        //  1411: aconst_null    
        //  1412: athrow         
        //  1413: aconst_null    
        //  1414: athrow         
        //  1415: aconst_null    
        //  1416: athrow         
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: aconst_null    
        //  1420: athrow         
        //  1421: aconst_null    
        //  1422: athrow         
        //  1423: aconst_null    
        //  1424: athrow         
        //  1425: aconst_null    
        //  1426: athrow         
        //  1427: aconst_null    
        //  1428: athrow         
        //  1429: aconst_null    
        //  1430: athrow         
        //  1431: aconst_null    
        //  1432: athrow         
        //  1433: pop            
        //  1434: goto            24
        //  1437: pop            
        //  1438: aconst_null    
        //  1439: goto            1433
        //  1442: dup            
        //  1443: ifnull          1433
        //  1446: checkcast       Ljava/lang/Throwable;
        //  1449: athrow         
        //  1450: dup            
        //  1451: ifnull          1437
        //  1454: checkcast       Ljava/lang/Throwable;
        //  1457: athrow         
        //  1458: aconst_null    
        //  1459: athrow         
        //    StackMapTable: 00 D9 43 07 00 59 04 FF 00 0B 00 00 00 01 07 00 59 FF 00 03 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 00 56 07 00 5E FF 00 01 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 07 00 5E 01 5E 07 00 5E 05 00 48 07 00 3A 40 07 00 6B 45 07 00 59 40 02 FF 00 0D 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 02 07 00 5E FF 00 01 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 03 02 07 00 5E 01 FF 00 1B 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 02 07 00 5E 45 07 00 59 FF 00 00 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 02 07 00 6B 45 07 00 59 FF 00 00 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 02 02 FD 00 17 02 02 41 01 1B 4D 07 00 5E FF 00 01 00 08 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 00 02 07 00 5E 01 5B 07 00 5E 45 07 00 59 40 07 00 6B 45 07 00 59 40 02 FF 00 1C 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 07 00 03 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 42 07 00 42 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 43 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 02 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 02 02 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 02 02 02 02 02 01 45 07 00 59 00 4D 07 00 5E FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 5E 01 5E 07 00 5E 45 07 00 59 40 07 00 6B 45 07 00 59 40 07 00 F1 4A 07 00 F1 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 F1 01 5C 07 00 F1 43 07 00 50 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 F1 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 F1 02 FF 00 0E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 F1 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 07 00 F1 02 07 00 03 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 F1 02 07 00 03 42 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 F1 02 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 F1 02 02 FF 00 06 00 00 00 01 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 07 00 F1 02 02 01 45 07 00 59 00 0A 41 01 1C 4B 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 03 01 5D 07 00 03 42 07 00 59 40 07 00 03 45 07 00 59 40 02 FF 00 0F 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 01 07 00 03 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 01 07 00 03 42 07 00 50 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 01 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 01 02 FF 00 13 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 05 01 01 01 02 02 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 05 01 01 01 02 02 FF 00 0D 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 5E FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 07 01 01 01 02 02 07 00 5E 01 FF 00 1B 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 5E FF 00 0D 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 6B FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 07 01 01 01 02 02 07 00 6B 01 FF 00 1B 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 6B 42 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 6B 45 07 00 59 00 FF 00 0F 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 07 00 03 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 42 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 4C 07 00 48 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 05 02 02 02 02 01 45 07 00 59 00 46 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 08 03 B8 08 03 B8 45 07 00 59 40 07 00 C4 FF 00 0C 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 C4 07 00 F1 01 FF 00 1D 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 42 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 42 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 40 07 00 C4 FF 00 05 00 00 00 01 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 01 45 07 00 59 40 07 00 C4 44 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 40 07 00 C4 42 07 00 59 40 07 00 C4 45 07 00 59 40 07 00 F1 FF 00 07 00 00 00 01 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 07 00 F1 02 02 01 45 07 00 59 00 FF 00 0E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 02 02 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 01 FF 00 1E 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 02 02 FF 00 0B 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 07 00 03 01 FF 00 1D 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 42 07 00 50 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 FF 00 0A 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 02 02 02 01 FF 00 1B 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 4C 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 05 02 02 02 02 01 45 07 00 59 00 FF 00 06 00 00 00 01 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 08 04 E5 08 04 E5 45 07 00 59 40 07 00 C4 44 07 00 50 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 42 07 00 54 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 40 07 00 C4 FF 00 05 00 00 00 01 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 01 45 07 00 59 40 07 00 C4 44 07 00 59 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 45 07 00 59 40 07 00 C4 4A 07 00 C4 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 01 5B 07 00 C4 42 07 00 59 40 07 00 C4 45 07 00 59 40 07 00 F1 47 07 00 50 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 04 07 00 F1 02 02 01 45 07 00 59 00 FF 00 02 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 01 07 00 34 01 FF 00 00 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 07 00 F1 02 07 00 03 FF 00 01 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 02 02 07 00 5E FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 07 00 C4 07 00 F1 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 6B FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 01 07 00 03 FF 00 01 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 01 07 00 5E FF 00 01 00 08 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 00 01 07 00 5E FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 02 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 06 01 01 01 02 02 07 00 5E FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 02 02 02 41 07 00 C4 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 41 07 00 03 F9 00 01 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 01 07 00 F1 41 07 00 5E 01 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 05 01 01 01 02 02 FF 00 01 00 0A 07 00 03 07 00 ED 01 07 00 EF 02 02 02 02 02 02 00 03 02 02 07 00 03 FF 00 01 00 06 07 00 03 07 00 ED 01 07 00 EF 02 02 00 01 07 00 50 43 05 44 07 00 50 47 05 47 07 00 59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  87     554    1390   1392   Ljava/lang/Exception;
        //  555    1040   1390   1392   Ljava/lang/Exception;
        //  1041   1080   1390   1392   Ljava/lang/Exception;
        //  1081   1260   1390   1392   Ljava/lang/Exception;
        //  1261   1298   1390   1392   Ljava/lang/Exception;
        //  1299   1387   1390   1392   Ljava/lang/Exception;
        //  8      20     1442   1450   Ljava/lang/IllegalArgumentException;
        //  1442   1450   1442   1450   Ljava/lang/IndexOutOfBoundsException;
        //  1458   1460   3      8      Any
        //  96     103    103    104    Any
        //  96     103    103    104    Any
        //  97     103    96     97     Ljava/lang/IllegalStateException;
        //  97     103    96     97     Ljava/lang/IllegalStateException;
        //  97     103    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  154    161    161    162    Any
        //  155    161    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  154    161    154    155    Ljava/lang/IndexOutOfBoundsException;
        //  155    161    154    155    Any
        //  155    161    3      8      Ljava/lang/IllegalArgumentException;
        //  266    273    273    274    Any
        //  267    273    273    274    Ljava/lang/IllegalArgumentException;
        //  267    273    273    274    Ljava/lang/NullPointerException;
        //  266    273    3      8      Any
        //  266    273    266    267    Any
        //  339    346    346    347    Any
        //  339    346    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  339    346    339    340    Ljava/lang/UnsupportedOperationException;
        //  340    346    3      8      Ljava/lang/NegativeArraySizeException;
        //  340    346    346    347    Any
        //  351    358    358    359    Any
        //  351    358    351    352    Ljava/lang/ClassCastException;
        //  352    358    351    352    Any
        //  352    358    351    352    Ljava/lang/EnumConstantNotPresentException;
        //  351    358    358    359    Any
        //  365    372    372    373    Any
        //  365    372    3      8      Ljava/lang/IllegalStateException;
        //  365    372    365    366    Ljava/lang/IndexOutOfBoundsException;
        //  365    372    365    366    Any
        //  366    372    372    373    Any
        //  426    433    433    434    Any
        //  426    433    433    434    Any
        //  427    433    3      8      Ljava/lang/ClassCastException;
        //  427    433    426    427    Any
        //  426    433    426    427    Any
        //  480    487    487    488    Any
        //  480    487    3      8      Any
        //  480    487    480    481    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  481    487    487    488    Ljava/lang/ClassCastException;
        //  481    487    480    481    Ljava/lang/NumberFormatException;
        //  539    546    546    547    Any
        //  540    546    3      8      Ljava/util/NoSuchElementException;
        //  540    546    546    547    Any
        //  540    546    3      8      Ljava/lang/NullPointerException;
        //  539    546    539    540    Any
        //  555    561    561    562    Any
        //  555    561    561    562    Ljava/lang/EnumConstantNotPresentException;
        //  555    561    561    562    Any
        //  555    561    561    562    Any
        //  555    561    3      8      Ljava/lang/NegativeArraySizeException;
        //  651    658    658    659    Any
        //  652    658    651    652    Any
        //  652    658    658    659    Any
        //  651    658    3      8      Any
        //  651    658    658    659    Any
        //  711    718    718    719    Any
        //  712    718    711    712    Ljava/lang/NegativeArraySizeException;
        //  711    718    711    712    Ljava/lang/IllegalStateException;
        //  712    718    3      8      Ljava/lang/NumberFormatException;
        //  711    718    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  863    870    870    871    Any
        //  864    870    863    864    Ljava/lang/IndexOutOfBoundsException;
        //  863    870    863    864    Any
        //  863    870    3      8      Ljava/lang/NumberFormatException;
        //  863    870    870    871    Any
        //  923    930    930    931    Any
        //  924    930    930    931    Ljava/lang/AssertionError;
        //  923    930    923    924    Any
        //  924    930    930    931    Ljava/lang/UnsupportedOperationException;
        //  924    930    3      8      Any
        //  944    951    951    952    Any
        //  944    951    951    952    Ljava/lang/RuntimeException;
        //  945    951    944    945    Ljava/lang/EnumConstantNotPresentException;
        //  944    951    3      8      Any
        //  945    951    951    952    Any
        //  959    966    966    967    Any
        //  959    966    3      8      Any
        //  959    966    959    960    Ljava/lang/NullPointerException;
        //  959    966    3      8      Ljava/lang/UnsupportedOperationException;
        //  960    966    959    960    Any
        //  1015   1022   1022   1023   Any
        //  1015   1022   1015   1016   Any
        //  1015   1022   1022   1023   Any
        //  1015   1022   3      8      Any
        //  1016   1022   3      8      Any
        //  1026   1033   1033   1034   Any
        //  1026   1033   1026   1027   Any
        //  1026   1033   1026   1027   Ljava/lang/NegativeArraySizeException;
        //  1026   1033   3      8      Any
        //  1026   1033   3      8      Any
        //  1041   1047   1047   1048   Any
        //  1041   1047   1047   1048   Any
        //  1041   1047   1047   1048   Any
        //  1041   1047   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1041   1047   3      8      Ljava/lang/AssertionError;
        //  1053   1060   1060   1061   Any
        //  1053   1060   1060   1061   Any
        //  1054   1060   1060   1061   Ljava/lang/NegativeArraySizeException;
        //  1054   1060   1053   1054   Any
        //  1053   1060   3      8      Any
        //  1064   1071   1071   1072   Any
        //  1064   1071   3      8      Any
        //  1065   1071   1064   1065   Any
        //  1065   1071   1071   1072   Any
        //  1064   1071   3      8      Any
        //  1081   1087   1087   1088   Any
        //  1081   1087   1087   1088   Ljava/lang/NegativeArraySizeException;
        //  1081   1087   3      8      Any
        //  1081   1087   1087   1088   Any
        //  1081   1087   1087   1088   Ljava/lang/ClassCastException;
        //  1183   1190   1190   1191   Any
        //  1183   1190   1183   1184   Ljava/lang/ClassCastException;
        //  1183   1190   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1184   1190   1183   1184   Ljava/lang/NumberFormatException;
        //  1184   1190   3      8      Ljava/lang/RuntimeException;
        //  1245   1252   1252   1253   Any
        //  1246   1252   1245   1246   Any
        //  1246   1252   1252   1253   Any
        //  1245   1252   3      8      Any
        //  1245   1252   1252   1253   Any
        //  1261   1267   1267   1268   Any
        //  1261   1267   1267   1268   Any
        //  1261   1267   1267   1268   Ljava/lang/IndexOutOfBoundsException;
        //  1261   1267   1267   1268   Ljava/util/ConcurrentModificationException;
        //  1261   1267   3      8      Ljava/lang/UnsupportedOperationException;
        //  1273   1280   1280   1281   Any
        //  1273   1280   1273   1274   Ljava/util/ConcurrentModificationException;
        //  1273   1280   3      8      Any
        //  1274   1280   1280   1281   Ljava/lang/EnumConstantNotPresentException;
        //  1273   1280   1273   1274   Ljava/lang/NumberFormatException;
        //  1284   1291   1291   1292   Any
        //  1284   1291   1284   1285   Ljava/lang/ArithmeticException;
        //  1284   1291   3      8      Ljava/lang/IllegalArgumentException;
        //  1284   1291   1291   1292   Ljava/lang/ClassCastException;
        //  1284   1291   1291   1292   Any
        //  1299   1305   1305   1306   Any
        //  1299   1305   3      8      Any
        //  1299   1305   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1299   1305   1305   1306   Ljava/lang/ArithmeticException;
        //  1299   1305   3      8      Any
        //  1311   1318   1318   1319   Any
        //  1312   1318   1311   1312   Any
        //  1311   1318   1318   1319   Ljava/lang/IllegalStateException;
        //  1312   1318   1311   1312   Ljava/lang/EnumConstantNotPresentException;
        //  1312   1318   1318   1319   Ljava/lang/ClassCastException;
        //  1363   1370   1370   1371   Any
        //  1364   1370   1363   1364   Ljava/lang/NegativeArraySizeException;
        //  1363   1370   1363   1364   Any
        //  1363   1370   1370   1371   Ljava/lang/IllegalArgumentException;
        //  1363   1370   1363   1364   Any
        //  1379   1386   1386   1387   Any
        //  1380   1386   1379   1380   Ljava/lang/IllegalArgumentException;
        //  1379   1386   1379   1380   Ljava/lang/ArithmeticException;
        //  1379   1386   1379   1380   Ljava/lang/NumberFormatException;
        //  1380   1386   1379   1380   Ljava/lang/IllegalArgumentException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:618)
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
}
