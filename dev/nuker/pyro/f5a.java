// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.NoSuchElementException;

public enum f5A
{
    public static f5A c;
    public static f5A 0;
    public static f5A[] c;
    
    public static f5A c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f5A;.class
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -916268352
        //    35: goto            40
        //    38: ldc             -1659641422
        //    40: ldc             -887540587
        //    42: ixor           
        //    43: lookupswitch {
        //          41676373: 83
        //          1358555553: 38
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    75: goto            79
        //    78: athrow         
        //    79: checkcast       Ldev/nuker/pyro/f5A;
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
        //    StackMapTable: 00 11 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 22 FF 00 0D 00 01 07 00 22 00 02 07 00 24 07 00 22 FF 00 01 00 01 07 00 22 00 03 07 00 24 07 00 22 01 FF 00 1B 00 01 07 00 22 00 02 07 00 24 07 00 22 FF 00 02 00 00 00 01 07 00 19 FF 00 00 00 01 07 00 22 00 02 07 00 24 07 00 22 45 07 00 19 40 07 00 05 FF 00 03 00 01 07 00 22 00 02 07 00 24 07 00 22 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     94     102    Ljava/lang/IndexOutOfBoundsException;
        //  94     102    94     102    Any
        //  110    112    3      8      Any
        //  72     78     78     79     Any
        //  72     78     78     79     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     78     3      8      Ljava/lang/NumberFormatException;
        //  72     78     78     79     Any
        //  72     78     78     79     Ljava/lang/NegativeArraySizeException;
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
        //     4: ldc             "\u23ca\u1481\u8ae6\ubf05\ufd89\uedfd\ub236"
        //     6: getstatic       dev/nuker/pyro/fc.0:I
        //     9: ifeq            17
        //    12: ldc             73672229
        //    14: goto            19
        //    17: ldc             465737344
        //    19: ldc             -1488858167
        //    21: ixor           
        //    22: lookupswitch {
        //          -1557793300: 17
        //          -1132247735: 48
        //          default: 224
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: invokespecial   dev/nuker/pyro/f5A.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f5A.c:Ldev/nuker/pyro/f5A;
        //    58: new             Ldev/nuker/pyro/f5A;
        //    61: dup            
        //    62: ldc             "\u23da\u149a\u8afc\ubf16\ufd8f\uedf6\ub227\ue6c7"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: getstatic       dev/nuker/pyro/fc.1:I
        //    71: ifeq            79
        //    74: ldc             1130295800
        //    76: goto            81
        //    79: ldc             -1097463730
        //    81: ldc             1600673059
        //    83: ixor           
        //    84: lookupswitch {
        //          86740401: 79
        //          473343195: 226
        //          default: 112
        //        }
        //   112: invokespecial   dev/nuker/pyro/f5A.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f5A.0:Ldev/nuker/pyro/f5A;
        //   118: iconst_2       
        //   119: anewarray       Ldev/nuker/pyro/f5A;
        //   122: dup            
        //   123: iconst_0       
        //   124: getstatic       dev/nuker/pyro/fc.0:I
        //   127: ifeq            135
        //   130: ldc             -461423390
        //   132: goto            137
        //   135: ldc             -968812048
        //   137: ldc             -1975473024
        //   139: ixor           
        //   140: lookupswitch {
        //          -176321813: 135
        //          1849659490: 230
        //          default: 168
        //        }
        //   168: getstatic       dev/nuker/pyro/f5A.c:Ldev/nuker/pyro/f5A;
        //   171: aastore        
        //   172: dup            
        //   173: iconst_1       
        //   174: getstatic       dev/nuker/pyro/fc.0:I
        //   177: ifeq            185
        //   180: ldc             2054929707
        //   182: goto            187
        //   185: ldc             32588007
        //   187: ldc             -1400494023
        //   189: ixor           
        //   190: lookupswitch {
        //          -1384683298: 216
        //          -688024302: 185
        //          default: 228
        //        }
        //   216: getstatic       dev/nuker/pyro/f5A.0:Ldev/nuker/pyro/f5A;
        //   219: aastore        
        //   220: putstatic       dev/nuker/pyro/f5A.c:[Ldev/nuker/pyro/f5A;
        //   223: return         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: aconst_null    
        //   229: athrow         
        //   230: aconst_null    
        //   231: athrow         
        //    StackMapTable: 00 10 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 22 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 1E 00 00 00 04 08 00 3A 08 00 3A 07 00 22 01 FF 00 01 00 00 00 05 08 00 3A 08 00 3A 07 00 22 01 01 FF 00 1E 00 00 00 04 08 00 3A 08 00 3A 07 00 22 01 FF 00 16 00 00 00 03 07 00 2D 07 00 2D 01 FF 00 01 00 00 00 04 07 00 2D 07 00 2D 01 01 FF 00 1E 00 00 00 03 07 00 2D 07 00 2D 01 FF 00 10 00 00 00 03 07 00 2D 07 00 2D 01 FF 00 01 00 00 00 04 07 00 2D 07 00 2D 01 01 FF 00 1C 00 00 00 03 07 00 2D 07 00 2D 01 FF 00 07 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 01 00 00 00 04 08 00 3A 08 00 3A 07 00 22 01 FF 00 01 00 00 00 03 07 00 2D 07 00 2D 01 FF 00 01 00 00 00 03 07 00 2D 07 00 2D 01
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
    
    public f5A(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.c < 0) {
                    n = 438979418;
                    break Label_0013;
                }
                n = -635138034;
            }
            switch (n ^ 0x267F28FC) {
                case 1679500159: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.c < 0) {
                                n2 = 591933806;
                                break Label_0058;
                            }
                            n2 = -667521527;
                        }
                        switch (n2 ^ 0x3805C895) {
                            case -822449035: {
                                continue;
                            }
                            default: {
                                super(name, ordinal);
                                return;
                            }
                            case 458095099: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1012229030: {
                    throw null;
                }
            }
            break;
        }
    }
}
