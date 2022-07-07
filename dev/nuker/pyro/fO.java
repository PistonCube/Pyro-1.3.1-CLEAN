// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import net.minecraft.client.gui.GuiPageButtonList$GuiResponder;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

public class fo extends Gui
{
    public int c;
    public FontRenderer c;
    public int 0;
    public int 1;
    public int 2;
    public int 3;
    public String c;
    public int 4;
    public int 5;
    public boolean c;
    public boolean 0;
    public boolean 1;
    public boolean 2;
    public int 6;
    public int 7;
    public int 8;
    public int 9;
    public int a;
    public boolean 3;
    public GuiPageButtonList$GuiResponder c;
    public Predicate<String> c;
    
    public void 2(final boolean b) {
        fbS.4h(this, 1217960077, b);
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2865
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            2857
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2849
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1664111472
        //    32: goto            37
        //    35: ldc             -672818953
        //    37: ldc             -1135989601
        //    39: ixor           
        //    40: lookupswitch {
        //          -545619985: 2770
        //          197521579: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/fo.3:()Z
        //    76: goto            80
        //    79: athrow         
        //    80: ifeq            2755
        //    83: aload_0        
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/fo.c:()Z
        //    91: goto            95
        //    94: athrow         
        //    95: ifeq            351
        //    98: aload_0        
        //    99: getstatic       dev/nuker/pyro/fc.0:I
        //   102: ifeq            110
        //   105: ldc             1377725174
        //   107: goto            112
        //   110: ldc             1788195059
        //   112: ldc             -649077042
        //   114: ixor           
        //   115: lookupswitch {
        //          -1957579720: 2798
        //          1716575326: 110
        //          default: 140
        //        }
        //   140: getfield        dev/nuker/pyro/fo.0:I
        //   143: iconst_1       
        //   144: isub           
        //   145: aload_0        
        //   146: getstatic       dev/nuker/pyro/fc.1:I
        //   149: ifeq            157
        //   152: ldc             216614391
        //   154: goto            159
        //   157: ldc             536052968
        //   159: ldc             -844616612
        //   161: ixor           
        //   162: lookupswitch {
        //          -1052677717: 2788
        //          -425338844: 157
        //          default: 188
        //        }
        //   188: getfield        dev/nuker/pyro/fo.1:I
        //   191: iconst_1       
        //   192: isub           
        //   193: aload_0        
        //   194: getfield        dev/nuker/pyro/fo.0:I
        //   197: aload_0        
        //   198: getfield        dev/nuker/pyro/fo.2:I
        //   201: iadd           
        //   202: iconst_1       
        //   203: iadd           
        //   204: aload_0        
        //   205: getfield        dev/nuker/pyro/fo.1:I
        //   208: aload_0        
        //   209: getfield        dev/nuker/pyro/fo.3:I
        //   212: iadd           
        //   213: iconst_1       
        //   214: iadd           
        //   215: ldc             -6250336
        //   217: goto            221
        //   220: athrow         
        //   221: invokestatic    dev/nuker/pyro/fo.func_73734_a:(IIIII)V
        //   224: goto            228
        //   227: athrow         
        //   228: aload_0        
        //   229: getfield        dev/nuker/pyro/fo.0:I
        //   232: aload_0        
        //   233: getfield        dev/nuker/pyro/fo.1:I
        //   236: aload_0        
        //   237: getfield        dev/nuker/pyro/fo.0:I
        //   240: aload_0        
        //   241: getstatic       dev/nuker/pyro/fc.c:I
        //   244: ifge            252
        //   247: ldc             -727293984
        //   249: goto            254
        //   252: ldc             -1105023836
        //   254: ldc             1163732928
        //   256: ixor           
        //   257: lookupswitch {
        //          -1845790688: 252
        //          -75527324: 284
        //          default: 2790
        //        }
        //   284: getfield        dev/nuker/pyro/fo.2:I
        //   287: iadd           
        //   288: aload_0        
        //   289: getfield        dev/nuker/pyro/fo.1:I
        //   292: aload_0        
        //   293: getfield        dev/nuker/pyro/fo.3:I
        //   296: iadd           
        //   297: ldc             -16777216
        //   299: getstatic       dev/nuker/pyro/fc.c:I
        //   302: ifge            310
        //   305: ldc             -357286456
        //   307: goto            312
        //   310: ldc             1196620083
        //   312: ldc             -1227412760
        //   314: ixor           
        //   315: lookupswitch {
        //          -242887717: 340
        //          1549997856: 310
        //          default: 2806
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokestatic    dev/nuker/pyro/fo.func_73734_a:(IIIII)V
        //   347: goto            351
        //   350: athrow         
        //   351: aload_0        
        //   352: getfield        dev/nuker/pyro/fo.2:Z
        //   355: ifeq            450
        //   358: getstatic       dev/nuker/pyro/fc.0:I
        //   361: ifeq            369
        //   364: ldc             -1140212905
        //   366: goto            371
        //   369: ldc             1732475574
        //   371: ldc             -1446827693
        //   373: ixor           
        //   374: lookupswitch {
        //          -2002531100: 369
        //          365597188: 2780
        //          default: 400
        //        }
        //   400: aload_0        
        //   401: getstatic       dev/nuker/pyro/fc.1:I
        //   404: ifeq            412
        //   407: ldc             -1152882460
        //   409: goto            414
        //   412: ldc             1873469717
        //   414: ldc             -1808473274
        //   416: ixor           
        //   417: lookupswitch {
        //          796691362: 2782
        //          1904630550: 412
        //          default: 444
        //        }
        //   444: getfield        dev/nuker/pyro/fo.9:I
        //   447: goto            495
        //   450: aload_0        
        //   451: getstatic       dev/nuker/pyro/fc.0:I
        //   454: ifeq            462
        //   457: ldc             -1559824495
        //   459: goto            464
        //   462: ldc             1814749800
        //   464: ldc             1313837382
        //   466: ixor           
        //   467: lookupswitch {
        //          -313956649: 462
        //          577073966: 492
        //          default: 2810
        //        }
        //   492: getfield        dev/nuker/pyro/fo.a:I
        //   495: istore_1       
        //   496: aload_0        
        //   497: getstatic       dev/nuker/pyro/fc.1:I
        //   500: ifeq            508
        //   503: ldc             1025586469
        //   505: goto            510
        //   508: ldc             -319624665
        //   510: ldc             -1274799153
        //   512: ixor           
        //   513: lookupswitch {
        //          -1994051862: 2830
        //          -1092749398: 508
        //          default: 540
        //        }
        //   540: getfield        dev/nuker/pyro/fo.7:I
        //   543: aload_0        
        //   544: getfield        dev/nuker/pyro/fo.6:I
        //   547: isub           
        //   548: istore_2       
        //   549: aload_0        
        //   550: getfield        dev/nuker/pyro/fo.8:I
        //   553: getstatic       dev/nuker/pyro/fc.1:I
        //   556: ifeq            564
        //   559: ldc             -977435760
        //   561: goto            566
        //   564: ldc             -263992132
        //   566: ldc             688929221
        //   568: ixor           
        //   569: lookupswitch {
        //          -485715791: 564
        //          -324158891: 2766
        //          default: 596
        //        }
        //   596: aload_0        
        //   597: getfield        dev/nuker/pyro/fo.6:I
        //   600: isub           
        //   601: istore_3       
        //   602: aload_0        
        //   603: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //   606: getstatic       dev/nuker/pyro/fc.0:I
        //   609: ifeq            617
        //   612: ldc             -7407254
        //   614: goto            619
        //   617: ldc             1297016917
        //   619: ldc             -41345002
        //   621: ixor           
        //   622: lookupswitch {
        //          -1966586487: 617
        //          34068860: 2834
        //          default: 648
        //        }
        //   648: aload_0        
        //   649: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   652: aload_0        
        //   653: getfield        dev/nuker/pyro/fo.6:I
        //   656: goto            660
        //   659: athrow         
        //   660: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   663: goto            667
        //   666: athrow         
        //   667: aload_0        
        //   668: goto            672
        //   671: athrow         
        //   672: invokevirtual   dev/nuker/pyro/fo.9:()I
        //   675: goto            679
        //   678: athrow         
        //   679: goto            683
        //   682: athrow         
        //   683: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78269_a:(Ljava/lang/String;I)Ljava/lang/String;
        //   686: goto            690
        //   689: athrow         
        //   690: astore          4
        //   692: iload_2        
        //   693: iflt            758
        //   696: iload_2        
        //   697: aload           4
        //   699: getstatic       dev/nuker/pyro/fc.c:I
        //   702: ifge            710
        //   705: ldc             -1251833092
        //   707: goto            712
        //   710: ldc             -728910898
        //   712: ldc             -2014598217
        //   714: ixor           
        //   715: lookupswitch {
        //          847847755: 2764
        //          1400243641: 710
        //          default: 740
        //        }
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   java/lang/String.length:()I
        //   747: goto            751
        //   750: athrow         
        //   751: if_icmpgt       758
        //   754: iconst_1       
        //   755: goto            759
        //   758: iconst_0       
        //   759: istore          5
        //   761: aload_0        
        //   762: getfield        dev/nuker/pyro/fo.1:Z
        //   765: ifeq            773
        //   768: ldc             -327006188
        //   770: goto            775
        //   773: ldc             -327006189
        //   775: ldc             1605120951
        //   777: ixor           
        //   778: tableswitch {
        //          1717368646: 800
        //          1717368647: 853
        //          default: 768
        //        }
        //   800: aload_0        
        //   801: getfield        dev/nuker/pyro/fo.5:I
        //   804: bipush          6
        //   806: idiv           
        //   807: iconst_2       
        //   808: irem           
        //   809: ifne            817
        //   812: ldc             1264029595
        //   814: goto            819
        //   817: ldc             1264029594
        //   819: ldc             833102255
        //   821: ixor           
        //   822: tableswitch {
        //          -167814040: 844
        //          -167814039: 853
        //          default: 812
        //        }
        //   844: iload           5
        //   846: ifeq            853
        //   849: iconst_1       
        //   850: goto            854
        //   853: iconst_0       
        //   854: istore          6
        //   856: aload_0        
        //   857: getfield        dev/nuker/pyro/fo.c:Z
        //   860: ifeq            916
        //   863: aload_0        
        //   864: getstatic       dev/nuker/pyro/fc.0:I
        //   867: ifeq            875
        //   870: ldc             -2056867607
        //   872: goto            877
        //   875: ldc             -744940717
        //   877: ldc             -640809277
        //   879: ixor           
        //   880: lookupswitch {
        //          173481360: 908
        //          1554560554: 875
        //          default: 2838
        //        }
        //   908: getfield        dev/nuker/pyro/fo.0:I
        //   911: iconst_4       
        //   912: iadd           
        //   913: goto            964
        //   916: getstatic       dev/nuker/pyro/fc.1:I
        //   919: ifeq            927
        //   922: ldc             -1627981117
        //   924: goto            929
        //   927: ldc             -2105434608
        //   929: ldc             -1674145248
        //   931: ixor           
        //   932: lookupswitch {
        //          46164195: 2820
        //          1953465854: 927
        //          default: 960
        //        }
        //   960: aload_0        
        //   961: getfield        dev/nuker/pyro/fo.0:I
        //   964: istore          7
        //   966: getstatic       dev/nuker/pyro/fc.c:I
        //   969: ifge            977
        //   972: ldc             -1914040734
        //   974: goto            979
        //   977: ldc             1021732475
        //   979: ldc             394933258
        //   981: ixor           
        //   982: lookupswitch {
        //          -1704969624: 977
        //          728519281: 1008
        //          default: 2804
        //        }
        //  1008: aload_0        
        //  1009: getfield        dev/nuker/pyro/fo.c:Z
        //  1012: ifeq            1020
        //  1015: ldc             1946010005
        //  1017: goto            1022
        //  1020: ldc             1946010006
        //  1022: ldc             347481792
        //  1024: ixor           
        //  1025: tableswitch {
        //          -828911958: 1048
        //          -828911957: 1109
        //          default: 1015
        //        }
        //  1048: aload_0        
        //  1049: getfield        dev/nuker/pyro/fo.1:I
        //  1052: getstatic       dev/nuker/pyro/fc.1:I
        //  1055: ifeq            1063
        //  1058: ldc             -1655250529
        //  1060: goto            1065
        //  1063: ldc             -2126568788
        //  1065: ldc             60354823
        //  1067: ixor           
        //  1068: lookupswitch {
        //          -1630662504: 2800
        //          427636624: 1063
        //          default: 1096
        //        }
        //  1096: aload_0        
        //  1097: getfield        dev/nuker/pyro/fo.3:I
        //  1100: bipush          8
        //  1102: isub           
        //  1103: iconst_2       
        //  1104: idiv           
        //  1105: iadd           
        //  1106: goto            1113
        //  1109: aload_0        
        //  1110: getfield        dev/nuker/pyro/fo.1:I
        //  1113: getstatic       dev/nuker/pyro/fc.1:I
        //  1116: ifeq            1124
        //  1119: ldc             -1174999506
        //  1121: goto            1126
        //  1124: ldc             1235332667
        //  1126: ldc             303240965
        //  1128: ixor           
        //  1129: lookupswitch {
        //          -1410991829: 2814
        //          531418919: 1124
        //          default: 1156
        //        }
        //  1156: istore          8
        //  1158: iload           7
        //  1160: istore          9
        //  1162: iload_3        
        //  1163: aload           4
        //  1165: goto            1169
        //  1168: athrow         
        //  1169: invokevirtual   java/lang/String.length:()I
        //  1172: goto            1176
        //  1175: athrow         
        //  1176: if_icmple       1193
        //  1179: aload           4
        //  1181: goto            1185
        //  1184: athrow         
        //  1185: invokevirtual   java/lang/String.length:()I
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: istore_3       
        //  1193: aload           4
        //  1195: getstatic       dev/nuker/pyro/fc.1:I
        //  1198: ifeq            1206
        //  1201: ldc             -1526218032
        //  1203: goto            1208
        //  1206: ldc             -1488073617
        //  1208: ldc             -966232894
        //  1210: ixor           
        //  1211: lookupswitch {
        //          1629862061: 1236
        //          1668265490: 1206
        //          default: 2802
        //        }
        //  1236: goto            1240
        //  1239: athrow         
        //  1240: invokevirtual   java/lang/String.isEmpty:()Z
        //  1243: goto            1247
        //  1246: athrow         
        //  1247: ifne            1454
        //  1250: iload           5
        //  1252: ifeq            1314
        //  1255: getstatic       dev/nuker/pyro/fc.c:I
        //  1258: ifge            1266
        //  1261: ldc             1259616674
        //  1263: goto            1268
        //  1266: ldc             -1596927024
        //  1268: ldc             1211321725
        //  1270: ixor           
        //  1271: lookupswitch {
        //          -387735891: 1296
        //          52917471: 1266
        //          default: 2816
        //        }
        //  1296: aload           4
        //  1298: iconst_0       
        //  1299: iload_2        
        //  1300: goto            1304
        //  1303: athrow         
        //  1304: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: goto            1316
        //  1314: aload           4
        //  1316: astore          10
        //  1318: aload_0        
        //  1319: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  1322: aload           10
        //  1324: ldc             "\u10ad\u14cc\ub9e7\ub180\ufe94"
        //  1326: goto            1330
        //  1329: athrow         
        //  1330: invokestatic    invokestatic   !!! ERROR
        //  1333: goto            1337
        //  1336: athrow         
        //  1337: ldc             "*"
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1346: goto            1350
        //  1349: athrow         
        //  1350: getstatic       dev/nuker/pyro/fc.1:I
        //  1353: ifeq            1361
        //  1356: ldc             1028364641
        //  1358: goto            1363
        //  1361: ldc             -1783632841
        //  1363: ldc             -868745615
        //  1365: ixor           
        //  1366: lookupswitch {
        //          -243505392: 2818
        //          -53996916: 1361
        //          default: 1392
        //        }
        //  1392: iload           7
        //  1394: i2f            
        //  1395: iload           8
        //  1397: i2f            
        //  1398: iload_1        
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: invokevirtual   net/minecraft/client/gui/FontRenderer.func_175063_a:(Ljava/lang/String;FFI)I
        //  1406: goto            1410
        //  1409: athrow         
        //  1410: getstatic       dev/nuker/pyro/fc.c:I
        //  1413: ifge            1421
        //  1416: ldc             -661947067
        //  1418: goto            1423
        //  1421: ldc             5778516
        //  1423: ldc             498769840
        //  1425: ixor           
        //  1426: lookupswitch {
        //          -1968394032: 1421
        //          -986586379: 2776
        //          default: 1452
        //        }
        //  1452: istore          9
        //  1454: aload_0        
        //  1455: getfield        dev/nuker/pyro/fo.7:I
        //  1458: aload_0        
        //  1459: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1462: goto            1466
        //  1465: athrow         
        //  1466: invokevirtual   java/lang/String.length:()I
        //  1469: goto            1473
        //  1472: athrow         
        //  1473: if_icmplt       1638
        //  1476: getstatic       dev/nuker/pyro/fc.1:I
        //  1479: ifeq            1487
        //  1482: ldc             1900215836
        //  1484: goto            1489
        //  1487: ldc             -1831342742
        //  1489: ldc             19429823
        //  1491: ixor           
        //  1492: lookupswitch {
        //          -1811966763: 1520
        //          1886029731: 1487
        //          default: 2772
        //        }
        //  1520: aload_0        
        //  1521: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1524: getstatic       dev/nuker/pyro/fc.c:I
        //  1527: ifge            1535
        //  1530: ldc             596033182
        //  1532: goto            1537
        //  1535: ldc             1148970426
        //  1537: ldc             1908705594
        //  1539: ixor           
        //  1540: lookupswitch {
        //          -2035343616: 1535
        //          1380071332: 2760
        //          default: 1568
        //        }
        //  1568: goto            1572
        //  1571: athrow         
        //  1572: invokevirtual   java/lang/String.length:()I
        //  1575: goto            1579
        //  1578: athrow         
        //  1579: aload_0        
        //  1580: getstatic       dev/nuker/pyro/fc.c:I
        //  1583: ifge            1591
        //  1586: ldc             459401388
        //  1588: goto            1593
        //  1591: ldc             584927276
        //  1593: ldc             1974949552
        //  1595: ixor           
        //  1596: lookupswitch {
        //          1466572444: 1624
        //          1859567132: 1591
        //          default: 2768
        //        }
        //  1624: goto            1628
        //  1627: athrow         
        //  1628: invokevirtual   dev/nuker/pyro/fo.6:()I
        //  1631: goto            1635
        //  1634: athrow         
        //  1635: if_icmplt       1642
        //  1638: iconst_1       
        //  1639: goto            1643
        //  1642: iconst_0       
        //  1643: getstatic       dev/nuker/pyro/fc.0:I
        //  1646: ifeq            1654
        //  1649: ldc             1673019345
        //  1651: goto            1656
        //  1654: ldc             1657852768
        //  1656: ldc             207227866
        //  1658: ixor           
        //  1659: lookupswitch {
        //          -1977957980: 1654
        //          1877095435: 2826
        //          default: 1684
        //        }
        //  1684: istore          10
        //  1686: iload           9
        //  1688: istore          11
        //  1690: iload           5
        //  1692: ifne            1759
        //  1695: iload_2        
        //  1696: ifle            1709
        //  1699: iload           7
        //  1701: aload_0        
        //  1702: getfield        dev/nuker/pyro/fo.2:I
        //  1705: iadd           
        //  1706: goto            1754
        //  1709: getstatic       dev/nuker/pyro/fc.0:I
        //  1712: ifeq            1720
        //  1715: ldc             -735110108
        //  1717: goto            1722
        //  1720: ldc             -84841442
        //  1722: ldc             857997779
        //  1724: ixor           
        //  1725: lookupswitch {
        //          -418701833: 2784
        //          632078903: 1720
        //          default: 1752
        //        }
        //  1752: iload           7
        //  1754: istore          11
        //  1756: goto            1814
        //  1759: getstatic       dev/nuker/pyro/fc.1:I
        //  1762: ifeq            1770
        //  1765: ldc             -1268730243
        //  1767: goto            1772
        //  1770: ldc             -476379734
        //  1772: ldc             -1154712400
        //  1774: ixor           
        //  1775: lookupswitch {
        //          256690893: 2756
        //          1046850580: 1770
        //          default: 1800
        //        }
        //  1800: iload           10
        //  1802: ifeq            1814
        //  1805: iload           9
        //  1807: iconst_1       
        //  1808: isub           
        //  1809: istore          11
        //  1811: iinc            9, -1
        //  1814: aload           4
        //  1816: goto            1820
        //  1819: athrow         
        //  1820: invokevirtual   java/lang/String.isEmpty:()Z
        //  1823: goto            1827
        //  1826: athrow         
        //  1827: ifne            2102
        //  1830: iload           5
        //  1832: ifeq            2102
        //  1835: iload_2        
        //  1836: aload           4
        //  1838: goto            1842
        //  1841: athrow         
        //  1842: invokevirtual   java/lang/String.length:()I
        //  1845: goto            1849
        //  1848: athrow         
        //  1849: if_icmpge       1857
        //  1852: ldc             -400833210
        //  1854: goto            1859
        //  1857: ldc             -400833209
        //  1859: ldc             -1869153260
        //  1861: ixor           
        //  1862: tableswitch {
        //          -249924956: 1884
        //          -249924955: 2102
        //          default: 1852
        //        }
        //  1884: getstatic       dev/nuker/pyro/fc.0:I
        //  1887: ifeq            1895
        //  1890: ldc             2077828392
        //  1892: goto            1897
        //  1895: ldc             -2035595014
        //  1897: ldc             1445295788
        //  1899: ixor           
        //  1900: lookupswitch {
        //          771511172: 2758
        //          1670018744: 1895
        //          default: 1928
        //        }
        //  1928: aload_0        
        //  1929: getstatic       dev/nuker/pyro/fc.c:I
        //  1932: ifge            1940
        //  1935: ldc             480189589
        //  1937: goto            1943
        //  1940: ldc_w           -1294425112
        //  1943: ldc_w           1282847743
        //  1946: ixor           
        //  1947: lookupswitch {
        //          -22147049: 1972
        //          1357492074: 1940
        //          default: 2836
        //        }
        //  1972: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  1975: aload           4
        //  1977: iload_2        
        //  1978: goto            1982
        //  1981: athrow         
        //  1982: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1985: goto            1989
        //  1988: athrow         
        //  1989: getstatic       dev/nuker/pyro/fc.c:I
        //  1992: ifge            2001
        //  1995: ldc_w           1490270623
        //  1998: goto            2004
        //  2001: ldc_w           897362912
        //  2004: ldc_w           -27090244
        //  2007: ixor           
        //  2008: lookupswitch {
        //          -1947008778: 2001
        //          -1498342621: 2808
        //          default: 2036
        //        }
        //  2036: iload           9
        //  2038: i2f            
        //  2039: iload           8
        //  2041: i2f            
        //  2042: getstatic       dev/nuker/pyro/fc.1:I
        //  2045: ifeq            2054
        //  2048: ldc_w           854333347
        //  2051: goto            2057
        //  2054: ldc_w           1616627461
        //  2057: ldc_w           36506627
        //  2060: ixor           
        //  2061: lookupswitch {
        //          817961888: 2054
        //          1651952390: 2088
        //          default: 2812
        //        }
        //  2088: iload_1        
        //  2089: goto            2093
        //  2092: athrow         
        //  2093: invokevirtual   net/minecraft/client/gui/FontRenderer.func_175063_a:(Ljava/lang/String;FFI)I
        //  2096: goto            2100
        //  2099: athrow         
        //  2100: istore          9
        //  2102: getstatic       dev/nuker/pyro/fc.0:I
        //  2105: ifeq            2114
        //  2108: ldc_w           -1978304144
        //  2111: goto            2117
        //  2114: ldc_w           1207511972
        //  2117: ldc_w           -302695529
        //  2120: ixor           
        //  2121: lookupswitch {
        //          -1442049997: 2148
        //          1742750439: 2114
        //          default: 2774
        //        }
        //  2148: iload           6
        //  2150: ifeq            2496
        //  2153: getstatic       dev/nuker/pyro/fc.c:I
        //  2156: ifge            2165
        //  2159: ldc_w           -1240794382
        //  2162: goto            2168
        //  2165: ldc_w           1551503002
        //  2168: ldc_w           33886615
        //  2171: ixor           
        //  2172: lookupswitch {
        //          -1274025115: 2165
        //          1585389325: 2200
        //          default: 2824
        //        }
        //  2200: iload           10
        //  2202: ifeq            2378
        //  2205: iload           11
        //  2207: getstatic       dev/nuker/pyro/fc.c:I
        //  2210: ifge            2219
        //  2213: ldc_w           -1626878209
        //  2216: goto            2222
        //  2219: ldc_w           -1443244393
        //  2222: ldc_w           -2087719
        //  2225: ixor           
        //  2226: lookupswitch {
        //          1444541006: 2252
        //          1625811494: 2219
        //          default: 2794
        //        }
        //  2252: iload           8
        //  2254: iconst_1       
        //  2255: isub           
        //  2256: iload           11
        //  2258: iconst_1       
        //  2259: iadd           
        //  2260: iload           8
        //  2262: iconst_1       
        //  2263: iadd           
        //  2264: getstatic       dev/nuker/pyro/fc.0:I
        //  2267: ifeq            2276
        //  2270: ldc_w           1234400159
        //  2273: goto            2279
        //  2276: ldc_w           -1981438203
        //  2279: ldc_w           584593726
        //  2282: ixor           
        //  2283: lookupswitch {
        //          -1422027205: 2308
        //          1800094369: 2276
        //          default: 2832
        //        }
        //  2308: aload_0        
        //  2309: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  2312: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  2315: iadd           
        //  2316: ldc_w           -3092272
        //  2319: getstatic       dev/nuker/pyro/fc.1:I
        //  2322: ifeq            2331
        //  2325: ldc_w           -2029867674
        //  2328: goto            2334
        //  2331: ldc_w           197676316
        //  2334: ldc_w           1104068441
        //  2337: ixor           
        //  2338: lookupswitch {
        //          -959704513: 2331
        //          1241969221: 2364
        //          default: 2796
        //        }
        //  2364: goto            2368
        //  2367: athrow         
        //  2368: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //  2371: goto            2375
        //  2374: athrow         
        //  2375: goto            2496
        //  2378: aload_0        
        //  2379: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  2382: ldc_w           "_"
        //  2385: getstatic       dev/nuker/pyro/fc.1:I
        //  2388: ifeq            2397
        //  2391: ldc_w           -1345108639
        //  2394: goto            2400
        //  2397: ldc_w           -659146429
        //  2400: ldc_w           514536830
        //  2403: ixor           
        //  2404: lookupswitch {
        //          -1317507041: 2397
        //          -971174851: 2432
        //          default: 2762
        //        }
        //  2432: iload           11
        //  2434: i2f            
        //  2435: iload           8
        //  2437: i2f            
        //  2438: iload_1        
        //  2439: getstatic       dev/nuker/pyro/fc.1:I
        //  2442: ifeq            2451
        //  2445: ldc_w           1662338438
        //  2448: goto            2454
        //  2451: ldc_w           -1579918078
        //  2454: ldc_w           827810854
        //  2457: ixor           
        //  2458: lookupswitch {
        //          1380065696: 2792
        //          1747469463: 2451
        //          default: 2484
        //        }
        //  2484: goto            2488
        //  2487: athrow         
        //  2488: invokevirtual   net/minecraft/client/gui/FontRenderer.func_175063_a:(Ljava/lang/String;FFI)I
        //  2491: goto            2495
        //  2494: athrow         
        //  2495: pop            
        //  2496: iload_3        
        //  2497: getstatic       dev/nuker/pyro/fc.1:I
        //  2500: ifeq            2509
        //  2503: ldc_w           -1282782183
        //  2506: goto            2512
        //  2509: ldc_w           59730008
        //  2512: ldc_w           738723351
        //  2515: ixor           
        //  2516: lookupswitch {
        //          -1618851314: 2509
        //          797404751: 2544
        //          default: 2822
        //        }
        //  2544: iload_2        
        //  2545: if_icmpeq       2755
        //  2548: iload           7
        //  2550: aload_0        
        //  2551: getstatic       dev/nuker/pyro/fc.0:I
        //  2554: ifeq            2563
        //  2557: ldc_w           -110024834
        //  2560: goto            2566
        //  2563: ldc_w           -1211991203
        //  2566: ldc_w           2107924649
        //  2569: ixor           
        //  2570: lookupswitch {
        //          -2066397225: 2563
        //          -899277836: 2596
        //          default: 2828
        //        }
        //  2596: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  2599: aload           4
        //  2601: iconst_0       
        //  2602: iload_3        
        //  2603: goto            2607
        //  2606: athrow         
        //  2607: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  2610: goto            2614
        //  2613: athrow         
        //  2614: goto            2618
        //  2617: athrow         
        //  2618: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //  2621: goto            2625
        //  2624: athrow         
        //  2625: iadd           
        //  2626: getstatic       dev/nuker/pyro/fc.1:I
        //  2629: ifeq            2638
        //  2632: ldc_w           -124988259
        //  2635: goto            2641
        //  2638: ldc_w           364602620
        //  2641: ldc_w           -966218861
        //  2644: ixor           
        //  2645: lookupswitch {
        //          -741093521: 2672
        //          1055162126: 2638
        //          default: 2778
        //        }
        //  2672: istore          12
        //  2674: aload_0        
        //  2675: iload           11
        //  2677: getstatic       dev/nuker/pyro/fc.0:I
        //  2680: ifeq            2689
        //  2683: ldc_w           1384725470
        //  2686: goto            2692
        //  2689: ldc_w           -810643810
        //  2692: ldc_w           1167111718
        //  2695: ixor           
        //  2696: lookupswitch {
        //          -1975633736: 2724
        //          387550712: 2689
        //          default: 2786
        //        }
        //  2724: iload           8
        //  2726: iconst_1       
        //  2727: isub           
        //  2728: iload           12
        //  2730: iconst_1       
        //  2731: isub           
        //  2732: iload           8
        //  2734: iconst_1       
        //  2735: iadd           
        //  2736: aload_0        
        //  2737: getfield        dev/nuker/pyro/fo.c:Lnet/minecraft/client/gui/FontRenderer;
        //  2740: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  2743: iadd           
        //  2744: goto            2748
        //  2747: athrow         
        //  2748: invokespecial   dev/nuker/pyro/fo.c:(IIII)V
        //  2751: goto            2755
        //  2754: athrow         
        //  2755: return         
        //  2756: aconst_null    
        //  2757: athrow         
        //  2758: aconst_null    
        //  2759: athrow         
        //  2760: aconst_null    
        //  2761: athrow         
        //  2762: aconst_null    
        //  2763: athrow         
        //  2764: aconst_null    
        //  2765: athrow         
        //  2766: aconst_null    
        //  2767: athrow         
        //  2768: aconst_null    
        //  2769: athrow         
        //  2770: aconst_null    
        //  2771: athrow         
        //  2772: aconst_null    
        //  2773: athrow         
        //  2774: aconst_null    
        //  2775: athrow         
        //  2776: aconst_null    
        //  2777: athrow         
        //  2778: aconst_null    
        //  2779: athrow         
        //  2780: aconst_null    
        //  2781: athrow         
        //  2782: aconst_null    
        //  2783: athrow         
        //  2784: aconst_null    
        //  2785: athrow         
        //  2786: aconst_null    
        //  2787: athrow         
        //  2788: aconst_null    
        //  2789: athrow         
        //  2790: aconst_null    
        //  2791: athrow         
        //  2792: aconst_null    
        //  2793: athrow         
        //  2794: aconst_null    
        //  2795: athrow         
        //  2796: aconst_null    
        //  2797: athrow         
        //  2798: aconst_null    
        //  2799: athrow         
        //  2800: aconst_null    
        //  2801: athrow         
        //  2802: aconst_null    
        //  2803: athrow         
        //  2804: aconst_null    
        //  2805: athrow         
        //  2806: aconst_null    
        //  2807: athrow         
        //  2808: aconst_null    
        //  2809: athrow         
        //  2810: aconst_null    
        //  2811: athrow         
        //  2812: aconst_null    
        //  2813: athrow         
        //  2814: aconst_null    
        //  2815: athrow         
        //  2816: aconst_null    
        //  2817: athrow         
        //  2818: aconst_null    
        //  2819: athrow         
        //  2820: aconst_null    
        //  2821: athrow         
        //  2822: aconst_null    
        //  2823: athrow         
        //  2824: aconst_null    
        //  2825: athrow         
        //  2826: aconst_null    
        //  2827: athrow         
        //  2828: aconst_null    
        //  2829: athrow         
        //  2830: aconst_null    
        //  2831: athrow         
        //  2832: aconst_null    
        //  2833: athrow         
        //  2834: aconst_null    
        //  2835: athrow         
        //  2836: aconst_null    
        //  2837: athrow         
        //  2838: aconst_null    
        //  2839: athrow         
        //  2840: pop            
        //  2841: goto            24
        //  2844: pop            
        //  2845: aconst_null    
        //  2846: goto            2840
        //  2849: dup            
        //  2850: ifnull          2840
        //  2853: checkcast       Ljava/lang/Throwable;
        //  2856: athrow         
        //  2857: dup            
        //  2858: ifnull          2844
        //  2861: checkcast       Ljava/lang/Throwable;
        //  2864: athrow         
        //  2865: aconst_null    
        //  2866: athrow         
        //    StackMapTable: 01 45 43 07 00 48 04 FF 00 0B 00 00 00 01 07 00 48 FC 00 03 07 00 03 0A 41 01 1E FF 00 03 00 00 00 01 07 00 48 FF 00 00 00 01 07 00 03 00 01 07 00 03 45 07 00 48 40 01 46 07 00 2E 40 07 00 03 45 07 00 48 40 01 4E 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5B 07 00 03 FF 00 10 00 01 07 00 03 00 02 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 01 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 01 07 00 03 5F 07 00 32 FF 00 00 00 01 07 00 03 00 05 01 01 01 01 01 45 07 00 48 00 FF 00 17 00 01 07 00 03 00 04 01 01 01 07 00 03 FF 00 01 00 01 07 00 03 00 05 01 01 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 04 01 01 01 07 00 03 FF 00 19 00 01 07 00 03 00 05 01 01 01 01 01 FF 00 01 00 01 07 00 03 00 06 01 01 01 01 01 01 FF 00 1B 00 01 07 00 03 00 05 01 01 01 01 01 42 07 00 48 FF 00 00 00 01 07 00 03 00 05 01 01 01 01 01 45 07 00 48 00 11 41 01 1C 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 05 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5B 07 00 03 42 01 FF 00 0C 00 02 07 00 03 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 01 5D 07 00 03 FF 00 17 00 03 07 00 03 01 01 00 01 01 FF 00 01 00 03 07 00 03 01 01 00 02 01 01 5D 01 FF 00 14 00 04 07 00 03 01 01 01 00 01 07 00 99 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 99 01 5C 07 00 99 4A 07 00 34 FF 00 00 00 04 07 00 03 01 01 01 00 03 07 00 99 07 00 90 01 45 07 00 48 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 99 07 00 90 43 07 00 48 FF 00 00 00 04 07 00 03 01 01 01 00 03 07 00 99 07 00 90 07 00 03 45 07 00 48 FF 00 00 00 04 07 00 03 01 01 01 00 03 07 00 99 07 00 90 01 42 07 00 38 FF 00 00 00 04 07 00 03 01 01 01 00 03 07 00 99 07 00 90 01 45 07 00 48 40 07 00 90 FF 00 13 00 05 07 00 03 01 01 01 07 00 90 00 02 01 07 00 90 FF 00 01 00 05 07 00 03 01 01 01 07 00 90 00 03 01 07 00 90 01 FF 00 1B 00 05 07 00 03 01 01 01 07 00 90 00 02 01 07 00 90 42 07 00 48 FF 00 00 00 05 07 00 03 01 01 01 07 00 90 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 05 07 00 03 01 01 01 07 00 90 00 02 01 01 06 40 01 FC 00 08 01 04 41 01 18 0B 04 41 01 18 08 40 01 FF 00 14 00 07 07 00 03 01 01 01 07 00 90 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 07 00 90 01 01 00 02 07 00 03 01 5E 07 00 03 07 0A 41 01 1E 43 01 FC 00 0C 01 41 01 1C 06 04 41 01 19 4E 01 FF 00 01 00 08 07 00 03 01 01 01 07 00 90 01 01 01 00 02 01 01 5E 01 0C 43 01 4A 01 FF 00 01 00 08 07 00 03 01 01 01 07 00 90 01 01 01 00 02 01 01 5D 01 FF 00 0B 00 00 00 01 07 00 48 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 01 47 07 00 48 40 07 00 90 45 07 00 48 40 01 00 4C 07 00 90 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 07 00 90 01 5B 07 00 90 42 07 00 48 40 07 00 90 45 07 00 48 40 01 12 41 01 1B 46 07 00 48 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 03 07 00 90 01 01 45 07 00 48 40 07 00 90 02 41 07 00 90 FF 00 0C 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 01 07 00 26 FF 00 00 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 03 07 00 99 07 00 90 07 00 90 45 07 00 48 FF 00 00 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 03 07 00 99 07 00 90 07 00 90 44 07 00 48 FF 00 00 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 04 07 00 99 07 00 90 07 00 90 07 00 90 45 07 00 48 FF 00 00 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 02 07 00 99 07 00 90 FF 00 0A 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 02 07 00 99 07 00 90 FF 00 01 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 03 07 00 99 07 00 90 01 FF 00 1C 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 02 07 00 99 07 00 90 49 07 00 38 FF 00 00 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 05 07 00 99 07 00 90 02 02 01 45 07 00 48 40 01 4A 01 FF 00 01 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 02 01 01 5C 01 FA 00 01 4A 07 00 3C FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 01 0D 41 01 1E 4E 07 00 90 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 07 00 90 01 5E 07 00 90 42 07 00 48 40 07 00 90 45 07 00 48 40 01 FF 00 0B 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 03 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 03 01 07 00 03 01 FF 00 1E 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 03 42 07 00 40 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 03 45 07 00 48 FF 00 00 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 01 02 03 40 01 4A 01 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 01 5B 01 FD 00 18 01 01 0A 41 01 1D 41 01 04 0A 41 01 1B 0D 44 07 00 48 40 07 00 90 45 07 00 48 40 01 4D 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 01 02 04 41 01 18 0A 41 01 1E 4B 07 00 03 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 03 01 5C 07 00 03 48 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 07 00 99 07 00 90 01 45 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 0B 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 07 00 99 07 00 90 01 FF 00 1F 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 11 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 07 00 99 07 00 90 02 02 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 FF 00 1E 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 07 00 99 07 00 90 02 02 FF 00 03 00 00 00 01 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 45 07 00 48 40 01 01 0B 42 01 1E 10 42 01 1F 52 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 01 5D 01 FF 00 17 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 01 01 01 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 01 01 01 01 FF 00 1C 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 01 01 01 01 FF 00 16 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 01 01 01 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 06 01 01 01 01 01 01 FF 00 1D 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 01 01 01 01 42 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 01 01 01 01 45 07 00 48 00 02 FF 00 12 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 07 00 99 07 00 90 01 FF 00 1F 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 12 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 06 07 00 99 07 00 90 02 02 01 01 FF 00 1D 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 42 07 00 32 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 45 07 00 48 40 01 00 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 01 5F 01 FF 00 12 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 07 00 03 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 01 07 00 03 01 FF 00 1D 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 07 00 03 49 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 07 00 99 07 00 90 01 01 45 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 01 07 00 99 07 00 90 42 07 00 40 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 03 01 07 00 99 07 00 90 45 07 00 48 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 01 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 01 5E 01 FF 00 10 00 0D 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 01 00 02 07 00 03 01 FF 00 02 00 0D 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 01 00 03 07 00 03 01 01 FF 00 1F 00 0D 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 01 00 02 07 00 03 01 56 07 00 48 FF 00 00 00 0D 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 01 00 05 07 00 03 01 01 01 01 45 07 00 48 FF 00 00 00 01 07 00 03 00 00 FF 00 00 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 00 01 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 01 07 00 90 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 01 00 05 07 00 03 01 01 01 07 00 90 00 02 01 07 00 90 FF 00 01 00 03 07 00 03 01 01 00 01 01 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 02 01 07 00 03 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 00 FD 00 01 01 01 FF 00 01 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 01 01 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 01 01 FF 00 01 00 01 07 00 03 00 00 41 07 00 03 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 00 FF 00 01 00 0D 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 01 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 02 01 07 00 03 FF 00 01 00 01 07 00 03 00 04 01 01 01 07 00 03 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 07 00 99 07 00 90 02 02 01 41 01 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 05 01 01 01 01 01 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 08 07 00 03 01 01 01 07 00 90 01 01 01 00 01 01 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 01 07 00 90 F9 00 01 FF 00 01 00 01 07 00 03 00 05 01 01 01 01 01 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 07 00 99 07 00 90 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 07 00 99 07 00 90 02 02 FF 00 01 00 08 07 00 03 01 01 01 07 00 90 01 01 01 00 01 01 FD 00 01 01 01 FF 00 01 00 0B 07 00 03 01 01 01 07 00 90 01 01 01 01 01 07 00 90 00 02 07 00 99 07 00 90 FF 00 01 00 07 07 00 03 01 01 01 07 00 90 01 01 00 00 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 01 01 01 FF 00 01 00 0A 07 00 03 01 01 01 07 00 90 01 01 01 01 01 00 01 01 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 01 07 00 03 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 04 01 01 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 99 FF 00 01 00 0C 07 00 03 01 01 01 07 00 90 01 01 01 01 01 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 07 00 90 01 01 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 32 43 05 44 07 00 32 47 05 47 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2849   2857   Ljava/lang/NumberFormatException;
        //  2849   2857   2849   2857   Ljava/lang/IllegalStateException;
        //  2865   2867   3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Ljava/util/ConcurrentModificationException;
        //  73     79     3      8      Ljava/lang/ClassCastException;
        //  73     79     79     80     Any
        //  73     79     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  87     94     94     95     Any
        //  87     94     94     95     Any
        //  88     94     3      8      Any
        //  88     94     94     95     Any
        //  88     94     87     88     Ljava/lang/IllegalArgumentException;
        //  220    227    227    228    Any
        //  220    227    227    228    Any
        //  220    227    220    221    Ljava/lang/UnsupportedOperationException;
        //  220    227    220    221    Ljava/lang/RuntimeException;
        //  220    227    220    221    Ljava/lang/ArithmeticException;
        //  343    350    350    351    Any
        //  344    350    350    351    Any
        //  343    350    343    344    Any
        //  344    350    350    351    Any
        //  343    350    343    344    Any
        //  659    666    666    667    Any
        //  660    666    3      8      Any
        //  660    666    3      8      Ljava/lang/UnsupportedOperationException;
        //  659    666    659    660    Ljava/lang/ArithmeticException;
        //  660    666    666    667    Any
        //  671    678    678    679    Any
        //  671    678    678    679    Ljava/lang/NumberFormatException;
        //  672    678    678    679    Any
        //  672    678    671    672    Any
        //  671    678    3      8      Any
        //  682    689    689    690    Any
        //  683    689    3      8      Any
        //  682    689    3      8      Ljava/lang/NullPointerException;
        //  682    689    689    690    Any
        //  682    689    682    683    Ljava/lang/StringIndexOutOfBoundsException;
        //  743    750    750    751    Any
        //  743    750    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  743    750    3      8      Ljava/lang/IllegalArgumentException;
        //  743    750    743    744    Any
        //  743    750    743    744    Any
        //  1169   1175   1175   1176   Any
        //  1169   1175   1175   1176   Ljava/lang/NullPointerException;
        //  1169   1175   3      8      Ljava/lang/ArithmeticException;
        //  1169   1175   1175   1176   Ljava/lang/RuntimeException;
        //  1169   1175   3      8      Any
        //  1184   1191   1191   1192   Any
        //  1185   1191   3      8      Ljava/lang/NegativeArraySizeException;
        //  1184   1191   3      8      Ljava/lang/UnsupportedOperationException;
        //  1185   1191   1184   1185   Any
        //  1184   1191   1184   1185   Any
        //  1239   1246   1246   1247   Any
        //  1239   1246   3      8      Any
        //  1240   1246   1239   1240   Ljava/lang/StringIndexOutOfBoundsException;
        //  1240   1246   1239   1240   Any
        //  1240   1246   1246   1247   Any
        //  1303   1310   1310   1311   Any
        //  1303   1310   1303   1304   Any
        //  1303   1310   3      8      Ljava/lang/NegativeArraySizeException;
        //  1303   1310   1310   1311   Ljava/util/ConcurrentModificationException;
        //  1304   1310   1303   1304   Ljava/lang/AssertionError;
        //  1329   1336   1336   1337   Any
        //  1330   1336   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1329   1336   1329   1330   Ljava/lang/IllegalStateException;
        //  1329   1336   3      8      Any
        //  1329   1336   1336   1337   Ljava/lang/EnumConstantNotPresentException;
        //  1342   1349   1349   1350   Any
        //  1343   1349   1342   1343   Ljava/lang/StringIndexOutOfBoundsException;
        //  1342   1349   1349   1350   Ljava/lang/NumberFormatException;
        //  1343   1349   1342   1343   Any
        //  1343   1349   1349   1350   Any
        //  1402   1409   1409   1410   Any
        //  1402   1409   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1402   1409   1409   1410   Ljava/util/NoSuchElementException;
        //  1403   1409   1402   1403   Ljava/lang/StringIndexOutOfBoundsException;
        //  1402   1409   3      8      Any
        //  1465   1472   1472   1473   Any
        //  1465   1472   1472   1473   Any
        //  1466   1472   1465   1466   Ljava/lang/NegativeArraySizeException;
        //  1465   1472   1472   1473   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1465   1472   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1571   1578   1578   1579   Any
        //  1571   1578   3      8      Ljava/lang/ClassCastException;
        //  1571   1578   1571   1572   Any
        //  1571   1578   1578   1579   Ljava/lang/NegativeArraySizeException;
        //  1571   1578   1578   1579   Any
        //  1627   1634   1634   1635   Any
        //  1627   1634   1627   1628   Ljava/lang/IndexOutOfBoundsException;
        //  1628   1634   3      8      Any
        //  1627   1634   1634   1635   Ljava/lang/NegativeArraySizeException;
        //  1628   1634   1634   1635   Any
        //  1819   1826   1826   1827   Any
        //  1820   1826   1826   1827   Any
        //  1820   1826   1819   1820   Ljava/lang/NegativeArraySizeException;
        //  1819   1826   1819   1820   Any
        //  1820   1826   1826   1827   Any
        //  1841   1848   1848   1849   Any
        //  1842   1848   1841   1842   Any
        //  1842   1848   1848   1849   Any
        //  1841   1848   1848   1849   Ljava/util/NoSuchElementException;
        //  1842   1848   1848   1849   Ljava/lang/StringIndexOutOfBoundsException;
        //  1981   1988   1988   1989   Any
        //  1981   1988   1981   1982   Any
        //  1981   1988   1988   1989   Any
        //  1982   1988   3      8      Ljava/util/ConcurrentModificationException;
        //  1981   1988   1981   1982   Any
        //  2093   2099   2099   2100   Any
        //  2093   2099   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2093   2099   3      8      Ljava/lang/NullPointerException;
        //  2093   2099   3      8      Ljava/lang/AssertionError;
        //  2093   2099   3      8      Ljava/lang/AssertionError;
        //  2367   2374   2374   2375   Any
        //  2367   2374   3      8      Any
        //  2367   2374   2374   2375   Any
        //  2367   2374   2367   2368   Any
        //  2367   2374   2367   2368   Ljava/lang/StringIndexOutOfBoundsException;
        //  2487   2494   2494   2495   Any
        //  2487   2494   2487   2488   Ljava/lang/RuntimeException;
        //  2488   2494   2494   2495   Any
        //  2488   2494   2494   2495   Ljava/lang/IllegalStateException;
        //  2488   2494   3      8      Ljava/lang/NumberFormatException;
        //  2606   2613   2613   2614   Any
        //  2607   2613   3      8      Ljava/lang/AssertionError;
        //  2606   2613   3      8      Any
        //  2607   2613   2613   2614   Ljava/util/ConcurrentModificationException;
        //  2606   2613   2606   2607   Any
        //  2617   2624   2624   2625   Any
        //  2617   2624   2624   2625   Ljava/lang/EnumConstantNotPresentException;
        //  2617   2624   2624   2625   Ljava/lang/IllegalStateException;
        //  2617   2624   3      8      Any
        //  2618   2624   2617   2618   Ljava/lang/IndexOutOfBoundsException;
        //  2747   2754   2754   2755   Any
        //  2747   2754   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2748   2754   2747   2748   Any
        //  2747   2754   2747   2748   Ljava/lang/IndexOutOfBoundsException;
        //  2747   2754   2754   2755   Any
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
    
    static {
        throw t;
    }
    
    public void 3(final boolean b) {
        fbS.4b(this, 1089867667, b);
    }
    
    public int 3(final int n) {
        return fbS.5U(this, 454171499, n);
    }
    
    public void 0(final String s) {
        fbS.9q(this, 2115916981, s);
    }
    
    public void c(final boolean b) {
        fbS.4q(this, 389600485, b);
    }
    
    public void 4() {
        fbS.dk(this, 1515395454);
    }
    
    public String 7() {
        return fbS.4U(this, 1849641031);
    }
    
    public void 1(final boolean b) {
        fbS.4g(this, 651544698, b);
    }
    
    public void 7(final int n) {
        fbS.6s(this, 1819646624, n);
    }
    
    public void c(final int n, final int n2, final int n3) {
        fbS.b3(this, 1791887802, n, n2, n3);
    }
    
    public void 0() {
        fbS.du(this, 135522517);
    }
    
    public boolean 2() {
        return fbS.ei(this, 1786633062);
    }
    
    public void a() {
        fbS.dx(this, 1911824832);
    }
    
    public int 1() {
        return fbS.bl(this, 637793185);
    }
    
    public boolean c() {
        return fbS.ek(this, 1945509876);
    }
    
    public int 6() {
        return fbS.bN(this, 374447537);
    }
    
    public int c(final int p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          812
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            804
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            796
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_2        
        //    25: istore          4
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            39
        //    33: ldc_w           856025356
        //    36: goto            42
        //    39: ldc_w           133187157
        //    42: ldc_w           -1784669586
        //    45: ixor           
        //    46: lookupswitch {
        //          -1499073694: 785
        //          -602002131: 39
        //          default: 72
        //        }
        //    72: iload_1        
        //    73: ifge            82
        //    76: ldc_w           -1032866205
        //    79: goto            85
        //    82: ldc_w           -1032866206
        //    85: ldc_w           -1595155359
        //    88: ixor           
        //    89: tableswitch {
        //          -989277180: 112
        //          -989277179: 116
        //          default: 76
        //        }
        //   112: iconst_1       
        //   113: goto            117
        //   116: iconst_0       
        //   117: istore          5
        //   119: iload_1        
        //   120: goto            124
        //   123: athrow         
        //   124: invokestatic    java/lang/Math.abs:(I)I
        //   127: goto            131
        //   130: athrow         
        //   131: istore          6
        //   133: iconst_0       
        //   134: istore          7
        //   136: iload           7
        //   138: getstatic       dev/nuker/pyro/fc.0:I
        //   141: ifeq            150
        //   144: ldc_w           -113823461
        //   147: goto            153
        //   150: ldc_w           755312764
        //   153: ldc_w           -1454621468
        //   156: ixor           
        //   157: lookupswitch {
        //          -2075585384: 184
        //          1350241791: 150
        //          default: 769
        //        }
        //   184: iload           6
        //   186: if_icmpge       764
        //   189: iload           5
        //   191: ifne            559
        //   194: aload_0        
        //   195: getstatic       dev/nuker/pyro/fc.c:I
        //   198: ifge            207
        //   201: ldc_w           -1745468850
        //   204: goto            210
        //   207: ldc_w           691823389
        //   210: ldc_w           -845488136
        //   213: ixor           
        //   214: lookupswitch {
        //          -860318257: 207
        //          1517067702: 773
        //          default: 240
        //        }
        //   240: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   243: goto            247
        //   246: athrow         
        //   247: invokevirtual   java/lang/String.length:()I
        //   250: goto            254
        //   253: athrow         
        //   254: istore          8
        //   256: getstatic       dev/nuker/pyro/fc.0:I
        //   259: ifeq            268
        //   262: ldc_w           574878229
        //   265: goto            271
        //   268: ldc_w           442632070
        //   271: ldc_w           1235420679
        //   274: ixor           
        //   275: lookupswitch {
        //          -1252467807: 268
        //          1809904658: 767
        //          default: 300
        //        }
        //   300: aload_0        
        //   301: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   304: bipush          32
        //   306: getstatic       dev/nuker/pyro/fc.0:I
        //   309: ifeq            318
        //   312: ldc_w           529308617
        //   315: goto            321
        //   318: ldc_w           -190173141
        //   321: ldc_w           1569514186
        //   324: ixor           
        //   325: lookupswitch {
        //          -1457073439: 352
        //          1107327235: 318
        //          default: 771
        //        }
        //   352: iload           4
        //   354: goto            358
        //   357: athrow         
        //   358: invokevirtual   java/lang/String.indexOf:(II)I
        //   361: goto            365
        //   364: athrow         
        //   365: istore          4
        //   367: iload           4
        //   369: iconst_m1      
        //   370: if_icmpne       425
        //   373: iload           8
        //   375: getstatic       dev/nuker/pyro/fc.1:I
        //   378: ifeq            387
        //   381: ldc_w           -1966440244
        //   384: goto            390
        //   387: ldc_w           -833732228
        //   390: ldc_w           -1360832350
        //   393: ixor           
        //   394: lookupswitch {
        //          -1420828915: 387
        //          606722158: 783
        //          default: 420
        //        }
        //   420: istore          4
        //   422: goto            556
        //   425: getstatic       dev/nuker/pyro/fc.c:I
        //   428: ifge            437
        //   431: ldc_w           1765239320
        //   434: goto            440
        //   437: ldc_w           -1894622550
        //   440: ldc_w           -1715584376
        //   443: ixor           
        //   444: lookupswitch {
        //          -259446640: 437
        //          380377122: 472
        //          default: 775
        //        }
        //   472: iload_3        
        //   473: ifeq            556
        //   476: iload           4
        //   478: iload           8
        //   480: if_icmpge       556
        //   483: aload_0        
        //   484: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   487: getstatic       dev/nuker/pyro/fc.c:I
        //   490: ifge            499
        //   493: ldc_w           1381196078
        //   496: goto            502
        //   499: ldc_w           612343712
        //   502: ldc_w           711874504
        //   505: ixor           
        //   506: lookupswitch {
        //          1483771681: 499
        //          2017277670: 779
        //          default: 532
        //        }
        //   532: iload           4
        //   534: goto            538
        //   537: athrow         
        //   538: invokevirtual   java/lang/String.charAt:(I)C
        //   541: goto            545
        //   544: athrow         
        //   545: bipush          32
        //   547: if_icmpne       556
        //   550: iinc            4, 1
        //   553: goto            425
        //   556: goto            758
        //   559: iload_3        
        //   560: ifeq            642
        //   563: iload           4
        //   565: ifle            642
        //   568: aload_0        
        //   569: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   572: getstatic       dev/nuker/pyro/fc.c:I
        //   575: ifge            584
        //   578: ldc_w           1071964662
        //   581: goto            587
        //   584: ldc_w           -900808746
        //   587: ldc_w           645737234
        //   590: ixor           
        //   591: lookupswitch {
        //          -283586345: 584
        //          429509348: 781
        //          default: 616
        //        }
        //   616: iload           4
        //   618: iconst_1       
        //   619: isub           
        //   620: goto            624
        //   623: athrow         
        //   624: invokevirtual   java/lang/String.charAt:(I)C
        //   627: goto            631
        //   630: athrow         
        //   631: bipush          32
        //   633: if_icmpne       642
        //   636: iinc            4, -1
        //   639: goto            559
        //   642: iload           4
        //   644: ifle            653
        //   647: ldc_w           -980441648
        //   650: goto            656
        //   653: ldc_w           -980441647
        //   656: ldc_w           756317650
        //   659: ixor           
        //   660: tableswitch {
        //          -784879612: 684
        //          -784879611: 758
        //          default: 647
        //        }
        //   684: aload_0        
        //   685: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   688: iload           4
        //   690: iconst_1       
        //   691: isub           
        //   692: getstatic       dev/nuker/pyro/fc.c:I
        //   695: ifge            704
        //   698: ldc_w           -1165704542
        //   701: goto            707
        //   704: ldc_w           -2114313608
        //   707: ldc_w           1971518141
        //   710: ixor           
        //   711: lookupswitch {
        //          -821676001: 777
        //          -498889650: 704
        //          default: 736
        //        }
        //   736: goto            740
        //   739: athrow         
        //   740: invokevirtual   java/lang/String.charAt:(I)C
        //   743: goto            747
        //   746: athrow         
        //   747: bipush          32
        //   749: if_icmpeq       758
        //   752: iinc            4, -1
        //   755: goto            642
        //   758: iinc            7, 1
        //   761: goto            136
        //   764: iload           4
        //   766: ireturn        
        //   767: aconst_null    
        //   768: athrow         
        //   769: aconst_null    
        //   770: athrow         
        //   771: aconst_null    
        //   772: athrow         
        //   773: aconst_null    
        //   774: athrow         
        //   775: aconst_null    
        //   776: athrow         
        //   777: aconst_null    
        //   778: athrow         
        //   779: aconst_null    
        //   780: athrow         
        //   781: aconst_null    
        //   782: athrow         
        //   783: aconst_null    
        //   784: athrow         
        //   785: aconst_null    
        //   786: athrow         
        //   787: pop            
        //   788: goto            24
        //   791: pop            
        //   792: aconst_null    
        //   793: goto            787
        //   796: dup            
        //   797: ifnull          787
        //   800: checkcast       Ljava/lang/Throwable;
        //   803: athrow         
        //   804: dup            
        //   805: ifnull          791
        //   808: checkcast       Ljava/lang/Throwable;
        //   811: athrow         
        //   812: aconst_null    
        //   813: athrow         
        //    StackMapTable: 00 5A FF 00 03 00 06 07 00 03 01 01 01 01 01 00 01 07 00 48 F9 00 04 FF 00 0B 00 00 00 01 07 00 48 FF 00 03 00 04 07 00 03 01 01 01 00 00 FC 00 0E 01 42 01 1D 03 05 42 01 1A 03 40 01 FF 00 05 00 06 07 00 03 01 01 01 01 01 00 01 07 00 48 40 01 45 07 00 48 40 01 FD 00 04 01 01 4D 01 FF 00 02 00 08 07 00 03 01 01 01 01 01 01 01 00 02 01 01 5E 01 56 07 00 03 FF 00 02 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 03 01 5D 07 00 03 45 07 00 48 40 07 00 90 45 07 00 48 40 01 FC 00 0D 01 42 01 1C FF 00 11 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 07 00 90 01 FF 00 02 00 09 07 00 03 01 01 01 01 01 01 01 01 00 03 07 00 90 01 01 FF 00 1E 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 07 00 90 01 44 07 00 48 FF 00 00 00 09 07 00 03 01 01 01 01 01 01 01 01 00 03 07 00 90 01 01 45 07 00 48 40 01 55 01 FF 00 02 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 01 01 5D 01 04 0B 42 01 1F 5A 07 00 90 FF 00 02 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 07 00 90 01 5D 07 00 90 44 07 00 40 FF 00 00 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 07 00 90 01 45 07 00 48 40 01 0A FA 00 02 58 07 00 90 FF 00 02 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 5C 07 00 90 FF 00 06 00 00 00 01 07 00 48 FF 00 00 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 45 07 00 48 40 01 0A 04 05 42 01 1B FF 00 13 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 FF 00 02 00 08 07 00 03 01 01 01 01 01 01 01 00 03 07 00 90 01 01 FF 00 1C 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 42 07 00 48 FF 00 00 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 45 07 00 48 40 01 0A 05 FC 00 02 01 FF 00 01 00 08 07 00 03 01 01 01 01 01 01 01 00 01 01 FF 00 01 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 07 00 90 01 FF 00 01 00 08 07 00 03 01 01 01 01 01 01 01 00 01 07 00 03 FC 00 01 01 FF 00 01 00 08 07 00 03 01 01 01 01 01 01 01 00 02 07 00 90 01 FF 00 01 00 09 07 00 03 01 01 01 01 01 01 01 01 00 01 07 00 90 FF 00 01 00 08 07 00 03 01 01 01 01 01 01 01 00 01 07 00 90 FF 00 01 00 09 07 00 03 01 01 01 01 01 01 01 01 00 01 01 FF 00 01 00 05 07 00 03 01 01 01 01 00 00 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 32 43 05 44 07 00 32 47 05 FF 00 07 00 06 07 00 03 01 01 01 01 01 00 01 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     796    804    Ljava/lang/IllegalArgumentException;
        //  796    804    796    804    Ljava/lang/StringIndexOutOfBoundsException;
        //  812    814    3      8      Ljava/lang/AssertionError;
        //  123    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    3      8      Any
        //  123    130    3      8      Ljava/lang/NumberFormatException;
        //  124    130    123    124    Any
        //  246    253    253    254    Any
        //  246    253    253    254    Ljava/lang/AssertionError;
        //  247    253    246    247    Any
        //  247    253    246    247    Any
        //  246    253    253    254    Any
        //  357    364    364    365    Any
        //  357    364    364    365    Any
        //  357    364    364    365    Any
        //  358    364    357    358    Any
        //  357    364    357    358    Any
        //  537    544    544    545    Any
        //  537    544    544    545    Ljava/lang/RuntimeException;
        //  537    544    544    545    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  537    544    537    538    Ljava/lang/IndexOutOfBoundsException;
        //  538    544    3      8      Any
        //  624    630    630    631    Any
        //  624    630    3      8      Any
        //  624    630    630    631    Any
        //  624    630    630    631    Any
        //  624    630    630    631    Any
        //  739    746    746    747    Any
        //  740    746    739    740    Ljava/lang/ClassCastException;
        //  739    746    3      8      Ljava/lang/IllegalArgumentException;
        //  739    746    739    740    Any
        //  740    746    3      8      Ljava/lang/NumberFormatException;
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
    
    public fo(final int c, final FontRenderer c2, final int 0, final int 2, final int 3, final int 4) {
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.c < 0) {
                    n = 547345083;
                    break Label_0016;
                }
                n = 232189484;
            }
            switch (n ^ 0x7C5CCD4E) {
                case 1556291573: {
                    continue;
                }
                case 1904878434: {
                    this.c = "";
                    this.4 = 32;
                    this.c = true;
                    this.0 = true;
                    this.2 = true;
                    this.9 = 14737632;
                    while (true) {
                        int n2 = 0;
                        Label_0101: {
                            if (fc.1 != 0) {
                                n2 = 657914231;
                                break Label_0101;
                            }
                            n2 = -841421526;
                        }
                        switch (n2 ^ 0xD2CF7D9B) {
                            case -168196884: {
                                continue;
                            }
                            case 521638065: {
                                final int a = 7368816;
                                while (true) {
                                    int n3 = 0;
                                    Label_0151: {
                                        if (fc.1 != 0) {
                                            n3 = 867807250;
                                            break Label_0151;
                                        }
                                        n3 = -1444080685;
                                    }
                                    switch (n3 ^ 0x96900824) {
                                        case -1523992522: {
                                            continue;
                                        }
                                        case 1065163767: {
                                            this.a = a;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0198: {
                                                    if (fc.c < 0) {
                                                        n4 = -370878227;
                                                        break Label_0198;
                                                    }
                                                    n4 = -418979938;
                                                }
                                                switch (n4 ^ 0x28B035A0) {
                                                    case -1051398835: {
                                                        continue;
                                                    }
                                                    case -810096066: {
                                                        this.3 = true;
                                                        this.c = (Predicate<String>)Predicates.alwaysTrue();
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0255: {
                                                                if (fc.0 != 0) {
                                                                    n5 = -1827374724;
                                                                    break Label_0255;
                                                                }
                                                                n5 = -743800157;
                                                            }
                                                            switch (n5 ^ 0x95642B35) {
                                                                case 108024393: {
                                                                    continue;
                                                                }
                                                                case 1187948950: {
                                                                    this.c = c;
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0306: {
                                                                            if (fc.1 != 0) {
                                                                                n6 = -1426915770;
                                                                                break Label_0306;
                                                                            }
                                                                            n6 = 1017308667;
                                                                        }
                                                                        switch (n6 ^ 0x7C0BFC88) {
                                                                            case -688323890: {
                                                                                continue;
                                                                            }
                                                                            case 1084823923: {
                                                                                this.c = c2;
                                                                                this.0 = 0;
                                                                                this.1 = 2;
                                                                                while (true) {
                                                                                    int n7 = 0;
                                                                                    Label_0368: {
                                                                                        if (fc.1 != 0) {
                                                                                            n7 = -982017687;
                                                                                            break Label_0368;
                                                                                        }
                                                                                        n7 = -975921376;
                                                                                    }
                                                                                    switch (n7 ^ 0xA15E7DE7) {
                                                                                        case 1680467086: {
                                                                                            continue;
                                                                                        }
                                                                                        case 1686823623: {
                                                                                            this.2 = 3;
                                                                                            while (true) {
                                                                                                int n8 = 0;
                                                                                                Label_0419: {
                                                                                                    if (fc.c < 0) {
                                                                                                        n8 = 7540046;
                                                                                                        break Label_0419;
                                                                                                    }
                                                                                                    n8 = -641483984;
                                                                                                }
                                                                                                switch (n8 ^ 0x563877D) {
                                                                                                    case -758490949: {
                                                                                                        continue;
                                                                                                    }
                                                                                                    default: {
                                                                                                        while (true) {
                                                                                                            int n9 = 0;
                                                                                                            Label_0465: {
                                                                                                                if (fc.c < 0) {
                                                                                                                    n9 = -290611169;
                                                                                                                    break Label_0465;
                                                                                                                }
                                                                                                                n9 = 1124067097;
                                                                                                            }
                                                                                                            switch (n9 ^ 0x96F3013A) {
                                                                                                                case 909633050: {
                                                                                                                    continue;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    this.3 = 4;
                                                                                                                    return;
                                                                                                                }
                                                                                                                case 2019467557: {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    case 84970035: {
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
    
    public void c(final int n, final String s) {
        fbS.8V(this, 715750042, n, s);
    }
    
    public void 2(final int n) {
        fbS.65(this, 47057843, n);
    }
    
    public void c(final int n) {
        fbS.67(this, 1501424311, n);
    }
    
    public int 8() {
        return fbS.bI(this, 920612478);
    }
    
    public boolean 3() {
        return fbS.eg(this, 1947403792);
    }
    
    public void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2140
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2132
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2124
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc_w           ""
        //    27: astore_2       
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            40
        //    34: ldc_w           1277293832
        //    37: goto            43
        //    40: ldc_w           954655984
        //    43: ldc_w           1206528987
        //    46: ixor           
        //    47: lookupswitch {
        //          -1679002034: 40
        //          197910227: 2061
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            85
        //    79: ldc_w           135668298
        //    82: goto            88
        //    85: ldc_w           150441819
        //    88: ldc_w           -477296748
        //    91: ixor           
        //    92: lookupswitch {
        //          -1655259043: 85
        //          -342153762: 2085
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokestatic    net/minecraft/util/ChatAllowedCharacters.func_71565_a:(Ljava/lang/String;)Ljava/lang/String;
        //   127: goto            131
        //   130: athrow         
        //   131: getstatic       dev/nuker/pyro/fc.0:I
        //   134: ifeq            143
        //   137: ldc_w           -806415181
        //   140: goto            146
        //   143: ldc_w           1061173894
        //   146: ldc_w           522251473
        //   149: ixor           
        //   150: lookupswitch {
        //          -791676830: 143
        //          543217239: 176
        //          default: 2065
        //        }
        //   176: astore_3       
        //   177: aload_0        
        //   178: getstatic       dev/nuker/pyro/fc.c:I
        //   181: ifge            190
        //   184: ldc_w           1969408637
        //   187: goto            193
        //   190: ldc_w           -1621203487
        //   193: ldc_w           -840225882
        //   196: ixor           
        //   197: lookupswitch {
        //          -1198923301: 190
        //          1387613767: 224
        //          default: 2109
        //        }
        //   224: getfield        dev/nuker/pyro/fo.7:I
        //   227: getstatic       dev/nuker/pyro/fc.1:I
        //   230: ifeq            239
        //   233: ldc_w           984614608
        //   236: goto            242
        //   239: ldc_w           214945812
        //   242: ldc_w           1708606240
        //   245: ixor           
        //   246: lookupswitch {
        //          682511006: 239
        //          1600603632: 2075
        //          default: 272
        //        }
        //   272: aload_0        
        //   273: getfield        dev/nuker/pyro/fo.8:I
        //   276: if_icmpge       285
        //   279: ldc_w           1710105552
        //   282: goto            288
        //   285: ldc_w           1710105555
        //   288: ldc_w           -1148936395
        //   291: ixor           
        //   292: tableswitch {
        //          -1126860342: 316
        //          -1126860341: 370
        //          default: 279
        //        }
        //   316: aload_0        
        //   317: getstatic       dev/nuker/pyro/fc.0:I
        //   320: ifeq            329
        //   323: ldc_w           -38579001
        //   326: goto            332
        //   329: ldc_w           487572775
        //   332: ldc_w           -1106890485
        //   335: ixor           
        //   336: lookupswitch {
        //          -737106172: 329
        //          1135961548: 2095
        //          default: 364
        //        }
        //   364: getfield        dev/nuker/pyro/fo.7:I
        //   367: goto            374
        //   370: aload_0        
        //   371: getfield        dev/nuker/pyro/fo.8:I
        //   374: istore          4
        //   376: aload_0        
        //   377: getstatic       dev/nuker/pyro/fc.0:I
        //   380: ifeq            389
        //   383: ldc_w           -380322943
        //   386: goto            392
        //   389: ldc_w           2125610838
        //   392: ldc_w           605987080
        //   395: ixor           
        //   396: lookupswitch {
        //          -850781559: 389
        //          1521262174: 424
        //          default: 2059
        //        }
        //   424: getfield        dev/nuker/pyro/fo.7:I
        //   427: getstatic       dev/nuker/pyro/fc.c:I
        //   430: ifge            439
        //   433: ldc_w           -782168414
        //   436: goto            442
        //   439: ldc_w           2114550812
        //   442: ldc_w           1199321150
        //   445: ixor           
        //   446: lookupswitch {
        //          -1776468324: 2077
        //          414053536: 439
        //          default: 472
        //        }
        //   472: aload_0        
        //   473: getfield        dev/nuker/pyro/fo.8:I
        //   476: if_icmpge       530
        //   479: aload_0        
        //   480: getstatic       dev/nuker/pyro/fc.1:I
        //   483: ifeq            492
        //   486: ldc_w           1175245156
        //   489: goto            495
        //   492: ldc_w           1858441702
        //   495: ldc_w           -277612770
        //   498: ixor           
        //   499: lookupswitch {
        //          -1451284870: 2055
        //          1861155856: 492
        //          default: 524
        //        }
        //   524: getfield        dev/nuker/pyro/fo.8:I
        //   527: goto            580
        //   530: getstatic       dev/nuker/pyro/fc.c:I
        //   533: ifge            542
        //   536: ldc_w           -1898721276
        //   539: goto            545
        //   542: ldc_w           1745215166
        //   545: ldc_w           311487104
        //   548: ixor           
        //   549: lookupswitch {
        //          -1673315708: 542
        //          2056598590: 576
        //          default: 2099
        //        }
        //   576: aload_0        
        //   577: getfield        dev/nuker/pyro/fo.7:I
        //   580: istore          5
        //   582: getstatic       dev/nuker/pyro/fc.c:I
        //   585: ifge            594
        //   588: ldc_w           757674487
        //   591: goto            597
        //   594: ldc_w           891395392
        //   597: ldc_w           -784116456
        //   600: ixor           
        //   601: lookupswitch {
        //          -463288232: 628
        //          -60136209: 594
        //          default: 2101
        //        }
        //   628: aload_0        
        //   629: getfield        dev/nuker/pyro/fo.4:I
        //   632: aload_0        
        //   633: getstatic       dev/nuker/pyro/fc.c:I
        //   636: ifge            645
        //   639: ldc_w           -895390411
        //   642: goto            648
        //   645: ldc_w           -591490224
        //   648: ldc_w           -1735417982
        //   651: ixor           
        //   652: lookupswitch {
        //          1144065234: 680
        //          1378808503: 645
        //          default: 2087
        //        }
        //   680: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   683: goto            687
        //   686: athrow         
        //   687: invokevirtual   java/lang/String.length:()I
        //   690: goto            694
        //   693: athrow         
        //   694: isub           
        //   695: iload           4
        //   697: iload           5
        //   699: isub           
        //   700: isub           
        //   701: istore          6
        //   703: aload_0        
        //   704: getstatic       dev/nuker/pyro/fc.c:I
        //   707: ifge            716
        //   710: ldc_w           1305080684
        //   713: goto            719
        //   716: ldc_w           -1959944404
        //   719: ldc_w           1965930446
        //   722: ixor           
        //   723: lookupswitch {
        //          -33543966: 748
        //          954483874: 716
        //          default: 2097
        //        }
        //   748: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   751: goto            755
        //   754: athrow         
        //   755: invokevirtual   java/lang/String.isEmpty:()Z
        //   758: goto            762
        //   761: athrow         
        //   762: ifne            972
        //   765: new             Ljava/lang/StringBuilder;
        //   768: dup            
        //   769: getstatic       dev/nuker/pyro/fc.c:I
        //   772: ifge            781
        //   775: ldc_w           1369508488
        //   778: goto            784
        //   781: ldc_w           1941789641
        //   784: ldc_w           763815656
        //   787: ixor           
        //   788: lookupswitch {
        //          -1984313758: 781
        //          2082991200: 2079
        //          default: 816
        //        }
        //   816: goto            820
        //   819: athrow         
        //   820: invokespecial   java/lang/StringBuilder.<init>:()V
        //   823: goto            827
        //   826: athrow         
        //   827: aload_2        
        //   828: goto            832
        //   831: athrow         
        //   832: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   835: goto            839
        //   838: athrow         
        //   839: getstatic       dev/nuker/pyro/fc.c:I
        //   842: ifge            851
        //   845: ldc_w           -439228610
        //   848: goto            854
        //   851: ldc_w           1655144050
        //   854: ldc_w           705147986
        //   857: ixor           
        //   858: lookupswitch {
        //          -808037524: 851
        //          1218497056: 884
        //          default: 2081
        //        }
        //   884: aload_0        
        //   885: getstatic       dev/nuker/pyro/fc.1:I
        //   888: ifeq            897
        //   891: ldc_w           -667111095
        //   894: goto            900
        //   897: ldc_w           -1952254044
        //   900: ldc_w           -296930859
        //   903: ixor           
        //   904: lookupswitch {
        //          913408156: 2067
        //          2117531617: 897
        //          default: 932
        //        }
        //   932: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   935: iconst_0       
        //   936: iload           4
        //   938: goto            942
        //   941: athrow         
        //   942: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   945: goto            949
        //   948: athrow         
        //   949: goto            953
        //   952: athrow         
        //   953: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   956: goto            960
        //   959: athrow         
        //   960: goto            964
        //   963: athrow         
        //   964: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   967: goto            971
        //   970: athrow         
        //   971: astore_2       
        //   972: iload           6
        //   974: aload_3        
        //   975: getstatic       dev/nuker/pyro/fc.0:I
        //   978: ifeq            987
        //   981: ldc_w           1560742526
        //   984: goto            990
        //   987: ldc_w           -1415466876
        //   990: ldc_w           -1856560562
        //   993: ixor           
        //   994: lookupswitch {
        //          -867162064: 987
        //          989237962: 1020
        //          default: 2105
        //        }
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokevirtual   java/lang/String.length:()I
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: if_icmpge       1287
        //  1034: new             Ljava/lang/StringBuilder;
        //  1037: dup            
        //  1038: goto            1042
        //  1041: athrow         
        //  1042: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1045: goto            1049
        //  1048: athrow         
        //  1049: aload_2        
        //  1050: getstatic       dev/nuker/pyro/fc.0:I
        //  1053: ifeq            1062
        //  1056: ldc_w           -1535935022
        //  1059: goto            1065
        //  1062: ldc_w           -1195855076
        //  1065: ldc_w           -1059685841
        //  1068: ixor           
        //  1069: lookupswitch {
        //          722378729: 1062
        //          1688537085: 2073
        //          default: 1096
        //        }
        //  1096: goto            1100
        //  1099: athrow         
        //  1100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1103: goto            1107
        //  1106: athrow         
        //  1107: aload_3        
        //  1108: iconst_0       
        //  1109: iload           6
        //  1111: getstatic       dev/nuker/pyro/fc.c:I
        //  1114: ifge            1123
        //  1117: ldc_w           -669120846
        //  1120: goto            1126
        //  1123: ldc_w           -92756979
        //  1126: ldc_w           2018752071
        //  1129: ixor           
        //  1130: lookupswitch {
        //          -2111106486: 1156
        //          -1605521163: 1123
        //          default: 2103
        //        }
        //  1156: goto            1160
        //  1159: athrow         
        //  1160: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1163: goto            1167
        //  1166: athrow         
        //  1167: getstatic       dev/nuker/pyro/fc.0:I
        //  1170: ifeq            1179
        //  1173: ldc_w           1663418110
        //  1176: goto            1182
        //  1179: ldc_w           1255055228
        //  1182: ldc_w           109375947
        //  1185: ixor           
        //  1186: lookupswitch {
        //          1279946423: 1212
        //          1705070389: 1179
        //          default: 2107
        //        }
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1230: goto            1234
        //  1233: athrow         
        //  1234: astore_2       
        //  1235: getstatic       dev/nuker/pyro/fc.1:I
        //  1238: ifeq            1247
        //  1241: ldc_w           -1956509136
        //  1244: goto            1250
        //  1247: ldc_w           2115461334
        //  1250: ldc_w           -640294560
        //  1253: ixor           
        //  1254: lookupswitch {
        //          -1480425034: 1280
        //          1387785040: 1247
        //          default: 2089
        //        }
        //  1280: iload           6
        //  1282: istore          7
        //  1284: goto            1489
        //  1287: new             Ljava/lang/StringBuilder;
        //  1290: dup            
        //  1291: getstatic       dev/nuker/pyro/fc.0:I
        //  1294: ifeq            1303
        //  1297: ldc_w           332089611
        //  1300: goto            1306
        //  1303: ldc_w           1017241044
        //  1306: ldc_w           2013116434
        //  1309: ixor           
        //  1310: lookupswitch {
        //          -689083007: 1303
        //          1681322265: 2083
        //          default: 1336
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: aload_2        
        //  1348: goto            1352
        //  1351: athrow         
        //  1352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1355: goto            1359
        //  1358: athrow         
        //  1359: getstatic       dev/nuker/pyro/fc.0:I
        //  1362: ifeq            1371
        //  1365: ldc_w           1405153636
        //  1368: goto            1374
        //  1371: ldc_w           1912394374
        //  1374: ldc_w           -294348495
        //  1377: ixor           
        //  1378: lookupswitch {
        //          -1112250283: 2057
        //          1131901891: 1371
        //          default: 1404
        //        }
        //  1404: aload_3        
        //  1405: getstatic       dev/nuker/pyro/fc.c:I
        //  1408: ifge            1417
        //  1411: ldc_w           215221360
        //  1414: goto            1420
        //  1417: ldc_w           663440271
        //  1420: ldc_w           -1010746642
        //  1423: ixor           
        //  1424: lookupswitch {
        //          -820691298: 2069
        //          618800737: 1417
        //          default: 1452
        //        }
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1470: goto            1474
        //  1473: athrow         
        //  1474: astore_2       
        //  1475: aload_3        
        //  1476: goto            1480
        //  1479: athrow         
        //  1480: invokevirtual   java/lang/String.length:()I
        //  1483: goto            1487
        //  1486: athrow         
        //  1487: istore          7
        //  1489: aload_0        
        //  1490: getstatic       dev/nuker/pyro/fc.1:I
        //  1493: ifeq            1502
        //  1496: ldc_w           -890922420
        //  1499: goto            1505
        //  1502: ldc_w           -1964135626
        //  1505: ldc_w           -1156257420
        //  1508: ixor           
        //  1509: lookupswitch {
        //          -1790761377: 1502
        //          1911649080: 2071
        //          default: 1536
        //        }
        //  1536: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1539: goto            1543
        //  1542: athrow         
        //  1543: invokevirtual   java/lang/String.isEmpty:()Z
        //  1546: goto            1550
        //  1549: athrow         
        //  1550: ifne            1808
        //  1553: iload           5
        //  1555: aload_0        
        //  1556: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1559: getstatic       dev/nuker/pyro/fc.0:I
        //  1562: ifeq            1571
        //  1565: ldc_w           -2134292981
        //  1568: goto            1574
        //  1571: ldc_w           589472281
        //  1574: ldc_w           -964620683
        //  1577: ixor           
        //  1578: lookupswitch {
        //          -442258324: 1604
        //          1179142270: 1571
        //          default: 2111
        //        }
        //  1604: goto            1608
        //  1607: athrow         
        //  1608: invokevirtual   java/lang/String.length:()I
        //  1611: goto            1615
        //  1614: athrow         
        //  1615: if_icmpge       1624
        //  1618: ldc_w           -598241683
        //  1621: goto            1627
        //  1624: ldc_w           -598241684
        //  1627: ldc_w           -731682467
        //  1630: ixor           
        //  1631: tableswitch {
        //          275369568: 1652
        //          275369569: 1808
        //          default: 1618
        //        }
        //  1652: new             Ljava/lang/StringBuilder;
        //  1655: dup            
        //  1656: getstatic       dev/nuker/pyro/fc.1:I
        //  1659: ifeq            1668
        //  1662: ldc_w           1801813401
        //  1665: goto            1671
        //  1668: ldc_w           1879392162
        //  1671: ldc_w           194124605
        //  1674: ixor           
        //  1675: lookupswitch {
        //          1164741769: 1668
        //          1626826404: 2063
        //          default: 1700
        //        }
        //  1700: goto            1704
        //  1703: athrow         
        //  1704: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1707: goto            1711
        //  1710: athrow         
        //  1711: aload_2        
        //  1712: goto            1716
        //  1715: athrow         
        //  1716: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1719: goto            1723
        //  1722: athrow         
        //  1723: aload_0        
        //  1724: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1727: getstatic       dev/nuker/pyro/fc.1:I
        //  1730: ifeq            1739
        //  1733: ldc_w           -508577173
        //  1736: goto            1742
        //  1739: ldc_w           1793013207
        //  1742: ldc_w           -1093294026
        //  1745: ixor           
        //  1746: lookupswitch {
        //          -737501727: 1772
        //          1601835613: 1739
        //          default: 2113
        //        }
        //  1772: iload           5
        //  1774: goto            1778
        //  1777: athrow         
        //  1778: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1781: goto            1785
        //  1784: athrow         
        //  1785: goto            1789
        //  1788: athrow         
        //  1789: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1792: goto            1796
        //  1795: athrow         
        //  1796: goto            1800
        //  1799: athrow         
        //  1800: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1803: goto            1807
        //  1806: athrow         
        //  1807: astore_2       
        //  1808: aload_0        
        //  1809: getfield        dev/nuker/pyro/fo.c:Lcom/google/common/base/Predicate;
        //  1812: aload_2        
        //  1813: getstatic       dev/nuker/pyro/fc.0:I
        //  1816: ifeq            1825
        //  1819: ldc_w           -967157706
        //  1822: goto            1828
        //  1825: ldc_w           -514411541
        //  1828: ldc_w           1704965357
        //  1831: ixor           
        //  1832: lookupswitch {
        //          -1547309861: 2091
        //          -286047425: 1825
        //          default: 1860
        //        }
        //  1860: goto            1864
        //  1863: athrow         
        //  1864: invokeinterface com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
        //  1869: goto            1873
        //  1872: athrow         
        //  1873: ifeq            1882
        //  1876: ldc_w           437446495
        //  1879: goto            1885
        //  1882: ldc_w           437446488
        //  1885: ldc_w           -1858805604
        //  1888: ixor           
        //  1889: tableswitch {
        //          374083462: 1912
        //          374083463: 2052
        //          default: 1876
        //        }
        //  1912: aload_0        
        //  1913: getstatic       dev/nuker/pyro/fc.0:I
        //  1916: ifeq            1925
        //  1919: ldc_w           -1526293904
        //  1922: goto            1928
        //  1925: ldc_w           -199380973
        //  1928: ldc_w           63338922
        //  1931: ixor           
        //  1932: lookupswitch {
        //          -1497308198: 1925
        //          -136590919: 1960
        //          default: 2093
        //        }
        //  1960: aload_2        
        //  1961: putfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  1964: aload_0        
        //  1965: iload           4
        //  1967: aload_0        
        //  1968: getfield        dev/nuker/pyro/fo.8:I
        //  1971: isub           
        //  1972: iload           7
        //  1974: iadd           
        //  1975: goto            1979
        //  1978: athrow         
        //  1979: invokevirtual   dev/nuker/pyro/fo.2:(I)V
        //  1982: goto            1986
        //  1985: athrow         
        //  1986: getstatic       dev/nuker/pyro/fc.1:I
        //  1989: ifeq            1998
        //  1992: ldc_w           1397707185
        //  1995: goto            2001
        //  1998: ldc_w           2044252259
        //  2001: ldc_w           -2131104956
        //  2004: ixor           
        //  2005: lookupswitch {
        //          -742999307: 2053
        //          1458087376: 1998
        //          default: 2032
        //        }
        //  2032: aload_0        
        //  2033: aload_0        
        //  2034: getfield        dev/nuker/pyro/fo.c:I
        //  2037: aload_0        
        //  2038: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  2041: goto            2045
        //  2044: athrow         
        //  2045: invokevirtual   dev/nuker/pyro/fo.c:(ILjava/lang/String;)V
        //  2048: goto            2052
        //  2051: athrow         
        //  2052: return         
        //  2053: aconst_null    
        //  2054: athrow         
        //  2055: aconst_null    
        //  2056: athrow         
        //  2057: aconst_null    
        //  2058: athrow         
        //  2059: aconst_null    
        //  2060: athrow         
        //  2061: aconst_null    
        //  2062: athrow         
        //  2063: aconst_null    
        //  2064: athrow         
        //  2065: aconst_null    
        //  2066: athrow         
        //  2067: aconst_null    
        //  2068: athrow         
        //  2069: aconst_null    
        //  2070: athrow         
        //  2071: aconst_null    
        //  2072: athrow         
        //  2073: aconst_null    
        //  2074: athrow         
        //  2075: aconst_null    
        //  2076: athrow         
        //  2077: aconst_null    
        //  2078: athrow         
        //  2079: aconst_null    
        //  2080: athrow         
        //  2081: aconst_null    
        //  2082: athrow         
        //  2083: aconst_null    
        //  2084: athrow         
        //  2085: aconst_null    
        //  2086: athrow         
        //  2087: aconst_null    
        //  2088: athrow         
        //  2089: aconst_null    
        //  2090: athrow         
        //  2091: aconst_null    
        //  2092: athrow         
        //  2093: aconst_null    
        //  2094: athrow         
        //  2095: aconst_null    
        //  2096: athrow         
        //  2097: aconst_null    
        //  2098: athrow         
        //  2099: aconst_null    
        //  2100: athrow         
        //  2101: aconst_null    
        //  2102: athrow         
        //  2103: aconst_null    
        //  2104: athrow         
        //  2105: aconst_null    
        //  2106: athrow         
        //  2107: aconst_null    
        //  2108: athrow         
        //  2109: aconst_null    
        //  2110: athrow         
        //  2111: aconst_null    
        //  2112: athrow         
        //  2113: aconst_null    
        //  2114: athrow         
        //  2115: pop            
        //  2116: goto            24
        //  2119: pop            
        //  2120: aconst_null    
        //  2121: goto            2115
        //  2124: dup            
        //  2125: ifnull          2115
        //  2128: checkcast       Ljava/lang/Throwable;
        //  2131: athrow         
        //  2132: dup            
        //  2133: ifnull          2119
        //  2136: checkcast       Ljava/lang/Throwable;
        //  2139: athrow         
        //  2140: aconst_null    
        //  2141: athrow         
        //    StackMapTable: 01 0D FF 00 03 00 03 07 00 03 07 00 90 07 00 90 00 01 07 00 48 FA 00 04 FF 00 0B 00 00 00 01 07 00 48 FD 00 03 07 00 03 07 00 90 FC 00 0F 07 00 90 42 01 1C 4C 07 00 90 FF 00 02 00 03 07 00 03 07 00 90 07 00 90 00 02 07 00 90 01 5F 07 00 90 42 07 00 40 40 07 00 90 45 07 00 48 40 07 00 90 4B 07 00 90 FF 00 02 00 03 07 00 03 07 00 90 07 00 90 00 02 07 00 90 01 5D 07 00 90 FF 00 0D 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 01 07 00 03 FF 00 02 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 02 07 00 03 01 5E 07 00 03 4E 01 FF 00 02 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 02 01 01 5D 01 06 05 42 01 1B 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 02 07 00 03 01 5F 07 00 03 05 43 01 FF 00 0E 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 02 07 00 03 01 5F 07 00 03 4E 01 FF 00 02 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 02 01 01 5D 01 53 07 00 03 FF 00 02 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 02 07 00 03 01 5C 07 00 03 05 0B 42 01 1E 43 01 FC 00 0D 01 42 01 1E FF 00 10 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 02 01 07 00 03 FF 00 02 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 03 01 07 00 03 01 FF 00 1F 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 02 01 07 00 03 45 07 00 48 FF 00 00 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 02 01 01 FF 00 15 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 00 03 01 5C 07 00 03 45 07 00 48 40 07 00 90 45 07 00 48 40 01 FF 00 12 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 02 FD 08 02 FD FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 08 02 FD 08 02 FD 01 FF 00 1F 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 02 FD 08 02 FD 42 07 00 2E FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 02 FD 08 02 FD 45 07 00 48 40 07 02 2C 43 07 00 2C FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 4B 07 02 2C FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 01 5D 07 02 2C FF 00 0C 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 03 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 07 02 2C 07 00 03 01 FF 00 1F 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 03 48 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 04 07 02 2C 07 00 90 01 01 45 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 42 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 42 07 00 48 40 07 02 2C 45 07 00 48 40 07 00 90 00 FF 00 0E 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 01 07 00 90 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 01 07 00 90 01 FF 00 1D 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 01 07 00 90 42 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 01 01 49 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 04 0A 08 04 0A 45 07 00 48 40 07 02 2C FF 00 0C 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 07 02 2C 07 00 90 01 FF 00 1E 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C FF 00 0F 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 04 07 02 2C 07 00 90 01 01 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 05 07 02 2C 07 00 90 01 01 01 FF 00 1D 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 04 07 02 2C 07 00 90 01 01 42 07 00 32 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 04 07 02 2C 07 00 90 01 01 45 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 0B 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 07 02 2C 07 00 90 01 FF 00 1D 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 42 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 01 07 02 2C 45 07 00 48 40 07 00 90 0C 42 01 1D 06 FF 00 0F 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 05 07 08 05 07 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 08 05 07 08 05 07 01 FF 00 1D 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 05 07 08 05 07 42 07 00 40 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 05 07 08 05 07 45 07 00 48 40 07 02 2C 43 07 00 2C FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 4B 07 02 2C FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 01 5D 07 02 2C FF 00 0C 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 03 07 02 2C 07 00 90 01 FF 00 1F 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 42 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 01 07 02 2C 45 07 00 48 40 07 00 90 44 07 00 32 40 07 00 90 45 07 00 48 40 01 FC 00 01 01 4C 07 00 03 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 00 03 01 5E 07 00 03 45 07 00 48 40 07 00 90 45 07 00 48 40 01 FF 00 14 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 01 07 00 90 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 01 07 00 90 01 FF 00 1D 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 01 07 00 90 42 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 01 01 02 05 42 01 18 FF 00 0F 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 08 06 74 08 06 74 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 08 06 74 08 06 74 01 FF 00 1C 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 08 06 74 08 06 74 FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 08 06 74 08 06 74 45 07 00 48 40 07 02 2C 43 07 00 2A FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C FF 00 0F 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 07 02 2C 07 00 90 01 FF 00 1D 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 44 07 00 32 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 07 02 2C 07 00 90 01 45 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 42 07 00 48 40 07 02 2C 45 07 00 48 40 07 00 90 00 FF 00 10 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 69 07 00 90 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 07 02 69 07 00 90 01 FF 00 1F 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 69 07 00 90 FF 00 02 00 00 00 01 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 69 07 00 90 47 07 00 48 40 01 02 05 42 01 1A 4C 07 00 03 FF 00 02 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 51 07 00 32 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 00 03 01 45 07 00 48 00 0B 42 01 1E 4B 07 00 48 FF 00 00 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 03 07 00 03 01 07 00 90 45 07 00 48 00 00 FF 00 01 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 01 07 02 2C FF 00 01 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 01 07 00 03 F9 00 01 FF 00 01 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 08 06 74 08 06 74 FF 00 01 00 03 07 00 03 07 00 90 07 00 90 00 01 07 00 90 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 03 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 01 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 01 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 01 01 FF 00 01 00 05 07 00 03 07 00 90 07 00 90 07 00 90 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 02 FD 08 02 FD 41 07 02 2C FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 08 05 07 08 05 07 FF 00 01 00 03 07 00 03 07 00 90 07 00 90 00 01 07 00 90 FF 00 01 00 06 07 00 03 07 00 90 07 00 90 07 00 90 01 01 00 02 01 07 00 03 FC 00 01 01 FF 00 01 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 69 07 00 90 41 07 00 03 FF 00 01 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 01 07 00 03 F9 00 01 FC 00 01 01 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 04 07 02 2C 07 00 90 01 01 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 01 07 00 90 FF 00 01 00 07 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 00 02 07 02 2C 07 00 90 FF 00 01 00 04 07 00 03 07 00 90 07 00 90 07 00 90 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 01 07 00 90 FF 00 01 00 08 07 00 03 07 00 90 07 00 90 07 00 90 01 01 01 01 00 02 07 02 2C 07 00 90 FF 00 01 00 02 07 00 03 07 00 90 00 01 07 00 48 43 05 44 07 00 48 47 05 FF 00 07 00 03 07 00 03 07 00 90 07 00 90 00 01 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2124   2132   Any
        //  2124   2132   2124   2132   Ljava/lang/ClassCastException;
        //  2140   2142   3      8      Ljava/lang/AssertionError;
        //  123    130    130    131    Any
        //  124    130    123    124    Ljava/lang/IndexOutOfBoundsException;
        //  123    130    130    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  124    130    3      8      Ljava/lang/ClassCastException;
        //  124    130    130    131    Any
        //  686    693    693    694    Any
        //  687    693    3      8      Any
        //  686    693    693    694    Any
        //  687    693    686    687    Any
        //  686    693    686    687    Ljava/lang/NegativeArraySizeException;
        //  754    761    761    762    Any
        //  754    761    3      8      Ljava/util/ConcurrentModificationException;
        //  754    761    3      8      Any
        //  755    761    754    755    Any
        //  755    761    754    755    Ljava/lang/StringIndexOutOfBoundsException;
        //  819    826    826    827    Any
        //  819    826    3      8      Any
        //  820    826    826    827    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  820    826    819    820    Ljava/lang/IllegalArgumentException;
        //  820    826    819    820    Ljava/lang/NumberFormatException;
        //  831    838    838    839    Any
        //  831    838    838    839    Any
        //  831    838    831    832    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  831    838    838    839    Any
        //  831    838    3      8      Any
        //  941    948    948    949    Any
        //  942    948    948    949    Ljava/util/ConcurrentModificationException;
        //  941    948    941    942    Any
        //  942    948    941    942    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  942    948    948    949    Ljava/lang/IllegalArgumentException;
        //  952    959    959    960    Any
        //  953    959    952    953    Any
        //  952    959    952    953    Any
        //  953    959    952    953    Ljava/lang/NumberFormatException;
        //  952    959    952    953    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  963    970    970    971    Any
        //  964    970    963    964    Ljava/lang/RuntimeException;
        //  964    970    963    964    Any
        //  963    970    963    964    Any
        //  963    970    963    964    Any
        //  1023   1030   1030   1031   Any
        //  1024   1030   1023   1024   Any
        //  1023   1030   1030   1031   Any
        //  1023   1030   3      8      Any
        //  1023   1030   1030   1031   Any
        //  1041   1048   1048   1049   Any
        //  1041   1048   3      8      Any
        //  1041   1048   1048   1049   Ljava/lang/AssertionError;
        //  1042   1048   1041   1042   Any
        //  1041   1048   3      8      Any
        //  1100   1106   1106   1107   Any
        //  1100   1106   3      8      Any
        //  1100   1106   3      8      Ljava/util/ConcurrentModificationException;
        //  1100   1106   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1100   1106   3      8      Any
        //  1159   1166   1166   1167   Any
        //  1160   1166   1159   1160   Ljava/util/NoSuchElementException;
        //  1159   1166   1166   1167   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1159   1166   1159   1160   Ljava/util/ConcurrentModificationException;
        //  1160   1166   3      8      Any
        //  1215   1222   1222   1223   Any
        //  1216   1222   1222   1223   Ljava/lang/NumberFormatException;
        //  1215   1222   1215   1216   Any
        //  1216   1222   1222   1223   Ljava/lang/AssertionError;
        //  1215   1222   3      8      Any
        //  1227   1233   1233   1234   Any
        //  1227   1233   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1227   1233   1233   1234   Ljava/lang/AssertionError;
        //  1227   1233   1233   1234   Ljava/lang/NullPointerException;
        //  1227   1233   1233   1234   Any
        //  1339   1346   1346   1347   Any
        //  1339   1346   1339   1340   Ljava/lang/IndexOutOfBoundsException;
        //  1339   1346   3      8      Any
        //  1339   1346   3      8      Ljava/lang/ArithmeticException;
        //  1340   1346   1346   1347   Any
        //  1351   1358   1358   1359   Any
        //  1351   1358   1351   1352   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1352   1358   1358   1359   Ljava/lang/ClassCastException;
        //  1351   1358   3      8      Any
        //  1352   1358   3      8      Any
        //  1455   1462   1462   1463   Any
        //  1455   1462   1455   1456   Any
        //  1456   1462   1462   1463   Ljava/util/NoSuchElementException;
        //  1455   1462   1455   1456   Any
        //  1455   1462   1455   1456   Ljava/lang/ClassCastException;
        //  1467   1473   1473   1474   Any
        //  1467   1473   1473   1474   Ljava/lang/UnsupportedOperationException;
        //  1467   1473   3      8      Any
        //  1467   1473   3      8      Ljava/util/ConcurrentModificationException;
        //  1467   1473   1473   1474   Any
        //  1479   1486   1486   1487   Any
        //  1480   1486   1479   1480   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1480   1486   1479   1480   Ljava/lang/NullPointerException;
        //  1479   1486   1479   1480   Ljava/lang/ClassCastException;
        //  1479   1486   3      8      Any
        //  1542   1549   1549   1550   Any
        //  1542   1549   1542   1543   Any
        //  1543   1549   1549   1550   Ljava/lang/NegativeArraySizeException;
        //  1542   1549   3      8      Any
        //  1543   1549   1542   1543   Ljava/lang/ArithmeticException;
        //  1607   1614   1614   1615   Any
        //  1608   1614   1607   1608   Any
        //  1608   1614   1614   1615   Any
        //  1608   1614   3      8      Any
        //  1607   1614   1607   1608   Ljava/lang/IndexOutOfBoundsException;
        //  1704   1710   1710   1711   Any
        //  1704   1710   1710   1711   Any
        //  1704   1710   1710   1711   Any
        //  1704   1710   3      8      Ljava/lang/IllegalStateException;
        //  1704   1710   1710   1711   Ljava/lang/NullPointerException;
        //  1715   1722   1722   1723   Any
        //  1716   1722   3      8      Ljava/util/NoSuchElementException;
        //  1716   1722   3      8      Any
        //  1716   1722   3      8      Any
        //  1715   1722   1715   1716   Ljava/lang/ClassCastException;
        //  1777   1784   1784   1785   Any
        //  1777   1784   1777   1778   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1777   1784   3      8      Any
        //  1778   1784   1777   1778   Ljava/lang/UnsupportedOperationException;
        //  1777   1784   1784   1785   Ljava/lang/IllegalArgumentException;
        //  1789   1795   1795   1796   Any
        //  1789   1795   1795   1796   Any
        //  1789   1795   1795   1796   Ljava/lang/RuntimeException;
        //  1789   1795   1795   1796   Ljava/lang/ClassCastException;
        //  1789   1795   3      8      Any
        //  1799   1806   1806   1807   Any
        //  1800   1806   1799   1800   Any
        //  1800   1806   1806   1807   Any
        //  1800   1806   3      8      Ljava/lang/ArithmeticException;
        //  1800   1806   1799   1800   Any
        //  1864   1872   1872   1873   Any
        //  1864   1872   1872   1873   Any
        //  1864   1872   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1864   1872   3      8      Any
        //  1864   1872   1872   1873   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1978   1985   1985   1986   Any
        //  1979   1985   1978   1979   Ljava/util/ConcurrentModificationException;
        //  1978   1985   3      8      Any
        //  1979   1985   3      8      Any
        //  1978   1985   1978   1979   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2044   2051   2051   2052   Any
        //  2044   2051   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2045   2051   2044   2045   Any
        //  2045   2051   2051   2052   Ljava/lang/IllegalStateException;
        //  2044   2051   3      8      Ljava/lang/ClassCastException;
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
    
    public void 6(final int n) {
        fbS.61(this, 1482926562, n);
    }
    
    public void 0(final boolean b) {
        fbS.4w(this, 1643866943, b);
    }
    
    public void 4(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          832
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            824
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            816
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   java/lang/String.isEmpty:()Z
        //    35: goto            39
        //    38: athrow         
        //    39: ifne            786
        //    42: aload_0        
        //    43: getfield        dev/nuker/pyro/fo.8:I
        //    46: aload_0        
        //    47: getfield        dev/nuker/pyro/fo.7:I
        //    50: if_icmpeq       59
        //    53: ldc_w           863002784
        //    56: goto            62
        //    59: ldc_w           863002787
        //    62: ldc_w           -652781707
        //    65: ixor           
        //    66: tableswitch {
        //          -724668502: 88
        //          -724668501: 150
        //          default: 53
        //        }
        //    88: aload_0        
        //    89: ldc_w           ""
        //    92: getstatic       dev/nuker/pyro/fc.1:I
        //    95: ifeq            104
        //    98: ldc_w           1864909778
        //   101: goto            107
        //   104: ldc_w           -1751990779
        //   107: ldc_w           833346343
        //   110: ixor           
        //   111: lookupswitch {
        //          -1645695025: 104
        //          1585682677: 801
        //          default: 136
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokevirtual   dev/nuker/pyro/fo.c:(Ljava/lang/String;)V
        //   143: goto            147
        //   146: athrow         
        //   147: goto            786
        //   150: iload_1        
        //   151: ifge            158
        //   154: iconst_1       
        //   155: goto            159
        //   158: iconst_0       
        //   159: getstatic       dev/nuker/pyro/fc.0:I
        //   162: ifeq            171
        //   165: ldc_w           1744260545
        //   168: goto            174
        //   171: ldc_w           199962902
        //   174: ldc_w           -624488621
        //   177: ixor           
        //   178: lookupswitch {
        //          -1120910702: 171
        //          -785629627: 204
        //          default: 795
        //        }
        //   204: istore_2       
        //   205: iload_2        
        //   206: ifeq            218
        //   209: aload_0        
        //   210: getfield        dev/nuker/pyro/fo.7:I
        //   213: iload_1        
        //   214: iadd           
        //   215: goto            222
        //   218: aload_0        
        //   219: getfield        dev/nuker/pyro/fo.7:I
        //   222: istore_3       
        //   223: iload_2        
        //   224: ifeq            279
        //   227: getstatic       dev/nuker/pyro/fc.c:I
        //   230: ifge            239
        //   233: ldc_w           -823884653
        //   236: goto            242
        //   239: ldc_w           797643169
        //   242: ldc_w           -389823031
        //   245: ixor           
        //   246: lookupswitch {
        //          640106842: 803
        //          1385079851: 239
        //          default: 272
        //        }
        //   272: aload_0        
        //   273: getfield        dev/nuker/pyro/fo.7:I
        //   276: goto            285
        //   279: aload_0        
        //   280: getfield        dev/nuker/pyro/fo.7:I
        //   283: iload_1        
        //   284: iadd           
        //   285: istore          4
        //   287: ldc_w           ""
        //   290: astore          5
        //   292: getstatic       dev/nuker/pyro/fc.0:I
        //   295: ifeq            304
        //   298: ldc_w           1973372205
        //   301: goto            307
        //   304: ldc_w           271873895
        //   307: ldc_w           -35134597
        //   310: ixor           
        //   311: lookupswitch {
        //          -2005359018: 791
        //          1928078352: 304
        //          default: 336
        //        }
        //   336: iload_3        
        //   337: iflt            403
        //   340: getstatic       dev/nuker/pyro/fc.c:I
        //   343: ifge            352
        //   346: ldc_w           -539120574
        //   349: goto            355
        //   352: ldc_w           -1370840588
        //   355: ldc_w           355872938
        //   358: ixor           
        //   359: lookupswitch {
        //          -1149464226: 384
        //          -890528536: 352
        //          default: 799
        //        }
        //   384: aload_0        
        //   385: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   388: iconst_0       
        //   389: iload_3        
        //   390: goto            394
        //   393: athrow         
        //   394: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   397: goto            401
        //   400: athrow         
        //   401: astore          5
        //   403: iload           4
        //   405: aload_0        
        //   406: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   409: goto            413
        //   412: athrow         
        //   413: invokevirtual   java/lang/String.length:()I
        //   416: goto            420
        //   419: athrow         
        //   420: if_icmpge       537
        //   423: new             Ljava/lang/StringBuilder;
        //   426: dup            
        //   427: goto            431
        //   430: athrow         
        //   431: invokespecial   java/lang/StringBuilder.<init>:()V
        //   434: goto            438
        //   437: athrow         
        //   438: aload           5
        //   440: goto            444
        //   443: athrow         
        //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   447: goto            451
        //   450: athrow         
        //   451: aload_0        
        //   452: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   455: iload           4
        //   457: goto            461
        //   460: athrow         
        //   461: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   464: goto            468
        //   467: athrow         
        //   468: goto            472
        //   471: athrow         
        //   472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   475: goto            479
        //   478: athrow         
        //   479: getstatic       dev/nuker/pyro/fc.0:I
        //   482: ifeq            491
        //   485: ldc_w           -421570351
        //   488: goto            494
        //   491: ldc_w           303024731
        //   494: ldc_w           1388787869
        //   497: ixor           
        //   498: lookupswitch {
        //          -1273470900: 797
        //          1534713666: 491
        //          default: 524
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   531: goto            535
        //   534: athrow         
        //   535: astore          5
        //   537: aload_0        
        //   538: getfield        dev/nuker/pyro/fo.c:Lcom/google/common/base/Predicate;
        //   541: getstatic       dev/nuker/pyro/fc.c:I
        //   544: ifge            553
        //   547: ldc_w           -504500086
        //   550: goto            556
        //   553: ldc_w           -424021957
        //   556: ldc_w           -875586697
        //   559: ixor           
        //   560: lookupswitch {
        //          706898941: 553
        //          762735436: 588
        //          default: 787
        //        }
        //   588: aload           5
        //   590: goto            594
        //   593: athrow         
        //   594: invokeinterface com/google/common/base/Predicate.apply:(Ljava/lang/Object;)Z
        //   599: goto            603
        //   602: athrow         
        //   603: ifeq            786
        //   606: aload_0        
        //   607: getstatic       dev/nuker/pyro/fc.0:I
        //   610: ifeq            619
        //   613: ldc_w           1726866408
        //   616: goto            622
        //   619: ldc_w           894095845
        //   622: ldc_w           365662316
        //   625: ixor           
        //   626: lookupswitch {
        //          545341833: 652
        //          1931899780: 619
        //          default: 793
        //        }
        //   652: aload           5
        //   654: putfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   657: iload_2        
        //   658: ifeq            674
        //   661: aload_0        
        //   662: iload_1        
        //   663: goto            667
        //   666: athrow         
        //   667: invokevirtual   dev/nuker/pyro/fo.2:(I)V
        //   670: goto            674
        //   673: athrow         
        //   674: getstatic       dev/nuker/pyro/fc.0:I
        //   677: ifeq            686
        //   680: ldc_w           859470651
        //   683: goto            689
        //   686: ldc_w           -1343081051
        //   689: ldc_w           1345341814
        //   692: ixor           
        //   693: lookupswitch {
        //          549447281: 686
        //          1661612621: 789
        //          default: 720
        //        }
        //   720: aload_0        
        //   721: aload_0        
        //   722: getstatic       dev/nuker/pyro/fc.1:I
        //   725: ifeq            734
        //   728: ldc_w           1134639653
        //   731: goto            737
        //   734: ldc_w           -215463933
        //   737: ldc_w           1362276225
        //   740: ixor           
        //   741: lookupswitch {
        //          -1575295102: 768
        //          311661988: 734
        //          default: 805
        //        }
        //   768: getfield        dev/nuker/pyro/fo.c:I
        //   771: aload_0        
        //   772: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //   775: goto            779
        //   778: athrow         
        //   779: invokevirtual   dev/nuker/pyro/fo.c:(ILjava/lang/String;)V
        //   782: goto            786
        //   785: athrow         
        //   786: return         
        //   787: aconst_null    
        //   788: athrow         
        //   789: aconst_null    
        //   790: athrow         
        //   791: aconst_null    
        //   792: athrow         
        //   793: aconst_null    
        //   794: athrow         
        //   795: aconst_null    
        //   796: athrow         
        //   797: aconst_null    
        //   798: athrow         
        //   799: aconst_null    
        //   800: athrow         
        //   801: aconst_null    
        //   802: athrow         
        //   803: aconst_null    
        //   804: athrow         
        //   805: aconst_null    
        //   806: athrow         
        //   807: pop            
        //   808: goto            24
        //   811: pop            
        //   812: aconst_null    
        //   813: goto            807
        //   816: dup            
        //   817: ifnull          807
        //   820: checkcast       Ljava/lang/Throwable;
        //   823: athrow         
        //   824: dup            
        //   825: ifnull          811
        //   828: checkcast       Ljava/lang/Throwable;
        //   831: athrow         
        //   832: aconst_null    
        //   833: athrow         
        //    StackMapTable: 00 6E 43 07 00 48 04 FF 00 0B 00 00 00 01 07 00 48 FD 00 03 07 00 03 01 46 07 00 48 40 07 00 90 45 07 00 48 40 01 0D 05 42 01 19 FF 00 0F 00 02 07 00 03 01 00 02 07 00 03 07 00 90 FF 00 02 00 02 07 00 03 01 00 03 07 00 03 07 00 90 01 FF 00 1C 00 02 07 00 03 01 00 02 07 00 03 07 00 90 42 07 00 48 FF 00 00 00 02 07 00 03 01 00 02 07 00 03 07 00 90 45 07 00 48 00 02 07 40 01 4B 01 FF 00 02 00 02 07 00 03 01 00 02 01 01 5D 01 FC 00 0D 01 43 01 FC 00 10 01 42 01 1D 06 45 01 FD 00 12 01 07 00 90 42 01 1C 0F 42 01 1C 48 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 03 07 00 90 01 01 45 07 00 48 40 07 00 90 01 FF 00 08 00 00 00 01 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 01 07 00 90 45 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 01 01 49 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 08 01 A7 08 01 A7 45 07 00 48 40 07 02 2C 44 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 48 07 00 32 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 03 07 02 2C 07 00 90 01 45 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 2C 07 00 90 42 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 2C 07 00 90 45 07 00 48 40 07 02 2C 4B 07 02 2C FF 00 02 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 2C 01 5D 07 02 2C 42 07 00 26 40 07 02 2C 45 07 00 48 40 07 00 90 01 4F 07 02 69 FF 00 02 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 69 01 5F 07 02 69 44 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 02 69 07 00 90 47 07 00 48 40 01 4F 07 00 03 FF 00 02 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 00 03 01 5D 07 00 03 4D 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 00 03 01 45 07 00 48 00 0B 42 01 1E FF 00 0D 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 00 03 07 00 03 FF 00 02 00 06 07 00 03 01 01 01 01 07 00 90 00 03 07 00 03 07 00 03 01 FF 00 1E 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 00 03 07 00 03 49 07 00 48 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 03 07 00 03 01 07 00 90 45 07 00 48 FF 00 00 00 02 07 00 03 01 00 00 FF 00 00 00 06 07 00 03 01 01 01 01 07 00 90 00 01 07 02 69 01 01 41 07 00 03 FF 00 01 00 02 07 00 03 01 00 01 01 FF 00 01 00 06 07 00 03 01 01 01 01 07 00 90 00 01 07 02 2C 01 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 07 00 90 FD 00 01 01 01 FF 00 01 00 06 07 00 03 01 01 01 01 07 00 90 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 01 00 01 07 00 48 43 05 44 07 00 48 47 05 47 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     816    824    Ljava/lang/AssertionError;
        //  816    824    816    824    Ljava/lang/RuntimeException;
        //  832    834    3      8      Any
        //  31     38     38     39     Any
        //  32     38     31     32     Ljava/lang/RuntimeException;
        //  31     38     3      8      Any
        //  31     38     3      8      Any
        //  31     38     31     32     Any
        //  139    146    146    147    Any
        //  140    146    3      8      Any
        //  140    146    139    140    Any
        //  139    146    3      8      Any
        //  140    146    139    140    Any
        //  393    400    400    401    Any
        //  394    400    3      8      Ljava/lang/IllegalArgumentException;
        //  394    400    393    394    Any
        //  394    400    393    394    Any
        //  394    400    393    394    Ljava/lang/IndexOutOfBoundsException;
        //  413    419    419    420    Any
        //  413    419    3      8      Any
        //  413    419    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  413    419    419    420    Any
        //  413    419    3      8      Ljava/lang/ArithmeticException;
        //  430    437    437    438    Any
        //  430    437    430    431    Ljava/lang/UnsupportedOperationException;
        //  431    437    430    431    Any
        //  431    437    430    431    Any
        //  430    437    430    431    Any
        //  443    450    450    451    Any
        //  443    450    443    444    Any
        //  444    450    443    444    Any
        //  443    450    443    444    Ljava/lang/StringIndexOutOfBoundsException;
        //  444    450    443    444    Ljava/lang/StringIndexOutOfBoundsException;
        //  460    467    467    468    Any
        //  460    467    460    461    Ljava/lang/IllegalStateException;
        //  460    467    460    461    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  460    467    467    468    Any
        //  460    467    467    468    Ljava/lang/IllegalArgumentException;
        //  471    478    478    479    Any
        //  471    478    471    472    Ljava/lang/IllegalArgumentException;
        //  471    478    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  472    478    471    472    Ljava/lang/NullPointerException;
        //  471    478    471    472    Any
        //  527    534    534    535    Any
        //  527    534    527    528    Ljava/lang/IllegalStateException;
        //  527    534    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  528    534    534    535    Any
        //  527    534    3      8      Ljava/lang/NumberFormatException;
        //  593    602    602    603    Any
        //  593    602    593    594    Any
        //  594    602    593    594    Any
        //  593    602    593    594    Ljava/lang/StringIndexOutOfBoundsException;
        //  594    602    3      8      Ljava/lang/IllegalStateException;
        //  666    673    673    674    Any
        //  666    673    666    667    Ljava/lang/IllegalStateException;
        //  667    673    673    674    Any
        //  666    673    666    667    Any
        //  667    673    3      8      Any
        //  778    785    785    786    Any
        //  779    785    778    779    Any
        //  778    785    778    779    Ljava/lang/NegativeArraySizeException;
        //  778    785    778    779    Ljava/lang/UnsupportedOperationException;
        //  778    785    3      8      Any
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
    
    public int 9() {
        return fbS.bz(this, 745539675);
    }
    
    public void 0(final int n) {
        fbS.6B(this, 1685737985, n);
    }
    
    public void c(final Predicate p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/fo.c:Lcom/google/common/base/Predicate;
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 48 FD 00 03 07 00 03 07 02 69 45 07 00 48 43 05 44 07 00 48 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      12     31     39     Any
        //  31     39     31     39     Ljava/lang/AssertionError;
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
    
    public void 5(final int n) {
        fbS.6j(this, 1799659846, n);
    }
    
    public void c(final int p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1349
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1341
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1333
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_1        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           -116731343
        //    34: goto            40
        //    37: ldc_w           2021797448
        //    40: ldc_w           -1815433122
        //    43: ixor           
        //    44: lookupswitch {
        //          -1832538683: 37
        //          1790993007: 1310
        //          default: 72
        //        }
        //    72: iload_3        
        //    73: if_icmpge       82
        //    76: ldc_w           -11327169
        //    79: goto            85
        //    82: ldc_w           -11327170
        //    85: ldc_w           492777539
        //    88: ixor           
        //    89: tableswitch {
        //          -1005047048: 112
        //          -1005047047: 120
        //          default: 76
        //        }
        //   112: iload_1        
        //   113: istore          5
        //   115: iload_3        
        //   116: istore_1       
        //   117: iload           5
        //   119: istore_3       
        //   120: iload_2        
        //   121: iload           4
        //   123: if_icmpge       132
        //   126: ldc_w           1661318251
        //   129: goto            135
        //   132: ldc_w           1661318252
        //   135: ldc_w           1065630016
        //   138: ixor           
        //   139: tableswitch {
        //          -1190978986: 160
        //          -1190978985: 214
        //          default: 126
        //        }
        //   160: iload_2        
        //   161: istore          5
        //   163: iload           4
        //   165: istore_2       
        //   166: iload           5
        //   168: getstatic       dev/nuker/pyro/fc.0:I
        //   171: ifeq            180
        //   174: ldc_w           906884311
        //   177: goto            183
        //   180: ldc_w           -1881867700
        //   183: ldc_w           1743035027
        //   186: ixor           
        //   187: lookupswitch {
        //          -350375410: 180
        //          1374252612: 1320
        //          default: 212
        //        }
        //   212: istore          4
        //   214: iload_3        
        //   215: aload_0        
        //   216: getstatic       dev/nuker/pyro/fc.c:I
        //   219: ifge            228
        //   222: ldc_w           1800164437
        //   225: goto            231
        //   228: ldc_w           -56461515
        //   231: ldc_w           259101001
        //   234: ixor           
        //   235: lookupswitch {
        //          -204216708: 260
        //          1681769756: 228
        //          default: 1300
        //        }
        //   260: getfield        dev/nuker/pyro/fo.0:I
        //   263: aload_0        
        //   264: getstatic       dev/nuker/pyro/fc.0:I
        //   267: ifeq            276
        //   270: ldc_w           1876118635
        //   273: goto            279
        //   276: ldc_w           -97067138
        //   279: ldc_w           1046764197
        //   282: ixor           
        //   283: lookupswitch {
        //          -1001224741: 308
        //          1370953422: 276
        //          default: 1292
        //        }
        //   308: getfield        dev/nuker/pyro/fo.2:I
        //   311: iadd           
        //   312: if_icmple       417
        //   315: getstatic       dev/nuker/pyro/fc.1:I
        //   318: ifeq            327
        //   321: ldc_w           1812644045
        //   324: goto            330
        //   327: ldc_w           -621196873
        //   330: ldc_w           -68082151
        //   333: ixor           
        //   334: lookupswitch {
        //          -1745099052: 327
        //          554201006: 360
        //          default: 1296
        //        }
        //   360: aload_0        
        //   361: getfield        dev/nuker/pyro/fo.0:I
        //   364: aload_0        
        //   365: getfield        dev/nuker/pyro/fo.2:I
        //   368: iadd           
        //   369: getstatic       dev/nuker/pyro/fc.1:I
        //   372: ifeq            381
        //   375: ldc_w           1724708545
        //   378: goto            384
        //   381: ldc_w           140872386
        //   384: ldc_w           -64119141
        //   387: ixor           
        //   388: lookupswitch {
        //          -1696503718: 1294
        //          663438492: 381
        //          default: 416
        //        }
        //   416: istore_3       
        //   417: getstatic       dev/nuker/pyro/fc.c:I
        //   420: ifge            429
        //   423: ldc_w           -888187465
        //   426: goto            432
        //   429: ldc_w           -1007681621
        //   432: ldc_w           -1431371365
        //   435: ixor           
        //   436: lookupswitch {
        //          -741946781: 429
        //          1637897260: 1318
        //          default: 464
        //        }
        //   464: iload_1        
        //   465: aload_0        
        //   466: getfield        dev/nuker/pyro/fo.0:I
        //   469: aload_0        
        //   470: getfield        dev/nuker/pyro/fo.2:I
        //   473: iadd           
        //   474: if_icmple       534
        //   477: aload_0        
        //   478: getfield        dev/nuker/pyro/fo.0:I
        //   481: getstatic       dev/nuker/pyro/fc.c:I
        //   484: ifge            493
        //   487: ldc_w           -1455743386
        //   490: goto            496
        //   493: ldc_w           2092138098
        //   496: ldc_w           -1521324171
        //   499: ixor           
        //   500: lookupswitch {
        //          -490360903: 493
        //          208236819: 1298
        //          default: 528
        //        }
        //   528: aload_0        
        //   529: getfield        dev/nuker/pyro/fo.2:I
        //   532: iadd           
        //   533: istore_1       
        //   534: getstatic       dev/nuker/pyro/fc.1:I
        //   537: ifeq            546
        //   540: ldc_w           -424221763
        //   543: goto            549
        //   546: ldc_w           1448572313
        //   549: ldc_w           716367771
        //   552: ixor           
        //   553: lookupswitch {
        //          -872152026: 1314
        //          1624251434: 546
        //          default: 580
        //        }
        //   580: goto            584
        //   583: athrow         
        //   584: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //   587: goto            591
        //   590: athrow         
        //   591: getstatic       dev/nuker/pyro/fc.1:I
        //   594: ifeq            603
        //   597: ldc_w           -182277571
        //   600: goto            606
        //   603: ldc_w           404237576
        //   606: ldc_w           -139104494
        //   609: ixor           
        //   610: lookupswitch {
        //          43500847: 1312
        //          1980828664: 603
        //          default: 636
        //        }
        //   636: astore          5
        //   638: aload           5
        //   640: goto            644
        //   643: athrow         
        //   644: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //   647: goto            651
        //   650: athrow         
        //   651: getstatic       dev/nuker/pyro/fc.c:I
        //   654: ifge            663
        //   657: ldc_w           133284895
        //   660: goto            666
        //   663: ldc_w           900749720
        //   666: ldc_w           116718279
        //   669: ixor           
        //   670: lookupswitch {
        //          17120984: 1302
        //          1355085073: 663
        //          default: 696
        //        }
        //   696: astore          6
        //   698: fconst_0       
        //   699: fconst_0       
        //   700: ldc_w           255.0
        //   703: ldc_w           255.0
        //   706: goto            710
        //   709: athrow         
        //   710: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   713: goto            717
        //   716: athrow         
        //   717: getstatic       dev/nuker/pyro/fc.0:I
        //   720: ifeq            729
        //   723: ldc_w           1928143243
        //   726: goto            732
        //   729: ldc_w           1014338399
        //   732: ldc_w           959526871
        //   735: ixor           
        //   736: lookupswitch {
        //          305217649: 729
        //          1272714844: 1306
        //          default: 764
        //        }
        //   764: goto            768
        //   767: athrow         
        //   768: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //   771: goto            775
        //   774: athrow         
        //   775: goto            779
        //   778: athrow         
        //   779: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179115_u:()V
        //   782: goto            786
        //   785: athrow         
        //   786: getstatic       net/minecraft/client/renderer/GlStateManager$LogicOp.OR_REVERSE:Lnet/minecraft/client/renderer/GlStateManager$LogicOp;
        //   789: goto            793
        //   792: athrow         
        //   793: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187422_a:(Lnet/minecraft/client/renderer/GlStateManager$LogicOp;)V
        //   796: goto            800
        //   799: athrow         
        //   800: aload           6
        //   802: bipush          7
        //   804: getstatic       net/minecraft/client/renderer/vertex/DefaultVertexFormats.field_181705_e:Lnet/minecraft/client/renderer/vertex/VertexFormat;
        //   807: getstatic       dev/nuker/pyro/fc.c:I
        //   810: ifge            819
        //   813: ldc_w           -665876324
        //   816: goto            822
        //   819: ldc_w           -505545423
        //   822: ldc_w           -1104174692
        //   825: ixor           
        //   826: lookupswitch {
        //          1609718957: 852
        //          1717577984: 819
        //          default: 1286
        //        }
        //   852: goto            856
        //   855: athrow         
        //   856: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181668_a:(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V
        //   859: goto            863
        //   862: athrow         
        //   863: aload           6
        //   865: getstatic       dev/nuker/pyro/fc.c:I
        //   868: ifge            877
        //   871: ldc_w           1973827339
        //   874: goto            880
        //   877: ldc_w           -294415174
        //   880: ldc_w           1370741205
        //   883: ixor           
        //   884: lookupswitch {
        //          -1564193257: 877
        //          605417182: 1322
        //          default: 912
        //        }
        //   912: iload_1        
        //   913: i2d            
        //   914: iload           4
        //   916: i2d            
        //   917: dconst_0       
        //   918: goto            922
        //   921: athrow         
        //   922: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   925: goto            929
        //   928: athrow         
        //   929: goto            933
        //   932: athrow         
        //   933: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   936: goto            940
        //   939: athrow         
        //   940: aload           6
        //   942: iload_3        
        //   943: i2d            
        //   944: iload           4
        //   946: i2d            
        //   947: dconst_0       
        //   948: getstatic       dev/nuker/pyro/fc.0:I
        //   951: ifeq            960
        //   954: ldc_w           1354330309
        //   957: goto            963
        //   960: ldc_w           1981610149
        //   963: ldc_w           2087105473
        //   966: ixor           
        //   967: lookupswitch {
        //          175786852: 992
        //          752861956: 960
        //          default: 1308
        //        }
        //   992: goto            996
        //   995: athrow         
        //   996: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   999: goto            1003
        //  1002: athrow         
        //  1003: getstatic       dev/nuker/pyro/fc.0:I
        //  1006: ifeq            1015
        //  1009: ldc_w           1986938680
        //  1012: goto            1018
        //  1015: ldc_w           500100836
        //  1018: ldc_w           1499461980
        //  1021: ixor           
        //  1022: lookupswitch {
        //          -163855759: 1015
        //          791789156: 1316
        //          default: 1048
        //        }
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: aload           6
        //  1061: iload_3        
        //  1062: i2d            
        //  1063: iload_2        
        //  1064: i2d            
        //  1065: dconst_0       
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: goto            1081
        //  1080: athrow         
        //  1081: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1084: goto            1088
        //  1087: athrow         
        //  1088: aload           6
        //  1090: iload_1        
        //  1091: i2d            
        //  1092: getstatic       dev/nuker/pyro/fc.1:I
        //  1095: ifeq            1104
        //  1098: ldc_w           -1158215788
        //  1101: goto            1107
        //  1104: ldc_w           -1602821783
        //  1107: ldc_w           -376871733
        //  1110: ixor           
        //  1111: lookupswitch {
        //          266736369: 1104
        //          1400791903: 1304
        //          default: 1136
        //        }
        //  1136: iload_2        
        //  1137: i2d            
        //  1138: dconst_0       
        //  1139: getstatic       dev/nuker/pyro/fc.c:I
        //  1142: ifge            1151
        //  1145: ldc_w           -949132139
        //  1148: goto            1154
        //  1151: ldc_w           1664858309
        //  1154: ldc_w           -442157460
        //  1157: ixor           
        //  1158: lookupswitch {
        //          -2036429143: 1184
        //          583553785: 1151
        //          default: 1290
        //        }
        //  1184: goto            1188
        //  1187: athrow         
        //  1188: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1191: goto            1195
        //  1194: athrow         
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1202: goto            1206
        //  1205: athrow         
        //  1206: aload           5
        //  1208: getstatic       dev/nuker/pyro/fc.1:I
        //  1211: ifeq            1220
        //  1214: ldc_w           2013291403
        //  1217: goto            1223
        //  1220: ldc_w           1651263999
        //  1223: ldc_w           -169426537
        //  1226: ixor           
        //  1227: lookupswitch {
        //          -1914265060: 1220
        //          -1752528792: 1252
        //          default: 1288
        //        }
        //  1252: goto            1256
        //  1255: athrow         
        //  1256: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: goto            1267
        //  1266: athrow         
        //  1267: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179134_v:()V
        //  1270: goto            1274
        //  1273: athrow         
        //  1274: goto            1278
        //  1277: athrow         
        //  1278: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //  1281: goto            1285
        //  1284: athrow         
        //  1285: return         
        //  1286: aconst_null    
        //  1287: athrow         
        //  1288: aconst_null    
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
        //  1292: aconst_null    
        //  1293: athrow         
        //  1294: aconst_null    
        //  1295: athrow         
        //  1296: aconst_null    
        //  1297: athrow         
        //  1298: aconst_null    
        //  1299: athrow         
        //  1300: aconst_null    
        //  1301: athrow         
        //  1302: aconst_null    
        //  1303: athrow         
        //  1304: aconst_null    
        //  1305: athrow         
        //  1306: aconst_null    
        //  1307: athrow         
        //  1308: aconst_null    
        //  1309: athrow         
        //  1310: aconst_null    
        //  1311: athrow         
        //  1312: aconst_null    
        //  1313: athrow         
        //  1314: aconst_null    
        //  1315: athrow         
        //  1316: aconst_null    
        //  1317: athrow         
        //  1318: aconst_null    
        //  1319: athrow         
        //  1320: aconst_null    
        //  1321: athrow         
        //  1322: aconst_null    
        //  1323: athrow         
        //  1324: pop            
        //  1325: goto            24
        //  1328: pop            
        //  1329: aconst_null    
        //  1330: goto            1324
        //  1333: dup            
        //  1334: ifnull          1324
        //  1337: checkcast       Ljava/lang/Throwable;
        //  1340: athrow         
        //  1341: dup            
        //  1342: ifnull          1328
        //  1345: checkcast       Ljava/lang/Throwable;
        //  1348: athrow         
        //  1349: aconst_null    
        //  1350: athrow         
        //    StackMapTable: 00 A9 FF 00 03 00 06 07 00 03 01 01 01 01 07 02 D5 00 01 07 00 48 FA 00 04 FF 00 0B 00 00 00 01 07 00 48 FF 00 03 00 05 07 00 03 01 01 01 01 00 00 4C 01 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 01 01 5F 01 03 05 42 01 1A 07 05 05 42 01 18 FF 00 13 00 06 07 00 03 01 01 01 01 01 00 01 01 FF 00 02 00 06 07 00 03 01 01 01 01 01 00 02 01 01 5C 01 FA 00 01 FF 00 0D 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 02 00 05 07 00 03 01 01 01 01 00 03 01 07 00 03 01 FF 00 1C 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 0F 00 05 07 00 03 01 01 01 01 00 03 01 01 07 00 03 FF 00 02 00 05 07 00 03 01 01 01 01 00 04 01 01 07 00 03 01 FF 00 1C 00 05 07 00 03 01 01 01 01 00 03 01 01 07 00 03 12 42 01 1D 54 01 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 01 01 5F 01 00 0B 42 01 1F 5C 01 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 01 01 5F 01 05 0B 42 01 1E 42 07 00 48 00 45 07 00 48 40 07 02 D5 4B 07 02 D5 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 07 02 D5 01 5D 07 02 D5 FF 00 06 00 06 07 00 03 01 01 01 01 07 02 D5 00 01 07 00 3E 40 07 02 D5 45 07 00 48 40 07 03 08 4B 07 03 08 FF 00 02 00 06 07 00 03 01 01 01 01 07 02 D5 00 02 07 03 08 01 5D 07 03 08 FF 00 0C 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 01 07 00 2E FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 02 02 02 02 45 07 00 48 00 0B 42 01 1F 42 07 00 48 00 45 07 00 48 00 42 07 00 48 00 45 07 00 48 00 45 07 00 34 40 07 02 F5 45 07 00 48 00 FF 00 12 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 03 07 03 08 01 07 03 30 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 01 07 03 30 01 FF 00 1D 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 03 07 03 08 01 07 03 30 42 07 00 48 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 03 07 03 08 01 07 03 30 45 07 00 48 00 4D 07 03 08 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 03 08 01 5F 07 03 08 FF 00 08 00 00 00 01 07 00 48 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 45 07 00 48 40 07 03 08 42 07 00 48 40 07 03 08 45 07 00 48 00 FF 00 13 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 05 07 03 08 03 03 03 01 FF 00 1C 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 42 07 00 32 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 45 07 00 48 40 07 03 08 4B 07 03 08 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 03 08 01 5D 07 03 08 42 07 00 48 40 07 03 08 45 07 00 48 00 49 07 00 48 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 45 07 00 48 40 07 03 08 42 07 00 48 40 07 03 08 45 07 00 48 00 FF 00 0F 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 03 08 03 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 03 07 03 08 03 01 FF 00 1C 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 03 08 03 FF 00 0E 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 05 07 03 08 03 03 03 01 FF 00 1D 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 42 07 00 48 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 45 07 00 48 40 07 03 08 42 07 00 48 40 07 03 08 45 07 00 48 00 4D 07 02 D5 FF 00 02 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 02 D5 01 5C 07 02 D5 42 07 00 48 40 07 02 D5 45 07 00 48 00 42 07 00 48 00 45 07 00 48 00 42 07 00 40 00 45 07 00 48 00 FF 00 00 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 03 07 03 08 01 07 03 30 41 07 02 D5 FF 00 01 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 FF 00 01 00 05 07 00 03 01 01 01 01 00 03 01 01 07 00 03 41 01 01 41 01 FF 00 01 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 01 00 06 07 00 03 01 01 01 01 07 02 D5 00 01 07 03 08 FF 00 01 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 02 07 03 08 03 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 04 07 03 08 03 03 03 FF 00 01 00 05 07 00 03 01 01 01 01 00 01 01 41 07 02 D5 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 01 07 03 08 F9 00 01 FF 00 01 00 06 07 00 03 01 01 01 01 01 00 01 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 02 D5 07 03 08 00 01 07 03 08 FF 00 01 00 05 07 00 03 01 01 01 01 00 01 07 00 40 43 05 44 07 00 40 47 05 FF 00 07 00 06 07 00 03 01 01 01 01 07 02 D5 00 01 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1333   1341   Ljava/lang/IndexOutOfBoundsException;
        //  1333   1341   1333   1341   Ljava/lang/StringIndexOutOfBoundsException;
        //  1349   1351   3      8      Ljava/util/ConcurrentModificationException;
        //  583    590    590    591    Any
        //  583    590    583    584    Ljava/lang/AssertionError;
        //  583    590    583    584    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  584    590    590    591    Ljava/lang/AssertionError;
        //  584    590    590    591    Any
        //  643    650    650    651    Any
        //  643    650    650    651    Any
        //  644    650    643    644    Ljava/lang/AssertionError;
        //  644    650    650    651    Ljava/lang/UnsupportedOperationException;
        //  644    650    3      8      Any
        //  709    716    716    717    Any
        //  710    716    709    710    Ljava/lang/IllegalArgumentException;
        //  709    716    3      8      Ljava/lang/ClassCastException;
        //  710    716    3      8      Any
        //  710    716    3      8      Any
        //  767    774    774    775    Any
        //  767    774    3      8      Any
        //  768    774    3      8      Ljava/lang/UnsupportedOperationException;
        //  767    774    3      8      Ljava/lang/RuntimeException;
        //  767    774    767    768    Any
        //  778    785    785    786    Any
        //  779    785    3      8      Ljava/util/NoSuchElementException;
        //  778    785    778    779    Any
        //  778    785    785    786    Any
        //  779    785    778    779    Ljava/lang/StringIndexOutOfBoundsException;
        //  792    799    799    800    Any
        //  793    799    3      8      Ljava/lang/ClassCastException;
        //  793    799    799    800    Any
        //  792    799    799    800    Any
        //  793    799    792    793    Ljava/lang/ArithmeticException;
        //  855    862    862    863    Any
        //  856    862    862    863    Any
        //  855    862    855    856    Any
        //  855    862    3      8      Ljava/lang/ClassCastException;
        //  855    862    862    863    Any
        //  922    928    928    929    Any
        //  922    928    928    929    Any
        //  922    928    928    929    Ljava/lang/IllegalStateException;
        //  922    928    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  922    928    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  932    939    939    940    Any
        //  932    939    932    933    Any
        //  932    939    939    940    Ljava/lang/IllegalStateException;
        //  932    939    932    933    Any
        //  932    939    932    933    Any
        //  995    1002   1002   1003   Any
        //  995    1002   3      8      Any
        //  996    1002   995    996    Ljava/lang/RuntimeException;
        //  995    1002   3      8      Any
        //  995    1002   1002   1003   Any
        //  1051   1058   1058   1059   Any
        //  1051   1058   1058   1059   Any
        //  1052   1058   1058   1059   Any
        //  1051   1058   1051   1052   Any
        //  1052   1058   1051   1052   Ljava/lang/UnsupportedOperationException;
        //  1069   1076   1076   1077   Any
        //  1069   1076   1069   1070   Ljava/util/ConcurrentModificationException;
        //  1069   1076   1069   1070   Any
        //  1070   1076   1069   1070   Ljava/lang/UnsupportedOperationException;
        //  1069   1076   3      8      Any
        //  1080   1087   1087   1088   Any
        //  1081   1087   1080   1081   Ljava/lang/NullPointerException;
        //  1081   1087   1080   1081   Any
        //  1080   1087   1087   1088   Ljava/lang/NullPointerException;
        //  1081   1087   1087   1088   Any
        //  1187   1194   1194   1195   Any
        //  1188   1194   1187   1188   Ljava/lang/UnsupportedOperationException;
        //  1188   1194   1187   1188   Any
        //  1188   1194   1187   1188   Any
        //  1188   1194   1194   1195   Any
        //  1198   1205   1205   1206   Any
        //  1198   1205   1198   1199   Ljava/lang/EnumConstantNotPresentException;
        //  1198   1205   3      8      Any
        //  1199   1205   1198   1199   Any
        //  1199   1205   1198   1199   Ljava/lang/IllegalArgumentException;
        //  1255   1262   1262   1263   Any
        //  1255   1262   1255   1256   Any
        //  1256   1262   1255   1256   Any
        //  1256   1262   1262   1263   Ljava/lang/EnumConstantNotPresentException;
        //  1256   1262   1262   1263   Ljava/lang/RuntimeException;
        //  1266   1273   1273   1274   Any
        //  1266   1273   1266   1267   Ljava/lang/AssertionError;
        //  1267   1273   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1266   1273   1266   1267   Any
        //  1266   1273   3      8      Any
        //  1277   1284   1284   1285   Any
        //  1277   1284   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1277   1284   1284   1285   Any
        //  1277   1284   1284   1285   Any
        //  1277   1284   1277   1278   Ljava/lang/IndexOutOfBoundsException;
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
    
    public void c(final GuiPageButtonList$GuiResponder c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    Label_0026: {
                        break Label_0026;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0031;
                            }
                            continue Label_0039;
                            this.c = c;
                            return;
                        }
                        catch (ClassCastException ex) {}
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public String 5() {
        return fbS.54(this, 1274859819);
    }
    
    public int c(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          114
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            106
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            98
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           -1046818836
        //    34: goto            40
        //    37: ldc_w           -341219094
        //    40: ldc_w           -54174958
        //    43: ixor           
        //    44: lookupswitch {
        //          392967160: 72
        //          1029674238: 37
        //          default: 87
        //        }
        //    72: iload_1        
        //    73: iload_2        
        //    74: iconst_1       
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   dev/nuker/pyro/fo.c:(IIZ)I
        //    82: goto            86
        //    85: athrow         
        //    86: ireturn        
        //    87: aconst_null    
        //    88: athrow         
        //    89: pop            
        //    90: goto            24
        //    93: pop            
        //    94: aconst_null    
        //    95: goto            89
        //    98: dup            
        //    99: ifnull          89
        //   102: checkcast       Ljava/lang/Throwable;
        //   105: athrow         
        //   106: dup            
        //   107: ifnull          93
        //   110: checkcast       Ljava/lang/Throwable;
        //   113: athrow         
        //   114: aconst_null    
        //   115: athrow         
        //    StackMapTable: 00 11 43 07 00 48 04 FF 00 0B 00 00 00 01 07 00 48 FE 00 03 07 00 03 01 01 4C 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 05 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 01 01 01 45 07 00 48 40 01 40 07 00 03 41 07 00 48 43 05 44 07 00 48 47 05 47 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     98     106    Any
        //  98     106    98     106    Ljava/lang/UnsupportedOperationException;
        //  114    116    3      8      Any
        //  79     85     85     86     Any
        //  79     85     3      8      Any
        //  79     85     3      8      Any
        //  79     85     85     86     Ljava/lang/IndexOutOfBoundsException;
        //  79     85     85     86     Ljava/lang/EnumConstantNotPresentException;
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
    
    public boolean c(final char p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2554
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2546
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2538
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -1605860065
        //    33: goto            39
        //    36: ldc_w           -1217056696
        //    39: ldc_w           487735810
        //    42: ixor           
        //    43: lookupswitch {
        //          -1436061110: 68
        //          -1118124259: 36
        //          default: 2477
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/fo.1:Z
        //    72: ifne            77
        //    75: iconst_0       
        //    76: ireturn        
        //    77: iload_2        
        //    78: getstatic       dev/nuker/pyro/fc.0:I
        //    81: ifeq            90
        //    84: ldc_w           -736838927
        //    87: goto            93
        //    90: ldc_w           -808022830
        //    93: ldc_w           1884375247
        //    96: ixor           
        //    97: lookupswitch {
        //          -1538919874: 2505
        //          -711659258: 90
        //          default: 124
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokestatic    net/minecraft/client/gui/GuiScreen.func_175278_g:(I)Z
        //   131: goto            135
        //   134: athrow         
        //   135: ifeq            301
        //   138: aload_0        
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            151
        //   145: ldc_w           -1517444555
        //   148: goto            154
        //   151: ldc_w           199711991
        //   154: ldc_w           1595551184
        //   157: ixor           
        //   158: lookupswitch {
        //          -90730523: 151
        //          1425895719: 184
        //          default: 2515
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   dev/nuker/pyro/fo.4:()V
        //   191: goto            195
        //   194: athrow         
        //   195: getstatic       dev/nuker/pyro/fc.c:I
        //   198: ifge            207
        //   201: ldc_w           698741582
        //   204: goto            210
        //   207: ldc_w           -1709207185
        //   210: ldc_w           -656062368
        //   213: ixor           
        //   214: lookupswitch {
        //          -247416018: 207
        //          1123735823: 240
        //          default: 2517
        //        }
        //   240: aload_0        
        //   241: iconst_0       
        //   242: getstatic       dev/nuker/pyro/fc.c:I
        //   245: ifge            254
        //   248: ldc_w           1883892541
        //   251: goto            257
        //   254: ldc_w           1113376229
        //   257: ldc_w           1705352114
        //   260: ixor           
        //   261: lookupswitch {
        //          367816847: 254
        //          670654039: 288
        //          default: 2495
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //   295: goto            299
        //   298: athrow         
        //   299: iconst_1       
        //   300: ireturn        
        //   301: getstatic       dev/nuker/pyro/fc.1:I
        //   304: ifeq            313
        //   307: ldc_w           -23519490
        //   310: goto            316
        //   313: ldc_w           1559554973
        //   316: ldc_w           -730692695
        //   319: ixor           
        //   320: lookupswitch {
        //          -977595768: 313
        //          720084311: 2523
        //          default: 348
        //        }
        //   348: iload_2        
        //   349: goto            353
        //   352: athrow         
        //   353: invokestatic    net/minecraft/client/gui/GuiScreen.func_175280_f:(I)Z
        //   356: goto            360
        //   359: athrow         
        //   360: ifeq            388
        //   363: aload_0        
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/fo.7:()Ljava/lang/String;
        //   371: goto            375
        //   374: athrow         
        //   375: goto            379
        //   378: athrow         
        //   379: invokestatic    net/minecraft/client/gui/GuiScreen.func_146275_d:(Ljava/lang/String;)V
        //   382: goto            386
        //   385: athrow         
        //   386: iconst_1       
        //   387: ireturn        
        //   388: getstatic       dev/nuker/pyro/fc.1:I
        //   391: ifeq            400
        //   394: ldc_w           179484482
        //   397: goto            403
        //   400: ldc_w           1796291436
        //   403: ldc_w           354880056
        //   406: ixor           
        //   407: lookupswitch {
        //          529907066: 400
        //          2117480788: 432
        //          default: 2513
        //        }
        //   432: iload_2        
        //   433: goto            437
        //   436: athrow         
        //   437: invokestatic    net/minecraft/client/gui/GuiScreen.func_175279_e:(I)Z
        //   440: goto            444
        //   443: athrow         
        //   444: ifeq            453
        //   447: ldc_w           -693294020
        //   450: goto            456
        //   453: ldc_w           -693294021
        //   456: ldc_w           -1623681841
        //   459: ixor           
        //   460: tableswitch {
        //          -1825869338: 484
        //          -1825869337: 561
        //          default: 447
        //        }
        //   484: aload_0        
        //   485: getfield        dev/nuker/pyro/fo.2:Z
        //   488: ifeq            559
        //   491: aload_0        
        //   492: goto            496
        //   495: athrow         
        //   496: invokestatic    net/minecraft/client/gui/GuiScreen.func_146277_j:()Ljava/lang/String;
        //   499: goto            503
        //   502: athrow         
        //   503: getstatic       dev/nuker/pyro/fc.1:I
        //   506: ifeq            515
        //   509: ldc_w           1556748606
        //   512: goto            518
        //   515: ldc_w           1124273070
        //   518: ldc_w           1225907946
        //   521: ixor           
        //   522: lookupswitch {
        //          169006404: 548
        //          366725076: 515
        //          default: 2469
        //        }
        //   548: goto            552
        //   551: athrow         
        //   552: invokevirtual   dev/nuker/pyro/fo.c:(Ljava/lang/String;)V
        //   555: goto            559
        //   558: athrow         
        //   559: iconst_1       
        //   560: ireturn        
        //   561: iload_2        
        //   562: goto            566
        //   565: athrow         
        //   566: invokestatic    net/minecraft/client/gui/GuiScreen.func_175277_d:(I)Z
        //   569: goto            573
        //   572: athrow         
        //   573: ifeq            582
        //   576: ldc_w           1477104226
        //   579: goto            585
        //   582: ldc_w           1477104227
        //   585: ldc_w           -2072222860
        //   588: ixor           
        //   589: tableswitch {
        //          -1192402388: 612
        //          -1192402387: 753
        //          default: 576
        //        }
        //   612: aload_0        
        //   613: getstatic       dev/nuker/pyro/fc.0:I
        //   616: ifeq            625
        //   619: ldc_w           -548975222
        //   622: goto            628
        //   625: ldc_w           1528330672
        //   628: ldc_w           -618854491
        //   631: ixor           
        //   632: lookupswitch {
        //          -2147123691: 660
        //          73026095: 625
        //          default: 2491
        //        }
        //   660: goto            664
        //   663: athrow         
        //   664: invokevirtual   dev/nuker/pyro/fo.7:()Ljava/lang/String;
        //   667: goto            671
        //   670: athrow         
        //   671: goto            675
        //   674: athrow         
        //   675: invokestatic    net/minecraft/client/gui/GuiScreen.func_146275_d:(Ljava/lang/String;)V
        //   678: goto            682
        //   681: athrow         
        //   682: aload_0        
        //   683: getfield        dev/nuker/pyro/fo.2:Z
        //   686: ifeq            751
        //   689: getstatic       dev/nuker/pyro/fc.0:I
        //   692: ifeq            701
        //   695: ldc_w           -1343079315
        //   698: goto            704
        //   701: ldc_w           2047034393
        //   704: ldc_w           -648526257
        //   707: ixor           
        //   708: lookupswitch {
        //          -1554316714: 736
        //          1990883874: 701
        //          default: 2475
        //        }
        //   736: aload_0        
        //   737: ldc_w           ""
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   dev/nuker/pyro/fo.c:(Ljava/lang/String;)V
        //   747: goto            751
        //   750: athrow         
        //   751: iconst_1       
        //   752: ireturn        
        //   753: iload_2        
        //   754: lookupswitch {
        //               14: 812
        //              199: 1043
        //              203: 1133
        //              205: 1628
        //              207: 2087
        //              211: 2180
        //          default: 2375
        //        }
        //   812: goto            816
        //   815: athrow         
        //   816: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //   819: goto            823
        //   822: athrow         
        //   823: ifeq            976
        //   826: getstatic       dev/nuker/pyro/fc.c:I
        //   829: ifge            838
        //   832: ldc_w           -184402009
        //   835: goto            841
        //   838: ldc_w           998438659
        //   841: ldc_w           -918857569
        //   844: ixor           
        //   845: lookupswitch {
        //          -222711908: 872
        //          1010394936: 838
        //          default: 2481
        //        }
        //   872: aload_0        
        //   873: getstatic       dev/nuker/pyro/fc.1:I
        //   876: ifeq            885
        //   879: ldc_w           -1058855772
        //   882: goto            888
        //   885: ldc_w           -508211538
        //   888: ldc_w           -1243845467
        //   891: ixor           
        //   892: lookupswitch {
        //          77230751: 885
        //          1967081473: 2499
        //          default: 920
        //        }
        //   920: getfield        dev/nuker/pyro/fo.2:Z
        //   923: ifeq            932
        //   926: ldc_w           4936751
        //   929: goto            935
        //   932: ldc_w           4936750
        //   935: ldc_w           -2043450119
        //   938: ixor           
        //   939: tableswitch {
        //          217084332: 960
        //          217084333: 1041
        //          default: 926
        //        }
        //   960: aload_0        
        //   961: iconst_m1      
        //   962: goto            966
        //   965: athrow         
        //   966: invokevirtual   dev/nuker/pyro/fo.6:(I)V
        //   969: goto            973
        //   972: athrow         
        //   973: goto            1041
        //   976: aload_0        
        //   977: getfield        dev/nuker/pyro/fo.2:Z
        //   980: ifeq            1041
        //   983: getstatic       dev/nuker/pyro/fc.c:I
        //   986: ifge            995
        //   989: ldc_w           -1677059793
        //   992: goto            998
        //   995: ldc_w           535775060
        //   998: ldc_w           766098089
        //  1001: ixor           
        //  1002: lookupswitch {
        //          -1444390452: 995
        //          -1314675834: 2525
        //          default: 1028
        //        }
        //  1028: aload_0        
        //  1029: iconst_m1      
        //  1030: goto            1034
        //  1033: athrow         
        //  1034: invokevirtual   dev/nuker/pyro/fo.4:(I)V
        //  1037: goto            1041
        //  1040: athrow         
        //  1041: iconst_1       
        //  1042: ireturn        
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: invokestatic    net/minecraft/client/gui/GuiScreen.func_146272_n:()Z
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: ifeq            1073
        //  1057: aload_0        
        //  1058: iconst_0       
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: goto            1131
        //  1073: aload_0        
        //  1074: getstatic       dev/nuker/pyro/fc.0:I
        //  1077: ifeq            1086
        //  1080: ldc_w           -952461796
        //  1083: goto            1089
        //  1086: ldc_w           -372192222
        //  1089: ldc_w           -1881859399
        //  1092: ixor           
        //  1093: lookupswitch {
        //          1223658661: 2509
        //          2015736879: 1086
        //          default: 1120
        //        }
        //  1120: goto            1124
        //  1123: athrow         
        //  1124: invokevirtual   dev/nuker/pyro/fo.a:()V
        //  1127: goto            1131
        //  1130: athrow         
        //  1131: iconst_1       
        //  1132: ireturn        
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: invokestatic    net/minecraft/client/gui/GuiScreen.func_146272_n:()Z
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: ifeq            1447
        //  1147: getstatic       dev/nuker/pyro/fc.0:I
        //  1150: ifeq            1159
        //  1153: ldc_w           -1112976387
        //  1156: goto            1162
        //  1159: ldc_w           613958980
        //  1162: ldc_w           2052308729
        //  1165: ixor           
        //  1166: lookupswitch {
        //          -939856636: 1159
        //          1590426557: 1192
        //          default: 2507
        //        }
        //  1192: goto            1196
        //  1195: athrow         
        //  1196: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //  1199: goto            1203
        //  1202: athrow         
        //  1203: ifeq            1212
        //  1206: ldc_w           129288114
        //  1209: goto            1215
        //  1212: ldc_w           129288115
        //  1215: ldc_w           387783206
        //  1218: ixor           
        //  1219: tableswitch {
        //          559135528: 1240
        //          559135529: 1324
        //          default: 1206
        //        }
        //  1240: aload_0        
        //  1241: aload_0        
        //  1242: iconst_m1      
        //  1243: aload_0        
        //  1244: getstatic       dev/nuker/pyro/fc.1:I
        //  1247: ifeq            1256
        //  1250: ldc_w           -1339473441
        //  1253: goto            1259
        //  1256: ldc_w           -1004252683
        //  1259: ldc_w           1346934240
        //  1262: ixor           
        //  1263: lookupswitch {
        //          -1804811243: 1288
        //          -530459585: 1256
        //          default: 2503
        //        }
        //  1288: goto            1292
        //  1291: athrow         
        //  1292: invokevirtual   dev/nuker/pyro/fo.1:()I
        //  1295: goto            1299
        //  1298: athrow         
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: invokevirtual   dev/nuker/pyro/fo.c:(II)I
        //  1306: goto            1310
        //  1309: athrow         
        //  1310: goto            1314
        //  1313: athrow         
        //  1314: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  1317: goto            1321
        //  1320: athrow         
        //  1321: goto            1626
        //  1324: aload_0        
        //  1325: getstatic       dev/nuker/pyro/fc.0:I
        //  1328: ifeq            1337
        //  1331: ldc_w           1142540413
        //  1334: goto            1340
        //  1337: ldc_w           115557848
        //  1340: ldc_w           -241287853
        //  1343: ixor           
        //  1344: lookupswitch {
        //          -1249381074: 2493
        //          1431689745: 1337
        //          default: 1372
        //        }
        //  1372: aload_0        
        //  1373: getstatic       dev/nuker/pyro/fc.1:I
        //  1376: ifeq            1385
        //  1379: ldc_w           1144815818
        //  1382: goto            1388
        //  1385: ldc_w           2106942458
        //  1388: ldc_w           -1082333507
        //  1391: ixor           
        //  1392: lookupswitch {
        //          -1066215943: 1385
        //          -79665545: 2501
        //          default: 1420
        //        }
        //  1420: goto            1424
        //  1423: athrow         
        //  1424: invokevirtual   dev/nuker/pyro/fo.1:()I
        //  1427: goto            1431
        //  1430: athrow         
        //  1431: iconst_1       
        //  1432: isub           
        //  1433: goto            1437
        //  1436: athrow         
        //  1437: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  1440: goto            1444
        //  1443: athrow         
        //  1444: goto            1626
        //  1447: getstatic       dev/nuker/pyro/fc.0:I
        //  1450: ifeq            1459
        //  1453: ldc_w           2002780896
        //  1456: goto            1462
        //  1459: ldc_w           2026410440
        //  1462: ldc_w           -1568021000
        //  1465: ixor           
        //  1466: lookupswitch {
        //          -706091240: 2519
        //          1330021058: 1459
        //          default: 1492
        //        }
        //  1492: goto            1496
        //  1495: athrow         
        //  1496: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //  1499: goto            1503
        //  1502: athrow         
        //  1503: ifeq            1512
        //  1506: ldc_w           899831959
        //  1509: goto            1515
        //  1512: ldc_w           899831976
        //  1515: ldc_w           -1346978488
        //  1518: ixor           
        //  1519: tableswitch {
        //          875154366: 1540
        //          875154367: 1613
        //          default: 1506
        //        }
        //  1540: aload_0        
        //  1541: aload_0        
        //  1542: iconst_m1      
        //  1543: getstatic       dev/nuker/pyro/fc.c:I
        //  1546: ifge            1555
        //  1549: ldc_w           625412609
        //  1552: goto            1558
        //  1555: ldc_w           1087201005
        //  1558: ldc_w           757903919
        //  1561: ixor           
        //  1562: lookupswitch {
        //          141277230: 2473
        //          1410840679: 1555
        //          default: 1588
        //        }
        //  1588: goto            1592
        //  1591: athrow         
        //  1592: invokevirtual   dev/nuker/pyro/fo.3:(I)I
        //  1595: goto            1599
        //  1598: athrow         
        //  1599: goto            1603
        //  1602: athrow         
        //  1603: invokevirtual   dev/nuker/pyro/fo.1:(I)V
        //  1606: goto            1610
        //  1609: athrow         
        //  1610: goto            1626
        //  1613: aload_0        
        //  1614: iconst_m1      
        //  1615: goto            1619
        //  1618: athrow         
        //  1619: invokevirtual   dev/nuker/pyro/fo.2:(I)V
        //  1622: goto            1626
        //  1625: athrow         
        //  1626: iconst_1       
        //  1627: ireturn        
        //  1628: getstatic       dev/nuker/pyro/fc.c:I
        //  1631: ifge            1640
        //  1634: ldc_w           98756215
        //  1637: goto            1643
        //  1640: ldc_w           1474507589
        //  1643: ldc_w           957580740
        //  1646: ixor           
        //  1647: lookupswitch {
        //          1022452659: 1640
        //          1861269121: 1672
        //          default: 2485
        //        }
        //  1672: goto            1676
        //  1675: athrow         
        //  1676: invokestatic    net/minecraft/client/gui/GuiScreen.func_146272_n:()Z
        //  1679: goto            1683
        //  1682: athrow         
        //  1683: ifeq            1951
        //  1686: getstatic       dev/nuker/pyro/fc.c:I
        //  1689: ifge            1698
        //  1692: ldc_w           -1946227388
        //  1695: goto            1701
        //  1698: ldc_w           2073116177
        //  1701: ldc_w           -893000889
        //  1704: ixor           
        //  1705: lookupswitch {
        //          -1319838378: 1732
        //          1094389251: 1698
        //          default: 2483
        //        }
        //  1732: goto            1736
        //  1735: athrow         
        //  1736: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //  1739: goto            1743
        //  1742: athrow         
        //  1743: ifeq            1878
        //  1746: getstatic       dev/nuker/pyro/fc.1:I
        //  1749: ifeq            1758
        //  1752: ldc_w           -939810367
        //  1755: goto            1761
        //  1758: ldc_w           -24758252
        //  1761: ldc_w           -1803740998
        //  1764: ixor           
        //  1765: lookupswitch {
        //          1401338235: 1758
        //          1794842798: 1792
        //          default: 2489
        //        }
        //  1792: aload_0        
        //  1793: aload_0        
        //  1794: iconst_1       
        //  1795: aload_0        
        //  1796: goto            1800
        //  1799: athrow         
        //  1800: invokevirtual   dev/nuker/pyro/fo.1:()I
        //  1803: goto            1807
        //  1806: athrow         
        //  1807: goto            1811
        //  1810: athrow         
        //  1811: invokevirtual   dev/nuker/pyro/fo.c:(II)I
        //  1814: goto            1818
        //  1817: athrow         
        //  1818: getstatic       dev/nuker/pyro/fc.1:I
        //  1821: ifeq            1830
        //  1824: ldc_w           1473839987
        //  1827: goto            1833
        //  1830: ldc_w           598401288
        //  1833: ldc_w           -1526275971
        //  1836: ixor           
        //  1837: lookupswitch {
        //          -220208370: 2511
        //          1921271006: 1830
        //          default: 1864
        //        }
        //  1864: goto            1868
        //  1867: athrow         
        //  1868: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  1871: goto            1875
        //  1874: athrow         
        //  1875: goto            2085
        //  1878: aload_0        
        //  1879: aload_0        
        //  1880: getstatic       dev/nuker/pyro/fc.c:I
        //  1883: ifge            1892
        //  1886: ldc_w           1596940732
        //  1889: goto            1895
        //  1892: ldc_w           177746012
        //  1895: ldc_w           1511242787
        //  1898: ixor           
        //  1899: lookupswitch {
        //          -1008603781: 1892
        //          87874975: 2471
        //          default: 1924
        //        }
        //  1924: goto            1928
        //  1927: athrow         
        //  1928: invokevirtual   dev/nuker/pyro/fo.1:()I
        //  1931: goto            1935
        //  1934: athrow         
        //  1935: iconst_1       
        //  1936: iadd           
        //  1937: goto            1941
        //  1940: athrow         
        //  1941: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  1944: goto            1948
        //  1947: athrow         
        //  1948: goto            2085
        //  1951: goto            1955
        //  1954: athrow         
        //  1955: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //  1958: goto            1962
        //  1961: athrow         
        //  1962: ifeq            1971
        //  1965: ldc_w           2036710815
        //  1968: goto            1974
        //  1971: ldc_w           2036710814
        //  1974: ldc_w           -599344293
        //  1977: ixor           
        //  1978: tableswitch {
        //          1246104968: 2000
        //          1246104969: 2028
        //          default: 1965
        //        }
        //  2000: aload_0        
        //  2001: aload_0        
        //  2002: iconst_1       
        //  2003: goto            2007
        //  2006: athrow         
        //  2007: invokevirtual   dev/nuker/pyro/fo.3:(I)I
        //  2010: goto            2014
        //  2013: athrow         
        //  2014: goto            2018
        //  2017: athrow         
        //  2018: invokevirtual   dev/nuker/pyro/fo.1:(I)V
        //  2021: goto            2025
        //  2024: athrow         
        //  2025: goto            2085
        //  2028: getstatic       dev/nuker/pyro/fc.0:I
        //  2031: ifeq            2040
        //  2034: ldc_w           -2099759825
        //  2037: goto            2043
        //  2040: ldc_w           -636294049
        //  2043: ldc_w           -1380374272
        //  2046: ixor           
        //  2047: lookupswitch {
        //          794893359: 2040
        //          2007745887: 2072
        //          default: 2487
        //        }
        //  2072: aload_0        
        //  2073: iconst_1       
        //  2074: goto            2078
        //  2077: athrow         
        //  2078: invokevirtual   dev/nuker/pyro/fo.2:(I)V
        //  2081: goto            2085
        //  2084: athrow         
        //  2085: iconst_1       
        //  2086: ireturn        
        //  2087: goto            2091
        //  2090: athrow         
        //  2091: invokestatic    net/minecraft/client/gui/GuiScreen.func_146272_n:()Z
        //  2094: goto            2098
        //  2097: athrow         
        //  2098: ifeq            2107
        //  2101: ldc_w           1041644565
        //  2104: goto            2110
        //  2107: ldc_w           1041644570
        //  2110: ldc_w           -1508433022
        //  2113: ixor           
        //  2114: tableswitch {
        //          805453614: 2136
        //          805453615: 2166
        //          default: 2101
        //        }
        //  2136: aload_0        
        //  2137: aload_0        
        //  2138: getfield        dev/nuker/pyro/fo.c:Ljava/lang/String;
        //  2141: goto            2145
        //  2144: athrow         
        //  2145: invokevirtual   java/lang/String.length:()I
        //  2148: goto            2152
        //  2151: athrow         
        //  2152: goto            2156
        //  2155: athrow         
        //  2156: invokevirtual   dev/nuker/pyro/fo.5:(I)V
        //  2159: goto            2163
        //  2162: athrow         
        //  2163: goto            2178
        //  2166: aload_0        
        //  2167: goto            2171
        //  2170: athrow         
        //  2171: invokevirtual   dev/nuker/pyro/fo.4:()V
        //  2174: goto            2178
        //  2177: athrow         
        //  2178: iconst_1       
        //  2179: ireturn        
        //  2180: getstatic       dev/nuker/pyro/fc.c:I
        //  2183: ifge            2192
        //  2186: ldc_w           -1005229888
        //  2189: goto            2195
        //  2192: ldc_w           586126473
        //  2195: ldc_w           1543660659
        //  2198: ixor           
        //  2199: lookupswitch {
        //          -1743319885: 2479
        //          82313719: 2192
        //          default: 2224
        //        }
        //  2224: goto            2228
        //  2227: athrow         
        //  2228: invokestatic    net/minecraft/client/gui/GuiScreen.func_146271_m:()Z
        //  2231: goto            2235
        //  2234: athrow         
        //  2235: ifeq            2261
        //  2238: aload_0        
        //  2239: getfield        dev/nuker/pyro/fo.2:Z
        //  2242: ifeq            2373
        //  2245: aload_0        
        //  2246: iconst_1       
        //  2247: goto            2251
        //  2250: athrow         
        //  2251: invokevirtual   dev/nuker/pyro/fo.6:(I)V
        //  2254: goto            2258
        //  2257: athrow         
        //  2258: goto            2373
        //  2261: getstatic       dev/nuker/pyro/fc.1:I
        //  2264: ifeq            2273
        //  2267: ldc_w           -1355075237
        //  2270: goto            2276
        //  2273: ldc_w           -257196273
        //  2276: ldc_w           -1498226654
        //  2279: ixor           
        //  2280: lookupswitch {
        //          160027001: 2527
        //          607078417: 2273
        //          default: 2308
        //        }
        //  2308: aload_0        
        //  2309: getfield        dev/nuker/pyro/fo.2:Z
        //  2312: ifeq            2373
        //  2315: getstatic       dev/nuker/pyro/fc.0:I
        //  2318: ifeq            2327
        //  2321: ldc_w           1848637313
        //  2324: goto            2330
        //  2327: ldc_w           -574842527
        //  2330: ldc_w           -1920635041
        //  2333: ixor           
        //  2334: lookupswitch {
        //          -475359010: 2327
        //          1345975870: 2360
        //          default: 2497
        //        }
        //  2360: aload_0        
        //  2361: iconst_1       
        //  2362: goto            2366
        //  2365: athrow         
        //  2366: invokevirtual   dev/nuker/pyro/fo.4:(I)V
        //  2369: goto            2373
        //  2372: athrow         
        //  2373: iconst_1       
        //  2374: ireturn        
        //  2375: iload_1        
        //  2376: getstatic       dev/nuker/pyro/fc.1:I
        //  2379: ifeq            2388
        //  2382: ldc_w           -386565388
        //  2385: goto            2391
        //  2388: ldc_w           1212191300
        //  2391: ldc_w           -620280652
        //  2394: ixor           
        //  2395: lookupswitch {
        //          -1824008464: 2420
        //          871513664: 2388
        //          default: 2521
        //        }
        //  2420: goto            2424
        //  2423: athrow         
        //  2424: invokestatic    net/minecraft/util/ChatAllowedCharacters.func_71566_a:(C)Z
        //  2427: goto            2431
        //  2430: athrow         
        //  2431: ifeq            2467
        //  2434: aload_0        
        //  2435: getfield        dev/nuker/pyro/fo.2:Z
        //  2438: ifeq            2465
        //  2441: aload_0        
        //  2442: iload_1        
        //  2443: goto            2447
        //  2446: athrow         
        //  2447: invokestatic    java/lang/Character.toString:(C)Ljava/lang/String;
        //  2450: goto            2454
        //  2453: athrow         
        //  2454: goto            2458
        //  2457: athrow         
        //  2458: invokevirtual   dev/nuker/pyro/fo.c:(Ljava/lang/String;)V
        //  2461: goto            2465
        //  2464: athrow         
        //  2465: iconst_1       
        //  2466: ireturn        
        //  2467: iconst_0       
        //  2468: ireturn        
        //  2469: aconst_null    
        //  2470: athrow         
        //  2471: aconst_null    
        //  2472: athrow         
        //  2473: aconst_null    
        //  2474: athrow         
        //  2475: aconst_null    
        //  2476: athrow         
        //  2477: aconst_null    
        //  2478: athrow         
        //  2479: aconst_null    
        //  2480: athrow         
        //  2481: aconst_null    
        //  2482: athrow         
        //  2483: aconst_null    
        //  2484: athrow         
        //  2485: aconst_null    
        //  2486: athrow         
        //  2487: aconst_null    
        //  2488: athrow         
        //  2489: aconst_null    
        //  2490: athrow         
        //  2491: aconst_null    
        //  2492: athrow         
        //  2493: aconst_null    
        //  2494: athrow         
        //  2495: aconst_null    
        //  2496: athrow         
        //  2497: aconst_null    
        //  2498: athrow         
        //  2499: aconst_null    
        //  2500: athrow         
        //  2501: aconst_null    
        //  2502: athrow         
        //  2503: aconst_null    
        //  2504: athrow         
        //  2505: aconst_null    
        //  2506: athrow         
        //  2507: aconst_null    
        //  2508: athrow         
        //  2509: aconst_null    
        //  2510: athrow         
        //  2511: aconst_null    
        //  2512: athrow         
        //  2513: aconst_null    
        //  2514: athrow         
        //  2515: aconst_null    
        //  2516: athrow         
        //  2517: aconst_null    
        //  2518: athrow         
        //  2519: aconst_null    
        //  2520: athrow         
        //  2521: aconst_null    
        //  2522: athrow         
        //  2523: aconst_null    
        //  2524: athrow         
        //  2525: aconst_null    
        //  2526: athrow         
        //  2527: aconst_null    
        //  2528: athrow         
        //  2529: pop            
        //  2530: goto            24
        //  2533: pop            
        //  2534: aconst_null    
        //  2535: goto            2529
        //  2538: dup            
        //  2539: ifnull          2529
        //  2542: checkcast       Ljava/lang/Throwable;
        //  2545: athrow         
        //  2546: dup            
        //  2547: ifnull          2533
        //  2550: checkcast       Ljava/lang/Throwable;
        //  2553: athrow         
        //  2554: aconst_null    
        //  2555: athrow         
        //    StackMapTable: 01 80 43 07 00 48 04 FF 00 0B 00 00 00 01 07 00 48 FE 00 03 07 00 03 01 01 0B 42 01 1C 08 4C 01 FF 00 02 00 03 07 00 03 01 01 00 02 01 01 5E 01 42 07 00 24 40 01 45 07 00 48 40 01 4F 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5D 07 00 03 42 07 00 48 40 07 00 03 45 07 00 48 00 0B 42 01 1D FF 00 0D 00 03 07 00 03 01 01 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 1E 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 32 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 01 0B 42 01 1F FF 00 03 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 01 01 45 07 00 48 40 01 46 07 00 48 40 07 00 03 45 07 00 48 40 07 00 90 42 07 00 48 40 07 00 90 45 07 00 48 00 01 0B 42 01 1C 43 07 00 48 40 01 45 07 00 48 40 01 02 05 42 01 1B FF 00 0A 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 01 07 00 03 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 FF 00 0B 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 FF 00 02 00 03 07 00 03 01 01 00 03 07 00 03 07 00 90 01 FF 00 1D 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 42 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 45 07 00 48 00 01 43 07 00 48 40 01 45 07 00 48 40 01 02 05 42 01 1A 4C 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5F 07 00 03 42 07 00 48 40 07 00 03 45 07 00 48 40 07 00 90 42 07 00 48 40 07 00 90 45 07 00 48 00 12 42 01 1F 46 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 45 07 00 48 00 01 3A FF 00 02 00 00 00 01 07 00 48 FE 00 00 07 00 03 01 01 45 07 00 48 40 01 0E 42 01 1E 4C 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5F 07 00 03 05 05 42 01 18 44 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 12 42 01 1D 44 07 00 38 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 01 42 07 00 48 00 45 07 00 48 40 01 47 07 00 28 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 4C 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5E 07 00 03 42 07 00 48 40 07 00 03 45 07 00 48 00 01 42 07 00 48 00 45 07 00 48 40 01 0E 42 01 1D 42 07 00 38 00 45 07 00 48 40 01 02 05 42 01 18 FF 00 0F 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 05 07 00 03 07 00 03 01 07 00 03 01 FF 00 1C 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 07 00 03 42 07 00 2A FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 07 00 03 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 01 42 07 00 42 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 01 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 4C 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 FF 00 1F 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 42 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 44 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 0B 42 01 1D 42 07 00 48 00 45 07 00 48 40 01 02 05 42 01 18 FF 00 0E 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 FF 00 02 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 01 FF 00 1D 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 42 07 00 42 FF 00 00 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 3A FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 FF 00 04 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 01 0B 42 01 1C 42 07 00 42 00 45 07 00 48 40 01 0E 42 01 1E 42 07 00 48 00 45 07 00 48 40 01 0E 42 01 1E 46 07 00 24 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 07 00 03 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 01 42 07 00 36 FF 00 00 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 01 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 FF 00 0B 00 03 07 00 03 01 01 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 1E 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 3A FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 FF 00 0D 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 FF 00 1C 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 42 07 00 32 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 FF 00 04 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 42 07 00 32 00 45 07 00 48 40 01 02 05 42 01 19 45 07 00 24 FF 00 00 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 0B 42 01 1C 44 07 00 32 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 01 42 07 00 3C 00 45 07 00 48 40 01 02 05 42 01 19 FF 00 07 00 00 00 01 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 42 07 00 36 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 43 07 00 48 40 07 00 03 45 07 00 48 00 01 0B 42 01 1C 42 07 00 48 00 45 07 00 48 40 01 4E 07 00 3E FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 02 0B 42 01 1F 12 42 01 1D 44 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 00 01 4C 01 FF 00 02 00 03 07 00 03 01 01 00 02 01 01 5C 01 42 07 00 48 40 01 45 07 00 48 40 01 4E 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 01 45 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 42 07 00 48 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 45 07 00 48 00 01 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 07 00 90 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 03 07 00 03 07 00 03 01 01 01 01 01 01 01 01 01 41 07 00 03 41 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 01 41 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 04 07 00 03 07 00 03 01 07 00 03 41 01 01 41 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 01 41 07 00 03 01 01 41 01 01 01 01 41 07 00 48 43 05 44 07 00 48 47 05 47 07 00 48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2538   2546   Ljava/lang/AssertionError;
        //  2538   2546   2538   2546   Ljava/util/ConcurrentModificationException;
        //  2554   2556   3      8      Ljava/util/ConcurrentModificationException;
        //  127    134    134    135    Any
        //  127    134    134    135    Any
        //  127    134    127    128    Ljava/lang/NumberFormatException;
        //  128    134    127    128    Ljava/lang/NumberFormatException;
        //  127    134    3      8      Any
        //  187    194    194    195    Any
        //  188    194    187    188    Ljava/lang/ArithmeticException;
        //  188    194    187    188    Any
        //  187    194    3      8      Any
        //  187    194    3      8      Any
        //  291    298    298    299    Any
        //  291    298    291    292    Ljava/util/ConcurrentModificationException;
        //  291    298    291    292    Ljava/lang/NumberFormatException;
        //  291    298    291    292    Ljava/lang/ArithmeticException;
        //  292    298    291    292    Ljava/lang/NegativeArraySizeException;
        //  353    359    359    360    Any
        //  353    359    3      8      Ljava/lang/NullPointerException;
        //  353    359    3      8      Ljava/lang/ClassCastException;
        //  353    359    359    360    Ljava/lang/NegativeArraySizeException;
        //  353    359    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  367    374    374    375    Any
        //  368    374    367    368    Any
        //  367    374    3      8      Ljava/lang/IllegalArgumentException;
        //  367    374    367    368    Any
        //  368    374    3      8      Ljava/lang/NumberFormatException;
        //  378    385    385    386    Any
        //  378    385    385    386    Ljava/util/NoSuchElementException;
        //  379    385    3      8      Any
        //  379    385    378    379    Any
        //  378    385    385    386    Ljava/lang/NegativeArraySizeException;
        //  436    443    443    444    Any
        //  437    443    3      8      Any
        //  436    443    436    437    Any
        //  437    443    436    437    Ljava/lang/NullPointerException;
        //  436    443    443    444    Ljava/util/ConcurrentModificationException;
        //  496    502    502    503    Any
        //  496    502    3      8      Any
        //  496    502    502    503    Any
        //  496    502    3      8      Ljava/util/ConcurrentModificationException;
        //  496    502    502    503    Ljava/lang/ClassCastException;
        //  551    558    558    559    Any
        //  552    558    558    559    Any
        //  551    558    551    552    Any
        //  551    558    558    559    Any
        //  552    558    558    559    Any
        //  565    572    572    573    Any
        //  565    572    565    566    Ljava/util/ConcurrentModificationException;
        //  565    572    565    566    Any
        //  566    572    572    573    Any
        //  565    572    3      8      Any
        //  663    670    670    671    Any
        //  664    670    3      8      Any
        //  664    670    670    671    Ljava/lang/AssertionError;
        //  663    670    663    664    Any
        //  663    670    3      8      Ljava/lang/RuntimeException;
        //  674    681    681    682    Any
        //  674    681    681    682    Any
        //  675    681    674    675    Any
        //  675    681    3      8      Ljava/lang/IllegalArgumentException;
        //  675    681    681    682    Ljava/lang/RuntimeException;
        //  743    750    750    751    Any
        //  744    750    743    744    Any
        //  743    750    743    744    Any
        //  744    750    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  744    750    3      8      Ljava/lang/NumberFormatException;
        //  816    822    822    823    Any
        //  816    822    822    823    Any
        //  816    822    822    823    Any
        //  816    822    822    823    Ljava/lang/IndexOutOfBoundsException;
        //  816    822    3      8      Any
        //  965    972    972    973    Any
        //  966    972    972    973    Ljava/lang/AssertionError;
        //  965    972    965    966    Ljava/lang/AssertionError;
        //  965    972    972    973    Ljava/lang/IllegalStateException;
        //  966    972    965    966    Ljava/lang/NegativeArraySizeException;
        //  1033   1040   1040   1041   Any
        //  1033   1040   3      8      Any
        //  1033   1040   1040   1041   Any
        //  1034   1040   1040   1041   Ljava/lang/ClassCastException;
        //  1033   1040   1033   1034   Ljava/lang/StringIndexOutOfBoundsException;
        //  1046   1053   1053   1054   Any
        //  1047   1053   1046   1047   Any
        //  1047   1053   1053   1054   Ljava/util/ConcurrentModificationException;
        //  1047   1053   1053   1054   Ljava/lang/IllegalArgumentException;
        //  1046   1053   3      8      Ljava/util/NoSuchElementException;
        //  1062   1069   1069   1070   Any
        //  1063   1069   3      8      Any
        //  1062   1069   3      8      Ljava/lang/NumberFormatException;
        //  1063   1069   3      8      Any
        //  1063   1069   1062   1063   Ljava/util/ConcurrentModificationException;
        //  1123   1130   1130   1131   Any
        //  1124   1130   1123   1124   Any
        //  1124   1130   1123   1124   Any
        //  1123   1130   1123   1124   Any
        //  1124   1130   3      8      Ljava/lang/NegativeArraySizeException;
        //  1136   1143   1143   1144   Any
        //  1136   1143   1136   1137   Any
        //  1137   1143   3      8      Ljava/lang/ClassCastException;
        //  1137   1143   1136   1137   Ljava/lang/StringIndexOutOfBoundsException;
        //  1136   1143   1143   1144   Ljava/lang/NullPointerException;
        //  1195   1202   1202   1203   Any
        //  1195   1202   3      8      Any
        //  1195   1202   1202   1203   Ljava/lang/NumberFormatException;
        //  1195   1202   1195   1196   Ljava/lang/StringIndexOutOfBoundsException;
        //  1196   1202   1202   1203   Any
        //  1291   1298   1298   1299   Any
        //  1291   1298   1291   1292   Ljava/lang/ClassCastException;
        //  1291   1298   1298   1299   Ljava/lang/ArithmeticException;
        //  1292   1298   1298   1299   Any
        //  1291   1298   1291   1292   Ljava/lang/ClassCastException;
        //  1302   1309   1309   1310   Any
        //  1303   1309   1309   1310   Any
        //  1302   1309   1309   1310   Any
        //  1303   1309   1309   1310   Any
        //  1302   1309   1302   1303   Ljava/util/NoSuchElementException;
        //  1313   1320   1320   1321   Any
        //  1314   1320   1320   1321   Any
        //  1314   1320   3      8      Ljava/lang/NegativeArraySizeException;
        //  1313   1320   1320   1321   Ljava/lang/IllegalArgumentException;
        //  1313   1320   1313   1314   Any
        //  1423   1430   1430   1431   Any
        //  1423   1430   3      8      Any
        //  1424   1430   1430   1431   Any
        //  1424   1430   1423   1424   Ljava/lang/EnumConstantNotPresentException;
        //  1424   1430   1423   1424   Any
        //  1436   1443   1443   1444   Any
        //  1437   1443   1436   1437   Ljava/lang/IllegalStateException;
        //  1437   1443   1436   1437   Ljava/lang/AssertionError;
        //  1436   1443   1443   1444   Ljava/lang/IllegalStateException;
        //  1437   1443   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1495   1502   1502   1503   Any
        //  1496   1502   1495   1496   Ljava/lang/IllegalArgumentException;
        //  1496   1502   1495   1496   Any
        //  1496   1502   1495   1496   Ljava/lang/ClassCastException;
        //  1496   1502   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1591   1598   1598   1599   Any
        //  1591   1598   1598   1599   Ljava/lang/RuntimeException;
        //  1592   1598   3      8      Any
        //  1592   1598   1591   1592   Ljava/util/NoSuchElementException;
        //  1592   1598   1598   1599   Ljava/lang/EnumConstantNotPresentException;
        //  1602   1609   1609   1610   Any
        //  1602   1609   1609   1610   Any
        //  1603   1609   3      8      Ljava/lang/NegativeArraySizeException;
        //  1602   1609   1602   1603   Ljava/lang/EnumConstantNotPresentException;
        //  1602   1609   3      8      Ljava/lang/UnsupportedOperationException;
        //  1619   1625   1625   1626   Any
        //  1619   1625   1625   1626   Any
        //  1619   1625   1625   1626   Ljava/lang/AssertionError;
        //  1619   1625   1625   1626   Ljava/lang/EnumConstantNotPresentException;
        //  1619   1625   3      8      Ljava/lang/IllegalStateException;
        //  1675   1682   1682   1683   Any
        //  1675   1682   3      8      Any
        //  1675   1682   1682   1683   Ljava/lang/RuntimeException;
        //  1676   1682   1675   1676   Ljava/util/NoSuchElementException;
        //  1675   1682   3      8      Ljava/lang/NegativeArraySizeException;
        //  1735   1742   1742   1743   Any
        //  1735   1742   1735   1736   Any
        //  1736   1742   1742   1743   Ljava/lang/RuntimeException;
        //  1736   1742   3      8      Any
        //  1735   1742   1742   1743   Any
        //  1799   1806   1806   1807   Any
        //  1799   1806   1806   1807   Any
        //  1799   1806   1806   1807   Any
        //  1800   1806   1799   1800   Ljava/lang/NumberFormatException;
        //  1799   1806   3      8      Any
        //  1810   1817   1817   1818   Any
        //  1811   1817   3      8      Any
        //  1810   1817   1817   1818   Any
        //  1810   1817   3      8      Any
        //  1810   1817   1810   1811   Ljava/lang/NullPointerException;
        //  1867   1874   1874   1875   Any
        //  1867   1874   3      8      Ljava/lang/IllegalStateException;
        //  1867   1874   3      8      Ljava/lang/ClassCastException;
        //  1867   1874   1874   1875   Ljava/lang/ArithmeticException;
        //  1867   1874   1867   1868   Ljava/lang/EnumConstantNotPresentException;
        //  1927   1934   1934   1935   Any
        //  1927   1934   1934   1935   Ljava/lang/IllegalStateException;
        //  1928   1934   3      8      Ljava/lang/RuntimeException;
        //  1927   1934   1927   1928   Ljava/lang/RuntimeException;
        //  1927   1934   1934   1935   Any
        //  1941   1947   1947   1948   Any
        //  1941   1947   3      8      Any
        //  1941   1947   1947   1948   Any
        //  1941   1947   3      8      Any
        //  1941   1947   1947   1948   Ljava/lang/RuntimeException;
        //  1954   1961   1961   1962   Any
        //  1955   1961   1954   1955   Ljava/lang/IllegalStateException;
        //  1954   1961   3      8      Any
        //  1954   1961   3      8      Any
        //  1955   1961   1954   1955   Ljava/lang/ArithmeticException;
        //  2006   2013   2013   2014   Any
        //  2006   2013   2006   2007   Ljava/lang/NumberFormatException;
        //  2007   2013   2013   2014   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2006   2013   2013   2014   Any
        //  2007   2013   3      8      Any
        //  2017   2024   2024   2025   Any
        //  2017   2024   2017   2018   Any
        //  2017   2024   3      8      Any
        //  2017   2024   3      8      Ljava/lang/ArithmeticException;
        //  2018   2024   2024   2025   Any
        //  2077   2084   2084   2085   Any
        //  2077   2084   2077   2078   Ljava/lang/RuntimeException;
        //  2078   2084   2077   2078   Ljava/lang/UnsupportedOperationException;
        //  2078   2084   2084   2085   Any
        //  2078   2084   3      8      Any
        //  2090   2097   2097   2098   Any
        //  2090   2097   3      8      Any
        //  2090   2097   3      8      Any
        //  2091   2097   2097   2098   Ljava/lang/UnsupportedOperationException;
        //  2091   2097   2090   2091   Ljava/lang/NegativeArraySizeException;
        //  2145   2151   2151   2152   Any
        //  2145   2151   3      8      Ljava/lang/ArithmeticException;
        //  2145   2151   3      8      Any
        //  2145   2151   2151   2152   Any
        //  2145   2151   3      8      Any
        //  2155   2162   2162   2163   Any
        //  2156   2162   2155   2156   Ljava/lang/NullPointerException;
        //  2155   2162   3      8      Any
        //  2155   2162   2162   2163   Ljava/lang/UnsupportedOperationException;
        //  2156   2162   3      8      Any
        //  2170   2177   2177   2178   Any
        //  2170   2177   2177   2178   Ljava/lang/ArithmeticException;
        //  2170   2177   2170   2171   Any
        //  2171   2177   2170   2171   Any
        //  2171   2177   3      8      Any
        //  2227   2234   2234   2235   Any
        //  2227   2234   3      8      Any
        //  2228   2234   2227   2228   Any
        //  2227   2234   2234   2235   Ljava/lang/NullPointerException;
        //  2228   2234   2227   2228   Any
        //  2250   2257   2257   2258   Any
        //  2251   2257   2257   2258   Any
        //  2250   2257   2250   2251   Ljava/lang/AssertionError;
        //  2251   2257   2257   2258   Ljava/lang/StringIndexOutOfBoundsException;
        //  2250   2257   2250   2251   Ljava/lang/AssertionError;
        //  2365   2372   2372   2373   Any
        //  2365   2372   2365   2366   Any
        //  2366   2372   2365   2366   Any
        //  2366   2372   2365   2366   Ljava/lang/IllegalArgumentException;
        //  2366   2372   3      8      Ljava/lang/NullPointerException;
        //  2423   2430   2430   2431   Any
        //  2424   2430   2423   2424   Any
        //  2424   2430   3      8      Ljava/lang/IllegalStateException;
        //  2423   2430   2430   2431   Ljava/lang/RuntimeException;
        //  2424   2430   2423   2424   Ljava/lang/StringIndexOutOfBoundsException;
        //  2446   2453   2453   2454   Any
        //  2446   2453   3      8      Ljava/util/NoSuchElementException;
        //  2446   2453   2446   2447   Any
        //  2447   2453   3      8      Any
        //  2446   2453   2453   2454   Any
        //  2457   2464   2464   2465   Any
        //  2458   2464   2457   2458   Any
        //  2457   2464   2457   2458   Any
        //  2458   2464   3      8      Any
        //  2457   2464   2457   2458   Any
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
    
    public int d() {
        return fbS.bf(this, 480526742);
    }
    
    public void 1(final int n) {
        fbS.6v(this, 1457567341, n);
    }
}
