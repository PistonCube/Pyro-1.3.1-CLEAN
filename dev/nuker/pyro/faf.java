// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum faf
{
    public static faf c;
    public static faf 0;
    public static faf 1;
    public static faf 2;
    public static faf 3;
    public static faf 4;
    public float c;
    public float 0;
    public static faf[] c;
    
    public float 0() {
        return fbS.ab(this, 801249453);
    }
    
    public float c() {
        return fbS.aD(this, 1499605692);
    }
    
    public static faf c(final String p0) {
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
        //    24: ldc             Ldev/nuker/pyro/faf;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/faf;
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
        //    StackMapTable: 00 0D 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 46 45 07 00 14 FF 00 00 00 01 07 00 46 00 02 07 00 48 07 00 46 45 07 00 1D 40 07 00 05 43 07 00 4A 43 05 44 07 00 4A 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Ljava/lang/IllegalArgumentException;
        //  51     59     51     59     Ljava/lang/IllegalStateException;
        //  67     69     3      8      Any
        //  30     37     37     38     Any
        //  30     37     3      8      Any
        //  31     37     30     31     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  30     37     37     38     Ljava/lang/NullPointerException;
        //  30     37     3      8      Ljava/lang/StringIndexOutOfBoundsException;
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
    
    public faf(final String name, final int ordinal, final float c, final float 0) {
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.0 != 0) {
                    n = -1208853620;
                    break Label_0019;
                }
                n = 1295092211;
            }
            switch (n ^ 0x58FE6363) {
                case -284411665: {
                    continue;
                }
                case 365947536: {
                    while (true) {
                        int n2 = 0;
                        Label_0062: {
                            if (fc.c < 0) {
                                n2 = 1576227045;
                                break Label_0062;
                            }
                            n2 = 522789811;
                        }
                        switch (n2 ^ 0xDCFAF0DD) {
                            case -2130075592: {
                                continue;
                            }
                            case -1009527954: {
                                this.c = c;
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
        //     4: ldc             "\u2929\u14bc\u8038\ubf27"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: fconst_0       
        //    11: fconst_0       
        //    12: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //    15: putstatic       dev/nuker/pyro/faf.c:Ldev/nuker/pyro/faf;
        //    18: new             Ldev/nuker/pyro/faf;
        //    21: dup            
        //    22: ldc             "\u2926\u14a1\u8024\ubf2d\ufa32"
        //    24: invokestatic    invokestatic   !!! ERROR
        //    27: iconst_1       
        //    28: ldc             1.5
        //    30: ldc             0.05
        //    32: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //    35: putstatic       dev/nuker/pyro/faf.0:Ldev/nuker/pyro/faf;
        //    38: new             Ldev/nuker/pyro/faf;
        //    41: dup            
        //    42: ldc             "\u2937\u14bc\u8022\ubf2b\ufa2a\ue72f"
        //    44: getstatic       dev/nuker/pyro/fc.1:I
        //    47: ifeq            55
        //    50: ldc             92644199
        //    52: goto            57
        //    55: ldc             863466449
        //    57: ldc             49838953
        //    59: ixor           
        //    60: lookupswitch {
        //          125687822: 55
        //          831457464: 88
        //          default: 336
        //        }
        //    88: invokestatic    invokestatic   !!! ERROR
        //    91: iconst_2       
        //    92: ldc             0.5
        //    94: ldc             0.05
        //    96: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //    99: putstatic       dev/nuker/pyro/faf.1:Ldev/nuker/pyro/faf;
        //   102: new             Ldev/nuker/pyro/faf;
        //   105: dup            
        //   106: ldc             "\u2922\u14ab\u8026\ubf27\ufa37\ue728\ub201\uec15\ud590\uda53"
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: iconst_3       
        //   112: ldc             0.7
        //   114: ldc             0.07
        //   116: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //   119: putstatic       dev/nuker/pyro/faf.2:Ldev/nuker/pyro/faf;
        //   122: new             Ldev/nuker/pyro/faf;
        //   125: dup            
        //   126: ldc             "\u2921\u14ba\u8025\ubf2a\ufa2c\ue72f\ub203\uec04\ud581\uda59\uade5"
        //   128: invokestatic    invokestatic   !!! ERROR
        //   131: iconst_4       
        //   132: ldc             1.5
        //   134: ldc             0.04
        //   136: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //   139: getstatic       dev/nuker/pyro/fc.0:I
        //   142: ifeq            150
        //   145: ldc             993821619
        //   147: goto            152
        //   150: ldc             2142414185
        //   152: ldc             -1225544225
        //   154: ixor           
        //   155: lookupswitch {
        //          -1915802004: 150
        //          -918484810: 180
        //          default: 334
        //        }
        //   180: putstatic       dev/nuker/pyro/faf.3:Ldev/nuker/pyro/faf;
        //   183: new             Ldev/nuker/pyro/faf;
        //   186: dup            
        //   187: ldc             "\u2929\u14bc\u8024\ubf2f\ufa24\ue72d"
        //   189: getstatic       dev/nuker/pyro/fc.1:I
        //   192: ifeq            200
        //   195: ldc             -1541909904
        //   197: goto            202
        //   200: ldc             -1648677141
        //   202: ldc             1046767319
        //   204: ixor           
        //   205: lookupswitch {
        //          -1703136089: 200
        //          -1545648068: 232
        //          default: 338
        //        }
        //   232: invokestatic    invokestatic   !!! ERROR
        //   235: iconst_5       
        //   236: ldc             1.5
        //   238: ldc             0.03
        //   240: invokespecial   dev/nuker/pyro/faf.<init>:(Ljava/lang/String;IFF)V
        //   243: putstatic       dev/nuker/pyro/faf.4:Ldev/nuker/pyro/faf;
        //   246: bipush          6
        //   248: anewarray       Ldev/nuker/pyro/faf;
        //   251: dup            
        //   252: iconst_0       
        //   253: getstatic       dev/nuker/pyro/faf.c:Ldev/nuker/pyro/faf;
        //   256: aastore        
        //   257: dup            
        //   258: iconst_1       
        //   259: getstatic       dev/nuker/pyro/faf.0:Ldev/nuker/pyro/faf;
        //   262: aastore        
        //   263: dup            
        //   264: iconst_2       
        //   265: getstatic       dev/nuker/pyro/faf.1:Ldev/nuker/pyro/faf;
        //   268: aastore        
        //   269: dup            
        //   270: iconst_3       
        //   271: getstatic       dev/nuker/pyro/fc.1:I
        //   274: ifeq            282
        //   277: ldc             1408991222
        //   279: goto            284
        //   282: ldc             -1473613627
        //   284: ldc             -545172544
        //   286: ixor           
        //   287: lookupswitch {
        //          -1938150346: 332
        //          -1670291026: 282
        //          default: 312
        //        }
        //   312: getstatic       dev/nuker/pyro/faf.2:Ldev/nuker/pyro/faf;
        //   315: aastore        
        //   316: dup            
        //   317: iconst_4       
        //   318: getstatic       dev/nuker/pyro/faf.3:Ldev/nuker/pyro/faf;
        //   321: aastore        
        //   322: dup            
        //   323: iconst_5       
        //   324: getstatic       dev/nuker/pyro/faf.4:Ldev/nuker/pyro/faf;
        //   327: aastore        
        //   328: putstatic       dev/nuker/pyro/faf.c:[Ldev/nuker/pyro/faf;
        //   331: return         
        //   332: aconst_null    
        //   333: athrow         
        //   334: aconst_null    
        //   335: athrow         
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //    StackMapTable: 00 10 FF 00 37 00 00 00 03 08 00 26 08 00 26 07 00 46 FF 00 01 00 00 00 04 08 00 26 08 00 26 07 00 46 01 FF 00 1E 00 00 00 03 08 00 26 08 00 26 07 00 46 7D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 13 00 00 00 03 08 00 B7 08 00 B7 07 00 46 FF 00 01 00 00 00 04 08 00 B7 08 00 B7 07 00 46 01 FF 00 1D 00 00 00 03 08 00 B7 08 00 B7 07 00 46 FF 00 31 00 00 00 03 07 00 25 07 00 25 01 FF 00 01 00 00 00 04 07 00 25 07 00 25 01 01 FF 00 1B 00 00 00 03 07 00 25 07 00 25 01 FF 00 13 00 00 00 03 07 00 25 07 00 25 01 41 07 00 03 FF 00 01 00 00 00 03 08 00 26 08 00 26 07 00 46 FF 00 01 00 00 00 03 08 00 B7 08 00 B7 07 00 46
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
}
