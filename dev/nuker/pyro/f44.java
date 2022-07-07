// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f44
{
    public static f44 c;
    public static f44 0;
    public static f44[] c;
    
    public static f44 c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f44;.class
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             1737246038
        //    34: goto            39
        //    37: ldc             1455560266
        //    39: ldc             1418492932
        //    41: ixor           
        //    42: lookupswitch {
        //          254763748: 37
        //          855652690: 84
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/f44;
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
        //    StackMapTable: 00 11 43 07 00 15 04 FF 00 0B 00 00 00 01 07 00 15 FC 00 03 07 00 21 4C 07 00 23 FF 00 01 00 01 07 00 21 00 02 07 00 23 01 5C 07 00 23 43 07 00 15 FF 00 00 00 01 07 00 21 00 02 07 00 23 07 00 21 45 07 00 15 40 07 00 05 43 07 00 23 41 07 00 15 43 05 44 07 00 15 47 05 47 07 00 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     95     103    Ljava/lang/RuntimeException;
        //  95     103    95     103    Any
        //  111    113    3      8      Any
        //  72     79     79     80     Any
        //  72     79     3      8      Any
        //  73     79     72     73     Any
        //  73     79     3      8      Any
        //  73     79     79     80     Ljava/lang/NegativeArraySizeException;
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
    
    public f44(final String name, final int ordinal) {
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2383\u1481\u8aa9\ubf03\ufdc3\ued88\ub22d\ue685\ud5a7"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            21
        //    16: ldc             -117234424
        //    18: goto            23
        //    21: ldc             -968806615
        //    23: ldc             -1228303297
        //    25: ixor           
        //    26: lookupswitch {
        //          -2060169613: 21
        //          1338683703: 178
        //          default: 52
        //        }
        //    52: invokespecial   dev/nuker/pyro/f44.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f44.c:Ldev/nuker/pyro/f44;
        //    58: new             Ldev/nuker/pyro/f44;
        //    61: dup            
        //    62: ldc             "\u2391\u149a\u8ab5\ubf05\ufdd6\ueda1"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f44.<init>:(Ljava/lang/String;I)V
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            82
        //    77: ldc             1127037954
        //    79: goto            84
        //    82: ldc             714563049
        //    84: ldc             324912748
        //    86: ixor           
        //    87: lookupswitch {
        //          -973635306: 82
        //          1349581422: 176
        //          default: 112
        //        }
        //   112: putstatic       dev/nuker/pyro/f44.0:Ldev/nuker/pyro/f44;
        //   115: iconst_2       
        //   116: anewarray       Ldev/nuker/pyro/f44;
        //   119: dup            
        //   120: iconst_0       
        //   121: getstatic       dev/nuker/pyro/f44.c:Ldev/nuker/pyro/f44;
        //   124: aastore        
        //   125: dup            
        //   126: iconst_1       
        //   127: getstatic       dev/nuker/pyro/fc.c:I
        //   130: ifge            138
        //   133: ldc             -597104255
        //   135: goto            140
        //   138: ldc             1385798190
        //   140: ldc             -1456291729
        //   142: ixor           
        //   143: lookupswitch {
        //          -916272623: 138
        //          1968843246: 180
        //          default: 168
        //        }
        //   168: getstatic       dev/nuker/pyro/f44.0:Ldev/nuker/pyro/f44;
        //   171: aastore        
        //   172: putstatic       dev/nuker/pyro/f44.c:[Ldev/nuker/pyro/f44;
        //   175: return         
        //   176: aconst_null    
        //   177: athrow         
        //   178: aconst_null    
        //   179: athrow         
        //   180: aconst_null    
        //   181: athrow         
        //    StackMapTable: 00 0C FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 21 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 21 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 21 01 5D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 19 00 00 00 03 07 00 34 07 00 34 01 FF 00 01 00 00 00 04 07 00 34 07 00 34 01 01 FF 00 1B 00 00 00 03 07 00 34 07 00 34 01 47 07 00 03 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 21 01 FF 00 01 00 00 00 03 07 00 34 07 00 34 01
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
}
