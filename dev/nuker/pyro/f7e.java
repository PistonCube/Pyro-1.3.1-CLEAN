// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f7E
{
    public static f7E c;
    public static f7E 0;
    public static f7E 1;
    public static f7E 2;
    public static f7E[] c;
    
    public f7E(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.c < 0) {
                    n = -1924994686;
                    break Label_0013;
                }
                n = 587879798;
            }
            switch (n ^ 0x6038A89C) {
                case -310755042: {
                    continue;
                }
                case 1127415274: {
                    super(name, ordinal);
                }
                default: {
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
        //     4: ldc             "\u2208\u149a\u8b2e\ubf09\ufd5f"
        //     6: getstatic       dev/nuker/pyro/fc.1:I
        //     9: ifeq            17
        //    12: ldc             -243010313
        //    14: goto            19
        //    17: ldc             495436506
        //    19: ldc             1473308379
        //    21: ixor           
        //    22: lookupswitch {
        //          -1504505300: 17
        //          1247224833: 48
        //          default: 312
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: invokespecial   dev/nuker/pyro/f7E.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f7E.c:Ldev/nuker/pyro/f7E;
        //    58: new             Ldev/nuker/pyro/f7E;
        //    61: dup            
        //    62: ldc             "\u221a\u1492\u8b3e\ubf16"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f7E.<init>:(Ljava/lang/String;I)V
        //    71: putstatic       dev/nuker/pyro/f7E.0:Ldev/nuker/pyro/f7E;
        //    74: new             Ldev/nuker/pyro/f7E;
        //    77: dup            
        //    78: ldc             "\u2217\u1492\u8b23\ubf05\ufd4d\uec28\ub22b\ue70f"
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: iconst_2       
        //    84: invokespecial   dev/nuker/pyro/f7E.<init>:(Ljava/lang/String;I)V
        //    87: putstatic       dev/nuker/pyro/f7E.1:Ldev/nuker/pyro/f7E;
        //    90: new             Ldev/nuker/pyro/f7E;
        //    93: dup            
        //    94: ldc             "\u2218\u1496\u8b28\ubf10"
        //    96: getstatic       dev/nuker/pyro/fc.0:I
        //    99: ifeq            107
        //   102: ldc             -1997473269
        //   104: goto            109
        //   107: ldc             563898570
        //   109: ldc             172337276
        //   111: ixor           
        //   112: lookupswitch {
        //          -2102046089: 107
        //          735690934: 140
        //          default: 314
        //        }
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: iconst_3       
        //   144: invokespecial   dev/nuker/pyro/f7E.<init>:(Ljava/lang/String;I)V
        //   147: putstatic       dev/nuker/pyro/f7E.2:Ldev/nuker/pyro/f7E;
        //   150: iconst_4       
        //   151: anewarray       Ldev/nuker/pyro/f7E;
        //   154: dup            
        //   155: iconst_0       
        //   156: getstatic       dev/nuker/pyro/f7E.c:Ldev/nuker/pyro/f7E;
        //   159: aastore        
        //   160: dup            
        //   161: iconst_1       
        //   162: getstatic       dev/nuker/pyro/fc.1:I
        //   165: ifeq            173
        //   168: ldc             1940702755
        //   170: goto            175
        //   173: ldc             -643420867
        //   175: ldc             1952640670
        //   177: ixor           
        //   178: lookupswitch {
        //          -1379613789: 204
        //          130951357: 173
        //          default: 316
        //        }
        //   204: getstatic       dev/nuker/pyro/f7E.0:Ldev/nuker/pyro/f7E;
        //   207: aastore        
        //   208: dup            
        //   209: iconst_2       
        //   210: getstatic       dev/nuker/pyro/f7E.1:Ldev/nuker/pyro/f7E;
        //   213: aastore        
        //   214: dup            
        //   215: iconst_3       
        //   216: getstatic       dev/nuker/pyro/fc.c:I
        //   219: ifge            227
        //   222: ldc             -2039455020
        //   224: goto            229
        //   227: ldc             -814172651
        //   229: ldc             -440592090
        //   231: ixor           
        //   232: lookupswitch {
        //          1524734774: 227
        //          1674410994: 320
        //          default: 260
        //        }
        //   260: getstatic       dev/nuker/pyro/f7E.2:Ldev/nuker/pyro/f7E;
        //   263: aastore        
        //   264: getstatic       dev/nuker/pyro/fc.c:I
        //   267: ifge            275
        //   270: ldc             949974673
        //   272: goto            277
        //   275: ldc             -675302142
        //   277: ldc             2054259189
        //   279: ixor           
        //   280: lookupswitch {
        //          -1378994953: 308
        //          1122957156: 275
        //          default: 318
        //        }
        //   308: putstatic       dev/nuker/pyro/f7E.c:[Ldev/nuker/pyro/f7E;
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
        //    StackMapTable: 00 14 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 46 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 46 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 46 FF 00 3A 00 00 00 03 08 00 5A 08 00 5A 07 00 46 FF 00 01 00 00 00 04 08 00 5A 08 00 5A 07 00 46 01 FF 00 1E 00 00 00 03 08 00 5A 08 00 5A 07 00 46 FF 00 20 00 00 00 03 07 00 47 07 00 47 01 FF 00 01 00 00 00 04 07 00 47 07 00 47 01 01 FF 00 1C 00 00 00 03 07 00 47 07 00 47 01 FF 00 16 00 00 00 03 07 00 47 07 00 47 01 FF 00 01 00 00 00 04 07 00 47 07 00 47 01 01 FF 00 1E 00 00 00 03 07 00 47 07 00 47 01 4E 07 00 47 FF 00 01 00 00 00 02 07 00 47 01 5E 07 00 47 FF 00 03 00 00 00 03 08 00 00 08 00 00 07 00 46 FF 00 01 00 00 00 03 08 00 5A 08 00 5A 07 00 46 FF 00 01 00 00 00 03 07 00 47 07 00 47 01 41 07 00 47 FF 00 01 00 00 00 03 07 00 47 07 00 47 01
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
    
    public static f7E c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f7E;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -125787841
        //    35: goto            40
        //    38: ldc             -968806778
        //    40: ldc             -2107054150
        //    42: ixor           
        //    43: lookupswitch {
        //          958641241: 38
        //          2062042757: 83
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f7E;
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
        //    StackMapTable: 00 11 43 07 00 53 04 FF 00 0B 00 00 00 01 07 00 53 FC 00 03 07 00 46 FF 00 0D 00 01 07 00 46 00 02 07 00 67 07 00 46 FF 00 01 00 01 07 00 46 00 03 07 00 67 07 00 46 01 FF 00 1B 00 01 07 00 46 00 02 07 00 67 07 00 46 42 07 00 5E FF 00 00 00 01 07 00 46 00 02 07 00 67 07 00 46 45 07 00 53 40 07 00 05 FF 00 03 00 01 07 00 46 00 02 07 00 67 07 00 46 41 07 00 53 43 05 44 07 00 53 47 05 47 07 00 53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Any
        //  110    112    3      8      Ljava/lang/ClassCastException;
        //  71     78     78     79     Any
        //  71     78     3      8      Ljava/lang/IllegalStateException;
        //  71     78     78     79     Any
        //  71     78     3      8      Any
        //  71     78     71     72     Ljava/lang/IllegalStateException;
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
}
