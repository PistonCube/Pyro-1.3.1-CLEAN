// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f56 extends fH
{
    public f0a c;
    public f0a 0;
    public f0d c;
    
    public f56() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             -525155192
        //     8: goto            13
        //    11: ldc             -1240708415
        //    13: ldc             553918266
        //    15: ixor           
        //    16: lookupswitch {
        //          -1044980814: 654
        //          765164430: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u2382\u1486\u8a8e\ub3d6\uc9cc\ued8a\ub223"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u23a2\u1486\u8a8e\ub3d6\uc9ec\ued8a\ub223"
        //    52: getstatic       dev/nuker/pyro/fc.0:I
        //    55: ifeq            63
        //    58: ldc             -1938742481
        //    60: goto            65
        //    63: ldc             1153260111
        //    65: ldc             -1841188068
        //    67: ixor           
        //    68: lookupswitch {
        //          506499123: 648
        //          722709115: 63
        //          default: 96
        //        }
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: ldc             "\u23af\u149c\u8a9d\ub3ca\uc980\ued8a\ub231\ue6a3\ud928\ue9a4\ua74d\u1e49\ue19d\uc5e7\u8126\u891b\u57b5\u7767\ubd34\uc01d\u2b74\uc236\u6a7f\u2d58\ud7c5\u35f5\u7d6b\u89d8\u8003\u8c91\u8483\ufb3f\u70a0\u9a02\u1bc8"
        //   101: getstatic       dev/nuker/pyro/fc.0:I
        //   104: ifeq            112
        //   107: ldc             -113859879
        //   109: goto            114
        //   112: ldc             1117095802
        //   114: ldc             -2001062962
        //   116: ixor           
        //   117: lookupswitch {
        //          -2045086818: 112
        //          1905037591: 644
        //          default: 144
        //        }
        //   144: invokestatic    invokestatic   !!! ERROR
        //   147: getstatic       dev/nuker/pyro/fc.1:I
        //   150: ifeq            158
        //   153: ldc             865278485
        //   155: goto            160
        //   158: ldc             -1352205101
        //   160: ldc             -455100679
        //   162: ixor           
        //   163: lookupswitch {
        //          -682840852: 656
        //          287014365: 158
        //          default: 188
        //        }
        //   188: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   191: aload_0        
        //   192: new             Ldev/nuker/pyro/f0a;
        //   195: dup            
        //   196: ldc             "\u238c\u149d\u8aa8\ub3dc\uc9ce\ued81\ub221\ue6a5"
        //   198: invokestatic    invokestatic   !!! ERROR
        //   201: ldc             "\u23ac\u149d\u8aa8\ub3dc\uc9ce\ued81\ub221\ue6a5"
        //   203: invokestatic    invokestatic   !!! ERROR
        //   206: aconst_null    
        //   207: iconst_0       
        //   208: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   211: putfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0a;
        //   214: aload_0        
        //   215: new             Ldev/nuker/pyro/f0a;
        //   218: dup            
        //   219: ldc             "\u238d\u149c\u8aae\ub3d6\uc9d4\ued80\ub229\ue6a4"
        //   221: getstatic       dev/nuker/pyro/fc.c:I
        //   224: ifge            232
        //   227: ldc             1006007605
        //   229: goto            234
        //   232: ldc             338778379
        //   234: ldc             1797260067
        //   236: ixor           
        //   237: lookupswitch {
        //          1356232214: 232
        //          2131843624: 264
        //          default: 646
        //        }
        //   264: invokestatic    invokestatic   !!! ERROR
        //   267: ldc             "\u23ad\u149c\u8aae\ub3d6\uc9d4\ued80\ub229\ue6a4"
        //   269: getstatic       dev/nuker/pyro/fc.1:I
        //   272: ifeq            280
        //   275: ldc             -1084096345
        //   277: goto            282
        //   280: ldc             -705183603
        //   282: ldc             -1166185328
        //   284: ixor           
        //   285: lookupswitch {
        //          85945399: 280
        //          1871359005: 312
        //          default: 638
        //        }
        //   312: invokestatic    invokestatic   !!! ERROR
        //   315: aconst_null    
        //   316: iconst_1       
        //   317: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   320: putfield        dev/nuker/pyro/f56.0:Ldev/nuker/pyro/f0a;
        //   323: aload_0        
        //   324: new             Ldev/nuker/pyro/f0d;
        //   327: dup            
        //   328: ldc             "\u238b\u1496\u8a9b\ub3d5\uc9d4\ued8d"
        //   330: invokestatic    invokestatic   !!! ERROR
        //   333: ldc             "\u23ab\u1496\u8a9b\ub3d5\uc9d4\ued8d"
        //   335: invokestatic    invokestatic   !!! ERROR
        //   338: aconst_null    
        //   339: ldc2_w          5.0
        //   342: dconst_1       
        //   343: ldc2_w          19.0
        //   346: getstatic       dev/nuker/pyro/fc.0:I
        //   349: ifeq            357
        //   352: ldc             707091647
        //   354: goto            359
        //   357: ldc             -647573874
        //   359: ldc             1946059626
        //   361: ixor           
        //   362: lookupswitch {
        //          142860931: 357
        //          1507581909: 642
        //          default: 388
        //        }
        //   388: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   391: putfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0d;
        //   394: getstatic       dev/nuker/pyro/fc.0:I
        //   397: ifeq            405
        //   400: ldc             -1597159816
        //   402: goto            407
        //   405: ldc             357965907
        //   407: ldc             -2013320351
        //   409: ixor           
        //   410: lookupswitch {
        //          -1834415310: 436
        //          657616153: 405
        //          default: 650
        //        }
        //   436: aload_0        
        //   437: getstatic       dev/nuker/pyro/fc.0:I
        //   440: ifeq            448
        //   443: ldc             1131274243
        //   445: goto            450
        //   448: ldc             1036361079
        //   450: ldc             -1042709302
        //   452: ixor           
        //   453: lookupswitch {
        //          -2102106935: 448
        //          -65267267: 480
        //          default: 658
        //        }
        //   480: aload_0        
        //   481: getstatic       dev/nuker/pyro/fc.0:I
        //   484: ifeq            492
        //   487: ldc             223980770
        //   489: goto            494
        //   492: ldc             -1889119200
        //   494: ldc             1356878908
        //   496: ixor           
        //   497: lookupswitch {
        //          -544866276: 524
        //          1572468958: 492
        //          default: 660
        //        }
        //   524: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0a;
        //   527: invokevirtual   dev/nuker/pyro/f56.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   530: pop            
        //   531: aload_0        
        //   532: getstatic       dev/nuker/pyro/fc.c:I
        //   535: ifge            543
        //   538: ldc             1254717228
        //   540: goto            545
        //   543: ldc             325472916
        //   545: ldc             -2035689745
        //   547: ixor           
        //   548: lookupswitch {
        //          -1781562245: 576
        //          -866082365: 543
        //          default: 640
        //        }
        //   576: aload_0        
        //   577: getfield        dev/nuker/pyro/f56.0:Ldev/nuker/pyro/f0a;
        //   580: getstatic       dev/nuker/pyro/fc.c:I
        //   583: ifge            591
        //   586: ldc             -1238916424
        //   588: goto            593
        //   591: ldc             958593152
        //   593: ldc             -1110962161
        //   595: ixor           
        //   596: lookupswitch {
        //          200258231: 652
        //          1068508160: 591
        //          default: 624
        //        }
        //   624: invokevirtual   dev/nuker/pyro/f56.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   627: pop            
        //   628: aload_0        
        //   629: aload_0        
        //   630: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0d;
        //   633: invokevirtual   dev/nuker/pyro/f56.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   636: pop            
        //   637: return         
        //   638: aconst_null    
        //   639: athrow         
        //   640: aconst_null    
        //   641: athrow         
        //   642: aconst_null    
        //   643: athrow         
        //   644: aconst_null    
        //   645: athrow         
        //   646: aconst_null    
        //   647: athrow         
        //   648: aconst_null    
        //   649: athrow         
        //   650: aconst_null    
        //   651: athrow         
        //   652: aconst_null    
        //   653: athrow         
        //   654: aconst_null    
        //   655: athrow         
        //   656: aconst_null    
        //   657: athrow         
        //   658: aconst_null    
        //   659: athrow         
        //   660: aconst_null    
        //   661: athrow         
        //    StackMapTable: 00 30 0B 41 01 1E FF 00 12 00 01 06 00 03 06 07 00 6C 07 00 6C FF 00 01 00 01 06 00 04 06 07 00 6C 07 00 6C 01 FF 00 1E 00 01 06 00 03 06 07 00 6C 07 00 6C FF 00 0F 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 01 00 01 06 00 05 06 07 00 6C 07 00 6C 07 00 6C 01 FF 00 1D 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 0D 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 01 00 01 06 00 05 06 07 00 6C 07 00 6C 07 00 6C 01 FF 00 1B 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 2B 00 01 07 00 03 00 04 07 00 03 08 00 D7 08 00 D7 07 00 6C FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 D7 08 00 D7 07 00 6C 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 00 D7 08 00 D7 07 00 6C FF 00 0F 00 01 07 00 03 00 05 07 00 03 08 00 D7 08 00 D7 07 00 6C 07 00 6C FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 D7 08 00 D7 07 00 6C 07 00 6C 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 00 D7 08 00 D7 07 00 6C 07 00 6C FF 00 2C 00 01 07 00 03 00 09 07 00 03 08 01 44 08 01 44 07 00 6C 07 00 6C 05 03 03 03 FF 00 01 00 01 07 00 03 00 0A 07 00 03 08 01 44 08 01 44 07 00 6C 07 00 6C 05 03 03 03 01 FF 00 1C 00 01 07 00 03 00 09 07 00 03 08 01 44 08 01 44 07 00 6C 07 00 6C 05 03 03 03 10 41 01 1C 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 52 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 0E 00 01 07 00 03 00 02 07 00 03 07 00 2F FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 2F 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 2F FF 00 0D 00 01 07 00 03 00 05 07 00 03 08 00 D7 08 00 D7 07 00 6C 07 00 6C 41 07 00 03 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 01 44 08 01 44 07 00 6C 07 00 6C 05 03 03 03 FF 00 01 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 D7 08 00 D7 07 00 6C FF 00 01 00 01 06 00 03 06 07 00 6C 07 00 6C FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 2F FF 00 01 00 01 06 00 00 FF 00 01 00 01 06 00 04 06 07 00 6C 07 00 6C 07 00 6C FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03
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
    
    @f06
    @LauncherEventHide
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2679
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2671
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2663
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: ldc             "\u23c6\u14dd\u8acb\ub1ce"
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    invokestatic   !!! ERROR
        //    34: goto            38
        //    37: athrow         
        //    38: iconst_1       
        //    39: anewarray       Ljava/lang/Object;
        //    42: dup            
        //    43: iconst_0       
        //    44: aload_0        
        //    45: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0d;
        //    48: goto            52
        //    51: athrow         
        //    52: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //    55: goto            59
        //    58: athrow         
        //    59: aastore        
        //    60: goto            64
        //    63: athrow         
        //    64: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    67: goto            71
        //    70: athrow         
        //    71: goto            75
        //    74: athrow         
        //    75: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    78: goto            82
        //    81: athrow         
        //    82: goto            86
        //    85: athrow         
        //    86: invokevirtual   dev/nuker/pyro/f56.4:(Ljava/lang/String;)V
        //    89: goto            93
        //    92: athrow         
        //    93: aload_0        
        //    94: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //    97: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   100: goto            104
        //   103: athrow         
        //   104: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70089_S:()Z
        //   107: goto            111
        //   110: athrow         
        //   111: ifeq            2591
        //   114: aload_0        
        //   115: getstatic       dev/nuker/pyro/fc.0:I
        //   118: ifeq            126
        //   121: ldc             -1654336436
        //   123: goto            128
        //   126: ldc             -1602433885
        //   128: ldc             -1025096061
        //   130: ixor           
        //   131: lookupswitch {
        //          1602392783: 126
        //          1654295072: 156
        //          default: 2614
        //        }
        //   156: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0a;
        //   159: goto            163
        //   162: athrow         
        //   163: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   166: goto            170
        //   169: athrow         
        //   170: checkcast       Ljava/lang/Boolean;
        //   173: goto            177
        //   176: athrow         
        //   177: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   180: goto            184
        //   183: athrow         
        //   184: ifeq            889
        //   187: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f4U;
        //   190: getfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //   193: goto            197
        //   196: athrow         
        //   197: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   200: goto            204
        //   203: athrow         
        //   204: checkcast       Ljava/lang/Boolean;
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   214: goto            218
        //   217: athrow         
        //   218: istore_2       
        //   219: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f4U;
        //   222: getfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //   225: iconst_1       
        //   226: goto            230
        //   229: athrow         
        //   230: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   233: goto            237
        //   236: athrow         
        //   237: goto            241
        //   240: athrow         
        //   241: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/lang/Object;)V
        //   244: goto            248
        //   247: athrow         
        //   248: iconst_0       
        //   249: istore_3       
        //   250: aload_0        
        //   251: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //   254: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   257: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //   260: goto            264
        //   263: athrow         
        //   264: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   269: goto            273
        //   272: athrow         
        //   273: getstatic       dev/nuker/pyro/fc.0:I
        //   276: ifeq            284
        //   279: ldc             1880638388
        //   281: goto            286
        //   284: ldc             851927929
        //   286: ldc             1400875621
        //   288: ixor           
        //   289: lookupswitch {
        //          594012625: 284
        //          1639500060: 316
        //          default: 2628
        //        }
        //   316: astore          4
        //   318: aload           4
        //   320: goto            324
        //   323: athrow         
        //   324: invokeinterface java/util/Iterator.hasNext:()Z
        //   329: goto            333
        //   332: athrow         
        //   333: ifeq            775
        //   336: aload           4
        //   338: goto            342
        //   341: athrow         
        //   342: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   347: goto            351
        //   350: athrow         
        //   351: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   354: getstatic       dev/nuker/pyro/fc.c:I
        //   357: ifge            365
        //   360: ldc             1062534449
        //   362: goto            367
        //   365: ldc             848686702
        //   367: ldc             555733490
        //   369: ixor           
        //   370: lookupswitch {
        //          508243139: 2646
        //          2042970906: 365
        //          default: 396
        //        }
        //   396: astore          5
        //   398: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f4U;
        //   401: aload           5
        //   403: aconst_null    
        //   404: iconst_0       
        //   405: getstatic       dev/nuker/pyro/fc.c:I
        //   408: ifge            416
        //   411: ldc             928830745
        //   413: goto            418
        //   416: ldc             -604727778
        //   418: ldc             -1470363290
        //   420: ixor           
        //   421: lookupswitch {
        //          -2082316150: 416
        //          -1627333505: 2610
        //          default: 448
        //        }
        //   448: goto            452
        //   451: athrow         
        //   452: invokevirtual   dev/nuker/pyro/f4U.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Z)Z
        //   455: goto            459
        //   458: athrow         
        //   459: ifeq            467
        //   462: ldc             -290045878
        //   464: goto            469
        //   467: ldc             -290045879
        //   469: ldc             1415532819
        //   471: ixor           
        //   472: tableswitch {
        //          1976705714: 496
        //          1976705715: 772
        //          default: 462
        //        }
        //   496: aload_0        
        //   497: new             Ljava/lang/StringBuilder;
        //   500: dup            
        //   501: ldc             "\u23b8\u14b2\u8a8f\ub1dc\ucff0\ueda9\ub22b\ue6b0\udb44\uefcc"
        //   503: getstatic       dev/nuker/pyro/fc.1:I
        //   506: ifeq            514
        //   509: ldc             121533614
        //   511: goto            516
        //   514: ldc             1610246884
        //   516: ldc             1364431484
        //   518: ixor           
        //   519: lookupswitch {
        //          -808759953: 514
        //          1450043090: 2640
        //          default: 544
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokestatic    invokestatic   !!! ERROR
        //   551: goto            555
        //   554: athrow         
        //   555: getstatic       dev/nuker/pyro/fc.0:I
        //   558: ifeq            566
        //   561: ldc             1994112922
        //   563: goto            568
        //   566: ldc             1071913506
        //   568: ldc             1578206831
        //   570: ixor           
        //   571: lookupswitch {
        //          684341749: 2650
        //          1901915150: 566
        //          default: 596
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   603: goto            607
        //   606: athrow         
        //   607: aload           5
        //   609: goto            613
        //   612: athrow         
        //   613: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70005_c_:()Ljava/lang/String;
        //   616: goto            620
        //   619: athrow         
        //   620: getstatic       dev/nuker/pyro/fc.c:I
        //   623: ifge            632
        //   626: ldc_w           -1921582568
        //   629: goto            635
        //   632: ldc_w           -376701848
        //   635: ldc_w           1530488723
        //   638: ixor           
        //   639: lookupswitch {
        //          -1296917509: 664
        //          -699425397: 632
        //          default: 2634
        //        }
        //   664: goto            668
        //   667: athrow         
        //   668: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   671: goto            675
        //   674: athrow         
        //   675: ldc_w           "\u23c3\u1490\u8a9b\ub1c5\ucffa\uedc5\ub22d\ue6b9\udb6d\uef83\ua705\u1e5e\ue196\uc7b8\u870f\u891b\u57b6\u7732\ubf28\uc639\u2b62\uc22f\u6a7b\u2f49\ud1ed\u35e3\u7d65"
        //   678: goto            682
        //   681: athrow         
        //   682: invokestatic    invokestatic   !!! ERROR
        //   685: goto            689
        //   688: athrow         
        //   689: getstatic       dev/nuker/pyro/fc.0:I
        //   692: ifeq            701
        //   695: ldc_w           -1100239836
        //   698: goto            704
        //   701: ldc_w           266203083
        //   704: ldc_w           -1895263771
        //   707: ixor           
        //   708: lookupswitch {
        //          -2019256745: 701
        //          828587457: 2618
        //          default: 736
        //        }
        //   736: goto            740
        //   739: athrow         
        //   740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   743: goto            747
        //   746: athrow         
        //   747: goto            751
        //   750: athrow         
        //   751: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   754: goto            758
        //   757: athrow         
        //   758: goto            762
        //   761: athrow         
        //   762: invokevirtual   dev/nuker/pyro/f56.1:(Ljava/lang/String;)V
        //   765: goto            769
        //   768: athrow         
        //   769: goto            775
        //   772: goto            318
        //   775: getstatic       dev/nuker/pyro/fc.0:I
        //   778: ifeq            787
        //   781: ldc_w           1629672776
        //   784: goto            790
        //   787: ldc_w           -202178424
        //   790: ldc_w           368412104
        //   793: ixor           
        //   794: lookupswitch {
        //          -435780288: 820
        //          1960267904: 787
        //          default: 2604
        //        }
        //   820: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f4U;
        //   823: getfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //   826: iload_2        
        //   827: goto            831
        //   830: athrow         
        //   831: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   834: goto            838
        //   837: athrow         
        //   838: goto            842
        //   841: athrow         
        //   842: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/lang/Object;)V
        //   845: goto            849
        //   848: athrow         
        //   849: iload_3        
        //   850: ifeq            859
        //   853: ldc_w           -1045453612
        //   856: goto            862
        //   859: ldc_w           -1045453609
        //   862: ldc_w           546202221
        //   865: ixor           
        //   866: tableswitch {
        //          -1035760270: 888
        //          -1035760269: 889
        //          default: 853
        //        }
        //   888: return         
        //   889: aload_0        
        //   890: getfield        dev/nuker/pyro/f56.0:Ldev/nuker/pyro/f0a;
        //   893: goto            897
        //   896: athrow         
        //   897: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   900: goto            904
        //   903: athrow         
        //   904: checkcast       Ljava/lang/Boolean;
        //   907: goto            911
        //   910: athrow         
        //   911: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   914: goto            918
        //   917: athrow         
        //   918: ifeq            927
        //   921: ldc_w           1311334874
        //   924: goto            930
        //   927: ldc_w           1311334875
        //   930: ldc_w           -1914804072
        //   933: ixor           
        //   934: tableswitch {
        //          -2014440828: 956
        //          -2014440827: 1593
        //          default: 921
        //        }
        //   956: aload_0        
        //   957: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //   960: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   963: new             Lnet/minecraft/util/math/BlockPos;
        //   966: dup            
        //   967: aload_0        
        //   968: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //   971: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   974: getstatic       dev/nuker/pyro/fc.0:I
        //   977: ifeq            986
        //   980: ldc_w           1475170124
        //   983: goto            989
        //   986: ldc_w           872685796
        //   989: ldc_w           220058709
        //   992: ixor           
        //   993: lookupswitch {
        //          958002353: 1020
        //          1525717785: 986
        //          default: 2622
        //        }
        //  1020: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70142_S:D
        //  1023: getstatic       dev/nuker/pyro/fc.1:I
        //  1026: ifeq            1035
        //  1029: ldc_w           -1396578889
        //  1032: goto            1038
        //  1035: ldc_w           -1299076579
        //  1038: ldc_w           529876478
        //  1041: ixor           
        //  1042: lookupswitch {
        //          -1286299575: 2594
        //          2144339245: 1035
        //          default: 1068
        //        }
        //  1068: aload_0        
        //  1069: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1072: getstatic       dev/nuker/pyro/fc.0:I
        //  1075: ifeq            1084
        //  1078: ldc_w           -492526878
        //  1081: goto            1087
        //  1084: ldc_w           -779892221
        //  1087: ldc_w           -1351102497
        //  1090: ixor           
        //  1091: lookupswitch {
        //          1305701693: 2652
        //          1990725135: 1084
        //          default: 1116
        //        }
        //  1116: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1119: getstatic       dev/nuker/pyro/fc.c:I
        //  1122: ifge            1131
        //  1125: ldc_w           1169489480
        //  1128: goto            1134
        //  1131: ldc_w           904388911
        //  1134: ldc_w           1502064492
        //  1137: ixor           
        //  1138: lookupswitch {
        //          473125156: 1131
        //          1818250819: 1164
        //          default: 2608
        //        }
        //  1164: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70137_T:D
        //  1167: aload_0        
        //  1168: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1171: getstatic       dev/nuker/pyro/fc.c:I
        //  1174: ifge            1183
        //  1177: ldc_w           1019493091
        //  1180: goto            1186
        //  1183: ldc_w           -1635493473
        //  1186: ldc_w           1838736859
        //  1189: ixor           
        //  1190: lookupswitch {
        //          -216220604: 1216
        //          1365040952: 1183
        //          default: 2596
        //        }
        //  1216: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1219: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70136_U:D
        //  1222: goto            1226
        //  1225: athrow         
        //  1226: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: iconst_0       
        //  1234: goto            1238
        //  1237: athrow         
        //  1238: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175668_a:(Lnet/minecraft/util/math/BlockPos;Z)Z
        //  1241: goto            1245
        //  1244: athrow         
        //  1245: ifeq            1593
        //  1248: getstatic       dev/nuker/pyro/fc.1:I
        //  1251: ifeq            1260
        //  1254: ldc_w           -330926823
        //  1257: goto            1263
        //  1260: ldc_w           610300101
        //  1263: ldc_w           2011194758
        //  1266: ixor           
        //  1267: lookupswitch {
        //          -1683615585: 1260
        //          1400902979: 1292
        //          default: 2602
        //        }
        //  1292: aload_0        
        //  1293: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1296: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1299: new             Lnet/minecraft/util/math/BlockPos;
        //  1302: dup            
        //  1303: aload_0        
        //  1304: getstatic       dev/nuker/pyro/fc.c:I
        //  1307: ifge            1316
        //  1310: ldc_w           1398387381
        //  1313: goto            1319
        //  1316: ldc_w           -317172902
        //  1319: ldc_w           1380423338
        //  1322: ixor           
        //  1323: lookupswitch {
        //          -1380431865: 1316
        //          18752543: 2620
        //          default: 1348
        //        }
        //  1348: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1351: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1354: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1357: aload_0        
        //  1358: getstatic       dev/nuker/pyro/fc.0:I
        //  1361: ifeq            1370
        //  1364: ldc_w           -142596334
        //  1367: goto            1373
        //  1370: ldc_w           -208629088
        //  1373: ldc_w           271873588
        //  1376: ixor           
        //  1377: lookupswitch {
        //          -579688902: 1370
        //          -407613146: 2600
        //          default: 1404
        //        }
        //  1404: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1407: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1410: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1413: aload_0        
        //  1414: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1417: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1420: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  1430: goto            1434
        //  1433: athrow         
        //  1434: iconst_0       
        //  1435: goto            1439
        //  1438: athrow         
        //  1439: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175668_a:(Lnet/minecraft/util/math/BlockPos;Z)Z
        //  1442: goto            1446
        //  1445: athrow         
        //  1446: ifeq            1593
        //  1449: getstatic       dev/nuker/pyro/fc.1:I
        //  1452: ifeq            1461
        //  1455: ldc_w           -1762335254
        //  1458: goto            1464
        //  1461: ldc_w           72344402
        //  1464: ldc_w           432680438
        //  1467: ixor           
        //  1468: lookupswitch {
        //          -1891710948: 2626
        //          -1348920827: 1461
        //          default: 1496
        //        }
        //  1496: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f58;
        //  1499: getstatic       dev/nuker/pyro/fc.0:I
        //  1502: ifeq            1511
        //  1505: ldc_w           -671070955
        //  1508: goto            1514
        //  1511: ldc_w           401870194
        //  1514: ldc_w           -1954193903
        //  1517: ixor           
        //  1518: lookupswitch {
        //          168982870: 1511
        //          1401232132: 2644
        //          default: 1544
        //        }
        //  1544: goto            1548
        //  1547: athrow         
        //  1548: invokevirtual   dev/nuker/pyro/f58.c:()I
        //  1551: goto            1555
        //  1554: athrow         
        //  1555: ifle            1564
        //  1558: ldc_w           857787298
        //  1561: goto            1567
        //  1564: ldc_w           857787301
        //  1567: ldc_w           1419305761
        //  1570: ixor           
        //  1571: tableswitch {
        //          -814722810: 1592
        //          -814722809: 1593
        //          default: 1558
        //        }
        //  1592: return         
        //  1593: getstatic       dev/nuker/pyro/fc.1:I
        //  1596: ifeq            1605
        //  1599: ldc_w           -1764593898
        //  1602: goto            1608
        //  1605: ldc_w           2026859964
        //  1608: ldc_w           -1499476247
        //  1611: ixor           
        //  1612: lookupswitch {
        //          810394111: 2616
        //          1632316637: 1605
        //          default: 1640
        //        }
        //  1640: aload_0        
        //  1641: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1644: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //  1654: goto            1658
        //  1657: athrow         
        //  1658: aload_0        
        //  1659: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  1662: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1665: getstatic       dev/nuker/pyro/fc.c:I
        //  1668: ifge            1677
        //  1671: ldc_w           2078856762
        //  1674: goto            1680
        //  1677: ldc_w           -1884161000
        //  1680: ldc_w           -138993519
        //  1683: ixor           
        //  1684: lookupswitch {
        //          -1939867989: 2592
        //          2029931399: 1677
        //          default: 1712
        //        }
        //  1712: goto            1716
        //  1715: athrow         
        //  1716: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110139_bj:()F
        //  1719: goto            1723
        //  1722: athrow         
        //  1723: fadd           
        //  1724: f2d            
        //  1725: getstatic       dev/nuker/pyro/fc.c:I
        //  1728: ifge            1737
        //  1731: ldc_w           798029182
        //  1734: goto            1740
        //  1737: ldc_w           1739897682
        //  1740: ldc_w           228683086
        //  1743: ixor           
        //  1744: lookupswitch {
        //          573675568: 1737
        //          1779815964: 1772
        //          default: 2636
        //        }
        //  1772: aload_0        
        //  1773: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/f0d;
        //  1776: goto            1780
        //  1779: athrow         
        //  1780: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1783: goto            1787
        //  1786: athrow         
        //  1787: checkcast       Ljava/lang/Double;
        //  1790: goto            1794
        //  1793: athrow         
        //  1794: invokevirtual   java/lang/Double.doubleValue:()D
        //  1797: goto            1801
        //  1800: athrow         
        //  1801: dcmpg          
        //  1802: ifgt            1811
        //  1805: ldc_w           525269293
        //  1808: goto            1814
        //  1811: ldc_w           525269292
        //  1814: ldc_w           -346952351
        //  1817: ixor           
        //  1818: tableswitch {
        //          -398579560: 1840
        //          -398579559: 2591
        //          default: 1805
        //        }
        //  1840: aload_0        
        //  1841: getfield        dev/nuker/pyro/f56.0:Ldev/nuker/pyro/f0a;
        //  1844: goto            1848
        //  1847: athrow         
        //  1848: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1851: goto            1855
        //  1854: athrow         
        //  1855: checkcast       Ljava/lang/Boolean;
        //  1858: goto            1862
        //  1861: athrow         
        //  1862: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1865: goto            1869
        //  1868: athrow         
        //  1869: ifne            1878
        //  1872: ldc_w           634382688
        //  1875: goto            1881
        //  1878: ldc_w           634382495
        //  1881: ldc_w           1792631199
        //  1884: ixor           
        //  1885: tableswitch {
        //          -1641213442: 1908
        //          -1641213441: 2344
        //          default: 1872
        //        }
        //  1908: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f58;
        //  1911: goto            1915
        //  1914: athrow         
        //  1915: invokevirtual   dev/nuker/pyro/f58.c:()I
        //  1918: goto            1922
        //  1921: athrow         
        //  1922: getstatic       dev/nuker/pyro/fc.0:I
        //  1925: ifeq            1934
        //  1928: ldc_w           -2052991697
        //  1931: goto            1937
        //  1934: ldc_w           -653225988
        //  1937: ldc_w           -61535901
        //  1940: ixor           
        //  1941: lookupswitch {
        //          625313439: 1968
        //          2046090316: 1934
        //          default: 2606
        //        }
        //  1968: istore_2       
        //  1969: getstatic       dev/nuker/pyro/fc.c:I
        //  1972: ifge            1981
        //  1975: ldc_w           -109113217
        //  1978: goto            1984
        //  1981: ldc_w           -148385180
        //  1984: ldc_w           -1452518991
        //  1987: ixor           
        //  1988: lookupswitch {
        //          1343439310: 1981
        //          1582007253: 2016
        //          default: 2630
        //        }
        //  2016: aload_0        
        //  2017: new             Ljava/lang/StringBuilder;
        //  2020: dup            
        //  2021: ldc_w           "\u23b8\u14b2\u8a8f\ub1dc\ucff0\ueda9\ub22b\ue6b0\udb44\uefcc\ua769\u1e43\ue194\uc7b1\u870e\u891a\u57e4\u777d\ubf39\uc624\u2b31\uc22c\u6a73\u2f53\ud1e6\u35a6"
        //  2024: goto            2028
        //  2027: athrow         
        //  2028: invokestatic    invokestatic   !!! ERROR
        //  2031: goto            2035
        //  2034: athrow         
        //  2035: goto            2039
        //  2038: athrow         
        //  2039: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2042: goto            2046
        //  2045: athrow         
        //  2046: iload_2        
        //  2047: goto            2051
        //  2050: athrow         
        //  2051: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2054: goto            2058
        //  2057: athrow         
        //  2058: ldc_w           "\u23c3\u1487\u8a95\ub1dc\ucffa\ued88\ub237\ue6f7\udb78\uef82\ua741\u1e0c"
        //  2061: goto            2065
        //  2064: athrow         
        //  2065: invokestatic    invokestatic   !!! ERROR
        //  2068: goto            2072
        //  2071: athrow         
        //  2072: goto            2076
        //  2075: athrow         
        //  2076: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2079: goto            2083
        //  2082: athrow         
        //  2083: getstatic       dev/nuker/pyro/fc.0:I
        //  2086: ifeq            2095
        //  2089: ldc_w           -546489204
        //  2092: goto            2098
        //  2095: ldc_w           -1551347562
        //  2098: ldc_w           -619418941
        //  2101: ixor           
        //  2102: lookupswitch {
        //          75060815: 2598
        //          1615584243: 2095
        //          default: 2128
        //        }
        //  2128: aload_0        
        //  2129: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  2132: getstatic       dev/nuker/pyro/fc.1:I
        //  2135: ifeq            2144
        //  2138: ldc_w           -644304038
        //  2141: goto            2147
        //  2144: ldc_w           -1524249539
        //  2147: ldc_w           -1859177566
        //  2150: ixor           
        //  2151: lookupswitch {
        //          873136031: 2176
        //          1219985656: 2144
        //          default: 2638
        //        }
        //  2176: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2179: goto            2183
        //  2182: athrow         
        //  2183: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //  2186: goto            2190
        //  2189: athrow         
        //  2190: getstatic       dev/nuker/pyro/fc.0:I
        //  2193: ifeq            2202
        //  2196: ldc_w           1403767954
        //  2199: goto            2205
        //  2202: ldc_w           720519604
        //  2205: ldc_w           -338811040
        //  2208: ixor           
        //  2209: lookupswitch {
        //          -1201280014: 2632
        //          1366165707: 2202
        //          default: 2236
        //        }
        //  2236: goto            2240
        //  2239: athrow         
        //  2240: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //  2243: goto            2247
        //  2246: athrow         
        //  2247: ldc_w           "\u23c3\u149b\u8a9f\ub1c9\ucfed\ued91\ub237\ue6f7\udb6b\uef89\ua748\u1e4d\ue19a\uc7b8\u8702\u8910\u57a3\u773c"
        //  2250: goto            2254
        //  2253: athrow         
        //  2254: invokestatic    invokestatic   !!! ERROR
        //  2257: goto            2261
        //  2260: athrow         
        //  2261: getstatic       dev/nuker/pyro/fc.0:I
        //  2264: ifeq            2273
        //  2267: ldc_w           -1391552229
        //  2270: goto            2276
        //  2273: ldc_w           -2111046446
        //  2276: ldc_w           -1756055365
        //  2279: ixor           
        //  2280: lookupswitch {
        //          360662121: 2308
        //          978985376: 2273
        //          default: 2612
        //        }
        //  2308: goto            2312
        //  2311: athrow         
        //  2312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2315: goto            2319
        //  2318: athrow         
        //  2319: goto            2323
        //  2322: athrow         
        //  2323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2326: goto            2330
        //  2329: athrow         
        //  2330: goto            2334
        //  2333: athrow         
        //  2334: invokevirtual   dev/nuker/pyro/f56.1:(Ljava/lang/String;)V
        //  2337: goto            2341
        //  2340: athrow         
        //  2341: goto            2591
        //  2344: aload_0        
        //  2345: new             Ljava/lang/StringBuilder;
        //  2348: dup            
        //  2349: ldc_w           "\u23b8\u14b2\u8a8f\ub1dc\ucff0\ueda9\ub22b\ue6b0\udb44\uefcc\ua769\u1e43\ue194\uc7b1\u870e\u891a\u57e4\u777d\ubf39\uc624\u2b31\uc22c\u6a73\u2f53\ud1e6\u35a6"
        //  2352: goto            2356
        //  2355: athrow         
        //  2356: invokestatic    invokestatic   !!! ERROR
        //  2359: goto            2363
        //  2362: athrow         
        //  2363: goto            2367
        //  2366: athrow         
        //  2367: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2370: goto            2374
        //  2373: athrow         
        //  2374: aload_0        
        //  2375: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //  2378: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2381: getstatic       dev/nuker/pyro/fc.c:I
        //  2384: ifge            2393
        //  2387: ldc_w           1061871652
        //  2390: goto            2396
        //  2393: ldc_w           157956311
        //  2396: ldc_w           909059202
        //  2399: ixor           
        //  2400: lookupswitch {
        //          157664422: 2393
        //          1061493845: 2428
        //          default: 2624
        //        }
        //  2428: goto            2432
        //  2431: athrow         
        //  2432: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //  2435: goto            2439
        //  2438: athrow         
        //  2439: goto            2443
        //  2442: athrow         
        //  2443: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //  2446: goto            2450
        //  2449: athrow         
        //  2450: ldc_w           "\u23c3\u149b\u8a9f\ub1c9\ucfed\ued91\ub237\ue6f7\udb6b\uef89\ua748\u1e4d\ue19a\uc7b8\u8702\u8910\u57a3\u773c"
        //  2453: getstatic       dev/nuker/pyro/fc.0:I
        //  2456: ifeq            2465
        //  2459: ldc_w           -127236558
        //  2462: goto            2468
        //  2465: ldc_w           -1879452721
        //  2468: ldc_w           -71339816
        //  2471: ixor           
        //  2472: lookupswitch {
        //          64354026: 2465
        //          1950786327: 2500
        //          default: 2648
        //        }
        //  2500: goto            2504
        //  2503: athrow         
        //  2504: invokestatic    invokestatic   !!! ERROR
        //  2507: goto            2511
        //  2510: athrow         
        //  2511: goto            2515
        //  2514: athrow         
        //  2515: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2518: goto            2522
        //  2521: athrow         
        //  2522: goto            2526
        //  2525: athrow         
        //  2526: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2529: goto            2533
        //  2532: athrow         
        //  2533: getstatic       dev/nuker/pyro/fc.0:I
        //  2536: ifeq            2545
        //  2539: ldc_w           -1407618269
        //  2542: goto            2548
        //  2545: ldc_w           -2115666161
        //  2548: ldc_w           322087048
        //  2551: ixor           
        //  2552: lookupswitch {
        //          -1087644757: 2642
        //          -238964344: 2545
        //          default: 2580
        //        }
        //  2580: goto            2584
        //  2583: athrow         
        //  2584: invokevirtual   dev/nuker/pyro/f56.1:(Ljava/lang/String;)V
        //  2587: goto            2591
        //  2590: athrow         
        //  2591: return         
        //  2592: aconst_null    
        //  2593: athrow         
        //  2594: aconst_null    
        //  2595: athrow         
        //  2596: aconst_null    
        //  2597: athrow         
        //  2598: aconst_null    
        //  2599: athrow         
        //  2600: aconst_null    
        //  2601: athrow         
        //  2602: aconst_null    
        //  2603: athrow         
        //  2604: aconst_null    
        //  2605: athrow         
        //  2606: aconst_null    
        //  2607: athrow         
        //  2608: aconst_null    
        //  2609: athrow         
        //  2610: aconst_null    
        //  2611: athrow         
        //  2612: aconst_null    
        //  2613: athrow         
        //  2614: aconst_null    
        //  2615: athrow         
        //  2616: aconst_null    
        //  2617: athrow         
        //  2618: aconst_null    
        //  2619: athrow         
        //  2620: aconst_null    
        //  2621: athrow         
        //  2622: aconst_null    
        //  2623: athrow         
        //  2624: aconst_null    
        //  2625: athrow         
        //  2626: aconst_null    
        //  2627: athrow         
        //  2628: aconst_null    
        //  2629: athrow         
        //  2630: aconst_null    
        //  2631: athrow         
        //  2632: aconst_null    
        //  2633: athrow         
        //  2634: aconst_null    
        //  2635: athrow         
        //  2636: aconst_null    
        //  2637: athrow         
        //  2638: aconst_null    
        //  2639: athrow         
        //  2640: aconst_null    
        //  2641: athrow         
        //  2642: aconst_null    
        //  2643: athrow         
        //  2644: aconst_null    
        //  2645: athrow         
        //  2646: aconst_null    
        //  2647: athrow         
        //  2648: aconst_null    
        //  2649: athrow         
        //  2650: aconst_null    
        //  2651: athrow         
        //  2652: aconst_null    
        //  2653: athrow         
        //  2654: pop            
        //  2655: goto            24
        //  2658: pop            
        //  2659: aconst_null    
        //  2660: goto            2654
        //  2663: dup            
        //  2664: ifnull          2654
        //  2667: checkcast       Ljava/lang/Throwable;
        //  2670: athrow         
        //  2671: dup            
        //  2672: ifnull          2658
        //  2675: checkcast       Ljava/lang/Throwable;
        //  2678: athrow         
        //  2679: aconst_null    
        //  2680: athrow         
        //    StackMapTable: 01 8F 43 07 00 91 04 FF 00 0B 00 00 00 01 07 00 91 FD 00 03 07 00 03 07 01 A9 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 4C 07 00 77 FF 00 00 00 02 07 00 03 07 01 A9 00 06 07 00 03 07 00 6C 07 01 AB 07 01 AB 01 07 00 48 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 06 07 00 03 07 00 6C 07 01 AB 07 01 AB 01 07 00 95 43 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 6C 07 01 AB 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 45 07 00 91 00 49 07 00 83 40 07 00 B0 45 07 00 91 40 01 4E 07 00 03 FF 00 01 00 02 07 00 03 07 01 A9 00 02 07 00 03 01 5B 07 00 03 45 07 00 77 40 07 00 2F 45 07 00 91 40 07 00 95 45 07 00 83 40 07 00 BA 45 07 00 91 40 01 FF 00 0B 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 01 07 00 2F 45 07 00 91 40 07 00 95 45 07 00 91 40 07 00 BA 45 07 00 91 40 01 FF 00 0A 00 03 07 00 03 07 01 A9 01 00 01 07 00 71 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 2F 01 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 2F 07 00 BA 42 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 2F 07 00 BA 45 07 00 91 00 FF 00 0E 00 04 07 00 03 07 01 A9 01 01 00 01 07 00 91 40 07 00 D8 47 07 00 91 40 07 00 E1 4A 07 00 E1 FF 00 01 00 04 07 00 03 07 01 A9 01 01 00 02 07 00 E1 01 5D 07 00 E1 FC 00 01 07 00 E1 44 07 00 91 40 07 00 E1 47 07 00 91 40 01 47 07 00 8F 40 07 00 E1 47 07 00 91 40 07 00 95 4D 07 00 E9 FF 00 01 00 05 07 00 03 07 01 A9 01 01 07 00 E1 00 02 07 00 E9 01 5C 07 00 E9 FF 00 13 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 C4 07 00 E9 05 01 FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 05 07 00 C4 07 00 E9 05 01 01 FF 00 1D 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 C4 07 00 E9 05 01 42 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 C4 07 00 E9 05 01 45 07 00 91 40 01 02 04 41 01 1A FF 00 11 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 05 07 00 03 08 01 F1 08 01 F1 07 00 6C 01 FF 00 1B 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 0A 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 05 07 00 03 08 01 F1 08 01 F1 07 00 6C 01 FF 00 1B 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C 42 07 00 83 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 F7 44 07 00 87 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 E9 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 0B 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 07 00 F7 07 00 6C 01 FF 00 1C 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 F7 45 07 00 83 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 0B 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 07 00 F7 07 00 6C 01 FF 00 1F 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 F7 42 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 F7 45 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 6C 42 07 00 91 FF 00 00 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 02 07 00 03 07 00 6C 45 07 00 91 00 02 FA 00 02 0B 42 01 1D 49 07 00 91 FF 00 00 00 05 07 00 03 07 01 A9 01 01 07 00 E1 00 02 07 00 2F 01 45 07 00 91 FF 00 00 00 05 07 00 03 07 01 A9 01 01 07 00 E1 00 02 07 00 2F 07 00 BA 42 07 00 91 FF 00 00 00 05 07 00 03 07 01 A9 01 01 07 00 E1 00 02 07 00 2F 07 00 BA 45 07 00 91 00 03 05 42 01 19 F8 00 00 46 07 00 91 40 07 00 2F 45 07 00 91 40 07 00 95 45 07 00 75 40 07 00 BA 45 07 00 91 40 01 02 05 42 01 19 FF 00 1D 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 07 00 B0 FF 00 02 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 07 00 B0 01 FF 00 1E 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 07 00 B0 FF 00 0E 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 03 FF 00 02 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 01 FF 00 1D 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 03 FF 00 0F 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 AA FF 00 02 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 07 00 AA 01 FF 00 1C 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 AA FF 00 0E 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 B0 FF 00 02 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 07 00 B0 01 FF 00 1D 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 B0 FF 00 12 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 03 07 00 AA FF 00 02 00 02 07 00 03 07 01 A9 00 07 07 00 D2 08 03 C3 08 03 C3 03 03 07 00 AA 01 FF 00 1D 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 03 07 00 AA FF 00 08 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 03 03 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 D2 07 01 21 FF 00 03 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 D2 07 01 21 01 45 07 00 91 40 01 0E 42 01 1C FF 00 17 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 05 13 08 05 13 07 00 03 FF 00 02 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 05 13 08 05 13 07 00 03 01 FF 00 1C 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 05 13 08 05 13 07 00 03 FF 00 15 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 05 13 08 05 13 03 07 00 03 FF 00 02 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 05 13 08 05 13 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 05 13 08 05 13 03 07 00 03 55 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 05 13 08 05 13 03 03 03 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 D2 07 01 21 43 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 D2 07 01 21 01 45 07 00 91 40 01 0E 42 01 1F 4E 07 01 5E FF 00 02 00 02 07 00 03 07 01 A9 00 02 07 01 5E 01 5D 07 01 5E 42 07 00 77 40 07 01 5E 45 07 00 91 40 01 02 05 42 01 18 00 0B 42 01 1F FF 00 09 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 01 07 00 B0 45 07 00 91 40 02 FF 00 12 00 02 07 00 03 07 01 A9 00 02 02 07 00 B0 FF 00 02 00 02 07 00 03 07 01 A9 00 03 02 07 00 B0 01 FF 00 1F 00 02 07 00 03 07 01 A9 00 02 02 07 00 B0 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 02 07 00 B0 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 02 02 4D 03 FF 00 02 00 02 07 00 03 07 01 A9 00 02 03 01 5F 03 FF 00 06 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 03 07 00 48 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 03 07 00 95 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 03 07 01 76 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 03 03 03 05 42 01 19 46 07 00 8B 40 07 00 2F 45 07 00 91 40 07 00 95 45 07 00 91 40 07 00 BA 45 07 00 91 40 01 02 05 42 01 1A 45 07 00 91 40 07 01 5E 45 07 00 91 40 01 4B 01 FF 00 02 00 02 07 00 03 07 01 A9 00 02 01 01 5E 01 FC 00 0C 01 42 01 1F 4A 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 08 07 E1 08 07 E1 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 08 07 E1 08 07 E1 07 00 6C 42 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 08 07 E1 08 07 E1 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 43 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 01 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 42 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 FF 00 0B 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 FF 00 02 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 01 FF 00 1D 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 FF 00 0F 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 AA FF 00 02 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 07 00 F7 07 00 AA 01 FF 00 1C 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 AA 45 07 00 87 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 B0 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 02 FF 00 0B 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 02 FF 00 02 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 07 00 F7 02 01 FF 00 1E 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 02 42 07 00 8D FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 02 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 45 07 00 8B FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C FF 00 0B 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 03 07 00 03 07 01 A9 01 00 04 07 00 03 07 00 F7 07 00 6C 01 FF 00 1F 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 42 07 00 81 FF 00 00 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 42 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 45 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 6C 42 07 00 91 FF 00 00 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 6C 45 07 00 91 00 FA 00 02 4A 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 04 07 00 03 08 09 29 08 09 29 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 04 07 00 03 08 09 29 08 09 29 07 00 6C 42 07 00 8F FF 00 00 00 02 07 00 03 07 01 A9 00 04 07 00 03 08 09 29 08 09 29 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 F7 FF 00 12 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 B0 FF 00 02 00 02 07 00 03 07 01 A9 00 04 07 00 03 07 00 F7 07 00 B0 01 FF 00 1F 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 B0 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 B0 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 02 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 02 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 F7 FF 00 0E 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 02 07 00 03 07 01 A9 00 04 07 00 03 07 00 F7 07 00 6C 01 FF 00 1F 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 F7 42 07 00 71 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 F7 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C FF 00 0B 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C FF 00 02 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 6C 01 FF 00 1F 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 45 07 00 91 00 FF 00 00 00 02 07 00 03 07 01 A9 00 02 02 07 00 B0 FF 00 01 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 03 FF 00 01 00 02 07 00 03 07 01 A9 00 06 07 00 D2 08 03 C3 08 03 C3 03 03 07 00 AA FF 00 01 00 03 07 00 03 07 01 A9 01 00 02 07 00 03 07 00 F7 FF 00 01 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 05 13 08 05 13 03 07 00 03 01 FE 00 01 01 01 07 00 E1 FF 00 01 00 02 07 00 03 07 01 A9 00 01 01 FF 00 01 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 B0 FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 C4 07 00 E9 05 01 FF 00 01 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 6C FF 00 01 00 02 07 00 03 07 01 A9 00 01 07 00 03 01 FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 01 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 05 13 08 05 13 07 00 03 FF 00 01 00 02 07 00 03 07 01 A9 00 04 07 00 D2 08 03 C3 08 03 C3 07 00 B0 FF 00 01 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 B0 01 FF 00 01 00 04 07 00 03 07 01 A9 01 01 00 01 07 00 E1 FA 00 01 FF 00 01 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 02 FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 01 00 02 07 00 03 07 01 A9 00 01 03 FF 00 01 00 03 07 00 03 07 01 A9 01 00 03 07 00 03 07 00 F7 07 00 AA FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 01 00 02 07 00 03 07 01 A9 00 02 07 00 03 07 00 6C 41 07 01 5E FF 00 01 00 05 07 00 03 07 01 A9 01 01 07 00 E1 00 01 07 00 E9 FF 00 01 00 02 07 00 03 07 01 A9 00 03 07 00 03 07 00 F7 07 00 6C FF 00 01 00 06 07 00 03 07 01 A9 01 01 07 00 E1 07 00 E9 00 04 07 00 03 08 01 F1 08 01 F1 07 00 6C FF 00 01 00 02 07 00 03 07 01 A9 00 05 07 00 D2 08 03 C3 08 03 C3 03 07 00 AA 41 07 00 91 43 05 44 07 00 91 47 05 47 07 00 91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2663   2671   Ljava/lang/UnsupportedOperationException;
        //  2663   2671   2663   2671   Any
        //  2679   2681   3      8      Ljava/lang/ClassCastException;
        //  30     37     37     38     Any
        //  31     37     37     38     Any
        //  30     37     30     31     Any
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  51     58     58     59     Any
        //  52     58     58     59     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     58     58     59     Any
        //  51     58     51     52     Ljava/lang/RuntimeException;
        //  52     58     58     59     Ljava/lang/IllegalArgumentException;
        //  63     70     70     71     Any
        //  64     70     70     71     Any
        //  64     70     3      8      Ljava/lang/ArithmeticException;
        //  63     70     70     71     Ljava/lang/UnsupportedOperationException;
        //  64     70     63     64     Any
        //  75     81     81     82     Any
        //  75     81     81     82     Ljava/lang/IndexOutOfBoundsException;
        //  75     81     3      8      Any
        //  75     81     3      8      Any
        //  75     81     81     82     Ljava/lang/UnsupportedOperationException;
        //  85     92     92     93     Any
        //  86     92     85     86     Any
        //  86     92     3      8      Ljava/lang/NullPointerException;
        //  86     92     85     86     Ljava/lang/RuntimeException;
        //  86     92     85     86     Ljava/lang/EnumConstantNotPresentException;
        //  103    110    110    111    Any
        //  104    110    103    104    Ljava/lang/StringIndexOutOfBoundsException;
        //  103    110    3      8      Ljava/util/ConcurrentModificationException;
        //  104    110    110    111    Any
        //  103    110    3      8      Ljava/lang/NumberFormatException;
        //  162    169    169    170    Any
        //  163    169    3      8      Any
        //  163    169    162    163    Ljava/lang/NegativeArraySizeException;
        //  163    169    3      8      Any
        //  162    169    162    163    Ljava/lang/UnsupportedOperationException;
        //  176    183    183    184    Any
        //  176    183    3      8      Any
        //  176    183    183    184    Any
        //  176    183    176    177    Ljava/lang/StringIndexOutOfBoundsException;
        //  176    183    183    184    Ljava/lang/IndexOutOfBoundsException;
        //  197    203    203    204    Any
        //  197    203    3      8      Any
        //  197    203    203    204    Any
        //  197    203    3      8      Any
        //  197    203    3      8      Ljava/util/NoSuchElementException;
        //  210    217    217    218    Any
        //  210    217    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  211    217    217    218    Any
        //  211    217    3      8      Any
        //  211    217    210    211    Any
        //  229    236    236    237    Any
        //  229    236    236    237    Ljava/lang/NullPointerException;
        //  230    236    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  229    236    229    230    Ljava/lang/UnsupportedOperationException;
        //  230    236    3      8      Ljava/lang/NullPointerException;
        //  240    247    247    248    Any
        //  240    247    247    248    Any
        //  241    247    240    241    Any
        //  240    247    240    241    Ljava/lang/NegativeArraySizeException;
        //  241    247    247    248    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  263    272    272    273    Any
        //  264    272    272    273    Ljava/lang/NullPointerException;
        //  264    272    263    264    Any
        //  264    272    272    273    Ljava/lang/IndexOutOfBoundsException;
        //  263    272    272    273    Any
        //  323    332    332    333    Any
        //  324    332    332    333    Ljava/lang/AssertionError;
        //  324    332    3      8      Any
        //  323    332    332    333    Ljava/lang/IndexOutOfBoundsException;
        //  323    332    323    324    Any
        //  341    350    350    351    Any
        //  342    350    350    351    Ljava/lang/EnumConstantNotPresentException;
        //  342    350    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  342    350    341    342    Ljava/lang/IllegalStateException;
        //  342    350    3      8      Ljava/lang/NullPointerException;
        //  451    458    458    459    Any
        //  451    458    458    459    Ljava/lang/IndexOutOfBoundsException;
        //  452    458    451    452    Any
        //  452    458    3      8      Any
        //  452    458    458    459    Ljava/lang/AssertionError;
        //  548    554    554    555    Any
        //  548    554    3      8      Any
        //  548    554    3      8      Any
        //  548    554    554    555    Any
        //  548    554    3      8      Any
        //  599    606    606    607    Any
        //  599    606    3      8      Any
        //  599    606    599    600    Ljava/lang/StringIndexOutOfBoundsException;
        //  600    606    606    607    Ljava/lang/IllegalArgumentException;
        //  600    606    606    607    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  612    619    619    620    Any
        //  613    619    612    613    Ljava/lang/NumberFormatException;
        //  612    619    619    620    Ljava/lang/RuntimeException;
        //  613    619    619    620    Any
        //  613    619    3      8      Ljava/lang/NegativeArraySizeException;
        //  668    674    674    675    Any
        //  668    674    674    675    Ljava/lang/EnumConstantNotPresentException;
        //  668    674    674    675    Ljava/lang/AssertionError;
        //  668    674    674    675    Ljava/lang/ArithmeticException;
        //  668    674    674    675    Any
        //  681    688    688    689    Any
        //  682    688    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  682    688    688    689    Any
        //  681    688    688    689    Any
        //  681    688    681    682    Ljava/lang/StringIndexOutOfBoundsException;
        //  740    746    746    747    Any
        //  740    746    3      8      Ljava/util/ConcurrentModificationException;
        //  740    746    3      8      Any
        //  740    746    3      8      Ljava/lang/IllegalArgumentException;
        //  740    746    3      8      Ljava/lang/AssertionError;
        //  750    757    757    758    Any
        //  750    757    757    758    Ljava/lang/ArithmeticException;
        //  750    757    3      8      Any
        //  750    757    3      8      Any
        //  750    757    750    751    Any
        //  761    768    768    769    Any
        //  762    768    3      8      Any
        //  761    768    761    762    Any
        //  762    768    3      8      Any
        //  762    768    761    762    Any
        //  830    837    837    838    Any
        //  830    837    830    831    Any
        //  831    837    830    831    Any
        //  831    837    3      8      Ljava/util/ConcurrentModificationException;
        //  831    837    837    838    Ljava/util/ConcurrentModificationException;
        //  841    848    848    849    Any
        //  842    848    848    849    Any
        //  842    848    841    842    Any
        //  841    848    3      8      Any
        //  842    848    848    849    Ljava/lang/IndexOutOfBoundsException;
        //  896    903    903    904    Any
        //  896    903    896    897    Any
        //  897    903    903    904    Ljava/lang/NegativeArraySizeException;
        //  896    903    903    904    Any
        //  896    903    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  910    917    917    918    Any
        //  911    917    910    911    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  911    917    917    918    Ljava/lang/IllegalArgumentException;
        //  911    917    917    918    Ljava/lang/ArithmeticException;
        //  910    917    917    918    Any
        //  1226   1232   1232   1233   Any
        //  1226   1232   3      8      Any
        //  1226   1232   1232   1233   Ljava/lang/EnumConstantNotPresentException;
        //  1226   1232   1232   1233   Any
        //  1226   1232   3      8      Ljava/util/NoSuchElementException;
        //  1238   1244   1244   1245   Any
        //  1238   1244   3      8      Ljava/util/ConcurrentModificationException;
        //  1238   1244   3      8      Any
        //  1238   1244   1244   1245   Any
        //  1238   1244   1244   1245   Any
        //  1426   1433   1433   1434   Any
        //  1426   1433   1426   1427   Any
        //  1426   1433   1433   1434   Ljava/lang/ArithmeticException;
        //  1426   1433   1426   1427   Any
        //  1427   1433   3      8      Any
        //  1438   1445   1445   1446   Any
        //  1438   1445   1438   1439   Ljava/lang/StringIndexOutOfBoundsException;
        //  1438   1445   3      8      Any
        //  1439   1445   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1438   1445   1438   1439   Any
        //  1547   1554   1554   1555   Any
        //  1547   1554   1547   1548   Ljava/lang/RuntimeException;
        //  1547   1554   3      8      Ljava/lang/NumberFormatException;
        //  1548   1554   1554   1555   Ljava/lang/NegativeArraySizeException;
        //  1547   1554   3      8      Any
        //  1651   1657   1657   1658   Any
        //  1651   1657   1657   1658   Any
        //  1651   1657   3      8      Any
        //  1651   1657   3      8      Ljava/lang/NumberFormatException;
        //  1651   1657   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1715   1722   1722   1723   Any
        //  1716   1722   1715   1716   Any
        //  1716   1722   1715   1716   Ljava/lang/NegativeArraySizeException;
        //  1716   1722   1722   1723   Any
        //  1715   1722   1715   1716   Ljava/lang/UnsupportedOperationException;
        //  1780   1786   1786   1787   Any
        //  1780   1786   3      8      Any
        //  1780   1786   1786   1787   Any
        //  1780   1786   1786   1787   Ljava/lang/ClassCastException;
        //  1780   1786   1786   1787   Ljava/lang/IllegalArgumentException;
        //  1793   1800   1800   1801   Any
        //  1793   1800   1800   1801   Any
        //  1793   1800   3      8      Any
        //  1794   1800   1793   1794   Any
        //  1793   1800   1793   1794   Any
        //  1847   1854   1854   1855   Any
        //  1848   1854   3      8      Any
        //  1848   1854   1847   1848   Ljava/util/NoSuchElementException;
        //  1848   1854   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1847   1854   3      8      Any
        //  1861   1868   1868   1869   Any
        //  1862   1868   1861   1862   Any
        //  1861   1868   3      8      Any
        //  1862   1868   1868   1869   Any
        //  1861   1868   3      8      Any
        //  1914   1921   1921   1922   Any
        //  1915   1921   1914   1915   Any
        //  1914   1921   1921   1922   Any
        //  1914   1921   1914   1915   Any
        //  1915   1921   1921   1922   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2034   2035   Ljava/lang/ArithmeticException;
        //  2027   2034   2027   2028   Any
        //  2028   2034   3      8      Ljava/lang/NumberFormatException;
        //  2028   2034   2027   2028   Any
        //  2038   2045   2045   2046   Any
        //  2039   2045   2045   2046   Any
        //  2039   2045   3      8      Any
        //  2038   2045   3      8      Any
        //  2038   2045   2038   2039   Any
        //  2050   2057   2057   2058   Any
        //  2051   2057   2050   2051   Any
        //  2050   2057   2050   2051   Ljava/lang/StringIndexOutOfBoundsException;
        //  2051   2057   2057   2058   Ljava/lang/AssertionError;
        //  2050   2057   3      8      Any
        //  2064   2071   2071   2072   Any
        //  2064   2071   2064   2065   Ljava/lang/IllegalStateException;
        //  2065   2071   2071   2072   Any
        //  2065   2071   2071   2072   Ljava/lang/NumberFormatException;
        //  2065   2071   2064   2065   Any
        //  2075   2082   2082   2083   Any
        //  2076   2082   2075   2076   Ljava/lang/AssertionError;
        //  2075   2082   3      8      Any
        //  2075   2082   2075   2076   Ljava/lang/EnumConstantNotPresentException;
        //  2076   2082   3      8      Any
        //  2182   2189   2189   2190   Any
        //  2183   2189   2182   2183   Ljava/lang/NumberFormatException;
        //  2182   2189   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2183   2189   3      8      Any
        //  2182   2189   2189   2190   Ljava/util/ConcurrentModificationException;
        //  2239   2246   2246   2247   Any
        //  2239   2246   2246   2247   Ljava/lang/ClassCastException;
        //  2239   2246   2239   2240   Ljava/lang/AssertionError;
        //  2240   2246   2246   2247   Ljava/lang/ClassCastException;
        //  2240   2246   2239   2240   Ljava/lang/AssertionError;
        //  2253   2260   2260   2261   Any
        //  2253   2260   2260   2261   Any
        //  2254   2260   2260   2261   Any
        //  2254   2260   2253   2254   Ljava/util/NoSuchElementException;
        //  2253   2260   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2311   2318   2318   2319   Any
        //  2311   2318   3      8      Ljava/util/NoSuchElementException;
        //  2312   2318   3      8      Any
        //  2312   2318   2318   2319   Any
        //  2311   2318   2311   2312   Ljava/lang/EnumConstantNotPresentException;
        //  2322   2329   2329   2330   Any
        //  2323   2329   2329   2330   Ljava/lang/IllegalStateException;
        //  2323   2329   2322   2323   Ljava/lang/AssertionError;
        //  2322   2329   2322   2323   Any
        //  2322   2329   2329   2330   Ljava/lang/ClassCastException;
        //  2333   2340   2340   2341   Any
        //  2334   2340   3      8      Any
        //  2334   2340   2340   2341   Any
        //  2333   2340   2333   2334   Any
        //  2333   2340   2340   2341   Ljava/lang/IndexOutOfBoundsException;
        //  2355   2362   2362   2363   Any
        //  2355   2362   2355   2356   Any
        //  2355   2362   2362   2363   Any
        //  2355   2362   2355   2356   Any
        //  2356   2362   3      8      Ljava/lang/ClassCastException;
        //  2366   2373   2373   2374   Any
        //  2366   2373   2366   2367   Ljava/lang/IllegalStateException;
        //  2367   2373   2373   2374   Any
        //  2367   2373   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2366   2373   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2431   2438   2438   2439   Any
        //  2432   2438   2438   2439   Ljava/util/ConcurrentModificationException;
        //  2432   2438   2431   2432   Any
        //  2431   2438   2431   2432   Any
        //  2431   2438   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2442   2449   2449   2450   Any
        //  2442   2449   3      8      Any
        //  2442   2449   2442   2443   Any
        //  2443   2449   2449   2450   Any
        //  2442   2449   3      8      Any
        //  2504   2510   2510   2511   Any
        //  2504   2510   2510   2511   Ljava/lang/ClassCastException;
        //  2504   2510   3      8      Any
        //  2504   2510   3      8      Any
        //  2504   2510   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2514   2521   2521   2522   Any
        //  2515   2521   2514   2515   Ljava/lang/RuntimeException;
        //  2514   2521   2514   2515   Any
        //  2515   2521   3      8      Any
        //  2514   2521   2514   2515   Any
        //  2525   2532   2532   2533   Any
        //  2526   2532   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2526   2532   3      8      Ljava/util/ConcurrentModificationException;
        //  2526   2532   2532   2533   Any
        //  2526   2532   2525   2526   Ljava/lang/UnsupportedOperationException;
        //  2584   2590   2590   2591   Any
        //  2584   2590   2590   2591   Any
        //  2584   2590   3      8      Ljava/lang/ArithmeticException;
        //  2584   2590   2590   2591   Any
        //  2584   2590   2590   2591   Any
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
    
    static {
        throw t;
    }
    
    public void 1(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          675
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            667
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            659
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           142910032
        //    34: goto            40
        //    37: ldc_w           -124780741
        //    40: ldc_w           1845393392
        //    43: ixor           
        //    44: lookupswitch {
        //          -1787721525: 72
        //          1702548896: 37
        //          default: 638
        //        }
        //    72: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            87
        //    81: ldc_w           -450954859
        //    84: goto            90
        //    87: ldc_w           -1228824474
        //    90: ldc_w           1448968453
        //    93: ixor           
        //    94: lookupswitch {
        //          -1287423856: 634
        //          -325148922: 87
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   127: goto            131
        //   130: athrow         
        //   131: ifnonnull       246
        //   134: aload_0        
        //   135: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            150
        //   144: ldc_w           -406993096
        //   147: goto            153
        //   150: ldc_w           -1450457980
        //   153: ldc_w           714499948
        //   156: ixor           
        //   157: lookupswitch {
        //          -1849245941: 150
        //          -852778924: 636
        //          default: 184
        //        }
        //   184: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   187: getstatic       dev/nuker/pyro/fc.1:I
        //   190: ifeq            199
        //   193: ldc_w           -618650980
        //   196: goto            202
        //   199: ldc_w           1321694168
        //   202: ldc_w           -908277062
        //   205: ixor           
        //   206: lookupswitch {
        //          318564390: 642
        //          333452847: 199
        //          default: 232
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72882_A:()V
        //   239: goto            243
        //   242: athrow         
        //   243: goto            482
        //   246: aload_0        
        //   247: getstatic       dev/nuker/pyro/fc.0:I
        //   250: ifeq            259
        //   253: ldc_w           -1157422499
        //   256: goto            262
        //   259: ldc_w           -148651447
        //   262: ldc_w           2137120835
        //   265: ixor           
        //   266: lookupswitch {
        //          -1000160738: 630
        //          36260183: 259
        //          default: 292
        //        }
        //   292: getfield        dev/nuker/pyro/f56.c:Lnet/minecraft/client/Minecraft;
        //   295: goto            299
        //   298: athrow         
        //   299: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   302: goto            306
        //   305: athrow         
        //   306: getstatic       dev/nuker/pyro/fc.1:I
        //   309: ifeq            318
        //   312: ldc_w           1206286717
        //   315: goto            321
        //   318: ldc_w           1231514992
        //   321: ldc_w           -1076654544
        //   324: ixor           
        //   325: lookupswitch {
        //          -1809798077: 318
        //          -130681011: 632
        //          default: 352
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147298_b:()Lnet/minecraft/network/NetworkManager;
        //   359: goto            363
        //   362: athrow         
        //   363: new             Lnet/minecraft/util/text/TextComponentString;
        //   366: dup            
        //   367: getstatic       dev/nuker/pyro/fc.c:I
        //   370: ifge            379
        //   373: ldc_w           1952255488
        //   376: goto            382
        //   379: ldc_w           1087832064
        //   382: ldc_w           -719397921
        //   385: ixor           
        //   386: lookupswitch {
        //          -1589389857: 644
        //          -319665855: 379
        //          default: 412
        //        }
        //   412: aload_1        
        //   413: getstatic       dev/nuker/pyro/fc.1:I
        //   416: ifeq            425
        //   419: ldc_w           2008855421
        //   422: goto            428
        //   425: ldc_w           -1098438196
        //   428: ldc_w           -1931656538
        //   431: ixor           
        //   432: lookupswitch {
        //          -180399893: 425
        //          -77467173: 646
        //          default: 460
        //        }
        //   460: goto            464
        //   463: athrow         
        //   464: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
        //   467: goto            471
        //   470: athrow         
        //   471: goto            475
        //   474: athrow         
        //   475: invokevirtual   net/minecraft/network/NetworkManager.func_150718_a:(Lnet/minecraft/util/text/ITextComponent;)V
        //   478: goto            482
        //   481: athrow         
        //   482: getstatic       dev/nuker/pyro/fc.1:I
        //   485: ifeq            494
        //   488: ldc_w           1085083560
        //   491: goto            497
        //   494: ldc_w           1387307230
        //   497: ldc_w           604587972
        //   500: ixor           
        //   501: lookupswitch {
        //          1688488044: 494
        //          1991894810: 528
        //          default: 648
        //        }
        //   528: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f6g;
        //   531: getfield        dev/nuker/pyro/f6g.c:Ldev/nuker/pyro/fw;
        //   534: iconst_0       
        //   535: getstatic       dev/nuker/pyro/fc.1:I
        //   538: ifeq            547
        //   541: ldc_w           -94654939
        //   544: goto            550
        //   547: ldc_w           1419303038
        //   550: ldc_w           949403511
        //   553: ixor           
        //   554: lookupswitch {
        //          -1026748078: 547
        //          1812883209: 580
        //          default: 640
        //        }
        //   580: goto            584
        //   583: athrow         
        //   584: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   587: goto            591
        //   590: athrow         
        //   591: goto            595
        //   594: athrow         
        //   595: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   598: goto            602
        //   601: athrow         
        //   602: aload_0        
        //   603: getfield        dev/nuker/pyro/f56.c:Ldev/nuker/pyro/fw;
        //   606: iconst_0       
        //   607: goto            611
        //   610: athrow         
        //   611: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   614: goto            618
        //   617: athrow         
        //   618: goto            622
        //   621: athrow         
        //   622: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   625: goto            629
        //   628: athrow         
        //   629: return         
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
        //   640: aconst_null    
        //   641: athrow         
        //   642: aconst_null    
        //   643: athrow         
        //   644: aconst_null    
        //   645: athrow         
        //   646: aconst_null    
        //   647: athrow         
        //   648: aconst_null    
        //   649: athrow         
        //   650: pop            
        //   651: goto            24
        //   654: pop            
        //   655: aconst_null    
        //   656: goto            650
        //   659: dup            
        //   660: ifnull          650
        //   663: checkcast       Ljava/lang/Throwable;
        //   666: athrow         
        //   667: dup            
        //   668: ifnull          654
        //   671: checkcast       Ljava/lang/Throwable;
        //   674: athrow         
        //   675: aconst_null    
        //   676: athrow         
        //    StackMapTable: 00 5A 43 07 00 91 04 FF 00 0B 00 00 00 01 07 00 91 FD 00 03 07 00 03 07 00 6C 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 00 03 01 5F 07 00 03 4E 07 00 AA FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 00 AA 01 5D 07 00 AA 42 07 00 91 40 07 00 AA 45 07 00 91 40 07 01 C8 52 07 00 AA FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 00 AA 01 5E 07 00 AA 4E 07 00 D2 FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 00 D2 01 5D 07 00 D2 42 07 00 91 40 07 00 D2 45 07 00 91 00 02 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 01 07 00 AA 45 07 00 91 40 07 01 C8 4B 07 01 C8 FF 00 02 00 02 07 00 03 07 00 6C 00 02 07 01 C8 01 5E 07 01 C8 42 07 00 91 40 07 01 C8 45 07 00 91 40 07 01 D7 FF 00 0F 00 02 07 00 03 07 00 6C 00 03 07 01 D7 08 01 6B 08 01 6B FF 00 02 00 02 07 00 03 07 00 6C 00 04 07 01 D7 08 01 6B 08 01 6B 01 FF 00 1D 00 02 07 00 03 07 00 6C 00 03 07 01 D7 08 01 6B 08 01 6B FF 00 0C 00 02 07 00 03 07 00 6C 00 04 07 01 D7 08 01 6B 08 01 6B 07 00 6C FF 00 02 00 02 07 00 03 07 00 6C 00 05 07 01 D7 08 01 6B 08 01 6B 07 00 6C 01 FF 00 1F 00 02 07 00 03 07 00 6C 00 04 07 01 D7 08 01 6B 08 01 6B 07 00 6C 42 07 00 85 FF 00 00 00 02 07 00 03 07 00 6C 00 04 07 01 D7 08 01 6B 08 01 6B 07 00 6C 45 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 D7 07 01 CE 42 07 00 71 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 D7 07 01 CE 45 07 00 91 00 0B 42 01 1E FF 00 12 00 02 07 00 03 07 00 6C 00 02 07 01 EB 01 FF 00 02 00 02 07 00 03 07 00 6C 00 03 07 01 EB 01 01 FF 00 1D 00 02 07 00 03 07 00 6C 00 02 07 01 EB 01 42 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 01 45 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 07 00 BA FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 07 00 BA 45 07 00 91 00 47 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 01 45 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 07 00 BA 42 07 00 91 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 01 EB 07 00 BA 45 07 00 91 00 40 07 00 03 41 07 01 C8 41 07 00 AA 41 07 00 AA 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 6C 00 02 07 01 EB 01 41 07 00 D2 FF 00 01 00 02 07 00 03 07 00 6C 00 03 07 01 D7 08 01 6B 08 01 6B FF 00 01 00 02 07 00 03 07 00 6C 00 04 07 01 D7 08 01 6B 08 01 6B 07 00 6C 01 41 07 00 91 43 05 44 07 00 91 47 05 47 07 00 91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     659    667    Any
        //  659    667    659    667    Ljava/lang/NegativeArraySizeException;
        //  675    677    3      8      Any
        //  123    130    130    131    Any
        //  123    130    123    124    Any
        //  124    130    123    124    Any
        //  124    130    123    124    Any
        //  123    130    130    131    Any
        //  235    242    242    243    Any
        //  235    242    3      8      Ljava/lang/NullPointerException;
        //  236    242    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  235    242    235    236    Any
        //  236    242    235    236    Ljava/lang/NegativeArraySizeException;
        //  299    305    305    306    Any
        //  299    305    3      8      Ljava/util/ConcurrentModificationException;
        //  299    305    3      8      Any
        //  299    305    305    306    Ljava/lang/ClassCastException;
        //  299    305    3      8      Ljava/lang/NegativeArraySizeException;
        //  355    362    362    363    Any
        //  356    362    362    363    Any
        //  355    362    3      8      Any
        //  355    362    355    356    Any
        //  356    362    362    363    Any
        //  463    470    470    471    Any
        //  464    470    3      8      Ljava/lang/UnsupportedOperationException;
        //  464    470    463    464    Ljava/util/ConcurrentModificationException;
        //  463    470    470    471    Any
        //  464    470    470    471    Ljava/lang/RuntimeException;
        //  474    481    481    482    Any
        //  475    481    481    482    Any
        //  474    481    474    475    Ljava/lang/UnsupportedOperationException;
        //  474    481    3      8      Any
        //  474    481    481    482    Any
        //  583    590    590    591    Any
        //  584    590    583    584    Ljava/lang/IndexOutOfBoundsException;
        //  583    590    583    584    Any
        //  583    590    3      8      Ljava/lang/IllegalArgumentException;
        //  584    590    583    584    Any
        //  595    601    601    602    Any
        //  595    601    601    602    Ljava/lang/ClassCastException;
        //  595    601    601    602    Ljava/lang/IllegalArgumentException;
        //  595    601    3      8      Any
        //  595    601    3      8      Any
        //  610    617    617    618    Any
        //  611    617    617    618    Any
        //  610    617    3      8      Any
        //  611    617    610    611    Any
        //  611    617    610    611    Any
        //  621    628    628    629    Any
        //  621    628    628    629    Ljava/util/ConcurrentModificationException;
        //  621    628    621    622    Any
        //  621    628    628    629    Ljava/lang/NumberFormatException;
        //  621    628    621    622    Any
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
}
