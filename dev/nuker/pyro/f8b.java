// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec2f;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;

public class f8b
{
    @NotNull
    public BlockPos c;
    @NotNull
    public BlockPos 0;
    @NotNull
    public f8v c;
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          265
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            257
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            249
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f8b.c:Lnet/minecraft/util/math/BlockPos;
        //    28: dup            
        //    29: ifnull          46
        //    32: goto            36
        //    35: athrow         
        //    36: invokevirtual   java/lang/Object.hashCode:()I
        //    39: goto            43
        //    42: athrow         
        //    43: goto            48
        //    46: pop            
        //    47: iconst_0       
        //    48: bipush          31
        //    50: imul           
        //    51: aload_0        
        //    52: getstatic       dev/nuker/pyro/fc.1:I
        //    55: ifeq            63
        //    58: ldc             -30646790
        //    60: goto            65
        //    63: ldc             -1386724899
        //    65: ldc             -657203869
        //    67: ixor           
        //    68: lookupswitch {
        //          654278809: 63
        //          1972083902: 96
        //          default: 238
        //        }
        //    96: getfield        dev/nuker/pyro/f8b.0:Lnet/minecraft/util/math/BlockPos;
        //    99: dup            
        //   100: ifnull          158
        //   103: getstatic       dev/nuker/pyro/fc.c:I
        //   106: ifge            114
        //   109: ldc             1134689398
        //   111: goto            116
        //   114: ldc             -1599859886
        //   116: ldc             -1744065063
        //   118: ixor           
        //   119: lookupswitch {
        //          -609594961: 114
        //          951041675: 144
        //          default: 234
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   java/lang/Object.hashCode:()I
        //   151: goto            155
        //   154: athrow         
        //   155: goto            160
        //   158: pop            
        //   159: iconst_0       
        //   160: iadd           
        //   161: bipush          31
        //   163: imul           
        //   164: aload_0        
        //   165: getfield        dev/nuker/pyro/f8b.c:Ldev/nuker/pyro/f8v;
        //   168: dup            
        //   169: ifnull          230
        //   172: getstatic       dev/nuker/pyro/fc.c:I
        //   175: ifge            183
        //   178: ldc             -1227139585
        //   180: goto            185
        //   183: ldc             -1558979936
        //   185: ldc             2020355964
        //   187: ixor           
        //   188: lookupswitch {
        //          -826836349: 236
        //          1129390872: 183
        //          default: 216
        //        }
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   java/lang/Object.hashCode:()I
        //   223: goto            227
        //   226: athrow         
        //   227: goto            232
        //   230: pop            
        //   231: iconst_0       
        //   232: iadd           
        //   233: ireturn        
        //   234: aconst_null    
        //   235: athrow         
        //   236: aconst_null    
        //   237: athrow         
        //   238: aconst_null    
        //   239: athrow         
        //   240: pop            
        //   241: goto            24
        //   244: pop            
        //   245: aconst_null    
        //   246: goto            240
        //   249: dup            
        //   250: ifnull          240
        //   253: checkcast       Ljava/lang/Throwable;
        //   256: athrow         
        //   257: dup            
        //   258: ifnull          244
        //   261: checkcast       Ljava/lang/Throwable;
        //   264: athrow         
        //   265: aconst_null    
        //   266: athrow         
        //    StackMapTable: 00 27 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 4A 07 00 0E 40 07 00 39 45 07 00 21 40 01 42 07 00 39 41 01 FF 00 0E 00 01 07 00 03 00 02 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 01 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 01 07 00 03 FF 00 11 00 01 07 00 03 00 02 01 07 00 39 FF 00 01 00 01 07 00 03 00 03 01 07 00 39 01 FF 00 1B 00 01 07 00 03 00 02 01 07 00 39 42 07 00 18 FF 00 00 00 01 07 00 03 00 02 01 07 00 39 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 01 01 FF 00 02 00 01 07 00 03 00 02 01 07 00 39 FF 00 01 00 01 07 00 03 00 02 01 01 FF 00 16 00 01 07 00 03 00 02 01 07 00 3B FF 00 01 00 01 07 00 03 00 03 01 07 00 3B 01 FF 00 1E 00 01 07 00 03 00 02 01 07 00 3B FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 03 00 02 01 07 00 3B 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 01 01 FF 00 02 00 01 07 00 03 00 02 01 07 00 3B FF 00 01 00 01 07 00 03 00 02 01 01 FF 00 01 00 01 07 00 03 00 02 01 07 00 39 FF 00 01 00 01 07 00 03 00 02 01 07 00 3B FF 00 01 00 01 07 00 03 00 02 01 07 00 03 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     249    257    Ljava/lang/RuntimeException;
        //  249    257    249    257    Ljava/lang/AssertionError;
        //  265    267    3      8      Ljava/lang/NumberFormatException;
        //  35     42     42     43     Any
        //  35     42     3      8      Ljava/lang/NegativeArraySizeException;
        //  35     42     35     36     Ljava/lang/NumberFormatException;
        //  35     42     3      8      Any
        //  36     42     35     36     Ljava/lang/IndexOutOfBoundsException;
        //  147    154    154    155    Any
        //  147    154    147    148    Ljava/lang/UnsupportedOperationException;
        //  147    154    154    155    Ljava/lang/ArithmeticException;
        //  147    154    3      8      Any
        //  148    154    3      8      Ljava/lang/UnsupportedOperationException;
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    3      8      Any
        //  220    226    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0232 (coming from #0227).
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
    public Vec2f 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          142
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            134
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            126
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //    34: goto            38
        //    37: athrow         
        //    38: new             Lnet/minecraft/util/math/Vec3d;
        //    41: dup            
        //    42: aload_0        
        //    43: getfield        dev/nuker/pyro/f8b.0:Lnet/minecraft/util/math/BlockPos;
        //    46: checkcast       Lnet/minecraft/util/math/Vec3i;
        //    49: getstatic       dev/nuker/pyro/fc.0:I
        //    52: ifeq            60
        //    55: ldc             787059
        //    57: goto            62
        //    60: ldc             762772463
        //    62: ldc             1324573673
        //    64: ixor           
        //    65: lookupswitch {
        //          1325359514: 60
        //          1669699590: 92
        //          default: 115
        //        }
        //    92: goto            96
        //    95: athrow         
        //    96: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //    99: goto            103
        //   102: athrow         
        //   103: goto            107
        //   106: athrow         
        //   107: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec2f;
        //   110: goto            114
        //   113: athrow         
        //   114: areturn        
        //   115: aconst_null    
        //   116: athrow         
        //   117: pop            
        //   118: goto            24
        //   121: pop            
        //   122: aconst_null    
        //   123: goto            117
        //   126: dup            
        //   127: ifnull          117
        //   130: checkcast       Ljava/lang/Throwable;
        //   133: athrow         
        //   134: dup            
        //   135: ifnull          121
        //   138: checkcast       Ljava/lang/Throwable;
        //   141: athrow         
        //   142: aconst_null    
        //   143: athrow         
        //    StackMapTable: 00 19 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 45 07 00 0E 40 07 00 4C 45 07 00 21 40 07 00 47 FF 00 15 00 01 07 00 03 00 04 07 00 47 08 00 26 08 00 26 07 00 53 FF 00 01 00 01 07 00 03 00 05 07 00 47 08 00 26 08 00 26 07 00 53 01 FF 00 1D 00 01 07 00 03 00 04 07 00 47 08 00 26 08 00 26 07 00 53 42 07 00 21 FF 00 00 00 01 07 00 03 00 04 07 00 47 08 00 26 08 00 26 07 00 53 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 47 07 00 51 42 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 47 07 00 51 45 07 00 21 40 07 00 5F FF 00 00 00 01 07 00 03 00 04 07 00 47 08 00 26 08 00 26 07 00 53 41 07 00 0E 43 05 44 07 00 0E 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     126    134    Ljava/lang/ArithmeticException;
        //  126    134    126    134    Ljava/lang/IndexOutOfBoundsException;
        //  142    144    3      8      Ljava/lang/ClassCastException;
        //  30     37     37     38     Any
        //  31     37     3      8      Ljava/lang/NegativeArraySizeException;
        //  30     37     3      8      Any
        //  31     37     30     31     Ljava/lang/IllegalArgumentException;
        //  31     37     30     31     Ljava/lang/NegativeArraySizeException;
        //  95     102    102    103    Any
        //  96     102    95     96     Any
        //  95     102    102    103    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  95     102    95     96     Any
        //  96     102    102    103    Any
        //  106    113    113    114    Any
        //  107    113    113    114    Any
        //  106    113    113    114    Ljava/util/NoSuchElementException;
        //  107    113    113    114    Ljava/lang/UnsupportedOperationException;
        //  106    113    106    107    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 57 out of bounds for length 57
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
    public f8b c(@NotNull final BlockPos p0, @NotNull final BlockPos p1, @NotNull final f8v p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          212
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            204
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            196
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -1010861263
        //    32: goto            37
        //    35: ldc             -1145118639
        //    37: ldc             -859192195
        //    39: ixor           
        //    40: lookupswitch {
        //          -627982157: 35
        //          259440460: 181
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_2        
        //    71: pop            
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             -210802964
        //    80: goto            85
        //    83: ldc             -421479904
        //    85: ldc             1817842775
        //    87: ixor           
        //    88: lookupswitch {
        //          -1967477129: 116
        //          -1623887173: 83
        //          default: 183
        //        }
        //   116: aload_3        
        //   117: pop            
        //   118: new             Ldev/nuker/pyro/f8b;
        //   121: dup            
        //   122: aload_1        
        //   123: aload_2        
        //   124: getstatic       dev/nuker/pyro/fc.0:I
        //   127: ifeq            135
        //   130: ldc             -1459135027
        //   132: goto            137
        //   135: ldc             1938679273
        //   137: ldc             2001718995
        //   139: ixor           
        //   140: lookupswitch {
        //          -565669090: 135
        //          79833914: 168
        //          default: 185
        //        }
        //   168: aload_3        
        //   169: goto            173
        //   172: athrow         
        //   173: invokespecial   dev/nuker/pyro/f8b.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Ldev/nuker/pyro/f8v;)V
        //   176: goto            180
        //   179: athrow         
        //   180: areturn        
        //   181: aconst_null    
        //   182: athrow         
        //   183: aconst_null    
        //   184: athrow         
        //   185: aconst_null    
        //   186: athrow         
        //   187: pop            
        //   188: goto            24
        //   191: pop            
        //   192: aconst_null    
        //   193: goto            187
        //   196: dup            
        //   197: ifnull          187
        //   200: checkcast       Ljava/lang/Throwable;
        //   203: athrow         
        //   204: dup            
        //   205: ifnull          191
        //   208: checkcast       Ljava/lang/Throwable;
        //   211: athrow         
        //   212: aconst_null    
        //   213: athrow         
        //    StackMapTable: 00 19 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FF 00 03 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 00 0A 41 01 1E 0E 41 01 1E FF 00 12 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 04 08 00 76 08 00 76 07 00 39 07 00 39 FF 00 01 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 05 08 00 76 08 00 76 07 00 39 07 00 39 01 FF 00 1E 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 04 08 00 76 08 00 76 07 00 39 07 00 39 43 07 00 64 FF 00 00 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 05 08 00 76 08 00 76 07 00 39 07 00 39 07 00 3B 45 07 00 21 40 07 00 03 00 01 FF 00 01 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 00 04 08 00 76 08 00 76 07 00 39 07 00 39 41 07 00 0E 43 05 44 07 00 0E 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     196    204    Ljava/lang/ClassCastException;
        //  196    204    196    204    Ljava/lang/RuntimeException;
        //  212    214    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  172    179    179    180    Any
        //  173    179    179    180    Ljava/lang/NullPointerException;
        //  173    179    3      8      Any
        //  172    179    172    173    Ljava/lang/NullPointerException;
        //  173    179    3      8      Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 72 out of bounds for length 72
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
    public BlockPos 5() {
        return fbS.7S(this, 33452621);
    }
    
    @NotNull
    public f8v 0() {
        return fbS.gY(this, 2143993135);
    }
    
    @NotNull
    public BlockPos 4() {
        return fbS.7T(this, 489251670);
    }
    
    public f8b(@NotNull final BlockPos c, @NotNull final BlockPos 0, @NotNull final f8v c2) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.1 != 0) {
                    n = 115705268;
                    break Label_0015;
                }
                n = 1011124764;
            }
            switch (n ^ 0x4432D10D) {
                case -1471414883: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.1 != 0) {
                                n2 = 1426548371;
                                break Label_0061;
                            }
                            n2 = -265366833;
                        }
                        switch (n2 ^ 0xC74DED2B) {
                            case -1840608328: {
                                continue;
                            }
                            case 929251300: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0116: {
                                        if (fc.0 != 0) {
                                            n3 = -2009464139;
                                            break Label_0116;
                                        }
                                        n3 = -1226359835;
                                    }
                                    switch (n3 ^ 0x99B77E22) {
                                        case 294485143: {
                                            continue;
                                        }
                                        case 793789895: {
                                            this.0 = 0;
                                            this.c = c2;
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
                    break;
                }
                case 1121408185: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
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
        //     4: ifnull          297
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            289
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            281
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
        //    39: ldc             "\u2255\u149c\u8b07\ue3c2\ub940\uec7b\ub22a\ue728\u893e\u992d\ua6aa\u1e4d\ue00a\u95ad\uf189\u88ea\u57b7\u76a4"
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
        //    63: aload_0        
        //    64: getstatic       dev/nuker/pyro/fc.1:I
        //    67: ifeq            75
        //    70: ldc             -1491498982
        //    72: goto            77
        //    75: ldc             -34404086
        //    77: ldc             893426068
        //    79: ixor           
        //    80: lookupswitch {
        //          -1839656562: 75
        //          -927756130: 108
        //          default: 268
        //        }
        //   108: getfield        dev/nuker/pyro/f8b.c:Lnet/minecraft/util/math/BlockPos;
        //   111: goto            115
        //   114: athrow         
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   118: goto            122
        //   121: athrow         
        //   122: ldc             "\u2234\u14d3\u8b14\ue3c9\ub949\uec4e\ub22b\ue72f\u892b"
        //   124: goto            128
        //   127: athrow         
        //   128: invokestatic    invokestatic   !!! ERROR
        //   131: goto            135
        //   134: athrow         
        //   135: goto            139
        //   138: athrow         
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: goto            146
        //   145: athrow         
        //   146: aload_0        
        //   147: getfield        dev/nuker/pyro/f8b.0:Lnet/minecraft/util/math/BlockPos;
        //   150: goto            154
        //   153: athrow         
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   157: goto            161
        //   160: athrow         
        //   161: ldc             "\u2234\u14d3\u8b05\ue3de\ub95d\uec7b\ub279"
        //   163: goto            167
        //   166: athrow         
        //   167: invokestatic    invokestatic   !!! ERROR
        //   170: goto            174
        //   173: athrow         
        //   174: goto            178
        //   177: athrow         
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: goto            185
        //   184: athrow         
        //   185: aload_0        
        //   186: getfield        dev/nuker/pyro/f8b.c:Ldev/nuker/pyro/f8v;
        //   189: getstatic       dev/nuker/pyro/fc.1:I
        //   192: ifeq            200
        //   195: ldc             1039745762
        //   197: goto            202
        //   200: ldc             -1161331116
        //   202: ldc             1627384864
        //   204: ixor           
        //   205: lookupswitch {
        //          -633826700: 232
        //          1560719042: 200
        //          default: 270
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   239: goto            243
        //   242: athrow         
        //   243: ldc             ")"
        //   245: goto            249
        //   248: athrow         
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: goto            256
        //   255: athrow         
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   263: goto            267
        //   266: athrow         
        //   267: areturn        
        //   268: aconst_null    
        //   269: athrow         
        //   270: aconst_null    
        //   271: athrow         
        //   272: pop            
        //   273: goto            24
        //   276: pop            
        //   277: aconst_null    
        //   278: goto            272
        //   281: dup            
        //   282: ifnull          272
        //   285: checkcast       Ljava/lang/Throwable;
        //   288: athrow         
        //   289: dup            
        //   290: ifnull          276
        //   293: checkcast       Ljava/lang/Throwable;
        //   296: athrow         
        //   297: aconst_null    
        //   298: athrow         
        //    StackMapTable: 00 41 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 46 07 00 0E FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 21 40 07 00 9C FF 00 04 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 42 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 40 07 00 9C FF 00 0B 00 01 07 00 03 00 02 07 00 9C 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 9C 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 07 00 9C 07 00 03 45 07 00 14 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 39 45 07 00 21 40 07 00 9C 44 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 42 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 40 07 00 9C 46 07 00 0E FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 39 45 07 00 21 40 07 00 9C FF 00 04 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 40 07 00 9C FF 00 0E 00 01 07 00 03 00 02 07 00 9C 07 00 3B FF 00 01 00 01 07 00 03 00 03 07 00 9C 07 00 3B 01 FF 00 1D 00 01 07 00 03 00 02 07 00 9C 07 00 3B 42 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 3B 45 07 00 21 40 07 00 9C 44 07 00 0E FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 BB 45 07 00 21 40 07 00 9C 42 07 00 21 40 07 00 9C 45 07 00 21 40 07 00 BB FF 00 00 00 01 07 00 03 00 02 07 00 9C 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 9C 07 00 3B 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     281    289    Any
        //  281    289    281    289    Ljava/lang/NegativeArraySizeException;
        //  297    299    3      8      Ljava/lang/ArithmeticException;
        //  31     38     38     39     Any
        //  32     38     3      8      Any
        //  31     38     3      8      Ljava/lang/ClassCastException;
        //  31     38     3      8      Any
        //  31     38     31     32     Ljava/lang/RuntimeException;
        //  45     51     51     52     Any
        //  45     51     51     52     Ljava/lang/ClassCastException;
        //  45     51     51     52     Ljava/lang/IllegalArgumentException;
        //  45     51     51     52     Any
        //  45     51     3      8      Ljava/lang/UnsupportedOperationException;
        //  55     62     62     63     Any
        //  56     62     55     56     Ljava/lang/ClassCastException;
        //  56     62     62     63     Ljava/lang/EnumConstantNotPresentException;
        //  55     62     55     56     Any
        //  56     62     3      8      Ljava/lang/NumberFormatException;
        //  114    121    121    122    Any
        //  115    121    3      8      Any
        //  114    121    114    115    Ljava/lang/NegativeArraySizeException;
        //  114    121    121    122    Ljava/lang/AssertionError;
        //  115    121    3      8      Ljava/util/NoSuchElementException;
        //  127    134    134    135    Any
        //  128    134    127    128    Any
        //  127    134    134    135    Ljava/lang/IllegalArgumentException;
        //  128    134    127    128    Any
        //  128    134    127    128    Any
        //  138    145    145    146    Any
        //  138    145    145    146    Any
        //  138    145    138    139    Any
        //  138    145    145    146    Any
        //  139    145    145    146    Any
        //  153    160    160    161    Any
        //  154    160    153    154    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  153    160    153    154    Ljava/lang/IllegalStateException;
        //  154    160    153    154    Ljava/lang/ClassCastException;
        //  153    160    153    154    Ljava/lang/NullPointerException;
        //  167    173    173    174    Any
        //  167    173    3      8      Any
        //  167    173    173    174    Ljava/util/ConcurrentModificationException;
        //  167    173    173    174    Any
        //  167    173    3      8      Ljava/lang/NumberFormatException;
        //  178    184    184    185    Any
        //  178    184    184    185    Any
        //  178    184    3      8      Ljava/lang/NegativeArraySizeException;
        //  178    184    3      8      Any
        //  178    184    184    185    Ljava/lang/NegativeArraySizeException;
        //  235    242    242    243    Any
        //  236    242    3      8      Ljava/lang/NegativeArraySizeException;
        //  235    242    242    243    Ljava/lang/StringIndexOutOfBoundsException;
        //  236    242    235    236    Any
        //  235    242    235    236    Ljava/lang/UnsupportedOperationException;
        //  248    255    255    256    Any
        //  248    255    248    249    Ljava/lang/ClassCastException;
        //  248    255    3      8      Any
        //  249    255    248    249    Ljava/util/NoSuchElementException;
        //  249    255    3      8      Ljava/lang/ArithmeticException;
        //  259    266    266    267    Any
        //  259    266    3      8      Any
        //  260    266    259    260    Ljava/lang/AssertionError;
        //  260    266    259    260    Any
        //  259    266    3      8      Any
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
    
    @Override
    public boolean equals(@Nullable final Object o) {
        return fbS.36(this, 605672948, o);
    }
    
    @NotNull
    public BlockPos 3() {
        return fbS.7W(this, 491426972);
    }
    
    @NotNull
    public BlockPos c() {
        return fbS.7R(this, 860375341);
    }
    
    @NotNull
    public f8v 1() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0083:
            while (true) {
                do {
                    Label_0070: {
                        break Label_0070;
                    Label_0030_Outer:
                        while (true) {
                            try {
                                o = null;
                                if (fc.0 > 0) {
                                    continue Label_0083;
                                }
                                null;
                                // iftrue(Label_0028:, fc.c >= 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@7a700a7, n ^ 0x54FAB491)
                                while (true) {
                                    Block_4: {
                                        break Block_4;
                                        Label_0028: {
                                            final int n = 115964843;
                                        }
                                        break Label_0030;
                                        Label_0064:
                                        throw null;
                                        Label_0060:
                                        return this.c;
                                        continue Label_0030_Outer;
                                    }
                                    final int n = -915171183;
                                    continue;
                                }
                            }
                            catch (ClassCastException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0083;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public static f8b c(final f8b p0, final BlockPos p1, final BlockPos p2, final f8v p3, final int p4, final Object p5) {
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
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            319
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            311
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload           4
        //    26: iconst_1       
        //    27: iand           
        //    28: ifeq            80
        //    31: aload_0        
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            43
        //    38: ldc             -828782854
        //    40: goto            45
        //    43: ldc             -1776341384
        //    45: ldc             613853632
        //    47: ixor           
        //    48: lookupswitch {
        //          -1299609672: 76
        //          -368087238: 43
        //          default: 300
        //        }
        //    76: getfield        dev/nuker/pyro/f8b.c:Lnet/minecraft/util/math/BlockPos;
        //    79: astore_1       
        //    80: iload           4
        //    82: iconst_2       
        //    83: iand           
        //    84: ifeq            92
        //    87: aload_0        
        //    88: getfield        dev/nuker/pyro/f8b.0:Lnet/minecraft/util/math/BlockPos;
        //    91: astore_2       
        //    92: iload           4
        //    94: iconst_4       
        //    95: iand           
        //    96: ifeq            148
        //    99: aload_0        
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             -1303864518
        //   108: goto            113
        //   111: ldc             -90655924
        //   113: ldc             -1721387412
        //   115: ixor           
        //   116: lookupswitch {
        //          724381014: 111
        //          1677526304: 144
        //          default: 298
        //        }
        //   144: getfield        dev/nuker/pyro/f8b.c:Ldev/nuker/pyro/f8v;
        //   147: astore_3       
        //   148: aload_0        
        //   149: getstatic       dev/nuker/pyro/fc.0:I
        //   152: ifeq            160
        //   155: ldc             422151281
        //   157: goto            162
        //   160: ldc             427766144
        //   162: ldc             -1322400473
        //   164: ixor           
        //   165: lookupswitch {
        //          -1476116138: 160
        //          -1470958425: 192
        //          default: 296
        //        }
        //   192: aload_1        
        //   193: getstatic       dev/nuker/pyro/fc.1:I
        //   196: ifeq            204
        //   199: ldc             670664921
        //   201: goto            206
        //   204: ldc             616593331
        //   206: ldc             783776588
        //   208: ixor           
        //   209: lookupswitch {
        //          -492429926: 204
        //          156169109: 292
        //          default: 236
        //        }
        //   236: aload_2        
        //   237: aload_3        
        //   238: getstatic       dev/nuker/pyro/fc.c:I
        //   241: ifge            249
        //   244: ldc             267423849
        //   246: goto            251
        //   249: ldc             -930308715
        //   251: ldc             876173543
        //   253: ixor           
        //   254: lookupswitch {
        //          -55196302: 280
        //          1003079822: 249
        //          default: 294
        //        }
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   dev/nuker/pyro/f8b.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Ldev/nuker/pyro/f8v;)Ldev/nuker/pyro/f8b;
        //   287: goto            291
        //   290: athrow         
        //   291: areturn        
        //   292: aconst_null    
        //   293: athrow         
        //   294: aconst_null    
        //   295: athrow         
        //   296: aconst_null    
        //   297: athrow         
        //   298: aconst_null    
        //   299: athrow         
        //   300: aconst_null    
        //   301: athrow         
        //   302: pop            
        //   303: goto            24
        //   306: pop            
        //   307: aconst_null    
        //   308: goto            302
        //   311: dup            
        //   312: ifnull          302
        //   315: checkcast       Ljava/lang/Throwable;
        //   318: athrow         
        //   319: dup            
        //   320: ifnull          306
        //   323: checkcast       Ljava/lang/Throwable;
        //   326: athrow         
        //   327: nop            
        //   328: athrow         
        //    StackMapTable: 00 25 FF 00 03 00 00 00 01 07 00 21 43 07 00 21 FF 00 00 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 00 FF 00 0B 00 00 00 01 07 00 21 FF 00 03 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 00 52 07 00 03 FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 01 5E 07 00 03 03 0B 52 07 00 03 FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 01 5E 07 00 03 03 4B 07 00 03 FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 07 00 39 FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 03 07 00 03 07 00 39 01 FF 00 1D 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 07 00 39 FF 00 0C 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 04 07 00 03 07 00 39 07 00 39 07 00 3B FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 05 07 00 03 07 00 39 07 00 39 07 00 3B 01 FF 00 1C 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 42 07 00 21 FF 00 00 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 45 07 00 21 40 07 00 03 FF 00 00 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 02 07 00 03 07 00 39 FF 00 01 00 06 07 00 03 07 00 39 07 00 39 07 00 3B 01 07 00 05 00 04 07 00 03 07 00 39 07 00 39 07 00 3B 41 07 00 03 41 07 00 03 41 07 00 03 41 07 00 21 43 05 44 07 00 21 47 05 FF 00 07 00 00 00 01 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     311    319    Any
        //  311    319    311    319    Ljava/lang/ClassCastException;
        //  283    290    290    291    Any
        //  284    290    283    284    Ljava/lang/AssertionError;
        //  283    290    290    291    Ljava/lang/IndexOutOfBoundsException;
        //  283    290    290    291    Any
        //  284    290    283    284    Any
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
}
