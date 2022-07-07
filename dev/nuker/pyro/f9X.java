// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f9x
{
    public static f9x c;
    public static f9x 0;
    public static f9x[] c;
    
    public static f9x c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f9x;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             581929869
        //    35: goto            40
        //    38: ldc             1142953325
        //    40: ldc             -1657097870
        //    42: ixor           
        //    43: lookupswitch {
        //          -1080739073: 38
        //          -652565473: 68
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f9x;
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
        //    StackMapTable: 00 11 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 36 FF 00 0D 00 01 07 00 36 00 02 07 00 38 07 00 36 FF 00 01 00 01 07 00 36 00 03 07 00 38 07 00 36 01 FF 00 1B 00 01 07 00 36 00 02 07 00 38 07 00 36 42 07 00 27 FF 00 00 00 01 07 00 36 00 02 07 00 38 07 00 36 45 07 00 19 40 07 00 05 FF 00 03 00 01 07 00 36 00 02 07 00 38 07 00 36 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Ljava/lang/IllegalStateException;
        //  110    112    3      7      Any
        //  71     78     78     79     Any
        //  71     78     3      7      Ljava/lang/NumberFormatException;
        //  71     78     71     72     Ljava/lang/NumberFormatException;
        //  72     78     78     79     Ljava/lang/IndexOutOfBoundsException;
        //  71     78     3      7      Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 33 out of bounds for length 33
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
        //     1: anewarray       Ldev/nuker/pyro/f9x;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f9x;
        //    10: dup            
        //    11: ldc             "\u226e\u14b2\u8b71\ubf27\ufec9\uec6a"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/f9x.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/f9x.c:Ldev/nuker/pyro/f9x;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/f9x;
        //    30: dup            
        //    31: ldc             "\u227d\u14b2\u8b7f\ubf29\ufede\uec7f"
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: iconst_1       
        //    37: getstatic       dev/nuker/pyro/fc.1:I
        //    40: ifeq            48
        //    43: ldc             -648589505
        //    45: goto            50
        //    48: ldc             -688093674
        //    50: ldc             1122735214
        //    52: ixor           
        //    53: lookupswitch {
        //          -1682121903: 136
        //          394009747: 48
        //          default: 80
        //        }
        //    80: invokespecial   dev/nuker/pyro/f9x.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: getstatic       dev/nuker/pyro/fc.c:I
        //    87: ifge            95
        //    90: ldc             940441159
        //    92: goto            97
        //    95: ldc             -577246067
        //    97: ldc             189764728
        //    99: ixor           
        //   100: lookupswitch {
        //          829498624: 95
        //          859990591: 138
        //          default: 128
        //        }
        //   128: putstatic       dev/nuker/pyro/f9x.0:Ldev/nuker/pyro/f9x;
        //   131: aastore        
        //   132: putstatic       dev/nuker/pyro/f9x.c:[Ldev/nuker/pyro/f9x;
        //   135: return         
        //   136: aconst_null    
        //   137: athrow         
        //   138: aconst_null    
        //   139: athrow         
        //    StackMapTable: 00 08 FF 00 30 00 00 00 08 07 00 1C 07 00 1C 07 00 1C 01 08 00 1B 08 00 1B 07 00 36 01 FF 00 01 00 00 00 09 07 00 1C 07 00 1C 07 00 1C 01 08 00 1B 08 00 1B 07 00 36 01 01 FF 00 1D 00 00 00 08 07 00 1C 07 00 1C 07 00 1C 01 08 00 1B 08 00 1B 07 00 36 01 FF 00 0E 00 00 00 06 07 00 1C 07 00 1C 07 00 1C 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 1C 07 00 1C 07 00 1C 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 1C 07 00 1C 07 00 1C 01 07 00 03 07 00 03 FF 00 07 00 00 00 08 07 00 1C 07 00 1C 07 00 1C 01 08 00 1B 08 00 1B 07 00 36 01 FF 00 01 00 00 00 06 07 00 1C 07 00 1C 07 00 1C 01 07 00 03 07 00 03
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
    
    public f9x(final String name, final int ordinal) {
    }
}
