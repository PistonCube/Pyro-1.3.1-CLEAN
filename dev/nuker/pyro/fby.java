// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.Arrays;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;
import java.util.List;

public class fby extends fbk
{
    public static List<Block> c;
    public static List<Block> 0;
    public static double[] c;
    public static double[] 0;
    public static double[] 1;
    
    public static fbx c(final BlockPos p0, final boolean p1, final boolean p2, final EnumFacing p3, final ItemStack p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          635
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            627
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            619
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    30: ifnonnull       80
        //    33: getstatic       dev/nuker/pyro/fc.1:I
        //    36: ifeq            44
        //    39: ldc             26108581
        //    41: goto            46
        //    44: ldc             2040539788
        //    46: ldc             1887966578
        //    48: ixor           
        //    49: lookupswitch {
        //          -162530612: 44
        //          1896249303: 594
        //          default: 76
        //        }
        //    76: getstatic       dev/nuker/pyro/fbx.c:Ldev/nuker/pyro/fbx;
        //    79: areturn        
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            91
        //    86: ldc             741041691
        //    88: goto            93
        //    91: ldc             103941362
        //    93: ldc             -211991706
        //    95: ixor           
        //    96: lookupswitch {
        //          -545905283: 91
        //          -177256556: 124
        //          default: 596
        //        }
        //   124: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   127: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   130: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //   133: dup            
        //   134: aload_0        
        //   135: goto            139
        //   138: athrow         
        //   139: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(Lnet/minecraft/util/math/BlockPos;)V
        //   142: goto            146
        //   145: athrow         
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            157
        //   152: ldc             -1470794376
        //   154: goto            159
        //   157: ldc             -1267281357
        //   159: ldc             -601670263
        //   161: ixor           
        //   162: lookupswitch {
        //          -889118410: 157
        //          1953908977: 598
        //          default: 188
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72855_b:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //   195: goto            199
        //   198: athrow         
        //   199: ifne            252
        //   202: getstatic       dev/nuker/pyro/fc.1:I
        //   205: ifeq            213
        //   208: ldc             1622038167
        //   210: goto            215
        //   213: ldc             1582001973
        //   215: ldc             -1855822548
        //   217: ixor           
        //   218: lookupswitch {
        //          -838114904: 213
        //          -238275653: 606
        //          default: 244
        //        }
        //   244: iload_1        
        //   245: ifne            252
        //   248: getstatic       dev/nuker/pyro/fbx.c:Ldev/nuker/pyro/fbx;
        //   251: areturn        
        //   252: getstatic       dev/nuker/pyro/fc.0:I
        //   255: ifeq            263
        //   258: ldc             -843240831
        //   260: goto            265
        //   263: ldc             -357467430
        //   265: ldc             -2042194514
        //   267: ixor           
        //   268: lookupswitch {
        //          842439392: 263
        //          1274789679: 608
        //          default: 296
        //        }
        //   296: aload_0        
        //   297: getstatic       dev/nuker/pyro/fc.0:I
        //   300: ifeq            308
        //   303: ldc             -52418834
        //   305: goto            310
        //   308: ldc             -50963256
        //   310: ldc             635536138
        //   312: ixor           
        //   313: lookupswitch {
        //          -749656604: 308
        //          -654203420: 602
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokestatic    dev/nuker/pyro/fby.5:(Lnet/minecraft/util/math/BlockPos;)Z
        //   347: goto            351
        //   350: athrow         
        //   351: ifne            359
        //   354: ldc             -982340490
        //   356: goto            361
        //   359: ldc             -982340495
        //   361: ldc             302777581
        //   363: ixor           
        //   364: tableswitch {
        //          -1359130314: 388
        //          -1359130313: 436
        //          default: 354
        //        }
        //   388: getstatic       dev/nuker/pyro/fc.0:I
        //   391: ifeq            399
        //   394: ldc             -995928622
        //   396: goto            401
        //   399: ldc             1438146380
        //   401: ldc             -220283509
        //   403: ixor           
        //   404: lookupswitch {
        //          -1105941036: 399
        //          914221145: 600
        //          default: 432
        //        }
        //   432: getstatic       dev/nuker/pyro/fbx.1:Ldev/nuker/pyro/fbx;
        //   435: areturn        
        //   436: aload           4
        //   438: goto            442
        //   441: athrow         
        //   442: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   445: goto            449
        //   448: athrow         
        //   449: instanceof      Lnet/minecraft/item/ItemBlock;
        //   452: ifeq            460
        //   455: ldc             -977615360
        //   457: goto            462
        //   460: ldc             -977615357
        //   462: ldc             176554953
        //   464: ixor           
        //   465: tableswitch {
        //          -1636201582: 488
        //          -1636201581: 590
        //          default: 455
        //        }
        //   488: aload           4
        //   490: goto            494
        //   493: athrow         
        //   494: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   497: goto            501
        //   500: athrow         
        //   501: checkcast       Lnet/minecraft/item/ItemBlock;
        //   504: astore          5
        //   506: aload           5
        //   508: getstatic       dev/nuker/pyro/fc.1:I
        //   511: ifeq            519
        //   514: ldc             1024619540
        //   516: goto            521
        //   519: ldc             593104110
        //   521: ldc             1249220254
        //   523: ixor           
        //   524: lookupswitch {
        //          703029886: 519
        //          2003296906: 604
        //          default: 552
        //        }
        //   552: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   555: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   558: aload_0        
        //   559: aload_3        
        //   560: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   563: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   566: aload           4
        //   568: goto            572
        //   571: athrow         
        //   572: invokevirtual   net/minecraft/item/ItemBlock.func_179222_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z
        //   575: goto            579
        //   578: athrow         
        //   579: ifne            586
        //   582: getstatic       dev/nuker/pyro/fbx.0:Ldev/nuker/pyro/fbx;
        //   585: areturn        
        //   586: getstatic       dev/nuker/pyro/fbx.2:Ldev/nuker/pyro/fbx;
        //   589: areturn        
        //   590: getstatic       dev/nuker/pyro/fbx.0:Ldev/nuker/pyro/fbx;
        //   593: areturn        
        //   594: aconst_null    
        //   595: athrow         
        //   596: aconst_null    
        //   597: athrow         
        //   598: aconst_null    
        //   599: athrow         
        //   600: aconst_null    
        //   601: athrow         
        //   602: aconst_null    
        //   603: athrow         
        //   604: aconst_null    
        //   605: athrow         
        //   606: aconst_null    
        //   607: athrow         
        //   608: aconst_null    
        //   609: athrow         
        //   610: pop            
        //   611: goto            24
        //   614: pop            
        //   615: aconst_null    
        //   616: goto            610
        //   619: dup            
        //   620: ifnull          610
        //   623: checkcast       Ljava/lang/Throwable;
        //   626: athrow         
        //   627: dup            
        //   628: ifnull          614
        //   631: checkcast       Ljava/lang/Throwable;
        //   634: athrow         
        //   635: aconst_null    
        //   636: athrow         
        //    StackMapTable: 00 4E 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 05 07 00 80 01 01 07 00 82 07 00 65 00 00 13 41 01 1D 03 0A 41 01 1E 4D 07 00 14 FF 00 00 00 05 07 00 80 01 01 07 00 82 07 00 65 00 04 07 00 4A 08 00 82 08 00 82 07 00 80 45 07 00 27 FF 00 00 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 4A 07 00 41 FF 00 0A 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 4A 07 00 41 FF 00 01 00 05 07 00 80 01 01 07 00 82 07 00 65 00 03 07 00 4A 07 00 41 01 FF 00 1C 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 4A 07 00 41 42 07 00 27 FF 00 00 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 4A 07 00 41 45 07 00 27 40 01 0D 41 01 1C 07 0A 41 01 1E 4B 07 00 80 FF 00 01 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 80 01 5D 07 00 80 42 07 00 27 40 07 00 80 45 07 00 27 40 01 02 04 41 01 1A 0A 41 01 1E 03 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 05 07 00 80 01 01 07 00 82 07 00 65 00 01 07 00 65 45 07 00 27 40 07 00 84 05 04 41 01 19 44 07 00 27 40 07 00 65 45 07 00 27 40 07 00 84 FF 00 11 00 06 07 00 80 01 01 07 00 82 07 00 65 07 00 6B 00 01 07 00 6B FF 00 01 00 06 07 00 80 01 01 07 00 82 07 00 65 07 00 6B 00 02 07 00 6B 01 5E 07 00 6B 52 07 00 27 FF 00 00 00 06 07 00 80 01 01 07 00 82 07 00 65 07 00 6B 00 06 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 45 07 00 27 40 01 06 FA 00 03 03 01 FF 00 01 00 05 07 00 80 01 01 07 00 82 07 00 65 00 02 07 00 4A 07 00 41 01 41 07 00 80 FF 00 01 00 06 07 00 80 01 01 07 00 82 07 00 65 07 00 6B 00 01 07 00 6B FA 00 01 01 41 07 00 88 43 05 44 07 00 88 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     619    627    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  619    627    619    627    Ljava/lang/NumberFormatException;
        //  635    637    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  138    145    145    146    Any
        //  138    145    3      8      Any
        //  138    145    3      8      Ljava/lang/NegativeArraySizeException;
        //  138    145    138    139    Ljava/lang/UnsupportedOperationException;
        //  138    145    145    146    Ljava/lang/NullPointerException;
        //  191    198    198    199    Any
        //  192    198    3      8      Any
        //  191    198    3      8      Any
        //  192    198    3      8      Any
        //  191    198    191    192    Any
        //  343    350    350    351    Any
        //  344    350    350    351    Ljava/lang/EnumConstantNotPresentException;
        //  344    350    343    344    Ljava/lang/AssertionError;
        //  343    350    343    344    Any
        //  344    350    343    344    Ljava/lang/IllegalStateException;
        //  442    448    448    449    Any
        //  442    448    448    449    Ljava/lang/IllegalArgumentException;
        //  442    448    448    449    Ljava/lang/NegativeArraySizeException;
        //  442    448    3      8      Any
        //  442    448    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  493    500    500    501    Any
        //  493    500    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  494    500    493    494    Any
        //  493    500    500    501    Ljava/lang/NullPointerException;
        //  493    500    3      8      Ljava/lang/NegativeArraySizeException;
        //  571    578    578    579    Any
        //  571    578    3      8      Any
        //  572    578    3      8      Any
        //  571    578    571    572    Ljava/util/ConcurrentModificationException;
        //  572    578    571    572    Any
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
    
    public static float[] c(final double p0, final double p1, final double p2, final double p3, final double p4, final double p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          970
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            962
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            954
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: dload_0        
        //    25: dload           6
        //    27: dsub           
        //    28: dstore          12
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            41
        //    36: ldc             1728105566
        //    38: goto            43
        //    41: ldc             615324191
        //    43: ldc             -1277748810
        //    45: ixor           
        //    46: lookupswitch {
        //          -1753611351: 72
        //          -724052504: 41
        //          default: 927
        //        }
        //    72: dload_2        
        //    73: dload           8
        //    75: dsub           
        //    76: dstore          14
        //    78: dload           4
        //    80: dload           10
        //    82: dsub           
        //    83: dstore          16
        //    85: dload           16
        //    87: dconst_0       
        //    88: dcmpg          
        //    89: ifge            219
        //    92: dload           12
        //    94: dconst_0       
        //    95: dcmpg          
        //    96: ifge            219
        //    99: ldc2_w          90.0
        //   102: getstatic       dev/nuker/pyro/fc.0:I
        //   105: ifeq            113
        //   108: ldc             -214660431
        //   110: goto            115
        //   113: ldc             -614843315
        //   115: ldc             -282692223
        //   117: ixor           
        //   118: lookupswitch {
        //          -964687742: 113
        //          471007024: 941
        //          default: 144
        //        }
        //   144: dload           16
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            157
        //   152: ldc             -2002551266
        //   154: goto            159
        //   157: ldc             849209201
        //   159: ldc             1121298709
        //   161: ixor           
        //   162: lookupswitch {
        //          -898181365: 157
        //          1883786852: 188
        //          default: 931
        //        }
        //   188: dload           12
        //   190: ddiv           
        //   191: goto            195
        //   194: athrow         
        //   195: invokestatic    java/lang/Math.atan:(D)D
        //   198: goto            202
        //   201: athrow         
        //   202: goto            206
        //   205: athrow         
        //   206: invokestatic    java/lang/Math.toDegrees:(D)D
        //   209: goto            213
        //   212: athrow         
        //   213: dadd           
        //   214: dstore          18
        //   216: goto            426
        //   219: dload           16
        //   221: dconst_0       
        //   222: dcmpg          
        //   223: ifge            313
        //   226: dload           12
        //   228: dconst_0       
        //   229: dcmpl          
        //   230: ifle            313
        //   233: ldc2_w          -90.0
        //   236: dload           16
        //   238: dload           12
        //   240: ddiv           
        //   241: goto            245
        //   244: athrow         
        //   245: invokestatic    java/lang/Math.atan:(D)D
        //   248: goto            252
        //   251: athrow         
        //   252: goto            256
        //   255: athrow         
        //   256: invokestatic    java/lang/Math.toDegrees:(D)D
        //   259: goto            263
        //   262: athrow         
        //   263: dadd           
        //   264: getstatic       dev/nuker/pyro/fc.1:I
        //   267: ifeq            275
        //   270: ldc             881802820
        //   272: goto            277
        //   275: ldc             1536479244
        //   277: ldc             -431561837
        //   279: ixor           
        //   280: lookupswitch {
        //          -758522409: 933
        //          1425671321: 275
        //          default: 308
        //        }
        //   308: dstore          18
        //   310: goto            426
        //   313: dload           12
        //   315: getstatic       dev/nuker/pyro/fc.c:I
        //   318: ifge            326
        //   321: ldc             794659159
        //   323: goto            328
        //   326: ldc             1182852131
        //   328: ldc             -2134948769
        //   330: ixor           
        //   331: lookupswitch {
        //          -1344090872: 326
        //          -968908676: 356
        //          default: 919
        //        }
        //   356: dload           16
        //   358: ddiv           
        //   359: goto            363
        //   362: athrow         
        //   363: invokestatic    java/lang/Math.atan:(D)D
        //   366: goto            370
        //   369: athrow         
        //   370: dneg           
        //   371: goto            375
        //   374: athrow         
        //   375: invokestatic    java/lang/Math.toDegrees:(D)D
        //   378: goto            382
        //   381: athrow         
        //   382: getstatic       dev/nuker/pyro/fc.0:I
        //   385: ifeq            393
        //   388: ldc             -1916713861
        //   390: goto            395
        //   393: ldc             -1696103053
        //   395: ldc             -1980239336
        //   397: ixor           
        //   398: lookupswitch {
        //          70694499: 393
        //          319846251: 424
        //          default: 929
        //        }
        //   424: dstore          18
        //   426: dload           12
        //   428: dload           12
        //   430: dmul           
        //   431: dload           16
        //   433: dload           16
        //   435: dmul           
        //   436: dadd           
        //   437: goto            441
        //   440: athrow         
        //   441: invokestatic    java/lang/Math.sqrt:(D)D
        //   444: goto            448
        //   447: athrow         
        //   448: dstore          20
        //   450: getstatic       dev/nuker/pyro/fc.0:I
        //   453: ifeq            461
        //   456: ldc             -661230353
        //   458: goto            463
        //   461: ldc             856078313
        //   463: ldc             149749826
        //   465: ixor           
        //   466: lookupswitch {
        //          -1858349571: 461
        //          -797217619: 923
        //          default: 492
        //        }
        //   492: dload           14
        //   494: dload           20
        //   496: ddiv           
        //   497: goto            501
        //   500: athrow         
        //   501: invokestatic    java/lang/Math.atan:(D)D
        //   504: goto            508
        //   507: athrow         
        //   508: goto            512
        //   511: athrow         
        //   512: invokestatic    java/lang/Math.toDegrees:(D)D
        //   515: goto            519
        //   518: athrow         
        //   519: dneg           
        //   520: getstatic       dev/nuker/pyro/fc.c:I
        //   523: ifge            531
        //   526: ldc             -2083233786
        //   528: goto            533
        //   531: ldc             -1515212527
        //   533: ldc             -448450798
        //   535: ixor           
        //   536: lookupswitch {
        //          254649957: 531
        //          1720798996: 939
        //          default: 564
        //        }
        //   564: dstore          22
        //   566: getstatic       dev/nuker/pyro/fc.0:I
        //   569: ifeq            577
        //   572: ldc             -65670159
        //   574: goto            579
        //   577: ldc             -1265956546
        //   579: ldc             2133695425
        //   581: ixor           
        //   582: lookupswitch {
        //          -2093455312: 921
        //          -495778235: 577
        //          default: 608
        //        }
        //   608: dload           18
        //   610: d2f            
        //   611: getstatic       dev/nuker/pyro/fc.1:I
        //   614: ifeq            622
        //   617: ldc             628629608
        //   619: goto            624
        //   622: ldc             226938435
        //   624: ldc             -1169463827
        //   626: ixor           
        //   627: lookupswitch {
        //          -1624029819: 943
        //          -464671440: 622
        //          default: 652
        //        }
        //   652: goto            656
        //   655: athrow         
        //   656: invokestatic    dev/nuker/pyro/fby.c:(F)F
        //   659: goto            663
        //   662: athrow         
        //   663: f2d            
        //   664: getstatic       dev/nuker/pyro/fc.c:I
        //   667: ifge            675
        //   670: ldc             279961054
        //   672: goto            677
        //   675: ldc             1473234328
        //   677: ldc             1380243963
        //   679: ixor           
        //   680: lookupswitch {
        //          1122698277: 937
        //          1747286863: 675
        //          default: 708
        //        }
        //   708: dstore          18
        //   710: dload           22
        //   712: d2f            
        //   713: goto            717
        //   716: athrow         
        //   717: invokestatic    dev/nuker/pyro/fby.c:(F)F
        //   720: goto            724
        //   723: athrow         
        //   724: f2d            
        //   725: dstore          22
        //   727: getstatic       dev/nuker/pyro/fc.0:I
        //   730: ifeq            738
        //   733: ldc             -1795385172
        //   735: goto            740
        //   738: ldc             -1169471426
        //   740: ldc             2093094172
        //   742: ixor           
        //   743: lookupswitch {
        //          -398553680: 935
        //          1374211235: 738
        //          default: 768
        //        }
        //   768: dload           18
        //   770: goto            774
        //   773: athrow         
        //   774: invokestatic    java/lang/Double.isNaN:(D)Z
        //   777: goto            781
        //   780: athrow         
        //   781: ifeq            788
        //   784: dconst_0       
        //   785: goto            790
        //   788: dload           18
        //   790: dstore          18
        //   792: getstatic       dev/nuker/pyro/fc.0:I
        //   795: ifeq            803
        //   798: ldc             -2137797907
        //   800: goto            805
        //   803: ldc             -1405315846
        //   805: ldc             601898711
        //   807: ixor           
        //   808: lookupswitch {
        //          -1881363923: 836
        //          -1552681926: 803
        //          default: 925
        //        }
        //   836: dload           22
        //   838: goto            842
        //   841: athrow         
        //   842: invokestatic    java/lang/Double.isNaN:(D)Z
        //   845: goto            849
        //   848: athrow         
        //   849: ifeq            856
        //   852: dconst_0       
        //   853: goto            858
        //   856: dload           22
        //   858: dstore          22
        //   860: iconst_2       
        //   861: newarray        F
        //   863: dup            
        //   864: iconst_0       
        //   865: dload           18
        //   867: d2f            
        //   868: fastore        
        //   869: dup            
        //   870: iconst_1       
        //   871: getstatic       dev/nuker/pyro/fc.c:I
        //   874: ifge            882
        //   877: ldc             954955571
        //   879: goto            884
        //   882: ldc             1476040736
        //   884: ldc             -1617518268
        //   886: ixor           
        //   887: lookupswitch {
        //          -1484925321: 917
        //          1110657157: 882
        //          default: 912
        //        }
        //   912: dload           22
        //   914: d2f            
        //   915: fastore        
        //   916: areturn        
        //   917: aconst_null    
        //   918: athrow         
        //   919: aconst_null    
        //   920: athrow         
        //   921: aconst_null    
        //   922: athrow         
        //   923: aconst_null    
        //   924: athrow         
        //   925: aconst_null    
        //   926: athrow         
        //   927: aconst_null    
        //   928: athrow         
        //   929: aconst_null    
        //   930: athrow         
        //   931: aconst_null    
        //   932: athrow         
        //   933: aconst_null    
        //   934: athrow         
        //   935: aconst_null    
        //   936: athrow         
        //   937: aconst_null    
        //   938: athrow         
        //   939: aconst_null    
        //   940: athrow         
        //   941: aconst_null    
        //   942: athrow         
        //   943: aconst_null    
        //   944: athrow         
        //   945: pop            
        //   946: goto            24
        //   949: pop            
        //   950: aconst_null    
        //   951: goto            945
        //   954: dup            
        //   955: ifnull          945
        //   958: checkcast       Ljava/lang/Throwable;
        //   961: athrow         
        //   962: dup            
        //   963: ifnull          949
        //   966: checkcast       Ljava/lang/Throwable;
        //   969: athrow         
        //   970: aconst_null    
        //   971: athrow         
        //    StackMapTable: 00 7C FF 00 03 00 09 03 03 03 03 03 03 03 03 03 00 01 07 00 27 F8 00 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 06 03 03 03 03 03 03 00 00 FC 00 10 03 41 01 1C FF 00 28 00 09 03 03 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 02 03 01 5C 03 FF 00 0C 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 03 03 03 01 FF 00 1C 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 45 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 45 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 42 07 00 88 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 45 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 05 58 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 45 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 42 07 00 8F FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 45 07 00 27 FF 00 00 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 4B 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 02 03 01 5E 03 04 4C 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 02 03 01 5B 03 45 07 00 27 40 03 45 07 00 27 40 03 43 07 00 27 40 03 45 07 00 27 40 03 4A 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 02 03 01 5C 03 FC 00 01 03 4D 07 00 27 40 03 45 07 00 27 40 03 FC 00 0C 03 41 01 1C 47 07 00 1E 40 03 45 07 00 27 40 03 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 0B 03 03 03 03 03 03 03 03 03 03 03 00 01 03 45 07 00 27 40 03 4B 03 FF 00 01 00 0B 03 03 03 03 03 03 03 03 03 03 03 00 02 03 01 5E 03 FC 00 0C 03 41 01 1C 4D 02 FF 00 01 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 02 02 01 5B 02 42 07 00 1C 40 02 45 07 00 27 40 02 4B 03 FF 00 01 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 02 03 01 5E 03 47 07 00 27 40 02 45 07 00 27 40 02 0D 41 01 1B 44 07 00 27 40 03 45 07 00 27 40 01 06 41 03 0C 41 01 1E 44 07 00 18 40 03 45 07 00 27 40 01 06 41 03 FF 00 17 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 03 07 00 D8 07 00 D8 01 FF 00 01 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 04 07 00 D8 07 00 D8 01 01 FF 00 1B 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 03 07 00 D8 07 00 D8 01 FF 00 04 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 03 07 00 D8 07 00 D8 01 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 01 03 FE 00 01 03 03 03 FA 00 01 FC 00 01 03 FF 00 01 00 07 03 03 03 03 03 03 03 00 00 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 02 03 03 41 03 FE 00 01 03 03 03 41 03 FF 00 01 00 0B 03 03 03 03 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 09 03 03 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 0C 03 03 03 03 03 03 03 03 03 03 03 03 00 01 02 FF 00 01 00 06 03 03 03 03 03 03 00 01 07 00 27 43 05 44 07 00 27 47 05 FF 00 07 00 09 03 03 03 03 03 03 03 03 03 00 01 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     954    962    Any
        //  954    962    954    962    Ljava/lang/AssertionError;
        //  970    972    3      8      Any
        //  194    201    201    202    Any
        //  195    201    201    202    Ljava/lang/StringIndexOutOfBoundsException;
        //  195    201    194    195    Ljava/lang/EnumConstantNotPresentException;
        //  194    201    3      8      Any
        //  194    201    194    195    Any
        //  205    212    212    213    Any
        //  206    212    205    206    Ljava/lang/NumberFormatException;
        //  206    212    3      8      Ljava/lang/IllegalArgumentException;
        //  205    212    212    213    Ljava/util/NoSuchElementException;
        //  206    212    205    206    Ljava/lang/StringIndexOutOfBoundsException;
        //  244    251    251    252    Any
        //  245    251    251    252    Any
        //  245    251    3      8      Any
        //  244    251    244    245    Any
        //  244    251    3      8      Ljava/lang/UnsupportedOperationException;
        //  255    262    262    263    Any
        //  256    262    3      8      Any
        //  256    262    255    256    Ljava/lang/IndexOutOfBoundsException;
        //  256    262    3      8      Any
        //  255    262    262    263    Ljava/lang/IllegalStateException;
        //  362    369    369    370    Any
        //  362    369    3      8      Any
        //  362    369    362    363    Ljava/lang/UnsupportedOperationException;
        //  363    369    369    370    Any
        //  362    369    362    363    Ljava/lang/AssertionError;
        //  374    381    381    382    Any
        //  375    381    3      8      Ljava/lang/UnsupportedOperationException;
        //  374    381    381    382    Ljava/util/ConcurrentModificationException;
        //  375    381    374    375    Any
        //  375    381    381    382    Any
        //  440    447    447    448    Any
        //  441    447    440    441    Ljava/lang/ArithmeticException;
        //  441    447    3      8      Any
        //  441    447    3      8      Ljava/lang/IllegalStateException;
        //  440    447    440    441    Any
        //  500    507    507    508    Any
        //  500    507    507    508    Ljava/lang/UnsupportedOperationException;
        //  500    507    500    501    Ljava/lang/IllegalArgumentException;
        //  500    507    3      8      Any
        //  500    507    507    508    Ljava/util/NoSuchElementException;
        //  512    518    518    519    Any
        //  512    518    3      8      Ljava/lang/NumberFormatException;
        //  512    518    518    519    Ljava/lang/ArithmeticException;
        //  512    518    3      8      Any
        //  512    518    518    519    Ljava/util/NoSuchElementException;
        //  655    662    662    663    Any
        //  655    662    662    663    Ljava/lang/NumberFormatException;
        //  655    662    662    663    Ljava/lang/NegativeArraySizeException;
        //  656    662    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  655    662    655    656    Ljava/lang/IllegalStateException;
        //  716    723    723    724    Any
        //  716    723    3      8      Ljava/lang/ArithmeticException;
        //  716    723    716    717    Any
        //  717    723    3      8      Any
        //  717    723    723    724    Any
        //  773    780    780    781    Any
        //  774    780    780    781    Ljava/lang/StringIndexOutOfBoundsException;
        //  774    780    773    774    Any
        //  774    780    780    781    Any
        //  773    780    773    774    Ljava/lang/ClassCastException;
        //  841    848    848    849    Any
        //  841    848    841    842    Ljava/lang/EnumConstantNotPresentException;
        //  841    848    848    849    Ljava/lang/NegativeArraySizeException;
        //  841    848    848    849    Ljava/lang/RuntimeException;
        //  841    848    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:622)
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
    
    public static float c(float n) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0343:
            while (true) {
                float n2;
                int n3;
                int n4;
                float n5;
                int n6;
                int n7;
                int n8;
                int n9;
                Block_8_Outer:Block_11_Outer:Label_0029_Outer:
                do {
                    Label_0330: {
                        break Label_0330;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0335;
                            }
                            continue Label_0343;
                            Label_0108: {
                                n = n2;
                            }
                            // iftrue(Label_0127:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@4e166c22, n7 ^ 0xF1E79FE7)
                            // iftrue(Label_0312:, n >= -180.0f)
                            // iftrue(Label_0212:, n < 180.0f)
                            // switch([Lcom.strobel.decompiler.ast.Label;@6e519faa, n6 ^ 0x3B8F4362)
                            // switch([Lcom.strobel.decompiler.ast.Label;@43c39e0b, n9 ^ 0x8BF86228)
                            // iftrue(Label_0075:, fc.0 == 0)
                            // iftrue(Label_0223:, fc.c >= 0)
                            // iftrue(Label_0175:, fc.0 == 0)
                            // iftrue(Label_0027:, fc.c >= 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@47b50caf, n8 ^ 0x993DD34E)
                            // iftrue(Label_0274:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@3a3f1f07, n4 ^ 0xA7843AED)
                            Label_0177: {
                                Label_0276: {
                                    Label_0029:Label_0225_Outer:
                                    while (true) {
                                    Label_0225:
                                        while (true) {
                                        Block_4_Outer:
                                            while (true) {
                                                Block_10: {
                                                    Block_9: {
                                                        Label_0129: {
                                                            while (true) {
                                                                Block_7: {
                                                                    while (true) {
                                                                        Label_0212: {
                                                                            while (true) {
                                                                                Label_0077: {
                                                                                    while (true) {
                                                                                        Label_0109: {
                                                                                            break Label_0109;
                                                                                            break Block_7;
                                                                                            n3 = -1462046681;
                                                                                            break Label_0177;
                                                                                            n4 = -1870194794;
                                                                                            break Label_0276;
                                                                                            Label_0208:
                                                                                            n = n5;
                                                                                            break Label_0109;
                                                                                            Label_0075:
                                                                                            n6 = 1305596588;
                                                                                            break Label_0077;
                                                                                            Label_0304:
                                                                                            n += 360.0f;
                                                                                            break Label_0212;
                                                                                            Label_0175:
                                                                                            n3 = 1212357255;
                                                                                            break Label_0177;
                                                                                            n6 = -463321999;
                                                                                            break Label_0077;
                                                                                            Label_0318:
                                                                                            throw null;
                                                                                            Label_0316:
                                                                                            throw null;
                                                                                            Label_0320:
                                                                                            throw null;
                                                                                            Label_0127:
                                                                                            n8 = -1639737786;
                                                                                            break Label_0129;
                                                                                            n7 = -2123729767;
                                                                                            continue Label_0029;
                                                                                            Label_0256:
                                                                                            break Block_10;
                                                                                        }
                                                                                        continue Block_8_Outer;
                                                                                    }
                                                                                    Label_0322:
                                                                                    throw null;
                                                                                }
                                                                                Label_0060:
                                                                                n2 = n % 360.0f;
                                                                                continue Block_4_Outer;
                                                                            }
                                                                            Label_0324:
                                                                            throw null;
                                                                            Label_0312:
                                                                            return n;
                                                                            Label_0314:
                                                                            throw null;
                                                                        }
                                                                        break Block_9;
                                                                        Label_0274:
                                                                        n4 = 892652647;
                                                                        break Label_0276;
                                                                        Label_0160:
                                                                        n5 = n - 360.0f;
                                                                        continue Block_11_Outer;
                                                                    }
                                                                }
                                                                n8 = 1463166594;
                                                                break Label_0129;
                                                                continue Label_0225_Outer;
                                                            }
                                                        }
                                                    }
                                                    n9 = -1494038923;
                                                    continue Label_0225;
                                                }
                                                continue Label_0029_Outer;
                                            }
                                            Label_0223:
                                            n9 = -757576206;
                                            continue Label_0225;
                                        }
                                        Label_0027:
                                        n7 = -755269006;
                                        continue Label_0029;
                                    }
                                }
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@58f17b25, n3 ^ 0x77B140F6)
                        catch (EnumConstantNotPresentException ex) {}
                    }
                    continue Label_0343;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public static fbB 1(final BlockPos blockPos) {
        return fbS.1N(null, 238851098, blockPos);
    }
    
    public static fbB 0(final BlockPos p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3191
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            3183
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3175
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aconst_null    
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             -2040128740
        //    33: goto            38
        //    36: ldc             -1493978970
        //    38: ldc             446646742
        //    40: ixor           
        //    41: lookupswitch {
        //          -1661381942: 36
        //          -1133708944: 68
        //          default: 3100
        //        }
        //    68: astore_3       
        //    69: new             Lnet/minecraft/util/math/Vec3d;
        //    72: dup            
        //    73: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    76: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    79: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    82: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    85: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //    95: goto            99
        //    98: athrow         
        //    99: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   102: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   105: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   108: getstatic       dev/nuker/pyro/fc.0:I
        //   111: ifeq            120
        //   114: ldc_w           -1722448359
        //   117: goto            123
        //   120: ldc_w           -1779477135
        //   123: ldc_w           1676853488
        //   126: ixor           
        //   127: lookupswitch {
        //          -89700631: 3120
        //          633970628: 120
        //          default: 152
        //        }
        //   152: goto            156
        //   155: athrow         
        //   156: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   159: goto            163
        //   162: athrow         
        //   163: f2d            
        //   164: dadd           
        //   165: getstatic       dev/nuker/pyro/fc.1:I
        //   168: ifeq            177
        //   171: ldc_w           1330132977
        //   174: goto            180
        //   177: ldc_w           1355560280
        //   180: ldc_w           996093884
        //   183: ixor           
        //   184: lookupswitch {
        //          -1359815694: 177
        //          1947670605: 3158
        //          default: 212
        //        }
        //   212: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   215: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   218: getstatic       dev/nuker/pyro/fc.c:I
        //   221: ifge            230
        //   224: ldc_w           -1989552769
        //   227: goto            233
        //   230: ldc_w           -213858727
        //   233: ldc_w           1643781589
        //   236: ixor           
        //   237: lookupswitch {
        //          -1833247860: 264
        //          -392968022: 230
        //          default: 3128
        //        }
        //   264: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   267: getstatic       dev/nuker/pyro/fc.1:I
        //   270: ifeq            279
        //   273: ldc_w           255828320
        //   276: goto            282
        //   279: ldc_w           425151351
        //   282: ldc_w           774822497
        //   285: ixor           
        //   286: lookupswitch {
        //          554793729: 279
        //          930713878: 312
        //          default: 3106
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   319: goto            323
        //   322: athrow         
        //   323: astore          4
        //   325: goto            329
        //   328: athrow         
        //   329: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //   332: goto            336
        //   335: athrow         
        //   336: astore          5
        //   338: aload           5
        //   340: arraylength    
        //   341: istore          6
        //   343: iconst_0       
        //   344: istore          7
        //   346: iload           7
        //   348: getstatic       dev/nuker/pyro/fc.c:I
        //   351: ifge            360
        //   354: ldc_w           -1196430433
        //   357: goto            363
        //   360: ldc_w           1874576626
        //   363: ldc_w           -1110555878
        //   366: ixor           
        //   367: lookupswitch {
        //          -669930501: 360
        //          90286213: 3132
        //          default: 392
        //        }
        //   392: iload           6
        //   394: if_icmpge       403
        //   397: ldc_w           -945409057
        //   400: goto            406
        //   403: ldc_w           -945409058
        //   406: ldc_w           1416326399
        //   409: ixor           
        //   410: tableswitch {
        //          664452672: 432
        //          664452673: 3028
        //          default: 397
        //        }
        //   432: getstatic       dev/nuker/pyro/fc.0:I
        //   435: ifeq            444
        //   438: ldc_w           -1642943308
        //   441: goto            447
        //   444: ldc_w           1940990100
        //   447: ldc_w           344675757
        //   450: ixor           
        //   451: lookupswitch {
        //          -1969620711: 444
        //          1731886393: 476
        //          default: 3130
        //        }
        //   476: aload           5
        //   478: getstatic       dev/nuker/pyro/fc.0:I
        //   481: ifeq            490
        //   484: ldc_w           -172973112
        //   487: goto            493
        //   490: ldc_w           -1285706500
        //   493: ldc_w           -1343168339
        //   496: ixor           
        //   497: lookupswitch {
        //          481119313: 524
        //          1514160997: 490
        //          default: 3134
        //        }
        //   524: iload           7
        //   526: aaload         
        //   527: astore          8
        //   529: getstatic       dev/nuker/pyro/fc.0:I
        //   532: ifeq            541
        //   535: ldc_w           531687500
        //   538: goto            544
        //   541: ldc_w           504786483
        //   544: ldc_w           611383933
        //   547: ixor           
        //   548: lookupswitch {
        //          988486059: 541
        //          1002443313: 3144
        //          default: 576
        //        }
        //   576: aload_0        
        //   577: aload           8
        //   579: goto            583
        //   582: athrow         
        //   583: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   586: goto            590
        //   589: athrow         
        //   590: getstatic       dev/nuker/pyro/fc.0:I
        //   593: ifeq            602
        //   596: ldc_w           -1230706042
        //   599: goto            605
        //   602: ldc_w           -833126502
        //   605: ldc_w           -352500211
        //   608: ixor           
        //   609: lookupswitch {
        //          -1564620892: 602
        //          1549380747: 3124
        //          default: 636
        //        }
        //   636: astore          9
        //   638: getstatic       dev/nuker/pyro/fc.c:I
        //   641: ifge            650
        //   644: ldc_w           -792156933
        //   647: goto            653
        //   650: ldc_w           981836713
        //   653: ldc_w           1828313322
        //   656: ixor           
        //   657: lookupswitch {
        //          -1137607663: 650
        //          1450998595: 684
        //          default: 3122
        //        }
        //   684: aload           9
        //   686: goto            690
        //   689: athrow         
        //   690: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   693: goto            697
        //   696: athrow         
        //   697: ifne            703
        //   700: goto            3022
        //   703: new             Lnet/minecraft/util/math/Vec3d;
        //   706: dup            
        //   707: aload           8
        //   709: goto            713
        //   712: athrow         
        //   713: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //   716: goto            720
        //   719: athrow         
        //   720: goto            724
        //   723: athrow         
        //   724: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   727: goto            731
        //   730: athrow         
        //   731: astore          10
        //   733: ldc2_w          0.1
        //   736: getstatic       dev/nuker/pyro/fc.1:I
        //   739: ifeq            748
        //   742: ldc_w           55009625
        //   745: goto            751
        //   748: ldc_w           -597378434
        //   751: ldc_w           1004252652
        //   754: ixor           
        //   755: lookupswitch {
        //          -406906990: 780
        //          949800117: 748
        //          default: 3114
        //        }
        //   780: dstore          11
        //   782: dload           11
        //   784: ldc2_w          0.9
        //   787: dcmpg          
        //   788: ifge            3022
        //   791: ldc2_w          0.1
        //   794: getstatic       dev/nuker/pyro/fc.1:I
        //   797: ifeq            806
        //   800: ldc_w           212728503
        //   803: goto            809
        //   806: ldc_w           -525755207
        //   809: ldc_w           -85723945
        //   812: ixor           
        //   813: lookupswitch {
        //          -162656672: 806
        //          441084014: 840
        //          default: 3116
        //        }
        //   840: dstore          13
        //   842: dload           13
        //   844: ldc2_w          0.9
        //   847: dcmpg          
        //   848: ifge            3011
        //   851: ldc2_w          0.1
        //   854: dstore          15
        //   856: dload           15
        //   858: ldc2_w          0.9
        //   861: dcmpg          
        //   862: ifge            2953
        //   865: new             Lnet/minecraft/util/math/Vec3d;
        //   868: dup            
        //   869: aload_0        
        //   870: goto            874
        //   873: athrow         
        //   874: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   877: goto            881
        //   880: athrow         
        //   881: dload           11
        //   883: getstatic       dev/nuker/pyro/fc.0:I
        //   886: ifeq            895
        //   889: ldc_w           -1620732533
        //   892: goto            898
        //   895: ldc_w           -318859812
        //   898: ldc_w           -1226783486
        //   901: ixor           
        //   902: lookupswitch {
        //          -571121437: 895
        //          696602761: 3104
        //          default: 928
        //        }
        //   928: dload           13
        //   930: dload           15
        //   932: goto            936
        //   935: athrow         
        //   936: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   939: goto            943
        //   942: athrow         
        //   943: astore          17
        //   945: aload           4
        //   947: getstatic       dev/nuker/pyro/fc.1:I
        //   950: ifeq            959
        //   953: ldc_w           -1869785631
        //   956: goto            962
        //   959: ldc_w           1842840314
        //   962: ldc_w           988111174
        //   965: ixor           
        //   966: lookupswitch {
        //          -1436011353: 959
        //          1462952892: 992
        //          default: 3086
        //        }
        //   992: aload           17
        //   994: goto            998
        //   997: athrow         
        //   998: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: dstore          18
        //  1007: aload           17
        //  1009: new             Lnet/minecraft/util/math/Vec3d;
        //  1012: dup            
        //  1013: aload           10
        //  1015: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1018: ldc2_w          0.5
        //  1021: dmul           
        //  1022: getstatic       dev/nuker/pyro/fc.c:I
        //  1025: ifge            1034
        //  1028: ldc_w           -1538161381
        //  1031: goto            1037
        //  1034: ldc_w           1680203474
        //  1037: ldc_w           1874833622
        //  1040: ixor           
        //  1041: lookupswitch {
        //          -873581107: 1034
        //          194670084: 1068
        //          default: 3080
        //        }
        //  1068: aload           10
        //  1070: getstatic       dev/nuker/pyro/fc.c:I
        //  1073: ifge            1082
        //  1076: ldc_w           524876094
        //  1079: goto            1085
        //  1082: ldc_w           644866226
        //  1085: ldc_w           -511830340
        //  1088: ixor           
        //  1089: lookupswitch {
        //          -955124210: 1116
        //          -29954174: 1082
        //          default: 3082
        //        }
        //  1116: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1119: ldc2_w          0.5
        //  1122: dmul           
        //  1123: aload           10
        //  1125: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1128: ldc2_w          0.5
        //  1131: dmul           
        //  1132: goto            1136
        //  1135: athrow         
        //  1136: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1139: goto            1143
        //  1142: athrow         
        //  1143: goto            1147
        //  1146: athrow         
        //  1147: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1150: goto            1154
        //  1153: athrow         
        //  1154: astore          20
        //  1156: getstatic       dev/nuker/pyro/fc.c:I
        //  1159: ifge            1168
        //  1162: ldc_w           122100264
        //  1165: goto            1171
        //  1168: ldc_w           -434683863
        //  1171: ldc_w           1951264738
        //  1174: ixor           
        //  1175: lookupswitch {
        //          -1839550517: 1200
        //          1930098122: 1168
        //          default: 3140
        //        }
        //  1200: aload           4
        //  1202: aload           20
        //  1204: getstatic       dev/nuker/pyro/fc.c:I
        //  1207: ifge            1216
        //  1210: ldc_w           -136572722
        //  1213: goto            1219
        //  1216: ldc_w           -1015567019
        //  1219: ldc_w           272845137
        //  1222: ixor           
        //  1223: lookupswitch {
        //          -751508476: 1248
        //          -408987233: 1216
        //          default: 3084
        //        }
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: ldc2_w          18.0
        //  1262: dcmpl          
        //  1263: ifgt            2942
        //  1266: getstatic       dev/nuker/pyro/fc.c:I
        //  1269: ifge            1278
        //  1272: ldc_w           1395341065
        //  1275: goto            1281
        //  1278: ldc_w           -1274478702
        //  1281: ldc_w           -2007938821
        //  1284: ixor           
        //  1285: lookupswitch {
        //          -769102161: 1278
        //          -612728846: 3108
        //          default: 1312
        //        }
        //  1312: dload           18
        //  1314: getstatic       dev/nuker/pyro/fc.c:I
        //  1317: ifge            1326
        //  1320: ldc_w           2020379628
        //  1323: goto            1329
        //  1326: ldc_w           2012383835
        //  1329: ldc_w           12008438
        //  1332: ixor           
        //  1333: lookupswitch {
        //          1766875413: 1326
        //          2027663386: 3078
        //          default: 1360
        //        }
        //  1360: aload           4
        //  1362: aload           17
        //  1364: aload           10
        //  1366: getstatic       dev/nuker/pyro/fc.1:I
        //  1369: ifeq            1378
        //  1372: ldc_w           2065924149
        //  1375: goto            1381
        //  1378: ldc_w           -1147743196
        //  1381: ldc_w           -1342827283
        //  1384: ixor           
        //  1385: lookupswitch {
        //          -724200232: 1378
        //          341885129: 1412
        //          default: 3098
        //        }
        //  1412: goto            1416
        //  1415: athrow         
        //  1416: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1419: goto            1423
        //  1422: athrow         
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1430: goto            1434
        //  1433: athrow         
        //  1434: dcmpl          
        //  1435: ifgt            1444
        //  1438: ldc_w           -402883759
        //  1441: goto            1447
        //  1444: ldc_w           -402883762
        //  1447: ldc_w           -1575171650
        //  1450: ixor           
        //  1451: tableswitch {
        //          -1950259746: 1472
        //          -1950259745: 2942
        //          default: 1438
        //        }
        //  1472: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1475: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1478: aload           4
        //  1480: aload           20
        //  1482: iconst_0       
        //  1483: iconst_1       
        //  1484: iconst_0       
        //  1485: goto            1489
        //  1488: athrow         
        //  1489: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  1492: goto            1496
        //  1495: athrow         
        //  1496: ifnull          1502
        //  1499: goto            2942
        //  1502: getstatic       dev/nuker/pyro/fc.c:I
        //  1505: ifge            1514
        //  1508: ldc_w           1043620603
        //  1511: goto            1517
        //  1514: ldc_w           -181588357
        //  1517: ldc_w           -1692428589
        //  1520: ixor           
        //  1521: lookupswitch {
        //          -1867612985: 1514
        //          -1523846104: 3146
        //          default: 1548
        //        }
        //  1548: aload           20
        //  1550: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1553: getstatic       dev/nuker/pyro/fc.1:I
        //  1556: ifeq            1565
        //  1559: ldc_w           -1045072490
        //  1562: goto            1568
        //  1565: ldc_w           925588298
        //  1568: ldc_w           -512594225
        //  1571: ixor           
        //  1572: lookupswitch {
        //          -698796667: 1600
        //          549919577: 1565
        //          default: 3110
        //        }
        //  1600: aload           4
        //  1602: getstatic       dev/nuker/pyro/fc.0:I
        //  1605: ifeq            1614
        //  1608: ldc_w           -1647545426
        //  1611: goto            1617
        //  1614: ldc_w           830692278
        //  1617: ldc_w           -1177606535
        //  1620: ixor           
        //  1621: lookupswitch {
        //          -1289922116: 1614
        //          604198359: 3142
        //          default: 1648
        //        }
        //  1648: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1651: dsub           
        //  1652: getstatic       dev/nuker/pyro/fc.0:I
        //  1655: ifeq            1664
        //  1658: ldc_w           -602256122
        //  1661: goto            1667
        //  1664: ldc_w           -309157749
        //  1667: ldc_w           121260655
        //  1670: ixor           
        //  1671: lookupswitch {
        //          -618657943: 1664
        //          -358028572: 1696
        //          default: 3154
        //        }
        //  1696: dstore          21
        //  1698: aload           20
        //  1700: getstatic       dev/nuker/pyro/fc.c:I
        //  1703: ifge            1712
        //  1706: ldc_w           -270566856
        //  1709: goto            1715
        //  1712: ldc_w           -1970661387
        //  1715: ldc_w           -781983365
        //  1718: ixor           
        //  1719: lookupswitch {
        //          -842062951: 1712
        //          1052547907: 3096
        //          default: 1744
        //        }
        //  1744: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1747: getstatic       dev/nuker/pyro/fc.0:I
        //  1750: ifeq            1759
        //  1753: ldc_w           1267486957
        //  1756: goto            1762
        //  1759: ldc_w           -2100671250
        //  1762: ldc_w           -1497995622
        //  1765: ixor           
        //  1766: lookupswitch {
        //          -314952073: 1759
        //          612117108: 1792
        //          default: 3076
        //        }
        //  1792: aload           4
        //  1794: getstatic       dev/nuker/pyro/fc.c:I
        //  1797: ifge            1806
        //  1800: ldc_w           16013496
        //  1803: goto            1809
        //  1806: ldc_w           1669028469
        //  1809: ldc_w           275372607
        //  1812: ixor           
        //  1813: lookupswitch {
        //          -645274396: 1806
        //          278758023: 3102
        //          default: 1840
        //        }
        //  1840: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1843: dsub           
        //  1844: getstatic       dev/nuker/pyro/fc.c:I
        //  1847: ifge            1856
        //  1850: ldc_w           -1218318090
        //  1853: goto            1859
        //  1856: ldc_w           2143301308
        //  1859: ldc_w           -1606113864
        //  1862: ixor           
        //  1863: lookupswitch {
        //          248073148: 1856
        //          388322638: 3088
        //          default: 1888
        //        }
        //  1888: dstore          23
        //  1890: aload           20
        //  1892: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1895: aload           4
        //  1897: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1900: dsub           
        //  1901: dstore          25
        //  1903: dload           21
        //  1905: getstatic       dev/nuker/pyro/fc.c:I
        //  1908: ifge            1917
        //  1911: ldc_w           1157035980
        //  1914: goto            1920
        //  1917: ldc_w           1756897256
        //  1920: ldc_w           1393687870
        //  1923: ixor           
        //  1924: lookupswitch {
        //          401017586: 1917
        //          1000989398: 1952
        //          default: 3148
        //        }
        //  1952: dload           21
        //  1954: dmul           
        //  1955: dload           25
        //  1957: dload           25
        //  1959: dmul           
        //  1960: dadd           
        //  1961: goto            1965
        //  1964: athrow         
        //  1965: invokestatic    net/minecraft/util/math/MathHelper.func_76133_a:(D)F
        //  1968: goto            1972
        //  1971: athrow         
        //  1972: f2d            
        //  1973: getstatic       dev/nuker/pyro/fc.0:I
        //  1976: ifeq            1985
        //  1979: ldc_w           -607654515
        //  1982: goto            1988
        //  1985: ldc_w           1244666854
        //  1988: ldc_w           616627177
        //  1991: ixor           
        //  1992: lookupswitch {
        //          -16312732: 3126
        //          1615776681: 1985
        //          default: 2020
        //        }
        //  2020: dstore          27
        //  2022: new             Ldev/nuker/pyro/fbN;
        //  2025: dup            
        //  2026: dload           25
        //  2028: getstatic       dev/nuker/pyro/fc.1:I
        //  2031: ifeq            2040
        //  2034: ldc_w           1258799089
        //  2037: goto            2043
        //  2040: ldc_w           1884220077
        //  2043: ldc_w           -603982809
        //  2046: ixor           
        //  2047: lookupswitch {
        //          -1862775850: 3112
        //          826791560: 2040
        //          default: 2072
        //        }
        //  2072: dload           21
        //  2074: getstatic       dev/nuker/pyro/fc.1:I
        //  2077: ifeq            2086
        //  2080: ldc_w           973458298
        //  2083: goto            2089
        //  2086: ldc_w           -74711693
        //  2089: ldc_w           -1058494503
        //  2092: ixor           
        //  2093: lookupswitch {
        //          -85103453: 2086
        //          996367018: 2120
        //          default: 3156
        //        }
        //  2120: goto            2124
        //  2123: athrow         
        //  2124: invokestatic    java/lang/Math.atan2:(DD)D
        //  2127: goto            2131
        //  2130: athrow         
        //  2131: goto            2135
        //  2134: athrow         
        //  2135: invokestatic    java/lang/Math.toDegrees:(D)D
        //  2138: goto            2142
        //  2141: athrow         
        //  2142: d2f            
        //  2143: ldc_w           90.0
        //  2146: fsub           
        //  2147: goto            2151
        //  2150: athrow         
        //  2151: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  2154: goto            2158
        //  2157: athrow         
        //  2158: dload           23
        //  2160: dload           27
        //  2162: goto            2166
        //  2165: athrow         
        //  2166: invokestatic    java/lang/Math.atan2:(DD)D
        //  2169: goto            2173
        //  2172: athrow         
        //  2173: goto            2177
        //  2176: athrow         
        //  2177: invokestatic    java/lang/Math.toDegrees:(D)D
        //  2180: goto            2184
        //  2183: athrow         
        //  2184: dneg           
        //  2185: d2f            
        //  2186: getstatic       dev/nuker/pyro/fc.0:I
        //  2189: ifeq            2198
        //  2192: ldc_w           1088068460
        //  2195: goto            2201
        //  2198: ldc_w           -1555903901
        //  2201: ldc_w           -596927295
        //  2204: ixor           
        //  2205: lookupswitch {
        //          -1666119763: 2198
        //          2133415586: 2232
        //          default: 3092
        //        }
        //  2232: goto            2236
        //  2235: athrow         
        //  2236: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  2239: goto            2243
        //  2242: athrow         
        //  2243: goto            2247
        //  2246: athrow         
        //  2247: invokespecial   dev/nuker/pyro/fbN.<init>:(FF)V
        //  2250: goto            2254
        //  2253: athrow         
        //  2254: astore          29
        //  2256: goto            2260
        //  2259: athrow         
        //  2260: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2263: goto            2267
        //  2266: athrow         
        //  2267: getstatic       dev/nuker/pyro/fc.0:I
        //  2270: ifeq            2279
        //  2273: ldc_w           -1856393557
        //  2276: goto            2282
        //  2279: ldc_w           -1009277020
        //  2282: ldc_w           210284020
        //  2285: ixor           
        //  2286: lookupswitch {
        //          -1647246497: 2279
        //          -815855024: 2312
        //          default: 3150
        //        }
        //  2312: aload           29
        //  2314: goto            2318
        //  2317: athrow         
        //  2318: invokevirtual   dev/nuker/pyro/fbP.c:(Ldev/nuker/pyro/fbN;)Lnet/minecraft/util/math/Vec3d;
        //  2321: goto            2325
        //  2324: athrow         
        //  2325: astore          30
        //  2327: aload           4
        //  2329: aload           30
        //  2331: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  2334: ldc2_w          4.0
        //  2337: dmul           
        //  2338: aload           30
        //  2340: getstatic       dev/nuker/pyro/fc.0:I
        //  2343: ifeq            2352
        //  2346: ldc_w           996588895
        //  2349: goto            2355
        //  2352: ldc_w           1412481582
        //  2355: ldc_w           -1716567141
        //  2358: ixor           
        //  2359: lookupswitch {
        //          -1563820348: 2352
        //          -845184587: 2384
        //          default: 3136
        //        }
        //  2384: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  2387: ldc2_w          4.0
        //  2390: dmul           
        //  2391: aload           30
        //  2393: getstatic       dev/nuker/pyro/fc.c:I
        //  2396: ifge            2405
        //  2399: ldc_w           -859158671
        //  2402: goto            2408
        //  2405: ldc_w           -1080495206
        //  2408: ldc_w           -1105859255
        //  2411: ixor           
        //  2412: lookupswitch {
        //          1927260728: 3160
        //          1981795381: 2405
        //          default: 2440
        //        }
        //  2440: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  2443: ldc2_w          4.0
        //  2446: dmul           
        //  2447: goto            2451
        //  2450: athrow         
        //  2451: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  2454: goto            2458
        //  2457: athrow         
        //  2458: getstatic       dev/nuker/pyro/fc.c:I
        //  2461: ifge            2470
        //  2464: ldc_w           1422939810
        //  2467: goto            2473
        //  2470: ldc_w           1092503779
        //  2473: ldc_w           -588559574
        //  2476: ixor           
        //  2477: lookupswitch {
        //          -2009391736: 3074
        //          -1902728499: 2470
        //          default: 2504
        //        }
        //  2504: astore          31
        //  2506: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2509: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2512: aload           4
        //  2514: aload           31
        //  2516: iconst_0       
        //  2517: iconst_0       
        //  2518: iconst_1       
        //  2519: goto            2523
        //  2522: athrow         
        //  2523: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  2526: goto            2530
        //  2529: athrow         
        //  2530: astore          32
        //  2532: aload           32
        //  2534: getfield        net/minecraft/util/math/RayTraceResult.field_72313_a:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2537: getstatic       net/minecraft/util/math/RayTraceResult$Type.BLOCK:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2540: if_acmpne       2942
        //  2543: aload           32
        //  2545: goto            2549
        //  2548: athrow         
        //  2549: invokevirtual   net/minecraft/util/math/RayTraceResult.func_178782_a:()Lnet/minecraft/util/math/BlockPos;
        //  2552: goto            2556
        //  2555: athrow         
        //  2556: aload           9
        //  2558: goto            2562
        //  2561: athrow         
        //  2562: invokevirtual   net/minecraft/util/math/BlockPos.equals:(Ljava/lang/Object;)Z
        //  2565: goto            2569
        //  2568: athrow         
        //  2569: ifne            2575
        //  2572: goto            2942
        //  2575: aload_3        
        //  2576: ifnull          2831
        //  2579: goto            2583
        //  2582: athrow         
        //  2583: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2586: goto            2590
        //  2589: athrow         
        //  2590: getstatic       dev/nuker/pyro/fc.1:I
        //  2593: ifeq            2602
        //  2596: ldc_w           -166392883
        //  2599: goto            2605
        //  2602: ldc_w           -1148347023
        //  2605: ldc_w           492198606
        //  2608: ixor           
        //  2609: lookupswitch {
        //          -1495545921: 2636
        //          -347909885: 2602
        //          default: 3164
        //        }
        //  2636: aload           29
        //  2638: goto            2642
        //  2641: athrow         
        //  2642: invokevirtual   dev/nuker/pyro/fbP.0:(Ldev/nuker/pyro/fbN;)D
        //  2645: goto            2649
        //  2648: athrow         
        //  2649: goto            2653
        //  2652: athrow         
        //  2653: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2656: goto            2660
        //  2659: athrow         
        //  2660: getstatic       dev/nuker/pyro/fc.c:I
        //  2663: ifge            2672
        //  2666: ldc_w           1245016988
        //  2669: goto            2675
        //  2672: ldc_w           1309861759
        //  2675: ldc_w           70889946
        //  2678: ixor           
        //  2679: lookupswitch {
        //          1244354213: 2704
        //          1309459014: 2672
        //          default: 3138
        //        }
        //  2704: aload_3        
        //  2705: goto            2709
        //  2708: athrow         
        //  2709: invokevirtual   dev/nuker/pyro/fbB.2:()Ldev/nuker/pyro/fbQ;
        //  2712: goto            2716
        //  2715: athrow         
        //  2716: getstatic       dev/nuker/pyro/fc.0:I
        //  2719: ifeq            2728
        //  2722: ldc_w           2114140899
        //  2725: goto            2731
        //  2728: ldc_w           1398309872
        //  2731: ldc_w           1016355632
        //  2734: ixor           
        //  2735: lookupswitch {
        //          -1772635892: 2728
        //          1117217235: 3118
        //          default: 2760
        //        }
        //  2760: goto            2764
        //  2763: athrow         
        //  2764: invokevirtual   dev/nuker/pyro/fbQ.1:()Ldev/nuker/pyro/fbN;
        //  2767: goto            2771
        //  2770: athrow         
        //  2771: getstatic       dev/nuker/pyro/fc.0:I
        //  2774: ifeq            2783
        //  2777: ldc_w           -620901072
        //  2780: goto            2786
        //  2783: ldc_w           -91003031
        //  2786: ldc_w           1726410777
        //  2789: ixor           
        //  2790: lookupswitch {
        //          -1139065559: 3090
        //          223980752: 2783
        //          default: 2816
        //        }
        //  2816: goto            2820
        //  2819: athrow         
        //  2820: invokevirtual   dev/nuker/pyro/fbP.0:(Ldev/nuker/pyro/fbN;)D
        //  2823: goto            2827
        //  2826: athrow         
        //  2827: dcmpg          
        //  2828: ifge            2942
        //  2831: new             Ldev/nuker/pyro/fbB;
        //  2834: dup            
        //  2835: aload           9
        //  2837: aload           8
        //  2839: goto            2843
        //  2842: athrow         
        //  2843: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2846: goto            2850
        //  2849: athrow         
        //  2850: aload           20
        //  2852: new             Ldev/nuker/pyro/fbQ;
        //  2855: dup            
        //  2856: aload           17
        //  2858: aload           29
        //  2860: aload           8
        //  2862: getstatic       dev/nuker/pyro/fc.c:I
        //  2865: ifge            2874
        //  2868: ldc_w           -607592490
        //  2871: goto            2877
        //  2874: ldc_w           348893664
        //  2877: ldc_w           -42998347
        //  2880: ixor           
        //  2881: lookupswitch {
        //          45483397: 2874
        //          648493667: 3094
        //          default: 2908
        //        }
        //  2908: goto            2912
        //  2911: athrow         
        //  2912: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2915: goto            2919
        //  2918: athrow         
        //  2919: goto            2923
        //  2922: athrow         
        //  2923: invokespecial   dev/nuker/pyro/fbQ.<init>:(Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/fbN;Lnet/minecraft/util/EnumFacing;)V
        //  2926: goto            2930
        //  2929: athrow         
        //  2930: goto            2934
        //  2933: athrow         
        //  2934: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/fbQ;)V
        //  2937: goto            2941
        //  2940: athrow         
        //  2941: astore_3       
        //  2942: dload           15
        //  2944: ldc2_w          0.1
        //  2947: dadd           
        //  2948: dstore          15
        //  2950: goto            856
        //  2953: getstatic       dev/nuker/pyro/fc.1:I
        //  2956: ifeq            2965
        //  2959: ldc_w           623234170
        //  2962: goto            2968
        //  2965: ldc_w           -706853768
        //  2968: ldc_w           1265201311
        //  2971: ixor           
        //  2972: lookupswitch {
        //          1849899445: 2965
        //          1850522853: 3162
        //          default: 3000
        //        }
        //  3000: dload           13
        //  3002: ldc2_w          0.1
        //  3005: dadd           
        //  3006: dstore          13
        //  3008: goto            842
        //  3011: dload           11
        //  3013: ldc2_w          0.1
        //  3016: dadd           
        //  3017: dstore          11
        //  3019: goto            782
        //  3022: iinc            7, 1
        //  3025: goto            346
        //  3028: getstatic       dev/nuker/pyro/fc.0:I
        //  3031: ifeq            3040
        //  3034: ldc_w           323431744
        //  3037: goto            3043
        //  3040: ldc_w           733379008
        //  3043: ldc_w           -1880914151
        //  3046: ixor           
        //  3047: lookupswitch {
        //          -1666930087: 3152
        //          169968865: 3040
        //          default: 3072
        //        }
        //  3072: aload_3        
        //  3073: areturn        
        //  3074: aconst_null    
        //  3075: athrow         
        //  3076: aconst_null    
        //  3077: athrow         
        //  3078: aconst_null    
        //  3079: athrow         
        //  3080: aconst_null    
        //  3081: athrow         
        //  3082: aconst_null    
        //  3083: athrow         
        //  3084: aconst_null    
        //  3085: athrow         
        //  3086: aconst_null    
        //  3087: athrow         
        //  3088: aconst_null    
        //  3089: athrow         
        //  3090: aconst_null    
        //  3091: athrow         
        //  3092: aconst_null    
        //  3093: athrow         
        //  3094: aconst_null    
        //  3095: athrow         
        //  3096: aconst_null    
        //  3097: athrow         
        //  3098: aconst_null    
        //  3099: athrow         
        //  3100: aconst_null    
        //  3101: athrow         
        //  3102: aconst_null    
        //  3103: athrow         
        //  3104: aconst_null    
        //  3105: athrow         
        //  3106: aconst_null    
        //  3107: athrow         
        //  3108: aconst_null    
        //  3109: athrow         
        //  3110: aconst_null    
        //  3111: athrow         
        //  3112: aconst_null    
        //  3113: athrow         
        //  3114: aconst_null    
        //  3115: athrow         
        //  3116: aconst_null    
        //  3117: athrow         
        //  3118: aconst_null    
        //  3119: athrow         
        //  3120: aconst_null    
        //  3121: athrow         
        //  3122: aconst_null    
        //  3123: athrow         
        //  3124: aconst_null    
        //  3125: athrow         
        //  3126: aconst_null    
        //  3127: athrow         
        //  3128: aconst_null    
        //  3129: athrow         
        //  3130: aconst_null    
        //  3131: athrow         
        //  3132: aconst_null    
        //  3133: athrow         
        //  3134: aconst_null    
        //  3135: athrow         
        //  3136: aconst_null    
        //  3137: athrow         
        //  3138: aconst_null    
        //  3139: athrow         
        //  3140: aconst_null    
        //  3141: athrow         
        //  3142: aconst_null    
        //  3143: athrow         
        //  3144: aconst_null    
        //  3145: athrow         
        //  3146: aconst_null    
        //  3147: athrow         
        //  3148: aconst_null    
        //  3149: athrow         
        //  3150: aconst_null    
        //  3151: athrow         
        //  3152: aconst_null    
        //  3153: athrow         
        //  3154: aconst_null    
        //  3155: athrow         
        //  3156: aconst_null    
        //  3157: athrow         
        //  3158: aconst_null    
        //  3159: athrow         
        //  3160: aconst_null    
        //  3161: athrow         
        //  3162: aconst_null    
        //  3163: athrow         
        //  3164: aconst_null    
        //  3165: athrow         
        //  3166: pop            
        //  3167: goto            24
        //  3170: pop            
        //  3171: aconst_null    
        //  3172: goto            3166
        //  3175: dup            
        //  3176: ifnull          3166
        //  3179: checkcast       Ljava/lang/Throwable;
        //  3182: athrow         
        //  3183: dup            
        //  3184: ifnull          3170
        //  3187: checkcast       Ljava/lang/Throwable;
        //  3190: athrow         
        //  3191: aconst_null    
        //  3192: athrow         
        //    StackMapTable: 01 7A FF 00 03 00 03 07 00 80 03 07 01 F8 00 01 07 00 27 FA 00 04 FF 00 0B 00 00 00 01 07 00 27 FD 00 03 07 00 80 03 4B 05 FF 00 01 00 02 07 00 80 03 00 02 05 01 5D 05 FF 00 16 00 03 07 00 80 03 05 00 01 07 00 27 FF 00 00 00 03 07 00 80 03 05 00 04 08 00 45 08 00 45 03 07 00 86 45 07 00 27 FF 00 00 00 03 07 00 80 03 05 00 04 08 00 45 08 00 45 03 07 00 41 FF 00 14 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 FF 00 02 00 03 07 00 80 03 05 00 06 08 00 45 08 00 45 03 03 07 00 86 01 FF 00 1C 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 42 07 00 27 FF 00 00 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 45 07 00 27 FF 00 00 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 02 FF 00 0D 00 03 07 00 80 03 05 00 04 08 00 45 08 00 45 03 03 FF 00 02 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 01 FF 00 1F 00 03 07 00 80 03 05 00 04 08 00 45 08 00 45 03 03 FF 00 11 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 FF 00 02 00 03 07 00 80 03 05 00 06 08 00 45 08 00 45 03 03 07 00 86 01 FF 00 1E 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 FF 00 0E 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 03 FF 00 02 00 03 07 00 80 03 05 00 06 08 00 45 08 00 45 03 03 03 01 FF 00 1D 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 03 42 07 00 27 FF 00 00 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 03 45 07 00 27 40 07 00 FB FF 00 04 00 04 07 00 80 03 05 07 00 FB 00 01 07 00 27 00 45 07 00 27 40 07 02 1B FF 00 09 00 07 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 00 00 4D 01 FF 00 02 00 07 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 00 02 01 01 5C 01 04 05 42 01 19 0B 42 01 1C 4D 07 02 1B FF 00 02 00 07 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 00 02 07 02 1B 01 5E 07 02 1B FC 00 10 07 00 82 42 01 1F FF 00 05 00 00 00 01 07 00 27 FF 00 00 00 08 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 45 07 00 27 40 07 00 80 4B 07 00 80 FF 00 02 00 08 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 01 5E 07 00 80 FC 00 0D 07 00 80 42 01 1E FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 09 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 80 45 07 00 27 40 01 05 48 07 00 27 FF 00 00 00 09 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 BF 08 02 BF 07 00 82 45 07 00 27 FF 00 00 00 09 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 BF 08 02 BF 07 02 1D FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 09 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 BF 08 02 BF 07 02 1D 45 07 00 27 40 07 00 FB FF 00 10 00 0A 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 00 01 03 FF 00 02 00 0A 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 00 02 03 01 5C 03 FC 00 01 03 57 03 FF 00 02 00 0B 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 00 02 03 01 5E 03 FC 00 01 03 FC 00 0D 03 50 07 00 27 FF 00 00 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 03 08 03 61 08 03 61 07 00 80 45 07 00 27 40 07 00 FB FF 00 0D 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 02 07 00 FB 03 FF 00 02 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 03 07 00 FB 03 01 FF 00 1D 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 02 07 00 FB 03 46 07 00 1A FF 00 00 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 04 07 00 FB 03 03 03 45 07 00 27 40 07 00 FB FF 00 0F 00 0E 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 00 01 07 00 FB FF 00 02 00 0E 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 00 02 07 00 FB 01 5D 07 00 FB 44 07 00 16 FF 00 00 00 0E 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 00 02 07 00 FB 07 00 FB 45 07 00 27 40 03 FF 00 1C 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 04 07 00 FB 08 03 F1 08 03 F1 03 FF 00 02 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 05 07 00 FB 08 03 F1 08 03 F1 03 01 FF 00 1E 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 04 07 00 FB 08 03 F1 08 03 F1 03 FF 00 0D 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 05 07 00 FB 08 03 F1 08 03 F1 03 07 00 FB FF 00 02 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 06 07 00 FB 08 03 F1 08 03 F1 03 07 00 FB 01 FF 00 1E 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 05 07 00 FB 08 03 F1 08 03 F1 03 07 00 FB 52 07 00 27 FF 00 00 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 06 07 00 FB 08 03 F1 08 03 F1 03 03 03 45 07 00 27 FF 00 00 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 02 07 00 FB 07 00 FB 42 07 00 16 FF 00 00 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 02 07 00 FB 07 00 FB 45 07 00 27 40 07 00 FB FC 00 0D 07 00 FB 42 01 1C FF 00 0F 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 07 00 FB 07 00 FB FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 03 07 00 FB 07 00 FB 01 FF 00 1C 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 07 00 FB 07 00 FB 42 07 00 88 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 07 00 FB 07 00 FB 45 07 00 27 40 03 12 42 01 1E 4D 03 FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 01 5E 03 FF 00 11 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 07 00 FB FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 05 03 07 00 FB 07 00 FB 07 00 FB 01 FF 00 1E 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 07 00 FB 42 07 00 27 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 07 00 FB 45 07 00 27 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB 42 07 00 27 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB 45 07 00 27 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 03 03 05 42 01 18 4F 07 00 91 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 06 07 00 4A 07 00 FB 07 00 FB 01 01 01 45 07 00 27 40 07 01 DC 05 0B 42 01 1E 50 03 FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 01 5F 03 FF 00 0D 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 07 00 FB FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 01 FF 00 1E 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 07 00 FB 4F 03 FF 00 02 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 01 5C 03 FF 00 0F 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 01 07 00 FB FF 00 02 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 07 00 FB 01 5C 07 00 FB 4E 03 FF 00 02 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 03 01 5D 03 FF 00 0D 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 03 07 00 FB FF 00 02 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 03 03 07 00 FB 01 FF 00 1E 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 03 07 00 FB 4F 03 FF 00 02 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 03 01 5C 03 FF 00 1C 00 13 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 00 01 03 FF 00 02 00 13 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 00 02 03 01 5F 03 4B 07 00 27 40 03 45 07 00 27 40 02 4C 03 FF 00 02 00 13 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 00 02 03 01 5F 03 FF 00 13 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 FF 00 02 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 03 01 FF 00 1C 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 FF 00 0D 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 03 03 FF 00 02 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 07 E6 08 07 E6 03 03 01 FF 00 1E 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 03 03 42 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 03 03 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 42 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 47 07 00 12 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 02 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 02 FF 00 06 00 00 00 01 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 07 E6 08 07 E6 02 03 03 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 03 42 07 00 1C FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 03 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 03 FF 00 0D 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 FF 00 02 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 07 E6 08 07 E6 02 02 01 FF 00 1E 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 42 07 00 8F FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 45 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 45 07 00 27 40 07 01 B0 FF 00 04 00 15 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 01 07 00 27 00 45 07 00 27 40 07 01 C6 4B 07 01 C6 FF 00 02 00 15 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 02 07 01 C6 01 5D 07 01 C6 44 07 00 27 FF 00 00 00 15 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 02 07 01 C6 07 01 B0 45 07 00 27 40 07 00 FB FF 00 1A 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 03 07 00 FB 03 07 00 FB FF 00 02 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 07 00 FB 01 FF 00 1C 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 03 07 00 FB 03 07 00 FB FF 00 14 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FF 00 02 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 05 07 00 FB 03 03 07 00 FB 01 FF 00 1F 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FF 00 09 00 00 00 01 07 00 27 FF 00 00 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 03 45 07 00 27 40 07 00 FB 4B 07 00 FB FF 00 02 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 02 07 00 FB 01 5E 07 00 FB FF 00 11 00 00 00 01 07 00 27 FF 00 00 00 17 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 06 07 00 4A 07 00 FB 07 00 FB 01 01 01 45 07 00 27 40 07 01 DC FF 00 11 00 00 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 01 07 01 DC 45 07 00 27 40 07 00 80 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 07 00 80 07 00 80 45 07 00 27 40 01 05 46 07 00 27 00 45 07 00 27 40 07 01 C6 4B 07 01 C6 FF 00 02 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 07 01 C6 01 5E 07 01 C6 44 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 07 01 C6 07 01 B0 45 07 00 27 40 03 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 01 03 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 03 07 01 C6 FF 00 0B 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 03 07 01 C6 FF 00 02 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 01 FF 00 1C 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 03 07 01 C6 43 07 00 8D FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 F8 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 02 00 FF 00 0B 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 02 00 FF 00 02 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 03 07 01 C6 07 02 00 01 FF 00 1C 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 02 00 42 07 00 88 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 02 00 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 B0 FF 00 0B 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 B0 FF 00 02 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 03 07 01 C6 07 01 B0 01 FF 00 1D 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 B0 42 07 00 20 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 B0 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 03 03 03 4A 07 00 10 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 08 0B 0F 08 0B 0F 07 00 80 07 00 82 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 08 0B 0F 08 0B 0F 07 00 80 07 00 82 FF 00 17 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 FF 00 02 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0B 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 01 FF 00 1E 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 42 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 06 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 07 02 00 42 07 00 16 FF 00 00 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 06 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 07 02 00 45 07 00 27 40 07 01 F8 FF 00 00 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 00 F8 00 0A 0B 42 01 1F FA 00 0A F8 00 0A F9 00 05 0B 42 01 1C FF 00 01 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 01 07 00 FB FF 00 01 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 01 03 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 01 03 FF 00 01 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 04 07 00 FB 08 03 F1 08 03 F1 03 FF 00 01 00 0F 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 00 05 07 00 FB 08 03 F1 08 03 F1 03 07 00 FB FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 07 00 FB 07 00 FB FF 00 01 00 0E 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 00 01 07 00 FB FF 00 01 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 01 03 FF 00 01 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 01 B0 FF 00 01 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 02 02 FF 00 01 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0B 0F 08 0B 0F 07 00 80 07 00 82 07 00 FB 08 0B 24 08 0B 24 07 00 FB 07 01 B0 07 00 82 FF 00 01 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 01 07 00 FB FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 07 00 FB FF 00 01 00 02 07 00 80 03 00 01 05 FF 00 01 00 11 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 00 02 03 07 00 FB FF 00 01 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 02 07 00 FB 03 FF 00 01 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 03 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 00 41 03 FF 00 01 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 07 E6 08 07 E6 03 FF 00 01 00 0A 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 00 01 03 FF 00 01 00 0B 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 00 01 03 FF 00 01 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 03 03 07 01 C6 07 02 00 FF 00 01 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 FF 00 01 00 09 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 00 FF 00 01 00 08 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 00 01 07 00 80 FF 00 01 00 13 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 00 01 03 FF 00 01 00 03 07 00 80 03 05 00 05 08 00 45 08 00 45 03 03 07 00 86 FF 00 01 00 07 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 00 00 41 01 41 07 02 1B FF 00 01 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 03 07 00 FB 03 07 00 FB FF 00 01 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 03 07 01 C6 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 00 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 02 03 07 00 FB FF 00 01 00 08 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 00 00 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 00 FF 00 01 00 13 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 00 01 03 FF 00 01 00 15 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 01 07 01 C6 FF 00 01 00 07 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 00 00 FF 00 01 00 10 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 00 01 03 FF 00 01 00 14 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 07 E6 08 07 E6 03 03 FF 00 01 00 03 07 00 80 03 05 00 04 08 00 45 08 00 45 03 03 FF 00 01 00 16 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FF 00 01 00 0D 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 00 00 FF 00 01 00 18 07 00 80 03 07 01 F8 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 03 03 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 01 07 01 C6 FF 00 01 00 02 07 00 80 03 00 01 07 00 27 43 05 44 07 00 27 47 05 FF 00 07 00 03 07 00 80 03 07 01 F8 00 01 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3175   3183   Ljava/lang/StringIndexOutOfBoundsException;
        //  3175   3183   3175   3183   Any
        //  3191   3193   3      8      Any
        //  91     98     98     99     Any
        //  91     98     91     92     Any
        //  92     98     3      8      Any
        //  91     98     91     92     Ljava/lang/StringIndexOutOfBoundsException;
        //  91     98     3      8      Any
        //  155    162    162    163    Any
        //  156    162    155    156    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  155    162    3      8      Ljava/lang/AssertionError;
        //  156    162    155    156    Any
        //  155    162    3      8      Ljava/lang/NumberFormatException;
        //  315    322    322    323    Any
        //  315    322    3      8      Any
        //  315    322    315    316    Ljava/util/NoSuchElementException;
        //  315    322    315    316    Ljava/lang/ClassCastException;
        //  315    322    315    316    Any
        //  328    335    335    336    Any
        //  329    335    3      8      Any
        //  328    335    335    336    Ljava/lang/EnumConstantNotPresentException;
        //  329    335    328    329    Any
        //  329    335    335    336    Any
        //  583    589    589    590    Any
        //  583    589    589    590    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  583    589    589    590    Any
        //  583    589    3      8      Any
        //  583    589    589    590    Any
        //  690    696    696    697    Any
        //  690    696    3      8      Any
        //  690    696    3      8      Any
        //  690    696    3      8      Any
        //  690    696    3      8      Any
        //  712    719    719    720    Any
        //  713    719    719    720    Ljava/util/NoSuchElementException;
        //  712    719    3      8      Ljava/lang/ArithmeticException;
        //  712    719    712    713    Ljava/util/ConcurrentModificationException;
        //  712    719    712    713    Any
        //  724    730    730    731    Any
        //  724    730    730    731    Ljava/util/ConcurrentModificationException;
        //  724    730    730    731    Ljava/lang/NegativeArraySizeException;
        //  724    730    730    731    Any
        //  724    730    730    731    Any
        //  873    880    880    881    Any
        //  873    880    880    881    Ljava/lang/StringIndexOutOfBoundsException;
        //  874    880    873    874    Ljava/lang/NumberFormatException;
        //  874    880    873    874    Any
        //  873    880    880    881    Any
        //  935    942    942    943    Any
        //  936    942    3      8      Ljava/lang/AssertionError;
        //  936    942    942    943    Ljava/lang/StringIndexOutOfBoundsException;
        //  935    942    942    943    Ljava/lang/NegativeArraySizeException;
        //  935    942    935    936    Ljava/lang/AssertionError;
        //  997    1004   1004   1005   Any
        //  998    1004   1004   1005   Any
        //  997    1004   997    998    Ljava/lang/NullPointerException;
        //  997    1004   1004   1005   Any
        //  997    1004   1004   1005   Any
        //  1135   1142   1142   1143   Any
        //  1136   1142   1142   1143   Ljava/lang/ClassCastException;
        //  1136   1142   3      8      Any
        //  1135   1142   1142   1143   Ljava/lang/RuntimeException;
        //  1135   1142   1135   1136   Any
        //  1146   1153   1153   1154   Any
        //  1146   1153   3      8      Ljava/util/NoSuchElementException;
        //  1147   1153   3      8      Any
        //  1146   1153   1153   1154   Ljava/lang/IndexOutOfBoundsException;
        //  1147   1153   1146   1147   Ljava/lang/NullPointerException;
        //  1251   1258   1258   1259   Any
        //  1252   1258   1251   1252   Ljava/lang/NegativeArraySizeException;
        //  1252   1258   1251   1252   Ljava/lang/NegativeArraySizeException;
        //  1252   1258   3      8      Ljava/lang/ArithmeticException;
        //  1251   1258   1251   1252   Ljava/lang/IndexOutOfBoundsException;
        //  1415   1422   1422   1423   Any
        //  1416   1422   1422   1423   Any
        //  1416   1422   1415   1416   Any
        //  1416   1422   1415   1416   Ljava/lang/UnsupportedOperationException;
        //  1416   1422   1415   1416   Any
        //  1426   1433   1433   1434   Any
        //  1427   1433   1426   1427   Any
        //  1426   1433   1426   1427   Ljava/lang/ArithmeticException;
        //  1426   1433   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1427   1433   1433   1434   Ljava/lang/ArithmeticException;
        //  1488   1495   1495   1496   Any
        //  1489   1495   3      8      Ljava/lang/NullPointerException;
        //  1489   1495   1495   1496   Any
        //  1489   1495   1495   1496   Ljava/lang/RuntimeException;
        //  1488   1495   1488   1489   Ljava/lang/ArithmeticException;
        //  1964   1971   1971   1972   Any
        //  1965   1971   3      8      Ljava/lang/ClassCastException;
        //  1965   1971   1964   1965   Any
        //  1964   1971   3      8      Any
        //  1965   1971   1971   1972   Any
        //  2123   2130   2130   2131   Any
        //  2123   2130   2123   2124   Any
        //  2124   2130   2130   2131   Ljava/lang/AssertionError;
        //  2123   2130   2123   2124   Ljava/lang/NumberFormatException;
        //  2123   2130   2123   2124   Any
        //  2134   2141   2141   2142   Any
        //  2135   2141   3      8      Ljava/lang/NegativeArraySizeException;
        //  2134   2141   2134   2135   Any
        //  2134   2141   2141   2142   Any
        //  2135   2141   3      8      Ljava/lang/NegativeArraySizeException;
        //  2150   2157   2157   2158   Any
        //  2151   2157   3      8      Ljava/lang/RuntimeException;
        //  2150   2157   2150   2151   Ljava/lang/NegativeArraySizeException;
        //  2151   2157   2157   2158   Any
        //  2151   2157   3      8      Any
        //  2166   2172   2172   2173   Any
        //  2166   2172   2172   2173   Any
        //  2166   2172   3      8      Any
        //  2166   2172   3      8      Ljava/lang/NullPointerException;
        //  2166   2172   3      8      Any
        //  2176   2183   2183   2184   Any
        //  2176   2183   2183   2184   Any
        //  2176   2183   2176   2177   Ljava/lang/IllegalStateException;
        //  2177   2183   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2177   2183   3      8      Ljava/lang/IllegalArgumentException;
        //  2235   2242   2242   2243   Any
        //  2236   2242   2242   2243   Ljava/lang/ClassCastException;
        //  2236   2242   2235   2236   Ljava/lang/IndexOutOfBoundsException;
        //  2235   2242   2242   2243   Any
        //  2235   2242   2242   2243   Ljava/lang/IllegalStateException;
        //  2247   2253   2253   2254   Any
        //  2247   2253   2253   2254   Ljava/lang/IndexOutOfBoundsException;
        //  2247   2253   2253   2254   Any
        //  2247   2253   3      8      Any
        //  2247   2253   2253   2254   Any
        //  2259   2266   2266   2267   Any
        //  2260   2266   2266   2267   Any
        //  2259   2266   2259   2260   Any
        //  2259   2266   2259   2260   Ljava/util/NoSuchElementException;
        //  2259   2266   2266   2267   Any
        //  2317   2324   2324   2325   Any
        //  2317   2324   3      8      Ljava/lang/ClassCastException;
        //  2317   2324   2317   2318   Any
        //  2318   2324   2324   2325   Any
        //  2317   2324   3      8      Ljava/lang/NegativeArraySizeException;
        //  2451   2457   2457   2458   Any
        //  2451   2457   3      8      Ljava/util/ConcurrentModificationException;
        //  2451   2457   3      8      Ljava/util/ConcurrentModificationException;
        //  2451   2457   2457   2458   Any
        //  2451   2457   3      8      Any
        //  2523   2529   2529   2530   Any
        //  2523   2529   2529   2530   Any
        //  2523   2529   2529   2530   Any
        //  2523   2529   2529   2530   Any
        //  2523   2529   2529   2530   Any
        //  2549   2555   2555   2556   Any
        //  2549   2555   2555   2556   Any
        //  2549   2555   2555   2556   Ljava/lang/IllegalStateException;
        //  2549   2555   2555   2556   Ljava/lang/EnumConstantNotPresentException;
        //  2549   2555   3      8      Ljava/lang/AssertionError;
        //  2562   2568   2568   2569   Any
        //  2562   2568   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2562   2568   3      8      Ljava/lang/NullPointerException;
        //  2562   2568   3      8      Ljava/lang/RuntimeException;
        //  2562   2568   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2582   2589   2589   2590   Any
        //  2583   2589   3      8      Ljava/lang/IllegalStateException;
        //  2583   2589   3      8      Ljava/util/ConcurrentModificationException;
        //  2582   2589   2582   2583   Any
        //  2582   2589   2582   2583   Any
        //  2641   2648   2648   2649   Any
        //  2642   2648   2641   2642   Ljava/lang/StringIndexOutOfBoundsException;
        //  2642   2648   2641   2642   Any
        //  2641   2648   3      8      Ljava/lang/NullPointerException;
        //  2641   2648   3      8      Any
        //  2653   2659   2659   2660   Any
        //  2653   2659   2659   2660   Any
        //  2653   2659   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2653   2659   2659   2660   Any
        //  2653   2659   3      8      Any
        //  2708   2715   2715   2716   Any
        //  2708   2715   2715   2716   Any
        //  2708   2715   2708   2709   Ljava/util/NoSuchElementException;
        //  2709   2715   2715   2716   Any
        //  2709   2715   2715   2716   Ljava/lang/UnsupportedOperationException;
        //  2763   2770   2770   2771   Any
        //  2763   2770   2770   2771   Any
        //  2764   2770   2763   2764   Ljava/lang/UnsupportedOperationException;
        //  2763   2770   2763   2764   Ljava/lang/IllegalStateException;
        //  2764   2770   3      8      Ljava/lang/NumberFormatException;
        //  2819   2826   2826   2827   Any
        //  2820   2826   2826   2827   Ljava/lang/IllegalStateException;
        //  2820   2826   2826   2827   Any
        //  2820   2826   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2819   2826   2819   2820   Ljava/util/ConcurrentModificationException;
        //  2842   2849   2849   2850   Any
        //  2842   2849   3      8      Ljava/lang/AssertionError;
        //  2843   2849   2849   2850   Any
        //  2843   2849   2842   2843   Ljava/lang/NumberFormatException;
        //  2843   2849   2849   2850   Ljava/util/ConcurrentModificationException;
        //  2911   2918   2918   2919   Any
        //  2911   2918   3      8      Ljava/lang/NumberFormatException;
        //  2911   2918   2918   2919   Ljava/lang/StringIndexOutOfBoundsException;
        //  2912   2918   2911   2912   Any
        //  2911   2918   3      8      Ljava/util/ConcurrentModificationException;
        //  2923   2929   2929   2930   Any
        //  2923   2929   3      8      Any
        //  2923   2929   2929   2930   Ljava/lang/NullPointerException;
        //  2923   2929   2929   2930   Ljava/lang/NullPointerException;
        //  2923   2929   3      8      Ljava/lang/ClassCastException;
        //  2933   2940   2940   2941   Any
        //  2933   2940   2940   2941   Any
        //  2934   2940   2940   2941   Any
        //  2933   2940   2933   2934   Ljava/lang/NullPointerException;
        //  2934   2940   2940   2941   Ljava/util/NoSuchElementException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:586)
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
    
    public static fbx c(final BlockPos p0, final EnumFacing p1, final ItemStack p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          115
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            107
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            99
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iconst_0       
        //    26: iconst_0       
        //    27: aload_1        
        //    28: aload_2        
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            41
        //    35: ldc_w           -106136143
        //    38: goto            44
        //    41: ldc_w           -1301892073
        //    44: ldc_w           -1009262277
        //    47: ixor           
        //    48: lookupswitch {
        //          981179530: 41
        //          1907447084: 76
        //          default: 88
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;ZZLnet/minecraft/util/EnumFacing;Lnet/minecraft/item/ItemStack;)Ldev/nuker/pyro/fbx;
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
        //   115: aconst_null    
        //   116: athrow         
        //    StackMapTable: 00 11 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FE 00 03 07 00 80 07 00 82 07 00 65 FF 00 10 00 03 07 00 80 07 00 82 07 00 65 00 05 07 00 80 01 01 07 00 82 07 00 65 FF 00 02 00 03 07 00 80 07 00 82 07 00 65 00 06 07 00 80 01 01 07 00 82 07 00 65 01 FF 00 1F 00 03 07 00 80 07 00 82 07 00 65 00 05 07 00 80 01 01 07 00 82 07 00 65 42 07 00 14 FF 00 00 00 03 07 00 80 07 00 82 07 00 65 00 05 07 00 80 01 01 07 00 82 07 00 65 45 07 00 27 40 07 00 37 FF 00 00 00 03 07 00 80 07 00 82 07 00 65 00 05 07 00 80 01 01 07 00 82 07 00 65 41 07 00 88 43 05 44 07 00 88 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     99     107    Ljava/lang/IllegalStateException;
        //  99     107    99     107    Ljava/lang/NullPointerException;
        //  115    117    3      8      Any
        //  79     86     86     87     Any
        //  80     86     3      8      Ljava/lang/ArithmeticException;
        //  79     86     3      8      Any
        //  80     86     86     87     Any
        //  79     86     79     80     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 46 out of bounds for length 46
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
    
    public static fbB 4(final BlockPos blockPos) {
        return fbS.1N(null, 238851099, blockPos);
    }
    
    public static float[] c(final double p0, final double p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          400
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            392
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            384
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -276823201
        //    33: goto            39
        //    36: ldc_w           1744530152
        //    39: ldc_w           -1218939861
        //    42: ixor           
        //    43: lookupswitch {
        //          530411373: 36
        //          1490581364: 367
        //          default: 68
        //        }
        //    68: dload_0        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            81
        //    75: ldc_w           1070935794
        //    78: goto            84
        //    81: ldc_w           4675628
        //    84: ldc_w           1382900402
        //    87: ixor           
        //    88: lookupswitch {
        //          464714559: 81
        //          1840794688: 369
        //          default: 116
        //        }
        //   116: dload_2        
        //   117: dload           4
        //   119: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   122: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   125: getstatic       dev/nuker/pyro/fc.1:I
        //   128: ifeq            137
        //   131: ldc_w           1776159825
        //   134: goto            140
        //   137: ldc_w           1015525699
        //   140: ldc_w           -81541783
        //   143: ixor           
        //   144: lookupswitch {
        //          -1828861640: 137
        //          -945523670: 172
        //          default: 373
        //        }
        //   172: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   175: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   178: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   181: getstatic       dev/nuker/pyro/fc.c:I
        //   184: ifge            193
        //   187: ldc_w           171653405
        //   190: goto            196
        //   193: ldc_w           -32298325
        //   196: ldc_w           1458259693
        //   199: ixor           
        //   200: lookupswitch {
        //          598556581: 193
        //          1557168112: 363
        //          default: 228
        //        }
        //   228: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   231: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   234: getstatic       dev/nuker/pyro/fc.1:I
        //   237: ifeq            246
        //   240: ldc_w           -334138269
        //   243: goto            249
        //   246: ldc_w           -1560871877
        //   249: ldc_w           760898608
        //   252: ixor           
        //   253: lookupswitch {
        //          -1884514293: 280
        //          -1051783085: 246
        //          default: 365
        //        }
        //   280: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   283: goto            287
        //   286: athrow         
        //   287: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   290: goto            294
        //   293: athrow         
        //   294: f2d            
        //   295: dadd           
        //   296: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   299: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   302: getstatic       dev/nuker/pyro/fc.c:I
        //   305: ifge            314
        //   308: ldc_w           1580672954
        //   311: goto            317
        //   314: ldc_w           -1566943772
        //   317: ldc_w           -886532600
        //   320: ixor           
        //   321: lookupswitch {
        //          -1793085006: 314
        //          1773323244: 348
        //          default: 371
        //        }
        //   348: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   351: goto            355
        //   354: athrow         
        //   355: invokestatic    dev/nuker/pyro/fby.c:(DDDDDD)[F
        //   358: goto            362
        //   361: athrow         
        //   362: areturn        
        //   363: aconst_null    
        //   364: athrow         
        //   365: aconst_null    
        //   366: athrow         
        //   367: aconst_null    
        //   368: athrow         
        //   369: aconst_null    
        //   370: athrow         
        //   371: aconst_null    
        //   372: athrow         
        //   373: aconst_null    
        //   374: athrow         
        //   375: pop            
        //   376: goto            24
        //   379: pop            
        //   380: aconst_null    
        //   381: goto            375
        //   384: dup            
        //   385: ifnull          375
        //   388: checkcast       Ljava/lang/Throwable;
        //   391: athrow         
        //   392: dup            
        //   393: ifnull          379
        //   396: checkcast       Ljava/lang/Throwable;
        //   399: athrow         
        //   400: aconst_null    
        //   401: athrow         
        //    StackMapTable: 00 29 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FE 00 03 03 03 03 0B 42 01 1C 4C 03 FF 00 02 00 03 03 03 03 00 02 03 01 5F 03 FF 00 14 00 03 03 03 03 00 04 03 03 03 07 00 86 FF 00 02 00 03 03 03 03 00 05 03 03 03 07 00 86 01 FF 00 1F 00 03 03 03 03 00 04 03 03 03 07 00 86 FF 00 14 00 03 03 03 03 00 05 03 03 03 03 07 00 86 FF 00 02 00 03 03 03 03 00 06 03 03 03 03 07 00 86 01 FF 00 1F 00 03 03 03 03 00 05 03 03 03 03 07 00 86 FF 00 11 00 03 03 03 03 00 06 03 03 03 03 03 07 00 2C FF 00 02 00 03 03 03 03 00 07 03 03 03 03 03 07 00 2C 01 FF 00 1E 00 03 03 03 03 00 06 03 03 03 03 03 07 00 2C 45 07 00 27 FF 00 00 00 03 03 03 03 00 06 03 03 03 03 03 07 00 86 45 07 00 27 FF 00 00 00 03 03 03 03 00 06 03 03 03 03 03 02 FF 00 13 00 03 03 03 03 00 06 03 03 03 03 03 07 00 86 FF 00 02 00 03 03 03 03 00 07 03 03 03 03 03 07 00 86 01 FF 00 1E 00 03 03 03 03 00 06 03 03 03 03 03 07 00 86 45 07 00 27 FF 00 00 00 03 03 03 03 00 06 03 03 03 03 03 03 45 07 00 27 40 07 00 D8 FF 00 00 00 03 03 03 03 00 05 03 03 03 03 07 00 86 FF 00 01 00 03 03 03 03 00 06 03 03 03 03 03 07 00 2C 01 41 03 FF 00 01 00 03 03 03 03 00 06 03 03 03 03 03 07 00 86 FF 00 01 00 03 03 03 03 00 04 03 03 03 07 00 86 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  8      20     384    392    Ljava/lang/ArithmeticException;
        //  384    392    384    392    Any
        //  400    402    3      8      Any
        //  286    293    293    294    Any
        //  286    293    293    294    Any
        //  286    293    286    287    Any
        //  286    293    293    294    Ljava/lang/ArithmeticException;
        //  286    293    286    287    Any
        //  354    361    361    362    Any
        //  354    361    361    362    Ljava/lang/ArithmeticException;
        //  355    361    354    355    Any
        //  354    361    354    355    Any
        //  355    361    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 112 out of bounds for length 112
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
    
    public static fbw c(final BlockPos p0, final float p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          116
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            108
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            100
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           -111136746
        //    34: goto            40
        //    37: ldc_w           24500099
        //    40: ldc_w           1743865467
        //    43: ixor           
        //    44: lookupswitch {
        //          -1634634131: 89
        //          -1072150436: 37
        //          default: 72
        //        }
        //    72: fload_1        
        //    73: iload_2        
        //    74: iconst_0       
        //    75: iconst_0       
        //    76: iload_3        
        //    77: goto            81
        //    80: athrow         
        //    81: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZZZZ)Ldev/nuker/pyro/fbw;
        //    84: goto            88
        //    87: athrow         
        //    88: areturn        
        //    89: aconst_null    
        //    90: athrow         
        //    91: pop            
        //    92: goto            24
        //    95: pop            
        //    96: aconst_null    
        //    97: goto            91
        //   100: dup            
        //   101: ifnull          91
        //   104: checkcast       Ljava/lang/Throwable;
        //   107: athrow         
        //   108: dup            
        //   109: ifnull          95
        //   112: checkcast       Ljava/lang/Throwable;
        //   115: athrow         
        //   116: aconst_null    
        //   117: athrow         
        //    StackMapTable: 00 11 43 07 00 88 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 04 07 00 80 02 01 01 00 00 4C 07 00 80 FF 00 02 00 04 07 00 80 02 01 01 00 02 07 00 80 01 5F 07 00 80 FF 00 07 00 00 00 01 07 00 27 FF 00 00 00 04 07 00 80 02 01 01 00 06 07 00 80 02 01 01 01 01 45 07 00 27 40 07 02 46 40 07 00 80 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 88
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     100    108    Any
        //  100    108    100    108    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  116    118    3      8      Ljava/lang/IllegalArgumentException;
        //  81     87     87     88     Any
        //  81     87     87     88     Ljava/lang/IllegalStateException;
        //  81     87     3      8      Ljava/lang/IllegalStateException;
        //  81     87     87     88     Any
        //  81     87     87     88     Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 39 out of bounds for length 39
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
    
    public static fbw c(final BlockPos p0, final float p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          165
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            157
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            149
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           -325382616
        //    34: goto            40
        //    37: ldc_w           1423089212
        //    40: ldc_w           -1339267768
        //    43: ixor           
        //    44: lookupswitch {
        //          336692330: 37
        //          1555524448: 138
        //          default: 72
        //        }
        //    72: fload_1        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            85
        //    79: ldc_w           1525785472
        //    82: goto            88
        //    85: ldc_w           -912546224
        //    88: ldc_w           -172363209
        //    91: ixor           
        //    92: lookupswitch {
        //          -1354214985: 85
        //          1008882791: 120
        //          default: 136
        //        }
        //   120: iload_2        
        //   121: iconst_0       
        //   122: iconst_0       
        //   123: iconst_0       
        //   124: goto            128
        //   127: athrow         
        //   128: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZZZZ)Ldev/nuker/pyro/fbw;
        //   131: goto            135
        //   134: athrow         
        //   135: areturn        
        //   136: aconst_null    
        //   137: athrow         
        //   138: aconst_null    
        //   139: athrow         
        //   140: pop            
        //   141: goto            24
        //   144: pop            
        //   145: aconst_null    
        //   146: goto            140
        //   149: dup            
        //   150: ifnull          140
        //   153: checkcast       Ljava/lang/Throwable;
        //   156: athrow         
        //   157: dup            
        //   158: ifnull          144
        //   161: checkcast       Ljava/lang/Throwable;
        //   164: athrow         
        //   165: aconst_null    
        //   166: athrow         
        //    StackMapTable: 00 15 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FE 00 03 07 00 80 02 01 4C 07 00 80 FF 00 02 00 03 07 00 80 02 01 00 02 07 00 80 01 5F 07 00 80 FF 00 0C 00 03 07 00 80 02 01 00 02 07 00 80 02 FF 00 02 00 03 07 00 80 02 01 00 03 07 00 80 02 01 FF 00 1F 00 03 07 00 80 02 01 00 02 07 00 80 02 46 07 00 27 FF 00 00 00 03 07 00 80 02 01 00 06 07 00 80 02 01 01 01 01 45 07 00 27 40 07 02 46 FF 00 00 00 03 07 00 80 02 01 00 02 07 00 80 02 41 07 00 80 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     149    157    Any
        //  149    157    149    157    Ljava/lang/UnsupportedOperationException;
        //  165    167    3      8      Ljava/lang/UnsupportedOperationException;
        //  127    134    134    135    Any
        //  128    134    3      8      Any
        //  128    134    127    128    Any
        //  127    134    3      8      Any
        //  127    134    134    135    Any
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
    
    public static boolean 5(final BlockPos blockPos) {
        return fbS.4I(null, 2074278941, blockPos);
    }
    
    public static fbB c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          173
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            165
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            157
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/BlockPos;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            40
        //    34: ldc_w           1756304372
        //    37: goto            43
        //    40: ldc_w           -224572095
        //    43: ldc_w           323645209
        //    46: ixor           
        //    47: lookupswitch {
        //          -998072215: 40
        //          2078637293: 146
        //          default: 72
        //        }
        //    72: iload_0        
        //    73: iload_1        
        //    74: iload_2        
        //    75: goto            79
        //    78: athrow         
        //    79: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //    82: goto            86
        //    85: athrow         
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            98
        //    92: ldc_w           -370021615
        //    95: goto            101
        //    98: ldc_w           -882258296
        //   101: ldc_w           2073823230
        //   104: ixor           
        //   105: lookupswitch {
        //          -1838289681: 144
        //          1998113590: 98
        //          default: 132
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokestatic    dev/nuker/pyro/fby.4:(Lnet/minecraft/util/math/BlockPos;)Ldev/nuker/pyro/fbB;
        //   139: goto            143
        //   142: athrow         
        //   143: areturn        
        //   144: aconst_null    
        //   145: athrow         
        //   146: aconst_null    
        //   147: athrow         
        //   148: pop            
        //   149: goto            24
        //   152: pop            
        //   153: aconst_null    
        //   154: goto            148
        //   157: dup            
        //   158: ifnull          148
        //   161: checkcast       Ljava/lang/Throwable;
        //   164: athrow         
        //   165: dup            
        //   166: ifnull          152
        //   169: checkcast       Ljava/lang/Throwable;
        //   172: athrow         
        //   173: aconst_null    
        //   174: athrow         
        //    StackMapTable: 00 19 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FE 00 03 01 01 01 FF 00 0F 00 03 01 01 01 00 02 08 00 18 08 00 18 FF 00 02 00 03 01 01 01 00 03 08 00 18 08 00 18 01 FF 00 1C 00 03 01 01 01 00 02 08 00 18 08 00 18 45 07 00 16 FF 00 00 00 03 01 01 01 00 05 08 00 18 08 00 18 01 01 01 45 07 00 27 40 07 00 80 4B 07 00 80 FF 00 02 00 03 01 01 01 00 02 07 00 80 01 5E 07 00 80 42 07 00 27 40 07 00 80 45 07 00 27 40 07 01 F8 40 07 00 80 FF 00 01 00 03 01 01 01 00 02 08 00 18 08 00 18 41 07 00 8F 43 05 44 07 00 8F 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     157    165    Ljava/lang/IndexOutOfBoundsException;
        //  157    165    157    165    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  173    175    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  78     85     85     86     Any
        //  79     85     3      8      Any
        //  78     85     3      8      Any
        //  78     85     85     86     Any
        //  79     85     78     79     Ljava/lang/NullPointerException;
        //  135    142    142    143    Any
        //  136    142    135    136    Any
        //  136    142    142    143    Any
        //  136    142    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  136    142    135    136    Any
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
    
    public static fbB c(final BlockPos p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2854
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2846
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2838
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec3d;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    31: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    34: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    37: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    40: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    43: getstatic       dev/nuker/pyro/fc.0:I
        //    46: ifeq            55
        //    49: ldc_w           -1440070744
        //    52: goto            58
        //    55: ldc_w           642353457
        //    58: ldc_w           -415324190
        //    61: ixor           
        //    62: lookupswitch {
        //          1293214794: 2795
        //          1891880191: 55
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //    95: goto            99
        //    98: athrow         
        //    99: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   102: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   105: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   108: goto            112
        //   111: athrow         
        //   112: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   115: goto            119
        //   118: athrow         
        //   119: f2d            
        //   120: dadd           
        //   121: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   124: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   127: getstatic       dev/nuker/pyro/fc.c:I
        //   130: ifge            139
        //   133: ldc_w           914107018
        //   136: goto            142
        //   139: ldc_w           -244013540
        //   142: ldc_w           -1845470065
        //   145: ixor           
        //   146: lookupswitch {
        //          -1535347195: 139
        //          1668610707: 172
        //          default: 2793
        //        }
        //   172: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   175: getstatic       dev/nuker/pyro/fc.0:I
        //   178: ifeq            187
        //   181: ldc_w           910046450
        //   184: goto            190
        //   187: ldc_w           -1012895324
        //   190: ldc_w           -1051774553
        //   193: ixor           
        //   194: lookupswitch {
        //          -1143157579: 187
        //          -143588011: 2779
        //          default: 220
        //        }
        //   220: goto            224
        //   223: athrow         
        //   224: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   227: goto            231
        //   230: athrow         
        //   231: getstatic       dev/nuker/pyro/fc.c:I
        //   234: ifge            243
        //   237: ldc_w           1442888093
        //   240: goto            246
        //   243: ldc_w           -1662744982
        //   246: ldc_w           -1094187927
        //   249: ixor           
        //   250: lookupswitch {
        //          -389497356: 243
        //          573342211: 276
        //          default: 2763
        //        }
        //   276: astore_3       
        //   277: getstatic       dev/nuker/pyro/fc.1:I
        //   280: ifeq            289
        //   283: ldc_w           1808663736
        //   286: goto            292
        //   289: ldc_w           2120936440
        //   292: ldc_w           518859376
        //   295: ixor           
        //   296: lookupswitch {
        //          282873584: 289
        //          1965240008: 2757
        //          default: 324
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //   331: goto            335
        //   334: athrow         
        //   335: astore          4
        //   337: aload           4
        //   339: arraylength    
        //   340: istore          5
        //   342: iconst_0       
        //   343: istore          6
        //   345: iload           6
        //   347: iload           5
        //   349: if_icmpge       2747
        //   352: aload           4
        //   354: iload           6
        //   356: aaload         
        //   357: astore          7
        //   359: getstatic       dev/nuker/pyro/fc.0:I
        //   362: ifeq            371
        //   365: ldc_w           1252538395
        //   368: goto            374
        //   371: ldc_w           929309065
        //   374: ldc_w           1961638788
        //   377: ixor           
        //   378: lookupswitch {
        //          1044644767: 371
        //          1132993037: 404
        //          default: 2825
        //        }
        //   404: aload_0        
        //   405: aload           7
        //   407: getstatic       dev/nuker/pyro/fc.1:I
        //   410: ifeq            419
        //   413: ldc_w           -1404072389
        //   416: goto            422
        //   419: ldc_w           1332029946
        //   422: ldc_w           -772574270
        //   425: ixor           
        //   426: lookupswitch {
        //          -1634313672: 452
        //          2109537785: 419
        //          default: 2769
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   459: goto            463
        //   462: athrow         
        //   463: getstatic       dev/nuker/pyro/fc.0:I
        //   466: ifeq            475
        //   469: ldc_w           -265866106
        //   472: goto            478
        //   475: ldc_w           -1221961368
        //   478: ldc_w           1728003176
        //   481: ixor           
        //   482: lookupswitch {
        //          -1764226834: 475
        //          -774544128: 508
        //          default: 2775
        //        }
        //   508: astore          8
        //   510: aload           8
        //   512: getstatic       dev/nuker/pyro/fc.0:I
        //   515: ifeq            524
        //   518: ldc_w           -1555388743
        //   521: goto            527
        //   524: ldc_w           -399115957
        //   527: ldc_w           -1727366482
        //   530: ixor           
        //   531: lookupswitch {
        //          250754544: 524
        //          977329175: 2821
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   563: goto            567
        //   566: athrow         
        //   567: ifne            573
        //   570: goto            2741
        //   573: new             Lnet/minecraft/util/math/Vec3d;
        //   576: dup            
        //   577: aload           7
        //   579: getstatic       dev/nuker/pyro/fc.c:I
        //   582: ifge            591
        //   585: ldc_w           -1395084914
        //   588: goto            594
        //   591: ldc_w           1767251649
        //   594: ldc_w           652792857
        //   597: ixor           
        //   598: lookupswitch {
        //          -1976539753: 2781
        //          127363575: 591
        //          default: 624
        //        }
        //   624: goto            628
        //   627: athrow         
        //   628: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //   631: goto            635
        //   634: athrow         
        //   635: goto            639
        //   638: athrow         
        //   639: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   642: goto            646
        //   645: athrow         
        //   646: astore          9
        //   648: getstatic       dev/nuker/pyro/fby.c:[D
        //   651: astore          10
        //   653: getstatic       dev/nuker/pyro/fc.1:I
        //   656: ifeq            665
        //   659: ldc_w           -1711514750
        //   662: goto            668
        //   665: ldc_w           221887513
        //   668: ldc_w           -576456240
        //   671: ixor           
        //   672: lookupswitch {
        //          -795195959: 700
        //          1147118162: 665
        //          default: 2805
        //        }
        //   700: aload           10
        //   702: arraylength    
        //   703: istore          11
        //   705: iconst_0       
        //   706: istore          12
        //   708: iload           12
        //   710: iload           11
        //   712: if_icmpge       2741
        //   715: aload           10
        //   717: iload           12
        //   719: daload         
        //   720: dstore          13
        //   722: getstatic       dev/nuker/pyro/fby.0:[D
        //   725: astore          15
        //   727: aload           15
        //   729: arraylength    
        //   730: istore          16
        //   732: iconst_0       
        //   733: istore          17
        //   735: getstatic       dev/nuker/pyro/fc.1:I
        //   738: ifeq            747
        //   741: ldc_w           -52012430
        //   744: goto            750
        //   747: ldc_w           -1783750362
        //   750: ldc_w           614999370
        //   753: ixor           
        //   754: lookupswitch {
        //          -665944264: 2755
        //          1022024589: 747
        //          default: 780
        //        }
        //   780: iload           17
        //   782: iload           16
        //   784: if_icmpge       793
        //   787: ldc_w           -1801945314
        //   790: goto            796
        //   793: ldc_w           -1801945313
        //   796: ldc_w           -2067667202
        //   799: ixor           
        //   800: tableswitch {
        //          548615104: 824
        //          548615105: 2735
        //          default: 787
        //        }
        //   824: aload           15
        //   826: iload           17
        //   828: daload         
        //   829: dstore          18
        //   831: getstatic       dev/nuker/pyro/fc.1:I
        //   834: ifeq            843
        //   837: ldc_w           -297407928
        //   840: goto            846
        //   843: ldc_w           -864478919
        //   846: ldc_w           -702733519
        //   849: ixor           
        //   850: lookupswitch {
        //          442776072: 876
        //          945342841: 843
        //          default: 2751
        //        }
        //   876: getstatic       dev/nuker/pyro/fby.1:[D
        //   879: astore          20
        //   881: aload           20
        //   883: arraylength    
        //   884: istore          21
        //   886: iconst_0       
        //   887: istore          22
        //   889: iload           22
        //   891: iload           21
        //   893: if_icmpge       902
        //   896: ldc_w           -1977967116
        //   899: goto            905
        //   902: ldc_w           -1977967117
        //   905: ldc_w           -1937915617
        //   908: ixor           
        //   909: tableswitch {
        //          214874582: 932
        //          214874583: 2729
        //          default: 896
        //        }
        //   932: aload           20
        //   934: getstatic       dev/nuker/pyro/fc.1:I
        //   937: ifeq            946
        //   940: ldc_w           909658241
        //   943: goto            949
        //   946: ldc_w           -1013527896
        //   949: ldc_w           811043376
        //   952: ixor           
        //   953: lookupswitch {
        //          -205438824: 980
        //          107987633: 946
        //          default: 2813
        //        }
        //   980: iload           22
        //   982: daload         
        //   983: dstore          23
        //   985: new             Lnet/minecraft/util/math/Vec3d;
        //   988: dup            
        //   989: aload_0        
        //   990: goto            994
        //   993: athrow         
        //   994: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   997: goto            1001
        //  1000: athrow         
        //  1001: dload           13
        //  1003: dload           18
        //  1005: dload           23
        //  1007: getstatic       dev/nuker/pyro/fc.1:I
        //  1010: ifeq            1019
        //  1013: ldc_w           1924194329
        //  1016: goto            1022
        //  1019: ldc_w           948524129
        //  1022: ldc_w           1398637919
        //  1025: ixor           
        //  1026: lookupswitch {
        //          -1476056722: 1019
        //          569206086: 2797
        //          default: 1052
        //        }
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: astore          25
        //  1065: aload_3        
        //  1066: getstatic       dev/nuker/pyro/fc.0:I
        //  1069: ifeq            1078
        //  1072: ldc_w           1070802315
        //  1075: goto            1081
        //  1078: ldc_w           2085760115
        //  1081: ldc_w           -316672863
        //  1084: ixor           
        //  1085: lookupswitch {
        //          -1857169198: 1112
        //          -758329046: 1078
        //          default: 2787
        //        }
        //  1112: aload           25
        //  1114: goto            1118
        //  1117: athrow         
        //  1118: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: getstatic       dev/nuker/pyro/fc.1:I
        //  1128: ifeq            1137
        //  1131: ldc_w           -907469216
        //  1134: goto            1140
        //  1137: ldc_w           -170025234
        //  1140: ldc_w           -223587547
        //  1143: ixor           
        //  1144: lookupswitch {
        //          124898763: 1172
        //          994397509: 1137
        //          default: 2785
        //        }
        //  1172: dstore          26
        //  1174: aload           25
        //  1176: new             Lnet/minecraft/util/math/Vec3d;
        //  1179: dup            
        //  1180: aload           9
        //  1182: getstatic       dev/nuker/pyro/fc.0:I
        //  1185: ifeq            1194
        //  1188: ldc_w           -1752032873
        //  1191: goto            1197
        //  1194: ldc_w           1113577352
        //  1197: ldc_w           -1499452625
        //  1200: ixor           
        //  1201: lookupswitch {
        //          -452985689: 1228
        //          825373368: 1194
        //          default: 2823
        //        }
        //  1228: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1231: ldc2_w          0.5
        //  1234: dmul           
        //  1235: aload           9
        //  1237: getstatic       dev/nuker/pyro/fc.1:I
        //  1240: ifeq            1249
        //  1243: ldc_w           652336740
        //  1246: goto            1252
        //  1249: ldc_w           -1974394528
        //  1252: ldc_w           -726806963
        //  1255: ixor           
        //  1256: lookupswitch {
        //          -229896151: 2783
        //          1002774277: 1249
        //          default: 1284
        //        }
        //  1284: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1287: ldc2_w          0.5
        //  1290: dmul           
        //  1291: aload           9
        //  1293: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1296: ldc2_w          0.5
        //  1299: dmul           
        //  1300: goto            1304
        //  1303: athrow         
        //  1304: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: goto            1315
        //  1314: athrow         
        //  1315: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1318: goto            1322
        //  1321: athrow         
        //  1322: getstatic       dev/nuker/pyro/fc.1:I
        //  1325: ifeq            1334
        //  1328: ldc_w           239179371
        //  1331: goto            1337
        //  1334: ldc_w           -2075302137
        //  1337: ldc_w           -1883108084
        //  1340: ixor           
        //  1341: lookupswitch {
        //          -2122081433: 2759
        //          256400167: 1334
        //          default: 1368
        //        }
        //  1368: astore          28
        //  1370: aload_3        
        //  1371: aload           28
        //  1373: goto            1377
        //  1376: athrow         
        //  1377: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1380: goto            1384
        //  1383: athrow         
        //  1384: ldc2_w          18.0
        //  1387: dcmpl          
        //  1388: ifgt            2723
        //  1391: dload           26
        //  1393: getstatic       dev/nuker/pyro/fc.c:I
        //  1396: ifge            1405
        //  1399: ldc_w           -262936982
        //  1402: goto            1408
        //  1405: ldc_w           -606441336
        //  1408: ldc_w           -1872866074
        //  1411: ixor           
        //  1412: lookupswitch {
        //          1266951278: 1440
        //          1611510412: 1405
        //          default: 2765
        //        }
        //  1440: aload_3        
        //  1441: aload           25
        //  1443: aload           9
        //  1445: goto            1449
        //  1448: athrow         
        //  1449: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: getstatic       dev/nuker/pyro/fc.0:I
        //  1459: ifeq            1468
        //  1462: ldc_w           -1116126977
        //  1465: goto            1471
        //  1468: ldc_w           -1708523280
        //  1471: ldc_w           -2116893439
        //  1474: ixor           
        //  1475: lookupswitch {
        //          -264909741: 1468
        //          1017873918: 2803
        //          default: 1500
        //        }
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: dcmpl          
        //  1512: ifgt            2723
        //  1515: getstatic       dev/nuker/pyro/fc.c:I
        //  1518: ifge            1527
        //  1521: ldc_w           589525014
        //  1524: goto            1530
        //  1527: ldc_w           -1573545684
        //  1530: ldc_w           1754234127
        //  1533: ixor           
        //  1534: lookupswitch {
        //          -1567784722: 1527
        //          1269566745: 2815
        //          default: 1560
        //        }
        //  1560: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1563: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1566: aload_3        
        //  1567: aload           28
        //  1569: iconst_0       
        //  1570: iconst_1       
        //  1571: iconst_0       
        //  1572: goto            1576
        //  1575: athrow         
        //  1576: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: ifnull          1589
        //  1586: goto            2723
        //  1589: aload           28
        //  1591: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1594: aload_3        
        //  1595: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1598: dsub           
        //  1599: dstore          29
        //  1601: getstatic       dev/nuker/pyro/fc.0:I
        //  1604: ifeq            1613
        //  1607: ldc_w           -2067162873
        //  1610: goto            1616
        //  1613: ldc_w           -81833527
        //  1616: ldc_w           1660005674
        //  1619: ixor           
        //  1620: lookupswitch {
        //          -1712390941: 1648
        //          -432524243: 1613
        //          default: 2771
        //        }
        //  1648: aload           28
        //  1650: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1653: aload_3        
        //  1654: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1657: dsub           
        //  1658: getstatic       dev/nuker/pyro/fc.1:I
        //  1661: ifeq            1670
        //  1664: ldc_w           2017893594
        //  1667: goto            1673
        //  1670: ldc_w           -294451930
        //  1673: ldc_w           -1791425516
        //  1676: ixor           
        //  1677: lookupswitch {
        //          -310404914: 1670
        //          2068447538: 1704
        //          default: 2807
        //        }
        //  1704: dstore          31
        //  1706: aload           28
        //  1708: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1711: aload_3        
        //  1712: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1715: dsub           
        //  1716: dstore          33
        //  1718: dload           29
        //  1720: dload           29
        //  1722: dmul           
        //  1723: dload           33
        //  1725: dload           33
        //  1727: dmul           
        //  1728: dadd           
        //  1729: getstatic       dev/nuker/pyro/fc.0:I
        //  1732: ifeq            1741
        //  1735: ldc_w           1094881663
        //  1738: goto            1744
        //  1741: ldc_w           1275180542
        //  1744: ldc_w           -540493556
        //  1747: ixor           
        //  1748: lookupswitch {
        //          -1635112845: 2767
        //          1440841244: 1741
        //          default: 1776
        //        }
        //  1776: goto            1780
        //  1779: athrow         
        //  1780: invokestatic    net/minecraft/util/math/MathHelper.func_76133_a:(D)F
        //  1783: goto            1787
        //  1786: athrow         
        //  1787: f2d            
        //  1788: dstore          35
        //  1790: new             Ldev/nuker/pyro/fbN;
        //  1793: dup            
        //  1794: dload           33
        //  1796: dload           29
        //  1798: goto            1802
        //  1801: athrow         
        //  1802: invokestatic    java/lang/Math.atan2:(DD)D
        //  1805: goto            1809
        //  1808: athrow         
        //  1809: goto            1813
        //  1812: athrow         
        //  1813: invokestatic    java/lang/Math.toDegrees:(D)D
        //  1816: goto            1820
        //  1819: athrow         
        //  1820: d2f            
        //  1821: ldc_w           90.0
        //  1824: fsub           
        //  1825: getstatic       dev/nuker/pyro/fc.0:I
        //  1828: ifeq            1837
        //  1831: ldc_w           -1966540442
        //  1834: goto            1840
        //  1837: ldc_w           -2144654557
        //  1840: ldc_w           -186075534
        //  1843: ixor           
        //  1844: lookupswitch {
        //          -593476594: 1837
        //          2116046612: 2801
        //          default: 1872
        //        }
        //  1872: goto            1876
        //  1875: athrow         
        //  1876: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  1879: goto            1883
        //  1882: athrow         
        //  1883: dload           31
        //  1885: dload           35
        //  1887: getstatic       dev/nuker/pyro/fc.1:I
        //  1890: ifeq            1899
        //  1893: ldc_w           -1019543523
        //  1896: goto            1902
        //  1899: ldc_w           -1507982443
        //  1902: ldc_w           -1594233711
        //  1905: ixor           
        //  1906: lookupswitch {
        //          -211320969: 1899
        //          1673718924: 2819
        //          default: 1932
        //        }
        //  1932: goto            1936
        //  1935: athrow         
        //  1936: invokestatic    java/lang/Math.atan2:(DD)D
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: goto            1947
        //  1946: athrow         
        //  1947: invokestatic    java/lang/Math.toDegrees:(D)D
        //  1950: goto            1954
        //  1953: athrow         
        //  1954: dneg           
        //  1955: d2f            
        //  1956: goto            1960
        //  1959: athrow         
        //  1960: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  1963: goto            1967
        //  1966: athrow         
        //  1967: goto            1971
        //  1970: athrow         
        //  1971: invokespecial   dev/nuker/pyro/fbN.<init>:(FF)V
        //  1974: goto            1978
        //  1977: athrow         
        //  1978: astore          37
        //  1980: getstatic       dev/nuker/pyro/fc.0:I
        //  1983: ifeq            1992
        //  1986: ldc_w           1635942816
        //  1989: goto            1995
        //  1992: ldc_w           -1529182369
        //  1995: ldc_w           1918531579
        //  1998: ixor           
        //  1999: lookupswitch {
        //          -696192860: 2024
        //          332985947: 1992
        //          default: 2773
        //        }
        //  2024: goto            2028
        //  2027: athrow         
        //  2028: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2031: goto            2035
        //  2034: athrow         
        //  2035: getstatic       dev/nuker/pyro/fc.c:I
        //  2038: ifge            2047
        //  2041: ldc_w           -396993542
        //  2044: goto            2050
        //  2047: ldc_w           -1682691519
        //  2050: ldc_w           2056312936
        //  2053: ixor           
        //  2054: lookupswitch {
        //          -1832483950: 2047
        //          -517672407: 2080
        //          default: 2827
        //        }
        //  2080: aload           37
        //  2082: goto            2086
        //  2085: athrow         
        //  2086: invokevirtual   dev/nuker/pyro/fbP.c:(Ldev/nuker/pyro/fbN;)Lnet/minecraft/util/math/Vec3d;
        //  2089: goto            2093
        //  2092: athrow         
        //  2093: astore          38
        //  2095: aload_3        
        //  2096: aload           38
        //  2098: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  2101: ldc2_w          4.0
        //  2104: dmul           
        //  2105: getstatic       dev/nuker/pyro/fc.1:I
        //  2108: ifeq            2117
        //  2111: ldc_w           1583911374
        //  2114: goto            2120
        //  2117: ldc_w           -10809352
        //  2120: ldc_w           -753901196
        //  2123: ixor           
        //  2124: lookupswitch {
        //          -1921453894: 2799
        //          435595102: 2117
        //          default: 2152
        //        }
        //  2152: aload           38
        //  2154: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  2157: ldc2_w          4.0
        //  2160: dmul           
        //  2161: aload           38
        //  2163: getstatic       dev/nuker/pyro/fc.0:I
        //  2166: ifeq            2175
        //  2169: ldc_w           -1858107308
        //  2172: goto            2178
        //  2175: ldc_w           1570792567
        //  2178: ldc_w           -370424922
        //  2181: ixor           
        //  2182: lookupswitch {
        //          1258475417: 2175
        //          2027178994: 2789
        //          default: 2208
        //        }
        //  2208: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  2211: ldc2_w          4.0
        //  2214: dmul           
        //  2215: getstatic       dev/nuker/pyro/fc.0:I
        //  2218: ifeq            2227
        //  2221: ldc_w           -613170664
        //  2224: goto            2230
        //  2227: ldc_w           1415614357
        //  2230: ldc_w           410356451
        //  2233: ixor           
        //  2234: lookupswitch {
        //          -1022998277: 2811
        //          1143657644: 2227
        //          default: 2260
        //        }
        //  2260: goto            2264
        //  2263: athrow         
        //  2264: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  2267: goto            2271
        //  2270: athrow         
        //  2271: astore          39
        //  2273: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2276: getstatic       dev/nuker/pyro/fc.0:I
        //  2279: ifeq            2288
        //  2282: ldc_w           1986927378
        //  2285: goto            2291
        //  2288: ldc_w           -1004674870
        //  2291: ldc_w           -282574344
        //  2294: ixor           
        //  2295: lookupswitch {
        //          -1723442454: 2753
        //          -1303892334: 2288
        //          default: 2320
        //        }
        //  2320: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2323: aload_3        
        //  2324: getstatic       dev/nuker/pyro/fc.1:I
        //  2327: ifeq            2336
        //  2330: ldc_w           1406160693
        //  2333: goto            2339
        //  2336: ldc_w           -1655200450
        //  2339: ldc_w           -2143437401
        //  2342: ixor           
        //  2343: lookupswitch {
        //          -739380590: 2336
        //          493492377: 2368
        //          default: 2809
        //        }
        //  2368: aload           39
        //  2370: iconst_0       
        //  2371: iconst_0       
        //  2372: iconst_1       
        //  2373: goto            2377
        //  2376: athrow         
        //  2377: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  2380: goto            2384
        //  2383: athrow         
        //  2384: astore          40
        //  2386: getstatic       dev/nuker/pyro/fc.1:I
        //  2389: ifeq            2398
        //  2392: ldc_w           -1464881473
        //  2395: goto            2401
        //  2398: ldc_w           413107010
        //  2401: ldc_w           1441885390
        //  2404: ixor           
        //  2405: lookupswitch {
        //          -44121487: 2398
        //          1299115916: 2432
        //          default: 2749
        //        }
        //  2432: aload           40
        //  2434: getfield        net/minecraft/util/math/RayTraceResult.field_72313_a:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2437: getstatic       net/minecraft/util/math/RayTraceResult$Type.BLOCK:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2440: if_acmpne       2723
        //  2443: getstatic       dev/nuker/pyro/fc.c:I
        //  2446: ifge            2455
        //  2449: ldc_w           1771835432
        //  2452: goto            2458
        //  2455: ldc_w           1312105462
        //  2458: ldc_w           219675637
        //  2461: ixor           
        //  2462: lookupswitch {
        //          -1646153069: 2455
        //          1686891485: 2791
        //          default: 2488
        //        }
        //  2488: aload           40
        //  2490: goto            2494
        //  2493: athrow         
        //  2494: invokevirtual   net/minecraft/util/math/RayTraceResult.func_178782_a:()Lnet/minecraft/util/math/BlockPos;
        //  2497: goto            2501
        //  2500: athrow         
        //  2501: getstatic       dev/nuker/pyro/fc.1:I
        //  2504: ifeq            2513
        //  2507: ldc_w           786746529
        //  2510: goto            2516
        //  2513: ldc_w           748235674
        //  2516: ldc_w           -1358670065
        //  2519: ixor           
        //  2520: lookupswitch {
        //          -2115986514: 2817
        //          1949973022: 2513
        //          default: 2548
        //        }
        //  2548: aload           8
        //  2550: goto            2554
        //  2553: athrow         
        //  2554: invokevirtual   net/minecraft/util/math/BlockPos.equals:(Ljava/lang/Object;)Z
        //  2557: goto            2561
        //  2560: athrow         
        //  2561: ifne            2567
        //  2564: goto            2723
        //  2567: new             Ldev/nuker/pyro/fbB;
        //  2570: dup            
        //  2571: aload           8
        //  2573: aload           7
        //  2575: goto            2579
        //  2578: athrow         
        //  2579: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2582: goto            2586
        //  2585: athrow         
        //  2586: aload           28
        //  2588: new             Ldev/nuker/pyro/fbQ;
        //  2591: dup            
        //  2592: aload           25
        //  2594: aload           37
        //  2596: aload           7
        //  2598: getstatic       dev/nuker/pyro/fc.c:I
        //  2601: ifge            2610
        //  2604: ldc_w           59807664
        //  2607: goto            2613
        //  2610: ldc_w           -373999317
        //  2613: ldc_w           -1660791409
        //  2616: ixor           
        //  2617: lookupswitch {
        //          -1634549185: 2777
        //          1476602456: 2610
        //          default: 2644
        //        }
        //  2644: goto            2648
        //  2647: athrow         
        //  2648: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2651: goto            2655
        //  2654: athrow         
        //  2655: getstatic       dev/nuker/pyro/fc.c:I
        //  2658: ifge            2667
        //  2661: ldc_w           -321111293
        //  2664: goto            2670
        //  2667: ldc_w           -957139162
        //  2670: ldc_w           1911635461
        //  2673: ixor           
        //  2674: lookupswitch {
        //          -1657993978: 2761
        //          -1600474441: 2667
        //          default: 2700
        //        }
        //  2700: goto            2704
        //  2703: athrow         
        //  2704: invokespecial   dev/nuker/pyro/fbQ.<init>:(Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/fbN;Lnet/minecraft/util/EnumFacing;)V
        //  2707: goto            2711
        //  2710: athrow         
        //  2711: goto            2715
        //  2714: athrow         
        //  2715: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/fbQ;)V
        //  2718: goto            2722
        //  2721: athrow         
        //  2722: areturn        
        //  2723: iinc            22, 1
        //  2726: goto            889
        //  2729: iinc            17, 1
        //  2732: goto            735
        //  2735: iinc            12, 1
        //  2738: goto            708
        //  2741: iinc            6, 1
        //  2744: goto            345
        //  2747: aconst_null    
        //  2748: areturn        
        //  2749: aconst_null    
        //  2750: athrow         
        //  2751: aconst_null    
        //  2752: athrow         
        //  2753: aconst_null    
        //  2754: athrow         
        //  2755: aconst_null    
        //  2756: athrow         
        //  2757: aconst_null    
        //  2758: athrow         
        //  2759: aconst_null    
        //  2760: athrow         
        //  2761: aconst_null    
        //  2762: athrow         
        //  2763: aconst_null    
        //  2764: athrow         
        //  2765: aconst_null    
        //  2766: athrow         
        //  2767: aconst_null    
        //  2768: athrow         
        //  2769: aconst_null    
        //  2770: athrow         
        //  2771: aconst_null    
        //  2772: athrow         
        //  2773: aconst_null    
        //  2774: athrow         
        //  2775: aconst_null    
        //  2776: athrow         
        //  2777: aconst_null    
        //  2778: athrow         
        //  2779: aconst_null    
        //  2780: athrow         
        //  2781: aconst_null    
        //  2782: athrow         
        //  2783: aconst_null    
        //  2784: athrow         
        //  2785: aconst_null    
        //  2786: athrow         
        //  2787: aconst_null    
        //  2788: athrow         
        //  2789: aconst_null    
        //  2790: athrow         
        //  2791: aconst_null    
        //  2792: athrow         
        //  2793: aconst_null    
        //  2794: athrow         
        //  2795: aconst_null    
        //  2796: athrow         
        //  2797: aconst_null    
        //  2798: athrow         
        //  2799: aconst_null    
        //  2800: athrow         
        //  2801: aconst_null    
        //  2802: athrow         
        //  2803: aconst_null    
        //  2804: athrow         
        //  2805: aconst_null    
        //  2806: athrow         
        //  2807: aconst_null    
        //  2808: athrow         
        //  2809: aconst_null    
        //  2810: athrow         
        //  2811: aconst_null    
        //  2812: athrow         
        //  2813: aconst_null    
        //  2814: athrow         
        //  2815: aconst_null    
        //  2816: athrow         
        //  2817: aconst_null    
        //  2818: athrow         
        //  2819: aconst_null    
        //  2820: athrow         
        //  2821: aconst_null    
        //  2822: athrow         
        //  2823: aconst_null    
        //  2824: athrow         
        //  2825: aconst_null    
        //  2826: athrow         
        //  2827: aconst_null    
        //  2828: athrow         
        //  2829: pop            
        //  2830: goto            24
        //  2833: pop            
        //  2834: aconst_null    
        //  2835: goto            2829
        //  2838: dup            
        //  2839: ifnull          2829
        //  2842: checkcast       Ljava/lang/Throwable;
        //  2845: athrow         
        //  2846: dup            
        //  2847: ifnull          2833
        //  2850: checkcast       Ljava/lang/Throwable;
        //  2853: athrow         
        //  2854: aconst_null    
        //  2855: athrow         
        //    StackMapTable: 01 49 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FD 00 03 07 00 80 03 FF 00 1E 00 02 07 00 80 03 00 04 08 00 18 08 00 18 03 07 00 86 FF 00 02 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 07 00 86 01 FF 00 1D 00 02 07 00 80 03 00 04 08 00 18 08 00 18 03 07 00 86 42 07 00 1E FF 00 00 00 02 07 00 80 03 00 04 08 00 18 08 00 18 03 07 00 86 45 07 00 27 FF 00 00 00 02 07 00 80 03 00 04 08 00 18 08 00 18 03 07 00 41 4B 07 00 16 FF 00 00 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 07 00 86 45 07 00 27 FF 00 00 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 02 FF 00 13 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 07 00 86 FF 00 02 00 02 07 00 80 03 00 06 08 00 18 08 00 18 03 03 07 00 86 01 FF 00 1D 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 07 00 86 FF 00 0E 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 02 00 02 07 00 80 03 00 06 08 00 18 08 00 18 03 03 03 01 FF 00 1D 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 03 42 07 00 27 FF 00 00 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 03 45 07 00 27 40 07 00 FB 4B 07 00 FB FF 00 02 00 02 07 00 80 03 00 02 07 00 FB 01 5D 07 00 FB FC 00 0C 07 00 FB 42 01 1F 42 07 00 27 00 45 07 00 27 40 07 02 1B FE 00 09 07 02 1B 01 01 FC 00 19 07 00 82 42 01 1D FF 00 0E 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 FF 00 02 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 03 07 00 80 07 00 82 01 FF 00 1D 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 42 07 00 20 FF 00 00 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 45 07 00 27 40 07 00 80 4B 07 00 80 FF 00 02 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 01 5D 07 00 80 FF 00 0F 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 80 FF 00 02 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 02 07 00 80 01 5C 07 00 80 42 07 00 27 40 07 00 80 45 07 00 27 40 01 05 FF 00 11 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 00 82 FF 00 02 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 04 08 02 3D 08 02 3D 07 00 82 01 FF 00 1D 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 00 82 42 07 00 27 FF 00 00 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 00 82 45 07 00 27 FF 00 00 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 02 1D FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 02 1D 45 07 00 27 40 07 00 FB FD 00 12 07 00 FB 07 02 E3 42 01 1F FD 00 07 01 01 FF 00 1A 00 10 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 00 00 0B 42 01 1D 06 05 42 01 1B FC 00 12 03 42 01 1D FE 00 0C 07 02 E3 01 01 06 05 42 01 1A 4D 07 02 E3 FF 00 02 00 14 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 00 02 07 02 E3 01 5E 07 02 E3 FF 00 0C 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 01 07 00 27 FF 00 00 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 03 08 03 D9 08 03 D9 07 00 80 45 07 00 27 40 07 00 FB FF 00 11 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 04 07 00 FB 03 03 03 FF 00 02 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 05 07 00 FB 03 03 03 01 FF 00 1D 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 04 07 00 FB 03 03 03 42 07 00 27 FF 00 00 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 04 07 00 FB 03 03 03 45 07 00 27 40 07 00 FB FF 00 0E 00 16 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 00 01 07 00 FB FF 00 02 00 16 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 00 02 07 00 FB 01 5E 07 00 FB 44 07 00 27 FF 00 00 00 16 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 00 02 07 00 FB 07 00 FB 45 07 00 27 40 03 4B 03 FF 00 02 00 16 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 00 02 03 01 5F 03 FF 00 15 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 04 07 00 FB 08 04 98 08 04 98 07 00 FB FF 00 02 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 05 07 00 FB 08 04 98 08 04 98 07 00 FB 01 FF 00 1E 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 04 07 00 FB 08 04 98 08 04 98 07 00 FB FF 00 14 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 05 07 00 FB 08 04 98 08 04 98 03 07 00 FB FF 00 02 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 06 07 00 FB 08 04 98 08 04 98 03 07 00 FB 01 FF 00 1F 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 05 07 00 FB 08 04 98 08 04 98 03 07 00 FB 52 07 00 27 FF 00 00 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 06 07 00 FB 08 04 98 08 04 98 03 03 03 45 07 00 27 FF 00 00 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 02 07 00 FB 07 00 FB 42 07 00 27 FF 00 00 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 02 07 00 FB 07 00 FB 45 07 00 27 40 07 00 FB 4B 07 00 FB FF 00 02 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 02 07 00 FB 01 5E 07 00 FB FF 00 07 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 02 07 00 FB 07 00 FB 45 07 00 27 40 03 54 03 FF 00 02 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 02 03 01 5F 03 47 07 00 27 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 07 00 FB 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB FF 00 0B 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB FF 00 02 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 04 03 07 00 FB 07 00 FB 01 FF 00 1C 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB 45 07 00 27 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 02 03 03 0F 42 01 1D 4E 07 00 88 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 06 07 00 4A 07 00 FB 07 00 FB 01 01 01 45 07 00 27 40 07 01 DC 05 FC 00 17 03 42 01 1F 55 03 FF 00 02 00 19 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 00 02 03 01 5E 03 FF 00 24 00 1B 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 00 01 03 FF 00 02 00 1B 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 00 02 03 01 5F 03 42 07 00 27 40 03 45 07 00 27 40 02 FF 00 0D 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 01 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 03 03 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 03 42 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 03 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 03 FF 00 10 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 02 FF 00 02 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 01 FF 00 1F 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 02 42 07 00 88 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 02 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 02 FF 00 0F 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 06 FE 08 06 FE 02 03 03 FF 00 02 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 06 08 06 FE 08 06 FE 02 03 03 01 FF 00 1D 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 06 FE 08 06 FE 02 03 03 42 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 06 FE 08 06 FE 02 03 03 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 03 42 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 03 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 03 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 02 45 07 00 27 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 02 42 07 00 20 FF 00 00 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 04 08 06 FE 08 06 FE 02 02 45 07 00 27 40 07 01 B0 FC 00 0D 07 01 B0 42 01 1C 42 07 00 27 00 45 07 00 27 40 07 01 C6 4B 07 01 C6 FF 00 02 00 1D 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 02 07 01 C6 01 5D 07 01 C6 44 07 00 27 FF 00 00 00 1D 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 02 07 01 C6 07 01 B0 45 07 00 27 40 07 00 FB FF 00 17 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 02 07 00 FB 03 FF 00 02 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 03 07 00 FB 03 01 FF 00 1F 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 02 07 00 FB 03 FF 00 16 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FF 00 02 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 05 07 00 FB 03 03 07 00 FB 01 FF 00 1D 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FF 00 12 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 03 FF 00 02 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 05 07 00 FB 03 03 03 01 FF 00 1D 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 03 42 07 00 27 FF 00 00 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 03 45 07 00 27 40 07 00 FB FF 00 10 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 01 07 00 2C FF 00 02 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 02 07 00 2C 01 5C 07 00 2C FF 00 0F 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 02 07 00 4A 07 00 FB FF 00 02 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 03 07 00 4A 07 00 FB 01 FF 00 1C 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 02 07 00 4A 07 00 FB 47 07 00 27 FF 00 00 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 06 07 00 4A 07 00 FB 07 00 FB 01 01 01 45 07 00 27 40 07 01 DC FC 00 0D 07 01 DC 42 01 1E 16 42 01 1D 44 07 00 27 40 07 01 DC 45 07 00 27 40 07 00 80 4B 07 00 80 FF 00 02 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 07 00 80 01 5F 07 00 80 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 02 07 00 80 07 00 80 45 07 00 27 40 01 05 4A 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 08 0A 07 08 0A 07 07 00 80 07 00 82 45 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 04 08 0A 07 08 0A 07 07 00 80 07 00 82 FF 00 17 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 FF 00 02 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0B 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 01 FF 00 1E 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 42 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 45 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 FF 00 0B 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 FF 00 02 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0B 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 01 FF 00 1D 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 42 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 45 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 06 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 07 02 00 42 07 00 27 FF 00 00 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 06 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 07 02 00 45 07 00 27 40 07 01 F8 FF 00 00 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 00 FF 00 05 00 14 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 00 00 FF 00 05 00 10 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 00 00 FF 00 05 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 00 F9 00 05 FF 00 01 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 00 FF 00 01 00 11 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 00 00 FF 00 01 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 01 07 00 2C FF 00 01 00 10 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 00 00 FF 00 01 00 03 07 00 80 03 07 00 FB 00 00 FF 00 01 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 01 07 00 FB FF 00 01 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 FF 00 01 00 02 07 00 80 03 00 01 07 00 FB FF 00 01 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 01 03 FF 00 01 00 1B 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 00 01 03 FF 00 01 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 FF 00 01 00 19 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 00 00 FF 00 01 00 1D 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 00 FF 00 01 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 01 07 00 80 FF 00 01 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 0A 08 0A 07 08 0A 07 07 00 80 07 00 82 07 00 FB 08 0A 1C 08 0A 1C 07 00 FB 07 01 B0 07 00 82 FF 00 01 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 01 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 03 08 02 3D 08 02 3D 07 00 82 FF 00 01 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 05 07 00 FB 08 04 98 08 04 98 03 07 00 FB FF 00 01 00 16 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 00 01 03 41 07 00 FB FF 00 01 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 07 00 FB FD 00 01 07 00 FB 07 01 DC FF 00 01 00 02 07 00 80 03 00 05 08 00 18 08 00 18 03 03 07 00 86 FF 00 01 00 02 07 00 80 03 00 04 08 00 18 08 00 18 03 07 00 86 FF 00 01 00 15 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 00 04 07 00 FB 03 03 03 FF 00 01 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 02 07 00 FB 03 FF 00 01 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 03 08 06 FE 08 06 FE 02 FF 00 01 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 03 03 07 00 FB 07 00 FB FF 00 01 00 0A 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 00 00 FF 00 01 00 19 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 00 01 03 FF 00 01 00 1F 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 00 02 07 00 4A 07 00 FB FF 00 01 00 1E 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 00 04 07 00 FB 03 03 03 FF 00 01 00 14 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 00 01 07 02 E3 FF 00 01 00 18 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 00 00 FF 00 01 00 20 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 07 00 FB 07 00 FB 07 01 DC 00 01 07 00 80 FF 00 01 00 1C 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 00 05 08 06 FE 08 06 FE 02 03 03 FF 00 01 00 08 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 80 FF 00 01 00 17 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 00 04 07 00 FB 08 04 98 08 04 98 07 00 FB FF 00 01 00 07 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 00 00 FF 00 01 00 1D 07 00 80 03 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 FB 07 02 E3 01 01 03 07 02 E3 01 01 03 07 02 E3 01 01 03 07 00 FB 03 07 00 FB 03 03 03 03 07 01 B0 00 01 07 01 C6 FF 00 01 00 02 07 00 80 03 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2838   2846   Ljava/util/NoSuchElementException;
        //  2838   2846   2838   2846   Ljava/lang/AssertionError;
        //  2854   2856   3      8      Any
        //  91     98     98     99     Any
        //  91     98     91     92     Ljava/lang/IllegalArgumentException;
        //  91     98     98     99     Any
        //  91     98     98     99     Ljava/lang/NegativeArraySizeException;
        //  92     98     3      8      Ljava/lang/IllegalStateException;
        //  111    118    118    119    Any
        //  111    118    118    119    Ljava/lang/AssertionError;
        //  111    118    3      8      Any
        //  112    118    111    112    Ljava/lang/NullPointerException;
        //  112    118    118    119    Any
        //  223    230    230    231    Any
        //  224    230    223    224    Any
        //  224    230    223    224    Any
        //  223    230    223    224    Any
        //  224    230    230    231    Ljava/lang/UnsupportedOperationException;
        //  327    334    334    335    Any
        //  328    334    3      8      Any
        //  328    334    327    328    Ljava/lang/NumberFormatException;
        //  327    334    327    328    Any
        //  328    334    334    335    Ljava/lang/UnsupportedOperationException;
        //  455    462    462    463    Any
        //  456    462    462    463    Any
        //  456    462    462    463    Ljava/lang/IndexOutOfBoundsException;
        //  455    462    455    456    Ljava/util/ConcurrentModificationException;
        //  455    462    462    463    Ljava/lang/NullPointerException;
        //  559    566    566    567    Any
        //  559    566    559    560    Ljava/lang/IndexOutOfBoundsException;
        //  559    566    559    560    Ljava/lang/NegativeArraySizeException;
        //  560    566    559    560    Any
        //  560    566    566    567    Ljava/lang/IllegalStateException;
        //  627    634    634    635    Any
        //  628    634    627    628    Any
        //  627    634    3      8      Any
        //  628    634    3      8      Ljava/lang/UnsupportedOperationException;
        //  628    634    627    628    Any
        //  639    645    645    646    Any
        //  639    645    3      8      Any
        //  639    645    3      8      Ljava/lang/IllegalStateException;
        //  639    645    645    646    Any
        //  639    645    3      8      Ljava/lang/ClassCastException;
        //  993    1000   1000   1001   Any
        //  993    1000   993    994    Any
        //  993    1000   3      8      Any
        //  994    1000   1000   1001   Any
        //  994    1000   1000   1001   Ljava/lang/IllegalArgumentException;
        //  1055   1062   1062   1063   Any
        //  1055   1062   1062   1063   Ljava/lang/ArithmeticException;
        //  1055   1062   1062   1063   Any
        //  1056   1062   1055   1056   Any
        //  1056   1062   1055   1056   Any
        //  1117   1124   1124   1125   Any
        //  1117   1124   1124   1125   Ljava/lang/IllegalArgumentException;
        //  1118   1124   1124   1125   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1118   1124   1124   1125   Any
        //  1118   1124   1117   1118   Any
        //  1303   1310   1310   1311   Any
        //  1304   1310   1310   1311   Any
        //  1304   1310   1303   1304   Any
        //  1304   1310   3      8      Ljava/lang/IllegalArgumentException;
        //  1303   1310   1303   1304   Ljava/lang/RuntimeException;
        //  1314   1321   1321   1322   Any
        //  1314   1321   1321   1322   Ljava/lang/ClassCastException;
        //  1314   1321   1314   1315   Ljava/lang/EnumConstantNotPresentException;
        //  1315   1321   1314   1315   Any
        //  1315   1321   1314   1315   Ljava/lang/IllegalArgumentException;
        //  1376   1383   1383   1384   Any
        //  1376   1383   1376   1377   Ljava/lang/EnumConstantNotPresentException;
        //  1377   1383   1376   1377   Any
        //  1376   1383   1383   1384   Any
        //  1376   1383   1376   1377   Any
        //  1448   1455   1455   1456   Any
        //  1449   1455   1455   1456   Any
        //  1449   1455   3      8      Ljava/util/ConcurrentModificationException;
        //  1449   1455   1455   1456   Any
        //  1448   1455   1448   1449   Any
        //  1504   1510   1510   1511   Any
        //  1504   1510   3      8      Any
        //  1504   1510   1510   1511   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1504   1510   3      8      Any
        //  1504   1510   1510   1511   Any
        //  1575   1582   1582   1583   Any
        //  1576   1582   1575   1576   Ljava/lang/RuntimeException;
        //  1576   1582   1582   1583   Ljava/lang/EnumConstantNotPresentException;
        //  1576   1582   1575   1576   Ljava/lang/ClassCastException;
        //  1575   1582   1582   1583   Any
        //  1779   1786   1786   1787   Any
        //  1779   1786   1786   1787   Any
        //  1779   1786   1779   1780   Any
        //  1780   1786   3      8      Any
        //  1780   1786   1786   1787   Any
        //  1801   1808   1808   1809   Any
        //  1802   1808   3      8      Any
        //  1801   1808   3      8      Ljava/lang/AssertionError;
        //  1802   1808   1801   1802   Any
        //  1801   1808   1808   1809   Any
        //  1812   1819   1819   1820   Any
        //  1812   1819   3      8      Ljava/util/NoSuchElementException;
        //  1813   1819   1812   1813   Any
        //  1812   1819   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1812   1819   1819   1820   Any
        //  1875   1882   1882   1883   Any
        //  1876   1882   3      8      Ljava/lang/RuntimeException;
        //  1876   1882   1882   1883   Any
        //  1875   1882   1875   1876   Ljava/lang/RuntimeException;
        //  1876   1882   1882   1883   Any
        //  1935   1942   1942   1943   Any
        //  1935   1942   3      8      Any
        //  1935   1942   1935   1936   Any
        //  1936   1942   1942   1943   Any
        //  1936   1942   1942   1943   Ljava/lang/IllegalArgumentException;
        //  1946   1953   1953   1954   Any
        //  1947   1953   3      8      Any
        //  1947   1953   1946   1947   Ljava/lang/NullPointerException;
        //  1946   1953   3      8      Any
        //  1946   1953   1946   1947   Any
        //  1960   1966   1966   1967   Any
        //  1960   1966   1966   1967   Ljava/util/ConcurrentModificationException;
        //  1960   1966   3      8      Ljava/lang/NumberFormatException;
        //  1960   1966   3      8      Ljava/lang/IllegalArgumentException;
        //  1960   1966   3      8      Any
        //  1970   1977   1977   1978   Any
        //  1970   1977   1970   1971   Ljava/util/ConcurrentModificationException;
        //  1971   1977   1977   1978   Any
        //  1970   1977   1977   1978   Any
        //  1970   1977   3      8      Ljava/lang/ArithmeticException;
        //  2027   2034   2034   2035   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2027   2028   Any
        //  2028   2034   2034   2035   Any
        //  2085   2092   2092   2093   Any
        //  2085   2092   2085   2086   Any
        //  2086   2092   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2085   2092   2092   2093   Any
        //  2085   2092   2092   2093   Any
        //  2263   2270   2270   2271   Any
        //  2264   2270   2270   2271   Any
        //  2263   2270   3      8      Ljava/lang/RuntimeException;
        //  2263   2270   2263   2264   Any
        //  2264   2270   3      8      Ljava/util/ConcurrentModificationException;
        //  2376   2383   2383   2384   Any
        //  2376   2383   2376   2377   Any
        //  2376   2383   3      8      Any
        //  2377   2383   2383   2384   Ljava/lang/NullPointerException;
        //  2376   2383   3      8      Ljava/lang/IllegalStateException;
        //  2493   2500   2500   2501   Any
        //  2493   2500   2493   2494   Any
        //  2494   2500   3      8      Any
        //  2493   2500   3      8      Any
        //  2494   2500   2493   2494   Any
        //  2554   2560   2560   2561   Any
        //  2554   2560   3      8      Any
        //  2554   2560   3      8      Any
        //  2554   2560   2560   2561   Ljava/lang/NullPointerException;
        //  2554   2560   2560   2561   Ljava/lang/IllegalStateException;
        //  2578   2585   2585   2586   Any
        //  2579   2585   2585   2586   Any
        //  2579   2585   2585   2586   Any
        //  2578   2585   2578   2579   Any
        //  2579   2585   2585   2586   Ljava/lang/RuntimeException;
        //  2647   2654   2654   2655   Any
        //  2647   2654   2647   2648   Any
        //  2648   2654   2647   2648   Ljava/lang/ArithmeticException;
        //  2648   2654   2647   2648   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2647   2654   2647   2648   Ljava/lang/UnsupportedOperationException;
        //  2703   2710   2710   2711   Any
        //  2703   2710   2703   2704   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2704   2710   2710   2711   Ljava/lang/ClassCastException;
        //  2703   2710   2703   2704   Any
        //  2703   2710   2703   2704   Any
        //  2714   2721   2721   2722   Any
        //  2715   2721   2721   2722   Ljava/lang/UnsupportedOperationException;
        //  2715   2721   2721   2722   Ljava/lang/ClassCastException;
        //  2715   2721   2714   2715   Any
        //  2715   2721   2721   2722   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:586)
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
    
    public static fbw c(final BlockPos p0, final float p1, final boolean p2, final boolean p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          207
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            199
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            191
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -1551702270
        //    33: goto            39
        //    36: ldc_w           -928637968
        //    39: ldc_w           884723177
        //    42: ixor           
        //    43: lookupswitch {
        //          -1757861141: 176
        //          -711125306: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: fload_1        
        //    70: iload_2        
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            83
        //    77: ldc_w           1410808610
        //    80: goto            86
        //    83: ldc_w           2044971671
        //    86: ldc_w           -1703713895
        //    89: ixor           
        //    90: lookupswitch {
        //          -832284485: 83
        //          -477058802: 116
        //          default: 180
        //        }
        //   116: iload_3        
        //   117: iload           4
        //   119: iconst_0       
        //   120: getstatic       dev/nuker/pyro/fc.0:I
        //   123: ifeq            132
        //   126: ldc_w           353990962
        //   129: goto            135
        //   132: ldc_w           -478798146
        //   135: ldc_w           -1389784206
        //   138: ixor           
        //   139: lookupswitch {
        //          -1204753856: 178
        //          -1063521104: 132
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZZZZ)Ldev/nuker/pyro/fbw;
        //   171: goto            175
        //   174: athrow         
        //   175: areturn        
        //   176: aconst_null    
        //   177: athrow         
        //   178: aconst_null    
        //   179: athrow         
        //   180: aconst_null    
        //   181: athrow         
        //   182: pop            
        //   183: goto            24
        //   186: pop            
        //   187: aconst_null    
        //   188: goto            182
        //   191: dup            
        //   192: ifnull          182
        //   195: checkcast       Ljava/lang/Throwable;
        //   198: athrow         
        //   199: dup            
        //   200: ifnull          186
        //   203: checkcast       Ljava/lang/Throwable;
        //   206: athrow         
        //   207: aconst_null    
        //   208: athrow         
        //    StackMapTable: 00 19 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 05 07 00 80 02 01 01 01 00 00 0B 42 01 1C FF 00 0E 00 05 07 00 80 02 01 01 01 00 03 07 00 80 02 01 FF 00 02 00 05 07 00 80 02 01 01 01 00 04 07 00 80 02 01 01 FF 00 1D 00 05 07 00 80 02 01 01 01 00 03 07 00 80 02 01 FF 00 0F 00 05 07 00 80 02 01 01 01 00 06 07 00 80 02 01 01 01 01 FF 00 02 00 05 07 00 80 02 01 01 01 00 07 07 00 80 02 01 01 01 01 01 FF 00 1C 00 05 07 00 80 02 01 01 01 00 06 07 00 80 02 01 01 01 01 42 07 00 27 FF 00 00 00 05 07 00 80 02 01 01 01 00 06 07 00 80 02 01 01 01 01 45 07 00 27 40 07 02 46 00 FF 00 01 00 05 07 00 80 02 01 01 01 00 06 07 00 80 02 01 01 01 01 FF 00 01 00 05 07 00 80 02 01 01 01 00 03 07 00 80 02 01 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     191    199    Any
        //  191    199    191    199    Any
        //  207    209    3      8      Any
        //  167    174    174    175    Any
        //  168    174    174    175    Any
        //  168    174    3      8      Ljava/lang/NegativeArraySizeException;
        //  167    174    167    168    Ljava/util/ConcurrentModificationException;
        //  168    174    167    168    Any
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
    
    public static EnumActionResult c(final EntityPlayerSP p0, final WorldClient p1, final BlockPos p2, final EnumFacing p3, final Vec3d p4, final EnumHand p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4752
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            4744
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4736
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           1250191933
        //    33: goto            39
        //    36: ldc_w           1843789847
        //    39: ldc_w           -572432567
        //    42: ixor           
        //    43: lookupswitch {
        //          -2074487856: 36
        //          -1754974860: 4603
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //    71: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //    74: goto            78
        //    77: athrow         
        //    78: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //    81: goto            85
        //    84: athrow         
        //    85: getstatic       dev/nuker/pyro/fc.0:I
        //    88: ifeq            97
        //    91: ldc_w           -764553215
        //    94: goto            100
        //    97: ldc_w           1699273743
        //   100: ldc_w           135392306
        //   103: ixor           
        //   104: lookupswitch {
        //          -629394381: 4663
        //          1524344439: 97
        //          default: 132
        //        }
        //   132: aload_0        
        //   133: aload           5
        //   135: goto            139
        //   138: athrow         
        //   139: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   142: goto            146
        //   145: athrow         
        //   146: astore          6
        //   148: getstatic       dev/nuker/pyro/fc.1:I
        //   151: ifeq            160
        //   154: ldc_w           -1207519777
        //   157: goto            163
        //   160: ldc_w           -1788931282
        //   163: ldc_w           -1159645731
        //   166: ixor           
        //   167: lookupswitch {
        //          48726018: 160
        //          800990963: 192
        //          default: 4659
        //        }
        //   192: aload           4
        //   194: getstatic       dev/nuker/pyro/fc.0:I
        //   197: ifeq            206
        //   200: ldc_w           1342073500
        //   203: goto            209
        //   206: ldc_w           15024150
        //   209: ldc_w           -451048187
        //   212: ixor           
        //   213: lookupswitch {
        //          -1427904615: 206
        //          -436679405: 240
        //          default: 4709
        //        }
        //   240: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   243: aload_2        
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   251: goto            255
        //   254: athrow         
        //   255: i2d            
        //   256: dsub           
        //   257: d2f            
        //   258: fstore          7
        //   260: getstatic       dev/nuker/pyro/fc.0:I
        //   263: ifeq            272
        //   266: ldc_w           2125604339
        //   269: goto            275
        //   272: ldc_w           -1182067615
        //   275: ldc_w           -1893847483
        //   278: ixor           
        //   279: lookupswitch {
        //          -240383050: 4699
        //          1046865561: 272
        //          default: 304
        //        }
        //   304: aload           4
        //   306: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   309: getstatic       dev/nuker/pyro/fc.1:I
        //   312: ifeq            321
        //   315: ldc_w           -1110155312
        //   318: goto            324
        //   321: ldc_w           -25607930
        //   324: ldc_w           79407238
        //   327: ixor           
        //   328: lookupswitch {
        //          -1183844522: 4679
        //          1246322723: 321
        //          default: 356
        //        }
        //   356: aload_2        
        //   357: getstatic       dev/nuker/pyro/fc.0:I
        //   360: ifeq            369
        //   363: ldc_w           925500283
        //   366: goto            372
        //   369: ldc_w           -232921254
        //   372: ldc_w           -1971105608
        //   375: ixor           
        //   376: lookupswitch {
        //          -1112976445: 4701
        //          1212029443: 369
        //          default: 404
        //        }
        //   404: goto            408
        //   407: athrow         
        //   408: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   411: goto            415
        //   414: athrow         
        //   415: i2d            
        //   416: dsub           
        //   417: d2f            
        //   418: fstore          8
        //   420: aload           4
        //   422: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   425: aload_2        
        //   426: getstatic       dev/nuker/pyro/fc.1:I
        //   429: ifeq            438
        //   432: ldc_w           -1084350382
        //   435: goto            441
        //   438: ldc_w           -2049048800
        //   441: ldc_w           -806273146
        //   444: ixor           
        //   445: lookupswitch {
        //          1244446886: 472
        //          1890525140: 438
        //          default: 4693
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   479: goto            483
        //   482: athrow         
        //   483: i2d            
        //   484: dsub           
        //   485: d2f            
        //   486: getstatic       dev/nuker/pyro/fc.0:I
        //   489: ifeq            498
        //   492: ldc_w           2088596934
        //   495: goto            501
        //   498: ldc_w           1412528317
        //   501: ldc_w           -228110713
        //   504: ixor           
        //   505: lookupswitch {
        //          -1910883519: 4669
        //          1399935750: 498
        //          default: 532
        //        }
        //   532: fstore          9
        //   534: iconst_0       
        //   535: istore          10
        //   537: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   540: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   543: goto            547
        //   546: athrow         
        //   547: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175723_af:()Lnet/minecraft/world/border/WorldBorder;
        //   550: goto            554
        //   553: athrow         
        //   554: getstatic       dev/nuker/pyro/fc.1:I
        //   557: ifeq            566
        //   560: ldc_w           1424060410
        //   563: goto            569
        //   566: ldc_w           2113570376
        //   569: ldc_w           1785082956
        //   572: ixor           
        //   573: lookupswitch {
        //          396145156: 600
        //          1049058230: 566
        //          default: 4673
        //        }
        //   600: aload_2        
        //   601: goto            605
        //   604: athrow         
        //   605: invokevirtual   net/minecraft/world/border/WorldBorder.func_177746_a:(Lnet/minecraft/util/math/BlockPos;)Z
        //   608: goto            612
        //   611: athrow         
        //   612: ifne            619
        //   615: getstatic       net/minecraft/util/EnumActionResult.FAIL:Lnet/minecraft/util/EnumActionResult;
        //   618: areturn        
        //   619: getstatic       dev/nuker/pyro/fc.c:I
        //   622: ifge            631
        //   625: ldc_w           1754680131
        //   628: goto            634
        //   631: ldc_w           -1233528051
        //   634: ldc_w           1303771821
        //   637: ixor           
        //   638: lookupswitch {
        //          -1373749229: 631
        //          623096302: 4587
        //          default: 664
        //        }
        //   664: aload_0        
        //   665: aload           5
        //   667: aload_2        
        //   668: aload_3        
        //   669: aload_0        
        //   670: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   673: getstatic       dev/nuker/pyro/fc.1:I
        //   676: ifeq            685
        //   679: ldc_w           1259016926
        //   682: goto            688
        //   685: ldc_w           -520468995
        //   688: ldc_w           -1429378684
        //   691: ixor           
        //   692: lookupswitch {
        //          -540476306: 685
        //          -507085990: 4667
        //          default: 720
        //        }
        //   720: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   723: goto            727
        //   726: athrow         
        //   727: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78757_d:()F
        //   730: goto            734
        //   733: athrow         
        //   734: fconst_1       
        //   735: fadd           
        //   736: f2d            
        //   737: goto            741
        //   740: athrow         
        //   741: invokestatic    net/minecraftforge/common/ForgeHooks.rayTraceEyeHitVec:(Lnet/minecraft/entity/EntityLivingBase;D)Lnet/minecraft/util/math/Vec3d;
        //   744: goto            748
        //   747: athrow         
        //   748: goto            752
        //   751: athrow         
        //   752: invokestatic    net/minecraftforge/common/ForgeHooks.onRightClickBlock:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock;
        //   755: goto            759
        //   758: athrow         
        //   759: getstatic       dev/nuker/pyro/fc.c:I
        //   762: ifge            771
        //   765: ldc_w           1919013328
        //   768: goto            774
        //   771: ldc_w           -43972791
        //   774: ldc_w           -440860480
        //   777: ixor           
        //   778: lookupswitch {
        //          -1747398384: 4721
        //          1055765507: 771
        //          default: 804
        //        }
        //   804: astore          11
        //   806: aload           11
        //   808: getstatic       dev/nuker/pyro/fc.1:I
        //   811: ifeq            820
        //   814: ldc_w           -1940706853
        //   817: goto            823
        //   820: ldc_w           -1391559
        //   823: ldc_w           801716962
        //   826: ixor           
        //   827: lookupswitch {
        //          -1827095342: 820
        //          -1550183623: 4583
        //          default: 852
        //        }
        //   852: goto            856
        //   855: athrow         
        //   856: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.isCanceled:()Z
        //   859: goto            863
        //   862: athrow         
        //   863: ifeq            1064
        //   866: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   869: goto            873
        //   872: athrow         
        //   873: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   876: goto            880
        //   879: athrow         
        //   880: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //   883: dup            
        //   884: aload_2        
        //   885: aload_3        
        //   886: aload           5
        //   888: getstatic       dev/nuker/pyro/fc.c:I
        //   891: ifge            900
        //   894: ldc_w           -1121864805
        //   897: goto            903
        //   900: ldc_w           -1270379742
        //   903: ldc_w           1984234522
        //   906: ixor           
        //   907: lookupswitch {
        //          -1185872170: 900
        //          -882591871: 4613
        //          default: 932
        //        }
        //   932: fload           7
        //   934: fload           8
        //   936: fload           9
        //   938: getstatic       dev/nuker/pyro/fc.c:I
        //   941: ifge            950
        //   944: ldc_w           -1929201229
        //   947: goto            953
        //   950: ldc_w           1725355610
        //   953: ldc_w           -577375735
        //   956: ixor           
        //   957: lookupswitch {
        //          -1153227693: 984
        //          1352092602: 950
        //          default: 4653
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //   991: goto            995
        //   994: athrow         
        //   995: goto            999
        //   998: athrow         
        //   999: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1002: goto            1006
        //  1005: athrow         
        //  1006: aload           11
        //  1008: getstatic       dev/nuker/pyro/fc.1:I
        //  1011: ifeq            1020
        //  1014: ldc_w           515997046
        //  1017: goto            1023
        //  1020: ldc_w           76481711
        //  1023: ldc_w           -312236603
        //  1026: ixor           
        //  1027: lookupswitch {
        //          -207431501: 4643
        //          523884113: 1020
        //          default: 1052
        //        }
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getCancellationResult:()Lnet/minecraft/util/EnumActionResult;
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: areturn        
        //  1064: getstatic       net/minecraft/util/EnumActionResult.PASS:Lnet/minecraft/util/EnumActionResult;
        //  1067: astore          12
        //  1069: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1072: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_178889_l:()Lnet/minecraft/world/GameType;
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: getstatic       dev/nuker/pyro/fc.0:I
        //  1089: ifeq            1098
        //  1092: ldc_w           1303707422
        //  1095: goto            1101
        //  1098: ldc_w           235163800
        //  1101: ldc_w           -781236127
        //  1104: ixor           
        //  1105: lookupswitch {
        //          -1663322241: 4711
        //          -1458971589: 1098
        //          default: 1132
        //        }
        //  1132: getstatic       net/minecraft/world/GameType.SPECTATOR:Lnet/minecraft/world/GameType;
        //  1135: if_acmpeq       2710
        //  1138: aload           6
        //  1140: aload_0        
        //  1141: aload_1        
        //  1142: aload_2        
        //  1143: aload           5
        //  1145: aload_3        
        //  1146: fload           7
        //  1148: getstatic       dev/nuker/pyro/fc.c:I
        //  1151: ifge            1160
        //  1154: ldc_w           2042180671
        //  1157: goto            1163
        //  1160: ldc_w           -569492934
        //  1163: ldc_w           -1450679386
        //  1166: ixor           
        //  1167: lookupswitch {
        //          -802072679: 1160
        //          2005293468: 1192
        //          default: 4675
        //        }
        //  1192: fload           8
        //  1194: fload           9
        //  1196: goto            1200
        //  1199: athrow         
        //  1200: invokevirtual   net/minecraft/item/ItemStack.onItemUseFirst:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;
        //  1203: goto            1207
        //  1206: athrow         
        //  1207: astore          13
        //  1209: getstatic       dev/nuker/pyro/fc.1:I
        //  1212: ifeq            1221
        //  1215: ldc_w           -1751441508
        //  1218: goto            1224
        //  1221: ldc_w           273377681
        //  1224: ldc_w           -1532648643
        //  1227: ixor           
        //  1228: lookupswitch {
        //          -1259418964: 1256
        //          859749537: 1221
        //          default: 4619
        //        }
        //  1256: aload           13
        //  1258: getstatic       net/minecraft/util/EnumActionResult.PASS:Lnet/minecraft/util/EnumActionResult;
        //  1261: if_acmpeq       1543
        //  1264: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1267: getstatic       dev/nuker/pyro/fc.0:I
        //  1270: ifeq            1279
        //  1273: ldc_w           -1266553289
        //  1276: goto            1282
        //  1279: ldc_w           103214392
        //  1282: ldc_w           1816806517
        //  1285: ixor           
        //  1286: lookupswitch {
        //          -657741246: 4595
        //          480361171: 1279
        //          default: 1312
        //        }
        //  1312: goto            1316
        //  1315: athrow         
        //  1316: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1319: goto            1323
        //  1322: athrow         
        //  1323: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //  1326: dup            
        //  1327: aload_2        
        //  1328: getstatic       dev/nuker/pyro/fc.c:I
        //  1331: ifge            1340
        //  1334: ldc_w           731955282
        //  1337: goto            1343
        //  1340: ldc_w           -504827652
        //  1343: ldc_w           -1803128050
        //  1346: ixor           
        //  1347: lookupswitch {
        //          -1087982756: 1340
        //          1970177010: 1372
        //          default: 4715
        //        }
        //  1372: aload_3        
        //  1373: aload           5
        //  1375: fload           7
        //  1377: fload           8
        //  1379: fload           9
        //  1381: getstatic       dev/nuker/pyro/fc.0:I
        //  1384: ifeq            1393
        //  1387: ldc_w           -1751245109
        //  1390: goto            1396
        //  1393: ldc_w           -33227007
        //  1396: ldc_w           81729162
        //  1399: ixor           
        //  1400: lookupswitch {
        //          -1824454591: 4717
        //          -123548040: 1393
        //          default: 1428
        //        }
        //  1428: goto            1432
        //  1431: athrow         
        //  1432: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //  1435: goto            1439
        //  1438: athrow         
        //  1439: getstatic       dev/nuker/pyro/fc.0:I
        //  1442: ifeq            1451
        //  1445: ldc_w           -1027889707
        //  1448: goto            1454
        //  1451: ldc_w           -541370911
        //  1454: ldc_w           398442041
        //  1457: ixor           
        //  1458: lookupswitch {
        //          -939201576: 1484
        //          -721150996: 1451
        //          default: 4665
        //        }
        //  1484: goto            1488
        //  1487: athrow         
        //  1488: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1491: goto            1495
        //  1494: athrow         
        //  1495: getstatic       dev/nuker/pyro/fc.0:I
        //  1498: ifeq            1507
        //  1501: ldc_w           -1827253740
        //  1504: goto            1510
        //  1507: ldc_w           -164676598
        //  1510: ldc_w           1293739858
        //  1513: ixor           
        //  1514: lookupswitch {
        //          -1154229416: 1540
        //          -569723578: 1507
        //          default: 4599
        //        }
        //  1540: aload           13
        //  1542: areturn        
        //  1543: aload_1        
        //  1544: aload_2        
        //  1545: goto            1549
        //  1548: athrow         
        //  1549: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1552: goto            1556
        //  1555: athrow         
        //  1556: astore          14
        //  1558: aload_0        
        //  1559: goto            1563
        //  1562: athrow         
        //  1563: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  1566: goto            1570
        //  1569: athrow         
        //  1570: getstatic       dev/nuker/pyro/fc.1:I
        //  1573: ifeq            1582
        //  1576: ldc_w           -1344154290
        //  1579: goto            1585
        //  1582: ldc_w           -186649769
        //  1585: ldc_w           -1410621450
        //  1588: ixor           
        //  1589: lookupswitch {
        //          67783352: 1582
        //          1597271201: 1616
        //          default: 4625
        //        }
        //  1616: aload_1        
        //  1617: getstatic       dev/nuker/pyro/fc.0:I
        //  1620: ifeq            1629
        //  1623: ldc_w           424389161
        //  1626: goto            1632
        //  1629: ldc_w           767328526
        //  1632: ldc_w           218883493
        //  1635: ixor           
        //  1636: lookupswitch {
        //          339758988: 1629
        //          548889771: 1664
        //          default: 4657
        //        }
        //  1664: aload_2        
        //  1665: getstatic       dev/nuker/pyro/fc.1:I
        //  1668: ifeq            1677
        //  1671: ldc_w           -132858843
        //  1674: goto            1680
        //  1677: ldc_w           -1442680825
        //  1680: ldc_w           1998159884
        //  1683: ixor           
        //  1684: lookupswitch {
        //          -1894958039: 1677
        //          -585371637: 1712
        //          default: 4609
        //        }
        //  1712: aload_0        
        //  1713: getstatic       dev/nuker/pyro/fc.1:I
        //  1716: ifeq            1725
        //  1719: ldc_w           838937221
        //  1722: goto            1728
        //  1725: ldc_w           -489765330
        //  1728: ldc_w           -213605568
        //  1731: ixor           
        //  1732: lookupswitch {
        //          -1052407355: 4647
        //          1300221656: 1725
        //          default: 1760
        //        }
        //  1760: goto            1764
        //  1763: athrow         
        //  1764: invokevirtual   net/minecraft/item/ItemStack.doesSneakBypassUse:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  1767: goto            1771
        //  1770: athrow         
        //  1771: ifeq            1897
        //  1774: getstatic       dev/nuker/pyro/fc.1:I
        //  1777: ifeq            1786
        //  1780: ldc_w           -1943286852
        //  1783: goto            1789
        //  1786: ldc_w           562416078
        //  1789: ldc_w           -2118726872
        //  1792: ixor           
        //  1793: lookupswitch {
        //          -1510725343: 1786
        //          228393108: 4631
        //          default: 1820
        //        }
        //  1820: aload_0        
        //  1821: goto            1825
        //  1824: athrow         
        //  1825: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184592_cb:()Lnet/minecraft/item/ItemStack;
        //  1828: goto            1832
        //  1831: athrow         
        //  1832: getstatic       dev/nuker/pyro/fc.1:I
        //  1835: ifeq            1844
        //  1838: ldc_w           1254960904
        //  1841: goto            1847
        //  1844: ldc_w           -1230845570
        //  1847: ldc_w           -874715244
        //  1850: ixor           
        //  1851: lookupswitch {
        //          -2129540964: 4621
        //          -1453279676: 1844
        //          default: 1876
        //        }
        //  1876: aload_1        
        //  1877: aload_2        
        //  1878: aload_0        
        //  1879: goto            1883
        //  1882: athrow         
        //  1883: invokevirtual   net/minecraft/item/ItemStack.doesSneakBypassUse:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  1886: goto            1890
        //  1889: athrow         
        //  1890: ifeq            1897
        //  1893: iconst_1       
        //  1894: goto            1898
        //  1897: iconst_0       
        //  1898: getstatic       dev/nuker/pyro/fc.0:I
        //  1901: ifeq            1910
        //  1904: ldc_w           -1006885239
        //  1907: goto            1913
        //  1910: ldc_w           486949901
        //  1913: ldc_w           2086653388
        //  1916: ixor           
        //  1917: lookupswitch {
        //          -1079776443: 1910
        //          1633257921: 1944
        //          default: 4683
        //        }
        //  1944: istore          15
        //  1946: aload_0        
        //  1947: getstatic       dev/nuker/pyro/fc.0:I
        //  1950: ifeq            1959
        //  1953: ldc_w           -1540825523
        //  1956: goto            1962
        //  1959: ldc_w           -1053147006
        //  1962: ldc_w           1460449802
        //  1965: ixor           
        //  1966: lookupswitch {
        //          -1165181604: 1959
        //          -215716793: 4681
        //          default: 1992
        //        }
        //  1992: goto            1996
        //  1995: athrow         
        //  1996: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //  1999: goto            2003
        //  2002: athrow         
        //  2003: ifeq            2074
        //  2006: iload           15
        //  2008: ifne            2074
        //  2011: aload           11
        //  2013: goto            2017
        //  2016: athrow         
        //  2017: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getUseBlock:()Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  2020: goto            2024
        //  2023: athrow         
        //  2024: getstatic       dev/nuker/pyro/fc.1:I
        //  2027: ifeq            2036
        //  2030: ldc_w           -2029732612
        //  2033: goto            2039
        //  2036: ldc_w           -1818360218
        //  2039: ldc_w           -903875835
        //  2042: ixor           
        //  2043: lookupswitch {
        //          711443632: 2036
        //          1293635577: 4615
        //          default: 2068
        //        }
        //  2068: getstatic       net/minecraftforge/fml/common/eventhandler/Event$Result.ALLOW:Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  2071: if_acmpne       2365
        //  2074: aload           11
        //  2076: goto            2080
        //  2079: athrow         
        //  2080: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getUseBlock:()Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  2083: goto            2087
        //  2086: athrow         
        //  2087: getstatic       net/minecraftforge/fml/common/eventhandler/Event$Result.DENY:Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  2090: if_acmpeq       2275
        //  2093: aload           14
        //  2095: goto            2099
        //  2098: athrow         
        //  2099: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  2104: goto            2108
        //  2107: athrow         
        //  2108: aload_1        
        //  2109: getstatic       dev/nuker/pyro/fc.1:I
        //  2112: ifeq            2121
        //  2115: ldc_w           1112587333
        //  2118: goto            2124
        //  2121: ldc_w           -747566570
        //  2124: ldc_w           992517148
        //  2127: ixor           
        //  2128: lookupswitch {
        //          -1382172184: 2121
        //          2037915737: 4689
        //          default: 2156
        //        }
        //  2156: aload_2        
        //  2157: getstatic       dev/nuker/pyro/fc.1:I
        //  2160: ifeq            2169
        //  2163: ldc_w           -35654302
        //  2166: goto            2172
        //  2169: ldc_w           2015695845
        //  2172: ldc_w           -1382553239
        //  2175: ixor           
        //  2176: lookupswitch {
        //          926066171: 2169
        //          1346903051: 4655
        //          default: 2204
        //        }
        //  2204: aload           14
        //  2206: getstatic       dev/nuker/pyro/fc.0:I
        //  2209: ifeq            2218
        //  2212: ldc_w           100426844
        //  2215: goto            2221
        //  2218: ldc_w           -1814801050
        //  2221: ldc_w           -1965987676
        //  2224: ixor           
        //  2225: lookupswitch {
        //          -1892872968: 2218
        //          419773890: 2252
        //          default: 4611
        //        }
        //  2252: aload_0        
        //  2253: aload           5
        //  2255: aload_3        
        //  2256: fload           7
        //  2258: fload           8
        //  2260: fload           9
        //  2262: goto            2266
        //  2265: athrow         
        //  2266: invokevirtual   net/minecraft/block/Block.func_180639_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z
        //  2269: goto            2273
        //  2272: athrow         
        //  2273: istore          10
        //  2275: getstatic       dev/nuker/pyro/fc.1:I
        //  2278: ifeq            2287
        //  2281: ldc_w           -1104207762
        //  2284: goto            2290
        //  2287: ldc_w           -1349430128
        //  2290: ldc_w           -331720739
        //  2293: ixor           
        //  2294: lookupswitch {
        //          1135280973: 2320
        //          1377138611: 2287
        //          default: 4703
        //        }
        //  2320: iload           10
        //  2322: ifeq            2331
        //  2325: ldc_w           829647800
        //  2328: goto            2334
        //  2331: ldc_w           829647783
        //  2334: ldc_w           -1446060297
        //  2337: ixor           
        //  2338: tableswitch {
        //          830171806: 2360
        //          830171807: 2365
        //          default: 2325
        //        }
        //  2360: getstatic       net/minecraft/util/EnumActionResult.SUCCESS:Lnet/minecraft/util/EnumActionResult;
        //  2363: astore          12
        //  2365: iload           10
        //  2367: ifne            2710
        //  2370: aload           6
        //  2372: goto            2376
        //  2375: athrow         
        //  2376: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2379: goto            2383
        //  2382: athrow         
        //  2383: instanceof      Lnet/minecraft/item/ItemBlock;
        //  2386: ifeq            2710
        //  2389: getstatic       dev/nuker/pyro/fc.c:I
        //  2392: ifge            2401
        //  2395: ldc_w           -2102691371
        //  2398: goto            2404
        //  2401: ldc_w           988811554
        //  2404: ldc_w           -884623087
        //  2407: ixor           
        //  2408: lookupswitch {
        //          831682671: 2401
        //          1240383684: 4591
        //          default: 2436
        //        }
        //  2436: aload           6
        //  2438: getstatic       dev/nuker/pyro/fc.1:I
        //  2441: ifeq            2450
        //  2444: ldc_w           -126280007
        //  2447: goto            2453
        //  2450: ldc_w           -1879206037
        //  2453: ldc_w           -279471191
        //  2456: ixor           
        //  2457: lookupswitch {
        //          388924688: 2450
        //          1621757122: 2484
        //          default: 4671
        //        }
        //  2484: goto            2488
        //  2487: athrow         
        //  2488: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2491: goto            2495
        //  2494: athrow         
        //  2495: checkcast       Lnet/minecraft/item/ItemBlock;
        //  2498: getstatic       dev/nuker/pyro/fc.1:I
        //  2501: ifeq            2510
        //  2504: ldc_w           1243268740
        //  2507: goto            2513
        //  2510: ldc_w           -1050656658
        //  2513: ldc_w           1417432544
        //  2516: ixor           
        //  2517: lookupswitch {
        //          510036836: 4649
        //          1818365833: 2510
        //          default: 2544
        //        }
        //  2544: astore          16
        //  2546: aload           16
        //  2548: getstatic       dev/nuker/pyro/fc.1:I
        //  2551: ifeq            2560
        //  2554: ldc_w           328458046
        //  2557: goto            2563
        //  2560: ldc_w           -795579363
        //  2563: ldc_w           -1950048236
        //  2566: ixor           
        //  2567: lookupswitch {
        //          -1739096278: 4605
        //          750742274: 2560
        //          default: 2592
        //        }
        //  2592: aload_1        
        //  2593: getstatic       dev/nuker/pyro/fc.0:I
        //  2596: ifeq            2605
        //  2599: ldc_w           839218907
        //  2602: goto            2608
        //  2605: ldc_w           182464942
        //  2608: ldc_w           -439573290
        //  2611: ixor           
        //  2612: lookupswitch {
        //          -674639347: 4705
        //          2139721642: 2605
        //          default: 2640
        //        }
        //  2640: aload_2        
        //  2641: aload_3        
        //  2642: aload_0        
        //  2643: aload           6
        //  2645: getstatic       dev/nuker/pyro/fc.1:I
        //  2648: ifeq            2657
        //  2651: ldc_w           -1947852358
        //  2654: goto            2660
        //  2657: ldc_w           2022042428
        //  2660: ldc_w           482817026
        //  2663: ixor           
        //  2664: lookupswitch {
        //          -1759439432: 4633
        //          -1392164480: 2657
        //          default: 2692
        //        }
        //  2692: goto            2696
        //  2695: athrow         
        //  2696: invokevirtual   net/minecraft/item/ItemBlock.func_179222_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z
        //  2699: goto            2703
        //  2702: athrow         
        //  2703: ifne            2710
        //  2706: getstatic       net/minecraft/util/EnumActionResult.FAIL:Lnet/minecraft/util/EnumActionResult;
        //  2709: areturn        
        //  2710: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2713: goto            2717
        //  2716: athrow         
        //  2717: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2720: goto            2724
        //  2723: athrow         
        //  2724: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //  2727: dup            
        //  2728: aload_2        
        //  2729: aload_3        
        //  2730: aload           5
        //  2732: fload           7
        //  2734: getstatic       dev/nuker/pyro/fc.c:I
        //  2737: ifge            2746
        //  2740: ldc_w           -2133205486
        //  2743: goto            2749
        //  2746: ldc_w           -553443353
        //  2749: ldc_w           -1832420344
        //  2752: ixor           
        //  2753: lookupswitch {
        //          303997466: 2746
        //          1304716271: 2780
        //          default: 4685
        //        }
        //  2780: fload           8
        //  2782: fload           9
        //  2784: getstatic       dev/nuker/pyro/fc.c:I
        //  2787: ifge            2796
        //  2790: ldc_w           -911668555
        //  2793: goto            2799
        //  2796: ldc_w           1866566884
        //  2799: ldc_w           1430122125
        //  2802: ixor           
        //  2803: lookupswitch {
        //          -1667963848: 4635
        //          -1608944797: 2796
        //          default: 2828
        //        }
        //  2828: goto            2832
        //  2831: athrow         
        //  2832: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //  2835: goto            2839
        //  2838: athrow         
        //  2839: goto            2843
        //  2842: athrow         
        //  2843: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2846: goto            2850
        //  2849: athrow         
        //  2850: getstatic       dev/nuker/pyro/fc.c:I
        //  2853: ifge            2862
        //  2856: ldc_w           1420127318
        //  2859: goto            2865
        //  2862: ldc_w           1216439064
        //  2865: ldc_w           -362886102
        //  2868: ixor           
        //  2869: lookupswitch {
        //          -1562398926: 2896
        //          -1090805636: 2862
        //          default: 4637
        //        }
        //  2896: iload           10
        //  2898: ifne            3014
        //  2901: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2904: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  2907: getstatic       dev/nuker/pyro/fc.1:I
        //  2910: ifeq            2919
        //  2913: ldc_w           -1655388190
        //  2916: goto            2922
        //  2919: ldc_w           1048854079
        //  2922: ldc_w           -2077201195
        //  2925: ixor           
        //  2926: lookupswitch {
        //          -1162587414: 2952
        //          426027831: 2919
        //          default: 4719
        //        }
        //  2952: goto            2956
        //  2955: athrow         
        //  2956: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_178889_l:()Lnet/minecraft/world/GameType;
        //  2959: goto            2963
        //  2962: athrow         
        //  2963: getstatic       dev/nuker/pyro/fc.0:I
        //  2966: ifeq            2975
        //  2969: ldc_w           695708674
        //  2972: goto            2978
        //  2975: ldc_w           996944249
        //  2978: ldc_w           -1737668859
        //  2981: ixor           
        //  2982: lookupswitch {
        //          -1323635961: 4593
        //          867761161: 2975
        //          default: 3008
        //        }
        //  3008: getstatic       net/minecraft/world/GameType.SPECTATOR:Lnet/minecraft/world/GameType;
        //  3011: if_acmpne       3033
        //  3014: aload           11
        //  3016: goto            3020
        //  3019: athrow         
        //  3020: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getUseItem:()Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  3023: goto            3027
        //  3026: athrow         
        //  3027: getstatic       net/minecraftforge/fml/common/eventhandler/Event$Result.ALLOW:Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  3030: if_acmpne       4579
        //  3033: getstatic       dev/nuker/pyro/fc.c:I
        //  3036: ifge            3045
        //  3039: ldc_w           79183425
        //  3042: goto            3048
        //  3045: ldc_w           -1090816323
        //  3048: ldc_w           616046814
        //  3051: ixor           
        //  3052: lookupswitch {
        //          -1439066508: 3045
        //          536878751: 4713
        //          default: 3080
        //        }
        //  3080: aload           6
        //  3082: goto            3086
        //  3085: athrow         
        //  3086: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  3089: goto            3093
        //  3092: athrow         
        //  3093: ifeq            3102
        //  3096: ldc_w           170017119
        //  3099: goto            3105
        //  3102: ldc_w           170017116
        //  3105: ldc_w           636711534
        //  3108: ixor           
        //  3109: tableswitch {
        //          1604478562: 3132
        //          1604478563: 3180
        //          default: 3096
        //        }
        //  3132: getstatic       dev/nuker/pyro/fc.1:I
        //  3135: ifeq            3144
        //  3138: ldc_w           269535254
        //  3141: goto            3147
        //  3144: ldc_w           -112553498
        //  3147: ldc_w           -329311429
        //  3150: ixor           
        //  3151: lookupswitch {
        //          -61877459: 4707
        //          2090418472: 3144
        //          default: 3176
        //        }
        //  3176: getstatic       net/minecraft/util/EnumActionResult.PASS:Lnet/minecraft/util/EnumActionResult;
        //  3179: areturn        
        //  3180: getstatic       dev/nuker/pyro/fc.0:I
        //  3183: ifeq            3192
        //  3186: ldc_w           1682210038
        //  3189: goto            3195
        //  3192: ldc_w           -1434996113
        //  3195: ldc_w           -2059636276
        //  3198: ixor           
        //  3199: lookupswitch {
        //          -512225990: 3192
        //          793494435: 3224
        //          default: 4695
        //        }
        //  3224: aload_0        
        //  3225: goto            3229
        //  3228: athrow         
        //  3229: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184811_cZ:()Lnet/minecraft/util/CooldownTracker;
        //  3232: goto            3236
        //  3235: athrow         
        //  3236: aload           6
        //  3238: goto            3242
        //  3241: athrow         
        //  3242: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  3245: goto            3249
        //  3248: athrow         
        //  3249: getstatic       dev/nuker/pyro/fc.0:I
        //  3252: ifeq            3261
        //  3255: ldc_w           1112295019
        //  3258: goto            3264
        //  3261: ldc_w           575601588
        //  3264: ldc_w           1815144435
        //  3267: ixor           
        //  3268: lookupswitch {
        //          -1330580301: 3261
        //          779919768: 4589
        //          default: 3296
        //        }
        //  3296: goto            3300
        //  3299: athrow         
        //  3300: invokevirtual   net/minecraft/util/CooldownTracker.func_185141_a:(Lnet/minecraft/item/Item;)Z
        //  3303: goto            3307
        //  3306: athrow         
        //  3307: ifeq            3360
        //  3310: getstatic       dev/nuker/pyro/fc.0:I
        //  3313: ifeq            3322
        //  3316: ldc_w           -83382134
        //  3319: goto            3325
        //  3322: ldc_w           -556032476
        //  3325: ldc_w           -1374625117
        //  3328: ixor           
        //  3329: lookupswitch {
        //          1427591721: 3322
        //          1892383879: 3356
        //          default: 4597
        //        }
        //  3356: getstatic       net/minecraft/util/EnumActionResult.PASS:Lnet/minecraft/util/EnumActionResult;
        //  3359: areturn        
        //  3360: getstatic       dev/nuker/pyro/fc.0:I
        //  3363: ifeq            3372
        //  3366: ldc_w           532319703
        //  3369: goto            3375
        //  3372: ldc_w           1557395970
        //  3375: ldc_w           1916567376
        //  3378: ixor           
        //  3379: lookupswitch {
        //          787449170: 3404
        //          1837560455: 3372
        //          default: 4677
        //        }
        //  3404: aload           6
        //  3406: goto            3410
        //  3409: athrow         
        //  3410: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  3413: goto            3417
        //  3416: athrow         
        //  3417: instanceof      Lnet/minecraft/item/ItemBlock;
        //  3420: ifeq            3429
        //  3423: ldc_w           -1476268779
        //  3426: goto            3432
        //  3429: ldc_w           -1476268778
        //  3432: ldc_w           1451040668
        //  3435: ixor           
        //  3436: tableswitch {
        //          -50731758: 3460
        //          -50731757: 3696
        //          default: 3423
        //        }
        //  3460: getstatic       dev/nuker/pyro/fc.0:I
        //  3463: ifeq            3472
        //  3466: ldc_w           -1014277184
        //  3469: goto            3475
        //  3472: ldc_w           1210950622
        //  3475: ldc_w           -2098524287
        //  3478: ixor           
        //  3479: lookupswitch {
        //          -1532456438: 3472
        //          1096832065: 4585
        //          default: 3504
        //        }
        //  3504: aload_0        
        //  3505: getstatic       dev/nuker/pyro/fc.1:I
        //  3508: ifeq            3517
        //  3511: ldc_w           -1275573336
        //  3514: goto            3520
        //  3517: ldc_w           1380346376
        //  3520: ldc_w           1928119833
        //  3523: ixor           
        //  3524: lookupswitch {
        //          -1055617615: 3517
        //          548056081: 3552
        //          default: 4691
        //        }
        //  3552: goto            3556
        //  3555: athrow         
        //  3556: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_189808_dh:()Z
        //  3559: goto            3563
        //  3562: athrow         
        //  3563: ifne            3696
        //  3566: aload           6
        //  3568: goto            3572
        //  3571: athrow         
        //  3572: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  3575: goto            3579
        //  3578: athrow         
        //  3579: checkcast       Lnet/minecraft/item/ItemBlock;
        //  3582: goto            3586
        //  3585: athrow         
        //  3586: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //  3589: goto            3593
        //  3592: athrow         
        //  3593: astore          13
        //  3595: aload           13
        //  3597: instanceof      Lnet/minecraft/block/BlockCommandBlock;
        //  3600: ifne            3692
        //  3603: getstatic       dev/nuker/pyro/fc.1:I
        //  3606: ifeq            3615
        //  3609: ldc_w           1833154689
        //  3612: goto            3618
        //  3615: ldc_w           -953921315
        //  3618: ldc_w           -285237775
        //  3621: ixor           
        //  3622: lookupswitch {
        //          -2084821648: 3615
        //          702270764: 3648
        //          default: 4645
        //        }
        //  3648: aload           13
        //  3650: instanceof      Lnet/minecraft/block/BlockStructure;
        //  3653: ifeq            3662
        //  3656: ldc_w           1409897883
        //  3659: goto            3665
        //  3662: ldc_w           1409897882
        //  3665: ldc_w           2031090367
        //  3668: ixor           
        //  3669: tableswitch {
        //          1510825544: 3692
        //          1510825545: 3696
        //          default: 3656
        //        }
        //  3692: getstatic       net/minecraft/util/EnumActionResult.FAIL:Lnet/minecraft/util/EnumActionResult;
        //  3695: areturn        
        //  3696: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  3699: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  3702: goto            3706
        //  3705: athrow         
        //  3706: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_178889_l:()Lnet/minecraft/world/GameType;
        //  3709: goto            3713
        //  3712: athrow         
        //  3713: goto            3717
        //  3716: athrow         
        //  3717: invokevirtual   net/minecraft/world/GameType.func_77145_d:()Z
        //  3720: goto            3724
        //  3723: athrow         
        //  3724: ifeq            4116
        //  3727: aload           6
        //  3729: getstatic       dev/nuker/pyro/fc.0:I
        //  3732: ifeq            3741
        //  3735: ldc_w           -22883035
        //  3738: goto            3744
        //  3741: ldc_w           904228219
        //  3744: ldc_w           1005820938
        //  3747: ixor           
        //  3748: lookupswitch {
        //          -1182855190: 3741
        //          -984528593: 4607
        //          default: 3776
        //        }
        //  3776: goto            3780
        //  3779: athrow         
        //  3780: invokevirtual   net/minecraft/item/ItemStack.func_77960_j:()I
        //  3783: goto            3787
        //  3786: athrow         
        //  3787: istore          13
        //  3789: aload           6
        //  3791: goto            3795
        //  3794: athrow         
        //  3795: invokevirtual   net/minecraft/item/ItemStack.func_190916_E:()I
        //  3798: goto            3802
        //  3801: athrow         
        //  3802: getstatic       dev/nuker/pyro/fc.0:I
        //  3805: ifeq            3814
        //  3808: ldc_w           1600793452
        //  3811: goto            3817
        //  3814: ldc_w           1164499218
        //  3817: ldc_w           -1614211027
        //  3820: ixor           
        //  3821: lookupswitch {
        //          -1063046335: 3814
        //          -626933441: 3848
        //          default: 4687
        //        }
        //  3848: istore          14
        //  3850: aload           11
        //  3852: goto            3856
        //  3855: athrow         
        //  3856: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getUseItem:()Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  3859: goto            3863
        //  3862: athrow         
        //  3863: getstatic       dev/nuker/pyro/fc.0:I
        //  3866: ifeq            3875
        //  3869: ldc_w           534382630
        //  3872: goto            3878
        //  3875: ldc_w           1995837415
        //  3878: ldc_w           -812049428
        //  3881: ixor           
        //  3882: lookupswitch {
        //          -800910390: 4629
        //          -506720483: 3875
        //          default: 3908
        //        }
        //  3908: getstatic       net/minecraftforge/fml/common/eventhandler/Event$Result.DENY:Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  3911: if_acmpeq       4113
        //  3914: getstatic       dev/nuker/pyro/fc.0:I
        //  3917: ifeq            3926
        //  3920: ldc_w           1960820881
        //  3923: goto            3929
        //  3926: ldc_w           370220463
        //  3929: ldc_w           957948298
        //  3932: ixor           
        //  3933: lookupswitch {
        //          478178504: 3926
        //          1304879387: 4723
        //          default: 3960
        //        }
        //  3960: aload           6
        //  3962: aload_0        
        //  3963: aload_1        
        //  3964: aload_2        
        //  3965: aload           5
        //  3967: aload_3        
        //  3968: fload           7
        //  3970: fload           8
        //  3972: fload           9
        //  3974: goto            3978
        //  3977: athrow         
        //  3978: invokevirtual   net/minecraft/item/ItemStack.func_179546_a:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;
        //  3981: goto            3985
        //  3984: athrow         
        //  3985: getstatic       dev/nuker/pyro/fc.0:I
        //  3988: ifeq            3997
        //  3991: ldc_w           927046620
        //  3994: goto            4000
        //  3997: ldc_w           144884857
        //  4000: ldc_w           -604409528
        //  4003: ixor           
        //  4004: lookupswitch {
        //          -748964559: 4032
        //          -323425644: 3997
        //          default: 4627
        //        }
        //  4032: astore          15
        //  4034: aload           6
        //  4036: iload           13
        //  4038: getstatic       dev/nuker/pyro/fc.0:I
        //  4041: ifeq            4050
        //  4044: ldc_w           1453539664
        //  4047: goto            4053
        //  4050: ldc_w           1388268500
        //  4053: ldc_w           1214600265
        //  4056: ixor           
        //  4057: lookupswitch {
        //          -543881461: 4050
        //          516298009: 4601
        //          default: 4084
        //        }
        //  4084: goto            4088
        //  4087: athrow         
        //  4088: invokevirtual   net/minecraft/item/ItemStack.func_77964_b:(I)V
        //  4091: goto            4095
        //  4094: athrow         
        //  4095: aload           6
        //  4097: iload           14
        //  4099: goto            4103
        //  4102: athrow         
        //  4103: invokevirtual   net/minecraft/item/ItemStack.func_190920_e:(I)V
        //  4106: goto            4110
        //  4109: athrow         
        //  4110: aload           15
        //  4112: areturn        
        //  4113: aload           12
        //  4115: areturn        
        //  4116: aload           6
        //  4118: goto            4122
        //  4121: athrow         
        //  4122: invokevirtual   net/minecraft/item/ItemStack.func_77946_l:()Lnet/minecraft/item/ItemStack;
        //  4125: goto            4129
        //  4128: athrow         
        //  4129: astore          13
        //  4131: aload           11
        //  4133: goto            4137
        //  4136: athrow         
        //  4137: invokevirtual   net/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock.getUseItem:()Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  4140: goto            4144
        //  4143: athrow         
        //  4144: getstatic       net/minecraftforge/fml/common/eventhandler/Event$Result.DENY:Lnet/minecraftforge/fml/common/eventhandler/Event$Result;
        //  4147: if_acmpeq       4317
        //  4150: aload           6
        //  4152: aload_0        
        //  4153: getstatic       dev/nuker/pyro/fc.0:I
        //  4156: ifeq            4165
        //  4159: ldc_w           -187252710
        //  4162: goto            4168
        //  4165: ldc_w           1065802408
        //  4168: ldc_w           150344009
        //  4171: ixor           
        //  4172: lookupswitch {
        //          -691286346: 4165
        //          -64958125: 4725
        //          default: 4200
        //        }
        //  4200: aload_1        
        //  4201: aload_2        
        //  4202: aload           5
        //  4204: aload_3        
        //  4205: getstatic       dev/nuker/pyro/fc.0:I
        //  4208: ifeq            4217
        //  4211: ldc_w           2013633377
        //  4214: goto            4220
        //  4217: ldc_w           -1801845036
        //  4220: ldc_w           -910681731
        //  4223: ixor           
        //  4224: lookupswitch {
        //          -1312980452: 4641
        //          -1033830743: 4217
        //          default: 4252
        //        }
        //  4252: fload           7
        //  4254: fload           8
        //  4256: fload           9
        //  4258: getstatic       dev/nuker/pyro/fc.c:I
        //  4261: ifge            4270
        //  4264: ldc_w           -1546044661
        //  4267: goto            4273
        //  4270: ldc_w           -89875509
        //  4273: ldc_w           -347116358
        //  4276: ixor           
        //  4277: lookupswitch {
        //          300676977: 4304
        //          1217812401: 4270
        //          default: 4651
        //        }
        //  4304: goto            4308
        //  4307: athrow         
        //  4308: invokevirtual   net/minecraft/item/ItemStack.func_179546_a:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;
        //  4311: goto            4315
        //  4314: athrow         
        //  4315: astore          12
        //  4317: getstatic       dev/nuker/pyro/fc.c:I
        //  4320: ifge            4329
        //  4323: ldc_w           -614011923
        //  4326: goto            4332
        //  4329: ldc_w           607832954
        //  4332: ldc_w           -1534012359
        //  4335: ixor           
        //  4336: lookupswitch {
        //          -776894569: 4329
        //          2146844628: 4617
        //          default: 4364
        //        }
        //  4364: aload           6
        //  4366: getstatic       dev/nuker/pyro/fc.0:I
        //  4369: ifeq            4378
        //  4372: ldc_w           1860287057
        //  4375: goto            4381
        //  4378: ldc_w           -1275629615
        //  4381: ldc_w           51835594
        //  4384: ixor           
        //  4385: lookupswitch {
        //          -1327391461: 4412
        //          1844922523: 4378
        //          default: 4623
        //        }
        //  4412: goto            4416
        //  4415: athrow         
        //  4416: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  4419: goto            4423
        //  4422: athrow         
        //  4423: ifeq            4531
        //  4426: aload_0        
        //  4427: getstatic       dev/nuker/pyro/fc.c:I
        //  4430: ifge            4439
        //  4433: ldc_w           527653498
        //  4436: goto            4442
        //  4439: ldc_w           -1200629569
        //  4442: ldc_w           1737459480
        //  4445: ixor           
        //  4446: lookupswitch {
        //          368803604: 4439
        //          2029837666: 4697
        //          default: 4472
        //        }
        //  4472: aload           13
        //  4474: aload           5
        //  4476: getstatic       dev/nuker/pyro/fc.1:I
        //  4479: ifeq            4488
        //  4482: ldc_w           1325563875
        //  4485: goto            4491
        //  4488: ldc_w           -1180767607
        //  4491: ldc_w           -545241679
        //  4494: ixor           
        //  4495: lookupswitch {
        //          -1870513582: 4661
        //          -706395022: 4488
        //          default: 4520
        //        }
        //  4520: goto            4524
        //  4523: athrow         
        //  4524: invokestatic    net/minecraftforge/event/ForgeEventFactory.onPlayerDestroyItem:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)V
        //  4527: goto            4531
        //  4530: athrow         
        //  4531: getstatic       dev/nuker/pyro/fc.1:I
        //  4534: ifeq            4543
        //  4537: ldc_w           -744991996
        //  4540: goto            4546
        //  4543: ldc_w           -1711294469
        //  4546: ldc_w           197997995
        //  4549: ixor           
        //  4550: lookupswitch {
        //          -1842183600: 4576
        //          -665491793: 4543
        //          default: 4639
        //        }
        //  4576: aload           12
        //  4578: areturn        
        //  4579: getstatic       net/minecraft/util/EnumActionResult.SUCCESS:Lnet/minecraft/util/EnumActionResult;
        //  4582: areturn        
        //  4583: aconst_null    
        //  4584: athrow         
        //  4585: aconst_null    
        //  4586: athrow         
        //  4587: aconst_null    
        //  4588: athrow         
        //  4589: aconst_null    
        //  4590: athrow         
        //  4591: aconst_null    
        //  4592: athrow         
        //  4593: aconst_null    
        //  4594: athrow         
        //  4595: aconst_null    
        //  4596: athrow         
        //  4597: aconst_null    
        //  4598: athrow         
        //  4599: aconst_null    
        //  4600: athrow         
        //  4601: aconst_null    
        //  4602: athrow         
        //  4603: aconst_null    
        //  4604: athrow         
        //  4605: aconst_null    
        //  4606: athrow         
        //  4607: aconst_null    
        //  4608: athrow         
        //  4609: aconst_null    
        //  4610: athrow         
        //  4611: aconst_null    
        //  4612: athrow         
        //  4613: aconst_null    
        //  4614: athrow         
        //  4615: aconst_null    
        //  4616: athrow         
        //  4617: aconst_null    
        //  4618: athrow         
        //  4619: aconst_null    
        //  4620: athrow         
        //  4621: aconst_null    
        //  4622: athrow         
        //  4623: aconst_null    
        //  4624: athrow         
        //  4625: aconst_null    
        //  4626: athrow         
        //  4627: aconst_null    
        //  4628: athrow         
        //  4629: aconst_null    
        //  4630: athrow         
        //  4631: aconst_null    
        //  4632: athrow         
        //  4633: aconst_null    
        //  4634: athrow         
        //  4635: aconst_null    
        //  4636: athrow         
        //  4637: aconst_null    
        //  4638: athrow         
        //  4639: aconst_null    
        //  4640: athrow         
        //  4641: aconst_null    
        //  4642: athrow         
        //  4643: aconst_null    
        //  4644: athrow         
        //  4645: aconst_null    
        //  4646: athrow         
        //  4647: aconst_null    
        //  4648: athrow         
        //  4649: aconst_null    
        //  4650: athrow         
        //  4651: aconst_null    
        //  4652: athrow         
        //  4653: aconst_null    
        //  4654: athrow         
        //  4655: aconst_null    
        //  4656: athrow         
        //  4657: aconst_null    
        //  4658: athrow         
        //  4659: aconst_null    
        //  4660: athrow         
        //  4661: aconst_null    
        //  4662: athrow         
        //  4663: aconst_null    
        //  4664: athrow         
        //  4665: aconst_null    
        //  4666: athrow         
        //  4667: aconst_null    
        //  4668: athrow         
        //  4669: aconst_null    
        //  4670: athrow         
        //  4671: aconst_null    
        //  4672: athrow         
        //  4673: aconst_null    
        //  4674: athrow         
        //  4675: aconst_null    
        //  4676: athrow         
        //  4677: aconst_null    
        //  4678: athrow         
        //  4679: aconst_null    
        //  4680: athrow         
        //  4681: aconst_null    
        //  4682: athrow         
        //  4683: aconst_null    
        //  4684: athrow         
        //  4685: aconst_null    
        //  4686: athrow         
        //  4687: aconst_null    
        //  4688: athrow         
        //  4689: aconst_null    
        //  4690: athrow         
        //  4691: aconst_null    
        //  4692: athrow         
        //  4693: aconst_null    
        //  4694: athrow         
        //  4695: aconst_null    
        //  4696: athrow         
        //  4697: aconst_null    
        //  4698: athrow         
        //  4699: aconst_null    
        //  4700: athrow         
        //  4701: aconst_null    
        //  4702: athrow         
        //  4703: aconst_null    
        //  4704: athrow         
        //  4705: aconst_null    
        //  4706: athrow         
        //  4707: aconst_null    
        //  4708: athrow         
        //  4709: aconst_null    
        //  4710: athrow         
        //  4711: aconst_null    
        //  4712: athrow         
        //  4713: aconst_null    
        //  4714: athrow         
        //  4715: aconst_null    
        //  4716: athrow         
        //  4717: aconst_null    
        //  4718: athrow         
        //  4719: aconst_null    
        //  4720: athrow         
        //  4721: aconst_null    
        //  4722: athrow         
        //  4723: aconst_null    
        //  4724: athrow         
        //  4725: aconst_null    
        //  4726: athrow         
        //  4727: pop            
        //  4728: goto            24
        //  4731: pop            
        //  4732: aconst_null    
        //  4733: goto            4727
        //  4736: dup            
        //  4737: ifnull          4727
        //  4740: checkcast       Ljava/lang/Throwable;
        //  4743: athrow         
        //  4744: dup            
        //  4745: ifnull          4731
        //  4748: checkcast       Ljava/lang/Throwable;
        //  4751: athrow         
        //  4752: aconst_null    
        //  4753: athrow         
        //    StackMapTable: 02 37 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 00 00 0B 42 01 1C 48 07 00 27 40 07 02 FA 45 07 00 27 00 0B 42 01 1F FF 00 05 00 00 00 01 07 00 27 FF 00 00 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 00 02 07 00 86 07 04 98 45 07 00 27 40 07 00 65 FC 00 0D 07 00 65 42 01 1C 4D 07 00 FB FF 00 02 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 00 02 07 00 FB 01 5E 07 00 FB 46 07 00 1A FF 00 00 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 00 02 03 07 00 80 45 07 00 27 FF 00 00 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 00 02 03 01 FC 00 10 02 42 01 1C 50 03 FF 00 02 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 01 5F 03 FF 00 0C 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 07 00 80 FF 00 02 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 03 03 07 00 80 01 FF 00 1F 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 07 00 80 42 07 00 88 FF 00 00 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 07 00 80 45 07 00 27 FF 00 00 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 01 FF 00 16 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 03 07 00 80 FF 00 02 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 03 03 07 00 80 01 FF 00 1E 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 03 07 00 80 42 07 00 27 FF 00 00 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 03 07 00 80 45 07 00 27 FF 00 00 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 03 01 4E 02 FF 00 02 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 02 01 5E 02 FF 00 0D 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 01 07 00 14 40 07 00 4A 45 07 00 27 40 07 03 2C 4B 07 03 2C FF 00 02 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 02 07 03 2C 01 5E 07 03 2C 43 07 00 27 FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 02 07 03 2C 07 00 80 45 07 00 27 40 01 06 0B 42 01 1D FF 00 14 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 07 00 2C FF 00 02 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 07 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 07 00 2C 01 FF 00 1F 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 07 00 2C 45 07 00 27 FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 07 02 FA 45 07 00 27 FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 02 45 07 00 0E FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 03 45 07 00 27 FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 05 07 00 86 07 04 98 07 00 80 07 00 82 07 00 FB 42 07 00 27 FF 00 00 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 05 07 00 86 07 04 98 07 00 80 07 00 82 07 00 FB 45 07 00 27 40 07 03 50 4B 07 03 50 FF 00 02 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 02 07 03 50 01 5D 07 03 50 FF 00 0F 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 01 07 03 50 FF 00 02 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 02 07 03 50 01 5C 07 03 50 42 07 00 1C 40 07 03 50 45 07 00 27 40 01 FF 00 08 00 00 00 01 07 00 27 FF 00 00 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 01 07 00 2C 45 07 00 27 40 07 03 65 FF 00 13 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 06 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 FF 00 02 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 07 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 01 FF 00 1C 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 06 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 FF 00 11 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 09 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 02 02 02 FF 00 02 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 0A 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 02 02 02 01 FF 00 1E 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 09 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 02 02 02 42 07 00 27 FF 00 00 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 09 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 02 02 02 45 07 00 27 FF 00 00 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 02 07 03 65 07 03 5A 42 07 00 88 FF 00 00 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 02 07 03 65 07 03 5A 45 07 00 27 00 4D 07 03 50 FF 00 02 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 02 07 03 50 01 5C 07 03 50 42 07 00 27 40 07 03 50 45 07 00 27 40 07 03 31 00 FF 00 0D 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 00 14 40 07 02 FA 45 07 00 27 40 07 03 7C 4B 07 03 7C FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 03 7C 01 5E 07 03 7C FF 00 1B 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 08 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 01 FF 00 1C 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 46 07 00 27 FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 45 07 00 27 40 07 03 31 FC 00 0D 07 03 31 42 01 1F 56 07 00 2C FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 00 2C 01 5D 07 00 2C 42 07 00 88 40 07 00 2C 45 07 00 27 40 07 03 65 FF 00 10 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 04 07 03 65 08 05 2B 08 05 2B 07 00 80 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 05 07 03 65 08 05 2B 08 05 2B 07 00 80 01 FF 00 1C 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 04 07 03 65 08 05 2B 08 05 2B 07 00 80 FF 00 14 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 09 07 03 65 08 05 2B 08 05 2B 07 00 80 07 00 82 07 04 98 02 02 02 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 0A 07 03 65 08 05 2B 08 05 2B 07 00 80 07 00 82 07 04 98 02 02 02 01 FF 00 1F 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 09 07 03 65 08 05 2B 08 05 2B 07 00 80 07 00 82 07 04 98 02 02 02 42 07 00 27 FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 09 07 03 65 08 05 2B 08 05 2B 07 00 80 07 00 82 07 04 98 02 02 02 45 07 00 27 FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 03 65 07 03 5A FF 00 0B 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 03 65 07 03 5A FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 03 07 03 65 07 03 5A 01 FF 00 1D 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 03 65 07 03 5A 42 07 00 27 FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 03 65 07 03 5A 45 07 00 27 00 0B 42 01 1D 02 44 07 00 1A FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 00 4A 07 00 80 45 07 00 27 40 07 03 D5 FF 00 05 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 01 07 00 8B 40 07 00 86 45 07 00 27 40 07 00 65 4B 07 00 65 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 07 00 65 01 5E 07 00 65 FF 00 0C 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 07 00 65 07 00 4A FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 03 07 00 65 07 00 4A 01 FF 00 1F 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 07 00 65 07 00 4A FF 00 0C 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 03 07 00 65 07 00 4A 07 00 80 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 01 FF 00 1F 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 03 07 00 65 07 00 4A 07 00 80 FF 00 0C 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 07 00 86 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 05 07 00 65 07 00 4A 07 00 80 07 00 86 01 FF 00 1F 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 07 00 86 42 07 00 27 FF 00 00 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 07 00 86 45 07 00 27 40 01 0E 42 01 1E 43 07 00 27 40 07 00 86 45 07 00 27 40 07 00 65 4B 07 00 65 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 07 00 65 01 5C 07 00 65 45 07 00 27 FF 00 00 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 07 00 86 45 07 00 27 40 01 06 40 01 4B 01 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 01 01 5E 01 FF 00 0E 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 00 86 FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 00 86 01 5D 07 00 86 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 00 86 45 07 00 27 40 01 4C 07 00 27 40 07 03 50 45 07 00 27 40 07 03 CC 4B 07 03 CC FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 03 CC 01 5C 07 03 CC 05 44 07 00 27 40 07 03 50 45 07 00 27 40 07 03 CC 4A 07 00 1E 40 07 03 D5 47 07 00 27 40 07 03 E4 FF 00 0C 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 03 E4 07 00 4A FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 03 07 03 E4 07 00 4A 01 FF 00 1F 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 03 E4 07 00 4A FF 00 0C 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 03 07 03 E4 07 00 4A 07 00 80 FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 04 07 03 E4 07 00 4A 07 00 80 01 FF 00 1F 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 03 07 03 E4 07 00 4A 07 00 80 FF 00 0D 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 04 07 03 E4 07 00 4A 07 00 80 07 03 D5 FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 05 07 03 E4 07 00 4A 07 00 80 07 03 D5 01 FF 00 1E 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 04 07 03 E4 07 00 4A 07 00 80 07 03 D5 4C 07 00 27 FF 00 00 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 0A 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 86 07 04 98 07 00 82 02 02 02 45 07 00 27 40 01 01 0B 42 01 1D 04 05 42 01 19 04 49 07 00 88 40 07 00 65 45 07 00 27 40 07 00 84 11 42 01 1F 4D 07 00 65 FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 00 65 01 5E 07 00 65 42 07 00 27 40 07 00 65 45 07 00 27 40 07 00 84 4E 07 00 6B FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 00 6B 01 5E 07 00 6B FF 00 0F 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 01 07 00 6B FF 00 02 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 02 07 00 6B 01 5C 07 00 6B FF 00 0C 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 02 07 00 6B 07 00 4A FF 00 02 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 03 07 00 6B 07 00 4A 01 FF 00 1F 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 02 07 00 6B 07 00 4A FF 00 10 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 06 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 FF 00 02 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 07 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 01 FF 00 1F 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 06 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 42 07 00 18 FF 00 00 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 06 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 45 07 00 27 40 01 FF 00 06 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 00 45 07 00 27 40 07 00 2C 45 07 00 27 40 07 03 65 FF 00 15 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 08 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 01 FF 00 1E 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 FF 00 0F 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 09 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 02 02 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 0A 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 02 02 01 FF 00 1C 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 09 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 02 02 42 07 00 27 FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 09 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 02 02 45 07 00 27 FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 03 65 07 03 5A 42 07 00 88 FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 03 65 07 03 5A 45 07 00 27 00 0B 42 01 1E 56 07 02 FA FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 02 FA 01 5D 07 02 FA 42 07 00 27 40 07 02 FA 45 07 00 27 40 07 03 7C 4B 07 03 7C FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 03 7C 01 5D 07 03 7C 05 44 07 00 27 40 07 03 50 45 07 00 27 40 07 03 CC 05 0B 42 01 1F 44 07 00 88 40 07 00 65 45 07 00 27 40 01 02 05 42 01 1A 0B 42 01 1C 03 0B 42 01 1C 43 07 00 27 40 07 00 86 45 07 00 27 40 07 04 2D 44 07 00 1E FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 65 45 07 00 27 FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 84 FF 00 0B 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 84 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 03 07 04 2D 07 00 84 01 FF 00 1F 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 84 42 07 00 0E FF 00 00 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 84 45 07 00 27 40 01 0E 42 01 1E 03 0B 42 01 1C 44 07 00 27 40 07 00 65 45 07 00 27 40 07 00 84 05 05 42 01 1B 0B 42 01 1C 4C 07 00 86 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 00 86 01 5F 07 00 86 42 07 00 16 40 07 00 86 45 07 00 27 40 01 47 07 00 88 40 07 00 65 45 07 00 27 40 07 00 84 45 07 00 27 40 07 00 6B 45 07 00 27 40 07 03 E4 FC 00 15 07 03 E4 42 01 1D 07 05 42 01 1A FA 00 03 48 07 00 27 40 07 02 FA 45 07 00 27 40 07 03 7C 42 07 00 27 40 07 03 7C 45 07 00 27 40 01 50 07 00 65 FF 00 02 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 00 65 01 5F 07 00 65 42 07 00 27 40 07 00 65 45 07 00 27 40 01 FF 00 06 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 00 01 07 00 10 40 07 00 65 45 07 00 27 40 01 4B 01 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 00 02 01 01 5E 01 FF 00 06 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 01 07 00 8B 40 07 03 50 45 07 00 27 40 07 03 CC 4B 07 03 CC FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 02 07 03 CC 01 5D 07 03 CC 11 42 01 1E 50 07 00 27 FF 00 00 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 45 07 00 27 40 07 03 31 4B 07 03 31 FF 00 02 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 02 07 03 31 01 5F 07 03 31 FF 00 11 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 02 07 00 65 01 FF 00 02 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 03 07 00 65 01 01 FF 00 1E 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 02 07 00 65 01 42 07 00 88 FF 00 00 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 02 07 00 65 01 45 07 00 27 00 46 07 00 1E FF 00 00 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 02 07 00 65 01 45 07 00 27 00 FA 00 02 F9 00 02 44 07 00 27 40 07 00 65 45 07 00 27 40 07 00 65 FF 00 06 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 01 07 00 27 40 07 03 50 45 07 00 27 40 07 03 CC FF 00 14 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 02 07 00 65 07 00 86 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 03 07 00 65 07 00 86 01 FF 00 1F 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 02 07 00 65 07 00 86 FF 00 10 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 06 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 07 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 01 FF 00 1F 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 06 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 FF 00 11 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 0A 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 01 FF 00 1E 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 45 07 00 27 40 07 03 31 01 0B 42 01 1F 4D 07 00 65 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 02 07 00 65 01 5E 07 00 65 42 07 00 27 40 07 00 65 45 07 00 27 40 01 4F 07 00 86 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 02 07 00 86 01 5D 07 00 86 FF 00 0F 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 03 07 00 86 07 00 65 07 04 98 FF 00 02 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 04 07 00 86 07 00 65 07 04 98 01 FF 00 1C 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 03 07 00 86 07 00 65 07 04 98 42 07 00 27 FF 00 00 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 03 07 00 86 07 00 65 07 04 98 45 07 00 27 00 0B 42 01 1D FA 00 02 FF 00 03 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 01 07 03 50 FC 00 01 07 03 31 F9 00 01 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 02 07 04 2D 07 00 84 FE 00 01 07 03 31 07 03 D5 01 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 03 7C FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 01 07 00 2C FA 00 01 FC 00 01 07 03 31 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 07 03 31 00 02 07 00 65 01 FF 00 01 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 00 00 FF 00 01 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 01 07 00 6B FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 00 65 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 03 07 00 65 07 00 4A 07 00 80 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 04 07 03 E4 07 00 4A 07 00 80 07 03 D5 FF 00 01 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 06 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 03 CC FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 00 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 00 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 01 07 00 65 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 01 07 00 65 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 01 07 00 65 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 01 07 03 31 41 07 03 CC FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 00 FF 00 01 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 06 07 00 6B 07 00 4A 07 00 80 07 00 82 07 00 86 07 00 65 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 09 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 02 02 01 FC 00 01 07 00 65 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 06 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 FF 00 01 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 01 07 03 50 FD 00 01 07 03 31 07 03 E4 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 04 07 00 65 07 00 4A 07 00 80 07 00 86 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 00 6B FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 09 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 02 02 FF 00 01 00 0C 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 00 09 07 03 65 08 03 70 08 03 70 07 00 80 07 00 82 07 04 98 02 02 02 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 03 07 03 E4 07 00 4A 07 00 80 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 02 07 00 65 07 00 4A FF 00 01 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 00 00 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 03 07 00 86 07 00 65 07 04 98 FF 00 01 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 00 00 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 02 07 03 65 07 03 5A FF 00 01 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 06 07 00 86 07 04 98 07 00 80 07 00 82 07 00 86 07 00 2C FF 00 01 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 01 02 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 00 65 FF 00 01 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 01 07 03 2C FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 00 65 07 00 86 07 00 4A 07 00 80 07 04 98 07 00 82 02 01 FF 00 01 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 01 03 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 01 07 00 86 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 00 01 01 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 07 07 03 65 08 0A A4 08 0A A4 07 00 80 07 00 82 07 04 98 02 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 00 01 01 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 02 07 03 E4 07 00 4A FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 00 86 FF 00 01 00 09 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 00 02 03 07 00 80 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 00 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 01 07 00 86 FF 00 01 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 00 FF 00 01 00 08 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 00 02 03 07 00 80 FF 00 01 00 10 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 00 00 FF 00 01 00 11 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 07 03 D5 01 07 00 6B 00 02 07 00 6B 07 00 4A FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 00 FF 00 01 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 00 01 07 00 FB FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 03 7C 01 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 04 07 03 65 08 05 2B 08 05 2B 07 00 80 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 03 31 00 09 07 03 65 08 05 2B 08 05 2B 07 00 80 07 00 82 07 04 98 02 02 02 FF 00 01 00 0D 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 00 01 07 02 FA FF 00 01 00 0B 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 00 01 07 03 50 FF 00 01 00 0F 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 01 01 00 00 FF 00 01 00 0E 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 07 00 65 02 02 02 01 07 03 50 07 03 31 07 00 65 00 02 07 00 65 07 00 86 FF 00 01 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4736   4744   Ljava/lang/EnumConstantNotPresentException;
        //  4736   4744   4736   4744   Any
        //  4752   4754   3      8      Ljava/lang/NegativeArraySizeException;
        //  77     84     84     85     Any
        //  78     84     77     78     Any
        //  77     84     84     85     Ljava/lang/RuntimeException;
        //  77     84     84     85     Any
        //  78     84     3      8      Any
        //  139    145    145    146    Any
        //  139    145    3      8      Any
        //  139    145    3      8      Ljava/lang/ArithmeticException;
        //  139    145    3      8      Any
        //  139    145    3      8      Any
        //  247    254    254    255    Any
        //  247    254    254    255    Any
        //  247    254    254    255    Any
        //  247    254    247    248    Ljava/lang/AssertionError;
        //  248    254    3      8      Any
        //  407    414    414    415    Any
        //  408    414    407    408    Ljava/util/ConcurrentModificationException;
        //  407    414    407    408    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  408    414    414    415    Ljava/lang/NullPointerException;
        //  407    414    3      8      Any
        //  475    482    482    483    Any
        //  475    482    475    476    Ljava/lang/RuntimeException;
        //  476    482    475    476    Ljava/lang/UnsupportedOperationException;
        //  476    482    3      8      Any
        //  475    482    475    476    Any
        //  546    553    553    554    Any
        //  547    553    553    554    Ljava/lang/UnsupportedOperationException;
        //  547    553    3      8      Ljava/lang/IllegalStateException;
        //  546    553    546    547    Ljava/lang/UnsupportedOperationException;
        //  547    553    553    554    Any
        //  604    611    611    612    Any
        //  604    611    604    605    Any
        //  604    611    3      8      Any
        //  605    611    3      8      Ljava/lang/IllegalStateException;
        //  605    611    3      8      Any
        //  726    733    733    734    Any
        //  726    733    733    734    Any
        //  726    733    726    727    Ljava/lang/AssertionError;
        //  726    733    726    727    Any
        //  727    733    3      8      Ljava/util/ConcurrentModificationException;
        //  740    747    747    748    Any
        //  740    747    747    748    Any
        //  741    747    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  740    747    747    748    Ljava/lang/EnumConstantNotPresentException;
        //  741    747    740    741    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  751    758    758    759    Any
        //  752    758    751    752    Any
        //  752    758    758    759    Any
        //  752    758    3      8      Ljava/lang/NullPointerException;
        //  751    758    3      8      Any
        //  855    862    862    863    Any
        //  855    862    3      8      Any
        //  855    862    3      8      Any
        //  856    862    855    856    Ljava/lang/IllegalStateException;
        //  856    862    3      8      Ljava/lang/IllegalArgumentException;
        //  873    879    879    880    Any
        //  873    879    879    880    Any
        //  873    879    879    880    Any
        //  873    879    3      8      Ljava/util/ConcurrentModificationException;
        //  873    879    3      8      Any
        //  987    994    994    995    Any
        //  988    994    994    995    Any
        //  987    994    994    995    Any
        //  987    994    987    988    Any
        //  987    994    3      8      Any
        //  998    1005   1005   1006   Any
        //  998    1005   998    999    Ljava/lang/IllegalStateException;
        //  999    1005   3      8      Ljava/lang/IllegalArgumentException;
        //  998    1005   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  999    1005   998    999    Ljava/lang/IllegalArgumentException;
        //  1055   1062   1062   1063   Any
        //  1056   1062   3      8      Ljava/lang/NumberFormatException;
        //  1056   1062   3      8      Ljava/util/NoSuchElementException;
        //  1055   1062   1055   1056   Any
        //  1055   1062   1055   1056   Any
        //  1078   1085   1085   1086   Any
        //  1079   1085   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1079   1085   1085   1086   Ljava/lang/StringIndexOutOfBoundsException;
        //  1079   1085   1078   1079   Ljava/lang/UnsupportedOperationException;
        //  1079   1085   1078   1079   Ljava/lang/UnsupportedOperationException;
        //  1199   1206   1206   1207   Any
        //  1199   1206   3      8      Any
        //  1199   1206   3      8      Any
        //  1200   1206   3      8      Any
        //  1200   1206   1199   1200   Any
        //  1315   1322   1322   1323   Any
        //  1315   1322   3      8      Ljava/lang/NumberFormatException;
        //  1316   1322   1322   1323   Any
        //  1316   1322   1322   1323   Ljava/lang/UnsupportedOperationException;
        //  1315   1322   1315   1316   Ljava/lang/RuntimeException;
        //  1431   1438   1438   1439   Any
        //  1432   1438   1431   1432   Any
        //  1431   1438   3      8      Ljava/lang/ClassCastException;
        //  1431   1438   1431   1432   Any
        //  1431   1438   1438   1439   Ljava/lang/ArithmeticException;
        //  1487   1494   1494   1495   Any
        //  1488   1494   1487   1488   Any
        //  1487   1494   1494   1495   Any
        //  1487   1494   1487   1488   Any
        //  1487   1494   1494   1495   Ljava/lang/NumberFormatException;
        //  1548   1555   1555   1556   Any
        //  1548   1555   1555   1556   Any
        //  1549   1555   1555   1556   Ljava/lang/AssertionError;
        //  1549   1555   1548   1549   Ljava/lang/AssertionError;
        //  1548   1555   3      8      Ljava/util/ConcurrentModificationException;
        //  1562   1569   1569   1570   Any
        //  1562   1569   1562   1563   Ljava/lang/StringIndexOutOfBoundsException;
        //  1562   1569   1569   1570   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1563   1569   3      8      Ljava/lang/AssertionError;
        //  1562   1569   1569   1570   Any
        //  1763   1770   1770   1771   Any
        //  1763   1770   1770   1771   Ljava/lang/NullPointerException;
        //  1763   1770   1770   1771   Any
        //  1764   1770   1770   1771   Any
        //  1763   1770   1763   1764   Any
        //  1824   1831   1831   1832   Any
        //  1824   1831   1824   1825   Any
        //  1825   1831   3      8      Ljava/lang/IllegalArgumentException;
        //  1825   1831   1824   1825   Any
        //  1824   1831   1831   1832   Any
        //  1882   1889   1889   1890   Any
        //  1882   1889   3      8      Any
        //  1882   1889   1882   1883   Any
        //  1883   1889   1882   1883   Any
        //  1882   1889   1889   1890   Any
        //  1996   2002   2002   2003   Any
        //  1996   2002   3      8      Any
        //  1996   2002   2002   2003   Ljava/lang/IndexOutOfBoundsException;
        //  1996   2002   3      8      Ljava/lang/IllegalArgumentException;
        //  1996   2002   2002   2003   Any
        //  2016   2023   2023   2024   Any
        //  2017   2023   2016   2017   Any
        //  2016   2023   2016   2017   Ljava/lang/ArithmeticException;
        //  2017   2023   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2017   2023   2023   2024   Any
        //  2079   2086   2086   2087   Any
        //  2080   2086   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2079   2086   3      8      Any
        //  2080   2086   2079   2080   Any
        //  2080   2086   2086   2087   Any
        //  2098   2107   2107   2108   Any
        //  2099   2107   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2099   2107   2098   2099   Ljava/lang/IllegalArgumentException;
        //  2098   2107   2107   2108   Ljava/util/ConcurrentModificationException;
        //  2099   2107   3      8      Any
        //  2265   2272   2272   2273   Any
        //  2266   2272   2272   2273   Any
        //  2265   2272   3      8      Any
        //  2265   2272   3      8      Any
        //  2265   2272   2265   2266   Any
        //  2375   2382   2382   2383   Any
        //  2376   2382   2375   2376   Ljava/lang/NumberFormatException;
        //  2375   2382   2382   2383   Ljava/lang/IndexOutOfBoundsException;
        //  2376   2382   2375   2376   Ljava/util/NoSuchElementException;
        //  2376   2382   2375   2376   Ljava/lang/IllegalStateException;
        //  2487   2494   2494   2495   Any
        //  2488   2494   2494   2495   Any
        //  2488   2494   2494   2495   Any
        //  2487   2494   2487   2488   Any
        //  2488   2494   2494   2495   Any
        //  2695   2702   2702   2703   Any
        //  2695   2702   2695   2696   Ljava/lang/EnumConstantNotPresentException;
        //  2696   2702   2702   2703   Any
        //  2695   2702   2702   2703   Any
        //  2695   2702   3      8      Any
        //  2716   2723   2723   2724   Any
        //  2716   2723   3      8      Any
        //  2717   2723   2716   2717   Any
        //  2717   2723   2716   2717   Any
        //  2716   2723   2723   2724   Ljava/lang/EnumConstantNotPresentException;
        //  2831   2838   2838   2839   Any
        //  2831   2838   3      8      Any
        //  2831   2838   3      8      Any
        //  2831   2838   2831   2832   Any
        //  2832   2838   2831   2832   Any
        //  2842   2849   2849   2850   Any
        //  2842   2849   2842   2843   Ljava/lang/EnumConstantNotPresentException;
        //  2843   2849   2849   2850   Any
        //  2843   2849   3      8      Ljava/lang/IllegalStateException;
        //  2842   2849   2842   2843   Ljava/lang/IndexOutOfBoundsException;
        //  2955   2962   2962   2963   Any
        //  2955   2962   2955   2956   Any
        //  2955   2962   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2956   2962   2962   2963   Ljava/lang/ArithmeticException;
        //  2956   2962   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3019   3026   3026   3027   Any
        //  3020   3026   3026   3027   Ljava/lang/IllegalStateException;
        //  3020   3026   3026   3027   Ljava/lang/NegativeArraySizeException;
        //  3019   3026   3019   3020   Any
        //  3019   3026   3026   3027   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3085   3092   3092   3093   Any
        //  3086   3092   3      8      Any
        //  3086   3092   3085   3086   Ljava/lang/RuntimeException;
        //  3085   3092   3      8      Any
        //  3085   3092   3092   3093   Any
        //  3228   3235   3235   3236   Any
        //  3229   3235   3228   3229   Any
        //  3229   3235   3235   3236   Ljava/lang/UnsupportedOperationException;
        //  3228   3235   3228   3229   Ljava/lang/IndexOutOfBoundsException;
        //  3229   3235   3228   3229   Any
        //  3241   3248   3248   3249   Any
        //  3241   3248   3241   3242   Ljava/lang/IllegalArgumentException;
        //  3241   3248   3248   3249   Any
        //  3241   3248   3248   3249   Ljava/lang/RuntimeException;
        //  3241   3248   3      8      Ljava/lang/NegativeArraySizeException;
        //  3299   3306   3306   3307   Any
        //  3300   3306   3      8      Any
        //  3299   3306   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3299   3306   3299   3300   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3300   3306   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3409   3416   3416   3417   Any
        //  3410   3416   3      8      Any
        //  3409   3416   3409   3410   Any
        //  3409   3416   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3409   3416   3416   3417   Ljava/lang/StringIndexOutOfBoundsException;
        //  3555   3562   3562   3563   Any
        //  3555   3562   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3555   3562   3555   3556   Ljava/lang/NullPointerException;
        //  3556   3562   3      8      Any
        //  3556   3562   3562   3563   Ljava/lang/ArithmeticException;
        //  3571   3578   3578   3579   Any
        //  3571   3578   3571   3572   Ljava/util/NoSuchElementException;
        //  3571   3578   3578   3579   Ljava/lang/IllegalArgumentException;
        //  3571   3578   3571   3572   Ljava/lang/ClassCastException;
        //  3571   3578   3578   3579   Ljava/lang/StringIndexOutOfBoundsException;
        //  3585   3592   3592   3593   Any
        //  3585   3592   3      8      Any
        //  3586   3592   3585   3586   Any
        //  3585   3592   3      8      Any
        //  3586   3592   3585   3586   Ljava/lang/ArithmeticException;
        //  3705   3712   3712   3713   Any
        //  3705   3712   3712   3713   Ljava/lang/NullPointerException;
        //  3705   3712   3705   3706   Any
        //  3705   3712   3712   3713   Ljava/util/NoSuchElementException;
        //  3706   3712   3712   3713   Any
        //  3716   3723   3723   3724   Any
        //  3716   3723   3716   3717   Ljava/lang/IllegalStateException;
        //  3716   3723   3      8      Any
        //  3717   3723   3716   3717   Ljava/lang/UnsupportedOperationException;
        //  3716   3723   3716   3717   Any
        //  3779   3786   3786   3787   Any
        //  3780   3786   3779   3780   Any
        //  3780   3786   3779   3780   Any
        //  3780   3786   3      8      Any
        //  3780   3786   3786   3787   Ljava/lang/AssertionError;
        //  3794   3801   3801   3802   Any
        //  3794   3801   3794   3795   Ljava/lang/NumberFormatException;
        //  3795   3801   3      8      Ljava/lang/NumberFormatException;
        //  3794   3801   3      8      Ljava/lang/IllegalStateException;
        //  3794   3801   3801   3802   Any
        //  3855   3862   3862   3863   Any
        //  3855   3862   3862   3863   Any
        //  3856   3862   3      8      Ljava/lang/IllegalStateException;
        //  3856   3862   3855   3856   Ljava/lang/StringIndexOutOfBoundsException;
        //  3855   3862   3      8      Ljava/lang/UnsupportedOperationException;
        //  3977   3984   3984   3985   Any
        //  3978   3984   3977   3978   Any
        //  3978   3984   3      8      Any
        //  3978   3984   3      8      Any
        //  3977   3984   3977   3978   Any
        //  4087   4094   4094   4095   Any
        //  4088   4094   4094   4095   Any
        //  4088   4094   4087   4088   Ljava/lang/RuntimeException;
        //  4088   4094   3      8      Any
        //  4088   4094   4087   4088   Ljava/lang/IndexOutOfBoundsException;
        //  4102   4109   4109   4110   Any
        //  4102   4109   3      8      Any
        //  4102   4109   3      8      Ljava/lang/ArithmeticException;
        //  4103   4109   4102   4103   Ljava/lang/IllegalArgumentException;
        //  4103   4109   4109   4110   Any
        //  4121   4128   4128   4129   Any
        //  4122   4128   4121   4122   Any
        //  4121   4128   3      8      Ljava/lang/NegativeArraySizeException;
        //  4122   4128   4128   4129   Ljava/lang/ArithmeticException;
        //  4121   4128   4121   4122   Ljava/lang/RuntimeException;
        //  4136   4143   4143   4144   Any
        //  4137   4143   4136   4137   Any
        //  4136   4143   4143   4144   Any
        //  4137   4143   4136   4137   Ljava/lang/IllegalArgumentException;
        //  4137   4143   4136   4137   Any
        //  4308   4314   4314   4315   Any
        //  4308   4314   4314   4315   Ljava/lang/StringIndexOutOfBoundsException;
        //  4308   4314   3      8      Ljava/lang/IllegalStateException;
        //  4308   4314   4314   4315   Any
        //  4308   4314   4314   4315   Any
        //  4415   4422   4422   4423   Any
        //  4416   4422   4415   4416   Any
        //  4415   4422   4422   4423   Ljava/lang/IndexOutOfBoundsException;
        //  4415   4422   4422   4423   Ljava/lang/NullPointerException;
        //  4416   4422   4422   4423   Ljava/lang/ArithmeticException;
        //  4523   4530   4530   4531   Any
        //  4524   4530   3      8      Any
        //  4524   4530   3      8      Any
        //  4524   4530   4523   4524   Any
        //  4524   4530   4530   4531   Any
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
    
    public static fbB c(final BlockPos blockPos) {
        return fbS.1O(null, 847779675, blockPos);
    }
    
    static {
        final Block[] a = new Block[11];
        a[0] = Blocks.field_150477_bB;
        a[1] = (Block)Blocks.field_150486_ae;
        a[2] = Blocks.field_150447_bR;
        a[3] = Blocks.field_150462_ai;
        final int n = 4;
        while (true) {
            int n2 = 0;
            Label_0046: {
                if (fc.0 != 0) {
                    n2 = 610478067;
                    break Label_0046;
                }
                n2 = -2021020087;
            }
            switch (n2 ^ 0x2122D9CE) {
                case -1491479492: {
                    continue;
                }
                default: {
                    a[n] = Blocks.field_150467_bQ;
                    a[5] = Blocks.field_150382_bo;
                    a[6] = (Block)Blocks.field_150438_bZ;
                    a[7] = Blocks.field_150409_cd;
                    final int n3 = 8;
                    while (true) {
                        int n4 = 0;
                        Label_0118: {
                            if (fc.c < 0) {
                                n4 = 316498276;
                                break Label_0118;
                            }
                            n4 = -461473960;
                        }
                        switch (n4 ^ 0x8A7B1431) {
                            case 1197464620: {
                                continue;
                            }
                            default: {
                                a[n3] = Blocks.field_150367_z;
                                final int n5 = 9;
                                while (true) {
                                    int n6 = 0;
                                    Label_0170: {
                                        if (fc.0 != 0) {
                                            n6 = -63495481;
                                            break Label_0170;
                                        }
                                        n6 = -71373799;
                                    }
                                    switch (n6 ^ 0x48AF1BD0) {
                                        case -1265092329: {
                                            continue;
                                        }
                                        case -1290668087: {
                                            a[n5] = Blocks.field_150415_aT;
                                            a[10] = Blocks.field_150381_bn;
                                            final List<Block> list = Arrays.asList(a);
                                            while (true) {
                                                int n7 = 0;
                                                Label_0229: {
                                                    if (fc.1 != 0) {
                                                        n7 = -204462410;
                                                        break Label_0229;
                                                    }
                                                    n7 = 582460141;
                                                }
                                                switch (n7 ^ 0xDC546985) {
                                                    case 797200179: {
                                                        continue;
                                                    }
                                                    case -18625688: {
                                                        fby.c = list;
                                                        final Block[] a2 = new Block[16];
                                                        final int n8 = 0;
                                                        while (true) {
                                                            int n9 = 0;
                                                            Label_0285: {
                                                                if (fc.0 != 0) {
                                                                    n9 = 2049748592;
                                                                    break Label_0285;
                                                                }
                                                                n9 = 879175424;
                                                            }
                                                            switch (n9 ^ 0xA138FD07) {
                                                                case -619424905: {
                                                                    continue;
                                                                }
                                                                case -1788880377: {
                                                                    a2[n8] = Blocks.field_190977_dl;
                                                                    final int n10 = 1;
                                                                    while (true) {
                                                                        int n11 = 0;
                                                                        Label_0337: {
                                                                            if (fc.0 != 0) {
                                                                                n11 = 1958873311;
                                                                                break Label_0337;
                                                                            }
                                                                            n11 = 1551327031;
                                                                        }
                                                                        switch (n11 ^ 0x48454E99) {
                                                                            case 1015498310: {
                                                                                continue;
                                                                            }
                                                                            case 338825646: {
                                                                                a2[n10] = Blocks.field_190978_dm;
                                                                                a2[2] = Blocks.field_190979_dn;
                                                                                a2[3] = Blocks.field_190980_do;
                                                                                final int n12 = 4;
                                                                                while (true) {
                                                                                    int n13 = 0;
                                                                                    Label_0401: {
                                                                                        if (fc.0 != 0) {
                                                                                            n13 = -623846342;
                                                                                            break Label_0401;
                                                                                        }
                                                                                        n13 = -1840266031;
                                                                                    }
                                                                                    switch (n13 ^ 0x7915FF15) {
                                                                                        case -1547361489: {
                                                                                            continue;
                                                                                        }
                                                                                        case -346407996: {
                                                                                            a2[n12] = Blocks.field_190981_dp;
                                                                                            a2[5] = Blocks.field_190982_dq;
                                                                                            a2[6] = Blocks.field_190983_dr;
                                                                                            final int n14 = 7;
                                                                                            while (true) {
                                                                                                int n15 = 0;
                                                                                                Label_0467: {
                                                                                                    if (fc.0 != 0) {
                                                                                                        n15 = -557596772;
                                                                                                        break Label_0467;
                                                                                                    }
                                                                                                    n15 = -1838340509;
                                                                                                }
                                                                                                switch (n15 ^ 0x162B4909) {
                                                                                                    case -1055511864: {
                                                                                                        continue;
                                                                                                    }
                                                                                                    default: {
                                                                                                        a2[n14] = Blocks.field_190984_ds;
                                                                                                        final int n16 = 8;
                                                                                                        while (true) {
                                                                                                            int n17 = 0;
                                                                                                            Label_0518: {
                                                                                                                if (fc.c < 0) {
                                                                                                                    n17 = 581843553;
                                                                                                                    break Label_0518;
                                                                                                                }
                                                                                                                n17 = 334106289;
                                                                                                            }
                                                                                                            switch (n17 ^ 0x9D5F421B) {
                                                                                                                case 2116775785: {
                                                                                                                    continue;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    a2[n16] = Blocks.field_190985_dt;
                                                                                                                    a2[9] = Blocks.field_190986_du;
                                                                                                                    a2[10] = Blocks.field_190987_dv;
                                                                                                                    a2[11] = Blocks.field_190988_dw;
                                                                                                                    a2[12] = Blocks.field_190989_dx;
                                                                                                                    a2[13] = Blocks.field_190990_dy;
                                                                                                                    final int n18 = 14;
                                                                                                                    while (true) {
                                                                                                                        int n19 = 0;
                                                                                                                        Label_0605: {
                                                                                                                            if (fc.1 != 0) {
                                                                                                                                n19 = 1606496570;
                                                                                                                                break Label_0605;
                                                                                                                            }
                                                                                                                            n19 = -779616960;
                                                                                                                        }
                                                                                                                        switch (n19 ^ 0x2F039B5D) {
                                                                                                                            case -1831381871: {
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            default: {
                                                                                                                                a2[n18] = Blocks.field_190991_dz;
                                                                                                                                final int n20 = 15;
                                                                                                                                while (true) {
                                                                                                                                    int n21 = 0;
                                                                                                                                    Label_0658: {
                                                                                                                                        if (fc.0 != 0) {
                                                                                                                                            n21 = -2135953790;
                                                                                                                                            break Label_0658;
                                                                                                                                        }
                                                                                                                                        n21 = -828602836;
                                                                                                                                    }
                                                                                                                                    switch (n21 ^ 0xF2A584BC) {
                                                                                                                                        case -1312297459: {
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        default: {
                                                                                                                                            a2[n20] = Blocks.field_190975_dA;
                                                                                                                                            while (true) {
                                                                                                                                                int n22 = 0;
                                                                                                                                                Label_0707: {
                                                                                                                                                    if (fc.c < 0) {
                                                                                                                                                        n22 = 1202575557;
                                                                                                                                                        break Label_0707;
                                                                                                                                                    }
                                                                                                                                                    n22 = -285260620;
                                                                                                                                                }
                                                                                                                                                switch (n22 ^ 0xE0AE100F) {
                                                                                                                                                    case -2025308021: {
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    default: {
                                                                                                                                                        fby.0 = Arrays.asList(a2);
                                                                                                                                                        fby.c = new double[] { 0.05, 0.95 };
                                                                                                                                                        fby.0 = new double[] { 0.05, 0.95 };
                                                                                                                                                        fby.1 = new double[] { 0.05, 0.95 };
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    case -1492924214: {
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        case 1913285182: {
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            case 1891805799: {
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case -1074694022: {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    case -924256619: {
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
                            case -1733921451: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 88211005: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static float[] c(final int p0, final int p1, final int p2, final EnumFacing p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          66
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            58
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            50
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: aload_3        
        //    28: dconst_1       
        //    29: goto            33
        //    32: athrow         
        //    33: invokestatic    dev/nuker/pyro/fby.c:(IIILnet/minecraft/util/EnumFacing;D)[F
        //    36: goto            40
        //    39: athrow         
        //    40: areturn        
        //    41: pop            
        //    42: goto            24
        //    45: pop            
        //    46: aconst_null    
        //    47: goto            41
        //    50: dup            
        //    51: ifnull          41
        //    54: checkcast       Ljava/lang/Throwable;
        //    57: athrow         
        //    58: dup            
        //    59: ifnull          45
        //    62: checkcast       Ljava/lang/Throwable;
        //    65: athrow         
        //    66: aconst_null    
        //    67: athrow         
        //    StackMapTable: 00 0D 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 04 01 01 01 07 00 82 00 00 47 07 00 27 FF 00 00 00 04 01 01 01 07 00 82 00 05 01 01 01 07 00 82 03 45 07 00 27 40 07 00 D8 40 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     50     58     Any
        //  50     58     50     58     Ljava/lang/ArithmeticException;
        //  66     68     3      8      Ljava/lang/ClassCastException;
        //  32     39     39     40     Any
        //  32     39     32     33     Any
        //  32     39     39     40     Ljava/lang/UnsupportedOperationException;
        //  33     39     32     33     Any
        //  32     39     3      8      Any
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
    
    public static fbB 2(final BlockPos blockPos) {
        return fbS.1O(null, 847779672, blockPos);
    }
    
    public static boolean 0(final BlockPos blockPos) {
        return fbS.4H(null, 1275858210, blockPos);
    }
    
    public static float[] c(final int p0, final int p1, final int p2, final EnumFacing p3, final double p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          224
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            216
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            208
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_0        
        //    25: i2d            
        //    26: ldc2_w          0.5
        //    29: dadd           
        //    30: aload_3        
        //    31: goto            35
        //    34: athrow         
        //    35: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //    38: goto            42
        //    41: athrow         
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   net/minecraft/util/math/Vec3i.func_177958_n:()I
        //    49: goto            53
        //    52: athrow         
        //    53: i2d            
        //    54: dload           4
        //    56: dmul           
        //    57: ldc2_w          2.0
        //    60: ddiv           
        //    61: dadd           
        //    62: iload_1        
        //    63: i2d            
        //    64: ldc2_w          0.5
        //    67: dadd           
        //    68: aload_3        
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            81
        //    75: ldc_w           -1658064243
        //    78: goto            84
        //    81: ldc_w           -814492624
        //    84: ldc_w           -104102112
        //    87: ixor           
        //    88: lookupswitch {
        //          1692431789: 197
        //          1842683051: 81
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   net/minecraft/util/math/Vec3i.func_177956_o:()I
        //   134: goto            138
        //   137: athrow         
        //   138: i2d            
        //   139: dload           4
        //   141: dmul           
        //   142: ldc2_w          2.0
        //   145: ddiv           
        //   146: dadd           
        //   147: iload_2        
        //   148: i2d            
        //   149: ldc2_w          0.5
        //   152: dadd           
        //   153: aload_3        
        //   154: goto            158
        //   157: athrow         
        //   158: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //   161: goto            165
        //   164: athrow         
        //   165: goto            169
        //   168: athrow         
        //   169: invokevirtual   net/minecraft/util/math/Vec3i.func_177952_p:()I
        //   172: goto            176
        //   175: athrow         
        //   176: i2d            
        //   177: dload           4
        //   179: dmul           
        //   180: ldc2_w          2.0
        //   183: ddiv           
        //   184: dadd           
        //   185: goto            189
        //   188: athrow         
        //   189: invokestatic    dev/nuker/pyro/fby.c:(DDD)[F
        //   192: goto            196
        //   195: athrow         
        //   196: areturn        
        //   197: aconst_null    
        //   198: athrow         
        //   199: pop            
        //   200: goto            24
        //   203: pop            
        //   204: aconst_null    
        //   205: goto            199
        //   208: dup            
        //   209: ifnull          199
        //   212: checkcast       Ljava/lang/Throwable;
        //   215: athrow         
        //   216: dup            
        //   217: ifnull          203
        //   220: checkcast       Ljava/lang/Throwable;
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //    StackMapTable: 00 29 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 05 01 01 01 07 00 82 03 00 00 FF 00 09 00 00 00 01 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 02 03 07 00 82 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 02 03 07 02 1D 42 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 02 03 07 02 1D 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 02 03 01 FF 00 1B 00 05 01 01 01 07 00 82 03 00 03 03 03 07 00 82 FF 00 02 00 05 01 01 01 07 00 82 03 00 04 03 03 07 00 82 01 FF 00 1F 00 05 01 01 01 07 00 82 03 00 03 03 03 07 00 82 42 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 07 00 82 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 07 02 1D 42 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 07 02 1D 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 01 52 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 04 03 03 03 07 00 82 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 04 03 03 03 07 02 1D FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 04 03 03 03 07 02 1D 45 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 04 03 03 03 01 FF 00 0B 00 00 00 01 07 00 27 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 03 45 07 00 27 40 07 00 D8 FF 00 00 00 05 01 01 01 07 00 82 03 00 03 03 03 07 00 82 41 07 00 88 43 05 44 07 00 88 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     208    216    Ljava/lang/IllegalStateException;
        //  208    216    208    216    Ljava/lang/StringIndexOutOfBoundsException;
        //  224    226    3      8      Any
        //  35     41     41     42     Any
        //  35     41     3      8      Any
        //  35     41     3      8      Any
        //  35     41     3      8      Ljava/util/NoSuchElementException;
        //  35     41     3      8      Ljava/lang/ArithmeticException;
        //  45     52     52     53     Any
        //  45     52     45     46     Any
        //  46     52     52     53     Any
        //  45     52     52     53     Any
        //  45     52     3      8      Ljava/lang/ClassCastException;
        //  119    126    126    127    Any
        //  119    126    119    120    Any
        //  120    126    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  120    126    3      8      Ljava/lang/NegativeArraySizeException;
        //  120    126    3      8      Ljava/lang/ArithmeticException;
        //  130    137    137    138    Any
        //  130    137    3      8      Any
        //  131    137    130    131    Ljava/lang/NegativeArraySizeException;
        //  130    137    130    131    Any
        //  131    137    137    138    Ljava/lang/RuntimeException;
        //  157    164    164    165    Any
        //  157    164    3      8      Ljava/lang/NullPointerException;
        //  158    164    3      8      Any
        //  158    164    157    158    Any
        //  157    164    157    158    Any
        //  169    175    175    176    Any
        //  169    175    175    176    Any
        //  169    175    3      8      Any
        //  169    175    175    176    Ljava/lang/NumberFormatException;
        //  169    175    175    176    Ljava/util/NoSuchElementException;
        //  189    195    195    196    Any
        //  189    195    195    196    Any
        //  189    195    195    196    Ljava/lang/StringIndexOutOfBoundsException;
        //  189    195    195    196    Ljava/lang/NumberFormatException;
        //  189    195    195    196    Any
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
    
    public static fbw c(final BlockPos p0, final float p1, final boolean p2, final boolean p3, final boolean p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3317
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            3309
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3301
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    32: goto            36
        //    35: athrow         
        //    36: astore          6
        //    38: aload           6
        //    40: getstatic       dev/nuker/pyro/fc.0:I
        //    43: ifeq            52
        //    46: ldc_w           1247911543
        //    49: goto            55
        //    52: ldc_w           -359897
        //    55: ldc_w           -919657831
        //    58: ixor           
        //    59: lookupswitch {
        //          -2091991826: 52
        //          919969982: 84
        //          default: 3240
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //    93: goto            97
        //    96: athrow         
        //    97: getstatic       dev/nuker/pyro/fc.c:I
        //   100: ifge            109
        //   103: ldc_w           -1768661888
        //   106: goto            112
        //   109: ldc_w           507499097
        //   112: ldc_w           -1645778053
        //   115: ixor           
        //   116: lookupswitch {
        //          -2082948830: 144
        //          192100347: 109
        //          default: 3228
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   net/minecraft/block/material/Material.func_76222_j:()Z
        //   151: goto            155
        //   154: athrow         
        //   155: ifne            162
        //   158: getstatic       dev/nuker/pyro/fbw.c:Ldev/nuker/pyro/fbw;
        //   161: areturn        
        //   162: getstatic       dev/nuker/pyro/fc.c:I
        //   165: ifge            174
        //   168: ldc_w           -1065784131
        //   171: goto            177
        //   174: ldc_w           -1619330053
        //   177: ldc_w           498249275
        //   180: ixor           
        //   181: lookupswitch {
        //          -573848954: 3246
        //          376755170: 174
        //          default: 208
        //        }
        //   208: aload_0        
        //   209: goto            213
        //   212: athrow         
        //   213: invokestatic    dev/nuker/pyro/fby.0:(Lnet/minecraft/util/math/BlockPos;)Z
        //   216: goto            220
        //   219: athrow         
        //   220: ifne            227
        //   223: getstatic       dev/nuker/pyro/fbw.0:Ldev/nuker/pyro/fbw;
        //   226: areturn        
        //   227: new             Lnet/minecraft/util/math/Vec3d;
        //   230: dup            
        //   231: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   234: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   237: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   240: getstatic       dev/nuker/pyro/fc.c:I
        //   243: ifge            252
        //   246: ldc_w           1929968632
        //   249: goto            255
        //   252: ldc_w           1391113327
        //   255: ldc_w           1436362835
        //   258: ixor           
        //   259: lookupswitch {
        //          647353259: 3262
        //          1682376860: 252
        //          default: 284
        //        }
        //   284: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   287: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   290: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   293: getstatic       dev/nuker/pyro/fc.1:I
        //   296: ifeq            305
        //   299: ldc_w           1023225329
        //   302: goto            308
        //   305: ldc_w           229303915
        //   308: ldc_w           1330042426
        //   311: ixor           
        //   312: lookupswitch {
        //          1122775121: 340
        //          1941699531: 305
        //          default: 3224
        //        }
        //   340: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   343: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   346: goto            350
        //   349: athrow         
        //   350: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   353: goto            357
        //   356: athrow         
        //   357: f2d            
        //   358: dadd           
        //   359: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //   362: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   365: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   368: getstatic       dev/nuker/pyro/fc.c:I
        //   371: ifge            380
        //   374: ldc_w           -22551067
        //   377: goto            383
        //   380: ldc_w           950031079
        //   383: ldc_w           1253141944
        //   386: ixor           
        //   387: lookupswitch {
        //          -1273591715: 380
        //          1913732959: 412
        //          default: 3248
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   419: goto            423
        //   422: athrow         
        //   423: astore          7
        //   425: goto            429
        //   428: athrow         
        //   429: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //   432: goto            436
        //   435: athrow         
        //   436: astore          8
        //   438: getstatic       dev/nuker/pyro/fc.c:I
        //   441: ifge            450
        //   444: ldc_w           226340591
        //   447: goto            453
        //   450: ldc_w           -1933797493
        //   453: ldc_w           265197843
        //   456: ixor           
        //   457: lookupswitch {
        //          -2089677160: 484
        //          45299708: 450
        //          default: 3218
        //        }
        //   484: aload           8
        //   486: arraylength    
        //   487: istore          9
        //   489: iconst_0       
        //   490: getstatic       dev/nuker/pyro/fc.c:I
        //   493: ifge            502
        //   496: ldc_w           527223168
        //   499: goto            505
        //   502: ldc_w           1473861852
        //   505: ldc_w           -2023455374
        //   508: ixor           
        //   509: lookupswitch {
        //          -1744286478: 502
        //          -792863314: 536
        //          default: 3214
        //        }
        //   536: istore          10
        //   538: iload           10
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            552
        //   546: ldc_w           -154955068
        //   549: goto            555
        //   552: ldc_w           440936634
        //   555: ldc_w           -2040749374
        //   558: ixor           
        //   559: lookupswitch {
        //          -1676375432: 584
        //          1889480710: 552
        //          default: 3260
        //        }
        //   584: iload           9
        //   586: if_icmpge       595
        //   589: ldc_w           1678029540
        //   592: goto            598
        //   595: ldc_w           1678029541
        //   598: ldc_w           864065496
        //   601: ixor           
        //   602: tableswitch {
        //          -1358411144: 624
        //          -1358411143: 3196
        //          default: 589
        //        }
        //   624: aload           8
        //   626: iload           10
        //   628: aaload         
        //   629: astore          11
        //   631: aload_0        
        //   632: getstatic       dev/nuker/pyro/fc.0:I
        //   635: ifeq            644
        //   638: ldc_w           -1174726733
        //   641: goto            647
        //   644: ldc_w           756255825
        //   647: ldc_w           606144541
        //   650: ixor           
        //   651: lookupswitch {
        //          -1646649426: 644
        //          154305612: 676
        //          default: 3206
        //        }
        //   676: aload           11
        //   678: goto            682
        //   681: athrow         
        //   682: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   685: goto            689
        //   688: athrow         
        //   689: astore          12
        //   691: aload           11
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            705
        //   699: ldc_w           -517966191
        //   702: goto            708
        //   705: ldc_w           431627083
        //   708: ldc_w           270982784
        //   711: ixor           
        //   712: lookupswitch {
        //          -251221999: 705
        //          161269195: 740
        //          default: 3216
        //        }
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //   747: goto            751
        //   750: athrow         
        //   751: astore          13
        //   753: getstatic       dev/nuker/pyro/fc.0:I
        //   756: ifeq            765
        //   759: ldc_w           -329607832
        //   762: goto            768
        //   765: ldc_w           -1390428594
        //   768: ldc_w           1409026206
        //   771: ixor           
        //   772: lookupswitch {
        //          -1079599626: 3288
        //          606326165: 765
        //          default: 800
        //        }
        //   800: aload           12
        //   802: goto            806
        //   805: athrow         
        //   806: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   809: goto            813
        //   812: athrow         
        //   813: getstatic       dev/nuker/pyro/fc.c:I
        //   816: ifge            825
        //   819: ldc_w           -779184494
        //   822: goto            828
        //   825: ldc_w           -1076382718
        //   828: ldc_w           -1991556251
        //   831: ixor           
        //   832: lookupswitch {
        //          875592039: 825
        //          1489360375: 3268
        //          default: 860
        //        }
        //   860: goto            864
        //   863: athrow         
        //   864: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   869: goto            873
        //   872: athrow         
        //   873: aload           12
        //   875: goto            879
        //   878: athrow         
        //   879: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   882: goto            886
        //   885: athrow         
        //   886: iconst_0       
        //   887: goto            891
        //   890: athrow         
        //   891: invokevirtual   net/minecraft/block/Block.func_176209_a:(Lnet/minecraft/block/state/IBlockState;Z)Z
        //   894: goto            898
        //   897: athrow         
        //   898: ifeq            3190
        //   901: new             Lnet/minecraft/util/math/Vec3d;
        //   904: dup            
        //   905: getstatic       dev/nuker/pyro/fc.0:I
        //   908: ifeq            917
        //   911: ldc_w           -45970152
        //   914: goto            920
        //   917: ldc_w           2032631145
        //   920: ldc_w           -561613455
        //   923: ixor           
        //   924: lookupswitch {
        //          -1482618856: 952
        //          600111209: 917
        //          default: 3256
        //        }
        //   952: aload           12
        //   954: getstatic       dev/nuker/pyro/fc.c:I
        //   957: ifge            966
        //   960: ldc_w           643323057
        //   963: goto            969
        //   966: ldc_w           1024809269
        //   969: ldc_w           472399041
        //   972: ixor           
        //   973: lookupswitch {
        //          557671924: 1000
        //          980445296: 966
        //          default: 3238
        //        }
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: ldc2_w          0.5
        //  1014: ldc2_w          0.5
        //  1017: ldc2_w          0.5
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: new             Lnet/minecraft/util/math/Vec3d;
        //  1034: dup            
        //  1035: aload           13
        //  1037: goto            1041
        //  1040: athrow         
        //  1041: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //  1044: goto            1048
        //  1047: athrow         
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: ldc2_w          0.5
        //  1062: goto            1066
        //  1065: athrow         
        //  1066: invokevirtual   net/minecraft/util/math/Vec3d.func_186678_a:(D)Lnet/minecraft/util/math/Vec3d;
        //  1069: goto            1073
        //  1072: athrow         
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: astore          14
        //  1086: aload           7
        //  1088: aload           14
        //  1090: goto            1094
        //  1093: athrow         
        //  1094: invokevirtual   net/minecraft/util/math/Vec3d.func_72438_d:(Lnet/minecraft/util/math/Vec3d;)D
        //  1097: goto            1101
        //  1100: athrow         
        //  1101: fload_1        
        //  1102: f2d            
        //  1103: dcmpg          
        //  1104: ifgt            3190
        //  1107: getstatic       dev/nuker/pyro/fc.0:I
        //  1110: ifeq            1119
        //  1113: ldc_w           -1885584910
        //  1116: goto            1122
        //  1119: ldc_w           1869702761
        //  1122: ldc_w           284068952
        //  1125: ixor           
        //  1126: lookupswitch {
        //          -1619866198: 1119
        //          2141186609: 1152
        //          default: 3232
        //        }
        //  1152: aload           12
        //  1154: goto            1158
        //  1157: athrow         
        //  1158: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1161: goto            1165
        //  1164: athrow         
        //  1165: goto            1169
        //  1168: athrow         
        //  1169: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: astore          15
        //  1180: aload           15
        //  1182: getstatic       dev/nuker/pyro/fc.1:I
        //  1185: ifeq            1194
        //  1188: ldc_w           872000201
        //  1191: goto            1197
        //  1194: ldc_w           -1591549797
        //  1197: ldc_w           -816280767
        //  1200: ixor           
        //  1201: lookupswitch {
        //          -1292527517: 1194
        //          -56548984: 3258
        //          default: 1228
        //        }
        //  1228: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1231: getstatic       dev/nuker/pyro/fc.1:I
        //  1234: ifeq            1243
        //  1237: ldc_w           -1798048367
        //  1240: goto            1246
        //  1243: ldc_w           2095302652
        //  1246: ldc_w           254562974
        //  1249: ixor           
        //  1250: lookupswitch {
        //          -2133960026: 1243
        //          -1677744369: 3252
        //          default: 1276
        //        }
        //  1276: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1279: getstatic       dev/nuker/pyro/fc.0:I
        //  1282: ifeq            1291
        //  1285: ldc_w           -513839073
        //  1288: goto            1294
        //  1291: ldc_w           -1811445086
        //  1294: ldc_w           575794794
        //  1297: ixor           
        //  1298: lookupswitch {
        //          -1235852088: 1324
        //          -1022452107: 1291
        //          default: 3250
        //        }
        //  1324: aload_0        
        //  1325: aload_0        
        //  1326: goto            1330
        //  1329: athrow         
        //  1330: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1333: goto            1337
        //  1336: athrow         
        //  1337: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1340: getstatic       dev/nuker/pyro/fc.0:I
        //  1343: ifeq            1352
        //  1346: ldc_w           -192528312
        //  1349: goto            1355
        //  1352: ldc_w           -1592409912
        //  1355: ldc_w           1176160355
        //  1358: ixor           
        //  1359: lookupswitch {
        //          -1298364373: 1352
        //          -418445141: 1384
        //          default: 3270
        //        }
        //  1384: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1387: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1390: aload           11
        //  1392: fconst_0       
        //  1393: fconst_0       
        //  1394: fconst_0       
        //  1395: goto            1399
        //  1398: athrow         
        //  1399: invokevirtual   net/minecraft/block/Block.func_180639_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z
        //  1402: goto            1406
        //  1405: athrow         
        //  1406: istore          16
        //  1408: getstatic       dev/nuker/pyro/fby.c:Ljava/util/List;
        //  1411: aload           15
        //  1413: getstatic       dev/nuker/pyro/fc.1:I
        //  1416: ifeq            1425
        //  1419: ldc_w           760571945
        //  1422: goto            1428
        //  1425: ldc_w           662157719
        //  1428: ldc_w           -1478338101
        //  1431: ixor           
        //  1432: lookupswitch {
        //          -2137661348: 1460
        //          -1967705630: 1425
        //          default: 3272
        //        }
        //  1460: goto            1464
        //  1463: athrow         
        //  1464: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1469: goto            1473
        //  1472: athrow         
        //  1473: ifne            1536
        //  1476: getstatic       dev/nuker/pyro/fby.0:Ljava/util/List;
        //  1479: aload           15
        //  1481: goto            1485
        //  1484: athrow         
        //  1485: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1490: goto            1494
        //  1493: athrow         
        //  1494: ifne            1536
        //  1497: iload           16
        //  1499: ifeq            1508
        //  1502: ldc_w           -201067169
        //  1505: goto            1511
        //  1508: ldc_w           -201067170
        //  1511: ldc_w           1306885943
        //  1514: ixor           
        //  1515: tableswitch {
        //          1942820048: 1536
        //          1942820049: 1670
        //          default: 1502
        //        }
        //  1536: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1539: getstatic       dev/nuker/pyro/fc.0:I
        //  1542: ifeq            1551
        //  1545: ldc_w           -653039801
        //  1548: goto            1554
        //  1551: ldc_w           535390958
        //  1554: ldc_w           1318279412
        //  1557: ixor           
        //  1558: lookupswitch {
        //          -1753202765: 1551
        //          1366962714: 1584
        //          default: 3264
        //        }
        //  1584: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1587: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1590: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1593: dup            
        //  1594: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1597: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1600: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1603: getstatic       dev/nuker/pyro/fc.1:I
        //  1606: ifeq            1615
        //  1609: ldc_w           -197148186
        //  1612: goto            1618
        //  1615: ldc_w           306789112
        //  1618: ldc_w           -828911642
        //  1621: ixor           
        //  1622: lookupswitch {
        //          524019085: 1615
        //          984092160: 3286
        //          default: 1648
        //        }
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1666: goto            1670
        //  1669: athrow         
        //  1670: aconst_null    
        //  1671: astore          17
        //  1673: getstatic       dev/nuker/pyro/fc.c:I
        //  1676: ifge            1685
        //  1679: ldc_w           -857599757
        //  1682: goto            1688
        //  1685: ldc_w           -666633162
        //  1688: ldc_w           -1947791247
        //  1691: ixor           
        //  1692: lookupswitch {
        //          1191510146: 1685
        //          1403317319: 1720
        //          default: 3236
        //        }
        //  1720: iload           5
        //  1722: ifeq            2219
        //  1725: getstatic       dev/nuker/pyro/fc.c:I
        //  1728: ifge            1737
        //  1731: ldc_w           732046106
        //  1734: goto            1740
        //  1737: ldc_w           326916910
        //  1740: ldc_w           -1315687310
        //  1743: ixor           
        //  1744: lookupswitch {
        //          -1707731096: 3280
        //          -999973129: 1737
        //          default: 1772
        //        }
        //  1772: goto            1776
        //  1775: athrow         
        //  1776: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  1779: goto            1783
        //  1782: athrow         
        //  1783: getstatic       dev/nuker/pyro/fc.1:I
        //  1786: ifeq            1795
        //  1789: ldc_w           288608889
        //  1792: goto            1798
        //  1795: ldc_w           243554992
        //  1798: ldc_w           520643116
        //  1801: ixor           
        //  1802: lookupswitch {
        //          238792789: 1795
        //          294402204: 1828
        //          default: 3290
        //        }
        //  1828: aload           12
        //  1830: aload           11
        //  1832: goto            1836
        //  1835: athrow         
        //  1836: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  1839: goto            1843
        //  1842: athrow         
        //  1843: getstatic       dev/nuker/pyro/fc.1:I
        //  1846: ifeq            1855
        //  1849: ldc_w           705994052
        //  1852: goto            1858
        //  1855: ldc_w           1823571425
        //  1858: ldc_w           1391034371
        //  1861: ixor           
        //  1862: lookupswitch {
        //          1046019554: 1888
        //          2029854023: 1855
        //          default: 3274
        //        }
        //  1888: goto            1892
        //  1891: athrow         
        //  1892: invokevirtual   dev/nuker/pyro/fbP.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)[F
        //  1895: goto            1899
        //  1898: athrow         
        //  1899: astore          18
        //  1901: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1904: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1907: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1910: new             Lnet/minecraft/network/play/client/CPacketPlayer$Rotation;
        //  1913: dup            
        //  1914: aload           18
        //  1916: iconst_0       
        //  1917: faload         
        //  1918: getstatic       dev/nuker/pyro/fc.0:I
        //  1921: ifeq            1930
        //  1924: ldc_w           1292231586
        //  1927: goto            1933
        //  1930: ldc_w           842848052
        //  1933: ldc_w           1252651992
        //  1936: ixor           
        //  1937: lookupswitch {
        //          -398034787: 1930
        //          128716922: 3208
        //          default: 1964
        //        }
        //  1964: aload           18
        //  1966: iconst_1       
        //  1967: faload         
        //  1968: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  1971: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1974: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1977: getstatic       dev/nuker/pyro/fc.1:I
        //  1980: ifeq            1989
        //  1983: ldc_w           710685145
        //  1986: goto            1992
        //  1989: ldc_w           310955043
        //  1992: ldc_w           934281046
        //  1995: ixor           
        //  1996: lookupswitch {
        //          502517391: 3254
        //          1766036181: 1989
        //          default: 2024
        //        }
        //  2024: goto            2028
        //  2027: athrow         
        //  2028: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Rotation.<init>:(FFZ)V
        //  2031: goto            2035
        //  2034: athrow         
        //  2035: goto            2039
        //  2038: athrow         
        //  2039: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2042: goto            2046
        //  2045: athrow         
        //  2046: getstatic       dev/nuker/pyro/fc.1:I
        //  2049: ifeq            2058
        //  2052: ldc_w           -1878110916
        //  2055: goto            2061
        //  2058: ldc_w           935510296
        //  2061: ldc_w           71242455
        //  2064: ixor           
        //  2065: lookupswitch {
        //          -1808703509: 2058
        //          872272847: 2092
        //          default: 3202
        //        }
        //  2092: getstatic       dev/nuker/pyro/Pyro.rotationManager:Ldev/nuker/pyro/fU;
        //  2095: aload           18
        //  2097: iconst_0       
        //  2098: faload         
        //  2099: goto            2103
        //  2102: athrow         
        //  2103: invokevirtual   dev/nuker/pyro/fU.0:(F)V
        //  2106: goto            2110
        //  2109: athrow         
        //  2110: getstatic       dev/nuker/pyro/fc.1:I
        //  2113: ifeq            2122
        //  2116: ldc_w           1670912240
        //  2119: goto            2125
        //  2122: ldc_w           -456635682
        //  2125: ldc_w           -1582797043
        //  2128: ixor           
        //  2129: lookupswitch {
        //          -1037010947: 3284
        //          -778300238: 2122
        //          default: 2156
        //        }
        //  2156: getstatic       dev/nuker/pyro/Pyro.rotationManager:Ldev/nuker/pyro/fU;
        //  2159: getstatic       dev/nuker/pyro/fc.0:I
        //  2162: ifeq            2171
        //  2165: ldc_w           367763896
        //  2168: goto            2174
        //  2171: ldc_w           2054587160
        //  2174: ldc_w           144346934
        //  2177: ixor           
        //  2178: lookupswitch {
        //          493956750: 2171
        //          1928072238: 2204
        //          default: 3226
        //        }
        //  2204: aload           18
        //  2206: iconst_1       
        //  2207: faload         
        //  2208: goto            2212
        //  2211: athrow         
        //  2212: invokevirtual   dev/nuker/pyro/fU.c:(F)V
        //  2215: goto            2219
        //  2218: athrow         
        //  2219: iload           4
        //  2221: ifeq            2230
        //  2224: ldc_w           -1574650856
        //  2227: goto            2233
        //  2230: ldc_w           -1574650855
        //  2233: ldc_w           -220322414
        //  2236: ixor           
        //  2237: tableswitch {
        //          -1577766124: 2260
        //          -1577766123: 2536
        //          default: 2224
        //        }
        //  2260: getstatic       dev/nuker/pyro/fc.c:I
        //  2263: ifge            2272
        //  2266: ldc_w           964012281
        //  2269: goto            2275
        //  2272: ldc_w           1461382122
        //  2275: ldc_w           -1868001140
        //  2278: ixor           
        //  2279: lookupswitch {
        //          -1445119883: 3244
        //          521934567: 2272
        //          default: 2304
        //        }
        //  2304: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2307: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2310: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2313: getstatic       dev/nuker/pyro/fc.1:I
        //  2316: ifeq            2325
        //  2319: ldc_w           597985439
        //  2322: goto            2328
        //  2325: ldc_w           -1168385803
        //  2328: ldc_w           -738832708
        //  2331: ixor           
        //  2332: lookupswitch {
        //          -263010781: 2325
        //          1772983881: 2360
        //          default: 3230
        //        }
        //  2360: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2363: aload           12
        //  2365: getstatic       dev/nuker/pyro/fc.0:I
        //  2368: ifeq            2377
        //  2371: ldc_w           -478246095
        //  2374: goto            2380
        //  2377: ldc_w           -682788708
        //  2380: ldc_w           -1349704745
        //  2383: ixor           
        //  2384: lookupswitch {
        //          1291036902: 2377
        //          2025872203: 2412
        //          default: 3220
        //        }
        //  2412: aload           13
        //  2414: getstatic       dev/nuker/pyro/fc.c:I
        //  2417: ifge            2426
        //  2420: ldc_w           956060403
        //  2423: goto            2429
        //  2426: ldc_w           -1286333169
        //  2429: ldc_w           600710376
        //  2432: ixor           
        //  2433: lookupswitch {
        //          456281627: 3234
        //          1985822812: 2426
        //          default: 2460
        //        }
        //  2460: aload           14
        //  2462: iload_3        
        //  2463: ifeq            2472
        //  2466: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  2469: goto            2475
        //  2472: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  2475: getstatic       dev/nuker/pyro/fc.c:I
        //  2478: ifge            2487
        //  2481: ldc_w           -1898812617
        //  2484: goto            2490
        //  2487: ldc_w           -1196525104
        //  2490: ldc_w           -1306081379
        //  2493: ixor           
        //  2494: lookupswitch {
        //          176733773: 2520
        //          1022667946: 2487
        //          default: 3278
        //        }
        //  2520: goto            2524
        //  2523: athrow         
        //  2524: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //  2527: goto            2531
        //  2530: athrow         
        //  2531: astore          17
        //  2533: goto            2814
        //  2536: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2539: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  2542: getstatic       dev/nuker/pyro/fc.c:I
        //  2545: ifge            2554
        //  2548: ldc_w           -769639105
        //  2551: goto            2557
        //  2554: ldc_w           -157659327
        //  2557: ldc_w           228222729
        //  2560: ixor           
        //  2561: lookupswitch {
        //          -541435338: 3204
        //          1465606934: 2554
        //          default: 2588
        //        }
        //  2588: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2591: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2594: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2597: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2600: aload           12
        //  2602: aload           13
        //  2604: aload           14
        //  2606: getstatic       dev/nuker/pyro/fc.c:I
        //  2609: ifge            2618
        //  2612: ldc_w           1500310917
        //  2615: goto            2621
        //  2618: ldc_w           -355240329
        //  2621: ldc_w           -1418381926
        //  2624: ixor           
        //  2625: lookupswitch {
        //          -233187297: 3200
        //          765407251: 2618
        //          default: 2652
        //        }
        //  2652: iload_3        
        //  2653: ifeq            2662
        //  2656: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  2659: goto            2711
        //  2662: getstatic       dev/nuker/pyro/fc.0:I
        //  2665: ifeq            2674
        //  2668: ldc_w           115173826
        //  2671: goto            2677
        //  2674: ldc_w           -1297203618
        //  2677: ldc_w           557779044
        //  2680: ixor           
        //  2681: lookupswitch {
        //          -1819199942: 2708
        //          669147558: 2674
        //          default: 3266
        //        }
        //  2708: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  2711: getstatic       dev/nuker/pyro/fc.1:I
        //  2714: ifeq            2723
        //  2717: ldc_w           -1347962079
        //  2720: goto            2726
        //  2723: ldc_w           -2035522999
        //  2726: ldc_w           1210994742
        //  2729: ixor           
        //  2730: lookupswitch {
        //          -410391785: 3210
        //          569307652: 2723
        //          default: 2756
        //        }
        //  2756: goto            2760
        //  2759: athrow         
        //  2760: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187099_a:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //  2763: goto            2767
        //  2766: athrow         
        //  2767: getstatic       dev/nuker/pyro/fc.0:I
        //  2770: ifeq            2779
        //  2773: ldc_w           1392142726
        //  2776: goto            2782
        //  2779: ldc_w           -401746716
        //  2782: ldc_w           1723161360
        //  2785: ixor           
        //  2786: lookupswitch {
        //          -1560985228: 2779
        //          877605526: 3222
        //          default: 2812
        //        }
        //  2812: astore          17
        //  2814: aload           17
        //  2816: getstatic       net/minecraft/util/EnumActionResult.FAIL:Lnet/minecraft/util/EnumActionResult;
        //  2819: if_acmpeq       2828
        //  2822: ldc_w           1991864592
        //  2825: goto            2831
        //  2828: ldc_w           1991864595
        //  2831: ldc_w           -833874195
        //  2834: ixor           
        //  2835: tableswitch {
        //          1911214074: 2856
        //          1911214075: 3190
        //          default: 2822
        //        }
        //  2856: iload_2        
        //  2857: ifeq            2866
        //  2860: ldc_w           953465862
        //  2863: goto            2869
        //  2866: ldc_w           953465863
        //  2869: ldc_w           2079831890
        //  2872: ixor           
        //  2873: tableswitch {
        //          -2042227032: 2896
        //          -2042227031: 2983
        //          default: 2860
        //        }
        //  2896: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2899: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2902: getstatic       dev/nuker/pyro/fc.c:I
        //  2905: ifge            2914
        //  2908: ldc_w           1537296100
        //  2911: goto            2917
        //  2914: ldc_w           -2042792362
        //  2917: ldc_w           1159075924
        //  2920: ixor           
        //  2921: lookupswitch {
        //          -2056933856: 2914
        //          515333808: 3276
        //          default: 2948
        //        }
        //  2948: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2951: new             Lnet/minecraft/network/play/client/CPacketAnimation;
        //  2954: dup            
        //  2955: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  2958: goto            2962
        //  2961: athrow         
        //  2962: invokespecial   net/minecraft/network/play/client/CPacketAnimation.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  2965: goto            2969
        //  2968: athrow         
        //  2969: goto            2973
        //  2972: athrow         
        //  2973: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2976: goto            2980
        //  2979: athrow         
        //  2980: goto            3003
        //  2983: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  2986: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2989: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  2992: goto            2996
        //  2995: athrow         
        //  2996: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //  2999: goto            3003
        //  3002: athrow         
        //  3003: getstatic       dev/nuker/pyro/fc.0:I
        //  3006: ifeq            3015
        //  3009: ldc_w           -889145195
        //  3012: goto            3018
        //  3015: ldc_w           1707419500
        //  3018: ldc_w           406029534
        //  3021: ixor           
        //  3022: lookupswitch {
        //          -751616949: 3015
        //          2113315762: 3048
        //          default: 3212
        //        }
        //  3048: iload           16
        //  3050: ifeq            3186
        //  3053: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  3056: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3059: getstatic       dev/nuker/pyro/fc.c:I
        //  3062: ifge            3071
        //  3065: ldc_w           1175985612
        //  3068: goto            3074
        //  3071: ldc_w           2129103083
        //  3074: ldc_w           -671726075
        //  3077: ixor           
        //  3078: lookupswitch {
        //          -1846649911: 3071
        //          -1458450706: 3104
        //          default: 3242
        //        }
        //  3104: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  3107: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  3110: dup            
        //  3111: getstatic       dev/nuker/pyro/fby.c:Lnet/minecraft/client/Minecraft;
        //  3114: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3117: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  3120: getstatic       dev/nuker/pyro/fc.c:I
        //  3123: ifge            3132
        //  3126: ldc_w           -138968369
        //  3129: goto            3135
        //  3132: ldc_w           -203796775
        //  3135: ldc_w           -330361784
        //  3138: ixor           
        //  3139: lookupswitch {
        //          469276295: 3132
        //          529881745: 3164
        //          default: 3282
        //        }
        //  3164: goto            3168
        //  3167: athrow         
        //  3168: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  3171: goto            3175
        //  3174: athrow         
        //  3175: goto            3179
        //  3178: athrow         
        //  3179: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  3182: goto            3186
        //  3185: athrow         
        //  3186: getstatic       dev/nuker/pyro/fbw.2:Ldev/nuker/pyro/fbw;
        //  3189: areturn        
        //  3190: iinc            10, 1
        //  3193: goto            538
        //  3196: getstatic       dev/nuker/pyro/fbw.1:Ldev/nuker/pyro/fbw;
        //  3199: areturn        
        //  3200: aconst_null    
        //  3201: athrow         
        //  3202: aconst_null    
        //  3203: athrow         
        //  3204: aconst_null    
        //  3205: athrow         
        //  3206: aconst_null    
        //  3207: athrow         
        //  3208: aconst_null    
        //  3209: athrow         
        //  3210: aconst_null    
        //  3211: athrow         
        //  3212: aconst_null    
        //  3213: athrow         
        //  3214: aconst_null    
        //  3215: athrow         
        //  3216: aconst_null    
        //  3217: athrow         
        //  3218: aconst_null    
        //  3219: athrow         
        //  3220: aconst_null    
        //  3221: athrow         
        //  3222: aconst_null    
        //  3223: athrow         
        //  3224: aconst_null    
        //  3225: athrow         
        //  3226: aconst_null    
        //  3227: athrow         
        //  3228: aconst_null    
        //  3229: athrow         
        //  3230: aconst_null    
        //  3231: athrow         
        //  3232: aconst_null    
        //  3233: athrow         
        //  3234: aconst_null    
        //  3235: athrow         
        //  3236: aconst_null    
        //  3237: athrow         
        //  3238: aconst_null    
        //  3239: athrow         
        //  3240: aconst_null    
        //  3241: athrow         
        //  3242: aconst_null    
        //  3243: athrow         
        //  3244: aconst_null    
        //  3245: athrow         
        //  3246: aconst_null    
        //  3247: athrow         
        //  3248: aconst_null    
        //  3249: athrow         
        //  3250: aconst_null    
        //  3251: athrow         
        //  3252: aconst_null    
        //  3253: athrow         
        //  3254: aconst_null    
        //  3255: athrow         
        //  3256: aconst_null    
        //  3257: athrow         
        //  3258: aconst_null    
        //  3259: athrow         
        //  3260: aconst_null    
        //  3261: athrow         
        //  3262: aconst_null    
        //  3263: athrow         
        //  3264: aconst_null    
        //  3265: athrow         
        //  3266: aconst_null    
        //  3267: athrow         
        //  3268: aconst_null    
        //  3269: athrow         
        //  3270: aconst_null    
        //  3271: athrow         
        //  3272: aconst_null    
        //  3273: athrow         
        //  3274: aconst_null    
        //  3275: athrow         
        //  3276: aconst_null    
        //  3277: athrow         
        //  3278: aconst_null    
        //  3279: athrow         
        //  3280: aconst_null    
        //  3281: athrow         
        //  3282: aconst_null    
        //  3283: athrow         
        //  3284: aconst_null    
        //  3285: athrow         
        //  3286: aconst_null    
        //  3287: athrow         
        //  3288: aconst_null    
        //  3289: athrow         
        //  3290: aconst_null    
        //  3291: athrow         
        //  3292: pop            
        //  3293: goto            24
        //  3296: pop            
        //  3297: aconst_null    
        //  3298: goto            3292
        //  3301: dup            
        //  3302: ifnull          3292
        //  3305: checkcast       Ljava/lang/Throwable;
        //  3308: athrow         
        //  3309: dup            
        //  3310: ifnull          3296
        //  3313: checkcast       Ljava/lang/Throwable;
        //  3316: athrow         
        //  3317: aconst_null    
        //  3318: athrow         
        //    StackMapTable: 01 89 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FF 00 03 00 06 07 00 80 02 01 01 01 01 00 00 FF 00 03 00 00 00 01 07 00 27 FF 00 00 00 06 07 00 80 02 01 01 01 01 00 01 07 00 80 45 07 00 27 40 07 03 D5 FF 00 0F 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 01 07 03 D5 FF 00 02 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 02 07 03 D5 01 5C 07 03 D5 42 07 00 27 40 07 03 D5 47 07 00 27 40 07 05 4A 4B 07 05 4A FF 00 02 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 02 07 05 4A 01 5F 07 05 4A 42 07 00 27 40 07 05 4A 45 07 00 27 40 01 06 0B 42 01 1E 43 07 00 88 40 07 00 80 45 07 00 27 40 01 06 FF 00 18 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 03 08 00 E3 08 00 E3 03 FF 00 02 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 04 08 00 E3 08 00 E3 03 01 FF 00 1C 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 03 08 00 E3 08 00 E3 03 FF 00 14 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 04 08 00 E3 08 00 E3 03 03 FF 00 02 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 01 FF 00 1F 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 04 08 00 E3 08 00 E3 03 03 48 07 00 18 FF 00 00 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 07 00 86 45 07 00 27 FF 00 00 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 02 FF 00 16 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 03 FF 00 02 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 06 08 00 E3 08 00 E3 03 03 03 01 FF 00 1C 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 03 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 03 45 07 00 27 40 07 00 FB FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 08 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 00 00 45 07 00 27 40 07 02 1B FC 00 0D 07 02 1B 42 01 1E FF 00 11 00 0A 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 00 01 01 FF 00 02 00 0A 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 00 02 01 01 5E 01 FC 00 01 01 4D 01 FF 00 02 00 0B 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 00 02 01 01 5C 01 04 05 42 01 19 FF 00 13 00 0C 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 00 01 07 00 80 FF 00 02 00 0C 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 01 5C 07 00 80 44 07 00 27 FF 00 00 00 0C 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 00 02 07 00 80 07 00 82 45 07 00 27 40 07 00 80 FF 00 0F 00 0D 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 82 FF 00 02 00 0D 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 02 07 00 82 01 5F 07 00 82 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 0D 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 82 45 07 00 27 40 07 00 82 FC 00 0D 07 00 82 42 01 1F FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 01 07 00 80 45 07 00 27 40 07 03 D5 4B 07 03 D5 FF 00 02 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 03 D5 01 5F 07 03 D5 42 07 00 27 40 07 03 D5 47 07 00 27 40 07 03 E4 44 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 03 E4 07 00 80 45 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 03 E4 07 03 D5 43 07 00 88 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 07 03 E4 07 03 D5 01 45 07 00 27 40 01 FF 00 12 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 08 03 85 08 03 85 FF 00 02 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 08 03 85 08 03 85 01 FF 00 1F 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 08 03 85 08 03 85 FF 00 0D 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 08 03 85 08 03 85 07 00 80 FF 00 02 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 04 08 03 85 08 03 85 07 00 80 01 FF 00 1E 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 08 03 85 08 03 85 07 00 80 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 08 03 85 08 03 85 07 00 80 45 07 00 27 40 07 00 FB FF 00 0B 00 00 00 01 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 04 07 00 FB 03 03 03 45 07 00 27 40 07 00 FB FF 00 08 00 00 00 01 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 04 07 00 FB 08 04 07 08 04 07 07 00 82 45 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 04 07 00 FB 08 04 07 08 04 07 07 02 1D 42 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 04 07 00 FB 08 04 07 08 04 07 07 02 1D 45 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 00 FB 07 00 FB 45 07 00 20 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 07 00 FB 07 00 FB 03 45 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 00 FB 07 00 FB 42 07 00 27 FF 00 00 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 07 00 FB 07 00 FB 45 07 00 27 40 07 00 FB FF 00 08 00 0F 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 00 01 07 00 10 FF 00 00 00 0F 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 00 02 07 00 FB 07 00 FB 45 07 00 27 40 03 11 42 01 1D 44 07 00 27 40 07 00 80 45 07 00 27 40 07 03 D5 42 07 00 16 40 07 03 D5 47 07 00 27 40 07 03 E4 FF 00 0F 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 01 07 03 E4 FF 00 02 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 01 5E 07 03 E4 FF 00 0E 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 2C FF 00 02 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 03 07 03 E4 07 00 2C 01 FF 00 1D 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 2C FF 00 0E 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 4A FF 00 02 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 03 07 03 E4 07 00 4A 01 FF 00 1D 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 4A 44 07 00 27 FF 00 00 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 04 07 03 E4 07 00 4A 07 00 80 07 00 80 45 07 00 27 FF 00 00 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 04 07 03 E4 07 00 4A 07 00 80 07 03 D5 FF 00 0E 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 05 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 2C FF 00 02 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 06 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 2C 01 FF 00 1C 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 05 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 2C 4D 07 00 27 FF 00 00 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 0A 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 86 07 04 98 07 00 82 02 02 02 45 07 00 27 40 01 FF 00 12 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 05 29 07 03 E4 FF 00 02 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 03 07 05 29 07 03 E4 01 FF 00 1F 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 05 29 07 03 E4 42 07 00 27 FF 00 00 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 05 29 07 03 E4 47 07 00 27 40 01 4A 07 00 27 FF 00 00 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 05 29 07 03 E4 47 07 00 27 40 01 07 05 42 01 18 4E 07 00 2C FF 00 02 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 00 2C 01 5D 07 00 2C FF 00 1E 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 05 07 03 65 08 06 36 08 06 36 07 00 86 07 05 B0 FF 00 02 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 06 07 03 65 08 06 36 08 06 36 07 00 86 07 05 B0 01 FF 00 1D 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 05 07 03 65 08 06 36 08 06 36 07 00 86 07 05 B0 42 07 00 27 FF 00 00 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 05 07 03 65 08 06 36 08 06 36 07 00 86 07 05 B0 45 07 00 27 FF 00 00 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 03 65 07 05 AE 42 07 00 27 FF 00 00 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 03 65 07 05 AE 45 07 00 27 00 FC 00 0E 05 42 01 1F 10 42 01 1F 42 07 00 88 00 45 07 00 27 40 07 01 C6 4B 07 01 C6 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 01 C6 01 5D 07 01 C6 46 07 00 0E FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 45 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 FF 00 0B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 04 07 01 C6 07 00 80 07 00 82 01 FF 00 1D 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 42 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 45 07 00 27 40 07 00 D8 FF 00 1E 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 04 07 03 65 08 07 76 08 07 76 02 FF 00 02 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 05 07 03 65 08 07 76 08 07 76 02 01 FF 00 1E 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 04 07 03 65 08 07 76 08 07 76 02 FF 00 18 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 06 07 03 65 08 07 76 08 07 76 02 02 01 FF 00 02 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 07 07 03 65 08 07 76 08 07 76 02 02 01 01 FF 00 1F 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 06 07 03 65 08 07 76 08 07 76 02 02 01 42 07 00 88 FF 00 00 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 06 07 03 65 08 07 76 08 07 76 02 02 01 45 07 00 27 FF 00 00 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 02 07 03 65 07 05 CB FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 02 07 03 65 07 05 CB 45 07 00 27 00 0B 42 01 1E 49 07 00 18 FF 00 00 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 02 07 05 E3 02 45 07 00 27 00 0B 42 01 1E 4E 07 05 E3 FF 00 02 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 02 07 05 E3 01 5D 07 05 E3 46 07 00 91 FF 00 00 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 02 07 05 E3 02 45 07 00 27 FA 00 00 04 05 42 01 1A 0B 42 01 1C FF 00 14 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 00 86 07 00 2C FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 00 86 07 00 2C 01 FF 00 1F 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 00 86 07 00 2C FF 00 10 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 00 86 07 00 4A 07 00 80 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 04 07 00 86 07 00 4A 07 00 80 01 FF 00 1F 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 00 86 07 00 4A 07 00 80 FF 00 0D 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 04 07 00 86 07 00 4A 07 00 80 07 00 82 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 05 07 00 86 07 00 4A 07 00 80 07 00 82 01 FF 00 1E 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 04 07 00 86 07 00 4A 07 00 80 07 00 82 FF 00 0B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 05 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 0B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 01 FF 00 1D 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 45 07 00 27 40 07 03 31 04 51 07 02 FA FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 02 FA 01 5E 07 02 FA FF 00 1D 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 01 FF 00 1E 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 09 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 0B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 01 FF 00 1E 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 0B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 08 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 01 FF 00 1D 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 42 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 45 07 00 27 40 07 03 31 4B 07 03 31 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 03 31 01 5D 07 03 31 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 00 07 05 42 01 18 03 05 42 01 1A 51 07 00 86 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 00 86 01 5E 07 00 86 4C 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 04 07 03 65 08 0B 87 08 0B 87 07 04 98 45 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 03 65 07 06 22 42 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 03 65 07 06 22 45 07 00 27 00 02 4B 07 00 8D FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 00 86 07 04 98 45 07 00 27 00 0B 42 01 1D 56 07 00 86 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 00 86 01 5D 07 00 86 FF 00 1B 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 05 07 03 65 08 0C 23 08 0C 23 07 00 86 07 05 B0 FF 00 02 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 06 07 03 65 08 0C 23 08 0C 23 07 00 86 07 05 B0 01 FF 00 1C 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 05 07 03 65 08 0C 23 08 0C 23 07 00 86 07 05 B0 42 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 05 07 03 65 08 0C 23 08 0C 23 07 00 86 07 05 B0 45 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 03 65 07 05 AE FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 02 07 03 65 07 05 AE 45 07 00 27 00 FF 00 03 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 00 F8 00 05 FF 00 03 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FC 00 01 07 00 D8 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 01 07 02 FA FF 00 01 00 0C 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 00 01 07 00 80 FF 00 01 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 04 07 03 65 08 07 76 08 07 76 02 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 07 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 00 FF 00 01 00 0A 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 00 01 01 FF 00 01 00 0D 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 00 01 07 00 82 FF 00 01 00 09 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 00 00 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 00 86 07 00 4A 07 00 80 41 07 03 31 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 04 08 00 E3 08 00 E3 03 03 FF 00 01 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 01 07 05 E3 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 01 07 05 4A FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 02 07 00 86 07 00 2C F8 00 01 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 04 07 00 86 07 00 4A 07 00 80 07 00 82 01 FF 00 01 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 03 08 03 85 08 03 85 07 00 80 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 01 07 03 D5 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 01 07 00 86 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 00 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 00 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 05 08 00 E3 08 00 E3 03 03 03 FF 00 01 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 4A FF 00 01 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 02 07 03 E4 07 00 2C FF 00 01 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 06 07 03 65 08 07 76 08 07 76 02 02 01 FF 00 01 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 02 08 03 85 08 03 85 FF 00 01 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 01 07 03 E4 FF 00 01 00 0B 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 00 01 01 FF 00 01 00 07 07 00 80 02 01 01 01 01 07 03 D5 00 03 08 00 E3 08 00 E3 03 FF 00 01 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 01 07 00 2C FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 02 FA 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB FF 00 01 00 0E 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 00 01 07 03 D5 FF 00 01 00 10 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 00 05 07 03 E4 07 00 4A 07 00 80 07 03 D5 07 00 2C FF 00 01 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 02 07 05 29 07 03 E4 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 03 07 01 C6 07 00 80 07 00 82 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 01 07 00 86 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 06 07 00 86 07 00 4A 07 00 80 07 00 82 07 00 FB 07 04 98 01 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 07 03 31 00 05 07 03 65 08 0C 23 08 0C 23 07 00 86 07 05 B0 FF 00 01 00 13 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 07 00 D8 00 00 FF 00 01 00 11 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 00 05 07 03 65 08 06 36 08 06 36 07 00 86 07 05 B0 F8 00 01 FF 00 01 00 12 07 00 80 02 01 01 01 01 07 03 D5 07 00 FB 07 02 1B 01 01 07 00 82 07 00 80 07 00 82 07 00 FB 07 03 E4 01 05 00 01 07 01 C6 FF 00 01 00 06 07 00 80 02 01 01 01 01 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3301   3309   Any
        //  3301   3309   3301   3309   Any
        //  3317   3319   3      8      Any
        //  29     35     35     36     Any
        //  29     35     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  29     35     3      8      Any
        //  29     35     35     36     Ljava/lang/NullPointerException;
        //  29     35     3      8      Ljava/lang/ClassCastException;
        //  87     96     96     97     Any
        //  88     96     87     88     Any
        //  88     96     96     97     Ljava/lang/ArithmeticException;
        //  88     96     3      8      Any
        //  87     96     96     97     Ljava/util/ConcurrentModificationException;
        //  147    154    154    155    Any
        //  148    154    154    155    Any
        //  147    154    3      8      Ljava/lang/NegativeArraySizeException;
        //  147    154    147    148    Ljava/lang/AssertionError;
        //  148    154    147    148    Ljava/lang/RuntimeException;
        //  212    219    219    220    Any
        //  213    219    212    213    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  212    219    3      8      Any
        //  212    219    212    213    Ljava/util/ConcurrentModificationException;
        //  213    219    219    220    Ljava/util/NoSuchElementException;
        //  349    356    356    357    Any
        //  350    356    349    350    Ljava/lang/EnumConstantNotPresentException;
        //  349    356    3      8      Ljava/lang/IllegalArgumentException;
        //  349    356    356    357    Ljava/lang/ClassCastException;
        //  350    356    356    357    Any
        //  416    422    422    423    Any
        //  416    422    422    423    Ljava/lang/RuntimeException;
        //  416    422    422    423    Ljava/lang/NullPointerException;
        //  416    422    3      8      Any
        //  416    422    3      8      Any
        //  429    435    435    436    Any
        //  429    435    435    436    Ljava/lang/NumberFormatException;
        //  429    435    435    436    Any
        //  429    435    435    436    Ljava/lang/UnsupportedOperationException;
        //  429    435    435    436    Ljava/lang/ArithmeticException;
        //  681    688    688    689    Any
        //  682    688    688    689    Ljava/lang/UnsupportedOperationException;
        //  682    688    681    682    Ljava/lang/IndexOutOfBoundsException;
        //  682    688    681    682    Any
        //  681    688    688    689    Any
        //  744    750    750    751    Any
        //  744    750    3      8      Any
        //  744    750    3      8      Any
        //  744    750    3      8      Any
        //  744    750    750    751    Ljava/lang/RuntimeException;
        //  806    812    812    813    Any
        //  806    812    812    813    Ljava/lang/RuntimeException;
        //  806    812    812    813    Any
        //  806    812    3      8      Ljava/lang/ClassCastException;
        //  806    812    3      8      Any
        //  863    872    872    873    Any
        //  863    872    872    873    Any
        //  863    872    863    864    Any
        //  864    872    863    864    Ljava/lang/ArithmeticException;
        //  863    872    3      8      Any
        //  878    885    885    886    Any
        //  878    885    878    879    Any
        //  879    885    885    886    Ljava/lang/RuntimeException;
        //  879    885    885    886    Any
        //  879    885    885    886    Any
        //  890    897    897    898    Any
        //  891    897    890    891    Ljava/lang/RuntimeException;
        //  890    897    897    898    Any
        //  890    897    890    891    Ljava/lang/IllegalStateException;
        //  891    897    890    891    Ljava/util/NoSuchElementException;
        //  1004   1010   1010   1011   Any
        //  1004   1010   1010   1011   Ljava/lang/NegativeArraySizeException;
        //  1004   1010   1010   1011   Any
        //  1004   1010   1010   1011   Any
        //  1004   1010   1010   1011   Any
        //  1024   1030   1030   1031   Any
        //  1024   1030   1030   1031   Any
        //  1024   1030   1030   1031   Any
        //  1024   1030   3      8      Any
        //  1024   1030   3      8      Any
        //  1041   1047   1047   1048   Any
        //  1041   1047   1047   1048   Any
        //  1041   1047   1047   1048   Ljava/lang/IllegalArgumentException;
        //  1041   1047   3      8      Ljava/util/ConcurrentModificationException;
        //  1041   1047   3      8      Any
        //  1051   1058   1058   1059   Any
        //  1052   1058   1051   1052   Any
        //  1052   1058   1051   1052   Any
        //  1052   1058   1058   1059   Ljava/lang/NullPointerException;
        //  1051   1058   1051   1052   Any
        //  1065   1072   1072   1073   Any
        //  1065   1072   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1065   1072   1065   1066   Ljava/util/ConcurrentModificationException;
        //  1065   1072   3      8      Ljava/lang/ArithmeticException;
        //  1066   1072   1072   1073   Any
        //  1076   1083   1083   1084   Any
        //  1077   1083   1076   1077   Ljava/lang/NegativeArraySizeException;
        //  1077   1083   1076   1077   Any
        //  1076   1083   3      8      Ljava/util/ConcurrentModificationException;
        //  1076   1083   3      8      Ljava/lang/IllegalArgumentException;
        //  1093   1100   1100   1101   Any
        //  1094   1100   3      8      Any
        //  1093   1100   1093   1094   Ljava/lang/NumberFormatException;
        //  1094   1100   1100   1101   Any
        //  1094   1100   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1157   1164   1164   1165   Any
        //  1158   1164   3      8      Any
        //  1157   1164   1164   1165   Ljava/lang/IllegalStateException;
        //  1158   1164   3      8      Any
        //  1157   1164   1157   1158   Any
        //  1168   1177   1177   1178   Any
        //  1168   1177   1177   1178   Ljava/lang/AssertionError;
        //  1169   1177   3      8      Any
        //  1168   1177   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1169   1177   1168   1169   Ljava/lang/NullPointerException;
        //  1329   1336   1336   1337   Any
        //  1329   1336   3      8      Any
        //  1329   1336   1329   1330   Any
        //  1330   1336   1336   1337   Ljava/lang/IllegalArgumentException;
        //  1329   1336   3      8      Any
        //  1398   1405   1405   1406   Any
        //  1399   1405   1405   1406   Ljava/lang/NumberFormatException;
        //  1398   1405   1405   1406   Ljava/lang/IndexOutOfBoundsException;
        //  1399   1405   1398   1399   Any
        //  1399   1405   3      8      Ljava/lang/ArithmeticException;
        //  1463   1472   1472   1473   Any
        //  1463   1472   1472   1473   Any
        //  1464   1472   1463   1464   Any
        //  1463   1472   1463   1464   Any
        //  1463   1472   1463   1464   Ljava/lang/NullPointerException;
        //  1484   1493   1493   1494   Any
        //  1485   1493   1484   1485   Any
        //  1485   1493   3      8      Ljava/lang/RuntimeException;
        //  1484   1493   1484   1485   Ljava/lang/UnsupportedOperationException;
        //  1484   1493   3      8      Any
        //  1651   1658   1658   1659   Any
        //  1651   1658   3      8      Any
        //  1651   1658   1651   1652   Any
        //  1651   1658   3      8      Any
        //  1651   1658   1651   1652   Any
        //  1662   1669   1669   1670   Any
        //  1663   1669   1669   1670   Any
        //  1663   1669   1662   1663   Ljava/lang/IllegalStateException;
        //  1662   1669   1662   1663   Ljava/lang/AssertionError;
        //  1662   1669   1662   1663   Any
        //  1775   1782   1782   1783   Any
        //  1775   1782   1775   1776   Ljava/lang/ArithmeticException;
        //  1776   1782   3      8      Ljava/lang/ClassCastException;
        //  1776   1782   1775   1776   Ljava/lang/ClassCastException;
        //  1775   1782   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1835   1842   1842   1843   Any
        //  1835   1842   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1836   1842   3      8      Any
        //  1836   1842   1842   1843   Ljava/lang/IllegalArgumentException;
        //  1835   1842   1835   1836   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1891   1898   1898   1899   Any
        //  1891   1898   3      8      Any
        //  1891   1898   1898   1899   Ljava/lang/RuntimeException;
        //  1891   1898   3      8      Any
        //  1891   1898   1891   1892   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2027   2028   Ljava/lang/RuntimeException;
        //  2028   2034   2034   2035   Any
        //  2028   2034   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2039   2045   2045   2046   Any
        //  2039   2045   3      8      Any
        //  2039   2045   3      8      Any
        //  2039   2045   3      8      Any
        //  2039   2045   2045   2046   Ljava/lang/ArithmeticException;
        //  2102   2109   2109   2110   Any
        //  2103   2109   3      8      Ljava/lang/UnsupportedOperationException;
        //  2103   2109   3      8      Ljava/util/NoSuchElementException;
        //  2103   2109   2102   2103   Ljava/lang/EnumConstantNotPresentException;
        //  2103   2109   2109   2110   Any
        //  2211   2218   2218   2219   Any
        //  2211   2218   2218   2219   Ljava/lang/UnsupportedOperationException;
        //  2212   2218   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2211   2218   2218   2219   Any
        //  2211   2218   2211   2212   Ljava/lang/ArithmeticException;
        //  2524   2530   2530   2531   Any
        //  2524   2530   3      8      Ljava/lang/RuntimeException;
        //  2524   2530   3      8      Any
        //  2524   2530   2530   2531   Any
        //  2524   2530   3      8      Any
        //  2759   2766   2766   2767   Any
        //  2760   2766   2759   2760   Ljava/lang/IllegalStateException;
        //  2759   2766   3      8      Ljava/lang/ClassCastException;
        //  2759   2766   2766   2767   Ljava/lang/ClassCastException;
        //  2760   2766   2759   2760   Any
        //  2961   2968   2968   2969   Any
        //  2961   2968   3      8      Any
        //  2962   2968   2961   2962   Any
        //  2962   2968   2961   2962   Ljava/lang/NegativeArraySizeException;
        //  2962   2968   2961   2962   Any
        //  2972   2979   2979   2980   Any
        //  2973   2979   2972   2973   Ljava/lang/NumberFormatException;
        //  2973   2979   2972   2973   Any
        //  2972   2979   2972   2973   Any
        //  2972   2979   3      8      Ljava/lang/IllegalArgumentException;
        //  2995   3002   3002   3003   Any
        //  2995   3002   3      8      Any
        //  2996   3002   3002   3003   Any
        //  2996   3002   2995   2996   Ljava/util/NoSuchElementException;
        //  2995   3002   3002   3003   Ljava/util/ConcurrentModificationException;
        //  3167   3174   3174   3175   Any
        //  3168   3174   3174   3175   Ljava/lang/RuntimeException;
        //  3167   3174   3174   3175   Any
        //  3168   3174   3167   3168   Any
        //  3167   3174   3      8      Ljava/lang/IllegalArgumentException;
        //  3179   3185   3185   3186   Any
        //  3179   3185   3185   3186   Any
        //  3179   3185   3185   3186   Ljava/lang/NullPointerException;
        //  3179   3185   3185   3186   Ljava/lang/NumberFormatException;
        //  3179   3185   3      8      Any
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
    
    public static boolean 3(final BlockPos blockPos) {
        return fbS.4F(null, 662189300, blockPos);
    }
}
