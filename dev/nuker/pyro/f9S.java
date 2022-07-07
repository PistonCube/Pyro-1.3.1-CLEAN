// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public enum f9S
{
    public static f9S c;
    public static f9S 0;
    public static f9S 1;
    public static f9S 2;
    public static f9S[] c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u224c\u149c\u8b76\ubf0c"
        //     6: invokestatic    invokestatic   !!! ERROR
        //     9: iconst_0       
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            21
        //    16: ldc             -524591645
        //    18: goto            23
        //    21: ldc             -733708647
        //    23: ldc             1045770387
        //    25: ixor           
        //    26: lookupswitch {
        //          -554799760: 21
        //          -367964662: 52
        //          default: 226
        //        }
        //    52: invokespecial   dev/nuker/pyro/f9S.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f9S.c:Ldev/nuker/pyro/f9S;
        //    58: new             Ldev/nuker/pyro/f9S;
        //    61: dup            
        //    62: ldc             "\u225d\u1483"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f9S.<init>:(Ljava/lang/String;I)V
        //    71: getstatic       dev/nuker/pyro/fc.c:I
        //    74: ifge            82
        //    77: ldc             2095424049
        //    79: goto            84
        //    82: ldc             -2105070199
        //    84: ldc             25772129
        //    86: ixor           
        //    87: lookupswitch {
        //          -1768041557: 82
        //          2104287824: 222
        //          default: 112
        //        }
        //   112: putstatic       dev/nuker/pyro/f9S.0:Ldev/nuker/pyro/f9S;
        //   115: new             Ldev/nuker/pyro/f9S;
        //   118: dup            
        //   119: ldc             "\u224a\u1496\u8b6d\ubf0d\ufd07\uec40\ub225\ue741\ud5b6"
        //   121: invokestatic    invokestatic   !!! ERROR
        //   124: iconst_2       
        //   125: invokespecial   dev/nuker/pyro/f9S.<init>:(Ljava/lang/String;I)V
        //   128: putstatic       dev/nuker/pyro/f9S.1:Ldev/nuker/pyro/f9S;
        //   131: new             Ldev/nuker/pyro/f9S;
        //   134: dup            
        //   135: ldc             "\u2247\u1495\u8b67"
        //   137: invokestatic    invokestatic   !!! ERROR
        //   140: iconst_3       
        //   141: invokespecial   dev/nuker/pyro/f9S.<init>:(Ljava/lang/String;I)V
        //   144: putstatic       dev/nuker/pyro/f9S.2:Ldev/nuker/pyro/f9S;
        //   147: iconst_4       
        //   148: anewarray       Ldev/nuker/pyro/f9S;
        //   151: dup            
        //   152: iconst_0       
        //   153: getstatic       dev/nuker/pyro/f9S.c:Ldev/nuker/pyro/f9S;
        //   156: aastore        
        //   157: dup            
        //   158: iconst_1       
        //   159: getstatic       dev/nuker/pyro/f9S.0:Ldev/nuker/pyro/f9S;
        //   162: aastore        
        //   163: dup            
        //   164: iconst_2       
        //   165: getstatic       dev/nuker/pyro/fc.c:I
        //   168: ifge            176
        //   171: ldc             2138021259
        //   173: goto            178
        //   176: ldc             -2133603512
        //   178: ldc             -1753863561
        //   180: ixor           
        //   181: lookupswitch {
        //          -400967684: 176
        //          396747071: 208
        //          default: 224
        //        }
        //   208: getstatic       dev/nuker/pyro/f9S.1:Ldev/nuker/pyro/f9S;
        //   211: aastore        
        //   212: dup            
        //   213: iconst_3       
        //   214: getstatic       dev/nuker/pyro/f9S.2:Ldev/nuker/pyro/f9S;
        //   217: aastore        
        //   218: putstatic       dev/nuker/pyro/f9S.c:[Ldev/nuker/pyro/f9S;
        //   221: return         
        //   222: aconst_null    
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //    StackMapTable: 00 0C FF 00 15 00 00 00 04 08 00 00 08 00 00 07 00 47 01 FF 00 01 00 00 00 05 08 00 00 08 00 00 07 00 47 01 01 FF 00 1C 00 00 00 04 08 00 00 08 00 00 07 00 47 01 5D 07 00 03 FF 00 01 00 00 00 02 07 00 03 01 5B 07 00 03 FF 00 3F 00 00 00 03 07 00 19 07 00 19 01 FF 00 01 00 00 00 04 07 00 19 07 00 19 01 01 FF 00 1D 00 00 00 03 07 00 19 07 00 19 01 4D 07 00 03 FF 00 01 00 00 00 03 07 00 19 07 00 19 01 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 47 01
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
    
    public static f9S c(final String s) {
        Object o = null;
        Label_0008: {
            break Label_0008;
        Label_0059:
            while (true) {
                do {
                    while (true) {
                        break Label_0046;
                        try {
                            o = null;
                            if (fc.1 > 0) {
                                continue Label_0059;
                            }
                            null;
                            final Object o2;
                            return (f9S)o2;
                            goto Label_0031;
                        }
                        catch (ArithmeticException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            continue;
                        }
                        break;
                    }
                    continue Label_0059;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f9S(final String name, final int ordinal) {
    }
}
