// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f8Y extends f8W
{
    public double c;
    public double 0;
    public int c;
    
    public void c(final int n) {
        fbS.6C(this, 1713145957, n);
    }
    
    public double c(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          315
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            307
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            299
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/math/BigDecimal;
        //    27: dup            
        //    28: dload_1        
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            40
        //    35: ldc             967505256
        //    37: goto            42
        //    40: ldc             -1363856221
        //    42: ldc             -1700940478
        //    44: ixor           
        //    45: lookupswitch {
        //          -1556660182: 40
        //          875069921: 72
        //          default: 286
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   java/math/BigDecimal.<init>:(D)V
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.c:I
        //    86: ifge            94
        //    89: ldc             349813456
        //    91: goto            96
        //    94: ldc             -686064813
        //    96: ldc             610794806
        //    98: ixor           
        //    99: lookupswitch {
        //          429804683: 94
        //          817776614: 288
        //          default: 124
        //        }
        //   124: astore_3       
        //   125: aload_3        
        //   126: iconst_3       
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            138
        //   133: ldc             312821655
        //   135: goto            140
        //   138: ldc             987997070
        //   140: ldc             1675343342
        //   142: ixor           
        //   143: lookupswitch {
        //          1411025109: 138
        //          1904145017: 282
        //          default: 168
        //        }
        //   168: getstatic       java/math/RoundingMode.HALF_UP:Ljava/math/RoundingMode;
        //   171: getstatic       dev/nuker/pyro/fc.c:I
        //   174: ifge            182
        //   177: ldc             566024084
        //   179: goto            184
        //   182: ldc             173956106
        //   184: ldc             292724728
        //   186: ixor           
        //   187: lookupswitch {
        //          455918578: 212
        //          818825324: 182
        //          default: 280
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   java/math/BigDecimal.setScale:(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
        //   219: goto            223
        //   222: athrow         
        //   223: dup            
        //   224: pop            
        //   225: astore_3       
        //   226: aload_3        
        //   227: getstatic       dev/nuker/pyro/fc.0:I
        //   230: ifeq            238
        //   233: ldc             67256229
        //   235: goto            240
        //   238: ldc             -431854151
        //   240: ldc             -973252316
        //   242: ixor           
        //   243: lookupswitch {
        //          -1040226687: 284
        //          -222296954: 238
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   java/math/BigDecimal.doubleValue:()D
        //   275: goto            279
        //   278: athrow         
        //   279: dreturn        
        //   280: aconst_null    
        //   281: athrow         
        //   282: aconst_null    
        //   283: athrow         
        //   284: aconst_null    
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //   288: aconst_null    
        //   289: athrow         
        //   290: pop            
        //   291: goto            24
        //   294: pop            
        //   295: aconst_null    
        //   296: goto            290
        //   299: dup            
        //   300: ifnull          290
        //   303: checkcast       Ljava/lang/Throwable;
        //   306: athrow         
        //   307: dup            
        //   308: ifnull          294
        //   311: checkcast       Ljava/lang/Throwable;
        //   314: athrow         
        //   315: aconst_null    
        //   316: athrow         
        //    StackMapTable: 00 29 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 07 00 03 03 FF 00 0F 00 02 07 00 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 02 07 00 03 03 00 04 08 00 18 08 00 18 03 01 FF 00 1D 00 02 07 00 03 03 00 03 08 00 18 08 00 18 03 42 07 00 24 FF 00 00 00 02 07 00 03 03 00 03 08 00 18 08 00 18 03 45 07 00 24 40 07 00 26 4A 07 00 26 FF 00 01 00 02 07 00 03 03 00 02 07 00 26 01 5B 07 00 26 FF 00 0D 00 03 07 00 03 03 07 00 26 00 02 07 00 26 01 FF 00 01 00 03 07 00 03 03 07 00 26 00 03 07 00 26 01 01 FF 00 1B 00 03 07 00 03 03 07 00 26 00 02 07 00 26 01 FF 00 0D 00 03 07 00 03 03 07 00 26 00 03 07 00 26 01 07 00 37 FF 00 01 00 03 07 00 03 03 07 00 26 00 04 07 00 26 01 07 00 37 01 FF 00 1B 00 03 07 00 03 03 07 00 26 00 03 07 00 26 01 07 00 37 42 07 00 24 FF 00 00 00 03 07 00 03 03 07 00 26 00 03 07 00 26 01 07 00 37 45 07 00 24 40 07 00 26 4E 07 00 26 FF 00 01 00 03 07 00 03 03 07 00 26 00 02 07 00 26 01 5B 07 00 26 42 07 00 4B 40 07 00 26 45 07 00 24 40 03 FF 00 00 00 03 07 00 03 03 07 00 26 00 03 07 00 26 01 07 00 37 FF 00 01 00 03 07 00 03 03 07 00 26 00 02 07 00 26 01 41 07 00 26 FF 00 01 00 02 07 00 03 03 00 03 08 00 18 08 00 18 03 41 07 00 26 41 07 00 24 43 05 44 07 00 24 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     299    307    Any
        //  299    307    299    307    Ljava/lang/NegativeArraySizeException;
        //  315    317    3      8      Any
        //  75     82     82     83     Any
        //  75     82     3      8      Ljava/lang/NegativeArraySizeException;
        //  75     82     75     76     Any
        //  75     82     3      8      Ljava/lang/NegativeArraySizeException;
        //  76     82     75     76     Ljava/lang/IndexOutOfBoundsException;
        //  215    222    222    223    Any
        //  216    222    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  215    222    215    216    Any
        //  216    222    222    223    Any
        //  216    222    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  271    278    278    279    Any
        //  272    278    278    279    Ljava/util/NoSuchElementException;
        //  272    278    271    272    Ljava/lang/ClassCastException;
        //  271    278    3      8      Any
        //  272    278    271    272    Ljava/lang/StringIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:590)
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
    
    @Override
    public void 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          121
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            113
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            105
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    dev/nuker/pyro/f8W.1:()D
        //    32: goto            36
        //    35: athrow         
        //    36: putfield        dev/nuker/pyro/f8Y.c:D
        //    39: aload_0        
        //    40: iconst_4       
        //    41: putfield        dev/nuker/pyro/f8Y.c:I
        //    44: getstatic       dev/nuker/pyro/fc.0:I
        //    47: ifeq            55
        //    50: ldc             67254108
        //    52: goto            57
        //    55: ldc             -1750325235
        //    57: ldc             86799941
        //    59: ixor           
        //    60: lookupswitch {
        //          -1837081016: 88
        //          19808537: 55
        //          default: 94
        //        }
        //    88: aload_0        
        //    89: dconst_0       
        //    90: putfield        dev/nuker/pyro/f8Y.0:D
        //    93: return         
        //    94: aconst_null    
        //    95: athrow         
        //    96: pop            
        //    97: goto            24
        //   100: pop            
        //   101: aconst_null    
        //   102: goto            96
        //   105: dup            
        //   106: ifnull          96
        //   109: checkcast       Ljava/lang/Throwable;
        //   112: athrow         
        //   113: dup            
        //   114: ifnull          100
        //   117: checkcast       Ljava/lang/Throwable;
        //   120: athrow         
        //   121: aconst_null    
        //   122: athrow         
        //    StackMapTable: 00 11 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FC 00 03 07 00 03 43 07 00 14 40 07 00 03 45 07 00 24 FF 00 00 00 01 07 00 03 00 02 07 00 03 03 12 41 01 1E 05 41 07 00 50 43 05 44 07 00 50 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     105    113    Ljava/lang/ArithmeticException;
        //  105    113    105    113    Ljava/lang/ArithmeticException;
        //  121    123    3      8      Ljava/util/NoSuchElementException;
        //  28     35     35     36     Any
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/NegativeArraySizeException;
        //  29     35     3      8      Any
        //  29     35     35     36     Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:559)
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
    
    @Override
    public void c() {
        fbS.d9(this, 211311786);
    }
    
    public int c() {
        return fbS.bf(this, 480526729);
    }
    
    public f8Y() {
        final int c = 4;
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.1 != 0) {
                    n = -980683755;
                    break Label_0019;
                }
                n = 1808318355;
            }
            switch (n ^ 0xCC6AB436) {
                case 165756963: {
                    continue;
                }
                case -1482552411: {
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0065: {
                            if (fc.0 != 0) {
                                n2 = -1971767187;
                                break Label_0065;
                            }
                            n2 = 464582997;
                        }
                        switch (n2 ^ 0x8DF69D91) {
                            case 126854652: {
                                continue;
                            }
                            case -1773771580: {
                                this.c = f8W.1();
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
    
    @Override
    public void c(@NotNull final f3e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2948
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            2940
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2932
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -1951130117
        //    32: goto            37
        //    35: ldc             1474303617
        //    37: ldc             -113668833
        //    39: ixor           
        //    40: lookupswitch {
        //          -1361470562: 68
        //          1921880292: 35
        //          default: 2907
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: getstatic       dev/nuker/pyro/fc.c:I
        //    74: ifge            82
        //    77: ldc             100302589
        //    79: goto            84
        //    82: ldc             1040675262
        //    84: ldc             -1419154601
        //    86: ixor           
        //    87: lookupswitch {
        //          -1366092374: 2903
        //          1415240558: 82
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   dev/nuker/pyro/f3e.c:()Ldev/nuker/pyro/f2T;
        //   119: goto            123
        //   122: athrow         
        //   123: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   126: if_acmpne       144
        //   129: aload_1        
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   dev/nuker/pyro/f3e.0:()Z
        //   137: goto            141
        //   140: athrow         
        //   141: ifeq            145
        //   144: return         
        //   145: goto            149
        //   148: athrow         
        //   149: invokestatic    dev/nuker/pyro/fbl.7:()Z
        //   152: goto            156
        //   155: athrow         
        //   156: ifeq            215
        //   159: getstatic       dev/nuker/pyro/fc.0:I
        //   162: ifeq            170
        //   165: ldc             884604070
        //   167: goto            172
        //   170: ldc             1852051621
        //   172: ldc             1888578082
        //   174: ixor           
        //   175: lookupswitch {
        //          519404167: 200
        //          1143510660: 170
        //          default: 2917
        //        }
        //   200: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70143_R:F
        //   209: ldc             5.0
        //   211: fcmpl          
        //   212: ifle            243
        //   215: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   218: ldc             "\u2210\u1483\u8b1f\ub1cd\ucf7b\uec0d\ub225\ue72f"
        //   220: goto            224
        //   223: athrow         
        //   224: invokestatic    invokestatic   !!! ERROR
        //   227: goto            231
        //   230: athrow         
        //   231: goto            235
        //   234: athrow         
        //   235: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   238: goto            242
        //   241: athrow         
        //   242: return         
        //   243: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   246: getstatic       dev/nuker/pyro/fc.c:I
        //   249: ifge            257
        //   252: ldc             -825387091
        //   254: goto            259
        //   257: ldc             1285687102
        //   259: ldc             -1023850187
        //   261: ixor           
        //   262: lookupswitch {
        //          204791448: 2841
        //          1561499737: 257
        //          default: 288
        //        }
        //   288: getfield        dev/nuker/pyro/f82.c:Ldev/nuker/pyro/fw;
        //   291: getstatic       dev/nuker/pyro/fc.1:I
        //   294: ifeq            302
        //   297: ldc             1243008726
        //   299: goto            304
        //   302: ldc             919249762
        //   304: ldc             356356466
        //   306: ixor           
        //   307: lookupswitch {
        //          603402768: 332
        //          1596678052: 302
        //          default: 2845
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   339: goto            343
        //   342: athrow         
        //   343: dup            
        //   344: pop            
        //   345: checkcast       Ljava/lang/Boolean;
        //   348: getstatic       dev/nuker/pyro/fc.1:I
        //   351: ifeq            359
        //   354: ldc             -892820506
        //   356: goto            361
        //   359: ldc             -1921775472
        //   361: ldc             1379025694
        //   363: ixor           
        //   364: lookupswitch {
        //          -1728388872: 2883
        //          185660098: 359
        //          default: 392
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   399: goto            403
        //   402: athrow         
        //   403: ifeq            573
        //   406: getstatic       dev/nuker/pyro/fc.1:I
        //   409: ifeq            417
        //   412: ldc             -1321507281
        //   414: goto            419
        //   417: ldc             -1769206837
        //   419: ldc             1746026784
        //   421: ixor           
        //   422: lookupswitch {
        //          -651614449: 2869
        //          248364987: 417
        //          default: 448
        //        }
        //   448: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   451: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   454: getstatic       dev/nuker/pyro/fc.0:I
        //   457: ifeq            465
        //   460: ldc             -787943968
        //   462: goto            467
        //   465: ldc             -1046941173
        //   467: ldc             234347120
        //   469: ixor           
        //   470: lookupswitch {
        //          -941064248: 465
        //          -587253872: 2843
        //          default: 496
        //        }
        //   496: getfield        dev/nuker/pyro/f82.c:Ldev/nuker/pyro/f0d;
        //   499: goto            503
        //   502: athrow         
        //   503: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   506: goto            510
        //   509: athrow         
        //   510: checkcast       Ljava/lang/Number;
        //   513: goto            517
        //   516: athrow         
        //   517: invokevirtual   java/lang/Number.doubleValue:()D
        //   520: goto            524
        //   523: athrow         
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   dev/nuker/pyro/f82.0:(D)D
        //   531: goto            535
        //   534: athrow         
        //   535: fconst_0       
        //   536: f2d            
        //   537: dcmpl          
        //   538: ifle            546
        //   541: ldc             -1540446828
        //   543: goto            548
        //   546: ldc             -1540446827
        //   548: ldc             -1597170548
        //   550: ixor           
        //   551: tableswitch {
        //          164065840: 572
        //          164065841: 573
        //          default: 541
        //        }
        //   572: return         
        //   573: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7Y;
        //   576: getstatic       dev/nuker/pyro/fc.0:I
        //   579: ifeq            587
        //   582: ldc             -604653420
        //   584: goto            589
        //   587: ldc             769112224
        //   589: ldc             1087096582
        //   591: ixor           
        //   592: lookupswitch {
        //          -1690402926: 587
        //          1830584230: 620
        //          default: 2861
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokevirtual   dev/nuker/pyro/f7Y.1:()Ldev/nuker/pyro/f0a;
        //   627: goto            631
        //   630: athrow         
        //   631: getstatic       dev/nuker/pyro/fc.1:I
        //   634: ifeq            642
        //   637: ldc             -1611516223
        //   639: goto            644
        //   642: ldc             1155555771
        //   644: ldc             -701961255
        //   646: ixor           
        //   647: lookupswitch {
        //          1239080216: 2915
        //          2126941998: 642
        //          default: 672
        //        }
        //   672: goto            676
        //   675: athrow         
        //   676: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   679: goto            683
        //   682: athrow         
        //   683: checkcast       Ljava/lang/Boolean;
        //   686: goto            690
        //   689: athrow         
        //   690: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   693: goto            697
        //   696: athrow         
        //   697: ifeq            733
        //   700: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   703: ldc             "\u2210\u1483\u8b1f\ub1cd\ucf7b\uec0d\ub225\ue72f"
        //   705: goto            709
        //   708: athrow         
        //   709: invokestatic    invokestatic   !!! ERROR
        //   712: goto            716
        //   715: athrow         
        //   716: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   719: ldc_w           1.088
        //   722: goto            726
        //   725: athrow         
        //   726: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   729: goto            733
        //   732: athrow         
        //   733: getstatic       dev/nuker/pyro/fc.c:I
        //   736: ifge            745
        //   739: ldc_w           -184012675
        //   742: goto            748
        //   745: ldc_w           -1168052383
        //   748: ldc_w           -1674997100
        //   751: ixor           
        //   752: lookupswitch {
        //          642350581: 780
        //          1763812073: 745
        //          default: 2895
        //        }
        //   780: aload_0        
        //   781: getstatic       dev/nuker/pyro/fc.0:I
        //   784: ifeq            793
        //   787: ldc_w           -501146024
        //   790: goto            796
        //   793: ldc_w           50599839
        //   796: ldc_w           1518118558
        //   799: ixor           
        //   800: lookupswitch {
        //          -1201817402: 793
        //          1501081857: 828
        //          default: 2919
        //        }
        //   828: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   831: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   834: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   837: getstatic       dev/nuker/pyro/fc.0:I
        //   840: ifeq            849
        //   843: ldc_w           1181243423
        //   846: goto            852
        //   849: ldc_w           664252660
        //   852: ldc_w           -760569547
        //   855: ixor           
        //   856: lookupswitch {
        //          -1799161558: 2881
        //          1210248271: 849
        //          default: 884
        //        }
        //   884: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   887: getstatic       dev/nuker/pyro/fc.c:I
        //   890: ifge            899
        //   893: ldc_w           492206315
        //   896: goto            902
        //   899: ldc_w           1143006710
        //   902: ldc_w           2140596012
        //   905: ixor           
        //   906: lookupswitch {
        //          1001784026: 932
        //          1656790983: 899
        //          default: 2887
        //        }
        //   932: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   935: getstatic       dev/nuker/pyro/fc.0:I
        //   938: ifeq            947
        //   941: ldc_w           891848758
        //   944: goto            950
        //   947: ldc_w           -643655600
        //   950: ldc_w           436900425
        //   953: ixor           
        //   954: lookupswitch {
        //          -1221279269: 947
        //          790764159: 2853
        //          default: 980
        //        }
        //   980: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   983: d2i            
        //   984: i2d            
        //   985: dsub           
        //   986: goto            990
        //   989: athrow         
        //   990: invokespecial   dev/nuker/pyro/f8Y.c:(D)D
        //   993: goto            997
        //   996: athrow         
        //   997: aload_0        
        //   998: ldc2_w          0.138
        //  1001: getstatic       dev/nuker/pyro/fc.0:I
        //  1004: ifeq            1013
        //  1007: ldc_w           1881554620
        //  1010: goto            1016
        //  1013: ldc_w           2132611375
        //  1016: ldc_w           -770660341
        //  1019: ixor           
        //  1020: lookupswitch {
        //          -1573480777: 1013
        //          -1391609564: 1048
        //          default: 2901
        //        }
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokespecial   dev/nuker/pyro/f8Y.c:(D)D
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: dcmpg          
        //  1060: ifne            1306
        //  1063: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1066: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1069: dup            
        //  1070: getstatic       dev/nuker/pyro/fc.c:I
        //  1073: ifge            1082
        //  1076: ldc_w           -1380731628
        //  1079: goto            1085
        //  1082: ldc_w           1355781527
        //  1085: ldc_w           1884765135
        //  1088: ixor           
        //  1089: lookupswitch {
        //          -572223781: 1082
        //          546877016: 1116
        //          default: 2885
        //        }
        //  1116: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1119: ldc2_w          0.13
        //  1122: dsub           
        //  1123: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1126: aload_1        
        //  1127: dup            
        //  1128: getstatic       dev/nuker/pyro/fc.c:I
        //  1131: ifge            1140
        //  1134: ldc_w           -1524021953
        //  1137: goto            1143
        //  1140: ldc_w           -1822006948
        //  1143: ldc_w           -1347596731
        //  1146: ixor           
        //  1147: lookupswitch {
        //          176425850: 2837
        //          1192903712: 1140
        //          default: 1172
        //        }
        //  1172: goto            1176
        //  1175: athrow         
        //  1176: invokevirtual   dev/nuker/pyro/f3e.c:()D
        //  1179: goto            1183
        //  1182: athrow         
        //  1183: ldc2_w          0.13
        //  1186: dsub           
        //  1187: goto            1191
        //  1190: athrow         
        //  1191: invokevirtual   dev/nuker/pyro/f3e.c:(D)V
        //  1194: goto            1198
        //  1197: athrow         
        //  1198: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1201: getstatic       dev/nuker/pyro/fc.1:I
        //  1204: ifeq            1213
        //  1207: ldc_w           -1372042867
        //  1210: goto            1216
        //  1213: ldc_w           -1172234554
        //  1216: ldc_w           -1333539973
        //  1219: ixor           
        //  1220: lookupswitch {
        //          515605238: 2871
        //          1536513829: 1213
        //          default: 1248
        //        }
        //  1248: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1251: dup            
        //  1252: getstatic       dev/nuker/pyro/fc.c:I
        //  1255: ifge            1264
        //  1258: ldc_w           -327965757
        //  1261: goto            1267
        //  1264: ldc_w           -450181059
        //  1267: ldc_w           982560504
        //  1270: ixor           
        //  1271: lookupswitch {
        //          -1468392820: 1264
        //          -689763013: 2849
        //          default: 1296
        //        }
        //  1296: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1299: ldc2_w          0.13
        //  1302: dsub           
        //  1303: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1306: aload_0        
        //  1307: getfield        dev/nuker/pyro/f8Y.c:I
        //  1310: iconst_1       
        //  1311: if_icmpne       1320
        //  1314: ldc_w           -2096120985
        //  1317: goto            1323
        //  1320: ldc_w           -2096120986
        //  1323: ldc_w           1708368545
        //  1326: ixor           
        //  1327: tableswitch {
        //          -843566196: 1348
        //          -843566195: 1526
        //          default: 1314
        //        }
        //  1348: getstatic       dev/nuker/pyro/fc.c:I
        //  1351: ifge            1360
        //  1354: ldc_w           -663459467
        //  1357: goto            1363
        //  1360: ldc_w           -867066603
        //  1363: ldc_w           748733226
        //  1366: ixor           
        //  1367: lookupswitch {
        //          -187389345: 2921
        //          1180974942: 1360
        //          default: 1392
        //        }
        //  1392: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1395: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1398: getfield        net/minecraft/client/entity/EntityPlayerSP.field_191988_bg:F
        //  1401: fconst_0       
        //  1402: fcmpg          
        //  1403: ifne            1456
        //  1406: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1409: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1412: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70702_br:F
        //  1415: fconst_0       
        //  1416: fcmpg          
        //  1417: ifeq            1426
        //  1420: ldc_w           588106791
        //  1423: goto            1429
        //  1426: ldc_w           588106790
        //  1429: ldc_w           -768841713
        //  1432: ixor           
        //  1433: tableswitch {
        //          -498907056: 1456
        //          -498907055: 1526
        //          default: 1420
        //        }
        //  1456: aload_0        
        //  1457: ldc2_w          1.35
        //  1460: getstatic       dev/nuker/pyro/fc.1:I
        //  1463: ifeq            1472
        //  1466: ldc_w           445468865
        //  1469: goto            1475
        //  1472: ldc_w           1037816534
        //  1475: ldc_w           1427952690
        //  1478: ixor           
        //  1479: lookupswitch {
        //          140104064: 1472
        //          1334936819: 2913
        //          default: 1504
        //        }
        //  1504: goto            1508
        //  1507: athrow         
        //  1508: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  1511: goto            1515
        //  1514: athrow         
        //  1515: dmul           
        //  1516: ldc2_w          0.01
        //  1519: dsub           
        //  1520: putfield        dev/nuker/pyro/f8Y.c:D
        //  1523: goto            2539
        //  1526: getstatic       dev/nuker/pyro/fc.1:I
        //  1529: ifeq            1538
        //  1532: ldc_w           345173091
        //  1535: goto            1541
        //  1538: ldc_w           1259442788
        //  1541: ldc_w           -1119169169
        //  1544: ixor           
        //  1545: lookupswitch {
        //          -1445447412: 1538
        //          -161790197: 1572
        //          default: 2867
        //        }
        //  1572: aload_0        
        //  1573: getstatic       dev/nuker/pyro/fc.1:I
        //  1576: ifeq            1585
        //  1579: ldc_w           1117163816
        //  1582: goto            1588
        //  1585: ldc_w           573305353
        //  1588: ldc_w           -1168710896
        //  1591: ixor           
        //  1592: lookupswitch {
        //          -1736634087: 1620
        //          -121605576: 1585
        //          default: 2863
        //        }
        //  1620: getfield        dev/nuker/pyro/f8Y.c:I
        //  1623: iconst_2       
        //  1624: if_icmpne       2102
        //  1627: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1630: getstatic       dev/nuker/pyro/fc.1:I
        //  1633: ifeq            1642
        //  1636: ldc_w           -884589865
        //  1639: goto            1645
        //  1642: ldc_w           554847766
        //  1645: ldc_w           -406780066
        //  1648: ixor           
        //  1649: lookupswitch {
        //          -959231672: 1676
        //          747060617: 1642
        //          default: 2873
        //        }
        //  1676: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1679: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //  1682: ifeq            1691
        //  1685: ldc_w           -618711698
        //  1688: goto            1694
        //  1691: ldc_w           -618711703
        //  1694: ldc_w           237301893
        //  1697: ixor           
        //  1698: tableswitch {
        //          -1435005994: 1720
        //          -1435005993: 2102
        //          default: 1685
        //        }
        //  1720: aload_1        
        //  1721: ldc2_w          0.4
        //  1724: dstore_2       
        //  1725: getstatic       dev/nuker/pyro/fc.c:I
        //  1728: ifge            1737
        //  1731: ldc_w           1491794657
        //  1734: goto            1740
        //  1737: ldc_w           -1672806454
        //  1740: ldc_w           -1588139851
        //  1743: ixor           
        //  1744: lookupswitch {
        //          -105115052: 1737
        //          1025251199: 1772
        //          default: 2893
        //        }
        //  1772: astore          9
        //  1774: iconst_0       
        //  1775: istore          4
        //  1777: iconst_0       
        //  1778: getstatic       dev/nuker/pyro/fc.1:I
        //  1781: ifeq            1790
        //  1784: ldc_w           -70353994
        //  1787: goto            1793
        //  1790: ldc_w           -1751953065
        //  1793: ldc_w           576311399
        //  1796: ixor           
        //  1797: lookupswitch {
        //          -644371503: 2855
        //          1141082350: 1790
        //          default: 1824
        //        }
        //  1824: istore          5
        //  1826: getstatic       dev/nuker/pyro/fc.0:I
        //  1829: ifeq            1838
        //  1832: ldc_w           1390551031
        //  1835: goto            1841
        //  1838: ldc_w           314550444
        //  1841: ldc_w           -1907721369
        //  1844: ixor           
        //  1845: lookupswitch {
        //          -1661611061: 1872
        //          -592943984: 1838
        //          default: 2857
        //        }
        //  1872: dload_2        
        //  1873: dstore          6
        //  1875: iconst_0       
        //  1876: istore          8
        //  1878: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1881: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1884: dload           6
        //  1886: getstatic       dev/nuker/pyro/fc.1:I
        //  1889: ifeq            1898
        //  1892: ldc_w           103965361
        //  1895: goto            1901
        //  1898: ldc_w           -561226971
        //  1901: ldc_w           -1278197013
        //  1904: ixor           
        //  1905: lookupswitch {
        //          -1243471782: 1898
        //          1834752462: 1932
        //          default: 2877
        //        }
        //  1932: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1935: dload_2        
        //  1936: getstatic       dev/nuker/pyro/fc.0:I
        //  1939: ifeq            1948
        //  1942: ldc_w           1942731363
        //  1945: goto            1951
        //  1948: ldc_w           -1998143202
        //  1951: ldc_w           -1767394010
        //  1954: ixor           
        //  1955: lookupswitch {
        //          -445903035: 1948
        //          507606072: 1980
        //          default: 2909
        //        }
        //  1980: dstore          10
        //  1982: aload           9
        //  1984: getstatic       dev/nuker/pyro/fc.1:I
        //  1987: ifeq            1996
        //  1990: ldc_w           -605076805
        //  1993: goto            1999
        //  1996: ldc_w           -1985277814
        //  1999: ldc_w           -1911763483
        //  2002: ixor           
        //  2003: lookupswitch {
        //          128441711: 2028
        //          1440976734: 1996
        //          default: 2899
        //        }
        //  2028: dload           10
        //  2030: goto            2034
        //  2033: athrow         
        //  2034: invokevirtual   dev/nuker/pyro/f3e.c:(D)V
        //  2037: goto            2041
        //  2040: athrow         
        //  2041: aload_0        
        //  2042: dup            
        //  2043: getfield        dev/nuker/pyro/f8Y.c:D
        //  2046: ldc2_w          2.149
        //  2049: dmul           
        //  2050: getstatic       dev/nuker/pyro/fc.1:I
        //  2053: ifeq            2062
        //  2056: ldc_w           -1261769208
        //  2059: goto            2065
        //  2062: ldc_w           1695361398
        //  2065: ldc_w           -214898313
        //  2068: ixor           
        //  2069: lookupswitch {
        //          -1774338047: 2096
        //          1207568255: 2062
        //          default: 2839
        //        }
        //  2096: putfield        dev/nuker/pyro/f8Y.c:D
        //  2099: goto            2539
        //  2102: aload_0        
        //  2103: getfield        dev/nuker/pyro/f8Y.c:I
        //  2106: iconst_3       
        //  2107: if_icmpne       2188
        //  2110: ldc2_w          0.66
        //  2113: aload_0        
        //  2114: getfield        dev/nuker/pyro/f8Y.0:D
        //  2117: goto            2121
        //  2120: athrow         
        //  2121: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  2124: goto            2128
        //  2127: athrow         
        //  2128: dsub           
        //  2129: dmul           
        //  2130: dstore_2       
        //  2131: aload_0        
        //  2132: getstatic       dev/nuker/pyro/fc.0:I
        //  2135: ifeq            2144
        //  2138: ldc_w           526547187
        //  2141: goto            2147
        //  2144: ldc_w           740574453
        //  2147: ldc_w           -1773576416
        //  2150: ixor           
        //  2151: lookupswitch {
        //          -1993660461: 2889
        //          1165581605: 2144
        //          default: 2176
        //        }
        //  2176: aload_0        
        //  2177: getfield        dev/nuker/pyro/f8Y.0:D
        //  2180: dload_2        
        //  2181: dsub           
        //  2182: putfield        dev/nuker/pyro/f8Y.c:D
        //  2185: goto            2539
        //  2188: getstatic       dev/nuker/pyro/fc.0:I
        //  2191: ifeq            2200
        //  2194: ldc_w           -1287973754
        //  2197: goto            2203
        //  2200: ldc_w           1764756576
        //  2203: ldc_w           1787554042
        //  2206: ixor           
        //  2207: lookupswitch {
        //          -642712452: 2200
        //          62645402: 2232
        //          default: 2875
        //        }
        //  2232: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  2235: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2238: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  2241: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2244: checkcast       Lnet/minecraft/entity/Entity;
        //  2247: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  2250: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2253: dup            
        //  2254: pop            
        //  2255: goto            2259
        //  2258: athrow         
        //  2259: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  2262: goto            2266
        //  2265: athrow         
        //  2266: dconst_0       
        //  2267: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  2270: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2273: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2276: dconst_0       
        //  2277: goto            2281
        //  2280: athrow         
        //  2281: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  2284: goto            2288
        //  2287: athrow         
        //  2288: goto            2292
        //  2291: athrow         
        //  2292: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_184144_a:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        //  2295: goto            2299
        //  2298: athrow         
        //  2299: astore_2       
        //  2300: getstatic       dev/nuker/pyro/fc.0:I
        //  2303: ifeq            2312
        //  2306: ldc_w           1941974406
        //  2309: goto            2315
        //  2312: ldc_w           1742876793
        //  2315: ldc_w           2110508723
        //  2318: ixor           
        //  2319: lookupswitch {
        //          -1846194990: 2312
        //          235660085: 2891
        //          default: 2344
        //        }
        //  2344: aload_2        
        //  2345: goto            2349
        //  2348: athrow         
        //  2349: invokeinterface java/util/List.size:()I
        //  2354: goto            2358
        //  2357: athrow         
        //  2358: ifgt            2373
        //  2361: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  2364: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2367: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //  2370: ifeq            2431
        //  2373: aload_0        
        //  2374: getfield        dev/nuker/pyro/f8Y.c:I
        //  2377: ifle            2431
        //  2380: aload_0        
        //  2381: iconst_1       
        //  2382: getstatic       dev/nuker/pyro/fc.1:I
        //  2385: ifeq            2394
        //  2388: ldc_w           1176648208
        //  2391: goto            2397
        //  2394: ldc_w           3226772
        //  2397: ldc_w           -1559561834
        //  2400: ixor           
        //  2401: lookupswitch {
        //          -450313338: 2897
        //          1621235954: 2394
        //          default: 2428
        //        }
        //  2428: putfield        dev/nuker/pyro/f8Y.c:I
        //  2431: getstatic       dev/nuker/pyro/fc.0:I
        //  2434: ifeq            2443
        //  2437: ldc_w           -173521868
        //  2440: goto            2446
        //  2443: ldc_w           517590413
        //  2446: ldc_w           313452324
        //  2449: ixor           
        //  2450: lookupswitch {
        //          -418995440: 2443
        //          209136297: 2476
        //          default: 2879
        //        }
        //  2476: aload_0        
        //  2477: aload_0        
        //  2478: getfield        dev/nuker/pyro/f8Y.0:D
        //  2481: aload_0        
        //  2482: getfield        dev/nuker/pyro/f8Y.0:D
        //  2485: ldc2_w          159.0
        //  2488: ddiv           
        //  2489: dsub           
        //  2490: getstatic       dev/nuker/pyro/fc.1:I
        //  2493: ifeq            2502
        //  2496: ldc_w           -1638561582
        //  2499: goto            2505
        //  2502: ldc_w           -1943634581
        //  2505: ldc_w           342099326
        //  2508: ixor           
        //  2509: lookupswitch {
        //          -1976463956: 2502
        //          -1740474347: 2536
        //          default: 2851
        //        }
        //  2536: putfield        dev/nuker/pyro/f8Y.c:D
        //  2539: aload_1        
        //  2540: getstatic       dev/nuker/pyro/fc.0:I
        //  2543: ifeq            2552
        //  2546: ldc_w           -739538660
        //  2549: goto            2555
        //  2552: ldc_w           -1414850595
        //  2555: ldc_w           821313701
        //  2558: ixor           
        //  2559: lookupswitch {
        //          -1010354709: 2552
        //          -484456007: 2859
        //          default: 2584
        //        }
        //  2584: goto            2588
        //  2587: athrow         
        //  2588: invokevirtual   dev/nuker/pyro/f3e.c:()V
        //  2591: goto            2595
        //  2594: athrow         
        //  2595: aload_0        
        //  2596: getstatic       dev/nuker/pyro/fc.0:I
        //  2599: ifeq            2608
        //  2602: ldc_w           -97657750
        //  2605: goto            2611
        //  2608: ldc_w           2042428602
        //  2611: ldc_w           -519343655
        //  2614: ixor           
        //  2615: lookupswitch {
        //          -984112616: 2608
        //          455519667: 2905
        //          default: 2640
        //        }
        //  2640: aload_0        
        //  2641: getfield        dev/nuker/pyro/f8Y.c:D
        //  2644: goto            2648
        //  2647: athrow         
        //  2648: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  2651: goto            2655
        //  2654: athrow         
        //  2655: goto            2659
        //  2658: athrow         
        //  2659: invokestatic    java/lang/Math.max:(DD)D
        //  2662: goto            2666
        //  2665: athrow         
        //  2666: putfield        dev/nuker/pyro/f8Y.c:D
        //  2669: aload_1        
        //  2670: getstatic       dev/nuker/pyro/fc.1:I
        //  2673: ifeq            2682
        //  2676: ldc_w           -1690204642
        //  2679: goto            2685
        //  2682: ldc_w           -974924972
        //  2685: ldc_w           -667248978
        //  2688: ixor           
        //  2689: lookupswitch {
        //          500778490: 2716
        //          1132138672: 2682
        //          default: 2847
        //        }
        //  2716: aload_0        
        //  2717: getfield        dev/nuker/pyro/f8Y.c:D
        //  2720: getstatic       dev/nuker/pyro/fc.c:I
        //  2723: ifge            2732
        //  2726: ldc_w           -1419997095
        //  2729: goto            2735
        //  2732: ldc_w           275607605
        //  2735: ldc_w           77860511
        //  2738: ixor           
        //  2739: lookupswitch {
        //          -1342660922: 2732
        //          348749482: 2764
        //          default: 2911
        //        }
        //  2764: goto            2768
        //  2767: athrow         
        //  2768: invokestatic    dev/nuker/pyro/fbl.c:(Ldev/nuker/pyro/f3e;D)V
        //  2771: goto            2775
        //  2774: athrow         
        //  2775: aload_0        
        //  2776: dup            
        //  2777: dup            
        //  2778: getfield        dev/nuker/pyro/f8Y.c:I
        //  2781: iconst_1       
        //  2782: iadd           
        //  2783: putfield        dev/nuker/pyro/f8Y.c:I
        //  2786: getstatic       dev/nuker/pyro/fc.c:I
        //  2789: ifge            2798
        //  2792: ldc_w           -520035083
        //  2795: goto            2801
        //  2798: ldc_w           -357486400
        //  2801: ldc_w           1477156251
        //  2804: ixor           
        //  2805: lookupswitch {
        //          -1190430354: 2865
        //          -1154680673: 2798
        //          default: 2832
        //        }
        //  2832: getfield        dev/nuker/pyro/f8Y.c:I
        //  2835: pop            
        //  2836: return         
        //  2837: aconst_null    
        //  2838: athrow         
        //  2839: aconst_null    
        //  2840: athrow         
        //  2841: aconst_null    
        //  2842: athrow         
        //  2843: aconst_null    
        //  2844: athrow         
        //  2845: aconst_null    
        //  2846: athrow         
        //  2847: aconst_null    
        //  2848: athrow         
        //  2849: aconst_null    
        //  2850: athrow         
        //  2851: aconst_null    
        //  2852: athrow         
        //  2853: aconst_null    
        //  2854: athrow         
        //  2855: aconst_null    
        //  2856: athrow         
        //  2857: aconst_null    
        //  2858: athrow         
        //  2859: aconst_null    
        //  2860: athrow         
        //  2861: aconst_null    
        //  2862: athrow         
        //  2863: aconst_null    
        //  2864: athrow         
        //  2865: aconst_null    
        //  2866: athrow         
        //  2867: aconst_null    
        //  2868: athrow         
        //  2869: aconst_null    
        //  2870: athrow         
        //  2871: aconst_null    
        //  2872: athrow         
        //  2873: aconst_null    
        //  2874: athrow         
        //  2875: aconst_null    
        //  2876: athrow         
        //  2877: aconst_null    
        //  2878: athrow         
        //  2879: aconst_null    
        //  2880: athrow         
        //  2881: aconst_null    
        //  2882: athrow         
        //  2883: aconst_null    
        //  2884: athrow         
        //  2885: aconst_null    
        //  2886: athrow         
        //  2887: aconst_null    
        //  2888: athrow         
        //  2889: aconst_null    
        //  2890: athrow         
        //  2891: aconst_null    
        //  2892: athrow         
        //  2893: aconst_null    
        //  2894: athrow         
        //  2895: aconst_null    
        //  2896: athrow         
        //  2897: aconst_null    
        //  2898: athrow         
        //  2899: aconst_null    
        //  2900: athrow         
        //  2901: aconst_null    
        //  2902: athrow         
        //  2903: aconst_null    
        //  2904: athrow         
        //  2905: aconst_null    
        //  2906: athrow         
        //  2907: aconst_null    
        //  2908: athrow         
        //  2909: aconst_null    
        //  2910: athrow         
        //  2911: aconst_null    
        //  2912: athrow         
        //  2913: aconst_null    
        //  2914: athrow         
        //  2915: aconst_null    
        //  2916: athrow         
        //  2917: aconst_null    
        //  2918: athrow         
        //  2919: aconst_null    
        //  2920: athrow         
        //  2921: aconst_null    
        //  2922: athrow         
        //  2923: pop            
        //  2924: goto            24
        //  2927: pop            
        //  2928: aconst_null    
        //  2929: goto            2923
        //  2932: dup            
        //  2933: ifnull          2923
        //  2936: checkcast       Ljava/lang/Throwable;
        //  2939: athrow         
        //  2940: dup            
        //  2941: ifnull          2927
        //  2944: checkcast       Ljava/lang/Throwable;
        //  2947: athrow         
        //  2948: aconst_null    
        //  2949: athrow         
        //    StackMapTable: 01 49 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 07 00 03 07 00 8A 0A 41 01 1E 4D 07 00 8A FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 8A 01 5B 07 00 8A FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 01 07 00 8A 45 07 00 24 40 07 00 8F FF 00 09 00 00 00 01 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 01 07 00 8A 45 07 00 24 40 01 02 00 42 07 00 24 00 45 07 00 24 40 01 0D 41 01 1B 0E 47 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 AF 07 01 C3 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 AF 07 01 C3 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 AF 07 01 C3 45 07 00 24 00 00 4D 07 00 C6 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 C6 01 5C 07 00 C6 4D 07 00 CE FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 CE 01 5B 07 00 CE 42 07 00 1C 40 07 00 CE 45 07 00 24 40 07 01 C5 4F 07 00 D3 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 D3 01 5E 07 00 D3 42 07 00 1E 40 07 00 D3 45 07 00 24 40 01 0D 41 01 1C FF 00 10 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 00 C6 FF 00 01 00 02 07 00 03 07 00 8A 00 03 07 00 C6 07 00 C6 01 FF 00 1C 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 00 C6 45 07 00 16 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 00 E4 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 01 C5 45 07 00 74 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 00 E9 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 C6 03 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 C6 03 45 07 00 24 40 03 05 04 41 01 17 00 4D 07 00 F7 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 F7 01 5E 07 00 F7 42 07 00 1A 40 07 00 F7 45 07 00 24 40 07 00 FF 4A 07 00 FF FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 FF 01 5B 07 00 FF 42 07 00 24 40 07 00 FF 45 07 00 24 40 07 01 C5 45 07 00 1C 40 07 00 D3 45 07 00 24 40 01 FF 00 0A 00 00 00 01 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 AF 07 01 C3 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 AF 07 01 C3 48 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 04 07 00 AF 07 01 C3 07 01 02 02 45 07 00 24 00 0B 42 01 1F 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 03 01 5F 07 00 03 FF 00 14 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 01 FF 00 1F 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 FF 00 0E 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A2 FF 00 02 00 02 07 00 03 07 00 8A 00 04 07 00 03 03 07 00 A2 01 FF 00 1D 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A2 FF 00 0E 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A8 FF 00 02 00 02 07 00 03 07 00 8A 00 04 07 00 03 03 07 00 A8 01 FF 00 1D 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A8 48 07 00 4B FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 45 07 00 24 40 03 FF 00 0F 00 02 07 00 03 07 00 8A 00 03 03 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 8A 00 04 03 07 00 03 03 01 FF 00 1F 00 02 07 00 03 07 00 8A 00 03 03 07 00 03 03 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 03 07 00 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 03 03 FF 00 16 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 A8 07 00 A8 01 FF 00 1E 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 FF 00 17 00 02 07 00 03 07 00 8A 00 02 07 00 8A 07 00 8A FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 8A 07 00 8A 01 FF 00 1C 00 02 07 00 03 07 00 8A 00 02 07 00 8A 07 00 8A 42 07 00 16 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 8A 07 00 8A 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 46 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 45 07 00 24 00 4E 07 00 A2 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 A2 01 5F 07 00 A2 FF 00 0F 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 A8 07 00 A8 01 FF 00 1C 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 09 07 05 42 01 18 0B 42 01 1C 1B 05 42 01 1A FF 00 0F 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 01 FF 00 1C 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 03 0A 0B 42 01 1E 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 03 01 5F 07 00 03 55 07 00 A2 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 A2 01 5E 07 00 A2 08 05 42 01 19 FF 00 10 00 03 07 00 03 07 00 8A 03 00 01 07 00 8A FF 00 02 00 03 07 00 03 07 00 8A 03 00 02 07 00 8A 01 5F 07 00 8A FF 00 11 00 09 07 00 03 07 00 8A 03 01 00 00 00 00 07 00 8A 00 01 01 FF 00 02 00 09 07 00 03 07 00 8A 03 01 00 00 00 00 07 00 8A 00 02 01 01 5E 01 FF 00 0D 00 09 07 00 03 07 00 8A 03 01 01 00 00 00 07 00 8A 00 00 42 01 1E FF 00 19 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 02 07 00 A8 03 FF 00 02 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 03 07 00 A8 03 01 FF 00 1E 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 02 07 00 A8 03 4F 03 FF 00 02 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 02 03 01 5C 03 FF 00 0F 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 01 07 00 8A FF 00 02 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 02 07 00 8A 01 5C 07 00 8A FF 00 04 00 00 00 01 07 00 24 FF 00 00 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 02 07 00 8A 03 45 07 00 24 00 FF 00 14 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 02 07 00 03 03 FF 00 02 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 03 07 00 03 03 01 FF 00 1E 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 02 07 00 03 03 FF 00 05 00 02 07 00 03 07 00 8A 00 00 51 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 03 03 03 FF 00 0F 00 03 07 00 03 07 00 8A 03 00 01 07 00 03 FF 00 02 00 03 07 00 03 07 00 8A 03 00 02 07 00 03 01 5C 07 00 03 FA 00 0B 0B 42 01 1C 59 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 01 90 07 01 84 07 00 A8 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 01 90 07 01 84 07 01 8A 4D 07 00 76 FF 00 00 00 02 07 00 03 07 00 8A 00 06 07 01 90 07 01 84 07 01 8A 03 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 01 90 07 01 84 07 01 8A 42 07 00 50 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 01 90 07 01 84 07 01 8A 45 07 00 24 40 07 01 99 FC 00 0C 07 01 99 42 01 1C 43 07 00 78 40 07 01 99 47 07 00 24 40 01 0E FF 00 14 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 07 00 8A 07 01 99 00 03 07 00 03 01 01 FF 00 1E 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 01 02 0B 42 01 1D FF 00 19 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 03 FF 00 02 00 03 07 00 03 07 00 8A 07 01 99 00 03 07 00 03 03 01 FF 00 1E 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 03 FA 00 02 4C 07 00 8A FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 8A 01 5C 07 00 8A 42 07 00 24 40 07 00 8A 45 07 00 24 00 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 03 01 5C 07 00 03 46 07 00 4B FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 03 42 07 00 80 FF 00 00 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 4F 07 00 8A FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 8A 01 5E 07 00 8A FF 00 0F 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 FF 00 02 00 02 07 00 03 07 00 8A 00 03 07 00 8A 03 01 FF 00 1C 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 45 07 00 24 00 56 07 00 03 FF 00 02 00 02 07 00 03 07 00 8A 00 02 07 00 03 01 5E 07 00 03 FF 00 04 00 02 07 00 03 07 00 8A 00 02 07 00 8A 07 00 8A FF 00 01 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 02 07 00 03 03 FF 00 01 00 02 07 00 03 07 00 8A 00 01 07 00 C6 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 C6 07 00 C6 41 07 00 CE 41 07 00 8A FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 FF 00 01 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 03 FF 00 01 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A8 FF 00 01 00 09 07 00 03 07 00 8A 03 01 00 00 00 00 07 00 8A 00 01 01 FF 00 01 00 09 07 00 03 07 00 8A 03 01 01 00 00 00 07 00 8A 00 00 FF 00 01 00 02 07 00 03 07 00 8A 00 01 07 00 8A 41 07 00 F7 41 07 00 03 41 07 00 03 01 01 41 07 00 A2 41 07 00 A2 01 FF 00 01 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 02 07 00 A8 03 FF 00 01 00 03 07 00 03 07 00 8A 07 01 99 00 00 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 41 07 00 D3 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 A8 07 00 A8 FF 00 01 00 02 07 00 03 07 00 8A 00 03 07 00 03 03 07 00 A2 FF 00 01 00 03 07 00 03 07 00 8A 03 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 8A 07 01 99 00 00 FF 00 01 00 03 07 00 03 07 00 8A 03 00 01 07 00 8A FA 00 01 FF 00 01 00 03 07 00 03 07 00 8A 07 01 99 00 02 07 00 03 01 FF 00 01 00 09 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 03 00 01 07 00 8A FF 00 01 00 02 07 00 03 07 00 8A 00 03 03 07 00 03 03 41 07 00 8A 41 07 00 03 01 FF 00 01 00 08 07 00 03 07 00 8A 03 01 01 03 01 07 00 8A 00 01 03 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 8A 03 FF 00 01 00 02 07 00 03 07 00 8A 00 02 07 00 03 03 41 07 00 FF 01 41 07 00 03 01 41 07 00 24 43 05 44 07 00 24 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2932   2940   Any
        //  2932   2940   2932   2940   Any
        //  2948   2950   3      8      Any
        //  116    122    122    123    Any
        //  116    122    122    123    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  116    122    3      8      Ljava/lang/ArithmeticException;
        //  116    122    122    123    Any
        //  116    122    3      8      Any
        //  134    140    140    141    Any
        //  134    140    140    141    Any
        //  134    140    3      8      Any
        //  134    140    3      8      Any
        //  134    140    3      8      Any
        //  148    155    155    156    Any
        //  149    155    148    149    Any
        //  149    155    148    149    Any
        //  148    155    148    149    Any
        //  148    155    155    156    Ljava/lang/NegativeArraySizeException;
        //  223    230    230    231    Any
        //  224    230    230    231    Ljava/lang/ClassCastException;
        //  223    230    223    224    Any
        //  224    230    223    224    Ljava/lang/ArithmeticException;
        //  223    230    3      8      Any
        //  234    241    241    242    Any
        //  235    241    241    242    Any
        //  235    241    241    242    Any
        //  234    241    241    242    Any
        //  234    241    234    235    Any
        //  335    342    342    343    Any
        //  336    342    342    343    Any
        //  336    342    3      8      Ljava/lang/NegativeArraySizeException;
        //  335    342    342    343    Any
        //  336    342    335    336    Ljava/lang/ClassCastException;
        //  395    402    402    403    Any
        //  395    402    395    396    Ljava/lang/StringIndexOutOfBoundsException;
        //  396    402    402    403    Any
        //  396    402    3      8      Any
        //  395    402    402    403    Ljava/util/NoSuchElementException;
        //  502    509    509    510    Any
        //  502    509    509    510    Ljava/lang/NegativeArraySizeException;
        //  502    509    502    503    Ljava/lang/IndexOutOfBoundsException;
        //  502    509    3      8      Any
        //  502    509    3      8      Any
        //  516    523    523    524    Any
        //  516    523    3      8      Ljava/util/NoSuchElementException;
        //  516    523    3      8      Ljava/lang/IllegalStateException;
        //  517    523    516    517    Ljava/lang/IllegalStateException;
        //  517    523    523    524    Ljava/lang/NullPointerException;
        //  527    534    534    535    Any
        //  528    534    3      8      Any
        //  527    534    527    528    Ljava/lang/StringIndexOutOfBoundsException;
        //  528    534    527    528    Any
        //  528    534    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  623    630    630    631    Any
        //  624    630    623    624    Ljava/util/NoSuchElementException;
        //  624    630    3      8      Any
        //  623    630    3      8      Ljava/lang/IllegalArgumentException;
        //  624    630    630    631    Ljava/lang/AssertionError;
        //  675    682    682    683    Any
        //  675    682    675    676    Any
        //  675    682    675    676    Any
        //  676    682    3      8      Any
        //  676    682    682    683    Ljava/lang/IllegalStateException;
        //  689    696    696    697    Any
        //  690    696    689    690    Ljava/lang/ClassCastException;
        //  690    696    3      8      Ljava/lang/AssertionError;
        //  690    696    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  690    696    3      8      Any
        //  709    715    715    716    Any
        //  709    715    715    716    Ljava/lang/UnsupportedOperationException;
        //  709    715    715    716    Any
        //  709    715    715    716    Any
        //  709    715    3      8      Ljava/lang/NegativeArraySizeException;
        //  725    732    732    733    Any
        //  725    732    732    733    Any
        //  725    732    725    726    Any
        //  725    732    3      8      Ljava/lang/NegativeArraySizeException;
        //  726    732    3      8      Any
        //  989    996    996    997    Any
        //  990    996    989    990    Ljava/util/ConcurrentModificationException;
        //  989    996    989    990    Ljava/lang/StringIndexOutOfBoundsException;
        //  989    996    996    997    Ljava/lang/IndexOutOfBoundsException;
        //  990    996    996    997    Any
        //  1051   1058   1058   1059   Any
        //  1052   1058   1051   1052   Any
        //  1051   1058   1058   1059   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1052   1058   1058   1059   Ljava/lang/NullPointerException;
        //  1051   1058   1058   1059   Any
        //  1175   1182   1182   1183   Any
        //  1176   1182   1182   1183   Any
        //  1176   1182   1175   1176   Ljava/lang/IndexOutOfBoundsException;
        //  1175   1182   3      8      Any
        //  1176   1182   1182   1183   Ljava/util/NoSuchElementException;
        //  1190   1197   1197   1198   Any
        //  1191   1197   1197   1198   Any
        //  1191   1197   1197   1198   Any
        //  1191   1197   1190   1191   Ljava/lang/ClassCastException;
        //  1191   1197   1190   1191   Any
        //  1507   1514   1514   1515   Any
        //  1508   1514   1507   1508   Any
        //  1507   1514   1507   1508   Any
        //  1507   1514   3      8      Ljava/lang/NumberFormatException;
        //  1508   1514   1514   1515   Any
        //  2034   2040   2040   2041   Any
        //  2034   2040   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2034   2040   2040   2041   Any
        //  2034   2040   2040   2041   Ljava/lang/NumberFormatException;
        //  2034   2040   3      8      Any
        //  2120   2127   2127   2128   Any
        //  2121   2127   3      8      Any
        //  2121   2127   2120   2121   Ljava/lang/RuntimeException;
        //  2121   2127   2127   2128   Any
        //  2120   2127   2120   2121   Any
        //  2258   2265   2265   2266   Any
        //  2259   2265   2258   2259   Any
        //  2258   2265   3      8      Any
        //  2258   2265   2258   2259   Any
        //  2259   2265   2258   2259   Any
        //  2280   2287   2287   2288   Any
        //  2281   2287   3      8      Any
        //  2281   2287   2287   2288   Ljava/lang/NullPointerException;
        //  2280   2287   2280   2281   Ljava/lang/NullPointerException;
        //  2280   2287   2287   2288   Ljava/util/ConcurrentModificationException;
        //  2291   2298   2298   2299   Any
        //  2292   2298   3      8      Any
        //  2292   2298   2291   2292   Ljava/lang/ArithmeticException;
        //  2292   2298   3      8      Any
        //  2292   2298   3      8      Any
        //  2348   2357   2357   2358   Any
        //  2349   2357   2348   2349   Ljava/lang/EnumConstantNotPresentException;
        //  2349   2357   2357   2358   Any
        //  2348   2357   2357   2358   Any
        //  2349   2357   3      8      Any
        //  2587   2594   2594   2595   Any
        //  2588   2594   2587   2588   Any
        //  2588   2594   3      8      Any
        //  2588   2594   2587   2588   Ljava/lang/ClassCastException;
        //  2587   2594   2594   2595   Any
        //  2647   2654   2654   2655   Any
        //  2647   2654   3      8      Any
        //  2648   2654   3      8      Any
        //  2647   2654   2654   2655   Ljava/lang/StringIndexOutOfBoundsException;
        //  2648   2654   2647   2648   Ljava/lang/RuntimeException;
        //  2658   2665   2665   2666   Any
        //  2658   2665   3      8      Ljava/lang/ClassCastException;
        //  2659   2665   2665   2666   Any
        //  2658   2665   2658   2659   Ljava/util/ConcurrentModificationException;
        //  2658   2665   2665   2666   Any
        //  2767   2774   2774   2775   Any
        //  2768   2774   2767   2768   Any
        //  2767   2774   3      8      Ljava/lang/ArithmeticException;
        //  2768   2774   2767   2768   Any
        //  2767   2774   3      8      Ljava/lang/ArithmeticException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:667)
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
    
    @Override
    public void c(@NotNull final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          523
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            515
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            507
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -1772369952
        //    33: goto            39
        //    36: ldc_w           -739761240
        //    39: ldc_w           -1834105610
        //    42: ixor           
        //    43: lookupswitch {
        //          71438710: 36
        //          83231510: 482
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            82
        //    76: ldc_w           -33840842
        //    79: goto            85
        //    82: ldc_w           1938169614
        //    85: ldc_w           -535682814
        //    88: ixor           
        //    89: lookupswitch {
        //          -1819001332: 116
        //          501841972: 82
        //          default: 484
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   131: if_acmpeq       135
        //   134: return         
        //   135: getstatic       dev/nuker/pyro/fc.1:I
        //   138: ifeq            147
        //   141: ldc_w           -1924896139
        //   144: goto            150
        //   147: ldc_w           1761823012
        //   150: ldc_w           -611599841
        //   153: ixor           
        //   154: lookupswitch {
        //          1274668625: 147
        //          1456459882: 496
        //          default: 180
        //        }
        //   180: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   183: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   186: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   189: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   192: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   195: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70169_q:D
        //   198: dsub           
        //   199: dstore_2       
        //   200: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   209: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   212: getstatic       dev/nuker/pyro/fc.c:I
        //   215: ifge            224
        //   218: ldc_w           1622986634
        //   221: goto            227
        //   224: ldc_w           918500734
        //   227: ldc_w           771443050
        //   230: ixor           
        //   231: lookupswitch {
        //          457473044: 256
        //          1296533216: 224
        //          default: 490
        //        }
        //   256: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   259: getstatic       dev/nuker/pyro/fc.1:I
        //   262: ifeq            271
        //   265: ldc_w           387595610
        //   268: goto            274
        //   271: ldc_w           -2029436845
        //   274: ldc_w           1824445961
        //   277: ixor           
        //   278: lookupswitch {
        //          950316211: 271
        //          2074405715: 492
        //          default: 304
        //        }
        //   304: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70166_s:D
        //   307: dsub           
        //   308: getstatic       dev/nuker/pyro/fc.0:I
        //   311: ifeq            320
        //   314: ldc_w           -651457949
        //   317: goto            323
        //   320: ldc_w           -1733243285
        //   323: ldc_w           -1921894670
        //   326: ixor           
        //   327: lookupswitch {
        //          452931884: 320
        //          1415167121: 486
        //          default: 352
        //        }
        //   352: dstore          4
        //   354: aload_0        
        //   355: dload_2        
        //   356: dload_2        
        //   357: dmul           
        //   358: dload           4
        //   360: getstatic       dev/nuker/pyro/fc.0:I
        //   363: ifeq            372
        //   366: ldc_w           2090586710
        //   369: goto            375
        //   372: ldc_w           829877049
        //   375: ldc_w           -320859174
        //   378: ixor           
        //   379: lookupswitch {
        //          -1870937716: 494
        //          -345991840: 372
        //          default: 404
        //        }
        //   404: dload           4
        //   406: dmul           
        //   407: dadd           
        //   408: getstatic       dev/nuker/pyro/fc.c:I
        //   411: ifge            420
        //   414: ldc_w           -1807298681
        //   417: goto            423
        //   420: ldc_w           -921256836
        //   423: ldc_w           228651809
        //   426: ixor           
        //   427: lookupswitch {
        //          -1712964442: 488
        //          -1085527229: 420
        //          default: 452
        //        }
        //   452: dstore          6
        //   454: astore          9
        //   456: iconst_0       
        //   457: istore          8
        //   459: dload           6
        //   461: goto            465
        //   464: athrow         
        //   465: invokestatic    java/lang/Math.sqrt:(D)D
        //   468: goto            472
        //   471: athrow         
        //   472: dstore          10
        //   474: aload           9
        //   476: dload           10
        //   478: putfield        dev/nuker/pyro/f8Y.0:D
        //   481: return         
        //   482: aconst_null    
        //   483: athrow         
        //   484: aconst_null    
        //   485: athrow         
        //   486: aconst_null    
        //   487: athrow         
        //   488: aconst_null    
        //   489: athrow         
        //   490: aconst_null    
        //   491: athrow         
        //   492: aconst_null    
        //   493: athrow         
        //   494: aconst_null    
        //   495: athrow         
        //   496: aconst_null    
        //   497: athrow         
        //   498: pop            
        //   499: goto            24
        //   502: pop            
        //   503: aconst_null    
        //   504: goto            498
        //   507: dup            
        //   508: ifnull          498
        //   511: checkcast       Ljava/lang/Throwable;
        //   514: athrow         
        //   515: dup            
        //   516: ifnull          502
        //   519: checkcast       Ljava/lang/Throwable;
        //   522: athrow         
        //   523: aconst_null    
        //   524: athrow         
        //    StackMapTable: 00 32 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 07 00 03 07 01 CE 0B 42 01 1C 0D 42 01 1E 43 07 00 7C 40 07 01 CE 45 07 00 24 40 07 00 8F 06 0B 42 01 1D FF 00 2B 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A2 FF 00 02 00 03 07 00 03 07 01 CE 03 00 03 03 07 00 A2 01 FF 00 1C 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A2 FF 00 0E 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A8 FF 00 02 00 03 07 00 03 07 01 CE 03 00 03 03 07 00 A8 01 FF 00 1D 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A8 4F 03 FF 00 02 00 03 07 00 03 07 01 CE 03 00 02 03 01 5C 03 FF 00 13 00 04 07 00 03 07 01 CE 03 03 00 03 07 00 03 03 03 FF 00 02 00 04 07 00 03 07 01 CE 03 03 00 04 07 00 03 03 03 01 FF 00 1C 00 04 07 00 03 07 01 CE 03 03 00 03 07 00 03 03 03 FF 00 0F 00 04 07 00 03 07 01 CE 03 03 00 02 07 00 03 03 FF 00 02 00 04 07 00 03 07 01 CE 03 03 00 03 07 00 03 03 01 FF 00 1C 00 04 07 00 03 07 01 CE 03 03 00 02 07 00 03 03 FF 00 0B 00 07 07 00 03 07 01 CE 03 03 03 01 07 00 03 00 01 07 00 24 40 03 45 07 00 24 40 03 FF 00 09 00 02 07 00 03 07 01 CE 00 00 01 FF 00 01 00 03 07 00 03 07 01 CE 03 00 01 03 FF 00 01 00 04 07 00 03 07 01 CE 03 03 00 02 07 00 03 03 FF 00 01 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A2 FF 00 01 00 03 07 00 03 07 01 CE 03 00 02 03 07 00 A8 FF 00 01 00 04 07 00 03 07 01 CE 03 03 00 03 07 00 03 03 03 F9 00 01 41 07 00 24 43 05 44 07 00 24 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     507    515    Any
        //  507    515    507    515    Ljava/lang/StringIndexOutOfBoundsException;
        //  523    525    3      8      Any
        //  120    127    127    128    Any
        //  120    127    3      8      Any
        //  121    127    127    128    Ljava/util/NoSuchElementException;
        //  120    127    120    121    Ljava/lang/AssertionError;
        //  120    127    127    128    Any
        //  464    471    471    472    Any
        //  465    471    471    472    Any
        //  465    471    464    465    Any
        //  465    471    471    472    Any
        //  465    471    3      8      Ljava/lang/StringIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visitVariable(StackMappingVisitor.java:470)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:556)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
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
