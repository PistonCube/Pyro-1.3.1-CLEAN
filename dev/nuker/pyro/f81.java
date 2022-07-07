// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f81
{
    public static f81 c;
    public static f81 0;
    public static f81 1;
    public static f81[] c;
    
    public f81(final String name, final int ordinal) {
    }
    
    public static f81 c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f81;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -1223687467
        //    35: goto            40
        //    38: ldc             -1608744372
        //    40: ldc             1784343668
        //    42: ixor           
        //    43: lookupswitch {
        //          -901353928: 68
        //          -582291807: 38
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f81;
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
        //    StackMapTable: 00 12 FF 00 03 00 00 00 01 07 00 1D 43 07 00 1D FC 00 00 07 00 42 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 42 FF 00 0D 00 01 07 00 42 00 02 07 00 44 07 00 42 FF 00 01 00 01 07 00 42 00 03 07 00 44 07 00 42 01 FF 00 1B 00 01 07 00 42 00 02 07 00 44 07 00 42 42 07 00 37 FF 00 00 00 01 07 00 42 00 02 07 00 44 07 00 42 45 07 00 1D 40 07 00 05 FF 00 03 00 01 07 00 42 00 02 07 00 44 07 00 42 41 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 00 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Any
        //  71     78     78     79     Any
        //  72     78     71     72     Ljava/lang/IllegalStateException;
        //  71     78     78     79     Ljava/lang/NegativeArraySizeException;
        //  71     78     78     79     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  71     78     78     79     Any
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
        //     4: ldc             "\u2205\u14b0\u8b12"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.0:I
        //    13: ifeq            21
        //    16: ldc             1460931201
        //    18: goto            23
        //    21: ldc             -978953621
        //    23: ldc             -159226085
        //    25: ixor           
        //    26: lookupswitch {
        //          -1583977062: 21
        //          858013040: 52
        //          default: 332
        //        }
        //    52: invokespecial   dev/nuker/pyro/f81.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f81.c:Ldev/nuker/pyro/f81;
        //    58: new             Ldev/nuker/pyro/f81;
        //    61: dup            
        //    62: ldc             "\u2207\u1496\u8b25\ubf0b\ufd45"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: getstatic       dev/nuker/pyro/fc.1:I
        //    71: ifeq            79
        //    74: ldc             203882486
        //    76: goto            81
        //    79: ldc             -745444462
        //    81: ldc             1327457282
        //    83: ixor           
        //    84: lookupswitch {
        //          -1668411504: 112
        //          1127848948: 79
        //          default: 338
        //        }
        //   112: invokespecial   dev/nuker/pyro/f81.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f81.0:Ldev/nuker/pyro/f81;
        //   118: new             Ldev/nuker/pyro/f81;
        //   121: dup            
        //   122: ldc             "\u221d\u1492\u8b2c\ubf0b\ufd5d\uec21\ub225"
        //   124: getstatic       dev/nuker/pyro/fc.1:I
        //   127: ifeq            135
        //   130: ldc             476891399
        //   132: goto            137
        //   135: ldc             497570720
        //   137: ldc             2029338872
        //   139: ixor           
        //   140: lookupswitch {
        //          1687783935: 135
        //          1700598616: 168
        //          default: 334
        //        }
        //   168: invokestatic    invokestatic   !!! ERROR
        //   171: iconst_2       
        //   172: getstatic       dev/nuker/pyro/fc.c:I
        //   175: ifge            183
        //   178: ldc             515850662
        //   180: goto            185
        //   183: ldc             -1018663138
        //   185: ldc             1207343164
        //   187: ixor           
        //   188: lookupswitch {
        //          -2067859678: 216
        //          1498012058: 183
        //          default: 340
        //        }
        //   216: invokespecial   dev/nuker/pyro/f81.<init>:(Ljava/lang/String;I)V
        //   219: putstatic       dev/nuker/pyro/f81.1:Ldev/nuker/pyro/f81;
        //   222: iconst_3       
        //   223: anewarray       Ldev/nuker/pyro/f81;
        //   226: dup            
        //   227: iconst_0       
        //   228: getstatic       dev/nuker/pyro/f81.c:Ldev/nuker/pyro/f81;
        //   231: aastore        
        //   232: dup            
        //   233: iconst_1       
        //   234: getstatic       dev/nuker/pyro/fc.1:I
        //   237: ifeq            245
        //   240: ldc             -1846143087
        //   242: goto            247
        //   245: ldc             -366744161
        //   247: ldc             -1505188999
        //   249: ixor           
        //   250: lookupswitch {
        //          935245032: 245
        //          1282100966: 276
        //          default: 336
        //        }
        //   276: getstatic       dev/nuker/pyro/f81.0:Ldev/nuker/pyro/f81;
        //   279: aastore        
        //   280: dup            
        //   281: iconst_2       
        //   282: getstatic       dev/nuker/pyro/f81.1:Ldev/nuker/pyro/f81;
        //   285: aastore        
        //   286: getstatic       dev/nuker/pyro/fc.c:I
        //   289: ifge            297
        //   292: ldc             -124745499
        //   294: goto            299
        //   297: ldc             1977683274
        //   299: ldc             -155608042
        //   301: ixor           
        //   302: lookupswitch {
        //          -2091347620: 328
        //          237573363: 297
        //          default: 342
        //        }
        //   328: putstatic       dev/nuker/pyro/f81.c:[Ldev/nuker/pyro/f81;
        //   331: return         
        //   332: aconst_null    
        //   333: athrow         
        //   334: aconst_null    
        //   335: athrow         
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //    StackMapTable: 00 18 FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 42 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 42 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 42 01 FF 00 1A 00 00 00 04 08 00 3A 08 00 3A 07 00 42 01 FF 00 01 00 00 00 05 08 00 3A 08 00 3A 07 00 42 01 01 FF 00 1E 00 00 00 04 08 00 3A 08 00 3A 07 00 42 01 FF 00 16 00 00 00 03 08 00 76 08 00 76 07 00 42 FF 00 01 00 00 00 04 08 00 76 08 00 76 07 00 42 01 FF 00 1E 00 00 00 03 08 00 76 08 00 76 07 00 42 FF 00 0E 00 00 00 04 08 00 76 08 00 76 07 00 42 01 FF 00 01 00 00 00 05 08 00 76 08 00 76 07 00 42 01 01 FF 00 1E 00 00 00 04 08 00 76 08 00 76 07 00 42 01 FF 00 1C 00 00 00 03 07 00 2A 07 00 2A 01 FF 00 01 00 00 00 04 07 00 2A 07 00 2A 01 01 FF 00 1C 00 00 00 03 07 00 2A 07 00 2A 01 54 07 00 2A FF 00 01 00 00 00 02 07 00 2A 01 5C 07 00 2A FF 00 03 00 00 00 04 08 00 00 08 00 00 07 00 42 01 FF 00 01 00 00 00 03 08 00 76 08 00 76 07 00 42 FF 00 01 00 00 00 03 07 00 2A 07 00 2A 01 FF 00 01 00 00 00 04 08 00 3A 08 00 3A 07 00 42 01 FF 00 01 00 00 00 04 08 00 76 08 00 76 07 00 42 01 41 07 00 2A
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
