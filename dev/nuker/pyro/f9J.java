// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import java.util.List;
import net.minecraft.util.math.BlockPos;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class f9j extends fH
{
    public f0b c;
    public f0b 0;
    public ConcurrentHashMap<Integer, ArrayList<BlockPos>> c;
    public List<BlockPos> c;
    public static BlockPos[] c;
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          405
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            397
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            389
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: fload_2        
        //    27: goto            31
        //    30: athrow         
        //    31: invokespecial   dev/nuker/pyro/fH.c:(Lnet/minecraft/util/math/Vec3d;F)V
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: getfield        dev/nuker/pyro/f9j.c:Ljava/util/concurrent/ConcurrentHashMap;
        //    42: getstatic       dev/nuker/pyro/fc.1:I
        //    45: ifeq            53
        //    48: ldc             -1159408275
        //    50: goto            55
        //    53: ldc             942768703
        //    55: ldc             -133598578
        //    57: ixor           
        //    58: lookupswitch {
        //          -1070010191: 84
        //          1122871267: 53
        //          default: 368
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   java/util/concurrent/ConcurrentHashMap.entrySet:()Ljava/util/Set;
        //    91: goto            95
        //    94: athrow         
        //    95: getstatic       dev/nuker/pyro/fc.c:I
        //    98: ifge            106
        //   101: ldc             -1673374596
        //   103: goto            108
        //   106: ldc             1523936863
        //   108: ldc             -1846660525
        //   110: ixor           
        //   111: lookupswitch {
        //          218360591: 106
        //          229402159: 370
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f9j;)Ljava/util/function/Consumer;
        //   142: goto            146
        //   145: athrow         
        //   146: invokeinterface java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        //   151: goto            155
        //   154: athrow         
        //   155: aload_0        
        //   156: getstatic       dev/nuker/pyro/fc.0:I
        //   159: ifeq            167
        //   162: ldc             239107778
        //   164: goto            169
        //   167: ldc             1957117698
        //   169: ldc             -1576586402
        //   171: ixor           
        //   172: lookupswitch {
        //          -1404613220: 378
        //          -395697033: 167
        //          default: 200
        //        }
        //   200: getfield        dev/nuker/pyro/f9j.c:Ljava/util/List;
        //   203: goto            207
        //   206: athrow         
        //   207: invokeinterface java/util/List.isEmpty:()Z
        //   212: goto            216
        //   215: athrow         
        //   216: ifne            367
        //   219: getstatic       dev/nuker/pyro/fc.0:I
        //   222: ifeq            230
        //   225: ldc             1742814100
        //   227: goto            232
        //   230: ldc             -201148674
        //   232: ldc             -1064294480
        //   234: ixor           
        //   235: lookupswitch {
        //          -1485759452: 230
        //          882020686: 260
        //          default: 374
        //        }
        //   260: aload_0        
        //   261: getstatic       dev/nuker/pyro/fc.0:I
        //   264: ifeq            272
        //   267: ldc             1369400517
        //   269: goto            274
        //   272: ldc             1086523265
        //   274: ldc             -201702163
        //   276: ixor           
        //   277: lookupswitch {
        //          -1570430936: 272
        //          -1288092820: 304
        //          default: 376
        //        }
        //   304: getfield        dev/nuker/pyro/f9j.c:Ljava/util/List;
        //   307: getstatic       dev/nuker/pyro/fc.0:I
        //   310: ifeq            318
        //   313: ldc             433369109
        //   315: goto            320
        //   318: ldc             1175761290
        //   320: ldc             -1430665112
        //   322: ixor           
        //   323: lookupswitch {
        //          -1572412828: 318
        //          -1284671363: 372
        //          default: 348
        //        }
        //   348: aload_0        
        //   349: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f9j;)Ljava/util/function/Consumer;
        //   354: goto            358
        //   357: athrow         
        //   358: invokeinterface java/util/List.forEach:(Ljava/util/function/Consumer;)V
        //   363: goto            367
        //   366: athrow         
        //   367: return         
        //   368: aconst_null    
        //   369: athrow         
        //   370: aconst_null    
        //   371: athrow         
        //   372: aconst_null    
        //   373: athrow         
        //   374: aconst_null    
        //   375: athrow         
        //   376: aconst_null    
        //   377: athrow         
        //   378: aconst_null    
        //   379: athrow         
        //   380: pop            
        //   381: goto            24
        //   384: pop            
        //   385: aconst_null    
        //   386: goto            380
        //   389: dup            
        //   390: ifnull          380
        //   393: checkcast       Ljava/lang/Throwable;
        //   396: athrow         
        //   397: dup            
        //   398: ifnull          384
        //   401: checkcast       Ljava/lang/Throwable;
        //   404: athrow         
        //   405: aconst_null    
        //   406: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 01 16 00 00 00 0F 00 00
        //    StackMapTable: 00 35 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FE 00 03 07 00 03 07 00 72 02 FF 00 05 00 00 00 01 07 00 28 FF 00 00 00 03 07 00 03 07 00 72 02 00 03 07 00 03 07 00 72 02 45 07 00 28 00 4E 07 00 34 FF 00 01 00 03 07 00 03 07 00 72 02 00 02 07 00 34 01 5C 07 00 34 42 07 00 28 40 07 00 34 45 07 00 28 40 07 00 4F 4A 07 00 4F FF 00 01 00 03 07 00 03 07 00 72 02 00 02 07 00 4F 01 5B 07 00 4F FF 00 08 00 00 00 01 07 00 28 FF 00 00 00 03 07 00 03 07 00 72 02 00 02 07 00 4F 07 00 74 47 07 00 28 00 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 72 02 00 02 07 00 03 01 5E 07 00 03 45 07 00 28 40 07 00 5C 47 07 00 28 40 01 0D 41 01 1B 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 72 02 00 02 07 00 03 01 5D 07 00 03 4D 07 00 5C FF 00 01 00 03 07 00 03 07 00 72 02 00 02 07 00 5C 01 5B 07 00 5C 48 07 00 28 FF 00 00 00 03 07 00 03 07 00 72 02 00 02 07 00 5C 07 00 74 47 07 00 28 00 40 07 00 34 41 07 00 4F 41 07 00 5C 01 41 07 00 03 41 07 00 03 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     389    397    Ljava/lang/UnsupportedOperationException;
        //  389    397    389    397    Any
        //  405    407    3      8      Ljava/lang/AssertionError;
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     37     38     Ljava/lang/IndexOutOfBoundsException;
        //  87     94     94     95     Any
        //  88     94     94     95     Any
        //  87     94     87     88     Any
        //  87     94     94     95     Ljava/util/NoSuchElementException;
        //  87     94     3      8      Ljava/lang/ArithmeticException;
        //  146    154    154    155    Any
        //  146    154    3      8      Any
        //  146    154    3      8      Ljava/lang/UnsupportedOperationException;
        //  146    154    154    155    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  146    154    154    155    Ljava/lang/IllegalStateException;
        //  206    215    215    216    Any
        //  207    215    206    207    Any
        //  207    215    215    216    Ljava/lang/NumberFormatException;
        //  206    215    206    207    Ljava/lang/ClassCastException;
        //  206    215    215    216    Ljava/lang/NumberFormatException;
        //  357    366    366    367    Any
        //  358    366    366    367    Any
        //  357    366    3      8      Any
        //  358    366    357    358    Any
        //  357    366    366    367    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 123
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
    
    public ArrayList 0(final EntityPlayer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1077
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1069
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1061
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.c:I
        //    42: ifge            50
        //    45: ldc             927889845
        //    47: goto            52
        //    50: ldc             1562729155
        //    52: ldc             476596975
        //    54: ixor           
        //    55: lookupswitch {
        //          348284257: 50
        //          723923802: 1048
        //          default: 80
        //        }
        //    80: astore_2       
        //    81: iconst_0       
        //    82: istore_3       
        //    83: iload_3        
        //    84: iconst_4       
        //    85: if_icmpge       978
        //    88: aload_1        
        //    89: getstatic       dev/nuker/pyro/f9j.c:[Lnet/minecraft/util/math/BlockPos;
        //    92: iload_3        
        //    93: aaload         
        //    94: getstatic       dev/nuker/pyro/fc.0:I
        //    97: ifeq            105
        //   100: ldc             1070105615
        //   102: goto            107
        //   105: ldc             -2049820939
        //   107: ldc             2016482499
        //   109: ixor           
        //   110: lookupswitch {
        //          -35446218: 136
        //          1207537868: 105
        //          default: 1036
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokestatic    dev/nuker/pyro/fb8.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
        //   143: goto            147
        //   146: athrow         
        //   147: astore          4
        //   149: getstatic       dev/nuker/pyro/fc.c:I
        //   152: ifge            160
        //   155: ldc             985865424
        //   157: goto            162
        //   160: ldc             -1948856360
        //   162: ldc             602733903
        //   164: ixor           
        //   165: lookupswitch {
        //          -1472580969: 192
        //          422568351: 160
        //          default: 1034
        //        }
        //   192: aload           4
        //   194: goto            198
        //   197: athrow         
        //   198: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //   201: goto            205
        //   204: athrow         
        //   205: getstatic       dev/nuker/pyro/fc.1:I
        //   208: ifeq            216
        //   211: ldc             -520164033
        //   213: goto            218
        //   216: ldc             -968444525
        //   218: ldc             -1677655806
        //   220: ixor           
        //   221: lookupswitch {
        //          1514648721: 248
        //          2097146941: 216
        //          default: 1022
        //        }
        //   248: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //   251: if_acmpeq       257
        //   254: goto            972
        //   257: iconst_0       
        //   258: istore          5
        //   260: aload           4
        //   262: goto            266
        //   265: athrow         
        //   266: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   269: goto            273
        //   272: athrow         
        //   273: astore          6
        //   275: iload_3        
        //   276: tableswitch {
        //                0: 308
        //                1: 484
        //                2: 615
        //                3: 662
        //          default: 794
        //        }
        //   308: getstatic       dev/nuker/pyro/fc.1:I
        //   311: ifeq            319
        //   314: ldc             630430816
        //   316: goto            321
        //   319: ldc             -1205396435
        //   321: ldc             611395431
        //   323: ixor           
        //   324: lookupswitch {
        //          -1672070326: 352
        //          31636231: 319
        //          default: 1032
        //        }
        //   352: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   355: getstatic       dev/nuker/pyro/fc.1:I
        //   358: ifeq            366
        //   361: ldc             1972780102
        //   363: goto            368
        //   366: ldc             1029264919
        //   368: ldc             1856120822
        //   370: ixor           
        //   371: lookupswitch {
        //          456399792: 366
        //          1408987617: 396
        //          default: 1044
        //        }
        //   396: aload           4
        //   398: iconst_1       
        //   399: goto            403
        //   402: athrow         
        //   403: invokevirtual   net/minecraft/util/math/BlockPos.func_177964_d:(I)Lnet/minecraft/util/math/BlockPos;
        //   406: goto            410
        //   409: athrow         
        //   410: goto            414
        //   413: athrow         
        //   414: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   417: goto            421
        //   420: athrow         
        //   421: aload           6
        //   423: iconst_1       
        //   424: getstatic       dev/nuker/pyro/fc.c:I
        //   427: ifge            435
        //   430: ldc             -2078619251
        //   432: goto            437
        //   435: ldc             -560398695
        //   437: ldc             1396312419
        //   439: ixor           
        //   440: lookupswitch {
        //          -1654468151: 435
        //          -685719314: 1046
        //          default: 468
        //        }
        //   468: goto            472
        //   471: athrow         
        //   472: invokevirtual   dev/nuker/pyro/f55.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z
        //   475: goto            479
        //   478: athrow         
        //   479: istore          5
        //   481: goto            794
        //   484: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   487: aload           4
        //   489: iconst_1       
        //   490: goto            494
        //   493: athrow         
        //   494: invokevirtual   net/minecraft/util/math/BlockPos.func_177965_g:(I)Lnet/minecraft/util/math/BlockPos;
        //   497: goto            501
        //   500: athrow         
        //   501: getstatic       dev/nuker/pyro/fc.c:I
        //   504: ifge            512
        //   507: ldc             1690055166
        //   509: goto            514
        //   512: ldc             902064639
        //   514: ldc             -592761861
        //   516: ixor           
        //   517: lookupswitch {
        //          -1206445563: 512
        //          -378584572: 544
        //          default: 1050
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   551: goto            555
        //   554: athrow         
        //   555: getstatic       dev/nuker/pyro/fc.1:I
        //   558: ifeq            566
        //   561: ldc             -785212630
        //   563: goto            568
        //   566: ldc             -1319222485
        //   568: ldc             1525712822
        //   570: ixor           
        //   571: lookupswitch {
        //          -1950212964: 566
        //          -340867939: 596
        //          default: 1038
        //        }
        //   596: aload           6
        //   598: iconst_1       
        //   599: goto            603
        //   602: athrow         
        //   603: invokevirtual   dev/nuker/pyro/f55.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z
        //   606: goto            610
        //   609: athrow         
        //   610: istore          5
        //   612: goto            794
        //   615: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   618: aload           4
        //   620: iconst_1       
        //   621: goto            625
        //   624: athrow         
        //   625: invokevirtual   net/minecraft/util/math/BlockPos.func_177970_e:(I)Lnet/minecraft/util/math/BlockPos;
        //   628: goto            632
        //   631: athrow         
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   639: goto            643
        //   642: athrow         
        //   643: aload           6
        //   645: iconst_1       
        //   646: goto            650
        //   649: athrow         
        //   650: invokevirtual   dev/nuker/pyro/f55.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z
        //   653: goto            657
        //   656: athrow         
        //   657: istore          5
        //   659: goto            794
        //   662: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   665: aload           4
        //   667: iconst_1       
        //   668: getstatic       dev/nuker/pyro/fc.c:I
        //   671: ifge            679
        //   674: ldc             -1168670061
        //   676: goto            681
        //   679: ldc             783434704
        //   681: ldc             -1060140660
        //   683: ixor           
        //   684: lookupswitch {
        //          -293746084: 712
        //          2056784671: 679
        //          default: 1040
        //        }
        //   712: goto            716
        //   715: athrow         
        //   716: invokevirtual   net/minecraft/util/math/BlockPos.func_177985_f:(I)Lnet/minecraft/util/math/BlockPos;
        //   719: goto            723
        //   722: athrow         
        //   723: goto            727
        //   726: athrow         
        //   727: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   730: goto            734
        //   733: athrow         
        //   734: aload           6
        //   736: iconst_1       
        //   737: goto            741
        //   740: athrow         
        //   741: invokevirtual   dev/nuker/pyro/f55.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z
        //   744: goto            748
        //   747: athrow         
        //   748: getstatic       dev/nuker/pyro/fc.0:I
        //   751: ifeq            759
        //   754: ldc             1491013815
        //   756: goto            761
        //   759: ldc             -189055322
        //   761: ldc             9569088
        //   763: ixor           
        //   764: lookupswitch {
        //          -198623770: 792
        //          1481446391: 759
        //          default: 1042
        //        }
        //   792: istore          5
        //   794: getstatic       dev/nuker/pyro/fc.0:I
        //   797: ifeq            805
        //   800: ldc             1264826289
        //   802: goto            807
        //   805: ldc             1575734223
        //   807: ldc             -2050590839
        //   809: ixor           
        //   810: lookupswitch {
        //          -827998152: 1030
        //          1520632924: 805
        //          default: 836
        //        }
        //   836: iload           5
        //   838: ifeq            846
        //   841: ldc             -834587134
        //   843: goto            848
        //   846: ldc             -834587133
        //   848: ldc             533764396
        //   850: ixor           
        //   851: tableswitch {
        //          -1557963172: 872
        //          -1557963171: 972
        //          default: 841
        //        }
        //   872: aload_2        
        //   873: getstatic       dev/nuker/pyro/fc.c:I
        //   876: ifge            884
        //   879: ldc             1903766637
        //   881: goto            886
        //   884: ldc             1186398007
        //   886: ldc             1431604313
        //   888: ixor           
        //   889: lookupswitch {
        //          333607790: 916
        //          606969908: 884
        //          default: 1026
        //        }
        //   916: aload           4
        //   918: getstatic       dev/nuker/pyro/fc.1:I
        //   921: ifeq            929
        //   924: ldc             1027633847
        //   926: goto            931
        //   929: ldc             -406950807
        //   931: ldc             -70464780
        //   933: ixor           
        //   934: lookupswitch {
        //          -963856317: 929
        //          477275805: 960
        //          default: 1024
        //        }
        //   960: goto            964
        //   963: athrow         
        //   964: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   967: goto            971
        //   970: athrow         
        //   971: pop            
        //   972: iinc            3, 1
        //   975: goto            83
        //   978: getstatic       dev/nuker/pyro/fc.1:I
        //   981: ifeq            989
        //   984: ldc             -896288268
        //   986: goto            991
        //   989: ldc             -857051644
        //   991: ldc             -468485467
        //   993: ixor           
        //   994: lookupswitch {
        //          687412385: 1020
        //          780190545: 989
        //          default: 1028
        //        }
        //  1020: aload_2        
        //  1021: areturn        
        //  1022: aconst_null    
        //  1023: athrow         
        //  1024: aconst_null    
        //  1025: athrow         
        //  1026: aconst_null    
        //  1027: athrow         
        //  1028: aconst_null    
        //  1029: athrow         
        //  1030: aconst_null    
        //  1031: athrow         
        //  1032: aconst_null    
        //  1033: athrow         
        //  1034: aconst_null    
        //  1035: athrow         
        //  1036: aconst_null    
        //  1037: athrow         
        //  1038: aconst_null    
        //  1039: athrow         
        //  1040: aconst_null    
        //  1041: athrow         
        //  1042: aconst_null    
        //  1043: athrow         
        //  1044: aconst_null    
        //  1045: athrow         
        //  1046: aconst_null    
        //  1047: athrow         
        //  1048: aconst_null    
        //  1049: athrow         
        //  1050: aconst_null    
        //  1051: athrow         
        //  1052: pop            
        //  1053: goto            24
        //  1056: pop            
        //  1057: aconst_null    
        //  1058: goto            1052
        //  1061: dup            
        //  1062: ifnull          1052
        //  1065: checkcast       Ljava/lang/Throwable;
        //  1068: athrow         
        //  1069: dup            
        //  1070: ifnull          1056
        //  1073: checkcast       Ljava/lang/Throwable;
        //  1076: athrow         
        //  1077: aconst_null    
        //  1078: athrow         
        //    StackMapTable: 00 96 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FD 00 03 07 00 03 07 00 F1 46 07 00 28 FF 00 00 00 02 07 00 03 07 00 F1 00 02 08 00 18 08 00 18 45 07 00 28 40 07 00 85 4A 07 00 85 FF 00 01 00 02 07 00 03 07 00 F1 00 02 07 00 85 01 5B 07 00 85 FD 00 02 07 00 85 01 FF 00 15 00 04 07 00 03 07 00 F1 07 00 85 01 00 02 07 00 F1 07 00 B7 FF 00 01 00 04 07 00 03 07 00 F1 07 00 85 01 00 03 07 00 F1 07 00 B7 01 FF 00 1C 00 04 07 00 03 07 00 F1 07 00 85 01 00 02 07 00 F1 07 00 B7 42 07 00 28 FF 00 00 00 04 07 00 03 07 00 F1 07 00 85 01 00 02 07 00 F1 07 00 B7 45 07 00 28 40 07 00 B7 FC 00 0C 07 00 B7 41 01 1D 44 07 00 28 40 07 00 B7 45 07 00 28 40 07 00 F3 4A 07 00 F3 FF 00 01 00 05 07 00 03 07 00 F1 07 00 85 01 07 00 B7 00 02 07 00 F3 01 5D 07 00 F3 08 FF 00 07 00 06 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 00 01 07 00 28 40 07 00 B7 45 07 00 28 40 07 00 F5 FC 00 22 07 00 F5 0A 41 01 1E 4D 07 00 C4 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 01 5B 07 00 C4 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 42 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 0D 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 05 07 00 C4 07 00 B7 07 00 F5 01 01 FF 00 1E 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 42 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 45 07 00 28 40 01 04 48 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 0A 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 FF 00 1D 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 42 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 0A 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 FF 00 1B 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 05 00 00 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 45 07 00 28 40 01 04 48 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 42 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 45 07 00 28 40 01 04 FF 00 10 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 01 01 FF 00 1E 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 42 07 00 81 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 05 00 00 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 45 07 00 28 40 01 4A 01 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 01 01 5E 01 01 0A 41 01 1C 04 04 41 01 17 4B 07 00 85 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 85 01 5D 07 00 85 FF 00 0C 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 85 07 00 B7 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 85 07 00 B7 01 FF 00 1C 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 85 07 00 B7 FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 85 07 00 B7 45 07 00 28 40 01 F9 00 00 FA 00 05 0A 41 01 1C FF 00 01 00 05 07 00 03 07 00 F1 07 00 85 01 07 00 B7 00 01 07 00 F3 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 85 07 00 B7 41 07 00 85 F8 00 01 FE 00 01 07 00 B7 01 07 00 F5 01 F9 00 01 FF 00 01 00 04 07 00 03 07 00 F1 07 00 85 01 00 02 07 00 F1 07 00 B7 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 03 07 00 C4 07 00 B7 01 41 01 41 07 00 C4 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 04 07 00 C4 07 00 B7 07 00 F5 01 FF 00 01 00 02 07 00 03 07 00 F1 00 01 07 00 85 FF 00 01 00 07 07 00 03 07 00 F1 07 00 85 01 07 00 B7 01 07 00 F5 00 02 07 00 C4 07 00 B7 FF 00 01 00 02 07 00 03 07 00 F1 00 01 07 00 77 43 05 44 07 00 77 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1061   1069   Ljava/lang/IndexOutOfBoundsException;
        //  1061   1069   1061   1069   Ljava/lang/RuntimeException;
        //  1077   1079   3      8      Ljava/lang/AssertionError;
        //  31     38     38     39     Any
        //  32     38     31     32     Any
        //  31     38     3      8      Any
        //  32     38     31     32     Any
        //  32     38     3      8      Any
        //  139    146    146    147    Any
        //  139    146    139    140    Any
        //  139    146    139    140    Any
        //  140    146    146    147    Any
        //  140    146    146    147    Any
        //  197    204    204    205    Any
        //  198    204    197    198    Any
        //  198    204    197    198    Ljava/lang/IndexOutOfBoundsException;
        //  197    204    204    205    Ljava/lang/EnumConstantNotPresentException;
        //  197    204    197    198    Ljava/lang/IllegalArgumentException;
        //  265    272    272    273    Any
        //  266    272    265    266    Any
        //  265    272    265    266    Ljava/lang/NullPointerException;
        //  266    272    265    266    Ljava/lang/NumberFormatException;
        //  265    272    265    266    Any
        //  402    409    409    410    Any
        //  402    409    402    403    Ljava/lang/EnumConstantNotPresentException;
        //  402    409    409    410    Any
        //  403    409    402    403    Any
        //  402    409    402    403    Ljava/lang/NegativeArraySizeException;
        //  413    420    420    421    Any
        //  414    420    3      8      Any
        //  413    420    420    421    Ljava/lang/UnsupportedOperationException;
        //  414    420    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  414    420    413    414    Any
        //  471    478    478    479    Any
        //  472    478    471    472    Ljava/util/ConcurrentModificationException;
        //  472    478    471    472    Any
        //  471    478    478    479    Ljava/lang/ClassCastException;
        //  471    478    471    472    Any
        //  493    500    500    501    Any
        //  494    500    3      8      Any
        //  493    500    493    494    Ljava/lang/IllegalStateException;
        //  493    500    493    494    Any
        //  493    500    3      8      Any
        //  547    554    554    555    Any
        //  547    554    547    548    Any
        //  547    554    3      8      Ljava/lang/UnsupportedOperationException;
        //  547    554    547    548    Any
        //  547    554    547    548    Any
        //  603    609    609    610    Any
        //  603    609    609    610    Ljava/lang/IllegalArgumentException;
        //  603    609    3      8      Ljava/lang/AssertionError;
        //  603    609    609    610    Any
        //  603    609    609    610    Ljava/lang/StringIndexOutOfBoundsException;
        //  624    631    631    632    Any
        //  624    631    631    632    Any
        //  625    631    624    625    Any
        //  625    631    631    632    Any
        //  624    631    3      8      Ljava/lang/RuntimeException;
        //  635    642    642    643    Any
        //  636    642    635    636    Ljava/lang/NegativeArraySizeException;
        //  635    642    3      8      Any
        //  635    642    635    636    Any
        //  635    642    3      8      Ljava/lang/NumberFormatException;
        //  649    656    656    657    Any
        //  649    656    649    650    Any
        //  649    656    656    657    Any
        //  649    656    3      8      Any
        //  649    656    656    657    Any
        //  715    722    722    723    Any
        //  716    722    722    723    Any
        //  715    722    722    723    Ljava/lang/RuntimeException;
        //  715    722    715    716    Ljava/lang/StringIndexOutOfBoundsException;
        //  716    722    715    716    Ljava/lang/StringIndexOutOfBoundsException;
        //  727    733    733    734    Any
        //  727    733    733    734    Any
        //  727    733    733    734    Ljava/lang/IndexOutOfBoundsException;
        //  727    733    733    734    Any
        //  727    733    3      8      Any
        //  741    747    747    748    Any
        //  741    747    747    748    Ljava/lang/NullPointerException;
        //  741    747    3      8      Any
        //  741    747    747    748    Any
        //  741    747    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  964    970    970    971    Any
        //  964    970    3      8      Any
        //  964    970    970    971    Ljava/lang/NumberFormatException;
        //  964    970    970    971    Ljava/lang/NullPointerException;
        //  964    970    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
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
    
    public void c(final EntityPlayer entityPlayer) {
        fbS.1Q(this, 54841049, entityPlayer);
    }
    
    static {
        final BlockPos[] c = new BlockPos[4];
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = -1;
        while (true) {
            int n5 = 0;
            Label_0027: {
                if (fc.c < 0) {
                    n5 = 382767366;
                    break Label_0027;
                }
                n5 = 613869674;
            }
            switch (n5 ^ 0xF8F8CFB9) {
                case -299344193: {
                    continue;
                }
                case -596760621: {
                    c[n] = new BlockPos(n2, n3, n4);
                    c[1] = new BlockPos(1, 0, 0);
                    final int n6 = 2;
                    final int n7 = 0;
                    final int n8 = 0;
                    final int n9 = 1;
                    while (true) {
                        int n10 = 0;
                        Label_0097: {
                            if (fc.1 != 0) {
                                n10 = -1822012045;
                                break Label_0097;
                            }
                            n10 = 316774526;
                        }
                        switch (n10 ^ 0xA259E872) {
                            case 1424210350: {
                                continue;
                            }
                            default: {
                                c[n6] = new BlockPos(n7, n8, n9);
                                c[3] = new BlockPos(-1, 0, 0);
                                f9j.c = c;
                                return;
                            }
                            case 826254593: {
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
    
    public f9j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            12
        //     6: ldc_w           -1634303776
        //     9: goto            15
        //    12: ldc_w           -509775863
        //    15: ldc_w           577401368
        //    18: ixor           
        //    19: lookupswitch {
        //          -1124273416: 12
        //          -1007222255: 44
        //          default: 419
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u2250\u149a\u8b5e\ub3c0\uc935\uec46\ub234"
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u2270\u149a\u8b5e\ub3c0\uc915\uec66\ub214"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: ldc_w           "\u227b\u149a\u8b4d\ub3d1\uc93c\uec5c\ub223\ue76f\ud97c\ue950\ua6d5\u1e4e\ue04f\uc5a8\u81c7\u88c5\u57b7\u76e2\ubd32\uc0f9\u2ae1\uc23e\u6ba4\u2d53\ud72c\u343f\u7d2e\u881a\u8051\u8c70\u851b\ufb33\u7161\u9a56\u1b6f\uf0db\u4969\u8986\uca85\uffd5\ub765\u41b3\ub850\ub341\u4c92\u8b5f"
        //    60: invokestatic    invokestatic   !!! ERROR
        //    63: iconst_1       
        //    64: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    67: aload_0        
        //    68: new             Ldev/nuker/pyro/f0b;
        //    71: dup            
        //    72: ldc_w           "\u2250\u149c\u8b46\ub3d6\uc922"
        //    75: invokestatic    invokestatic   !!! ERROR
        //    78: ldc_w           "\u2276\u149d\u8b4f\ub3d4\uc929\uec76\ub22b\ue76b\ud967\ue951"
        //    81: invokestatic    invokestatic   !!! ERROR
        //    84: aconst_null    
        //    85: new             Ldev/nuker/pyro/fS;
        //    88: dup            
        //    89: fconst_0       
        //    90: fconst_1       
        //    91: ldc_w           0.5
        //    94: ldc_w           0.3
        //    97: getstatic       dev/nuker/pyro/fc.1:I
        //   100: ifeq            109
        //   103: ldc_w           1711780174
        //   106: goto            112
        //   109: ldc_w           -1492788539
        //   112: ldc_w           1036215566
        //   115: ixor           
        //   116: lookupswitch {
        //          -1698250805: 144
        //          1539626048: 109
        //          default: 417
        //        }
        //   144: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   147: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   150: putfield        dev/nuker/pyro/f9j.c:Ldev/nuker/pyro/f0b;
        //   153: aload_0        
        //   154: new             Ldev/nuker/pyro/f0b;
        //   157: dup            
        //   158: ldc_w           "\u2240\u1496\u8b46\ub3df\uc913\uec5a\ub228\ue768\ud97a"
        //   161: invokestatic    invokestatic   !!! ERROR
        //   164: ldc_w           "\u2260\u1496\u8b46\ub3df\uc913\uec5a\ub228\ue768\ud97a"
        //   167: getstatic       dev/nuker/pyro/fc.1:I
        //   170: ifeq            179
        //   173: ldc_w           1972659132
        //   176: goto            182
        //   179: ldc_w           -883221091
        //   182: ldc_w           669238208
        //   185: ixor           
        //   186: lookupswitch {
        //          -323428771: 212
        //          1383571580: 179
        //          default: 421
        //        }
        //   212: invokestatic    invokestatic   !!! ERROR
        //   215: aconst_null    
        //   216: new             Ldev/nuker/pyro/fS;
        //   219: dup            
        //   220: ldc_w           0.125
        //   223: fconst_1       
        //   224: ldc_w           0.5
        //   227: ldc_w           0.3
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            242
        //   236: ldc_w           -495842729
        //   239: goto            245
        //   242: ldc_w           -2031929778
        //   245: ldc_w           -1118731007
        //   248: ixor           
        //   249: lookupswitch {
        //          -990156329: 242
        //          1596165974: 423
        //          default: 276
        //        }
        //   276: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   279: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   282: putfield        dev/nuker/pyro/f9j.0:Ldev/nuker/pyro/f0b;
        //   285: aload_0        
        //   286: new             Ljava/util/concurrent/ConcurrentHashMap;
        //   289: dup            
        //   290: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //   293: putfield        dev/nuker/pyro/f9j.c:Ljava/util/concurrent/ConcurrentHashMap;
        //   296: getstatic       dev/nuker/pyro/fc.0:I
        //   299: ifeq            308
        //   302: ldc_w           935257352
        //   305: goto            311
        //   308: ldc_w           2069009147
        //   311: ldc_w           -516491359
        //   314: ixor           
        //   315: lookupswitch {
        //          -1704696486: 340
        //          -695725399: 308
        //          default: 425
        //        }
        //   340: aload_0        
        //   341: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   344: dup            
        //   345: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   348: putfield        dev/nuker/pyro/f9j.c:Ljava/util/List;
        //   351: aload_0        
        //   352: aload_0        
        //   353: getfield        dev/nuker/pyro/f9j.c:Ldev/nuker/pyro/f0b;
        //   356: invokevirtual   dev/nuker/pyro/f9j.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   359: pop            
        //   360: aload_0        
        //   361: getstatic       dev/nuker/pyro/fc.c:I
        //   364: ifge            373
        //   367: ldc_w           -410337890
        //   370: goto            376
        //   373: ldc_w           1857327492
        //   376: ldc_w           -357871379
        //   379: ixor           
        //   380: lookupswitch {
        //          220327283: 427
        //          1272875536: 373
        //          default: 408
        //        }
        //   408: aload_0        
        //   409: getfield        dev/nuker/pyro/f9j.0:Ldev/nuker/pyro/f0b;
        //   412: invokevirtual   dev/nuker/pyro/f9j.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   415: pop            
        //   416: return         
        //   417: aconst_null    
        //   418: athrow         
        //   419: aconst_null    
        //   420: athrow         
        //   421: aconst_null    
        //   422: athrow         
        //   423: aconst_null    
        //   424: athrow         
        //   425: aconst_null    
        //   426: athrow         
        //   427: aconst_null    
        //   428: athrow         
        //    StackMapTable: 00 18 0C 42 01 1C FF 00 40 00 01 07 00 03 00 0C 07 00 03 08 00 44 08 00 44 07 01 4A 07 01 4A 05 08 00 55 08 00 55 02 02 02 02 FF 00 02 00 01 07 00 03 00 0D 07 00 03 08 00 44 08 00 44 07 01 4A 07 01 4A 05 08 00 55 08 00 55 02 02 02 02 01 FF 00 1F 00 01 07 00 03 00 0C 07 00 03 08 00 44 08 00 44 07 01 4A 07 01 4A 05 08 00 55 08 00 55 02 02 02 02 FF 00 22 00 01 07 00 03 00 05 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A FF 00 1D 00 01 07 00 03 00 0C 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A 05 08 00 D8 08 00 D8 02 02 02 02 FF 00 02 00 01 07 00 03 00 0D 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A 05 08 00 D8 08 00 D8 02 02 02 02 01 FF 00 1E 00 01 07 00 03 00 0C 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A 05 08 00 D8 08 00 D8 02 02 02 02 1F 42 01 1C 60 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 08 00 01 07 00 03 00 0C 07 00 03 08 00 44 08 00 44 07 01 4A 07 01 4A 05 08 00 55 08 00 55 02 02 02 02 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A FF 00 01 00 01 07 00 03 00 0C 07 00 03 08 00 9A 08 00 9A 07 01 4A 07 01 4A 05 08 00 D8 08 00 D8 02 02 02 02 01 41 07 00 03
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
    
    public boolean c(final Map.Entry entry) {
        return fbS.fg(this, 1692292132, entry);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          375
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            367
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            359
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f9j.c:Ljava/util/concurrent/ConcurrentHashMap;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            40
        //    34: ldc_w           363686682
        //    37: goto            43
        //    40: ldc_w           -898826348
        //    43: ldc_w           -1415414124
        //    46: ixor           
        //    47: lookupswitch {
        //          -1106307698: 40
        //          1640923392: 72
        //          default: 342
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   java/util/concurrent/ConcurrentHashMap.entrySet:()Ljava/util/Set;
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: invokedynamic   BootstrapMethod #2, test:(Ldev/nuker/pyro/f9j;)Ljava/util/function/Predicate;
        //    89: goto            93
        //    92: athrow         
        //    93: invokeinterface java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
        //    98: goto            102
        //   101: athrow         
        //   102: pop            
        //   103: aload_0        
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            116
        //   110: ldc_w           -1005039925
        //   113: goto            119
        //   116: ldc_w           1910594826
        //   119: ldc_w           -1426811165
        //   122: ixor           
        //   123: lookupswitch {
        //          -1529690698: 116
        //          1861015592: 344
        //          default: 148
        //        }
        //   148: getfield        dev/nuker/pyro/f9j.c:Lnet/minecraft/client/Minecraft;
        //   151: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   154: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //   157: aload_0        
        //   158: invokedynamic   BootstrapMethod #3, accept:(Ldev/nuker/pyro/f9j;)Ljava/util/function/Consumer;
        //   163: goto            167
        //   166: athrow         
        //   167: invokeinterface java/util/List.forEach:(Ljava/util/function/Consumer;)V
        //   172: goto            176
        //   175: athrow         
        //   176: aload_0        
        //   177: aload_0        
        //   178: getstatic       dev/nuker/pyro/fc.1:I
        //   181: ifeq            190
        //   184: ldc_w           -2129614629
        //   187: goto            193
        //   190: ldc_w           -649078264
        //   193: ldc_w           1269591647
        //   196: ixor           
        //   197: lookupswitch {
        //          -1830570921: 224
        //          -893598076: 190
        //          default: 348
        //        }
        //   224: aload_0        
        //   225: getstatic       dev/nuker/pyro/fc.0:I
        //   228: ifeq            237
        //   231: ldc_w           127628072
        //   234: goto            240
        //   237: ldc_w           -554251334
        //   240: ldc_w           268314774
        //   243: ixor           
        //   244: lookupswitch {
        //          140860350: 340
        //          2070153188: 237
        //          default: 272
        //        }
        //   272: getfield        dev/nuker/pyro/f9j.c:Lnet/minecraft/client/Minecraft;
        //   275: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   dev/nuker/pyro/f9j.0:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/ArrayList;
        //   285: goto            289
        //   288: athrow         
        //   289: getstatic       dev/nuker/pyro/fc.1:I
        //   292: ifeq            301
        //   295: ldc_w           1676288441
        //   298: goto            304
        //   301: ldc_w           -872544556
        //   304: ldc_w           -764739635
        //   307: ixor           
        //   308: lookupswitch {
        //          -1316954508: 301
        //          429193497: 336
        //          default: 346
        //        }
        //   336: putfield        dev/nuker/pyro/f9j.c:Ljava/util/List;
        //   339: return         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //   344: aconst_null    
        //   345: athrow         
        //   346: aconst_null    
        //   347: athrow         
        //   348: aconst_null    
        //   349: athrow         
        //   350: pop            
        //   351: goto            24
        //   354: pop            
        //   355: aconst_null    
        //   356: goto            350
        //   359: dup            
        //   360: ifnull          350
        //   363: checkcast       Ljava/lang/Throwable;
        //   366: athrow         
        //   367: dup            
        //   368: ifnull          354
        //   371: checkcast       Ljava/lang/Throwable;
        //   374: athrow         
        //   375: aconst_null    
        //   376: athrow         
        //    StackMapTable: 00 2D 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FD 00 03 07 00 03 07 01 8A 4F 07 00 34 FF 00 02 00 02 07 00 03 07 01 8A 00 02 07 00 34 01 5C 07 00 34 42 07 00 28 40 07 00 34 45 07 00 28 40 07 00 4F 48 07 00 28 FF 00 00 00 02 07 00 03 07 01 8A 00 02 07 00 4F 07 01 8C 47 07 00 28 40 01 4D 07 00 03 FF 00 02 00 02 07 00 03 07 01 8A 00 02 07 00 03 01 5C 07 00 03 FF 00 11 00 00 00 01 07 00 28 FF 00 00 00 02 07 00 03 07 01 8A 00 02 07 00 5C 07 00 74 47 07 00 28 00 FF 00 0D 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 03 FF 00 0C 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 01 8A 00 04 07 00 03 07 00 03 07 00 03 01 FF 00 1F 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 03 07 00 03 FF 00 08 00 00 00 01 07 00 28 FF 00 00 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 03 07 01 8E 45 07 00 28 FF 00 00 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 85 FF 00 0B 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 85 FF 00 02 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 85 01 FF 00 1F 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 85 FF 00 03 00 02 07 00 03 07 01 8A 00 03 07 00 03 07 00 03 07 00 03 41 07 00 34 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 85 FF 00 01 00 02 07 00 03 07 01 8A 00 02 07 00 03 07 00 03 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     359    367    Any
        //  359    367    359    367    Any
        //  375    377    3      8      Any
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/NegativeArraySizeException;
        //  75     82     3      8      Ljava/lang/AssertionError;
        //  76     82     75     76     Any
        //  75     82     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  92     101    101    102    Any
        //  92     101    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  92     101    92     93     Any
        //  92     101    101    102    Any
        //  93     101    3      8      Any
        //  167    175    175    176    Any
        //  167    175    3      8      Any
        //  167    175    3      8      Ljava/lang/AssertionError;
        //  167    175    175    176    Any
        //  167    175    3      8      Any
        //  282    288    288    289    Any
        //  282    288    288    289    Ljava/util/ConcurrentModificationException;
        //  282    288    3      8      Ljava/lang/NegativeArraySizeException;
        //  282    288    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  282    288    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 80 out of bounds for length 80
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
    
    public void 0(final Map.Entry entry) {
        fbS.eU(this, 1706884147, entry);
    }
    
    public void c(final BlockPos blockPos) {
        fbS.3Y(this, 2020102836, blockPos);
    }
}
