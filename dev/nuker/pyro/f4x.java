// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f4X
{
    public static f4X c;
    public static f4X 0;
    public static f4X[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u23b5\u149c\u8a91\ubf16"
        //     6: getstatic       dev/nuker/pyro/fc.c:I
        //     9: ifge            17
        //    12: ldc             -29151145
        //    14: goto            19
        //    17: ldc             351362622
        //    19: ldc             -515474765
        //    21: ixor           
        //    22: lookupswitch {
        //          -172546931: 48
        //          520440548: 17
        //          default: 138
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: getstatic       dev/nuker/pyro/fc.0:I
        //    55: ifeq            63
        //    58: ldc             -1486331144
        //    60: goto            65
        //    63: ldc             -581648727
        //    65: ldc             -541119963
        //    67: ixor           
        //    68: lookupswitch {
        //          48993420: 96
        //          2027374813: 63
        //          default: 140
        //        }
        //    96: invokespecial   dev/nuker/pyro/f4X.<init>:(Ljava/lang/String;I)V
        //    99: putstatic       dev/nuker/pyro/f4X.c:Ldev/nuker/pyro/f4X;
        //   102: new             Ldev/nuker/pyro/f4X;
        //   105: dup            
        //   106: ldc             "\u23b4\u1496\u8a87\ubf0e\ufd87\ued83\ub221"
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: iconst_1       
        //   112: invokespecial   dev/nuker/pyro/f4X.<init>:(Ljava/lang/String;I)V
        //   115: putstatic       dev/nuker/pyro/f4X.0:Ldev/nuker/pyro/f4X;
        //   118: iconst_2       
        //   119: anewarray       Ldev/nuker/pyro/f4X;
        //   122: dup            
        //   123: iconst_0       
        //   124: getstatic       dev/nuker/pyro/f4X.c:Ldev/nuker/pyro/f4X;
        //   127: aastore        
        //   128: dup            
        //   129: iconst_1       
        //   130: getstatic       dev/nuker/pyro/f4X.0:Ldev/nuker/pyro/f4X;
        //   133: aastore        
        //   134: putstatic       dev/nuker/pyro/f4X.c:[Ldev/nuker/pyro/f4X;
        //   137: return         
        //   138: aconst_null    
        //   139: athrow         
        //   140: aconst_null    
        //   141: athrow         
        //    StackMapTable: 00 08 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 2D FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 2D 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 2D FF 00 0E 00 00 00 04 08 00 00 08 00 00 07 00 2D 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 2D 01 01 FF 00 1E 00 00 00 04 08 00 00 08 00 00 07 00 2D 01 FF 00 29 00 00 00 03 08 00 00 08 00 00 07 00 2D FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 2D 01
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
    
    public static f4X c(final String s) {
        Object o = null;
        Label_0008: {
            break Label_0008;
        Label_0059:
            while (true) {
                do {
                    Label_0046: {
                        break Label_0046;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0051;
                            }
                            continue Label_0059;
                            final Object o2;
                            return (f4X)o2;
                            goto Label_0031;
                        }
                        catch (NegativeArraySizeException ex) {}
                    }
                    continue Label_0059;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f4X(final String name, final int ordinal) {
        while (true) {
            Label_0013: {
                if (fc.1 != 0) {
                    n = -522590186;
                    break Label_0013;
                }
                n = -734903830;
            }
            switch (n ^ 0x7B934A3F) {
                case -1689607639: {
                    continue;
                }
                case -1348400171: {
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
