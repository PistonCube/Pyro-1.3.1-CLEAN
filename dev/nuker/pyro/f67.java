// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f67
{
    public static f67 c;
    public static f67 0;
    public static f67[] c;
    
    public f67(final String name, final int ordinal) {
        while (true) {
            Label_0015: {
                if (fc.0 != 0) {
                    n = 317787708;
                    break Label_0015;
                }
                n = 1356444701;
            }
            switch (n ^ 0x7E50CF9A) {
                case 1822540198: {
                    continue;
                }
                case 780761991: {
                    super(name, ordinal);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f67 c(final String p0) {
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
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f67;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f67;
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
        //    67: nop            
        //    68: athrow         
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 24 43 07 00 24 FC 00 00 07 00 17 FF 00 0B 00 00 00 01 07 00 24 FC 00 03 07 00 17 45 07 00 24 FF 00 00 00 01 07 00 17 00 02 07 00 2A 07 00 17 45 07 00 24 40 07 00 05 43 07 00 24 43 05 44 07 00 24 47 05 FF 00 07 00 00 00 01 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/IllegalArgumentException;
        //  30     37     37     38     Ljava/lang/RuntimeException;
        //  30     37     37     38     Ljava/lang/UnsupportedOperationException;
        //  30     37     30     31     Any
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
        //     3: dup            
        //     4: ldc             "\u23c2\u149f\u8aed\ubf03\ufd80\uedf6"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f67.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f67.c:Ldev/nuker/pyro/f67;
        //    16: new             Ldev/nuker/pyro/f67;
        //    19: dup            
        //    20: ldc             "\u23cc\u149f\u8afe"
        //    22: getstatic       dev/nuker/pyro/fc.1:I
        //    25: ifeq            33
        //    28: ldc             1762329884
        //    30: goto            35
        //    33: ldc             -723398230
        //    35: ldc             1428621179
        //    37: ixor           
        //    38: lookupswitch {
        //          501732553: 33
        //          1009517159: 180
        //          default: 64
        //        }
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f67.<init>:(Ljava/lang/String;I)V
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             988522967
        //    79: goto            84
        //    82: ldc             -745166807
        //    84: ldc             -1080008462
        //    86: ixor           
        //    87: lookupswitch {
        //          -2058630875: 82
        //          1815464155: 112
        //          default: 178
        //        }
        //   112: putstatic       dev/nuker/pyro/f67.0:Ldev/nuker/pyro/f67;
        //   115: iconst_2       
        //   116: anewarray       Ldev/nuker/pyro/f67;
        //   119: dup            
        //   120: iconst_0       
        //   121: getstatic       dev/nuker/pyro/f67.c:Ldev/nuker/pyro/f67;
        //   124: aastore        
        //   125: dup            
        //   126: iconst_1       
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            138
        //   133: ldc             -1672099956
        //   135: goto            140
        //   138: ldc             1802915800
        //   140: ldc             70367779
        //   142: ixor           
        //   143: lookupswitch {
        //          -1738244689: 138
        //          1866987003: 168
        //          default: 176
        //        }
        //   168: getstatic       dev/nuker/pyro/f67.0:Ldev/nuker/pyro/f67;
        //   171: aastore        
        //   172: putstatic       dev/nuker/pyro/f67.c:[Ldev/nuker/pyro/f67;
        //   175: return         
        //   176: aconst_null    
        //   177: athrow         
        //   178: aconst_null    
        //   179: athrow         
        //   180: aconst_null    
        //   181: athrow         
        //    StackMapTable: 00 0C FF 00 21 00 00 00 03 08 00 10 08 00 10 07 00 17 FF 00 01 00 00 00 04 08 00 10 08 00 10 07 00 17 01 FF 00 1C 00 00 00 03 08 00 10 08 00 10 07 00 17 51 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 19 00 00 00 03 07 00 49 07 00 49 01 FF 00 01 00 00 00 04 07 00 49 07 00 49 01 01 FF 00 1B 00 00 00 03 07 00 49 07 00 49 01 FF 00 07 00 00 00 03 07 00 49 07 00 49 01 41 07 00 03 FF 00 01 00 00 00 03 08 00 10 08 00 10 07 00 17
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
