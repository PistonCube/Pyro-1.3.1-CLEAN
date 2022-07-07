// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f6u
{
    public static f6u c;
    public static f6u 0;
    public static f6u 1;
    public static f6u[] c;
    
    public f6u(final String name, final int ordinal) {
    }
    
    public static f6u c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
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
        //    24: ldc             Ldev/nuker/pyro/f6u;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -1144269454
        //    35: goto            40
        //    38: ldc             -1436500100
        //    40: ldc             731321740
        //    42: ixor           
        //    43: lookupswitch {
        //          -2114475280: 68
        //          -1872969474: 38
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f6u;
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
        //    StackMapTable: 00 11 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FC 00 03 07 00 3A FF 00 0D 00 01 07 00 3A 00 02 07 00 3C 07 00 3A FF 00 01 00 01 07 00 3A 00 03 07 00 3C 07 00 3A 01 FF 00 1B 00 01 07 00 3A 00 02 07 00 3C 07 00 3A 42 07 00 1F FF 00 00 00 01 07 00 3A 00 02 07 00 3C 07 00 3A 45 07 00 1F 40 07 00 05 FF 00 03 00 01 07 00 3A 00 02 07 00 3C 07 00 3A 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Ljava/lang/NullPointerException;
        //  110    112    3      8      Ljava/lang/IllegalArgumentException;
        //  71     78     78     79     Any
        //  72     78     3      8      Ljava/lang/AssertionError;
        //  71     78     71     72     Any
        //  71     78     78     79     Ljava/lang/AssertionError;
        //  71     78     71     72     Ljava/lang/ArithmeticException;
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
        //     4: ldc             "\u2200\u1492\u8b35\ubf0c\ufd73\uec2a\ub22a\ue715"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.0:I
        //    13: ifeq            21
        //    16: ldc             149140518
        //    18: goto            23
        //    21: ldc             -2142603750
        //    23: ldc             699596237
        //    25: ixor           
        //    26: lookupswitch {
        //          -1443329065: 52
        //          558975467: 21
        //          default: 242
        //        }
        //    52: invokespecial   dev/nuker/pyro/f6u.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f6u.c:Ldev/nuker/pyro/f6u;
        //    58: new             Ldev/nuker/pyro/f6u;
        //    61: dup            
        //    62: ldc             "\u2202\u1495\u8b3a\ubf0a\ufd5a\uec25\ub220"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: getstatic       dev/nuker/pyro/fc.1:I
        //    71: ifeq            79
        //    74: ldc             -1071004215
        //    76: goto            81
        //    79: ldc             650210954
        //    81: ldc             1572252044
        //    83: ixor           
        //    84: lookupswitch {
        //          -1650496443: 79
        //          2071447302: 112
        //          default: 244
        //        }
        //   112: invokespecial   dev/nuker/pyro/f6u.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f6u.0:Ldev/nuker/pyro/f6u;
        //   118: new             Ldev/nuker/pyro/f6u;
        //   121: dup            
        //   122: ldc             "\u220f\u149c\u8b28\ubf0a"
        //   124: invokestatic    invokestatic   !!! ERROR
        //   127: iconst_2       
        //   128: invokespecial   dev/nuker/pyro/f6u.<init>:(Ljava/lang/String;I)V
        //   131: getstatic       dev/nuker/pyro/fc.c:I
        //   134: ifge            142
        //   137: ldc             2001932347
        //   139: goto            144
        //   142: ldc             156680709
        //   144: ldc             -1208102960
        //   146: ixor           
        //   147: lookupswitch {
        //          -1096086059: 172
        //          -1062281237: 142
        //          default: 246
        //        }
        //   172: putstatic       dev/nuker/pyro/f6u.1:Ldev/nuker/pyro/f6u;
        //   175: iconst_3       
        //   176: anewarray       Ldev/nuker/pyro/f6u;
        //   179: dup            
        //   180: iconst_0       
        //   181: getstatic       dev/nuker/pyro/f6u.c:Ldev/nuker/pyro/f6u;
        //   184: aastore        
        //   185: dup            
        //   186: iconst_1       
        //   187: getstatic       dev/nuker/pyro/fc.0:I
        //   190: ifeq            198
        //   193: ldc             1047273076
        //   195: goto            200
        //   198: ldc             -939191389
        //   200: ldc             1073125938
        //   202: ixor           
        //   203: lookupswitch {
        //          26903622: 248
        //          315404302: 198
        //          default: 228
        //        }
        //   228: getstatic       dev/nuker/pyro/f6u.0:Ldev/nuker/pyro/f6u;
        //   231: aastore        
        //   232: dup            
        //   233: iconst_2       
        //   234: getstatic       dev/nuker/pyro/f6u.1:Ldev/nuker/pyro/f6u;
        //   237: aastore        
        //   238: putstatic       dev/nuker/pyro/f6u.c:[Ldev/nuker/pyro/f6u;
        //   241: return         
        //   242: aconst_null    
        //   243: athrow         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //    StackMapTable: 00 10 FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 3A 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 3A 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 3A 01 FF 00 1A 00 00 00 04 08 00 3A 08 00 3A 07 00 3A 01 FF 00 01 00 00 00 05 08 00 3A 08 00 3A 07 00 3A 01 01 FF 00 1E 00 00 00 04 08 00 3A 08 00 3A 07 00 3A 01 5D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 19 00 00 00 03 07 00 22 07 00 22 01 FF 00 01 00 00 00 04 07 00 22 07 00 22 01 01 FF 00 1B 00 00 00 03 07 00 22 07 00 22 01 FF 00 0D 00 00 00 04 08 00 00 08 00 00 07 00 3A 01 FF 00 01 00 00 00 04 08 00 3A 08 00 3A 07 00 3A 01 41 07 00 03 FF 00 01 00 00 00 03 07 00 22 07 00 22 01
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
