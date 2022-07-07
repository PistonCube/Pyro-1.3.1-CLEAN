// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f7B
{
    public static f7B c;
    public static f7B 0;
    public static f7B 1;
    public static f7B[] c;
    
    public static f7B c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f7B;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f7B;
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
        //    StackMapTable: 00 0D 43 07 00 15 04 FF 00 0B 00 00 00 01 07 00 15 FC 00 03 07 00 31 45 07 00 15 FF 00 00 00 01 07 00 31 00 02 07 00 33 07 00 31 45 07 00 15 40 07 00 05 43 07 00 21 43 05 44 07 00 21 47 05 47 07 00 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Ljava/lang/RuntimeException;
        //  51     59     51     59     Ljava/util/ConcurrentModificationException;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/AssertionError;
        //  30     37     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  30     37     30     31     Any
        //  30     37     30     31     Ljava/lang/NullPointerException;
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
        //     4: ldc             "\u220a\u149c\u8adc\ubf0b\ufd4b"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f7B.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f7B.c:Ldev/nuker/pyro/f7B;
        //    16: new             Ldev/nuker/pyro/f7B;
        //    19: dup            
        //    20: ldc             "\u221d\u149c\u8adc\ubf12\ufd47\uec36\ub22a"
        //    22: getstatic       dev/nuker/pyro/fc.1:I
        //    25: ifeq            33
        //    28: ldc             1563185850
        //    30: goto            35
        //    33: ldc             -303908856
        //    35: ldc             782792134
        //    37: ixor           
        //    38: lookupswitch {
        //          -1018507826: 64
        //          1938040700: 33
        //          default: 206
        //        }
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: getstatic       dev/nuker/pyro/fc.0:I
        //    71: ifeq            79
        //    74: ldc             -315814884
        //    76: goto            81
        //    79: ldc             926952870
        //    81: ldc             -1997878909
        //    83: ixor           
        //    84: lookupswitch {
        //          -669846141: 79
        //          1707591071: 208
        //          default: 112
        //        }
        //   112: invokespecial   dev/nuker/pyro/f7B.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f7B.0:Ldev/nuker/pyro/f7B;
        //   118: new             Ldev/nuker/pyro/f7B;
        //   121: dup            
        //   122: ldc             "\u220d\u1481\u8ad1\ubf0f\ufd5f\uec30\ub228\ue6f4\ud5bd\udd39"
        //   124: invokestatic    invokestatic   !!! ERROR
        //   127: iconst_2       
        //   128: invokespecial   dev/nuker/pyro/f7B.<init>:(Ljava/lang/String;I)V
        //   131: putstatic       dev/nuker/pyro/f7B.1:Ldev/nuker/pyro/f7B;
        //   134: iconst_3       
        //   135: anewarray       Ldev/nuker/pyro/f7B;
        //   138: dup            
        //   139: iconst_0       
        //   140: getstatic       dev/nuker/pyro/fc.1:I
        //   143: ifeq            151
        //   146: ldc             1827042325
        //   148: goto            153
        //   151: ldc             -982845128
        //   153: ldc             1303930440
        //   155: ixor           
        //   156: lookupswitch {
        //          -1999462544: 184
        //          559813213: 151
        //          default: 204
        //        }
        //   184: getstatic       dev/nuker/pyro/f7B.c:Ldev/nuker/pyro/f7B;
        //   187: aastore        
        //   188: dup            
        //   189: iconst_1       
        //   190: getstatic       dev/nuker/pyro/f7B.0:Ldev/nuker/pyro/f7B;
        //   193: aastore        
        //   194: dup            
        //   195: iconst_2       
        //   196: getstatic       dev/nuker/pyro/f7B.1:Ldev/nuker/pyro/f7B;
        //   199: aastore        
        //   200: putstatic       dev/nuker/pyro/f7B.c:[Ldev/nuker/pyro/f7B;
        //   203: return         
        //   204: aconst_null    
        //   205: athrow         
        //   206: aconst_null    
        //   207: athrow         
        //   208: aconst_null    
        //   209: athrow         
        //    StackMapTable: 00 0C FF 00 21 00 00 00 03 08 00 10 08 00 10 07 00 31 FF 00 01 00 00 00 04 08 00 10 08 00 10 07 00 31 01 FF 00 1C 00 00 00 03 08 00 10 08 00 10 07 00 31 FF 00 0E 00 00 00 04 08 00 10 08 00 10 07 00 31 01 FF 00 01 00 00 00 05 08 00 10 08 00 10 07 00 31 01 01 FF 00 1E 00 00 00 04 08 00 10 08 00 10 07 00 31 01 FF 00 26 00 00 00 03 07 00 18 07 00 18 01 FF 00 01 00 00 00 04 07 00 18 07 00 18 01 01 FF 00 1E 00 00 00 03 07 00 18 07 00 18 01 FF 00 13 00 00 00 03 07 00 18 07 00 18 01 FF 00 01 00 00 00 03 08 00 10 08 00 10 07 00 31 FF 00 01 00 00 00 04 08 00 10 08 00 10 07 00 31 01
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
    
    public f7B(final String name, final int ordinal) {
    }
}
