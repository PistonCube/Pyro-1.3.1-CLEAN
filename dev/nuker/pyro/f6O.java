// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f6o
{
    public static f6o c;
    public static f6o 0;
    public static f6o 1;
    public static f6o[] c;
    
    public f6o(final String name, final int ordinal) {
    }
    
    public static f6o c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: nop            
        //     4: nop            
        //     5: nop            
        //     6: athrow         
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f6o;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             477802811
        //    35: goto            40
        //    38: ldc             -411162375
        //    40: ldc             -91896645
        //    42: ixor           
        //    43: lookupswitch {
        //          -419465856: 83
        //          973747170: 38
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f6o;
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
        //   110: nop            
        //   111: athrow         
        //    StackMapTable: 00 12 FF 00 03 00 00 00 01 07 00 1C 43 07 00 1C FC 00 00 07 00 25 FF 00 0B 00 00 00 01 07 00 1C FC 00 03 07 00 25 FF 00 0D 00 01 07 00 25 00 02 07 00 27 07 00 25 FF 00 01 00 01 07 00 25 00 03 07 00 27 07 00 25 01 FF 00 1B 00 01 07 00 25 00 02 07 00 27 07 00 25 42 07 00 1C FF 00 00 00 01 07 00 25 00 02 07 00 27 07 00 25 45 07 00 1C 40 07 00 05 FF 00 03 00 01 07 00 25 00 02 07 00 27 07 00 25 41 07 00 1C 43 05 44 07 00 1C 47 05 FF 00 07 00 00 00 01 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Ljava/util/ConcurrentModificationException;
        //  71     78     78     79     Any
        //  71     78     78     79     Any
        //  72     78     78     79     Ljava/lang/UnsupportedOperationException;
        //  72     78     78     79     Ljava/util/NoSuchElementException;
        //  71     78     71     72     Any
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
        //     1: anewarray       Ldev/nuker/pyro/f6o;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f6o;
        //    10: dup            
        //    11: ldc             "\u2218\u1487\u8b2d\ubf10\ufd54"
        //    13: getstatic       dev/nuker/pyro/fc.1:I
        //    16: ifeq            24
        //    19: ldc             -57086256
        //    21: goto            26
        //    24: ldc             -398888348
        //    26: ldc             -1106007114
        //    28: ixor           
        //    29: lookupswitch {
        //          602767889: 24
        //          1116423526: 156
        //          default: 56
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: iconst_0       
        //    60: invokespecial   dev/nuker/pyro/f6o.<init>:(Ljava/lang/String;I)V
        //    63: dup            
        //    64: putstatic       dev/nuker/pyro/f6o.c:Ldev/nuker/pyro/f6o;
        //    67: aastore        
        //    68: dup            
        //    69: iconst_1       
        //    70: new             Ldev/nuker/pyro/f6o;
        //    73: dup            
        //    74: ldc             "\u2218\u1487\u8b27\ubf03\ufd5d"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/f6o.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: putstatic       dev/nuker/pyro/f6o.0:Ldev/nuker/pyro/f6o;
        //    87: aastore        
        //    88: dup            
        //    89: iconst_2       
        //    90: new             Ldev/nuker/pyro/f6o;
        //    93: dup            
        //    94: ldc             "\u220f\u1481\u8b2d\ubf12"
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            107
        //   102: ldc             -981359534
        //   104: goto            109
        //   107: ldc             176322898
        //   109: ldc             904664905
        //   111: ixor           
        //   112: lookupswitch {
        //          -261246181: 107
        //          1064201755: 140
        //          default: 158
        //        }
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: iconst_2       
        //   144: invokespecial   dev/nuker/pyro/f6o.<init>:(Ljava/lang/String;I)V
        //   147: dup            
        //   148: putstatic       dev/nuker/pyro/f6o.1:Ldev/nuker/pyro/f6o;
        //   151: aastore        
        //   152: putstatic       dev/nuker/pyro/f6o.c:[Ldev/nuker/pyro/f6o;
        //   155: return         
        //   156: aconst_null    
        //   157: athrow         
        //   158: aconst_null    
        //   159: athrow         
        //    StackMapTable: 00 08 FF 00 18 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 07 08 00 07 07 00 25 FF 00 01 00 00 00 08 07 00 46 07 00 46 07 00 46 01 08 00 07 08 00 07 07 00 25 01 FF 00 1D 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 07 08 00 07 07 00 25 FF 00 32 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 5A 08 00 5A 07 00 25 FF 00 01 00 00 00 08 07 00 46 07 00 46 07 00 46 01 08 00 5A 08 00 5A 07 00 25 01 FF 00 1E 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 5A 08 00 5A 07 00 25 FF 00 0F 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 07 08 00 07 07 00 25 FF 00 01 00 00 00 07 07 00 46 07 00 46 07 00 46 01 08 00 5A 08 00 5A 07 00 25
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
