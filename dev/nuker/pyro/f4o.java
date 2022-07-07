// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f4O
{
    public static f4O c;
    public static f4O 0;
    public static f4O 1;
    public static f4O[] c;
    
    public static f4O c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          67
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f4O;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f4O;
        //    41: areturn        
        //    42: pop            
        //    43: goto            24
        //    46: pop            
        //    47: aconst_null    
        //    48: goto            42
        //    51: dup            
        //    52: ifnull          42
        //    55: checkcast       Ljava/lang/Throwable;
        //    58: athrow         
        //    59: dup            
        //    60: ifnull          46
        //    63: checkcast       Ljava/lang/Throwable;
        //    66: athrow         
        //    67: aconst_null    
        //    68: athrow         
        //    StackMapTable: 00 0D 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FC 00 03 07 00 22 45 07 00 24 FF 00 00 00 01 07 00 22 00 02 07 00 26 07 00 22 45 07 00 1C 40 07 00 05 43 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Ljava/lang/IllegalArgumentException;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  30     37     30     31     Ljava/lang/EnumConstantNotPresentException;
        //  30     37     3      8      Ljava/lang/UnsupportedOperationException;
        //  30     37     30     31     Ljava/lang/ArithmeticException;
        //  30     37     3      8      Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 23 out of bounds for length 23
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/f4O;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f4O;
        //    10: dup            
        //    11: ldc             "\u23a7\u14bc\u8aae\ubf27"
        //    13: getstatic       dev/nuker/pyro/fc.1:I
        //    16: ifeq            24
        //    19: ldc             1041118630
        //    21: goto            26
        //    24: ldc             -1034079235
        //    26: ldc             926725357
        //    28: ixor           
        //    29: lookupswitch {
        //          154304843: 376
        //          668511223: 24
        //          default: 56
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: iconst_0       
        //    60: getstatic       dev/nuker/pyro/fc.0:I
        //    63: ifeq            71
        //    66: ldc             2130515728
        //    68: goto            73
        //    71: ldc             -778023218
        //    73: ldc             710022726
        //    75: ixor           
        //    76: lookupswitch {
        //          -68003704: 104
        //          1420755286: 71
        //          default: 384
        //        }
        //   104: invokespecial   dev/nuker/pyro/f4O.<init>:(Ljava/lang/String;I)V
        //   107: dup            
        //   108: getstatic       dev/nuker/pyro/fc.c:I
        //   111: ifge            119
        //   114: ldc             262734068
        //   116: goto            121
        //   119: ldc             468056693
        //   121: ldc             1724425838
        //   123: ixor           
        //   124: lookupswitch {
        //          1768007322: 119
        //          2100124699: 152
        //          default: 382
        //        }
        //   152: putstatic       dev/nuker/pyro/f4O.c:Ldev/nuker/pyro/f4O;
        //   155: aastore        
        //   156: dup            
        //   157: iconst_1       
        //   158: new             Ldev/nuker/pyro/f4O;
        //   161: dup            
        //   162: ldc             "\u23aa\u14bf\u8aa9\ubf27\ufd91\uedbb\ub217\ue684\ud597\udde9"
        //   164: getstatic       dev/nuker/pyro/fc.1:I
        //   167: ifeq            175
        //   170: ldc             -1441049527
        //   172: goto            177
        //   175: ldc             1753828346
        //   177: ldc             567081228
        //   179: ixor           
        //   180: lookupswitch {
        //          -1948799675: 378
        //          1277494811: 175
        //          default: 208
        //        }
        //   208: invokestatic    invokestatic   !!! ERROR
        //   211: iconst_1       
        //   212: invokespecial   dev/nuker/pyro/f4O.<init>:(Ljava/lang/String;I)V
        //   215: dup            
        //   216: getstatic       dev/nuker/pyro/fc.1:I
        //   219: ifeq            227
        //   222: ldc             1919897751
        //   224: goto            229
        //   227: ldc             -917441006
        //   229: ldc             -760746876
        //   231: ixor           
        //   232: lookupswitch {
        //          -1597457389: 227
        //          469179030: 260
        //          default: 388
        //        }
        //   260: putstatic       dev/nuker/pyro/f4O.0:Ldev/nuker/pyro/f4O;
        //   263: aastore        
        //   264: dup            
        //   265: iconst_2       
        //   266: new             Ldev/nuker/pyro/f4O;
        //   269: dup            
        //   270: ldc             "\u23ba\u14b6\u8ab2\ubf34\ufd9a\uedbd\ub217\ue684\ud597\udde9"
        //   272: getstatic       dev/nuker/pyro/fc.0:I
        //   275: ifeq            283
        //   278: ldc             494070738
        //   280: goto            285
        //   283: ldc             -1069960596
        //   285: ldc             256341468
        //   287: ixor           
        //   288: lookupswitch {
        //          -813774928: 316
        //          305503758: 283
        //          default: 386
        //        }
        //   316: invokestatic    invokestatic   !!! ERROR
        //   319: iconst_2       
        //   320: getstatic       dev/nuker/pyro/fc.c:I
        //   323: ifge            331
        //   326: ldc             -319773780
        //   328: goto            333
        //   331: ldc             1407763728
        //   333: ldc             1424819954
        //   335: ixor           
        //   336: lookupswitch {
        //          -1206016674: 380
        //          -638049189: 331
        //          default: 364
        //        }
        //   364: invokespecial   dev/nuker/pyro/f4O.<init>:(Ljava/lang/String;I)V
        //   367: dup            
        //   368: putstatic       dev/nuker/pyro/f4O.1:Ldev/nuker/pyro/f4O;
        //   371: aastore        
        //   372: putstatic       dev/nuker/pyro/f4O.c:[Ldev/nuker/pyro/f4O;
        //   375: return         
        //   376: aconst_null    
        //   377: athrow         
        //   378: aconst_null    
        //   379: athrow         
        //   380: aconst_null    
        //   381: athrow         
        //   382: aconst_null    
        //   383: athrow         
        //   384: aconst_null    
        //   385: athrow         
        //   386: aconst_null    
        //   387: athrow         
        //   388: aconst_null    
        //   389: athrow         
        //    StackMapTable: 00 1C FF 00 18 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 FF 00 01 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 01 FF 00 1D 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 FF 00 0E 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 01 FF 00 01 00 00 00 09 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 01 01 FF 00 1E 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 01 FF 00 0E 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 FF 00 16 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 9E 08 00 9E 07 00 22 FF 00 01 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 00 9E 08 00 9E 07 00 22 01 FF 00 1E 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 9E 08 00 9E 07 00 22 FF 00 12 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 FF 00 16 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 FF 00 01 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 01 FF 00 1E 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 FF 00 0E 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 01 FF 00 01 00 00 00 09 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 01 01 FF 00 1E 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 01 FF 00 0B 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 FF 00 01 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 00 9E 08 00 9E 07 00 22 FF 00 01 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 01 FF 00 01 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03 FF 00 01 00 00 00 08 07 00 59 07 00 59 07 00 59 01 08 00 07 08 00 07 07 00 22 01 FF 00 01 00 00 00 07 07 00 59 07 00 59 07 00 59 01 08 01 0A 08 01 0A 07 00 22 FF 00 01 00 00 00 06 07 00 59 07 00 59 07 00 59 01 07 00 03 07 00 03
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
    
    public f4O(final String name, final int ordinal) {
        while (true) {
            Label_0014: {
                if (fc.1 != 0) {
                    n = 1787494388;
                    break Label_0014;
                }
                n = -193506648;
            }
            switch (n ^ 0x332831EE) {
                case 243557839: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.1 != 0) {
                                n2 = -267947597;
                                break Label_0058;
                            }
                            n2 = 1202294507;
                        }
                        switch (n2 ^ 0x54503570) {
                            case -684412560: {
                                continue;
                            }
                            default: {
                                super(name, ordinal);
                                return;
                            }
                            case -1537784637: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1503841818: {
                    throw null;
                }
            }
            break;
        }
    }
}
