// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f57 extends fH
{
    public f0a c;
    public f0d c;
    public f0d 0;
    public f0g c;
    public f0a 0;
    public fbu c;
    public int 1;
    public boolean c;
    public boolean 0;
    public double c;
    public double 0;
    public double 1;
    
    @f06(3)
    @LauncherEventHide
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          5383
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            5375
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            5367
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             973817272
        //    33: goto            38
        //    36: ldc             1869881859
        //    38: ldc             -1795921830
        //    40: ixor           
        //    41: lookupswitch {
        //          -1359008286: 5232
        //          -130277409: 36
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //    75: goto            79
        //    78: athrow         
        //    79: ifeq            83
        //    82: return         
        //    83: aload_1        
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    91: goto            95
        //    94: athrow         
        //    95: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    98: if_acmpne       106
        //   101: ldc             785570649
        //   103: goto            108
        //   106: ldc             785570648
        //   108: ldc             -792400365
        //   110: ixor           
        //   111: tableswitch {
        //          -64197996: 132
        //          -64197995: 4294
        //          default: 101
        //        }
        //   132: aload_0        
        //   133: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fbu;
        //   136: aload_0        
        //   137: getfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0d;
        //   140: getstatic       dev/nuker/pyro/fc.1:I
        //   143: ifeq            151
        //   146: ldc             225977767
        //   148: goto            153
        //   151: ldc             -403916294
        //   153: ldc             81770200
        //   155: ixor           
        //   156: lookupswitch {
        //          -483193054: 184
        //          161977215: 151
        //          default: 5304
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   191: goto            195
        //   194: athrow         
        //   195: checkcast       Ljava/lang/Double;
        //   198: goto            202
        //   201: athrow         
        //   202: invokevirtual   java/lang/Double.doubleValue:()D
        //   205: goto            209
        //   208: athrow         
        //   209: ldc2_w          1000.0
        //   212: dmul           
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   220: goto            224
        //   223: athrow         
        //   224: istore_2       
        //   225: aload_0        
        //   226: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0a;
        //   229: getstatic       dev/nuker/pyro/fc.0:I
        //   232: ifeq            240
        //   235: ldc             -1696054754
        //   237: goto            242
        //   240: ldc             -439859744
        //   242: ldc             -1241873070
        //   244: ixor           
        //   245: lookupswitch {
        //          -1808026216: 240
        //          789759820: 5260
        //          default: 272
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   279: goto            283
        //   282: athrow         
        //   283: checkcast       Ljava/lang/Boolean;
        //   286: goto            290
        //   289: athrow         
        //   290: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   293: goto            297
        //   296: athrow         
        //   297: ifeq            315
        //   300: aload_0        
        //   301: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   304: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   307: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   310: ifne            315
        //   313: iconst_0       
        //   314: istore_2       
        //   315: aload_0        
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   dev/nuker/pyro/f57.c:()I
        //   323: goto            327
        //   326: athrow         
        //   327: getstatic       dev/nuker/pyro/fc.1:I
        //   330: ifeq            338
        //   333: ldc             543474079
        //   335: goto            340
        //   338: ldc             1951517251
        //   340: ldc             1073359751
        //   342: ixor           
        //   343: lookupswitch {
        //          -1861444505: 338
        //          530508312: 5274
        //          default: 368
        //        }
        //   368: istore_3       
        //   369: iload_3        
        //   370: iconst_m1      
        //   371: if_icmpeq       3750
        //   374: aload_0        
        //   375: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   378: getstatic       dev/nuker/pyro/fc.1:I
        //   381: ifeq            389
        //   384: ldc             -1581748519
        //   386: goto            391
        //   389: ldc             1507283142
        //   391: ldc             1628455202
        //   393: ixor           
        //   394: lookupswitch {
        //          -1062719493: 5216
        //          264451475: 389
        //          default: 420
        //        }
        //   420: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   423: goto            427
        //   426: athrow         
        //   427: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //   430: goto            434
        //   433: athrow         
        //   434: f2d            
        //   435: aload_0        
        //   436: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0d;
        //   439: goto            443
        //   442: athrow         
        //   443: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   446: goto            450
        //   449: athrow         
        //   450: checkcast       Ljava/lang/Double;
        //   453: goto            457
        //   456: athrow         
        //   457: invokevirtual   java/lang/Double.doubleValue:()D
        //   460: goto            464
        //   463: athrow         
        //   464: dcmpg          
        //   465: ifgt            3750
        //   468: iload_2        
        //   469: ifeq            3750
        //   472: aload_0        
        //   473: getstatic       dev/nuker/pyro/fc.c:I
        //   476: ifge            484
        //   479: ldc             2080327739
        //   481: goto            486
        //   484: ldc             1286548488
        //   486: ldc             205068879
        //   488: ixor           
        //   489: lookupswitch {
        //          1066873188: 484
        //          2009485940: 5214
        //          default: 516
        //        }
        //   516: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   519: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   522: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //   525: ifeq            533
        //   528: ldc             1193378115
        //   530: goto            535
        //   533: ldc             1193378112
        //   535: ldc             -113229094
        //   537: ixor           
        //   538: tableswitch {
        //          2093188914: 560
        //          2093188915: 3515
        //          default: 528
        //        }
        //   560: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7Y;
        //   563: getstatic       dev/nuker/pyro/fc.c:I
        //   566: ifge            574
        //   569: ldc             775848048
        //   571: goto            576
        //   574: ldc             1931933583
        //   576: ldc             898521260
        //   578: ixor           
        //   579: lookupswitch {
        //          464574684: 574
        //          1185460003: 604
        //          default: 5298
        //        }
        //   604: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/fw;
        //   607: goto            611
        //   610: athrow         
        //   611: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   614: goto            618
        //   617: athrow         
        //   618: checkcast       Ljava/lang/Boolean;
        //   621: getstatic       dev/nuker/pyro/fc.1:I
        //   624: ifeq            632
        //   627: ldc             706067944
        //   629: goto            634
        //   632: ldc             -937292064
        //   634: ldc             178104727
        //   636: ixor           
        //   637: lookupswitch {
        //          -1027627145: 664
        //          545789055: 632
        //          default: 5328
        //        }
        //   664: goto            668
        //   667: athrow         
        //   668: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   671: goto            675
        //   674: athrow         
        //   675: ifne            3515
        //   678: aload_0        
        //   679: iconst_1       
        //   680: getstatic       dev/nuker/pyro/fc.c:I
        //   683: ifge            691
        //   686: ldc             -526798227
        //   688: goto            693
        //   691: ldc             102913685
        //   693: ldc             1693790400
        //   695: ixor           
        //   696: lookupswitch {
        //          -2073263443: 691
        //          1658283605: 724
        //          default: 5256
        //        }
        //   724: putfield        dev/nuker/pyro/f57.0:Z
        //   727: aload_0        
        //   728: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fbu;
        //   731: getstatic       dev/nuker/pyro/fc.1:I
        //   734: ifeq            742
        //   737: ldc             328633788
        //   739: goto            744
        //   742: ldc             1481683452
        //   744: ldc             -944471093
        //   746: ixor           
        //   747: lookupswitch {
        //          -735965577: 5250
        //          1290047561: 742
        //          default: 772
        //        }
        //   772: goto            776
        //   775: athrow         
        //   776: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   779: goto            783
        //   782: athrow         
        //   783: getstatic       dev/nuker/pyro/fc.c:I
        //   786: ifge            794
        //   789: ldc             2009217466
        //   791: goto            796
        //   794: ldc             564245673
        //   796: ldc             614450536
        //   798: ixor           
        //   799: lookupswitch {
        //          87978433: 824
        //          1398668498: 794
        //          default: 5224
        //        }
        //   824: aload_0        
        //   825: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   828: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   831: getstatic       dev/nuker/pyro/fc.c:I
        //   834: ifge            842
        //   837: ldc             2008502394
        //   839: goto            844
        //   842: ldc             445021796
        //   844: ldc             -1156697030
        //   846: ixor           
        //   847: lookupswitch {
        //          -1584903586: 872
        //          -860265408: 842
        //          default: 5212
        //        }
        //   872: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   875: new             Lnet/minecraft/network/play/client/CPacketPlayer$PositionRotation;
        //   878: dup            
        //   879: aload_0        
        //   880: getstatic       dev/nuker/pyro/fc.c:I
        //   883: ifge            891
        //   886: ldc             1284227264
        //   888: goto            893
        //   891: ldc             1055484081
        //   893: ldc             -1672430839
        //   895: ixor           
        //   896: lookupswitch {
        //          -1959422196: 891
        //          -790922295: 5280
        //          default: 924
        //        }
        //   924: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   927: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   930: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   933: aload_0        
        //   934: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   937: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   940: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   943: getstatic       dev/nuker/pyro/fc.c:I
        //   946: ifge            954
        //   949: ldc             -344129754
        //   951: goto            956
        //   954: ldc             -923769003
        //   956: ldc             -371392492
        //   958: ixor           
        //   959: lookupswitch {
        //          -1511603049: 954
        //          44171058: 5292
        //          default: 984
        //        }
        //   984: aload_0        
        //   985: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   988: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   991: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   994: aload_0        
        //   995: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //   998: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1001: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //  1004: ldc             -90.0
        //  1006: iconst_1       
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokespecial   net/minecraft/network/play/client/CPacketPlayer$PositionRotation.<init>:(DDDFFZ)V
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: getstatic       dev/nuker/pyro/fc.c:I
        //  1021: ifge            1029
        //  1024: ldc             573476804
        //  1026: goto            1031
        //  1029: ldc             583549990
        //  1031: ldc             -998329957
        //  1033: ixor           
        //  1034: lookupswitch {
        //          -430948769: 1029
        //          -424217155: 1060
        //          default: 5244
        //        }
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: aload_0        
        //  1072: getstatic       dev/nuker/pyro/fc.c:I
        //  1075: ifge            1083
        //  1078: ldc             1558744073
        //  1080: goto            1085
        //  1083: ldc             826577963
        //  1085: ldc             -797589203
        //  1087: ixor           
        //  1088: lookupswitch {
        //          -1935848156: 1083
        //          -516860666: 1116
        //          default: 5330
        //        }
        //  1116: iload_3        
        //  1117: aload_0        
        //  1118: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: checkcast       Ljava/lang/Integer;
        //  1135: goto            1139
        //  1138: athrow         
        //  1139: invokevirtual   java/lang/Integer.intValue:()I
        //  1142: goto            1146
        //  1145: athrow         
        //  1146: goto            1150
        //  1149: athrow         
        //  1150: invokevirtual   dev/nuker/pyro/f57.c:(II)V
        //  1153: goto            1157
        //  1156: athrow         
        //  1157: aload_0        
        //  1158: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1161: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1164: getstatic       dev/nuker/pyro/fc.c:I
        //  1167: ifge            1175
        //  1170: ldc             -1900580880
        //  1172: goto            1177
        //  1175: ldc             -1583743667
        //  1177: ldc             -2130957792
        //  1179: ixor           
        //  1180: lookupswitch {
        //          239814096: 5206
        //          615230891: 1175
        //          default: 1208
        //        }
        //  1208: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1211: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //  1214: dup            
        //  1215: aload_0        
        //  1216: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //  1219: getstatic       dev/nuker/pyro/fc.1:I
        //  1222: ifeq            1231
        //  1225: ldc_w           -176102767
        //  1228: goto            1234
        //  1231: ldc_w           587617079
        //  1234: ldc_w           -898335876
        //  1237: ixor           
        //  1238: lookupswitch {
        //          -1256116258: 1231
        //          1072994797: 5282
        //          default: 1264
        //        }
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  1271: goto            1275
        //  1274: athrow         
        //  1275: checkcast       Ljava/lang/Integer;
        //  1278: goto            1282
        //  1281: athrow         
        //  1282: invokevirtual   java/lang/Integer.intValue:()I
        //  1285: goto            1289
        //  1288: athrow         
        //  1289: getstatic       dev/nuker/pyro/fc.0:I
        //  1292: ifeq            1301
        //  1295: ldc_w           -1255217553
        //  1298: goto            1304
        //  1301: ldc_w           450098957
        //  1304: ldc_w           1493647887
        //  1307: ixor           
        //  1308: lookupswitch {
        //          -332815264: 1301
        //          1138013442: 1336
        //          default: 5284
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: goto            1351
        //  1350: athrow         
        //  1351: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1354: goto            1358
        //  1357: athrow         
        //  1358: aload_0        
        //  1359: getfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0a;
        //  1362: getstatic       dev/nuker/pyro/fc.0:I
        //  1365: ifeq            1374
        //  1368: ldc_w           -918003953
        //  1371: goto            1377
        //  1374: ldc_w           -215171343
        //  1377: ldc_w           2065436590
        //  1380: ixor           
        //  1381: lookupswitch {
        //          -1303097183: 5246
        //          816589730: 1374
        //          default: 1408
        //        }
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1415: goto            1419
        //  1418: athrow         
        //  1419: checkcast       Ljava/lang/Boolean;
        //  1422: goto            1426
        //  1425: athrow         
        //  1426: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1429: goto            1433
        //  1432: athrow         
        //  1433: ifeq            1523
        //  1436: aload_0        
        //  1437: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1440: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1443: getstatic       dev/nuker/pyro/fc.1:I
        //  1446: ifeq            1455
        //  1449: ldc_w           987795843
        //  1452: goto            1458
        //  1455: ldc_w           1452975635
        //  1458: ldc_w           79760674
        //  1461: ixor           
        //  1462: lookupswitch {
        //          1042390177: 5290
        //          1172830558: 1455
        //          default: 1488
        //        }
        //  1488: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1491: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //  1494: dup            
        //  1495: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: goto            1513
        //  1512: athrow         
        //  1513: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: goto            1652
        //  1523: getstatic       dev/nuker/pyro/fc.c:I
        //  1526: ifge            1535
        //  1529: ldc_w           2013437074
        //  1532: goto            1538
        //  1535: ldc_w           984989050
        //  1538: ldc_w           248034216
        //  1541: ixor           
        //  1542: lookupswitch {
        //          1238579347: 1535
        //          1992961850: 5352
        //          default: 1568
        //        }
        //  1568: aload_0        
        //  1569: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1572: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1575: getstatic       dev/nuker/pyro/fc.c:I
        //  1578: ifge            1587
        //  1581: ldc_w           -1259669238
        //  1584: goto            1590
        //  1587: ldc_w           2020831961
        //  1590: ldc_w           -1577279311
        //  1593: ixor           
        //  1594: lookupswitch {
        //          -644885912: 1620
        //          353786299: 1587
        //          default: 5204
        //        }
        //  1620: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1623: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //  1626: dup            
        //  1627: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  1630: goto            1634
        //  1633: athrow         
        //  1634: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  1637: goto            1641
        //  1640: athrow         
        //  1641: goto            1645
        //  1644: athrow         
        //  1645: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: aload_0        
        //  1653: getstatic       dev/nuker/pyro/fc.1:I
        //  1656: ifeq            1665
        //  1659: ldc_w           -2053197111
        //  1662: goto            1668
        //  1665: ldc_w           309626293
        //  1668: ldc_w           -1269681878
        //  1671: ixor           
        //  1672: lookupswitch {
        //          -1507412833: 1700
        //          835486691: 1665
        //          default: 5220
        //        }
        //  1700: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1703: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1706: getstatic       dev/nuker/pyro/fc.0:I
        //  1709: ifeq            1718
        //  1712: ldc_w           -1807511432
        //  1715: goto            1721
        //  1718: ldc_w           17052424
        //  1721: ldc_w           1605450705
        //  1724: ixor           
        //  1725: lookupswitch {
        //          -873288791: 5354
        //          -800682345: 1718
        //          default: 1752
        //        }
        //  1752: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1755: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //  1758: dup            
        //  1759: aload_0        
        //  1760: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1763: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1766: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1769: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1772: goto            1776
        //  1775: athrow         
        //  1776: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //  1779: goto            1783
        //  1782: athrow         
        //  1783: goto            1787
        //  1786: athrow         
        //  1787: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1790: goto            1794
        //  1793: athrow         
        //  1794: aload_0        
        //  1795: getstatic       dev/nuker/pyro/fc.0:I
        //  1798: ifeq            1807
        //  1801: ldc_w           1482527835
        //  1804: goto            1810
        //  1807: ldc_w           -1179841392
        //  1810: ldc_w           -1928594330
        //  1813: ixor           
        //  1814: lookupswitch {
        //          -715757507: 1807
        //          883355894: 1840
        //          default: 5266
        //        }
        //  1840: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1843: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1846: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1849: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //  1852: dup            
        //  1853: aload_0        
        //  1854: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1857: getstatic       dev/nuker/pyro/fc.0:I
        //  1860: ifeq            1869
        //  1863: ldc_w           1742014190
        //  1866: goto            1872
        //  1869: ldc_w           1310675976
        //  1872: ldc_w           -1883457978
        //  1875: ixor           
        //  1876: lookupswitch {
        //          -395726680: 5252
        //          1106038444: 1869
        //          default: 1904
        //        }
        //  1904: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1907: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1910: aload_0        
        //  1911: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1914: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1917: getstatic       dev/nuker/pyro/fc.c:I
        //  1920: ifge            1929
        //  1923: ldc_w           704746334
        //  1926: goto            1932
        //  1929: ldc_w           -612095034
        //  1932: ldc_w           609565686
        //  1935: ixor           
        //  1936: lookupswitch {
        //          -3076048: 1964
        //          240429224: 1929
        //          default: 5228
        //        }
        //  1964: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1967: ldc2_w          0.42
        //  1970: dadd           
        //  1971: aload_0        
        //  1972: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  1975: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1978: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1981: iconst_1       
        //  1982: goto            1986
        //  1985: athrow         
        //  1986: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //  1989: goto            1993
        //  1992: athrow         
        //  1993: goto            1997
        //  1996: athrow         
        //  1997: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2000: goto            2004
        //  2003: athrow         
        //  2004: getstatic       dev/nuker/pyro/fc.1:I
        //  2007: ifeq            2016
        //  2010: ldc_w           1609963950
        //  2013: goto            2019
        //  2016: ldc_w           -224574214
        //  2019: ldc_w           -458355942
        //  2022: ixor           
        //  2023: lookupswitch {
        //          -1151855948: 5262
        //          1953470545: 2016
        //          default: 2048
        //        }
        //  2048: aload_0        
        //  2049: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2052: getstatic       dev/nuker/pyro/fc.0:I
        //  2055: ifeq            2064
        //  2058: ldc_w           1476114329
        //  2061: goto            2067
        //  2064: ldc_w           -1012329269
        //  2067: ldc_w           -1857990435
        //  2070: ixor           
        //  2071: lookupswitch {
        //          -960829628: 5348
        //          1085575395: 2064
        //          default: 2096
        //        }
        //  2096: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2099: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2102: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //  2105: dup            
        //  2106: aload_0        
        //  2107: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2110: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2113: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2116: aload_0        
        //  2117: getstatic       dev/nuker/pyro/fc.1:I
        //  2120: ifeq            2129
        //  2123: ldc_w           -198107790
        //  2126: goto            2132
        //  2129: ldc_w           1462350886
        //  2132: ldc_w           439568269
        //  2135: ixor           
        //  2136: lookupswitch {
        //          -301835521: 5210
        //          269335291: 2129
        //          default: 2164
        //        }
        //  2164: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2167: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2170: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  2173: ldc2_w          0.75
        //  2176: dadd           
        //  2177: aload_0        
        //  2178: getstatic       dev/nuker/pyro/fc.c:I
        //  2181: ifge            2190
        //  2184: ldc_w           -1710917014
        //  2187: goto            2193
        //  2190: ldc_w           -1971380266
        //  2193: ldc_w           -1382471063
        //  2196: ixor           
        //  2197: lookupswitch {
        //          669398463: 2224
        //          932990979: 2190
        //          default: 5278
        //        }
        //  2224: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2227: getstatic       dev/nuker/pyro/fc.0:I
        //  2230: ifeq            2239
        //  2233: ldc_w           -1061737735
        //  2236: goto            2242
        //  2239: ldc_w           1057090452
        //  2242: ldc_w           -2137652596
        //  2245: ixor           
        //  2246: lookupswitch {
        //          -1475870623: 2239
        //          1075914869: 5356
        //          default: 2272
        //        }
        //  2272: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2275: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2278: iconst_1       
        //  2279: getstatic       dev/nuker/pyro/fc.1:I
        //  2282: ifeq            2291
        //  2285: ldc_w           1675647376
        //  2288: goto            2294
        //  2291: ldc_w           76615358
        //  2294: ldc_w           -1282946909
        //  2297: ixor           
        //  2298: lookupswitch {
        //          -1223244259: 2324
        //          -798518989: 2291
        //          default: 5318
        //        }
        //  2324: goto            2328
        //  2327: athrow         
        //  2328: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //  2331: goto            2335
        //  2334: athrow         
        //  2335: goto            2339
        //  2338: athrow         
        //  2339: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2342: goto            2346
        //  2345: athrow         
        //  2346: aload_0        
        //  2347: getstatic       dev/nuker/pyro/fc.1:I
        //  2350: ifeq            2359
        //  2353: ldc_w           1319741992
        //  2356: goto            2362
        //  2359: ldc_w           -1505804598
        //  2362: ldc_w           1113343729
        //  2365: ixor           
        //  2366: lookupswitch {
        //          217443545: 5316
        //          1962097883: 2359
        //          default: 2392
        //        }
        //  2392: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2395: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2398: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2401: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //  2404: dup            
        //  2405: aload_0        
        //  2406: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2409: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2412: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2415: aload_0        
        //  2416: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2419: getstatic       dev/nuker/pyro/fc.1:I
        //  2422: ifeq            2431
        //  2425: ldc_w           -475807455
        //  2428: goto            2434
        //  2431: ldc_w           798614731
        //  2434: ldc_w           -263024573
        //  2437: ixor           
        //  2438: lookupswitch {
        //          -540314488: 2464
        //          334582114: 2431
        //          default: 5308
        //        }
        //  2464: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2467: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  2470: dconst_1       
        //  2471: dadd           
        //  2472: aload_0        
        //  2473: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2476: getstatic       dev/nuker/pyro/fc.0:I
        //  2479: ifeq            2488
        //  2482: ldc_w           332488286
        //  2485: goto            2491
        //  2488: ldc_w           923005970
        //  2491: ldc_w           -446793335
        //  2494: ixor           
        //  2495: lookupswitch {
        //          -765620837: 2520
        //          -158390313: 2488
        //          default: 5336
        //        }
        //  2520: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2523: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2526: iconst_1       
        //  2527: goto            2531
        //  2530: athrow         
        //  2531: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //  2534: goto            2538
        //  2537: athrow         
        //  2538: goto            2542
        //  2541: athrow         
        //  2542: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2545: goto            2549
        //  2548: athrow         
        //  2549: aload_0        
        //  2550: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2553: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2556: getstatic       dev/nuker/pyro/fc.c:I
        //  2559: ifge            2568
        //  2562: ldc_w           664372432
        //  2565: goto            2571
        //  2568: ldc_w           29853252
        //  2571: ldc_w           -476611826
        //  2574: ixor           
        //  2575: lookupswitch {
        //          -1005649954: 5332
        //          -980619120: 2568
        //          default: 2600
        //        }
        //  2600: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2603: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //  2606: dup            
        //  2607: getstatic       dev/nuker/pyro/fc.0:I
        //  2610: ifeq            2619
        //  2613: ldc_w           -1447842781
        //  2616: goto            2622
        //  2619: ldc_w           -2029812215
        //  2622: ldc_w           -1329919250
        //  2625: ixor           
        //  2626: lookupswitch {
        //          419997389: 5234
        //          1863623374: 2619
        //          default: 2652
        //        }
        //  2652: aload_0        
        //  2653: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2656: getstatic       dev/nuker/pyro/fc.c:I
        //  2659: ifge            2668
        //  2662: ldc_w           -1268851294
        //  2665: goto            2671
        //  2668: ldc_w           -775689258
        //  2671: ldc_w           1242022005
        //  2674: ixor           
        //  2675: lookupswitch {
        //          -2000177953: 2668
        //          -27714089: 5286
        //          default: 2700
        //        }
        //  2700: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2703: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2706: aload_0        
        //  2707: getstatic       dev/nuker/pyro/fc.0:I
        //  2710: ifeq            2719
        //  2713: ldc_w           -1230415735
        //  2716: goto            2722
        //  2719: ldc_w           245286410
        //  2722: ldc_w           2106775960
        //  2725: ixor           
        //  2726: lookupswitch {
        //          -885292783: 2719
        //          1930174354: 2752
        //          default: 5294
        //        }
        //  2752: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2755: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2758: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  2761: ldc2_w          1.16
        //  2764: dadd           
        //  2765: getstatic       dev/nuker/pyro/fc.0:I
        //  2768: ifeq            2777
        //  2771: ldc_w           -1171783017
        //  2774: goto            2780
        //  2777: ldc_w           1815780892
        //  2780: ldc_w           -402579432
        //  2783: ixor           
        //  2784: lookupswitch {
        //          -2076459516: 2812
        //          1378427535: 2777
        //          default: 5288
        //        }
        //  2812: aload_0        
        //  2813: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2816: getstatic       dev/nuker/pyro/fc.0:I
        //  2819: ifeq            2828
        //  2822: ldc_w           902011485
        //  2825: goto            2831
        //  2828: ldc_w           663546973
        //  2831: ldc_w           -1513015792
        //  2834: ixor           
        //  2835: lookupswitch {
        //          -2113119390: 2828
        //          -1877824435: 5300
        //          default: 2860
        //        }
        //  2860: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2863: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2866: iconst_1       
        //  2867: getstatic       dev/nuker/pyro/fc.0:I
        //  2870: ifeq            2879
        //  2873: ldc_w           17194643
        //  2876: goto            2882
        //  2879: ldc_w           -1634971512
        //  2882: ldc_w           932520453
        //  2885: ixor           
        //  2886: lookupswitch {
        //          -1457950067: 2912
        //          915635350: 2879
        //          default: 5258
        //        }
        //  2912: goto            2916
        //  2915: athrow         
        //  2916: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //  2919: goto            2923
        //  2922: athrow         
        //  2923: goto            2927
        //  2926: athrow         
        //  2927: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  2930: goto            2934
        //  2933: athrow         
        //  2934: getstatic       dev/nuker/pyro/fc.1:I
        //  2937: ifeq            2946
        //  2940: ldc_w           -923578677
        //  2943: goto            2949
        //  2946: ldc_w           1662458557
        //  2949: ldc_w           -2057091026
        //  2952: ixor           
        //  2953: lookupswitch {
        //          -1130777963: 2946
        //          1301284581: 5310
        //          default: 2980
        //        }
        //  2980: aload_0        
        //  2981: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2984: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2987: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  2990: new             Lnet/minecraft/network/play/client/CPacketPlayer$Position;
        //  2993: dup            
        //  2994: aload_0        
        //  2995: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  2998: getstatic       dev/nuker/pyro/fc.c:I
        //  3001: ifge            3010
        //  3004: ldc_w           442334995
        //  3007: goto            3013
        //  3010: ldc_w           1781906959
        //  3013: ldc_w           964362906
        //  3016: ixor           
        //  3017: lookupswitch {
        //          589725065: 3010
        //          1397669013: 3044
        //          default: 5334
        //        }
        //  3044: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3047: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  3050: aload_0        
        //  3051: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3054: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3057: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  3060: ldc2_w          1.24
        //  3063: dadd           
        //  3064: aload_0        
        //  3065: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3068: getstatic       dev/nuker/pyro/fc.1:I
        //  3071: ifeq            3080
        //  3074: ldc_w           355318081
        //  3077: goto            3083
        //  3080: ldc_w           441690926
        //  3083: ldc_w           818090606
        //  3086: ixor           
        //  3087: lookupswitch {
        //          636398383: 3080
        //          714127680: 3112
        //          default: 5264
        //        }
        //  3112: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3115: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  3118: iconst_1       
        //  3119: goto            3123
        //  3122: athrow         
        //  3123: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Position.<init>:(DDDZ)V
        //  3126: goto            3130
        //  3129: athrow         
        //  3130: goto            3134
        //  3133: athrow         
        //  3134: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  3137: goto            3141
        //  3140: athrow         
        //  3141: aload_0        
        //  3142: aload_0        
        //  3143: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3146: getstatic       dev/nuker/pyro/fc.c:I
        //  3149: ifge            3158
        //  3152: ldc_w           -363649597
        //  3155: goto            3161
        //  3158: ldc_w           -149086701
        //  3161: ldc_w           -903343618
        //  3164: ixor           
        //  3165: lookupswitch {
        //          544945213: 3158
        //          1026887661: 3192
        //          default: 5276
        //        }
        //  3192: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3195: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  3198: putfield        dev/nuker/pyro/f57.c:D
        //  3201: getstatic       dev/nuker/pyro/fc.c:I
        //  3204: ifge            3213
        //  3207: ldc_w           -1790751086
        //  3210: goto            3216
        //  3213: ldc_w           897385274
        //  3216: ldc_w           1687962182
        //  3219: ixor           
        //  3220: lookupswitch {
        //          -237040428: 5342
        //          1337107402: 3213
        //          default: 3248
        //        }
        //  3248: aload_0        
        //  3249: aload_0        
        //  3250: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3253: getstatic       dev/nuker/pyro/fc.c:I
        //  3256: ifge            3265
        //  3259: ldc_w           773551056
        //  3262: goto            3268
        //  3265: ldc_w           133980662
        //  3268: ldc_w           1456873156
        //  3271: ixor           
        //  3272: lookupswitch {
        //          539933552: 3265
        //          2026728724: 5222
        //          default: 3300
        //        }
        //  3300: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3303: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  3306: ldc2_w          1.24
        //  3309: dadd           
        //  3310: getstatic       dev/nuker/pyro/fc.1:I
        //  3313: ifeq            3322
        //  3316: ldc_w           1215219040
        //  3319: goto            3325
        //  3322: ldc_w           87667447
        //  3325: ldc_w           -716616894
        //  3328: ixor           
        //  3329: lookupswitch {
        //          -1658352094: 3322
        //          -797902411: 3356
        //          default: 5272
        //        }
        //  3356: putfield        dev/nuker/pyro/f57.0:D
        //  3359: aload_0        
        //  3360: getstatic       dev/nuker/pyro/fc.c:I
        //  3363: ifge            3372
        //  3366: ldc_w           -1666019142
        //  3369: goto            3375
        //  3372: ldc_w           -414933566
        //  3375: ldc_w           310614523
        //  3378: ixor           
        //  3379: lookupswitch {
        //          -1909388991: 5200
        //          -512813699: 3372
        //          default: 3404
        //        }
        //  3404: aload_0        
        //  3405: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3408: getstatic       dev/nuker/pyro/fc.0:I
        //  3411: ifeq            3420
        //  3414: ldc_w           -1544287344
        //  3417: goto            3423
        //  3420: ldc_w           -434391754
        //  3423: ldc_w           -675075907
        //  3426: ixor           
        //  3427: lookupswitch {
        //          836279691: 3452
        //          1949770541: 3420
        //          default: 5302
        //        }
        //  3452: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3455: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  3458: getstatic       dev/nuker/pyro/fc.0:I
        //  3461: ifeq            3470
        //  3464: ldc_w           -439196742
        //  3467: goto            3473
        //  3470: ldc_w           714447343
        //  3473: ldc_w           1891272356
        //  3476: ixor           
        //  3477: lookupswitch {
        //          -1788287714: 3470
        //          1513037643: 3504
        //          default: 5320
        //        }
        //  3504: putfield        dev/nuker/pyro/f57.1:D
        //  3507: aload_0        
        //  3508: iconst_5       
        //  3509: putfield        dev/nuker/pyro/f57.1:I
        //  3512: goto            3750
        //  3515: aload_1        
        //  3516: goto            3520
        //  3519: athrow         
        //  3520: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  3523: goto            3527
        //  3526: athrow         
        //  3527: aload_1        
        //  3528: ldc_w           90.0
        //  3531: getstatic       dev/nuker/pyro/fc.1:I
        //  3534: ifeq            3543
        //  3537: ldc_w           1212579936
        //  3540: goto            3546
        //  3543: ldc_w           -1437887936
        //  3546: ldc_w           949761824
        //  3549: ixor           
        //  3550: lookupswitch {
        //          -1831361184: 3576
        //          1893381952: 3543
        //          default: 5268
        //        }
        //  3576: goto            3580
        //  3579: athrow         
        //  3580: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  3583: goto            3587
        //  3586: athrow         
        //  3587: aload_0        
        //  3588: iconst_1       
        //  3589: putfield        dev/nuker/pyro/f57.c:Z
        //  3592: getstatic       dev/nuker/pyro/fc.1:I
        //  3595: ifeq            3604
        //  3598: ldc_w           1044874560
        //  3601: goto            3607
        //  3604: ldc_w           705862676
        //  3607: ldc_w           608343225
        //  3610: ixor           
        //  3611: lookupswitch {
        //          240126125: 3636
        //          436539897: 3604
        //          default: 5340
        //        }
        //  3636: aload_0        
        //  3637: iconst_1       
        //  3638: putfield        dev/nuker/pyro/f57.0:Z
        //  3641: getstatic       dev/nuker/pyro/fc.c:I
        //  3644: ifge            3653
        //  3647: ldc_w           -574396924
        //  3650: goto            3656
        //  3653: ldc_w           -63038311
        //  3656: ldc_w           -1228148649
        //  3659: ixor           
        //  3660: lookupswitch {
        //          1257630926: 3688
        //          1795724883: 3653
        //          default: 5240
        //        }
        //  3688: aload_0        
        //  3689: getstatic       dev/nuker/pyro/fc.0:I
        //  3692: ifeq            3701
        //  3695: ldc_w           -31087482
        //  3698: goto            3704
        //  3701: ldc_w           411508975
        //  3704: ldc_w           616492000
        //  3707: ixor           
        //  3708: lookupswitch {
        //          -627355802: 3701
        //          1010420495: 3736
        //          default: 5350
        //        }
        //  3736: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fbu;
        //  3739: goto            3743
        //  3742: athrow         
        //  3743: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  3746: goto            3750
        //  3749: athrow         
        //  3750: getstatic       dev/nuker/pyro/fc.0:I
        //  3753: ifeq            3762
        //  3756: ldc_w           2128804793
        //  3759: goto            3765
        //  3762: ldc_w           1848993094
        //  3765: ldc_w           -1579720062
        //  3768: ixor           
        //  3769: lookupswitch {
        //          -807270460: 3796
        //          -550135493: 3762
        //          default: 5270
        //        }
        //  3796: aload_0        
        //  3797: getfield        dev/nuker/pyro/f57.1:I
        //  3800: iflt            3860
        //  3803: getstatic       dev/nuker/pyro/fc.1:I
        //  3806: ifeq            3815
        //  3809: ldc_w           2115295568
        //  3812: goto            3818
        //  3815: ldc_w           384373290
        //  3818: ldc_w           -454932826
        //  3821: ixor           
        //  3822: lookupswitch {
        //          -1695113226: 3815
        //          -234138484: 3848
        //          default: 5312
        //        }
        //  3848: aload_1        
        //  3849: goto            3853
        //  3852: athrow         
        //  3853: invokevirtual   dev/nuker/pyro/f3i.0:()V
        //  3856: goto            3860
        //  3859: athrow         
        //  3860: getstatic       dev/nuker/pyro/fc.1:I
        //  3863: ifeq            3872
        //  3866: ldc_w           983802920
        //  3869: goto            3875
        //  3872: ldc_w           -610901042
        //  3875: ldc_w           1959956056
        //  3878: ixor           
        //  3879: lookupswitch {
        //          -1354437226: 3904
        //          1316039280: 3872
        //          default: 5254
        //        }
        //  3904: aload_0        
        //  3905: getstatic       dev/nuker/pyro/fc.0:I
        //  3908: ifeq            3917
        //  3911: ldc_w           -983323763
        //  3914: goto            3920
        //  3917: ldc_w           1082670211
        //  3920: ldc_w           -1429190195
        //  3923: ixor           
        //  3924: lookupswitch {
        //          -186448586: 3917
        //          1874059840: 5322
        //          default: 3952
        //        }
        //  3952: getfield        dev/nuker/pyro/f57.1:I
        //  3955: ifne            3964
        //  3958: ldc_w           296314042
        //  3961: goto            3967
        //  3964: ldc_w           296314043
        //  3967: ldc_w           -952235626
        //  3970: ixor           
        //  3971: tableswitch {
        //          -1389438376: 3992
        //          -1389438375: 4281
        //          default: 3958
        //        }
        //  3992: aload_0        
        //  3993: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  3996: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3999: dconst_0       
        //  4000: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //  4003: getstatic       dev/nuker/pyro/fc.c:I
        //  4006: ifge            4015
        //  4009: ldc_w           -760192825
        //  4012: goto            4018
        //  4015: ldc_w           51088360
        //  4018: ldc_w           -677783639
        //  4021: ixor           
        //  4022: lookupswitch {
        //          -728605631: 4048
        //          86620014: 4015
        //          default: 5306
        //        }
        //  4048: aload_0        
        //  4049: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4052: getstatic       dev/nuker/pyro/fc.c:I
        //  4055: ifge            4064
        //  4058: ldc_w           1035414230
        //  4061: goto            4067
        //  4064: ldc_w           1419785204
        //  4067: ldc_w           -1197669899
        //  4070: ixor           
        //  4071: lookupswitch {
        //          -2060834013: 4064
        //          -331533823: 4096
        //          default: 5324
        //        }
        //  4096: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4099: dconst_0       
        //  4100: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //  4103: aload_0        
        //  4104: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4107: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4110: aload_0        
        //  4111: getstatic       dev/nuker/pyro/fc.c:I
        //  4114: ifge            4123
        //  4117: ldc_w           -183744695
        //  4120: goto            4126
        //  4123: ldc_w           -1080362838
        //  4126: ldc_w           -1191272052
        //  4129: ixor           
        //  4130: lookupswitch {
        //          124016934: 4156
        //          1307764421: 4123
        //          default: 5236
        //        }
        //  4156: getfield        dev/nuker/pyro/f57.c:D
        //  4159: aload_0        
        //  4160: getfield        dev/nuker/pyro/f57.0:D
        //  4163: aload_0        
        //  4164: getstatic       dev/nuker/pyro/fc.1:I
        //  4167: ifeq            4176
        //  4170: ldc_w           -2018332081
        //  4173: goto            4179
        //  4176: ldc_w           -1418894613
        //  4179: ldc_w           1013925254
        //  4182: ixor           
        //  4183: lookupswitch {
        //          -1761466515: 4208
        //          -1143081015: 4176
        //          default: 5242
        //        }
        //  4208: getfield        dev/nuker/pyro/f57.1:D
        //  4211: goto            4215
        //  4214: athrow         
        //  4215: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70634_a:(DDD)V
        //  4218: goto            4222
        //  4221: athrow         
        //  4222: getstatic       dev/nuker/pyro/fc.c:I
        //  4225: ifge            4234
        //  4228: ldc_w           -1153384902
        //  4231: goto            4237
        //  4234: ldc_w           -1483849070
        //  4237: ldc_w           -75898304
        //  4240: ixor           
        //  4241: lookupswitch {
        //          1077501050: 4234
        //          1559732434: 4268
        //          default: 5202
        //        }
        //  4268: aload_0        
        //  4269: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4272: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4275: ldc2_w          -0.08
        //  4278: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  4281: aload_0        
        //  4282: dup            
        //  4283: getfield        dev/nuker/pyro/f57.1:I
        //  4286: iconst_1       
        //  4287: isub           
        //  4288: putfield        dev/nuker/pyro/f57.1:I
        //  4291: goto            5197
        //  4294: aload_0        
        //  4295: getfield        dev/nuker/pyro/f57.c:Z
        //  4298: ifeq            5197
        //  4301: aload_0        
        //  4302: aload_0        
        //  4303: goto            4307
        //  4306: athrow         
        //  4307: invokevirtual   dev/nuker/pyro/f57.c:()I
        //  4310: goto            4314
        //  4313: athrow         
        //  4314: getstatic       dev/nuker/pyro/fc.1:I
        //  4317: ifeq            4326
        //  4320: ldc_w           830852340
        //  4323: goto            4329
        //  4326: ldc_w           -1108881671
        //  4329: ldc_w           850593632
        //  4332: ixor           
        //  4333: lookupswitch {
        //          53922708: 5248
        //          260664960: 4326
        //          default: 4360
        //        }
        //  4360: aload_0        
        //  4361: getstatic       dev/nuker/pyro/fc.1:I
        //  4364: ifeq            4373
        //  4367: ldc_w           1317333982
        //  4370: goto            4376
        //  4373: ldc_w           229627598
        //  4376: ldc_w           1039806580
        //  4379: ixor           
        //  4380: lookupswitch {
        //          810935994: 4408
        //          1937693610: 4373
        //          default: 5208
        //        }
        //  4408: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //  4411: goto            4415
        //  4414: athrow         
        //  4415: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  4418: goto            4422
        //  4421: athrow         
        //  4422: checkcast       Ljava/lang/Integer;
        //  4425: getstatic       dev/nuker/pyro/fc.1:I
        //  4428: ifeq            4437
        //  4431: ldc_w           1540873620
        //  4434: goto            4440
        //  4437: ldc_w           488351411
        //  4440: ldc_w           -2045613996
        //  4443: ixor           
        //  4444: lookupswitch {
        //          -1693856025: 4472
        //          -574245440: 4437
        //          default: 5338
        //        }
        //  4472: goto            4476
        //  4475: athrow         
        //  4476: invokevirtual   java/lang/Integer.intValue:()I
        //  4479: goto            4483
        //  4482: athrow         
        //  4483: getstatic       dev/nuker/pyro/fc.0:I
        //  4486: ifeq            4495
        //  4489: ldc_w           263547683
        //  4492: goto            4498
        //  4495: ldc_w           -233226823
        //  4498: ldc_w           -504365701
        //  4501: ixor           
        //  4502: lookupswitch {
        //          -296053160: 4495
        //          334938306: 4528
        //          default: 5314
        //        }
        //  4528: goto            4532
        //  4531: athrow         
        //  4532: invokevirtual   dev/nuker/pyro/f57.c:(II)V
        //  4535: goto            4539
        //  4538: athrow         
        //  4539: aload_0        
        //  4540: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4543: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4546: getstatic       dev/nuker/pyro/fc.1:I
        //  4549: ifeq            4558
        //  4552: ldc_w           -121465548
        //  4555: goto            4561
        //  4558: ldc_w           788140481
        //  4561: ldc_w           -1931865593
        //  4564: ixor           
        //  4565: lookupswitch {
        //          -1574960186: 4592
        //          1947764531: 4558
        //          default: 5226
        //        }
        //  4592: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  4595: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //  4598: dup            
        //  4599: aload_0        
        //  4600: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //  4603: getstatic       dev/nuker/pyro/fc.c:I
        //  4606: ifge            4615
        //  4609: ldc_w           532358957
        //  4612: goto            4618
        //  4615: ldc_w           -640413810
        //  4618: ldc_w           1509710886
        //  4621: ixor           
        //  4622: lookupswitch {
        //          -2144840792: 4648
        //          1179089675: 4615
        //          default: 5198
        //        }
        //  4648: goto            4652
        //  4651: athrow         
        //  4652: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  4655: goto            4659
        //  4658: athrow         
        //  4659: checkcast       Ljava/lang/Integer;
        //  4662: goto            4666
        //  4665: athrow         
        //  4666: invokevirtual   java/lang/Integer.intValue:()I
        //  4669: goto            4673
        //  4672: athrow         
        //  4673: getstatic       dev/nuker/pyro/fc.c:I
        //  4676: ifge            4685
        //  4679: ldc_w           -2050580056
        //  4682: goto            4688
        //  4685: ldc_w           839999541
        //  4688: ldc_w           -1093504151
        //  4691: ixor           
        //  4692: lookupswitch {
        //          -1933372580: 4720
        //          991220417: 4685
        //          default: 5326
        //        }
        //  4720: goto            4724
        //  4723: athrow         
        //  4724: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //  4727: goto            4731
        //  4730: athrow         
        //  4731: goto            4735
        //  4734: athrow         
        //  4735: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  4738: goto            4742
        //  4741: athrow         
        //  4742: aload_0        
        //  4743: getfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0a;
        //  4746: goto            4750
        //  4749: athrow         
        //  4750: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4753: goto            4757
        //  4756: athrow         
        //  4757: checkcast       Ljava/lang/Boolean;
        //  4760: getstatic       dev/nuker/pyro/fc.1:I
        //  4763: ifeq            4772
        //  4766: ldc_w           -98669605
        //  4769: goto            4775
        //  4772: ldc_w           560826770
        //  4775: ldc_w           1907663693
        //  4778: ixor           
        //  4779: lookupswitch {
        //          -1951741802: 4772
        //          1356409567: 4804
        //          default: 5238
        //        }
        //  4804: goto            4808
        //  4807: athrow         
        //  4808: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4811: goto            4815
        //  4814: athrow         
        //  4815: ifeq            4905
        //  4818: aload_0        
        //  4819: getstatic       dev/nuker/pyro/fc.1:I
        //  4822: ifeq            4831
        //  4825: ldc_w           -1378298468
        //  4828: goto            4834
        //  4831: ldc_w           -1056249694
        //  4834: ldc_w           -1480027335
        //  4837: ixor           
        //  4838: lookupswitch {
        //          168838821: 4831
        //          1724021659: 4864
        //          default: 5296
        //        }
        //  4864: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4867: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4870: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  4873: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //  4876: dup            
        //  4877: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  4880: goto            4884
        //  4883: athrow         
        //  4884: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  4887: goto            4891
        //  4890: athrow         
        //  4891: goto            4895
        //  4894: athrow         
        //  4895: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  4898: goto            4902
        //  4901: athrow         
        //  4902: goto            5035
        //  4905: aload_0        
        //  4906: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  4909: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4912: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  4915: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //  4918: dup            
        //  4919: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  4922: getstatic       dev/nuker/pyro/fc.c:I
        //  4925: ifge            4934
        //  4928: ldc_w           877002219
        //  4931: goto            4937
        //  4934: ldc_w           449540768
        //  4937: ldc_w           -418108802
        //  4940: ixor           
        //  4941: lookupswitch {
        //          -749611115: 5344
        //          -356342619: 4934
        //          default: 4968
        //        }
        //  4968: goto            4972
        //  4971: athrow         
        //  4972: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  4975: goto            4979
        //  4978: athrow         
        //  4979: getstatic       dev/nuker/pyro/fc.1:I
        //  4982: ifeq            4991
        //  4985: ldc_w           -442485492
        //  4988: goto            4994
        //  4991: ldc_w           681049388
        //  4994: ldc_w           287432470
        //  4997: ixor           
        //  4998: lookupswitch {
        //          -192812518: 4991
        //          968237626: 5024
        //          default: 5218
        //        }
        //  5024: goto            5028
        //  5027: athrow         
        //  5028: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  5031: goto            5035
        //  5034: athrow         
        //  5035: aload_0        
        //  5036: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  5039: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5042: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  5045: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //  5048: dup            
        //  5049: getstatic       dev/nuker/pyro/fc.0:I
        //  5052: ifeq            5061
        //  5055: ldc_w           1343147513
        //  5058: goto            5064
        //  5061: ldc_w           1255710017
        //  5064: ldc_w           1168362917
        //  5067: ixor           
        //  5068: lookupswitch {
        //          -829073420: 5061
        //          363659356: 5230
        //          default: 5096
        //        }
        //  5096: aload_0        
        //  5097: getfield        dev/nuker/pyro/f57.c:Lnet/minecraft/client/Minecraft;
        //  5100: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5103: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  5106: getstatic       dev/nuker/pyro/fc.1:I
        //  5109: ifeq            5118
        //  5112: ldc_w           955166963
        //  5115: goto            5121
        //  5118: ldc_w           -2060956328
        //  5121: ldc_w           349129978
        //  5124: ixor           
        //  5125: lookupswitch {
        //          740424713: 5346
        //          1740361084: 5118
        //          default: 5152
        //        }
        //  5152: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  5155: goto            5159
        //  5158: athrow         
        //  5159: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //  5162: goto            5166
        //  5165: athrow         
        //  5166: goto            5170
        //  5169: athrow         
        //  5170: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  5173: goto            5177
        //  5176: athrow         
        //  5177: aload_0        
        //  5178: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fbu;
        //  5181: goto            5185
        //  5184: athrow         
        //  5185: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  5188: goto            5192
        //  5191: athrow         
        //  5192: aload_0        
        //  5193: iconst_0       
        //  5194: putfield        dev/nuker/pyro/f57.c:Z
        //  5197: return         
        //  5198: aconst_null    
        //  5199: athrow         
        //  5200: aconst_null    
        //  5201: athrow         
        //  5202: aconst_null    
        //  5203: athrow         
        //  5204: aconst_null    
        //  5205: athrow         
        //  5206: aconst_null    
        //  5207: athrow         
        //  5208: aconst_null    
        //  5209: athrow         
        //  5210: aconst_null    
        //  5211: athrow         
        //  5212: aconst_null    
        //  5213: athrow         
        //  5214: aconst_null    
        //  5215: athrow         
        //  5216: aconst_null    
        //  5217: athrow         
        //  5218: aconst_null    
        //  5219: athrow         
        //  5220: aconst_null    
        //  5221: athrow         
        //  5222: aconst_null    
        //  5223: athrow         
        //  5224: aconst_null    
        //  5225: athrow         
        //  5226: aconst_null    
        //  5227: athrow         
        //  5228: aconst_null    
        //  5229: athrow         
        //  5230: aconst_null    
        //  5231: athrow         
        //  5232: aconst_null    
        //  5233: athrow         
        //  5234: aconst_null    
        //  5235: athrow         
        //  5236: aconst_null    
        //  5237: athrow         
        //  5238: aconst_null    
        //  5239: athrow         
        //  5240: aconst_null    
        //  5241: athrow         
        //  5242: aconst_null    
        //  5243: athrow         
        //  5244: aconst_null    
        //  5245: athrow         
        //  5246: aconst_null    
        //  5247: athrow         
        //  5248: aconst_null    
        //  5249: athrow         
        //  5250: aconst_null    
        //  5251: athrow         
        //  5252: aconst_null    
        //  5253: athrow         
        //  5254: aconst_null    
        //  5255: athrow         
        //  5256: aconst_null    
        //  5257: athrow         
        //  5258: aconst_null    
        //  5259: athrow         
        //  5260: aconst_null    
        //  5261: athrow         
        //  5262: aconst_null    
        //  5263: athrow         
        //  5264: aconst_null    
        //  5265: athrow         
        //  5266: aconst_null    
        //  5267: athrow         
        //  5268: aconst_null    
        //  5269: athrow         
        //  5270: aconst_null    
        //  5271: athrow         
        //  5272: aconst_null    
        //  5273: athrow         
        //  5274: aconst_null    
        //  5275: athrow         
        //  5276: aconst_null    
        //  5277: athrow         
        //  5278: aconst_null    
        //  5279: athrow         
        //  5280: aconst_null    
        //  5281: athrow         
        //  5282: aconst_null    
        //  5283: athrow         
        //  5284: aconst_null    
        //  5285: athrow         
        //  5286: aconst_null    
        //  5287: athrow         
        //  5288: aconst_null    
        //  5289: athrow         
        //  5290: aconst_null    
        //  5291: athrow         
        //  5292: aconst_null    
        //  5293: athrow         
        //  5294: aconst_null    
        //  5295: athrow         
        //  5296: aconst_null    
        //  5297: athrow         
        //  5298: aconst_null    
        //  5299: athrow         
        //  5300: aconst_null    
        //  5301: athrow         
        //  5302: aconst_null    
        //  5303: athrow         
        //  5304: aconst_null    
        //  5305: athrow         
        //  5306: aconst_null    
        //  5307: athrow         
        //  5308: aconst_null    
        //  5309: athrow         
        //  5310: aconst_null    
        //  5311: athrow         
        //  5312: aconst_null    
        //  5313: athrow         
        //  5314: aconst_null    
        //  5315: athrow         
        //  5316: aconst_null    
        //  5317: athrow         
        //  5318: aconst_null    
        //  5319: athrow         
        //  5320: aconst_null    
        //  5321: athrow         
        //  5322: aconst_null    
        //  5323: athrow         
        //  5324: aconst_null    
        //  5325: athrow         
        //  5326: aconst_null    
        //  5327: athrow         
        //  5328: aconst_null    
        //  5329: athrow         
        //  5330: aconst_null    
        //  5331: athrow         
        //  5332: aconst_null    
        //  5333: athrow         
        //  5334: aconst_null    
        //  5335: athrow         
        //  5336: aconst_null    
        //  5337: athrow         
        //  5338: aconst_null    
        //  5339: athrow         
        //  5340: aconst_null    
        //  5341: athrow         
        //  5342: aconst_null    
        //  5343: athrow         
        //  5344: aconst_null    
        //  5345: athrow         
        //  5346: aconst_null    
        //  5347: athrow         
        //  5348: aconst_null    
        //  5349: athrow         
        //  5350: aconst_null    
        //  5351: athrow         
        //  5352: aconst_null    
        //  5353: athrow         
        //  5354: aconst_null    
        //  5355: athrow         
        //  5356: aconst_null    
        //  5357: athrow         
        //  5358: pop            
        //  5359: goto            24
        //  5362: pop            
        //  5363: aconst_null    
        //  5364: goto            5358
        //  5367: dup            
        //  5368: ifnull          5358
        //  5371: checkcast       Ljava/lang/Throwable;
        //  5374: athrow         
        //  5375: dup            
        //  5376: ifnull          5362
        //  5379: checkcast       Ljava/lang/Throwable;
        //  5382: athrow         
        //  5383: aconst_null    
        //  5384: athrow         
        //    StackMapTable: 02 59 43 07 00 3A 04 FF 00 0B 00 00 00 01 07 00 3A FD 00 03 07 00 03 07 00 41 4B 07 00 41 FF 00 01 00 02 07 00 03 07 00 41 00 02 07 00 41 01 5D 07 00 41 42 07 00 1A 40 07 00 41 45 07 00 3A 40 01 03 43 07 00 3A 40 07 00 41 45 07 00 3A 40 07 00 49 05 04 41 01 17 FF 00 12 00 02 07 00 03 07 00 41 00 02 07 00 68 07 00 5A FF 00 01 00 02 07 00 03 07 00 41 00 03 07 00 68 07 00 5A 01 FF 00 1E 00 02 07 00 03 07 00 41 00 02 07 00 68 07 00 5A 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 68 07 00 5A 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 68 07 02 09 45 07 00 26 FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 68 07 00 60 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 68 03 46 07 00 20 FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 68 03 45 07 00 3A 40 01 FF 00 0F 00 03 07 00 03 07 00 41 01 00 01 07 00 72 FF 00 01 00 03 07 00 03 07 00 41 01 00 02 07 00 72 01 5D 07 00 72 42 07 00 1A 40 07 00 72 45 07 00 3A 40 07 02 09 45 07 00 1E 40 07 00 75 45 07 00 3A 40 01 11 43 07 00 3A 40 07 00 03 45 07 00 3A 40 01 4A 01 FF 00 01 00 03 07 00 03 07 00 41 01 00 02 01 01 5B 01 FF 00 14 00 04 07 00 03 07 00 41 01 01 00 01 07 00 7D FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 7D 01 5C 07 00 7D 45 07 00 3A 40 07 00 83 45 07 00 3A 40 02 47 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 03 07 00 5A 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 03 07 02 09 45 07 00 2E FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 03 07 00 60 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 03 03 53 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5D 07 00 03 0B 04 41 01 18 4D 07 00 A8 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 A8 01 5B 07 00 A8 45 07 00 3A 40 07 00 AD 45 07 00 3A 40 07 02 09 4D 07 00 75 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 75 01 5D 07 00 75 42 07 00 2A 40 07 00 75 45 07 00 3A 40 01 FF 00 0F 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 51 07 00 68 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 68 01 5B 07 00 68 42 07 00 1E 40 07 00 68 45 07 00 3A 00 0A 41 01 1B 51 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5B 07 00 83 FF 00 12 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 03 6B 08 03 6B 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 03 6B 08 03 6B 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 03 6B 08 03 6B 07 00 03 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 03 6B 08 03 6B 03 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 03 6B 08 03 6B 03 03 01 FF 00 1B 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 03 6B 08 03 6B 03 03 59 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 09 07 00 E6 08 03 6B 08 03 6B 03 03 03 02 02 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 C9 FF 00 0A 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 C9 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 03 07 00 E6 07 00 C9 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 C9 42 07 00 18 FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 C9 45 07 00 3A 00 4B 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5E 07 00 03 47 07 00 1E FF 00 00 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 07 00 F1 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 07 02 09 45 07 00 2A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 07 00 F4 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 01 42 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 01 01 45 07 00 3A 00 51 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5E 07 00 83 FF 00 16 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 00 F1 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 04 BB 08 04 BB 07 00 F1 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 00 F1 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 00 F1 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 02 09 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 00 F4 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 01 FF 00 0B 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 01 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 04 BB 08 04 BB 01 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 01 42 07 00 2A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 FF FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 FF 45 07 00 3A 00 4F 07 00 72 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 72 01 5E 07 00 72 42 07 00 18 40 07 00 72 45 07 00 3A 40 07 02 09 45 07 00 30 40 07 00 75 45 07 00 3A 40 01 55 07 00 83 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5D 07 00 83 4C 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 05 D3 08 05 D3 07 01 14 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 12 42 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 12 45 07 00 3A 00 02 0B 42 01 1D 52 07 00 83 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5D 07 00 83 FF 00 0C 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 06 57 08 06 57 07 01 14 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 12 42 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 12 45 07 00 3A 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5F 07 00 03 51 07 00 83 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5E 07 00 83 56 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 06 DB 08 06 DB 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 FF FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 FF 45 07 00 3A 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 07 39 08 07 39 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 07 39 08 07 39 07 00 7D 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 07 39 08 07 39 07 00 7D FF 00 18 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 07 39 08 07 39 03 07 00 83 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 07 39 08 07 39 03 07 00 83 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 07 39 08 07 39 03 07 00 83 54 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 07 39 08 07 39 03 03 03 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 45 07 00 3A 00 0B 42 01 1C 4F 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 7D 01 5C 07 00 7D FF 00 20 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 08 36 08 08 36 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 08 36 08 08 36 03 07 00 03 FF 00 19 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 03 FF 00 0E 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 07 00 7D 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 7D FF 00 12 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 03 01 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 08 07 00 E6 08 08 36 08 08 36 03 03 03 01 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 03 01 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 03 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 42 07 00 26 FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 45 07 00 3A 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 26 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 09 61 08 09 61 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 09 61 08 09 61 03 07 00 7D 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 09 61 08 09 61 03 07 00 7D FF 00 17 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 09 61 08 09 61 03 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 09 61 08 09 61 03 03 07 00 7D 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 09 61 08 09 61 03 03 07 00 7D 49 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 09 61 08 09 61 03 03 03 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 42 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 45 07 00 3A 00 52 07 00 83 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 01 5C 07 00 83 FF 00 12 00 04 07 00 03 07 00 41 01 01 00 03 07 00 E6 08 0A 2B 08 0A 2B FF 00 02 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0A 2B 08 0A 2B 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 03 07 00 E6 08 0A 2B 08 0A 2B FF 00 0F 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0A 2B 08 0A 2B 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 07 00 7D 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0A 2B 08 0A 2B 07 00 7D FF 00 12 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0A 2B 08 0A 2B 03 07 00 03 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 07 00 03 FF 00 18 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0A 2B 08 0A 2B 03 03 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 03 FF 00 0F 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0A 2B 08 0A 2B 03 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0A 2B 08 0A 2B 03 03 07 00 7D 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0A 2B 08 0A 2B 03 03 07 00 7D FF 00 12 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0A 2B 08 0A 2B 03 03 03 01 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 08 07 00 E6 08 0A 2B 08 0A 2B 03 03 03 01 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0A 2B 08 0A 2B 03 03 03 01 42 07 00 28 FF 00 00 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0A 2B 08 0A 2B 03 03 03 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 42 07 00 20 FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 45 07 00 3A 00 0B 42 01 1E FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0B AE 08 0B AE 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0B AE 08 0B AE 07 00 7D 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0B AE 08 0B AE 07 00 7D FF 00 23 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0B AE 08 0B AE 03 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0B AE 08 0B AE 03 03 07 00 7D 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0B AE 08 0B AE 03 03 07 00 7D 49 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0B AE 08 0B AE 03 03 03 01 45 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 01 38 45 07 00 3A 00 FF 00 10 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 07 00 7D 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D 14 42 01 1F FF 00 10 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 07 00 7D 01 FF 00 1F 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 15 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 03 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 4F 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5C 07 00 03 FF 00 0F 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 07 00 7D 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 11 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 03 03 01 FF 00 1E 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 0A 43 07 00 3A 40 07 00 41 45 07 00 3A 00 FF 00 0F 00 04 07 00 03 07 00 41 01 01 00 02 07 00 41 02 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 41 02 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 02 07 00 41 02 42 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 02 07 00 41 02 45 07 00 3A 00 10 42 01 1C 10 42 01 1F 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 3A 40 07 00 68 45 07 00 3A 00 0B 42 01 1E 12 42 01 1D 43 07 00 22 40 07 00 41 45 07 00 3A 00 0B 42 01 1C 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 5F 07 00 03 05 05 42 01 18 16 42 01 1D 4F 07 00 7D FF 00 02 00 04 07 00 03 07 00 41 01 01 00 02 07 00 7D 01 5C 07 00 7D FF 00 1A 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 03 07 00 83 07 00 03 01 FF 00 1D 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 07 00 03 FF 00 13 00 04 07 00 03 07 00 41 01 01 00 04 07 00 83 03 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 41 01 01 00 05 07 00 83 03 03 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 41 01 01 00 04 07 00 83 03 03 07 00 03 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 04 07 00 03 07 00 41 01 01 00 04 07 00 83 03 03 03 45 07 00 3A 00 0B 42 01 1E 0C F9 00 0C 4B 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 03 07 00 03 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 03 01 FF 00 0B 00 02 07 00 03 07 00 41 00 02 07 00 03 01 FF 00 02 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 FF 00 1E 00 02 07 00 03 07 00 41 00 02 07 00 03 01 FF 00 0C 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 03 FF 00 02 00 02 07 00 03 07 00 41 00 04 07 00 03 01 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 03 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 F1 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 02 09 FF 00 0E 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 F4 FF 00 02 00 02 07 00 03 07 00 41 00 04 07 00 03 01 07 00 F4 01 FF 00 1F 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 F4 42 07 00 1E FF 00 00 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 F4 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 FF 00 0B 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 FF 00 02 00 02 07 00 03 07 00 41 00 04 07 00 03 01 01 01 FF 00 1D 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 45 07 00 3A 00 52 07 00 83 FF 00 02 00 02 07 00 03 07 00 41 00 02 07 00 83 01 5E 07 00 83 FF 00 16 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 00 F1 FF 00 02 00 02 07 00 03 07 00 41 00 05 07 00 E6 08 11 F3 08 11 F3 07 00 F1 01 FF 00 1D 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 00 F1 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 00 F1 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 02 09 FF 00 05 00 00 00 01 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 00 F4 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 01 FF 00 0B 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 01 FF 00 02 00 02 07 00 03 07 00 41 00 05 07 00 E6 08 11 F3 08 11 F3 01 01 FF 00 1F 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 01 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 01 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 00 FF 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 00 FF 45 07 00 3A 00 46 07 00 20 40 07 00 72 45 07 00 3A 40 07 02 09 4E 07 00 75 FF 00 02 00 02 07 00 03 07 00 41 00 02 07 00 75 01 5C 07 00 75 42 07 00 32 40 07 00 75 45 07 00 3A 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 00 41 00 02 07 00 03 01 5D 07 00 03 52 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 09 08 13 09 07 01 14 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 45 07 00 3A 00 02 FF 00 1C 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 33 08 13 33 07 01 14 FF 00 02 00 02 07 00 03 07 00 41 00 05 07 00 E6 08 13 33 08 13 33 07 01 14 01 FF 00 1E 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 33 08 13 33 07 01 14 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 33 08 13 33 07 01 14 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 FF 00 0B 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 FF 00 02 00 02 07 00 03 07 00 41 00 03 07 00 E6 07 01 12 01 FF 00 1D 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 42 07 00 1E FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 45 07 00 3A 00 FF 00 19 00 02 07 00 03 07 00 41 00 03 07 00 E6 08 13 B5 08 13 B5 FF 00 02 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 B5 08 13 B5 01 FF 00 1F 00 02 07 00 03 07 00 41 00 03 07 00 E6 08 13 B5 08 13 B5 FF 00 15 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 B5 08 13 B5 07 01 30 FF 00 02 00 02 07 00 03 07 00 41 00 05 07 00 E6 08 13 B5 08 13 B5 07 01 30 01 FF 00 1E 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 B5 08 13 B5 07 01 30 45 07 00 26 FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 B5 08 13 B5 01 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 00 FF 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 00 FF 45 07 00 3A 00 46 07 00 1E 40 07 00 68 45 07 00 3A 00 04 FF 00 00 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 07 00 F1 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 03 01 41 07 00 83 41 07 00 83 FF 00 01 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 08 36 08 08 36 03 07 00 03 41 07 00 83 41 07 00 03 41 07 00 7D FF 00 01 00 02 07 00 03 07 00 41 00 02 07 00 E6 07 01 12 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D 01 FF 00 01 00 02 07 00 03 07 00 41 00 01 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 07 39 08 07 39 03 07 00 83 FF 00 01 00 02 07 00 03 07 00 41 00 03 07 00 E6 08 13 B5 08 13 B5 41 07 00 41 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 03 07 00 E6 08 0A 2B 08 0A 2B FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 83 07 00 03 FF 00 01 00 02 07 00 03 07 00 41 00 01 07 00 75 FD 00 01 01 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 83 03 03 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 E6 07 00 C9 41 07 00 72 FF 00 01 00 02 07 00 03 07 00 41 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 68 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 07 39 08 07 39 07 00 7D 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 0A 2B 08 0A 2B 03 03 03 01 FF 00 01 00 03 07 00 03 07 00 41 01 00 01 07 00 72 FC 00 01 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0B AE 08 0B AE 03 03 07 00 7D 41 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 41 02 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 FF 00 01 00 03 07 00 03 07 00 41 01 00 01 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 03 6B 08 03 6B 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 07 00 F1 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 04 BB 08 04 BB 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0A 2B 08 0A 2B 07 00 7D FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 03 41 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 03 6B 08 03 6B 03 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 0A 2B 08 0A 2B 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 41 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 A8 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 0A 2B 08 0A 2B 03 03 07 00 7D FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 07 00 7D FF 00 01 00 02 07 00 03 07 00 41 00 02 07 00 68 07 00 5A FD 00 01 01 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 05 07 00 E6 08 09 61 08 09 61 03 07 00 7D 01 01 FF 00 01 00 02 07 00 03 07 00 41 00 03 07 00 03 01 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 07 07 00 E6 08 08 36 08 08 36 03 03 03 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 02 07 00 03 03 41 07 00 03 41 07 00 7D FF 00 01 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 11 F3 08 11 F3 01 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 75 41 07 00 03 41 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 04 07 00 E6 08 0B AE 08 0B AE 07 00 7D FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 09 61 08 09 61 03 03 07 00 7D FF 00 01 00 02 07 00 03 07 00 41 00 03 07 00 03 01 07 00 F4 FD 00 01 01 01 01 FF 00 01 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 33 08 13 33 07 01 14 FF 00 01 00 02 07 00 03 07 00 41 00 04 07 00 E6 08 13 B5 08 13 B5 07 01 30 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 01 07 00 7D 41 07 00 03 01 41 07 00 83 FF 00 01 00 04 07 00 03 07 00 41 01 01 00 06 07 00 E6 08 08 36 08 08 36 03 03 07 00 7D FF 00 01 00 02 07 00 03 07 00 41 00 01 07 00 1E 43 05 44 07 00 1E 47 05 47 07 00 3A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     5367   5375   Ljava/util/NoSuchElementException;
        //  5367   5375   5367   5375   Ljava/lang/IndexOutOfBoundsException;
        //  5383   5385   3      8      Any
        //  71     78     78     79     Any
        //  71     78     71     72     Ljava/lang/ClassCastException;
        //  72     78     3      8      Any
        //  72     78     3      8      Any
        //  72     78     78     79     Ljava/lang/ArithmeticException;
        //  87     94     94     95     Any
        //  87     94     87     88     Any
        //  87     94     87     88     Any
        //  87     94     3      8      Ljava/lang/RuntimeException;
        //  87     94     87     88     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  187    194    194    195    Any
        //  187    194    187    188    Ljava/util/ConcurrentModificationException;
        //  188    194    187    188    Any
        //  188    194    194    195    Any
        //  187    194    3      8      Any
        //  201    208    208    209    Any
        //  202    208    208    209    Ljava/lang/IllegalStateException;
        //  202    208    3      8      Ljava/util/ConcurrentModificationException;
        //  202    208    208    209    Any
        //  202    208    201    202    Ljava/lang/NullPointerException;
        //  216    223    223    224    Any
        //  217    223    216    217    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  216    223    223    224    Any
        //  216    223    223    224    Any
        //  216    223    3      8      Ljava/lang/AssertionError;
        //  275    282    282    283    Any
        //  276    282    282    283    Ljava/lang/NegativeArraySizeException;
        //  276    282    3      8      Any
        //  276    282    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  275    282    275    276    Ljava/lang/ClassCastException;
        //  289    296    296    297    Any
        //  289    296    3      8      Ljava/lang/AssertionError;
        //  289    296    289    290    Ljava/lang/ArithmeticException;
        //  289    296    289    290    Ljava/lang/IndexOutOfBoundsException;
        //  289    296    3      8      Any
        //  319    326    326    327    Any
        //  320    326    319    320    Any
        //  319    326    319    320    Ljava/lang/NullPointerException;
        //  319    326    3      8      Ljava/util/ConcurrentModificationException;
        //  320    326    3      8      Ljava/lang/NullPointerException;
        //  426    433    433    434    Any
        //  427    433    426    427    Any
        //  427    433    426    427    Ljava/lang/IllegalArgumentException;
        //  426    433    426    427    Any
        //  426    433    3      8      Ljava/lang/NegativeArraySizeException;
        //  442    449    449    450    Any
        //  443    449    449    450    Any
        //  442    449    442    443    Any
        //  442    449    442    443    Ljava/lang/NullPointerException;
        //  442    449    449    450    Ljava/lang/NullPointerException;
        //  456    463    463    464    Any
        //  456    463    456    457    Ljava/lang/EnumConstantNotPresentException;
        //  457    463    463    464    Any
        //  456    463    3      8      Any
        //  456    463    3      8      Any
        //  610    617    617    618    Any
        //  611    617    610    611    Any
        //  611    617    3      8      Any
        //  610    617    617    618    Any
        //  610    617    3      8      Ljava/lang/UnsupportedOperationException;
        //  667    674    674    675    Any
        //  668    674    674    675    Ljava/util/NoSuchElementException;
        //  668    674    674    675    Ljava/lang/StringIndexOutOfBoundsException;
        //  668    674    667    668    Ljava/lang/NegativeArraySizeException;
        //  667    674    674    675    Any
        //  775    782    782    783    Any
        //  775    782    775    776    Ljava/lang/IllegalArgumentException;
        //  775    782    775    776    Ljava/lang/IllegalStateException;
        //  775    782    782    783    Ljava/lang/UnsupportedOperationException;
        //  775    782    775    776    Ljava/lang/EnumConstantNotPresentException;
        //  1010   1017   1017   1018   Any
        //  1011   1017   1017   1018   Ljava/lang/NullPointerException;
        //  1010   1017   1010   1011   Any
        //  1011   1017   1010   1011   Any
        //  1011   1017   3      8      Ljava/lang/IllegalStateException;
        //  1063   1070   1070   1071   Any
        //  1064   1070   1070   1071   Any
        //  1063   1070   1070   1071   Any
        //  1064   1070   3      8      Any
        //  1063   1070   1063   1064   Ljava/lang/IndexOutOfBoundsException;
        //  1124   1131   1131   1132   Any
        //  1124   1131   1131   1132   Ljava/lang/ClassCastException;
        //  1125   1131   1124   1125   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1124   1131   1124   1125   Ljava/lang/RuntimeException;
        //  1124   1131   1131   1132   Ljava/lang/NullPointerException;
        //  1138   1145   1145   1146   Any
        //  1139   1145   1138   1139   Ljava/lang/NegativeArraySizeException;
        //  1138   1145   1145   1146   Ljava/lang/ArithmeticException;
        //  1139   1145   1145   1146   Ljava/lang/NullPointerException;
        //  1138   1145   1145   1146   Ljava/lang/RuntimeException;
        //  1149   1156   1156   1157   Any
        //  1149   1156   1149   1150   Any
        //  1150   1156   1149   1150   Any
        //  1150   1156   1156   1157   Any
        //  1150   1156   1156   1157   Any
        //  1268   1274   1274   1275   Any
        //  1268   1274   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1268   1274   1274   1275   Any
        //  1268   1274   3      8      Ljava/lang/NegativeArraySizeException;
        //  1268   1274   1274   1275   Any
        //  1282   1288   1288   1289   Any
        //  1282   1288   3      8      Any
        //  1282   1288   3      8      Any
        //  1282   1288   3      8      Any
        //  1282   1288   3      8      Any
        //  1339   1346   1346   1347   Any
        //  1340   1346   3      8      Ljava/lang/AssertionError;
        //  1340   1346   1346   1347   Ljava/lang/NullPointerException;
        //  1339   1346   1339   1340   Ljava/lang/NegativeArraySizeException;
        //  1340   1346   1346   1347   Any
        //  1351   1357   1357   1358   Any
        //  1351   1357   1357   1358   Ljava/lang/NumberFormatException;
        //  1351   1357   3      8      Ljava/lang/IllegalArgumentException;
        //  1351   1357   3      8      Any
        //  1351   1357   3      8      Any
        //  1411   1418   1418   1419   Any
        //  1411   1418   3      8      Any
        //  1411   1418   1418   1419   Any
        //  1412   1418   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1412   1418   1411   1412   Ljava/lang/IndexOutOfBoundsException;
        //  1425   1432   1432   1433   Any
        //  1426   1432   1432   1433   Any
        //  1425   1432   1425   1426   Ljava/lang/UnsupportedOperationException;
        //  1425   1432   1432   1433   Any
        //  1426   1432   1432   1433   Any
        //  1501   1508   1508   1509   Any
        //  1502   1508   1508   1509   Ljava/lang/AssertionError;
        //  1502   1508   3      8      Ljava/lang/AssertionError;
        //  1501   1508   1508   1509   Ljava/lang/NumberFormatException;
        //  1502   1508   1501   1502   Any
        //  1512   1519   1519   1520   Any
        //  1513   1519   1512   1513   Any
        //  1512   1519   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1512   1519   3      8      Any
        //  1512   1519   1519   1520   Ljava/lang/EnumConstantNotPresentException;
        //  1634   1640   1640   1641   Any
        //  1634   1640   1640   1641   Any
        //  1634   1640   3      8      Any
        //  1634   1640   3      8      Ljava/lang/AssertionError;
        //  1634   1640   3      8      Any
        //  1644   1651   1651   1652   Any
        //  1645   1651   3      8      Any
        //  1645   1651   1644   1645   Ljava/lang/UnsupportedOperationException;
        //  1644   1651   1644   1645   Any
        //  1644   1651   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1775   1782   1782   1783   Any
        //  1775   1782   1775   1776   Any
        //  1776   1782   3      8      Ljava/lang/UnsupportedOperationException;
        //  1775   1782   3      8      Ljava/lang/ClassCastException;
        //  1775   1782   3      8      Any
        //  1787   1793   1793   1794   Any
        //  1787   1793   1793   1794   Ljava/lang/NegativeArraySizeException;
        //  1787   1793   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1787   1793   3      8      Any
        //  1787   1793   1793   1794   Any
        //  1985   1992   1992   1993   Any
        //  1986   1992   1985   1986   Any
        //  1985   1992   3      8      Any
        //  1986   1992   1992   1993   Ljava/lang/IllegalStateException;
        //  1985   1992   3      8      Ljava/lang/ArithmeticException;
        //  1997   2003   2003   2004   Any
        //  1997   2003   2003   2004   Ljava/lang/NullPointerException;
        //  1997   2003   2003   2004   Any
        //  1997   2003   2003   2004   Any
        //  1997   2003   3      8      Ljava/lang/NegativeArraySizeException;
        //  2328   2334   2334   2335   Any
        //  2328   2334   3      8      Ljava/lang/IllegalStateException;
        //  2328   2334   2334   2335   Any
        //  2328   2334   3      8      Any
        //  2328   2334   3      8      Ljava/lang/NullPointerException;
        //  2338   2345   2345   2346   Any
        //  2339   2345   2338   2339   Ljava/lang/NullPointerException;
        //  2338   2345   2345   2346   Ljava/lang/RuntimeException;
        //  2339   2345   2345   2346   Ljava/lang/NegativeArraySizeException;
        //  2338   2345   2345   2346   Ljava/lang/StringIndexOutOfBoundsException;
        //  2530   2537   2537   2538   Any
        //  2531   2537   3      8      Any
        //  2530   2537   2530   2531   Any
        //  2531   2537   3      8      Any
        //  2531   2537   2537   2538   Any
        //  2541   2548   2548   2549   Any
        //  2541   2548   3      8      Any
        //  2541   2548   2548   2549   Ljava/lang/RuntimeException;
        //  2541   2548   3      8      Ljava/lang/NegativeArraySizeException;
        //  2541   2548   2541   2542   Any
        //  2915   2922   2922   2923   Any
        //  2916   2922   3      8      Ljava/lang/IllegalArgumentException;
        //  2916   2922   3      8      Ljava/util/NoSuchElementException;
        //  2915   2922   2915   2916   Ljava/lang/AssertionError;
        //  2916   2922   2922   2923   Ljava/lang/IllegalArgumentException;
        //  2926   2933   2933   2934   Any
        //  2927   2933   2933   2934   Any
        //  2927   2933   2926   2927   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2927   2933   2933   2934   Any
        //  2926   2933   3      8      Any
        //  3122   3129   3129   3130   Any
        //  3123   3129   3      8      Ljava/lang/AssertionError;
        //  3122   3129   3129   3130   Any
        //  3122   3129   3122   3123   Any
        //  3122   3129   3      8      Any
        //  3134   3140   3140   3141   Any
        //  3134   3140   3140   3141   Ljava/lang/NumberFormatException;
        //  3134   3140   3      8      Any
        //  3134   3140   3140   3141   Any
        //  3134   3140   3      8      Ljava/util/NoSuchElementException;
        //  3519   3526   3526   3527   Any
        //  3520   3526   3519   3520   Any
        //  3519   3526   3      8      Ljava/util/NoSuchElementException;
        //  3520   3526   3526   3527   Any
        //  3519   3526   3519   3520   Ljava/lang/StringIndexOutOfBoundsException;
        //  3579   3586   3586   3587   Any
        //  3579   3586   3586   3587   Any
        //  3579   3586   3579   3580   Ljava/lang/IndexOutOfBoundsException;
        //  3579   3586   3586   3587   Any
        //  3580   3586   3579   3580   Any
        //  3742   3749   3749   3750   Any
        //  3742   3749   3742   3743   Any
        //  3742   3749   3749   3750   Any
        //  3743   3749   3749   3750   Ljava/lang/IndexOutOfBoundsException;
        //  3743   3749   3749   3750   Any
        //  3852   3859   3859   3860   Any
        //  3853   3859   3859   3860   Ljava/lang/RuntimeException;
        //  3853   3859   3      8      Any
        //  3852   3859   3859   3860   Any
        //  3852   3859   3852   3853   Ljava/util/ConcurrentModificationException;
        //  4215   4221   4221   4222   Any
        //  4215   4221   3      8      Any
        //  4215   4221   4221   4222   Ljava/lang/UnsupportedOperationException;
        //  4215   4221   4221   4222   Any
        //  4215   4221   3      8      Ljava/lang/UnsupportedOperationException;
        //  4306   4313   4313   4314   Any
        //  4306   4313   3      8      Any
        //  4307   4313   4306   4307   Ljava/lang/StringIndexOutOfBoundsException;
        //  4306   4313   4306   4307   Ljava/lang/RuntimeException;
        //  4306   4313   4306   4307   Any
        //  4414   4421   4421   4422   Any
        //  4415   4421   4421   4422   Any
        //  4415   4421   4421   4422   Ljava/lang/UnsupportedOperationException;
        //  4414   4421   4414   4415   Ljava/util/ConcurrentModificationException;
        //  4414   4421   4414   4415   Any
        //  4475   4482   4482   4483   Any
        //  4475   4482   4475   4476   Ljava/lang/IndexOutOfBoundsException;
        //  4475   4482   4482   4483   Ljava/lang/AssertionError;
        //  4475   4482   4475   4476   Ljava/lang/NumberFormatException;
        //  4475   4482   3      8      Any
        //  4532   4538   4538   4539   Any
        //  4532   4538   4538   4539   Any
        //  4532   4538   4538   4539   Ljava/lang/IllegalArgumentException;
        //  4532   4538   4538   4539   Any
        //  4532   4538   4538   4539   Any
        //  4651   4658   4658   4659   Any
        //  4652   4658   3      8      Ljava/lang/NegativeArraySizeException;
        //  4651   4658   4658   4659   Ljava/lang/RuntimeException;
        //  4652   4658   3      8      Any
        //  4652   4658   4651   4652   Ljava/lang/IllegalStateException;
        //  4666   4672   4672   4673   Any
        //  4666   4672   4672   4673   Any
        //  4666   4672   3      8      Any
        //  4666   4672   4672   4673   Any
        //  4666   4672   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4724   4730   4730   4731   Any
        //  4724   4730   4730   4731   Ljava/lang/EnumConstantNotPresentException;
        //  4724   4730   4730   4731   Any
        //  4724   4730   3      8      Any
        //  4724   4730   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  4734   4741   4741   4742   Any
        //  4735   4741   4734   4735   Ljava/lang/ArithmeticException;
        //  4734   4741   3      8      Ljava/lang/ArithmeticException;
        //  4735   4741   4741   4742   Ljava/lang/StringIndexOutOfBoundsException;
        //  4735   4741   4734   4735   Any
        //  4749   4756   4756   4757   Any
        //  4750   4756   4749   4750   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4750   4756   4756   4757   Ljava/lang/IllegalArgumentException;
        //  4749   4756   3      8      Any
        //  4750   4756   3      8      Any
        //  4807   4814   4814   4815   Any
        //  4808   4814   4814   4815   Ljava/lang/IndexOutOfBoundsException;
        //  4808   4814   4814   4815   Any
        //  4808   4814   4807   4808   Ljava/lang/StringIndexOutOfBoundsException;
        //  4807   4814   4814   4815   Ljava/lang/NullPointerException;
        //  4883   4890   4890   4891   Any
        //  4883   4890   4883   4884   Any
        //  4884   4890   4890   4891   Any
        //  4884   4890   4890   4891   Ljava/lang/EnumConstantNotPresentException;
        //  4884   4890   4883   4884   Any
        //  4894   4901   4901   4902   Any
        //  4895   4901   3      8      Ljava/lang/IllegalStateException;
        //  4895   4901   3      8      Any
        //  4895   4901   4894   4895   Any
        //  4894   4901   4894   4895   Ljava/lang/UnsupportedOperationException;
        //  4971   4978   4978   4979   Any
        //  4972   4978   4971   4972   Any
        //  4971   4978   4978   4979   Any
        //  4972   4978   4978   4979   Any
        //  4972   4978   4971   4972   Ljava/lang/NullPointerException;
        //  5027   5034   5034   5035   Any
        //  5028   5034   5027   5028   Ljava/lang/NullPointerException;
        //  5027   5034   5027   5028   Ljava/lang/UnsupportedOperationException;
        //  5028   5034   5027   5028   Ljava/lang/RuntimeException;
        //  5027   5034   5034   5035   Any
        //  5158   5165   5165   5166   Any
        //  5159   5165   5165   5166   Ljava/util/NoSuchElementException;
        //  5159   5165   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  5159   5165   5158   5159   Ljava/lang/NullPointerException;
        //  5159   5165   5165   5166   Any
        //  5169   5176   5176   5177   Any
        //  5170   5176   5176   5177   Ljava/lang/ArithmeticException;
        //  5170   5176   5176   5177   Any
        //  5169   5176   5176   5177   Any
        //  5170   5176   5169   5170   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5184   5191   5191   5192   Any
        //  5184   5191   5184   5185   Ljava/util/ConcurrentModificationException;
        //  5185   5191   3      8      Ljava/lang/NumberFormatException;
        //  5185   5191   5184   5185   Ljava/lang/RuntimeException;
        //  5185   5191   5184   5185   Ljava/util/NoSuchElementException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:624)
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
    
    public int c() {
        return fbS.bh(this, 1267480073);
    }
    
    public f57() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2381\u1486\u8a8d\ub3d6\uc9df\ued89\ub230"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u23a1\u1486\u8a8d\ub3d6\uc9ff\ued89\ub230"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u23b4\u149b\u8a8b\ub3d6\uc9d8\ued95\ub264\ue6b5\ud928\ue9ac\ua749\u1e58\ue199\uc5a8\u8135\u895d\u57ab\u7777\ubd7d\uc008\u2b77\uc23a\u6a75\u2d42\ud7d6\u35a5\u7d2a\u89ce\u8051\u8c82\u84cf\ufb27\u70b4\u9a56\u1b8f\uf102\u4979\u8801\ucac6\uff22\ub6be\u41b3\ub992\ub34d\u4c68\u8a80\u7c60\uce43\u7d4b\ueac3\ue6bd\u16d6\uee36\u379d\u46e6\ue19d\u0a05\u86a0\u1995\u0f43\u7778\u7299"
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            28
        //    22: ldc_w           46943763
        //    25: goto            31
        //    28: ldc_w           548656898
        //    31: ldc_w           1118841311
        //    34: ixor           
        //    35: lookupswitch {
        //          1081894860: 28
        //          1644429021: 60
        //          default: 783
        //        }
        //    60: invokestatic    invokestatic   !!! ERROR
        //    63: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    66: aload_0        
        //    67: new             Ldev/nuker/pyro/f0a;
        //    70: dup            
        //    71: ldc_w           "\u238f\u149d\u8abe\ub3cb\uc9c0\ued93\ub22a\ue6b0\ud947\ue9b2\ua74a\u1e55"
        //    74: invokestatic    invokestatic   !!! ERROR
        //    77: ldc_w           "\u23af\u149d\u8abe\ub3cb\uc9c0\ued93\ub22a\ue6b0\ud947\ue9b2\ua74a\u1e55"
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: aconst_null    
        //    84: iconst_0       
        //    85: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    88: putfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0a;
        //    91: aload_0        
        //    92: new             Ldev/nuker/pyro/f0d;
        //    95: dup            
        //    96: ldc_w           "\u2388\u1496\u8a98\ub3d5\uc9db\ued8e"
        //    99: getstatic       dev/nuker/pyro/fc.1:I
        //   102: ifeq            111
        //   105: ldc_w           -291949963
        //   108: goto            114
        //   111: ldc_w           52368693
        //   114: ldc_w           1662132180
        //   117: ixor           
        //   118: lookupswitch {
        //          -1920258655: 111
        //          1611467489: 144
        //          default: 765
        //        }
        //   144: invokestatic    invokestatic   !!! ERROR
        //   147: ldc_w           "\u23a8\u1496\u8a98\ub3d5\uc9db\ued8e"
        //   150: invokestatic    invokestatic   !!! ERROR
        //   153: aconst_null    
        //   154: ldc2_w          10.0
        //   157: dconst_0       
        //   158: ldc2_w          20.0
        //   161: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   164: putfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0d;
        //   167: getstatic       dev/nuker/pyro/fc.0:I
        //   170: ifeq            179
        //   173: ldc_w           -784648495
        //   176: goto            182
        //   179: ldc_w           1547170399
        //   182: ldc_w           467330013
        //   185: ixor           
        //   186: lookupswitch {
        //          -891169524: 179
        //          1206718850: 212
        //          default: 771
        //        }
        //   212: aload_0        
        //   213: new             Ldev/nuker/pyro/f0d;
        //   216: dup            
        //   217: ldc_w           "\u2384\u1496\u8a95\ub3d8\uc9d6"
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            232
        //   226: ldc_w           -1587532391
        //   229: goto            235
        //   232: ldc_w           2119025663
        //   235: ldc_w           1261253358
        //   238: ixor           
        //   239: lookupswitch {
        //          -364044425: 767
        //          667207802: 232
        //          default: 264
        //        }
        //   264: invokestatic    invokestatic   !!! ERROR
        //   267: ldc_w           "\u23a4\u1496\u8a95\ub3d8\uc9d6"
        //   270: invokestatic    invokestatic   !!! ERROR
        //   273: aconst_null    
        //   274: ldc2_w          0.7
        //   277: dconst_0       
        //   278: ldc2_w          0.9
        //   281: getstatic       dev/nuker/pyro/fc.1:I
        //   284: ifeq            293
        //   287: ldc_w           -997925311
        //   290: goto            296
        //   293: ldc_w           -1367037859
        //   296: ldc_w           1065333291
        //   299: ixor           
        //   300: lookupswitch {
        //          -67408790: 773
        //          1498165390: 293
        //          default: 328
        //        }
        //   328: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   331: putfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0d;
        //   334: aload_0        
        //   335: new             Ldev/nuker/pyro/f0g;
        //   338: dup            
        //   339: ldc_w           "\u2393\u149f\u8a96\ub3cd"
        //   342: invokestatic    invokestatic   !!! ERROR
        //   345: ldc_w           "\u23b3\u149f\u8a96\ub3cd"
        //   348: getstatic       dev/nuker/pyro/fc.0:I
        //   351: ifeq            360
        //   354: ldc_w           -1037839690
        //   357: goto            363
        //   360: ldc_w           135566329
        //   363: ldc_w           229661923
        //   366: ixor           
        //   367: lookupswitch {
        //          -812413355: 360
        //          94687002: 392
        //          default: 775
        //        }
        //   392: invokestatic    invokestatic   !!! ERROR
        //   395: aconst_null    
        //   396: bipush          6
        //   398: iconst_1       
        //   399: bipush          9
        //   401: getstatic       dev/nuker/pyro/fc.1:I
        //   404: ifeq            413
        //   407: ldc_w           -1532526014
        //   410: goto            416
        //   413: ldc_w           -542245169
        //   416: ldc_w           -1439225360
        //   419: ixor           
        //   420: lookupswitch {
        //          -1666809600: 413
        //          244362162: 779
        //          default: 448
        //        }
        //   448: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
        //   451: putfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //   454: aload_0        
        //   455: new             Ldev/nuker/pyro/f0a;
        //   458: dup            
        //   459: ldc_w           "\u238f\u149f\u8a9d\ub3ff\uc9c6\ued9e"
        //   462: getstatic       dev/nuker/pyro/fc.0:I
        //   465: ifeq            474
        //   468: ldc_w           -654954194
        //   471: goto            477
        //   474: ldc_w           1637308713
        //   477: ldc_w           -2071941618
        //   480: ixor           
        //   481: lookupswitch {
        //          1551277856: 761
        //          2046726386: 474
        //          default: 508
        //        }
        //   508: invokestatic    invokestatic   !!! ERROR
        //   511: ldc_w           "\u23d1\u14dd\u8ac0\ub3ff\uc9c6\ued9e"
        //   514: invokestatic    invokestatic   !!! ERROR
        //   517: aconst_null    
        //   518: iconst_1       
        //   519: getstatic       dev/nuker/pyro/fc.c:I
        //   522: ifge            531
        //   525: ldc_w           -1217787895
        //   528: goto            534
        //   531: ldc_w           1786341275
        //   534: ldc_w           740378321
        //   537: ixor           
        //   538: lookupswitch {
        //          -1689563432: 777
        //          -1305602309: 531
        //          default: 564
        //        }
        //   564: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   567: putfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0a;
        //   570: getstatic       dev/nuker/pyro/fc.1:I
        //   573: ifeq            582
        //   576: ldc_w           -2115491046
        //   579: goto            585
        //   582: ldc_w           -639554127
        //   585: ldc_w           -225741623
        //   588: ixor           
        //   589: lookupswitch {
        //          728390008: 616
        //          1935892435: 582
        //          default: 781
        //        }
        //   616: aload_0        
        //   617: new             Ldev/nuker/pyro/fbu;
        //   620: dup            
        //   621: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   624: getstatic       dev/nuker/pyro/fc.0:I
        //   627: ifeq            636
        //   630: ldc_w           -2015362752
        //   633: goto            639
        //   636: ldc_w           975935324
        //   639: ldc_w           -67960146
        //   642: ixor           
        //   643: lookupswitch {
        //          -1237499803: 636
        //          2081620974: 769
        //          default: 668
        //        }
        //   668: putfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fbu;
        //   671: aload_0        
        //   672: aload_0        
        //   673: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0a;
        //   676: invokevirtual   dev/nuker/pyro/f57.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   679: pop            
        //   680: getstatic       dev/nuker/pyro/fc.0:I
        //   683: ifeq            692
        //   686: ldc_w           -929441968
        //   689: goto            695
        //   692: ldc_w           285217460
        //   695: ldc_w           -1711816061
        //   698: ixor           
        //   699: lookupswitch {
        //          -1997025225: 724
        //          1366169043: 692
        //          default: 763
        //        }
        //   724: aload_0        
        //   725: aload_0        
        //   726: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0d;
        //   729: invokevirtual   dev/nuker/pyro/f57.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   732: pop            
        //   733: aload_0        
        //   734: aload_0        
        //   735: getfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0d;
        //   738: invokevirtual   dev/nuker/pyro/f57.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   741: pop            
        //   742: aload_0        
        //   743: aload_0        
        //   744: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/f0g;
        //   747: invokevirtual   dev/nuker/pyro/f57.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   750: pop            
        //   751: aload_0        
        //   752: aload_0        
        //   753: getfield        dev/nuker/pyro/f57.0:Ldev/nuker/pyro/f0a;
        //   756: invokevirtual   dev/nuker/pyro/f57.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   759: pop            
        //   760: return         
        //   761: aconst_null    
        //   762: athrow         
        //   763: aconst_null    
        //   764: athrow         
        //   765: aconst_null    
        //   766: athrow         
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
        //    StackMapTable: 00 30 FF 00 1C 00 01 06 00 04 06 07 02 70 07 02 70 07 02 70 FF 00 02 00 01 06 00 05 06 07 02 70 07 02 70 07 02 70 01 FF 00 1C 00 01 06 00 04 06 07 02 70 07 02 70 07 02 70 FF 00 32 00 01 07 00 03 00 04 07 00 03 08 00 5C 08 00 5C 07 02 70 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 00 5C 08 00 5C 07 02 70 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 00 5C 08 00 5C 07 02 70 22 42 01 1D FF 00 13 00 01 07 00 03 00 04 07 00 03 08 00 D5 08 00 D5 07 02 70 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 00 D5 08 00 D5 07 02 70 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 D5 08 00 D5 07 02 70 FF 00 1C 00 01 07 00 03 00 09 07 00 03 08 00 D5 08 00 D5 07 02 70 07 02 70 05 03 03 03 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 00 D5 08 00 D5 07 02 70 07 02 70 05 03 03 03 01 FF 00 1F 00 01 07 00 03 00 09 07 00 03 08 00 D5 08 00 D5 07 02 70 07 02 70 05 03 03 03 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 FF 00 14 00 01 07 00 03 00 09 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 05 01 01 01 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 05 01 01 01 01 FF 00 1F 00 01 07 00 03 00 09 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 05 01 01 01 FF 00 19 00 01 07 00 03 00 04 07 00 03 08 01 C7 08 01 C7 07 02 70 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 01 C7 08 01 C7 07 02 70 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 01 C7 08 01 C7 07 02 70 FF 00 16 00 01 07 00 03 00 07 07 00 03 08 01 C7 08 01 C7 07 02 70 07 02 70 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 01 C7 08 01 C7 07 02 70 07 02 70 05 01 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 01 C7 08 01 C7 07 02 70 07 02 70 05 01 11 42 01 1E FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 68 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 68 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 68 17 42 01 1C FF 00 24 00 01 07 00 03 00 04 07 00 03 08 01 C7 08 01 C7 07 02 70 01 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 5C 08 00 5C 07 02 70 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 D5 08 00 D5 07 02 70 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 68 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 00 D5 08 00 D5 07 02 70 07 02 70 05 03 03 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 01 C7 08 01 C7 07 02 70 07 02 70 05 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 01 4F 08 01 4F 07 02 70 07 02 70 05 01 01 01 01 FF 00 01 00 01 06 00 04 06 07 02 70 07 02 70 07 02 70
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          165
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            157
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            149
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            39
        //    33: ldc_w           2058441047
        //    36: goto            42
        //    39: ldc_w           2023631075
        //    42: ldc_w           -1697940858
        //    45: ixor           
        //    46: lookupswitch {
        //          -528864303: 138
        //          768241519: 39
        //          default: 72
        //        }
        //    72: aload_3        
        //    73: goto            77
        //    76: athrow         
        //    77: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    80: goto            84
        //    83: athrow         
        //    84: iload_1        
        //    85: ifeq            94
        //    88: ldc_w           -46644412
        //    91: goto            97
        //    94: ldc_w           -46644413
        //    97: ldc_w           1449033943
        //   100: ixor           
        //   101: tableswitch {
        //          1456310054: 124
        //          1456310055: 132
        //          default: 88
        //        }
        //   124: aload_0        
        //   125: iconst_m1      
        //   126: putfield        dev/nuker/pyro/f57.1:I
        //   129: goto            137
        //   132: aload_0        
        //   133: iconst_0       
        //   134: putfield        dev/nuker/pyro/f57.c:Z
        //   137: return         
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
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 02 72 00 00 16 02 00 02 72 00 00
        //    StackMapTable: 00 17 43 07 00 3A 04 FF 00 0B 00 00 00 01 07 00 3A FF 00 03 00 04 07 00 03 01 07 00 83 07 02 7C 00 00 FF 00 0E 00 04 07 00 03 01 07 00 83 07 02 7C 00 03 07 00 03 01 07 00 83 FF 00 02 00 04 07 00 03 01 07 00 83 07 02 7C 00 04 07 00 03 01 07 00 83 01 FF 00 1D 00 04 07 00 03 01 07 00 83 07 02 7C 00 03 07 00 03 01 07 00 83 43 07 00 3A FF 00 00 00 04 07 00 03 01 07 00 83 07 02 7C 00 04 07 00 03 01 07 00 83 07 02 7C 45 07 00 3A 00 03 05 42 01 1A 07 04 FF 00 00 00 04 07 00 03 01 07 00 83 07 02 7C 00 03 07 00 03 01 07 00 83 41 07 00 3A 43 05 44 07 00 3A 47 05 47 07 00 3A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     149    157    Any
        //  149    157    149    157    Ljava/lang/IndexOutOfBoundsException;
        //  165    167    3      8      Any
        //  76     83     83     84     Any
        //  76     83     3      8      Any
        //  76     83     83     84     Ljava/lang/IllegalStateException;
        //  76     83     3      8      Any
        //  76     83     76     77     Any
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
    
    public void c(final int n, final int n2) {
        fbS.1Z(this, 113010199, n, n2);
    }
}
