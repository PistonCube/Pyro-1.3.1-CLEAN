// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;

public class f9Z extends fH
{
    public f0a c;
    public f0a 0;
    public f0a 1;
    public f0a 2;
    public f0a 3;
    public f0a 4;
    public f0a 5;
    public f0k c;
    public f0k 0;
    public f0k 1;
    public f0k 2;
    public f0k 3;
    public f0k 4;
    public f0k 5;
    public f0d c;
    public f0d 0;
    public f0d 1;
    public f0a 6;
    public f0g c;
    public f0a 7;
    public static f9Y c;
    
    public void c(final Entity p0, final Vec3d p1, final f0k p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4215
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            4207
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4199
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             -36071882
        //    32: goto            37
        //    35: ldc             1318513480
        //    37: ldc             -1115796219
        //    39: ixor           
        //    40: lookupswitch {
        //          -202856883: 68
        //          1084742451: 35
        //          default: 4182
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            80
        //    75: ldc             -1865773391
        //    77: goto            82
        //    80: ldc             -94787602
        //    82: ldc             72698947
        //    84: ixor           
        //    85: lookupswitch {
        //          -1801469198: 4152
        //          -1306313437: 80
        //          default: 112
        //        }
        //   112: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   115: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   118: ifnonnull       122
        //   121: return         
        //   122: getstatic       dev/nuker/pyro/fc.1:I
        //   125: ifeq            133
        //   128: ldc             -1532739740
        //   130: goto            135
        //   133: ldc             402239404
        //   135: ldc             -1940416416
        //   137: ixor           
        //   138: lookupswitch {
        //          -1683081268: 164
        //          687056644: 133
        //          default: 4108
        //        }
        //   164: aload_3        
        //   165: ldc             "\u2265\u1492\u8b68\ub1f7\ucf5c\uec6a\ub228\ue758\udb6b"
        //   167: goto            171
        //   170: athrow         
        //   171: invokestatic    invokestatic   !!! ERROR
        //   174: goto            178
        //   177: athrow         
        //   178: goto            182
        //   181: athrow         
        //   182: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   185: goto            189
        //   188: athrow         
        //   189: dup            
        //   190: ifnonnull       204
        //   193: goto            197
        //   196: athrow         
        //   197: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   200: goto            204
        //   203: athrow         
        //   204: checkcast       Ldev/nuker/pyro/f0b;
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   214: goto            218
        //   217: athrow         
        //   218: checkcast       Ldev/nuker/pyro/fS;
        //   221: astore          4
        //   223: aload_3        
        //   224: ldc             "\u2265\u149f\u8b7b\ub1dc\ucf60\uec66\ub22b\ue75b\udb76\uef3e"
        //   226: goto            230
        //   229: athrow         
        //   230: invokestatic    invokestatic   !!! ERROR
        //   233: goto            237
        //   236: athrow         
        //   237: goto            241
        //   240: athrow         
        //   241: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   244: goto            248
        //   247: athrow         
        //   248: dup            
        //   249: ifnonnull       307
        //   252: getstatic       dev/nuker/pyro/fc.c:I
        //   255: ifge            263
        //   258: ldc             1385947565
        //   260: goto            265
        //   263: ldc             -951839271
        //   265: ldc             -396529721
        //   267: ixor           
        //   268: lookupswitch {
        //          -1161392534: 263
        //          790198814: 296
        //          default: 4084
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   303: goto            307
        //   306: athrow         
        //   307: checkcast       Ldev/nuker/pyro/f0a;
        //   310: getstatic       dev/nuker/pyro/fc.0:I
        //   313: ifeq            321
        //   316: ldc             958600786
        //   318: goto            323
        //   321: ldc             431697436
        //   323: ldc             -443863339
        //   325: ixor           
        //   326: lookupswitch {
        //          -592955257: 321
        //          -63962935: 352
        //          default: 4162
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   359: goto            363
        //   362: athrow         
        //   363: checkcast       Ljava/lang/Boolean;
        //   366: getstatic       dev/nuker/pyro/fc.0:I
        //   369: ifeq            377
        //   372: ldc             -2054678660
        //   374: goto            379
        //   377: ldc             2122074484
        //   379: ldc             525806438
        //   381: ixor           
        //   382: lookupswitch {
        //          -1696646118: 4150
        //          -951834496: 377
        //          default: 408
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   415: goto            419
        //   418: athrow         
        //   419: ifeq            469
        //   422: getstatic       dev/nuker/pyro/fc.1:I
        //   425: ifeq            433
        //   428: ldc             -1277687039
        //   430: goto            435
        //   433: ldc             -835373433
        //   435: ldc             -620495063
        //   437: ixor           
        //   438: lookupswitch {
        //          -1049963977: 433
        //          1759245352: 4096
        //          default: 464
        //        }
        //   464: aload           4
        //   466: goto            567
        //   469: aload_3        
        //   470: ldc             "\u226d\u1496\u8b7b\ub1da\ucf60\uec66\ub22b\ue75b\udb76\uef3e"
        //   472: goto            476
        //   475: athrow         
        //   476: invokestatic    invokestatic   !!! ERROR
        //   479: goto            483
        //   482: athrow         
        //   483: getstatic       dev/nuker/pyro/fc.1:I
        //   486: ifeq            494
        //   489: ldc             -137001185
        //   491: goto            496
        //   494: ldc             735168081
        //   496: ldc             1058769328
        //   498: ixor           
        //   499: lookupswitch {
        //          -926019921: 494
        //          348803041: 524
        //          default: 4078
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   531: goto            535
        //   534: athrow         
        //   535: dup            
        //   536: ifnonnull       550
        //   539: goto            543
        //   542: athrow         
        //   543: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   546: goto            550
        //   549: athrow         
        //   550: checkcast       Ldev/nuker/pyro/f0b;
        //   553: goto            557
        //   556: athrow         
        //   557: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   560: goto            564
        //   563: athrow         
        //   564: checkcast       Ldev/nuker/pyro/fS;
        //   567: astore          5
        //   569: aload_0        
        //   570: getstatic       dev/nuker/pyro/fc.c:I
        //   573: ifge            581
        //   576: ldc             546302474
        //   578: goto            583
        //   581: ldc             -336769349
        //   583: ldc             909912126
        //   585: ixor           
        //   586: lookupswitch {
        //          -745857678: 581
        //          380879412: 4186
        //          default: 612
        //        }
        //   612: getstatic       net/minecraft/util/math/Vec3d.field_186680_a:Lnet/minecraft/util/math/Vec3d;
        //   615: dup            
        //   616: pop            
        //   617: getstatic       dev/nuker/pyro/fc.0:I
        //   620: ifeq            628
        //   623: ldc             705187530
        //   625: goto            630
        //   628: ldc             -2075952142
        //   630: ldc             1663608277
        //   632: ixor           
        //   633: lookupswitch {
        //          492615845: 628
        //          1226894111: 4142
        //          default: 660
        //        }
        //   660: aload_0        
        //   661: getstatic       dev/nuker/pyro/fc.0:I
        //   664: ifeq            672
        //   667: ldc             975831204
        //   669: goto            674
        //   672: ldc             848480543
        //   674: ldc             1590995976
        //   676: ixor           
        //   677: lookupswitch {
        //          1694411948: 4118
        //          2026630259: 672
        //          default: 704
        //        }
        //   704: aload_1        
        //   705: getstatic       dev/nuker/pyro/fc.0:I
        //   708: ifeq            716
        //   711: ldc             -885191862
        //   713: goto            718
        //   716: ldc             1180684016
        //   718: ldc             1537303439
        //   720: ixor           
        //   721: lookupswitch {
        //          -1868797755: 716
        //          503229823: 748
        //          default: 4156
        //        }
        //   748: goto            752
        //   751: athrow         
        //   752: invokevirtual   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;
        //   755: goto            759
        //   758: athrow         
        //   759: getstatic       dev/nuker/pyro/fc.0:I
        //   762: ifeq            770
        //   765: ldc             2038093742
        //   767: goto            772
        //   770: ldc             -2128426502
        //   772: ldc             684962922
        //   774: ixor           
        //   775: lookupswitch {
        //          -2053412859: 770
        //          1370055620: 4082
        //          default: 800
        //        }
        //   800: goto            804
        //   803: athrow         
        //   804: invokevirtual   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Ldev/nuker/pyro/fbN;
        //   807: goto            811
        //   810: athrow         
        //   811: astore          8
        //   813: getstatic       dev/nuker/pyro/fc.c:I
        //   816: ifge            824
        //   819: ldc             -966866334
        //   821: goto            826
        //   824: ldc             -1759690519
        //   826: ldc             -507872700
        //   828: ixor           
        //   829: lookupswitch {
        //          591807455: 824
        //          669298726: 4088
        //          default: 856
        //        }
        //   856: aload           8
        //   858: goto            862
        //   861: athrow         
        //   862: invokevirtual   dev/nuker/pyro/fbN.0:()F
        //   865: goto            869
        //   868: athrow         
        //   869: fstore          6
        //   871: aload           8
        //   873: goto            877
        //   876: athrow         
        //   877: invokevirtual   dev/nuker/pyro/fbN.1:()F
        //   880: goto            884
        //   883: athrow         
        //   884: getstatic       dev/nuker/pyro/fc.0:I
        //   887: ifeq            895
        //   890: ldc             -95865581
        //   892: goto            897
        //   895: ldc             2042084103
        //   897: ldc             2125998208
        //   899: ixor           
        //   900: lookupswitch {
        //          -2064573037: 4126
        //          1613064249: 895
        //          default: 928
        //        }
        //   928: fstore          7
        //   930: sipush          180
        //   933: i2f            
        //   934: fload           6
        //   936: fsub           
        //   937: aload_0        
        //   938: getstatic       dev/nuker/pyro/fc.1:I
        //   941: ifeq            949
        //   944: ldc             -1987131601
        //   946: goto            951
        //   949: ldc             788831991
        //   951: ldc             321543090
        //   953: ixor           
        //   954: lookupswitch {
        //          -1700488035: 949
        //          1009698117: 980
        //          default: 4136
        //        }
        //   980: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   983: dup            
        //   984: pop            
        //   985: goto            989
        //   988: athrow         
        //   989: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   992: goto            996
        //   995: athrow         
        //   996: dup            
        //   997: ifnonnull       1011
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: getstatic       dev/nuker/pyro/fc.1:I
        //  1014: ifeq            1022
        //  1017: ldc             474641622
        //  1019: goto            1024
        //  1022: ldc             1687214457
        //  1024: ldc             -156241025
        //  1026: ixor           
        //  1027: lookupswitch {
        //          -354056279: 4172
        //          917829216: 1022
        //          default: 1052
        //        }
        //  1052: getfield        net/minecraft/entity/Entity.field_70177_z:F
        //  1055: fadd           
        //  1056: fstore          6
        //  1058: new             Lnet/minecraft/util/math/Vec3d;
        //  1061: dup            
        //  1062: dconst_0       
        //  1063: dconst_0       
        //  1064: dconst_1       
        //  1065: goto            1069
        //  1068: athrow         
        //  1069: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1072: goto            1076
        //  1075: athrow         
        //  1076: getstatic       dev/nuker/pyro/fc.c:I
        //  1079: ifge            1087
        //  1082: ldc             530876619
        //  1084: goto            1089
        //  1087: ldc             201200140
        //  1089: ldc             208149319
        //  1091: ixor           
        //  1092: lookupswitch {
        //          127273291: 1120
        //          332174220: 1087
        //          default: 4176
        //        }
        //  1120: fload           6
        //  1122: f2d            
        //  1123: goto            1127
        //  1126: athrow         
        //  1127: invokestatic    java/lang/Math.toRadians:(D)D
        //  1130: goto            1134
        //  1133: athrow         
        //  1134: d2f            
        //  1135: getstatic       dev/nuker/pyro/fc.c:I
        //  1138: ifge            1146
        //  1141: ldc             677415185
        //  1143: goto            1148
        //  1146: ldc             1071244622
        //  1148: ldc             504575249
        //  1150: ixor           
        //  1151: lookupswitch {
        //          -492657952: 1146
        //          913554432: 4098
        //          default: 1176
        //        }
        //  1176: goto            1180
        //  1179: athrow         
        //  1180: invokevirtual   net/minecraft/util/math/Vec3d.func_178785_b:(F)Lnet/minecraft/util/math/Vec3d;
        //  1183: goto            1187
        //  1186: athrow         
        //  1187: ldc2_w          180.0
        //  1190: goto            1194
        //  1193: athrow         
        //  1194: invokestatic    java/lang/Math.toRadians:(D)D
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: d2f            
        //  1202: goto            1206
        //  1205: athrow         
        //  1206: invokevirtual   net/minecraft/util/math/Vec3d.func_178789_a:(F)Lnet/minecraft/util/math/Vec3d;
        //  1209: goto            1213
        //  1212: athrow         
        //  1213: astore          8
        //  1215: sipush          770
        //  1218: sipush          771
        //  1221: goto            1225
        //  1224: athrow         
        //  1225: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179112_b:(II)V
        //  1228: goto            1232
        //  1231: athrow         
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //  1239: goto            1243
        //  1242: athrow         
        //  1243: iconst_0       
        //  1244: getstatic       dev/nuker/pyro/fc.c:I
        //  1247: ifge            1255
        //  1250: ldc             1090721230
        //  1252: goto            1257
        //  1255: ldc             -2146591412
        //  1257: ldc             -637517780
        //  1259: ixor           
        //  1260: lookupswitch {
        //          -1694280222: 1255
        //          1510858080: 1288
        //          default: 4080
        //        }
        //  1288: goto            1292
        //  1291: athrow         
        //  1292: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //  1295: goto            1299
        //  1298: athrow         
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179097_i:()V
        //  1306: goto            1310
        //  1309: athrow         
        //  1310: getstatic       dev/nuker/pyro/fc.0:I
        //  1313: ifeq            1321
        //  1316: ldc             1983782810
        //  1318: goto            1323
        //  1321: ldc             396486747
        //  1323: ldc             1549906854
        //  1325: ixor           
        //  1326: lookupswitch {
        //          710913084: 1321
        //          1270897661: 1352
        //          default: 4102
        //        }
        //  1352: aload_1        
        //  1353: aload_0        
        //  1354: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  1357: dup            
        //  1358: pop            
        //  1359: getstatic       dev/nuker/pyro/fc.1:I
        //  1362: ifeq            1370
        //  1365: ldc             1128678695
        //  1367: goto            1372
        //  1370: ldc             -299597999
        //  1372: ldc             2044794728
        //  1374: ixor           
        //  1375: lookupswitch {
        //          -1567872816: 1370
        //          984044111: 4130
        //          default: 1400
        //        }
        //  1400: goto            1404
        //  1403: athrow         
        //  1404: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1407: goto            1411
        //  1410: athrow         
        //  1411: getstatic       dev/nuker/pyro/fc.c:I
        //  1414: ifge            1422
        //  1417: ldc             700962257
        //  1419: goto            1424
        //  1422: ldc             -1310071991
        //  1424: ldc             -70387396
        //  1426: ixor           
        //  1427: lookupswitch {
        //          -1592591030: 1422
        //          -771085075: 4178
        //          default: 1452
        //        }
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: f2d            
        //  1464: aload_0        
        //  1465: getstatic       dev/nuker/pyro/fc.0:I
        //  1468: ifeq            1476
        //  1471: ldc             234311693
        //  1473: goto            1478
        //  1476: ldc             779583905
        //  1478: ldc             -553155237
        //  1480: ixor           
        //  1481: lookupswitch {
        //          -755968682: 4104
        //          -691495654: 1476
        //          default: 1508
        //        }
        //  1508: getfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0d;
        //  1511: goto            1515
        //  1514: athrow         
        //  1515: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1518: goto            1522
        //  1521: athrow         
        //  1522: checkcast       Ljava/lang/Number;
        //  1525: goto            1529
        //  1528: athrow         
        //  1529: invokevirtual   java/lang/Number.doubleValue:()D
        //  1532: goto            1536
        //  1535: athrow         
        //  1536: ddiv           
        //  1537: d2f            
        //  1538: fstore          9
        //  1540: getstatic       dev/nuker/pyro/fc.1:I
        //  1543: ifeq            1552
        //  1546: ldc_w           1492725915
        //  1549: goto            1555
        //  1552: ldc_w           -664271984
        //  1555: ldc_w           -1278909574
        //  1558: ixor           
        //  1559: lookupswitch {
        //          -348367903: 1552
        //          1806524650: 1584
        //          default: 4128
        //        }
        //  1584: aload           4
        //  1586: goto            1590
        //  1589: athrow         
        //  1590: invokevirtual   dev/nuker/pyro/fS.8:()F
        //  1593: goto            1597
        //  1596: athrow         
        //  1597: getstatic       dev/nuker/pyro/fc.0:I
        //  1600: ifeq            1609
        //  1603: ldc_w           -34125738
        //  1606: goto            1612
        //  1609: ldc_w           1375339557
        //  1612: ldc_w           -2017507192
        //  1615: ixor           
        //  1616: lookupswitch {
        //          -1314621311: 1609
        //          2051539166: 4072
        //          default: 1644
        //        }
        //  1644: fload           9
        //  1646: fmul           
        //  1647: getstatic       dev/nuker/pyro/fc.c:I
        //  1650: ifge            1659
        //  1653: ldc_w           1763586261
        //  1656: goto            1662
        //  1659: ldc_w           991941027
        //  1662: ldc_w           1113562127
        //  1665: ixor           
        //  1666: lookupswitch {
        //          725724378: 1659
        //          2034257324: 1692
        //          default: 4074
        //        }
        //  1692: aload           5
        //  1694: getstatic       dev/nuker/pyro/fc.c:I
        //  1697: ifge            1706
        //  1700: ldc_w           1319111048
        //  1703: goto            1709
        //  1706: ldc_w           1425811399
        //  1709: ldc_w           -1671200798
        //  1712: ixor           
        //  1713: lookupswitch {
        //          -929081307: 1740
        //          -758942102: 1706
        //          default: 4092
        //        }
        //  1740: goto            1744
        //  1743: athrow         
        //  1744: invokevirtual   dev/nuker/pyro/fS.8:()F
        //  1747: goto            1751
        //  1750: athrow         
        //  1751: fconst_1       
        //  1752: fload           9
        //  1754: fsub           
        //  1755: fmul           
        //  1756: fadd           
        //  1757: aload           4
        //  1759: goto            1763
        //  1762: athrow         
        //  1763: invokevirtual   dev/nuker/pyro/fS.2:()F
        //  1766: goto            1770
        //  1769: athrow         
        //  1770: fload           9
        //  1772: fmul           
        //  1773: aload           5
        //  1775: goto            1779
        //  1778: athrow         
        //  1779: invokevirtual   dev/nuker/pyro/fS.2:()F
        //  1782: goto            1786
        //  1785: athrow         
        //  1786: fconst_1       
        //  1787: getstatic       dev/nuker/pyro/fc.1:I
        //  1790: ifeq            1799
        //  1793: ldc_w           129346188
        //  1796: goto            1802
        //  1799: ldc_w           -777649601
        //  1802: ldc_w           753497998
        //  1805: ixor           
        //  1806: lookupswitch {
        //          -45124175: 1832
        //          727506178: 1799
        //          default: 4132
        //        }
        //  1832: fload           9
        //  1834: fsub           
        //  1835: fmul           
        //  1836: fadd           
        //  1837: getstatic       dev/nuker/pyro/fc.c:I
        //  1840: ifge            1849
        //  1843: ldc_w           -378381976
        //  1846: goto            1852
        //  1849: ldc_w           153928737
        //  1852: ldc_w           1712808111
        //  1855: ixor           
        //  1856: lookupswitch {
        //          -1889191481: 4110
        //          187316735: 1849
        //          default: 1884
        //        }
        //  1884: aload           4
        //  1886: getstatic       dev/nuker/pyro/fc.c:I
        //  1889: ifge            1898
        //  1892: ldc_w           1219049512
        //  1895: goto            1901
        //  1898: ldc_w           2128084073
        //  1901: ldc_w           1314796761
        //  1904: ixor           
        //  1905: lookupswitch {
        //          116854001: 4146
        //          1138963251: 1898
        //          default: 1932
        //        }
        //  1932: goto            1936
        //  1935: athrow         
        //  1936: invokevirtual   dev/nuker/pyro/fS.b:()F
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: getstatic       dev/nuker/pyro/fc.1:I
        //  1946: ifeq            1955
        //  1949: ldc_w           2113664106
        //  1952: goto            1958
        //  1955: ldc_w           227273432
        //  1958: ldc_w           -966167383
        //  1961: ixor           
        //  1962: lookupswitch {
        //          -1148026685: 1955
        //          -874340751: 1988
        //          default: 4174
        //        }
        //  1988: fload           9
        //  1990: fmul           
        //  1991: aload           5
        //  1993: goto            1997
        //  1996: athrow         
        //  1997: invokevirtual   dev/nuker/pyro/fS.b:()F
        //  2000: goto            2004
        //  2003: athrow         
        //  2004: fconst_1       
        //  2005: fload           9
        //  2007: fsub           
        //  2008: fmul           
        //  2009: fadd           
        //  2010: getstatic       dev/nuker/pyro/fc.c:I
        //  2013: ifge            2022
        //  2016: ldc_w           -82292891
        //  2019: goto            2025
        //  2022: ldc_w           80145620
        //  2025: ldc_w           911091570
        //  2028: ixor           
        //  2029: lookupswitch {
        //          -849975273: 2022
        //          847825830: 2056
        //          default: 4134
        //        }
        //  2056: aload           4
        //  2058: getstatic       dev/nuker/pyro/fc.0:I
        //  2061: ifeq            2070
        //  2064: ldc_w           300791092
        //  2067: goto            2073
        //  2070: ldc_w           2070772439
        //  2073: ldc_w           1041391799
        //  2076: ixor           
        //  2077: lookupswitch {
        //          -1854380245: 2070
        //          805295491: 4120
        //          default: 2104
        //        }
        //  2104: goto            2108
        //  2107: athrow         
        //  2108: invokevirtual   dev/nuker/pyro/fS.9:()F
        //  2111: goto            2115
        //  2114: athrow         
        //  2115: getstatic       dev/nuker/pyro/fc.c:I
        //  2118: ifge            2127
        //  2121: ldc_w           -86058615
        //  2124: goto            2130
        //  2127: ldc_w           -170303361
        //  2130: ldc_w           1743437367
        //  2133: ixor           
        //  2134: lookupswitch {
        //          -1657509954: 4116
        //          1032387556: 2127
        //          default: 2160
        //        }
        //  2160: fload           9
        //  2162: fmul           
        //  2163: aload           5
        //  2165: goto            2169
        //  2168: athrow         
        //  2169: invokevirtual   dev/nuker/pyro/fS.9:()F
        //  2172: goto            2176
        //  2175: athrow         
        //  2176: fconst_1       
        //  2177: getstatic       dev/nuker/pyro/fc.c:I
        //  2180: ifge            2189
        //  2183: ldc_w           -1131064802
        //  2186: goto            2192
        //  2189: ldc_w           -1220830809
        //  2192: ldc_w           1348580790
        //  2195: ixor           
        //  2196: lookupswitch {
        //          -413520879: 2224
        //          -319494232: 2189
        //          default: 4094
        //        }
        //  2224: fload           9
        //  2226: fsub           
        //  2227: fmul           
        //  2228: fadd           
        //  2229: goto            2233
        //  2232: athrow         
        //  2233: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //  2236: goto            2240
        //  2239: athrow         
        //  2240: goto            2244
        //  2243: athrow         
        //  2244: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179140_f:()V
        //  2247: goto            2251
        //  2250: athrow         
        //  2251: goto            2255
        //  2254: athrow         
        //  2255: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179096_D:()V
        //  2258: goto            2262
        //  2261: athrow         
        //  2262: getstatic       dev/nuker/pyro/fc.1:I
        //  2265: ifeq            2274
        //  2268: ldc_w           -344000157
        //  2271: goto            2277
        //  2274: ldc_w           974144322
        //  2277: ldc_w           1006099623
        //  2280: ixor           
        //  2281: lookupswitch {
        //          -796318268: 4140
        //          171670716: 2274
        //          default: 2308
        //        }
        //  2308: aload_0        
        //  2309: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  2312: getstatic       dev/nuker/pyro/fc.c:I
        //  2315: ifge            2324
        //  2318: ldc_w           704290785
        //  2321: goto            2327
        //  2324: ldc_w           -1717865313
        //  2327: ldc_w           -395679699
        //  2330: ixor           
        //  2331: lookupswitch {
        //          -1275701686: 2324
        //          -1047463988: 4090
        //          default: 2356
        //        }
        //  2356: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //  2359: dup            
        //  2360: ifnonnull       2440
        //  2363: new             Lkotlin/TypeCastException;
        //  2366: dup            
        //  2367: ldc_w           "\u226d\u1486\u8b76\ub1c4\ucf1f\uec66\ub225\ue759\udb77\uef23\ua6b1\u1e0c\ue071\uc7b3\u87eb\u88fd\u57a5\u7681\ubf38\uc6d0\u2a85\uc234\u6bda\u2f49\ud141\u3408\u7d66\u8837\u8215\u8a07\u852f\ufb72\u7151\u981e\u1d09\uf0e1\u493c\u89f2\uc892\uf9ad\ub715\u41fd\ub876\ub152\u4aec\u8b64\u7c27\ucfa2\u7f46\uec4c\ue754\u1696\uefcc\u3596\u402e\ue076\u0a19\u8708\u1be1\u09d0\u768a\u7284\uc669\ub9b2\u9c73\u6b93\ue2e8\ud1a7\ua739\u2343\u8830\u4fb3\u8ac7\u161a\ua54b\u714c\u55b5\u1de7\u63d1\u1714"
        //  2370: goto            2374
        //  2373: athrow         
        //  2374: invokestatic    invokestatic   !!! ERROR
        //  2377: goto            2381
        //  2380: athrow         
        //  2381: getstatic       dev/nuker/pyro/fc.0:I
        //  2384: ifeq            2393
        //  2387: ldc_w           588430128
        //  2390: goto            2396
        //  2393: ldc_w           77251938
        //  2396: ldc_w           -589104712
        //  2399: ixor           
        //  2400: lookupswitch {
        //          -663208742: 2428
        //          -1031544: 2393
        //          default: 4086
        //        }
        //  2428: goto            2432
        //  2431: athrow         
        //  2432: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  2435: goto            2439
        //  2438: athrow         
        //  2439: athrow         
        //  2440: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //  2443: aload_0        
        //  2444: getstatic       dev/nuker/pyro/fc.0:I
        //  2447: ifeq            2456
        //  2450: ldc_w           88487102
        //  2453: goto            2459
        //  2456: ldc_w           1308593827
        //  2459: ldc_w           -2058930706
        //  2462: ixor           
        //  2463: lookupswitch {
        //          -2147417776: 4076
        //          -1670702267: 2456
        //          default: 2488
        //        }
        //  2488: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  2491: dup            
        //  2492: pop            
        //  2493: getstatic       dev/nuker/pyro/fc.0:I
        //  2496: ifeq            2505
        //  2499: ldc_w           1630898716
        //  2502: goto            2508
        //  2505: ldc_w           -136242628
        //  2508: ldc_w           -1823972451
        //  2511: ixor           
        //  2512: lookupswitch {
        //          -1766482177: 2505
        //          -226629247: 4138
        //          default: 2540
        //        }
        //  2540: goto            2544
        //  2543: athrow         
        //  2544: invokevirtual   net/minecraft/client/Minecraft.func_184121_ak:()F
        //  2547: goto            2551
        //  2550: athrow         
        //  2551: goto            2555
        //  2554: athrow         
        //  2555: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.orientCam:(F)V
        //  2560: goto            2564
        //  2563: athrow         
        //  2564: aload_0        
        //  2565: getfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0d;
        //  2568: goto            2572
        //  2571: athrow         
        //  2572: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2575: goto            2579
        //  2578: athrow         
        //  2579: checkcast       Ljava/lang/Number;
        //  2582: goto            2586
        //  2585: athrow         
        //  2586: invokevirtual   java/lang/Number.doubleValue:()D
        //  2589: goto            2593
        //  2592: athrow         
        //  2593: d2f            
        //  2594: ldc_w           0.2
        //  2597: fmul           
        //  2598: getstatic       dev/nuker/pyro/fc.0:I
        //  2601: ifeq            2610
        //  2604: ldc_w           -42801120
        //  2607: goto            2613
        //  2610: ldc_w           -1008079774
        //  2613: ldc_w           1317557923
        //  2616: ixor           
        //  2617: lookupswitch {
        //          -1922975039: 2644
        //          -1275412861: 2610
        //          default: 4100
        //        }
        //  2644: fstore          10
        //  2646: aload_0        
        //  2647: getfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0d;
        //  2650: goto            2654
        //  2653: athrow         
        //  2654: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2657: goto            2661
        //  2660: athrow         
        //  2661: checkcast       Ljava/lang/Number;
        //  2664: goto            2668
        //  2667: athrow         
        //  2668: invokevirtual   java/lang/Number.doubleValue:()D
        //  2671: goto            2675
        //  2674: athrow         
        //  2675: d2f            
        //  2676: ldc_w           0.2
        //  2679: fmul           
        //  2680: fstore          11
        //  2682: fconst_0       
        //  2683: aload_0        
        //  2684: getstatic       dev/nuker/pyro/fc.1:I
        //  2687: ifeq            2696
        //  2690: ldc_w           2013779913
        //  2693: goto            2699
        //  2696: ldc_w           -1393848207
        //  2699: ldc_w           1872402969
        //  2702: ixor           
        //  2703: lookupswitch {
        //          177906003: 2696
        //          396185040: 4148
        //          default: 2728
        //        }
        //  2728: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  2731: dup            
        //  2732: pop            
        //  2733: goto            2737
        //  2736: athrow         
        //  2737: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  2740: goto            2744
        //  2743: athrow         
        //  2744: dup            
        //  2745: ifnonnull       2754
        //  2748: ldc_w           -400856747
        //  2751: goto            2757
        //  2754: ldc_w           -400856746
        //  2757: ldc_w           240250164
        //  2760: ixor           
        //  2761: tableswitch {
        //          -862648126: 2784
        //          -862648125: 2839
        //          default: 2748
        //        }
        //  2784: getstatic       dev/nuker/pyro/fc.1:I
        //  2787: ifeq            2796
        //  2790: ldc_w           -1539736622
        //  2793: goto            2799
        //  2796: ldc_w           1159492545
        //  2799: ldc_w           1975947886
        //  2802: ixor           
        //  2803: lookupswitch {
        //          -771757636: 4164
        //          1899502406: 2796
        //          default: 2828
        //        }
        //  2828: goto            2832
        //  2831: athrow         
        //  2832: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2835: goto            2839
        //  2838: athrow         
        //  2839: dup            
        //  2840: pop            
        //  2841: goto            2845
        //  2844: athrow         
        //  2845: invokevirtual   net/minecraft/entity/Entity.func_70047_e:()F
        //  2848: goto            2852
        //  2851: athrow         
        //  2852: fconst_0       
        //  2853: goto            2857
        //  2856: athrow         
        //  2857: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  2860: goto            2864
        //  2863: athrow         
        //  2864: aload_0        
        //  2865: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  2868: dup            
        //  2869: pop            
        //  2870: goto            2874
        //  2873: athrow         
        //  2874: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  2877: goto            2881
        //  2880: athrow         
        //  2881: dup            
        //  2882: ifnonnull       2896
        //  2885: goto            2889
        //  2888: athrow         
        //  2889: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2892: goto            2896
        //  2895: athrow         
        //  2896: getstatic       dev/nuker/pyro/fc.c:I
        //  2899: ifge            2908
        //  2902: ldc_w           1456523482
        //  2905: goto            2911
        //  2908: ldc_w           1607961618
        //  2911: ldc_w           917167809
        //  2914: ixor           
        //  2915: lookupswitch {
        //          1618613787: 2908
        //          1769820883: 2940
        //          default: 4160
        //        }
        //  2940: getfield        net/minecraft/entity/Entity.field_70177_z:F
        //  2943: fneg           
        //  2944: fconst_0       
        //  2945: fconst_1       
        //  2946: fconst_0       
        //  2947: getstatic       dev/nuker/pyro/fc.1:I
        //  2950: ifeq            2959
        //  2953: ldc_w           -507179949
        //  2956: goto            2962
        //  2959: ldc_w           -1876418191
        //  2962: ldc_w           -1896114020
        //  2965: ixor           
        //  2966: lookupswitch {
        //          -1393881919: 2959
        //          1866372303: 4180
        //          default: 2992
        //        }
        //  2992: goto            2996
        //  2995: athrow         
        //  2996: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  2999: goto            3003
        //  3002: athrow         
        //  3003: aload_0        
        //  3004: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  3007: dup            
        //  3008: pop            
        //  3009: goto            3013
        //  3012: athrow         
        //  3013: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  3016: goto            3020
        //  3019: athrow         
        //  3020: dup            
        //  3021: ifnonnull       3035
        //  3024: goto            3028
        //  3027: athrow         
        //  3028: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3031: goto            3035
        //  3034: athrow         
        //  3035: getfield        net/minecraft/entity/Entity.field_70125_A:F
        //  3038: fconst_1       
        //  3039: fconst_0       
        //  3040: fconst_0       
        //  3041: goto            3045
        //  3044: athrow         
        //  3045: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  3048: goto            3052
        //  3051: athrow         
        //  3052: fconst_0       
        //  3053: fconst_0       
        //  3054: fconst_1       
        //  3055: goto            3059
        //  3058: athrow         
        //  3059: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  3062: goto            3066
        //  3065: athrow         
        //  3066: getstatic       dev/nuker/pyro/fc.c:I
        //  3069: ifge            3078
        //  3072: ldc_w           2084630259
        //  3075: goto            3081
        //  3078: ldc_w           1514527847
        //  3081: ldc_w           45050304
        //  3084: ixor           
        //  3085: lookupswitch {
        //          1491776935: 3112
        //          2129626931: 3078
        //          default: 4168
        //        }
        //  3112: aload_0        
        //  3113: getfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0g;
        //  3116: goto            3120
        //  3119: athrow         
        //  3120: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  3123: goto            3127
        //  3126: athrow         
        //  3127: checkcast       Ljava/lang/Number;
        //  3130: getstatic       dev/nuker/pyro/fc.0:I
        //  3133: ifeq            3142
        //  3136: ldc_w           350975311
        //  3139: goto            3145
        //  3142: ldc_w           -1729803938
        //  3145: ldc_w           -1093186738
        //  3148: ixor           
        //  3149: lookupswitch {
        //          -1438892543: 4112
        //          -237854305: 3142
        //          default: 3176
        //        }
        //  3176: goto            3180
        //  3179: athrow         
        //  3180: invokevirtual   java/lang/Number.intValue:()I
        //  3183: goto            3187
        //  3186: athrow         
        //  3187: i2f            
        //  3188: getstatic       dev/nuker/pyro/fc.0:I
        //  3191: ifeq            3200
        //  3194: ldc_w           349440160
        //  3197: goto            3203
        //  3200: ldc_w           2083974074
        //  3203: ldc_w           -609792563
        //  3206: ixor           
        //  3207: lookupswitch {
        //          -814529171: 4188
        //          1326511953: 3200
        //          default: 3232
        //        }
        //  3232: fstore          12
        //  3234: aload_0        
        //  3235: getstatic       dev/nuker/pyro/fc.0:I
        //  3238: ifeq            3247
        //  3241: ldc_w           -1399126066
        //  3244: goto            3250
        //  3247: ldc_w           -1523347528
        //  3250: ldc_w           -564878705
        //  3253: ixor           
        //  3254: lookupswitch {
        //          1926210881: 4154
        //          1955946111: 3247
        //          default: 3280
        //        }
        //  3280: getfield        dev/nuker/pyro/f9Z.7:Ldev/nuker/pyro/f0a;
        //  3283: goto            3287
        //  3286: athrow         
        //  3287: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  3290: goto            3294
        //  3293: athrow         
        //  3294: checkcast       Ljava/lang/Boolean;
        //  3297: goto            3301
        //  3300: athrow         
        //  3301: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3304: goto            3308
        //  3307: athrow         
        //  3308: ifeq            3581
        //  3311: bipush          90
        //  3313: i2f            
        //  3314: aload_0        
        //  3315: getstatic       dev/nuker/pyro/fc.1:I
        //  3318: ifeq            3327
        //  3321: ldc_w           -2031085600
        //  3324: goto            3330
        //  3327: ldc_w           23769544
        //  3330: ldc_w           -639621279
        //  3333: ixor           
        //  3334: lookupswitch {
        //          -662006103: 3360
        //          1594896513: 3327
        //          default: 4170
        //        }
        //  3360: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  3363: dup            
        //  3364: pop            
        //  3365: goto            3369
        //  3368: athrow         
        //  3369: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  3372: goto            3376
        //  3375: athrow         
        //  3376: dup            
        //  3377: ifnonnull       3391
        //  3380: goto            3384
        //  3383: athrow         
        //  3384: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3387: goto            3391
        //  3390: athrow         
        //  3391: getfield        net/minecraft/entity/Entity.field_70125_A:F
        //  3394: fsub           
        //  3395: getstatic       dev/nuker/pyro/fc.c:I
        //  3398: ifge            3407
        //  3401: ldc_w           -626787885
        //  3404: goto            3410
        //  3407: ldc_w           1309704518
        //  3410: ldc_w           1018491802
        //  3413: ixor           
        //  3414: lookupswitch {
        //          -918194613: 3407
        //          -434697655: 4158
        //          default: 3440
        //        }
        //  3440: fload           12
        //  3442: fcmpg          
        //  3443: ifge            3581
        //  3446: bipush          90
        //  3448: i2f            
        //  3449: getstatic       dev/nuker/pyro/fc.1:I
        //  3452: ifeq            3461
        //  3455: ldc_w           71575096
        //  3458: goto            3464
        //  3461: ldc_w           -1508747193
        //  3464: ldc_w           1848526821
        //  3467: ixor           
        //  3468: lookupswitch {
        //          -935583838: 3496
        //          1785356765: 3461
        //          default: 4144
        //        }
        //  3496: aload_0        
        //  3497: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //  3500: dup            
        //  3501: pop            
        //  3502: goto            3506
        //  3505: athrow         
        //  3506: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  3509: goto            3513
        //  3512: athrow         
        //  3513: dup            
        //  3514: ifnonnull       3575
        //  3517: getstatic       dev/nuker/pyro/fc.c:I
        //  3520: ifge            3529
        //  3523: ldc_w           -510064955
        //  3526: goto            3532
        //  3529: ldc_w           -1268365274
        //  3532: ldc_w           1272109397
        //  3535: ixor           
        //  3536: lookupswitch {
        //          -1437868144: 4106
        //          -705248245: 3529
        //          default: 3564
        //        }
        //  3564: goto            3568
        //  3567: athrow         
        //  3568: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3571: goto            3575
        //  3574: athrow         
        //  3575: getfield        net/minecraft/entity/Entity.field_70125_A:F
        //  3578: fsub           
        //  3579: fstore          12
        //  3581: fload           12
        //  3583: fconst_1       
        //  3584: fconst_0       
        //  3585: fconst_0       
        //  3586: goto            3590
        //  3589: athrow         
        //  3590: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  3593: goto            3597
        //  3596: athrow         
        //  3597: ldc_w           180.0
        //  3600: fconst_0       
        //  3601: fconst_0       
        //  3602: fconst_1       
        //  3603: goto            3607
        //  3606: athrow         
        //  3607: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  3610: goto            3614
        //  3613: athrow         
        //  3614: ldc_w           -90.0
        //  3617: fconst_1       
        //  3618: fconst_0       
        //  3619: fconst_0       
        //  3620: goto            3624
        //  3623: athrow         
        //  3624: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  3627: goto            3631
        //  3630: athrow         
        //  3631: fconst_0       
        //  3632: fconst_0       
        //  3633: fconst_1       
        //  3634: goto            3638
        //  3637: athrow         
        //  3638: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  3641: goto            3645
        //  3644: athrow         
        //  3645: fload           6
        //  3647: fconst_0       
        //  3648: fconst_1       
        //  3649: fconst_0       
        //  3650: goto            3654
        //  3653: athrow         
        //  3654: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  3657: goto            3661
        //  3660: athrow         
        //  3661: fconst_0       
        //  3662: fconst_0       
        //  3663: fload           11
        //  3665: goto            3669
        //  3668: athrow         
        //  3669: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  3672: goto            3676
        //  3675: athrow         
        //  3676: getstatic       dev/nuker/pyro/fc.0:I
        //  3679: ifeq            3688
        //  3682: ldc_w           -1710187599
        //  3685: goto            3691
        //  3688: ldc_w           1349045431
        //  3691: ldc_w           966577730
        //  3694: ixor           
        //  3695: lookupswitch {
        //          -1551084045: 4166
        //          1282366410: 3688
        //          default: 3720
        //        }
        //  3720: aload_3        
        //  3721: ldc_w           "\u2270\u1490\u8b7b\ub1c4\ucf5a"
        //  3724: getstatic       dev/nuker/pyro/fc.1:I
        //  3727: ifeq            3736
        //  3730: ldc_w           384091459
        //  3733: goto            3739
        //  3736: ldc_w           606043869
        //  3739: ldc_w           1509495244
        //  3742: ixor           
        //  3743: lookupswitch {
        //          1327355023: 3736
        //          2112253713: 3768
        //          default: 4122
        //        }
        //  3768: goto            3772
        //  3771: athrow         
        //  3772: invokestatic    invokestatic   !!! ERROR
        //  3775: goto            3779
        //  3778: athrow         
        //  3779: goto            3783
        //  3782: athrow         
        //  3783: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  3786: goto            3790
        //  3789: athrow         
        //  3790: dup            
        //  3791: ifnonnull       3805
        //  3794: goto            3798
        //  3797: athrow         
        //  3798: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3801: goto            3805
        //  3804: athrow         
        //  3805: checkcast       Ldev/nuker/pyro/f0d;
        //  3808: goto            3812
        //  3811: athrow         
        //  3812: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3815: goto            3819
        //  3818: athrow         
        //  3819: checkcast       Ljava/lang/Number;
        //  3822: getstatic       dev/nuker/pyro/fc.1:I
        //  3825: ifeq            3834
        //  3828: ldc_w           -1602771270
        //  3831: goto            3837
        //  3834: ldc_w           -843336141
        //  3837: ldc_w           207379080
        //  3840: ixor           
        //  3841: lookupswitch {
        //          -1406403534: 4184
        //          1073974954: 3834
        //          default: 3868
        //        }
        //  3868: goto            3872
        //  3871: athrow         
        //  3872: invokevirtual   java/lang/Number.doubleValue:()D
        //  3875: goto            3879
        //  3878: athrow         
        //  3879: d2f            
        //  3880: fload           10
        //  3882: fconst_2       
        //  3883: fmul           
        //  3884: fmul           
        //  3885: fstore          13
        //  3887: aload_0        
        //  3888: aload           8
        //  3890: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  3893: d2f            
        //  3894: getstatic       dev/nuker/pyro/fc.1:I
        //  3897: ifeq            3906
        //  3900: ldc_w           -801444810
        //  3903: goto            3909
        //  3906: ldc_w           -510599314
        //  3909: ldc_w           -1332178844
        //  3912: ixor           
        //  3913: lookupswitch {
        //          1359499018: 3940
        //          1621261394: 3906
        //          default: 4114
        //        }
        //  3940: aload           8
        //  3942: getstatic       dev/nuker/pyro/fc.c:I
        //  3945: ifge            3954
        //  3948: ldc_w           1288581408
        //  3951: goto            3957
        //  3954: ldc_w           51986609
        //  3957: ldc_w           1200293916
        //  3960: ixor           
        //  3961: lookupswitch {
        //          189086012: 3954
        //          1150437549: 3988
        //          default: 4124
        //        }
        //  3988: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  3991: d2f            
        //  3992: aload           8
        //  3994: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  3997: d2f            
        //  3998: fload           13
        //  4000: goto            4004
        //  4003: athrow         
        //  4004: invokevirtual   dev/nuker/pyro/f9Z.c:(FFFF)V
        //  4007: goto            4011
        //  4010: athrow         
        //  4011: goto            4015
        //  4014: athrow         
        //  4015: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //  4018: goto            4022
        //  4021: athrow         
        //  4022: iconst_1       
        //  4023: goto            4027
        //  4026: athrow         
        //  4027: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //  4030: goto            4034
        //  4033: athrow         
        //  4034: goto            4038
        //  4037: athrow         
        //  4038: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //  4041: goto            4045
        //  4044: athrow         
        //  4045: fconst_1       
        //  4046: fconst_1       
        //  4047: fconst_1       
        //  4048: fconst_1       
        //  4049: goto            4053
        //  4052: athrow         
        //  4053: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //  4056: goto            4060
        //  4059: athrow         
        //  4060: goto            4064
        //  4063: athrow         
        //  4064: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179145_e:()V
        //  4067: goto            4071
        //  4070: athrow         
        //  4071: return         
        //  4072: aconst_null    
        //  4073: athrow         
        //  4074: aconst_null    
        //  4075: athrow         
        //  4076: aconst_null    
        //  4077: athrow         
        //  4078: aconst_null    
        //  4079: athrow         
        //  4080: aconst_null    
        //  4081: athrow         
        //  4082: aconst_null    
        //  4083: athrow         
        //  4084: aconst_null    
        //  4085: athrow         
        //  4086: aconst_null    
        //  4087: athrow         
        //  4088: aconst_null    
        //  4089: athrow         
        //  4090: aconst_null    
        //  4091: athrow         
        //  4092: aconst_null    
        //  4093: athrow         
        //  4094: aconst_null    
        //  4095: athrow         
        //  4096: aconst_null    
        //  4097: athrow         
        //  4098: aconst_null    
        //  4099: athrow         
        //  4100: aconst_null    
        //  4101: athrow         
        //  4102: aconst_null    
        //  4103: athrow         
        //  4104: aconst_null    
        //  4105: athrow         
        //  4106: aconst_null    
        //  4107: athrow         
        //  4108: aconst_null    
        //  4109: athrow         
        //  4110: aconst_null    
        //  4111: athrow         
        //  4112: aconst_null    
        //  4113: athrow         
        //  4114: aconst_null    
        //  4115: athrow         
        //  4116: aconst_null    
        //  4117: athrow         
        //  4118: aconst_null    
        //  4119: athrow         
        //  4120: aconst_null    
        //  4121: athrow         
        //  4122: aconst_null    
        //  4123: athrow         
        //  4124: aconst_null    
        //  4125: athrow         
        //  4126: aconst_null    
        //  4127: athrow         
        //  4128: aconst_null    
        //  4129: athrow         
        //  4130: aconst_null    
        //  4131: athrow         
        //  4132: aconst_null    
        //  4133: athrow         
        //  4134: aconst_null    
        //  4135: athrow         
        //  4136: aconst_null    
        //  4137: athrow         
        //  4138: aconst_null    
        //  4139: athrow         
        //  4140: aconst_null    
        //  4141: athrow         
        //  4142: aconst_null    
        //  4143: athrow         
        //  4144: aconst_null    
        //  4145: athrow         
        //  4146: aconst_null    
        //  4147: athrow         
        //  4148: aconst_null    
        //  4149: athrow         
        //  4150: aconst_null    
        //  4151: athrow         
        //  4152: aconst_null    
        //  4153: athrow         
        //  4154: aconst_null    
        //  4155: athrow         
        //  4156: aconst_null    
        //  4157: athrow         
        //  4158: aconst_null    
        //  4159: athrow         
        //  4160: aconst_null    
        //  4161: athrow         
        //  4162: aconst_null    
        //  4163: athrow         
        //  4164: aconst_null    
        //  4165: athrow         
        //  4166: aconst_null    
        //  4167: athrow         
        //  4168: aconst_null    
        //  4169: athrow         
        //  4170: aconst_null    
        //  4171: athrow         
        //  4172: aconst_null    
        //  4173: athrow         
        //  4174: aconst_null    
        //  4175: athrow         
        //  4176: aconst_null    
        //  4177: athrow         
        //  4178: aconst_null    
        //  4179: athrow         
        //  4180: aconst_null    
        //  4181: athrow         
        //  4182: aconst_null    
        //  4183: athrow         
        //  4184: aconst_null    
        //  4185: athrow         
        //  4186: aconst_null    
        //  4187: athrow         
        //  4188: aconst_null    
        //  4189: athrow         
        //  4190: pop            
        //  4191: goto            24
        //  4194: pop            
        //  4195: aconst_null    
        //  4196: goto            4190
        //  4199: dup            
        //  4200: ifnull          4190
        //  4203: checkcast       Ljava/lang/Throwable;
        //  4206: athrow         
        //  4207: dup            
        //  4208: ifnull          4194
        //  4211: checkcast       Ljava/lang/Throwable;
        //  4214: athrow         
        //  4215: aconst_null    
        //  4216: athrow         
        //    StackMapTable: 02 5A 43 07 00 3B 04 FF 00 0B 00 00 00 01 07 00 3B FF 00 03 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 00 0A 41 01 1E 4B 07 00 03 FF 00 01 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 02 07 00 03 01 5D 07 00 03 09 0A 41 01 1C FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 02 07 00 5A 07 01 CE 45 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 02 07 00 5A 07 01 CE 42 07 00 2A FF 00 00 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 02 07 00 5A 07 01 CE 45 07 00 3B 40 07 01 D0 46 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 00 65 45 07 00 3B 40 07 01 D2 FF 00 0A 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE 45 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE 45 07 00 3B 40 07 01 D0 4E 07 01 D0 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 01 D0 01 5E 07 01 D0 42 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 01 D0 4D 07 00 71 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 71 01 5C 07 00 71 42 07 00 2A 40 07 00 71 45 07 00 3B 40 07 01 D2 4D 07 00 77 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 77 01 5C 07 00 77 42 07 00 3B 40 07 00 77 45 07 00 3B 40 01 0D 41 01 1C 04 45 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE 45 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE FF 00 0A 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 03 07 00 5A 07 01 CE 01 FF 00 1B 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE 42 07 00 3B FF 00 00 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE 45 07 00 3B 40 07 01 D0 46 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 01 D0 45 07 00 2A 40 07 00 65 45 07 00 3B 40 07 01 D2 42 07 00 6A FF 00 0D 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 02 07 00 03 01 5C 07 00 03 FF 00 0F 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 02 07 00 03 07 00 8B FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 01 FF 00 1D 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 02 07 00 03 07 00 8B FF 00 0B 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 03 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 03 01 FF 00 1D 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 03 FF 00 0B 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 03 07 00 BA FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 05 07 00 03 07 00 8B 07 00 03 07 00 BA 01 FF 00 1D 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 03 07 00 BA 42 07 00 3B FF 00 00 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 03 07 00 BA 45 07 00 3B FF 00 00 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 8B FF 00 0A 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 8B FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 8B 01 FF 00 1B 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 8B 42 07 00 3B FF 00 00 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 8B 45 07 00 3B 40 07 00 A6 FE 00 0C 00 00 07 00 A6 41 01 1D FF 00 04 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 00 07 00 A6 00 01 07 00 A6 45 07 00 3B 40 02 FF 00 06 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 00 07 00 A6 00 01 07 00 3B 40 07 00 A6 45 07 00 3B 40 02 4A 02 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 00 07 00 A6 00 02 02 01 5E 02 FF 00 14 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 03 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 03 02 07 00 03 01 FF 00 1C 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 03 47 07 00 1E FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 48 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA 46 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA FF 00 0A 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 03 02 07 00 BA 01 FF 00 1B 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA 4F 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 05 08 04 22 08 04 22 03 03 03 45 07 00 3B 40 07 00 8B 4A 07 00 8B FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 01 5E 07 00 8B 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 03 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 03 FF 00 0B 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 02 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 03 07 00 8B 02 01 FF 00 1B 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 02 42 07 00 2A FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 02 45 07 00 3B 40 07 00 8B FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 03 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 03 FF 00 03 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 02 45 07 00 3B 40 07 00 8B FF 00 0A 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 01 01 45 07 00 3B 00 42 07 00 3B 00 45 07 00 3B 00 4B 01 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 01 01 5E 01 42 07 00 18 40 01 45 07 00 3B 00 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 00 45 07 00 3B 00 0A 41 01 1C FF 00 11 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 48 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 03 07 00 BA 07 00 48 01 FF 00 1B 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 48 42 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 48 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 BA FF 00 0A 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 BA FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 03 07 00 BA 07 00 BA 01 FF 00 1B 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 BA FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 BA 45 07 00 3B 40 02 FF 00 0C 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 00 03 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 03 03 07 00 03 01 FF 00 1D 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 00 03 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 00 FE 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 01 D2 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 01 01 45 07 00 3B FF 00 00 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 03 FC 00 0F 02 42 01 1C 44 07 00 3B 40 07 00 6A 45 07 00 3B 40 02 4B 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 01 5F 02 4E 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 01 5D 02 FF 00 0D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 07 00 6A FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 07 00 6A 01 FF 00 1E 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 07 00 6A 42 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 02 4A 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 02 47 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 0C 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 02 02 02 02 01 FF 00 1D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 10 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 01 FF 00 1F 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 02 FF 00 0D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 07 00 6A FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 07 00 6A 01 FF 00 1E 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 07 00 6A 42 07 00 26 FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 0B 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 01 FF 00 1D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 47 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 11 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 01 FF 00 1E 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 0D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 07 00 6A FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 02 02 02 07 00 6A 01 FF 00 1E 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 07 00 6A FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 0B 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 02 02 02 02 01 FF 00 1D 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 47 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 02 02 02 02 07 00 6A 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 02 02 02 02 02 FF 00 0C 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 06 02 02 02 02 02 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 07 02 02 02 02 02 02 01 FF 00 1F 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 06 02 02 02 02 02 02 47 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 45 07 00 3B 00 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 00 45 07 00 3B 00 42 07 00 3B 00 45 07 00 3B 00 0B 42 01 1E 4F 07 00 48 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 00 48 01 5C 07 00 48 50 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE FF 00 0B 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 05 07 01 D4 08 09 3B 08 09 3B 07 01 CE 01 FF 00 1F 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE 42 07 00 20 FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 D4 07 01 46 40 07 01 D4 FF 00 0F 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 03 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 07 01 50 07 00 03 01 FF 00 1C 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 03 FF 00 10 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 48 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 07 01 50 07 00 48 01 FF 00 1F 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 48 42 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 48 45 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 02 42 07 00 3B FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 02 47 07 00 3B 00 46 07 00 3B 40 07 00 FE 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 01 01 45 07 00 3B 40 03 50 02 FF 00 02 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 01 5E 02 FF 00 08 00 0B 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 00 01 07 00 22 40 07 00 FE 45 07 00 3B 40 07 01 D2 45 07 00 30 40 07 01 01 45 07 00 3B 40 03 FF 00 14 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 03 FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 03 02 07 00 03 01 FF 00 1C 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 03 47 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 48 45 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 03 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 05 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 03 02 07 00 BA 01 FF 00 1A 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 0B 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 03 02 07 00 BA 01 FF 00 1C 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA 45 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA 44 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA 45 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 02 43 07 00 2A FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 03 02 02 02 45 07 00 3B 00 48 07 00 3B 40 07 00 48 45 07 00 3B 40 07 00 BA 46 07 00 2A 40 07 00 BA 45 07 00 3B 40 07 00 BA 4B 07 00 BA FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 07 00 BA 01 5C 07 00 BA FF 00 12 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 04 02 02 02 02 FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 05 02 02 02 02 01 FF 00 1D 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 04 02 02 02 02 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 48 07 00 3B 40 07 00 48 45 07 00 3B 40 07 00 BA FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 01 07 00 BA 45 07 00 3B 40 07 00 BA 48 07 00 32 FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 45 07 00 34 FF 00 00 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 03 02 02 02 45 07 00 3B 00 0B 42 01 1E 46 07 00 2A 40 07 01 88 45 07 00 3B 40 07 01 D2 4E 07 01 01 FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 07 01 01 01 5E 07 01 01 42 07 00 3B 40 07 01 01 45 07 00 3B 40 01 4C 02 FF 00 02 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 01 5C 02 FF 00 0E 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 01 07 00 03 FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 03 01 5D 07 00 03 45 07 00 3B 40 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 2A 40 07 00 77 45 07 00 3B 40 01 FF 00 12 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 03 FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 03 02 07 00 03 01 FF 00 1D 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 03 47 07 00 2A FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 48 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA 4F 02 FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 01 5D 02 54 02 FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 01 5F 02 48 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 48 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA FF 00 0F 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 03 02 07 00 BA 01 FF 00 1F 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA 42 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA 05 47 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 FF 00 08 00 00 00 01 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 48 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 03 02 02 02 45 07 00 3B 00 47 07 00 26 FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 03 02 02 02 45 07 00 3B 00 0B 42 01 1C FF 00 0F 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 03 07 00 5A 07 01 CE 01 FF 00 1C 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE 42 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE 45 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE 42 07 00 3B FF 00 00 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE 45 07 00 3B 40 07 01 D0 46 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 01 D0 45 07 00 3B 40 07 00 FE 45 07 00 3B 40 07 01 D2 4E 07 01 01 FF 00 02 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 01 01 01 5E 07 01 01 42 07 00 3B 40 07 01 01 45 07 00 3B 40 03 FF 00 1A 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 02 07 00 03 02 FF 00 02 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 03 07 00 03 02 01 FF 00 1E 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 02 07 00 03 02 FF 00 0D 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 03 07 00 03 02 07 00 8B FF 00 02 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 04 07 00 03 02 07 00 8B 01 FF 00 1E 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 03 07 00 03 02 07 00 8B FF 00 0E 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 05 07 00 03 02 02 02 02 45 07 00 3B 00 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 00 45 07 00 3B 00 FF 00 03 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 01 01 45 07 00 3B 00 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 00 45 07 00 3B 00 FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 04 02 02 02 02 45 07 00 3B 00 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 00 45 07 00 3B 00 FF 00 00 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 01 02 41 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 03 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 02 07 00 5A 07 01 CE FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 01 01 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 8B FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 01 07 01 D0 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 07 01 D4 08 09 3B 08 09 3B 07 01 CE FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 00 07 00 A6 00 00 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 01 07 00 48 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 07 00 6A FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 06 02 02 02 02 02 02 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 00 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 07 00 8B 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 01 02 FA 00 01 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 03 07 00 03 FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 BA FF 00 01 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 00 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 02 02 FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 01 07 01 01 FF 00 01 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 02 07 00 03 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 03 07 00 03 07 00 8B 07 00 03 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 07 00 6A FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 07 00 5A 07 01 CE FF 00 01 00 0E 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 02 00 03 07 00 03 02 07 00 8B FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 00 07 00 A6 00 01 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 00 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 48 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 04 02 02 02 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 03 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 02 07 01 50 07 00 48 01 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 02 07 00 03 07 00 8B FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 01 02 FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 07 00 6A FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 03 FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 01 07 00 77 FF 00 01 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 01 07 00 03 FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 04 07 00 03 07 00 8B 07 00 03 07 00 BA FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 01 02 FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 01 07 00 BA FF 00 01 00 05 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 00 01 07 00 71 FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 02 02 07 00 BA FC 00 01 02 FA 00 01 FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 02 02 07 00 03 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 02 02 07 00 BA FF 00 01 00 0A 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 00 03 02 02 02 FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 A6 00 01 07 00 8B FF 00 01 00 09 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 00 02 07 00 BA 07 00 BA FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 04 02 02 02 02 FF 00 01 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 00 FF 00 01 00 0D 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 02 00 01 07 01 01 FF 00 01 00 06 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 00 01 07 00 03 FF 00 01 00 0C 07 00 03 07 00 BA 07 00 8B 07 00 5A 07 00 6A 07 00 6A 02 02 07 00 8B 02 02 02 00 01 02 FF 00 01 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 00 01 07 00 3B 43 05 44 07 00 3B 47 05 47 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4199   4207   Any
        //  4199   4207   4199   4207   Ljava/lang/NumberFormatException;
        //  4215   4217   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  171    177    177    178    Any
        //  171    177    177    178    Ljava/util/ConcurrentModificationException;
        //  171    177    3      8      Any
        //  171    177    177    178    Ljava/lang/NegativeArraySizeException;
        //  171    177    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  181    188    188    189    Any
        //  181    188    181    182    Ljava/lang/IllegalArgumentException;
        //  182    188    181    182    Ljava/lang/IllegalStateException;
        //  182    188    181    182    Ljava/lang/IllegalArgumentException;
        //  182    188    188    189    Ljava/lang/NullPointerException;
        //  196    203    203    204    Any
        //  197    203    196    197    Ljava/lang/ArithmeticException;
        //  196    203    3      8      Ljava/lang/IllegalStateException;
        //  196    203    196    197    Any
        //  197    203    203    204    Any
        //  210    217    217    218    Any
        //  211    217    210    211    Any
        //  211    217    210    211    Ljava/lang/UnsupportedOperationException;
        //  211    217    217    218    Ljava/lang/NegativeArraySizeException;
        //  210    217    217    218    Any
        //  230    236    236    237    Any
        //  230    236    236    237    Any
        //  230    236    236    237    Ljava/lang/ClassCastException;
        //  230    236    3      8      Any
        //  230    236    236    237    Any
        //  241    247    247    248    Any
        //  241    247    247    248    Ljava/lang/ClassCastException;
        //  241    247    247    248    Any
        //  241    247    3      8      Ljava/lang/RuntimeException;
        //  241    247    3      8      Any
        //  299    306    306    307    Any
        //  300    306    299    300    Ljava/lang/ArithmeticException;
        //  300    306    299    300    Any
        //  300    306    3      8      Ljava/util/NoSuchElementException;
        //  299    306    306    307    Ljava/lang/IllegalStateException;
        //  355    362    362    363    Any
        //  356    362    3      8      Any
        //  356    362    355    356    Ljava/lang/EnumConstantNotPresentException;
        //  356    362    3      8      Any
        //  356    362    355    356    Ljava/lang/UnsupportedOperationException;
        //  411    418    418    419    Any
        //  411    418    411    412    Any
        //  411    418    418    419    Any
        //  412    418    3      8      Any
        //  411    418    411    412    Ljava/lang/NegativeArraySizeException;
        //  475    482    482    483    Any
        //  475    482    482    483    Ljava/lang/UnsupportedOperationException;
        //  475    482    482    483    Any
        //  476    482    475    476    Any
        //  475    482    475    476    Any
        //  527    534    534    535    Any
        //  527    534    527    528    Any
        //  527    534    534    535    Any
        //  527    534    3      8      Any
        //  527    534    534    535    Ljava/lang/UnsupportedOperationException;
        //  542    549    549    550    Any
        //  542    549    542    543    Any
        //  542    549    3      8      Any
        //  543    549    549    550    Ljava/lang/ArithmeticException;
        //  542    549    549    550    Any
        //  556    563    563    564    Any
        //  556    563    556    557    Ljava/lang/NullPointerException;
        //  556    563    556    557    Ljava/lang/UnsupportedOperationException;
        //  557    563    3      8      Ljava/util/NoSuchElementException;
        //  556    563    563    564    Any
        //  751    758    758    759    Any
        //  752    758    758    759    Ljava/lang/ClassCastException;
        //  752    758    3      8      Any
        //  752    758    751    752    Any
        //  752    758    758    759    Any
        //  803    810    810    811    Any
        //  804    810    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  803    810    3      8      Any
        //  804    810    810    811    Ljava/lang/ArithmeticException;
        //  804    810    803    804    Any
        //  862    868    868    869    Any
        //  862    868    3      8      Any
        //  862    868    3      8      Any
        //  862    868    3      8      Ljava/lang/NullPointerException;
        //  862    868    868    869    Ljava/lang/ClassCastException;
        //  876    883    883    884    Any
        //  876    883    876    877    Any
        //  877    883    883    884    Ljava/lang/ClassCastException;
        //  877    883    3      8      Ljava/lang/UnsupportedOperationException;
        //  877    883    876    877    Ljava/lang/NullPointerException;
        //  988    995    995    996    Any
        //  988    995    995    996    Ljava/lang/RuntimeException;
        //  988    995    988    989    Ljava/lang/IllegalArgumentException;
        //  988    995    3      8      Any
        //  988    995    995    996    Ljava/lang/ClassCastException;
        //  1003   1010   1010   1011   Any
        //  1003   1010   1003   1004   Any
        //  1003   1010   1003   1004   Any
        //  1003   1010   1010   1011   Ljava/lang/IndexOutOfBoundsException;
        //  1004   1010   1003   1004   Ljava/lang/ClassCastException;
        //  1068   1075   1075   1076   Any
        //  1068   1075   1068   1069   Ljava/lang/ArithmeticException;
        //  1068   1075   1068   1069   Any
        //  1068   1075   1068   1069   Ljava/lang/NullPointerException;
        //  1069   1075   1068   1069   Ljava/lang/ArithmeticException;
        //  1126   1133   1133   1134   Any
        //  1127   1133   1126   1127   Any
        //  1127   1133   3      8      Ljava/lang/IllegalStateException;
        //  1127   1133   1126   1127   Any
        //  1127   1133   1126   1127   Any
        //  1179   1186   1186   1187   Any
        //  1180   1186   1179   1180   Ljava/lang/RuntimeException;
        //  1179   1186   1179   1180   Ljava/util/NoSuchElementException;
        //  1180   1186   3      8      Ljava/lang/AssertionError;
        //  1179   1186   3      8      Any
        //  1194   1200   1200   1201   Any
        //  1194   1200   1200   1201   Ljava/lang/AssertionError;
        //  1194   1200   1200   1201   Ljava/lang/NullPointerException;
        //  1194   1200   3      8      Ljava/lang/NullPointerException;
        //  1194   1200   1200   1201   Ljava/util/ConcurrentModificationException;
        //  1206   1212   1212   1213   Any
        //  1206   1212   1212   1213   Ljava/lang/AssertionError;
        //  1206   1212   3      8      Any
        //  1206   1212   1212   1213   Any
        //  1206   1212   1212   1213   Ljava/lang/IllegalArgumentException;
        //  1225   1231   1231   1232   Any
        //  1225   1231   1231   1232   Any
        //  1225   1231   3      8      Any
        //  1225   1231   1231   1232   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1225   1231   3      8      Any
        //  1235   1242   1242   1243   Any
        //  1235   1242   1242   1243   Any
        //  1235   1242   1235   1236   Any
        //  1235   1242   1242   1243   Any
        //  1236   1242   1235   1236   Ljava/util/ConcurrentModificationException;
        //  1291   1298   1298   1299   Any
        //  1292   1298   1291   1292   Ljava/lang/StringIndexOutOfBoundsException;
        //  1292   1298   1298   1299   Any
        //  1292   1298   1298   1299   Any
        //  1291   1298   1298   1299   Ljava/lang/ArithmeticException;
        //  1303   1309   1309   1310   Any
        //  1303   1309   1309   1310   Ljava/util/NoSuchElementException;
        //  1303   1309   3      8      Any
        //  1303   1309   1309   1310   Ljava/lang/NullPointerException;
        //  1303   1309   1309   1310   Any
        //  1403   1410   1410   1411   Any
        //  1403   1410   3      8      Ljava/util/ConcurrentModificationException;
        //  1403   1410   1403   1404   Any
        //  1403   1410   3      8      Ljava/util/ConcurrentModificationException;
        //  1404   1410   1410   1411   Ljava/lang/RuntimeException;
        //  1456   1462   1462   1463   Any
        //  1456   1462   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1456   1462   3      8      Ljava/lang/IllegalArgumentException;
        //  1456   1462   1462   1463   Any
        //  1456   1462   3      8      Any
        //  1514   1521   1521   1522   Any
        //  1514   1521   1514   1515   Any
        //  1515   1521   3      8      Any
        //  1515   1521   1514   1515   Ljava/lang/RuntimeException;
        //  1514   1521   3      8      Any
        //  1528   1535   1535   1536   Any
        //  1529   1535   3      8      Ljava/lang/RuntimeException;
        //  1528   1535   1528   1529   Ljava/lang/ArithmeticException;
        //  1529   1535   1528   1529   Ljava/util/ConcurrentModificationException;
        //  1528   1535   1528   1529   Ljava/lang/IllegalArgumentException;
        //  1589   1596   1596   1597   Any
        //  1590   1596   1589   1590   Any
        //  1590   1596   1589   1590   Any
        //  1589   1596   1596   1597   Any
        //  1589   1596   3      8      Any
        //  1743   1750   1750   1751   Any
        //  1744   1750   1743   1744   Any
        //  1744   1750   1743   1744   Any
        //  1744   1750   1743   1744   Ljava/lang/IllegalStateException;
        //  1744   1750   1750   1751   Ljava/lang/AssertionError;
        //  1762   1769   1769   1770   Any
        //  1763   1769   1762   1763   Any
        //  1763   1769   1769   1770   Ljava/lang/EnumConstantNotPresentException;
        //  1762   1769   1762   1763   Any
        //  1762   1769   3      8      Ljava/lang/AssertionError;
        //  1778   1785   1785   1786   Any
        //  1779   1785   1778   1779   Any
        //  1778   1785   1785   1786   Ljava/lang/RuntimeException;
        //  1779   1785   1785   1786   Any
        //  1779   1785   1785   1786   Any
        //  1935   1942   1942   1943   Any
        //  1936   1942   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1936   1942   3      8      Any
        //  1935   1942   1942   1943   Any
        //  1935   1942   1935   1936   Ljava/lang/UnsupportedOperationException;
        //  1996   2003   2003   2004   Any
        //  1996   2003   1996   1997   Any
        //  1997   2003   1996   1997   Any
        //  1997   2003   2003   2004   Any
        //  1996   2003   3      8      Any
        //  2108   2114   2114   2115   Any
        //  2108   2114   3      8      Ljava/lang/NullPointerException;
        //  2108   2114   3      8      Any
        //  2108   2114   2114   2115   Any
        //  2108   2114   3      8      Any
        //  2168   2175   2175   2176   Any
        //  2169   2175   2168   2169   Any
        //  2169   2175   3      8      Ljava/lang/RuntimeException;
        //  2168   2175   2168   2169   Any
        //  2169   2175   3      8      Any
        //  2232   2239   2239   2240   Any
        //  2232   2239   2239   2240   Ljava/util/ConcurrentModificationException;
        //  2233   2239   2232   2233   Any
        //  2232   2239   2232   2233   Ljava/lang/StringIndexOutOfBoundsException;
        //  2233   2239   3      8      Any
        //  2244   2250   2250   2251   Any
        //  2244   2250   2250   2251   Any
        //  2244   2250   2250   2251   Ljava/lang/NegativeArraySizeException;
        //  2244   2250   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2244   2250   2250   2251   Any
        //  2254   2261   2261   2262   Any
        //  2254   2261   2261   2262   Any
        //  2255   2261   2261   2262   Ljava/util/NoSuchElementException;
        //  2255   2261   3      8      Ljava/util/ConcurrentModificationException;
        //  2254   2261   2254   2255   Any
        //  2373   2380   2380   2381   Any
        //  2374   2380   2373   2374   Ljava/lang/UnsupportedOperationException;
        //  2374   2380   2380   2381   Ljava/lang/IllegalStateException;
        //  2373   2380   2373   2374   Any
        //  2374   2380   3      8      Any
        //  2431   2438   2438   2439   Any
        //  2431   2438   2438   2439   Any
        //  2431   2438   2431   2432   Ljava/lang/IllegalStateException;
        //  2431   2438   2438   2439   Any
        //  2431   2438   3      8      Ljava/lang/IllegalArgumentException;
        //  2543   2550   2550   2551   Any
        //  2543   2550   2543   2544   Any
        //  2544   2550   2543   2544   Any
        //  2543   2550   3      8      Any
        //  2544   2550   2543   2544   Ljava/lang/NullPointerException;
        //  2554   2563   2563   2564   Any
        //  2554   2563   2554   2555   Any
        //  2555   2563   2563   2564   Any
        //  2554   2563   2563   2564   Any
        //  2555   2563   2554   2555   Ljava/lang/IllegalArgumentException;
        //  2571   2578   2578   2579   Any
        //  2571   2578   2571   2572   Any
        //  2572   2578   2571   2572   Any
        //  2571   2578   3      8      Any
        //  2571   2578   3      8      Any
        //  2585   2592   2592   2593   Any
        //  2585   2592   3      8      Ljava/lang/IllegalArgumentException;
        //  2586   2592   2592   2593   Any
        //  2585   2592   2585   2586   Any
        //  2586   2592   2592   2593   Ljava/lang/UnsupportedOperationException;
        //  2653   2660   2660   2661   Any
        //  2654   2660   2660   2661   Ljava/lang/NegativeArraySizeException;
        //  2654   2660   2660   2661   Any
        //  2653   2660   2660   2661   Ljava/lang/NumberFormatException;
        //  2653   2660   2653   2654   Ljava/lang/NullPointerException;
        //  2667   2674   2674   2675   Any
        //  2668   2674   2674   2675   Ljava/lang/AssertionError;
        //  2667   2674   3      8      Any
        //  2667   2674   2667   2668   Ljava/lang/IndexOutOfBoundsException;
        //  2667   2674   2674   2675   Any
        //  2736   2743   2743   2744   Any
        //  2737   2743   2743   2744   Ljava/lang/IllegalArgumentException;
        //  2736   2743   2736   2737   Ljava/lang/StringIndexOutOfBoundsException;
        //  2736   2743   2736   2737   Any
        //  2737   2743   2743   2744   Any
        //  2832   2838   2838   2839   Any
        //  2832   2838   2838   2839   Any
        //  2832   2838   3      8      Ljava/lang/UnsupportedOperationException;
        //  2832   2838   2838   2839   Ljava/util/NoSuchElementException;
        //  2832   2838   2838   2839   Ljava/lang/ArithmeticException;
        //  2844   2851   2851   2852   Any
        //  2844   2851   3      8      Any
        //  2845   2851   2851   2852   Any
        //  2845   2851   3      8      Any
        //  2844   2851   2844   2845   Any
        //  2856   2863   2863   2864   Any
        //  2857   2863   2856   2857   Ljava/lang/ClassCastException;
        //  2857   2863   2856   2857   Ljava/lang/ArithmeticException;
        //  2856   2863   3      8      Ljava/lang/ClassCastException;
        //  2857   2863   2863   2864   Ljava/lang/UnsupportedOperationException;
        //  2873   2880   2880   2881   Any
        //  2874   2880   2873   2874   Any
        //  2873   2880   2880   2881   Ljava/lang/StringIndexOutOfBoundsException;
        //  2874   2880   2873   2874   Any
        //  2874   2880   2880   2881   Ljava/lang/StringIndexOutOfBoundsException;
        //  2888   2895   2895   2896   Any
        //  2888   2895   2888   2889   Ljava/lang/EnumConstantNotPresentException;
        //  2889   2895   3      8      Any
        //  2889   2895   2888   2889   Ljava/lang/IndexOutOfBoundsException;
        //  2888   2895   3      8      Ljava/lang/IllegalStateException;
        //  2996   3002   3002   3003   Any
        //  2996   3002   3002   3003   Ljava/lang/AssertionError;
        //  2996   3002   3002   3003   Ljava/lang/StringIndexOutOfBoundsException;
        //  2996   3002   3      8      Ljava/lang/IllegalStateException;
        //  2996   3002   3002   3003   Any
        //  3012   3019   3019   3020   Any
        //  3013   3019   3012   3013   Ljava/lang/StringIndexOutOfBoundsException;
        //  3013   3019   3012   3013   Any
        //  3012   3019   3      8      Any
        //  3012   3019   3012   3013   Ljava/lang/ArithmeticException;
        //  3028   3034   3034   3035   Any
        //  3028   3034   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3028   3034   3      8      Ljava/lang/ArithmeticException;
        //  3028   3034   3      8      Ljava/util/ConcurrentModificationException;
        //  3028   3034   3034   3035   Any
        //  3044   3051   3051   3052   Any
        //  3044   3051   3051   3052   Ljava/lang/StringIndexOutOfBoundsException;
        //  3044   3051   3051   3052   Any
        //  3045   3051   3044   3045   Ljava/lang/AssertionError;
        //  3045   3051   3      8      Any
        //  3058   3065   3065   3066   Any
        //  3058   3065   3065   3066   Ljava/lang/NullPointerException;
        //  3059   3065   3065   3066   Any
        //  3059   3065   3058   3059   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3059   3065   3      8      Any
        //  3119   3126   3126   3127   Any
        //  3120   3126   3119   3120   Ljava/lang/RuntimeException;
        //  3120   3126   3      8      Any
        //  3120   3126   3      8      Ljava/lang/ClassCastException;
        //  3120   3126   3119   3120   Ljava/lang/IllegalStateException;
        //  3179   3186   3186   3187   Any
        //  3180   3186   3179   3180   Any
        //  3180   3186   3      8      Any
        //  3180   3186   3      8      Any
        //  3180   3186   3186   3187   Any
        //  3286   3293   3293   3294   Any
        //  3286   3293   3      8      Any
        //  3286   3293   3293   3294   Ljava/lang/NullPointerException;
        //  3287   3293   3286   3287   Ljava/lang/AssertionError;
        //  3287   3293   3286   3287   Ljava/lang/NegativeArraySizeException;
        //  3300   3307   3307   3308   Any
        //  3301   3307   3307   3308   Any
        //  3301   3307   3300   3301   Ljava/lang/RuntimeException;
        //  3300   3307   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3300   3307   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3368   3375   3375   3376   Any
        //  3369   3375   3375   3376   Any
        //  3368   3375   3      8      Any
        //  3368   3375   3368   3369   Ljava/lang/RuntimeException;
        //  3369   3375   3      8      Any
        //  3384   3390   3390   3391   Any
        //  3384   3390   3      8      Ljava/lang/ArithmeticException;
        //  3384   3390   3      8      Any
        //  3384   3390   3390   3391   Any
        //  3384   3390   3390   3391   Any
        //  3505   3512   3512   3513   Any
        //  3506   3512   3505   3506   Any
        //  3506   3512   3      8      Any
        //  3506   3512   3      8      Any
        //  3506   3512   3512   3513   Any
        //  3567   3574   3574   3575   Any
        //  3568   3574   3567   3568   Any
        //  3567   3574   3567   3568   Ljava/lang/NumberFormatException;
        //  3567   3574   3574   3575   Any
        //  3568   3574   3574   3575   Any
        //  3589   3596   3596   3597   Any
        //  3590   3596   3589   3590   Any
        //  3589   3596   3589   3590   Ljava/lang/NegativeArraySizeException;
        //  3589   3596   3596   3597   Any
        //  3589   3596   3596   3597   Any
        //  3607   3613   3613   3614   Any
        //  3607   3613   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3607   3613   3      8      Any
        //  3607   3613   3      8      Any
        //  3607   3613   3613   3614   Any
        //  3623   3630   3630   3631   Any
        //  3623   3630   3      8      Any
        //  3624   3630   3623   3624   Any
        //  3623   3630   3      8      Ljava/lang/IllegalStateException;
        //  3624   3630   3630   3631   Any
        //  3637   3644   3644   3645   Any
        //  3638   3644   3      8      Ljava/lang/UnsupportedOperationException;
        //  3638   3644   3      8      Any
        //  3637   3644   3      8      Ljava/util/ConcurrentModificationException;
        //  3637   3644   3637   3638   Any
        //  3653   3660   3660   3661   Any
        //  3653   3660   3660   3661   Any
        //  3654   3660   3      8      Any
        //  3653   3660   3653   3654   Ljava/lang/UnsupportedOperationException;
        //  3654   3660   3      8      Ljava/lang/IllegalArgumentException;
        //  3669   3675   3675   3676   Any
        //  3669   3675   3      8      Ljava/lang/RuntimeException;
        //  3669   3675   3675   3676   Any
        //  3669   3675   3      8      Ljava/lang/NullPointerException;
        //  3669   3675   3675   3676   Any
        //  3771   3778   3778   3779   Any
        //  3771   3778   3778   3779   Any
        //  3771   3778   3771   3772   Any
        //  3771   3778   3778   3779   Any
        //  3771   3778   3      8      Ljava/lang/ArithmeticException;
        //  3782   3789   3789   3790   Any
        //  3783   3789   3782   3783   Ljava/lang/RuntimeException;
        //  3783   3789   3782   3783   Any
        //  3782   3789   3789   3790   Any
        //  3783   3789   3782   3783   Ljava/lang/IndexOutOfBoundsException;
        //  3797   3804   3804   3805   Any
        //  3798   3804   3804   3805   Ljava/lang/IndexOutOfBoundsException;
        //  3798   3804   3804   3805   Any
        //  3797   3804   3797   3798   Ljava/lang/StringIndexOutOfBoundsException;
        //  3798   3804   3797   3798   Any
        //  3811   3818   3818   3819   Any
        //  3811   3818   3818   3819   Ljava/lang/IndexOutOfBoundsException;
        //  3812   3818   3811   3812   Any
        //  3811   3818   3818   3819   Any
        //  3811   3818   3811   3812   Ljava/lang/RuntimeException;
        //  3871   3878   3878   3879   Any
        //  3872   3878   3878   3879   Any
        //  3871   3878   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3872   3878   3871   3872   Any
        //  3872   3878   3871   3872   Any
        //  4004   4010   4010   4011   Any
        //  4004   4010   4010   4011   Ljava/lang/ArithmeticException;
        //  4004   4010   3      8      Ljava/lang/AssertionError;
        //  4004   4010   4010   4011   Ljava/lang/EnumConstantNotPresentException;
        //  4004   4010   4010   4011   Any
        //  4015   4021   4021   4022   Any
        //  4015   4021   4021   4022   Ljava/lang/NullPointerException;
        //  4015   4021   3      8      Any
        //  4015   4021   4021   4022   Ljava/lang/ClassCastException;
        //  4015   4021   4021   4022   Any
        //  4027   4033   4033   4034   Any
        //  4027   4033   4033   4034   Any
        //  4027   4033   3      8      Ljava/lang/NegativeArraySizeException;
        //  4027   4033   3      8      Ljava/lang/NumberFormatException;
        //  4027   4033   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4038   4044   4044   4045   Any
        //  4038   4044   4044   4045   Any
        //  4038   4044   3      8      Ljava/lang/ArithmeticException;
        //  4038   4044   4044   4045   Ljava/lang/NumberFormatException;
        //  4038   4044   3      8      Any
        //  4053   4059   4059   4060   Any
        //  4053   4059   3      8      Ljava/lang/NegativeArraySizeException;
        //  4053   4059   4059   4060   Any
        //  4053   4059   3      8      Any
        //  4053   4059   3      8      Any
        //  4064   4070   4070   4071   Any
        //  4064   4070   3      8      Any
        //  4064   4070   4070   4071   Any
        //  4064   4070   4070   4071   Ljava/lang/IllegalArgumentException;
        //  4064   4070   3      8      Ljava/lang/NullPointerException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2579
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2571
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2563
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -1239280832
        //    33: goto            39
        //    36: ldc_w           508608423
        //    39: ldc_w           -1758499412
        //    42: ixor           
        //    43: lookupswitch {
        //          -1988111861: 68
        //          554532588: 36
        //          default: 2528
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: ifnull          2493
        //    78: getstatic       dev/nuker/pyro/fc.c:I
        //    81: ifge            90
        //    84: ldc_w           1538006990
        //    87: goto            93
        //    90: ldc_w           1616673281
        //    93: ldc_w           1495341973
        //    96: ixor           
        //    97: lookupswitch {
        //          -1318989637: 90
        //          42796123: 2536
        //          default: 124
        //        }
        //   124: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //   127: getstatic       dev/nuker/pyro/fc.1:I
        //   130: ifeq            139
        //   133: ldc_w           306115971
        //   136: goto            142
        //   139: ldc_w           -2634670
        //   142: ldc_w           -238049911
        //   145: ixor           
        //   146: lookupswitch {
        //          -470724598: 2544
        //          983258539: 139
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getstatic       dev/nuker/pyro/fc.c:I
        //   176: ifge            185
        //   179: ldc_w           -1600533196
        //   182: goto            188
        //   185: ldc_w           -1792318843
        //   188: ldc_w           -559220847
        //   191: ixor           
        //   192: lookupswitch {
        //          -1394877141: 185
        //          2117286565: 2496
        //          default: 220
        //        }
        //   220: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   223: dup            
        //   224: pop            
        //   225: getstatic       dev/nuker/pyro/fc.0:I
        //   228: ifeq            237
        //   231: ldc_w           -2080626454
        //   234: goto            240
        //   237: ldc_w           -1028462462
        //   240: ldc_w           707701877
        //   243: ixor           
        //   244: lookupswitch {
        //          -1445821281: 2520
        //          1224615920: 237
        //          default: 272
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   279: goto            283
        //   282: athrow         
        //   283: dup            
        //   284: ifnonnull       293
        //   287: ldc_w           -1775461917
        //   290: goto            296
        //   293: ldc_w           -1775461920
        //   296: ldc_w           -389624390
        //   299: ixor           
        //   300: tableswitch {
        //          -36394830: 324
        //          -36394829: 335
        //          default: 287
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   331: goto            335
        //   334: athrow         
        //   335: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   338: aload_0        
        //   339: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   342: dup            
        //   343: pop            
        //   344: goto            348
        //   347: athrow         
        //   348: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   351: goto            355
        //   354: athrow         
        //   355: dup            
        //   356: ifnonnull       415
        //   359: getstatic       dev/nuker/pyro/fc.0:I
        //   362: ifeq            371
        //   365: ldc_w           60740430
        //   368: goto            374
        //   371: ldc_w           51048016
        //   374: ldc_w           418914917
        //   377: ixor           
        //   378: lookupswitch {
        //          -2093571462: 371
        //          459731243: 2514
        //          default: 404
        //        }
        //   404: goto            408
        //   407: athrow         
        //   408: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   411: goto            415
        //   414: athrow         
        //   415: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   418: aload_0        
        //   419: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   422: dup            
        //   423: pop            
        //   424: goto            428
        //   427: athrow         
        //   428: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   431: goto            435
        //   434: athrow         
        //   435: dup            
        //   436: ifnonnull       495
        //   439: getstatic       dev/nuker/pyro/fc.1:I
        //   442: ifeq            451
        //   445: ldc_w           -626559189
        //   448: goto            454
        //   451: ldc_w           -1766585163
        //   454: ldc_w           -768054472
        //   457: ixor           
        //   458: lookupswitch {
        //          -268022158: 451
        //          144645139: 2502
        //          default: 484
        //        }
        //   484: goto            488
        //   487: athrow         
        //   488: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   491: goto            495
        //   494: athrow         
        //   495: getstatic       dev/nuker/pyro/fc.0:I
        //   498: ifeq            507
        //   501: ldc_w           1735402202
        //   504: goto            510
        //   507: ldc_w           -2044725243
        //   510: ldc_w           811364273
        //   513: ixor           
        //   514: lookupswitch {
        //          -1237084236: 540
        //          1462521195: 507
        //          default: 2504
        //        }
        //   540: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   543: goto            547
        //   546: athrow         
        //   547: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78547_a:(DDD)V
        //   552: goto            556
        //   555: athrow         
        //   556: goto            560
        //   559: athrow         
        //   560: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   563: goto            567
        //   566: athrow         
        //   567: aload_0        
        //   568: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   571: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   574: dup            
        //   575: ifnonnull       589
        //   578: goto            582
        //   581: athrow         
        //   582: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   585: goto            589
        //   588: athrow         
        //   589: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //   592: goto            596
        //   595: athrow         
        //   596: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   601: goto            605
        //   604: athrow         
        //   605: astore          4
        //   607: aload           4
        //   609: goto            613
        //   612: athrow         
        //   613: invokeinterface java/util/Iterator.hasNext:()Z
        //   618: goto            622
        //   621: athrow         
        //   622: ifeq            631
        //   625: ldc_w           1290179549
        //   628: goto            634
        //   631: ldc_w           1290179548
        //   634: ldc_w           -366103599
        //   637: ixor           
        //   638: tableswitch {
        //          1301692440: 660
        //          1301692441: 2482
        //          default: 625
        //        }
        //   660: aload           4
        //   662: getstatic       dev/nuker/pyro/fc.1:I
        //   665: ifeq            674
        //   668: ldc_w           -393071149
        //   671: goto            677
        //   674: ldc_w           -1246455432
        //   677: ldc_w           676372337
        //   680: ixor           
        //   681: lookupswitch {
        //          -1060984158: 2494
        //          617474979: 674
        //          default: 708
        //        }
        //   708: goto            712
        //   711: athrow         
        //   712: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   717: goto            721
        //   720: athrow         
        //   721: checkcast       Lnet/minecraft/entity/Entity;
        //   724: astore_3       
        //   725: getstatic       dev/nuker/pyro/fc.1:I
        //   728: ifeq            737
        //   731: ldc_w           -1557261374
        //   734: goto            740
        //   737: ldc_w           -1062821798
        //   740: ldc_w           1544559754
        //   743: ixor           
        //   744: lookupswitch {
        //          -1665745712: 772
        //          -12710072: 737
        //          default: 2518
        //        }
        //   772: aload_3        
        //   773: aload_0        
        //   774: getstatic       dev/nuker/pyro/fc.c:I
        //   777: ifge            786
        //   780: ldc_w           1609062095
        //   783: goto            789
        //   786: ldc_w           1942045366
        //   789: ldc_w           122699311
        //   792: ixor           
        //   793: lookupswitch {
        //          -1290078465: 786
        //          1488480480: 2516
        //          default: 820
        //        }
        //   820: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   823: dup            
        //   824: pop            
        //   825: goto            829
        //   828: athrow         
        //   829: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   832: goto            836
        //   835: athrow         
        //   836: if_acmpne       842
        //   839: goto            2479
        //   842: getstatic       dev/nuker/pyro/fc.0:I
        //   845: ifeq            854
        //   848: ldc_w           -1503616215
        //   851: goto            857
        //   854: ldc_w           581047430
        //   857: ldc_w           -1093766493
        //   860: ixor           
        //   861: lookupswitch {
        //          -1266979199: 854
        //          414110090: 2546
        //          default: 888
        //        }
        //   888: aload_0        
        //   889: getfield        dev/nuker/pyro/f9Z.6:Ldev/nuker/pyro/f0a;
        //   892: goto            896
        //   895: athrow         
        //   896: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   899: goto            903
        //   902: athrow         
        //   903: checkcast       Ljava/lang/Boolean;
        //   906: goto            910
        //   909: athrow         
        //   910: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   913: goto            917
        //   916: athrow         
        //   917: ifeq            1035
        //   920: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //   923: getstatic       dev/nuker/pyro/fc.1:I
        //   926: ifeq            935
        //   929: ldc_w           376736112
        //   932: goto            938
        //   935: ldc_w           -1147675602
        //   938: ldc_w           -1720145220
        //   941: ixor           
        //   942: lookupswitch {
        //          -1895029812: 935
        //          586118802: 968
        //          default: 2522
        //        }
        //   968: aload_3        
        //   969: dup            
        //   970: pop            
        //   971: goto            975
        //   974: athrow         
        //   975: invokevirtual   net/minecraft/entity/Entity.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   978: goto            982
        //   981: athrow         
        //   982: goto            986
        //   985: athrow         
        //   986: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78546_a:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //   991: goto            995
        //   994: athrow         
        //   995: ifeq            1004
        //   998: ldc_w           -331374492
        //  1001: goto            1007
        //  1004: ldc_w           -331374491
        //  1007: ldc_w           -737158176
        //  1010: ixor           
        //  1011: tableswitch {
        //          1885402888: 1032
        //          1885402889: 1035
        //          default: 998
        //        }
        //  1032: goto            2479
        //  1035: aload_3        
        //  1036: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //  1039: ifeq            1048
        //  1042: ldc_w           1697960711
        //  1045: goto            1051
        //  1048: ldc_w           1697960704
        //  1051: ldc_w           271494452
        //  1054: ixor           
        //  1055: tableswitch {
        //          -365626266: 1076
        //          -365626265: 1465
        //          default: 1042
        //        }
        //  1076: getstatic       dev/nuker/pyro/fc.c:I
        //  1079: ifge            1088
        //  1082: ldc_w           1713994450
        //  1085: goto            1091
        //  1088: ldc_w           169233884
        //  1091: ldc_w           -1983086335
        //  1094: ixor           
        //  1095: lookupswitch {
        //          -2082812707: 1120
        //          -270140461: 1088
        //          default: 2550
        //        }
        //  1120: aload_0        
        //  1121: getfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0a;
        //  1124: goto            1128
        //  1127: athrow         
        //  1128: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1131: goto            1135
        //  1134: athrow         
        //  1135: checkcast       Ljava/lang/Boolean;
        //  1138: goto            1142
        //  1141: athrow         
        //  1142: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1145: goto            1149
        //  1148: athrow         
        //  1149: ifeq            1158
        //  1152: ldc_w           1884504722
        //  1155: goto            1161
        //  1158: ldc_w           1884504723
        //  1161: ldc_w           -858297292
        //  1164: ixor           
        //  1165: tableswitch {
        //          2030591308: 1188
        //          2030591309: 1321
        //          default: 1152
        //        }
        //  1188: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1191: aload_3        
        //  1192: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  1202: goto            1206
        //  1205: athrow         
        //  1206: ifeq            1321
        //  1209: getstatic       dev/nuker/pyro/fc.1:I
        //  1212: ifeq            1221
        //  1215: ldc_w           929004346
        //  1218: goto            1224
        //  1221: ldc_w           -1312157185
        //  1224: ldc_w           -396703100
        //  1227: ixor           
        //  1228: lookupswitch {
        //          -553274946: 2510
        //          1500031066: 1221
        //          default: 1256
        //        }
        //  1256: aload_0        
        //  1257: aload_3        
        //  1258: aload_1        
        //  1259: aload_0        
        //  1260: getstatic       dev/nuker/pyro/fc.0:I
        //  1263: ifeq            1272
        //  1266: ldc_w           36278670
        //  1269: goto            1275
        //  1272: ldc_w           2008481960
        //  1275: ldc_w           -443258134
        //  1278: ixor           
        //  1279: lookupswitch {
        //          -406979740: 2506
        //          1150562605: 1272
        //          default: 1304
        //        }
        //  1304: getfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0k;
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  1314: goto            1318
        //  1317: athrow         
        //  1318: goto            2479
        //  1321: getstatic       dev/nuker/pyro/fc.c:I
        //  1324: ifge            1333
        //  1327: ldc_w           -87649826
        //  1330: goto            1336
        //  1333: ldc_w           1319411453
        //  1336: ldc_w           1279867226
        //  1339: ixor           
        //  1340: lookupswitch {
        //          -1232099196: 1333
        //          49129383: 1368
        //          default: 2538
        //        }
        //  1368: aload_0        
        //  1369: getfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0a;
        //  1372: getstatic       dev/nuker/pyro/fc.c:I
        //  1375: ifge            1384
        //  1378: ldc_w           225943247
        //  1381: goto            1387
        //  1384: ldc_w           1503419935
        //  1387: ldc_w           1057286044
        //  1390: ixor           
        //  1391: lookupswitch {
        //          846428499: 1384
        //          1721284995: 1416
        //          default: 2542
        //        }
        //  1416: goto            1420
        //  1419: athrow         
        //  1420: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: checkcast       Ljava/lang/Boolean;
        //  1430: goto            1434
        //  1433: athrow         
        //  1434: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1437: goto            1441
        //  1440: athrow         
        //  1441: ifeq            1462
        //  1444: aload_0        
        //  1445: aload_3        
        //  1446: aload_1        
        //  1447: aload_0        
        //  1448: getfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0k;
        //  1451: goto            1455
        //  1454: athrow         
        //  1455: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  1458: goto            1462
        //  1461: athrow         
        //  1462: goto            2479
        //  1465: aload_3        
        //  1466: instanceof      Lnet/minecraft/entity/boss/EntityDragon;
        //  1469: ifne            1523
        //  1472: getstatic       dev/nuker/pyro/fc.c:I
        //  1475: ifge            1484
        //  1478: ldc_w           -728695006
        //  1481: goto            1487
        //  1484: ldc_w           1711812790
        //  1487: ldc_w           -519161528
        //  1490: ixor           
        //  1491: lookupswitch {
        //          -2126008536: 1484
        //          899597930: 2526
        //          default: 1516
        //        }
        //  1516: aload_3        
        //  1517: instanceof      Lnet/minecraft/entity/boss/EntityWither;
        //  1520: ifeq            1756
        //  1523: getstatic       dev/nuker/pyro/fc.c:I
        //  1526: ifge            1535
        //  1529: ldc_w           333275709
        //  1532: goto            1538
        //  1535: ldc_w           -1857415656
        //  1538: ldc_w           318810366
        //  1541: ixor           
        //  1542: lookupswitch {
        //          -2109030682: 1568
        //          14535363: 1535
        //          default: 2530
        //        }
        //  1568: aload_0        
        //  1569: getfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0a;
        //  1572: getstatic       dev/nuker/pyro/fc.1:I
        //  1575: ifeq            1584
        //  1578: ldc_w           608633523
        //  1581: goto            1587
        //  1584: ldc_w           -627643111
        //  1587: ldc_w           -286696110
        //  1590: ixor           
        //  1591: lookupswitch {
        //          -894541855: 1584
        //          880783435: 1616
        //          default: 2540
        //        }
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1623: goto            1627
        //  1626: athrow         
        //  1627: checkcast       Ljava/lang/Boolean;
        //  1630: getstatic       dev/nuker/pyro/fc.0:I
        //  1633: ifeq            1642
        //  1636: ldc_w           598372798
        //  1639: goto            1645
        //  1642: ldc_w           -1618753935
        //  1645: ldc_w           -1680534417
        //  1648: ixor           
        //  1649: lookupswitch {
        //          -1199610415: 1642
        //          72798750: 1676
        //          default: 2534
        //        }
        //  1676: goto            1680
        //  1679: athrow         
        //  1680: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1683: goto            1687
        //  1686: athrow         
        //  1687: ifeq            2479
        //  1690: aload_0        
        //  1691: getstatic       dev/nuker/pyro/fc.0:I
        //  1694: ifeq            1703
        //  1697: ldc_w           567825643
        //  1700: goto            1706
        //  1703: ldc_w           1534761328
        //  1706: ldc_w           1336438592
        //  1709: ixor           
        //  1710: lookupswitch {
        //          349369904: 1736
        //          1852849067: 1703
        //          default: 2498
        //        }
        //  1736: aload_3        
        //  1737: aload_1        
        //  1738: aload_0        
        //  1739: getfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0k;
        //  1742: goto            1746
        //  1745: athrow         
        //  1746: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  1749: goto            1753
        //  1752: athrow         
        //  1753: goto            2479
        //  1756: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1759: aload_3        
        //  1760: goto            1764
        //  1763: athrow         
        //  1764: invokevirtual   dev/nuker/pyro/f9Y.c:(Lnet/minecraft/entity/Entity;)Z
        //  1767: goto            1771
        //  1770: athrow         
        //  1771: ifeq            2014
        //  1774: aload_0        
        //  1775: getfield        dev/nuker/pyro/f9Z.3:Ldev/nuker/pyro/f0a;
        //  1778: getstatic       dev/nuker/pyro/fc.0:I
        //  1781: ifeq            1790
        //  1784: ldc_w           676062167
        //  1787: goto            1793
        //  1790: ldc_w           101369484
        //  1793: ldc_w           921588776
        //  1796: ixor           
        //  1797: lookupswitch {
        //          514177023: 1790
        //          820286116: 1824
        //          default: 2524
        //        }
        //  1824: goto            1828
        //  1827: athrow         
        //  1828: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1831: goto            1835
        //  1834: athrow         
        //  1835: checkcast       Ljava/lang/Boolean;
        //  1838: goto            1842
        //  1841: athrow         
        //  1842: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1845: goto            1849
        //  1848: athrow         
        //  1849: ifeq            2479
        //  1852: aload_0        
        //  1853: getstatic       dev/nuker/pyro/fc.0:I
        //  1856: ifeq            1865
        //  1859: ldc_w           -332798048
        //  1862: goto            1868
        //  1865: ldc_w           -48627105
        //  1868: ldc_w           1174696834
        //  1871: ixor           
        //  1872: lookupswitch {
        //          -1439853534: 2500
        //          216077013: 1865
        //          default: 1900
        //        }
        //  1900: aload_3        
        //  1901: dup            
        //  1902: pop            
        //  1903: getstatic       dev/nuker/pyro/fc.1:I
        //  1906: ifeq            1915
        //  1909: ldc_w           2052470380
        //  1912: goto            1918
        //  1915: ldc_w           1306940277
        //  1918: ldc_w           -1238931492
        //  1921: ixor           
        //  1922: lookupswitch {
        //          -864988752: 2508
        //          -646413483: 1915
        //          default: 1948
        //        }
        //  1948: aload_1        
        //  1949: getstatic       dev/nuker/pyro/fc.c:I
        //  1952: ifge            1961
        //  1955: ldc_w           -1635926988
        //  1958: goto            1964
        //  1961: ldc_w           363398618
        //  1964: ldc_w           483460120
        //  1967: ixor           
        //  1968: lookupswitch {
        //          -2102609876: 2552
        //          221165448: 1961
        //          default: 1996
        //        }
        //  1996: aload_0        
        //  1997: getfield        dev/nuker/pyro/f9Z.3:Ldev/nuker/pyro/f0k;
        //  2000: goto            2004
        //  2003: athrow         
        //  2004: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  2007: goto            2011
        //  2010: athrow         
        //  2011: goto            2479
        //  2014: aload_3        
        //  2015: getstatic       net/minecraft/entity/EnumCreatureType.MONSTER:Lnet/minecraft/entity/EnumCreatureType;
        //  2018: iconst_0       
        //  2019: goto            2023
        //  2022: athrow         
        //  2023: invokevirtual   net/minecraft/entity/Entity.isCreatureType:(Lnet/minecraft/entity/EnumCreatureType;Z)Z
        //  2026: goto            2030
        //  2029: athrow         
        //  2030: ifeq            2039
        //  2033: ldc_w           -234786694
        //  2036: goto            2042
        //  2039: ldc_w           -234786695
        //  2042: ldc_w           -293969273
        //  2045: ixor           
        //  2046: tableswitch {
        //          955655674: 2068
        //          955655675: 2215
        //          default: 2033
        //        }
        //  2068: aload_0        
        //  2069: getfield        dev/nuker/pyro/f9Z.2:Ldev/nuker/pyro/f0a;
        //  2072: goto            2076
        //  2075: athrow         
        //  2076: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2079: goto            2083
        //  2082: athrow         
        //  2083: checkcast       Ljava/lang/Boolean;
        //  2086: getstatic       dev/nuker/pyro/fc.0:I
        //  2089: ifeq            2098
        //  2092: ldc_w           -1776985023
        //  2095: goto            2101
        //  2098: ldc_w           -602005105
        //  2101: ldc_w           701074396
        //  2104: ixor           
        //  2105: lookupswitch {
        //          -1076045923: 2098
        //          -170415533: 2132
        //          default: 2532
        //        }
        //  2132: goto            2136
        //  2135: athrow         
        //  2136: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2139: goto            2143
        //  2142: athrow         
        //  2143: ifeq            2479
        //  2146: getstatic       dev/nuker/pyro/fc.1:I
        //  2149: ifeq            2158
        //  2152: ldc_w           1453718595
        //  2155: goto            2161
        //  2158: ldc_w           1425791906
        //  2161: ldc_w           -1138326130
        //  2164: ixor           
        //  2165: lookupswitch {
        //          -388145620: 2192
        //          -360482355: 2158
        //          default: 2548
        //        }
        //  2192: aload_0        
        //  2193: aload_3        
        //  2194: dup            
        //  2195: pop            
        //  2196: aload_1        
        //  2197: aload_0        
        //  2198: getfield        dev/nuker/pyro/f9Z.2:Ldev/nuker/pyro/f0k;
        //  2201: goto            2205
        //  2204: athrow         
        //  2205: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  2208: goto            2212
        //  2211: athrow         
        //  2212: goto            2479
        //  2215: aload_3        
        //  2216: instanceof      Lnet/minecraft/entity/item/EntityItem;
        //  2219: ifeq            2228
        //  2222: ldc_w           2052309157
        //  2225: goto            2231
        //  2228: ldc_w           2052309158
        //  2231: ldc_w           -543984872
        //  2234: ixor           
        //  2235: tableswitch {
        //          1266771834: 2256
        //          1266771835: 2345
        //          default: 2222
        //        }
        //  2256: aload_0        
        //  2257: getfield        dev/nuker/pyro/f9Z.4:Ldev/nuker/pyro/f0a;
        //  2260: goto            2264
        //  2263: athrow         
        //  2264: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2267: goto            2271
        //  2270: athrow         
        //  2271: checkcast       Ljava/lang/Boolean;
        //  2274: goto            2278
        //  2277: athrow         
        //  2278: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2281: goto            2285
        //  2284: athrow         
        //  2285: ifeq            2294
        //  2288: ldc_w           -1714243559
        //  2291: goto            2297
        //  2294: ldc_w           -1714243558
        //  2297: ldc_w           281167592
        //  2300: ixor           
        //  2301: tableswitch {
        //          304217570: 2324
        //          304217571: 2479
        //          default: 2288
        //        }
        //  2324: aload_0        
        //  2325: aload_3        
        //  2326: aload_1        
        //  2327: aload_0        
        //  2328: getfield        dev/nuker/pyro/f9Z.4:Ldev/nuker/pyro/f0k;
        //  2331: goto            2335
        //  2334: athrow         
        //  2335: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  2338: goto            2342
        //  2341: athrow         
        //  2342: goto            2479
        //  2345: aload_0        
        //  2346: getfield        dev/nuker/pyro/f9Z.5:Ldev/nuker/pyro/f0a;
        //  2349: goto            2353
        //  2352: athrow         
        //  2353: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2356: goto            2360
        //  2359: athrow         
        //  2360: checkcast       Ljava/lang/Boolean;
        //  2363: goto            2367
        //  2366: athrow         
        //  2367: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2370: goto            2374
        //  2373: athrow         
        //  2374: ifeq            2383
        //  2377: ldc_w           -2122221225
        //  2380: goto            2386
        //  2383: ldc_w           -2122221232
        //  2386: ldc_w           -1317658524
        //  2389: ixor           
        //  2390: tableswitch {
        //          1643033190: 2412
        //          1643033191: 2479
        //          default: 2377
        //        }
        //  2412: aload_0        
        //  2413: getstatic       dev/nuker/pyro/fc.1:I
        //  2416: ifeq            2425
        //  2419: ldc_w           -1818802011
        //  2422: goto            2428
        //  2425: ldc_w           1730378798
        //  2428: ldc_w           304850000
        //  2431: ixor           
        //  2432: lookupswitch {
        //          -2118325003: 2512
        //          1914843775: 2425
        //          default: 2460
        //        }
        //  2460: aload_3        
        //  2461: dup            
        //  2462: pop            
        //  2463: aload_1        
        //  2464: aload_0        
        //  2465: getfield        dev/nuker/pyro/f9Z.5:Ldev/nuker/pyro/f0k;
        //  2468: goto            2472
        //  2471: athrow         
        //  2472: invokespecial   dev/nuker/pyro/f9Z.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Ldev/nuker/pyro/f0k;)V
        //  2475: goto            2479
        //  2478: athrow         
        //  2479: goto            607
        //  2482: goto            2486
        //  2485: athrow         
        //  2486: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  2489: goto            2493
        //  2492: athrow         
        //  2493: return         
        //  2494: aconst_null    
        //  2495: athrow         
        //  2496: aconst_null    
        //  2497: athrow         
        //  2498: aconst_null    
        //  2499: athrow         
        //  2500: aconst_null    
        //  2501: athrow         
        //  2502: aconst_null    
        //  2503: athrow         
        //  2504: aconst_null    
        //  2505: athrow         
        //  2506: aconst_null    
        //  2507: athrow         
        //  2508: aconst_null    
        //  2509: athrow         
        //  2510: aconst_null    
        //  2511: athrow         
        //  2512: aconst_null    
        //  2513: athrow         
        //  2514: aconst_null    
        //  2515: athrow         
        //  2516: aconst_null    
        //  2517: athrow         
        //  2518: aconst_null    
        //  2519: athrow         
        //  2520: aconst_null    
        //  2521: athrow         
        //  2522: aconst_null    
        //  2523: athrow         
        //  2524: aconst_null    
        //  2525: athrow         
        //  2526: aconst_null    
        //  2527: athrow         
        //  2528: aconst_null    
        //  2529: athrow         
        //  2530: aconst_null    
        //  2531: athrow         
        //  2532: aconst_null    
        //  2533: athrow         
        //  2534: aconst_null    
        //  2535: athrow         
        //  2536: aconst_null    
        //  2537: athrow         
        //  2538: aconst_null    
        //  2539: athrow         
        //  2540: aconst_null    
        //  2541: athrow         
        //  2542: aconst_null    
        //  2543: athrow         
        //  2544: aconst_null    
        //  2545: athrow         
        //  2546: aconst_null    
        //  2547: athrow         
        //  2548: aconst_null    
        //  2549: athrow         
        //  2550: aconst_null    
        //  2551: athrow         
        //  2552: aconst_null    
        //  2553: athrow         
        //  2554: pop            
        //  2555: goto            24
        //  2558: pop            
        //  2559: aconst_null    
        //  2560: goto            2554
        //  2563: dup            
        //  2564: ifnull          2554
        //  2567: checkcast       Ljava/lang/Throwable;
        //  2570: athrow         
        //  2571: dup            
        //  2572: ifnull          2558
        //  2575: checkcast       Ljava/lang/Throwable;
        //  2578: athrow         
        //  2579: aconst_null    
        //  2580: athrow         
        //    StackMapTable: 01 58 43 07 00 3B 04 FF 00 0B 00 00 00 01 07 00 3B FE 00 03 07 00 03 07 00 8B 02 0B 42 01 1C 15 42 01 1E 4E 07 02 05 FF 00 02 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 01 5D 07 02 05 FF 00 0C 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 03 FF 00 02 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 07 00 03 01 FF 00 1F 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 03 FF 00 10 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 48 FF 00 02 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 07 00 48 01 FF 00 1F 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 48 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 48 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA FF 00 03 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA FF 00 05 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA FF 00 02 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 07 00 BA 01 FF 00 1B 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA 42 07 00 2A FF 00 00 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 BA 4B 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 48 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA FF 00 0F 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA FF 00 02 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 07 00 BA 01 FF 00 1D 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA 4B 07 00 2A FF 00 00 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 48 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 0F 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 02 00 03 07 00 03 07 00 8B 02 00 05 07 02 05 03 03 07 00 BA 01 FF 00 1D 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 0B 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 02 00 03 07 00 03 07 00 8B 02 00 05 07 02 05 03 03 07 00 BA 01 FF 00 1D 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 03 47 07 00 3B 00 42 07 00 3B 00 45 07 00 3B 00 4D 07 00 26 40 07 02 11 45 07 00 3B 40 07 02 11 45 07 00 3B 40 07 02 17 47 07 00 3B 40 07 02 1D FD 00 01 00 07 02 1D FF 00 04 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 00 07 02 1D 00 01 07 02 1D 47 07 00 3B 40 01 02 05 42 01 19 4D 07 02 1D FF 00 02 00 05 07 00 03 07 00 8B 02 00 07 02 1D 00 02 07 02 1D 01 5E 07 02 1D 42 07 00 3B 40 07 02 1D 47 07 00 3B 40 07 01 D2 FF 00 0F 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 00 42 01 1F FF 00 0D 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 BA 07 00 03 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 BA 07 00 03 01 FF 00 1E 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 BA 07 00 03 47 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 BA 07 00 48 45 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 BA 07 00 BA 05 0B 42 01 1E FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 01 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 00 77 45 07 00 3B 40 01 51 07 02 05 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 05 01 5D 07 02 05 FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 05 07 00 BA 45 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 05 07 02 CF 42 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 05 07 02 CF 47 07 00 3B 40 01 02 05 42 01 18 02 06 05 42 01 18 0B 42 01 1C 46 07 00 1C 40 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 00 77 45 07 00 3B 40 01 02 05 42 01 1A 49 07 00 34 FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 57 07 02 44 45 07 00 3B 40 01 0E 42 01 1F FF 00 0F 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 03 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 05 07 00 03 07 00 BA 07 00 8B 07 00 03 01 FF 00 1C 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 03 FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 0B 42 01 1F 4F 07 00 71 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 71 01 5C 07 00 71 42 07 00 3B 40 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 00 77 45 07 00 3B 40 01 4C 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 12 42 01 1C 06 0B 42 01 1D 4F 07 00 71 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 71 01 5C 07 00 71 42 07 00 3B 40 07 00 71 45 07 00 3B 40 07 01 D2 4E 07 00 77 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 77 01 5E 07 00 77 42 07 00 34 40 07 00 77 45 07 00 3B 40 01 4F 07 00 03 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 01 5D 07 00 03 48 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 46 07 00 2A FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 02 8A 07 00 BA 45 07 00 3B 40 01 52 07 00 71 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 71 01 5E 07 00 71 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 01 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 2E 40 07 00 77 45 07 00 3B 40 01 4F 07 00 03 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 01 5F 07 00 03 FF 00 0E 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 07 00 BA FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 03 07 00 BA 01 FF 00 1D 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 07 00 BA FF 00 0C 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 03 07 00 BA 07 00 8B FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 01 FF 00 1F 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 03 07 00 BA 07 00 8B FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 47 07 00 20 FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 BA 07 02 9F 01 45 07 00 3B 40 01 02 05 42 01 19 46 07 00 34 40 07 00 71 45 07 00 3B 40 07 01 D2 4E 07 00 77 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 77 01 5E 07 00 77 42 07 00 3B 40 07 00 77 45 07 00 3B 40 01 0E 42 01 1E 4B 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 06 05 42 01 18 46 07 00 3B 40 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 00 77 45 07 00 3B 40 01 02 05 42 01 1A FF 00 09 00 00 00 01 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 02 46 07 00 3B 40 07 00 71 45 07 00 3B 40 07 01 D2 45 07 00 3B 40 07 00 77 45 07 00 3B 40 01 02 05 42 01 19 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 01 5F 07 00 03 4A 07 00 3B FF 00 00 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 5A 45 07 00 3B 00 FF 00 02 00 05 07 00 03 07 00 8B 02 00 07 02 1D 00 00 42 07 00 3B 00 45 07 00 3B F9 00 00 FF 00 00 00 05 07 00 03 07 00 8B 02 00 07 02 1D 00 01 07 02 1D FF 00 01 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 03 FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 01 07 00 03 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 01 00 03 07 00 03 07 00 8B 02 00 04 07 02 05 03 03 07 00 BA FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 04 07 00 03 07 00 BA 07 00 8B 07 00 03 FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 03 07 00 BA 01 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 8B 02 00 03 07 02 05 03 07 00 BA FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 02 07 00 BA 07 00 03 01 FF 00 01 00 03 07 00 03 07 00 8B 02 00 02 07 02 05 07 00 48 FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 01 07 02 05 41 07 00 71 01 F9 00 01 FD 00 01 07 00 BA 07 02 1D 41 07 00 77 41 07 00 77 F9 00 01 FD 00 01 07 00 BA 07 02 1D 41 07 00 71 41 07 00 71 FF 00 01 00 03 07 00 03 07 00 8B 02 00 01 07 02 05 FD 00 01 07 00 BA 07 02 1D 01 01 FF 00 01 00 05 07 00 03 07 00 8B 02 07 00 BA 07 02 1D 00 03 07 00 03 07 00 BA 07 00 8B FF 00 01 00 03 07 00 03 07 00 8B 02 00 01 07 00 3B 43 05 44 07 00 3B 47 05 47 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2563   2571   Ljava/util/ConcurrentModificationException;
        //  2563   2571   2563   2571   Any
        //  2579   2581   3      8      Any
        //  276    282    282    283    Any
        //  276    282    282    283    Ljava/util/NoSuchElementException;
        //  276    282    282    283    Ljava/lang/RuntimeException;
        //  276    282    282    283    Any
        //  276    282    3      8      Any
        //  327    334    334    335    Any
        //  328    334    334    335    Ljava/lang/ArithmeticException;
        //  327    334    327    328    Ljava/lang/RuntimeException;
        //  328    334    334    335    Ljava/lang/NumberFormatException;
        //  328    334    334    335    Ljava/lang/NegativeArraySizeException;
        //  347    354    354    355    Any
        //  348    354    3      8      Any
        //  347    354    347    348    Any
        //  347    354    354    355    Any
        //  347    354    3      8      Ljava/lang/AssertionError;
        //  408    414    414    415    Any
        //  408    414    3      8      Any
        //  408    414    3      8      Ljava/lang/IllegalArgumentException;
        //  408    414    3      8      Ljava/lang/IllegalArgumentException;
        //  408    414    414    415    Any
        //  427    434    434    435    Any
        //  428    434    434    435    Ljava/lang/IndexOutOfBoundsException;
        //  427    434    427    428    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  427    434    3      8      Any
        //  427    434    427    428    Ljava/lang/EnumConstantNotPresentException;
        //  488    494    494    495    Any
        //  488    494    494    495    Ljava/lang/IllegalArgumentException;
        //  488    494    494    495    Ljava/lang/NegativeArraySizeException;
        //  488    494    494    495    Ljava/lang/NegativeArraySizeException;
        //  488    494    494    495    Any
        //  546    555    555    556    Any
        //  546    555    546    547    Any
        //  546    555    3      8      Ljava/lang/NegativeArraySizeException;
        //  547    555    555    556    Ljava/lang/NullPointerException;
        //  547    555    546    547    Any
        //  559    566    566    567    Any
        //  560    566    566    567    Ljava/lang/UnsupportedOperationException;
        //  560    566    3      8      Ljava/util/NoSuchElementException;
        //  560    566    559    560    Any
        //  559    566    3      8      Ljava/lang/NegativeArraySizeException;
        //  581    588    588    589    Any
        //  581    588    588    589    Any
        //  581    588    3      8      Any
        //  581    588    581    582    Ljava/lang/UnsupportedOperationException;
        //  582    588    3      8      Any
        //  595    604    604    605    Any
        //  595    604    595    596    Ljava/lang/RuntimeException;
        //  596    604    3      8      Ljava/lang/UnsupportedOperationException;
        //  595    604    604    605    Any
        //  595    604    595    596    Any
        //  613    621    621    622    Any
        //  613    621    3      8      Any
        //  613    621    3      8      Any
        //  613    621    621    622    Any
        //  613    621    3      8      Any
        //  711    720    720    721    Any
        //  712    720    720    721    Ljava/lang/StringIndexOutOfBoundsException;
        //  711    720    711    712    Ljava/lang/StringIndexOutOfBoundsException;
        //  712    720    3      8      Ljava/lang/ArithmeticException;
        //  711    720    711    712    Any
        //  828    835    835    836    Any
        //  829    835    828    829    Ljava/lang/NegativeArraySizeException;
        //  828    835    3      8      Any
        //  829    835    828    829    Any
        //  828    835    3      8      Any
        //  896    902    902    903    Any
        //  896    902    3      8      Any
        //  896    902    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  896    902    3      8      Any
        //  896    902    3      8      Ljava/lang/UnsupportedOperationException;
        //  909    916    916    917    Any
        //  910    916    3      8      Ljava/util/NoSuchElementException;
        //  909    916    909    910    Any
        //  910    916    3      8      Ljava/lang/NullPointerException;
        //  909    916    916    917    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  975    981    981    982    Any
        //  975    981    3      8      Ljava/lang/UnsupportedOperationException;
        //  975    981    3      8      Any
        //  975    981    3      8      Any
        //  975    981    981    982    Ljava/lang/AssertionError;
        //  985    994    994    995    Any
        //  986    994    994    995    Any
        //  985    994    3      8      Any
        //  985    994    985    986    Any
        //  985    994    985    986    Ljava/lang/EnumConstantNotPresentException;
        //  1127   1134   1134   1135   Any
        //  1128   1134   1127   1128   Ljava/lang/NegativeArraySizeException;
        //  1128   1134   3      8      Any
        //  1127   1134   3      8      Any
        //  1128   1134   3      8      Any
        //  1141   1148   1148   1149   Any
        //  1141   1148   1148   1149   Ljava/lang/NegativeArraySizeException;
        //  1142   1148   1141   1142   Any
        //  1142   1148   1148   1149   Ljava/lang/IllegalStateException;
        //  1141   1148   1141   1142   Any
        //  1198   1205   1205   1206   Any
        //  1198   1205   1205   1206   Any
        //  1199   1205   1205   1206   Ljava/lang/EnumConstantNotPresentException;
        //  1199   1205   1205   1206   Any
        //  1199   1205   1198   1199   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1311   1317   1317   1318   Any
        //  1311   1317   1317   1318   Ljava/lang/RuntimeException;
        //  1311   1317   3      8      Ljava/lang/ClassCastException;
        //  1311   1317   3      8      Ljava/util/NoSuchElementException;
        //  1311   1317   1317   1318   Ljava/lang/EnumConstantNotPresentException;
        //  1419   1426   1426   1427   Any
        //  1420   1426   1426   1427   Any
        //  1420   1426   1426   1427   Any
        //  1419   1426   1419   1420   Any
        //  1420   1426   1426   1427   Any
        //  1433   1440   1440   1441   Any
        //  1433   1440   1440   1441   Any
        //  1434   1440   1433   1434   Any
        //  1433   1440   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1433   1440   1433   1434   Ljava/util/NoSuchElementException;
        //  1454   1461   1461   1462   Any
        //  1455   1461   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1455   1461   1461   1462   Any
        //  1454   1461   3      8      Any
        //  1455   1461   1454   1455   Any
        //  1619   1626   1626   1627   Any
        //  1620   1626   1619   1620   Any
        //  1619   1626   3      8      Ljava/util/NoSuchElementException;
        //  1620   1626   3      8      Ljava/util/NoSuchElementException;
        //  1619   1626   3      8      Ljava/lang/NumberFormatException;
        //  1679   1686   1686   1687   Any
        //  1679   1686   1686   1687   Any
        //  1680   1686   1686   1687   Ljava/lang/AssertionError;
        //  1680   1686   1679   1680   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1679   1686   1686   1687   Any
        //  1745   1752   1752   1753   Any
        //  1745   1752   1745   1746   Any
        //  1746   1752   1752   1753   Ljava/lang/NullPointerException;
        //  1746   1752   1752   1753   Any
        //  1745   1752   1745   1746   Ljava/lang/AssertionError;
        //  1763   1770   1770   1771   Any
        //  1763   1770   3      8      Any
        //  1764   1770   3      8      Any
        //  1764   1770   1763   1764   Ljava/util/ConcurrentModificationException;
        //  1763   1770   1763   1764   Ljava/lang/NullPointerException;
        //  1828   1834   1834   1835   Any
        //  1828   1834   3      8      Ljava/lang/AssertionError;
        //  1828   1834   1834   1835   Ljava/lang/EnumConstantNotPresentException;
        //  1828   1834   1834   1835   Any
        //  1828   1834   3      8      Any
        //  1841   1848   1848   1849   Any
        //  1841   1848   3      8      Any
        //  1842   1848   1841   1842   Ljava/lang/EnumConstantNotPresentException;
        //  1842   1848   3      8      Any
        //  1841   1848   1848   1849   Any
        //  2004   2010   2010   2011   Any
        //  2004   2010   2010   2011   Ljava/lang/ClassCastException;
        //  2004   2010   3      8      Ljava/util/ConcurrentModificationException;
        //  2004   2010   3      8      Any
        //  2004   2010   2010   2011   Any
        //  2022   2029   2029   2030   Any
        //  2022   2029   3      8      Any
        //  2023   2029   2022   2023   Ljava/lang/IllegalStateException;
        //  2023   2029   2029   2030   Any
        //  2023   2029   2029   2030   Ljava/lang/ArithmeticException;
        //  2075   2082   2082   2083   Any
        //  2075   2082   2075   2076   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2075   2082   3      8      Ljava/lang/NullPointerException;
        //  2075   2082   3      8      Any
        //  2075   2082   2082   2083   Ljava/lang/StringIndexOutOfBoundsException;
        //  2135   2142   2142   2143   Any
        //  2135   2142   2135   2136   Any
        //  2136   2142   3      8      Ljava/lang/NumberFormatException;
        //  2136   2142   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2136   2142   2135   2136   Any
        //  2204   2211   2211   2212   Any
        //  2205   2211   2204   2205   Any
        //  2205   2211   2211   2212   Any
        //  2204   2211   2211   2212   Any
        //  2205   2211   2211   2212   Any
        //  2263   2270   2270   2271   Any
        //  2264   2270   2263   2264   Any
        //  2264   2270   2263   2264   Ljava/lang/ArithmeticException;
        //  2264   2270   2270   2271   Ljava/util/ConcurrentModificationException;
        //  2264   2270   2270   2271   Any
        //  2277   2284   2284   2285   Any
        //  2277   2284   2277   2278   Any
        //  2278   2284   2277   2278   Ljava/lang/IndexOutOfBoundsException;
        //  2277   2284   2277   2278   Any
        //  2277   2284   3      8      Any
        //  2335   2341   2341   2342   Any
        //  2335   2341   2341   2342   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2335   2341   3      8      Ljava/lang/AssertionError;
        //  2335   2341   2341   2342   Ljava/lang/NumberFormatException;
        //  2335   2341   2341   2342   Ljava/lang/UnsupportedOperationException;
        //  2352   2359   2359   2360   Any
        //  2352   2359   3      8      Any
        //  2353   2359   2352   2353   Any
        //  2353   2359   2359   2360   Ljava/lang/AssertionError;
        //  2352   2359   2359   2360   Any
        //  2366   2373   2373   2374   Any
        //  2366   2373   2366   2367   Any
        //  2367   2373   3      8      Ljava/lang/NegativeArraySizeException;
        //  2367   2373   3      8      Any
        //  2367   2373   3      8      Any
        //  2471   2478   2478   2479   Any
        //  2472   2478   2478   2479   Any
        //  2471   2478   2471   2472   Any
        //  2472   2478   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2472   2478   2471   2472   Ljava/lang/EnumConstantNotPresentException;
        //  2485   2492   2492   2493   Any
        //  2486   2492   2485   2486   Any
        //  2486   2492   2485   2486   Any
        //  2486   2492   3      8      Any
        //  2485   2492   2492   2493   Any
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
    
    static {
        f9Z.c = new f9Y(null);
    }
    
    public f9Z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            12
        //     6: ldc_w           -1193993200
        //     9: goto            15
        //    12: ldc_w           -1522367912
        //    15: ldc_w           -633860865
        //    18: ixor           
        //    19: lookupswitch {
        //          1659703535: 12
        //          2138738343: 44
        //          default: 2514
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u2271\u1492\u8b7e\ub3d8\uc932"
        //    48: getstatic       dev/nuker/pyro/fc.0:I
        //    51: ifeq            60
        //    54: ldc_w           -1192993805
        //    57: goto            63
        //    60: ldc_w           1241896894
        //    63: ldc_w           -311697345
        //    66: ixor           
        //    67: lookupswitch {
        //          -755961826: 60
        //          1435483084: 2532
        //          default: 92
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc_w           "\u2251\u1492\u8b7e\ub3d8\uc932"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: ldc_w           "\u2250\u1496\u8b7f\ub399\uc92e\uec60\ub225\ue745\ud96a\ue94a\ua6e5\u1e49\ue07d\uc5b3\u81dd\u88ea\u57ad\u7697\ubd2e"
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            116
        //   110: ldc_w           1531452359
        //   113: goto            119
        //   116: ldc_w           1334378786
        //   119: ldc_w           -1925435786
        //   122: ixor           
        //   123: lookupswitch {
        //          -697027151: 2546
        //          -298935356: 116
        //          default: 148
        //        }
        //   148: invokestatic    invokestatic   !!! ERROR
        //   151: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   154: aload_0        
        //   155: new             Ldev/nuker/pyro/f0a;
        //   158: dup            
        //   159: ldc_w           "\u2273\u149f\u8b7b\ub3c0\uc925\uec77\ub237"
        //   162: invokestatic    invokestatic   !!! ERROR
        //   165: ldc_w           "\u2253\u149f\u8b7b\ub3c0\uc925\uec77\ub237"
        //   168: getstatic       dev/nuker/pyro/fc.c:I
        //   171: ifge            180
        //   174: ldc_w           -186601137
        //   177: goto            183
        //   180: ldc_w           -1324851294
        //   183: ldc_w           804049212
        //   186: ixor           
        //   187: lookupswitch {
        //          -619945869: 2544
        //          1237497523: 180
        //          default: 212
        //        }
        //   212: invokestatic    invokestatic   !!! ERROR
        //   215: aconst_null    
        //   216: iconst_1       
        //   217: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            232
        //   226: ldc_w           1189560589
        //   229: goto            235
        //   232: ldc_w           -933380154
        //   235: ldc_w           424214563
        //   238: ixor           
        //   239: lookupswitch {
        //          -1974526868: 232
        //          1605255470: 2560
        //          default: 264
        //        }
        //   264: putfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0a;
        //   267: aload_0        
        //   268: new             Ldev/nuker/pyro/f0a;
        //   271: dup            
        //   272: ldc_w           "\u2265\u1481\u8b73\ub3dc\uc92e\uec61\ub237"
        //   275: invokestatic    invokestatic   !!! ERROR
        //   278: ldc_w           "\u2245\u1481\u8b73\ub3dc\uc92e\uec61\ub237"
        //   281: invokestatic    invokestatic   !!! ERROR
        //   284: aconst_null    
        //   285: iconst_1       
        //   286: getstatic       dev/nuker/pyro/fc.1:I
        //   289: ifeq            298
        //   292: ldc_w           -1375071533
        //   295: goto            301
        //   298: ldc_w           -1173632101
        //   301: ldc_w           -2101541898
        //   304: ixor           
        //   305: lookupswitch {
        //          -1417369719: 298
        //          750194981: 2542
        //          default: 332
        //        }
        //   332: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   335: putfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0a;
        //   338: aload_0        
        //   339: new             Ldev/nuker/pyro/f0a;
        //   342: dup            
        //   343: ldc_w           "\u2261\u149c\u8b69\ub3ca\uc925\uec76"
        //   346: getstatic       dev/nuker/pyro/fc.c:I
        //   349: ifge            358
        //   352: ldc_w           2034719111
        //   355: goto            361
        //   358: ldc_w           2011331359
        //   361: ldc_w           -505933231
        //   364: ixor           
        //   365: lookupswitch {
        //          -1774556850: 392
        //          -1734390826: 358
        //          default: 2530
        //        }
        //   392: invokestatic    invokestatic   !!! ERROR
        //   395: ldc_w           "\u2241\u149c\u8b69\ub3ca\uc925\uec76"
        //   398: invokestatic    invokestatic   !!! ERROR
        //   401: aconst_null    
        //   402: iconst_1       
        //   403: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   406: getstatic       dev/nuker/pyro/fc.c:I
        //   409: ifge            418
        //   412: ldc_w           1322192539
        //   415: goto            421
        //   418: ldc_w           -1136515594
        //   421: ldc_w           1793609117
        //   424: ixor           
        //   425: lookupswitch {
        //          -693475221: 452
        //          606552838: 418
        //          default: 2558
        //        }
        //   452: putfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0a;
        //   455: aload_0        
        //   456: new             Ldev/nuker/pyro/f0a;
        //   459: dup            
        //   460: ldc_w           "\u226b\u149c\u8b69\ub3cd\uc929\uec69\ub221\ue744"
        //   463: invokestatic    invokestatic   !!! ERROR
        //   466: ldc_w           "\u224b\u149c\u8b69\ub3cd\uc929\uec69\ub221\ue744"
        //   469: invokestatic    invokestatic   !!! ERROR
        //   472: aconst_null    
        //   473: iconst_1       
        //   474: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   477: putfield        dev/nuker/pyro/f9Z.2:Ldev/nuker/pyro/f0a;
        //   480: aload_0        
        //   481: new             Ldev/nuker/pyro/f0a;
        //   484: dup            
        //   485: ldc_w           "\u2273\u1492\u8b69\ub3ca\uc929\uec73\ub221\ue744"
        //   488: invokestatic    invokestatic   !!! ERROR
        //   491: ldc_w           "\u2253\u1492\u8b69\ub3ca\uc929\uec73\ub221\ue744"
        //   494: invokestatic    invokestatic   !!! ERROR
        //   497: aconst_null    
        //   498: iconst_1       
        //   499: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   502: getstatic       dev/nuker/pyro/fc.c:I
        //   505: ifge            514
        //   508: ldc_w           -1575900893
        //   511: goto            517
        //   514: ldc_w           -780734784
        //   517: ldc_w           -1109223037
        //   520: ixor           
        //   521: lookupswitch {
        //          536031392: 514
        //          1821669187: 548
        //          default: 2524
        //        }
        //   548: putfield        dev/nuker/pyro/f9Z.3:Ldev/nuker/pyro/f0a;
        //   551: getstatic       dev/nuker/pyro/fc.0:I
        //   554: ifeq            563
        //   557: ldc_w           890795071
        //   560: goto            566
        //   563: ldc_w           -1277449358
        //   566: ldc_w           1543810325
        //   569: ixor           
        //   570: lookupswitch {
        //          -270596505: 596
        //          1763498282: 563
        //          default: 2562
        //        }
        //   596: aload_0        
        //   597: new             Ldev/nuker/pyro/f0a;
        //   600: dup            
        //   601: ldc_w           "\u226a\u1487\u8b7f\ub3d4\uc933"
        //   604: invokestatic    invokestatic   !!! ERROR
        //   607: ldc_w           "\u224a\u1487\u8b7f\ub3d4\uc933"
        //   610: invokestatic    invokestatic   !!! ERROR
        //   613: aconst_null    
        //   614: iconst_0       
        //   615: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   618: getstatic       dev/nuker/pyro/fc.1:I
        //   621: ifeq            630
        //   624: ldc_w           -695291212
        //   627: goto            633
        //   630: ldc_w           1323604140
        //   633: ldc_w           -1332356916
        //   636: ixor           
        //   637: lookupswitch {
        //          -26132384: 664
        //          1713072760: 630
        //          default: 2500
        //        }
        //   664: putfield        dev/nuker/pyro/f9Z.4:Ldev/nuker/pyro/f0a;
        //   667: getstatic       dev/nuker/pyro/fc.1:I
        //   670: ifeq            679
        //   673: ldc_w           -1235526738
        //   676: goto            682
        //   679: ldc_w           -1547306700
        //   682: ldc_w           -1870711308
        //   685: ixor           
        //   686: lookupswitch {
        //          639921754: 679
        //          867880128: 712
        //          default: 2518
        //        }
        //   712: aload_0        
        //   713: new             Ldev/nuker/pyro/f0a;
        //   716: dup            
        //   717: ldc_w           "\u226c\u1487\u8b72\ub3dc\uc932"
        //   720: invokestatic    invokestatic   !!! ERROR
        //   723: ldc_w           "\u224c\u1487\u8b72\ub3dc\uc932"
        //   726: getstatic       dev/nuker/pyro/fc.c:I
        //   729: ifge            738
        //   732: ldc_w           -229906481
        //   735: goto            741
        //   738: ldc_w           1167166947
        //   741: ldc_w           -139295809
        //   744: ixor           
        //   745: lookupswitch {
        //          -578784734: 738
        //          100230256: 2504
        //          default: 772
        //        }
        //   772: invokestatic    invokestatic   !!! ERROR
        //   775: aconst_null    
        //   776: iconst_0       
        //   777: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   780: getstatic       dev/nuker/pyro/fc.c:I
        //   783: ifge            792
        //   786: ldc_w           -2132924405
        //   789: goto            795
        //   792: ldc_w           2106420077
        //   795: ldc_w           800498754
        //   798: ixor           
        //   799: lookupswitch {
        //          -1352102839: 792
        //          1379651375: 824
        //          default: 2526
        //        }
        //   824: putfield        dev/nuker/pyro/f9Z.5:Ldev/nuker/pyro/f0a;
        //   827: aload_0        
        //   828: aload_0        
        //   829: new             Ldev/nuker/pyro/f0k;
        //   832: dup            
        //   833: aload_0        
        //   834: getfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0a;
        //   837: checkcast       Ldev/nuker/pyro/f0n;
        //   840: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //   843: new             Ldev/nuker/pyro/fS;
        //   846: dup            
        //   847: ldc_w           0.43
        //   850: fconst_1       
        //   851: fconst_1       
        //   852: fconst_1       
        //   853: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   856: new             Ldev/nuker/pyro/fS;
        //   859: dup            
        //   860: ldc_w           0.8
        //   863: fconst_1       
        //   864: fconst_1       
        //   865: fconst_1       
        //   866: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   869: ldc2_w          0.75
        //   872: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //   875: dup            
        //   876: arraylength    
        //   877: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   880: checkcast       [Ldev/nuker/pyro/f0n;
        //   883: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //   886: checkcast       Ldev/nuker/pyro/f0n;
        //   889: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   892: checkcast       Ldev/nuker/pyro/f0k;
        //   895: putfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0k;
        //   898: aload_0        
        //   899: aload_0        
        //   900: new             Ldev/nuker/pyro/f0k;
        //   903: dup            
        //   904: aload_0        
        //   905: getfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0a;
        //   908: checkcast       Ldev/nuker/pyro/f0n;
        //   911: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //   914: new             Ldev/nuker/pyro/fS;
        //   917: dup            
        //   918: ldc_w           0.51
        //   921: fconst_1       
        //   922: fconst_1       
        //   923: fconst_1       
        //   924: getstatic       dev/nuker/pyro/fc.c:I
        //   927: ifge            936
        //   930: ldc_w           -1782409354
        //   933: goto            939
        //   936: ldc_w           -498581571
        //   939: ldc_w           446114690
        //   942: ixor           
        //   943: lookupswitch {
        //          -1890206476: 2554
        //          178166468: 936
        //          default: 968
        //        }
        //   968: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   971: new             Ldev/nuker/pyro/fS;
        //   974: dup            
        //   975: ldc_w           0.62
        //   978: fconst_1       
        //   979: fconst_1       
        //   980: fconst_1       
        //   981: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   984: ldc2_w          0.75
        //   987: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //   990: dup            
        //   991: arraylength    
        //   992: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   995: checkcast       [Ldev/nuker/pyro/f0n;
        //   998: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1001: checkcast       Ldev/nuker/pyro/f0n;
        //  1004: getstatic       dev/nuker/pyro/fc.1:I
        //  1007: ifeq            1016
        //  1010: ldc_w           1428562369
        //  1013: goto            1019
        //  1016: ldc_w           1480764651
        //  1019: ldc_w           1706213190
        //  1022: ixor           
        //  1023: lookupswitch {
        //          815046279: 1016
        //          1039143853: 1048
        //          default: 2534
        //        }
        //  1048: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1051: checkcast       Ldev/nuker/pyro/f0k;
        //  1054: putfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0k;
        //  1057: getstatic       dev/nuker/pyro/fc.c:I
        //  1060: ifge            1069
        //  1063: ldc_w           -1859629623
        //  1066: goto            1072
        //  1069: ldc_w           1813411559
        //  1072: ldc_w           -1072177603
        //  1075: ixor           
        //  1076: lookupswitch {
        //          1363121140: 2506
        //          2072461078: 1069
        //          default: 1104
        //        }
        //  1104: aload_0        
        //  1105: aload_0        
        //  1106: new             Ldev/nuker/pyro/f0k;
        //  1109: dup            
        //  1110: aload_0        
        //  1111: getfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0a;
        //  1114: checkcast       Ldev/nuker/pyro/f0n;
        //  1117: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1120: new             Ldev/nuker/pyro/fS;
        //  1123: dup            
        //  1124: fconst_0       
        //  1125: fconst_1       
        //  1126: ldc_w           0.56
        //  1129: ldc_w           0.56
        //  1132: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1135: new             Ldev/nuker/pyro/fS;
        //  1138: dup            
        //  1139: iconst_0       
        //  1140: iconst_1       
        //  1141: iconst_1       
        //  1142: iconst_1       
        //  1143: invokespecial   dev/nuker/pyro/fS.<init>:(IIII)V
        //  1146: ldc2_w          0.75
        //  1149: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //  1152: dup            
        //  1153: arraylength    
        //  1154: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //  1157: checkcast       [Ldev/nuker/pyro/f0n;
        //  1160: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1163: checkcast       Ldev/nuker/pyro/f0n;
        //  1166: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1169: checkcast       Ldev/nuker/pyro/f0k;
        //  1172: getstatic       dev/nuker/pyro/fc.1:I
        //  1175: ifeq            1184
        //  1178: ldc_w           -677690250
        //  1181: goto            1187
        //  1184: ldc_w           -278860025
        //  1187: ldc_w           799403159
        //  1190: ixor           
        //  1191: lookupswitch {
        //          -1823797922: 1184
        //          -130111263: 2498
        //          default: 1216
        //        }
        //  1216: putfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0k;
        //  1219: aload_0        
        //  1220: aload_0        
        //  1221: new             Ldev/nuker/pyro/f0k;
        //  1224: dup            
        //  1225: aload_0        
        //  1226: getfield        dev/nuker/pyro/f9Z.2:Ldev/nuker/pyro/f0a;
        //  1229: checkcast       Ldev/nuker/pyro/f0n;
        //  1232: getstatic       dev/nuker/pyro/fc.c:I
        //  1235: ifge            1244
        //  1238: ldc_w           1656932054
        //  1241: goto            1247
        //  1244: ldc_w           1580648069
        //  1247: ldc_w           -576575582
        //  1250: ixor           
        //  1251: lookupswitch {
        //          -1197898762: 1244
        //          -1084169868: 2528
        //          default: 1276
        //        }
        //  1276: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1279: new             Ldev/nuker/pyro/fS;
        //  1282: dup            
        //  1283: ldc_w           0.16
        //  1286: fconst_1       
        //  1287: fconst_1       
        //  1288: ldc_w           0.17
        //  1291: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1294: new             Ldev/nuker/pyro/fS;
        //  1297: dup            
        //  1298: ldc_w           0.08
        //  1301: fconst_1       
        //  1302: fconst_1       
        //  1303: ldc_w           0.88
        //  1306: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1309: ldc2_w          0.5
        //  1312: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //  1315: dup            
        //  1316: arraylength    
        //  1317: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //  1320: checkcast       [Ldev/nuker/pyro/f0n;
        //  1323: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1326: checkcast       Ldev/nuker/pyro/f0n;
        //  1329: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1332: checkcast       Ldev/nuker/pyro/f0k;
        //  1335: putfield        dev/nuker/pyro/f9Z.2:Ldev/nuker/pyro/f0k;
        //  1338: aload_0        
        //  1339: aload_0        
        //  1340: new             Ldev/nuker/pyro/f0k;
        //  1343: dup            
        //  1344: aload_0        
        //  1345: getfield        dev/nuker/pyro/f9Z.3:Ldev/nuker/pyro/f0a;
        //  1348: checkcast       Ldev/nuker/pyro/f0n;
        //  1351: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1354: new             Ldev/nuker/pyro/fS;
        //  1357: dup            
        //  1358: ldc_w           0.33
        //  1361: ldc_w           0.55
        //  1364: fconst_1       
        //  1365: ldc_w           0.1
        //  1368: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1371: new             Ldev/nuker/pyro/fS;
        //  1374: dup            
        //  1375: ldc_w           0.33
        //  1378: ldc_w           0.6
        //  1381: fconst_1       
        //  1382: ldc_w           0.44
        //  1385: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1388: ldc2_w          0.5
        //  1391: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //  1394: dup            
        //  1395: arraylength    
        //  1396: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //  1399: checkcast       [Ldev/nuker/pyro/f0n;
        //  1402: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1405: checkcast       Ldev/nuker/pyro/f0n;
        //  1408: getstatic       dev/nuker/pyro/fc.c:I
        //  1411: ifge            1420
        //  1414: ldc_w           2108263747
        //  1417: goto            1423
        //  1420: ldc_w           1863682303
        //  1423: ldc_w           -243011644
        //  1426: ixor           
        //  1427: lookupswitch {
        //          -1943379321: 2510
        //          -916871279: 1420
        //          default: 1452
        //        }
        //  1452: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1455: checkcast       Ldev/nuker/pyro/f0k;
        //  1458: putfield        dev/nuker/pyro/f9Z.3:Ldev/nuker/pyro/f0k;
        //  1461: getstatic       dev/nuker/pyro/fc.c:I
        //  1464: ifge            1473
        //  1467: ldc_w           -1080296287
        //  1470: goto            1476
        //  1473: ldc_w           -747920315
        //  1476: ldc_w           -293548820
        //  1479: ixor           
        //  1480: lookupswitch {
        //          -2126749242: 1473
        //          1360736333: 2508
        //          default: 1508
        //        }
        //  1508: aload_0        
        //  1509: aload_0        
        //  1510: new             Ldev/nuker/pyro/f0k;
        //  1513: dup            
        //  1514: aload_0        
        //  1515: getfield        dev/nuker/pyro/f9Z.4:Ldev/nuker/pyro/f0a;
        //  1518: checkcast       Ldev/nuker/pyro/f0n;
        //  1521: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1524: new             Ldev/nuker/pyro/fS;
        //  1527: dup            
        //  1528: ldc_w           0.5
        //  1531: fconst_1       
        //  1532: fconst_1       
        //  1533: ldc_w           0.3
        //  1536: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1539: new             Ldev/nuker/pyro/fS;
        //  1542: dup            
        //  1543: ldc_w           0.5
        //  1546: fconst_1       
        //  1547: fconst_1       
        //  1548: fconst_1       
        //  1549: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1552: ldc2_w          0.3
        //  1555: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //  1558: dup            
        //  1559: arraylength    
        //  1560: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //  1563: checkcast       [Ldev/nuker/pyro/f0n;
        //  1566: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1569: checkcast       Ldev/nuker/pyro/f0n;
        //  1572: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1575: checkcast       Ldev/nuker/pyro/f0k;
        //  1578: putfield        dev/nuker/pyro/f9Z.4:Ldev/nuker/pyro/f0k;
        //  1581: aload_0        
        //  1582: aload_0        
        //  1583: new             Ldev/nuker/pyro/f0k;
        //  1586: dup            
        //  1587: aload_0        
        //  1588: getfield        dev/nuker/pyro/f9Z.5:Ldev/nuker/pyro/f0a;
        //  1591: checkcast       Ldev/nuker/pyro/f0n;
        //  1594: getstatic       dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f9Y;
        //  1597: new             Ldev/nuker/pyro/fS;
        //  1600: dup            
        //  1601: ldc_w           0.6
        //  1604: fconst_1       
        //  1605: fconst_1       
        //  1606: ldc_w           0.17
        //  1609: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1612: new             Ldev/nuker/pyro/fS;
        //  1615: dup            
        //  1616: ldc_w           0.6
        //  1619: fconst_1       
        //  1620: fconst_1       
        //  1621: fconst_1       
        //  1622: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1625: ldc2_w          0.5
        //  1628: invokestatic    dev/nuker/pyro/f9Y.c:(Ldev/nuker/pyro/f9Y;Ldev/nuker/pyro/fS;Ldev/nuker/pyro/fS;D)[Ldev/nuker/pyro/f0n;
        //  1631: dup            
        //  1632: arraylength    
        //  1633: getstatic       dev/nuker/pyro/fc.1:I
        //  1636: ifeq            1645
        //  1639: ldc_w           1730212012
        //  1642: goto            1648
        //  1645: ldc_w           -951905885
        //  1648: ldc_w           809870079
        //  1651: ixor           
        //  1652: lookupswitch {
        //          -150555812: 1680
        //          1466258003: 1645
        //          default: 2512
        //        }
        //  1680: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //  1683: checkcast       [Ldev/nuker/pyro/f0n;
        //  1686: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1689: checkcast       Ldev/nuker/pyro/f0n;
        //  1692: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1695: checkcast       Ldev/nuker/pyro/f0k;
        //  1698: putfield        dev/nuker/pyro/f9Z.5:Ldev/nuker/pyro/f0k;
        //  1701: aload_0        
        //  1702: aload_0        
        //  1703: new             Ldev/nuker/pyro/f0d;
        //  1706: dup            
        //  1707: ldc_w           "\u2270\u1490\u8b7b\ub3d5\uc925"
        //  1710: invokestatic    invokestatic   !!! ERROR
        //  1713: ldc_w           "\u2250\u1490\u8b7b\ub3d5\uc925"
        //  1716: invokestatic    invokestatic   !!! ERROR
        //  1719: aconst_null    
        //  1720: dconst_1       
        //  1721: dconst_0       
        //  1722: ldc2_w          10.0
        //  1725: dconst_0       
        //  1726: bipush          64
        //  1728: aconst_null    
        //  1729: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1732: checkcast       Ldev/nuker/pyro/f0n;
        //  1735: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1738: checkcast       Ldev/nuker/pyro/f0d;
        //  1741: getstatic       dev/nuker/pyro/fc.c:I
        //  1744: ifge            1753
        //  1747: ldc_w           -893157346
        //  1750: goto            1756
        //  1753: ldc_w           511091418
        //  1756: ldc_w           682423970
        //  1759: ixor           
        //  1760: lookupswitch {
        //          -496011588: 1753
        //          920278136: 1788
        //          default: 2548
        //        }
        //  1788: putfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0d;
        //  1791: getstatic       dev/nuker/pyro/fc.0:I
        //  1794: ifeq            1803
        //  1797: ldc_w           -665263024
        //  1800: goto            1806
        //  1803: ldc_w           -777847594
        //  1806: ldc_w           158813204
        //  1809: ixor           
        //  1810: lookupswitch {
        //          -785405884: 2564
        //          814025101: 1803
        //          default: 1836
        //        }
        //  1836: aload_0        
        //  1837: aload_0        
        //  1838: new             Ldev/nuker/pyro/f0d;
        //  1841: dup            
        //  1842: ldc_w           "\u2267\u149a\u8b69\ub3cd\uc921\uec6b\ub227\ue752"
        //  1845: invokestatic    invokestatic   !!! ERROR
        //  1848: ldc_w           "\u2247\u149a\u8b69\ub3cd\uc921\uec6b\ub227\ue752"
        //  1851: invokestatic    invokestatic   !!! ERROR
        //  1854: aconst_null    
        //  1855: dconst_1       
        //  1856: dconst_0       
        //  1857: ldc2_w          10.0
        //  1860: dconst_0       
        //  1861: bipush          64
        //  1863: aconst_null    
        //  1864: getstatic       dev/nuker/pyro/fc.0:I
        //  1867: ifeq            1876
        //  1870: ldc_w           1429765241
        //  1873: goto            1879
        //  1876: ldc_w           1526503918
        //  1879: ldc_w           -1241908297
        //  1882: ixor           
        //  1883: lookupswitch {
        //          -1503621861: 1876
        //          -524187698: 2550
        //          default: 1908
        //        }
        //  1908: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1911: checkcast       Ldev/nuker/pyro/f0n;
        //  1914: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1917: checkcast       Ldev/nuker/pyro/f0d;
        //  1920: putfield        dev/nuker/pyro/f9Z.0:Ldev/nuker/pyro/f0d;
        //  1923: getstatic       dev/nuker/pyro/fc.0:I
        //  1926: ifeq            1935
        //  1929: ldc_w           2076008291
        //  1932: goto            1938
        //  1935: ldc_w           1252040502
        //  1938: ldc_w           1352090392
        //  1941: ixor           
        //  1942: lookupswitch {
        //          439868462: 1968
        //          724180091: 1935
        //          default: 2520
        //        }
        //  1968: aload_0        
        //  1969: getstatic       dev/nuker/pyro/fc.c:I
        //  1972: ifge            1981
        //  1975: ldc_w           -1860790842
        //  1978: goto            1984
        //  1981: ldc_w           2132342125
        //  1984: ldc_w           -111090283
        //  1987: ixor           
        //  1988: lookupswitch {
        //          754482354: 1981
        //          1752592467: 2522
        //          default: 2016
        //        }
        //  2016: aload_0        
        //  2017: new             Ldev/nuker/pyro/f0d;
        //  2020: dup            
        //  2021: ldc_w           "\u2260\u149b\u8b7b\ub3d7\uc927\uec60\ub21b\ue745\ud969\ue957\ua6ac\u1e59\ue060"
        //  2024: invokestatic    invokestatic   !!! ERROR
        //  2027: ldc_w           "\u2240\u149c\u8b76\ub3d6\uc932\uec25\ub207\ue75f\ud969\ue95d\ua6a2\u1e49\ue033\uc595\u81d5\u88fa\u57ad\u7687\ubd2e"
        //  2030: invokestatic    invokestatic   !!! ERROR
        //  2033: aconst_null    
        //  2034: ldc2_w          75.0
        //  2037: dconst_0       
        //  2038: ldc2_w          1000.0
        //  2041: dconst_0       
        //  2042: bipush          64
        //  2044: aconst_null    
        //  2045: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2048: checkcast       Ldev/nuker/pyro/f0n;
        //  2051: getstatic       dev/nuker/pyro/fc.1:I
        //  2054: ifeq            2063
        //  2057: ldc_w           -708903964
        //  2060: goto            2066
        //  2063: ldc_w           -1884687331
        //  2066: ldc_w           -1689548800
        //  2069: ixor           
        //  2070: lookupswitch {
        //          1324708836: 2516
        //          1695028838: 2063
        //          default: 2096
        //        }
        //  2096: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2099: checkcast       Ldev/nuker/pyro/f0d;
        //  2102: putfield        dev/nuker/pyro/f9Z.1:Ldev/nuker/pyro/f0d;
        //  2105: aload_0        
        //  2106: getstatic       dev/nuker/pyro/fc.0:I
        //  2109: ifeq            2118
        //  2112: ldc_w           -1621802263
        //  2115: goto            2121
        //  2118: ldc_w           -66813918
        //  2121: ldc_w           -1130538107
        //  2124: ixor           
        //  2125: lookupswitch {
        //          600316268: 2118
        //          1083825063: 2152
        //          default: 2502
        //        }
        //  2152: aload_0        
        //  2153: new             Ldev/nuker/pyro/f0a;
        //  2156: dup            
        //  2157: ldc_w           "\u226b\u149a\u8b7e\ub3dc\uc91f\uec63\ub236\ue742\ud97b\ue947\ua6b7\u1e59\ue07e"
        //  2160: invokestatic    invokestatic   !!! ERROR
        //  2163: ldc_w           "\u224b\u149a\u8b7e\ub3dc\uc960\uec4c\ub22a\ue717\ud94e\ue941\ua6b0\u1e5f\ue067\uc5b5\u81c1\u88f3"
        //  2166: invokestatic    invokestatic   !!! ERROR
        //  2169: ldc_w           "\u224b\u149a\u8b7e\ub3dc\uc960\uec60\ub22a\ue743\ud961\ue947\ua6ac\u1e49\ue060\uc5e7\u81cd\u88f1\u57b1\u76d2\ubd3e\uc0ee\u2a9f\uc27b\u6b89\u2d53\ud734"
        //  2172: getstatic       dev/nuker/pyro/fc.1:I
        //  2175: ifeq            2184
        //  2178: ldc_w           1760943656
        //  2181: goto            2187
        //  2184: ldc_w           1574182544
        //  2187: ldc_w           -49098094
        //  2190: ixor           
        //  2191: lookupswitch {
        //          -1780020038: 2538
        //          26158105: 2184
        //          default: 2216
        //        }
        //  2216: invokestatic    invokestatic   !!! ERROR
        //  2219: iconst_0       
        //  2220: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2223: checkcast       Ldev/nuker/pyro/f0n;
        //  2226: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2229: checkcast       Ldev/nuker/pyro/f0a;
        //  2232: getstatic       dev/nuker/pyro/fc.c:I
        //  2235: ifge            2244
        //  2238: ldc_w           -2089954220
        //  2241: goto            2247
        //  2244: ldc_w           -961551985
        //  2247: ldc_w           -108024062
        //  2250: ixor           
        //  2251: lookupswitch {
        //          1721408772: 2244
        //          2061663062: 2540
        //          default: 2276
        //        }
        //  2276: putfield        dev/nuker/pyro/f9Z.6:Ldev/nuker/pyro/f0a;
        //  2279: aload_0        
        //  2280: getstatic       dev/nuker/pyro/fc.1:I
        //  2283: ifeq            2292
        //  2286: ldc_w           260814500
        //  2289: goto            2295
        //  2292: ldc_w           -1341800822
        //  2295: ldc_w           746882165
        //  2298: ixor           
        //  2299: lookupswitch {
        //          588198609: 2556
        //          2023049643: 2292
        //          default: 2324
        //        }
        //  2324: aload_0        
        //  2325: new             Ldev/nuker/pyro/f0g;
        //  2328: dup            
        //  2329: ldc_w           "\u2277\u149a\u8b76\ub3cd"
        //  2332: invokestatic    invokestatic   !!! ERROR
        //  2335: ldc_w           "\u2257\u149a\u8b76\ub3cd"
        //  2338: getstatic       dev/nuker/pyro/fc.c:I
        //  2341: ifge            2350
        //  2344: ldc_w           -2070496947
        //  2347: goto            2353
        //  2350: ldc_w           -2071684257
        //  2353: ldc_w           -1564957759
        //  2356: ixor           
        //  2357: lookupswitch {
        //          -99007449: 2350
        //          640555660: 2552
        //          default: 2384
        //        }
        //  2384: invokestatic    invokestatic   !!! ERROR
        //  2387: aconst_null    
        //  2388: bipush          50
        //  2390: bipush          -90
        //  2392: bipush          90
        //  2394: iconst_0       
        //  2395: bipush          64
        //  2397: aconst_null    
        //  2398: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2401: checkcast       Ldev/nuker/pyro/f0n;
        //  2404: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2407: checkcast       Ldev/nuker/pyro/f0g;
        //  2410: putfield        dev/nuker/pyro/f9Z.c:Ldev/nuker/pyro/f0g;
        //  2413: aload_0        
        //  2414: aload_0        
        //  2415: new             Ldev/nuker/pyro/f0a;
        //  2418: dup            
        //  2419: ldc_w           "\u2276\u149d\u8b76\ub3d6\uc923\uec6e\ub210\ue75e\ud964\ue947"
        //  2422: invokestatic    invokestatic   !!! ERROR
        //  2425: ldc_w           "\u2256\u149d\u8b76\ub3d6\uc923\uec6e\ub264\ue763\ud961\ue95f\ua6b1"
        //  2428: getstatic       dev/nuker/pyro/fc.1:I
        //  2431: ifeq            2440
        //  2434: ldc_w           1033107766
        //  2437: goto            2443
        //  2440: ldc_w           -1582580149
        //  2443: ldc_w           -564616673
        //  2446: ixor           
        //  2447: lookupswitch {
        //          -473212119: 2536
        //          1222325579: 2440
        //          default: 2472
        //        }
        //  2472: invokestatic    invokestatic   !!! ERROR
        //  2475: ldc_w           "\u2256\u149d\u8b76\ub3d6\uc923\uec6e\ub264\ue743\ud961\ue95f\ua6b1\u1e0c\ue064\uc5af\u81d1\u88f0\u57e4\u768b\ubd32\uc0fa\u2ad1\uc237\u6b95\u2d59\ud73a\u3446\u7d2f\u8836\u8006\u8c7a"
        //  2478: invokestatic    invokestatic   !!! ERROR
        //  2481: iconst_0       
        //  2482: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2485: checkcast       Ldev/nuker/pyro/f0n;
        //  2488: invokevirtual   dev/nuker/pyro/f9Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2491: checkcast       Ldev/nuker/pyro/f0a;
        //  2494: putfield        dev/nuker/pyro/f9Z.7:Ldev/nuker/pyro/f0a;
        //  2497: return         
        //  2498: aconst_null    
        //  2499: athrow         
        //  2500: aconst_null    
        //  2501: athrow         
        //  2502: aconst_null    
        //  2503: athrow         
        //  2504: aconst_null    
        //  2505: athrow         
        //  2506: aconst_null    
        //  2507: athrow         
        //  2508: aconst_null    
        //  2509: athrow         
        //  2510: aconst_null    
        //  2511: athrow         
        //  2512: aconst_null    
        //  2513: athrow         
        //  2514: aconst_null    
        //  2515: athrow         
        //  2516: aconst_null    
        //  2517: athrow         
        //  2518: aconst_null    
        //  2519: athrow         
        //  2520: aconst_null    
        //  2521: athrow         
        //  2522: aconst_null    
        //  2523: athrow         
        //  2524: aconst_null    
        //  2525: athrow         
        //  2526: aconst_null    
        //  2527: athrow         
        //  2528: aconst_null    
        //  2529: athrow         
        //  2530: aconst_null    
        //  2531: athrow         
        //  2532: aconst_null    
        //  2533: athrow         
        //  2534: aconst_null    
        //  2535: athrow         
        //  2536: aconst_null    
        //  2537: athrow         
        //  2538: aconst_null    
        //  2539: athrow         
        //  2540: aconst_null    
        //  2541: athrow         
        //  2542: aconst_null    
        //  2543: athrow         
        //  2544: aconst_null    
        //  2545: athrow         
        //  2546: aconst_null    
        //  2547: athrow         
        //  2548: aconst_null    
        //  2549: athrow         
        //  2550: aconst_null    
        //  2551: athrow         
        //  2552: aconst_null    
        //  2553: athrow         
        //  2554: aconst_null    
        //  2555: athrow         
        //  2556: aconst_null    
        //  2557: athrow         
        //  2558: aconst_null    
        //  2559: athrow         
        //  2560: aconst_null    
        //  2561: athrow         
        //  2562: aconst_null    
        //  2563: athrow         
        //  2564: aconst_null    
        //  2565: athrow         
        //    StackMapTable: 00 88 0C 42 01 1C FF 00 0F 00 01 06 00 02 06 07 01 CE FF 00 02 00 01 06 00 03 06 07 01 CE 01 FF 00 1C 00 01 06 00 02 06 07 01 CE FF 00 17 00 01 06 00 04 06 07 01 CE 07 01 CE 07 01 CE FF 00 02 00 01 06 00 05 06 07 01 CE 07 01 CE 07 01 CE 01 FF 00 1C 00 01 06 00 04 06 07 01 CE 07 01 CE 07 01 CE FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 00 9B 08 00 9B 07 01 CE 07 01 CE FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 9B 08 00 9B 07 01 CE 07 01 CE 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 9B 08 00 9B 07 01 CE 07 01 CE FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 21 00 01 07 00 03 00 07 07 00 03 08 01 0C 08 01 0C 07 01 CE 07 01 CE 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 01 0C 08 01 0C 07 01 CE 07 01 CE 05 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 01 0C 08 01 0C 07 01 CE 07 01 CE 05 01 FF 00 19 00 01 07 00 03 00 04 07 00 03 08 01 53 08 01 53 07 01 CE FF 00 02 00 01 07 00 03 00 05 07 00 03 08 01 53 08 01 53 07 01 CE 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 01 53 08 01 53 07 01 CE FF 00 19 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 3D 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 71 0E 42 01 1D FF 00 21 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 71 0E 42 01 1D FF 00 19 00 01 07 00 03 00 05 07 00 03 08 02 C9 08 02 C9 07 01 CE 07 01 CE FF 00 02 00 01 07 00 03 00 06 07 00 03 08 02 C9 08 02 C9 07 01 CE 07 01 CE 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 02 C9 08 02 C9 07 01 CE 07 01 CE FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 6F 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 03 84 08 03 84 07 01 D0 07 02 8A 08 03 92 08 03 92 02 02 02 02 FF 00 02 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 03 84 08 03 84 07 01 D0 07 02 8A 08 03 92 08 03 92 02 02 02 02 01 FF 00 1C 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 03 84 08 03 84 07 01 D0 07 02 8A 08 03 92 08 03 92 02 02 02 02 FF 00 2F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 D0 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 14 42 01 1F FF 00 4F 00 01 07 00 03 00 02 07 00 03 07 00 5A FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 5A 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 5A FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 C5 08 04 C5 07 01 D0 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 C5 08 04 C5 07 01 D0 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 C5 08 04 C5 07 01 D0 FF 00 8F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 D0 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 14 42 01 1F FF 00 88 00 01 07 00 03 00 07 07 00 03 07 00 03 08 06 2F 08 06 2F 07 01 D0 07 03 36 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 06 2F 08 06 2F 07 01 D0 07 03 36 01 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 06 2F 08 06 2F 07 01 D0 07 03 36 01 FF 00 48 00 01 07 00 03 00 02 07 00 03 07 00 FE FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 FE 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 FE 0E 42 01 1D FF 00 27 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 07 2E 08 07 2E 07 01 CE 07 01 CE 05 03 03 03 03 01 05 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 07 2E 08 07 2E 07 01 CE 07 01 CE 05 03 03 03 03 01 05 01 FF 00 1C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 07 2E 08 07 2E 07 01 CE 07 01 CE 05 03 03 03 03 01 05 1A 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 2E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 D0 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 55 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 08 69 08 08 69 07 01 CE 07 01 CE 07 01 CE FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 08 69 08 08 69 07 01 CE 07 01 CE 07 01 CE 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 07 00 03 08 08 69 08 08 69 07 01 CE 07 01 CE 07 01 CE FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 71 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 71 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 19 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 15 08 09 15 07 01 CE 07 01 CE FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 09 15 08 09 15 07 01 CE 07 01 CE 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 15 08 09 15 07 01 CE 07 01 CE FF 00 37 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 6F 08 09 6F 07 01 CE 07 01 CE FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 09 6F 08 09 6F 07 01 CE 07 01 CE 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 6F 08 09 6F 07 01 CE 07 01 CE FF 00 19 00 01 07 00 03 00 02 07 00 03 07 00 5A FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 02 C9 08 02 C9 07 01 CE 07 01 CE 01 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 06 2F 08 06 2F 07 01 D0 07 03 36 01 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 01 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 C5 08 04 C5 07 01 D0 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 53 08 01 53 07 01 CE FF 00 01 00 01 06 00 02 06 07 01 CE FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 D0 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 6F 08 09 6F 07 01 CE 07 01 CE FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 08 69 08 08 69 07 01 CE 07 01 CE 07 01 CE FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 01 0C 08 01 0C 07 01 CE 07 01 CE 05 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 9B 08 00 9B 07 01 CE 07 01 CE FF 00 01 00 01 06 00 04 06 07 01 CE 07 01 CE 07 01 CE FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 FE FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 07 2E 08 07 2E 07 01 CE 07 01 CE 05 03 03 03 03 01 05 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 09 15 08 09 15 07 01 CE 07 01 CE FF 00 01 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 03 84 08 03 84 07 01 D0 07 02 8A 08 03 92 08 03 92 02 02 02 02 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 71 01 01
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
    
    @NotNull
    public fbN c(@NotNull final Vec3d p0, @NotNull final Vec3d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          630
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            622
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            614
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           1699120716
        //    33: goto            39
        //    36: ldc_w           731921349
        //    39: ldc_w           740594859
        //    42: ixor           
        //    43: lookupswitch {
        //          -37677276: 36
        //          1231164135: 603
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_2        
        //    71: pop            
        //    72: aload_2        
        //    73: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    76: getstatic       dev/nuker/pyro/fc.1:I
        //    79: ifeq            88
        //    82: ldc_w           -1017634352
        //    85: goto            91
        //    88: ldc_w           -1739888368
        //    91: ldc_w           1234827006
        //    94: ixor           
        //    95: lookupswitch {
        //          -1967007954: 591
        //          -1367860990: 88
        //          default: 120
        //        }
        //   120: aload_1        
        //   121: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   124: dsub           
        //   125: getstatic       dev/nuker/pyro/fc.c:I
        //   128: ifge            137
        //   131: ldc_w           -1444056245
        //   134: goto            140
        //   137: ldc_w           -1997275286
        //   140: ldc_w           -630858050
        //   143: ixor           
        //   144: lookupswitch {
        //          1385570772: 172
        //          1938337269: 137
        //          default: 595
        //        }
        //   172: dstore_3       
        //   173: getstatic       dev/nuker/pyro/fc.1:I
        //   176: ifeq            185
        //   179: ldc_w           -1534575029
        //   182: goto            188
        //   185: ldc_w           -825964933
        //   188: ldc_w           -398762158
        //   191: ixor           
        //   192: lookupswitch {
        //          654285097: 220
        //          1286824217: 185
        //          default: 597
        //        }
        //   220: aload_2        
        //   221: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   224: aload_1        
        //   225: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   228: dsub           
        //   229: dstore          5
        //   231: aload_2        
        //   232: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   235: aload_1        
        //   236: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   239: dsub           
        //   240: getstatic       dev/nuker/pyro/fc.0:I
        //   243: ifeq            252
        //   246: ldc_w           -1528467754
        //   249: goto            255
        //   252: ldc_w           2067332450
        //   255: ldc_w           347034414
        //   258: ixor           
        //   259: lookupswitch {
        //          -1337311752: 252
        //          1872211532: 284
        //          default: 587
        //        }
        //   284: dstore          7
        //   286: dload_3        
        //   287: dload_3        
        //   288: dmul           
        //   289: dload           7
        //   291: dload           7
        //   293: dmul           
        //   294: dadd           
        //   295: goto            299
        //   298: athrow         
        //   299: invokestatic    net/minecraft/util/math/MathHelper.func_76133_a:(D)F
        //   302: goto            306
        //   305: athrow         
        //   306: f2d            
        //   307: dstore          9
        //   309: new             Ldev/nuker/pyro/fbN;
        //   312: dup            
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            325
        //   319: ldc_w           176687890
        //   322: goto            328
        //   325: ldc_w           1816944067
        //   328: ldc_w           1690713522
        //   331: ixor           
        //   332: lookupswitch {
        //          143286385: 360
        //          1850619552: 325
        //          default: 601
        //        }
        //   360: dload           7
        //   362: dload_3        
        //   363: goto            367
        //   366: athrow         
        //   367: invokestatic    net/minecraft/util/math/MathHelper.func_181159_b:(DD)D
        //   370: goto            374
        //   373: athrow         
        //   374: getstatic       dev/nuker/pyro/fc.0:I
        //   377: ifeq            386
        //   380: ldc_w           -80602809
        //   383: goto            389
        //   386: ldc_w           853966822
        //   389: ldc_w           -1699731191
        //   392: ixor           
        //   393: lookupswitch {
        //          1584157196: 386
        //          1635921998: 599
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokestatic    java/lang/Math.toDegrees:(D)D
        //   427: goto            431
        //   430: athrow         
        //   431: d2f            
        //   432: ldc_w           90.0
        //   435: fsub           
        //   436: goto            440
        //   439: athrow         
        //   440: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   443: goto            447
        //   446: athrow         
        //   447: getstatic       dev/nuker/pyro/fc.c:I
        //   450: ifge            459
        //   453: ldc_w           838211125
        //   456: goto            462
        //   459: ldc_w           -1820936177
        //   462: ldc_w           -1557542286
        //   465: ixor           
        //   466: lookupswitch {
        //          -1830822841: 593
        //          2129155752: 459
        //          default: 492
        //        }
        //   492: dload           5
        //   494: dload           9
        //   496: goto            500
        //   499: athrow         
        //   500: invokestatic    net/minecraft/util/math/MathHelper.func_181159_b:(DD)D
        //   503: goto            507
        //   506: athrow         
        //   507: goto            511
        //   510: athrow         
        //   511: invokestatic    java/lang/Math.toDegrees:(D)D
        //   514: goto            518
        //   517: athrow         
        //   518: dneg           
        //   519: d2f            
        //   520: getstatic       dev/nuker/pyro/fc.0:I
        //   523: ifeq            532
        //   526: ldc_w           -1595518412
        //   529: goto            535
        //   532: ldc_w           433274683
        //   535: ldc_w           1665511590
        //   538: ixor           
        //   539: lookupswitch {
        //          -1482259394: 532
        //          -1012669806: 589
        //          default: 564
        //        }
        //   564: goto            568
        //   567: athrow         
        //   568: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   571: goto            575
        //   574: athrow         
        //   575: goto            579
        //   578: athrow         
        //   579: invokespecial   dev/nuker/pyro/fbN.<init>:(FF)V
        //   582: goto            586
        //   585: athrow         
        //   586: areturn        
        //   587: aconst_null    
        //   588: athrow         
        //   589: aconst_null    
        //   590: athrow         
        //   591: aconst_null    
        //   592: athrow         
        //   593: aconst_null    
        //   594: athrow         
        //   595: aconst_null    
        //   596: athrow         
        //   597: aconst_null    
        //   598: athrow         
        //   599: aconst_null    
        //   600: athrow         
        //   601: aconst_null    
        //   602: athrow         
        //   603: aconst_null    
        //   604: athrow         
        //   605: pop            
        //   606: goto            24
        //   609: pop            
        //   610: aconst_null    
        //   611: goto            605
        //   614: dup            
        //   615: ifnull          605
        //   618: checkcast       Ljava/lang/Throwable;
        //   621: athrow         
        //   622: dup            
        //   623: ifnull          609
        //   626: checkcast       Ljava/lang/Throwable;
        //   629: athrow         
        //   630: aconst_null    
        //   631: athrow         
        //    StackMapTable: 00 4D FF 00 03 00 06 07 00 03 07 00 8B 07 00 8B 03 03 03 00 01 07 00 3B F8 00 04 FF 00 0B 00 00 00 01 07 00 3B FE 00 03 07 00 03 07 00 8B 07 00 8B 0B 42 01 1C 53 03 FF 00 02 00 03 07 00 03 07 00 8B 07 00 8B 00 02 03 01 5C 03 50 03 FF 00 02 00 03 07 00 03 07 00 8B 07 00 8B 00 02 03 01 5F 03 FC 00 0C 03 42 01 1F FF 00 1F 00 05 07 00 03 07 00 8B 07 00 8B 03 03 00 01 03 FF 00 02 00 05 07 00 03 07 00 8B 07 00 8B 03 03 00 02 03 01 5C 03 FF 00 0D 00 00 00 01 07 00 3B FF 00 00 00 06 07 00 03 07 00 8B 07 00 8B 03 03 03 00 01 03 45 07 00 3B 40 02 FF 00 12 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 02 08 01 35 08 01 35 FF 00 02 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 01 FF 00 1F 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 02 08 01 35 08 01 35 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 03 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 FF 00 0B 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 FF 00 02 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 03 01 FF 00 1E 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 42 07 00 20 FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 FF 00 07 00 00 00 01 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 02 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 02 FF 00 0B 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 02 FF 00 02 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 01 FF 00 1D 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 02 46 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 05 08 01 35 08 01 35 02 03 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 03 42 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 03 FF 00 0D 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 FF 00 02 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 05 08 01 35 08 01 35 02 02 01 FF 00 1C 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 42 07 00 1E FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 42 07 00 3B FF 00 00 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 45 07 00 3B 40 07 00 A6 FF 00 00 00 05 07 00 03 07 00 8B 07 00 8B 03 03 00 01 03 FF 00 01 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 04 08 01 35 08 01 35 02 02 FF 00 01 00 03 07 00 03 07 00 8B 07 00 8B 00 01 03 FF 00 01 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 02 FF 00 01 00 03 07 00 03 07 00 8B 07 00 8B 00 01 03 FC 00 01 03 FF 00 01 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 03 08 01 35 08 01 35 03 FF 00 01 00 07 07 00 03 07 00 8B 07 00 8B 03 03 03 03 00 02 08 01 35 08 01 35 FF 00 01 00 03 07 00 03 07 00 8B 07 00 8B 00 00 41 07 00 2A 43 05 44 07 00 2A 47 05 FF 00 07 00 06 07 00 03 07 00 8B 07 00 8B 03 03 03 00 01 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     614    622    Ljava/lang/ClassCastException;
        //  614    622    614    622    Ljava/util/NoSuchElementException;
        //  630    632    3      8      Any
        //  299    305    305    306    Any
        //  299    305    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  299    305    3      8      Ljava/lang/UnsupportedOperationException;
        //  299    305    3      8      Any
        //  299    305    305    306    Any
        //  366    373    373    374    Any
        //  367    373    3      8      Ljava/lang/UnsupportedOperationException;
        //  366    373    366    367    Any
        //  366    373    373    374    Ljava/lang/IllegalStateException;
        //  366    373    373    374    Any
        //  423    430    430    431    Any
        //  424    430    3      8      Ljava/lang/AssertionError;
        //  424    430    3      8      Any
        //  424    430    3      8      Any
        //  424    430    423    424    Ljava/lang/IllegalStateException;
        //  440    446    446    447    Any
        //  440    446    446    447    Any
        //  440    446    3      8      Ljava/lang/RuntimeException;
        //  440    446    446    447    Ljava/lang/RuntimeException;
        //  440    446    446    447    Any
        //  499    506    506    507    Any
        //  499    506    499    500    Ljava/lang/NumberFormatException;
        //  500    506    499    500    Ljava/util/ConcurrentModificationException;
        //  499    506    499    500    Any
        //  500    506    506    507    Any
        //  510    517    517    518    Any
        //  510    517    3      8      Any
        //  510    517    510    511    Any
        //  510    517    517    518    Any
        //  510    517    517    518    Any
        //  567    574    574    575    Any
        //  567    574    574    575    Any
        //  568    574    574    575    Ljava/util/NoSuchElementException;
        //  567    574    574    575    Any
        //  568    574    567    568    Ljava/lang/IllegalArgumentException;
        //  578    585    585    586    Any
        //  578    585    585    586    Ljava/lang/StringIndexOutOfBoundsException;
        //  578    585    578    579    Any
        //  579    585    578    579    Ljava/util/NoSuchElementException;
        //  579    585    578    579    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:590)
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
    
    public void c(final float n, final float n2, final float n3, final float n4) {
        fbS.fi(this, 1157646884, n, n2, n3, n4);
    }
    
    public double c(final double n, final double n2) {
        return fbS.gA(this, 1122675422, n, n2);
    }
    
    @NotNull
    public Vec3d c(@NotNull final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1000
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            992
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            984
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            39
        //    33: ldc_w           2041314964
        //    36: goto            42
        //    39: ldc_w           -1371735926
        //    42: ldc_w           368189235
        //    45: ixor           
        //    46: lookupswitch {
        //          1496864329: 39
        //          1817829799: 957
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    76: aload_1        
        //    77: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   dev/nuker/pyro/f9Z.c:(DD)D
        //    87: goto            91
        //    90: athrow         
        //    91: aload_0        
        //    92: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //    95: dup            
        //    96: pop            
        //    97: goto            101
        //   100: athrow         
        //   101: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   104: goto            108
        //   107: athrow         
        //   108: dup            
        //   109: ifnonnull       188
        //   112: new             Lkotlin/TypeCastException;
        //   115: dup            
        //   116: ldc_w           "\u226d\u1486\u8b76\ub1c4\ucf1f\uec66\ub225\ue759\udb77\uef23\ua6b1\u1e0c\ue071\uc7b3\u87eb\u88fd\u57a5\u7681\ubf38\uc6d0\u2a85\uc234\u6bda\u2f49\ud141\u3408\u7d66\u8837\u8215\u8a07\u852f\ufb72\u7151\u981e\u1d09\uf0e1\u493c\u89f2\uc892\uf9ad\ub715\u41fd\ub876\ub152\u4aec\u8b64\u7c27\ucfa2\u7f46\uec4c\ue754\u1696\uefcc\u3596\u402e\ue076\u0a19\u8708\u1bf6\u09db\u7690\u7289\uc678\ub9b9\u9c6c\u6b97\ue2e8\ud1a2\ua73b\u2354\u8827\u4f80\u8ae5\u161a\ua54d\u715a\u55b5\u1dfb\u63cc"
        //   119: goto            123
        //   122: athrow         
        //   123: invokestatic    invokestatic   !!! ERROR
        //   126: goto            130
        //   129: athrow         
        //   130: getstatic       dev/nuker/pyro/fc.c:I
        //   133: ifge            142
        //   136: ldc_w           -125348587
        //   139: goto            145
        //   142: ldc_w           -1110677074
        //   145: ldc_w           784873764
        //   148: ixor           
        //   149: lookupswitch {
        //          -2111039250: 142
        //          -699438031: 971
        //          default: 176
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   183: goto            187
        //   186: athrow         
        //   187: athrow         
        //   188: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   191: getstatic       dev/nuker/pyro/fc.0:I
        //   194: ifeq            203
        //   197: ldc_w           -307604807
        //   200: goto            206
        //   203: ldc_w           -1421186417
        //   206: ldc_w           -706998439
        //   209: ixor           
        //   210: lookupswitch {
        //          947281376: 203
        //          2123785686: 236
        //          default: 965
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosX:()D
        //   245: goto            249
        //   248: athrow         
        //   249: dsub           
        //   250: getstatic       dev/nuker/pyro/fc.c:I
        //   253: ifge            262
        //   256: ldc_w           249816818
        //   259: goto            265
        //   262: ldc_w           1171952441
        //   265: ldc_w           -333647419
        //   268: ixor           
        //   269: lookupswitch {
        //          -486598857: 951
        //          1889955669: 262
        //          default: 296
        //        }
        //   296: dstore_2       
        //   297: aload_0        
        //   298: aload_1        
        //   299: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   302: getstatic       dev/nuker/pyro/fc.0:I
        //   305: ifeq            314
        //   308: ldc_w           -1850153089
        //   311: goto            317
        //   314: ldc_w           -833356920
        //   317: ldc_w           -348391150
        //   320: ixor           
        //   321: lookupswitch {
        //          -2092687781: 314
        //          2055413357: 953
        //          default: 348
        //        }
        //   348: aload_1        
        //   349: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   dev/nuker/pyro/f9Z.c:(DD)D
        //   359: goto            363
        //   362: athrow         
        //   363: getstatic       dev/nuker/pyro/fc.1:I
        //   366: ifeq            375
        //   369: ldc_w           1020890012
        //   372: goto            378
        //   375: ldc_w           -1290353529
        //   378: ldc_w           -470319016
        //   381: ixor           
        //   382: lookupswitch {
        //          -550630460: 973
        //          -204983098: 375
        //          default: 408
        //        }
        //   408: aload_0        
        //   409: getstatic       dev/nuker/pyro/fc.1:I
        //   412: ifeq            421
        //   415: ldc_w           1611957069
        //   418: goto            424
        //   421: ldc_w           1198344807
        //   424: ldc_w           -1625090629
        //   427: ixor           
        //   428: lookupswitch {
        //          -13134090: 963
        //          1461489677: 421
        //          default: 456
        //        }
        //   456: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   459: dup            
        //   460: pop            
        //   461: goto            465
        //   464: athrow         
        //   465: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   468: goto            472
        //   471: athrow         
        //   472: dup            
        //   473: ifnonnull       506
        //   476: new             Lkotlin/TypeCastException;
        //   479: dup            
        //   480: ldc_w           "\u226d\u1486\u8b76\ub1c4\ucf1f\uec66\ub225\ue759\udb77\uef23\ua6b1\u1e0c\ue071\uc7b3\u87eb\u88fd\u57a5\u7681\ubf38\uc6d0\u2a85\uc234\u6bda\u2f49\ud141\u3408\u7d66\u8837\u8215\u8a07\u852f\ufb72\u7151\u981e\u1d09\uf0e1\u493c\u89f2\uc892\uf9ad\ub715\u41fd\ub876\ub152\u4aec\u8b64\u7c27\ucfa2\u7f46\uec4c\ue754\u1696\uefcc\u3596\u402e\ue076\u0a19\u8708\u1bf6\u09db\u7690\u7289\uc678\ub9b9\u9c6c\u6b97\ue2e8\ud1a2\ua73b\u2354\u8827\u4f80\u8ae5\u161a\ua54d\u715a\u55b5\u1dfb\u63cc"
        //   483: goto            487
        //   486: athrow         
        //   487: invokestatic    invokestatic   !!! ERROR
        //   490: goto            494
        //   493: athrow         
        //   494: goto            498
        //   497: athrow         
        //   498: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   501: goto            505
        //   504: athrow         
        //   505: athrow         
        //   506: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   509: getstatic       dev/nuker/pyro/fc.0:I
        //   512: ifeq            521
        //   515: ldc_w           -669095379
        //   518: goto            524
        //   521: ldc_w           947762785
        //   524: ldc_w           101883151
        //   527: ixor           
        //   528: lookupswitch {
        //          -707314635: 521
        //          -569575646: 949
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosY:()D
        //   565: goto            569
        //   568: athrow         
        //   569: dsub           
        //   570: getstatic       dev/nuker/pyro/fc.1:I
        //   573: ifeq            582
        //   576: ldc_w           233106659
        //   579: goto            585
        //   582: ldc_w           -441024273
        //   585: ldc_w           -1809239083
        //   588: ixor           
        //   589: lookupswitch {
        //          -1714561226: 967
        //          -357018880: 582
        //          default: 616
        //        }
        //   616: dstore          4
        //   618: aload_0        
        //   619: aload_1        
        //   620: getstatic       dev/nuker/pyro/fc.1:I
        //   623: ifeq            632
        //   626: ldc_w           -1927702365
        //   629: goto            635
        //   632: ldc_w           -1548582802
        //   635: ldc_w           -1798986005
        //   638: ixor           
        //   639: lookupswitch {
        //          -1169374801: 632
        //          433864264: 959
        //          default: 664
        //        }
        //   664: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   667: aload_1        
        //   668: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //   671: goto            675
        //   674: athrow         
        //   675: invokevirtual   dev/nuker/pyro/f9Z.c:(DD)D
        //   678: goto            682
        //   681: athrow         
        //   682: aload_0        
        //   683: getstatic       dev/nuker/pyro/fc.c:I
        //   686: ifge            695
        //   689: ldc_w           -1815586718
        //   692: goto            698
        //   695: ldc_w           963918717
        //   698: ldc_w           -1062427024
        //   701: ixor           
        //   702: lookupswitch {
        //          -103244531: 728
        //          1399127570: 695
        //          default: 969
        //        }
        //   728: getfield        dev/nuker/pyro/f9Z.c:Lnet/minecraft/client/Minecraft;
        //   731: dup            
        //   732: pop            
        //   733: getstatic       dev/nuker/pyro/fc.1:I
        //   736: ifeq            745
        //   739: ldc_w           -1885626536
        //   742: goto            748
        //   745: ldc_w           341935590
        //   748: ldc_w           945212708
        //   751: ixor           
        //   752: lookupswitch {
        //          -1211280772: 745
        //          741820610: 780
        //          default: 955
        //        }
        //   780: goto            784
        //   783: athrow         
        //   784: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   787: goto            791
        //   790: athrow         
        //   791: dup            
        //   792: ifnonnull       801
        //   795: ldc_w           1741145654
        //   798: goto            804
        //   801: ldc_w           1741145655
        //   804: ldc_w           1076432518
        //   807: ixor           
        //   808: tableswitch {
        //          1339920736: 832
        //          1339920737: 862
        //          default: 795
        //        }
        //   832: new             Lkotlin/TypeCastException;
        //   835: dup            
        //   836: ldc_w           "\u226d\u1486\u8b76\ub1c4\ucf1f\uec66\ub225\ue759\udb77\uef23\ua6b1\u1e0c\ue071\uc7b3\u87eb\u88fd\u57a5\u7681\ubf38\uc6d0\u2a85\uc234\u6bda\u2f49\ud141\u3408\u7d66\u8837\u8215\u8a07\u852f\ufb72\u7151\u981e\u1d09\uf0e1\u493c\u89f2\uc892\uf9ad\ub715\u41fd\ub876\ub152\u4aec\u8b64\u7c27\ucfa2\u7f46\uec4c\ue754\u1696\uefcc\u3596\u402e\ue076\u0a19\u8708\u1bf6\u09db\u7690\u7289\uc678\ub9b9\u9c6c\u6b97\ue2e8\ud1a2\ua73b\u2354\u8827\u4f80\u8ae5\u161a\ua54d\u715a\u55b5\u1dfb\u63cc"
        //   839: goto            843
        //   842: athrow         
        //   843: invokestatic    invokestatic   !!! ERROR
        //   846: goto            850
        //   849: athrow         
        //   850: goto            854
        //   853: athrow         
        //   854: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   857: goto            861
        //   860: athrow         
        //   861: athrow         
        //   862: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   865: getstatic       dev/nuker/pyro/fc.1:I
        //   868: ifeq            877
        //   871: ldc_w           -707603038
        //   874: goto            880
        //   877: ldc_w           -1049468431
        //   880: ldc_w           446208576
        //   883: ixor           
        //   884: lookupswitch {
        //          -817213470: 877
        //          -605357135: 912
        //          default: 961
        //        }
        //   912: goto            916
        //   915: athrow         
        //   916: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosZ:()D
        //   921: goto            925
        //   924: athrow         
        //   925: dsub           
        //   926: dstore          6
        //   928: new             Lnet/minecraft/util/math/Vec3d;
        //   931: dup            
        //   932: dload_2        
        //   933: dload           4
        //   935: dload           6
        //   937: goto            941
        //   940: athrow         
        //   941: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   944: goto            948
        //   947: athrow         
        //   948: areturn        
        //   949: aconst_null    
        //   950: athrow         
        //   951: aconst_null    
        //   952: athrow         
        //   953: aconst_null    
        //   954: athrow         
        //   955: aconst_null    
        //   956: athrow         
        //   957: aconst_null    
        //   958: athrow         
        //   959: aconst_null    
        //   960: athrow         
        //   961: aconst_null    
        //   962: athrow         
        //   963: aconst_null    
        //   964: athrow         
        //   965: aconst_null    
        //   966: athrow         
        //   967: aconst_null    
        //   968: athrow         
        //   969: aconst_null    
        //   970: athrow         
        //   971: aconst_null    
        //   972: athrow         
        //   973: aconst_null    
        //   974: athrow         
        //   975: pop            
        //   976: goto            24
        //   979: pop            
        //   980: aconst_null    
        //   981: goto            975
        //   984: dup            
        //   985: ifnull          975
        //   988: checkcast       Ljava/lang/Throwable;
        //   991: athrow         
        //   992: dup            
        //   993: ifnull          979
        //   996: checkcast       Ljava/lang/Throwable;
        //   999: athrow         
        //  1000: aconst_null    
        //  1001: athrow         
        //    StackMapTable: 00 84 43 07 00 3B 04 FF 00 0B 00 00 00 01 07 00 3B FD 00 03 07 00 03 07 00 BA 4E 07 00 03 FF 00 02 00 02 07 00 03 07 00 BA 00 02 07 00 03 01 5D 07 00 03 4A 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 03 07 00 03 03 03 45 07 00 3B 40 03 48 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 02 03 07 00 48 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 02 03 07 04 3A 4D 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE FF 00 0B 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE FF 00 02 00 02 07 00 03 07 00 BA 00 06 03 07 04 3A 08 00 70 08 00 70 07 01 CE 01 FF 00 1E 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 03 03 07 04 3A 07 01 46 FF 00 00 00 02 07 00 03 07 00 BA 00 02 03 07 04 3A FF 00 0E 00 02 07 00 03 07 00 BA 00 02 03 07 04 05 FF 00 02 00 02 07 00 03 07 00 BA 00 03 03 07 04 05 01 FF 00 1D 00 02 07 00 03 07 00 BA 00 02 03 07 04 05 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 02 03 07 04 05 47 07 00 3B FF 00 00 00 02 07 00 03 07 00 BA 00 02 03 03 4C 03 FF 00 02 00 02 07 00 03 07 00 BA 00 02 03 01 5E 03 FF 00 11 00 03 07 00 03 07 00 BA 03 00 02 07 00 03 03 FF 00 02 00 03 07 00 03 07 00 BA 03 00 03 07 00 03 03 01 FF 00 1E 00 03 07 00 03 07 00 BA 03 00 02 07 00 03 03 FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 03 07 00 03 03 03 45 07 00 3B 40 03 4B 03 FF 00 02 00 03 07 00 03 07 00 BA 03 00 02 03 01 5D 03 FF 00 0C 00 03 07 00 03 07 00 BA 03 00 02 03 07 00 03 FF 00 02 00 03 07 00 03 07 00 BA 03 00 03 03 07 00 03 01 FF 00 1F 00 03 07 00 03 07 00 BA 03 00 02 03 07 00 03 47 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 07 00 48 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 3A 4D 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 05 03 07 04 3A 08 01 DC 08 01 DC 07 01 CE 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 05 03 07 04 3A 08 01 DC 08 01 DC 07 01 CE 42 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 05 03 07 04 3A 08 01 DC 08 01 DC 07 01 CE 45 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 03 03 07 04 3A 07 01 46 FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 3A FF 00 0E 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 05 FF 00 02 00 03 07 00 03 07 00 BA 03 00 03 03 07 04 05 01 FF 00 1F 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 05 42 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 05 47 07 00 3B FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 03 4C 03 FF 00 02 00 03 07 00 03 07 00 BA 03 00 02 03 01 5E 03 FF 00 0F 00 04 07 00 03 07 00 BA 03 03 00 02 07 00 03 07 00 BA FF 00 02 00 04 07 00 03 07 00 BA 03 03 00 03 07 00 03 07 00 BA 01 FF 00 1C 00 04 07 00 03 07 00 BA 03 03 00 02 07 00 03 07 00 BA 49 07 00 18 FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 03 07 00 03 03 03 45 07 00 3B 40 03 FF 00 0C 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 BA 03 03 00 03 03 07 00 03 01 FF 00 1D 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 03 FF 00 10 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 48 FF 00 02 00 04 07 00 03 07 00 BA 03 03 00 03 03 07 00 48 01 FF 00 1F 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 48 42 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 48 45 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 3A FF 00 03 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 3A FF 00 05 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 3A FF 00 02 00 04 07 00 03 07 00 BA 03 03 00 03 03 07 04 3A 01 FF 00 1B 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 3A 49 07 00 2A FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 05 03 07 04 3A 08 03 40 08 03 40 07 01 CE 45 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 05 03 07 04 3A 08 03 40 08 03 40 07 01 CE FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 05 03 07 04 3A 08 03 40 08 03 40 07 01 CE 45 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 03 03 07 04 3A 07 01 46 FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 3A FF 00 0E 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 05 FF 00 02 00 04 07 00 03 07 00 BA 03 03 00 03 03 07 04 05 01 FF 00 1F 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 05 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 05 47 07 00 3B FF 00 00 00 04 07 00 03 07 00 BA 03 03 00 02 03 03 FF 00 0E 00 05 07 00 03 07 00 BA 03 03 03 00 01 07 00 20 FF 00 00 00 05 07 00 03 07 00 BA 03 03 03 00 05 08 03 A0 08 03 A0 03 03 03 45 07 00 3B 40 07 00 8B FF 00 00 00 03 07 00 03 07 00 BA 03 00 02 03 07 04 05 FF 00 01 00 02 07 00 03 07 00 BA 00 01 03 FF 00 01 00 03 07 00 03 07 00 BA 03 00 02 07 00 03 03 FF 00 01 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 48 FF 00 01 00 02 07 00 03 07 00 BA 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 BA 03 03 00 02 07 00 03 07 00 BA FF 00 01 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 04 05 FF 00 01 00 03 07 00 03 07 00 BA 03 00 02 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 BA 00 02 03 07 04 05 FF 00 01 00 03 07 00 03 07 00 BA 03 00 01 03 FF 00 01 00 04 07 00 03 07 00 BA 03 03 00 02 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 BA 00 05 03 07 04 3A 08 00 70 08 00 70 07 01 CE FF 00 01 00 03 07 00 03 07 00 BA 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 BA 00 01 07 00 3B 43 05 44 07 00 3B 47 05 47 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     984    992    Any
        //  984    992    984    992    Ljava/lang/NegativeArraySizeException;
        //  1000   1002   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  83     90     90     91     Any
        //  83     90     90     91     Any
        //  83     90     83     84     Any
        //  84     90     90     91     Any
        //  84     90     90     91     Ljava/lang/ArithmeticException;
        //  100    107    107    108    Any
        //  101    107    107    108    Any
        //  100    107    100    101    Ljava/lang/AssertionError;
        //  100    107    100    101    Any
        //  101    107    3      8      Ljava/lang/NegativeArraySizeException;
        //  122    129    129    130    Any
        //  123    129    122    123    Any
        //  123    129    3      8      Ljava/lang/IllegalStateException;
        //  123    129    3      8      Any
        //  122    129    129    130    Ljava/lang/NumberFormatException;
        //  179    186    186    187    Any
        //  180    186    179    180    Any
        //  179    186    179    180    Ljava/lang/IllegalArgumentException;
        //  179    186    3      8      Ljava/util/NoSuchElementException;
        //  179    186    186    187    Ljava/lang/RuntimeException;
        //  240    248    248    249    Any
        //  240    248    248    249    Ljava/lang/RuntimeException;
        //  240    248    248    249    Any
        //  240    248    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  240    248    248    249    Any
        //  356    362    362    363    Any
        //  356    362    362    363    Ljava/lang/AssertionError;
        //  356    362    362    363    Ljava/lang/UnsupportedOperationException;
        //  356    362    362    363    Any
        //  356    362    3      8      Any
        //  464    471    471    472    Any
        //  465    471    464    465    Any
        //  465    471    471    472    Ljava/lang/NegativeArraySizeException;
        //  464    471    3      8      Any
        //  464    471    3      8      Ljava/lang/IllegalStateException;
        //  486    493    493    494    Any
        //  487    493    486    487    Any
        //  486    493    3      8      Any
        //  486    493    493    494    Any
        //  487    493    3      8      Any
        //  497    504    504    505    Any
        //  497    504    3      8      Any
        //  497    504    497    498    Any
        //  498    504    504    505    Ljava/lang/IllegalStateException;
        //  497    504    504    505    Ljava/lang/EnumConstantNotPresentException;
        //  559    568    568    569    Any
        //  560    568    3      8      Any
        //  560    568    3      8      Any
        //  560    568    559    560    Any
        //  559    568    559    560    Any
        //  674    681    681    682    Any
        //  674    681    681    682    Any
        //  675    681    681    682    Any
        //  674    681    681    682    Ljava/lang/StringIndexOutOfBoundsException;
        //  674    681    674    675    Ljava/lang/StringIndexOutOfBoundsException;
        //  783    790    790    791    Any
        //  783    790    783    784    Any
        //  783    790    783    784    Any
        //  784    790    783    784    Any
        //  783    790    3      8      Ljava/lang/UnsupportedOperationException;
        //  842    849    849    850    Any
        //  843    849    849    850    Any
        //  843    849    842    843    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  842    849    849    850    Ljava/util/NoSuchElementException;
        //  843    849    842    843    Ljava/lang/RuntimeException;
        //  854    860    860    861    Any
        //  854    860    3      8      Any
        //  854    860    3      8      Any
        //  854    860    860    861    Any
        //  854    860    860    861    Ljava/lang/EnumConstantNotPresentException;
        //  916    924    924    925    Any
        //  916    924    3      8      Any
        //  916    924    924    925    Any
        //  916    924    924    925    Any
        //  916    924    924    925    Any
        //  940    947    947    948    Any
        //  940    947    3      8      Any
        //  941    947    947    948    Any
        //  941    947    3      8      Ljava/lang/UnsupportedOperationException;
        //  940    947    940    941    Ljava/lang/IllegalStateException;
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
