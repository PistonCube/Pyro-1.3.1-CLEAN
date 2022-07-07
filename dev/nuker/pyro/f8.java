// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f8
{
    @NotNull
    public String c;
    @Nullable
    public String 0;
    
    @Override
    public boolean equals(@Nullable final Object o) {
        return fbS.3d(this, 1933866946, o);
    }
    
    public static f8 c(final f8 p0, final String p1, final String p2, final int p3, final Object p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          208
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            200
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            192
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_3        
        //    25: iconst_1       
        //    26: iand           
        //    27: ifeq            35
        //    30: ldc             -1866088454
        //    32: goto            37
        //    35: ldc             -1866088451
        //    37: ldc             -614997679
        //    39: ixor           
        //    40: tableswitch {
        //          -1759199914: 64
        //          -1759199913: 69
        //          default: 30
        //        }
        //    64: aload_0        
        //    65: getfield        dev/nuker/pyro/f8.c:Ljava/lang/String;
        //    68: astore_1       
        //    69: iload_3        
        //    70: iconst_2       
        //    71: iand           
        //    72: ifeq            121
        //    75: aload_0        
        //    76: getfield        dev/nuker/pyro/f8.0:Ljava/lang/String;
        //    79: getstatic       dev/nuker/pyro/fc.1:I
        //    82: ifeq            90
        //    85: ldc             1749412700
        //    87: goto            92
        //    90: ldc             -221854216
        //    92: ldc             -1766191421
        //    94: ixor           
        //    95: lookupswitch {
        //          -1008214531: 90
        //          -16783969: 181
        //          default: 120
        //        }
        //   120: astore_2       
        //   121: getstatic       dev/nuker/pyro/fc.1:I
        //   124: ifeq            132
        //   127: ldc             -540014950
        //   129: goto            134
        //   132: ldc             -752830954
        //   134: ldc             336816465
        //   136: ixor           
        //   137: lookupswitch {
        //          -1076233675: 132
        //          -876384309: 179
        //          default: 164
        //        }
        //   164: aload_0        
        //   165: aload_1        
        //   166: aload_2        
        //   167: goto            171
        //   170: athrow         
        //   171: invokevirtual   dev/nuker/pyro/f8.c:(Ljava/lang/String;Ljava/lang/String;)Ldev/nuker/pyro/f8;
        //   174: goto            178
        //   177: athrow         
        //   178: areturn        
        //   179: aconst_null    
        //   180: athrow         
        //   181: aconst_null    
        //   182: athrow         
        //   183: pop            
        //   184: goto            24
        //   187: pop            
        //   188: aconst_null    
        //   189: goto            183
        //   192: dup            
        //   193: ifnull          183
        //   196: checkcast       Ljava/lang/Throwable;
        //   199: athrow         
        //   200: dup            
        //   201: ifnull          187
        //   204: checkcast       Ljava/lang/Throwable;
        //   207: athrow         
        //   208: aconst_null    
        //   209: athrow         
        //    StackMapTable: 00 1B 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 05 07 00 03 07 00 32 07 00 32 01 07 00 05 00 00 05 04 41 01 1A 04 54 07 00 32 FF 00 01 00 05 07 00 03 07 00 32 07 00 32 01 07 00 05 00 02 07 00 32 01 5B 07 00 32 00 0A 41 01 1D 45 07 00 1D FF 00 00 00 05 07 00 03 07 00 32 07 00 32 01 07 00 05 00 03 07 00 03 07 00 32 07 00 32 45 07 00 1D 40 07 00 03 00 41 07 00 32 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      20     192    200    Any
        //  192    200    192    200    Any
        //  208    210    3      8      Any
        //  170    177    177    178    Any
        //  171    177    3      8      Any
        //  171    177    170    171    Any
        //  171    177    170    171    Any
        //  170    177    170    171    Ljava/lang/NullPointerException;
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
    
    public void 0(@Nullable final String s) {
        fbS.9o(this, 1441214043, s);
    }
    
    public f8(@NotNull final String c, @Nullable final String 0) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = -493212830;
                    break Label_0013;
                }
                n = -1426910814;
            }
            switch (n ^ 0xA99A6A50) {
                case -1358658382: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0059: {
                            if (fc.1 != 0) {
                                n2 = -876976398;
                                break Label_0059;
                            }
                            n2 = -2059658003;
                        }
                        switch (n2 ^ 0x694B0E8F) {
                            case -1561237379: {
                                continue;
                            }
                            case -327740830: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0107: {
                                        if (fc.0 != 0) {
                                            n3 = -662504140;
                                            break Label_0107;
                                        }
                                        n3 = -380180833;
                                    }
                                    switch (n3 ^ 0xDAF42389) {
                                        case 1554931996: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0152: {
                                                    if (fc.0 != 0) {
                                                        n4 = 1512559746;
                                                        break Label_0152;
                                                    }
                                                    n4 = 159520640;
                                                }
                                                switch (n4 ^ 0x7A4F0D09) {
                                                    case 1172334593: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.0 = 0;
                                                        return;
                                                    }
                                                    case 543742347: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case 41344701: {
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
                case 1258307890: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public String 1() {
        return fbS.56(this, 320682900);
    }
    
    @NotNull
    public String 2() {
        return fbS.4X(this, 1689997988);
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          191
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            183
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            175
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             358382517
        //    32: goto            37
        //    35: ldc             524659273
        //    37: ldc             283398920
        //    39: ixor           
        //    40: lookupswitch {
        //          95955133: 35
        //          262273345: 68
        //          default: 162
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f8.c:Ljava/lang/String;
        //    72: dup            
        //    73: ifnull          90
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   java/lang/Object.hashCode:()I
        //    83: goto            87
        //    86: athrow         
        //    87: goto            92
        //    90: pop            
        //    91: iconst_0       
        //    92: bipush          31
        //    94: imul           
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            106
        //   101: ldc             -790458525
        //   103: goto            108
        //   106: ldc             891139856
        //   108: ldc             -786978020
        //   110: ixor           
        //   111: lookupswitch {
        //          32842879: 164
        //          1015709826: 106
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: getfield        dev/nuker/pyro/f8.0:Ljava/lang/String;
        //   140: dup            
        //   141: ifnull          158
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   java/lang/Object.hashCode:()I
        //   151: goto            155
        //   154: athrow         
        //   155: goto            160
        //   158: pop            
        //   159: iconst_0       
        //   160: iadd           
        //   161: ireturn        
        //   162: aconst_null    
        //   163: athrow         
        //   164: aconst_null    
        //   165: athrow         
        //   166: pop            
        //   167: goto            24
        //   170: pop            
        //   171: aconst_null    
        //   172: goto            166
        //   175: dup            
        //   176: ifnull          166
        //   179: checkcast       Ljava/lang/Throwable;
        //   182: athrow         
        //   183: dup            
        //   184: ifnull          170
        //   187: checkcast       Ljava/lang/Throwable;
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //    StackMapTable: 00 1D 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 03 0A 41 01 1E 4A 07 00 1D 40 07 00 32 45 07 00 1D 40 01 42 07 00 32 41 01 4D 01 FF 00 01 00 01 07 00 03 00 02 01 01 5B 01 4A 07 00 66 FF 00 00 00 01 07 00 03 00 02 01 07 00 32 45 07 00 1D FF 00 00 00 01 07 00 03 00 02 01 01 FF 00 02 00 01 07 00 03 00 02 01 07 00 32 FF 00 01 00 01 07 00 03 00 02 01 01 01 41 01 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     175    183    Ljava/util/ConcurrentModificationException;
        //  175    183    175    183    Any
        //  191    193    3      8      Ljava/util/ConcurrentModificationException;
        //  79     86     86     87     Any
        //  80     86     86     87     Any
        //  79     86     79     80     Any
        //  79     86     86     87     Any
        //  80     86     3      8      Any
        //  147    154    154    155    Any
        //  148    154    147    148    Ljava/lang/IllegalArgumentException;
        //  147    154    154    155    Any
        //  148    154    147    148    Ljava/util/ConcurrentModificationException;
        //  148    154    154    155    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0160 (coming from #0155).
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
    
    @NotNull
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          256
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            248
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            240
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/lang/StringBuilder.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: ldc             "\u10b4\u1481\ub982\ue3c2\ua8f9\ude90\ub26c\ud5a8\u8977\u8889\u9451\u1e11"
        //    41: goto            45
        //    44: athrow         
        //    45: invokestatic    invokestatic   !!! ERROR
        //    48: goto            52
        //    51: athrow         
        //    52: goto            56
        //    55: athrow         
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: goto            63
        //    62: athrow         
        //    63: getstatic       dev/nuker/pyro/fc.0:I
        //    66: ifeq            74
        //    69: ldc             493961166
        //    71: goto            76
        //    74: ldc             991671356
        //    76: ldc             1749431096
        //    78: ixor           
        //    79: lookupswitch {
        //          1398638340: 104
        //          1966542070: 74
        //          default: 229
        //        }
        //   104: aload_0        
        //   105: getfield        dev/nuker/pyro/f8.c:Ljava/lang/String;
        //   108: getstatic       dev/nuker/pyro/fc.0:I
        //   111: ifeq            119
        //   114: ldc             -243743792
        //   116: goto            121
        //   119: ldc             1004282112
        //   121: ldc             1901822397
        //   123: ixor           
        //   124: lookupswitch {
        //          -2145172883: 227
        //          978271776: 119
        //          default: 152
        //        }
        //   152: goto            156
        //   155: athrow         
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: goto            163
        //   162: athrow         
        //   163: ldc             "\u10de\u14d3\ub98a\ue3cb\ua8fe\ude95\ub237\ud5fb"
        //   165: goto            169
        //   168: athrow         
        //   169: invokestatic    invokestatic   !!! ERROR
        //   172: goto            176
        //   175: athrow         
        //   176: goto            180
        //   179: athrow         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: goto            187
        //   186: athrow         
        //   187: aload_0        
        //   188: getfield        dev/nuker/pyro/f8.0:Ljava/lang/String;
        //   191: goto            195
        //   194: athrow         
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: goto            202
        //   201: athrow         
        //   202: ldc             ")"
        //   204: goto            208
        //   207: athrow         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: goto            215
        //   214: athrow         
        //   215: goto            219
        //   218: athrow         
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: goto            226
        //   225: athrow         
        //   226: areturn        
        //   227: aconst_null    
        //   228: athrow         
        //   229: aconst_null    
        //   230: athrow         
        //   231: pop            
        //   232: goto            24
        //   235: pop            
        //   236: aconst_null    
        //   237: goto            231
        //   240: dup            
        //   241: ifnull          231
        //   244: checkcast       Ljava/lang/Throwable;
        //   247: athrow         
        //   248: dup            
        //   249: ifnull          235
        //   252: checkcast       Ljava/lang/Throwable;
        //   255: athrow         
        //   256: aconst_null    
        //   257: athrow         
        //    StackMapTable: 00 35 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 1D FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 1D 40 07 00 7D 44 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 42 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D 40 07 00 7D 4A 07 00 7D FF 00 01 00 01 07 00 03 00 02 07 00 7D 01 5B 07 00 7D FF 00 0E 00 01 07 00 03 00 02 07 00 7D 07 00 32 FF 00 01 00 01 07 00 03 00 03 07 00 7D 07 00 32 01 FF 00 1E 00 01 07 00 03 00 02 07 00 7D 07 00 32 42 07 00 71 FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D 40 07 00 7D FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 42 07 00 1D FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D 40 07 00 7D 46 07 00 66 FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D 40 07 00 7D 44 07 00 7B FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 45 07 00 1D 40 07 00 7D 42 07 00 1D 40 07 00 7D 45 07 00 1D 40 07 00 32 FF 00 00 00 01 07 00 03 00 02 07 00 7D 07 00 32 41 07 00 7D 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     240    248    Any
        //  240    248    240    248    Ljava/lang/UnsupportedOperationException;
        //  256    258    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  32     38     38     39     Any
        //  32     38     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  32     38     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  32     38     38     39     Ljava/lang/EnumConstantNotPresentException;
        //  32     38     3      8      Ljava/lang/IllegalArgumentException;
        //  44     51     51     52     Any
        //  45     51     51     52     Any
        //  44     51     44     45     Any
        //  45     51     44     45     Any
        //  44     51     44     45     Ljava/lang/IndexOutOfBoundsException;
        //  55     62     62     63     Any
        //  56     62     3      8      Any
        //  55     62     55     56     Any
        //  55     62     55     56     Ljava/lang/EnumConstantNotPresentException;
        //  56     62     55     56     Ljava/lang/IllegalStateException;
        //  155    162    162    163    Any
        //  156    162    162    163    Any
        //  156    162    155    156    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  156    162    3      8      Any
        //  155    162    162    163    Any
        //  169    175    175    176    Any
        //  169    175    3      8      Any
        //  169    175    175    176    Ljava/lang/ClassCastException;
        //  169    175    3      8      Ljava/lang/ArithmeticException;
        //  169    175    175    176    Ljava/lang/AssertionError;
        //  179    186    186    187    Any
        //  180    186    179    180    Any
        //  180    186    179    180    Ljava/lang/NumberFormatException;
        //  180    186    3      8      Any
        //  179    186    3      8      Any
        //  194    201    201    202    Any
        //  194    201    194    195    Ljava/lang/ArithmeticException;
        //  194    201    194    195    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  194    201    3      8      Any
        //  194    201    3      8      Any
        //  207    214    214    215    Any
        //  207    214    214    215    Ljava/lang/EnumConstantNotPresentException;
        //  207    214    207    208    Ljava/util/NoSuchElementException;
        //  208    214    214    215    Ljava/lang/IllegalStateException;
        //  207    214    214    215    Ljava/util/NoSuchElementException;
        //  218    225    225    226    Any
        //  219    225    3      8      Ljava/lang/AssertionError;
        //  218    225    218    219    Any
        //  219    225    225    226    Any
        //  219    225    225    226    Ljava/lang/NullPointerException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    public f8 c(@NotNull final String p0, @Nullable final String p1) {
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
        //    12: ifgt            107
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            99
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -328382240
        //    32: goto            37
        //    35: ldc             1318605006
        //    37: ldc             -1568698588
        //    39: ixor           
        //    40: lookupswitch {
        //          -1885836602: 35
        //          1309853636: 88
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: new             Ldev/nuker/pyro/f8;
        //    73: dup            
        //    74: aload_1        
        //    75: aload_2        
        //    76: goto            80
        //    79: athrow         
        //    80: invokespecial   dev/nuker/pyro/f8.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    83: goto            87
        //    86: athrow         
        //    87: areturn        
        //    88: aconst_null    
        //    89: athrow         
        //    90: pop            
        //    91: goto            24
        //    94: pop            
        //    95: aconst_null    
        //    96: goto            90
        //    99: dup            
        //   100: ifnull          90
        //   103: checkcast       Ljava/lang/Throwable;
        //   106: athrow         
        //   107: dup            
        //   108: ifnull          94
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: nop            
        //   116: athrow         
        //    StackMapTable: 00 12 FF 00 03 00 00 00 01 07 00 1D 43 07 00 1D FE 00 00 07 00 03 07 00 32 07 00 32 FF 00 0B 00 00 00 01 07 00 1D FE 00 03 07 00 03 07 00 32 07 00 32 0A 41 01 1E 4A 07 00 1D FF 00 00 00 03 07 00 03 07 00 32 07 00 32 00 04 08 00 46 08 00 46 07 00 32 07 00 32 45 07 00 1D 40 07 00 03 00 41 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 00 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     99     107    Any
        //  99     107    99     107    Ljava/lang/NullPointerException;
        //  79     86     86     87     Any
        //  79     86     86     87     Any
        //  79     86     79     80     Ljava/lang/IllegalStateException;
        //  79     86     79     80     Any
        //  79     86     79     80     Any
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
    
    @Nullable
    public String 0() {
        return fbS.5h(this, 1426987073);
    }
    
    @Nullable
    public String c() {
        return fbS.58(this, 1510384157);
    }
    
    static {
        throw t;
    }
    
    public void c(@NotNull final String s) {
        fbS.9g(this, 1474137394, s);
    }
}
