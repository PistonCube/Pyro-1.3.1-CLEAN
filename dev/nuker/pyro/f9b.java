// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.RayTraceResult;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public class f9b extends fH
{
    @NotNull
    public f0d c;
    @NotNull
    public f0b c;
    @NotNull
    public f0b 0;
    @NotNull
    public f0d 0;
    
    @NotNull
    public f0d c() {
        return fbS.gl(this, 1301659326);
    }
    
    public void c(@NotNull final EntityPlayer p0, @NotNull final RayTraceResult p1, final int p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2725
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2717
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2709
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: iload_3        
        //    29: ifne            2619
        //    32: aload_2        
        //    33: getstatic       dev/nuker/pyro/fc.c:I
        //    36: ifge            44
        //    39: ldc             214419242
        //    41: goto            46
        //    44: ldc             -874109508
        //    46: ldc             218759663
        //    48: ixor           
        //    49: lookupswitch {
        //          30262981: 2626
        //          742781135: 44
        //          default: 76
        //        }
        //    76: getfield        net/minecraft/util/math/RayTraceResult.field_72313_a:Lnet/minecraft/util/math/RayTraceResult$Type;
        //    79: getstatic       net/minecraft/util/math/RayTraceResult$Type.BLOCK:Lnet/minecraft/util/math/RayTraceResult$Type;
        //    82: if_acmpne       90
        //    85: ldc             -2059326092
        //    87: goto            92
        //    90: ldc             -2059326085
        //    92: ldc             1235592371
        //    94: ixor           
        //    95: tableswitch {
        //          -1714875506: 116
        //          -1714875505: 2619
        //          default: 85
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //   130: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //   133: getstatic       dev/nuker/pyro/fc.c:I
        //   136: ifge            144
        //   139: ldc             -1159191181
        //   141: goto            146
        //   144: ldc             -2046513062
        //   146: ldc             -1983956704
        //   148: ixor           
        //   149: lookupswitch {
        //          263948666: 176
        //          861346899: 144
        //          default: 2678
        //        }
        //   176: getstatic       net/minecraft/client/renderer/GlStateManager$SourceFactor.ONE:Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;
        //   179: getstatic       dev/nuker/pyro/fc.c:I
        //   182: ifge            190
        //   185: ldc             -2092291012
        //   187: goto            192
        //   190: ldc             -993247394
        //   192: ldc             1480599652
        //   194: ixor           
        //   195: lookupswitch {
        //          -620100520: 2658
        //          1593479942: 190
        //          default: 220
        //        }
        //   220: getstatic       net/minecraft/client/renderer/GlStateManager$DestFactor.ZERO:Lnet/minecraft/client/renderer/GlStateManager$DestFactor;
        //   223: goto            227
        //   226: athrow         
        //   227: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187428_a:(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V
        //   230: goto            234
        //   233: athrow         
        //   234: aload_0        
        //   235: getfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0d;
        //   238: goto            242
        //   241: athrow         
        //   242: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   245: goto            249
        //   248: athrow         
        //   249: checkcast       Ljava/lang/Number;
        //   252: goto            256
        //   255: athrow         
        //   256: invokevirtual   java/lang/Number.doubleValue:()D
        //   259: goto            263
        //   262: athrow         
        //   263: getstatic       dev/nuker/pyro/fc.1:I
        //   266: ifeq            274
        //   269: ldc             295752529
        //   271: goto            276
        //   274: ldc             1009142213
        //   276: ldc             1116811779
        //   278: ixor           
        //   279: lookupswitch {
        //          1395777874: 274
        //          2125953990: 304
        //          default: 2696
        //        }
        //   304: dstore          5
        //   306: dload           5
        //   308: d2f            
        //   309: getstatic       dev/nuker/pyro/fc.1:I
        //   312: ifeq            320
        //   315: ldc             1573311894
        //   317: goto            322
        //   320: ldc             863441014
        //   322: ldc             1886436822
        //   324: ixor           
        //   325: lookupswitch {
        //          -1787425984: 320
        //          766928960: 2682
        //          default: 352
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187441_d:(F)V
        //   359: goto            363
        //   362: athrow         
        //   363: goto            367
        //   366: athrow         
        //   367: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //   370: goto            374
        //   373: athrow         
        //   374: iconst_0       
        //   375: goto            379
        //   378: athrow         
        //   379: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //   382: goto            386
        //   385: athrow         
        //   386: getstatic       dev/nuker/pyro/fc.c:I
        //   389: ifge            397
        //   392: ldc             178058576
        //   394: goto            399
        //   397: ldc             1820902053
        //   399: ldc             916205166
        //   401: ixor           
        //   402: lookupswitch {
        //          -1642262174: 397
        //          1006689086: 2692
        //          default: 428
        //        }
        //   428: aload_2        
        //   429: goto            433
        //   432: athrow         
        //   433: invokevirtual   net/minecraft/util/math/RayTraceResult.func_178782_a:()Lnet/minecraft/util/math/BlockPos;
        //   436: goto            440
        //   439: athrow         
        //   440: astore          7
        //   442: aload_0        
        //   443: getstatic       dev/nuker/pyro/fc.0:I
        //   446: ifeq            454
        //   449: ldc             227493784
        //   451: goto            456
        //   454: ldc             -650546334
        //   456: ldc             1763122040
        //   458: ixor           
        //   459: lookupswitch {
        //          -1339135974: 484
        //          1687706848: 454
        //          default: 2638
        //        }
        //   484: getfield        dev/nuker/pyro/f9b.c:Lnet/minecraft/client/Minecraft;
        //   487: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   490: getstatic       dev/nuker/pyro/fc.1:I
        //   493: ifeq            501
        //   496: ldc             -844939001
        //   498: goto            503
        //   501: ldc             152711538
        //   503: ldc             -713217782
        //   505: ixor           
        //   506: lookupswitch {
        //          -597223304: 532
        //          417228813: 501
        //          default: 2690
        //        }
        //   532: aload           7
        //   534: goto            538
        //   537: athrow         
        //   538: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   541: goto            545
        //   544: athrow         
        //   545: astore          8
        //   547: aload           8
        //   549: dup            
        //   550: pop            
        //   551: goto            555
        //   554: athrow         
        //   555: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   560: goto            564
        //   563: athrow         
        //   564: getstatic       dev/nuker/pyro/fc.0:I
        //   567: ifeq            575
        //   570: ldc             965693199
        //   572: goto            577
        //   575: ldc             513769092
        //   577: ldc             -1886421317
        //   579: ixor           
        //   580: lookupswitch {
        //          -1861222337: 608
        //          -1241501260: 575
        //          default: 2652
        //        }
        //   608: getstatic       net/minecraft/block/material/Material.field_151579_a:Lnet/minecraft/block/material/Material;
        //   611: if_acmpeq       2541
        //   614: getstatic       dev/nuker/pyro/fc.c:I
        //   617: ifge            625
        //   620: ldc             -424158043
        //   622: goto            627
        //   625: ldc             -2017941403
        //   627: ldc             -1449025776
        //   629: ixor           
        //   630: lookupswitch {
        //          700779885: 625
        //          1326859189: 2650
        //          default: 656
        //        }
        //   656: aload_0        
        //   657: getfield        dev/nuker/pyro/f9b.c:Lnet/minecraft/client/Minecraft;
        //   660: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   663: dup            
        //   664: pop            
        //   665: goto            669
        //   668: athrow         
        //   669: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175723_af:()Lnet/minecraft/world/border/WorldBorder;
        //   672: goto            676
        //   675: athrow         
        //   676: aload           7
        //   678: goto            682
        //   681: athrow         
        //   682: invokevirtual   net/minecraft/world/border/WorldBorder.func_177746_a:(Lnet/minecraft/util/math/BlockPos;)Z
        //   685: goto            689
        //   688: athrow         
        //   689: ifeq            697
        //   692: ldc             -524401087
        //   694: goto            699
        //   697: ldc             -524401082
        //   699: ldc             955452378
        //   701: ixor           
        //   702: tableswitch {
        //          -1332045002: 724
        //          -1332045001: 2541
        //          default: 692
        //        }
        //   724: getstatic       dev/nuker/pyro/fc.c:I
        //   727: ifge            735
        //   730: ldc             1995597385
        //   732: goto            737
        //   735: ldc             -2013804459
        //   737: ldc             -518035087
        //   739: ixor           
        //   740: lookupswitch {
        //          -1746071752: 2632
        //          1155830538: 735
        //          default: 768
        //        }
        //   768: aload_1        
        //   769: getstatic       dev/nuker/pyro/fc.1:I
        //   772: ifeq            780
        //   775: ldc             -1788831196
        //   777: goto            782
        //   780: ldc             93150957
        //   782: ldc             -1203280739
        //   784: ixor           
        //   785: lookupswitch {
        //          -1110820240: 812
        //          757595833: 780
        //          default: 2628
        //        }
        //   812: getfield        net/minecraft/entity/player/EntityPlayer.field_70142_S:D
        //   815: aload_1        
        //   816: getfield        net/minecraft/entity/player/EntityPlayer.field_70165_t:D
        //   819: aload_1        
        //   820: getfield        net/minecraft/entity/player/EntityPlayer.field_70142_S:D
        //   823: dsub           
        //   824: fload           4
        //   826: f2d            
        //   827: dmul           
        //   828: dadd           
        //   829: dstore          9
        //   831: getstatic       dev/nuker/pyro/fc.c:I
        //   834: ifge            842
        //   837: ldc             -1684879331
        //   839: goto            844
        //   842: ldc             432148092
        //   844: ldc             -2062465507
        //   846: ixor           
        //   847: lookupswitch {
        //          -1663874975: 872
        //          511938048: 842
        //          default: 2674
        //        }
        //   872: aload_1        
        //   873: getfield        net/minecraft/entity/player/EntityPlayer.field_70137_T:D
        //   876: aload_1        
        //   877: getfield        net/minecraft/entity/player/EntityPlayer.field_70163_u:D
        //   880: getstatic       dev/nuker/pyro/fc.1:I
        //   883: ifeq            891
        //   886: ldc             526568952
        //   888: goto            893
        //   891: ldc             1636623169
        //   893: ldc             1077795049
        //   895: ixor           
        //   896: lookupswitch {
        //          1117866026: 891
        //          1600066833: 2646
        //          default: 924
        //        }
        //   924: aload_1        
        //   925: getfield        net/minecraft/entity/player/EntityPlayer.field_70137_T:D
        //   928: dsub           
        //   929: fload           4
        //   931: f2d            
        //   932: dmul           
        //   933: dadd           
        //   934: dstore          11
        //   936: aload_1        
        //   937: getstatic       dev/nuker/pyro/fc.c:I
        //   940: ifge            948
        //   943: ldc             -2125871982
        //   945: goto            950
        //   948: ldc             -1739112626
        //   950: ldc             -1358750932
        //   952: ixor           
        //   953: lookupswitch {
        //          776658878: 948
        //          928261218: 980
        //          default: 2672
        //        }
        //   980: getfield        net/minecraft/entity/player/EntityPlayer.field_70136_U:D
        //   983: getstatic       dev/nuker/pyro/fc.0:I
        //   986: ifeq            994
        //   989: ldc             -2123693086
        //   991: goto            996
        //   994: ldc             2144963875
        //   996: ldc             549829897
        //   998: ixor           
        //   999: lookupswitch {
        //          -1582383381: 2648
        //          -119858369: 994
        //          default: 1024
        //        }
        //  1024: aload_1        
        //  1025: getfield        net/minecraft/entity/player/EntityPlayer.field_70161_v:D
        //  1028: aload_1        
        //  1029: getstatic       dev/nuker/pyro/fc.1:I
        //  1032: ifeq            1040
        //  1035: ldc             -2029786127
        //  1037: goto            1042
        //  1040: ldc             -1725136034
        //  1042: ldc             1688289069
        //  1044: ixor           
        //  1045: lookupswitch {
        //          -475867940: 2644
        //          -228117892: 1040
        //          default: 1072
        //        }
        //  1072: getfield        net/minecraft/entity/player/EntityPlayer.field_70136_U:D
        //  1075: dsub           
        //  1076: fload           4
        //  1078: f2d            
        //  1079: dmul           
        //  1080: dadd           
        //  1081: getstatic       dev/nuker/pyro/fc.c:I
        //  1084: ifge            1092
        //  1087: ldc             1192749408
        //  1089: goto            1094
        //  1092: ldc             1514818517
        //  1094: ldc             988585081
        //  1096: ixor           
        //  1097: lookupswitch {
        //          1328723994: 1092
        //          2113631513: 2666
        //          default: 1124
        //        }
        //  1124: dstore          13
        //  1126: aload_0        
        //  1127: getfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0b;
        //  1130: goto            1134
        //  1133: athrow         
        //  1134: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1137: goto            1141
        //  1140: athrow         
        //  1141: checkcast       Ldev/nuker/pyro/fS;
        //  1144: getstatic       dev/nuker/pyro/fc.1:I
        //  1147: ifeq            1156
        //  1150: ldc_w           -437561049
        //  1153: goto            1159
        //  1156: ldc_w           -5890260
        //  1159: ldc_w           -356772264
        //  1162: ixor           
        //  1163: lookupswitch {
        //          257380223: 1156
        //          354027892: 1188
        //          default: 2676
        //        }
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: invokevirtual   dev/nuker/pyro/fS.8:()F
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: fstore          15
        //  1201: aload_0        
        //  1202: getfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0b;
        //  1205: goto            1209
        //  1208: athrow         
        //  1209: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: checkcast       Ldev/nuker/pyro/fS;
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: invokevirtual   dev/nuker/pyro/fS.2:()F
        //  1226: goto            1230
        //  1229: athrow         
        //  1230: fstore          16
        //  1232: getstatic       dev/nuker/pyro/fc.1:I
        //  1235: ifeq            1244
        //  1238: ldc_w           -1112126572
        //  1241: goto            1247
        //  1244: ldc_w           -398829158
        //  1247: ldc_w           -1951205277
        //  1250: ixor           
        //  1251: lookupswitch {
        //          906277879: 2642
        //          1485812897: 1244
        //          default: 1276
        //        }
        //  1276: aload_0        
        //  1277: getfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0b;
        //  1280: goto            1284
        //  1283: athrow         
        //  1284: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1287: goto            1291
        //  1290: athrow         
        //  1291: checkcast       Ldev/nuker/pyro/fS;
        //  1294: getstatic       dev/nuker/pyro/fc.1:I
        //  1297: ifeq            1306
        //  1300: ldc_w           -598556952
        //  1303: goto            1309
        //  1306: ldc_w           465796126
        //  1309: ldc_w           -6820914
        //  1312: ixor           
        //  1313: lookupswitch {
        //          600134950: 2684
        //          914555765: 1306
        //          default: 1340
        //        }
        //  1340: goto            1344
        //  1343: athrow         
        //  1344: invokevirtual   dev/nuker/pyro/fS.b:()F
        //  1347: goto            1351
        //  1350: athrow         
        //  1351: getstatic       dev/nuker/pyro/fc.1:I
        //  1354: ifeq            1363
        //  1357: ldc_w           1229948344
        //  1360: goto            1366
        //  1363: ldc_w           -362480324
        //  1366: ldc_w           -1838494396
        //  1369: ixor           
        //  1370: lookupswitch {
        //          -618313476: 2622
        //          1315091969: 1363
        //          default: 1396
        //        }
        //  1396: fstore          17
        //  1398: aload_0        
        //  1399: getfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0b;
        //  1402: getstatic       dev/nuker/pyro/fc.c:I
        //  1405: ifge            1414
        //  1408: ldc_w           1893100796
        //  1411: goto            1417
        //  1414: ldc_w           341220358
        //  1417: ldc_w           -1076538660
        //  1420: ixor           
        //  1421: lookupswitch {
        //          -821871072: 2698
        //          1634816826: 1414
        //          default: 1448
        //        }
        //  1448: goto            1452
        //  1451: athrow         
        //  1452: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1455: goto            1459
        //  1458: athrow         
        //  1459: checkcast       Ldev/nuker/pyro/fS;
        //  1462: getstatic       dev/nuker/pyro/fc.0:I
        //  1465: ifeq            1474
        //  1468: ldc_w           433509933
        //  1471: goto            1477
        //  1474: ldc_w           163856637
        //  1477: ldc_w           -1669505929
        //  1480: ixor           
        //  1481: lookupswitch {
        //          -2052355494: 2694
        //          2085123588: 1474
        //          default: 1508
        //        }
        //  1508: goto            1512
        //  1511: athrow         
        //  1512: invokevirtual   dev/nuker/pyro/fS.9:()F
        //  1515: goto            1519
        //  1518: athrow         
        //  1519: fstore          18
        //  1521: getstatic       dev/nuker/pyro/fc.0:I
        //  1524: ifeq            1533
        //  1527: ldc_w           -1664401289
        //  1530: goto            1536
        //  1533: ldc_w           338580284
        //  1536: ldc_w           114505733
        //  1539: ixor           
        //  1540: lookupswitch {
        //          -1709672334: 2686
        //          1734885522: 1533
        //          default: 1568
        //        }
        //  1568: aload           8
        //  1570: aload_0        
        //  1571: getstatic       dev/nuker/pyro/fc.1:I
        //  1574: ifeq            1583
        //  1577: ldc_w           -889001934
        //  1580: goto            1586
        //  1583: ldc_w           -783015466
        //  1586: ldc_w           1450165828
        //  1589: ixor           
        //  1590: lookupswitch {
        //          -1653789066: 2680
        //          413469729: 1583
        //          default: 1616
        //        }
        //  1616: getfield        dev/nuker/pyro/f9b.c:Lnet/minecraft/client/Minecraft;
        //  1619: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1622: checkcast       Lnet/minecraft/world/World;
        //  1625: aload           7
        //  1627: goto            1631
        //  1630: athrow         
        //  1631: invokeinterface net/minecraft/block/state/IBlockState.func_185918_c:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1636: goto            1640
        //  1639: athrow         
        //  1640: ldc2_w          0.0020000000949949026
        //  1643: aload_0        
        //  1644: getstatic       dev/nuker/pyro/fc.0:I
        //  1647: ifeq            1656
        //  1650: ldc_w           1958437526
        //  1653: goto            1659
        //  1656: ldc_w           531771079
        //  1659: ldc_w           -1383945659
        //  1662: ixor           
        //  1663: lookupswitch {
        //          -1305443198: 1688
        //          -650524461: 1656
        //          default: 2662
        //        }
        //  1688: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0d;
        //  1691: goto            1695
        //  1694: athrow         
        //  1695: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1698: goto            1702
        //  1701: athrow         
        //  1702: checkcast       Ljava/lang/Number;
        //  1705: goto            1709
        //  1708: athrow         
        //  1709: invokevirtual   java/lang/Number.doubleValue:()D
        //  1712: goto            1716
        //  1715: athrow         
        //  1716: dmul           
        //  1717: goto            1721
        //  1720: athrow         
        //  1721: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_186662_g:(D)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1724: goto            1728
        //  1727: athrow         
        //  1728: dload           9
        //  1730: dneg           
        //  1731: dload           11
        //  1733: dneg           
        //  1734: dload           13
        //  1736: dneg           
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: fload           15
        //  1750: fload           16
        //  1752: fload           17
        //  1754: getstatic       dev/nuker/pyro/fc.1:I
        //  1757: ifeq            1766
        //  1760: ldc_w           48889563
        //  1763: goto            1769
        //  1766: ldc_w           1214653572
        //  1769: ldc_w           -293580471
        //  1772: ixor           
        //  1773: lookupswitch {
        //          -1494846003: 1800
        //          -328618094: 1766
        //          default: 2624
        //        }
        //  1800: fload           18
        //  1802: getstatic       dev/nuker/pyro/fc.1:I
        //  1805: ifeq            1814
        //  1808: ldc_w           165565685
        //  1811: goto            1817
        //  1814: ldc_w           177513528
        //  1817: ldc_w           -1168791560
        //  1820: ixor           
        //  1821: lookupswitch {
        //          -1329527872: 1848
        //          -1282673907: 1814
        //          default: 2664
        //        }
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: invokestatic    net/minecraft/client/renderer/RenderGlobal.func_189696_b:(Lnet/minecraft/util/math/AxisAlignedBB;FFFF)V
        //  1855: goto            1859
        //  1858: athrow         
        //  1859: aload_0        
        //  1860: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0b;
        //  1863: getstatic       dev/nuker/pyro/fc.1:I
        //  1866: ifeq            1875
        //  1869: ldc_w           -1362961462
        //  1872: goto            1878
        //  1875: ldc_w           -593302306
        //  1878: ldc_w           195884659
        //  1881: ixor           
        //  1882: lookupswitch {
        //          -1519505991: 2670
        //          793746868: 1875
        //          default: 1908
        //        }
        //  1908: goto            1912
        //  1911: athrow         
        //  1912: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1915: goto            1919
        //  1918: athrow         
        //  1919: checkcast       Ldev/nuker/pyro/fS;
        //  1922: goto            1926
        //  1925: athrow         
        //  1926: invokevirtual   dev/nuker/pyro/fS.8:()F
        //  1929: goto            1933
        //  1932: athrow         
        //  1933: fstore          15
        //  1935: getstatic       dev/nuker/pyro/fc.1:I
        //  1938: ifeq            1947
        //  1941: ldc_w           1228500586
        //  1944: goto            1950
        //  1947: ldc_w           -822705919
        //  1950: ldc_w           77800156
        //  1953: ixor           
        //  1954: lookupswitch {
        //          -900357155: 1980
        //          1301957814: 1947
        //          default: 2656
        //        }
        //  1980: aload_0        
        //  1981: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0b;
        //  1984: goto            1988
        //  1987: athrow         
        //  1988: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  1991: goto            1995
        //  1994: athrow         
        //  1995: checkcast       Ldev/nuker/pyro/fS;
        //  1998: goto            2002
        //  2001: athrow         
        //  2002: invokevirtual   dev/nuker/pyro/fS.2:()F
        //  2005: goto            2009
        //  2008: athrow         
        //  2009: fstore          16
        //  2011: aload_0        
        //  2012: getstatic       dev/nuker/pyro/fc.c:I
        //  2015: ifge            2024
        //  2018: ldc_w           1413576051
        //  2021: goto            2027
        //  2024: ldc_w           -1264606804
        //  2027: ldc_w           1396604258
        //  2030: ixor           
        //  2031: lookupswitch {
        //          125765649: 2654
        //          1424127503: 2024
        //          default: 2056
        //        }
        //  2056: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0b;
        //  2059: goto            2063
        //  2062: athrow         
        //  2063: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  2066: goto            2070
        //  2069: athrow         
        //  2070: checkcast       Ldev/nuker/pyro/fS;
        //  2073: goto            2077
        //  2076: athrow         
        //  2077: invokevirtual   dev/nuker/pyro/fS.b:()F
        //  2080: goto            2084
        //  2083: athrow         
        //  2084: getstatic       dev/nuker/pyro/fc.c:I
        //  2087: ifge            2096
        //  2090: ldc_w           526616765
        //  2093: goto            2099
        //  2096: ldc_w           1854333476
        //  2099: ldc_w           -944123575
        //  2102: ixor           
        //  2103: lookupswitch {
        //          -2024968058: 2096
        //          -656778764: 2634
        //          default: 2128
        //        }
        //  2128: fstore          17
        //  2130: getstatic       dev/nuker/pyro/fc.1:I
        //  2133: ifeq            2142
        //  2136: ldc_w           335697172
        //  2139: goto            2145
        //  2142: ldc_w           675584322
        //  2145: ldc_w           -2125480017
        //  2148: ixor           
        //  2149: lookupswitch {
        //          -1790055749: 2620
        //          -506159488: 2142
        //          default: 2176
        //        }
        //  2176: aload_0        
        //  2177: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0b;
        //  2180: getstatic       dev/nuker/pyro/fc.0:I
        //  2183: ifeq            2192
        //  2186: ldc_w           1410186679
        //  2189: goto            2195
        //  2192: ldc_w           1537028455
        //  2195: ldc_w           -256852073
        //  2198: ixor           
        //  2199: lookupswitch {
        //          -1531117024: 2636
        //          822467829: 2192
        //          default: 2224
        //        }
        //  2224: goto            2228
        //  2227: athrow         
        //  2228: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //  2231: goto            2235
        //  2234: athrow         
        //  2235: checkcast       Ldev/nuker/pyro/fS;
        //  2238: goto            2242
        //  2241: athrow         
        //  2242: invokevirtual   dev/nuker/pyro/fS.9:()F
        //  2245: goto            2249
        //  2248: athrow         
        //  2249: fstore          18
        //  2251: getstatic       dev/nuker/pyro/fc.0:I
        //  2254: ifeq            2263
        //  2257: ldc_w           -2049335854
        //  2260: goto            2266
        //  2263: ldc_w           -4224072
        //  2266: ldc_w           965702988
        //  2269: ixor           
        //  2270: lookupswitch {
        //          -1135155042: 2263
        //          -969867532: 2296
        //          default: 2668
        //        }
        //  2296: aload           8
        //  2298: aload_0        
        //  2299: getfield        dev/nuker/pyro/f9b.c:Lnet/minecraft/client/Minecraft;
        //  2302: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2305: checkcast       Lnet/minecraft/world/World;
        //  2308: aload           7
        //  2310: goto            2314
        //  2313: athrow         
        //  2314: invokeinterface net/minecraft/block/state/IBlockState.func_185918_c:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;
        //  2319: goto            2323
        //  2322: athrow         
        //  2323: ldc2_w          0.0020000000949949026
        //  2326: aload_0        
        //  2327: getfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0d;
        //  2330: goto            2334
        //  2333: athrow         
        //  2334: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2337: goto            2341
        //  2340: athrow         
        //  2341: checkcast       Ljava/lang/Number;
        //  2344: goto            2348
        //  2347: athrow         
        //  2348: invokevirtual   java/lang/Number.doubleValue:()D
        //  2351: goto            2355
        //  2354: athrow         
        //  2355: dmul           
        //  2356: goto            2360
        //  2359: athrow         
        //  2360: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_186662_g:(D)Lnet/minecraft/util/math/AxisAlignedBB;
        //  2363: goto            2367
        //  2366: athrow         
        //  2367: dload           9
        //  2369: dneg           
        //  2370: dload           11
        //  2372: dneg           
        //  2373: dload           13
        //  2375: dneg           
        //  2376: goto            2380
        //  2379: athrow         
        //  2380: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  2383: goto            2387
        //  2386: athrow         
        //  2387: getstatic       dev/nuker/pyro/fc.c:I
        //  2390: ifge            2399
        //  2393: ldc_w           -292760581
        //  2396: goto            2402
        //  2399: ldc_w           -2089025445
        //  2402: ldc_w           -327871868
        //  2405: ixor           
        //  2406: lookupswitch {
        //          49922431: 2399
        //          1862865631: 2432
        //          default: 2660
        //        }
        //  2432: fload           15
        //  2434: fload           16
        //  2436: getstatic       dev/nuker/pyro/fc.1:I
        //  2439: ifeq            2448
        //  2442: ldc_w           315090941
        //  2445: goto            2451
        //  2448: ldc_w           307661191
        //  2451: ldc_w           2080911468
        //  2454: ixor           
        //  2455: lookupswitch {
        //          1666373642: 2448
        //          1859114897: 2630
        //          default: 2480
        //        }
        //  2480: fload           17
        //  2482: getstatic       dev/nuker/pyro/fc.c:I
        //  2485: ifge            2494
        //  2488: ldc_w           -496389547
        //  2491: goto            2497
        //  2494: ldc_w           -1782247295
        //  2497: ldc_w           38546853
        //  2500: ixor           
        //  2501: lookupswitch {
        //          -534405136: 2640
        //          1883521508: 2494
        //          default: 2528
        //        }
        //  2528: fload           18
        //  2530: goto            2534
        //  2533: athrow         
        //  2534: invokestatic    net/minecraft/client/renderer/RenderGlobal.func_189697_a:(Lnet/minecraft/util/math/AxisAlignedBB;FFFF)V
        //  2537: goto            2541
        //  2540: athrow         
        //  2541: iconst_1       
        //  2542: goto            2546
        //  2545: athrow         
        //  2546: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //  2549: goto            2553
        //  2552: athrow         
        //  2553: goto            2557
        //  2556: athrow         
        //  2557: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //  2560: goto            2564
        //  2563: athrow         
        //  2564: getstatic       dev/nuker/pyro/fc.0:I
        //  2567: ifeq            2576
        //  2570: ldc_w           -1469203240
        //  2573: goto            2579
        //  2576: ldc_w           -1429812108
        //  2579: ldc_w           -2110195582
        //  2582: ixor           
        //  2583: lookupswitch {
        //          -1851925097: 2576
        //          710231130: 2688
        //          default: 2608
        //        }
        //  2608: goto            2612
        //  2611: athrow         
        //  2612: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //  2615: goto            2619
        //  2618: athrow         
        //  2619: return         
        //  2620: aconst_null    
        //  2621: athrow         
        //  2622: aconst_null    
        //  2623: athrow         
        //  2624: aconst_null    
        //  2625: athrow         
        //  2626: aconst_null    
        //  2627: athrow         
        //  2628: aconst_null    
        //  2629: athrow         
        //  2630: aconst_null    
        //  2631: athrow         
        //  2632: aconst_null    
        //  2633: athrow         
        //  2634: aconst_null    
        //  2635: athrow         
        //  2636: aconst_null    
        //  2637: athrow         
        //  2638: aconst_null    
        //  2639: athrow         
        //  2640: aconst_null    
        //  2641: athrow         
        //  2642: aconst_null    
        //  2643: athrow         
        //  2644: aconst_null    
        //  2645: athrow         
        //  2646: aconst_null    
        //  2647: athrow         
        //  2648: aconst_null    
        //  2649: athrow         
        //  2650: aconst_null    
        //  2651: athrow         
        //  2652: aconst_null    
        //  2653: athrow         
        //  2654: aconst_null    
        //  2655: athrow         
        //  2656: aconst_null    
        //  2657: athrow         
        //  2658: aconst_null    
        //  2659: athrow         
        //  2660: aconst_null    
        //  2661: athrow         
        //  2662: aconst_null    
        //  2663: athrow         
        //  2664: aconst_null    
        //  2665: athrow         
        //  2666: aconst_null    
        //  2667: athrow         
        //  2668: aconst_null    
        //  2669: athrow         
        //  2670: aconst_null    
        //  2671: athrow         
        //  2672: aconst_null    
        //  2673: athrow         
        //  2674: aconst_null    
        //  2675: athrow         
        //  2676: aconst_null    
        //  2677: athrow         
        //  2678: aconst_null    
        //  2679: athrow         
        //  2680: aconst_null    
        //  2681: athrow         
        //  2682: aconst_null    
        //  2683: athrow         
        //  2684: aconst_null    
        //  2685: athrow         
        //  2686: aconst_null    
        //  2687: athrow         
        //  2688: aconst_null    
        //  2689: athrow         
        //  2690: aconst_null    
        //  2691: athrow         
        //  2692: aconst_null    
        //  2693: athrow         
        //  2694: aconst_null    
        //  2695: athrow         
        //  2696: aconst_null    
        //  2697: athrow         
        //  2698: aconst_null    
        //  2699: athrow         
        //  2700: pop            
        //  2701: goto            24
        //  2704: pop            
        //  2705: aconst_null    
        //  2706: goto            2700
        //  2709: dup            
        //  2710: ifnull          2700
        //  2713: checkcast       Ljava/lang/Throwable;
        //  2716: athrow         
        //  2717: dup            
        //  2718: ifnull          2704
        //  2721: checkcast       Ljava/lang/Throwable;
        //  2724: athrow         
        //  2725: aconst_null    
        //  2726: athrow         
        //    StackMapTable: 01 5D 43 07 00 3A 04 FF 00 0B 00 00 00 01 07 00 3A FF 00 03 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 00 53 07 00 41 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 02 07 00 41 01 5D 07 00 41 08 04 41 01 17 42 07 00 3A 00 45 07 00 3A 00 FF 00 10 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 02 07 00 55 07 00 5B FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 03 07 00 55 07 00 5B 01 FF 00 1D 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 02 07 00 55 07 00 5B FF 00 0D 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 03 07 00 55 07 00 5B 07 00 55 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 04 07 00 55 07 00 5B 07 00 55 01 FF 00 1B 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 03 07 00 55 07 00 5B 07 00 55 45 07 00 3A FF 00 00 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 04 07 00 55 07 00 5B 07 00 55 07 00 5B 45 07 00 3A 00 46 07 00 3A 40 07 00 73 45 07 00 3A 40 07 01 76 45 07 00 3A 40 07 00 79 45 07 00 3A 40 03 4A 03 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 02 03 01 5B 03 FF 00 0F 00 06 07 00 03 07 00 D4 07 00 41 01 02 03 00 01 02 FF 00 01 00 06 07 00 03 07 00 D4 07 00 41 01 02 03 00 02 02 01 5D 02 42 07 00 1F 40 02 45 07 00 3A 00 42 07 00 3A 00 45 07 00 3A 00 43 07 00 3A 40 01 45 07 00 3A 00 0A 41 01 1C FF 00 03 00 00 00 01 07 00 3A FF 00 00 00 06 07 00 03 07 00 D4 07 00 41 01 02 03 00 01 07 00 41 45 07 00 3A 40 07 01 78 FF 00 0D 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 02 07 00 03 01 5B 07 00 03 50 07 00 A9 FF 00 01 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 02 07 00 A9 01 5C 07 00 A9 44 07 00 3A FF 00 00 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 02 07 00 A9 07 01 78 45 07 00 3A 40 07 00 AF FF 00 08 00 00 00 01 07 00 3A FF 00 00 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 01 07 00 AF 47 07 00 3A 40 07 00 B8 4A 07 00 B8 FF 00 01 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 02 07 00 B8 01 5E 07 00 B8 10 41 01 1C 4B 07 00 3A 40 07 00 A9 45 07 00 3A 40 07 00 C5 44 07 00 3A FF 00 00 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 02 07 00 C5 07 01 78 45 07 00 3A 40 01 02 04 41 01 18 0A 41 01 1E 4B 07 00 D4 FF 00 01 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 02 07 00 D4 01 5D 07 00 D4 FC 00 1D 03 41 01 1B FF 00 12 00 09 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 00 02 03 03 FF 00 01 00 09 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 00 03 03 03 01 FF 00 1E 00 09 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 00 02 03 03 FF 00 17 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 01 07 00 D4 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 02 07 00 D4 01 5D 07 00 D4 4D 03 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 02 03 01 5B 03 FF 00 0F 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 03 03 03 07 00 D4 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 04 03 03 07 00 D4 01 FF 00 1D 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 03 03 03 07 00 D4 53 03 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 02 03 01 5D 03 FF 00 08 00 0B 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 00 01 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 4E 07 01 00 FF 00 02 00 0B 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 00 02 07 01 00 01 5C 07 01 00 42 07 00 3A 40 07 01 00 45 07 00 3A 40 02 FF 00 08 00 0C 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 00 01 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 45 07 00 3A 40 07 01 00 45 07 00 3A 40 02 FC 00 0D 02 42 01 1C 46 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 4E 07 01 00 FF 00 02 00 0D 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 00 02 07 01 00 01 5E 07 01 00 42 07 00 3A 40 07 01 00 45 07 00 3A 40 02 4B 02 FF 00 02 00 0D 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 00 02 02 01 5D 02 FF 00 11 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 01 07 00 FD FF 00 02 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 02 07 00 FD 01 5E 07 00 FD 42 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 4E 07 01 00 FF 00 02 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 02 07 01 00 01 5E 07 01 00 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 01 07 01 00 45 07 00 3A 40 02 FC 00 0D 02 42 01 1F FF 00 0E 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 AF 07 00 03 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 00 AF 07 00 03 01 FF 00 1D 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 AF 07 00 03 4D 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 00 AF 07 01 27 07 01 78 47 07 00 3A 40 07 01 34 FF 00 0F 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 03 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 03 07 00 03 01 FF 00 1C 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 03 45 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 73 45 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 01 76 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 79 45 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 03 43 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 01 34 03 45 07 00 3A 40 07 01 34 4B 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 03 03 03 45 07 00 3A 40 07 01 34 FF 00 11 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 01 FF 00 1E 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 FF 00 0D 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 02 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 06 07 01 34 02 02 02 02 01 FF 00 1E 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 02 42 07 00 1F FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 02 45 07 00 3A 00 4F 07 00 FD FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 FD 01 5D 07 00 FD 42 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 45 07 00 2B 40 07 01 00 45 07 00 3A 40 02 0D 42 01 1D 46 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 45 07 00 3A 40 07 01 00 45 07 00 3A 40 02 4E 07 00 03 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 03 01 5C 07 00 03 45 07 00 1B 40 07 00 FD 45 07 00 3A 40 07 01 76 45 07 00 1F 40 07 01 00 45 07 00 3A 40 02 4B 02 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 02 01 5C 02 0D 42 01 1E 4F 07 00 FD FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 FD 01 5C 07 00 FD 42 07 00 3A 40 07 00 FD 45 07 00 3A 40 07 01 76 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 01 07 01 00 45 07 00 3A 40 02 0D 42 01 1D 50 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 00 AF 07 01 27 07 01 78 47 07 00 3A 40 07 01 34 49 07 00 27 FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 73 45 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 01 76 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 79 45 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 03 43 07 00 1F FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 01 34 03 45 07 00 3A 40 07 01 34 4B 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 03 03 03 45 07 00 3A 40 07 01 34 4B 07 01 34 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 01 34 01 5D 07 01 34 FF 00 0F 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 02 02 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 01 FF 00 1C 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 02 02 FF 00 0D 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 FF 00 02 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 01 FF 00 1E 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 44 07 00 3A FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 02 45 07 00 3A FF 00 00 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 00 FF 00 03 00 00 00 01 07 00 3A FF 00 00 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 01 01 45 07 00 3A 00 42 07 00 3A 00 45 07 00 3A 00 0B 42 01 1C 42 07 00 3A 00 45 07 00 3A F8 00 00 FF 00 00 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 00 FF 00 01 00 0D 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 00 01 02 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 01 07 00 41 FF 00 01 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 01 07 00 D4 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 02 02 FF 00 01 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 00 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 01 02 41 07 00 FD FF 00 01 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 01 07 00 03 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 04 07 01 34 02 02 02 F9 00 01 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 03 03 03 07 00 D4 FF 00 01 00 09 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 00 02 03 03 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 01 03 F9 00 01 41 07 00 B8 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 01 07 00 03 01 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 03 07 00 55 07 00 5B 07 00 55 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 01 07 01 34 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 03 07 01 34 03 07 00 03 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 05 07 01 34 02 02 02 02 FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 01 03 FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 00 41 07 00 FD FF 00 01 00 0A 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 00 01 07 00 D4 FA 00 01 FF 00 01 00 0B 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 00 01 07 01 00 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 02 07 00 55 07 00 5B FF 00 01 00 0F 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 02 00 02 07 00 AF 07 00 03 FF 00 01 00 06 07 00 03 07 00 D4 07 00 41 01 02 03 00 01 02 FF 00 01 00 0D 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 00 01 07 01 00 FD 00 01 02 02 FF 00 01 00 08 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 00 00 FF 00 01 00 07 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 00 01 07 00 A9 FA 00 01 FF 00 01 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 01 07 01 00 FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 01 03 FF 00 01 00 0E 07 00 03 07 00 D4 07 00 41 01 02 03 07 01 78 07 00 AF 03 03 03 02 02 02 00 01 07 00 FD FF 00 01 00 05 07 00 03 07 00 D4 07 00 41 01 02 00 01 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 3A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2709   2717   Ljava/lang/IllegalArgumentException;
        //  2709   2717   2709   2717   Ljava/lang/EnumConstantNotPresentException;
        //  2725   2727   3      8      Ljava/lang/AssertionError;
        //  119    126    126    127    Any
        //  120    126    126    127    Any
        //  119    126    3      8      Any
        //  119    126    119    120    Any
        //  119    126    126    127    Any
        //  226    233    233    234    Any
        //  226    233    226    227    Any
        //  226    233    233    234    Any
        //  226    233    3      8      Ljava/lang/UnsupportedOperationException;
        //  226    233    3      8      Any
        //  241    248    248    249    Any
        //  242    248    241    242    Ljava/lang/NegativeArraySizeException;
        //  242    248    248    249    Ljava/lang/RuntimeException;
        //  242    248    241    242    Any
        //  242    248    248    249    Any
        //  255    262    262    263    Any
        //  256    262    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  256    262    255    256    Any
        //  255    262    262    263    Any
        //  255    262    255    256    Ljava/lang/EnumConstantNotPresentException;
        //  355    362    362    363    Any
        //  355    362    362    363    Ljava/lang/NegativeArraySizeException;
        //  356    362    3      8      Any
        //  355    362    3      8      Any
        //  356    362    355    356    Ljava/lang/RuntimeException;
        //  366    373    373    374    Any
        //  366    373    373    374    Any
        //  366    373    373    374    Any
        //  366    373    3      8      Any
        //  366    373    366    367    Any
        //  378    385    385    386    Any
        //  379    385    378    379    Any
        //  379    385    378    379    Ljava/util/NoSuchElementException;
        //  378    385    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  379    385    3      8      Any
        //  433    439    439    440    Any
        //  433    439    439    440    Ljava/lang/UnsupportedOperationException;
        //  433    439    439    440    Ljava/lang/IndexOutOfBoundsException;
        //  433    439    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  433    439    3      8      Any
        //  537    544    544    545    Any
        //  538    544    3      8      Any
        //  538    544    537    538    Ljava/lang/EnumConstantNotPresentException;
        //  538    544    544    545    Ljava/lang/EnumConstantNotPresentException;
        //  537    544    537    538    Any
        //  555    563    563    564    Any
        //  555    563    3      8      Ljava/lang/RuntimeException;
        //  555    563    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  555    563    3      8      Any
        //  555    563    3      8      Ljava/lang/IllegalArgumentException;
        //  668    675    675    676    Any
        //  669    675    668    669    Ljava/lang/RuntimeException;
        //  669    675    3      8      Any
        //  669    675    675    676    Any
        //  668    675    668    669    Any
        //  681    688    688    689    Any
        //  682    688    681    682    Any
        //  681    688    688    689    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  681    688    688    689    Any
        //  681    688    681    682    Any
        //  1133   1140   1140   1141   Any
        //  1133   1140   3      8      Any
        //  1134   1140   1133   1134   Any
        //  1133   1140   3      8      Any
        //  1133   1140   1133   1134   Any
        //  1191   1198   1198   1199   Any
        //  1191   1198   1191   1192   Any
        //  1191   1198   3      8      Any
        //  1192   1198   1198   1199   Ljava/lang/ArithmeticException;
        //  1192   1198   3      8      Any
        //  1208   1215   1215   1216   Any
        //  1208   1215   1215   1216   Any
        //  1208   1215   1215   1216   Any
        //  1208   1215   1208   1209   Any
        //  1209   1215   1215   1216   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1222   1229   1229   1230   Any
        //  1223   1229   1229   1230   Any
        //  1222   1229   1222   1223   Any
        //  1222   1229   1222   1223   Ljava/lang/IllegalStateException;
        //  1222   1229   1229   1230   Ljava/lang/IndexOutOfBoundsException;
        //  1283   1290   1290   1291   Any
        //  1284   1290   3      8      Any
        //  1284   1290   3      8      Any
        //  1284   1290   1283   1284   Any
        //  1283   1290   1283   1284   Ljava/util/ConcurrentModificationException;
        //  1343   1350   1350   1351   Any
        //  1344   1350   3      8      Any
        //  1344   1350   1343   1344   Any
        //  1343   1350   1343   1344   Ljava/util/ConcurrentModificationException;
        //  1344   1350   3      8      Any
        //  1451   1458   1458   1459   Any
        //  1451   1458   1451   1452   Ljava/lang/IndexOutOfBoundsException;
        //  1451   1458   1458   1459   Any
        //  1452   1458   3      8      Ljava/lang/ArithmeticException;
        //  1451   1458   1451   1452   Ljava/lang/AssertionError;
        //  1512   1518   1518   1519   Any
        //  1512   1518   1518   1519   Ljava/lang/NullPointerException;
        //  1512   1518   3      8      Any
        //  1512   1518   3      8      Ljava/lang/NumberFormatException;
        //  1512   1518   3      8      Any
        //  1630   1639   1639   1640   Any
        //  1630   1639   1639   1640   Ljava/lang/RuntimeException;
        //  1630   1639   1630   1631   Any
        //  1630   1639   1630   1631   Ljava/lang/AssertionError;
        //  1630   1639   1630   1631   Any
        //  1694   1701   1701   1702   Any
        //  1694   1701   3      8      Ljava/lang/NumberFormatException;
        //  1695   1701   1694   1695   Any
        //  1695   1701   1701   1702   Ljava/lang/IllegalStateException;
        //  1694   1701   1701   1702   Ljava/lang/ClassCastException;
        //  1709   1715   1715   1716   Any
        //  1709   1715   3      8      Any
        //  1709   1715   3      8      Any
        //  1709   1715   3      8      Any
        //  1709   1715   1715   1716   Any
        //  1720   1727   1727   1728   Any
        //  1720   1727   3      8      Any
        //  1721   1727   1727   1728   Ljava/lang/RuntimeException;
        //  1720   1727   1720   1721   Any
        //  1721   1727   1720   1721   Any
        //  1740   1747   1747   1748   Any
        //  1741   1747   3      8      Ljava/lang/NegativeArraySizeException;
        //  1740   1747   1740   1741   Ljava/lang/NegativeArraySizeException;
        //  1741   1747   1740   1741   Any
        //  1741   1747   1740   1741   Any
        //  1851   1858   1858   1859   Any
        //  1852   1858   1851   1852   Ljava/lang/StringIndexOutOfBoundsException;
        //  1852   1858   1851   1852   Ljava/lang/UnsupportedOperationException;
        //  1852   1858   1851   1852   Ljava/util/ConcurrentModificationException;
        //  1852   1858   1858   1859   Ljava/lang/IllegalArgumentException;
        //  1911   1918   1918   1919   Any
        //  1911   1918   1918   1919   Ljava/lang/NumberFormatException;
        //  1912   1918   1911   1912   Any
        //  1911   1918   1918   1919   Ljava/lang/StringIndexOutOfBoundsException;
        //  1911   1918   1911   1912   Any
        //  1925   1932   1932   1933   Any
        //  1926   1932   3      8      Any
        //  1926   1932   1925   1926   Ljava/lang/IllegalStateException;
        //  1926   1932   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1925   1932   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1987   1994   1994   1995   Any
        //  1988   1994   1987   1988   Any
        //  1988   1994   1987   1988   Any
        //  1987   1994   1994   1995   Any
        //  1988   1994   1987   1988   Any
        //  2001   2008   2008   2009   Any
        //  2002   2008   3      8      Ljava/lang/AssertionError;
        //  2001   2008   2001   2002   Any
        //  2002   2008   2001   2002   Any
        //  2002   2008   2008   2009   Ljava/lang/UnsupportedOperationException;
        //  2062   2069   2069   2070   Any
        //  2063   2069   2069   2070   Any
        //  2062   2069   3      8      Any
        //  2063   2069   2062   2063   Ljava/lang/UnsupportedOperationException;
        //  2062   2069   2069   2070   Ljava/lang/IndexOutOfBoundsException;
        //  2076   2083   2083   2084   Any
        //  2077   2083   2076   2077   Ljava/lang/RuntimeException;
        //  2076   2083   2076   2077   Ljava/lang/IllegalStateException;
        //  2076   2083   3      8      Any
        //  2076   2083   2076   2077   Ljava/util/ConcurrentModificationException;
        //  2227   2234   2234   2235   Any
        //  2227   2234   2234   2235   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2227   2234   2227   2228   Any
        //  2227   2234   3      8      Any
        //  2228   2234   2234   2235   Any
        //  2242   2248   2248   2249   Any
        //  2242   2248   2248   2249   Any
        //  2242   2248   2248   2249   Ljava/lang/EnumConstantNotPresentException;
        //  2242   2248   3      8      Any
        //  2242   2248   2248   2249   Any
        //  2313   2322   2322   2323   Any
        //  2314   2322   2322   2323   Ljava/lang/UnsupportedOperationException;
        //  2313   2322   2313   2314   Any
        //  2313   2322   2322   2323   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2314   2322   2313   2314   Ljava/util/ConcurrentModificationException;
        //  2333   2340   2340   2341   Any
        //  2333   2340   2340   2341   Ljava/lang/IndexOutOfBoundsException;
        //  2334   2340   3      8      Any
        //  2333   2340   2340   2341   Any
        //  2334   2340   2333   2334   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2348   2354   2354   2355   Any
        //  2348   2354   2354   2355   Any
        //  2348   2354   3      8      Any
        //  2348   2354   2354   2355   Any
        //  2348   2354   3      8      Any
        //  2359   2366   2366   2367   Any
        //  2360   2366   2366   2367   Any
        //  2360   2366   2359   2360   Ljava/lang/NegativeArraySizeException;
        //  2359   2366   2359   2360   Ljava/lang/StringIndexOutOfBoundsException;
        //  2359   2366   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2379   2386   2386   2387   Any
        //  2380   2386   2379   2380   Any
        //  2380   2386   2379   2380   Any
        //  2380   2386   2386   2387   Ljava/lang/IllegalStateException;
        //  2380   2386   3      8      Any
        //  2533   2540   2540   2541   Any
        //  2533   2540   3      8      Ljava/lang/NumberFormatException;
        //  2533   2540   2533   2534   Ljava/lang/RuntimeException;
        //  2533   2540   2540   2541   Any
        //  2534   2540   2533   2534   Any
        //  2546   2552   2552   2553   Any
        //  2546   2552   3      8      Any
        //  2546   2552   2552   2553   Any
        //  2546   2552   2552   2553   Ljava/lang/UnsupportedOperationException;
        //  2546   2552   3      8      Any
        //  2556   2563   2563   2564   Any
        //  2557   2563   2563   2564   Any
        //  2556   2563   2556   2557   Any
        //  2557   2563   2563   2564   Any
        //  2556   2563   3      8      Ljava/lang/ClassCastException;
        //  2611   2618   2618   2619   Any
        //  2611   2618   2618   2619   Ljava/lang/RuntimeException;
        //  2611   2618   2618   2619   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2611   2618   2611   2612   Any
        //  2611   2618   2611   2612   Ljava/lang/NegativeArraySizeException;
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
    
    static {
        throw t;
    }
    
    public f9b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2259\u149f\u8b7d\ub3da\uc923\uec55\ub22d\ue758\ud960\ue957\ua694\u1e4b\ue073\uc5b3"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2279\u149f\u8b7d\ub3da\uc923\uec75\ub22d\ue758\ud960\ue957\ua694\u1e4b\ue073\uc5b3"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u227a\u149f\u8b7e\ub3d6\uc93f\uec4e\ub264\ue746\ud967\ue94e\ua6dd\u1e58\ue074\uc5e7\u81df\u88d3\u57b7\u768e\ubd32\uc0ea\u2aa0\uc221\u6b97\u2d16\ud731\u3431\u7d3c\u8871\u8013\u8c70\u8514\ufb31\u7146\u9a05\u1b2e\uf0dd\u496e\u89fb\ucac6\uffc4\ub76a\u41f4\ub863\ub344\u4c97\u8b49\u7c61\ucfae\u7d4b\uea2d"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: iconst_1       
        //    20: getstatic       dev/nuker/pyro/fc.c:I
        //    23: ifge            32
        //    26: ldc_w           1789884206
        //    29: goto            35
        //    32: ldc_w           1231768559
        //    35: ldc_w           476713144
        //    38: ixor           
        //    39: lookupswitch {
        //          737930899: 32
        //          1992648598: 563
        //          default: 64
        //        }
        //    64: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    67: aload_0        
        //    68: aload_0        
        //    69: new             Ldev/nuker/pyro/f0d;
        //    72: dup            
        //    73: ldc_w           "\u2248\u149a\u8b68\ub3dc\uc905\uec48\ub228\ue74b\ud961\ue94b\ua691\u1e45\ue07e\uc5b5"
        //    76: getstatic       dev/nuker/pyro/fc.c:I
        //    79: ifge            88
        //    82: ldc_w           231013713
        //    85: goto            91
        //    88: ldc_w           544894517
        //    91: ldc_w           -687523861
        //    94: ixor           
        //    95: lookupswitch {
        //          -624833862: 88
        //          -142648866: 120
        //          default: 569
        //        }
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: ldc_w           "\u2268\u149a\u8b68\ub3dc\uc905\uec48\ub228\ue74b\ud961\ue94b\ua691\u1e45\ue07e\uc5b5"
        //   126: getstatic       dev/nuker/pyro/fc.0:I
        //   129: ifeq            138
        //   132: ldc_w           551132040
        //   135: goto            141
        //   138: ldc_w           -306497681
        //   141: ldc_w           946767729
        //   144: ixor           
        //   145: lookupswitch {
        //          -707416034: 172
        //          414653689: 138
        //          default: 561
        //        }
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: aconst_null    
        //   176: dconst_1       
        //   177: dconst_1       
        //   178: ldc2_w          20.0
        //   181: dconst_0       
        //   182: bipush          64
        //   184: aconst_null    
        //   185: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   188: checkcast       Ldev/nuker/pyro/f0n;
        //   191: invokevirtual   dev/nuker/pyro/f9b.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   194: checkcast       Ldev/nuker/pyro/f0d;
        //   197: putfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0d;
        //   200: aload_0        
        //   201: aload_0        
        //   202: new             Ldev/nuker/pyro/f0b;
        //   205: dup            
        //   206: ldc_w           "\u2258\u149c\u8b7e\ub3d6\uc93a"
        //   209: invokestatic    invokestatic   !!! ERROR
        //   212: ldc_w           "\u2274\u1486\u8b66\ub3d5\uc921\uec53\ub221\ue77c\ud967\ue957\ua692\u1e5e"
        //   215: invokestatic    invokestatic   !!! ERROR
        //   218: aconst_null    
        //   219: new             Ldev/nuker/pyro/fS;
        //   222: dup            
        //   223: fconst_0       
        //   224: fconst_1       
        //   225: ldc_w           0.5
        //   228: ldc_w           0.5
        //   231: getstatic       dev/nuker/pyro/fc.1:I
        //   234: ifeq            243
        //   237: ldc_w           617755999
        //   240: goto            246
        //   243: ldc_w           1725812957
        //   246: ldc_w           -1471852249
        //   249: ixor           
        //   250: lookupswitch {
        //          -1936235400: 573
        //          -665946569: 243
        //          default: 276
        //        }
        //   276: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   279: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   282: checkcast       Ldev/nuker/pyro/f0n;
        //   285: invokevirtual   dev/nuker/pyro/f9b.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   288: checkcast       Ldev/nuker/pyro/f0b;
        //   291: getstatic       dev/nuker/pyro/fc.c:I
        //   294: ifge            303
        //   297: ldc_w           -999151823
        //   300: goto            306
        //   303: ldc_w           1677527053
        //   306: ldc_w           1790376381
        //   309: ixor           
        //   310: lookupswitch {
        //          -1362829684: 303
        //          155972016: 336
        //          default: 575
        //        }
        //   336: putfield        dev/nuker/pyro/f9b.c:Ldev/nuker/pyro/f0b;
        //   339: aload_0        
        //   340: getstatic       dev/nuker/pyro/fc.c:I
        //   343: ifge            352
        //   346: ldc_w           703210417
        //   349: goto            355
        //   352: ldc_w           -58654349
        //   355: ldc_w           1762793453
        //   358: ixor           
        //   359: lookupswitch {
        //          -1785522530: 384
        //          1090008156: 352
        //          default: 565
        //        }
        //   384: aload_0        
        //   385: new             Ldev/nuker/pyro/f0b;
        //   388: dup            
        //   389: ldc_w           "\u2258\u149c\u8b7e\ub3d6\uc93a\uec72\ub232\ue75a\ud97a\ue957\ua69c\u1e55"
        //   392: invokestatic    invokestatic   !!! ERROR
        //   395: ldc_w           "\u2274\u1485\u8b77\ub3cb\uc924\uec5c\ub23d\ue77c\ud967\ue957\ua692\u1e5e"
        //   398: invokestatic    invokestatic   !!! ERROR
        //   401: aconst_null    
        //   402: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   405: invokevirtual   dev/nuker/pyro/fR.c:()Ldev/nuker/pyro/fS;
        //   408: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   411: checkcast       Ldev/nuker/pyro/f0n;
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            426
        //   420: ldc_w           -680766011
        //   423: goto            429
        //   426: ldc_w           990595677
        //   429: ldc_w           -664646993
        //   432: ixor           
        //   433: lookupswitch {
        //          252583786: 567
        //          2140999122: 426
        //          default: 460
        //        }
        //   460: invokevirtual   dev/nuker/pyro/f9b.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   463: checkcast       Ldev/nuker/pyro/f0b;
        //   466: putfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0b;
        //   469: aload_0        
        //   470: getstatic       dev/nuker/pyro/fc.1:I
        //   473: ifeq            482
        //   476: ldc_w           -1137017754
        //   479: goto            485
        //   482: ldc_w           434161405
        //   485: ldc_w           308807382
        //   488: ixor           
        //   489: lookupswitch {
        //          -1370326352: 482
        //          193511467: 516
        //          default: 571
        //        }
        //   516: aload_0        
        //   517: new             Ldev/nuker/pyro/f0d;
        //   520: dup            
        //   521: ldc_w           "\u2257\u149a\u8b7c\ub3dc\uc91f\uec54\ub220\ue74b\ud960"
        //   524: invokestatic    invokestatic   !!! ERROR
        //   527: ldc_w           "\u2277\u149a\u8b7c\ub3dc\uc91f\uec54\ub220\ue74b\ud960"
        //   530: invokestatic    invokestatic   !!! ERROR
        //   533: aconst_null    
        //   534: ldc2_w          8.0
        //   537: dconst_1       
        //   538: ldc2_w          10.0
        //   541: dconst_0       
        //   542: bipush          64
        //   544: aconst_null    
        //   545: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   548: checkcast       Ldev/nuker/pyro/f0n;
        //   551: invokevirtual   dev/nuker/pyro/f9b.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   554: checkcast       Ldev/nuker/pyro/f0d;
        //   557: putfield        dev/nuker/pyro/f9b.0:Ldev/nuker/pyro/f0d;
        //   560: return         
        //   561: aconst_null    
        //   562: athrow         
        //   563: aconst_null    
        //   564: athrow         
        //   565: aconst_null    
        //   566: athrow         
        //   567: aconst_null    
        //   568: athrow         
        //   569: aconst_null    
        //   570: athrow         
        //   571: aconst_null    
        //   572: athrow         
        //   573: aconst_null    
        //   574: athrow         
        //   575: aconst_null    
        //   576: athrow         
        //    StackMapTable: 00 20 FF 00 20 00 01 06 00 05 06 07 01 D0 07 01 D0 07 01 D0 01 FF 00 02 00 01 06 00 06 06 07 01 D0 07 01 D0 07 01 D0 01 01 FF 00 1C 00 01 06 00 05 06 07 01 D0 07 01 D0 07 01 D0 01 FF 00 17 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 FF 00 11 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 07 01 D0 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 07 01 D0 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 07 01 D0 FF 00 46 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 CA 08 00 CA 07 01 D0 07 01 D0 05 08 00 DB 08 00 DB 02 02 02 02 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 00 CA 08 00 CA 07 01 D0 07 01 D0 05 08 00 DB 08 00 DB 02 02 02 02 01 FF 00 1D 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 CA 08 00 CA 07 01 D0 07 01 D0 05 08 00 DB 08 00 DB 02 02 02 02 FF 00 1A 00 01 07 00 03 00 02 07 00 03 07 00 FD FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 FD 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 FD 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 29 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 9D FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 9D 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 9D 55 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 2C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 07 01 D0 FF 00 01 00 01 06 00 05 06 07 01 D0 07 01 D0 07 01 D0 01 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 9D FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 45 08 00 45 07 01 D0 41 07 00 03 FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 CA 08 00 CA 07 01 D0 07 01 D0 05 08 00 DB 08 00 DB 02 02 02 02 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 FD
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
    
    public void c(@NotNull final f0b f0b) {
        fbS.7X(this, 739167933, f0b);
    }
    
    @NotNull
    public f0b 2() {
        return fbS.1I(this, 1904128602);
    }
    
    @NotNull
    public f0d 0() {
        return fbS.fP(this, 1590497660);
    }
    
    public void 0(@NotNull final f0b f0b) {
        fbS.7Y(this, 2050652901, f0b);
    }
    
    public void c(@NotNull final f0d f0d) {
        fbS.gu(this, 1550682798, f0d);
    }
    
    @NotNull
    public f0b 1() {
        return fbS.1w(this, 1045614543);
    }
    
    public void 0(@NotNull final f0d f0d) {
        fbS.gu(this, 1550682797, f0d);
    }
}
