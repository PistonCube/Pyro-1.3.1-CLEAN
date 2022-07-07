// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f9N
{
    public static f9N c;
    public static f9N 0;
    public static f9N 1;
    public static f9N 2;
    public static f9N 3;
    public static f9N[] c;
    
    public f9N(final String name, final int ordinal) {
        while (true) {
            Label_0016: {
                if (fc.c < 0) {
                    n = -1722363338;
                    break Label_0016;
                }
                n = 1740333535;
            }
            switch (n ^ 0x6F7DB8DA) {
                case -372875027: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                }
                case -164926740: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static f9N c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/f9N;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f9N;
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
        //    StackMapTable: 00 0D 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 31 FF 00 05 00 00 00 01 07 00 1D FF 00 00 00 01 07 00 31 00 02 07 00 38 07 00 31 45 07 00 1D 40 07 00 05 43 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Any
        //  67     69     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
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
        //     1: anewarray       Ldev/nuker/pyro/f9N;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f9N;
        //    10: dup            
        //    11: ldc             "\u2250\u149f\u8b69\ubf15"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: getstatic       dev/nuker/pyro/fc.c:I
        //    20: ifge            28
        //    23: ldc             1329282000
        //    25: goto            30
        //    28: ldc             -2092471813
        //    30: ldc             1490221318
        //    32: ixor           
        //    33: lookupswitch {
        //          401195734: 424
        //          1978021198: 28
        //          default: 60
        //        }
        //    60: invokespecial   dev/nuker/pyro/f9N.<init>:(Ljava/lang/String;I)V
        //    63: dup            
        //    64: putstatic       dev/nuker/pyro/f9N.c:Ldev/nuker/pyro/f9N;
        //    67: aastore        
        //    68: dup            
        //    69: iconst_1       
        //    70: new             Ldev/nuker/pyro/f9N;
        //    73: dup            
        //    74: ldc             "\u2258\u1486\u8b72\ubf0e\ufd1c\uec7f\ub221"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: invokespecial   dev/nuker/pyro/f9N.<init>:(Ljava/lang/String;I)V
        //    83: dup            
        //    84: getstatic       dev/nuker/pyro/fc.c:I
        //    87: ifge            95
        //    90: ldc             -1795559280
        //    92: goto            97
        //    95: ldc             -194855196
        //    97: ldc             -1511095597
        //    99: ixor           
        //   100: lookupswitch {
        //          823620163: 95
        //          1368144951: 128
        //          default: 420
        //        }
        //   128: putstatic       dev/nuker/pyro/f9N.0:Ldev/nuker/pyro/f9N;
        //   131: aastore        
        //   132: dup            
        //   133: iconst_2       
        //   134: new             Ldev/nuker/pyro/f9N;
        //   137: dup            
        //   138: ldc             "\u2251\u149a\u8b6a\ubf0e\ufd10\uec75"
        //   140: getstatic       dev/nuker/pyro/fc.0:I
        //   143: ifeq            151
        //   146: ldc             776113190
        //   148: goto            153
        //   151: ldc             -426582229
        //   153: ldc             -1754094754
        //   155: ixor           
        //   156: lookupswitch {
        //          -1188024456: 416
        //          434666497: 151
        //          default: 184
        //        }
        //   184: invokestatic    invokestatic   !!! ERROR
        //   187: iconst_2       
        //   188: invokespecial   dev/nuker/pyro/f9N.<init>:(Ljava/lang/String;I)V
        //   191: dup            
        //   192: putstatic       dev/nuker/pyro/f9N.1:Ldev/nuker/pyro/f9N;
        //   195: aastore        
        //   196: dup            
        //   197: iconst_3       
        //   198: new             Ldev/nuker/pyro/f9N;
        //   201: dup            
        //   202: ldc             "\u2251\u149a\u8b6a\ubf0e\ufd10\uec75\ub20b\ue75e\ud5a7\udd6a\ua6b8\u1e42\ue06a"
        //   204: invokestatic    invokestatic   !!! ERROR
        //   207: iconst_3       
        //   208: invokespecial   dev/nuker/pyro/f9N.<init>:(Ljava/lang/String;I)V
        //   211: dup            
        //   212: getstatic       dev/nuker/pyro/fc.1:I
        //   215: ifeq            223
        //   218: ldc             -611869214
        //   220: goto            225
        //   223: ldc             -122473575
        //   225: ldc             1113254556
        //   227: ixor           
        //   228: lookupswitch {
        //          -1713539202: 223
        //          -1159079675: 256
        //          default: 422
        //        }
        //   256: putstatic       dev/nuker/pyro/f9N.2:Ldev/nuker/pyro/f9N;
        //   259: aastore        
        //   260: dup            
        //   261: iconst_4       
        //   262: new             Ldev/nuker/pyro/f9N;
        //   265: dup            
        //   266: ldc             "\u2251\u149f\u8b67\ubf16"
        //   268: getstatic       dev/nuker/pyro/fc.c:I
        //   271: ifge            279
        //   274: ldc             1200902510
        //   276: goto            281
        //   279: ldc             1845884081
        //   281: ldc             -1904748039
        //   283: ixor           
        //   284: lookupswitch {
        //          -907835241: 279
        //          -529388216: 312
        //          default: 426
        //        }
        //   312: invokestatic    invokestatic   !!! ERROR
        //   315: iconst_4       
        //   316: getstatic       dev/nuker/pyro/fc.c:I
        //   319: ifge            327
        //   322: ldc             258556918
        //   324: goto            329
        //   327: ldc             -796245256
        //   329: ldc             -411339879
        //   331: ixor           
        //   332: lookupswitch {
        //          -401461137: 327
        //          938553697: 360
        //          default: 428
        //        }
        //   360: invokespecial   dev/nuker/pyro/f9N.<init>:(Ljava/lang/String;I)V
        //   363: dup            
        //   364: getstatic       dev/nuker/pyro/fc.1:I
        //   367: ifeq            375
        //   370: ldc             -260551634
        //   372: goto            377
        //   375: ldc             1302651567
        //   377: ldc             -561393993
        //   379: ixor           
        //   380: lookupswitch {
        //          787579545: 418
        //          1097776795: 375
        //          default: 408
        //        }
        //   408: putstatic       dev/nuker/pyro/f9N.3:Ldev/nuker/pyro/f9N;
        //   411: aastore        
        //   412: putstatic       dev/nuker/pyro/f9N.c:[Ldev/nuker/pyro/f9N;
        //   415: return         
        //   416: aconst_null    
        //   417: athrow         
        //   418: aconst_null    
        //   419: athrow         
        //   420: aconst_null    
        //   421: athrow         
        //   422: aconst_null    
        //   423: athrow         
        //   424: aconst_null    
        //   425: athrow         
        //   426: aconst_null    
        //   427: athrow         
        //   428: aconst_null    
        //   429: athrow         
        //    StackMapTable: 00 1C FF 00 1C 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 00 07 08 00 07 07 00 31 01 FF 00 01 00 00 00 09 07 00 20 07 00 20 07 00 20 01 08 00 07 08 00 07 07 00 31 01 01 FF 00 1D 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 00 07 08 00 07 07 00 31 01 FF 00 22 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 16 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 00 86 08 00 86 07 00 31 FF 00 01 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 00 86 08 00 86 07 00 31 01 FF 00 1E 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 00 86 08 00 86 07 00 31 FF 00 26 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 16 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 FF 00 01 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 01 FF 00 1E 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 FF 00 0E 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 01 FF 00 01 00 00 00 09 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 01 01 FF 00 1E 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 01 FF 00 0E 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 01 FF 00 1E 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 07 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 00 86 08 00 86 07 00 31 FF 00 01 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 06 07 00 20 07 00 20 07 00 20 01 07 00 03 07 00 03 FF 00 01 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 00 07 08 00 07 07 00 31 01 FF 00 01 00 00 00 07 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 FF 00 01 00 00 00 08 07 00 20 07 00 20 07 00 20 01 08 01 06 08 01 06 07 00 31 01
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
}
