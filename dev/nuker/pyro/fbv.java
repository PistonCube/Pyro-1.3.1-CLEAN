// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;

public class fbv extends fbk
{
    public static boolean c(final EntityPlayer entityPlayer) {
        return fbS.1S(null, 65819921, entityPlayer);
    }
    
    public static boolean c(final EntityPlayer p0, final Item p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          186
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            178
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            170
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: ifnull          157
        //    28: aload_0        
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //    36: goto            40
        //    39: athrow         
        //    40: goto            44
        //    43: athrow         
        //    44: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //    47: goto            51
        //    50: athrow         
        //    51: instanceof      Lnet/minecraft/item/ItemFood;
        //    54: ifeq            157
        //    57: getstatic       dev/nuker/pyro/fc.0:I
        //    60: ifeq            68
        //    63: ldc             -1421134213
        //    65: goto            70
        //    68: ldc             -660219021
        //    70: ldc             -981019011
        //    72: ixor           
        //    73: lookupswitch {
        //          -737026694: 68
        //          1858985990: 159
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: goto            105
        //   104: athrow         
        //   105: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184587_cr:()Z
        //   108: goto            112
        //   111: athrow         
        //   112: ifeq            157
        //   115: aload_0        
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   134: goto            138
        //   137: athrow         
        //   138: aload_1        
        //   139: goto            143
        //   142: athrow         
        //   143: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   146: goto            150
        //   149: athrow         
        //   150: ifeq            157
        //   153: iconst_1       
        //   154: goto            158
        //   157: iconst_0       
        //   158: ireturn        
        //   159: aconst_null    
        //   160: athrow         
        //   161: pop            
        //   162: goto            24
        //   165: pop            
        //   166: aconst_null    
        //   167: goto            161
        //   170: dup            
        //   171: ifnull          161
        //   174: checkcast       Ljava/lang/Throwable;
        //   177: athrow         
        //   178: dup            
        //   179: ifnull          165
        //   182: checkcast       Ljava/lang/Throwable;
        //   185: athrow         
        //   186: aconst_null    
        //   187: athrow         
        //    StackMapTable: 00 27 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 27 07 00 42 47 07 00 11 40 07 00 27 45 07 00 25 40 07 00 2D 42 07 00 25 40 07 00 2D 45 07 00 25 40 07 00 42 10 41 01 1D 43 07 00 19 40 07 00 27 45 07 00 25 40 01 46 07 00 11 40 07 00 27 45 07 00 25 40 07 00 2D 42 07 00 1B 40 07 00 2D 45 07 00 25 40 07 00 42 43 07 00 25 FF 00 00 00 02 07 00 27 07 00 42 00 02 07 00 42 07 00 42 45 07 00 25 40 01 06 40 01 00 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     170    178    Any
        //  170    178    170    178    Any
        //  186    188    3      8      Any
        //  32     39     39     40     Any
        //  32     39     39     40     Any
        //  32     39     39     40     Any
        //  33     39     32     33     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  33     39     39     40     Ljava/lang/AssertionError;
        //  43     50     50     51     Any
        //  43     50     3      8      Any
        //  43     50     3      8      Any
        //  43     50     50     51     Any
        //  44     50     43     44     Any
        //  104    111    111    112    Any
        //  105    111    111    112    Ljava/util/ConcurrentModificationException;
        //  105    111    111    112    Ljava/lang/StringIndexOutOfBoundsException;
        //  105    111    104    105    Ljava/lang/ArithmeticException;
        //  104    111    111    112    Ljava/lang/IndexOutOfBoundsException;
        //  119    126    126    127    Any
        //  120    126    119    120    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  119    126    126    127    Ljava/util/NoSuchElementException;
        //  119    126    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  119    126    3      8      Any
        //  130    137    137    138    Any
        //  130    137    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  130    137    130    131    Ljava/lang/StringIndexOutOfBoundsException;
        //  131    137    130    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  131    137    137    138    Ljava/lang/StringIndexOutOfBoundsException;
        //  142    149    149    150    Any
        //  143    149    142    143    Any
        //  143    149    142    143    Any
        //  143    149    142    143    Any
        //  143    149    3      8      Any
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
    
    public boolean c(final Entity p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1591
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1583
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1575
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/BlockPos;
        //    27: dup            
        //    28: aload_1        
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            40
        //    35: ldc             -532227626
        //    37: goto            42
        //    40: ldc             1619357067
        //    42: ldc             759923893
        //    44: ixor           
        //    45: lookupswitch {
        //          -854762141: 1536
        //          2144492571: 40
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    75: goto            79
        //    78: athrow         
        //    79: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    82: goto            86
        //    85: athrow         
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            97
        //    92: ldc             -1764682092
        //    94: goto            99
        //    97: ldc             1830728967
        //    99: ldc             709696171
        //   101: ixor           
        //   102: lookupswitch {
        //          -1130623937: 1522
        //          1065050314: 97
        //          default: 128
        //        }
        //   128: aload_1        
        //   129: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   132: goto            136
        //   135: athrow         
        //   136: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   139: goto            143
        //   142: athrow         
        //   143: getstatic       dev/nuker/pyro/fc.1:I
        //   146: ifeq            154
        //   149: ldc             195403262
        //   151: goto            156
        //   154: ldc             1603081185
        //   156: ldc             1402464826
        //   158: ixor           
        //   159: lookupswitch {
        //          203094491: 184
        //          1479702468: 154
        //          default: 1564
        //        }
        //   184: aload_1        
        //   185: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   188: goto            192
        //   191: athrow         
        //   192: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   195: goto            199
        //   198: athrow         
        //   199: goto            203
        //   202: athrow         
        //   203: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   206: goto            210
        //   209: athrow         
        //   210: getstatic       dev/nuker/pyro/fc.c:I
        //   213: ifge            221
        //   216: ldc             2062586051
        //   218: goto            223
        //   221: ldc             -684526259
        //   223: ldc             -299989669
        //   225: ixor           
        //   226: lookupswitch {
        //          -1796336232: 1524
        //          195952250: 221
        //          default: 252
        //        }
        //   252: astore_3       
        //   253: bipush          10
        //   255: anewarray       Lnet/minecraft/util/math/BlockPos;
        //   258: dup            
        //   259: iconst_0       
        //   260: aload_3        
        //   261: goto            265
        //   264: athrow         
        //   265: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   268: goto            272
        //   271: athrow         
        //   272: aastore        
        //   273: dup            
        //   274: iconst_1       
        //   275: aload_3        
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   283: goto            287
        //   286: athrow         
        //   287: aastore        
        //   288: dup            
        //   289: iconst_2       
        //   290: getstatic       dev/nuker/pyro/fc.1:I
        //   293: ifeq            301
        //   296: ldc             -1201435509
        //   298: goto            303
        //   301: ldc             -1298016237
        //   303: ldc             137655840
        //   305: ixor           
        //   306: lookupswitch {
        //          -1486353485: 301
        //          -1336411477: 1532
        //          default: 332
        //        }
        //   332: aload_3        
        //   333: goto            337
        //   336: athrow         
        //   337: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   340: goto            344
        //   343: athrow         
        //   344: aastore        
        //   345: dup            
        //   346: iconst_3       
        //   347: aload_3        
        //   348: getstatic       dev/nuker/pyro/fc.1:I
        //   351: ifeq            359
        //   354: ldc             -259167915
        //   356: goto            361
        //   359: ldc             253472040
        //   361: ldc             76112125
        //   363: ixor           
        //   364: lookupswitch {
        //          -201061976: 359
        //          194170325: 392
        //          default: 1544
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   399: goto            403
        //   402: athrow         
        //   403: aastore        
        //   404: dup            
        //   405: iconst_4       
        //   406: getstatic       dev/nuker/pyro/fc.0:I
        //   409: ifeq            417
        //   412: ldc             -2062208587
        //   414: goto            419
        //   417: ldc             -1368974903
        //   419: ldc             973437756
        //   421: ixor           
        //   422: lookupswitch {
        //          -1805491467: 448
        //          -1089451383: 417
        //          default: 1554
        //        }
        //   448: aload_3        
        //   449: goto            453
        //   452: athrow         
        //   453: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   456: goto            460
        //   459: athrow         
        //   460: goto            464
        //   463: athrow         
        //   464: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   467: goto            471
        //   470: athrow         
        //   471: aastore        
        //   472: dup            
        //   473: iconst_5       
        //   474: aload_3        
        //   475: goto            479
        //   478: athrow         
        //   479: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   482: goto            486
        //   485: athrow         
        //   486: getstatic       dev/nuker/pyro/fc.0:I
        //   489: ifeq            497
        //   492: ldc             -180742592
        //   494: goto            499
        //   497: ldc             -694680396
        //   499: ldc             -772521980
        //   501: ixor           
        //   502: lookupswitch {
        //          617502276: 1530
        //          1234220843: 497
        //          default: 528
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   535: goto            539
        //   538: athrow         
        //   539: aastore        
        //   540: dup            
        //   541: bipush          6
        //   543: getstatic       dev/nuker/pyro/fc.1:I
        //   546: ifeq            554
        //   549: ldc             927451659
        //   551: goto            556
        //   554: ldc             1596020650
        //   556: ldc             1603606450
        //   558: ixor           
        //   559: lookupswitch {
        //          11812888: 584
        //          1758649785: 554
        //          default: 1542
        //        }
        //   584: aload_3        
        //   585: getstatic       dev/nuker/pyro/fc.1:I
        //   588: ifeq            596
        //   591: ldc             1477348581
        //   593: goto            598
        //   596: ldc             -726712371
        //   598: ldc             446057999
        //   600: ixor           
        //   601: lookupswitch {
        //          -835096126: 628
        //          1117307626: 596
        //          default: 1556
        //        }
        //   628: goto            632
        //   631: athrow         
        //   632: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   635: goto            639
        //   638: athrow         
        //   639: goto            643
        //   642: athrow         
        //   643: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   646: goto            650
        //   649: athrow         
        //   650: aastore        
        //   651: dup            
        //   652: bipush          7
        //   654: aload_3        
        //   655: goto            659
        //   658: athrow         
        //   659: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   662: goto            666
        //   665: athrow         
        //   666: getstatic       dev/nuker/pyro/fc.c:I
        //   669: ifge            677
        //   672: ldc             -233059304
        //   674: goto            679
        //   677: ldc             -790529591
        //   679: ldc             458059306
        //   681: ixor           
        //   682: lookupswitch {
        //          -877914141: 708
        //          -380198350: 677
        //          default: 1558
        //        }
        //   708: goto            712
        //   711: athrow         
        //   712: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   715: goto            719
        //   718: athrow         
        //   719: aastore        
        //   720: dup            
        //   721: bipush          8
        //   723: aload_3        
        //   724: goto            728
        //   727: athrow         
        //   728: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   731: goto            735
        //   734: athrow         
        //   735: goto            739
        //   738: athrow         
        //   739: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   742: goto            746
        //   745: athrow         
        //   746: goto            750
        //   749: athrow         
        //   750: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   753: goto            757
        //   756: athrow         
        //   757: aastore        
        //   758: dup            
        //   759: bipush          9
        //   761: aload_3        
        //   762: goto            766
        //   765: athrow         
        //   766: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   769: goto            773
        //   772: athrow         
        //   773: goto            777
        //   776: athrow         
        //   777: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   780: goto            784
        //   783: athrow         
        //   784: aastore        
        //   785: astore          4
        //   787: iconst_5       
        //   788: anewarray       Lnet/minecraft/util/math/BlockPos;
        //   791: dup            
        //   792: iconst_0       
        //   793: aload_3        
        //   794: goto            798
        //   797: athrow         
        //   798: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   801: goto            805
        //   804: athrow         
        //   805: aastore        
        //   806: dup            
        //   807: iconst_1       
        //   808: aload_3        
        //   809: goto            813
        //   812: athrow         
        //   813: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   816: goto            820
        //   819: athrow         
        //   820: aastore        
        //   821: dup            
        //   822: iconst_2       
        //   823: getstatic       dev/nuker/pyro/fc.c:I
        //   826: ifge            834
        //   829: ldc             386564667
        //   831: goto            836
        //   834: ldc             -252100555
        //   836: ldc             -2100527662
        //   838: ixor           
        //   839: lookupswitch {
        //          -1782120471: 834
        //          1916091879: 864
        //          default: 1546
        //        }
        //   864: aload_3        
        //   865: goto            869
        //   868: athrow         
        //   869: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   872: goto            876
        //   875: athrow         
        //   876: aastore        
        //   877: dup            
        //   878: iconst_3       
        //   879: aload_3        
        //   880: getstatic       dev/nuker/pyro/fc.1:I
        //   883: ifeq            891
        //   886: ldc             788401812
        //   888: goto            893
        //   891: ldc             -102467159
        //   893: ldc             -739598360
        //   895: ixor           
        //   896: lookupswitch {
        //          -48983684: 891
        //          705619521: 924
        //          default: 1534
        //        }
        //   924: goto            928
        //   927: athrow         
        //   928: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   931: goto            935
        //   934: athrow         
        //   935: aastore        
        //   936: dup            
        //   937: iconst_4       
        //   938: aload_3        
        //   939: goto            943
        //   942: athrow         
        //   943: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   946: goto            950
        //   949: athrow         
        //   950: goto            954
        //   953: athrow         
        //   954: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   957: goto            961
        //   960: athrow         
        //   961: aastore        
        //   962: astore          5
        //   964: getstatic       dev/nuker/pyro/fc.1:I
        //   967: ifeq            975
        //   970: ldc             -481651178
        //   972: goto            977
        //   975: ldc             993010968
        //   977: ldc             -2058717873
        //   979: ixor           
        //   980: lookupswitch {
        //          -1099280297: 1008
        //          1711334233: 975
        //          default: 1538
        //        }
        //  1008: iload_2        
        //  1009: ifeq            1017
        //  1012: aload           4
        //  1014: goto            1019
        //  1017: aload           5
        //  1019: getstatic       dev/nuker/pyro/fc.c:I
        //  1022: ifge            1030
        //  1025: ldc             -1055591404
        //  1027: goto            1032
        //  1030: ldc             2018831146
        //  1032: ldc             418958379
        //  1034: ixor           
        //  1035: lookupswitch {
        //          -638830529: 1030
        //          1621894913: 1060
        //          default: 1550
        //        }
        //  1060: astore          6
        //  1062: getstatic       dev/nuker/pyro/fc.c:I
        //  1065: ifge            1073
        //  1068: ldc             1278704981
        //  1070: goto            1075
        //  1073: ldc             -436955390
        //  1075: ldc             -1095786416
        //  1077: ixor           
        //  1078: lookupswitch {
        //          -224862971: 1073
        //          1532704594: 1104
        //          default: 1540
        //        }
        //  1104: aload           6
        //  1106: arraylength    
        //  1107: getstatic       dev/nuker/pyro/fc.0:I
        //  1110: ifeq            1118
        //  1113: ldc             -1185007457
        //  1115: goto            1120
        //  1118: ldc             -976281707
        //  1120: ldc             -1418992199
        //  1122: ixor           
        //  1123: lookupswitch {
        //          120099691: 1118
        //          305519910: 1560
        //          default: 1148
        //        }
        //  1148: istore          7
        //  1150: iconst_0       
        //  1151: istore          8
        //  1153: iload           8
        //  1155: iload           7
        //  1157: if_icmpge       1520
        //  1160: aload           6
        //  1162: iload           8
        //  1164: aaload         
        //  1165: astore          9
        //  1167: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //  1170: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1173: aload           9
        //  1175: getstatic       dev/nuker/pyro/fc.1:I
        //  1178: ifeq            1186
        //  1181: ldc             2018935790
        //  1183: goto            1188
        //  1186: ldc             -569187869
        //  1188: ldc             1805491427
        //  1190: ixor           
        //  1191: lookupswitch {
        //          -1248887552: 1216
        //          332078861: 1186
        //          default: 1526
        //        }
        //  1216: goto            1220
        //  1219: athrow         
        //  1220: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: getstatic       dev/nuker/pyro/fc.c:I
        //  1230: ifge            1238
        //  1233: ldc             457705176
        //  1235: goto            1240
        //  1238: ldc             713220914
        //  1240: ldc             1132520093
        //  1242: ixor           
        //  1243: lookupswitch {
        //          772069966: 1238
        //          1489560645: 1552
        //          default: 1268
        //        }
        //  1268: astore          10
        //  1270: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //  1273: getstatic       dev/nuker/pyro/fc.c:I
        //  1276: ifge            1284
        //  1279: ldc             194637539
        //  1281: goto            1286
        //  1284: ldc             -268142581
        //  1286: ldc             -2101245838
        //  1288: ixor           
        //  1289: lookupswitch {
        //          -2018968000: 1284
        //          -1990695279: 1562
        //          default: 1316
        //        }
        //  1316: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1319: aload           9
        //  1321: goto            1325
        //  1324: athrow         
        //  1325: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175623_d:(Lnet/minecraft/util/math/BlockPos;)Z
        //  1328: goto            1332
        //  1331: athrow         
        //  1332: ifne            1340
        //  1335: ldc             368797036
        //  1337: goto            1342
        //  1340: ldc             368797039
        //  1342: ldc             1952959613
        //  1344: ixor           
        //  1345: tableswitch {
        //          -1019653598: 1368
        //          -1019653597: 1512
        //          default: 1335
        //        }
        //  1368: aload           10
        //  1370: getstatic       dev/nuker/pyro/fc.1:I
        //  1373: ifeq            1381
        //  1376: ldc             1461103027
        //  1378: goto            1383
        //  1381: ldc             1414056491
        //  1383: ldc             413784511
        //  1385: ixor           
        //  1386: lookupswitch {
        //          1289819028: 1412
        //          1337946124: 1381
        //          default: 1548
        //        }
        //  1412: goto            1416
        //  1415: athrow         
        //  1416: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1421: goto            1425
        //  1424: athrow         
        //  1425: instanceof      Lnet/minecraft/block/BlockLiquid;
        //  1428: ifne            1512
        //  1431: aload           10
        //  1433: goto            1437
        //  1436: athrow         
        //  1437: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1442: goto            1446
        //  1445: athrow         
        //  1446: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //  1449: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1452: getstatic       dev/nuker/pyro/fc.1:I
        //  1455: ifeq            1463
        //  1458: ldc             2047643118
        //  1460: goto            1465
        //  1463: ldc             -2044070054
        //  1465: ldc             1879686392
        //  1467: ixor           
        //  1468: lookupswitch {
        //          -357039099: 1463
        //          168112406: 1528
        //          default: 1496
        //        }
        //  1496: aload           9
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: invokevirtual   net/minecraft/block/Block.func_176200_f:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: ifeq            1514
        //  1512: iconst_0       
        //  1513: ireturn        
        //  1514: iinc            8, 1
        //  1517: goto            1153
        //  1520: iconst_1       
        //  1521: ireturn        
        //  1522: aconst_null    
        //  1523: athrow         
        //  1524: aconst_null    
        //  1525: athrow         
        //  1526: aconst_null    
        //  1527: athrow         
        //  1528: aconst_null    
        //  1529: athrow         
        //  1530: aconst_null    
        //  1531: athrow         
        //  1532: aconst_null    
        //  1533: athrow         
        //  1534: aconst_null    
        //  1535: athrow         
        //  1536: aconst_null    
        //  1537: athrow         
        //  1538: aconst_null    
        //  1539: athrow         
        //  1540: aconst_null    
        //  1541: athrow         
        //  1542: aconst_null    
        //  1543: athrow         
        //  1544: aconst_null    
        //  1545: athrow         
        //  1546: aconst_null    
        //  1547: athrow         
        //  1548: aconst_null    
        //  1549: athrow         
        //  1550: aconst_null    
        //  1551: athrow         
        //  1552: aconst_null    
        //  1553: athrow         
        //  1554: aconst_null    
        //  1555: athrow         
        //  1556: aconst_null    
        //  1557: athrow         
        //  1558: aconst_null    
        //  1559: athrow         
        //  1560: aconst_null    
        //  1561: athrow         
        //  1562: aconst_null    
        //  1563: athrow         
        //  1564: aconst_null    
        //  1565: athrow         
        //  1566: pop            
        //  1567: goto            24
        //  1570: pop            
        //  1571: aconst_null    
        //  1572: goto            1566
        //  1575: dup            
        //  1576: ifnull          1566
        //  1579: checkcast       Ljava/lang/Throwable;
        //  1582: athrow         
        //  1583: dup            
        //  1584: ifnull          1570
        //  1587: checkcast       Ljava/lang/Throwable;
        //  1590: athrow         
        //  1591: aconst_null    
        //  1592: athrow         
        //    StackMapTable: 00 EB 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FE 00 03 07 00 03 07 00 5C 01 FF 00 0F 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 07 00 5C FF 00 01 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 07 00 5C 01 FF 00 1D 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 07 00 5C FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 03 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 01 FF 00 0A 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 01 FF 00 01 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 01 FF 00 1C 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 01 46 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 03 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 01 FF 00 0A 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 01 FF 00 01 00 03 07 00 03 07 00 5C 01 00 05 08 00 18 08 00 18 01 01 01 FF 00 1B 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 01 46 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 05 08 00 18 08 00 18 01 01 03 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 05 08 00 18 08 00 18 01 01 01 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 00 5C 01 00 05 08 00 18 08 00 18 01 01 01 45 07 00 25 40 07 00 57 4A 07 00 57 FF 00 01 00 03 07 00 03 07 00 5C 01 00 02 07 00 57 01 5C 07 00 57 FF 00 0B 00 04 07 00 03 07 00 5C 01 07 00 57 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0D 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 01 FF 00 1C 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 43 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0E 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1E 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0D 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 01 FF 00 1C 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 43 07 00 53 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 4D FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 46 07 00 4D FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0A 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1C 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0E 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 01 FF 00 1B 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 0B 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1D 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 47 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0A 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1C 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 4F FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 07 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 07 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0C 00 00 00 01 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 46 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0D 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 01 FF 00 1B 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 03 07 00 EA 07 00 EA 01 43 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0E 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1E 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 4D FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FC 00 0D 07 00 EA 41 01 1E 08 41 07 00 EA 4A 07 00 EA FF 00 01 00 06 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 00 02 07 00 EA 01 5B 07 00 EA FC 00 0C 07 00 EA 41 01 1C 4D 01 FF 00 01 00 07 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 00 02 01 01 5B 01 FD 00 04 01 01 FF 00 20 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 02 07 00 C3 07 00 57 FF 00 01 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 03 07 00 C3 07 00 57 01 FF 00 1B 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 02 07 00 C3 07 00 57 42 07 00 25 FF 00 00 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 02 07 00 C3 07 00 57 45 07 00 25 40 07 00 D9 4A 07 00 D9 FF 00 01 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 02 07 00 D9 01 5B 07 00 D9 FF 00 0F 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 BA FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 BA 01 5D 07 00 BA 47 07 00 25 FF 00 00 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 C3 07 00 57 45 07 00 25 40 01 02 04 41 01 19 4C 07 00 D9 FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 D9 01 5C 07 00 D9 42 07 00 25 40 07 00 D9 47 07 00 25 40 07 00 E4 4A 07 00 13 40 07 00 D9 47 07 00 25 40 07 00 E4 FF 00 10 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 C3 FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 03 07 00 E4 07 00 C3 01 FF 00 1E 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 C3 44 07 00 1B FF 00 00 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 03 07 00 E4 07 00 C3 07 00 57 45 07 00 25 40 01 02 01 F9 00 05 FF 00 01 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 01 41 07 00 57 FF 00 01 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 02 07 00 C3 07 00 57 FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 C3 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 03 07 00 03 07 00 5C 01 00 03 08 00 18 08 00 18 07 00 5C FE 00 01 07 00 57 07 00 EA 07 00 EA FC 00 01 07 00 EA FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 05 07 00 03 07 00 5C 01 07 00 57 07 00 EA 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 D9 FF 00 01 00 06 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 00 01 07 00 EA FF 00 01 00 0A 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 00 01 07 00 D9 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 03 07 00 EA 07 00 EA 01 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 04 07 00 03 07 00 5C 01 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 07 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 00 01 01 FF 00 01 00 0B 07 00 03 07 00 5C 01 07 00 57 07 00 EA 07 00 EA 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 BA FF 00 01 00 03 07 00 03 07 00 5C 01 00 04 08 00 18 08 00 18 01 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1575   1583   Ljava/lang/ClassCastException;
        //  1575   1583   1575   1583   Any
        //  1591   1593   3      8      Any
        //  79     85     85     86     Any
        //  79     85     85     86     Ljava/lang/ArithmeticException;
        //  79     85     3      8      Ljava/lang/UnsupportedOperationException;
        //  79     85     85     86     Any
        //  79     85     3      8      Any
        //  135    142    142    143    Any
        //  135    142    135    136    Ljava/lang/IllegalArgumentException;
        //  135    142    142    143    Any
        //  136    142    135    136    Any
        //  135    142    142    143    Any
        //  191    198    198    199    Any
        //  191    198    198    199    Any
        //  191    198    198    199    Any
        //  192    198    191    192    Any
        //  191    198    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  203    209    209    210    Any
        //  203    209    209    210    Ljava/lang/StringIndexOutOfBoundsException;
        //  203    209    3      8      Ljava/lang/IllegalStateException;
        //  203    209    209    210    Ljava/lang/AssertionError;
        //  203    209    209    210    Ljava/lang/RuntimeException;
        //  264    271    271    272    Any
        //  265    271    271    272    Any
        //  265    271    264    265    Ljava/lang/NullPointerException;
        //  265    271    3      8      Ljava/lang/NumberFormatException;
        //  265    271    264    265    Any
        //  280    286    286    287    Any
        //  280    286    3      8      Any
        //  280    286    3      8      Ljava/util/ConcurrentModificationException;
        //  280    286    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  280    286    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  336    343    343    344    Any
        //  336    343    336    337    Any
        //  337    343    3      8      Any
        //  336    343    336    337    Any
        //  336    343    336    337    Ljava/lang/IllegalArgumentException;
        //  396    402    402    403    Any
        //  396    402    3      8      Any
        //  396    402    402    403    Ljava/util/ConcurrentModificationException;
        //  396    402    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  396    402    402    403    Ljava/lang/IndexOutOfBoundsException;
        //  452    459    459    460    Any
        //  453    459    3      8      Any
        //  452    459    459    460    Any
        //  453    459    3      8      Ljava/lang/ArithmeticException;
        //  453    459    452    453    Ljava/lang/NegativeArraySizeException;
        //  463    470    470    471    Any
        //  463    470    3      8      Ljava/lang/RuntimeException;
        //  464    470    463    464    Ljava/lang/ArithmeticException;
        //  464    470    463    464    Ljava/lang/ClassCastException;
        //  463    470    3      8      Any
        //  478    485    485    486    Any
        //  479    485    485    486    Any
        //  478    485    478    479    Ljava/lang/NumberFormatException;
        //  479    485    485    486    Any
        //  478    485    478    479    Ljava/util/NoSuchElementException;
        //  531    538    538    539    Any
        //  532    538    531    532    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  531    538    538    539    Ljava/lang/AssertionError;
        //  532    538    531    532    Any
        //  532    538    3      8      Any
        //  631    638    638    639    Any
        //  631    638    638    639    Any
        //  632    638    638    639    Any
        //  632    638    638    639    Ljava/lang/AssertionError;
        //  631    638    631    632    Any
        //  642    649    649    650    Any
        //  643    649    642    643    Ljava/lang/IllegalStateException;
        //  643    649    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  643    649    642    643    Any
        //  642    649    649    650    Ljava/util/ConcurrentModificationException;
        //  658    665    665    666    Any
        //  658    665    665    666    Ljava/lang/ArithmeticException;
        //  658    665    658    659    Any
        //  658    665    658    659    Any
        //  658    665    3      8      Ljava/lang/RuntimeException;
        //  711    718    718    719    Any
        //  711    718    3      8      Any
        //  711    718    718    719    Any
        //  712    718    711    712    Ljava/lang/NullPointerException;
        //  711    718    3      8      Ljava/lang/UnsupportedOperationException;
        //  728    734    734    735    Any
        //  728    734    3      8      Ljava/lang/NumberFormatException;
        //  728    734    734    735    Any
        //  728    734    3      8      Ljava/util/ConcurrentModificationException;
        //  728    734    734    735    Ljava/lang/ClassCastException;
        //  738    745    745    746    Any
        //  739    745    738    739    Any
        //  738    745    738    739    Ljava/lang/ArithmeticException;
        //  738    745    738    739    Any
        //  738    745    3      8      Ljava/lang/IllegalStateException;
        //  749    756    756    757    Any
        //  750    756    749    750    Any
        //  750    756    3      8      Any
        //  750    756    756    757    Any
        //  750    756    756    757    Any
        //  766    772    772    773    Any
        //  766    772    772    773    Ljava/lang/AssertionError;
        //  766    772    3      8      Any
        //  766    772    772    773    Any
        //  766    772    3      8      Any
        //  776    783    783    784    Any
        //  777    783    783    784    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  777    783    3      8      Any
        //  777    783    776    777    Any
        //  776    783    783    784    Ljava/lang/StringIndexOutOfBoundsException;
        //  798    804    804    805    Any
        //  798    804    804    805    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  798    804    3      8      Any
        //  798    804    804    805    Any
        //  798    804    804    805    Any
        //  812    819    819    820    Any
        //  813    819    812    813    Any
        //  812    819    819    820    Ljava/lang/NumberFormatException;
        //  813    819    3      8      Ljava/lang/ArithmeticException;
        //  813    819    3      8      Any
        //  868    875    875    876    Any
        //  869    875    3      8      Any
        //  869    875    875    876    Any
        //  868    875    3      8      Any
        //  869    875    868    869    Any
        //  928    934    934    935    Any
        //  928    934    934    935    Ljava/util/ConcurrentModificationException;
        //  928    934    934    935    Any
        //  928    934    3      8      Any
        //  928    934    934    935    Any
        //  943    949    949    950    Any
        //  943    949    949    950    Ljava/lang/UnsupportedOperationException;
        //  943    949    3      8      Ljava/lang/NumberFormatException;
        //  943    949    949    950    Ljava/lang/UnsupportedOperationException;
        //  943    949    949    950    Ljava/lang/ArithmeticException;
        //  953    960    960    961    Any
        //  953    960    960    961    Ljava/lang/IllegalStateException;
        //  953    960    960    961    Ljava/lang/ArithmeticException;
        //  954    960    953    954    Ljava/lang/NegativeArraySizeException;
        //  953    960    953    954    Ljava/lang/EnumConstantNotPresentException;
        //  1219   1226   1226   1227   Any
        //  1220   1226   1226   1227   Ljava/lang/RuntimeException;
        //  1219   1226   1219   1220   Any
        //  1220   1226   1219   1220   Any
        //  1220   1226   3      8      Ljava/lang/IllegalArgumentException;
        //  1324   1331   1331   1332   Any
        //  1324   1331   1324   1325   Any
        //  1324   1331   3      8      Any
        //  1325   1331   1324   1325   Ljava/lang/IndexOutOfBoundsException;
        //  1325   1331   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1415   1424   1424   1425   Any
        //  1416   1424   1415   1416   Any
        //  1415   1424   3      8      Any
        //  1416   1424   1424   1425   Ljava/util/ConcurrentModificationException;
        //  1416   1424   1415   1416   Ljava/util/NoSuchElementException;
        //  1436   1445   1445   1446   Any
        //  1436   1445   1445   1446   Ljava/lang/IndexOutOfBoundsException;
        //  1436   1445   3      8      Any
        //  1437   1445   1445   1446   Any
        //  1436   1445   1436   1437   Ljava/lang/AssertionError;
        //  1501   1508   1508   1509   Any
        //  1502   1508   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1502   1508   1501   1502   Ljava/lang/StringIndexOutOfBoundsException;
        //  1502   1508   1508   1509   Ljava/lang/AssertionError;
        //  1501   1508   1501   1502   Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 3.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public static float c(final int n) {
        return fbS.5p(null, 1856764461, n);
    }
    
    public static int 1(final Item p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          650
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            642
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            634
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_0       
        //    25: istore_1       
        //    26: iload_1        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             -445335183
        //    35: goto            40
        //    38: ldc             -504388528
        //    40: ldc             327888256
        //    42: ixor           
        //    43: lookupswitch {
        //          -785789462: 38
        //          -151022351: 609
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //    71: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    74: getstatic       dev/nuker/pyro/fc.0:I
        //    77: ifeq            85
        //    80: ldc             -1785189839
        //    82: goto            87
        //    85: ldc             1176751351
        //    87: ldc             -1601176969
        //    89: ixor           
        //    90: lookupswitch {
        //          340236598: 85
        //          890753094: 617
        //          default: 116
        //        }
        //   116: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   119: getstatic       dev/nuker/pyro/fc.c:I
        //   122: ifge            131
        //   125: ldc_w           -1359271721
        //   128: goto            134
        //   131: ldc_w           -1715445167
        //   134: ldc_w           -1209221982
        //   137: ixor           
        //   138: lookupswitch {
        //          420975733: 613
        //          1566859830: 131
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   171: goto            175
        //   174: athrow         
        //   175: goto            179
        //   178: athrow         
        //   179: invokevirtual   net/minecraft/util/NonNullList.size:()I
        //   182: goto            186
        //   185: athrow         
        //   186: if_icmpge       607
        //   189: iload_1        
        //   190: ifeq            601
        //   193: getstatic       dev/nuker/pyro/fc.1:I
        //   196: ifeq            205
        //   199: ldc_w           -399133655
        //   202: goto            208
        //   205: ldc_w           -1235325537
        //   208: ldc_w           -35488815
        //   211: ixor           
        //   212: lookupswitch {
        //          366465016: 621
        //          1877741590: 205
        //          default: 240
        //        }
        //   240: iload_1        
        //   241: iconst_5       
        //   242: if_icmpeq       251
        //   245: ldc_w           1792426363
        //   248: goto            254
        //   251: ldc_w           1792426340
        //   254: ldc_w           -1728683596
        //   257: ixor           
        //   258: tableswitch {
        //          -465550946: 280
        //          -465550945: 601
        //          default: 245
        //        }
        //   280: iload_1        
        //   281: bipush          6
        //   283: if_icmpeq       601
        //   286: iload_1        
        //   287: bipush          7
        //   289: if_icmpeq       601
        //   292: iload_1        
        //   293: bipush          8
        //   295: if_icmpne       304
        //   298: ldc_w           1944145753
        //   301: goto            307
        //   304: ldc_w           1944145754
        //   307: ldc_w           -722040960
        //   310: ixor           
        //   311: tableswitch {
        //          1311740338: 332
        //          1311740339: 335
        //          default: 298
        //        }
        //   332: goto            601
        //   335: getstatic       dev/nuker/pyro/fc.1:I
        //   338: ifeq            347
        //   341: ldc_w           749773141
        //   344: goto            350
        //   347: ldc_w           -1273783336
        //   350: ldc_w           -795432633
        //   353: ixor           
        //   354: lookupswitch {
        //          -64616430: 619
        //          812424747: 347
        //          default: 380
        //        }
        //   380: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   383: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   386: getstatic       dev/nuker/pyro/fc.0:I
        //   389: ifeq            398
        //   392: ldc_w           -1235351760
        //   395: goto            401
        //   398: ldc_w           -472253068
        //   401: ldc_w           279039744
        //   404: ixor           
        //   405: lookupswitch {
        //          -1493186512: 611
        //          232423074: 398
        //          default: 432
        //        }
        //   432: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   435: goto            439
        //   438: athrow         
        //   439: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   442: goto            446
        //   445: athrow         
        //   446: iload_1        
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   454: goto            458
        //   457: athrow         
        //   458: checkcast       Lnet/minecraft/item/ItemStack;
        //   461: astore_2       
        //   462: getstatic       dev/nuker/pyro/fc.c:I
        //   465: ifge            474
        //   468: ldc_w           993181251
        //   471: goto            477
        //   474: ldc_w           -1447240080
        //   477: ldc_w           -1127012789
        //   480: ixor           
        //   481: lookupswitch {
        //          -2048832646: 474
        //          -2015258616: 623
        //          default: 508
        //        }
        //   508: aload_2        
        //   509: goto            513
        //   512: athrow         
        //   513: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   516: goto            520
        //   519: athrow         
        //   520: ifeq            526
        //   523: goto            601
        //   526: aload_2        
        //   527: goto            531
        //   530: athrow         
        //   531: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   534: goto            538
        //   537: athrow         
        //   538: getstatic       dev/nuker/pyro/fc.0:I
        //   541: ifeq            550
        //   544: ldc_w           1704006575
        //   547: goto            553
        //   550: ldc_w           -1350914887
        //   553: ldc_w           137701110
        //   556: ixor           
        //   557: lookupswitch {
        //          1088239540: 550
        //          1839478105: 615
        //          default: 584
        //        }
        //   584: aload_0        
        //   585: goto            589
        //   588: athrow         
        //   589: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   592: goto            596
        //   595: athrow         
        //   596: ifeq            601
        //   599: iload_1        
        //   600: ireturn        
        //   601: iinc            1, 1
        //   604: goto            26
        //   607: iconst_m1      
        //   608: ireturn        
        //   609: aconst_null    
        //   610: athrow         
        //   611: aconst_null    
        //   612: athrow         
        //   613: aconst_null    
        //   614: athrow         
        //   615: aconst_null    
        //   616: athrow         
        //   617: aconst_null    
        //   618: athrow         
        //   619: aconst_null    
        //   620: athrow         
        //   621: aconst_null    
        //   622: athrow         
        //   623: aconst_null    
        //   624: athrow         
        //   625: pop            
        //   626: goto            24
        //   629: pop            
        //   630: aconst_null    
        //   631: goto            625
        //   634: dup            
        //   635: ifnull          625
        //   638: checkcast       Ljava/lang/Throwable;
        //   641: athrow         
        //   642: dup            
        //   643: ifnull          629
        //   646: checkcast       Ljava/lang/Throwable;
        //   649: athrow         
        //   650: aconst_null    
        //   651: athrow         
        //    StackMapTable: 00 52 FF 00 03 00 02 07 00 42 01 00 01 07 00 25 FA 00 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 42 FC 00 01 01 4B 01 FF 00 01 00 02 07 00 42 01 00 02 01 01 5B 01 FF 00 10 00 02 07 00 42 01 00 02 01 07 00 FD FF 00 01 00 02 07 00 42 01 00 03 01 07 00 FD 01 FF 00 1C 00 02 07 00 42 01 00 02 01 07 00 FD FF 00 0E 00 02 07 00 42 01 00 02 01 07 01 06 FF 00 02 00 02 07 00 42 01 00 03 01 07 01 06 01 FF 00 1D 00 02 07 00 42 01 00 02 01 07 01 06 42 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 01 07 01 06 45 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 01 07 01 0C 42 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 01 07 01 0C 45 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 01 01 12 42 01 1F 04 05 42 01 19 11 05 42 01 18 02 0B 42 01 1D 51 07 00 FD FF 00 02 00 02 07 00 42 01 00 02 07 00 FD 01 5E 07 00 FD 45 07 00 25 40 07 01 06 45 07 00 25 40 07 01 0C 43 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 07 01 0C 01 45 07 00 25 40 07 00 3C FC 00 0F 07 00 2D 42 01 1E FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 42 01 07 00 2D 00 01 07 00 2D 45 07 00 25 40 01 05 43 07 00 4B 40 07 00 2D 45 07 00 25 40 07 00 42 4B 07 00 42 FF 00 02 00 03 07 00 42 01 07 00 2D 00 02 07 00 42 01 5E 07 00 42 FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 42 01 07 00 2D 00 02 07 00 42 07 00 42 45 07 00 25 40 01 FA 00 04 05 41 01 41 07 00 FD FF 00 01 00 02 07 00 42 01 00 02 01 07 01 06 FF 00 01 00 03 07 00 42 01 07 00 2D 00 01 07 00 42 FF 00 01 00 02 07 00 42 01 00 02 01 07 00 FD 01 01 FC 00 01 07 00 2D FF 00 01 00 01 07 00 42 00 01 07 00 25 43 05 44 07 00 25 47 05 FF 00 07 00 02 07 00 42 01 00 01 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     634    642    Ljava/lang/ArithmeticException;
        //  634    642    634    642    Any
        //  650    652    3      8      Ljava/util/NoSuchElementException;
        //  167    174    174    175    Any
        //  167    174    167    168    Any
        //  168    174    167    168    Ljava/util/ConcurrentModificationException;
        //  167    174    3      8      Ljava/lang/UnsupportedOperationException;
        //  168    174    3      8      Any
        //  178    185    185    186    Any
        //  179    185    185    186    Ljava/lang/IllegalArgumentException;
        //  178    185    178    179    Any
        //  179    185    3      8      Any
        //  179    185    178    179    Any
        //  438    445    445    446    Any
        //  439    445    438    439    Any
        //  438    445    445    446    Any
        //  439    445    3      8      Ljava/util/ConcurrentModificationException;
        //  439    445    438    439    Any
        //  450    457    457    458    Any
        //  451    457    3      8      Any
        //  451    457    450    451    Ljava/lang/StringIndexOutOfBoundsException;
        //  450    457    450    451    Any
        //  451    457    3      8      Any
        //  513    519    519    520    Any
        //  513    519    3      8      Any
        //  513    519    3      8      Any
        //  513    519    519    520    Ljava/lang/ClassCastException;
        //  513    519    3      8      Any
        //  530    537    537    538    Any
        //  530    537    3      8      Any
        //  531    537    530    531    Ljava/lang/IllegalStateException;
        //  530    537    537    538    Any
        //  530    537    537    538    Any
        //  589    595    595    596    Any
        //  589    595    595    596    Any
        //  589    595    595    596    Ljava/lang/NegativeArraySizeException;
        //  589    595    595    596    Ljava/lang/UnsupportedOperationException;
        //  589    595    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    static {
        throw t;
    }
    
    public static int c(final Item item) {
        return fbS.gs(null, 167035910, item);
    }
    
    public static void 2(final Item p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          586
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            578
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            570
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            39
        //    33: ldc_w           -1270727401
        //    36: goto            42
        //    39: ldc_w           778207159
        //    42: ldc_w           -1947288614
        //    45: ixor           
        //    46: lookupswitch {
        //          -1581486850: 39
        //          1068271309: 557
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: getstatic       dev/nuker/pyro/fc.c:I
        //    78: ifge            87
        //    81: ldc_w           1402371267
        //    84: goto            90
        //    87: ldc_w           1581386694
        //    90: ldc_w           1142913819
        //    93: ixor           
        //    94: lookupswitch {
        //          394856408: 553
        //          530035931: 87
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   127: goto            131
        //   130: athrow         
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   138: goto            142
        //   141: athrow         
        //   142: aload_0        
        //   143: if_acmpne       147
        //   146: return         
        //   147: iconst_0       
        //   148: istore_1       
        //   149: iload_1        
        //   150: bipush          9
        //   152: if_icmpge       546
        //   155: getstatic       dev/nuker/pyro/fc.c:I
        //   158: ifge            167
        //   161: ldc_w           1976940089
        //   164: goto            170
        //   167: ldc_w           -586062388
        //   170: ldc_w           2054611421
        //   173: ixor           
        //   174: lookupswitch {
        //          -1486388207: 200
        //          262363108: 167
        //          default: 547
        //        }
        //   200: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   209: iload_1        
        //   210: getstatic       dev/nuker/pyro/fc.1:I
        //   213: ifeq            222
        //   216: ldc_w           2098303588
        //   219: goto            225
        //   222: ldc_w           -1186950224
        //   225: ldc_w           1535746204
        //   228: ixor           
        //   229: lookupswitch {
        //          -490130644: 256
        //          647508728: 222
        //          default: 549
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   263: goto            267
        //   266: athrow         
        //   267: astore_2       
        //   268: aload_2        
        //   269: goto            273
        //   272: athrow         
        //   273: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   276: goto            280
        //   279: athrow         
        //   280: ifne            289
        //   283: ldc_w           20928371
        //   286: goto            292
        //   289: ldc_w           20928370
        //   292: ldc_w           -420270317
        //   295: ixor           
        //   296: tableswitch {
        //          -812060480: 320
        //          -812060479: 540
        //          default: 283
        //        }
        //   320: getstatic       dev/nuker/pyro/fc.c:I
        //   323: ifge            332
        //   326: ldc_w           1135327397
        //   329: goto            335
        //   332: ldc_w           -1625749633
        //   335: ldc_w           78901265
        //   338: ixor           
        //   339: lookupswitch {
        //          -1683294354: 364
        //          1192773812: 332
        //          default: 559
        //        }
        //   364: aload_2        
        //   365: goto            369
        //   368: athrow         
        //   369: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   372: goto            376
        //   375: athrow         
        //   376: aload_0        
        //   377: if_acmpne       386
        //   380: ldc_w           985796462
        //   383: goto            389
        //   386: ldc_w           985796461
        //   389: ldc_w           -782575841
        //   392: ixor           
        //   393: tableswitch {
        //          -684609310: 416
        //          -684609309: 540
        //          default: 380
        //        }
        //   416: getstatic       dev/nuker/pyro/fc.0:I
        //   419: ifeq            428
        //   422: ldc_w           -1362393855
        //   425: goto            431
        //   428: ldc_w           2130347073
        //   431: ldc_w           1847786625
        //   434: ixor           
        //   435: lookupswitch {
        //          -1058440832: 428
        //          282622144: 460
        //          default: 555
        //        }
        //   460: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   463: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   466: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   469: iload_1        
        //   470: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   473: getstatic       dev/nuker/pyro/fc.c:I
        //   476: ifge            485
        //   479: ldc_w           -659706174
        //   482: goto            488
        //   485: ldc_w           1250960644
        //   488: ldc_w           -944460506
        //   491: ixor           
        //   492: lookupswitch {
        //          -10208489: 485
        //          521733092: 551
        //          default: 520
        //        }
        //   520: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   523: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   526: goto            530
        //   529: athrow         
        //   530: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   533: goto            537
        //   536: athrow         
        //   537: goto            546
        //   540: iinc            1, 1
        //   543: goto            149
        //   546: return         
        //   547: aconst_null    
        //   548: athrow         
        //   549: aconst_null    
        //   550: athrow         
        //   551: aconst_null    
        //   552: athrow         
        //   553: aconst_null    
        //   554: athrow         
        //   555: aconst_null    
        //   556: athrow         
        //   557: aconst_null    
        //   558: athrow         
        //   559: aconst_null    
        //   560: athrow         
        //   561: pop            
        //   562: goto            24
        //   565: pop            
        //   566: aconst_null    
        //   567: goto            561
        //   570: dup            
        //   571: ifnull          561
        //   574: checkcast       Ljava/lang/Throwable;
        //   577: athrow         
        //   578: dup            
        //   579: ifnull          565
        //   582: checkcast       Ljava/lang/Throwable;
        //   585: athrow         
        //   586: aconst_null    
        //   587: athrow         
        //    StackMapTable: 00 49 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 42 4E 07 00 BA FF 00 02 00 01 07 00 42 00 02 07 00 BA 01 5D 07 00 BA 4E 07 00 FD FF 00 02 00 01 07 00 42 00 02 07 00 FD 01 5D 07 00 FD 42 07 00 4B 40 07 00 FD 45 07 00 25 40 07 00 2D 42 07 00 4D 40 07 00 2D 45 07 00 25 40 07 00 42 04 FC 00 01 01 11 42 01 1D FF 00 15 00 02 07 00 42 01 00 02 07 01 48 01 FF 00 02 00 02 07 00 42 01 00 03 07 01 48 01 01 FF 00 1E 00 02 07 00 42 01 00 02 07 01 48 01 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 07 01 48 01 45 07 00 25 40 07 00 2D FF 00 04 00 03 07 00 42 01 07 00 2D 00 01 07 00 1D 40 07 00 2D 45 07 00 25 40 01 02 05 42 01 1B 0B 42 01 1C 43 07 00 25 40 07 00 2D 45 07 00 25 40 07 00 42 03 05 42 01 1A 0B 42 01 1C 18 42 01 1F 48 07 00 25 40 07 01 64 45 07 00 25 00 02 FA 00 05 00 FF 00 01 00 02 07 00 42 01 00 02 07 01 48 01 FC 00 01 07 00 2D FF 00 01 00 01 07 00 42 00 01 07 00 FD FD 00 01 01 07 00 2D FF 00 01 00 01 07 00 42 00 01 07 00 BA FD 00 01 01 07 00 2D FF 00 01 00 01 07 00 42 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     570    578    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  570    578    570    578    Any
        //  586    588    3      8      Ljava/lang/RuntimeException;
        //  123    130    130    131    Any
        //  123    130    130    131    Ljava/lang/StringIndexOutOfBoundsException;
        //  124    130    3      8      Ljava/lang/NumberFormatException;
        //  123    130    3      8      Ljava/lang/IllegalStateException;
        //  124    130    123    124    Ljava/lang/IllegalStateException;
        //  134    141    141    142    Any
        //  135    141    3      8      Any
        //  134    141    134    135    Ljava/lang/ClassCastException;
        //  135    141    3      8      Ljava/lang/RuntimeException;
        //  135    141    134    135    Ljava/lang/EnumConstantNotPresentException;
        //  260    266    266    267    Any
        //  260    266    266    267    Ljava/util/ConcurrentModificationException;
        //  260    266    3      8      Any
        //  260    266    3      8      Any
        //  260    266    266    267    Any
        //  272    279    279    280    Any
        //  272    279    279    280    Ljava/util/NoSuchElementException;
        //  273    279    279    280    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  273    279    272    273    Ljava/util/NoSuchElementException;
        //  272    279    279    280    Ljava/lang/NullPointerException;
        //  368    375    375    376    Any
        //  368    375    3      8      Any
        //  369    375    368    369    Any
        //  369    375    368    369    Ljava/lang/StringIndexOutOfBoundsException;
        //  368    375    375    376    Any
        //  529    536    536    537    Any
        //  529    536    529    530    Any
        //  529    536    3      8      Any
        //  530    536    3      8      Any
        //  529    536    529    530    Any
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
    
    public static int 0(final Item p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          308
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            300
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            292
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           1308838505
        //    33: goto            39
        //    36: ldc_w           -1092226860
        //    39: ldc_w           -981014484
        //    42: ixor           
        //    43: lookupswitch {
        //          -1954176443: 275
        //          -1557226746: 36
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //    71: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    74: ifnonnull       79
        //    77: iconst_0       
        //    78: ireturn        
        //    79: bipush          9
        //    81: getstatic       dev/nuker/pyro/fc.1:I
        //    84: ifeq            93
        //    87: ldc_w           -1032094777
        //    90: goto            96
        //    93: ldc_w           -1980148779
        //    96: ldc_w           1058656556
        //    99: ixor           
        //   100: lookupswitch {
        //          -1620397573: 93
        //          -43865365: 277
        //          default: 128
        //        }
        //   128: istore_1       
        //   129: iload_1        
        //   130: bipush          36
        //   132: if_icmpge       273
        //   135: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            150
        //   144: ldc_w           -190017355
        //   147: goto            153
        //   150: ldc_w           -56615454
        //   153: ldc_w           979811356
        //   156: ixor           
        //   157: lookupswitch {
        //          -960060930: 184
        //          -825611095: 150
        //          default: 279
        //        }
        //   184: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   187: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   190: iload_1        
        //   191: goto            195
        //   194: athrow         
        //   195: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   198: goto            202
        //   201: athrow         
        //   202: goto            206
        //   205: athrow         
        //   206: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   209: goto            213
        //   212: athrow         
        //   213: astore_2       
        //   214: getstatic       dev/nuker/pyro/fc.c:I
        //   217: ifge            226
        //   220: ldc_w           1214847106
        //   223: goto            229
        //   226: ldc_w           1555545750
        //   229: ldc_w           -1812441714
        //   232: ixor           
        //   233: lookupswitch {
        //          -611234548: 281
        //          1573840637: 226
        //          default: 260
        //        }
        //   260: aload_2        
        //   261: aload_0        
        //   262: if_acmpne       267
        //   265: iload_1        
        //   266: ireturn        
        //   267: iinc            1, 1
        //   270: goto            129
        //   273: iconst_m1      
        //   274: ireturn        
        //   275: aconst_null    
        //   276: athrow         
        //   277: aconst_null    
        //   278: athrow         
        //   279: aconst_null    
        //   280: athrow         
        //   281: aconst_null    
        //   282: athrow         
        //   283: pop            
        //   284: goto            24
        //   287: pop            
        //   288: aconst_null    
        //   289: goto            283
        //   292: dup            
        //   293: ifnull          283
        //   296: checkcast       Ljava/lang/Throwable;
        //   299: athrow         
        //   300: dup            
        //   301: ifnull          287
        //   304: checkcast       Ljava/lang/Throwable;
        //   307: athrow         
        //   308: aconst_null    
        //   309: athrow         
        //    StackMapTable: 00 25 FF 00 03 00 02 07 00 42 01 00 01 07 00 25 FA 00 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 42 0B 42 01 1C 0A 4D 01 FF 00 02 00 01 07 00 42 00 02 01 01 5F 01 FC 00 00 01 54 07 00 BA FF 00 02 00 02 07 00 42 01 00 02 07 00 BA 01 5E 07 00 BA FF 00 09 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 42 01 00 02 07 01 48 01 45 07 00 25 40 07 00 2D 42 07 00 25 40 07 00 2D 45 07 00 25 40 07 00 42 FC 00 0C 07 00 42 42 01 1E 06 FA 00 05 FA 00 01 41 01 FF 00 01 00 02 07 00 42 01 00 01 07 00 BA FC 00 01 07 00 42 FF 00 01 00 01 07 00 42 00 01 07 00 25 43 05 44 07 00 25 47 05 FF 00 07 00 02 07 00 42 01 00 01 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     292    300    Any
        //  292    300    292    300    Ljava/lang/ArithmeticException;
        //  308    310    3      8      Any
        //  195    201    201    202    Any
        //  195    201    201    202    Ljava/lang/EnumConstantNotPresentException;
        //  195    201    201    202    Any
        //  195    201    3      8      Any
        //  195    201    201    202    Ljava/util/NoSuchElementException;
        //  205    212    212    213    Any
        //  206    212    205    206    Any
        //  206    212    212    213    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  206    212    205    206    Ljava/lang/UnsupportedOperationException;
        //  205    212    212    213    Any
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
    
    public static float 0(final EntityPlayer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          171
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            163
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            155
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           438830595
        //    34: goto            40
        //    37: ldc_w           2132779516
        //    40: ldc_w           -873951007
        //    43: ixor           
        //    44: lookupswitch {
        //          -1757920565: 37
        //          -775907614: 142
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.1:I
        //    86: ifeq            95
        //    89: ldc_w           -52013046
        //    92: goto            98
        //    95: ldc_w           -465469988
        //    98: ldc_w           1926810806
        //   101: ixor           
        //   102: lookupswitch {
        //          -1908501316: 144
        //          -822482904: 95
        //          default: 128
        //        }
        //   128: aload_0        
        //   129: goto            133
        //   132: athrow         
        //   133: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110139_bj:()F
        //   136: goto            140
        //   139: athrow         
        //   140: fadd           
        //   141: freturn        
        //   142: aconst_null    
        //   143: athrow         
        //   144: aconst_null    
        //   145: athrow         
        //   146: pop            
        //   147: goto            24
        //   150: pop            
        //   151: aconst_null    
        //   152: goto            146
        //   155: dup            
        //   156: ifnull          146
        //   159: checkcast       Ljava/lang/Throwable;
        //   162: athrow         
        //   163: dup            
        //   164: ifnull          150
        //   167: checkcast       Ljava/lang/Throwable;
        //   170: athrow         
        //   171: aconst_null    
        //   172: athrow         
        //    StackMapTable: 00 19 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 27 4C 07 00 27 FF 00 02 00 01 07 00 27 00 02 07 00 27 01 5F 07 00 27 42 07 00 25 40 07 00 27 45 07 00 25 40 02 4B 02 FF 00 02 00 01 07 00 27 00 02 02 01 5D 02 43 07 00 25 FF 00 00 00 01 07 00 27 00 02 02 07 00 27 45 07 00 25 FF 00 00 00 01 07 00 27 00 02 02 02 41 07 00 27 41 02 41 07 00 4D 43 05 44 07 00 4D 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     155    163    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  155    163    155    163    Ljava/lang/NegativeArraySizeException;
        //  171    173    3      8      Ljava/lang/ClassCastException;
        //  75     82     82     83     Any
        //  75     82     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  76     82     75     76     Any
        //  76     82     3      8      Any
        //  76     82     3      8      Any
        //  132    139    139    140    Any
        //  132    139    3      8      Any
        //  132    139    139    140    Ljava/util/ConcurrentModificationException;
        //  132    139    3      8      Ljava/lang/RuntimeException;
        //  133    139    132    133    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 59 out of bounds for length 59
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
    
    public static BlockPos c(final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          246
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            238
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            230
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: ifnonnull       34
        //    28: ldc_w           159514341
        //    31: goto            37
        //    34: ldc_w           159514346
        //    37: ldc_w           -12827742
        //    40: ixor           
        //    41: tableswitch {
        //          -310674802: 64
        //          -310674801: 112
        //          default: 28
        //        }
        //    64: getstatic       dev/nuker/pyro/fc.1:I
        //    67: ifeq            76
        //    70: ldc_w           1868317669
        //    73: goto            79
        //    76: ldc_w           -1945998975
        //    79: ldc_w           -1425652187
        //    82: ixor           
        //    83: lookupswitch {
        //          -1000733248: 217
        //          1117379539: 76
        //          default: 108
        //        }
        //   108: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //   111: areturn        
        //   112: new             Lnet/minecraft/util/math/BlockPos;
        //   115: dup            
        //   116: aload_0        
        //   117: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   120: goto            124
        //   123: athrow         
        //   124: invokestatic    java/lang/Math.floor:(D)D
        //   127: goto            131
        //   130: athrow         
        //   131: aload_0        
        //   132: getstatic       dev/nuker/pyro/fc.1:I
        //   135: ifeq            144
        //   138: ldc_w           1075054332
        //   141: goto            147
        //   144: ldc_w           -1502500714
        //   147: ldc_w           -603450652
        //   150: ixor           
        //   151: lookupswitch {
        //          -1675881448: 144
        //          2054797938: 176
        //          default: 219
        //        }
        //   176: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   179: goto            183
        //   182: athrow         
        //   183: invokestatic    java/lang/Math.floor:(D)D
        //   186: goto            190
        //   189: athrow         
        //   190: aload_0        
        //   191: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   194: goto            198
        //   197: athrow         
        //   198: invokestatic    java/lang/Math.floor:(D)D
        //   201: goto            205
        //   204: athrow         
        //   205: goto            209
        //   208: athrow         
        //   209: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   212: goto            216
        //   215: athrow         
        //   216: areturn        
        //   217: aconst_null    
        //   218: athrow         
        //   219: aconst_null    
        //   220: athrow         
        //   221: pop            
        //   222: goto            24
        //   225: pop            
        //   226: aconst_null    
        //   227: goto            221
        //   230: dup            
        //   231: ifnull          221
        //   234: checkcast       Ljava/lang/Throwable;
        //   237: athrow         
        //   238: dup            
        //   239: ifnull          225
        //   242: checkcast       Ljava/lang/Throwable;
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //    StackMapTable: 00 26 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 5C 03 05 42 01 1A 0B 42 01 1C 03 4A 07 00 25 FF 00 00 00 01 07 00 5C 00 03 08 00 70 08 00 70 03 45 07 00 25 FF 00 00 00 01 07 00 5C 00 03 08 00 70 08 00 70 03 FF 00 0C 00 01 07 00 5C 00 04 08 00 70 08 00 70 03 07 00 5C FF 00 02 00 01 07 00 5C 00 05 08 00 70 08 00 70 03 07 00 5C 01 FF 00 1C 00 01 07 00 5C 00 04 08 00 70 08 00 70 03 07 00 5C FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 5C 00 04 08 00 70 08 00 70 03 03 45 07 00 25 FF 00 00 00 01 07 00 5C 00 04 08 00 70 08 00 70 03 03 46 07 00 25 FF 00 00 00 01 07 00 5C 00 05 08 00 70 08 00 70 03 03 03 45 07 00 25 FF 00 00 00 01 07 00 5C 00 05 08 00 70 08 00 70 03 03 03 42 07 00 25 FF 00 00 00 01 07 00 5C 00 05 08 00 70 08 00 70 03 03 03 45 07 00 25 40 07 00 57 00 FF 00 01 00 01 07 00 5C 00 04 08 00 70 08 00 70 03 07 00 5C 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     230    238    Ljava/util/NoSuchElementException;
        //  230    238    230    238    Any
        //  246    248    3      8      Any
        //  123    130    130    131    Any
        //  123    130    123    124    Any
        //  124    130    3      8      Ljava/util/NoSuchElementException;
        //  124    130    3      8      Any
        //  123    130    130    131    Ljava/lang/EnumConstantNotPresentException;
        //  183    189    189    190    Any
        //  183    189    189    190    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  183    189    189    190    Ljava/lang/AssertionError;
        //  183    189    3      8      Any
        //  183    189    189    190    Any
        //  197    204    204    205    Any
        //  198    204    197    198    Ljava/lang/NumberFormatException;
        //  198    204    197    198    Any
        //  197    204    204    205    Ljava/lang/RuntimeException;
        //  198    204    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  208    215    215    216    Any
        //  209    215    3      8      Any
        //  208    215    208    209    Any
        //  208    215    208    209    Ljava/lang/RuntimeException;
        //  208    215    3      8      Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 6.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public static boolean c(final Entity p0, final Block p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1005
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            997
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            989
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/BlockPos;
        //    27: dup            
        //    28: aload_0        
        //    29: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    32: goto            36
        //    35: athrow         
        //    36: invokestatic    java/lang/Math.floor:(D)D
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0        
        //    44: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //    47: goto            51
        //    50: athrow         
        //    51: invokestatic    java/lang/Math.floor:(D)D
        //    54: goto            58
        //    57: athrow         
        //    58: aload_0        
        //    59: getstatic       dev/nuker/pyro/fc.0:I
        //    62: ifeq            71
        //    65: ldc_w           -944390386
        //    68: goto            74
        //    71: ldc_w           -429566884
        //    74: ldc_w           363582980
        //    77: ixor           
        //    78: lookupswitch {
        //          -769758966: 71
        //          -204570024: 104
        //          default: 976
        //        }
        //   104: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   107: goto            111
        //   110: athrow         
        //   111: invokestatic    java/lang/Math.floor:(D)D
        //   114: goto            118
        //   117: athrow         
        //   118: goto            122
        //   121: athrow         
        //   122: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   125: goto            129
        //   128: athrow         
        //   129: getstatic       dev/nuker/pyro/fc.1:I
        //   132: ifeq            141
        //   135: ldc_w           518615087
        //   138: goto            144
        //   141: ldc_w           -1023080343
        //   144: ldc_w           -1144904863
        //   147: ixor           
        //   148: lookupswitch {
        //          -1523887282: 141
        //          2026318600: 176
        //          default: 968
        //        }
        //   176: astore_2       
        //   177: iconst_4       
        //   178: anewarray       Lnet/minecraft/util/math/BlockPos;
        //   181: dup            
        //   182: iconst_0       
        //   183: aload_2        
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   191: goto            195
        //   194: athrow         
        //   195: aastore        
        //   196: dup            
        //   197: iconst_1       
        //   198: aload_2        
        //   199: goto            203
        //   202: athrow         
        //   203: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   206: goto            210
        //   209: athrow         
        //   210: aastore        
        //   211: dup            
        //   212: iconst_2       
        //   213: aload_2        
        //   214: getstatic       dev/nuker/pyro/fc.c:I
        //   217: ifge            226
        //   220: ldc_w           -1335694225
        //   223: goto            229
        //   226: ldc_w           310301860
        //   229: ldc_w           -979651762
        //   232: ixor           
        //   233: lookupswitch {
        //          -672831510: 260
        //          1979277089: 226
        //          default: 962
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   267: goto            271
        //   270: athrow         
        //   271: aastore        
        //   272: dup            
        //   273: iconst_3       
        //   274: aload_2        
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   282: goto            286
        //   285: athrow         
        //   286: aastore        
        //   287: astore_3       
        //   288: iconst_0       
        //   289: istore          4
        //   291: aload_3        
        //   292: astore          5
        //   294: aload           5
        //   296: arraylength    
        //   297: istore          6
        //   299: iconst_0       
        //   300: istore          7
        //   302: iload           7
        //   304: iload           6
        //   306: if_icmpge       899
        //   309: getstatic       dev/nuker/pyro/fc.1:I
        //   312: ifeq            321
        //   315: ldc_w           52358466
        //   318: goto            324
        //   321: ldc_w           -1415140260
        //   324: ldc_w           -1366290334
        //   327: ixor           
        //   328: lookupswitch {
        //          -1703331960: 321
        //          -1383138016: 956
        //          default: 356
        //        }
        //   356: aload           5
        //   358: getstatic       dev/nuker/pyro/fc.1:I
        //   361: ifeq            370
        //   364: ldc_w           765746885
        //   367: goto            373
        //   370: ldc_w           -464807425
        //   373: ldc_w           1930414428
        //   376: ixor           
        //   377: lookupswitch {
        //          -1025974531: 370
        //          1588303769: 964
        //          default: 404
        //        }
        //   404: iload           7
        //   406: aaload         
        //   407: astore          8
        //   409: getstatic       dev/nuker/pyro/fbv.c:Lnet/minecraft/client/Minecraft;
        //   412: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   415: aload           8
        //   417: goto            421
        //   420: athrow         
        //   421: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   424: goto            428
        //   427: athrow         
        //   428: getstatic       dev/nuker/pyro/fc.1:I
        //   431: ifeq            440
        //   434: ldc_w           -229235995
        //   437: goto            443
        //   440: ldc_w           -66493481
        //   443: ldc_w           1839712806
        //   446: ixor           
        //   447: lookupswitch {
        //          -1611536189: 978
        //          -253538070: 440
        //          default: 472
        //        }
        //   472: astore          9
        //   474: aload           9
        //   476: getstatic       dev/nuker/pyro/fc.c:I
        //   479: ifge            488
        //   482: ldc_w           -25120432
        //   485: goto            491
        //   488: ldc_w           -25938017
        //   491: ldc_w           1226463181
        //   494: ixor           
        //   495: lookupswitch {
        //          -1217503150: 520
        //          -1214585187: 488
        //          default: 966
        //        }
        //   520: goto            524
        //   523: athrow         
        //   524: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   529: goto            533
        //   532: athrow         
        //   533: getstatic       net/minecraft/init/Blocks.field_150350_a:Lnet/minecraft/block/Block;
        //   536: if_acmpeq       893
        //   539: getstatic       dev/nuker/pyro/fc.c:I
        //   542: ifge            551
        //   545: ldc_w           -1090868626
        //   548: goto            554
        //   551: ldc_w           1032079659
        //   554: ldc_w           1825465259
        //   557: ixor           
        //   558: lookupswitch {
        //          -768292411: 958
        //          2012794165: 551
        //          default: 584
        //        }
        //   584: aload           9
        //   586: getstatic       dev/nuker/pyro/fc.1:I
        //   589: ifeq            598
        //   592: ldc_w           223634416
        //   595: goto            601
        //   598: ldc_w           276329197
        //   601: ldc_w           2028752347
        //   604: ixor           
        //   605: lookupswitch {
        //          -1862363759: 598
        //          1975004715: 960
        //          default: 632
        //        }
        //   632: goto            636
        //   635: athrow         
        //   636: invokeinterface net/minecraft/block/state/IBlockState.func_185913_b:()Z
        //   641: goto            645
        //   644: athrow         
        //   645: ifeq            654
        //   648: ldc_w           -1568940198
        //   651: goto            657
        //   654: ldc_w           -1568940197
        //   657: ldc_w           -637108156
        //   660: ixor           
        //   661: tableswitch {
        //          -252002756: 684
        //          -252002755: 893
        //          default: 648
        //        }
        //   684: aload_1        
        //   685: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   695: goto            699
        //   698: athrow         
        //   699: ifeq            816
        //   702: aload           9
        //   704: getstatic       dev/nuker/pyro/fc.1:I
        //   707: ifeq            716
        //   710: ldc_w           -1228191919
        //   713: goto            719
        //   716: ldc_w           -1361027206
        //   719: ldc_w           -31485110
        //   722: ixor           
        //   723: lookupswitch {
        //          -985163391: 716
        //          1221907483: 970
        //          default: 748
        //        }
        //   748: goto            752
        //   751: athrow         
        //   752: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   757: goto            761
        //   760: athrow         
        //   761: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //   764: goto            768
        //   767: athrow         
        //   768: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   771: goto            775
        //   774: athrow         
        //   775: ifne            810
        //   778: aload           9
        //   780: goto            784
        //   783: athrow         
        //   784: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   789: goto            793
        //   792: athrow         
        //   793: getstatic       net/minecraft/init/Blocks.field_150357_h:Lnet/minecraft/block/Block;
        //   796: goto            800
        //   799: athrow         
        //   800: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   803: goto            807
        //   806: athrow         
        //   807: ifeq            893
        //   810: iinc            4, 1
        //   813: goto            893
        //   816: getstatic       dev/nuker/pyro/fc.0:I
        //   819: ifeq            828
        //   822: ldc_w           -1833464994
        //   825: goto            831
        //   828: ldc_w           -226822130
        //   831: ldc_w           -1097764964
        //   834: ixor           
        //   835: lookupswitch {
        //          -1462424351: 828
        //          740746434: 974
        //          default: 860
        //        }
        //   860: aload           9
        //   862: goto            866
        //   865: athrow         
        //   866: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   871: goto            875
        //   874: athrow         
        //   875: aload_1        
        //   876: goto            880
        //   879: athrow         
        //   880: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   883: goto            887
        //   886: athrow         
        //   887: ifeq            893
        //   890: iinc            4, 1
        //   893: iinc            7, 1
        //   896: goto            302
        //   899: getstatic       dev/nuker/pyro/fc.1:I
        //   902: ifeq            911
        //   905: ldc_w           898903809
        //   908: goto            914
        //   911: ldc_w           15745775
        //   914: ldc_w           1260182591
        //   917: ixor           
        //   918: lookupswitch {
        //          -978023830: 911
        //          2122904382: 972
        //          default: 944
        //        }
        //   944: iload           4
        //   946: iconst_4       
        //   947: if_icmplt       954
        //   950: iconst_1       
        //   951: goto            955
        //   954: iconst_0       
        //   955: ireturn        
        //   956: aconst_null    
        //   957: athrow         
        //   958: aconst_null    
        //   959: athrow         
        //   960: aconst_null    
        //   961: athrow         
        //   962: aconst_null    
        //   963: athrow         
        //   964: aconst_null    
        //   965: athrow         
        //   966: aconst_null    
        //   967: athrow         
        //   968: aconst_null    
        //   969: athrow         
        //   970: aconst_null    
        //   971: athrow         
        //   972: aconst_null    
        //   973: athrow         
        //   974: aconst_null    
        //   975: athrow         
        //   976: aconst_null    
        //   977: athrow         
        //   978: aconst_null    
        //   979: athrow         
        //   980: pop            
        //   981: goto            24
        //   984: pop            
        //   985: aconst_null    
        //   986: goto            980
        //   989: dup            
        //   990: ifnull          980
        //   993: checkcast       Ljava/lang/Throwable;
        //   996: athrow         
        //   997: dup            
        //   998: ifnull          984
        //  1001: checkcast       Ljava/lang/Throwable;
        //  1004: athrow         
        //  1005: aconst_null    
        //  1006: athrow         
        //    StackMapTable: 00 8C 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 5C 07 00 E4 4A 07 00 1B FF 00 00 00 02 07 00 5C 07 00 E4 00 03 08 00 18 08 00 18 03 45 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 03 08 00 18 08 00 18 03 46 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 04 08 00 18 08 00 18 03 03 45 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 04 08 00 18 08 00 18 03 03 FF 00 0C 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 07 00 5C FF 00 02 00 02 07 00 5C 07 00 E4 00 06 08 00 18 08 00 18 03 03 07 00 5C 01 FF 00 1D 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 07 00 5C 45 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 03 45 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 03 42 07 00 25 FF 00 00 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 03 45 07 00 25 40 07 00 57 4B 07 00 57 FF 00 02 00 02 07 00 5C 07 00 E4 00 02 07 00 57 01 5F 07 00 57 FF 00 0A 00 03 07 00 5C 07 00 E4 07 00 57 00 01 07 00 4D FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 46 07 00 17 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0F 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 02 00 03 07 00 5C 07 00 E4 07 00 57 00 05 07 00 EA 07 00 EA 01 07 00 57 01 FF 00 1E 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 42 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 45 07 00 25 FF 00 00 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 0F 00 08 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 00 00 12 42 01 1F 4D 07 00 EA FF 00 02 00 08 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 00 02 07 00 EA 01 5E 07 00 EA FF 00 0F 00 09 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 00 01 07 00 55 FF 00 00 00 09 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 00 02 07 00 C3 07 00 57 45 07 00 25 40 07 00 D9 4B 07 00 D9 FF 00 02 00 09 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 00 02 07 00 D9 01 5C 07 00 D9 FF 00 0F 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 D9 FF 00 02 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 D9 01 5C 07 00 D9 42 07 00 25 40 07 00 D9 47 07 00 25 40 07 00 E4 11 42 01 1D 4D 07 00 D9 FF 00 02 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 D9 01 5E 07 00 D9 42 07 00 25 40 07 00 D9 47 07 00 25 40 01 02 05 42 01 1A 46 07 00 25 FF 00 00 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 E4 45 07 00 25 40 01 50 07 00 D9 FF 00 02 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 D9 01 5C 07 00 D9 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 D9 47 07 00 25 40 07 00 E4 45 07 00 25 FF 00 00 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 E4 45 07 00 25 40 01 47 07 00 25 40 07 00 D9 47 07 00 25 40 07 00 E4 45 07 00 25 FF 00 00 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 E4 45 07 00 25 40 01 02 05 0B 42 01 1C 44 07 00 25 40 07 00 D9 47 07 00 25 40 07 00 E4 43 07 00 13 FF 00 00 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 02 07 00 E4 07 00 E4 45 07 00 25 40 01 05 F9 00 05 0B 42 01 1D 09 40 01 00 FD 00 01 07 00 57 07 00 D9 41 07 00 D9 FF 00 01 00 03 07 00 5C 07 00 E4 07 00 57 00 04 07 00 EA 07 00 EA 01 07 00 57 FF 00 01 00 08 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 00 01 07 00 EA FF 00 01 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 D9 FF 00 01 00 02 07 00 5C 07 00 E4 00 01 07 00 57 FF 00 01 00 0A 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 07 00 D9 00 01 07 00 D9 F9 00 01 FD 00 01 07 00 57 07 00 D9 FF 00 01 00 02 07 00 5C 07 00 E4 00 05 08 00 18 08 00 18 03 03 07 00 5C FF 00 01 00 09 07 00 5C 07 00 E4 07 00 57 07 00 EA 01 07 00 EA 01 01 07 00 57 00 01 07 00 D9 FF 00 01 00 02 07 00 5C 07 00 E4 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     989    997    Any
        //  989    997    989    997    Any
        //  1005   1007   3      8      Any
        //  35     42     42     43     Any
        //  36     42     3      8      Any
        //  36     42     3      8      Any
        //  35     42     35     36     Ljava/lang/IndexOutOfBoundsException;
        //  35     42     42     43     Ljava/lang/UnsupportedOperationException;
        //  50     57     57     58     Any
        //  51     57     50     51     Ljava/lang/ArithmeticException;
        //  51     57     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  50     57     50     51     Any
        //  51     57     57     58     Ljava/lang/StringIndexOutOfBoundsException;
        //  110    117    117    118    Any
        //  110    117    3      8      Ljava/lang/NumberFormatException;
        //  111    117    110    111    Any
        //  110    117    117    118    Any
        //  111    117    117    118    Ljava/lang/EnumConstantNotPresentException;
        //  121    128    128    129    Any
        //  121    128    3      8      Any
        //  121    128    128    129    Ljava/lang/RuntimeException;
        //  121    128    3      8      Any
        //  122    128    121    122    Any
        //  187    194    194    195    Any
        //  188    194    187    188    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  188    194    187    188    Ljava/lang/NumberFormatException;
        //  188    194    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  188    194    194    195    Any
        //  202    209    209    210    Any
        //  202    209    202    203    Ljava/lang/StringIndexOutOfBoundsException;
        //  202    209    209    210    Any
        //  202    209    209    210    Ljava/lang/IllegalArgumentException;
        //  203    209    3      8      Any
        //  263    270    270    271    Any
        //  264    270    263    264    Ljava/lang/EnumConstantNotPresentException;
        //  263    270    3      8      Any
        //  263    270    270    271    Ljava/lang/ClassCastException;
        //  264    270    263    264    Any
        //  279    285    285    286    Any
        //  279    285    285    286    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  279    285    285    286    Any
        //  279    285    3      8      Any
        //  279    285    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  420    427    427    428    Any
        //  421    427    427    428    Any
        //  420    427    427    428    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  421    427    427    428    Any
        //  420    427    420    421    Ljava/lang/EnumConstantNotPresentException;
        //  523    532    532    533    Any
        //  524    532    523    524    Ljava/lang/AssertionError;
        //  523    532    523    524    Any
        //  524    532    3      8      Ljava/lang/NegativeArraySizeException;
        //  524    532    523    524    Ljava/lang/IllegalStateException;
        //  635    644    644    645    Any
        //  635    644    644    645    Ljava/lang/ClassCastException;
        //  635    644    3      8      Ljava/lang/RuntimeException;
        //  636    644    635    636    Any
        //  636    644    635    636    Any
        //  691    698    698    699    Any
        //  692    698    691    692    Ljava/lang/UnsupportedOperationException;
        //  691    698    691    692    Any
        //  691    698    691    692    Any
        //  691    698    691    692    Ljava/lang/AssertionError;
        //  752    760    760    761    Any
        //  752    760    3      8      Ljava/lang/IllegalArgumentException;
        //  752    760    3      8      Any
        //  752    760    3      8      Ljava/lang/IllegalArgumentException;
        //  752    760    3      8      Ljava/lang/NumberFormatException;
        //  767    774    774    775    Any
        //  767    774    767    768    Any
        //  767    774    3      8      Any
        //  768    774    767    768    Any
        //  767    774    774    775    Ljava/lang/NullPointerException;
        //  783    792    792    793    Any
        //  784    792    783    784    Ljava/lang/NumberFormatException;
        //  783    792    783    784    Any
        //  784    792    792    793    Ljava/lang/NumberFormatException;
        //  783    792    783    784    Any
        //  799    806    806    807    Any
        //  799    806    799    800    Any
        //  799    806    799    800    Any
        //  799    806    799    800    Any
        //  799    806    3      8      Ljava/lang/NegativeArraySizeException;
        //  865    874    874    875    Any
        //  866    874    865    866    Any
        //  866    874    3      8      Any
        //  866    874    865    866    Any
        //  865    874    3      8      Any
        //  879    886    886    887    Any
        //  879    886    886    887    Any
        //  880    886    3      8      Ljava/lang/UnsupportedOperationException;
        //  879    886    886    887    Any
        //  880    886    879    880    Ljava/lang/AssertionError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 6.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public fbv() {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.c < 0) {
                    n = -392434835;
                    break Label_0015;
                }
                n = 804688443;
            }
            switch (n ^ 0xA9FCB246) {
                case 1097292075: {
                    continue;
                }
                case -2046156675: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.c < 0) {
                                n2 = -1860648949;
                                break Label_0060;
                            }
                            n2 = -1831168264;
                        }
                        switch (n2 ^ 0x420291FE) {
                            case 1021570054: {
                                continue;
                            }
                            default: {
                                return;
                            }
                            case -753249803: {
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
}
