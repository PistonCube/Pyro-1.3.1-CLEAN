// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f0X extends f0Z
{
    public double c;
    public double 0;
    public double 1;
    public double 2;
    
    public f0X(final double c, final double 0, final double n, final double n2, final double 2, final double 3, final int n3) {
        while (true) {
            int n4 = 0;
            Label_0014: {
                if (fc.0 != 0) {
                    n4 = -256698796;
                    break Label_0014;
                }
                n4 = -266399876;
            }
            switch (n4 ^ 0x622E8E6F) {
                case -1835165637: {
                    continue;
                }
                case -1842249453: {
                    super(n, n2, n3);
                    this.c = c;
                    while (true) {
                        int n5 = 0;
                        Label_0071: {
                            if (fc.c < 0) {
                                n5 = -1168994824;
                                break Label_0071;
                            }
                            n5 = 410767206;
                        }
                        switch (n5 ^ 0x9CBD409A) {
                            case -1962273676: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n6 = 0;
                                    Label_0115: {
                                        if (fc.c < 0) {
                                            n6 = 1933999264;
                                            break Label_0115;
                                        }
                                        n6 = -2097095435;
                                    }
                                    switch (n6 ^ 0x68CAD63) {
                                        case 1976226243: {
                                            continue;
                                        }
                                        case -2054393450: {
                                            this.0 = 0;
                                            this.1 = 2;
                                            this.2 = 3;
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
                            case 653249890: {
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
    
    public double 1() {
        return fbS.9R(this, 1719060004);
    }
    
    public void 0(final double n) {
        fbS.f2(this, 976259972, n);
    }
    
    public double 2() {
        return fbS.9Y(this, 65822276);
    }
    
    public void 2(final double n) {
        fbS.fc(this, 1774909549, n);
    }
    
    public double 0() {
        return fbS.a4(this, 1320155146);
    }
    
    public void 1(final double n) {
        fbS.f3(this, 1368593231, n);
    }
    
    public void c(final double n) {
        fbS.eZ(this, 1719183260, n);
    }
    
    @NotNull
    @Override
    public f0Z c(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          218
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            210
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            202
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0X;
        //    27: dup            
        //    28: aload_0        
        //    29: getfield        dev/nuker/pyro/f0X.c:D
        //    32: getstatic       dev/nuker/pyro/fc.c:I
        //    35: ifge            43
        //    38: ldc             1935465140
        //    40: goto            45
        //    43: ldc             -1599740734
        //    45: ldc             -959083521
        //    47: ixor           
        //    48: lookupswitch {
        //          -1249291957: 191
        //          852789703: 43
        //          default: 76
        //        }
        //    76: dload_1        
        //    77: dsub           
        //    78: aload_0        
        //    79: getfield        dev/nuker/pyro/f0X.0:D
        //    82: dload_3        
        //    83: dsub           
        //    84: aload_0        
        //    85: goto            89
        //    88: athrow         
        //    89: invokevirtual   dev/nuker/pyro/f0X.4:()D
        //    92: goto            96
        //    95: athrow         
        //    96: dload_1        
        //    97: dsub           
        //    98: getstatic       dev/nuker/pyro/fc.0:I
        //   101: ifeq            109
        //   104: ldc             1207961536
        //   106: goto            111
        //   109: ldc             -1026743086
        //   111: ldc             1521391363
        //   113: ixor           
        //   114: lookupswitch {
        //          313430211: 189
        //          2098465717: 109
        //          default: 140
        //        }
        //   140: aload_0        
        //   141: goto            145
        //   144: athrow         
        //   145: invokevirtual   dev/nuker/pyro/f0X.3:()D
        //   148: goto            152
        //   151: athrow         
        //   152: dload_3        
        //   153: dsub           
        //   154: aload_0        
        //   155: getfield        dev/nuker/pyro/f0X.1:D
        //   158: aload_0        
        //   159: getfield        dev/nuker/pyro/f0X.2:D
        //   162: aload_0        
        //   163: goto            167
        //   166: athrow         
        //   167: invokevirtual   dev/nuker/pyro/f0X.c:()I
        //   170: goto            174
        //   173: athrow         
        //   174: goto            178
        //   177: athrow         
        //   178: invokespecial   dev/nuker/pyro/f0X.<init>:(DDDDDDI)V
        //   181: goto            185
        //   184: athrow         
        //   185: checkcast       Ldev/nuker/pyro/f0Z;
        //   188: areturn        
        //   189: aconst_null    
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //   193: pop            
        //   194: goto            24
        //   197: pop            
        //   198: aconst_null    
        //   199: goto            193
        //   202: dup            
        //   203: ifnull          193
        //   206: checkcast       Ljava/lang/Throwable;
        //   209: athrow         
        //   210: dup            
        //   211: ifnull          197
        //   214: checkcast       Ljava/lang/Throwable;
        //   217: athrow         
        //   218: aconst_null    
        //   219: athrow         
        //    StackMapTable: 00 21 43 07 00 59 04 FF 00 0B 00 00 00 01 07 00 59 FE 00 03 07 00 03 03 03 FF 00 12 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 01 FF 00 1E 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 4B 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 03 45 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 0C 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 01 00 03 07 00 03 03 03 00 06 08 00 18 08 00 18 03 03 03 01 FF 00 1C 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 03 43 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 06 08 00 18 08 00 18 03 03 03 07 00 03 45 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 06 08 00 18 08 00 18 03 03 03 03 FF 00 0D 00 00 00 01 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 09 08 00 18 08 00 18 03 03 03 03 03 03 07 00 03 45 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 09 08 00 18 08 00 18 03 03 03 03 03 03 01 42 07 00 59 FF 00 00 00 03 07 00 03 03 03 00 09 08 00 18 08 00 18 03 03 03 03 03 03 01 45 07 00 59 40 07 00 03 FF 00 03 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 01 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 41 07 00 59 43 05 44 07 00 59 47 05 47 07 00 59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     202    210    Ljava/lang/NumberFormatException;
        //  202    210    202    210    Any
        //  218    220    3      8      Ljava/lang/UnsupportedOperationException;
        //  88     95     95     96     Any
        //  89     95     88     89     Ljava/lang/NumberFormatException;
        //  89     95     3      8      Any
        //  89     95     88     89     Any
        //  89     95     88     89     Ljava/lang/ClassCastException;
        //  144    151    151    152    Any
        //  145    151    3      8      Any
        //  145    151    144    145    Any
        //  144    151    151    152    Ljava/lang/NullPointerException;
        //  144    151    151    152    Any
        //  167    173    173    174    Any
        //  167    173    173    174    Any
        //  167    173    173    174    Any
        //  167    173    3      8      Any
        //  167    173    173    174    Any
        //  177    184    184    185    Any
        //  178    184    3      8      Any
        //  178    184    184    185    Any
        //  177    184    184    185    Ljava/lang/AssertionError;
        //  178    184    177    178    Any
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
    
    public double c() {
        return fbS.9X(this, 488027754);
    }
}
