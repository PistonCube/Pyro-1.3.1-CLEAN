// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum fat
{
    public static fat c;
    public static fat 0;
    public static fat[] c;
    
    public static fat c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          67
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/fat;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/fat;
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
        //    StackMapTable: 00 0D 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FC 00 03 07 00 2E 45 07 00 16 FF 00 00 00 01 07 00 2E 00 02 07 00 30 07 00 2E 45 07 00 16 40 07 00 05 43 07 00 24 43 05 44 07 00 24 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Ljava/lang/StringIndexOutOfBoundsException;
        //  51     59     51     59     Ljava/lang/IndexOutOfBoundsException;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     3      8      Ljava/lang/ArithmeticException;
        //  31     37     37     38     Any
        //  31     37     30     31     Any
        //  31     37     3      8      Any
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/fat;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/fat;
        //    10: dup            
        //    11: ldc             "\u2953\u14b6\u8044\ubf2d\ufa20"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: getstatic       dev/nuker/pyro/fc.1:I
        //    20: ifeq            28
        //    23: ldc             2045711778
        //    25: goto            30
        //    28: ldc             1488453287
        //    30: ldc             -2101124481
        //    32: ixor           
        //    33: lookupswitch {
        //          -80971811: 136
        //          1980392832: 28
        //          default: 60
        //        }
        //    60: invokespecial   dev/nuker/pyro/fat.<init>:(Ljava/lang/String;I)V
        //    63: dup            
        //    64: putstatic       dev/nuker/pyro/fat.c:Ldev/nuker/pyro/fat;
        //    67: aastore        
        //    68: dup            
        //    69: iconst_1       
        //    70: new             Ldev/nuker/pyro/fat;
        //    73: dup            
        //    74: ldc             "\u2958\u14bd\u8044\ubf2b\ufa39\ue752"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: getstatic       dev/nuker/pyro/fc.1:I
        //    83: ifeq            91
        //    86: ldc             131607909
        //    88: goto            93
        //    91: ldc             1949146310
        //    93: ldc             416740290
        //    95: ixor           
        //    96: lookupswitch {
        //          521068199: 91
        //          1828417284: 124
        //          default: 138
        //        }
        //   124: invokespecial   dev/nuker/pyro/fat.<init>:(Ljava/lang/String;I)V
        //   127: dup            
        //   128: putstatic       dev/nuker/pyro/fat.0:Ldev/nuker/pyro/fat;
        //   131: aastore        
        //   132: putstatic       dev/nuker/pyro/fat.c:[Ldev/nuker/pyro/fat;
        //   135: return         
        //   136: aconst_null    
        //   137: athrow         
        //   138: aconst_null    
        //   139: athrow         
        //    StackMapTable: 00 08 FF 00 1C 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 07 08 00 07 07 00 2E 01 FF 00 01 00 00 00 09 07 00 19 07 00 19 07 00 19 01 08 00 07 08 00 07 07 00 2E 01 01 FF 00 1D 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 07 08 00 07 07 00 2E 01 FF 00 1E 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 46 08 00 46 07 00 2E 01 FF 00 01 00 00 00 09 07 00 19 07 00 19 07 00 19 01 08 00 46 08 00 46 07 00 2E 01 01 FF 00 1E 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 46 08 00 46 07 00 2E 01 FF 00 0B 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 07 08 00 07 07 00 2E 01 FF 00 01 00 00 00 08 07 00 19 07 00 19 07 00 19 01 08 00 46 08 00 46 07 00 2E 01
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
    
    public fat(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.c < 0) {
                    n = 2107060311;
                    break Label_0013;
                }
                n = -2092230583;
            }
            switch (n ^ 0x9E235C26) {
                case -474715023: {
                    continue;
                }
                case 493372527: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.1 != 0) {
                                n2 = -1376566009;
                                break Label_0060;
                            }
                            n2 = -2118517610;
                        }
                        switch (n2 ^ 0x11679481) {
                            case -1131097722: {
                                continue;
                            }
                            case -1864472553: {
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
