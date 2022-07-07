// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.util.EnumHand;

public class f3k extends f2U
{
    @NotNull
    public EnumHand c;
    
    public f3k(@NotNull final EnumHand c) {
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.1 != 0) {
                    n = -681640600;
                    break Label_0019;
                }
                n = -2007165503;
            }
            switch (n ^ 0xC55C66F7) {
                case 302160799: {
                    continue;
                }
                case 1291940662: {
                    this.c = c;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(@NotNull final EnumHand c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0085:
            while (true) {
                do {
                    Label_0072: {
                        break Label_0072;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0077;
                            }
                            continue Label_0085;
                            // switch([Lcom.strobel.decompiler.ast.Label;@2c7a8fd6, n ^ 0xFE529BD4)
                            // iftrue(Label_0029:, fc.0 == 0)
                        Label_0031_Outer:
                            while (true) {
                                int n = -1581412535;
                                while (true) {
                                    break Label_0031;
                                    Label_0060: {
                                        this.c = c;
                                    }
                                    return;
                                    Label_0029:
                                    n = 213766988;
                                    continue;
                                }
                                continue Label_0031_Outer;
                            }
                            Label_0066: {
                                throw null;
                            }
                        }
                        catch (NumberFormatException ex) {}
                    }
                    continue Label_0085;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public EnumHand c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/f3k.c:Lnet/minecraft/util/EnumHand;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 23 FC 00 03 07 00 03 44 07 00 23 43 05 44 07 00 23 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
}
