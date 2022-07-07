// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ConcurrentModificationException;

public enum f2T
{
    public static f2T c;
    public static f2T 0;
    public static f2T[] c;
    
    public static f2T c(final String s) {
        Object o = null;
        Label_0008: {
            break Label_0008;
        Label_0148:
            while (true) {
            Label_0131_Outer:
                do {
                    Label_0135: {
                        break Label_0135;
                    Label_0131:
                        while (true) {
                            try {
                                o = null;
                                if (fc.0 > 0) {
                                    continue Label_0148;
                                }
                                null;
                                final Object o2;
                                return (f2T)o2;
                                Label_0129: {
                                    throw null;
                                }
                                // switch([Lcom.strobel.decompiler.ast.Label;@2f36d37f, n ^ 0x59F5052C)
                                // iftrue(Label_0037:, fc.0 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@14924fd4, n2 ^ 0x5D349C62)
                            Label_0082:
                                while (true) {
                                    while (true) {
                                        Block_4: {
                                            break Block_4;
                                            Label_0080:
                                            final int n2 = 774213724;
                                            break Label_0082;
                                            Label_0127:
                                            throw null;
                                            Label_0112:
                                            goto Label_0116;
                                            continue Label_0131;
                                        }
                                        int n = 471241862;
                                        continue Label_0131_Outer;
                                        Label_0037:
                                        n = 2075485615;
                                        continue Label_0131_Outer;
                                    }
                                    Label_0068:
                                    final int n2 = -419289704;
                                    continue Label_0082;
                                }
                            }
                            // iftrue(Label_0080:, fc.1 == 0)
                            catch (ConcurrentModificationException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue Label_0131;
                            }
                            break;
                        }
                    }
                    continue Label_0148;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "\u2370\u1481\u8a5c"
        //     6: getstatic       dev/nuker/pyro/fc.0:I
        //     9: ifeq            17
        //    12: ldc             578812727
        //    14: goto            19
        //    17: ldc             -1133820832
        //    19: ldc             637633918
        //    21: ixor           
        //    22: lookupswitch {
        //          -1704279778: 48
        //          75398729: 17
        //          default: 136
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: iconst_0       
        //    52: invokespecial   dev/nuker/pyro/f2T.<init>:(Ljava/lang/String;I)V
        //    55: putstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    58: new             Ldev/nuker/pyro/f2T;
        //    61: dup            
        //    62: ldc             "\u2370\u149c\u8a4a\ubf16"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: iconst_1       
        //    68: invokespecial   dev/nuker/pyro/f2T.<init>:(Ljava/lang/String;I)V
        //    71: putstatic       dev/nuker/pyro/f2T.0:Ldev/nuker/pyro/f2T;
        //    74: iconst_2       
        //    75: anewarray       Ldev/nuker/pyro/f2T;
        //    78: dup            
        //    79: iconst_0       
        //    80: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    83: aastore        
        //    84: dup            
        //    85: iconst_1       
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            97
        //    92: ldc             2086940171
        //    94: goto            99
        //    97: ldc             1162487620
        //    99: ldc             -1982070419
        //   101: ixor           
        //   102: lookupswitch {
        //          -862575063: 128
        //          -172478618: 97
        //          default: 138
        //        }
        //   128: getstatic       dev/nuker/pyro/f2T.0:Ldev/nuker/pyro/f2T;
        //   131: aastore        
        //   132: putstatic       dev/nuker/pyro/f2T.c:[Ldev/nuker/pyro/f2T;
        //   135: return         
        //   136: aconst_null    
        //   137: athrow         
        //   138: aconst_null    
        //   139: athrow         
        //    StackMapTable: 00 08 FF 00 11 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 01 00 00 00 04 08 00 00 08 00 00 07 00 22 01 FF 00 1C 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 30 00 00 00 03 07 00 42 07 00 42 01 FF 00 01 00 00 00 04 07 00 42 07 00 42 01 01 FF 00 1C 00 00 00 03 07 00 42 07 00 42 01 FF 00 07 00 00 00 03 08 00 00 08 00 00 07 00 22 FF 00 01 00 00 00 03 07 00 42 07 00 42 01
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
    
    public f2T(final String name, final int ordinal) {
        while (true) {
            Label_0016: {
                if (fc.1 != 0) {
                    n = 706174694;
                    break Label_0016;
                }
                n = -1864554859;
            }
            switch (n ^ 0x4DFD1CC5) {
                case 1743405603: {
                    continue;
                }
                case -585090480: {
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
