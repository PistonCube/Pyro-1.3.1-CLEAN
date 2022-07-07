// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f3M extends f3A
{
    public f3T c;
    
    public f3M(final f3T p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u238c\u1496\u8aa7\ub3d8\uc9f2\ueda2\ub230\ue69f"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: fconst_0       
        //     7: fconst_0       
        //     8: ldc             115.0
        //    10: invokestatic    dev/nuker/pyro/fbs.c:()F
        //    13: fconst_2       
        //    14: fadd           
        //    15: getstatic       dev/nuker/pyro/fc.c:I
        //    18: ifge            26
        //    21: ldc             1603380134
        //    23: goto            28
        //    26: ldc             547218144
        //    28: ldc             -1170906737
        //    30: ixor           
        //    31: lookupswitch {
        //          -442187223: 152
        //          774870392: 26
        //          default: 56
        //        }
        //    56: invokespecial   dev/nuker/pyro/f3A.<init>:(Ljava/lang/String;FFFF)V
        //    59: aload_0        
        //    60: getstatic       dev/nuker/pyro/fc.c:I
        //    63: ifge            71
        //    66: ldc             943016292
        //    68: goto            73
        //    71: ldc             562044360
        //    73: ldc             -1365647645
        //    75: ixor           
        //    76: lookupswitch {
        //          -1894137045: 104
        //          -1767073913: 71
        //          default: 154
        //        }
        //   104: aload_1        
        //   105: getstatic       dev/nuker/pyro/fc.1:I
        //   108: ifeq            116
        //   111: ldc             -231056581
        //   113: goto            118
        //   116: ldc             742491630
        //   118: ldc             471056478
        //   120: ixor           
        //   121: lookupswitch {
        //          -299263131: 116
        //          810698160: 148
        //          default: 156
        //        }
        //   148: putfield        dev/nuker/pyro/f3M.c:Ldev/nuker/pyro/f3T;
        //   151: return         
        //   152: aconst_null    
        //   153: athrow         
        //   154: aconst_null    
        //   155: athrow         
        //   156: aconst_null    
        //   157: athrow         
        //    StackMapTable: 00 0C FF 00 1A 00 02 06 07 00 2F 00 06 06 07 00 31 02 02 02 02 FF 00 01 00 02 06 07 00 2F 00 07 06 07 00 31 02 02 02 02 01 FF 00 1B 00 02 06 07 00 2F 00 06 06 07 00 31 02 02 02 02 FF 00 0E 00 02 07 00 03 07 00 2F 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 2F 00 02 07 00 03 01 5E 07 00 03 FF 00 0B 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 2F FF 00 01 00 02 07 00 03 07 00 2F 00 03 07 00 03 07 00 2F 01 FF 00 1D 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 2F FF 00 03 00 02 06 07 00 2F 00 06 06 07 00 31 02 02 02 02 FF 00 01 00 02 07 00 03 07 00 2F 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 2F
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        throw t;
    }
    
    @Override
    public void c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          255
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            247
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            239
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             1008058291
        //    33: goto            38
        //    36: ldc             -208391279
        //    38: ldc             -1599115853
        //    40: ixor           
        //    41: lookupswitch {
        //          -1665478144: 36
        //          1396399650: 68
        //          default: 224
        //        }
        //    68: iload_1        
        //    69: iload_2        
        //    70: iload_3        
        //    71: goto            75
        //    74: athrow         
        //    75: invokespecial   dev/nuker/pyro/f3A.c:(III)V
        //    78: goto            82
        //    81: athrow         
        //    82: getstatic       dev/nuker/pyro/fc.1:I
        //    85: ifeq            93
        //    88: ldc             617942454
        //    90: goto            95
        //    93: ldc             1812029422
        //    95: ldc             -1677447728
        //    97: ixor           
        //    98: lookupswitch {
        //          -1194254234: 93
        //          -268078530: 124
        //          default: 228
        //        }
        //   124: iload_3        
        //   125: ifne            223
        //   128: aload_0        
        //   129: getfield        dev/nuker/pyro/f3M.c:Ldev/nuker/pyro/f3T;
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/f3T.c:()Ldev/nuker/pyro/f0n;
        //   139: goto            143
        //   142: athrow         
        //   143: aload_0        
        //   144: getfield        dev/nuker/pyro/f3M.c:Ldev/nuker/pyro/f3T;
        //   147: goto            151
        //   150: athrow         
        //   151: invokevirtual   dev/nuker/pyro/f3T.c:()Ldev/nuker/pyro/f0n;
        //   154: goto            158
        //   157: athrow         
        //   158: goto            162
        //   161: athrow         
        //   162: invokevirtual   dev/nuker/pyro/f0n.1:()Ljava/lang/Object;
        //   165: goto            169
        //   168: athrow         
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            180
        //   175: ldc             172748762
        //   177: goto            182
        //   180: ldc             -1089855673
        //   182: ldc             1912890980
        //   184: ixor           
        //   185: lookupswitch {
        //          -854689501: 212
        //          2018478526: 180
        //          default: 226
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/lang/Object;)V
        //   219: goto            223
        //   222: athrow         
        //   223: return         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: aconst_null    
        //   229: athrow         
        //   230: pop            
        //   231: goto            24
        //   234: pop            
        //   235: aconst_null    
        //   236: goto            230
        //   239: dup            
        //   240: ifnull          230
        //   243: checkcast       Ljava/lang/Throwable;
        //   246: athrow         
        //   247: dup            
        //   248: ifnull          234
        //   251: checkcast       Ljava/lang/Throwable;
        //   254: athrow         
        //   255: aconst_null    
        //   256: athrow         
        //    StackMapTable: 00 29 43 07 00 40 04 FF 00 0B 00 00 00 01 07 00 40 FF 00 03 00 04 07 00 03 01 01 01 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 00 00 01 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 40 00 0A 41 01 1C 4A 07 00 40 40 07 00 2F 45 07 00 40 40 07 00 4D FF 00 06 00 00 00 01 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 2F 45 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 4D 42 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 4D 45 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 58 FF 00 0A 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 58 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 4D 07 00 58 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 58 FF 00 02 00 00 00 01 07 00 40 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 58 45 07 00 40 00 40 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 4D 07 00 58 01 41 07 00 40 43 05 44 07 00 40 47 05 47 07 00 40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     239    247    Any
        //  239    247    239    247    Any
        //  255    257    3      8      Any
        //  75     81     81     82     Any
        //  75     81     3      8      Any
        //  75     81     81     82     Ljava/lang/AssertionError;
        //  75     81     3      8      Any
        //  75     81     3      8      Ljava/lang/RuntimeException;
        //  135    142    142    143    Any
        //  136    142    135    136    Ljava/lang/EnumConstantNotPresentException;
        //  135    142    142    143    Any
        //  135    142    135    136    Any
        //  135    142    135    136    Any
        //  151    157    157    158    Any
        //  151    157    157    158    Any
        //  151    157    157    158    Any
        //  151    157    3      8      Ljava/lang/IllegalArgumentException;
        //  151    157    157    158    Any
        //  161    168    168    169    Any
        //  161    168    161    162    Any
        //  162    168    3      8      Any
        //  162    168    3      8      Any
        //  162    168    161    162    Ljava/lang/StringIndexOutOfBoundsException;
        //  216    222    222    223    Any
        //  216    222    3      8      Any
        //  216    222    3      8      Any
        //  216    222    3      8      Any
        //  216    222    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 43 out of bounds for length 43
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    
    @Override
    public boolean c(final float n, final float n2, final float n3) {
        return fbS.f(this, 56304005, n, n2, n3);
    }
}
