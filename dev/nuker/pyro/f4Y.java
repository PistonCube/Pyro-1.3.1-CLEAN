// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4y extends f49
{
    public f4y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23f7\u149c\u8ae2\ub3d0\uc9a3\uedef\ub20c\ue6ce\ud96c"
        //     3: getstatic       dev/nuker/pyro/fc.1:I
        //     6: ifeq            14
        //     9: ldc             -215336892
        //    11: goto            16
        //    14: ldc             1497892305
        //    16: ldc             2111694642
        //    18: ixor           
        //    19: lookupswitch {
        //          -1896358026: 51
        //          1937894597: 14
        //          default: 44
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: invokespecial   dev/nuker/pyro/f49.<init>:(Ljava/lang/String;)V
        //    50: return         
        //    51: aconst_null    
        //    52: athrow         
        //    StackMapTable: 00 04 FF 00 0E 00 01 06 00 02 06 07 00 1D FF 00 01 00 01 06 00 03 06 07 00 1D 01 FF 00 1B 00 01 06 00 02 06 07 00 1D FF 00 06 00 01 06 00 02 06 07 00 1D
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
    public void c(final f4d p0, final int p1, final ScaledResolution p2, final float p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2179
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2171
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2163
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //    27: getstatic       net/minecraft/init/Items.field_190929_cY:Lnet/minecraft/item/Item;
        //    30: getstatic       dev/nuker/pyro/fc.c:I
        //    33: ifge            41
        //    36: ldc             -1436461213
        //    38: goto            43
        //    41: ldc             -1212032911
        //    43: ldc             -282958226
        //    45: ixor           
        //    46: lookupswitch {
        //          -631359049: 41
        //          1162031373: 2102
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/fbi.c:(Lnet/minecraft/item/Item;)I
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.0:I
        //    86: ifeq            94
        //    89: ldc             1765893930
        //    91: goto            96
        //    94: ldc             -1012007976
        //    96: ldc             -963059411
        //    98: ixor           
        //    99: lookupswitch {
        //          -1344698873: 2128
        //          1760507100: 94
        //          default: 124
        //        }
        //   124: istore          6
        //   126: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   129: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/fbi.c:(Lnet/minecraft/item/Item;)I
        //   139: goto            143
        //   142: athrow         
        //   143: getstatic       dev/nuker/pyro/fc.1:I
        //   146: ifeq            154
        //   149: ldc             911707594
        //   151: goto            156
        //   154: ldc             14569118
        //   156: ldc             1723707498
        //   158: ixor           
        //   159: lookupswitch {
        //          1357528480: 154
        //          1717829364: 184
        //          default: 2096
        //        }
        //   184: istore          7
        //   186: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   189: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   192: getstatic       dev/nuker/pyro/fc.c:I
        //   195: ifge            203
        //   198: ldc             850546999
        //   200: goto            205
        //   203: ldc             530873655
        //   205: ldc             -59994076
        //   207: ixor           
        //   208: lookupswitch {
        //          -824262381: 203
        //          -473371373: 236
        //          default: 2144
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   dev/nuker/pyro/fbi.c:(Lnet/minecraft/item/Item;)I
        //   243: goto            247
        //   246: athrow         
        //   247: istore          8
        //   249: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   252: getstatic       dev/nuker/pyro/fc.0:I
        //   255: ifeq            263
        //   258: ldc             1306713569
        //   260: goto            265
        //   263: ldc             1990566695
        //   265: ldc             -1085749443
        //   267: ixor           
        //   268: lookupswitch {
        //          -223733028: 2104
        //          424212639: 263
        //          default: 296
        //        }
        //   296: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   299: goto            303
        //   302: athrow         
        //   303: invokevirtual   dev/nuker/pyro/fbi.c:(Lnet/minecraft/item/Item;)I
        //   306: goto            310
        //   309: athrow         
        //   310: istore          9
        //   312: new             Ljava/util/ArrayList;
        //   315: dup            
        //   316: goto            320
        //   319: athrow         
        //   320: invokespecial   java/util/ArrayList.<init>:()V
        //   323: goto            327
        //   326: athrow         
        //   327: astore          10
        //   329: getstatic       dev/nuker/pyro/fc.c:I
        //   332: ifge            340
        //   335: ldc             452478609
        //   337: goto            342
        //   340: ldc             1856590813
        //   342: ldc             -531077510
        //   344: ixor           
        //   345: lookupswitch {
        //          -90169109: 2146
        //          790375112: 340
        //          default: 372
        //        }
        //   372: iload           6
        //   374: ifle            413
        //   377: aload           10
        //   379: new             Lnet/minecraft/item/ItemStack;
        //   382: dup            
        //   383: getstatic       net/minecraft/init/Items.field_190929_cY:Lnet/minecraft/item/Item;
        //   386: iload           6
        //   388: goto            392
        //   391: athrow         
        //   392: invokespecial   net/minecraft/item/ItemStack.<init>:(Lnet/minecraft/item/Item;I)V
        //   395: goto            399
        //   398: athrow         
        //   399: goto            403
        //   402: athrow         
        //   403: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   408: goto            412
        //   411: athrow         
        //   412: pop            
        //   413: iload           7
        //   415: ifle            497
        //   418: aload           10
        //   420: new             Lnet/minecraft/item/ItemStack;
        //   423: dup            
        //   424: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   427: iload           7
        //   429: getstatic       dev/nuker/pyro/fc.c:I
        //   432: ifge            440
        //   435: ldc             -1015979360
        //   437: goto            442
        //   440: ldc             1448943918
        //   442: ldc             -2045372411
        //   444: ixor           
        //   445: lookupswitch {
        //          331190954: 440
        //          1164409509: 2098
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokespecial   net/minecraft/item/ItemStack.<init>:(Lnet/minecraft/item/Item;I)V
        //   479: goto            483
        //   482: athrow         
        //   483: goto            487
        //   486: athrow         
        //   487: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   492: goto            496
        //   495: athrow         
        //   496: pop            
        //   497: iload           8
        //   499: ifle            582
        //   502: aload           10
        //   504: new             Lnet/minecraft/item/ItemStack;
        //   507: dup            
        //   508: getstatic       dev/nuker/pyro/fc.0:I
        //   511: ifeq            519
        //   514: ldc             215634889
        //   516: goto            521
        //   519: ldc             1866441149
        //   521: ldc             317568064
        //   523: ixor           
        //   524: lookupswitch {
        //          506980233: 2118
        //          1318694644: 519
        //          default: 552
        //        }
        //   552: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   555: iload           8
        //   557: goto            561
        //   560: athrow         
        //   561: invokespecial   net/minecraft/item/ItemStack.<init>:(Lnet/minecraft/item/Item;I)V
        //   564: goto            568
        //   567: athrow         
        //   568: goto            572
        //   571: athrow         
        //   572: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   577: goto            581
        //   580: athrow         
        //   581: pop            
        //   582: iload           9
        //   584: ifle            665
        //   587: getstatic       dev/nuker/pyro/fc.0:I
        //   590: ifeq            598
        //   593: ldc             71925156
        //   595: goto            600
        //   598: ldc             -1403365731
        //   600: ldc             -461757147
        //   602: ixor           
        //   603: lookupswitch {
        //          -533505919: 598
        //          1210086328: 628
        //          default: 2116
        //        }
        //   628: aload           10
        //   630: new             Lnet/minecraft/item/ItemStack;
        //   633: dup            
        //   634: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   637: iload           9
        //   639: iconst_1       
        //   640: goto            644
        //   643: athrow         
        //   644: invokespecial   net/minecraft/item/ItemStack.<init>:(Lnet/minecraft/item/Item;II)V
        //   647: goto            651
        //   650: athrow         
        //   651: goto            655
        //   654: athrow         
        //   655: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   660: goto            664
        //   663: athrow         
        //   664: pop            
        //   665: iconst_0       
        //   666: istore          11
        //   668: getstatic       dev/nuker/pyro/fc.1:I
        //   671: ifeq            679
        //   674: ldc             -478373599
        //   676: goto            681
        //   679: ldc             -1731646939
        //   681: ldc             -869380260
        //   683: ixor           
        //   684: lookupswitch {
        //          793958013: 679
        //          1424450937: 712
        //          default: 2110
        //        }
        //   712: iload           11
        //   714: aload           10
        //   716: getstatic       dev/nuker/pyro/fc.1:I
        //   719: ifeq            727
        //   722: ldc             -2035675764
        //   724: goto            729
        //   727: ldc             -1250233628
        //   729: ldc             -144438378
        //   731: ixor           
        //   732: lookupswitch {
        //          1109326194: 760
        //          1909327386: 727
        //          default: 2138
        //        }
        //   760: goto            764
        //   763: athrow         
        //   764: invokeinterface java/util/List.size:()I
        //   769: goto            773
        //   772: athrow         
        //   773: if_icmpge       1665
        //   776: getstatic       dev/nuker/pyro/fc.1:I
        //   779: ifeq            787
        //   782: ldc             -90247085
        //   784: goto            789
        //   787: ldc             -644141962
        //   789: ldc             -1751789084
        //   791: ixor           
        //   792: lookupswitch {
        //          627925091: 787
        //          1829446071: 2124
        //          default: 820
        //        }
        //   820: goto            824
        //   823: athrow         
        //   824: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   827: goto            831
        //   830: athrow         
        //   831: iconst_1       
        //   832: goto            836
        //   835: athrow         
        //   836: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //   839: goto            843
        //   842: athrow         
        //   843: sipush          256
        //   846: goto            850
        //   849: athrow         
        //   850: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179086_m:(I)V
        //   853: goto            857
        //   856: athrow         
        //   857: getstatic       dev/nuker/pyro/fc.c:I
        //   860: ifge            868
        //   863: ldc             -1986763497
        //   865: goto            870
        //   868: ldc             1861788042
        //   870: ldc             -522665984
        //   872: ixor           
        //   873: lookupswitch {
        //          1553666105: 868
        //          1766630679: 2132
        //          default: 900
        //        }
        //   900: goto            904
        //   903: athrow         
        //   904: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74519_b:()V
        //   907: goto            911
        //   910: athrow         
        //   911: getstatic       dev/nuker/pyro/fc.c:I
        //   914: ifge            922
        //   917: ldc             -482666650
        //   919: goto            924
        //   922: ldc             -666928092
        //   924: ldc             -299939830
        //   926: ixor           
        //   927: lookupswitch {
        //          220487532: 2136
        //          961522740: 922
        //          default: 952
        //        }
        //   952: getstatic       dev/nuker/pyro/f4y.c:Lnet/minecraft/client/Minecraft;
        //   955: goto            959
        //   958: athrow         
        //   959: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   962: goto            966
        //   965: athrow         
        //   966: ldc             -150.0
        //   968: getstatic       dev/nuker/pyro/fc.c:I
        //   971: ifge            979
        //   974: ldc             -384881497
        //   976: goto            981
        //   979: ldc             -1512762257
        //   981: ldc             -962479539
        //   983: ixor           
        //   984: lookupswitch {
        //          -1423796266: 979
        //          799971050: 2092
        //          default: 1012
        //        }
        //  1012: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //  1015: goto            1019
        //  1018: athrow         
        //  1019: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179118_c:()V
        //  1022: goto            1026
        //  1025: athrow         
        //  1026: goto            1030
        //  1029: athrow         
        //  1030: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: getstatic       dev/nuker/pyro/fc.0:I
        //  1040: ifeq            1048
        //  1043: ldc             140570686
        //  1045: goto            1050
        //  1048: ldc             531430583
        //  1050: ldc             46112053
        //  1052: ixor           
        //  1053: lookupswitch {
        //          182414603: 1048
        //          487809410: 1080
        //          default: 2100
        //        }
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179129_p:()V
        //  1087: goto            1091
        //  1090: athrow         
        //  1091: iconst_0       
        //  1092: getstatic       dev/nuker/pyro/fc.c:I
        //  1095: ifge            1103
        //  1098: ldc             -1593286815
        //  1100: goto            1105
        //  1103: ldc             136045794
        //  1105: ldc             832265141
        //  1107: ixor           
        //  1108: lookupswitch {
        //          -1869413164: 1103
        //          964738903: 1136
        //          default: 2148
        //        }
        //  1136: istore          12
        //  1138: iconst_0       
        //  1139: istore          13
        //  1141: aload           10
        //  1143: getstatic       dev/nuker/pyro/fc.0:I
        //  1146: ifeq            1154
        //  1149: ldc             48009416
        //  1151: goto            1156
        //  1154: ldc             40627499
        //  1156: ldc             789307718
        //  1158: ixor           
        //  1159: lookupswitch {
        //          -1871239792: 1154
        //          769094030: 2142
        //          default: 1184
        //        }
        //  1184: iload           11
        //  1186: goto            1190
        //  1189: athrow         
        //  1190: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: checkcast       Lnet/minecraft/item/ItemStack;
        //  1202: astore          14
        //  1204: iload           11
        //  1206: iconst_2       
        //  1207: irem           
        //  1208: bipush          20
        //  1210: imul           
        //  1211: getstatic       dev/nuker/pyro/fc.1:I
        //  1214: ifeq            1222
        //  1217: ldc             411861592
        //  1219: goto            1224
        //  1222: ldc             -553766849
        //  1224: ldc             -328638861
        //  1226: ixor           
        //  1227: lookupswitch {
        //          -186262485: 1222
        //          848784972: 1252
        //          default: 2112
        //        }
        //  1252: istore          12
        //  1254: iload           11
        //  1256: iconst_2       
        //  1257: idiv           
        //  1258: bipush          20
        //  1260: imul           
        //  1261: getstatic       dev/nuker/pyro/fc.c:I
        //  1264: ifge            1272
        //  1267: ldc             1855836956
        //  1269: goto            1274
        //  1272: ldc             1895960088
        //  1274: ldc             797548229
        //  1276: ixor           
        //  1277: lookupswitch {
        //          1091849689: 1272
        //          1586204893: 1304
        //          default: 2122
        //        }
        //  1304: istore          13
        //  1306: getstatic       dev/nuker/pyro/f4y.c:Lnet/minecraft/client/Minecraft;
        //  1309: goto            1313
        //  1312: athrow         
        //  1313: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //  1316: goto            1320
        //  1319: athrow         
        //  1320: aload           14
        //  1322: getstatic       dev/nuker/pyro/fc.c:I
        //  1325: ifge            1333
        //  1328: ldc             86328962
        //  1330: goto            1335
        //  1333: ldc             173628350
        //  1335: ldc             -1854739312
        //  1337: ixor           
        //  1338: lookupswitch {
        //          -1806194158: 2134
        //          -1750410083: 1333
        //          default: 1364
        //        }
        //  1364: iload           12
        //  1366: iconst_2       
        //  1367: iadd           
        //  1368: getstatic       dev/nuker/pyro/fc.0:I
        //  1371: ifeq            1379
        //  1374: ldc             -2069968879
        //  1376: goto            1381
        //  1379: ldc             462844127
        //  1381: ldc             -1037836231
        //  1383: ixor           
        //  1384: lookupswitch {
        //          -1797481590: 1379
        //          1186801704: 2106
        //          default: 1412
        //        }
        //  1412: iload           13
        //  1414: iconst_2       
        //  1415: iadd           
        //  1416: goto            1420
        //  1419: athrow         
        //  1420: invokevirtual   net/minecraft/client/renderer/RenderItem.func_180450_b:(Lnet/minecraft/item/ItemStack;II)V
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: getstatic       dev/nuker/pyro/f4y.c:Lnet/minecraft/client/Minecraft;
        //  1430: goto            1434
        //  1433: athrow         
        //  1434: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //  1437: goto            1441
        //  1440: athrow         
        //  1441: getstatic       dev/nuker/pyro/f4y.c:Lnet/minecraft/client/Minecraft;
        //  1444: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  1447: aload           14
        //  1449: getstatic       dev/nuker/pyro/fc.1:I
        //  1452: ifeq            1460
        //  1455: ldc             -310982068
        //  1457: goto            1462
        //  1460: ldc             1553499141
        //  1462: ldc             -453253946
        //  1464: ixor           
        //  1465: lookupswitch {
        //          -1201446717: 1492
        //          160247434: 1460
        //          default: 2150
        //        }
        //  1492: iload           12
        //  1494: iconst_2       
        //  1495: iadd           
        //  1496: iload           13
        //  1498: iconst_2       
        //  1499: iadd           
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokevirtual   net/minecraft/client/renderer/RenderItem.func_175030_a:(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;II)V
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: getstatic       dev/nuker/pyro/f4y.c:Lnet/minecraft/client/Minecraft;
        //  1514: goto            1518
        //  1517: athrow         
        //  1518: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //  1521: goto            1525
        //  1524: athrow         
        //  1525: fconst_0       
        //  1526: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //  1529: getstatic       dev/nuker/pyro/fc.1:I
        //  1532: ifeq            1540
        //  1535: ldc             -856803114
        //  1537: goto            1542
        //  1540: ldc             269432236
        //  1542: ldc             684509744
        //  1544: ixor           
        //  1545: lookupswitch {
        //          -467471642: 2126
        //          899746580: 1540
        //          default: 1572
        //        }
        //  1572: goto            1576
        //  1575: athrow         
        //  1576: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74518_a:()V
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: goto            1587
        //  1586: athrow         
        //  1587: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179089_o:()V
        //  1590: goto            1594
        //  1593: athrow         
        //  1594: goto            1598
        //  1597: athrow         
        //  1598: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179141_d:()V
        //  1601: goto            1605
        //  1604: athrow         
        //  1605: getstatic       dev/nuker/pyro/fc.1:I
        //  1608: ifeq            1616
        //  1611: ldc             1972182792
        //  1613: goto            1619
        //  1616: ldc_w           1194026295
        //  1619: ldc_w           -1222710373
        //  1622: ixor           
        //  1623: lookupswitch {
        //          -1030490989: 1616
        //          -264925524: 1648
        //          default: 2108
        //        }
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: iinc            11, 1
        //  1662: goto            668
        //  1665: fconst_0       
        //  1666: fconst_0       
        //  1667: aload_0        
        //  1668: getstatic       dev/nuker/pyro/fc.0:I
        //  1671: ifeq            1680
        //  1674: ldc_w           -235106893
        //  1677: goto            1683
        //  1680: ldc_w           -1523270167
        //  1683: ldc_w           -864652172
        //  1686: ixor           
        //  1687: lookupswitch {
        //          1032518087: 1680
        //          1765984669: 1712
        //          default: 2140
        //        }
        //  1712: goto            1716
        //  1715: athrow         
        //  1716: invokevirtual   dev/nuker/pyro/f4y.c:()F
        //  1719: goto            1723
        //  1722: athrow         
        //  1723: aload_0        
        //  1724: goto            1728
        //  1727: athrow         
        //  1728: invokevirtual   dev/nuker/pyro/f4y.3:()F
        //  1731: goto            1735
        //  1734: athrow         
        //  1735: fconst_1       
        //  1736: ldc_w           -65536
        //  1739: goto            1743
        //  1742: athrow         
        //  1743: invokestatic    dev/nuker/pyro/fbs.c:(FFFFFI)V
        //  1746: goto            1750
        //  1749: athrow         
        //  1750: getstatic       dev/nuker/pyro/fc.1:I
        //  1753: ifeq            1762
        //  1756: ldc_w           -1944933707
        //  1759: goto            1765
        //  1762: ldc_w           1579898356
        //  1765: ldc_w           -52661458
        //  1768: ixor           
        //  1769: lookupswitch {
        //          -1560860966: 1796
        //          1892604315: 1762
        //          default: 2120
        //        }
        //  1796: aload_0        
        //  1797: getstatic       dev/nuker/pyro/fc.0:I
        //  1800: ifeq            1809
        //  1803: ldc_w           -1285934589
        //  1806: goto            1812
        //  1809: ldc_w           1149926443
        //  1812: ldc_w           192215086
        //  1815: ixor           
        //  1816: lookupswitch {
        //          -1204893139: 1809
        //          1342080005: 1844
        //          default: 2130
        //        }
        //  1844: goto            1848
        //  1847: athrow         
        //  1848: invokevirtual   dev/nuker/pyro/f4y.c:()F
        //  1851: goto            1855
        //  1854: athrow         
        //  1855: fconst_2       
        //  1856: fdiv           
        //  1857: fconst_0       
        //  1858: aload_0        
        //  1859: goto            1863
        //  1862: athrow         
        //  1863: invokevirtual   dev/nuker/pyro/f4y.c:()F
        //  1866: goto            1870
        //  1869: athrow         
        //  1870: fconst_2       
        //  1871: fdiv           
        //  1872: aload_0        
        //  1873: goto            1877
        //  1876: athrow         
        //  1877: invokevirtual   dev/nuker/pyro/f4y.3:()F
        //  1880: goto            1884
        //  1883: athrow         
        //  1884: fconst_1       
        //  1885: ldc_w           -65536
        //  1888: getstatic       dev/nuker/pyro/fc.0:I
        //  1891: ifeq            1900
        //  1894: ldc_w           -1442101599
        //  1897: goto            1903
        //  1900: ldc_w           -255637357
        //  1903: ldc_w           1956424217
        //  1906: ixor           
        //  1907: lookupswitch {
        //          -2134889596: 1900
        //          -560468808: 2152
        //          default: 1932
        //        }
        //  1932: goto            1936
        //  1935: athrow         
        //  1936: invokestatic    dev/nuker/pyro/fbs.0:(FFFFFI)V
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: fconst_0       
        //  1944: aload_0        
        //  1945: getstatic       dev/nuker/pyro/fc.1:I
        //  1948: ifeq            1957
        //  1951: ldc_w           622593871
        //  1954: goto            1960
        //  1957: ldc_w           1462291081
        //  1960: ldc_w           904998682
        //  1963: ixor           
        //  1964: lookupswitch {
        //          283977813: 2094
        //          1225138675: 1957
        //          default: 1992
        //        }
        //  1992: goto            1996
        //  1995: athrow         
        //  1996: invokevirtual   dev/nuker/pyro/f4y.3:()F
        //  1999: goto            2003
        //  2002: athrow         
        //  2003: fconst_2       
        //  2004: fdiv           
        //  2005: aload_0        
        //  2006: goto            2010
        //  2009: athrow         
        //  2010: invokevirtual   dev/nuker/pyro/f4y.c:()F
        //  2013: goto            2017
        //  2016: athrow         
        //  2017: aload_0        
        //  2018: goto            2022
        //  2021: athrow         
        //  2022: invokevirtual   dev/nuker/pyro/f4y.3:()F
        //  2025: goto            2029
        //  2028: athrow         
        //  2029: fconst_2       
        //  2030: fdiv           
        //  2031: fconst_1       
        //  2032: ldc_w           -65536
        //  2035: getstatic       dev/nuker/pyro/fc.1:I
        //  2038: ifeq            2047
        //  2041: ldc_w           -426600525
        //  2044: goto            2050
        //  2047: ldc_w           1246513292
        //  2050: ldc_w           -1266784725
        //  2053: ixor           
        //  2054: lookupswitch {
        //          -1707865711: 2047
        //          1391260056: 2114
        //          default: 2080
        //        }
        //  2080: goto            2084
        //  2083: athrow         
        //  2084: invokestatic    dev/nuker/pyro/fbs.0:(FFFFFI)V
        //  2087: goto            2091
        //  2090: athrow         
        //  2091: return         
        //  2092: aconst_null    
        //  2093: athrow         
        //  2094: aconst_null    
        //  2095: athrow         
        //  2096: aconst_null    
        //  2097: athrow         
        //  2098: aconst_null    
        //  2099: athrow         
        //  2100: aconst_null    
        //  2101: athrow         
        //  2102: aconst_null    
        //  2103: athrow         
        //  2104: aconst_null    
        //  2105: athrow         
        //  2106: aconst_null    
        //  2107: athrow         
        //  2108: aconst_null    
        //  2109: athrow         
        //  2110: aconst_null    
        //  2111: athrow         
        //  2112: aconst_null    
        //  2113: athrow         
        //  2114: aconst_null    
        //  2115: athrow         
        //  2116: aconst_null    
        //  2117: athrow         
        //  2118: aconst_null    
        //  2119: athrow         
        //  2120: aconst_null    
        //  2121: athrow         
        //  2122: aconst_null    
        //  2123: athrow         
        //  2124: aconst_null    
        //  2125: athrow         
        //  2126: aconst_null    
        //  2127: athrow         
        //  2128: aconst_null    
        //  2129: athrow         
        //  2130: aconst_null    
        //  2131: athrow         
        //  2132: aconst_null    
        //  2133: athrow         
        //  2134: aconst_null    
        //  2135: athrow         
        //  2136: aconst_null    
        //  2137: athrow         
        //  2138: aconst_null    
        //  2139: athrow         
        //  2140: aconst_null    
        //  2141: athrow         
        //  2142: aconst_null    
        //  2143: athrow         
        //  2144: aconst_null    
        //  2145: athrow         
        //  2146: aconst_null    
        //  2147: athrow         
        //  2148: aconst_null    
        //  2149: athrow         
        //  2150: aconst_null    
        //  2151: athrow         
        //  2152: aconst_null    
        //  2153: athrow         
        //  2154: pop            
        //  2155: goto            24
        //  2158: pop            
        //  2159: aconst_null    
        //  2160: goto            2154
        //  2163: dup            
        //  2164: ifnull          2154
        //  2167: checkcast       Ljava/lang/Throwable;
        //  2170: athrow         
        //  2171: dup            
        //  2172: ifnull          2158
        //  2175: checkcast       Ljava/lang/Throwable;
        //  2178: athrow         
        //  2179: aconst_null    
        //  2180: athrow         
        //    StackMapTable: 01 37 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FF 00 03 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 00 FF 00 10 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 02 07 00 43 07 01 2A FF 00 01 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 03 07 00 43 07 01 2A 01 FF 00 1C 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 02 07 00 43 07 01 2A 42 07 00 41 FF 00 00 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 02 07 00 43 07 01 2A 45 07 00 41 40 01 4A 01 FF 00 01 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 02 01 01 5B 01 FF 00 0A 00 07 07 00 03 07 01 26 01 07 01 28 02 02 01 00 01 07 00 41 FF 00 00 00 07 07 00 03 07 01 26 01 07 01 28 02 02 01 00 02 07 00 43 07 01 2A 45 07 00 41 40 01 4A 01 FF 00 01 00 07 07 00 03 07 01 26 01 07 01 28 02 02 01 00 02 01 01 5B 01 FF 00 12 00 08 07 00 03 07 01 26 01 07 01 28 02 02 01 01 00 02 07 00 43 07 01 2A FF 00 01 00 08 07 00 03 07 01 26 01 07 01 28 02 02 01 01 00 03 07 00 43 07 01 2A 01 FF 00 1E 00 08 07 00 03 07 01 26 01 07 01 28 02 02 01 01 00 02 07 00 43 07 01 2A 42 07 00 27 FF 00 00 00 08 07 00 03 07 01 26 01 07 01 28 02 02 01 01 00 02 07 00 43 07 01 2A 45 07 00 41 40 01 FF 00 0F 00 09 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 00 01 07 00 43 FF 00 01 00 09 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 00 02 07 00 43 01 5E 07 00 43 45 07 00 41 FF 00 00 00 09 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 00 02 07 00 43 07 01 2A 45 07 00 41 40 01 FF 00 08 00 0A 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 00 01 07 00 29 FF 00 00 00 0A 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 00 02 08 01 38 08 01 38 45 07 00 41 40 07 00 6D FC 00 0C 07 00 6D 41 01 1D 52 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 7B 08 01 7B 07 01 2A 01 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 42 07 00 2F FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 47 07 00 41 40 01 00 FF 00 1A 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 A4 08 01 A4 07 01 2A 01 FF 00 01 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 06 07 00 6D 08 01 A4 08 01 A4 07 01 2A 01 01 FF 00 1D 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 A4 08 01 A4 07 01 2A 01 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 A4 08 01 A4 07 01 2A 01 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 42 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 47 07 00 41 40 01 00 FF 00 15 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 03 07 00 6D 08 01 F8 08 01 F8 FF 00 01 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 04 07 00 6D 08 01 F8 08 01 F8 01 FF 00 1E 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 03 07 00 6D 08 01 F8 08 01 F8 47 07 00 2D FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 F8 08 01 F8 07 01 2A 01 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 42 07 00 2B FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 47 07 00 41 40 01 00 0F 41 01 1B 4E 07 00 27 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 06 07 00 6D 08 02 76 08 02 76 07 01 2A 01 01 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 42 07 00 41 FF 00 00 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 02 07 00 6D 07 00 74 47 07 00 41 40 01 00 FC 00 02 01 0A 41 01 1E FF 00 0E 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 07 00 6D FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 01 07 00 6D 01 FF 00 1E 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 07 00 6D 42 07 00 31 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 07 00 6D 47 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 01 0D 41 01 1E 42 07 00 41 00 45 07 00 41 00 43 07 00 41 40 01 45 07 00 41 00 45 07 00 41 40 01 45 07 00 41 00 0A 41 01 1D FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 00 45 07 00 41 00 0A 41 01 1B FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 01 07 00 B3 45 07 00 41 40 07 00 BD FF 00 0C 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 07 00 BD 02 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 07 00 BD 02 01 FF 00 1E 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 07 00 BD 02 FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 00 45 07 00 41 00 42 07 00 3D 00 45 07 00 41 00 0A 41 01 1D FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 00 45 07 00 41 00 4B 01 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 01 5E 01 FF 00 11 00 0E 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 00 01 07 00 6D FF 00 01 00 0E 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 00 02 07 00 6D 01 5B 07 00 6D 44 07 00 41 FF 00 00 00 0E 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 00 02 07 00 6D 01 47 07 00 41 40 07 01 2C FF 00 16 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 01 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 02 01 01 5B 01 53 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 02 01 01 5D 01 47 07 00 41 40 07 00 B3 45 07 00 41 40 07 00 BD FF 00 0C 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 02 07 00 BD 07 00 74 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 00 74 01 FF 00 1C 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 02 07 00 BD 07 00 74 FF 00 0E 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 00 74 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 04 07 00 BD 07 00 74 01 01 FF 00 1E 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 00 74 01 46 07 00 41 FF 00 00 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 04 07 00 BD 07 00 74 01 01 45 07 00 41 00 FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 01 07 00 B3 45 07 00 41 40 07 00 BD FF 00 12 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 01 2E 07 00 74 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 04 07 00 BD 07 01 2E 07 00 74 01 FF 00 1D 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 01 2E 07 00 74 FF 00 0A 00 00 00 01 07 00 41 FF 00 00 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 05 07 00 BD 07 01 2E 07 00 74 01 01 45 07 00 41 00 FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 01 07 00 B3 45 07 00 41 40 07 00 BD 0E 41 01 1D 42 07 00 41 00 45 07 00 41 00 42 07 00 41 00 45 07 00 41 00 42 07 00 2F 00 45 07 00 41 00 0A 42 01 1C 42 07 00 25 00 45 07 00 41 00 F8 00 05 FF 00 0E 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 FF 00 02 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 07 00 03 01 FF 00 1C 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 42 07 00 23 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 02 43 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 02 FF 00 06 00 00 00 01 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 45 07 00 41 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 07 00 03 01 5F 07 00 03 42 07 00 41 40 07 00 03 45 07 00 41 40 02 46 07 00 23 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 02 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 02 FF 00 0F 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 FF 00 02 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 07 02 02 02 02 02 01 01 FF 00 1C 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 42 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 45 07 00 41 00 FF 00 0D 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 02 07 00 03 FF 00 02 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 07 00 03 01 FF 00 1F 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 02 07 00 03 42 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 02 02 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 02 43 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 07 00 03 45 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 04 02 02 02 02 FF 00 11 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 FF 00 02 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 07 02 02 02 02 02 01 01 FF 00 1D 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 42 07 00 41 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 45 07 00 41 00 FF 00 00 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 07 00 BD 02 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 02 07 00 03 FF 00 01 00 07 07 00 03 07 01 26 01 07 01 28 02 02 01 00 01 01 FF 00 01 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 05 07 00 6D 08 01 A4 08 01 A4 07 01 2A 01 FC 00 01 01 FF 00 01 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 02 07 00 43 07 01 2A FF 00 01 00 09 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 00 01 07 00 43 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 00 74 01 01 F8 00 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 01 01 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 FA 00 01 FF 00 01 00 0B 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 00 03 07 00 6D 08 01 F8 08 01 F8 FC 00 01 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 01 01 F8 00 01 FE 00 01 01 01 07 00 74 FF 00 01 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 01 01 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 01 07 00 03 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 02 07 00 BD 07 00 74 F8 00 01 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 02 01 07 00 6D FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 03 02 02 07 00 03 FF 00 01 00 0E 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 00 01 07 00 6D FF 00 01 00 08 07 00 03 07 01 26 01 07 01 28 02 02 01 01 00 02 07 00 43 07 01 2A FE 00 01 01 01 07 00 6D FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 01 01 FF 00 01 00 0F 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 01 01 07 00 74 00 03 07 00 BD 07 01 2E 07 00 74 FF 00 01 00 0C 07 00 03 07 01 26 01 07 01 28 02 02 01 01 01 01 07 00 6D 01 00 06 02 02 02 02 02 01 FF 00 01 00 06 07 00 03 07 01 26 01 07 01 28 02 02 00 01 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2163   2171   Ljava/lang/NullPointerException;
        //  2163   2171   2163   2171   Any
        //  2179   2181   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  75     82     82     83     Any
        //  76     82     82     83     Any
        //  75     82     75     76     Ljava/lang/IndexOutOfBoundsException;
        //  75     82     75     76     Any
        //  76     82     3      8      Ljava/lang/RuntimeException;
        //  135    142    142    143    Any
        //  135    142    142    143    Ljava/lang/RuntimeException;
        //  136    142    3      8      Any
        //  136    142    135    136    Any
        //  136    142    135    136    Ljava/lang/IndexOutOfBoundsException;
        //  239    246    246    247    Any
        //  240    246    246    247    Any
        //  240    246    3      8      Ljava/lang/NullPointerException;
        //  239    246    246    247    Any
        //  240    246    239    240    Ljava/lang/RuntimeException;
        //  302    309    309    310    Any
        //  303    309    309    310    Any
        //  303    309    302    303    Any
        //  302    309    3      8      Any
        //  303    309    309    310    Any
        //  319    326    326    327    Any
        //  320    326    319    320    Ljava/util/NoSuchElementException;
        //  320    326    3      8      Any
        //  319    326    326    327    Any
        //  320    326    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  391    398    398    399    Any
        //  391    398    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  392    398    3      8      Any
        //  391    398    391    392    Any
        //  391    398    398    399    Ljava/util/NoSuchElementException;
        //  402    411    411    412    Any
        //  402    411    3      8      Ljava/lang/UnsupportedOperationException;
        //  403    411    3      8      Ljava/lang/UnsupportedOperationException;
        //  403    411    3      8      Any
        //  403    411    402    403    Ljava/lang/IllegalArgumentException;
        //  476    482    482    483    Any
        //  476    482    482    483    Any
        //  476    482    482    483    Any
        //  476    482    482    483    Any
        //  476    482    482    483    Ljava/util/ConcurrentModificationException;
        //  486    495    495    496    Any
        //  487    495    486    487    Any
        //  486    495    486    487    Ljava/lang/IllegalStateException;
        //  487    495    3      8      Ljava/lang/IllegalArgumentException;
        //  486    495    495    496    Ljava/lang/AssertionError;
        //  560    567    567    568    Any
        //  561    567    567    568    Any
        //  560    567    3      8      Any
        //  561    567    567    568    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  560    567    560    561    Ljava/lang/UnsupportedOperationException;
        //  571    580    580    581    Any
        //  572    580    3      8      Ljava/lang/NullPointerException;
        //  571    580    3      8      Any
        //  571    580    580    581    Ljava/lang/NumberFormatException;
        //  572    580    571    572    Ljava/lang/StringIndexOutOfBoundsException;
        //  643    650    650    651    Any
        //  643    650    650    651    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  644    650    650    651    Ljava/lang/ClassCastException;
        //  643    650    643    644    Ljava/lang/IllegalStateException;
        //  644    650    643    644    Ljava/lang/IndexOutOfBoundsException;
        //  654    663    663    664    Any
        //  654    663    654    655    Any
        //  655    663    654    655    Ljava/lang/IllegalArgumentException;
        //  655    663    3      8      Any
        //  654    663    663    664    Ljava/lang/IllegalArgumentException;
        //  763    772    772    773    Any
        //  763    772    3      8      Any
        //  763    772    3      8      Any
        //  763    772    772    773    Any
        //  763    772    763    764    Ljava/util/ConcurrentModificationException;
        //  823    830    830    831    Any
        //  824    830    823    824    Ljava/lang/AssertionError;
        //  824    830    3      8      Any
        //  823    830    830    831    Any
        //  824    830    823    824    Ljava/lang/EnumConstantNotPresentException;
        //  835    842    842    843    Any
        //  835    842    3      8      Any
        //  836    842    842    843    Ljava/lang/NullPointerException;
        //  836    842    842    843    Ljava/lang/EnumConstantNotPresentException;
        //  836    842    835    836    Any
        //  849    856    856    857    Any
        //  849    856    849    850    Any
        //  849    856    856    857    Any
        //  850    856    3      8      Any
        //  850    856    849    850    Any
        //  904    910    910    911    Any
        //  904    910    910    911    Any
        //  904    910    3      8      Any
        //  904    910    910    911    Any
        //  904    910    910    911    Ljava/lang/UnsupportedOperationException;
        //  959    965    965    966    Any
        //  959    965    3      8      Any
        //  959    965    3      8      Any
        //  959    965    3      8      Any
        //  959    965    3      8      Any
        //  1019   1025   1025   1026   Any
        //  1019   1025   3      8      Any
        //  1019   1025   3      8      Ljava/util/NoSuchElementException;
        //  1019   1025   1025   1026   Ljava/lang/NullPointerException;
        //  1019   1025   1025   1026   Any
        //  1029   1036   1036   1037   Any
        //  1029   1036   3      8      Any
        //  1030   1036   1036   1037   Ljava/util/ConcurrentModificationException;
        //  1029   1036   1029   1030   Ljava/lang/ArithmeticException;
        //  1029   1036   3      8      Ljava/lang/NegativeArraySizeException;
        //  1084   1090   1090   1091   Any
        //  1084   1090   1090   1091   Ljava/lang/ClassCastException;
        //  1084   1090   3      8      Ljava/lang/RuntimeException;
        //  1084   1090   3      8      Any
        //  1084   1090   1090   1091   Any
        //  1189   1198   1198   1199   Any
        //  1189   1198   1189   1190   Any
        //  1190   1198   3      8      Any
        //  1190   1198   1189   1190   Any
        //  1189   1198   1189   1190   Any
        //  1312   1319   1319   1320   Any
        //  1312   1319   3      8      Ljava/lang/ClassCastException;
        //  1313   1319   1312   1313   Any
        //  1312   1319   3      8      Any
        //  1313   1319   1312   1313   Ljava/lang/NumberFormatException;
        //  1419   1426   1426   1427   Any
        //  1419   1426   1426   1427   Any
        //  1420   1426   3      8      Any
        //  1420   1426   1419   1420   Any
        //  1419   1426   1426   1427   Any
        //  1434   1440   1440   1441   Any
        //  1434   1440   3      8      Any
        //  1434   1440   1440   1441   Any
        //  1434   1440   3      8      Ljava/lang/ClassCastException;
        //  1434   1440   1440   1441   Any
        //  1504   1510   1510   1511   Any
        //  1504   1510   1510   1511   Any
        //  1504   1510   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1504   1510   1510   1511   Ljava/lang/UnsupportedOperationException;
        //  1504   1510   3      8      Ljava/util/ConcurrentModificationException;
        //  1518   1524   1524   1525   Any
        //  1518   1524   1524   1525   Any
        //  1518   1524   1524   1525   Any
        //  1518   1524   3      8      Ljava/lang/NullPointerException;
        //  1518   1524   3      8      Any
        //  1575   1582   1582   1583   Any
        //  1576   1582   1575   1576   Any
        //  1576   1582   3      8      Any
        //  1575   1582   3      8      Any
        //  1575   1582   1575   1576   Any
        //  1586   1593   1593   1594   Any
        //  1587   1593   1586   1587   Any
        //  1587   1593   3      8      Any
        //  1586   1593   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1587   1593   1586   1587   Any
        //  1597   1604   1604   1605   Any
        //  1597   1604   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1598   1604   3      8      Ljava/lang/NullPointerException;
        //  1597   1604   1597   1598   Ljava/lang/IllegalArgumentException;
        //  1598   1604   3      8      Any
        //  1651   1658   1658   1659   Any
        //  1651   1658   1651   1652   Ljava/lang/IndexOutOfBoundsException;
        //  1651   1658   3      8      Ljava/lang/ArithmeticException;
        //  1652   1658   3      8      Any
        //  1652   1658   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1715   1722   1722   1723   Any
        //  1716   1722   3      8      Any
        //  1715   1722   3      8      Ljava/lang/AssertionError;
        //  1716   1722   1715   1716   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1715   1722   3      8      Ljava/lang/RuntimeException;
        //  1727   1734   1734   1735   Any
        //  1728   1734   3      8      Ljava/util/ConcurrentModificationException;
        //  1727   1734   3      8      Any
        //  1727   1734   1727   1728   Any
        //  1727   1734   1734   1735   Any
        //  1743   1749   1749   1750   Any
        //  1743   1749   1749   1750   Ljava/lang/IllegalStateException;
        //  1743   1749   1749   1750   Any
        //  1743   1749   1749   1750   Ljava/lang/IllegalStateException;
        //  1743   1749   3      8      Any
        //  1847   1854   1854   1855   Any
        //  1847   1854   1854   1855   Any
        //  1848   1854   3      8      Ljava/lang/NumberFormatException;
        //  1847   1854   1854   1855   Ljava/lang/StringIndexOutOfBoundsException;
        //  1847   1854   1847   1848   Any
        //  1862   1869   1869   1870   Any
        //  1863   1869   1869   1870   Any
        //  1863   1869   1862   1863   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1862   1869   1869   1870   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1863   1869   1869   1870   Any
        //  1876   1883   1883   1884   Any
        //  1876   1883   1876   1877   Ljava/util/ConcurrentModificationException;
        //  1877   1883   3      8      Any
        //  1876   1883   1876   1877   Ljava/lang/IllegalArgumentException;
        //  1876   1883   1876   1877   Any
        //  1935   1942   1942   1943   Any
        //  1936   1942   3      8      Any
        //  1936   1942   1935   1936   Ljava/util/ConcurrentModificationException;
        //  1936   1942   1935   1936   Any
        //  1935   1942   1942   1943   Any
        //  1995   2002   2002   2003   Any
        //  1996   2002   1995   1996   Ljava/lang/IllegalArgumentException;
        //  1996   2002   2002   2003   Any
        //  1996   2002   3      8      Ljava/lang/UnsupportedOperationException;
        //  1995   2002   1995   1996   Any
        //  2009   2016   2016   2017   Any
        //  2009   2016   2009   2010   Any
        //  2009   2016   2016   2017   Any
        //  2009   2016   2016   2017   Any
        //  2010   2016   2016   2017   Ljava/lang/NegativeArraySizeException;
        //  2021   2028   2028   2029   Any
        //  2022   2028   2021   2022   Ljava/lang/EnumConstantNotPresentException;
        //  2021   2028   2021   2022   Any
        //  2021   2028   2021   2022   Ljava/lang/NegativeArraySizeException;
        //  2021   2028   3      8      Any
        //  2083   2090   2090   2091   Any
        //  2084   2090   2083   2084   Any
        //  2083   2090   2083   2084   Any
        //  2083   2090   2090   2091   Any
        //  2084   2090   2083   2084   Any
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
    
    static {
        throw t;
    }
    
    @Override
    public boolean 4() {
        return fbS.em(this, 146915029);
    }
    
    @Override
    public float c() {
        return fbS.aF(this, 1910330629);
    }
    
    @Override
    public float 3() {
        return fbS.ax(this, 292926951);
    }
}
