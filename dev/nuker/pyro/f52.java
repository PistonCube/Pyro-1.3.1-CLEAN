// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f52
{
    public static f52 c;
    public static f52 0;
    public static f52 1;
    public static f52[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u23ae\u149f\u8a89\ubf03\ufda4\ued9a"
        //     6: getstatic       dev/nuker/pyro/fc.0:I
        //     9: ifeq            17
        //    12: ldc             -514843367
        //    14: goto            19
        //    17: ldc             199583080
        //    19: ldc             1365774707
        //    21: ixor           
        //    22: lookupswitch {
        //          -1338504086: 17
        //          1519219739: 48
        //          default: 292
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: getstatic       dev/nuker/pyro/fc.c:I
        //    55: ifge            63
        //    58: ldc             41748318
        //    60: goto            65
        //    63: ldc             -1617338010
        //    65: ldc             -903994719
        //    67: ixor           
        //    68: lookupswitch {
        //          -933026305: 63
        //          1434928071: 96
        //          default: 294
        //        }
        //    96: invokespecial   dev/nuker/pyro/f52.<init>:(Ljava/lang/String;I)V
        //    99: getstatic       dev/nuker/pyro/fc.1:I
        //   102: ifeq            110
        //   105: ldc             1449937915
        //   107: goto            112
        //   110: ldc             -174775809
        //   112: ldc             -1056869304
        //   114: ixor           
        //   115: lookupswitch {
        //          -1754447949: 110
        //          882136503: 140
        //          default: 288
        //        }
        //   140: putstatic       dev/nuker/pyro/f52.c:Ldev/nuker/pyro/f52;
        //   143: new             Ldev/nuker/pyro/f52;
        //   146: dup            
        //   147: ldc             "\u23bc\u149e\u8a9f\ubf10\ufda9"
        //   149: invokestatic    invokestatic   !!! ERROR
        //   152: iconst_1       
        //   153: invokespecial   dev/nuker/pyro/f52.<init>:(Ljava/lang/String;I)V
        //   156: getstatic       dev/nuker/pyro/fc.c:I
        //   159: ifge            167
        //   162: ldc             767122103
        //   164: goto            169
        //   167: ldc             -955259515
        //   169: ldc             -2028866761
        //   171: ixor           
        //   172: lookupswitch {
        //          -1450132596: 167
        //          -1431787136: 296
        //          default: 200
        //        }
        //   200: putstatic       dev/nuker/pyro/f52.0:Ldev/nuker/pyro/f52;
        //   203: new             Ldev/nuker/pyro/f52;
        //   206: dup            
        //   207: ldc             "\u23a0\u149d\u8a92\ubf1b\ufd92\ued9e\ub22a"
        //   209: invokestatic    invokestatic   !!! ERROR
        //   212: iconst_2       
        //   213: invokespecial   dev/nuker/pyro/f52.<init>:(Ljava/lang/String;I)V
        //   216: putstatic       dev/nuker/pyro/f52.1:Ldev/nuker/pyro/f52;
        //   219: iconst_3       
        //   220: anewarray       Ldev/nuker/pyro/f52;
        //   223: dup            
        //   224: iconst_0       
        //   225: getstatic       dev/nuker/pyro/f52.c:Ldev/nuker/pyro/f52;
        //   228: aastore        
        //   229: dup            
        //   230: iconst_1       
        //   231: getstatic       dev/nuker/pyro/f52.0:Ldev/nuker/pyro/f52;
        //   234: aastore        
        //   235: dup            
        //   236: iconst_2       
        //   237: getstatic       dev/nuker/pyro/f52.1:Ldev/nuker/pyro/f52;
        //   240: aastore        
        //   241: getstatic       dev/nuker/pyro/fc.0:I
        //   244: ifeq            252
        //   247: ldc             -840444542
        //   249: goto            254
        //   252: ldc             1562597129
        //   254: ldc             43175662
        //   256: ixor           
        //   257: lookupswitch {
        //          -814408852: 290
        //          674310220: 252
        //          default: 284
        //        }
        //   284: putstatic       dev/nuker/pyro/f52.c:[Ldev/nuker/pyro/f52;
        //   287: return         
        //   288: aconst_null    
        //   289: athrow         
        //   290: aconst_null    
        //   291: athrow         
        //   292: aconst_null    
        //   293: athrow         
        //   294: aconst_null    
        //   295: athrow         
        //   296: aconst_null    
        //   297: athrow         
        //    StackMapTable: 00 14 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 3D FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 3D 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 3D FF 00 0E 00 00 00 04 08 00 00 08 00 00 07 00 3D 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 3D 01 01 FF 00 1E 00 00 00 04 08 00 00 08 00 00 07 00 3D 01 4D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 5A 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5E 07 00 03 73 07 00 3E FF 00 01 00 00 00 02 07 00 3E 01 5D 07 00 3E 43 07 00 03 41 07 00 3E FF 00 01 00 00 00 03 08 00 00 08 00 00 07 00 3D FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 3D 01 41 07 00 03
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
    
    public f52(final String name, final int ordinal) {
        while (true) {
            Label_0014: {
                if (fc.c < 0) {
                    n = 1054647650;
                    break Label_0014;
                }
                n = -1823136013;
            }
            switch (n ^ 0x539E535B) {
                case 1702520646: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case 1833104953: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f52 c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f52;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -323795320
        //    35: goto            40
        //    38: ldc             -1896857632
        //    40: ldc             581774591
        //    42: ixor           
        //    43: lookupswitch {
        //          -1403186401: 68
        //          -836867465: 38
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f52;
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
        //    StackMapTable: 00 11 43 07 00 4C 04 FF 00 0B 00 00 00 01 07 00 4C FC 00 03 07 00 3D FF 00 0D 00 01 07 00 3D 00 02 07 00 64 07 00 3D FF 00 01 00 01 07 00 3D 00 03 07 00 64 07 00 3D 01 FF 00 1B 00 01 07 00 3D 00 02 07 00 64 07 00 3D 42 07 00 4A FF 00 00 00 01 07 00 3D 00 02 07 00 64 07 00 3D 45 07 00 4C 40 07 00 05 FF 00 03 00 01 07 00 3D 00 02 07 00 64 07 00 3D 41 07 00 4A 43 05 44 07 00 4A 47 05 47 07 00 4C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     94     102    Ljava/lang/UnsupportedOperationException;
        //  94     102    94     102    Ljava/lang/ClassCastException;
        //  110    112    3      8      Any
        //  71     78     78     79     Any
        //  72     78     71     72     Ljava/lang/NullPointerException;
        //  72     78     78     79     Any
        //  71     78     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  71     78     71     72     Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 44 out of bounds for length 44
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
}
