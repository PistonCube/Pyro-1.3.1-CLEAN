// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f9T
{
    public static f9T c;
    public static f9T 0;
    public static f9T 1;
    public static f9T[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2240\u149d\u8b6c\ubf0b\ufd11\uec6a"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f9T.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f9T.c:Ldev/nuker/pyro/f9T;
        //    16: new             Ldev/nuker/pyro/f9T;
        //    19: dup            
        //    20: ldc             "\u224c\u149d\u8b64"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: invokespecial   dev/nuker/pyro/f9T.<init>:(Ljava/lang/String;I)V
        //    29: putstatic       dev/nuker/pyro/f9T.0:Ldev/nuker/pyro/f9T;
        //    32: new             Ldev/nuker/pyro/f9T;
        //    35: dup            
        //    36: ldc             "\u2248\u1491\u8b6f\ubf14\ufd1a"
        //    38: getstatic       dev/nuker/pyro/fc.1:I
        //    41: ifeq            49
        //    44: ldc             1745845272
        //    46: goto            51
        //    49: ldc             1151492043
        //    51: ldc             2123594465
        //    53: ixor           
        //    54: lookupswitch {
        //          379324153: 49
        //          976299306: 80
        //          default: 204
        //        }
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: iconst_2       
        //    84: getstatic       dev/nuker/pyro/fc.0:I
        //    87: ifeq            95
        //    90: ldc             1071322485
        //    92: goto            97
        //    95: ldc             700293329
        //    97: ldc             -1106202395
        //    99: ixor           
        //   100: lookupswitch {
        //          -2117360240: 95
        //          -1750265804: 128
        //          default: 208
        //        }
        //   128: invokespecial   dev/nuker/pyro/f9T.<init>:(Ljava/lang/String;I)V
        //   131: putstatic       dev/nuker/pyro/f9T.1:Ldev/nuker/pyro/f9T;
        //   134: iconst_3       
        //   135: anewarray       Ldev/nuker/pyro/f9T;
        //   138: dup            
        //   139: iconst_0       
        //   140: getstatic       dev/nuker/pyro/f9T.c:Ldev/nuker/pyro/f9T;
        //   143: aastore        
        //   144: dup            
        //   145: iconst_1       
        //   146: getstatic       dev/nuker/pyro/f9T.0:Ldev/nuker/pyro/f9T;
        //   149: aastore        
        //   150: dup            
        //   151: iconst_2       
        //   152: getstatic       dev/nuker/pyro/fc.c:I
        //   155: ifge            163
        //   158: ldc             1438587282
        //   160: goto            165
        //   163: ldc             -1623945644
        //   165: ldc             1405093920
        //   167: ixor           
        //   168: lookupswitch {
        //          -1804350449: 163
        //          108990898: 206
        //          default: 196
        //        }
        //   196: getstatic       dev/nuker/pyro/f9T.1:Ldev/nuker/pyro/f9T;
        //   199: aastore        
        //   200: putstatic       dev/nuker/pyro/f9T.c:[Ldev/nuker/pyro/f9T;
        //   203: return         
        //   204: aconst_null    
        //   205: athrow         
        //   206: aconst_null    
        //   207: athrow         
        //   208: aconst_null    
        //   209: athrow         
        //    StackMapTable: 00 0C FF 00 31 00 00 00 03 08 00 20 08 00 20 07 00 37 FF 00 01 00 00 00 04 08 00 20 08 00 20 07 00 37 01 FF 00 1C 00 00 00 03 08 00 20 08 00 20 07 00 37 FF 00 0E 00 00 00 04 08 00 20 08 00 20 07 00 37 01 FF 00 01 00 00 00 05 08 00 20 08 00 20 07 00 37 01 01 FF 00 1E 00 00 00 04 08 00 20 08 00 20 07 00 37 01 FF 00 22 00 00 00 03 07 00 38 07 00 38 01 FF 00 01 00 00 00 04 07 00 38 07 00 38 01 01 FF 00 1E 00 00 00 03 07 00 38 07 00 38 01 FF 00 07 00 00 00 03 08 00 20 08 00 20 07 00 37 FF 00 01 00 00 00 03 07 00 38 07 00 38 01 FF 00 01 00 00 00 04 08 00 20 08 00 20 07 00 37 01
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
    
    public static f9T c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f9T;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             1710254653
        //    35: goto            40
        //    38: ldc             -1070842956
        //    40: ldc             1158867995
        //    42: ixor           
        //    43: lookupswitch {
        //          -2059479121: 68
        //          551716390: 38
        //          default: 83
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f9T;
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
        //    StackMapTable: 00 11 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FC 00 03 07 00 37 FF 00 0D 00 01 07 00 37 00 02 07 00 4A 07 00 37 FF 00 01 00 01 07 00 37 00 03 07 00 4A 07 00 37 01 FF 00 1B 00 01 07 00 37 00 02 07 00 4A 07 00 37 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 01 07 00 37 00 02 07 00 4A 07 00 37 45 07 00 41 40 07 00 05 FF 00 03 00 01 07 00 37 00 02 07 00 4A 07 00 37 41 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     94     102    Any
        //  94     102    94     102    Any
        //  110    112    3      8      Any
        //  72     78     78     79     Any
        //  72     78     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  72     78     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  72     78     3      8      Ljava/lang/ArithmeticException;
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
    
    public f9T(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.c < 0) {
                    n = -1989596600;
                    break Label_0013;
                }
                n = 158082388;
            }
            switch (n ^ 0x33A0B1FC) {
                case -1161192524: {
                    continue;
                }
                case 986485928: {
                    super(name, ordinal);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
}
