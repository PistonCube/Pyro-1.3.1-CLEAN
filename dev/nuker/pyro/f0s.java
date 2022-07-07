// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;

public enum f0s
{
    public static f0s c;
    public static f0s 0;
    public static f0s 1;
    public static f0s 2;
    public static f0s[] c;
    public int c;
    public int 0;
    public static f0r c;
    
    public int 1() {
        return fbS.bn(this, 443043022);
    }
    
    public static f0s c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f0s;.class
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             -247670349
        //    34: goto            39
        //    37: ldc             184449026
        //    39: ldc             363414206
        //    41: ixor           
        //    42: lookupswitch {
        //          -459957491: 84
        //          1751904407: 37
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    76: goto            80
        //    79: athrow         
        //    80: checkcast       Ldev/nuker/pyro/f0s;
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
        //    StackMapTable: 00 11 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FC 00 03 07 00 2B 4C 07 00 2D FF 00 01 00 01 07 00 2B 00 02 07 00 2D 01 5C 07 00 2D 43 07 00 20 FF 00 00 00 01 07 00 2B 00 02 07 00 2D 07 00 2B 45 07 00 20 40 07 00 05 43 07 00 2D 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     95     103    Any
        //  95     103    95     103    Ljava/lang/ClassCastException;
        //  111    113    3      8      Any
        //  72     79     79     80     Any
        //  72     79     79     80     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     79     79     80     Any
        //  72     79     72     73     Any
        //  72     79     3      8      Any
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
    
    @Nullable
    public f0x c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            117
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            109
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.0:I
        //    20: ifeq            28
        //    23: ldc             -1204062398
        //    25: goto            30
        //    28: ldc             -367105285
        //    30: ldc             -809900198
        //    32: ixor           
        //    33: lookupswitch {
        //          631737761: 60
        //          2005045272: 28
        //          default: 98
        //        }
        //    60: getfield        dev/nuker/pyro/f0s.c:I
        //    63: tableswitch {
        //               -2: 88
        //               -1: 96
        //                0: 92
        //          default: 96
        //        }
        //    88: getstatic       dev/nuker/pyro/f0x.c:Ldev/nuker/pyro/f0x;
        //    91: areturn        
        //    92: getstatic       dev/nuker/pyro/f0x.0:Ldev/nuker/pyro/f0x;
        //    95: areturn        
        //    96: aconst_null    
        //    97: areturn        
        //    98: aconst_null    
        //    99: athrow         
        //   100: pop            
        //   101: goto            16
        //   104: pop            
        //   105: aconst_null    
        //   106: goto            100
        //   109: dup            
        //   110: ifnull          100
        //   113: checkcast       Ljava/lang/Throwable;
        //   116: athrow         
        //   117: dup            
        //   118: ifnull          104
        //   121: checkcast       Ljava/lang/Throwable;
        //   124: athrow         
        //    StackMapTable: 00 0D FF 00 0C 00 00 00 01 07 00 20 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 1B 03 03 41 07 00 03 41 07 00 20 43 05 44 07 00 20 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     109    117    Any
        //  109    117    109    117    Any
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
        //     1: anewarray       Ldev/nuker/pyro/f0s;
        //     4: dup            
        //     5: dup            
        //     6: iconst_0       
        //     7: new             Ldev/nuker/pyro/f0s;
        //    10: dup            
        //    11: ldc             "\u2355\u14bc\u8a48\ubf3d\ufdcb\ued42\ub202\ue661"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: iconst_m1      
        //    18: iconst_m1      
        //    19: invokespecial   dev/nuker/pyro/f0s.<init>:(Ljava/lang/String;III)V
        //    22: dup            
        //    23: getstatic       dev/nuker/pyro/fc.c:I
        //    26: ifge            34
        //    29: ldc             -903262738
        //    31: goto            36
        //    34: ldc             -1999814182
        //    36: ldc             2065805269
        //    38: ixor           
        //    39: lookupswitch {
        //          -1324817861: 232
        //          -134911518: 34
        //          default: 64
        //        }
        //    64: putstatic       dev/nuker/pyro/f0s.c:Ldev/nuker/pyro/f0s;
        //    67: aastore        
        //    68: dup            
        //    69: iconst_1       
        //    70: new             Ldev/nuker/pyro/f0s;
        //    73: dup            
        //    74: ldc             "\u2355\u14bc\u8a48\ubf3d\ufdd5\ued4e\ub203\ue67d\ud587"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: iconst_1       
        //    80: iconst_1       
        //    81: iconst_m1      
        //    82: invokespecial   dev/nuker/pyro/f0s.<init>:(Ljava/lang/String;III)V
        //    85: dup            
        //    86: putstatic       dev/nuker/pyro/f0s.0:Ldev/nuker/pyro/f0s;
        //    89: aastore        
        //    90: dup            
        //    91: iconst_2       
        //    92: new             Ldev/nuker/pyro/f0s;
        //    95: dup            
        //    96: ldc             "\u2343\u14bc\u8a4c\ubf36\ufdc8\ued4a\ub21b\ue679\ud596\uddb2\ua793"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: iconst_2       
        //   102: iconst_m1      
        //   103: iconst_1       
        //   104: invokespecial   dev/nuker/pyro/f0s.<init>:(Ljava/lang/String;III)V
        //   107: dup            
        //   108: putstatic       dev/nuker/pyro/f0s.1:Ldev/nuker/pyro/f0s;
        //   111: aastore        
        //   112: dup            
        //   113: iconst_3       
        //   114: new             Ldev/nuker/pyro/f0s;
        //   117: dup            
        //   118: ldc             "\u2343\u14bc\u8a4c\ubf36\ufdc8\ued4a\ub21b\ue667\ud59a\uddb3\ua78f\u1e78"
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: iconst_3       
        //   124: iconst_1       
        //   125: iconst_1       
        //   126: invokespecial   dev/nuker/pyro/f0s.<init>:(Ljava/lang/String;III)V
        //   129: dup            
        //   130: putstatic       dev/nuker/pyro/f0s.2:Ldev/nuker/pyro/f0s;
        //   133: aastore        
        //   134: putstatic       dev/nuker/pyro/f0s.c:[Ldev/nuker/pyro/f0s;
        //   137: new             Ldev/nuker/pyro/f0r;
        //   140: dup            
        //   141: aconst_null    
        //   142: getstatic       dev/nuker/pyro/fc.1:I
        //   145: ifeq            153
        //   148: ldc             920444913
        //   150: goto            155
        //   153: ldc             848813300
        //   155: ldc             605547128
        //   157: ixor           
        //   158: lookupswitch {
        //          315307401: 153
        //          377501324: 184
        //          default: 234
        //        }
        //   184: invokespecial   dev/nuker/pyro/f0r.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   187: getstatic       dev/nuker/pyro/fc.0:I
        //   190: ifeq            198
        //   193: ldc             1204097055
        //   195: goto            200
        //   198: ldc             -1976726424
        //   200: ldc             -1574472648
        //   202: ixor           
        //   203: lookupswitch {
        //          -438148057: 236
        //          -186138507: 198
        //          default: 228
        //        }
        //   228: putstatic       dev/nuker/pyro/f0s.c:Ldev/nuker/pyro/f0r;
        //   231: return         
        //   232: aconst_null    
        //   233: athrow         
        //   234: aconst_null    
        //   235: athrow         
        //   236: aconst_null    
        //   237: athrow         
        //    StackMapTable: 00 0C FF 00 22 00 00 00 06 07 00 6A 07 00 6A 07 00 6A 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 6A 07 00 6A 07 00 6A 01 07 00 03 07 00 03 01 FF 00 1B 00 00 00 06 07 00 6A 07 00 6A 07 00 6A 01 07 00 03 07 00 03 FF 00 58 00 00 00 04 07 00 6A 08 00 89 08 00 89 05 FF 00 01 00 00 00 05 07 00 6A 08 00 89 08 00 89 05 01 FF 00 1C 00 00 00 04 07 00 6A 08 00 89 08 00 89 05 FF 00 0D 00 00 00 02 07 00 6A 07 00 5E FF 00 01 00 00 00 03 07 00 6A 07 00 5E 01 FF 00 1B 00 00 00 02 07 00 6A 07 00 5E FF 00 03 00 00 00 06 07 00 6A 07 00 6A 07 00 6A 01 07 00 03 07 00 03 FF 00 01 00 00 00 04 07 00 6A 08 00 89 08 00 89 05 FF 00 01 00 00 00 02 07 00 6A 07 00 5E
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
    
    public int 0() {
        return fbS.bo(this, 1127969090);
    }
    
    public f0s(final String name, final int ordinal, final int c, final int 0) {
        while (true) {
            Label_0013: {
                if (fc.1 != 0) {
                    n = -1873014087;
                    break Label_0013;
                }
                n = -729195045;
            }
            switch (n ^ 0xEC8C5ADF) {
                case 1553872265: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0071: {
                            if (fc.0 != 0) {
                                n2 = 225382359;
                                break Label_0071;
                            }
                            n2 = 1934803746;
                        }
                        switch (n2 ^ 0x994575FE) {
                            case -1809155543: {
                                continue;
                            }
                            case -367544612: {
                                this.0 = 0;
                                return;
                            }
                            default: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 2094024806: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public double 0(final double n, final int n2) {
        return fbS.8G(this, 1956125346, n, n2);
    }
    
    public double c(final double n, final int n2) {
        return fbS.8G(this, 1956125347, n, n2);
    }
}
