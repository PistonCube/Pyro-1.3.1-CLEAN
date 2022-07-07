// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f42 extends f3z
{
    @Override
    public boolean func_73868_f() {
        return fbS.ez(this, 529832731);
    }
    
    @Override
    public void func_146286_b(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          169
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            161
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            153
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             351078093
        //    32: goto            37
        //    35: ldc             -1576000947
        //    37: ldc             -308488985
        //    39: ixor           
        //    40: lookupswitch {
        //          -109981142: 35
        //          1334638250: 68
        //          default: 140
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: iload_2        
        //    71: iload_3        
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/f3z.func_146286_b:(III)V
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            97
        //    92: ldc             750089832
        //    94: goto            99
        //    97: ldc             -900386016
        //    99: ldc             1563478904
        //   101: ixor           
        //   102: lookupswitch {
        //          -1754924968: 128
        //          1904590096: 97
        //          default: 142
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/fA.6:()V
        //   135: goto            139
        //   138: athrow         
        //   139: return         
        //   140: aconst_null    
        //   141: athrow         
        //   142: aconst_null    
        //   143: athrow         
        //   144: pop            
        //   145: goto            24
        //   148: pop            
        //   149: aconst_null    
        //   150: goto            144
        //   153: dup            
        //   154: ifnull          144
        //   157: checkcast       Ljava/lang/Throwable;
        //   160: athrow         
        //   161: dup            
        //   162: ifnull          148
        //   165: checkcast       Ljava/lang/Throwable;
        //   168: athrow         
        //   169: aconst_null    
        //   170: athrow         
        //    StackMapTable: 00 19 43 07 00 22 04 FF 00 0B 00 00 00 01 07 00 22 FF 00 03 00 04 07 00 03 01 01 01 00 00 0A 41 01 1E 46 07 00 14 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 22 00 4D 07 00 2C FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 2C 01 5C 07 00 2C FF 00 02 00 00 00 01 07 00 22 FF 00 00 00 04 07 00 03 01 01 01 00 01 07 00 2C 45 07 00 22 00 00 41 07 00 2C 41 07 00 22 43 05 44 07 00 22 47 05 47 07 00 22
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     153    161    Any
        //  153    161    153    161    Ljava/util/NoSuchElementException;
        //  169    171    3      8      Any
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/RuntimeException;
        //  75     82     82     83     Ljava/lang/StringIndexOutOfBoundsException;
        //  76     82     3      8      Ljava/lang/IllegalArgumentException;
        //  75     82     82     83     Ljava/lang/IllegalStateException;
        //  132    138    138    139    Any
        //  132    138    138    139    Any
        //  132    138    138    139    Any
        //  132    138    138    139    Ljava/util/NoSuchElementException;
        //  132    138    138    139    Ljava/lang/IllegalStateException;
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
    
    @Override
    public void func_73863_a(final int p0, final int p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          236
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            228
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            220
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             707081584
        //    35: goto            40
        //    38: ldc             280063699
        //    40: ldc             -540319623
        //    42: ixor           
        //    43: lookupswitch {
        //          -168930039: 209
        //          277113043: 38
        //          default: 68
        //        }
        //    68: fload_3        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            80
        //    75: ldc             -617694492
        //    77: goto            82
        //    80: ldc             256680640
        //    82: ldc             -482185994
        //    84: ixor           
        //    85: lookupswitch {
        //          586784403: 80
        //          946656786: 205
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokespecial   dev/nuker/pyro/f3z.func_73863_a:(IIF)V
        //   119: goto            123
        //   122: athrow         
        //   123: new             Lnet/minecraft/client/gui/ScaledResolution;
        //   126: dup            
        //   127: aload_0        
        //   128: getfield        dev/nuker/pyro/f42.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   131: goto            135
        //   134: athrow         
        //   135: invokespecial   net/minecraft/client/gui/ScaledResolution.<init>:(Lnet/minecraft/client/Minecraft;)V
        //   138: goto            142
        //   141: athrow         
        //   142: astore          4
        //   144: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //   147: getstatic       dev/nuker/pyro/fc.0:I
        //   150: ifeq            158
        //   153: ldc             -1527916472
        //   155: goto            160
        //   158: ldc             -2008599952
        //   160: ldc             1610970007
        //   162: ixor           
        //   163: lookupswitch {
        //          -991384609: 207
        //          927749694: 158
        //          default: 188
        //        }
        //   188: aload           4
        //   190: iload_1        
        //   191: iload_2        
        //   192: iconst_1       
        //   193: goto            197
        //   196: athrow         
        //   197: invokevirtual   dev/nuker/pyro/fA.c:(Lnet/minecraft/client/gui/ScaledResolution;IIZ)V
        //   200: goto            204
        //   203: athrow         
        //   204: return         
        //   205: aconst_null    
        //   206: athrow         
        //   207: aconst_null    
        //   208: athrow         
        //   209: aconst_null    
        //   210: athrow         
        //   211: pop            
        //   212: goto            24
        //   215: pop            
        //   216: aconst_null    
        //   217: goto            211
        //   220: dup            
        //   221: ifnull          211
        //   224: checkcast       Ljava/lang/Throwable;
        //   227: athrow         
        //   228: dup            
        //   229: ifnull          215
        //   232: checkcast       Ljava/lang/Throwable;
        //   235: athrow         
        //   236: aconst_null    
        //   237: athrow         
        //    StackMapTable: 00 21 43 07 00 22 04 FF 00 0B 00 00 00 01 07 00 22 FF 00 03 00 04 07 00 03 01 01 02 00 00 FF 00 0D 00 04 07 00 03 01 01 02 00 03 07 00 03 01 01 FF 00 01 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 01 FF 00 1B 00 04 07 00 03 01 01 02 00 03 07 00 03 01 01 FF 00 0B 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 FF 00 01 00 04 07 00 03 01 01 02 00 05 07 00 03 01 01 02 01 FF 00 1D 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 42 07 00 22 FF 00 00 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 45 07 00 22 00 FF 00 0A 00 00 00 01 07 00 22 FF 00 00 00 04 07 00 03 01 01 02 00 03 08 00 7B 08 00 7B 07 00 5D 45 07 00 22 40 07 00 4D FF 00 0F 00 05 07 00 03 01 01 02 07 00 4D 00 01 07 00 2C FF 00 01 00 05 07 00 03 01 01 02 07 00 4D 00 02 07 00 2C 01 5B 07 00 2C 47 07 00 22 FF 00 00 00 05 07 00 03 01 01 02 07 00 4D 00 05 07 00 2C 07 00 4D 01 01 01 45 07 00 22 00 FF 00 00 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 FF 00 01 00 05 07 00 03 01 01 02 07 00 4D 00 01 07 00 2C FF 00 01 00 04 07 00 03 01 01 02 00 03 07 00 03 01 01 41 07 00 22 43 05 44 07 00 22 47 05 47 07 00 22
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     220    228    Any
        //  220    228    220    228    Any
        //  236    238    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  115    122    122    123    Any
        //  115    122    122    123    Ljava/lang/IllegalArgumentException;
        //  115    122    115    116    Any
        //  115    122    115    116    Any
        //  115    122    122    123    Ljava/lang/ArithmeticException;
        //  135    141    141    142    Any
        //  135    141    141    142    Any
        //  135    141    3      8      Ljava/lang/NegativeArraySizeException;
        //  135    141    141    142    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  135    141    141    142    Any
        //  196    203    203    204    Any
        //  197    203    196    197    Any
        //  197    203    3      8      Any
        //  196    203    196    197    Ljava/lang/EnumConstantNotPresentException;
        //  197    203    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 77 out of bounds for length 77
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    public void func_73864_a(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          126
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            118
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            110
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: iload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/f3z.func_73864_a:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            53
        //    48: ldc             -114763744
        //    50: goto            55
        //    53: ldc             111142918
        //    55: ldc             1051316393
        //    57: ixor           
        //    58: lookupswitch {
        //          -947844983: 53
        //          943077551: 84
        //          default: 99
        //        }
        //    84: iload_1        
        //    85: iload_2        
        //    86: iload_3        
        //    87: goto            91
        //    90: athrow         
        //    91: invokevirtual   dev/nuker/pyro/fA.c:(III)V
        //    94: goto            98
        //    97: athrow         
        //    98: return         
        //    99: aconst_null    
        //   100: athrow         
        //   101: pop            
        //   102: goto            24
        //   105: pop            
        //   106: aconst_null    
        //   107: goto            101
        //   110: dup            
        //   111: ifnull          101
        //   114: checkcast       Ljava/lang/Throwable;
        //   117: athrow         
        //   118: dup            
        //   119: ifnull          105
        //   122: checkcast       Ljava/lang/Throwable;
        //   125: athrow         
        //   126: aconst_null    
        //   127: athrow         
        //    StackMapTable: 00 15 43 07 00 22 04 FF 00 0B 00 00 00 01 07 00 22 FF 00 03 00 04 07 00 03 01 01 01 00 00 46 07 00 14 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 22 00 4D 07 00 2C FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 2C 01 5C 07 00 2C 45 07 00 64 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 2C 01 01 01 45 07 00 22 00 40 07 00 2C 41 07 00 22 43 05 44 07 00 22 47 05 47 07 00 22
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     110    118    Any
        //  110    118    110    118    Ljava/lang/NullPointerException;
        //  126    128    3      8      Any
        //  31     38     38     39     Any
        //  31     38     31     32     Ljava/lang/NumberFormatException;
        //  32     38     3      8      Any
        //  32     38     31     32     Ljava/lang/IllegalStateException;
        //  31     38     3      8      Any
        //  90     97     97     98     Any
        //  91     97     97     98     Any
        //  90     97     90     91     Ljava/lang/UnsupportedOperationException;
        //  91     97     97     98     Any
        //  91     97     97     98     Any
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
        throw t;
    }
    
    public f42() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: ifge            12
        //     7: ldc             -630366551
        //     9: goto            14
        //    12: ldc             1508034053
        //    14: ldc             -418236680
        //    16: ixor           
        //    17: lookupswitch {
        //          -1091505923: 44
        //          1031759953: 12
        //          default: 358
        //        }
        //    44: invokespecial   dev/nuker/pyro/f3z.<init>:()V
        //    47: aload_0        
        //    48: bipush          120
        //    50: getstatic       dev/nuker/pyro/fc.c:I
        //    53: ifge            61
        //    56: ldc             1408303157
        //    58: goto            63
        //    61: ldc             1687218547
        //    63: ldc             711475295
        //    65: ixor           
        //    66: lookupswitch {
        //          1324919084: 92
        //          2040086634: 61
        //          default: 348
        //        }
        //    92: putfield        dev/nuker/pyro/f42.c:I
        //    95: aload_0        
        //    96: getfield        dev/nuker/pyro/f42.c:Ljava/util/ArrayList;
        //    99: new             Ldev/nuker/pyro/f3E;
        //   102: dup            
        //   103: ldc             "\u238f\u149c\u8ab0\ub3db\uc9e2\uedbe"
        //   105: getstatic       dev/nuker/pyro/fc.1:I
        //   108: ifeq            116
        //   111: ldc             2014155317
        //   113: goto            118
        //   116: ldc             -56389679
        //   118: ldc             2056762321
        //   120: ixor           
        //   121: lookupswitch {
        //          -2043397120: 148
        //          43655652: 116
        //          default: 356
        //        }
        //   148: invokestatic    invokestatic   !!! ERROR
        //   151: aload_0        
        //   152: invokevirtual   dev/nuker/pyro/f42.c:()I
        //   155: i2f            
        //   156: ldc             10.0
        //   158: invokespecial   dev/nuker/pyro/f3E.<init>:(Ljava/lang/String;FF)V
        //   161: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   164: pop            
        //   165: aload_0        
        //   166: getstatic       dev/nuker/pyro/fc.0:I
        //   169: ifeq            177
        //   172: ldc             -1592286597
        //   174: goto            179
        //   177: ldc             -1087253934
        //   179: ldc             -1417945264
        //   181: ixor           
        //   182: lookupswitch {
        //          -1456515084: 177
        //          174882091: 350
        //          default: 208
        //        }
        //   208: getfield        dev/nuker/pyro/f42.c:Ljava/util/ArrayList;
        //   211: new             Ldev/nuker/pyro/f3E;
        //   214: dup            
        //   215: ldc             "\u238b\u1496\u8ab3\ub3dc\uc9f1\uedab\ub228"
        //   217: invokestatic    invokestatic   !!! ERROR
        //   220: aload_0        
        //   221: getstatic       dev/nuker/pyro/fc.0:I
        //   224: ifeq            232
        //   227: ldc             330174399
        //   229: goto            234
        //   232: ldc             -512629705
        //   234: ldc             211171741
        //   236: ixor           
        //   237: lookupswitch {
        //          -373526278: 232
        //          523777570: 352
        //          default: 264
        //        }
        //   264: invokevirtual   dev/nuker/pyro/f42.c:()I
        //   267: i2f            
        //   268: ldc             10.0
        //   270: invokespecial   dev/nuker/pyro/f3E.<init>:(Ljava/lang/String;FF)V
        //   273: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   276: pop            
        //   277: getstatic       dev/nuker/pyro/fc.c:I
        //   280: ifge            288
        //   283: ldc             578060906
        //   285: goto            290
        //   288: ldc             97019571
        //   290: ldc             1120721527
        //   292: ixor           
        //   293: lookupswitch {
        //          1191492804: 320
        //          1622693917: 288
        //          default: 354
        //        }
        //   320: aload_0        
        //   321: getfield        dev/nuker/pyro/f42.c:Ljava/util/ArrayList;
        //   324: new             Ldev/nuker/pyro/f3E;
        //   327: dup            
        //   328: ldc             "\u2381\u149a\u8aae\ub3da"
        //   330: invokestatic    invokestatic   !!! ERROR
        //   333: aload_0        
        //   334: invokevirtual   dev/nuker/pyro/f42.c:()I
        //   337: i2f            
        //   338: ldc             10.0
        //   340: invokespecial   dev/nuker/pyro/f3E.<init>:(Ljava/lang/String;FF)V
        //   343: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   346: pop            
        //   347: return         
        //   348: aconst_null    
        //   349: athrow         
        //   350: aconst_null    
        //   351: athrow         
        //   352: aconst_null    
        //   353: athrow         
        //   354: aconst_null    
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //   358: aconst_null    
        //   359: athrow         
        //    StackMapTable: 00 18 4C 06 FF 00 01 00 01 06 00 02 06 01 5D 06 FF 00 10 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 01 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 01 FF 00 17 00 01 07 00 03 00 04 07 00 8E 08 00 63 08 00 63 07 00 A1 FF 00 01 00 01 07 00 03 00 05 07 00 8E 08 00 63 08 00 63 07 00 A1 01 FF 00 1D 00 01 07 00 03 00 04 07 00 8E 08 00 63 08 00 63 07 00 A1 5C 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 17 00 01 07 00 03 00 05 07 00 8E 08 00 D3 08 00 D3 07 00 A1 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 8E 08 00 D3 08 00 D3 07 00 A1 07 00 03 01 FF 00 1D 00 01 07 00 03 00 05 07 00 8E 08 00 D3 08 00 D3 07 00 A1 07 00 03 17 41 01 1D FF 00 1B 00 01 07 00 03 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 8E 08 00 D3 08 00 D3 07 00 A1 07 00 03 01 FF 00 01 00 01 07 00 03 00 04 07 00 8E 08 00 63 08 00 63 07 00 A1 FF 00 01 00 01 06 00 01 06
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
}
