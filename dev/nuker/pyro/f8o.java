// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class f8O
{
    @NotNull
    public f7l c;
    @NotNull
    public String c;
    @NotNull
    public String 0;
    
    @NotNull
    public String 2() {
        return fbS.4W(this, 1247667913);
    }
    
    @NotNull
    public f7l 3() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return this.c;
                        }
                        catch (ClassCastException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(final boolean b) {
        fbS.4m(this, 1398675919, b);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public String c() {
        return fbS.52(this, 749564101);
    }
    
    public Minecraft 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          153
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            145
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            137
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             0
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             375029446
        //    34: goto            39
        //    37: ldc             -116059936
        //    39: ldc             -1545541885
        //    41: ixor           
        //    42: lookupswitch {
        //          -1246062139: 126
        //          -672464718: 37
        //          default: 68
        //        }
        //    68: istore_1       
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            80
        //    75: ldc             -2143988501
        //    77: goto            82
        //    80: ldc             1385538791
        //    82: ldc             152005411
        //    84: ixor           
        //    85: lookupswitch {
        //          -1992671288: 80
        //          1536872388: 112
        //          default: 124
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   119: goto            123
        //   122: athrow         
        //   123: areturn        
        //   124: aconst_null    
        //   125: athrow         
        //   126: aconst_null    
        //   127: athrow         
        //   128: pop            
        //   129: goto            24
        //   132: pop            
        //   133: aconst_null    
        //   134: goto            128
        //   137: dup            
        //   138: ifnull          128
        //   141: checkcast       Ljava/lang/Throwable;
        //   144: athrow         
        //   145: dup            
        //   146: ifnull          132
        //   149: checkcast       Ljava/lang/Throwable;
        //   152: athrow         
        //   153: aconst_null    
        //   154: athrow         
        //    StackMapTable: 00 15 FF 00 03 00 02 07 00 03 01 00 01 07 00 19 FA 00 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 4C 01 FF 00 01 00 01 07 00 03 00 02 01 01 5C 01 FC 00 0B 01 41 01 1D 42 07 00 19 00 45 07 00 21 40 07 00 47 00 FF 00 01 00 01 07 00 03 00 01 01 41 07 00 21 43 05 44 07 00 21 47 05 FF 00 07 00 02 07 00 03 01 00 01 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     137    145    Any
        //  137    145    137    145    Ljava/lang/IllegalArgumentException;
        //  153    155    3      8      Ljava/lang/UnsupportedOperationException;
        //  115    122    122    123    Any
        //  116    122    115    116    Ljava/lang/NegativeArraySizeException;
        //  116    122    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  115    122    122    123    Any
        //  115    122    115    116    Ljava/lang/StringIndexOutOfBoundsException;
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
    
    public f8O(@NotNull final f7l c, @NotNull final String c2, @NotNull final String 0) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.c < 0) {
                    n = -93691108;
                    break Label_0015;
                }
                n = 1290462524;
            }
            switch (n ^ 0x430A5025) {
                case -1184877767: {
                    continue;
                }
                case 266384665: {
                    while (true) {
                        int n2 = 0;
                        Label_0065: {
                            if (fc.1 != 0) {
                                n2 = -1427523433;
                                break Label_0065;
                            }
                            n2 = 459515299;
                        }
                        switch (n2 ^ 0xE9C849D7) {
                            case 618016797: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                this.c = c2;
                                while (true) {
                                    int n3 = 0;
                                    Label_0121: {
                                        if (fc.1 != 0) {
                                            n3 = -1447823218;
                                            break Label_0121;
                                        }
                                        n3 = -1432585272;
                                    }
                                    switch (n3 ^ 0x26968ECA) {
                                        case 976408431: {
                                            continue;
                                        }
                                        default: {
                                            this.0 = 0;
                                            return;
                                        }
                                        case -1893370300: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1126297920: {
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
    
    @NotNull
    public List 1() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
}
