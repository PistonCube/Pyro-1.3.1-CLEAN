// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;

public class fbr extends Tessellator
{
    public static fbr c;
    
    public void c(final int n) {
        fbS.65(this, 47057852, n);
    }
    
    public void c(@NotNull final BufferBuilder p0, final double p1, final double p2, final double p3, final double p4, final double p5, final double p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          546
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            538
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            530
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             -820835648
        //    35: goto            40
        //    38: ldc             -1613122780
        //    40: ldc             -1860264376
        //    42: ixor           
        //    43: lookupswitch {
        //          1577948296: 515
        //          1808945239: 38
        //          default: 68
        //        }
        //    68: dload_2        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             706325712
        //    77: goto            82
        //    80: ldc             974606289
        //    82: ldc             2143690667
        //    84: ixor           
        //    85: lookupswitch {
        //          1171345530: 112
        //          1440723835: 80
        //          default: 503
        //        }
        //   112: dload           4
        //   114: getstatic       dev/nuker/pyro/fc.1:I
        //   117: ifeq            125
        //   120: ldc             -1736074633
        //   122: goto            127
        //   125: ldc             -1674780622
        //   127: ldc             2058478172
        //   129: ixor           
        //   130: lookupswitch {
        //          -1785111661: 125
        //          -499877845: 513
        //          default: 156
        //        }
        //   156: dload           6
        //   158: goto            162
        //   161: athrow         
        //   162: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   165: goto            169
        //   168: athrow         
        //   169: getstatic       dev/nuker/pyro/fc.c:I
        //   172: ifge            180
        //   175: ldc             937954245
        //   177: goto            182
        //   180: ldc             -1493871210
        //   182: ldc             -663849800
        //   184: ixor           
        //   185: lookupswitch {
        //          -276398211: 180
        //          2124095790: 212
        //          default: 509
        //        }
        //   212: iload           14
        //   214: iload           15
        //   216: getstatic       dev/nuker/pyro/fc.0:I
        //   219: ifeq            227
        //   222: ldc             -1605810159
        //   224: goto            229
        //   227: ldc             281256185
        //   229: ldc             806346056
        //   231: ixor           
        //   232: lookupswitch {
        //          -1874422439: 227
        //          550272433: 260
        //          default: 519
        //        }
        //   260: iload           16
        //   262: iload           17
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   271: goto            275
        //   274: athrow         
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   282: goto            286
        //   285: athrow         
        //   286: getstatic       dev/nuker/pyro/fc.c:I
        //   289: ifge            297
        //   292: ldc             938649540
        //   294: goto            299
        //   297: ldc             631250406
        //   299: ldc             -1099063168
        //   301: ixor           
        //   302: lookupswitch {
        //          -1987115196: 507
        //          -1906194615: 297
        //          default: 328
        //        }
        //   328: aload_1        
        //   329: getstatic       dev/nuker/pyro/fc.0:I
        //   332: ifeq            340
        //   335: ldc             285990948
        //   337: goto            342
        //   340: ldc             1843023368
        //   342: ldc             -717928517
        //   344: ixor           
        //   345: lookupswitch {
        //          -1192293965: 372
        //          -1002526817: 340
        //          default: 517
        //        }
        //   372: dload           8
        //   374: dload           10
        //   376: dload           12
        //   378: getstatic       dev/nuker/pyro/fc.c:I
        //   381: ifge            389
        //   384: ldc             682791614
        //   386: goto            391
        //   389: ldc             -355033390
        //   391: ldc             1699786449
        //   393: ixor           
        //   394: lookupswitch {
        //          247272006: 389
        //          1306672239: 511
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   427: goto            431
        //   430: athrow         
        //   431: iload           18
        //   433: iload           19
        //   435: getstatic       dev/nuker/pyro/fc.1:I
        //   438: ifeq            446
        //   441: ldc             -1509022440
        //   443: goto            448
        //   446: ldc             43325241
        //   448: ldc             358524097
        //   450: ixor           
        //   451: lookupswitch {
        //          -1286569511: 446
        //          399225848: 476
        //          default: 505
        //        }
        //   476: iload           20
        //   478: iload           21
        //   480: goto            484
        //   483: athrow         
        //   484: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   487: goto            491
        //   490: athrow         
        //   491: goto            495
        //   494: athrow         
        //   495: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   498: goto            502
        //   501: athrow         
        //   502: return         
        //   503: aconst_null    
        //   504: athrow         
        //   505: aconst_null    
        //   506: athrow         
        //   507: aconst_null    
        //   508: athrow         
        //   509: aconst_null    
        //   510: athrow         
        //   511: aconst_null    
        //   512: athrow         
        //   513: aconst_null    
        //   514: athrow         
        //   515: aconst_null    
        //   516: athrow         
        //   517: aconst_null    
        //   518: athrow         
        //   519: aconst_null    
        //   520: athrow         
        //   521: pop            
        //   522: goto            24
        //   525: pop            
        //   526: aconst_null    
        //   527: goto            521
        //   530: dup            
        //   531: ifnull          521
        //   534: checkcast       Ljava/lang/Throwable;
        //   537: athrow         
        //   538: dup            
        //   539: ifnull          525
        //   542: checkcast       Ljava/lang/Throwable;
        //   545: athrow         
        //   546: aconst_null    
        //   547: athrow         
        //    StackMapTable: 00 45 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 00 4D 07 00 3C FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 01 5B 07 00 3C FF 00 0B 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1D 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0C 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1C 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 03 03 44 07 00 31 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 3C FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 0E 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 06 00 00 00 01 07 00 31 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 01 07 00 3C 45 07 00 31 00 0A 41 01 1C 4B 07 00 3C FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 10 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1C 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 03 42 07 00 31 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0E 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1B 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 46 07 00 23 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 19 40 07 00 3C 45 07 00 31 00 FF 00 00 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 01 41 07 00 3C FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 03 03 41 07 00 3C 41 07 00 3C FF 00 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 00 03 07 00 3C 01 01 41 07 00 31 43 05 44 07 00 31 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     530    538    Ljava/lang/AssertionError;
        //  530    538    530    538    Ljava/lang/EnumConstantNotPresentException;
        //  546    548    3      8      Any
        //  161    168    168    169    Any
        //  162    168    168    169    Any
        //  161    168    3      8      Ljava/lang/RuntimeException;
        //  162    168    161    162    Any
        //  162    168    3      8      Ljava/lang/NumberFormatException;
        //  268    274    274    275    Any
        //  268    274    3      8      Ljava/lang/AssertionError;
        //  268    274    3      8      Any
        //  268    274    274    275    Ljava/lang/NegativeArraySizeException;
        //  268    274    274    275    Any
        //  279    285    285    286    Any
        //  279    285    3      8      Any
        //  279    285    285    286    Ljava/util/ConcurrentModificationException;
        //  279    285    3      8      Any
        //  279    285    3      8      Any
        //  423    430    430    431    Any
        //  424    430    430    431    Any
        //  423    430    423    424    Ljava/lang/ArithmeticException;
        //  423    430    430    431    Any
        //  424    430    423    424    Any
        //  483    490    490    491    Any
        //  483    490    490    491    Ljava/lang/IllegalArgumentException;
        //  483    490    490    491    Any
        //  484    490    483    484    Ljava/lang/NullPointerException;
        //  483    490    490    491    Ljava/lang/StringIndexOutOfBoundsException;
        //  494    501    501    502    Any
        //  494    501    501    502    Any
        //  494    501    501    502    Ljava/lang/IllegalStateException;
        //  495    501    501    502    Ljava/util/NoSuchElementException;
        //  494    501    494    495    Ljava/lang/NumberFormatException;
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
    
    public void 0(final int n) {
        fbS.6l(this, 1076697150, n);
    }
    
    public void 0(@NotNull final BlockPos blockPos, final int n, final int n2, final int n3, final int n4, final int n5) {
        fbS.9H(this, 794445272, blockPos, n, n2, n3, n4, n5);
    }
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.c < 0) {
                    n = 2140647448;
                    break Label_0017;
                }
                n = 1268368582;
            }
            switch (n ^ 0xC7420EFC) {
                case -1371079419: {
                    continue;
                }
                default: {
                    fbr.c = new fbr();
                }
                case -1193951516: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void 0(@NotNull final AxisAlignedBB axisAlignedBB, final int n, final int n2) {
        fbS.9a(this, 676720109, axisAlignedBB, n, n2);
    }
    
    public void 1(@NotNull final BufferBuilder bufferBuilder, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        fbS.h2(this, 732351163, bufferBuilder, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }
    
    public void 0(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8) {
        fbS.7p(this, 1567804936, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void c(@NotNull final BlockPos blockPos, final int n, final int n2, final int n3, final int n4, final int n5) {
        fbS.9H(this, 794445255, blockPos, n, n2, n3, n4, n5);
    }
    
    public void c(@NotNull final BlockPos blockPos, final int n, final int n2) {
        fbS.4L(this, 152882890, blockPos, n, n2);
    }
    
    public void 3() {
        fbS.dQ(this, 66067420);
    }
    
    public void c() {
        fbS.e2(this, 2134898116);
    }
    
    public void c(@NotNull final BufferBuilder p0, final double p1, final double p2, final double p3, final double p4, final double p5, final double p6, final int p7, final int p8) {
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
        //    12: ifgt            267
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            259
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             832902350
        //    35: goto            40
        //    38: ldc             1766374691
        //    40: ldc             256636995
        //    42: ixor           
        //    43: lookupswitch {
        //          1055845517: 38
        //          1711490400: 68
        //          default: 244
        //        }
        //    68: aload_1        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            80
        //    75: ldc             1590406099
        //    77: goto            82
        //    80: ldc             566911608
        //    82: ldc             732383391
        //    84: ixor           
        //    85: lookupswitch {
        //          80233037: 80
        //          1970070348: 248
        //          default: 112
        //        }
        //   112: dload_2        
        //   113: dload           4
        //   115: dload           6
        //   117: dload           8
        //   119: dload           10
        //   121: dload           12
        //   123: iload           14
        //   125: bipush          16
        //   127: iushr          
        //   128: sipush          255
        //   131: iand           
        //   132: iload           14
        //   134: bipush          8
        //   136: iushr          
        //   137: sipush          255
        //   140: iand           
        //   141: getstatic       dev/nuker/pyro/fc.0:I
        //   144: ifeq            152
        //   147: ldc             -1082897942
        //   149: goto            154
        //   152: ldc             2006616767
        //   154: ldc             593870619
        //   156: ixor           
        //   157: lookupswitch {
        //          -1676544271: 152
        //          1426011556: 184
        //          default: 246
        //        }
        //   184: iload           14
        //   186: sipush          255
        //   189: iand           
        //   190: iload           14
        //   192: bipush          24
        //   194: iushr          
        //   195: sipush          255
        //   198: iand           
        //   199: iload           15
        //   201: bipush          16
        //   203: iushr          
        //   204: sipush          255
        //   207: iand           
        //   208: iload           15
        //   210: bipush          8
        //   212: iushr          
        //   213: sipush          255
        //   216: iand           
        //   217: iload           15
        //   219: sipush          255
        //   222: iand           
        //   223: iload           15
        //   225: bipush          24
        //   227: iushr          
        //   228: sipush          255
        //   231: iand           
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   dev/nuker/pyro/fbr.c:(Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDIIIIIIII)V
        //   239: goto            243
        //   242: athrow         
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: pop            
        //   251: goto            24
        //   254: pop            
        //   255: aconst_null    
        //   256: goto            250
        //   259: dup            
        //   260: ifnull          250
        //   263: checkcast       Ljava/lang/Throwable;
        //   266: athrow         
        //   267: dup            
        //   268: ifnull          254
        //   271: checkcast       Ljava/lang/Throwable;
        //   274: athrow         
        //   275: nop            
        //   276: athrow         
        //    StackMapTable: 00 1A FF 00 03 00 00 00 01 07 00 31 43 07 00 31 FF 00 00 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 00 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 00 4D 07 00 03 FF 00 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 02 07 00 03 01 5B 07 00 03 FF 00 0B 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 02 07 00 03 07 00 3C FF 00 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 03 07 00 03 07 00 3C 01 FF 00 1D 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 02 07 00 03 07 00 3C FF 00 27 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 FF 00 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 0B 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 FF 00 1D 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 72 07 00 31 FF 00 00 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 10 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 01 01 01 01 01 01 45 07 00 31 00 40 07 00 03 FF 00 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 FF 00 01 00 0A 07 00 03 07 00 3C 03 03 03 03 03 03 01 01 00 02 07 00 03 07 00 3C 41 07 00 31 43 05 44 07 00 31 47 05 FF 00 07 00 00 00 01 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     259    267    Any
        //  259    267    259    267    Ljava/lang/StringIndexOutOfBoundsException;
        //  235    242    242    243    Any
        //  235    242    242    243    Any
        //  236    242    242    243    Ljava/lang/IndexOutOfBoundsException;
        //  236    242    242    243    Ljava/util/ConcurrentModificationException;
        //  236    242    235    236    Any
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
    
    public void 2() {
        fbS.dU(this, 826898435);
    }
    
    public void 0(final float p0, final float p1, final float p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          493
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            485
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            477
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -488147815
        //    32: goto            37
        //    35: ldc             1263446519
        //    37: ldc             747317084
        //    39: ixor           
        //    40: lookupswitch {
        //          -831761467: 35
        //          1741000363: 68
        //          default: 452
        //        }
        //    68: iload           4
        //    70: bipush          24
        //    72: iushr          
        //    73: sipush          255
        //    76: iand           
        //    77: istore          6
        //    79: iload           4
        //    81: bipush          16
        //    83: iushr          
        //    84: sipush          255
        //    87: iand           
        //    88: getstatic       dev/nuker/pyro/fc.0:I
        //    91: ifeq            99
        //    94: ldc             -41188560
        //    96: goto            101
        //    99: ldc             -221461115
        //   101: ldc             -1046352682
        //   103: ixor           
        //   104: lookupswitch {
        //          862792019: 132
        //          1009414118: 99
        //          default: 454
        //        }
        //   132: istore          7
        //   134: getstatic       dev/nuker/pyro/fc.1:I
        //   137: ifeq            145
        //   140: ldc             1035981595
        //   142: goto            147
        //   145: ldc             1678794429
        //   147: ldc             -1121502671
        //   149: ixor           
        //   150: lookupswitch {
        //          -2137462486: 145
        //          -650681204: 176
        //          default: 458
        //        }
        //   176: iload           4
        //   178: bipush          8
        //   180: iushr          
        //   181: sipush          255
        //   184: iand           
        //   185: getstatic       dev/nuker/pyro/fc.1:I
        //   188: ifeq            196
        //   191: ldc             -736367367
        //   193: goto            198
        //   196: ldc             -847830068
        //   198: ldc             1444178508
        //   200: ixor           
        //   201: lookupswitch {
        //          -2112911691: 196
        //          -1687991936: 228
        //          default: 462
        //        }
        //   228: istore          8
        //   230: getstatic       dev/nuker/pyro/fc.c:I
        //   233: ifge            241
        //   236: ldc             -1175452277
        //   238: goto            243
        //   241: ldc             -410059325
        //   243: ldc             259618537
        //   245: ixor           
        //   246: lookupswitch {
        //          -1232506014: 460
        //          -477555821: 241
        //          default: 272
        //        }
        //   272: iload           4
        //   274: sipush          255
        //   277: iand           
        //   278: istore          9
        //   280: getstatic       dev/nuker/pyro/fc.0:I
        //   283: ifeq            291
        //   286: ldc             1125741685
        //   288: goto            293
        //   291: ldc             64099716
        //   293: ldc             348117789
        //   295: ixor           
        //   296: lookupswitch {
        //          -1049722793: 291
        //          1470541672: 456
        //          default: 324
        //        }
        //   324: aload_0        
        //   325: aload_0        
        //   326: goto            330
        //   329: athrow         
        //   330: invokevirtual   dev/nuker/pyro/fbr.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //   333: goto            337
        //   336: athrow         
        //   337: dup            
        //   338: pop            
        //   339: fload_1        
        //   340: fload_2        
        //   341: fload_3        
        //   342: fconst_1       
        //   343: fconst_1       
        //   344: fconst_1       
        //   345: iload           7
        //   347: iload           8
        //   349: getstatic       dev/nuker/pyro/fc.c:I
        //   352: ifge            360
        //   355: ldc             -2137904531
        //   357: goto            362
        //   360: ldc             -1241211957
        //   362: ldc             492992860
        //   364: ixor           
        //   365: lookupswitch {
        //          -1645194447: 360
        //          -1419320681: 392
        //          default: 464
        //        }
        //   392: iload           9
        //   394: iload           6
        //   396: iload           5
        //   398: getstatic       dev/nuker/pyro/fc.0:I
        //   401: ifeq            409
        //   404: ldc             -991429239
        //   406: goto            411
        //   409: ldc             1142646959
        //   411: ldc             1430030964
        //   413: ixor           
        //   414: lookupswitch {
        //          -1847887875: 409
        //          287826651: 440
        //          default: 466
        //        }
        //   440: goto            444
        //   443: athrow         
        //   444: invokevirtual   dev/nuker/pyro/fbr.1:(Lnet/minecraft/client/renderer/BufferBuilder;FFFFFFIIIII)V
        //   447: goto            451
        //   450: athrow         
        //   451: return         
        //   452: aconst_null    
        //   453: athrow         
        //   454: aconst_null    
        //   455: athrow         
        //   456: aconst_null    
        //   457: athrow         
        //   458: aconst_null    
        //   459: athrow         
        //   460: aconst_null    
        //   461: athrow         
        //   462: aconst_null    
        //   463: athrow         
        //   464: aconst_null    
        //   465: athrow         
        //   466: aconst_null    
        //   467: athrow         
        //   468: pop            
        //   469: goto            24
        //   472: pop            
        //   473: aconst_null    
        //   474: goto            468
        //   477: dup            
        //   478: ifnull          468
        //   481: checkcast       Ljava/lang/Throwable;
        //   484: athrow         
        //   485: dup            
        //   486: ifnull          472
        //   489: checkcast       Ljava/lang/Throwable;
        //   492: athrow         
        //   493: aconst_null    
        //   494: athrow         
        //    StackMapTable: 00 31 FF 00 03 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 01 07 00 31 FF 00 04 00 06 07 00 03 02 02 02 01 01 00 00 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 06 07 00 03 02 02 02 01 01 00 00 0A 41 01 1E FF 00 1E 00 07 07 00 03 02 02 02 01 01 01 00 01 01 FF 00 01 00 07 07 00 03 02 02 02 01 01 01 00 02 01 01 5E 01 FC 00 0C 01 41 01 1C 53 01 FF 00 01 00 08 07 00 03 02 02 02 01 01 01 01 00 02 01 01 5D 01 FC 00 0C 01 41 01 1C FC 00 12 01 41 01 1E 44 07 00 17 FF 00 00 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 02 07 00 03 07 00 03 45 07 00 31 FF 00 00 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 02 07 00 03 07 00 3C FF 00 16 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0A 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0B 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 FF 00 1D 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0A 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 FF 00 10 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0E 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 01 FF 00 1C 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 42 07 00 31 FF 00 00 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 45 07 00 31 00 FF 00 00 00 06 07 00 03 02 02 02 01 01 00 00 FF 00 01 00 07 07 00 03 02 02 02 01 01 01 00 01 01 FE 00 01 01 01 01 F9 00 01 FC 00 01 01 FF 00 01 00 08 07 00 03 02 02 02 01 01 01 01 00 01 01 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0A 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 FF 00 01 00 06 07 00 03 02 02 02 01 01 00 01 07 00 31 43 05 44 07 00 31 47 05 FF 00 07 00 0A 07 00 03 02 02 02 01 01 01 01 01 01 00 01 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     477    485    Any
        //  477    485    477    485    Any
        //  493    495    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  329    336    336    337    Any
        //  329    336    329    330    Ljava/lang/ArithmeticException;
        //  330    336    3      8      Any
        //  330    336    3      8      Any
        //  329    336    329    330    Ljava/lang/NumberFormatException;
        //  443    450    450    451    Any
        //  443    450    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  443    450    3      8      Any
        //  443    450    3      8      Ljava/lang/IllegalArgumentException;
        //  443    450    443    444    Any
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
    
    public void c(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8) {
        fbS.7p(this, 1567804937, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void 0(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        fbS.hv(this, 1025039976, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }
    
    public void 0() {
        fbS.dY(this, 1895760670);
    }
    
    public void c(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        fbS.hv(this, 1025039977, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }
    
    public void c(@NotNull final AxisAlignedBB axisAlignedBB, final int n, final int n2) {
        fbS.9a(this, 676720108, axisAlignedBB, n, n2);
    }
    
    public void 1(final float n, final float n2, final float n3, final int n4, final int n5) {
        fbS.1q(this, 1208256823, n, n2, n3, n4, n5);
    }
    
    public fbr() {
        super(2097152);
    }
    
    public void c(@NotNull final BufferBuilder bufferBuilder, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        fbS.h2(this, 732351162, bufferBuilder, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }
    
    public void 0(@NotNull final BlockPos blockPos, final int n, final int n2) {
        fbS.4L(this, 152882889, blockPos, n, n2);
    }
    
    public void c(final float p0, final float p1, final float p2, final float p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1048
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1040
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1032
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             553459413
        //    32: goto            37
        //    35: ldc             1258290611
        //    37: ldc             454731316
        //    39: ixor           
        //    40: lookupswitch {
        //          -1171020277: 35
        //          1005041889: 1011
        //          default: 68
        //        }
        //    68: iload           5
        //    70: bipush          16
        //    72: ishr           
        //    73: sipush          255
        //    76: iand           
        //    77: i2f            
        //    78: ldc             255.0
        //    80: fdiv           
        //    81: fstore          6
        //    83: iload           5
        //    85: bipush          8
        //    87: ishr           
        //    88: sipush          255
        //    91: iand           
        //    92: i2f            
        //    93: ldc             255.0
        //    95: fdiv           
        //    96: fstore          7
        //    98: iload           5
        //   100: sipush          255
        //   103: iand           
        //   104: i2f            
        //   105: ldc             255.0
        //   107: fdiv           
        //   108: getstatic       dev/nuker/pyro/fc.1:I
        //   111: ifeq            119
        //   114: ldc             1871966333
        //   116: goto            121
        //   119: ldc             1095408751
        //   121: ldc             -1886754276
        //   123: ixor           
        //   124: lookupswitch {
        //          -826214797: 152
        //          -535192991: 119
        //          default: 997
        //        }
        //   152: fstore          8
        //   154: iload           5
        //   156: bipush          24
        //   158: ishr           
        //   159: sipush          255
        //   162: iand           
        //   163: i2f            
        //   164: ldc             255.0
        //   166: fdiv           
        //   167: fstore          9
        //   169: goto            173
        //   172: athrow         
        //   173: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //   176: goto            180
        //   179: athrow         
        //   180: astore          10
        //   182: getstatic       dev/nuker/pyro/fc.1:I
        //   185: ifeq            193
        //   188: ldc             -1456328875
        //   190: goto            195
        //   193: ldc             -1400899366
        //   195: ldc             163412223
        //   197: ixor           
        //   198: lookupswitch {
        //          -1601218646: 1021
        //          137087917: 193
        //          default: 224
        //        }
        //   224: aload           10
        //   226: dup            
        //   227: pop            
        //   228: getstatic       dev/nuker/pyro/fc.1:I
        //   231: ifeq            239
        //   234: ldc             -1940814214
        //   236: goto            241
        //   239: ldc             20310937
        //   241: ldc             -1689990445
        //   243: ixor           
        //   244: lookupswitch {
        //          -1610969698: 239
        //          387271849: 1015
        //          default: 272
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //   279: goto            283
        //   282: athrow         
        //   283: getstatic       dev/nuker/pyro/fc.1:I
        //   286: ifeq            294
        //   289: ldc             -1682745980
        //   291: goto            296
        //   294: ldc             641196557
        //   296: ldc             -825197876
        //   298: ixor           
        //   299: lookupswitch {
        //          -1212754641: 294
        //          1432563528: 1007
        //          default: 324
        //        }
        //   324: astore          11
        //   326: goto            330
        //   329: athrow         
        //   330: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //   333: goto            337
        //   336: athrow         
        //   337: getstatic       dev/nuker/pyro/fc.c:I
        //   340: ifge            349
        //   343: ldc_w           1101016567
        //   346: goto            352
        //   349: ldc_w           2009109256
        //   352: ldc_w           -1179232445
        //   355: ixor           
        //   356: lookupswitch {
        //          -132744524: 1013
        //          1726515291: 349
        //          default: 384
        //        }
        //   384: goto            388
        //   387: athrow         
        //   388: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //   391: goto            395
        //   394: athrow         
        //   395: sipush          770
        //   398: sipush          771
        //   401: iconst_1       
        //   402: iconst_0       
        //   403: goto            407
        //   406: athrow         
        //   407: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179120_a:(IIII)V
        //   410: goto            414
        //   413: athrow         
        //   414: aload           11
        //   416: bipush          7
        //   418: getstatic       net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181706_f:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //   421: goto            425
        //   424: athrow         
        //   425: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181668_a:(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        //   428: goto            432
        //   431: athrow         
        //   432: aload           11
        //   434: getstatic       dev/nuker/pyro/fc.0:I
        //   437: ifeq            446
        //   440: ldc_w           319632959
        //   443: goto            449
        //   446: ldc_w           -164018214
        //   449: ldc_w           -1868019219
        //   452: ixor           
        //   453: lookupswitch {
        //          -2086305838: 1005
        //          -896335453: 446
        //          default: 480
        //        }
        //   480: fload_1        
        //   481: f2d            
        //   482: fload           4
        //   484: f2d            
        //   485: dconst_0       
        //   486: getstatic       dev/nuker/pyro/fc.0:I
        //   489: ifeq            498
        //   492: ldc_w           -371006735
        //   495: goto            501
        //   498: ldc_w           -958945918
        //   501: ldc_w           1496921842
        //   504: ixor           
        //   505: lookupswitch {
        //          -1327770621: 1017
        //          -1327305130: 498
        //          default: 532
        //        }
        //   532: goto            536
        //   535: athrow         
        //   536: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   539: goto            543
        //   542: athrow         
        //   543: fload           6
        //   545: fload           7
        //   547: fload           8
        //   549: getstatic       dev/nuker/pyro/fc.c:I
        //   552: ifge            561
        //   555: ldc_w           -382715178
        //   558: goto            564
        //   561: ldc_w           -1227138598
        //   564: ldc_w           75079131
        //   567: ixor           
        //   568: lookupswitch {
        //          -1297955839: 596
        //          -313940211: 561
        //          default: 1001
        //        }
        //   596: fload           9
        //   598: goto            602
        //   601: athrow         
        //   602: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   605: goto            609
        //   608: athrow         
        //   609: goto            613
        //   612: athrow         
        //   613: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   616: goto            620
        //   619: athrow         
        //   620: aload           11
        //   622: getstatic       dev/nuker/pyro/fc.1:I
        //   625: ifeq            634
        //   628: ldc_w           65761673
        //   631: goto            637
        //   634: ldc_w           1552516767
        //   637: ldc_w           -524937275
        //   640: ixor           
        //   641: lookupswitch {
        //          -654857178: 634
        //          -480418228: 1003
        //          default: 668
        //        }
        //   668: fload_3        
        //   669: f2d            
        //   670: fload           4
        //   672: f2d            
        //   673: dconst_0       
        //   674: goto            678
        //   677: athrow         
        //   678: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   681: goto            685
        //   684: athrow         
        //   685: fload           6
        //   687: fload           7
        //   689: getstatic       dev/nuker/pyro/fc.c:I
        //   692: ifge            701
        //   695: ldc_w           -138938109
        //   698: goto            704
        //   701: ldc_w           -1022465302
        //   704: ldc_w           -606877415
        //   707: ixor           
        //   708: lookupswitch {
        //          417178611: 736
        //          744763418: 701
        //          default: 1019
        //        }
        //   736: fload           8
        //   738: fload           9
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   747: goto            751
        //   750: athrow         
        //   751: goto            755
        //   754: athrow         
        //   755: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   758: goto            762
        //   761: athrow         
        //   762: aload           11
        //   764: fload_3        
        //   765: f2d            
        //   766: getstatic       dev/nuker/pyro/fc.1:I
        //   769: ifeq            778
        //   772: ldc_w           1774549184
        //   775: goto            781
        //   778: ldc_w           -217493046
        //   781: ldc_w           -1017070041
        //   784: ixor           
        //   785: lookupswitch {
        //          -1431976217: 778
        //          812249069: 812
        //          default: 1009
        //        }
        //   812: fload_2        
        //   813: f2d            
        //   814: dconst_0       
        //   815: goto            819
        //   818: athrow         
        //   819: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   822: goto            826
        //   825: athrow         
        //   826: fload           6
        //   828: fload           7
        //   830: fload           8
        //   832: fload           9
        //   834: goto            838
        //   837: athrow         
        //   838: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   841: goto            845
        //   844: athrow         
        //   845: goto            849
        //   848: athrow         
        //   849: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   852: goto            856
        //   855: athrow         
        //   856: aload           11
        //   858: getstatic       dev/nuker/pyro/fc.c:I
        //   861: ifge            870
        //   864: ldc_w           799412958
        //   867: goto            873
        //   870: ldc_w           741727998
        //   873: ldc_w           635643117
        //   876: ixor           
        //   877: lookupswitch {
        //          -1082963772: 870
        //          172308019: 999
        //          default: 904
        //        }
        //   904: fload_1        
        //   905: f2d            
        //   906: fload_2        
        //   907: f2d            
        //   908: dconst_0       
        //   909: goto            913
        //   912: athrow         
        //   913: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   916: goto            920
        //   919: athrow         
        //   920: fload           6
        //   922: fload           7
        //   924: fload           8
        //   926: fload           9
        //   928: goto            932
        //   931: athrow         
        //   932: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   935: goto            939
        //   938: athrow         
        //   939: goto            943
        //   942: athrow         
        //   943: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   946: goto            950
        //   949: athrow         
        //   950: aload           10
        //   952: goto            956
        //   955: athrow         
        //   956: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //   959: goto            963
        //   962: athrow         
        //   963: goto            967
        //   966: athrow         
        //   967: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //   970: goto            974
        //   973: athrow         
        //   974: goto            978
        //   977: athrow         
        //   978: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //   981: goto            985
        //   984: athrow         
        //   985: goto            989
        //   988: athrow         
        //   989: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //   992: goto            996
        //   995: athrow         
        //   996: return         
        //   997: aconst_null    
        //   998: athrow         
        //   999: aconst_null    
        //  1000: athrow         
        //  1001: aconst_null    
        //  1002: athrow         
        //  1003: aconst_null    
        //  1004: athrow         
        //  1005: aconst_null    
        //  1006: athrow         
        //  1007: aconst_null    
        //  1008: athrow         
        //  1009: aconst_null    
        //  1010: athrow         
        //  1011: aconst_null    
        //  1012: athrow         
        //  1013: aconst_null    
        //  1014: athrow         
        //  1015: aconst_null    
        //  1016: athrow         
        //  1017: aconst_null    
        //  1018: athrow         
        //  1019: aconst_null    
        //  1020: athrow         
        //  1021: aconst_null    
        //  1022: athrow         
        //  1023: pop            
        //  1024: goto            24
        //  1027: pop            
        //  1028: aconst_null    
        //  1029: goto            1023
        //  1032: dup            
        //  1033: ifnull          1023
        //  1036: checkcast       Ljava/lang/Throwable;
        //  1039: athrow         
        //  1040: dup            
        //  1041: ifnull          1027
        //  1044: checkcast       Ljava/lang/Throwable;
        //  1047: athrow         
        //  1048: aconst_null    
        //  1049: athrow         
        //    StackMapTable: 00 95 FF 00 03 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 01 07 00 31 FF 00 04 00 06 07 00 03 02 02 02 02 01 00 00 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 06 07 00 03 02 02 02 02 01 00 00 0A 41 01 1E FF 00 32 00 08 07 00 03 02 02 02 02 01 02 02 00 01 02 FF 00 01 00 08 07 00 03 02 02 02 02 01 02 02 00 02 02 01 5E 02 FF 00 13 00 0A 07 00 03 02 02 02 02 01 02 02 02 02 00 01 07 00 17 00 45 07 00 31 40 07 00 05 FC 00 0C 07 00 05 41 01 1C 4E 07 00 05 FF 00 01 00 0B 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 00 02 07 00 05 01 5E 07 00 05 42 07 00 31 40 07 00 05 45 07 00 31 40 07 00 3C 4A 07 00 3C FF 00 01 00 0B 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 00 02 07 00 3C 01 5B 07 00 3C FF 00 04 00 00 00 01 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 00 45 07 00 31 00 0B 42 01 1F 42 07 00 31 00 45 07 00 31 00 4A 07 00 23 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 01 01 01 01 45 07 00 31 00 49 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 03 07 00 3C 01 07 01 37 45 07 00 31 00 4D 07 00 3C FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 01 5E 07 00 3C FF 00 11 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 03 03 03 01 FF 00 1E 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 42 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 11 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 02 02 02 FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 02 02 02 01 FF 00 1F 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 02 02 02 FF 00 04 00 00 00 01 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 02 02 02 02 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 4D 07 00 3C FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 01 5E 07 00 3C 48 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0F 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 03 07 00 3C 02 02 FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 02 02 01 FF 00 1F 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 03 07 00 3C 02 02 FF 00 06 00 00 00 01 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 02 02 02 02 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 0F 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 03 FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 03 07 00 3C 03 01 FF 00 1E 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 03 45 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 02 02 02 02 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 4D 07 00 3C FF 00 02 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 01 5E 07 00 3C 47 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 05 07 00 3C 02 02 02 02 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 44 07 00 31 40 07 00 05 45 07 00 31 00 42 07 00 31 00 45 07 00 31 00 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 00 45 07 00 31 00 42 07 00 15 00 45 07 00 31 00 FF 00 00 00 08 07 00 03 02 02 02 02 01 02 02 00 01 02 FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 01 07 00 3C FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 02 02 02 41 07 00 3C 41 07 00 3C FF 00 01 00 0B 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 00 01 07 00 3C FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 02 07 00 3C 03 FF 00 01 00 06 07 00 03 02 02 02 02 01 00 00 FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 00 FF 00 01 00 0B 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 00 01 07 00 05 FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 04 07 00 3C 03 03 03 FF 00 01 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 03 07 00 3C 02 02 FA 00 01 FF 00 01 00 06 07 00 03 02 02 02 02 01 00 01 07 00 17 43 05 44 07 00 17 47 05 FF 00 07 00 0C 07 00 03 02 02 02 02 01 02 02 02 02 07 00 05 07 00 3C 00 01 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1032   1040   Ljava/util/NoSuchElementException;
        //  1032   1040   1032   1040   Ljava/lang/IllegalArgumentException;
        //  1048   1050   3      8      Any
        //  172    179    179    180    Any
        //  172    179    179    180    Any
        //  173    179    172    173    Ljava/lang/StringIndexOutOfBoundsException;
        //  173    179    172    173    Ljava/lang/UnsupportedOperationException;
        //  173    179    179    180    Any
        //  275    282    282    283    Any
        //  276    282    282    283    Ljava/lang/ArithmeticException;
        //  276    282    275    276    Ljava/lang/NegativeArraySizeException;
        //  275    282    282    283    Ljava/lang/NegativeArraySizeException;
        //  275    282    275    276    Any
        //  330    336    336    337    Any
        //  330    336    336    337    Any
        //  330    336    3      8      Any
        //  330    336    336    337    Ljava/util/ConcurrentModificationException;
        //  330    336    3      8      Any
        //  387    394    394    395    Any
        //  388    394    394    395    Any
        //  387    394    387    388    Any
        //  387    394    387    388    Any
        //  387    394    3      8      Any
        //  406    413    413    414    Any
        //  406    413    413    414    Any
        //  406    413    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  407    413    406    407    Ljava/lang/NullPointerException;
        //  406    413    413    414    Ljava/lang/AssertionError;
        //  424    431    431    432    Any
        //  424    431    3      8      Any
        //  424    431    424    425    Any
        //  425    431    3      8      Ljava/lang/ClassCastException;
        //  425    431    424    425    Ljava/lang/IllegalArgumentException;
        //  535    542    542    543    Any
        //  535    542    3      8      Ljava/lang/NullPointerException;
        //  535    542    535    536    Ljava/util/ConcurrentModificationException;
        //  536    542    535    536    Any
        //  535    542    542    543    Any
        //  602    608    608    609    Any
        //  602    608    3      8      Any
        //  602    608    608    609    Ljava/util/NoSuchElementException;
        //  602    608    608    609    Any
        //  602    608    608    609    Any
        //  612    619    619    620    Any
        //  613    619    612    613    Ljava/lang/NegativeArraySizeException;
        //  612    619    612    613    Any
        //  612    619    612    613    Any
        //  612    619    612    613    Any
        //  677    684    684    685    Any
        //  678    684    677    678    Any
        //  677    684    684    685    Ljava/lang/IndexOutOfBoundsException;
        //  678    684    684    685    Ljava/util/NoSuchElementException;
        //  677    684    684    685    Ljava/lang/EnumConstantNotPresentException;
        //  744    750    750    751    Any
        //  744    750    3      8      Ljava/util/NoSuchElementException;
        //  744    750    3      8      Any
        //  744    750    750    751    Ljava/lang/AssertionError;
        //  744    750    3      8      Ljava/lang/IllegalStateException;
        //  754    761    761    762    Any
        //  755    761    754    755    Any
        //  754    761    761    762    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  755    761    3      8      Any
        //  754    761    3      8      Ljava/lang/ClassCastException;
        //  818    825    825    826    Any
        //  819    825    818    819    Any
        //  819    825    3      8      Any
        //  818    825    3      8      Ljava/lang/IllegalStateException;
        //  819    825    825    826    Ljava/lang/RuntimeException;
        //  837    844    844    845    Any
        //  838    844    837    838    Any
        //  837    844    844    845    Ljava/lang/ClassCastException;
        //  837    844    844    845    Any
        //  838    844    3      8      Any
        //  848    855    855    856    Any
        //  848    855    855    856    Ljava/lang/UnsupportedOperationException;
        //  848    855    855    856    Ljava/lang/NullPointerException;
        //  848    855    848    849    Any
        //  848    855    848    849    Ljava/lang/EnumConstantNotPresentException;
        //  912    919    919    920    Any
        //  912    919    912    913    Ljava/lang/EnumConstantNotPresentException;
        //  912    919    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  913    919    912    913    Any
        //  913    919    3      8      Any
        //  931    938    938    939    Any
        //  932    938    3      8      Ljava/lang/IllegalArgumentException;
        //  931    938    931    932    Ljava/util/NoSuchElementException;
        //  931    938    3      8      Ljava/lang/AssertionError;
        //  932    938    931    932    Any
        //  942    949    949    950    Any
        //  942    949    942    943    Ljava/lang/RuntimeException;
        //  943    949    942    943    Any
        //  943    949    942    943    Any
        //  943    949    942    943    Any
        //  955    962    962    963    Any
        //  956    962    955    956    Any
        //  955    962    3      8      Any
        //  955    962    955    956    Any
        //  955    962    3      8      Any
        //  966    973    973    974    Any
        //  966    973    966    967    Ljava/lang/ClassCastException;
        //  966    973    973    974    Any
        //  966    973    3      8      Ljava/lang/AssertionError;
        //  967    973    966    967    Any
        //  978    984    984    985    Any
        //  978    984    3      8      Ljava/lang/NumberFormatException;
        //  978    984    3      8      Any
        //  978    984    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  978    984    984    985    Ljava/lang/ArithmeticException;
        //  988    995    995    996    Any
        //  988    995    995    996    Any
        //  989    995    988    989    Ljava/lang/EnumConstantNotPresentException;
        //  988    995    3      8      Any
        //  989    995    995    996    Ljava/util/NoSuchElementException;
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
    
    public void 0(@NotNull final BufferBuilder p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final int p7, final int p8, final int p9, final int p10, final int p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          5040
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            5032
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            5024
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: iload           12
        //    28: bipush          17
        //    30: iand           
        //    31: ifeq            458
        //    34: aload_1        
        //    35: fload_2        
        //    36: f2d            
        //    37: getstatic       dev/nuker/pyro/fc.1:I
        //    40: ifeq            49
        //    43: ldc_w           1850985291
        //    46: goto            52
        //    49: ldc_w           685088618
        //    52: ldc_w           443510839
        //    55: ixor           
        //    56: lookupswitch {
        //          1188504277: 49
        //          1950137212: 4977
        //          default: 84
        //        }
        //    84: fload_3        
        //    85: f2d            
        //    86: fload           4
        //    88: f2d            
        //    89: goto            93
        //    92: athrow         
        //    93: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //    96: goto            100
        //    99: athrow         
        //   100: iload           8
        //   102: iload           9
        //   104: iload           10
        //   106: getstatic       dev/nuker/pyro/fc.1:I
        //   109: ifeq            118
        //   112: ldc_w           -1090908309
        //   115: goto            121
        //   118: ldc_w           1983517402
        //   121: ldc_w           1903153025
        //   124: ixor           
        //   125: lookupswitch {
        //          -812269334: 118
        //          123067739: 152
        //          default: 4877
        //        }
        //   152: iload           11
        //   154: goto            158
        //   157: athrow         
        //   158: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   161: goto            165
        //   164: athrow         
        //   165: goto            169
        //   168: athrow         
        //   169: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   172: goto            176
        //   175: athrow         
        //   176: aload_1        
        //   177: fload_2        
        //   178: f2d            
        //   179: fload_3        
        //   180: f2d            
        //   181: getstatic       dev/nuker/pyro/fc.0:I
        //   184: ifeq            193
        //   187: ldc_w           614265608
        //   190: goto            196
        //   193: ldc_w           1111797646
        //   196: ldc_w           -97832228
        //   199: ixor           
        //   200: lookupswitch {
        //          -1462119045: 193
        //          -558382636: 4911
        //          default: 228
        //        }
        //   228: fload           4
        //   230: f2d            
        //   231: getstatic       dev/nuker/pyro/fc.c:I
        //   234: ifge            243
        //   237: ldc_w           -170777554
        //   240: goto            246
        //   243: ldc_w           -918989132
        //   246: ldc_w           1918528751
        //   249: ixor           
        //   250: lookupswitch {
        //          -2021111615: 243
        //          -1151124901: 276
        //          default: 4893
        //        }
        //   276: fload           7
        //   278: f2d            
        //   279: dadd           
        //   280: getstatic       dev/nuker/pyro/fc.c:I
        //   283: ifge            292
        //   286: ldc_w           2084469833
        //   289: goto            295
        //   292: ldc_w           -1710088614
        //   295: ldc_w           1404152995
        //   298: ixor           
        //   299: lookupswitch {
        //          -912018695: 324
        //          797954282: 292
        //          default: 4981
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   331: goto            335
        //   334: athrow         
        //   335: iload           8
        //   337: iload           9
        //   339: iload           10
        //   341: getstatic       dev/nuker/pyro/fc.1:I
        //   344: ifeq            353
        //   347: ldc_w           1070645641
        //   350: goto            356
        //   353: ldc_w           -1903116955
        //   356: ldc_w           100264772
        //   359: ixor           
        //   360: lookupswitch {
        //          429888425: 353
        //          975776461: 4881
        //          default: 388
        //        }
        //   388: iload           11
        //   390: getstatic       dev/nuker/pyro/fc.1:I
        //   393: ifeq            402
        //   396: ldc_w           -212231425
        //   399: goto            405
        //   402: ldc_w           -504355357
        //   405: ldc_w           -1163212995
        //   408: ixor           
        //   409: lookupswitch {
        //          1240686018: 402
        //          1532682974: 436
        //          default: 4909
        //        }
        //   436: goto            440
        //   439: athrow         
        //   440: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   443: goto            447
        //   446: athrow         
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   454: goto            458
        //   457: athrow         
        //   458: iload           12
        //   460: bipush          18
        //   462: iand           
        //   463: ifeq            892
        //   466: aload_1        
        //   467: fload_2        
        //   468: f2d            
        //   469: fload_3        
        //   470: f2d            
        //   471: getstatic       dev/nuker/pyro/fc.0:I
        //   474: ifeq            483
        //   477: ldc_w           -939766245
        //   480: goto            486
        //   483: ldc_w           -124347665
        //   486: ldc_w           -759167644
        //   489: ixor           
        //   490: lookupswitch {
        //          356273023: 483
        //          710320011: 516
        //          default: 4891
        //        }
        //   516: fload           6
        //   518: f2d            
        //   519: dadd           
        //   520: getstatic       dev/nuker/pyro/fc.1:I
        //   523: ifeq            532
        //   526: ldc_w           323327817
        //   529: goto            535
        //   532: ldc_w           224476894
        //   535: ldc_w           -1379069388
        //   538: ixor           
        //   539: lookupswitch {
        //          -1098349187: 4879
        //          1699226709: 532
        //          default: 564
        //        }
        //   564: fload           4
        //   566: f2d            
        //   567: goto            571
        //   570: athrow         
        //   571: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   574: goto            578
        //   577: athrow         
        //   578: iload           8
        //   580: getstatic       dev/nuker/pyro/fc.1:I
        //   583: ifeq            592
        //   586: ldc_w           -1053858592
        //   589: goto            595
        //   592: ldc_w           -959850085
        //   595: ldc_w           -1008078044
        //   598: ixor           
        //   599: lookupswitch {
        //          46569412: 4961
        //          1717045535: 592
        //          default: 624
        //        }
        //   624: iload           9
        //   626: getstatic       dev/nuker/pyro/fc.0:I
        //   629: ifeq            638
        //   632: ldc_w           1980664156
        //   635: goto            641
        //   638: ldc_w           202575223
        //   641: ldc_w           33669551
        //   644: ixor           
        //   645: lookupswitch {
        //          236113112: 672
        //          1947158771: 638
        //          default: 4987
        //        }
        //   672: iload           10
        //   674: iload           11
        //   676: getstatic       dev/nuker/pyro/fc.0:I
        //   679: ifeq            688
        //   682: ldc_w           1247786627
        //   685: goto            691
        //   688: ldc_w           409726764
        //   691: ldc_w           192626995
        //   694: ixor           
        //   695: lookupswitch {
        //          900168842: 688
        //          1092941744: 4957
        //          default: 720
        //        }
        //   720: goto            724
        //   723: athrow         
        //   724: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   727: goto            731
        //   730: athrow         
        //   731: goto            735
        //   734: athrow         
        //   735: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   738: goto            742
        //   741: athrow         
        //   742: aload_1        
        //   743: fload_2        
        //   744: f2d            
        //   745: getstatic       dev/nuker/pyro/fc.c:I
        //   748: ifge            757
        //   751: ldc_w           -138270351
        //   754: goto            760
        //   757: ldc_w           1429157229
        //   760: ldc_w           112298098
        //   763: ixor           
        //   764: lookupswitch {
        //          -244080381: 757
        //          1402912031: 792
        //          default: 4871
        //        }
        //   792: fload_3        
        //   793: f2d            
        //   794: fload           6
        //   796: f2d            
        //   797: dadd           
        //   798: fload           4
        //   800: f2d            
        //   801: fload           7
        //   803: f2d            
        //   804: dadd           
        //   805: goto            809
        //   808: athrow         
        //   809: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   812: goto            816
        //   815: athrow         
        //   816: iload           8
        //   818: getstatic       dev/nuker/pyro/fc.1:I
        //   821: ifeq            830
        //   824: ldc_w           -445797212
        //   827: goto            833
        //   830: ldc_w           1318145234
        //   833: ldc_w           -2009235061
        //   836: ixor           
        //   837: lookupswitch {
        //          -961753767: 864
        //          1833970991: 830
        //          default: 4965
        //        }
        //   864: iload           9
        //   866: iload           10
        //   868: iload           11
        //   870: goto            874
        //   873: athrow         
        //   874: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   877: goto            881
        //   880: athrow         
        //   881: goto            885
        //   884: athrow         
        //   885: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   888: goto            892
        //   891: athrow         
        //   892: iload           12
        //   894: bipush          33
        //   896: iand           
        //   897: ifeq            1236
        //   900: getstatic       dev/nuker/pyro/fc.1:I
        //   903: ifeq            912
        //   906: ldc_w           -888945963
        //   909: goto            915
        //   912: ldc_w           2059419018
        //   915: ldc_w           1498564057
        //   918: ixor           
        //   919: lookupswitch {
        //          -1840150772: 912
        //          596801619: 944
        //          default: 4887
        //        }
        //   944: aload_1        
        //   945: getstatic       dev/nuker/pyro/fc.c:I
        //   948: ifge            957
        //   951: ldc_w           -671881858
        //   954: goto            960
        //   957: ldc_w           1150041473
        //   960: ldc_w           -278342508
        //   963: ixor           
        //   964: lookupswitch {
        //          -1411061483: 992
        //          949694954: 957
        //          default: 4901
        //        }
        //   992: fload_2        
        //   993: f2d            
        //   994: fload           5
        //   996: f2d            
        //   997: dadd           
        //   998: fload_3        
        //   999: f2d            
        //  1000: fload           4
        //  1002: f2d            
        //  1003: goto            1007
        //  1006: athrow         
        //  1007: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1010: goto            1014
        //  1013: athrow         
        //  1014: iload           8
        //  1016: getstatic       dev/nuker/pyro/fc.c:I
        //  1019: ifge            1028
        //  1022: ldc_w           1435549249
        //  1025: goto            1031
        //  1028: ldc_w           394658472
        //  1031: ldc_w           1296944567
        //  1034: ixor           
        //  1035: lookupswitch {
        //          417166326: 1028
        //          1523306271: 1060
        //          default: 4943
        //        }
        //  1060: iload           9
        //  1062: iload           10
        //  1064: iload           11
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: goto            1081
        //  1080: athrow         
        //  1081: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1084: goto            1088
        //  1087: athrow         
        //  1088: aload_1        
        //  1089: fload_2        
        //  1090: f2d            
        //  1091: fload           5
        //  1093: f2d            
        //  1094: dadd           
        //  1095: fload_3        
        //  1096: f2d            
        //  1097: fload           4
        //  1099: f2d            
        //  1100: getstatic       dev/nuker/pyro/fc.c:I
        //  1103: ifge            1112
        //  1106: ldc_w           -528921252
        //  1109: goto            1115
        //  1112: ldc_w           636369391
        //  1115: ldc_w           19507715
        //  1118: ixor           
        //  1119: lookupswitch {
        //          -514791585: 4951
        //          1551244520: 1112
        //          default: 1144
        //        }
        //  1144: fload           7
        //  1146: f2d            
        //  1147: dadd           
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: iload           8
        //  1161: iload           9
        //  1163: iload           10
        //  1165: getstatic       dev/nuker/pyro/fc.c:I
        //  1168: ifge            1177
        //  1171: ldc_w           -1111800301
        //  1174: goto            1180
        //  1177: ldc_w           -1661932403
        //  1180: ldc_w           -1777351084
        //  1183: ixor           
        //  1184: lookupswitch {
        //          565110075: 1177
        //          733249607: 4869
        //          default: 1212
        //        }
        //  1212: iload           11
        //  1214: goto            1218
        //  1217: athrow         
        //  1218: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1221: goto            1225
        //  1224: athrow         
        //  1225: goto            1229
        //  1228: athrow         
        //  1229: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: iload           12
        //  1238: bipush          34
        //  1240: iand           
        //  1241: ifeq            1250
        //  1244: ldc_w           -29219729
        //  1247: goto            1253
        //  1250: ldc_w           -29219730
        //  1253: ldc_w           -715823141
        //  1256: ixor           
        //  1257: tableswitch {
        //          1445889896: 1280
        //          1445889897: 1490
        //          default: 1244
        //        }
        //  1280: aload_1        
        //  1281: fload_2        
        //  1282: f2d            
        //  1283: fload           5
        //  1285: f2d            
        //  1286: dadd           
        //  1287: fload_3        
        //  1288: f2d            
        //  1289: getstatic       dev/nuker/pyro/fc.c:I
        //  1292: ifge            1301
        //  1295: ldc_w           -1472110764
        //  1298: goto            1304
        //  1301: ldc_w           -1452407843
        //  1304: ldc_w           -871560198
        //  1307: ixor           
        //  1308: lookupswitch {
        //          1682724014: 1301
        //          1700988967: 1336
        //          default: 4921
        //        }
        //  1336: fload           6
        //  1338: f2d            
        //  1339: dadd           
        //  1340: fload           4
        //  1342: f2d            
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: iload           8
        //  1356: iload           9
        //  1358: iload           10
        //  1360: iload           11
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1369: goto            1373
        //  1372: athrow         
        //  1373: goto            1377
        //  1376: athrow         
        //  1377: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1380: goto            1384
        //  1383: athrow         
        //  1384: aload_1        
        //  1385: fload_2        
        //  1386: f2d            
        //  1387: fload           5
        //  1389: f2d            
        //  1390: dadd           
        //  1391: fload_3        
        //  1392: f2d            
        //  1393: fload           6
        //  1395: f2d            
        //  1396: dadd           
        //  1397: fload           4
        //  1399: f2d            
        //  1400: fload           7
        //  1402: f2d            
        //  1403: dadd           
        //  1404: goto            1408
        //  1407: athrow         
        //  1408: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1411: goto            1415
        //  1414: athrow         
        //  1415: getstatic       dev/nuker/pyro/fc.0:I
        //  1418: ifeq            1427
        //  1421: ldc_w           -1727819858
        //  1424: goto            1430
        //  1427: ldc_w           1392063353
        //  1430: ldc_w           66227875
        //  1433: ixor           
        //  1434: lookupswitch {
        //          -1695481587: 4875
        //          1548432853: 1427
        //          default: 1460
        //        }
        //  1460: iload           8
        //  1462: iload           9
        //  1464: iload           10
        //  1466: iload           11
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1475: goto            1479
        //  1478: athrow         
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: iload           12
        //  1492: iconst_5       
        //  1493: iand           
        //  1494: ifeq            1830
        //  1497: getstatic       dev/nuker/pyro/fc.0:I
        //  1500: ifeq            1509
        //  1503: ldc_w           393959487
        //  1506: goto            1512
        //  1509: ldc_w           940282053
        //  1512: ldc_w           -1596828358
        //  1515: ixor           
        //  1516: lookupswitch {
        //          -1267591582: 1509
        //          -1213657851: 4897
        //          default: 1544
        //        }
        //  1544: aload_1        
        //  1545: fload_2        
        //  1546: f2d            
        //  1547: getstatic       dev/nuker/pyro/fc.1:I
        //  1550: ifeq            1559
        //  1553: ldc_w           1327235496
        //  1556: goto            1562
        //  1559: ldc_w           -1432902425
        //  1562: ldc_w           352598307
        //  1565: ixor           
        //  1566: lookupswitch {
        //          -1080844860: 1592
        //          1511536779: 1559
        //          default: 4955
        //        }
        //  1592: fload_3        
        //  1593: f2d            
        //  1594: getstatic       dev/nuker/pyro/fc.1:I
        //  1597: ifeq            1606
        //  1600: ldc_w           -1733690069
        //  1603: goto            1609
        //  1606: ldc_w           910566211
        //  1609: ldc_w           2126438004
        //  1612: ixor           
        //  1613: lookupswitch {
        //          -434691233: 5013
        //          1779718241: 1606
        //          default: 1640
        //        }
        //  1640: fload           4
        //  1642: f2d            
        //  1643: goto            1647
        //  1646: athrow         
        //  1647: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1650: goto            1654
        //  1653: athrow         
        //  1654: iload           8
        //  1656: iload           9
        //  1658: iload           10
        //  1660: iload           11
        //  1662: goto            1666
        //  1665: athrow         
        //  1666: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1669: goto            1673
        //  1672: athrow         
        //  1673: goto            1677
        //  1676: athrow         
        //  1677: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1680: goto            1684
        //  1683: athrow         
        //  1684: aload_1        
        //  1685: getstatic       dev/nuker/pyro/fc.1:I
        //  1688: ifeq            1697
        //  1691: ldc_w           1179097885
        //  1694: goto            1700
        //  1697: ldc_w           489181785
        //  1700: ldc_w           925408141
        //  1703: ixor           
        //  1704: lookupswitch {
        //          704694740: 1732
        //          1903100048: 1697
        //          default: 5007
        //        }
        //  1732: fload_2        
        //  1733: f2d            
        //  1734: fload           5
        //  1736: f2d            
        //  1737: dadd           
        //  1738: fload_3        
        //  1739: f2d            
        //  1740: fload           4
        //  1742: f2d            
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1750: goto            1754
        //  1753: athrow         
        //  1754: getstatic       dev/nuker/pyro/fc.1:I
        //  1757: ifeq            1766
        //  1760: ldc_w           -2126842421
        //  1763: goto            1769
        //  1766: ldc_w           237524492
        //  1769: ldc_w           828668725
        //  1772: ixor           
        //  1773: lookupswitch {
        //          -1335980290: 1766
        //          1061956921: 1800
        //          default: 4967
        //        }
        //  1800: iload           8
        //  1802: iload           9
        //  1804: iload           10
        //  1806: iload           11
        //  1808: goto            1812
        //  1811: athrow         
        //  1812: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1815: goto            1819
        //  1818: athrow         
        //  1819: goto            1823
        //  1822: athrow         
        //  1823: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1826: goto            1830
        //  1829: athrow         
        //  1830: getstatic       dev/nuker/pyro/fc.0:I
        //  1833: ifeq            1842
        //  1836: ldc_w           1256414566
        //  1839: goto            1845
        //  1842: ldc_w           1380256790
        //  1845: ldc_w           2031748776
        //  1848: ixor           
        //  1849: lookupswitch {
        //          727648958: 1876
        //          871979982: 1842
        //          default: 4949
        //        }
        //  1876: iload           12
        //  1878: bipush          6
        //  1880: iand           
        //  1881: ifeq            2175
        //  1884: aload_1        
        //  1885: fload_2        
        //  1886: f2d            
        //  1887: fload_3        
        //  1888: f2d            
        //  1889: fload           6
        //  1891: f2d            
        //  1892: dadd           
        //  1893: fload           4
        //  1895: f2d            
        //  1896: goto            1900
        //  1899: athrow         
        //  1900: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1903: goto            1907
        //  1906: athrow         
        //  1907: iload           8
        //  1909: iload           9
        //  1911: iload           10
        //  1913: iload           11
        //  1915: getstatic       dev/nuker/pyro/fc.0:I
        //  1918: ifeq            1927
        //  1921: ldc_w           716762685
        //  1924: goto            1930
        //  1927: ldc_w           -1808850921
        //  1930: ldc_w           -54866860
        //  1933: ixor           
        //  1934: lookupswitch {
        //          -1588475281: 1927
        //          -704503191: 4953
        //          default: 1960
        //        }
        //  1960: goto            1964
        //  1963: athrow         
        //  1964: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1967: goto            1971
        //  1970: athrow         
        //  1971: goto            1975
        //  1974: athrow         
        //  1975: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1978: goto            1982
        //  1981: athrow         
        //  1982: aload_1        
        //  1983: fload_2        
        //  1984: f2d            
        //  1985: fload           5
        //  1987: f2d            
        //  1988: dadd           
        //  1989: fload_3        
        //  1990: f2d            
        //  1991: getstatic       dev/nuker/pyro/fc.0:I
        //  1994: ifeq            2003
        //  1997: ldc_w           -213689373
        //  2000: goto            2006
        //  2003: ldc_w           -969816369
        //  2006: ldc_w           -1376817532
        //  2009: ixor           
        //  2010: lookupswitch {
        //          1588344167: 2003
        //          1809754187: 2036
        //          default: 4979
        //        }
        //  2036: fload           6
        //  2038: f2d            
        //  2039: dadd           
        //  2040: fload           4
        //  2042: f2d            
        //  2043: goto            2047
        //  2046: athrow         
        //  2047: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2050: goto            2054
        //  2053: athrow         
        //  2054: iload           8
        //  2056: iload           9
        //  2058: getstatic       dev/nuker/pyro/fc.0:I
        //  2061: ifeq            2070
        //  2064: ldc_w           319065569
        //  2067: goto            2073
        //  2070: ldc_w           506638840
        //  2073: ldc_w           -452801165
        //  2076: ixor           
        //  2077: lookupswitch {
        //          -167362414: 2070
        //          -80708469: 2104
        //          default: 4905
        //        }
        //  2104: iload           10
        //  2106: iload           11
        //  2108: goto            2112
        //  2111: athrow         
        //  2112: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2115: goto            2119
        //  2118: athrow         
        //  2119: getstatic       dev/nuker/pyro/fc.1:I
        //  2122: ifeq            2131
        //  2125: ldc_w           1612054006
        //  2128: goto            2134
        //  2131: ldc_w           288946159
        //  2134: ldc_w           770401458
        //  2137: ixor           
        //  2138: lookupswitch {
        //          1020498781: 2164
        //          1308531012: 2131
        //          default: 5001
        //        }
        //  2164: goto            2168
        //  2167: athrow         
        //  2168: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2171: goto            2175
        //  2174: athrow         
        //  2175: iload           12
        //  2177: bipush          9
        //  2179: iand           
        //  2180: ifeq            2189
        //  2183: ldc_w           -1784555470
        //  2186: goto            2192
        //  2189: ldc_w           -1784555469
        //  2192: ldc_w           363655670
        //  2195: ixor           
        //  2196: tableswitch {
        //          1725320: 2220
        //          1725321: 2692
        //          default: 2183
        //        }
        //  2220: aload_1        
        //  2221: fload_2        
        //  2222: f2d            
        //  2223: getstatic       dev/nuker/pyro/fc.1:I
        //  2226: ifeq            2235
        //  2229: ldc_w           1447959532
        //  2232: goto            2238
        //  2235: ldc_w           1197584455
        //  2238: ldc_w           -622572985
        //  2241: ixor           
        //  2242: lookupswitch {
        //          -1934995029: 4945
        //          -723851240: 2235
        //          default: 2268
        //        }
        //  2268: fload_3        
        //  2269: f2d            
        //  2270: fload           4
        //  2272: f2d            
        //  2273: fload           7
        //  2275: f2d            
        //  2276: dadd           
        //  2277: goto            2281
        //  2280: athrow         
        //  2281: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2284: goto            2288
        //  2287: athrow         
        //  2288: getstatic       dev/nuker/pyro/fc.0:I
        //  2291: ifeq            2300
        //  2294: ldc_w           -1723886465
        //  2297: goto            2303
        //  2300: ldc_w           -374076525
        //  2303: ldc_w           -1574994350
        //  2306: ixor           
        //  2307: lookupswitch {
        //          -1958524285: 2300
        //          992012845: 4919
        //          default: 2332
        //        }
        //  2332: iload           8
        //  2334: getstatic       dev/nuker/pyro/fc.0:I
        //  2337: ifeq            2346
        //  2340: ldc_w           -806349310
        //  2343: goto            2349
        //  2346: ldc_w           1999575427
        //  2349: ldc_w           -1228744395
        //  2352: ixor           
        //  2353: lookupswitch {
        //          -1041383242: 2380
        //          2033372983: 2346
        //          default: 4933
        //        }
        //  2380: iload           9
        //  2382: iload           10
        //  2384: iload           11
        //  2386: goto            2390
        //  2389: athrow         
        //  2390: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2393: goto            2397
        //  2396: athrow         
        //  2397: getstatic       dev/nuker/pyro/fc.1:I
        //  2400: ifeq            2409
        //  2403: ldc_w           67894065
        //  2406: goto            2412
        //  2409: ldc_w           1663307644
        //  2412: ldc_w           -165939720
        //  2415: ixor           
        //  2416: lookupswitch {
        //          -1790969212: 2444
        //          -233828663: 2409
        //          default: 4989
        //        }
        //  2444: goto            2448
        //  2447: athrow         
        //  2448: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2451: goto            2455
        //  2454: athrow         
        //  2455: getstatic       dev/nuker/pyro/fc.c:I
        //  2458: ifge            2467
        //  2461: ldc_w           -727432704
        //  2464: goto            2470
        //  2467: ldc_w           -1433648349
        //  2470: ldc_w           -1117561827
        //  2473: ixor           
        //  2474: lookupswitch {
        //          401547070: 2500
        //          1774657053: 2467
        //          default: 4935
        //        }
        //  2500: aload_1        
        //  2501: fload_2        
        //  2502: f2d            
        //  2503: getstatic       dev/nuker/pyro/fc.0:I
        //  2506: ifeq            2515
        //  2509: ldc_w           -435043911
        //  2512: goto            2518
        //  2515: ldc_w           758600526
        //  2518: ldc_w           -816903871
        //  2521: ixor           
        //  2522: lookupswitch {
        //          694077688: 4937
        //          1523493324: 2515
        //          default: 2548
        //        }
        //  2548: fload           5
        //  2550: f2d            
        //  2551: dadd           
        //  2552: getstatic       dev/nuker/pyro/fc.0:I
        //  2555: ifeq            2564
        //  2558: ldc_w           -572438485
        //  2561: goto            2567
        //  2564: ldc_w           1733630681
        //  2567: ldc_w           -1760770110
        //  2570: ixor           
        //  2571: lookupswitch {
        //          1257082857: 5005
        //          1324328268: 2564
        //          default: 2596
        //        }
        //  2596: fload_3        
        //  2597: f2d            
        //  2598: getstatic       dev/nuker/pyro/fc.c:I
        //  2601: ifge            2610
        //  2604: ldc_w           -2131349205
        //  2607: goto            2613
        //  2610: ldc_w           1580555869
        //  2613: ldc_w           -1254641055
        //  2616: ixor           
        //  2617: lookupswitch {
        //          -1338005234: 2610
        //          901874506: 4991
        //          default: 2644
        //        }
        //  2644: fload           4
        //  2646: f2d            
        //  2647: fload           7
        //  2649: f2d            
        //  2650: dadd           
        //  2651: goto            2655
        //  2654: athrow         
        //  2655: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2658: goto            2662
        //  2661: athrow         
        //  2662: iload           8
        //  2664: iload           9
        //  2666: iload           10
        //  2668: iload           11
        //  2670: goto            2674
        //  2673: athrow         
        //  2674: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2677: goto            2681
        //  2680: athrow         
        //  2681: goto            2685
        //  2684: athrow         
        //  2685: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2688: goto            2692
        //  2691: athrow         
        //  2692: iload           12
        //  2694: bipush          10
        //  2696: iand           
        //  2697: ifeq            2999
        //  2700: aload_1        
        //  2701: fload_2        
        //  2702: f2d            
        //  2703: fload_3        
        //  2704: f2d            
        //  2705: fload           6
        //  2707: f2d            
        //  2708: dadd           
        //  2709: fload           4
        //  2711: f2d            
        //  2712: fload           7
        //  2714: f2d            
        //  2715: dadd           
        //  2716: goto            2720
        //  2719: athrow         
        //  2720: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2723: goto            2727
        //  2726: athrow         
        //  2727: iload           8
        //  2729: iload           9
        //  2731: iload           10
        //  2733: iload           11
        //  2735: getstatic       dev/nuker/pyro/fc.0:I
        //  2738: ifeq            2747
        //  2741: ldc_w           1421595597
        //  2744: goto            2750
        //  2747: ldc_w           1425527895
        //  2750: ldc_w           -162278886
        //  2753: ixor           
        //  2754: lookupswitch {
        //          -1566308787: 2780
        //          -1561853481: 2747
        //          default: 4939
        //        }
        //  2780: goto            2784
        //  2783: athrow         
        //  2784: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2787: goto            2791
        //  2790: athrow         
        //  2791: getstatic       dev/nuker/pyro/fc.1:I
        //  2794: ifeq            2803
        //  2797: ldc_w           -1255202102
        //  2800: goto            2806
        //  2803: ldc_w           611656454
        //  2806: ldc_w           -1564823903
        //  2809: ixor           
        //  2810: lookupswitch {
        //          -2033218137: 2836
        //          395676779: 2803
        //          default: 4971
        //        }
        //  2836: goto            2840
        //  2839: athrow         
        //  2840: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2843: goto            2847
        //  2846: athrow         
        //  2847: aload_1        
        //  2848: getstatic       dev/nuker/pyro/fc.c:I
        //  2851: ifge            2860
        //  2854: ldc_w           -575737116
        //  2857: goto            2863
        //  2860: ldc_w           -702309097
        //  2863: ldc_w           -1907819381
        //  2866: ixor           
        //  2867: lookupswitch {
        //          -72270705: 2860
        //          1407585903: 4899
        //          default: 2892
        //        }
        //  2892: fload_2        
        //  2893: f2d            
        //  2894: fload           5
        //  2896: f2d            
        //  2897: dadd           
        //  2898: fload_3        
        //  2899: f2d            
        //  2900: fload           6
        //  2902: f2d            
        //  2903: dadd           
        //  2904: fload           4
        //  2906: f2d            
        //  2907: fload           7
        //  2909: f2d            
        //  2910: dadd           
        //  2911: goto            2915
        //  2914: athrow         
        //  2915: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2918: goto            2922
        //  2921: athrow         
        //  2922: iload           8
        //  2924: iload           9
        //  2926: iload           10
        //  2928: iload           11
        //  2930: goto            2934
        //  2933: athrow         
        //  2934: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2937: goto            2941
        //  2940: athrow         
        //  2941: getstatic       dev/nuker/pyro/fc.1:I
        //  2944: ifeq            2953
        //  2947: ldc_w           174538043
        //  2950: goto            2956
        //  2953: ldc_w           1016801261
        //  2956: ldc_w           -97000013
        //  2959: ixor           
        //  2960: lookupswitch {
        //          -1085589137: 2953
        //          -263137144: 4927
        //          default: 2988
        //        }
        //  2988: goto            2992
        //  2991: athrow         
        //  2992: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2995: goto            2999
        //  2998: athrow         
        //  2999: iload           12
        //  3001: bipush          20
        //  3003: iand           
        //  3004: ifeq            3334
        //  3007: aload_1        
        //  3008: getstatic       dev/nuker/pyro/fc.0:I
        //  3011: ifeq            3020
        //  3014: ldc_w           -1537943234
        //  3017: goto            3023
        //  3020: ldc_w           -554054722
        //  3023: ldc_w           1521500209
        //  3026: ixor           
        //  3027: lookupswitch {
        //          -2075554929: 3052
        //          -18573041: 3020
        //          default: 4913
        //        }
        //  3052: fload_2        
        //  3053: f2d            
        //  3054: fload_3        
        //  3055: f2d            
        //  3056: fload           4
        //  3058: f2d            
        //  3059: goto            3063
        //  3062: athrow         
        //  3063: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3066: goto            3070
        //  3069: athrow         
        //  3070: iload           8
        //  3072: iload           9
        //  3074: iload           10
        //  3076: iload           11
        //  3078: getstatic       dev/nuker/pyro/fc.c:I
        //  3081: ifge            3090
        //  3084: ldc_w           -577198556
        //  3087: goto            3093
        //  3090: ldc_w           -1791832955
        //  3093: ldc_w           -2099034749
        //  3096: ixor           
        //  3097: lookupswitch {
        //          399608070: 3124
        //          1601954727: 3090
        //          default: 4969
        //        }
        //  3124: goto            3128
        //  3127: athrow         
        //  3128: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3131: goto            3135
        //  3134: athrow         
        //  3135: goto            3139
        //  3138: athrow         
        //  3139: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  3142: goto            3146
        //  3145: athrow         
        //  3146: aload_1        
        //  3147: getstatic       dev/nuker/pyro/fc.1:I
        //  3150: ifeq            3159
        //  3153: ldc_w           1473506409
        //  3156: goto            3162
        //  3159: ldc_w           -1792416773
        //  3162: ldc_w           -981502788
        //  3165: ixor           
        //  3166: lookupswitch {
        //          -1834182443: 4915
        //          -1357204176: 3159
        //          default: 3192
        //        }
        //  3192: fload_2        
        //  3193: f2d            
        //  3194: fload_3        
        //  3195: f2d            
        //  3196: fload           6
        //  3198: f2d            
        //  3199: dadd           
        //  3200: fload           4
        //  3202: f2d            
        //  3203: goto            3207
        //  3206: athrow         
        //  3207: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3210: goto            3214
        //  3213: athrow         
        //  3214: iload           8
        //  3216: getstatic       dev/nuker/pyro/fc.c:I
        //  3219: ifge            3228
        //  3222: ldc_w           770454432
        //  3225: goto            3231
        //  3228: ldc_w           1155186694
        //  3231: ldc_w           1139084473
        //  3234: ixor           
        //  3235: lookupswitch {
        //          121621695: 3260
        //          1846099737: 3228
        //          default: 4883
        //        }
        //  3260: iload           9
        //  3262: getstatic       dev/nuker/pyro/fc.1:I
        //  3265: ifeq            3274
        //  3268: ldc_w           271831100
        //  3271: goto            3277
        //  3274: ldc_w           -50247056
        //  3277: ldc_w           115572819
        //  3280: ixor           
        //  3281: lookupswitch {
        //          382750831: 4903
        //          646244897: 3274
        //          default: 3308
        //        }
        //  3308: iload           10
        //  3310: iload           11
        //  3312: goto            3316
        //  3315: athrow         
        //  3316: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3319: goto            3323
        //  3322: athrow         
        //  3323: goto            3327
        //  3326: athrow         
        //  3327: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  3330: goto            3334
        //  3333: athrow         
        //  3334: iload           12
        //  3336: bipush          36
        //  3338: iand           
        //  3339: ifeq            3348
        //  3342: ldc_w           1674701402
        //  3345: goto            3351
        //  3348: ldc_w           1674701401
        //  3351: ldc_w           -1584380773
        //  3354: ixor           
        //  3355: tableswitch {
        //          -2071765630: 3376
        //          -2071765629: 3939
        //          default: 3342
        //        }
        //  3376: aload_1        
        //  3377: getstatic       dev/nuker/pyro/fc.1:I
        //  3380: ifeq            3389
        //  3383: ldc_w           -63332208
        //  3386: goto            3392
        //  3389: ldc_w           134214809
        //  3392: ldc_w           -1213107610
        //  3395: ixor           
        //  3396: lookupswitch {
        //          14509784: 3389
        //          1267258102: 4983
        //          default: 3424
        //        }
        //  3424: fload_2        
        //  3425: f2d            
        //  3426: fload           5
        //  3428: f2d            
        //  3429: dadd           
        //  3430: fload_3        
        //  3431: f2d            
        //  3432: getstatic       dev/nuker/pyro/fc.1:I
        //  3435: ifeq            3444
        //  3438: ldc_w           1718658928
        //  3441: goto            3447
        //  3444: ldc_w           864700358
        //  3447: ldc_w           1931561248
        //  3450: ixor           
        //  3451: lookupswitch {
        //          357690960: 3444
        //          1084952294: 3476
        //          default: 4917
        //        }
        //  3476: fload           4
        //  3478: f2d            
        //  3479: goto            3483
        //  3482: athrow         
        //  3483: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3486: goto            3490
        //  3489: athrow         
        //  3490: iload           8
        //  3492: iload           9
        //  3494: iload           10
        //  3496: iload           11
        //  3498: getstatic       dev/nuker/pyro/fc.c:I
        //  3501: ifge            3510
        //  3504: ldc_w           -1592423739
        //  3507: goto            3513
        //  3510: ldc_w           92701494
        //  3513: ldc_w           322473842
        //  3516: ixor           
        //  3517: lookupswitch {
        //          -1305672265: 3510
        //          381553732: 3544
        //          default: 4999
        //        }
        //  3544: goto            3548
        //  3547: athrow         
        //  3548: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3551: goto            3555
        //  3554: athrow         
        //  3555: getstatic       dev/nuker/pyro/fc.1:I
        //  3558: ifeq            3567
        //  3561: ldc_w           -1242828348
        //  3564: goto            3570
        //  3567: ldc_w           -1594756665
        //  3570: ldc_w           737770689
        //  3573: ixor           
        //  3574: lookupswitch {
        //          -1642951419: 4907
        //          -630847194: 3567
        //          default: 3600
        //        }
        //  3600: goto            3604
        //  3603: athrow         
        //  3604: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  3607: goto            3611
        //  3610: athrow         
        //  3611: aload_1        
        //  3612: getstatic       dev/nuker/pyro/fc.c:I
        //  3615: ifge            3624
        //  3618: ldc_w           1680096961
        //  3621: goto            3627
        //  3624: ldc_w           1760091917
        //  3627: ldc_w           -330933078
        //  3630: ixor           
        //  3631: lookupswitch {
        //          -2068937817: 3656
        //          -2006818197: 3624
        //          default: 4975
        //        }
        //  3656: fload_2        
        //  3657: f2d            
        //  3658: fload           5
        //  3660: f2d            
        //  3661: dadd           
        //  3662: getstatic       dev/nuker/pyro/fc.1:I
        //  3665: ifeq            3674
        //  3668: ldc_w           1619693592
        //  3671: goto            3677
        //  3674: ldc_w           1348153946
        //  3677: ldc_w           -2026926825
        //  3680: ixor           
        //  3681: lookupswitch {
        //          -680214707: 3708
        //          -408609521: 3674
        //          default: 4985
        //        }
        //  3708: fload_3        
        //  3709: f2d            
        //  3710: getstatic       dev/nuker/pyro/fc.1:I
        //  3713: ifeq            3722
        //  3716: ldc_w           1710132474
        //  3719: goto            3725
        //  3722: ldc_w           -526834810
        //  3725: ldc_w           -1843735687
        //  3728: ixor           
        //  3729: lookupswitch {
        //          -134979709: 4995
        //          360021457: 3722
        //          default: 3756
        //        }
        //  3756: fload           6
        //  3758: f2d            
        //  3759: dadd           
        //  3760: fload           4
        //  3762: f2d            
        //  3763: goto            3767
        //  3766: athrow         
        //  3767: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3770: goto            3774
        //  3773: athrow         
        //  3774: iload           8
        //  3776: getstatic       dev/nuker/pyro/fc.c:I
        //  3779: ifge            3788
        //  3782: ldc_w           114680983
        //  3785: goto            3791
        //  3788: ldc_w           -1299194124
        //  3791: ldc_w           -466652362
        //  3794: ixor           
        //  3795: lookupswitch {
        //          -486893663: 3788
        //          1453370818: 3820
        //          default: 4931
        //        }
        //  3820: iload           9
        //  3822: getstatic       dev/nuker/pyro/fc.1:I
        //  3825: ifeq            3834
        //  3828: ldc_w           -129778409
        //  3831: goto            3837
        //  3834: ldc_w           -1674351040
        //  3837: ldc_w           -99776697
        //  3840: ixor           
        //  3841: lookupswitch {
        //          38681168: 3834
        //          1715398919: 3868
        //          default: 4923
        //        }
        //  3868: iload           10
        //  3870: iload           11
        //  3872: goto            3876
        //  3875: athrow         
        //  3876: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3879: goto            3883
        //  3882: athrow         
        //  3883: getstatic       dev/nuker/pyro/fc.0:I
        //  3886: ifeq            3895
        //  3889: ldc_w           -921830795
        //  3892: goto            3898
        //  3895: ldc_w           -1854390570
        //  3898: ldc_w           -101649464
        //  3901: ixor           
        //  3902: lookupswitch {
        //          821889469: 5009
        //          1433170143: 3895
        //          default: 3928
        //        }
        //  3928: goto            3932
        //  3931: athrow         
        //  3932: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  3935: goto            3939
        //  3938: athrow         
        //  3939: iload           12
        //  3941: bipush          24
        //  3943: iand           
        //  3944: ifeq            4422
        //  3947: aload_1        
        //  3948: fload_2        
        //  3949: f2d            
        //  3950: fload_3        
        //  3951: f2d            
        //  3952: fload           4
        //  3954: f2d            
        //  3955: fload           7
        //  3957: f2d            
        //  3958: dadd           
        //  3959: getstatic       dev/nuker/pyro/fc.0:I
        //  3962: ifeq            3971
        //  3965: ldc_w           -413918073
        //  3968: goto            3974
        //  3971: ldc_w           -994624203
        //  3974: ldc_w           -571862639
        //  3977: ixor           
        //  3978: lookupswitch {
        //          -1555913433: 3971
        //          985533718: 4889
        //          default: 4004
        //        }
        //  4004: goto            4008
        //  4007: athrow         
        //  4008: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4011: goto            4015
        //  4014: athrow         
        //  4015: getstatic       dev/nuker/pyro/fc.0:I
        //  4018: ifeq            4027
        //  4021: ldc_w           2085787006
        //  4024: goto            4030
        //  4027: ldc_w           1470570307
        //  4030: ldc_w           1503208403
        //  4033: ixor           
        //  4034: lookupswitch {
        //          -795962086: 4027
        //          634107565: 4895
        //          default: 4060
        //        }
        //  4060: iload           8
        //  4062: iload           9
        //  4064: iload           10
        //  4066: getstatic       dev/nuker/pyro/fc.0:I
        //  4069: ifeq            4078
        //  4072: ldc_w           -1844903499
        //  4075: goto            4081
        //  4078: ldc_w           -1290715383
        //  4081: ldc_w           950236017
        //  4084: ixor           
        //  4085: lookupswitch {
        //          -1951249288: 4112
        //          -1431670076: 4078
        //          default: 4947
        //        }
        //  4112: iload           11
        //  4114: goto            4118
        //  4117: athrow         
        //  4118: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4121: goto            4125
        //  4124: athrow         
        //  4125: getstatic       dev/nuker/pyro/fc.0:I
        //  4128: ifeq            4137
        //  4131: ldc_w           -1611648713
        //  4134: goto            4140
        //  4137: ldc_w           -1448655292
        //  4140: ldc_w           -1785468658
        //  4143: ixor           
        //  4144: lookupswitch {
        //          174315577: 4137
        //          1010085706: 4172
        //          default: 4873
        //        }
        //  4172: goto            4176
        //  4175: athrow         
        //  4176: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  4179: goto            4183
        //  4182: athrow         
        //  4183: aload_1        
        //  4184: fload_2        
        //  4185: f2d            
        //  4186: getstatic       dev/nuker/pyro/fc.c:I
        //  4189: ifge            4198
        //  4192: ldc_w           803930455
        //  4195: goto            4201
        //  4198: ldc_w           -20662843
        //  4201: ldc_w           1384686758
        //  4204: ixor           
        //  4205: lookupswitch {
        //          -1404300957: 4232
        //          2103682545: 4198
        //          default: 4925
        //        }
        //  4232: fload_3        
        //  4233: f2d            
        //  4234: getstatic       dev/nuker/pyro/fc.1:I
        //  4237: ifeq            4246
        //  4240: ldc_w           848979741
        //  4243: goto            4249
        //  4246: ldc_w           1713744637
        //  4249: ldc_w           -968587207
        //  4252: ixor           
        //  4253: lookupswitch {
        //          -1604246844: 4280
        //          -186716380: 4246
        //          default: 4959
        //        }
        //  4280: fload           6
        //  4282: f2d            
        //  4283: dadd           
        //  4284: getstatic       dev/nuker/pyro/fc.0:I
        //  4287: ifeq            4296
        //  4290: ldc_w           -1170807257
        //  4293: goto            4299
        //  4296: ldc_w           -295218682
        //  4299: ldc_w           -659843589
        //  4302: ixor           
        //  4303: lookupswitch {
        //          -158865259: 4296
        //          1654485980: 4941
        //          default: 4328
        //        }
        //  4328: fload           4
        //  4330: f2d            
        //  4331: fload           7
        //  4333: f2d            
        //  4334: dadd           
        //  4335: goto            4339
        //  4338: athrow         
        //  4339: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4342: goto            4346
        //  4345: athrow         
        //  4346: iload           8
        //  4348: iload           9
        //  4350: getstatic       dev/nuker/pyro/fc.1:I
        //  4353: ifeq            4362
        //  4356: ldc_w           -2069640087
        //  4359: goto            4365
        //  4362: ldc_w           -79893732
        //  4365: ldc_w           1158578995
        //  4368: ixor           
        //  4369: lookupswitch {
        //          -1103992785: 4396
        //          -1045606566: 4362
        //          default: 4885
        //        }
        //  4396: iload           10
        //  4398: iload           11
        //  4400: goto            4404
        //  4403: athrow         
        //  4404: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4407: goto            4411
        //  4410: athrow         
        //  4411: goto            4415
        //  4414: athrow         
        //  4415: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  4418: goto            4422
        //  4421: athrow         
        //  4422: iload           12
        //  4424: bipush          40
        //  4426: iand           
        //  4427: ifeq            4868
        //  4430: aload_1        
        //  4431: getstatic       dev/nuker/pyro/fc.c:I
        //  4434: ifge            4443
        //  4437: ldc_w           1704161388
        //  4440: goto            4446
        //  4443: ldc_w           1089149814
        //  4446: ldc_w           -1367820238
        //  4449: ixor           
        //  4450: lookupswitch {
        //          -873740194: 4443
        //          -292314300: 4476
        //          default: 5011
        //        }
        //  4476: fload_2        
        //  4477: f2d            
        //  4478: getstatic       dev/nuker/pyro/fc.1:I
        //  4481: ifeq            4490
        //  4484: ldc_w           -925797614
        //  4487: goto            4493
        //  4490: ldc_w           -619227895
        //  4493: ldc_w           654947788
        //  4496: ixor           
        //  4497: lookupswitch {
        //          -271005986: 4490
        //          -65085243: 4524
        //          default: 4997
        //        }
        //  4524: fload           5
        //  4526: f2d            
        //  4527: dadd           
        //  4528: fload_3        
        //  4529: f2d            
        //  4530: fload           4
        //  4532: f2d            
        //  4533: getstatic       dev/nuker/pyro/fc.1:I
        //  4536: ifeq            4545
        //  4539: ldc_w           1251528109
        //  4542: goto            4548
        //  4545: ldc_w           -1778678441
        //  4548: ldc_w           -681315896
        //  4551: ixor           
        //  4552: lookupswitch {
        //          -1644479387: 4973
        //          854258740: 4545
        //          default: 4580
        //        }
        //  4580: fload           7
        //  4582: f2d            
        //  4583: dadd           
        //  4584: goto            4588
        //  4587: athrow         
        //  4588: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4591: goto            4595
        //  4594: athrow         
        //  4595: getstatic       dev/nuker/pyro/fc.1:I
        //  4598: ifeq            4607
        //  4601: ldc_w           1086122080
        //  4604: goto            4610
        //  4607: ldc_w           454252948
        //  4610: ldc_w           -358985600
        //  4613: ixor           
        //  4614: lookupswitch {
        //          -1440302880: 4993
        //          -120224667: 4607
        //          default: 4640
        //        }
        //  4640: iload           8
        //  4642: iload           9
        //  4644: iload           10
        //  4646: getstatic       dev/nuker/pyro/fc.1:I
        //  4649: ifeq            4658
        //  4652: ldc_w           1128901978
        //  4655: goto            4661
        //  4658: ldc_w           -903928516
        //  4661: ldc_w           1913888420
        //  4664: ixor           
        //  4665: lookupswitch {
        //          -1207125096: 4692
        //          827995134: 4658
        //          default: 4929
        //        }
        //  4692: iload           11
        //  4694: goto            4698
        //  4697: athrow         
        //  4698: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4701: goto            4705
        //  4704: athrow         
        //  4705: goto            4709
        //  4708: athrow         
        //  4709: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  4712: goto            4716
        //  4715: athrow         
        //  4716: aload_1        
        //  4717: fload_2        
        //  4718: f2d            
        //  4719: fload           5
        //  4721: f2d            
        //  4722: dadd           
        //  4723: fload_3        
        //  4724: f2d            
        //  4725: fload           6
        //  4727: f2d            
        //  4728: dadd           
        //  4729: getstatic       dev/nuker/pyro/fc.0:I
        //  4732: ifeq            4741
        //  4735: ldc_w           -670176751
        //  4738: goto            4744
        //  4741: ldc_w           1552375421
        //  4744: ldc_w           1044444586
        //  4747: ixor           
        //  4748: lookupswitch {
        //          -431153221: 4741
        //          1657252823: 4776
        //          default: 4963
        //        }
        //  4776: fload           4
        //  4778: f2d            
        //  4779: fload           7
        //  4781: f2d            
        //  4782: dadd           
        //  4783: goto            4787
        //  4786: athrow         
        //  4787: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4790: goto            4794
        //  4793: athrow         
        //  4794: iload           8
        //  4796: iload           9
        //  4798: iload           10
        //  4800: getstatic       dev/nuker/pyro/fc.0:I
        //  4803: ifeq            4812
        //  4806: ldc_w           -143445520
        //  4809: goto            4815
        //  4812: ldc_w           -300068251
        //  4815: ldc_w           -1104709794
        //  4818: ixor           
        //  4819: lookupswitch {
        //          1230259886: 4812
        //          1345987899: 4844
        //          default: 5003
        //        }
        //  4844: iload           11
        //  4846: goto            4850
        //  4849: athrow         
        //  4850: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  4853: goto            4857
        //  4856: athrow         
        //  4857: goto            4861
        //  4860: athrow         
        //  4861: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  4864: goto            4868
        //  4867: athrow         
        //  4868: return         
        //  4869: aconst_null    
        //  4870: athrow         
        //  4871: aconst_null    
        //  4872: athrow         
        //  4873: aconst_null    
        //  4874: athrow         
        //  4875: aconst_null    
        //  4876: athrow         
        //  4877: aconst_null    
        //  4878: athrow         
        //  4879: aconst_null    
        //  4880: athrow         
        //  4881: aconst_null    
        //  4882: athrow         
        //  4883: aconst_null    
        //  4884: athrow         
        //  4885: aconst_null    
        //  4886: athrow         
        //  4887: aconst_null    
        //  4888: athrow         
        //  4889: aconst_null    
        //  4890: athrow         
        //  4891: aconst_null    
        //  4892: athrow         
        //  4893: aconst_null    
        //  4894: athrow         
        //  4895: aconst_null    
        //  4896: athrow         
        //  4897: aconst_null    
        //  4898: athrow         
        //  4899: aconst_null    
        //  4900: athrow         
        //  4901: aconst_null    
        //  4902: athrow         
        //  4903: aconst_null    
        //  4904: athrow         
        //  4905: aconst_null    
        //  4906: athrow         
        //  4907: aconst_null    
        //  4908: athrow         
        //  4909: aconst_null    
        //  4910: athrow         
        //  4911: aconst_null    
        //  4912: athrow         
        //  4913: aconst_null    
        //  4914: athrow         
        //  4915: aconst_null    
        //  4916: athrow         
        //  4917: aconst_null    
        //  4918: athrow         
        //  4919: aconst_null    
        //  4920: athrow         
        //  4921: aconst_null    
        //  4922: athrow         
        //  4923: aconst_null    
        //  4924: athrow         
        //  4925: aconst_null    
        //  4926: athrow         
        //  4927: aconst_null    
        //  4928: athrow         
        //  4929: aconst_null    
        //  4930: athrow         
        //  4931: aconst_null    
        //  4932: athrow         
        //  4933: aconst_null    
        //  4934: athrow         
        //  4935: aconst_null    
        //  4936: athrow         
        //  4937: aconst_null    
        //  4938: athrow         
        //  4939: aconst_null    
        //  4940: athrow         
        //  4941: aconst_null    
        //  4942: athrow         
        //  4943: aconst_null    
        //  4944: athrow         
        //  4945: aconst_null    
        //  4946: athrow         
        //  4947: aconst_null    
        //  4948: athrow         
        //  4949: aconst_null    
        //  4950: athrow         
        //  4951: aconst_null    
        //  4952: athrow         
        //  4953: aconst_null    
        //  4954: athrow         
        //  4955: aconst_null    
        //  4956: athrow         
        //  4957: aconst_null    
        //  4958: athrow         
        //  4959: aconst_null    
        //  4960: athrow         
        //  4961: aconst_null    
        //  4962: athrow         
        //  4963: aconst_null    
        //  4964: athrow         
        //  4965: aconst_null    
        //  4966: athrow         
        //  4967: aconst_null    
        //  4968: athrow         
        //  4969: aconst_null    
        //  4970: athrow         
        //  4971: aconst_null    
        //  4972: athrow         
        //  4973: aconst_null    
        //  4974: athrow         
        //  4975: aconst_null    
        //  4976: athrow         
        //  4977: aconst_null    
        //  4978: athrow         
        //  4979: aconst_null    
        //  4980: athrow         
        //  4981: aconst_null    
        //  4982: athrow         
        //  4983: aconst_null    
        //  4984: athrow         
        //  4985: aconst_null    
        //  4986: athrow         
        //  4987: aconst_null    
        //  4988: athrow         
        //  4989: aconst_null    
        //  4990: athrow         
        //  4991: aconst_null    
        //  4992: athrow         
        //  4993: aconst_null    
        //  4994: athrow         
        //  4995: aconst_null    
        //  4996: athrow         
        //  4997: aconst_null    
        //  4998: athrow         
        //  4999: aconst_null    
        //  5000: athrow         
        //  5001: aconst_null    
        //  5002: athrow         
        //  5003: aconst_null    
        //  5004: athrow         
        //  5005: aconst_null    
        //  5006: athrow         
        //  5007: aconst_null    
        //  5008: athrow         
        //  5009: aconst_null    
        //  5010: athrow         
        //  5011: aconst_null    
        //  5012: athrow         
        //  5013: aconst_null    
        //  5014: athrow         
        //  5015: pop            
        //  5016: goto            24
        //  5019: pop            
        //  5020: aconst_null    
        //  5021: goto            5015
        //  5024: dup            
        //  5025: ifnull          5015
        //  5028: checkcast       Ljava/lang/Throwable;
        //  5031: athrow         
        //  5032: dup            
        //  5033: ifnull          5019
        //  5036: checkcast       Ljava/lang/Throwable;
        //  5039: athrow         
        //  5040: aconst_null    
        //  5041: athrow         
        //    StackMapTable: 02 59 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 00 FF 00 18 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 47 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 44 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 10 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 1F FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 18 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 45 07 00 21 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 4F 07 00 AB FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 48 07 00 17 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 17 40 07 00 3C 45 07 00 31 00 13 42 01 1C 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C 4D 07 00 21 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 48 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 01 07 00 3C 45 07 00 31 00 FF 00 17 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 46 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 44 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 07 05 42 01 1A FF 00 14 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 1B FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 56 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C 4A 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 12 42 01 1F FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 45 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 15 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 25 40 07 00 3C 45 07 00 31 00 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C 4D 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5E 07 00 3C 4A 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 01 07 00 3C 45 07 00 31 00 0B 42 01 1E 56 07 00 1D FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 13 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 17 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 14 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 06 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 07 05 42 01 1B FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 4B 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5C 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 48 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 0B 42 01 1D FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 25 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 01 07 00 3C 45 07 00 31 00 5A 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 13 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5C 07 00 3C 55 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4A 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 54 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5C 07 00 3C 49 07 00 17 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 13 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 0D 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 46 07 00 17 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 07 05 42 01 18 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C FF 00 13 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 45 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 13 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 06 07 00 3C 01 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 42 07 00 1B FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C 42 07 00 1B 40 07 00 3C 45 07 00 31 00 4C 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5C 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 46 07 00 17 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 42 07 00 21 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 04 00 00 00 01 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5F 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 0E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 0F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 46 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 54 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 0D 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 14 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 03 03 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 46 07 00 23 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C 4B 07 00 3C FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 5D 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1E 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 44 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 21 40 07 00 3C 45 07 00 31 00 FF 00 18 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 01 FF 00 1F 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 49 07 00 31 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 45 07 00 31 40 07 00 3C FF 00 11 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 02 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 1C 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 44 07 00 21 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 45 07 00 31 40 07 00 3C 42 07 00 31 40 07 00 3C 45 07 00 31 00 FF 00 00 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 41 07 00 3C 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 41 07 00 3C 01 41 07 00 3C 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 41 07 00 3C 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 01 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 03 03 03 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 01 01 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 05 07 00 3C 01 01 01 01 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 04 07 00 3C 01 01 01 FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 02 07 00 3C 03 41 07 00 3C 41 07 00 3C 41 07 00 3C FF 00 01 00 0D 07 00 03 07 00 3C 02 02 02 02 02 02 01 01 01 01 01 00 03 07 00 3C 03 03 41 07 00 31 43 05 44 07 00 31 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     5024   5032   Any
        //  5024   5032   5024   5032   Ljava/lang/ArithmeticException;
        //  5040   5042   3      8      Any
        //  92     99     99     100    Any
        //  92     99     92     93     Ljava/lang/NullPointerException;
        //  93     99     3      8      Ljava/lang/ClassCastException;
        //  93     99     92     93     Ljava/lang/AssertionError;
        //  93     99     92     93     Any
        //  157    164    164    165    Any
        //  157    164    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  158    164    157    158    Any
        //  158    164    157    158    Any
        //  158    164    164    165    Ljava/lang/RuntimeException;
        //  168    175    175    176    Any
        //  169    175    168    169    Any
        //  169    175    175    176    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  168    175    175    176    Any
        //  168    175    3      8      Any
        //  328    334    334    335    Any
        //  328    334    3      8      Ljava/lang/RuntimeException;
        //  328    334    3      8      Any
        //  328    334    3      8      Ljava/util/ConcurrentModificationException;
        //  328    334    334    335    Ljava/lang/NullPointerException;
        //  439    446    446    447    Any
        //  439    446    439    440    Ljava/lang/ArithmeticException;
        //  440    446    446    447    Any
        //  439    446    446    447    Any
        //  440    446    446    447    Ljava/lang/RuntimeException;
        //  450    457    457    458    Any
        //  451    457    450    451    Any
        //  451    457    457    458    Any
        //  450    457    457    458    Any
        //  451    457    457    458    Ljava/lang/IllegalArgumentException;
        //  570    577    577    578    Any
        //  571    577    3      8      Any
        //  571    577    3      8      Ljava/lang/NullPointerException;
        //  570    577    577    578    Any
        //  571    577    570    571    Ljava/lang/IllegalArgumentException;
        //  723    730    730    731    Any
        //  724    730    723    724    Any
        //  724    730    730    731    Any
        //  723    730    3      8      Ljava/lang/ClassCastException;
        //  723    730    723    724    Any
        //  734    741    741    742    Any
        //  735    741    734    735    Ljava/lang/NullPointerException;
        //  735    741    734    735    Any
        //  734    741    741    742    Ljava/lang/IndexOutOfBoundsException;
        //  735    741    741    742    Any
        //  808    815    815    816    Any
        //  809    815    3      8      Ljava/lang/UnsupportedOperationException;
        //  808    815    815    816    Any
        //  808    815    815    816    Any
        //  808    815    808    809    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  873    880    880    881    Any
        //  874    880    3      8      Ljava/lang/NullPointerException;
        //  873    880    873    874    Ljava/lang/StringIndexOutOfBoundsException;
        //  874    880    873    874    Ljava/lang/RuntimeException;
        //  874    880    880    881    Any
        //  884    891    891    892    Any
        //  884    891    3      8      Ljava/lang/IllegalStateException;
        //  884    891    884    885    Ljava/lang/NegativeArraySizeException;
        //  884    891    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  885    891    884    885    Ljava/lang/StringIndexOutOfBoundsException;
        //  1006   1013   1013   1014   Any
        //  1006   1013   1006   1007   Ljava/lang/IllegalArgumentException;
        //  1007   1013   3      8      Any
        //  1007   1013   3      8      Any
        //  1006   1013   1013   1014   Ljava/lang/NegativeArraySizeException;
        //  1069   1076   1076   1077   Any
        //  1069   1076   1069   1070   Any
        //  1070   1076   3      8      Any
        //  1069   1076   3      8      Ljava/lang/NegativeArraySizeException;
        //  1070   1076   1069   1070   Ljava/util/NoSuchElementException;
        //  1081   1087   1087   1088   Any
        //  1081   1087   3      8      Ljava/lang/NumberFormatException;
        //  1081   1087   1087   1088   Any
        //  1081   1087   3      8      Ljava/lang/ClassCastException;
        //  1081   1087   3      8      Ljava/lang/NullPointerException;
        //  1151   1158   1158   1159   Any
        //  1152   1158   1158   1159   Ljava/lang/UnsupportedOperationException;
        //  1151   1158   3      8      Any
        //  1152   1158   1151   1152   Any
        //  1152   1158   1158   1159   Ljava/util/NoSuchElementException;
        //  1217   1224   1224   1225   Any
        //  1218   1224   3      8      Any
        //  1217   1224   1217   1218   Any
        //  1217   1224   3      8      Any
        //  1217   1224   1224   1225   Any
        //  1228   1235   1235   1236   Any
        //  1228   1235   1228   1229   Any
        //  1229   1235   1228   1229   Ljava/lang/AssertionError;
        //  1229   1235   1235   1236   Any
        //  1229   1235   1228   1229   Ljava/lang/IndexOutOfBoundsException;
        //  1346   1353   1353   1354   Any
        //  1347   1353   1353   1354   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1347   1353   3      8      Any
        //  1347   1353   3      8      Any
        //  1347   1353   1346   1347   Ljava/lang/NegativeArraySizeException;
        //  1365   1372   1372   1373   Any
        //  1365   1372   3      8      Ljava/lang/IllegalStateException;
        //  1366   1372   3      8      Any
        //  1366   1372   1372   1373   Any
        //  1365   1372   1365   1366   Any
        //  1376   1383   1383   1384   Any
        //  1376   1383   1376   1377   Any
        //  1377   1383   1383   1384   Ljava/lang/AssertionError;
        //  1377   1383   1376   1377   Any
        //  1376   1383   1376   1377   Any
        //  1407   1414   1414   1415   Any
        //  1407   1414   1414   1415   Ljava/lang/NegativeArraySizeException;
        //  1408   1414   1407   1408   Ljava/lang/StringIndexOutOfBoundsException;
        //  1407   1414   3      8      Any
        //  1407   1414   1407   1408   Any
        //  1471   1478   1478   1479   Any
        //  1471   1478   1478   1479   Any
        //  1472   1478   1471   1472   Any
        //  1472   1478   1471   1472   Any
        //  1472   1478   1478   1479   Any
        //  1482   1489   1489   1490   Any
        //  1482   1489   1489   1490   Ljava/lang/NegativeArraySizeException;
        //  1483   1489   1489   1490   Ljava/util/NoSuchElementException;
        //  1483   1489   1489   1490   Any
        //  1482   1489   1482   1483   Any
        //  1646   1653   1653   1654   Any
        //  1647   1653   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1647   1653   1653   1654   Any
        //  1647   1653   1646   1647   Any
        //  1647   1653   3      8      Any
        //  1665   1672   1672   1673   Any
        //  1666   1672   1665   1666   Ljava/lang/EnumConstantNotPresentException;
        //  1665   1672   1672   1673   Any
        //  1666   1672   1672   1673   Ljava/lang/UnsupportedOperationException;
        //  1665   1672   1672   1673   Ljava/lang/AssertionError;
        //  1676   1683   1683   1684   Any
        //  1676   1683   1676   1677   Ljava/lang/StringIndexOutOfBoundsException;
        //  1677   1683   3      8      Ljava/lang/IllegalArgumentException;
        //  1677   1683   1683   1684   Any
        //  1677   1683   1683   1684   Ljava/lang/StringIndexOutOfBoundsException;
        //  1746   1753   1753   1754   Any
        //  1746   1753   1746   1747   Any
        //  1746   1753   1746   1747   Ljava/lang/IllegalArgumentException;
        //  1746   1753   1753   1754   Any
        //  1746   1753   3      8      Ljava/lang/AssertionError;
        //  1811   1818   1818   1819   Any
        //  1812   1818   1818   1819   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1812   1818   3      8      Ljava/util/NoSuchElementException;
        //  1812   1818   3      8      Ljava/lang/IllegalArgumentException;
        //  1811   1818   1811   1812   Any
        //  1823   1829   1829   1830   Any
        //  1823   1829   3      8      Any
        //  1823   1829   1829   1830   Ljava/util/NoSuchElementException;
        //  1823   1829   1829   1830   Any
        //  1823   1829   3      8      Ljava/lang/NegativeArraySizeException;
        //  1899   1906   1906   1907   Any
        //  1900   1906   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1900   1906   1899   1900   Ljava/util/ConcurrentModificationException;
        //  1900   1906   1906   1907   Any
        //  1899   1906   3      8      Any
        //  1963   1970   1970   1971   Any
        //  1963   1970   1963   1964   Ljava/lang/NegativeArraySizeException;
        //  1964   1970   1970   1971   Ljava/lang/RuntimeException;
        //  1963   1970   1970   1971   Any
        //  1963   1970   1963   1964   Ljava/lang/EnumConstantNotPresentException;
        //  1974   1981   1981   1982   Any
        //  1974   1981   3      8      Any
        //  1975   1981   1974   1975   Any
        //  1974   1981   3      8      Any
        //  1974   1981   3      8      Ljava/lang/IllegalArgumentException;
        //  2046   2053   2053   2054   Any
        //  2047   2053   2053   2054   Any
        //  2046   2053   2053   2054   Any
        //  2046   2053   3      8      Ljava/lang/RuntimeException;
        //  2047   2053   2046   2047   Any
        //  2112   2118   2118   2119   Any
        //  2112   2118   3      8      Any
        //  2112   2118   2118   2119   Any
        //  2112   2118   3      8      Any
        //  2112   2118   3      8      Ljava/lang/NullPointerException;
        //  2167   2174   2174   2175   Any
        //  2167   2174   2174   2175   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2167   2174   3      8      Ljava/lang/RuntimeException;
        //  2168   2174   2167   2168   Any
        //  2167   2174   2167   2168   Any
        //  2280   2287   2287   2288   Any
        //  2280   2287   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2280   2287   2280   2281   Any
        //  2280   2287   2280   2281   Ljava/lang/IndexOutOfBoundsException;
        //  2281   2287   3      8      Any
        //  2389   2396   2396   2397   Any
        //  2389   2396   2396   2397   Any
        //  2389   2396   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2390   2396   3      8      Ljava/lang/NegativeArraySizeException;
        //  2389   2396   2389   2390   Any
        //  2447   2454   2454   2455   Any
        //  2447   2454   2447   2448   Ljava/lang/AssertionError;
        //  2447   2454   2447   2448   Any
        //  2447   2454   3      8      Any
        //  2447   2454   2447   2448   Any
        //  2654   2661   2661   2662   Any
        //  2654   2661   2654   2655   Any
        //  2654   2661   2661   2662   Any
        //  2654   2661   2654   2655   Any
        //  2655   2661   2661   2662   Ljava/lang/StringIndexOutOfBoundsException;
        //  2673   2680   2680   2681   Any
        //  2674   2680   3      8      Any
        //  2674   2680   2673   2674   Ljava/lang/StringIndexOutOfBoundsException;
        //  2674   2680   3      8      Any
        //  2674   2680   3      8      Ljava/util/ConcurrentModificationException;
        //  2685   2691   2691   2692   Any
        //  2685   2691   2691   2692   Ljava/util/NoSuchElementException;
        //  2685   2691   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2685   2691   3      8      Any
        //  2685   2691   3      8      Ljava/lang/ClassCastException;
        //  2719   2726   2726   2727   Any
        //  2719   2726   2719   2720   Any
        //  2720   2726   2726   2727   Any
        //  2720   2726   2719   2720   Any
        //  2720   2726   2726   2727   Any
        //  2783   2790   2790   2791   Any
        //  2783   2790   2790   2791   Ljava/lang/ClassCastException;
        //  2784   2790   3      8      Any
        //  2783   2790   3      8      Any
        //  2783   2790   2783   2784   Any
        //  2839   2846   2846   2847   Any
        //  2840   2846   2839   2840   Any
        //  2839   2846   2846   2847   Any
        //  2839   2846   3      8      Ljava/util/ConcurrentModificationException;
        //  2840   2846   2839   2840   Ljava/lang/IllegalArgumentException;
        //  2914   2921   2921   2922   Any
        //  2915   2921   2921   2922   Ljava/lang/AssertionError;
        //  2915   2921   2914   2915   Any
        //  2914   2921   2914   2915   Any
        //  2915   2921   2914   2915   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2933   2940   2940   2941   Any
        //  2934   2940   2933   2934   Ljava/lang/AssertionError;
        //  2934   2940   2940   2941   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2933   2940   2933   2934   Ljava/lang/StringIndexOutOfBoundsException;
        //  2934   2940   2940   2941   Any
        //  2991   2998   2998   2999   Any
        //  2991   2998   3      8      Ljava/lang/UnsupportedOperationException;
        //  2992   2998   2991   2992   Any
        //  2992   2998   3      8      Any
        //  2992   2998   3      8      Any
        //  3062   3069   3069   3070   Any
        //  3062   3069   3062   3063   Ljava/util/ConcurrentModificationException;
        //  3063   3069   3069   3070   Ljava/lang/IllegalStateException;
        //  3062   3069   3062   3063   Ljava/lang/EnumConstantNotPresentException;
        //  3063   3069   3062   3063   Ljava/lang/ArithmeticException;
        //  3127   3134   3134   3135   Any
        //  3128   3134   3      8      Any
        //  3127   3134   3      8      Any
        //  3127   3134   3127   3128   Any
        //  3127   3134   3127   3128   Ljava/lang/EnumConstantNotPresentException;
        //  3138   3145   3145   3146   Any
        //  3138   3145   3145   3146   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3139   3145   3145   3146   Any
        //  3138   3145   3      8      Ljava/lang/RuntimeException;
        //  3139   3145   3138   3139   Any
        //  3207   3213   3213   3214   Any
        //  3207   3213   3213   3214   Ljava/lang/UnsupportedOperationException;
        //  3207   3213   3      8      Any
        //  3207   3213   3213   3214   Ljava/lang/IllegalStateException;
        //  3207   3213   3      8      Any
        //  3315   3322   3322   3323   Any
        //  3315   3322   3      8      Any
        //  3315   3322   3315   3316   Ljava/lang/NegativeArraySizeException;
        //  3315   3322   3315   3316   Ljava/lang/StringIndexOutOfBoundsException;
        //  3316   3322   3315   3316   Ljava/lang/RuntimeException;
        //  3326   3333   3333   3334   Any
        //  3326   3333   3326   3327   Ljava/util/NoSuchElementException;
        //  3326   3333   3      8      Ljava/lang/AssertionError;
        //  3326   3333   3      8      Ljava/util/ConcurrentModificationException;
        //  3327   3333   3326   3327   Any
        //  3482   3489   3489   3490   Any
        //  3483   3489   3      8      Any
        //  3483   3489   3      8      Any
        //  3483   3489   3489   3490   Any
        //  3483   3489   3482   3483   Any
        //  3547   3554   3554   3555   Any
        //  3547   3554   3      8      Any
        //  3547   3554   3554   3555   Any
        //  3547   3554   3547   3548   Ljava/lang/NegativeArraySizeException;
        //  3547   3554   3554   3555   Any
        //  3603   3610   3610   3611   Any
        //  3604   3610   3610   3611   Any
        //  3604   3610   3610   3611   Any
        //  3603   3610   3610   3611   Ljava/lang/NumberFormatException;
        //  3603   3610   3603   3604   Ljava/lang/NegativeArraySizeException;
        //  3766   3773   3773   3774   Any
        //  3767   3773   3      8      Any
        //  3767   3773   3766   3767   Any
        //  3766   3773   3766   3767   Ljava/util/ConcurrentModificationException;
        //  3767   3773   3773   3774   Ljava/lang/ClassCastException;
        //  3875   3882   3882   3883   Any
        //  3875   3882   3875   3876   Ljava/lang/IllegalArgumentException;
        //  3875   3882   3      8      Any
        //  3876   3882   3875   3876   Ljava/lang/EnumConstantNotPresentException;
        //  3875   3882   3      8      Ljava/lang/AssertionError;
        //  3931   3938   3938   3939   Any
        //  3931   3938   3      8      Any
        //  3932   3938   3931   3932   Any
        //  3931   3938   3      8      Ljava/lang/NegativeArraySizeException;
        //  3931   3938   3931   3932   Any
        //  4007   4014   4014   4015   Any
        //  4007   4014   4014   4015   Any
        //  4007   4014   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4007   4014   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  4008   4014   4007   4008   Ljava/lang/IllegalArgumentException;
        //  4118   4124   4124   4125   Any
        //  4118   4124   4124   4125   Ljava/lang/RuntimeException;
        //  4118   4124   3      8      Ljava/lang/RuntimeException;
        //  4118   4124   3      8      Ljava/lang/IllegalArgumentException;
        //  4118   4124   4124   4125   Any
        //  4175   4182   4182   4183   Any
        //  4175   4182   4175   4176   Ljava/lang/RuntimeException;
        //  4175   4182   4175   4176   Ljava/lang/UnsupportedOperationException;
        //  4176   4182   4175   4176   Any
        //  4175   4182   3      8      Ljava/lang/ClassCastException;
        //  4338   4345   4345   4346   Any
        //  4339   4345   3      8      Any
        //  4339   4345   4338   4339   Any
        //  4338   4345   4345   4346   Ljava/lang/NegativeArraySizeException;
        //  4338   4345   3      8      Any
        //  4403   4410   4410   4411   Any
        //  4404   4410   4410   4411   Ljava/lang/ClassCastException;
        //  4404   4410   4403   4404   Ljava/lang/EnumConstantNotPresentException;
        //  4403   4410   4403   4404   Any
        //  4404   4410   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4414   4421   4421   4422   Any
        //  4415   4421   3      8      Ljava/util/NoSuchElementException;
        //  4414   4421   3      8      Any
        //  4414   4421   4414   4415   Any
        //  4414   4421   4414   4415   Any
        //  4587   4594   4594   4595   Any
        //  4587   4594   4594   4595   Any
        //  4588   4594   4594   4595   Any
        //  4587   4594   4587   4588   Ljava/lang/NullPointerException;
        //  4588   4594   4594   4595   Any
        //  4697   4704   4704   4705   Any
        //  4697   4704   3      8      Ljava/lang/AssertionError;
        //  4698   4704   3      8      Ljava/util/ConcurrentModificationException;
        //  4697   4704   3      8      Any
        //  4697   4704   4697   4698   Any
        //  4708   4715   4715   4716   Any
        //  4708   4715   4708   4709   Ljava/lang/IllegalArgumentException;
        //  4709   4715   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4708   4715   4715   4716   Any
        //  4709   4715   4715   4716   Any
        //  4786   4793   4793   4794   Any
        //  4787   4793   4786   4787   Any
        //  4787   4793   4786   4787   Ljava/lang/NegativeArraySizeException;
        //  4787   4793   4793   4794   Any
        //  4786   4793   3      8      Ljava/lang/NegativeArraySizeException;
        //  4849   4856   4856   4857   Any
        //  4850   4856   3      8      Any
        //  4849   4856   3      8      Any
        //  4850   4856   4856   4857   Ljava/lang/RuntimeException;
        //  4850   4856   4849   4850   Ljava/lang/IllegalArgumentException;
        //  4860   4867   4867   4868   Any
        //  4860   4867   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  4861   4867   4860   4861   Any
        //  4860   4867   4867   4868   Ljava/lang/EnumConstantNotPresentException;
        //  4861   4867   3      8      Any
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
    public BufferBuilder 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          64
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            56
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            48
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/fbr.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //    32: goto            36
        //    35: athrow         
        //    36: dup            
        //    37: pop            
        //    38: areturn        
        //    39: pop            
        //    40: goto            24
        //    43: pop            
        //    44: aconst_null    
        //    45: goto            39
        //    48: dup            
        //    49: ifnull          39
        //    52: checkcast       Ljava/lang/Throwable;
        //    55: athrow         
        //    56: dup            
        //    57: ifnull          43
        //    60: checkcast       Ljava/lang/Throwable;
        //    63: athrow         
        //    64: aconst_null    
        //    65: athrow         
        //    StackMapTable: 00 0D 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FC 00 03 07 00 03 FF 00 03 00 00 00 01 07 00 31 FF 00 00 00 01 07 00 03 00 01 07 00 03 45 07 00 31 40 07 00 3C 42 07 00 31 43 05 44 07 00 31 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      20     48     56     Any
        //  48     56     48     56     Any
        //  64     66     3      8      Ljava/lang/NumberFormatException;
        //  29     35     35     36     Any
        //  29     35     3      8      Any
        //  29     35     3      8      Ljava/util/NoSuchElementException;
        //  29     35     35     36     Ljava/lang/RuntimeException;
        //  29     35     3      8      Ljava/lang/ArithmeticException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 26 out of bounds for length 26
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
    
    public void c(final float n, final float n2, final float n3, final int n4, final int n5) {
        fbS.1q(this, 1208256822, n, n2, n3, n4, n5);
    }
}
