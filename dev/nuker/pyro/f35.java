// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import net.minecraft.inventory.ClickType;

public class f35 extends f2U
{
    public int c;
    public int 0;
    public int 1;
    @Nullable
    public ClickType c;
    
    static {
        throw t;
    }
    
    public void c(final int n) {
        fbS.6y(this, 2006132362, n);
    }
    
    public int 0() {
        return fbS.bp(this, 1079428222);
    }
    
    @Nullable
    public ClickType 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            83
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            75
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.c:I
        //    20: ifge            28
        //    23: ldc             -793677922
        //    25: goto            30
        //    28: ldc             -880022462
        //    30: ldc             -792521571
        //    32: ixor           
        //    33: lookupswitch {
        //          7502595: 28
        //          457767135: 60
        //          default: 64
        //        }
        //    60: getfield        dev/nuker/pyro/f35.c:Lnet/minecraft/inventory/ClickType;
        //    63: areturn        
        //    64: aconst_null    
        //    65: athrow         
        //    66: pop            
        //    67: goto            16
        //    70: pop            
        //    71: aconst_null    
        //    72: goto            66
        //    75: dup            
        //    76: ifnull          66
        //    79: checkcast       Ljava/lang/Throwable;
        //    82: athrow         
        //    83: dup            
        //    84: ifnull          70
        //    87: checkcast       Ljava/lang/Throwable;
        //    90: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 24 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 43 07 00 03 41 07 00 24 43 05 44 07 00 24 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  0      12     75     83     Any
        //  75     83     75     83     Ljava/lang/IndexOutOfBoundsException;
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
    
    public f35(final int c, final int 0, final int 2, @Nullable final ClickType c2) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = 245328964;
                    break Label_0013;
                }
                n = 846197170;
            }
            switch (n ^ 0xFA0DC1DD) {
                case 1972846164: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0063: {
                            if (fc.1 != 0) {
                                n2 = 1512936127;
                                break Label_0063;
                            }
                            n2 = 940291314;
                        }
                        switch (n2 ^ 0x366F484) {
                            case -386410337: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0108: {
                                        if (fc.0 != 0) {
                                            n3 = -42247520;
                                            break Label_0108;
                                        }
                                        n3 = -1818512123;
                                    }
                                    switch (n3 ^ 0xEEAF24CE) {
                                        case 332693102: {
                                            continue;
                                        }
                                        case 2100597195: {
                                            this.0 = 0;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0154: {
                                                    if (fc.0 != 0) {
                                                        n4 = -923889204;
                                                        break Label_0154;
                                                    }
                                                    n4 = -1224853212;
                                                }
                                                switch (n4 ^ 0x17ABB182) {
                                                    case 869531117: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.1 = 2;
                                                        this.c = c2;
                                                        return;
                                                    }
                                                    case -549117874: {
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
                            case 1498113595: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -191713895: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public int c() {
        return fbS.bO(this, 875550975);
    }
    
    public int 2() {
        return fbS.b7(this, 1545419329);
    }
}
