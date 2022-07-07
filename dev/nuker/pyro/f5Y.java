// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.List;

public class f5y extends fH
{
    public f0d c;
    public List<Integer> c;
    public int 1;
    public int 2;
    public boolean c;
    public int 3;
    public fbu c;
    public int 4;
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1500
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1492
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1484
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             1502307883
        //    35: goto            40
        //    38: ldc             -1235895721
        //    40: ldc             766430111
        //    42: ixor           
        //    43: lookupswitch {
        //          -1161357249: 38
        //          1948626356: 1469
        //          default: 68
        //        }
        //    68: aload_3        
        //    69: goto            73
        //    72: athrow         
        //    73: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/fc.1:I
        //    83: ifeq            91
        //    86: ldc             689075935
        //    88: goto            93
        //    91: ldc             -1561401994
        //    93: ldc             -1535722958
        //    95: ixor           
        //    96: lookupswitch {
        //          -1922773779: 1455
        //          1106003019: 91
        //          default: 124
        //        }
        //   124: aload_0        
        //   125: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   128: goto            132
        //   131: athrow         
        //   132: invokeinterface java/util/List.clear:()V
        //   137: goto            141
        //   140: athrow         
        //   141: aload_0        
        //   142: iconst_m1      
        //   143: putfield        dev/nuker/pyro/f5y.1:I
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            157
        //   152: ldc             -1652603562
        //   154: goto            159
        //   157: ldc             379994625
        //   159: ldc             -1403111838
        //   161: ixor           
        //   162: lookupswitch {
        //          -1158122397: 188
        //          824275764: 157
        //          default: 1445
        //        }
        //   188: aload_0        
        //   189: iconst_m1      
        //   190: putfield        dev/nuker/pyro/f5y.2:I
        //   193: aload_0        
        //   194: iconst_0       
        //   195: getstatic       dev/nuker/pyro/fc.1:I
        //   198: ifeq            206
        //   201: ldc             -948857751
        //   203: goto            208
        //   206: ldc             1100702461
        //   208: ldc             1814626978
        //   210: ixor           
        //   211: lookupswitch {
        //          -1420257589: 1451
        //          -1116223671: 206
        //          default: 236
        //        }
        //   236: putfield        dev/nuker/pyro/f5y.c:Z
        //   239: aload_0        
        //   240: iconst_m1      
        //   241: getstatic       dev/nuker/pyro/fc.1:I
        //   244: ifeq            252
        //   247: ldc             136066844
        //   249: goto            254
        //   252: ldc             1440840706
        //   254: ldc             1584637230
        //   256: ixor           
        //   257: lookupswitch {
        //          194173228: 284
        //          1450152498: 252
        //          default: 1441
        //        }
        //   284: putfield        dev/nuker/pyro/f5y.3:I
        //   287: aload_0        
        //   288: iconst_m1      
        //   289: putfield        dev/nuker/pyro/f5y.4:I
        //   292: iload_1        
        //   293: ifeq            1432
        //   296: aload_0        
        //   297: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   300: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   303: ifnull          1432
        //   306: iconst_0       
        //   307: istore          4
        //   309: iload           4
        //   311: bipush          9
        //   313: if_icmpge       667
        //   316: getstatic       dev/nuker/pyro/fc.c:I
        //   319: ifge            327
        //   322: ldc             1543601997
        //   324: goto            329
        //   327: ldc             -407714359
        //   329: ldc             -1187233736
        //   331: ixor           
        //   332: lookupswitch {
        //          -448970891: 327
        //          1586398705: 360
        //          default: 1443
        //        }
        //   360: aload_0        
        //   361: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   364: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   367: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   370: iload           4
        //   372: getstatic       dev/nuker/pyro/fc.c:I
        //   375: ifge            383
        //   378: ldc             864316413
        //   380: goto            385
        //   383: ldc             2071843963
        //   385: ldc             -1740044055
        //   387: ixor           
        //   388: lookupswitch {
        //          -1412603116: 383
        //          -483074926: 416
        //          default: 1461
        //        }
        //   416: goto            420
        //   419: athrow         
        //   420: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   423: goto            427
        //   426: athrow         
        //   427: astore          5
        //   429: aload           5
        //   431: goto            435
        //   434: athrow         
        //   435: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   438: goto            442
        //   441: athrow         
        //   442: ifne            661
        //   445: aload           5
        //   447: getstatic       dev/nuker/pyro/fc.1:I
        //   450: ifeq            458
        //   453: ldc             -1957006882
        //   455: goto            460
        //   458: ldc             -1579808682
        //   460: ldc             1065470279
        //   462: ixor           
        //   463: lookupswitch {
        //          -1260668775: 1447
        //          1526313965: 458
        //          default: 488
        //        }
        //   488: goto            492
        //   491: athrow         
        //   492: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   495: goto            499
        //   498: athrow         
        //   499: instanceof      Lnet/minecraft/item/ItemBow;
        //   502: ifeq            510
        //   505: ldc             -1130142153
        //   507: goto            512
        //   510: ldc             -1130142154
        //   512: ldc             -1374253107
        //   514: ixor           
        //   515: tableswitch {
        //          627823604: 536
        //          627823605: 661
        //          default: 505
        //        }
        //   536: getstatic       dev/nuker/pyro/fc.1:I
        //   539: ifeq            547
        //   542: ldc             -2118009413
        //   544: goto            549
        //   547: ldc             1050970781
        //   549: ldc             1118210268
        //   551: ixor           
        //   552: lookupswitch {
        //          -1016646297: 1459
        //          1437165265: 547
        //          default: 580
        //        }
        //   580: aload           5
        //   582: goto            586
        //   585: athrow         
        //   586: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //   589: goto            593
        //   592: athrow         
        //   593: getstatic       dev/nuker/pyro/fc.1:I
        //   596: ifeq            604
        //   599: ldc             -1117435496
        //   601: goto            606
        //   604: ldc             -1058205637
        //   606: ldc             1219465763
        //   608: ixor           
        //   609: lookupswitch {
        //          -171254853: 1463
        //          -113972437: 604
        //          default: 636
        //        }
        //   636: aload           5
        //   638: goto            642
        //   641: athrow         
        //   642: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   645: goto            649
        //   648: athrow         
        //   649: if_icmpge       661
        //   652: aload_0        
        //   653: iload           4
        //   655: putfield        dev/nuker/pyro/f5y.1:I
        //   658: goto            667
        //   661: iinc            4, 1
        //   664: goto            309
        //   667: aload_0        
        //   668: getfield        dev/nuker/pyro/f5y.1:I
        //   671: iconst_m1      
        //   672: if_icmpne       1001
        //   675: aload_0        
        //   676: getstatic       dev/nuker/pyro/fc.0:I
        //   679: ifeq            687
        //   682: ldc             -191493028
        //   684: goto            689
        //   687: ldc             -557756575
        //   689: ldc             927215274
        //   691: ixor           
        //   692: lookupswitch {
        //          -1009638666: 687
        //          -377134645: 720
        //          default: 1453
        //        }
        //   720: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   723: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   726: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   729: goto            733
        //   732: athrow         
        //   733: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   736: goto            740
        //   739: athrow         
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   747: goto            751
        //   750: athrow         
        //   751: instanceof      Lnet/minecraft/item/ItemBow;
        //   754: ifeq            1001
        //   757: aload_0        
        //   758: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   761: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   764: getstatic       dev/nuker/pyro/fc.1:I
        //   767: ifeq            775
        //   770: ldc             -704333492
        //   772: goto            777
        //   775: ldc             -217111736
        //   777: ldc             473983210
        //   779: ixor           
        //   780: lookupswitch {
        //          -901459546: 775
        //          -280015966: 808
        //          default: 1471
        //        }
        //   808: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   811: goto            815
        //   814: athrow         
        //   815: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   818: goto            822
        //   821: athrow         
        //   822: getstatic       dev/nuker/pyro/fc.c:I
        //   825: ifge            833
        //   828: ldc             2035238049
        //   830: goto            835
        //   833: ldc             1445365802
        //   835: ldc             634013599
        //   837: ixor           
        //   838: lookupswitch {
        //          1552220990: 833
        //          1944899509: 864
        //          default: 1449
        //        }
        //   864: goto            868
        //   867: athrow         
        //   868: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //   871: goto            875
        //   874: athrow         
        //   875: aload_0        
        //   876: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   879: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   882: getstatic       dev/nuker/pyro/fc.1:I
        //   885: ifeq            893
        //   888: ldc             582066992
        //   890: goto            895
        //   893: ldc             -1124921673
        //   895: ldc             -1775335030
        //   897: ixor           
        //   898: lookupswitch {
        //          -1264637254: 893
        //          719161149: 924
        //          default: 1433
        //        }
        //   924: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   927: goto            931
        //   930: athrow         
        //   931: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   934: goto            938
        //   937: athrow         
        //   938: getstatic       dev/nuker/pyro/fc.1:I
        //   941: ifeq            949
        //   944: ldc             -787677791
        //   946: goto            951
        //   949: ldc             644480660
        //   951: ldc             25861152
        //   953: ixor           
        //   954: lookupswitch {
        //          -796499583: 1465
        //          1320347904: 949
        //          default: 980
        //        }
        //   980: goto            984
        //   983: athrow         
        //   984: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   987: goto            991
        //   990: athrow         
        //   991: if_icmpge       1001
        //   994: aload_0        
        //   995: sipush          420
        //   998: putfield        dev/nuker/pyro/f5y.1:I
        //  1001: aload_0        
        //  1002: getfield        dev/nuker/pyro/f5y.1:I
        //  1005: iconst_m1      
        //  1006: if_icmpne       1014
        //  1009: ldc             1247438795
        //  1011: goto            1016
        //  1014: ldc             1247438794
        //  1016: ldc             594800675
        //  1018: ixor           
        //  1019: tableswitch {
        //          -766300208: 1040
        //          -766300207: 1179
        //          default: 1009
        //        }
        //  1040: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1043: ldc             "\u23ff\u149c\u8ac2\ub188\ucfb8\uedcf\ub264\ue6f4\udb76\uefdb\ua740\u1e44\ue1df\uc7a0\u874d\u891b\u57a5\u777f\ubf2e\uc67c\u2b23\uc27b\u6a3e\u2f49\ud1ed\u35ba\u7d24\u8981\u8212\u8aa8\u848e\ufb3d\u70fc\u9805\u1dfb\uf153\u493d"
        //  1045: goto            1049
        //  1048: athrow         
        //  1049: invokestatic    invokestatic   !!! ERROR
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: goto            1060
        //  1059: athrow         
        //  1060: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1063: goto            1067
        //  1066: athrow         
        //  1067: getstatic       dev/nuker/pyro/fc.1:I
        //  1070: ifeq            1078
        //  1073: ldc             -759581642
        //  1075: goto            1080
        //  1078: ldc             -2020591300
        //  1080: ldc             -1346527973
        //  1082: ixor           
        //  1083: lookupswitch {
        //          -1972543314: 1078
        //          2097424685: 1439
        //          default: 1108
        //        }
        //  1108: aload_0        
        //  1109: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fw;
        //  1112: iconst_0       
        //  1113: getstatic       dev/nuker/pyro/fc.0:I
        //  1116: ifeq            1124
        //  1119: ldc             -1157575819
        //  1121: goto            1126
        //  1124: ldc             2111960110
        //  1126: ldc             317331448
        //  1128: ixor           
        //  1129: lookupswitch {
        //          -1444225907: 1457
        //          1200143342: 1124
        //          default: 1156
        //        }
        //  1156: goto            1160
        //  1159: athrow         
        //  1160: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1163: goto            1167
        //  1166: athrow         
        //  1167: goto            1171
        //  1170: athrow         
        //  1171: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: return         
        //  1179: getstatic       dev/nuker/pyro/fc.0:I
        //  1182: ifeq            1190
        //  1185: ldc             62353433
        //  1187: goto            1192
        //  1190: ldc             -896444838
        //  1192: ldc             -2019756208
        //  1194: ixor           
        //  1195: lookupswitch {
        //          -2077522103: 1190
        //          1292738826: 1220
        //          default: 1467
        //        }
        //  1220: aload_0        
        //  1221: getstatic       dev/nuker/pyro/fc.0:I
        //  1224: ifeq            1232
        //  1227: ldc             -960358779
        //  1229: goto            1234
        //  1232: ldc             -715719110
        //  1234: ldc             47683333
        //  1236: ixor           
        //  1237: lookupswitch {
        //          -1005223552: 1473
        //          800455141: 1232
        //          default: 1264
        //        }
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: invokevirtual   dev/nuker/pyro/f5y.c:()V
        //  1271: goto            1275
        //  1274: athrow         
        //  1275: aload_0        
        //  1276: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //  1279: goto            1283
        //  1282: athrow         
        //  1283: invokeinterface java/util/List.isEmpty:()Z
        //  1288: goto            1292
        //  1291: athrow         
        //  1292: ifeq            1432
        //  1295: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1298: ldc             "\u23ff\u149c\u8ac2\ub188\ucfb8\uedcf\ub264\ue6f4\udb76\uefdb\ua740\u1e44\ue1df\uc7a0\u874d\u891b\u57a5\u7731\ubf35\uc633\u2b36\uc23e\u6a39\u2f42\ud1ab\u35aa\u7d28\u899d\u8201\u8ae4\u84c6\ufb26\u70e1\u9817\u1dea\uf144\u4978\u881b\uc896\uf94a\ub6ec\u41fc\ub9d9\ub14a\u4a4b"
        //  1300: goto            1304
        //  1303: athrow         
        //  1304: invokestatic    invokestatic   !!! ERROR
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: getstatic       dev/nuker/pyro/fc.1:I
        //  1314: ifeq            1322
        //  1317: ldc             1402368186
        //  1319: goto            1324
        //  1322: ldc             -1412408024
        //  1324: ldc             -1972930320
        //  1326: ixor           
        //  1327: lookupswitch {
        //          -638515126: 1322
        //          565650904: 1352
        //          default: 1435
        //        }
        //  1352: goto            1356
        //  1355: athrow         
        //  1356: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1359: goto            1363
        //  1362: athrow         
        //  1363: aload_0        
        //  1364: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fw;
        //  1367: iconst_0       
        //  1368: goto            1372
        //  1371: athrow         
        //  1372: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1375: goto            1379
        //  1378: athrow         
        //  1379: getstatic       dev/nuker/pyro/fc.c:I
        //  1382: ifge            1390
        //  1385: ldc             -1332318972
        //  1387: goto            1392
        //  1390: ldc             1562931575
        //  1392: ldc             502998798
        //  1394: ixor           
        //  1395: lookupswitch {
        //          -1385346550: 1437
        //          -1077778314: 1390
        //          default: 1420
        //        }
        //  1420: goto            1424
        //  1423: athrow         
        //  1424: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1427: goto            1431
        //  1430: athrow         
        //  1431: return         
        //  1432: return         
        //  1433: aconst_null    
        //  1434: athrow         
        //  1435: aconst_null    
        //  1436: athrow         
        //  1437: aconst_null    
        //  1438: athrow         
        //  1439: aconst_null    
        //  1440: athrow         
        //  1441: aconst_null    
        //  1442: athrow         
        //  1443: aconst_null    
        //  1444: athrow         
        //  1445: aconst_null    
        //  1446: athrow         
        //  1447: aconst_null    
        //  1448: athrow         
        //  1449: aconst_null    
        //  1450: athrow         
        //  1451: aconst_null    
        //  1452: athrow         
        //  1453: aconst_null    
        //  1454: athrow         
        //  1455: aconst_null    
        //  1456: athrow         
        //  1457: aconst_null    
        //  1458: athrow         
        //  1459: aconst_null    
        //  1460: athrow         
        //  1461: aconst_null    
        //  1462: athrow         
        //  1463: aconst_null    
        //  1464: athrow         
        //  1465: aconst_null    
        //  1466: athrow         
        //  1467: aconst_null    
        //  1468: athrow         
        //  1469: aconst_null    
        //  1470: athrow         
        //  1471: aconst_null    
        //  1472: athrow         
        //  1473: aconst_null    
        //  1474: athrow         
        //  1475: pop            
        //  1476: goto            24
        //  1479: pop            
        //  1480: aconst_null    
        //  1481: goto            1475
        //  1484: dup            
        //  1485: ifnull          1475
        //  1488: checkcast       Ljava/lang/Throwable;
        //  1491: athrow         
        //  1492: dup            
        //  1493: ifnull          1479
        //  1496: checkcast       Ljava/lang/Throwable;
        //  1499: athrow         
        //  1500: aconst_null    
        //  1501: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 12 00 00 16 02 00 00 12 00 00
        //    StackMapTable: 00 C7 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FF 00 03 00 04 07 00 03 01 07 00 6B 07 00 ED 00 00 FF 00 0D 00 04 07 00 03 01 07 00 6B 07 00 ED 00 03 07 00 03 01 07 00 6B FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 04 07 00 03 01 07 00 6B 01 FF 00 1B 00 04 07 00 03 01 07 00 6B 07 00 ED 00 03 07 00 03 01 07 00 6B 43 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6B 07 00 ED 00 04 07 00 03 01 07 00 6B 07 00 ED 45 07 00 36 00 0A 41 01 1E 46 07 00 2E 40 07 00 44 47 07 00 36 00 0F 41 01 1C FF 00 11 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 03 07 00 03 01 01 FF 00 1B 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FF 00 0F 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FC 00 18 01 11 41 01 1E FF 00 16 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 74 01 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 07 00 74 01 01 FF 00 1E 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 74 01 42 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 74 01 45 07 00 36 40 07 00 7A FF 00 06 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 01 07 00 2E 40 07 00 7A 45 07 00 36 40 01 4F 07 00 7A FF 00 01 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 02 07 00 7A 01 5B 07 00 7A 42 07 00 36 40 07 00 7A 45 07 00 36 40 07 00 EF 05 04 41 01 17 0A 41 01 1E 44 07 00 36 40 07 00 7A 45 07 00 36 40 01 4A 01 FF 00 01 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 02 01 01 5D 01 44 07 00 36 FF 00 00 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 02 01 07 00 7A 45 07 00 36 FF 00 00 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 02 01 01 0B FA 00 05 53 07 00 03 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 03 01 5E 07 00 03 4B 07 00 2E FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 6B 07 00 9C 45 07 00 36 40 07 00 7A 42 07 00 2E 40 07 00 7A 45 07 00 36 40 07 00 EF 57 07 00 6B FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 6B 01 5E 07 00 6B 45 07 00 1A FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 6B 07 00 9C 45 07 00 36 40 07 00 7A 4A 07 00 7A FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 7A 01 5C 07 00 7A 42 07 00 36 40 07 00 7A 45 07 00 36 40 01 FF 00 11 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 6B FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 01 07 00 6B 01 FF 00 1C 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 6B 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 01 07 00 6B 07 00 9C 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 7A FF 00 0A 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 7A FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 01 07 00 7A 01 FF 00 1C 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 7A 42 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 7A 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 01 09 07 04 41 01 17 47 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 42 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 45 07 00 36 00 0A 41 01 1B FF 00 0F 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 01 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 07 00 D5 01 01 FF 00 1D 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 01 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 01 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF 42 07 00 2C FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF 45 07 00 36 00 00 0A 41 01 1B 4B 07 00 03 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 03 01 5D 07 00 03 42 07 00 14 40 07 00 03 45 07 00 36 00 46 07 00 36 40 07 00 44 47 07 00 36 40 01 4A 07 00 2E FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 FF 00 0A 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 07 00 B5 07 00 F1 01 FF 00 1B 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 42 07 00 30 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 45 07 00 36 00 FF 00 07 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 01 45 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF FF 00 0A 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 03 07 00 D5 07 00 CF 01 FF 00 1B 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF 45 07 00 36 00 FA 00 00 FF 00 00 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 6B FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 B5 07 00 F1 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 07 00 CF 01 FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FC 00 01 01 FA 00 01 FF 00 01 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 01 07 00 7A FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 01 07 00 7A FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 02 07 00 03 01 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 01 07 00 03 FA 00 01 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 D5 01 FC 00 01 07 00 7A FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 07 00 74 01 FF 00 01 00 06 07 00 03 01 07 00 6B 07 00 ED 01 07 00 7A 00 01 01 FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 02 01 07 00 7A 01 FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 03 07 00 03 01 07 00 6B FF 00 01 00 05 07 00 03 01 07 00 6B 07 00 ED 01 00 01 07 00 6B 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 6B 07 00 ED 00 01 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1484   1492   Any
        //  1484   1492   1484   1492   Ljava/lang/NegativeArraySizeException;
        //  1500   1502   3      8      Ljava/lang/NullPointerException;
        //  72     79     79     80     Any
        //  73     79     3      8      Any
        //  73     79     79     80     Ljava/lang/AssertionError;
        //  72     79     72     73     Any
        //  73     79     3      8      Ljava/lang/AssertionError;
        //  131    140    140    141    Any
        //  131    140    131    132    Ljava/util/NoSuchElementException;
        //  131    140    131    132    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  132    140    3      8      Ljava/lang/IllegalStateException;
        //  132    140    131    132    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  419    426    426    427    Any
        //  420    426    426    427    Ljava/lang/AssertionError;
        //  419    426    3      8      Ljava/lang/NegativeArraySizeException;
        //  420    426    419    420    Any
        //  419    426    3      8      Any
        //  434    441    441    442    Any
        //  435    441    434    435    Ljava/lang/IllegalArgumentException;
        //  434    441    434    435    Ljava/lang/StringIndexOutOfBoundsException;
        //  435    441    3      8      Any
        //  435    441    434    435    Ljava/lang/NullPointerException;
        //  491    498    498    499    Any
        //  492    498    498    499    Ljava/lang/StringIndexOutOfBoundsException;
        //  492    498    491    492    Any
        //  492    498    498    499    Ljava/lang/IllegalStateException;
        //  491    498    3      8      Any
        //  585    592    592    593    Any
        //  586    592    3      8      Any
        //  585    592    3      8      Any
        //  586    592    592    593    Ljava/lang/AssertionError;
        //  585    592    585    586    Any
        //  641    648    648    649    Any
        //  641    648    641    642    Ljava/lang/StringIndexOutOfBoundsException;
        //  641    648    3      8      Ljava/lang/IllegalArgumentException;
        //  641    648    641    642    Any
        //  641    648    641    642    Any
        //  732    739    739    740    Any
        //  733    739    3      8      Any
        //  733    739    732    733    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  732    739    739    740    Any
        //  732    739    732    733    Ljava/lang/NegativeArraySizeException;
        //  743    750    750    751    Any
        //  744    750    743    744    Ljava/lang/EnumConstantNotPresentException;
        //  744    750    3      8      Any
        //  743    750    750    751    Ljava/lang/ArithmeticException;
        //  744    750    743    744    Ljava/lang/ArithmeticException;
        //  814    821    821    822    Any
        //  814    821    814    815    Ljava/util/NoSuchElementException;
        //  815    821    3      8      Any
        //  814    821    821    822    Ljava/lang/NegativeArraySizeException;
        //  814    821    821    822    Any
        //  867    874    874    875    Any
        //  867    874    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  867    874    874    875    Ljava/lang/ClassCastException;
        //  868    874    867    868    Any
        //  867    874    867    868    Ljava/lang/ClassCastException;
        //  930    937    937    938    Any
        //  930    937    3      8      Any
        //  930    937    937    938    Any
        //  931    937    930    931    Any
        //  931    937    930    931    Ljava/lang/IllegalStateException;
        //  983    990    990    991    Any
        //  984    990    983    984    Any
        //  984    990    983    984    Any
        //  983    990    990    991    Any
        //  983    990    3      8      Any
        //  1048   1055   1055   1056   Any
        //  1048   1055   1048   1049   Ljava/lang/StringIndexOutOfBoundsException;
        //  1049   1055   1048   1049   Ljava/lang/AssertionError;
        //  1049   1055   3      8      Any
        //  1049   1055   1048   1049   Ljava/util/ConcurrentModificationException;
        //  1059   1066   1066   1067   Any
        //  1059   1066   1059   1060   Ljava/lang/IllegalArgumentException;
        //  1060   1066   3      8      Ljava/lang/NumberFormatException;
        //  1060   1066   1059   1060   Any
        //  1059   1066   1059   1060   Any
        //  1160   1166   1166   1167   Any
        //  1160   1166   1166   1167   Ljava/lang/IllegalArgumentException;
        //  1160   1166   3      8      Ljava/lang/RuntimeException;
        //  1160   1166   1166   1167   Ljava/lang/ArithmeticException;
        //  1160   1166   1166   1167   Any
        //  1170   1177   1177   1178   Any
        //  1171   1177   1170   1171   Ljava/lang/NumberFormatException;
        //  1170   1177   3      8      Any
        //  1171   1177   1177   1178   Ljava/lang/ClassCastException;
        //  1171   1177   1177   1178   Ljava/lang/EnumConstantNotPresentException;
        //  1267   1274   1274   1275   Any
        //  1267   1274   1267   1268   Ljava/lang/NegativeArraySizeException;
        //  1268   1274   3      8      Ljava/util/NoSuchElementException;
        //  1268   1274   3      8      Ljava/lang/RuntimeException;
        //  1268   1274   3      8      Any
        //  1282   1291   1291   1292   Any
        //  1282   1291   1282   1283   Ljava/lang/StringIndexOutOfBoundsException;
        //  1283   1291   1282   1283   Any
        //  1282   1291   3      8      Any
        //  1282   1291   1282   1283   Ljava/lang/NumberFormatException;
        //  1303   1310   1310   1311   Any
        //  1303   1310   3      8      Ljava/lang/RuntimeException;
        //  1304   1310   3      8      Any
        //  1304   1310   1303   1304   Ljava/lang/EnumConstantNotPresentException;
        //  1303   1310   1303   1304   Ljava/util/ConcurrentModificationException;
        //  1355   1362   1362   1363   Any
        //  1355   1362   1355   1356   Ljava/lang/UnsupportedOperationException;
        //  1356   1362   3      8      Ljava/lang/NullPointerException;
        //  1356   1362   1362   1363   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1355   1362   1362   1363   Any
        //  1372   1378   1378   1379   Any
        //  1372   1378   1378   1379   Ljava/lang/UnsupportedOperationException;
        //  1372   1378   3      8      Any
        //  1372   1378   3      8      Ljava/util/NoSuchElementException;
        //  1372   1378   1378   1379   Any
        //  1424   1430   1430   1431   Any
        //  1424   1430   3      8      Ljava/lang/AssertionError;
        //  1424   1430   3      8      Ljava/lang/NegativeArraySizeException;
        //  1424   1430   3      8      Ljava/util/NoSuchElementException;
        //  1424   1430   1430   1431   Ljava/util/NoSuchElementException;
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
    
    public void c(final EntityPlayerSP p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          647
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            639
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            631
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iconst_m1      
        //    26: putfield        dev/nuker/pyro/f5y.3:I
        //    29: aload_0        
        //    30: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fbu;
        //    33: goto            37
        //    36: athrow         
        //    37: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //    40: goto            44
        //    43: athrow         
        //    44: aload_0        
        //    45: getstatic       dev/nuker/pyro/fc.0:I
        //    48: ifeq            56
        //    51: ldc             515164390
        //    53: goto            58
        //    56: ldc             803085747
        //    58: ldc             -1403076766
        //    60: ixor           
        //    61: lookupswitch {
        //          -1293256828: 610
        //          1414582098: 56
        //          default: 88
        //        }
        //    88: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //    91: getstatic       dev/nuker/pyro/fc.0:I
        //    94: ifeq            102
        //    97: ldc             1799484993
        //    99: goto            104
        //   102: ldc             -1054120452
        //   104: ldc             -1553604459
        //   106: ixor           
        //   107: lookupswitch {
        //          -937158956: 102
        //          1649313129: 132
        //          default: 614
        //        }
        //   132: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   135: getstatic       dev/nuker/pyro/fc.c:I
        //   138: ifge            146
        //   141: ldc             -1601266045
        //   143: goto            149
        //   146: ldc_w           317581333
        //   149: ldc_w           -1907904623
        //   152: ixor           
        //   153: lookupswitch {
        //          -128522901: 146
        //          784937234: 616
        //          default: 180
        //        }
        //   180: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   183: new             Lnet/minecraft/network/play/client/CPacketPlayerDigging;
        //   186: dup            
        //   187: getstatic       net/minecraft/network/play/client/CPacketPlayerDigging$Action.RELEASE_USE_ITEM:Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
        //   190: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //   193: aload_0        
        //   194: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   197: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   200: goto            204
        //   203: athrow         
        //   204: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174811_aO:()Lnet/minecraft/util/EnumFacing;
        //   207: goto            211
        //   210: athrow         
        //   211: goto            215
        //   214: athrow         
        //   215: invokespecial   net/minecraft/network/play/client/CPacketPlayerDigging.<init>:(Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   218: goto            222
        //   221: athrow         
        //   222: getstatic       dev/nuker/pyro/fc.0:I
        //   225: ifeq            234
        //   228: ldc_w           -1852367344
        //   231: goto            237
        //   234: ldc_w           1422777236
        //   237: ldc_w           -1022468766
        //   240: ixor           
        //   241: lookupswitch {
        //          -1385168089: 234
        //          1385775986: 606
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   275: goto            279
        //   278: athrow         
        //   279: aload_0        
        //   280: getfield        dev/nuker/pyro/f5y.2:I
        //   283: iconst_m1      
        //   284: if_icmpeq       340
        //   287: getstatic       dev/nuker/pyro/fc.1:I
        //   290: ifeq            299
        //   293: ldc_w           -650602405
        //   296: goto            302
        //   299: ldc_w           177363702
        //   302: ldc_w           -140408978
        //   305: ixor           
        //   306: lookupswitch {
        //          -46932584: 332
        //          781786933: 299
        //          default: 604
        //        }
        //   332: aload_0        
        //   333: iconst_3       
        //   334: putfield        dev/nuker/pyro/f5y.4:I
        //   337: goto            603
        //   340: getstatic       dev/nuker/pyro/fc.0:I
        //   343: ifeq            352
        //   346: ldc_w           480925877
        //   349: goto            355
        //   352: ldc_w           736974031
        //   355: ldc_w           861502791
        //   358: ixor           
        //   359: lookupswitch {
        //          804464114: 612
        //          1280481893: 352
        //          default: 384
        //        }
        //   384: aload_0        
        //   385: iconst_0       
        //   386: putfield        dev/nuker/pyro/f5y.c:Z
        //   389: aload_0        
        //   390: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   393: goto            397
        //   396: athrow         
        //   397: invokeinterface java/util/List.isEmpty:()Z
        //   402: goto            406
        //   405: athrow         
        //   406: ifeq            603
        //   409: getstatic       dev/nuker/pyro/fc.0:I
        //   412: ifeq            421
        //   415: ldc_w           82916065
        //   418: goto            424
        //   421: ldc_w           -708301889
        //   424: ldc_w           910846915
        //   427: ixor           
        //   428: lookupswitch {
        //          -478003076: 456
        //          851138850: 421
        //          default: 618
        //        }
        //   456: aload_0        
        //   457: getstatic       dev/nuker/pyro/fc.1:I
        //   460: ifeq            469
        //   463: ldc_w           1920910552
        //   466: goto            472
        //   469: ldc_w           -170309649
        //   472: ldc_w           -961584105
        //   475: ixor           
        //   476: lookupswitch {
        //          -1261330225: 469
        //          863380472: 504
        //          default: 608
        //        }
        //   504: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fw;
        //   507: iconst_0       
        //   508: goto            512
        //   511: athrow         
        //   512: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   515: goto            519
        //   518: athrow         
        //   519: goto            523
        //   522: athrow         
        //   523: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   526: goto            530
        //   529: athrow         
        //   530: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   533: ldc_w           "\u23f7\u1486\u8ade\ub1de\ucfb9\uedd2\ub264\ue6f3\udb6a\uef8f\ua704\u1e43\ue1d0\uc7b3"
        //   536: goto            540
        //   539: athrow         
        //   540: invokestatic    invokestatic   !!! ERROR
        //   543: goto            547
        //   546: athrow         
        //   547: getstatic       dev/nuker/pyro/fc.1:I
        //   550: ifeq            559
        //   553: ldc_w           -233323140
        //   556: goto            562
        //   559: ldc_w           -100202622
        //   562: ldc_w           -1564002155
        //   565: ixor           
        //   566: lookupswitch {
        //          1355873769: 559
        //          1488994071: 592
        //          default: 620
        //        }
        //   592: goto            596
        //   595: athrow         
        //   596: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   599: goto            603
        //   602: athrow         
        //   603: return         
        //   604: aconst_null    
        //   605: athrow         
        //   606: aconst_null    
        //   607: athrow         
        //   608: aconst_null    
        //   609: athrow         
        //   610: aconst_null    
        //   611: athrow         
        //   612: aconst_null    
        //   613: athrow         
        //   614: aconst_null    
        //   615: athrow         
        //   616: aconst_null    
        //   617: athrow         
        //   618: aconst_null    
        //   619: athrow         
        //   620: aconst_null    
        //   621: athrow         
        //   622: pop            
        //   623: goto            24
        //   626: pop            
        //   627: aconst_null    
        //   628: goto            622
        //   631: dup            
        //   632: ifnull          622
        //   635: checkcast       Ljava/lang/Throwable;
        //   638: athrow         
        //   639: dup            
        //   640: ifnull          626
        //   643: checkcast       Ljava/lang/Throwable;
        //   646: athrow         
        //   647: aconst_null    
        //   648: athrow         
        //    StackMapTable: 00 52 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 00 6B 4B 07 00 20 40 07 00 F6 45 07 00 36 00 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 6B 00 02 07 00 03 01 5D 07 00 03 4D 07 00 62 FF 00 01 00 02 07 00 03 07 00 6B 00 02 07 00 62 01 5B 07 00 62 4D 07 00 6B FF 00 02 00 02 07 00 03 07 00 6B 00 02 07 00 6B 01 5E 07 00 6B FF 00 16 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 06 07 01 20 08 00 B7 08 00 B7 07 01 09 07 01 0F 07 00 6B 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 06 07 01 20 08 00 B7 08 00 B7 07 01 09 07 01 0F 07 01 37 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 6B 00 06 07 01 20 08 00 B7 08 00 B7 07 01 09 07 01 0F 07 01 37 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 01 20 07 01 07 FF 00 0B 00 02 07 00 03 07 00 6B 00 02 07 01 20 07 01 07 FF 00 02 00 02 07 00 03 07 00 6B 00 03 07 01 20 07 01 07 01 FF 00 1E 00 02 07 00 03 07 00 6B 00 02 07 01 20 07 01 07 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 01 20 07 01 07 45 07 00 36 00 13 42 01 1D 07 0B 42 01 1C 4B 07 00 2E 40 07 00 44 47 07 00 36 40 01 0E 42 01 1F 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 6B 00 02 07 00 03 01 5F 07 00 03 46 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 D5 01 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 D5 07 00 CF 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 D5 07 00 CF 45 07 00 36 00 48 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 FF 00 0B 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 FF 00 02 00 02 07 00 03 07 00 6B 00 03 07 00 B5 07 00 F1 01 FF 00 1D 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 45 07 00 36 00 00 FF 00 01 00 02 07 00 03 07 00 6B 00 02 07 01 20 07 01 07 41 07 00 03 41 07 00 03 01 41 07 00 62 41 07 00 6B 01 FF 00 01 00 02 07 00 03 07 00 6B 00 02 07 00 B5 07 00 F1 41 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     631    639    Ljava/lang/ClassCastException;
        //  631    639    631    639    Any
        //  647    649    3      8      Any
        //  36     43     43     44     Any
        //  36     43     36     37     Ljava/lang/IllegalArgumentException;
        //  36     43     43     44     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  37     43     3      8      Ljava/lang/NumberFormatException;
        //  36     43     43     44     Ljava/lang/NegativeArraySizeException;
        //  204    210    210    211    Any
        //  204    210    3      8      Ljava/lang/ClassCastException;
        //  204    210    3      8      Ljava/lang/RuntimeException;
        //  204    210    210    211    Ljava/lang/StringIndexOutOfBoundsException;
        //  204    210    3      8      Ljava/util/ConcurrentModificationException;
        //  214    221    221    222    Any
        //  215    221    214    215    Ljava/lang/NullPointerException;
        //  215    221    3      8      Ljava/lang/AssertionError;
        //  215    221    3      8      Ljava/util/NoSuchElementException;
        //  214    221    214    215    Ljava/lang/ClassCastException;
        //  271    278    278    279    Any
        //  271    278    278    279    Ljava/lang/IllegalArgumentException;
        //  272    278    278    279    Ljava/lang/NullPointerException;
        //  272    278    271    272    Any
        //  271    278    271    272    Ljava/util/ConcurrentModificationException;
        //  396    405    405    406    Any
        //  397    405    3      8      Ljava/lang/ArithmeticException;
        //  396    405    396    397    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  397    405    3      8      Ljava/lang/IllegalStateException;
        //  397    405    396    397    Ljava/lang/NumberFormatException;
        //  511    518    518    519    Any
        //  511    518    511    512    Any
        //  511    518    518    519    Any
        //  511    518    511    512    Ljava/lang/EnumConstantNotPresentException;
        //  512    518    511    512    Any
        //  522    529    529    530    Any
        //  522    529    522    523    Any
        //  522    529    529    530    Any
        //  522    529    3      8      Any
        //  522    529    3      8      Any
        //  539    546    546    547    Any
        //  540    546    3      8      Any
        //  540    546    539    540    Any
        //  539    546    3      8      Any
        //  540    546    539    540    Ljava/util/NoSuchElementException;
        //  595    602    602    603    Any
        //  596    602    602    603    Any
        //  595    602    595    596    Any
        //  596    602    3      8      Ljava/util/ConcurrentModificationException;
        //  595    602    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void 0(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          563
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            555
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            547
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5y.3:I
        //    28: iconst_m1      
        //    29: if_icmpeq       523
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            44
        //    38: ldc_w           1891218682
        //    41: goto            47
        //    44: ldc_w           1410376385
        //    47: ldc_w           -1821963625
        //    50: ixor           
        //    51: lookupswitch {
        //          -2132955461: 44
        //          -471941523: 524
        //          default: 76
        //        }
        //    76: aload_0        
        //    77: getstatic       dev/nuker/pyro/fc.0:I
        //    80: ifeq            89
        //    83: ldc_w           -885226599
        //    86: goto            92
        //    89: ldc_w           -1752917756
        //    92: ldc_w           -2005870125
        //    95: ixor           
        //    96: lookupswitch {
        //          536101079: 124
        //          1129077322: 89
        //          default: 528
        //        }
        //   124: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   127: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184612_cw:()I
        //   137: goto            141
        //   140: athrow         
        //   141: iconst_3       
        //   142: if_icmplt       151
        //   145: ldc_w           1305959015
        //   148: goto            154
        //   151: ldc_w           1305959016
        //   154: ldc_w           -1936058896
        //   157: ixor           
        //   158: tableswitch {
        //          -2103795922: 180
        //          -2103795921: 271
        //          default: 145
        //        }
        //   180: aload_1        
        //   181: goto            185
        //   184: athrow         
        //   185: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //   188: goto            192
        //   191: athrow         
        //   192: aload_1        
        //   193: ldc_w           -90.0
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //   203: goto            207
        //   206: athrow         
        //   207: getstatic       dev/nuker/pyro/fc.0:I
        //   210: ifeq            219
        //   213: ldc_w           -418683089
        //   216: goto            222
        //   219: ldc_w           -1248302246
        //   222: ldc_w           1023239918
        //   225: ixor           
        //   226: lookupswitch {
        //          -1989866060: 252
        //          -604634687: 219
        //          default: 530
        //        }
        //   252: aload_1        
        //   253: aload_0        
        //   254: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5y;)Ljava/util/function/Consumer;
        //   259: goto            263
        //   262: athrow         
        //   263: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //   266: goto            270
        //   269: athrow         
        //   270: return         
        //   271: aload_0        
        //   272: getfield        dev/nuker/pyro/f5y.3:I
        //   275: ifne            523
        //   278: aload_0        
        //   279: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   282: getstatic       dev/nuker/pyro/fc.1:I
        //   285: ifeq            294
        //   288: ldc_w           -1750036752
        //   291: goto            297
        //   294: ldc_w           -40983952
        //   297: ldc_w           897129682
        //   300: ixor           
        //   301: lookupswitch {
        //          -1563848158: 294
        //          -923287902: 328
        //          default: 536
        //        }
        //   328: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   331: aload_0        
        //   332: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   335: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   338: aload_0        
        //   339: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   342: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   345: aload_0        
        //   346: getstatic       dev/nuker/pyro/fc.0:I
        //   349: ifeq            358
        //   352: ldc_w           1599826205
        //   355: goto            361
        //   358: ldc_w           439289769
        //   361: ldc_w           -1989539442
        //   364: ixor           
        //   365: lookupswitch {
        //          -1067688146: 358
        //          -701407085: 526
        //          default: 392
        //        }
        //   392: getfield        dev/nuker/pyro/f5y.1:I
        //   395: sipush          420
        //   398: if_icmpne       407
        //   401: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   404: goto            410
        //   407: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   410: goto            414
        //   413: athrow         
        //   414: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187101_a:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //   417: goto            421
        //   420: athrow         
        //   421: pop            
        //   422: getstatic       dev/nuker/pyro/fc.0:I
        //   425: ifeq            434
        //   428: ldc_w           19583278
        //   431: goto            437
        //   434: ldc_w           -839080228
        //   437: ldc_w           672114985
        //   440: ixor           
        //   441: lookupswitch {
        //          -2130349171: 434
        //          690321415: 532
        //          default: 468
        //        }
        //   468: aload_0        
        //   469: dup            
        //   470: getfield        dev/nuker/pyro/f5y.3:I
        //   473: iconst_1       
        //   474: iadd           
        //   475: getstatic       dev/nuker/pyro/fc.0:I
        //   478: ifeq            487
        //   481: ldc_w           1433722201
        //   484: goto            490
        //   487: ldc_w           294500386
        //   490: ldc_w           -1444899280
        //   493: ixor           
        //   494: lookupswitch {
        //          -57390231: 534
        //          1136684159: 487
        //          default: 520
        //        }
        //   520: putfield        dev/nuker/pyro/f5y.3:I
        //   523: return         
        //   524: aconst_null    
        //   525: athrow         
        //   526: aconst_null    
        //   527: athrow         
        //   528: aconst_null    
        //   529: athrow         
        //   530: aconst_null    
        //   531: athrow         
        //   532: aconst_null    
        //   533: athrow         
        //   534: aconst_null    
        //   535: athrow         
        //   536: aconst_null    
        //   537: athrow         
        //   538: pop            
        //   539: goto            24
        //   542: pop            
        //   543: aconst_null    
        //   544: goto            538
        //   547: dup            
        //   548: ifnull          538
        //   551: checkcast       Ljava/lang/Throwable;
        //   554: athrow         
        //   555: dup            
        //   556: ifnull          542
        //   559: checkcast       Ljava/lang/Throwable;
        //   562: athrow         
        //   563: aconst_null    
        //   564: athrow         
        //    StackMapTable: 00 41 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 01 46 13 42 01 1C 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5F 07 00 03 48 07 00 36 40 07 00 6B 45 07 00 36 40 01 03 05 42 01 19 43 07 00 26 40 07 01 46 45 07 00 36 00 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 01 46 02 45 07 00 36 00 0B 42 01 1D FF 00 09 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 01 46 07 01 80 45 07 00 36 00 00 56 07 00 62 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 62 01 5E 07 00 62 FF 00 1D 00 02 07 00 03 07 01 46 00 04 07 01 74 07 00 6B 07 01 82 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 05 07 01 74 07 00 6B 07 01 82 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 46 00 04 07 01 74 07 00 6B 07 01 82 07 00 03 FF 00 0E 00 02 07 00 03 07 01 46 00 03 07 01 74 07 00 6B 07 01 82 FF 00 02 00 02 07 00 03 07 01 46 00 04 07 01 74 07 00 6B 07 01 82 07 00 9C FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 04 07 01 74 07 00 6B 07 01 82 07 00 9C 45 07 00 36 40 07 01 84 0C 42 01 1E FF 00 12 00 02 07 00 03 07 01 46 00 02 07 00 03 01 FF 00 02 00 02 07 00 03 07 01 46 00 03 07 00 03 01 01 FF 00 1D 00 02 07 00 03 07 01 46 00 02 07 00 03 01 02 00 FF 00 01 00 02 07 00 03 07 01 46 00 04 07 01 74 07 00 6B 07 01 82 07 00 03 41 07 00 03 01 01 FF 00 01 00 02 07 00 03 07 01 46 00 02 07 00 03 01 41 07 00 62 41 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     547    555    Any
        //  547    555    547    555    Any
        //  563    565    3      8      Ljava/lang/UnsupportedOperationException;
        //  133    140    140    141    Any
        //  133    140    3      8      Any
        //  133    140    3      8      Any
        //  134    140    133    134    Ljava/lang/UnsupportedOperationException;
        //  133    140    133    134    Any
        //  184    191    191    192    Any
        //  185    191    3      8      Ljava/util/NoSuchElementException;
        //  185    191    191    192    Ljava/lang/RuntimeException;
        //  184    191    184    185    Ljava/lang/ArithmeticException;
        //  185    191    191    192    Ljava/lang/StringIndexOutOfBoundsException;
        //  200    206    206    207    Any
        //  200    206    206    207    Any
        //  200    206    3      8      Any
        //  200    206    206    207    Ljava/util/ConcurrentModificationException;
        //  200    206    206    207    Ljava/lang/NumberFormatException;
        //  263    269    269    270    Any
        //  263    269    269    270    Any
        //  263    269    269    270    Ljava/lang/NumberFormatException;
        //  263    269    269    270    Any
        //  263    269    269    270    Any
        //  414    420    420    421    Any
        //  414    420    420    421    Ljava/lang/EnumConstantNotPresentException;
        //  414    420    420    421    Any
        //  414    420    420    421    Any
        //  414    420    3      8      Ljava/lang/UnsupportedOperationException;
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
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1163
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1155
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1147
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: astore_1       
        //    40: bipush          9
        //    42: istore_2       
        //    43: iload_2        
        //    44: bipush          35
        //    46: if_icmpgt       1107
        //    49: getstatic       dev/nuker/pyro/fc.1:I
        //    52: ifeq            61
        //    55: ldc_w           -1650923644
        //    58: goto            64
        //    61: ldc_w           510522838
        //    64: ldc_w           -22378061
        //    67: ixor           
        //    68: lookupswitch {
        //          -443120359: 61
        //          1664249399: 1110
        //          default: 96
        //        }
        //    96: aload_0        
        //    97: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   100: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   103: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   106: iload_2        
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   net/minecraft/inventory/Container.func_75139_a:(I)Lnet/minecraft/inventory/Slot;
        //   114: goto            118
        //   117: athrow         
        //   118: goto            122
        //   121: athrow         
        //   122: invokevirtual   net/minecraft/inventory/Slot.func_75211_c:()Lnet/minecraft/item/ItemStack;
        //   125: goto            129
        //   128: athrow         
        //   129: astore_3       
        //   130: aload_3        
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   138: goto            142
        //   141: athrow         
        //   142: ifeq            148
        //   145: goto            1101
        //   148: aload_3        
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   156: goto            160
        //   159: athrow         
        //   160: instanceof      Lnet/minecraft/item/ItemTippedArrow;
        //   163: ifeq            1101
        //   166: aload_3        
        //   167: goto            171
        //   170: athrow         
        //   171: invokestatic    net/minecraft/potion/PotionUtils.func_185191_c:(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/potion/PotionType;
        //   174: goto            178
        //   177: athrow         
        //   178: ifnull          1101
        //   181: getstatic       dev/nuker/pyro/fc.0:I
        //   184: ifeq            193
        //   187: ldc_w           -1916735996
        //   190: goto            196
        //   193: ldc_w           -1881286024
        //   196: ldc_w           677007508
        //   199: ixor           
        //   200: lookupswitch {
        //          -1516585328: 193
        //          -1484289300: 228
        //          default: 1108
        //        }
        //   228: aload_3        
        //   229: goto            233
        //   232: athrow         
        //   233: invokestatic    net/minecraft/potion/PotionUtils.func_185191_c:(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/potion/PotionType;
        //   236: goto            240
        //   239: athrow         
        //   240: goto            244
        //   243: athrow         
        //   244: invokevirtual   net/minecraft/potion/PotionType.func_185170_a:()Ljava/util/List;
        //   247: goto            251
        //   250: athrow         
        //   251: goto            255
        //   254: athrow         
        //   255: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   260: goto            264
        //   263: athrow         
        //   264: astore          4
        //   266: getstatic       dev/nuker/pyro/fc.0:I
        //   269: ifeq            278
        //   272: ldc_w           614547764
        //   275: goto            281
        //   278: ldc_w           -1384051928
        //   281: ldc_w           -718314024
        //   284: ixor           
        //   285: lookupswitch {
        //          -242342676: 1112
        //          1039329496: 278
        //          default: 312
        //        }
        //   312: aload           4
        //   314: getstatic       dev/nuker/pyro/fc.1:I
        //   317: ifeq            326
        //   320: ldc_w           -530811465
        //   323: goto            329
        //   326: ldc_w           1999605366
        //   329: ldc_w           -1046976852
        //   332: ixor           
        //   333: lookupswitch {
        //          -339640987: 326
        //          566498075: 1118
        //          default: 360
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokeinterface java/util/Iterator.hasNext:()Z
        //   369: goto            373
        //   372: athrow         
        //   373: ifeq            1101
        //   376: getstatic       dev/nuker/pyro/fc.1:I
        //   379: ifeq            388
        //   382: ldc_w           2080962846
        //   385: goto            391
        //   388: ldc_w           1600782678
        //   391: ldc_w           456858958
        //   394: ixor           
        //   395: lookupswitch {
        //          1731454032: 1124
        //          1752909504: 388
        //          default: 420
        //        }
        //   420: aload           4
        //   422: getstatic       dev/nuker/pyro/fc.c:I
        //   425: ifge            434
        //   428: ldc_w           -217385660
        //   431: goto            437
        //   434: ldc_w           744682881
        //   437: ldc_w           -1441345044
        //   440: ixor           
        //   441: lookupswitch {
        //          1495016616: 1130
        //          1621488520: 434
        //          default: 468
        //        }
        //   468: goto            472
        //   471: athrow         
        //   472: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   477: goto            481
        //   480: athrow         
        //   481: checkcast       Lnet/minecraft/potion/PotionEffect;
        //   484: astore          5
        //   486: aload           5
        //   488: goto            492
        //   491: athrow         
        //   492: invokevirtual   net/minecraft/potion/PotionEffect.func_188419_a:()Lnet/minecraft/potion/Potion;
        //   495: goto            499
        //   498: athrow         
        //   499: getstatic       dev/nuker/pyro/fc.c:I
        //   502: ifge            511
        //   505: ldc_w           1718166654
        //   508: goto            514
        //   511: ldc_w           1149545364
        //   514: ldc_w           -861099340
        //   517: ixor           
        //   518: lookupswitch {
        //          -2010644192: 544
        //          -1429893430: 511
        //          default: 1132
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokevirtual   net/minecraft/potion/Potion.func_76398_f:()Z
        //   551: goto            555
        //   554: athrow         
        //   555: ifne            1098
        //   558: aload_1        
        //   559: aload           5
        //   561: goto            565
        //   564: athrow         
        //   565: invokevirtual   net/minecraft/potion/PotionEffect.func_76453_d:()Ljava/lang/String;
        //   568: goto            572
        //   571: athrow         
        //   572: getstatic       dev/nuker/pyro/fc.1:I
        //   575: ifeq            584
        //   578: ldc_w           82509467
        //   581: goto            587
        //   584: ldc_w           1372425809
        //   587: ldc_w           -365321539
        //   590: ixor           
        //   591: lookupswitch {
        //          -1141625620: 616
        //          -288138202: 584
        //          default: 1134
        //        }
        //   616: goto            620
        //   619: athrow         
        //   620: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   625: goto            629
        //   628: athrow         
        //   629: ifne            1098
        //   632: aload_1        
        //   633: aload           5
        //   635: goto            639
        //   638: athrow         
        //   639: invokevirtual   net/minecraft/potion/PotionEffect.func_76453_d:()Ljava/lang/String;
        //   642: goto            646
        //   645: athrow         
        //   646: goto            650
        //   649: athrow         
        //   650: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   655: goto            659
        //   658: athrow         
        //   659: pop            
        //   660: getstatic       dev/nuker/pyro/fc.1:I
        //   663: ifeq            672
        //   666: ldc_w           -216537503
        //   669: goto            675
        //   672: ldc_w           -250573172
        //   675: ldc_w           1013584854
        //   678: ixor           
        //   679: lookupswitch {
        //          -813828681: 1120
        //          2085979722: 672
        //          default: 704
        //        }
        //   704: aload_0        
        //   705: getstatic       dev/nuker/pyro/fc.c:I
        //   708: ifge            717
        //   711: ldc_w           -156978366
        //   714: goto            720
        //   717: ldc_w           -1444667100
        //   720: ldc_w           -934419796
        //   723: ixor           
        //   724: lookupswitch {
        //          1055478254: 717
        //          1638515592: 752
        //          default: 1116
        //        }
        //   752: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   755: getstatic       dev/nuker/pyro/fc.0:I
        //   758: ifeq            767
        //   761: ldc_w           -522452384
        //   764: goto            770
        //   767: ldc_w           2134457089
        //   770: ldc_w           -455403954
        //   773: ixor           
        //   774: lookupswitch {
        //          -1679676081: 800
        //          67572782: 767
        //          default: 1128
        //        }
        //   800: iload_2        
        //   801: goto            805
        //   804: athrow         
        //   805: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   808: goto            812
        //   811: athrow         
        //   812: goto            816
        //   815: athrow         
        //   816: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   821: goto            825
        //   824: athrow         
        //   825: pop            
        //   826: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   829: new             Ljava/lang/StringBuilder;
        //   832: dup            
        //   833: goto            837
        //   836: athrow         
        //   837: invokespecial   java/lang/StringBuilder.<init>:()V
        //   840: goto            844
        //   843: athrow         
        //   844: ldc_w           "\u23e0\u149c\u8ac2\ub1c6\ucfb8\ued80\ub22d\ue6ee\udb7c\uefc2\ua75a\u1e0c"
        //   847: getstatic       dev/nuker/pyro/fc.1:I
        //   850: ifeq            859
        //   853: ldc_w           -356128291
        //   856: goto            862
        //   859: ldc_w           -1705137377
        //   862: ldc_w           1971882703
        //   865: ixor           
        //   866: lookupswitch {
        //          -1622318318: 1122
        //          385633379: 859
        //          default: 892
        //        }
        //   892: goto            896
        //   895: athrow         
        //   896: invokestatic    invokestatic   !!! ERROR
        //   899: goto            903
        //   902: athrow         
        //   903: getstatic       dev/nuker/pyro/fc.1:I
        //   906: ifeq            915
        //   909: ldc_w           1583565322
        //   912: goto            918
        //   915: ldc_w           -1872142419
        //   918: ldc_w           505302047
        //   921: ixor           
        //   922: lookupswitch {
        //          -1904798798: 948
        //          1081935381: 915
        //          default: 1114
        //        }
        //   948: goto            952
        //   951: athrow         
        //   952: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   955: goto            959
        //   958: athrow         
        //   959: getstatic       dev/nuker/pyro/fc.1:I
        //   962: ifeq            971
        //   965: ldc_w           -506760326
        //   968: goto            974
        //   971: ldc_w           884179829
        //   974: ldc_w           -2112004405
        //   977: ixor           
        //   978: lookupswitch {
        //          1250002244: 971
        //          1674980785: 1136
        //          default: 1004
        //        }
        //  1004: aload_3        
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: invokevirtual   net/minecraft/item/ItemStack.func_82833_r:()Ljava/lang/String;
        //  1012: goto            1016
        //  1015: athrow         
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1034: goto            1038
        //  1037: athrow         
        //  1038: getstatic       dev/nuker/pyro/fc.0:I
        //  1041: ifeq            1050
        //  1044: ldc_w           -1428956335
        //  1047: goto            1053
        //  1050: ldc_w           -1473155378
        //  1053: ldc_w           -1881695683
        //  1056: ixor           
        //  1057: lookupswitch {
        //          -594435911: 1050
        //          621035884: 1126
        //          default: 1084
        //        }
        //  1084: goto            1088
        //  1087: athrow         
        //  1088: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: goto            1101
        //  1098: goto            266
        //  1101: iinc            2, 1
        //  1104: goto            43
        //  1107: return         
        //  1108: aconst_null    
        //  1109: athrow         
        //  1110: aconst_null    
        //  1111: athrow         
        //  1112: aconst_null    
        //  1113: athrow         
        //  1114: aconst_null    
        //  1115: athrow         
        //  1116: aconst_null    
        //  1117: athrow         
        //  1118: aconst_null    
        //  1119: athrow         
        //  1120: aconst_null    
        //  1121: athrow         
        //  1122: aconst_null    
        //  1123: athrow         
        //  1124: aconst_null    
        //  1125: athrow         
        //  1126: aconst_null    
        //  1127: athrow         
        //  1128: aconst_null    
        //  1129: athrow         
        //  1130: aconst_null    
        //  1131: athrow         
        //  1132: aconst_null    
        //  1133: athrow         
        //  1134: aconst_null    
        //  1135: athrow         
        //  1136: aconst_null    
        //  1137: athrow         
        //  1138: pop            
        //  1139: goto            24
        //  1142: pop            
        //  1143: aconst_null    
        //  1144: goto            1138
        //  1147: dup            
        //  1148: ifnull          1138
        //  1151: checkcast       Ljava/lang/Throwable;
        //  1154: athrow         
        //  1155: dup            
        //  1156: ifnull          1142
        //  1159: checkcast       Ljava/lang/Throwable;
        //  1162: athrow         
        //  1163: aconst_null    
        //  1164: athrow         
        //    StackMapTable: 00 B3 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 36 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 36 40 07 01 88 FD 00 03 07 01 88 01 11 42 01 1F 4D 07 00 1E FF 00 00 00 03 07 00 03 07 01 88 01 00 02 07 01 93 01 45 07 00 36 40 07 01 99 42 07 00 36 40 07 01 99 45 07 00 36 40 07 00 7A FF 00 04 00 04 07 00 03 07 01 88 01 07 00 7A 00 01 07 00 2E 40 07 00 7A 45 07 00 36 40 01 05 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 04 07 00 03 07 01 88 01 07 00 7A 00 01 07 00 7A 45 07 00 36 40 07 00 EF 49 07 00 36 40 07 00 7A 45 07 00 36 40 07 01 AA 0E 42 01 1F 43 07 00 36 40 07 00 7A 45 07 00 36 40 07 01 AA 42 07 00 36 40 07 01 AA 45 07 00 36 40 07 00 44 42 07 00 36 40 07 00 44 47 07 00 36 40 07 01 BA FC 00 01 07 01 BA 0B 42 01 1E 4D 07 01 BA FF 00 02 00 05 07 00 03 07 01 88 01 07 00 7A 07 01 BA 00 02 07 01 BA 01 5E 07 01 BA 42 07 00 36 40 07 01 BA 47 07 00 36 40 01 0E 42 01 1C 4D 07 01 BA FF 00 02 00 05 07 00 03 07 01 88 01 07 00 7A 07 01 BA 00 02 07 01 BA 01 5E 07 01 BA FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 05 07 00 03 07 01 88 01 07 00 7A 07 01 BA 00 01 07 01 BA 47 07 00 36 40 07 02 0E FF 00 09 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 01 07 00 26 40 07 01 C9 45 07 00 36 40 07 01 D2 4B 07 01 D2 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 D2 01 5D 07 01 D2 42 07 00 36 40 07 01 D2 45 07 00 36 40 01 48 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 01 C9 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 FF 00 0B 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 01 88 07 00 F1 01 FF 00 1C 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 42 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 47 07 00 36 40 01 48 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 01 C9 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 42 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 47 07 00 36 40 01 0C 42 01 1C 4C 07 00 03 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 03 01 5F 07 00 03 4E 07 00 44 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 44 01 5D 07 00 44 43 07 00 28 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 44 01 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 44 07 01 EE 42 07 00 24 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 44 07 01 EE 47 07 00 36 40 01 4A 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 08 03 3D 08 03 3D 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 FF 00 0E 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 04 07 00 B5 07 01 F3 07 00 F1 01 FF 00 1D 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 42 07 00 2E FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 FF 00 0B 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 04 07 00 B5 07 01 F3 07 00 F1 01 FF 00 1D 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 FF 00 0B 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 01 FF 00 1D 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 7A 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 42 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 42 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 45 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 00 F1 FF 00 0B 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 00 F1 FF 00 02 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 00 F1 01 FF 00 1E 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 00 F1 42 07 00 36 FF 00 00 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 00 F1 45 07 00 36 00 02 F9 00 02 FA 00 05 FC 00 00 07 00 7A FA 00 01 FD 00 01 07 00 7A 07 01 BA FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 41 07 00 03 FF 00 01 00 05 07 00 03 07 01 88 01 07 00 7A 07 01 BA 00 01 07 01 BA FC 00 01 07 01 C9 FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 03 07 00 B5 07 01 F3 07 00 F1 FA 00 01 FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 00 F1 41 07 00 44 FF 00 01 00 05 07 00 03 07 01 88 01 07 00 7A 07 01 BA 00 01 07 01 BA FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 01 07 01 D2 FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 01 88 07 00 F1 FF 00 01 00 06 07 00 03 07 01 88 01 07 00 7A 07 01 BA 07 01 C9 00 02 07 00 B5 07 01 F3 FF 00 01 00 01 07 00 03 00 01 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1147   1155   Any
        //  1147   1155   1147   1155   Ljava/lang/StringIndexOutOfBoundsException;
        //  1163   1165   3      8      Any
        //  32     38     38     39     Any
        //  32     38     38     39     Ljava/lang/AssertionError;
        //  32     38     38     39     Any
        //  32     38     38     39     Any
        //  32     38     3      8      Ljava/lang/AssertionError;
        //  110    117    117    118    Any
        //  110    117    117    118    Any
        //  111    117    110    111    Ljava/lang/IllegalStateException;
        //  111    117    117    118    Any
        //  111    117    3      8      Ljava/util/NoSuchElementException;
        //  121    128    128    129    Any
        //  121    128    121    122    Ljava/lang/IllegalStateException;
        //  121    128    3      8      Any
        //  122    128    121    122    Any
        //  121    128    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  134    141    141    142    Any
        //  135    141    134    135    Ljava/lang/RuntimeException;
        //  134    141    141    142    Ljava/lang/RuntimeException;
        //  135    141    134    135    Ljava/lang/StringIndexOutOfBoundsException;
        //  135    141    134    135    Ljava/lang/NumberFormatException;
        //  153    159    159    160    Any
        //  153    159    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  153    159    159    160    Any
        //  153    159    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  153    159    3      8      Ljava/lang/AssertionError;
        //  170    177    177    178    Any
        //  171    177    177    178    Any
        //  170    177    170    171    Any
        //  170    177    170    171    Any
        //  170    177    177    178    Any
        //  232    239    239    240    Any
        //  232    239    232    233    Ljava/lang/NullPointerException;
        //  232    239    232    233    Any
        //  233    239    3      8      Ljava/lang/IllegalArgumentException;
        //  233    239    232    233    Any
        //  243    250    250    251    Any
        //  243    250    243    244    Any
        //  244    250    3      8      Any
        //  243    250    3      8      Any
        //  244    250    250    251    Any
        //  254    263    263    264    Any
        //  254    263    254    255    Any
        //  255    263    3      8      Ljava/lang/ClassCastException;
        //  254    263    3      8      Any
        //  254    263    3      8      Any
        //  363    372    372    373    Any
        //  364    372    372    373    Any
        //  364    372    3      8      Ljava/lang/RuntimeException;
        //  364    372    3      8      Ljava/lang/AssertionError;
        //  364    372    363    364    Any
        //  472    480    480    481    Any
        //  472    480    3      8      Ljava/lang/AssertionError;
        //  472    480    480    481    Any
        //  472    480    3      8      Ljava/lang/IllegalArgumentException;
        //  472    480    480    481    Any
        //  491    498    498    499    Any
        //  492    498    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  491    498    491    492    Ljava/lang/ArithmeticException;
        //  492    498    3      8      Ljava/util/NoSuchElementException;
        //  492    498    3      8      Any
        //  547    554    554    555    Any
        //  547    554    554    555    Any
        //  548    554    3      8      Any
        //  548    554    547    548    Any
        //  548    554    547    548    Any
        //  564    571    571    572    Any
        //  565    571    3      8      Any
        //  564    571    564    565    Any
        //  565    571    564    565    Ljava/lang/IndexOutOfBoundsException;
        //  564    571    571    572    Ljava/lang/UnsupportedOperationException;
        //  619    628    628    629    Any
        //  620    628    628    629    Ljava/lang/UnsupportedOperationException;
        //  620    628    619    620    Any
        //  620    628    619    620    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  620    628    3      8      Any
        //  638    645    645    646    Any
        //  638    645    3      8      Any
        //  639    645    645    646    Any
        //  639    645    638    639    Any
        //  638    645    638    639    Ljava/lang/NullPointerException;
        //  649    658    658    659    Any
        //  650    658    3      8      Ljava/util/NoSuchElementException;
        //  650    658    649    650    Any
        //  650    658    658    659    Ljava/lang/IllegalStateException;
        //  649    658    658    659    Ljava/lang/AssertionError;
        //  804    811    811    812    Any
        //  804    811    811    812    Ljava/lang/IndexOutOfBoundsException;
        //  805    811    3      8      Any
        //  805    811    3      8      Ljava/lang/IllegalArgumentException;
        //  804    811    804    805    Ljava/lang/ClassCastException;
        //  815    824    824    825    Any
        //  815    824    3      8      Any
        //  816    824    3      8      Any
        //  816    824    815    816    Ljava/lang/EnumConstantNotPresentException;
        //  816    824    3      8      Ljava/lang/ClassCastException;
        //  836    843    843    844    Any
        //  837    843    843    844    Any
        //  837    843    3      8      Any
        //  837    843    836    837    Ljava/util/ConcurrentModificationException;
        //  837    843    836    837    Any
        //  895    902    902    903    Any
        //  896    902    3      8      Any
        //  896    902    895    896    Ljava/lang/IllegalStateException;
        //  895    902    895    896    Ljava/lang/EnumConstantNotPresentException;
        //  896    902    902    903    Ljava/lang/RuntimeException;
        //  952    958    958    959    Any
        //  952    958    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  952    958    3      8      Any
        //  952    958    3      8      Any
        //  952    958    958    959    Ljava/lang/AssertionError;
        //  1009   1015   1015   1016   Any
        //  1009   1015   1015   1016   Any
        //  1009   1015   1015   1016   Any
        //  1009   1015   3      8      Any
        //  1009   1015   3      8      Any
        //  1019   1026   1026   1027   Any
        //  1019   1026   3      8      Any
        //  1020   1026   1019   1020   Any
        //  1020   1026   1019   1020   Any
        //  1020   1026   1019   1020   Ljava/lang/NullPointerException;
        //  1030   1037   1037   1038   Any
        //  1030   1037   3      8      Ljava/lang/ClassCastException;
        //  1031   1037   1037   1038   Any
        //  1031   1037   3      8      Any
        //  1031   1037   1030   1031   Any
        //  1087   1094   1094   1095   Any
        //  1088   1094   1087   1088   Ljava/lang/ClassCastException;
        //  1088   1094   1087   1088   Any
        //  1088   1094   1094   1095   Ljava/lang/ArithmeticException;
        //  1088   1094   3      8      Ljava/lang/ArithmeticException;
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
    
    public f5y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            12
        //     6: ldc_w           380124542
        //     9: goto            15
        //    12: ldc_w           -2075394759
        //    15: ldc_w           -167303268
        //    18: ixor           
        //    19: lookupswitch {
        //          -525395230: 12
        //          1917639333: 44
        //          default: 434
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u23d7\u1486\u8ade\ub3cf\uc988\uedd2"
        //    48: getstatic       dev/nuker/pyro/fc.c:I
        //    51: ifge            60
        //    54: ldc_w           794819702
        //    57: goto            63
        //    60: ldc_w           -1581468710
        //    63: ldc_w           797700465
        //    66: ixor           
        //    67: lookupswitch {
        //          -1908981077: 92
        //          13896967: 60
        //          default: 440
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc_w           "\u23f7\u1486\u8ade\ub3cf\uc988\uedd2"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: ldc_w           "\u23e7\u1486\u8ac3\ub3d6\uc980\uedc1\ub230\ue6f3\ud96b\ue9ff\ua70c\u1e40\ue1c7\uc5e7\u817e\u8952\u57b2\u773a\ubd2e\uc002\u2b2d\uc234\u6a22\u2d16\ud78c\u35ac\u7d38\u899d\u8005\u8cd0\u8490\ufb37\u70a8\u9a13\u1bcd\uf147\u4979\u8858\uca92\uff7a\ub6be\u41fc\ub9c8\ub308\u4c3a\u8ac1\u7c7b\uce10\u7d59\uea9f"
        //   104: invokestatic    invokestatic   !!! ERROR
        //   107: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   110: aload_0        
        //   111: new             Ldev/nuker/pyro/f0d;
        //   114: dup            
        //   115: ldc_w           "\u23c2\u1496\u8adb\ub3d8\uc994"
        //   118: invokestatic    invokestatic   !!! ERROR
        //   121: ldc_w           "\u23e2\u1496\u8adb\ub3d8\uc994"
        //   124: invokestatic    invokestatic   !!! ERROR
        //   127: aconst_null    
        //   128: ldc2_w          0.7
        //   131: ldc2_w          0.1
        //   134: ldc2_w          2.0
        //   137: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   140: getstatic       dev/nuker/pyro/fc.0:I
        //   143: ifeq            152
        //   146: ldc_w           -1388149216
        //   149: goto            155
        //   152: ldc_w           62621093
        //   155: ldc_w           2135105889
        //   158: ixor           
        //   159: lookupswitch {
        //          -1567245347: 152
        //          -771643583: 436
        //          default: 184
        //        }
        //   184: putfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/f0d;
        //   187: getstatic       dev/nuker/pyro/fc.0:I
        //   190: ifeq            199
        //   193: ldc_w           1399310723
        //   196: goto            202
        //   199: ldc_w           -193436044
        //   202: ldc_w           -987751532
        //   205: ixor           
        //   206: lookupswitch {
        //          -1773678057: 428
        //          514631004: 199
        //          default: 232
        //        }
        //   232: aload_0        
        //   233: new             Ljava/util/ArrayList;
        //   236: dup            
        //   237: invokespecial   java/util/ArrayList.<init>:()V
        //   240: putfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   243: getstatic       dev/nuker/pyro/fc.0:I
        //   246: ifeq            255
        //   249: ldc_w           -774458785
        //   252: goto            258
        //   255: ldc_w           -2044957703
        //   258: ldc_w           160481301
        //   261: ixor           
        //   262: lookupswitch {
        //          -2134504421: 255
        //          -666471862: 438
        //          default: 288
        //        }
        //   288: aload_0        
        //   289: iconst_m1      
        //   290: putfield        dev/nuker/pyro/f5y.1:I
        //   293: getstatic       dev/nuker/pyro/fc.1:I
        //   296: ifeq            305
        //   299: ldc_w           1045980255
        //   302: goto            308
        //   305: ldc_w           1264753082
        //   308: ldc_w           -90355818
        //   311: ixor           
        //   312: lookupswitch {
        //          -1308631508: 340
        //          -993713207: 305
        //          default: 430
        //        }
        //   340: aload_0        
        //   341: iconst_m1      
        //   342: putfield        dev/nuker/pyro/f5y.2:I
        //   345: getstatic       dev/nuker/pyro/fc.c:I
        //   348: ifge            357
        //   351: ldc_w           -284546919
        //   354: goto            360
        //   357: ldc_w           1259764079
        //   360: ldc_w           -1241551809
        //   363: ixor           
        //   364: lookupswitch {
        //          -1264294551: 357
        //          1526023334: 432
        //          default: 392
        //        }
        //   392: aload_0        
        //   393: iconst_0       
        //   394: putfield        dev/nuker/pyro/f5y.c:Z
        //   397: aload_0        
        //   398: iconst_0       
        //   399: putfield        dev/nuker/pyro/f5y.3:I
        //   402: aload_0        
        //   403: new             Ldev/nuker/pyro/fbu;
        //   406: dup            
        //   407: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   410: putfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fbu;
        //   413: aload_0        
        //   414: iconst_0       
        //   415: putfield        dev/nuker/pyro/f5y.4:I
        //   418: aload_0        
        //   419: aload_0        
        //   420: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/f0d;
        //   423: invokevirtual   dev/nuker/pyro/f5y.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   426: pop            
        //   427: return         
        //   428: aconst_null    
        //   429: athrow         
        //   430: aconst_null    
        //   431: athrow         
        //   432: aconst_null    
        //   433: athrow         
        //   434: aconst_null    
        //   435: athrow         
        //   436: aconst_null    
        //   437: athrow         
        //   438: aconst_null    
        //   439: athrow         
        //   440: aconst_null    
        //   441: athrow         
        //    StackMapTable: 00 1C 0C 42 01 1C FF 00 0F 00 01 06 00 02 06 07 00 F1 FF 00 02 00 01 06 00 03 06 07 00 F1 01 FF 00 1C 00 01 06 00 02 06 07 00 F1 FF 00 3B 00 01 07 00 03 00 02 07 00 03 07 02 1F FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 1F 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 02 1F 0E 42 01 1D 16 42 01 1D 10 42 01 1F 10 42 01 1F 23 01 01 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 1F 01 FF 00 01 00 01 06 00 02 06 07 00 F1
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
    
    @f06(10)
    @LauncherEventHide
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1211
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1203
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1195
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    39: if_acmpeq       43
        //    42: return         
        //    43: aload_0        
        //    44: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //    47: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //    50: instanceof      Lnet/minecraft/client/gui/inventory/GuiContainer;
        //    53: ifeq            62
        //    56: ldc_w           -1101963490
        //    59: goto            65
        //    62: ldc_w           -1101963489
        //    65: ldc_w           1394757920
        //    68: ixor           
        //    69: tableswitch {
        //          -622453636: 92
        //          -622453635: 198
        //          default: 56
        //        }
        //    92: aload_0        
        //    93: getstatic       dev/nuker/pyro/fc.c:I
        //    96: ifge            105
        //    99: ldc_w           1805743459
        //   102: goto            108
        //   105: ldc_w           -1710446755
        //   108: ldc_w           -1055043385
        //   111: ixor           
        //   112: lookupswitch {
        //          -1430510172: 105
        //          1527904154: 140
        //          default: 1180
        //        }
        //   140: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   143: getstatic       dev/nuker/pyro/fc.c:I
        //   146: ifge            155
        //   149: ldc_w           -1458652816
        //   152: goto            158
        //   155: ldc_w           -1103660983
        //   158: ldc_w           -297126216
        //   161: ixor           
        //   162: lookupswitch {
        //          960719456: 155
        //          1195675592: 1178
        //          default: 188
        //        }
        //   188: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   191: instanceof      Lnet/minecraft/client/gui/inventory/GuiInventory;
        //   194: ifne            198
        //   197: return         
        //   198: aload_0        
        //   199: getfield        dev/nuker/pyro/f5y.1:I
        //   202: iconst_m1      
        //   203: if_icmpne       207
        //   206: return         
        //   207: aload_0        
        //   208: getstatic       dev/nuker/pyro/fc.c:I
        //   211: ifge            220
        //   214: ldc_w           1779077453
        //   217: goto            223
        //   220: ldc_w           1527899329
        //   223: ldc_w           -248444710
        //   226: ixor           
        //   227: lookupswitch {
        //          -1742350436: 220
        //          -1690592873: 1182
        //          default: 252
        //        }
        //   252: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   255: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   258: getstatic       dev/nuker/pyro/fc.1:I
        //   261: ifeq            270
        //   264: ldc_w           476338012
        //   267: goto            273
        //   270: ldc_w           1343392434
        //   273: ldc_w           1129278620
        //   276: ixor           
        //   277: lookupswitch {
        //          324920878: 304
        //          1596668864: 270
        //          default: 1164
        //        }
        //   304: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   307: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   310: aload_0        
        //   311: getfield        dev/nuker/pyro/f5y.1:I
        //   314: if_icmpeq       547
        //   317: aload_0        
        //   318: getfield        dev/nuker/pyro/f5y.1:I
        //   321: sipush          420
        //   324: if_icmpeq       547
        //   327: aload_0        
        //   328: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   331: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   334: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   337: getstatic       dev/nuker/pyro/fc.0:I
        //   340: ifeq            349
        //   343: ldc_w           820152234
        //   346: goto            352
        //   349: ldc_w           455228254
        //   352: ldc_w           -2136046635
        //   355: ixor           
        //   356: lookupswitch {
        //          -1337195393: 1160
        //          -188451260: 349
        //          default: 384
        //        }
        //   384: aload_0        
        //   385: getstatic       dev/nuker/pyro/fc.1:I
        //   388: ifeq            397
        //   391: ldc_w           956435533
        //   394: goto            400
        //   397: ldc_w           -383062690
        //   400: ldc_w           -1323161819
        //   403: ixor           
        //   404: lookupswitch {
        //          -2011157656: 397
        //          1476971131: 432
        //          default: 1166
        //        }
        //   432: getfield        dev/nuker/pyro/f5y.1:I
        //   435: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   438: aload_0        
        //   439: getstatic       dev/nuker/pyro/fc.1:I
        //   442: ifeq            451
        //   445: ldc_w           1695155498
        //   448: goto            454
        //   451: ldc_w           1781569442
        //   454: ldc_w           -901093603
        //   457: ixor           
        //   458: lookupswitch {
        //          -1354735049: 1170
        //          -613933219: 451
        //          default: 484
        //        }
        //   484: getfield        dev/nuker/pyro/f5y.c:Lnet/minecraft/client/Minecraft;
        //   487: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   490: getstatic       dev/nuker/pyro/fc.0:I
        //   493: ifeq            502
        //   496: ldc_w           -16237884
        //   499: goto            505
        //   502: ldc_w           1877787761
        //   505: ldc_w           -2056752715
        //   508: ixor           
        //   509: lookupswitch {
        //          -699571685: 502
        //          2053131121: 1176
        //          default: 536
        //        }
        //   536: goto            540
        //   539: athrow         
        //   540: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   543: goto            547
        //   546: athrow         
        //   547: aload_0        
        //   548: getfield        dev/nuker/pyro/f5y.4:I
        //   551: ifle            560
        //   554: ldc_w           138668840
        //   557: goto            563
        //   560: ldc_w           138668843
        //   563: ldc_w           500767205
        //   566: ixor           
        //   567: tableswitch {
        //          724952474: 588
        //          724952475: 715
        //          default: 554
        //        }
        //   588: getstatic       dev/nuker/pyro/fc.0:I
        //   591: ifeq            600
        //   594: ldc_w           1245834751
        //   597: goto            603
        //   600: ldc_w           -409261289
        //   603: ldc_w           1147391752
        //   606: ixor           
        //   607: lookupswitch {
        //          -1543969761: 632
        //          237118199: 600
        //          default: 1158
        //        }
        //   632: aload_0        
        //   633: dup            
        //   634: getfield        dev/nuker/pyro/f5y.4:I
        //   637: iconst_1       
        //   638: isub           
        //   639: putfield        dev/nuker/pyro/f5y.4:I
        //   642: aload_0        
        //   643: getfield        dev/nuker/pyro/f5y.4:I
        //   646: ifne            655
        //   649: ldc_w           1837299593
        //   652: goto            658
        //   655: ldc_w           1837299592
        //   658: ldc_w           1565794243
        //   661: ixor           
        //   662: tableswitch {
        //          1638781076: 684
        //          1638781077: 714
        //          default: 649
        //        }
        //   684: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   687: iconst_0       
        //   688: bipush          9
        //   690: aload_0        
        //   691: getfield        dev/nuker/pyro/f5y.2:I
        //   694: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //   697: aload_0        
        //   698: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f5y;)Ljava/util/function/Consumer;
        //   703: goto            707
        //   706: athrow         
        //   707: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //   710: goto            714
        //   713: athrow         
        //   714: return         
        //   715: getstatic       dev/nuker/pyro/fc.0:I
        //   718: ifeq            727
        //   721: ldc_w           2089456637
        //   724: goto            730
        //   727: ldc_w           -375487734
        //   730: ldc_w           -1253349181
        //   733: ixor           
        //   734: lookupswitch {
        //          -1592728378: 727
        //          -910034114: 1162
        //          default: 760
        //        }
        //   760: aload_0        
        //   761: getfield        dev/nuker/pyro/f5y.3:I
        //   764: iconst_m1      
        //   765: if_icmpeq       829
        //   768: aload_0        
        //   769: getstatic       dev/nuker/pyro/fc.0:I
        //   772: ifeq            781
        //   775: ldc_w           -123620531
        //   778: goto            784
        //   781: ldc_w           729773957
        //   784: ldc_w           1021770921
        //   787: ixor           
        //   788: lookupswitch {
        //          -1001959452: 781
        //          395938604: 816
        //          default: 1174
        //        }
        //   816: aload_1        
        //   817: goto            821
        //   820: athrow         
        //   821: invokevirtual   dev/nuker/pyro/f5y.0:(Ldev/nuker/pyro/f3i;)V
        //   824: goto            828
        //   827: athrow         
        //   828: return         
        //   829: aload_0        
        //   830: getfield        dev/nuker/pyro/f5y.c:Z
        //   833: ifeq            837
        //   836: return         
        //   837: aload_0        
        //   838: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/fbu;
        //   841: aload_0        
        //   842: getfield        dev/nuker/pyro/f5y.c:Ldev/nuker/pyro/f0d;
        //   845: goto            849
        //   848: athrow         
        //   849: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   852: goto            856
        //   855: athrow         
        //   856: checkcast       Ljava/lang/Double;
        //   859: goto            863
        //   862: athrow         
        //   863: invokevirtual   java/lang/Double.doubleValue:()D
        //   866: goto            870
        //   869: athrow         
        //   870: ldc2_w          1000.0
        //   873: dmul           
        //   874: goto            878
        //   877: athrow         
        //   878: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   881: goto            885
        //   884: athrow         
        //   885: ifne            889
        //   888: return         
        //   889: aload_0        
        //   890: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   893: goto            897
        //   896: athrow         
        //   897: invokeinterface java/util/List.isEmpty:()Z
        //   902: goto            906
        //   905: athrow         
        //   906: ifne            1157
        //   909: aload_0        
        //   910: iconst_1       
        //   911: putfield        dev/nuker/pyro/f5y.c:Z
        //   914: aload_0        
        //   915: aload_0        
        //   916: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   919: iconst_0       
        //   920: goto            924
        //   923: athrow         
        //   924: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   929: goto            933
        //   932: athrow         
        //   933: checkcast       Ljava/lang/Integer;
        //   936: goto            940
        //   939: athrow         
        //   940: invokevirtual   java/lang/Integer.intValue:()I
        //   943: goto            947
        //   946: athrow         
        //   947: putfield        dev/nuker/pyro/f5y.2:I
        //   950: aload_0        
        //   951: getstatic       dev/nuker/pyro/fc.c:I
        //   954: ifge            963
        //   957: ldc_w           1621902172
        //   960: goto            966
        //   963: ldc_w           1957383419
        //   966: ldc_w           1762156125
        //   969: ixor           
        //   970: lookupswitch {
        //          -1905808772: 963
        //          161750273: 1184
        //          default: 996
        //        }
        //   996: getfield        dev/nuker/pyro/f5y.c:Ljava/util/List;
        //   999: iconst_0       
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //  1009: goto            1013
        //  1012: athrow         
        //  1013: pop            
        //  1014: aload_0        
        //  1015: getfield        dev/nuker/pyro/f5y.2:I
        //  1018: bipush          9
        //  1020: if_icmpeq       1147
        //  1023: getstatic       dev/nuker/pyro/fc.0:I
        //  1026: ifeq            1035
        //  1029: ldc_w           1620633499
        //  1032: goto            1038
        //  1035: ldc_w           1968907392
        //  1038: ldc_w           355829056
        //  1041: ixor           
        //  1042: lookupswitch {
        //          -1439418507: 1035
        //          1974297307: 1168
        //          default: 1068
        //        }
        //  1068: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  1071: iconst_0       
        //  1072: aload_0        
        //  1073: getfield        dev/nuker/pyro/f5y.2:I
        //  1076: bipush          9
        //  1078: getstatic       dev/nuker/pyro/fc.c:I
        //  1081: ifge            1090
        //  1084: ldc_w           1678641054
        //  1087: goto            1093
        //  1090: ldc_w           -827503315
        //  1093: ldc_w           701057164
        //  1096: ixor           
        //  1097: lookupswitch {
        //          -412875359: 1124
        //          1304907538: 1090
        //          default: 1172
        //        }
        //  1124: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  1127: aload_0        
        //  1128: invokedynamic   BootstrapMethod #2, accept:(Ldev/nuker/pyro/f5y;)Ljava/util/function/Consumer;
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: goto            1157
        //  1147: aload_0        
        //  1148: iconst_m1      
        //  1149: putfield        dev/nuker/pyro/f5y.2:I
        //  1152: aload_0        
        //  1153: iconst_0       
        //  1154: putfield        dev/nuker/pyro/f5y.3:I
        //  1157: return         
        //  1158: aconst_null    
        //  1159: athrow         
        //  1160: aconst_null    
        //  1161: athrow         
        //  1162: aconst_null    
        //  1163: athrow         
        //  1164: aconst_null    
        //  1165: athrow         
        //  1166: aconst_null    
        //  1167: athrow         
        //  1168: aconst_null    
        //  1169: athrow         
        //  1170: aconst_null    
        //  1171: athrow         
        //  1172: aconst_null    
        //  1173: athrow         
        //  1174: aconst_null    
        //  1175: athrow         
        //  1176: aconst_null    
        //  1177: athrow         
        //  1178: aconst_null    
        //  1179: athrow         
        //  1180: aconst_null    
        //  1181: athrow         
        //  1182: aconst_null    
        //  1183: athrow         
        //  1184: aconst_null    
        //  1185: athrow         
        //  1186: pop            
        //  1187: goto            24
        //  1190: pop            
        //  1191: aconst_null    
        //  1192: goto            1186
        //  1195: dup            
        //  1196: ifnull          1186
        //  1199: checkcast       Ljava/lang/Throwable;
        //  1202: athrow         
        //  1203: dup            
        //  1204: ifnull          1190
        //  1207: checkcast       Ljava/lang/Throwable;
        //  1210: athrow         
        //  1211: aconst_null    
        //  1212: athrow         
        //    StackMapTable: 00 86 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 01 46 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 01 07 01 46 45 07 00 36 40 07 02 4A 06 0C 05 42 01 1A 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5F 07 00 03 4E 07 00 62 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 62 01 5D 07 00 62 09 08 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5C 07 00 03 51 07 00 6B FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 6B 01 5E 07 00 6B 6C 07 00 74 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 74 01 5F 07 00 74 FF 00 0C 00 02 07 00 03 07 01 46 00 02 07 00 74 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 03 07 00 74 07 00 03 01 FF 00 1F 00 02 07 00 03 07 01 46 00 02 07 00 74 07 00 03 52 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5D 07 00 03 51 07 01 74 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 01 74 01 5E 07 01 74 42 07 00 36 40 07 01 74 45 07 00 36 00 06 05 42 01 18 0B 42 01 1C 10 05 42 01 19 55 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 06 07 02 81 01 01 01 07 02 86 07 01 80 45 07 00 36 00 00 0B 42 01 1D 54 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5F 07 00 03 43 07 00 2E FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 01 46 45 07 00 36 00 00 07 FF 00 0A 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 F6 07 02 1F 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 F6 07 02 0E 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 F6 07 02 9F 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 F6 03 46 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 F6 03 45 07 00 36 40 01 03 46 07 00 36 40 07 00 44 47 07 00 36 40 01 50 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 03 07 00 03 07 00 44 01 47 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 02 0E 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 01 EE 45 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5D 07 00 03 46 07 00 36 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 44 01 47 07 00 36 40 07 02 0E 15 42 01 1D FF 00 15 00 02 07 00 03 07 01 46 00 04 07 02 81 01 01 01 FF 00 02 00 02 07 00 03 07 01 46 00 05 07 02 81 01 01 01 01 FF 00 1E 00 02 07 00 03 07 01 46 00 04 07 02 81 01 01 01 4B 07 00 2C FF 00 00 00 02 07 00 03 07 01 46 00 06 07 02 81 01 01 01 07 02 86 07 01 80 45 07 00 36 00 02 09 00 41 07 00 74 01 41 07 00 6B FF 00 01 00 02 07 00 03 07 01 46 00 02 07 00 74 07 00 03 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 46 00 04 07 02 81 01 01 01 41 07 00 03 41 07 01 74 41 07 00 62 41 07 00 03 41 07 00 03 41 07 00 03 41 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1195   1203   Any
        //  1195   1203   1195   1203   Any
        //  1211   1213   3      8      Ljava/util/NoSuchElementException;
        //  29     35     35     36     Any
        //  29     35     3      8      Ljava/lang/NumberFormatException;
        //  29     35     35     36     Any
        //  29     35     35     36     Ljava/lang/NumberFormatException;
        //  29     35     35     36     Ljava/lang/AssertionError;
        //  539    546    546    547    Any
        //  540    546    3      8      Any
        //  540    546    3      8      Any
        //  539    546    539    540    Any
        //  540    546    539    540    Any
        //  706    713    713    714    Any
        //  707    713    706    707    Ljava/lang/IndexOutOfBoundsException;
        //  707    713    3      8      Ljava/lang/NumberFormatException;
        //  706    713    706    707    Ljava/lang/UnsupportedOperationException;
        //  707    713    706    707    Any
        //  820    827    827    828    Any
        //  820    827    820    821    Ljava/lang/RuntimeException;
        //  820    827    820    821    Ljava/lang/NullPointerException;
        //  820    827    820    821    Ljava/lang/RuntimeException;
        //  820    827    827    828    Any
        //  849    855    855    856    Any
        //  849    855    855    856    Ljava/lang/NullPointerException;
        //  849    855    855    856    Any
        //  849    855    855    856    Ljava/util/ConcurrentModificationException;
        //  849    855    855    856    Ljava/lang/NumberFormatException;
        //  862    869    869    870    Any
        //  863    869    862    863    Ljava/lang/NumberFormatException;
        //  862    869    3      8      Any
        //  862    869    3      8      Any
        //  862    869    862    863    Any
        //  877    884    884    885    Any
        //  877    884    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  878    884    877    878    Any
        //  878    884    877    878    Any
        //  877    884    3      8      Ljava/lang/ArithmeticException;
        //  896    905    905    906    Any
        //  896    905    3      8      Any
        //  897    905    905    906    Any
        //  896    905    3      8      Any
        //  896    905    896    897    Any
        //  923    932    932    933    Any
        //  924    932    932    933    Any
        //  924    932    932    933    Any
        //  924    932    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  923    932    923    924    Any
        //  939    946    946    947    Any
        //  940    946    939    940    Ljava/util/NoSuchElementException;
        //  940    946    3      8      Any
        //  940    946    946    947    Any
        //  939    946    3      8      Ljava/lang/RuntimeException;
        //  1003   1012   1012   1013   Any
        //  1004   1012   1012   1013   Any
        //  1004   1012   1012   1013   Any
        //  1004   1012   1012   1013   Ljava/lang/NumberFormatException;
        //  1003   1012   1003   1004   Any
        //  1136   1143   1143   1144   Any
        //  1137   1143   1143   1144   Any
        //  1137   1143   1136   1137   Ljava/lang/NumberFormatException;
        //  1136   1143   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1137   1143   3      8      Any
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
    
    public void 0(final Boolean b) {
        fbS.3w(this, 1377568722, b);
    }
    
    public void c(final Boolean b) {
        fbS.3A(this, 1586225512, b);
    }
    
    static {
        throw t;
    }
}
