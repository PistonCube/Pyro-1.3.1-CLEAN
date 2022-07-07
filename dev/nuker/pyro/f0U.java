// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

public class f0u
{
    @Nullable
    public f0s c;
    public double c;
    public double 0;
    public static f0t c;
    
    public void c(final double n) {
        fbS.eZ(this, 1719183263, n);
    }
    
    public f0u(@Nullable final f0s c, final double c2, final double 0) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = 947810814;
                    break Label_0013;
                }
                n = 1747247656;
            }
            switch (n ^ 0xBAC47DED) {
                case -2101736429: {
                    continue;
                }
                case -757030971: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.c < 0) {
                                n2 = 2004083759;
                                break Label_0061;
                            }
                            n2 = -2078274341;
                        }
                        switch (n2 ^ 0xC6CBD18F) {
                            case -613031153: {
                                continue;
                            }
                            default: {
                                this.c = f0s.c;
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0118: {
                                        if (fc.1 != 0) {
                                            n3 = 1145219727;
                                            break Label_0118;
                                        }
                                        n3 = -432157977;
                                    }
                                    switch (n3 ^ 0x2622C8B5) {
                                        case 1771195526: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c2;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0168: {
                                                    if (fc.c < 0) {
                                                        n4 = 828169765;
                                                        break Label_0168;
                                                    }
                                                    n4 = 231419;
                                                }
                                                switch (n4 ^ 0xEC1855A9) {
                                                    case -582710388: {
                                                        continue;
                                                    }
                                                    case -333721006: {
                                                        this.0 = 0;
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
                                        case 1650483770: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1313327712: {
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
    
    public double c(final int n) {
        return fbS.5q(this, 1779364525, n);
    }
    
    public void 0(final double n) {
        fbS.f1(this, 1195564748, n);
    }
    
    public double 0() {
        return fbS.9O(this, 1106978195);
    }
    
    @JvmStatic
    @NotNull
    public static f0u c(final double n, final double n2, final int n3, final int n4) {
        Object o = null;
        Label_0008: {
            break Label_0008;
        Label_0107:
            while (true) {
            Block_6_Outer:
                do {
                    Label_0094: {
                        break Label_0094;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0099;
                            }
                            continue Label_0107;
                            // switch([Lcom.strobel.decompiler.ast.Label;@6e8f94b2, n5 ^ 0x31CA1094)
                            // iftrue(Label_0044:, fc.c >= 0)
                            f0u c2 = null;
                            Label_0080: {
                                f0t c = null;
                            Block_8:
                                while (true) {
                                    while (true) {
                                        int n5 = 131106272;
                                        continue Block_6_Outer;
                                        Label_0044: {
                                            n5 = 1475691011;
                                        }
                                        continue Block_6_Outer;
                                    }
                                    Label_0076: {
                                        break Label_0080;
                                    }
                                    break Block_8;
                                    c = f0u.c;
                                    continue;
                                }
                                try {
                                    c2 = c.c(n, n2, n3, n4);
                                }
                                catch (RuntimeException ex) {}
                            }
                            return c2;
                            Label_0088: {
                                throw null;
                            }
                        }
                        catch (IllegalArgumentException ex2) {}
                    }
                    continue Label_0107;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @Nullable
    public f0s c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.0:I
        //    19: ifeq            27
        //    22: ldc             1867233550
        //    24: goto            29
        //    27: ldc             -325864086
        //    29: ldc             214920694
        //    31: ixor           
        //    32: lookupswitch {
        //          -530786148: 60
        //          1669649656: 27
        //          default: 65
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/f0u.c:Ldev/nuker/pyro/f0s;
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
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 52 FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 52 43 05 44 07 00 52 47 05
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
    
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        while (true) {
            int n = 0;
            Label_0018: {
                if (fc.c < 0) {
                    n = 1424570200;
                    break Label_0018;
                }
                n = 1957986821;
            }
            switch (n ^ 0x6630F37B) {
                case 1367496958: {
                    continue;
                }
                default: {
                    f0u.c = new f0t(defaultConstructorMarker);
                }
                case 853132323: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public double 0(final int n) {
        return fbS.5q(this, 1779364524, n);
    }
    
    public void c(@Nullable final f0s c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    Label_0026: {
                        break Label_0026;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0031;
                            }
                            continue Label_0039;
                            this.c = c;
                            return;
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {}
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public double 1() {
        return fbS.9N(this, 674074965);
    }
}
