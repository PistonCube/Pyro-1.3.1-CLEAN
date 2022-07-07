// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f7i extends fH
{
    @NotNull
    public f0d c;
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    public int 1;
    public boolean c;
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1791
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1783
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1775
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             364507328
        //    32: goto            37
        //    35: ldc             -997441574
        //    37: ldc             -1365573175
        //    39: ixor           
        //    40: lookupswitch {
        //          -1155337975: 35
        //          1779908115: 68
        //          default: 1726
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    78: goto            82
        //    81: athrow         
        //    82: getstatic       dev/nuker/pyro/fc.1:I
        //    85: ifeq            93
        //    88: ldc             -1771717871
        //    90: goto            95
        //    93: ldc             -432182648
        //    95: ldc             206093734
        //    97: ixor           
        //    98: lookupswitch {
        //          -1708325193: 93
        //          -361375954: 124
        //          default: 1758
        //        }
        //   124: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   127: if_acmpne       1719
        //   130: aload_1        
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/f34.0:()Z
        //   138: goto            142
        //   141: athrow         
        //   142: ifne            1719
        //   145: aload_1        
        //   146: goto            150
        //   149: athrow         
        //   150: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   153: goto            157
        //   156: athrow         
        //   157: instanceof      Lnet/minecraft/network/play/server/SPacketPlayerPosLook;
        //   160: ifeq            719
        //   163: aload_0        
        //   164: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   167: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   170: ifnull          178
        //   173: ldc             749271539
        //   175: goto            180
        //   178: ldc             749271540
        //   180: ldc             -1701311880
        //   182: ixor           
        //   183: tableswitch {
        //          1818355478: 204
        //          1818355479: 1719
        //          default: 173
        //        }
        //   204: aload_0        
        //   205: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   208: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   211: dup            
        //   212: pop            
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70089_S:()Z
        //   220: goto            224
        //   223: athrow         
        //   224: ifeq            1719
        //   227: aload_0        
        //   228: getstatic       dev/nuker/pyro/fc.0:I
        //   231: ifeq            239
        //   234: ldc             -1427139434
        //   236: goto            241
        //   239: ldc             441712551
        //   241: ldc             -933930781
        //   243: ixor           
        //   244: lookupswitch {
        //          -771315900: 272
        //          1656409205: 239
        //          default: 1728
        //        }
        //   272: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   275: getstatic       dev/nuker/pyro/fc.1:I
        //   278: ifeq            286
        //   281: ldc             100018008
        //   283: goto            288
        //   286: ldc             -21515575
        //   288: ldc             -414730522
        //   290: ixor           
        //   291: lookupswitch {
        //          -491679298: 1750
        //          11332174: 286
        //          default: 316
        //        }
        //   316: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   319: new             Lnet/minecraft/util/math/BlockPos;
        //   322: dup            
        //   323: aload_0        
        //   324: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   327: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   330: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   333: getstatic       dev/nuker/pyro/fc.c:I
        //   336: ifge            344
        //   339: ldc             343329770
        //   341: goto            346
        //   344: ldc             150919502
        //   346: ldc             -350022832
        //   348: ixor           
        //   349: lookupswitch {
        //          -472004066: 376
        //          -11151174: 344
        //          default: 1744
        //        }
        //   376: aload_0        
        //   377: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   380: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   383: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   386: getstatic       dev/nuker/pyro/fc.c:I
        //   389: ifge            397
        //   392: ldc             1058130006
        //   394: goto            399
        //   397: ldc             1696355592
        //   399: ldc             664439151
        //   401: ixor           
        //   402: lookupswitch {
        //          -338229103: 397
        //          411779385: 1730
        //          default: 428
        //        }
        //   428: aload_0        
        //   429: getstatic       dev/nuker/pyro/fc.c:I
        //   432: ifge            440
        //   435: ldc             2133486754
        //   437: goto            442
        //   440: ldc             2097503990
        //   442: ldc             657366507
        //   444: ixor           
        //   445: lookupswitch {
        //          -649040294: 440
        //          1476718921: 1738
        //          default: 472
        //        }
        //   472: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   475: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   478: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   481: getstatic       dev/nuker/pyro/fc.1:I
        //   484: ifeq            492
        //   487: ldc             -783353845
        //   489: goto            494
        //   492: ldc             -667339259
        //   494: ldc             -1193673961
        //   496: ixor           
        //   497: lookupswitch {
        //          1625345298: 524
        //          1771504412: 492
        //          default: 1762
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   531: goto            535
        //   534: athrow         
        //   535: iconst_0       
        //   536: goto            540
        //   539: athrow         
        //   540: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175668_a:(Lnet/minecraft/util/math/BlockPos;Z)Z
        //   543: goto            547
        //   546: athrow         
        //   547: ifeq            1719
        //   550: aload_0        
        //   551: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   554: getstatic       dev/nuker/pyro/fc.c:I
        //   557: ifge            565
        //   560: ldc             177415217
        //   562: goto            567
        //   565: ldc             -1821222160
        //   567: ldc             695941352
        //   569: ixor           
        //   570: lookupswitch {
        //          -1173790184: 596
        //          602414297: 565
        //          default: 1732
        //        }
        //   596: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   599: instanceof      Lnet/minecraft/client/gui/GuiDownloadTerrain;
        //   602: ifne            1719
        //   605: aload_0        
        //   606: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   609: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   612: dup            
        //   613: pop            
        //   614: getstatic       dev/nuker/pyro/fc.c:I
        //   617: ifge            625
        //   620: ldc             720637625
        //   622: goto            627
        //   625: ldc             -1282292667
        //   627: ldc             479778384
        //   629: ixor           
        //   630: lookupswitch {
        //          -1358360043: 656
        //          913103081: 625
        //          default: 1760
        //        }
        //   656: goto            660
        //   659: athrow         
        //   660: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //   663: goto            667
        //   666: athrow         
        //   667: ifeq            675
        //   670: ldc             1688078460
        //   672: goto            677
        //   675: ldc             1688078459
        //   677: ldc             -199714505
        //   679: ixor           
        //   680: tableswitch {
        //          554508950: 704
        //          554508951: 1719
        //          default: 670
        //        }
        //   704: aload_1        
        //   705: goto            709
        //   708: athrow         
        //   709: invokevirtual   dev/nuker/pyro/f34.c:()V
        //   712: goto            716
        //   715: athrow         
        //   716: goto            1719
        //   719: aload_1        
        //   720: getstatic       dev/nuker/pyro/fc.c:I
        //   723: ifge            731
        //   726: ldc             44400758
        //   728: goto            733
        //   731: ldc             -1256599116
        //   733: ldc             -1242220571
        //   735: ixor           
        //   736: lookupswitch {
        //          -1219446893: 731
        //          15525457: 764
        //          default: 1752
        //        }
        //   764: goto            768
        //   767: athrow         
        //   768: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   771: goto            775
        //   774: athrow         
        //   775: instanceof      Lnet/minecraft/network/play/server/SPacketMoveVehicle;
        //   778: ifeq            1067
        //   781: getstatic       dev/nuker/pyro/fc.1:I
        //   784: ifeq            792
        //   787: ldc             664788427
        //   789: goto            794
        //   792: ldc             -204872754
        //   794: ldc             1953511472
        //   796: ixor           
        //   797: lookupswitch {
        //          -2017862658: 824
        //          1408230907: 792
        //          default: 1742
        //        }
        //   824: aload_1        
        //   825: goto            829
        //   828: athrow         
        //   829: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   832: goto            836
        //   835: athrow         
        //   836: dup            
        //   837: ifnonnull       845
        //   840: ldc             230926538
        //   842: goto            847
        //   845: ldc             230928181
        //   847: ldc             479636277
        //   849: ixor           
        //   850: tableswitch {
        //          581568510: 872
        //          581568511: 901
        //          default: 840
        //        }
        //   872: new             Lkotlin/TypeCastException;
        //   875: dup            
        //   876: ldc             "\u221e\u1486\u8b05\ub1c4\ucf2e\uec15\ub225\ue72a\udb77\uef12\ua6c2\u1e0c\ue002\uc7b3\u87da\u888e\u57a5\u76f2\ubf38\uc6e1\u2af6\uc234\u6ba9\u2f49\ud170\u347b\u7d66\u8844\u8215\u8a36\u855c\ufb72\u7122\u981e\u1d38\uf092\u493c\u898b\uc892\uf99e\ub766\u41fe\ub819\ub157\u4add\u8b06\u7c7b\ucfc0\u7f59\uec7b\ue766\u16d6\uefb7\u358b\u4010\ue003\u0a05\u873e\u1b8a\u09ff\u76e1\u728c\uc617\ub9e5\u9c63\u6be0\ue2f4\ud1c6\ua739\u2372\u8808\u4f92\u8aa5\u1618\ua57a\u7131\u55a3\u1d93\u63f3\u1738\u899f\u0533\uf913\u2464\u1fb0\ub815\u7cfb\u4a7b\u1849"
        //   878: goto            882
        //   881: athrow         
        //   882: invokestatic    invokestatic   !!! ERROR
        //   885: goto            889
        //   888: athrow         
        //   889: goto            893
        //   892: athrow         
        //   893: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   896: goto            900
        //   899: athrow         
        //   900: athrow         
        //   901: checkcast       Lnet/minecraft/network/play/server/SPacketMoveVehicle;
        //   904: astore_2       
        //   905: aload_0        
        //   906: getstatic       dev/nuker/pyro/fc.c:I
        //   909: ifge            917
        //   912: ldc             -1224768090
        //   914: goto            919
        //   917: ldc             672207969
        //   919: ldc             -695534044
        //   921: ixor           
        //   922: lookupswitch {
        //          -23336379: 948
        //          1618312066: 917
        //          default: 1722
        //        }
        //   948: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   951: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   954: aload_2        
        //   955: goto            959
        //   958: athrow         
        //   959: invokevirtual   net/minecraft/network/play/server/SPacketMoveVehicle.func_186957_a:()D
        //   962: goto            966
        //   965: athrow         
        //   966: aload_2        
        //   967: goto            971
        //   970: athrow         
        //   971: invokevirtual   net/minecraft/network/play/server/SPacketMoveVehicle.func_186955_b:()D
        //   974: goto            978
        //   977: athrow         
        //   978: aload_2        
        //   979: goto            983
        //   982: athrow         
        //   983: invokevirtual   net/minecraft/network/play/server/SPacketMoveVehicle.func_186956_c:()D
        //   986: goto            990
        //   989: athrow         
        //   990: goto            994
        //   993: athrow         
        //   994: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70011_f:(DDD)D
        //   997: goto            1001
        //  1000: athrow         
        //  1001: bipush          15
        //  1003: i2d            
        //  1004: dcmpg          
        //  1005: ifgt            1719
        //  1008: getstatic       dev/nuker/pyro/fc.1:I
        //  1011: ifeq            1019
        //  1014: ldc             1022853991
        //  1016: goto            1021
        //  1019: ldc             1274745284
        //  1021: ldc             1790757055
        //  1023: ixor           
        //  1024: lookupswitch {
        //          558356859: 1052
        //          1447775192: 1019
        //          default: 1740
        //        }
        //  1052: aload_1        
        //  1053: goto            1057
        //  1056: athrow         
        //  1057: invokevirtual   dev/nuker/pyro/f34.c:()V
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: goto            1719
        //  1067: aload_1        
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: instanceof      Lnet/minecraft/network/play/server/SPacketSetPassengers;
        //  1082: ifeq            1719
        //  1085: getstatic       dev/nuker/pyro/fc.0:I
        //  1088: ifeq            1096
        //  1091: ldc             -852686579
        //  1093: goto            1098
        //  1096: ldc             1642649512
        //  1098: ldc             -1900667084
        //  1100: ixor           
        //  1101: lookupswitch {
        //          -1484753550: 1096
        //          1134237241: 1746
        //          default: 1128
        //        }
        //  1128: aload_0        
        //  1129: getstatic       dev/nuker/pyro/fc.c:I
        //  1132: ifge            1140
        //  1135: ldc             1784052813
        //  1137: goto            1142
        //  1140: ldc             418357992
        //  1142: ldc             -1687436918
        //  1144: ixor           
        //  1145: lookupswitch {
        //          -247611961: 1756
        //          1340305656: 1140
        //          default: 1172
        //        }
        //  1172: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //  1175: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1178: dup            
        //  1179: pop            
        //  1180: goto            1184
        //  1183: athrow         
        //  1184: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //  1187: goto            1191
        //  1190: athrow         
        //  1191: ifeq            1719
        //  1194: aload_1        
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  1202: goto            1206
        //  1205: athrow         
        //  1206: dup            
        //  1207: ifnonnull       1239
        //  1210: new             Lkotlin/TypeCastException;
        //  1213: dup            
        //  1214: ldc             "\u221e\u1486\u8b05\ub1c4\ucf2e\uec15\ub225\ue72a\udb77\uef12\ua6c2\u1e0c\ue002\uc7b3\u87da\u888e\u57a5\u76f2\ubf38\uc6e1\u2af6\uc234\u6ba9\u2f49\ud170\u347b\u7d66\u8844\u8215\u8a36\u855c\ufb72\u7122\u981e\u1d38\uf092\u493c\u898b\uc892\uf99e\ub766\u41fe\ub819\ub157\u4add\u8b06\u7c7b\ucfc0\u7f59\uec7b\ue766\u16d6\uefb7\u358b\u4010\ue003\u0a05\u873e\u1b8a\u09ff\u76e1\u728c\uc617\ub9e5\u9c63\u6be0\ue2f4\ud1c6\ua739\u2372\u8808\u4f92\u8aa5\u1618\ua57a\u7131\u55a3\u1d93\u63ed\u1732\u899d\u0506\uf924\u2472\u1fab\ub819\u7cf6\u4a70\u1849\u2230\ucfde"
        //  1216: goto            1220
        //  1219: athrow         
        //  1220: invokestatic    invokestatic   !!! ERROR
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: goto            1231
        //  1230: athrow         
        //  1231: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1234: goto            1238
        //  1237: athrow         
        //  1238: athrow         
        //  1239: checkcast       Lnet/minecraft/network/play/server/SPacketSetPassengers;
        //  1242: astore_2       
        //  1243: getstatic       dev/nuker/pyro/fc.1:I
        //  1246: ifeq            1254
        //  1249: ldc             -604070647
        //  1251: goto            1256
        //  1254: ldc             761103942
        //  1256: ldc             1572565650
        //  1258: ixor           
        //  1259: lookupswitch {
        //          -2042237029: 1254
        //          1894184148: 1284
        //          default: 1736
        //        }
        //  1284: aload_2        
        //  1285: goto            1289
        //  1288: athrow         
        //  1289: invokevirtual   net/minecraft/network/play/server/SPacketSetPassengers.func_186972_b:()I
        //  1292: goto            1296
        //  1295: athrow         
        //  1296: getstatic       dev/nuker/pyro/fc.1:I
        //  1299: ifeq            1307
        //  1302: ldc             101562993
        //  1304: goto            1309
        //  1307: ldc             -268469006
        //  1309: ldc             -1008060592
        //  1311: ixor           
        //  1312: lookupswitch {
        //          -1175794621: 1307
        //          -974680799: 1754
        //          default: 1340
        //        }
        //  1340: aload_0        
        //  1341: getstatic       dev/nuker/pyro/fc.1:I
        //  1344: ifeq            1352
        //  1347: ldc             1651182885
        //  1349: goto            1354
        //  1352: ldc             1149924393
        //  1354: ldc             -114942921
        //  1356: ixor           
        //  1357: lookupswitch {
        //          -1689448174: 1352
        //          -1112774626: 1384
        //          default: 1764
        //        }
        //  1384: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //  1387: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1390: dup            
        //  1391: pop            
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: dup            
        //  1404: ifnonnull       1459
        //  1407: getstatic       dev/nuker/pyro/fc.1:I
        //  1410: ifeq            1418
        //  1413: ldc             1695085028
        //  1415: goto            1420
        //  1418: ldc             -1874878402
        //  1420: ldc             -1125166977
        //  1422: ixor           
        //  1423: lookupswitch {
        //          -639131237: 1418
        //          751890497: 1448
        //          default: 1724
        //        }
        //  1448: goto            1452
        //  1451: athrow         
        //  1452: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1455: goto            1459
        //  1458: athrow         
        //  1459: dup            
        //  1460: pop            
        //  1461: goto            1465
        //  1464: athrow         
        //  1465: invokevirtual   net/minecraft/entity/Entity.func_145782_y:()I
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: if_icmpne       1719
        //  1475: aload_2        
        //  1476: goto            1480
        //  1479: athrow         
        //  1480: invokevirtual   net/minecraft/network/play/server/SPacketSetPassengers.func_186971_a:()[I
        //  1483: goto            1487
        //  1486: athrow         
        //  1487: astore          5
        //  1489: aload           5
        //  1491: arraylength    
        //  1492: istore          6
        //  1494: iconst_0       
        //  1495: istore          4
        //  1497: iload           4
        //  1499: iload           6
        //  1501: if_icmpge       1719
        //  1504: aload           5
        //  1506: iload           4
        //  1508: iaload         
        //  1509: istore_3       
        //  1510: iload_3        
        //  1511: getstatic       dev/nuker/pyro/fc.c:I
        //  1514: ifge            1522
        //  1517: ldc             -721172260
        //  1519: goto            1524
        //  1522: ldc             655598052
        //  1524: ldc             -2101743814
        //  1526: ixor           
        //  1527: lookupswitch {
        //          -1515565346: 1552
        //          1471817702: 1522
        //          default: 1748
        //        }
        //  1552: aload_0        
        //  1553: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //  1556: getstatic       dev/nuker/pyro/fc.c:I
        //  1559: ifge            1567
        //  1562: ldc             -407723446
        //  1564: goto            1570
        //  1567: ldc_w           -296809651
        //  1570: ldc_w           -224137096
        //  1573: ixor           
        //  1574: lookupswitch {
        //          353456690: 1567
        //          485292853: 1600
        //          default: 1734
        //        }
        //  1600: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1603: dup            
        //  1604: pop            
        //  1605: goto            1609
        //  1608: athrow         
        //  1609: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_145782_y:()I
        //  1612: goto            1616
        //  1615: athrow         
        //  1616: if_icmpne       1625
        //  1619: ldc_w           1721196524
        //  1622: goto            1628
        //  1625: ldc_w           1721196523
        //  1628: ldc_w           -669626793
        //  1631: ixor           
        //  1632: tableswitch {
        //          2097292150: 1656
        //          2097292151: 1713
        //          default: 1619
        //        }
        //  1656: getstatic       dev/nuker/pyro/fc.0:I
        //  1659: ifeq            1668
        //  1662: ldc_w           -304812647
        //  1665: goto            1671
        //  1668: ldc_w           1594840402
        //  1671: ldc_w           1013935225
        //  1674: ixor           
        //  1675: lookupswitch {
        //          -776240672: 1668
        //          1667250475: 1700
        //          default: 1720
        //        }
        //  1700: aload_1        
        //  1701: goto            1705
        //  1704: athrow         
        //  1705: invokevirtual   dev/nuker/pyro/f34.c:()V
        //  1708: goto            1712
        //  1711: athrow         
        //  1712: return         
        //  1713: iinc            4, 1
        //  1716: goto            1497
        //  1719: return         
        //  1720: aconst_null    
        //  1721: athrow         
        //  1722: aconst_null    
        //  1723: athrow         
        //  1724: aconst_null    
        //  1725: athrow         
        //  1726: aconst_null    
        //  1727: athrow         
        //  1728: aconst_null    
        //  1729: athrow         
        //  1730: aconst_null    
        //  1731: athrow         
        //  1732: aconst_null    
        //  1733: athrow         
        //  1734: aconst_null    
        //  1735: athrow         
        //  1736: aconst_null    
        //  1737: athrow         
        //  1738: aconst_null    
        //  1739: athrow         
        //  1740: aconst_null    
        //  1741: athrow         
        //  1742: aconst_null    
        //  1743: athrow         
        //  1744: aconst_null    
        //  1745: athrow         
        //  1746: aconst_null    
        //  1747: athrow         
        //  1748: aconst_null    
        //  1749: athrow         
        //  1750: aconst_null    
        //  1751: athrow         
        //  1752: aconst_null    
        //  1753: athrow         
        //  1754: aconst_null    
        //  1755: athrow         
        //  1756: aconst_null    
        //  1757: athrow         
        //  1758: aconst_null    
        //  1759: athrow         
        //  1760: aconst_null    
        //  1761: athrow         
        //  1762: aconst_null    
        //  1763: athrow         
        //  1764: aconst_null    
        //  1765: athrow         
        //  1766: pop            
        //  1767: goto            24
        //  1770: pop            
        //  1771: aconst_null    
        //  1772: goto            1766
        //  1775: dup            
        //  1776: ifnull          1766
        //  1779: checkcast       Ljava/lang/Throwable;
        //  1782: athrow         
        //  1783: dup            
        //  1784: ifnull          1770
        //  1787: checkcast       Ljava/lang/Throwable;
        //  1790: athrow         
        //  1791: aconst_null    
        //  1792: athrow         
        //    StackMapTable: 00 F0 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 00 3D 0A 41 01 1E FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 3D 45 07 00 36 40 07 00 45 4A 07 00 45 FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 45 01 5C 07 00 45 49 07 00 36 40 07 00 3D 45 07 00 36 40 01 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 3D 45 07 00 36 40 07 01 0A 0F 04 41 01 17 4B 07 00 36 40 07 00 5E 45 07 00 36 40 01 4E 07 00 03 FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 03 01 5E 07 00 03 4D 07 00 55 FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 55 01 5B 07 00 55 FF 00 1B 00 02 07 00 03 07 00 3D 00 04 07 00 8B 08 01 3F 08 01 3F 03 FF 00 01 00 02 07 00 03 07 00 3D 00 05 07 00 8B 08 01 3F 08 01 3F 03 01 FF 00 1D 00 02 07 00 03 07 00 3D 00 04 07 00 8B 08 01 3F 08 01 3F 03 FF 00 14 00 02 07 00 03 07 00 3D 00 05 07 00 8B 08 01 3F 08 01 3F 03 03 FF 00 01 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 01 FF 00 1C 00 02 07 00 03 07 00 3D 00 05 07 00 8B 08 01 3F 08 01 3F 03 03 FF 00 0B 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 3D 00 07 07 00 8B 08 01 3F 08 01 3F 03 03 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 07 00 03 FF 00 13 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 03 FF 00 01 00 02 07 00 03 07 00 3D 00 07 07 00 8B 08 01 3F 08 01 3F 03 03 03 01 FF 00 1D 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 03 42 07 00 22 FF 00 00 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 03 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 00 8B 07 00 6F 43 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 03 07 00 8B 07 00 6F 01 45 07 00 36 40 01 51 07 00 55 FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 55 01 5C 07 00 55 5C 07 00 5E FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 5E 01 5C 07 00 5E FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 5E 45 07 00 36 40 01 02 04 41 01 1A FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 3D 45 07 00 36 00 02 4B 07 00 3D FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 3D 01 5E 07 00 3D 42 07 00 22 40 07 00 3D 45 07 00 36 40 07 01 0A 10 41 01 1D 43 07 00 36 40 07 00 3D 45 07 00 36 40 07 01 0A 43 07 01 0A 44 07 01 0A FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 01 0A 01 58 07 01 0A 48 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 03 68 08 03 68 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 03 68 08 03 68 07 01 0C 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 03 68 08 03 68 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 01 0A 07 00 B1 40 07 01 0A FF 00 0F 00 03 07 00 03 07 00 3D 07 00 A9 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 A9 00 02 07 00 03 01 5C 07 00 03 49 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 02 07 00 5E 07 00 A9 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 02 07 00 5E 03 43 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 03 07 00 5E 03 07 00 A9 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 03 07 00 5E 03 03 43 07 00 22 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 04 07 00 5E 03 03 07 00 A9 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 04 07 00 5E 03 03 03 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 A9 00 04 07 00 5E 03 03 03 45 07 00 36 40 03 11 41 01 1E 43 07 00 36 40 07 00 3D 45 07 00 36 00 FA 00 02 43 07 00 36 40 07 00 3D 45 07 00 36 40 07 01 0A 10 41 01 1D 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 03 01 5D 07 00 03 FF 00 0A 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 5E 45 07 00 36 40 01 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 01 07 00 3D 45 07 00 36 40 07 01 0A 4C 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 04 BA 08 04 BA 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 04 BA 08 04 BA 07 01 0C 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 04 07 01 0A 08 04 BA 08 04 BA 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 3D 00 02 07 01 0A 07 00 B1 40 07 01 0A FC 00 0E 07 00 D1 41 01 1B 43 07 00 36 40 07 00 D1 45 07 00 36 40 01 4A 01 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 01 5E 01 FF 00 0B 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 03 01 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 03 FF 00 0A 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 5E 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 FF 00 0E 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 03 01 07 00 F4 01 FF 00 1B 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 44 07 00 24 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 01 46 07 00 2C 40 07 00 D1 45 07 00 36 40 07 01 0E FF 00 09 00 07 07 00 03 07 00 3D 07 00 D1 00 01 07 01 0E 01 00 00 FF 00 18 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 01 5B 01 FF 00 0E 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 07 00 55 FF 00 02 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 03 01 07 00 55 01 FF 00 1D 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 07 00 55 47 07 00 36 FF 00 00 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 07 00 5E 45 07 00 36 FF 00 00 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 01 02 05 42 01 1B 0B 42 01 1C 43 07 00 12 40 07 00 3D 45 07 00 36 00 00 FF 00 05 00 02 07 00 03 07 00 3D 00 00 FF 00 00 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 00 FF 00 01 00 03 07 00 03 07 00 3D 07 00 A9 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 F4 FA 00 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 3D 00 05 07 00 8B 08 01 3F 08 01 3F 03 03 41 07 00 55 FF 00 01 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 02 01 07 00 55 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 00 FF 00 01 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 07 00 03 FC 00 01 07 00 A9 FA 00 01 FF 00 01 00 02 07 00 03 07 00 3D 00 04 07 00 8B 08 01 3F 08 01 3F 03 01 FF 00 01 00 07 07 00 03 07 00 3D 07 00 D1 01 01 07 01 0E 01 00 01 01 FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 55 41 07 00 3D FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 01 01 FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 03 41 07 00 45 41 07 00 5E FF 00 01 00 02 07 00 03 07 00 3D 00 06 07 00 8B 08 01 3F 08 01 3F 03 03 03 FF 00 01 00 03 07 00 03 07 00 3D 07 00 D1 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 22 43 05 44 07 00 22 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1775   1783   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1775   1783   1775   1783   Ljava/lang/EnumConstantNotPresentException;
        //  1791   1793   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  75     81     81     82     Any
        //  75     81     3      8      Any
        //  75     81     81     82     Any
        //  75     81     81     82     Ljava/lang/ArithmeticException;
        //  75     81     3      8      Ljava/lang/AssertionError;
        //  134    141    141    142    Any
        //  134    141    134    135    Any
        //  135    141    3      8      Any
        //  134    141    134    135    Any
        //  134    141    141    142    Any
        //  150    156    156    157    Any
        //  150    156    3      8      Ljava/lang/NullPointerException;
        //  150    156    156    157    Ljava/lang/IllegalArgumentException;
        //  150    156    156    157    Any
        //  150    156    3      8      Ljava/util/ConcurrentModificationException;
        //  216    223    223    224    Any
        //  217    223    216    217    Any
        //  217    223    216    217    Ljava/lang/IndexOutOfBoundsException;
        //  217    223    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  216    223    223    224    Any
        //  527    534    534    535    Any
        //  527    534    3      8      Ljava/lang/RuntimeException;
        //  527    534    527    528    Ljava/lang/NullPointerException;
        //  527    534    3      8      Any
        //  527    534    527    528    Ljava/lang/RuntimeException;
        //  539    546    546    547    Any
        //  540    546    546    547    Ljava/lang/NegativeArraySizeException;
        //  539    546    539    540    Any
        //  540    546    3      8      Ljava/lang/UnsupportedOperationException;
        //  539    546    546    547    Any
        //  660    666    666    667    Any
        //  660    666    666    667    Ljava/lang/UnsupportedOperationException;
        //  660    666    3      8      Any
        //  660    666    3      8      Ljava/lang/ArithmeticException;
        //  660    666    666    667    Any
        //  709    715    715    716    Any
        //  709    715    715    716    Any
        //  709    715    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  709    715    715    716    Any
        //  709    715    715    716    Any
        //  767    774    774    775    Any
        //  768    774    767    768    Ljava/lang/NegativeArraySizeException;
        //  767    774    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  768    774    767    768    Ljava/lang/StringIndexOutOfBoundsException;
        //  767    774    767    768    Ljava/util/ConcurrentModificationException;
        //  828    835    835    836    Any
        //  829    835    3      8      Any
        //  829    835    3      8      Any
        //  828    835    828    829    Any
        //  828    835    828    829    Any
        //  881    888    888    889    Any
        //  882    888    888    889    Any
        //  881    888    3      8      Ljava/lang/ClassCastException;
        //  881    888    888    889    Any
        //  882    888    881    882    Any
        //  892    899    899    900    Any
        //  892    899    892    893    Any
        //  892    899    899    900    Any
        //  892    899    899    900    Any
        //  893    899    3      8      Ljava/lang/AssertionError;
        //  958    965    965    966    Any
        //  959    965    3      8      Any
        //  958    965    958    959    Any
        //  958    965    958    959    Any
        //  959    965    965    966    Any
        //  970    977    977    978    Any
        //  971    977    977    978    Ljava/lang/NegativeArraySizeException;
        //  971    977    970    971    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  970    977    970    971    Any
        //  970    977    3      8      Any
        //  982    989    989    990    Any
        //  983    989    982    983    Ljava/lang/NullPointerException;
        //  982    989    982    983    Ljava/lang/RuntimeException;
        //  983    989    982    983    Ljava/lang/IllegalArgumentException;
        //  983    989    989    990    Ljava/lang/IllegalStateException;
        //  993    1000   1000   1001   Any
        //  994    1000   3      8      Ljava/lang/RuntimeException;
        //  994    1000   993    994    Any
        //  994    1000   1000   1001   Ljava/lang/IllegalArgumentException;
        //  994    1000   3      8      Any
        //  1056   1063   1063   1064   Any
        //  1056   1063   1063   1064   Any
        //  1056   1063   1063   1064   Any
        //  1057   1063   1056   1057   Any
        //  1056   1063   3      8      Any
        //  1071   1078   1078   1079   Any
        //  1072   1078   1078   1079   Ljava/lang/ClassCastException;
        //  1072   1078   1078   1079   Any
        //  1072   1078   1071   1072   Any
        //  1071   1078   3      8      Any
        //  1184   1190   1190   1191   Any
        //  1184   1190   3      8      Ljava/lang/NullPointerException;
        //  1184   1190   3      8      Any
        //  1184   1190   3      8      Ljava/lang/RuntimeException;
        //  1184   1190   3      8      Any
        //  1199   1205   1205   1206   Any
        //  1199   1205   1205   1206   Ljava/lang/IllegalArgumentException;
        //  1199   1205   3      8      Ljava/lang/IllegalStateException;
        //  1199   1205   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1199   1205   1205   1206   Any
        //  1219   1226   1226   1227   Any
        //  1220   1226   3      8      Ljava/lang/NumberFormatException;
        //  1220   1226   1219   1220   Any
        //  1220   1226   1226   1227   Ljava/lang/NegativeArraySizeException;
        //  1219   1226   3      8      Ljava/lang/NullPointerException;
        //  1230   1237   1237   1238   Any
        //  1230   1237   1230   1231   Any
        //  1230   1237   1230   1231   Ljava/lang/IllegalStateException;
        //  1231   1237   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1230   1237   3      8      Any
        //  1288   1295   1295   1296   Any
        //  1288   1295   1288   1289   Any
        //  1289   1295   1288   1289   Any
        //  1288   1295   3      8      Ljava/lang/NegativeArraySizeException;
        //  1288   1295   1288   1289   Ljava/lang/ArithmeticException;
        //  1396   1402   1402   1403   Any
        //  1396   1402   1402   1403   Any
        //  1396   1402   1402   1403   Any
        //  1396   1402   1402   1403   Any
        //  1396   1402   3      8      Ljava/lang/NullPointerException;
        //  1451   1458   1458   1459   Any
        //  1452   1458   1451   1452   Ljava/lang/RuntimeException;
        //  1452   1458   1451   1452   Any
        //  1451   1458   3      8      Ljava/lang/ArithmeticException;
        //  1451   1458   1458   1459   Ljava/lang/NegativeArraySizeException;
        //  1464   1471   1471   1472   Any
        //  1465   1471   1471   1472   Ljava/lang/NegativeArraySizeException;
        //  1465   1471   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1465   1471   1471   1472   Ljava/lang/IllegalStateException;
        //  1465   1471   1464   1465   Ljava/lang/NegativeArraySizeException;
        //  1479   1486   1486   1487   Any
        //  1480   1486   1486   1487   Any
        //  1480   1486   1486   1487   Ljava/lang/ArithmeticException;
        //  1479   1486   3      8      Ljava/lang/IllegalStateException;
        //  1479   1486   1479   1480   Ljava/lang/IllegalStateException;
        //  1608   1615   1615   1616   Any
        //  1608   1615   3      8      Any
        //  1609   1615   1608   1609   Ljava/lang/IllegalStateException;
        //  1609   1615   1615   1616   Ljava/lang/StringIndexOutOfBoundsException;
        //  1609   1615   1608   1609   Any
        //  1704   1711   1711   1712   Any
        //  1705   1711   1711   1712   Ljava/util/NoSuchElementException;
        //  1704   1711   3      8      Any
        //  1704   1711   1704   1705   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1705   1711   3      8      Any
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
    
    public int 2() {
        return fbS.ba(this, 1639539870);
    }
    
    @f06
    @LauncherEventHide
    public void 4() {
        fbS.dn(this, 816263116);
    }
    
    @NotNull
    public f0d 1() {
        return fbS.g0(this, 2110771877);
    }
    
    @NotNull
    public f0a 3() {
        return fbS.08(this, 2076060526);
    }
    
    public void c(final boolean b) {
        fbS.4j(this, 266746262, b);
    }
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f30 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1352
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1344
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1336
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f30.c:()Ldev/nuker/pyro/f2T;
        //    34: goto            38
        //    37: athrow         
        //    38: getstatic       dev/nuker/pyro/fc.c:I
        //    41: ifge            50
        //    44: ldc_w           -1877395633
        //    47: goto            53
        //    50: ldc_w           929363108
        //    53: ldc_w           1705909468
        //    56: ixor           
        //    57: lookupswitch {
        //          -172545133: 50
        //          1389029496: 84
        //          default: 1309
        //        }
        //    84: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    87: if_acmpne       1294
        //    90: getstatic       dev/nuker/pyro/fc.c:I
        //    93: ifge            102
        //    96: ldc_w           1899444659
        //    99: goto            105
        //   102: ldc_w           985570442
        //   105: ldc_w           1166688103
        //   108: ixor           
        //   109: lookupswitch {
        //          884803284: 102
        //          2134156269: 136
        //          default: 1311
        //        }
        //   136: aload_1        
        //   137: goto            141
        //   140: athrow         
        //   141: invokevirtual   dev/nuker/pyro/f30.0:()Z
        //   144: goto            148
        //   147: athrow         
        //   148: ifne            1294
        //   151: aload_1        
        //   152: getstatic       dev/nuker/pyro/fc.0:I
        //   155: ifeq            164
        //   158: ldc_w           1720450041
        //   161: goto            167
        //   164: ldc_w           -1968023722
        //   167: ldc_w           1484992009
        //   170: ixor           
        //   171: lookupswitch {
        //          -768509601: 196
        //          1040766448: 164
        //          default: 1321
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   203: goto            207
        //   206: athrow         
        //   207: instanceof      Lnet/minecraft/network/play/client/CPacketVehicleMove;
        //   210: ifeq            595
        //   213: getstatic       dev/nuker/pyro/fc.1:I
        //   216: ifeq            225
        //   219: ldc_w           -1593445476
        //   222: goto            228
        //   225: ldc_w           1768922648
        //   228: ldc_w           -2057915291
        //   231: ixor           
        //   232: lookupswitch {
        //          -331797891: 260
        //          609437689: 225
        //          default: 1319
        //        }
        //   260: aload_0        
        //   261: getfield        dev/nuker/pyro/f7i.0:Ldev/nuker/pyro/f0a;
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   271: goto            275
        //   274: athrow         
        //   275: checkcast       Ljava/lang/Boolean;
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   285: goto            289
        //   288: athrow         
        //   289: ifeq            1294
        //   292: aload_0        
        //   293: getstatic       dev/nuker/pyro/fc.c:I
        //   296: ifge            305
        //   299: ldc_w           1529392794
        //   302: goto            308
        //   305: ldc_w           -52420304
        //   308: ldc_w           143578179
        //   311: ixor           
        //   312: lookupswitch {
        //          1403419353: 1299
        //          1683732401: 305
        //          default: 340
        //        }
        //   340: getfield        dev/nuker/pyro/f7i.c:Z
        //   343: ifeq            352
        //   346: ldc_w           -1832932212
        //   349: goto            355
        //   352: ldc_w           -1832932211
        //   355: ldc_w           1631799028
        //   358: ixor           
        //   359: tableswitch {
        //          -403057424: 380
        //          -403057423: 1294
        //          default: 346
        //        }
        //   380: aload_1        
        //   381: goto            385
        //   384: athrow         
        //   385: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   388: goto            392
        //   391: athrow         
        //   392: dup            
        //   393: ifnonnull       402
        //   396: ldc_w           1800873537
        //   399: goto            405
        //   402: ldc_w           1800873550
        //   405: ldc_w           65284054
        //   408: ixor           
        //   409: tableswitch {
        //          -781843666: 432
        //          -781843665: 462
        //          default: 396
        //        }
        //   432: new             Lkotlin/TypeCastException;
        //   435: dup            
        //   436: ldc_w           "\u221e\u1486\u8b05\ub1c4\ucf2e\uec15\ub225\ue72a\udb77\uef12\ua6c2\u1e0c\ue002\uc7b3\u87da\u888e\u57a5\u76f2\ubf38\uc6e1\u2af6\uc234\u6ba9\u2f49\ud170\u347b\u7d66\u8844\u8215\u8a36\u855c\ufb72\u7122\u981e\u1d38\uf092\u493c\u898b\uc892\uf99e\ub766\u41fe\ub819\ub157\u4add\u8b06\u7c7b\ucfc0\u7f59\uec7b\ue766\u16d6\uefb7\u358b\u4010\ue003\u0a05\u873e\u1b8a\u09ff\u76e1\u728c\uc617\ub9e5\u9c73\u6be9\ue2ef\ud1d5\ua732\u2374\u8808\u4f82\u8aa5\u1618\ua57a\u7131\u55a3\u1d93\u63e8\u1732\u8981\u053f\uf926\u246d\u1fbd\ub831\u7cf7\u4a61\u1849"
        //   439: goto            443
        //   442: athrow         
        //   443: invokestatic    invokestatic   !!! ERROR
        //   446: goto            450
        //   449: athrow         
        //   450: goto            454
        //   453: athrow         
        //   454: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   457: goto            461
        //   460: athrow         
        //   461: athrow         
        //   462: checkcast       Lnet/minecraft/network/play/client/CPacketVehicleMove;
        //   465: astore_2       
        //   466: aload_0        
        //   467: iconst_0       
        //   468: getstatic       dev/nuker/pyro/fc.1:I
        //   471: ifeq            480
        //   474: ldc_w           1002595059
        //   477: goto            483
        //   480: ldc_w           1353749770
        //   483: ldc_w           -839250386
        //   486: ixor           
        //   487: lookupswitch {
        //          -1656055004: 512
        //          -164074275: 480
        //          default: 1307
        //        }
        //   512: putfield        dev/nuker/pyro/f7i.c:Z
        //   515: aload_1        
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   523: goto            527
        //   526: athrow         
        //   527: dup            
        //   528: ifnonnull       561
        //   531: new             Lkotlin/TypeCastException;
        //   534: dup            
        //   535: ldc_w           "\u221e\u1486\u8b05\ub1c4\ucf2e\uec15\ub225\ue72a\udb77\uef12\ua6c2\u1e0c\ue002\uc7b3\u87da\u888e\u57a5\u76f2\ubf38\uc6e1\u2af6\uc234\u6ba9\u2f49\ud170\u347b\u7d66\u8844\u8215\u8a36\u855c\ufb72\u7122\u981e\u1d38\uf092\u493c\u8981\uc892\uf99c\ub766\u41fd\ub805\ub152\u4add\u8b17\u7c27\ucfd1\u7f46\uec7d\ue727\u1696\uefbf\u3596\u401f\ue005\u0a19\u877b\u1be7\u09df\u76ec\u728e\uc605\ub9ae\u9c64\u6bd3\ue2e3\ud1d8\ua735\u2363\u884a\u4fa4\u8ab8\u1616\ua56f\u713f\u5587\u1d84\u63dd\u1732\u899a\u0525\uf92a\u2473"
        //   538: goto            542
        //   541: athrow         
        //   542: invokestatic    invokestatic   !!! ERROR
        //   545: goto            549
        //   548: athrow         
        //   549: goto            553
        //   552: athrow         
        //   553: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   556: goto            560
        //   559: athrow         
        //   560: athrow         
        //   561: checkcast       Ldev/nuker/pyro/mixin/CPacketVehicleMoveAccessor;
        //   564: aload_2        
        //   565: goto            569
        //   568: athrow         
        //   569: invokevirtual   net/minecraft/network/play/client/CPacketVehicleMove.func_187002_b:()D
        //   572: goto            576
        //   575: athrow         
        //   576: iconst_1       
        //   577: i2d            
        //   578: dsub           
        //   579: goto            583
        //   582: athrow         
        //   583: invokeinterface dev/nuker/pyro/mixin/CPacketVehicleMoveAccessor.setY:(D)V
        //   588: goto            592
        //   591: athrow         
        //   592: goto            1294
        //   595: getstatic       dev/nuker/pyro/fc.1:I
        //   598: ifeq            607
        //   601: ldc_w           1324119659
        //   604: goto            610
        //   607: ldc_w           -137121352
        //   610: ldc_w           736780714
        //   613: ixor           
        //   614: lookupswitch {
        //          -600190958: 640
        //          1694898113: 607
        //          default: 1315
        //        }
        //   640: aload_1        
        //   641: goto            645
        //   644: athrow         
        //   645: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   648: goto            652
        //   651: athrow         
        //   652: instanceof      Lnet/minecraft/network/play/client/CPacketSteerBoat;
        //   655: ifeq            718
        //   658: aload_1        
        //   659: getstatic       dev/nuker/pyro/fc.0:I
        //   662: ifeq            671
        //   665: ldc_w           136662274
        //   668: goto            674
        //   671: ldc_w           -2052035009
        //   674: ldc_w           839473940
        //   677: ixor           
        //   678: lookupswitch {
        //          -524784174: 671
        //          975967766: 1323
        //          default: 704
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokevirtual   dev/nuker/pyro/f30.c:()V
        //   711: goto            715
        //   714: athrow         
        //   715: goto            1294
        //   718: aload_1        
        //   719: goto            723
        //   722: athrow         
        //   723: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   726: goto            730
        //   729: athrow         
        //   730: instanceof      Lnet/minecraft/network/play/client/CPacketPlayer;
        //   733: ifeq            855
        //   736: aload_0        
        //   737: getstatic       dev/nuker/pyro/fc.1:I
        //   740: ifeq            749
        //   743: ldc_w           -613025262
        //   746: goto            752
        //   749: ldc_w           607742700
        //   752: ldc_w           202838841
        //   755: ixor           
        //   756: lookupswitch {
        //          -681383637: 749
        //          674134485: 784
        //          default: 1297
        //        }
        //   784: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   787: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   790: dup            
        //   791: pop            
        //   792: goto            796
        //   795: athrow         
        //   796: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //   799: goto            803
        //   802: athrow         
        //   803: ifeq            812
        //   806: ldc_w           1918146841
        //   809: goto            815
        //   812: ldc_w           1918146842
        //   815: ldc_w           -458837236
        //   818: ixor           
        //   819: tableswitch {
        //          769938474: 840
        //          769938475: 1294
        //          default: 806
        //        }
        //   840: aload_1        
        //   841: goto            845
        //   844: athrow         
        //   845: invokevirtual   dev/nuker/pyro/f30.c:()V
        //   848: goto            852
        //   851: athrow         
        //   852: goto            1294
        //   855: getstatic       dev/nuker/pyro/fc.c:I
        //   858: ifge            867
        //   861: ldc_w           1284240208
        //   864: goto            870
        //   867: ldc_w           -1341592041
        //   870: ldc_w           -26343110
        //   873: ixor           
        //   874: lookupswitch {
        //          -1293550998: 1317
        //          -770499451: 867
        //          default: 900
        //        }
        //   900: aload_1        
        //   901: goto            905
        //   904: athrow         
        //   905: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   908: goto            912
        //   911: athrow         
        //   912: instanceof      Lnet/minecraft/network/play/client/CPacketEntityAction;
        //   915: ifeq            1294
        //   918: getstatic       dev/nuker/pyro/fc.1:I
        //   921: ifeq            930
        //   924: ldc_w           -1922932621
        //   927: goto            933
        //   930: ldc_w           -1193220140
        //   933: ldc_w           -1175165997
        //   936: ixor           
        //   937: lookupswitch {
        //          18121735: 964
        //          882246560: 930
        //          default: 1305
        //        }
        //   964: aload_0        
        //   965: getfield        dev/nuker/pyro/f7i.c:Lnet/minecraft/client/Minecraft;
        //   968: getstatic       dev/nuker/pyro/fc.1:I
        //   971: ifeq            980
        //   974: ldc_w           1947304991
        //   977: goto            983
        //   980: ldc_w           -1245416799
        //   983: ldc_w           231444529
        //   986: ixor           
        //   987: lookupswitch {
        //          -912343052: 980
        //          2044335150: 1325
        //          default: 1012
        //        }
        //  1012: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1015: dup            
        //  1016: pop            
        //  1017: getstatic       dev/nuker/pyro/fc.c:I
        //  1020: ifge            1029
        //  1023: ldc_w           -230059519
        //  1026: goto            1032
        //  1029: ldc_w           -1456214499
        //  1032: ldc_w           1972597516
        //  1035: ixor           
        //  1036: lookupswitch {
        //          -2015698675: 1295
        //          -1085803066: 1029
        //          default: 1064
        //        }
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: ifeq            1294
        //  1078: aload_1        
        //  1079: getstatic       dev/nuker/pyro/fc.0:I
        //  1082: ifeq            1091
        //  1085: ldc_w           -1072778372
        //  1088: goto            1094
        //  1091: ldc_w           1496511267
        //  1094: ldc_w           -491927198
        //  1097: ixor           
        //  1098: lookupswitch {
        //          581138974: 1301
        //          1220415504: 1091
        //          default: 1124
        //        }
        //  1124: goto            1128
        //  1127: athrow         
        //  1128: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //  1131: goto            1135
        //  1134: athrow         
        //  1135: dup            
        //  1136: ifnonnull       1216
        //  1139: new             Lkotlin/TypeCastException;
        //  1142: dup            
        //  1143: ldc_w           "\u221e\u1486\u8b05\ub1c4\ucf2e\uec15\ub225\ue72a\udb77\uef12\ua6c2\u1e0c\ue002\uc7b3\u87da\u888e\u57a5\u76f2\ubf38\uc6e1\u2af6\uc234\u6ba9\u2f49\ud170\u347b\u7d66\u8844\u8215\u8a36\u855c\ufb72\u7122\u981e\u1d38\uf092\u493c\u898b\uc892\uf99e\ub766\u41fe\ub819\ub157\u4add\u8b06\u7c7b\ucfc0\u7f59\uec7b\ue766\u16d6\uefb7\u358b\u4010\ue003\u0a05\u873e\u1b8a\u09ff\u76e1\u728c\uc617\ub9e5\u9c73\u6be9\ue2ef\ud1d5\ua732\u2374\u8808\u4f82\u8aa5\u1618\ua57a\u7131\u55a3\u1d93\u63fb\u1739\u899d\u053f\uf931\u2478\u1f99\ub81f\u7cec\u4a7e\u1843\u222c"
        //  1146: goto            1150
        //  1149: athrow         
        //  1150: invokestatic    invokestatic   !!! ERROR
        //  1153: goto            1157
        //  1156: athrow         
        //  1157: getstatic       dev/nuker/pyro/fc.0:I
        //  1160: ifeq            1169
        //  1163: ldc_w           -571202439
        //  1166: goto            1172
        //  1169: ldc_w           -981250983
        //  1172: ldc_w           -16826500
        //  1175: ixor           
        //  1176: lookupswitch {
        //          587930373: 1169
        //          998011685: 1204
        //          default: 1313
        //        }
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: athrow         
        //  1216: checkcast       Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: invokevirtual   net/minecraft/network/play/client/CPacketEntityAction.func_180764_b:()Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1226: goto            1230
        //  1229: athrow         
        //  1230: getstatic       dev/nuker/pyro/fc.c:I
        //  1233: ifge            1242
        //  1236: ldc_w           998712853
        //  1239: goto            1245
        //  1242: ldc_w           1545813917
        //  1245: ldc_w           -1659896780
        //  1248: ixor           
        //  1249: lookupswitch {
        //          -1500980703: 1303
        //          -786424210: 1242
        //          default: 1276
        //        }
        //  1276: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.OPEN_INVENTORY:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1279: if_acmpeq       1294
        //  1282: aload_1        
        //  1283: goto            1287
        //  1286: athrow         
        //  1287: invokevirtual   dev/nuker/pyro/f30.c:()V
        //  1290: goto            1294
        //  1293: athrow         
        //  1294: return         
        //  1295: aconst_null    
        //  1296: athrow         
        //  1297: aconst_null    
        //  1298: athrow         
        //  1299: aconst_null    
        //  1300: athrow         
        //  1301: aconst_null    
        //  1302: athrow         
        //  1303: aconst_null    
        //  1304: athrow         
        //  1305: aconst_null    
        //  1306: athrow         
        //  1307: aconst_null    
        //  1308: athrow         
        //  1309: aconst_null    
        //  1310: athrow         
        //  1311: aconst_null    
        //  1312: athrow         
        //  1313: aconst_null    
        //  1314: athrow         
        //  1315: aconst_null    
        //  1316: athrow         
        //  1317: aconst_null    
        //  1318: athrow         
        //  1319: aconst_null    
        //  1320: athrow         
        //  1321: aconst_null    
        //  1322: athrow         
        //  1323: aconst_null    
        //  1324: athrow         
        //  1325: aconst_null    
        //  1326: athrow         
        //  1327: pop            
        //  1328: goto            24
        //  1331: pop            
        //  1332: aconst_null    
        //  1333: goto            1327
        //  1336: dup            
        //  1337: ifnull          1327
        //  1340: checkcast       Ljava/lang/Throwable;
        //  1343: athrow         
        //  1344: dup            
        //  1345: ifnull          1331
        //  1348: checkcast       Ljava/lang/Throwable;
        //  1351: athrow         
        //  1352: aconst_null    
        //  1353: athrow         
        //    StackMapTable: 00 BF 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 01 34 45 07 00 1E 40 07 01 34 45 07 00 36 40 07 00 45 4B 07 00 45 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 00 45 01 5E 07 00 45 11 42 01 1E FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 34 45 07 00 36 40 01 4F 07 01 34 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 01 34 01 5C 07 01 34 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 34 45 07 00 36 40 07 01 0A 11 42 01 1F 46 07 00 22 40 07 01 49 45 07 00 36 40 07 01 A2 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 4E 45 07 00 36 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 00 03 01 5F 07 00 03 05 05 42 01 18 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 34 45 07 00 36 40 07 01 0A 43 07 01 0A 45 07 01 0A FF 00 02 00 02 07 00 03 07 01 34 00 02 07 01 0A 01 5A 07 01 0A 49 07 00 1A FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 01 B0 08 01 B0 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 01 B0 08 01 B0 07 01 0C 42 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 01 B0 08 01 B0 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 02 07 01 0A 07 00 B1 40 07 01 0A FF 00 11 00 03 07 00 03 07 01 34 07 01 42 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 07 01 34 07 01 42 00 03 07 00 03 01 01 FF 00 1C 00 03 07 00 03 07 01 34 07 01 42 00 02 07 00 03 01 46 07 00 22 40 07 01 34 45 07 00 36 40 07 01 0A FF 00 0D 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 04 07 01 0A 08 02 13 08 02 13 07 01 0C 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 04 07 01 0A 08 02 13 08 02 13 07 01 0C 42 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 04 07 01 0A 08 02 13 08 02 13 07 01 0C 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 02 07 01 0A 07 00 B1 40 07 01 0A 46 07 00 22 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 02 07 01 65 07 01 42 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 02 07 01 65 03 FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 01 34 07 01 42 00 02 07 01 65 03 47 07 00 36 00 FA 00 02 0B 42 01 1D 43 07 00 36 40 07 01 34 45 07 00 36 40 07 01 0A 52 07 01 34 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 01 34 01 5D 07 01 34 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 34 45 07 00 36 00 02 43 07 00 22 40 07 01 34 45 07 00 36 40 07 01 0A 52 07 00 03 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 00 03 01 5F 07 00 03 FF 00 0A 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 00 5E 45 07 00 36 40 01 02 05 42 01 18 43 07 00 16 40 07 01 34 45 07 00 36 00 02 0B 42 01 1D 43 07 00 36 40 07 01 34 45 07 00 36 40 07 01 0A 11 42 01 1E 4F 07 00 55 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 00 55 01 5C 07 00 55 50 07 00 5E FF 00 02 00 02 07 00 03 07 01 34 00 02 07 00 5E 01 5F 07 00 5E 42 07 00 36 40 07 00 5E 45 07 00 36 40 01 4F 07 01 34 FF 00 02 00 02 07 00 03 07 01 34 00 02 07 01 34 01 5D 07 01 34 42 07 00 36 40 07 01 34 45 07 00 36 40 07 01 0A 4D 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C FF 00 0B 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C FF 00 02 00 02 07 00 03 07 01 34 00 05 07 01 0A 08 04 73 08 04 73 07 01 0C 01 FF 00 1F 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C 42 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 02 07 01 0A 07 00 B1 40 07 01 0A 45 07 00 36 40 07 01 82 45 07 00 36 40 07 01 9C 4B 07 01 9C FF 00 02 00 02 07 00 03 07 01 34 00 02 07 01 9C 01 5E 07 01 9C FF 00 09 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 34 00 01 07 01 34 45 07 00 36 00 40 07 00 5E 41 07 00 03 41 07 00 03 41 07 01 34 41 07 01 9C 01 FF 00 01 00 03 07 00 03 07 01 34 07 01 42 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 01 34 00 01 07 00 45 01 FF 00 01 00 02 07 00 03 07 01 34 00 04 07 01 0A 08 04 73 08 04 73 07 01 0C 01 01 01 41 07 01 34 41 07 01 34 41 07 00 55 41 07 00 22 43 05 44 07 00 22 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1336   1344   Ljava/util/ConcurrentModificationException;
        //  1336   1344   1336   1344   Ljava/lang/IllegalArgumentException;
        //  1352   1354   3      8      Any
        //  30     37     37     38     Any
        //  30     37     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  31     37     37     38     Ljava/lang/RuntimeException;
        //  30     37     3      8      Any
        //  30     37     30     31     Ljava/util/ConcurrentModificationException;
        //  141    147    147    148    Any
        //  141    147    147    148    Ljava/lang/NegativeArraySizeException;
        //  141    147    3      8      Any
        //  141    147    147    148    Ljava/lang/IllegalStateException;
        //  141    147    147    148    Ljava/lang/RuntimeException;
        //  200    206    206    207    Any
        //  200    206    3      8      Any
        //  200    206    3      8      Any
        //  200    206    206    207    Ljava/lang/AssertionError;
        //  200    206    206    207    Any
        //  267    274    274    275    Any
        //  268    274    3      8      Any
        //  268    274    267    268    Ljava/lang/ClassCastException;
        //  268    274    274    275    Any
        //  268    274    267    268    Ljava/lang/ArithmeticException;
        //  282    288    288    289    Any
        //  282    288    288    289    Ljava/lang/ClassCastException;
        //  282    288    3      8      Ljava/util/ConcurrentModificationException;
        //  282    288    3      8      Ljava/lang/UnsupportedOperationException;
        //  282    288    3      8      Ljava/lang/NullPointerException;
        //  385    391    391    392    Any
        //  385    391    3      8      Ljava/lang/IllegalStateException;
        //  385    391    391    392    Ljava/lang/UnsupportedOperationException;
        //  385    391    3      8      Any
        //  385    391    3      8      Any
        //  442    449    449    450    Any
        //  442    449    442    443    Ljava/lang/NullPointerException;
        //  442    449    449    450    Any
        //  442    449    3      8      Any
        //  443    449    449    450    Ljava/lang/NullPointerException;
        //  453    460    460    461    Any
        //  453    460    3      8      Any
        //  454    460    453    454    Ljava/lang/NullPointerException;
        //  454    460    453    454    Any
        //  453    460    453    454    Ljava/lang/IndexOutOfBoundsException;
        //  519    526    526    527    Any
        //  520    526    519    520    Ljava/lang/ArithmeticException;
        //  519    526    3      8      Any
        //  519    526    519    520    Ljava/lang/IllegalArgumentException;
        //  520    526    526    527    Any
        //  542    548    548    549    Any
        //  542    548    3      8      Any
        //  542    548    548    549    Ljava/util/NoSuchElementException;
        //  542    548    548    549    Any
        //  542    548    548    549    Ljava/lang/UnsupportedOperationException;
        //  552    559    559    560    Any
        //  553    559    552    553    Any
        //  552    559    3      8      Ljava/lang/ClassCastException;
        //  553    559    3      8      Any
        //  553    559    559    560    Any
        //  568    575    575    576    Any
        //  568    575    568    569    Ljava/lang/IllegalArgumentException;
        //  569    575    3      8      Any
        //  569    575    568    569    Ljava/lang/StringIndexOutOfBoundsException;
        //  569    575    568    569    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  583    591    591    592    Any
        //  583    591    3      8      Any
        //  583    591    3      8      Any
        //  583    591    591    592    Any
        //  583    591    591    592    Ljava/lang/NumberFormatException;
        //  644    651    651    652    Any
        //  645    651    3      8      Any
        //  645    651    3      8      Any
        //  645    651    644    645    Any
        //  644    651    644    645    Any
        //  708    714    714    715    Any
        //  708    714    714    715    Any
        //  708    714    3      8      Ljava/lang/IllegalArgumentException;
        //  708    714    3      8      Any
        //  708    714    3      8      Any
        //  722    729    729    730    Any
        //  723    729    729    730    Any
        //  723    729    722    723    Ljava/util/ConcurrentModificationException;
        //  723    729    722    723    Ljava/lang/RuntimeException;
        //  722    729    722    723    Ljava/lang/NullPointerException;
        //  796    802    802    803    Any
        //  796    802    802    803    Ljava/lang/NullPointerException;
        //  796    802    802    803    Ljava/lang/IndexOutOfBoundsException;
        //  796    802    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  796    802    3      8      Ljava/util/ConcurrentModificationException;
        //  844    851    851    852    Any
        //  845    851    844    845    Ljava/lang/ArithmeticException;
        //  845    851    851    852    Any
        //  844    851    851    852    Any
        //  844    851    851    852    Ljava/util/NoSuchElementException;
        //  904    911    911    912    Any
        //  905    911    911    912    Any
        //  904    911    904    905    Ljava/lang/IllegalStateException;
        //  905    911    904    905    Any
        //  904    911    911    912    Ljava/lang/NegativeArraySizeException;
        //  1067   1074   1074   1075   Any
        //  1067   1074   1067   1068   Ljava/lang/IllegalStateException;
        //  1067   1074   1074   1075   Ljava/lang/UnsupportedOperationException;
        //  1067   1074   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1068   1074   1067   1068   Any
        //  1127   1134   1134   1135   Any
        //  1128   1134   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1127   1134   3      8      Ljava/lang/UnsupportedOperationException;
        //  1128   1134   1134   1135   Any
        //  1127   1134   1127   1128   Any
        //  1149   1156   1156   1157   Any
        //  1149   1156   1149   1150   Any
        //  1149   1156   3      8      Any
        //  1150   1156   3      8      Any
        //  1150   1156   1156   1157   Ljava/lang/RuntimeException;
        //  1207   1214   1214   1215   Any
        //  1207   1214   1214   1215   Any
        //  1208   1214   1207   1208   Any
        //  1208   1214   1214   1215   Ljava/lang/NullPointerException;
        //  1208   1214   3      8      Ljava/lang/UnsupportedOperationException;
        //  1222   1229   1229   1230   Any
        //  1222   1229   3      8      Any
        //  1222   1229   3      8      Any
        //  1223   1229   1222   1223   Any
        //  1222   1229   1229   1230   Any
        //  1287   1293   1293   1294   Any
        //  1287   1293   3      8      Any
        //  1287   1293   3      8      Ljava/lang/IllegalArgumentException;
        //  1287   1293   3      8      Ljava/lang/ArithmeticException;
        //  1287   1293   3      8      Ljava/lang/NegativeArraySizeException;
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
    
    public boolean 0() {
        return fbS.er(this, 1222642036);
    }
    
    @NotNull
    public f0a c() {
        return fbS.0E(this, 13874334);
    }
    
    public f7i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2212\u149c\u8b08\ub3cd\uc979\uec1a\ub23d"
        //     4: getstatic       dev/nuker/pyro/fc.c:I
        //     7: ifge            16
        //    10: ldc_w           1684915765
        //    13: goto            19
        //    16: ldc_w           -1901338200
        //    19: ldc_w           -73968813
        //    22: ixor           
        //    23: lookupswitch {
        //          -1610967706: 16
        //          1966912251: 48
        //          default: 416
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u2232\u149c\u8b08\ub3cd\uc959\uec1a\ub23d"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: ldc_w           "\u2231\u149f\u8b05\ub3d6\uc968\uec05\ub264\ue73d\ud967\ue919\ua696\u1e58\ue00f\uc5e7\u818d\u8881\u57bd\u76a1\ubd2a\uc0b9\u2af6\uc233\u6ba9\u2d54\ud761\u3474\u7d3f\u8859"
        //    60: invokestatic    invokestatic   !!! ERROR
        //    63: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    66: aload_0        
        //    67: aload_0        
        //    68: new             Ldev/nuker/pyro/f0d;
        //    71: dup            
        //    72: ldc_w           "\u2203\u1483\u8b0c\ub3dc\uc97b"
        //    75: invokestatic    invokestatic   !!! ERROR
        //    78: ldc_w           "\u2223\u1483\u8b0c\ub3dc\uc97b"
        //    81: invokestatic    invokestatic   !!! ERROR
        //    84: aconst_null    
        //    85: dconst_1       
        //    86: ldc2_w          0.1
        //    89: ldc2_w          10.0
        //    92: dconst_0       
        //    93: bipush          64
        //    95: aconst_null    
        //    96: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    99: checkcast       Ldev/nuker/pyro/f0n;
        //   102: invokevirtual   dev/nuker/pyro/f7i.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   105: checkcast       Ldev/nuker/pyro/f0d;
        //   108: putfield        dev/nuker/pyro/f7i.c:Ldev/nuker/pyro/f0d;
        //   111: aload_0        
        //   112: aload_0        
        //   113: new             Ldev/nuker/pyro/f0a;
        //   116: dup            
        //   117: ldc_w           "\u221e\u1490\u8b19"
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: ldc_w           "\u223e\u14b0\u8b39"
        //   126: getstatic       dev/nuker/pyro/fc.1:I
        //   129: ifeq            138
        //   132: ldc_w           -1125325809
        //   135: goto            141
        //   138: ldc_w           -333062718
        //   141: ldc_w           1862948596
        //   144: ixor           
        //   145: lookupswitch {
        //          -2094036170: 172
        //          -739855621: 138
        //          default: 422
        //        }
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: aconst_null    
        //   176: iconst_1       
        //   177: getstatic       dev/nuker/pyro/fc.0:I
        //   180: ifeq            189
        //   183: ldc_w           1443809391
        //   186: goto            192
        //   189: ldc_w           983203036
        //   192: ldc_w           -1256394356
        //   195: ixor           
        //   196: lookupswitch {
        //          -1887007408: 224
        //          -485344797: 189
        //          default: 414
        //        }
        //   224: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   227: checkcast       Ldev/nuker/pyro/f0n;
        //   230: invokevirtual   dev/nuker/pyro/f7i.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   233: checkcast       Ldev/nuker/pyro/f0a;
        //   236: putfield        dev/nuker/pyro/f7i.c:Ldev/nuker/pyro/f0a;
        //   239: aload_0        
        //   240: getstatic       dev/nuker/pyro/fc.1:I
        //   243: ifeq            252
        //   246: ldc_w           -263296479
        //   249: goto            255
        //   252: ldc_w           -1501370443
        //   255: ldc_w           -1630143819
        //   258: ixor           
        //   259: lookupswitch {
        //          945233152: 284
        //          1855688852: 252
        //          default: 420
        //        }
        //   284: aload_0        
        //   285: new             Ldev/nuker/pyro/f0a;
        //   288: dup            
        //   289: ldc_w           "\u2211\u149d\u8b1d\ub3d0\uc954\uec1f\ub227\ue72f"
        //   292: invokestatic    invokestatic   !!! ERROR
        //   295: ldc_w           "\u2231\u149d\u8b1d\ub3d0\uc954\uec1f\ub227\ue72f"
        //   298: getstatic       dev/nuker/pyro/fc.1:I
        //   301: ifeq            310
        //   304: ldc_w           219587696
        //   307: goto            313
        //   310: ldc_w           -1206637360
        //   313: ldc_w           -420084868
        //   316: ixor           
        //   317: lookupswitch {
        //          -337598708: 418
        //          -308391651: 310
        //          default: 344
        //        }
        //   344: invokestatic    invokestatic   !!! ERROR
        //   347: aconst_null    
        //   348: iconst_1       
        //   349: getstatic       dev/nuker/pyro/fc.1:I
        //   352: ifeq            361
        //   355: ldc_w           -2094361093
        //   358: goto            364
        //   361: ldc_w           -766020385
        //   364: ldc_w           -227520816
        //   367: ixor           
        //   368: lookupswitch {
        //          539441679: 396
        //          1901779755: 361
        //          default: 412
        //        }
        //   396: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   399: checkcast       Ldev/nuker/pyro/f0n;
        //   402: invokevirtual   dev/nuker/pyro/f7i.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   405: checkcast       Ldev/nuker/pyro/f0a;
        //   408: putfield        dev/nuker/pyro/f7i.0:Ldev/nuker/pyro/f0a;
        //   411: return         
        //   412: aconst_null    
        //   413: athrow         
        //   414: aconst_null    
        //   415: athrow         
        //   416: aconst_null    
        //   417: athrow         
        //   418: aconst_null    
        //   419: athrow         
        //   420: aconst_null    
        //   421: athrow         
        //   422: aconst_null    
        //   423: athrow         
        //    StackMapTable: 00 18 FF 00 10 00 01 06 00 02 06 07 01 0C FF 00 02 00 01 06 00 03 06 07 01 0C 01 FF 00 1C 00 01 06 00 02 06 07 01 0C FF 00 59 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C 05 01 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C 05 01 5B 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 19 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 05 01 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 05 01 FF 00 0F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C 05 01 FF 00 01 00 01 06 00 02 06 07 01 0C FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 1D 08 01 1D 07 01 0C 07 01 0C 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 71 08 00 71 07 01 0C 07 01 0C
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
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
    
    public void 3(final int n) {
        fbS.6k(this, 1189881520, n);
    }
}
