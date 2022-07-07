// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class fbn extends fbk
{
    static {
        throw t;
    }
    
    public static void c(final LinkedHashMap p0, final HashMap p1, final fbm p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          236
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            228
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            220
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: bipush          25
        //    26: anewarray       Lnet/minecraft/util/math/BlockPos;
        //    29: astore_3       
        //    30: iconst_1       
        //    31: istore          4
        //    33: aload_0        
        //    34: aload_2        
        //    35: getstatic       dev/nuker/pyro/fc.0:I
        //    38: ifeq            46
        //    41: ldc             -1057687424
        //    43: goto            48
        //    46: ldc             751544832
        //    48: ldc             -332321111
        //    50: ixor           
        //    51: lookupswitch {
        //          751162921: 205
        //          1052335906: 46
        //          default: 76
        //        }
        //    76: aload_3        
        //    77: goto            81
        //    80: athrow         
        //    81: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    84: goto            88
        //    87: athrow         
        //    88: pop            
        //    89: getstatic       dev/nuker/pyro/fc.0:I
        //    92: ifeq            100
        //    95: ldc             630132270
        //    97: goto            102
        //   100: ldc             2044578967
        //   102: ldc             -1065948588
        //   104: ixor           
        //   105: lookupswitch {
        //          -1179965757: 132
        //          -436607878: 100
        //          default: 207
        //        }
        //   132: aload_1        
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            144
        //   139: ldc             1198949343
        //   141: goto            146
        //   144: ldc             186696762
        //   146: ldc             -1674327830
        //   148: ixor           
        //   149: lookupswitch {
        //          -1760359216: 176
        //          -616215755: 144
        //          default: 209
        //        }
        //   176: aload_2        
        //   177: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //   180: dup            
        //   181: goto            185
        //   184: athrow         
        //   185: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:()V
        //   188: goto            192
        //   191: athrow         
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   199: goto            203
        //   202: athrow         
        //   203: pop            
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
        //    StackMapTable: 00 21 FF 00 03 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 01 07 00 18 F9 00 04 FF 00 0B 00 00 00 01 07 00 18 FE 00 03 07 00 22 07 00 34 07 00 37 FF 00 15 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 02 07 00 22 07 00 37 FF 00 01 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 03 07 00 22 07 00 37 01 FF 00 1B 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 02 07 00 22 07 00 37 43 07 00 0F FF 00 00 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 03 07 00 22 07 00 37 07 00 39 45 07 00 18 40 07 00 3B 0B 41 01 1D 4B 07 00 34 FF 00 01 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 02 07 00 34 01 5D 07 00 34 47 07 00 18 FF 00 00 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 04 07 00 34 07 00 37 08 00 B1 08 00 B1 45 07 00 18 FF 00 00 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 03 07 00 34 07 00 37 07 00 2E 42 07 00 18 FF 00 00 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 03 07 00 34 07 00 37 07 00 2E 45 07 00 18 40 07 00 3B FF 00 01 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 02 07 00 22 07 00 37 01 41 07 00 34 FF 00 01 00 03 07 00 22 07 00 34 07 00 37 00 01 07 00 0D 43 05 44 07 00 0D 47 05 FF 00 07 00 05 07 00 22 07 00 34 07 00 37 07 00 39 01 00 01 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     220    228    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  220    228    220    228    Ljava/lang/IndexOutOfBoundsException;
        //  236    238    3      8      Ljava/lang/NumberFormatException;
        //  80     87     87     88     Any
        //  80     87     87     88     Any
        //  80     87     80     81     Ljava/lang/NumberFormatException;
        //  80     87     3      8      Any
        //  80     87     3      8      Ljava/lang/NumberFormatException;
        //  184    191    191    192    Any
        //  184    191    3      8      Ljava/lang/NullPointerException;
        //  185    191    184    185    Any
        //  184    191    184    185    Any
        //  185    191    184    185    Any
        //  195    202    202    203    Any
        //  195    202    202    203    Any
        //  195    202    195    196    Any
        //  196    202    195    196    Any
        //  196    202    3      8      Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 85 out of bounds for length 85
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
    
    public fbn() {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = -1944105191;
                    break Label_0013;
                }
                n = 1163739382;
            }
            switch (n ^ 0xECAE89C) {
                case -1233123111: {
                    continue;
                }
                default: {}
                case -2099927163: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static fbm c(final IBlockState p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          907
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            899
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            891
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //    34: goto            38
        //    37: athrow         
        //    38: getstatic       dev/nuker/pyro/fc.0:I
        //    41: ifeq            49
        //    44: ldc             1200861202
        //    46: goto            51
        //    49: ldc             -265320119
        //    51: ldc             2125276659
        //    53: ixor           
        //    54: lookupswitch {
        //          -1630675489: 49
        //          960402913: 864
        //          default: 80
        //        }
        //    80: getstatic       net/minecraft/init/Blocks.field_150435_aG:Lnet/minecraft/block/Block;
        //    83: if_acmpne       132
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            97
        //    92: ldc             398009096
        //    94: goto            99
        //    97: ldc             1299335028
        //    99: ldc             -279968497
        //   101: ixor           
        //   102: lookupswitch {
        //          -118938105: 874
        //          541193692: 97
        //          default: 128
        //        }
        //   128: getstatic       dev/nuker/pyro/fbm.c:Ldev/nuker/pyro/fbm;
        //   131: areturn        
        //   132: aload_0        
        //   133: goto            137
        //   136: athrow         
        //   137: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   142: goto            146
        //   145: athrow         
        //   146: getstatic       net/minecraft/init/Blocks.field_150340_R:Lnet/minecraft/block/Block;
        //   149: if_acmpne       156
        //   152: getstatic       dev/nuker/pyro/fbm.0:Ldev/nuker/pyro/fbm;
        //   155: areturn        
        //   156: getstatic       dev/nuker/pyro/fc.0:I
        //   159: ifeq            167
        //   162: ldc             -1892602813
        //   164: goto            169
        //   167: ldc             751716364
        //   169: ldc             -323794835
        //   171: ixor           
        //   172: lookupswitch {
        //          -1065549727: 200
        //          1669489710: 167
        //          default: 860
        //        }
        //   200: aload_0        
        //   201: goto            205
        //   204: athrow         
        //   205: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   210: goto            214
        //   213: athrow         
        //   214: getstatic       dev/nuker/pyro/fc.0:I
        //   217: ifeq            225
        //   220: ldc             -1831417911
        //   222: goto            227
        //   225: ldc             591971247
        //   227: ldc             1210134716
        //   229: ixor           
        //   230: lookupswitch {
        //          -621283467: 225
        //          1802105619: 256
        //          default: 866
        //        }
        //   256: getstatic       net/minecraft/init/Blocks.field_150325_L:Lnet/minecraft/block/Block;
        //   259: if_acmpne       267
        //   262: ldc             1064596300
        //   264: goto            269
        //   267: ldc             1064596301
        //   269: ldc             2079099904
        //   271: ixor           
        //   272: tableswitch {
        //          -1993212264: 296
        //          -1993212263: 300
        //          default: 262
        //        }
        //   296: getstatic       dev/nuker/pyro/fbm.1:Ldev/nuker/pyro/fbm;
        //   299: areturn        
        //   300: aload_0        
        //   301: goto            305
        //   304: athrow         
        //   305: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   310: goto            314
        //   313: athrow         
        //   314: getstatic       dev/nuker/pyro/fc.0:I
        //   317: ifeq            325
        //   320: ldc             -485799796
        //   322: goto            327
        //   325: ldc             -797461312
        //   327: ldc             1474473795
        //   329: ixor           
        //   330: lookupswitch {
        //          -1259739185: 868
        //          77519772: 325
        //          default: 356
        //        }
        //   356: getstatic       net/minecraft/init/Blocks.field_150403_cj:Lnet/minecraft/block/Block;
        //   359: if_acmpne       408
        //   362: getstatic       dev/nuker/pyro/fc.0:I
        //   365: ifeq            373
        //   368: ldc             1747903559
        //   370: goto            375
        //   373: ldc             -33355355
        //   375: ldc             2021177421
        //   377: ixor           
        //   378: lookupswitch {
        //          -2038713880: 404
        //          274095114: 373
        //          default: 870
        //        }
        //   404: getstatic       dev/nuker/pyro/fbm.2:Ldev/nuker/pyro/fbm;
        //   407: areturn        
        //   408: aload_0        
        //   409: goto            413
        //   412: athrow         
        //   413: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   418: goto            422
        //   421: athrow         
        //   422: getstatic       dev/nuker/pyro/fc.0:I
        //   425: ifeq            433
        //   428: ldc             580831322
        //   430: goto            435
        //   433: ldc             620832655
        //   435: ldc             -1339726089
        //   437: ixor           
        //   438: lookupswitch {
        //          -1833193811: 862
        //          -445548719: 433
        //          default: 464
        //        }
        //   464: getstatic       net/minecraft/init/Blocks.field_189880_di:Lnet/minecraft/block/Block;
        //   467: if_acmpne       475
        //   470: ldc             -1145145697
        //   472: goto            477
        //   475: ldc             -1145145698
        //   477: ldc             1254452649
        //   479: ixor           
        //   480: tableswitch {
        //          -487180692: 504
        //          -487180691: 552
        //          default: 470
        //        }
        //   504: getstatic       dev/nuker/pyro/fc.1:I
        //   507: ifeq            515
        //   510: ldc             1998735227
        //   512: goto            517
        //   515: ldc             -1738064142
        //   517: ldc             226532763
        //   519: ixor           
        //   520: lookupswitch {
        //          787837889: 515
        //          2057493216: 878
        //          default: 548
        //        }
        //   548: getstatic       dev/nuker/pyro/fbm.3:Ldev/nuker/pyro/fbm;
        //   551: areturn        
        //   552: aload_0        
        //   553: goto            557
        //   556: athrow         
        //   557: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   562: goto            566
        //   565: athrow         
        //   566: getstatic       net/minecraft/block/material/Material.field_151576_e:Lnet/minecraft/block/material/Material;
        //   569: if_acmpne       577
        //   572: ldc             1579603734
        //   574: goto            579
        //   577: ldc             1579603735
        //   579: ldc             -339761600
        //   581: ixor           
        //   582: tableswitch {
        //          1798496940: 604
        //          1798496941: 608
        //          default: 572
        //        }
        //   604: getstatic       dev/nuker/pyro/fbm.4:Ldev/nuker/pyro/fbm;
        //   607: areturn        
        //   608: aload_0        
        //   609: goto            613
        //   612: athrow         
        //   613: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   618: goto            622
        //   621: athrow         
        //   622: getstatic       dev/nuker/pyro/fc.c:I
        //   625: ifge            633
        //   628: ldc             -75457570
        //   630: goto            635
        //   633: ldc             1595046149
        //   635: ldc             1250275367
        //   637: ixor           
        //   638: lookupswitch {
        //          -1325061127: 880
        //          847085502: 633
        //          default: 664
        //        }
        //   664: getstatic       net/minecraft/block/material/Material.field_151595_p:Lnet/minecraft/block/material/Material;
        //   667: if_acmpne       716
        //   670: getstatic       dev/nuker/pyro/fc.0:I
        //   673: ifeq            681
        //   676: ldc             1512002370
        //   678: goto            683
        //   681: ldc             2039442607
        //   683: ldc             -884967804
        //   685: ixor           
        //   686: lookupswitch {
        //          -1856035386: 681
        //          -1295050197: 712
        //          default: 872
        //        }
        //   712: getstatic       dev/nuker/pyro/fbm.5:Ldev/nuker/pyro/fbm;
        //   715: areturn        
        //   716: aload_0        
        //   717: goto            721
        //   720: athrow         
        //   721: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   726: goto            730
        //   729: athrow         
        //   730: getstatic       net/minecraft/block/material/Material.field_151592_s:Lnet/minecraft/block/material/Material;
        //   733: if_acmpne       784
        //   736: getstatic       dev/nuker/pyro/fc.c:I
        //   739: ifge            747
        //   742: ldc             -1761307591
        //   744: goto            749
        //   747: ldc             2041186160
        //   749: ldc             1515895232
        //   751: ixor           
        //   752: lookupswitch {
        //          -849465863: 858
        //          1012014485: 747
        //          default: 780
        //        }
        //   780: getstatic       dev/nuker/pyro/fbm.6:Ldev/nuker/pyro/fbm;
        //   783: areturn        
        //   784: getstatic       dev/nuker/pyro/fc.c:I
        //   787: ifge            795
        //   790: ldc             -1928078485
        //   792: goto            797
        //   795: ldc             -1732111674
        //   797: ldc             -1285867433
        //   799: ixor           
        //   800: lookupswitch {
        //          731458193: 828
        //          1044964156: 795
        //          default: 876
        //        }
        //   828: aload_0        
        //   829: goto            833
        //   832: athrow         
        //   833: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   838: goto            842
        //   841: athrow         
        //   842: getstatic       net/minecraft/block/material/Material.field_151575_d:Lnet/minecraft/block/material/Material;
        //   845: if_acmpne       854
        //   848: getstatic       dev/nuker/pyro/fbm.7:Ldev/nuker/pyro/fbm;
        //   851: goto            857
        //   854: getstatic       dev/nuker/pyro/fbm.8:Ldev/nuker/pyro/fbm;
        //   857: areturn        
        //   858: aconst_null    
        //   859: athrow         
        //   860: aconst_null    
        //   861: athrow         
        //   862: aconst_null    
        //   863: athrow         
        //   864: aconst_null    
        //   865: athrow         
        //   866: aconst_null    
        //   867: athrow         
        //   868: aconst_null    
        //   869: athrow         
        //   870: aconst_null    
        //   871: athrow         
        //   872: aconst_null    
        //   873: athrow         
        //   874: aconst_null    
        //   875: athrow         
        //   876: aconst_null    
        //   877: athrow         
        //   878: aconst_null    
        //   879: athrow         
        //   880: aconst_null    
        //   881: athrow         
        //   882: pop            
        //   883: goto            24
        //   886: pop            
        //   887: aconst_null    
        //   888: goto            882
        //   891: dup            
        //   892: ifnull          882
        //   895: checkcast       Ljava/lang/Throwable;
        //   898: athrow         
        //   899: dup            
        //   900: ifnull          886
        //   903: checkcast       Ljava/lang/Throwable;
        //   906: athrow         
        //   907: aconst_null    
        //   908: athrow         
        //    StackMapTable: 00 73 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FC 00 03 07 00 51 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 C5 4A 07 00 C5 FF 00 01 00 01 07 00 51 00 02 07 00 C5 01 5C 07 00 C5 10 41 01 1C 03 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 C5 09 0A 41 01 1E 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 C5 4A 07 00 C5 FF 00 01 00 01 07 00 51 00 02 07 00 C5 01 5C 07 00 C5 05 04 41 01 1A 03 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 C5 4A 07 00 C5 FF 00 01 00 01 07 00 51 00 02 07 00 C5 01 5C 07 00 C5 10 41 01 1C 03 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 C5 4A 07 00 C5 FF 00 01 00 01 07 00 51 00 02 07 00 C5 01 5C 07 00 C5 05 04 41 01 1A 0A 41 01 1E 03 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 98 05 04 41 01 18 03 43 07 00 4B 40 07 00 51 47 07 00 18 40 07 00 98 4A 07 00 98 FF 00 01 00 01 07 00 51 00 02 07 00 98 01 5C 07 00 98 10 41 01 1C 03 43 07 00 18 40 07 00 51 47 07 00 18 40 07 00 98 10 41 01 1E 03 0A 41 01 1E 43 07 00 4F 40 07 00 51 47 07 00 18 40 07 00 98 0B 42 07 00 37 00 01 41 07 00 C5 41 07 00 C5 41 07 00 C5 41 07 00 C5 01 01 01 01 01 41 07 00 98 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     891    899    Ljava/lang/NumberFormatException;
        //  891    899    891    899    Any
        //  907    909    3      8      Any
        //  28     37     37     38     Any
        //  28     37     28     29     Any
        //  29     37     28     29     Any
        //  28     37     3      8      Any
        //  29     37     3      8      Any
        //  136    145    145    146    Any
        //  137    145    136    137    Any
        //  137    145    136    137    Any
        //  137    145    145    146    Any
        //  137    145    136    137    Any
        //  204    213    213    214    Any
        //  204    213    204    205    Any
        //  204    213    213    214    Any
        //  205    213    3      8      Ljava/lang/IllegalArgumentException;
        //  204    213    3      8      Any
        //  304    313    313    314    Any
        //  305    313    304    305    Ljava/lang/NumberFormatException;
        //  304    313    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  305    313    313    314    Ljava/lang/NegativeArraySizeException;
        //  304    313    304    305    Any
        //  412    421    421    422    Any
        //  413    421    421    422    Any
        //  413    421    412    413    Any
        //  412    421    3      8      Any
        //  412    421    3      8      Ljava/util/ConcurrentModificationException;
        //  556    565    565    566    Any
        //  557    565    556    557    Ljava/lang/NegativeArraySizeException;
        //  556    565    556    557    Ljava/lang/AssertionError;
        //  556    565    3      8      Any
        //  557    565    556    557    Any
        //  612    621    621    622    Any
        //  613    621    3      8      Any
        //  612    621    612    613    Ljava/lang/AssertionError;
        //  612    621    3      8      Any
        //  612    621    3      8      Any
        //  720    729    729    730    Any
        //  721    729    720    721    Any
        //  721    729    3      8      Ljava/lang/ClassCastException;
        //  720    729    720    721    Ljava/lang/ClassCastException;
        //  720    729    720    721    Any
        //  832    841    841    842    Any
        //  832    841    841    842    Any
        //  832    841    832    833    Ljava/lang/IllegalStateException;
        //  833    841    841    842    Ljava/lang/NullPointerException;
        //  832    841    841    842    Any
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
    
    public static LinkedHashMap c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1232
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1224
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1216
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fbn.c:Lnet/minecraft/client/Minecraft;
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -1559472702
        //    35: goto            40
        //    38: ldc             -1582317311
        //    40: ldc             1011724730
        //    42: ixor           
        //    43: lookupswitch {
        //          -1646104389: 68
        //          -1623071624: 38
        //          default: 1183
        //        }
        //    68: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    71: getstatic       dev/nuker/pyro/fc.c:I
        //    74: ifge            82
        //    77: ldc             775700401
        //    79: goto            84
        //    82: ldc             -1103963281
        //    84: ldc             -1392069846
        //    86: ixor           
        //    87: lookupswitch {
        //          -2093314917: 1199
        //          -1388529201: 82
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   119: goto            123
        //   122: athrow         
        //   123: astore_0       
        //   124: new             Ljava/util/LinkedHashMap;
        //   127: dup            
        //   128: getstatic       dev/nuker/pyro/fc.c:I
        //   131: ifge            139
        //   134: ldc             -395003499
        //   136: goto            141
        //   139: ldc             1556900319
        //   141: ldc             304826435
        //   143: ixor           
        //   144: lookupswitch {
        //          -94375466: 139
        //          1323770268: 172
        //          default: 1203
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   179: goto            183
        //   182: athrow         
        //   183: getstatic       dev/nuker/pyro/fc.1:I
        //   186: ifeq            194
        //   189: ldc             26502073
        //   191: goto            196
        //   194: ldc             -92778053
        //   196: ldc             1341695413
        //   198: ixor           
        //   199: lookupswitch {
        //          -1249840114: 224
        //          1315751436: 194
        //          default: 1175
        //        }
        //   224: astore_1       
        //   225: new             Ljava/util/HashMap;
        //   228: dup            
        //   229: goto            233
        //   232: athrow         
        //   233: invokespecial   java/util/HashMap.<init>:()V
        //   236: goto            240
        //   239: athrow         
        //   240: getstatic       dev/nuker/pyro/fc.1:I
        //   243: ifeq            251
        //   246: ldc             1384433663
        //   248: goto            253
        //   251: ldc             637315412
        //   253: ldc             -1223915868
        //   255: ixor           
        //   256: lookupswitch {
        //          -1829752848: 284
        //          -444055205: 251
        //          default: 1181
        //        }
        //   284: astore_2       
        //   285: goto            289
        //   288: athrow         
        //   289: invokestatic    dev/nuker/pyro/fbm.values:()[Ldev/nuker/pyro/fbm;
        //   292: goto            296
        //   295: athrow         
        //   296: goto            300
        //   299: athrow         
        //   300: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   303: goto            307
        //   306: athrow         
        //   307: aload_1        
        //   308: aload_2        
        //   309: invokedynamic   BootstrapMethod #0, accept:(Ljava/util/LinkedHashMap;Ljava/util/HashMap;)Ljava/util/function/Consumer;
        //   314: goto            318
        //   317: athrow         
        //   318: invokeinterface java/util/List.forEach:(Ljava/util/function/Consumer;)V
        //   323: goto            327
        //   326: athrow         
        //   327: bipush          6
        //   329: istore_3       
        //   330: bipush          -6
        //   332: dup            
        //   333: istore          4
        //   335: istore          5
        //   337: getstatic       dev/nuker/pyro/fc.1:I
        //   340: ifeq            349
        //   343: ldc_w           286677148
        //   346: goto            352
        //   349: ldc_w           -318305318
        //   352: ldc_w           1245991121
        //   355: ixor           
        //   356: lookupswitch {
        //          -1488758005: 384
        //          1532102733: 349
        //          default: 1205
        //        }
        //   384: iload           5
        //   386: iload_3        
        //   387: if_icmpge       1173
        //   390: iload_3        
        //   391: ineg           
        //   392: dup            
        //   393: istore          6
        //   395: istore          5
        //   397: getstatic       dev/nuker/pyro/fc.c:I
        //   400: ifge            409
        //   403: ldc_w           -1569119200
        //   406: goto            412
        //   409: ldc_w           -645742693
        //   412: ldc_w           892873044
        //   415: ixor           
        //   416: lookupswitch {
        //          -1757344396: 1177
        //          94213740: 409
        //          default: 444
        //        }
        //   444: iload           5
        //   446: getstatic       dev/nuker/pyro/fc.c:I
        //   449: ifge            458
        //   452: ldc_w           1231081294
        //   455: goto            461
        //   458: ldc_w           721187392
        //   461: ldc_w           -1004081615
        //   464: ixor           
        //   465: lookupswitch {
        //          -1924783745: 458
        //          -287662991: 492
        //          default: 1179
        //        }
        //   492: iload_3        
        //   493: if_icmpge       1072
        //   496: iconst_m1      
        //   497: dup            
        //   498: istore          7
        //   500: istore          5
        //   502: iload           5
        //   504: iconst_5       
        //   505: if_icmpge       514
        //   508: ldc_w           862891629
        //   511: goto            517
        //   514: ldc_w           862891628
        //   517: ldc_w           637023559
        //   520: ixor           
        //   521: tableswitch {
        //          757937748: 544
        //          757937749: 1062
        //          default: 508
        //        }
        //   544: aload_0        
        //   545: iload           4
        //   547: iload           7
        //   549: iload           6
        //   551: goto            555
        //   554: athrow         
        //   555: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   558: goto            562
        //   561: athrow         
        //   562: dup            
        //   563: astore          8
        //   565: getstatic       dev/nuker/pyro/fc.0:I
        //   568: ifeq            577
        //   571: ldc_w           1763664107
        //   574: goto            580
        //   577: ldc_w           -2093835032
        //   580: ldc_w           -932774197
        //   583: ixor           
        //   584: lookupswitch {
        //          -1585865184: 1197
        //          -1521751925: 577
        //          default: 612
        //        }
        //   612: goto            616
        //   615: athrow         
        //   616: invokestatic    dev/nuker/pyro/fbn.c:(Lnet/minecraft/util/math/BlockPos;)D
        //   619: goto            623
        //   622: athrow         
        //   623: ldc2_w          27.040000000000003
        //   626: dcmpg          
        //   627: ifge            1052
        //   630: getstatic       dev/nuker/pyro/fbn.c:Lnet/minecraft/client/Minecraft;
        //   633: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   636: getstatic       dev/nuker/pyro/fc.c:I
        //   639: ifge            648
        //   642: ldc_w           562549884
        //   645: goto            651
        //   648: ldc_w           -1952518754
        //   651: ldc_w           -820656304
        //   654: ixor           
        //   655: lookupswitch {
        //          -292416724: 648
        //          1149971150: 680
        //          default: 1193
        //        }
        //   680: aload           8
        //   682: goto            686
        //   685: athrow         
        //   686: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   689: goto            693
        //   692: athrow         
        //   693: goto            697
        //   696: athrow         
        //   697: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   702: goto            706
        //   705: athrow         
        //   706: getstatic       net/minecraft/init/Blocks.field_150323_B:Lnet/minecraft/block/Block;
        //   709: if_acmpne       718
        //   712: ldc_w           -802883009
        //   715: goto            721
        //   718: ldc_w           -802883024
        //   721: ldc_w           -1994779240
        //   724: ixor           
        //   725: tableswitch {
        //          -1300373682: 748
        //          -1300373681: 1052
        //          default: 712
        //        }
        //   748: getstatic       dev/nuker/pyro/fc.1:I
        //   751: ifeq            760
        //   754: ldc_w           1727427771
        //   757: goto            763
        //   760: ldc_w           1099992714
        //   763: ldc_w           -720190907
        //   766: ixor           
        //   767: lookupswitch {
        //          -1803399985: 792
        //          -1276856578: 760
        //          default: 1191
        //        }
        //   792: getstatic       dev/nuker/pyro/fbn.c:Lnet/minecraft/client/Minecraft;
        //   795: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   798: aload           8
        //   800: goto            804
        //   803: athrow         
        //   804: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   807: goto            811
        //   810: athrow         
        //   811: goto            815
        //   814: athrow         
        //   815: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   818: goto            822
        //   821: athrow         
        //   822: goto            826
        //   825: athrow         
        //   826: invokestatic    dev/nuker/pyro/fbn.c:(Lnet/minecraft/block/state/IBlockState;)Ldev/nuker/pyro/fbm;
        //   829: goto            833
        //   832: athrow         
        //   833: astore          9
        //   835: getstatic       dev/nuker/pyro/fc.1:I
        //   838: ifeq            847
        //   841: ldc_w           1537884539
        //   844: goto            850
        //   847: ldc_w           978167719
        //   850: ldc_w           1379492233
        //   853: ixor           
        //   854: lookupswitch {
        //          160637170: 847
        //          1752483374: 880
        //          default: 1187
        //        }
        //   880: aload_2        
        //   881: aload           9
        //   883: goto            887
        //   886: athrow         
        //   887: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   890: goto            894
        //   893: athrow         
        //   894: checkcast       Ljava/util/concurrent/atomic/AtomicInteger;
        //   897: goto            901
        //   900: athrow         
        //   901: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
        //   904: goto            908
        //   907: athrow         
        //   908: dup            
        //   909: istore          10
        //   911: bipush          25
        //   913: if_icmpge       1052
        //   916: aload_1        
        //   917: aload           9
        //   919: goto            923
        //   922: athrow         
        //   923: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   926: goto            930
        //   929: athrow         
        //   930: checkcast       [Lnet/minecraft/util/math/BlockPos;
        //   933: checkcast       [Lnet/minecraft/util/math/BlockPos;
        //   936: getstatic       dev/nuker/pyro/fc.0:I
        //   939: ifeq            948
        //   942: ldc_w           -152640117
        //   945: goto            951
        //   948: ldc_w           601376906
        //   951: ldc_w           99843643
        //   954: ixor           
        //   955: lookupswitch {
        //          -216687696: 1201
        //          503304671: 948
        //          default: 980
        //        }
        //   980: astore          11
        //   982: aload           11
        //   984: iload           10
        //   986: aload           8
        //   988: aastore        
        //   989: aload_1        
        //   990: aload           9
        //   992: aload           11
        //   994: getstatic       dev/nuker/pyro/fc.0:I
        //   997: ifeq            1006
        //  1000: ldc_w           -1754790783
        //  1003: goto            1009
        //  1006: ldc_w           -879921880
        //  1009: ldc_w           1505897412
        //  1012: ixor           
        //  1013: lookupswitch {
        //          -827707579: 1185
        //          -148310355: 1006
        //          default: 1040
        //        }
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1047: goto            1051
        //  1050: athrow         
        //  1051: pop            
        //  1052: iinc            7, 1
        //  1055: iload           7
        //  1057: istore          5
        //  1059: goto            502
        //  1062: iinc            6, 1
        //  1065: iload           6
        //  1067: istore          5
        //  1069: goto            397
        //  1072: iinc            4, 1
        //  1075: getstatic       dev/nuker/pyro/fc.c:I
        //  1078: ifge            1087
        //  1081: ldc_w           233871390
        //  1084: goto            1090
        //  1087: ldc_w           -1047792788
        //  1090: ldc_w           994475533
        //  1093: ixor           
        //  1094: lookupswitch {
        //          -87192223: 1120
        //          917956115: 1087
        //          default: 1195
        //        }
        //  1120: iload           4
        //  1122: getstatic       dev/nuker/pyro/fc.1:I
        //  1125: ifeq            1134
        //  1128: ldc_w           962737083
        //  1131: goto            1137
        //  1134: ldc_w           899278452
        //  1137: ldc_w           -1815610894
        //  1140: ixor           
        //  1141: lookupswitch {
        //          -1431975351: 1189
        //          -299749130: 1134
        //          default: 1168
        //        }
        //  1168: istore          5
        //  1170: goto            337
        //  1173: aload_1        
        //  1174: areturn        
        //  1175: aconst_null    
        //  1176: athrow         
        //  1177: aconst_null    
        //  1178: athrow         
        //  1179: aconst_null    
        //  1180: athrow         
        //  1181: aconst_null    
        //  1182: athrow         
        //  1183: aconst_null    
        //  1184: athrow         
        //  1185: aconst_null    
        //  1186: athrow         
        //  1187: aconst_null    
        //  1188: athrow         
        //  1189: aconst_null    
        //  1190: athrow         
        //  1191: aconst_null    
        //  1192: athrow         
        //  1193: aconst_null    
        //  1194: athrow         
        //  1195: aconst_null    
        //  1196: athrow         
        //  1197: aconst_null    
        //  1198: athrow         
        //  1199: aconst_null    
        //  1200: athrow         
        //  1201: aconst_null    
        //  1202: athrow         
        //  1203: aconst_null    
        //  1204: athrow         
        //  1205: aconst_null    
        //  1206: athrow         
        //  1207: pop            
        //  1208: goto            24
        //  1211: pop            
        //  1212: aconst_null    
        //  1213: goto            1207
        //  1216: dup            
        //  1217: ifnull          1207
        //  1220: checkcast       Ljava/lang/Throwable;
        //  1223: athrow         
        //  1224: dup            
        //  1225: ifnull          1211
        //  1228: checkcast       Ljava/lang/Throwable;
        //  1231: athrow         
        //  1232: aconst_null    
        //  1233: athrow         
        //    StackMapTable: 00 9C 43 07 00 18 04 4B 07 00 18 03 4D 07 00 D8 FF 00 01 00 00 00 02 07 00 D8 01 5B 07 00 D8 4D 07 00 E1 FF 00 01 00 00 00 02 07 00 E1 01 5B 07 00 E1 42 07 00 18 40 07 00 E1 45 07 00 18 40 07 00 1A FF 00 0F 00 01 07 00 1A 00 02 08 00 7C 08 00 7C FF 00 01 00 01 07 00 1A 00 03 08 00 7C 08 00 7C 01 FF 00 1E 00 01 07 00 1A 00 02 08 00 7C 08 00 7C 42 07 00 18 FF 00 00 00 01 07 00 1A 00 02 08 00 7C 08 00 7C 45 07 00 18 40 07 00 22 4A 07 00 22 FF 00 01 00 01 07 00 1A 00 02 07 00 22 01 5B 07 00 22 FF 00 07 00 02 07 00 1A 07 00 22 00 01 07 00 D0 FF 00 00 00 02 07 00 1A 07 00 22 00 02 08 00 E1 08 00 E1 45 07 00 18 40 07 00 34 4A 07 00 34 FF 00 01 00 02 07 00 1A 07 00 22 00 02 07 00 34 01 5E 07 00 34 FF 00 03 00 03 07 00 1A 07 00 22 07 00 34 00 01 07 00 18 00 45 07 00 18 40 07 01 5F 42 07 00 18 40 07 01 5F 45 07 00 18 40 07 01 0E 49 07 00 18 FF 00 00 00 03 07 00 1A 07 00 22 07 00 34 00 02 07 01 0E 07 01 61 47 07 00 18 00 FE 00 09 01 01 01 0B 42 01 1F FC 00 0C 01 0B 42 01 1F 4D 01 FF 00 02 00 07 07 00 1A 07 00 22 07 00 34 01 01 01 01 00 02 01 01 5E 01 FC 00 09 01 05 05 42 01 1A 49 07 00 18 FF 00 00 00 08 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 00 04 07 00 1A 01 01 01 45 07 00 18 40 07 00 1A FF 00 0E 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 01 07 00 1A FF 00 02 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 00 1A 01 5F 07 00 1A 42 07 00 18 40 07 00 1A 45 07 00 18 40 03 58 07 01 33 FF 00 02 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 01 33 01 5C 07 01 33 44 07 00 18 FF 00 00 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 01 33 07 00 1A 45 07 00 18 40 07 00 51 42 07 00 CA 40 07 00 51 47 07 00 18 40 07 00 C5 05 05 42 01 1A 0B 42 01 1C 4A 07 00 0F FF 00 00 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 01 33 07 00 1A 45 07 00 18 FF 00 00 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 01 33 07 00 1A 42 07 00 18 FF 00 00 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 02 07 01 33 07 00 1A 45 07 00 18 40 07 00 51 42 07 00 18 40 07 00 51 45 07 00 18 40 07 00 37 FC 00 0D 07 00 37 42 01 1D 45 07 00 18 FF 00 00 00 0A 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 00 02 07 00 34 07 00 37 45 07 00 18 40 07 00 3B 45 07 00 CC 40 07 00 2E 45 07 00 18 40 01 FF 00 0D 00 0B 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 00 01 07 00 4B FF 00 00 00 0B 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 00 02 07 00 22 07 00 37 45 07 00 18 40 07 00 3B 51 07 00 39 FF 00 02 00 0B 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 00 02 07 00 39 01 5C 07 00 39 FF 00 19 00 0C 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 07 00 39 00 03 07 00 22 07 00 37 07 00 39 FF 00 02 00 0C 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 07 00 39 00 04 07 00 22 07 00 37 07 00 39 01 FF 00 1E 00 0C 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 07 00 39 00 03 07 00 22 07 00 37 07 00 39 42 07 00 18 FF 00 00 00 0C 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 07 00 39 00 03 07 00 22 07 00 37 07 00 39 45 07 00 18 40 07 00 3B F8 00 00 FA 00 09 FA 00 09 0E 42 01 1D 4D 01 FF 00 02 00 07 07 00 1A 07 00 22 07 00 34 01 01 01 01 00 02 01 01 5E 01 FA 00 04 FF 00 01 00 01 07 00 1A 00 01 07 00 22 FF 00 01 00 07 07 00 1A 07 00 22 07 00 34 01 01 01 01 00 00 41 01 FF 00 01 00 02 07 00 1A 07 00 22 00 01 07 00 34 FF 00 01 00 00 00 01 07 00 D8 FF 00 01 00 0C 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 07 00 39 00 03 07 00 22 07 00 37 07 00 39 F9 00 01 FF 00 01 00 07 07 00 1A 07 00 22 07 00 34 01 01 01 01 00 01 01 FD 00 01 01 07 00 1A 41 07 01 33 F9 00 01 FF 00 01 00 09 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 00 01 07 00 1A FF 00 01 00 00 00 01 07 00 E1 FF 00 01 00 0B 07 00 1A 07 00 22 07 00 34 01 01 01 01 01 07 00 1A 07 00 37 01 00 01 07 00 39 FF 00 01 00 01 07 00 1A 00 02 08 00 7C 08 00 7C FF 00 01 00 06 07 00 1A 07 00 22 07 00 34 01 01 01 00 00 FF 00 01 00 00 00 01 07 00 D0 43 05 44 07 00 D0 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1216   1224   Ljava/lang/EnumConstantNotPresentException;
        //  1216   1224   1216   1224   Ljava/lang/UnsupportedOperationException;
        //  1232   1234   3      8      Any
        //  116    122    122    123    Any
        //  116    122    122    123    Any
        //  116    122    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  116    122    3      8      Any
        //  116    122    3      8      Any
        //  175    182    182    183    Any
        //  176    182    3      8      Any
        //  176    182    175    176    Any
        //  175    182    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  176    182    182    183    Ljava/lang/NegativeArraySizeException;
        //  232    239    239    240    Any
        //  232    239    239    240    Ljava/lang/EnumConstantNotPresentException;
        //  233    239    232    233    Ljava/lang/IllegalStateException;
        //  232    239    3      8      Any
        //  232    239    232    233    Ljava/lang/IndexOutOfBoundsException;
        //  288    295    295    296    Any
        //  289    295    295    296    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  289    295    295    296    Ljava/lang/StringIndexOutOfBoundsException;
        //  289    295    288    289    Any
        //  288    295    288    289    Any
        //  299    306    306    307    Any
        //  299    306    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  299    306    299    300    Any
        //  300    306    306    307    Any
        //  299    306    299    300    Ljava/lang/NumberFormatException;
        //  317    326    326    327    Any
        //  318    326    317    318    Any
        //  317    326    317    318    Ljava/util/NoSuchElementException;
        //  318    326    326    327    Ljava/lang/StringIndexOutOfBoundsException;
        //  318    326    326    327    Ljava/lang/NumberFormatException;
        //  554    561    561    562    Any
        //  555    561    3      8      Any
        //  555    561    554    555    Any
        //  554    561    3      8      Any
        //  555    561    561    562    Ljava/lang/IllegalStateException;
        //  615    622    622    623    Any
        //  616    622    622    623    Any
        //  615    622    615    616    Any
        //  615    622    3      8      Ljava/lang/NullPointerException;
        //  615    622    3      8      Ljava/lang/AssertionError;
        //  685    692    692    693    Any
        //  686    692    685    686    Any
        //  685    692    3      8      Any
        //  686    692    685    686    Any
        //  686    692    685    686    Any
        //  696    705    705    706    Any
        //  696    705    696    697    Ljava/lang/UnsupportedOperationException;
        //  697    705    3      8      Ljava/lang/IllegalArgumentException;
        //  697    705    705    706    Any
        //  697    705    3      8      Any
        //  803    810    810    811    Any
        //  804    810    3      8      Ljava/lang/UnsupportedOperationException;
        //  803    810    3      8      Ljava/lang/NullPointerException;
        //  804    810    3      8      Any
        //  804    810    803    804    Ljava/lang/NumberFormatException;
        //  814    821    821    822    Any
        //  815    821    814    815    Any
        //  814    821    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  814    821    814    815    Any
        //  815    821    3      8      Any
        //  825    832    832    833    Any
        //  826    832    832    833    Ljava/lang/IndexOutOfBoundsException;
        //  826    832    832    833    Ljava/lang/RuntimeException;
        //  825    832    825    826    Ljava/lang/AssertionError;
        //  826    832    825    826    Ljava/lang/EnumConstantNotPresentException;
        //  886    893    893    894    Any
        //  886    893    893    894    Ljava/lang/NumberFormatException;
        //  886    893    893    894    Any
        //  886    893    886    887    Any
        //  887    893    886    887    Any
        //  900    907    907    908    Any
        //  900    907    3      8      Any
        //  900    907    900    901    Ljava/lang/StringIndexOutOfBoundsException;
        //  900    907    3      8      Any
        //  901    907    907    908    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  922    929    929    930    Any
        //  922    929    3      8      Any
        //  923    929    3      8      Ljava/lang/NegativeArraySizeException;
        //  923    929    929    930    Ljava/lang/IllegalArgumentException;
        //  923    929    922    923    Ljava/lang/AssertionError;
        //  1043   1050   1050   1051   Any
        //  1043   1050   1043   1044   Any
        //  1044   1050   3      8      Ljava/util/ConcurrentModificationException;
        //  1043   1050   3      8      Any
        //  1043   1050   1050   1051   Ljava/lang/NumberFormatException;
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
    
    public static double c(final BlockPos blockPos) {
        return fbS.3R(null, 111040906, blockPos);
    }
}
