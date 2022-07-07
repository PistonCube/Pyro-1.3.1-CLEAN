// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f5J extends fH
{
    public f5J() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23f4\u149c\u8ae9\ub3cb\uc9d8\uede5\ub234\ue6ce\ud970\ue9bf\ua73d\u1e43\ue1e6\uc5b3"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23d4\u149c\u8ae9\ub3cb\uc9d8\uedc5\ub234\ue6ee\ud970\ue9bf\ua73d\u1e43\ue1e6\uc5b3"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: getstatic       dev/nuker/pyro/fc.1:I
        //    15: ifeq            23
        //    18: ldc             -1486346329
        //    20: goto            25
        //    23: ldc             -195349659
        //    25: ldc             854697833
        //    27: ixor           
        //    28: lookupswitch {
        //          -1785102130: 60
        //          -1555909685: 23
        //          default: 56
        //        }
        //    56: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    59: return         
        //    60: aconst_null    
        //    61: athrow         
        //    StackMapTable: 00 04 FF 00 17 00 01 06 00 04 06 07 00 1F 07 00 1F 05 FF 00 01 00 01 06 00 05 06 07 00 1F 07 00 1F 05 01 FF 00 1E 00 01 06 00 04 06 07 00 1F 07 00 1F 05 FF 00 03 00 01 06 00 04 06 07 00 1F 07 00 1F 05
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
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          997
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            989
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            981
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -275852045
        //    32: goto            37
        //    35: ldc             716335100
        //    37: ldc             31944206
        //    39: ixor           
        //    40: lookupswitch {
        //          -295060739: 966
        //          2047329052: 35
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            81
        //    76: ldc             -462767401
        //    78: goto            83
        //    81: ldc             -1632321569
        //    83: ldc             447445645
        //    85: ixor           
        //    86: lookupswitch {
        //          -950386507: 81
        //          -20856742: 958
        //          default: 112
        //        }
        //   112: aload_1        
        //   113: goto            117
        //   116: athrow         
        //   117: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //   120: goto            124
        //   123: athrow         
        //   124: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   127: if_acmpne       941
        //   130: aload_1        
        //   131: getstatic       dev/nuker/pyro/fc.1:I
        //   134: ifeq            142
        //   137: ldc             72248072
        //   139: goto            144
        //   142: ldc             -1088595502
        //   144: ldc             1949629532
        //   146: ixor           
        //   147: lookupswitch {
        //          1475510897: 142
        //          1887082324: 960
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   179: goto            183
        //   182: athrow         
        //   183: instanceof      Lnet/minecraft/network/play/server/SPacketDestroyEntities;
        //   186: ifeq            941
        //   189: aload_1        
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   197: goto            201
        //   200: athrow         
        //   201: dup            
        //   202: ifnonnull       275
        //   205: new             Lkotlin/TypeCastException;
        //   208: dup            
        //   209: ldc             "\u23f9\u1486\u8aea\ub1c4\ucf8b\uedf2\ub225\ue6c5\udb77\uefb7\ua725\u1e0c\ue1ed\uc7b3\u877f\u8969\u57a5\u771d\ubf38\uc644\u2b11\uc234\u6a46\u2f49\ud1d5\u359c\u7d66\u89ab\u8215\u8a93\u84bb\ufb72\u70cd\u981e\u1d9d\uf175\u493c\u8864\uc892\uf93b\ub681\u41fe\ub9f6\ub157\u4a78\u8ae1\u7c7b\uce2f\u7f59\uecde\ue681\u16d6\uee58\u358b\u40b5\ue1e4\u0a05\u86d1\u1b8a\u095a\u7706\u728c\uc7f8\ub9e5\u9cc6\u6a07\ue2f4\ud029\ua739\u23d7\u89ef\u4f92\u8b4a\u1618\ua5df\u70d6\u55a3\u1c7c\u63fa\u1797\u887d\u0522\uf8d8\u246e\u1f04\ub9de\u7cf6\u4b8c\u1845\u2293\uce23\ub2fb\ued3c"
        //   211: getstatic       dev/nuker/pyro/fc.c:I
        //   214: ifge            222
        //   217: ldc             -1635797389
        //   219: goto            224
        //   222: ldc             -1565051938
        //   224: ldc             -1565960897
        //   226: ixor           
        //   227: lookupswitch {
        //          1992417: 252
        //          1020715852: 222
        //          default: 970
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokestatic    invokestatic   !!! ERROR
        //   259: goto            263
        //   262: athrow         
        //   263: goto            267
        //   266: athrow         
        //   267: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   270: goto            274
        //   273: athrow         
        //   274: athrow         
        //   275: checkcast       Lnet/minecraft/network/play/server/SPacketDestroyEntities;
        //   278: getstatic       dev/nuker/pyro/fc.0:I
        //   281: ifeq            289
        //   284: ldc             1769209087
        //   286: goto            291
        //   289: ldc             793045517
        //   291: ldc             -2116044381
        //   293: ixor           
        //   294: lookupswitch {
        //          -799485056: 289
        //          -391363236: 954
        //          default: 320
        //        }
        //   320: astore_2       
        //   321: getstatic       dev/nuker/pyro/fc.0:I
        //   324: ifeq            332
        //   327: ldc             250088076
        //   329: goto            334
        //   332: ldc             -319164687
        //   334: ldc             -24815543
        //   336: ixor           
        //   337: lookupswitch {
        //          -261270843: 942
        //          -183850175: 332
        //          default: 364
        //        }
        //   364: aload_2        
        //   365: goto            369
        //   368: athrow         
        //   369: invokevirtual   net/minecraft/network/play/server/SPacketDestroyEntities.func_149098_c:()[I
        //   372: goto            376
        //   375: athrow         
        //   376: getstatic       dev/nuker/pyro/fc.0:I
        //   379: ifeq            387
        //   382: ldc             1307894625
        //   384: goto            389
        //   387: ldc             430304618
        //   389: ldc             -75993889
        //   391: ixor           
        //   392: lookupswitch {
        //          -1232302146: 956
        //          1917313672: 387
        //          default: 420
        //        }
        //   420: astore          5
        //   422: aload           5
        //   424: arraylength    
        //   425: istore          6
        //   427: iconst_0       
        //   428: istore          4
        //   430: iload           4
        //   432: iload           6
        //   434: if_icmpge       941
        //   437: aload           5
        //   439: getstatic       dev/nuker/pyro/fc.1:I
        //   442: ifeq            450
        //   445: ldc             961125315
        //   447: goto            452
        //   450: ldc             -675540329
        //   452: ldc             -942362838
        //   454: ixor           
        //   455: lookupswitch {
        //          -23251735: 450
        //          275299773: 480
        //          default: 944
        //        }
        //   480: iload           4
        //   482: iaload         
        //   483: istore_3       
        //   484: aload_0        
        //   485: getstatic       dev/nuker/pyro/fc.0:I
        //   488: ifeq            496
        //   491: ldc             -664017694
        //   493: goto            498
        //   496: ldc             209820371
        //   498: ldc             -645629760
        //   500: ixor           
        //   501: lookupswitch {
        //          32480290: 952
        //          660547089: 496
        //          default: 528
        //        }
        //   528: getfield        dev/nuker/pyro/f5J.c:Lnet/minecraft/client/Minecraft;
        //   531: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   534: iload_3        
        //   535: goto            539
        //   538: athrow         
        //   539: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73045_a:(I)Lnet/minecraft/entity/Entity;
        //   542: goto            546
        //   545: athrow         
        //   546: astore          7
        //   548: getstatic       dev/nuker/pyro/fc.0:I
        //   551: ifeq            559
        //   554: ldc             74620158
        //   556: goto            561
        //   559: ldc             -865360132
        //   561: ldc             544628279
        //   563: ixor           
        //   564: lookupswitch {
        //          -92441224: 559
        //          604291785: 950
        //          default: 592
        //        }
        //   592: aload           7
        //   594: ifnull          935
        //   597: aload           7
        //   599: aload_0        
        //   600: getfield        dev/nuker/pyro/f5J.c:Lnet/minecraft/client/Minecraft;
        //   603: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   606: checkcast       Lnet/minecraft/entity/Entity;
        //   609: getstatic       dev/nuker/pyro/fc.c:I
        //   612: ifge            620
        //   615: ldc             2036698458
        //   617: goto            622
        //   620: ldc             586393383
        //   622: ldc             1868329998
        //   624: ixor           
        //   625: lookupswitch {
        //          372898132: 620
        //          1303368489: 652
        //          default: 962
        //        }
        //   652: goto            656
        //   655: athrow         
        //   656: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   659: goto            663
        //   662: athrow         
        //   663: sipush          1000
        //   666: i2f            
        //   667: fcmpl          
        //   668: ifle            935
        //   671: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   674: new             Ljava/lang/StringBuilder;
        //   677: dup            
        //   678: goto            682
        //   681: athrow         
        //   682: invokespecial   java/lang/StringBuilder.<init>:()V
        //   685: goto            689
        //   688: athrow         
        //   689: ldc             "\u23d2\u149d\u8af2\ub1c1\ucfdf\uede8\ub264\ue6cf\udb7c\uefab\ua721\u1e4d\ue1f8\uc7b8\u873a\u896e\u57e4\u7708\ubf2d\uc616\u2b45\uc23a\u6a11\u2f46\ud1c3\u35d2\u7d2a\u89b1\u8240"
        //   691: goto            695
        //   694: athrow         
        //   695: invokestatic    invokestatic   !!! ERROR
        //   698: goto            702
        //   701: athrow         
        //   702: goto            706
        //   705: athrow         
        //   706: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   709: goto            713
        //   712: athrow         
        //   713: aload           7
        //   715: getstatic       dev/nuker/pyro/fc.c:I
        //   718: ifge            726
        //   721: ldc             2089792115
        //   723: goto            728
        //   726: ldc             -1587110421
        //   728: ldc             -211687619
        //   730: ixor           
        //   731: lookupswitch {
        //          -1880206002: 946
        //          -763750114: 726
        //          default: 756
        //        }
        //   756: goto            760
        //   759: athrow         
        //   760: invokevirtual   net/minecraft/entity/Entity.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   763: goto            767
        //   766: athrow         
        //   767: goto            771
        //   770: athrow         
        //   771: invokevirtual   net/minecraft/util/math/BlockPos.toString:()Ljava/lang/String;
        //   774: goto            778
        //   777: athrow         
        //   778: getstatic       dev/nuker/pyro/fc.0:I
        //   781: ifeq            789
        //   784: ldc             -1758028657
        //   786: goto            791
        //   789: ldc             -1069539215
        //   791: ldc             -1017717542
        //   793: ixor           
        //   794: lookupswitch {
        //          77635155: 789
        //          1415594069: 964
        //          default: 820
        //        }
        //   820: goto            824
        //   823: athrow         
        //   824: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   827: goto            831
        //   830: athrow         
        //   831: getstatic       dev/nuker/pyro/fc.1:I
        //   834: ifeq            842
        //   837: ldc             -610953459
        //   839: goto            844
        //   842: ldc             1856102666
        //   844: ldc             1590539771
        //   846: ixor           
        //   847: lookupswitch {
        //          -2057821450: 948
        //          301230271: 842
        //          default: 872
        //        }
        //   872: goto            876
        //   875: athrow         
        //   876: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   879: goto            883
        //   882: athrow         
        //   883: getstatic       dev/nuker/pyro/fc.1:I
        //   886: ifeq            894
        //   889: ldc             -1915469476
        //   891: goto            896
        //   894: ldc             -108976827
        //   896: ldc             1423894007
        //   898: ixor           
        //   899: lookupswitch {
        //          -1386233678: 924
        //          -653613909: 894
        //          default: 968
        //        }
        //   924: goto            928
        //   927: athrow         
        //   928: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   931: goto            935
        //   934: athrow         
        //   935: iinc            4, 1
        //   938: goto            430
        //   941: return         
        //   942: aconst_null    
        //   943: athrow         
        //   944: aconst_null    
        //   945: athrow         
        //   946: aconst_null    
        //   947: athrow         
        //   948: aconst_null    
        //   949: athrow         
        //   950: aconst_null    
        //   951: athrow         
        //   952: aconst_null    
        //   953: athrow         
        //   954: aconst_null    
        //   955: athrow         
        //   956: aconst_null    
        //   957: athrow         
        //   958: aconst_null    
        //   959: athrow         
        //   960: aconst_null    
        //   961: athrow         
        //   962: aconst_null    
        //   963: athrow         
        //   964: aconst_null    
        //   965: athrow         
        //   966: aconst_null    
        //   967: athrow         
        //   968: aconst_null    
        //   969: athrow         
        //   970: aconst_null    
        //   971: athrow         
        //   972: pop            
        //   973: goto            24
        //   976: pop            
        //   977: aconst_null    
        //   978: goto            972
        //   981: dup            
        //   982: ifnull          972
        //   985: checkcast       Ljava/lang/Throwable;
        //   988: athrow         
        //   989: dup            
        //   990: ifnull          976
        //   993: checkcast       Ljava/lang/Throwable;
        //   996: athrow         
        //   997: aconst_null    
        //   998: athrow         
        //    StackMapTable: 00 88 43 07 00 46 04 FF 00 0B 00 00 00 01 07 00 46 FD 00 03 07 00 03 07 00 50 0A 41 01 1E 0C 41 01 1C 43 07 00 2A 40 07 00 50 45 07 00 46 40 07 00 55 51 07 00 50 FF 00 01 00 02 07 00 03 07 00 50 00 02 07 00 50 01 5B 07 00 50 42 07 00 46 40 07 00 50 45 07 00 46 40 07 00 CA 49 07 00 32 40 07 00 50 45 07 00 46 40 07 00 CA FF 00 14 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F FF 00 01 00 02 07 00 03 07 00 50 00 05 07 00 CA 08 00 CD 08 00 CD 07 00 1F 01 FF 00 1B 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F FF 00 02 00 00 00 01 07 00 46 FF 00 00 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F 45 07 00 46 FF 00 00 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F 42 07 00 46 FF 00 00 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F 45 07 00 46 FF 00 00 00 02 07 00 03 07 00 50 00 02 07 00 CA 07 00 62 40 07 00 CA 4D 07 00 60 FF 00 01 00 02 07 00 03 07 00 50 00 02 07 00 60 01 5C 07 00 60 FC 00 0B 07 00 60 41 01 1D 43 07 00 46 40 07 00 60 45 07 00 46 40 07 00 CC 4A 07 00 CC FF 00 01 00 03 07 00 03 07 00 50 07 00 60 00 02 07 00 CC 01 5E 07 00 CC FF 00 09 00 07 07 00 03 07 00 50 07 00 60 00 01 07 00 CC 01 00 00 53 07 00 CC FF 00 01 00 07 07 00 03 07 00 50 07 00 60 00 01 07 00 CC 01 00 02 07 00 CC 01 5B 07 00 CC FF 00 0F 00 07 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 00 02 07 00 03 01 5D 07 00 03 49 07 00 46 FF 00 00 00 07 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 00 02 07 00 8A 01 45 07 00 46 40 07 00 97 FC 00 0C 07 00 97 41 01 1E FF 00 1B 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 97 07 00 97 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 97 07 00 97 01 FF 00 1D 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 97 07 00 97 42 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 97 07 00 97 45 07 00 46 40 02 51 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 08 02 A2 08 02 A2 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 44 07 00 30 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F 42 07 00 28 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 FF 00 0C 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 97 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 04 07 00 A0 07 00 A6 07 00 97 01 FF 00 1B 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 97 42 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 97 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 B7 42 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 B7 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F FF 00 0A 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 04 07 00 A0 07 00 A6 07 00 1F 01 FF 00 1C 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F FF 00 02 00 00 00 01 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 FF 00 0A 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 01 FF 00 1B 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 FF 00 02 00 00 00 01 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 45 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 1F FF 00 0A 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 1F FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 1F 01 FF 00 1B 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 1F FF 00 02 00 00 00 01 07 00 46 FF 00 00 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 1F 45 07 00 46 00 FF 00 05 00 02 07 00 03 07 00 50 00 00 FC 00 00 07 00 60 FF 00 01 00 07 07 00 03 07 00 50 07 00 60 00 01 07 00 CC 01 00 01 07 00 CC FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 97 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 A6 01 FF 00 01 00 07 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 50 00 01 07 00 60 FF 00 01 00 03 07 00 03 07 00 50 07 00 60 00 01 07 00 CC FA 00 01 41 07 00 50 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 97 07 00 97 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 03 07 00 A0 07 00 A6 07 00 1F FF 00 01 00 02 07 00 03 07 00 50 00 00 FF 00 01 00 08 07 00 03 07 00 50 07 00 60 01 01 07 00 CC 01 07 00 97 00 02 07 00 A0 07 00 1F FF 00 01 00 02 07 00 03 07 00 50 00 04 07 00 CA 08 00 CD 08 00 CD 07 00 1F 41 07 00 46 43 05 44 07 00 46 47 05 47 07 00 46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     981    989    Ljava/lang/RuntimeException;
        //  981    989    981    989    Any
        //  997    999    3      8      Any
        //  116    123    123    124    Any
        //  117    123    116    117    Ljava/lang/UnsupportedOperationException;
        //  116    123    3      8      Ljava/lang/NullPointerException;
        //  116    123    3      8      Any
        //  116    123    123    124    Any
        //  175    182    182    183    Any
        //  176    182    182    183    Any
        //  175    182    182    183    Ljava/lang/ClassCastException;
        //  176    182    175    176    Any
        //  175    182    175    176    Any
        //  193    200    200    201    Any
        //  193    200    200    201    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  194    200    200    201    Any
        //  193    200    193    194    Ljava/lang/IllegalArgumentException;
        //  193    200    3      8      Ljava/lang/RuntimeException;
        //  256    262    262    263    Any
        //  256    262    262    263    Any
        //  256    262    262    263    Ljava/lang/NullPointerException;
        //  256    262    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  256    262    262    263    Ljava/lang/IllegalArgumentException;
        //  266    273    273    274    Any
        //  266    273    3      8      Ljava/lang/NumberFormatException;
        //  267    273    3      8      Ljava/lang/ArithmeticException;
        //  266    273    273    274    Any
        //  266    273    266    267    Any
        //  368    375    375    376    Any
        //  368    375    368    369    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  369    375    368    369    Any
        //  369    375    375    376    Any
        //  369    375    368    369    Ljava/lang/IllegalStateException;
        //  538    545    545    546    Any
        //  538    545    538    539    Ljava/lang/IndexOutOfBoundsException;
        //  538    545    3      8      Ljava/lang/IllegalStateException;
        //  538    545    545    546    Ljava/lang/EnumConstantNotPresentException;
        //  539    545    538    539    Any
        //  655    662    662    663    Any
        //  655    662    3      8      Ljava/lang/NullPointerException;
        //  656    662    655    656    Any
        //  656    662    3      8      Ljava/lang/AssertionError;
        //  656    662    3      8      Any
        //  681    688    688    689    Any
        //  681    688    681    682    Ljava/util/ConcurrentModificationException;
        //  682    688    688    689    Any
        //  682    688    681    682    Any
        //  682    688    3      8      Any
        //  694    701    701    702    Any
        //  695    701    3      8      Any
        //  694    701    694    695    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  694    701    701    702    Any
        //  694    701    701    702    Any
        //  705    712    712    713    Any
        //  705    712    712    713    Ljava/lang/IllegalStateException;
        //  706    712    3      8      Any
        //  705    712    705    706    Ljava/util/NoSuchElementException;
        //  706    712    705    706    Ljava/util/ConcurrentModificationException;
        //  759    766    766    767    Any
        //  759    766    3      8      Ljava/lang/ArithmeticException;
        //  760    766    759    760    Any
        //  759    766    3      8      Ljava/util/ConcurrentModificationException;
        //  760    766    759    760    Any
        //  770    777    777    778    Any
        //  770    777    770    771    Any
        //  771    777    3      8      Ljava/lang/NegativeArraySizeException;
        //  771    777    777    778    Any
        //  771    777    770    771    Ljava/lang/ClassCastException;
        //  824    830    830    831    Any
        //  824    830    3      8      Any
        //  824    830    830    831    Any
        //  824    830    830    831    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  824    830    830    831    Any
        //  876    882    882    883    Any
        //  876    882    3      8      Any
        //  876    882    882    883    Any
        //  876    882    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  876    882    882    883    Any
        //  928    934    934    935    Any
        //  928    934    934    935    Any
        //  928    934    3      8      Ljava/lang/NullPointerException;
        //  928    934    934    935    Ljava/lang/IllegalArgumentException;
        //  928    934    934    935    Any
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
}
