// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f4S
{
    public static f4S c;
    public static f4S 0;
    public static f4S 1;
    public static f4S 2;
    public static f4S[] c;
    
    public f4S(final String name, final int ordinal) {
    }
    
    public static f4S c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f4S;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f4S;
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
        //    StackMapTable: 00 0D 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FC 00 03 07 00 25 45 07 00 12 FF 00 00 00 01 07 00 25 00 02 07 00 27 07 00 25 45 07 00 1F 40 07 00 05 43 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Ljava/lang/ClassCastException;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  30     37     37     38     Ljava/util/ConcurrentModificationException;
        //  30     37     37     38     Ljava/lang/IllegalArgumentException;
        //  31     37     30     31     Ljava/lang/ClassCastException;
        //  31     37     3      8      Ljava/lang/AssertionError;
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
        //     3: dup            
        //     4: ldc             "\u23ae\u149f\u8a93\ubf11\ufdbe\ued98\ub230"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f4S.<init>:(Ljava/lang/String;I)V
        //    13: getstatic       dev/nuker/pyro/fc.1:I
        //    16: ifeq            24
        //    19: ldc             -913773190
        //    21: goto            26
        //    24: ldc             949622911
        //    26: ldc             1193040222
        //    28: ixor           
        //    29: lookupswitch {
        //          -1902857180: 320
        //          71885947: 24
        //          default: 56
        //        }
        //    56: putstatic       dev/nuker/pyro/f4S.c:Ldev/nuker/pyro/f4S;
        //    59: new             Ldev/nuker/pyro/f4S;
        //    62: dup            
        //    63: ldc             "\u23bd\u1481\u8a95\ubf0d\ufda9\ued82\ub230\ue6a8"
        //    65: invokestatic    invokestatic   !!! ERROR
        //    68: iconst_1       
        //    69: invokespecial   dev/nuker/pyro/f4S.<init>:(Ljava/lang/String;I)V
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             -1030904437
        //    80: goto            85
        //    83: ldc             742009446
        //    85: ldc             1179683733
        //    87: ixor           
        //    88: lookupswitch {
        //          -2065879522: 316
        //          -693499928: 83
        //          default: 116
        //        }
        //   116: putstatic       dev/nuker/pyro/f4S.0:Ldev/nuker/pyro/f4S;
        //   119: new             Ldev/nuker/pyro/f4S;
        //   122: dup            
        //   123: ldc             "\u23be\u1484\u8a95\ubf16\ufdb8\ued83"
        //   125: invokestatic    invokestatic   !!! ERROR
        //   128: iconst_2       
        //   129: invokespecial   dev/nuker/pyro/f4S.<init>:(Ljava/lang/String;I)V
        //   132: putstatic       dev/nuker/pyro/f4S.1:Ldev/nuker/pyro/f4S;
        //   135: new             Ldev/nuker/pyro/f4S;
        //   138: dup            
        //   139: ldc             "\u23a1\u149c\u8a8b\ubf07\ufda8\ued9f\ub20c\ue6b4\ud5b2\uddc4\ua75f\u1e44"
        //   141: getstatic       dev/nuker/pyro/fc.c:I
        //   144: ifge            152
        //   147: ldc             889902588
        //   149: goto            154
        //   152: ldc             -1071627980
        //   154: ldc             -1638320711
        //   156: ixor           
        //   157: lookupswitch {
        //          -1420566459: 152
        //          1585017997: 184
        //          default: 314
        //        }
        //   184: invokestatic    invokestatic   !!! ERROR
        //   187: iconst_3       
        //   188: getstatic       dev/nuker/pyro/fc.1:I
        //   191: ifeq            199
        //   194: ldc             -485864491
        //   196: goto            201
        //   199: ldc             1765348044
        //   201: ldc             790834765
        //   203: ixor           
        //   204: lookupswitch {
        //          -869702248: 199
        //          1176124545: 232
        //          default: 318
        //        }
        //   232: invokespecial   dev/nuker/pyro/f4S.<init>:(Ljava/lang/String;I)V
        //   235: putstatic       dev/nuker/pyro/f4S.2:Ldev/nuker/pyro/f4S;
        //   238: iconst_4       
        //   239: anewarray       Ldev/nuker/pyro/f4S;
        //   242: dup            
        //   243: iconst_0       
        //   244: getstatic       dev/nuker/pyro/f4S.c:Ldev/nuker/pyro/f4S;
        //   247: aastore        
        //   248: dup            
        //   249: iconst_1       
        //   250: getstatic       dev/nuker/pyro/f4S.0:Ldev/nuker/pyro/f4S;
        //   253: aastore        
        //   254: dup            
        //   255: iconst_2       
        //   256: getstatic       dev/nuker/pyro/f4S.1:Ldev/nuker/pyro/f4S;
        //   259: aastore        
        //   260: dup            
        //   261: iconst_3       
        //   262: getstatic       dev/nuker/pyro/f4S.2:Ldev/nuker/pyro/f4S;
        //   265: aastore        
        //   266: getstatic       dev/nuker/pyro/fc.0:I
        //   269: ifeq            277
        //   272: ldc             403727419
        //   274: goto            279
        //   277: ldc             -316222385
        //   279: ldc             -231037969
        //   281: ixor           
        //   282: lookupswitch {
        //          -366295084: 277
        //          521959328: 308
        //          default: 312
        //        }
        //   308: putstatic       dev/nuker/pyro/f4S.c:[Ldev/nuker/pyro/f4S;
        //   311: return         
        //   312: aconst_null    
        //   313: athrow         
        //   314: aconst_null    
        //   315: athrow         
        //   316: aconst_null    
        //   317: athrow         
        //   318: aconst_null    
        //   319: athrow         
        //   320: aconst_null    
        //   321: athrow         
        //    StackMapTable: 00 14 58 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5D 07 00 03 5A 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5E 07 00 03 FF 00 23 00 00 00 03 08 00 87 08 00 87 07 00 25 FF 00 01 00 00 00 04 08 00 87 08 00 87 07 00 25 01 FF 00 1D 00 00 00 03 08 00 87 08 00 87 07 00 25 FF 00 0E 00 00 00 04 08 00 87 08 00 87 07 00 25 01 FF 00 01 00 00 00 05 08 00 87 08 00 87 07 00 25 01 01 FF 00 1E 00 00 00 04 08 00 87 08 00 87 07 00 25 01 6C 07 00 36 FF 00 01 00 00 00 02 07 00 36 01 5C 07 00 36 43 07 00 36 FF 00 01 00 00 00 03 08 00 87 08 00 87 07 00 25 41 07 00 03 FF 00 01 00 00 00 04 08 00 87 08 00 87 07 00 25 01 41 07 00 03
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
