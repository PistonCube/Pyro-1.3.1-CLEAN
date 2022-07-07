// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.entity.MoverType;

public class f3e extends f2U
{
    public MoverType c;
    public double c;
    public double 0;
    public double 1;
    
    public double 0() {
        return fbS.9V(this, 1035676617);
    }
    
    public void c(final double n) {
        fbS.f5(this, 830232339, n);
    }
    
    public void 0(final double n) {
        fbS.eY(this, 68616595, n);
    }
    
    public MoverType 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            129
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            121
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             1268708181
        //    24: goto            29
        //    27: ldc             1766734241
        //    29: ldc             -2085809712
        //    31: ixor           
        //    32: lookupswitch {
        //          -1597670838: 27
        //          -936123771: 108
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getstatic       dev/nuker/pyro/fc.1:I
        //    64: ifeq            72
        //    67: ldc             558861523
        //    69: goto            74
        //    72: ldc             1211462672
        //    74: ldc             -211098178
        //    76: ixor           
        //    77: lookupswitch {
        //          -1260993692: 72
        //          -769300115: 110
        //          default: 104
        //        }
        //   104: getfield        dev/nuker/pyro/f3e.c:Lnet/minecraft/entity/MoverType;
        //   107: areturn        
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //   112: pop            
        //   113: goto            16
        //   116: pop            
        //   117: aconst_null    
        //   118: goto            112
        //   121: dup            
        //   122: ifnull          112
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: dup            
        //   130: ifnull          116
        //   133: checkcast       Ljava/lang/Throwable;
        //   136: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 26 FC 00 03 07 00 03 0A 41 01 1E 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 03 41 07 00 03 41 07 00 26 43 05 44 07 00 26 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     121    129    Any
        //  121    129    121    129    Ljava/lang/NumberFormatException;
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
        throw t;
    }
    
    public double c() {
        return fbS.9Z(this, 1852409819);
    }
    
    public void c(final MoverType c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0084:
            while (true) {
            Block_4_Outer:
                do {
                    Label_0071: {
                        break Label_0071;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0076;
                            }
                            continue Label_0084;
                            Label_0060: {
                                this.c = c;
                            }
                            return;
                            Label_0028:
                            int n = -802664998;
                            // switch([Lcom.strobel.decompiler.ast.Label;@4714a4ad, n ^ 0x7576242F)
                            while (true) {
                                while (true) {
                                    break Label_0030;
                                    Label_0065:
                                    throw null;
                                    n = -1550117145;
                                    continue Block_4_Outer;
                                }
                                continue;
                            }
                        }
                        // iftrue(Label_0028:, fc.0 == 0)
                        catch (UnsupportedOperationException ex) {}
                    }
                    continue Label_0084;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void 1(final double n) {
        fbS.f0(this, 1012262712, n);
    }
    
    public f3e(final f2T f2T, final MoverType c, final double c2, final double 0, final double 2) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.c < 0) {
                    n = 1794839642;
                    break Label_0015;
                }
                n = 1704014355;
            }
            switch (n ^ 0xCEC3614A) {
                case -1539803888: {
                    continue;
                }
                case -1420668071: {
                    super(f2T);
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0066: {
                            if (fc.1 != 0) {
                                n2 = 1078352177;
                                break Label_0066;
                            }
                            n2 = 925629496;
                        }
                        switch (n2 ^ 0x5261555F) {
                            case -560769229: {
                                continue;
                            }
                            default: {
                                this.c = c2;
                                while (true) {
                                    int n3 = 0;
                                    Label_0116: {
                                        if (fc.0 != 0) {
                                            n3 = 1495755051;
                                            break Label_0116;
                                        }
                                        n3 = 1258781106;
                                    }
                                    switch (n3 ^ 0x3BF58F5F) {
                                        case -458458238: {
                                            continue;
                                        }
                                        default: {
                                            this.0 = 0;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0160: {
                                                    if (fc.1 != 0) {
                                                        n4 = -1167360097;
                                                        break Label_0160;
                                                    }
                                                    n4 = 2079227400;
                                                }
                                                switch (n4 ^ 0x22959187) {
                                                    case -1728123368: {
                                                        continue;
                                                    }
                                                    case 1501294479: {
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0204: {
                                                                if (fc.c < 0) {
                                                                    n5 = 1901019386;
                                                                    break Label_0204;
                                                                }
                                                                n5 = -572069813;
                                                            }
                                                            switch (n5 ^ 0x5F8D82CC) {
                                                                case 282835503: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.1 = 2;
                                                                    return;
                                                                }
                                                                case 784515638: {
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
                                        case 1657988724: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 304548974: {
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
    
    public double 2() {
        return fbS.ac(this, 1091818316);
    }
}
