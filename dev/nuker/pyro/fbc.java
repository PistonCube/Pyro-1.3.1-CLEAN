// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.BlockPos;

public class fbC extends fbk
{
    public fbN c;
    public fbB c;
    
    public boolean 0(final BlockPos p0, final boolean p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2790
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2782
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2774
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //    32: goto            36
        //    35: athrow         
        //    36: ifne            41
        //    39: iconst_0       
        //    40: ireturn        
        //    41: new             Lnet/minecraft/util/math/Vec3d;
        //    44: dup            
        //    45: getstatic       dev/nuker/pyro/fc.1:I
        //    48: ifeq            56
        //    51: ldc             1417684270
        //    53: goto            58
        //    56: ldc             1612145319
        //    58: ldc             -945151111
        //    60: ixor           
        //    61: lookupswitch {
        //          -1825962409: 56
        //          -1480769058: 88
        //          default: 2737
        //        }
        //    88: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //    91: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    94: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    97: getstatic       dev/nuker/pyro/fc.0:I
        //   100: ifeq            108
        //   103: ldc             900964260
        //   105: goto            110
        //   108: ldc             -866569535
        //   110: ldc             -1008102020
        //   112: ixor           
        //   113: lookupswitch {
        //          -161871144: 2711
        //          202799891: 108
        //          default: 140
        //        }
        //   140: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //   143: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   146: getstatic       dev/nuker/pyro/fc.1:I
        //   149: ifeq            157
        //   152: ldc             1191498846
        //   154: goto            159
        //   157: ldc             -1580202036
        //   159: ldc             652697316
        //   161: ixor           
        //   162: lookupswitch {
        //          -2026415832: 188
        //          1642302138: 157
        //          default: 2725
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   195: goto            199
        //   198: athrow         
        //   199: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   202: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //   205: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   208: goto            212
        //   211: athrow         
        //   212: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   215: goto            219
        //   218: athrow         
        //   219: f2d            
        //   220: dadd           
        //   221: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //   224: getstatic       dev/nuker/pyro/fc.1:I
        //   227: ifeq            235
        //   230: ldc             1902766756
        //   232: goto            237
        //   235: ldc             1413034010
        //   237: ldc             451039326
        //   239: ixor           
        //   240: lookupswitch {
        //          806254787: 235
        //          1804319482: 2757
        //          default: 268
        //        }
        //   268: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   271: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   274: goto            278
        //   277: athrow         
        //   278: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   281: goto            285
        //   284: athrow         
        //   285: astore          4
        //   287: aconst_null    
        //   288: astore          5
        //   290: goto            294
        //   293: athrow         
        //   294: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //   297: goto            301
        //   300: athrow         
        //   301: astore          6
        //   303: getstatic       dev/nuker/pyro/fc.1:I
        //   306: ifeq            314
        //   309: ldc             -404780753
        //   311: goto            316
        //   314: ldc             1708892970
        //   316: ldc             -1932961460
        //   318: ixor           
        //   319: lookupswitch {
        //          504770207: 314
        //          1796657251: 2701
        //          default: 344
        //        }
        //   344: aload           6
        //   346: arraylength    
        //   347: getstatic       dev/nuker/pyro/fc.0:I
        //   350: ifeq            358
        //   353: ldc             1509657638
        //   355: goto            360
        //   358: ldc             475754572
        //   360: ldc             -1388430727
        //   362: ixor           
        //   363: lookupswitch {
        //          -1318761931: 388
        //          -188369313: 358
        //          default: 2695
        //        }
        //   388: istore          7
        //   390: iconst_0       
        //   391: getstatic       dev/nuker/pyro/fc.1:I
        //   394: ifeq            402
        //   397: ldc             -1960944703
        //   399: goto            404
        //   402: ldc             89993816
        //   404: ldc             -610667647
        //   406: ixor           
        //   407: lookupswitch {
        //          -557530663: 432
        //          1351067712: 402
        //          default: 2693
        //        }
        //   432: istore          8
        //   434: getstatic       dev/nuker/pyro/fc.0:I
        //   437: ifeq            445
        //   440: ldc             -1592476004
        //   442: goto            447
        //   445: ldc             -1762483319
        //   447: ldc             -445672190
        //   449: ixor           
        //   450: lookupswitch {
        //          1148922782: 2717
        //          2042520664: 445
        //          default: 476
        //        }
        //   476: iload           8
        //   478: getstatic       dev/nuker/pyro/fc.c:I
        //   481: ifge            489
        //   484: ldc             -699817802
        //   486: goto            491
        //   489: ldc             645799034
        //   491: ldc             1241805387
        //   493: ixor           
        //   494: lookupswitch {
        //          -1672621315: 489
        //          1819962929: 520
        //          default: 2731
        //        }
        //   520: iload           7
        //   522: if_icmpge       2604
        //   525: getstatic       dev/nuker/pyro/fc.c:I
        //   528: ifge            536
        //   531: ldc             598802537
        //   533: goto            538
        //   536: ldc             -193338245
        //   538: ldc             -2073929411
        //   540: ixor           
        //   541: lookupswitch {
        //          -1479321260: 536
        //          1880866118: 568
        //          default: 2713
        //        }
        //   568: aload           6
        //   570: getstatic       dev/nuker/pyro/fc.0:I
        //   573: ifeq            581
        //   576: ldc             964321851
        //   578: goto            583
        //   581: ldc             -2087956554
        //   583: ldc             2076369458
        //   585: ixor           
        //   586: lookupswitch {
        //          -915266975: 581
        //          1119387657: 2751
        //          default: 612
        //        }
        //   612: iload           8
        //   614: aaload         
        //   615: astore          9
        //   617: getstatic       dev/nuker/pyro/fc.c:I
        //   620: ifge            628
        //   623: ldc             -817573311
        //   625: goto            630
        //   628: ldc             -701458083
        //   630: ldc             1946153651
        //   632: ixor           
        //   633: lookupswitch {
        //          -1128587022: 2727
        //          -1055432226: 628
        //          default: 660
        //        }
        //   660: aload_1        
        //   661: getstatic       dev/nuker/pyro/fc.1:I
        //   664: ifeq            672
        //   667: ldc             1134714543
        //   669: goto            674
        //   672: ldc             -878391858
        //   674: ldc             2105458975
        //   676: ixor           
        //   677: lookupswitch {
        //          -1227223855: 704
        //          1054646192: 672
        //          default: 2723
        //        }
        //   704: aload           9
        //   706: goto            710
        //   709: athrow         
        //   710: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   713: goto            717
        //   716: athrow         
        //   717: astore          10
        //   719: aload           10
        //   721: goto            725
        //   724: athrow         
        //   725: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   728: goto            732
        //   731: athrow         
        //   732: ifne            738
        //   735: goto            2598
        //   738: new             Lnet/minecraft/util/math/Vec3d;
        //   741: dup            
        //   742: aload           9
        //   744: goto            748
        //   747: athrow         
        //   748: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //   751: goto            755
        //   754: athrow         
        //   755: goto            759
        //   758: athrow         
        //   759: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   762: goto            766
        //   765: athrow         
        //   766: astore          11
        //   768: ldc2_w          0.1
        //   771: dstore          12
        //   773: dload           12
        //   775: ldc2_w          0.9
        //   778: dcmpg          
        //   779: ifge            2598
        //   782: ldc2_w          0.1
        //   785: dstore          14
        //   787: dload           14
        //   789: ldc2_w          0.9
        //   792: dcmpg          
        //   793: ifge            801
        //   796: ldc             1696620092
        //   798: goto            803
        //   801: ldc             1696620035
        //   803: ldc             626246371
        //   805: ixor           
        //   806: tableswitch {
        //          -2132330050: 828
        //          -2132330049: 2587
        //          default: 796
        //        }
        //   828: ldc2_w          0.1
        //   831: dstore          16
        //   833: dload           16
        //   835: ldc2_w          0.9
        //   838: dcmpg          
        //   839: ifge            847
        //   842: ldc             -2143720701
        //   844: goto            849
        //   847: ldc             -2143720702
        //   849: ldc             329378727
        //   851: ixor           
        //   852: tableswitch {
        //          657523016: 876
        //          657523017: 2576
        //          default: 842
        //        }
        //   876: new             Lnet/minecraft/util/math/Vec3d;
        //   879: dup            
        //   880: aload_1        
        //   881: goto            885
        //   884: athrow         
        //   885: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   888: goto            892
        //   891: athrow         
        //   892: dload           12
        //   894: dload           14
        //   896: dload           16
        //   898: goto            902
        //   901: athrow         
        //   902: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   905: goto            909
        //   908: athrow         
        //   909: astore          18
        //   911: getstatic       dev/nuker/pyro/fc.c:I
        //   914: ifge            922
        //   917: ldc             -371773744
        //   919: goto            924
        //   922: ldc             -1631243127
        //   924: ldc             -199159680
        //   926: ixor           
        //   927: lookupswitch {
        //          -1832346087: 922
        //          502677072: 2735
        //          default: 952
        //        }
        //   952: aload           4
        //   954: aload           18
        //   956: goto            960
        //   959: athrow         
        //   960: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //   963: goto            967
        //   966: athrow         
        //   967: dstore          19
        //   969: aload           18
        //   971: new             Lnet/minecraft/util/math/Vec3d;
        //   974: dup            
        //   975: aload           11
        //   977: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   980: ldc2_w          0.5
        //   983: dmul           
        //   984: getstatic       dev/nuker/pyro/fc.0:I
        //   987: ifeq            995
        //   990: ldc             -733957289
        //   992: goto            997
        //   995: ldc             -592808240
        //   997: ldc             335384988
        //   999: ixor           
        //  1000: lookupswitch {
        //          -943906101: 2749
        //          1365183456: 995
        //          default: 1028
        //        }
        //  1028: aload           11
        //  1030: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1033: ldc2_w          0.5
        //  1036: dmul           
        //  1037: aload           11
        //  1039: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1042: ldc2_w          0.5
        //  1045: dmul           
        //  1046: getstatic       dev/nuker/pyro/fc.1:I
        //  1049: ifeq            1057
        //  1052: ldc             555571716
        //  1054: goto            1059
        //  1057: ldc             -1158168732
        //  1059: ldc             -1799158068
        //  1061: ixor           
        //  1062: lookupswitch {
        //          -1243718456: 1057
        //          775207336: 1088
        //          default: 2703
        //        }
        //  1088: goto            1092
        //  1091: athrow         
        //  1092: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1095: goto            1099
        //  1098: athrow         
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: astore          21
        //  1112: iload_2        
        //  1113: ifeq            1121
        //  1116: ldc             1411460076
        //  1118: goto            1123
        //  1121: ldc             1411460079
        //  1123: ldc             78849161
        //  1125: ixor           
        //  1126: tableswitch {
        //          -1591468342: 1148
        //          -1591468341: 1445
        //          default: 1116
        //        }
        //  1148: aload           4
        //  1150: aload           21
        //  1152: goto            1156
        //  1155: athrow         
        //  1156: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1159: goto            1163
        //  1162: athrow         
        //  1163: ldc2_w          18.0
        //  1166: dcmpl          
        //  1167: ifgt            2565
        //  1170: getstatic       dev/nuker/pyro/fc.c:I
        //  1173: ifge            1181
        //  1176: ldc             1990060098
        //  1178: goto            1183
        //  1181: ldc             -984708082
        //  1183: ldc             49163469
        //  1185: ixor           
        //  1186: lookupswitch {
        //          -945774397: 1212
        //          1953744015: 1181
        //          default: 2753
        //        }
        //  1212: dload           19
        //  1214: getstatic       dev/nuker/pyro/fc.0:I
        //  1217: ifeq            1225
        //  1220: ldc             414063083
        //  1222: goto            1227
        //  1225: ldc             -509043468
        //  1227: ldc             723172591
        //  1229: ixor           
        //  1230: lookupswitch {
        //          -734489352: 1225
        //          867476740: 2743
        //          default: 1256
        //        }
        //  1256: aload           4
        //  1258: getstatic       dev/nuker/pyro/fc.0:I
        //  1261: ifeq            1269
        //  1264: ldc             62685373
        //  1266: goto            1271
        //  1269: ldc             1171280456
        //  1271: ldc             1639163642
        //  1273: ixor           
        //  1274: lookupswitch {
        //          1645160007: 2745
        //          1650621017: 1269
        //          default: 1300
        //        }
        //  1300: aload           18
        //  1302: aload           11
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1311: goto            1315
        //  1314: athrow         
        //  1315: getstatic       dev/nuker/pyro/fc.1:I
        //  1318: ifeq            1326
        //  1321: ldc             -998429088
        //  1323: goto            1328
        //  1326: ldc             743163468
        //  1328: ldc             678419045
        //  1330: ixor           
        //  1331: lookupswitch {
        //          -334302203: 1326
        //          69475369: 1356
        //          default: 2747
        //        }
        //  1356: goto            1360
        //  1359: athrow         
        //  1360: invokevirtual   net/minecraft/util/math/Vec3d.func_72436_e:(Lnet/minecraft/util/math/Vec3d;)D
        //  1363: goto            1367
        //  1366: athrow         
        //  1367: dcmpl          
        //  1368: ifgt            2565
        //  1371: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //  1374: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1377: aload           4
        //  1379: aload           21
        //  1381: iconst_0       
        //  1382: iconst_1       
        //  1383: iconst_0       
        //  1384: getstatic       dev/nuker/pyro/fc.0:I
        //  1387: ifeq            1395
        //  1390: ldc             -70702422
        //  1392: goto            1397
        //  1395: ldc             1741831739
        //  1397: ldc             369521045
        //  1399: ixor           
        //  1400: lookupswitch {
        //          -305177793: 1395
        //          1909739438: 1428
        //          default: 2741
        //        }
        //  1428: goto            1432
        //  1431: athrow         
        //  1432: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  1435: goto            1439
        //  1438: athrow         
        //  1439: ifnull          1445
        //  1442: goto            2565
        //  1445: aload           21
        //  1447: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1450: getstatic       dev/nuker/pyro/fc.0:I
        //  1453: ifeq            1461
        //  1456: ldc             -1173028830
        //  1458: goto            1463
        //  1461: ldc             700032934
        //  1463: ldc             -506261774
        //  1465: ixor           
        //  1466: lookupswitch {
        //          -503966968: 1461
        //          1539706576: 2707
        //          default: 1492
        //        }
        //  1492: aload           4
        //  1494: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1497: dsub           
        //  1498: dstore          22
        //  1500: aload           21
        //  1502: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1505: aload           4
        //  1507: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1510: dsub           
        //  1511: dstore          24
        //  1513: aload           21
        //  1515: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1518: getstatic       dev/nuker/pyro/fc.0:I
        //  1521: ifeq            1529
        //  1524: ldc             928936187
        //  1526: goto            1531
        //  1529: ldc             74179038
        //  1531: ldc             -1328529536
        //  1533: ixor           
        //  1534: lookupswitch {
        //          -2020716677: 1529
        //          -1262756258: 1560
        //          default: 2697
        //        }
        //  1560: aload           4
        //  1562: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1565: dsub           
        //  1566: dstore          26
        //  1568: dload           22
        //  1570: dload           22
        //  1572: dmul           
        //  1573: getstatic       dev/nuker/pyro/fc.c:I
        //  1576: ifge            1584
        //  1579: ldc             1571335917
        //  1581: goto            1586
        //  1584: ldc             84978823
        //  1586: ldc             -473666891
        //  1588: ixor           
        //  1589: lookupswitch {
        //          -1100168104: 2699
        //          -1088416745: 1584
        //          default: 1616
        //        }
        //  1616: dload           26
        //  1618: dload           26
        //  1620: dmul           
        //  1621: dadd           
        //  1622: goto            1626
        //  1625: athrow         
        //  1626: invokestatic    net/minecraft/util/math/MathHelper.func_76133_a:(D)F
        //  1629: goto            1633
        //  1632: athrow         
        //  1633: f2d            
        //  1634: dstore          28
        //  1636: new             Ldev/nuker/pyro/fbN;
        //  1639: dup            
        //  1640: dload           26
        //  1642: dload           22
        //  1644: getstatic       dev/nuker/pyro/fc.c:I
        //  1647: ifge            1655
        //  1650: ldc             334648567
        //  1652: goto            1657
        //  1655: ldc             701992914
        //  1657: ldc             -1463374046
        //  1659: ixor           
        //  1660: lookupswitch {
        //          -1154155563: 2755
        //          -77466368: 1655
        //          default: 1688
        //        }
        //  1688: goto            1692
        //  1691: athrow         
        //  1692: invokestatic    java/lang/Math.atan2:(DD)D
        //  1695: goto            1699
        //  1698: athrow         
        //  1699: goto            1703
        //  1702: athrow         
        //  1703: invokestatic    java/lang/Math.toDegrees:(D)D
        //  1706: goto            1710
        //  1709: athrow         
        //  1710: d2f            
        //  1711: ldc_w           90.0
        //  1714: fsub           
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  1722: goto            1726
        //  1725: athrow         
        //  1726: dload           24
        //  1728: dload           28
        //  1730: goto            1734
        //  1733: athrow         
        //  1734: invokestatic    java/lang/Math.atan2:(DD)D
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: goto            1745
        //  1744: athrow         
        //  1745: invokestatic    java/lang/Math.toDegrees:(D)D
        //  1748: goto            1752
        //  1751: athrow         
        //  1752: dneg           
        //  1753: d2f            
        //  1754: goto            1758
        //  1757: athrow         
        //  1758: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  1761: goto            1765
        //  1764: athrow         
        //  1765: goto            1769
        //  1768: athrow         
        //  1769: invokespecial   dev/nuker/pyro/fbN.<init>:(FF)V
        //  1772: goto            1776
        //  1775: athrow         
        //  1776: astore          30
        //  1778: goto            1782
        //  1781: athrow         
        //  1782: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  1785: goto            1789
        //  1788: athrow         
        //  1789: getstatic       dev/nuker/pyro/fc.0:I
        //  1792: ifeq            1801
        //  1795: ldc_w           1480669689
        //  1798: goto            1804
        //  1801: ldc_w           395534113
        //  1804: ldc_w           -1934495937
        //  1807: ixor           
        //  1808: lookupswitch {
        //          -1692225506: 1836
        //          -722413882: 1801
        //          default: 2763
        //        }
        //  1836: aload           30
        //  1838: getstatic       dev/nuker/pyro/fc.0:I
        //  1841: ifeq            1850
        //  1844: ldc_w           -1276024473
        //  1847: goto            1853
        //  1850: ldc_w           -1608605518
        //  1853: ldc_w           846278108
        //  1856: ixor           
        //  1857: lookupswitch {
        //          -2122300229: 2733
        //          -1993009379: 1850
        //          default: 1884
        //        }
        //  1884: goto            1888
        //  1887: athrow         
        //  1888: invokevirtual   dev/nuker/pyro/fbP.c:(Ldev/nuker/pyro/fbN;)Lnet/minecraft/util/math/Vec3d;
        //  1891: goto            1895
        //  1894: athrow         
        //  1895: astore          31
        //  1897: aload           4
        //  1899: aload           31
        //  1901: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1904: ldc2_w          4.0
        //  1907: dmul           
        //  1908: aload           31
        //  1910: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1913: ldc2_w          4.0
        //  1916: dmul           
        //  1917: aload           31
        //  1919: getstatic       dev/nuker/pyro/fc.c:I
        //  1922: ifge            1931
        //  1925: ldc_w           1996029987
        //  1928: goto            1934
        //  1931: ldc_w           3277054
        //  1934: ldc_w           1846631082
        //  1937: ixor           
        //  1938: lookupswitch {
        //          417880713: 1931
        //          1847810644: 1964
        //          default: 2721
        //        }
        //  1964: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1967: ldc2_w          4.0
        //  1970: dmul           
        //  1971: goto            1975
        //  1974: athrow         
        //  1975: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  1978: goto            1982
        //  1981: athrow         
        //  1982: astore          32
        //  1984: iload_3        
        //  1985: ifne            2273
        //  1988: getstatic       dev/nuker/pyro/fbC.c:Lnet/minecraft/client/Minecraft;
        //  1991: getstatic       dev/nuker/pyro/fc.1:I
        //  1994: ifeq            2003
        //  1997: ldc_w           -688037073
        //  2000: goto            2006
        //  2003: ldc_w           1304593572
        //  2006: ldc_w           1275722308
        //  2009: ixor           
        //  2010: lookupswitch {
        //          -1695245973: 2003
        //          30113504: 2036
        //          default: 2715
        //        }
        //  2036: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2039: aload           4
        //  2041: aload           32
        //  2043: iconst_0       
        //  2044: iconst_0       
        //  2045: iconst_1       
        //  2046: goto            2050
        //  2049: athrow         
        //  2050: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //  2053: goto            2057
        //  2056: athrow         
        //  2057: astore          33
        //  2059: aload           33
        //  2061: getfield        net/minecraft/util/math/RayTraceResult.field_72313_a:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2064: getstatic       net/minecraft/util/math/RayTraceResult$Type.BLOCK:Lnet/minecraft/util/math/RayTraceResult$Type;
        //  2067: if_acmpne       2076
        //  2070: ldc_w           221944089
        //  2073: goto            2079
        //  2076: ldc_w           221944070
        //  2079: ldc_w           1493289398
        //  2082: ixor           
        //  2083: tableswitch {
        //          -1468620450: 2104
        //          -1468620449: 2565
        //          default: 2070
        //        }
        //  2104: aload           33
        //  2106: getstatic       dev/nuker/pyro/fc.1:I
        //  2109: ifeq            2118
        //  2112: ldc_w           -1061510074
        //  2115: goto            2121
        //  2118: ldc_w           -183887722
        //  2121: ldc_w           -157940892
        //  2124: ixor           
        //  2125: lookupswitch {
        //          -1871769390: 2118
        //          908896034: 2719
        //          default: 2152
        //        }
        //  2152: goto            2156
        //  2155: athrow         
        //  2156: invokevirtual   net/minecraft/util/math/RayTraceResult.func_178782_a:()Lnet/minecraft/util/math/BlockPos;
        //  2159: goto            2163
        //  2162: athrow         
        //  2163: getstatic       dev/nuker/pyro/fc.1:I
        //  2166: ifeq            2175
        //  2169: ldc_w           -1121275864
        //  2172: goto            2178
        //  2175: ldc_w           487709140
        //  2178: ldc_w           -1822787707
        //  2181: ixor           
        //  2182: lookupswitch {
        //          -1907642799: 2208
        //          779143085: 2175
        //          default: 2729
        //        }
        //  2208: aload           10
        //  2210: getstatic       dev/nuker/pyro/fc.0:I
        //  2213: ifeq            2222
        //  2216: ldc_w           -1317304129
        //  2219: goto            2225
        //  2222: ldc_w           -83379013
        //  2225: ldc_w           -447321817
        //  2228: ixor           
        //  2229: lookupswitch {
        //          508679580: 2256
        //          1412293016: 2222
        //          default: 2705
        //        }
        //  2256: goto            2260
        //  2259: athrow         
        //  2260: invokevirtual   net/minecraft/util/math/BlockPos.equals:(Ljava/lang/Object;)Z
        //  2263: goto            2267
        //  2266: athrow         
        //  2267: ifne            2273
        //  2270: goto            2565
        //  2273: aload           5
        //  2275: ifnull          2284
        //  2278: ldc_w           -954271012
        //  2281: goto            2287
        //  2284: ldc_w           -954270941
        //  2287: ldc_w           -2065144797
        //  2290: ixor           
        //  2291: tableswitch {
        //          -2014495234: 2312
        //          -2014495233: 2375
        //          default: 2278
        //        }
        //  2312: goto            2316
        //  2315: athrow         
        //  2316: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2319: goto            2323
        //  2322: athrow         
        //  2323: aload           30
        //  2325: goto            2329
        //  2328: athrow         
        //  2329: invokevirtual   dev/nuker/pyro/fbP.0:(Ldev/nuker/pyro/fbN;)D
        //  2332: goto            2336
        //  2335: athrow         
        //  2336: goto            2340
        //  2339: athrow         
        //  2340: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2343: goto            2347
        //  2346: athrow         
        //  2347: aload           5
        //  2349: goto            2353
        //  2352: athrow         
        //  2353: invokevirtual   dev/nuker/pyro/fbK.0:()Ldev/nuker/pyro/fbN;
        //  2356: goto            2360
        //  2359: athrow         
        //  2360: goto            2364
        //  2363: athrow         
        //  2364: invokevirtual   dev/nuker/pyro/fbP.0:(Ldev/nuker/pyro/fbN;)D
        //  2367: goto            2371
        //  2370: athrow         
        //  2371: dcmpg          
        //  2372: ifge            2565
        //  2375: new             Ldev/nuker/pyro/fbK;
        //  2378: dup            
        //  2379: new             Ldev/nuker/pyro/fbB;
        //  2382: dup            
        //  2383: aload           10
        //  2385: aload           9
        //  2387: goto            2391
        //  2390: athrow         
        //  2391: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2394: goto            2398
        //  2397: athrow         
        //  2398: getstatic       dev/nuker/pyro/fc.0:I
        //  2401: ifeq            2410
        //  2404: ldc_w           998185391
        //  2407: goto            2413
        //  2410: ldc_w           1484981360
        //  2413: ldc_w           -119455443
        //  2416: ixor           
        //  2417: lookupswitch {
        //          -1013032830: 2761
        //          438450396: 2410
        //          default: 2444
        //        }
        //  2444: aload           21
        //  2446: getstatic       dev/nuker/pyro/fc.0:I
        //  2449: ifeq            2458
        //  2452: ldc_w           -2025367240
        //  2455: goto            2461
        //  2458: ldc_w           -1264860100
        //  2461: ldc_w           88229236
        //  2464: ixor           
        //  2465: lookupswitch {
        //          -2113594292: 2458
        //          -1311145656: 2492
        //          default: 2739
        //        }
        //  2492: goto            2496
        //  2495: athrow         
        //  2496: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;)V
        //  2499: goto            2503
        //  2502: athrow         
        //  2503: aload           30
        //  2505: getstatic       dev/nuker/pyro/fc.c:I
        //  2508: ifge            2517
        //  2511: ldc_w           62437176
        //  2514: goto            2520
        //  2517: ldc_w           -591823399
        //  2520: ldc_w           -1012195687
        //  2523: ixor           
        //  2524: lookupswitch {
        //          -1072453215: 2709
        //          247212376: 2517
        //          default: 2552
        //        }
        //  2552: goto            2556
        //  2555: athrow         
        //  2556: invokespecial   dev/nuker/pyro/fbK.<init>:(Ldev/nuker/pyro/fbB;Ldev/nuker/pyro/fbN;)V
        //  2559: goto            2563
        //  2562: athrow         
        //  2563: astore          5
        //  2565: dload           16
        //  2567: ldc2_w          0.1
        //  2570: dadd           
        //  2571: dstore          16
        //  2573: goto            833
        //  2576: dload           14
        //  2578: ldc2_w          0.1
        //  2581: dadd           
        //  2582: dstore          14
        //  2584: goto            787
        //  2587: dload           12
        //  2589: ldc2_w          0.1
        //  2592: dadd           
        //  2593: dstore          12
        //  2595: goto            773
        //  2598: iinc            8, 1
        //  2601: goto            434
        //  2604: aload           5
        //  2606: ifnonnull       2611
        //  2609: iconst_0       
        //  2610: ireturn        
        //  2611: aload_0        
        //  2612: aload           5
        //  2614: goto            2618
        //  2617: athrow         
        //  2618: invokevirtual   dev/nuker/pyro/fbK.0:()Ldev/nuker/pyro/fbN;
        //  2621: goto            2625
        //  2624: athrow         
        //  2625: putfield        dev/nuker/pyro/fbC.c:Ldev/nuker/pyro/fbN;
        //  2628: aload_0        
        //  2629: aload           5
        //  2631: goto            2635
        //  2634: athrow         
        //  2635: invokevirtual   dev/nuker/pyro/fbK.2:()Ldev/nuker/pyro/fbB;
        //  2638: goto            2642
        //  2641: athrow         
        //  2642: getstatic       dev/nuker/pyro/fc.c:I
        //  2645: ifge            2654
        //  2648: ldc_w           -837680325
        //  2651: goto            2657
        //  2654: ldc_w           714503908
        //  2657: ldc_w           1941916229
        //  2660: ixor           
        //  2661: lookupswitch {
        //          -1112716930: 2759
        //          1494961104: 2654
        //          default: 2688
        //        }
        //  2688: putfield        dev/nuker/pyro/fbC.c:Ldev/nuker/pyro/fbB;
        //  2691: iconst_1       
        //  2692: ireturn        
        //  2693: aconst_null    
        //  2694: athrow         
        //  2695: aconst_null    
        //  2696: athrow         
        //  2697: aconst_null    
        //  2698: athrow         
        //  2699: aconst_null    
        //  2700: athrow         
        //  2701: aconst_null    
        //  2702: athrow         
        //  2703: aconst_null    
        //  2704: athrow         
        //  2705: aconst_null    
        //  2706: athrow         
        //  2707: aconst_null    
        //  2708: athrow         
        //  2709: aconst_null    
        //  2710: athrow         
        //  2711: aconst_null    
        //  2712: athrow         
        //  2713: aconst_null    
        //  2714: athrow         
        //  2715: aconst_null    
        //  2716: athrow         
        //  2717: aconst_null    
        //  2718: athrow         
        //  2719: aconst_null    
        //  2720: athrow         
        //  2721: aconst_null    
        //  2722: athrow         
        //  2723: aconst_null    
        //  2724: athrow         
        //  2725: aconst_null    
        //  2726: athrow         
        //  2727: aconst_null    
        //  2728: athrow         
        //  2729: aconst_null    
        //  2730: athrow         
        //  2731: aconst_null    
        //  2732: athrow         
        //  2733: aconst_null    
        //  2734: athrow         
        //  2735: aconst_null    
        //  2736: athrow         
        //  2737: aconst_null    
        //  2738: athrow         
        //  2739: aconst_null    
        //  2740: athrow         
        //  2741: aconst_null    
        //  2742: athrow         
        //  2743: aconst_null    
        //  2744: athrow         
        //  2745: aconst_null    
        //  2746: athrow         
        //  2747: aconst_null    
        //  2748: athrow         
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
        //  2765: pop            
        //  2766: goto            24
        //  2769: pop            
        //  2770: aconst_null    
        //  2771: goto            2765
        //  2774: dup            
        //  2775: ifnull          2765
        //  2778: checkcast       Ljava/lang/Throwable;
        //  2781: athrow         
        //  2782: dup            
        //  2783: ifnull          2769
        //  2786: checkcast       Ljava/lang/Throwable;
        //  2789: athrow         
        //  2790: aconst_null    
        //  2791: athrow         
        //    StackMapTable: 01 64 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FF 00 03 00 04 07 00 03 07 00 90 01 01 00 00 43 07 00 32 40 07 00 90 45 07 00 32 40 01 04 FF 00 0E 00 04 07 00 03 07 00 90 01 01 00 02 08 00 29 08 00 29 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 03 08 00 29 08 00 29 01 FF 00 1D 00 04 07 00 03 07 00 90 01 01 00 02 08 00 29 08 00 29 FF 00 13 00 04 07 00 03 07 00 90 01 01 00 03 08 00 29 08 00 29 03 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 01 FF 00 1D 00 04 07 00 03 07 00 90 01 01 00 03 08 00 29 08 00 29 03 FF 00 10 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 07 00 48 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 07 00 48 01 FF 00 1C 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 07 00 48 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 07 00 48 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 07 00 5A FF 00 0B 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 07 00 48 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 02 FF 00 0F 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 07 00 42 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 06 08 00 29 08 00 29 03 03 07 00 42 01 FF 00 1E 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 07 00 42 48 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 03 45 07 00 32 40 07 00 3A FF 00 07 00 06 07 00 03 07 00 90 01 01 07 00 3A 05 00 01 07 00 32 00 45 07 00 32 40 07 01 6E FC 00 0C 07 01 6E 41 01 1B 4D 01 FF 00 01 00 07 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 00 02 01 01 5B 01 FF 00 0D 00 08 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 01 00 01 01 FF 00 01 00 08 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 01 00 02 01 01 5B 01 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 00 0A 41 01 1C 4C 01 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 01 01 5C 01 0F 41 01 1D 4C 07 01 6E FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 01 6E 01 5C 07 01 6E FC 00 0F 07 00 6D 41 01 1D 4B 07 00 90 FF 00 01 00 0A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 00 02 07 00 90 01 5D 07 00 90 FF 00 04 00 00 00 01 07 00 32 FF 00 00 00 0A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 00 02 07 00 90 07 00 6D 45 07 00 32 40 07 00 90 FF 00 06 00 0B 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 00 01 07 00 32 40 07 00 90 45 07 00 32 40 01 05 48 07 00 32 FF 00 00 00 0B 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 00 03 08 02 E2 08 02 E2 07 00 6D 45 07 00 32 FF 00 00 00 0B 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 00 03 08 02 E2 08 02 E2 07 01 70 42 07 00 32 FF 00 00 00 0B 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 00 03 08 02 E2 08 02 E2 07 01 70 45 07 00 32 40 07 00 3A FD 00 06 07 00 3A 03 FC 00 0D 03 08 04 41 01 18 FC 00 04 03 08 04 41 01 1A 47 07 00 18 FF 00 00 00 0F 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 00 03 08 03 6C 08 03 6C 07 00 90 45 07 00 32 40 07 00 3A FF 00 08 00 00 00 01 07 00 32 FF 00 00 00 0F 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 00 04 07 00 3A 03 03 03 45 07 00 32 40 07 00 3A FC 00 0C 07 00 3A 41 01 1B FF 00 06 00 00 00 01 07 00 32 FF 00 00 00 10 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 00 02 07 00 3A 07 00 3A 45 07 00 32 40 03 FF 00 1B 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 04 07 00 3A 08 03 CB 08 03 CB 03 FF 00 01 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 05 07 00 3A 08 03 CB 08 03 CB 03 01 FF 00 1E 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 04 07 00 3A 08 03 CB 08 03 CB 03 FF 00 1C 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 06 07 00 3A 08 03 CB 08 03 CB 03 03 03 FF 00 01 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 07 07 00 3A 08 03 CB 08 03 CB 03 03 03 01 FF 00 1C 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 06 07 00 3A 08 03 CB 08 03 CB 03 03 03 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 06 07 00 3A 08 03 CB 08 03 CB 03 03 03 45 07 00 32 FF 00 00 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 02 07 00 3A 07 00 3A 42 07 00 32 FF 00 00 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 02 07 00 3A 07 00 3A 45 07 00 32 40 07 00 3A FC 00 05 07 00 3A 04 41 01 18 46 07 00 32 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 07 00 3A 07 00 3A 45 07 00 32 40 03 11 41 01 1C 4C 03 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 01 5C 03 FF 00 0C 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 07 00 3A FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 01 FF 00 1C 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 07 00 3A 46 07 00 32 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 04 03 07 00 3A 07 00 3A 07 00 3A 45 07 00 32 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 07 00 3A FF 00 0A 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 07 00 3A FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 04 03 07 00 3A 07 00 3A 01 FF 00 1B 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 07 00 3A 42 07 00 14 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 07 00 3A 45 07 00 32 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 03 FF 00 1B 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 06 07 00 E2 07 00 3A 07 00 3A 01 01 01 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 07 07 00 E2 07 00 3A 07 00 3A 01 01 01 01 FF 00 1E 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 06 07 00 E2 07 00 3A 07 00 3A 01 01 01 42 07 00 32 FF 00 00 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 06 07 00 E2 07 00 3A 07 00 3A 01 01 01 45 07 00 32 40 07 01 24 05 4F 03 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 01 5C 03 FF 00 24 00 14 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 00 01 03 FF 00 01 00 14 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 00 02 03 01 5C 03 FF 00 17 00 15 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 00 01 03 FF 00 01 00 15 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 00 02 03 01 5D 03 48 07 00 32 40 03 45 07 00 32 40 02 FF 00 15 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 03 03 FF 00 01 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 05 08 06 64 08 06 64 03 03 01 FF 00 1E 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 03 03 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 03 03 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 03 08 06 64 08 06 64 03 42 07 00 18 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 03 08 06 64 08 06 64 03 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 03 08 06 64 08 06 64 03 47 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 03 08 06 64 08 06 64 02 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 03 08 06 64 08 06 64 02 FF 00 06 00 00 00 01 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 05 08 06 64 08 06 64 02 03 03 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 03 42 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 03 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 03 44 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 02 45 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 02 42 07 00 32 FF 00 00 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 02 02 45 07 00 32 40 07 00 F7 FF 00 04 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 01 07 00 22 00 45 07 00 32 40 07 01 0E 4B 07 01 0E FF 00 02 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 02 07 01 0E 01 5F 07 01 0E FF 00 0D 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 02 07 01 0E 07 00 F7 FF 00 02 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 03 07 01 0E 07 00 F7 01 FF 00 1E 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 02 07 01 0E 07 00 F7 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 02 07 01 0E 07 00 F7 45 07 00 32 40 07 00 3A FF 00 23 00 18 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 00 04 07 00 3A 03 03 07 00 3A FF 00 02 00 18 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 00 05 07 00 3A 03 03 07 00 3A 01 FF 00 1D 00 18 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 00 04 07 00 3A 03 03 07 00 3A 49 07 00 32 FF 00 00 00 18 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 00 04 07 00 3A 03 03 03 45 07 00 32 40 07 00 3A FF 00 14 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 01 07 00 42 FF 00 02 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 02 07 00 42 01 5D 07 00 42 4C 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 07 00 E2 07 00 3A 07 00 3A 01 01 01 45 07 00 32 40 07 01 24 FC 00 0C 07 01 24 05 42 01 18 4D 07 01 24 FF 00 02 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 01 24 01 5E 07 01 24 42 07 00 32 40 07 01 24 45 07 00 32 40 07 00 90 4B 07 00 90 FF 00 02 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 00 90 01 5D 07 00 90 FF 00 0D 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 00 90 07 00 90 FF 00 02 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 03 07 00 90 07 00 90 01 FF 00 1E 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 00 90 07 00 90 42 07 00 16 FF 00 00 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 00 90 07 00 90 45 07 00 32 40 01 FA 00 05 04 05 42 01 18 42 07 00 32 00 45 07 00 32 40 07 01 0E 44 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 02 07 01 0E 07 00 F7 45 07 00 32 40 03 42 07 00 32 40 03 45 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 02 03 07 01 0E 44 07 00 0C FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 03 03 07 01 0E 07 01 49 45 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 03 03 07 01 0E 07 00 F7 42 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 03 03 07 01 0E 07 00 F7 45 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 02 03 03 03 FF 00 0E 00 00 00 01 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 45 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D FF 00 0B 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D FF 00 02 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 07 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 01 FF 00 1E 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D FF 00 0D 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 07 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 07 00 3A FF 00 02 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 08 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 07 00 3A 01 FF 00 1E 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 07 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 07 00 3A 42 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 07 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 07 00 3A 45 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 03 08 09 47 08 09 47 07 01 4E FF 00 0D 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 04 08 09 47 08 09 47 07 01 4E 07 00 F7 FF 00 02 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 05 08 09 47 08 09 47 07 01 4E 07 00 F7 01 FF 00 1F 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 04 08 09 47 08 09 47 07 01 4E 07 00 F7 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 04 08 09 47 08 09 47 07 01 4E 07 00 F7 45 07 00 32 40 07 01 49 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 00 F8 00 0A FA 00 0A F8 00 0A F9 00 05 06 45 07 00 32 FF 00 00 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 49 45 07 00 32 FF 00 00 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 00 F7 48 07 00 32 FF 00 00 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 49 45 07 00 32 FF 00 00 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 4E FF 00 0B 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 4E FF 00 02 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 03 07 00 03 07 01 4E 01 FF 00 1E 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 4E FF 00 04 00 08 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 00 01 01 FF 00 01 00 14 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 00 01 03 FF 00 01 00 15 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 00 01 03 FF 00 01 00 07 07 00 03 07 00 90 01 01 07 00 3A 05 07 01 6E 00 00 FF 00 01 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 06 07 00 3A 08 03 CB 08 03 CB 03 03 03 FF 00 01 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 02 07 00 90 07 00 90 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 01 03 FF 00 01 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 04 08 09 47 08 09 47 07 01 4E 07 00 F7 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 03 08 00 29 08 00 29 03 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 00 FF 00 01 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 01 07 00 42 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 00 FF 00 01 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 01 07 01 24 FF 00 01 00 18 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 00 04 07 00 3A 03 03 07 00 3A FF 00 01 00 0A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 00 01 07 00 90 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 04 08 00 29 08 00 29 03 07 00 48 FF 00 01 00 0A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 00 00 FF 00 01 00 1A 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 07 01 24 00 01 07 00 90 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 01 01 FF 00 01 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 02 07 01 0E 07 00 F7 FF 00 01 00 10 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 00 00 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 02 08 00 29 08 00 29 FF 00 01 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 07 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D 07 00 3A FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 06 07 00 E2 07 00 3A 07 00 3A 01 01 01 41 03 FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 02 03 07 00 3A FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 03 03 07 00 3A 07 00 3A FF 00 01 00 11 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 00 04 07 00 3A 08 03 CB 08 03 CB 03 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 01 07 01 6E FF 00 01 00 12 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 00 00 FF 00 01 00 16 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 00 04 08 06 64 08 06 64 03 03 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 05 08 00 29 08 00 29 03 03 07 00 42 FF 00 01 00 09 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 00 02 07 00 03 07 01 4E FF 00 01 00 19 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 07 00 3A 07 00 3A 00 06 08 09 47 08 09 47 08 09 4B 08 09 4B 07 00 90 07 00 6D FF 00 01 00 17 07 00 03 07 00 90 01 01 07 00 3A 07 01 49 07 01 6E 01 01 07 00 6D 07 00 90 07 00 3A 03 03 03 07 00 3A 03 07 00 3A 03 03 03 03 07 00 F7 00 01 07 01 0E FF 00 01 00 04 07 00 03 07 00 90 01 01 00 01 07 00 18 43 05 44 07 00 18 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2774   2782   Ljava/lang/UnsupportedOperationException;
        //  2774   2782   2774   2782   Ljava/lang/NumberFormatException;
        //  2790   2792   3      8      Any
        //  28     35     35     36     Any
        //  28     35     28     29     Any
        //  28     35     35     36     Any
        //  28     35     28     29     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  29     35     3      8      Ljava/lang/NegativeArraySizeException;
        //  192    198    198    199    Any
        //  192    198    198    199    Ljava/lang/UnsupportedOperationException;
        //  192    198    198    199    Any
        //  192    198    3      8      Ljava/lang/NegativeArraySizeException;
        //  192    198    3      8      Any
        //  212    218    218    219    Any
        //  212    218    3      8      Any
        //  212    218    3      8      Any
        //  212    218    218    219    Any
        //  212    218    3      8      Any
        //  277    284    284    285    Any
        //  277    284    277    278    Ljava/util/ConcurrentModificationException;
        //  278    284    3      8      Any
        //  277    284    3      8      Any
        //  277    284    277    278    Any
        //  293    300    300    301    Any
        //  293    300    300    301    Ljava/lang/ClassCastException;
        //  293    300    293    294    Any
        //  294    300    300    301    Ljava/lang/ClassCastException;
        //  294    300    293    294    Any
        //  710    716    716    717    Any
        //  710    716    3      8      Ljava/lang/UnsupportedOperationException;
        //  710    716    3      8      Any
        //  710    716    716    717    Ljava/lang/NumberFormatException;
        //  710    716    3      8      Any
        //  724    731    731    732    Any
        //  724    731    724    725    Any
        //  725    731    724    725    Any
        //  725    731    724    725    Any
        //  724    731    3      8      Ljava/lang/ClassCastException;
        //  747    754    754    755    Any
        //  747    754    747    748    Ljava/lang/NegativeArraySizeException;
        //  748    754    747    748    Any
        //  748    754    747    748    Ljava/lang/RuntimeException;
        //  747    754    3      8      Ljava/lang/NegativeArraySizeException;
        //  758    765    765    766    Any
        //  759    765    758    759    Any
        //  758    765    758    759    Any
        //  759    765    758    759    Ljava/lang/NegativeArraySizeException;
        //  758    765    765    766    Ljava/util/NoSuchElementException;
        //  884    891    891    892    Any
        //  884    891    891    892    Any
        //  884    891    884    885    Ljava/util/ConcurrentModificationException;
        //  885    891    884    885    Ljava/lang/NegativeArraySizeException;
        //  885    891    884    885    Ljava/util/ConcurrentModificationException;
        //  902    908    908    909    Any
        //  902    908    3      8      Any
        //  902    908    3      8      Any
        //  902    908    908    909    Ljava/lang/ClassCastException;
        //  902    908    908    909    Ljava/lang/RuntimeException;
        //  960    966    966    967    Any
        //  960    966    966    967    Ljava/lang/NullPointerException;
        //  960    966    966    967    Ljava/lang/EnumConstantNotPresentException;
        //  960    966    966    967    Ljava/lang/UnsupportedOperationException;
        //  960    966    3      8      Any
        //  1092   1098   1098   1099   Any
        //  1092   1098   1098   1099   Any
        //  1092   1098   3      8      Ljava/lang/NumberFormatException;
        //  1092   1098   3      8      Ljava/util/ConcurrentModificationException;
        //  1092   1098   1098   1099   Any
        //  1102   1109   1109   1110   Any
        //  1102   1109   1102   1103   Any
        //  1103   1109   1109   1110   Ljava/util/NoSuchElementException;
        //  1102   1109   1102   1103   Ljava/util/NoSuchElementException;
        //  1102   1109   1109   1110   Any
        //  1155   1162   1162   1163   Any
        //  1156   1162   1155   1156   Any
        //  1155   1162   1162   1163   Ljava/lang/UnsupportedOperationException;
        //  1155   1162   1162   1163   Ljava/lang/StringIndexOutOfBoundsException;
        //  1155   1162   1155   1156   Any
        //  1307   1314   1314   1315   Any
        //  1308   1314   1307   1308   Ljava/lang/AssertionError;
        //  1308   1314   1307   1308   Any
        //  1307   1314   1314   1315   Any
        //  1307   1314   3      8      Ljava/util/NoSuchElementException;
        //  1359   1366   1366   1367   Any
        //  1359   1366   1366   1367   Ljava/lang/UnsupportedOperationException;
        //  1360   1366   1359   1360   Ljava/util/ConcurrentModificationException;
        //  1360   1366   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1359   1366   3      8      Any
        //  1431   1438   1438   1439   Any
        //  1431   1438   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1432   1438   3      8      Ljava/lang/NullPointerException;
        //  1431   1438   1431   1432   Any
        //  1431   1438   1438   1439   Any
        //  1625   1632   1632   1633   Any
        //  1625   1632   1625   1626   Any
        //  1625   1632   1625   1626   Ljava/lang/ArithmeticException;
        //  1625   1632   3      8      Any
        //  1625   1632   1632   1633   Any
        //  1692   1698   1698   1699   Any
        //  1692   1698   3      8      Ljava/lang/NumberFormatException;
        //  1692   1698   3      8      Ljava/lang/RuntimeException;
        //  1692   1698   1698   1699   Ljava/lang/RuntimeException;
        //  1692   1698   3      8      Ljava/lang/IllegalArgumentException;
        //  1702   1709   1709   1710   Any
        //  1703   1709   1709   1710   Any
        //  1703   1709   1702   1703   Ljava/lang/ClassCastException;
        //  1703   1709   1702   1703   Ljava/lang/IndexOutOfBoundsException;
        //  1703   1709   3      8      Ljava/lang/AssertionError;
        //  1718   1725   1725   1726   Any
        //  1719   1725   1725   1726   Ljava/lang/NumberFormatException;
        //  1719   1725   1718   1719   Any
        //  1719   1725   1725   1726   Any
        //  1719   1725   1725   1726   Ljava/lang/IllegalStateException;
        //  1734   1740   1740   1741   Any
        //  1734   1740   1740   1741   Any
        //  1734   1740   3      8      Ljava/lang/AssertionError;
        //  1734   1740   3      8      Ljava/lang/RuntimeException;
        //  1734   1740   3      8      Any
        //  1744   1751   1751   1752   Any
        //  1745   1751   1744   1745   Any
        //  1745   1751   1751   1752   Any
        //  1744   1751   1751   1752   Ljava/lang/ClassCastException;
        //  1744   1751   1751   1752   Any
        //  1757   1764   1764   1765   Any
        //  1757   1764   1757   1758   Any
        //  1758   1764   3      8      Any
        //  1758   1764   1764   1765   Ljava/lang/NullPointerException;
        //  1758   1764   1764   1765   Ljava/lang/RuntimeException;
        //  1768   1775   1775   1776   Any
        //  1769   1775   1775   1776   Ljava/lang/RuntimeException;
        //  1769   1775   1768   1769   Any
        //  1769   1775   3      8      Ljava/lang/ArithmeticException;
        //  1769   1775   1768   1769   Any
        //  1781   1788   1788   1789   Any
        //  1782   1788   1781   1782   Ljava/lang/AssertionError;
        //  1782   1788   1788   1789   Ljava/util/ConcurrentModificationException;
        //  1782   1788   1788   1789   Any
        //  1781   1788   3      8      Any
        //  1888   1894   1894   1895   Any
        //  1888   1894   3      8      Ljava/lang/AssertionError;
        //  1888   1894   1894   1895   Ljava/lang/NullPointerException;
        //  1888   1894   1894   1895   Ljava/lang/IllegalArgumentException;
        //  1888   1894   3      8      Ljava/lang/NumberFormatException;
        //  1974   1981   1981   1982   Any
        //  1974   1981   1981   1982   Ljava/lang/UnsupportedOperationException;
        //  1974   1981   1981   1982   Any
        //  1975   1981   1974   1975   Any
        //  1975   1981   3      8      Ljava/lang/NumberFormatException;
        //  2049   2056   2056   2057   Any
        //  2050   2056   2049   2050   Any
        //  2050   2056   2049   2050   Ljava/util/NoSuchElementException;
        //  2049   2056   2056   2057   Ljava/lang/NumberFormatException;
        //  2049   2056   2056   2057   Ljava/util/ConcurrentModificationException;
        //  2155   2162   2162   2163   Any
        //  2156   2162   2155   2156   Ljava/lang/StringIndexOutOfBoundsException;
        //  2155   2162   2155   2156   Any
        //  2155   2162   3      8      Any
        //  2156   2162   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2259   2266   2266   2267   Any
        //  2260   2266   3      8      Ljava/lang/NullPointerException;
        //  2259   2266   2266   2267   Any
        //  2260   2266   2259   2260   Ljava/lang/ClassCastException;
        //  2259   2266   2266   2267   Any
        //  2315   2322   2322   2323   Any
        //  2315   2322   2322   2323   Ljava/util/NoSuchElementException;
        //  2316   2322   2315   2316   Any
        //  2315   2322   3      8      Ljava/lang/IllegalStateException;
        //  2315   2322   3      8      Any
        //  2328   2335   2335   2336   Any
        //  2329   2335   2328   2329   Any
        //  2328   2335   3      8      Any
        //  2329   2335   2335   2336   Ljava/lang/RuntimeException;
        //  2329   2335   2328   2329   Any
        //  2339   2346   2346   2347   Any
        //  2339   2346   2339   2340   Any
        //  2340   2346   2346   2347   Any
        //  2340   2346   2346   2347   Ljava/util/ConcurrentModificationException;
        //  2340   2346   2339   2340   Ljava/lang/ArithmeticException;
        //  2352   2359   2359   2360   Any
        //  2352   2359   3      8      Ljava/lang/NumberFormatException;
        //  2353   2359   3      8      Ljava/lang/NullPointerException;
        //  2353   2359   2359   2360   Ljava/lang/IllegalStateException;
        //  2353   2359   2352   2353   Ljava/lang/UnsupportedOperationException;
        //  2363   2370   2370   2371   Any
        //  2363   2370   2363   2364   Ljava/lang/EnumConstantNotPresentException;
        //  2364   2370   2370   2371   Any
        //  2364   2370   3      8      Any
        //  2364   2370   2363   2364   Any
        //  2391   2397   2397   2398   Any
        //  2391   2397   2397   2398   Ljava/lang/StringIndexOutOfBoundsException;
        //  2391   2397   2397   2398   Ljava/util/ConcurrentModificationException;
        //  2391   2397   3      8      Ljava/lang/IllegalArgumentException;
        //  2391   2397   2397   2398   Ljava/lang/ArithmeticException;
        //  2495   2502   2502   2503   Any
        //  2495   2502   2495   2496   Any
        //  2496   2502   2502   2503   Any
        //  2495   2502   2502   2503   Any
        //  2496   2502   3      8      Any
        //  2556   2562   2562   2563   Any
        //  2556   2562   2562   2563   Ljava/lang/ClassCastException;
        //  2556   2562   2562   2563   Ljava/lang/ArithmeticException;
        //  2556   2562   3      8      Ljava/lang/RuntimeException;
        //  2556   2562   2562   2563   Any
        //  2617   2624   2624   2625   Any
        //  2618   2624   2617   2618   Ljava/lang/IllegalArgumentException;
        //  2618   2624   2624   2625   Ljava/lang/IllegalArgumentException;
        //  2618   2624   2617   2618   Any
        //  2618   2624   2624   2625   Any
        //  2634   2641   2641   2642   Any
        //  2634   2641   3      8      Ljava/lang/AssertionError;
        //  2635   2641   2634   2635   Any
        //  2634   2641   2634   2635   Ljava/lang/NullPointerException;
        //  2634   2641   2641   2642   Ljava/util/NoSuchElementException;
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
    
    public fbC() {
        this.c = null;
        while (true) {
            int n = 0;
            Label_0024: {
                if (fc.1 != 0) {
                    n = 1246684447;
                    break Label_0024;
                }
                n = -1870492418;
            }
            switch (n ^ 0x802FD64) {
                case 1112283259: {
                    continue;
                }
                case -1736412774: {
                    this.c = null;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    public void c(final BlockPos p0, final boolean p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          541
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            533
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            525
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //    32: goto            36
        //    35: athrow         
        //    36: ifeq            156
        //    39: getstatic       dev/nuker/pyro/fc.1:I
        //    42: ifeq            51
        //    45: ldc_w           1841732385
        //    48: goto            54
        //    51: ldc_w           -1286416133
        //    54: ldc_w           -1705850721
        //    57: ixor           
        //    58: lookupswitch {
        //          -141274178: 51
        //          687870052: 84
        //          default: 508
        //        }
        //    84: aload_0        
        //    85: aload_1        
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            98
        //    92: ldc_w           588090072
        //    95: goto            101
        //    98: ldc_w           1166842942
        //   101: ldc_w           1666257812
        //   104: ixor           
        //   105: lookupswitch {
        //          652054442: 132
        //          1079810380: 98
        //          default: 510
        //        }
        //   132: iload_3        
        //   133: ifne            140
        //   136: iconst_1       
        //   137: goto            141
        //   140: iconst_0       
        //   141: iload_3        
        //   142: goto            146
        //   145: athrow         
        //   146: invokespecial   dev/nuker/pyro/fbC.0:(Lnet/minecraft/util/math/BlockPos;ZZ)Z
        //   149: goto            153
        //   152: athrow         
        //   153: ifeq            157
        //   156: return         
        //   157: iload_2        
        //   158: ifne            167
        //   161: ldc_w           -1200605448
        //   164: goto            170
        //   167: ldc_w           -1200605447
        //   170: ldc_w           -1507584072
        //   173: ixor           
        //   174: tableswitch {
        //          1017660032: 196
        //          1017660033: 197
        //          default: 161
        //        }
        //   196: return         
        //   197: aload_1        
        //   198: goto            202
        //   201: athrow         
        //   202: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   205: goto            209
        //   208: athrow         
        //   209: ifeq            213
        //   212: return         
        //   213: iconst_m1      
        //   214: istore          4
        //   216: getstatic       dev/nuker/pyro/fc.c:I
        //   219: ifge            228
        //   222: ldc_w           -218119993
        //   225: goto            231
        //   228: ldc_w           -1166207014
        //   231: ldc_w           1913245241
        //   234: ixor           
        //   235: lookupswitch {
        //          -2131357954: 512
        //          -563768752: 228
        //          default: 260
        //        }
        //   260: iload           4
        //   262: iconst_1       
        //   263: if_icmpgt       503
        //   266: iconst_m1      
        //   267: istore          5
        //   269: getstatic       dev/nuker/pyro/fc.c:I
        //   272: ifge            281
        //   275: ldc_w           1933364708
        //   278: goto            284
        //   281: ldc_w           1635312264
        //   284: ldc_w           930286891
        //   287: ixor           
        //   288: lookupswitch {
        //          1146077391: 281
        //          1443622819: 316
        //          default: 514
        //        }
        //   316: iload           5
        //   318: iconst_1       
        //   319: if_icmpgt       497
        //   322: aload_0        
        //   323: aload_1        
        //   324: getstatic       dev/nuker/pyro/fc.c:I
        //   327: ifge            336
        //   330: ldc_w           -2106820762
        //   333: goto            339
        //   336: ldc_w           -669944395
        //   339: ldc_w           -38008587
        //   342: ixor           
        //   343: lookupswitch {
        //          -1916555390: 336
        //          2144370579: 504
        //          default: 368
        //        }
        //   368: iload           4
        //   370: iconst_0       
        //   371: iload           5
        //   373: goto            377
        //   376: athrow         
        //   377: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   380: goto            384
        //   383: athrow         
        //   384: iload_3        
        //   385: ifne            394
        //   388: ldc_w           -2002473306
        //   391: goto            397
        //   394: ldc_w           -2002473303
        //   397: ldc_w           1006858337
        //   400: ixor           
        //   401: tableswitch {
        //          1766833550: 424
        //          1766833551: 428
        //          default: 388
        //        }
        //   424: iconst_1       
        //   425: goto            429
        //   428: iconst_0       
        //   429: iload_3        
        //   430: getstatic       dev/nuker/pyro/fc.c:I
        //   433: ifge            442
        //   436: ldc_w           -1738966027
        //   439: goto            445
        //   442: ldc_w           -1981432303
        //   445: ldc_w           19255689
        //   448: ixor           
        //   449: lookupswitch {
        //          -2000654440: 476
        //          -1719883140: 442
        //          default: 506
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokespecial   dev/nuker/pyro/fbC.0:(Lnet/minecraft/util/math/BlockPos;ZZ)Z
        //   483: goto            487
        //   486: athrow         
        //   487: ifeq            491
        //   490: return         
        //   491: iinc            5, 1
        //   494: goto            269
        //   497: iinc            4, 1
        //   500: goto            216
        //   503: return         
        //   504: aconst_null    
        //   505: athrow         
        //   506: aconst_null    
        //   507: athrow         
        //   508: aconst_null    
        //   509: athrow         
        //   510: aconst_null    
        //   511: athrow         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: pop            
        //   517: goto            24
        //   520: pop            
        //   521: aconst_null    
        //   522: goto            516
        //   525: dup            
        //   526: ifnull          516
        //   529: checkcast       Ljava/lang/Throwable;
        //   532: athrow         
        //   533: dup            
        //   534: ifnull          520
        //   537: checkcast       Ljava/lang/Throwable;
        //   540: athrow         
        //   541: aconst_null    
        //   542: athrow         
        //    StackMapTable: 00 4A 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FF 00 03 00 04 07 00 03 07 00 90 01 01 00 00 FF 00 03 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 01 07 00 90 45 07 00 32 40 01 0E 42 01 1D FF 00 0D 00 04 07 00 03 07 00 90 01 01 00 02 07 00 03 07 00 90 FF 00 02 00 04 07 00 03 07 00 90 01 01 00 03 07 00 03 07 00 90 01 FF 00 1E 00 04 07 00 03 07 00 90 01 01 00 02 07 00 03 07 00 90 FF 00 07 00 04 07 00 03 07 00 90 01 01 00 02 07 00 03 07 00 90 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 03 07 00 03 07 00 90 01 43 07 00 32 FF 00 00 00 04 07 00 03 07 00 90 01 01 00 04 07 00 03 07 00 90 01 01 45 07 00 32 40 01 02 00 03 05 42 01 19 00 43 07 00 1A 40 07 00 90 45 07 00 32 40 01 03 FC 00 02 01 0B 42 01 1C FC 00 08 01 0B 42 01 1F FF 00 13 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 02 00 06 07 00 03 07 00 90 01 01 01 01 00 03 07 00 03 07 00 90 01 FF 00 1C 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 47 07 00 32 FF 00 00 00 06 07 00 03 07 00 90 01 01 01 01 00 05 07 00 03 07 00 90 01 01 01 45 07 00 32 FF 00 00 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 03 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 05 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 02 00 06 07 00 03 07 00 90 01 01 01 01 00 03 07 00 03 07 00 90 01 FF 00 1A 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 03 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 00 00 06 07 00 03 07 00 90 01 01 01 01 00 03 07 00 03 07 00 90 01 FF 00 0C 00 06 07 00 03 07 00 90 01 01 01 01 00 04 07 00 03 07 00 90 01 01 FF 00 02 00 06 07 00 03 07 00 90 01 01 01 01 00 05 07 00 03 07 00 90 01 01 01 FF 00 1E 00 06 07 00 03 07 00 90 01 01 01 01 00 04 07 00 03 07 00 90 01 01 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 06 07 00 03 07 00 90 01 01 01 01 00 04 07 00 03 07 00 90 01 01 45 07 00 32 40 01 03 05 FA 00 05 FF 00 00 00 06 07 00 03 07 00 90 01 01 01 01 00 02 07 00 03 07 00 90 FF 00 01 00 06 07 00 03 07 00 90 01 01 01 01 00 04 07 00 03 07 00 90 01 01 F9 00 01 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 02 07 00 03 07 00 90 FC 00 01 01 FC 00 01 01 FF 00 01 00 04 07 00 03 07 00 90 01 01 00 01 07 00 32 43 05 44 07 00 32 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     525    533    Any
        //  525    533    525    533    Ljava/lang/NegativeArraySizeException;
        //  541    543    3      8      Ljava/lang/ArithmeticException;
        //  29     35     35     36     Any
        //  29     35     3      8      Any
        //  29     35     35     36     Ljava/lang/ClassCastException;
        //  29     35     35     36     Any
        //  29     35     35     36     Ljava/lang/RuntimeException;
        //  145    152    152    153    Any
        //  146    152    3      8      Any
        //  146    152    152    153    Ljava/lang/IllegalStateException;
        //  145    152    145    146    Any
        //  146    152    3      8      Ljava/lang/ArithmeticException;
        //  201    208    208    209    Any
        //  202    208    3      8      Ljava/util/ConcurrentModificationException;
        //  201    208    3      8      Any
        //  202    208    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  202    208    201    202    Ljava/util/NoSuchElementException;
        //  376    383    383    384    Any
        //  377    383    376    377    Any
        //  376    383    376    377    Any
        //  376    383    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  377    383    383    384    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  480    486    486    487    Any
        //  480    486    486    487    Any
        //  480    486    3      8      Any
        //  480    486    3      8      Any
        //  480    486    3      8      Ljava/lang/StringIndexOutOfBoundsException;
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
}
