// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f9W
{
    public static f9W c;
    public static f9W 0;
    public static f9W 1;
    public static f9W[] c;
    
    public f9W(final String name, final int ordinal) {
        while (true) {
            Label_0015: {
                if (fc.c < 0) {
                    n = -2003662757;
                    break Label_0015;
                }
                n = -518158476;
            }
            switch (n ^ 0x20CF32BE) {
                case -1470252315: {
                    continue;
                }
                case -1043155510: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.c < 0) {
                                n2 = -1167981274;
                                break Label_0058;
                            }
                            n2 = -1341820526;
                        }
                        switch (n2 ^ 0xE2B31850) {
                            case 324467152: {
                                continue;
                            }
                            default: {
                                super(name, ordinal);
                                return;
                            }
                            case 1490099574: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/f9W;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f9W;
        //    10: dup            
        //    11: ldc             "\u2243\u1495\u8b7b"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/f9W.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/f9W.c:Ldev/nuker/pyro/f9W;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/f9W;
        //    30: dup            
        //    31: ldc             "\u2244\u149a\u8b79\ubf07"
        //    33: getstatic       dev/nuker/pyro/fc.c:I
        //    36: ifge            44
        //    39: ldc             -729009708
        //    41: goto            46
        //    44: ldc             -1557051261
        //    46: ldc             -1940776599
        //    48: ixor           
        //    49: lookupswitch {
        //          -161329627: 44
        //          1490954429: 246
        //          default: 76
        //        }
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/f9W.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: getstatic       dev/nuker/pyro/fc.c:I
        //    87: ifge            95
        //    90: ldc             -2013513316
        //    92: goto            97
        //    95: ldc             2056720402
        //    97: ldc             -1733365561
        //    99: ixor           
        //   100: lookupswitch {
        //          -499523371: 128
        //          525519195: 95
        //          default: 248
        //        }
        //   128: putstatic       dev/nuker/pyro/f9W.0:Ldev/nuker/pyro/f9W;
        //   131: aastore        
        //   132: dup            
        //   133: iconst_2       
        //   134: new             Ldev/nuker/pyro/f9W;
        //   137: dup            
        //   138: ldc             "\u225e\u1496\u8b70\ubf0d\ufd0a\uec6f"
        //   140: getstatic       dev/nuker/pyro/fc.0:I
        //   143: ifeq            151
        //   146: ldc             -1223731937
        //   148: goto            153
        //   151: ldc             -1596841517
        //   153: ldc             -1279263019
        //   155: ixor           
        //   156: lookupswitch {
        //          78687178: 151
        //          325967622: 184
        //          default: 250
        //        }
        //   184: invokestatic    invokestatic   !!! ERROR
        //   187: iconst_2       
        //   188: invokespecial   dev/nuker/pyro/f9W.<init>:(Ljava/lang/String;I)V
        //   191: dup            
        //   192: getstatic       dev/nuker/pyro/fc.1:I
        //   195: ifeq            203
        //   198: ldc             687194582
        //   200: goto            205
        //   203: ldc             1588721361
        //   205: ldc             2021086181
        //   207: ixor           
        //   208: lookupswitch {
        //          650552628: 236
        //          1350734387: 203
        //          default: 244
        //        }
        //   236: putstatic       dev/nuker/pyro/f9W.1:Ldev/nuker/pyro/f9W;
        //   239: aastore        
        //   240: putstatic       dev/nuker/pyro/f9W.c:[Ldev/nuker/pyro/f9W;
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: aconst_null    
        //   251: athrow         
        //    StackMapTable: 00 10 FF 00 2C 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 1B 08 00 1B 07 00 1B FF 00 01 00 00 00 08 07 00 42 07 00 42 07 00 42 01 08 00 1B 08 00 1B 07 00 1B 01 FF 00 1D 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 1B 08 00 1B 07 00 1B FF 00 12 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 16 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 86 08 00 86 07 00 1B FF 00 01 00 00 00 08 07 00 42 07 00 42 07 00 42 01 08 00 86 08 00 86 07 00 1B 01 FF 00 1E 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 86 08 00 86 07 00 1B FF 00 12 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 07 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 1B 08 00 1B 07 00 1B FF 00 01 00 00 00 06 07 00 42 07 00 42 07 00 42 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 42 07 00 42 07 00 42 01 08 00 86 08 00 86 07 00 1B
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
    
    public static f9W c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f9W;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -464545821
        //    35: goto            40
        //    38: ldc             926176443
        //    40: ldc             1455033617
        //    42: ixor           
        //    43: lookupswitch {
        //          -1292526862: 38
        //          1636719018: 68
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f9W;
        //    82: areturn        
        //    83: aconst_null    
        //    84: athrow         
        //    85: pop            
        //    86: goto            24
        //    89: pop            
        //    90: aconst_null    
        //    91: goto            85
        //    94: dup            
        //    95: ifnull          85
        //    98: checkcast       Ljava/lang/Throwable;
        //   101: athrow         
        //   102: dup            
        //   103: ifnull          89
        //   106: checkcast       Ljava/lang/Throwable;
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //    StackMapTable: 00 11 43 07 00 52 04 FF 00 0B 00 00 00 01 07 00 4C FC 00 03 07 00 1B FF 00 0D 00 01 07 00 1B 00 02 07 00 62 07 00 1B FF 00 01 00 01 07 00 1B 00 03 07 00 62 07 00 1B 01 FF 00 1B 00 01 07 00 1B 00 02 07 00 62 07 00 1B 42 07 00 4C FF 00 00 00 01 07 00 1B 00 02 07 00 62 07 00 1B 45 07 00 4C 40 07 00 05 FF 00 03 00 01 07 00 1B 00 02 07 00 62 07 00 1B 41 07 00 4C 43 05 44 07 00 4C 47 05 47 07 00 52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Ljava/lang/EnumConstantNotPresentException;
        //  110    112    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  71     78     78     79     Any
        //  72     78     71     72     Ljava/lang/UnsupportedOperationException;
        //  72     78     71     72     Any
        //  72     78     3      8      Ljava/lang/RuntimeException;
        //  72     78     78     79     Ljava/lang/ClassCastException;
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
