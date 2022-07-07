// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f0W extends f0Z
{
    @NotNull
    @Override
    public f0Z c(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          200
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            192
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            184
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0W;
        //    27: dup            
        //    28: aload_0        
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/f0W.4:()D
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/fc.1:I
        //    43: ifeq            51
        //    46: ldc             777833811
        //    48: goto            53
        //    51: ldc             -732019596
        //    53: ldc             -1817286861
        //    55: ixor           
        //    56: lookupswitch {
        //          -1108170144: 171
        //          110736838: 51
        //          default: 84
        //        }
        //    84: dload_1        
        //    85: dsub           
        //    86: aload_0        
        //    87: goto            91
        //    90: athrow         
        //    91: invokevirtual   dev/nuker/pyro/f0W.3:()D
        //    94: goto            98
        //    97: athrow         
        //    98: dload_3        
        //    99: dsub           
        //   100: aload_0        
        //   101: goto            105
        //   104: athrow         
        //   105: invokevirtual   dev/nuker/pyro/f0W.c:()I
        //   108: goto            112
        //   111: athrow         
        //   112: getstatic       dev/nuker/pyro/fc.1:I
        //   115: ifeq            123
        //   118: ldc             1368861448
        //   120: goto            125
        //   123: ldc             -1747551524
        //   125: ldc             -523751897
        //   127: ixor           
        //   128: lookupswitch {
        //          -1319172817: 123
        //          1998476539: 156
        //          default: 173
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   dev/nuker/pyro/f0W.<init>:(DDI)V
        //   163: goto            167
        //   166: athrow         
        //   167: checkcast       Ldev/nuker/pyro/f0Z;
        //   170: areturn        
        //   171: aconst_null    
        //   172: athrow         
        //   173: aconst_null    
        //   174: athrow         
        //   175: pop            
        //   176: goto            24
        //   179: pop            
        //   180: aconst_null    
        //   181: goto            175
        //   184: dup            
        //   185: ifnull          175
        //   188: checkcast       Ljava/lang/Throwable;
        //   191: athrow         
        //   192: dup            
        //   193: ifnull          179
        //   196: checkcast       Ljava/lang/Throwable;
        //   199: athrow         
        //   200: aconst_null    
        //   201: athrow         
        //    StackMapTable: 00 21 43 07 00 1E 04 FF 00 0B 00 00 00 01 07 00 1E FE 00 03 07 00 03 03 03 47 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 0A 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 01 FF 00 1E 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 45 07 00 12 FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 0A 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 01 00 03 07 00 03 03 03 00 06 08 00 18 08 00 18 03 03 01 01 FF 00 1E 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 42 07 00 0A FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 45 07 00 1E 40 07 00 03 FF 00 03 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 41 07 00 1E 43 05 44 07 00 1E 47 05 47 07 00 1E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     184    192    Ljava/util/ConcurrentModificationException;
        //  184    192    184    192    Any
        //  200    202    3      8      Any
        //  32     39     39     40     Any
        //  33     39     39     40     Ljava/lang/AssertionError;
        //  32     39     39     40     Ljava/lang/NegativeArraySizeException;
        //  32     39     39     40     Any
        //  32     39     32     33     Any
        //  90     97     97     98     Any
        //  90     97     97     98     Any
        //  90     97     97     98     Ljava/util/ConcurrentModificationException;
        //  91     97     97     98     Ljava/lang/ArithmeticException;
        //  91     97     90     91     Any
        //  104    111    111    112    Any
        //  105    111    111    112    Any
        //  104    111    104    105    Ljava/lang/RuntimeException;
        //  104    111    3      8      Any
        //  105    111    3      8      Any
        //  159    166    166    167    Any
        //  160    166    166    167    Ljava/lang/NullPointerException;
        //  160    166    3      8      Ljava/lang/IllegalArgumentException;
        //  160    166    159    160    Ljava/util/ConcurrentModificationException;
        //  160    166    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:624)
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
    
    public f0W(final double n, final double n2, final int n3) {
        while (true) {
            int n4 = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n4 = 1832257749;
                    break Label_0014;
                }
                n4 = -2108234480;
            }
            switch (n4 ^ 0x1918ECEA) {
                case 1949230143: {
                    continue;
                }
                case -1689384454: {
                    while (true) {
                        int n5 = 0;
                        Label_0058: {
                            if (fc.1 != 0) {
                                n5 = 90428852;
                                break Label_0058;
                            }
                            n5 = 1224611712;
                        }
                        switch (n5 ^ 0x118A6919) {
                            case 350862509: {
                                continue;
                            }
                            case 1500806809: {
                                super(n, n2, n3);
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
        throw t;
    }
}
