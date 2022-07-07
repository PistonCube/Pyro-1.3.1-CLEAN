// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f8d
{
    public static f8d c;
    public static f8d 0;
    public static f8d 1;
    public static f8d 2;
    public static f8d[] c;
    
    public f8d(final String name, final int ordinal) {
    }
    
    public static f8d c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f8d;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f8d;
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
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 1D 43 07 00 1D FC 00 00 07 00 23 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 23 45 07 00 1D FF 00 00 00 01 07 00 23 00 02 07 00 25 07 00 23 45 07 00 1D 40 07 00 05 43 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 00 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  30     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     30     31     Ljava/lang/StringIndexOutOfBoundsException;
        //  30     37     30     31     Ljava/lang/AssertionError;
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
        //     1: anewarray       Ldev/nuker/pyro/f8d;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f8d;
        //    10: dup            
        //    11: ldc             "\u225a\u14bc\u8b58\ubf2c\ufd26\uec57\ub216\ue76b\ud589\udd5c\ua696\u1e78\ue047\uc950"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/f8d.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/f8d;
        //    30: dup            
        //    31: ldc             "\u225a\u14bc\u8b58\ubf2c"
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: iconst_1       
        //    37: invokespecial   dev/nuker/pyro/f8d.<init>:(Ljava/lang/String;I)V
        //    40: dup            
        //    41: getstatic       dev/nuker/pyro/fc.0:I
        //    44: ifeq            52
        //    47: ldc             1778348317
        //    49: goto            54
        //    52: ldc             -525773760
        //    54: ldc             2101033466
        //    56: ixor           
        //    57: lookupswitch {
        //          -1651348038: 84
        //          348408039: 52
        //          default: 266
        //        }
        //    84: putstatic       dev/nuker/pyro/f8d.0:Ldev/nuker/pyro/f8d;
        //    87: aastore        
        //    88: dup            
        //    89: iconst_2       
        //    90: new             Ldev/nuker/pyro/f8d;
        //    93: dup            
        //    94: ldc             "\u2256\u14bc\u8b5d\ubf2b\ufd34\uec59\ub20a\ue776\ud592\udd51"
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: iconst_2       
        //   100: invokespecial   dev/nuker/pyro/f8d.<init>:(Ljava/lang/String;I)V
        //   103: dup            
        //   104: putstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //   107: aastore        
        //   108: dup            
        //   109: iconst_3       
        //   110: new             Ldev/nuker/pyro/f8d;
        //   113: dup            
        //   114: ldc             "\u224b\u14a3"
        //   116: getstatic       dev/nuker/pyro/fc.1:I
        //   119: ifeq            127
        //   122: ldc             -1481470491
        //   124: goto            129
        //   127: ldc             -1069907411
        //   129: ldc             178477751
        //   131: ixor           
        //   132: lookupswitch {
        //          -1391339694: 127
        //          -895887206: 160
        //          default: 270
        //        }
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: iconst_3       
        //   164: invokespecial   dev/nuker/pyro/f8d.<init>:(Ljava/lang/String;I)V
        //   167: dup            
        //   168: getstatic       dev/nuker/pyro/fc.c:I
        //   171: ifge            179
        //   174: ldc             599564764
        //   176: goto            181
        //   179: ldc             1979488968
        //   181: ldc             1023663276
        //   183: ixor           
        //   184: lookupswitch {
        //          515865968: 264
        //          1938955905: 179
        //          default: 212
        //        }
        //   212: putstatic       dev/nuker/pyro/f8d.2:Ldev/nuker/pyro/f8d;
        //   215: aastore        
        //   216: getstatic       dev/nuker/pyro/fc.1:I
        //   219: ifeq            227
        //   222: ldc             -306310335
        //   224: goto            229
        //   227: ldc             -298339611
        //   229: ldc             1466405022
        //   231: ixor           
        //   232: lookupswitch {
        //          -1160150049: 268
        //          1905248822: 227
        //          default: 260
        //        }
        //   260: putstatic       dev/nuker/pyro/f8d.c:[Ldev/nuker/pyro/f8d;
        //   263: return         
        //   264: aconst_null    
        //   265: athrow         
        //   266: aconst_null    
        //   267: athrow         
        //   268: aconst_null    
        //   269: athrow         
        //   270: aconst_null    
        //   271: athrow         
        //    StackMapTable: 00 10 FF 00 34 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 01 FF 00 1D 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 2A 00 00 00 07 07 00 50 07 00 50 07 00 50 01 08 00 6E 08 00 6E 07 00 23 FF 00 01 00 00 00 08 07 00 50 07 00 50 07 00 50 01 08 00 6E 08 00 6E 07 00 23 01 FF 00 1E 00 00 00 07 07 00 50 07 00 50 07 00 50 01 08 00 6E 08 00 6E 07 00 23 FF 00 12 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 0E 00 00 00 02 07 00 50 07 00 50 FF 00 01 00 00 00 03 07 00 50 07 00 50 01 FF 00 1E 00 00 00 02 07 00 50 07 00 50 FF 00 03 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 01 00 00 00 06 07 00 50 07 00 50 07 00 50 01 07 00 03 07 00 03 FF 00 01 00 00 00 02 07 00 50 07 00 50 FF 00 01 00 00 00 07 07 00 50 07 00 50 07 00 50 01 08 00 6E 08 00 6E 07 00 23
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
