// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import net.minecraft.world.chunk.Chunk;

public class faD implements Runnable
{
    @NotNull
    public Chunk c;
    public faG c;
    
    @Override
    public void run() {
        fbS.dU(this, 826898434);
    }
    
    static {
        throw t;
    }
    
    public faD(@NotNull final faG c, final Chunk c2) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.0 != 0) {
                    n = 812715021;
                    break Label_0015;
                }
                n = -1749540858;
            }
            switch (n ^ 0x723A5A38) {
                case -171208288: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0058: {
                            if (fc.1 != 0) {
                                n2 = -1294293832;
                                break Label_0058;
                            }
                            n2 = -66541874;
                        }
                        switch (n2 ^ 0xEE27DD91) {
                            case 1206335894: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0105: {
                                        if (fc.0 != 0) {
                                            n3 = -1663702799;
                                            break Label_0105;
                                        }
                                        n3 = 1159481787;
                                    }
                                    switch (n3 ^ 0x5A23F3B2) {
                                        case -187324948: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0153: {
                                                    if (fc.c < 0) {
                                                        n4 = -1245502971;
                                                        break Label_0153;
                                                    }
                                                    n4 = -1211274456;
                                                }
                                                switch (n4 ^ 0xEA1B849F) {
                                                    case 1608033946: {
                                                        continue;
                                                    }
                                                    case 1574367159: {
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0198: {
                                                                if (fc.0 != 0) {
                                                                    n5 = 1284220056;
                                                                    break Label_0198;
                                                                }
                                                                n5 = 906203559;
                                                            }
                                                            switch (n5 ^ 0x6FA3904A) {
                                                                case -106669577: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c = c2;
                                                                    return;
                                                                }
                                                                case 589837522: {
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
                                        case -956949693: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1560115497: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1112233525: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(@NotNull final Chunk chunk) {
        fbS.3D(this, 1154127009, chunk);
    }
    
    @NotNull
    public Chunk c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             427293236
        //    24: goto            29
        //    27: ldc             -1623202253
        //    29: ldc             424896014
        //    31: ixor           
        //    32: lookupswitch {
        //          -2039709635: 60
        //          2399290: 27
        //          default: 65
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/faD.c:Lnet/minecraft/world/chunk/Chunk;
        //    64: areturn        
        //    65: aconst_null    
        //    66: athrow         
        //    67: pop            
        //    68: goto            16
        //    71: pop            
        //    72: aconst_null    
        //    73: goto            67
        //    76: dup            
        //    77: ifnull          67
        //    80: checkcast       Ljava/lang/Throwable;
        //    83: athrow         
        //    84: dup            
        //    85: ifnull          71
        //    88: checkcast       Ljava/lang/Throwable;
        //    91: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 45 FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 45 43 05 44 07 00 45 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     76     84     Any
        //  76     84     76     84     Any
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
}
