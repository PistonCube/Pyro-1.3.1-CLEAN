// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f54
{
    public static f54 c;
    public static f54 0;
    public static f54 1;
    public static f54[] c;
    
    public f54(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.0 != 0) {
                    n = -1218526740;
                    break Label_0013;
                }
                n = 2022348754;
            }
            switch (n ^ 0x18C26492) {
                case -1348688514: {
                    continue;
                }
                case 1615393600: {
                    super(name, ordinal);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f54 c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f54;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -586334103
        //    35: goto            40
        //    38: ldc             183181334
        //    40: ldc             -963852007
        //    42: ixor           
        //    43: lookupswitch {
        //          -865605361: 68
        //          461474160: 38
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f54;
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
        //    StackMapTable: 00 11 43 07 00 17 04 FF 00 0B 00 00 00 01 07 00 17 FC 00 03 07 00 3B FF 00 0D 00 01 07 00 3B 00 02 07 00 3D 07 00 3B FF 00 01 00 01 07 00 3B 00 03 07 00 3D 07 00 3B 01 FF 00 1B 00 01 07 00 3B 00 02 07 00 3D 07 00 3B 42 07 00 0E FF 00 00 00 01 07 00 3B 00 02 07 00 3D 07 00 3B 45 07 00 17 40 07 00 05 FF 00 03 00 01 07 00 3B 00 02 07 00 3D 07 00 3B 41 07 00 17 43 05 44 07 00 17 47 05 47 07 00 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Any
        //  110    112    3      8      Any
        //  71     78     78     79     Any
        //  72     78     71     72     Ljava/lang/NegativeArraySizeException;
        //  71     78     71     72     Ljava/lang/ArithmeticException;
        //  71     78     71     72     Ljava/util/NoSuchElementException;
        //  72     78     3      8      Any
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
        //     4: ldc             "\u23ac\u1486\u8a88\ubf0d"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f54.<init>:(Ljava/lang/String;I)V
        //    13: getstatic       dev/nuker/pyro/fc.c:I
        //    16: ifge            24
        //    19: ldc             -145520884
        //    21: goto            26
        //    24: ldc             -1413349624
        //    26: ldc             -352284554
        //    28: ixor           
        //    29: lookupswitch {
        //          -1267325694: 24
        //          475207546: 338
        //          default: 56
        //        }
        //    56: putstatic       dev/nuker/pyro/f54.c:Ldev/nuker/pyro/f54;
        //    59: new             Ldev/nuker/pyro/f54;
        //    62: dup            
        //    63: ldc             "\u23be\u149a\u8a90\ubf07\ufdb5\ued9f"
        //    65: getstatic       dev/nuker/pyro/fc.0:I
        //    68: ifeq            76
        //    71: ldc             -1398864983
        //    73: goto            78
        //    76: ldc             1077264073
        //    78: ldc             1536346699
        //    80: ixor           
        //    81: lookupswitch {
        //          -150091294: 328
        //          859347272: 76
        //          default: 108
        //        }
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: iconst_1       
        //   112: invokespecial   dev/nuker/pyro/f54.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f54.0:Ldev/nuker/pyro/f54;
        //   118: new             Ldev/nuker/pyro/f54;
        //   121: dup            
        //   122: ldc             "\u23a3\u149c\u8a92\ubf07"
        //   124: invokestatic    invokestatic   !!! ERROR
        //   127: iconst_2       
        //   128: invokespecial   dev/nuker/pyro/f54.<init>:(Ljava/lang/String;I)V
        //   131: getstatic       dev/nuker/pyro/fc.1:I
        //   134: ifeq            142
        //   137: ldc             -375995100
        //   139: goto            144
        //   142: ldc             -1809468489
        //   144: ldc             446473667
        //   146: ixor           
        //   147: lookupswitch {
        //          -217423641: 332
        //          904217963: 142
        //          default: 172
        //        }
        //   172: putstatic       dev/nuker/pyro/f54.1:Ldev/nuker/pyro/f54;
        //   175: iconst_3       
        //   176: anewarray       Ldev/nuker/pyro/f54;
        //   179: dup            
        //   180: iconst_0       
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             1558282197
        //   189: goto            194
        //   192: ldc             2039160764
        //   194: ldc             -1936356848
        //   196: ixor           
        //   197: lookupswitch {
        //          -797641275: 192
        //          -182544980: 224
        //          default: 330
        //        }
        //   224: getstatic       dev/nuker/pyro/f54.c:Ldev/nuker/pyro/f54;
        //   227: aastore        
        //   228: dup            
        //   229: iconst_1       
        //   230: getstatic       dev/nuker/pyro/fc.c:I
        //   233: ifge            241
        //   236: ldc             401975205
        //   238: goto            243
        //   241: ldc             -1483800285
        //   243: ldc             1029831974
        //   245: ixor           
        //   246: lookupswitch {
        //          -1695613947: 272
        //          714365571: 241
        //          default: 334
        //        }
        //   272: getstatic       dev/nuker/pyro/f54.0:Ldev/nuker/pyro/f54;
        //   275: aastore        
        //   276: dup            
        //   277: iconst_2       
        //   278: getstatic       dev/nuker/pyro/fc.c:I
        //   281: ifge            289
        //   284: ldc             1562552894
        //   286: goto            291
        //   289: ldc             -663989953
        //   291: ldc             755818080
        //   293: ixor           
        //   294: lookupswitch {
        //          -178221217: 320
        //          1882092638: 289
        //          default: 336
        //        }
        //   320: getstatic       dev/nuker/pyro/f54.1:Ldev/nuker/pyro/f54;
        //   323: aastore        
        //   324: putstatic       dev/nuker/pyro/f54.c:[Ldev/nuker/pyro/f54;
        //   327: return         
        //   328: aconst_null    
        //   329: athrow         
        //   330: aconst_null    
        //   331: athrow         
        //   332: aconst_null    
        //   333: athrow         
        //   334: aconst_null    
        //   335: athrow         
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //    StackMapTable: 00 18 58 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5D 07 00 03 FF 00 13 00 00 00 03 08 00 3B 08 00 3B 07 00 3B FF 00 01 00 00 00 04 08 00 3B 08 00 3B 07 00 3B 01 FF 00 1D 00 00 00 03 08 00 3B 08 00 3B 07 00 3B 61 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 13 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 01 00 00 00 04 07 00 1A 07 00 1A 01 01 FF 00 1D 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 10 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 01 00 00 00 04 07 00 1A 07 00 1A 01 01 FF 00 1C 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 10 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 01 00 00 00 04 07 00 1A 07 00 1A 01 01 FF 00 1C 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 07 00 00 00 03 08 00 3B 08 00 3B 07 00 3B FF 00 01 00 00 00 03 07 00 1A 07 00 1A 01 41 07 00 03 FF 00 01 00 00 00 03 07 00 1A 07 00 1A 01 FF 00 01 00 00 00 03 07 00 1A 07 00 1A 01 41 07 00 03
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
