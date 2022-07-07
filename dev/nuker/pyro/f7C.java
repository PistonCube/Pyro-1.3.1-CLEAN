// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.math.BlockPos;
import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f7C extends fH
{
    public f0f<f7B> c;
    public f0a c;
    public boolean c;
    public float c;
    
    @f06
    @LauncherEventHide
    public void c(final f30 f30) {
        fbS.7i(this, 1893530039, f30);
    }
    
    public void c(final BlockPos p0, final CallbackInfoReturnable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1658
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1650
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1642
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             1112462307
        //    32: goto            37
        //    35: ldc             1518790173
        //    37: ldc             -1121618394
        //    39: ixor           
        //    40: lookupswitch {
        //          -408711109: 68
        //          -9722427: 35
        //          default: 1621
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //    72: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    75: ifnull          83
        //    78: ldc             -1494917307
        //    80: goto            85
        //    83: ldc             -1494917306
        //    85: ldc             1660791336
        //    87: ixor           
        //    88: tableswitch {
        //          -2009994534: 112
        //          -2009994533: 272
        //          default: 78
        //        }
        //   112: getstatic       dev/nuker/pyro/fc.0:I
        //   115: ifeq            123
        //   118: ldc             1302831819
        //   120: goto            125
        //   123: ldc             -1641310513
        //   125: ldc             708990724
        //   127: ixor           
        //   128: lookupswitch {
        //          444532131: 123
        //          1743123919: 1625
        //          default: 156
        //        }
        //   156: aload_0        
        //   157: getstatic       dev/nuker/pyro/fc.0:I
        //   160: ifeq            168
        //   163: ldc             1538075601
        //   165: goto            170
        //   168: ldc             1799281713
        //   170: ldc             -634060466
        //   172: ixor           
        //   173: lookupswitch {
        //          -2120734049: 1599
        //          708042048: 168
        //          default: 200
        //        }
        //   200: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: ifnull          214
        //   209: ldc             1261746032
        //   211: goto            216
        //   214: ldc             1261746035
        //   216: ldc             -2053859095
        //   218: ixor           
        //   219: tableswitch {
        //          -1656725710: 240
        //          -1656725709: 272
        //          default: 209
        //        }
        //   240: aload_0        
        //   241: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/fw;
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   251: goto            255
        //   254: athrow         
        //   255: checkcast       Ljava/lang/Boolean;
        //   258: goto            262
        //   261: athrow         
        //   262: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   265: goto            269
        //   268: athrow         
        //   269: ifne            273
        //   272: return         
        //   273: aload_0        
        //   274: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   277: goto            281
        //   280: athrow         
        //   281: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   284: goto            288
        //   287: athrow         
        //   288: getstatic       dev/nuker/pyro/f7B.0:Ldev/nuker/pyro/f7B;
        //   291: if_acmpne       295
        //   294: return         
        //   295: aload_0        
        //   296: getstatic       dev/nuker/pyro/fc.c:I
        //   299: ifge            307
        //   302: ldc             1880850598
        //   304: goto            309
        //   307: ldc             288496701
        //   309: ldc             -2035418503
        //   311: ixor           
        //   312: lookupswitch {
        //          -978611215: 307
        //          -155813153: 1601
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   dev/nuker/pyro/f7C.1:()Z
        //   347: goto            351
        //   350: athrow         
        //   351: ifeq            355
        //   354: return         
        //   355: aload_0        
        //   356: getstatic       dev/nuker/pyro/fc.0:I
        //   359: ifeq            367
        //   362: ldc             1327334209
        //   364: goto            369
        //   367: ldc             337356770
        //   369: ldc             1672859604
        //   371: ixor           
        //   372: lookupswitch {
        //          749227157: 367
        //          2007918646: 400
        //          default: 1613
        //        }
        //   400: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   403: getstatic       dev/nuker/pyro/fc.c:I
        //   406: ifge            414
        //   409: ldc             2008393989
        //   411: goto            416
        //   414: ldc             -1071230224
        //   416: ldc             1230285413
        //   418: ixor           
        //   419: lookupswitch {
        //          1054933856: 1629
        //          1109403759: 414
        //          default: 444
        //        }
        //   444: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184838_M:()Z
        //   454: goto            458
        //   457: athrow         
        //   458: ifne            466
        //   461: ldc             108394980
        //   463: goto            468
        //   466: ldc             108394979
        //   468: ldc             875526839
        //   470: ixor           
        //   471: tableswitch {
        //          1689585318: 492
        //          1689585319: 1590
        //          default: 461
        //        }
        //   492: aload_0        
        //   493: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   496: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   499: goto            503
        //   502: athrow         
        //   503: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //   506: goto            510
        //   509: athrow         
        //   510: ifne            1590
        //   513: aload_2        
        //   514: goto            518
        //   517: athrow         
        //   518: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.cancel:()V
        //   521: goto            525
        //   524: athrow         
        //   525: aload_2        
        //   526: getstatic       net/minecraft/block/Block.field_185505_j:Lnet/minecraft/util/math/AxisAlignedBB;
        //   529: goto            533
        //   532: athrow         
        //   533: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   536: goto            540
        //   539: athrow         
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            551
        //   546: ldc             1286408474
        //   548: goto            553
        //   551: ldc             -357922774
        //   553: ldc             -2050817915
        //   555: ixor           
        //   556: lookupswitch {
        //          -915535457: 551
        //          1869187247: 584
        //          default: 1607
        //        }
        //   584: aload_0        
        //   585: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   588: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   591: goto            595
        //   594: athrow         
        //   595: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   598: goto            602
        //   601: athrow         
        //   602: ifnull          643
        //   605: aload_2        
        //   606: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //   609: dup            
        //   610: dconst_0       
        //   611: dconst_0       
        //   612: dconst_0       
        //   613: dconst_1       
        //   614: ldc2_w          0.949999988079071
        //   617: dconst_1       
        //   618: goto            622
        //   621: athrow         
        //   622: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
        //   625: goto            629
        //   628: athrow         
        //   629: goto            633
        //   632: athrow         
        //   633: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   636: goto            640
        //   639: athrow         
        //   640: goto            1590
        //   643: aload_0        
        //   644: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   647: goto            651
        //   650: athrow         
        //   651: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   654: goto            658
        //   657: athrow         
        //   658: getstatic       dev/nuker/pyro/f7B.0:Ldev/nuker/pyro/f7B;
        //   661: if_acmpne       1141
        //   664: getstatic       dev/nuker/pyro/fc.c:I
        //   667: ifge            675
        //   670: ldc             -767230479
        //   672: goto            677
        //   675: ldc             866057549
        //   677: ldc             -812621114
        //   679: ixor           
        //   680: lookupswitch {
        //          -66150517: 708
        //          500473655: 675
        //          default: 1603
        //        }
        //   708: aload_0        
        //   709: goto            713
        //   712: athrow         
        //   713: invokevirtual   dev/nuker/pyro/f7C.c:()Z
        //   716: goto            720
        //   719: athrow         
        //   720: ifeq            1590
        //   723: aload_2        
        //   724: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //   727: dup            
        //   728: aload_1        
        //   729: goto            733
        //   732: athrow         
        //   733: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   736: goto            740
        //   739: athrow         
        //   740: i2d            
        //   741: aload_1        
        //   742: goto            746
        //   745: athrow         
        //   746: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   749: goto            753
        //   752: athrow         
        //   753: i2d            
        //   754: aload_1        
        //   755: getstatic       dev/nuker/pyro/fc.1:I
        //   758: ifeq            766
        //   761: ldc             1902398558
        //   763: goto            768
        //   766: ldc             1162995461
        //   768: ldc             529283405
        //   770: ixor           
        //   771: lookupswitch {
        //          -1203800027: 766
        //          1860728083: 1591
        //          default: 796
        //        }
        //   796: goto            800
        //   799: athrow         
        //   800: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   803: goto            807
        //   806: athrow         
        //   807: i2d            
        //   808: getstatic       dev/nuker/pyro/fc.c:I
        //   811: ifge            819
        //   814: ldc             -116276213
        //   816: goto            821
        //   819: ldc             1843067959
        //   821: ldc             1023268868
        //   823: ixor           
        //   824: lookupswitch {
        //          -974382065: 819
        //          1361519667: 852
        //          default: 1631
        //        }
        //   852: aload_1        
        //   853: goto            857
        //   856: athrow         
        //   857: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   860: goto            864
        //   863: athrow         
        //   864: i2d            
        //   865: aload_1        
        //   866: goto            870
        //   869: athrow         
        //   870: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   873: goto            877
        //   876: athrow         
        //   877: i2d            
        //   878: aload_0        
        //   879: getstatic       dev/nuker/pyro/fc.c:I
        //   882: ifge            890
        //   885: ldc             2024858511
        //   887: goto            892
        //   890: ldc             -405536923
        //   892: ldc             338401975
        //   894: ixor           
        //   895: lookupswitch {
        //          -2044454902: 890
        //          1822128440: 1593
        //          default: 920
        //        }
        //   920: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   923: getstatic       dev/nuker/pyro/fc.c:I
        //   926: ifge            934
        //   929: ldc             1977780040
        //   931: goto            936
        //   934: ldc             1250853795
        //   936: ldc             451749930
        //   938: ixor           
        //   939: lookupswitch {
        //          -803493544: 934
        //          1863298914: 1595
        //          default: 964
        //        }
        //   964: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   967: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   970: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //   973: ifeq            981
        //   976: ldc             -937442938
        //   978: goto            983
        //   981: ldc             -937442937
        //   983: ldc             -363765616
        //   985: ixor           
        //   986: tableswitch {
        //          1151156780: 1008
        //          1151156781: 1014
        //          default: 976
        //        }
        //  1008: ldc2_w          0.95
        //  1011: goto            1017
        //  1014: ldc2_w          0.99
        //  1017: dadd           
        //  1018: getstatic       dev/nuker/pyro/fc.0:I
        //  1021: ifeq            1029
        //  1024: ldc             1968698504
        //  1026: goto            1031
        //  1029: ldc             -1220700766
        //  1031: ldc             -918698017
        //  1033: ixor           
        //  1034: lookupswitch {
        //          -1133890729: 1029
        //          2113950333: 1060
        //          default: 1615
        //        }
        //  1060: aload_1        
        //  1061: goto            1065
        //  1064: athrow         
        //  1065: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: i2d            
        //  1073: getstatic       dev/nuker/pyro/fc.c:I
        //  1076: ifge            1084
        //  1079: ldc             -976139486
        //  1081: goto            1086
        //  1084: ldc             577674560
        //  1086: ldc             -1843532187
        //  1088: ixor           
        //  1089: lookupswitch {
        //          467505737: 1084
        //          1473029447: 1605
        //          default: 1116
        //        }
        //  1116: goto            1120
        //  1119: athrow         
        //  1120: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
        //  1123: goto            1127
        //  1126: athrow         
        //  1127: goto            1131
        //  1130: athrow         
        //  1131: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //  1134: goto            1138
        //  1137: athrow         
        //  1138: goto            1590
        //  1141: getstatic       dev/nuker/pyro/fc.1:I
        //  1144: ifeq            1152
        //  1147: ldc             -130462300
        //  1149: goto            1154
        //  1152: ldc             -1032378557
        //  1154: ldc             207997018
        //  1156: ixor           
        //  1157: lookupswitch {
        //          -837619943: 1184
        //          -195262978: 1152
        //          default: 1609
        //        }
        //  1184: aload_0        
        //  1185: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: getstatic       dev/nuker/pyro/fc.c:I
        //  1202: ifge            1210
        //  1205: ldc             -2033586763
        //  1207: goto            1212
        //  1210: ldc             1698854175
        //  1212: ldc             -1381359348
        //  1214: ixor           
        //  1215: lookupswitch {
        //          -2104461581: 1210
        //          727960761: 1619
        //          default: 1240
        //        }
        //  1240: getstatic       dev/nuker/pyro/f7B.1:Ldev/nuker/pyro/f7B;
        //  1243: if_acmpne       1590
        //  1246: aload_0        
        //  1247: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1250: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1253: goto            1257
        //  1256: athrow         
        //  1257: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: ifne            1590
        //  1267: aload_2        
        //  1268: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //  1271: dup            
        //  1272: getstatic       dev/nuker/pyro/fc.1:I
        //  1275: ifeq            1283
        //  1278: ldc             -1430737841
        //  1280: goto            1285
        //  1283: ldc             124612074
        //  1285: ldc             519441901
        //  1287: ixor           
        //  1288: lookupswitch {
        //          -1269915230: 1283
        //          429613063: 1316
        //          default: 1627
        //        }
        //  1316: aload_1        
        //  1317: goto            1321
        //  1320: athrow         
        //  1321: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  1324: goto            1328
        //  1327: athrow         
        //  1328: i2d            
        //  1329: getstatic       dev/nuker/pyro/fc.0:I
        //  1332: ifeq            1340
        //  1335: ldc             -1212177385
        //  1337: goto            1342
        //  1340: ldc             -1745430982
        //  1342: ldc             -1496713012
        //  1344: ixor           
        //  1345: lookupswitch {
        //          292969691: 1611
        //          878192000: 1340
        //          default: 1372
        //        }
        //  1372: aload_1        
        //  1373: getstatic       dev/nuker/pyro/fc.c:I
        //  1376: ifge            1384
        //  1379: ldc             1776444918
        //  1381: goto            1386
        //  1384: ldc             2094949654
        //  1386: ldc             1768504147
        //  1388: ixor           
        //  1389: lookupswitch {
        //          -1683890104: 1384
        //          9133733: 1617
        //          default: 1416
        //        }
        //  1416: goto            1420
        //  1419: athrow         
        //  1420: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: i2d            
        //  1428: aload_1        
        //  1429: getstatic       dev/nuker/pyro/fc.1:I
        //  1432: ifeq            1440
        //  1435: ldc             -439090412
        //  1437: goto            1442
        //  1440: ldc             527055787
        //  1442: ldc             -951751319
        //  1444: ixor           
        //  1445: lookupswitch {
        //          579956349: 1623
        //          824863535: 1440
        //          default: 1472
        //        }
        //  1472: goto            1476
        //  1475: athrow         
        //  1476: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: i2d            
        //  1484: aload_1        
        //  1485: goto            1489
        //  1488: athrow         
        //  1489: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  1492: goto            1496
        //  1495: athrow         
        //  1496: i2d            
        //  1497: aload_1        
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: i2d            
        //  1510: ldc2_w          0.96
        //  1513: dadd           
        //  1514: aload_1        
        //  1515: getstatic       dev/nuker/pyro/fc.0:I
        //  1518: ifeq            1526
        //  1521: ldc             1825883332
        //  1523: goto            1528
        //  1526: ldc             -399840761
        //  1528: ldc             1391387208
        //  1530: ixor           
        //  1531: lookupswitch {
        //          -1161557937: 1556
        //          1043998348: 1526
        //          default: 1597
        //        }
        //  1556: goto            1560
        //  1559: athrow         
        //  1560: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1563: goto            1567
        //  1566: athrow         
        //  1567: i2d            
        //  1568: goto            1572
        //  1571: athrow         
        //  1572: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
        //  1575: goto            1579
        //  1578: athrow         
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //  1586: goto            1590
        //  1589: athrow         
        //  1590: return         
        //  1591: aconst_null    
        //  1592: athrow         
        //  1593: aconst_null    
        //  1594: athrow         
        //  1595: aconst_null    
        //  1596: athrow         
        //  1597: aconst_null    
        //  1598: athrow         
        //  1599: aconst_null    
        //  1600: athrow         
        //  1601: aconst_null    
        //  1602: athrow         
        //  1603: aconst_null    
        //  1604: athrow         
        //  1605: aconst_null    
        //  1606: athrow         
        //  1607: aconst_null    
        //  1608: athrow         
        //  1609: aconst_null    
        //  1610: athrow         
        //  1611: aconst_null    
        //  1612: athrow         
        //  1613: aconst_null    
        //  1614: athrow         
        //  1615: aconst_null    
        //  1616: athrow         
        //  1617: aconst_null    
        //  1618: athrow         
        //  1619: aconst_null    
        //  1620: athrow         
        //  1621: aconst_null    
        //  1622: athrow         
        //  1623: aconst_null    
        //  1624: athrow         
        //  1625: aconst_null    
        //  1626: athrow         
        //  1627: aconst_null    
        //  1628: athrow         
        //  1629: aconst_null    
        //  1630: athrow         
        //  1631: aconst_null    
        //  1632: athrow         
        //  1633: pop            
        //  1634: goto            24
        //  1637: pop            
        //  1638: aconst_null    
        //  1639: goto            1633
        //  1642: dup            
        //  1643: ifnull          1633
        //  1646: checkcast       Ljava/lang/Throwable;
        //  1649: athrow         
        //  1650: dup            
        //  1651: ifnull          1637
        //  1654: checkcast       Ljava/lang/Throwable;
        //  1657: athrow         
        //  1658: aconst_null    
        //  1659: athrow         
        //    StackMapTable: 00 F1 43 07 00 3E 04 FF 00 0B 00 00 00 01 07 00 3E FE 00 03 07 00 03 07 00 B5 07 00 91 0A 41 01 1E 09 04 41 01 1A 0A 41 01 1E 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 03 01 5D 07 00 03 08 04 41 01 17 46 07 00 1E 40 07 00 62 45 07 00 3E 40 07 00 FC 45 07 00 3E 40 07 00 67 45 07 00 3E 40 01 02 00 46 07 00 3E 40 07 00 6F 45 07 00 3E 40 07 00 FC 06 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 03 01 5E 07 00 03 42 07 00 3E 40 07 00 03 45 07 00 3E 40 01 03 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 03 01 5E 07 00 03 4D 07 00 49 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 49 01 5B 07 00 49 45 07 00 3E 40 07 00 86 45 07 00 3E 40 01 02 04 41 01 17 FF 00 09 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 01 07 00 86 45 07 00 3E 40 01 46 07 00 3E 40 07 00 91 45 07 00 3E 00 46 07 00 2E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 45 07 00 3E 00 0A 41 01 1E 49 07 00 3E 40 07 00 86 45 07 00 3E 40 07 00 FE 52 07 00 1C FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 5E 08 02 5E 03 03 03 03 03 03 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 42 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 45 07 00 3E 00 02 46 07 00 1C 40 07 00 6F 45 07 00 3E 40 07 00 FC 10 41 01 1E 43 07 00 3E 40 07 00 03 45 07 00 3E 40 01 FF 00 0B 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 02 D4 08 02 D4 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 02 D4 08 02 D4 01 FF 00 04 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 02 D4 08 02 D4 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 02 D4 08 02 D4 03 01 FF 00 0C 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 07 00 B5 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 02 D4 08 02 D4 03 03 07 00 B5 01 FF 00 1B 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 07 00 B5 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 01 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 02 D4 08 02 D4 03 03 03 01 FF 00 1E 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 03 43 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 02 D4 08 02 D4 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 02 D4 08 02 D4 03 03 03 01 44 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 01 FF 00 0C 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 0A 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 03 01 FF 00 1B 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 03 FF 00 0D 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 49 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 0A 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 49 01 FF 00 1B 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 49 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 04 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 01 FF 00 18 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 05 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 02 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 01 FF 00 1C 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 43 07 00 24 FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 01 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 0A 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 01 FF 00 1D 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 42 07 00 30 FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 42 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 45 07 00 3E 00 02 0A 41 01 1D 46 07 00 3E 40 07 00 6F 45 07 00 3E 40 07 00 FC 4A 07 00 FC FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 FC 01 5B 07 00 FC FF 00 0F 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 01 07 00 86 45 07 00 3E 40 01 FF 00 12 00 03 07 00 03 07 00 B5 07 00 91 00 03 07 00 91 08 04 F4 08 04 F4 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 01 FF 00 1E 00 03 07 00 03 07 00 B5 07 00 91 00 03 07 00 91 08 04 F4 08 04 F4 43 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 01 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 01 FF 00 1D 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 03 FF 00 0B 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 07 00 B5 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 07 00 B5 01 FF 00 1D 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 07 00 B5 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 01 FF 00 0C 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 03 07 00 B5 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 04 F4 08 04 F4 03 03 07 00 B5 01 FF 00 1D 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 03 07 00 B5 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 03 01 44 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 04 F4 08 04 F4 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 07 07 00 91 08 04 F4 08 04 F4 03 03 03 01 44 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 04 F4 08 04 F4 03 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 04 F4 08 04 F4 03 03 03 03 01 FF 00 10 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 07 00 B5 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 0A 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 07 00 B5 01 FF 00 1B 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 07 00 B5 42 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 07 00 B5 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 01 43 07 00 28 FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 03 45 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 02 07 00 91 07 00 A8 45 07 00 3E 00 FF 00 00 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 07 00 B5 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 07 00 49 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 04 F4 08 04 F4 03 03 03 03 03 07 00 B5 41 07 00 03 41 07 00 03 01 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 09 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 03 01 01 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 04 07 00 91 08 04 F4 08 04 F4 03 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 08 07 00 91 08 02 D4 08 02 D4 03 03 03 03 03 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 05 07 00 91 08 04 F4 08 04 F4 03 07 00 B5 41 07 00 FC 01 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 04 F4 08 04 F4 03 03 07 00 B5 01 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 03 07 00 91 08 04 F4 08 04 F4 41 07 00 49 FF 00 01 00 03 07 00 03 07 00 B5 07 00 91 00 06 07 00 91 08 02 D4 08 02 D4 03 03 03 41 07 00 3E 43 05 44 07 00 3E 47 05 47 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1642   1650   Any
        //  1642   1650   1642   1650   Ljava/lang/NullPointerException;
        //  1658   1660   3      8      Ljava/lang/UnsupportedOperationException;
        //  247    254    254    255    Any
        //  248    254    254    255    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  247    254    247    248    Ljava/lang/EnumConstantNotPresentException;
        //  248    254    254    255    Any
        //  248    254    3      8      Any
        //  261    268    268    269    Any
        //  262    268    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  262    268    261    262    Any
        //  261    268    3      8      Any
        //  262    268    3      8      Ljava/lang/NegativeArraySizeException;
        //  280    287    287    288    Any
        //  281    287    280    281    Any
        //  281    287    287    288    Any
        //  280    287    3      8      Any
        //  281    287    287    288    Ljava/util/ConcurrentModificationException;
        //  343    350    350    351    Any
        //  343    350    343    344    Any
        //  344    350    350    351    Ljava/lang/NumberFormatException;
        //  344    350    343    344    Any
        //  344    350    3      8      Any
        //  450    457    457    458    Any
        //  451    457    3      8      Any
        //  450    457    450    451    Any
        //  451    457    3      8      Ljava/lang/NullPointerException;
        //  450    457    450    451    Ljava/lang/IllegalStateException;
        //  503    509    509    510    Any
        //  503    509    3      8      Ljava/lang/NullPointerException;
        //  503    509    3      8      Ljava/lang/RuntimeException;
        //  503    509    3      8      Ljava/util/NoSuchElementException;
        //  503    509    3      8      Any
        //  517    524    524    525    Any
        //  517    524    3      8      Any
        //  517    524    517    518    Any
        //  518    524    3      8      Ljava/lang/AssertionError;
        //  517    524    524    525    Any
        //  532    539    539    540    Any
        //  532    539    539    540    Any
        //  533    539    3      8      Ljava/lang/ArithmeticException;
        //  532    539    532    533    Ljava/lang/AssertionError;
        //  532    539    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  594    601    601    602    Any
        //  594    601    594    595    Any
        //  595    601    601    602    Any
        //  595    601    3      8      Ljava/lang/NumberFormatException;
        //  594    601    594    595    Any
        //  621    628    628    629    Any
        //  621    628    621    622    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  621    628    3      8      Ljava/lang/UnsupportedOperationException;
        //  622    628    628    629    Ljava/lang/ClassCastException;
        //  621    628    3      8      Any
        //  632    639    639    640    Any
        //  632    639    639    640    Any
        //  633    639    632    633    Any
        //  632    639    3      8      Any
        //  632    639    632    633    Ljava/lang/AssertionError;
        //  650    657    657    658    Any
        //  651    657    650    651    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  651    657    657    658    Any
        //  651    657    657    658    Ljava/util/ConcurrentModificationException;
        //  651    657    657    658    Ljava/lang/ClassCastException;
        //  712    719    719    720    Any
        //  713    719    712    713    Any
        //  712    719    712    713    Any
        //  712    719    3      8      Ljava/lang/NegativeArraySizeException;
        //  713    719    3      8      Ljava/lang/IllegalStateException;
        //  733    739    739    740    Any
        //  733    739    3      8      Ljava/lang/IllegalStateException;
        //  733    739    3      8      Any
        //  733    739    739    740    Any
        //  733    739    739    740    Any
        //  746    752    752    753    Any
        //  746    752    3      8      Any
        //  746    752    3      8      Any
        //  746    752    752    753    Any
        //  746    752    3      8      Any
        //  800    806    806    807    Any
        //  800    806    806    807    Any
        //  800    806    806    807    Ljava/lang/NumberFormatException;
        //  800    806    806    807    Any
        //  800    806    806    807    Any
        //  856    863    863    864    Any
        //  857    863    856    857    Any
        //  856    863    856    857    Any
        //  856    863    3      8      Ljava/lang/NullPointerException;
        //  856    863    863    864    Ljava/util/ConcurrentModificationException;
        //  869    876    876    877    Any
        //  870    876    869    870    Any
        //  870    876    869    870    Any
        //  870    876    3      8      Ljava/lang/RuntimeException;
        //  870    876    876    877    Ljava/lang/EnumConstantNotPresentException;
        //  1064   1071   1071   1072   Any
        //  1064   1071   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1064   1071   1071   1072   Ljava/lang/IllegalStateException;
        //  1065   1071   1064   1065   Ljava/util/ConcurrentModificationException;
        //  1065   1071   3      8      Any
        //  1119   1126   1126   1127   Any
        //  1119   1126   1119   1120   Ljava/lang/ArithmeticException;
        //  1119   1126   3      8      Ljava/lang/NullPointerException;
        //  1120   1126   3      8      Ljava/lang/ArithmeticException;
        //  1119   1126   1126   1127   Any
        //  1130   1137   1137   1138   Any
        //  1130   1137   1130   1131   Ljava/lang/AssertionError;
        //  1130   1137   1130   1131   Ljava/lang/IllegalArgumentException;
        //  1131   1137   1137   1138   Any
        //  1131   1137   1137   1138   Ljava/lang/EnumConstantNotPresentException;
        //  1191   1198   1198   1199   Any
        //  1192   1198   1198   1199   Any
        //  1191   1198   1191   1192   Any
        //  1192   1198   1191   1192   Any
        //  1191   1198   3      8      Ljava/lang/ArithmeticException;
        //  1257   1263   1263   1264   Any
        //  1257   1263   1263   1264   Ljava/lang/NegativeArraySizeException;
        //  1257   1263   3      8      Any
        //  1257   1263   1263   1264   Ljava/lang/NumberFormatException;
        //  1257   1263   1263   1264   Ljava/lang/EnumConstantNotPresentException;
        //  1320   1327   1327   1328   Any
        //  1320   1327   1320   1321   Any
        //  1320   1327   3      8      Any
        //  1320   1327   1327   1328   Ljava/lang/NullPointerException;
        //  1321   1327   1320   1321   Ljava/lang/IndexOutOfBoundsException;
        //  1420   1426   1426   1427   Any
        //  1420   1426   1426   1427   Any
        //  1420   1426   1426   1427   Ljava/util/NoSuchElementException;
        //  1420   1426   3      8      Any
        //  1420   1426   1426   1427   Any
        //  1475   1482   1482   1483   Any
        //  1475   1482   1475   1476   Ljava/lang/IndexOutOfBoundsException;
        //  1476   1482   1482   1483   Ljava/lang/NumberFormatException;
        //  1475   1482   3      8      Ljava/lang/AssertionError;
        //  1476   1482   3      8      Ljava/lang/AssertionError;
        //  1488   1495   1495   1496   Any
        //  1488   1495   1495   1496   Ljava/lang/IndexOutOfBoundsException;
        //  1489   1495   3      8      Any
        //  1489   1495   1488   1489   Any
        //  1488   1495   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1501   1508   1508   1509   Any
        //  1502   1508   1501   1502   Any
        //  1502   1508   1508   1509   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1501   1508   1508   1509   Any
        //  1502   1508   1501   1502   Ljava/util/NoSuchElementException;
        //  1559   1566   1566   1567   Any
        //  1560   1566   1559   1560   Any
        //  1560   1566   1566   1567   Any
        //  1560   1566   1559   1560   Ljava/lang/RuntimeException;
        //  1559   1566   1559   1560   Any
        //  1571   1578   1578   1579   Any
        //  1571   1578   1571   1572   Ljava/lang/IllegalStateException;
        //  1572   1578   1578   1579   Ljava/lang/StringIndexOutOfBoundsException;
        //  1571   1578   1578   1579   Any
        //  1572   1578   3      8      Ljava/lang/NumberFormatException;
        //  1583   1589   1589   1590   Any
        //  1583   1589   1589   1590   Any
        //  1583   1589   1589   1590   Ljava/lang/ClassCastException;
        //  1583   1589   1589   1590   Ljava/lang/NegativeArraySizeException;
        //  1583   1589   3      8      Any
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
    
    public f7C() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2234\u1496\u8b3c\ub3cc\uc986"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2214\u1496\u8b3c\ub3cc\uc986"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u221f\u149f\u8b23\ub3d6\uc982\uec2b\ub264\ue71b\ud967\ue9f3\ua6b8\u1e58\ue029\uc5e7\u8176\u88a2\u57a8\u76cc\ubd7d\uc055\u2ac2\uc27b\u6bd8\u2d57\ud790\u345e\u7d39"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: new             Ldev/nuker/pyro/f0f;
        //    26: dup            
        //    27: ldc_w           "\u2233\u149c\u8b2b\ub3dc"
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            42
        //    36: ldc_w           1021509153
        //    39: goto            45
        //    42: ldc_w           -1452696756
        //    45: ldc_w           -936370682
        //    48: ixor           
        //    49: lookupswitch {
        //          -187506649: 42
        //          1633256778: 76
        //          default: 375
        //        }
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: ldc_w           "\u2213\u149c\u8b2b\ub3dc"
        //    82: invokestatic    invokestatic   !!! ERROR
        //    85: aconst_null    
        //    86: getstatic       dev/nuker/pyro/f7B.c:Ldev/nuker/pyro/f7B;
        //    89: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    92: getstatic       dev/nuker/pyro/fc.c:I
        //    95: ifge            104
        //    98: ldc_w           790961549
        //   101: goto            107
        //   104: ldc_w           -2053770069
        //   107: ldc_w           -118476097
        //   110: ixor           
        //   111: lookupswitch {
        //          -673894606: 383
        //          1844534981: 104
        //          default: 136
        //        }
        //   136: putfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   139: aload_0        
        //   140: new             Ldev/nuker/pyro/f0a;
        //   143: dup            
        //   144: ldc_w           "\u2230\u1490\u8b3f\ub3ea\uc981\uec2a\ub22d\ue701\ud97c"
        //   147: invokestatic    invokestatic   !!! ERROR
        //   150: ldc_w           "\u2210\u14b0\u8b1f\ub399\uc9a6\uec2c\ub236\ue70b\ud96b\ue9f2"
        //   153: getstatic       dev/nuker/pyro/fc.c:I
        //   156: ifge            165
        //   159: ldc_w           1627704599
        //   162: goto            168
        //   165: ldc_w           1525789769
        //   168: ldc_w           -614347257
        //   171: ixor           
        //   172: lookupswitch {
        //          -1167785200: 373
        //          1390916606: 165
        //          default: 200
        //        }
        //   200: invokestatic    invokestatic   !!! ERROR
        //   203: aconst_null    
        //   204: iconst_0       
        //   205: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   208: putfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0a;
        //   211: aload_0        
        //   212: iconst_0       
        //   213: getstatic       dev/nuker/pyro/fc.c:I
        //   216: ifge            225
        //   219: ldc_w           -536437450
        //   222: goto            228
        //   225: ldc_w           -477688285
        //   228: ldc_w           -1283694234
        //   231: ixor           
        //   232: lookupswitch {
        //          1095614449: 225
        //          1400568912: 381
        //          default: 260
        //        }
        //   260: putfield        dev/nuker/pyro/f7C.c:Z
        //   263: aload_0        
        //   264: getstatic       dev/nuker/pyro/fc.0:I
        //   267: ifeq            276
        //   270: ldc_w           -1447805166
        //   273: goto            279
        //   276: ldc_w           219056802
        //   279: ldc_w           877071821
        //   282: ixor           
        //   283: lookupswitch {
        //          -1645006113: 377
        //          -71080675: 276
        //          default: 308
        //        }
        //   308: aload_0        
        //   309: getstatic       dev/nuker/pyro/fc.0:I
        //   312: ifeq            321
        //   315: ldc_w           152945437
        //   318: goto            324
        //   321: ldc_w           -563022731
        //   324: ldc_w           866354110
        //   327: ixor           
        //   328: lookupswitch {
        //          985546915: 379
        //          1768820024: 321
        //          default: 356
        //        }
        //   356: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   359: invokevirtual   dev/nuker/pyro/f7C.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   362: pop            
        //   363: aload_0        
        //   364: aload_0        
        //   365: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0a;
        //   368: invokevirtual   dev/nuker/pyro/f7C.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   371: pop            
        //   372: return         
        //   373: aconst_null    
        //   374: athrow         
        //   375: aconst_null    
        //   376: athrow         
        //   377: aconst_null    
        //   378: athrow         
        //   379: aconst_null    
        //   380: athrow         
        //   381: aconst_null    
        //   382: athrow         
        //   383: aconst_null    
        //   384: athrow         
        //    StackMapTable: 00 18 FF 00 2A 00 01 07 00 03 00 04 07 00 03 08 00 17 08 00 17 07 01 39 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 00 17 08 00 17 07 01 39 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 00 17 08 00 17 07 01 39 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 6F FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 6F 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 6F FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 8C 08 00 8C 07 01 39 07 01 39 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 8C 08 00 8C 07 01 39 07 01 39 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 00 8C 08 00 8C 07 01 39 07 01 39 FF 00 18 00 01 07 00 03 00 02 07 00 03 01 FF 00 02 00 01 07 00 03 00 03 07 00 03 01 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 01 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 0C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 10 00 01 07 00 03 00 05 07 00 03 08 00 8C 08 00 8C 07 01 39 07 01 39 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 17 08 00 17 07 01 39 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 6F
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
    
    public boolean 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          993
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            985
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            977
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc_w           0.05
        //    27: fstore_1       
        //    28: aload_0        
        //    29: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //    32: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    35: ifnonnull       40
        //    38: iconst_0       
        //    39: ireturn        
        //    40: aload_0        
        //    41: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //    44: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    47: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70143_R:F
        //    50: ldc_w           3.0
        //    53: fcmpl          
        //    54: iflt            63
        //    57: ldc_w           183375968
        //    60: goto            66
        //    63: ldc_w           183375969
        //    66: ldc_w           1438003934
        //    69: ixor           
        //    70: tableswitch {
        //          -1095740036: 92
        //          -1095740035: 94
        //          default: 57
        //        }
        //    92: iconst_0       
        //    93: ireturn        
        //    94: aload_0        
        //    95: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //    98: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   101: ifnull          944
        //   104: getstatic       dev/nuker/pyro/fc.1:I
        //   107: ifeq            116
        //   110: ldc_w           2022772738
        //   113: goto            119
        //   116: ldc_w           1924751685
        //   119: ldc_w           405781836
        //   122: ixor           
        //   123: lookupswitch {
        //          771228325: 116
        //          1623108942: 966
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   152: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   155: getstatic       dev/nuker/pyro/fc.1:I
        //   158: ifeq            167
        //   161: ldc_w           -17908646
        //   164: goto            170
        //   167: ldc_w           -1619327578
        //   170: ldc_w           1691464265
        //   173: ixor           
        //   174: lookupswitch {
        //          -1707143661: 962
        //          -455036940: 167
        //          default: 200
        //        }
        //   200: goto            204
        //   203: athrow         
        //   204: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   207: goto            211
        //   210: athrow         
        //   211: ifnull          320
        //   214: aload_0        
        //   215: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   218: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   221: goto            225
        //   224: athrow         
        //   225: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   228: goto            232
        //   231: athrow         
        //   232: getstatic       dev/nuker/pyro/fc.0:I
        //   235: ifeq            244
        //   238: ldc_w           -760840284
        //   241: goto            247
        //   244: ldc_w           414702438
        //   247: ldc_w           1959746126
        //   250: ixor           
        //   251: lookupswitch {
        //          -1503058454: 244
        //          1819836712: 276
        //          default: 946
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   net/minecraft/entity/Entity.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   283: goto            287
        //   286: athrow         
        //   287: dconst_0       
        //   288: dconst_0       
        //   289: dconst_0       
        //   290: goto            294
        //   293: athrow         
        //   294: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_191195_a:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   297: goto            301
        //   300: athrow         
        //   301: dconst_0       
        //   302: ldc2_w          -0.05000000074505806
        //   305: dconst_0       
        //   306: goto            310
        //   309: athrow         
        //   310: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   313: goto            317
        //   316: athrow         
        //   317: goto            459
        //   320: getstatic       dev/nuker/pyro/fc.c:I
        //   323: ifge            332
        //   326: ldc_w           -365457713
        //   329: goto            335
        //   332: ldc_w           -700479125
        //   335: ldc_w           411043366
        //   338: ixor           
        //   339: lookupswitch {
        //          -222852887: 948
        //          975715277: 332
        //          default: 364
        //        }
        //   364: aload_0        
        //   365: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   368: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   371: goto            375
        //   374: athrow         
        //   375: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   378: goto            382
        //   381: athrow         
        //   382: dconst_0       
        //   383: dconst_0       
        //   384: dconst_0       
        //   385: goto            389
        //   388: athrow         
        //   389: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_191195_a:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   392: goto            396
        //   395: athrow         
        //   396: dconst_0       
        //   397: ldc2_w          -0.05000000074505806
        //   400: dconst_0       
        //   401: getstatic       dev/nuker/pyro/fc.0:I
        //   404: ifeq            413
        //   407: ldc_w           -1033247342
        //   410: goto            416
        //   413: ldc_w           1096547440
        //   416: ldc_w           -1318870709
        //   419: ixor           
        //   420: lookupswitch {
        //          74205250: 413
        //          1930052825: 958
        //          default: 448
        //        }
        //   448: goto            452
        //   451: athrow         
        //   452: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   455: goto            459
        //   458: athrow         
        //   459: getstatic       dev/nuker/pyro/fc.c:I
        //   462: ifge            471
        //   465: ldc_w           -1510324483
        //   468: goto            474
        //   471: ldc_w           -2120037464
        //   474: ldc_w           162974990
        //   477: ixor           
        //   478: lookupswitch {
        //          -1404269581: 960
        //          1562223506: 471
        //          default: 504
        //        }
        //   504: astore_2       
        //   505: iconst_0       
        //   506: istore_3       
        //   507: aload_2        
        //   508: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   511: d2i            
        //   512: istore          4
        //   514: aload_2        
        //   515: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   518: goto            522
        //   521: athrow         
        //   522: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   525: goto            529
        //   528: athrow         
        //   529: getstatic       dev/nuker/pyro/fc.1:I
        //   532: ifeq            541
        //   535: ldc_w           1395720311
        //   538: goto            544
        //   541: ldc_w           1214351553
        //   544: ldc_w           1183532973
        //   547: ixor           
        //   548: lookupswitch {
        //          250269548: 576
        //          364529626: 541
        //          default: 952
        //        }
        //   576: istore          5
        //   578: iload           5
        //   580: aload_2        
        //   581: getstatic       dev/nuker/pyro/fc.c:I
        //   584: ifge            593
        //   587: ldc_w           1462002906
        //   590: goto            596
        //   593: ldc_w           -168018684
        //   596: ldc_w           1790269757
        //   599: ixor           
        //   600: lookupswitch {
        //          -1622580167: 628
        //          1032928743: 593
        //          default: 950
        //        }
        //   628: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   631: dconst_1       
        //   632: dadd           
        //   633: goto            637
        //   636: athrow         
        //   637: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   640: goto            644
        //   643: athrow         
        //   644: if_icmpge       942
        //   647: getstatic       dev/nuker/pyro/fc.c:I
        //   650: ifge            659
        //   653: ldc_w           11048505
        //   656: goto            662
        //   659: ldc_w           161161107
        //   662: ldc_w           1687269635
        //   665: ixor           
        //   666: lookupswitch {
        //          759123334: 659
        //          1681467194: 954
        //          default: 692
        //        }
        //   692: aload_2        
        //   693: getstatic       dev/nuker/pyro/fc.c:I
        //   696: ifge            705
        //   699: ldc_w           -202837930
        //   702: goto            708
        //   705: ldc_w           163631467
        //   708: ldc_w           226228559
        //   711: ixor           
        //   712: lookupswitch {
        //          -1593364415: 705
        //          -23918311: 964
        //          default: 740
        //        }
        //   740: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   743: goto            747
        //   746: athrow         
        //   747: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   750: goto            754
        //   753: athrow         
        //   754: istore          6
        //   756: iload           6
        //   758: aload_2        
        //   759: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   762: dconst_1       
        //   763: dadd           
        //   764: goto            768
        //   767: athrow         
        //   768: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   771: goto            775
        //   774: athrow         
        //   775: if_icmpge       784
        //   778: ldc_w           1577668403
        //   781: goto            787
        //   784: ldc_w           1577668412
        //   787: ldc_w           -1395546508
        //   790: ixor           
        //   791: tableswitch {
        //          -441331058: 812
        //          -441331057: 936
        //          default: 778
        //        }
        //   812: aload_0        
        //   813: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   816: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   819: new             Lnet/minecraft/util/math/BlockPos;
        //   822: dup            
        //   823: iload           5
        //   825: iload           4
        //   827: iload           6
        //   829: goto            833
        //   832: athrow         
        //   833: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   836: goto            840
        //   839: athrow         
        //   840: goto            844
        //   843: athrow         
        //   844: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   847: goto            851
        //   850: athrow         
        //   851: goto            855
        //   854: athrow         
        //   855: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   860: goto            864
        //   863: athrow         
        //   864: getstatic       dev/nuker/pyro/fc.c:I
        //   867: ifge            876
        //   870: ldc_w           -2123990558
        //   873: goto            879
        //   876: ldc_w           -135461645
        //   879: ldc_w           991930734
        //   882: ixor           
        //   883: lookupswitch {
        //          -1166421876: 956
        //          546252449: 876
        //          default: 908
        //        }
        //   908: astore          7
        //   910: aload           7
        //   912: getstatic       net/minecraft/init/Blocks.field_150350_a:Lnet/minecraft/block/Block;
        //   915: if_acmpeq       930
        //   918: aload           7
        //   920: instanceof      Lnet/minecraft/block/BlockLiquid;
        //   923: ifne            928
        //   926: iconst_0       
        //   927: ireturn        
        //   928: iconst_1       
        //   929: istore_3       
        //   930: iinc            6, 1
        //   933: goto            756
        //   936: iinc            5, 1
        //   939: goto            578
        //   942: iload_3        
        //   943: ireturn        
        //   944: iconst_0       
        //   945: ireturn        
        //   946: aconst_null    
        //   947: athrow         
        //   948: aconst_null    
        //   949: athrow         
        //   950: aconst_null    
        //   951: athrow         
        //   952: aconst_null    
        //   953: athrow         
        //   954: aconst_null    
        //   955: athrow         
        //   956: aconst_null    
        //   957: athrow         
        //   958: aconst_null    
        //   959: athrow         
        //   960: aconst_null    
        //   961: athrow         
        //   962: aconst_null    
        //   963: athrow         
        //   964: aconst_null    
        //   965: athrow         
        //   966: aconst_null    
        //   967: athrow         
        //   968: pop            
        //   969: goto            24
        //   972: pop            
        //   973: aconst_null    
        //   974: goto            968
        //   977: dup            
        //   978: ifnull          968
        //   981: checkcast       Ljava/lang/Throwable;
        //   984: athrow         
        //   985: dup            
        //   986: ifnull          972
        //   989: checkcast       Ljava/lang/Throwable;
        //   992: athrow         
        //   993: aconst_null    
        //   994: athrow         
        //    StackMapTable: 00 83 FF 00 03 00 02 07 00 03 02 00 01 07 00 3E FA 00 04 FF 00 0B 00 00 00 01 07 00 3E FC 00 03 07 00 03 FC 00 0F 02 10 05 42 01 19 01 15 42 01 1C 52 07 00 86 FF 00 02 00 02 07 00 03 02 00 02 07 00 86 01 5D 07 00 86 42 07 00 3E 40 07 00 86 45 07 00 3E 40 07 00 FE FF 00 0C 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 02 00 01 07 00 86 45 07 00 3E 40 07 00 FE 4B 07 00 FE FF 00 02 00 02 07 00 03 02 00 02 07 00 FE 01 5C 07 00 FE 42 07 00 3E 40 07 00 FE 45 07 00 3E 40 07 00 A8 45 07 00 32 FF 00 00 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 45 07 00 3E 40 07 00 A8 FF 00 07 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 45 07 00 3E 40 07 00 A8 02 0B 42 01 1C 49 07 00 3E 40 07 00 86 45 07 00 3E 40 07 00 A8 45 07 00 3E FF 00 00 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 45 07 00 3E 40 07 00 A8 FF 00 10 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 FF 00 02 00 02 07 00 03 02 00 05 07 00 A8 03 03 03 01 FF 00 1F 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 42 07 00 36 FF 00 00 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 45 07 00 3E 40 07 00 A8 4B 07 00 A8 FF 00 02 00 02 07 00 03 02 00 02 07 00 A8 01 5D 07 00 A8 FF 00 10 00 05 07 00 03 02 07 00 A8 01 01 00 01 07 00 3E 40 03 45 07 00 3E 40 01 4B 01 FF 00 02 00 05 07 00 03 02 07 00 A8 01 01 00 02 01 01 5F 01 FC 00 01 01 FF 00 0E 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 01 07 00 A8 FF 00 02 00 06 07 00 03 02 07 00 A8 01 01 01 00 03 01 07 00 A8 01 FF 00 1F 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 01 07 00 A8 47 07 00 3E FF 00 00 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 01 03 45 07 00 3E FF 00 00 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 01 01 0E 42 01 1D 4C 07 00 A8 FF 00 02 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 07 00 A8 01 5F 07 00 A8 45 07 00 3E 40 03 45 07 00 3E 40 01 FC 00 01 01 4A 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 02 01 03 45 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 02 01 01 02 05 42 01 18 53 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 06 07 01 8B 08 03 33 08 03 33 01 01 01 45 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 02 07 01 8B 07 00 B5 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 02 07 01 8B 07 00 B5 45 07 00 3E 40 07 01 91 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 01 07 01 91 47 07 00 3E 40 07 00 97 4B 07 00 97 FF 00 02 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 02 07 00 97 01 5C 07 00 97 FC 00 13 07 00 97 01 FA 00 05 FA 00 05 FF 00 01 00 02 07 00 03 02 00 00 41 07 00 FE 01 FF 00 01 00 06 07 00 03 02 07 00 A8 01 01 01 00 02 01 07 00 A8 FF 00 01 00 05 07 00 03 02 07 00 A8 01 01 00 01 01 FC 00 01 01 FF 00 01 00 07 07 00 03 02 07 00 A8 01 01 01 01 00 01 07 00 97 FF 00 01 00 02 07 00 03 02 00 04 07 00 A8 03 03 03 41 07 00 A8 41 07 00 86 FF 00 01 00 06 07 00 03 02 07 00 A8 01 01 01 00 01 07 00 A8 FF 00 01 00 02 07 00 03 02 00 00 FF 00 01 00 01 07 00 03 00 01 07 00 3E 43 05 44 07 00 3E 47 05 FF 00 07 00 02 07 00 03 02 00 01 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     977    985    Any
        //  977    985    977    985    Ljava/lang/ArithmeticException;
        //  993    995    3      8      Any
        //  203    210    210    211    Any
        //  203    210    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  204    210    210    211    Any
        //  204    210    3      8      Ljava/lang/IllegalStateException;
        //  203    210    203    204    Any
        //  225    231    231    232    Any
        //  225    231    231    232    Ljava/lang/UnsupportedOperationException;
        //  225    231    3      8      Any
        //  225    231    3      8      Any
        //  225    231    231    232    Any
        //  279    286    286    287    Any
        //  280    286    279    280    Any
        //  279    286    279    280    Ljava/lang/IllegalStateException;
        //  280    286    3      8      Any
        //  280    286    286    287    Any
        //  293    300    300    301    Any
        //  293    300    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  293    300    3      8      Ljava/lang/NumberFormatException;
        //  294    300    300    301    Any
        //  293    300    293    294    Ljava/lang/ClassCastException;
        //  310    316    316    317    Any
        //  310    316    316    317    Any
        //  310    316    316    317    Any
        //  310    316    3      8      Ljava/lang/IllegalStateException;
        //  310    316    3      8      Ljava/lang/IllegalStateException;
        //  374    381    381    382    Any
        //  374    381    374    375    Any
        //  375    381    3      8      Any
        //  374    381    374    375    Any
        //  374    381    3      8      Any
        //  388    395    395    396    Any
        //  389    395    388    389    Ljava/lang/EnumConstantNotPresentException;
        //  389    395    395    396    Any
        //  388    395    388    389    Any
        //  388    395    395    396    Ljava/lang/NumberFormatException;
        //  451    458    458    459    Any
        //  452    458    451    452    Ljava/lang/IndexOutOfBoundsException;
        //  452    458    3      8      Ljava/lang/NullPointerException;
        //  452    458    3      8      Ljava/util/ConcurrentModificationException;
        //  451    458    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  521    528    528    529    Any
        //  522    528    528    529    Any
        //  521    528    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  522    528    521    522    Any
        //  521    528    521    522    Any
        //  636    643    643    644    Any
        //  636    643    636    637    Any
        //  637    643    636    637    Any
        //  637    643    643    644    Ljava/lang/AssertionError;
        //  636    643    643    644    Ljava/lang/EnumConstantNotPresentException;
        //  746    753    753    754    Any
        //  746    753    753    754    Ljava/lang/EnumConstantNotPresentException;
        //  747    753    753    754    Ljava/lang/IndexOutOfBoundsException;
        //  747    753    3      8      Any
        //  746    753    746    747    Any
        //  767    774    774    775    Any
        //  767    774    3      8      Any
        //  767    774    767    768    Any
        //  767    774    774    775    Ljava/lang/IllegalArgumentException;
        //  768    774    774    775    Any
        //  832    839    839    840    Any
        //  833    839    832    833    Any
        //  833    839    839    840    Ljava/lang/RuntimeException;
        //  833    839    839    840    Ljava/lang/UnsupportedOperationException;
        //  832    839    839    840    Any
        //  844    850    850    851    Any
        //  844    850    850    851    Ljava/util/NoSuchElementException;
        //  844    850    850    851    Ljava/lang/StringIndexOutOfBoundsException;
        //  844    850    3      8      Any
        //  844    850    3      8      Any
        //  855    863    863    864    Any
        //  855    863    863    864    Ljava/lang/IllegalArgumentException;
        //  855    863    3      8      Ljava/lang/NegativeArraySizeException;
        //  855    863    3      8      Ljava/lang/ArithmeticException;
        //  855    863    863    864    Any
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
    
    @f06
    @LauncherEventHide
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2563
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            2555
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2547
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -1296615783
        //    33: goto            39
        //    36: ldc_w           326889731
        //    39: ldc_w           573383627
        //    42: ixor           
        //    43: lookupswitch {
        //          -1868950190: 2520
        //          -1659131919: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            81
        //    75: ldc_w           -1588353311
        //    78: goto            84
        //    81: ldc_w           1340657845
        //    84: ldc_w           358059022
        //    87: ixor           
        //    88: lookupswitch {
        //          -1274795281: 81
        //          1522490555: 116
        //          default: 2518
        //        }
        //   116: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0a;
        //   119: getstatic       dev/nuker/pyro/fc.c:I
        //   122: ifge            131
        //   125: ldc_w           -1139060902
        //   128: goto            134
        //   131: ldc_w           1442508236
        //   134: ldc_w           -1446241332
        //   137: ixor           
        //   138: lookupswitch {
        //          -1573055632: 131
        //          366433430: 2478
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   171: goto            175
        //   174: athrow         
        //   175: checkcast       Ljava/lang/Boolean;
        //   178: getstatic       dev/nuker/pyro/fc.0:I
        //   181: ifeq            190
        //   184: ldc_w           1698489951
        //   187: goto            193
        //   190: ldc_w           1855728067
        //   193: ldc_w           -1307977801
        //   196: ixor           
        //   197: lookupswitch {
        //          -684379672: 190
        //          -594149772: 224
        //          default: 2500
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   231: goto            235
        //   234: athrow         
        //   235: ifeq            341
        //   238: aload_0        
        //   239: new             Ljava/lang/StringBuilder;
        //   242: dup            
        //   243: goto            247
        //   246: athrow         
        //   247: invokespecial   java/lang/StringBuilder.<init>:()V
        //   250: goto            254
        //   253: athrow         
        //   254: aload_0        
        //   255: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   258: goto            262
        //   261: athrow         
        //   262: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   265: goto            269
        //   268: athrow         
        //   269: goto            273
        //   272: athrow         
        //   273: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   276: goto            280
        //   279: athrow         
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: goto            291
        //   290: athrow         
        //   291: ldc_w           "\u227e\u14a0\u8b3b\ub1da\ucf8d\uec3b\ub230"
        //   294: goto            298
        //   297: athrow         
        //   298: invokestatic    invokestatic   !!! ERROR
        //   301: goto            305
        //   304: athrow         
        //   305: goto            309
        //   308: athrow         
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: goto            316
        //   315: athrow         
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   323: goto            327
        //   326: athrow         
        //   327: goto            331
        //   330: athrow         
        //   331: invokevirtual   dev/nuker/pyro/f7C.4:(Ljava/lang/String;)V
        //   334: goto            338
        //   337: athrow         
        //   338: goto            426
        //   341: aload_0        
        //   342: aload_0        
        //   343: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   346: goto            350
        //   349: athrow         
        //   350: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   353: goto            357
        //   356: athrow         
        //   357: getstatic       dev/nuker/pyro/fc.0:I
        //   360: ifeq            369
        //   363: ldc_w           2119053116
        //   366: goto            372
        //   369: ldc_w           2120919998
        //   372: ldc_w           1495139576
        //   375: ixor           
        //   376: lookupswitch {
        //          293610755: 369
        //          659565508: 2534
        //          default: 404
        //        }
        //   404: goto            408
        //   407: athrow         
        //   408: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   411: goto            415
        //   414: athrow         
        //   415: goto            419
        //   418: athrow         
        //   419: invokevirtual   dev/nuker/pyro/f7C.4:(Ljava/lang/String;)V
        //   422: goto            426
        //   425: athrow         
        //   426: getstatic       dev/nuker/pyro/f7A.c:[I
        //   429: aload_0        
        //   430: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0f;
        //   433: goto            437
        //   436: athrow         
        //   437: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   440: goto            444
        //   443: athrow         
        //   444: checkcast       Ldev/nuker/pyro/f7B;
        //   447: getstatic       dev/nuker/pyro/fc.1:I
        //   450: ifeq            459
        //   453: ldc_w           -1800930412
        //   456: goto            462
        //   459: ldc_w           -1523604388
        //   462: ldc_w           1651619670
        //   465: ixor           
        //   466: lookupswitch {
        //          -950136054: 492
        //          -153727806: 459
        //          default: 2492
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   dev/nuker/pyro/f7B.ordinal:()I
        //   499: goto            503
        //   502: athrow         
        //   503: iaload         
        //   504: tableswitch {
        //                2: 532
        //                3: 532
        //                4: 955
        //          default: 2471
        //        }
        //   532: getstatic       dev/nuker/pyro/fc.1:I
        //   535: ifeq            544
        //   538: ldc_w           -24211909
        //   541: goto            547
        //   544: ldc_w           -1956602353
        //   547: ldc_w           1204528802
        //   550: ixor           
        //   551: lookupswitch {
        //          -1186649959: 544
        //          -861194067: 576
        //          default: 2524
        //        }
        //   576: aload_0        
        //   577: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   580: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   583: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   586: getstatic       dev/nuker/pyro/fc.1:I
        //   589: ifeq            598
        //   592: ldc_w           300434618
        //   595: goto            601
        //   598: ldc_w           224485390
        //   601: ldc_w           1722621487
        //   604: ixor           
        //   605: lookupswitch {
        //          1808563745: 632
        //          2001033877: 598
        //          default: 2502
        //        }
        //   632: getfield        net/minecraft/util/MovementInput.field_78899_d:Z
        //   635: ifne            644
        //   638: ldc_w           -1451134990
        //   641: goto            647
        //   644: ldc_w           -1451134979
        //   647: ldc_w           -342327227
        //   650: ixor           
        //   651: tableswitch {
        //          -2076975250: 672
        //          -2076975249: 853
        //          default: 638
        //        }
        //   672: aload_0        
        //   673: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   676: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   679: getstatic       dev/nuker/pyro/fc.1:I
        //   682: ifeq            691
        //   685: ldc_w           -1116787897
        //   688: goto            694
        //   691: ldc_w           2016768999
        //   694: ldc_w           -1970190334
        //   697: ixor           
        //   698: lookupswitch {
        //          -670716414: 691
        //          939418437: 2516
        //          default: 724
        //        }
        //   724: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   727: getstatic       dev/nuker/pyro/fc.c:I
        //   730: ifge            739
        //   733: ldc_w           -641269863
        //   736: goto            742
        //   739: ldc_w           -817514624
        //   742: ldc_w           -1684801839
        //   745: ixor           
        //   746: lookupswitch {
        //          1112869192: 739
        //          1423327569: 772
        //          default: 2484
        //        }
        //   772: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //   775: ifne            853
        //   778: aload_0        
        //   779: goto            783
        //   782: athrow         
        //   783: invokevirtual   dev/nuker/pyro/f7C.1:()Z
        //   786: goto            790
        //   789: athrow         
        //   790: ifeq            853
        //   793: getstatic       dev/nuker/pyro/fc.c:I
        //   796: ifge            805
        //   799: ldc_w           1793712705
        //   802: goto            808
        //   805: ldc_w           -1791951488
        //   808: ldc_w           1976050682
        //   811: ixor           
        //   812: lookupswitch {
        //          -520561030: 840
        //          522305979: 805
        //          default: 2522
        //        }
        //   840: aload_0        
        //   841: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   844: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   847: ldc2_w          0.10000000149011612
        //   850: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //   853: getstatic       dev/nuker/pyro/fc.c:I
        //   856: ifge            865
        //   859: ldc_w           -1664409933
        //   862: goto            868
        //   865: ldc_w           -1409802100
        //   868: ldc_w           -145794170
        //   871: ixor           
        //   872: lookupswitch {
        //          1796388494: 865
        //          1803830581: 2494
        //          default: 900
        //        }
        //   900: aload_0        
        //   901: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0a;
        //   904: goto            908
        //   907: athrow         
        //   908: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   911: goto            915
        //   914: athrow         
        //   915: checkcast       Ljava/lang/Boolean;
        //   918: goto            922
        //   921: athrow         
        //   922: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   925: goto            929
        //   928: athrow         
        //   929: ifeq            2471
        //   932: aload_0        
        //   933: goto            937
        //   936: athrow         
        //   937: invokevirtual   dev/nuker/pyro/f7C.c:()Z
        //   940: goto            944
        //   943: athrow         
        //   944: ifne            2471
        //   947: aload_0        
        //   948: fconst_0       
        //   949: putfield        dev/nuker/pyro/f7C.c:F
        //   952: goto            2471
        //   955: aload_0        
        //   956: goto            960
        //   959: athrow         
        //   960: invokevirtual   dev/nuker/pyro/f7C.1:()Z
        //   963: goto            967
        //   966: athrow         
        //   967: ifeq            1002
        //   970: aload_0        
        //   971: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   974: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   977: goto            981
        //   980: athrow         
        //   981: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70093_af:()Z
        //   984: goto            988
        //   987: athrow         
        //   988: ifne            1002
        //   991: aload_0        
        //   992: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   995: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   998: iconst_0       
        //   999: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1002: new             Lnet/minecraft/util/math/BlockPos;
        //  1005: dup            
        //  1006: aload_0        
        //  1007: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1010: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1013: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: invokestatic    java/lang/Math.floor:(D)D
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: aload_0        
        //  1028: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1031: getstatic       dev/nuker/pyro/fc.c:I
        //  1034: ifge            1043
        //  1037: ldc_w           249227000
        //  1040: goto            1046
        //  1043: ldc_w           -1029819823
        //  1046: ldc_w           -203932519
        //  1049: ixor           
        //  1050: lookupswitch {
        //          -50144671: 1043
        //          826674888: 1076
        //          default: 2508
        //        }
        //  1076: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1079: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: invokestatic    java/lang/Math.floor:(D)D
        //  1089: goto            1093
        //  1092: athrow         
        //  1093: aload_0        
        //  1094: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1097: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1100: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1103: getstatic       dev/nuker/pyro/fc.0:I
        //  1106: ifeq            1115
        //  1109: ldc_w           2145528606
        //  1112: goto            1118
        //  1115: ldc_w           -1577453885
        //  1118: ldc_w           -693604113
        //  1121: ixor           
        //  1122: lookupswitch {
        //          -1454744591: 1115
        //          2001831468: 1148
        //          default: 2530
        //        }
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokestatic    java/lang/Math.floor:(D)D
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: getstatic       dev/nuker/pyro/fc.0:I
        //  1162: ifeq            1171
        //  1165: ldc_w           -1456912623
        //  1168: goto            1174
        //  1171: ldc_w           -1016940106
        //  1174: ldc_w           1913392401
        //  1177: ixor           
        //  1178: lookupswitch {
        //          -2013948626: 1171
        //          -618313216: 2506
        //          default: 1204
        //        }
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  1222: goto            1226
        //  1225: athrow         
        //  1226: getstatic       dev/nuker/pyro/fc.c:I
        //  1229: ifge            1238
        //  1232: ldc_w           -1320302875
        //  1235: goto            1241
        //  1238: ldc_w           612056371
        //  1241: ldc_w           1726240650
        //  1244: ixor           
        //  1245: lookupswitch {
        //          -676753041: 2512
        //          586758291: 1238
        //          default: 1272
        //        }
        //  1272: astore_2       
        //  1273: aload_0        
        //  1274: getfield        dev/nuker/pyro/f7C.c:Z
        //  1277: ifeq            1862
        //  1280: aload_0        
        //  1281: getstatic       dev/nuker/pyro/fc.0:I
        //  1284: ifeq            1293
        //  1287: ldc_w           204976637
        //  1290: goto            1296
        //  1293: ldc_w           431121412
        //  1296: ldc_w           -1122183373
        //  1299: ixor           
        //  1300: lookupswitch {
        //          -1532054729: 1328
        //          -1322555698: 1293
        //          default: 2498
        //        }
        //  1328: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1331: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1334: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71075_bZ:Lnet/minecraft/entity/player/PlayerCapabilities;
        //  1337: getfield        net/minecraft/entity/player/PlayerCapabilities.field_75100_b:Z
        //  1340: ifne            1862
        //  1343: aload_0        
        //  1344: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1347: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70090_H:()Z
        //  1357: goto            1361
        //  1360: athrow         
        //  1361: ifne            1862
        //  1364: aload_0        
        //  1365: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1368: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1371: getstatic       dev/nuker/pyro/fc.1:I
        //  1374: ifeq            1383
        //  1377: ldc_w           -977042169
        //  1380: goto            1386
        //  1383: ldc_w           878352768
        //  1386: ldc_w           -206197073
        //  1389: ixor           
        //  1390: lookupswitch {
        //          -940624081: 1416
        //          913714088: 1383
        //          default: 2476
        //        }
        //  1416: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1419: ldc2_w          -0.3
        //  1422: dcmpg          
        //  1423: iflt            1580
        //  1426: aload_0        
        //  1427: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1430: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1433: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1436: ifne            1445
        //  1439: ldc_w           -1770650439
        //  1442: goto            1448
        //  1445: ldc_w           -1770650438
        //  1448: ldc_w           2081879880
        //  1451: ixor           
        //  1452: tableswitch {
        //          -725489694: 1476
        //          -725489693: 1580
        //          default: 1439
        //        }
        //  1476: aload_0        
        //  1477: getstatic       dev/nuker/pyro/fc.0:I
        //  1480: ifeq            1489
        //  1483: ldc_w           -1786439220
        //  1486: goto            1492
        //  1489: ldc_w           -43525710
        //  1492: ldc_w           -2080201316
        //  1495: ixor           
        //  1496: lookupswitch {
        //          294108240: 1489
        //          2036694062: 1524
        //          default: 2480
        //        }
        //  1524: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1527: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1530: goto            1534
        //  1533: athrow         
        //  1534: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70617_f_:()Z
        //  1537: goto            1541
        //  1540: athrow         
        //  1541: ifeq            1550
        //  1544: ldc_w           -174873244
        //  1547: goto            1553
        //  1550: ldc_w           -174873241
        //  1553: ldc_w           222678277
        //  1556: ixor           
        //  1557: tableswitch {
        //          -240332606: 1580
        //          -240332605: 1586
        //          default: 1544
        //        }
        //  1580: aload_0        
        //  1581: iconst_0       
        //  1582: putfield        dev/nuker/pyro/f7C.c:Z
        //  1585: return         
        //  1586: aload_0        
        //  1587: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1590: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1593: getstatic       dev/nuker/pyro/fc.1:I
        //  1596: ifeq            1605
        //  1599: ldc_w           1683988232
        //  1602: goto            1608
        //  1605: ldc_w           -799903654
        //  1608: ldc_w           668254550
        //  1611: ixor           
        //  1612: lookupswitch {
        //          -142167796: 1640
        //          1133207134: 1605
        //          default: 2486
        //        }
        //  1640: aload_0        
        //  1641: getstatic       dev/nuker/pyro/fc.0:I
        //  1644: ifeq            1653
        //  1647: ldc_w           462491177
        //  1650: goto            1656
        //  1653: ldc_w           -1183713504
        //  1656: ldc_w           -1148440355
        //  1659: ixor           
        //  1660: lookupswitch {
        //          -1608696076: 2528
        //          2132671270: 1653
        //          default: 1688
        //        }
        //  1688: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1691: getstatic       dev/nuker/pyro/fc.0:I
        //  1694: ifeq            1703
        //  1697: ldc_w           1071947171
        //  1700: goto            1706
        //  1703: ldc_w           -2078526271
        //  1706: ldc_w           -127876431
        //  1709: ixor           
        //  1710: lookupswitch {
        //          -1827820834: 1703
        //          -947626222: 2536
        //          default: 1736
        //        }
        //  1736: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1739: getstatic       dev/nuker/pyro/fc.c:I
        //  1742: ifge            1751
        //  1745: ldc_w           988710664
        //  1748: goto            1754
        //  1751: ldc_w           -211603254
        //  1754: ldc_w           1998095786
        //  1757: ixor           
        //  1758: lookupswitch {
        //          1095312294: 1751
        //          1307968162: 2490
        //          default: 1784
        //        }
        //  1784: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1787: ldc2_w          0.9800000190734863
        //  1790: ddiv           
        //  1791: ldc2_w          0.08
        //  1794: dadd           
        //  1795: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1798: aload_0        
        //  1799: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1802: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1805: dup            
        //  1806: getstatic       dev/nuker/pyro/fc.1:I
        //  1809: ifeq            1818
        //  1812: ldc_w           259441070
        //  1815: goto            1821
        //  1818: ldc_w           -1049754296
        //  1821: ldc_w           724721945
        //  1824: ixor           
        //  1825: lookupswitch {
        //          -1485453111: 1818
        //          608477367: 2504
        //          default: 1852
        //        }
        //  1852: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1855: ldc2_w          0.03120000000005
        //  1858: dsub           
        //  1859: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1862: aload_0        
        //  1863: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1866: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1869: getstatic       dev/nuker/pyro/fc.c:I
        //  1872: ifge            1881
        //  1875: ldc_w           1227768628
        //  1878: goto            1884
        //  1881: ldc_w           1537743572
        //  1884: ldc_w           -464466707
        //  1887: ixor           
        //  1888: lookupswitch {
        //          -1384214567: 1881
        //          -1074211271: 1916
        //          default: 2482
        //        }
        //  1916: goto            1920
        //  1919: athrow         
        //  1920: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70090_H:()Z
        //  1923: goto            1927
        //  1926: athrow         
        //  1927: ifne            2032
        //  1930: getstatic       dev/nuker/pyro/fc.0:I
        //  1933: ifeq            1942
        //  1936: ldc_w           462580979
        //  1939: goto            1945
        //  1942: ldc_w           2472903
        //  1945: ldc_w           -1077350320
        //  1948: ixor           
        //  1949: lookupswitch {
        //          -1537565533: 1942
        //          -1074967657: 1976
        //          default: 2510
        //        }
        //  1976: aload_0        
        //  1977: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  1980: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1983: goto            1987
        //  1986: athrow         
        //  1987: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180799_ab:()Z
        //  1990: goto            1994
        //  1993: athrow         
        //  1994: ifeq            2003
        //  1997: ldc_w           -487081401
        //  2000: goto            2006
        //  2003: ldc_w           -487081404
        //  2006: ldc_w           -1243248570
        //  2009: ixor           
        //  2010: tableswitch {
        //          -1373346814: 2032
        //          -1373346813: 2095
        //          default: 1997
        //        }
        //  2032: getstatic       dev/nuker/pyro/fc.0:I
        //  2035: ifeq            2044
        //  2038: ldc_w           714392583
        //  2041: goto            2047
        //  2044: ldc_w           -1560058709
        //  2047: ldc_w           -1707198857
        //  2050: ixor           
        //  2051: lookupswitch {
        //          -2121166562: 2044
        //          -1330974096: 2532
        //          default: 2076
        //        }
        //  2076: aload_0        
        //  2077: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  2080: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2083: ldc2_w          0.10000000149011612
        //  2086: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2089: aload_0        
        //  2090: iconst_0       
        //  2091: putfield        dev/nuker/pyro/f7C.c:Z
        //  2094: return         
        //  2095: aload_0        
        //  2096: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  2099: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2102: goto            2106
        //  2105: athrow         
        //  2106: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180799_ab:()Z
        //  2109: goto            2113
        //  2112: athrow         
        //  2113: ifne            2471
        //  2116: getstatic       dev/nuker/pyro/fc.0:I
        //  2119: ifeq            2128
        //  2122: ldc_w           339311549
        //  2125: goto            2131
        //  2128: ldc_w           874382502
        //  2131: ldc_w           1719703605
        //  2134: ixor           
        //  2135: lookupswitch {
        //          1798900472: 2128
        //          1924785032: 2496
        //          default: 2160
        //        }
        //  2160: aload_2        
        //  2161: instanceof      Lnet/minecraft/block/BlockLiquid;
        //  2164: ifeq            2471
        //  2167: aload_0        
        //  2168: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  2171: getstatic       dev/nuker/pyro/fc.0:I
        //  2174: ifeq            2183
        //  2177: ldc_w           323536456
        //  2180: goto            2186
        //  2183: ldc_w           1721113585
        //  2186: ldc_w           -1066027821
        //  2189: ixor           
        //  2190: lookupswitch {
        //          -750947685: 2472
        //          2102152236: 2183
        //          default: 2216
        //        }
        //  2216: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2219: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2222: ldc2_w          0.20000000298023224
        //  2225: dcmpg          
        //  2226: ifge            2471
        //  2229: getstatic       dev/nuker/pyro/fc.0:I
        //  2232: ifeq            2241
        //  2235: ldc_w           1933675475
        //  2238: goto            2244
        //  2241: ldc_w           -402017921
        //  2244: ldc_w           -1649587293
        //  2247: ixor           
        //  2248: lookupswitch {
        //          -286474128: 2474
        //          561286765: 2241
        //          default: 2276
        //        }
        //  2276: aload_0        
        //  2277: getstatic       dev/nuker/pyro/fc.c:I
        //  2280: ifge            2289
        //  2283: ldc_w           98136635
        //  2286: goto            2292
        //  2289: ldc_w           252973161
        //  2292: ldc_w           -2046641420
        //  2295: ixor           
        //  2296: lookupswitch {
        //          -2082748209: 2488
        //          2009482200: 2289
        //          default: 2324
        //        }
        //  2324: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //  2327: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2330: aload_0        
        //  2331: getfield        dev/nuker/pyro/f7C.c:Ldev/nuker/pyro/f0a;
        //  2334: getstatic       dev/nuker/pyro/fc.1:I
        //  2337: ifeq            2346
        //  2340: ldc_w           -1299024283
        //  2343: goto            2349
        //  2346: ldc_w           -1600749816
        //  2349: ldc_w           1340896096
        //  2352: ixor           
        //  2353: lookupswitch {
        //          -1452777583: 2346
        //          -42072827: 2514
        //          default: 2380
        //        }
        //  2380: goto            2384
        //  2383: athrow         
        //  2384: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2387: goto            2391
        //  2390: athrow         
        //  2391: checkcast       Ljava/lang/Boolean;
        //  2394: goto            2398
        //  2397: athrow         
        //  2398: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2401: goto            2405
        //  2404: athrow         
        //  2405: ifne            2414
        //  2408: ldc2_w          0.5
        //  2411: goto            2417
        //  2414: ldc2_w          0.184
        //  2417: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2420: aload_0        
        //  2421: iconst_1       
        //  2422: getstatic       dev/nuker/pyro/fc.c:I
        //  2425: ifge            2434
        //  2428: ldc_w           -1171095221
        //  2431: goto            2437
        //  2434: ldc_w           -322057221
        //  2437: ldc_w           1853616749
        //  2440: ixor           
        //  2441: lookupswitch {
        //          -1792503865: 2434
        //          -733383898: 2526
        //          default: 2468
        //        }
        //  2468: putfield        dev/nuker/pyro/f7C.c:Z
        //  2471: return         
        //  2472: aconst_null    
        //  2473: athrow         
        //  2474: aconst_null    
        //  2475: athrow         
        //  2476: aconst_null    
        //  2477: athrow         
        //  2478: aconst_null    
        //  2479: athrow         
        //  2480: aconst_null    
        //  2481: athrow         
        //  2482: aconst_null    
        //  2483: athrow         
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
        //  2538: pop            
        //  2539: goto            24
        //  2542: pop            
        //  2543: aconst_null    
        //  2544: goto            2538
        //  2547: dup            
        //  2548: ifnull          2538
        //  2551: checkcast       Ljava/lang/Throwable;
        //  2554: athrow         
        //  2555: dup            
        //  2556: ifnull          2542
        //  2559: checkcast       Ljava/lang/Throwable;
        //  2562: athrow         
        //  2563: aconst_null    
        //  2564: athrow         
        //    StackMapTable: 01 2C 43 07 00 3E 04 FF 00 0B 00 00 00 01 07 00 3E FD 00 03 07 00 03 07 02 75 0B 42 01 1C 4C 07 00 03 FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 03 01 5F 07 00 03 4E 07 01 1D FF 00 02 00 02 07 00 03 07 02 75 00 02 07 01 1D 01 5D 07 01 1D 42 07 00 3E 40 07 01 1D 45 07 00 3E 40 07 00 FC 4E 07 00 67 FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 67 01 5E 07 00 67 42 07 00 3E 40 07 00 67 45 07 00 3E 40 01 4A 07 00 2A FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 08 00 EF 08 00 EF 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 B0 46 07 00 2A FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 00 6F 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 00 FC 42 07 00 2A FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 00 FC 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 01 39 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 01 39 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 B0 45 07 00 26 FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 01 39 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 01 39 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 07 00 03 07 01 B0 07 01 39 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 B0 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 B0 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 39 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 39 45 07 00 3E 00 02 47 07 00 22 FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 6F 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 FC FF 00 0B 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 FC FF 00 02 00 02 07 00 03 07 02 75 00 03 07 00 03 07 00 FC 01 FF 00 1F 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 FC 42 07 00 30 FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 FC 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 39 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 00 03 07 01 39 45 07 00 3E 00 49 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 6F 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 FC FF 00 0E 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 74 FF 00 02 00 02 07 00 03 07 02 75 00 03 07 02 76 07 00 74 01 FF 00 1D 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 74 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 74 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 02 07 02 76 01 1C 0B 42 01 1C 55 07 00 CE FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 CE 01 5E 07 00 CE 05 05 42 01 18 52 07 00 86 FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 86 01 5D 07 00 86 4E 07 00 CE FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 CE 01 5D 07 00 CE 49 07 00 36 40 07 00 03 45 07 00 3E 40 01 0E 42 01 1F 0C 0B 42 01 1F FF 00 06 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 01 07 01 1D 45 07 00 3E 40 07 00 FC 45 07 00 1C 40 07 00 67 45 07 00 3E 40 01 FF 00 06 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 01 07 00 03 45 07 00 3E 40 01 0A FF 00 03 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 01 07 00 03 45 07 00 3E 40 01 4C 07 00 3E 40 07 00 86 45 07 00 3E 40 01 0D 50 07 00 2A FF 00 00 00 02 07 00 03 07 02 75 00 03 08 03 EA 08 03 EA 03 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 03 08 03 EA 08 03 EA 03 FF 00 0F 00 02 07 00 03 07 02 75 00 04 08 03 EA 08 03 EA 03 07 00 49 FF 00 02 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 07 00 49 01 FF 00 1D 00 02 07 00 03 07 02 75 00 04 08 03 EA 08 03 EA 03 07 00 49 48 07 00 2A FF 00 00 00 02 07 00 03 07 02 75 00 04 08 03 EA 08 03 EA 03 03 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 04 08 03 EA 08 03 EA 03 03 FF 00 15 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 FF 00 02 00 02 07 00 03 07 02 75 00 06 08 03 EA 08 03 EA 03 03 03 01 FF 00 1D 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 45 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 FF 00 0B 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 FF 00 02 00 02 07 00 03 07 02 75 00 06 08 03 EA 08 03 EA 03 03 03 01 FF 00 1D 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 42 07 00 3E FF 00 00 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 45 07 00 3E 40 07 00 B5 42 07 00 3E 40 07 00 B5 45 07 00 3E 40 07 00 97 4B 07 00 97 FF 00 02 00 02 07 00 03 07 02 75 00 02 07 00 97 01 5E 07 00 97 FF 00 14 00 03 07 00 03 07 02 75 07 00 97 00 01 07 00 03 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 5F 07 00 03 FF 00 18 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 01 07 00 86 45 07 00 3E 40 01 55 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 01 5D 07 00 86 16 05 42 01 1B 4C 07 00 03 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 5F 07 00 03 48 07 00 3E 40 07 00 86 45 07 00 3E 40 01 02 05 42 01 1A 05 52 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 01 5F 07 00 86 FF 00 0C 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 03 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 86 07 00 03 01 FF 00 1F 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 03 FF 00 0E 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 49 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 86 07 00 49 01 FF 00 1D 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 49 FF 00 0E 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 86 07 00 86 01 FF 00 1D 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 FF 00 21 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 86 07 00 86 01 FF 00 1E 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 09 52 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 01 5F 07 00 86 42 07 00 3E 40 07 00 86 45 07 00 3E 40 01 0E 42 01 1E 49 07 00 36 40 07 00 86 45 07 00 3E 40 01 02 05 42 01 19 0B 42 01 1C 12 49 07 00 2A 40 07 00 86 45 07 00 3E 40 01 0E 42 01 1C 56 07 00 49 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 49 01 5D 07 00 49 18 42 01 1F 4C 07 00 03 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 5F 07 00 03 FF 00 15 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 01 1D FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 86 07 01 1D 01 FF 00 1E 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 01 1D 42 07 00 3E FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 01 1D 45 07 00 3E FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 FC FF 00 05 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 67 45 07 00 3E FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 01 48 07 00 86 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 03 FF 00 10 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 07 02 75 07 00 97 00 03 07 00 03 01 01 FF 00 1E 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 FA 00 02 FF 00 00 00 03 07 00 03 07 02 75 07 00 97 00 01 07 00 49 01 41 07 00 86 FF 00 01 00 02 07 00 03 07 02 75 00 01 07 01 1D FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 01 07 00 03 41 07 00 86 FF 00 01 00 02 07 00 03 07 02 75 00 01 07 00 CE FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 01 07 00 86 41 07 00 03 FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 FF 00 01 00 02 07 00 03 07 02 75 00 02 07 02 76 07 00 74 01 FC 00 01 07 00 97 41 07 00 03 FF 00 01 00 02 07 00 03 07 02 75 00 01 07 00 67 41 07 00 CE FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 86 FF 00 01 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 FF 00 01 00 02 07 00 03 07 02 75 00 04 08 03 EA 08 03 EA 03 07 00 49 FC 00 01 07 00 97 FF 00 01 00 02 07 00 03 07 02 75 00 01 07 00 97 FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 01 1D FF 00 01 00 02 07 00 03 07 02 75 00 01 07 00 86 41 07 00 03 01 01 01 FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 03 01 FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 03 FF 00 01 00 02 07 00 03 07 02 75 00 05 08 03 EA 08 03 EA 03 03 03 FC 00 01 07 00 97 FF 00 01 00 02 07 00 03 07 02 75 00 02 07 00 03 07 00 FC FF 00 01 00 03 07 00 03 07 02 75 07 00 97 00 02 07 00 86 07 00 49 FF 00 01 00 02 07 00 03 07 02 75 00 01 07 00 34 43 05 44 07 00 34 47 05 47 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2547   2555   Ljava/lang/IllegalArgumentException;
        //  2547   2555   2547   2555   Ljava/lang/IllegalArgumentException;
        //  2563   2565   3      8      Any
        //  167    174    174    175    Any
        //  168    174    174    175    Ljava/lang/IllegalStateException;
        //  167    174    3      8      Any
        //  168    174    167    168    Ljava/lang/ClassCastException;
        //  167    174    167    168    Any
        //  227    234    234    235    Any
        //  228    234    234    235    Ljava/lang/IndexOutOfBoundsException;
        //  227    234    234    235    Any
        //  227    234    227    228    Any
        //  227    234    234    235    Ljava/lang/UnsupportedOperationException;
        //  246    253    253    254    Any
        //  247    253    3      8      Any
        //  246    253    246    247    Ljava/util/NoSuchElementException;
        //  247    253    3      8      Any
        //  246    253    246    247    Ljava/lang/ArithmeticException;
        //  261    268    268    269    Any
        //  261    268    3      8      Any
        //  261    268    268    269    Ljava/lang/NegativeArraySizeException;
        //  262    268    261    262    Ljava/lang/RuntimeException;
        //  262    268    3      8      Any
        //  272    279    279    280    Any
        //  273    279    279    280    Any
        //  273    279    272    273    Ljava/util/NoSuchElementException;
        //  273    279    279    280    Ljava/lang/NullPointerException;
        //  273    279    272    273    Ljava/lang/ArithmeticException;
        //  283    290    290    291    Any
        //  283    290    3      8      Any
        //  284    290    283    284    Ljava/lang/StringIndexOutOfBoundsException;
        //  284    290    283    284    Ljava/lang/AssertionError;
        //  284    290    283    284    Ljava/lang/NumberFormatException;
        //  297    304    304    305    Any
        //  297    304    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  297    304    304    305    Ljava/lang/AssertionError;
        //  297    304    304    305    Any
        //  297    304    297    298    Ljava/lang/NumberFormatException;
        //  308    315    315    316    Any
        //  309    315    308    309    Any
        //  309    315    3      8      Any
        //  308    315    308    309    Ljava/lang/StringIndexOutOfBoundsException;
        //  309    315    3      8      Any
        //  320    326    326    327    Any
        //  320    326    3      8      Any
        //  320    326    326    327    Ljava/lang/IllegalStateException;
        //  320    326    326    327    Any
        //  320    326    326    327    Ljava/lang/IllegalArgumentException;
        //  330    337    337    338    Any
        //  331    337    330    331    Ljava/lang/NegativeArraySizeException;
        //  331    337    337    338    Any
        //  331    337    330    331    Any
        //  330    337    337    338    Ljava/lang/ClassCastException;
        //  349    356    356    357    Any
        //  350    356    349    350    Ljava/lang/NegativeArraySizeException;
        //  350    356    349    350    Ljava/lang/NegativeArraySizeException;
        //  349    356    356    357    Ljava/lang/EnumConstantNotPresentException;
        //  349    356    3      8      Any
        //  407    414    414    415    Any
        //  408    414    414    415    Any
        //  407    414    414    415    Any
        //  407    414    407    408    Ljava/lang/ArithmeticException;
        //  408    414    414    415    Any
        //  418    425    425    426    Any
        //  418    425    425    426    Ljava/lang/AssertionError;
        //  418    425    418    419    Any
        //  419    425    418    419    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  419    425    3      8      Any
        //  436    443    443    444    Any
        //  436    443    443    444    Any
        //  436    443    436    437    Ljava/lang/AssertionError;
        //  437    443    436    437    Any
        //  436    443    3      8      Ljava/util/ConcurrentModificationException;
        //  495    502    502    503    Any
        //  495    502    3      8      Ljava/lang/RuntimeException;
        //  496    502    495    496    Ljava/util/NoSuchElementException;
        //  495    502    495    496    Any
        //  495    502    3      8      Any
        //  782    789    789    790    Any
        //  782    789    789    790    Any
        //  782    789    3      8      Any
        //  782    789    3      8      Any
        //  782    789    782    783    Ljava/lang/IndexOutOfBoundsException;
        //  908    914    914    915    Any
        //  908    914    3      8      Any
        //  908    914    914    915    Ljava/lang/IllegalArgumentException;
        //  908    914    914    915    Ljava/lang/IllegalStateException;
        //  908    914    914    915    Any
        //  921    928    928    929    Any
        //  922    928    921    922    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  921    928    3      8      Any
        //  921    928    3      8      Any
        //  921    928    3      8      Ljava/util/NoSuchElementException;
        //  937    943    943    944    Any
        //  937    943    3      8      Ljava/lang/NumberFormatException;
        //  937    943    3      8      Ljava/util/ConcurrentModificationException;
        //  937    943    943    944    Any
        //  937    943    3      8      Ljava/lang/NegativeArraySizeException;
        //  960    966    966    967    Any
        //  960    966    966    967    Any
        //  960    966    3      8      Any
        //  960    966    3      8      Ljava/lang/NullPointerException;
        //  960    966    966    967    Any
        //  980    987    987    988    Any
        //  980    987    3      8      Any
        //  981    987    980    981    Any
        //  981    987    980    981    Ljava/lang/StringIndexOutOfBoundsException;
        //  980    987    3      8      Ljava/lang/NumberFormatException;
        //  1019   1026   1026   1027   Any
        //  1020   1026   1026   1027   Ljava/lang/NumberFormatException;
        //  1019   1026   1019   1020   Ljava/lang/NumberFormatException;
        //  1019   1026   3      8      Ljava/lang/UnsupportedOperationException;
        //  1020   1026   1019   1020   Ljava/util/ConcurrentModificationException;
        //  1085   1092   1092   1093   Any
        //  1086   1092   1092   1093   Any
        //  1085   1092   1085   1086   Ljava/lang/IllegalStateException;
        //  1085   1092   1085   1086   Ljava/lang/IndexOutOfBoundsException;
        //  1085   1092   3      8      Any
        //  1151   1158   1158   1159   Any
        //  1151   1158   1151   1152   Ljava/lang/UnsupportedOperationException;
        //  1151   1158   1158   1159   Any
        //  1151   1158   3      8      Any
        //  1152   1158   1151   1152   Any
        //  1207   1214   1214   1215   Any
        //  1207   1214   3      8      Any
        //  1208   1214   1207   1208   Any
        //  1208   1214   1207   1208   Ljava/lang/IllegalStateException;
        //  1207   1214   1214   1215   Any
        //  1218   1225   1225   1226   Any
        //  1218   1225   1218   1219   Any
        //  1218   1225   1225   1226   Ljava/lang/ArithmeticException;
        //  1219   1225   3      8      Any
        //  1218   1225   1218   1219   Any
        //  1354   1360   1360   1361   Any
        //  1354   1360   1360   1361   Ljava/util/NoSuchElementException;
        //  1354   1360   1360   1361   Ljava/lang/UnsupportedOperationException;
        //  1354   1360   3      8      Ljava/lang/NegativeArraySizeException;
        //  1354   1360   1360   1361   Ljava/util/NoSuchElementException;
        //  1533   1540   1540   1541   Any
        //  1533   1540   1540   1541   Any
        //  1534   1540   3      8      Any
        //  1533   1540   1533   1534   Any
        //  1534   1540   3      8      Any
        //  1919   1926   1926   1927   Any
        //  1920   1926   3      8      Any
        //  1920   1926   1919   1920   Ljava/lang/NumberFormatException;
        //  1920   1926   3      8      Ljava/lang/UnsupportedOperationException;
        //  1919   1926   1919   1920   Ljava/lang/AssertionError;
        //  1986   1993   1993   1994   Any
        //  1987   1993   1993   1994   Ljava/lang/IllegalArgumentException;
        //  1987   1993   1993   1994   Any
        //  1987   1993   1986   1987   Ljava/lang/IndexOutOfBoundsException;
        //  1987   1993   1993   1994   Any
        //  2105   2112   2112   2113   Any
        //  2106   2112   2112   2113   Any
        //  2106   2112   2105   2106   Ljava/lang/IllegalArgumentException;
        //  2105   2112   2112   2113   Any
        //  2106   2112   2105   2106   Ljava/lang/RuntimeException;
        //  2383   2390   2390   2391   Any
        //  2384   2390   2383   2384   Any
        //  2384   2390   2383   2384   Any
        //  2383   2390   2390   2391   Any
        //  2384   2390   3      8      Any
        //  2398   2404   2404   2405   Any
        //  2398   2404   3      8      Any
        //  2398   2404   2404   2405   Any
        //  2398   2404   2404   2405   Any
        //  2398   2404   3      8      Ljava/lang/UnsupportedOperationException;
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
    
    public boolean 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1262
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1254
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1246
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           154266286
        //    33: goto            39
        //    36: ldc_w           437719180
        //    39: ldc_w           1548210880
        //    42: ixor           
        //    43: lookupswitch {
        //          1433811054: 1209
        //          2103011765: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            81
        //    75: ldc_w           1432193392
        //    78: goto            84
        //    81: ldc_w           71655425
        //    84: ldc_w           1963228672
        //    87: ixor           
        //    88: lookupswitch {
        //          -527954273: 81
        //          542766960: 1205
        //          default: 116
        //        }
        //   116: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   119: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   122: ifnonnull       127
        //   125: iconst_0       
        //   126: ireturn        
        //   127: iconst_0       
        //   128: istore_1       
        //   129: getstatic       dev/nuker/pyro/fc.0:I
        //   132: ifeq            141
        //   135: ldc_w           370725978
        //   138: goto            144
        //   141: ldc_w           1824376181
        //   144: ldc_w           -579748868
        //   147: ixor           
        //   148: lookupswitch {
        //          -882282586: 1199
        //          1541147715: 141
        //          default: 176
        //        }
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   180: getstatic       dev/nuker/pyro/fc.c:I
        //   183: ifge            192
        //   186: ldc_w           384374696
        //   189: goto            195
        //   192: ldc_w           196872890
        //   195: ldc_w           -1117334561
        //   198: ixor           
        //   199: lookupswitch {
        //          -1416641417: 192
        //          -1227171483: 224
        //          default: 1235
        //        }
        //   224: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   227: goto            231
        //   230: athrow         
        //   231: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   234: goto            238
        //   237: athrow         
        //   238: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   241: ldc2_w          0.02
        //   244: dadd           
        //   245: d2i            
        //   246: istore_2       
        //   247: getstatic       dev/nuker/pyro/fc.0:I
        //   250: ifeq            259
        //   253: ldc_w           -104907040
        //   256: goto            262
        //   259: ldc_w           -247761315
        //   262: ldc_w           1652116383
        //   265: ixor           
        //   266: lookupswitch {
        //          -1824375358: 292
        //          -1681492609: 259
        //          default: 1211
        //        }
        //   292: aload_0        
        //   293: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   296: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   299: goto            303
        //   302: athrow         
        //   303: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   306: goto            310
        //   309: athrow         
        //   310: getstatic       dev/nuker/pyro/fc.1:I
        //   313: ifeq            322
        //   316: ldc_w           -2128024523
        //   319: goto            325
        //   322: ldc_w           748253095
        //   325: ldc_w           1537738442
        //   328: ixor           
        //   329: lookupswitch {
        //          -629085441: 322
        //          1999726957: 356
        //          default: 1215
        //        }
        //   356: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   359: goto            363
        //   362: athrow         
        //   363: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   366: goto            370
        //   369: athrow         
        //   370: getstatic       dev/nuker/pyro/fc.c:I
        //   373: ifge            382
        //   376: ldc_w           886848583
        //   379: goto            385
        //   382: ldc_w           -1067846604
        //   385: ldc_w           213507461
        //   388: ixor           
        //   389: lookupswitch {
        //          -747141010: 382
        //          946201026: 1227
        //          default: 416
        //        }
        //   416: istore_3       
        //   417: iload_3        
        //   418: aload_0        
        //   419: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   422: getstatic       dev/nuker/pyro/fc.0:I
        //   425: ifeq            434
        //   428: ldc_w           1029489215
        //   431: goto            437
        //   434: ldc_w           -908998135
        //   437: ldc_w           707271831
        //   440: ixor           
        //   441: lookupswitch {
        //          -470165858: 468
        //          393535144: 434
        //          default: 1207
        //        }
        //   468: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   471: getstatic       dev/nuker/pyro/fc.c:I
        //   474: ifge            483
        //   477: ldc_w           1292809140
        //   480: goto            486
        //   483: ldc_w           123469915
        //   486: ldc_w           1266629854
        //   489: ixor           
        //   490: lookupswitch {
        //          108105578: 483
        //          1277377669: 516
        //          default: 1225
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   523: goto            527
        //   526: athrow         
        //   527: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   530: goto            534
        //   533: athrow         
        //   534: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   537: goto            541
        //   540: athrow         
        //   541: iconst_1       
        //   542: iadd           
        //   543: if_icmpge       552
        //   546: ldc_w           1623747048
        //   549: goto            555
        //   552: ldc_w           1623747051
        //   555: ldc_w           -103967087
        //   558: ixor           
        //   559: tableswitch {
        //          839646962: 580
        //          839646963: 1197
        //          default: 546
        //        }
        //   580: aload_0        
        //   581: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   584: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   587: getstatic       dev/nuker/pyro/fc.1:I
        //   590: ifeq            599
        //   593: ldc_w           1551162092
        //   596: goto            602
        //   599: ldc_w           -643977429
        //   602: ldc_w           1878006983
        //   605: ixor           
        //   606: lookupswitch {
        //          -1234324500: 632
        //          864339499: 599
        //          default: 1229
        //        }
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   639: goto            643
        //   642: athrow         
        //   643: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   646: getstatic       dev/nuker/pyro/fc.1:I
        //   649: ifeq            658
        //   652: ldc_w           195942831
        //   655: goto            661
        //   658: ldc_w           -1994927823
        //   661: ldc_w           -1344246234
        //   664: ixor           
        //   665: lookupswitch {
        //          -1538410615: 1217
        //          -659229803: 658
        //          default: 692
        //        }
        //   692: goto            696
        //   695: athrow         
        //   696: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   699: goto            703
        //   702: athrow         
        //   703: istore          4
        //   705: getstatic       dev/nuker/pyro/fc.0:I
        //   708: ifeq            717
        //   711: ldc_w           -1946033502
        //   714: goto            720
        //   717: ldc_w           -970233052
        //   720: ldc_w           1240179823
        //   723: ixor           
        //   724: lookupswitch {
        //          -1883189429: 752
        //          -974502195: 717
        //          default: 1201
        //        }
        //   752: iload           4
        //   754: aload_0        
        //   755: getstatic       dev/nuker/pyro/fc.c:I
        //   758: ifge            767
        //   761: ldc_w           24889785
        //   764: goto            770
        //   767: ldc_w           -55745347
        //   770: ldc_w           1374279843
        //   773: ixor           
        //   774: lookupswitch {
        //          -928882803: 767
        //          1351749914: 1231
        //          default: 800
        //        }
        //   800: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   803: getstatic       dev/nuker/pyro/fc.0:I
        //   806: ifeq            815
        //   809: ldc_w           2046711431
        //   812: goto            818
        //   815: ldc_w           1460306975
        //   818: ldc_w           -1073882816
        //   821: ixor           
        //   822: lookupswitch {
        //          -972845113: 815
        //          -386441889: 848
        //          default: 1221
        //        }
        //   848: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   851: goto            855
        //   854: athrow         
        //   855: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   858: goto            862
        //   861: athrow         
        //   862: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   865: goto            869
        //   868: athrow         
        //   869: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   872: goto            876
        //   875: athrow         
        //   876: iconst_1       
        //   877: iadd           
        //   878: if_icmpge       1191
        //   881: getstatic       dev/nuker/pyro/fc.1:I
        //   884: ifeq            893
        //   887: ldc_w           -291713084
        //   890: goto            896
        //   893: ldc_w           -996992390
        //   896: ldc_w           600362887
        //   899: ixor           
        //   900: lookupswitch {
        //          -850132925: 893
        //          -413411843: 928
        //          default: 1219
        //        }
        //   928: aload_0        
        //   929: getfield        dev/nuker/pyro/f7C.c:Lnet/minecraft/client/Minecraft;
        //   932: getstatic       dev/nuker/pyro/fc.1:I
        //   935: ifeq            944
        //   938: ldc_w           -1017808343
        //   941: goto            947
        //   944: ldc_w           -422948099
        //   947: ldc_w           1427032126
        //   950: ixor           
        //   951: lookupswitch {
        //          -1772375529: 1223
        //          432728818: 944
        //          default: 976
        //        }
        //   976: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   979: new             Lnet/minecraft/util/math/BlockPos;
        //   982: dup            
        //   983: iload_3        
        //   984: iload_2        
        //   985: iload           4
        //   987: goto            991
        //   990: athrow         
        //   991: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   994: goto            998
        //   997: athrow         
        //   998: goto            1002
        //  1001: athrow         
        //  1002: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: goto            1013
        //  1012: athrow         
        //  1013: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1018: goto            1022
        //  1021: athrow         
        //  1022: astore          5
        //  1024: getstatic       dev/nuker/pyro/fc.0:I
        //  1027: ifeq            1036
        //  1030: ldc_w           2132412418
        //  1033: goto            1039
        //  1036: ldc_w           -656861416
        //  1039: ldc_w           -1451255005
        //  1042: ixor           
        //  1043: lookupswitch {
        //          -697986271: 1036
        //          1906740283: 1068
        //          default: 1213
        //        }
        //  1068: aload           5
        //  1070: ifnull          1185
        //  1073: aload           5
        //  1075: instanceof      Lnet/minecraft/block/BlockAir;
        //  1078: ifne            1185
        //  1081: getstatic       dev/nuker/pyro/fc.0:I
        //  1084: ifeq            1093
        //  1087: ldc_w           -1297809911
        //  1090: goto            1096
        //  1093: ldc_w           -665820749
        //  1096: ldc_w           -766102972
        //  1099: ixor           
        //  1100: lookupswitch {
        //          168186871: 1128
        //          1626524749: 1093
        //          default: 1203
        //        }
        //  1128: aload           5
        //  1130: instanceof      Lnet/minecraft/block/BlockLiquid;
        //  1133: ifne            1138
        //  1136: iconst_0       
        //  1137: ireturn        
        //  1138: iconst_1       
        //  1139: getstatic       dev/nuker/pyro/fc.c:I
        //  1142: ifge            1151
        //  1145: ldc_w           1320604198
        //  1148: goto            1154
        //  1151: ldc_w           512533679
        //  1154: ldc_w           -427641132
        //  1157: ixor           
        //  1158: lookupswitch {
        //          -1472961294: 1233
        //          1874553639: 1151
        //          default: 1184
        //        }
        //  1184: istore_1       
        //  1185: iinc            4, 1
        //  1188: goto            705
        //  1191: iinc            3, 1
        //  1194: goto            417
        //  1197: iload_1        
        //  1198: ireturn        
        //  1199: aconst_null    
        //  1200: athrow         
        //  1201: aconst_null    
        //  1202: athrow         
        //  1203: aconst_null    
        //  1204: athrow         
        //  1205: aconst_null    
        //  1206: athrow         
        //  1207: aconst_null    
        //  1208: athrow         
        //  1209: aconst_null    
        //  1210: athrow         
        //  1211: aconst_null    
        //  1212: athrow         
        //  1213: aconst_null    
        //  1214: athrow         
        //  1215: aconst_null    
        //  1216: athrow         
        //  1217: aconst_null    
        //  1218: athrow         
        //  1219: aconst_null    
        //  1220: athrow         
        //  1221: aconst_null    
        //  1222: athrow         
        //  1223: aconst_null    
        //  1224: athrow         
        //  1225: aconst_null    
        //  1226: athrow         
        //  1227: aconst_null    
        //  1228: athrow         
        //  1229: aconst_null    
        //  1230: athrow         
        //  1231: aconst_null    
        //  1232: athrow         
        //  1233: aconst_null    
        //  1234: athrow         
        //  1235: aconst_null    
        //  1236: athrow         
        //  1237: pop            
        //  1238: goto            24
        //  1241: pop            
        //  1242: aconst_null    
        //  1243: goto            1237
        //  1246: dup            
        //  1247: ifnull          1237
        //  1250: checkcast       Ljava/lang/Throwable;
        //  1253: athrow         
        //  1254: dup            
        //  1255: ifnull          1241
        //  1258: checkcast       Ljava/lang/Throwable;
        //  1261: athrow         
        //  1262: aconst_null    
        //  1263: athrow         
        //    StackMapTable: 00 90 FF 00 03 00 03 07 00 03 01 01 00 01 07 00 3E F9 00 04 FF 00 0B 00 00 00 01 07 00 3E FC 00 03 07 00 03 0B 42 01 1C 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 0A FC 00 0D 01 42 01 1F 4F 07 00 49 FF 00 02 00 02 07 00 03 01 00 02 07 00 49 01 5C 07 00 49 45 07 00 3E 40 07 00 86 45 07 00 3E 40 07 00 A8 FC 00 14 01 42 01 1D FF 00 09 00 00 00 01 07 00 3E FF 00 00 00 03 07 00 03 01 01 00 01 07 00 86 45 07 00 3E 40 07 00 A8 4B 07 00 A8 FF 00 02 00 03 07 00 03 01 01 00 02 07 00 A8 01 5E 07 00 A8 45 07 00 3E 40 03 45 07 00 3E 40 01 4B 01 FF 00 02 00 03 07 00 03 01 01 00 02 01 01 5E 01 FC 00 00 01 FF 00 10 00 04 07 00 03 01 01 01 00 02 01 07 00 49 FF 00 02 00 04 07 00 03 01 01 01 00 03 01 07 00 49 01 FF 00 1E 00 04 07 00 03 01 01 01 00 02 01 07 00 49 FF 00 0E 00 04 07 00 03 01 01 01 00 02 01 07 00 86 FF 00 02 00 04 07 00 03 01 01 01 00 03 01 07 00 86 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 01 07 00 86 42 07 00 3E FF 00 00 00 04 07 00 03 01 01 01 00 02 01 07 00 86 45 07 00 3E FF 00 00 00 04 07 00 03 01 01 01 00 02 01 07 00 A8 45 07 00 3E FF 00 00 00 04 07 00 03 01 01 01 00 02 01 03 45 07 00 3E FF 00 00 00 04 07 00 03 01 01 01 00 02 01 01 04 05 42 01 18 52 07 00 86 FF 00 02 00 04 07 00 03 01 01 01 00 02 07 00 86 01 5D 07 00 86 42 07 00 22 40 07 00 86 45 07 00 3E 40 07 00 A8 4E 03 FF 00 02 00 04 07 00 03 01 01 01 00 02 03 01 5E 03 42 07 00 1A 40 03 45 07 00 3E 40 01 FC 00 01 01 0B 42 01 1F FF 00 0E 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 02 00 05 07 00 03 01 01 01 01 00 03 01 07 00 03 01 FF 00 1D 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 0E 00 05 07 00 03 01 01 01 01 00 02 01 07 00 49 FF 00 02 00 05 07 00 03 01 01 01 01 00 03 01 07 00 49 01 FF 00 1D 00 05 07 00 03 01 01 01 01 00 02 01 07 00 49 45 07 00 3E FF 00 00 00 05 07 00 03 01 01 01 01 00 02 01 07 00 86 45 07 00 3E FF 00 00 00 05 07 00 03 01 01 01 01 00 02 01 07 00 A8 45 07 00 1C FF 00 00 00 05 07 00 03 01 01 01 01 00 02 01 03 45 07 00 3E FF 00 00 00 05 07 00 03 01 01 01 01 00 02 01 01 10 42 01 1F 4F 07 00 49 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 07 00 49 01 5C 07 00 49 4D 07 00 3E FF 00 00 00 05 07 00 03 01 01 01 01 00 06 07 01 8B 08 03 D3 08 03 D3 01 01 01 45 07 00 3E FF 00 00 00 05 07 00 03 01 01 01 01 00 02 07 01 8B 07 00 B5 42 07 00 32 FF 00 00 00 05 07 00 03 01 01 01 01 00 02 07 01 8B 07 00 B5 45 07 00 3E 40 07 01 91 42 07 00 24 40 07 01 91 47 07 00 3E 40 07 00 97 FC 00 0D 07 00 97 42 01 1C 18 42 01 1F 09 4C 01 FF 00 02 00 06 07 00 03 01 01 01 01 07 00 97 00 02 01 01 5D 01 00 FA 00 05 FA 00 05 F9 00 01 FE 00 01 01 01 01 FC 00 01 07 00 97 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 01 07 00 49 F8 00 01 FD 00 01 01 01 FE 00 01 01 01 07 00 97 FF 00 01 00 03 07 00 03 01 01 00 01 07 00 A8 FF 00 01 00 04 07 00 03 01 01 01 00 01 03 FC 00 01 01 FF 00 01 00 05 07 00 03 01 01 01 01 00 02 01 07 00 49 41 07 00 49 FF 00 01 00 04 07 00 03 01 01 01 00 02 01 07 00 86 FF 00 01 00 03 07 00 03 01 01 00 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 86 FF 00 01 00 05 07 00 03 01 01 01 01 00 02 01 07 00 03 FF 00 01 00 06 07 00 03 01 01 01 01 07 00 97 00 01 01 FF 00 01 00 02 07 00 03 01 00 01 07 00 49 FF 00 01 00 01 07 00 03 00 01 07 00 3E 43 05 44 07 00 3E 47 05 FF 00 07 00 03 07 00 03 01 01 00 01 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1246   1254   Any
        //  1246   1254   1246   1254   Ljava/lang/NumberFormatException;
        //  1262   1264   3      8      Any
        //  230    237    237    238    Any
        //  230    237    230    231    Any
        //  231    237    230    231    Ljava/lang/EnumConstantNotPresentException;
        //  231    237    230    231    Any
        //  231    237    230    231    Any
        //  303    309    309    310    Any
        //  303    309    309    310    Any
        //  303    309    309    310    Any
        //  303    309    3      8      Any
        //  303    309    309    310    Ljava/lang/UnsupportedOperationException;
        //  362    369    369    370    Any
        //  362    369    369    370    Any
        //  363    369    362    363    Any
        //  362    369    3      8      Ljava/lang/NumberFormatException;
        //  363    369    362    363    Ljava/lang/StringIndexOutOfBoundsException;
        //  519    526    526    527    Any
        //  519    526    519    520    Ljava/lang/NegativeArraySizeException;
        //  519    526    3      8      Ljava/lang/IllegalArgumentException;
        //  520    526    519    520    Ljava/lang/IllegalStateException;
        //  520    526    519    520    Any
        //  533    540    540    541    Any
        //  533    540    533    534    Any
        //  534    540    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  533    540    533    534    Ljava/lang/StringIndexOutOfBoundsException;
        //  534    540    540    541    Ljava/lang/StringIndexOutOfBoundsException;
        //  635    642    642    643    Any
        //  636    642    635    636    Ljava/lang/NegativeArraySizeException;
        //  636    642    3      8      Ljava/lang/NegativeArraySizeException;
        //  635    642    3      8      Ljava/lang/UnsupportedOperationException;
        //  636    642    642    643    Any
        //  695    702    702    703    Any
        //  696    702    695    696    Ljava/lang/UnsupportedOperationException;
        //  696    702    702    703    Ljava/lang/AssertionError;
        //  696    702    702    703    Any
        //  696    702    702    703    Ljava/lang/IndexOutOfBoundsException;
        //  854    861    861    862    Any
        //  854    861    861    862    Any
        //  855    861    3      8      Any
        //  854    861    3      8      Any
        //  854    861    854    855    Any
        //  868    875    875    876    Any
        //  869    875    868    869    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  869    875    3      8      Any
        //  869    875    3      8      Any
        //  869    875    875    876    Ljava/lang/AssertionError;
        //  990    997    997    998    Any
        //  991    997    990    991    Any
        //  990    997    990    991    Any
        //  990    997    3      8      Any
        //  991    997    990    991    Any
        //  1001   1008   1008   1009   Any
        //  1002   1008   1001   1002   Ljava/lang/ClassCastException;
        //  1001   1008   3      8      Ljava/lang/ArithmeticException;
        //  1001   1008   1008   1009   Any
        //  1002   1008   3      8      Any
        //  1012   1021   1021   1022   Any
        //  1013   1021   1012   1013   Ljava/util/ConcurrentModificationException;
        //  1012   1021   1021   1022   Ljava/lang/EnumConstantNotPresentException;
        //  1012   1021   1021   1022   Ljava/lang/NegativeArraySizeException;
        //  1012   1021   1021   1022   Any
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
    
    public boolean c() {
        return fbS.eA(this, 229766596);
    }
}
