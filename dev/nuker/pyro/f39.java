// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class f39 extends f2U
{
    public BlockPos c;
    public EnumFacing c;
    
    static {
        throw t;
    }
    
    public f39(final f2T f2T, final BlockPos c, final EnumFacing c2) {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = -481369930;
                    break Label_0014;
                }
                n = -1609936551;
            }
            switch (n ^ 0x1CFAE8E3) {
                case -4978603: {
                    continue;
                }
                case -1125074502: {
                    super(f2T);
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.0 != 0) {
                                n2 = -1025768568;
                                break Label_0061;
                            }
                            n2 = -1410355679;
                        }
                        switch (n2 ^ 0x9FE306F2) {
                            case -1555228971: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0107: {
                                        if (fc.0 != 0) {
                                            n3 = 966501106;
                                            break Label_0107;
                                        }
                                        n3 = -537489462;
                                    }
                                    switch (n3 ^ 0x21119636) {
                                        case -1876933087: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c;
                                            this.c = c2;
                                            return;
                                        }
                                        case 411710660: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1564411258: {
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
    
    public void c(final BlockPos blockPos) {
        fbS.40(this, 964927984, blockPos);
    }
    
    public BlockPos 0() {
        return fbS.7U(this, 1007290930);
    }
    
    public void c(final EnumFacing p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            85
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            77
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             -1009913919
        //    24: goto            29
        //    27: ldc             -398265344
        //    29: ldc             895388389
        //    31: ixor           
        //    32: lookupswitch {
        //          -585335067: 60
        //          -158112476: 27
        //          default: 66
        //        }
        //    60: aload_0        
        //    61: aload_1        
        //    62: putfield        dev/nuker/pyro/f39.c:Lnet/minecraft/util/EnumFacing;
        //    65: return         
        //    66: aconst_null    
        //    67: athrow         
        //    68: pop            
        //    69: goto            16
        //    72: pop            
        //    73: aconst_null    
        //    74: goto            68
        //    77: dup            
        //    78: ifnull          68
        //    81: checkcast       Ljava/lang/Throwable;
        //    84: athrow         
        //    85: dup            
        //    86: ifnull          72
        //    89: checkcast       Ljava/lang/Throwable;
        //    92: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 3C FD 00 03 07 00 03 07 00 2B 0A 41 01 1E 05 41 07 00 3C 43 05 44 07 00 3C 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     77     85     Any
        //  77     85     77     85     Any
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
    
    public EnumFacing c() {
        return fbS.7n(this, 91236386);
    }
}
