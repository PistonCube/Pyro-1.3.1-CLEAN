// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f5S
{
    public static f5S c;
    public static f5S 0;
    public static f5S 1;
    public static f5S[] c;
    
    public f5S(final String name, final int ordinal) {
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ldev/nuker/pyro/f5S;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f5S;
        //    10: dup            
        //    11: ldc             "\u23c3\u1495\u8afb"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: getstatic       dev/nuker/pyro/fc.0:I
        //    20: ifeq            28
        //    23: ldc             460973461
        //    25: goto            30
        //    28: ldc             1548601096
        //    30: ldc             1353212200
        //    32: ixor           
        //    33: lookupswitch {
        //          472105378: 28
        //          1272022205: 200
        //          default: 60
        //        }
        //    60: invokespecial   dev/nuker/pyro/f5S.<init>:(Ljava/lang/String;I)V
        //    63: dup            
        //    64: getstatic       dev/nuker/pyro/fc.c:I
        //    67: ifge            75
        //    70: ldc             1173163103
        //    72: goto            77
        //    75: ldc             1518242605
        //    77: ldc             -1768219722
        //    79: ixor           
        //    80: lookupswitch {
        //          -747235351: 204
        //          147855087: 75
        //          default: 108
        //        }
        //   108: putstatic       dev/nuker/pyro/f5S.c:Ldev/nuker/pyro/f5S;
        //   111: aastore        
        //   112: dup            
        //   113: iconst_1       
        //   114: new             Ldev/nuker/pyro/f5S;
        //   117: dup            
        //   118: ldc             "\u23df\u1496\u8af0\ubf0b"
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: iconst_1       
        //   124: getstatic       dev/nuker/pyro/fc.1:I
        //   127: ifeq            135
        //   130: ldc             -891603165
        //   132: goto            137
        //   135: ldc             1120511027
        //   137: ldc             1721172408
        //   139: ixor           
        //   140: lookupswitch {
        //          -1404291429: 135
        //          610182539: 168
        //          default: 202
        //        }
        //   168: invokespecial   dev/nuker/pyro/f5S.<init>:(Ljava/lang/String;I)V
        //   171: dup            
        //   172: putstatic       dev/nuker/pyro/f5S.0:Ldev/nuker/pyro/f5S;
        //   175: aastore        
        //   176: dup            
        //   177: iconst_2       
        //   178: new             Ldev/nuker/pyro/f5S;
        //   181: dup            
        //   182: ldc             "\u23ca\u1486\u8af1\ubf0e"
        //   184: invokestatic    invokestatic   !!! ERROR
        //   187: iconst_2       
        //   188: invokespecial   dev/nuker/pyro/f5S.<init>:(Ljava/lang/String;I)V
        //   191: dup            
        //   192: putstatic       dev/nuker/pyro/f5S.1:Ldev/nuker/pyro/f5S;
        //   195: aastore        
        //   196: putstatic       dev/nuker/pyro/f5S.c:[Ldev/nuker/pyro/f5S;
        //   199: return         
        //   200: aconst_null    
        //   201: athrow         
        //   202: aconst_null    
        //   203: athrow         
        //   204: aconst_null    
        //   205: athrow         
        //    StackMapTable: 00 0C FF 00 1C 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 07 08 00 07 07 00 39 01 FF 00 01 00 00 00 09 07 00 37 07 00 37 07 00 37 01 08 00 07 08 00 07 07 00 39 01 01 FF 00 1D 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 07 08 00 07 07 00 39 01 FF 00 0E 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03 FF 00 1A 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 72 08 00 72 07 00 39 01 FF 00 01 00 00 00 09 07 00 37 07 00 37 07 00 37 01 08 00 72 08 00 72 07 00 39 01 01 FF 00 1E 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 72 08 00 72 07 00 39 01 FF 00 1F 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 07 08 00 07 07 00 39 01 FF 00 01 00 00 00 08 07 00 37 07 00 37 07 00 37 01 08 00 72 08 00 72 07 00 39 01 FF 00 01 00 00 00 06 07 00 37 07 00 37 07 00 37 01 07 00 03 07 00 03
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
    
    public static f5S c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
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
        //    24: ldc             Ldev/nuker/pyro/f5S;.class
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             -2027910390
        //    34: goto            39
        //    37: ldc             1966797664
        //    39: ldc             899716915
        //    41: ixor           
        //    42: lookupswitch {
        //          -1300227015: 84
        //          799394814: 37
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/f5S;
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
        //    StackMapTable: 00 11 43 07 00 4B 04 FF 00 0B 00 00 00 01 07 00 43 FC 00 03 07 00 39 4C 07 00 5D FF 00 01 00 01 07 00 39 00 02 07 00 5D 01 5C 07 00 5D 43 07 00 4B FF 00 00 00 01 07 00 39 00 02 07 00 5D 07 00 39 45 07 00 43 40 07 00 05 43 07 00 5D 41 07 00 4B 43 05 44 07 00 4B 47 05 47 07 00 4B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     95     103    Ljava/lang/RuntimeException;
        //  95     103    95     103    Ljava/lang/IllegalArgumentException;
        //  111    113    3      8      Ljava/lang/RuntimeException;
        //  72     79     79     80     Any
        //  72     79     79     80     Ljava/lang/NumberFormatException;
        //  72     79     3      8      Ljava/util/NoSuchElementException;
        //  72     79     72     73     Ljava/util/ConcurrentModificationException;
        //  72     79     72     73     Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 44 out of bounds for length 44
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
