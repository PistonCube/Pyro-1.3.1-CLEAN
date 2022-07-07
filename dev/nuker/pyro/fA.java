// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class fa
{
    @NotNull
    public List<fa> c;
    @Nullable
    public String[] c;
    public static f9 c;
    
    @NotNull
    public List 1() {
        return fbS.gG(this, 1906986103);
    }
    
    public void c(@NotNull final String s) {
        fbS.9e(this, 1529986282, s);
    }
    
    static {
        fa.c = new f9(null);
    }
    
    @Nullable
    public String[] 0() {
        return fbS.7m(this, 1319032135);
    }
    
    public fa() {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = 769387887;
                    break Label_0013;
                }
                n = -1655121690;
            }
            switch (n ^ 0xA8C32BFC) {
                case -2061973869: {
                    continue;
                }
                case 899412762: {
                    this.c = new ArrayList<fa>();
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public int c() {
        return fbS.bs(this, 405192422);
    }
    
    public void c(@NotNull final List list) {
        fbS.fB(this, 2028513953, list);
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
        //     4: ifnull          2423
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2415
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2407
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fa.c:[Ljava/lang/String;
        //    28: dup            
        //    29: ifnonnull       87
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            43
        //    38: ldc             1622781959
        //    40: goto            45
        //    43: ldc             -1559246576
        //    45: ldc             -1421800325
        //    47: ixor           
        //    48: lookupswitch {
        //          -920677860: 43
        //          -872891268: 2372
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    83: goto            87
        //    86: athrow         
        //    87: arraylength    
        //    88: getstatic       dev/nuker/pyro/fc.c:I
        //    91: ifge            99
        //    94: ldc             1025884220
        //    96: goto            101
        //    99: ldc             1475729458
        //   101: ldc             -1781830289
        //   103: ixor           
        //   104: lookupswitch {
        //          -1460753069: 99
        //          -1036077731: 132
        //          default: 2364
        //        }
        //   132: aload_0        
        //   133: getstatic       dev/nuker/pyro/fc.1:I
        //   136: ifeq            144
        //   139: ldc             1556086775
        //   141: goto            146
        //   144: ldc             -1529835216
        //   146: ldc             -638368711
        //   148: ixor           
        //   149: lookupswitch {
        //          -2058568754: 2374
        //          1967375885: 144
        //          default: 176
        //        }
        //   176: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //   179: getstatic       dev/nuker/pyro/fc.c:I
        //   182: ifge            190
        //   185: ldc             -1207339388
        //   187: goto            192
        //   190: ldc             1270598586
        //   192: ldc             -1672185006
        //   194: ixor           
        //   195: lookupswitch {
        //          610078166: 2368
        //          1178302414: 190
        //          default: 220
        //        }
        //   220: goto            224
        //   223: athrow         
        //   224: invokeinterface java/util/List.size:()I
        //   229: goto            233
        //   232: athrow         
        //   233: iadd           
        //   234: iconst_1       
        //   235: if_icmple       243
        //   238: ldc             "\u252c"
        //   240: goto            245
        //   243: ldc             "\u2500"
        //   245: astore_1       
        //   246: iconst_0       
        //   247: getstatic       dev/nuker/pyro/fc.1:I
        //   250: ifeq            258
        //   253: ldc             732888057
        //   255: goto            260
        //   258: ldc             -861712220
        //   260: ldc             -317398722
        //   262: ixor           
        //   263: lookupswitch {
        //          -960881977: 258
        //          565686682: 288
        //          default: 2350
        //        }
        //   288: istore_2       
        //   289: aload_0        
        //   290: getstatic       dev/nuker/pyro/fc.0:I
        //   293: ifeq            301
        //   296: ldc             -1359912878
        //   298: goto            303
        //   301: ldc             681953500
        //   303: ldc             486141053
        //   305: ixor           
        //   306: lookupswitch {
        //          -1308062673: 301
        //          878453921: 332
        //          default: 2346
        //        }
        //   332: getfield        dev/nuker/pyro/fa.c:[Ljava/lang/String;
        //   335: dup            
        //   336: ifnonnull       350
        //   339: goto            343
        //   342: athrow         
        //   343: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   346: goto            350
        //   349: athrow         
        //   350: arraylength    
        //   351: istore_3       
        //   352: iload_2        
        //   353: getstatic       dev/nuker/pyro/fc.1:I
        //   356: ifeq            364
        //   359: ldc             -2085987955
        //   361: goto            366
        //   364: ldc             1282913084
        //   366: ldc             -749350177
        //   368: ixor           
        //   369: lookupswitch {
        //          587735219: 364
        //          1358924626: 2380
        //          default: 396
        //        }
        //   396: iload_3        
        //   397: if_icmpge       812
        //   400: aload_0        
        //   401: getfield        dev/nuker/pyro/fa.c:[Ljava/lang/String;
        //   404: dup            
        //   405: ifnonnull       463
        //   408: getstatic       dev/nuker/pyro/fc.c:I
        //   411: ifge            419
        //   414: ldc             -1607870329
        //   416: goto            421
        //   419: ldc             391400415
        //   421: ldc             -872330658
        //   423: ixor           
        //   424: lookupswitch {
        //          -364211693: 419
        //          1814598361: 2382
        //          default: 452
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   459: goto            463
        //   462: athrow         
        //   463: iload_2        
        //   464: aaload         
        //   465: astore          4
        //   467: aload_1        
        //   468: new             Ljava/lang/StringBuilder;
        //   471: dup            
        //   472: getstatic       dev/nuker/pyro/fc.c:I
        //   475: ifge            483
        //   478: ldc             824495549
        //   480: goto            485
        //   483: ldc             1571100151
        //   485: ldc             -1586114717
        //   487: ixor           
        //   488: lookupswitch {
        //          -1873739042: 2338
        //          1814907087: 483
        //          default: 516
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokespecial   java/lang/StringBuilder.<init>:()V
        //   523: goto            527
        //   526: athrow         
        //   527: swap           
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   535: goto            539
        //   538: athrow         
        //   539: getstatic       dev/nuker/pyro/fc.0:I
        //   542: ifeq            550
        //   545: ldc             1159705092
        //   547: goto            552
        //   550: ldc             674491274
        //   552: ldc             -12782093
        //   554: ixor           
        //   555: lookupswitch {
        //          -1857620430: 550
        //          -1172092937: 2340
        //          default: 580
        //        }
        //   580: iload_2        
        //   581: ifne            589
        //   584: ldc             ""
        //   586: goto            591
        //   589: ldc             "\u2502"
        //   591: goto            595
        //   594: athrow         
        //   595: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   598: goto            602
        //   601: athrow         
        //   602: getstatic       dev/nuker/pyro/fc.1:I
        //   605: ifeq            613
        //   608: ldc             -198156518
        //   610: goto            615
        //   613: ldc             1729069144
        //   615: ldc             2068586068
        //   617: ixor           
        //   618: lookupswitch {
        //          -1887682226: 2378
        //          -142623266: 613
        //          default: 644
        //        }
        //   644: aload           4
        //   646: goto            650
        //   649: athrow         
        //   650: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   653: goto            657
        //   656: athrow         
        //   657: iload_2        
        //   658: aload_0        
        //   659: getfield        dev/nuker/pyro/fa.c:[Ljava/lang/String;
        //   662: dup            
        //   663: ifnonnull       677
        //   666: goto            670
        //   669: athrow         
        //   670: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   673: goto            677
        //   676: athrow         
        //   677: arraylength    
        //   678: aload_0        
        //   679: getstatic       dev/nuker/pyro/fc.0:I
        //   682: ifeq            690
        //   685: ldc             1099613188
        //   687: goto            692
        //   690: ldc             826428275
        //   692: ldc             -1854415956
        //   694: ixor           
        //   695: lookupswitch {
        //          -1607102241: 720
        //          -788717656: 690
        //          default: 2388
        //        }
        //   720: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //   723: goto            727
        //   726: athrow         
        //   727: invokeinterface java/util/List.size:()I
        //   732: goto            736
        //   735: athrow         
        //   736: iadd           
        //   737: iconst_1       
        //   738: isub           
        //   739: if_icmpne       747
        //   742: ldc             -2076366365
        //   744: goto            749
        //   747: ldc             -2076366368
        //   749: ldc             -1914438182
        //   751: ixor           
        //   752: tableswitch {
        //          331196530: 776
        //          331196531: 781
        //          default: 742
        //        }
        //   776: ldc             ""
        //   778: goto            783
        //   781: ldc             "\n"
        //   783: goto            787
        //   786: athrow         
        //   787: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   790: goto            794
        //   793: athrow         
        //   794: goto            798
        //   797: athrow         
        //   798: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   801: goto            805
        //   804: athrow         
        //   805: astore_1       
        //   806: iinc            2, 1
        //   809: goto            352
        //   812: iconst_0       
        //   813: getstatic       dev/nuker/pyro/fc.1:I
        //   816: ifeq            824
        //   819: ldc             1641219146
        //   821: goto            826
        //   824: ldc             -1890680448
        //   826: ldc             -1923241306
        //   828: ixor           
        //   829: lookupswitch {
        //          -326193428: 824
        //          34810662: 856
        //          default: 2362
        //        }
        //   856: istore_2       
        //   857: aload_0        
        //   858: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //   861: checkcast       Ljava/util/Collection;
        //   864: getstatic       dev/nuker/pyro/fc.0:I
        //   867: ifeq            875
        //   870: ldc             -1855573046
        //   872: goto            877
        //   875: ldc             604690699
        //   877: ldc             -1890273097
        //   879: ixor           
        //   880: lookupswitch {
        //          -1419877956: 908
        //          506628989: 875
        //          default: 2334
        //        }
        //   908: goto            912
        //   911: athrow         
        //   912: invokeinterface java/util/Collection.size:()I
        //   917: goto            921
        //   920: athrow         
        //   921: istore_3       
        //   922: iload_2        
        //   923: iload_3        
        //   924: if_icmpge       932
        //   927: ldc             939627527
        //   929: goto            934
        //   932: ldc             939627524
        //   934: ldc             -2144451430
        //   936: ixor           
        //   937: tableswitch {
        //          1885315386: 960
        //          1885315387: 2284
        //          default: 927
        //        }
        //   960: aload_0        
        //   961: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //   964: iload_2        
        //   965: getstatic       dev/nuker/pyro/fc.c:I
        //   968: ifge            976
        //   971: ldc             -1374803871
        //   973: goto            978
        //   976: ldc             1195832660
        //   978: ldc             1471347168
        //   980: ixor           
        //   981: lookupswitch {
        //          -105066111: 976
        //          284429492: 1008
        //          default: 2352
        //        }
        //  1008: goto            1012
        //  1011: athrow         
        //  1012: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1017: goto            1021
        //  1020: athrow         
        //  1021: checkcast       Ldev/nuker/pyro/fa;
        //  1024: getstatic       dev/nuker/pyro/fc.c:I
        //  1027: ifge            1035
        //  1030: ldc             321110694
        //  1032: goto            1037
        //  1035: ldc             -1441989807
        //  1037: ldc             206069236
        //  1039: ixor           
        //  1040: lookupswitch {
        //          527146834: 2360
        //          997796346: 1035
        //          default: 1068
        //        }
        //  1068: astore          4
        //  1070: aload_1        
        //  1071: new             Ljava/lang/StringBuilder;
        //  1074: dup            
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: swap           
        //  1087: goto            1091
        //  1090: athrow         
        //  1091: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1094: goto            1098
        //  1097: athrow         
        //  1098: getstatic       dev/nuker/pyro/fc.1:I
        //  1101: ifeq            1109
        //  1104: ldc             332762734
        //  1106: goto            1111
        //  1109: ldc             -1792214868
        //  1111: ldc             517302822
        //  1113: ixor           
        //  1114: lookupswitch {
        //          -1946578294: 1140
        //          218162248: 1109
        //          default: 2354
        //        }
        //  1140: iload_2        
        //  1141: ifne            1172
        //  1144: aload_0        
        //  1145: getfield        dev/nuker/pyro/fa.c:[Ljava/lang/String;
        //  1148: dup            
        //  1149: ifnonnull       1163
        //  1152: goto            1156
        //  1155: athrow         
        //  1156: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1159: goto            1163
        //  1162: athrow         
        //  1163: arraylength    
        //  1164: ifne            1172
        //  1167: ldc             ""
        //  1169: goto            1245
        //  1172: iload_2        
        //  1173: aload_0        
        //  1174: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //  1177: getstatic       dev/nuker/pyro/fc.c:I
        //  1180: ifge            1188
        //  1183: ldc             -1015886042
        //  1185: goto            1190
        //  1188: ldc             -168389458
        //  1190: ldc             -1825617800
        //  1192: ixor           
        //  1193: lookupswitch {
        //          22643466: 1188
        //          1348306782: 2332
        //          default: 1220
        //        }
        //  1220: goto            1224
        //  1223: athrow         
        //  1224: invokeinterface java/util/List.size:()I
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: iconst_1       
        //  1234: isub           
        //  1235: if_icmpne       1243
        //  1238: ldc             "\u2514"
        //  1240: goto            1245
        //  1243: ldc             "\u251c"
        //  1245: getstatic       dev/nuker/pyro/fc.0:I
        //  1248: ifeq            1256
        //  1251: ldc             -824439689
        //  1253: goto            1258
        //  1256: ldc             1895285213
        //  1258: ldc             373119512
        //  1260: ixor           
        //  1261: lookupswitch {
        //          -656320913: 2348
        //          1160160618: 1256
        //          default: 1288
        //        }
        //  1288: goto            1292
        //  1291: athrow         
        //  1292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1295: goto            1299
        //  1298: athrow         
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1306: goto            1310
        //  1309: athrow         
        //  1310: astore_1       
        //  1311: getstatic       dev/nuker/pyro/fc.c:I
        //  1314: ifge            1322
        //  1317: ldc             1489057811
        //  1319: goto            1324
        //  1322: ldc             80536984
        //  1324: ldc             393046086
        //  1326: ixor           
        //  1327: lookupswitch {
        //          -1503438468: 1322
        //          1336692821: 2390
        //          default: 1352
        //        }
        //  1352: aload           4
        //  1354: goto            1358
        //  1357: athrow         
        //  1358: invokevirtual   dev/nuker/pyro/fa.toString:()Ljava/lang/String;
        //  1361: goto            1365
        //  1364: athrow         
        //  1365: checkcast       Ljava/lang/CharSequence;
        //  1368: iconst_1       
        //  1369: anewarray       Ljava/lang/String;
        //  1372: dup            
        //  1373: iconst_0       
        //  1374: ldc             "\n"
        //  1376: aastore        
        //  1377: iconst_0       
        //  1378: iconst_0       
        //  1379: bipush          6
        //  1381: aconst_null    
        //  1382: goto            1386
        //  1385: athrow         
        //  1386: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //  1389: goto            1393
        //  1392: athrow         
        //  1393: checkcast       Ljava/util/Collection;
        //  1396: getstatic       dev/nuker/pyro/fc.c:I
        //  1399: ifge            1407
        //  1402: ldc             -832928804
        //  1404: goto            1409
        //  1407: ldc             1214849663
        //  1409: ldc             -132771000
        //  1411: ixor           
        //  1412: lookupswitch {
        //          429418895: 1407
        //          910987412: 2384
        //          default: 1440
        //        }
        //  1440: astore          6
        //  1442: iconst_0       
        //  1443: istore          7
        //  1445: aload           6
        //  1447: astore          8
        //  1449: aload           8
        //  1451: iconst_0       
        //  1452: anewarray       Ljava/lang/String;
        //  1455: goto            1459
        //  1458: athrow         
        //  1459: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1464: goto            1468
        //  1467: athrow         
        //  1468: dup            
        //  1469: ifnonnull       1544
        //  1472: new             Lkotlin/TypeCastException;
        //  1475: dup            
        //  1476: ldc             "\u10e5\u1486\ub9ee\ue3cb\ua89e\udeee\ub225\ud5c1\u8978\u88a2\u9439\u1e0c\ud2e9\u95bc\ue06a\uba75\u57a5\u4419\ued37\ua151\u180d\uc234\u5942\u7d46\ub6c0\u0680\u7d66\ubaaf\ud01a\ued86\ub7a7\ufb72\u43c9\uca11\u7a88\uc269\u493c\ubb65\u9a97\u9e2e\u85df\u41fa\u8af5\ue318\u2d49\ub9ec\u7c7b\ufd2b\u2d49\u8b83\ud5e7\u1686"
        //  1478: goto            1482
        //  1481: athrow         
        //  1482: invokestatic    invokestatic   !!! ERROR
        //  1485: goto            1489
        //  1488: athrow         
        //  1489: getstatic       dev/nuker/pyro/fc.1:I
        //  1492: ifeq            1500
        //  1495: ldc             -949075981
        //  1497: goto            1502
        //  1500: ldc             542367777
        //  1502: ldc             -687304559
        //  1504: ixor           
        //  1505: lookupswitch {
        //          -145002320: 1532
        //          275165026: 1500
        //          default: 2330
        //        }
        //  1532: goto            1536
        //  1535: athrow         
        //  1536: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1539: goto            1543
        //  1542: athrow         
        //  1543: athrow         
        //  1544: checkcast       [Ljava/lang/String;
        //  1547: astore          5
        //  1549: iconst_0       
        //  1550: istore          6
        //  1552: aload           5
        //  1554: arraylength    
        //  1555: getstatic       dev/nuker/pyro/fc.c:I
        //  1558: ifge            1566
        //  1561: ldc             -867613046
        //  1563: goto            1568
        //  1566: ldc             -1844392160
        //  1568: ldc             1617126880
        //  1570: ixor           
        //  1571: lookupswitch {
        //          -1424601238: 1566
        //          -1406524566: 2396
        //          default: 1596
        //        }
        //  1596: istore          7
        //  1598: getstatic       dev/nuker/pyro/fc.0:I
        //  1601: ifeq            1609
        //  1604: ldc             -156916717
        //  1606: goto            1611
        //  1609: ldc             -1679752610
        //  1611: ldc_w           -1768373772
        //  1614: ixor           
        //  1615: lookupswitch {
        //          843968231: 1609
        //          1614636519: 2370
        //          default: 1640
        //        }
        //  1640: iload           6
        //  1642: getstatic       dev/nuker/pyro/fc.1:I
        //  1645: ifeq            1654
        //  1648: ldc_w           -1296918193
        //  1651: goto            1657
        //  1654: ldc_w           -719312049
        //  1657: ldc_w           -443586099
        //  1660: ixor           
        //  1661: lookupswitch {
        //          -47623066: 1654
        //          1463677058: 2356
        //          default: 1688
        //        }
        //  1688: iload           7
        //  1690: if_icmpge       2278
        //  1693: aload           5
        //  1695: iload           6
        //  1697: aaload         
        //  1698: astore          8
        //  1700: aload_1        
        //  1701: new             Ljava/lang/StringBuilder;
        //  1704: dup            
        //  1705: getstatic       dev/nuker/pyro/fc.1:I
        //  1708: ifeq            1717
        //  1711: ldc_w           -1756150494
        //  1714: goto            1720
        //  1717: ldc_w           1026847797
        //  1720: ldc_w           883601250
        //  1723: ixor           
        //  1724: lookupswitch {
        //          -2141578146: 1717
        //          -1543902656: 2366
        //          default: 1752
        //        }
        //  1752: goto            1756
        //  1755: athrow         
        //  1756: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1759: goto            1763
        //  1762: athrow         
        //  1763: swap           
        //  1764: getstatic       dev/nuker/pyro/fc.1:I
        //  1767: ifeq            1776
        //  1770: ldc_w           -2035443579
        //  1773: goto            1779
        //  1776: ldc_w           1404811455
        //  1779: ldc_w           -836583687
        //  1782: ixor           
        //  1783: lookupswitch {
        //          -515488901: 1776
        //          1217341052: 2358
        //          default: 1808
        //        }
        //  1808: goto            1812
        //  1811: athrow         
        //  1812: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1815: goto            1819
        //  1818: athrow         
        //  1819: new             Ljava/lang/StringBuilder;
        //  1822: dup            
        //  1823: goto            1827
        //  1826: athrow         
        //  1827: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1830: goto            1834
        //  1833: athrow         
        //  1834: ldc_w           "\u1081\u14d3\ub9a2\ue387\ua89e\udead\ub264\ud58f\u8936\u88ed\u946d\u1e0c\ud2ab\u95f9\ue06a\uba36\u57e4\u444a\ued63\ua151\u1859"
        //  1837: goto            1841
        //  1840: athrow         
        //  1841: invokestatic    invokestatic   !!! ERROR
        //  1844: goto            1848
        //  1847: athrow         
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1855: goto            1859
        //  1858: athrow         
        //  1859: iload           6
        //  1861: ifne            1869
        //  1864: ldc             ""
        //  1866: goto            2086
        //  1869: getstatic       dev/nuker/pyro/fc.c:I
        //  1872: ifge            1881
        //  1875: ldc_w           429143249
        //  1878: goto            1884
        //  1881: ldc_w           429093670
        //  1884: ldc_w           -1093719645
        //  1887: ixor           
        //  1888: lookupswitch {
        //          -1487200910: 2344
        //          -1123178449: 1881
        //          default: 1916
        //        }
        //  1916: iload_2        
        //  1917: getstatic       dev/nuker/pyro/fc.0:I
        //  1920: ifeq            1929
        //  1923: ldc_w           554376459
        //  1926: goto            1932
        //  1929: ldc_w           771866600
        //  1932: ldc_w           1652436648
        //  1935: ixor           
        //  1936: lookupswitch {
        //          1131754403: 2376
        //          1141168299: 1929
        //          default: 1964
        //        }
        //  1964: aload_0        
        //  1965: getstatic       dev/nuker/pyro/fc.0:I
        //  1968: ifeq            1977
        //  1971: ldc_w           -1520038985
        //  1974: goto            1980
        //  1977: ldc_w           1857064230
        //  1980: ldc_w           -1801178067
        //  1983: ixor           
        //  1984: lookupswitch {
        //          -99305205: 2012
        //          834813850: 1977
        //          default: 2386
        //        }
        //  2012: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //  2015: getstatic       dev/nuker/pyro/fc.1:I
        //  2018: ifeq            2027
        //  2021: ldc_w           1478532588
        //  2024: goto            2030
        //  2027: ldc_w           580496771
        //  2030: ldc_w           -1181124424
        //  2033: ixor           
        //  2034: lookupswitch {
        //          -1694444229: 2060
        //          -507910828: 2027
        //          default: 2342
        //        }
        //  2060: goto            2064
        //  2063: athrow         
        //  2064: invokeinterface java/util/List.size:()I
        //  2069: goto            2073
        //  2072: athrow         
        //  2073: iconst_1       
        //  2074: isub           
        //  2075: if_icmpne       2084
        //  2078: ldc_w           " "
        //  2081: goto            2086
        //  2084: ldc             "\u2502"
        //  2086: goto            2090
        //  2089: athrow         
        //  2090: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2093: goto            2097
        //  2096: athrow         
        //  2097: aload           8
        //  2099: goto            2103
        //  2102: athrow         
        //  2103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2106: goto            2110
        //  2109: athrow         
        //  2110: ldc_w           "\u1081\u14d3\ub9a2\ue387\ua89e\udead\ub264\ud58f\u8936\u88ed\u946d\u1e0c\ud2ab\u95f9\ue06a\uba36\u57e4\u444a\ued63\ua151\u1859\uc251\u5942\u7d08\ub68f\u06ce\u7d6b\ubae1\ud04f\uedca\ub7eb\ufb72\u439d\uca48\u7ad8\uc22c\u493c\ubb2e\u9ad8\u9e7a\u8593\u41b3"
        //  2113: getstatic       dev/nuker/pyro/fc.1:I
        //  2116: ifeq            2125
        //  2119: ldc_w           -1347390590
        //  2122: goto            2128
        //  2125: ldc_w           1912794390
        //  2128: ldc_w           -2118849440
        //  2131: ixor           
        //  2132: lookupswitch {
        //          -255971332: 2125
        //          772055010: 2392
        //          default: 2160
        //        }
        //  2160: goto            2164
        //  2163: athrow         
        //  2164: invokestatic    invokestatic   !!! ERROR
        //  2167: goto            2171
        //  2170: athrow         
        //  2171: getstatic       dev/nuker/pyro/fc.1:I
        //  2174: ifeq            2183
        //  2177: ldc_w           276943274
        //  2180: goto            2186
        //  2183: ldc_w           -653636552
        //  2186: ldc_w           306964569
        //  2189: ixor           
        //  2190: lookupswitch {
        //          -884890527: 2216
        //          46807539: 2183
        //          default: 2394
        //        }
        //  2216: goto            2220
        //  2219: athrow         
        //  2220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2223: goto            2227
        //  2226: athrow         
        //  2227: goto            2231
        //  2230: athrow         
        //  2231: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2234: goto            2238
        //  2237: athrow         
        //  2238: goto            2242
        //  2241: athrow         
        //  2242: invokestatic    kotlin/text/StringsKt.trimIndent:(Ljava/lang/String;)Ljava/lang/String;
        //  2245: goto            2249
        //  2248: athrow         
        //  2249: goto            2253
        //  2252: athrow         
        //  2253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2256: goto            2260
        //  2259: athrow         
        //  2260: goto            2264
        //  2263: athrow         
        //  2264: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2267: goto            2271
        //  2270: athrow         
        //  2271: astore_1       
        //  2272: iinc            6, 1
        //  2275: goto            1598
        //  2278: iinc            2, 1
        //  2281: goto            922
        //  2284: getstatic       dev/nuker/pyro/fc.0:I
        //  2287: ifeq            2296
        //  2290: ldc_w           -34815231
        //  2293: goto            2299
        //  2296: ldc_w           -1578639292
        //  2299: ldc_w           224907959
        //  2302: ixor           
        //  2303: lookupswitch {
        //          -259321418: 2336
        //          1571345152: 2296
        //          default: 2328
        //        }
        //  2328: aload_1        
        //  2329: areturn        
        //  2330: aconst_null    
        //  2331: athrow         
        //  2332: aconst_null    
        //  2333: athrow         
        //  2334: aconst_null    
        //  2335: athrow         
        //  2336: aconst_null    
        //  2337: athrow         
        //  2338: aconst_null    
        //  2339: athrow         
        //  2340: aconst_null    
        //  2341: athrow         
        //  2342: aconst_null    
        //  2343: athrow         
        //  2344: aconst_null    
        //  2345: athrow         
        //  2346: aconst_null    
        //  2347: athrow         
        //  2348: aconst_null    
        //  2349: athrow         
        //  2350: aconst_null    
        //  2351: athrow         
        //  2352: aconst_null    
        //  2353: athrow         
        //  2354: aconst_null    
        //  2355: athrow         
        //  2356: aconst_null    
        //  2357: athrow         
        //  2358: aconst_null    
        //  2359: athrow         
        //  2360: aconst_null    
        //  2361: athrow         
        //  2362: aconst_null    
        //  2363: athrow         
        //  2364: aconst_null    
        //  2365: athrow         
        //  2366: aconst_null    
        //  2367: athrow         
        //  2368: aconst_null    
        //  2369: athrow         
        //  2370: aconst_null    
        //  2371: athrow         
        //  2372: aconst_null    
        //  2373: athrow         
        //  2374: aconst_null    
        //  2375: athrow         
        //  2376: aconst_null    
        //  2377: athrow         
        //  2378: aconst_null    
        //  2379: athrow         
        //  2380: aconst_null    
        //  2381: athrow         
        //  2382: aconst_null    
        //  2383: athrow         
        //  2384: aconst_null    
        //  2385: athrow         
        //  2386: aconst_null    
        //  2387: athrow         
        //  2388: aconst_null    
        //  2389: athrow         
        //  2390: aconst_null    
        //  2391: athrow         
        //  2392: aconst_null    
        //  2393: athrow         
        //  2394: aconst_null    
        //  2395: athrow         
        //  2396: aconst_null    
        //  2397: athrow         
        //  2398: pop            
        //  2399: goto            24
        //  2402: pop            
        //  2403: aconst_null    
        //  2404: goto            2398
        //  2407: dup            
        //  2408: ifnull          2398
        //  2411: checkcast       Ljava/lang/Throwable;
        //  2414: athrow         
        //  2415: dup            
        //  2416: ifnull          2402
        //  2419: checkcast       Ljava/lang/Throwable;
        //  2422: athrow         
        //  2423: aconst_null    
        //  2424: athrow         
        //    StackMapTable: 01 48 43 07 00 6D 04 FF 00 0B 00 00 00 01 07 00 6D FC 00 03 07 00 03 52 07 00 FA FF 00 01 00 01 07 00 03 00 02 07 00 FA 01 5E 07 00 FA FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 01 07 00 03 00 01 07 00 FA 45 07 00 6D 40 07 00 FA 4B 01 FF 00 01 00 01 07 00 03 00 02 01 01 5E 01 FF 00 0B 00 01 07 00 03 00 02 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 01 07 00 03 FF 00 0D 00 01 07 00 03 00 02 01 07 00 3B FF 00 01 00 01 07 00 03 00 03 01 07 00 3B 01 FF 00 1B 00 01 07 00 03 00 02 01 07 00 3B FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 01 07 00 03 00 02 01 07 00 3B 47 07 00 6D FF 00 00 00 01 07 00 03 00 02 01 01 09 41 07 00 DE FF 00 0C 00 02 07 00 03 07 00 DE 00 01 01 FF 00 01 00 02 07 00 03 07 00 DE 00 02 01 01 5B 01 FF 00 0C 00 03 07 00 03 07 00 DE 01 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 DE 01 00 02 07 00 03 01 5C 07 00 03 49 07 00 6D 40 07 00 FA 45 07 00 6D 40 07 00 FA FC 00 01 01 4B 01 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 01 01 5D 01 56 07 00 FA FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 FA 01 5E 07 00 FA 42 07 00 6D 40 07 00 FA 45 07 00 6D 40 07 00 FA FF 00 13 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 DE 08 01 D4 08 01 D4 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 DE 08 01 D4 08 01 D4 01 FF 00 1E 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 DE 08 01 D4 08 01 D4 FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 DE 08 01 D4 08 01 D4 45 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 DE 07 00 97 43 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 4A 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 01 5B 07 00 97 48 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 42 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 4A 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 01 5C 07 00 97 44 07 00 4D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 4B 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 97 01 07 00 FA 45 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 97 01 07 00 FA FF 00 0C 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 97 01 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 05 07 00 97 01 01 07 00 03 01 FF 00 1B 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 97 01 01 07 00 03 45 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 97 01 01 07 00 3B 47 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 97 01 01 01 45 07 00 97 44 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 01 5A 07 00 97 44 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 42 07 00 5F FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 42 07 00 59 40 07 00 97 45 07 00 6D 40 07 00 DE FA 00 06 4B 01 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 01 01 5D 01 52 07 00 B8 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 B8 01 5E 07 00 B8 42 07 00 4D 40 07 00 B8 47 07 00 6D 40 01 00 04 04 41 01 19 FF 00 0F 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 3B 01 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 03 07 00 3B 01 01 FF 00 1D 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 3B 01 42 07 00 6D FF 00 00 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 3B 01 47 07 00 6D 40 07 00 05 4D 07 00 03 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 03 01 5E 07 00 03 FF 00 09 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 01 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 DE 08 04 2F 08 04 2F 45 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 DE 07 00 97 43 07 00 5B FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 4A 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 01 5C 07 00 97 4E 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 FA 45 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 FA 48 07 00 97 FF 00 0F 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 01 07 00 3B FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 04 07 00 97 01 07 00 3B 01 FF 00 1D 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 01 07 00 3B 42 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 01 07 00 3B 47 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 01 01 49 07 00 97 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE FF 00 0A 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 07 00 DE 01 FF 00 1D 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 42 07 00 6D 40 07 00 97 45 07 00 6D 40 07 00 DE 0B 41 01 1B 44 07 00 6D 40 07 00 03 45 07 00 6D 40 07 00 DE 53 07 00 4D FF 00 00 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 06 07 00 DC 07 00 FA 01 01 01 05 45 07 00 6D 40 07 00 3B 4D 07 00 B8 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 B8 01 5E 07 00 B8 FF 00 11 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 01 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 02 07 00 B8 07 00 FA 47 07 00 6D 40 07 01 29 4C 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE FF 00 0A 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 05 07 01 29 08 05 C0 08 05 C0 07 00 DE 01 FF 00 1D 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 02 07 01 29 07 00 ED 40 07 01 29 FF 00 15 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 B8 00 01 01 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 B8 00 02 01 01 5B 01 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 05 00 00 0A 41 01 1C 4D 01 FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 05 00 02 01 01 5E 01 FF 00 1C 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 DE 08 06 A5 08 06 A5 FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 DE 08 06 A5 08 06 A5 01 FF 00 1F 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 DE 08 06 A5 08 06 A5 42 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 DE 08 06 A5 08 06 A5 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 DE 07 00 97 FF 00 0C 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 DE 01 FF 00 1C 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 42 07 00 4D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 46 07 00 4F FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 08 07 1B 08 07 1B 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 42 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 09 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 0B 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 01 FF 00 1F 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 0C 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 01 FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 01 FF 00 1F 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 01 FF 00 0C 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 03 FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 05 07 00 97 07 00 97 01 07 00 03 01 FF 00 1F 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 03 FF 00 0E 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 3B FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 05 07 00 97 07 00 97 01 07 00 3B 01 FF 00 1D 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 3B FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 3B 47 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 01 FF 00 0A 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 42 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 04 00 00 00 01 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 0E 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 07 00 DE 01 FF 00 1F 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 42 07 00 65 FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE FF 00 0B 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE FF 00 02 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 07 00 DE 01 FF 00 1D 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 42 07 00 4F FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 42 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 42 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 42 07 00 63 FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE 45 07 00 6D 40 07 00 97 FF 00 02 00 00 00 01 07 00 6D FF 00 00 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 01 07 00 97 45 07 00 6D 40 07 00 DE FF 00 06 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 05 00 00 FF 00 05 00 04 07 00 03 07 00 DE 01 01 00 00 0B 42 01 1C FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 00 07 00 B8 01 07 00 B8 00 04 07 01 29 08 05 C0 08 05 C0 07 00 DE FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 03 07 00 97 01 07 00 3B FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 01 07 00 B8 01 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 03 07 00 DE 08 01 D4 08 01 D4 41 07 00 97 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 3B FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 97 FF 00 01 00 03 07 00 03 07 00 DE 01 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 02 07 00 97 07 00 DE FF 00 01 00 02 07 00 03 07 00 DE 00 01 01 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 02 07 00 3B 01 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 01 07 00 97 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 05 00 01 01 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 02 07 00 97 07 00 DE FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 01 07 00 03 41 01 FF 00 01 00 01 07 00 03 00 01 01 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 DE 08 06 A5 08 06 A5 FF 00 01 00 01 07 00 03 00 02 01 07 00 3B FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 05 00 00 FF 00 01 00 01 07 00 03 00 01 07 00 FA FF 00 01 00 01 07 00 03 00 02 01 07 00 03 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 01 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 01 07 00 97 FF 00 01 00 04 07 00 03 07 00 DE 01 01 00 01 01 41 07 00 FA FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 01 07 00 B8 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 04 07 00 97 07 00 97 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 DE 00 04 07 00 97 01 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 DE 01 01 07 00 03 00 00 FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 DE 00 03 07 00 97 07 00 97 07 00 DE FF 00 01 00 09 07 00 03 07 00 DE 01 01 07 00 03 07 00 FA 01 01 07 00 B8 00 01 01 FF 00 01 00 01 07 00 03 00 01 07 00 6D 43 05 44 07 00 6D 47 05 47 07 00 6D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2407   2415   Any
        //  2407   2415   2407   2415   Ljava/lang/RuntimeException;
        //  2423   2425   3      8      Ljava/lang/RuntimeException;
        //  80     86     86     87     Any
        //  80     86     3      8      Ljava/lang/NullPointerException;
        //  80     86     86     87     Ljava/util/ConcurrentModificationException;
        //  80     86     86     87     Ljava/util/NoSuchElementException;
        //  80     86     86     87     Any
        //  224    232    232    233    Any
        //  224    232    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  224    232    232    233    Ljava/lang/UnsupportedOperationException;
        //  224    232    3      8      Any
        //  224    232    232    233    Ljava/lang/ClassCastException;
        //  342    349    349    350    Any
        //  343    349    3      8      Any
        //  343    349    342    343    Any
        //  343    349    349    350    Any
        //  342    349    342    343    Any
        //  455    462    462    463    Any
        //  456    462    455    456    Any
        //  455    462    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  455    462    455    456    Any
        //  455    462    455    456    Any
        //  520    526    526    527    Any
        //  520    526    3      8      Any
        //  520    526    526    527    Any
        //  520    526    3      8      Any
        //  520    526    3      8      Any
        //  531    538    538    539    Any
        //  531    538    538    539    Ljava/lang/RuntimeException;
        //  532    538    3      8      Ljava/lang/RuntimeException;
        //  531    538    538    539    Any
        //  531    538    531    532    Any
        //  594    601    601    602    Any
        //  594    601    601    602    Any
        //  594    601    594    595    Ljava/util/NoSuchElementException;
        //  595    601    594    595    Any
        //  595    601    594    595    Any
        //  649    656    656    657    Any
        //  649    656    656    657    Any
        //  649    656    656    657    Any
        //  649    656    656    657    Any
        //  650    656    649    650    Ljava/lang/RuntimeException;
        //  669    676    676    677    Any
        //  669    676    676    677    Ljava/lang/RuntimeException;
        //  669    676    3      8      Ljava/util/NoSuchElementException;
        //  670    676    669    670    Ljava/lang/NegativeArraySizeException;
        //  669    676    669    670    Any
        //  726    735    735    736    Any
        //  726    735    735    736    Ljava/lang/ClassCastException;
        //  727    735    726    727    Ljava/lang/NullPointerException;
        //  727    735    735    736    Ljava/lang/ClassCastException;
        //  726    735    726    727    Any
        //  786    793    793    794    Any
        //  787    793    793    794    Ljava/lang/NegativeArraySizeException;
        //  786    793    786    787    Ljava/lang/ArithmeticException;
        //  787    793    793    794    Ljava/util/NoSuchElementException;
        //  786    793    793    794    Any
        //  797    804    804    805    Any
        //  797    804    3      8      Ljava/lang/ArithmeticException;
        //  798    804    3      8      Any
        //  797    804    797    798    Ljava/lang/ClassCastException;
        //  798    804    3      8      Ljava/lang/NullPointerException;
        //  911    920    920    921    Any
        //  911    920    3      8      Any
        //  912    920    911    912    Ljava/lang/RuntimeException;
        //  911    920    3      8      Any
        //  911    920    920    921    Ljava/lang/IllegalArgumentException;
        //  1011   1020   1020   1021   Any
        //  1012   1020   1011   1012   Ljava/lang/IllegalArgumentException;
        //  1011   1020   1011   1012   Any
        //  1011   1020   1011   1012   Ljava/lang/IllegalStateException;
        //  1012   1020   3      8      Any
        //  1078   1085   1085   1086   Any
        //  1079   1085   1085   1086   Ljava/lang/IndexOutOfBoundsException;
        //  1079   1085   3      8      Any
        //  1078   1085   1078   1079   Any
        //  1078   1085   1085   1086   Ljava/lang/ClassCastException;
        //  1090   1097   1097   1098   Any
        //  1091   1097   3      8      Ljava/util/ConcurrentModificationException;
        //  1090   1097   1090   1091   Ljava/lang/EnumConstantNotPresentException;
        //  1090   1097   3      8      Ljava/lang/IllegalStateException;
        //  1091   1097   3      8      Any
        //  1155   1162   1162   1163   Any
        //  1155   1162   1155   1156   Ljava/lang/StringIndexOutOfBoundsException;
        //  1156   1162   1155   1156   Any
        //  1155   1162   1155   1156   Any
        //  1155   1162   3      8      Ljava/lang/UnsupportedOperationException;
        //  1223   1232   1232   1233   Any
        //  1224   1232   1232   1233   Any
        //  1223   1232   1232   1233   Any
        //  1223   1232   1223   1224   Any
        //  1223   1232   1232   1233   Any
        //  1292   1298   1298   1299   Any
        //  1292   1298   1298   1299   Ljava/lang/NullPointerException;
        //  1292   1298   3      8      Any
        //  1292   1298   1298   1299   Any
        //  1292   1298   1298   1299   Any
        //  1302   1309   1309   1310   Any
        //  1303   1309   1302   1303   Any
        //  1302   1309   1309   1310   Ljava/util/NoSuchElementException;
        //  1303   1309   1309   1310   Any
        //  1303   1309   1302   1303   Ljava/lang/NumberFormatException;
        //  1357   1364   1364   1365   Any
        //  1357   1364   3      8      Any
        //  1358   1364   1364   1365   Any
        //  1358   1364   3      8      Ljava/lang/ArithmeticException;
        //  1357   1364   1357   1358   Any
        //  1385   1392   1392   1393   Any
        //  1385   1392   1385   1386   Ljava/lang/ClassCastException;
        //  1385   1392   1392   1393   Ljava/lang/StringIndexOutOfBoundsException;
        //  1386   1392   1385   1386   Ljava/lang/IndexOutOfBoundsException;
        //  1385   1392   3      8      Ljava/lang/RuntimeException;
        //  1458   1467   1467   1468   Any
        //  1458   1467   1467   1468   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1459   1467   1458   1459   Ljava/util/NoSuchElementException;
        //  1458   1467   1458   1459   Any
        //  1458   1467   1467   1468   Ljava/lang/NegativeArraySizeException;
        //  1481   1488   1488   1489   Any
        //  1482   1488   3      8      Any
        //  1481   1488   1481   1482   Any
        //  1481   1488   1481   1482   Any
        //  1481   1488   1488   1489   Any
        //  1536   1542   1542   1543   Any
        //  1536   1542   1542   1543   Any
        //  1536   1542   1542   1543   Ljava/lang/RuntimeException;
        //  1536   1542   3      8      Ljava/lang/IllegalStateException;
        //  1536   1542   1542   1543   Any
        //  1755   1762   1762   1763   Any
        //  1756   1762   3      8      Any
        //  1756   1762   1762   1763   Any
        //  1756   1762   1755   1756   Any
        //  1756   1762   1755   1756   Any
        //  1811   1818   1818   1819   Any
        //  1811   1818   1811   1812   Ljava/lang/NumberFormatException;
        //  1812   1818   1818   1819   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1811   1818   1811   1812   Ljava/lang/IndexOutOfBoundsException;
        //  1812   1818   3      8      Ljava/lang/NumberFormatException;
        //  1826   1833   1833   1834   Any
        //  1827   1833   3      8      Ljava/lang/UnsupportedOperationException;
        //  1826   1833   3      8      Ljava/lang/RuntimeException;
        //  1827   1833   1826   1827   Ljava/lang/NullPointerException;
        //  1826   1833   3      8      Ljava/lang/IllegalArgumentException;
        //  1840   1847   1847   1848   Any
        //  1841   1847   1847   1848   Ljava/lang/ClassCastException;
        //  1841   1847   1840   1841   Any
        //  1841   1847   3      8      Ljava/lang/UnsupportedOperationException;
        //  1841   1847   1847   1848   Any
        //  1851   1858   1858   1859   Any
        //  1851   1858   3      8      Ljava/lang/IllegalArgumentException;
        //  1852   1858   1851   1852   Any
        //  1851   1858   3      8      Any
        //  1851   1858   1858   1859   Ljava/lang/NegativeArraySizeException;
        //  2064   2072   2072   2073   Any
        //  2064   2072   3      8      Ljava/lang/UnsupportedOperationException;
        //  2064   2072   3      8      Any
        //  2064   2072   2072   2073   Any
        //  2064   2072   2072   2073   Ljava/util/NoSuchElementException;
        //  2089   2096   2096   2097   Any
        //  2089   2096   3      8      Ljava/lang/IllegalStateException;
        //  2090   2096   2089   2090   Any
        //  2089   2096   2089   2090   Ljava/lang/ClassCastException;
        //  2090   2096   2096   2097   Ljava/lang/NullPointerException;
        //  2103   2109   2109   2110   Any
        //  2103   2109   2109   2110   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2103   2109   3      8      Ljava/lang/RuntimeException;
        //  2103   2109   2109   2110   Ljava/lang/UnsupportedOperationException;
        //  2103   2109   2109   2110   Ljava/lang/ArithmeticException;
        //  2163   2170   2170   2171   Any
        //  2164   2170   2163   2164   Ljava/lang/IndexOutOfBoundsException;
        //  2164   2170   3      8      Any
        //  2164   2170   2170   2171   Any
        //  2164   2170   3      8      Any
        //  2219   2226   2226   2227   Any
        //  2220   2226   2226   2227   Any
        //  2219   2226   2219   2220   Ljava/lang/NullPointerException;
        //  2219   2226   2226   2227   Ljava/util/ConcurrentModificationException;
        //  2219   2226   2226   2227   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2230   2237   2237   2238   Any
        //  2231   2237   2230   2231   Any
        //  2231   2237   2237   2238   Any
        //  2230   2237   3      8      Ljava/lang/RuntimeException;
        //  2230   2237   3      8      Any
        //  2241   2248   2248   2249   Any
        //  2241   2248   2248   2249   Any
        //  2241   2248   2241   2242   Ljava/lang/ArithmeticException;
        //  2242   2248   2241   2242   Any
        //  2242   2248   3      8      Any
        //  2252   2259   2259   2260   Any
        //  2252   2259   3      8      Any
        //  2252   2259   3      8      Any
        //  2252   2259   2252   2253   Ljava/lang/IllegalStateException;
        //  2252   2259   3      8      Any
        //  2264   2270   2270   2271   Any
        //  2264   2270   2270   2271   Ljava/lang/EnumConstantNotPresentException;
        //  2264   2270   3      8      Ljava/util/NoSuchElementException;
        //  2264   2270   3      8      Ljava/lang/UnsupportedOperationException;
        //  2264   2270   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void c(@Nullable final String[] c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    Label_0026: {
                        break Label_0026;
                        while (true) {
                            try {
                                o = null;
                                if (fc.0 > 0) {
                                    continue Label_0039;
                                }
                                null;
                                this.c = c;
                                return;
                                continue;
                            }
                            catch (NumberFormatException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(@NotNull final fa p0) {
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
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            63
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            55
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/fa.c:Ljava/util/List;
        //    30: aload_1        
        //    31: goto            35
        //    34: athrow         
        //    35: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    40: goto            44
        //    43: athrow         
        //    44: pop            
        //    45: return         
        //    46: pop            
        //    47: goto            24
        //    50: pop            
        //    51: aconst_null    
        //    52: goto            46
        //    55: dup            
        //    56: ifnull          46
        //    59: checkcast       Ljava/lang/Throwable;
        //    62: athrow         
        //    63: dup            
        //    64: ifnull          50
        //    67: checkcast       Ljava/lang/Throwable;
        //    70: athrow         
        //    71: nop            
        //    72: athrow         
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 6D 43 07 00 6D FD 00 00 07 00 03 07 00 03 FF 00 0B 00 00 00 01 07 00 6D FD 00 03 07 00 03 07 00 03 49 07 00 6D FF 00 00 00 02 07 00 03 07 00 03 00 02 07 00 3B 07 00 03 47 07 00 6D 40 01 41 07 00 6D 43 05 44 07 00 6D 47 05 FF 00 07 00 00 00 01 07 00 6D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     55     63     Any
        //  55     63     55     63     Any
        //  34     43     43     44     Any
        //  35     43     43     44     Ljava/lang/StringIndexOutOfBoundsException;
        //  34     43     34     35     Any
        //  34     43     34     35     Any
        //  35     43     34     35     Any
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
}
