// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.JsonElement;

public class f0h extends f0l
{
    @NotNull
    @Override
    public JsonElement c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          140
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            132
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            124
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonPrimitive;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             554455613
        //    36: goto            41
        //    39: ldc             2056617843
        //    41: ldc             454829457
        //    43: ixor           
        //    44: lookupswitch {
        //          -1296308812: 39
        //          974157740: 113
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   dev/nuker/pyro/f0h.5:()Ldev/nuker/pyro/fw;
        //    80: goto            84
        //    83: athrow         
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //    91: goto            95
        //    94: athrow         
        //    95: checkcast       Ljava/lang/Number;
        //    98: goto            102
        //   101: athrow         
        //   102: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   105: goto            109
        //   108: athrow         
        //   109: checkcast       Lcom/google/gson/JsonElement;
        //   112: areturn        
        //   113: aconst_null    
        //   114: athrow         
        //   115: pop            
        //   116: goto            24
        //   119: pop            
        //   120: aconst_null    
        //   121: goto            115
        //   124: dup            
        //   125: ifnull          115
        //   128: checkcast       Ljava/lang/Throwable;
        //   131: athrow         
        //   132: dup            
        //   133: ifnull          119
        //   136: checkcast       Ljava/lang/Throwable;
        //   139: athrow         
        //   140: aconst_null    
        //   141: athrow         
        //    StackMapTable: 00 19 43 07 00 1E 04 FF 00 0B 00 00 00 01 07 00 1E FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 03 00 00 00 01 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B FF 00 02 00 00 00 01 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B 45 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 39 45 07 00 10 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 31 45 07 00 1E 40 07 00 20 FF 00 03 00 01 07 00 03 00 02 08 00 18 08 00 18 41 07 00 1E 43 05 44 07 00 1E 47 05 47 07 00 1E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     124    132    Ljava/lang/UnsupportedOperationException;
        //  124    132    124    132    Any
        //  140    142    3      8      Ljava/lang/ClassCastException;
        //  77     83     83     84     Any
        //  77     83     3      8      Any
        //  77     83     83     84     Ljava/lang/IndexOutOfBoundsException;
        //  77     83     3      8      Ljava/lang/RuntimeException;
        //  77     83     3      8      Ljava/lang/NumberFormatException;
        //  88     94     94     95     Any
        //  88     94     3      8      Any
        //  88     94     3      8      Any
        //  88     94     3      8      Any
        //  88     94     3      8      Any
        //  101    108    108    109    Any
        //  102    108    101    102    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  101    108    108    109    Ljava/lang/NumberFormatException;
        //  102    108    101    102    Ljava/util/ConcurrentModificationException;
        //  102    108    108    109    Any
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
    
    public boolean c() {
        return fbS.e7(this, 1335212819);
    }
    
    @NotNull
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          69
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            61
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            53
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0J;
        //    27: dup            
        //    28: aload_0        
        //    29: goto            33
        //    32: athrow         
        //    33: invokespecial   dev/nuker/pyro/f0J.<init>:(Ldev/nuker/pyro/f0h;)V
        //    36: goto            40
        //    39: athrow         
        //    40: checkcast       Ldev/nuker/pyro/f0V;
        //    43: areturn        
        //    44: pop            
        //    45: goto            24
        //    48: pop            
        //    49: aconst_null    
        //    50: goto            44
        //    53: dup            
        //    54: ifnull          44
        //    57: checkcast       Ljava/lang/Throwable;
        //    60: athrow         
        //    61: dup            
        //    62: ifnull          48
        //    65: checkcast       Ljava/lang/Throwable;
        //    68: athrow         
        //    69: aconst_null    
        //    70: athrow         
        //    StackMapTable: 00 0D 43 07 00 1E 04 FF 00 0B 00 00 00 01 07 00 1E FC 00 03 07 00 03 FF 00 07 00 00 00 01 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1E 40 07 00 49 43 07 00 45 43 05 44 07 00 45 47 05 47 07 00 1E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      20     53     61     Ljava/util/NoSuchElementException;
        //  53     61     53     61     Ljava/util/NoSuchElementException;
        //  69     71     3      8      Any
        //  33     39     39     40     Any
        //  33     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     39     40     Any
        //  33     39     39     40     Any
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
    
    public f0h(@NotNull final String s, @NotNull final String s2, @Nullable final String s3, final int i) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = 246263727;
                    break Label_0013;
                }
                n = -1819347562;
            }
            switch (n ^ 0x30B829C6) {
                case 1041598057: {
                    continue;
                }
                case -1556685744: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.c < 0) {
                                n2 = -1756623621;
                                break Label_0061;
                            }
                            n2 = -1430796766;
                        }
                        switch (n2 ^ 0xCF796BC7) {
                            case 1479894844: {
                                continue;
                            }
                            case 1708043749: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0107: {
                                        if (fc.c < 0) {
                                            n3 = -1539612641;
                                            break Label_0107;
                                        }
                                        n3 = -24256170;
                                    }
                                    switch (n3 ^ 0x580C5931) {
                                        case 1514352331: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0151: {
                                                    if (fc.c < 0) {
                                                        n4 = 2037325659;
                                                        break Label_0151;
                                                    }
                                                    n4 = 1331327249;
                                                }
                                                switch (n4 ^ 0x1679BBD3) {
                                                    case -640615587: {
                                                        continue;
                                                    }
                                                    default: {
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0195: {
                                                                if (fc.0 != 0) {
                                                                    n5 = 500382128;
                                                                    break Label_0195;
                                                                }
                                                                n5 = 1638501650;
                                                            }
                                                            switch (n5 ^ 0xC61106E6) {
                                                                case -2032392964: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    super(s, s2, s3, i);
                                                                    return;
                                                                }
                                                                case -608026794: {
                                                                    throw null;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1863754888: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case -63489746: {
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
                    break;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void c(@NotNull final JsonElement jsonElement) {
        fbS.6W(this, 1978152781, jsonElement);
    }
    
    static {
        throw t;
    }
}
