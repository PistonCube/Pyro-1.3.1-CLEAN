// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f4W
{
    public static f4W c;
    public static f4W 0;
    public static f4W 1;
    public static f4W[] c;
    
    public f4W(final String name, final int ordinal) {
        while (true) {
            Label_0016: {
                if (fc.c < 0) {
                    n = 1564166007;
                    break Label_0016;
                }
                n = -555412222;
            }
            switch (n ^ 0xA94CE59D) {
                case -775030588: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case -193486102: {
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
        //     4: ldc             "\u23af\u149c\u8a96\ubf07"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.0:I
        //    13: ifeq            21
        //    16: ldc             1442495205
        //    18: goto            23
        //    21: ldc             -2086030503
        //    23: ldc             72220072
        //    25: ixor           
        //    26: lookupswitch {
        //          -1010596415: 21
        //          1370965837: 160
        //          default: 52
        //        }
        //    52: invokespecial   dev/nuker/pyro/f4W.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f4W.c:Ldev/nuker/pyro/f4W;
        //    58: new             Ldev/nuker/pyro/f4W;
        //    61: dup            
        //    62: ldc             "\u23a7\u149f\u8a81\ubf27\ufd89\ued86\ub226\ue6b9\ud5b6\uddf0"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f4W.<init>:(Ljava/lang/String;I)V
        //    71: putstatic       dev/nuker/pyro/f4W.0:Ldev/nuker/pyro/f4W;
        //    74: new             Ldev/nuker/pyro/f4W;
        //    77: dup            
        //    78: ldc             "\u23aa\u1496\u8a81"
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: iconst_2       
        //    84: invokespecial   dev/nuker/pyro/f4W.<init>:(Ljava/lang/String;I)V
        //    87: putstatic       dev/nuker/pyro/f4W.1:Ldev/nuker/pyro/f4W;
        //    90: iconst_3       
        //    91: anewarray       Ldev/nuker/pyro/f4W;
        //    94: dup            
        //    95: iconst_0       
        //    96: getstatic       dev/nuker/pyro/f4W.c:Ldev/nuker/pyro/f4W;
        //    99: aastore        
        //   100: dup            
        //   101: iconst_1       
        //   102: getstatic       dev/nuker/pyro/f4W.0:Ldev/nuker/pyro/f4W;
        //   105: aastore        
        //   106: dup            
        //   107: iconst_2       
        //   108: getstatic       dev/nuker/pyro/f4W.1:Ldev/nuker/pyro/f4W;
        //   111: aastore        
        //   112: getstatic       dev/nuker/pyro/fc.0:I
        //   115: ifeq            123
        //   118: ldc             -951498975
        //   120: goto            125
        //   123: ldc             1255232726
        //   125: ldc             956988428
        //   127: ixor           
        //   128: lookupswitch {
        //          -29148371: 162
        //          326690743: 123
        //          default: 156
        //        }
        //   156: putstatic       dev/nuker/pyro/f4W.c:[Ldev/nuker/pyro/f4W;
        //   159: return         
        //   160: aconst_null    
        //   161: athrow         
        //   162: aconst_null    
        //   163: athrow         
        //    StackMapTable: 00 08 FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 18 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 18 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 18 01 F7 00 46 07 00 37 FF 00 01 00 00 00 02 07 00 37 01 5E 07 00 37 FF 00 03 00 00 00 04 08 00 00 08 00 00 07 00 18 01 41 07 00 37
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
    
    public static f4W c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f4W;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f4W;
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
        //    StackMapTable: 00 0D 43 07 00 40 04 FF 00 0B 00 00 00 01 07 00 40 FC 00 03 07 00 18 45 07 00 46 FF 00 00 00 01 07 00 18 00 02 07 00 48 07 00 18 45 07 00 40 40 07 00 05 43 07 00 40 43 05 44 07 00 40 47 05 47 07 00 40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     51     59     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     59     51     59     Any
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     30     31     Ljava/util/NoSuchElementException;
        //  30     37     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  31     37     30     31     Ljava/lang/IndexOutOfBoundsException;
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
}
