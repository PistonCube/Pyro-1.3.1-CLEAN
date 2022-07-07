// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import com.google.gson.JsonObject;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class fS
{
    public float c;
    public float 0;
    public float 1;
    public float 2;
    @NotNull
    public static fS c;
    public static fR c;
    
    public float 1() {
        return fbS.ay(this, 829889332);
    }
    
    public void 1(final float n) {
        fbS.8B(this, 1918186420, n);
    }
    
    public float 8() {
        return fbS.ak(this, 1598901678);
    }
    
    @NotNull
    public Color 7() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          76
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            68
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            60
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //    27: aload_0        
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   dev/nuker/pyro/fS.a:()[F
        //    35: goto            39
        //    38: athrow         
        //    39: goto            43
        //    42: athrow         
        //    43: invokevirtual   dev/nuker/pyro/fR.c:([F)Ljava/awt/Color;
        //    46: goto            50
        //    49: athrow         
        //    50: areturn        
        //    51: pop            
        //    52: goto            24
        //    55: pop            
        //    56: aconst_null    
        //    57: goto            51
        //    60: dup            
        //    61: ifnull          51
        //    64: checkcast       Ljava/lang/Throwable;
        //    67: athrow         
        //    68: dup            
        //    69: ifnull          55
        //    72: checkcast       Ljava/lang/Throwable;
        //    75: athrow         
        //    76: aconst_null    
        //    77: athrow         
        //    StackMapTable: 00 11 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FC 00 03 07 00 03 46 07 00 2F FF 00 00 00 01 07 00 03 00 02 07 00 37 07 00 03 45 07 00 2F FF 00 00 00 01 07 00 03 00 02 07 00 37 07 00 3C 42 07 00 2F FF 00 00 00 01 07 00 03 00 02 07 00 37 07 00 3C 45 07 00 2F 40 07 00 3E 40 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      20     60     68     Ljava/lang/ArithmeticException;
        //  60     68     60     68     Any
        //  76     78     3      8      Any
        //  31     38     38     39     Any
        //  32     38     31     32     Ljava/util/NoSuchElementException;
        //  32     38     38     39     Ljava/lang/ArithmeticException;
        //  32     38     3      8      Ljava/lang/RuntimeException;
        //  32     38     31     32     Any
        //  42     49     49     50     Any
        //  43     49     3      8      Any
        //  43     49     3      8      Any
        //  42     49     42     43     Any
        //  43     49     42     43     Any
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
    
    public boolean d() {
        return fbS.e7(this, 1335212816);
    }
    
    public void 2(final float n) {
        fbS.8l(this, 1369883713, n);
    }
    
    public float e() {
        return fbS.aX(this, 750166733);
    }
    
    public void 6(final float n) {
        fbS.8a(this, 2005499923, n);
    }
    
    @NotNull
    public float[] 0(final int n) {
        return fbS.5T(this, 404489787, n);
    }
    
    public float b() {
        return fbS.aZ(this, 1706973290);
    }
    
    public fS(@NotNull final float[] array) {
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.0 != 0) {
                    n = -101308955;
                    break Label_0016;
                }
                n = 535268285;
            }
            switch (n ^ 0xDB3AA831) {
                case 2487532: {
                    continue;
                }
                default: {
                    final float n2 = array[0];
                    while (true) {
                        int n3 = 0;
                        Label_0060: {
                            if (fc.c < 0) {
                                n3 = -735154531;
                                break Label_0060;
                            }
                            n3 = -1099614084;
                        }
                        switch (n3 ^ 0xCD3095DF) {
                            case -1564642715: {
                                continue;
                            }
                            default: {
                                this(n2, array[1], array[2], array[3]);
                                return;
                            }
                            case 421460802: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 583830996: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static fS g() {
        return fbS.9A(null, 112578855);
    }
    
    public float 2() {
        return fbS.au(this, 2132644653);
    }
    
    public float f() {
        return fbS.al(this, 2057050125);
    }
    
    public void 0(final float n) {
        fbS.8e(this, 1252700581, n);
    }
    
    public void c(final float n) {
        fbS.86(this, 1880890574, n);
    }
    
    @NotNull
    public Color c(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          122
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            114
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            106
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //    27: aload_0        
        //    28: iload_1        
        //    29: getstatic       dev/nuker/pyro/fc.c:I
        //    32: ifge            40
        //    35: ldc             -952063009
        //    37: goto            42
        //    40: ldc             319914323
        //    42: ldc             -401602078
        //    44: ixor           
        //    45: lookupswitch {
        //          -841397221: 40
        //          793813565: 95
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/fS.0:(I)[F
        //    79: goto            83
        //    82: athrow         
        //    83: goto            87
        //    86: athrow         
        //    87: invokevirtual   dev/nuker/pyro/fR.c:([F)Ljava/awt/Color;
        //    90: goto            94
        //    93: athrow         
        //    94: areturn        
        //    95: aconst_null    
        //    96: athrow         
        //    97: pop            
        //    98: goto            24
        //   101: pop            
        //   102: aconst_null    
        //   103: goto            97
        //   106: dup            
        //   107: ifnull          97
        //   110: checkcast       Ljava/lang/Throwable;
        //   113: athrow         
        //   114: dup            
        //   115: ifnull          101
        //   118: checkcast       Ljava/lang/Throwable;
        //   121: athrow         
        //   122: aconst_null    
        //   123: athrow         
        //    StackMapTable: 00 15 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FD 00 03 07 00 03 01 FF 00 0F 00 02 07 00 03 01 00 03 07 00 37 07 00 03 01 FF 00 01 00 02 07 00 03 01 00 04 07 00 37 07 00 03 01 01 FF 00 1D 00 02 07 00 03 01 00 03 07 00 37 07 00 03 01 FF 00 02 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 01 00 03 07 00 37 07 00 03 01 45 07 00 2F FF 00 00 00 02 07 00 03 01 00 02 07 00 37 07 00 3C 42 07 00 2F FF 00 00 00 02 07 00 03 01 00 02 07 00 37 07 00 3C 45 07 00 2F 40 07 00 3E FF 00 00 00 02 07 00 03 01 00 03 07 00 37 07 00 03 01 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     106    114    Ljava/lang/StringIndexOutOfBoundsException;
        //  106    114    106    114    Ljava/util/ConcurrentModificationException;
        //  122    124    3      8      Any
        //  76     82     82     83     Any
        //  76     82     3      8      Any
        //  76     82     3      8      Any
        //  76     82     3      8      Any
        //  76     82     3      8      Ljava/lang/NumberFormatException;
        //  86     93     93     94     Any
        //  87     93     86     87     Any
        //  86     93     86     87     Any
        //  86     93     3      8      Ljava/lang/ArithmeticException;
        //  87     93     93     94     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 48 out of bounds for length 48
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    @NotNull
    public float[] c() {
        return fbS.k(this, 2034803339);
    }
    
    @NotNull
    public float[] a() {
        return fbS.l(this, 1153894915);
    }
    
    public void 7(final float n) {
        fbS.8A(this, 1945086106, n);
    }
    
    public void 4(final float n) {
        fbS.8t(this, 1881541686, n);
    }
    
    @NotNull
    public fS 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          260
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            252
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            244
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/fS;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            39
        //    34: ldc             1425630110
        //    36: goto            41
        //    39: ldc             -377837831
        //    41: ldc             1777559712
        //    43: ixor           
        //    44: lookupswitch {
        //          -2138452391: 72
        //          1024068414: 39
        //          default: 227
        //        }
        //    72: aload_0        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            84
        //    79: ldc             -1752572647
        //    81: goto            86
        //    84: ldc             -711540378
        //    86: ldc             -1723012058
        //    88: ixor           
        //    89: lookupswitch {
        //          247804223: 84
        //          1289366848: 116
        //          default: 229
        //        }
        //   116: getfield        dev/nuker/pyro/fS.c:F
        //   119: aload_0        
        //   120: getfield        dev/nuker/pyro/fS.0:F
        //   123: getstatic       dev/nuker/pyro/fc.c:I
        //   126: ifge            134
        //   129: ldc             1164409015
        //   131: goto            136
        //   134: ldc             -580630920
        //   136: ldc             852283225
        //   138: ixor           
        //   139: lookupswitch {
        //          -274167519: 164
        //          2007742446: 134
        //          default: 231
        //        }
        //   164: aload_0        
        //   165: getstatic       dev/nuker/pyro/fc.0:I
        //   168: ifeq            176
        //   171: ldc             1706541066
        //   173: goto            178
        //   176: ldc             -1882227931
        //   178: ldc             -1892815905
        //   180: ixor           
        //   181: lookupswitch {
        //          -358994987: 176
        //          14848250: 208
        //          default: 233
        //        }
        //   208: getfield        dev/nuker/pyro/fS.1:F
        //   211: aload_0        
        //   212: getfield        dev/nuker/pyro/fS.2:F
        //   215: goto            219
        //   218: athrow         
        //   219: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   222: goto            226
        //   225: athrow         
        //   226: areturn        
        //   227: aconst_null    
        //   228: athrow         
        //   229: aconst_null    
        //   230: athrow         
        //   231: aconst_null    
        //   232: athrow         
        //   233: aconst_null    
        //   234: athrow         
        //   235: pop            
        //   236: goto            24
        //   239: pop            
        //   240: aconst_null    
        //   241: goto            235
        //   244: dup            
        //   245: ifnull          235
        //   248: checkcast       Ljava/lang/Throwable;
        //   251: athrow         
        //   252: dup            
        //   253: ifnull          239
        //   256: checkcast       Ljava/lang/Throwable;
        //   259: athrow         
        //   260: aconst_null    
        //   261: athrow         
        //    StackMapTable: 00 1D 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 0B 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 11 00 01 07 00 03 00 04 08 00 18 08 00 18 02 02 FF 00 01 00 01 07 00 03 00 05 08 00 18 08 00 18 02 02 01 FF 00 1B 00 01 07 00 03 00 04 08 00 18 08 00 18 02 02 FF 00 0B 00 01 07 00 03 00 05 08 00 18 08 00 18 02 02 07 00 03 FF 00 01 00 01 07 00 03 00 06 08 00 18 08 00 18 02 02 07 00 03 01 FF 00 1D 00 01 07 00 03 00 05 08 00 18 08 00 18 02 02 07 00 03 49 07 00 2F FF 00 00 00 01 07 00 03 00 06 08 00 18 08 00 18 02 02 02 02 45 07 00 2F 40 07 00 03 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 02 02 FF 00 01 00 01 07 00 03 00 05 08 00 18 08 00 18 02 02 07 00 03 41 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     244    252    Any
        //  244    252    244    252    Ljava/lang/ClassCastException;
        //  260    262    3      8      Any
        //  218    225    225    226    Any
        //  219    225    218    219    Any
        //  219    225    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  219    225    218    219    Any
        //  218    225    3      8      Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 71 out of bounds for length 71
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        while (true) {
            int n = 0;
            Label_0018: {
                if (fc.c < 0) {
                    n = 346953038;
                    break Label_0018;
                }
                n = -1544022982;
            }
            switch (n ^ 0xE0DE7C70) {
                case -193959618: {
                    continue;
                }
                case 1126590538: {
                    fS.c = new fR(defaultConstructorMarker);
                    final fS c = new fS(0, 0, 0, 0);
                    while (true) {
                        int n2 = 0;
                        Label_0078: {
                            if (fc.c < 0) {
                                n2 = 1339939569;
                                break Label_0078;
                            }
                            n2 = 1963552746;
                        }
                        switch (n2 ^ 0x64B0BE36) {
                            case 1270279387: {
                                continue;
                            }
                            default: {
                                fS.c = c;
                                return;
                            }
                            case 728589511: {
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
    
    public void 3(final float n) {
        fbS.8b(this, 642238468, n);
    }
    
    public float 6() {
        return fbS.as(this, 922655147);
    }
    
    public fS(final int n, final int n2, final int n3, final int n4) {
        while (true) {
            int n5 = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n5 = 1613443821;
                    break Label_0013;
                }
                n5 = 903073144;
            }
            switch (n5 ^ 0x5AA92CDB) {
                case 1573722910: {
                    continue;
                }
                default: {
                    final float n6 = n / 255.0f;
                    final float n7 = n2 / 255.0f;
                    while (true) {
                        int n8 = 0;
                        Label_0068: {
                            if (fc.0 != 0) {
                                n8 = -132361914;
                                break Label_0068;
                            }
                            n8 = 1653781500;
                        }
                        switch (n8 ^ 0x3421E57D) {
                            case -868371397: {
                                continue;
                            }
                            case 1454593665: {
                                final float n9 = n3 / 255.0f;
                                while (true) {
                                    int n10 = 0;
                                    Label_0114: {
                                        if (fc.c < 0) {
                                            n10 = 2083138168;
                                            break Label_0114;
                                        }
                                        n10 = -740190896;
                                    }
                                    switch (n10 ^ 0x64F3CD71) {
                                        case 192818423: {
                                            continue;
                                        }
                                        default: {
                                            this(n6, n7, n9, n4 / 255.0f);
                                            return;
                                        }
                                        case 416933641: {
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
                case 981605942: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public float 9() {
        return fbS.aH(this, 1426977954);
    }
    
    public float 1(final int n) {
        return fbS.5p(this, 1856764462, n);
    }
    
    public int 5() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          73
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            65
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            57
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/fS.7:()Ljava/awt/Color;
        //    32: goto            36
        //    35: athrow         
        //    36: goto            40
        //    39: athrow         
        //    40: invokevirtual   java/awt/Color.getRGB:()I
        //    43: goto            47
        //    46: athrow         
        //    47: ireturn        
        //    48: pop            
        //    49: goto            24
        //    52: pop            
        //    53: aconst_null    
        //    54: goto            48
        //    57: dup            
        //    58: ifnull          48
        //    61: checkcast       Ljava/lang/Throwable;
        //    64: athrow         
        //    65: dup            
        //    66: ifnull          52
        //    69: checkcast       Ljava/lang/Throwable;
        //    72: athrow         
        //    73: aconst_null    
        //    74: athrow         
        //    StackMapTable: 00 11 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FC 00 03 07 00 03 43 07 00 2F 40 07 00 03 45 07 00 2F 40 07 00 3E 42 07 00 2F 40 07 00 3E 45 07 00 2F 40 01 40 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     57     65     Any
        //  57     65     57     65     Any
        //  73     75     3      8      Any
        //  28     35     35     36     Any
        //  29     35     28     29     Any
        //  28     35     3      8      Any
        //  28     35     3      8      Any
        //  29     35     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  39     46     46     47     Any
        //  39     46     39     40     Ljava/lang/IndexOutOfBoundsException;
        //  39     46     46     47     Any
        //  39     46     3      8      Any
        //  40     46     39     40     Any
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
    
    public float 4() {
        return fbS.aq(this, 1510677988);
    }
    
    public void 5(final float n) {
        fbS.87(this, 337536310, n);
    }
    
    @NotNull
    public JsonObject 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          552
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            544
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            536
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: astore_1       
        //    40: aload_1        
        //    41: ldc_w           "\u10f1\u1486\ub995\ub1a7"
        //    44: goto            48
        //    47: athrow         
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: goto            55
        //    54: athrow         
        //    55: new             Lcom/google/gson/JsonPrimitive;
        //    58: dup            
        //    59: getstatic       dev/nuker/pyro/fc.c:I
        //    62: ifge            71
        //    65: ldc_w           -1090553662
        //    68: goto            74
        //    71: ldc_w           -1663802890
        //    74: ldc_w           -387744037
        //    77: ixor           
        //    78: lookupswitch {
        //          -7085471: 71
        //          1444677145: 519
        //          default: 104
        //        }
        //   104: aload_0        
        //   105: getstatic       dev/nuker/pyro/fc.0:I
        //   108: ifeq            117
        //   111: ldc_w           753736305
        //   114: goto            120
        //   117: ldc_w           -1274278383
        //   120: ldc_w           -591368811
        //   123: ixor           
        //   124: lookupswitch {
        //          -265455644: 117
        //          1758225284: 152
        //          default: 521
        //        }
        //   152: getfield        dev/nuker/pyro/fS.c:F
        //   155: goto            159
        //   158: athrow         
        //   159: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   162: goto            166
        //   165: athrow         
        //   166: checkcast       Ljava/lang/Number;
        //   169: goto            173
        //   172: athrow         
        //   173: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   176: goto            180
        //   179: athrow         
        //   180: checkcast       Lcom/google/gson/JsonElement;
        //   183: goto            187
        //   186: athrow         
        //   187: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   190: goto            194
        //   193: athrow         
        //   194: aload_1        
        //   195: ldc_w           "\u10ea\u1492\ub984\ub18d\ufd07\udefe\ub230\ud5b4\udb26\udd68"
        //   198: goto            202
        //   201: athrow         
        //   202: invokestatic    invokestatic   !!! ERROR
        //   205: goto            209
        //   208: athrow         
        //   209: new             Lcom/google/gson/JsonPrimitive;
        //   212: dup            
        //   213: aload_0        
        //   214: getfield        dev/nuker/pyro/fS.0:F
        //   217: goto            221
        //   220: athrow         
        //   221: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   224: goto            228
        //   227: athrow         
        //   228: checkcast       Ljava/lang/Number;
        //   231: goto            235
        //   234: athrow         
        //   235: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   238: goto            242
        //   241: athrow         
        //   242: checkcast       Lcom/google/gson/JsonElement;
        //   245: goto            249
        //   248: athrow         
        //   249: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   252: goto            256
        //   255: athrow         
        //   256: aload_1        
        //   257: ldc_w           "\u10ef\u1492\ub99c\ub18d\ufd10"
        //   260: getstatic       dev/nuker/pyro/fc.c:I
        //   263: ifge            272
        //   266: ldc_w           664289756
        //   269: goto            275
        //   272: ldc_w           2054727414
        //   275: ldc_w           722407237
        //   278: ixor           
        //   279: lookupswitch {
        //          211242649: 272
        //          1366796723: 304
        //          default: 525
        //        }
        //   304: goto            308
        //   307: athrow         
        //   308: invokestatic    invokestatic   !!! ERROR
        //   311: goto            315
        //   314: athrow         
        //   315: new             Lcom/google/gson/JsonPrimitive;
        //   318: dup            
        //   319: aload_0        
        //   320: getfield        dev/nuker/pyro/fS.1:F
        //   323: goto            327
        //   326: athrow         
        //   327: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   330: goto            334
        //   333: athrow         
        //   334: checkcast       Ljava/lang/Number;
        //   337: goto            341
        //   340: athrow         
        //   341: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   344: goto            348
        //   347: athrow         
        //   348: checkcast       Lcom/google/gson/JsonElement;
        //   351: goto            355
        //   354: athrow         
        //   355: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   358: goto            362
        //   361: athrow         
        //   362: getstatic       dev/nuker/pyro/fc.1:I
        //   365: ifeq            374
        //   368: ldc_w           -1925913726
        //   371: goto            377
        //   374: ldc_w           493822003
        //   377: ldc_w           -2074397166
        //   380: ixor           
        //   381: lookupswitch {
        //          -1724639711: 408
        //          158324112: 374
        //          default: 517
        //        }
        //   408: aload_1        
        //   409: ldc_w           "\u10f8\u149f\ub980\ub190\ufd14"
        //   412: goto            416
        //   415: athrow         
        //   416: invokestatic    invokestatic   !!! ERROR
        //   419: goto            423
        //   422: athrow         
        //   423: new             Lcom/google/gson/JsonPrimitive;
        //   426: dup            
        //   427: getstatic       dev/nuker/pyro/fc.0:I
        //   430: ifeq            439
        //   433: ldc_w           1836130423
        //   436: goto            442
        //   439: ldc_w           1108002444
        //   442: ldc_w           -1819067615
        //   445: ixor           
        //   446: lookupswitch {
        //          -778437203: 472
        //          -18736298: 439
        //          default: 523
        //        }
        //   472: aload_0        
        //   473: getfield        dev/nuker/pyro/fS.2:F
        //   476: goto            480
        //   479: athrow         
        //   480: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   483: goto            487
        //   486: athrow         
        //   487: checkcast       Ljava/lang/Number;
        //   490: goto            494
        //   493: athrow         
        //   494: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   497: goto            501
        //   500: athrow         
        //   501: checkcast       Lcom/google/gson/JsonElement;
        //   504: goto            508
        //   507: athrow         
        //   508: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   511: goto            515
        //   514: athrow         
        //   515: aload_1        
        //   516: areturn        
        //   517: aconst_null    
        //   518: athrow         
        //   519: aconst_null    
        //   520: athrow         
        //   521: aconst_null    
        //   522: athrow         
        //   523: aconst_null    
        //   524: athrow         
        //   525: aconst_null    
        //   526: athrow         
        //   527: pop            
        //   528: goto            24
        //   531: pop            
        //   532: aconst_null    
        //   533: goto            527
        //   536: dup            
        //   537: ifnull          527
        //   540: checkcast       Ljava/lang/Throwable;
        //   543: athrow         
        //   544: dup            
        //   545: ifnull          531
        //   548: checkcast       Ljava/lang/Throwable;
        //   551: athrow         
        //   552: aconst_null    
        //   553: athrow         
        //    StackMapTable: 00 61 FF 00 03 00 02 07 00 03 07 01 0B 00 01 07 00 2F FA 00 04 FF 00 0B 00 00 00 01 07 00 2F FC 00 03 07 00 03 46 07 00 2F FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 2F 40 07 01 0B FF 00 07 00 02 07 00 03 07 01 0B 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E FF 00 0F 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 00 37 08 00 37 FF 00 02 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 01 FF 00 1D 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 00 37 08 00 37 FF 00 0C 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 07 00 03 FF 00 02 00 02 07 00 03 07 01 0B 00 06 07 01 0B 07 01 3E 08 00 37 08 00 37 07 00 03 01 FF 00 1F 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 07 00 03 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 02 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 07 01 1E 45 07 00 AB FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 07 01 24 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 16 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 29 45 07 00 2F 00 FF 00 06 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 4A 07 00 26 FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 D1 08 00 D1 02 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 D1 08 00 D1 07 01 1E FF 00 05 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 D1 08 00 D1 07 01 24 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 16 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 29 45 07 00 2F 00 FF 00 0F 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E FF 00 02 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 01 FF 00 1C 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 42 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E FF 00 0A 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 3B 08 01 3B 02 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 3B 08 01 3B 07 01 1E FF 00 05 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 3B 08 01 3B 07 01 24 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 16 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 29 45 07 00 2F 00 0B 42 01 1E 46 07 01 09 FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E FF 00 0F 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 01 A7 08 01 A7 FF 00 02 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 A7 08 01 A7 01 FF 00 1D 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 01 A7 08 01 A7 FF 00 06 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 A7 08 01 A7 02 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 A7 08 01 A7 07 01 1E 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 01 A7 08 01 A7 07 01 24 45 07 00 2F FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 16 45 07 00 28 FF 00 00 00 02 07 00 03 07 01 0B 00 03 07 01 0B 07 01 3E 07 01 29 45 07 00 2F 00 01 FF 00 01 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 00 37 08 00 37 FF 00 01 00 02 07 00 03 07 01 0B 00 05 07 01 0B 07 01 3E 08 00 37 08 00 37 07 00 03 FF 00 01 00 02 07 00 03 07 01 0B 00 04 07 01 0B 07 01 3E 08 01 A7 08 01 A7 FF 00 01 00 02 07 00 03 07 01 0B 00 02 07 01 0B 07 01 3E FF 00 01 00 01 07 00 03 00 01 07 00 2F 43 05 44 07 00 2F 47 05 FF 00 07 00 02 07 00 03 07 01 0B 00 01 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     536    544    Ljava/lang/NullPointerException;
        //  536    544    536    544    Any
        //  552    554    3      8      Ljava/lang/IllegalArgumentException;
        //  31     38     38     39     Any
        //  32     38     38     39     Ljava/lang/NullPointerException;
        //  31     38     31     32     Ljava/lang/ArithmeticException;
        //  31     38     31     32     Any
        //  31     38     38     39     Ljava/lang/RuntimeException;
        //  47     54     54     55     Any
        //  48     54     3      8      Any
        //  47     54     47     48     Any
        //  48     54     47     48     Any
        //  48     54     47     48     Any
        //  158    165    165    166    Any
        //  159    165    165    166    Ljava/lang/NegativeArraySizeException;
        //  159    165    158    159    Ljava/lang/ArithmeticException;
        //  158    165    158    159    Ljava/lang/AssertionError;
        //  158    165    158    159    Ljava/util/NoSuchElementException;
        //  172    179    179    180    Any
        //  173    179    3      8      Ljava/util/NoSuchElementException;
        //  172    179    3      8      Any
        //  172    179    172    173    Ljava/lang/IllegalStateException;
        //  172    179    179    180    Any
        //  186    193    193    194    Any
        //  186    193    3      8      Ljava/lang/RuntimeException;
        //  187    193    186    187    Any
        //  186    193    3      8      Ljava/lang/UnsupportedOperationException;
        //  186    193    186    187    Ljava/lang/StringIndexOutOfBoundsException;
        //  202    208    208    209    Any
        //  202    208    3      8      Any
        //  202    208    208    209    Ljava/lang/UnsupportedOperationException;
        //  202    208    3      8      Any
        //  202    208    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  220    227    227    228    Any
        //  221    227    220    221    Ljava/util/NoSuchElementException;
        //  221    227    3      8      Ljava/lang/UnsupportedOperationException;
        //  221    227    3      8      Ljava/lang/UnsupportedOperationException;
        //  221    227    227    228    Ljava/util/NoSuchElementException;
        //  235    241    241    242    Any
        //  235    241    3      8      Ljava/util/ConcurrentModificationException;
        //  235    241    3      8      Ljava/lang/NumberFormatException;
        //  235    241    3      8      Any
        //  235    241    3      8      Ljava/lang/UnsupportedOperationException;
        //  248    255    255    256    Any
        //  249    255    248    249    Any
        //  248    255    255    256    Any
        //  249    255    3      8      Any
        //  248    255    255    256    Ljava/lang/IllegalStateException;
        //  307    314    314    315    Any
        //  308    314    314    315    Ljava/lang/NegativeArraySizeException;
        //  307    314    307    308    Ljava/lang/ClassCastException;
        //  307    314    3      8      Any
        //  308    314    307    308    Ljava/lang/AssertionError;
        //  327    333    333    334    Any
        //  327    333    333    334    Any
        //  327    333    3      8      Any
        //  327    333    3      8      Ljava/lang/NumberFormatException;
        //  327    333    333    334    Ljava/lang/ArithmeticException;
        //  341    347    347    348    Any
        //  341    347    347    348    Any
        //  341    347    3      8      Any
        //  341    347    347    348    Ljava/lang/ArithmeticException;
        //  341    347    347    348    Any
        //  354    361    361    362    Any
        //  355    361    361    362    Any
        //  355    361    354    355    Any
        //  355    361    3      8      Ljava/lang/ArithmeticException;
        //  355    361    361    362    Any
        //  415    422    422    423    Any
        //  415    422    3      8      Any
        //  416    422    415    416    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  415    422    422    423    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  416    422    422    423    Ljava/lang/NullPointerException;
        //  480    486    486    487    Any
        //  480    486    486    487    Ljava/lang/AssertionError;
        //  480    486    486    487    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  480    486    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  480    486    3      8      Any
        //  493    500    500    501    Any
        //  493    500    500    501    Any
        //  493    500    500    501    Ljava/lang/EnumConstantNotPresentException;
        //  494    500    3      8      Any
        //  493    500    493    494    Any
        //  507    514    514    515    Any
        //  508    514    514    515    Ljava/lang/NullPointerException;
        //  507    514    507    508    Ljava/lang/NumberFormatException;
        //  507    514    507    508    Ljava/util/ConcurrentModificationException;
        //  508    514    3      8      Ljava/lang/RuntimeException;
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
    
    public fS(final float c, final float 0, final float 2, final float 3) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.1 != 0) {
                    n = -393390485;
                    break Label_0015;
                }
                n = -625179318;
            }
            switch (n ^ 0xD581C91D) {
                case -1563040833: {
                    continue;
                }
                default: {
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0068: {
                            if (fc.0 != 0) {
                                n2 = 1151834718;
                                break Label_0068;
                            }
                            n2 = 1472495790;
                        }
                        switch (n2 ^ 0xBFC3CC5) {
                            case 1542091183: {
                                continue;
                            }
                            default: {
                                this.0 = 0;
                                this.1 = 2;
                                while (true) {
                                    int n3 = 0;
                                    Label_0128: {
                                        if (fc.c < 0) {
                                            n3 = 719380121;
                                            break Label_0128;
                                        }
                                        n3 = 418099045;
                                    }
                                    switch (n3 ^ 0x5011841E) {
                                        case 2062637703: {
                                            continue;
                                        }
                                        case 1224354683: {
                                            this.2 = 3;
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
                            case 1331406491: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1024237430: {
                    throw null;
                }
            }
            break;
        }
    }
}
