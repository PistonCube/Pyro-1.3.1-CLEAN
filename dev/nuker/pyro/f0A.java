// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.JsonElement;

public class f0a extends f0l
{
    @NotNull
    @Override
    public JsonElement c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          185
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            177
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            169
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonPrimitive;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             1372617637
        //    36: goto            41
        //    39: ldc             -471155218
        //    41: ldc             -1229350701
        //    43: ixor           
        //    44: lookupswitch {
        //          -412490890: 158
        //          1256611071: 39
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            84
        //    79: ldc             1951595291
        //    81: goto            86
        //    84: ldc             -2098224718
        //    86: ldc             1942274691
        //    88: ixor           
        //    89: lookupswitch {
        //          -248814799: 116
        //          127285656: 84
        //          default: 156
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/f0a.5:()Ldev/nuker/pyro/fw;
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   134: goto            138
        //   137: athrow         
        //   138: checkcast       Ljava/lang/Boolean;
        //   141: goto            145
        //   144: athrow         
        //   145: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   148: goto            152
        //   151: athrow         
        //   152: checkcast       Lcom/google/gson/JsonElement;
        //   155: areturn        
        //   156: aconst_null    
        //   157: athrow         
        //   158: aconst_null    
        //   159: athrow         
        //   160: pop            
        //   161: goto            24
        //   164: pop            
        //   165: aconst_null    
        //   166: goto            160
        //   169: dup            
        //   170: ifnull          160
        //   173: checkcast       Ljava/lang/Throwable;
        //   176: athrow         
        //   177: dup            
        //   178: ifnull          164
        //   181: checkcast       Ljava/lang/Throwable;
        //   184: athrow         
        //   185: aconst_null    
        //   186: athrow         
        //    StackMapTable: 00 1D 43 07 00 38 04 FF 00 0B 00 00 00 01 07 00 1A FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 0B 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 42 07 00 1A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B 45 07 00 1A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 3A 45 07 00 12 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 30 45 07 00 1A 40 07 00 1C FF 00 03 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     169    177    Ljava/lang/NullPointerException;
        //  169    177    169    177    Any
        //  185    187    3      8      Ljava/lang/IllegalArgumentException;
        //  119    126    126    127    Any
        //  119    126    126    127    Ljava/util/NoSuchElementException;
        //  119    126    119    120    Any
        //  120    126    126    127    Any
        //  119    126    126    127    Any
        //  131    137    137    138    Any
        //  131    137    137    138    Any
        //  131    137    137    138    Any
        //  131    137    137    138    Any
        //  131    137    137    138    Ljava/util/NoSuchElementException;
        //  144    151    151    152    Any
        //  144    151    151    152    Any
        //  144    151    3      8      Ljava/lang/ArithmeticException;
        //  144    151    151    152    Any
        //  145    151    144    145    Ljava/lang/NegativeArraySizeException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
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
    
    public f0a(@NotNull final String s, @NotNull final String s2, @Nullable final String s3, final boolean b) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = -781041174;
                    break Label_0013;
                }
                n = -498860960;
            }
            switch (n ^ 0xBB3780F8) {
                case 1782956306: {
                    continue;
                }
                case 1500806296: {
                    while (true) {
                        int n2 = 0;
                        Label_0065: {
                            if (fc.c < 0) {
                                n2 = 1212002052;
                                break Label_0065;
                            }
                            n2 = -1954575223;
                        }
                        switch (n2 ^ 0x8CF4A1E5) {
                            case 1642696022: {
                                continue;
                            }
                            default: {
                                final Boolean value = b;
                                while (true) {
                                    int n3 = 0;
                                    Label_0114: {
                                        if (fc.1 != 0) {
                                            n3 = -673310149;
                                            break Label_0114;
                                        }
                                        n3 = 1312936041;
                                    }
                                    switch (n3 ^ 0x66D56605) {
                                        case -1713071080: {
                                            continue;
                                        }
                                        default: {
                                            super(s, s2, s3, value);
                                            return;
                                        }
                                        case -1324647362: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -993456415: {
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
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          114
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            106
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            98
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0B;
        //    27: dup            
        //    28: aload_0        
        //    29: getstatic       dev/nuker/pyro/fc.c:I
        //    32: ifge            40
        //    35: ldc             565966605
        //    37: goto            42
        //    40: ldc             1748803050
        //    42: ldc             -1598727404
        //    44: ixor           
        //    45: lookupswitch {
        //          -2129744871: 40
        //          -930494722: 72
        //          default: 87
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/f0B.<init>:(Ldev/nuker/pyro/f0a;)V
        //    79: goto            83
        //    82: athrow         
        //    83: checkcast       Ldev/nuker/pyro/f0V;
        //    86: areturn        
        //    87: aconst_null    
        //    88: athrow         
        //    89: pop            
        //    90: goto            24
        //    93: pop            
        //    94: aconst_null    
        //    95: goto            89
        //    98: dup            
        //    99: ifnull          89
        //   102: checkcast       Ljava/lang/Throwable;
        //   105: athrow         
        //   106: dup            
        //   107: ifnull          93
        //   110: checkcast       Ljava/lang/Throwable;
        //   113: athrow         
        //   114: aconst_null    
        //   115: athrow         
        //    StackMapTable: 00 11 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FC 00 03 07 00 03 FF 00 0F 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 42 07 00 1A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1A 40 07 00 58 FF 00 03 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     98     106    Ljava/lang/NullPointerException;
        //  98     106    98     106    Any
        //  114    116    3      8      Any
        //  75     82     82     83     Any
        //  75     82     75     76     Any
        //  76     82     3      8      Any
        //  76     82     75     76     Any
        //  76     82     75     76     Ljava/util/ConcurrentModificationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    @Override
    public void c(@NotNull final JsonElement jsonElement) {
        fbS.6Y(this, 1965031818, jsonElement);
    }
}
