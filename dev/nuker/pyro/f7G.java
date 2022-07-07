// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f7G
{
    public static f7G c;
    public static f7G 0;
    public static f7G 1;
    public static f7G[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2202\u1492\u8b28\ubf09\ufd4f\uec20"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f7G.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f7G.c:Ldev/nuker/pyro/f7G;
        //    16: new             Ldev/nuker/pyro/f7G;
        //    19: dup            
        //    20: ldc             "\u2213\u149d\u8b3f\ubf0b"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             1138148605
        //    34: goto            39
        //    37: ldc             -2042724498
        //    39: ldc             1567984228
        //    41: ixor           
        //    42: lookupswitch {
        //          -615779062: 68
        //          514018969: 37
        //          default: 160
        //        }
        //    68: invokespecial   dev/nuker/pyro/f7G.<init>:(Ljava/lang/String;I)V
        //    71: putstatic       dev/nuker/pyro/f7G.0:Ldev/nuker/pyro/f7G;
        //    74: new             Ldev/nuker/pyro/f7G;
        //    77: dup            
        //    78: ldc             "\u2213\u14b2\u8b08"
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: iconst_2       
        //    84: invokespecial   dev/nuker/pyro/f7G.<init>:(Ljava/lang/String;I)V
        //    87: putstatic       dev/nuker/pyro/f7G.1:Ldev/nuker/pyro/f7G;
        //    90: iconst_3       
        //    91: anewarray       Ldev/nuker/pyro/f7G;
        //    94: dup            
        //    95: iconst_0       
        //    96: getstatic       dev/nuker/pyro/fc.0:I
        //    99: ifeq            107
        //   102: ldc             382671769
        //   104: goto            109
        //   107: ldc             -772118461
        //   109: ldc             -821529751
        //   111: ixor           
        //   112: lookupswitch {
        //          -641242896: 107
        //          519183146: 140
        //          default: 162
        //        }
        //   140: getstatic       dev/nuker/pyro/f7G.c:Ldev/nuker/pyro/f7G;
        //   143: aastore        
        //   144: dup            
        //   145: iconst_1       
        //   146: getstatic       dev/nuker/pyro/f7G.0:Ldev/nuker/pyro/f7G;
        //   149: aastore        
        //   150: dup            
        //   151: iconst_2       
        //   152: getstatic       dev/nuker/pyro/f7G.1:Ldev/nuker/pyro/f7G;
        //   155: aastore        
        //   156: putstatic       dev/nuker/pyro/f7G.c:[Ldev/nuker/pyro/f7G;
        //   159: return         
        //   160: aconst_null    
        //   161: athrow         
        //   162: aconst_null    
        //   163: athrow         
        //    StackMapTable: 00 08 FF 00 25 00 00 00 04 08 00 10 08 00 10 07 00 32 01 FF 00 01 00 00 00 05 08 00 10 08 00 10 07 00 32 01 01 FF 00 1C 00 00 00 04 08 00 10 08 00 10 07 00 32 01 FF 00 26 00 00 00 03 07 00 33 07 00 33 01 FF 00 01 00 00 00 04 07 00 33 07 00 33 01 01 FF 00 1E 00 00 00 03 07 00 33 07 00 33 01 FF 00 13 00 00 00 04 08 00 10 08 00 10 07 00 32 01 FF 00 01 00 00 00 03 07 00 33 07 00 33 01
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
    
    public f7G(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.0 != 0) {
                    n = -918274341;
                    break Label_0013;
                }
                n = 1655830816;
            }
            switch (n ^ 0x75CE5C6E) {
                case -603286523: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case -1131781451: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f7G c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f7G;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f7G;
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
        //    StackMapTable: 00 0D 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FC 00 03 07 00 32 45 07 00 46 FF 00 00 00 01 07 00 32 00 02 07 00 4E 07 00 32 45 07 00 39 40 07 00 05 43 07 00 39 43 05 44 07 00 39 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     37     38     Ljava/lang/RuntimeException;
        //  30     37     30     31     Ljava/lang/RuntimeException;
        //  31     37     3      8      Ljava/lang/UnsupportedOperationException;
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
}
