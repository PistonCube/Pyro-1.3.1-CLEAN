// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f53
{
    public static f53 c;
    public static f53 0;
    public static f53 1;
    public static f53[] c;
    
    public static f53 c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f53;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f53;
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
        //    StackMapTable: 00 0D 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FC 00 03 07 00 1C 45 07 00 16 FF 00 00 00 01 07 00 1C 00 02 07 00 1E 07 00 1C 45 07 00 16 40 07 00 05 43 07 00 16 43 05 44 07 00 16 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  67     69     3      8      Ljava/lang/NullPointerException;
        //  30     37     37     38     Any
        //  31     37     30     31     Any
        //  30     37     37     38     Ljava/lang/StringIndexOutOfBoundsException;
        //  30     37     3      8      Any
        //  30     37     3      8      Any
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
        //     4: ldc             "\u23a2\u149c\u8a8f\ubf0f\ufdbd\ued86"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.c:I
        //    13: ifge            21
        //    16: ldc             1523696681
        //    18: goto            23
        //    21: ldc             -766826052
        //    23: ldc             -1377170544
        //    25: ixor           
        //    26: lookupswitch {
        //          -1650319210: 21
        //          -147075143: 246
        //          default: 52
        //        }
        //    52: invokespecial   dev/nuker/pyro/f53.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f53.c:Ldev/nuker/pyro/f53;
        //    58: new             Ldev/nuker/pyro/f53;
        //    61: dup            
        //    62: ldc             "\u23a3\u1486\u8a89\ubf0e\ufdb5\ued84\ub221"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f53.<init>:(Ljava/lang/String;I)V
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1946171897
        //    79: goto            84
        //    82: ldc             576150466
        //    84: ldc             -1321926152
        //    86: ixor           
        //    87: lookupswitch {
        //          -1822270918: 112
        //          -986367999: 82
        //          default: 248
        //        }
        //   112: putstatic       dev/nuker/pyro/f53.0:Ldev/nuker/pyro/f53;
        //   115: new             Ldev/nuker/pyro/f53;
        //   118: dup            
        //   119: ldc             "\u23aa\u149a\u8a91\ubf0e\ufdb9\ued8e\ub20b\ue6a5\ud5a7\uddc3\ua743\u1e42\ue191"
        //   121: invokestatic    invokestatic   !!! ERROR
        //   124: iconst_2       
        //   125: invokespecial   dev/nuker/pyro/f53.<init>:(Ljava/lang/String;I)V
        //   128: putstatic       dev/nuker/pyro/f53.1:Ldev/nuker/pyro/f53;
        //   131: iconst_3       
        //   132: anewarray       Ldev/nuker/pyro/f53;
        //   135: dup            
        //   136: iconst_0       
        //   137: getstatic       dev/nuker/pyro/fc.0:I
        //   140: ifeq            148
        //   143: ldc             460557969
        //   145: goto            150
        //   148: ldc             1533601497
        //   150: ldc             1334834295
        //   152: ixor           
        //   153: lookupswitch {
        //          350687918: 180
        //          1425832678: 148
        //          default: 244
        //        }
        //   180: getstatic       dev/nuker/pyro/f53.c:Ldev/nuker/pyro/f53;
        //   183: aastore        
        //   184: dup            
        //   185: iconst_1       
        //   186: getstatic       dev/nuker/pyro/f53.0:Ldev/nuker/pyro/f53;
        //   189: aastore        
        //   190: dup            
        //   191: iconst_2       
        //   192: getstatic       dev/nuker/pyro/f53.1:Ldev/nuker/pyro/f53;
        //   195: aastore        
        //   196: getstatic       dev/nuker/pyro/fc.0:I
        //   199: ifeq            207
        //   202: ldc             -921215253
        //   204: goto            209
        //   207: ldc             1469130740
        //   209: ldc             796564190
        //   211: ixor           
        //   212: lookupswitch {
        //          -429013963: 207
        //          2028715306: 240
        //          default: 250
        //        }
        //   240: putstatic       dev/nuker/pyro/f53.c:[Ldev/nuker/pyro/f53;
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: aconst_null    
        //   251: athrow         
        //    StackMapTable: 00 10 FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 1C 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 1C 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 1C 01 5D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 23 00 00 00 03 07 00 48 07 00 48 01 FF 00 01 00 00 00 04 07 00 48 07 00 48 01 01 FF 00 1D 00 00 00 03 07 00 48 07 00 48 01 5A 07 00 48 FF 00 01 00 00 00 02 07 00 48 01 5E 07 00 48 FF 00 03 00 00 00 03 07 00 48 07 00 48 01 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 1C 01 41 07 00 03 41 07 00 48
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
    
    public f53(final String name, final int ordinal) {
        while (true) {
            Label_0016: {
                if (fc.0 != 0) {
                    n = 1910225677;
                    break Label_0016;
                }
                n = -2078963733;
            }
            switch (n ^ 0xFD21BD76) {
                case -145295546: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case -1929771397: {
                    throw null;
                }
            }
            break;
        }
    }
}
