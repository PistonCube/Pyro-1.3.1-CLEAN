// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;

public class f9U extends fH
{
    public f0d c;
    public f0f c;
    public f0f 0;
    public List<Integer> c;
    
    public String 1(final EntityPlayer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1504
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1496
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1488
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70005_c_:()Ljava/lang/String;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/fc.0:I
        //    39: ifeq            47
        //    42: ldc             -257993462
        //    44: goto            49
        //    47: ldc             -481496016
        //    49: ldc             962142156
        //    51: ixor           
        //    52: lookupswitch {
        //          -909751610: 47
        //          -636097540: 80
        //          default: 1467
        //        }
        //    80: astore_2       
        //    81: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //    84: aload_2        
        //    85: goto            89
        //    88: athrow         
        //    89: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //    92: goto            96
        //    95: athrow         
        //    96: istore_3       
        //    97: iload_3        
        //    98: ifeq            315
        //   101: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9R;
        //   104: getfield        dev/nuker/pyro/f9R.c:Ldev/nuker/pyro/fw;
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   114: goto            118
        //   117: athrow         
        //   118: checkcast       Ljava/lang/Boolean;
        //   121: goto            125
        //   124: athrow         
        //   125: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   128: goto            132
        //   131: athrow         
        //   132: ifeq            245
        //   135: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            149
        //   144: ldc             1218201154
        //   146: goto            151
        //   149: ldc             171718392
        //   151: ldc             911199274
        //   153: ixor           
        //   154: lookupswitch {
        //          -1995286932: 149
        //          2127792744: 1443
        //          default: 180
        //        }
        //   180: aload_2        
        //   181: goto            185
        //   184: athrow         
        //   185: invokevirtual   dev/nuker/pyro/FriendManager$Companion.getFriend:(Ljava/lang/String;)Ldev/nuker/pyro/f8;
        //   188: goto            192
        //   191: athrow         
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   dev/nuker/pyro/f8.c:()Ljava/lang/String;
        //   199: goto            203
        //   202: athrow         
        //   203: getstatic       dev/nuker/pyro/fc.1:I
        //   206: ifeq            214
        //   209: ldc             -1573279607
        //   211: goto            216
        //   214: ldc             1830696540
        //   216: ldc             -2124689100
        //   218: ixor           
        //   219: lookupswitch {
        //          593656253: 1463
        //          1195990822: 214
        //          default: 244
        //        }
        //   244: astore_2       
        //   245: new             Ljava/lang/StringBuilder;
        //   248: dup            
        //   249: goto            253
        //   252: athrow         
        //   253: invokespecial   java/lang/StringBuilder.<init>:()V
        //   256: goto            260
        //   259: athrow         
        //   260: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   263: goto            267
        //   266: athrow         
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   270: goto            274
        //   273: athrow         
        //   274: aload_2        
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   282: goto            286
        //   285: athrow         
        //   286: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   289: goto            293
        //   292: athrow         
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   296: goto            300
        //   299: athrow         
        //   300: goto            304
        //   303: athrow         
        //   304: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   307: goto            311
        //   310: athrow         
        //   311: astore_2       
        //   312: goto            679
        //   315: getstatic       dev/nuker/pyro/fc.1:I
        //   318: ifeq            326
        //   321: ldc             -1184932171
        //   323: goto            328
        //   326: ldc             1765460351
        //   328: ldc             1920400323
        //   330: ixor           
        //   331: lookupswitch {
        //          -1010344442: 326
        //          -886463114: 1445
        //          default: 356
        //        }
        //   356: aload_1        
        //   357: getstatic       dev/nuker/pyro/fc.0:I
        //   360: ifeq            368
        //   363: ldc             1301818031
        //   365: goto            370
        //   368: ldc             1957311772
        //   370: ldc             837097212
        //   372: ixor           
        //   373: lookupswitch {
        //          1162814432: 400
        //          2088582227: 368
        //          default: 1477
        //        }
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70093_af:()Z
        //   407: goto            411
        //   410: athrow         
        //   411: ifeq            612
        //   414: new             Ljava/lang/StringBuilder;
        //   417: dup            
        //   418: goto            422
        //   421: athrow         
        //   422: invokespecial   java/lang/StringBuilder.<init>:()V
        //   425: goto            429
        //   428: athrow         
        //   429: getstatic       dev/nuker/pyro/fc.c:I
        //   432: ifge            440
        //   435: ldc             336413622
        //   437: goto            442
        //   440: ldc             -1106011024
        //   442: ldc             1876597817
        //   444: ixor           
        //   445: lookupswitch {
        //          -775356343: 472
        //          2077745039: 440
        //          default: 1473
        //        }
        //   472: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GOLD:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   475: getstatic       dev/nuker/pyro/fc.0:I
        //   478: ifeq            486
        //   481: ldc             -511789384
        //   483: goto            488
        //   486: ldc             -1666541491
        //   488: ldc             -1887032377
        //   490: ixor           
        //   491: lookupswitch {
        //          321696650: 516
        //          1861787007: 486
        //          default: 1461
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   523: goto            527
        //   526: athrow         
        //   527: aload_2        
        //   528: getstatic       dev/nuker/pyro/fc.0:I
        //   531: ifeq            539
        //   534: ldc             -821069950
        //   536: goto            541
        //   539: ldc             546580896
        //   541: ldc             -2147140947
        //   543: ixor           
        //   544: lookupswitch {
        //          -1601105139: 572
        //          1326075183: 539
        //          default: 1459
        //        }
        //   572: goto            576
        //   575: athrow         
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   579: goto            583
        //   582: athrow         
        //   583: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   586: goto            590
        //   589: athrow         
        //   590: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   593: goto            597
        //   596: athrow         
        //   597: goto            601
        //   600: athrow         
        //   601: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   604: goto            608
        //   607: athrow         
        //   608: astore_2       
        //   609: goto            679
        //   612: new             Ljava/lang/StringBuilder;
        //   615: dup            
        //   616: goto            620
        //   619: athrow         
        //   620: invokespecial   java/lang/StringBuilder.<init>:()V
        //   623: goto            627
        //   626: athrow         
        //   627: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   630: goto            634
        //   633: athrow         
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   637: goto            641
        //   640: athrow         
        //   641: aload_2        
        //   642: goto            646
        //   645: athrow         
        //   646: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   649: goto            653
        //   652: athrow         
        //   653: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   656: goto            660
        //   659: athrow         
        //   660: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   663: goto            667
        //   666: athrow         
        //   667: goto            671
        //   670: athrow         
        //   671: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   674: goto            678
        //   677: athrow         
        //   678: astore_2       
        //   679: aload_0        
        //   680: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0f;
        //   683: goto            687
        //   686: athrow         
        //   687: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   690: goto            694
        //   693: athrow         
        //   694: getstatic       dev/nuker/pyro/f9T.1:Ldev/nuker/pyro/f9T;
        //   697: if_acmpeq       1441
        //   700: new             Ljava/lang/StringBuilder;
        //   703: dup            
        //   704: goto            708
        //   707: athrow         
        //   708: invokespecial   java/lang/StringBuilder.<init>:()V
        //   711: goto            715
        //   714: athrow         
        //   715: getstatic       dev/nuker/pyro/fc.0:I
        //   718: ifeq            726
        //   721: ldc             -1409908211
        //   723: goto            728
        //   726: ldc             -1469504988
        //   728: ldc             52735160
        //   730: ixor           
        //   731: lookupswitch {
        //          -1462620491: 726
        //          -1420980580: 756
        //          default: 1475
        //        }
        //   756: aload_0        
        //   757: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0f;
        //   760: goto            764
        //   763: athrow         
        //   764: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   767: goto            771
        //   770: athrow         
        //   771: getstatic       dev/nuker/pyro/f9T.c:Ldev/nuker/pyro/f9T;
        //   774: if_acmpne       880
        //   777: new             Ljava/lang/StringBuilder;
        //   780: dup            
        //   781: goto            785
        //   784: athrow         
        //   785: invokespecial   java/lang/StringBuilder.<init>:()V
        //   788: goto            792
        //   791: athrow         
        //   792: aload_0        
        //   793: aload_1        
        //   794: goto            798
        //   797: athrow         
        //   798: invokevirtual   dev/nuker/pyro/f9U.2:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //   801: goto            805
        //   804: athrow         
        //   805: goto            809
        //   808: athrow         
        //   809: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   812: goto            816
        //   815: athrow         
        //   816: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   819: goto            823
        //   822: athrow         
        //   823: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   826: goto            830
        //   829: athrow         
        //   830: ldc             "\u222e\u14d3"
        //   832: goto            836
        //   835: athrow         
        //   836: invokestatic    invokestatic   !!! ERROR
        //   839: goto            843
        //   842: athrow         
        //   843: goto            847
        //   846: athrow         
        //   847: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   850: goto            854
        //   853: athrow         
        //   854: aload_2        
        //   855: goto            859
        //   858: athrow         
        //   859: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   862: goto            866
        //   865: athrow         
        //   866: goto            870
        //   869: athrow         
        //   870: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   873: goto            877
        //   876: athrow         
        //   877: goto            1147
        //   880: new             Ljava/lang/StringBuilder;
        //   883: dup            
        //   884: goto            888
        //   887: athrow         
        //   888: invokespecial   java/lang/StringBuilder.<init>:()V
        //   891: goto            895
        //   894: athrow         
        //   895: getstatic       dev/nuker/pyro/fc.0:I
        //   898: ifeq            906
        //   901: ldc             -388868710
        //   903: goto            908
        //   906: ldc             413333835
        //   908: ldc             1483258291
        //   910: ixor           
        //   911: lookupswitch {
        //          -2037868688: 906
        //          -1329927127: 1447
        //          default: 936
        //        }
        //   936: aload_2        
        //   937: getstatic       dev/nuker/pyro/fc.0:I
        //   940: ifeq            948
        //   943: ldc             -2067617522
        //   945: goto            950
        //   948: ldc             -143843898
        //   950: ldc             2106438538
        //   952: ixor           
        //   953: lookupswitch {
        //          -1964986804: 980
        //          -112256380: 948
        //          default: 1449
        //        }
        //   980: goto            984
        //   983: athrow         
        //   984: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   987: goto            991
        //   990: athrow         
        //   991: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   994: goto            998
        //   997: athrow         
        //   998: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: ldc             "\u222e\u14d3"
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokestatic    invokestatic   !!! ERROR
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: getstatic       dev/nuker/pyro/fc.0:I
        //  1021: ifeq            1029
        //  1024: ldc             -1988823864
        //  1026: goto            1031
        //  1029: ldc             -979585970
        //  1031: ldc             -420682741
        //  1033: ixor           
        //  1034: lookupswitch {
        //          594563141: 1060
        //          1872236739: 1029
        //          default: 1469
        //        }
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: aload_0        
        //  1072: aload_1        
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: invokevirtual   dev/nuker/pyro/f9U.2:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: goto            1088
        //  1087: athrow         
        //  1088: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: getstatic       dev/nuker/pyro/fc.0:I
        //  1098: ifeq            1106
        //  1101: ldc             -1432564194
        //  1103: goto            1108
        //  1106: ldc             1862810901
        //  1108: ldc             503265707
        //  1110: ixor           
        //  1111: lookupswitch {
        //          -1218185291: 1471
        //          1275820051: 1106
        //          default: 1136
        //        }
        //  1136: goto            1140
        //  1139: athrow         
        //  1140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1143: goto            1147
        //  1146: athrow         
        //  1147: goto            1151
        //  1150: athrow         
        //  1151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1154: goto            1158
        //  1157: athrow         
        //  1158: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1161: goto            1165
        //  1164: athrow         
        //  1165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: ldc             "\u222e\u14d3"
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: invokestatic    invokestatic   !!! ERROR
        //  1181: goto            1185
        //  1184: athrow         
        //  1185: getstatic       dev/nuker/pyro/fc.c:I
        //  1188: ifge            1196
        //  1191: ldc             -236071942
        //  1193: goto            1198
        //  1196: ldc             -1291941227
        //  1198: ldc             -820906574
        //  1200: ixor           
        //  1201: lookupswitch {
        //          -157806392: 1196
        //          1056712264: 1451
        //          default: 1228
        //        }
        //  1228: goto            1232
        //  1231: athrow         
        //  1232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1235: goto            1239
        //  1238: athrow         
        //  1239: getstatic       dev/nuker/pyro/fc.c:I
        //  1242: ifge            1250
        //  1245: ldc             -2129477066
        //  1247: goto            1252
        //  1250: ldc             -1190794631
        //  1252: ldc             -551545402
        //  1254: ixor           
        //  1255: lookupswitch {
        //          180094774: 1250
        //          1580390384: 1457
        //          default: 1280
        //        }
        //  1280: aload_0        
        //  1281: aload_1        
        //  1282: goto            1286
        //  1285: athrow         
        //  1286: invokevirtual   dev/nuker/pyro/f9U.c:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //  1289: goto            1293
        //  1292: athrow         
        //  1293: getstatic       dev/nuker/pyro/fc.0:I
        //  1296: ifeq            1304
        //  1299: ldc             -829209297
        //  1301: goto            1306
        //  1304: ldc             92128615
        //  1306: ldc             1057579581
        //  1308: ixor           
        //  1309: lookupswitch {
        //          -241555694: 1465
        //          60950037: 1304
        //          default: 1336
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: getstatic       dev/nuker/pyro/fc.c:I
        //  1350: ifge            1358
        //  1353: ldc             1164342724
        //  1355: goto            1360
        //  1358: ldc             -498456763
        //  1360: ldc             -1527631649
        //  1362: ixor           
        //  1363: lookupswitch {
        //          -510376677: 1358
        //          1186469786: 1388
        //          default: 1453
        //        }
        //  1388: goto            1392
        //  1391: athrow         
        //  1392: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1395: goto            1399
        //  1398: athrow         
        //  1399: getstatic       dev/nuker/pyro/fc.0:I
        //  1402: ifeq            1410
        //  1405: ldc             70326502
        //  1407: goto            1412
        //  1410: ldc             2070379626
        //  1412: ldc             213493063
        //  1414: ixor           
        //  1415: lookupswitch {
        //          143179169: 1410
        //          2011093293: 1440
        //          default: 1455
        //        }
        //  1440: astore_2       
        //  1441: aload_2        
        //  1442: areturn        
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
        //  1475: aconst_null    
        //  1476: athrow         
        //  1477: aconst_null    
        //  1478: athrow         
        //  1479: pop            
        //  1480: goto            24
        //  1483: pop            
        //  1484: aconst_null    
        //  1485: goto            1479
        //  1488: dup            
        //  1489: ifnull          1479
        //  1492: checkcast       Ljava/lang/Throwable;
        //  1495: athrow         
        //  1496: dup            
        //  1497: ifnull          1483
        //  1500: checkcast       Ljava/lang/Throwable;
        //  1503: athrow         
        //  1504: aconst_null    
        //  1505: athrow         
        //    StackMapTable: 01 17 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FD 00 03 07 00 03 07 00 36 43 07 00 34 40 07 00 36 45 07 00 34 40 07 00 DB 4A 07 00 DB FF 00 01 00 02 07 00 03 07 00 36 00 02 07 00 DB 01 5E 07 00 DB FF 00 07 00 03 07 00 03 07 00 36 07 00 DB 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 DB 00 02 07 00 47 07 00 DB 45 07 00 34 40 01 FF 00 0D 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 34 40 07 00 57 45 07 00 34 40 07 00 DD 45 07 00 13 40 07 00 5C 45 07 00 34 40 01 50 07 00 47 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 47 01 5C 07 00 47 43 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 47 07 00 DB 45 07 00 34 40 07 00 69 42 07 00 34 40 07 00 69 45 07 00 34 40 07 00 DB 4A 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 DB 01 5B 07 00 DB 00 46 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 00 F5 08 00 F5 45 07 00 34 40 07 00 70 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 43 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 45 07 00 1F FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 42 07 00 23 40 07 00 70 45 07 00 34 40 07 00 DB 03 0A 41 01 1B 4B 07 00 36 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 36 01 5D 07 00 36 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 36 45 07 00 34 40 01 FF 00 09 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 01 9E 08 01 9E 45 07 00 34 40 07 00 70 4A 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5D 07 00 70 FF 00 0D 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 76 01 FF 00 1B 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 FF 00 0B 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1E 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 42 07 00 19 40 07 00 70 45 07 00 34 40 07 00 DB 03 46 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 64 08 02 64 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 43 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 70 45 07 00 34 40 07 00 DB 00 46 07 00 34 40 07 00 A5 45 07 00 34 40 07 00 DD 4C 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 BC 08 02 BC 45 07 00 34 40 07 00 70 4A 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5B 07 00 70 46 07 00 25 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 A5 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DD 4C 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 08 03 09 08 03 09 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 44 07 00 1D FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 04 07 00 70 07 00 70 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 76 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 44 07 00 19 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 42 07 00 19 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 43 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 42 07 00 19 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 70 46 07 00 15 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 08 03 70 08 03 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 0A 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 01 FF 00 1B 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 0B 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 04 07 00 70 07 00 70 07 00 DB 01 FF 00 1D 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 76 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 0A 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 04 07 00 70 07 00 70 07 00 DB 01 FF 00 1C 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 44 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 04 07 00 70 07 00 70 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 0A 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 01 FF 00 1B 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 42 07 00 0F FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 44 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 0A 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1D 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4A 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5B 07 00 70 44 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 0A 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1D 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4A 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5B 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 4A 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 DB 01 5B 07 00 DB 00 41 07 00 47 01 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 41 07 00 70 41 07 00 DB 41 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 41 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 02 07 00 03 07 00 36 00 01 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 70 41 07 00 70 41 07 00 70 41 07 00 36 FF 00 01 00 02 07 00 03 07 00 36 00 01 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1488   1496   Any
        //  1488   1496   1488   1496   Ljava/lang/ClassCastException;
        //  1504   1506   3      8      Ljava/lang/NumberFormatException;
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/StringIndexOutOfBoundsException;
        //  29     35     3      8      Any
        //  28     35     35     36     Ljava/lang/ClassCastException;
        //  28     35     28     29     Any
        //  88     95     95     96     Any
        //  89     95     3      8      Any
        //  88     95     88     89     Any
        //  88     95     95     96     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  88     95     95     96     Ljava/lang/UnsupportedOperationException;
        //  110    117    117    118    Any
        //  110    117    110    111    Any
        //  111    117    3      8      Ljava/lang/NumberFormatException;
        //  110    117    110    111    Any
        //  110    117    3      8      Any
        //  124    131    131    132    Any
        //  124    131    131    132    Ljava/lang/RuntimeException;
        //  125    131    3      8      Any
        //  124    131    124    125    Ljava/lang/StringIndexOutOfBoundsException;
        //  124    131    131    132    Any
        //  184    191    191    192    Any
        //  184    191    3      8      Ljava/lang/AssertionError;
        //  185    191    3      8      Any
        //  185    191    191    192    Ljava/lang/NegativeArraySizeException;
        //  185    191    184    185    Any
        //  195    202    202    203    Any
        //  196    202    195    196    Any
        //  196    202    3      8      Any
        //  196    202    195    196    Any
        //  196    202    195    196    Any
        //  252    259    259    260    Any
        //  252    259    3      8      Any
        //  252    259    3      8      Any
        //  252    259    252    253    Any
        //  252    259    3      8      Any
        //  267    273    273    274    Any
        //  267    273    3      8      Any
        //  267    273    3      8      Ljava/lang/RuntimeException;
        //  267    273    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  267    273    273    274    Ljava/lang/StringIndexOutOfBoundsException;
        //  278    285    285    286    Any
        //  279    285    285    286    Ljava/lang/StringIndexOutOfBoundsException;
        //  278    285    278    279    Any
        //  279    285    3      8      Any
        //  278    285    278    279    Any
        //  292    299    299    300    Any
        //  293    299    3      8      Any
        //  292    299    3      8      Any
        //  293    299    292    293    Ljava/lang/IllegalStateException;
        //  292    299    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  303    310    310    311    Any
        //  304    310    3      8      Ljava/lang/NullPointerException;
        //  303    310    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  303    310    310    311    Ljava/lang/ArithmeticException;
        //  304    310    303    304    Ljava/lang/ArithmeticException;
        //  404    410    410    411    Any
        //  404    410    410    411    Any
        //  404    410    410    411    Any
        //  404    410    3      8      Ljava/lang/NullPointerException;
        //  404    410    410    411    Any
        //  422    428    428    429    Any
        //  422    428    428    429    Ljava/lang/NumberFormatException;
        //  422    428    3      8      Any
        //  422    428    3      8      Any
        //  422    428    428    429    Any
        //  519    526    526    527    Any
        //  520    526    526    527    Any
        //  519    526    3      8      Ljava/lang/ArithmeticException;
        //  520    526    519    520    Any
        //  520    526    3      8      Any
        //  575    582    582    583    Any
        //  575    582    582    583    Any
        //  575    582    3      8      Ljava/lang/UnsupportedOperationException;
        //  575    582    575    576    Any
        //  576    582    3      8      Any
        //  589    596    596    597    Any
        //  589    596    3      8      Any
        //  590    596    3      8      Any
        //  590    596    589    590    Any
        //  590    596    589    590    Any
        //  600    607    607    608    Any
        //  600    607    600    601    Ljava/lang/StringIndexOutOfBoundsException;
        //  600    607    600    601    Ljava/lang/IllegalArgumentException;
        //  601    607    600    601    Ljava/lang/IndexOutOfBoundsException;
        //  600    607    600    601    Ljava/lang/ArithmeticException;
        //  619    626    626    627    Any
        //  620    626    619    620    Ljava/lang/AssertionError;
        //  619    626    619    620    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  619    626    626    627    Ljava/lang/IndexOutOfBoundsException;
        //  620    626    619    620    Ljava/lang/NegativeArraySizeException;
        //  633    640    640    641    Any
        //  633    640    633    634    Ljava/lang/RuntimeException;
        //  633    640    633    634    Any
        //  633    640    633    634    Any
        //  634    640    640    641    Ljava/lang/StringIndexOutOfBoundsException;
        //  645    652    652    653    Any
        //  645    652    645    646    Ljava/lang/NullPointerException;
        //  645    652    645    646    Any
        //  646    652    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  645    652    3      8      Any
        //  660    666    666    667    Any
        //  660    666    3      8      Any
        //  660    666    666    667    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  660    666    3      8      Ljava/lang/NumberFormatException;
        //  660    666    3      8      Any
        //  671    677    677    678    Any
        //  671    677    3      8      Ljava/lang/AssertionError;
        //  671    677    3      8      Any
        //  671    677    3      8      Any
        //  671    677    677    678    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  686    693    693    694    Any
        //  687    693    686    687    Ljava/lang/AssertionError;
        //  687    693    693    694    Any
        //  687    693    693    694    Ljava/lang/NumberFormatException;
        //  686    693    686    687    Ljava/lang/ClassCastException;
        //  707    714    714    715    Any
        //  708    714    707    708    Any
        //  708    714    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  708    714    714    715    Any
        //  707    714    707    708    Ljava/lang/IndexOutOfBoundsException;
        //  763    770    770    771    Any
        //  764    770    3      8      Any
        //  764    770    770    771    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  764    770    763    764    Ljava/lang/IllegalArgumentException;
        //  764    770    3      8      Any
        //  784    791    791    792    Any
        //  785    791    791    792    Any
        //  785    791    784    785    Ljava/lang/ClassCastException;
        //  784    791    791    792    Any
        //  784    791    784    785    Any
        //  797    804    804    805    Any
        //  798    804    3      8      Ljava/lang/IllegalStateException;
        //  797    804    804    805    Any
        //  797    804    797    798    Ljava/lang/NegativeArraySizeException;
        //  797    804    804    805    Ljava/lang/IllegalStateException;
        //  808    815    815    816    Any
        //  808    815    3      8      Ljava/lang/IllegalArgumentException;
        //  809    815    815    816    Ljava/lang/IllegalArgumentException;
        //  808    815    808    809    Any
        //  808    815    3      8      Ljava/lang/UnsupportedOperationException;
        //  823    829    829    830    Any
        //  823    829    3      8      Ljava/lang/ArithmeticException;
        //  823    829    3      8      Ljava/lang/NumberFormatException;
        //  823    829    3      8      Any
        //  823    829    829    830    Any
        //  835    842    842    843    Any
        //  836    842    842    843    Any
        //  835    842    835    836    Ljava/util/NoSuchElementException;
        //  836    842    835    836    Ljava/lang/StringIndexOutOfBoundsException;
        //  835    842    3      8      Ljava/lang/ArithmeticException;
        //  846    853    853    854    Any
        //  846    853    3      8      Ljava/lang/AssertionError;
        //  847    853    846    847    Ljava/lang/RuntimeException;
        //  846    853    846    847    Ljava/lang/StringIndexOutOfBoundsException;
        //  846    853    3      8      Any
        //  858    865    865    866    Any
        //  859    865    865    866    Ljava/util/NoSuchElementException;
        //  858    865    858    859    Any
        //  858    865    858    859    Ljava/lang/EnumConstantNotPresentException;
        //  858    865    865    866    Any
        //  869    876    876    877    Any
        //  869    876    3      8      Ljava/util/NoSuchElementException;
        //  869    876    869    870    Ljava/lang/EnumConstantNotPresentException;
        //  869    876    869    870    Ljava/lang/NegativeArraySizeException;
        //  870    876    3      8      Ljava/lang/RuntimeException;
        //  887    894    894    895    Any
        //  887    894    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  888    894    887    888    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  888    894    894    895    Ljava/lang/UnsupportedOperationException;
        //  888    894    3      8      Any
        //  983    990    990    991    Any
        //  983    990    3      8      Any
        //  983    990    983    984    Any
        //  984    990    983    984    Any
        //  984    990    983    984    Any
        //  997    1004   1004   1005   Any
        //  998    1004   1004   1005   Ljava/lang/NumberFormatException;
        //  997    1004   997    998    Ljava/lang/IllegalArgumentException;
        //  997    1004   997    998    Ljava/lang/IllegalArgumentException;
        //  997    1004   997    998    Any
        //  1011   1017   1017   1018   Any
        //  1011   1017   3      8      Ljava/lang/IllegalArgumentException;
        //  1011   1017   3      8      Any
        //  1011   1017   3      8      Ljava/lang/IllegalArgumentException;
        //  1011   1017   1017   1018   Ljava/lang/UnsupportedOperationException;
        //  1064   1070   1070   1071   Any
        //  1064   1070   1070   1071   Any
        //  1064   1070   1070   1071   Any
        //  1064   1070   1070   1071   Any
        //  1064   1070   1070   1071   Any
        //  1076   1083   1083   1084   Any
        //  1076   1083   3      8      Any
        //  1077   1083   3      8      Ljava/lang/NumberFormatException;
        //  1076   1083   1083   1084   Any
        //  1077   1083   1076   1077   Any
        //  1087   1094   1094   1095   Any
        //  1087   1094   1087   1088   Any
        //  1087   1094   1094   1095   Any
        //  1087   1094   3      8      Ljava/lang/ClassCastException;
        //  1088   1094   1094   1095   Ljava/lang/NullPointerException;
        //  1139   1146   1146   1147   Any
        //  1140   1146   1146   1147   Any
        //  1139   1146   1146   1147   Any
        //  1139   1146   1139   1140   Ljava/lang/ClassCastException;
        //  1139   1146   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1150   1157   1157   1158   Any
        //  1150   1157   1150   1151   Any
        //  1151   1157   1157   1158   Any
        //  1150   1157   3      8      Ljava/util/ConcurrentModificationException;
        //  1151   1157   1150   1151   Ljava/util/ConcurrentModificationException;
        //  1164   1171   1171   1172   Any
        //  1164   1171   3      8      Any
        //  1164   1171   1164   1165   Any
        //  1164   1171   1171   1172   Any
        //  1164   1171   3      8      Ljava/util/NoSuchElementException;
        //  1177   1184   1184   1185   Any
        //  1178   1184   1177   1178   Any
        //  1177   1184   1177   1178   Any
        //  1178   1184   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1178   1184   1184   1185   Any
        //  1231   1238   1238   1239   Any
        //  1232   1238   1231   1232   Any
        //  1232   1238   1238   1239   Ljava/lang/NegativeArraySizeException;
        //  1232   1238   1238   1239   Any
        //  1231   1238   1238   1239   Ljava/util/ConcurrentModificationException;
        //  1285   1292   1292   1293   Any
        //  1285   1292   1285   1286   Ljava/lang/RuntimeException;
        //  1286   1292   1292   1293   Ljava/lang/NumberFormatException;
        //  1286   1292   1285   1286   Any
        //  1285   1292   1285   1286   Ljava/lang/NumberFormatException;
        //  1339   1346   1346   1347   Any
        //  1339   1346   3      8      Ljava/lang/NumberFormatException;
        //  1340   1346   1346   1347   Ljava/lang/NegativeArraySizeException;
        //  1340   1346   1339   1340   Ljava/lang/NullPointerException;
        //  1340   1346   1339   1340   Any
        //  1391   1398   1398   1399   Any
        //  1391   1398   1398   1399   Ljava/lang/IllegalStateException;
        //  1391   1398   3      8      Ljava/util/NoSuchElementException;
        //  1391   1398   1398   1399   Ljava/lang/AssertionError;
        //  1391   1398   1391   1392   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public static Integer c(final ItemStack p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          88
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            80
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            72
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //    32: goto            36
        //    35: athrow         
        //    36: goto            40
        //    39: athrow         
        //    40: invokeinterface java/util/Map.size:()I
        //    45: goto            49
        //    48: athrow         
        //    49: iconst_4       
        //    50: isub           
        //    51: goto            55
        //    54: athrow         
        //    55: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    58: goto            62
        //    61: athrow         
        //    62: areturn        
        //    63: pop            
        //    64: goto            24
        //    67: pop            
        //    68: aconst_null    
        //    69: goto            63
        //    72: dup            
        //    73: ifnull          63
        //    76: checkcast       Ljava/lang/Throwable;
        //    79: athrow         
        //    80: dup            
        //    81: ifnull          67
        //    84: checkcast       Ljava/lang/Throwable;
        //    87: athrow         
        //    88: aconst_null    
        //    89: athrow         
        //    StackMapTable: 00 15 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FC 00 03 07 00 F2 43 07 00 34 40 07 00 F2 45 07 00 34 40 07 00 E6 42 07 00 17 40 07 00 E6 47 07 00 34 40 01 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 01 07 00 F2 00 01 01 45 07 00 34 40 07 00 EC 40 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     72     80     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     80     72     80     Any
        //  88     90     3      8      Any
        //  28     35     35     36     Any
        //  29     35     35     36     Any
        //  29     35     28     29     Ljava/lang/EnumConstantNotPresentException;
        //  28     35     3      8      Any
        //  28     35     28     29     Any
        //  39     48     48     49     Any
        //  40     48     3      8      Any
        //  40     48     3      8      Ljava/lang/NegativeArraySizeException;
        //  40     48     39     40     Ljava/lang/UnsupportedOperationException;
        //  39     48     3      8      Ljava/lang/NumberFormatException;
        //  55     61     61     62     Any
        //  55     61     61     62     Any
        //  55     61     3      8      Ljava/lang/UnsupportedOperationException;
        //  55     61     61     62     Ljava/lang/NegativeArraySizeException;
        //  55     61     61     62     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 43 out of bounds for length 43
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    
    static {
        throw t;
    }
    
    public void c(final ItemStack itemStack, final int n, final int n2) {
        fbS.5C(this, 1861616609, itemStack, n, n2);
    }
    
    public void 1(final ItemStack p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1011
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1003
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            995
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_m1      
        //    25: istore          4
        //    27: aload_1        
        //    28: goto            32
        //    31: athrow         
        //    32: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.c:I
        //    42: ifge            50
        //    45: ldc             2125373982
        //    47: goto            52
        //    50: ldc             1778538773
        //    52: ldc             1557071457
        //    54: ixor           
        //    55: lookupswitch {
        //          576824447: 984
        //          1993389072: 50
        //          default: 80
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    89: goto            93
        //    92: athrow         
        //    93: goto            97
        //    96: athrow         
        //    97: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   102: goto            106
        //   105: athrow         
        //   106: dup            
        //   107: astore          5
        //   109: astore          6
        //   111: getstatic       dev/nuker/pyro/fc.0:I
        //   114: ifeq            123
        //   117: ldc_w           15962711
        //   120: goto            126
        //   123: ldc_w           1583116726
        //   126: ldc_w           23644267
        //   129: ixor           
        //   130: lookupswitch {
        //          26958396: 964
        //          858504663: 123
        //          default: 156
        //        }
        //   156: aload           6
        //   158: getstatic       dev/nuker/pyro/fc.1:I
        //   161: ifeq            170
        //   164: ldc_w           -499233854
        //   167: goto            173
        //   170: ldc_w           -844018220
        //   173: ldc_w           -1048665047
        //   176: ixor           
        //   177: lookupswitch {
        //          -222589339: 170
        //          591458283: 966
        //          default: 204
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokeinterface java/util/Iterator.hasNext:()Z
        //   213: goto            217
        //   216: athrow         
        //   217: ifeq            226
        //   220: ldc_w           -435199717
        //   223: goto            229
        //   226: ldc_w           -435199720
        //   229: ldc_w           -1204019258
        //   232: ixor           
        //   233: tableswitch {
        //          -1134101062: 256
        //          -1134101061: 477
        //          default: 220
        //        }
        //   256: aload           5
        //   258: goto            262
        //   261: athrow         
        //   262: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   267: goto            271
        //   270: athrow         
        //   271: checkcast       Lnet/minecraft/enchantment/Enchantment;
        //   274: dup            
        //   275: astore          7
        //   277: ifnonnull       333
        //   280: aload           5
        //   282: getstatic       dev/nuker/pyro/fc.0:I
        //   285: ifeq            294
        //   288: ldc_w           977295826
        //   291: goto            297
        //   294: ldc_w           -1090739468
        //   297: ldc_w           744842963
        //   300: ixor           
        //   301: lookupswitch {
        //          -1835416537: 328
        //          371539713: 294
        //          default: 968
        //        }
        //   328: astore          6
        //   330: goto            474
        //   333: aload_0        
        //   334: aload           7
        //   336: aload           7
        //   338: aload_1        
        //   339: goto            343
        //   342: athrow         
        //   343: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77506_a:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //   346: goto            350
        //   349: athrow         
        //   350: goto            354
        //   353: athrow         
        //   354: invokevirtual   dev/nuker/pyro/f9U.c:(Lnet/minecraft/enchantment/Enchantment;I)Ljava/lang/String;
        //   357: goto            361
        //   360: athrow         
        //   361: iload_2        
        //   362: iconst_2       
        //   363: imul           
        //   364: i2f            
        //   365: iload_3        
        //   366: i2f            
        //   367: iconst_m1      
        //   368: getstatic       dev/nuker/pyro/fc.0:I
        //   371: ifeq            380
        //   374: ldc_w           -22710326
        //   377: goto            383
        //   380: ldc_w           -819859574
        //   383: ldc_w           -706530800
        //   386: ixor           
        //   387: lookupswitch {
        //          448978330: 412
        //          726025690: 380
        //          default: 976
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //   419: goto            423
        //   422: athrow         
        //   423: iinc            3, 8
        //   426: aload           5
        //   428: getstatic       dev/nuker/pyro/fc.0:I
        //   431: ifeq            440
        //   434: ldc_w           -359056937
        //   437: goto            443
        //   440: ldc_w           405560651
        //   443: ldc_w           -1968987021
        //   446: ixor           
        //   447: lookupswitch {
        //          -1836058312: 472
        //          1614454180: 440
        //          default: 980
        //        }
        //   472: astore          6
        //   474: goto            111
        //   477: aload_1        
        //   478: getstatic       dev/nuker/pyro/fc.1:I
        //   481: ifeq            490
        //   484: ldc_w           -2131203058
        //   487: goto            493
        //   490: ldc_w           42475393
        //   493: ldc_w           -1533400275
        //   496: ixor           
        //   497: lookupswitch {
        //          -1508756308: 524
        //          610420515: 490
        //          default: 960
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   531: goto            535
        //   534: athrow         
        //   535: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   538: goto            542
        //   541: athrow         
        //   542: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   545: goto            549
        //   548: athrow         
        //   549: ifeq            959
        //   552: aload_1        
        //   553: getstatic       dev/nuker/pyro/fc.c:I
        //   556: ifge            565
        //   559: ldc_w           -349842326
        //   562: goto            568
        //   565: ldc_w           -597157752
        //   568: ldc_w           -794751696
        //   571: ixor           
        //   572: lookupswitch {
        //          -1323361792: 565
        //          998562138: 970
        //          default: 600
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   net/minecraft/item/ItemStack.func_77962_s:()Z
        //   607: goto            611
        //   610: athrow         
        //   611: ifeq            620
        //   614: ldc_w           -1452364689
        //   617: goto            623
        //   620: ldc_w           -1452364696
        //   623: ldc_w           793039444
        //   626: ixor           
        //   627: tableswitch {
        //          206896246: 648
        //          206896247: 959
        //          default: 614
        //        }
        //   648: new             Ljava/lang/StringBuilder;
        //   651: dup            
        //   652: goto            656
        //   655: athrow         
        //   656: invokespecial   java/lang/StringBuilder.<init>:()V
        //   659: goto            663
        //   662: athrow         
        //   663: getstatic       dev/nuker/pyro/fc.c:I
        //   666: ifge            675
        //   669: ldc_w           -2100569075
        //   672: goto            678
        //   675: ldc_w           1521102128
        //   678: ldc_w           -90281972
        //   681: ixor           
        //   682: lookupswitch {
        //          2018882561: 982
        //          2082292088: 675
        //          default: 708
        //        }
        //   708: getstatic       com/mojang/realmsclient/gui/ChatFormatting.DARK_RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   711: getstatic       dev/nuker/pyro/fc.0:I
        //   714: ifeq            723
        //   717: ldc_w           -414022575
        //   720: goto            726
        //   723: ldc_w           1299513340
        //   726: ldc_w           -647459782
        //   729: ixor           
        //   730: lookupswitch {
        //          -89980204: 723
        //          1043990635: 972
        //          default: 756
        //        }
        //   756: goto            760
        //   759: athrow         
        //   760: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   763: goto            767
        //   766: athrow         
        //   767: ldc_w           "\u2249\u149c\u8b7b"
        //   770: getstatic       dev/nuker/pyro/fc.0:I
        //   773: ifeq            782
        //   776: ldc_w           375645115
        //   779: goto            785
        //   782: ldc_w           -481510598
        //   785: ldc_w           -176000441
        //   788: ixor           
        //   789: lookupswitch {
        //          -471756292: 974
        //          793126423: 782
        //          default: 816
        //        }
        //   816: goto            820
        //   819: athrow         
        //   820: invokestatic    invokestatic   !!! ERROR
        //   823: goto            827
        //   826: athrow         
        //   827: goto            831
        //   830: athrow         
        //   831: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   834: goto            838
        //   837: athrow         
        //   838: goto            842
        //   841: athrow         
        //   842: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   845: goto            849
        //   848: athrow         
        //   849: iload_2        
        //   850: iconst_2       
        //   851: imul           
        //   852: i2f            
        //   853: getstatic       dev/nuker/pyro/fc.c:I
        //   856: ifge            865
        //   859: ldc_w           738090923
        //   862: goto            868
        //   865: ldc_w           -571507495
        //   868: ldc_w           1517279121
        //   871: ixor           
        //   872: lookupswitch {
        //          -2021610680: 900
        //          1905363002: 865
        //          default: 978
        //        }
        //   900: iload_3        
        //   901: i2f            
        //   902: iconst_m1      
        //   903: getstatic       dev/nuker/pyro/fc.c:I
        //   906: ifge            915
        //   909: ldc_w           -1637462375
        //   912: goto            918
        //   915: ldc_w           2143616333
        //   918: ldc_w           -1833791394
        //   921: ixor           
        //   922: lookupswitch {
        //          215277255: 962
        //          566010219: 915
        //          default: 948
        //        }
        //   948: goto            952
        //   951: athrow         
        //   952: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //   955: goto            959
        //   958: athrow         
        //   959: return         
        //   960: aconst_null    
        //   961: athrow         
        //   962: aconst_null    
        //   963: athrow         
        //   964: aconst_null    
        //   965: athrow         
        //   966: aconst_null    
        //   967: athrow         
        //   968: aconst_null    
        //   969: athrow         
        //   970: aconst_null    
        //   971: athrow         
        //   972: aconst_null    
        //   973: athrow         
        //   974: aconst_null    
        //   975: athrow         
        //   976: aconst_null    
        //   977: athrow         
        //   978: aconst_null    
        //   979: athrow         
        //   980: aconst_null    
        //   981: athrow         
        //   982: aconst_null    
        //   983: athrow         
        //   984: aconst_null    
        //   985: athrow         
        //   986: pop            
        //   987: goto            24
        //   990: pop            
        //   991: aconst_null    
        //   992: goto            986
        //   995: dup            
        //   996: ifnull          986
        //   999: checkcast       Ljava/lang/Throwable;
        //  1002: athrow         
        //  1003: dup            
        //  1004: ifnull          990
        //  1007: checkcast       Ljava/lang/Throwable;
        //  1010: athrow         
        //  1011: aconst_null    
        //  1012: athrow         
        //    StackMapTable: 00 8D FF 00 03 00 05 07 00 03 07 00 F2 01 01 01 00 01 07 00 34 FA 00 04 FF 00 0B 00 00 00 01 07 00 34 FF 00 03 00 04 07 00 03 07 00 F2 01 01 00 00 FF 00 06 00 05 07 00 03 07 00 F2 01 01 01 00 01 07 00 34 40 07 00 F2 45 07 00 34 40 07 00 E6 4A 07 00 E6 FF 00 01 00 05 07 00 03 07 00 F2 01 01 01 00 02 07 00 E6 01 5B 07 00 E6 42 07 00 34 40 07 00 E6 47 07 00 34 40 07 01 05 42 07 00 19 40 07 01 05 47 07 00 34 40 07 01 11 FD 00 04 07 01 11 07 01 11 0B 42 01 1D 4D 07 01 11 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 01 11 01 5E 07 01 11 42 07 00 34 40 07 01 11 47 07 00 34 40 01 02 05 42 01 1A 44 07 00 34 40 07 01 11 47 07 00 34 40 07 00 DD FF 00 16 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 01 07 01 11 FF 00 02 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 02 07 01 11 01 5E 07 01 11 04 FF 00 08 00 00 00 01 07 00 34 FF 00 00 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 04 07 00 03 07 01 1C 07 01 1C 07 00 F2 45 07 00 34 FF 00 00 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 03 07 00 03 07 01 1C 01 42 07 00 34 FF 00 00 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 03 07 00 03 07 01 1C 01 45 07 00 34 40 07 00 DB FF 00 12 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 04 07 00 DB 02 02 01 FF 00 02 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 05 07 00 DB 02 02 01 01 FF 00 1C 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 04 07 00 DB 02 02 01 42 07 00 34 FF 00 00 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 04 07 00 DB 02 02 01 45 07 00 34 00 50 07 01 11 FF 00 02 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 02 07 01 11 01 5C 07 01 11 01 FA 00 02 4C 07 00 F2 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 F2 01 5E 07 00 F2 42 07 00 34 40 07 00 F2 45 07 00 34 40 07 01 61 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 01 61 07 01 61 45 07 00 34 40 01 4F 07 00 F2 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 F2 01 5F 07 00 F2 42 07 00 34 40 07 00 F2 45 07 00 34 40 01 02 05 42 01 18 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 08 02 88 08 02 88 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 01 5D 07 00 70 FF 00 0E 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 76 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 03 07 00 70 07 00 76 01 FF 00 1D 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 76 42 07 00 29 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 FF 00 0E 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 03 07 00 70 07 00 DB 01 FF 00 1E 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB 42 07 00 17 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB 42 07 00 13 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB FF 00 0F 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 DB 02 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 03 07 00 DB 02 01 FF 00 1F 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 DB 02 FF 00 0E 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 04 07 00 DB 02 02 01 FF 00 02 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 05 07 00 DB 02 02 01 01 FF 00 1D 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 04 07 00 DB 02 02 01 42 07 00 34 FF 00 00 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 04 07 00 DB 02 02 01 45 07 00 34 00 40 07 00 F2 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 04 07 00 DB 02 02 01 01 41 07 01 11 FF 00 01 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 01 07 01 11 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 01 07 00 F2 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 76 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 70 07 00 DB FF 00 01 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 04 07 00 DB 02 02 01 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 02 07 00 DB 02 FF 00 01 00 08 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 07 01 1C 00 01 07 01 11 FF 00 01 00 07 07 00 03 07 00 F2 01 01 01 07 01 11 07 01 11 00 01 07 00 70 FF 00 01 00 05 07 00 03 07 00 F2 01 01 01 00 01 07 00 E6 FF 00 01 00 04 07 00 03 07 00 F2 01 01 00 01 07 00 34 43 05 44 07 00 34 47 05 FF 00 07 00 05 07 00 03 07 00 F2 01 01 01 00 01 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     995    1003   Any
        //  995    1003   995    1003   Any
        //  1011   1013   3      8      Any
        //  31     38     38     39     Any
        //  31     38     38     39     Any
        //  32     38     38     39     Ljava/util/NoSuchElementException;
        //  32     38     31     32     Any
        //  32     38     3      8      Any
        //  83     92     92     93     Any
        //  84     92     92     93     Ljava/lang/IndexOutOfBoundsException;
        //  84     92     83     84     Any
        //  83     92     3      8      Ljava/lang/NumberFormatException;
        //  84     92     3      8      Ljava/lang/AssertionError;
        //  96     105    105    106    Any
        //  96     105    3      8      Ljava/util/NoSuchElementException;
        //  96     105    96     97     Ljava/util/ConcurrentModificationException;
        //  96     105    105    106    Any
        //  96     105    96     97     Ljava/lang/StringIndexOutOfBoundsException;
        //  207    216    216    217    Any
        //  208    216    216    217    Ljava/lang/UnsupportedOperationException;
        //  207    216    216    217    Ljava/lang/NegativeArraySizeException;
        //  208    216    207    208    Any
        //  208    216    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  261    270    270    271    Any
        //  262    270    3      8      Ljava/lang/RuntimeException;
        //  262    270    261    262    Ljava/lang/EnumConstantNotPresentException;
        //  262    270    270    271    Ljava/util/NoSuchElementException;
        //  262    270    261    262    Any
        //  343    349    349    350    Any
        //  343    349    3      8      Ljava/lang/NullPointerException;
        //  343    349    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  343    349    349    350    Any
        //  343    349    349    350    Ljava/lang/NullPointerException;
        //  353    360    360    361    Any
        //  354    360    3      8      Ljava/lang/ClassCastException;
        //  353    360    353    354    Any
        //  354    360    353    354    Ljava/lang/NullPointerException;
        //  354    360    3      8      Any
        //  415    422    422    423    Any
        //  416    422    3      8      Ljava/lang/ClassCastException;
        //  416    422    415    416    Any
        //  416    422    3      8      Ljava/lang/NullPointerException;
        //  416    422    3      8      Any
        //  527    534    534    535    Any
        //  528    534    534    535    Any
        //  527    534    3      8      Ljava/lang/NullPointerException;
        //  527    534    527    528    Any
        //  528    534    527    528    Any
        //  542    548    548    549    Any
        //  542    548    548    549    Ljava/util/NoSuchElementException;
        //  542    548    548    549    Any
        //  542    548    548    549    Ljava/lang/IndexOutOfBoundsException;
        //  542    548    3      8      Ljava/lang/RuntimeException;
        //  603    610    610    611    Any
        //  603    610    610    611    Any
        //  603    610    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  604    610    603    604    Ljava/lang/IllegalArgumentException;
        //  603    610    603    604    Ljava/lang/AssertionError;
        //  656    662    662    663    Any
        //  656    662    3      8      Any
        //  656    662    662    663    Ljava/lang/EnumConstantNotPresentException;
        //  656    662    3      8      Any
        //  656    662    662    663    Any
        //  759    766    766    767    Any
        //  759    766    3      8      Ljava/lang/NegativeArraySizeException;
        //  760    766    3      8      Ljava/util/ConcurrentModificationException;
        //  759    766    3      8      Ljava/lang/NegativeArraySizeException;
        //  759    766    759    760    Ljava/lang/EnumConstantNotPresentException;
        //  819    826    826    827    Any
        //  819    826    3      8      Ljava/lang/NegativeArraySizeException;
        //  819    826    826    827    Ljava/util/ConcurrentModificationException;
        //  819    826    826    827    Ljava/lang/RuntimeException;
        //  819    826    819    820    Ljava/lang/UnsupportedOperationException;
        //  830    837    837    838    Any
        //  831    837    830    831    Ljava/lang/StringIndexOutOfBoundsException;
        //  830    837    837    838    Any
        //  830    837    3      8      Any
        //  830    837    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  841    848    848    849    Any
        //  841    848    841    842    Any
        //  842    848    841    842    Any
        //  842    848    848    849    Any
        //  841    848    3      8      Any
        //  951    958    958    959    Any
        //  952    958    3      8      Any
        //  951    958    951    952    Any
        //  951    958    3      8      Any
        //  951    958    951    952    Ljava/lang/NullPointerException;
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
    
    public boolean 0(final EntityPlayer entityPlayer) {
        return fbS.1T(this, 1901438489, entityPlayer);
    }
    
    public String c(final Enchantment p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1132
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1124
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1116
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: iload_2        
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   net/minecraft/enchantment/Enchantment.func_77316_c:(I)Ljava/lang/String;
        //    33: goto            37
        //    36: athrow         
        //    37: ldc_w           "\u2258\u1492\u8b71\ub1c1\ucf47\uec60"
        //    40: goto            44
        //    43: athrow         
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: goto            51
        //    50: athrow         
        //    51: goto            55
        //    54: athrow         
        //    55: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    58: goto            62
        //    61: athrow         
        //    62: ifeq            178
        //    65: new             Ljava/lang/StringBuilder;
        //    68: dup            
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            81
        //    75: ldc_w           70400711
        //    78: goto            84
        //    81: ldc_w           1156483777
        //    84: ldc_w           -1430923059
        //    87: ixor           
        //    88: lookupswitch {
        //          -1366826486: 1099
        //          352926722: 81
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   137: goto            141
        //   140: athrow         
        //   141: ldc_w           "\u2258\u1492\u8b71"
        //   144: goto            148
        //   147: athrow         
        //   148: invokestatic    invokestatic   !!! ERROR
        //   151: goto            155
        //   154: athrow         
        //   155: goto            159
        //   158: athrow         
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: goto            166
        //   165: athrow         
        //   166: goto            170
        //   169: athrow         
        //   170: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   173: goto            177
        //   176: athrow         
        //   177: areturn        
        //   178: aload_1        
        //   179: iload_2        
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   net/minecraft/enchantment/Enchantment.func_77316_c:(I)Ljava/lang/String;
        //   187: goto            191
        //   190: athrow         
        //   191: ldc_w           "\u224c\u149a\u8b71\ub1cc"
        //   194: goto            198
        //   197: athrow         
        //   198: invokestatic    invokestatic   !!! ERROR
        //   201: goto            205
        //   204: athrow         
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   212: goto            216
        //   215: athrow         
        //   216: ifeq            225
        //   219: ldc_w           -780361035
        //   222: goto            228
        //   225: ldc_w           -780361036
        //   228: ldc_w           -679394565
        //   231: ixor           
        //   232: tableswitch {
        //          234602652: 256
        //          234602653: 368
        //          default: 219
        //        }
        //   256: new             Ljava/lang/StringBuilder;
        //   259: dup            
        //   260: goto            264
        //   263: athrow         
        //   264: invokespecial   java/lang/StringBuilder.<init>:()V
        //   267: goto            271
        //   270: athrow         
        //   271: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   274: goto            278
        //   277: athrow         
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   281: goto            285
        //   284: athrow         
        //   285: ldc_w           "\u224c\u149a\u8b71\ub1cc"
        //   288: goto            292
        //   291: athrow         
        //   292: invokestatic    invokestatic   !!! ERROR
        //   295: goto            299
        //   298: athrow         
        //   299: goto            303
        //   302: athrow         
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: goto            310
        //   309: athrow         
        //   310: getstatic       dev/nuker/pyro/fc.0:I
        //   313: ifeq            322
        //   316: ldc_w           605912566
        //   319: goto            325
        //   322: ldc_w           -2072154439
        //   325: ldc_w           -1795564394
        //   328: ixor           
        //   329: lookupswitch {
        //          -1651365268: 322
        //          -1327193760: 1091
        //          default: 356
        //        }
        //   356: goto            360
        //   359: athrow         
        //   360: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   363: goto            367
        //   366: athrow         
        //   367: areturn        
        //   368: aload_1        
        //   369: iload_2        
        //   370: goto            374
        //   373: athrow         
        //   374: invokevirtual   net/minecraft/enchantment/Enchantment.func_77316_c:(I)Ljava/lang/String;
        //   377: goto            381
        //   380: athrow         
        //   381: astore_3       
        //   382: getstatic       dev/nuker/pyro/fc.c:I
        //   385: ifge            394
        //   388: ldc_w           720888062
        //   391: goto            397
        //   394: ldc_w           -35279123
        //   397: ldc_w           1153991616
        //   400: ixor           
        //   401: lookupswitch {
        //          -938469563: 394
        //          1849647934: 1101
        //          default: 428
        //        }
        //   428: iload_2        
        //   429: iconst_1       
        //   430: if_icmple       439
        //   433: ldc_w           2097230118
        //   436: goto            442
        //   439: ldc_w           2097230113
        //   442: ldc_w           1975157365
        //   445: ixor           
        //   446: tableswitch {
        //          293037734: 468
        //          293037735: 472
        //          default: 433
        //        }
        //   468: iconst_2       
        //   469: goto            473
        //   472: iconst_3       
        //   473: getstatic       dev/nuker/pyro/fc.0:I
        //   476: ifeq            485
        //   479: ldc_w           10555495
        //   482: goto            488
        //   485: ldc_w           -646760230
        //   488: ldc_w           -1088185499
        //   491: ixor           
        //   492: lookupswitch {
        //          -1081963774: 485
        //          1716560831: 520
        //          default: 1083
        //        }
        //   520: istore          4
        //   522: aload_3        
        //   523: goto            527
        //   526: athrow         
        //   527: invokevirtual   java/lang/String.length:()I
        //   530: goto            534
        //   533: athrow         
        //   534: getstatic       dev/nuker/pyro/fc.c:I
        //   537: ifge            546
        //   540: ldc_w           197706745
        //   543: goto            549
        //   546: ldc_w           532226230
        //   549: ldc_w           991988492
        //   552: ixor           
        //   553: lookupswitch {
        //          547497520: 546
        //          820529397: 1085
        //          default: 580
        //        }
        //   580: iload           4
        //   582: if_icmple       648
        //   585: aload_3        
        //   586: iconst_0       
        //   587: iload           4
        //   589: getstatic       dev/nuker/pyro/fc.c:I
        //   592: ifge            601
        //   595: ldc_w           -810525953
        //   598: goto            604
        //   601: ldc_w           1338875750
        //   604: ldc_w           707254871
        //   607: ixor           
        //   608: lookupswitch {
        //          -443055960: 601
        //          1709851953: 636
        //          default: 1095
        //        }
        //   636: goto            640
        //   639: athrow         
        //   640: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   643: goto            647
        //   646: athrow         
        //   647: astore_3       
        //   648: new             Ljava/lang/StringBuilder;
        //   651: dup            
        //   652: goto            656
        //   655: athrow         
        //   656: invokespecial   java/lang/StringBuilder.<init>:()V
        //   659: goto            663
        //   662: athrow         
        //   663: getstatic       dev/nuker/pyro/fc.c:I
        //   666: ifge            675
        //   669: ldc_w           -1051457999
        //   672: goto            678
        //   675: ldc_w           -2020158644
        //   678: ldc_w           -1967890559
        //   681: ixor           
        //   682: lookupswitch {
        //          -1280768280: 675
        //          1272994224: 1087
        //          default: 708
        //        }
        //   708: astore          5
        //   710: getstatic       dev/nuker/pyro/fc.0:I
        //   713: ifeq            722
        //   716: ldc_w           -1169120603
        //   719: goto            725
        //   722: ldc_w           2087440712
        //   725: ldc_w           221997776
        //   728: ixor           
        //   729: lookupswitch {
        //          -1217673099: 1105
        //          1122883807: 722
        //          default: 756
        //        }
        //   756: aload_3        
        //   757: astore          6
        //   759: iconst_0       
        //   760: istore          7
        //   762: aload           5
        //   764: iconst_0       
        //   765: aload           6
        //   767: iconst_0       
        //   768: iconst_1       
        //   769: goto            773
        //   772: athrow         
        //   773: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   776: goto            780
        //   779: athrow         
        //   780: goto            784
        //   783: athrow         
        //   784: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   787: goto            791
        //   790: athrow         
        //   791: goto            795
        //   794: athrow         
        //   795: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   798: goto            802
        //   801: athrow         
        //   802: aload_3        
        //   803: iconst_1       
        //   804: goto            808
        //   807: athrow         
        //   808: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   811: goto            815
        //   814: athrow         
        //   815: goto            819
        //   818: athrow         
        //   819: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   822: goto            826
        //   825: athrow         
        //   826: goto            830
        //   829: athrow         
        //   830: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   833: goto            837
        //   836: athrow         
        //   837: getstatic       dev/nuker/pyro/fc.c:I
        //   840: ifge            849
        //   843: ldc_w           -1296958053
        //   846: goto            852
        //   849: ldc_w           442864873
        //   852: ldc_w           -282049182
        //   855: ixor           
        //   856: lookupswitch {
        //          -178925173: 884
        //          1568782585: 849
        //          default: 1093
        //        }
        //   884: astore          8
        //   886: getstatic       dev/nuker/pyro/fc.1:I
        //   889: ifeq            898
        //   892: ldc_w           524997326
        //   895: goto            901
        //   898: ldc_w           187292340
        //   901: ldc_w           -1141201620
        //   904: ixor           
        //   905: lookupswitch {
        //          -1531938846: 1097
        //          1683659952: 898
        //          default: 932
        //        }
        //   932: iload_2        
        //   933: iconst_1       
        //   934: if_icmple       1036
        //   937: new             Ljava/lang/StringBuilder;
        //   940: dup            
        //   941: goto            945
        //   944: athrow         
        //   945: invokespecial   java/lang/StringBuilder.<init>:()V
        //   948: goto            952
        //   951: athrow         
        //   952: iconst_0       
        //   953: aload           8
        //   955: getstatic       dev/nuker/pyro/fc.c:I
        //   958: ifge            967
        //   961: ldc_w           -623537926
        //   964: goto            970
        //   967: ldc_w           383905341
        //   970: ldc_w           -1443236720
        //   973: ixor           
        //   974: lookupswitch {
        //          -1088939347: 1000
        //          1932289130: 967
        //          default: 1089
        //        }
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: iload_2        
        //  1012: goto            1016
        //  1015: athrow         
        //  1016: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1019: goto            1023
        //  1022: athrow         
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1030: goto            1034
        //  1033: athrow         
        //  1034: astore          8
        //  1036: getstatic       dev/nuker/pyro/fc.0:I
        //  1039: ifeq            1048
        //  1042: ldc_w           746275689
        //  1045: goto            1051
        //  1048: ldc_w           1154888837
        //  1051: ldc_w           -1402468871
        //  1054: ixor           
        //  1055: lookupswitch {
        //          -2146220400: 1048
        //          -390188676: 1080
        //          default: 1103
        //        }
        //  1080: aload           8
        //  1082: areturn        
        //  1083: aconst_null    
        //  1084: athrow         
        //  1085: aconst_null    
        //  1086: athrow         
        //  1087: aconst_null    
        //  1088: athrow         
        //  1089: aconst_null    
        //  1090: athrow         
        //  1091: aconst_null    
        //  1092: athrow         
        //  1093: aconst_null    
        //  1094: athrow         
        //  1095: aconst_null    
        //  1096: athrow         
        //  1097: aconst_null    
        //  1098: athrow         
        //  1099: aconst_null    
        //  1100: athrow         
        //  1101: aconst_null    
        //  1102: athrow         
        //  1103: aconst_null    
        //  1104: athrow         
        //  1105: aconst_null    
        //  1106: athrow         
        //  1107: pop            
        //  1108: goto            24
        //  1111: pop            
        //  1112: aconst_null    
        //  1113: goto            1107
        //  1116: dup            
        //  1117: ifnull          1107
        //  1120: checkcast       Ljava/lang/Throwable;
        //  1123: athrow         
        //  1124: dup            
        //  1125: ifnull          1111
        //  1128: checkcast       Ljava/lang/Throwable;
        //  1131: athrow         
        //  1132: aconst_null    
        //  1133: athrow         
        //    StackMapTable: 00 BF 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FE 00 03 07 00 03 07 01 1C 01 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 01 1C 01 45 07 00 34 40 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 42 07 00 27 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 45 07 00 34 40 01 FF 00 12 00 03 07 00 03 07 01 1C 01 00 02 08 00 41 08 00 41 FF 00 02 00 03 07 00 03 07 01 1C 01 00 03 08 00 41 08 00 41 01 FF 00 1F 00 03 07 00 03 07 01 1C 01 00 02 08 00 41 08 00 41 42 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 08 00 41 08 00 41 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 45 07 00 2B FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 42 07 00 2B 40 07 00 70 45 07 00 34 40 07 00 DB 00 44 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 01 1C 01 45 07 00 34 40 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 42 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 DB 07 00 DB 45 07 00 34 40 01 02 05 42 01 1B FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 08 01 00 08 01 00 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 03 07 00 03 07 01 1C 01 00 02 07 00 70 01 5E 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 00 44 07 00 13 FF 00 00 00 03 07 00 03 07 01 1C 01 00 02 07 01 1C 01 45 07 00 34 40 07 00 DB FC 00 0C 07 00 DB 42 01 1E 04 05 42 01 19 03 40 01 4B 01 FF 00 02 00 04 07 00 03 07 01 1C 01 07 00 DB 00 02 01 01 5F 01 FF 00 05 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 01 07 00 34 40 07 00 DB 45 07 00 34 40 01 4B 01 FF 00 02 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 02 01 01 5E 01 FF 00 14 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 03 07 00 DB 01 01 FF 00 02 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 04 07 00 DB 01 01 01 FF 00 1F 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 03 07 00 DB 01 01 42 07 00 11 FF 00 00 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 03 07 00 DB 01 01 45 07 00 34 40 07 00 DB 00 46 07 00 34 FF 00 00 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 02 08 02 88 08 02 88 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 02 07 00 70 01 5D 07 00 70 FC 00 0D 07 00 70 42 01 1E FF 00 0F 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 01 07 00 19 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 05 07 00 70 01 07 00 DB 01 01 45 07 00 34 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 03 07 00 70 01 07 00 DB 42 07 00 1B FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 03 07 00 70 01 07 00 DB 45 07 00 34 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 03 07 00 70 01 07 00 DB 42 07 00 34 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 03 07 00 70 01 07 00 DB 45 07 00 34 40 07 00 70 44 07 00 29 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 03 07 00 70 07 00 DB 01 45 07 00 34 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 4B 07 00 DB FF 00 02 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 02 07 00 DB 01 5F 07 00 DB FC 00 0D 07 00 DB 42 01 1E 4B 07 00 19 FF 00 00 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 02 08 03 A9 08 03 A9 45 07 00 34 40 07 00 70 FF 00 0E 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 03 07 00 70 01 07 00 DB FF 00 02 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 04 07 00 70 01 07 00 DB 01 FF 00 1D 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 03 07 00 70 01 07 00 DB 42 07 00 34 FF 00 00 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 03 07 00 70 01 07 00 DB 45 07 00 34 40 07 00 70 43 07 00 34 FF 00 00 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 02 07 00 70 01 45 07 00 34 40 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 01 0B 42 01 1C FF 00 02 00 04 07 00 03 07 01 1C 01 07 00 DB 00 01 01 FF 00 01 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 01 01 41 07 00 70 FF 00 01 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 03 07 00 70 01 07 00 DB FF 00 01 00 03 07 00 03 07 01 1C 01 00 01 07 00 70 FF 00 01 00 08 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 00 01 07 00 DB FF 00 01 00 05 07 00 03 07 01 1C 01 07 00 DB 01 00 03 07 00 DB 01 01 FF 00 01 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 00 FF 00 01 00 03 07 00 03 07 01 1C 01 00 02 08 00 41 08 00 41 FC 00 01 07 00 DB FF 00 01 00 09 07 00 03 07 01 1C 01 07 00 DB 01 07 00 70 07 00 DB 01 07 00 DB 00 00 F8 00 01 FF 00 01 00 03 07 00 03 07 01 1C 01 00 01 07 00 19 43 05 44 07 00 19 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1116   1124   Ljava/lang/NumberFormatException;
        //  1116   1124   1116   1124   Ljava/lang/IllegalStateException;
        //  1132   1134   3      8      Ljava/lang/NullPointerException;
        //  30     36     36     37     Any
        //  30     36     36     37     Any
        //  30     36     36     37     Any
        //  30     36     3      8      Ljava/lang/NegativeArraySizeException;
        //  30     36     3      8      Ljava/lang/UnsupportedOperationException;
        //  43     50     50     51     Any
        //  44     50     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  44     50     43     44     Any
        //  43     50     50     51     Ljava/lang/AssertionError;
        //  44     50     50     51     Ljava/lang/ArithmeticException;
        //  54     61     61     62     Any
        //  54     61     61     62     Any
        //  54     61     61     62     Any
        //  54     61     3      8      Any
        //  55     61     54     55     Ljava/lang/IndexOutOfBoundsException;
        //  119    126    126    127    Any
        //  119    126    119    120    Any
        //  120    126    119    120    Ljava/lang/StringIndexOutOfBoundsException;
        //  119    126    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  120    126    126    127    Ljava/lang/NullPointerException;
        //  133    140    140    141    Any
        //  133    140    140    141    Any
        //  133    140    133    134    Any
        //  134    140    140    141    Ljava/lang/IllegalArgumentException;
        //  134    140    140    141    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  147    154    154    155    Any
        //  147    154    147    148    Ljava/util/NoSuchElementException;
        //  147    154    3      8      Ljava/lang/UnsupportedOperationException;
        //  148    154    154    155    Any
        //  148    154    154    155    Ljava/lang/ArithmeticException;
        //  158    165    165    166    Any
        //  159    165    158    159    Any
        //  158    165    158    159    Ljava/lang/EnumConstantNotPresentException;
        //  159    165    3      8      Any
        //  159    165    3      8      Ljava/lang/AssertionError;
        //  169    176    176    177    Any
        //  169    176    176    177    Ljava/lang/StringIndexOutOfBoundsException;
        //  169    176    169    170    Ljava/util/NoSuchElementException;
        //  169    176    3      8      Ljava/lang/ArithmeticException;
        //  169    176    169    170    Ljava/util/NoSuchElementException;
        //  183    190    190    191    Any
        //  184    190    190    191    Any
        //  183    190    183    184    Ljava/util/ConcurrentModificationException;
        //  184    190    183    184    Any
        //  184    190    190    191    Ljava/lang/ClassCastException;
        //  197    204    204    205    Any
        //  197    204    204    205    Ljava/lang/NumberFormatException;
        //  198    204    204    205    Any
        //  198    204    197    198    Ljava/lang/AssertionError;
        //  197    204    197    198    Ljava/lang/ClassCastException;
        //  208    215    215    216    Any
        //  208    215    215    216    Any
        //  209    215    208    209    Any
        //  208    215    208    209    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  208    215    208    209    Ljava/lang/RuntimeException;
        //  264    270    270    271    Any
        //  264    270    270    271    Ljava/lang/RuntimeException;
        //  264    270    270    271    Any
        //  264    270    3      8      Any
        //  264    270    270    271    Any
        //  277    284    284    285    Any
        //  278    284    3      8      Any
        //  278    284    284    285    Any
        //  277    284    277    278    Any
        //  277    284    284    285    Any
        //  291    298    298    299    Any
        //  291    298    3      8      Any
        //  291    298    291    292    Any
        //  291    298    298    299    Any
        //  291    298    291    292    Ljava/lang/AssertionError;
        //  302    309    309    310    Any
        //  303    309    309    310    Any
        //  303    309    309    310    Ljava/lang/ArithmeticException;
        //  302    309    3      8      Ljava/util/NoSuchElementException;
        //  303    309    302    303    Any
        //  359    366    366    367    Any
        //  360    366    3      8      Any
        //  359    366    359    360    Ljava/lang/ArithmeticException;
        //  359    366    359    360    Any
        //  359    366    359    360    Any
        //  373    380    380    381    Any
        //  373    380    3      8      Any
        //  373    380    380    381    Any
        //  373    380    373    374    Ljava/lang/StringIndexOutOfBoundsException;
        //  373    380    380    381    Any
        //  526    533    533    534    Any
        //  527    533    526    527    Any
        //  527    533    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  527    533    526    527    Ljava/lang/StringIndexOutOfBoundsException;
        //  526    533    3      8      Ljava/lang/AssertionError;
        //  639    646    646    647    Any
        //  640    646    3      8      Ljava/util/NoSuchElementException;
        //  639    646    646    647    Any
        //  640    646    639    640    Ljava/lang/NumberFormatException;
        //  639    646    3      8      Any
        //  655    662    662    663    Any
        //  655    662    655    656    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  656    662    655    656    Ljava/lang/RuntimeException;
        //  655    662    662    663    Ljava/lang/IllegalStateException;
        //  656    662    655    656    Any
        //  772    779    779    780    Any
        //  772    779    3      8      Ljava/util/ConcurrentModificationException;
        //  773    779    772    773    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  772    779    779    780    Any
        //  772    779    772    773    Ljava/lang/RuntimeException;
        //  783    790    790    791    Any
        //  783    790    783    784    Ljava/lang/AssertionError;
        //  784    790    3      8      Any
        //  784    790    790    791    Ljava/lang/UnsupportedOperationException;
        //  783    790    790    791    Any
        //  794    801    801    802    Any
        //  794    801    794    795    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  794    801    794    795    Any
        //  794    801    801    802    Ljava/lang/ArithmeticException;
        //  794    801    3      8      Any
        //  807    814    814    815    Any
        //  808    814    3      8      Ljava/util/ConcurrentModificationException;
        //  808    814    3      8      Ljava/lang/UnsupportedOperationException;
        //  808    814    3      8      Any
        //  808    814    807    808    Ljava/lang/EnumConstantNotPresentException;
        //  819    825    825    826    Any
        //  819    825    825    826    Any
        //  819    825    3      8      Any
        //  819    825    3      8      Any
        //  819    825    825    826    Any
        //  829    836    836    837    Any
        //  829    836    829    830    Any
        //  829    836    836    837    Any
        //  830    836    829    830    Ljava/util/NoSuchElementException;
        //  829    836    836    837    Ljava/lang/ClassCastException;
        //  944    951    951    952    Any
        //  944    951    944    945    Ljava/util/NoSuchElementException;
        //  944    951    3      8      Ljava/lang/NumberFormatException;
        //  944    951    944    945    Ljava/lang/NumberFormatException;
        //  945    951    951    952    Any
        //  1003   1010   1010   1011   Any
        //  1003   1010   1003   1004   Any
        //  1003   1010   3      8      Any
        //  1003   1010   1010   1011   Any
        //  1003   1010   3      8      Any
        //  1015   1022   1022   1023   Any
        //  1016   1022   1022   1023   Ljava/lang/AssertionError;
        //  1016   1022   1022   1023   Ljava/lang/UnsupportedOperationException;
        //  1015   1022   1015   1016   Any
        //  1015   1022   3      8      Any
        //  1026   1033   1033   1034   Any
        //  1026   1033   1033   1034   Ljava/lang/NumberFormatException;
        //  1026   1033   1026   1027   Any
        //  1027   1033   1033   1034   Ljava/lang/NegativeArraySizeException;
        //  1026   1033   1033   1034   Any
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
    
    public static int 0(final ItemStack p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          171
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            163
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            155
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           382985068
        //    34: goto            40
        //    37: ldc_w           1600544722
        //    40: ldc_w           -1589684456
        //    43: ixor           
        //    44: lookupswitch {
        //          -1209224076: 37
        //          -27719478: 72
        //          default: 144
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.0:I
        //    86: ifeq            95
        //    89: ldc_w           -1727122621
        //    92: goto            98
        //    95: ldc_w           744209023
        //    98: ldc_w           355094652
        //   101: ixor           
        //   102: lookupswitch {
        //          -1943772353: 142
        //          1565073471: 95
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokeinterface java/util/Map.size:()I
        //   137: goto            141
        //   140: athrow         
        //   141: ireturn        
        //   142: aconst_null    
        //   143: athrow         
        //   144: aconst_null    
        //   145: athrow         
        //   146: pop            
        //   147: goto            24
        //   150: pop            
        //   151: aconst_null    
        //   152: goto            146
        //   155: dup            
        //   156: ifnull          146
        //   159: checkcast       Ljava/lang/Throwable;
        //   162: athrow         
        //   163: dup            
        //   164: ifnull          150
        //   167: checkcast       Ljava/lang/Throwable;
        //   170: athrow         
        //   171: aconst_null    
        //   172: athrow         
        //    StackMapTable: 00 19 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FC 00 03 07 00 F2 4C 07 00 F2 FF 00 02 00 01 07 00 F2 00 02 07 00 F2 01 5F 07 00 F2 42 07 00 2D 40 07 00 F2 45 07 00 34 40 07 00 E6 4B 07 00 E6 FF 00 02 00 01 07 00 F2 00 02 07 00 E6 01 5D 07 00 E6 42 07 00 23 40 07 00 E6 47 07 00 34 40 01 40 07 00 E6 41 07 00 F2 41 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     155    163    Any
        //  155    163    155    163    Ljava/lang/StringIndexOutOfBoundsException;
        //  171    173    3      8      Ljava/lang/UnsupportedOperationException;
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  76     82     3      8      Ljava/lang/NegativeArraySizeException;
        //  76     82     3      8      Any
        //  75     82     75     76     Ljava/util/ConcurrentModificationException;
        //  131    140    140    141    Any
        //  132    140    3      8      Any
        //  131    140    3      8      Any
        //  131    140    3      8      Ljava/lang/NumberFormatException;
        //  131    140    131    132    Ljava/lang/ArithmeticException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 47 out of bounds for length 47
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    
    public void c(final List p0, final EntityPlayer p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          357
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            349
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            341
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //    27: aload_0        
        //    28: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //    31: getstatic       dev/nuker/pyro/fc.c:I
        //    34: ifge            43
        //    37: ldc_w           1161792720
        //    40: goto            46
        //    43: ldc_w           -1142227740
        //    46: ldc_w           489156136
        //    49: ixor           
        //    50: lookupswitch {
        //          568615318: 43
        //          1477993208: 330
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //    83: goto            87
        //    86: athrow         
        //    87: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    90: getstatic       dev/nuker/pyro/fc.c:I
        //    93: ifge            102
        //    96: ldc_w           1116453284
        //    99: goto            105
        //   102: ldc_w           1965963537
        //   105: ldc_w           1751236931
        //   108: ixor           
        //   109: lookupswitch {
        //          720009447: 328
        //          1868285571: 102
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   147: goto            151
        //   150: athrow         
        //   151: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   154: aload_0        
        //   155: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   158: goto            162
        //   161: athrow         
        //   162: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   165: goto            169
        //   168: athrow         
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            181
        //   175: ldc_w           100907480
        //   178: goto            184
        //   181: ldc_w           1957968819
        //   184: ldc_w           1572873306
        //   187: ixor           
        //   188: lookupswitch {
        //          -2004424570: 181
        //          1539546498: 324
        //          default: 216
        //        }
        //   216: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   219: goto            223
        //   222: athrow         
        //   223: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78547_a:(DDD)V
        //   228: goto            232
        //   231: athrow         
        //   232: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //   235: aload_2        
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   243: goto            247
        //   246: athrow         
        //   247: goto            251
        //   250: athrow         
        //   251: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78546_a:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //   256: goto            260
        //   259: athrow         
        //   260: ifeq            323
        //   263: aload_1        
        //   264: getstatic       dev/nuker/pyro/fc.1:I
        //   267: ifeq            276
        //   270: ldc_w           -1174685601
        //   273: goto            279
        //   276: ldc_w           -1548470449
        //   279: ldc_w           53890256
        //   282: ixor           
        //   283: lookupswitch {
        //          -1160907633: 326
        //          1769393475: 276
        //          default: 308
        //        }
        //   308: aload_2        
        //   309: goto            313
        //   312: athrow         
        //   313: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   318: goto            322
        //   321: athrow         
        //   322: pop            
        //   323: return         
        //   324: aconst_null    
        //   325: athrow         
        //   326: aconst_null    
        //   327: athrow         
        //   328: aconst_null    
        //   329: athrow         
        //   330: aconst_null    
        //   331: athrow         
        //   332: pop            
        //   333: goto            24
        //   336: pop            
        //   337: aconst_null    
        //   338: goto            332
        //   341: dup            
        //   342: ifnull          332
        //   345: checkcast       Ljava/lang/Throwable;
        //   348: athrow         
        //   349: dup            
        //   350: ifnull          336
        //   353: checkcast       Ljava/lang/Throwable;
        //   356: athrow         
        //   357: aconst_null    
        //   358: athrow         
        //    StackMapTable: 00 36 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FE 00 03 07 00 03 07 01 F1 07 00 36 FF 00 12 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 C8 FF 00 02 00 03 07 00 03 07 01 F1 07 00 36 00 03 07 01 E0 07 01 C8 01 FF 00 1D 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 C8 42 07 00 29 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 C8 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 CE FF 00 0E 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 03 FF 00 02 00 03 07 00 03 07 01 F1 07 00 36 00 03 07 01 E0 03 01 FF 00 1E 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 03 46 07 00 29 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 03 07 01 E0 03 07 01 C8 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 03 07 01 E0 03 07 01 CE 49 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 07 01 C8 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 07 01 CE FF 00 0B 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 07 01 CE FF 00 02 00 03 07 00 03 07 01 F1 07 00 36 00 05 07 01 E0 03 03 07 01 CE 01 FF 00 1F 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 07 01 CE FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 03 47 07 00 34 00 46 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 00 36 45 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 F6 42 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 F6 47 07 00 34 40 01 4F 07 01 F1 FF 00 02 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 F1 01 5C 07 01 F1 43 07 00 34 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 F1 07 00 36 47 07 00 34 40 01 00 FF 00 00 00 03 07 00 03 07 01 F1 07 00 36 00 04 07 01 E0 03 03 07 01 CE 41 07 01 F1 FF 00 01 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 03 FF 00 01 00 03 07 00 03 07 01 F1 07 00 36 00 02 07 01 E0 07 01 C8 41 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     341    349    Any
        //  341    349    341    349    Any
        //  357    359    3      8      Ljava/util/ConcurrentModificationException;
        //  79     86     86     87     Any
        //  80     86     3      8      Ljava/lang/IllegalArgumentException;
        //  80     86     79     80     Ljava/lang/EnumConstantNotPresentException;
        //  79     86     3      8      Any
        //  79     86     3      8      Any
        //  143    150    150    151    Any
        //  143    150    3      8      Ljava/util/ConcurrentModificationException;
        //  143    150    150    151    Ljava/lang/IllegalStateException;
        //  144    150    3      8      Ljava/lang/ClassCastException;
        //  144    150    143    144    Ljava/lang/EnumConstantNotPresentException;
        //  161    168    168    169    Any
        //  161    168    3      8      Any
        //  162    168    3      8      Any
        //  162    168    161    162    Ljava/lang/NullPointerException;
        //  161    168    161    162    Any
        //  223    231    231    232    Any
        //  223    231    3      8      Ljava/lang/AssertionError;
        //  223    231    3      8      Any
        //  223    231    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  223    231    3      8      Ljava/lang/RuntimeException;
        //  239    246    246    247    Any
        //  240    246    3      8      Any
        //  239    246    239    240    Any
        //  239    246    246    247    Ljava/lang/NegativeArraySizeException;
        //  239    246    3      8      Any
        //  250    259    259    260    Any
        //  251    259    259    260    Any
        //  250    259    250    251    Any
        //  250    259    259    260    Ljava/lang/IndexOutOfBoundsException;
        //  250    259    259    260    Any
        //  312    321    321    322    Any
        //  313    321    321    322    Ljava/lang/NumberFormatException;
        //  313    321    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  312    321    312    313    Any
        //  312    321    3      8      Ljava/lang/IllegalStateException;
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
    
    public f9U() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2260\u1492\u8b72\ub3dc\uc931\uec69\ub223\ue741"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2240\u1492\u8b72\ub3dc\uc911\uec69\ub223\ue741"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u225c\u1496\u8b71\ub3dd\uc920\uec7a\ub237\ue712\ud966\ue957\ua6a5\u1e49\ue062\uc5a6\u81d6\u88e0\u57e4\u7684\ubd35\uc0e5\u2a8b\uc232\u6b91\u2d51\ud774\u340e\u7d33\u8828\u8003\u8c70\u856e\ufb3b\u714e\u9a10\u1b6c\uf0fb\u4971\u89f2\uca92\uffc8\ub759\u41fd\ub826\ub347\u4c9d\u8b3b\u7c7d\ucfb8\u7d5e\uea64\ue759\u16de\uef84\u378f\u4642\ue07d\u0a03\u874b\u19d0\u0fb6\u76d3\u729d\uc674\ubbbb\u9a22\u6b9e\ue2f4\ud1e1\ua53e\u256b\u8830\u4fa4\u8ae2\u140c"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: getstatic       dev/nuker/pyro/fc.0:I
        //    22: ifeq            31
        //    25: ldc_w           1224168749
        //    28: goto            34
        //    31: ldc_w           -920650101
        //    34: ldc_w           1915498742
        //    37: ixor           
        //    38: lookupswitch {
        //          -1154232707: 64
        //          987456987: 31
        //          default: 707
        //        }
        //    64: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    67: aload_0        
        //    68: new             Ldev/nuker/pyro/f0d;
        //    71: dup            
        //    72: ldc_w           "\u227d\u1490\u8b7e\ub3d5\uc92c\uec66\ub223"
        //    75: invokestatic    invokestatic   !!! ERROR
        //    78: ldc_w           "\u225d\u1490\u8b7e\ub3d5\uc92c\uec66\ub223"
        //    81: getstatic       dev/nuker/pyro/fc.c:I
        //    84: ifge            93
        //    87: ldc_w           76240760
        //    90: goto            96
        //    93: ldc_w           1677601938
        //    96: ldc_w           1761116488
        //    99: ixor           
        //   100: lookupswitch {
        //          1255033718: 93
        //          1819530800: 725
        //          default: 128
        //        }
        //   128: invokestatic    invokestatic   !!! ERROR
        //   131: ldc_w           "\u224f\u149f\u8b73\ub3d6\uc932\uec7b\ub264\ue74b\ud967\ue943\ua6e8\u1e58\ue079\uc5e7\u81c2\u88f0\u57a5\u769b\ubd38\uc0aa\u2a88\uc233\u6b9a\u2d16\ud727\u3402\u7d31\u8839\u8051\u8c7e\u8528\ufb72\u7154\u9a1e\u1b66\uf0a9\u4972\u89f2\uca8b\uffc4\ub742\u41f2\ub861\ub35b"
        //   134: invokestatic    invokestatic   !!! ERROR
        //   137: ldc2_w          3.0
        //   140: dconst_1       
        //   141: ldc2_w          10.0
        //   144: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   147: putfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0d;
        //   150: aload_0        
        //   151: getstatic       dev/nuker/pyro/fc.0:I
        //   154: ifeq            163
        //   157: ldc_w           -1424269805
        //   160: goto            166
        //   163: ldc_w           -764912529
        //   166: ldc_w           1883854895
        //   169: ixor           
        //   170: lookupswitch {
        //          -1574894528: 196
        //          -615381444: 163
        //          default: 705
        //        }
        //   196: aload_0        
        //   197: new             Ldev/nuker/pyro/f0f;
        //   200: dup            
        //   201: ldc_w           "\u2267\u149d\u8b79\ub3d6\uc908\uec67\ub220\ue757"
        //   204: invokestatic    invokestatic   !!! ERROR
        //   207: ldc_w           "\u2247\u149d\u8b79\ub3d6\uc965\uec45\ub22b\ue756\ud96d"
        //   210: getstatic       dev/nuker/pyro/fc.1:I
        //   213: ifeq            222
        //   216: ldc_w           499575853
        //   219: goto            225
        //   222: ldc_w           -817166987
        //   225: ldc_w           -383630494
        //   228: ixor           
        //   229: lookupswitch {
        //          -186339505: 713
        //          1835329444: 222
        //          default: 256
        //        }
        //   256: invokestatic    invokestatic   !!! ERROR
        //   259: ldc_w           "\u2259\u149b\u8b7a\ub3cb\uc920\uec28\ub22c\ue757\ud969\ue95a\ua6bc\u1e44\ue036\uc5a6\u81df\u88f7\u57e4\u7687\ubd34\uc0e4\u2a9b\uc27b\u6b9e\u2d44\ud731\u344b\u7d38\u8834\u801e\u8c66\u8520"
        //   262: getstatic       dev/nuker/pyro/fc.c:I
        //   265: ifge            274
        //   268: ldc_w           313089256
        //   271: goto            277
        //   274: ldc_w           531627980
        //   277: ldc_w           -1184747550
        //   280: ixor           
        //   281: lookupswitch {
        //          -1496461266: 308
        //          -1412730102: 274
        //          default: 721
        //        }
        //   308: invokestatic    invokestatic   !!! ERROR
        //   311: getstatic       dev/nuker/pyro/f9T.0:Ldev/nuker/pyro/f9T;
        //   314: getstatic       dev/nuker/pyro/fc.1:I
        //   317: ifeq            326
        //   320: ldc_w           726494550
        //   323: goto            329
        //   326: ldc_w           -651990641
        //   329: ldc_w           468341557
        //   332: ixor           
        //   333: lookupswitch {
        //          -1026999622: 360
        //          816266851: 326
        //          default: 723
        //        }
        //   360: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   363: getstatic       dev/nuker/pyro/fc.c:I
        //   366: ifge            375
        //   369: ldc_w           1295744826
        //   372: goto            378
        //   375: ldc_w           847471459
        //   378: ldc_w           1152453392
        //   381: ixor           
        //   382: lookupswitch {
        //          160068650: 719
        //          907611159: 375
        //          default: 408
        //        }
        //   408: invokevirtual   dev/nuker/pyro/f9U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   411: checkcast       Ldev/nuker/pyro/f0f;
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            426
        //   420: ldc_w           1237907163
        //   423: goto            429
        //   426: ldc_w           817441050
        //   429: ldc_w           -1154747769
        //   432: ixor           
        //   433: lookupswitch {
        //          -1953309795: 460
        //          -220003236: 426
        //          default: 727
        //        }
        //   460: putfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0f;
        //   463: getstatic       dev/nuker/pyro/fc.0:I
        //   466: ifeq            475
        //   469: ldc_w           861444691
        //   472: goto            478
        //   475: ldc_w           -804550111
        //   478: ldc_w           1173148515
        //   481: ixor           
        //   482: lookupswitch {
        //          -199868118: 475
        //          1991526704: 709
        //          default: 508
        //        }
        //   508: aload_0        
        //   509: aload_0        
        //   510: new             Ldev/nuker/pyro/f0f;
        //   513: dup            
        //   514: ldc_w           "\u226b\u149d\u8b7c\ub3d1\uc924\uec66\ub230\ue77f\ud967\ue952\ua6ad"
        //   517: invokestatic    invokestatic   !!! ERROR
        //   520: ldc_w           "\u224b\u149d\u8b7c\ub3d1\uc924\uec66\ub230\ue712\ud945\ue959\ua6ac\u1e49"
        //   523: invokestatic    invokestatic   !!! ERROR
        //   526: ldc_w           "\u2246\u149c\u8b68\ub399\uc920\uec66\ub227\ue75a\ud969\ue958\ua6bc\u1e5f\ue039\uc5ae\u81c5\u88f6\u57a9\u7684\ubd7d\uc0f8\u2a99\uc235\u6b9b\u2d53\ud726"
        //   529: getstatic       dev/nuker/pyro/fc.c:I
        //   532: ifge            541
        //   535: ldc_w           -34540026
        //   538: goto            544
        //   541: ldc_w           2025031650
        //   544: ldc_w           -2123592176
        //   547: ixor           
        //   548: lookupswitch {
        //          -529984713: 541
        //          2090629142: 715
        //          default: 576
        //        }
        //   576: invokestatic    invokestatic   !!! ERROR
        //   579: getstatic       dev/nuker/pyro/f9S.c:Ldev/nuker/pyro/f9S;
        //   582: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   585: invokevirtual   dev/nuker/pyro/f9U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   588: checkcast       Ldev/nuker/pyro/f0f;
        //   591: putfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //   594: getstatic       dev/nuker/pyro/fc.0:I
        //   597: ifeq            606
        //   600: ldc_w           1372118530
        //   603: goto            609
        //   606: ldc_w           -1604728617
        //   609: ldc_w           1468416760
        //   612: ixor           
        //   613: lookupswitch {
        //          -136345041: 640
        //          105815290: 606
        //          default: 717
        //        }
        //   640: aload_0        
        //   641: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   644: dup            
        //   645: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   648: getstatic       dev/nuker/pyro/fc.1:I
        //   651: ifeq            660
        //   654: ldc_w           549964745
        //   657: goto            663
        //   660: ldc_w           739059606
        //   663: ldc_w           -229812515
        //   666: ixor           
        //   667: lookupswitch {
        //          -762667756: 660
        //          -566202037: 692
        //          default: 711
        //        }
        //   692: putfield        dev/nuker/pyro/f9U.c:Ljava/util/List;
        //   695: aload_0        
        //   696: aload_0        
        //   697: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0d;
        //   700: invokevirtual   dev/nuker/pyro/f9U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   703: pop            
        //   704: return         
        //   705: aconst_null    
        //   706: athrow         
        //   707: aconst_null    
        //   708: athrow         
        //   709: aconst_null    
        //   710: athrow         
        //   711: aconst_null    
        //   712: athrow         
        //   713: aconst_null    
        //   714: athrow         
        //   715: aconst_null    
        //   716: athrow         
        //   717: aconst_null    
        //   718: athrow         
        //   719: aconst_null    
        //   720: athrow         
        //   721: aconst_null    
        //   722: athrow         
        //   723: aconst_null    
        //   724: athrow         
        //   725: aconst_null    
        //   726: athrow         
        //   727: aconst_null    
        //   728: athrow         
        //    StackMapTable: 00 30 FF 00 1F 00 01 06 00 04 06 07 00 DB 07 00 DB 07 00 DB FF 00 02 00 01 06 00 05 06 07 00 DB 07 00 DB 07 00 DB 01 FF 00 1D 00 01 06 00 04 06 07 00 DB 07 00 DB 07 00 DB FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 44 08 00 44 07 00 DB 07 00 DB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 44 08 00 44 07 00 DB 07 00 DB 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 00 44 08 00 44 07 00 DB 07 00 DB 62 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 19 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB FF 00 11 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB FF 00 11 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB 07 00 AA FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB 07 00 AA 01 FF 00 1E 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB 07 00 AA FF 00 0E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 A5 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 A5 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 A5 FF 00 11 00 01 07 00 03 00 02 07 00 03 07 00 A5 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 A5 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 A5 0E 42 01 1D FF 00 20 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 00 DB 07 00 DB 07 00 DB FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 FE 08 01 FE 07 00 DB 07 00 DB 07 00 DB 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 00 DB 07 00 DB 07 00 DB 1D 42 01 1E FF 00 13 00 01 07 00 03 00 02 07 00 03 07 02 4E FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 4E 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 02 4E 4C 07 00 03 FF 00 01 00 01 06 00 04 06 07 00 DB 07 00 DB 07 00 DB FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 4E FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 00 DB 07 00 DB 07 00 DB 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 A5 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 C5 08 00 C5 07 00 DB 07 00 DB 07 00 DB 07 00 AA FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 44 08 00 44 07 00 DB 07 00 DB FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 A5
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
    
    public String c(final EntityPlayer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          234
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            226
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            218
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            40
        //    34: ldc_w           361057636
        //    37: goto            43
        //    40: ldc_w           626065914
        //    43: ldc_w           -1848447556
        //    46: ixor           
        //    47: lookupswitch {
        //          -2074631976: 40
        //          -1266422714: 72
        //          default: 207
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   java/lang/StringBuilder.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: ldc_w           ""
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: goto            97
        //    96: athrow         
        //    97: getstatic       dev/nuker/pyro/fc.1:I
        //   100: ifeq            109
        //   103: ldc_w           1782045461
        //   106: goto            112
        //   109: ldc_w           -1373897061
        //   112: ldc_w           397062294
        //   115: ixor           
        //   116: lookupswitch {
        //          -1179562483: 144
        //          2107468675: 109
        //          default: 205
        //        }
        //   144: aload_1        
        //   145: goto            149
        //   148: athrow         
        //   149: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //   152: goto            156
        //   155: athrow         
        //   156: aload_1        
        //   157: goto            161
        //   160: athrow         
        //   161: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110139_bj:()F
        //   164: goto            168
        //   167: athrow         
        //   168: fadd           
        //   169: f2d            
        //   170: goto            174
        //   173: athrow         
        //   174: invokestatic    java/lang/Math.floor:(D)D
        //   177: goto            181
        //   180: athrow         
        //   181: d2i            
        //   182: goto            186
        //   185: athrow         
        //   186: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   189: goto            193
        //   192: athrow         
        //   193: goto            197
        //   196: athrow         
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: goto            204
        //   203: athrow         
        //   204: areturn        
        //   205: aconst_null    
        //   206: athrow         
        //   207: aconst_null    
        //   208: athrow         
        //   209: pop            
        //   210: goto            24
        //   213: pop            
        //   214: aconst_null    
        //   215: goto            209
        //   218: dup            
        //   219: ifnull          209
        //   222: checkcast       Ljava/lang/Throwable;
        //   225: athrow         
        //   226: dup            
        //   227: ifnull          213
        //   230: checkcast       Ljava/lang/Throwable;
        //   233: athrow         
        //   234: aconst_null    
        //   235: athrow         
        //    StackMapTable: 00 2D 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FD 00 03 07 00 03 07 00 36 FF 00 0F 00 02 07 00 03 07 00 36 00 02 08 00 18 08 00 18 FF 00 02 00 02 07 00 03 07 00 36 00 03 08 00 18 08 00 18 01 FF 00 1C 00 02 07 00 03 07 00 36 00 02 08 00 18 08 00 18 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 02 08 00 18 08 00 18 45 07 00 34 40 07 00 70 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 02 07 00 03 07 00 36 00 02 07 00 70 01 5F 07 00 70 43 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 07 00 36 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 02 FF 00 03 00 00 00 01 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 03 07 00 70 02 07 00 36 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 03 07 00 70 02 02 44 07 00 1B FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 03 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 03 43 07 00 19 FF 00 00 00 02 07 00 03 07 00 36 00 02 07 00 70 01 45 07 00 34 40 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 40 07 00 70 FF 00 01 00 02 07 00 03 07 00 36 00 02 08 00 18 08 00 18 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     218    226    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  218    226    218    226    Ljava/util/ConcurrentModificationException;
        //  234    236    3      8      Ljava/lang/AssertionError;
        //  76     82     82     83     Any
        //  76     82     3      8      Ljava/lang/ClassCastException;
        //  76     82     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  76     82     3      8      Ljava/lang/NumberFormatException;
        //  76     82     82     83     Any
        //  89     96     96     97     Any
        //  89     96     96     97     Ljava/lang/AssertionError;
        //  90     96     89     90     Any
        //  90     96     89     90     Any
        //  89     96     96     97     Ljava/lang/IndexOutOfBoundsException;
        //  148    155    155    156    Any
        //  148    155    148    149    Ljava/util/ConcurrentModificationException;
        //  148    155    148    149    Any
        //  149    155    155    156    Any
        //  148    155    155    156    Ljava/lang/IllegalStateException;
        //  161    167    167    168    Any
        //  161    167    167    168    Ljava/lang/ClassCastException;
        //  161    167    167    168    Any
        //  161    167    167    168    Ljava/lang/ArithmeticException;
        //  161    167    3      8      Any
        //  173    180    180    181    Any
        //  174    180    3      8      Ljava/lang/AssertionError;
        //  173    180    3      8      Any
        //  173    180    173    174    Ljava/lang/AssertionError;
        //  174    180    3      8      Ljava/lang/AssertionError;
        //  185    192    192    193    Any
        //  185    192    3      8      Ljava/lang/ArithmeticException;
        //  186    192    192    193    Ljava/lang/NullPointerException;
        //  185    192    185    186    Ljava/lang/RuntimeException;
        //  185    192    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  196    203    203    204    Any
        //  196    203    3      8      Ljava/lang/NegativeArraySizeException;
        //  196    203    196    197    Any
        //  196    203    203    204    Any
        //  197    203    196    197    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:617)
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
    @LauncherEventHide
    public void c(final f3t f3t) {
        fbS.1r(this, 173195955, f3t);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          777
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            769
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            761
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           1079984021
        //    33: goto            39
        //    36: ldc_w           92978162
        //    39: ldc_w           -1183385243
        //    42: ixor           
        //    43: lookupswitch {
        //          -1124318569: 68
        //          -114702608: 36
        //          default: 734
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f9U.c:Ljava/util/List;
        //    72: goto            76
        //    75: athrow         
        //    76: invokeinterface java/util/List.clear:()V
        //    81: goto            85
        //    84: athrow         
        //    85: new             Ljava/util/ArrayList;
        //    88: dup            
        //    89: getstatic       dev/nuker/pyro/fc.0:I
        //    92: ifeq            101
        //    95: ldc_w           1908757738
        //    98: goto            104
        //   101: ldc_w           1816718877
        //   104: ldc_w           -884318455
        //   107: ixor           
        //   108: lookupswitch {
        //          -1165030429: 746
        //          -49511338: 101
        //          default: 136
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokespecial   java/util/ArrayList.<init>:()V
        //   143: goto            147
        //   146: athrow         
        //   147: getstatic       dev/nuker/pyro/fc.0:I
        //   150: ifeq            159
        //   153: ldc_w           468111910
        //   156: goto            162
        //   159: ldc_w           881318456
        //   162: ldc_w           1800229303
        //   165: ixor           
        //   166: lookupswitch {
        //          1607109519: 192
        //          1890288529: 159
        //          default: 738
        //        }
        //   192: astore_2       
        //   193: aload_0        
        //   194: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   197: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   200: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //   203: goto            207
        //   206: athrow         
        //   207: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   212: goto            216
        //   215: athrow         
        //   216: getstatic       dev/nuker/pyro/fc.c:I
        //   219: ifge            228
        //   222: ldc_w           475599748
        //   225: goto            231
        //   228: ldc_w           1426492250
        //   231: ldc_w           -934170947
        //   234: ixor           
        //   235: lookupswitch {
        //          -737624775: 748
        //          -609600007: 228
        //          default: 260
        //        }
        //   260: aload_0        
        //   261: invokedynamic   BootstrapMethod #0, test:(Ldev/nuker/pyro/f9U;)Ljava/util/function/Predicate;
        //   266: goto            270
        //   269: athrow         
        //   270: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   275: goto            279
        //   278: athrow         
        //   279: aload_0        
        //   280: aload_2        
        //   281: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f9U;Ljava/util/List;)Ljava/util/function/Consumer;
        //   286: getstatic       dev/nuker/pyro/fc.0:I
        //   289: ifeq            298
        //   292: ldc_w           1978908234
        //   295: goto            301
        //   298: ldc_w           829412627
        //   301: ldc_w           -1609197722
        //   304: ixor           
        //   305: lookupswitch {
        //          -706336468: 736
        //          1519246914: 298
        //          default: 332
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokeinterface java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        //   341: goto            345
        //   344: athrow         
        //   345: getstatic       dev/nuker/pyro/fc.1:I
        //   348: ifeq            357
        //   351: ldc_w           -496841392
        //   354: goto            360
        //   357: ldc_w           426205131
        //   360: ldc_w           -1297977890
        //   363: ixor           
        //   364: lookupswitch {
        //          -1413139947: 392
        //          1354801294: 357
        //          default: 744
        //        }
        //   392: aload_2        
        //   393: getstatic       dev/nuker/pyro/fc.1:I
        //   396: ifeq            405
        //   399: ldc_w           -1326137493
        //   402: goto            408
        //   405: ldc_w           484530656
        //   408: ldc_w           853765814
        //   411: ixor           
        //   412: lookupswitch {
        //          -2112368163: 405
        //          771897174: 440
        //          default: 750
        //        }
        //   440: aload_0        
        //   441: invokedynamic   BootstrapMethod #2, compare:(Ldev/nuker/pyro/f9U;)Ljava/util/Comparator;
        //   446: getstatic       dev/nuker/pyro/fc.0:I
        //   449: ifeq            458
        //   452: ldc_w           -1856640810
        //   455: goto            461
        //   458: ldc_w           -1730530453
        //   461: ldc_w           430614833
        //   464: ixor           
        //   465: lookupswitch {
        //          -2123326886: 492
        //          -1996537369: 458
        //          default: 732
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokeinterface java/util/List.sort:(Ljava/util/Comparator;)V
        //   501: goto            505
        //   504: athrow         
        //   505: getstatic       dev/nuker/pyro/fc.0:I
        //   508: ifeq            517
        //   511: ldc_w           -427269357
        //   514: goto            520
        //   517: ldc_w           -5751193
        //   520: ldc_w           -1223093683
        //   523: ixor           
        //   524: lookupswitch {
        //          1368486238: 740
        //          1993847182: 517
        //          default: 552
        //        }
        //   552: aload_2        
        //   553: goto            557
        //   556: athrow         
        //   557: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   562: goto            566
        //   565: athrow         
        //   566: astore_3       
        //   567: aload_3        
        //   568: goto            572
        //   571: athrow         
        //   572: invokeinterface java/util/Iterator.hasNext:()Z
        //   577: goto            581
        //   580: athrow         
        //   581: ifeq            590
        //   584: ldc_w           -54309537
        //   587: goto            593
        //   590: ldc_w           -54309568
        //   593: ldc_w           -635084144
        //   596: ixor           
        //   597: tableswitch {
        //          1305239454: 620
        //          1305239455: 731
        //          default: 584
        //        }
        //   620: aload_3        
        //   621: goto            625
        //   624: athrow         
        //   625: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   630: goto            634
        //   633: athrow         
        //   634: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   637: getstatic       dev/nuker/pyro/fc.c:I
        //   640: ifge            649
        //   643: ldc_w           105901735
        //   646: goto            652
        //   649: ldc_w           -1185394162
        //   652: ldc_w           -17374886
        //   655: ixor           
        //   656: lookupswitch {
        //          -2040445384: 649
        //          -122089475: 742
        //          default: 684
        //        }
        //   684: astore          4
        //   686: aload_0        
        //   687: getfield        dev/nuker/pyro/f9U.c:Ljava/util/List;
        //   690: aload           4
        //   692: goto            696
        //   695: athrow         
        //   696: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_145782_y:()I
        //   699: goto            703
        //   702: athrow         
        //   703: goto            707
        //   706: athrow         
        //   707: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   710: goto            714
        //   713: athrow         
        //   714: goto            718
        //   717: athrow         
        //   718: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   723: goto            727
        //   726: athrow         
        //   727: pop            
        //   728: goto            567
        //   731: return         
        //   732: aconst_null    
        //   733: athrow         
        //   734: aconst_null    
        //   735: athrow         
        //   736: aconst_null    
        //   737: athrow         
        //   738: aconst_null    
        //   739: athrow         
        //   740: aconst_null    
        //   741: athrow         
        //   742: aconst_null    
        //   743: athrow         
        //   744: aconst_null    
        //   745: athrow         
        //   746: aconst_null    
        //   747: athrow         
        //   748: aconst_null    
        //   749: athrow         
        //   750: aconst_null    
        //   751: athrow         
        //   752: pop            
        //   753: goto            24
        //   756: pop            
        //   757: aconst_null    
        //   758: goto            752
        //   761: dup            
        //   762: ifnull          752
        //   765: checkcast       Ljava/lang/Throwable;
        //   768: athrow         
        //   769: dup            
        //   770: ifnull          756
        //   773: checkcast       Ljava/lang/Throwable;
        //   776: athrow         
        //   777: aconst_null    
        //   778: athrow         
        //    StackMapTable: 00 67 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FD 00 03 07 00 03 07 02 E0 0B 42 01 1C 46 07 00 34 40 07 01 F1 47 07 00 34 00 FF 00 0F 00 02 07 00 03 07 02 E0 00 02 08 00 55 08 00 55 FF 00 02 00 02 07 00 03 07 02 E0 00 03 08 00 55 08 00 55 01 FF 00 1F 00 02 07 00 03 07 02 E0 00 02 08 00 55 08 00 55 42 07 00 34 FF 00 00 00 02 07 00 03 07 02 E0 00 02 08 00 55 08 00 55 45 07 00 34 40 07 02 7A 4B 07 02 7A FF 00 02 00 02 07 00 03 07 02 E0 00 02 07 02 7A 01 5D 07 02 7A FF 00 0D 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 02 E0 07 02 7A 00 01 07 01 F1 47 07 00 34 40 07 02 A3 4B 07 02 A3 FF 00 02 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 01 5C 07 02 A3 48 07 00 34 FF 00 00 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 07 02 E2 47 07 00 34 40 07 02 A3 FF 00 12 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 07 02 E4 FF 00 02 00 03 07 00 03 07 02 E0 07 02 7A 00 03 07 02 A3 07 02 E4 01 FF 00 1E 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 07 02 E4 42 07 00 34 FF 00 00 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 07 02 E4 47 07 00 34 00 0B 42 01 1F 4C 07 02 7A FF 00 02 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 7A 01 5F 07 02 7A FF 00 11 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 7A 07 02 E6 FF 00 02 00 03 07 00 03 07 02 E0 07 02 7A 00 03 07 02 7A 07 02 E6 01 FF 00 1E 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 7A 07 02 E6 42 07 00 34 FF 00 00 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 7A 07 02 E6 47 07 00 34 00 0B 42 01 1F 43 07 00 34 40 07 02 7A 47 07 00 34 40 07 01 11 FC 00 00 07 01 11 FF 00 03 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 02 E0 07 02 7A 07 01 11 00 01 07 01 11 47 07 00 34 40 01 02 05 42 01 1A 43 07 00 34 40 07 01 11 47 07 00 34 40 07 00 DD 4E 07 00 36 FF 00 02 00 04 07 00 03 07 02 E0 07 02 7A 07 01 11 00 02 07 00 36 01 5F 07 00 36 FF 00 0A 00 00 00 01 07 00 34 FF 00 00 00 05 07 00 03 07 02 E0 07 02 7A 07 01 11 07 00 36 00 02 07 01 F1 07 00 36 45 07 00 34 FF 00 00 00 05 07 00 03 07 02 E0 07 02 7A 07 01 11 07 00 36 00 02 07 01 F1 01 42 07 00 34 FF 00 00 00 05 07 00 03 07 02 E0 07 02 7A 07 01 11 07 00 36 00 02 07 01 F1 01 45 07 00 34 FF 00 00 00 05 07 00 03 07 02 E0 07 02 7A 07 01 11 07 00 36 00 02 07 01 F1 07 00 EC 42 07 00 34 FF 00 00 00 05 07 00 03 07 02 E0 07 02 7A 07 01 11 07 00 36 00 02 07 01 F1 07 00 EC 47 07 00 34 40 01 FA 00 03 FF 00 00 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 7A 07 02 E6 FA 00 01 FF 00 01 00 03 07 00 03 07 02 E0 07 02 7A 00 02 07 02 A3 07 02 E4 FF 00 01 00 02 07 00 03 07 02 E0 00 01 07 02 7A FC 00 01 07 02 7A FF 00 01 00 04 07 00 03 07 02 E0 07 02 7A 07 01 11 00 01 07 00 36 FA 00 01 FF 00 01 00 02 07 00 03 07 02 E0 00 02 08 00 55 08 00 55 FF 00 01 00 03 07 00 03 07 02 E0 07 02 7A 00 01 07 02 A3 41 07 02 7A FF 00 01 00 02 07 00 03 07 02 E0 00 01 07 00 19 43 05 44 07 00 19 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     761    769    Ljava/lang/NumberFormatException;
        //  761    769    761    769    Ljava/lang/UnsupportedOperationException;
        //  777    779    3      8      Any
        //  75     84     84     85     Any
        //  76     84     3      8      Any
        //  76     84     3      8      Any
        //  76     84     75     76     Any
        //  75     84     75     76     Any
        //  139    146    146    147    Any
        //  139    146    139    140    Any
        //  139    146    146    147    Any
        //  139    146    3      8      Ljava/util/ConcurrentModificationException;
        //  140    146    139    140    Any
        //  207    215    215    216    Any
        //  207    215    3      8      Any
        //  207    215    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  207    215    3      8      Ljava/lang/NullPointerException;
        //  207    215    215    216    Ljava/lang/StringIndexOutOfBoundsException;
        //  269    278    278    279    Any
        //  269    278    269    270    Ljava/lang/RuntimeException;
        //  269    278    3      8      Any
        //  270    278    3      8      Any
        //  269    278    269    270    Any
        //  335    344    344    345    Any
        //  335    344    3      8      Any
        //  335    344    3      8      Any
        //  336    344    3      8      Any
        //  335    344    335    336    Any
        //  495    504    504    505    Any
        //  496    504    504    505    Ljava/lang/ArithmeticException;
        //  495    504    3      8      Ljava/lang/RuntimeException;
        //  496    504    504    505    Any
        //  496    504    495    496    Any
        //  556    565    565    566    Any
        //  557    565    3      8      Any
        //  557    565    556    557    Any
        //  556    565    3      8      Ljava/lang/UnsupportedOperationException;
        //  557    565    3      8      Any
        //  572    580    580    581    Any
        //  572    580    580    581    Ljava/lang/NullPointerException;
        //  572    580    580    581    Ljava/lang/NullPointerException;
        //  572    580    580    581    Ljava/lang/RuntimeException;
        //  572    580    3      8      Any
        //  624    633    633    634    Any
        //  624    633    633    634    Ljava/util/NoSuchElementException;
        //  625    633    624    625    Any
        //  625    633    633    634    Any
        //  624    633    3      8      Any
        //  696    702    702    703    Any
        //  696    702    702    703    Any
        //  696    702    702    703    Ljava/util/NoSuchElementException;
        //  696    702    702    703    Any
        //  696    702    3      8      Any
        //  706    713    713    714    Any
        //  706    713    713    714    Ljava/lang/NullPointerException;
        //  707    713    706    707    Ljava/lang/IllegalStateException;
        //  707    713    706    707    Ljava/lang/AssertionError;
        //  707    713    706    707    Any
        //  717    726    726    727    Any
        //  717    726    3      8      Any
        //  718    726    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  717    726    717    718    Any
        //  717    726    726    727    Any
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
    
    public String 2(final EntityPlayer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1025
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1017
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1009
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc_w           ""
        //    27: astore_2       
        //    28: iconst_m1      
        //    29: istore_3       
        //    30: aload_0        
        //    31: getstatic       dev/nuker/pyro/fc.0:I
        //    34: ifeq            43
        //    37: ldc_w           -251542503
        //    40: goto            46
        //    43: ldc_w           -1369690857
        //    46: ldc_w           -1764773147
        //    49: ixor           
        //    50: lookupswitch {
        //          -1616117003: 43
        //          1741584124: 996
        //          default: 76
        //        }
        //    76: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //    79: goto            83
        //    82: athrow         
        //    83: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    86: goto            90
        //    89: athrow         
        //    90: aload_1        
        //    91: goto            95
        //    94: athrow         
        //    95: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110124_au:()Ljava/util/UUID;
        //    98: goto            102
        //   101: athrow         
        //   102: goto            106
        //   105: athrow         
        //   106: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_175102_a:(Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   109: goto            113
        //   112: athrow         
        //   113: goto            117
        //   116: athrow         
        //   117: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178853_c:()I
        //   120: goto            124
        //   123: athrow         
        //   124: istore_3       
        //   125: goto            130
        //   128: astore          4
        //   130: iload_3        
        //   131: sipush          200
        //   134: if_icmple       329
        //   137: new             Ljava/lang/StringBuilder;
        //   140: dup            
        //   141: getstatic       dev/nuker/pyro/fc.c:I
        //   144: ifge            153
        //   147: ldc_w           -2085285907
        //   150: goto            156
        //   153: ldc_w           304690834
        //   156: ldc_w           -726944275
        //   159: ixor           
        //   160: lookupswitch {
        //          -964525185: 188
        //          1461631488: 153
        //          default: 976
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokespecial   java/lang/StringBuilder.<init>:()V
        //   195: goto            199
        //   198: athrow         
        //   199: aload_2        
        //   200: getstatic       dev/nuker/pyro/fc.0:I
        //   203: ifeq            212
        //   206: ldc_w           -845187504
        //   209: goto            215
        //   212: ldc_w           -571082817
        //   215: ldc_w           438875680
        //   218: ixor           
        //   219: lookupswitch {
        //          -1611899207: 212
        //          -675823504: 988
        //          default: 244
        //        }
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: goto            255
        //   254: athrow         
        //   255: getstatic       dev/nuker/pyro/fc.c:I
        //   258: ifge            267
        //   261: ldc_w           -484598522
        //   264: goto            270
        //   267: ldc_w           1242037933
        //   270: ldc_w           9283770
        //   273: ixor           
        //   274: lookupswitch {
        //          -1948055267: 267
        //          -477088324: 998
        //          default: 300
        //        }
        //   300: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   303: goto            307
        //   306: athrow         
        //   307: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   310: goto            314
        //   313: athrow         
        //   314: goto            318
        //   317: athrow         
        //   318: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   321: goto            325
        //   324: athrow         
        //   325: astore_2       
        //   326: goto            809
        //   329: iload_3        
        //   330: sipush          200
        //   333: if_icmpgt       342
        //   336: ldc_w           1661892439
        //   339: goto            345
        //   342: ldc_w           1661892440
        //   345: ldc_w           -590306944
        //   348: ixor           
        //   349: tableswitch {
        //          2143137198: 372
        //          2143137199: 570
        //          default: 336
        //        }
        //   372: iload_3        
        //   373: bipush          100
        //   375: if_icmplt       570
        //   378: new             Ljava/lang/StringBuilder;
        //   381: dup            
        //   382: goto            386
        //   385: athrow         
        //   386: invokespecial   java/lang/StringBuilder.<init>:()V
        //   389: goto            393
        //   392: athrow         
        //   393: aload_2        
        //   394: getstatic       dev/nuker/pyro/fc.0:I
        //   397: ifeq            406
        //   400: ldc_w           660508712
        //   403: goto            409
        //   406: ldc_w           1296011806
        //   409: ldc_w           -1583559728
        //   412: ixor           
        //   413: lookupswitch {
        //          -2034082824: 982
        //          -1494069148: 406
        //          default: 440
        //        }
        //   440: goto            444
        //   443: athrow         
        //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   447: goto            451
        //   450: athrow         
        //   451: getstatic       dev/nuker/pyro/fc.c:I
        //   454: ifge            463
        //   457: ldc_w           58014773
        //   460: goto            466
        //   463: ldc_w           400264320
        //   466: ldc_w           47535630
        //   469: ixor           
        //   470: lookupswitch {
        //          27290171: 463
        //          353294990: 496
        //          default: 974
        //        }
        //   496: getstatic       com/mojang/realmsclient/gui/ChatFormatting.YELLOW:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   499: getstatic       dev/nuker/pyro/fc.0:I
        //   502: ifeq            511
        //   505: ldc_w           -233844968
        //   508: goto            514
        //   511: ldc_w           -155519708
        //   514: ldc_w           957315986
        //   517: ixor           
        //   518: lookupswitch {
        //          -1630000305: 511
        //          -889146230: 994
        //          default: 544
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   551: goto            555
        //   554: athrow         
        //   555: goto            559
        //   558: athrow         
        //   559: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   562: goto            566
        //   565: athrow         
        //   566: astore_2       
        //   567: goto            809
        //   570: iload_3        
        //   571: bipush          100
        //   573: if_icmpge       809
        //   576: new             Ljava/lang/StringBuilder;
        //   579: dup            
        //   580: getstatic       dev/nuker/pyro/fc.0:I
        //   583: ifeq            592
        //   586: ldc_w           -1262627746
        //   589: goto            595
        //   592: ldc_w           59257037
        //   595: ldc_w           1016202203
        //   598: ixor           
        //   599: lookupswitch {
        //          -2010130555: 984
        //          1442844722: 592
        //          default: 624
        //        }
        //   624: goto            628
        //   627: athrow         
        //   628: invokespecial   java/lang/StringBuilder.<init>:()V
        //   631: goto            635
        //   634: athrow         
        //   635: aload_2        
        //   636: getstatic       dev/nuker/pyro/fc.0:I
        //   639: ifeq            648
        //   642: ldc_w           276513836
        //   645: goto            651
        //   648: ldc_w           2066408553
        //   651: ldc_w           -50697814
        //   654: ixor           
        //   655: lookupswitch {
        //          -327078522: 990
        //          766854083: 648
        //          default: 680
        //        }
        //   680: goto            684
        //   683: athrow         
        //   684: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   687: goto            691
        //   690: athrow         
        //   691: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GREEN:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   694: goto            698
        //   697: athrow         
        //   698: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   701: goto            705
        //   704: athrow         
        //   705: getstatic       dev/nuker/pyro/fc.0:I
        //   708: ifeq            717
        //   711: ldc_w           -2091886942
        //   714: goto            720
        //   717: ldc_w           -241069425
        //   720: ldc_w           -540621737
        //   723: ixor           
        //   724: lookupswitch {
        //          1553371893: 978
        //          1696450766: 717
        //          default: 752
        //        }
        //   752: goto            756
        //   755: athrow         
        //   756: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   759: goto            763
        //   762: athrow         
        //   763: getstatic       dev/nuker/pyro/fc.0:I
        //   766: ifeq            775
        //   769: ldc_w           -1171981754
        //   772: goto            778
        //   775: ldc_w           -1855930438
        //   778: ldc_w           943660443
        //   781: ixor           
        //   782: lookupswitch {
        //          -2112100387: 986
        //          216844444: 775
        //          default: 808
        //        }
        //   808: astore_2       
        //   809: new             Ljava/lang/StringBuilder;
        //   812: dup            
        //   813: goto            817
        //   816: athrow         
        //   817: invokespecial   java/lang/StringBuilder.<init>:()V
        //   820: goto            824
        //   823: athrow         
        //   824: aload_2        
        //   825: goto            829
        //   828: athrow         
        //   829: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   832: goto            836
        //   835: athrow         
        //   836: getstatic       dev/nuker/pyro/fc.0:I
        //   839: ifeq            848
        //   842: ldc_w           764921616
        //   845: goto            851
        //   848: ldc_w           -1124021020
        //   851: ldc_w           -1771230950
        //   854: ixor           
        //   855: lookupswitch {
        //          -1141182966: 992
        //          -683315723: 848
        //          default: 880
        //        }
        //   880: iload_3        
        //   881: goto            885
        //   884: athrow         
        //   885: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   888: goto            892
        //   891: athrow         
        //   892: ldc_w           "\u2263\u1480"
        //   895: getstatic       dev/nuker/pyro/fc.0:I
        //   898: ifeq            907
        //   901: ldc_w           1310811270
        //   904: goto            910
        //   907: ldc_w           -808288319
        //   910: ldc_w           -1303331495
        //   913: ixor           
        //   914: lookupswitch {
        //          -1006189053: 907
        //          -59647521: 980
        //          default: 940
        //        }
        //   940: goto            944
        //   943: athrow         
        //   944: invokestatic    invokestatic   !!! ERROR
        //   947: goto            951
        //   950: athrow         
        //   951: goto            955
        //   954: athrow         
        //   955: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   958: goto            962
        //   961: athrow         
        //   962: goto            966
        //   965: athrow         
        //   966: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   969: goto            973
        //   972: athrow         
        //   973: areturn        
        //   974: aconst_null    
        //   975: athrow         
        //   976: aconst_null    
        //   977: athrow         
        //   978: aconst_null    
        //   979: athrow         
        //   980: aconst_null    
        //   981: athrow         
        //   982: aconst_null    
        //   983: athrow         
        //   984: aconst_null    
        //   985: athrow         
        //   986: aconst_null    
        //   987: athrow         
        //   988: aconst_null    
        //   989: athrow         
        //   990: aconst_null    
        //   991: athrow         
        //   992: aconst_null    
        //   993: athrow         
        //   994: aconst_null    
        //   995: athrow         
        //   996: aconst_null    
        //   997: athrow         
        //   998: aconst_null    
        //   999: athrow         
        //  1000: pop            
        //  1001: goto            24
        //  1004: pop            
        //  1005: aconst_null    
        //  1006: goto            1000
        //  1009: dup            
        //  1010: ifnull          1000
        //  1013: checkcast       Ljava/lang/Throwable;
        //  1016: athrow         
        //  1017: dup            
        //  1018: ifnull          1004
        //  1021: checkcast       Ljava/lang/Throwable;
        //  1024: athrow         
        //  1025: aconst_null    
        //  1026: athrow         
        //    StackMapTable: 00 9E FF 00 03 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 34 F9 00 04 FF 00 0B 00 00 00 01 07 00 34 FD 00 03 07 00 03 07 00 36 FF 00 12 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 03 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 03 01 5D 07 00 03 45 07 00 34 40 07 01 C8 45 07 00 34 40 07 02 F3 43 07 00 29 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 02 F3 07 00 36 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 02 F3 07 03 2D 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 02 F3 07 03 2D 45 07 00 34 40 07 02 F9 42 07 00 34 40 07 02 F9 45 07 00 34 40 01 43 07 00 21 01 FF 00 16 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 00 89 08 00 89 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 08 00 89 08 00 89 01 FF 00 1F 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 00 89 08 00 89 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 00 89 08 00 89 45 07 00 34 40 07 00 70 FF 00 0C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 2B FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5D 07 00 70 45 07 00 21 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 70 45 07 00 34 40 07 00 DB 03 06 05 42 01 1A FF 00 0C 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 01 7A 08 01 7A 45 07 00 34 40 07 00 70 FF 00 0C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1E 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 0F FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5D 07 00 70 FF 00 0E 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 76 01 FF 00 1D 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 42 07 00 27 40 07 00 70 45 07 00 34 40 07 00 DB 03 FF 00 15 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 40 08 02 40 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 08 02 40 08 02 40 01 FF 00 1C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 40 08 02 40 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 40 08 02 40 45 07 00 34 40 07 00 70 FF 00 0C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1C 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5F 07 00 70 42 07 00 34 40 07 00 70 45 07 00 34 40 07 00 DB 4B 07 00 DB FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 DB 01 5D 07 00 DB 00 46 07 00 27 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 03 29 08 03 29 45 07 00 34 40 07 00 70 FF 00 03 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 5C 07 00 70 43 07 00 23 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 01 45 07 00 34 40 07 00 70 FF 00 0E 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 02 00 04 07 00 03 07 00 36 07 00 DB 01 00 03 07 00 70 07 00 DB 01 FF 00 1D 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 42 07 00 19 FF 00 00 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 42 07 00 19 40 07 00 70 45 07 00 34 40 07 00 DB 40 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 00 89 08 00 89 41 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 08 02 40 08 02 40 41 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 DB 41 07 00 70 FF 00 01 00 04 07 00 03 07 00 36 07 00 DB 01 00 02 07 00 70 07 00 76 41 07 00 03 41 07 00 70 FF 00 01 00 02 07 00 03 07 00 36 00 01 07 00 34 43 05 44 07 00 34 47 05 FF 00 07 00 04 07 00 03 07 00 36 07 00 DB 01 00 01 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  30     125    128    130    Ljava/lang/NullPointerException;
        //  8      20     1009   1017   Any
        //  1009   1017   1009   1017   Any
        //  1025   1027   3      8      Ljava/lang/IllegalStateException;
        //  82     89     89     90     Any
        //  83     89     89     90     Ljava/util/NoSuchElementException;
        //  82     89     82     83     Any
        //  82     89     3      8      Ljava/lang/AssertionError;
        //  83     89     3      8      Ljava/lang/ClassCastException;
        //  94     101    101    102    Any
        //  95     101    101    102    Ljava/lang/EnumConstantNotPresentException;
        //  94     101    101    102    Ljava/lang/StringIndexOutOfBoundsException;
        //  94     101    3      8      Any
        //  94     101    94     95     Ljava/lang/EnumConstantNotPresentException;
        //  105    112    112    113    Any
        //  105    112    3      8      Any
        //  105    112    105    106    Any
        //  106    112    3      8      Any
        //  106    112    105    106    Ljava/lang/RuntimeException;
        //  116    123    123    124    Any
        //  116    123    3      8      Ljava/lang/ArithmeticException;
        //  117    123    116    117    Ljava/lang/IndexOutOfBoundsException;
        //  117    123    3      8      Ljava/lang/RuntimeException;
        //  117    123    116    117    Any
        //  192    198    198    199    Any
        //  192    198    198    199    Any
        //  192    198    198    199    Any
        //  192    198    3      8      Any
        //  192    198    3      8      Ljava/util/NoSuchElementException;
        //  247    254    254    255    Any
        //  247    254    254    255    Any
        //  247    254    254    255    Any
        //  247    254    247    248    Ljava/util/NoSuchElementException;
        //  248    254    254    255    Any
        //  306    313    313    314    Any
        //  306    313    313    314    Ljava/lang/NegativeArraySizeException;
        //  307    313    313    314    Ljava/lang/StringIndexOutOfBoundsException;
        //  306    313    306    307    Ljava/lang/NullPointerException;
        //  306    313    313    314    Ljava/lang/NumberFormatException;
        //  318    324    324    325    Any
        //  318    324    324    325    Ljava/lang/NumberFormatException;
        //  318    324    3      8      Ljava/lang/RuntimeException;
        //  318    324    324    325    Any
        //  318    324    3      8      Any
        //  386    392    392    393    Any
        //  386    392    392    393    Ljava/lang/ClassCastException;
        //  386    392    392    393    Ljava/lang/AssertionError;
        //  386    392    392    393    Ljava/lang/IllegalStateException;
        //  386    392    392    393    Ljava/lang/NegativeArraySizeException;
        //  443    450    450    451    Any
        //  444    450    450    451    Ljava/lang/EnumConstantNotPresentException;
        //  444    450    450    451    Ljava/lang/IllegalArgumentException;
        //  444    450    443    444    Ljava/lang/ClassCastException;
        //  444    450    3      8      Ljava/lang/NegativeArraySizeException;
        //  547    554    554    555    Any
        //  547    554    547    548    Any
        //  547    554    554    555    Ljava/util/ConcurrentModificationException;
        //  548    554    3      8      Ljava/lang/ArithmeticException;
        //  547    554    554    555    Any
        //  558    565    565    566    Any
        //  558    565    3      8      Any
        //  559    565    565    566    Any
        //  558    565    3      8      Ljava/lang/IllegalArgumentException;
        //  558    565    558    559    Ljava/lang/IndexOutOfBoundsException;
        //  627    634    634    635    Any
        //  627    634    634    635    Any
        //  628    634    634    635    Any
        //  628    634    627    628    Any
        //  628    634    634    635    Any
        //  683    690    690    691    Any
        //  684    690    690    691    Any
        //  683    690    683    684    Any
        //  683    690    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  684    690    690    691    Any
        //  698    704    704    705    Any
        //  698    704    3      8      Ljava/lang/NegativeArraySizeException;
        //  698    704    3      8      Ljava/lang/RuntimeException;
        //  698    704    3      8      Any
        //  698    704    704    705    Any
        //  755    762    762    763    Any
        //  756    762    755    756    Any
        //  756    762    755    756    Ljava/util/ConcurrentModificationException;
        //  755    762    755    756    Any
        //  756    762    3      8      Any
        //  816    823    823    824    Any
        //  816    823    3      8      Any
        //  817    823    3      8      Any
        //  817    823    3      8      Any
        //  816    823    816    817    Ljava/lang/IndexOutOfBoundsException;
        //  829    835    835    836    Any
        //  829    835    835    836    Any
        //  829    835    3      8      Ljava/lang/NullPointerException;
        //  829    835    835    836    Any
        //  829    835    835    836    Any
        //  884    891    891    892    Any
        //  885    891    3      8      Any
        //  885    891    891    892    Ljava/lang/UnsupportedOperationException;
        //  884    891    3      8      Ljava/lang/RuntimeException;
        //  884    891    884    885    Ljava/lang/ArithmeticException;
        //  943    950    950    951    Any
        //  944    950    3      8      Any
        //  943    950    943    944    Any
        //  944    950    3      8      Ljava/lang/UnsupportedOperationException;
        //  943    950    3      8      Ljava/util/ConcurrentModificationException;
        //  954    961    961    962    Any
        //  954    961    954    955    Ljava/lang/RuntimeException;
        //  955    961    3      8      Any
        //  955    961    3      8      Ljava/lang/AssertionError;
        //  955    961    961    962    Ljava/lang/NegativeArraySizeException;
        //  965    972    972    973    Any
        //  965    972    965    966    Ljava/lang/NullPointerException;
        //  966    972    965    966    Ljava/lang/EnumConstantNotPresentException;
        //  966    972    965    966    Ljava/lang/NullPointerException;
        //  966    972    972    973    Any
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
    
    public void 0(final ItemStack itemStack, final int n, final int n2) {
        fbS.5C(this, 1861616608, itemStack, n, n2);
    }
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          6286
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            6278
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            6270
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f9U.c:Ljava/util/List;
        //    28: goto            32
        //    31: athrow         
        //    32: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    37: goto            41
        //    40: athrow         
        //    41: astore_3       
        //    42: aload_3        
        //    43: goto            47
        //    46: athrow         
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: goto            56
        //    55: athrow         
        //    56: ifeq            6087
        //    59: aload_3        
        //    60: getstatic       dev/nuker/pyro/fc.1:I
        //    63: ifeq            72
        //    66: ldc_w           -894888356
        //    69: goto            75
        //    72: ldc_w           -1397228131
        //    75: ldc_w           -1229008660
        //    78: ixor           
        //    79: lookupswitch {
        //          436809073: 104
        //          2081932976: 72
        //          default: 6165
        //        }
        //   104: goto            108
        //   107: athrow         
        //   108: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   113: goto            117
        //   116: athrow         
        //   117: checkcast       Ljava/lang/Integer;
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   java/lang/Integer.intValue:()I
        //   127: goto            131
        //   130: athrow         
        //   131: getstatic       dev/nuker/pyro/fc.0:I
        //   134: ifeq            143
        //   137: ldc_w           536946930
        //   140: goto            146
        //   143: ldc_w           -2044297589
        //   146: ldc_w           -1705240391
        //   149: ixor           
        //   150: lookupswitch {
        //          -1168297909: 143
        //          477783602: 176
        //          default: 6203
        //        }
        //   176: istore          4
        //   178: aload_0        
        //   179: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   182: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   185: iload           4
        //   187: goto            191
        //   190: athrow         
        //   191: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73045_a:(I)Lnet/minecraft/entity/Entity;
        //   194: goto            198
        //   197: athrow         
        //   198: astore          5
        //   200: aload           5
        //   202: ifnull          211
        //   205: ldc_w           816157237
        //   208: goto            214
        //   211: ldc_w           816157238
        //   214: ldc_w           -1475867588
        //   217: ixor           
        //   218: tableswitch {
        //          828062738: 240
        //          828062739: 42
        //          default: 205
        //        }
        //   240: aload           5
        //   242: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   245: ifne            254
        //   248: ldc_w           -1837401945
        //   251: goto            257
        //   254: ldc_w           -1837401960
        //   257: ldc_w           -1304926664
        //   260: ixor           
        //   261: tableswitch {
        //          1082539326: 284
        //          1082539327: 287
        //          default: 248
        //        }
        //   284: goto            42
        //   287: aload           5
        //   289: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   292: astore          6
        //   294: aload_0        
        //   295: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   298: getstatic       dev/nuker/pyro/fc.c:I
        //   301: ifge            310
        //   304: ldc_w           1118025854
        //   307: goto            313
        //   310: ldc_w           -996931392
        //   313: ldc_w           1530117666
        //   316: ixor           
        //   317: lookupswitch {
        //          -1616398622: 344
        //          428869212: 310
        //          default: 6179
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   351: goto            355
        //   354: athrow         
        //   355: getstatic       dev/nuker/pyro/fc.1:I
        //   358: ifeq            367
        //   361: ldc_w           -560430458
        //   364: goto            370
        //   367: ldc_w           93720231
        //   370: ldc_w           -1903594157
        //   373: ixor           
        //   374: lookupswitch {
        //          -1960870924: 400
        //          1343354837: 367
        //          default: 6225
        //        }
        //   400: astore          7
        //   402: getstatic       dev/nuker/pyro/fc.1:I
        //   405: ifeq            414
        //   408: ldc_w           -910951083
        //   411: goto            417
        //   414: ldc_w           1305836578
        //   417: ldc_w           2111973195
        //   420: ixor           
        //   421: lookupswitch {
        //          -1269704162: 6229
        //          -1195881455: 414
        //          default: 448
        //        }
        //   448: aload           6
        //   450: fload_2        
        //   451: goto            455
        //   454: athrow         
        //   455: invokestatic    dev/nuker/pyro/fbj.c:(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/util/math/Vec3d;
        //   458: goto            462
        //   461: athrow         
        //   462: astore          8
        //   464: aload           8
        //   466: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   469: dstore          9
        //   471: getstatic       dev/nuker/pyro/fc.1:I
        //   474: ifeq            483
        //   477: ldc_w           467105546
        //   480: goto            486
        //   483: ldc_w           -747379940
        //   486: ldc_w           -777111273
        //   489: ixor           
        //   490: lookupswitch {
        //          -1702172394: 483
        //          -898019811: 6137
        //          default: 516
        //        }
        //   516: aload           8
        //   518: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   521: ldc2_w          0.65
        //   524: dadd           
        //   525: dstore          11
        //   527: getstatic       dev/nuker/pyro/fc.0:I
        //   530: ifeq            539
        //   533: ldc_w           -1089090450
        //   536: goto            542
        //   539: ldc_w           1448798525
        //   542: ldc_w           -1416124423
        //   545: ixor           
        //   546: lookupswitch {
        //          -36876604: 572
        //          344091543: 539
        //          default: 6205
        //        }
        //   572: aload           8
        //   574: getstatic       dev/nuker/pyro/fc.c:I
        //   577: ifge            586
        //   580: ldc_w           -306815136
        //   583: goto            589
        //   586: ldc_w           481470479
        //   589: ldc_w           -971376981
        //   592: ixor           
        //   593: lookupswitch {
        //          732932555: 6109
        //          909647995: 586
        //          default: 620
        //        }
        //   620: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   623: getstatic       dev/nuker/pyro/fc.1:I
        //   626: ifeq            635
        //   629: ldc_w           -1536435141
        //   632: goto            638
        //   635: ldc_w           2117375471
        //   638: ldc_w           -1616987510
        //   641: ixor           
        //   642: lookupswitch {
        //          -758666257: 635
        //          1005938353: 6183
        //          default: 668
        //        }
        //   668: dstore          13
        //   670: dload           11
        //   672: getstatic       dev/nuker/pyro/fc.1:I
        //   675: ifeq            684
        //   678: ldc_w           -63361852
        //   681: goto            687
        //   684: ldc_w           -683297559
        //   687: ldc_w           1988807443
        //   690: ixor           
        //   691: lookupswitch {
        //          -1967921193: 6101
        //          -825489712: 684
        //          default: 716
        //        }
        //   716: aload           6
        //   718: goto            722
        //   721: athrow         
        //   722: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70093_af:()Z
        //   725: goto            729
        //   728: athrow         
        //   729: ifeq            738
        //   732: ldc_w           -1316615665
        //   735: goto            741
        //   738: ldc_w           -1316615666
        //   741: ldc_w           1227011635
        //   744: ixor           
        //   745: tableswitch {
        //          -246843272: 768
        //          -246843271: 772
        //          default: 732
        //        }
        //   768: dconst_0       
        //   769: goto            775
        //   772: ldc2_w          0.07999999821186066
        //   775: dadd           
        //   776: dstore          15
        //   778: aload           7
        //   780: fload_2        
        //   781: goto            785
        //   784: athrow         
        //   785: invokestatic    dev/nuker/pyro/fbj.c:(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/util/math/Vec3d;
        //   788: goto            792
        //   791: athrow         
        //   792: astore          8
        //   794: aload           7
        //   796: getstatic       dev/nuker/pyro/fc.0:I
        //   799: ifeq            808
        //   802: ldc_w           1040579124
        //   805: goto            811
        //   808: ldc_w           -948166847
        //   811: ldc_w           785746375
        //   814: ixor           
        //   815: lookupswitch {
        //          -594611306: 808
        //          282096627: 6113
        //          default: 840
        //        }
        //   840: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   843: dstore          17
        //   845: aload           7
        //   847: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   850: getstatic       dev/nuker/pyro/fc.1:I
        //   853: ifeq            862
        //   856: ldc_w           135408774
        //   859: goto            865
        //   862: ldc_w           -2113701139
        //   865: ldc_w           -1361215738
        //   868: ixor           
        //   869: lookupswitch {
        //          -1496362112: 862
        //          752748011: 896
        //          default: 6149
        //        }
        //   896: dstore          19
        //   898: aload           7
        //   900: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   903: dstore          21
        //   905: aload           7
        //   907: aload           8
        //   909: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   912: putfield        net/minecraft/entity/Entity.field_70165_t:D
        //   915: aload           7
        //   917: getstatic       dev/nuker/pyro/fc.0:I
        //   920: ifeq            929
        //   923: ldc_w           2019441720
        //   926: goto            932
        //   929: ldc_w           -1641821790
        //   932: ldc_w           -601458807
        //   935: ixor           
        //   936: lookupswitch {
        //          -1772512627: 929
        //          -1535620175: 6243
        //          default: 964
        //        }
        //   964: aload           8
        //   966: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   969: getstatic       dev/nuker/pyro/fc.0:I
        //   972: ifeq            981
        //   975: ldc_w           1342431950
        //   978: goto            984
        //   981: ldc_w           -711038093
        //   984: ldc_w           1265548580
        //   987: ixor           
        //   988: lookupswitch {
        //          -1628383657: 1016
        //          460152810: 981
        //          default: 6181
        //        }
        //  1016: putfield        net/minecraft/entity/Entity.field_70163_u:D
        //  1019: getstatic       dev/nuker/pyro/fc.0:I
        //  1022: ifeq            1031
        //  1025: ldc_w           -1707315572
        //  1028: goto            1034
        //  1031: ldc_w           95555305
        //  1034: ldc_w           -1509750503
        //  1037: ixor           
        //  1038: lookupswitch {
        //          -1548679184: 1064
        //          1010788245: 1031
        //          default: 6139
        //        }
        //  1064: aload           7
        //  1066: aload           8
        //  1068: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1071: getstatic       dev/nuker/pyro/fc.1:I
        //  1074: ifeq            1083
        //  1077: ldc_w           962455175
        //  1080: goto            1086
        //  1083: ldc_w           697611978
        //  1086: ldc_w           -2035763519
        //  1089: ixor           
        //  1090: lookupswitch {
        //          -1355022325: 1116
        //          -1074442170: 1083
        //          default: 6173
        //        }
        //  1116: putfield        net/minecraft/entity/Entity.field_70161_v:D
        //  1119: aload           7
        //  1121: getstatic       dev/nuker/pyro/fc.c:I
        //  1124: ifge            1133
        //  1127: ldc_w           -446765037
        //  1130: goto            1136
        //  1133: ldc_w           1152727995
        //  1136: ldc_w           550373530
        //  1139: ixor           
        //  1140: lookupswitch {
        //          -980361079: 1133
        //          1685795617: 1168
        //          default: 6241
        //        }
        //  1168: dload           9
        //  1170: dload           11
        //  1172: dload           13
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: invokevirtual   net/minecraft/entity/Entity.func_70011_f:(DDD)D
        //  1181: goto            1185
        //  1184: athrow         
        //  1185: dstore          11
        //  1187: ldc2_w          0.04
        //  1190: getstatic       dev/nuker/pyro/fc.c:I
        //  1193: ifge            1202
        //  1196: ldc_w           548555626
        //  1199: goto            1205
        //  1202: ldc_w           2007195971
        //  1205: ldc_w           -563896377
        //  1208: ixor           
        //  1209: lookupswitch {
        //          -971875429: 1202
        //          -19802963: 6237
        //          default: 1236
        //        }
        //  1236: dstore          23
        //  1238: getstatic       dev/nuker/pyro/fc.c:I
        //  1241: ifge            1250
        //  1244: ldc_w           1872880395
        //  1247: goto            1253
        //  1250: ldc_w           -1067416999
        //  1253: ldc_w           -1169008381
        //  1256: ixor           
        //  1257: lookupswitch {
        //          -705447416: 6191
        //          1169071609: 1250
        //          default: 1284
        //        }
        //  1284: dload           11
        //  1286: dconst_0       
        //  1287: dcmpl          
        //  1288: ifle            1297
        //  1291: ldc_w           1412994209
        //  1294: goto            1300
        //  1297: ldc_w           1412994238
        //  1300: ldc_w           -293097586
        //  1303: ixor           
        //  1304: tableswitch {
        //          1971222110: 1328
        //          1971222111: 1370
        //          default: 1291
        //        }
        //  1328: ldc2_w          0.02
        //  1331: aload_0        
        //  1332: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0d;
        //  1335: goto            1339
        //  1338: athrow         
        //  1339: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1342: goto            1346
        //  1345: athrow         
        //  1346: checkcast       Ljava/lang/Double;
        //  1349: goto            1353
        //  1352: athrow         
        //  1353: invokevirtual   java/lang/Double.doubleValue:()D
        //  1356: goto            1360
        //  1359: athrow         
        //  1360: ldc2_w          1000.0
        //  1363: ddiv           
        //  1364: dload           11
        //  1366: dmul           
        //  1367: dadd           
        //  1368: dstore          23
        //  1370: goto            1374
        //  1373: athrow         
        //  1374: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  1377: goto            1381
        //  1380: athrow         
        //  1381: goto            1385
        //  1384: athrow         
        //  1385: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74519_b:()V
        //  1388: goto            1392
        //  1391: athrow         
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179088_q:()V
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: fconst_1       
        //  1404: ldc_w           -1500000.0
        //  1407: getstatic       dev/nuker/pyro/fc.0:I
        //  1410: ifeq            1419
        //  1413: ldc_w           -448033967
        //  1416: goto            1422
        //  1419: ldc_w           994528663
        //  1422: ldc_w           676114327
        //  1425: ixor           
        //  1426: lookupswitch {
        //          -855169850: 1419
        //          319545856: 1452
        //          default: 6105
        //        }
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179136_a:(FF)V
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179140_f:()V
        //  1470: goto            1474
        //  1473: athrow         
        //  1474: getstatic       dev/nuker/pyro/fc.0:I
        //  1477: ifeq            1486
        //  1480: ldc_w           -2084499581
        //  1483: goto            1489
        //  1486: ldc_w           -417633037
        //  1489: ldc_w           2060859407
        //  1492: ixor           
        //  1493: lookupswitch {
        //          -1647487748: 1520
        //          -115918964: 1486
        //          default: 6141
        //        }
        //  1520: dload           9
        //  1522: d2f            
        //  1523: getstatic       dev/nuker/pyro/fc.c:I
        //  1526: ifge            1535
        //  1529: ldc_w           -256613369
        //  1532: goto            1538
        //  1535: ldc_w           -114025699
        //  1538: ldc_w           2145031819
        //  1541: ixor           
        //  1542: lookupswitch {
        //          -1888554356: 6135
        //          -5400342: 1535
        //          default: 1568
        //        }
        //  1568: dload           15
        //  1570: d2f            
        //  1571: ldc_w           1.4
        //  1574: fadd           
        //  1575: dload           13
        //  1577: d2f            
        //  1578: goto            1582
        //  1581: athrow         
        //  1582: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  1585: goto            1589
        //  1588: athrow         
        //  1589: aload_0        
        //  1590: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //  1593: getstatic       dev/nuker/pyro/fc.c:I
        //  1596: ifge            1605
        //  1599: ldc_w           -2143878974
        //  1602: goto            1608
        //  1605: ldc_w           1100553388
        //  1608: ldc_w           -643968305
        //  1611: ixor           
        //  1612: lookupswitch {
        //          276319694: 1605
        //          1504367117: 6159
        //          default: 1640
        //        }
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: getstatic       dev/nuker/pyro/fc.0:I
        //  1654: ifeq            1663
        //  1657: ldc_w           207428197
        //  1660: goto            1666
        //  1663: ldc_w           -972984921
        //  1666: ldc_w           2110778233
        //  1669: ixor           
        //  1670: lookupswitch {
        //          -1144092962: 1696
        //          1905455388: 1663
        //          default: 6115
        //        }
        //  1696: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78735_i:F
        //  1699: fneg           
        //  1700: fstore          25
        //  1702: fconst_1       
        //  1703: fstore          26
        //  1705: fconst_0       
        //  1706: fstore          27
        //  1708: fload           25
        //  1710: fconst_0       
        //  1711: fconst_1       
        //  1712: fconst_0       
        //  1713: goto            1717
        //  1716: athrow         
        //  1717: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  1720: goto            1724
        //  1723: athrow         
        //  1724: getstatic       dev/nuker/pyro/fc.c:I
        //  1727: ifge            1736
        //  1730: ldc_w           -227095964
        //  1733: goto            1739
        //  1736: ldc_w           -883344660
        //  1739: ldc_w           216233497
        //  1742: ixor           
        //  1743: lookupswitch {
        //          -944091915: 1768
        //          -23741315: 1736
        //          default: 6253
        //        }
        //  1768: aload_0        
        //  1769: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //  1772: goto            1776
        //  1775: athrow         
        //  1776: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //  1779: goto            1783
        //  1782: athrow         
        //  1783: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78732_j:F
        //  1786: aload_0        
        //  1787: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //  1790: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //  1793: getfield        net/minecraft/client/settings/GameSettings.field_74320_O:I
        //  1796: iconst_2       
        //  1797: if_icmpne       1806
        //  1800: ldc_w           -1.0
        //  1803: goto            1807
        //  1806: fconst_1       
        //  1807: fconst_0       
        //  1808: fconst_0       
        //  1809: goto            1813
        //  1812: athrow         
        //  1813: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //  1816: goto            1820
        //  1819: athrow         
        //  1820: dload           23
        //  1822: dneg           
        //  1823: dload           23
        //  1825: dneg           
        //  1826: dload           23
        //  1828: goto            1832
        //  1831: athrow         
        //  1832: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179139_a:(DDD)V
        //  1835: goto            1839
        //  1838: athrow         
        //  1839: goto            1843
        //  1842: athrow         
        //  1843: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179097_i:()V
        //  1846: goto            1850
        //  1849: athrow         
        //  1850: goto            1854
        //  1853: athrow         
        //  1854: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //  1857: goto            1861
        //  1860: athrow         
        //  1861: aload_0        
        //  1862: getstatic       dev/nuker/pyro/fc.0:I
        //  1865: ifeq            1874
        //  1868: ldc_w           -1489847036
        //  1871: goto            1877
        //  1874: ldc_w           -700263293
        //  1877: ldc_w           -1211807819
        //  1880: ixor           
        //  1881: lookupswitch {
        //          48376532: 1874
        //          284687025: 6153
        //          default: 1908
        //        }
        //  1908: aload           6
        //  1910: goto            1914
        //  1913: athrow         
        //  1914: invokevirtual   dev/nuker/pyro/f9U.1:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //  1917: goto            1921
        //  1920: athrow         
        //  1921: getstatic       dev/nuker/pyro/fc.1:I
        //  1924: ifeq            1933
        //  1927: ldc_w           -1333523528
        //  1930: goto            1936
        //  1933: ldc_w           -168025939
        //  1936: ldc_w           840639256
        //  1939: ixor           
        //  1940: lookupswitch {
        //          -2103498592: 1933
        //          -941161547: 1968
        //          default: 6235
        //        }
        //  1968: astore          28
        //  1970: aload           28
        //  1972: goto            1976
        //  1975: athrow         
        //  1976: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;)F
        //  1979: goto            1983
        //  1982: athrow         
        //  1983: fconst_2       
        //  1984: fdiv           
        //  1985: fstore          29
        //  1987: goto            1991
        //  1990: athrow         
        //  1991: invokestatic    dev/nuker/pyro/fbs.c:()F
        //  1994: goto            1998
        //  1997: athrow         
        //  1998: fstore          30
        //  2000: aload_0        
        //  2001: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  2004: getstatic       dev/nuker/pyro/fc.0:I
        //  2007: ifeq            2016
        //  2010: ldc_w           1856940938
        //  2013: goto            2019
        //  2016: ldc_w           -1518436406
        //  2019: ldc_w           185188818
        //  2022: ixor           
        //  2023: lookupswitch {
        //          -1946262473: 2016
        //          1705470552: 6217
        //          default: 2048
        //        }
        //  2048: goto            2052
        //  2051: athrow         
        //  2052: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2055: goto            2059
        //  2058: athrow         
        //  2059: getstatic       dev/nuker/pyro/f9S.1:Ldev/nuker/pyro/f9S;
        //  2062: if_acmpne       2074
        //  2065: fload           30
        //  2067: ldc_w           16.0
        //  2070: fadd           
        //  2071: goto            2075
        //  2074: fconst_0       
        //  2075: getstatic       dev/nuker/pyro/fc.1:I
        //  2078: ifeq            2087
        //  2081: ldc_w           1314276032
        //  2084: goto            2090
        //  2087: ldc_w           213357989
        //  2090: ldc_w           2066805666
        //  2093: ixor           
        //  2094: lookupswitch {
        //          -845276874: 2087
        //          895922530: 6167
        //          default: 2120
        //        }
        //  2120: fstore          31
        //  2122: getstatic       dev/nuker/pyro/fc.c:I
        //  2125: ifge            2134
        //  2128: ldc_w           -979017130
        //  2131: goto            2137
        //  2134: ldc_w           -2129437821
        //  2137: ldc_w           -1170312819
        //  2140: ixor           
        //  2141: lookupswitch {
        //          992815630: 2168
        //          2140869595: 2134
        //          default: 6189
        //        }
        //  2168: fload           29
        //  2170: fconst_2       
        //  2171: fadd           
        //  2172: fstore          32
        //  2174: goto            2178
        //  2177: athrow         
        //  2178: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //  2181: goto            2185
        //  2184: athrow         
        //  2185: fload           29
        //  2187: fneg           
        //  2188: fconst_1       
        //  2189: fsub           
        //  2190: getstatic       dev/nuker/pyro/fc.c:I
        //  2193: ifge            2202
        //  2196: ldc_w           2063612261
        //  2199: goto            2205
        //  2202: ldc_w           1906060169
        //  2205: ldc_w           -1846996221
        //  2208: ixor           
        //  2209: lookupswitch {
        //          -1765859704: 2202
        //          -353818010: 6117
        //          default: 2236
        //        }
        //  2236: fload           31
        //  2238: fload           30
        //  2240: fadd           
        //  2241: fconst_1       
        //  2242: fadd           
        //  2243: fneg           
        //  2244: ldc_w           3.0
        //  2247: fadd           
        //  2248: getstatic       dev/nuker/pyro/fc.0:I
        //  2251: ifeq            2260
        //  2254: ldc_w           773219606
        //  2257: goto            2263
        //  2260: ldc_w           -1055915538
        //  2263: ldc_w           -1540777088
        //  2266: ixor           
        //  2267: lookupswitch {
        //          -1975517546: 6175
        //          -1359740495: 2260
        //          default: 2292
        //        }
        //  2292: fload           32
        //  2294: fconst_2       
        //  2295: fload           31
        //  2297: fsub           
        //  2298: ldc_w           1594493450
        //  2301: goto            2305
        //  2304: athrow         
        //  2305: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2308: goto            2312
        //  2311: athrow         
        //  2312: goto            2316
        //  2315: athrow         
        //  2316: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //  2319: goto            2323
        //  2322: athrow         
        //  2323: getstatic       dev/nuker/pyro/fc.c:I
        //  2326: ifge            2335
        //  2329: ldc_w           1594403038
        //  2332: goto            2338
        //  2335: ldc_w           379586202
        //  2338: ldc_w           -708407789
        //  2341: ixor           
        //  2342: lookupswitch {
        //          -1966201139: 2335
        //          -1016690551: 2368
        //          default: 6215
        //        }
        //  2368: aload           28
        //  2370: fload           29
        //  2372: fneg           
        //  2373: fconst_1       
        //  2374: fadd           
        //  2375: fload           31
        //  2377: fneg           
        //  2378: fload           30
        //  2380: fsub           
        //  2381: ldc_w           3.0
        //  2384: fadd           
        //  2385: aload_0        
        //  2386: aload           6
        //  2388: goto            2392
        //  2391: athrow         
        //  2392: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110138_aP:()F
        //  2395: goto            2399
        //  2398: athrow         
        //  2399: aload           6
        //  2401: goto            2405
        //  2404: athrow         
        //  2405: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //  2408: goto            2412
        //  2411: athrow         
        //  2412: goto            2416
        //  2415: athrow         
        //  2416: invokevirtual   dev/nuker/pyro/f9U.c:(FF)I
        //  2419: goto            2423
        //  2422: athrow         
        //  2423: getstatic       dev/nuker/pyro/fc.c:I
        //  2426: ifge            2435
        //  2429: ldc_w           548542755
        //  2432: goto            2438
        //  2435: ldc_w           -317147016
        //  2438: ldc_w           -749814089
        //  2441: ixor           
        //  2442: lookupswitch {
        //          -201545836: 2435
        //          1045825231: 2468
        //          default: 6177
        //        }
        //  2468: goto            2472
        //  2471: athrow         
        //  2472: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;FFI)V
        //  2475: goto            2479
        //  2478: athrow         
        //  2479: aload_0        
        //  2480: getstatic       dev/nuker/pyro/fc.1:I
        //  2483: ifeq            2492
        //  2486: ldc_w           1736464501
        //  2489: goto            2495
        //  2492: ldc_w           2084684363
        //  2495: ldc_w           1884822173
        //  2498: ixor           
        //  2499: lookupswitch {
        //          203020502: 2524
        //          400048872: 2492
        //          default: 6129
        //        }
        //  2524: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0f;
        //  2527: goto            2531
        //  2530: athrow         
        //  2531: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2534: goto            2538
        //  2537: athrow         
        //  2538: getstatic       dev/nuker/pyro/fc.c:I
        //  2541: ifge            2550
        //  2544: ldc_w           -2110591724
        //  2547: goto            2553
        //  2550: ldc_w           -635256315
        //  2553: ldc_w           330703900
        //  2556: ixor           
        //  2557: lookupswitch {
        //          -1853568760: 6259
        //          1590563905: 2550
        //          default: 2584
        //        }
        //  2584: getstatic       dev/nuker/pyro/f9T.1:Ldev/nuker/pyro/f9T;
        //  2587: if_acmpne       4115
        //  2590: getstatic       dev/nuker/pyro/fc.1:I
        //  2593: ifeq            2602
        //  2596: ldc_w           -88644429
        //  2599: goto            2605
        //  2602: ldc_w           -330624571
        //  2605: ldc_w           -1314727143
        //  2608: ixor           
        //  2609: lookupswitch {
        //          1259716522: 2602
        //          1575602908: 2636
        //          default: 6123
        //        }
        //  2636: aload_0        
        //  2637: aload           6
        //  2639: goto            2643
        //  2642: athrow         
        //  2643: invokevirtual   dev/nuker/pyro/f9U.2:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //  2646: goto            2650
        //  2649: athrow         
        //  2650: getstatic       dev/nuker/pyro/fc.c:I
        //  2653: ifge            2662
        //  2656: ldc_w           2061928238
        //  2659: goto            2665
        //  2662: ldc_w           -177655547
        //  2665: ldc_w           -853018739
        //  2668: ixor           
        //  2669: lookupswitch {
        //          -1212059485: 6221
        //          1910294906: 2662
        //          default: 2696
        //        }
        //  2696: astore          33
        //  2698: aload_0        
        //  2699: getstatic       dev/nuker/pyro/fc.1:I
        //  2702: ifeq            2711
        //  2705: ldc_w           -784635884
        //  2708: goto            2714
        //  2711: ldc_w           -764074278
        //  2714: ldc_w           -5220873
        //  2717: ixor           
        //  2718: lookupswitch {
        //          243746754: 2711
        //          780877283: 6121
        //          default: 2744
        //        }
        //  2744: aload           6
        //  2746: goto            2750
        //  2749: athrow         
        //  2750: invokevirtual   dev/nuker/pyro/f9U.c:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
        //  2753: goto            2757
        //  2756: athrow         
        //  2757: astore          34
        //  2759: aload           33
        //  2761: goto            2765
        //  2764: athrow         
        //  2765: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;)F
        //  2768: goto            2772
        //  2771: athrow         
        //  2772: fconst_2       
        //  2773: fdiv           
        //  2774: fstore          35
        //  2776: getstatic       dev/nuker/pyro/fc.0:I
        //  2779: ifeq            2788
        //  2782: ldc_w           271605189
        //  2785: goto            2791
        //  2788: ldc_w           1920120193
        //  2791: ldc_w           -1988755020
        //  2794: ixor           
        //  2795: lookupswitch {
        //          -1723442063: 2788
        //          -83577803: 2820
        //          default: 6219
        //        }
        //  2820: aload           34
        //  2822: goto            2826
        //  2825: athrow         
        //  2826: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;)F
        //  2829: goto            2833
        //  2832: athrow         
        //  2833: fconst_2       
        //  2834: fdiv           
        //  2835: fstore          36
        //  2837: fload           36
        //  2839: fload           35
        //  2841: fadd           
        //  2842: fload           29
        //  2844: fcmpl          
        //  2845: ifle            2854
        //  2848: ldc_w           -288351793
        //  2851: goto            2857
        //  2854: ldc_w           -288351800
        //  2857: ldc_w           1619892292
        //  2860: ixor           
        //  2861: tableswitch {
        //          482018070: 2884
        //          482018071: 3635
        //          default: 2848
        //        }
        //  2884: new             Ljava/lang/StringBuilder;
        //  2887: dup            
        //  2888: goto            2892
        //  2891: athrow         
        //  2892: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2895: goto            2899
        //  2898: athrow         
        //  2899: getstatic       dev/nuker/pyro/fc.c:I
        //  2902: ifge            2911
        //  2905: ldc_w           -396592265
        //  2908: goto            2914
        //  2911: ldc_w           60081150
        //  2914: ldc_w           -1480193161
        //  2917: ixor           
        //  2918: lookupswitch {
        //          -1538078583: 2944
        //          1335521280: 2911
        //          default: 6251
        //        }
        //  2944: aload           33
        //  2946: getstatic       dev/nuker/pyro/fc.0:I
        //  2949: ifeq            2958
        //  2952: ldc_w           -1694705551
        //  2955: goto            2961
        //  2958: ldc_w           280261197
        //  2961: ldc_w           707497650
        //  2964: ixor           
        //  2965: lookupswitch {
        //          -1328064829: 6143
        //          -269197438: 2958
        //          default: 2992
        //        }
        //  2992: goto            2996
        //  2995: athrow         
        //  2996: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2999: goto            3003
        //  3002: athrow         
        //  3003: ldc             "\u222e\u14d3"
        //  3005: goto            3009
        //  3008: athrow         
        //  3009: invokestatic    invokestatic   !!! ERROR
        //  3012: goto            3016
        //  3015: athrow         
        //  3016: goto            3020
        //  3019: athrow         
        //  3020: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3023: goto            3027
        //  3026: athrow         
        //  3027: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  3030: getstatic       dev/nuker/pyro/fc.1:I
        //  3033: ifeq            3042
        //  3036: ldc_w           -1070819582
        //  3039: goto            3045
        //  3042: ldc_w           -690855515
        //  3045: ldc_w           1159092021
        //  3048: ixor           
        //  3049: lookupswitch {
        //          -2059747273: 3042
        //          -1815857520: 3076
        //          default: 6145
        //        }
        //  3076: goto            3080
        //  3079: athrow         
        //  3080: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3083: goto            3087
        //  3086: athrow         
        //  3087: aload           34
        //  3089: getstatic       dev/nuker/pyro/fc.c:I
        //  3092: ifge            3101
        //  3095: ldc_w           -1891571620
        //  3098: goto            3104
        //  3101: ldc_w           440760831
        //  3104: ldc_w           -1132622922
        //  3107: ixor           
        //  3108: lookupswitch {
        //          -2090152434: 3101
        //          859661290: 6245
        //          default: 3136
        //        }
        //  3136: goto            3140
        //  3139: athrow         
        //  3140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3143: goto            3147
        //  3146: athrow         
        //  3147: getstatic       dev/nuker/pyro/fc.1:I
        //  3150: ifeq            3159
        //  3153: ldc_w           -959043432
        //  3156: goto            3162
        //  3159: ldc_w           -448115569
        //  3162: ldc_w           -1566605499
        //  3165: ixor           
        //  3166: lookupswitch {
        //          -1051291390: 3159
        //          1682528221: 6207
        //          default: 3192
        //        }
        //  3192: goto            3196
        //  3195: athrow         
        //  3196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3199: goto            3203
        //  3202: athrow         
        //  3203: astore          37
        //  3205: getstatic       dev/nuker/pyro/fc.c:I
        //  3208: ifge            3217
        //  3211: ldc_w           1725543606
        //  3214: goto            3220
        //  3217: ldc_w           1474270773
        //  3220: ldc_w           237252733
        //  3223: ixor           
        //  3224: lookupswitch {
        //          1509664328: 3252
        //          1761445067: 3217
        //          default: 6193
        //        }
        //  3252: aload           37
        //  3254: goto            3258
        //  3257: athrow         
        //  3258: invokestatic    dev/nuker/pyro/fbs.c:(Ljava/lang/String;)F
        //  3261: goto            3265
        //  3264: athrow         
        //  3265: fconst_2       
        //  3266: fdiv           
        //  3267: getstatic       dev/nuker/pyro/fc.c:I
        //  3270: ifge            3279
        //  3273: ldc_w           -460298786
        //  3276: goto            3282
        //  3279: ldc_w           1171094059
        //  3282: ldc_w           322147503
        //  3285: ixor           
        //  3286: lookupswitch {
        //          -140250767: 6127
        //          1117172173: 3279
        //          default: 3312
        //        }
        //  3312: fstore          38
        //  3314: getstatic       dev/nuker/pyro/fc.0:I
        //  3317: ifeq            3326
        //  3320: ldc_w           1603635133
        //  3323: goto            3329
        //  3326: ldc_w           162569983
        //  3329: ldc_w           -2014727099
        //  3332: ixor           
        //  3333: lookupswitch {
        //          -1680793899: 3326
        //          -662948872: 6211
        //          default: 3360
        //        }
        //  3360: goto            3364
        //  3363: athrow         
        //  3364: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //  3367: goto            3371
        //  3370: athrow         
        //  3371: fload           38
        //  3373: fneg           
        //  3374: fconst_1       
        //  3375: fsub           
        //  3376: fload           31
        //  3378: fload           30
        //  3380: fconst_2       
        //  3381: fmul           
        //  3382: fadd           
        //  3383: fconst_1       
        //  3384: fadd           
        //  3385: fneg           
        //  3386: ldc_w           3.0
        //  3389: fadd           
        //  3390: fload           38
        //  3392: fconst_2       
        //  3393: fadd           
        //  3394: fconst_2       
        //  3395: fload           30
        //  3397: fsub           
        //  3398: fload           31
        //  3400: fsub           
        //  3401: ldc_w           1594493450
        //  3404: goto            3408
        //  3407: athrow         
        //  3408: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  3411: goto            3415
        //  3414: athrow         
        //  3415: goto            3419
        //  3418: athrow         
        //  3419: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //  3422: goto            3426
        //  3425: athrow         
        //  3426: getstatic       dev/nuker/pyro/fc.0:I
        //  3429: ifeq            3438
        //  3432: ldc_w           -928117950
        //  3435: goto            3441
        //  3438: ldc_w           1851017598
        //  3441: ldc_w           840810003
        //  3444: ixor           
        //  3445: lookupswitch {
        //          -88885935: 3438
        //          1548351341: 3472
        //          default: 6099
        //        }
        //  3472: aload           37
        //  3474: fload           38
        //  3476: fneg           
        //  3477: fconst_1       
        //  3478: fadd           
        //  3479: getstatic       dev/nuker/pyro/fc.1:I
        //  3482: ifeq            3491
        //  3485: ldc_w           1328991972
        //  3488: goto            3494
        //  3491: ldc_w           -2134531298
        //  3494: ldc_w           853992444
        //  3497: ixor           
        //  3498: lookupswitch {
        //          -1306312478: 3524
        //          2110795032: 3491
        //          default: 6209
        //        }
        //  3524: fload           31
        //  3526: fneg           
        //  3527: fload           30
        //  3529: fconst_2       
        //  3530: fmul           
        //  3531: fsub           
        //  3532: ldc_w           3.0
        //  3535: fadd           
        //  3536: aload_0        
        //  3537: getstatic       dev/nuker/pyro/fc.c:I
        //  3540: ifge            3549
        //  3543: ldc_w           1443556980
        //  3546: goto            3552
        //  3549: ldc_w           -1015742233
        //  3552: ldc_w           -805668598
        //  3555: ixor           
        //  3556: lookupswitch {
        //          -1712285826: 3549
        //          210729453: 3584
        //          default: 6223
        //        }
        //  3584: aload           6
        //  3586: goto            3590
        //  3589: athrow         
        //  3590: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110138_aP:()F
        //  3593: goto            3597
        //  3596: athrow         
        //  3597: aload           6
        //  3599: goto            3603
        //  3602: athrow         
        //  3603: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //  3606: goto            3610
        //  3609: athrow         
        //  3610: goto            3614
        //  3613: athrow         
        //  3614: invokevirtual   dev/nuker/pyro/f9U.c:(FF)I
        //  3617: goto            3621
        //  3620: athrow         
        //  3621: goto            3625
        //  3624: athrow         
        //  3625: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  3628: goto            3632
        //  3631: athrow         
        //  3632: goto            4115
        //  3635: goto            3639
        //  3638: athrow         
        //  3639: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //  3642: goto            3646
        //  3645: athrow         
        //  3646: fload           29
        //  3648: fneg           
        //  3649: fconst_1       
        //  3650: fsub           
        //  3651: fload           31
        //  3653: fload           30
        //  3655: fconst_2       
        //  3656: fmul           
        //  3657: fadd           
        //  3658: fconst_1       
        //  3659: fadd           
        //  3660: fneg           
        //  3661: ldc_w           3.0
        //  3664: fadd           
        //  3665: fload           29
        //  3667: fconst_2       
        //  3668: fadd           
        //  3669: fconst_2       
        //  3670: fload           31
        //  3672: fsub           
        //  3673: getstatic       dev/nuker/pyro/fc.0:I
        //  3676: ifeq            3685
        //  3679: ldc_w           2104460025
        //  3682: goto            3688
        //  3685: ldc_w           1708461547
        //  3688: ldc_w           -2140099783
        //  3691: ixor           
        //  3692: lookupswitch {
        //          -1832725579: 3685
        //          -48289344: 6185
        //          default: 3720
        //        }
        //  3720: fload           30
        //  3722: fsub           
        //  3723: ldc_w           1594493450
        //  3726: goto            3730
        //  3729: athrow         
        //  3730: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  3733: goto            3737
        //  3736: athrow         
        //  3737: goto            3741
        //  3740: athrow         
        //  3741: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //  3744: goto            3748
        //  3747: athrow         
        //  3748: aload           33
        //  3750: fload           29
        //  3752: fneg           
        //  3753: fconst_1       
        //  3754: fadd           
        //  3755: getstatic       dev/nuker/pyro/fc.1:I
        //  3758: ifeq            3767
        //  3761: ldc_w           -286210399
        //  3764: goto            3770
        //  3767: ldc_w           1243748444
        //  3770: ldc_w           -519885144
        //  3773: ixor           
        //  3774: lookupswitch {
        //          -1423886604: 3800
        //          267642889: 3767
        //          default: 6239
        //        }
        //  3800: fload           31
        //  3802: fneg           
        //  3803: fload           30
        //  3805: fconst_2       
        //  3806: fmul           
        //  3807: fsub           
        //  3808: ldc_w           3.0
        //  3811: fadd           
        //  3812: aload_0        
        //  3813: aload           6
        //  3815: goto            3819
        //  3818: athrow         
        //  3819: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110138_aP:()F
        //  3822: goto            3826
        //  3825: athrow         
        //  3826: aload           6
        //  3828: getstatic       dev/nuker/pyro/fc.0:I
        //  3831: ifeq            3840
        //  3834: ldc_w           1096970346
        //  3837: goto            3843
        //  3840: ldc_w           995641466
        //  3843: ldc_w           904374202
        //  3846: ixor           
        //  3847: lookupswitch {
        //          247459776: 3872
        //          1954928592: 3840
        //          default: 6195
        //        }
        //  3872: goto            3876
        //  3875: athrow         
        //  3876: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //  3879: goto            3883
        //  3882: athrow         
        //  3883: goto            3887
        //  3886: athrow         
        //  3887: invokevirtual   dev/nuker/pyro/f9U.c:(FF)I
        //  3890: goto            3894
        //  3893: athrow         
        //  3894: goto            3898
        //  3897: athrow         
        //  3898: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  3901: goto            3905
        //  3904: athrow         
        //  3905: aload           34
        //  3907: fload           29
        //  3909: getstatic       dev/nuker/pyro/fc.0:I
        //  3912: ifeq            3921
        //  3915: ldc_w           490599374
        //  3918: goto            3924
        //  3921: ldc_w           1521252270
        //  3924: ldc_w           188128586
        //  3927: ixor           
        //  3928: lookupswitch {
        //          193201023: 3921
        //          369847940: 6201
        //          default: 3956
        //        }
        //  3956: fload           36
        //  3958: fconst_2       
        //  3959: fmul           
        //  3960: fsub           
        //  3961: fconst_1       
        //  3962: fadd           
        //  3963: fload           31
        //  3965: fneg           
        //  3966: getstatic       dev/nuker/pyro/fc.1:I
        //  3969: ifeq            3978
        //  3972: ldc_w           -1533060817
        //  3975: goto            3981
        //  3978: ldc_w           1554894790
        //  3981: ldc_w           -1042475658
        //  3984: ixor           
        //  3985: lookupswitch {
        //          -1813726939: 3978
        //          1698843737: 6119
        //          default: 4012
        //        }
        //  4012: fload           30
        //  4014: fconst_2       
        //  4015: fmul           
        //  4016: fsub           
        //  4017: ldc_w           3.0
        //  4020: fadd           
        //  4021: aload_0        
        //  4022: aload           6
        //  4024: goto            4028
        //  4027: athrow         
        //  4028: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110138_aP:()F
        //  4031: goto            4035
        //  4034: athrow         
        //  4035: getstatic       dev/nuker/pyro/fc.1:I
        //  4038: ifeq            4047
        //  4041: ldc_w           -686965639
        //  4044: goto            4050
        //  4047: ldc_w           24156632
        //  4050: ldc_w           -1289777958
        //  4053: ixor           
        //  4054: lookupswitch {
        //          -226711894: 4047
        //          1678913699: 6247
        //          default: 4080
        //        }
        //  4080: aload           6
        //  4082: goto            4086
        //  4085: athrow         
        //  4086: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_110143_aJ:()F
        //  4089: goto            4093
        //  4092: athrow         
        //  4093: goto            4097
        //  4096: athrow         
        //  4097: invokevirtual   dev/nuker/pyro/f9U.c:(FF)I
        //  4100: goto            4104
        //  4103: athrow         
        //  4104: goto            4108
        //  4107: athrow         
        //  4108: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  4111: goto            4115
        //  4114: athrow         
        //  4115: goto            4119
        //  4118: athrow         
        //  4119: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  4122: goto            4126
        //  4125: athrow         
        //  4126: aload           6
        //  4128: goto            4132
        //  4131: athrow         
        //  4132: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184193_aE:()Ljava/lang/Iterable;
        //  4135: goto            4139
        //  4138: athrow         
        //  4139: goto            4143
        //  4142: athrow         
        //  4143: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  4148: goto            4152
        //  4151: athrow         
        //  4152: astore          33
        //  4154: new             Ljava/util/ArrayList;
        //  4157: dup            
        //  4158: goto            4162
        //  4161: athrow         
        //  4162: invokespecial   java/util/ArrayList.<init>:()V
        //  4165: goto            4169
        //  4168: athrow         
        //  4169: astore          34
        //  4171: aload           34
        //  4173: aload           6
        //  4175: goto            4179
        //  4178: athrow         
        //  4179: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184592_cb:()Lnet/minecraft/item/ItemStack;
        //  4182: goto            4186
        //  4185: athrow         
        //  4186: goto            4190
        //  4189: athrow         
        //  4190: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4193: goto            4197
        //  4196: athrow         
        //  4197: pop            
        //  4198: aload           33
        //  4200: goto            4204
        //  4203: athrow         
        //  4204: invokeinterface java/util/Iterator.hasNext:()Z
        //  4209: goto            4213
        //  4212: athrow         
        //  4213: ifeq            4405
        //  4216: aload           33
        //  4218: getstatic       dev/nuker/pyro/fc.c:I
        //  4221: ifge            4230
        //  4224: ldc_w           -2031674369
        //  4227: goto            4233
        //  4230: ldc_w           1226928292
        //  4233: ldc_w           -1829548735
        //  4236: ixor           
        //  4237: lookupswitch {
        //          -606978587: 4264
        //          336877246: 4230
        //          default: 6131
        //        }
        //  4264: goto            4268
        //  4267: athrow         
        //  4268: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4273: goto            4277
        //  4276: athrow         
        //  4277: checkcast       Lnet/minecraft/item/ItemStack;
        //  4280: getstatic       dev/nuker/pyro/fc.c:I
        //  4283: ifge            4292
        //  4286: ldc_w           1282774919
        //  4289: goto            4295
        //  4292: ldc_w           -1839486464
        //  4295: ldc_w           1058033790
        //  4298: ixor           
        //  4299: lookupswitch {
        //          -720965810: 4292
        //          1936050169: 6249
        //          default: 4324
        //        }
        //  4324: astore          35
        //  4326: aload           35
        //  4328: goto            4332
        //  4331: athrow         
        //  4332: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  4335: goto            4339
        //  4338: athrow         
        //  4339: ifne            4402
        //  4342: aload           34
        //  4344: getstatic       dev/nuker/pyro/fc.0:I
        //  4347: ifeq            4356
        //  4350: ldc_w           690242625
        //  4353: goto            4359
        //  4356: ldc_w           1014573044
        //  4359: ldc_w           -477907867
        //  4362: ixor           
        //  4363: lookupswitch {
        //          -894963676: 4356
        //          -537226351: 4388
        //          default: 6231
        //        }
        //  4388: aload           35
        //  4390: goto            4394
        //  4393: athrow         
        //  4394: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4397: goto            4401
        //  4400: athrow         
        //  4401: pop            
        //  4402: goto            4198
        //  4405: aload           34
        //  4407: getstatic       dev/nuker/pyro/fc.1:I
        //  4410: ifeq            4419
        //  4413: ldc_w           703931556
        //  4416: goto            4422
        //  4419: ldc_w           -488323760
        //  4422: ldc_w           1214583359
        //  4425: ixor           
        //  4426: lookupswitch {
        //          -257338102: 4419
        //          1636841115: 6169
        //          default: 4452
        //        }
        //  4452: aload           6
        //  4454: goto            4458
        //  4457: athrow         
        //  4458: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  4461: goto            4465
        //  4464: athrow         
        //  4465: goto            4469
        //  4468: athrow         
        //  4469: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4472: goto            4476
        //  4475: athrow         
        //  4476: pop            
        //  4477: aload           34
        //  4479: goto            4483
        //  4482: athrow         
        //  4483: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //  4486: goto            4490
        //  4489: athrow         
        //  4490: getstatic       dev/nuker/pyro/fc.c:I
        //  4493: ifge            4502
        //  4496: ldc_w           -285422111
        //  4499: goto            4505
        //  4502: ldc_w           -29890983
        //  4505: ldc_w           -462109162
        //  4508: ixor           
        //  4509: lookupswitch {
        //          176688119: 4502
        //          440606799: 4536
        //          default: 6227
        //        }
        //  4536: aload           34
        //  4538: goto            4542
        //  4541: athrow         
        //  4542: invokevirtual   java/util/ArrayList.size:()I
        //  4545: goto            4549
        //  4548: athrow         
        //  4549: bipush          8
        //  4551: imul           
        //  4552: ineg           
        //  4553: getstatic       dev/nuker/pyro/fc.c:I
        //  4556: ifge            4565
        //  4559: ldc_w           1078439972
        //  4562: goto            4568
        //  4565: ldc_w           2072411686
        //  4568: ldc_w           1487341210
        //  4571: ixor           
        //  4572: lookupswitch {
        //          417380030: 4565
        //          589396156: 4600
        //          default: 6171
        //        }
        //  4600: istore          35
        //  4602: aload_0        
        //  4603: getstatic       dev/nuker/pyro/fc.1:I
        //  4606: ifeq            4615
        //  4609: ldc_w           1183506025
        //  4612: goto            4618
        //  4615: ldc_w           1601062298
        //  4618: ldc_w           -2037289757
        //  4621: ixor           
        //  4622: lookupswitch {
        //          -1071926646: 6257
        //          877271252: 4615
        //          default: 4648
        //        }
        //  4648: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  4651: goto            4655
        //  4654: athrow         
        //  4655: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  4658: goto            4662
        //  4661: athrow         
        //  4662: getstatic       dev/nuker/pyro/fc.c:I
        //  4665: ifge            4674
        //  4668: ldc_w           1373269630
        //  4671: goto            4677
        //  4674: ldc_w           -857974638
        //  4677: ldc_w           -442698929
        //  4680: ixor           
        //  4681: lookupswitch {
        //          -1270440655: 6213
        //          -582395298: 4674
        //          default: 4708
        //        }
        //  4708: getstatic       dev/nuker/pyro/f9S.1:Ldev/nuker/pyro/f9S;
        //  4711: if_acmpne       4720
        //  4714: ldc_w           -1384217920
        //  4717: goto            4723
        //  4720: ldc_w           -1384217919
        //  4723: ldc_w           1789255168
        //  4726: ixor           
        //  4727: tableswitch {
        //          -1883850368: 4748
        //          -1883850367: 4753
        //          default: 4714
        //        }
        //  4748: bipush          -16
        //  4750: goto            4834
        //  4753: aload_0        
        //  4754: getfield        dev/nuker/pyro/f9U.c:Ldev/nuker/pyro/f0f;
        //  4757: goto            4761
        //  4760: athrow         
        //  4761: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  4764: goto            4768
        //  4767: athrow         
        //  4768: getstatic       dev/nuker/pyro/f9T.1:Ldev/nuker/pyro/f9T;
        //  4771: if_acmpne       4827
        //  4774: getstatic       dev/nuker/pyro/fc.1:I
        //  4777: ifeq            4786
        //  4780: ldc_w           -339367103
        //  4783: goto            4789
        //  4786: ldc_w           -2034290161
        //  4789: ldc_w           -1377611337
        //  4792: ixor           
        //  4793: lookupswitch {
        //          727475128: 4820
        //          1176959734: 4786
        //          default: 6103
        //        }
        //  4820: fload           30
        //  4822: fconst_2       
        //  4823: fmul           
        //  4824: goto            4829
        //  4827: fload           30
        //  4829: f2i            
        //  4830: ineg           
        //  4831: bipush          16
        //  4833: isub           
        //  4834: istore          36
        //  4836: iconst_0       
        //  4837: istore          37
        //  4839: getstatic       dev/nuker/pyro/fc.0:I
        //  4842: ifeq            4851
        //  4845: ldc_w           1449590019
        //  4848: goto            4854
        //  4851: ldc_w           -1760973325
        //  4854: ldc_w           -137684494
        //  4857: ixor           
        //  4858: lookupswitch {
        //          -1582439183: 4851
        //          1623372801: 4884
        //          default: 6147
        //        }
        //  4884: aload_0        
        //  4885: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  4888: goto            4892
        //  4891: athrow         
        //  4892: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  4895: goto            4899
        //  4898: athrow         
        //  4899: getstatic       dev/nuker/pyro/fc.1:I
        //  4902: ifeq            4911
        //  4905: ldc_w           1336938825
        //  4908: goto            4914
        //  4911: ldc_w           -889212482
        //  4914: ldc_w           -1858005790
        //  4917: ixor           
        //  4918: lookupswitch {
        //          -554629717: 4911
        //          1539220828: 4944
        //          default: 6163
        //        }
        //  4944: getstatic       dev/nuker/pyro/f9S.c:Ldev/nuker/pyro/f9S;
        //  4947: if_acmpne       5250
        //  4950: getstatic       dev/nuker/pyro/fc.c:I
        //  4953: ifge            4962
        //  4956: ldc_w           -1571001636
        //  4959: goto            4965
        //  4962: ldc_w           2098280275
        //  4965: ldc_w           -1561741479
        //  4968: ixor           
        //  4969: lookupswitch {
        //          -1092464001: 4962
        //          11918725: 6233
        //          default: 4996
        //        }
        //  4996: aload           34
        //  4998: goto            5002
        //  5001: athrow         
        //  5002: invokevirtual   java/util/ArrayList.stream:()Ljava/util/stream/Stream;
        //  5005: goto            5009
        //  5008: athrow         
        //  5009: invokedynamic   BootstrapMethod #3, applyAsInt:()Ljava/util/function/ToIntFunction;
        //  5014: goto            5018
        //  5017: athrow         
        //  5018: invokestatic    java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
        //  5021: goto            5025
        //  5024: athrow         
        //  5025: goto            5029
        //  5028: athrow         
        //  5029: invokeinterface java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
        //  5034: goto            5038
        //  5037: athrow         
        //  5038: invokedynamic   BootstrapMethod #4, apply:()Ljava/util/function/Function;
        //  5043: goto            5047
        //  5046: athrow         
        //  5047: invokevirtual   java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;
        //  5050: goto            5054
        //  5053: athrow         
        //  5054: iconst_0       
        //  5055: goto            5059
        //  5058: athrow         
        //  5059: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5062: goto            5066
        //  5065: athrow         
        //  5066: getstatic       dev/nuker/pyro/fc.1:I
        //  5069: ifeq            5078
        //  5072: ldc_w           -2140153415
        //  5075: goto            5081
        //  5078: ldc_w           -724067072
        //  5081: ldc_w           -439603100
        //  5084: ixor           
        //  5085: lookupswitch {
        //          823897444: 5112
        //          1705241053: 5078
        //          default: 6187
        //        }
        //  5112: goto            5116
        //  5115: athrow         
        //  5116: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5119: goto            5123
        //  5122: athrow         
        //  5123: checkcast       Ljava/lang/Integer;
        //  5126: goto            5130
        //  5129: athrow         
        //  5130: invokevirtual   java/lang/Integer.intValue:()I
        //  5133: goto            5137
        //  5136: athrow         
        //  5137: getstatic       dev/nuker/pyro/fc.c:I
        //  5140: ifge            5149
        //  5143: ldc_w           83314598
        //  5146: goto            5152
        //  5149: ldc_w           889662413
        //  5152: ldc_w           697687955
        //  5155: ixor           
        //  5156: lookupswitch {
        //          -1558232127: 5149
        //          761436213: 6133
        //          default: 5184
        //        }
        //  5184: istore          38
        //  5186: iload           38
        //  5188: ifge            5194
        //  5191: iconst_0       
        //  5192: istore          38
        //  5194: iload           36
        //  5196: iload           38
        //  5198: iconst_4       
        //  5199: imul           
        //  5200: isub           
        //  5201: getstatic       dev/nuker/pyro/fc.1:I
        //  5204: ifeq            5213
        //  5207: ldc_w           -123587558
        //  5210: goto            5216
        //  5213: ldc_w           1738672888
        //  5216: ldc_w           578731698
        //  5219: ixor           
        //  5220: lookupswitch {
        //          -623080792: 6125
        //          759106082: 5213
        //          default: 5248
        //        }
        //  5248: istore          36
        //  5250: aload           34
        //  5252: goto            5256
        //  5255: athrow         
        //  5256: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  5259: goto            5263
        //  5262: athrow         
        //  5263: astore          38
        //  5265: getstatic       dev/nuker/pyro/fc.c:I
        //  5268: ifge            5277
        //  5271: ldc_w           -810401696
        //  5274: goto            5280
        //  5277: ldc_w           -529761011
        //  5280: ldc_w           2014204905
        //  5283: ixor           
        //  5284: lookupswitch {
        //          -1212410999: 6151
        //          1771318504: 5277
        //          default: 5312
        //        }
        //  5312: aload           38
        //  5314: getstatic       dev/nuker/pyro/fc.c:I
        //  5317: ifge            5326
        //  5320: ldc_w           -2144393408
        //  5323: goto            5329
        //  5326: ldc_w           707920930
        //  5329: ldc_w           1916026845
        //  5332: ixor           
        //  5333: lookupswitch {
        //          -233105251: 5326
        //          1476803583: 5360
        //          default: 6155
        //        }
        //  5360: goto            5364
        //  5363: athrow         
        //  5364: invokeinterface java/util/Iterator.hasNext:()Z
        //  5369: goto            5373
        //  5372: athrow         
        //  5373: ifeq            5382
        //  5376: ldc_w           -22600817
        //  5379: goto            5385
        //  5382: ldc_w           -22600818
        //  5385: ldc_w           854036217
        //  5388: ixor           
        //  5389: tableswitch {
        //          -1736353044: 5412
        //          -1736353043: 5949
        //          default: 5376
        //        }
        //  5412: aload           38
        //  5414: goto            5418
        //  5417: athrow         
        //  5418: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  5423: goto            5427
        //  5426: athrow         
        //  5427: checkcast       Lnet/minecraft/item/ItemStack;
        //  5430: astore          39
        //  5432: aload_0        
        //  5433: aload           39
        //  5435: iload           35
        //  5437: iload           36
        //  5439: iload           37
        //  5441: goto            5445
        //  5444: athrow         
        //  5445: invokevirtual   dev/nuker/pyro/f9U.c:(Lnet/minecraft/item/ItemStack;III)V
        //  5448: goto            5452
        //  5451: athrow         
        //  5452: goto            5456
        //  5455: athrow         
        //  5456: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  5459: goto            5463
        //  5462: athrow         
        //  5463: ldc_w           0.5
        //  5466: ldc_w           0.5
        //  5469: ldc_w           0.5
        //  5472: getstatic       dev/nuker/pyro/fc.0:I
        //  5475: ifeq            5484
        //  5478: ldc_w           1720702229
        //  5481: goto            5487
        //  5484: ldc_w           -1902161197
        //  5487: ldc_w           -272667241
        //  5490: ixor           
        //  5491: lookupswitch {
        //          -1993295742: 5484
        //          1629503300: 5516
        //          default: 6107
        //        }
        //  5516: goto            5520
        //  5519: athrow         
        //  5520: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179152_a:(FFF)V
        //  5523: goto            5527
        //  5526: athrow         
        //  5527: aload_0        
        //  5528: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  5531: goto            5535
        //  5534: athrow         
        //  5535: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  5538: goto            5542
        //  5541: athrow         
        //  5542: getstatic       dev/nuker/pyro/f9S.2:Ldev/nuker/pyro/f9S;
        //  5545: if_acmpeq       5791
        //  5548: aload_0        
        //  5549: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  5552: goto            5556
        //  5555: athrow         
        //  5556: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  5559: goto            5563
        //  5562: athrow         
        //  5563: getstatic       dev/nuker/pyro/f9S.0:Ldev/nuker/pyro/f9S;
        //  5566: if_acmpne       5683
        //  5569: aload           39
        //  5571: getstatic       dev/nuker/pyro/fc.c:I
        //  5574: ifge            5583
        //  5577: ldc_w           871519129
        //  5580: goto            5586
        //  5583: ldc_w           1866697834
        //  5586: ldc_w           -981411242
        //  5589: ixor           
        //  5590: lookupswitch {
        //          -1430038980: 5616
        //          -160265777: 5583
        //          default: 6199
        //        }
        //  5616: goto            5620
        //  5619: athrow         
        //  5620: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //  5623: goto            5627
        //  5626: athrow         
        //  5627: goto            5631
        //  5630: athrow         
        //  5631: invokeinterface java/util/Map.size:()I
        //  5636: goto            5640
        //  5639: athrow         
        //  5640: istore          40
        //  5642: aload_0        
        //  5643: aload           39
        //  5645: iload           35
        //  5647: iload           36
        //  5649: iconst_2       
        //  5650: imul           
        //  5651: iload           40
        //  5653: iconst_4       
        //  5654: if_icmple       5667
        //  5657: iload           40
        //  5659: iconst_4       
        //  5660: isub           
        //  5661: bipush          8
        //  5663: imul           
        //  5664: goto            5668
        //  5667: iconst_0       
        //  5668: isub           
        //  5669: goto            5673
        //  5672: athrow         
        //  5673: invokevirtual   dev/nuker/pyro/f9U.1:(Lnet/minecraft/item/ItemStack;II)V
        //  5676: goto            5680
        //  5679: athrow         
        //  5680: goto            5791
        //  5683: aload_0        
        //  5684: getstatic       dev/nuker/pyro/fc.1:I
        //  5687: ifeq            5696
        //  5690: ldc_w           -8187540
        //  5693: goto            5699
        //  5696: ldc_w           -2059850004
        //  5699: ldc_w           1821517485
        //  5702: ixor           
        //  5703: lookupswitch {
        //          -1827588159: 5696
        //          -374667199: 5728
        //          default: 6111
        //        }
        //  5728: aload           39
        //  5730: iload           35
        //  5732: iload           36
        //  5734: iconst_2       
        //  5735: imul           
        //  5736: getstatic       dev/nuker/pyro/fc.0:I
        //  5739: ifeq            5748
        //  5742: ldc_w           -1587883294
        //  5745: goto            5751
        //  5748: ldc_w           257645163
        //  5751: ldc_w           -1511973672
        //  5754: ixor           
        //  5755: lookupswitch {
        //          -1430632781: 5780
        //          79416890: 5748
        //          default: 6157
        //        }
        //  5780: goto            5784
        //  5783: athrow         
        //  5784: invokevirtual   dev/nuker/pyro/f9U.1:(Lnet/minecraft/item/ItemStack;II)V
        //  5787: goto            5791
        //  5790: athrow         
        //  5791: goto            5795
        //  5794: athrow         
        //  5795: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  5798: goto            5802
        //  5801: athrow         
        //  5802: aload_0        
        //  5803: aload           39
        //  5805: iload           35
        //  5807: aload_0        
        //  5808: getfield        dev/nuker/pyro/f9U.0:Ldev/nuker/pyro/f0f;
        //  5811: getstatic       dev/nuker/pyro/fc.1:I
        //  5814: ifeq            5823
        //  5817: ldc_w           1261248933
        //  5820: goto            5826
        //  5823: ldc_w           720237744
        //  5826: ldc_w           201425316
        //  5829: ixor           
        //  5830: lookupswitch {
        //          -1869442998: 5823
        //          1194106881: 6255
        //          default: 5856
        //        }
        //  5856: goto            5860
        //  5859: athrow         
        //  5860: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  5863: goto            5867
        //  5866: athrow         
        //  5867: getstatic       dev/nuker/pyro/f9S.0:Ldev/nuker/pyro/f9S;
        //  5870: if_acmpne       5928
        //  5873: getstatic       dev/nuker/pyro/fc.1:I
        //  5876: ifeq            5885
        //  5879: ldc_w           595167980
        //  5882: goto            5888
        //  5885: ldc_w           -829497080
        //  5888: ldc_w           -1419379803
        //  5891: ixor           
        //  5892: lookupswitch {
        //          -2011401911: 6161
        //          2120524172: 5885
        //          default: 5920
        //        }
        //  5920: iload           36
        //  5922: bipush          16
        //  5924: iadd           
        //  5925: goto            5932
        //  5928: iload           36
        //  5930: iconst_2       
        //  5931: isub           
        //  5932: goto            5936
        //  5935: athrow         
        //  5936: invokevirtual   dev/nuker/pyro/f9U.0:(Lnet/minecraft/item/ItemStack;II)V
        //  5939: goto            5943
        //  5942: athrow         
        //  5943: iinc            35, 16
        //  5946: goto            5265
        //  5949: goto            5953
        //  5952: athrow         
        //  5953: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  5956: goto            5960
        //  5959: athrow         
        //  5960: goto            5964
        //  5963: athrow         
        //  5964: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //  5967: goto            5971
        //  5970: athrow         
        //  5971: goto            5975
        //  5974: athrow         
        //  5975: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //  5978: goto            5982
        //  5981: athrow         
        //  5982: goto            5986
        //  5985: athrow         
        //  5986: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179113_r:()V
        //  5989: goto            5993
        //  5992: athrow         
        //  5993: fconst_1       
        //  5994: ldc_w           1500000.0
        //  5997: goto            6001
        //  6000: athrow         
        //  6001: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179136_a:(FF)V
        //  6004: goto            6008
        //  6007: athrow         
        //  6008: goto            6012
        //  6011: athrow         
        //  6012: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  6015: goto            6019
        //  6018: athrow         
        //  6019: aload           7
        //  6021: dload           17
        //  6023: putfield        net/minecraft/entity/Entity.field_70165_t:D
        //  6026: aload           7
        //  6028: getstatic       dev/nuker/pyro/fc.c:I
        //  6031: ifge            6040
        //  6034: ldc_w           -1434584805
        //  6037: goto            6043
        //  6040: ldc_w           -1662570107
        //  6043: ldc_w           1954606823
        //  6046: ixor           
        //  6047: lookupswitch {
        //          -553838596: 6040
        //          -395845790: 6072
        //          default: 6197
        //        }
        //  6072: dload           19
        //  6074: putfield        net/minecraft/entity/Entity.field_70163_u:D
        //  6077: aload           7
        //  6079: dload           21
        //  6081: putfield        net/minecraft/entity/Entity.field_70161_v:D
        //  6084: goto            42
        //  6087: goto            6091
        //  6090: athrow         
        //  6091: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //  6094: goto            6098
        //  6097: athrow         
        //  6098: return         
        //  6099: aconst_null    
        //  6100: athrow         
        //  6101: aconst_null    
        //  6102: athrow         
        //  6103: aconst_null    
        //  6104: athrow         
        //  6105: aconst_null    
        //  6106: athrow         
        //  6107: aconst_null    
        //  6108: athrow         
        //  6109: aconst_null    
        //  6110: athrow         
        //  6111: aconst_null    
        //  6112: athrow         
        //  6113: aconst_null    
        //  6114: athrow         
        //  6115: aconst_null    
        //  6116: athrow         
        //  6117: aconst_null    
        //  6118: athrow         
        //  6119: aconst_null    
        //  6120: athrow         
        //  6121: aconst_null    
        //  6122: athrow         
        //  6123: aconst_null    
        //  6124: athrow         
        //  6125: aconst_null    
        //  6126: athrow         
        //  6127: aconst_null    
        //  6128: athrow         
        //  6129: aconst_null    
        //  6130: athrow         
        //  6131: aconst_null    
        //  6132: athrow         
        //  6133: aconst_null    
        //  6134: athrow         
        //  6135: aconst_null    
        //  6136: athrow         
        //  6137: aconst_null    
        //  6138: athrow         
        //  6139: aconst_null    
        //  6140: athrow         
        //  6141: aconst_null    
        //  6142: athrow         
        //  6143: aconst_null    
        //  6144: athrow         
        //  6145: aconst_null    
        //  6146: athrow         
        //  6147: aconst_null    
        //  6148: athrow         
        //  6149: aconst_null    
        //  6150: athrow         
        //  6151: aconst_null    
        //  6152: athrow         
        //  6153: aconst_null    
        //  6154: athrow         
        //  6155: aconst_null    
        //  6156: athrow         
        //  6157: aconst_null    
        //  6158: athrow         
        //  6159: aconst_null    
        //  6160: athrow         
        //  6161: aconst_null    
        //  6162: athrow         
        //  6163: aconst_null    
        //  6164: athrow         
        //  6165: aconst_null    
        //  6166: athrow         
        //  6167: aconst_null    
        //  6168: athrow         
        //  6169: aconst_null    
        //  6170: athrow         
        //  6171: aconst_null    
        //  6172: athrow         
        //  6173: aconst_null    
        //  6174: athrow         
        //  6175: aconst_null    
        //  6176: athrow         
        //  6177: aconst_null    
        //  6178: athrow         
        //  6179: aconst_null    
        //  6180: athrow         
        //  6181: aconst_null    
        //  6182: athrow         
        //  6183: aconst_null    
        //  6184: athrow         
        //  6185: aconst_null    
        //  6186: athrow         
        //  6187: aconst_null    
        //  6188: athrow         
        //  6189: aconst_null    
        //  6190: athrow         
        //  6191: aconst_null    
        //  6192: athrow         
        //  6193: aconst_null    
        //  6194: athrow         
        //  6195: aconst_null    
        //  6196: athrow         
        //  6197: aconst_null    
        //  6198: athrow         
        //  6199: aconst_null    
        //  6200: athrow         
        //  6201: aconst_null    
        //  6202: athrow         
        //  6203: aconst_null    
        //  6204: athrow         
        //  6205: aconst_null    
        //  6206: athrow         
        //  6207: aconst_null    
        //  6208: athrow         
        //  6209: aconst_null    
        //  6210: athrow         
        //  6211: aconst_null    
        //  6212: athrow         
        //  6213: aconst_null    
        //  6214: athrow         
        //  6215: aconst_null    
        //  6216: athrow         
        //  6217: aconst_null    
        //  6218: athrow         
        //  6219: aconst_null    
        //  6220: athrow         
        //  6221: aconst_null    
        //  6222: athrow         
        //  6223: aconst_null    
        //  6224: athrow         
        //  6225: aconst_null    
        //  6226: athrow         
        //  6227: aconst_null    
        //  6228: athrow         
        //  6229: aconst_null    
        //  6230: athrow         
        //  6231: aconst_null    
        //  6232: athrow         
        //  6233: aconst_null    
        //  6234: athrow         
        //  6235: aconst_null    
        //  6236: athrow         
        //  6237: aconst_null    
        //  6238: athrow         
        //  6239: aconst_null    
        //  6240: athrow         
        //  6241: aconst_null    
        //  6242: athrow         
        //  6243: aconst_null    
        //  6244: athrow         
        //  6245: aconst_null    
        //  6246: athrow         
        //  6247: aconst_null    
        //  6248: athrow         
        //  6249: aconst_null    
        //  6250: athrow         
        //  6251: aconst_null    
        //  6252: athrow         
        //  6253: aconst_null    
        //  6254: athrow         
        //  6255: aconst_null    
        //  6256: athrow         
        //  6257: aconst_null    
        //  6258: athrow         
        //  6259: aconst_null    
        //  6260: athrow         
        //  6261: pop            
        //  6262: goto            24
        //  6265: pop            
        //  6266: aconst_null    
        //  6267: goto            6261
        //  6270: dup            
        //  6271: ifnull          6261
        //  6274: checkcast       Ljava/lang/Throwable;
        //  6277: athrow         
        //  6278: dup            
        //  6279: ifnull          6265
        //  6282: checkcast       Ljava/lang/Throwable;
        //  6285: athrow         
        //  6286: aconst_null    
        //  6287: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 01 16 00 00 03 30 00 00
        //    StackMapTable: 03 48 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FE 00 03 07 00 03 07 03 53 02 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 03 53 02 00 01 07 01 F1 47 07 00 34 40 07 01 11 FC 00 00 07 01 11 43 07 00 34 40 07 01 11 47 07 00 34 40 01 4F 07 01 11 FF 00 02 00 04 07 00 03 07 03 53 02 07 01 11 00 02 07 01 11 01 5C 07 01 11 42 07 00 29 40 07 01 11 47 07 00 34 40 07 00 DD FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 04 07 00 03 07 03 53 02 07 01 11 00 01 07 00 EC 45 07 00 34 40 01 4B 01 FF 00 02 00 04 07 00 03 07 03 53 02 07 01 11 00 02 01 01 5D 01 FF 00 0D 00 00 00 01 07 00 34 FF 00 00 00 05 07 00 03 07 03 53 02 07 01 11 01 00 02 07 02 87 01 45 07 00 34 40 07 01 CE FC 00 06 07 01 CE 05 42 01 19 07 05 42 01 1A 02 FF 00 16 00 07 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 00 01 07 01 C8 FF 00 02 00 07 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 00 02 07 01 C8 01 5E 07 01 C8 42 07 00 17 40 07 01 C8 45 07 00 34 40 07 01 CE 4B 07 01 CE FF 00 02 00 07 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 00 02 07 01 CE 01 5D 07 01 CE FC 00 0D 07 01 CE 42 01 1E 45 07 00 11 FF 00 00 00 08 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 00 02 07 00 36 02 45 07 00 34 40 07 03 53 FD 00 14 07 03 53 03 42 01 1D FC 00 16 03 42 01 1D 4D 07 03 53 FF 00 02 00 0B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 00 02 07 03 53 01 5E 07 03 53 4E 03 FF 00 02 00 0B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 00 02 03 01 5D 03 FF 00 0F 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 01 03 FF 00 02 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 02 03 01 5C 03 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 02 03 07 00 36 45 07 00 34 FF 00 00 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 02 03 01 42 03 45 03 FF 00 02 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 02 03 01 5A 03 43 03 FF 00 02 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 02 03 03 FF 00 08 00 0D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 00 01 07 00 34 FF 00 00 00 0D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 00 02 07 01 CE 02 45 07 00 34 40 07 03 53 4F 07 01 CE FF 00 02 00 0D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 00 02 07 01 CE 01 5C 07 01 CE FF 00 15 00 0E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 00 01 03 FF 00 02 00 0E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 00 02 03 01 5E 03 FF 00 20 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 01 07 01 CE FF 00 02 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 01 5F 07 01 CE FF 00 10 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 FF 00 02 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 03 07 01 CE 03 01 FF 00 1F 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 0E 42 01 1D FF 00 12 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 FF 00 02 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 03 07 01 CE 03 01 FF 00 1D 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 50 07 01 CE FF 00 02 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 01 5F 07 01 CE 48 07 00 19 FF 00 00 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 04 07 01 CE 03 03 03 45 07 00 34 40 03 50 03 FF 00 02 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 03 01 5E 03 FC 00 0D 03 42 01 1E 06 05 42 01 1B 49 07 00 34 FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 03 07 02 04 45 07 00 34 FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 03 07 00 DD 45 07 00 34 FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 03 07 03 9B 45 07 00 34 FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 03 03 09 42 07 00 34 00 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 42 07 00 2B 00 45 07 00 34 00 FF 00 0F 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 02 02 FF 00 02 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 03 02 02 01 FF 00 1D 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 02 02 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 02 02 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 0B 42 01 1E 4E 02 FF 00 02 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 02 01 5D 02 4C 07 00 2B FF 00 00 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 03 02 02 02 45 07 00 34 00 4F 07 01 C8 FF 00 02 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 07 01 C8 01 5F 07 01 C8 42 07 00 34 40 07 01 C8 45 07 00 34 40 07 03 D0 4B 07 03 D0 FF 00 02 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 07 03 D0 01 5D 07 03 D0 FF 00 13 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 01 07 00 34 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 04 02 02 02 02 45 07 00 34 00 0B 42 01 1C 46 07 00 34 40 07 01 C8 45 07 00 34 40 07 03 D0 56 02 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 02 02 02 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 04 02 02 02 02 45 07 00 34 00 4A 07 00 1B FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 03 03 03 03 45 07 00 34 00 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 00 45 07 00 34 00 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 00 45 07 00 34 00 4C 07 00 03 FF 00 02 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 02 07 00 03 01 5E 07 00 03 44 07 00 34 FF 00 00 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 02 07 00 03 07 00 36 45 07 00 34 40 07 00 DB 4B 07 00 DB FF 00 02 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 02 07 00 DB 01 5F 07 00 DB FF 00 06 00 15 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 00 01 07 00 34 40 07 00 DB 45 07 00 34 40 02 FF 00 06 00 16 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 00 01 07 00 34 00 45 07 00 34 40 02 FF 00 11 00 17 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 00 01 07 00 A5 FF 00 02 00 17 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 00 02 07 00 A5 01 5C 07 00 A5 42 07 00 34 40 07 00 A5 45 07 00 34 40 07 00 DD 0E 40 02 4B 02 FF 00 02 00 17 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 00 02 02 01 5D 02 FC 00 0D 02 42 01 1E FF 00 08 00 00 00 01 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 00 45 07 00 34 00 50 02 FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 02 01 5E 02 FF 00 17 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 02 02 FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 03 02 02 01 FF 00 1C 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 02 02 4B 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 05 02 02 02 02 01 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 0B 42 01 1D 56 07 00 19 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 05 07 00 DB 02 02 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 05 07 00 DB 02 02 07 00 03 02 44 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 45 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 42 07 00 19 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 45 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 04 07 00 DB 02 02 01 FF 00 0B 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 04 07 00 DB 02 02 01 FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 05 07 00 DB 02 02 01 01 FF 00 1D 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 04 07 00 DB 02 02 01 42 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 04 07 00 DB 02 02 01 45 07 00 34 00 4C 07 00 03 FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 07 00 03 01 5C 07 00 03 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 01 07 00 A5 45 07 00 34 40 07 00 DD 4B 07 00 DD FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 07 00 DD 01 5E 07 00 DD 11 42 01 1E 45 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 07 00 03 07 00 36 45 07 00 34 40 07 00 DB 4B 07 00 DB FF 00 02 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 07 00 DB 01 5E 07 00 DB FF 00 0E 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 00 01 07 00 03 FF 00 02 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 00 02 07 00 03 01 5D 07 00 03 44 07 00 34 FF 00 00 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 00 02 07 00 03 07 00 36 45 07 00 34 40 07 00 DB FF 00 06 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 00 01 07 00 34 40 07 00 DB 45 07 00 34 40 02 FC 00 0F 02 42 01 1C 44 07 00 23 40 07 00 DB 45 07 00 34 40 02 FC 00 0E 02 05 42 01 1A FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 08 0B 44 08 0B 44 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 01 5D 07 00 70 FF 00 0D 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 70 07 00 DB 01 FF 00 1E 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 42 07 00 19 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 FF 00 0E 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 76 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 70 07 00 76 01 FF 00 1E 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 76 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 76 45 07 00 34 40 07 00 70 FF 00 0D 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 70 07 00 DB 01 FF 00 1F 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 42 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB 45 07 00 34 40 07 00 70 4B 07 00 70 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 01 5D 07 00 70 42 07 00 19 40 07 00 70 45 07 00 34 40 07 00 DB FC 00 0D 07 00 DB 42 01 1F 44 07 00 34 40 07 00 DB 45 07 00 34 40 02 4D 02 FF 00 02 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 00 02 02 01 5D 02 FC 00 0D 02 42 01 1E 42 07 00 34 00 45 07 00 34 00 63 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 05 02 02 02 02 01 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 0B 42 01 1E FF 00 12 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 02 07 00 DB 02 FF 00 02 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 03 07 00 DB 02 01 FF 00 1D 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 02 07 00 DB 02 FF 00 18 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 04 07 00 DB 02 02 07 00 03 FF 00 02 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 05 07 00 DB 02 02 07 00 03 01 FF 00 1F 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 04 07 00 DB 02 02 07 00 03 FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 05 07 00 DB 02 02 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 05 07 00 DB 02 02 07 00 03 02 44 07 00 19 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 45 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 06 07 00 DB 02 02 07 00 03 02 02 42 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 06 07 00 DB 02 02 07 00 03 02 02 45 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 04 07 00 DB 02 02 01 42 07 00 2B FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 04 07 00 DB 02 02 01 45 07 00 34 00 F9 00 02 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 00 45 07 00 34 00 FF 00 26 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 02 02 02 02 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 02 02 02 02 01 FF 00 1F 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 02 02 02 02 48 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 02 02 02 02 01 45 07 00 34 00 42 07 00 17 00 45 07 00 34 00 FF 00 12 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 DB 02 01 FF 00 1D 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 51 07 00 19 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 02 FF 00 0D 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 07 07 00 DB 02 02 07 00 03 02 07 00 36 01 FF 00 1C 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 42 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 42 07 00 19 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 07 00 DB 02 02 01 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 07 00 DB 02 02 01 45 07 00 34 00 FF 00 0F 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 DB 02 01 FF 00 1F 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 FF 00 15 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 DB 02 02 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 07 00 DB 02 02 01 FF 00 1E 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 DB 02 02 4E 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 07 00 36 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 02 FF 00 0B 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 02 FF 00 02 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 01 FF 00 1D 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 02 44 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 02 45 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 07 00 DB 02 02 01 42 07 00 34 FF 00 00 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 07 00 DB 02 02 01 45 07 00 34 FF 00 00 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 00 42 07 00 34 00 45 07 00 34 00 44 07 00 34 40 07 00 36 45 07 00 34 40 07 04 74 42 07 00 0F 40 07 04 74 47 07 00 34 40 07 01 11 FF 00 08 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 00 01 07 00 34 FF 00 00 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 00 02 08 10 3A 08 10 3A 45 07 00 34 40 07 02 7A FF 00 08 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 01 07 00 34 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 36 45 07 00 34 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 F2 42 07 00 27 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 F2 45 07 00 34 40 01 00 44 07 00 21 40 07 01 11 47 07 00 34 40 01 50 07 01 11 FF 00 02 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 01 11 01 5E 07 01 11 42 07 00 34 40 07 01 11 47 07 00 34 40 07 00 DD 4E 07 00 F2 FF 00 02 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 00 F2 01 5C 07 00 F2 FF 00 06 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 07 00 F2 00 01 07 00 34 40 07 00 F2 45 07 00 34 40 01 50 07 02 7A FF 00 02 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 07 00 F2 00 02 07 02 7A 01 5C 07 02 7A 44 07 00 34 FF 00 00 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 07 00 F2 00 02 07 02 7A 07 00 F2 45 07 00 34 40 01 00 FA 00 02 4D 07 02 7A FF 00 02 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 01 5D 07 02 7A 44 07 00 13 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 36 45 07 00 34 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 F2 42 07 00 34 FF 00 00 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 07 02 7A 07 00 F2 45 07 00 34 40 01 45 07 00 34 40 07 02 7A 45 07 00 34 00 0B 42 01 1E 44 07 00 34 40 07 02 7A 45 07 00 34 40 01 4F 01 FF 00 02 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 02 01 01 5F 01 FF 00 0E 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 01 07 00 03 FF 00 02 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 02 07 00 03 01 5D 07 00 03 45 07 00 34 40 07 00 A5 45 07 00 34 40 07 00 DD 4B 07 00 DD FF 00 02 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 02 07 00 DD 01 5E 07 00 DD 05 05 42 01 18 04 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 01 07 00 A5 45 07 00 34 40 07 00 DD 11 42 01 1E 06 41 02 44 01 FD 00 10 01 01 42 01 1D 46 07 00 19 40 07 00 A5 45 07 00 34 40 07 00 DD 4B 07 00 DD FF 00 02 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 00 DD 01 5D 07 00 DD 11 42 01 1E FF 00 04 00 00 00 01 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 01 07 02 7A 45 07 00 34 40 07 02 A3 47 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 02 A3 07 05 17 45 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 02 A3 07 02 E6 42 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 02 A3 07 02 E6 47 07 00 34 40 07 04 CD 47 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 05 19 45 07 00 34 40 07 04 CD 43 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 01 45 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 00 EC FF 00 0B 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 00 EC FF 00 02 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 03 07 04 CD 07 00 EC 01 FF 00 1E 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 00 EC 42 07 00 34 FF 00 00 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 00 EC 45 07 00 34 40 07 00 DD 45 07 00 25 40 07 00 EC 45 07 00 34 40 01 4B 01 FF 00 02 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 01 01 5F 01 FC 00 09 01 52 01 FF 00 02 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 01 00 02 01 01 5F 01 FA 00 01 44 07 00 17 40 07 02 7A 45 07 00 34 40 07 01 11 FC 00 01 07 01 11 0B 42 01 1F 4D 07 01 11 FF 00 02 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 02 07 01 11 01 5E 07 01 11 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 01 07 01 11 47 07 00 34 40 01 02 05 42 01 1A 44 07 00 0F 40 07 01 11 47 07 00 34 40 07 00 DD FF 00 10 00 00 00 01 07 00 34 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 05 07 00 03 07 00 F2 01 01 01 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 FF 00 14 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 02 02 02 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 02 02 02 01 FF 00 1C 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 02 02 02 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 02 02 02 45 07 00 34 00 46 07 00 1D 40 07 00 A5 45 07 00 34 40 07 00 DD FF 00 0C 00 00 00 01 07 00 34 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 01 07 00 A5 45 07 00 34 40 07 00 DD 53 07 00 F2 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 02 07 00 F2 01 5D 07 00 F2 42 07 00 34 40 07 00 F2 45 07 00 34 40 07 00 E6 42 07 00 1D 40 07 00 E6 47 07 00 34 40 01 FF 00 1A 00 21 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 01 00 04 07 00 03 07 00 F2 01 01 FF 00 00 00 21 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 01 00 05 07 00 03 07 00 F2 01 01 01 43 07 00 34 FF 00 00 00 21 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 01 00 04 07 00 03 07 00 F2 01 01 45 07 00 34 00 FA 00 02 4C 07 00 03 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 02 07 00 03 01 5C 07 00 03 FF 00 13 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 05 07 00 03 07 00 F2 01 01 01 FF 00 1C 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 42 07 00 17 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 45 07 00 34 00 42 07 00 27 00 45 07 00 34 00 FF 00 14 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 07 00 A5 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 05 07 00 03 07 00 F2 01 07 00 A5 01 FF 00 1D 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 07 00 A5 42 07 00 34 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 07 00 A5 45 07 00 34 FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 07 00 DD FF 00 11 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 07 00 03 07 00 F2 01 FF 00 02 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 FF 00 1F 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 07 00 03 07 00 F2 01 FF 00 07 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 07 00 03 07 00 F2 01 FF 00 03 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 42 07 00 2B FF 00 00 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 45 07 00 34 00 FA 00 05 42 07 00 34 00 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 42 07 00 1B 00 45 07 00 34 00 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 00 45 07 00 34 00 46 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 02 02 02 45 07 00 34 00 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 00 45 07 00 34 00 54 07 01 CE FF 00 02 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 02 07 01 CE 01 5C 07 01 CE FF 00 0E 00 04 07 00 03 07 03 53 02 07 01 11 00 00 42 07 00 34 00 45 07 00 34 00 FF 00 00 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 00 FF 00 01 00 0C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 00 01 03 FF 00 01 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 00 FF 00 01 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 02 02 02 FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 02 02 02 FF 00 01 00 0B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 00 01 07 03 53 FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 01 07 00 03 FF 00 01 00 0D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 00 01 07 01 CE FF 00 01 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 01 07 03 D0 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 01 02 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 03 07 00 DB 02 02 FF 00 01 00 1A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 00 01 07 00 03 FA 00 01 FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 01 00 01 01 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 00 01 02 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 01 07 00 03 FF 00 01 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 01 07 01 11 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 01 01 FF 00 01 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 01 02 FF 00 01 00 0A 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 00 00 FF 00 01 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 00 FC 00 01 03 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 76 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 00 FF 00 01 00 0E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 00 01 03 FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 00 FF 00 01 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 01 07 00 03 FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 01 07 01 11 FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 01 FF 00 01 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 01 07 01 C8 FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 03 07 00 03 07 00 F2 01 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 01 07 00 DD FF 00 01 00 04 07 00 03 07 03 53 02 07 01 11 00 01 07 01 11 FF 00 01 00 17 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 00 01 02 FF 00 01 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 01 07 02 7A 41 01 FF 00 01 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 02 02 02 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 04 07 00 DB 02 02 01 FF 00 01 00 07 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 00 01 07 01 C8 FF 00 01 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 02 07 01 CE 03 FF 00 01 00 0B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 00 01 03 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 04 02 02 02 02 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 02 07 04 CD 07 00 EC FF 00 01 00 18 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 00 00 FF 00 01 00 11 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 00 00 FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 00 00 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 06 07 00 DB 02 02 07 00 03 02 07 00 36 FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 00 01 07 01 CE FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 01 07 00 F2 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 FF 00 01 00 04 07 00 03 07 03 53 02 07 01 11 00 01 01 FF 00 01 00 0B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 00 00 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 01 07 00 70 FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 02 07 00 DB 02 01 FF 00 01 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 01 07 00 DD F8 00 01 FF 00 01 00 17 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 00 01 07 00 A5 FF 00 01 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 00 00 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 01 07 00 DB FF 00 01 00 1F 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 07 00 DB 02 00 04 07 00 DB 02 02 07 00 03 FF 00 01 00 07 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 00 01 07 01 CE FF 00 01 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 00 FF 00 01 00 08 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 00 00 FF 00 01 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 07 00 F2 00 01 07 02 7A FF 00 01 00 1E 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 00 00 FF 00 01 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 01 07 00 DB FF 00 01 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 DB 02 FF 00 01 00 10 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 00 01 07 01 CE 41 07 01 CE FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 02 07 00 70 07 00 DB FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 05 07 00 DB 02 02 07 00 03 02 FF 00 01 00 1B 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 00 01 07 00 F2 FF 00 01 00 1D 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 00 DB 07 00 DB 02 02 00 01 07 00 70 FF 00 01 00 14 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 00 00 FF 00 01 00 20 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 01 01 07 01 11 07 00 F2 00 04 07 00 03 07 00 F2 01 07 00 A5 FF 00 01 00 1C 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 07 01 11 07 02 7A 01 00 01 07 00 03 FF 00 01 00 19 07 00 03 07 03 53 02 07 01 11 01 07 01 CE 07 00 36 07 01 CE 07 03 53 03 03 03 03 03 03 03 03 02 02 02 07 00 DB 02 02 02 02 00 01 07 00 DD FF 00 01 00 03 07 00 03 07 03 53 02 00 01 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     6270   6278   Any
        //  6270   6278   6270   6278   Any
        //  6286   6288   3      8      Any
        //  32     40     40     41     Any
        //  32     40     40     41     Ljava/lang/ArithmeticException;
        //  32     40     3      8      Ljava/lang/ClassCastException;
        //  32     40     3      8      Ljava/lang/UnsupportedOperationException;
        //  32     40     40     41     Ljava/lang/NegativeArraySizeException;
        //  46     55     55     56     Any
        //  47     55     46     47     Any
        //  47     55     46     47     Ljava/lang/AssertionError;
        //  46     55     55     56     Ljava/lang/UnsupportedOperationException;
        //  47     55     3      8      Any
        //  107    116    116    117    Any
        //  107    116    3      8      Any
        //  107    116    3      8      Ljava/lang/RuntimeException;
        //  108    116    107    108    Ljava/lang/EnumConstantNotPresentException;
        //  108    116    3      8      Ljava/lang/ArithmeticException;
        //  124    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  191    197    197    198    Any
        //  191    197    197    198    Any
        //  191    197    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  191    197    197    198    Ljava/util/ConcurrentModificationException;
        //  191    197    3      8      Any
        //  347    354    354    355    Any
        //  347    354    354    355    Any
        //  348    354    3      8      Any
        //  348    354    354    355    Any
        //  348    354    347    348    Ljava/lang/UnsupportedOperationException;
        //  454    461    461    462    Any
        //  454    461    3      8      Any
        //  455    461    461    462    Any
        //  454    461    454    455    Ljava/lang/NumberFormatException;
        //  454    461    461    462    Any
        //  722    728    728    729    Any
        //  722    728    728    729    Any
        //  722    728    3      8      Any
        //  722    728    728    729    Any
        //  722    728    728    729    Ljava/util/NoSuchElementException;
        //  784    791    791    792    Any
        //  785    791    784    785    Any
        //  784    791    791    792    Any
        //  784    791    791    792    Ljava/lang/IllegalStateException;
        //  785    791    791    792    Ljava/lang/IllegalStateException;
        //  1177   1184   1184   1185   Any
        //  1177   1184   1184   1185   Any
        //  1177   1184   1177   1178   Ljava/lang/RuntimeException;
        //  1178   1184   3      8      Any
        //  1178   1184   1184   1185   Ljava/lang/NumberFormatException;
        //  1338   1345   1345   1346   Any
        //  1338   1345   1338   1339   Any
        //  1338   1345   3      8      Ljava/lang/NegativeArraySizeException;
        //  1338   1345   3      8      Any
        //  1339   1345   3      8      Any
        //  1352   1359   1359   1360   Any
        //  1353   1359   1359   1360   Ljava/lang/NullPointerException;
        //  1352   1359   3      8      Any
        //  1352   1359   3      8      Ljava/lang/IllegalArgumentException;
        //  1353   1359   1352   1353   Any
        //  1373   1380   1380   1381   Any
        //  1373   1380   1380   1381   Ljava/lang/StringIndexOutOfBoundsException;
        //  1373   1380   3      8      Any
        //  1373   1380   1373   1374   Any
        //  1373   1380   1373   1374   Any
        //  1384   1391   1391   1392   Any
        //  1384   1391   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1385   1391   3      8      Any
        //  1384   1391   1384   1385   Ljava/lang/ArithmeticException;
        //  1385   1391   1384   1385   Ljava/lang/AssertionError;
        //  1395   1402   1402   1403   Any
        //  1395   1402   3      8      Any
        //  1396   1402   1395   1396   Ljava/util/NoSuchElementException;
        //  1395   1402   3      8      Any
        //  1396   1402   1395   1396   Ljava/util/NoSuchElementException;
        //  1456   1462   1462   1463   Any
        //  1456   1462   1462   1463   Ljava/lang/ArithmeticException;
        //  1456   1462   1462   1463   Any
        //  1456   1462   3      8      Ljava/util/ConcurrentModificationException;
        //  1456   1462   3      8      Ljava/util/ConcurrentModificationException;
        //  1466   1473   1473   1474   Any
        //  1466   1473   1466   1467   Any
        //  1467   1473   3      8      Any
        //  1467   1473   3      8      Ljava/lang/NullPointerException;
        //  1467   1473   1466   1467   Any
        //  1581   1588   1588   1589   Any
        //  1581   1588   1581   1582   Ljava/util/NoSuchElementException;
        //  1582   1588   1588   1589   Any
        //  1582   1588   3      8      Any
        //  1582   1588   1588   1589   Any
        //  1643   1650   1650   1651   Any
        //  1643   1650   1643   1644   Ljava/lang/NegativeArraySizeException;
        //  1643   1650   1650   1651   Ljava/lang/IndexOutOfBoundsException;
        //  1643   1650   1650   1651   Any
        //  1643   1650   1643   1644   Any
        //  1716   1723   1723   1724   Any
        //  1716   1723   1716   1717   Any
        //  1716   1723   1723   1724   Ljava/lang/EnumConstantNotPresentException;
        //  1716   1723   1716   1717   Ljava/lang/IllegalStateException;
        //  1717   1723   3      8      Any
        //  1775   1782   1782   1783   Any
        //  1775   1782   1782   1783   Ljava/lang/ClassCastException;
        //  1775   1782   1775   1776   Any
        //  1776   1782   1775   1776   Any
        //  1775   1782   1775   1776   Any
        //  1813   1819   1819   1820   Any
        //  1813   1819   1819   1820   Any
        //  1813   1819   3      8      Any
        //  1813   1819   1819   1820   Ljava/lang/UnsupportedOperationException;
        //  1813   1819   1819   1820   Any
        //  1831   1838   1838   1839   Any
        //  1832   1838   3      8      Any
        //  1831   1838   1838   1839   Ljava/lang/IllegalStateException;
        //  1832   1838   1831   1832   Ljava/lang/AssertionError;
        //  1831   1838   1838   1839   Ljava/lang/EnumConstantNotPresentException;
        //  1843   1849   1849   1850   Any
        //  1843   1849   3      8      Any
        //  1843   1849   3      8      Any
        //  1843   1849   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1843   1849   3      8      Any
        //  1854   1860   1860   1861   Any
        //  1854   1860   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1854   1860   3      8      Any
        //  1854   1860   3      8      Any
        //  1854   1860   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1913   1920   1920   1921   Any
        //  1913   1920   1913   1914   Any
        //  1913   1920   1920   1921   Any
        //  1913   1920   1920   1921   Any
        //  1914   1920   1920   1921   Ljava/lang/NumberFormatException;
        //  1975   1982   1982   1983   Any
        //  1976   1982   3      8      Any
        //  1976   1982   1982   1983   Any
        //  1976   1982   1982   1983   Any
        //  1976   1982   1975   1976   Any
        //  1990   1997   1997   1998   Any
        //  1991   1997   3      8      Any
        //  1990   1997   1990   1991   Ljava/lang/IllegalArgumentException;
        //  1991   1997   1990   1991   Any
        //  1990   1997   3      8      Any
        //  2051   2058   2058   2059   Any
        //  2051   2058   3      8      Any
        //  2051   2058   2058   2059   Any
        //  2052   2058   2051   2052   Any
        //  2051   2058   3      8      Ljava/lang/NullPointerException;
        //  2178   2184   2184   2185   Any
        //  2178   2184   3      8      Ljava/lang/NumberFormatException;
        //  2178   2184   2184   2185   Any
        //  2178   2184   2184   2185   Ljava/lang/AssertionError;
        //  2178   2184   2184   2185   Ljava/lang/EnumConstantNotPresentException;
        //  2304   2311   2311   2312   Any
        //  2304   2311   2304   2305   Ljava/lang/ArithmeticException;
        //  2305   2311   2304   2305   Any
        //  2305   2311   2304   2305   Ljava/lang/IndexOutOfBoundsException;
        //  2304   2311   2311   2312   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2315   2322   2322   2323   Any
        //  2316   2322   2315   2316   Any
        //  2316   2322   3      8      Any
        //  2315   2322   3      8      Ljava/lang/ClassCastException;
        //  2315   2322   2315   2316   Any
        //  2391   2398   2398   2399   Any
        //  2392   2398   2398   2399   Any
        //  2391   2398   2391   2392   Ljava/lang/NumberFormatException;
        //  2391   2398   2391   2392   Ljava/lang/IndexOutOfBoundsException;
        //  2392   2398   2398   2399   Ljava/lang/ClassCastException;
        //  2404   2411   2411   2412   Any
        //  2405   2411   2404   2405   Any
        //  2404   2411   3      8      Ljava/util/NoSuchElementException;
        //  2404   2411   2411   2412   Ljava/lang/ClassCastException;
        //  2404   2411   3      8      Ljava/lang/ArithmeticException;
        //  2415   2422   2422   2423   Any
        //  2416   2422   2422   2423   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2416   2422   2422   2423   Ljava/lang/ArithmeticException;
        //  2415   2422   2415   2416   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2416   2422   2415   2416   Ljava/lang/RuntimeException;
        //  2471   2478   2478   2479   Any
        //  2471   2478   2471   2472   Ljava/util/NoSuchElementException;
        //  2472   2478   3      8      Ljava/util/NoSuchElementException;
        //  2472   2478   2478   2479   Ljava/lang/NullPointerException;
        //  2471   2478   2471   2472   Any
        //  2531   2537   2537   2538   Any
        //  2531   2537   2537   2538   Ljava/util/NoSuchElementException;
        //  2531   2537   2537   2538   Ljava/util/ConcurrentModificationException;
        //  2531   2537   3      8      Ljava/lang/ClassCastException;
        //  2531   2537   2537   2538   Any
        //  2642   2649   2649   2650   Any
        //  2643   2649   2642   2643   Ljava/util/NoSuchElementException;
        //  2643   2649   3      8      Any
        //  2642   2649   2649   2650   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2642   2649   2642   2643   Any
        //  2749   2756   2756   2757   Any
        //  2749   2756   2749   2750   Any
        //  2749   2756   2749   2750   Any
        //  2750   2756   2749   2750   Ljava/lang/IndexOutOfBoundsException;
        //  2749   2756   2749   2750   Ljava/lang/IndexOutOfBoundsException;
        //  2764   2771   2771   2772   Any
        //  2764   2771   2764   2765   Any
        //  2765   2771   2764   2765   Ljava/util/NoSuchElementException;
        //  2765   2771   2764   2765   Ljava/lang/ClassCastException;
        //  2764   2771   2771   2772   Ljava/lang/UnsupportedOperationException;
        //  2825   2832   2832   2833   Any
        //  2826   2832   2832   2833   Ljava/lang/ClassCastException;
        //  2825   2832   2825   2826   Ljava/lang/ArithmeticException;
        //  2826   2832   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2825   2832   3      8      Ljava/lang/NullPointerException;
        //  2892   2898   2898   2899   Any
        //  2892   2898   2898   2899   Any
        //  2892   2898   2898   2899   Ljava/util/ConcurrentModificationException;
        //  2892   2898   3      8      Ljava/lang/UnsupportedOperationException;
        //  2892   2898   3      8      Any
        //  2996   3002   3002   3003   Any
        //  2996   3002   3002   3003   Ljava/util/NoSuchElementException;
        //  2996   3002   3002   3003   Any
        //  2996   3002   3      8      Any
        //  2996   3002   3002   3003   Any
        //  3009   3015   3015   3016   Any
        //  3009   3015   3      8      Any
        //  3009   3015   3015   3016   Any
        //  3009   3015   3015   3016   Any
        //  3009   3015   3015   3016   Any
        //  3019   3026   3026   3027   Any
        //  3020   3026   3019   3020   Ljava/lang/ArithmeticException;
        //  3019   3026   3026   3027   Ljava/lang/NumberFormatException;
        //  3020   3026   3019   3020   Ljava/lang/NumberFormatException;
        //  3019   3026   3019   3020   Ljava/lang/IndexOutOfBoundsException;
        //  3080   3086   3086   3087   Any
        //  3080   3086   3      8      Ljava/lang/RuntimeException;
        //  3080   3086   3086   3087   Ljava/lang/ArithmeticException;
        //  3080   3086   3086   3087   Any
        //  3080   3086   3      8      Ljava/util/ConcurrentModificationException;
        //  3139   3146   3146   3147   Any
        //  3140   3146   3139   3140   Any
        //  3140   3146   3139   3140   Ljava/lang/StringIndexOutOfBoundsException;
        //  3139   3146   3139   3140   Ljava/lang/IllegalArgumentException;
        //  3140   3146   3      8      Any
        //  3195   3202   3202   3203   Any
        //  3195   3202   3202   3203   Ljava/util/NoSuchElementException;
        //  3195   3202   3195   3196   Ljava/lang/NumberFormatException;
        //  3196   3202   3195   3196   Ljava/util/NoSuchElementException;
        //  3196   3202   3202   3203   Ljava/lang/RuntimeException;
        //  3257   3264   3264   3265   Any
        //  3258   3264   3      8      Any
        //  3258   3264   3257   3258   Any
        //  3258   3264   3      8      Ljava/lang/NumberFormatException;
        //  3258   3264   3      8      Any
        //  3363   3370   3370   3371   Any
        //  3364   3370   3370   3371   Any
        //  3363   3370   3      8      Any
        //  3364   3370   3363   3364   Any
        //  3364   3370   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3407   3414   3414   3415   Any
        //  3408   3414   3414   3415   Ljava/lang/ClassCastException;
        //  3408   3414   3407   3408   Any
        //  3408   3414   3407   3408   Ljava/lang/ClassCastException;
        //  3408   3414   3407   3408   Ljava/lang/AssertionError;
        //  3418   3425   3425   3426   Any
        //  3418   3425   3418   3419   Any
        //  3418   3425   3418   3419   Any
        //  3419   3425   3425   3426   Ljava/util/NoSuchElementException;
        //  3418   3425   3418   3419   Any
        //  3590   3596   3596   3597   Any
        //  3590   3596   3      8      Any
        //  3590   3596   3596   3597   Any
        //  3590   3596   3596   3597   Any
        //  3590   3596   3596   3597   Any
        //  3602   3609   3609   3610   Any
        //  3602   3609   3602   3603   Ljava/lang/EnumConstantNotPresentException;
        //  3602   3609   3609   3610   Any
        //  3603   3609   3602   3603   Ljava/util/ConcurrentModificationException;
        //  3602   3609   3602   3603   Ljava/lang/ClassCastException;
        //  3613   3620   3620   3621   Any
        //  3614   3620   3613   3614   Any
        //  3614   3620   3613   3614   Any
        //  3613   3620   3620   3621   Any
        //  3613   3620   3613   3614   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3624   3631   3631   3632   Any
        //  3625   3631   3631   3632   Ljava/lang/StringIndexOutOfBoundsException;
        //  3624   3631   3624   3625   Ljava/util/NoSuchElementException;
        //  3625   3631   3      8      Any
        //  3625   3631   3      8      Ljava/lang/IllegalStateException;
        //  3639   3645   3645   3646   Any
        //  3639   3645   3645   3646   Ljava/lang/StringIndexOutOfBoundsException;
        //  3639   3645   3      8      Ljava/lang/UnsupportedOperationException;
        //  3639   3645   3      8      Ljava/lang/IllegalArgumentException;
        //  3639   3645   3645   3646   Any
        //  3729   3736   3736   3737   Any
        //  3729   3736   3736   3737   Ljava/lang/ArithmeticException;
        //  3729   3736   3736   3737   Any
        //  3730   3736   3729   3730   Any
        //  3730   3736   3736   3737   Ljava/lang/ClassCastException;
        //  3740   3747   3747   3748   Any
        //  3740   3747   3740   3741   Ljava/lang/UnsupportedOperationException;
        //  3740   3747   3      8      Ljava/lang/ArithmeticException;
        //  3741   3747   3      8      Ljava/lang/IllegalArgumentException;
        //  3740   3747   3747   3748   Any
        //  3818   3825   3825   3826   Any
        //  3818   3825   3      8      Any
        //  3819   3825   3      8      Any
        //  3819   3825   3818   3819   Ljava/lang/StringIndexOutOfBoundsException;
        //  3819   3825   3818   3819   Ljava/lang/ArithmeticException;
        //  3875   3882   3882   3883   Any
        //  3875   3882   3882   3883   Ljava/lang/RuntimeException;
        //  3876   3882   3875   3876   Ljava/lang/AssertionError;
        //  3875   3882   3875   3876   Any
        //  3876   3882   3      8      Ljava/util/ConcurrentModificationException;
        //  3886   3893   3893   3894   Any
        //  3886   3893   3      8      Any
        //  3886   3893   3886   3887   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3887   3893   3893   3894   Ljava/lang/StringIndexOutOfBoundsException;
        //  3886   3893   3886   3887   Ljava/lang/NullPointerException;
        //  3898   3904   3904   3905   Any
        //  3898   3904   3      8      Ljava/lang/ClassCastException;
        //  3898   3904   3904   3905   Ljava/lang/AssertionError;
        //  3898   3904   3      8      Any
        //  3898   3904   3904   3905   Any
        //  4027   4034   4034   4035   Any
        //  4028   4034   4034   4035   Ljava/lang/EnumConstantNotPresentException;
        //  4028   4034   4034   4035   Any
        //  4028   4034   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4027   4034   4027   4028   Any
        //  4085   4092   4092   4093   Any
        //  4086   4092   4085   4086   Any
        //  4086   4092   4085   4086   Any
        //  4086   4092   4085   4086   Any
        //  4086   4092   4092   4093   Any
        //  4097   4103   4103   4104   Any
        //  4097   4103   3      8      Any
        //  4097   4103   3      8      Any
        //  4097   4103   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  4097   4103   3      8      Ljava/lang/RuntimeException;
        //  4107   4114   4114   4115   Any
        //  4107   4114   3      8      Any
        //  4107   4114   4107   4108   Any
        //  4108   4114   4107   4108   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4108   4114   3      8      Ljava/util/ConcurrentModificationException;
        //  4118   4125   4125   4126   Any
        //  4119   4125   4125   4126   Ljava/lang/ArithmeticException;
        //  4118   4125   4125   4126   Ljava/lang/NumberFormatException;
        //  4118   4125   4118   4119   Any
        //  4118   4125   3      8      Ljava/lang/ClassCastException;
        //  4131   4138   4138   4139   Any
        //  4132   4138   4138   4139   Ljava/lang/NegativeArraySizeException;
        //  4132   4138   4131   4132   Ljava/lang/AssertionError;
        //  4131   4138   4131   4132   Ljava/lang/IllegalArgumentException;
        //  4132   4138   4131   4132   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4142   4151   4151   4152   Any
        //  4142   4151   3      8      Ljava/lang/RuntimeException;
        //  4142   4151   4142   4143   Ljava/lang/ClassCastException;
        //  4143   4151   4151   4152   Ljava/lang/ArithmeticException;
        //  4142   4151   4151   4152   Ljava/lang/ArithmeticException;
        //  4161   4168   4168   4169   Any
        //  4162   4168   4168   4169   Any
        //  4161   4168   4168   4169   Any
        //  4162   4168   4161   4162   Any
        //  4161   4168   4168   4169   Any
        //  4178   4185   4185   4186   Any
        //  4178   4185   4185   4186   Any
        //  4178   4185   4178   4179   Any
        //  4179   4185   4178   4179   Any
        //  4179   4185   3      8      Any
        //  4189   4196   4196   4197   Any
        //  4190   4196   4189   4190   Ljava/lang/IndexOutOfBoundsException;
        //  4189   4196   4196   4197   Ljava/lang/NumberFormatException;
        //  4189   4196   3      8      Ljava/lang/ArithmeticException;
        //  4190   4196   4196   4197   Any
        //  4203   4212   4212   4213   Any
        //  4203   4212   3      8      Ljava/lang/IllegalArgumentException;
        //  4204   4212   4212   4213   Ljava/lang/NumberFormatException;
        //  4204   4212   4203   4204   Ljava/lang/NullPointerException;
        //  4204   4212   4212   4213   Any
        //  4267   4276   4276   4277   Any
        //  4268   4276   4267   4268   Any
        //  4267   4276   4267   4268   Ljava/lang/NumberFormatException;
        //  4267   4276   4267   4268   Any
        //  4268   4276   4267   4268   Any
        //  4331   4338   4338   4339   Any
        //  4331   4338   4331   4332   Any
        //  4331   4338   4331   4332   Any
        //  4332   4338   4338   4339   Any
        //  4332   4338   3      8      Ljava/lang/ArithmeticException;
        //  4393   4400   4400   4401   Any
        //  4393   4400   4393   4394   Any
        //  4393   4400   4400   4401   Any
        //  4394   4400   3      8      Any
        //  4394   4400   3      8      Any
        //  4457   4464   4464   4465   Any
        //  4457   4464   4457   4458   Ljava/lang/StringIndexOutOfBoundsException;
        //  4458   4464   4464   4465   Ljava/lang/NullPointerException;
        //  4458   4464   3      8      Ljava/lang/NullPointerException;
        //  4458   4464   3      8      Ljava/lang/IllegalArgumentException;
        //  4468   4475   4475   4476   Any
        //  4469   4475   4475   4476   Any
        //  4468   4475   4468   4469   Any
        //  4469   4475   4475   4476   Ljava/lang/IllegalArgumentException;
        //  4469   4475   3      8      Ljava/lang/AssertionError;
        //  4482   4489   4489   4490   Any
        //  4482   4489   3      8      Ljava/lang/ArithmeticException;
        //  4482   4489   4482   4483   Any
        //  4482   4489   3      8      Any
        //  4482   4489   3      8      Any
        //  4541   4548   4548   4549   Any
        //  4541   4548   3      8      Ljava/util/NoSuchElementException;
        //  4541   4548   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  4542   4548   4541   4542   Any
        //  4541   4548   4548   4549   Ljava/lang/IllegalStateException;
        //  4654   4661   4661   4662   Any
        //  4655   4661   4661   4662   Any
        //  4654   4661   4654   4655   Ljava/lang/UnsupportedOperationException;
        //  4655   4661   3      8      Any
        //  4654   4661   4654   4655   Any
        //  4761   4767   4767   4768   Any
        //  4761   4767   3      8      Any
        //  4761   4767   3      8      Ljava/lang/NegativeArraySizeException;
        //  4761   4767   3      8      Ljava/lang/ClassCastException;
        //  4761   4767   4767   4768   Ljava/util/ConcurrentModificationException;
        //  4891   4898   4898   4899   Any
        //  4892   4898   3      8      Any
        //  4892   4898   4898   4899   Any
        //  4892   4898   4891   4892   Ljava/lang/IndexOutOfBoundsException;
        //  4891   4898   4891   4892   Ljava/lang/NumberFormatException;
        //  5002   5008   5008   5009   Any
        //  5002   5008   3      8      Any
        //  5002   5008   5008   5009   Ljava/lang/ClassCastException;
        //  5002   5008   3      8      Any
        //  5002   5008   5008   5009   Ljava/lang/NegativeArraySizeException;
        //  5017   5024   5024   5025   Any
        //  5017   5024   5017   5018   Any
        //  5018   5024   5024   5025   Ljava/lang/EnumConstantNotPresentException;
        //  5018   5024   5024   5025   Ljava/lang/NumberFormatException;
        //  5018   5024   5024   5025   Any
        //  5028   5037   5037   5038   Any
        //  5029   5037   5028   5029   Ljava/lang/ClassCastException;
        //  5029   5037   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5029   5037   5028   5029   Any
        //  5029   5037   3      8      Ljava/util/ConcurrentModificationException;
        //  5046   5053   5053   5054   Any
        //  5047   5053   3      8      Ljava/util/ConcurrentModificationException;
        //  5046   5053   3      8      Ljava/lang/ArithmeticException;
        //  5046   5053   3      8      Any
        //  5046   5053   5046   5047   Any
        //  5058   5065   5065   5066   Any
        //  5058   5065   5065   5066   Any
        //  5059   5065   3      8      Any
        //  5059   5065   5058   5059   Any
        //  5059   5065   5065   5066   Any
        //  5115   5122   5122   5123   Any
        //  5115   5122   5115   5116   Any
        //  5115   5122   5115   5116   Ljava/lang/IllegalArgumentException;
        //  5115   5122   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  5115   5122   5115   5116   Ljava/lang/NegativeArraySizeException;
        //  5129   5136   5136   5137   Any
        //  5130   5136   3      8      Any
        //  5129   5136   5136   5137   Any
        //  5130   5136   5136   5137   Ljava/lang/NullPointerException;
        //  5129   5136   5129   5130   Ljava/lang/IllegalArgumentException;
        //  5255   5262   5262   5263   Any
        //  5256   5262   3      8      Ljava/lang/NumberFormatException;
        //  5255   5262   5262   5263   Any
        //  5256   5262   5255   5256   Ljava/lang/UnsupportedOperationException;
        //  5255   5262   5262   5263   Any
        //  5364   5372   5372   5373   Any
        //  5364   5372   3      8      Any
        //  5364   5372   5372   5373   Ljava/lang/NumberFormatException;
        //  5364   5372   3      8      Ljava/lang/IllegalArgumentException;
        //  5364   5372   5372   5373   Ljava/util/ConcurrentModificationException;
        //  5417   5426   5426   5427   Any
        //  5418   5426   5426   5427   Ljava/lang/StringIndexOutOfBoundsException;
        //  5417   5426   3      8      Any
        //  5418   5426   3      8      Ljava/lang/ArithmeticException;
        //  5417   5426   5417   5418   Ljava/lang/ClassCastException;
        //  5445   5451   5451   5452   Any
        //  5445   5451   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  5445   5451   5451   5452   Ljava/lang/StringIndexOutOfBoundsException;
        //  5445   5451   5451   5452   Any
        //  5445   5451   5451   5452   Any
        //  5455   5462   5462   5463   Any
        //  5455   5462   5455   5456   Ljava/lang/ArithmeticException;
        //  5456   5462   5455   5456   Any
        //  5455   5462   5462   5463   Ljava/lang/NumberFormatException;
        //  5456   5462   3      8      Any
        //  5520   5526   5526   5527   Any
        //  5520   5526   5526   5527   Ljava/lang/NullPointerException;
        //  5520   5526   3      8      Any
        //  5520   5526   3      8      Any
        //  5520   5526   5526   5527   Ljava/util/NoSuchElementException;
        //  5534   5541   5541   5542   Any
        //  5534   5541   5534   5535   Ljava/lang/NegativeArraySizeException;
        //  5534   5541   5541   5542   Ljava/util/NoSuchElementException;
        //  5534   5541   5541   5542   Ljava/lang/NumberFormatException;
        //  5534   5541   5541   5542   Ljava/lang/UnsupportedOperationException;
        //  5556   5562   5562   5563   Any
        //  5556   5562   3      8      Any
        //  5556   5562   5562   5563   Ljava/lang/AssertionError;
        //  5556   5562   3      8      Ljava/lang/AssertionError;
        //  5556   5562   3      8      Any
        //  5619   5626   5626   5627   Any
        //  5619   5626   5626   5627   Ljava/lang/AssertionError;
        //  5619   5626   5619   5620   Any
        //  5619   5626   5619   5620   Any
        //  5620   5626   3      8      Any
        //  5630   5639   5639   5640   Any
        //  5630   5639   3      8      Any
        //  5631   5639   3      8      Ljava/lang/NumberFormatException;
        //  5631   5639   5630   5631   Ljava/lang/NegativeArraySizeException;
        //  5631   5639   5639   5640   Ljava/util/NoSuchElementException;
        //  5672   5679   5679   5680   Any
        //  5673   5679   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  5672   5679   5672   5673   Any
        //  5673   5679   3      8      Ljava/util/ConcurrentModificationException;
        //  5673   5679   5672   5673   Ljava/lang/RuntimeException;
        //  5783   5790   5790   5791   Any
        //  5783   5790   3      8      Ljava/lang/UnsupportedOperationException;
        //  5783   5790   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5784   5790   5783   5784   Ljava/lang/UnsupportedOperationException;
        //  5784   5790   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5794   5801   5801   5802   Any
        //  5794   5801   5801   5802   Ljava/lang/IllegalArgumentException;
        //  5795   5801   3      8      Ljava/lang/AssertionError;
        //  5795   5801   3      8      Ljava/util/ConcurrentModificationException;
        //  5794   5801   5794   5795   Ljava/lang/IndexOutOfBoundsException;
        //  5859   5866   5866   5867   Any
        //  5860   5866   3      8      Ljava/lang/AssertionError;
        //  5859   5866   5859   5860   Any
        //  5859   5866   3      8      Any
        //  5859   5866   5866   5867   Any
        //  5935   5942   5942   5943   Any
        //  5936   5942   5942   5943   Any
        //  5936   5942   5942   5943   Ljava/lang/NullPointerException;
        //  5935   5942   5942   5943   Ljava/lang/IllegalStateException;
        //  5936   5942   5935   5936   Ljava/util/NoSuchElementException;
        //  5952   5959   5959   5960   Any
        //  5953   5959   5959   5960   Any
        //  5952   5959   5952   5953   Any
        //  5953   5959   3      8      Ljava/lang/NumberFormatException;
        //  5953   5959   5952   5953   Ljava/lang/IllegalStateException;
        //  5963   5970   5970   5971   Any
        //  5963   5970   5963   5964   Any
        //  5963   5970   5963   5964   Ljava/lang/NegativeArraySizeException;
        //  5964   5970   5970   5971   Any
        //  5964   5970   5963   5964   Any
        //  5974   5981   5981   5982   Any
        //  5974   5981   5974   5975   Ljava/lang/AssertionError;
        //  5974   5981   3      8      Any
        //  5975   5981   3      8      Ljava/util/NoSuchElementException;
        //  5974   5981   5981   5982   Ljava/util/ConcurrentModificationException;
        //  5986   5992   5992   5993   Any
        //  5986   5992   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  5986   5992   3      8      Any
        //  5986   5992   5992   5993   Ljava/lang/AssertionError;
        //  5986   5992   3      8      Any
        //  6000   6007   6007   6008   Any
        //  6001   6007   6000   6001   Any
        //  6001   6007   3      8      Ljava/lang/RuntimeException;
        //  6001   6007   3      8      Any
        //  6001   6007   3      8      Ljava/lang/NullPointerException;
        //  6012   6018   6018   6019   Any
        //  6012   6018   6018   6019   Ljava/util/NoSuchElementException;
        //  6012   6018   6018   6019   Any
        //  6012   6018   3      8      Ljava/lang/AssertionError;
        //  6012   6018   6018   6019   Ljava/lang/NegativeArraySizeException;
        //  6090   6097   6097   6098   Any
        //  6091   6097   6090   6091   Any
        //  6090   6097   6097   6098   Any
        //  6091   6097   6090   6091   Any
        //  6091   6097   6090   6091   Any
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
    
    public int c(final float p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          557
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            549
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            541
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/awt/Color;
        //    27: dup            
        //    28: bipush          72
        //    30: sipush          255
        //    33: bipush          94
        //    35: goto            39
        //    38: athrow         
        //    39: invokespecial   java/awt/Color.<init>:(III)V
        //    42: goto            46
        //    45: athrow         
        //    46: astore_3       
        //    47: new             Ljava/awt/Color;
        //    50: dup            
        //    51: sipush          255
        //    54: sipush          250
        //    57: bipush          57
        //    59: goto            63
        //    62: athrow         
        //    63: invokespecial   java/awt/Color.<init>:(III)V
        //    66: goto            70
        //    69: athrow         
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            82
        //    76: ldc_w           -727932017
        //    79: goto            85
        //    82: ldc_w           374738457
        //    85: ldc_w           869773817
        //    88: ixor           
        //    89: lookupswitch {
        //          -1044942138: 82
        //          -414510474: 526
        //          default: 116
        //        }
        //   116: astore          4
        //   118: new             Ljava/awt/Color;
        //   121: dup            
        //   122: sipush          255
        //   125: bipush          35
        //   127: bipush          40
        //   129: goto            133
        //   132: athrow         
        //   133: invokespecial   java/awt/Color.<init>:(III)V
        //   136: goto            140
        //   139: athrow         
        //   140: astore          5
        //   142: fload_1        
        //   143: fconst_2       
        //   144: fdiv           
        //   145: getstatic       dev/nuker/pyro/fc.c:I
        //   148: ifge            157
        //   151: ldc_w           -898452837
        //   154: goto            160
        //   157: ldc_w           -1304825270
        //   160: ldc_w           557968420
        //   163: ixor           
        //   164: lookupswitch {
        //          -348954945: 520
        //          1808210442: 157
        //          default: 192
        //        }
        //   192: fstore          6
        //   194: getstatic       dev/nuker/pyro/fc.c:I
        //   197: ifge            206
        //   200: ldc_w           141041607
        //   203: goto            209
        //   206: ldc_w           956556645
        //   209: ldc_w           -1048898351
        //   212: ixor           
        //   213: lookupswitch {
        //          -921498858: 206
        //          -126291532: 240
        //          default: 528
        //        }
        //   240: fload_2        
        //   241: fload           6
        //   243: fcmpg          
        //   244: ifgt            416
        //   247: aload           4
        //   249: getstatic       dev/nuker/pyro/fc.0:I
        //   252: ifeq            261
        //   255: ldc_w           -1216094350
        //   258: goto            264
        //   261: ldc_w           589041845
        //   264: ldc_w           -447259594
        //   267: ixor           
        //   268: lookupswitch {
        //          235781742: 261
        //          1389658948: 522
        //          default: 296
        //        }
        //   296: aload           5
        //   298: fload_2        
        //   299: fload           6
        //   301: fdiv           
        //   302: getstatic       dev/nuker/pyro/fc.1:I
        //   305: ifeq            314
        //   308: ldc_w           -133060046
        //   311: goto            317
        //   314: ldc_w           -868338099
        //   317: ldc_w           -89778411
        //   320: ixor           
        //   321: lookupswitch {
        //          -345070977: 314
        //          45595943: 518
        //          default: 348
        //        }
        //   348: goto            352
        //   351: athrow         
        //   352: invokestatic    dev/nuker/pyro/fb5.c:(Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
        //   355: goto            359
        //   358: athrow         
        //   359: getstatic       dev/nuker/pyro/fc.0:I
        //   362: ifeq            371
        //   365: ldc_w           663007847
        //   368: goto            374
        //   371: ldc_w           -1124905190
        //   374: ldc_w           393806489
        //   377: ixor           
        //   378: lookupswitch {
        //          821932286: 524
        //          2047561432: 371
        //          default: 404
        //        }
        //   404: goto            408
        //   407: athrow         
        //   408: invokevirtual   java/awt/Color.getRGB:()I
        //   411: goto            415
        //   414: athrow         
        //   415: ireturn        
        //   416: fload_2        
        //   417: getstatic       dev/nuker/pyro/fc.0:I
        //   420: ifeq            429
        //   423: ldc_w           1355611948
        //   426: goto            432
        //   429: ldc_w           627503412
        //   432: ldc_w           849558093
        //   435: ixor           
        //   436: lookupswitch {
        //          1651492193: 530
        //          2041310582: 429
        //          default: 464
        //        }
        //   464: fload           6
        //   466: fconst_2       
        //   467: fmul           
        //   468: fcmpg          
        //   469: ifgt            505
        //   472: aload_3        
        //   473: aload           4
        //   475: fload_2        
        //   476: fload           6
        //   478: fsub           
        //   479: fload           6
        //   481: fdiv           
        //   482: goto            486
        //   485: athrow         
        //   486: invokestatic    dev/nuker/pyro/fb5.c:(Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
        //   489: goto            493
        //   492: athrow         
        //   493: goto            497
        //   496: athrow         
        //   497: invokevirtual   java/awt/Color.getRGB:()I
        //   500: goto            504
        //   503: athrow         
        //   504: ireturn        
        //   505: aload_3        
        //   506: goto            510
        //   509: athrow         
        //   510: invokevirtual   java/awt/Color.getRGB:()I
        //   513: goto            517
        //   516: athrow         
        //   517: ireturn        
        //   518: aconst_null    
        //   519: athrow         
        //   520: aconst_null    
        //   521: athrow         
        //   522: aconst_null    
        //   523: athrow         
        //   524: aconst_null    
        //   525: athrow         
        //   526: aconst_null    
        //   527: athrow         
        //   528: aconst_null    
        //   529: athrow         
        //   530: aconst_null    
        //   531: athrow         
        //   532: pop            
        //   533: goto            24
        //   536: pop            
        //   537: aconst_null    
        //   538: goto            532
        //   541: dup            
        //   542: ifnull          532
        //   545: checkcast       Ljava/lang/Throwable;
        //   548: athrow         
        //   549: dup            
        //   550: ifnull          536
        //   553: checkcast       Ljava/lang/Throwable;
        //   556: athrow         
        //   557: aconst_null    
        //   558: athrow         
        //    StackMapTable: 00 47 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FE 00 03 07 00 03 02 02 4D 07 00 34 FF 00 00 00 03 07 00 03 02 02 00 05 08 00 18 08 00 18 01 01 01 45 07 00 34 40 07 05 1B FF 00 0F 00 04 07 00 03 02 02 07 05 1B 00 01 07 00 15 FF 00 00 00 04 07 00 03 02 02 07 05 1B 00 05 08 00 2F 08 00 2F 01 01 01 45 07 00 34 40 07 05 1B 4B 07 05 1B FF 00 02 00 04 07 00 03 02 02 07 05 1B 00 02 07 05 1B 01 5E 07 05 1B FF 00 0F 00 00 00 01 07 00 34 FF 00 00 00 05 07 00 03 02 02 07 05 1B 07 05 1B 00 05 08 00 76 08 00 76 01 01 01 45 07 00 34 40 07 05 1B FF 00 10 00 06 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 00 01 02 FF 00 02 00 06 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 00 02 02 01 5F 02 FC 00 0D 02 42 01 1E 54 07 05 1B FF 00 02 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 02 07 05 1B 01 5F 07 05 1B FF 00 11 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 03 07 05 1B 07 05 1B 02 FF 00 02 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 04 07 05 1B 07 05 1B 02 01 FF 00 1E 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 03 07 05 1B 07 05 1B 02 42 07 00 34 FF 00 00 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 03 07 05 1B 07 05 1B 02 45 07 00 34 40 07 05 1B 4B 07 05 1B FF 00 02 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 02 07 05 1B 01 5D 07 05 1B 42 07 00 34 40 07 05 1B 45 07 00 34 40 01 00 4C 02 FF 00 02 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 02 02 01 5F 02 54 07 00 34 FF 00 00 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 03 07 05 1B 07 05 1B 02 45 07 00 34 40 07 05 1B FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 01 07 05 1B 45 07 00 34 40 01 00 43 07 00 34 40 07 05 1B 45 07 00 34 40 01 FF 00 00 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 03 07 05 1B 07 05 1B 02 FF 00 01 00 06 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 00 01 02 FF 00 01 00 07 07 00 03 02 02 07 05 1B 07 05 1B 07 05 1B 02 00 01 07 05 1B 41 07 05 1B FF 00 01 00 04 07 00 03 02 02 07 05 1B 00 01 07 05 1B FE 00 01 07 05 1B 07 05 1B 02 41 02 FF 00 01 00 03 07 00 03 02 02 00 01 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     541    549    Any
        //  541    549    541    549    Ljava/lang/NullPointerException;
        //  557    559    3      8      Any
        //  38     45     45     46     Any
        //  38     45     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  39     45     45     46     Ljava/lang/UnsupportedOperationException;
        //  39     45     38     39     Any
        //  39     45     38     39     Ljava/lang/ClassCastException;
        //  62     69     69     70     Any
        //  63     69     69     70     Any
        //  63     69     3      8      Any
        //  63     69     62     63     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  62     69     69     70     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  133    139    139    140    Any
        //  133    139    3      8      Any
        //  133    139    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  133    139    139    140    Any
        //  133    139    3      8      Ljava/lang/NegativeArraySizeException;
        //  351    358    358    359    Any
        //  352    358    351    352    Any
        //  351    358    358    359    Any
        //  352    358    358    359    Any
        //  351    358    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  407    414    414    415    Any
        //  407    414    414    415    Ljava/util/NoSuchElementException;
        //  408    414    407    408    Ljava/lang/IllegalArgumentException;
        //  407    414    407    408    Any
        //  408    414    407    408    Any
        //  485    492    492    493    Any
        //  485    492    485    486    Any
        //  485    492    3      8      Ljava/util/NoSuchElementException;
        //  485    492    485    486    Ljava/util/ConcurrentModificationException;
        //  485    492    3      8      Any
        //  497    503    503    504    Any
        //  497    503    3      8      Ljava/lang/NumberFormatException;
        //  497    503    3      8      Ljava/lang/AssertionError;
        //  497    503    3      8      Ljava/util/ConcurrentModificationException;
        //  497    503    503    504    Any
        //  509    516    516    517    Any
        //  509    516    509    510    Ljava/lang/UnsupportedOperationException;
        //  510    516    509    510    Any
        //  510    516    3      8      Ljava/lang/NegativeArraySizeException;
        //  509    516    509    510    Any
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
    
    public void c(final ItemStack p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          735
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            727
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            719
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //    31: goto            35
        //    34: athrow         
        //    35: iconst_1       
        //    36: getstatic       dev/nuker/pyro/fc.1:I
        //    39: ifeq            48
        //    42: ldc_w           -1818015027
        //    45: goto            51
        //    48: ldc_w           -1946423186
        //    51: ldc_w           1575029668
        //    54: ixor           
        //    55: lookupswitch {
        //          -834518679: 48
        //          -702874678: 80
        //          default: 704
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //    87: goto            91
        //    90: athrow         
        //    91: sipush          256
        //    94: goto            98
        //    97: athrow         
        //    98: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179086_m:(I)V
        //   101: goto            105
        //   104: athrow         
        //   105: goto            109
        //   108: athrow         
        //   109: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74519_b:()V
        //   112: goto            116
        //   115: athrow         
        //   116: aload_0        
        //   117: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   127: goto            131
        //   130: athrow         
        //   131: ldc_w           -150.0
        //   134: getstatic       dev/nuker/pyro/fc.c:I
        //   137: ifge            146
        //   140: ldc_w           524660028
        //   143: goto            149
        //   146: ldc_w           -221268369
        //   149: ldc_w           -1011805112
        //   152: ixor           
        //   153: lookupswitch {
        //          -587941516: 706
        //          2136814436: 146
        //          default: 180
        //        }
        //   180: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //   183: goto            187
        //   186: athrow         
        //   187: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179118_c:()V
        //   190: goto            194
        //   193: athrow         
        //   194: goto            198
        //   197: athrow         
        //   198: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //   201: goto            205
        //   204: athrow         
        //   205: goto            209
        //   208: athrow         
        //   209: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179129_p:()V
        //   212: goto            216
        //   215: athrow         
        //   216: iload           4
        //   218: iconst_4       
        //   219: if_icmple       280
        //   222: getstatic       dev/nuker/pyro/fc.c:I
        //   225: ifge            234
        //   228: ldc_w           1886255724
        //   231: goto            237
        //   234: ldc_w           2054172406
        //   237: ldc_w           776224976
        //   240: ixor           
        //   241: lookupswitch {
        //          1041327565: 234
        //          1579793084: 702
        //          default: 268
        //        }
        //   268: iload           4
        //   270: iconst_4       
        //   271: isub           
        //   272: bipush          8
        //   274: imul           
        //   275: iconst_2       
        //   276: idiv           
        //   277: goto            281
        //   280: iconst_0       
        //   281: istore          5
        //   283: getstatic       dev/nuker/pyro/fc.1:I
        //   286: ifeq            295
        //   289: ldc_w           -1767955600
        //   292: goto            298
        //   295: ldc_w           1519334612
        //   298: ldc_w           -1633707897
        //   301: ixor           
        //   302: lookupswitch {
        //          134265847: 700
        //          1425037426: 295
        //          default: 328
        //        }
        //   328: aload_0        
        //   329: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   339: goto            343
        //   342: athrow         
        //   343: getstatic       dev/nuker/pyro/fc.0:I
        //   346: ifeq            355
        //   349: ldc_w           1106907325
        //   352: goto            358
        //   355: ldc_w           130208119
        //   358: ldc_w           -644337731
        //   361: ixor           
        //   362: lookupswitch {
        //          -1738391808: 692
        //          -1098001748: 355
        //          default: 388
        //        }
        //   388: aload_1        
        //   389: iload_2        
        //   390: iload_3        
        //   391: iload           5
        //   393: iadd           
        //   394: goto            398
        //   397: athrow         
        //   398: invokevirtual   net/minecraft/client/renderer/RenderItem.func_180450_b:(Lnet/minecraft/item/ItemStack;II)V
        //   401: goto            405
        //   404: athrow         
        //   405: getstatic       dev/nuker/pyro/fc.1:I
        //   408: ifeq            417
        //   411: ldc_w           1317684328
        //   414: goto            420
        //   417: ldc_w           -797702413
        //   420: ldc_w           -527645582
        //   423: ixor           
        //   424: lookupswitch {
        //          -1375305702: 417
        //          821609089: 452
        //          default: 698
        //        }
        //   452: aload_0        
        //   453: getstatic       dev/nuker/pyro/fc.0:I
        //   456: ifeq            465
        //   459: ldc_w           772768487
        //   462: goto            468
        //   465: ldc_w           -1148690601
        //   468: ldc_w           538877764
        //   471: ixor           
        //   472: lookupswitch {
        //          236002723: 696
        //          2059508020: 465
        //          default: 500
        //        }
        //   500: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   503: getstatic       dev/nuker/pyro/fc.c:I
        //   506: ifge            515
        //   509: ldc_w           1148484815
        //   512: goto            518
        //   515: ldc_w           -69171271
        //   518: ldc_w           -498542638
        //   521: ixor           
        //   522: lookupswitch {
        //          -1505973475: 515
        //          430461035: 548
        //          default: 708
        //        }
        //   548: goto            552
        //   551: athrow         
        //   552: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   555: goto            559
        //   558: athrow         
        //   559: aload_0        
        //   560: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   563: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //   566: aload_1        
        //   567: iload_2        
        //   568: iload_3        
        //   569: iload           5
        //   571: iadd           
        //   572: goto            576
        //   575: athrow         
        //   576: invokevirtual   net/minecraft/client/renderer/RenderItem.func_175030_a:(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;II)V
        //   579: goto            583
        //   582: athrow         
        //   583: aload_0        
        //   584: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   587: getstatic       dev/nuker/pyro/fc.c:I
        //   590: ifge            599
        //   593: ldc_w           -982096631
        //   596: goto            602
        //   599: ldc_w           -1308979222
        //   602: ldc_w           417604497
        //   605: ixor           
        //   606: lookupswitch {
        //          -778826934: 599
        //          -577616232: 694
        //          default: 632
        //        }
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   net/minecraft/client/Minecraft.func_175599_af:()Lnet/minecraft/client/renderer/RenderItem;
        //   639: goto            643
        //   642: athrow         
        //   643: fconst_0       
        //   644: putfield        net/minecraft/client/renderer/RenderItem.field_77023_b:F
        //   647: goto            651
        //   650: athrow         
        //   651: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74518_a:()V
        //   654: goto            658
        //   657: athrow         
        //   658: goto            662
        //   661: athrow         
        //   662: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179089_o:()V
        //   665: goto            669
        //   668: athrow         
        //   669: goto            673
        //   672: athrow         
        //   673: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179141_d:()V
        //   676: goto            680
        //   679: athrow         
        //   680: goto            684
        //   683: athrow         
        //   684: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   687: goto            691
        //   690: athrow         
        //   691: return         
        //   692: aconst_null    
        //   693: athrow         
        //   694: aconst_null    
        //   695: athrow         
        //   696: aconst_null    
        //   697: athrow         
        //   698: aconst_null    
        //   699: athrow         
        //   700: aconst_null    
        //   701: athrow         
        //   702: aconst_null    
        //   703: athrow         
        //   704: aconst_null    
        //   705: athrow         
        //   706: aconst_null    
        //   707: athrow         
        //   708: aconst_null    
        //   709: athrow         
        //   710: pop            
        //   711: goto            24
        //   714: pop            
        //   715: aconst_null    
        //   716: goto            710
        //   719: dup            
        //   720: ifnull          710
        //   723: checkcast       Ljava/lang/Throwable;
        //   726: athrow         
        //   727: dup            
        //   728: ifnull          714
        //   731: checkcast       Ljava/lang/Throwable;
        //   734: athrow         
        //   735: aconst_null    
        //   736: athrow         
        //    StackMapTable: 00 73 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FF 00 03 00 05 07 00 03 07 00 F2 01 01 01 00 00 42 07 00 23 00 45 07 00 34 00 4C 01 FF 00 02 00 05 07 00 03 07 00 F2 01 01 01 00 02 01 01 5C 01 42 07 00 1F 40 01 45 07 00 34 00 45 07 00 27 40 01 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 46 07 00 19 40 07 01 C8 45 07 00 34 40 07 05 50 FF 00 0E 00 05 07 00 03 07 00 F2 01 01 01 00 02 07 05 50 02 FF 00 02 00 05 07 00 03 07 00 F2 01 01 01 00 03 07 05 50 02 01 FF 00 1E 00 05 07 00 03 07 00 F2 01 01 01 00 02 07 05 50 02 45 07 00 1D 00 45 07 00 34 00 42 07 00 17 00 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 11 42 01 1E 0B 40 01 FC 00 0D 01 42 01 1D 46 07 00 25 40 07 01 C8 45 07 00 34 40 07 05 50 4B 07 05 50 FF 00 02 00 06 07 00 03 07 00 F2 01 01 01 01 00 02 07 05 50 01 5D 07 05 50 48 07 00 34 FF 00 00 00 06 07 00 03 07 00 F2 01 01 01 01 00 04 07 05 50 07 00 F2 01 01 45 07 00 34 00 0B 42 01 1F 4C 07 00 03 FF 00 02 00 06 07 00 03 07 00 F2 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 4E 07 01 C8 FF 00 02 00 06 07 00 03 07 00 F2 01 01 01 01 00 02 07 01 C8 01 5D 07 01 C8 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 06 07 00 03 07 00 F2 01 01 01 01 00 01 07 01 C8 45 07 00 34 40 07 05 50 4F 07 00 34 FF 00 00 00 06 07 00 03 07 00 F2 01 01 01 01 00 05 07 05 50 07 05 84 07 00 F2 01 01 45 07 00 34 00 4F 07 01 C8 FF 00 02 00 06 07 00 03 07 00 F2 01 01 01 01 00 02 07 01 C8 01 5D 07 01 C8 42 07 00 34 40 07 01 C8 45 07 00 34 40 07 05 50 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 06 07 00 03 07 00 F2 01 01 01 01 00 00 45 07 00 34 00 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 06 07 00 03 07 00 F2 01 01 01 01 00 00 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 42 07 00 34 00 45 07 00 34 00 40 07 05 50 41 07 01 C8 41 07 00 03 01 01 FA 00 01 41 01 FF 00 01 00 05 07 00 03 07 00 F2 01 01 01 00 02 07 05 50 02 FF 00 01 00 06 07 00 03 07 00 F2 01 01 01 01 00 01 07 01 C8 FF 00 01 00 05 07 00 03 07 00 F2 01 01 01 00 01 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     719    727    Any
        //  719    727    719    727    Any
        //  735    737    3      8      Ljava/lang/AssertionError;
        //  27     34     34     35     Any
        //  27     34     3      8      Any
        //  28     34     34     35     Any
        //  28     34     27     28     Ljava/lang/ArithmeticException;
        //  27     34     3      8      Any
        //  83     90     90     91     Any
        //  83     90     83     84     Ljava/lang/IllegalStateException;
        //  84     90     90     91     Ljava/lang/ArithmeticException;
        //  84     90     3      8      Any
        //  83     90     3      8      Any
        //  97     104    104    105    Any
        //  97     104    97     98     Ljava/lang/IndexOutOfBoundsException;
        //  98     104    104    105    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  97     104    104    105    Ljava/lang/UnsupportedOperationException;
        //  98     104    104    105    Ljava/lang/IndexOutOfBoundsException;
        //  108    115    115    116    Any
        //  108    115    108    109    Ljava/lang/UnsupportedOperationException;
        //  108    115    3      8      Any
        //  109    115    3      8      Ljava/lang/RuntimeException;
        //  108    115    108    109    Any
        //  123    130    130    131    Any
        //  123    130    123    124    Ljava/lang/NullPointerException;
        //  123    130    130    131    Ljava/lang/StringIndexOutOfBoundsException;
        //  123    130    123    124    Ljava/util/ConcurrentModificationException;
        //  123    130    130    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  186    193    193    194    Any
        //  187    193    3      8      Ljava/lang/RuntimeException;
        //  186    193    193    194    Ljava/lang/IllegalStateException;
        //  187    193    3      8      Ljava/util/ConcurrentModificationException;
        //  187    193    186    187    Ljava/lang/NegativeArraySizeException;
        //  197    204    204    205    Any
        //  198    204    197    198    Ljava/lang/UnsupportedOperationException;
        //  198    204    3      8      Any
        //  197    204    3      8      Ljava/lang/IllegalArgumentException;
        //  197    204    3      8      Any
        //  208    215    215    216    Any
        //  208    215    215    216    Ljava/lang/NegativeArraySizeException;
        //  209    215    3      8      Any
        //  208    215    3      8      Any
        //  208    215    208    209    Any
        //  335    342    342    343    Any
        //  336    342    342    343    Ljava/lang/IllegalStateException;
        //  336    342    342    343    Any
        //  336    342    335    336    Ljava/lang/IllegalArgumentException;
        //  335    342    342    343    Any
        //  397    404    404    405    Any
        //  398    404    397    398    Ljava/lang/RuntimeException;
        //  397    404    404    405    Any
        //  398    404    397    398    Any
        //  397    404    397    398    Ljava/lang/ClassCastException;
        //  552    558    558    559    Any
        //  552    558    558    559    Any
        //  552    558    558    559    Ljava/util/NoSuchElementException;
        //  552    558    558    559    Any
        //  552    558    3      8      Ljava/lang/AssertionError;
        //  575    582    582    583    Any
        //  575    582    3      8      Any
        //  576    582    582    583    Any
        //  576    582    3      8      Ljava/lang/NegativeArraySizeException;
        //  576    582    575    576    Any
        //  635    642    642    643    Any
        //  636    642    635    636    Any
        //  635    642    642    643    Ljava/lang/NegativeArraySizeException;
        //  636    642    3      8      Ljava/lang/ArithmeticException;
        //  635    642    3      8      Any
        //  651    657    657    658    Any
        //  651    657    657    658    Ljava/lang/NumberFormatException;
        //  651    657    3      8      Any
        //  651    657    3      8      Any
        //  651    657    657    658    Any
        //  662    668    668    669    Any
        //  662    668    668    669    Any
        //  662    668    668    669    Ljava/lang/RuntimeException;
        //  662    668    668    669    Ljava/lang/StringIndexOutOfBoundsException;
        //  662    668    668    669    Ljava/lang/NegativeArraySizeException;
        //  672    679    679    680    Any
        //  673    679    3      8      Ljava/lang/NumberFormatException;
        //  672    679    679    680    Any
        //  672    679    672    673    Any
        //  673    679    672    673    Ljava/lang/ArithmeticException;
        //  683    690    690    691    Any
        //  683    690    683    684    Any
        //  683    690    683    684    Ljava/lang/AssertionError;
        //  684    690    690    691    Any
        //  684    690    690    691    Ljava/util/NoSuchElementException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public int c(final EntityPlayer p0, final EntityPlayer p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          401
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            393
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            385
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -326765449
        //    33: goto            39
        //    36: ldc_w           1537069081
        //    39: ldc_w           -1691490339
        //    42: ixor           
        //    43: lookupswitch {
        //          1699499152: 36
        //          2007503786: 374
        //          default: 68
        //        }
        //    68: aload_2        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            81
        //    75: ldc_w           -447765541
        //    78: goto            84
        //    81: ldc_w           -502889472
        //    84: ldc_w           1875950549
        //    87: ixor           
        //    88: lookupswitch {
        //          -1969285106: 364
        //          2108736077: 81
        //          default: 116
        //        }
        //   116: aload_0        
        //   117: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   120: getstatic       dev/nuker/pyro/fc.1:I
        //   123: ifeq            132
        //   126: ldc_w           -1003138969
        //   129: goto            135
        //   132: ldc_w           1778055851
        //   135: ldc_w           -1223715592
        //   138: ixor           
        //   139: lookupswitch {
        //          -189920038: 132
        //          1933231263: 368
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   171: goto            175
        //   174: athrow         
        //   175: goto            179
        //   178: athrow         
        //   179: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   182: goto            186
        //   185: athrow         
        //   186: f2d            
        //   187: aload_1        
        //   188: aload_0        
        //   189: getstatic       dev/nuker/pyro/fc.c:I
        //   192: ifge            201
        //   195: ldc_w           -1076293434
        //   198: goto            204
        //   201: ldc_w           359109155
        //   204: ldc_w           885195702
        //   207: ixor           
        //   208: lookupswitch {
        //          -1961225360: 370
        //          1454447307: 201
        //          default: 236
        //        }
        //   236: getfield        dev/nuker/pyro/f9U.c:Lnet/minecraft/client/Minecraft;
        //   239: getstatic       dev/nuker/pyro/fc.0:I
        //   242: ifeq            251
        //   245: ldc_w           1671627545
        //   248: goto            254
        //   251: ldc_w           -455643286
        //   254: ldc_w           -1905394022
        //   257: ixor           
        //   258: lookupswitch {
        //          -794997275: 251
        //          -305201789: 366
        //          default: 284
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   291: goto            295
        //   294: athrow         
        //   295: goto            299
        //   298: athrow         
        //   299: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   302: goto            306
        //   305: athrow         
        //   306: f2d            
        //   307: getstatic       dev/nuker/pyro/fc.1:I
        //   310: ifeq            319
        //   313: ldc_w           -611548836
        //   316: goto            322
        //   319: ldc_w           1850764580
        //   322: ldc_w           388080144
        //   325: ixor           
        //   326: lookupswitch {
        //          -861068468: 319
        //          2037501748: 352
        //          default: 372
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokestatic    java/lang/Double.compare:(DD)I
        //   359: goto            363
        //   362: athrow         
        //   363: ireturn        
        //   364: aconst_null    
        //   365: athrow         
        //   366: aconst_null    
        //   367: athrow         
        //   368: aconst_null    
        //   369: athrow         
        //   370: aconst_null    
        //   371: athrow         
        //   372: aconst_null    
        //   373: athrow         
        //   374: aconst_null    
        //   375: athrow         
        //   376: pop            
        //   377: goto            24
        //   380: pop            
        //   381: aconst_null    
        //   382: goto            376
        //   385: dup            
        //   386: ifnull          376
        //   389: checkcast       Ljava/lang/Throwable;
        //   392: athrow         
        //   393: dup            
        //   394: ifnull          380
        //   397: checkcast       Ljava/lang/Throwable;
        //   400: athrow         
        //   401: aconst_null    
        //   402: athrow         
        //    StackMapTable: 00 35 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FE 00 03 07 00 03 07 00 36 07 00 36 0B 42 01 1C 4C 07 00 36 FF 00 02 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 01 5F 07 00 36 FF 00 0F 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 C8 FF 00 02 00 03 07 00 03 07 00 36 07 00 36 00 03 07 00 36 07 01 C8 01 FF 00 1C 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 C8 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 C8 45 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 CE 42 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 CE 45 07 00 34 40 02 FF 00 0E 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 00 03 FF 00 02 00 03 07 00 03 07 00 36 07 00 36 00 04 03 07 00 36 07 00 03 01 FF 00 1F 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 00 03 FF 00 0E 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 C8 FF 00 02 00 03 07 00 03 07 00 36 07 00 36 00 04 03 07 00 36 07 01 C8 01 FF 00 1D 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 C8 42 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 C8 45 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 CE 42 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 CE 45 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 02 03 02 FF 00 0C 00 03 07 00 03 07 00 36 07 00 36 00 02 03 03 FF 00 02 00 03 07 00 03 07 00 36 07 00 36 00 03 03 03 01 FF 00 1D 00 03 07 00 03 07 00 36 07 00 36 00 02 03 03 42 07 00 34 FF 00 00 00 03 07 00 03 07 00 36 07 00 36 00 02 03 03 45 07 00 34 40 01 40 07 00 36 FF 00 01 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 01 C8 FF 00 01 00 03 07 00 03 07 00 36 07 00 36 00 02 07 00 36 07 01 C8 FF 00 01 00 03 07 00 03 07 00 36 07 00 36 00 03 03 07 00 36 07 00 03 FF 00 01 00 03 07 00 03 07 00 36 07 00 36 00 02 03 03 01 41 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     385    393    Any
        //  385    393    385    393    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  401    403    3      8      Any
        //  168    174    174    175    Any
        //  168    174    174    175    Any
        //  168    174    3      8      Ljava/lang/UnsupportedOperationException;
        //  168    174    174    175    Any
        //  168    174    3      8      Ljava/lang/IllegalStateException;
        //  178    185    185    186    Any
        //  178    185    178    179    Any
        //  179    185    185    186    Any
        //  178    185    185    186    Any
        //  178    185    178    179    Any
        //  287    294    294    295    Any
        //  287    294    287    288    Any
        //  287    294    294    295    Ljava/lang/NegativeArraySizeException;
        //  287    294    287    288    Ljava/lang/RuntimeException;
        //  288    294    287    288    Ljava/util/ConcurrentModificationException;
        //  298    305    305    306    Any
        //  299    305    305    306    Any
        //  299    305    305    306    Any
        //  298    305    305    306    Ljava/lang/NegativeArraySizeException;
        //  299    305    298    299    Any
        //  355    362    362    363    Any
        //  356    362    362    363    Ljava/util/ConcurrentModificationException;
        //  355    362    355    356    Any
        //  355    362    3      8      Any
        //  355    362    355    356    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:586)
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
