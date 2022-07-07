// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;
import java.util.Map;

public class f16
{
    @NotNull
    public Map<String, Object> c;
    
    static {
        throw t;
    }
    
    public void c(@Nullable final ITextComponent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          356
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            348
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            340
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    31: goto            35
        //    34: athrow         
        //    35: getstatic       dev/nuker/pyro/fc.c:I
        //    38: ifge            46
        //    41: ldc             1170636445
        //    43: goto            48
        //    46: ldc             -852436050
        //    48: ldc             -344488109
        //    50: ixor           
        //    51: lookupswitch {
        //          -1364067890: 46
        //          642211069: 76
        //          default: 323
        //        }
        //    76: getfield        net/minecraft/client/Minecraft.field_71456_v:Lnet/minecraft/client/gui/GuiIngame;
        //    79: dup            
        //    80: pop            
        //    81: getstatic       dev/nuker/pyro/fc.c:I
        //    84: ifge            92
        //    87: ldc             -258191972
        //    89: goto            94
        //    92: ldc             1074133620
        //    94: ldc             -1796058085
        //    96: ixor           
        //    97: lookupswitch {
        //          -721965457: 124
        //          1684937095: 92
        //          default: 321
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokevirtual   net/minecraft/client/gui/GuiIngame.func_146158_b:()Lnet/minecraft/client/gui/GuiNewChat;
        //   131: goto            135
        //   134: athrow         
        //   135: new             Lnet/minecraft/util/text/TextComponentString;
        //   138: dup            
        //   139: ldc             ""
        //   141: goto            145
        //   144: athrow         
        //   145: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
        //   148: goto            152
        //   151: athrow         
        //   152: getstatic       dev/nuker/pyro/fc.c:I
        //   155: ifge            163
        //   158: ldc             1097402734
        //   160: goto            165
        //   163: ldc             -64206777
        //   165: ldc             -1259421244
        //   167: ixor           
        //   168: lookupswitch {
        //          -175650646: 325
        //          965736923: 163
        //          default: 196
        //        }
        //   196: getstatic       dev/nuker/pyro/Pyro.prefix:Lnet/minecraft/util/text/ITextComponent;
        //   199: getstatic       dev/nuker/pyro/fc.1:I
        //   202: ifeq            210
        //   205: ldc             -186410571
        //   207: goto            212
        //   210: ldc             1253590968
        //   212: ldc             -1468672786
        //   214: ixor           
        //   215: lookupswitch {
        //          239220997: 210
        //          1553354075: 327
        //          default: 240
        //        }
        //   240: goto            244
        //   243: athrow         
        //   244: invokevirtual   net/minecraft/util/text/TextComponentString.func_150257_a:(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/util/text/ITextComponent;
        //   247: goto            251
        //   250: athrow         
        //   251: aload_1        
        //   252: getstatic       dev/nuker/pyro/fc.c:I
        //   255: ifge            263
        //   258: ldc             1850873568
        //   260: goto            265
        //   263: ldc             -45983634
        //   265: ldc             390787641
        //   267: ixor           
        //   268: lookupswitch {
        //          -368530857: 296
        //          2031674585: 263
        //          default: 329
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokeinterface net/minecraft/util/text/ITextComponent.func_150257_a:(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/util/text/ITextComponent;
        //   305: goto            309
        //   308: athrow         
        //   309: goto            313
        //   312: athrow         
        //   313: invokevirtual   net/minecraft/client/gui/GuiNewChat.func_146227_a:(Lnet/minecraft/util/text/ITextComponent;)V
        //   316: goto            320
        //   319: athrow         
        //   320: return         
        //   321: aconst_null    
        //   322: athrow         
        //   323: aconst_null    
        //   324: athrow         
        //   325: aconst_null    
        //   326: athrow         
        //   327: aconst_null    
        //   328: athrow         
        //   329: aconst_null    
        //   330: athrow         
        //   331: pop            
        //   332: goto            24
        //   335: pop            
        //   336: aconst_null    
        //   337: goto            331
        //   340: dup            
        //   341: ifnull          331
        //   344: checkcast       Ljava/lang/Throwable;
        //   347: athrow         
        //   348: dup            
        //   349: ifnull          335
        //   352: checkcast       Ljava/lang/Throwable;
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //    StackMapTable: 00 35 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 03 07 00 5A FF 00 02 00 00 00 01 07 00 25 FD 00 00 07 00 03 07 00 5A 45 07 00 25 40 07 00 27 4A 07 00 27 FF 00 01 00 02 07 00 03 07 00 5A 00 02 07 00 27 01 5B 07 00 27 4F 07 00 39 FF 00 01 00 02 07 00 03 07 00 5A 00 02 07 00 39 01 5D 07 00 39 42 07 00 25 40 07 00 39 45 07 00 25 40 07 00 5D 48 07 00 17 FF 00 00 00 02 07 00 03 07 00 5A 00 04 07 00 5D 08 00 87 08 00 87 07 00 62 45 07 00 25 FF 00 00 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 3F FF 00 0A 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 3F FF 00 01 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 3F 01 FF 00 1E 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 3F FF 00 0D 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 3F 07 00 5A FF 00 01 00 02 07 00 03 07 00 5A 00 04 07 00 5D 07 00 3F 07 00 5A 01 FF 00 1B 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 3F 07 00 5A 42 07 00 25 FF 00 00 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 3F 07 00 5A 45 07 00 25 FF 00 00 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 5A FF 00 0B 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 5A 07 00 5A FF 00 01 00 02 07 00 03 07 00 5A 00 04 07 00 5D 07 00 5A 07 00 5A 01 FF 00 1E 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 5A 07 00 5A 42 07 00 1D FF 00 00 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 5A 07 00 5A 47 07 00 25 FF 00 00 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 5A 42 07 00 25 FF 00 00 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 5A 45 07 00 25 00 40 07 00 39 41 07 00 27 FF 00 01 00 02 07 00 03 07 00 5A 00 02 07 00 5D 07 00 3F FF 00 01 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 3F 07 00 5A FF 00 01 00 02 07 00 03 07 00 5A 00 03 07 00 5D 07 00 5A 07 00 5A 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     340    348    Any
        //  340    348    340    348    Any
        //  356    358    3      8      Any
        //  28     34     34     35     Any
        //  28     34     3      8      Any
        //  28     34     3      8      Ljava/lang/NegativeArraySizeException;
        //  28     34     34     35     Any
        //  28     34     34     35     Any
        //  127    134    134    135    Any
        //  127    134    134    135    Any
        //  128    134    127    128    Ljava/lang/EnumConstantNotPresentException;
        //  127    134    127    128    Any
        //  128    134    134    135    Ljava/lang/NumberFormatException;
        //  144    151    151    152    Any
        //  145    151    3      8      Any
        //  144    151    151    152    Ljava/lang/AssertionError;
        //  144    151    144    145    Ljava/lang/IndexOutOfBoundsException;
        //  144    151    151    152    Ljava/util/ConcurrentModificationException;
        //  243    250    250    251    Any
        //  244    250    3      8      Any
        //  243    250    243    244    Any
        //  243    250    3      8      Ljava/lang/NullPointerException;
        //  244    250    3      8      Any
        //  299    308    308    309    Any
        //  299    308    3      8      Any
        //  299    308    308    309    Ljava/lang/NullPointerException;
        //  300    308    308    309    Any
        //  300    308    299    300    Ljava/lang/IllegalArgumentException;
        //  312    319    319    320    Any
        //  313    319    3      8      Any
        //  313    319    3      8      Any
        //  312    319    312    313    Any
        //  312    319    312    313    Ljava/util/ConcurrentModificationException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
    
    public void c(@NotNull final Map c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0130:
            while (true) {
                do {
                    Label_0117: {
                        break Label_0117;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0122;
                            }
                            continue Label_0130;
                            Label_0104: {
                                this.c = (Map<String, Object>)c;
                            }
                            return;
                            // iftrue(Label_0029:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@652cf6d2, n ^ 0x3AE6B049)
                        Label_0031_Outer:
                            while (true) {
                                Block_4: {
                                    break Block_4;
                                    Label_0072:
                                    final int n = -1919313870;
                                    break Label_0074;
                                    Label_0111:
                                    throw null;
                                    Label_0109:
                                    throw null;
                                }
                                int n2 = 1811431429;
                                while (true) {
                                    Label_0029:
                                    n2 = -1984647586;
                                    continue;
                                }
                                Label_0060:
                                final int n = 1051409652;
                                continue Label_0031_Outer;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@468f8dbf, n2 ^ 0x65DBA681)
                        // iftrue(Label_0072:, fc.0 == 0)
                        catch (AssertionError assertionError) {}
                    }
                    continue Label_0130;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f16() {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.1 != 0) {
                    n = -93183182;
                    break Label_0017;
                }
                n = 24908596;
            }
            switch (n ^ 0x615D87F5) {
                case -1691376441: {
                    continue;
                }
                case 1612813505: {
                    final LinkedHashMap<String, Object> c = new LinkedHashMap<String, Object>();
                    while (true) {
                        int n2 = 0;
                        Label_0078: {
                            if (fc.0 != 0) {
                                n2 = 2070497727;
                                break Label_0078;
                            }
                            n2 = -498714614;
                        }
                        switch (n2 ^ 0xAF7563C9) {
                            case -736351626: {
                                continue;
                            }
                            case 1295211459: {
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public Map c() {
        return fbS.1U(this, 1183731495);
    }
    
    @NotNull
    public f16 c(@NotNull final String s, @Nullable final Object o) {
        Object o2 = null;
        Label_0008: {
            break Label_0008;
        Label_0111:
            while (true) {
            Label_0094_Outer:
                do {
                    Label_0098: {
                        break Label_0098;
                    Label_0094:
                        while (true) {
                            try {
                                o2 = null;
                                if (fc.0 > 0) {
                                    continue Label_0111;
                                }
                                null;
                                return this;
                                // switch([Lcom.strobel.decompiler.ast.Label;@4b3cd3fd, n ^ 0x27872BE5)
                                while (true) {
                                    while (true) {
                                        Label_0035: {
                                            final int n = 1928304127;
                                        }
                                        continue Label_0094_Outer;
                                        break Label_0094;
                                        final int n = 166016456;
                                        continue Label_0094_Outer;
                                    }
                                    Label_0068: {
                                        final Map<String, Object> c = this.c;
                                    }
                                    goto Label_0080;
                                    Label_0092:
                                    throw null;
                                    continue;
                                }
                            }
                            // iftrue(Label_0035:, fc.1 == 0)
                            catch (NegativeArraySizeException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue Label_0094;
                            }
                            break;
                        }
                    }
                    continue Label_0111;
                } while (o2 == null);
                break;
            }
        }
        throw (Throwable)o2;
    }
}
