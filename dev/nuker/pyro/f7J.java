// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f7J extends fH
{
    public f0a c;
    public f0a 0;
    public f0a 1;
    public f0a 2;
    
    public f7J() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u223f\u149c\u8b3b\ub3d5\uc991\uec20"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u221f\u149c\u8b1b\ub3d5\uc991\uec20"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2210\u149f\u8b24\ub3d6\uc989\uec24\ub264\ue71c\ud967\ue9f8\ua6b7\u1e58\ue02e\uc5e7\u8164\u88a3\u57b0\u7680\ubd3f\uc054\u2a83\uc228\u6bc4\u2d59\ud798\u3451\u7d2f\u882b\u8015\u8cc5\u8566\ufb3c\u7157\u9a14\u1bc1\uf0f6\u496a\u89a5\uca94\uff73\ub706\u41e6\ub822\ub308\u4c29\u8b27\u7c7d\ucfe9\u7d41\uea91\ue71a"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_1       
        //    17: getstatic       dev/nuker/pyro/fc.c:I
        //    20: ifge            28
        //    23: ldc             1795778892
        //    25: goto            30
        //    28: ldc             -1634675153
        //    30: ldc             -1819875098
        //    32: ixor           
        //    33: lookupswitch {
        //          -156807946: 28
        //          -124812886: 563
        //          default: 60
        //        }
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0a;
        //    67: dup            
        //    68: ldc             "\u2238\u149d\u8b3e\ub3dc\uc990\uec23\ub22b\ue717\ud971\ue9c0\ua6f8\u1e5a\ue024"
        //    70: getstatic       dev/nuker/pyro/fc.0:I
        //    73: ifeq            81
        //    76: ldc             -1025833049
        //    78: goto            83
        //    81: ldc             -1238168829
        //    83: ldc             468769811
        //    85: ixor           
        //    86: lookupswitch {
        //          -1379674352: 112
        //          -651437132: 81
        //          default: 555
        //        }
        //   112: invokestatic    invokestatic   !!! ERROR
        //   115: ldc             "\u2218\u149d\u8b3e\ub3dc\uc990\uec23\ub22b\ue717\ud971\ue9c0\ua6f8\u1e5a\ue024"
        //   117: getstatic       dev/nuker/pyro/fc.c:I
        //   120: ifge            128
        //   123: ldc             347884443
        //   125: goto            130
        //   128: ldc             308414089
        //   130: ldc             -148945512
        //   132: ixor           
        //   133: lookupswitch {
        //          -475853309: 128
        //          -444775663: 160
        //          default: 549
        //        }
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: ldc             "\u2210\u149f\u8b24\ub3d6\uc989\uec24\ub264\ue71c\ud967\ue9f8\ua6b7\u1e58\ue02e\uc5e7\u8167\u88a3\u57b2\u76c5\ubd7d\uc046\u2acb\uc232\u6bc4\u2d53\ud7cf\u3455\u7d6b\u886c\u8004\u8cc3\u8531\ufb3b\u7104\u9a56\u1bd7\uf0a6\u4979\u89aa"
        //   165: invokestatic    invokestatic   !!! ERROR
        //   168: iconst_1       
        //   169: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   172: putfield        dev/nuker/pyro/f7J.c:Ldev/nuker/pyro/f0a;
        //   175: aload_0        
        //   176: new             Ldev/nuker/pyro/f0a;
        //   179: dup            
        //   180: ldc             "\u2238\u1487\u8b2d\ub3d4\uc98d"
        //   182: invokestatic    invokestatic   !!! ERROR
        //   185: ldc             "\u2218\u1487\u8b2d\ub3d4\uc98d"
        //   187: getstatic       dev/nuker/pyro/fc.0:I
        //   190: ifeq            198
        //   193: ldc             -939794647
        //   195: goto            200
        //   198: ldc             66536223
        //   200: ldc             -117594644
        //   202: ixor           
        //   203: lookupswitch {
        //          964469314: 198
        //          1057389253: 557
        //          default: 228
        //        }
        //   228: invokestatic    invokestatic   !!! ERROR
        //   231: ldc             "\u2215\u149c\u8b2d\ub3ca\uc990\uec70\ub230\ue745\ud969\ue9e1\ua6fb\u1e43\ue036\uc5e7\u8163\u88b8\u57a1\u76cd\ubd2e\uc011\u2ad7\uc234\u6b88\u2d45\ud783\u345b\u7d3c\u882b\u8008\u8cc5\u8564\ufb72\u7113\u9a19\u1bcf\uf0b8"
        //   233: invokestatic    invokestatic   !!! ERROR
        //   236: iconst_1       
        //   237: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   240: putfield        dev/nuker/pyro/f7J.0:Ldev/nuker/pyro/f0a;
        //   243: getstatic       dev/nuker/pyro/fc.c:I
        //   246: ifge            254
        //   249: ldc             -1042192759
        //   251: goto            256
        //   254: ldc             851932551
        //   256: ldc             78832613
        //   258: ixor           
        //   259: lookupswitch {
        //          -984382100: 254
        //          913675874: 284
        //          default: 551
        //        }
        //   284: aload_0        
        //   285: new             Ldev/nuker/pyro/f0a;
        //   288: dup            
        //   289: ldc             "\u223f\u1490\u8b38\ub3ca\uc98a\uec25\ub22d\ue706\ud97c"
        //   291: getstatic       dev/nuker/pyro/fc.0:I
        //   294: ifeq            302
        //   297: ldc             -969789303
        //   299: goto            304
        //   302: ldc             84225736
        //   304: ldc             1578303845
        //   306: ixor           
        //   307: lookupswitch {
        //          -1742654996: 302
        //          1528180653: 332
        //          default: 547
        //        }
        //   332: invokestatic    invokestatic   !!! ERROR
        //   335: ldc             "\u221f\u14b0\u8b18\ub399\uc9ad\uec23\ub236\ue70c\ud96b\ue9f9"
        //   337: invokestatic    invokestatic   !!! ERROR
        //   340: ldc             "\u2210\u149f\u8b24\ub3d6\uc989\uec24\ub264\ue71c\ud967\ue9f8\ua6b7\u1e58\ue02e\uc5e7\u816f\u88ad\u57b0\u7680\ubd2a\uc058\u2ad7\uc233\u6bc7\u2d43\ud79b\u3414\u7d2c\u886e\u8005\u8cde\u8578\ufb3c\u7110\u9a56\u1bcb\uf0ba\u4973\u89b3\uca83\uff7e\ub749\u41f7\ub83e\ub35f\u4c26\u8b64\u7c66\ucfee\u7d0e\uea8c\ue70c\u16ca\uef85\u378b\u46e5\ue03e\u0a57\u8703\u19dc\u0f0b\u76c4\u72cd\uc62e\ubbfa\u9a93\u6bd0\ue2f4\ud1f8\ua52e\u2584\u8827\u4f8f\u8a97\u1438\ua3c9\u7118\u55a9\u1da8\u61c9\u11ce\u89af"
        //   342: invokestatic    invokestatic   !!! ERROR
        //   345: iconst_1       
        //   346: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   349: getstatic       dev/nuker/pyro/fc.0:I
        //   352: ifeq            360
        //   355: ldc             -1946226090
        //   357: goto            362
        //   360: ldc             -1972696420
        //   362: ldc             -1051254247
        //   364: ixor           
        //   365: lookupswitch {
        //          1252642895: 360
        //          1262233733: 392
        //          default: 559
        //        }
        //   392: putfield        dev/nuker/pyro/f7J.1:Ldev/nuker/pyro/f0a;
        //   395: aload_0        
        //   396: new             Ldev/nuker/pyro/f0a;
        //   399: dup            
        //   400: ldc             "\u2223\u149c\u8b3c\ub3d8\uc98a\uec32"
        //   402: invokestatic    invokestatic   !!! ERROR
        //   405: ldc             "\u2203\u149c\u8b3c\ub3d8\uc98a\uec32"
        //   407: invokestatic    invokestatic   !!! ERROR
        //   410: ldc             "\u2210\u149f\u8b24\ub3d6\uc989\uec24\ub264\ue71c\ud967\ue9f8\ua6b7\u1e58\ue02e\uc5e7\u8178\u88a3\u57b0\u76c1\ubd29\uc054\u2a83\uc222\u6bc7\u2d43\ud79d\u3414\u7d3b\u8862\u8005\u8cc9\u8579\ufb72\u7100\u9a1f\u1bcc\uf0be\u493c\u89bd\uca89\uff6f\ub71b\u41b3\ub830\ub35a\u4c3a\u8b2b\u7c7e\ucfa0\u7d45\uea9a\ue710\u16cb\uefd3\u3799\u46ff\ue024\u0a1b\u8711\u1995\u0f16\u76c2\u729b\uc62a\ubbb4\u9a94\u6bcb\ue2f4\ud1e8\ua56d\u259d\u8868\u4fb7\u8abd\u1406\ua38e"
        //   412: invokestatic    invokestatic   !!! ERROR
        //   415: iconst_1       
        //   416: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   419: putfield        dev/nuker/pyro/f7J.2:Ldev/nuker/pyro/f0a;
        //   422: aload_0        
        //   423: aload_0        
        //   424: getstatic       dev/nuker/pyro/fc.0:I
        //   427: ifeq            435
        //   430: ldc             -1677471569
        //   432: goto            437
        //   435: ldc             311908849
        //   437: ldc             -1364922031
        //   439: ixor           
        //   440: lookupswitch {
        //          398254669: 435
        //          849814014: 561
        //          default: 468
        //        }
        //   468: getfield        dev/nuker/pyro/f7J.c:Ldev/nuker/pyro/f0a;
        //   471: invokevirtual   dev/nuker/pyro/f7J.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   474: pop            
        //   475: aload_0        
        //   476: aload_0        
        //   477: getfield        dev/nuker/pyro/f7J.0:Ldev/nuker/pyro/f0a;
        //   480: invokevirtual   dev/nuker/pyro/f7J.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   483: pop            
        //   484: getstatic       dev/nuker/pyro/fc.0:I
        //   487: ifeq            495
        //   490: ldc             1901901005
        //   492: goto            497
        //   495: ldc             -2009736508
        //   497: ldc             -299564700
        //   499: ixor           
        //   500: lookupswitch {
        //          -1619413591: 553
        //          -875535784: 495
        //          default: 528
        //        }
        //   528: aload_0        
        //   529: aload_0        
        //   530: getfield        dev/nuker/pyro/f7J.1:Ldev/nuker/pyro/f0a;
        //   533: invokevirtual   dev/nuker/pyro/f7J.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   536: pop            
        //   537: aload_0        
        //   538: aload_0        
        //   539: getfield        dev/nuker/pyro/f7J.2:Ldev/nuker/pyro/f0a;
        //   542: invokevirtual   dev/nuker/pyro/f7J.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   545: pop            
        //   546: return         
        //   547: aconst_null    
        //   548: athrow         
        //   549: aconst_null    
        //   550: athrow         
        //   551: aconst_null    
        //   552: athrow         
        //   553: aconst_null    
        //   554: athrow         
        //   555: aconst_null    
        //   556: athrow         
        //   557: aconst_null    
        //   558: athrow         
        //   559: aconst_null    
        //   560: athrow         
        //   561: aconst_null    
        //   562: athrow         
        //   563: aconst_null    
        //   564: athrow         
        //    StackMapTable: 00 24 FF 00 1C 00 01 06 00 05 06 07 00 64 07 00 64 07 00 64 01 FF 00 01 00 01 06 00 06 06 07 00 64 07 00 64 07 00 64 01 01 FF 00 1D 00 01 06 00 05 06 07 00 64 07 00 64 07 00 64 01 FF 00 14 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 64 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 64 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 64 FF 00 0F 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 64 07 00 64 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 40 08 00 40 07 00 64 07 00 64 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 64 07 00 64 FF 00 25 00 01 07 00 03 00 05 07 00 03 08 00 B0 08 00 B0 07 00 64 07 00 64 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 B0 08 00 B0 07 00 64 07 00 64 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 08 00 B0 08 00 B0 07 00 64 07 00 64 19 41 01 1B FF 00 11 00 01 07 00 03 00 04 07 00 03 08 01 1D 08 01 1D 07 00 64 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 1D 08 01 1D 07 00 64 01 FF 00 1B 00 01 07 00 03 00 04 07 00 03 08 01 1D 08 01 1D 07 00 64 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 24 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 2A 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 03 1A 41 01 1E FF 00 12 00 01 07 00 03 00 04 07 00 03 08 01 1D 08 01 1D 07 00 64 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 64 07 00 64 01 01 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 64 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 B0 08 00 B0 07 00 64 07 00 64 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 06 00 05 06 07 00 64 07 00 64 07 00 64 01
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
    
    public void c(final float n) {
        fbS.8d(this, 973097805, n);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1027
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1019
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1011
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             41435981
        //    32: goto            37
        //    35: ldc             -1026628966
        //    37: ldc             -565385478
        //    39: ixor           
        //    40: lookupswitch {
        //          -1159059867: 35
        //          -600529481: 990
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/f2T.0:Ldev/nuker/pyro/f2T;
        //    83: if_acmpne       91
        //    86: ldc             516620559
        //    88: goto            93
        //    91: ldc             516620558
        //    93: ldc             -1220624409
        //    95: ixor           
        //    96: tableswitch {
        //          1407942096: 120
        //          1407942097: 975
        //          default: 86
        //        }
        //   120: aload_0        
        //   121: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   124: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   134: goto            138
        //   137: athrow         
        //   138: goto            142
        //   141: athrow         
        //   142: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   145: goto            149
        //   148: athrow         
        //   149: getstatic       dev/nuker/pyro/fc.c:I
        //   152: ifge            160
        //   155: ldc             -1938899641
        //   157: goto            162
        //   160: ldc             -1139719185
        //   162: ldc             1625848252
        //   164: ixor           
        //   165: lookupswitch {
        //          -1554964425: 160
        //          -326712069: 976
        //          default: 192
        //        }
        //   192: astore_2       
        //   193: getstatic       dev/nuker/pyro/fc.1:I
        //   196: ifeq            204
        //   199: ldc             -1524327146
        //   201: goto            206
        //   204: ldc             -1632622903
        //   206: ldc             -1262246323
        //   208: ixor           
        //   209: lookupswitch {
        //          300366683: 204
        //          712212612: 236
        //          default: 986
        //        }
        //   236: aload_0        
        //   237: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   240: getstatic       dev/nuker/pyro/fc.c:I
        //   243: ifge            251
        //   246: ldc             -319369632
        //   248: goto            253
        //   251: ldc             -1050396212
        //   253: ldc             -1638610829
        //   255: ixor           
        //   256: lookupswitch {
        //          1923221011: 998
        //          1958429933: 251
        //          default: 284
        //        }
        //   284: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   287: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   290: getstatic       dev/nuker/pyro/fc.1:I
        //   293: ifeq            301
        //   296: ldc             2096900353
        //   298: goto            303
        //   301: ldc             523756292
        //   303: ldc             198344005
        //   305: ixor           
        //   306: lookupswitch {
        //          350592577: 332
        //          1999524932: 301
        //          default: 1000
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   339: goto            343
        //   342: athrow         
        //   343: goto            347
        //   346: athrow         
        //   347: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   350: goto            354
        //   353: athrow         
        //   354: astore_3       
        //   355: getstatic       dev/nuker/pyro/fc.1:I
        //   358: ifeq            366
        //   361: ldc             159282076
        //   363: goto            368
        //   366: ldc             -1176288208
        //   368: ldc             -507147137
        //   370: ixor           
        //   371: lookupswitch {
        //          -390332445: 366
        //          1478936655: 396
        //          default: 978
        //        }
        //   396: aload_0        
        //   397: getfield        dev/nuker/pyro/f7J.1:Ldev/nuker/pyro/f0a;
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   407: goto            411
        //   410: athrow         
        //   411: checkcast       Ljava/lang/Boolean;
        //   414: getstatic       dev/nuker/pyro/fc.1:I
        //   417: ifeq            425
        //   420: ldc             -1447969809
        //   422: goto            427
        //   425: ldc             604166434
        //   427: ldc             -465179922
        //   429: ixor           
        //   430: lookupswitch {
        //          -911794525: 425
        //          1307857153: 980
        //          default: 456
        //        }
        //   456: goto            460
        //   459: athrow         
        //   460: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   463: goto            467
        //   466: athrow         
        //   467: ifeq            732
        //   470: getstatic       dev/nuker/pyro/fc.1:I
        //   473: ifeq            481
        //   476: ldc             -1887781544
        //   478: goto            483
        //   481: ldc             -354212169
        //   483: ldc             1603692709
        //   485: ixor           
        //   486: lookupswitch {
        //          -789785091: 994
        //          1167151112: 481
        //          default: 512
        //        }
        //   512: aload_0        
        //   513: getfield        dev/nuker/pyro/f7J.0:Ldev/nuker/pyro/f0a;
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   523: goto            527
        //   526: athrow         
        //   527: checkcast       Ljava/lang/Boolean;
        //   530: goto            534
        //   533: athrow         
        //   534: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   537: goto            541
        //   540: athrow         
        //   541: ifeq            732
        //   544: aload_0        
        //   545: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   548: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   551: goto            555
        //   554: athrow         
        //   555: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184587_cr:()Z
        //   558: goto            562
        //   561: athrow         
        //   562: ifeq            732
        //   565: getstatic       dev/nuker/pyro/fc.1:I
        //   568: ifeq            576
        //   571: ldc             -1955061811
        //   573: goto            578
        //   576: ldc             12762542
        //   578: ldc             210065065
        //   580: ixor           
        //   581: lookupswitch {
        //          -2013443740: 988
        //          17023603: 576
        //          default: 608
        //        }
        //   608: aload_0        
        //   609: getstatic       dev/nuker/pyro/fc.c:I
        //   612: ifge            620
        //   615: ldc             2032225594
        //   617: goto            622
        //   620: ldc             -1572944963
        //   622: ldc             532804974
        //   624: ixor           
        //   625: lookupswitch {
        //          -1107347757: 652
        //          1726003284: 620
        //          default: 982
        //        }
        //   652: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   655: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   658: goto            662
        //   661: athrow         
        //   662: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //   665: goto            669
        //   668: athrow         
        //   669: ifne            677
        //   672: ldc             -1562034979
        //   674: goto            679
        //   677: ldc             -1562034978
        //   679: ldc             -1310323992
        //   681: ixor           
        //   682: tableswitch {
        //          637955178: 704
        //          637955179: 732
        //          default: 672
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokestatic    dev/nuker/pyro/fbl.7:()Z
        //   711: goto            715
        //   714: athrow         
        //   715: ifeq            732
        //   718: aload_2        
        //   719: instanceof      Lnet/minecraft/item/ItemFood;
        //   722: ifne            780
        //   725: aload_3        
        //   726: instanceof      Lnet/minecraft/item/ItemFood;
        //   729: ifne            780
        //   732: aload_2        
        //   733: instanceof      Lnet/minecraft/item/ItemBow;
        //   736: ifne            780
        //   739: aload_2        
        //   740: instanceof      Lnet/minecraft/item/ItemPotion;
        //   743: ifeq            751
        //   746: ldc             1177734879
        //   748: goto            753
        //   751: ldc             1177734872
        //   753: ldc             515646180
        //   755: ixor           
        //   756: tableswitch {
        //          -1323444106: 780
        //          -1323444105: 975
        //          default: 746
        //        }
        //   780: aload_0        
        //   781: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   784: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   787: getstatic       dev/nuker/pyro/fc.1:I
        //   790: ifeq            798
        //   793: ldc             1563147942
        //   795: goto            801
        //   798: ldc_w           377616376
        //   801: ldc_w           -1539725619
        //   804: ixor           
        //   805: lookupswitch {
        //          -853533049: 798
        //          -116254613: 992
        //          default: 832
        //        }
        //   832: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   835: new             Lnet/minecraft/network/play/client/CPacketPlayerDigging;
        //   838: dup            
        //   839: getstatic       dev/nuker/pyro/fc.c:I
        //   842: ifge            851
        //   845: ldc_w           -475518183
        //   848: goto            854
        //   851: ldc_w           -1108067144
        //   854: ldc_w           -1046692051
        //   857: ixor           
        //   858: lookupswitch {
        //          573871156: 984
        //          1559823706: 851
        //          default: 884
        //        }
        //   884: getstatic       net/minecraft/network/play/client/CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK:Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
        //   887: getstatic       dev/nuker/pyro/fc.1:I
        //   890: ifeq            899
        //   893: ldc_w           1507174965
        //   896: goto            902
        //   899: ldc_w           214404544
        //   902: ldc_w           1892948068
        //   905: ixor           
        //   906: lookupswitch {
        //          687977041: 899
        //          2081658276: 932
        //          default: 996
        //        }
        //   932: aload_0        
        //   933: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   936: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   939: goto            943
        //   942: athrow         
        //   943: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   946: goto            950
        //   949: athrow         
        //   950: getstatic       net/minecraft/util/EnumFacing.DOWN:Lnet/minecraft/util/EnumFacing;
        //   953: goto            957
        //   956: athrow         
        //   957: invokespecial   net/minecraft/network/play/client/CPacketPlayerDigging.<init>:(Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   960: goto            964
        //   963: athrow         
        //   964: goto            968
        //   967: athrow         
        //   968: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   971: goto            975
        //   974: athrow         
        //   975: return         
        //   976: aconst_null    
        //   977: athrow         
        //   978: aconst_null    
        //   979: athrow         
        //   980: aconst_null    
        //   981: athrow         
        //   982: aconst_null    
        //   983: athrow         
        //   984: aconst_null    
        //   985: athrow         
        //   986: aconst_null    
        //   987: athrow         
        //   988: aconst_null    
        //   989: athrow         
        //   990: aconst_null    
        //   991: athrow         
        //   992: aconst_null    
        //   993: athrow         
        //   994: aconst_null    
        //   995: athrow         
        //   996: aconst_null    
        //   997: athrow         
        //   998: aconst_null    
        //   999: athrow         
        //  1000: aconst_null    
        //  1001: athrow         
        //  1002: pop            
        //  1003: goto            24
        //  1006: pop            
        //  1007: aconst_null    
        //  1008: goto            1002
        //  1011: dup            
        //  1012: ifnull          1002
        //  1015: checkcast       Ljava/lang/Throwable;
        //  1018: athrow         
        //  1019: dup            
        //  1020: ifnull          1006
        //  1023: checkcast       Ljava/lang/Throwable;
        //  1026: athrow         
        //  1027: aconst_null    
        //  1028: athrow         
        //    StackMapTable: 00 86 43 07 00 91 04 FF 00 0B 00 00 00 01 07 00 91 FD 00 03 07 00 03 07 00 96 0A 41 01 1E 43 07 00 91 40 07 00 96 45 07 00 91 40 07 00 9B 05 04 41 01 1A 49 07 00 7F 40 07 00 AC 45 07 00 91 40 07 00 B2 42 07 00 91 40 07 00 B2 45 07 00 91 40 07 01 28 4A 07 01 28 FF 00 01 00 02 07 00 03 07 00 96 00 02 07 01 28 01 5D 07 01 28 FC 00 0B 07 01 28 41 01 1D 4E 07 00 A6 FF 00 01 00 03 07 00 03 07 00 96 07 01 28 00 02 07 00 A6 01 5E 07 00 A6 FF 00 10 00 03 07 00 03 07 00 96 07 01 28 00 02 07 00 AC 07 00 C3 FF 00 01 00 03 07 00 03 07 00 96 07 01 28 00 03 07 00 AC 07 00 C3 01 FF 00 1C 00 03 07 00 03 07 00 96 07 01 28 00 02 07 00 AC 07 00 C3 42 07 00 91 FF 00 00 00 03 07 00 03 07 00 96 07 01 28 00 02 07 00 AC 07 00 C3 45 07 00 91 40 07 00 B2 42 07 00 91 40 07 00 B2 45 07 00 91 40 07 01 28 FC 00 0B 07 01 28 41 01 1B 46 07 00 83 40 07 00 24 45 07 00 91 40 07 01 2A 4D 07 00 D7 FF 00 01 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 02 07 00 D7 01 5C 07 00 D7 42 07 00 91 40 07 00 D7 45 07 00 91 40 01 0D 41 01 1C 46 07 00 91 40 07 00 24 45 07 00 91 40 07 01 2A 45 07 00 91 40 07 00 D7 45 07 00 91 40 01 4C 07 00 91 40 07 00 AC 45 07 00 91 40 01 0D 41 01 1D 4B 07 00 03 FF 00 01 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 02 07 00 03 01 5D 07 00 03 48 07 00 8F 40 07 00 AC 45 07 00 91 40 01 02 04 41 01 18 42 07 00 91 00 45 07 00 91 40 01 10 0D 04 41 01 1A 51 07 00 AC FF 00 02 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 02 07 00 AC 01 5E 07 00 AC FF 00 12 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 03 07 01 22 08 03 43 08 03 43 FF 00 02 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 04 07 01 22 08 03 43 08 03 43 01 FF 00 1D 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 03 07 01 22 08 03 43 08 03 43 FF 00 0E 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 04 07 01 22 08 03 43 08 03 43 07 01 0C FF 00 02 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 05 07 01 22 08 03 43 08 03 43 07 01 0C 01 FF 00 1D 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 04 07 01 22 08 03 43 08 03 43 07 01 0C 49 07 00 8D FF 00 00 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 05 07 01 22 08 03 43 08 03 43 07 01 0C 07 00 AC 45 07 00 91 FF 00 00 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 05 07 01 22 08 03 43 08 03 43 07 01 0C 07 01 2C 45 07 00 91 FF 00 00 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 06 07 01 22 08 03 43 08 03 43 07 01 0C 07 01 2C 07 01 19 45 07 00 91 FF 00 00 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 02 07 01 22 07 01 07 42 07 00 91 FF 00 00 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 02 07 01 22 07 01 07 45 07 00 91 F9 00 00 40 07 01 28 FD 00 01 07 01 28 07 01 28 41 07 00 D7 41 07 00 03 FF 00 01 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 03 07 01 22 08 03 43 08 03 43 FA 00 01 FC 00 01 07 01 28 F9 00 01 FF 00 01 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 01 07 00 AC 01 FF 00 01 00 04 07 00 03 07 00 96 07 01 28 07 01 28 00 04 07 01 22 08 03 43 08 03 43 07 01 0C FF 00 01 00 03 07 00 03 07 00 96 07 01 28 00 01 07 00 A6 FF 00 01 00 03 07 00 03 07 00 96 07 01 28 00 02 07 00 AC 07 00 C3 FF 00 01 00 02 07 00 03 07 00 96 00 01 07 00 91 43 05 44 07 00 91 47 05 47 07 00 91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1011   1019   Ljava/lang/AssertionError;
        //  1011   1019   1011   1019   Ljava/util/NoSuchElementException;
        //  1027   1029   3      8      Any
        //  72     79     79     80     Any
        //  72     79     3      8      Ljava/lang/NumberFormatException;
        //  73     79     79     80     Any
        //  72     79     72     73     Any
        //  72     79     3      8      Ljava/lang/ArithmeticException;
        //  130    137    137    138    Any
        //  131    137    137    138    Ljava/lang/RuntimeException;
        //  130    137    137    138    Ljava/lang/IllegalArgumentException;
        //  130    137    3      8      Ljava/util/ConcurrentModificationException;
        //  130    137    130    131    Ljava/lang/IllegalStateException;
        //  141    148    148    149    Any
        //  141    148    3      8      Ljava/util/ConcurrentModificationException;
        //  141    148    141    142    Ljava/lang/EnumConstantNotPresentException;
        //  142    148    141    142    Any
        //  142    148    148    149    Ljava/lang/NumberFormatException;
        //  335    342    342    343    Any
        //  335    342    335    336    Any
        //  335    342    342    343    Any
        //  335    342    3      8      Ljava/lang/AssertionError;
        //  335    342    342    343    Ljava/lang/IllegalStateException;
        //  346    353    353    354    Any
        //  347    353    353    354    Any
        //  346    353    346    347    Any
        //  346    353    3      8      Ljava/lang/IllegalArgumentException;
        //  347    353    353    354    Ljava/lang/IllegalStateException;
        //  403    410    410    411    Any
        //  404    410    410    411    Ljava/lang/RuntimeException;
        //  404    410    410    411    Any
        //  404    410    403    404    Ljava/lang/NegativeArraySizeException;
        //  403    410    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  459    466    466    467    Any
        //  460    466    459    460    Any
        //  459    466    3      8      Any
        //  460    466    3      8      Any
        //  459    466    3      8      Ljava/lang/IllegalStateException;
        //  519    526    526    527    Any
        //  519    526    519    520    Any
        //  519    526    526    527    Ljava/util/NoSuchElementException;
        //  520    526    526    527    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  519    526    519    520    Ljava/lang/NumberFormatException;
        //  533    540    540    541    Any
        //  534    540    540    541    Ljava/lang/ClassCastException;
        //  533    540    540    541    Ljava/lang/ArithmeticException;
        //  533    540    533    534    Any
        //  534    540    533    534    Ljava/lang/NullPointerException;
        //  554    561    561    562    Any
        //  554    561    554    555    Ljava/lang/StringIndexOutOfBoundsException;
        //  554    561    561    562    Any
        //  554    561    554    555    Any
        //  554    561    561    562    Ljava/lang/UnsupportedOperationException;
        //  661    668    668    669    Any
        //  661    668    3      8      Any
        //  661    668    3      8      Ljava/lang/IllegalArgumentException;
        //  662    668    661    662    Ljava/lang/UnsupportedOperationException;
        //  661    668    668    669    Any
        //  707    714    714    715    Any
        //  707    714    714    715    Any
        //  707    714    707    708    Any
        //  708    714    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  708    714    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  942    949    949    950    Any
        //  943    949    942    943    Ljava/lang/StringIndexOutOfBoundsException;
        //  943    949    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  943    949    3      8      Any
        //  943    949    3      8      Any
        //  956    963    963    964    Any
        //  956    963    963    964    Ljava/lang/RuntimeException;
        //  956    963    956    957    Ljava/lang/NumberFormatException;
        //  957    963    956    957    Any
        //  957    963    963    964    Ljava/lang/ArithmeticException;
        //  967    974    974    975    Any
        //  967    974    3      8      Any
        //  968    974    967    968    Any
        //  968    974    974    975    Any
        //  968    974    3      8      Ljava/lang/EnumConstantNotPresentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 1], but value was: 3.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public void 0(final float n) {
        fbS.8E(this, 617733602, n);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f30 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1737
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1729
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1721
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           -1641187791
        //    34: goto            40
        //    37: ldc_w           -1937367541
        //    40: ldc_w           -1597982080
        //    43: ixor           
        //    44: lookupswitch {
        //          -2075196406: 37
        //          1055771825: 1684
        //          default: 72
        //        }
        //    72: getfield        dev/nuker/pyro/f7J.1:Ldev/nuker/pyro/f0a;
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //    82: goto            86
        //    85: athrow         
        //    86: checkcast       Ljava/lang/Boolean;
        //    89: goto            93
        //    92: athrow         
        //    93: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    96: goto            100
        //    99: athrow         
        //   100: ifeq            1659
        //   103: aload_1        
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            116
        //   110: ldc_w           1787369676
        //   113: goto            119
        //   116: ldc_w           1485493727
        //   119: ldc_w           -1007960271
        //   122: ixor           
        //   123: lookupswitch {
        //          -1453152259: 1702
        //          826449404: 116
        //          default: 148
        //        }
        //   148: goto            152
        //   151: athrow         
        //   152: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   155: goto            159
        //   158: athrow         
        //   159: instanceof      Lnet/minecraft/network/play/client/CPacketClickWindow;
        //   162: ifeq            1659
        //   165: getstatic       dev/nuker/pyro/fc.0:I
        //   168: ifeq            177
        //   171: ldc_w           1981378180
        //   174: goto            180
        //   177: ldc_w           1581433464
        //   180: ldc_w           -613377945
        //   183: ixor           
        //   184: lookupswitch {
        //          -2060297697: 212
        //          -1385564445: 177
        //          default: 1700
        //        }
        //   212: aload_1        
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   dev/nuker/pyro/f30.c:()Ldev/nuker/pyro/f2T;
        //   220: goto            224
        //   223: athrow         
        //   224: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   227: if_acmpne       1117
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            242
        //   236: ldc_w           575050709
        //   239: goto            245
        //   242: ldc_w           -988329921
        //   245: ldc_w           -1356054634
        //   248: ixor           
        //   249: lookupswitch {
        //          -1922388925: 242
        //          1782282153: 276
        //          default: 1704
        //        }
        //   276: aload_0        
        //   277: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   280: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   283: getstatic       dev/nuker/pyro/fc.0:I
        //   286: ifeq            295
        //   289: ldc_w           2023452398
        //   292: goto            298
        //   295: ldc_w           1282138701
        //   298: ldc_w           267431398
        //   301: ixor           
        //   302: lookupswitch {
        //          -1569741870: 295
        //          2003550984: 1682
        //          default: 328
        //        }
        //   328: goto            332
        //   331: athrow         
        //   332: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184585_cz:()Z
        //   335: goto            339
        //   338: athrow         
        //   339: ifeq            348
        //   342: ldc_w           -1262738241
        //   345: goto            351
        //   348: ldc_w           -1262738242
        //   351: ldc_w           601614949
        //   354: ixor           
        //   355: tableswitch {
        //          785358260: 376
        //          785358261: 494
        //          default: 342
        //        }
        //   376: aload_0        
        //   377: getstatic       dev/nuker/pyro/fc.0:I
        //   380: ifeq            389
        //   383: ldc_w           -1237380256
        //   386: goto            392
        //   389: ldc_w           853437302
        //   392: ldc_w           -1125342880
        //   395: ixor           
        //   396: lookupswitch {
        //          -1909274090: 424
        //          181645824: 389
        //          default: 1686
        //        }
        //   424: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   427: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   430: aload_0        
        //   431: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   434: getstatic       dev/nuker/pyro/fc.0:I
        //   437: ifeq            446
        //   440: ldc_w           -1503446567
        //   443: goto            449
        //   446: ldc_w           -1123616976
        //   449: ldc_w           268503123
        //   452: ixor           
        //   453: lookupswitch {
        //          -1235078774: 1678
        //          -1104534144: 446
        //          default: 480
        //        }
        //   480: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   483: goto            487
        //   486: athrow         
        //   487: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78766_c:(Lnet/minecraft/entity/player/EntityPlayer;)V
        //   490: goto            494
        //   493: athrow         
        //   494: getstatic       dev/nuker/pyro/fc.1:I
        //   497: ifeq            506
        //   500: ldc_w           406763756
        //   503: goto            509
        //   506: ldc_w           -2024606187
        //   509: ldc_w           1466741287
        //   512: ixor           
        //   513: lookupswitch {
        //          -1940360920: 506
        //          1330776779: 1680
        //          default: 540
        //        }
        //   540: aload_0        
        //   541: getstatic       dev/nuker/pyro/fc.0:I
        //   544: ifeq            553
        //   547: ldc_w           -284160034
        //   550: goto            556
        //   553: ldc_w           -1503537039
        //   556: ldc_w           1123434384
        //   559: ixor           
        //   560: lookupswitch {
        //          -1377423282: 1660
        //          1337243539: 553
        //          default: 588
        //        }
        //   588: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   591: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   594: goto            598
        //   597: athrow         
        //   598: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //   601: goto            605
        //   604: athrow         
        //   605: ifeq            835
        //   608: getstatic       dev/nuker/pyro/fc.c:I
        //   611: ifge            620
        //   614: ldc_w           897697034
        //   617: goto            623
        //   620: ldc_w           191227301
        //   623: ldc_w           651074637
        //   626: ixor           
        //   627: lookupswitch {
        //          323967303: 620
        //          766212584: 652
        //          default: 1676
        //        }
        //   652: aload_0        
        //   653: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   656: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   659: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   662: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //   665: dup            
        //   666: getstatic       dev/nuker/pyro/fc.1:I
        //   669: ifeq            678
        //   672: ldc_w           -1065234594
        //   675: goto            681
        //   678: ldc_w           -594522056
        //   681: ldc_w           -336634527
        //   684: ixor           
        //   685: lookupswitch {
        //          728666687: 1666
        //          1773975582: 678
        //          default: 712
        //        }
        //   712: aload_0        
        //   713: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   716: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   719: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //   722: getstatic       dev/nuker/pyro/fc.1:I
        //   725: ifeq            734
        //   728: ldc_w           91887460
        //   731: goto            737
        //   734: ldc_w           -1014625044
        //   737: ldc_w           290836085
        //   740: ixor           
        //   741: lookupswitch {
        //          338680081: 1696
        //          1997629799: 734
        //          default: 768
        //        }
        //   768: goto            772
        //   771: athrow         
        //   772: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //   775: goto            779
        //   778: athrow         
        //   779: getstatic       dev/nuker/pyro/fc.1:I
        //   782: ifeq            791
        //   785: ldc_w           1419551038
        //   788: goto            794
        //   791: ldc_w           -457953556
        //   794: ldc_w           826225060
        //   797: ixor           
        //   798: lookupswitch {
        //          1540034118: 791
        //          1705218202: 1672
        //          default: 824
        //        }
        //   824: goto            828
        //   827: athrow         
        //   828: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   831: goto            835
        //   834: athrow         
        //   835: aload_0        
        //   836: getstatic       dev/nuker/pyro/fc.0:I
        //   839: ifeq            848
        //   842: ldc_w           669025927
        //   845: goto            851
        //   848: ldc_w           -208705777
        //   851: ldc_w           -2081737585
        //   854: ixor           
        //   855: lookupswitch {
        //          -1542737400: 848
        //          1885623168: 880
        //          default: 1708
        //        }
        //   880: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   883: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   886: getstatic       dev/nuker/pyro/fc.c:I
        //   889: ifge            898
        //   892: ldc_w           1530294072
        //   895: goto            901
        //   898: ldc_w           917407244
        //   901: ldc_w           1296253343
        //   904: ixor           
        //   905: lookupswitch {
        //          376778407: 898
        //          2079180691: 932
        //          default: 1698
        //        }
        //   932: goto            936
        //   935: athrow         
        //   936: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70051_ag:()Z
        //   939: goto            943
        //   942: athrow         
        //   943: ifeq            952
        //   946: ldc_w           -122103020
        //   949: goto            955
        //   952: ldc_w           -122103029
        //   955: ldc_w           -1979714341
        //   958: ixor           
        //   959: tableswitch {
        //          -493985890: 980
        //          -493985889: 1659
        //          default: 946
        //        }
        //   980: aload_0        
        //   981: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //   984: getstatic       dev/nuker/pyro/fc.1:I
        //   987: ifeq            996
        //   990: ldc_w           1235935199
        //   993: goto            999
        //   996: ldc_w           1024370299
        //   999: ldc_w           1455759961
        //  1002: ixor           
        //  1003: lookupswitch {
        //          527433094: 996
        //          1808499746: 1028
        //          default: 1690
        //        }
        //  1028: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1031: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1034: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1037: dup            
        //  1038: aload_0        
        //  1039: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1042: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1045: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SPRINTING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1048: getstatic       dev/nuker/pyro/fc.1:I
        //  1051: ifeq            1060
        //  1054: ldc_w           1524663930
        //  1057: goto            1063
        //  1060: ldc_w           -778380372
        //  1063: ldc_w           4800810
        //  1066: ixor           
        //  1067: lookupswitch {
        //          -774661498: 1092
        //          1521076048: 1060
        //          default: 1674
        //        }
        //  1092: goto            1096
        //  1095: athrow         
        //  1096: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: goto            1107
        //  1106: athrow         
        //  1107: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1110: goto            1114
        //  1113: athrow         
        //  1114: goto            1659
        //  1117: aload_0        
        //  1118: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1121: getstatic       dev/nuker/pyro/fc.c:I
        //  1124: ifge            1133
        //  1127: ldc_w           506364236
        //  1130: goto            1136
        //  1133: ldc_w           176760076
        //  1136: ldc_w           918764685
        //  1139: ixor           
        //  1140: lookupswitch {
        //          686669249: 1133
        //          1011489153: 1168
        //          default: 1694
        //        }
        //  1168: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1171: getstatic       dev/nuker/pyro/fc.1:I
        //  1174: ifeq            1183
        //  1177: ldc_w           -2092557312
        //  1180: goto            1186
        //  1183: ldc_w           326162913
        //  1186: ldc_w           760971209
        //  1189: ixor           
        //  1190: lookupswitch {
        //          -1373805623: 1692
        //          1277150308: 1183
        //          default: 1216
        //        }
        //  1216: goto            1220
        //  1219: athrow         
        //  1220: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: ifeq            1411
        //  1230: aload_0        
        //  1231: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1234: getstatic       dev/nuker/pyro/fc.1:I
        //  1237: ifeq            1246
        //  1240: ldc_w           -1145314144
        //  1243: goto            1249
        //  1246: ldc_w           432032842
        //  1249: ldc_w           -411724078
        //  1252: ixor           
        //  1253: lookupswitch {
        //          121899491: 1246
        //          1557033586: 1710
        //          default: 1280
        //        }
        //  1280: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1283: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1286: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1289: dup            
        //  1290: aload_0        
        //  1291: getstatic       dev/nuker/pyro/fc.c:I
        //  1294: ifge            1303
        //  1297: ldc_w           1417378563
        //  1300: goto            1306
        //  1303: ldc_w           755123399
        //  1306: ldc_w           -686831508
        //  1309: ixor           
        //  1310: lookupswitch {
        //          -2089503889: 1706
        //          -1251737898: 1303
        //          default: 1336
        //        }
        //  1336: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1339: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1342: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1345: goto            1349
        //  1348: athrow         
        //  1349: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1352: goto            1356
        //  1355: athrow         
        //  1356: getstatic       dev/nuker/pyro/fc.1:I
        //  1359: ifeq            1368
        //  1362: ldc_w           666244493
        //  1365: goto            1371
        //  1368: ldc_w           -1233449850
        //  1371: ldc_w           -1022929386
        //  1374: ixor           
        //  1375: lookupswitch {
        //          -2047223901: 1368
        //          -458144869: 1688
        //          default: 1400
        //        }
        //  1400: goto            1404
        //  1403: athrow         
        //  1404: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1407: goto            1411
        //  1410: athrow         
        //  1411: aload_0        
        //  1412: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1415: getstatic       dev/nuker/pyro/fc.1:I
        //  1418: ifeq            1427
        //  1421: ldc_w           1377247020
        //  1424: goto            1430
        //  1427: ldc_w           1554376830
        //  1430: ldc_w           967474437
        //  1433: ixor           
        //  1434: lookupswitch {
        //          210904997: 1427
        //          1807573545: 1668
        //          default: 1460
        //        }
        //  1460: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1463: getstatic       dev/nuker/pyro/fc.c:I
        //  1466: ifge            1475
        //  1469: ldc_w           -149199473
        //  1472: goto            1478
        //  1475: ldc_w           593718328
        //  1478: ldc_w           26329169
        //  1481: ixor           
        //  1482: lookupswitch {
        //          -334922858: 1475
        //          -158685730: 1662
        //          default: 1508
        //        }
        //  1508: goto            1512
        //  1511: athrow         
        //  1512: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70051_ag:()Z
        //  1515: goto            1519
        //  1518: athrow         
        //  1519: ifeq            1659
        //  1522: aload_0        
        //  1523: getstatic       dev/nuker/pyro/fc.1:I
        //  1526: ifeq            1535
        //  1529: ldc_w           1223677684
        //  1532: goto            1538
        //  1535: ldc_w           -1597816235
        //  1538: ldc_w           633219342
        //  1541: ixor           
        //  1542: lookupswitch {
        //          -2055378085: 1568
        //          1834090490: 1535
        //          default: 1664
        //        }
        //  1568: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1571: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1574: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1577: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1580: dup            
        //  1581: aload_0        
        //  1582: getstatic       dev/nuker/pyro/fc.1:I
        //  1585: ifeq            1594
        //  1588: ldc_w           -523130484
        //  1591: goto            1597
        //  1594: ldc_w           1362204381
        //  1597: ldc_w           588720911
        //  1600: ixor           
        //  1601: lookupswitch {
        //          -1010400637: 1670
        //          1230777720: 1594
        //          default: 1628
        //        }
        //  1628: getfield        dev/nuker/pyro/f7J.c:Lnet/minecraft/client/Minecraft;
        //  1631: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1634: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SPRINTING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1637: goto            1641
        //  1640: athrow         
        //  1641: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: return         
        //  1660: aconst_null    
        //  1661: athrow         
        //  1662: aconst_null    
        //  1663: athrow         
        //  1664: aconst_null    
        //  1665: athrow         
        //  1666: aconst_null    
        //  1667: athrow         
        //  1668: aconst_null    
        //  1669: athrow         
        //  1670: aconst_null    
        //  1671: athrow         
        //  1672: aconst_null    
        //  1673: athrow         
        //  1674: aconst_null    
        //  1675: athrow         
        //  1676: aconst_null    
        //  1677: athrow         
        //  1678: aconst_null    
        //  1679: athrow         
        //  1680: aconst_null    
        //  1681: athrow         
        //  1682: aconst_null    
        //  1683: athrow         
        //  1684: aconst_null    
        //  1685: athrow         
        //  1686: aconst_null    
        //  1687: athrow         
        //  1688: aconst_null    
        //  1689: athrow         
        //  1690: aconst_null    
        //  1691: athrow         
        //  1692: aconst_null    
        //  1693: athrow         
        //  1694: aconst_null    
        //  1695: athrow         
        //  1696: aconst_null    
        //  1697: athrow         
        //  1698: aconst_null    
        //  1699: athrow         
        //  1700: aconst_null    
        //  1701: athrow         
        //  1702: aconst_null    
        //  1703: athrow         
        //  1704: aconst_null    
        //  1705: athrow         
        //  1706: aconst_null    
        //  1707: athrow         
        //  1708: aconst_null    
        //  1709: athrow         
        //  1710: aconst_null    
        //  1711: athrow         
        //  1712: pop            
        //  1713: goto            24
        //  1716: pop            
        //  1717: aconst_null    
        //  1718: goto            1712
        //  1721: dup            
        //  1722: ifnull          1712
        //  1725: checkcast       Ljava/lang/Throwable;
        //  1728: athrow         
        //  1729: dup            
        //  1730: ifnull          1716
        //  1733: checkcast       Ljava/lang/Throwable;
        //  1736: athrow         
        //  1737: aconst_null    
        //  1738: athrow         
        //    StackMapTable: 00 C2 43 07 00 91 04 FF 00 0B 00 00 00 01 07 00 91 FD 00 03 07 00 03 07 01 3B 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 03 01 5F 07 00 03 45 07 00 91 40 07 00 24 45 07 00 91 40 07 01 2A 45 07 00 91 40 07 00 D7 45 07 00 91 40 01 4F 07 01 3B FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 01 3B 01 5C 07 01 3B 42 07 00 79 40 07 01 3B 45 07 00 91 40 07 01 BA 11 42 01 1F 43 07 00 91 40 07 01 3B 45 07 00 91 40 07 00 9B 11 42 01 1E 52 07 00 AC FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 AC 01 5D 07 00 AC 42 07 00 91 40 07 00 AC 45 07 00 91 40 01 02 05 42 01 18 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 03 01 5F 07 00 03 FF 00 15 00 02 07 00 03 07 01 3B 00 02 07 01 5E 07 00 A6 FF 00 02 00 02 07 00 03 07 01 3B 00 03 07 01 5E 07 00 A6 01 FF 00 1E 00 02 07 00 03 07 01 3B 00 02 07 01 5E 07 00 A6 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 5E 07 00 AC 45 07 00 91 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 03 01 5F 07 00 03 48 07 00 91 40 07 00 AC 45 07 00 91 40 01 0E 42 01 1C FF 00 19 00 02 07 00 03 07 01 3B 00 03 07 01 22 08 02 96 08 02 96 FF 00 02 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 02 96 08 02 96 01 FF 00 1E 00 02 07 00 03 07 01 3B 00 03 07 01 22 08 02 96 08 02 96 FF 00 15 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 02 96 08 02 96 07 00 AC 07 01 75 FF 00 02 00 02 07 00 03 07 01 3B 00 06 07 01 22 08 02 96 08 02 96 07 00 AC 07 01 75 01 FF 00 1E 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 02 96 08 02 96 07 00 AC 07 01 75 42 07 00 79 FF 00 00 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 02 96 08 02 96 07 00 AC 07 01 75 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 0B 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 02 00 02 07 00 03 07 01 3B 00 03 07 01 22 07 01 70 01 FF 00 1D 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 42 07 00 75 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 45 07 00 91 00 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 03 01 5C 07 00 03 51 07 00 AC FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 AC 01 5E 07 00 AC 42 07 00 91 40 07 00 AC 45 07 00 91 40 01 02 05 42 01 18 4F 07 00 A6 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 A6 01 5C 07 00 A6 FF 00 1F 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 04 0A 08 04 0A 07 00 AC 07 01 75 FF 00 02 00 02 07 00 03 07 01 3B 00 06 07 01 22 08 04 0A 08 04 0A 07 00 AC 07 01 75 01 FF 00 1C 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 04 0A 08 04 0A 07 00 AC 07 01 75 FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 04 0A 08 04 0A 07 00 AC 07 01 75 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 45 07 00 91 00 02 4F 07 00 A6 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 A6 01 5F 07 00 A6 4E 07 00 AC FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 AC 01 5D 07 00 AC 42 07 00 79 40 07 00 AC 45 07 00 91 40 01 52 07 00 A6 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 A6 01 5E 07 00 A6 FF 00 16 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 05 06 08 05 06 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 05 06 08 05 06 07 00 03 01 FF 00 1D 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 05 06 08 05 06 07 00 03 4B 07 00 79 FF 00 00 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 05 06 08 05 06 07 00 AC 07 01 75 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 0B 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 02 00 02 07 00 03 07 01 3B 00 03 07 01 22 07 01 70 01 FF 00 1C 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 42 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 45 07 00 91 00 4F 07 00 A6 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 A6 01 5D 07 00 A6 4E 07 00 AC FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 AC 01 5D 07 00 AC FF 00 02 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 01 07 00 AC 45 07 00 91 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 02 07 00 03 01 5D 07 00 03 FF 00 19 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 06 29 08 06 29 07 00 03 FF 00 02 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 06 29 08 06 29 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 06 29 08 06 29 07 00 03 FF 00 0B 00 00 00 01 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 06 29 08 06 29 07 00 AC 07 01 75 45 07 00 91 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 42 07 00 83 FF 00 00 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 45 07 00 91 00 40 07 00 03 41 07 00 AC 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 3B 00 03 07 01 22 08 02 96 08 02 96 41 07 00 A6 FF 00 01 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 06 29 08 06 29 07 00 03 FF 00 01 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 FF 00 01 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 04 0A 08 04 0A 07 00 AC 07 01 75 01 FF 00 01 00 02 07 00 03 07 01 3B 00 02 07 01 5E 07 00 A6 01 41 07 00 AC 41 07 00 03 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 3B 00 02 07 01 22 07 01 70 41 07 00 A6 41 07 00 AC 41 07 00 A6 FF 00 01 00 02 07 00 03 07 01 3B 00 05 07 01 22 08 02 96 08 02 96 07 00 AC 07 01 75 41 07 00 AC 01 41 07 01 3B 01 FF 00 01 00 02 07 00 03 07 01 3B 00 04 07 01 22 08 05 06 08 05 06 07 00 03 41 07 00 03 41 07 00 A6 41 07 00 87 43 05 44 07 00 87 47 05 47 07 00 91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1721   1729   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1721   1729   1721   1729   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1737   1739   3      8      Any
        //  78     85     85     86     Any
        //  78     85     78     79     Ljava/lang/UnsupportedOperationException;
        //  78     85     78     79     Any
        //  78     85     3      8      Any
        //  79     85     85     86     Ljava/lang/UnsupportedOperationException;
        //  92     99     99     100    Any
        //  93     99     92     93     Any
        //  92     99     3      8      Ljava/lang/IllegalArgumentException;
        //  93     99     99     100    Ljava/lang/UnsupportedOperationException;
        //  92     99     3      8      Any
        //  151    158    158    159    Any
        //  151    158    158    159    Any
        //  151    158    151    152    Ljava/lang/EnumConstantNotPresentException;
        //  151    158    151    152    Ljava/lang/IllegalArgumentException;
        //  151    158    151    152    Ljava/lang/IndexOutOfBoundsException;
        //  216    223    223    224    Any
        //  216    223    216    217    Ljava/lang/ArithmeticException;
        //  216    223    216    217    Ljava/lang/NullPointerException;
        //  216    223    216    217    Any
        //  217    223    3      8      Ljava/lang/IllegalArgumentException;
        //  331    338    338    339    Any
        //  332    338    331    332    Ljava/lang/IllegalStateException;
        //  331    338    331    332    Any
        //  332    338    331    332    Ljava/lang/RuntimeException;
        //  331    338    331    332    Ljava/lang/StringIndexOutOfBoundsException;
        //  486    493    493    494    Any
        //  487    493    486    487    Ljava/lang/StringIndexOutOfBoundsException;
        //  487    493    486    487    Any
        //  487    493    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  487    493    493    494    Ljava/lang/StringIndexOutOfBoundsException;
        //  597    604    604    605    Any
        //  598    604    604    605    Ljava/lang/NegativeArraySizeException;
        //  598    604    597    598    Any
        //  597    604    604    605    Any
        //  597    604    604    605    Any
        //  771    778    778    779    Any
        //  772    778    778    779    Ljava/lang/StringIndexOutOfBoundsException;
        //  771    778    778    779    Any
        //  772    778    771    772    Ljava/util/NoSuchElementException;
        //  771    778    771    772    Ljava/lang/EnumConstantNotPresentException;
        //  827    834    834    835    Any
        //  828    834    834    835    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  828    834    834    835    Ljava/lang/RuntimeException;
        //  827    834    827    828    Ljava/lang/NumberFormatException;
        //  828    834    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  935    942    942    943    Any
        //  936    942    942    943    Ljava/lang/EnumConstantNotPresentException;
        //  935    942    3      8      Any
        //  935    942    935    936    Any
        //  936    942    942    943    Ljava/lang/IndexOutOfBoundsException;
        //  1096   1102   1102   1103   Any
        //  1096   1102   3      8      Ljava/lang/AssertionError;
        //  1096   1102   1102   1103   Any
        //  1096   1102   3      8      Any
        //  1096   1102   1102   1103   Any
        //  1107   1113   1113   1114   Any
        //  1107   1113   1113   1114   Any
        //  1107   1113   3      8      Any
        //  1107   1113   3      8      Any
        //  1107   1113   3      8      Any
        //  1219   1226   1226   1227   Any
        //  1220   1226   3      8      Ljava/util/NoSuchElementException;
        //  1220   1226   1219   1220   Ljava/lang/IllegalStateException;
        //  1219   1226   1219   1220   Ljava/lang/NullPointerException;
        //  1220   1226   3      8      Any
        //  1348   1355   1355   1356   Any
        //  1349   1355   1355   1356   Any
        //  1349   1355   1348   1349   Ljava/lang/ArithmeticException;
        //  1348   1355   1348   1349   Ljava/lang/UnsupportedOperationException;
        //  1349   1355   3      8      Ljava/lang/IllegalStateException;
        //  1403   1410   1410   1411   Any
        //  1403   1410   1403   1404   Any
        //  1404   1410   3      8      Ljava/lang/RuntimeException;
        //  1404   1410   3      8      Any
        //  1404   1410   1403   1404   Ljava/lang/EnumConstantNotPresentException;
        //  1512   1518   1518   1519   Any
        //  1512   1518   1518   1519   Ljava/lang/NegativeArraySizeException;
        //  1512   1518   3      8      Any
        //  1512   1518   1518   1519   Any
        //  1512   1518   3      8      Any
        //  1641   1647   1647   1648   Any
        //  1641   1647   3      8      Any
        //  1641   1647   3      8      Any
        //  1641   1647   1647   1648   Ljava/lang/ClassCastException;
        //  1641   1647   3      8      Ljava/lang/RuntimeException;
        //  1651   1658   1658   1659   Any
        //  1652   1658   1651   1652   Ljava/lang/NegativeArraySizeException;
        //  1651   1658   1658   1659   Ljava/lang/StringIndexOutOfBoundsException;
        //  1651   1658   1658   1659   Ljava/util/ConcurrentModificationException;
        //  1651   1658   1658   1659   Any
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
    
    @f06
    @LauncherEventHide
    public void c(final f3m f3m) {
        fbS.2b(this, 863756061, f3m);
    }
}
