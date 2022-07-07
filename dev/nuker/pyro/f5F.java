// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.Map;

public class f5f extends fH
{
    public f0a c;
    public f0a 0;
    public f0d c;
    public Map<Integer, f5e> 0;
    
    static {
        throw t;
    }
    
    @f06
    public void c(final f3c p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2651
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2643
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2635
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             240782573
        //    33: goto            38
        //    36: ldc             -382205961
        //    38: ldc             -1073129220
        //    40: ixor           
        //    41: lookupswitch {
        //          -833399791: 36
        //          691971851: 68
        //          default: 2586
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //    75: goto            79
        //    78: athrow         
        //    79: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //    82: ifeq            2559
        //    85: aload_1        
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //    93: goto            97
        //    96: athrow         
        //    97: aload_0        
        //    98: getfield        dev/nuker/pyro/f5f.c:Lnet/minecraft/client/Minecraft;
        //   101: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   104: goto            108
        //   107: athrow         
        //   108: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   111: goto            115
        //   114: athrow         
        //   115: f2d            
        //   116: aload_0        
        //   117: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0d;
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   127: goto            131
        //   130: athrow         
        //   131: checkcast       Ljava/lang/Double;
        //   134: getstatic       dev/nuker/pyro/fc.1:I
        //   137: ifeq            145
        //   140: ldc             1947913383
        //   142: goto            147
        //   145: ldc             -1601421819
        //   147: ldc             -103825227
        //   149: ixor           
        //   150: lookupswitch {
        //          -1915417582: 145
        //          1497628336: 176
        //          default: 2612
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokevirtual   java/lang/Double.doubleValue:()D
        //   183: goto            187
        //   186: athrow         
        //   187: dcmpg          
        //   188: ifgt            2559
        //   191: aload_0        
        //   192: aload_1        
        //   193: goto            197
        //   196: athrow         
        //   197: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   200: goto            204
        //   203: athrow         
        //   204: goto            208
        //   207: athrow         
        //   208: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   211: goto            215
        //   214: athrow         
        //   215: aload_1        
        //   216: getstatic       dev/nuker/pyro/fc.0:I
        //   219: ifeq            227
        //   222: ldc             -1728430114
        //   224: goto            229
        //   227: ldc             -2136442733
        //   229: ldc             -191077607
        //   231: ixor           
        //   232: lookupswitch {
        //          1818647751: 227
        //          1949571978: 260
        //          default: 2588
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   267: goto            271
        //   270: athrow         
        //   271: goto            275
        //   274: athrow         
        //   275: invokevirtual   net/minecraft/entity/Entity.func_145782_y:()I
        //   278: goto            282
        //   281: athrow         
        //   282: goto            286
        //   285: athrow         
        //   286: invokevirtual   dev/nuker/pyro/f5f.c:(Ljava/lang/String;I)Ldev/nuker/pyro/f5e;
        //   289: goto            293
        //   292: athrow         
        //   293: astore_2       
        //   294: aload_2        
        //   295: dup            
        //   296: getstatic       dev/nuker/pyro/fc.c:I
        //   299: ifge            307
        //   302: ldc             -2036036631
        //   304: goto            309
        //   307: ldc             -1463846247
        //   309: ldc             1888677529
        //   311: ixor           
        //   312: lookupswitch {
        //          -945475002: 307
        //          -164207248: 2600
        //          default: 340
        //        }
        //   340: getfield        dev/nuker/pyro/f5e.0:I
        //   343: iconst_1       
        //   344: iadd           
        //   345: putfield        dev/nuker/pyro/f5e.0:I
        //   348: aload_0        
        //   349: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/fw;
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   359: goto            363
        //   362: athrow         
        //   363: checkcast       Ljava/lang/Boolean;
        //   366: getstatic       dev/nuker/pyro/fc.1:I
        //   369: ifeq            377
        //   372: ldc             -1668730367
        //   374: goto            379
        //   377: ldc             -45609351
        //   379: ldc             840614877
        //   381: ixor           
        //   382: lookupswitch {
        //          -1366036004: 2590
        //          -896780943: 377
        //          default: 408
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   415: goto            419
        //   418: athrow         
        //   419: ifeq            2559
        //   422: aload_1        
        //   423: goto            427
        //   426: athrow         
        //   427: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   430: goto            434
        //   433: athrow         
        //   434: instanceof      Lnet/minecraft/client/entity/EntityPlayerSP;
        //   437: ifne            2559
        //   440: getstatic       dev/nuker/pyro/fc.c:I
        //   443: ifge            451
        //   446: ldc             -1759557578
        //   448: goto            453
        //   451: ldc             765992964
        //   453: ldc             1275157265
        //   455: ixor           
        //   456: lookupswitch {
        //          -1557663407: 451
        //          -618786009: 2618
        //          default: 484
        //        }
        //   484: aload_2        
        //   485: getfield        dev/nuker/pyro/f5e.0:I
        //   488: iconst_1       
        //   489: if_icmpne       1347
        //   492: getstatic       dev/nuker/pyro/fc.1:I
        //   495: ifeq            503
        //   498: ldc             889844720
        //   500: goto            505
        //   503: ldc             -231503123
        //   505: ldc             1869262889
        //   507: ixor           
        //   508: lookupswitch {
        //          -1655096636: 536
        //          1516454873: 503
        //          default: 2604
        //        }
        //   536: aload_0        
        //   537: getstatic       dev/nuker/pyro/fc.1:I
        //   540: ifeq            548
        //   543: ldc             1440909226
        //   545: goto            550
        //   548: ldc             689201079
        //   550: ldc             -655932051
        //   552: ixor           
        //   553: lookupswitch {
        //          -1929002297: 548
        //          -235726118: 580
        //          default: 2570
        //        }
        //   580: getfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //   583: goto            587
        //   586: athrow         
        //   587: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   590: goto            594
        //   593: athrow         
        //   594: checkcast       Ljava/lang/Boolean;
        //   597: goto            601
        //   600: athrow         
        //   601: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   604: goto            608
        //   607: athrow         
        //   608: ifeq            1123
        //   611: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   614: new             Ljava/lang/StringBuilder;
        //   617: dup            
        //   618: goto            622
        //   621: athrow         
        //   622: invokespecial   java/lang/StringBuilder.<init>:()V
        //   625: goto            629
        //   628: athrow         
        //   629: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   632: aload_1        
        //   633: goto            637
        //   636: athrow         
        //   637: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   640: goto            644
        //   643: athrow         
        //   644: getstatic       dev/nuker/pyro/fc.c:I
        //   647: ifge            655
        //   650: ldc             781081472
        //   652: goto            657
        //   655: ldc             68201010
        //   657: ldc             -1176156119
        //   659: ixor           
        //   660: lookupswitch {
        //          -1754590295: 2624
        //          -359889454: 655
        //          default: 688
        //        }
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   695: goto            699
        //   698: athrow         
        //   699: goto            703
        //   702: athrow         
        //   703: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //   706: goto            710
        //   709: athrow         
        //   710: ifeq            719
        //   713: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   716: goto            763
        //   719: getstatic       dev/nuker/pyro/fc.c:I
        //   722: ifge            730
        //   725: ldc             -1496894589
        //   727: goto            732
        //   730: ldc             -2118608918
        //   732: ldc             727044759
        //   734: ixor           
        //   735: lookupswitch {
        //          -1919753964: 730
        //          -1427290755: 760
        //          default: 2594
        //        }
        //   760: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   763: getstatic       dev/nuker/pyro/fc.1:I
        //   766: ifeq            774
        //   769: ldc             -72247202
        //   771: goto            776
        //   774: ldc             1673024389
        //   776: ldc             -2109519138
        //   778: ixor           
        //   779: lookupswitch {
        //          -503637669: 804
        //          2045956736: 774
        //          default: 2576
        //        }
        //   804: goto            808
        //   807: athrow         
        //   808: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   811: goto            815
        //   814: athrow         
        //   815: aload_1        
        //   816: goto            820
        //   819: athrow         
        //   820: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   823: goto            827
        //   826: athrow         
        //   827: getstatic       dev/nuker/pyro/fc.c:I
        //   830: ifge            838
        //   833: ldc             -723041627
        //   835: goto            840
        //   838: ldc             1800725709
        //   840: ldc             727410473
        //   842: ixor           
        //   843: lookupswitch {
        //          -207178498: 838
        //          -4446836: 2560
        //          default: 868
        //        }
        //   868: goto            872
        //   871: athrow         
        //   872: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   875: goto            879
        //   878: athrow         
        //   879: goto            883
        //   882: athrow         
        //   883: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   886: goto            890
        //   889: athrow         
        //   890: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   893: aload_1        
        //   894: getstatic       dev/nuker/pyro/fc.1:I
        //   897: ifeq            905
        //   900: ldc             1547240765
        //   902: goto            907
        //   905: ldc             -2110641469
        //   907: ldc             -115234525
        //   909: ixor           
        //   910: lookupswitch {
        //          -1525109730: 905
        //          2064876512: 936
        //          default: 2584
        //        }
        //   936: goto            940
        //   939: athrow         
        //   940: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //   943: goto            947
        //   946: athrow         
        //   947: goto            951
        //   950: athrow         
        //   951: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   954: goto            958
        //   957: athrow         
        //   958: goto            962
        //   961: athrow         
        //   962: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //   965: goto            969
        //   968: athrow         
        //   969: ifeq            978
        //   972: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   975: goto            981
        //   978: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GREEN:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   981: goto            985
        //   984: athrow         
        //   985: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   988: goto            992
        //   991: athrow         
        //   992: ldc             "\u2393\u149b\u8acb\ub1db\ucfef\uedd1\ub22d\ue6e2\udb7d\uef9c\ua713\u1e43\ue1d1\uc7f6\u874f\u8946\u57a1\u7762\ubf2a\uc669\u2b33\uc228\u6a3e\u2f07\ud1aa\u35bf\u7d26\u898c\u8241"
        //   994: goto            998
        //   997: athrow         
        //   998: invokestatic    invokestatic   !!! ERROR
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: getstatic       dev/nuker/pyro/fc.1:I
        //  1008: ifeq            1016
        //  1011: ldc             1324981060
        //  1013: goto            1018
        //  1016: ldc             1399552393
        //  1018: ldc             1167585075
        //  1020: ixor           
        //  1021: lookupswitch {
        //          191788151: 1016
        //          385652410: 1048
        //          default: 2610
        //        }
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: getstatic       dev/nuker/pyro/fc.c:I
        //  1073: ifge            1081
        //  1076: ldc             1420192256
        //  1078: goto            1083
        //  1081: ldc             1991822194
        //  1083: ldc             427458312
        //  1085: ixor           
        //  1086: lookupswitch {
        //          -686864147: 1081
        //          1306268936: 2580
        //          default: 1112
        //        }
        //  1112: goto            1116
        //  1115: athrow         
        //  1116: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1119: goto            1123
        //  1122: athrow         
        //  1123: getstatic       dev/nuker/pyro/fc.c:I
        //  1126: ifge            1134
        //  1129: ldc             2039435077
        //  1131: goto            1136
        //  1134: ldc             374715625
        //  1136: ldc             1301229540
        //  1138: ixor           
        //  1139: lookupswitch {
        //          -1648434109: 1134
        //          872439969: 2614
        //          default: 1164
        //        }
        //  1164: aload_0        
        //  1165: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //  1168: getstatic       dev/nuker/pyro/fc.c:I
        //  1171: ifge            1179
        //  1174: ldc             -1494061239
        //  1176: goto            1181
        //  1179: ldc             -39871922
        //  1181: ldc             -370809665
        //  1183: ixor           
        //  1184: lookupswitch {
        //          385078653: 1179
        //          1326943222: 2562
        //          default: 1212
        //        }
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: checkcast       Ljava/lang/Boolean;
        //  1226: goto            1230
        //  1229: athrow         
        //  1230: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1233: goto            1237
        //  1236: athrow         
        //  1237: ifeq            2559
        //  1240: getstatic       dev/nuker/pyro/fc.0:I
        //  1243: ifeq            1251
        //  1246: ldc             1189597599
        //  1248: goto            1253
        //  1251: ldc             315438724
        //  1253: ldc             2075431255
        //  1255: ixor           
        //  1256: lookupswitch {
        //          -19514770: 1251
        //          1028866248: 2568
        //          default: 1284
        //        }
        //  1284: goto            1288
        //  1287: athrow         
        //  1288: invokestatic    dev/nuker/pyro/f41.c:()Ldev/nuker/pyro/f41;
        //  1291: goto            1295
        //  1294: athrow         
        //  1295: aload_1        
        //  1296: goto            1300
        //  1299: athrow         
        //  1300: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //  1303: goto            1307
        //  1306: athrow         
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1314: goto            1318
        //  1317: athrow         
        //  1318: ldc             "\u23db\u1492\u8ad9\ub188\ucfab\ueddc\ub221\ue6e3\udb39\uefda\ua71a\u1e5e\ue183\uc7a2\u8753\u894b\u57e4\u7724\ubf25\uc672\u2b32\uc22f\u6a6a\u2f53\ud1b7\u35bb\u7d2e\u89c8"
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: invokestatic    invokestatic   !!! ERROR
        //  1327: goto            1331
        //  1330: athrow         
        //  1331: ldc             -4439307
        //  1333: goto            1337
        //  1336: athrow         
        //  1337: invokevirtual   dev/nuker/pyro/f41.c:(Ljava/lang/String;Ljava/lang/String;I)V
        //  1340: goto            1344
        //  1343: athrow         
        //  1344: goto            2559
        //  1347: aload_0        
        //  1348: getfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //  1351: goto            1355
        //  1354: athrow         
        //  1355: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1358: goto            1362
        //  1361: athrow         
        //  1362: checkcast       Ljava/lang/Boolean;
        //  1365: getstatic       dev/nuker/pyro/fc.1:I
        //  1368: ifeq            1376
        //  1371: ldc             1244979242
        //  1373: goto            1378
        //  1376: ldc             -56524343
        //  1378: ldc_w           -1036791082
        //  1381: ixor           
        //  1382: lookupswitch {
        //          -2012794116: 2606
        //          2131408588: 1376
        //          default: 1408
        //        }
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1415: goto            1419
        //  1418: athrow         
        //  1419: ifeq            1428
        //  1422: ldc_w           -74629536
        //  1425: goto            1431
        //  1428: ldc_w           -74629535
        //  1431: ldc_w           -778137976
        //  1434: ixor           
        //  1435: tableswitch {
        //          1411867088: 1456
        //          1411867089: 2204
        //          default: 1422
        //        }
        //  1456: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1459: new             Ljava/lang/StringBuilder;
        //  1462: dup            
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1470: goto            1474
        //  1473: athrow         
        //  1474: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1477: aload_1        
        //  1478: goto            1482
        //  1481: athrow         
        //  1482: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //  1485: goto            1489
        //  1488: athrow         
        //  1489: goto            1493
        //  1492: athrow         
        //  1493: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1496: goto            1500
        //  1499: athrow         
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: ifeq            1520
        //  1514: ldc_w           690472888
        //  1517: goto            1523
        //  1520: ldc_w           690472889
        //  1523: ldc_w           -759072794
        //  1526: ixor           
        //  1527: tableswitch {
        //          -137535300: 1548
        //          -137535299: 1598
        //          default: 1514
        //        }
        //  1548: getstatic       dev/nuker/pyro/fc.0:I
        //  1551: ifeq            1560
        //  1554: ldc_w           803941329
        //  1557: goto            1563
        //  1560: ldc_w           -361537268
        //  1563: ldc_w           -1049554856
        //  1566: ixor           
        //  1567: lookupswitch {
        //          -291882103: 1560
        //          721580372: 1592
        //          default: 2564
        //        }
        //  1592: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1595: goto            1647
        //  1598: getstatic       dev/nuker/pyro/fc.1:I
        //  1601: ifeq            1610
        //  1604: ldc_w           1199424110
        //  1607: goto            1613
        //  1610: ldc_w           1783718382
        //  1613: ldc_w           1011431147
        //  1616: ixor           
        //  1617: lookupswitch {
        //          1444435717: 1644
        //          2067068037: 1610
        //          default: 2602
        //        }
        //  1644: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1654: goto            1658
        //  1657: athrow         
        //  1658: aload_1        
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //  1666: goto            1670
        //  1669: athrow         
        //  1670: getstatic       dev/nuker/pyro/fc.0:I
        //  1673: ifeq            1682
        //  1676: ldc_w           492627416
        //  1679: goto            1685
        //  1682: ldc_w           1465409740
        //  1685: ldc_w           -1070901811
        //  1688: ixor           
        //  1689: lookupswitch {
        //          -629427093: 1682
        //          -579358699: 2578
        //          default: 1716
        //        }
        //  1716: goto            1720
        //  1719: athrow         
        //  1720: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1723: goto            1727
        //  1726: athrow         
        //  1727: goto            1731
        //  1730: athrow         
        //  1731: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1734: goto            1738
        //  1737: athrow         
        //  1738: getstatic       dev/nuker/pyro/fc.c:I
        //  1741: ifge            1750
        //  1744: ldc_w           -1382914624
        //  1747: goto            1753
        //  1750: ldc_w           1574640904
        //  1753: ldc_w           -1232393552
        //  1756: ixor           
        //  1757: lookupswitch {
        //          -1642744021: 1750
        //          454643568: 2622
        //          default: 1784
        //        }
        //  1784: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1787: aload_1        
        //  1788: getstatic       dev/nuker/pyro/fc.0:I
        //  1791: ifeq            1800
        //  1794: ldc_w           -1237058069
        //  1797: goto            1803
        //  1800: ldc_w           -877514582
        //  1803: ldc_w           1946815429
        //  1806: ixor           
        //  1807: lookupswitch {
        //          -1078445201: 1832
        //          -1035340242: 1800
        //          default: 2616
        //        }
        //  1832: goto            1836
        //  1835: athrow         
        //  1836: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //  1839: goto            1843
        //  1842: athrow         
        //  1843: getstatic       dev/nuker/pyro/fc.c:I
        //  1846: ifge            1855
        //  1849: ldc_w           -336934007
        //  1852: goto            1858
        //  1855: ldc_w           -1822498742
        //  1858: ldc_w           1011007620
        //  1861: ixor           
        //  1862: lookupswitch {
        //          -676852979: 2620
        //          1588391853: 1855
        //          default: 1888
        //        }
        //  1888: goto            1892
        //  1891: athrow         
        //  1892: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1895: goto            1899
        //  1898: athrow         
        //  1899: goto            1903
        //  1902: athrow         
        //  1903: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1906: goto            1910
        //  1909: athrow         
        //  1910: ifeq            1919
        //  1913: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1916: goto            1922
        //  1919: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GREEN:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1922: getstatic       dev/nuker/pyro/fc.c:I
        //  1925: ifge            1934
        //  1928: ldc_w           -2045251488
        //  1931: goto            1937
        //  1934: ldc_w           -2035681149
        //  1937: ldc_w           -922108562
        //  1940: ixor           
        //  1941: lookupswitch {
        //          1327385870: 1934
        //          1335903725: 1968
        //          default: 2572
        //        }
        //  1968: goto            1972
        //  1971: athrow         
        //  1972: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1975: goto            1979
        //  1978: athrow         
        //  1979: ldc_w           "\u2393\u149b\u8acb\ub1db\ucfef\uedd1\ub22d\ue6e2\udb7d\uef9c"
        //  1982: getstatic       dev/nuker/pyro/fc.c:I
        //  1985: ifge            1994
        //  1988: ldc_w           -510547630
        //  1991: goto            1997
        //  1994: ldc_w           -1270602487
        //  1997: ldc_w           -441712634
        //  2000: ixor           
        //  2001: lookupswitch {
        //          -1181995686: 1994
        //          71149908: 2574
        //          default: 2028
        //        }
        //  2028: goto            2032
        //  2031: athrow         
        //  2032: invokestatic    invokestatic   !!! ERROR
        //  2035: goto            2039
        //  2038: athrow         
        //  2039: goto            2043
        //  2042: athrow         
        //  2043: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2046: goto            2050
        //  2049: athrow         
        //  2050: aload_2        
        //  2051: getfield        dev/nuker/pyro/f5e.0:I
        //  2054: getstatic       dev/nuker/pyro/fc.1:I
        //  2057: ifeq            2066
        //  2060: ldc_w           -476643121
        //  2063: goto            2069
        //  2066: ldc_w           1035203668
        //  2069: ldc_w           -444021739
        //  2072: ixor           
        //  2073: lookupswitch {
        //          -667209663: 2100
        //          102745306: 2066
        //          default: 2582
        //        }
        //  2100: goto            2104
        //  2103: athrow         
        //  2104: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2107: goto            2111
        //  2110: athrow         
        //  2111: ldc_w           "\u2393\u1487\u8ac3\ub1c5\ucfaa\uedc6\ub265"
        //  2114: getstatic       dev/nuker/pyro/fc.c:I
        //  2117: ifge            2126
        //  2120: ldc_w           -373822665
        //  2123: goto            2129
        //  2126: ldc_w           339981616
        //  2129: ldc_w           602931139
        //  2132: ixor           
        //  2133: lookupswitch {
        //          -900197132: 2598
        //          657206074: 2126
        //          default: 2160
        //        }
        //  2160: goto            2164
        //  2163: athrow         
        //  2164: invokestatic    invokestatic   !!! ERROR
        //  2167: goto            2171
        //  2170: athrow         
        //  2171: goto            2175
        //  2174: athrow         
        //  2175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2178: goto            2182
        //  2181: athrow         
        //  2182: goto            2186
        //  2185: athrow         
        //  2186: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2189: goto            2193
        //  2192: athrow         
        //  2193: goto            2197
        //  2196: athrow         
        //  2197: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  2200: goto            2204
        //  2203: athrow         
        //  2204: aload_0        
        //  2205: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //  2208: goto            2212
        //  2211: athrow         
        //  2212: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2215: goto            2219
        //  2218: athrow         
        //  2219: checkcast       Ljava/lang/Boolean;
        //  2222: getstatic       dev/nuker/pyro/fc.0:I
        //  2225: ifeq            2234
        //  2228: ldc_w           -808179310
        //  2231: goto            2237
        //  2234: ldc_w           -68830407
        //  2237: ldc_w           -2000793696
        //  2240: ixor           
        //  2241: lookupswitch {
        //          1198155314: 2234
        //          1935406233: 2268
        //          default: 2592
        //        }
        //  2268: goto            2272
        //  2271: athrow         
        //  2272: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2275: goto            2279
        //  2278: athrow         
        //  2279: ifeq            2559
        //  2282: goto            2286
        //  2285: athrow         
        //  2286: invokestatic    dev/nuker/pyro/f41.c:()Ldev/nuker/pyro/f41;
        //  2289: goto            2293
        //  2292: athrow         
        //  2293: aload_1        
        //  2294: goto            2298
        //  2297: athrow         
        //  2298: invokevirtual   dev/nuker/pyro/f3c.c:()Lnet/minecraft/entity/Entity;
        //  2301: goto            2305
        //  2304: athrow         
        //  2305: goto            2309
        //  2308: athrow         
        //  2309: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  2312: goto            2316
        //  2315: athrow         
        //  2316: new             Ljava/lang/StringBuilder;
        //  2319: dup            
        //  2320: goto            2324
        //  2323: athrow         
        //  2324: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2327: goto            2331
        //  2330: athrow         
        //  2331: ldc_w           "\u23db\u1492\u8ad9\ub188\ucfab\ueddc\ub221\ue6e3\udb39"
        //  2334: getstatic       dev/nuker/pyro/fc.1:I
        //  2337: ifeq            2346
        //  2340: ldc_w           -676427936
        //  2343: goto            2349
        //  2346: ldc_w           -1809592904
        //  2349: ldc_w           460976781
        //  2352: ixor           
        //  2353: lookupswitch {
        //          -1889910987: 2380
        //          -858294803: 2346
        //          default: 2566
        //        }
        //  2380: goto            2384
        //  2383: athrow         
        //  2384: invokestatic    invokestatic   !!! ERROR
        //  2387: goto            2391
        //  2390: athrow         
        //  2391: goto            2395
        //  2394: athrow         
        //  2395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2398: goto            2402
        //  2401: athrow         
        //  2402: getstatic       dev/nuker/pyro/fc.1:I
        //  2405: ifeq            2414
        //  2408: ldc_w           -173436785
        //  2411: goto            2417
        //  2414: ldc_w           -300320032
        //  2417: ldc_w           -79002607
        //  2420: ixor           
        //  2421: lookupswitch {
        //          249762974: 2414
        //          357826289: 2448
        //          default: 2608
        //        }
        //  2448: aload_2        
        //  2449: getfield        dev/nuker/pyro/f5e.0:I
        //  2452: goto            2456
        //  2455: athrow         
        //  2456: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2459: goto            2463
        //  2462: athrow         
        //  2463: ldc_w           "\u2393\u1487\u8ac3\ub1c5\ucfaa\uedc6\ub265"
        //  2466: goto            2470
        //  2469: athrow         
        //  2470: invokestatic    invokestatic   !!! ERROR
        //  2473: goto            2477
        //  2476: athrow         
        //  2477: goto            2481
        //  2480: athrow         
        //  2481: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2484: goto            2488
        //  2487: athrow         
        //  2488: goto            2492
        //  2491: athrow         
        //  2492: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2495: goto            2499
        //  2498: athrow         
        //  2499: ldc             -4439307
        //  2501: getstatic       dev/nuker/pyro/fc.1:I
        //  2504: ifeq            2513
        //  2507: ldc_w           -366484644
        //  2510: goto            2516
        //  2513: ldc_w           -578202491
        //  2516: ldc_w           1087902500
        //  2519: ixor           
        //  2520: lookupswitch {
        //          -1655617631: 2548
        //          -1426067336: 2513
        //          default: 2596
        //        }
        //  2548: goto            2552
        //  2551: athrow         
        //  2552: invokevirtual   dev/nuker/pyro/f41.c:(Ljava/lang/String;Ljava/lang/String;I)V
        //  2555: goto            2559
        //  2558: athrow         
        //  2559: return         
        //  2560: aconst_null    
        //  2561: athrow         
        //  2562: aconst_null    
        //  2563: athrow         
        //  2564: aconst_null    
        //  2565: athrow         
        //  2566: aconst_null    
        //  2567: athrow         
        //  2568: aconst_null    
        //  2569: athrow         
        //  2570: aconst_null    
        //  2571: athrow         
        //  2572: aconst_null    
        //  2573: athrow         
        //  2574: aconst_null    
        //  2575: athrow         
        //  2576: aconst_null    
        //  2577: athrow         
        //  2578: aconst_null    
        //  2579: athrow         
        //  2580: aconst_null    
        //  2581: athrow         
        //  2582: aconst_null    
        //  2583: athrow         
        //  2584: aconst_null    
        //  2585: athrow         
        //  2586: aconst_null    
        //  2587: athrow         
        //  2588: aconst_null    
        //  2589: athrow         
        //  2590: aconst_null    
        //  2591: athrow         
        //  2592: aconst_null    
        //  2593: athrow         
        //  2594: aconst_null    
        //  2595: athrow         
        //  2596: aconst_null    
        //  2597: athrow         
        //  2598: aconst_null    
        //  2599: athrow         
        //  2600: aconst_null    
        //  2601: athrow         
        //  2602: aconst_null    
        //  2603: athrow         
        //  2604: aconst_null    
        //  2605: athrow         
        //  2606: aconst_null    
        //  2607: athrow         
        //  2608: aconst_null    
        //  2609: athrow         
        //  2610: aconst_null    
        //  2611: athrow         
        //  2612: aconst_null    
        //  2613: athrow         
        //  2614: aconst_null    
        //  2615: athrow         
        //  2616: aconst_null    
        //  2617: athrow         
        //  2618: aconst_null    
        //  2619: athrow         
        //  2620: aconst_null    
        //  2621: athrow         
        //  2622: aconst_null    
        //  2623: athrow         
        //  2624: aconst_null    
        //  2625: athrow         
        //  2626: pop            
        //  2627: goto            24
        //  2630: pop            
        //  2631: aconst_null    
        //  2632: goto            2626
        //  2635: dup            
        //  2636: ifnull          2626
        //  2639: checkcast       Ljava/lang/Throwable;
        //  2642: athrow         
        //  2643: dup            
        //  2644: ifnull          2630
        //  2647: checkcast       Ljava/lang/Throwable;
        //  2650: athrow         
        //  2651: aconst_null    
        //  2652: athrow         
        //    StackMapTable: 01 BE 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 00 3D 4B 07 00 3D FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 3D 01 5D 07 00 3D 42 07 00 36 40 07 00 3D 45 07 00 36 40 07 00 4D 49 07 00 17 40 07 00 3D 45 07 00 36 40 07 00 4D 49 07 00 1B FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 4D 07 00 8B 45 07 00 36 40 02 47 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 03 07 00 55 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 03 07 01 3B FF 00 0D 00 02 07 00 03 07 00 3D 00 02 03 07 00 5B FF 00 01 00 02 07 00 03 07 00 3D 00 03 03 07 00 5B 01 FF 00 1C 00 02 07 00 03 07 00 3D 00 02 03 07 00 5B 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 03 07 00 5B 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 03 03 FF 00 08 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 03 07 00 3D 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 03 07 00 4D 42 07 00 23 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 03 07 00 4D 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 03 07 01 3D FF 00 0B 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 3D FF 00 01 00 02 07 00 03 07 00 3D 00 04 07 00 03 07 01 3D 07 00 3D 01 FF 00 1E 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 3D 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 3D 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 4D 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 4D 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 01 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 01 45 07 00 36 40 07 00 78 FF 00 0D 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 78 07 00 78 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 78 07 00 78 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 78 07 00 78 4E 07 00 36 40 07 00 7E 45 07 00 36 40 07 01 3B 4D 07 00 82 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 82 01 5C 07 00 82 42 07 00 36 40 07 00 82 45 07 00 36 40 01 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 01 07 00 3D 45 07 00 36 40 07 00 4D 10 41 01 1E 12 41 01 1E 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 03 01 5D 07 00 03 45 07 00 19 40 07 00 98 45 07 00 36 40 07 01 3B 45 07 00 2B 40 07 00 82 45 07 00 36 40 01 4C 07 00 19 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 08 02 66 08 02 66 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 46 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 9B 07 00 A1 07 00 B0 07 00 4D 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1B 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B6 01 FF 00 1B 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 19 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 43 07 00 15 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 4D 01 FF 00 1B 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 42 07 00 13 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 19 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0E 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 9B 07 00 A1 07 00 B0 07 00 3D 01 FF 00 1C 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 42 07 00 2B FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 17 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 44 07 00 19 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 01 3D 01 FF 00 1D 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 0A 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 01 3D 01 FF 00 1C 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D 45 07 00 36 00 0A 41 01 1B 4E 07 00 98 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 98 01 5E 07 00 98 42 07 00 36 40 07 00 98 45 07 00 36 40 07 01 3B 45 07 00 36 40 07 00 82 45 07 00 36 40 01 0D 41 01 1E 42 07 00 19 00 45 07 00 36 40 07 00 F4 43 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 4D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 01 3D FF 00 04 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D 44 07 00 15 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 45 07 00 36 00 02 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 01 07 00 98 45 07 00 36 40 07 01 3B 4D 07 00 82 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 82 01 5D 07 00 82 42 07 00 36 40 07 00 82 45 07 00 36 40 01 02 05 42 01 18 49 07 00 2B FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 08 05 B3 08 05 B3 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 46 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 05 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 18 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1C 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 05 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 43 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 4D 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 19 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0F 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 9B 07 00 A1 07 00 B0 07 00 3D 01 FF 00 1C 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 42 07 00 2D FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 9B 07 00 A1 07 00 B0 07 00 4D 01 FF 00 1D 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B6 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 01 3D 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 1B FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0F 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 01 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 01 3D 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D 45 07 00 36 00 46 07 00 17 40 07 00 98 45 07 00 36 40 07 01 3B 4E 07 00 82 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 82 01 5E 07 00 82 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 01 07 00 82 45 07 00 36 40 01 45 07 00 36 00 45 07 00 36 40 07 00 F4 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 4D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 00 4D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 F4 07 01 3D 46 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 08 09 0C 08 09 0C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 0E 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 F4 07 01 3D 07 00 A1 07 01 3D 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 01 FF 00 1E 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 46 07 00 23 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D FF 00 0D 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 FF 00 02 00 03 07 00 03 07 00 3D 07 00 78 00 05 07 00 F4 07 01 3D 07 01 3D 01 01 FF 00 1F 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 42 07 00 1F FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 45 07 00 36 FA 00 00 FF 00 00 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 41 07 00 98 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 01 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 3D FF 00 01 00 02 07 00 03 07 00 3D 00 03 07 00 03 07 01 3D 07 00 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 01 07 00 82 41 07 00 82 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 78 07 00 78 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 01 41 07 00 82 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 01 00 02 07 00 03 07 00 3D 00 02 03 07 00 5B FC 00 01 07 00 78 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 3D 01 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 03 07 00 03 07 00 3D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 19 43 05 44 07 00 19 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2635   2643   Ljava/lang/NegativeArraySizeException;
        //  2635   2643   2635   2643   Ljava/util/ConcurrentModificationException;
        //  2651   2653   3      8      Ljava/lang/UnsupportedOperationException;
        //  71     78     78     79     Any
        //  71     78     78     79     Any
        //  71     78     78     79     Any
        //  72     78     3      8      Any
        //  72     78     71     72     Any
        //  89     96     96     97     Any
        //  90     96     96     97     Any
        //  89     96     3      8      Any
        //  89     96     89     90     Ljava/lang/IllegalArgumentException;
        //  89     96     3      8      Any
        //  107    114    114    115    Any
        //  107    114    3      8      Ljava/lang/RuntimeException;
        //  107    114    3      8      Any
        //  107    114    3      8      Ljava/lang/NegativeArraySizeException;
        //  107    114    107    108    Ljava/lang/EnumConstantNotPresentException;
        //  123    130    130    131    Any
        //  124    130    3      8      Ljava/lang/IllegalStateException;
        //  123    130    123    124    Any
        //  124    130    3      8      Any
        //  123    130    3      8      Any
        //  179    186    186    187    Any
        //  179    186    186    187    Any
        //  179    186    179    180    Any
        //  179    186    179    180    Any
        //  180    186    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  197    203    203    204    Any
        //  197    203    3      8      Ljava/lang/RuntimeException;
        //  197    203    203    204    Ljava/lang/NumberFormatException;
        //  197    203    203    204    Any
        //  197    203    3      8      Ljava/util/NoSuchElementException;
        //  207    214    214    215    Any
        //  207    214    207    208    Ljava/lang/NullPointerException;
        //  208    214    3      8      Ljava/lang/NegativeArraySizeException;
        //  208    214    214    215    Ljava/lang/UnsupportedOperationException;
        //  208    214    214    215    Any
        //  263    270    270    271    Any
        //  264    270    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  264    270    263    264    Any
        //  264    270    263    264    Any
        //  264    270    270    271    Any
        //  274    281    281    282    Any
        //  274    281    274    275    Ljava/lang/NegativeArraySizeException;
        //  275    281    274    275    Any
        //  275    281    274    275    Any
        //  275    281    281    282    Ljava/lang/StringIndexOutOfBoundsException;
        //  286    292    292    293    Any
        //  286    292    3      8      Ljava/lang/IllegalStateException;
        //  286    292    3      8      Any
        //  286    292    292    293    Ljava/util/NoSuchElementException;
        //  286    292    292    293    Any
        //  355    362    362    363    Any
        //  356    362    362    363    Any
        //  355    362    362    363    Any
        //  355    362    355    356    Any
        //  355    362    3      8      Any
        //  411    418    418    419    Any
        //  412    418    411    412    Any
        //  411    418    3      8      Any
        //  411    418    418    419    Any
        //  412    418    3      8      Any
        //  427    433    433    434    Any
        //  427    433    433    434    Any
        //  427    433    433    434    Any
        //  427    433    3      8      Ljava/lang/RuntimeException;
        //  427    433    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  586    593    593    594    Any
        //  587    593    593    594    Any
        //  586    593    586    587    Ljava/lang/RuntimeException;
        //  587    593    593    594    Any
        //  586    593    3      8      Ljava/lang/AssertionError;
        //  600    607    607    608    Any
        //  600    607    3      8      Any
        //  601    607    600    601    Ljava/lang/ArithmeticException;
        //  601    607    3      8      Ljava/lang/NumberFormatException;
        //  600    607    3      8      Any
        //  621    628    628    629    Any
        //  621    628    628    629    Any
        //  622    628    3      8      Ljava/lang/RuntimeException;
        //  621    628    621    622    Ljava/lang/ClassCastException;
        //  621    628    621    622    Ljava/lang/StringIndexOutOfBoundsException;
        //  636    643    643    644    Any
        //  637    643    636    637    Ljava/lang/RuntimeException;
        //  637    643    636    637    Ljava/lang/NegativeArraySizeException;
        //  637    643    643    644    Ljava/lang/ArithmeticException;
        //  636    643    636    637    Any
        //  692    698    698    699    Any
        //  692    698    698    699    Any
        //  692    698    698    699    Ljava/lang/UnsupportedOperationException;
        //  692    698    3      8      Ljava/lang/NumberFormatException;
        //  692    698    3      8      Ljava/lang/RuntimeException;
        //  703    709    709    710    Any
        //  703    709    709    710    Ljava/util/ConcurrentModificationException;
        //  703    709    3      8      Any
        //  703    709    3      8      Any
        //  703    709    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  807    814    814    815    Any
        //  808    814    3      8      Any
        //  807    814    3      8      Ljava/lang/AssertionError;
        //  807    814    807    808    Ljava/lang/UnsupportedOperationException;
        //  808    814    807    808    Ljava/lang/NegativeArraySizeException;
        //  819    826    826    827    Any
        //  820    826    819    820    Ljava/lang/UnsupportedOperationException;
        //  820    826    3      8      Ljava/lang/IllegalStateException;
        //  819    826    826    827    Any
        //  819    826    3      8      Any
        //  871    878    878    879    Any
        //  871    878    3      8      Any
        //  872    878    878    879    Ljava/lang/StringIndexOutOfBoundsException;
        //  871    878    871    872    Ljava/util/ConcurrentModificationException;
        //  871    878    3      8      Any
        //  882    889    889    890    Any
        //  882    889    882    883    Ljava/lang/StringIndexOutOfBoundsException;
        //  882    889    3      8      Any
        //  883    889    3      8      Ljava/lang/AssertionError;
        //  882    889    882    883    Ljava/lang/NegativeArraySizeException;
        //  940    946    946    947    Any
        //  940    946    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  940    946    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  940    946    946    947    Ljava/util/ConcurrentModificationException;
        //  940    946    3      8      Any
        //  950    957    957    958    Any
        //  951    957    957    958    Ljava/lang/IndexOutOfBoundsException;
        //  951    957    957    958    Ljava/lang/NegativeArraySizeException;
        //  951    957    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  951    957    950    951    Any
        //  961    968    968    969    Any
        //  962    968    968    969    Any
        //  962    968    3      8      Any
        //  962    968    961    962    Ljava/lang/ArithmeticException;
        //  962    968    968    969    Any
        //  984    991    991    992    Any
        //  984    991    991    992    Ljava/lang/NumberFormatException;
        //  984    991    3      8      Ljava/lang/NullPointerException;
        //  984    991    991    992    Ljava/lang/IllegalStateException;
        //  984    991    984    985    Ljava/lang/IllegalArgumentException;
        //  997    1004   1004   1005   Any
        //  997    1004   997    998    Ljava/lang/IllegalArgumentException;
        //  998    1004   3      8      Ljava/util/ConcurrentModificationException;
        //  997    1004   3      8      Any
        //  997    1004   997    998    Ljava/lang/IndexOutOfBoundsException;
        //  1052   1058   1058   1059   Any
        //  1052   1058   1058   1059   Ljava/lang/IllegalStateException;
        //  1052   1058   1058   1059   Ljava/lang/IllegalStateException;
        //  1052   1058   3      8      Ljava/lang/AssertionError;
        //  1052   1058   3      8      Ljava/lang/NumberFormatException;
        //  1062   1069   1069   1070   Any
        //  1062   1069   1062   1063   Any
        //  1063   1069   1062   1063   Ljava/lang/EnumConstantNotPresentException;
        //  1063   1069   1069   1070   Ljava/lang/ClassCastException;
        //  1063   1069   3      8      Any
        //  1115   1122   1122   1123   Any
        //  1116   1122   1115   1116   Ljava/lang/NegativeArraySizeException;
        //  1115   1122   1115   1116   Ljava/lang/AssertionError;
        //  1116   1122   1122   1123   Any
        //  1115   1122   1115   1116   Ljava/util/NoSuchElementException;
        //  1215   1222   1222   1223   Any
        //  1215   1222   1215   1216   Ljava/lang/NumberFormatException;
        //  1216   1222   3      8      Any
        //  1215   1222   1215   1216   Any
        //  1215   1222   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1229   1236   1236   1237   Any
        //  1229   1236   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1229   1236   1229   1230   Ljava/lang/IndexOutOfBoundsException;
        //  1229   1236   1229   1230   Any
        //  1230   1236   1229   1230   Any
        //  1287   1294   1294   1295   Any
        //  1288   1294   1287   1288   Ljava/lang/RuntimeException;
        //  1288   1294   1287   1288   Ljava/lang/ClassCastException;
        //  1287   1294   3      8      Ljava/util/ConcurrentModificationException;
        //  1288   1294   1294   1295   Any
        //  1299   1306   1306   1307   Any
        //  1300   1306   3      8      Any
        //  1299   1306   1299   1300   Any
        //  1300   1306   1299   1300   Ljava/util/NoSuchElementException;
        //  1299   1306   3      8      Any
        //  1311   1317   1317   1318   Any
        //  1311   1317   3      8      Ljava/lang/NullPointerException;
        //  1311   1317   1317   1318   Any
        //  1311   1317   3      8      Ljava/lang/NumberFormatException;
        //  1311   1317   1317   1318   Any
        //  1324   1330   1330   1331   Any
        //  1324   1330   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1324   1330   1330   1331   Any
        //  1324   1330   3      8      Ljava/lang/UnsupportedOperationException;
        //  1324   1330   3      8      Ljava/lang/IllegalStateException;
        //  1336   1343   1343   1344   Any
        //  1336   1343   3      8      Any
        //  1337   1343   3      8      Ljava/lang/ArithmeticException;
        //  1337   1343   1336   1337   Ljava/lang/UnsupportedOperationException;
        //  1336   1343   1343   1344   Any
        //  1355   1361   1361   1362   Any
        //  1355   1361   3      8      Any
        //  1355   1361   3      8      Ljava/lang/IllegalStateException;
        //  1355   1361   3      8      Any
        //  1355   1361   3      8      Ljava/lang/NegativeArraySizeException;
        //  1411   1418   1418   1419   Any
        //  1412   1418   1411   1412   Any
        //  1412   1418   3      8      Ljava/lang/UnsupportedOperationException;
        //  1412   1418   1411   1412   Ljava/lang/UnsupportedOperationException;
        //  1411   1418   1411   1412   Any
        //  1466   1473   1473   1474   Any
        //  1466   1473   3      8      Any
        //  1466   1473   3      8      Ljava/lang/IllegalArgumentException;
        //  1467   1473   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1466   1473   1466   1467   Ljava/lang/ArithmeticException;
        //  1481   1488   1488   1489   Any
        //  1482   1488   3      8      Ljava/lang/NegativeArraySizeException;
        //  1482   1488   3      8      Any
        //  1481   1488   1481   1482   Any
        //  1482   1488   1488   1489   Any
        //  1492   1499   1499   1500   Any
        //  1493   1499   1499   1500   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1492   1499   1492   1493   Any
        //  1492   1499   1492   1493   Ljava/lang/IllegalArgumentException;
        //  1493   1499   1499   1500   Ljava/lang/UnsupportedOperationException;
        //  1503   1510   1510   1511   Any
        //  1504   1510   1503   1504   Any
        //  1504   1510   1510   1511   Ljava/lang/AssertionError;
        //  1504   1510   1510   1511   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1504   1510   1510   1511   Ljava/lang/AssertionError;
        //  1650   1657   1657   1658   Any
        //  1651   1657   3      8      Any
        //  1651   1657   1650   1651   Any
        //  1651   1657   3      8      Any
        //  1650   1657   1650   1651   Any
        //  1662   1669   1669   1670   Any
        //  1662   1669   1669   1670   Any
        //  1662   1669   1662   1663   Any
        //  1663   1669   1662   1663   Ljava/lang/StringIndexOutOfBoundsException;
        //  1663   1669   1662   1663   Any
        //  1719   1726   1726   1727   Any
        //  1720   1726   1719   1720   Any
        //  1719   1726   1719   1720   Ljava/lang/EnumConstantNotPresentException;
        //  1719   1726   1726   1727   Any
        //  1720   1726   1726   1727   Ljava/lang/ClassCastException;
        //  1730   1737   1737   1738   Any
        //  1730   1737   3      8      Any
        //  1730   1737   1730   1731   Ljava/lang/NumberFormatException;
        //  1730   1737   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1730   1737   1730   1731   Ljava/lang/NegativeArraySizeException;
        //  1835   1842   1842   1843   Any
        //  1835   1842   1842   1843   Ljava/lang/IndexOutOfBoundsException;
        //  1836   1842   1835   1836   Ljava/lang/ClassCastException;
        //  1836   1842   1842   1843   Ljava/lang/UnsupportedOperationException;
        //  1836   1842   3      8      Any
        //  1891   1898   1898   1899   Any
        //  1892   1898   1891   1892   Ljava/lang/ArithmeticException;
        //  1892   1898   1891   1892   Ljava/lang/ArithmeticException;
        //  1891   1898   1891   1892   Ljava/lang/AssertionError;
        //  1892   1898   1891   1892   Ljava/lang/IllegalArgumentException;
        //  1902   1909   1909   1910   Any
        //  1902   1909   1902   1903   Ljava/util/NoSuchElementException;
        //  1902   1909   3      8      Any
        //  1903   1909   1902   1903   Any
        //  1903   1909   1902   1903   Any
        //  1971   1978   1978   1979   Any
        //  1972   1978   3      8      Any
        //  1971   1978   1978   1979   Ljava/lang/IllegalStateException;
        //  1971   1978   3      8      Any
        //  1971   1978   1971   1972   Any
        //  2031   2038   2038   2039   Any
        //  2031   2038   2038   2039   Any
        //  2032   2038   2031   2032   Ljava/lang/EnumConstantNotPresentException;
        //  2032   2038   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2032   2038   2038   2039   Any
        //  2042   2049   2049   2050   Any
        //  2042   2049   3      8      Any
        //  2043   2049   2042   2043   Any
        //  2043   2049   3      8      Any
        //  2042   2049   2042   2043   Ljava/lang/ArithmeticException;
        //  2103   2110   2110   2111   Any
        //  2104   2110   2110   2111   Any
        //  2103   2110   2110   2111   Ljava/util/ConcurrentModificationException;
        //  2104   2110   2103   2104   Any
        //  2104   2110   2103   2104   Ljava/lang/NumberFormatException;
        //  2163   2170   2170   2171   Any
        //  2163   2170   3      8      Ljava/lang/NullPointerException;
        //  2163   2170   2170   2171   Ljava/lang/RuntimeException;
        //  2163   2170   2163   2164   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2163   2170   3      8      Any
        //  2174   2181   2181   2182   Any
        //  2175   2181   2181   2182   Any
        //  2175   2181   2174   2175   Any
        //  2174   2181   2174   2175   Any
        //  2174   2181   3      8      Ljava/lang/IllegalArgumentException;
        //  2185   2192   2192   2193   Any
        //  2186   2192   3      8      Ljava/lang/ArithmeticException;
        //  2186   2192   2185   2186   Any
        //  2186   2192   2192   2193   Any
        //  2186   2192   2192   2193   Any
        //  2196   2203   2203   2204   Any
        //  2196   2203   2203   2204   Ljava/lang/IllegalStateException;
        //  2196   2203   2196   2197   Ljava/lang/IndexOutOfBoundsException;
        //  2196   2203   2196   2197   Any
        //  2197   2203   2203   2204   Ljava/lang/IllegalStateException;
        //  2211   2218   2218   2219   Any
        //  2212   2218   2211   2212   Ljava/lang/IllegalArgumentException;
        //  2211   2218   2218   2219   Ljava/lang/NegativeArraySizeException;
        //  2212   2218   2218   2219   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2212   2218   2218   2219   Ljava/lang/EnumConstantNotPresentException;
        //  2272   2278   2278   2279   Any
        //  2272   2278   2278   2279   Any
        //  2272   2278   2278   2279   Ljava/lang/ArithmeticException;
        //  2272   2278   2278   2279   Ljava/lang/NumberFormatException;
        //  2272   2278   3      8      Any
        //  2285   2292   2292   2293   Any
        //  2285   2292   2285   2286   Any
        //  2286   2292   2292   2293   Any
        //  2286   2292   2285   2286   Any
        //  2286   2292   2292   2293   Ljava/lang/RuntimeException;
        //  2298   2304   2304   2305   Any
        //  2298   2304   2304   2305   Any
        //  2298   2304   3      8      Ljava/lang/IllegalStateException;
        //  2298   2304   2304   2305   Any
        //  2298   2304   3      8      Ljava/lang/IllegalArgumentException;
        //  2308   2315   2315   2316   Any
        //  2309   2315   2315   2316   Any
        //  2309   2315   2308   2309   Any
        //  2308   2315   3      8      Any
        //  2309   2315   2315   2316   Any
        //  2323   2330   2330   2331   Any
        //  2323   2330   2330   2331   Ljava/lang/IndexOutOfBoundsException;
        //  2323   2330   2330   2331   Ljava/util/NoSuchElementException;
        //  2323   2330   3      8      Any
        //  2324   2330   2323   2324   Any
        //  2383   2390   2390   2391   Any
        //  2384   2390   3      8      Ljava/lang/NullPointerException;
        //  2383   2390   2383   2384   Any
        //  2384   2390   2383   2384   Ljava/lang/ClassCastException;
        //  2384   2390   3      8      Any
        //  2394   2401   2401   2402   Any
        //  2394   2401   2401   2402   Ljava/lang/AssertionError;
        //  2395   2401   2394   2395   Any
        //  2394   2401   2401   2402   Any
        //  2394   2401   2394   2395   Any
        //  2455   2462   2462   2463   Any
        //  2456   2462   2462   2463   Ljava/lang/EnumConstantNotPresentException;
        //  2456   2462   2462   2463   Ljava/lang/IllegalStateException;
        //  2455   2462   2455   2456   Ljava/lang/NullPointerException;
        //  2455   2462   3      8      Any
        //  2470   2476   2476   2477   Any
        //  2470   2476   3      8      Ljava/lang/NullPointerException;
        //  2470   2476   2476   2477   Any
        //  2470   2476   3      8      Any
        //  2470   2476   3      8      Any
        //  2480   2487   2487   2488   Any
        //  2480   2487   3      8      Ljava/lang/ClassCastException;
        //  2480   2487   3      8      Any
        //  2480   2487   2480   2481   Any
        //  2481   2487   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2491   2498   2498   2499   Any
        //  2492   2498   3      8      Any
        //  2492   2498   2491   2492   Ljava/lang/StringIndexOutOfBoundsException;
        //  2491   2498   2498   2499   Any
        //  2492   2498   3      8      Any
        //  2551   2558   2558   2559   Any
        //  2552   2558   2551   2552   Ljava/lang/NumberFormatException;
        //  2551   2558   2558   2559   Ljava/lang/IllegalStateException;
        //  2551   2558   3      8      Ljava/lang/ClassCastException;
        //  2552   2558   3      8      Any
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
    
    public f5f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u23d0\u149c\u8ac7\ub3db\uc9b1\uedc1\ub22a\ue6e8\ud97c\ue9ca\ua713\u1e45\ue1c6\uc5b5"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u23f0\u149c\u8ac7\ub3db\uc9b1\uedc1\ub20a\ue6e8\ud97c\ue9ca\ua713\u1e45\ue1c6\uc5b5"
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            22
        //    16: ldc_w           -382746557
        //    19: goto            25
        //    22: ldc_w           666601949
        //    25: ldc_w           745094683
        //    28: ixor           
        //    29: lookupswitch {
        //          -985203112: 644
        //          1615743154: 22
        //          default: 56
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: aconst_null    
        //    60: iconst_1       
        //    61: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    64: aload_0        
        //    65: new             Ldev/nuker/pyro/f0a;
        //    68: dup            
        //    69: ldc_w           "\u23dd\u149c\u8ade\ub3d0\uc9b6\ueddc\ub227\ue6e6\ud97c\ue9ca\ua71a\u1e42\ue1d0"
        //    72: invokestatic    invokestatic   !!! ERROR
        //    75: ldc_w           "\u23fd\u149c\u8ade\ub3d0\uc9b6\ueddc\ub227\ue6e6\ud97c\ue9ca\ua71a\u1e42\ue1d0"
        //    78: getstatic       dev/nuker/pyro/fc.0:I
        //    81: ifeq            90
        //    84: ldc_w           -1848744174
        //    87: goto            93
        //    90: ldc_w           194966673
        //    93: ldc_w           -526577899
        //    96: ixor           
        //    97: lookupswitch {
        //          -1449334256: 90
        //          1901291527: 654
        //          default: 124
        //        }
        //   124: invokestatic    invokestatic   !!! ERROR
        //   127: aconst_null    
        //   128: iconst_1       
        //   129: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   132: getstatic       dev/nuker/pyro/fc.0:I
        //   135: ifeq            144
        //   138: ldc_w           -1828359967
        //   141: goto            147
        //   144: ldc_w           415204424
        //   147: ldc_w           -351380991
        //   150: ixor           
        //   151: lookupswitch {
        //          -1034609915: 144
        //          2013997792: 656
        //          default: 176
        //        }
        //   176: putfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //   179: aload_0        
        //   180: new             Ldev/nuker/pyro/f0a;
        //   183: dup            
        //   184: ldc_w           "\u23de\u1496\u8ad9\ub3ca\uc9b1\uedd2\ub221\ue6f4"
        //   187: getstatic       dev/nuker/pyro/fc.c:I
        //   190: ifge            199
        //   193: ldc_w           -2016454659
        //   196: goto            202
        //   199: ldc_w           146954193
        //   202: ldc_w           -1580979816
        //   205: ixor           
        //   206: lookupswitch {
        //          -1459192247: 232
        //          638287461: 199
        //          default: 648
        //        }
        //   232: invokestatic    invokestatic   !!! ERROR
        //   235: ldc_w           "\u23fe\u1496\u8ad9\ub3ca\uc9b1\uedd2\ub221\ue6f4"
        //   238: invokestatic    invokestatic   !!! ERROR
        //   241: aconst_null    
        //   242: iconst_1       
        //   243: getstatic       dev/nuker/pyro/fc.0:I
        //   246: ifeq            255
        //   249: ldc_w           1816198457
        //   252: goto            258
        //   255: ldc_w           -921187919
        //   258: ldc_w           1785340093
        //   261: ixor           
        //   262: lookupswitch {
        //          -1552029428: 288
        //          103472516: 255
        //          default: 660
        //        }
        //   288: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   291: putfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //   294: aload_0        
        //   295: new             Ldev/nuker/pyro/f0d;
        //   298: dup            
        //   299: ldc_w           "\u23d7\u149a\u8ad9\ub3cd\uc9b1\ueddb\ub227\ue6e2"
        //   302: invokestatic    invokestatic   !!! ERROR
        //   305: ldc_w           "\u23f7\u149a\u8ad9\ub3cd\uc9b1\ueddb\ub227\ue6e2"
        //   308: invokestatic    invokestatic   !!! ERROR
        //   311: aconst_null    
        //   312: ldc2_w          25.0
        //   315: dconst_0       
        //   316: ldc2_w          100.0
        //   319: getstatic       dev/nuker/pyro/fc.1:I
        //   322: ifeq            331
        //   325: ldc_w           561216228
        //   328: goto            334
        //   331: ldc_w           -1174730599
        //   334: ldc_w           872191851
        //   337: ixor           
        //   338: lookupswitch {
        //          -1119593685: 331
        //          311422351: 662
        //          default: 364
        //        }
        //   364: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   367: getstatic       dev/nuker/pyro/fc.c:I
        //   370: ifge            379
        //   373: ldc_w           -2036826375
        //   376: goto            382
        //   379: ldc_w           -1400543488
        //   382: ldc_w           841354605
        //   385: ixor           
        //   386: lookupswitch {
        //          -1633457555: 412
        //          -1262586988: 379
        //          default: 658
        //        }
        //   412: putfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0d;
        //   415: aload_0        
        //   416: new             Ljava/util/concurrent/ConcurrentHashMap;
        //   419: dup            
        //   420: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //   423: putfield        dev/nuker/pyro/f5f.0:Ljava/util/Map;
        //   426: invokestatic    dev/nuker/pyro/Pyro.getEventManager:()Ldev/nuker/pyro/f05;
        //   429: aload_0        
        //   430: invokeinterface dev/nuker/pyro/f05.0:(Ljava/lang/Object;)V
        //   435: aload_0        
        //   436: getstatic       dev/nuker/pyro/fc.c:I
        //   439: ifge            448
        //   442: ldc_w           -1414368900
        //   445: goto            451
        //   448: ldc_w           -1749829451
        //   451: ldc_w           810918397
        //   454: ixor           
        //   455: lookupswitch {
        //          -1679306623: 652
        //          -1510598507: 448
        //          default: 480
        //        }
        //   480: aload_0        
        //   481: getstatic       dev/nuker/pyro/fc.c:I
        //   484: ifge            493
        //   487: ldc_w           -2052903080
        //   490: goto            496
        //   493: ldc_w           -892124059
        //   496: ldc_w           1043150937
        //   499: ixor           
        //   500: lookupswitch {
        //          -1148315903: 642
        //          -790960252: 493
        //          default: 528
        //        }
        //   528: getfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //   531: invokevirtual   dev/nuker/pyro/f5f.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   534: pop            
        //   535: aload_0        
        //   536: getstatic       dev/nuker/pyro/fc.0:I
        //   539: ifeq            548
        //   542: ldc_w           -1855318025
        //   545: goto            551
        //   548: ldc_w           -1015053194
        //   551: ldc_w           1809608585
        //   554: ixor           
        //   555: lookupswitch {
        //          -1465652225: 580
        //          -88704898: 548
        //          default: 650
        //        }
        //   580: aload_0        
        //   581: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //   584: invokevirtual   dev/nuker/pyro/f5f.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   587: pop            
        //   588: getstatic       dev/nuker/pyro/fc.1:I
        //   591: ifeq            600
        //   594: ldc_w           1138231343
        //   597: goto            603
        //   600: ldc_w           132540476
        //   603: ldc_w           2124282928
        //   606: ixor           
        //   607: lookupswitch {
        //          1027994655: 600
        //          2038141964: 632
        //          default: 646
        //        }
        //   632: aload_0        
        //   633: aload_0        
        //   634: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0d;
        //   637: invokevirtual   dev/nuker/pyro/f5f.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   640: pop            
        //   641: return         
        //   642: aconst_null    
        //   643: athrow         
        //   644: aconst_null    
        //   645: athrow         
        //   646: aconst_null    
        //   647: athrow         
        //   648: aconst_null    
        //   649: athrow         
        //   650: aconst_null    
        //   651: athrow         
        //   652: aconst_null    
        //   653: athrow         
        //   654: aconst_null    
        //   655: athrow         
        //   656: aconst_null    
        //   657: athrow         
        //   658: aconst_null    
        //   659: athrow         
        //   660: aconst_null    
        //   661: athrow         
        //   662: aconst_null    
        //   663: athrow         
        //    StackMapTable: 00 2C FF 00 16 00 01 06 00 03 06 07 01 3D 07 01 3D FF 00 02 00 01 06 00 04 06 07 01 3D 07 01 3D 01 FF 00 1E 00 01 06 00 03 06 07 01 3D 07 01 3D FF 00 21 00 01 07 00 03 00 05 07 00 03 08 00 41 08 00 41 07 01 3D 07 01 3D FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 41 08 00 41 07 01 3D 07 01 3D 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 00 41 08 00 41 07 01 3D 07 01 3D FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 98 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 98 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 98 FF 00 16 00 01 07 00 03 00 04 07 00 03 08 00 B4 08 00 B4 07 01 3D FF 00 02 00 01 07 00 03 00 05 07 00 03 08 00 B4 08 00 B4 07 01 3D 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 00 B4 08 00 B4 07 01 3D FF 00 16 00 01 07 00 03 00 07 07 00 03 08 00 B4 08 00 B4 07 01 3D 07 01 3D 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 00 B4 08 00 B4 07 01 3D 07 01 3D 05 01 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 00 B4 08 00 B4 07 01 3D 07 01 3D 05 01 FF 00 2A 00 01 07 00 03 00 09 07 00 03 08 01 27 08 01 27 07 01 3D 07 01 3D 05 03 03 03 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 01 27 08 01 27 07 01 3D 07 01 3D 05 03 03 03 01 FF 00 1D 00 01 07 00 03 00 09 07 00 03 08 01 27 08 01 27 07 01 3D 07 01 3D 05 03 03 03 FF 00 0E 00 01 07 00 03 00 02 07 00 03 07 00 55 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 55 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 55 63 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 0C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 03 53 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 13 42 01 1C FF 00 09 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 06 00 03 06 07 01 3D 07 01 3D FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 B4 08 00 B4 07 01 3D 41 07 00 03 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 41 08 00 41 07 01 3D 07 01 3D FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 98 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 55 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 B4 08 00 B4 07 01 3D 07 01 3D 05 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 01 27 08 01 27 07 01 3D 07 01 3D 05 03 03 03
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
    
    @f06
    public void c(final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2573
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            2565
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2557
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -686330967
        //    33: goto            39
        //    36: ldc_w           842148972
        //    39: ldc_w           -381641130
        //    42: ixor           
        //    43: lookupswitch {
        //          1045951999: 2530
        //          1628302997: 36
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    83: if_acmpne       2483
        //    86: aload_1        
        //    87: goto            91
        //    90: athrow         
        //    91: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //    94: goto            98
        //    97: athrow         
        //    98: instanceof      Lnet/minecraft/network/play/server/SPacketEntityStatus;
        //   101: ifeq            2483
        //   104: getstatic       dev/nuker/pyro/fc.1:I
        //   107: ifeq            116
        //   110: ldc_w           1485952547
        //   113: goto            119
        //   116: ldc_w           1592921549
        //   119: ldc_w           1112918534
        //   122: ixor           
        //   123: lookupswitch {
        //          449059877: 2538
        //          1681955451: 116
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: getstatic       dev/nuker/pyro/fc.1:I
        //   152: ifeq            161
        //   155: ldc_w           -524570458
        //   158: goto            164
        //   161: ldc_w           -1851446665
        //   164: ldc_w           -775469931
        //   167: ixor           
        //   168: lookupswitch {
        //          830272563: 161
        //          1080192738: 196
        //          default: 2524
        //        }
        //   196: getfield        dev/nuker/pyro/f5f.c:Lnet/minecraft/client/Minecraft;
        //   199: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   202: ifnull          2483
        //   205: aload_1        
        //   206: goto            210
        //   209: athrow         
        //   210: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   213: goto            217
        //   216: athrow         
        //   217: checkcast       Lnet/minecraft/network/play/server/SPacketEntityStatus;
        //   220: astore_2       
        //   221: getstatic       dev/nuker/pyro/fc.0:I
        //   224: ifeq            233
        //   227: ldc_w           -879578433
        //   230: goto            236
        //   233: ldc_w           38166725
        //   236: ldc_w           53547373
        //   239: ixor           
        //   240: lookupswitch {
        //          -928799790: 233
        //          24605096: 268
        //          default: 2516
        //        }
        //   268: aload_2        
        //   269: goto            273
        //   272: athrow         
        //   273: invokevirtual   net/minecraft/network/play/server/SPacketEntityStatus.func_149160_c:()B
        //   276: goto            280
        //   279: athrow         
        //   280: bipush          35
        //   282: if_icmpne       2483
        //   285: aload_2        
        //   286: aload_0        
        //   287: getfield        dev/nuker/pyro/f5f.c:Lnet/minecraft/client/Minecraft;
        //   290: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   293: getstatic       dev/nuker/pyro/fc.0:I
        //   296: ifeq            305
        //   299: ldc_w           160094725
        //   302: goto            308
        //   305: ldc_w           -1349638235
        //   308: ldc_w           -1786606988
        //   311: ixor           
        //   312: lookupswitch {
        //          -1677176719: 2504
        //          380769675: 305
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   net/minecraft/network/play/server/SPacketEntityStatus.func_149161_a:(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
        //   347: goto            351
        //   350: athrow         
        //   351: ifnull          2483
        //   354: aload_2        
        //   355: aload_0        
        //   356: getfield        dev/nuker/pyro/f5f.c:Lnet/minecraft/client/Minecraft;
        //   359: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   362: getstatic       dev/nuker/pyro/fc.c:I
        //   365: ifge            374
        //   368: ldc_w           564134753
        //   371: goto            377
        //   374: ldc_w           -304853235
        //   377: ldc_w           3575725
        //   380: ixor           
        //   381: lookupswitch {
        //          -303906656: 408
        //          563514572: 374
        //          default: 2518
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   net/minecraft/network/play/server/SPacketEntityStatus.func_149161_a:(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
        //   415: goto            419
        //   418: athrow         
        //   419: astore_3       
        //   420: aload_3        
        //   421: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   424: ifeq            2483
        //   427: getstatic       dev/nuker/pyro/fc.0:I
        //   430: ifeq            439
        //   433: ldc_w           1375680617
        //   436: goto            442
        //   439: ldc_w           -474083669
        //   442: ldc_w           -91552651
        //   445: ixor           
        //   446: lookupswitch {
        //          -1418445796: 439
        //          422906590: 472
        //          default: 2536
        //        }
        //   472: aload_3        
        //   473: aload_0        
        //   474: getstatic       dev/nuker/pyro/fc.c:I
        //   477: ifge            486
        //   480: ldc_w           -950506412
        //   483: goto            489
        //   486: ldc_w           -1032413188
        //   489: ldc_w           -1589773137
        //   492: ixor           
        //   493: lookupswitch {
        //          416709722: 486
        //          1717932283: 2496
        //          default: 520
        //        }
        //   520: getfield        dev/nuker/pyro/f5f.c:Lnet/minecraft/client/Minecraft;
        //   523: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   526: goto            530
        //   529: athrow         
        //   530: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   533: goto            537
        //   536: athrow         
        //   537: f2d            
        //   538: aload_0        
        //   539: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0d;
        //   542: getstatic       dev/nuker/pyro/fc.c:I
        //   545: ifge            554
        //   548: ldc_w           -1707909725
        //   551: goto            557
        //   554: ldc_w           603227486
        //   557: ldc_w           -1867041302
        //   560: ixor           
        //   561: lookupswitch {
        //          -1287409484: 588
        //          176449609: 554
        //          default: 2508
        //        }
        //   588: goto            592
        //   591: athrow         
        //   592: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   595: goto            599
        //   598: athrow         
        //   599: checkcast       Ljava/lang/Double;
        //   602: goto            606
        //   605: athrow         
        //   606: invokevirtual   java/lang/Double.doubleValue:()D
        //   609: goto            613
        //   612: athrow         
        //   613: dcmpg          
        //   614: ifgt            2483
        //   617: aload_0        
        //   618: aload_3        
        //   619: getstatic       dev/nuker/pyro/fc.1:I
        //   622: ifeq            631
        //   625: ldc_w           -1133759620
        //   628: goto            634
        //   631: ldc_w           -1766898000
        //   634: ldc_w           590135961
        //   637: ixor           
        //   638: lookupswitch {
        //          -1623133723: 631
        //          -1249672151: 664
        //          default: 2510
        //        }
        //   664: goto            668
        //   667: athrow         
        //   668: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   671: goto            675
        //   674: athrow         
        //   675: aload_3        
        //   676: goto            680
        //   679: athrow         
        //   680: invokevirtual   net/minecraft/entity/Entity.func_145782_y:()I
        //   683: goto            687
        //   686: athrow         
        //   687: goto            691
        //   690: athrow         
        //   691: invokevirtual   dev/nuker/pyro/f5f.c:(Ljava/lang/String;I)Ldev/nuker/pyro/f5e;
        //   694: goto            698
        //   697: athrow         
        //   698: astore          4
        //   700: getstatic       dev/nuker/pyro/fc.c:I
        //   703: ifge            712
        //   706: ldc_w           -932434134
        //   709: goto            715
        //   712: ldc_w           -153354994
        //   715: ldc_w           -1417800513
        //   718: ixor           
        //   719: lookupswitch {
        //          380317188: 712
        //          1662139285: 2526
        //          default: 744
        //        }
        //   744: aload           4
        //   746: dup            
        //   747: getfield        dev/nuker/pyro/f5e.c:I
        //   750: iconst_1       
        //   751: iadd           
        //   752: putfield        dev/nuker/pyro/f5e.c:I
        //   755: aload_0        
        //   756: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/fw;
        //   759: goto            763
        //   762: athrow         
        //   763: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   766: goto            770
        //   769: athrow         
        //   770: checkcast       Ljava/lang/Boolean;
        //   773: getstatic       dev/nuker/pyro/fc.0:I
        //   776: ifeq            785
        //   779: ldc_w           1100720870
        //   782: goto            788
        //   785: ldc_w           561870995
        //   788: ldc_w           -1870791004
        //   791: ixor           
        //   792: lookupswitch {
        //          -773434302: 2484
        //          1138270650: 785
        //          default: 820
        //        }
        //   820: goto            824
        //   823: athrow         
        //   824: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   827: goto            831
        //   830: athrow         
        //   831: ifeq            2483
        //   834: aload_3        
        //   835: instanceof      Lnet/minecraft/client/entity/EntityPlayerSP;
        //   838: ifne            2483
        //   841: aload           4
        //   843: getfield        dev/nuker/pyro/f5e.c:I
        //   846: iconst_1       
        //   847: if_icmpne       1654
        //   850: aload_0        
        //   851: getfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //   854: goto            858
        //   857: athrow         
        //   858: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   861: goto            865
        //   864: athrow         
        //   865: checkcast       Ljava/lang/Boolean;
        //   868: getstatic       dev/nuker/pyro/fc.1:I
        //   871: ifeq            880
        //   874: ldc_w           72852500
        //   877: goto            883
        //   880: ldc_w           -1770033795
        //   883: ldc_w           325450381
        //   886: ixor           
        //   887: lookupswitch {
        //          389176985: 2544
        //          698056480: 880
        //          default: 912
        //        }
        //   912: goto            916
        //   915: athrow         
        //   916: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   919: goto            923
        //   922: athrow         
        //   923: ifeq            1477
        //   926: getstatic       dev/nuker/pyro/fc.0:I
        //   929: ifeq            938
        //   932: ldc_w           1164668240
        //   935: goto            941
        //   938: ldc_w           -1723846578
        //   941: ldc_w           -289979856
        //   944: ixor           
        //   945: lookupswitch {
        //          -1411633312: 938
        //          2012705406: 972
        //          default: 2502
        //        }
        //   972: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   975: new             Ljava/lang/StringBuilder;
        //   978: dup            
        //   979: goto            983
        //   982: athrow         
        //   983: invokespecial   java/lang/StringBuilder.<init>:()V
        //   986: goto            990
        //   989: athrow         
        //   990: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   993: aload_3        
        //   994: goto            998
        //   997: athrow         
        //   998: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1012: goto            1016
        //  1015: athrow         
        //  1016: ifeq            1025
        //  1019: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1022: goto            1028
        //  1025: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1028: getstatic       dev/nuker/pyro/fc.c:I
        //  1031: ifge            1040
        //  1034: ldc_w           1533149853
        //  1037: goto            1043
        //  1040: ldc_w           -75767938
        //  1043: ldc_w           -1484175980
        //  1046: ixor           
        //  1047: lookupswitch {
        //          -51689719: 1040
        //          1559403242: 1072
        //          default: 2540
        //        }
        //  1072: goto            1076
        //  1075: athrow         
        //  1076: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1079: goto            1083
        //  1082: athrow         
        //  1083: getstatic       dev/nuker/pyro/fc.0:I
        //  1086: ifeq            1095
        //  1089: ldc_w           536057554
        //  1092: goto            1098
        //  1095: ldc_w           -1448356880
        //  1098: ldc_w           -1361711875
        //  1101: ixor           
        //  1102: lookupswitch {
        //          -1322878417: 2498
        //          -308585219: 1095
        //          default: 1128
        //        }
        //  1128: aload_3        
        //  1129: getstatic       dev/nuker/pyro/fc.1:I
        //  1132: ifeq            1141
        //  1135: ldc_w           1134757542
        //  1138: goto            1144
        //  1141: ldc_w           -999036950
        //  1144: ldc_w           1000213865
        //  1147: ixor           
        //  1148: lookupswitch {
        //          -1185149: 1176
        //          2017266639: 1141
        //          default: 2488
        //        }
        //  1176: goto            1180
        //  1179: athrow         
        //  1180: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1183: goto            1187
        //  1186: athrow         
        //  1187: goto            1191
        //  1190: athrow         
        //  1191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1194: goto            1198
        //  1197: athrow         
        //  1198: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1201: getstatic       dev/nuker/pyro/fc.0:I
        //  1204: ifeq            1213
        //  1207: ldc_w           -615057673
        //  1210: goto            1216
        //  1213: ldc_w           -1497351895
        //  1216: ldc_w           668064974
        //  1219: ixor           
        //  1220: lookupswitch {
        //          -2129533465: 1248
        //          -58250695: 1213
        //          default: 2532
        //        }
        //  1248: aload_3        
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1256: goto            1260
        //  1259: athrow         
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: ifeq            1280
        //  1274: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1277: goto            1327
        //  1280: getstatic       dev/nuker/pyro/fc.0:I
        //  1283: ifeq            1292
        //  1286: ldc_w           -1961532487
        //  1289: goto            1295
        //  1292: ldc_w           -923993540
        //  1295: ldc_w           1249952274
        //  1298: ixor           
        //  1299: lookupswitch {
        //          -1270799967: 1292
        //          -1047158357: 2546
        //          default: 1324
        //        }
        //  1324: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GREEN:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1327: getstatic       dev/nuker/pyro/fc.c:I
        //  1330: ifge            1339
        //  1333: ldc_w           263872802
        //  1336: goto            1342
        //  1339: ldc_w           -1499709488
        //  1342: ldc_w           -1406062787
        //  1345: ixor           
        //  1346: lookupswitch {
        //          -1551151585: 2500
        //          1709540691: 1339
        //          default: 1372
        //        }
        //  1372: goto            1376
        //  1375: athrow         
        //  1376: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1379: goto            1383
        //  1382: athrow         
        //  1383: ldc_w           "\u2393\u149b\u8acb\ub1db\ucfef\uedc5\ub22b\ue6f7\udb69\uefd9\ua711\u1e0c\ue1c2\uc7f6\u874f\u8941\u57b0\u7727\ubf21\uc621"
        //  1386: goto            1390
        //  1389: athrow         
        //  1390: invokestatic    invokestatic   !!! ERROR
        //  1393: goto            1397
        //  1396: athrow         
        //  1397: getstatic       dev/nuker/pyro/fc.0:I
        //  1400: ifeq            1409
        //  1403: ldc_w           1096184928
        //  1406: goto            1412
        //  1409: ldc_w           1854359089
        //  1412: ldc_w           -171811081
        //  1415: ixor           
        //  1416: lookupswitch {
        //          -1689970490: 1444
        //          -1265358185: 1409
        //          default: 2512
        //        }
        //  1444: goto            1448
        //  1447: athrow         
        //  1448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1451: goto            1455
        //  1454: athrow         
        //  1455: goto            1459
        //  1458: athrow         
        //  1459: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1462: goto            1466
        //  1465: athrow         
        //  1466: goto            1470
        //  1469: athrow         
        //  1470: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1473: goto            1477
        //  1476: athrow         
        //  1477: getstatic       dev/nuker/pyro/fc.c:I
        //  1480: ifge            1489
        //  1483: ldc_w           -1833663248
        //  1486: goto            1492
        //  1489: ldc_w           517670791
        //  1492: ldc_w           1732948280
        //  1495: ixor           
        //  1496: lookupswitch {
        //          -167889464: 1489
        //          2039592639: 1524
        //          default: 2490
        //        }
        //  1524: aload_0        
        //  1525: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //  1528: goto            1532
        //  1531: athrow         
        //  1532: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1535: goto            1539
        //  1538: athrow         
        //  1539: checkcast       Ljava/lang/Boolean;
        //  1542: goto            1546
        //  1545: athrow         
        //  1546: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1549: goto            1553
        //  1552: athrow         
        //  1553: ifeq            2483
        //  1556: goto            1560
        //  1559: athrow         
        //  1560: invokestatic    dev/nuker/pyro/f41.c:()Ldev/nuker/pyro/f41;
        //  1563: goto            1567
        //  1566: athrow         
        //  1567: aload_3        
        //  1568: getstatic       dev/nuker/pyro/fc.c:I
        //  1571: ifge            1580
        //  1574: ldc_w           -401367471
        //  1577: goto            1583
        //  1580: ldc_w           -2026843530
        //  1583: ldc_w           -187557783
        //  1586: ixor           
        //  1587: lookupswitch {
        //          482444856: 1580
        //          1944242719: 1612
        //          default: 2494
        //        }
        //  1612: goto            1616
        //  1615: athrow         
        //  1616: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1619: goto            1623
        //  1622: athrow         
        //  1623: ldc_w           "\u23db\u1492\u8ad9\ub188\ucfbf\uedda\ub234\ue6f7\udb7c\uefd8\ua755\u1e4d\ue183\uc7a2\u8754\u895a\u57a1\u772f\ubf6d"
        //  1626: goto            1630
        //  1629: athrow         
        //  1630: invokestatic    invokestatic   !!! ERROR
        //  1633: goto            1637
        //  1636: athrow         
        //  1637: ldc_w           -1334220
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: invokevirtual   dev/nuker/pyro/f41.c:(Ljava/lang/String;Ljava/lang/String;I)V
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: goto            2483
        //  1654: aload_0        
        //  1655: getstatic       dev/nuker/pyro/fc.1:I
        //  1658: ifeq            1667
        //  1661: ldc_w           -2101928555
        //  1664: goto            1670
        //  1667: ldc_w           -1272795701
        //  1670: ldc_w           1117081960
        //  1673: ixor           
        //  1674: lookupswitch {
        //          -1071493891: 2534
        //          -1027614690: 1667
        //          default: 1700
        //        }
        //  1700: getfield        dev/nuker/pyro/f5f.0:Ldev/nuker/pyro/f0a;
        //  1703: goto            1707
        //  1706: athrow         
        //  1707: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1710: goto            1714
        //  1713: athrow         
        //  1714: checkcast       Ljava/lang/Boolean;
        //  1717: goto            1721
        //  1720: athrow         
        //  1721: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1724: goto            1728
        //  1727: athrow         
        //  1728: ifeq            2139
        //  1731: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1734: new             Ljava/lang/StringBuilder;
        //  1737: dup            
        //  1738: getstatic       dev/nuker/pyro/fc.c:I
        //  1741: ifge            1750
        //  1744: ldc_w           1068693266
        //  1747: goto            1753
        //  1750: ldc_w           608126521
        //  1753: ldc_w           -1400169137
        //  1756: ixor           
        //  1757: lookupswitch {
        //          -2001446026: 1784
        //          -1824920995: 1750
        //          default: 2506
        //        }
        //  1784: goto            1788
        //  1787: athrow         
        //  1788: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1791: goto            1795
        //  1794: athrow         
        //  1795: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1798: getstatic       dev/nuker/pyro/fc.0:I
        //  1801: ifeq            1810
        //  1804: ldc_w           -768639358
        //  1807: goto            1813
        //  1810: ldc_w           -2050089446
        //  1813: ldc_w           1218036782
        //  1816: ixor           
        //  1817: lookupswitch {
        //          -1699300692: 2528
        //          -153473779: 1810
        //          default: 1844
        //        }
        //  1844: aload_3        
        //  1845: goto            1849
        //  1848: athrow         
        //  1849: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1852: goto            1856
        //  1855: athrow         
        //  1856: goto            1860
        //  1859: athrow         
        //  1860: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1863: goto            1867
        //  1866: athrow         
        //  1867: ifeq            1876
        //  1870: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1873: goto            1879
        //  1876: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1879: goto            1883
        //  1882: athrow         
        //  1883: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1886: goto            1890
        //  1889: athrow         
        //  1890: aload_3        
        //  1891: goto            1895
        //  1894: athrow         
        //  1895: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1898: goto            1902
        //  1901: athrow         
        //  1902: goto            1906
        //  1905: athrow         
        //  1906: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1909: goto            1913
        //  1912: athrow         
        //  1913: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1916: aload_3        
        //  1917: goto            1921
        //  1920: athrow         
        //  1921: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  1924: goto            1928
        //  1927: athrow         
        //  1928: goto            1932
        //  1931: athrow         
        //  1932: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //  1935: goto            1939
        //  1938: athrow         
        //  1939: ifeq            1948
        //  1942: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1945: goto            1951
        //  1948: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GREEN:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1951: getstatic       dev/nuker/pyro/fc.0:I
        //  1954: ifeq            1963
        //  1957: ldc_w           -552289365
        //  1960: goto            1966
        //  1963: ldc_w           -1972136792
        //  1966: ldc_w           73807008
        //  1969: ixor           
        //  1970: lookupswitch {
        //          -1144509967: 1963
        //          -613249269: 2542
        //          default: 1996
        //        }
        //  1996: goto            2000
        //  1999: athrow         
        //  2000: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2003: goto            2007
        //  2006: athrow         
        //  2007: ldc_w           "\u2393\u149b\u8acb\ub1db\ucfef\uedc5\ub22b\ue6f7\udb69\uefd9\ua711\u1e0c"
        //  2010: goto            2014
        //  2013: athrow         
        //  2014: invokestatic    invokestatic   !!! ERROR
        //  2017: goto            2021
        //  2020: athrow         
        //  2021: goto            2025
        //  2024: athrow         
        //  2025: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2028: goto            2032
        //  2031: athrow         
        //  2032: aload           4
        //  2034: getfield        dev/nuker/pyro/f5e.c:I
        //  2037: goto            2041
        //  2040: athrow         
        //  2041: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2044: goto            2048
        //  2047: athrow         
        //  2048: ldc_w           "\u2393\u1487\u8ac5\ub1dc\ucfaa\uedd8\ub237\ue6a6"
        //  2051: goto            2055
        //  2054: athrow         
        //  2055: invokestatic    invokestatic   !!! ERROR
        //  2058: goto            2062
        //  2061: athrow         
        //  2062: goto            2066
        //  2065: athrow         
        //  2066: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2069: goto            2073
        //  2072: athrow         
        //  2073: goto            2077
        //  2076: athrow         
        //  2077: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2080: goto            2084
        //  2083: athrow         
        //  2084: getstatic       dev/nuker/pyro/fc.c:I
        //  2087: ifge            2096
        //  2090: ldc_w           1144166860
        //  2093: goto            2099
        //  2096: ldc_w           -1579639297
        //  2099: ldc_w           2005418656
        //  2102: ixor           
        //  2103: lookupswitch {
        //          867883884: 2492
        //          1720038745: 2096
        //          default: 2128
        //        }
        //  2128: goto            2132
        //  2131: athrow         
        //  2132: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  2135: goto            2139
        //  2138: athrow         
        //  2139: aload_0        
        //  2140: getfield        dev/nuker/pyro/f5f.c:Ldev/nuker/pyro/f0a;
        //  2143: getstatic       dev/nuker/pyro/fc.1:I
        //  2146: ifeq            2155
        //  2149: ldc_w           718301036
        //  2152: goto            2158
        //  2155: ldc_w           2127396881
        //  2158: ldc_w           1404187104
        //  2161: ixor           
        //  2162: lookupswitch {
        //          -985361101: 2155
        //          2036487820: 2514
        //          default: 2188
        //        }
        //  2188: goto            2192
        //  2191: athrow         
        //  2192: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2195: goto            2199
        //  2198: athrow         
        //  2199: checkcast       Ljava/lang/Boolean;
        //  2202: goto            2206
        //  2205: athrow         
        //  2206: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2209: goto            2213
        //  2212: athrow         
        //  2213: ifeq            2483
        //  2216: goto            2220
        //  2219: athrow         
        //  2220: invokestatic    dev/nuker/pyro/f41.c:()Ldev/nuker/pyro/f41;
        //  2223: goto            2227
        //  2226: athrow         
        //  2227: getstatic       dev/nuker/pyro/fc.0:I
        //  2230: ifeq            2239
        //  2233: ldc_w           365419972
        //  2236: goto            2242
        //  2239: ldc_w           -756843544
        //  2242: ldc_w           1284688217
        //  2245: ixor           
        //  2246: lookupswitch {
        //          -1636715855: 2272
        //          1498748061: 2239
        //          default: 2522
        //        }
        //  2272: aload_3        
        //  2273: goto            2277
        //  2276: athrow         
        //  2277: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //  2280: goto            2284
        //  2283: athrow         
        //  2284: new             Ljava/lang/StringBuilder;
        //  2287: dup            
        //  2288: goto            2292
        //  2291: athrow         
        //  2292: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2295: goto            2299
        //  2298: athrow         
        //  2299: ldc_w           "\u23db\u1492\u8ad9\ub188\ucfbf\uedda\ub234\ue6f7\udb7c\uefd8\ua755"
        //  2302: goto            2306
        //  2305: athrow         
        //  2306: invokestatic    invokestatic   !!! ERROR
        //  2309: goto            2313
        //  2312: athrow         
        //  2313: getstatic       dev/nuker/pyro/fc.c:I
        //  2316: ifge            2325
        //  2319: ldc_w           -2109234487
        //  2322: goto            2328
        //  2325: ldc_w           1993420413
        //  2328: ldc_w           1398046978
        //  2331: ixor           
        //  2332: lookupswitch {
        //          -787274805: 2486
        //          -592339501: 2325
        //          default: 2360
        //        }
        //  2360: goto            2364
        //  2363: athrow         
        //  2364: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2367: goto            2371
        //  2370: athrow         
        //  2371: aload           4
        //  2373: getfield        dev/nuker/pyro/f5e.c:I
        //  2376: goto            2380
        //  2379: athrow         
        //  2380: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  2383: goto            2387
        //  2386: athrow         
        //  2387: ldc_w           "\u2393\u1487\u8ac5\ub1dc\ucfaa\uedd8\ub237\ue6a6"
        //  2390: goto            2394
        //  2393: athrow         
        //  2394: invokestatic    invokestatic   !!! ERROR
        //  2397: goto            2401
        //  2400: athrow         
        //  2401: goto            2405
        //  2404: athrow         
        //  2405: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2408: goto            2412
        //  2411: athrow         
        //  2412: goto            2416
        //  2415: athrow         
        //  2416: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2419: goto            2423
        //  2422: athrow         
        //  2423: ldc_w           -1334220
        //  2426: getstatic       dev/nuker/pyro/fc.1:I
        //  2429: ifeq            2438
        //  2432: ldc_w           -2125831355
        //  2435: goto            2441
        //  2438: ldc_w           553792997
        //  2441: ldc_w           -193430777
        //  2444: ixor           
        //  2445: lookupswitch {
        //          -713404702: 2472
        //          1966217282: 2438
        //          default: 2520
        //        }
        //  2472: goto            2476
        //  2475: athrow         
        //  2476: invokevirtual   dev/nuker/pyro/f41.c:(Ljava/lang/String;Ljava/lang/String;I)V
        //  2479: goto            2483
        //  2482: athrow         
        //  2483: return         
        //  2484: aconst_null    
        //  2485: athrow         
        //  2486: aconst_null    
        //  2487: athrow         
        //  2488: aconst_null    
        //  2489: athrow         
        //  2490: aconst_null    
        //  2491: athrow         
        //  2492: aconst_null    
        //  2493: athrow         
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
        //  2548: pop            
        //  2549: goto            24
        //  2552: pop            
        //  2553: aconst_null    
        //  2554: goto            2548
        //  2557: dup            
        //  2558: ifnull          2548
        //  2561: checkcast       Ljava/lang/Throwable;
        //  2564: athrow         
        //  2565: dup            
        //  2566: ifnull          2552
        //  2569: checkcast       Ljava/lang/Throwable;
        //  2572: athrow         
        //  2573: aconst_null    
        //  2574: athrow         
        //    StackMapTable: 01 96 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 01 90 0B 42 01 1C FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 90 00 01 07 01 90 45 07 00 36 40 07 01 95 49 07 00 36 40 07 01 90 45 07 00 36 40 07 02 14 11 42 01 1C 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 90 00 02 07 00 03 01 5F 07 00 03 4C 07 00 36 40 07 01 90 45 07 00 36 40 07 02 14 FC 00 0F 07 01 9D 42 01 1F 43 07 00 1B 40 07 01 9D 45 07 00 36 40 01 FF 00 18 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 FF 00 02 00 03 07 00 03 07 01 90 07 01 9D 00 03 07 01 9D 07 02 16 01 FF 00 1F 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 42 07 00 21 FF 00 00 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 45 07 00 36 40 07 00 4D FF 00 16 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 FF 00 02 00 03 07 00 03 07 01 90 07 01 9D 00 03 07 01 9D 07 02 16 01 FF 00 1E 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 42 07 00 36 FF 00 00 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 45 07 00 36 40 07 00 4D FC 00 13 07 00 4D 42 01 1D FF 00 0D 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 4D 07 00 03 FF 00 02 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 07 00 4D 07 00 03 01 FF 00 1E 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 4D 07 00 03 48 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 4D 07 00 8B 45 07 00 36 40 02 FF 00 10 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 00 55 FF 00 02 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 03 07 00 55 01 FF 00 1E 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 00 55 42 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 00 55 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 01 3B FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 00 5B 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 03 FF 00 11 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 03 07 00 4D FF 00 02 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 07 00 03 07 00 4D 01 FF 00 1D 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 03 07 00 4D 42 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 03 07 00 4D 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 03 07 01 3D 43 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 07 00 03 07 01 3D 07 00 4D 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 07 00 03 07 01 3D 01 42 07 00 36 FF 00 00 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 03 07 00 03 07 01 3D 01 45 07 00 36 40 07 00 78 FC 00 0D 07 00 78 42 01 1C FF 00 11 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 01 07 00 7E 45 07 00 36 40 07 01 3B 4E 07 00 82 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 82 01 5F 07 00 82 42 07 00 36 40 07 00 82 45 07 00 36 40 01 FF 00 19 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 01 07 00 98 45 07 00 36 40 07 01 3B 4E 07 00 82 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 82 01 5C 07 00 82 42 07 00 25 40 07 00 82 45 07 00 36 40 01 0E 42 01 1E FF 00 09 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 08 03 CF 08 03 CF 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 46 07 00 15 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B6 01 FF 00 1C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1D 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 4D 01 FF 00 1F 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 42 07 00 2B FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 01 FF 00 1F 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 43 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 1C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B6 01 FF 00 1D 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 15 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 01 3D 01 FF 00 1F 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D 45 07 00 36 00 0B 42 01 1F FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 01 07 00 98 45 07 00 36 40 07 01 3B 45 07 00 36 40 07 00 82 45 07 00 36 40 01 45 07 00 36 00 45 07 00 36 40 07 00 F4 FF 00 0C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 00 4D FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 00 4D 01 FF 00 1C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 00 4D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 01 3D 45 07 00 19 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D 45 07 00 19 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 45 07 00 36 00 02 4C 07 00 03 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 01 07 00 98 45 07 00 36 40 07 01 3B 45 07 00 36 40 07 00 82 45 07 00 36 40 01 FF 00 15 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 08 06 C6 08 06 C6 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 08 06 C6 08 06 C6 01 FF 00 1E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 08 06 C6 08 06 C6 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 08 06 C6 08 06 C6 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 0E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 01 FF 00 1E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 43 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 43 07 00 2B FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 29 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 46 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B0 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 FF 00 08 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 9B 07 00 A1 07 00 B6 01 FF 00 1D 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 19 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 47 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 01 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 21 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 42 07 00 19 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 01 3D 01 FF 00 1C 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D 42 07 00 1F FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D 45 07 00 36 00 4F 07 00 98 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 98 01 5D 07 00 98 42 07 00 36 40 07 00 98 45 07 00 36 40 07 01 3B 45 07 00 36 40 07 00 82 45 07 00 36 40 01 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 00 45 07 00 36 40 07 00 F4 4B 07 00 F4 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 01 5D 07 00 F4 43 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 00 4D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 01 3D 46 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 08 08 EC 08 08 EC 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 45 07 00 11 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D FF 00 0B 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 05 07 00 F4 07 01 3D 07 00 A1 07 01 3D 01 FF 00 1F 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 47 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 01 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 00 A1 45 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 F4 07 01 3D 07 01 3D FF 00 0E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 FF 00 02 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 05 07 00 F4 07 01 3D 07 01 3D 01 01 FF 00 1E 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 42 07 00 36 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 45 07 00 36 F8 00 00 FF 00 00 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 01 07 00 82 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 00 A1 07 01 3D FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 4D 01 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 01 3D FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 F4 07 00 4D FF 00 01 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 4D 07 00 03 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 01 FF 00 01 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 08 06 C6 08 06 C6 FF 00 01 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 03 07 00 55 FF 00 01 00 04 07 00 03 07 01 90 07 01 9D 07 00 4D 00 02 07 00 03 07 00 4D FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 01 3D 41 07 00 98 F9 00 01 FF 00 01 00 03 07 00 03 07 01 90 07 01 9D 00 02 07 01 9D 07 02 16 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 04 07 00 F4 07 01 3D 07 01 3D 01 41 07 00 F4 FF 00 01 00 02 07 00 03 07 01 90 00 01 07 00 03 FE 00 01 07 01 9D 07 00 4D 07 00 78 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 F8 00 01 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B0 41 07 00 03 FA 00 01 F9 00 01 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 03 07 00 9B 07 00 A1 07 00 B6 41 07 00 82 FF 00 01 00 05 07 00 03 07 01 90 07 01 9D 07 00 4D 07 00 78 00 02 07 00 9B 07 00 A1 FF 00 01 00 02 07 00 03 07 01 90 00 01 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2557   2565   Any
        //  2557   2565   2557   2565   Any
        //  2573   2575   3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Any
        //  73     79     3      8      Ljava/lang/IllegalStateException;
        //  73     79     3      8      Ljava/lang/NullPointerException;
        //  73     79     3      8      Any
        //  90     97     97     98     Any
        //  90     97     90     91     Any
        //  90     97     97     98     Ljava/lang/NumberFormatException;
        //  90     97     90     91     Ljava/util/ConcurrentModificationException;
        //  90     97     97     98     Ljava/lang/UnsupportedOperationException;
        //  209    216    216    217    Any
        //  210    216    209    210    Ljava/lang/IndexOutOfBoundsException;
        //  210    216    209    210    Ljava/lang/IllegalArgumentException;
        //  210    216    216    217    Any
        //  210    216    209    210    Any
        //  272    279    279    280    Any
        //  272    279    279    280    Ljava/lang/IllegalArgumentException;
        //  272    279    3      8      Any
        //  273    279    3      8      Any
        //  272    279    272    273    Ljava/lang/EnumConstantNotPresentException;
        //  343    350    350    351    Any
        //  343    350    350    351    Any
        //  344    350    3      8      Any
        //  343    350    350    351    Ljava/util/NoSuchElementException;
        //  343    350    343    344    Ljava/util/NoSuchElementException;
        //  411    418    418    419    Any
        //  411    418    411    412    Ljava/lang/ClassCastException;
        //  411    418    411    412    Any
        //  412    418    411    412    Ljava/lang/UnsupportedOperationException;
        //  412    418    418    419    Any
        //  529    536    536    537    Any
        //  529    536    536    537    Any
        //  529    536    536    537    Any
        //  529    536    529    530    Any
        //  529    536    529    530    Ljava/lang/ClassCastException;
        //  591    598    598    599    Any
        //  591    598    598    599    Any
        //  591    598    3      8      Any
        //  592    598    591    592    Ljava/lang/IllegalStateException;
        //  591    598    591    592    Any
        //  606    612    612    613    Any
        //  606    612    3      8      Any
        //  606    612    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  606    612    612    613    Any
        //  606    612    612    613    Any
        //  667    674    674    675    Any
        //  668    674    667    668    Any
        //  667    674    667    668    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  667    674    674    675    Ljava/lang/NegativeArraySizeException;
        //  668    674    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  679    686    686    687    Any
        //  679    686    686    687    Any
        //  680    686    679    680    Any
        //  679    686    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  679    686    3      8      Ljava/util/NoSuchElementException;
        //  690    697    697    698    Any
        //  691    697    690    691    Any
        //  691    697    697    698    Any
        //  690    697    697    698    Ljava/lang/IndexOutOfBoundsException;
        //  690    697    690    691    Ljava/lang/ClassCastException;
        //  763    769    769    770    Any
        //  763    769    3      8      Ljava/util/ConcurrentModificationException;
        //  763    769    3      8      Any
        //  763    769    769    770    Ljava/lang/IllegalStateException;
        //  763    769    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  823    830    830    831    Any
        //  824    830    823    824    Ljava/lang/NegativeArraySizeException;
        //  824    830    823    824    Ljava/lang/AssertionError;
        //  824    830    823    824    Any
        //  823    830    830    831    Any
        //  858    864    864    865    Any
        //  858    864    3      8      Ljava/lang/NullPointerException;
        //  858    864    3      8      Ljava/lang/NegativeArraySizeException;
        //  858    864    864    865    Any
        //  858    864    3      8      Any
        //  915    922    922    923    Any
        //  916    922    922    923    Ljava/lang/IndexOutOfBoundsException;
        //  916    922    922    923    Ljava/lang/UnsupportedOperationException;
        //  916    922    915    916    Ljava/lang/StringIndexOutOfBoundsException;
        //  915    922    3      8      Ljava/lang/AssertionError;
        //  983    989    989    990    Any
        //  983    989    989    990    Ljava/lang/RuntimeException;
        //  983    989    3      8      Any
        //  983    989    3      8      Ljava/lang/NumberFormatException;
        //  983    989    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  997    1004   1004   1005   Any
        //  998    1004   3      8      Any
        //  997    1004   1004   1005   Any
        //  997    1004   997    998    Ljava/lang/UnsupportedOperationException;
        //  998    1004   1004   1005   Ljava/util/ConcurrentModificationException;
        //  1008   1015   1015   1016   Any
        //  1009   1015   1015   1016   Any
        //  1009   1015   1015   1016   Any
        //  1008   1015   1008   1009   Any
        //  1009   1015   3      8      Any
        //  1075   1082   1082   1083   Any
        //  1075   1082   1082   1083   Any
        //  1076   1082   1075   1076   Ljava/lang/NumberFormatException;
        //  1076   1082   1075   1076   Any
        //  1076   1082   3      8      Any
        //  1179   1186   1186   1187   Any
        //  1180   1186   1186   1187   Any
        //  1180   1186   1179   1180   Ljava/lang/ArithmeticException;
        //  1179   1186   1186   1187   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1180   1186   3      8      Any
        //  1191   1197   1197   1198   Any
        //  1191   1197   1197   1198   Any
        //  1191   1197   3      8      Any
        //  1191   1197   1197   1198   Any
        //  1191   1197   1197   1198   Ljava/lang/NegativeArraySizeException;
        //  1252   1259   1259   1260   Any
        //  1252   1259   1252   1253   Any
        //  1252   1259   1252   1253   Ljava/lang/RuntimeException;
        //  1253   1259   1252   1253   Ljava/lang/NegativeArraySizeException;
        //  1253   1259   3      8      Ljava/lang/NullPointerException;
        //  1263   1270   1270   1271   Any
        //  1264   1270   3      8      Ljava/lang/NegativeArraySizeException;
        //  1263   1270   1270   1271   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1263   1270   1263   1264   Any
        //  1264   1270   1270   1271   Ljava/lang/NullPointerException;
        //  1375   1382   1382   1383   Any
        //  1375   1382   3      8      Any
        //  1376   1382   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1376   1382   1375   1376   Any
        //  1376   1382   1375   1376   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1389   1396   1396   1397   Any
        //  1389   1396   3      8      Ljava/util/ConcurrentModificationException;
        //  1389   1396   3      8      Any
        //  1389   1396   3      8      Any
        //  1389   1396   1389   1390   Ljava/lang/UnsupportedOperationException;
        //  1447   1454   1454   1455   Any
        //  1448   1454   1447   1448   Ljava/lang/IllegalArgumentException;
        //  1448   1454   3      8      Any
        //  1447   1454   3      8      Ljava/lang/NegativeArraySizeException;
        //  1447   1454   1447   1448   Any
        //  1458   1465   1465   1466   Any
        //  1458   1465   1458   1459   Any
        //  1459   1465   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1459   1465   1458   1459   Ljava/lang/NegativeArraySizeException;
        //  1458   1465   1458   1459   Any
        //  1469   1476   1476   1477   Any
        //  1470   1476   1469   1470   Any
        //  1470   1476   3      8      Any
        //  1469   1476   1469   1470   Any
        //  1470   1476   1469   1470   Ljava/lang/ClassCastException;
        //  1532   1538   1538   1539   Any
        //  1532   1538   1538   1539   Ljava/lang/AssertionError;
        //  1532   1538   1538   1539   Ljava/lang/StringIndexOutOfBoundsException;
        //  1532   1538   1538   1539   Any
        //  1532   1538   1538   1539   Any
        //  1545   1552   1552   1553   Any
        //  1546   1552   1552   1553   Ljava/lang/EnumConstantNotPresentException;
        //  1546   1552   3      8      Ljava/lang/NullPointerException;
        //  1545   1552   1545   1546   Any
        //  1546   1552   1552   1553   Ljava/lang/ArithmeticException;
        //  1559   1566   1566   1567   Any
        //  1560   1566   1559   1560   Any
        //  1560   1566   1566   1567   Ljava/lang/IndexOutOfBoundsException;
        //  1559   1566   1566   1567   Ljava/lang/IndexOutOfBoundsException;
        //  1559   1566   1559   1560   Ljava/lang/ClassCastException;
        //  1615   1622   1622   1623   Any
        //  1616   1622   1615   1616   Any
        //  1615   1622   3      8      Any
        //  1615   1622   1615   1616   Ljava/lang/AssertionError;
        //  1615   1622   1615   1616   Any
        //  1629   1636   1636   1637   Any
        //  1630   1636   1636   1637   Any
        //  1630   1636   1629   1630   Ljava/lang/RuntimeException;
        //  1630   1636   1629   1630   Ljava/lang/IndexOutOfBoundsException;
        //  1629   1636   1636   1637   Any
        //  1643   1650   1650   1651   Any
        //  1644   1650   1650   1651   Ljava/lang/NumberFormatException;
        //  1643   1650   3      8      Ljava/lang/IllegalStateException;
        //  1643   1650   1643   1644   Ljava/util/ConcurrentModificationException;
        //  1644   1650   1643   1644   Ljava/lang/RuntimeException;
        //  1707   1713   1713   1714   Any
        //  1707   1713   1713   1714   Any
        //  1707   1713   1713   1714   Any
        //  1707   1713   1713   1714   Ljava/util/ConcurrentModificationException;
        //  1707   1713   1713   1714   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1720   1727   1727   1728   Any
        //  1720   1727   1720   1721   Any
        //  1721   1727   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1721   1727   1720   1721   Ljava/lang/IllegalArgumentException;
        //  1720   1727   3      8      Any
        //  1787   1794   1794   1795   Any
        //  1788   1794   1787   1788   Any
        //  1788   1794   1794   1795   Any
        //  1788   1794   1794   1795   Any
        //  1788   1794   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1848   1855   1855   1856   Any
        //  1848   1855   1855   1856   Ljava/util/ConcurrentModificationException;
        //  1849   1855   1848   1849   Any
        //  1848   1855   1848   1849   Any
        //  1848   1855   3      8      Ljava/lang/NegativeArraySizeException;
        //  1860   1866   1866   1867   Any
        //  1860   1866   3      8      Any
        //  1860   1866   3      8      Any
        //  1860   1866   3      8      Ljava/util/NoSuchElementException;
        //  1860   1866   3      8      Any
        //  1883   1889   1889   1890   Any
        //  1883   1889   1889   1890   Ljava/lang/StringIndexOutOfBoundsException;
        //  1883   1889   1889   1890   Any
        //  1883   1889   1889   1890   Any
        //  1883   1889   1889   1890   Any
        //  1894   1901   1901   1902   Any
        //  1894   1901   1901   1902   Any
        //  1894   1901   1901   1902   Ljava/lang/ClassCastException;
        //  1894   1901   1894   1895   Ljava/lang/ArithmeticException;
        //  1895   1901   3      8      Any
        //  1905   1912   1912   1913   Any
        //  1905   1912   1905   1906   Ljava/lang/AssertionError;
        //  1906   1912   1912   1913   Any
        //  1906   1912   3      8      Any
        //  1906   1912   1912   1913   Ljava/lang/StringIndexOutOfBoundsException;
        //  1920   1927   1927   1928   Any
        //  1921   1927   3      8      Ljava/lang/ClassCastException;
        //  1921   1927   3      8      Any
        //  1920   1927   1920   1921   Any
        //  1920   1927   1920   1921   Any
        //  1932   1938   1938   1939   Any
        //  1932   1938   3      8      Ljava/lang/IllegalStateException;
        //  1932   1938   1938   1939   Ljava/lang/ArithmeticException;
        //  1932   1938   3      8      Any
        //  1932   1938   3      8      Ljava/lang/NullPointerException;
        //  2000   2006   2006   2007   Any
        //  2000   2006   3      8      Any
        //  2000   2006   2006   2007   Any
        //  2000   2006   2006   2007   Any
        //  2000   2006   2006   2007   Any
        //  2013   2020   2020   2021   Any
        //  2014   2020   2013   2014   Ljava/lang/UnsupportedOperationException;
        //  2013   2020   2020   2021   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2013   2020   2013   2014   Ljava/lang/NullPointerException;
        //  2013   2020   3      8      Ljava/lang/NumberFormatException;
        //  2024   2031   2031   2032   Any
        //  2024   2031   2031   2032   Any
        //  2024   2031   3      8      Any
        //  2024   2031   2024   2025   Any
        //  2025   2031   3      8      Any
        //  2040   2047   2047   2048   Any
        //  2041   2047   3      8      Any
        //  2041   2047   2040   2041   Any
        //  2040   2047   2047   2048   Ljava/lang/RuntimeException;
        //  2041   2047   2040   2041   Any
        //  2054   2061   2061   2062   Any
        //  2055   2061   2054   2055   Ljava/util/NoSuchElementException;
        //  2054   2061   2061   2062   Ljava/util/ConcurrentModificationException;
        //  2055   2061   2061   2062   Ljava/lang/ClassCastException;
        //  2055   2061   2061   2062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2065   2072   2072   2073   Any
        //  2065   2072   2072   2073   Any
        //  2065   2072   2072   2073   Any
        //  2066   2072   2072   2073   Any
        //  2066   2072   2065   2066   Any
        //  2076   2083   2083   2084   Any
        //  2076   2083   2076   2077   Ljava/lang/IndexOutOfBoundsException;
        //  2076   2083   3      8      Ljava/lang/UnsupportedOperationException;
        //  2077   2083   2076   2077   Ljava/lang/ClassCastException;
        //  2076   2083   2083   2084   Any
        //  2131   2138   2138   2139   Any
        //  2132   2138   2131   2132   Ljava/lang/NumberFormatException;
        //  2132   2138   2138   2139   Ljava/util/NoSuchElementException;
        //  2131   2138   2138   2139   Ljava/lang/IndexOutOfBoundsException;
        //  2131   2138   3      8      Any
        //  2191   2198   2198   2199   Any
        //  2191   2198   2191   2192   Any
        //  2191   2198   2191   2192   Ljava/lang/StringIndexOutOfBoundsException;
        //  2192   2198   2191   2192   Ljava/lang/EnumConstantNotPresentException;
        //  2192   2198   3      8      Any
        //  2205   2212   2212   2213   Any
        //  2205   2212   3      8      Any
        //  2206   2212   2205   2206   Any
        //  2206   2212   2212   2213   Any
        //  2205   2212   2212   2213   Ljava/lang/EnumConstantNotPresentException;
        //  2220   2226   2226   2227   Any
        //  2220   2226   3      8      Any
        //  2220   2226   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2220   2226   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2220   2226   3      8      Ljava/lang/NegativeArraySizeException;
        //  2276   2283   2283   2284   Any
        //  2277   2283   2276   2277   Any
        //  2277   2283   2276   2277   Any
        //  2276   2283   2276   2277   Any
        //  2277   2283   2283   2284   Ljava/lang/IllegalStateException;
        //  2291   2298   2298   2299   Any
        //  2291   2298   2298   2299   Any
        //  2292   2298   2291   2292   Any
        //  2292   2298   2291   2292   Ljava/lang/NegativeArraySizeException;
        //  2291   2298   2298   2299   Any
        //  2305   2312   2312   2313   Any
        //  2305   2312   3      8      Ljava/lang/AssertionError;
        //  2305   2312   2312   2313   Ljava/lang/NumberFormatException;
        //  2305   2312   3      8      Any
        //  2305   2312   2305   2306   Ljava/lang/NegativeArraySizeException;
        //  2363   2370   2370   2371   Any
        //  2364   2370   3      8      Any
        //  2364   2370   3      8      Ljava/lang/NullPointerException;
        //  2364   2370   2363   2364   Any
        //  2363   2370   2370   2371   Ljava/lang/ClassCastException;
        //  2379   2386   2386   2387   Any
        //  2379   2386   2379   2380   Any
        //  2380   2386   2386   2387   Any
        //  2380   2386   2386   2387   Any
        //  2380   2386   2379   2380   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2394   2400   2400   2401   Any
        //  2394   2400   3      8      Any
        //  2394   2400   3      8      Any
        //  2394   2400   2400   2401   Any
        //  2394   2400   3      8      Ljava/util/NoSuchElementException;
        //  2404   2411   2411   2412   Any
        //  2405   2411   2404   2405   Ljava/lang/ArithmeticException;
        //  2404   2411   2404   2405   Ljava/lang/UnsupportedOperationException;
        //  2404   2411   2404   2405   Any
        //  2404   2411   3      8      Any
        //  2415   2422   2422   2423   Any
        //  2415   2422   2415   2416   Any
        //  2415   2422   2415   2416   Ljava/lang/StringIndexOutOfBoundsException;
        //  2416   2422   2422   2423   Ljava/lang/IndexOutOfBoundsException;
        //  2415   2422   2422   2423   Ljava/lang/UnsupportedOperationException;
        //  2475   2482   2482   2483   Any
        //  2475   2482   2475   2476   Any
        //  2476   2482   2482   2483   Ljava/lang/NegativeArraySizeException;
        //  2475   2482   2482   2483   Ljava/util/ConcurrentModificationException;
        //  2476   2482   2475   2476   Any
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
    
    public f5e c(final String p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          473
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            465
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            457
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5f.0:Ljava/util/Map;
        //    28: iload_2        
        //    29: goto            33
        //    32: athrow         
        //    33: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    36: goto            40
        //    39: athrow         
        //    40: goto            44
        //    43: athrow         
        //    44: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    49: goto            53
        //    52: athrow         
        //    53: ifeq            245
        //    56: aload_0        
        //    57: getfield        dev/nuker/pyro/f5f.0:Ljava/util/Map;
        //    60: getstatic       dev/nuker/pyro/fc.1:I
        //    63: ifeq            72
        //    66: ldc_w           1413163888
        //    69: goto            75
        //    72: ldc_w           -591527763
        //    75: ldc_w           -762815337
        //    78: ixor           
        //    79: lookupswitch {
        //          -2035058713: 72
        //          238443578: 104
        //          default: 438
        //        }
        //   104: iload_2        
        //   105: goto            109
        //   108: athrow         
        //   109: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   112: goto            116
        //   115: athrow         
        //   116: getstatic       dev/nuker/pyro/fc.c:I
        //   119: ifge            128
        //   122: ldc_w           182139808
        //   125: goto            131
        //   128: ldc_w           -209667960
        //   131: ldc_w           763329988
        //   134: ixor           
        //   135: lookupswitch {
        //          -1082559914: 128
        //          665077348: 440
        //          default: 160
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   169: goto            173
        //   172: athrow         
        //   173: checkcast       Ldev/nuker/pyro/f5e;
        //   176: astore_3       
        //   177: getstatic       dev/nuker/pyro/fc.1:I
        //   180: ifeq            189
        //   183: ldc_w           -932794757
        //   186: goto            192
        //   189: ldc_w           -547901056
        //   192: ldc_w           1291142456
        //   195: ixor           
        //   196: lookupswitch {
        //          -2070680765: 436
        //          -1753735877: 189
        //          default: 224
        //        }
        //   224: aload_3        
        //   225: getfield        dev/nuker/pyro/f5e.c:Ljava/lang/String;
        //   228: aload_1        
        //   229: goto            233
        //   232: athrow         
        //   233: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   236: goto            240
        //   239: athrow         
        //   240: ifeq            245
        //   243: aload_3        
        //   244: areturn        
        //   245: new             Ldev/nuker/pyro/f5e;
        //   248: dup            
        //   249: getstatic       dev/nuker/pyro/fc.c:I
        //   252: ifge            261
        //   255: ldc_w           -1580211827
        //   258: goto            264
        //   261: ldc_w           -506515914
        //   264: ldc_w           -334207730
        //   267: ixor           
        //   268: lookupswitch {
        //          1306231939: 442
        //          1564889698: 261
        //          default: 296
        //        }
        //   296: aload_0        
        //   297: getstatic       dev/nuker/pyro/fc.c:I
        //   300: ifge            309
        //   303: ldc_w           -1739968255
        //   306: goto            312
        //   309: ldc_w           1758675729
        //   312: ldc_w           -1586789283
        //   315: ixor           
        //   316: lookupswitch {
        //          -2025388622: 309
        //          958510428: 444
        //          default: 344
        //        }
        //   344: aload_1        
        //   345: goto            349
        //   348: athrow         
        //   349: invokespecial   dev/nuker/pyro/f5e.<init>:(Ldev/nuker/pyro/f5f;Ljava/lang/String;)V
        //   352: goto            356
        //   355: athrow         
        //   356: astore_3       
        //   357: aload_0        
        //   358: getfield        dev/nuker/pyro/f5f.0:Ljava/util/Map;
        //   361: iload_2        
        //   362: goto            366
        //   365: athrow         
        //   366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   369: goto            373
        //   372: athrow         
        //   373: aload_3        
        //   374: getstatic       dev/nuker/pyro/fc.0:I
        //   377: ifeq            386
        //   380: ldc_w           -1062520305
        //   383: goto            389
        //   386: ldc_w           505556195
        //   389: ldc_w           305559481
        //   392: ixor           
        //   393: lookupswitch {
        //          -761442890: 386
        //          202660698: 420
        //          default: 446
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   429: goto            433
        //   432: athrow         
        //   433: pop            
        //   434: aload_3        
        //   435: areturn        
        //   436: aconst_null    
        //   437: athrow         
        //   438: aconst_null    
        //   439: athrow         
        //   440: aconst_null    
        //   441: athrow         
        //   442: aconst_null    
        //   443: athrow         
        //   444: aconst_null    
        //   445: athrow         
        //   446: aconst_null    
        //   447: athrow         
        //   448: pop            
        //   449: goto            24
        //   452: pop            
        //   453: aconst_null    
        //   454: goto            448
        //   457: dup            
        //   458: ifnull          448
        //   461: checkcast       Ljava/lang/Throwable;
        //   464: athrow         
        //   465: dup            
        //   466: ifnull          452
        //   469: checkcast       Ljava/lang/Throwable;
        //   472: athrow         
        //   473: aconst_null    
        //   474: athrow         
        //    StackMapTable: 00 42 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FE 00 03 07 00 03 07 01 3D 01 47 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 47 07 00 36 40 01 52 07 02 1E FF 00 02 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 01 5C 07 02 1E 43 07 00 2B FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 FF 00 0B 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 FF 00 02 00 03 07 00 03 07 01 3D 01 00 03 07 02 1E 07 02 18 01 FF 00 1C 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 42 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 47 07 00 36 40 07 01 3B FC 00 0F 07 00 78 42 01 1F 47 07 00 36 FF 00 00 00 04 07 00 03 07 01 3D 01 07 00 78 00 02 07 01 3D 07 01 3D 45 07 00 36 40 01 FA 00 04 FF 00 0F 00 03 07 00 03 07 01 3D 01 00 02 08 00 F5 08 00 F5 FF 00 02 00 03 07 00 03 07 01 3D 01 00 03 08 00 F5 08 00 F5 01 FF 00 1F 00 03 07 00 03 07 01 3D 01 00 02 08 00 F5 08 00 F5 FF 00 0C 00 03 07 00 03 07 01 3D 01 00 03 08 00 F5 08 00 F5 07 00 03 FF 00 02 00 03 07 00 03 07 01 3D 01 00 04 08 00 F5 08 00 F5 07 00 03 01 FF 00 1F 00 03 07 00 03 07 01 3D 01 00 03 08 00 F5 08 00 F5 07 00 03 43 07 00 36 FF 00 00 00 03 07 00 03 07 01 3D 01 00 04 08 00 F5 08 00 F5 07 00 03 07 01 3D 45 07 00 36 40 07 00 78 FF 00 08 00 04 07 00 03 07 01 3D 01 07 00 78 00 01 07 00 36 FF 00 00 00 04 07 00 03 07 01 3D 01 07 00 78 00 02 07 02 1E 01 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 3D 01 07 00 78 00 02 07 02 1E 07 02 18 FF 00 0C 00 04 07 00 03 07 01 3D 01 07 00 78 00 03 07 02 1E 07 02 18 07 00 78 FF 00 02 00 04 07 00 03 07 01 3D 01 07 00 78 00 04 07 02 1E 07 02 18 07 00 78 01 FF 00 1E 00 04 07 00 03 07 01 3D 01 07 00 78 00 03 07 02 1E 07 02 18 07 00 78 42 07 00 1B FF 00 00 00 04 07 00 03 07 01 3D 01 07 00 78 00 03 07 02 1E 07 02 18 07 00 78 47 07 00 36 40 07 01 3B 02 FF 00 01 00 03 07 00 03 07 01 3D 01 00 01 07 02 1E FF 00 01 00 03 07 00 03 07 01 3D 01 00 02 07 02 1E 07 02 18 FF 00 01 00 03 07 00 03 07 01 3D 01 00 02 08 00 F5 08 00 F5 FF 00 01 00 03 07 00 03 07 01 3D 01 00 03 08 00 F5 08 00 F5 07 00 03 FF 00 01 00 04 07 00 03 07 01 3D 01 07 00 78 00 03 07 02 1E 07 02 18 07 00 78 FF 00 01 00 03 07 00 03 07 01 3D 01 00 01 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     457    465    Any
        //  457    465    457    465    Ljava/lang/RuntimeException;
        //  473    475    3      8      Ljava/util/ConcurrentModificationException;
        //  32     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     32     33     Any
        //  33     39     3      8      Ljava/lang/RuntimeException;
        //  33     39     39     40     Ljava/util/NoSuchElementException;
        //  44     52     52     53     Any
        //  44     52     52     53     Ljava/lang/NegativeArraySizeException;
        //  44     52     52     53     Any
        //  44     52     3      8      Ljava/lang/ArithmeticException;
        //  44     52     3      8      Any
        //  108    115    115    116    Any
        //  109    115    108    109    Ljava/lang/ArithmeticException;
        //  108    115    3      8      Ljava/util/ConcurrentModificationException;
        //  108    115    115    116    Ljava/lang/NegativeArraySizeException;
        //  108    115    115    116    Any
        //  163    172    172    173    Any
        //  163    172    3      8      Any
        //  164    172    172    173    Any
        //  164    172    163    164    Any
        //  163    172    163    164    Ljava/lang/IllegalStateException;
        //  232    239    239    240    Any
        //  233    239    232    233    Ljava/lang/NegativeArraySizeException;
        //  232    239    239    240    Any
        //  233    239    232    233    Ljava/lang/EnumConstantNotPresentException;
        //  232    239    232    233    Any
        //  348    355    355    356    Any
        //  349    355    348    349    Any
        //  349    355    348    349    Any
        //  349    355    355    356    Any
        //  348    355    355    356    Any
        //  365    372    372    373    Any
        //  366    372    365    366    Ljava/lang/ArithmeticException;
        //  366    372    372    373    Any
        //  365    372    372    373    Ljava/lang/RuntimeException;
        //  365    372    365    366    Any
        //  423    432    432    433    Any
        //  423    432    3      8      Ljava/lang/NullPointerException;
        //  423    432    3      8      Ljava/lang/RuntimeException;
        //  424    432    423    424    Ljava/lang/EnumConstantNotPresentException;
        //  423    432    432    433    Ljava/lang/ClassCastException;
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
    
    @f06
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          179
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            171
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            163
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5f.0:Ljava/util/Map;
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            40
        //    34: ldc_w           621659033
        //    37: goto            43
        //    40: ldc_w           -1276024307
        //    43: ldc_w           1206496144
        //    46: ixor           
        //    47: lookupswitch {
        //          1659136009: 152
        //          1843599477: 40
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    81: goto            85
        //    84: athrow         
        //    85: aload_0        
        //    86: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5f;)Ljava/util/function/Consumer;
        //    91: getstatic       dev/nuker/pyro/fc.0:I
        //    94: ifeq            103
        //    97: ldc_w           -494367200
        //   100: goto            106
        //   103: ldc_w           1830771025
        //   106: ldc_w           -752183596
        //   109: ixor           
        //   110: lookupswitch {
        //          -1103769723: 136
        //          832706804: 103
        //          default: 150
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokeinterface java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        //   145: goto            149
        //   148: athrow         
        //   149: return         
        //   150: aconst_null    
        //   151: athrow         
        //   152: aconst_null    
        //   153: athrow         
        //   154: pop            
        //   155: goto            24
        //   158: pop            
        //   159: aconst_null    
        //   160: goto            154
        //   163: dup            
        //   164: ifnull          154
        //   167: checkcast       Ljava/lang/Throwable;
        //   170: athrow         
        //   171: dup            
        //   172: ifnull          158
        //   175: checkcast       Ljava/lang/Throwable;
        //   178: athrow         
        //   179: aconst_null    
        //   180: athrow         
        //    StackMapTable: 00 19 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 02 69 4F 07 02 1E FF 00 02 00 02 07 00 03 07 02 69 00 02 07 02 1E 01 5C 07 02 1E 42 07 00 23 40 07 02 1E 47 07 00 36 40 07 02 63 FF 00 11 00 02 07 00 03 07 02 69 00 02 07 02 63 07 02 6B FF 00 02 00 02 07 00 03 07 02 69 00 03 07 02 63 07 02 6B 01 FF 00 1D 00 02 07 00 03 07 02 69 00 02 07 02 63 07 02 6B 42 07 00 36 FF 00 00 00 02 07 00 03 07 02 69 00 02 07 02 63 07 02 6B 47 07 00 36 00 FF 00 00 00 02 07 00 03 07 02 69 00 02 07 02 63 07 02 6B 41 07 02 1E 41 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     163    171    Ljava/lang/IndexOutOfBoundsException;
        //  163    171    163    171    Any
        //  179    181    3      8      Any
        //  75     84     84     85     Any
        //  76     84     84     85     Any
        //  75     84     75     76     Ljava/lang/NullPointerException;
        //  76     84     84     85     Any
        //  75     84     3      8      Ljava/util/NoSuchElementException;
        //  139    148    148    149    Any
        //  139    148    139    140    Ljava/util/NoSuchElementException;
        //  140    148    3      8      Any
        //  139    148    3      8      Any
        //  139    148    139    140    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 60 out of bounds for length 60
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
    
    @Override
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5W(this, 1045852800, b, entityPlayerSP, world);
    }
    
    @f06
    public void c(final f3t f3t) {
        fbS.1r(this, 173195956, f3t);
    }
    
    public void c(final Map.Entry entry) {
        fbS.eT(this, 2140814653, entry);
    }
}
