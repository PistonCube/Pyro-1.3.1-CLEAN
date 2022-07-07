// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4f extends f49
{
    @Override
    public boolean 4() {
        return fbS.eJ(this, 913491003);
    }
    
    public f4f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23f1\u1481\u8ae4\ub3d6\uc9cd"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: getstatic       dev/nuker/pyro/fc.c:I
        //     9: ifge            17
        //    12: ldc             -1299330282
        //    14: goto            19
        //    17: ldc             -435616795
        //    19: ldc             -1145154752
        //    21: ixor           
        //    22: lookupswitch {
        //          -1924628038: 17
        //          154376278: 52
        //          default: 48
        //        }
        //    48: invokespecial   dev/nuker/pyro/f49.<init>:(Ljava/lang/String;)V
        //    51: return         
        //    52: aconst_null    
        //    53: athrow         
        //    StackMapTable: 00 04 FF 00 11 00 01 06 00 02 06 07 00 26 FF 00 01 00 01 06 00 03 06 07 00 26 01 FF 00 1C 00 01 06 00 02 06 07 00 26 FF 00 03 00 01 06 00 02 06 07 00 26
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
    
    static {
        throw t;
    }
    
    @Override
    public float c() {
        return fbS.as(this, 922655146);
    }
    
    @Override
    public void c(final f4d p0, final int p1, final ScaledResolution p2, final float p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1550
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1542
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1534
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    30: goto            34
        //    33: athrow         
        //    34: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184193_aE:()Ljava/lang/Iterable;
        //    37: goto            41
        //    40: athrow         
        //    41: goto            45
        //    44: athrow         
        //    45: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    50: goto            54
        //    53: athrow         
        //    54: getstatic       dev/nuker/pyro/fc.0:I
        //    57: ifeq            65
        //    60: ldc             -2063847200
        //    62: goto            67
        //    65: ldc             1353875156
        //    67: ldc             1010820908
        //    69: ixor           
        //    70: lookupswitch {
        //          -1195124788: 1513
        //          -401739238: 65
        //          default: 96
        //        }
        //    96: astore          6
        //    98: new             Ljava/util/ArrayList;
        //   101: dup            
        //   102: goto            106
        //   105: athrow         
        //   106: invokespecial   java/util/ArrayList.<init>:()V
        //   109: goto            113
        //   112: athrow         
        //   113: astore          7
        //   115: aload           6
        //   117: getstatic       dev/nuker/pyro/fc.c:I
        //   120: ifge            128
        //   123: ldc             2130806742
        //   125: goto            130
        //   128: ldc             316406618
        //   130: ldc             -1668250173
        //   132: ixor           
        //   133: lookupswitch {
        //          -1907655015: 160
        //          -477036011: 128
        //          default: 1511
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokeinterface java/util/Iterator.hasNext:()Z
        //   169: goto            173
        //   172: athrow         
        //   173: ifeq            181
        //   176: ldc             -644011363
        //   178: goto            183
        //   181: ldc             -644011364
        //   183: ldc             -1878989381
        //   185: ixor           
        //   186: tableswitch {
        //          -1824809396: 208
        //          -1824809395: 307
        //          default: 176
        //        }
        //   208: aload           6
        //   210: goto            214
        //   213: athrow         
        //   214: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   219: goto            223
        //   222: athrow         
        //   223: checkcast       Lnet/minecraft/item/ItemStack;
        //   226: astore          8
        //   228: aload           8
        //   230: goto            234
        //   233: athrow         
        //   234: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   237: goto            241
        //   240: athrow         
        //   241: ifne            304
        //   244: aload           7
        //   246: aload           8
        //   248: getstatic       dev/nuker/pyro/fc.0:I
        //   251: ifeq            259
        //   254: ldc             -1044349016
        //   256: goto            261
        //   259: ldc             2074307268
        //   261: ldc             753811873
        //   263: ixor           
        //   264: lookupswitch {
        //          -315736567: 259
        //          1464675173: 292
        //          default: 1505
        //        }
        //   292: goto            296
        //   295: athrow         
        //   296: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   299: goto            303
        //   302: athrow         
        //   303: pop            
        //   304: goto            115
        //   307: getstatic       dev/nuker/pyro/fc.c:I
        //   310: ifge            318
        //   313: ldc             1755187744
        //   315: goto            320
        //   318: ldc             -1680166512
        //   320: ldc             -642400783
        //   322: ixor           
        //   323: lookupswitch {
        //          -1322534959: 1489
        //          -556469020: 318
        //          default: 348
        //        }
        //   348: aload           7
        //   350: goto            354
        //   353: athrow         
        //   354: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //   357: goto            361
        //   360: athrow         
        //   361: iconst_0       
        //   362: istore          8
        //   364: iconst_0       
        //   365: istore          9
        //   367: aload           7
        //   369: getstatic       dev/nuker/pyro/fc.1:I
        //   372: ifeq            380
        //   375: ldc             661775610
        //   377: goto            382
        //   380: ldc             -1666343995
        //   382: ldc             790994783
        //   384: ixor           
        //   385: lookupswitch {
        //          -487143095: 380
        //          139754405: 1503
        //          default: 412
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   419: goto            423
        //   422: athrow         
        //   423: astore          10
        //   425: aload           10
        //   427: goto            431
        //   430: athrow         
        //   431: invokeinterface java/util/Iterator.hasNext:()Z
        //   436: goto            440
        //   439: athrow         
        //   440: ifeq            1488
        //   443: aload           10
        //   445: goto            449
        //   448: athrow         
        //   449: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   454: goto            458
        //   457: athrow         
        //   458: checkcast       Lnet/minecraft/item/ItemStack;
        //   461: getstatic       dev/nuker/pyro/fc.c:I
        //   464: ifge            472
        //   467: ldc             -1070331957
        //   469: goto            474
        //   472: ldc             -682709291
        //   474: ldc             323428252
        //   476: ixor           
        //   477: lookupswitch {
        //          -747431849: 1497
        //          469621175: 472
        //          default: 504
        //        }
        //   504: astore          11
        //   506: getstatic       dev/nuker/pyro/fc.0:I
        //   509: ifeq            517
        //   512: ldc             60500288
        //   514: goto            519
        //   517: ldc             1413221181
        //   519: ldc             -2039698660
        //   521: ixor           
        //   522: lookupswitch {
        //          -2047376804: 1521
        //          962167424: 517
        //          default: 548
        //        }
        //   548: goto            552
        //   551: athrow         
        //   552: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   555: goto            559
        //   558: athrow         
        //   559: iconst_1       
        //   560: getstatic       dev/nuker/pyro/fc.c:I
        //   563: ifge            571
        //   566: ldc             -1220424878
        //   568: goto            573
        //   571: ldc             2131268611
        //   573: ldc             512048672
        //   575: ixor           
        //   576: lookupswitch {
        //          -1446709902: 1517
        //          514192889: 571
        //          default: 604
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //   611: goto            615
        //   614: athrow         
        //   615: sipush          256
        //   618: goto            622
        //   621: athrow         
        //   622: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179086_m:(I)V
        //   625: goto            629
        //   628: athrow         
        //   629: goto            633
        //   632: athrow         
        //   633: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74519_b:()V
        //   636: goto            640
        //   639: athrow         
        //   640: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //   643: goto            647
        //   646: athrow         
        //   647: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   650: goto            654
        //   653: athrow         
        //   654: ldc             -150.0
        //   656: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //   659: goto            663
        //   662: athrow         
        //   663: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179118_c:()V
        //   666: goto            670
        //   669: athrow         
        //   670: goto            674
        //   673: athrow         
        //   674: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //   677: goto            681
        //   680: athrow         
        //   681: goto            685
        //   684: athrow         
        //   685: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179129_p:()V
        //   688: goto            692
        //   691: athrow         
        //   692: getstatic       dev/nuker/pyro/fc.1:I
        //   695: ifeq            703
        //   698: ldc             -398860420
        //   700: goto            705
        //   703: ldc             45546909
        //   705: ldc             -1896051273
        //   707: ixor           
        //   708: lookupswitch {
        //          -1941278678: 736
        //          1724207819: 703
        //          default: 1509
        //        }
        //   736: aload           11
        //   738: getstatic       dev/nuker/pyro/fc.0:I
        //   741: ifeq            749
        //   744: ldc             297271512
        //   746: goto            751
        //   749: ldc             -1425471945
        //   751: ldc             1573354048
        //   753: ixor           
        //   754: lookupswitch {
        //          -154239881: 780
        //          1283422872: 749
        //          default: 1507
        //        }
        //   780: goto            784
        //   783: athrow         
        //   784: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   787: goto            791
        //   790: athrow         
        //   791: aload           11
        //   793: goto            797
        //   796: athrow         
        //   797: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //   800: goto            804
        //   803: athrow         
        //   804: isub           
        //   805: i2f            
        //   806: getstatic       dev/nuker/pyro/fc.1:I
        //   809: ifeq            817
        //   812: ldc             1450463382
        //   814: goto            819
        //   817: ldc             -1498150183
        //   819: ldc             1168556304
        //   821: ixor           
        //   822: lookupswitch {
        //          332566918: 1523
        //          2075302297: 817
        //          default: 848
        //        }
        //   848: aload           11
        //   850: goto            854
        //   853: athrow         
        //   854: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   857: goto            861
        //   860: athrow         
        //   861: i2f            
        //   862: fdiv           
        //   863: ldc             100.0
        //   865: fmul           
        //   866: fstore          12
        //   868: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //   871: getstatic       dev/nuker/pyro/fc.0:I
        //   874: ifeq            882
        //   877: ldc             -2007362914
        //   879: goto            884
        //   882: ldc             -1382065181
        //   884: ldc             -469293355
        //   886: ixor           
        //   887: lookupswitch {
        //          1234730294: 912
        //          1818047563: 882
        //          default: 1491
        //        }
        //   912: goto            916
        //   915: athrow         
        //   916: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   919: goto            923
        //   922: athrow         
        //   923: getstatic       dev/nuker/pyro/fc.0:I
        //   926: ifeq            934
        //   929: ldc             1158453810
        //   931: goto            936
        //   934: ldc             430632485
        //   936: ldc             -302414412
        //   938: ixor           
        //   939: lookupswitch {
        //          -1460330618: 934
        //          -195859567: 964
        //          default: 1515
        //        }
        //   964: aload           11
        //   966: iload           8
        //   968: bipush          10
        //   970: goto            974
        //   973: athrow         
        //   974: invokevirtual   net/minecraft/client/renderer/RenderItem.func_180450_b:(Lnet/minecraft/item/ItemStack;II)V
        //   977: goto            981
        //   980: athrow         
        //   981: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //   984: getstatic       dev/nuker/pyro/fc.c:I
        //   987: ifge            995
        //   990: ldc             1758703568
        //   992: goto            997
        //   995: ldc             -362074118
        //   997: ldc             -1307457095
        //   999: ixor           
        //  1000: lookupswitch {
        //          -624794007: 1519
        //          663570921: 995
        //          default: 1028
        //        }
        //  1028: goto            1032
        //  1031: athrow         
        //  1032: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //  1035: goto            1039
        //  1038: athrow         
        //  1039: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //  1042: getstatic       dev/nuker/pyro/fc.1:I
        //  1045: ifeq            1053
        //  1048: ldc             -1204062264
        //  1050: goto            1055
        //  1053: ldc             -2039429472
        //  1055: ldc             664146774
        //  1057: ixor           
        //  1058: lookupswitch {
        //          -1616026466: 1495
        //          -822076736: 1053
        //          default: 1084
        //        }
        //  1084: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  1087: aload           11
        //  1089: iload           8
        //  1091: bipush          10
        //  1093: getstatic       dev/nuker/pyro/fc.c:I
        //  1096: ifge            1104
        //  1099: ldc             564734890
        //  1101: goto            1106
        //  1104: ldc             1483444989
        //  1106: ldc             853882567
        //  1108: ixor           
        //  1109: lookupswitch {
        //          -804124960: 1104
        //          323755373: 1499
        //          default: 1136
        //        }
        //  1136: goto            1140
        //  1139: athrow         
        //  1140: invokevirtual   net/minecraft/client/renderer/RenderItem.func_175030_a:(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;II)V
        //  1143: goto            1147
        //  1146: athrow         
        //  1147: ldc             2096896
        //  1149: istore          13
        //  1151: fload           12
        //  1153: ldc             30.0
        //  1155: fcmpl          
        //  1156: ifle            1174
        //  1159: fload           12
        //  1161: ldc             70.0
        //  1163: fcmpg          
        //  1164: ifge            1174
        //  1167: ldc             16776960
        //  1169: istore          13
        //  1171: goto            1186
        //  1174: fload           12
        //  1176: ldc             30.0
        //  1178: fcmpg          
        //  1179: ifgt            1186
        //  1182: ldc             16711680
        //  1184: istore          13
        //  1186: fload           12
        //  1188: f2i            
        //  1189: goto            1193
        //  1192: athrow         
        //  1193: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1196: goto            1200
        //  1199: athrow         
        //  1200: astore          14
        //  1202: bipush          15
        //  1204: istore          15
        //  1206: aload           14
        //  1208: goto            1212
        //  1211: athrow         
        //  1212: invokevirtual   java/lang/String.length:()I
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: iconst_2       
        //  1220: if_icmpne       1229
        //  1223: ldc_w           -213689078
        //  1226: goto            1232
        //  1229: ldc_w           -213689035
        //  1232: ldc_w           -1804626539
        //  1235: ixor           
        //  1236: tableswitch {
        //          -832990914: 1260
        //          -832990913: 1266
        //          default: 1223
        //        }
        //  1260: iinc            15, -2
        //  1263: goto            1286
        //  1266: aload           14
        //  1268: goto            1272
        //  1271: athrow         
        //  1272: invokevirtual   java/lang/String.length:()I
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: iconst_1       
        //  1280: if_icmpne       1286
        //  1283: iinc            15, -4
        //  1286: aload           14
        //  1288: iload           8
        //  1290: iload           15
        //  1292: iadd           
        //  1293: iconst_2       
        //  1294: iadd           
        //  1295: i2f            
        //  1296: aload           14
        //  1298: getstatic       dev/nuker/pyro/fc.c:I
        //  1301: ifge            1310
        //  1304: ldc_w           -1258812007
        //  1307: goto            1313
        //  1310: ldc_w           874397156
        //  1313: ldc_w           -805126257
        //  1316: ixor           
        //  1317: lookupswitch {
        //          -467893653: 1344
        //          1694151190: 1310
        //          default: 1501
        //        }
        //  1344: goto            1348
        //  1347: athrow         
        //  1348: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;)F
        //  1351: goto            1355
        //  1354: athrow         
        //  1355: fsub           
        //  1356: fconst_2       
        //  1357: getstatic       dev/nuker/pyro/fc.0:I
        //  1360: ifeq            1369
        //  1363: ldc_w           -734136821
        //  1366: goto            1372
        //  1369: ldc_w           683947448
        //  1372: ldc_w           -1765729562
        //  1375: ixor           
        //  1376: lookupswitch {
        //          -1299277166: 1369
        //          1123871981: 1493
        //          default: 1404
        //        }
        //  1404: iload           13
        //  1406: goto            1410
        //  1409: athrow         
        //  1410: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1413: goto            1417
        //  1416: athrow         
        //  1417: iinc            8, 22
        //  1420: iinc            9, 22
        //  1423: getstatic       dev/nuker/pyro/f4f.c:Lnet/minecraft/client/Minecraft;
        //  1426: goto            1430
        //  1429: athrow         
        //  1430: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //  1433: goto            1437
        //  1436: athrow         
        //  1437: fconst_0       
        //  1438: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //  1441: goto            1445
        //  1444: athrow         
        //  1445: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74518_a:()V
        //  1448: goto            1452
        //  1451: athrow         
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179089_o:()V
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179141_d:()V
        //  1470: goto            1474
        //  1473: athrow         
        //  1474: goto            1478
        //  1477: athrow         
        //  1478: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  1481: goto            1485
        //  1484: athrow         
        //  1485: goto            425
        //  1488: return         
        //  1489: aconst_null    
        //  1490: athrow         
        //  1491: aconst_null    
        //  1492: athrow         
        //  1493: aconst_null    
        //  1494: athrow         
        //  1495: aconst_null    
        //  1496: athrow         
        //  1497: aconst_null    
        //  1498: athrow         
        //  1499: aconst_null    
        //  1500: athrow         
        //  1501: aconst_null    
        //  1502: athrow         
        //  1503: aconst_null    
        //  1504: athrow         
        //  1505: aconst_null    
        //  1506: athrow         
        //  1507: aconst_null    
        //  1508: athrow         
        //  1509: aconst_null    
        //  1510: athrow         
        //  1511: aconst_null    
        //  1512: athrow         
        //  1513: aconst_null    
        //  1514: athrow         
        //  1515: aconst_null    
        //  1516: athrow         
        //  1517: aconst_null    
        //  1518: athrow         
        //  1519: aconst_null    
        //  1520: athrow         
        //  1521: aconst_null    
        //  1522: athrow         
        //  1523: aconst_null    
        //  1524: athrow         
        //  1525: pop            
        //  1526: goto            24
        //  1529: pop            
        //  1530: aconst_null    
        //  1531: goto            1525
        //  1534: dup            
        //  1535: ifnull          1525
        //  1538: checkcast       Ljava/lang/Throwable;
        //  1541: athrow         
        //  1542: dup            
        //  1543: ifnull          1529
        //  1546: checkcast       Ljava/lang/Throwable;
        //  1549: athrow         
        //  1550: aconst_null    
        //  1551: athrow         
        //    StackMapTable: 00 F2 43 07 00 54 04 FF 00 0B 00 00 00 01 07 00 54 FF 00 03 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 00 FF 00 08 00 00 00 01 07 00 54 FF 00 00 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 01 07 00 5F 45 07 00 54 40 07 00 65 FF 00 02 00 00 00 01 07 00 54 FF 00 00 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 01 07 00 65 47 07 00 54 40 07 00 77 4A 07 00 77 FF 00 01 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 02 07 00 77 01 5C 07 00 77 FF 00 08 00 07 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 00 01 07 00 54 FF 00 00 00 07 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 00 02 08 00 62 08 00 62 45 07 00 54 40 07 00 70 FC 00 01 07 00 70 4C 07 00 77 FF 00 01 00 08 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 00 02 07 00 77 01 5D 07 00 77 42 07 00 54 40 07 00 77 47 07 00 54 40 01 02 04 41 01 18 44 07 00 3D 40 07 00 77 47 07 00 54 40 07 01 24 FF 00 09 00 00 00 01 07 00 54 FF 00 00 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 01 07 00 83 45 07 00 54 40 01 FF 00 11 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 02 07 00 70 07 00 83 FF 00 01 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 03 07 00 70 07 00 83 01 FF 00 1E 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 02 07 00 70 07 00 83 42 07 00 31 FF 00 00 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 02 07 00 70 07 00 83 45 07 00 54 40 01 00 FA 00 02 0A 41 01 1B 44 07 00 3D 40 07 00 70 45 07 00 54 00 FF 00 12 00 0A 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 00 01 07 00 70 FF 00 01 00 0A 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 00 02 07 00 70 01 5D 07 00 70 42 07 00 54 40 07 00 70 45 07 00 54 40 07 00 77 FC 00 01 07 00 77 44 07 00 3D 40 07 00 77 47 07 00 54 40 01 47 07 00 54 40 07 00 77 47 07 00 54 40 07 01 24 4D 07 00 83 FF 00 01 00 0B 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 00 02 07 00 83 01 5D 07 00 83 FC 00 0C 07 00 83 41 01 1C 42 07 00 54 00 45 07 00 54 00 4B 01 FF 00 01 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 01 01 5E 01 FF 00 02 00 00 00 01 07 00 54 FF 00 00 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 01 01 45 07 00 54 00 45 07 00 54 40 01 45 07 00 54 00 42 07 00 4D 00 45 07 00 54 00 45 07 00 54 40 07 00 59 45 07 00 54 40 07 00 BC 47 07 00 3D 00 45 07 00 54 00 42 07 00 37 00 45 07 00 54 00 42 07 00 54 00 45 07 00 54 00 0A 41 01 1E 4C 07 00 83 FF 00 01 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 07 00 83 01 5C 07 00 83 42 07 00 47 40 07 00 83 45 07 00 54 40 01 44 07 00 54 FF 00 00 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 01 07 00 83 45 07 00 54 FF 00 00 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 01 01 4C 02 FF 00 01 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 02 01 5C 02 44 07 00 3D FF 00 00 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 02 07 00 83 45 07 00 54 FF 00 00 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 02 02 01 FF 00 14 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 01 07 00 59 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 59 01 5B 07 00 59 42 07 00 35 40 07 00 59 45 07 00 54 40 07 00 BC 4A 07 00 BC FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 BC 01 5B 07 00 BC 48 07 00 54 FF 00 00 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 04 07 00 BC 07 00 83 01 01 45 07 00 54 00 4D 07 00 59 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 59 01 5E 07 00 59 42 07 00 43 40 07 00 59 45 07 00 54 40 07 00 BC FF 00 0D 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 BC 07 00 59 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 03 07 00 BC 07 00 59 01 FF 00 1C 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 BC 07 00 59 FF 00 13 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 05 07 00 BC 07 01 26 07 00 83 01 01 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 06 07 00 BC 07 01 26 07 00 83 01 01 01 FF 00 1D 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 05 07 00 BC 07 01 26 07 00 83 01 01 42 07 00 54 FF 00 00 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 05 07 00 BC 07 01 26 07 00 83 01 01 45 07 00 54 00 FC 00 1A 01 0B FF 00 05 00 00 00 01 07 00 54 FF 00 00 00 0E 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 00 01 01 45 07 00 54 40 07 00 26 FF 00 0A 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 01 07 00 54 40 07 00 26 45 07 00 54 40 01 03 05 42 01 1B 05 44 07 00 54 40 07 00 26 45 07 00 54 40 01 06 FF 00 17 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 07 00 26 FF 00 02 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 04 07 00 26 02 07 00 26 01 FF 00 1E 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 07 00 26 42 07 00 3D FF 00 00 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 07 00 26 45 07 00 54 FF 00 00 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 02 FF 00 0D 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 02 FF 00 02 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 04 07 00 26 02 02 01 FF 00 1F 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 02 44 07 00 54 FF 00 00 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 04 07 00 26 02 02 01 45 07 00 54 00 4B 07 00 54 40 07 00 59 45 07 00 54 40 07 00 BC FF 00 06 00 00 00 01 07 00 54 FF 00 00 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 00 45 07 00 54 00 42 07 00 54 00 45 07 00 54 00 42 07 00 54 00 45 07 00 54 00 FF 00 02 00 00 00 01 07 00 54 FF 00 00 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 00 45 07 00 54 00 FF 00 02 00 0B 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 00 00 F8 00 00 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 01 07 00 59 FF 00 01 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 02 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 02 07 00 BC 07 00 59 FF 00 01 00 0B 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 00 01 07 00 83 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 05 07 00 BC 07 01 26 07 00 83 01 01 FF 00 01 00 10 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 01 07 00 26 01 00 03 07 00 26 02 07 00 26 FF 00 01 00 0A 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 00 01 07 00 70 FF 00 01 00 09 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 07 00 83 00 02 07 00 70 07 00 83 FF 00 01 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 01 07 00 83 01 FF 00 01 00 08 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 00 01 07 00 77 FF 00 01 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 01 07 00 77 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 01 07 00 BC FF 00 01 00 0C 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 00 01 01 FF 00 01 00 0D 07 00 03 07 01 20 01 07 01 22 02 02 07 00 77 07 00 70 01 01 07 00 77 07 00 83 02 00 01 07 00 59 FA 00 01 41 02 FF 00 01 00 06 07 00 03 07 01 20 01 07 01 22 02 02 00 01 07 00 54 43 05 44 07 00 54 47 05 47 07 00 54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1534   1542   Any
        //  1534   1542   1534   1542   Any
        //  1550   1552   3      8      Ljava/lang/IllegalArgumentException;
        //  34     40     40     41     Any
        //  34     40     40     41     Ljava/lang/UnsupportedOperationException;
        //  34     40     3      8      Any
        //  34     40     3      8      Ljava/lang/UnsupportedOperationException;
        //  34     40     3      8      Ljava/util/ConcurrentModificationException;
        //  45     53     53     54     Any
        //  45     53     53     54     Ljava/lang/EnumConstantNotPresentException;
        //  45     53     3      8      Any
        //  45     53     3      8      Ljava/lang/AssertionError;
        //  45     53     53     54     Any
        //  105    112    112    113    Any
        //  105    112    105    106    Any
        //  105    112    112    113    Ljava/lang/IllegalStateException;
        //  105    112    105    106    Ljava/lang/IllegalStateException;
        //  105    112    3      8      Ljava/lang/RuntimeException;
        //  163    172    172    173    Any
        //  164    172    3      8      Ljava/lang/NumberFormatException;
        //  163    172    3      8      Ljava/lang/UnsupportedOperationException;
        //  163    172    163    164    Any
        //  164    172    172    173    Ljava/lang/IllegalStateException;
        //  213    222    222    223    Any
        //  214    222    213    214    Ljava/util/NoSuchElementException;
        //  213    222    3      8      Any
        //  214    222    222    223    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  213    222    213    214    Ljava/lang/IllegalArgumentException;
        //  234    240    240    241    Any
        //  234    240    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  234    240    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  234    240    240    241    Any
        //  234    240    3      8      Ljava/lang/IllegalStateException;
        //  295    302    302    303    Any
        //  295    302    302    303    Ljava/lang/NegativeArraySizeException;
        //  295    302    295    296    Ljava/lang/IllegalArgumentException;
        //  296    302    302    303    Any
        //  296    302    302    303    Ljava/lang/StringIndexOutOfBoundsException;
        //  353    360    360    361    Any
        //  353    360    360    361    Ljava/lang/IllegalArgumentException;
        //  354    360    360    361    Any
        //  353    360    353    354    Ljava/lang/NumberFormatException;
        //  353    360    353    354    Ljava/lang/StringIndexOutOfBoundsException;
        //  415    422    422    423    Any
        //  415    422    415    416    Any
        //  415    422    3      8      Ljava/lang/NullPointerException;
        //  416    422    422    423    Ljava/lang/NumberFormatException;
        //  416    422    415    416    Any
        //  430    439    439    440    Any
        //  431    439    430    431    Ljava/lang/StringIndexOutOfBoundsException;
        //  431    439    430    431    Ljava/util/ConcurrentModificationException;
        //  430    439    439    440    Ljava/util/ConcurrentModificationException;
        //  431    439    3      8      Ljava/lang/RuntimeException;
        //  448    457    457    458    Any
        //  448    457    3      8      Any
        //  448    457    448    449    Ljava/lang/RuntimeException;
        //  449    457    3      8      Any
        //  449    457    448    449    Any
        //  551    558    558    559    Any
        //  552    558    551    552    Any
        //  552    558    558    559    Ljava/lang/IllegalArgumentException;
        //  551    558    3      8      Any
        //  551    558    558    559    Ljava/lang/StringIndexOutOfBoundsException;
        //  608    614    614    615    Any
        //  608    614    614    615    Any
        //  608    614    3      8      Ljava/util/NoSuchElementException;
        //  608    614    3      8      Ljava/lang/RuntimeException;
        //  608    614    614    615    Any
        //  621    628    628    629    Any
        //  621    628    628    629    Ljava/lang/NumberFormatException;
        //  621    628    628    629    Any
        //  622    628    621    622    Any
        //  622    628    3      8      Any
        //  632    639    639    640    Any
        //  632    639    639    640    Ljava/util/ConcurrentModificationException;
        //  632    639    639    640    Any
        //  632    639    3      8      Ljava/lang/AssertionError;
        //  632    639    632    633    Ljava/lang/ClassCastException;
        //  646    653    653    654    Any
        //  646    653    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  647    653    3      8      Any
        //  646    653    646    647    Ljava/lang/NumberFormatException;
        //  646    653    646    647    Any
        //  662    669    669    670    Any
        //  663    669    669    670    Ljava/lang/NumberFormatException;
        //  663    669    3      8      Any
        //  662    669    662    663    Ljava/lang/RuntimeException;
        //  662    669    662    663    Ljava/lang/NullPointerException;
        //  673    680    680    681    Any
        //  673    680    680    681    Any
        //  674    680    3      8      Any
        //  673    680    3      8      Any
        //  674    680    673    674    Ljava/lang/EnumConstantNotPresentException;
        //  684    691    691    692    Any
        //  685    691    684    685    Any
        //  684    691    691    692    Ljava/lang/EnumConstantNotPresentException;
        //  684    691    691    692    Any
        //  685    691    691    692    Any
        //  783    790    790    791    Any
        //  783    790    3      8      Any
        //  784    790    790    791    Ljava/lang/IllegalStateException;
        //  784    790    790    791    Ljava/lang/UnsupportedOperationException;
        //  784    790    783    784    Ljava/lang/IndexOutOfBoundsException;
        //  796    803    803    804    Any
        //  797    803    803    804    Ljava/lang/IllegalArgumentException;
        //  796    803    803    804    Ljava/util/NoSuchElementException;
        //  796    803    796    797    Any
        //  797    803    803    804    Ljava/lang/IllegalArgumentException;
        //  853    860    860    861    Any
        //  853    860    3      8      Any
        //  853    860    853    854    Ljava/lang/NumberFormatException;
        //  854    860    853    854    Ljava/lang/IndexOutOfBoundsException;
        //  853    860    853    854    Ljava/lang/IndexOutOfBoundsException;
        //  915    922    922    923    Any
        //  915    922    915    916    Ljava/util/ConcurrentModificationException;
        //  915    922    922    923    Any
        //  916    922    3      8      Ljava/lang/ArithmeticException;
        //  916    922    922    923    Any
        //  973    980    980    981    Any
        //  973    980    3      8      Any
        //  974    980    973    974    Ljava/lang/AssertionError;
        //  973    980    973    974    Any
        //  973    980    3      8      Ljava/lang/ClassCastException;
        //  1031   1038   1038   1039   Any
        //  1031   1038   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1032   1038   3      8      Any
        //  1031   1038   1031   1032   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1032   1038   3      8      Any
        //  1139   1146   1146   1147   Any
        //  1139   1146   1139   1140   Any
        //  1140   1146   1146   1147   Any
        //  1139   1146   1146   1147   Any
        //  1139   1146   1146   1147   Any
        //  1193   1199   1199   1200   Any
        //  1193   1199   1199   1200   Ljava/lang/AssertionError;
        //  1193   1199   3      8      Any
        //  1193   1199   1199   1200   Any
        //  1193   1199   1199   1200   Ljava/util/NoSuchElementException;
        //  1211   1218   1218   1219   Any
        //  1211   1218   1211   1212   Ljava/lang/IllegalStateException;
        //  1211   1218   3      8      Ljava/lang/IllegalArgumentException;
        //  1211   1218   1218   1219   Any
        //  1211   1218   1211   1212   Any
        //  1271   1278   1278   1279   Any
        //  1271   1278   1271   1272   Any
        //  1271   1278   1278   1279   Any
        //  1271   1278   1278   1279   Any
        //  1272   1278   1271   1272   Ljava/lang/IllegalStateException;
        //  1347   1354   1354   1355   Any
        //  1348   1354   1347   1348   Ljava/util/ConcurrentModificationException;
        //  1348   1354   1354   1355   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1347   1354   1354   1355   Ljava/lang/IllegalStateException;
        //  1347   1354   1347   1348   Ljava/lang/RuntimeException;
        //  1409   1416   1416   1417   Any
        //  1409   1416   3      8      Any
        //  1409   1416   3      8      Any
        //  1410   1416   1409   1410   Any
        //  1410   1416   1416   1417   Ljava/lang/IndexOutOfBoundsException;
        //  1429   1436   1436   1437   Any
        //  1429   1436   3      8      Any
        //  1430   1436   3      8      Ljava/lang/NumberFormatException;
        //  1430   1436   3      8      Any
        //  1430   1436   1429   1430   Any
        //  1445   1451   1451   1452   Any
        //  1445   1451   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1445   1451   1451   1452   Any
        //  1445   1451   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1445   1451   3      8      Any
        //  1455   1462   1462   1463   Any
        //  1455   1462   1462   1463   Ljava/lang/RuntimeException;
        //  1456   1462   1455   1456   Ljava/lang/RuntimeException;
        //  1456   1462   3      8      Ljava/lang/AssertionError;
        //  1455   1462   1455   1456   Any
        //  1466   1473   1473   1474   Any
        //  1466   1473   1466   1467   Any
        //  1467   1473   1466   1467   Any
        //  1467   1473   1473   1474   Any
        //  1466   1473   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1478   1484   1484   1485   Any
        //  1478   1484   1484   1485   Ljava/util/NoSuchElementException;
        //  1478   1484   3      8      Any
        //  1478   1484   3      8      Ljava/lang/IllegalArgumentException;
        //  1478   1484   1484   1485   Ljava/lang/ArrayIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visitVariable(StackMappingVisitor.java:470)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:556)
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
    
    @Override
    public float 3() {
        return fbS.aO(this, 3378009);
    }
}
