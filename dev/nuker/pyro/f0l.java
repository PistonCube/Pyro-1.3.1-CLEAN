// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f0l extends f0n
{
    @NotNull
    public String c;
    
    public f0l(@NotNull final String s, @NotNull final String c, @Nullable final String s2, final Object o) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 945956826;
                    break Label_0017;
                }
                n = -1104754545;
            }
            switch (n ^ 0xAA71ED0E) {
                case 316069807: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0063: {
                            if (fc.0 != 0) {
                                n2 = -790512849;
                                break Label_0063;
                            }
                            n2 = 552954653;
                        }
                        switch (n2 ^ 0xFB62EF14) {
                            case 730027067: {
                                continue;
                            }
                            case -610827255: {
                                super(s, s2, o);
                                this.c = c;
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
                case -1844196652: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public String c() {
        return fbS.5d(this, 775076394);
    }
    
    public f0l(@NotNull final String s, @NotNull final String s2, final Object o) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.1 != 0) {
                    n = -746053226;
                    break Label_0017;
                }
                n = 561592679;
            }
            switch (n ^ 0x155F965C) {
                case -179101239: {
                    continue;
                }
                default: {
                    final String s3 = null;
                    while (true) {
                        int n2 = 0;
                        Label_0066: {
                            if (fc.1 != 0) {
                                n2 = 1273960125;
                                break Label_0066;
                            }
                            n2 = 156078464;
                        }
                        switch (n2 ^ 0x8961BDCD) {
                            case -1657353446: {
                                continue;
                            }
                            default: {
                                this(s, s2, s3, o);
                                return;
                            }
                            case -1030837392: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -958941238: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    public void c(@NotNull final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            41
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            33
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1        
        //    17: pop            
        //    18: aload_0        
        //    19: aload_1        
        //    20: putfield        dev/nuker/pyro/f0l.c:Ljava/lang/String;
        //    23: return         
        //    24: pop            
        //    25: goto            16
        //    28: pop            
        //    29: aconst_null    
        //    30: goto            24
        //    33: dup            
        //    34: ifnull          24
        //    37: checkcast       Ljava/lang/Throwable;
        //    40: athrow         
        //    41: dup            
        //    42: ifnull          28
        //    45: checkcast       Ljava/lang/Throwable;
        //    48: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 3C FD 00 03 07 00 03 07 00 1E 47 07 00 3C 43 05 44 07 00 3C 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     33     41     Any
        //  33     41     33     41     Ljava/lang/NumberFormatException;
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
