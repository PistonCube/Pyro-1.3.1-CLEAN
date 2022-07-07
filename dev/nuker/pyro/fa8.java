// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum fa8
{
    public static fa8 c;
    public static fa8 0;
    public static fa8 1;
    public static fa8 2;
    public static fa8[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/fa8;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/fa8;
        //    10: dup            
        //    11: ldc             "\u291a\u1495\u8022"
        //    13: getstatic       dev/nuker/pyro/fc.0:I
        //    16: ifeq            24
        //    19: ldc             -801879037
        //    21: goto            26
        //    24: ldc             262382171
        //    26: ldc             -1855162405
        //    28: ixor           
        //    29: lookupswitch {
        //          -1630546560: 56
        //          1096301528: 24
        //          default: 266
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: iconst_0       
        //    60: invokespecial   dev/nuker/pyro/fa8.<init>:(Ljava/lang/String;I)V
        //    63: dup            
        //    64: putstatic       dev/nuker/pyro/fa8.c:Ldev/nuker/pyro/fa8;
        //    67: aastore        
        //    68: dup            
        //    69: iconst_1       
        //    70: new             Ldev/nuker/pyro/fa8;
        //    73: dup            
        //    74: ldc             "\u291a\u1486\u8030\ubf0e\ufa5a\ue73d\ub221"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/fa8.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: putstatic       dev/nuker/pyro/fa8.0:Ldev/nuker/pyro/fa8;
        //    87: aastore        
        //    88: dup            
        //    89: iconst_2       
        //    90: new             Ldev/nuker/pyro/fa8;
        //    93: dup            
        //    94: ldc             "\u2913\u149a\u8028\ubf0e"
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            107
        //   102: ldc             -1703987760
        //   104: goto            109
        //   107: ldc             1224422694
        //   109: ldc             1093330871
        //   111: ixor           
        //   112: lookupswitch {
        //          -616181145: 107
        //          164745873: 140
        //          default: 264
        //        }
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: iconst_2       
        //   144: getstatic       dev/nuker/pyro/fc.0:I
        //   147: ifeq            155
        //   150: ldc             -1624082253
        //   152: goto            157
        //   155: ldc             -1695574706
        //   157: ldc             -1582542247
        //   159: ixor           
        //   160: lookupswitch {
        //          994297623: 188
        //          1050553066: 155
        //          default: 268
        //        }
        //   188: invokespecial   dev/nuker/pyro/fa8.<init>:(Ljava/lang/String;I)V
        //   191: dup            
        //   192: putstatic       dev/nuker/pyro/fa8.1:Ldev/nuker/pyro/fa8;
        //   195: aastore        
        //   196: dup            
        //   197: iconst_3       
        //   198: new             Ldev/nuker/pyro/fa8;
        //   201: dup            
        //   202: ldc             "\u2906\u1487\u8021\ubf0f"
        //   204: getstatic       dev/nuker/pyro/fc.1:I
        //   207: ifeq            215
        //   210: ldc             1137170089
        //   212: goto            217
        //   215: ldc             225350673
        //   217: ldc             -1116571123
        //   219: ixor           
        //   220: lookupswitch {
        //          -1340281316: 248
        //          -21648220: 215
        //          default: 270
        //        }
        //   248: invokestatic    invokestatic   !!! ERROR
        //   251: iconst_3       
        //   252: invokespecial   dev/nuker/pyro/fa8.<init>:(Ljava/lang/String;I)V
        //   255: dup            
        //   256: putstatic       dev/nuker/pyro/fa8.2:Ldev/nuker/pyro/fa8;
        //   259: aastore        
        //   260: putstatic       dev/nuker/pyro/fa8.c:[Ldev/nuker/pyro/fa8;
        //   263: return         
        //   264: aconst_null    
        //   265: athrow         
        //   266: aconst_null    
        //   267: athrow         
        //   268: aconst_null    
        //   269: athrow         
        //   270: aconst_null    
        //   271: athrow         
        //    StackMapTable: 00 10 FF 00 18 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 07 08 00 07 07 00 40 FF 00 01 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 07 08 00 07 07 00 40 01 FF 00 1D 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 07 08 00 07 07 00 40 FF 00 32 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 FF 00 01 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 01 FF 00 1E 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 FF 00 0E 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 01 FF 00 01 00 00 00 09 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 01 01 FF 00 1E 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 01 FF 00 1A 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 C6 08 00 C6 07 00 40 FF 00 01 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 C6 08 00 C6 07 00 40 01 FF 00 1E 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 C6 08 00 C6 07 00 40 FF 00 0F 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 FF 00 01 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 07 08 00 07 07 00 40 FF 00 01 00 00 00 08 07 00 3E 07 00 3E 07 00 3E 01 08 00 5A 08 00 5A 07 00 40 01 FF 00 01 00 00 00 07 07 00 3E 07 00 3E 07 00 3E 01 08 00 C6 08 00 C6 07 00 40
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
    
    public fa8(final String name, final int ordinal) {
        while (true) {
            Label_0014: {
                if (fc.1 != 0) {
                    n = 953126753;
                    break Label_0014;
                }
                n = 1189055878;
            }
            switch (n ^ 0xF1539921) {
                case -912517568: {
                    continue;
                }
                case -1215556441: {
                    while (true) {
                        int n2 = 0;
                        Label_0059: {
                            if (fc.1 != 0) {
                                n2 = 623116986;
                                break Label_0059;
                            }
                            n2 = -911208572;
                        }
                        switch (n2 ^ 0xEF60E536) {
                            case 235044531: {
                                continue;
                            }
                            default: {
                                super(name, ordinal);
                                return;
                            }
                            case -901453940: {
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
    
    public static fa8 c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/fa8;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/fa8;
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
        //    StackMapTable: 00 0D 43 07 00 4C 04 FF 00 0B 00 00 00 01 07 00 4C FC 00 03 07 00 40 45 07 00 52 FF 00 00 00 01 07 00 40 00 02 07 00 66 07 00 40 45 07 00 4C 40 07 00 05 43 07 00 4C 43 05 44 07 00 4C 47 05 47 07 00 4C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/NegativeArraySizeException;
        //  30     37     3      8      Ljava/lang/ClassCastException;
        //  31     37     37     38     Ljava/lang/RuntimeException;
        //  30     37     30     31     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 23 out of bounds for length 23
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
