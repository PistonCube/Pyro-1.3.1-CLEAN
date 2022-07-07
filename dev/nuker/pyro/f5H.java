// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f5h
{
    public static f5h c;
    public static f5h 0;
    public static f5h 1;
    public static f5h 2;
    public static f5h[] c;
    
    public static f5h c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f5h;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f5h;
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
        //    StackMapTable: 00 0D 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FC 00 03 07 00 21 45 07 00 14 FF 00 00 00 01 07 00 21 00 02 07 00 23 07 00 21 45 07 00 1B 40 07 00 05 43 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Ljava/lang/NegativeArraySizeException;
        //  51     59     51     59     Any
        //  67     69     3      8      Ljava/lang/IllegalStateException;
        //  30     37     37     38     Any
        //  30     37     30     31     Ljava/lang/EnumConstantNotPresentException;
        //  30     37     30     31     Ljava/lang/RuntimeException;
        //  30     37     3      8      Any
        //  30     37     37     38     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 34 out of bounds for length 34
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u23e1\u1492\u8acb\ubf09\ufd72\uedc3"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f5h.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f5h.c:Ldev/nuker/pyro/f5h;
        //    16: new             Ldev/nuker/pyro/f5h;
        //    19: dup            
        //    20: ldc             "\u23fb\u1486\u8ac5\ubf12"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: invokespecial   dev/nuker/pyro/f5h.<init>:(Ljava/lang/String;I)V
        //    29: putstatic       dev/nuker/pyro/f5h.0:Ldev/nuker/pyro/f5h;
        //    32: new             Ldev/nuker/pyro/f5h;
        //    35: dup            
        //    36: ldc             "\u23fc\u149a\u8ac6\ubf0b"
        //    38: invokestatic    invokestatic   !!! ERROR
        //    41: iconst_2       
        //    42: invokespecial   dev/nuker/pyro/f5h.<init>:(Ljava/lang/String;I)V
        //    45: putstatic       dev/nuker/pyro/f5h.1:Ldev/nuker/pyro/f5h;
        //    48: new             Ldev/nuker/pyro/f5h;
        //    51: dup            
        //    52: ldc             "\u23fe\u149f\u8acc\ubf2c\ufd54\uede7"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: iconst_3       
        //    58: getstatic       dev/nuker/pyro/fc.1:I
        //    61: ifeq            69
        //    64: ldc             -511746183
        //    66: goto            71
        //    69: ldc             1281674442
        //    71: ldc             -1106217086
        //    73: ixor           
        //    74: lookupswitch {
        //          -227230904: 100
        //          1601120507: 69
        //          default: 308
        //        }
        //   100: invokespecial   dev/nuker/pyro/f5h.<init>:(Ljava/lang/String;I)V
        //   103: getstatic       dev/nuker/pyro/fc.1:I
        //   106: ifeq            114
        //   109: ldc             -901400885
        //   111: goto            116
        //   114: ldc             1494951316
        //   116: ldc             1812590360
        //   118: ixor           
        //   119: lookupswitch {
        //          -1504945709: 114
        //          890423948: 144
        //          default: 314
        //        }
        //   144: putstatic       dev/nuker/pyro/f5h.2:Ldev/nuker/pyro/f5h;
        //   147: iconst_4       
        //   148: anewarray       Ldev/nuker/pyro/f5h;
        //   151: dup            
        //   152: iconst_0       
        //   153: getstatic       dev/nuker/pyro/fc.c:I
        //   156: ifge            164
        //   159: ldc             -1858538782
        //   161: goto            166
        //   164: ldc             -1098764068
        //   166: ldc             1825169351
        //   168: ixor           
        //   169: lookupswitch {
        //          -766775525: 196
        //          -34525915: 164
        //          default: 312
        //        }
        //   196: getstatic       dev/nuker/pyro/f5h.c:Ldev/nuker/pyro/f5h;
        //   199: aastore        
        //   200: dup            
        //   201: iconst_1       
        //   202: getstatic       dev/nuker/pyro/fc.c:I
        //   205: ifge            213
        //   208: ldc             1382557383
        //   210: goto            215
        //   213: ldc             -743039154
        //   215: ldc             -1428102202
        //   217: ixor           
        //   218: lookupswitch {
        //          -125254399: 213
        //          2035743880: 244
        //          default: 310
        //        }
        //   244: getstatic       dev/nuker/pyro/f5h.0:Ldev/nuker/pyro/f5h;
        //   247: aastore        
        //   248: dup            
        //   249: iconst_2       
        //   250: getstatic       dev/nuker/pyro/f5h.1:Ldev/nuker/pyro/f5h;
        //   253: aastore        
        //   254: dup            
        //   255: iconst_3       
        //   256: getstatic       dev/nuker/pyro/fc.c:I
        //   259: ifge            267
        //   262: ldc             -1105483446
        //   264: goto            269
        //   267: ldc             -502388592
        //   269: ldc             923843600
        //   271: ixor           
        //   272: lookupswitch {
        //          -1995762342: 267
        //          -719416192: 300
        //          default: 316
        //        }
        //   300: getstatic       dev/nuker/pyro/f5h.2:Ldev/nuker/pyro/f5h;
        //   303: aastore        
        //   304: putstatic       dev/nuker/pyro/f5h.c:[Ldev/nuker/pyro/f5h;
        //   307: return         
        //   308: aconst_null    
        //   309: athrow         
        //   310: aconst_null    
        //   311: athrow         
        //   312: aconst_null    
        //   313: athrow         
        //   314: aconst_null    
        //   315: athrow         
        //   316: aconst_null    
        //   317: athrow         
        //    StackMapTable: 00 14 FF 00 45 00 00 00 04 08 00 30 08 00 30 07 00 21 01 FF 00 01 00 00 00 05 08 00 30 08 00 30 07 00 21 01 01 FF 00 1C 00 00 00 04 08 00 30 08 00 30 07 00 21 01 4D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 13 00 00 00 03 07 00 52 07 00 52 01 FF 00 01 00 00 00 04 07 00 52 07 00 52 01 01 FF 00 1D 00 00 00 03 07 00 52 07 00 52 01 FF 00 10 00 00 00 03 07 00 52 07 00 52 01 FF 00 01 00 00 00 04 07 00 52 07 00 52 01 01 FF 00 1C 00 00 00 03 07 00 52 07 00 52 01 FF 00 16 00 00 00 03 07 00 52 07 00 52 01 FF 00 01 00 00 00 04 07 00 52 07 00 52 01 01 FF 00 1E 00 00 00 03 07 00 52 07 00 52 01 FF 00 07 00 00 00 04 08 00 30 08 00 30 07 00 21 01 FF 00 01 00 00 00 03 07 00 52 07 00 52 01 FF 00 01 00 00 00 03 07 00 52 07 00 52 01 41 07 00 03 FF 00 01 00 00 00 03 07 00 52 07 00 52 01
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
    
    public f5h(final String name, final int ordinal) {
        while (true) {
            Label_0015: {
                if (fc.0 != 0) {
                    n = -917359307;
                    break Label_0015;
                }
                n = 2129112598;
            }
            switch (n ^ 0xEEFC5E2C) {
                case -1564634393: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.1 != 0) {
                                n2 = 1318698017;
                                break Label_0058;
                            }
                            n2 = -2053947284;
                        }
                        switch (n2 ^ 0x16FA0EE7) {
                            case -1402178390: {
                                continue;
                            }
                            default: {
                                super(name, ordinal);
                                return;
                            }
                            case 1482928838: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 665742105: {
                    throw null;
                }
            }
            break;
        }
    }
}
