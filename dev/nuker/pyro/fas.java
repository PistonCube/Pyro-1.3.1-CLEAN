// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum faS
{
    public static faS c;
    public static faS 0;
    public static faS 1;
    public static faS 2;
    public static faS 3;
    public static faS[] c;
    
    public faS(final String name, final int ordinal) {
        while (true) {
            Label_0015: {
                if (fc.0 != 0) {
                    n = 991710497;
                    break Label_0015;
                }
                n = -817591838;
            }
            switch (n ^ 0xDC78C318) {
                case -412840391: {
                    continue;
                }
                case 322718458: {
                    super(name, ordinal);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static faS c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          67
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/faS;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/faS;
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
        //    StackMapTable: 00 0D 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 1A 45 07 00 38 FF 00 00 00 01 07 00 1A 00 02 07 00 40 07 00 1A 45 07 00 28 40 07 00 05 43 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Ljava/lang/NegativeArraySizeException;
        //  51     59     51     59     Ljava/lang/AssertionError;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/ClassCastException;
        //  30     37     37     38     Ljava/lang/NegativeArraySizeException;
        //  31     37     3      8      Any
        //  30     37     3      8      Ljava/lang/EnumConstantNotPresentException;
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
        //     1: anewarray       Ldev/nuker/pyro/faS;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/faS;
        //    10: dup            
        //    11: ldc             "\u2933\u1481\u800c\ubf03\ufa3c\ue71f\ub232\uec21"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/faS.<init>:(Ljava/lang/String;I)V
        //    20: dup            
        //    21: putstatic       dev/nuker/pyro/faS.c:Ldev/nuker/pyro/faS;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: new             Ldev/nuker/pyro/faS;
        //    30: dup            
        //    31: ldc             "\u2923\u1486\u801b\ubf14\ufa21\ue700\ub225\uec28"
        //    33: getstatic       dev/nuker/pyro/fc.0:I
        //    36: ifeq            44
        //    39: ldc             -317400078
        //    41: goto            46
        //    44: ldc             -235689937
        //    46: ldc             -1462792951
        //    48: ixor           
        //    49: lookupswitch {
        //          -159262585: 44
        //          1172002555: 284
        //          default: 76
        //        }
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/faS.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            95
        //    90: ldc             1360159855
        //    92: goto            97
        //    95: ldc             1858622078
        //    97: ldc             -66362960
        //    99: ixor           
        //   100: lookupswitch {
        //          -1832700978: 128
        //          -1390869025: 95
        //          default: 290
        //        }
        //   128: putstatic       dev/nuker/pyro/faS.0:Ldev/nuker/pyro/faS;
        //   131: aastore        
        //   132: dup            
        //   133: iconst_2       
        //   134: new             Ldev/nuker/pyro/faS;
        //   137: dup            
        //   138: ldc             "\u2923\u1496\u8005\ubf07\ufa2b\ue702\ub22d\uec32\ud5b6"
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: iconst_2       
        //   144: invokespecial   dev/nuker/pyro/faS.<init>:(Ljava/lang/String;I)V
        //   147: dup            
        //   148: putstatic       dev/nuker/pyro/faS.1:Ldev/nuker/pyro/faS;
        //   151: aastore        
        //   152: dup            
        //   153: iconst_3       
        //   154: new             Ldev/nuker/pyro/faS;
        //   157: dup            
        //   158: ldc             "\u2936\u1492\u801b\ubf0f"
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: iconst_3       
        //   164: getstatic       dev/nuker/pyro/fc.0:I
        //   167: ifeq            175
        //   170: ldc             -2130571777
        //   172: goto            177
        //   175: ldc             -852054968
        //   177: ldc             1956775101
        //   179: ixor           
        //   180: lookupswitch {
        //          -1309837384: 175
        //          -174061246: 288
        //          default: 208
        //        }
        //   208: invokespecial   dev/nuker/pyro/faS.<init>:(Ljava/lang/String;I)V
        //   211: dup            
        //   212: putstatic       dev/nuker/pyro/faS.2:Ldev/nuker/pyro/faS;
        //   215: aastore        
        //   216: dup            
        //   217: iconst_4       
        //   218: new             Ldev/nuker/pyro/faS;
        //   221: dup            
        //   222: ldc             "\u293c\u1492\u801e\ubf0c\ufa25\ue719\ub233\uec21\ud5a1"
        //   224: getstatic       dev/nuker/pyro/fc.1:I
        //   227: ifeq            235
        //   230: ldc             -1465597245
        //   232: goto            237
        //   235: ldc             2140656638
        //   237: ldc             32605008
        //   239: ixor           
        //   240: lookupswitch {
        //          -1454030445: 286
        //          -1148008747: 235
        //          default: 268
        //        }
        //   268: invokestatic    invokestatic   !!! ERROR
        //   271: iconst_4       
        //   272: invokespecial   dev/nuker/pyro/faS.<init>:(Ljava/lang/String;I)V
        //   275: dup            
        //   276: putstatic       dev/nuker/pyro/faS.3:Ldev/nuker/pyro/faS;
        //   279: aastore        
        //   280: putstatic       dev/nuker/pyro/faS.c:[Ldev/nuker/pyro/faS;
        //   283: return         
        //   284: aconst_null    
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //   288: aconst_null    
        //   289: athrow         
        //   290: aconst_null    
        //   291: athrow         
        //    StackMapTable: 00 10 FF 00 2C 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 1B 08 00 1B 07 00 1A FF 00 01 00 00 00 08 07 00 2B 07 00 2B 07 00 2B 01 08 00 1B 08 00 1B 07 00 1A 01 FF 00 1D 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 1B 08 00 1B 07 00 1A FF 00 12 00 00 00 06 07 00 2B 07 00 2B 07 00 2B 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 2B 07 00 2B 07 00 2B 01 07 00 03 07 00 03 FF 00 2E 00 00 00 08 07 00 2B 07 00 2B 07 00 2B 01 08 00 9A 08 00 9A 07 00 1A 01 FF 00 01 00 00 00 09 07 00 2B 07 00 2B 07 00 2B 01 08 00 9A 08 00 9A 07 00 1A 01 01 FF 00 1E 00 00 00 08 07 00 2B 07 00 2B 07 00 2B 01 08 00 9A 08 00 9A 07 00 1A 01 FF 00 1A 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 DA 08 00 DA 07 00 1A FF 00 01 00 00 00 08 07 00 2B 07 00 2B 07 00 2B 01 08 00 DA 08 00 DA 07 00 1A 01 FF 00 1E 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 DA 08 00 DA 07 00 1A FF 00 0F 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 1B 08 00 1B 07 00 1A FF 00 01 00 00 00 07 07 00 2B 07 00 2B 07 00 2B 01 08 00 DA 08 00 DA 07 00 1A FF 00 01 00 00 00 08 07 00 2B 07 00 2B 07 00 2B 01 08 00 9A 08 00 9A 07 00 1A 01 FF 00 01 00 00 00 06 07 00 2B 07 00 2B 07 00 2B 01 07 00 03 07 00 03
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
