// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f3N extends f3T
{
    public boolean 1;
    public float 4;
    public float 5;
    
    @Override
    public void 0(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          70
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            62
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            54
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: iload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/f3T.0:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        dev/nuker/pyro/f3N.1:Z
        //    44: return         
        //    45: pop            
        //    46: goto            24
        //    49: pop            
        //    50: aconst_null    
        //    51: goto            45
        //    54: dup            
        //    55: ifnull          45
        //    58: checkcast       Ljava/lang/Throwable;
        //    61: athrow         
        //    62: dup            
        //    63: ifnull          49
        //    66: checkcast       Ljava/lang/Throwable;
        //    69: athrow         
        //    70: aconst_null    
        //    71: athrow         
        //    StackMapTable: 00 0D 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FF 00 03 00 04 07 00 03 01 01 01 00 00 FF 00 06 00 00 00 01 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 18 00 45 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     54     62     Any
        //  54     62     54     62     Any
        //  70     72     3      8      Any
        //  32     38     38     39     Any
        //  32     38     38     39     Any
        //  32     38     38     39     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  32     38     3      8      Any
        //  32     38     3      8      Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 30 out of bounds for length 30
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    public f3N(final f0n p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: fload_2        
        //     3: fload_3        
        //     4: invokespecial   dev/nuker/pyro/f3T.<init>:(Ldev/nuker/pyro/f0n;FF)V
        //     7: getstatic       dev/nuker/pyro/fc.c:I
        //    10: ifge            18
        //    13: ldc             697002116
        //    15: goto            20
        //    18: ldc             711997499
        //    20: ldc             640978167
        //    22: ixor           
        //    23: lookupswitch {
        //          -1867533803: 18
        //          264234099: 643
        //          default: 48
        //        }
        //    48: aload_0        
        //    49: iconst_0       
        //    50: getstatic       dev/nuker/pyro/fc.1:I
        //    53: ifeq            61
        //    56: ldc             -619804359
        //    58: goto            63
        //    61: ldc             1085722804
        //    63: ldc             -1073560860
        //    65: ixor           
        //    66: lookupswitch {
        //          -374682036: 61
        //          453790685: 651
        //          default: 92
        //        }
        //    92: putfield        dev/nuker/pyro/f3N.1:Z
        //    95: aload_0        
        //    96: fconst_0       
        //    97: putfield        dev/nuker/pyro/f3N.4:F
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             1040105464
        //   108: goto            113
        //   111: ldc             -104217188
        //   113: ldc             1819253220
        //   115: ixor           
        //   116: lookupswitch {
        //          -1784259464: 144
        //          1368466972: 111
        //          default: 653
        //        }
        //   144: aload_0        
        //   145: fconst_0       
        //   146: getstatic       dev/nuker/pyro/fc.c:I
        //   149: ifge            157
        //   152: ldc             -94385315
        //   154: goto            159
        //   157: ldc             607122422
        //   159: ldc             -469544403
        //   161: ixor           
        //   162: lookupswitch {
        //          -1070816805: 188
        //          509385072: 157
        //          default: 631
        //        }
        //   188: putfield        dev/nuker/pyro/f3N.5:F
        //   191: getstatic       dev/nuker/pyro/fc.0:I
        //   194: ifeq            202
        //   197: ldc             1787131184
        //   199: goto            204
        //   202: ldc             -1486885877
        //   204: ldc             121554161
        //   206: ixor           
        //   207: lookupswitch {
        //          1786419476: 202
        //          1841017281: 645
        //          default: 232
        //        }
        //   232: aload_1        
        //   233: checkcast       Ldev/nuker/pyro/f0d;
        //   236: astore          4
        //   238: aload_0        
        //   239: invokevirtual   dev/nuker/pyro/f3N.4:()Ljava/util/List;
        //   242: new             Ldev/nuker/pyro/f3X;
        //   245: dup            
        //   246: getstatic       dev/nuker/pyro/fc.0:I
        //   249: ifeq            257
        //   252: ldc             647935881
        //   254: goto            259
        //   257: ldc             -1333733329
        //   259: ldc             96987798
        //   261: ixor           
        //   262: lookupswitch {
        //          -1253625159: 288
        //          593059103: 257
        //          default: 641
        //        }
        //   288: aload_0        
        //   289: aload           4
        //   291: invokevirtual   dev/nuker/pyro/f0d.c:()Ljava/lang/String;
        //   294: fload_2        
        //   295: getstatic       dev/nuker/pyro/fc.c:I
        //   298: ifge            306
        //   301: ldc             1305061036
        //   303: goto            308
        //   306: ldc             522986020
        //   308: ldc             75768395
        //   310: ixor           
        //   311: lookupswitch {
        //          463994991: 336
        //          1229817063: 306
        //          default: 647
        //        }
        //   336: fload_3        
        //   337: invokespecial   dev/nuker/pyro/f3X.<init>:(Ldev/nuker/pyro/f3T;Ljava/lang/String;FF)V
        //   340: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   345: pop            
        //   346: aload_0        
        //   347: invokevirtual   dev/nuker/pyro/f3N.4:()Ljava/util/List;
        //   350: new             Ldev/nuker/pyro/f3M;
        //   353: dup            
        //   354: aload_0        
        //   355: invokespecial   dev/nuker/pyro/f3M.<init>:(Ldev/nuker/pyro/f3T;)V
        //   358: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   363: pop            
        //   364: aload_0        
        //   365: invokevirtual   dev/nuker/pyro/f3N.6:()Ljava/lang/String;
        //   368: getstatic       dev/nuker/pyro/fc.c:I
        //   371: ifge            379
        //   374: ldc             -278694651
        //   376: goto            381
        //   379: ldc             -382397596
        //   381: ldc             -2027843920
        //   383: ixor           
        //   384: lookupswitch {
        //          1749220277: 379
        //          1846844884: 412
        //          default: 637
        //        }
        //   412: astore          5
        //   414: getstatic       dev/nuker/pyro/fc.0:I
        //   417: ifeq            425
        //   420: ldc             100695559
        //   422: goto            427
        //   425: ldc             -1766939009
        //   427: ldc             288472565
        //   429: ixor           
        //   430: lookupswitch {
        //          24236319: 425
        //          389137394: 649
        //          default: 456
        //        }
        //   456: aload           5
        //   458: ifnull          573
        //   461: new             Ljava/lang/StringBuilder;
        //   464: dup            
        //   465: invokespecial   java/lang/StringBuilder.<init>:()V
        //   468: aload           5
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   473: ldc             "\u23c3\u14a7\u8aa8\ub3d0\uc9f5\uedef\ub22b\ue69d\ud97c\ue99c\ua760\u1e42\ue1e9\uc5a4\u8113\u893a\u57e4\u774a\ubd38\uc069\u2b49\uc232\u6a47\u2d5e\ud7e3\u358c\u7d28\u89ef\u8018\u8cb1\u84e2\ufb37\u709b\u9a56\u1ba9\uf120\u4973\u883e\uca82\uff07\ub683\u41b3\ub9ad\ub347\u4c10\u8abf\u7c61\uce69\u7d40\ueae0\ue694\u1698\uee12\u379a\u46c8\ue1a6\u0a57\u8699\u19cd\u0f66\u7757\u7299\uc7e7\ubbac\u9af9\u6a50\ue2f3\ud07c\ua56c"
        //   475: invokestatic    invokestatic   !!! ERROR
        //   478: getstatic       dev/nuker/pyro/fc.1:I
        //   481: ifeq            489
        //   484: ldc             1205523578
        //   486: goto            491
        //   489: ldc             -716223534
        //   491: ldc             -500479465
        //   493: ixor           
        //   494: lookupswitch {
        //          -1510891923: 489
        //          929300933: 520
        //          default: 639
        //        }
        //   520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   523: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   526: getstatic       dev/nuker/pyro/fc.c:I
        //   529: ifge            537
        //   532: ldc             2093172463
        //   534: goto            539
        //   537: ldc             -1309375235
        //   539: ldc             379616201
        //   541: ixor           
        //   542: lookupswitch {
        //          -1487601868: 568
        //          1784888614: 537
        //          default: 635
        //        }
        //   568: astore          5
        //   570: goto            580
        //   573: ldc             "\u239d\u149b\u8aa9\ub3ca\uc9a6\ueda0\ub234\ue699\ud961\ue99a\ua761\u1e0c\ue1aa\uc5a6\u811c\u8974\u57a6\u774d\ubd7d\uc03b\u2b52\uc23c\u6a48\u2d42\ud7b7\u35cf\u7d27\u89ea\u8012\u8cb9\u84ec\ufb36\u70df\u9a1f\u1bae\uf121\u496e\u8828\uca83\uff10\ub6d1\u41e7\ub9b6\ub308\u4c53\u8ab4\u7c68\uce66\u7d49\ueae2\ue6d1\u16d1\uee0f\u37c9\u469c\ue1f5\u0a12\u8684\u19d4\u0f64\u7740\u72cd\uc7b1\ubbbb\u9af4\u6a49\ue2e3\ud038"
        //   575: invokestatic    invokestatic   !!! ERROR
        //   578: astore          5
        //   580: getstatic       dev/nuker/pyro/fc.1:I
        //   583: ifeq            591
        //   586: ldc             1602783101
        //   588: goto            593
        //   591: ldc             -464861423
        //   593: ldc             1595457290
        //   595: ixor           
        //   596: lookupswitch {
        //          -157645102: 591
        //          9451639: 633
        //          default: 624
        //        }
        //   624: aload_0        
        //   625: aload           5
        //   627: invokevirtual   dev/nuker/pyro/f3N.1:(Ljava/lang/String;)V
        //   630: return         
        //   631: aconst_null    
        //   632: athrow         
        //   633: aconst_null    
        //   634: athrow         
        //   635: aconst_null    
        //   636: athrow         
        //   637: aconst_null    
        //   638: athrow         
        //   639: aconst_null    
        //   640: athrow         
        //   641: aconst_null    
        //   642: athrow         
        //   643: aconst_null    
        //   644: athrow         
        //   645: aconst_null    
        //   646: athrow         
        //   647: aconst_null    
        //   648: athrow         
        //   649: aconst_null    
        //   650: athrow         
        //   651: aconst_null    
        //   652: athrow         
        //   653: aconst_null    
        //   654: athrow         
        //    StackMapTable: 00 32 FF 00 12 00 04 07 00 03 07 00 81 02 02 00 00 41 01 1B FF 00 0C 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 81 02 02 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 01 12 41 01 1E FF 00 0C 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 02 FF 00 01 00 04 07 00 03 07 00 81 02 02 00 03 07 00 03 02 01 FF 00 1C 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 02 0D 41 01 1B FF 00 18 00 05 07 00 03 07 00 81 02 02 07 00 39 00 03 07 00 4C 08 00 F2 08 00 F2 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 04 07 00 4C 08 00 F2 08 00 F2 01 FF 00 1C 00 05 07 00 03 07 00 81 02 02 07 00 39 00 03 07 00 4C 08 00 F2 08 00 F2 FF 00 11 00 05 07 00 03 07 00 81 02 02 07 00 39 00 06 07 00 4C 08 00 F2 08 00 F2 07 00 03 07 00 83 02 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 07 07 00 4C 08 00 F2 08 00 F2 07 00 03 07 00 83 02 01 FF 00 1B 00 05 07 00 03 07 00 81 02 02 07 00 39 00 06 07 00 4C 08 00 F2 08 00 F2 07 00 03 07 00 83 02 6A 07 00 83 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 02 07 00 83 01 5E 07 00 83 FC 00 0C 07 00 83 41 01 1C FF 00 20 00 06 07 00 03 07 00 81 02 02 07 00 39 07 00 83 00 02 07 00 60 07 00 83 FF 00 01 00 06 07 00 03 07 00 81 02 02 07 00 39 07 00 83 00 03 07 00 60 07 00 83 01 FF 00 1C 00 06 07 00 03 07 00 81 02 02 07 00 39 07 00 83 00 02 07 00 60 07 00 83 50 07 00 83 FF 00 01 00 06 07 00 03 07 00 81 02 02 07 00 39 07 00 83 00 02 07 00 83 01 5C 07 00 83 04 06 0A 41 01 1E FF 00 06 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 02 FD 00 01 07 00 39 07 00 83 41 07 00 83 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 01 07 00 83 FF 00 01 00 06 07 00 03 07 00 81 02 02 07 00 39 07 00 83 00 02 07 00 60 07 00 83 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 03 07 00 4C 08 00 F2 08 00 F2 FA 00 01 01 FF 00 01 00 05 07 00 03 07 00 81 02 02 07 00 39 00 06 07 00 4C 08 00 F2 08 00 F2 07 00 03 07 00 83 02 FC 00 01 07 00 83 FF 00 01 00 04 07 00 03 07 00 81 02 02 00 02 07 00 03 01 01
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
    
    @Override
    public void c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          545
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            537
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            529
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            36
        //    31: ldc             1268013881
        //    33: goto            38
        //    36: ldc             -1334465469
        //    38: ldc             -1166943008
        //    40: ixor           
        //    41: lookupswitch {
        //          -236615719: 36
        //          168063139: 68
        //          default: 506
        //        }
        //    68: iload_1        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            80
        //    75: ldc             1780278229
        //    77: goto            82
        //    80: ldc             -1605504451
        //    82: ldc             -1660123701
        //    84: ixor           
        //    85: lookupswitch {
        //          -149920226: 80
        //          1027700726: 112
        //          default: 516
        //        }
        //   112: iload_2        
        //   113: iload_3        
        //   114: goto            118
        //   117: athrow         
        //   118: invokespecial   dev/nuker/pyro/f3T.c:(III)V
        //   121: goto            125
        //   124: athrow         
        //   125: iload_3        
        //   126: ifne            266
        //   129: aload_0        
        //   130: iconst_1       
        //   131: putfield        dev/nuker/pyro/f3N.1:Z
        //   134: aload_0        
        //   135: iload_1        
        //   136: i2f            
        //   137: putfield        dev/nuker/pyro/f3N.4:F
        //   140: aload_0        
        //   141: aload_0        
        //   142: getfield        dev/nuker/pyro/f3N.c:Ldev/nuker/pyro/f0n;
        //   145: checkcast       Ldev/nuker/pyro/f0d;
        //   148: getstatic       dev/nuker/pyro/fc.0:I
        //   151: ifeq            159
        //   154: ldc             82607160
        //   156: goto            161
        //   159: ldc             1660863570
        //   161: ldc             1015443210
        //   163: ixor           
        //   164: lookupswitch {
        //          650806801: 159
        //          946475826: 508
        //          default: 192
        //        }
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   199: goto            203
        //   202: athrow         
        //   203: checkcast       Ljava/lang/Double;
        //   206: goto            210
        //   209: athrow         
        //   210: invokevirtual   java/lang/Double.doubleValue:()D
        //   213: goto            217
        //   216: athrow         
        //   217: d2f            
        //   218: getstatic       dev/nuker/pyro/fc.c:I
        //   221: ifge            229
        //   224: ldc             -1755141061
        //   226: goto            231
        //   229: ldc             428648407
        //   231: ldc             -1580484404
        //   233: ixor           
        //   234: lookupswitch {
        //          -393367108: 229
        //          917050615: 510
        //          default: 260
        //        }
        //   260: putfield        dev/nuker/pyro/f3N.5:F
        //   263: goto            503
        //   266: getstatic       dev/nuker/pyro/fc.1:I
        //   269: ifeq            277
        //   272: ldc             1730049871
        //   274: goto            279
        //   277: ldc             -1192048561
        //   279: ldc             1143490233
        //   281: ixor           
        //   282: lookupswitch {
        //          -52785418: 308
        //          590754294: 277
        //          default: 514
        //        }
        //   308: iload_3        
        //   309: iconst_1       
        //   310: if_icmpne       503
        //   313: aload_0        
        //   314: goto            318
        //   317: athrow         
        //   318: invokevirtual   dev/nuker/pyro/f3N.4:()Ljava/util/List;
        //   321: goto            325
        //   324: athrow         
        //   325: getstatic       dev/nuker/pyro/fc.1:I
        //   328: ifeq            336
        //   331: ldc             698263733
        //   333: goto            338
        //   336: ldc             -720482991
        //   338: ldc             -1531032071
        //   340: ixor           
        //   341: lookupswitch {
        //          -1927223988: 336
        //          1907359912: 368
        //          default: 512
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokeinterface java/util/List.isEmpty:()Z
        //   377: goto            381
        //   380: athrow         
        //   381: ifne            503
        //   384: aload_0        
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            396
        //   391: ldc             558442991
        //   393: goto            398
        //   396: ldc             1394587848
        //   398: ldc             -1278729080
        //   400: ixor           
        //   401: lookupswitch {
        //          -1837036185: 396
        //          -522740672: 428
        //          default: 518
        //        }
        //   428: aload_0        
        //   429: goto            433
        //   432: athrow         
        //   433: invokevirtual   dev/nuker/pyro/f3N.0:()Z
        //   436: goto            440
        //   439: athrow         
        //   440: ifne            447
        //   443: iconst_1       
        //   444: goto            448
        //   447: iconst_0       
        //   448: getstatic       dev/nuker/pyro/fc.c:I
        //   451: ifge            459
        //   454: ldc             32914442
        //   456: goto            461
        //   459: ldc             -929266398
        //   461: ldc             1492216710
        //   463: ixor           
        //   464: lookupswitch {
        //          -1871843676: 492
        //          1493653388: 459
        //          default: 504
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   dev/nuker/pyro/f3N.c:(Z)V
        //   499: goto            503
        //   502: athrow         
        //   503: return         
        //   504: aconst_null    
        //   505: athrow         
        //   506: aconst_null    
        //   507: athrow         
        //   508: aconst_null    
        //   509: athrow         
        //   510: aconst_null    
        //   511: athrow         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: aconst_null    
        //   517: athrow         
        //   518: aconst_null    
        //   519: athrow         
        //   520: pop            
        //   521: goto            24
        //   524: pop            
        //   525: aconst_null    
        //   526: goto            520
        //   529: dup            
        //   530: ifnull          520
        //   533: checkcast       Ljava/lang/Throwable;
        //   536: athrow         
        //   537: dup            
        //   538: ifnull          524
        //   541: checkcast       Ljava/lang/Throwable;
        //   544: athrow         
        //   545: aconst_null    
        //   546: athrow         
        //    StackMapTable: 00 48 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FF 00 03 00 04 07 00 03 01 01 01 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 07 00 03 01 44 07 00 89 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 18 00 FF 00 21 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 39 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 07 00 39 01 FF 00 1E 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 39 42 07 00 85 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 39 45 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 CD 45 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 AF 45 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 03 FF 00 0B 00 04 07 00 03 01 01 01 00 02 07 00 03 02 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 02 01 FF 00 1C 00 04 07 00 03 01 01 01 00 02 07 00 03 02 05 0A 41 01 1C 48 07 00 91 40 07 00 03 45 07 00 18 40 07 00 4C 4A 07 00 4C FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 4C 01 5D 07 00 4C 42 07 00 18 40 07 00 4C 47 07 00 18 40 01 4E 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 43 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 03 45 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 01 46 07 00 03 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 0A 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 01 45 07 00 18 00 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 07 00 39 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 02 41 07 00 4C 01 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 41 07 00 03 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     529    537    Any
        //  529    537    529    537    Any
        //  545    547    3      8      Any
        //  117    124    124    125    Any
        //  118    124    117    118    Ljava/lang/NumberFormatException;
        //  118    124    117    118    Ljava/lang/NullPointerException;
        //  117    124    124    125    Any
        //  118    124    117    118    Ljava/lang/RuntimeException;
        //  195    202    202    203    Any
        //  196    202    202    203    Ljava/lang/NullPointerException;
        //  196    202    195    196    Ljava/lang/NumberFormatException;
        //  195    202    202    203    Ljava/lang/EnumConstantNotPresentException;
        //  196    202    202    203    Ljava/lang/RuntimeException;
        //  209    216    216    217    Any
        //  209    216    209    210    Ljava/lang/IllegalArgumentException;
        //  209    216    209    210    Any
        //  209    216    209    210    Ljava/lang/StringIndexOutOfBoundsException;
        //  210    216    209    210    Any
        //  317    324    324    325    Any
        //  318    324    324    325    Ljava/lang/NumberFormatException;
        //  318    324    317    318    Ljava/lang/AssertionError;
        //  317    324    3      8      Ljava/lang/IllegalArgumentException;
        //  318    324    3      8      Ljava/util/ConcurrentModificationException;
        //  371    380    380    381    Any
        //  371    380    380    381    Any
        //  371    380    371    372    Ljava/lang/RuntimeException;
        //  372    380    380    381    Ljava/lang/IndexOutOfBoundsException;
        //  372    380    371    372    Any
        //  432    439    439    440    Any
        //  432    439    432    433    Any
        //  433    439    3      8      Ljava/lang/ArithmeticException;
        //  433    439    432    433    Ljava/util/NoSuchElementException;
        //  433    439    432    433    Ljava/lang/EnumConstantNotPresentException;
        //  496    502    502    503    Any
        //  496    502    3      8      Ljava/lang/ClassCastException;
        //  496    502    502    503    Any
        //  496    502    502    503    Ljava/lang/ClassCastException;
        //  496    502    3      8      Ljava/lang/AssertionError;
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
    
    static {
        throw t;
    }
    
    @Override
    public String 7() {
        return fbS.4V(this, 639558697);
    }
    
    @Override
    public boolean c(final float n, final float n2, final float n3) {
        return fbS.h(this, 268658305, n, n2, n3);
    }
}
