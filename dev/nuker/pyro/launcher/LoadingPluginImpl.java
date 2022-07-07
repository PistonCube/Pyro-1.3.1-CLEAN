// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.launch.MixinBootstrap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.JvmStatic;
import dev.nuker.pyro.dc;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import java.io.File;

public class LoadingPluginImpl
{
    @NotNull
    public static File mf;
    @NotNull
    public static List<String> mixins;
    public static LoadingPluginImpl INSTANCE;
    
    @JvmStatic
    @Nullable
    public static String getAccessTransformerClass() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0035:
            while (true) {
                do {
                    Label_0022: {
                        break Label_0022;
                        try {
                            o = null;
                            if (dc.1 >= 0) {
                                null;
                                goto Label_0027;
                            }
                            continue Label_0035;
                            return null;
                        }
                        catch (StringIndexOutOfBoundsException ex) {}
                    }
                    continue Label_0035;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        LoadingPluginImpl.INSTANCE = new LoadingPluginImpl();
    }
    
    @JvmStatic
    public static void init(@NotNull final List mixins, @NotNull final File mf) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.c:I
        //     4: ifeq            165
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            157
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0         /* mixins */
        //    17: pop            
        //    18: aload_1         /* mf */
        //    19: pop            
        //    20: getstatic       dev/nuker/pyro/dc.c:I
        //    23: ifne            36
        //    26: ldc2_w          1542615540
        //    29: l2i            
        //    30: ldc             -834306602
        //    32: ixor           
        //    33: goto            43
        //    36: ldc2_w          -296179397
        //    39: l2i            
        //    40: ldc             -829416924
        //    42: ixor           
        //    43: ldc2_w          315191300
        //    46: l2i            
        //    47: ldc             739441010
        //    49: ixor           
        //    50: ixor           
        //    51: lookupswitch {
        //          -1418951340: 36
        //          504576617: 76
        //          default: 144
        //        }
        //    76: aload_0         /* mixins */
        //    77: getstatic       dev/nuker/pyro/dc.1:I
        //    80: ifge            93
        //    83: ldc2_w          -619861335
        //    86: l2i            
        //    87: ldc             696071752
        //    89: ixor           
        //    90: goto            100
        //    93: ldc2_w          1702608203
        //    96: l2i            
        //    97: ldc             -1947967770
        //    99: ixor           
        //   100: ldc2_w          1540942431
        //   103: l2i            
        //   104: ldc             -2042838651
        //   106: ixor           
        //   107: ixor           
        //   108: lookupswitch {
        //          618584550: 93
        //          798275387: 146
        //          default: 136
        //        }
        //   136: putstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mixins:Ljava/util/List;
        //   139: aload_1         /* mf */
        //   140: putstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mf:Ljava/io/File;
        //   143: return         
        //   144: aconst_null    
        //   145: athrow         
        //   146: aconst_null    
        //   147: athrow         
        //   148: pop            
        //   149: goto            16
        //   152: pop            
        //   153: aconst_null    
        //   154: goto            148
        //   157: dup            
        //   158: ifnull          148
        //   161: checkcast       Ljava/lang/Throwable;
        //   164: athrow         
        //   165: dup            
        //   166: ifnull          152
        //   169: checkcast       Ljava/lang/Throwable;
        //   172: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 1C FD 00 03 07 00 44 07 00 46 13 46 01 20 50 07 00 44 FF 00 06 00 02 07 00 44 07 00 46 00 02 07 00 44 01 63 07 00 44 07 41 07 00 44 41 07 00 1C 43 05 44 07 00 1C 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      12     157    165    Any
        //  157    165    157    165    Ljava/lang/ClassCastException;
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
    
    @JvmStatic
    @Nullable
    public static String getModContainerClass() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0035:
            while (true) {
                do {
                    Label_0022: {
                        break Label_0022;
                        try {
                            o = null;
                            if (dc.0 != 0) {
                                null;
                                goto Label_0027;
                            }
                            continue Label_0035;
                            return null;
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                    continue Label_0035;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @JvmStatic
    @Nullable
    public static String getSetupClass() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0035:
            while (true) {
                do {
                    Label_0022: {
                        break Label_0022;
                        try {
                            o = null;
                            if (dc.c != 0) {
                                null;
                                goto Label_0027;
                            }
                            continue Label_0035;
                            return null;
                        }
                        catch (NullPointerException ex) {}
                    }
                    continue Label_0035;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void setMixins(@NotNull final List <set-?>) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0161:
            while (true) {
                do {
                    Label_0148: {
                        break Label_0148;
                        try {
                            o = null;
                            if (dc.c != 0) {
                                null;
                                goto Label_0153;
                            }
                            continue Label_0161;
                            // switch([Lcom.strobel.decompiler.ast.Label;@39aac2e1, n ^ (int)2077384626L ^ 0xF5DF6CC7)
                            // iftrue(Label_0034:, dc.1 >= 0)
                            // iftrue(Label_0093:, dc.c != 0)
                            Label_0100: {
                            Block_4_Outer:
                                while (true) {
                                    while (true) {
                                        final int n = (int)1273551377L ^ 0x6C00999D;
                                        continue Block_4_Outer;
                                        continue;
                                    }
                                    Label_0076: {
                                        final int n2 = (int)440211047L ^ 0x94D9D536;
                                    }
                                    break Label_0100;
                                    Label_0093:
                                    final int n2 = (int)(-2141830532L) ^ 0x9BAC746;
                                    break Label_0100;
                                    Label_0140:
                                    throw null;
                                    Label_0034:
                                    final int n = (int)1360945247L ^ 0x11359587;
                                    continue Block_4_Outer;
                                }
                                Label_0136: {
                                    LoadingPluginImpl.mixins = (List<String>)<set-?>;
                                }
                                return;
                                Label_0142:
                                throw null;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@2fd70eee, n2 ^ (int)-765463377L ^ 0xA76D06F3)
                        catch (NegativeArraySizeException ex) {}
                    }
                    continue Label_0161;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public List getMixins() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          81
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            73
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            65
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mixins:Ljava/util/List;
        //    27: dup            
        //    28: ifnonnull       55
        //    31: ldc             "\u5767\uaf5b\u5d41\ue060\u4928\ude89"
        //    33: goto            37
        //    36: athrow         
        //    37: invokestatic    invokestatic   !!! ERROR
        //    40: goto            44
        //    43: athrow         
        //    44: goto            48
        //    47: athrow         
        //    48: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    51: goto            55
        //    54: athrow         
        //    55: areturn        
        //    56: pop            
        //    57: goto            24
        //    60: pop            
        //    61: aconst_null    
        //    62: goto            56
        //    65: dup            
        //    66: ifnull          56
        //    69: checkcast       Ljava/lang/Throwable;
        //    72: athrow         
        //    73: dup            
        //    74: ifnull          60
        //    77: checkcast       Ljava/lang/Throwable;
        //    80: athrow         
        //    81: aconst_null    
        //    82: athrow         
        //    StackMapTable: 00 11 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FC 00 03 07 00 02 4B 07 00 1C FF 00 00 00 01 07 00 02 00 02 07 00 44 07 00 83 45 07 00 1C FF 00 00 00 01 07 00 02 00 02 07 00 44 07 00 83 42 07 00 1C FF 00 00 00 01 07 00 02 00 02 07 00 44 07 00 83 45 07 00 1C 40 07 00 44 40 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     65     73     Ljava/lang/UnsupportedOperationException;
        //  65     73     65     73     Ljava/lang/AssertionError;
        //  81     83     3      8      Any
        //  36     43     43     44     Any
        //  37     43     43     44     Ljava/lang/IndexOutOfBoundsException;
        //  37     43     36     37     Any
        //  37     43     43     44     Ljava/lang/NegativeArraySizeException;
        //  37     43     43     44     Ljava/lang/NumberFormatException;
        //  47     54     54     55     Any
        //  48     54     47     48     Any
        //  47     54     3      8      Any
        //  48     54     3      8      Ljava/util/NoSuchElementException;
        //  48     54     3      8      Ljava/lang/AssertionError;
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
    
    @JvmStatic
    @Nullable
    public static String[] getASMTransformerClass() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          78
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.c:I
        //    12: ifeq            70
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            62
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc2_w          -2073404632
        //    27: l2i            
        //    28: ldc             -2073404631
        //    30: ixor           
        //    31: anewarray       Ljava/lang/String;
        //    34: dup            
        //    35: ldc2_w          -1599921576
        //    38: l2i            
        //    39: ldc             -1599921576
        //    41: ixor           
        //    42: aconst_null    
        //    43: goto            47
        //    46: athrow         
        //    47: goto            51
        //    50: athrow         
        //    51: aastore        
        //    52: areturn        
        //    53: pop            
        //    54: goto            24
        //    57: pop            
        //    58: aconst_null    
        //    59: goto            53
        //    62: dup            
        //    63: ifnull          53
        //    66: checkcast       Ljava/lang/Throwable;
        //    69: athrow         
        //    70: dup            
        //    71: ifnull          57
        //    74: checkcast       Ljava/lang/Throwable;
        //    77: athrow         
        //    78: aconst_null    
        //    79: athrow         
        //    StackMapTable: 00 0D 43 07 00 1C 04 4B 07 00 1C 03 55 07 00 1C FF 00 00 00 00 00 04 07 00 8D 07 00 8D 01 05 42 07 00 1C FF 00 00 00 00 00 04 07 00 8D 07 00 8D 01 05 41 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      20     62     70     Any
        //  62     70     62     70     Ljava/lang/ClassCastException;
        //  78     80     3      8      Ljava/lang/NullPointerException;
        //  47     50     50     51     Any
        //  47     50     50     51     Ljava/lang/AssertionError;
        //  47     50     3      8      Any
        //  47     50     3      8      Any
        //  47     50     3      8      Any
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
    
    @NotNull
    public File getMf() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          139
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            131
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            123
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/dc.c:I
        //    27: ifne            40
        //    30: ldc2_w          1843759982
        //    33: l2i            
        //    34: ldc             -1554723612
        //    36: ixor           
        //    37: goto            47
        //    40: ldc2_w          -1718485474
        //    43: l2i            
        //    44: ldc             -659545263
        //    46: ixor           
        //    47: ldc2_w          -1872669473
        //    50: l2i            
        //    51: ldc             -671007742
        //    53: ixor           
        //    54: ixor           
        //    55: lookupswitch {
        //          -2033111209: 112
        //          865209630: 40
        //          default: 80
        //        }
        //    80: getstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mf:Ljava/io/File;
        //    83: dup            
        //    84: ifnonnull       111
        //    87: ldc             "\u5767\uaf54"
        //    89: goto            93
        //    92: athrow         
        //    93: invokestatic    invokestatic   !!! ERROR
        //    96: goto            100
        //    99: athrow         
        //   100: goto            104
        //   103: athrow         
        //   104: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   107: goto            111
        //   110: athrow         
        //   111: areturn        
        //   112: aconst_null    
        //   113: athrow         
        //   114: pop            
        //   115: goto            24
        //   118: pop            
        //   119: aconst_null    
        //   120: goto            114
        //   123: dup            
        //   124: ifnull          114
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: dup            
        //   132: ifnull          118
        //   135: checkcast       Ljava/lang/Throwable;
        //   138: athrow         
        //   139: aconst_null    
        //   140: athrow         
        //    StackMapTable: 00 15 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FC 00 03 07 00 02 0F 46 01 20 4B 07 00 1E FF 00 00 00 01 07 00 02 00 02 07 00 46 07 00 83 45 07 00 1C FF 00 00 00 01 07 00 02 00 02 07 00 46 07 00 83 42 07 00 4B FF 00 00 00 01 07 00 02 00 02 07 00 46 07 00 83 45 07 00 1C 40 07 00 46 00 41 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     123    131    Ljava/lang/AssertionError;
        //  123    131    123    131    Ljava/util/ConcurrentModificationException;
        //  139    141    3      8      Any
        //  92     99     99     100    Any
        //  92     99     99     100    Ljava/lang/StringIndexOutOfBoundsException;
        //  93     99     3      8      Any
        //  92     99     92     93     Ljava/lang/UnsupportedOperationException;
        //  92     99     92     93     Ljava/lang/NumberFormatException;
        //  103    110    110    111    Any
        //  103    110    110    111    Ljava/lang/NumberFormatException;
        //  104    110    103    104    Ljava/lang/ArithmeticException;
        //  104    110    110    111    Ljava/lang/NullPointerException;
        //  104    110    110    111    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0111 (coming from #0110).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
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
    
    public void setMf(@NotNull final File <set-?>) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.1:I
        //     4: iflt            40
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            32
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1         /* <set-?> */
        //    17: pop            
        //    18: aload_1         /* <set-?> */
        //    19: putstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mf:Ljava/io/File;
        //    22: return         
        //    23: pop            
        //    24: goto            16
        //    27: pop            
        //    28: aconst_null    
        //    29: goto            23
        //    32: dup            
        //    33: ifnull          23
        //    36: checkcast       Ljava/lang/Throwable;
        //    39: athrow         
        //    40: dup            
        //    41: ifnull          27
        //    44: checkcast       Ljava/lang/Throwable;
        //    47: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 1C FD 00 03 07 00 02 07 00 46 46 07 00 1C 43 05 44 07 00 1C 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     32     40     Any
        //  32     40     32     40     Ljava/lang/ArithmeticException;
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
    
    @JvmStatic
    public static void injectData(@Nullable final Map data) {
        MixinBootstrap.init();
        System.out.println("Initialized Mixin Bootstrap");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
        System.out.println("Loading Pyro Mixin Config");
        Mixins.addConfiguration("mixins.pyroclient.json");
        System.out.println("Binscure won't save your terrible security solution! - Crystallinqq");
    }
}
