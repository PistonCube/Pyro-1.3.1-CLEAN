// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import java.util.function.Function;
import java.util.Map;
import java.util.PriorityQueue;

public class fb4 extends PriorityQueue
{
    public boolean c;
    public Map<Object, Double> c;
    public Function<Object, Double> c;
    
    @Override
    public boolean offer(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          163
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            155
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            147
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   dev/nuker/pyro/fb4.c:(Ljava/lang/Object;)D
        //    33: goto            37
        //    36: athrow         
        //    37: dstore_2       
        //    38: dload_2        
        //    39: getstatic       kotlin/jvm/internal/DoubleCompanionObject.INSTANCE:Lkotlin/jvm/internal/DoubleCompanionObject;
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   kotlin/jvm/internal/DoubleCompanionObject.getPOSITIVE_INFINITY:()D
        //    49: goto            53
        //    52: athrow         
        //    53: dcmpg          
        //    54: ifne            122
        //    57: aload_0        
        //    58: getfield        dev/nuker/pyro/fb4.c:Ljava/util/Map;
        //    61: aload_1        
        //    62: getstatic       dev/nuker/pyro/fc.0:I
        //    65: ifeq            73
        //    68: ldc             -1638784915
        //    70: goto            75
        //    73: ldc             1081200042
        //    75: ldc             -1637726977
        //    77: ixor           
        //    78: lookupswitch {
        //          -569145003: 104
        //          3171474: 73
        //          default: 136
        //        }
        //   104: goto            108
        //   107: athrow         
        //   108: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   113: goto            117
        //   116: athrow         
        //   117: pop            
        //   118: iconst_1       
        //   119: goto            135
        //   122: aload_0        
        //   123: aload_1        
        //   124: goto            128
        //   127: athrow         
        //   128: invokespecial   java/util/PriorityQueue.offer:(Ljava/lang/Object;)Z
        //   131: goto            135
        //   134: athrow         
        //   135: ireturn        
        //   136: aconst_null    
        //   137: athrow         
        //   138: pop            
        //   139: goto            24
        //   142: pop            
        //   143: aconst_null    
        //   144: goto            138
        //   147: dup            
        //   148: ifnull          138
        //   151: checkcast       Ljava/lang/Throwable;
        //   154: athrow         
        //   155: dup            
        //   156: ifnull          142
        //   159: checkcast       Ljava/lang/Throwable;
        //   162: athrow         
        //   163: aconst_null    
        //   164: athrow         
        //    StackMapTable: 00 1E 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FD 00 03 07 00 03 07 00 42 44 07 00 23 FF 00 00 00 02 07 00 03 07 00 42 00 02 07 00 03 07 00 42 45 07 00 23 40 03 FF 00 07 00 03 07 00 03 07 00 42 03 00 01 07 00 19 FF 00 00 00 03 07 00 03 07 00 42 03 00 02 03 07 00 28 45 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 02 03 03 FF 00 13 00 03 07 00 03 07 00 42 03 00 02 07 00 3A 07 00 42 FF 00 01 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 01 FF 00 1C 00 03 07 00 03 07 00 42 03 00 02 07 00 3A 07 00 42 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 02 07 00 3A 07 00 42 47 07 00 23 40 07 00 42 04 FF 00 04 00 00 00 01 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 02 07 00 03 07 00 42 45 07 00 23 40 01 FF 00 00 00 03 07 00 03 07 00 42 03 00 02 07 00 3A 07 00 42 FF 00 01 00 02 07 00 03 07 00 42 00 01 07 00 23 43 05 44 07 00 23 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     147    155    Ljava/lang/AssertionError;
        //  147    155    147    155    Any
        //  163    165    3      8      Ljava/lang/IllegalArgumentException;
        //  29     36     36     37     Any
        //  30     36     3      8      Any
        //  29     36     29     30     Any
        //  29     36     36     37     Any
        //  30     36     36     37     Ljava/lang/NullPointerException;
        //  45     52     52     53     Any
        //  46     52     45     46     Ljava/util/ConcurrentModificationException;
        //  46     52     3      8      Ljava/lang/NullPointerException;
        //  45     52     45     46     Ljava/lang/IndexOutOfBoundsException;
        //  46     52     3      8      Ljava/lang/RuntimeException;
        //  108    116    116    117    Any
        //  108    116    116    117    Any
        //  108    116    116    117    Ljava/lang/StringIndexOutOfBoundsException;
        //  108    116    3      8      Any
        //  108    116    116    117    Any
        //  128    134    134    135    Any
        //  128    134    3      8      Any
        //  128    134    3      8      Any
        //  128    134    134    135    Any
        //  128    134    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:577)
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
    
    public static void c(final fb4 fb4, final Map c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0084:
            while (true) {
                int n;
                Label_0030_Outer:Label_0067_Outer:
                do {
                    Label_0071: {
                        break Label_0071;
                        while (true) {
                            try {
                                o = null;
                                if (fc.c < 0) {
                                    continue Label_0084;
                                }
                                null;
                                Label_0060: {
                                    fb4.c = (Map<Object, Double>)c;
                                }
                                return;
                                // switch([Lcom.strobel.decompiler.ast.Label;@3d6cd1e7, n ^ 0x124F4F6E)
                                // iftrue(Label_0028:, fc.c >= 0)
                                while (true) {
                                    while (true) {
                                        n = -1083712019;
                                        continue Label_0030_Outer;
                                    }
                                    Label_0028:
                                    n = 1246875790;
                                    continue Label_0067_Outer;
                                }
                                continue;
                                Label_0065:
                                throw null;
                            }
                            catch (AssertionError assertionError) {
                                if (assertionError != null) {
                                    throw assertionError;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0084;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public int c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: nop            
        //     4: nop            
        //     5: nop            
        //     6: athrow         
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            54
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            46
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokespecial   java/util/PriorityQueue.size:()I
        //    32: goto            36
        //    35: athrow         
        //    36: ireturn        
        //    37: pop            
        //    38: goto            24
        //    41: pop            
        //    42: aconst_null    
        //    43: goto            37
        //    46: dup            
        //    47: ifnull          37
        //    50: checkcast       Ljava/lang/Throwable;
        //    53: athrow         
        //    54: dup            
        //    55: ifnull          41
        //    58: checkcast       Ljava/lang/Throwable;
        //    61: athrow         
        //    62: nop            
        //    63: athrow         
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 23 43 07 00 23 FC 00 00 07 00 03 FF 00 0B 00 00 00 01 07 00 23 FC 00 03 07 00 03 43 07 00 23 40 07 00 03 45 07 00 23 40 01 40 07 00 23 43 05 44 07 00 23 47 05 FF 00 07 00 00 00 01 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  8      20     46     54     Any
        //  46     54     46     54     Any
        //  28     35     35     36     Any
        //  29     35     28     29     Any
        //  29     35     28     29     Ljava/lang/AssertionError;
        //  28     35     35     36     Any
        //  29     35     28     29     Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:577)
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
    
    public fb4(@NotNull final fb4 fb4) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = -1007634215;
                    break Label_0013;
                }
                n = -44732742;
            }
            switch (n ^ 0x16B0BBC1) {
                case -717225192: {
                    continue;
                }
                case -337259141: {
                    final fb4 c = fb4;
                    while (true) {
                        int n2 = 0;
                        Label_0064: {
                            if (fc.c < 0) {
                                n2 = -718771680;
                                break Label_0064;
                            }
                            n2 = -220077070;
                        }
                        switch (n2 ^ 0x994EEF32) {
                            case 1281787154: {
                                continue;
                            }
                            case 1806634176: {
                                super(c);
                                while (true) {
                                    int n3 = 0;
                                    Label_0113: {
                                        if (fc.1 != 0) {
                                            n3 = 776777882;
                                            break Label_0113;
                                        }
                                        n3 = -303955080;
                                    }
                                    switch (n3 ^ 0x6F16E9A1) {
                                        case -353647393: {
                                            continue;
                                        }
                                        default: {
                                            this.c = new HashMap<Object, Double>();
                                            this.c = new HashMap<Object, Double>(fb4.c);
                                            return;
                                        }
                                        case 1096440123: {
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static void c(final fb4 p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: iload_1        
        //    18: putfield        dev/nuker/pyro/fb4.c:Z
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 23 FD 00 03 07 00 03 01 45 07 00 23 43 05 44 07 00 23 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  0      12     31     39     Any
        //  31     39     31     39     Ljava/lang/NegativeArraySizeException;
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
    
    public static Map c(final fb4 fb4) {
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
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return fb4.c;
                        }
                        catch (NumberFormatException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public double c(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          284
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            276
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            268
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fb4.c:Ljava/util/function/Function;
        //    28: dup            
        //    29: ifnonnull       99
        //    32: ldc             "\u2900\u1481\u8000\ub1c7\uc47c\ue71f\ub230\uec3d\udb5e\ue418\uadc2\u1e58\ueb05\uc7a4"
        //    34: goto            38
        //    37: athrow         
        //    38: invokestatic    invokestatic   !!! ERROR
        //    41: goto            45
        //    44: athrow         
        //    45: getstatic       dev/nuker/pyro/fc.1:I
        //    48: ifeq            56
        //    51: ldc             727744376
        //    53: goto            58
        //    56: ldc             -2113914959
        //    58: ldc             -119054978
        //    60: ixor           
        //    61: lookupswitch {
        //          -746118650: 56
        //          2061986511: 88
        //          default: 255
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    95: goto            99
        //    98: athrow         
        //    99: dup            
        //   100: ifnonnull       108
        //   103: ldc             -157770148
        //   105: goto            110
        //   108: ldc             -157770147
        //   110: ldc             1346351116
        //   112: ixor           
        //   113: tableswitch {
        //          1296981152: 136
        //          1296981153: 147
        //          default: 103
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   143: goto            147
        //   146: athrow         
        //   147: aload_1        
        //   148: goto            152
        //   151: athrow         
        //   152: invokeinterface java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
        //   157: goto            161
        //   160: athrow         
        //   161: dup            
        //   162: pop            
        //   163: checkcast       Ljava/lang/Number;
        //   166: goto            170
        //   169: athrow         
        //   170: invokevirtual   java/lang/Number.doubleValue:()D
        //   173: goto            177
        //   176: athrow         
        //   177: dstore_2       
        //   178: aload_0        
        //   179: getfield        dev/nuker/pyro/fb4.c:Ljava/util/Map;
        //   182: aload_1        
        //   183: dload_2        
        //   184: getstatic       dev/nuker/pyro/fc.1:I
        //   187: ifeq            195
        //   190: ldc             1706667495
        //   192: goto            197
        //   195: ldc             1287659868
        //   197: ldc             1949714585
        //   199: ixor           
        //   200: lookupswitch {
        //          -1468149386: 195
        //          294643070: 257
        //          default: 228
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   235: goto            239
        //   238: athrow         
        //   239: goto            243
        //   242: athrow         
        //   243: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   248: goto            252
        //   251: athrow         
        //   252: pop            
        //   253: dload_2        
        //   254: dreturn        
        //   255: aconst_null    
        //   256: athrow         
        //   257: aconst_null    
        //   258: athrow         
        //   259: pop            
        //   260: goto            24
        //   263: pop            
        //   264: aconst_null    
        //   265: goto            259
        //   268: dup            
        //   269: ifnull          259
        //   272: checkcast       Ljava/lang/Throwable;
        //   275: athrow         
        //   276: dup            
        //   277: ifnull          263
        //   280: checkcast       Ljava/lang/Throwable;
        //   283: athrow         
        //   284: aconst_null    
        //   285: athrow         
        //    StackMapTable: 00 31 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FD 00 03 07 00 03 07 00 42 4C 07 00 0F FF 00 00 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 45 07 00 23 FF 00 00 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 FF 00 0A 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 FF 00 01 00 02 07 00 03 07 00 42 00 03 07 00 91 07 00 A8 01 FF 00 1D 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 42 07 00 23 FF 00 00 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 45 07 00 23 40 07 00 91 43 07 00 91 44 07 00 91 FF 00 01 00 02 07 00 03 07 00 42 00 02 07 00 91 01 59 07 00 91 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 02 07 00 03 07 00 42 00 01 07 00 91 45 07 00 23 40 07 00 91 FF 00 03 00 00 00 01 07 00 23 FF 00 00 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 42 47 07 00 23 40 07 00 42 47 07 00 19 40 07 00 96 45 07 00 23 40 03 FF 00 11 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 03 FF 00 01 00 03 07 00 03 07 00 42 03 00 04 07 00 3A 07 00 42 03 01 FF 00 1E 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 03 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 03 45 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 07 00 9E 42 07 00 23 FF 00 00 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 07 00 9E 47 07 00 23 40 07 00 42 FF 00 02 00 02 07 00 03 07 00 42 00 02 07 00 91 07 00 A8 FF 00 01 00 03 07 00 03 07 00 42 03 00 03 07 00 3A 07 00 42 03 FF 00 01 00 02 07 00 03 07 00 42 00 01 07 00 19 43 05 44 07 00 19 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     268    276    Ljava/lang/NullPointerException;
        //  268    276    268    276    Ljava/util/ConcurrentModificationException;
        //  284    286    3      8      Any
        //  37     44     44     45     Any
        //  37     44     44     45     Ljava/lang/ClassCastException;
        //  37     44     37     38     Ljava/lang/AssertionError;
        //  38     44     3      8      Ljava/lang/NullPointerException;
        //  38     44     44     45     Any
        //  91     98     98     99     Any
        //  91     98     91     92     Any
        //  91     98     91     92     Any
        //  91     98     98     99     Ljava/lang/IndexOutOfBoundsException;
        //  92     98     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  140    146    146    147    Any
        //  140    146    146    147    Any
        //  140    146    146    147    Ljava/lang/NegativeArraySizeException;
        //  140    146    3      8      Any
        //  140    146    146    147    Any
        //  152    160    160    161    Any
        //  152    160    160    161    Any
        //  152    160    3      8      Ljava/lang/AssertionError;
        //  152    160    3      8      Any
        //  152    160    3      8      Any
        //  169    176    176    177    Any
        //  170    176    169    170    Ljava/lang/ArithmeticException;
        //  169    176    3      8      Ljava/lang/RuntimeException;
        //  169    176    169    170    Ljava/lang/RuntimeException;
        //  169    176    3      8      Any
        //  232    238    238    239    Any
        //  232    238    3      8      Ljava/lang/NumberFormatException;
        //  232    238    238    239    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  232    238    238    239    Any
        //  232    238    238    239    Ljava/lang/ArithmeticException;
        //  242    251    251    252    Any
        //  243    251    251    252    Ljava/lang/IllegalStateException;
        //  242    251    3      8      Ljava/lang/UnsupportedOperationException;
        //  243    251    242    243    Any
        //  243    251    251    252    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0147 (coming from #0146).
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
    
    public static boolean 0(final fb4 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/fb4.c:Z
        //    20: ireturn        
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
    
    public fb4(@NotNull final Function p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             -486197303
        //     8: goto            13
        //    11: ldc             680715131
        //    13: ldc             -2042485027
        //    15: ixor           
        //    16: lookupswitch {
        //          -1362049626: 44
        //          1699156244: 11
        //          default: 291
        //        }
        //    44: aload_1        
        //    45: pop            
        //    46: aload_0        
        //    47: new             Ldev/nuker/pyro/fb3;
        //    50: dup            
        //    51: getstatic       dev/nuker/pyro/fc.0:I
        //    54: ifeq            62
        //    57: ldc             -1488638719
        //    59: goto            64
        //    62: ldc             2043486194
        //    64: ldc             -580019247
        //    66: ixor           
        //    67: lookupswitch {
        //          351671192: 62
        //          2049488592: 289
        //          default: 92
        //        }
        //    92: invokespecial   dev/nuker/pyro/fb3.<init>:()V
        //    95: checkcast       Ljava/util/Comparator;
        //    98: invokespecial   java/util/PriorityQueue.<init>:(Ljava/util/Comparator;)V
        //   101: aload_0        
        //   102: new             Ljava/util/HashMap;
        //   105: dup            
        //   106: invokespecial   java/util/HashMap.<init>:()V
        //   109: checkcast       Ljava/util/Map;
        //   112: putfield        dev/nuker/pyro/fb4.c:Ljava/util/Map;
        //   115: aload_0        
        //   116: invokevirtual   dev/nuker/pyro/fb4.comparator:()Ljava/util/Comparator;
        //   119: dup            
        //   120: ifnonnull       136
        //   123: new             Lkotlin/TypeCastException;
        //   126: dup            
        //   127: ldc             "\u291e\u1486\u8005\ub3d5\uc63f\ue715\ub225\uec2a\ud966\ue603\uadc2\u1e0c\ueb02\uc5a2\u8ecb\u838e\u57a5\u7df2\ubd29\ucff0\u21f6\uc234\u60a9\u2d58\ud861\u3f7b\u7d66\u8344\u8004\u8327\u8e5c\ufb72\u7a22\u9a0f\u1429\ufb92\u493c\u8281\uca83\uf08d\ubc66\u41fd\ub305\ub343\u43cc\u8017\u7c27\uc4d1\u7d57\ue56c\uec27\u1696\ue4a7\u379a\u491f\ueb00\u0a59\u8c16\u19d4\u00fd\u7de5\u7288\ucd0a\ubb8a\u9573\u60ec\ue2e9\udac2\ua524\u2a65\u835f\u4f90\u8180\u140d\uac7d\u7a3f\u55e8\u16a4\u61ce\u1e25\u8281\u0533\uf206\u267f\u16a4\ub30c\u7cf9\u4165\u1a5c\u2b27\uc4c2\ub2ec\ue79c\u7644\u41dc"
        //   129: invokestatic    invokestatic   !!! ERROR
        //   132: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: checkcast       Ldev/nuker/pyro/fb3;
        //   139: aload_0        
        //   140: checkcast       Ldev/nuker/pyro/fb4;
        //   143: invokevirtual   dev/nuker/pyro/fb3.c:(Ldev/nuker/pyro/fb4;)V
        //   146: aload_0        
        //   147: aload_1        
        //   148: getstatic       dev/nuker/pyro/fc.0:I
        //   151: ifeq            159
        //   154: ldc             -739755581
        //   156: goto            161
        //   159: ldc             -1129977373
        //   161: ldc             -895122284
        //   163: ixor           
        //   164: lookupswitch {
        //          424525143: 159
        //          1979739511: 192
        //          default: 293
        //        }
        //   192: putfield        dev/nuker/pyro/fb4.c:Ljava/util/function/Function;
        //   195: getstatic       dev/nuker/pyro/fc.1:I
        //   198: ifeq            206
        //   201: ldc             -370544249
        //   203: goto            208
        //   206: ldc             -356929670
        //   208: ldc             40708834
        //   210: ixor           
        //   211: lookupswitch {
        //          -343614619: 287
        //          813122986: 206
        //          default: 236
        //        }
        //   236: aload_0        
        //   237: getstatic       dev/nuker/pyro/fc.c:I
        //   240: ifge            248
        //   243: ldc             1771271820
        //   245: goto            250
        //   248: ldc             -1457076774
        //   250: ldc             -539177276
        //   252: ixor           
        //   253: lookupswitch {
        //          -1236289464: 248
        //          1996098334: 280
        //          default: 285
        //        }
        //   280: iload_2        
        //   281: putfield        dev/nuker/pyro/fb4.c:Z
        //   284: return         
        //   285: aconst_null    
        //   286: athrow         
        //   287: aconst_null    
        //   288: athrow         
        //   289: aconst_null    
        //   290: athrow         
        //   291: aconst_null    
        //   292: athrow         
        //   293: aconst_null    
        //   294: athrow         
        //    StackMapTable: 00 15 0B 41 01 1E FF 00 11 00 03 06 07 00 91 01 00 03 06 08 00 2F 08 00 2F FF 00 01 00 03 06 07 00 91 01 00 04 06 08 00 2F 08 00 2F 01 FF 00 1B 00 03 06 07 00 91 01 00 03 06 08 00 2F 08 00 2F FF 00 2B 00 03 07 00 03 07 00 91 01 00 01 07 00 B5 FF 00 16 00 03 07 00 03 07 00 91 01 00 02 07 00 03 07 00 91 FF 00 01 00 03 07 00 03 07 00 91 01 00 03 07 00 03 07 00 91 01 FF 00 1E 00 03 07 00 03 07 00 91 01 00 02 07 00 03 07 00 91 0D 41 01 1B 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 91 01 00 02 07 00 03 01 5D 07 00 03 44 07 00 03 01 FF 00 01 00 03 06 07 00 91 01 00 03 06 08 00 2F 08 00 2F 01 FF 00 01 00 03 07 00 03 07 00 91 01 00 02 07 00 03 07 00 91
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Invalid BootstrapMethods attribute entry: 21 additional arguments required for method a.a, but only 0 specified.
        //     at com.strobel.assembler.ir.Error.invalidBootstrapMethodEntry(Error.java:244)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:280)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:261)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1134)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:128)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:626)
        //     at com.strobel.assembler.metadata.MethodReference.resolve(MethodReference.java:177)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2438)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    public int size() {
        return fbS.bs(this, 405192417);
    }
    
    public fb4(final Function function, boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        while (true) {
            int n2 = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n2 = 524171023;
                    break Label_0013;
                }
                n2 = -911785786;
            }
            switch (n2 ^ 0x5F55C54C) {
                case 1698218599: {
                    continue;
                }
                default: {
                    if ((n & 0x2) != 0x0) {
                        b = false;
                    }
                    while (true) {
                        int n3 = 0;
                        Label_0066: {
                            if (fc.c < 0) {
                                n3 = 1282660589;
                                break Label_0066;
                            }
                            n3 = 1693247449;
                        }
                        switch (n3 ^ 0xD0DF782) {
                            case 1429909316: {
                                continue;
                            }
                            default: {
                                final boolean b2 = b;
                                while (true) {
                                    int n4 = 0;
                                    Label_0111: {
                                        if (fc.c < 0) {
                                            n4 = -1834567870;
                                            break Label_0111;
                                        }
                                        n4 = -680705412;
                                    }
                                    switch (n4 ^ 0x7519CD5A) {
                                        case -406881768: {
                                            continue;
                                        }
                                        case -1569419482: {
                                            this(function, b2);
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
                            case 1098788719: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1080816195: {
                    throw null;
                }
            }
            break;
        }
    }
}
