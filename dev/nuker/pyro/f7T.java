// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f7t
{
    public static f7t c;
    public static f7t 0;
    public static f7t 1;
    public static f7t[] c;
    
    public static f7t c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f7t;.class
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -1584134609
        //    34: goto            39
        //    37: ldc             -861480500
        //    39: ldc             -1799831077
        //    41: ixor           
        //    42: lookupswitch {
        //          -1002239804: 37
        //          892127220: 84
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/f7t;
        //    83: areturn        
        //    84: aconst_null    
        //    85: athrow         
        //    86: pop            
        //    87: goto            24
        //    90: pop            
        //    91: aconst_null    
        //    92: goto            86
        //    95: dup            
        //    96: ifnull          86
        //    99: checkcast       Ljava/lang/Throwable;
        //   102: athrow         
        //   103: dup            
        //   104: ifnull          90
        //   107: checkcast       Ljava/lang/Throwable;
        //   110: athrow         
        //   111: aconst_null    
        //   112: athrow         
        //    StackMapTable: 00 11 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FC 00 03 07 00 21 4C 07 00 23 FF 00 01 00 01 07 00 21 00 02 07 00 23 01 5C 07 00 23 FF 00 03 00 00 00 01 07 00 18 FF 00 00 00 01 07 00 21 00 02 07 00 23 07 00 21 45 07 00 18 40 07 00 05 43 07 00 23 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     95     103    Ljava/lang/RuntimeException;
        //  95     103    95     103    Any
        //  111    113    3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Ljava/lang/EnumConstantNotPresentException;
        //  73     79     3      8      Ljava/lang/AssertionError;
        //  73     79     3      8      Any
        //  73     79     79     80     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 43 out of bounds for length 43
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
    
    public f7t(final String name, final int ordinal) {
        while (true) {
            Label_0014: {
                if (fc.1 != 0) {
                    n = 1586138247;
                    break Label_0014;
                }
                n = -247253679;
            }
            switch (n ^ 0xDC64010F) {
                case -1298437326: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case -2098295416: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2238\u1492\u8b0a\ubf07\ufd2f\uec3a\ub230\ue721\ud5b2\udd48\ua6cc"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            21
        //    16: ldc             48136150
        //    18: goto            23
        //    21: ldc             -1987635849
        //    23: ldc             -659637969
        //    25: ixor           
        //    26: lookupswitch {
        //          -630143239: 201
        //          898603812: 21
        //          default: 52
        //        }
        //    52: invokespecial   dev/nuker/pyro/f7t.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f7t.c:Ldev/nuker/pyro/f7t;
        //    58: new             Ldev/nuker/pyro/f7t;
        //    61: dup            
        //    62: ldc             "\u223b\u149a\u8b1d\ubf09"
        //    64: getstatic       dev/nuker/pyro/fc.c:I
        //    67: ifge            75
        //    70: ldc             -1589065034
        //    72: goto            77
        //    75: ldc             341618760
        //    77: ldc             902333917
        //    79: ixor           
        //    80: lookupswitch {
        //          -1803530389: 75
        //          563361173: 108
        //          default: 203
        //        }
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: iconst_1       
        //   112: invokespecial   dev/nuker/pyro/f7t.<init>:(Ljava/lang/String;I)V
        //   115: getstatic       dev/nuker/pyro/fc.0:I
        //   118: ifeq            126
        //   121: ldc             366668260
        //   123: goto            128
        //   126: ldc             1490107284
        //   128: ldc             938223169
        //   130: ixor           
        //   131: lookupswitch {
        //          574017445: 126
        //          1866276309: 156
        //          default: 205
        //        }
        //   156: putstatic       dev/nuker/pyro/f7t.0:Ldev/nuker/pyro/f7t;
        //   159: new             Ldev/nuker/pyro/f7t;
        //   162: dup            
        //   163: ldc             "\u222e\u14b2\u8b3d"
        //   165: invokestatic    invokestatic   !!! ERROR
        //   168: iconst_2       
        //   169: invokespecial   dev/nuker/pyro/f7t.<init>:(Ljava/lang/String;I)V
        //   172: putstatic       dev/nuker/pyro/f7t.1:Ldev/nuker/pyro/f7t;
        //   175: iconst_3       
        //   176: anewarray       Ldev/nuker/pyro/f7t;
        //   179: dup            
        //   180: iconst_0       
        //   181: getstatic       dev/nuker/pyro/f7t.c:Ldev/nuker/pyro/f7t;
        //   184: aastore        
        //   185: dup            
        //   186: iconst_1       
        //   187: getstatic       dev/nuker/pyro/f7t.0:Ldev/nuker/pyro/f7t;
        //   190: aastore        
        //   191: dup            
        //   192: iconst_2       
        //   193: getstatic       dev/nuker/pyro/f7t.1:Ldev/nuker/pyro/f7t;
        //   196: aastore        
        //   197: putstatic       dev/nuker/pyro/f7t.c:[Ldev/nuker/pyro/f7t;
        //   200: return         
        //   201: aconst_null    
        //   202: athrow         
        //   203: aconst_null    
        //   204: athrow         
        //   205: aconst_null    
        //   206: athrow         
        //    StackMapTable: 00 0C FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 21 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 21 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 21 01 FF 00 16 00 00 00 03 08 00 3A 08 00 3A 07 00 21 FF 00 01 00 00 00 04 08 00 3A 08 00 3A 07 00 21 01 FF 00 1E 00 00 00 03 08 00 3A 08 00 3A 07 00 21 51 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 2C 00 00 00 04 08 00 00 08 00 00 07 00 21 01 FF 00 01 00 00 00 03 08 00 3A 08 00 3A 07 00 21 41 07 00 03
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
