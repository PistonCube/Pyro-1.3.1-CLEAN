// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f6k
{
    public static f6k c;
    public static f6k 0;
    public static f6k 1;
    public static f6k 2;
    public static f6k 3;
    public static f6k 4;
    public static f6k 5;
    public static f6k 6;
    public static f6k 7;
    public static f6k 8;
    public static f6k 9;
    public static f6k a;
    public static f6k[] c;
    
    public static f6k c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          67
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f6k;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f6k;
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
        //    StackMapTable: 00 0D 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FC 00 03 07 00 25 FF 00 05 00 00 00 01 07 00 1F FF 00 00 00 01 07 00 25 00 02 07 00 27 07 00 25 45 07 00 1F 40 07 00 05 43 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Ljava/lang/StringIndexOutOfBoundsException;
        //  67     69     3      8      Any
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
        //  31     37     37     38     Ljava/lang/NegativeArraySizeException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
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
        //     4: ldc             "\u2200\u149b\u8b2f\ubf16\ufd50"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //    13: putstatic       dev/nuker/pyro/f6k.c:Ldev/nuker/pyro/f6k;
        //    16: new             Ldev/nuker/pyro/f6k;
        //    19: dup            
        //    20: ldc             "\u2210\u1481\u8b27\ubf1b"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: iconst_1       
        //    26: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            40
        //    35: ldc             724824495
        //    37: goto            42
        //    40: ldc             1634094424
        //    42: ldc             -1570971134
        //    44: ixor           
        //    45: lookupswitch {
        //          -1989209171: 540
        //          697654385: 40
        //          default: 72
        //        }
        //    72: putstatic       dev/nuker/pyro/f6k.0:Ldev/nuker/pyro/f6k;
        //    75: new             Ldev/nuker/pyro/f6k;
        //    78: dup            
        //    79: ldc             "\u2213\u1492\u8b34\ubf09\ufd72\uec23\ub225\ue712"
        //    81: invokestatic    invokestatic   !!! ERROR
        //    84: iconst_2       
        //    85: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //    88: putstatic       dev/nuker/pyro/f6k.1:Ldev/nuker/pyro/f6k;
        //    91: new             Ldev/nuker/pyro/f6k;
        //    94: dup            
        //    95: ldc             "\u2205\u1496\u8b22"
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: iconst_3       
        //   101: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   104: putstatic       dev/nuker/pyro/f6k.2:Ldev/nuker/pyro/f6k;
        //   107: new             Ldev/nuker/pyro/f6k;
        //   110: dup            
        //   111: ldc             "\u2213\u1492\u8b34\ubf09\ufd67\uec34\ub220"
        //   113: invokestatic    invokestatic   !!! ERROR
        //   116: iconst_4       
        //   117: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   120: getstatic       dev/nuker/pyro/fc.c:I
        //   123: ifge            131
        //   126: ldc             -1589665725
        //   128: goto            133
        //   131: ldc             591440578
        //   133: ldc             653428495
        //   135: ixor           
        //   136: lookupswitch {
        //          -2016598196: 546
        //          -1993871035: 131
        //          default: 164
        //        }
        //   164: putstatic       dev/nuker/pyro/f6k.3:Ldev/nuker/pyro/f6k;
        //   167: new             Ldev/nuker/pyro/f6k;
        //   170: dup            
        //   171: ldc             "\u2210\u1481\u8b23\ubf07\ufd5b"
        //   173: invokestatic    invokestatic   !!! ERROR
        //   176: iconst_5       
        //   177: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   180: putstatic       dev/nuker/pyro/f6k.4:Ldev/nuker/pyro/f6k;
        //   183: new             Ldev/nuker/pyro/f6k;
        //   186: dup            
        //   187: ldc             "\u2213\u1492\u8b34\ubf09\ufd72\uec23\ub221\ue70e\ud5bd"
        //   189: invokestatic    invokestatic   !!! ERROR
        //   192: bipush          6
        //   194: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   197: putstatic       dev/nuker/pyro/f6k.5:Ldev/nuker/pyro/f6k;
        //   200: new             Ldev/nuker/pyro/f6k;
        //   203: dup            
        //   204: ldc             "\u2215\u149f\u8b33\ubf07"
        //   206: invokestatic    invokestatic   !!! ERROR
        //   209: bipush          7
        //   211: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   214: putstatic       dev/nuker/pyro/f6k.6:Ldev/nuker/pyro/f6k;
        //   217: new             Ldev/nuker/pyro/f6k;
        //   220: dup            
        //   221: ldc             "\u2213\u1492\u8b34\ubf09\ufd77\uec3d\ub231\ue70e"
        //   223: getstatic       dev/nuker/pyro/fc.0:I
        //   226: ifeq            234
        //   229: ldc             -1660040265
        //   231: goto            236
        //   234: ldc             -2072233015
        //   236: ldc             574112943
        //   238: ixor           
        //   239: lookupswitch {
        //          -1087009000: 544
        //          1965172033: 234
        //          default: 264
        //        }
        //   264: invokestatic    invokestatic   !!! ERROR
        //   267: bipush          8
        //   269: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   272: putstatic       dev/nuker/pyro/f6k.7:Ldev/nuker/pyro/f6k;
        //   275: new             Ldev/nuker/pyro/f6k;
        //   278: dup            
        //   279: ldc             "\u2216\u1482\u8b33\ubf03"
        //   281: invokestatic    invokestatic   !!! ERROR
        //   284: bipush          9
        //   286: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   289: putstatic       dev/nuker/pyro/f6k.8:Ldev/nuker/pyro/f6k;
        //   292: new             Ldev/nuker/pyro/f6k;
        //   295: dup            
        //   296: ldc             "\u220e\u1496\u8b2a\ubf0e\ufd5a\uec26"
        //   298: getstatic       dev/nuker/pyro/fc.0:I
        //   301: ifeq            309
        //   304: ldc             651428542
        //   306: goto            311
        //   309: ldc             1597288776
        //   311: ldc             -434103894
        //   313: ixor           
        //   314: lookupswitch {
        //          -1189828382: 340
        //          -1057744108: 309
        //          default: 548
        //        }
        //   340: invokestatic    invokestatic   !!! ERROR
        //   343: bipush          10
        //   345: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   348: putstatic       dev/nuker/pyro/f6k.9:Ldev/nuker/pyro/f6k;
        //   351: new             Ldev/nuker/pyro/f6k;
        //   354: dup            
        //   355: ldc             "\u2210\u149c\u8b2a\ubf06"
        //   357: invokestatic    invokestatic   !!! ERROR
        //   360: bipush          11
        //   362: invokespecial   dev/nuker/pyro/f6k.<init>:(Ljava/lang/String;I)V
        //   365: putstatic       dev/nuker/pyro/f6k.a:Ldev/nuker/pyro/f6k;
        //   368: bipush          12
        //   370: anewarray       Ldev/nuker/pyro/f6k;
        //   373: dup            
        //   374: iconst_0       
        //   375: getstatic       dev/nuker/pyro/f6k.c:Ldev/nuker/pyro/f6k;
        //   378: aastore        
        //   379: dup            
        //   380: iconst_1       
        //   381: getstatic       dev/nuker/pyro/fc.0:I
        //   384: ifeq            392
        //   387: ldc             1731257336
        //   389: goto            394
        //   392: ldc             -418720732
        //   394: ldc             1789558585
        //   396: ixor           
        //   397: lookupswitch {
        //          -1918850275: 424
        //          228236481: 392
        //          default: 550
        //        }
        //   424: getstatic       dev/nuker/pyro/f6k.0:Ldev/nuker/pyro/f6k;
        //   427: aastore        
        //   428: dup            
        //   429: iconst_2       
        //   430: getstatic       dev/nuker/pyro/f6k.1:Ldev/nuker/pyro/f6k;
        //   433: aastore        
        //   434: dup            
        //   435: iconst_3       
        //   436: getstatic       dev/nuker/pyro/f6k.2:Ldev/nuker/pyro/f6k;
        //   439: aastore        
        //   440: dup            
        //   441: iconst_4       
        //   442: getstatic       dev/nuker/pyro/f6k.3:Ldev/nuker/pyro/f6k;
        //   445: aastore        
        //   446: dup            
        //   447: iconst_5       
        //   448: getstatic       dev/nuker/pyro/f6k.4:Ldev/nuker/pyro/f6k;
        //   451: aastore        
        //   452: dup            
        //   453: bipush          6
        //   455: getstatic       dev/nuker/pyro/f6k.5:Ldev/nuker/pyro/f6k;
        //   458: aastore        
        //   459: dup            
        //   460: bipush          7
        //   462: getstatic       dev/nuker/pyro/f6k.6:Ldev/nuker/pyro/f6k;
        //   465: aastore        
        //   466: dup            
        //   467: bipush          8
        //   469: getstatic       dev/nuker/pyro/f6k.7:Ldev/nuker/pyro/f6k;
        //   472: aastore        
        //   473: dup            
        //   474: bipush          9
        //   476: getstatic       dev/nuker/pyro/f6k.8:Ldev/nuker/pyro/f6k;
        //   479: aastore        
        //   480: dup            
        //   481: bipush          10
        //   483: getstatic       dev/nuker/pyro/f6k.9:Ldev/nuker/pyro/f6k;
        //   486: aastore        
        //   487: dup            
        //   488: bipush          11
        //   490: getstatic       dev/nuker/pyro/f6k.a:Ldev/nuker/pyro/f6k;
        //   493: aastore        
        //   494: getstatic       dev/nuker/pyro/fc.0:I
        //   497: ifeq            505
        //   500: ldc             918709657
        //   502: goto            507
        //   505: ldc             -1707458814
        //   507: ldc             1064828632
        //   509: ixor           
        //   510: lookupswitch {
        //          -1521630758: 536
        //          162896705: 505
        //          default: 542
        //        }
        //   536: putstatic       dev/nuker/pyro/f6k.c:[Ldev/nuker/pyro/f6k;
        //   539: return         
        //   540: aconst_null    
        //   541: athrow         
        //   542: aconst_null    
        //   543: athrow         
        //   544: aconst_null    
        //   545: athrow         
        //   546: aconst_null    
        //   547: athrow         
        //   548: aconst_null    
        //   549: athrow         
        //   550: aconst_null    
        //   551: athrow         
        //    StackMapTable: 00 18 68 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5D 07 00 03 7A 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5E 07 00 03 FF 00 45 00 00 00 03 08 00 D9 08 00 D9 07 00 25 FF 00 01 00 00 00 04 08 00 D9 08 00 D9 07 00 25 01 FF 00 1B 00 00 00 03 08 00 D9 08 00 D9 07 00 25 FF 00 2C 00 00 00 03 08 01 24 08 01 24 07 00 25 FF 00 01 00 00 00 04 08 01 24 08 01 24 07 00 25 01 FF 00 1C 00 00 00 03 08 01 24 08 01 24 07 00 25 FF 00 33 00 00 00 03 07 00 7B 07 00 7B 01 FF 00 01 00 00 00 04 07 00 7B 07 00 7B 01 01 FF 00 1D 00 00 00 03 07 00 7B 07 00 7B 01 F7 00 50 07 00 7B FF 00 01 00 00 00 02 07 00 7B 01 5C 07 00 7B 43 07 00 03 41 07 00 7B FF 00 01 00 00 00 03 08 00 D9 08 00 D9 07 00 25 41 07 00 03 FF 00 01 00 00 00 03 08 01 24 08 01 24 07 00 25 FF 00 01 00 00 00 03 07 00 7B 07 00 7B 01
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
    
    public f6k(final String name, final int ordinal) {
    }
}
