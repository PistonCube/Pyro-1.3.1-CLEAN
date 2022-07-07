// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum fa9
{
    public static fa9 c;
    public static fa9 0;
    public static fa9 1;
    public static fa9[] c;
    
    public static fa9 c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/fa9;.class
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             1862961932
        //    34: goto            39
        //    37: ldc             183856964
        //    39: ldc             -451267100
        //    41: ixor           
        //    42: lookupswitch {
        //          -1978614040: 37
        //          -269526368: 68
        //          default: 84
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/fa9;
        //    83: areturn        
        //    84: aconst_null    
        //    85: athrow         
        //    86: pop            
        //    87: goto            24
        //    90: pop            
        //    91: aconst_null    
        //    92: goto            86
        //    95: dup            
        //    96: ifnull          86
        //    99: checkcast       Ljava/lang/Throwable;
        //   102: athrow         
        //   103: dup            
        //   104: ifnull          90
        //   107: checkcast       Ljava/lang/Throwable;
        //   110: athrow         
        //   111: aconst_null    
        //   112: athrow         
        //    StackMapTable: 00 11 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FC 00 03 07 00 21 4C 07 00 23 FF 00 01 00 01 07 00 21 00 02 07 00 23 01 5C 07 00 23 43 07 00 16 FF 00 00 00 01 07 00 21 00 02 07 00 23 07 00 21 45 07 00 16 40 07 00 05 43 07 00 23 41 07 00 16 43 05 44 07 00 16 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     95     103    Any
        //  95     103    95     103    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  111    113    3      8      Any
        //  72     79     79     80     Any
        //  73     79     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  72     79     79     80     Ljava/lang/IllegalArgumentException;
        //  72     79     72     73     Any
        //  72     79     72     73     Any
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/fa9;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/fa9;
        //    10: dup            
        //    11: ldc             "\u2902\u1496\u8022\ubf06"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/fa9.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/fa9.c:Ldev/nuker/pyro/fa9;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/fa9;
        //    30: dup            
        //    31: ldc             "\u2908\u149c\u8027\ubf1b"
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: iconst_1       
        //    37: getstatic       dev/nuker/pyro/fc.0:I
        //    40: ifeq            48
        //    43: ldc             -600810923
        //    45: goto            50
        //    48: ldc             -970337392
        //    50: ldc             1450212652
        //    52: ixor           
        //    53: lookupswitch {
        //          -1975507079: 48
        //          -1873170756: 80
        //          default: 158
        //        }
        //    80: invokespecial   dev/nuker/pyro/fa9.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: putstatic       dev/nuker/pyro/fa9.0:Ldev/nuker/pyro/fa9;
        //    87: aastore        
        //    88: dup            
        //    89: iconst_2       
        //    90: new             Ldev/nuker/pyro/fa9;
        //    93: dup            
        //    94: ldc             "\u290c\u1496\u8026\ubf16"
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: iconst_2       
        //   100: invokespecial   dev/nuker/pyro/fa9.<init>:(Ljava/lang/String;I)V
        //   103: dup            
        //   104: putstatic       dev/nuker/pyro/fa9.1:Ldev/nuker/pyro/fa9;
        //   107: aastore        
        //   108: getstatic       dev/nuker/pyro/fc.0:I
        //   111: ifeq            119
        //   114: ldc             297691512
        //   116: goto            121
        //   119: ldc             -1813155592
        //   121: ldc             1421332020
        //   123: ixor           
        //   124: lookupswitch {
        //          1158260556: 156
        //          1437724110: 119
        //          default: 152
        //        }
        //   152: putstatic       dev/nuker/pyro/fa9.c:[Ldev/nuker/pyro/fa9;
        //   155: return         
        //   156: aconst_null    
        //   157: athrow         
        //   158: aconst_null    
        //   159: athrow         
        //    StackMapTable: 00 08 FF 00 30 00 00 00 08 07 00 2E 07 00 2E 07 00 2E 01 08 00 1B 08 00 1B 07 00 21 01 FF 00 01 00 00 00 09 07 00 2E 07 00 2E 07 00 2E 01 08 00 1B 08 00 1B 07 00 21 01 01 FF 00 1D 00 00 00 08 07 00 2E 07 00 2E 07 00 2E 01 08 00 1B 08 00 1B 07 00 21 01 FF 00 26 00 00 00 02 07 00 2E 07 00 2E FF 00 01 00 00 00 03 07 00 2E 07 00 2E 01 FF 00 1E 00 00 00 02 07 00 2E 07 00 2E FF 00 03 00 00 00 02 07 00 2E 07 00 2E FF 00 01 00 00 00 08 07 00 2E 07 00 2E 07 00 2E 01 08 00 1B 08 00 1B 07 00 21 01
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
    
    public fa9(final String name, final int ordinal) {
        while (true) {
            Label_0015: {
                if (fc.1 != 0) {
                    n = 934076090;
                    break Label_0015;
                }
                n = -731676662;
            }
            switch (n ^ 0x904AE185) {
                case -1478082753: {
                    continue;
                }
                case 1143562639: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.c < 0) {
                                n2 = -1707517071;
                                break Label_0058;
                            }
                            n2 = -874262284;
                        }
                        switch (n2 ^ 0x8247E58) {
                            case -1843583703: {
                                continue;
                            }
                            case -1010323796: {
                                super(name, ordinal);
                                return;
                            }
                            default: {
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
}
