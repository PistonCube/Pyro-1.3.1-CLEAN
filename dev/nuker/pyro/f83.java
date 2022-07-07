// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f83 extends fH
{
    static {
        throw t;
    }
    
    @f06
    public void c(@NotNull final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          972
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            964
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            956
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             1651676711
        //    32: goto            37
        //    35: ldc             915421027
        //    37: ldc             -825590470
        //    39: ixor           
        //    40: lookupswitch {
        //          -1397167331: 923
        //          -980830453: 35
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //    74: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    77: dup            
        //    78: ifnonnull       192
        //    81: new             Lkotlin/TypeCastException;
        //    84: dup            
        //    85: ldc             "\u2227\u1486\u8b2c\ub1c4\ucfd5\uec2c\ub225\ue703\udb77\uefe9\ua6fb\u1e0c\ue02b\uc7b3\u8721\u88b7\u57a5\u76db\ubf38\uc61a\u2acf\uc234\u6b80\u2f49\ud18b\u3442\u7d66\u886d\u8215\u8acd\u8565\ufb72\u710b\u981e\u1dc3\uf0ab\u493c\u89a8\uc892\uf967\ub75f\u41fd\ub82c\ub152\u4a26\u8b2e\u7c27\ucff8\u7f46\uec86\ue71e\u1696\uef96\u3596\u40e4\ue03c\u0a19\u8752\u1be1\u091a\u76c0\u7284\uc633\ub9b2\u9caa\u6bdf\ue2e5\ud1fc\ua72f\u2388\u8870\u4fb3"
        //    87: getstatic       dev/nuker/pyro/fc.c:I
        //    90: ifge            98
        //    93: ldc             1388028139
        //    95: goto            100
        //    98: ldc             1905176936
        //   100: ldc             1095130964
        //   102: ixor           
        //   103: lookupswitch {
        //          335413183: 98
        //          818474556: 128
        //          default: 931
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokestatic    invokestatic   !!! ERROR
        //   135: goto            139
        //   138: athrow         
        //   139: getstatic       dev/nuker/pyro/fc.1:I
        //   142: ifeq            150
        //   145: ldc             676236259
        //   147: goto            152
        //   150: ldc             1223714919
        //   152: ldc             -1120644239
        //   154: ixor           
        //   155: lookupswitch {
        //          -1787111278: 150
        //          -171689194: 180
        //          default: 935
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   187: goto            191
        //   190: athrow         
        //   191: athrow         
        //   192: checkcast       Ldev/nuker/pyro/mixin/EntityAccessor;
        //   195: goto            199
        //   198: athrow         
        //   199: invokeinterface dev/nuker/pyro/mixin/EntityAccessor.isInWeb:()Z
        //   204: goto            208
        //   207: athrow         
        //   208: ifeq            216
        //   211: ldc             -1090290612
        //   213: goto            218
        //   216: ldc             -1090290611
        //   218: ldc             1856725206
        //   220: ixor           
        //   221: tableswitch {
        //          -1555023564: 244
        //          -1555023563: 918
        //          default: 211
        //        }
        //   244: aload_0        
        //   245: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   248: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   251: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //   254: ifne            918
        //   257: aload_0        
        //   258: getstatic       dev/nuker/pyro/fc.c:I
        //   261: ifge            269
        //   264: ldc             618490156
        //   266: goto            271
        //   269: ldc             -1418127689
        //   271: ldc             1619329895
        //   273: ixor           
        //   274: lookupswitch {
        //          -1791934694: 269
        //          1146645067: 919
        //          default: 300
        //        }
        //   300: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   303: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   306: dup            
        //   307: pop            
        //   308: goto            312
        //   311: athrow         
        //   312: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //   315: goto            319
        //   318: athrow         
        //   319: ifne            918
        //   322: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7x;
        //   325: getfield        dev/nuker/pyro/f7x.c:Ldev/nuker/pyro/fw;
        //   328: getstatic       dev/nuker/pyro/fc.1:I
        //   331: ifeq            339
        //   334: ldc             1274606459
        //   336: goto            341
        //   339: ldc             511270400
        //   341: ldc             1800980219
        //   343: ixor           
        //   344: lookupswitch {
        //          547370368: 339
        //          1965136123: 372
        //          default: 929
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   379: goto            383
        //   382: athrow         
        //   383: checkcast       Ljava/lang/Boolean;
        //   386: getstatic       dev/nuker/pyro/fc.1:I
        //   389: ifeq            397
        //   392: ldc             2127808074
        //   394: goto            399
        //   397: ldc             -203132798
        //   399: ldc             1688846094
        //   401: ixor           
        //   402: lookupswitch {
        //          -1756508276: 428
        //          444234052: 397
        //          default: 925
        //        }
        //   428: goto            432
        //   431: athrow         
        //   432: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   435: goto            439
        //   438: athrow         
        //   439: ifne            918
        //   442: aload_0        
        //   443: getstatic       dev/nuker/pyro/fc.1:I
        //   446: ifeq            454
        //   449: ldc             -1898447148
        //   451: goto            456
        //   454: ldc             -1990308095
        //   456: ldc             -1723288942
        //   458: ixor           
        //   459: lookupswitch {
        //          -1402196790: 454
        //          396315718: 921
        //          default: 484
        //        }
        //   484: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   487: getstatic       dev/nuker/pyro/fc.1:I
        //   490: ifeq            498
        //   493: ldc             1391943928
        //   495: goto            500
        //   498: ldc             1869758886
        //   500: ldc             799936062
        //   502: ixor           
        //   503: lookupswitch {
        //          1088180120: 528
        //          2103013062: 498
        //          default: 939
        //        }
        //   528: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   531: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //   534: ifne            918
        //   537: getstatic       dev/nuker/pyro/fc.c:I
        //   540: ifge            548
        //   543: ldc             -1801093528
        //   545: goto            550
        //   548: ldc             -637335924
        //   550: ldc             950701035
        //   552: ixor           
        //   553: lookupswitch {
        //          -1759266803: 548
        //          -1408240253: 933
        //          default: 580
        //        }
        //   580: aload_0        
        //   581: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   584: getstatic       dev/nuker/pyro/fc.c:I
        //   587: ifge            595
        //   590: ldc             -660074767
        //   592: goto            597
        //   595: ldc             -1765703645
        //   597: ldc             605717323
        //   599: ixor           
        //   600: lookupswitch {
        //          -1294269592: 628
        //          -55407174: 595
        //          default: 941
        //        }
        //   628: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   631: getstatic       net/minecraft/entity/MoverType.SELF:Lnet/minecraft/entity/MoverType;
        //   634: dconst_0       
        //   635: ldc2_w          -0.2
        //   638: dconst_0       
        //   639: goto            643
        //   642: athrow         
        //   643: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70091_d:(Lnet/minecraft/entity/MoverType;DDD)V
        //   646: goto            650
        //   649: athrow         
        //   650: getstatic       dev/nuker/pyro/fc.1:I
        //   653: ifeq            661
        //   656: ldc             -1189930452
        //   658: goto            663
        //   661: ldc             -1969157023
        //   663: ldc             -1832324274
        //   665: ixor           
        //   666: lookupswitch {
        //          -1742470106: 661
        //          735832418: 937
        //          default: 692
        //        }
        //   692: aload_0        
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            704
        //   699: ldc             -971981758
        //   701: goto            706
        //   704: ldc             1219046373
        //   706: ldc             1061662471
        //   708: ixor           
        //   709: lookupswitch {
        //          -111733947: 704
        //          2012120290: 736
        //          default: 927
        //        }
        //   736: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   739: dup            
        //   740: pop            
        //   741: goto            745
        //   744: athrow         
        //   745: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   748: goto            752
        //   751: athrow         
        //   752: dup            
        //   753: ifnonnull       811
        //   756: getstatic       dev/nuker/pyro/fc.0:I
        //   759: ifeq            767
        //   762: ldc             -1340754392
        //   764: goto            769
        //   767: ldc             -259122297
        //   769: ldc             -2075573796
        //   771: ixor           
        //   772: lookupswitch {
        //          -111973076: 767
        //          878508020: 943
        //          default: 800
        //        }
        //   800: goto            804
        //   803: athrow         
        //   804: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   807: goto            811
        //   810: athrow         
        //   811: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //   814: dup            
        //   815: aload_0        
        //   816: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   819: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   822: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   825: aload_0        
        //   826: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   829: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   832: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   835: aload_0        
        //   836: getstatic       dev/nuker/pyro/fc.c:I
        //   839: ifge            847
        //   842: ldc             -339537055
        //   844: goto            849
        //   847: ldc             1445794361
        //   849: ldc             1216574985
        //   851: ixor           
        //   852: lookupswitch {
        //          -1556060824: 945
        //          -1108694711: 847
        //          default: 880
        //        }
        //   880: getfield        dev/nuker/pyro/f83.c:Lnet/minecraft/client/Minecraft;
        //   883: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   886: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   889: iconst_0       
        //   890: goto            894
        //   893: athrow         
        //   894: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //   897: goto            901
        //   900: athrow         
        //   901: checkcast       Lnet/minecraft/network/Packet;
        //   904: goto            908
        //   907: athrow         
        //   908: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   911: goto            915
        //   914: athrow         
        //   915: goto            442
        //   918: return         
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
        //   945: aconst_null    
        //   946: athrow         
        //   947: pop            
        //   948: goto            24
        //   951: pop            
        //   952: aconst_null    
        //   953: goto            947
        //   956: dup            
        //   957: ifnull          947
        //   960: checkcast       Ljava/lang/Throwable;
        //   963: athrow         
        //   964: dup            
        //   965: ifnull          951
        //   968: checkcast       Ljava/lang/Throwable;
        //   971: athrow         
        //   972: aconst_null    
        //   973: athrow         
        //    StackMapTable: 00 74 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FD 00 03 07 00 03 07 00 CB 0A 41 01 1E FF 00 1D 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD FF 00 01 00 02 07 00 03 07 00 CB 00 05 07 00 5E 08 00 51 08 00 51 07 00 CD 01 FF 00 1B 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 42 07 00 15 FF 00 00 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 45 07 00 30 FF 00 00 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD FF 00 0A 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD FF 00 01 00 02 07 00 03 07 00 CB 00 05 07 00 5E 08 00 51 08 00 51 07 00 CD 01 FF 00 1B 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 42 07 00 17 FF 00 00 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 45 07 00 30 FF 00 00 00 02 07 00 03 07 00 CB 00 02 07 00 5E 07 00 3E 40 07 00 5E 45 07 00 30 40 07 00 55 47 07 00 30 40 01 02 04 41 01 19 58 07 00 03 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 03 01 5C 07 00 03 4A 07 00 1B 40 07 00 5E 45 07 00 30 40 01 53 07 00 77 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 77 01 5E 07 00 77 42 07 00 11 40 07 00 77 45 07 00 30 40 07 00 CF 4D 07 00 7C FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 7C 01 5C 07 00 7C 42 07 00 21 40 07 00 7C 45 07 00 30 40 01 02 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 03 01 5B 07 00 03 4D 07 00 38 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 38 01 5B 07 00 38 13 41 01 1D 4E 07 00 38 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 38 01 5E 07 00 38 4D 07 00 0D FF 00 00 00 02 07 00 03 07 00 CB 00 05 07 00 5E 07 00 90 03 03 03 45 07 00 30 00 0A 41 01 1C 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 03 01 5D 07 00 03 47 07 00 30 40 07 00 38 45 07 00 30 40 07 00 C5 4E 07 00 C5 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 C5 01 5E 07 00 C5 42 07 00 21 40 07 00 C5 45 07 00 30 40 07 00 C5 FF 00 23 00 02 07 00 03 07 00 CB 00 06 07 00 C5 08 03 2B 08 03 2B 03 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 CB 00 07 07 00 C5 08 03 2B 08 03 2B 03 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 00 CB 00 06 07 00 C5 08 03 2B 08 03 2B 03 03 07 00 03 FF 00 0C 00 00 00 01 07 00 30 FF 00 00 00 02 07 00 03 07 00 CB 00 07 07 00 C5 08 03 2B 08 03 2B 03 03 03 01 45 07 00 30 FF 00 00 00 02 07 00 03 07 00 CB 00 02 07 00 C5 07 00 B1 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 CB 00 02 07 00 C5 07 00 C3 45 07 00 30 00 02 40 07 00 03 41 07 00 03 01 41 07 00 7C 41 07 00 03 41 07 00 77 FF 00 01 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 01 FF 00 01 00 02 07 00 03 07 00 CB 00 04 07 00 5E 08 00 51 08 00 51 07 00 CD 01 41 07 00 38 41 07 00 38 41 07 00 C5 FF 00 01 00 02 07 00 03 07 00 CB 00 06 07 00 C5 08 03 2B 08 03 2B 03 03 07 00 03 41 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     956    964    Any
        //  956    964    956    964    Ljava/lang/NullPointerException;
        //  972    974    3      8      Ljava/lang/ClassCastException;
        //  131    138    138    139    Any
        //  131    138    3      8      Ljava/util/NoSuchElementException;
        //  131    138    3      8      Ljava/lang/ClassCastException;
        //  131    138    3      8      Ljava/lang/IllegalArgumentException;
        //  131    138    131    132    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  183    190    190    191    Any
        //  183    190    190    191    Any
        //  183    190    190    191    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  184    190    183    184    Ljava/lang/IndexOutOfBoundsException;
        //  183    190    3      8      Any
        //  198    207    207    208    Any
        //  198    207    198    199    Any
        //  199    207    198    199    Any
        //  199    207    3      8      Ljava/util/NoSuchElementException;
        //  198    207    198    199    Any
        //  311    318    318    319    Any
        //  311    318    3      8      Any
        //  311    318    3      8      Ljava/util/ConcurrentModificationException;
        //  312    318    318    319    Any
        //  312    318    311    312    Ljava/lang/NumberFormatException;
        //  375    382    382    383    Any
        //  375    382    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  375    382    382    383    Any
        //  375    382    375    376    Ljava/util/NoSuchElementException;
        //  375    382    3      8      Ljava/lang/ArithmeticException;
        //  431    438    438    439    Any
        //  432    438    438    439    Any
        //  431    438    438    439    Any
        //  432    438    3      8      Ljava/lang/NullPointerException;
        //  432    438    431    432    Ljava/lang/RuntimeException;
        //  642    649    649    650    Any
        //  642    649    3      8      Any
        //  642    649    3      8      Ljava/lang/IllegalStateException;
        //  642    649    649    650    Any
        //  642    649    642    643    Ljava/lang/NullPointerException;
        //  744    751    751    752    Any
        //  744    751    751    752    Ljava/lang/StringIndexOutOfBoundsException;
        //  745    751    744    745    Any
        //  745    751    3      8      Any
        //  745    751    3      8      Any
        //  803    810    810    811    Any
        //  803    810    810    811    Any
        //  804    810    803    804    Ljava/lang/ClassCastException;
        //  804    810    803    804    Ljava/lang/NegativeArraySizeException;
        //  804    810    3      8      Any
        //  894    900    900    901    Any
        //  894    900    3      8      Any
        //  894    900    3      8      Ljava/lang/RuntimeException;
        //  894    900    3      8      Ljava/lang/UnsupportedOperationException;
        //  894    900    900    901    Ljava/lang/ArithmeticException;
        //  907    914    914    915    Any
        //  907    914    914    915    Ljava/lang/StringIndexOutOfBoundsException;
        //  908    914    907    908    Ljava/lang/RuntimeException;
        //  907    914    3      8      Ljava/util/NoSuchElementException;
        //  908    914    3      8      Ljava/lang/RuntimeException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:783)
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
    
    public f83() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u223e\u1496\u8b22\ub3cd\uc976"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u221e\u1496\u8b22\ub3ed\uc956"
        //     8: getstatic       dev/nuker/pyro/fc.0:I
        //    11: ifeq            19
        //    14: ldc             282735935
        //    16: goto            21
        //    19: ldc             1891537521
        //    21: ldc             900428240
        //    23: ixor           
        //    24: lookupswitch {
        //          628180207: 19
        //          1159062433: 52
        //          default: 110
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u2219\u149c\u8b32\ub3cd\uc975\uec6f\ub23d\ue702\ud97d\ue955\ua6fb\u1e43\ue069\uc5b3\u819a\u88b1\u57e4\u76ca\ubd32\uc0bd\u2acf\uc234\u6bcd\u2d16\ud778\u344a\u7d6b\u8862\u8051\u8c25\u856c\ufb30"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: getstatic       dev/nuker/pyro/fc.0:I
        //    63: ifeq            71
        //    66: ldc             93472345
        //    68: goto            73
        //    71: ldc             -171894289
        //    73: ldc             -597485794
        //    75: ixor           
        //    76: lookupswitch {
        //          -638496441: 71
        //          698486513: 104
        //          default: 108
        //        }
        //   104: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   107: return         
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //    StackMapTable: 00 08 FF 00 13 00 01 06 00 03 06 07 00 CD 07 00 CD FF 00 01 00 01 06 00 04 06 07 00 CD 07 00 CD 01 FF 00 1E 00 01 06 00 03 06 07 00 CD 07 00 CD FF 00 12 00 01 06 00 04 06 07 00 CD 07 00 CD 07 00 CD FF 00 01 00 01 06 00 05 06 07 00 CD 07 00 CD 07 00 CD 01 FF 00 1E 00 01 06 00 04 06 07 00 CD 07 00 CD 07 00 CD FF 00 03 00 01 06 00 04 06 07 00 CD 07 00 CD 07 00 CD FF 00 01 00 01 06 00 03 06 07 00 CD 07 00 CD
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
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
