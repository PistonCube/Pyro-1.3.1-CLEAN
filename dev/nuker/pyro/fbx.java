// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum fbx
{
    public static fbx c;
    public static fbx 0;
    public static fbx 1;
    public static fbx 2;
    public static fbx[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u297a\u149c\u8060\ubf0c\ufbe0\ue75b\ub230\uec71\ud590\udb88\uad9e\u1e40\ueb45\uc96f\ub309\u83c6\u57aa"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/fbx.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/fbx.c:Ldev/nuker/pyro/fbx;
        //    16: new             Ldev/nuker/pyro/fbx;
        //    19: dup            
        //    20: ldc             "\u2975\u149f\u8057\ubf07\ufbf5\ue756\ub23d\uec4a\ud5bf\udb88\uad91\u1e47\ueb78\uc974\ub305\u83db\u57a1"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: invokespecial   dev/nuker/pyro/fbx.<init>:(Ljava/lang/String;I)V
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            40
        //    35: ldc             710844091
        //    37: goto            42
        //    40: ldc             1866278241
        //    42: ldc             -1428252149
        //    44: ixor           
        //    45: lookupswitch {
        //          -2139093840: 224
        //          -1208362878: 40
        //          default: 72
        //        }
        //    72: putstatic       dev/nuker/pyro/fbx.0:Ldev/nuker/pyro/fbx;
        //    75: new             Ldev/nuker/pyro/fbx;
        //    78: dup            
        //    79: ldc             "\u297a\u149c\u806b\ubf07\ufbfd\ue755\ub22c\uec6a\ud5bc\udb95\uad81"
        //    81: invokestatic    invokestatic   !!! ERROR
        //    84: iconst_2       
        //    85: invokespecial   dev/nuker/pyro/fbx.<init>:(Ljava/lang/String;I)V
        //    88: putstatic       dev/nuker/pyro/fbx.1:Ldev/nuker/pyro/fbx;
        //    91: new             Ldev/nuker/pyro/fbx;
        //    94: dup            
        //    95: ldc             "\u297b\u1498"
        //    97: getstatic       dev/nuker/pyro/fc.0:I
        //   100: ifeq            108
        //   103: ldc             98934714
        //   105: goto            110
        //   108: ldc             1377272015
        //   110: ldc             -2055532152
        //   112: ixor           
        //   113: lookupswitch {
        //          -2137092558: 228
        //          -1471035310: 108
        //          default: 140
        //        }
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: iconst_3       
        //   144: invokespecial   dev/nuker/pyro/fbx.<init>:(Ljava/lang/String;I)V
        //   147: putstatic       dev/nuker/pyro/fbx.2:Ldev/nuker/pyro/fbx;
        //   150: iconst_4       
        //   151: anewarray       Ldev/nuker/pyro/fbx;
        //   154: dup            
        //   155: iconst_0       
        //   156: getstatic       dev/nuker/pyro/fbx.c:Ldev/nuker/pyro/fbx;
        //   159: aastore        
        //   160: dup            
        //   161: iconst_1       
        //   162: getstatic       dev/nuker/pyro/fbx.0:Ldev/nuker/pyro/fbx;
        //   165: aastore        
        //   166: dup            
        //   167: iconst_2       
        //   168: getstatic       dev/nuker/pyro/fbx.1:Ldev/nuker/pyro/fbx;
        //   171: aastore        
        //   172: dup            
        //   173: iconst_3       
        //   174: getstatic       dev/nuker/pyro/fbx.2:Ldev/nuker/pyro/fbx;
        //   177: aastore        
        //   178: getstatic       dev/nuker/pyro/fc.1:I
        //   181: ifeq            189
        //   184: ldc             514136906
        //   186: goto            191
        //   189: ldc             -614435483
        //   191: ldc             -1271197370
        //   193: ixor           
        //   194: lookupswitch {
        //          -1432483316: 226
        //          -879750429: 189
        //          default: 220
        //        }
        //   220: putstatic       dev/nuker/pyro/fbx.c:[Ldev/nuker/pyro/fbx;
        //   223: return         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: aconst_null    
        //   229: athrow         
        //    StackMapTable: 00 0C 68 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5D 07 00 03 FF 00 23 00 00 00 03 08 00 5B 08 00 5B 07 00 3A FF 00 01 00 00 00 04 08 00 5B 08 00 5B 07 00 3A 01 FF 00 1D 00 00 00 03 08 00 5B 08 00 5B 07 00 3A 70 07 00 3B FF 00 01 00 00 00 02 07 00 3B 01 5C 07 00 3B 43 07 00 03 41 07 00 3B FF 00 01 00 00 00 03 08 00 5B 08 00 5B 07 00 3A
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
    
    public static fbx c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/fbx;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             -731095660
        //    35: goto            40
        //    38: ldc             -909121209
        //    40: ldc             -1754544292
        //    42: ixor           
        //    43: lookupswitch {
        //          805035992: 38
        //          1124571848: 83
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/fbx;
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
        //    StackMapTable: 00 11 43 07 00 44 04 FF 00 0B 00 00 00 01 07 00 44 FC 00 03 07 00 3A FF 00 0D 00 01 07 00 3A 00 02 07 00 4D 07 00 3A FF 00 01 00 01 07 00 3A 00 03 07 00 4D 07 00 3A 01 FF 00 1B 00 01 07 00 3A 00 02 07 00 4D 07 00 3A 42 07 00 44 FF 00 00 00 01 07 00 3A 00 02 07 00 4D 07 00 3A 45 07 00 44 40 07 00 05 FF 00 03 00 01 07 00 3A 00 02 07 00 4D 07 00 3A 41 07 00 44 43 05 44 07 00 44 47 05 47 07 00 44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Ljava/lang/NullPointerException;
        //  110    112    3      8      Ljava/lang/AssertionError;
        //  71     78     78     79     Any
        //  71     78     3      8      Any
        //  72     78     71     72     Ljava/lang/IllegalArgumentException;
        //  72     78     71     72     Any
        //  72     78     71     72     Any
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
    
    public fbx(final String name, final int ordinal) {
    }
}
