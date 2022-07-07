// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum fbw
{
    public static fbw c;
    public static fbw 0;
    public static fbw 1;
    public static fbw 2;
    public static fbw[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2979\u149c\u8052\ubf30\ufbf0\ue741\ub228\uec6a\ud5b0\udb83\uad90\u1e4e\ueb43\uc979"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/fbw.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/fbw.c:Ldev/nuker/pyro/fbw;
        //    16: new             Ldev/nuker/pyro/fbw;
        //    19: dup            
        //    20: ldc             "\u2979\u1496\u804f\ubf05\ufbfd\ue753\ub22b\uec79\ud5a0"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             2038126454
        //    34: goto            39
        //    37: ldc             -597622886
        //    39: ldc             -1804585684
        //    41: ixor           
        //    42: lookupswitch {
        //          -318021030: 222
        //          1575276782: 37
        //          default: 68
        //        }
        //    68: invokespecial   dev/nuker/pyro/fbw.<init>:(Ljava/lang/String;I)V
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            82
        //    77: ldc             -1627829257
        //    79: goto            84
        //    82: ldc             46255224
        //    84: ldc             34881361
        //    86: ixor           
        //    87: lookupswitch {
        //          -1662159706: 82
        //          14021417: 112
        //          default: 224
        //        }
        //   112: putstatic       dev/nuker/pyro/fbw.0:Ldev/nuker/pyro/fbw;
        //   115: new             Ldev/nuker/pyro/fbw;
        //   118: dup            
        //   119: ldc             "\u2974\u1492\u8048\ubf16\ufbc5\ue75d\ub225\uec68\ud5b6"
        //   121: getstatic       dev/nuker/pyro/fc.c:I
        //   124: ifge            132
        //   127: ldc             2043269283
        //   129: goto            134
        //   132: ldc             827323625
        //   134: ldc             1325600650
        //   136: ixor           
        //   137: lookupswitch {
        //          -1404350773: 132
        //          919265065: 226
        //          default: 164
        //        }
        //   164: invokestatic    invokestatic   !!! ERROR
        //   167: iconst_2       
        //   168: invokespecial   dev/nuker/pyro/fbw.<init>:(Ljava/lang/String;I)V
        //   171: putstatic       dev/nuker/pyro/fbw.1:Ldev/nuker/pyro/fbw;
        //   174: new             Ldev/nuker/pyro/fbw;
        //   177: dup            
        //   178: ldc             "\u2967\u149f\u8047\ubf01\ufbf0\ue755"
        //   180: invokestatic    invokestatic   !!! ERROR
        //   183: iconst_3       
        //   184: invokespecial   dev/nuker/pyro/fbw.<init>:(Ljava/lang/String;I)V
        //   187: putstatic       dev/nuker/pyro/fbw.2:Ldev/nuker/pyro/fbw;
        //   190: iconst_4       
        //   191: anewarray       Ldev/nuker/pyro/fbw;
        //   194: dup            
        //   195: iconst_0       
        //   196: getstatic       dev/nuker/pyro/fbw.c:Ldev/nuker/pyro/fbw;
        //   199: aastore        
        //   200: dup            
        //   201: iconst_1       
        //   202: getstatic       dev/nuker/pyro/fbw.0:Ldev/nuker/pyro/fbw;
        //   205: aastore        
        //   206: dup            
        //   207: iconst_2       
        //   208: getstatic       dev/nuker/pyro/fbw.1:Ldev/nuker/pyro/fbw;
        //   211: aastore        
        //   212: dup            
        //   213: iconst_3       
        //   214: getstatic       dev/nuker/pyro/fbw.2:Ldev/nuker/pyro/fbw;
        //   217: aastore        
        //   218: putstatic       dev/nuker/pyro/fbw.c:[Ldev/nuker/pyro/fbw;
        //   221: return         
        //   222: aconst_null    
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //    StackMapTable: 00 0C FF 00 25 00 00 00 04 08 00 10 08 00 10 07 00 3C 01 FF 00 01 00 00 00 05 08 00 10 08 00 10 07 00 3C 01 01 FF 00 1C 00 00 00 04 08 00 10 08 00 10 07 00 3C 01 4D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 13 00 00 00 03 08 00 73 08 00 73 07 00 3C FF 00 01 00 00 00 04 08 00 73 08 00 73 07 00 3C 01 FF 00 1D 00 00 00 03 08 00 73 08 00 73 07 00 3C FF 00 39 00 00 00 04 08 00 10 08 00 10 07 00 3C 01 41 07 00 03 FF 00 01 00 00 00 03 08 00 73 08 00 73 07 00 3C
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
    
    public fbw(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.c < 0) {
                    n = 627384073;
                    break Label_0013;
                }
                n = 1533313419;
            }
            switch (n ^ 0x9C0726E4) {
                case -1184744979: {
                    continue;
                }
                case -949770385: {
                    while (true) {
                        int n2 = 0;
                        Label_0059: {
                            if (fc.0 != 0) {
                                n2 = 2067985134;
                                break Label_0059;
                            }
                            n2 = -1232052838;
                        }
                        switch (n2 ^ 0x9A443E70) {
                            case -519648098: {
                                continue;
                            }
                            case 752116714: {
                                super(name, ordinal);
                                return;
                            }
                            default: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static fbw c(final String p0) {
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
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/fbw;.class
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -1755550660
        //    34: goto            39
        //    37: ldc             -1785291393
        //    39: ldc             -1758188867
        //    41: ixor           
        //    42: lookupswitch {
        //          6833793: 37
        //          44218306: 68
        //          default: 84
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/fbw;
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
        //   111: nop            
        //   112: athrow         
        //    StackMapTable: 00 12 FF 00 03 00 00 00 01 07 00 46 43 07 00 46 FC 00 00 07 00 3C FF 00 0B 00 00 00 01 07 00 46 FC 00 03 07 00 3C 4C 07 00 69 FF 00 01 00 01 07 00 3C 00 02 07 00 69 01 5C 07 00 69 43 07 00 46 FF 00 00 00 01 07 00 3C 00 02 07 00 69 07 00 3C 45 07 00 46 40 07 00 05 43 07 00 69 41 07 00 46 43 05 44 07 00 46 47 05 FF 00 07 00 00 00 01 07 00 46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     95     103    Ljava/lang/ArithmeticException;
        //  95     103    95     103    Any
        //  72     79     79     80     Any
        //  73     79     72     73     Any
        //  72     79     72     73     Ljava/lang/UnsupportedOperationException;
        //  72     79     79     80     Ljava/lang/ArithmeticException;
        //  73     79     79     80     Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 39 out of bounds for length 39
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
