// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import com.google.gson.JsonElement;
import org.jetbrains.annotations.NotNull;

public class f0k extends f0n
{
    @NotNull
    public fz<Boolean> c;
    
    public f0k(@NotNull final f0n p0, @NotNull final f0n... p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: pop            
        //     2: aload_2        
        //     3: pop            
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //     9: aload_2        
        //    10: dup            
        //    11: arraylength    
        //    12: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //    15: checkcast       [Ldev/nuker/pyro/f0n;
        //    18: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //    21: getstatic       dev/nuker/pyro/fc.c:I
        //    24: ifge            32
        //    27: ldc             -1470608811
        //    29: goto            34
        //    32: ldc             799670180
        //    34: ldc             292980791
        //    36: ixor           
        //    37: lookupswitch {
        //          -1188117918: 32
        //          1054832531: 64
        //          default: 626
        //        }
        //    64: invokespecial   dev/nuker/pyro/f0n.<init>:(Ljava/lang/String;Ljava/lang/Object;)V
        //    67: aload_0        
        //    68: new             Ldev/nuker/pyro/fz;
        //    71: dup            
        //    72: iconst_0       
        //    73: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    76: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;)V
        //    79: getstatic       dev/nuker/pyro/fc.0:I
        //    82: ifeq            90
        //    85: ldc             867127512
        //    87: goto            92
        //    90: ldc             -2142296556
        //    92: ldc             -1655468311
        //    94: ixor           
        //    95: lookupswitch {
        //          -1359159759: 636
        //          -754361636: 90
        //          default: 120
        //        }
        //   120: putfield        dev/nuker/pyro/f0k.c:Ldev/nuker/pyro/fz;
        //   123: aload_0        
        //   124: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   127: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   130: checkcast       Ljava/util/List;
        //   133: iconst_0       
        //   134: aload_1        
        //   135: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
        //   140: getstatic       dev/nuker/pyro/fc.1:I
        //   143: ifeq            151
        //   146: ldc             957881047
        //   148: goto            153
        //   151: ldc             -1155466979
        //   153: ldc             409051276
        //   155: ixor           
        //   156: lookupswitch {
        //          131417150: 151
        //          561625691: 624
        //          default: 184
        //        }
        //   184: aload_1        
        //   185: new             Ldev/nuker/pyro/f0i;
        //   188: dup            
        //   189: getstatic       dev/nuker/pyro/fc.1:I
        //   192: ifeq            200
        //   195: ldc             -1688931506
        //   197: goto            202
        //   200: ldc             -578135668
        //   202: ldc             -1425602486
        //   204: ixor           
        //   205: lookupswitch {
        //          810810116: 200
        //          1988972998: 232
        //          default: 630
        //        }
        //   232: aload_0        
        //   233: getstatic       dev/nuker/pyro/fc.c:I
        //   236: ifge            244
        //   239: ldc             1238422995
        //   241: goto            246
        //   244: ldc             1773319398
        //   246: ldc             1651048762
        //   248: ixor           
        //   249: lookupswitch {
        //          198948316: 276
        //          733598953: 244
        //          default: 632
        //        }
        //   276: invokespecial   dev/nuker/pyro/f0i.<init>:(Ldev/nuker/pyro/f0k;)V
        //   279: checkcast       Ljava/util/function/Consumer;
        //   282: getstatic       dev/nuker/pyro/fc.c:I
        //   285: ifge            293
        //   288: ldc             -1405237360
        //   290: goto            295
        //   293: ldc             -507837031
        //   295: ldc             812271030
        //   297: ixor           
        //   298: lookupswitch {
        //          -1671986650: 293
        //          -774815697: 324
        //          default: 638
        //        }
        //   324: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/util/function/Consumer;)V
        //   327: aload_0        
        //   328: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   331: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   334: checkcast       Ljava/util/List;
        //   337: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   342: astore          4
        //   344: aload           4
        //   346: getstatic       dev/nuker/pyro/fc.1:I
        //   349: ifeq            357
        //   352: ldc             -1008613809
        //   354: goto            359
        //   357: ldc             -1073797653
        //   359: ldc             1176460905
        //   361: ixor           
        //   362: lookupswitch {
        //          -2046912474: 357
        //          -102728830: 388
        //          default: 634
        //        }
        //   388: invokeinterface java/util/Iterator.hasNext:()Z
        //   393: ifeq            604
        //   396: getstatic       dev/nuker/pyro/fc.c:I
        //   399: ifge            407
        //   402: ldc             -822009808
        //   404: goto            409
        //   407: ldc             2057168067
        //   409: ldc             -82885390
        //   411: ixor           
        //   412: lookupswitch {
        //          -2121097167: 440
        //          873358530: 407
        //          default: 622
        //        }
        //   440: aload           4
        //   442: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   447: checkcast       Ldev/nuker/pyro/f0n;
        //   450: astore_3       
        //   451: aload_3        
        //   452: dup            
        //   453: ifnonnull       461
        //   456: ldc             -274516815
        //   458: goto            463
        //   461: ldc             -274516814
        //   463: ldc             503945932
        //   465: ixor           
        //   466: tableswitch {
        //          -480944902: 488
        //          -480944901: 544
        //          default: 456
        //        }
        //   488: new             Lkotlin/TypeCastException;
        //   491: dup            
        //   492: ldc             "\u2367\u1486\u8a6c\ub3d5\uc866\ued6c\ub225\ue643\ud966\ue85a\ua7bb\u1e0c\ue16b\uc5a2\u8092\u89f7\u57a5\u779b\ubd29\uc1a9\u2b8f\uc234\u6ac0\u2d58\ud638\u3502\u7d66\u892d\u8004\u8d7e\u8425\ufb72\u704b\u9a0f\u1a70\uf1eb\u493c\u88e8\uca83\ufed4\ub61f\u41fd\ub96c\ub343\u4d95\u8a6e\u7c27\uceb8\u7d57\ueb35\ue65e\u1696\ueeda\u379e\u4746\ue13b\u0a04\u8659\u19c1\u0eb3\u779d\u7283\uc760\ubbf4\u9b0b\u6a99\ue2f2\ud0ad\ua524\u2426\u8938\u4ffd\u8bf7\u1407\ua225\u704f\u55af\u1ce0\u6181\u105e\u88fe\u052f\uf812"
        //   494: invokestatic    invokestatic   !!! ERROR
        //   497: getstatic       dev/nuker/pyro/fc.1:I
        //   500: ifeq            508
        //   503: ldc             308518259
        //   505: goto            510
        //   508: ldc             1164704324
        //   510: ldc             1331287638
        //   512: ixor           
        //   513: lookupswitch {
        //          1564101413: 628
        //          1691281837: 508
        //          default: 540
        //        }
        //   540: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   543: athrow         
        //   544: new             Ldev/nuker/pyro/f0j;
        //   547: dup            
        //   548: aload_0        
        //   549: getstatic       dev/nuker/pyro/fc.1:I
        //   552: ifeq            560
        //   555: ldc             -1343832403
        //   557: goto            562
        //   560: ldc             791196936
        //   562: ldc             -1417971379
        //   564: ixor           
        //   565: lookupswitch {
        //          -2074883003: 592
        //          77449184: 560
        //          default: 620
        //        }
        //   592: invokespecial   dev/nuker/pyro/f0j.<init>:(Ldev/nuker/pyro/f0k;)V
        //   595: checkcast       Ljava/util/function/Consumer;
        //   598: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/util/function/Consumer;)V
        //   601: goto            344
        //   604: aload_0        
        //   605: new             Ldev/nuker/pyro/fz;
        //   608: dup            
        //   609: iconst_0       
        //   610: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   613: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;)V
        //   616: putfield        dev/nuker/pyro/f0k.c:Ldev/nuker/pyro/fz;
        //   619: return         
        //   620: aconst_null    
        //   621: athrow         
        //   622: aconst_null    
        //   623: athrow         
        //   624: aconst_null    
        //   625: athrow         
        //   626: aconst_null    
        //   627: athrow         
        //   628: aconst_null    
        //   629: athrow         
        //   630: aconst_null    
        //   631: athrow         
        //   632: aconst_null    
        //   633: athrow         
        //   634: aconst_null    
        //   635: athrow         
        //   636: aconst_null    
        //   637: athrow         
        //   638: aconst_null    
        //   639: athrow         
        //    StackMapTable: 00 2F FF 00 20 00 03 06 07 00 05 07 00 17 00 03 06 07 00 8F 07 00 45 FF 00 01 00 03 06 07 00 05 07 00 17 00 04 06 07 00 8F 07 00 45 01 FF 00 1D 00 03 06 07 00 05 07 00 17 00 03 06 07 00 8F 07 00 45 FF 00 19 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 03 07 00 2A FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 03 07 00 03 07 00 2A 01 FF 00 1B 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 03 07 00 2A 1E 41 01 1E FF 00 0F 00 03 07 00 03 07 00 05 07 00 17 00 03 07 00 05 08 00 B9 08 00 B9 FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 04 07 00 05 08 00 B9 08 00 B9 01 FF 00 1D 00 03 07 00 03 07 00 05 07 00 17 00 03 07 00 05 08 00 B9 08 00 B9 FF 00 0B 00 03 07 00 03 07 00 05 07 00 17 00 04 07 00 05 08 00 B9 08 00 B9 07 00 03 FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 05 07 00 05 08 00 B9 08 00 B9 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 05 07 00 17 00 04 07 00 05 08 00 B9 08 00 B9 07 00 03 FF 00 10 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 05 07 00 5C FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 03 07 00 05 07 00 5C 01 FF 00 1C 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 05 07 00 5C FD 00 13 00 07 00 6B 4C 07 00 6B FF 00 01 00 05 07 00 03 07 00 05 07 00 17 00 07 00 6B 00 02 07 00 6B 01 5C 07 00 6B 12 41 01 1E FF 00 0F 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 01 07 00 05 44 07 00 05 FF 00 01 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 02 07 00 05 01 58 07 00 05 FF 00 13 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 01 E8 08 01 E8 07 00 8F FF 00 01 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 05 07 00 05 08 01 E8 08 01 E8 07 00 8F 01 FF 00 1D 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 01 E8 08 01 E8 07 00 8F 43 07 00 05 FF 00 0F 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 02 20 08 02 20 07 00 03 FF 00 01 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 05 07 00 05 08 02 20 08 02 20 07 00 03 01 FF 00 1D 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 02 20 08 02 20 07 00 03 FF 00 0B 00 05 07 00 03 07 00 05 07 00 17 00 07 00 6B 00 00 FF 00 0F 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 02 20 08 02 20 07 00 03 FF 00 01 00 05 07 00 03 07 00 05 07 00 17 00 07 00 6B 00 00 F9 00 01 FF 00 01 00 03 06 07 00 05 07 00 17 00 03 06 07 00 8F 07 00 45 FF 00 01 00 05 07 00 03 07 00 05 07 00 17 07 00 05 07 00 6B 00 04 07 00 05 08 01 E8 08 01 E8 07 00 8F FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 03 07 00 05 08 00 B9 08 00 B9 FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 04 07 00 05 08 00 B9 08 00 B9 07 00 03 FF 00 01 00 05 07 00 03 07 00 05 07 00 17 00 07 00 6B 00 01 07 00 6B FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 03 07 00 2A FF 00 01 00 03 07 00 03 07 00 05 07 00 17 00 02 07 00 05 07 00 5C
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
    
    @NotNull
    public fz c() {
        return fbS.7g(this, 297423617);
    }
    
    public void c(@NotNull final fz fz) {
        fbS.1R(this, 881111462, fz);
    }
    
    @Override
    public void c(@NotNull final JsonElement p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          760
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            752
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            744
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             827875607
        //    32: goto            37
        //    35: ldc             1072429273
        //    37: ldc             1589928976
        //    39: ixor           
        //    40: lookupswitch {
        //          -1686875516: 35
        //          1872495879: 725
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: checkcast       Lcom/google/gson/JsonObject;
        //    74: astore_2       
        //    75: aload_0        
        //    76: getfield        dev/nuker/pyro/f0k.c:Ldev/nuker/pyro/fz;
        //    79: aload_2        
        //    80: ldc             "\u236c\u148b\u8a70\ub1c9\uce5b\ued6b\ub221\ue649"
        //    82: goto            86
        //    85: athrow         
        //    86: invokestatic    invokestatic   !!! ERROR
        //    89: goto            93
        //    92: athrow         
        //    93: getstatic       dev/nuker/pyro/fc.1:I
        //    96: ifeq            104
        //    99: ldc             -934905804
        //   101: goto            106
        //   104: ldc             -1207037957
        //   106: ldc             364094115
        //   108: ixor           
        //   109: lookupswitch {
        //          -571090281: 731
        //          1469518381: 104
        //          default: 136
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   143: goto            147
        //   146: athrow         
        //   147: dup            
        //   148: pop            
        //   149: getstatic       dev/nuker/pyro/fc.c:I
        //   152: ifge            160
        //   155: ldc             -1571112321
        //   157: goto            162
        //   160: ldc             -1889216230
        //   162: ldc             -1336266013
        //   164: ixor           
        //   165: lookupswitch {
        //          302024860: 160
        //          1061088249: 192
        //          default: 721
        //        }
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   199: goto            203
        //   202: athrow         
        //   203: getstatic       dev/nuker/pyro/fc.1:I
        //   206: ifeq            214
        //   209: ldc             2130399036
        //   211: goto            216
        //   214: ldc             -1754708107
        //   216: ldc             735562849
        //   218: ixor           
        //   219: lookupswitch {
        //          -1128363244: 244
        //          1428980573: 214
        //          default: 717
        //        }
        //   244: goto            248
        //   247: athrow         
        //   248: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   251: goto            255
        //   254: athrow         
        //   255: goto            259
        //   258: athrow         
        //   259: invokevirtual   dev/nuker/pyro/fz.c:(Ljava/lang/Object;)V
        //   262: goto            266
        //   265: athrow         
        //   266: aload_2        
        //   267: ldc             "\u236a\u149b\u8a69\ub1c4\uce51\ued7d\ub221\ue643"
        //   269: goto            273
        //   272: athrow         
        //   273: invokestatic    invokestatic   !!! ERROR
        //   276: goto            280
        //   279: athrow         
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   287: goto            291
        //   290: athrow         
        //   291: dup            
        //   292: pop            
        //   293: goto            297
        //   296: athrow         
        //   297: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //   300: goto            304
        //   303: athrow         
        //   304: astore_3       
        //   305: aload_0        
        //   306: getstatic       dev/nuker/pyro/fc.0:I
        //   309: ifeq            317
        //   312: ldc             1511538872
        //   314: goto            319
        //   317: ldc             1048006094
        //   319: ldc             706296893
        //   321: ixor           
        //   322: lookupswitch {
        //          342782451: 348
        //          1879145605: 317
        //          default: 723
        //        }
        //   348: goto            352
        //   351: athrow         
        //   352: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   355: goto            359
        //   358: athrow         
        //   359: getstatic       dev/nuker/pyro/fc.1:I
        //   362: ifeq            370
        //   365: ldc             -1688331159
        //   367: goto            372
        //   370: ldc             -1282366060
        //   372: ldc             -779311803
        //   374: ixor           
        //   375: lookupswitch {
        //          1226905341: 370
        //          1255323948: 733
        //          default: 400
        //        }
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   407: goto            411
        //   410: athrow         
        //   411: dup            
        //   412: ifnonnull       426
        //   415: goto            419
        //   418: athrow         
        //   419: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   422: goto            426
        //   425: athrow         
        //   426: checkcast       Ljava/util/List;
        //   429: goto            433
        //   432: athrow         
        //   433: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   438: goto            442
        //   441: athrow         
        //   442: astore          5
        //   444: getstatic       dev/nuker/pyro/fc.c:I
        //   447: ifge            455
        //   450: ldc             2022356473
        //   452: goto            457
        //   455: ldc             662493393
        //   457: ldc             1266410450
        //   459: ixor           
        //   460: lookupswitch {
        //          871454251: 729
        //          1707468038: 455
        //          default: 488
        //        }
        //   488: aload           5
        //   490: goto            494
        //   493: athrow         
        //   494: invokeinterface java/util/Iterator.hasNext:()Z
        //   499: goto            503
        //   502: athrow         
        //   503: ifeq            511
        //   506: ldc             1322981215
        //   508: goto            513
        //   511: ldc             1322981212
        //   513: ldc             1617925618
        //   515: ixor           
        //   516: tableswitch {
        //          1567163738: 540
        //          1567163739: 716
        //          default: 506
        //        }
        //   540: aload           5
        //   542: goto            546
        //   545: athrow         
        //   546: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   551: goto            555
        //   554: athrow         
        //   555: checkcast       Ldev/nuker/pyro/f0n;
        //   558: astore          4
        //   560: aload_3        
        //   561: aload           4
        //   563: goto            567
        //   566: athrow         
        //   567: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   570: goto            574
        //   573: athrow         
        //   574: goto            578
        //   577: athrow         
        //   578: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   581: goto            585
        //   584: athrow         
        //   585: ifeq            713
        //   588: aload           4
        //   590: getstatic       dev/nuker/pyro/fc.1:I
        //   593: ifeq            601
        //   596: ldc             795651715
        //   598: goto            603
        //   601: ldc             430959154
        //   603: ldc             -1075449588
        //   605: ixor           
        //   606: lookupswitch {
        //          -1870045297: 601
        //          -1505092802: 632
        //          default: 727
        //        }
        //   632: aload_3        
        //   633: getstatic       dev/nuker/pyro/fc.1:I
        //   636: ifeq            644
        //   639: ldc             -1693676823
        //   641: goto            646
        //   644: ldc             -1004402937
        //   646: ldc             -1617447070
        //   648: ixor           
        //   649: lookupswitch {
        //          77282699: 644
        //          1538633829: 676
        //          default: 719
        //        }
        //   676: aload           4
        //   678: goto            682
        //   681: athrow         
        //   682: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   685: goto            689
        //   688: athrow         
        //   689: goto            693
        //   692: athrow         
        //   693: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   696: goto            700
        //   699: athrow         
        //   700: dup            
        //   701: pop            
        //   702: goto            706
        //   705: athrow         
        //   706: invokevirtual   dev/nuker/pyro/f0n.c:(Lcom/google/gson/JsonElement;)V
        //   709: goto            713
        //   712: athrow         
        //   713: goto            444
        //   716: return         
        //   717: aconst_null    
        //   718: athrow         
        //   719: aconst_null    
        //   720: athrow         
        //   721: aconst_null    
        //   722: athrow         
        //   723: aconst_null    
        //   724: athrow         
        //   725: aconst_null    
        //   726: athrow         
        //   727: aconst_null    
        //   728: athrow         
        //   729: aconst_null    
        //   730: athrow         
        //   731: aconst_null    
        //   732: athrow         
        //   733: aconst_null    
        //   734: athrow         
        //   735: pop            
        //   736: goto            24
        //   739: pop            
        //   740: aconst_null    
        //   741: goto            735
        //   744: dup            
        //   745: ifnull          735
        //   748: checkcast       Ljava/lang/Throwable;
        //   751: athrow         
        //   752: dup            
        //   753: ifnull          739
        //   756: checkcast       Ljava/lang/Throwable;
        //   759: athrow         
        //   760: aconst_null    
        //   761: athrow         
        //    StackMapTable: 00 7F FF 00 03 00 03 07 00 03 07 00 D3 07 00 C5 00 01 07 00 C0 FA 00 04 FF 00 0B 00 00 00 01 07 00 C0 FD 00 03 07 00 03 07 00 D3 0A 41 01 1E FF 00 10 00 03 07 00 03 07 00 D3 07 00 C5 00 01 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F FF 00 0A 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F FF 00 01 00 03 07 00 03 07 00 D3 07 00 C5 00 04 07 00 2A 07 00 C5 07 00 8F 01 FF 00 1D 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F 42 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 D3 FF 00 0C 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 D3 FF 00 01 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 D3 01 FF 00 1D 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 D3 42 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 D3 45 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 01 FF 00 0A 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 01 FF 00 01 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 01 01 FF 00 1B 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 01 42 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 01 45 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 2C FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 2C 45 07 00 C0 00 45 07 00 AE FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 C5 07 00 8F 42 07 00 B2 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 C5 07 00 8F 45 07 00 C0 40 07 00 D3 44 07 00 C0 40 07 00 D3 45 07 00 C0 40 07 00 C5 FF 00 0C 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 02 07 00 03 01 5C 07 00 03 42 07 00 C0 40 07 00 03 45 07 00 C0 40 07 00 40 4A 07 00 40 FF 00 01 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 02 07 00 40 01 5B 07 00 40 42 07 00 C0 40 07 00 40 45 07 00 C0 40 07 01 01 FF 00 06 00 00 00 01 07 00 C0 FF 00 00 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 01 07 01 01 45 07 00 C0 40 07 01 01 45 07 00 C0 40 07 00 45 47 07 00 C0 40 07 00 6B FD 00 01 00 07 00 6B 0A 41 01 1E 44 07 00 C0 40 07 00 6B 47 07 00 C0 40 01 02 04 41 01 1A 44 07 00 C0 40 07 00 6B 47 07 00 C0 40 07 01 01 FF 00 0A 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 01 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 C5 07 00 05 45 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 C5 07 00 8F 45 07 00 C0 40 01 4F 07 00 05 FF 00 01 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 01 5C 07 00 05 FF 00 0B 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 07 00 C5 FF 00 01 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 05 07 00 C5 01 FF 00 1D 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 07 00 C5 FF 00 04 00 00 00 01 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 05 07 00 C5 07 00 05 45 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 05 07 00 C5 07 00 8F FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 05 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 07 00 D3 44 07 00 BE FF 00 00 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 07 00 D3 45 07 00 C0 00 FF 00 02 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 07 00 6B 00 00 FF 00 00 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 01 FF 00 01 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 05 07 00 C5 FF 00 01 00 03 07 00 03 07 00 D3 07 00 C5 00 02 07 00 2A 07 00 D3 FF 00 01 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 01 07 00 03 F9 00 01 FF 00 01 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 01 07 00 05 FF 00 01 00 06 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 07 00 6B 00 00 FF 00 01 00 03 07 00 03 07 00 D3 07 00 C5 00 03 07 00 2A 07 00 C5 07 00 8F FF 00 01 00 04 07 00 03 07 00 D3 07 00 C5 07 00 C5 00 01 07 00 40 FF 00 01 00 02 07 00 03 07 00 D3 00 01 07 00 C0 43 05 44 07 00 C0 47 05 FF 00 07 00 03 07 00 03 07 00 D3 07 00 C5 00 01 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     744    752    Any
        //  744    752    744    752    Ljava/lang/IllegalStateException;
        //  760    762    3      8      Ljava/lang/IllegalArgumentException;
        //  85     92     92     93     Any
        //  85     92     85     86     Ljava/lang/NullPointerException;
        //  86     92     85     86     Any
        //  85     92     92     93     Any
        //  85     92     92     93     Any
        //  139    146    146    147    Any
        //  140    146    139    140    Any
        //  140    146    139    140    Any
        //  139    146    139    140    Any
        //  140    146    146    147    Any
        //  195    202    202    203    Any
        //  195    202    3      8      Ljava/lang/IllegalArgumentException;
        //  196    202    195    196    Any
        //  196    202    202    203    Any
        //  196    202    3      8      Any
        //  247    254    254    255    Any
        //  248    254    3      8      Any
        //  247    254    254    255    Any
        //  247    254    247    248    Any
        //  247    254    247    248    Ljava/util/NoSuchElementException;
        //  259    265    265    266    Any
        //  259    265    3      8      Any
        //  259    265    3      8      Any
        //  259    265    265    266    Any
        //  259    265    265    266    Ljava/lang/RuntimeException;
        //  272    279    279    280    Any
        //  273    279    3      8      Ljava/lang/RuntimeException;
        //  272    279    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  273    279    279    280    Any
        //  273    279    272    273    Ljava/lang/NumberFormatException;
        //  283    290    290    291    Any
        //  283    290    290    291    Any
        //  283    290    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  284    290    283    284    Ljava/util/ConcurrentModificationException;
        //  283    290    290    291    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  296    303    303    304    Any
        //  296    303    303    304    Ljava/lang/NegativeArraySizeException;
        //  296    303    296    297    Any
        //  296    303    296    297    Ljava/lang/NullPointerException;
        //  296    303    303    304    Ljava/util/NoSuchElementException;
        //  351    358    358    359    Any
        //  351    358    351    352    Ljava/lang/NegativeArraySizeException;
        //  351    358    3      8      Ljava/lang/IllegalArgumentException;
        //  351    358    3      8      Ljava/util/ConcurrentModificationException;
        //  351    358    351    352    Any
        //  403    410    410    411    Any
        //  403    410    403    404    Ljava/lang/EnumConstantNotPresentException;
        //  404    410    403    404    Ljava/lang/ArithmeticException;
        //  404    410    410    411    Any
        //  403    410    403    404    Any
        //  419    425    425    426    Any
        //  419    425    425    426    Ljava/lang/NegativeArraySizeException;
        //  419    425    425    426    Ljava/lang/NegativeArraySizeException;
        //  419    425    3      8      Ljava/util/ConcurrentModificationException;
        //  419    425    425    426    Ljava/lang/ClassCastException;
        //  432    441    441    442    Any
        //  433    441    441    442    Any
        //  433    441    432    433    Any
        //  433    441    432    433    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  432    441    441    442    Ljava/util/NoSuchElementException;
        //  493    502    502    503    Any
        //  494    502    493    494    Any
        //  494    502    493    494    Any
        //  494    502    3      8      Ljava/util/ConcurrentModificationException;
        //  493    502    502    503    Ljava/lang/EnumConstantNotPresentException;
        //  545    554    554    555    Any
        //  545    554    554    555    Any
        //  546    554    545    546    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  546    554    545    546    Any
        //  546    554    554    555    Ljava/util/NoSuchElementException;
        //  566    573    573    574    Any
        //  567    573    573    574    Ljava/lang/RuntimeException;
        //  567    573    566    567    Any
        //  567    573    566    567    Ljava/lang/StringIndexOutOfBoundsException;
        //  566    573    3      8      Any
        //  578    584    584    585    Any
        //  578    584    584    585    Any
        //  578    584    584    585    Ljava/lang/NullPointerException;
        //  578    584    3      8      Any
        //  578    584    584    585    Ljava/lang/RuntimeException;
        //  682    688    688    689    Any
        //  682    688    688    689    Ljava/lang/IllegalArgumentException;
        //  682    688    3      8      Ljava/util/NoSuchElementException;
        //  682    688    688    689    Ljava/lang/UnsupportedOperationException;
        //  682    688    688    689    Ljava/lang/RuntimeException;
        //  693    699    699    700    Any
        //  693    699    3      8      Any
        //  693    699    3      8      Any
        //  693    699    699    700    Ljava/lang/UnsupportedOperationException;
        //  693    699    699    700    Any
        //  705    712    712    713    Any
        //  705    712    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  705    712    712    713    Ljava/lang/NegativeArraySizeException;
        //  706    712    712    713    Ljava/lang/IllegalStateException;
        //  706    712    705    706    Ljava/lang/IndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
    
    @NotNull
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          699
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            691
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            683
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: checkcast       Ljava/util/List;
        //    42: astore_1       
        //    43: iconst_1       
        //    44: istore_2       
        //    45: aload_0        
        //    46: goto            50
        //    49: athrow         
        //    50: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //    53: goto            57
        //    56: athrow         
        //    57: goto            61
        //    60: athrow         
        //    61: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //    64: goto            68
        //    67: athrow         
        //    68: dup            
        //    69: ifnonnull       127
        //    72: getstatic       dev/nuker/pyro/fc.0:I
        //    75: ifeq            84
        //    78: ldc_w           875213435
        //    81: goto            87
        //    84: ldc_w           -1499244612
        //    87: ldc_w           457156421
        //    90: ixor           
        //    91: lookupswitch {
        //          -834357103: 84
        //          789910846: 668
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   123: goto            127
        //   126: athrow         
        //   127: checkcast       Ljava/util/List;
        //   130: goto            134
        //   133: athrow         
        //   134: invokeinterface java/util/List.size:()I
        //   139: goto            143
        //   142: athrow         
        //   143: istore_3       
        //   144: iload_2        
        //   145: iload_3        
        //   146: if_icmpge       423
        //   149: aload_1        
        //   150: getstatic       dev/nuker/pyro/fc.1:I
        //   153: ifeq            162
        //   156: ldc_w           -981932241
        //   159: goto            165
        //   162: ldc_w           1180888953
        //   165: ldc_w           -677093000
        //   168: ixor           
        //   169: lookupswitch {
        //          -1849258495: 196
        //          316442199: 162
        //          default: 672
        //        }
        //   196: aload_0        
        //   197: getstatic       dev/nuker/pyro/fc.1:I
        //   200: ifeq            209
        //   203: ldc_w           1209555352
        //   206: goto            212
        //   209: ldc_w           -1559954771
        //   212: ldc_w           1249205025
        //   215: ixor           
        //   216: lookupswitch {
        //          -378429044: 244
        //          40698553: 209
        //          default: 666
        //        }
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   251: goto            255
        //   254: athrow         
        //   255: goto            259
        //   258: athrow         
        //   259: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   262: goto            266
        //   265: athrow         
        //   266: dup            
        //   267: ifnonnull       327
        //   270: getstatic       dev/nuker/pyro/fc.1:I
        //   273: ifeq            282
        //   276: ldc_w           -1115212862
        //   279: goto            285
        //   282: ldc_w           -1593767093
        //   285: ldc_w           -581599062
        //   288: ixor           
        //   289: lookupswitch {
        //          1624421224: 282
        //          2085915617: 316
        //          default: 658
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   323: goto            327
        //   326: athrow         
        //   327: checkcast       Ljava/util/List;
        //   330: iload_2        
        //   331: goto            335
        //   334: athrow         
        //   335: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   340: goto            344
        //   343: athrow         
        //   344: checkcast       Ldev/nuker/pyro/f0n;
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            359
        //   353: ldc_w           1083507253
        //   356: goto            362
        //   359: ldc_w           89640575
        //   362: ldc_w           391505224
        //   365: ixor           
        //   366: lookupswitch {
        //          -859024726: 359
        //          1472259965: 660
        //          default: 392
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   dev/nuker/pyro/f0n.4:()Ldev/nuker/pyro/f0V;
        //   399: goto            403
        //   402: athrow         
        //   403: goto            407
        //   406: athrow         
        //   407: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   412: goto            416
        //   415: athrow         
        //   416: pop            
        //   417: iinc            2, 1
        //   420: goto            144
        //   423: new             Ldev/nuker/pyro/f0M;
        //   426: dup            
        //   427: aload_0        
        //   428: goto            432
        //   431: athrow         
        //   432: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   435: goto            439
        //   438: athrow         
        //   439: getstatic       dev/nuker/pyro/fc.1:I
        //   442: ifeq            451
        //   445: ldc_w           -1539068298
        //   448: goto            454
        //   451: ldc_w           -1655098855
        //   454: ldc_w           2106855914
        //   457: ixor           
        //   458: lookupswitch {
        //          -640172132: 670
        //          172567159: 451
        //          default: 484
        //        }
        //   484: goto            488
        //   487: athrow         
        //   488: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   491: goto            495
        //   494: athrow         
        //   495: dup            
        //   496: ifnonnull       510
        //   499: goto            503
        //   502: athrow         
        //   503: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   506: goto            510
        //   509: athrow         
        //   510: checkcast       Ljava/util/List;
        //   513: iconst_0       
        //   514: goto            518
        //   517: athrow         
        //   518: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   523: goto            527
        //   526: athrow         
        //   527: checkcast       Ldev/nuker/pyro/f0n;
        //   530: goto            534
        //   533: athrow         
        //   534: invokevirtual   dev/nuker/pyro/f0n.4:()Ldev/nuker/pyro/f0V;
        //   537: goto            541
        //   540: athrow         
        //   541: getstatic       dev/nuker/pyro/fc.1:I
        //   544: ifeq            553
        //   547: ldc_w           -353969544
        //   550: goto            556
        //   553: ldc_w           1829345133
        //   556: ldc_w           -2028231713
        //   559: ixor           
        //   560: lookupswitch {
        //          -367905614: 588
        //          1845328295: 553
        //          default: 662
        //        }
        //   588: aload_1        
        //   589: getstatic       dev/nuker/pyro/fc.1:I
        //   592: ifeq            601
        //   595: ldc_w           1743669945
        //   598: goto            604
        //   601: ldc_w           -1320864284
        //   604: ldc_w           1830656187
        //   607: ixor           
        //   608: lookupswitch {
        //          -598168225: 636
        //          183751170: 601
        //          default: 664
        //        }
        //   636: aload_0        
        //   637: getfield        dev/nuker/pyro/f0k.c:Ldev/nuker/pyro/fz;
        //   640: checkcast       Ldev/nuker/pyro/fw;
        //   643: goto            647
        //   646: athrow         
        //   647: invokespecial   dev/nuker/pyro/f0M.<init>:(Ldev/nuker/pyro/f0V;Ljava/util/List;Ldev/nuker/pyro/fw;)V
        //   650: goto            654
        //   653: athrow         
        //   654: checkcast       Ldev/nuker/pyro/f0V;
        //   657: areturn        
        //   658: aconst_null    
        //   659: athrow         
        //   660: aconst_null    
        //   661: athrow         
        //   662: aconst_null    
        //   663: athrow         
        //   664: aconst_null    
        //   665: athrow         
        //   666: aconst_null    
        //   667: athrow         
        //   668: aconst_null    
        //   669: athrow         
        //   670: aconst_null    
        //   671: athrow         
        //   672: aconst_null    
        //   673: athrow         
        //   674: pop            
        //   675: goto            24
        //   678: pop            
        //   679: aconst_null    
        //   680: goto            674
        //   683: dup            
        //   684: ifnull          674
        //   687: checkcast       Ljava/lang/Throwable;
        //   690: athrow         
        //   691: dup            
        //   692: ifnull          678
        //   695: checkcast       Ljava/lang/Throwable;
        //   698: athrow         
        //   699: aconst_null    
        //   700: athrow         
        //    StackMapTable: 00 6F 43 07 00 C0 04 FF 00 0B 00 00 00 01 07 00 C0 FC 00 03 07 00 03 46 07 00 C0 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 C0 40 07 01 07 FF 00 09 00 03 07 00 03 07 00 45 01 00 01 07 00 C0 40 07 00 03 45 07 00 C0 40 07 00 40 FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 03 07 00 03 07 00 45 01 00 01 07 00 40 45 07 00 C0 40 07 01 01 4F 07 01 01 FF 00 02 00 03 07 00 03 07 00 45 01 00 02 07 01 01 01 5C 07 01 01 42 07 00 C0 40 07 01 01 45 07 00 C0 40 07 01 01 45 07 00 C0 40 07 00 45 47 07 00 C0 40 01 FC 00 00 01 51 07 00 45 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 01 5E 07 00 45 FF 00 0C 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 03 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 03 07 00 45 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 03 42 07 00 AA FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 03 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 40 42 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 40 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 FF 00 0F 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 03 07 00 45 07 01 01 01 FF 00 1E 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 42 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 46 07 00 AA FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 07 00 45 07 00 45 01 47 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 FF 00 0E 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 05 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 03 07 00 45 07 00 05 01 FF 00 1D 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 05 42 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 05 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 34 42 07 00 B4 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 34 47 07 00 C0 40 01 06 47 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 03 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 40 FF 00 0B 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 40 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 00 40 01 FF 00 1D 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 40 42 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 40 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 01 46 07 00 AA FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 01 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 01 46 07 00 B2 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 00 45 01 47 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 01 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 05 45 07 00 C0 FF 00 00 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 34 FF 00 0B 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 34 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 01 34 01 FF 00 1F 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 34 FF 00 0C 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 01 34 07 00 45 FF 00 02 00 04 07 00 03 07 00 45 01 01 00 05 08 01 A7 08 01 A7 07 01 34 07 00 45 01 FF 00 1F 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 01 34 07 00 45 49 07 00 AA FF 00 00 00 04 07 00 03 07 00 45 01 01 00 05 08 01 A7 08 01 A7 07 01 34 07 00 45 07 00 40 45 07 00 C0 40 07 01 26 FF 00 03 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 01 01 FF 00 01 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 05 FF 00 01 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 01 34 FF 00 01 00 04 07 00 03 07 00 45 01 01 00 04 08 01 A7 08 01 A7 07 01 34 07 00 45 FF 00 01 00 04 07 00 03 07 00 45 01 01 00 02 07 00 45 07 00 03 FF 00 01 00 03 07 00 03 07 00 45 01 00 01 07 01 01 FF 00 01 00 04 07 00 03 07 00 45 01 01 00 03 08 01 A7 08 01 A7 07 00 40 41 07 00 45 FF 00 01 00 01 07 00 03 00 01 07 00 C0 43 05 44 07 00 C0 47 05 47 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     683    691    Any
        //  683    691    683    691    Any
        //  699    701    3      8      Ljava/util/ConcurrentModificationException;
        //  31     38     38     39     Any
        //  31     38     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  32     38     31     32     Ljava/lang/AssertionError;
        //  31     38     38     39     Ljava/lang/AssertionError;
        //  31     38     31     32     Any
        //  49     56     56     57     Any
        //  49     56     49     50     Any
        //  49     56     49     50     Any
        //  50     56     56     57     Any
        //  49     56     3      8      Any
        //  61     67     67     68     Any
        //  61     67     67     68     Any
        //  61     67     67     68     Any
        //  61     67     3      8      Any
        //  61     67     3      8      Ljava/lang/IllegalStateException;
        //  119    126    126    127    Any
        //  120    126    119    120    Ljava/lang/NumberFormatException;
        //  120    126    3      8      Any
        //  119    126    119    120    Any
        //  119    126    119    120    Ljava/lang/ArithmeticException;
        //  133    142    142    143    Any
        //  134    142    142    143    Ljava/lang/NumberFormatException;
        //  133    142    133    134    Ljava/lang/AssertionError;
        //  133    142    133    134    Ljava/lang/IndexOutOfBoundsException;
        //  134    142    3      8      Any
        //  247    254    254    255    Any
        //  248    254    247    248    Ljava/lang/ArithmeticException;
        //  247    254    247    248    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  247    254    247    248    Ljava/lang/IndexOutOfBoundsException;
        //  248    254    3      8      Ljava/lang/IllegalStateException;
        //  258    265    265    266    Any
        //  258    265    265    266    Ljava/lang/IndexOutOfBoundsException;
        //  258    265    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  258    265    258    259    Ljava/lang/StringIndexOutOfBoundsException;
        //  259    265    258    259    Any
        //  319    326    326    327    Any
        //  320    326    3      8      Any
        //  319    326    326    327    Any
        //  320    326    319    320    Any
        //  319    326    326    327    Ljava/lang/NullPointerException;
        //  334    343    343    344    Any
        //  335    343    3      8      Any
        //  334    343    334    335    Ljava/lang/ArithmeticException;
        //  335    343    334    335    Ljava/lang/EnumConstantNotPresentException;
        //  335    343    334    335    Ljava/lang/UnsupportedOperationException;
        //  395    402    402    403    Any
        //  396    402    402    403    Ljava/lang/StringIndexOutOfBoundsException;
        //  395    402    402    403    Ljava/lang/NumberFormatException;
        //  395    402    395    396    Any
        //  395    402    395    396    Any
        //  406    415    415    416    Any
        //  406    415    406    407    Ljava/lang/NegativeArraySizeException;
        //  407    415    3      8      Ljava/util/NoSuchElementException;
        //  407    415    415    416    Any
        //  406    415    3      8      Ljava/lang/NullPointerException;
        //  431    438    438    439    Any
        //  431    438    431    432    Ljava/util/NoSuchElementException;
        //  432    438    431    432    Any
        //  432    438    431    432    Any
        //  431    438    3      8      Ljava/lang/NumberFormatException;
        //  487    494    494    495    Any
        //  487    494    494    495    Any
        //  487    494    494    495    Any
        //  487    494    487    488    Any
        //  487    494    487    488    Any
        //  502    509    509    510    Any
        //  503    509    502    503    Ljava/lang/NumberFormatException;
        //  502    509    509    510    Any
        //  502    509    502    503    Ljava/lang/StringIndexOutOfBoundsException;
        //  503    509    509    510    Any
        //  517    526    526    527    Any
        //  518    526    517    518    Ljava/util/ConcurrentModificationException;
        //  518    526    526    527    Any
        //  518    526    3      8      Ljava/lang/UnsupportedOperationException;
        //  518    526    3      8      Ljava/lang/NumberFormatException;
        //  533    540    540    541    Any
        //  533    540    533    534    Any
        //  533    540    3      8      Any
        //  534    540    540    541    Any
        //  534    540    533    534    Any
        //  646    653    653    654    Any
        //  647    653    646    647    Ljava/util/ConcurrentModificationException;
        //  647    653    653    654    Any
        //  647    653    646    647    Ljava/lang/UnsupportedOperationException;
        //  646    653    653    654    Any
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
    
    @NotNull
    @Override
    public JsonElement c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          860
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            852
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            844
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            40
        //    34: ldc_w           -1451036381
        //    37: goto            43
        //    40: ldc_w           66141924
        //    43: ldc_w           -919513305
        //    46: ixor           
        //    47: lookupswitch {
        //          -893359677: 72
        //          1622386180: 40
        //          default: 815
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: astore_1       
        //    84: getstatic       dev/nuker/pyro/fc.0:I
        //    87: ifeq            96
        //    90: ldc_w           -1109171415
        //    93: goto            99
        //    96: ldc_w           1466517866
        //    99: ldc_w           -54858104
        //   102: ixor           
        //   103: lookupswitch {
        //          -1412192286: 128
        //          1096388001: 96
        //          default: 817
        //        }
        //   128: aload_1        
        //   129: ldc             "\u236c\u148b\u8a70\ub1c9\uce5b\ued6b\ub221\ue649"
        //   131: getstatic       dev/nuker/pyro/fc.0:I
        //   134: ifeq            143
        //   137: ldc_w           1605715703
        //   140: goto            146
        //   143: ldc_w           -692711283
        //   146: ldc_w           -1355289623
        //   149: ixor           
        //   150: lookupswitch {
        //          -1047240344: 143
        //          -259871458: 819
        //          default: 176
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokestatic    invokestatic   !!! ERROR
        //   183: goto            187
        //   186: athrow         
        //   187: new             Lcom/google/gson/JsonPrimitive;
        //   190: dup            
        //   191: aload_0        
        //   192: getstatic       dev/nuker/pyro/fc.1:I
        //   195: ifeq            204
        //   198: ldc_w           -525107713
        //   201: goto            207
        //   204: ldc_w           -55969153
        //   207: ldc_w           970360016
        //   210: ixor           
        //   211: lookupswitch {
        //          -981500241: 236
        //          -647628497: 204
        //          default: 821
        //        }
        //   236: getfield        dev/nuker/pyro/f0k.c:Ldev/nuker/pyro/fz;
        //   239: getstatic       dev/nuker/pyro/fc.c:I
        //   242: ifge            251
        //   245: ldc_w           -589266567
        //   248: goto            254
        //   251: ldc_w           -1913762821
        //   254: ldc_w           930011449
        //   257: ixor           
        //   258: lookupswitch {
        //          -342992832: 823
        //          983485688: 251
        //          default: 284
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   dev/nuker/pyro/fz.0:()Ljava/lang/Object;
        //   291: goto            295
        //   294: athrow         
        //   295: checkcast       Ljava/lang/Boolean;
        //   298: goto            302
        //   301: athrow         
        //   302: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   305: goto            309
        //   308: athrow         
        //   309: checkcast       Lcom/google/gson/JsonElement;
        //   312: goto            316
        //   315: athrow         
        //   316: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   319: goto            323
        //   322: athrow         
        //   323: new             Lcom/google/gson/JsonObject;
        //   326: dup            
        //   327: goto            331
        //   330: athrow         
        //   331: invokespecial   com/google/gson/JsonObject.<init>:()V
        //   334: goto            338
        //   337: athrow         
        //   338: astore_2       
        //   339: aload_0        
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //   347: goto            351
        //   350: athrow         
        //   351: getstatic       dev/nuker/pyro/fc.c:I
        //   354: ifge            363
        //   357: ldc_w           731765647
        //   360: goto            366
        //   363: ldc_w           473692839
        //   366: ldc_w           1085589111
        //   369: ixor           
        //   370: lookupswitch {
        //          -1409789901: 363
        //          1797856760: 829
        //          default: 396
        //        }
        //   396: goto            400
        //   399: athrow         
        //   400: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   403: goto            407
        //   406: athrow         
        //   407: dup            
        //   408: ifnonnull       422
        //   411: goto            415
        //   414: athrow         
        //   415: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   418: goto            422
        //   421: athrow         
        //   422: checkcast       Ljava/util/List;
        //   425: getstatic       dev/nuker/pyro/fc.1:I
        //   428: ifeq            437
        //   431: ldc_w           -824352555
        //   434: goto            440
        //   437: ldc_w           539478679
        //   440: ldc_w           -760083290
        //   443: ixor           
        //   444: lookupswitch {
        //          -722981700: 437
        //          477064307: 833
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   481: goto            485
        //   484: athrow         
        //   485: astore          4
        //   487: aload           4
        //   489: getstatic       dev/nuker/pyro/fc.0:I
        //   492: ifeq            501
        //   495: ldc_w           -847058436
        //   498: goto            504
        //   501: ldc_w           1890236801
        //   504: ldc_w           1053560001
        //   507: ixor           
        //   508: lookupswitch {
        //          -1204070983: 501
        //          -212933315: 813
        //          default: 536
        //        }
        //   536: goto            540
        //   539: athrow         
        //   540: invokeinterface java/util/Iterator.hasNext:()Z
        //   545: goto            549
        //   548: athrow         
        //   549: ifeq            558
        //   552: ldc_w           -653490049
        //   555: goto            561
        //   558: ldc_w           -653490050
        //   561: ldc_w           194268549
        //   564: ixor           
        //   565: tableswitch {
        //          -1523479564: 588
        //          -1523479563: 690
        //          default: 552
        //        }
        //   588: getstatic       dev/nuker/pyro/fc.c:I
        //   591: ifge            600
        //   594: ldc_w           1345590059
        //   597: goto            603
        //   600: ldc_w           -1037109929
        //   603: ldc_w           -1618787268
        //   606: ixor           
        //   607: lookupswitch {
        //          -810068201: 600
        //          1571664235: 632
        //          default: 831
        //        }
        //   632: aload           4
        //   634: goto            638
        //   637: athrow         
        //   638: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   643: goto            647
        //   646: athrow         
        //   647: checkcast       Ldev/nuker/pyro/f0n;
        //   650: astore_3       
        //   651: aload_2        
        //   652: aload_3        
        //   653: goto            657
        //   656: athrow         
        //   657: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   660: goto            664
        //   663: athrow         
        //   664: aload_3        
        //   665: goto            669
        //   668: athrow         
        //   669: invokevirtual   dev/nuker/pyro/f0n.c:()Lcom/google/gson/JsonElement;
        //   672: goto            676
        //   675: athrow         
        //   676: goto            680
        //   679: athrow         
        //   680: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   683: goto            687
        //   686: athrow         
        //   687: goto            487
        //   690: aload_1        
        //   691: ldc             "\u236a\u149b\u8a69\ub1c4\uce51\ued7d\ub221\ue643"
        //   693: goto            697
        //   696: athrow         
        //   697: invokestatic    invokestatic   !!! ERROR
        //   700: goto            704
        //   703: athrow         
        //   704: getstatic       dev/nuker/pyro/fc.1:I
        //   707: ifeq            716
        //   710: ldc_w           896108173
        //   713: goto            719
        //   716: ldc_w           -1367186150
        //   719: ldc_w           670611429
        //   722: ixor           
        //   723: lookupswitch {
        //          -1988439297: 748
        //          311505256: 716
        //          default: 827
        //        }
        //   748: aload_2        
        //   749: checkcast       Lcom/google/gson/JsonElement;
        //   752: goto            756
        //   755: athrow         
        //   756: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   759: goto            763
        //   762: athrow         
        //   763: getstatic       dev/nuker/pyro/fc.1:I
        //   766: ifeq            775
        //   769: ldc_w           -1150400956
        //   772: goto            778
        //   775: ldc_w           1696059022
        //   778: ldc_w           757782492
        //   781: ixor           
        //   782: lookupswitch {
        //          -1773891176: 775
        //          1211963730: 808
        //          default: 825
        //        }
        //   808: aload_1        
        //   809: checkcast       Lcom/google/gson/JsonElement;
        //   812: areturn        
        //   813: aconst_null    
        //   814: athrow         
        //   815: aconst_null    
        //   816: athrow         
        //   817: aconst_null    
        //   818: athrow         
        //   819: aconst_null    
        //   820: athrow         
        //   821: aconst_null    
        //   822: athrow         
        //   823: aconst_null    
        //   824: athrow         
        //   825: aconst_null    
        //   826: athrow         
        //   827: aconst_null    
        //   828: athrow         
        //   829: aconst_null    
        //   830: athrow         
        //   831: aconst_null    
        //   832: athrow         
        //   833: aconst_null    
        //   834: athrow         
        //   835: pop            
        //   836: goto            24
        //   839: pop            
        //   840: aconst_null    
        //   841: goto            835
        //   844: dup            
        //   845: ifnull          835
        //   848: checkcast       Ljava/lang/Throwable;
        //   851: athrow         
        //   852: dup            
        //   853: ifnull          839
        //   856: checkcast       Ljava/lang/Throwable;
        //   859: athrow         
        //   860: aconst_null    
        //   861: athrow         
        //    StackMapTable: 00 7F 43 07 00 C0 04 FF 00 0B 00 00 00 01 07 00 C0 FC 00 03 07 00 03 FF 00 0F 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 02 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1C 00 01 07 00 03 00 02 08 00 18 08 00 18 42 07 00 AA FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 C0 40 07 00 C5 FC 00 0C 07 00 C5 42 01 1C FF 00 0E 00 02 07 00 03 07 00 C5 00 02 07 00 C5 07 00 8F FF 00 02 00 02 07 00 03 07 00 C5 00 03 07 00 C5 07 00 8F 01 FF 00 1D 00 02 07 00 03 07 00 C5 00 02 07 00 C5 07 00 8F 42 07 00 BA FF 00 00 00 02 07 00 03 07 00 C5 00 02 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 02 07 00 C5 07 00 8F FF 00 10 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 03 FF 00 02 00 02 07 00 03 07 00 C5 00 06 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 03 01 FF 00 1C 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 03 FF 00 0E 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2A FF 00 02 00 02 07 00 03 07 00 C5 00 06 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2A 01 FF 00 1D 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2A FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2A 45 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 01 01 45 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2C 45 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 03 07 00 C5 07 00 8F 07 01 41 45 07 00 AA FF 00 00 00 02 07 00 03 07 00 C5 00 03 07 00 C5 07 00 8F 07 00 D3 45 07 00 C0 00 46 07 00 C0 FF 00 00 00 02 07 00 03 07 00 C5 00 02 08 01 43 08 01 43 45 07 00 C0 40 07 00 C5 FF 00 04 00 03 07 00 03 07 00 C5 07 00 C5 00 01 07 00 C0 40 07 00 03 45 07 00 C0 40 07 00 40 4B 07 00 40 FF 00 02 00 03 07 00 03 07 00 C5 07 00 C5 00 02 07 00 40 01 5D 07 00 40 42 07 00 C0 40 07 00 40 45 07 00 C0 40 07 01 01 FF 00 06 00 00 00 01 07 00 C0 FF 00 00 00 03 07 00 03 07 00 C5 07 00 C5 00 01 07 01 01 45 07 00 C0 40 07 01 01 4E 07 00 45 FF 00 02 00 03 07 00 03 07 00 C5 07 00 C5 00 02 07 00 45 01 5F 07 00 45 42 07 00 C0 40 07 00 45 47 07 00 C0 40 07 00 6B FD 00 01 00 07 00 6B 4D 07 00 6B FF 00 02 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 6B 01 5F 07 00 6B 42 07 00 AA 40 07 00 6B 47 07 00 C0 40 01 02 05 42 01 1A 0B 42 01 1C 44 07 00 C0 40 07 00 6B 47 07 00 C0 40 07 01 01 FF 00 08 00 00 00 01 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 C5 07 00 05 45 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 03 00 00 00 01 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 C5 07 00 8F 07 00 05 45 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 C5 07 00 8F 07 00 D3 FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 07 00 05 07 00 6B 00 03 07 00 C5 07 00 8F 07 00 D3 45 07 00 C0 00 FF 00 02 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 00 45 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 C5 07 00 8F 45 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 0B 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 02 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 03 07 00 C5 07 00 8F 01 FF 00 1C 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 06 00 00 00 01 07 00 C0 FF 00 00 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 03 07 00 C5 07 00 8F 07 00 D3 45 07 00 C0 00 0B 42 01 1D 44 07 00 6B FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 FC 00 01 07 00 C5 FF 00 01 00 02 07 00 03 07 00 C5 00 02 07 00 C5 07 00 8F FF 00 01 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 03 FF 00 01 00 02 07 00 03 07 00 C5 00 05 07 00 C5 07 00 8F 08 00 BB 08 00 BB 07 00 2A FE 00 01 07 00 C5 00 07 00 6B FF 00 01 00 05 07 00 03 07 00 C5 07 00 C5 00 07 00 6B 00 02 07 00 C5 07 00 8F FF 00 01 00 03 07 00 03 07 00 C5 07 00 C5 00 01 07 00 40 FD 00 01 00 07 00 6B FF 00 01 00 03 07 00 03 07 00 C5 07 00 C5 00 01 07 00 45 FF 00 01 00 01 07 00 03 00 01 07 00 C0 43 05 44 07 00 C0 47 05 47 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     844    852    Ljava/lang/IllegalArgumentException;
        //  844    852    844    852    Any
        //  860    862    3      8      Ljava/lang/ArithmeticException;
        //  75     82     82     83     Any
        //  75     82     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  75     82     75     76     Ljava/lang/NumberFormatException;
        //  75     82     75     76     Ljava/lang/IndexOutOfBoundsException;
        //  75     82     3      8      Ljava/lang/AssertionError;
        //  179    186    186    187    Any
        //  180    186    186    187    Any
        //  179    186    3      8      Ljava/util/ConcurrentModificationException;
        //  179    186    186    187    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  180    186    179    180    Ljava/lang/ClassCastException;
        //  288    294    294    295    Any
        //  288    294    294    295    Ljava/lang/RuntimeException;
        //  288    294    3      8      Ljava/lang/NumberFormatException;
        //  288    294    3      8      Ljava/util/NoSuchElementException;
        //  288    294    294    295    Any
        //  301    308    308    309    Any
        //  301    308    3      8      Ljava/lang/ArithmeticException;
        //  302    308    308    309    Any
        //  302    308    308    309    Any
        //  302    308    301    302    Any
        //  315    322    322    323    Any
        //  316    322    315    316    Ljava/lang/RuntimeException;
        //  315    322    315    316    Ljava/lang/StringIndexOutOfBoundsException;
        //  315    322    315    316    Ljava/util/NoSuchElementException;
        //  316    322    3      8      Any
        //  330    337    337    338    Any
        //  330    337    330    331    Any
        //  331    337    330    331    Ljava/lang/StringIndexOutOfBoundsException;
        //  331    337    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  330    337    3      8      Ljava/lang/NegativeArraySizeException;
        //  343    350    350    351    Any
        //  343    350    343    344    Any
        //  343    350    3      8      Ljava/lang/NegativeArraySizeException;
        //  344    350    3      8      Any
        //  343    350    3      8      Any
        //  399    406    406    407    Any
        //  399    406    399    400    Ljava/lang/ClassCastException;
        //  400    406    399    400    Any
        //  399    406    3      8      Any
        //  400    406    406    407    Any
        //  415    421    421    422    Any
        //  415    421    3      8      Any
        //  415    421    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  415    421    3      8      Any
        //  415    421    3      8      Any
        //  475    484    484    485    Any
        //  476    484    475    476    Any
        //  475    484    475    476    Ljava/lang/EnumConstantNotPresentException;
        //  476    484    484    485    Any
        //  476    484    475    476    Any
        //  539    548    548    549    Any
        //  540    548    539    540    Ljava/lang/NegativeArraySizeException;
        //  539    548    3      8      Any
        //  539    548    539    540    Ljava/lang/EnumConstantNotPresentException;
        //  539    548    3      8      Ljava/lang/ArithmeticException;
        //  637    646    646    647    Any
        //  637    646    646    647    Any
        //  638    646    637    638    Any
        //  637    646    637    638    Any
        //  638    646    3      8      Any
        //  657    663    663    664    Any
        //  657    663    663    664    Ljava/util/ConcurrentModificationException;
        //  657    663    663    664    Ljava/lang/ClassCastException;
        //  657    663    663    664    Any
        //  657    663    3      8      Any
        //  669    675    675    676    Any
        //  669    675    675    676    Ljava/lang/EnumConstantNotPresentException;
        //  669    675    3      8      Any
        //  669    675    675    676    Ljava/lang/NegativeArraySizeException;
        //  669    675    675    676    Any
        //  680    686    686    687    Any
        //  680    686    686    687    Any
        //  680    686    3      8      Ljava/lang/AssertionError;
        //  680    686    3      8      Any
        //  680    686    686    687    Any
        //  696    703    703    704    Any
        //  696    703    696    697    Any
        //  696    703    3      8      Any
        //  696    703    696    697    Ljava/lang/NullPointerException;
        //  697    703    703    704    Ljava/lang/IllegalStateException;
        //  756    762    762    763    Any
        //  756    762    762    763    Ljava/lang/NumberFormatException;
        //  756    762    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  756    762    3      8      Any
        //  756    762    3      8      Ljava/lang/IllegalStateException;
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
    
    @Nullable
    public f0n c(@NotNull final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          476
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            468
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            460
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.0:I
        //    29: ifeq            38
        //    32: ldc_w           1338607164
        //    35: goto            41
        //    38: ldc_w           -1875380653
        //    41: ldc_w           190602787
        //    44: ixor           
        //    45: lookupswitch {
        //          -1687443344: 72
        //          1150670879: 38
        //          default: 441
        //        }
        //    72: aload_0        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   dev/nuker/pyro/f0k.5:()Ldev/nuker/pyro/fw;
        //    80: goto            84
        //    83: athrow         
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            96
        //    90: ldc_w           -138749774
        //    93: goto            99
        //    96: ldc_w           -462573119
        //    99: ldc_w           1351392093
        //   102: ixor           
        //   103: lookupswitch {
        //          -1489615889: 445
        //          1500158043: 96
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   135: goto            139
        //   138: athrow         
        //   139: dup            
        //   140: ifnonnull       154
        //   143: goto            147
        //   146: athrow         
        //   147: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   150: goto            154
        //   153: athrow         
        //   154: checkcast       Ljava/util/List;
        //   157: goto            161
        //   160: athrow         
        //   161: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   166: goto            170
        //   169: athrow         
        //   170: astore_3       
        //   171: aload_3        
        //   172: goto            176
        //   175: athrow         
        //   176: invokeinterface java/util/Iterator.hasNext:()Z
        //   181: goto            185
        //   184: athrow         
        //   185: ifeq            437
        //   188: aload_3        
        //   189: goto            193
        //   192: athrow         
        //   193: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   198: goto            202
        //   201: athrow         
        //   202: checkcast       Ldev/nuker/pyro/f0n;
        //   205: astore_2       
        //   206: getstatic       dev/nuker/pyro/fc.1:I
        //   209: ifeq            218
        //   212: ldc_w           -1559327606
        //   215: goto            221
        //   218: ldc_w           696225367
        //   221: ldc_w           1744559439
        //   224: ixor           
        //   225: lookupswitch {
        //          -990555707: 218
        //          1317294872: 252
        //          default: 449
        //        }
        //   252: aload_2        
        //   253: dup            
        //   254: ifnonnull       315
        //   257: getstatic       dev/nuker/pyro/fc.0:I
        //   260: ifeq            269
        //   263: ldc_w           -1665942334
        //   266: goto            272
        //   269: ldc_w           2052598854
        //   272: ldc_w           -794631802
        //   275: ixor           
        //   276: lookupswitch {
        //          774074424: 269
        //          1276206404: 447
        //          default: 304
        //        }
        //   304: goto            308
        //   307: athrow         
        //   308: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   311: goto            315
        //   314: athrow         
        //   315: goto            319
        //   318: athrow         
        //   319: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   322: goto            326
        //   325: athrow         
        //   326: aload_1        
        //   327: getstatic       dev/nuker/pyro/fc.0:I
        //   330: ifeq            339
        //   333: ldc_w           1547022807
        //   336: goto            342
        //   339: ldc_w           -897058017
        //   342: ldc_w           -1712202173
        //   345: ixor           
        //   346: lookupswitch {
        //          -976982124: 339
        //          1400251740: 372
        //          default: 439
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   379: goto            383
        //   382: athrow         
        //   383: ifeq            434
        //   386: getstatic       dev/nuker/pyro/fc.c:I
        //   389: ifge            398
        //   392: ldc_w           3542758
        //   395: goto            401
        //   398: ldc_w           -1427720230
        //   401: ldc_w           -665950681
        //   404: ixor           
        //   405: lookupswitch {
        //          -663197503: 398
        //          1923666429: 432
        //          default: 443
        //        }
        //   432: aload_2        
        //   433: areturn        
        //   434: goto            171
        //   437: aconst_null    
        //   438: areturn        
        //   439: aconst_null    
        //   440: athrow         
        //   441: aconst_null    
        //   442: athrow         
        //   443: aconst_null    
        //   444: athrow         
        //   445: aconst_null    
        //   446: athrow         
        //   447: aconst_null    
        //   448: athrow         
        //   449: aconst_null    
        //   450: athrow         
        //   451: pop            
        //   452: goto            24
        //   455: pop            
        //   456: aconst_null    
        //   457: goto            451
        //   460: dup            
        //   461: ifnull          451
        //   464: checkcast       Ljava/lang/Throwable;
        //   467: athrow         
        //   468: dup            
        //   469: ifnull          455
        //   472: checkcast       Ljava/lang/Throwable;
        //   475: athrow         
        //   476: aconst_null    
        //   477: athrow         
        //    StackMapTable: 00 48 43 07 00 C0 04 FF 00 0B 00 00 00 01 07 00 C0 FD 00 03 07 00 03 07 00 8F 0D 42 01 1E 43 07 00 AA 40 07 00 03 45 07 00 C0 40 07 00 40 4B 07 00 40 FF 00 02 00 02 07 00 03 07 00 8F 00 02 07 00 40 01 5C 07 00 40 42 07 00 C0 40 07 00 40 45 07 00 C0 40 07 01 01 FF 00 06 00 00 00 01 07 00 C0 FF 00 00 00 02 07 00 03 07 00 8F 00 01 07 01 01 45 07 00 C0 40 07 01 01 45 07 00 C0 40 07 00 45 47 07 00 C0 40 07 00 6B FD 00 00 00 07 00 6B 43 07 00 C0 40 07 00 6B 47 07 00 C0 40 01 FF 00 06 00 00 00 01 07 00 C0 FF 00 00 00 04 07 00 03 07 00 8F 00 07 00 6B 00 01 07 00 6B 47 07 00 C0 40 07 01 01 FF 00 0F 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 00 42 01 1E 50 07 00 05 FF 00 02 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 02 07 00 05 01 5F 07 00 05 FF 00 02 00 00 00 01 07 00 C0 FF 00 00 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 01 07 00 05 45 07 00 C0 40 07 00 05 42 07 00 C0 40 07 00 05 45 07 00 C0 40 07 00 8F FF 00 0C 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 02 07 00 8F 07 00 8F FF 00 02 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 03 07 00 8F 07 00 8F 01 FF 00 1D 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 02 07 00 8F 07 00 8F 42 07 00 AC FF 00 00 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 02 07 00 8F 07 00 8F 45 07 00 C0 40 01 0E 42 01 1E 01 FF 00 02 00 04 07 00 03 07 00 8F 00 07 00 6B 00 00 FF 00 01 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 02 07 00 8F 07 00 8F F9 00 01 FD 00 01 07 00 05 07 00 6B FF 00 01 00 02 07 00 03 07 00 8F 00 01 07 00 40 FF 00 01 00 04 07 00 03 07 00 8F 07 00 05 07 00 6B 00 01 07 00 05 01 FF 00 01 00 02 07 00 03 07 00 8F 00 01 07 00 C0 43 05 44 07 00 C0 47 05 47 07 00 C0
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     460    468    Ljava/lang/StringIndexOutOfBoundsException;
        //  460    468    460    468    Any
        //  476    478    3      8      Ljava/lang/UnsupportedOperationException;
        //  76     83     83     84     Any
        //  76     83     83     84     Ljava/lang/StringIndexOutOfBoundsException;
        //  76     83     76     77     Ljava/lang/NegativeArraySizeException;
        //  77     83     76     77     Ljava/lang/NumberFormatException;
        //  76     83     3      8      Any
        //  131    138    138    139    Any
        //  131    138    138    139    Any
        //  132    138    138    139    Ljava/util/ConcurrentModificationException;
        //  132    138    131    132    Ljava/lang/IllegalStateException;
        //  131    138    131    132    Any
        //  147    153    153    154    Any
        //  147    153    153    154    Any
        //  147    153    153    154    Ljava/lang/RuntimeException;
        //  147    153    3      8      Ljava/lang/NegativeArraySizeException;
        //  147    153    153    154    Any
        //  160    169    169    170    Any
        //  161    169    169    170    Ljava/lang/IndexOutOfBoundsException;
        //  161    169    3      8      Any
        //  160    169    160    161    Any
        //  160    169    160    161    Any
        //  175    184    184    185    Any
        //  176    184    184    185    Ljava/lang/ClassCastException;
        //  175    184    175    176    Any
        //  176    184    184    185    Any
        //  175    184    184    185    Any
        //  193    201    201    202    Any
        //  193    201    201    202    Any
        //  193    201    201    202    Ljava/lang/StringIndexOutOfBoundsException;
        //  193    201    201    202    Ljava/lang/EnumConstantNotPresentException;
        //  193    201    201    202    Ljava/lang/IllegalStateException;
        //  308    314    314    315    Any
        //  308    314    3      8      Ljava/lang/IllegalStateException;
        //  308    314    314    315    Any
        //  308    314    314    315    Any
        //  308    314    314    315    Ljava/util/ConcurrentModificationException;
        //  318    325    325    326    Any
        //  319    325    318    319    Any
        //  319    325    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  319    325    325    326    Any
        //  319    325    325    326    Any
        //  375    382    382    383    Any
        //  376    382    382    383    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  376    382    382    383    Ljava/lang/NegativeArraySizeException;
        //  376    382    375    376    Ljava/lang/StringIndexOutOfBoundsException;
        //  375    382    3      8      Ljava/lang/ClassCastException;
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
}
