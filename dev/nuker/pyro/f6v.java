// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f6v
{
    public static f6v c;
    public static f6v 0;
    public static f6v 1;
    public static f6v[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2203\u1490\u8b2f\ubf0b\ufd4c\uec25\ub230\ue71f\ud5bc\udd27"
        //     6: getstatic       dev/nuker/pyro/fc.c:I
        //     9: ifge            17
        //    12: ldc             -859852457
        //    14: goto            19
        //    17: ldc             646238092
        //    19: ldc             -314427022
        //    21: ixor           
        //    22: lookupswitch {
        //          -876153090: 48
        //          570263589: 17
        //          default: 157
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: invokespecial   dev/nuker/pyro/f6v.<init>:(Ljava/lang/String;I)V
        //    55: getstatic       dev/nuker/pyro/fc.c:I
        //    58: ifge            66
        //    61: ldc             447810707
        //    63: goto            68
        //    66: ldc             1025560450
        //    68: ldc             -1486259811
        //    70: ixor           
        //    71: lookupswitch {
        //          -1706445281: 96
        //          -1109887730: 66
        //          default: 159
        //        }
        //    96: putstatic       dev/nuker/pyro/f6v.c:Ldev/nuker/pyro/f6v;
        //    99: new             Ldev/nuker/pyro/f6v;
        //   102: dup            
        //   103: ldc             "\u2201\u1481\u8b22\ubf11\ufd4e\uec25\ub228\ue705"
        //   105: invokestatic    invokestatic   !!! ERROR
        //   108: iconst_1       
        //   109: invokespecial   dev/nuker/pyro/f6v.<init>:(Ljava/lang/String;I)V
        //   112: putstatic       dev/nuker/pyro/f6v.0:Ldev/nuker/pyro/f6v;
        //   115: new             Ldev/nuker/pyro/f6v;
        //   118: dup            
        //   119: ldc             "\u2200\u149c\u8b2f\ubf0a"
        //   121: invokestatic    invokestatic   !!! ERROR
        //   124: iconst_2       
        //   125: invokespecial   dev/nuker/pyro/f6v.<init>:(Ljava/lang/String;I)V
        //   128: putstatic       dev/nuker/pyro/f6v.1:Ldev/nuker/pyro/f6v;
        //   131: iconst_3       
        //   132: anewarray       Ldev/nuker/pyro/f6v;
        //   135: dup            
        //   136: iconst_0       
        //   137: getstatic       dev/nuker/pyro/f6v.c:Ldev/nuker/pyro/f6v;
        //   140: aastore        
        //   141: dup            
        //   142: iconst_1       
        //   143: getstatic       dev/nuker/pyro/f6v.0:Ldev/nuker/pyro/f6v;
        //   146: aastore        
        //   147: dup            
        //   148: iconst_2       
        //   149: getstatic       dev/nuker/pyro/f6v.1:Ldev/nuker/pyro/f6v;
        //   152: aastore        
        //   153: putstatic       dev/nuker/pyro/f6v.c:[Ldev/nuker/pyro/f6v;
        //   156: return         
        //   157: aconst_null    
        //   158: athrow         
        //   159: aconst_null    
        //   160: athrow         
        //    StackMapTable: 00 08 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 30 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 30 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 30 51 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 3C 00 00 00 03 08 00 00 08 00 00 07 00 30 41 07 00 03
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
    
    public f6v(final String name, final int ordinal) {
    }
    
    public static f6v c(final String p0) {
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
        //    12: ifgt            148
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            140
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f6v;.class
        //    26: getstatic       dev/nuker/pyro/fc.0:I
        //    29: ifeq            37
        //    32: ldc             -1400178091
        //    34: goto            39
        //    37: ldc             614892346
        //    39: ldc             -353245456
        //    41: ixor           
        //    42: lookupswitch {
        //          -2110366487: 37
        //          1182473381: 127
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             -1207389903
        //    77: goto            82
        //    80: ldc             228110102
        //    82: ldc             1774803290
        //    84: ixor           
        //    85: lookupswitch {
        //          -775821205: 129
        //          1331163664: 80
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //   119: goto            123
        //   122: athrow         
        //   123: checkcast       Ldev/nuker/pyro/f6v;
        //   126: areturn        
        //   127: aconst_null    
        //   128: athrow         
        //   129: aconst_null    
        //   130: athrow         
        //   131: pop            
        //   132: goto            24
        //   135: pop            
        //   136: aconst_null    
        //   137: goto            131
        //   140: dup            
        //   141: ifnull          131
        //   144: checkcast       Ljava/lang/Throwable;
        //   147: athrow         
        //   148: dup            
        //   149: ifnull          135
        //   152: checkcast       Ljava/lang/Throwable;
        //   155: athrow         
        //   156: nop            
        //   157: athrow         
        //    StackMapTable: 00 16 FF 00 03 00 00 00 01 07 00 3B 43 07 00 3B FC 00 00 07 00 30 FF 00 0B 00 00 00 01 07 00 3B FC 00 03 07 00 30 4C 07 00 53 FF 00 01 00 01 07 00 30 00 02 07 00 53 01 5C 07 00 53 FF 00 0B 00 01 07 00 30 00 02 07 00 53 07 00 30 FF 00 01 00 01 07 00 30 00 03 07 00 53 07 00 30 01 FF 00 1D 00 01 07 00 30 00 02 07 00 53 07 00 30 42 07 00 3B FF 00 00 00 01 07 00 30 00 02 07 00 53 07 00 30 45 07 00 3B 40 07 00 05 43 07 00 53 FF 00 01 00 01 07 00 30 00 02 07 00 53 07 00 30 41 07 00 3B 43 05 44 07 00 3B 47 05 FF 00 07 00 00 00 01 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     140    148    Any
        //  140    148    140    148    Any
        //  115    122    122    123    Any
        //  115    122    115    116    Ljava/lang/EnumConstantNotPresentException;
        //  115    122    115    116    Any
        //  115    122    115    116    Any
        //  116    122    122    123    Any
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
