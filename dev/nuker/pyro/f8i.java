// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f8I
{
    public static f8I c;
    public static f8I 0;
    public static f8I 1;
    public static f8I[] c;
    
    public f8I(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.1 != 0) {
                    n = -1122886632;
                    break Label_0013;
                }
                n = -1136214542;
            }
            switch (n ^ 0xDEB69EFB) {
                case 1671725795: {
                    continue;
                }
                case 1659904777: {
                    super(name, ordinal);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f8I c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f8I;.class
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             12100920
        //    34: goto            39
        //    37: ldc             899007206
        //    39: ldc             -80388489
        //    41: ixor           
        //    42: lookupswitch {
        //          -74581169: 84
        //          364311674: 37
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/f8I;
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
        //    StackMapTable: 00 11 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 26 4C 07 00 28 FF 00 01 00 01 07 00 26 00 02 07 00 28 01 5C 07 00 28 43 07 00 1D FF 00 00 00 01 07 00 26 00 02 07 00 28 07 00 26 45 07 00 1D 40 07 00 05 43 07 00 28 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     95     103    Any
        //  95     103    95     103    Ljava/lang/AssertionError;
        //  111    113    3      8      Any
        //  72     79     79     80     Any
        //  73     79     3      8      Ljava/lang/IllegalArgumentException;
        //  73     79     72     73     Any
        //  73     79     3      8      Ljava/lang/AssertionError;
        //  73     79     72     73     Any
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
        //     1: anewarray       Ldev/nuker/pyro/f8I;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f8I;
        //    10: dup            
        //    11: ldc             "\u2223\u1492\u8b09\ubf09\ufd2c\uec01"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/f8I.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/f8I.c:Ldev/nuker/pyro/f8I;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/f8I;
        //    30: dup            
        //    31: ldc             "\u2220\u1483\u8b03\ubf0c"
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: iconst_1       
        //    37: invokespecial   dev/nuker/pyro/f8I.<init>:(Ljava/lang/String;I)V
        //    40: dup            
        //    41: getstatic       dev/nuker/pyro/fc.c:I
        //    44: ifge            52
        //    47: ldc             849043891
        //    49: goto            54
        //    52: ldc             707178110
        //    54: ldc             560002750
        //    56: ixor           
        //    57: lookupswitch {
        //          335255309: 158
        //          1974101216: 52
        //          default: 84
        //        }
        //    84: putstatic       dev/nuker/pyro/f8I.0:Ldev/nuker/pyro/f8I;
        //    87: aastore        
        //    88: dup            
        //    89: iconst_2       
        //    90: new             Ldev/nuker/pyro/f8I;
        //    93: dup            
        //    94: ldc             "\u223c\u1495\u8b0c"
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: iconst_2       
        //   100: invokespecial   dev/nuker/pyro/f8I.<init>:(Ljava/lang/String;I)V
        //   103: dup            
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            115
        //   110: ldc             -1718690819
        //   112: goto            117
        //   115: ldc             -27774745
        //   117: ldc             -2113939549
        //   119: ixor           
        //   120: lookupswitch {
        //          410061918: 115
        //          2141710148: 148
        //          default: 156
        //        }
        //   148: putstatic       dev/nuker/pyro/f8I.1:Ldev/nuker/pyro/f8I;
        //   151: aastore        
        //   152: putstatic       dev/nuker/pyro/f8I.c:[Ldev/nuker/pyro/f8I;
        //   155: return         
        //   156: aconst_null    
        //   157: athrow         
        //   158: aconst_null    
        //   159: athrow         
        //    StackMapTable: 00 08 FF 00 34 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 01 FF 00 1D 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 1E 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 07 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 01 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03
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
}
