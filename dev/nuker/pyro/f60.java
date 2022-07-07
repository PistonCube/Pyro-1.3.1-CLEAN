// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f60
{
    public static f60 c;
    public static f60 0;
    public static f60[] c;
    
    public f60(final String name, final int ordinal) {
    }
    
    public static f60 c(final String p0) {
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
        //    12: ifgt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f60;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f60;
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
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 1A 43 07 00 1A FC 00 00 07 00 20 FF 00 0B 00 00 00 01 07 00 1A FC 00 03 07 00 20 45 07 00 1A FF 00 00 00 01 07 00 20 00 02 07 00 22 07 00 20 45 07 00 1A 40 07 00 05 43 07 00 1A 43 05 44 07 00 1A 47 05 FF 00 07 00 00 00 01 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  30     37     37     38     Any
        //  31     37     30     31     Any
        //  31     37     30     31     Any
        //  31     37     37     38     Ljava/util/NoSuchElementException;
        //  30     37     30     31     Ljava/lang/IndexOutOfBoundsException;
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
        //     1: anewarray       Ldev/nuker/pyro/f60;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f60;
        //    10: dup            
        //    11: ldc             "\u23cb\u1492\u8aef\ubf01\ufd95\uede2"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/f60.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/f60.c:Ldev/nuker/pyro/f60;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/f60;
        //    30: dup            
        //    31: ldc             "\u23c7\u1495\u8ae7\ubf0a\ufd91\uede0\ub220"
        //    33: getstatic       dev/nuker/pyro/fc.0:I
        //    36: ifeq            44
        //    39: ldc             -214506344
        //    41: goto            46
        //    44: ldc             1052532600
        //    46: ldc             -1487353030
        //    48: ixor           
        //    49: lookupswitch {
        //          -1713073086: 76
        //          1416507298: 44
        //          default: 92
        //        }
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/f60.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: putstatic       dev/nuker/pyro/f60.0:Ldev/nuker/pyro/f60;
        //    87: aastore        
        //    88: putstatic       dev/nuker/pyro/f60.c:[Ldev/nuker/pyro/f60;
        //    91: return         
        //    92: aconst_null    
        //    93: athrow         
        //    StackMapTable: 00 04 FF 00 2C 00 00 00 07 07 00 33 07 00 33 07 00 33 01 08 00 1B 08 00 1B 07 00 20 FF 00 01 00 00 00 08 07 00 33 07 00 33 07 00 33 01 08 00 1B 08 00 1B 07 00 20 01 FF 00 1D 00 00 00 07 07 00 33 07 00 33 07 00 33 01 08 00 1B 08 00 1B 07 00 20 FF 00 0F 00 00 00 07 07 00 33 07 00 33 07 00 33 01 08 00 1B 08 00 1B 07 00 20
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
