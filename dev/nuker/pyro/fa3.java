// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;
import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public class fa3 extends fH
{
    @NotNull
    public fa2 c;
    @NotNull
    public CopyOnWriteArrayList<fa1> c;
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    @NotNull
    public f0a 1;
    @NotNull
    public f0d c;
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4349
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            4341
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4333
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             1379335791
        //    33: goto            38
        //    36: ldc             -480986873
        //    38: ldc             -431523538
        //    40: ixor           
        //    41: lookupswitch {
        //          -1267628223: 4246
        //          828618527: 36
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //    71: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    74: ifnull          4209
        //    77: aload_0        
        //    78: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //    81: dup            
        //    82: pop            
        //    83: goto            87
        //    86: athrow         
        //    87: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //    90: goto            94
        //    93: athrow         
        //    94: ifnonnull       155
        //    97: aload_0        
        //    98: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //   101: getstatic       dev/nuker/pyro/fc.0:I
        //   104: ifeq            112
        //   107: ldc             -825307751
        //   109: goto            114
        //   112: ldc             64463739
        //   114: ldc             565207389
        //   116: ixor           
        //   117: lookupswitch {
        //          -276910908: 112
        //          577225254: 144
        //          default: 4288
        //        }
        //   144: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   147: dup            
        //   148: pop            
        //   149: checkcast       Lnet/minecraft/entity/Entity;
        //   152: goto            277
        //   155: aload_0        
        //   156: getstatic       dev/nuker/pyro/fc.c:I
        //   159: ifge            167
        //   162: ldc             -1139790881
        //   164: goto            169
        //   167: ldc             1081481661
        //   169: ldc             790508748
        //   171: ixor           
        //   172: lookupswitch {
        //          -1827791085: 167
        //          1869098353: 200
        //          default: 4252
        //        }
        //   200: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //   203: dup            
        //   204: pop            
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   212: goto            216
        //   215: athrow         
        //   216: dup            
        //   217: ifnonnull       275
        //   220: getstatic       dev/nuker/pyro/fc.c:I
        //   223: ifge            231
        //   226: ldc             -260754516
        //   228: goto            233
        //   231: ldc             2128955855
        //   233: ldc             -661360478
        //   235: ixor           
        //   236: lookupswitch {
        //          -1502529171: 264
        //          685851406: 231
        //          default: 4312
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   271: goto            275
        //   274: athrow         
        //   275: dup            
        //   276: pop            
        //   277: astore_3       
        //   278: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //   281: aload_3        
        //   282: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //   285: aload_3        
        //   286: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   289: aload_3        
        //   290: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //   293: dsub           
        //   294: fload_2        
        //   295: f2d            
        //   296: dmul           
        //   297: dadd           
        //   298: aload_3        
        //   299: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //   302: getstatic       dev/nuker/pyro/fc.1:I
        //   305: ifeq            313
        //   308: ldc             -1672175122
        //   310: goto            315
        //   313: ldc             -569756213
        //   315: ldc             647973588
        //   317: ixor           
        //   318: lookupswitch {
        //          -1161041094: 313
        //          -124420321: 344
        //          default: 4244
        //        }
        //   344: aload_3        
        //   345: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   348: aload_3        
        //   349: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //   352: dsub           
        //   353: fload_2        
        //   354: f2d            
        //   355: dmul           
        //   356: dadd           
        //   357: aload_3        
        //   358: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //   361: getstatic       dev/nuker/pyro/fc.1:I
        //   364: ifeq            372
        //   367: ldc             -371210062
        //   369: goto            374
        //   372: ldc             -429102121
        //   374: ldc             362986581
        //   376: ixor           
        //   377: lookupswitch {
        //          -1127842541: 372
        //          -58886937: 4300
        //          default: 404
        //        }
        //   404: aload_3        
        //   405: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   408: aload_3        
        //   409: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //   412: dsub           
        //   413: getstatic       dev/nuker/pyro/fc.c:I
        //   416: ifge            424
        //   419: ldc             963884559
        //   421: goto            426
        //   424: ldc             -9584102
        //   426: ldc             -2079622298
        //   428: ixor           
        //   429: lookupswitch {
        //          -1116156567: 424
        //          2070329724: 456
        //          default: 4256
        //        }
        //   456: fload_2        
        //   457: f2d            
        //   458: dmul           
        //   459: dadd           
        //   460: goto            464
        //   463: athrow         
        //   464: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78547_a:(DDD)V
        //   469: goto            473
        //   472: athrow         
        //   473: aload_0        
        //   474: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   477: checkcast       Ljava/lang/Iterable;
        //   480: astore          4
        //   482: iconst_0       
        //   483: istore          5
        //   485: aload           4
        //   487: goto            491
        //   490: athrow         
        //   491: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   496: goto            500
        //   499: athrow         
        //   500: astore          6
        //   502: aload           6
        //   504: goto            508
        //   507: athrow         
        //   508: invokeinterface java/util/Iterator.hasNext:()Z
        //   513: goto            517
        //   516: athrow         
        //   517: ifeq            4193
        //   520: getstatic       dev/nuker/pyro/fc.c:I
        //   523: ifge            531
        //   526: ldc             547813750
        //   528: goto            533
        //   531: ldc             85574800
        //   533: ldc             1502677170
        //   535: ixor           
        //   536: lookupswitch {
        //          1552469026: 564
        //          2033709508: 531
        //          default: 4316
        //        }
        //   564: aload           6
        //   566: getstatic       dev/nuker/pyro/fc.0:I
        //   569: ifeq            577
        //   572: ldc             635514152
        //   574: goto            579
        //   577: ldc             1132480861
        //   579: ldc             762822741
        //   581: ixor           
        //   582: lookupswitch {
        //          144108925: 577
        //          1861716232: 608
        //          default: 4220
        //        }
        //   608: goto            612
        //   611: athrow         
        //   612: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   617: goto            621
        //   620: athrow         
        //   621: astore          7
        //   623: aload           7
        //   625: checkcast       Ldev/nuker/pyro/fa1;
        //   628: astore          8
        //   630: iconst_0       
        //   631: istore          9
        //   633: getstatic       dev/nuker/pyro/fc.c:I
        //   636: ifge            644
        //   639: ldc             1018616455
        //   641: goto            646
        //   644: ldc             506369810
        //   646: ldc             1950003625
        //   648: ixor           
        //   649: lookupswitch {
        //          1217162030: 644
        //          1779705531: 676
        //          default: 4240
        //        }
        //   676: aload_0        
        //   677: getstatic       dev/nuker/pyro/fc.1:I
        //   680: ifeq            688
        //   683: ldc             1992416244
        //   685: goto            690
        //   688: ldc             239659366
        //   690: ldc             -1811907424
        //   692: ixor           
        //   693: lookupswitch {
        //          -1706519098: 720
        //          -490625196: 688
        //          default: 4258
        //        }
        //   720: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //   723: getstatic       dev/nuker/pyro/fc.c:I
        //   726: ifge            734
        //   729: ldc             480578743
        //   731: goto            736
        //   734: ldc             -70362457
        //   736: ldc             -1424694656
        //   738: ixor           
        //   739: lookupswitch {
        //          -2143976150: 734
        //          -1213075913: 4248
        //          default: 764
        //        }
        //   764: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   767: aload           8
        //   769: getstatic       dev/nuker/pyro/fc.1:I
        //   772: ifeq            780
        //   775: ldc             -928465915
        //   777: goto            782
        //   780: ldc             202693335
        //   782: ldc             1331082918
        //   784: ixor           
        //   785: lookupswitch {
        //          -2013394269: 4318
        //          -101889757: 780
        //          default: 812
        //        }
        //   812: goto            816
        //   815: athrow         
        //   816: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //   819: goto            823
        //   822: athrow         
        //   823: getstatic       dev/nuker/pyro/fc.0:I
        //   826: ifeq            834
        //   829: ldc             -146355734
        //   831: goto            836
        //   834: ldc             716830792
        //   836: ldc             -1338710995
        //   838: ixor           
        //   839: lookupswitch {
        //          -904558956: 834
        //          1198665159: 4280
        //          default: 864
        //        }
        //   864: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   867: getstatic       dev/nuker/pyro/fc.0:I
        //   870: ifeq            878
        //   873: ldc             1142379352
        //   875: goto            880
        //   878: ldc             1509884995
        //   880: ldc             -1097946558
        //   882: ixor           
        //   883: lookupswitch {
        //          -90572518: 4274
        //          1334027823: 878
        //          default: 908
        //        }
        //   908: aload           8
        //   910: goto            914
        //   913: athrow         
        //   914: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //   917: goto            921
        //   920: athrow         
        //   921: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   924: aload           8
        //   926: goto            930
        //   929: athrow         
        //   930: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //   933: goto            937
        //   936: athrow         
        //   937: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   940: getstatic       dev/nuker/pyro/fc.1:I
        //   943: ifeq            951
        //   946: ldc             -1676610790
        //   948: goto            953
        //   951: ldc             1768978677
        //   953: ldc             -1413950803
        //   955: ixor           
        //   956: lookupswitch {
        //          -1027036584: 984
        //          933765559: 951
        //          default: 4298
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70011_f:(DDD)D
        //   991: goto            995
        //   994: athrow         
        //   995: ldc2_w          256.0
        //   998: dcmpg          
        //   999: ifgt            4188
        //  1002: new             Lnet/minecraft/util/math/BlockPos;
        //  1005: dup            
        //  1006: getstatic       dev/nuker/pyro/fc.1:I
        //  1009: ifeq            1017
        //  1012: ldc             1777232375
        //  1014: goto            1019
        //  1017: ldc             -593118996
        //  1019: ldc             -516036971
        //  1021: ixor           
        //  1022: lookupswitch {
        //          -1999401118: 4232
        //          -99835916: 1017
        //          default: 1048
        //        }
        //  1048: aload           8
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  1057: goto            1061
        //  1060: athrow         
        //  1061: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1064: getstatic       dev/nuker/pyro/fc.c:I
        //  1067: ifge            1075
        //  1070: ldc             562465801
        //  1072: goto            1077
        //  1075: ldc             219372478
        //  1077: ldc             260275412
        //  1079: ixor           
        //  1080: lookupswitch {
        //          -315023297: 1075
        //          772141277: 4234
        //          default: 1108
        //        }
        //  1108: aload           8
        //  1110: goto            1114
        //  1113: athrow         
        //  1114: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  1117: goto            1121
        //  1120: athrow         
        //  1121: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1124: aload           8
        //  1126: goto            1130
        //  1129: athrow         
        //  1130: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  1147: goto            1151
        //  1150: athrow         
        //  1151: astore          10
        //  1153: aload           10
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1162: goto            1166
        //  1165: athrow         
        //  1166: astore          11
        //  1168: aload_0        
        //  1169: aload           11
        //  1171: dup            
        //  1172: pop            
        //  1173: getstatic       dev/nuker/pyro/fc.c:I
        //  1176: ifge            1184
        //  1179: ldc             -1657402303
        //  1181: goto            1186
        //  1184: ldc             1613776042
        //  1186: ldc             2096275732
        //  1188: ixor           
        //  1189: lookupswitch {
        //          -507204267: 4250
        //          1904679308: 1184
        //          default: 1216
        //        }
        //  1216: goto            1220
        //  1219: athrow         
        //  1220: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1225: goto            1229
        //  1228: athrow         
        //  1229: dup            
        //  1230: pop            
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: invokevirtual   dev/nuker/pyro/fa3.c:(Lnet/minecraft/block/Block;)Z
        //  1238: goto            1242
        //  1241: athrow         
        //  1242: ifeq            1250
        //  1245: ldc             501855053
        //  1247: goto            1252
        //  1250: ldc             501855054
        //  1252: ldc             -1395017508
        //  1254: ixor           
        //  1255: tableswitch {
        //          1650464546: 1276
        //          1650464547: 4188
        //          default: 1245
        //        }
        //  1276: aload           11
        //  1278: aload_0        
        //  1279: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  1282: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1285: checkcast       Lnet/minecraft/world/IBlockAccess;
        //  1288: aload           10
        //  1290: goto            1294
        //  1293: athrow         
        //  1294: invokeinterface net/minecraft/block/state/IBlockState.func_185900_c:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: aload           10
        //  1305: goto            1309
        //  1308: athrow         
        //  1309: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  1312: goto            1316
        //  1315: athrow         
        //  1316: i2d            
        //  1317: getstatic       dev/nuker/pyro/fc.0:I
        //  1320: ifeq            1328
        //  1323: ldc             1867183307
        //  1325: goto            1330
        //  1328: ldc             1961083973
        //  1330: ldc             -467733736
        //  1332: ixor           
        //  1333: lookupswitch {
        //          -1957427245: 4236
        //          410605775: 1328
        //          default: 1360
        //        }
        //  1360: aload           10
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1369: goto            1373
        //  1372: athrow         
        //  1373: i2d            
        //  1374: aload           10
        //  1376: goto            1380
        //  1379: athrow         
        //  1380: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: i2d            
        //  1388: getstatic       dev/nuker/pyro/fc.0:I
        //  1391: ifeq            1399
        //  1394: ldc             -931974697
        //  1396: goto            1402
        //  1399: ldc_w           -1652248173
        //  1402: ldc_w           -434418025
        //  1405: ixor           
        //  1406: lookupswitch {
        //          778600256: 1399
        //          2074083076: 1432
        //          default: 4284
        //        }
        //  1432: goto            1436
        //  1435: athrow         
        //  1436: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1439: goto            1443
        //  1442: athrow         
        //  1443: astore          12
        //  1445: aload_0        
        //  1446: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  1449: dup            
        //  1450: pop            
        //  1451: goto            1455
        //  1454: athrow         
        //  1455: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //  1458: goto            1462
        //  1461: athrow         
        //  1462: dup            
        //  1463: ifnonnull       1496
        //  1466: new             Lkotlin/TypeCastException;
        //  1469: dup            
        //  1470: ldc_w           "\u293e\u1486\u8025\ub1c4\uc4ce\ue735\ub225\uec0a\udb77\ue4f2\uade2\u1e0c\ueb22\uc7b3\u8c3a\u83ae\u57a5\u7dd2\ubf38\ucd01\u21d6\uc234\u6089\u2f49\uda90\u3f5b\u7d66\u8364\u8215\u81d6\u8e7c\ufb72\u7a02\u981e\u16d8\ufbb2\u493c\u82a1\uc892\uf27c\ubc46\u41fd\ub325\ub152\u413d\u8037\u7c27\uc4f1\u7f46\ue79d\uec07\u1696\ue49f\u3596\u4bff\ueb25\u0a19\u8c5b\u1bf6\u020a\u7dc3\u7289\ucd2b\ub9b9\u97bd\u60c4\ue2e8\udaf1\ua73b\u2885\u8374\u4f80\u81b6\u161a\uae9c\u7a09\u55b5\u16a8\u63cc"
        //  1473: goto            1477
        //  1476: athrow         
        //  1477: invokestatic    invokestatic   !!! ERROR
        //  1480: goto            1484
        //  1483: athrow         
        //  1484: goto            1488
        //  1487: athrow         
        //  1488: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1491: goto            1495
        //  1494: athrow         
        //  1495: athrow         
        //  1496: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //  1499: getstatic       dev/nuker/pyro/fc.1:I
        //  1502: ifeq            1511
        //  1505: ldc_w           -596960777
        //  1508: goto            1514
        //  1511: ldc_w           -591960596
        //  1514: ldc_w           -924235060
        //  1517: ixor           
        //  1518: lookupswitch {
        //          344085307: 4222
        //          1398619734: 1511
        //          default: 1544
        //        }
        //  1544: astore          13
        //  1546: aload_0        
        //  1547: aload           11
        //  1549: getstatic       dev/nuker/pyro/fc.c:I
        //  1552: ifge            1561
        //  1555: ldc_w           1109281357
        //  1558: goto            1564
        //  1561: ldc_w           435790009
        //  1564: ldc_w           1403478747
        //  1567: ixor           
        //  1568: lookupswitch {
        //          297347222: 4292
        //          808781393: 1561
        //          default: 1596
        //        }
        //  1596: aload           11
        //  1598: getstatic       dev/nuker/pyro/fc.c:I
        //  1601: ifge            1610
        //  1604: ldc_w           -16824922
        //  1607: goto            1613
        //  1610: ldc_w           -2131797633
        //  1613: ldc_w           1214138488
        //  1616: ixor           
        //  1617: lookupswitch {
        //          -1230959138: 4228
        //          -146651667: 1610
        //          default: 1644
        //        }
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  1653: goto            1657
        //  1656: athrow         
        //  1657: dup            
        //  1658: pop            
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: invokevirtual   dev/nuker/pyro/fa3.c:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/Block;)Ljava/awt/Color;
        //  1666: goto            1670
        //  1669: athrow         
        //  1670: astore          14
        //  1672: aload_0        
        //  1673: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/f0a;
        //  1676: goto            1680
        //  1679: athrow         
        //  1680: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1683: goto            1687
        //  1686: athrow         
        //  1687: checkcast       Ljava/lang/Boolean;
        //  1690: getstatic       dev/nuker/pyro/fc.c:I
        //  1693: ifge            1702
        //  1696: ldc_w           -1726927587
        //  1699: goto            1705
        //  1702: ldc_w           -1049115203
        //  1705: ldc_w           -1909268984
        //  1708: ixor           
        //  1709: lookupswitch {
        //          388231957: 1702
        //          1329929141: 1736
        //          default: 4322
        //        }
        //  1736: goto            1740
        //  1739: athrow         
        //  1740: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: ifne            1782
        //  1750: aload_0        
        //  1751: getfield        dev/nuker/pyro/fa3.1:Ldev/nuker/pyro/f0a;
        //  1754: goto            1758
        //  1757: athrow         
        //  1758: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1761: goto            1765
        //  1764: athrow         
        //  1765: checkcast       Ljava/lang/Boolean;
        //  1768: goto            1772
        //  1771: athrow         
        //  1772: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1775: goto            1779
        //  1778: athrow         
        //  1779: ifeq            2225
        //  1782: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
        //  1785: aload           12
        //  1787: getstatic       dev/nuker/pyro/fc.0:I
        //  1790: ifeq            1799
        //  1793: ldc_w           -766128890
        //  1796: goto            1802
        //  1799: ldc_w           177012355
        //  1802: ldc_w           1332811166
        //  1805: ixor           
        //  1806: lookupswitch {
        //          -1658529640: 4264
        //          1470161042: 1799
        //          default: 1832
        //        }
        //  1832: goto            1836
        //  1835: athrow         
        //  1836: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78546_a:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //  1841: goto            1845
        //  1844: athrow         
        //  1845: ifeq            2225
        //  1848: aload           12
        //  1850: getstatic       dev/nuker/pyro/fc.1:I
        //  1853: ifeq            1862
        //  1856: ldc_w           -571867269
        //  1859: goto            1865
        //  1862: ldc_w           752912789
        //  1865: ldc_w           -1159806671
        //  1868: ixor           
        //  1869: lookupswitch {
        //          -1774303068: 1896
        //          1731673674: 1862
        //          default: 4254
        //        }
        //  1896: aload           13
        //  1898: goto            1902
        //  1901: athrow         
        //  1902: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosX:()D
        //  1907: goto            1911
        //  1910: athrow         
        //  1911: dneg           
        //  1912: aload           13
        //  1914: goto            1918
        //  1917: athrow         
        //  1918: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosY:()D
        //  1923: goto            1927
        //  1926: athrow         
        //  1927: dneg           
        //  1928: aload           13
        //  1930: goto            1934
        //  1933: athrow         
        //  1934: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosZ:()D
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: dneg           
        //  1944: goto            1948
        //  1947: athrow         
        //  1948: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1951: goto            1955
        //  1954: athrow         
        //  1955: astore          15
        //  1957: aload_0        
        //  1958: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/f0a;
        //  1961: goto            1965
        //  1964: athrow         
        //  1965: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1968: goto            1972
        //  1971: athrow         
        //  1972: checkcast       Ljava/lang/Boolean;
        //  1975: goto            1979
        //  1978: athrow         
        //  1979: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1982: goto            1986
        //  1985: athrow         
        //  1986: ifeq            2076
        //  1989: goto            1993
        //  1992: athrow         
        //  1993: invokestatic    dev/nuker/pyro/fbs.1:()V
        //  1996: goto            2000
        //  1999: athrow         
        //  2000: aload           15
        //  2002: ldc_w           1.5
        //  2005: getstatic       dev/nuker/pyro/fc.0:I
        //  2008: ifeq            2017
        //  2011: ldc_w           628708291
        //  2014: goto            2020
        //  2017: ldc_w           -202809433
        //  2020: ldc_w           91868160
        //  2023: ixor           
        //  2024: lookupswitch {
        //          -158297177: 2052
        //          536911811: 2017
        //          default: 4296
        //        }
        //  2052: aload           14
        //  2054: goto            2058
        //  2057: athrow         
        //  2058: invokestatic    dev/nuker/pyro/fbs.c:(Lnet/minecraft/util/math/AxisAlignedBB;FLjava/awt/Color;)V
        //  2061: goto            2065
        //  2064: athrow         
        //  2065: goto            2069
        //  2068: athrow         
        //  2069: invokestatic    dev/nuker/pyro/fbs.3:()V
        //  2072: goto            2076
        //  2075: athrow         
        //  2076: getstatic       dev/nuker/pyro/fc.0:I
        //  2079: ifeq            2088
        //  2082: ldc_w           493201826
        //  2085: goto            2091
        //  2088: ldc_w           1613102769
        //  2091: ldc_w           -666930014
        //  2094: ixor           
        //  2095: lookupswitch {
        //          -983900928: 4304
        //          -78959582: 2088
        //          default: 2120
        //        }
        //  2120: aload_0        
        //  2121: getfield        dev/nuker/pyro/fa3.1:Ldev/nuker/pyro/f0a;
        //  2124: goto            2128
        //  2127: athrow         
        //  2128: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2131: goto            2135
        //  2134: athrow         
        //  2135: checkcast       Ljava/lang/Boolean;
        //  2138: goto            2142
        //  2141: athrow         
        //  2142: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2145: goto            2149
        //  2148: athrow         
        //  2149: ifeq            2158
        //  2152: ldc_w           278458103
        //  2155: goto            2161
        //  2158: ldc_w           278458102
        //  2161: ldc_w           -1265414835
        //  2164: ixor           
        //  2165: tableswitch {
        //          1209485172: 2188
        //          1209485173: 2225
        //          default: 2152
        //        }
        //  2188: goto            2192
        //  2191: athrow         
        //  2192: invokestatic    dev/nuker/pyro/fbs.1:()V
        //  2195: goto            2199
        //  2198: athrow         
        //  2199: aload           15
        //  2201: aload           14
        //  2203: goto            2207
        //  2206: athrow         
        //  2207: invokestatic    dev/nuker/pyro/fbs.c:(Lnet/minecraft/util/math/AxisAlignedBB;Ljava/awt/Color;)V
        //  2210: goto            2214
        //  2213: athrow         
        //  2214: goto            2218
        //  2217: athrow         
        //  2218: invokestatic    dev/nuker/pyro/fbs.3:()V
        //  2221: goto            2225
        //  2224: athrow         
        //  2225: getstatic       dev/nuker/pyro/fc.c:I
        //  2228: ifge            2237
        //  2231: ldc_w           1951213826
        //  2234: goto            2240
        //  2237: ldc_w           -939255282
        //  2240: ldc_w           1691437245
        //  2243: ixor           
        //  2244: lookupswitch {
        //          -1497068560: 2237
        //          278684095: 4294
        //          default: 2272
        //        }
        //  2272: aload_0        
        //  2273: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  2276: dup            
        //  2277: pop            
        //  2278: goto            2282
        //  2281: athrow         
        //  2282: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  2285: goto            2289
        //  2288: athrow         
        //  2289: ifnull          2298
        //  2292: ldc_w           -980720591
        //  2295: goto            2301
        //  2298: ldc_w           -980720592
        //  2301: ldc_w           768787883
        //  2304: ixor           
        //  2305: tableswitch {
        //          -793558220: 2328
        //          -793558219: 2348
        //          default: 2292
        //        }
        //  2328: aload_0        
        //  2329: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  2332: dup            
        //  2333: pop            
        //  2334: goto            2338
        //  2337: athrow         
        //  2338: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  2341: goto            2345
        //  2344: athrow         
        //  2345: goto            2405
        //  2348: aload_0        
        //  2349: getstatic       dev/nuker/pyro/fc.c:I
        //  2352: ifge            2361
        //  2355: ldc_w           1015597812
        //  2358: goto            2364
        //  2361: ldc_w           671022633
        //  2364: ldc_w           1913336544
        //  2367: ixor           
        //  2368: lookupswitch {
        //          1317271572: 2361
        //          1442172105: 2396
        //          default: 4308
        //        }
        //  2396: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  2399: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2402: checkcast       Lnet/minecraft/entity/Entity;
        //  2405: getstatic       dev/nuker/pyro/fc.c:I
        //  2408: ifge            2417
        //  2411: ldc_w           -272947072
        //  2414: goto            2420
        //  2417: ldc_w           1607836238
        //  2420: ldc_w           1416130296
        //  2423: ixor           
        //  2424: lookupswitch {
        //          -1143781768: 2417
        //          196988086: 2452
        //          default: 4230
        //        }
        //  2452: astore          15
        //  2454: getstatic       dev/nuker/pyro/fc.1:I
        //  2457: ifeq            2466
        //  2460: ldc_w           -567630101
        //  2463: goto            2469
        //  2466: ldc_w           1242727540
        //  2469: ldc_w           -1040034380
        //  2472: ixor           
        //  2473: lookupswitch {
        //          472445791: 4224
        //          2146981399: 2466
        //          default: 2500
        //        }
        //  2500: aload_0        
        //  2501: getstatic       dev/nuker/pyro/fc.c:I
        //  2504: ifge            2513
        //  2507: ldc_w           -1669730551
        //  2510: goto            2516
        //  2513: ldc_w           -687084876
        //  2516: ldc_w           1789087845
        //  2519: ixor           
        //  2520: lookupswitch {
        //          -1113015599: 2548
        //          -153436308: 2513
        //          default: 4306
        //        }
        //  2548: getfield        dev/nuker/pyro/fa3.0:Ldev/nuker/pyro/f0a;
        //  2551: goto            2555
        //  2554: athrow         
        //  2555: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2558: goto            2562
        //  2561: athrow         
        //  2562: checkcast       Ljava/lang/Boolean;
        //  2565: goto            2569
        //  2568: athrow         
        //  2569: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2572: goto            2576
        //  2575: athrow         
        //  2576: ifeq            4188
        //  2579: aload           15
        //  2581: ifnull          2590
        //  2584: ldc_w           -2112019493
        //  2587: goto            2593
        //  2590: ldc_w           -2112019494
        //  2593: ldc_w           -862084011
        //  2596: ixor           
        //  2597: tableswitch {
        //          -1660874980: 2620
        //          -1660874979: 4188
        //          default: 2584
        //        }
        //  2620: getstatic       dev/nuker/pyro/fc.0:I
        //  2623: ifeq            2632
        //  2626: ldc_w           -664289539
        //  2629: goto            2635
        //  2632: ldc_w           -1384601062
        //  2635: ldc_w           -263913768
        //  2638: ixor           
        //  2639: lookupswitch {
        //          673398821: 4260
        //          2117944632: 2632
        //          default: 2664
        //        }
        //  2664: aload_0        
        //  2665: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  2668: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //  2671: getfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //  2674: istore          16
        //  2676: aload_0        
        //  2677: getstatic       dev/nuker/pyro/fc.1:I
        //  2680: ifeq            2689
        //  2683: ldc_w           2107365082
        //  2686: goto            2692
        //  2689: ldc_w           -750291974
        //  2692: ldc_w           187533818
        //  2695: ixor           
        //  2696: lookupswitch {
        //          -1743216138: 2689
        //          1991663392: 4268
        //          default: 2724
        //        }
        //  2724: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  2727: getstatic       dev/nuker/pyro/fc.1:I
        //  2730: ifeq            2739
        //  2733: ldc_w           -1466710043
        //  2736: goto            2742
        //  2739: ldc_w           -1053739979
        //  2742: ldc_w           -1649816851
        //  2745: ixor           
        //  2746: lookupswitch {
        //          892996872: 2739
        //          1553530584: 2772
        //          default: 4212
        //        }
        //  2772: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //  2775: iconst_0       
        //  2776: putfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //  2779: getstatic       dev/nuker/pyro/fc.0:I
        //  2782: ifeq            2791
        //  2785: ldc_w           1678484436
        //  2788: goto            2794
        //  2791: ldc_w           1180420486
        //  2794: ldc_w           739528343
        //  2797: ixor           
        //  2798: lookupswitch {
        //          1210051907: 2791
        //          1783596817: 2824
        //          default: 4276
        //        }
        //  2824: aload           8
        //  2826: goto            2830
        //  2829: athrow         
        //  2830: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  2833: goto            2837
        //  2836: athrow         
        //  2837: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  2840: aload           13
        //  2842: goto            2846
        //  2845: athrow         
        //  2846: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosX:()D
        //  2851: goto            2855
        //  2854: athrow         
        //  2855: dsub           
        //  2856: dstore          17
        //  2858: getstatic       dev/nuker/pyro/fc.c:I
        //  2861: ifge            2870
        //  2864: ldc_w           513093145
        //  2867: goto            2873
        //  2870: ldc_w           1823248639
        //  2873: ldc_w           -1635079431
        //  2876: ixor           
        //  2877: lookupswitch {
        //          -2145418016: 2870
        //          -232375802: 2904
        //          default: 4314
        //        }
        //  2904: aload           8
        //  2906: goto            2910
        //  2909: athrow         
        //  2910: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  2913: goto            2917
        //  2916: athrow         
        //  2917: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  2920: aload           13
        //  2922: getstatic       dev/nuker/pyro/fc.c:I
        //  2925: ifge            2934
        //  2928: ldc_w           -1038742710
        //  2931: goto            2937
        //  2934: ldc_w           -1232010039
        //  2937: ldc_w           110261477
        //  2940: ixor           
        //  2941: lookupswitch {
        //          -997949521: 4218
        //          615586872: 2934
        //          default: 2968
        //        }
        //  2968: goto            2972
        //  2971: athrow         
        //  2972: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosY:()D
        //  2977: goto            2981
        //  2980: athrow         
        //  2981: dsub           
        //  2982: getstatic       dev/nuker/pyro/fc.c:I
        //  2985: ifge            2994
        //  2988: ldc_w           699391560
        //  2991: goto            2997
        //  2994: ldc_w           -1619589650
        //  2997: ldc_w           1302386064
        //  3000: ixor           
        //  3001: lookupswitch {
        //          -1577554963: 2994
        //          1678707672: 4262
        //          default: 3028
        //        }
        //  3028: dstore          19
        //  3030: aload           8
        //  3032: goto            3036
        //  3035: athrow         
        //  3036: invokevirtual   dev/nuker/pyro/fa1.0:()Lnet/minecraft/util/math/Vec3d;
        //  3039: goto            3043
        //  3042: athrow         
        //  3043: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  3046: aload           13
        //  3048: goto            3052
        //  3051: athrow         
        //  3052: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosZ:()D
        //  3057: goto            3061
        //  3060: athrow         
        //  3061: dsub           
        //  3062: getstatic       dev/nuker/pyro/fc.1:I
        //  3065: ifeq            3074
        //  3068: ldc_w           -57660388
        //  3071: goto            3077
        //  3074: ldc_w           1869269590
        //  3077: ldc_w           -352652493
        //  3080: ixor           
        //  3081: lookupswitch {
        //          -2054145691: 3108
        //          376102703: 3074
        //          default: 4320
        //        }
        //  3108: dstore          21
        //  3110: fconst_1       
        //  3111: fconst_1       
        //  3112: fconst_1       
        //  3113: fconst_1       
        //  3114: getstatic       dev/nuker/pyro/fc.c:I
        //  3117: ifge            3126
        //  3120: ldc_w           1285838946
        //  3123: goto            3129
        //  3126: ldc_w           1767905564
        //  3129: ldc_w           -643534910
        //  3132: ixor           
        //  3133: lookupswitch {
        //          -1795147872: 4226
        //          2104554152: 3126
        //          default: 3160
        //        }
        //  3160: goto            3164
        //  3163: athrow         
        //  3164: invokestatic    org/lwjgl/opengl/GL11.glColor4f:(FFFF)V
        //  3167: goto            3171
        //  3170: athrow         
        //  3171: getstatic       dev/nuker/pyro/fc.0:I
        //  3174: ifeq            3183
        //  3177: ldc_w           -729128655
        //  3180: goto            3186
        //  3183: ldc_w           1892707369
        //  3186: ldc_w           1282779647
        //  3189: ixor           
        //  3190: lookupswitch {
        //          -1728067378: 3183
        //          1017497046: 3216
        //          default: 4286
        //        }
        //  3216: goto            3220
        //  3219: athrow         
        //  3220: invokestatic    dev/nuker/pyro/fbs.1:()V
        //  3223: goto            3227
        //  3226: athrow         
        //  3227: goto            3231
        //  3230: athrow         
        //  3231: invokestatic    org/lwjgl/opengl/GL11.glLoadIdentity:()V
        //  3234: goto            3238
        //  3237: athrow         
        //  3238: aload_0        
        //  3239: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/f0d;
        //  3242: getstatic       dev/nuker/pyro/fc.0:I
        //  3245: ifeq            3254
        //  3248: ldc_w           -555584111
        //  3251: goto            3257
        //  3254: ldc_w           1301967723
        //  3257: ldc_w           -676956640
        //  3260: ixor           
        //  3261: lookupswitch {
        //          155452337: 4266
        //          1985961414: 3254
        //          default: 3288
        //        }
        //  3288: goto            3292
        //  3291: athrow         
        //  3292: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3295: goto            3299
        //  3298: athrow         
        //  3299: checkcast       Ljava/lang/Number;
        //  3302: goto            3306
        //  3305: athrow         
        //  3306: invokevirtual   java/lang/Number.doubleValue:()D
        //  3309: goto            3313
        //  3312: athrow         
        //  3313: d2f            
        //  3314: goto            3318
        //  3317: athrow         
        //  3318: invokestatic    org/lwjgl/opengl/GL11.glLineWidth:(F)V
        //  3321: goto            3325
        //  3324: athrow         
        //  3325: aload_0        
        //  3326: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  3329: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //  3332: dup            
        //  3333: ifnonnull       3342
        //  3336: ldc_w           756857217
        //  3339: goto            3345
        //  3342: ldc_w           756857218
        //  3345: ldc_w           -615506704
        //  3348: ixor           
        //  3349: tableswitch {
        //          -325498142: 3372
        //          -325498141: 3402
        //          default: 3336
        //        }
        //  3372: new             Lkotlin/TypeCastException;
        //  3375: dup            
        //  3376: ldc_w           "\u293e\u1486\u8025\ub1c4\uc4ce\ue735\ub225\uec0a\udb77\ue4f2\uade2\u1e0c\ueb22\uc7b3\u8c3a\u83ae\u57a5\u7dd2\ubf38\ucd01\u21d6\uc234\u6089\u2f49\uda90\u3f5b\u7d66\u8364\u8215\u81d6\u8e7c\ufb72\u7a02\u981e\u16d8\ufbb2\u493c\u82a1\uc892\uf27c\ubc46\u41fd\ub325\ub152\u413d\u8037\u7c27\uc4f1\u7f46\ue79d\uec07\u1696\ue49f\u3596\u4bff\ueb25\u0a19\u8c5b\u1be1\u0201\u7dd9\u7284\ucd3a\ub9b2\u97a2\u60c0\ue2e8\udaf4\ua739\u2892\u8363\u4fb3\u8194\u161a\uae9a\u7a1f\u55b5\u16b4\u63d1\u1cc5"
        //  3379: goto            3383
        //  3382: athrow         
        //  3383: invokestatic    invokestatic   !!! ERROR
        //  3386: goto            3390
        //  3389: athrow         
        //  3390: goto            3394
        //  3393: athrow         
        //  3394: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  3397: goto            3401
        //  3400: athrow         
        //  3401: athrow         
        //  3402: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //  3405: getstatic       dev/nuker/pyro/fc.1:I
        //  3408: ifeq            3417
        //  3411: ldc_w           -1415090375
        //  3414: goto            3420
        //  3417: ldc_w           -1095750000
        //  3420: ldc_w           -480646777
        //  3423: ixor           
        //  3424: lookupswitch {
        //          1224640190: 4214
        //          1931243727: 3417
        //          default: 3452
        //        }
        //  3452: fload_2        
        //  3453: iconst_0       
        //  3454: getstatic       dev/nuker/pyro/fc.c:I
        //  3457: ifge            3466
        //  3460: ldc_w           1142612643
        //  3463: goto            3469
        //  3466: ldc_w           -2050031029
        //  3469: ldc_w           -15283384
        //  3472: ixor           
        //  3473: lookupswitch {
        //          -1156830741: 4290
        //          -282446381: 3466
        //          default: 3500
        //        }
        //  3500: goto            3504
        //  3503: athrow         
        //  3504: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.invokeSetupCameraTransform:(FI)V
        //  3509: goto            3513
        //  3512: athrow         
        //  3513: new             Lnet/minecraft/util/math/Vec3d;
        //  3516: dup            
        //  3517: dconst_0       
        //  3518: dconst_0       
        //  3519: dconst_1       
        //  3520: getstatic       dev/nuker/pyro/fc.c:I
        //  3523: ifge            3532
        //  3526: ldc_w           -979306181
        //  3529: goto            3535
        //  3532: ldc_w           -584427382
        //  3535: ldc_w           -107393493
        //  3538: ixor           
        //  3539: lookupswitch {
        //          -1219249273: 3532
        //          1010415376: 4310
        //          default: 3564
        //        }
        //  3564: goto            3568
        //  3567: athrow         
        //  3568: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  3571: goto            3575
        //  3574: athrow         
        //  3575: aload           15
        //  3577: getfield        net/minecraft/entity/Entity.field_70125_A:F
        //  3580: f2d            
        //  3581: getstatic       dev/nuker/pyro/fc.0:I
        //  3584: ifeq            3593
        //  3587: ldc_w           -1759069832
        //  3590: goto            3596
        //  3593: ldc_w           1646379519
        //  3596: ldc_w           276805045
        //  3599: ixor           
        //  3600: lookupswitch {
        //          -2024207155: 3593
        //          1918792778: 3628
        //          default: 4272
        //        }
        //  3628: goto            3632
        //  3631: athrow         
        //  3632: invokestatic    java/lang/Math.toRadians:(D)D
        //  3635: goto            3639
        //  3638: athrow         
        //  3639: dneg           
        //  3640: d2f            
        //  3641: goto            3645
        //  3644: athrow         
        //  3645: invokevirtual   net/minecraft/util/math/Vec3d.func_178789_a:(F)Lnet/minecraft/util/math/Vec3d;
        //  3648: goto            3652
        //  3651: athrow         
        //  3652: aload           15
        //  3654: getstatic       dev/nuker/pyro/fc.0:I
        //  3657: ifeq            3666
        //  3660: ldc_w           677897865
        //  3663: goto            3669
        //  3666: ldc_w           -1241141973
        //  3669: ldc_w           262976492
        //  3672: ixor           
        //  3673: lookupswitch {
        //          -505264424: 3666
        //          667637093: 4242
        //          default: 3700
        //        }
        //  3700: getfield        net/minecraft/entity/Entity.field_70177_z:F
        //  3703: f2d            
        //  3704: goto            3708
        //  3707: athrow         
        //  3708: invokestatic    java/lang/Math.toRadians:(D)D
        //  3711: goto            3715
        //  3714: athrow         
        //  3715: dneg           
        //  3716: d2f            
        //  3717: goto            3721
        //  3720: athrow         
        //  3721: invokevirtual   net/minecraft/util/math/Vec3d.func_178785_b:(F)Lnet/minecraft/util/math/Vec3d;
        //  3724: goto            3728
        //  3727: athrow         
        //  3728: getstatic       dev/nuker/pyro/fc.c:I
        //  3731: ifge            3740
        //  3734: ldc_w           -2116013384
        //  3737: goto            3743
        //  3740: ldc_w           457218897
        //  3743: ldc_w           -959871302
        //  3746: ixor           
        //  3747: lookupswitch {
        //          -578216469: 3772
        //          1193915394: 3740
        //          default: 4302
        //        }
        //  3772: astore          23
        //  3774: iconst_1       
        //  3775: getstatic       dev/nuker/pyro/fc.c:I
        //  3778: ifge            3787
        //  3781: ldc_w           161341515
        //  3784: goto            3790
        //  3787: ldc_w           -1419966018
        //  3790: ldc_w           996115461
        //  3793: ixor           
        //  3794: lookupswitch {
        //          -1878880837: 3820
        //          851600462: 3787
        //          default: 4210
        //        }
        //  3820: goto            3824
        //  3823: athrow         
        //  3824: invokestatic    org/lwjgl/opengl/GL11.glBegin:(I)V
        //  3827: goto            3831
        //  3830: athrow         
        //  3831: getstatic       dev/nuker/pyro/fc.0:I
        //  3834: ifeq            3843
        //  3837: ldc_w           865311978
        //  3840: goto            3846
        //  3843: ldc_w           1543710702
        //  3846: ldc_w           1314878662
        //  3849: ixor           
        //  3850: lookupswitch {
        //          -1234727356: 3843
        //          2110580780: 4278
        //          default: 3876
        //        }
        //  3876: dload           17
        //  3878: dstore          24
        //  3880: aload           23
        //  3882: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  3885: aload_0        
        //  3886: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  3889: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3892: goto            3896
        //  3895: athrow         
        //  3896: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //  3899: goto            3903
        //  3902: athrow         
        //  3903: f2d            
        //  3904: getstatic       dev/nuker/pyro/fc.1:I
        //  3907: ifeq            3916
        //  3910: ldc_w           1449928151
        //  3913: goto            3919
        //  3916: ldc_w           -2068916776
        //  3919: ldc_w           -968582045
        //  3922: ixor           
        //  3923: lookupswitch {
        //          -1876379212: 4216
        //          -1784086311: 3916
        //          default: 3948
        //        }
        //  3948: aload           23
        //  3950: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  3953: dadd           
        //  3954: aload           23
        //  3956: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  3959: goto            3963
        //  3962: athrow         
        //  3963: invokestatic    org/lwjgl/opengl/GL11.glVertex3d:(DDD)V
        //  3966: goto            3970
        //  3969: athrow         
        //  3970: dload           17
        //  3972: ldc2_w          0.5
        //  3975: dadd           
        //  3976: dload           19
        //  3978: ldc2_w          0.5
        //  3981: dadd           
        //  3982: getstatic       dev/nuker/pyro/fc.c:I
        //  3985: ifge            3994
        //  3988: ldc_w           -1337171053
        //  3991: goto            3997
        //  3994: ldc_w           193984581
        //  3997: ldc_w           -960505082
        //  4000: ixor           
        //  4001: lookupswitch {
        //          -729790822: 3994
        //          1995683989: 4270
        //          default: 4028
        //        }
        //  4028: dload           21
        //  4030: ldc2_w          0.5
        //  4033: dadd           
        //  4034: goto            4038
        //  4037: athrow         
        //  4038: invokestatic    org/lwjgl/opengl/GL11.glVertex3d:(DDD)V
        //  4041: goto            4045
        //  4044: athrow         
        //  4045: fconst_1       
        //  4046: fconst_1       
        //  4047: fconst_1       
        //  4048: fconst_1       
        //  4049: getstatic       dev/nuker/pyro/fc.1:I
        //  4052: ifeq            4061
        //  4055: ldc_w           1425071477
        //  4058: goto            4064
        //  4061: ldc_w           1964023709
        //  4064: ldc_w           -1318400686
        //  4067: ixor           
        //  4068: lookupswitch {
        //          -998616369: 4096
        //          -442888153: 4061
        //          default: 4238
        //        }
        //  4096: goto            4100
        //  4099: athrow         
        //  4100: invokestatic    org/lwjgl/opengl/GL11.glColor4f:(FFFF)V
        //  4103: goto            4107
        //  4106: athrow         
        //  4107: goto            4111
        //  4110: athrow         
        //  4111: invokestatic    org/lwjgl/opengl/GL11.glEnd:()V
        //  4114: goto            4118
        //  4117: athrow         
        //  4118: goto            4122
        //  4121: athrow         
        //  4122: invokestatic    dev/nuker/pyro/fbs.3:()V
        //  4125: goto            4129
        //  4128: athrow         
        //  4129: aload_0        
        //  4130: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //  4133: getstatic       dev/nuker/pyro/fc.c:I
        //  4136: ifge            4145
        //  4139: ldc_w           -635311797
        //  4142: goto            4148
        //  4145: ldc_w           1769447985
        //  4148: ldc_w           -1318689796
        //  4151: ixor           
        //  4152: lookupswitch {
        //          1086777221: 4145
        //          1799850679: 4282
        //          default: 4180
        //        }
        //  4180: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //  4183: iload           16
        //  4185: putfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //  4188: nop            
        //  4189: nop            
        //  4190: goto            502
        //  4193: nop            
        //  4194: fconst_1       
        //  4195: fconst_1       
        //  4196: fconst_1       
        //  4197: fconst_1       
        //  4198: goto            4202
        //  4201: athrow         
        //  4202: invokestatic    org/lwjgl/opengl/GL11.glColor4f:(FFFF)V
        //  4205: goto            4209
        //  4208: athrow         
        //  4209: return         
        //  4210: aconst_null    
        //  4211: athrow         
        //  4212: aconst_null    
        //  4213: athrow         
        //  4214: aconst_null    
        //  4215: athrow         
        //  4216: aconst_null    
        //  4217: athrow         
        //  4218: aconst_null    
        //  4219: athrow         
        //  4220: aconst_null    
        //  4221: athrow         
        //  4222: aconst_null    
        //  4223: athrow         
        //  4224: aconst_null    
        //  4225: athrow         
        //  4226: aconst_null    
        //  4227: athrow         
        //  4228: aconst_null    
        //  4229: athrow         
        //  4230: aconst_null    
        //  4231: athrow         
        //  4232: aconst_null    
        //  4233: athrow         
        //  4234: aconst_null    
        //  4235: athrow         
        //  4236: aconst_null    
        //  4237: athrow         
        //  4238: aconst_null    
        //  4239: athrow         
        //  4240: aconst_null    
        //  4241: athrow         
        //  4242: aconst_null    
        //  4243: athrow         
        //  4244: aconst_null    
        //  4245: athrow         
        //  4246: aconst_null    
        //  4247: athrow         
        //  4248: aconst_null    
        //  4249: athrow         
        //  4250: aconst_null    
        //  4251: athrow         
        //  4252: aconst_null    
        //  4253: athrow         
        //  4254: aconst_null    
        //  4255: athrow         
        //  4256: aconst_null    
        //  4257: athrow         
        //  4258: aconst_null    
        //  4259: athrow         
        //  4260: aconst_null    
        //  4261: athrow         
        //  4262: aconst_null    
        //  4263: athrow         
        //  4264: aconst_null    
        //  4265: athrow         
        //  4266: aconst_null    
        //  4267: athrow         
        //  4268: aconst_null    
        //  4269: athrow         
        //  4270: aconst_null    
        //  4271: athrow         
        //  4272: aconst_null    
        //  4273: athrow         
        //  4274: aconst_null    
        //  4275: athrow         
        //  4276: aconst_null    
        //  4277: athrow         
        //  4278: aconst_null    
        //  4279: athrow         
        //  4280: aconst_null    
        //  4281: athrow         
        //  4282: aconst_null    
        //  4283: athrow         
        //  4284: aconst_null    
        //  4285: athrow         
        //  4286: aconst_null    
        //  4287: athrow         
        //  4288: aconst_null    
        //  4289: athrow         
        //  4290: aconst_null    
        //  4291: athrow         
        //  4292: aconst_null    
        //  4293: athrow         
        //  4294: aconst_null    
        //  4295: athrow         
        //  4296: aconst_null    
        //  4297: athrow         
        //  4298: aconst_null    
        //  4299: athrow         
        //  4300: aconst_null    
        //  4301: athrow         
        //  4302: aconst_null    
        //  4303: athrow         
        //  4304: aconst_null    
        //  4305: athrow         
        //  4306: aconst_null    
        //  4307: athrow         
        //  4308: aconst_null    
        //  4309: athrow         
        //  4310: aconst_null    
        //  4311: athrow         
        //  4312: aconst_null    
        //  4313: athrow         
        //  4314: aconst_null    
        //  4315: athrow         
        //  4316: aconst_null    
        //  4317: athrow         
        //  4318: aconst_null    
        //  4319: athrow         
        //  4320: aconst_null    
        //  4321: athrow         
        //  4322: aconst_null    
        //  4323: athrow         
        //  4324: pop            
        //  4325: goto            24
        //  4328: pop            
        //  4329: aconst_null    
        //  4330: goto            4324
        //  4333: dup            
        //  4334: ifnull          4324
        //  4337: checkcast       Ljava/lang/Throwable;
        //  4340: athrow         
        //  4341: dup            
        //  4342: ifnull          4328
        //  4345: checkcast       Ljava/lang/Throwable;
        //  4348: athrow         
        //  4349: aconst_null    
        //  4350: athrow         
        //    StackMapTable: 02 47 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FE 00 03 07 00 03 07 00 B1 02 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 B1 02 00 02 07 00 03 01 5D 07 00 03 51 07 00 37 40 07 00 3F 45 07 00 37 40 07 00 4E 51 07 00 3F FF 00 01 00 03 07 00 03 07 00 B1 02 00 02 07 00 3F 01 5D 07 00 3F 0A 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 B1 02 00 02 07 00 03 01 5E 07 00 03 47 07 00 37 40 07 00 3F 45 07 00 37 40 07 00 4E 4E 07 00 4E FF 00 01 00 03 07 00 03 07 00 B1 02 00 02 07 00 4E 01 5E 07 00 4E 42 07 00 1A 40 07 00 4E 45 07 00 37 40 07 00 4E 41 07 00 4E FF 00 23 00 04 07 00 03 07 00 B1 02 07 00 4E 00 03 07 00 7F 03 03 FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 04 07 00 7F 03 03 01 FF 00 1C 00 04 07 00 03 07 00 B1 02 07 00 4E 00 03 07 00 7F 03 03 FF 00 1B 00 04 07 00 03 07 00 B1 02 07 00 4E 00 04 07 00 7F 03 03 03 FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 05 07 00 7F 03 03 03 01 FF 00 1D 00 04 07 00 03 07 00 B1 02 07 00 4E 00 04 07 00 7F 03 03 03 FF 00 13 00 04 07 00 03 07 00 B1 02 07 00 4E 00 05 07 00 7F 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 06 07 00 7F 03 03 03 03 01 FF 00 1D 00 04 07 00 03 07 00 B1 02 07 00 4E 00 05 07 00 7F 03 03 03 03 46 07 00 14 FF 00 00 00 04 07 00 03 07 00 B1 02 07 00 4E 00 04 07 00 7F 03 03 03 47 07 00 37 00 FF 00 10 00 06 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 00 01 07 00 37 40 07 00 87 47 07 00 37 40 07 00 8D FC 00 01 07 00 8D 44 07 00 37 40 07 00 8D 47 07 00 37 40 01 0D 41 01 1E 4C 07 00 8D FF 00 01 00 07 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 00 02 07 00 8D 01 5C 07 00 8D 42 07 00 37 40 07 00 8D 47 07 00 37 40 07 02 11 FE 00 16 07 02 11 07 00 9D 01 41 01 1D 4B 07 00 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 03 01 5D 07 00 03 4D 07 00 3F FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 3F 01 5B 07 00 3F FF 00 0F 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 9D FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 07 00 C2 07 00 9D 01 FF 00 1D 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 9D 42 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 B1 FF 00 0A 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 B1 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 07 00 C2 07 00 B1 01 FF 00 1B 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 B1 FF 00 0D 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 07 00 C2 03 01 FF 00 1B 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 03 44 07 00 14 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 07 00 C2 03 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 07 00 C2 03 07 00 B1 47 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 07 00 B1 FF 00 0D 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 05 07 00 C2 03 03 03 01 FF 00 1E 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 03 42 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 03 45 07 00 37 40 03 FF 00 15 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 08 03 EA 08 03 EA FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 01 FF 00 1C 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 08 03 EA 08 03 EA 44 07 00 1E FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 07 00 B1 FF 00 0D 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 08 03 EA 08 03 EA 03 01 FF 00 1E 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 03 44 07 00 22 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 08 03 EA 08 03 EA 03 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 08 03 EA 08 03 EA 03 07 00 B1 FF 00 07 00 00 00 01 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 05 08 03 EA 08 03 EA 03 03 07 00 9D 45 07 00 37 FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 05 08 03 EA 08 03 EA 03 03 07 00 B1 45 07 00 1E FF 00 00 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 05 08 03 EA 08 03 EA 03 03 03 45 07 00 37 40 07 00 CA FF 00 06 00 0B 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 00 01 07 00 37 40 07 00 CA 45 07 00 37 40 07 00 DD FF 00 11 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 00 DD FF 00 01 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 03 07 00 03 07 00 DD 01 FF 00 1D 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 00 DD FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 00 DD 47 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 02 13 44 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 02 13 45 07 00 37 40 01 02 04 41 01 17 50 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 03 07 00 DD 07 00 ED 07 00 CA 47 07 00 37 40 07 01 03 44 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 01 03 07 00 CA 45 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 01 03 01 FF 00 0B 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 01 03 03 FF 00 01 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 03 07 01 03 03 01 FF 00 1D 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 01 03 03 44 07 00 1A FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 03 07 01 03 03 07 00 CA 45 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 03 07 01 03 03 01 45 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 07 00 CA 45 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 01 FF 00 0B 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 03 FF 00 02 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 05 07 01 03 03 03 03 01 FF 00 1D 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 03 42 07 00 37 FF 00 00 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 03 45 07 00 37 40 07 01 03 FF 00 0A 00 00 00 01 07 00 37 FF 00 00 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 01 07 00 3F 45 07 00 37 40 07 02 15 4D 07 00 37 FF 00 00 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 04 07 02 15 08 05 BA 08 05 BA 07 02 17 45 07 00 37 FF 00 00 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 04 07 02 15 08 05 BA 08 05 BA 07 02 17 42 07 00 1E FF 00 00 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 04 07 02 15 08 05 BA 08 05 BA 07 02 17 45 07 00 37 FF 00 00 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 02 07 02 15 07 01 0D 40 07 02 15 4E 07 01 19 FF 00 02 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 02 07 01 19 01 5D 07 01 19 FF 00 10 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 02 07 00 03 07 00 DD FF 00 02 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 01 FF 00 1F 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 02 07 00 03 07 00 DD FF 00 0D 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 00 DD FF 00 02 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 04 07 00 03 07 00 DD 07 00 DD 01 FF 00 1E 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 00 DD 42 07 00 37 FF 00 00 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 00 DD 47 07 00 37 FF 00 00 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 02 13 44 07 00 37 FF 00 00 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 02 13 45 07 00 37 40 07 02 19 FF 00 08 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 00 37 40 07 01 29 45 07 00 37 40 07 02 11 4E 07 01 2E FF 00 02 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 01 2E 01 5E 07 01 2E 42 07 00 37 40 07 01 2E 45 07 00 37 40 01 49 07 00 37 40 07 01 29 45 07 00 37 40 07 02 11 45 07 00 28 40 07 01 2E 45 07 00 37 40 01 02 FF 00 10 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 7F 07 01 03 FF 00 02 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 03 07 00 7F 07 01 03 01 FF 00 1D 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 7F 07 01 03 42 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 7F 07 01 03 47 07 00 37 40 01 50 07 01 03 FF 00 02 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 01 03 01 5E 07 01 03 44 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 01 03 07 01 19 47 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 01 03 03 45 07 00 12 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 03 07 01 03 03 07 01 19 47 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 03 07 01 03 03 03 45 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 04 07 01 03 03 03 07 01 19 47 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 04 07 01 03 03 03 03 FF 00 03 00 00 00 01 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 04 07 01 03 03 03 03 45 07 00 37 40 07 01 03 FF 00 08 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 01 07 00 37 40 07 01 29 45 07 00 37 40 07 02 11 45 07 00 37 40 07 01 2E 45 07 00 37 40 01 45 07 00 37 00 45 07 00 37 00 FF 00 10 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 02 07 01 03 02 FF 00 02 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 03 07 01 03 02 01 FF 00 1F 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 02 07 01 03 02 44 07 00 37 FF 00 00 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 03 07 01 03 02 07 02 19 45 07 00 37 00 42 07 00 37 00 45 07 00 37 00 0B 42 01 1C 46 07 00 24 40 07 01 29 45 07 00 37 40 07 02 11 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 01 07 01 2E 45 07 00 37 40 01 02 05 42 01 1A 42 07 00 37 00 45 07 00 37 00 46 07 00 37 FF 00 00 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 02 07 01 03 07 02 19 45 07 00 37 00 42 07 00 37 00 45 07 00 37 FA 00 00 0B 42 01 1F FF 00 08 00 00 00 01 07 00 37 FF 00 00 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 00 3F 45 07 00 37 40 07 00 4E 02 05 42 01 1A 48 07 00 37 40 07 00 3F 45 07 00 37 40 07 00 4E 02 4C 07 00 03 FF 00 02 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 03 01 5F 07 00 03 48 07 00 4E 4B 07 00 4E FF 00 02 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 4E 01 5F 07 00 4E FC 00 0D 07 00 4E 42 01 1E 4C 07 00 03 FF 00 02 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 00 02 07 00 03 01 5F 07 00 03 45 07 00 37 40 07 01 29 45 07 00 37 40 07 02 11 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 00 01 07 01 2E 45 07 00 37 40 01 07 05 42 01 1A 0B 42 01 1C FF 00 18 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 01 07 00 03 FF 00 02 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 02 07 00 03 01 5F 07 00 03 4E 07 00 3F FF 00 02 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 02 07 00 3F 01 5D 07 00 3F 12 42 01 1D 44 07 00 1E 40 07 00 9D 45 07 00 37 40 07 00 B1 47 07 00 1E FF 00 00 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 02 03 07 01 19 47 07 00 37 FF 00 00 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 02 03 03 FC 00 0E 03 42 01 1E 44 07 00 37 40 07 00 9D 45 07 00 37 40 07 00 B1 FF 00 10 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 07 01 19 FF 00 02 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 03 03 07 01 19 01 FF 00 1E 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 07 01 19 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 07 01 19 47 07 00 37 FF 00 00 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 03 4C 03 FF 00 02 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 01 5E 03 FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 13 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 00 01 07 00 9D 45 07 00 37 40 07 00 B1 FF 00 07 00 00 00 01 07 00 37 FF 00 00 00 13 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 00 02 03 07 01 19 47 07 00 37 FF 00 00 00 13 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 00 02 03 03 4C 03 FF 00 02 00 13 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 00 02 03 01 5E 03 FF 00 11 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 02 02 02 02 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 05 02 02 02 02 01 FF 00 1E 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 02 02 02 02 42 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 02 02 02 02 45 07 00 37 00 0B 42 01 1D 42 07 00 26 00 45 07 00 37 00 42 07 00 18 00 45 07 00 37 00 4F 07 01 AD FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 01 AD 01 5E 07 01 AD FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 01 07 01 AD 45 07 00 37 40 07 02 11 45 07 00 37 40 07 01 B0 45 07 00 37 40 03 43 07 00 37 40 02 45 07 00 37 00 4A 07 02 1B 45 07 02 1B FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 02 1B 01 5A 07 02 1B 49 07 00 2E FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 07 02 1B 08 0D 2C 08 0D 2C 07 02 17 45 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 07 02 1B 08 0D 2C 08 0D 2C 07 02 17 42 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 07 02 1B 08 0D 2C 08 0D 2C 07 02 17 45 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 02 1B 07 01 0D 40 07 02 1B 4E 07 01 C2 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 01 C2 01 5F 07 01 C2 FF 00 0D 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 01 C2 02 01 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 07 01 C2 02 01 01 FF 00 1E 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 01 C2 02 01 42 07 00 1E FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 01 C2 02 01 47 07 00 37 00 FF 00 12 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 05 08 0D B9 08 0D B9 03 03 03 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 06 08 0D B9 08 0D B9 03 03 03 01 FF 00 1C 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 05 08 0D B9 08 0D B9 03 03 03 42 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 05 08 0D B9 08 0D B9 03 03 03 45 07 00 37 40 07 00 B1 FF 00 11 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 00 B1 03 01 FF 00 1F 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 45 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 44 07 00 2C FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 02 45 07 00 37 40 07 00 B1 FF 00 0D 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 07 00 4E FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 00 B1 07 00 4E 01 FF 00 1E 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 07 00 4E 46 07 00 18 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 45 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 FF 00 04 00 00 00 01 07 00 37 FF 00 00 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 02 45 07 00 37 40 07 00 B1 4B 07 00 B1 FF 00 02 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 01 5C 07 00 B1 FF 00 0E 00 15 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 00 01 01 FF 00 02 00 15 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 00 02 01 01 5D 01 42 07 00 37 40 01 45 07 00 37 00 0B 42 01 1D FF 00 12 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 01 07 00 37 FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 07 00 C2 45 07 00 37 FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 02 FF 00 0C 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 FF 00 02 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 03 03 03 01 FF 00 1C 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 4D 07 00 37 FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 03 03 03 03 45 07 00 37 00 FF 00 17 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 FF 00 02 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 03 03 03 01 FF 00 1E 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 48 07 00 1E FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 03 03 03 03 45 07 00 37 00 FF 00 0F 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 04 02 02 02 02 FF 00 02 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 05 02 02 02 02 01 FF 00 1F 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 04 02 02 02 02 42 07 00 18 FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 04 02 02 02 02 45 07 00 37 00 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 00 45 07 00 37 00 42 07 00 37 00 45 07 00 37 00 4F 07 00 3F FF 00 02 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 07 00 3F 01 5F 07 00 3F FF 00 07 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 00 F8 00 04 47 07 00 37 FF 00 00 00 07 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 00 04 02 02 02 02 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 B1 02 00 00 FF 00 00 00 15 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 00 01 01 FF 00 01 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 01 07 00 3F FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 01 07 01 C2 FF 00 01 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 FF 00 01 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 02 03 07 01 19 FF 00 01 00 07 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 00 01 07 00 8D FF 00 01 00 0D 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 00 01 07 01 19 FE 00 01 07 01 19 07 02 19 07 00 4E FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 04 02 02 02 02 FF 00 01 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 03 07 00 03 07 00 DD 07 00 DD FF 00 01 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 00 4E FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 08 03 EA 08 03 EA FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 03 08 03 EA 08 03 EA 03 FF 00 01 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 01 03 03 FF 00 01 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 04 02 02 02 02 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 00 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 07 00 4E FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 03 07 00 7F 03 03 FF 00 01 00 03 07 00 03 07 00 B1 02 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 01 07 00 3F FF 00 01 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 02 07 00 03 07 00 DD FF 00 01 00 03 07 00 03 07 00 B1 02 00 01 07 00 03 FF 00 01 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 01 03 FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 05 07 00 7F 03 03 03 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 01 07 00 03 FF 00 01 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 00 00 FF 00 01 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 01 03 FF 00 01 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 02 07 00 7F 07 01 03 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 01 07 01 AD FF 00 01 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 01 07 00 03 FF 00 01 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 02 03 03 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 02 07 00 B1 03 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 03 FF 00 01 00 11 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 00 00 FF 00 01 00 15 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 00 00 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 B1 FF 00 01 00 16 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 07 00 B1 03 00 01 07 00 3F FF 00 01 00 0C 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 00 04 07 01 03 03 03 03 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 00 FF 00 01 00 03 07 00 03 07 00 B1 02 00 01 07 00 3F FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 03 07 01 C2 02 01 FF 00 01 00 0E 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 00 02 07 00 03 07 00 DD FC 00 01 07 02 19 FF 00 01 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 02 07 01 03 02 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 04 07 00 C2 03 03 03 FF 00 01 00 04 07 00 03 07 00 B1 02 07 00 4E 00 04 07 00 7F 03 03 03 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 01 07 00 B1 FF 00 01 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 01 03 00 00 FF 00 01 00 10 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 00 01 07 00 03 FF 00 01 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 00 03 FF 00 01 00 14 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 03 00 05 08 0D B9 08 0D B9 03 03 03 FF 00 01 00 03 07 00 03 07 00 B1 02 00 01 07 00 4E FF 00 01 00 12 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 00 00 FF 00 01 00 07 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 00 00 FF 00 01 00 0A 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 00 02 07 00 C2 07 00 9D FF 00 01 00 13 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 07 00 4E 01 03 03 00 01 03 FF 00 01 00 0F 07 00 03 07 00 B1 02 07 00 4E 07 00 87 01 07 00 8D 07 02 11 07 00 9D 01 07 00 CA 07 00 DD 07 01 03 07 01 19 07 02 19 00 01 07 01 2E FF 00 01 00 03 07 00 03 07 00 B1 02 00 01 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4333   4341   Any
        //  4333   4341   4333   4341   Any
        //  4349   4351   3      8      Any
        //  86     93     93     94     Any
        //  86     93     86     87     Any
        //  86     93     3      8      Any
        //  86     93     86     87     Any
        //  87     93     3      8      Ljava/util/NoSuchElementException;
        //  208    215    215    216    Any
        //  208    215    208    209    Ljava/lang/IndexOutOfBoundsException;
        //  208    215    3      8      Any
        //  208    215    215    216    Any
        //  209    215    208    209    Any
        //  267    274    274    275    Any
        //  267    274    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  267    274    3      8      Ljava/lang/IllegalArgumentException;
        //  267    274    274    275    Ljava/lang/IllegalArgumentException;
        //  267    274    267    268    Ljava/lang/UnsupportedOperationException;
        //  463    472    472    473    Any
        //  463    472    472    473    Any
        //  464    472    463    464    Ljava/lang/IndexOutOfBoundsException;
        //  464    472    463    464    Ljava/lang/StringIndexOutOfBoundsException;
        //  463    472    472    473    Ljava/lang/RuntimeException;
        //  490    499    499    500    Any
        //  490    499    3      8      Ljava/lang/IllegalArgumentException;
        //  490    499    490    491    Any
        //  491    499    499    500    Ljava/lang/ArithmeticException;
        //  491    499    490    491    Any
        //  507    516    516    517    Any
        //  508    516    507    508    Any
        //  508    516    507    508    Ljava/lang/StringIndexOutOfBoundsException;
        //  508    516    516    517    Ljava/lang/NegativeArraySizeException;
        //  508    516    516    517    Any
        //  611    620    620    621    Any
        //  611    620    3      8      Any
        //  612    620    620    621    Any
        //  611    620    611    612    Any
        //  611    620    620    621    Ljava/lang/StringIndexOutOfBoundsException;
        //  815    822    822    823    Any
        //  816    822    815    816    Any
        //  816    822    3      8      Ljava/lang/NumberFormatException;
        //  815    822    822    823    Ljava/util/ConcurrentModificationException;
        //  816    822    822    823    Any
        //  913    920    920    921    Any
        //  914    920    3      8      Ljava/lang/ClassCastException;
        //  913    920    913    914    Ljava/lang/IndexOutOfBoundsException;
        //  914    920    920    921    Ljava/lang/ArithmeticException;
        //  914    920    913    914    Ljava/lang/IndexOutOfBoundsException;
        //  929    936    936    937    Any
        //  929    936    929    930    Ljava/util/ConcurrentModificationException;
        //  929    936    929    930    Any
        //  930    936    929    930    Any
        //  929    936    936    937    Any
        //  987    994    994    995    Any
        //  987    994    987    988    Any
        //  987    994    3      8      Ljava/lang/NegativeArraySizeException;
        //  988    994    987    988    Ljava/lang/NegativeArraySizeException;
        //  988    994    987    988    Ljava/util/NoSuchElementException;
        //  1053   1060   1060   1061   Any
        //  1053   1060   3      8      Ljava/lang/NumberFormatException;
        //  1054   1060   1053   1054   Ljava/lang/NegativeArraySizeException;
        //  1054   1060   1060   1061   Any
        //  1054   1060   1053   1054   Ljava/lang/NullPointerException;
        //  1113   1120   1120   1121   Any
        //  1113   1120   1113   1114   Ljava/lang/NegativeArraySizeException;
        //  1113   1120   3      8      Ljava/util/ConcurrentModificationException;
        //  1114   1120   3      8      Ljava/lang/IllegalStateException;
        //  1113   1120   1120   1121   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Ljava/lang/EnumConstantNotPresentException;
        //  1130   1136   3      8      Ljava/lang/RuntimeException;
        //  1143   1150   1150   1151   Any
        //  1143   1150   1150   1151   Any
        //  1144   1150   1143   1144   Ljava/lang/RuntimeException;
        //  1143   1150   3      8      Ljava/lang/NumberFormatException;
        //  1143   1150   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1158   1165   1165   1166   Any
        //  1158   1165   1165   1166   Ljava/lang/UnsupportedOperationException;
        //  1159   1165   1165   1166   Ljava/lang/UnsupportedOperationException;
        //  1159   1165   1158   1159   Ljava/lang/ArithmeticException;
        //  1158   1165   1158   1159   Any
        //  1220   1228   1228   1229   Any
        //  1220   1228   3      8      Any
        //  1220   1228   1228   1229   Ljava/lang/RuntimeException;
        //  1220   1228   1228   1229   Ljava/lang/EnumConstantNotPresentException;
        //  1220   1228   1228   1229   Any
        //  1234   1241   1241   1242   Any
        //  1235   1241   1241   1242   Any
        //  1234   1241   1234   1235   Ljava/lang/UnsupportedOperationException;
        //  1234   1241   3      8      Ljava/lang/IllegalArgumentException;
        //  1234   1241   1234   1235   Any
        //  1293   1302   1302   1303   Any
        //  1294   1302   1293   1294   Any
        //  1294   1302   1293   1294   Any
        //  1293   1302   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1294   1302   1302   1303   Ljava/lang/EnumConstantNotPresentException;
        //  1308   1315   1315   1316   Any
        //  1309   1315   1315   1316   Ljava/lang/ClassCastException;
        //  1309   1315   1315   1316   Ljava/lang/IllegalArgumentException;
        //  1309   1315   1308   1309   Any
        //  1308   1315   1308   1309   Ljava/lang/NullPointerException;
        //  1365   1372   1372   1373   Any
        //  1366   1372   1365   1366   Ljava/lang/UnsupportedOperationException;
        //  1365   1372   1372   1373   Ljava/util/ConcurrentModificationException;
        //  1365   1372   3      8      Any
        //  1365   1372   3      8      Any
        //  1379   1386   1386   1387   Any
        //  1379   1386   3      8      Ljava/lang/AssertionError;
        //  1379   1386   1379   1380   Any
        //  1379   1386   1379   1380   Ljava/lang/NumberFormatException;
        //  1379   1386   1379   1380   Ljava/lang/UnsupportedOperationException;
        //  1435   1442   1442   1443   Any
        //  1435   1442   1442   1443   Any
        //  1435   1442   1442   1443   Ljava/lang/ClassCastException;
        //  1435   1442   1435   1436   Any
        //  1435   1442   1442   1443   Any
        //  1455   1461   1461   1462   Any
        //  1455   1461   1461   1462   Ljava/lang/RuntimeException;
        //  1455   1461   3      8      Ljava/lang/ArithmeticException;
        //  1455   1461   1461   1462   Ljava/util/ConcurrentModificationException;
        //  1455   1461   1461   1462   Ljava/lang/AssertionError;
        //  1476   1483   1483   1484   Any
        //  1476   1483   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1477   1483   1476   1477   Any
        //  1476   1483   3      8      Any
        //  1476   1483   1476   1477   Ljava/lang/UnsupportedOperationException;
        //  1487   1494   1494   1495   Any
        //  1487   1494   1487   1488   Ljava/lang/RuntimeException;
        //  1487   1494   1487   1488   Ljava/lang/IllegalStateException;
        //  1487   1494   1494   1495   Any
        //  1488   1494   3      8      Any
        //  1647   1656   1656   1657   Any
        //  1648   1656   1647   1648   Ljava/lang/ArithmeticException;
        //  1647   1656   1647   1648   Ljava/lang/EnumConstantNotPresentException;
        //  1648   1656   3      8      Any
        //  1647   1656   1647   1648   Any
        //  1662   1669   1669   1670   Any
        //  1663   1669   1662   1663   Any
        //  1662   1669   1662   1663   Ljava/util/NoSuchElementException;
        //  1662   1669   3      8      Ljava/lang/UnsupportedOperationException;
        //  1662   1669   1669   1670   Ljava/lang/ArithmeticException;
        //  1679   1686   1686   1687   Any
        //  1679   1686   1679   1680   Any
        //  1679   1686   1686   1687   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1680   1686   1686   1687   Ljava/lang/EnumConstantNotPresentException;
        //  1679   1686   1686   1687   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1739   1746   1746   1747   Any
        //  1740   1746   1739   1740   Any
        //  1739   1746   1739   1740   Ljava/lang/ClassCastException;
        //  1740   1746   1746   1747   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1740   1746   1746   1747   Ljava/lang/AssertionError;
        //  1757   1764   1764   1765   Any
        //  1757   1764   1757   1758   Any
        //  1757   1764   3      8      Any
        //  1757   1764   3      8      Any
        //  1758   1764   3      8      Any
        //  1771   1778   1778   1779   Any
        //  1772   1778   1778   1779   Any
        //  1771   1778   3      8      Ljava/util/NoSuchElementException;
        //  1771   1778   1778   1779   Ljava/lang/EnumConstantNotPresentException;
        //  1771   1778   1771   1772   Ljava/lang/ClassCastException;
        //  1835   1844   1844   1845   Any
        //  1835   1844   1835   1836   Any
        //  1836   1844   3      8      Any
        //  1835   1844   1835   1836   Any
        //  1835   1844   1835   1836   Any
        //  1901   1910   1910   1911   Any
        //  1902   1910   1901   1902   Ljava/lang/UnsupportedOperationException;
        //  1901   1910   1901   1902   Any
        //  1902   1910   1910   1911   Any
        //  1902   1910   1901   1902   Any
        //  1917   1926   1926   1927   Any
        //  1918   1926   1917   1918   Ljava/util/NoSuchElementException;
        //  1917   1926   3      8      Ljava/lang/ClassCastException;
        //  1918   1926   3      8      Any
        //  1917   1926   1926   1927   Ljava/lang/NullPointerException;
        //  1933   1942   1942   1943   Any
        //  1934   1942   1933   1934   Ljava/lang/NegativeArraySizeException;
        //  1934   1942   1933   1934   Any
        //  1934   1942   1933   1934   Ljava/lang/NumberFormatException;
        //  1933   1942   1933   1934   Any
        //  1948   1954   1954   1955   Any
        //  1948   1954   3      8      Any
        //  1948   1954   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1948   1954   3      8      Any
        //  1948   1954   3      8      Any
        //  1964   1971   1971   1972   Any
        //  1964   1971   3      8      Any
        //  1964   1971   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1965   1971   1964   1965   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1965   1971   1964   1965   Any
        //  1978   1985   1985   1986   Any
        //  1978   1985   3      8      Any
        //  1979   1985   1978   1979   Any
        //  1978   1985   3      8      Any
        //  1978   1985   1985   1986   Any
        //  1992   1999   1999   2000   Any
        //  1992   1999   1992   1993   Any
        //  1993   1999   3      8      Ljava/lang/ClassCastException;
        //  1992   1999   1999   2000   Ljava/lang/ArithmeticException;
        //  1992   1999   1999   2000   Any
        //  2057   2064   2064   2065   Any
        //  2057   2064   2064   2065   Any
        //  2058   2064   2057   2058   Ljava/lang/IllegalStateException;
        //  2057   2064   2057   2058   Any
        //  2057   2064   2064   2065   Any
        //  2068   2075   2075   2076   Any
        //  2068   2075   3      8      Any
        //  2068   2075   2068   2069   Ljava/util/NoSuchElementException;
        //  2069   2075   3      8      Ljava/lang/RuntimeException;
        //  2069   2075   2068   2069   Any
        //  2127   2134   2134   2135   Any
        //  2127   2134   2134   2135   Ljava/lang/ClassCastException;
        //  2128   2134   2127   2128   Ljava/lang/NumberFormatException;
        //  2127   2134   2134   2135   Any
        //  2128   2134   2134   2135   Ljava/lang/NumberFormatException;
        //  2142   2148   2148   2149   Any
        //  2142   2148   3      8      Ljava/lang/RuntimeException;
        //  2142   2148   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2142   2148   2148   2149   Any
        //  2142   2148   2148   2149   Ljava/lang/RuntimeException;
        //  2191   2198   2198   2199   Any
        //  2192   2198   2191   2192   Any
        //  2191   2198   2191   2192   Any
        //  2192   2198   3      8      Any
        //  2192   2198   2198   2199   Any
        //  2206   2213   2213   2214   Any
        //  2207   2213   2206   2207   Any
        //  2206   2213   2213   2214   Ljava/lang/NegativeArraySizeException;
        //  2207   2213   3      8      Ljava/lang/NegativeArraySizeException;
        //  2206   2213   3      8      Ljava/lang/IllegalStateException;
        //  2217   2224   2224   2225   Any
        //  2217   2224   3      8      Any
        //  2217   2224   2217   2218   Any
        //  2218   2224   2224   2225   Ljava/lang/UnsupportedOperationException;
        //  2217   2224   3      8      Any
        //  2282   2288   2288   2289   Any
        //  2282   2288   2288   2289   Ljava/lang/AssertionError;
        //  2282   2288   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2282   2288   2288   2289   Ljava/lang/NumberFormatException;
        //  2282   2288   3      8      Any
        //  2337   2344   2344   2345   Any
        //  2338   2344   2337   2338   Ljava/lang/IllegalArgumentException;
        //  2338   2344   2337   2338   Any
        //  2337   2344   3      8      Any
        //  2337   2344   2344   2345   Ljava/lang/ClassCastException;
        //  2554   2561   2561   2562   Any
        //  2555   2561   3      8      Any
        //  2555   2561   2554   2555   Any
        //  2555   2561   2554   2555   Any
        //  2554   2561   2561   2562   Any
        //  2569   2575   2575   2576   Any
        //  2569   2575   3      8      Ljava/lang/RuntimeException;
        //  2569   2575   2575   2576   Ljava/lang/RuntimeException;
        //  2569   2575   3      8      Ljava/lang/NullPointerException;
        //  2569   2575   3      8      Any
        //  2829   2836   2836   2837   Any
        //  2830   2836   2829   2830   Ljava/lang/IllegalStateException;
        //  2829   2836   2829   2830   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2829   2836   3      8      Any
        //  2830   2836   2836   2837   Any
        //  2845   2854   2854   2855   Any
        //  2846   2854   2845   2846   Ljava/lang/RuntimeException;
        //  2846   2854   2845   2846   Ljava/lang/UnsupportedOperationException;
        //  2845   2854   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2846   2854   3      8      Ljava/util/NoSuchElementException;
        //  2909   2916   2916   2917   Any
        //  2910   2916   2909   2910   Any
        //  2910   2916   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2909   2916   2916   2917   Ljava/lang/EnumConstantNotPresentException;
        //  2909   2916   2916   2917   Ljava/lang/IllegalStateException;
        //  2972   2980   2980   2981   Any
        //  2972   2980   2980   2981   Ljava/lang/RuntimeException;
        //  2972   2980   2980   2981   Ljava/lang/NumberFormatException;
        //  2972   2980   2980   2981   Any
        //  2972   2980   3      8      Any
        //  3036   3042   3042   3043   Any
        //  3036   3042   3042   3043   Ljava/lang/NullPointerException;
        //  3036   3042   3042   3043   Ljava/lang/EnumConstantNotPresentException;
        //  3036   3042   3      8      Any
        //  3036   3042   3      8      Any
        //  3052   3060   3060   3061   Any
        //  3052   3060   3      8      Any
        //  3052   3060   3060   3061   Any
        //  3052   3060   3060   3061   Ljava/lang/NumberFormatException;
        //  3052   3060   3060   3061   Any
        //  3163   3170   3170   3171   Any
        //  3164   3170   3      8      Ljava/util/NoSuchElementException;
        //  3164   3170   3170   3171   Ljava/lang/StringIndexOutOfBoundsException;
        //  3164   3170   3163   3164   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3163   3170   3163   3164   Any
        //  3219   3226   3226   3227   Any
        //  3220   3226   3      8      Ljava/lang/IllegalArgumentException;
        //  3219   3226   3226   3227   Any
        //  3220   3226   3226   3227   Ljava/lang/IllegalArgumentException;
        //  3220   3226   3219   3220   Ljava/util/ConcurrentModificationException;
        //  3230   3237   3237   3238   Any
        //  3231   3237   3      8      Any
        //  3231   3237   3230   3231   Ljava/lang/IllegalArgumentException;
        //  3231   3237   3237   3238   Ljava/lang/StringIndexOutOfBoundsException;
        //  3230   3237   3237   3238   Ljava/lang/IndexOutOfBoundsException;
        //  3292   3298   3298   3299   Any
        //  3292   3298   3298   3299   Ljava/lang/NullPointerException;
        //  3292   3298   3298   3299   Ljava/lang/UnsupportedOperationException;
        //  3292   3298   3      8      Any
        //  3292   3298   3      8      Any
        //  3305   3312   3312   3313   Any
        //  3306   3312   3305   3306   Any
        //  3305   3312   3312   3313   Ljava/lang/StringIndexOutOfBoundsException;
        //  3305   3312   3      8      Ljava/util/NoSuchElementException;
        //  3306   3312   3312   3313   Ljava/lang/StringIndexOutOfBoundsException;
        //  3317   3324   3324   3325   Any
        //  3317   3324   3      8      Ljava/lang/NullPointerException;
        //  3318   3324   3317   3318   Any
        //  3317   3324   3317   3318   Any
        //  3317   3324   3317   3318   Ljava/lang/AssertionError;
        //  3382   3389   3389   3390   Any
        //  3382   3389   3382   3383   Ljava/lang/EnumConstantNotPresentException;
        //  3382   3389   3      8      Ljava/lang/RuntimeException;
        //  3382   3389   3      8      Any
        //  3382   3389   3      8      Ljava/lang/UnsupportedOperationException;
        //  3393   3400   3400   3401   Any
        //  3394   3400   3400   3401   Any
        //  3394   3400   3      8      Ljava/lang/AssertionError;
        //  3394   3400   3393   3394   Any
        //  3393   3400   3393   3394   Ljava/lang/NegativeArraySizeException;
        //  3503   3512   3512   3513   Any
        //  3503   3512   3503   3504   Ljava/lang/StringIndexOutOfBoundsException;
        //  3504   3512   3      8      Ljava/lang/RuntimeException;
        //  3503   3512   3503   3504   Ljava/lang/UnsupportedOperationException;
        //  3504   3512   3512   3513   Any
        //  3567   3574   3574   3575   Any
        //  3568   3574   3574   3575   Ljava/lang/IndexOutOfBoundsException;
        //  3568   3574   3567   3568   Any
        //  3567   3574   3      8      Ljava/lang/IllegalArgumentException;
        //  3568   3574   3567   3568   Ljava/lang/EnumConstantNotPresentException;
        //  3632   3638   3638   3639   Any
        //  3632   3638   3      8      Any
        //  3632   3638   3638   3639   Any
        //  3632   3638   3      8      Any
        //  3632   3638   3638   3639   Ljava/lang/AssertionError;
        //  3644   3651   3651   3652   Any
        //  3644   3651   3      8      Ljava/lang/IllegalArgumentException;
        //  3644   3651   3644   3645   Ljava/lang/IllegalStateException;
        //  3644   3651   3      8      Any
        //  3644   3651   3651   3652   Any
        //  3707   3714   3714   3715   Any
        //  3708   3714   3      8      Ljava/lang/RuntimeException;
        //  3707   3714   3714   3715   Ljava/lang/EnumConstantNotPresentException;
        //  3708   3714   3714   3715   Any
        //  3708   3714   3707   3708   Ljava/lang/IllegalArgumentException;
        //  3721   3727   3727   3728   Any
        //  3721   3727   3      8      Ljava/util/NoSuchElementException;
        //  3721   3727   3727   3728   Ljava/util/ConcurrentModificationException;
        //  3721   3727   3      8      Ljava/lang/ClassCastException;
        //  3721   3727   3      8      Ljava/util/NoSuchElementException;
        //  3823   3830   3830   3831   Any
        //  3823   3830   3830   3831   Ljava/lang/IndexOutOfBoundsException;
        //  3823   3830   3823   3824   Any
        //  3824   3830   3      8      Any
        //  3823   3830   3      8      Any
        //  3895   3902   3902   3903   Any
        //  3895   3902   3895   3896   Any
        //  3895   3902   3895   3896   Any
        //  3895   3902   3      8      Any
        //  3896   3902   3902   3903   Any
        //  3962   3969   3969   3970   Any
        //  3962   3969   3969   3970   Any
        //  3962   3969   3      8      Ljava/lang/NegativeArraySizeException;
        //  3963   3969   3962   3963   Any
        //  3963   3969   3969   3970   Ljava/lang/ClassCastException;
        //  4037   4044   4044   4045   Any
        //  4038   4044   4037   4038   Ljava/lang/NullPointerException;
        //  4038   4044   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4038   4044   4037   4038   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4037   4044   4044   4045   Ljava/lang/IllegalArgumentException;
        //  4099   4106   4106   4107   Any
        //  4099   4106   3      8      Any
        //  4100   4106   4106   4107   Ljava/lang/NegativeArraySizeException;
        //  4100   4106   4106   4107   Ljava/lang/NumberFormatException;
        //  4100   4106   4099   4100   Ljava/lang/IllegalArgumentException;
        //  4111   4117   4117   4118   Any
        //  4111   4117   3      8      Any
        //  4111   4117   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  4111   4117   4117   4118   Any
        //  4111   4117   3      8      Ljava/lang/ClassCastException;
        //  4121   4128   4128   4129   Any
        //  4121   4128   4121   4122   Any
        //  4121   4128   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4121   4128   3      8      Ljava/lang/AssertionError;
        //  4121   4128   4121   4122   Any
        //  4201   4208   4208   4209   Any
        //  4201   4208   4201   4202   Any
        //  4202   4208   4201   4202   Any
        //  4202   4208   4208   4209   Ljava/lang/AssertionError;
        //  4202   4208   4208   4209   Any
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
    
    @NotNull
    public f0a 0() {
        return fbS.0M(this, 1052427848);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3h f3h) {
        fbS.hE(this, 1072038453, f3h);
    }
    
    public fa3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2923\u1496\u8028\ub3cb\uc69c\ue73e"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2903\u1496\u8028\ub3cb\uc69c\ue73e"
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            22
        //    16: ldc_w           -1887988869
        //    19: goto            25
        //    22: ldc_w           -1581000580
        //    25: ldc_w           -1929637583
        //    28: ixor           
        //    29: lookupswitch {
        //          59474506: 843
        //          861902787: 22
        //          default: 56
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: ldc_w           "\u2911\u149f\u8025\ub3d6\uc688\ue725\ub264\uec1d\ud967\ue6f9\uadb6\u1e58\ueb2f\uc5e7\u8e6e\u83ac\u57b7\u7dc8\ubd31\ucf49\u2182\uc23d\u60c0\u2d58\ud88a\u3f15\u7d29\u8366\u801e\u83c8\u8e7b\ufb21"
        //    62: getstatic       dev/nuker/pyro/fc.c:I
        //    65: ifge            74
        //    68: ldc_w           1669476224
        //    71: goto            77
        //    74: ldc_w           -1288109452
        //    77: ldc_w           -183384927
        //    80: ixor           
        //    81: lookupswitch {
        //          -1768690911: 839
        //          1966802179: 74
        //          default: 108
        //        }
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   114: getstatic       dev/nuker/pyro/fc.1:I
        //   117: ifeq            126
        //   120: ldc_w           -47275882
        //   123: goto            129
        //   126: ldc_w           -192006188
        //   129: ldc_w           828622786
        //   132: ixor           
        //   133: lookupswitch {
        //          -974262250: 160
        //          -867342508: 126
        //          default: 835
        //        }
        //   160: aload_0        
        //   161: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   164: dup            
        //   165: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   168: putfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   171: aload_0        
        //   172: getstatic       dev/nuker/pyro/fc.1:I
        //   175: ifeq            184
        //   178: ldc_w           948843105
        //   181: goto            187
        //   184: ldc_w           -1564247022
        //   187: ldc_w           593911762
        //   190: ixor           
        //   191: lookupswitch {
        //          -1563203992: 184
        //          468217267: 849
        //          default: 216
        //        }
        //   216: aload_0        
        //   217: new             Ldev/nuker/pyro/f0a;
        //   220: dup            
        //   221: ldc_w           "\u2932\u149c\u803c\ub3d7\uc69b\ue73f\ub22a\uec03\ud94a\ue6e3\uadee"
        //   224: getstatic       dev/nuker/pyro/fc.c:I
        //   227: ifge            236
        //   230: ldc_w           1259584161
        //   233: goto            239
        //   236: ldc_w           96799459
        //   239: ldc_w           -764848877
        //   242: ixor           
        //   243: lookupswitch {
        //          -1719996494: 829
        //          317942077: 236
        //          default: 268
        //        }
        //   268: invokestatic    invokestatic   !!! ERROR
        //   271: ldc_w           "\u2912\u149c\u803c\ub3d7\uc69b\ue73f\ub22a\uec03\ud94a\ue6e3\uadee"
        //   274: invokestatic    invokestatic   !!! ERROR
        //   277: aconst_null    
        //   278: iconst_1       
        //   279: getstatic       dev/nuker/pyro/fc.1:I
        //   282: ifeq            291
        //   285: ldc_w           -1019846296
        //   288: goto            294
        //   291: ldc_w           -490572617
        //   294: ldc_w           -990365356
        //   297: ixor           
        //   298: lookupswitch {
        //          130963516: 837
        //          573251362: 291
        //          default: 324
        //        }
        //   324: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   327: checkcast       Ldev/nuker/pyro/f0n;
        //   330: invokevirtual   dev/nuker/pyro/fa3.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   333: checkcast       Ldev/nuker/pyro/f0a;
        //   336: putfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/f0a;
        //   339: getstatic       dev/nuker/pyro/fc.c:I
        //   342: ifge            351
        //   345: ldc_w           206462218
        //   348: goto            354
        //   351: ldc_w           -1944929834
        //   354: ldc_w           1855282520
        //   357: ixor           
        //   358: lookupswitch {
        //          898506098: 351
        //          1658519634: 847
        //          default: 384
        //        }
        //   384: aload_0        
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            397
        //   391: ldc_w           -75317603
        //   394: goto            400
        //   397: ldc_w           1099668825
        //   400: ldc_w           1306651646
        //   403: ixor           
        //   404: lookupswitch {
        //          -1235004061: 397
        //          208303783: 432
        //          default: 833
        //        }
        //   432: aload_0        
        //   433: new             Ldev/nuker/pyro/f0a;
        //   436: dup            
        //   437: ldc_w           "\u2924\u1481\u8028\ub3da\uc69a\ue724\ub237"
        //   440: invokestatic    invokestatic   !!! ERROR
        //   443: ldc_w           "\u2904\u1481\u8028\ub3da\uc69a\ue724\ub237"
        //   446: invokestatic    invokestatic   !!! ERROR
        //   449: aconst_null    
        //   450: iconst_1       
        //   451: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   454: checkcast       Ldev/nuker/pyro/f0n;
        //   457: invokevirtual   dev/nuker/pyro/fa3.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   460: checkcast       Ldev/nuker/pyro/f0a;
        //   463: putfield        dev/nuker/pyro/fa3.0:Ldev/nuker/pyro/f0a;
        //   466: getstatic       dev/nuker/pyro/fc.1:I
        //   469: ifeq            478
        //   472: ldc_w           -578743405
        //   475: goto            481
        //   478: ldc_w           591275492
        //   481: ldc_w           -2112769687
        //   484: ixor           
        //   485: lookupswitch {
        //          -1590717299: 512
        //          1603314426: 478
        //          default: 841
        //        }
        //   512: aload_0        
        //   513: getstatic       dev/nuker/pyro/fc.c:I
        //   516: ifge            525
        //   519: ldc_w           1842587970
        //   522: goto            528
        //   525: ldc_w           1320105684
        //   528: ldc_w           1292151763
        //   531: ixor           
        //   532: lookupswitch {
        //          550961809: 831
        //          916216495: 525
        //          default: 560
        //        }
        //   560: aload_0        
        //   561: new             Ldev/nuker/pyro/f0a;
        //   564: dup            
        //   565: ldc_w           "\u2936\u149a\u8025\ub3d5"
        //   568: invokestatic    invokestatic   !!! ERROR
        //   571: ldc_w           "\u2916\u149a\u8025\ub3d5"
        //   574: invokestatic    invokestatic   !!! ERROR
        //   577: aconst_null    
        //   578: iconst_1       
        //   579: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   582: checkcast       Ldev/nuker/pyro/f0n;
        //   585: getstatic       dev/nuker/pyro/fc.c:I
        //   588: ifge            597
        //   591: ldc_w           659810918
        //   594: goto            600
        //   597: ldc_w           -1314840766
        //   600: ldc_w           359874252
        //   603: ixor           
        //   604: lookupswitch {
        //          -1529732722: 632
        //          841012394: 597
        //          default: 855
        //        }
        //   632: invokevirtual   dev/nuker/pyro/fa3.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   635: checkcast       Ldev/nuker/pyro/f0a;
        //   638: putfield        dev/nuker/pyro/fa3.1:Ldev/nuker/pyro/f0a;
        //   641: getstatic       dev/nuker/pyro/fc.1:I
        //   644: ifeq            653
        //   647: ldc_w           -703182782
        //   650: goto            656
        //   653: ldc_w           -1592297535
        //   656: ldc_w           -1293926033
        //   659: ixor           
        //   660: lookupswitch {
        //          1693845805: 845
        //          2039427856: 653
        //          default: 688
        //        }
        //   688: aload_0        
        //   689: aload_0        
        //   690: new             Ldev/nuker/pyro/f0d;
        //   693: dup            
        //   694: ldc_w           "\u2927\u149a\u802d\ub3cd\uc697"
        //   697: invokestatic    invokestatic   !!! ERROR
        //   700: ldc_w           "\u2907\u149a\u802d\ub3cd\uc697"
        //   703: invokestatic    invokestatic   !!! ERROR
        //   706: aconst_null    
        //   707: ldc2_w          0.6
        //   710: ldc2_w          0.1
        //   713: ldc2_w          10.0
        //   716: dconst_0       
        //   717: bipush          64
        //   719: aconst_null    
        //   720: getstatic       dev/nuker/pyro/fc.c:I
        //   723: ifge            732
        //   726: ldc_w           1145477490
        //   729: goto            735
        //   732: ldc_w           -101031402
        //   735: ldc_w           1292705864
        //   738: ixor           
        //   739: lookupswitch {
        //          -1258864034: 764
        //          155957562: 732
        //          default: 851
        //        }
        //   764: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   767: checkcast       Ldev/nuker/pyro/f0n;
        //   770: invokevirtual   dev/nuker/pyro/fa3.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   773: checkcast       Ldev/nuker/pyro/f0d;
        //   776: putfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/f0d;
        //   779: getstatic       dev/nuker/pyro/fc.1:I
        //   782: ifeq            791
        //   785: ldc_w           1764759190
        //   788: goto            794
        //   791: ldc_w           2125451555
        //   794: ldc_w           -1946455779
        //   797: ixor           
        //   798: lookupswitch {
        //          -489986165: 791
        //          -179003330: 824
        //          default: 853
        //        }
        //   824: aload_0        
        //   825: invokevirtual   dev/nuker/pyro/fa3.3:()V
        //   828: return         
        //   829: aconst_null    
        //   830: athrow         
        //   831: aconst_null    
        //   832: athrow         
        //   833: aconst_null    
        //   834: athrow         
        //   835: aconst_null    
        //   836: athrow         
        //   837: aconst_null    
        //   838: athrow         
        //   839: aconst_null    
        //   840: athrow         
        //   841: aconst_null    
        //   842: athrow         
        //   843: aconst_null    
        //   844: athrow         
        //   845: aconst_null    
        //   846: athrow         
        //   847: aconst_null    
        //   848: athrow         
        //   849: aconst_null    
        //   850: athrow         
        //   851: aconst_null    
        //   852: athrow         
        //   853: aconst_null    
        //   854: athrow         
        //   855: aconst_null    
        //   856: athrow         
        //    StackMapTable: 00 38 FF 00 16 00 01 06 00 03 06 07 02 17 07 02 17 FF 00 02 00 01 06 00 04 06 07 02 17 07 02 17 01 FF 00 1E 00 01 06 00 03 06 07 02 17 07 02 17 FF 00 11 00 01 06 00 04 06 07 02 17 07 02 17 07 02 17 FF 00 02 00 01 06 00 05 06 07 02 17 07 02 17 07 02 17 01 FF 00 1E 00 01 06 00 04 06 07 02 17 07 02 17 07 02 17 FF 00 11 00 01 07 00 03 00 00 42 01 1E 57 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 13 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 FF 00 16 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 07 02 17 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 07 02 17 05 01 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 07 02 17 05 01 1A 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 2D 42 01 1E 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 24 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 53 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 53 01 FF 00 1F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 53 14 42 01 1F FF 00 2B 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 B2 08 02 B2 07 02 17 07 02 17 05 03 03 03 03 01 05 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 02 B2 08 02 B2 07 02 17 07 02 17 05 03 03 03 03 01 05 01 FF 00 1C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 B2 08 02 B2 07 02 17 07 02 17 05 03 03 03 03 01 05 1A 42 01 1D FF 00 04 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 41 07 00 03 41 07 00 03 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 D9 08 00 D9 07 02 17 07 02 17 05 01 FF 00 01 00 01 06 00 04 06 07 02 17 07 02 17 07 02 17 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 06 00 03 06 07 02 17 07 02 17 FF 00 01 00 01 07 00 03 00 00 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 B2 08 02 B2 07 02 17 07 02 17 05 03 03 03 03 01 05 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 53
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
    public Color c(@NotNull final IBlockState p0, @NotNull final Block p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          449
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            441
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            433
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -253794550
        //    33: goto            39
        //    36: ldc_w           655293080
        //    39: ldc_w           -1403054092
        //    42: ixor           
        //    43: lookupswitch {
        //          -1957565076: 68
        //          1551921406: 36
        //          default: 420
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.0:I
        //    73: ifeq            82
        //    76: ldc_w           -1284354705
        //    79: goto            85
        //    82: ldc_w           -342144595
        //    85: ldc_w           298398741
        //    88: ixor           
        //    89: lookupswitch {
        //          -1564771974: 422
        //          -491570515: 82
        //          default: 116
        //        }
        //   116: aload_2        
        //   117: pop            
        //   118: aload_2        
        //   119: getstatic       dev/nuker/pyro/fc.c:I
        //   122: ifge            131
        //   125: ldc_w           1749643983
        //   128: goto            134
        //   131: ldc_w           -405417475
        //   134: ldc_w           1693169672
        //   137: ixor           
        //   138: lookupswitch {
        //          211995335: 414
        //          727392713: 131
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokestatic    net/minecraft/block/Block.func_149682_b:(Lnet/minecraft/block/Block;)I
        //   171: goto            175
        //   174: athrow         
        //   175: lookupswitch {
        //               52: 272
        //               90: 200
        //          default: 298
        //        }
        //   200: new             Ljava/awt/Color;
        //   203: dup            
        //   204: sipush          143
        //   207: iconst_0       
        //   208: sipush          255
        //   211: sipush          156
        //   214: getstatic       dev/nuker/pyro/fc.c:I
        //   217: ifge            226
        //   220: ldc_w           -413018906
        //   223: goto            229
        //   226: ldc_w           -885251028
        //   229: ldc_w           1533540778
        //   232: ixor           
        //   233: lookupswitch {
        //          -1873027706: 260
        //          -1140445876: 226
        //          default: 418
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokespecial   java/awt/Color.<init>:(IIII)V
        //   267: goto            271
        //   270: athrow         
        //   271: areturn        
        //   272: new             Ljava/awt/Color;
        //   275: dup            
        //   276: iconst_0       
        //   277: sipush          255
        //   280: sipush          216
        //   283: sipush          156
        //   286: goto            290
        //   289: athrow         
        //   290: invokespecial   java/awt/Color.<init>:(IIII)V
        //   293: goto            297
        //   296: athrow         
        //   297: areturn        
        //   298: getstatic       dev/nuker/pyro/fc.1:I
        //   301: ifeq            310
        //   304: ldc_w           2129894939
        //   307: goto            313
        //   310: ldc_w           -1652625149
        //   313: ldc_w           -2014039585
        //   316: ixor           
        //   317: lookupswitch {
        //          -774954845: 310
        //          -116936764: 416
        //          default: 344
        //        }
        //   344: aload_1        
        //   345: goto            349
        //   348: athrow         
        //   349: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   354: goto            358
        //   357: athrow         
        //   358: dup            
        //   359: pop            
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   net/minecraft/block/material/Material.func_151565_r:()Lnet/minecraft/block/material/MapColor;
        //   367: goto            371
        //   370: athrow         
        //   371: getfield        net/minecraft/block/material/MapColor.field_76291_p:I
        //   374: istore_3       
        //   375: new             Ljava/awt/Color;
        //   378: dup            
        //   379: iload_3        
        //   380: bipush          16
        //   382: ishr           
        //   383: sipush          255
        //   386: iand           
        //   387: iload_3        
        //   388: bipush          8
        //   390: ishr           
        //   391: sipush          255
        //   394: iand           
        //   395: iload_3        
        //   396: sipush          255
        //   399: iand           
        //   400: bipush          100
        //   402: goto            406
        //   405: athrow         
        //   406: invokespecial   java/awt/Color.<init>:(IIII)V
        //   409: goto            413
        //   412: athrow         
        //   413: areturn        
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
        //   424: pop            
        //   425: goto            24
        //   428: pop            
        //   429: aconst_null    
        //   430: goto            424
        //   433: dup            
        //   434: ifnull          424
        //   437: checkcast       Ljava/lang/Throwable;
        //   440: athrow         
        //   441: dup            
        //   442: ifnull          428
        //   445: checkcast       Ljava/lang/Throwable;
        //   448: athrow         
        //   449: aconst_null    
        //   450: athrow         
        //    StackMapTable: 00 38 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FE 00 03 07 00 03 07 00 DD 07 02 13 0B 42 01 1C 0D 42 01 1E 4E 07 02 13 FF 00 02 00 03 07 00 03 07 00 DD 07 02 13 00 02 07 02 13 01 5D 07 02 13 42 07 00 30 40 07 02 13 45 07 00 37 40 01 18 FF 00 19 00 03 07 00 03 07 00 DD 07 02 13 00 06 08 00 C8 08 00 C8 01 01 01 01 FF 00 02 00 03 07 00 03 07 00 DD 07 02 13 00 07 08 00 C8 08 00 C8 01 01 01 01 01 FF 00 1E 00 03 07 00 03 07 00 DD 07 02 13 00 06 08 00 C8 08 00 C8 01 01 01 01 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 02 13 00 06 08 00 C8 08 00 C8 01 01 01 01 45 07 00 37 40 07 02 19 00 50 07 00 1E FF 00 00 00 03 07 00 03 07 00 DD 07 02 13 00 06 08 01 10 08 01 10 01 01 01 01 45 07 00 37 40 07 02 19 00 0B 42 01 1E 43 07 00 37 40 07 00 DD 47 07 00 37 40 07 02 A0 44 07 00 37 40 07 02 A0 45 07 00 37 40 07 02 A6 FF 00 21 00 04 07 00 03 07 00 DD 07 02 13 01 00 01 07 00 37 FF 00 00 00 04 07 00 03 07 00 DD 07 02 13 01 00 06 08 01 77 08 01 77 01 01 01 01 45 07 00 37 40 07 02 19 FF 00 00 00 03 07 00 03 07 00 DD 07 02 13 00 01 07 02 13 01 FF 00 01 00 03 07 00 03 07 00 DD 07 02 13 00 06 08 00 C8 08 00 C8 01 01 01 01 01 01 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     433    441    Any
        //  433    441    433    441    Any
        //  449    451    3      8      Any
        //  167    174    174    175    Any
        //  168    174    167    168    Ljava/lang/AssertionError;
        //  167    174    174    175    Ljava/lang/AssertionError;
        //  168    174    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  168    174    3      8      Any
        //  263    270    270    271    Any
        //  264    270    263    264    Any
        //  263    270    263    264    Any
        //  264    270    263    264    Any
        //  264    270    263    264    Ljava/lang/NegativeArraySizeException;
        //  289    296    296    297    Any
        //  289    296    289    290    Ljava/lang/IndexOutOfBoundsException;
        //  290    296    3      8      Any
        //  290    296    3      8      Any
        //  289    296    289    290    Ljava/lang/IllegalArgumentException;
        //  348    357    357    358    Any
        //  349    357    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  348    357    348    349    Any
        //  349    357    3      8      Ljava/lang/ClassCastException;
        //  348    357    3      8      Ljava/lang/NullPointerException;
        //  363    370    370    371    Any
        //  364    370    3      8      Ljava/lang/UnsupportedOperationException;
        //  364    370    363    364    Any
        //  364    370    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  363    370    363    364    Ljava/lang/IllegalArgumentException;
        //  405    412    412    413    Any
        //  405    412    405    406    Any
        //  406    412    412    413    Any
        //  406    412    405    406    Ljava/lang/UnsupportedOperationException;
        //  406    412    3      8      Any
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
    
    public void 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2077
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2069
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2061
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: ldc_w           "\u2920\u148a\u803b\ub197\uc491\ue725\ub221\uec05\udb3b\ue4ae\uadfe\u1e73\ueb22\uc7ea\u8c25\u83ae\u57af\u7dd2\ubf32\ucd1b\u21d1\uc234\u60c7"
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    invokestatic   !!! ERROR
        //    38: goto            42
        //    41: athrow         
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            54
        //    48: ldc_w           -37340357
        //    51: goto            57
        //    54: ldc_w           677318004
        //    57: ldc_w           -638603030
        //    60: ixor           
        //    61: lookupswitch {
        //          544492238: 54
        //          606702545: 2028
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    95: goto            99
        //    98: athrow         
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   java/io/File.exists:()Z
        //   106: goto            110
        //   109: athrow         
        //   110: ifeq            298
        //   113: nop            
        //   114: new             Ljava/io/FileReader;
        //   117: dup            
        //   118: ldc_w           "\u2920\u148a\u803b\ub197\uc491\ue725\ub221\uec05\udb3b\ue4ae\uadfe\u1e73\ueb22\uc7ea\u8c25\u83ae\u57af\u7dd2\ubf32\ucd1b\u21d1\uc234\u60c7"
        //   121: getstatic       dev/nuker/pyro/fc.1:I
        //   124: ifeq            133
        //   127: ldc_w           -1595663718
        //   130: goto            136
        //   133: ldc_w           -616236616
        //   136: ldc_w           81667510
        //   139: ixor           
        //   140: lookupswitch {
        //          -1539686612: 133
        //          -543499250: 168
        //          default: 2004
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: goto            179
        //   178: athrow         
        //   179: goto            183
        //   182: athrow         
        //   183: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   186: goto            190
        //   189: athrow         
        //   190: astore_1       
        //   191: aload_0        
        //   192: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   195: aload_1        
        //   196: checkcast       Ljava/io/Reader;
        //   199: ldc_w           Ldev/nuker/pyro/fa2;.class
        //   202: goto            206
        //   205: athrow         
        //   206: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   209: goto            213
        //   212: athrow         
        //   213: dup            
        //   214: pop            
        //   215: checkcast       Ldev/nuker/pyro/fa2;
        //   218: getstatic       dev/nuker/pyro/fc.c:I
        //   221: ifge            230
        //   224: ldc_w           1083357699
        //   227: goto            233
        //   230: ldc_w           -1446640640
        //   233: ldc_w           1119112346
        //   236: ixor           
        //   237: lookupswitch {
        //          36107929: 2036
        //          1495768645: 230
        //          default: 264
        //        }
        //   264: putfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //   267: aload_1        
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   java/io/FileReader.close:()V
        //   275: goto            279
        //   278: athrow         
        //   279: goto            1991
        //   282: astore_1       
        //   283: aload_1        
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   java/io/IOException.printStackTrace:()V
        //   291: goto            295
        //   294: athrow         
        //   295: goto            1991
        //   298: getstatic       dev/nuker/pyro/fc.c:I
        //   301: ifge            310
        //   304: ldc_w           1608949249
        //   307: goto            313
        //   310: ldc_w           1093172689
        //   313: ldc_w           1811377310
        //   316: ixor           
        //   317: lookupswitch {
        //          873591455: 2014
        //          1472655717: 310
        //          default: 344
        //        }
        //   344: aload_0        
        //   345: new             Ldev/nuker/pyro/fa2;
        //   348: dup            
        //   349: goto            353
        //   352: athrow         
        //   353: invokespecial   dev/nuker/pyro/fa2.<init>:()V
        //   356: goto            360
        //   359: athrow         
        //   360: getstatic       dev/nuker/pyro/fc.0:I
        //   363: ifeq            372
        //   366: ldc_w           -1082752853
        //   369: goto            375
        //   372: ldc_w           1373336291
        //   375: ldc_w           -140639866
        //   378: ixor           
        //   379: lookupswitch {
        //          -1505397915: 404
        //          1223196973: 372
        //          default: 2002
        //        }
        //   404: putfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //   407: aload_0        
        //   408: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //   411: dup            
        //   412: ifnonnull       486
        //   415: ldc_w           "\u2923\u1487\u8026\ub18a\uc4df\ue731\ub221"
        //   418: getstatic       dev/nuker/pyro/fc.1:I
        //   421: ifeq            430
        //   424: ldc_w           -1296005092
        //   427: goto            433
        //   430: ldc_w           2100076747
        //   433: ldc_w           -1925839620
        //   436: ixor           
        //   437: lookupswitch {
        //          1073122528: 2018
        //          1813808757: 430
        //          default: 464
        //        }
        //   464: goto            468
        //   467: athrow         
        //   468: invokestatic    invokestatic   !!! ERROR
        //   471: goto            475
        //   474: athrow         
        //   475: goto            479
        //   478: athrow         
        //   479: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   482: goto            486
        //   485: athrow         
        //   486: bipush          28
        //   488: anewarray       Lnet/minecraft/block/Block;
        //   491: dup            
        //   492: iconst_0       
        //   493: getstatic       net/minecraft/init/Blocks.field_150474_ac:Lnet/minecraft/block/Block;
        //   496: aastore        
        //   497: dup            
        //   498: iconst_1       
        //   499: getstatic       net/minecraft/init/Blocks.field_150427_aO:Lnet/minecraft/block/BlockPortal;
        //   502: checkcast       Lnet/minecraft/block/Block;
        //   505: aastore        
        //   506: dup            
        //   507: iconst_2       
        //   508: getstatic       dev/nuker/pyro/fc.1:I
        //   511: ifeq            520
        //   514: ldc_w           1860760312
        //   517: goto            523
        //   520: ldc_w           702701527
        //   523: ldc_w           -141237189
        //   526: ixor           
        //   527: lookupswitch {
        //          -1719920957: 520
        //          -562643988: 552
        //          default: 2030
        //        }
        //   552: getstatic       net/minecraft/init/Blocks.field_150378_br:Lnet/minecraft/block/Block;
        //   555: aastore        
        //   556: dup            
        //   557: iconst_3       
        //   558: getstatic       net/minecraft/init/Blocks.field_150384_bq:Lnet/minecraft/block/Block;
        //   561: aastore        
        //   562: dup            
        //   563: iconst_4       
        //   564: getstatic       dev/nuker/pyro/fc.c:I
        //   567: ifge            576
        //   570: ldc_w           2031195226
        //   573: goto            579
        //   576: ldc_w           -1583544359
        //   579: ldc_w           -699626252
        //   582: ixor           
        //   583: lookupswitch {
        //          -1352853330: 2034
        //          -127871050: 576
        //          default: 608
        //        }
        //   608: getstatic       net/minecraft/init/Blocks.field_150367_z:Lnet/minecraft/block/Block;
        //   611: aastore        
        //   612: dup            
        //   613: iconst_5       
        //   614: getstatic       net/minecraft/init/Blocks.field_150409_cd:Lnet/minecraft/block/Block;
        //   617: aastore        
        //   618: dup            
        //   619: bipush          6
        //   621: getstatic       dev/nuker/pyro/fc.1:I
        //   624: ifeq            633
        //   627: ldc_w           -1521469159
        //   630: goto            636
        //   633: ldc_w           -522738086
        //   636: ldc_w           -1103200736
        //   639: ixor           
        //   640: lookupswitch {
        //          460212025: 633
        //          1592383610: 668
        //          default: 2040
        //        }
        //   668: getstatic       net/minecraft/init/Blocks.field_150438_bZ:Lnet/minecraft/block/BlockHopper;
        //   671: checkcast       Lnet/minecraft/block/Block;
        //   674: aastore        
        //   675: dup            
        //   676: bipush          7
        //   678: getstatic       dev/nuker/pyro/fc.c:I
        //   681: ifge            690
        //   684: ldc_w           586328099
        //   687: goto            693
        //   690: ldc_w           1353750525
        //   693: ldc_w           1043739393
        //   696: ixor           
        //   697: lookupswitch {
        //          482646818: 690
        //          1854317820: 724
        //          default: 1994
        //        }
        //   724: getstatic       net/minecraft/init/Blocks.field_150460_al:Lnet/minecraft/block/Block;
        //   727: aastore        
        //   728: dup            
        //   729: bipush          8
        //   731: getstatic       net/minecraft/init/Blocks.field_150470_am:Lnet/minecraft/block/Block;
        //   734: aastore        
        //   735: dup            
        //   736: bipush          9
        //   738: getstatic       net/minecraft/init/Blocks.field_150486_ae:Lnet/minecraft/block/BlockChest;
        //   741: checkcast       Lnet/minecraft/block/Block;
        //   744: aastore        
        //   745: dup            
        //   746: bipush          10
        //   748: getstatic       dev/nuker/pyro/fc.0:I
        //   751: ifeq            760
        //   754: ldc_w           -1730032650
        //   757: goto            763
        //   760: ldc_w           1668701886
        //   763: ldc_w           453060751
        //   766: ixor           
        //   767: lookupswitch {
        //          -2082413703: 760
        //          2021094961: 792
        //          default: 2008
        //        }
        //   792: getstatic       net/minecraft/init/Blocks.field_150447_bR:Lnet/minecraft/block/Block;
        //   795: aastore        
        //   796: dup            
        //   797: bipush          11
        //   799: getstatic       dev/nuker/pyro/fc.1:I
        //   802: ifeq            811
        //   805: ldc_w           -2105709589
        //   808: goto            814
        //   811: ldc_w           429855207
        //   814: ldc_w           -628663917
        //   817: ixor           
        //   818: lookupswitch {
        //          1224614861: 811
        //          1492791928: 2012
        //          default: 844
        //        }
        //   844: getstatic       net/minecraft/init/Blocks.field_150477_bB:Lnet/minecraft/block/Block;
        //   847: aastore        
        //   848: dup            
        //   849: bipush          12
        //   851: getstatic       net/minecraft/init/Blocks.field_190977_dl:Lnet/minecraft/block/Block;
        //   854: aastore        
        //   855: dup            
        //   856: bipush          13
        //   858: getstatic       net/minecraft/init/Blocks.field_190978_dm:Lnet/minecraft/block/Block;
        //   861: aastore        
        //   862: dup            
        //   863: bipush          14
        //   865: getstatic       net/minecraft/init/Blocks.field_190979_dn:Lnet/minecraft/block/Block;
        //   868: aastore        
        //   869: dup            
        //   870: bipush          15
        //   872: getstatic       dev/nuker/pyro/fc.c:I
        //   875: ifge            884
        //   878: ldc_w           1137316097
        //   881: goto            887
        //   884: ldc_w           220458258
        //   887: ldc_w           -2029914575
        //   890: ixor           
        //   891: lookupswitch {
        //          -1977476317: 916
        //          -993269968: 884
        //          default: 2048
        //        }
        //   916: getstatic       net/minecraft/init/Blocks.field_190980_do:Lnet/minecraft/block/Block;
        //   919: aastore        
        //   920: dup            
        //   921: bipush          16
        //   923: getstatic       net/minecraft/init/Blocks.field_190981_dp:Lnet/minecraft/block/Block;
        //   926: aastore        
        //   927: dup            
        //   928: bipush          17
        //   930: getstatic       net/minecraft/init/Blocks.field_190982_dq:Lnet/minecraft/block/Block;
        //   933: aastore        
        //   934: dup            
        //   935: bipush          18
        //   937: getstatic       net/minecraft/init/Blocks.field_190983_dr:Lnet/minecraft/block/Block;
        //   940: aastore        
        //   941: dup            
        //   942: bipush          19
        //   944: getstatic       net/minecraft/init/Blocks.field_190984_ds:Lnet/minecraft/block/Block;
        //   947: aastore        
        //   948: dup            
        //   949: bipush          20
        //   951: getstatic       dev/nuker/pyro/fc.c:I
        //   954: ifge            963
        //   957: ldc_w           -257093717
        //   960: goto            966
        //   963: ldc_w           -916933020
        //   966: ldc_w           -2082142988
        //   969: ixor           
        //   970: lookupswitch {
        //          -404585234: 963
        //          1934101343: 2006
        //          default: 996
        //        }
        //   996: getstatic       net/minecraft/init/Blocks.field_190985_dt:Lnet/minecraft/block/Block;
        //   999: aastore        
        //  1000: dup            
        //  1001: bipush          21
        //  1003: getstatic       net/minecraft/init/Blocks.field_190986_du:Lnet/minecraft/block/Block;
        //  1006: aastore        
        //  1007: dup            
        //  1008: bipush          22
        //  1010: getstatic       net/minecraft/init/Blocks.field_190987_dv:Lnet/minecraft/block/Block;
        //  1013: aastore        
        //  1014: dup            
        //  1015: bipush          23
        //  1017: getstatic       dev/nuker/pyro/fc.0:I
        //  1020: ifeq            1029
        //  1023: ldc_w           -37569577
        //  1026: goto            1032
        //  1029: ldc_w           720317683
        //  1032: ldc_w           42334123
        //  1035: ixor           
        //  1036: lookupswitch {
        //          -12104580: 1029
        //          678091608: 1064
        //          default: 2020
        //        }
        //  1064: getstatic       net/minecraft/init/Blocks.field_190988_dw:Lnet/minecraft/block/Block;
        //  1067: aastore        
        //  1068: dup            
        //  1069: bipush          24
        //  1071: getstatic       net/minecraft/init/Blocks.field_190989_dx:Lnet/minecraft/block/Block;
        //  1074: aastore        
        //  1075: dup            
        //  1076: bipush          25
        //  1078: getstatic       dev/nuker/pyro/fc.0:I
        //  1081: ifeq            1090
        //  1084: ldc_w           688112267
        //  1087: goto            1093
        //  1090: ldc_w           989541638
        //  1093: ldc_w           -1146057587
        //  1096: ixor           
        //  1097: lookupswitch {
        //          -2125743733: 1124
        //          -1833742842: 1090
        //          default: 2042
        //        }
        //  1124: getstatic       net/minecraft/init/Blocks.field_190990_dy:Lnet/minecraft/block/Block;
        //  1127: aastore        
        //  1128: dup            
        //  1129: bipush          26
        //  1131: getstatic       net/minecraft/init/Blocks.field_190991_dz:Lnet/minecraft/block/Block;
        //  1134: aastore        
        //  1135: dup            
        //  1136: bipush          27
        //  1138: getstatic       net/minecraft/init/Blocks.field_190975_dA:Lnet/minecraft/block/Block;
        //  1141: aastore        
        //  1142: getstatic       dev/nuker/pyro/fc.c:I
        //  1145: ifge            1154
        //  1148: ldc_w           -32854520
        //  1151: goto            1157
        //  1154: ldc_w           -1069044977
        //  1157: ldc_w           -847863470
        //  1160: ixor           
        //  1161: lookupswitch {
        //          221317725: 1188
        //          863768410: 1154
        //          default: 1996
        //        }
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: checkcast       Ljava/lang/Iterable;
        //  1202: astore_1       
        //  1203: astore          10
        //  1205: iconst_0       
        //  1206: istore_2       
        //  1207: aload_1        
        //  1208: getstatic       dev/nuker/pyro/fc.c:I
        //  1211: ifge            1220
        //  1214: ldc_w           2098432774
        //  1217: goto            1223
        //  1220: ldc_w           -1268363611
        //  1223: ldc_w           1893409336
        //  1226: ixor           
        //  1227: lookupswitch {
        //          231254334: 2024
        //          1195407673: 1220
        //          default: 1252
        //        }
        //  1252: astore_3       
        //  1253: new             Ljava/util/ArrayList;
        //  1256: dup            
        //  1257: aload_1        
        //  1258: bipush          10
        //  1260: getstatic       dev/nuker/pyro/fc.c:I
        //  1263: ifge            1272
        //  1266: ldc_w           2070164468
        //  1269: goto            1275
        //  1272: ldc_w           817107590
        //  1275: ldc_w           265824841
        //  1278: ixor           
        //  1279: lookupswitch {
        //          1467737667: 1272
        //          1958484413: 1998
        //          default: 1304
        //        }
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //  1311: goto            1315
        //  1314: athrow         
        //  1315: goto            1319
        //  1318: athrow         
        //  1319: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1322: goto            1326
        //  1325: athrow         
        //  1326: checkcast       Ljava/util/Collection;
        //  1329: getstatic       dev/nuker/pyro/fc.0:I
        //  1332: ifeq            1341
        //  1335: ldc_w           1659166922
        //  1338: goto            1344
        //  1341: ldc_w           512908767
        //  1344: ldc_w           -1952476419
        //  1347: ixor           
        //  1348: lookupswitch {
        //          -377785801: 2010
        //          2025485153: 1341
        //          default: 1376
        //        }
        //  1376: astore          4
        //  1378: iconst_0       
        //  1379: istore          5
        //  1381: aload_3        
        //  1382: goto            1386
        //  1385: athrow         
        //  1386: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1391: goto            1395
        //  1394: athrow         
        //  1395: astore          6
        //  1397: aload           6
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: invokeinterface java/util/Iterator.hasNext:()Z
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: ifeq            1773
        //  1415: aload           6
        //  1417: goto            1421
        //  1420: athrow         
        //  1421: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1426: goto            1430
        //  1429: athrow         
        //  1430: astore          7
        //  1432: aload           4
        //  1434: aload           7
        //  1436: checkcast       Lnet/minecraft/block/Block;
        //  1439: astore          8
        //  1441: getstatic       dev/nuker/pyro/fc.0:I
        //  1444: ifeq            1453
        //  1447: ldc_w           -1472482845
        //  1450: goto            1456
        //  1453: ldc_w           701496426
        //  1456: ldc_w           -675862540
        //  1459: ixor           
        //  1460: lookupswitch {
        //          -25633890: 1488
        //          2139919895: 1453
        //          default: 2044
        //        }
        //  1488: astore          11
        //  1490: iconst_0       
        //  1491: getstatic       dev/nuker/pyro/fc.1:I
        //  1494: ifeq            1503
        //  1497: ldc_w           -868191145
        //  1500: goto            1506
        //  1503: ldc_w           -1446191726
        //  1506: ldc_w           -661131936
        //  1509: ixor           
        //  1510: lookupswitch {
        //          349673783: 1503
        //          1901801714: 1536
        //          default: 2016
        //        }
        //  1536: istore          9
        //  1538: getstatic       net/minecraft/block/Block.field_149771_c:Lnet/minecraft/util/registry/RegistryNamespacedDefaultedByKey;
        //  1541: aload           8
        //  1543: getstatic       dev/nuker/pyro/fc.0:I
        //  1546: ifeq            1555
        //  1549: ldc_w           1952064824
        //  1552: goto            1558
        //  1555: ldc_w           -1247761979
        //  1558: ldc_w           -1274938822
        //  1561: ixor           
        //  1562: lookupswitch {
        //          -1067720958: 1992
        //          1495625722: 1555
        //          default: 1588
        //        }
        //  1588: goto            1592
        //  1591: athrow         
        //  1592: invokevirtual   net/minecraft/util/registry/RegistryNamespacedDefaultedByKey.func_177774_c:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1595: goto            1599
        //  1598: athrow         
        //  1599: checkcast       Lnet/minecraft/util/ResourceLocation;
        //  1602: goto            1606
        //  1605: athrow         
        //  1606: invokevirtual   net/minecraft/util/ResourceLocation.toString:()Ljava/lang/String;
        //  1609: goto            1613
        //  1612: athrow         
        //  1613: astore          12
        //  1615: getstatic       dev/nuker/pyro/fc.0:I
        //  1618: ifeq            1627
        //  1621: ldc_w           -1142127783
        //  1624: goto            1630
        //  1627: ldc_w           9023499
        //  1630: ldc_w           -67551725
        //  1633: ixor           
        //  1634: lookupswitch {
        //          -76509672: 1660
        //          1075166538: 1627
        //          default: 2032
        //        }
        //  1660: aload           11
        //  1662: getstatic       dev/nuker/pyro/fc.1:I
        //  1665: ifeq            1674
        //  1668: ldc_w           -1820812712
        //  1671: goto            1677
        //  1674: ldc_w           -1034120639
        //  1677: ldc_w           1157783259
        //  1680: ixor           
        //  1681: lookupswitch {
        //          -696597373: 2000
        //          -261175474: 1674
        //          default: 1708
        //        }
        //  1708: aload           12
        //  1710: getstatic       dev/nuker/pyro/fc.1:I
        //  1713: ifeq            1722
        //  1716: ldc_w           1240968925
        //  1719: goto            1725
        //  1722: ldc_w           -515047829
        //  1725: ldc_w           652025302
        //  1728: ixor           
        //  1729: lookupswitch {
        //          81497511: 1722
        //          1865069323: 2022
        //          default: 1756
        //        }
        //  1756: goto            1760
        //  1759: athrow         
        //  1760: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1765: goto            1769
        //  1768: athrow         
        //  1769: pop            
        //  1770: goto            1397
        //  1773: aload           4
        //  1775: checkcast       Ljava/util/List;
        //  1778: astore          11
        //  1780: getstatic       dev/nuker/pyro/fc.1:I
        //  1783: ifeq            1792
        //  1786: ldc_w           705754813
        //  1789: goto            1795
        //  1792: ldc_w           426582771
        //  1795: ldc_w           -967507994
        //  1798: ixor           
        //  1799: lookupswitch {
        //          -331085477: 2026
        //           461921: 1792
        //          default: 1824
        //        }
        //  1824: aload           10
        //  1826: getstatic       dev/nuker/pyro/fc.1:I
        //  1829: ifeq            1838
        //  1832: ldc_w           -1330680847
        //  1835: goto            1841
        //  1838: ldc_w           792790453
        //  1841: ldc_w           -1980095411
        //  1844: ixor           
        //  1845: lookupswitch {
        //          -1497685512: 1872
        //          961892284: 1838
        //          default: 2046
        //        }
        //  1872: aload           11
        //  1874: checkcast       Ljava/util/Collection;
        //  1877: getstatic       dev/nuker/pyro/fc.0:I
        //  1880: ifeq            1889
        //  1883: ldc_w           -531707745
        //  1886: goto            1892
        //  1889: ldc_w           -990843358
        //  1892: ldc_w           -1661270588
        //  1895: ixor           
        //  1896: lookupswitch {
        //          1239497279: 1889
        //          2092289371: 2038
        //          default: 1924
        //        }
        //  1924: goto            1928
        //  1927: athrow         
        //  1928: invokestatic    kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        //  1931: goto            1935
        //  1934: athrow         
        //  1935: getstatic       dev/nuker/pyro/fc.0:I
        //  1938: ifeq            1947
        //  1941: ldc_w           -1946465620
        //  1944: goto            1950
        //  1947: ldc_w           1211638621
        //  1950: ldc_w           1322302020
        //  1953: ixor           
        //  1954: lookupswitch {
        //          -986976024: 2050
        //          60281208: 1947
        //          default: 1980
        //        }
        //  1980: goto            1984
        //  1983: athrow         
        //  1984: invokevirtual   dev/nuker/pyro/fa2.c:(Ljava/util/List;)V
        //  1987: goto            1991
        //  1990: athrow         
        //  1991: return         
        //  1992: aconst_null    
        //  1993: athrow         
        //  1994: aconst_null    
        //  1995: athrow         
        //  1996: aconst_null    
        //  1997: athrow         
        //  1998: aconst_null    
        //  1999: athrow         
        //  2000: aconst_null    
        //  2001: athrow         
        //  2002: aconst_null    
        //  2003: athrow         
        //  2004: aconst_null    
        //  2005: athrow         
        //  2006: aconst_null    
        //  2007: athrow         
        //  2008: aconst_null    
        //  2009: athrow         
        //  2010: aconst_null    
        //  2011: athrow         
        //  2012: aconst_null    
        //  2013: athrow         
        //  2014: aconst_null    
        //  2015: athrow         
        //  2016: aconst_null    
        //  2017: athrow         
        //  2018: aconst_null    
        //  2019: athrow         
        //  2020: aconst_null    
        //  2021: athrow         
        //  2022: aconst_null    
        //  2023: athrow         
        //  2024: aconst_null    
        //  2025: athrow         
        //  2026: aconst_null    
        //  2027: athrow         
        //  2028: aconst_null    
        //  2029: athrow         
        //  2030: aconst_null    
        //  2031: athrow         
        //  2032: aconst_null    
        //  2033: athrow         
        //  2034: aconst_null    
        //  2035: athrow         
        //  2036: aconst_null    
        //  2037: athrow         
        //  2038: aconst_null    
        //  2039: athrow         
        //  2040: aconst_null    
        //  2041: athrow         
        //  2042: aconst_null    
        //  2043: athrow         
        //  2044: aconst_null    
        //  2045: athrow         
        //  2046: aconst_null    
        //  2047: athrow         
        //  2048: aconst_null    
        //  2049: athrow         
        //  2050: aconst_null    
        //  2051: athrow         
        //  2052: pop            
        //  2053: goto            24
        //  2056: pop            
        //  2057: aconst_null    
        //  2058: goto            2052
        //  2061: dup            
        //  2062: ifnull          2052
        //  2065: checkcast       Ljava/lang/Throwable;
        //  2068: athrow         
        //  2069: dup            
        //  2070: ifnull          2056
        //  2073: checkcast       Ljava/lang/Throwable;
        //  2076: athrow         
        //  2077: aconst_null    
        //  2078: athrow         
        //    StackMapTable: 00 DD 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FC 00 03 07 00 03 49 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 45 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 FF 00 0B 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 FF 00 02 00 01 07 00 03 00 04 08 00 18 08 00 18 07 02 17 01 FF 00 1E 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 42 07 00 1E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 45 07 00 37 40 07 02 AD FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 01 07 00 03 00 01 07 02 AD 45 07 00 37 40 01 FF 00 16 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 FF 00 02 00 01 07 00 03 00 04 08 00 72 08 00 72 07 02 17 01 FF 00 1F 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 42 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 45 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 45 07 00 37 40 07 02 B8 FF 00 0E 00 02 07 00 03 07 02 B8 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 02 B8 00 04 07 00 03 07 02 C8 07 02 C4 07 03 B7 45 07 00 37 FF 00 00 00 02 07 00 03 07 02 B8 00 02 07 00 03 07 02 11 FF 00 10 00 02 07 00 03 07 02 B8 00 02 07 00 03 07 02 C6 FF 00 02 00 02 07 00 03 07 02 B8 00 03 07 00 03 07 02 C6 01 FF 00 1E 00 02 07 00 03 07 02 B8 00 02 07 00 03 07 02 C6 46 07 00 37 40 07 02 B8 45 07 00 37 00 FF 00 02 00 01 07 00 03 00 01 07 02 AB FF 00 04 00 02 07 00 03 07 02 AB 00 01 07 00 37 40 07 02 AB 45 07 00 37 00 FA 00 02 0B 42 01 1E FF 00 07 00 00 00 01 07 00 37 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 59 08 01 59 45 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 02 C6 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 02 C6 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 C6 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 02 C6 FF 00 19 00 01 07 00 03 00 02 07 02 C6 07 02 17 FF 00 02 00 01 07 00 03 00 03 07 02 C6 07 02 17 01 FF 00 1E 00 01 07 00 03 00 02 07 02 C6 07 02 17 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 45 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 42 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 45 07 00 37 40 07 02 C6 FF 00 21 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1C 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 17 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1C 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 18 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1F 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 15 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1E 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 23 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1C 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 12 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1D 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 27 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1C 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 2E 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1D 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 20 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1F 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 19 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 02 00 01 07 00 03 00 05 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 1E 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 1D 00 01 07 00 03 00 02 07 02 C6 07 03 B9 FF 00 02 00 01 07 00 03 00 03 07 02 C6 07 03 B9 01 FF 00 1E 00 01 07 00 03 00 02 07 02 C6 07 03 B9 42 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 03 B9 45 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 03 A2 FF 00 14 00 0B 07 00 03 07 00 87 01 00 00 00 00 00 00 00 07 02 C6 00 01 07 00 87 FF 00 02 00 0B 07 00 03 07 00 87 01 00 00 00 00 00 00 00 07 02 C6 00 02 07 00 87 01 5C 07 00 87 FF 00 13 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 04 08 04 E5 08 04 E5 07 00 87 01 FF 00 02 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 05 08 04 E5 08 04 E5 07 00 87 01 01 FF 00 1C 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 04 08 04 E5 08 04 E5 07 00 87 01 42 07 00 20 FF 00 00 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 04 08 04 E5 08 04 E5 07 00 87 01 45 07 00 37 FF 00 00 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 03 08 04 E5 08 04 E5 01 42 07 00 14 FF 00 00 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 03 08 04 E5 08 04 E5 01 45 07 00 37 40 07 03 6C 4E 07 03 77 FF 00 02 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 02 07 03 77 01 5F 07 03 77 FF 00 08 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 00 00 00 00 07 02 C6 00 01 07 00 37 40 07 00 87 47 07 00 37 40 07 00 8D FF 00 01 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 00 00 44 07 00 37 40 07 00 8D 47 07 00 37 40 01 47 07 00 1E 40 07 00 8D 47 07 00 37 40 07 02 11 FF 00 16 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 00 01 07 03 77 FF 00 02 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 00 02 07 03 77 01 5F 07 03 77 FF 00 0E 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 07 03 77 00 01 01 FF 00 02 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 07 03 77 00 02 01 01 5D 01 FF 00 12 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 00 02 07 03 89 07 02 13 FF 00 02 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 00 03 07 03 89 07 02 13 01 FF 00 1D 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 00 02 07 03 89 07 02 13 42 07 00 37 FF 00 00 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 00 02 07 03 89 07 02 13 45 07 00 37 40 07 02 11 45 07 00 37 40 07 03 8F 45 07 00 37 40 07 02 17 FC 00 0D 07 02 17 42 01 1D 4D 07 03 77 FF 00 02 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 02 07 03 77 01 5E 07 03 77 FF 00 0D 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 02 07 03 77 07 02 17 FF 00 02 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 03 07 03 77 07 02 17 01 FF 00 1E 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 02 07 03 77 07 02 17 42 07 00 1C FF 00 00 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 02 07 03 77 07 02 17 47 07 00 37 40 01 FF 00 03 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 00 00 FC 00 12 07 03 A2 42 01 1C 4D 07 02 C6 FF 00 02 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 01 5E 07 02 C6 FF 00 10 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 77 FF 00 02 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 03 07 02 C6 07 03 77 01 FF 00 1F 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 77 42 07 00 37 FF 00 00 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 77 45 07 00 37 FF 00 00 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 A2 FF 00 0B 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 A2 FF 00 02 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 03 07 02 C6 07 03 A2 01 FF 00 1D 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 A2 42 07 00 37 FF 00 00 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 A2 45 07 00 37 FF 00 00 00 02 07 00 03 07 02 11 00 00 FF 00 00 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 00 02 07 03 89 07 02 13 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 01 07 00 03 00 02 07 02 C6 07 03 B9 FF 00 01 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 04 08 04 E5 08 04 E5 07 00 87 01 FF 00 01 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 01 07 03 77 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 C6 FF 00 01 00 01 07 00 03 00 03 08 00 72 08 00 72 07 02 17 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 0B 07 00 03 07 00 87 01 07 00 87 00 00 00 00 00 00 07 02 C6 00 01 07 03 77 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 01 FF 00 01 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 07 03 77 00 01 01 FF 00 01 00 01 07 00 03 00 02 07 02 C6 07 02 17 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 02 07 03 77 07 02 17 FF 00 01 00 0B 07 00 03 07 00 87 01 00 00 00 00 00 00 00 07 02 C6 00 01 07 00 87 FF 00 01 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 00 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 02 17 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 0D 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 01 07 02 C6 07 03 77 07 02 17 00 00 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 02 07 00 03 07 02 B8 00 02 07 00 03 07 02 C6 FF 00 01 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 77 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 0B 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 07 02 11 07 02 13 00 07 02 C6 00 01 07 03 77 FF 00 01 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 01 07 02 C6 FF 00 01 00 01 07 00 03 00 04 07 02 C6 07 03 B9 07 03 B9 01 FF 00 01 00 0C 07 00 03 07 00 87 01 07 00 87 07 03 77 01 07 00 8D 00 00 00 07 02 C6 07 03 A2 00 02 07 02 C6 07 03 A2 FF 00 01 00 01 07 00 03 00 01 07 00 16 43 05 44 07 00 16 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  113    182    282    298    Ljava/io/IOException;
        //  183    279    282    298    Ljava/io/IOException;
        //  8      20     2061   2069   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2061   2069   2061   2069   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2077   2079   3      8      Any
        //  34     41     41     42     Any
        //  34     41     34     35     Any
        //  34     41     34     35     Any
        //  34     41     41     42     Any
        //  34     41     41     42     Ljava/lang/NumberFormatException;
        //  91     98     98     99     Any
        //  92     98     91     92     Ljava/util/NoSuchElementException;
        //  91     98     3      8      Any
        //  91     98     91     92     Ljava/lang/NumberFormatException;
        //  91     98     3      8      Ljava/lang/IllegalStateException;
        //  103    109    109    110    Any
        //  103    109    109    110    Ljava/lang/NegativeArraySizeException;
        //  103    109    3      8      Ljava/lang/ClassCastException;
        //  103    109    109    110    Any
        //  103    109    3      8      Any
        //  171    178    178    179    Any
        //  172    178    178    179    Any
        //  172    178    171    172    Any
        //  172    178    3      8      Any
        //  172    178    171    172    Ljava/lang/RuntimeException;
        //  183    189    189    190    Any
        //  183    189    3      8      Any
        //  183    189    3      8      Ljava/lang/ClassCastException;
        //  183    189    3      8      Ljava/lang/UnsupportedOperationException;
        //  183    189    189    190    Any
        //  205    212    212    213    Any
        //  206    212    205    206    Any
        //  206    212    205    206    Any
        //  206    212    3      8      Ljava/lang/AssertionError;
        //  206    212    212    213    Any
        //  271    278    278    279    Any
        //  272    278    278    279    Ljava/util/ConcurrentModificationException;
        //  271    278    278    279    Ljava/lang/EnumConstantNotPresentException;
        //  271    278    271    272    Any
        //  272    278    271    272    Any
        //  287    294    294    295    Any
        //  287    294    287    288    Any
        //  288    294    294    295    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  287    294    294    295    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  288    294    287    288    Any
        //  353    359    359    360    Any
        //  353    359    359    360    Ljava/lang/EnumConstantNotPresentException;
        //  353    359    3      8      Ljava/lang/IllegalStateException;
        //  353    359    3      8      Any
        //  353    359    359    360    Ljava/lang/StringIndexOutOfBoundsException;
        //  468    474    474    475    Any
        //  468    474    3      8      Any
        //  468    474    3      8      Any
        //  468    474    474    475    Any
        //  468    474    474    475    Any
        //  478    485    485    486    Any
        //  478    485    478    479    Any
        //  479    485    478    479    Any
        //  478    485    478    479    Any
        //  478    485    485    486    Ljava/lang/RuntimeException;
        //  1191   1198   1198   1199   Any
        //  1192   1198   1198   1199   Any
        //  1192   1198   1191   1192   Any
        //  1191   1198   3      8      Any
        //  1191   1198   1191   1192   Any
        //  1307   1314   1314   1315   Any
        //  1308   1314   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1308   1314   3      8      Any
        //  1307   1314   1314   1315   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1307   1314   1307   1308   Ljava/lang/ArithmeticException;
        //  1318   1325   1325   1326   Any
        //  1319   1325   1325   1326   Any
        //  1318   1325   1325   1326   Any
        //  1319   1325   1318   1319   Ljava/lang/IndexOutOfBoundsException;
        //  1319   1325   1325   1326   Any
        //  1385   1394   1394   1395   Any
        //  1385   1394   3      8      Ljava/lang/IllegalStateException;
        //  1386   1394   1385   1386   Any
        //  1386   1394   1394   1395   Any
        //  1386   1394   3      8      Any
        //  1402   1411   1411   1412   Any
        //  1403   1411   1411   1412   Any
        //  1402   1411   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1403   1411   1402   1403   Any
        //  1402   1411   3      8      Any
        //  1420   1429   1429   1430   Any
        //  1420   1429   1420   1421   Ljava/lang/UnsupportedOperationException;
        //  1421   1429   1420   1421   Ljava/util/ConcurrentModificationException;
        //  1421   1429   3      8      Ljava/lang/NullPointerException;
        //  1421   1429   1429   1430   Any
        //  1591   1598   1598   1599   Any
        //  1592   1598   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1592   1598   1598   1599   Any
        //  1592   1598   1591   1592   Any
        //  1591   1598   1591   1592   Ljava/lang/StringIndexOutOfBoundsException;
        //  1605   1612   1612   1613   Any
        //  1606   1612   1605   1606   Any
        //  1605   1612   1612   1613   Ljava/lang/IndexOutOfBoundsException;
        //  1605   1612   1605   1606   Any
        //  1606   1612   1612   1613   Ljava/lang/EnumConstantNotPresentException;
        //  1759   1768   1768   1769   Any
        //  1759   1768   1768   1769   Any
        //  1759   1768   1768   1769   Any
        //  1759   1768   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1760   1768   1759   1760   Ljava/lang/StringIndexOutOfBoundsException;
        //  1927   1934   1934   1935   Any
        //  1927   1934   1927   1928   Any
        //  1928   1934   1927   1928   Any
        //  1927   1934   1927   1928   Any
        //  1927   1934   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1983   1990   1990   1991   Any
        //  1983   1990   1983   1984   Any
        //  1983   1990   1983   1984   Ljava/lang/NullPointerException;
        //  1984   1990   1990   1991   Any
        //  1984   1990   1983   1984   Ljava/util/NoSuchElementException;
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
    
    @NotNull
    public fa2 c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          83
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            75
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            67
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //    28: dup            
        //    29: ifnonnull       57
        //    32: ldc_w           "\u2923\u1487\u8026\ub1da\uc48f\ue731\ub221"
        //    35: goto            39
        //    38: athrow         
        //    39: invokestatic    invokestatic   !!! ERROR
        //    42: goto            46
        //    45: athrow         
        //    46: goto            50
        //    49: athrow         
        //    50: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    53: goto            57
        //    56: athrow         
        //    57: areturn        
        //    58: pop            
        //    59: goto            24
        //    62: pop            
        //    63: aconst_null    
        //    64: goto            58
        //    67: dup            
        //    68: ifnull          58
        //    71: checkcast       Ljava/lang/Throwable;
        //    74: athrow         
        //    75: dup            
        //    76: ifnull          62
        //    79: checkcast       Ljava/lang/Throwable;
        //    82: athrow         
        //    83: aconst_null    
        //    84: athrow         
        //    StackMapTable: 00 11 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FC 00 03 07 00 03 FF 00 0D 00 00 00 01 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 45 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 42 07 00 37 FF 00 00 00 01 07 00 03 00 02 07 02 C6 07 02 17 45 07 00 37 40 07 02 C6 40 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     67     75     Any
        //  67     75     67     75     Ljava/lang/UnsupportedOperationException;
        //  83     85     3      8      Ljava/lang/UnsupportedOperationException;
        //  39     45     45     46     Any
        //  39     45     3      8      Any
        //  39     45     45     46     Any
        //  39     45     45     46     Ljava/lang/NullPointerException;
        //  39     45     3      8      Ljava/util/NoSuchElementException;
        //  49     56     56     57     Any
        //  49     56     49     50     Any
        //  50     56     49     50     Ljava/lang/IllegalArgumentException;
        //  49     56     56     57     Any
        //  49     56     49     50     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 33 out of bounds for length 33
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
    
    @NotNull
    public f0a 5() {
        return fbS.x(this, 1108351947);
    }
    
    static {
        throw t;
    }
    
    public boolean c(@NotNull final Block block) {
        return fbS.3S(this, 1457819636, block);
    }
    
    public void c(@NotNull final IBlockState p0, @NotNull final BlockPos p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          704
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            696
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            688
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           -1371863790
        //    35: goto            41
        //    38: ldc_w           -1187949747
        //    41: ldc_w           -1841859163
        //    44: ixor           
        //    45: lookupswitch {
        //          1007448247: 673
        //          1431358214: 38
        //          default: 72
        //        }
        //    72: aload_2        
        //    73: pop            
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            86
        //    80: ldc_w           1959651865
        //    83: goto            89
        //    86: ldc_w           873977609
        //    89: ldc_w           -177966645
        //    92: ixor           
        //    93: lookupswitch {
        //          -2119590958: 669
        //          1954090156: 86
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   124: getstatic       dev/nuker/pyro/fc.c:I
        //   127: ifge            136
        //   130: ldc_w           483284313
        //   133: goto            139
        //   136: ldc_w           1635429486
        //   139: ldc_w           -1376198717
        //   142: ixor           
        //   143: lookupswitch {
        //          -1321825638: 661
        //          -1291604210: 136
        //          default: 168
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.size:()I
        //   175: goto            179
        //   178: athrow         
        //   179: ldc_w           100000
        //   182: if_icmplt       200
        //   185: aload_0        
        //   186: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   189: goto            193
        //   192: athrow         
        //   193: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.clear:()V
        //   196: goto            200
        //   199: athrow         
        //   200: aload_1        
        //   201: goto            205
        //   204: athrow         
        //   205: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   210: goto            214
        //   213: athrow         
        //   214: getstatic       dev/nuker/pyro/fc.c:I
        //   217: ifge            226
        //   220: ldc_w           1387766040
        //   223: goto            229
        //   226: ldc_w           1075976058
        //   229: ldc_w           -1667626703
        //   232: ixor           
        //   233: lookupswitch {
        //          -835868631: 226
        //          -591913397: 260
        //          default: 663
        //        }
        //   260: getstatic       net/minecraft/init/Blocks.field_150350_a:Lnet/minecraft/block/Block;
        //   263: goto            267
        //   266: athrow         
        //   267: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   270: goto            274
        //   273: athrow         
        //   274: ifeq            278
        //   277: return         
        //   278: getstatic       dev/nuker/pyro/fc.1:I
        //   281: ifeq            290
        //   284: ldc_w           618858904
        //   287: goto            293
        //   290: ldc_w           -764300629
        //   293: ldc_w           1816677937
        //   296: ixor           
        //   297: lookupswitch {
        //          -2007223714: 290
        //          1219184553: 665
        //          default: 324
        //        }
        //   324: aload_0        
        //   325: aload_1        
        //   326: goto            330
        //   329: athrow         
        //   330: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   335: goto            339
        //   338: athrow         
        //   339: dup            
        //   340: pop            
        //   341: goto            345
        //   344: athrow         
        //   345: invokevirtual   dev/nuker/pyro/fa3.c:(Lnet/minecraft/block/Block;)Z
        //   348: goto            352
        //   351: athrow         
        //   352: ifeq            660
        //   355: new             Ldev/nuker/pyro/fa1;
        //   358: dup            
        //   359: new             Lnet/minecraft/util/math/Vec3d;
        //   362: dup            
        //   363: aload_2        
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   371: goto            375
        //   374: athrow         
        //   375: i2d            
        //   376: aload_2        
        //   377: goto            381
        //   380: athrow         
        //   381: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   384: goto            388
        //   387: athrow         
        //   388: i2d            
        //   389: getstatic       dev/nuker/pyro/fc.1:I
        //   392: ifeq            401
        //   395: ldc_w           1433230838
        //   398: goto            404
        //   401: ldc_w           1632695789
        //   404: ldc_w           -867216490
        //   407: ixor           
        //   408: lookupswitch {
        //          -1725821344: 401
        //          -1390434693: 436
        //          default: 677
        //        }
        //   436: aload_2        
        //   437: goto            441
        //   440: athrow         
        //   441: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   444: goto            448
        //   447: athrow         
        //   448: i2d            
        //   449: goto            453
        //   452: athrow         
        //   453: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   456: goto            460
        //   459: athrow         
        //   460: aload_1        
        //   461: getstatic       dev/nuker/pyro/fc.c:I
        //   464: ifge            473
        //   467: ldc_w           1141273389
        //   470: goto            476
        //   473: ldc_w           1497617842
        //   476: ldc_w           -442581387
        //   479: ixor           
        //   480: lookupswitch {
        //          -2003864023: 473
        //          -1583821480: 675
        //          default: 508
        //        }
        //   508: goto            512
        //   511: athrow         
        //   512: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   517: goto            521
        //   520: athrow         
        //   521: dup            
        //   522: pop            
        //   523: goto            527
        //   526: athrow         
        //   527: invokespecial   dev/nuker/pyro/fa1.<init>:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/block/Block;)V
        //   530: goto            534
        //   533: athrow         
        //   534: astore_3       
        //   535: aload_0        
        //   536: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   539: aload_3        
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            552
        //   546: ldc_w           -446792139
        //   549: goto            555
        //   552: ldc_w           -1613344958
        //   555: ldc_w           1666210220
        //   558: ixor           
        //   559: lookupswitch {
        //          -2045892711: 671
        //          1599851500: 552
        //          default: 584
        //        }
        //   584: goto            588
        //   587: athrow         
        //   588: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.contains:(Ljava/lang/Object;)Z
        //   591: goto            595
        //   594: athrow         
        //   595: ifne            660
        //   598: aload_0        
        //   599: getstatic       dev/nuker/pyro/fc.c:I
        //   602: ifge            611
        //   605: ldc_w           -1772811196
        //   608: goto            614
        //   611: ldc_w           -910217115
        //   614: ldc_w           -610971417
        //   617: ixor           
        //   618: lookupswitch {
        //          304767106: 644
        //          1304452259: 611
        //          default: 667
        //        }
        //   644: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   647: aload_3        
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //   655: goto            659
        //   658: athrow         
        //   659: pop            
        //   660: return         
        //   661: aconst_null    
        //   662: athrow         
        //   663: aconst_null    
        //   664: athrow         
        //   665: aconst_null    
        //   666: athrow         
        //   667: aconst_null    
        //   668: athrow         
        //   669: aconst_null    
        //   670: athrow         
        //   671: aconst_null    
        //   672: athrow         
        //   673: aconst_null    
        //   674: athrow         
        //   675: aconst_null    
        //   676: athrow         
        //   677: aconst_null    
        //   678: athrow         
        //   679: pop            
        //   680: goto            24
        //   683: pop            
        //   684: aconst_null    
        //   685: goto            679
        //   688: dup            
        //   689: ifnull          679
        //   692: checkcast       Ljava/lang/Throwable;
        //   695: athrow         
        //   696: dup            
        //   697: ifnull          683
        //   700: checkcast       Ljava/lang/Throwable;
        //   703: athrow         
        //   704: aconst_null    
        //   705: athrow         
        //    StackMapTable: 00 67 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FE 00 03 07 00 03 07 00 DD 07 00 CA 0D 42 01 1E 0D 42 01 1E 4F 07 02 3F FF 00 02 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 02 3F 01 5C 07 02 3F 42 07 00 2C 40 07 02 3F 45 07 00 37 40 01 4C 07 00 1E 40 07 02 3F 45 07 00 37 00 43 07 00 37 40 07 00 DD 47 07 00 37 40 07 02 13 4B 07 02 13 FF 00 02 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 02 13 01 5E 07 02 13 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 02 13 07 02 13 45 07 00 37 40 01 03 0B 42 01 1E 44 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 00 03 07 00 DD 47 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 00 03 07 02 13 44 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 02 07 00 03 07 02 13 45 07 00 37 40 01 4E 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 05 08 01 63 08 01 63 08 01 67 08 01 67 07 00 CA 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 05 08 01 63 08 01 63 08 01 67 08 01 67 01 44 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 06 08 01 63 08 01 63 08 01 67 08 01 67 03 07 00 CA 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 06 08 01 63 08 01 63 08 01 67 08 01 67 03 01 FF 00 0C 00 03 07 00 03 07 00 DD 07 00 CA 00 06 08 01 63 08 01 63 08 01 67 08 01 67 03 03 FF 00 02 00 03 07 00 03 07 00 DD 07 00 CA 00 07 08 01 63 08 01 63 08 01 67 08 01 67 03 03 01 FF 00 1F 00 03 07 00 03 07 00 DD 07 00 CA 00 06 08 01 63 08 01 63 08 01 67 08 01 67 03 03 43 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 07 08 01 63 08 01 63 08 01 67 08 01 67 03 03 07 00 CA 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 07 08 01 63 08 01 63 08 01 67 08 01 67 03 03 01 43 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 07 08 01 63 08 01 63 08 01 67 08 01 67 03 03 03 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 03 08 01 63 08 01 63 07 00 B1 FF 00 0C 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 00 DD FF 00 02 00 03 07 00 03 07 00 DD 07 00 CA 00 05 08 01 63 08 01 63 07 00 B1 07 00 DD 01 FF 00 1F 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 00 DD 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 00 DD 47 07 00 37 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 02 13 44 07 00 12 FF 00 00 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 02 13 45 07 00 37 40 07 00 9D FF 00 11 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 02 3F 07 00 9D FF 00 02 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 03 07 02 3F 07 00 9D 01 FF 00 1C 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 02 3F 07 00 9D FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 02 3F 07 00 9D 45 07 00 37 40 01 4F 07 00 03 FF 00 02 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 00 03 01 5D 07 00 03 46 07 00 37 FF 00 00 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 02 3F 07 00 9D 45 07 00 37 40 01 FA 00 00 40 07 02 3F 41 07 02 13 01 FF 00 01 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 01 07 00 03 FA 00 01 FF 00 01 00 04 07 00 03 07 00 DD 07 00 CA 07 00 9D 00 02 07 02 3F 07 00 9D FA 00 01 FF 00 01 00 03 07 00 03 07 00 DD 07 00 CA 00 04 08 01 63 08 01 63 07 00 B1 07 00 DD FF 00 01 00 03 07 00 03 07 00 DD 07 00 CA 00 06 08 01 63 08 01 63 08 01 67 08 01 67 03 03 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     688    696    Any
        //  688    696    688    696    Any
        //  704    706    3      8      Any
        //  171    178    178    179    Any
        //  172    178    171    172    Ljava/lang/IllegalStateException;
        //  171    178    178    179    Ljava/lang/UnsupportedOperationException;
        //  171    178    178    179    Ljava/lang/ClassCastException;
        //  172    178    178    179    Any
        //  192    199    199    200    Any
        //  193    199    192    193    Ljava/lang/IllegalStateException;
        //  193    199    199    200    Ljava/lang/IllegalArgumentException;
        //  192    199    192    193    Ljava/lang/UnsupportedOperationException;
        //  193    199    3      8      Ljava/util/NoSuchElementException;
        //  204    213    213    214    Any
        //  204    213    204    205    Any
        //  205    213    213    214    Ljava/lang/NegativeArraySizeException;
        //  204    213    213    214    Any
        //  204    213    3      8      Any
        //  266    273    273    274    Any
        //  267    273    3      8      Any
        //  266    273    273    274    Any
        //  266    273    266    267    Any
        //  266    273    3      8      Any
        //  329    338    338    339    Any
        //  329    338    338    339    Ljava/lang/ArithmeticException;
        //  329    338    329    330    Any
        //  329    338    329    330    Any
        //  330    338    329    330    Any
        //  344    351    351    352    Any
        //  345    351    344    345    Any
        //  345    351    351    352    Any
        //  345    351    351    352    Any
        //  344    351    351    352    Any
        //  367    374    374    375    Any
        //  368    374    367    368    Any
        //  367    374    367    368    Any
        //  368    374    367    368    Ljava/lang/StringIndexOutOfBoundsException;
        //  367    374    367    368    Any
        //  380    387    387    388    Any
        //  381    387    387    388    Any
        //  380    387    3      8      Any
        //  381    387    3      8      Any
        //  381    387    380    381    Any
        //  440    447    447    448    Any
        //  440    447    447    448    Ljava/lang/NumberFormatException;
        //  440    447    440    441    Any
        //  441    447    447    448    Ljava/lang/ArithmeticException;
        //  441    447    3      8      Any
        //  452    459    459    460    Any
        //  453    459    459    460    Any
        //  453    459    459    460    Any
        //  452    459    452    453    Ljava/lang/NumberFormatException;
        //  453    459    452    453    Any
        //  511    520    520    521    Any
        //  512    520    520    521    Any
        //  512    520    520    521    Any
        //  511    520    520    521    Any
        //  512    520    511    512    Any
        //  526    533    533    534    Any
        //  526    533    526    527    Ljava/util/NoSuchElementException;
        //  527    533    3      8      Any
        //  526    533    533    534    Any
        //  527    533    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  588    594    594    595    Any
        //  588    594    3      8      Any
        //  588    594    594    595    Ljava/lang/NullPointerException;
        //  588    594    594    595    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  588    594    594    595    Any
        //  651    658    658    659    Any
        //  651    658    658    659    Any
        //  652    658    658    659    Any
        //  651    658    651    652    Any
        //  652    658    658    659    Ljava/lang/NegativeArraySizeException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:600)
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
    
    @NotNull
    public f0d 1() {
        return fbS.fS(this, 697717842);
    }
    
    @NotNull
    public f0a 2() {
        return fbS.X(this, 1552203625);
    }
    
    public void 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          483
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            475
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            467
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: nop            
        //    25: new             Ljava/io/FileWriter;
        //    28: dup            
        //    29: ldc_w           "\u2920\u148a\u803b\ub190\uc492\ue725\ub221\uec05\udb3c\ue4ad\uadfe\u1e73\ueb22\uc7ed\u8c26\u83ae\u57af\u7dd2\ubf35\ucd18\u21d1\uc234\u60c7"
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            44
        //    38: ldc_w           641696510
        //    41: goto            47
        //    44: ldc_w           -1684199332
        //    47: ldc_w           966667022
        //    50: ixor           
        //    51: lookupswitch {
        //          530688496: 454
        //          1073960082: 44
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: goto            87
        //    86: athrow         
        //    87: goto            91
        //    90: athrow         
        //    91: invokespecial   java/io/FileWriter.<init>:(Ljava/lang/String;)V
        //    94: goto            98
        //    97: athrow         
        //    98: astore_1       
        //    99: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   102: aload_0        
        //   103: getstatic       dev/nuker/pyro/fc.0:I
        //   106: ifeq            115
        //   109: ldc_w           1674822421
        //   112: goto            118
        //   115: ldc_w           756447332
        //   118: ldc_w           1553480902
        //   121: ixor           
        //   122: lookupswitch {
        //          1061945299: 115
        //          1905149090: 148
        //          default: 448
        //        }
        //   148: getfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //   151: dup            
        //   152: ifnonnull       161
        //   155: ldc_w           -416603337
        //   158: goto            164
        //   161: ldc_w           -416603340
        //   164: ldc_w           1409737730
        //   167: ixor           
        //   168: tableswitch {
        //          1717276266: 192
        //          1717276267: 263
        //          default: 155
        //        }
        //   192: ldc_w           "\u2923\u1487\u8026\ub18d\uc4dc\ue731\ub221"
        //   195: goto            199
        //   198: athrow         
        //   199: invokestatic    invokestatic   !!! ERROR
        //   202: goto            206
        //   205: athrow         
        //   206: getstatic       dev/nuker/pyro/fc.1:I
        //   209: ifeq            218
        //   212: ldc_w           1362975490
        //   215: goto            221
        //   218: ldc_w           -928852707
        //   221: ldc_w           564139047
        //   224: ixor           
        //   225: lookupswitch {
        //          -597652546: 218
        //          1889357605: 450
        //          default: 252
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   259: goto            263
        //   262: athrow         
        //   263: aload_1        
        //   264: checkcast       Ljava/lang/Appendable;
        //   267: goto            271
        //   270: athrow         
        //   271: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //   274: goto            278
        //   277: athrow         
        //   278: getstatic       dev/nuker/pyro/fc.0:I
        //   281: ifeq            290
        //   284: ldc_w           -1353186307
        //   287: goto            293
        //   290: ldc_w           1088024687
        //   293: ldc_w           1646768533
        //   296: ixor           
        //   297: lookupswitch {
        //          -1076713391: 290
        //          -847269272: 452
        //          default: 324
        //        }
        //   324: aload_1        
        //   325: getstatic       dev/nuker/pyro/fc.c:I
        //   328: ifge            337
        //   331: ldc_w           436321397
        //   334: goto            340
        //   337: ldc_w           939048477
        //   340: ldc_w           643170092
        //   343: ixor           
        //   344: lookupswitch {
        //          296567089: 372
        //          1012155225: 337
        //          default: 456
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokevirtual   java/io/FileWriter.close:()V
        //   379: goto            383
        //   382: athrow         
        //   383: goto            445
        //   386: getstatic       dev/nuker/pyro/fc.c:I
        //   389: ifge            398
        //   392: ldc_w           480001463
        //   395: goto            401
        //   398: ldc_w           1984863721
        //   401: ldc_w           712220537
        //   404: ixor           
        //   405: lookupswitch {
        //          921674446: 398
        //          1547502224: 432
        //          default: 446
        //        }
        //   432: astore_1       
        //   433: aload_1        
        //   434: goto            438
        //   437: athrow         
        //   438: invokevirtual   java/io/IOException.printStackTrace:()V
        //   441: goto            445
        //   444: athrow         
        //   445: return         
        //   446: aconst_null    
        //   447: athrow         
        //   448: aconst_null    
        //   449: athrow         
        //   450: aconst_null    
        //   451: athrow         
        //   452: aconst_null    
        //   453: athrow         
        //   454: aconst_null    
        //   455: athrow         
        //   456: aconst_null    
        //   457: athrow         
        //   458: pop            
        //   459: goto            24
        //   462: pop            
        //   463: aconst_null    
        //   464: goto            458
        //   467: dup            
        //   468: ifnull          458
        //   471: checkcast       Ljava/lang/Throwable;
        //   474: athrow         
        //   475: dup            
        //   476: ifnull          462
        //   479: checkcast       Ljava/lang/Throwable;
        //   482: athrow         
        //   483: aconst_null    
        //   484: athrow         
        //    StackMapTable: 00 42 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FC 00 03 07 00 03 FF 00 13 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 FF 00 02 00 01 07 00 03 00 04 08 00 19 08 00 19 07 02 17 01 FF 00 1C 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 42 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 45 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 42 07 00 37 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 45 07 00 37 40 07 04 07 FF 00 10 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 00 03 FF 00 02 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 00 03 01 FF 00 1D 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 00 03 FF 00 06 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 02 C6 FF 00 05 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 02 C6 FF 00 02 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 01 FF 00 1B 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 02 C6 45 07 00 37 FF 00 00 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 45 07 00 37 FF 00 00 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 FF 00 0B 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 FF 00 02 00 02 07 00 03 07 04 07 00 04 07 02 C8 07 02 C6 07 02 17 01 FF 00 1E 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 42 07 00 2A FF 00 00 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 45 07 00 37 FF 00 00 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 02 C6 FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 04 1A 45 07 00 37 00 0B 42 01 1E 4C 07 04 07 FF 00 02 00 02 07 00 03 07 04 07 00 02 07 04 07 01 5F 07 04 07 42 07 00 16 40 07 04 07 45 07 00 37 00 FF 00 02 00 01 07 00 03 00 01 07 02 AB 4B 07 02 AB FF 00 02 00 01 07 00 03 00 02 07 02 AB 01 5E 07 02 AB FF 00 04 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 02 AB 00 01 07 02 AB 45 07 00 37 FF 00 00 00 02 07 00 03 07 02 11 00 00 FF 00 00 00 01 07 00 03 00 01 07 02 AB FF 00 01 00 02 07 00 03 07 04 07 00 02 07 02 C8 07 00 03 FF 00 01 00 02 07 00 03 07 04 07 00 03 07 02 C8 07 02 C6 07 02 17 01 FF 00 01 00 01 07 00 03 00 03 08 00 19 08 00 19 07 02 17 FF 00 01 00 02 07 00 03 07 04 07 00 01 07 04 07 FF 00 01 00 01 07 00 03 00 01 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     270    386    445    Ljava/io/IOException;
        //  271    383    386    445    Ljava/io/IOException;
        //  8      20     467    475    Ljava/lang/NegativeArraySizeException;
        //  467    475    467    475    Any
        //  483    485    3      8      Any
        //  79     86     86     87     Any
        //  79     86     79     80     Any
        //  80     86     79     80     Any
        //  79     86     3      8      Any
        //  79     86     3      8      Any
        //  90     97     97     98     Any
        //  90     97     90     91     Ljava/lang/IllegalStateException;
        //  91     97     90     91     Ljava/lang/AssertionError;
        //  91     97     3      8      Any
        //  90     97     3      8      Ljava/lang/RuntimeException;
        //  198    205    205    206    Any
        //  199    205    3      8      Any
        //  199    205    3      8      Ljava/lang/ArithmeticException;
        //  198    205    198    199    Any
        //  199    205    3      8      Any
        //  255    262    262    263    Any
        //  255    262    262    263    Ljava/lang/RuntimeException;
        //  255    262    3      8      Any
        //  255    262    3      8      Any
        //  255    262    255    256    Ljava/lang/NullPointerException;
        //  271    277    277    278    Any
        //  271    277    277    278    Ljava/lang/StringIndexOutOfBoundsException;
        //  271    277    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  271    277    277    278    Ljava/lang/StringIndexOutOfBoundsException;
        //  271    277    277    278    Any
        //  375    382    382    383    Any
        //  375    382    382    383    Ljava/lang/RuntimeException;
        //  375    382    382    383    Any
        //  375    382    382    383    Any
        //  375    382    375    376    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  438    444    444    445    Any
        //  438    444    3      8      Any
        //  438    444    444    445    Ljava/lang/StringIndexOutOfBoundsException;
        //  438    444    444    445    Any
        //  438    444    3      8      Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 142 out of bounds for length 142
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          241
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            233
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            225
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           492975498
        //    33: goto            39
        //    36: ldc_w           501377645
        //    39: ldc_w           -129855098
        //    42: ixor           
        //    43: lookupswitch {
        //          -450845684: 36
        //          -442434581: 68
        //          default: 212
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: getstatic       dev/nuker/pyro/fc.0:I
        //    73: ifeq            82
        //    76: ldc_w           -998439403
        //    79: goto            85
        //    82: ldc_w           2055125417
        //    85: ldc_w           905747540
        //    88: ixor           
        //    89: lookupswitch {
        //          -243164607: 82
        //          1333929469: 116
        //          default: 214
        //        }
        //   116: aload_2        
        //   117: aload_3        
        //   118: goto            122
        //   121: athrow         
        //   122: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   125: goto            129
        //   128: athrow         
        //   129: getstatic       dev/nuker/pyro/fc.c:I
        //   132: ifge            141
        //   135: ldc_w           -1326599225
        //   138: goto            144
        //   141: ldc_w           -138343682
        //   144: ldc_w           962623249
        //   147: ixor           
        //   148: lookupswitch {
        //          -1987197738: 141
        //          -828277265: 176
        //          default: 210
        //        }
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.clear:()V
        //   187: goto            191
        //   190: athrow         
        //   191: aload_0        
        //   192: getfield        dev/nuker/pyro/fa3.c:Lnet/minecraft/client/Minecraft;
        //   195: getfield        net/minecraft/client/Minecraft.field_71438_f:Lnet/minecraft/client/renderer/RenderGlobal;
        //   198: goto            202
        //   201: athrow         
        //   202: invokevirtual   net/minecraft/client/renderer/RenderGlobal.func_72712_a:()V
        //   205: goto            209
        //   208: athrow         
        //   209: return         
        //   210: aconst_null    
        //   211: athrow         
        //   212: aconst_null    
        //   213: athrow         
        //   214: aconst_null    
        //   215: athrow         
        //   216: pop            
        //   217: goto            24
        //   220: pop            
        //   221: aconst_null    
        //   222: goto            216
        //   225: dup            
        //   226: ifnull          216
        //   229: checkcast       Ljava/lang/Throwable;
        //   232: athrow         
        //   233: dup            
        //   234: ifnull          220
        //   237: checkcast       Ljava/lang/Throwable;
        //   240: athrow         
        //   241: aconst_null    
        //   242: athrow         
        //    StackMapTable: 00 21 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 04 07 00 03 01 07 00 C2 07 04 3F 00 00 0B 42 01 1C FF 00 0D 00 04 07 00 03 01 07 00 C2 07 04 3F 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 00 C2 07 04 3F 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 07 00 C2 07 04 3F 00 02 07 00 03 01 FF 00 04 00 00 00 01 07 00 37 FF 00 00 00 04 07 00 03 01 07 00 C2 07 04 3F 00 04 07 00 03 01 07 00 C2 07 04 3F 45 07 00 37 00 0B 42 01 1F 46 07 00 37 40 07 02 3F 45 07 00 37 00 49 07 00 37 40 07 04 3A 45 07 00 37 00 00 01 FF 00 01 00 04 07 00 03 01 07 00 C2 07 04 3F 00 02 07 00 03 01 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     225    233    Ljava/util/NoSuchElementException;
        //  225    233    225    233    Ljava/util/NoSuchElementException;
        //  241    243    3      8      Ljava/lang/IllegalArgumentException;
        //  122    128    128    129    Any
        //  122    128    128    129    Any
        //  122    128    3      8      Ljava/lang/UnsupportedOperationException;
        //  122    128    128    129    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  122    128    128    129    Any
        //  183    190    190    191    Any
        //  183    190    190    191    Ljava/util/NoSuchElementException;
        //  184    190    183    184    Any
        //  184    190    183    184    Any
        //  183    190    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  201    208    208    209    Any
        //  202    208    208    209    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  201    208    201    202    Any
        //  202    208    3      8      Ljava/lang/NegativeArraySizeException;
        //  201    208    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 79 out of bounds for length 79
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
    
    @NotNull
    public CopyOnWriteArrayList 6() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/fa3.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 37 FC 00 03 07 00 03 44 07 00 37 43 05 44 07 00 37 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void c(@NotNull final fa2 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            41
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            33
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1        
        //    17: pop            
        //    18: aload_0        
        //    19: aload_1        
        //    20: putfield        dev/nuker/pyro/fa3.c:Ldev/nuker/pyro/fa2;
        //    23: return         
        //    24: pop            
        //    25: goto            16
        //    28: pop            
        //    29: aconst_null    
        //    30: goto            24
        //    33: dup            
        //    34: ifnull          24
        //    37: checkcast       Ljava/lang/Throwable;
        //    40: athrow         
        //    41: dup            
        //    42: ifnull          28
        //    45: checkcast       Ljava/lang/Throwable;
        //    48: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 37 FD 00 03 07 00 03 07 02 C6 47 07 00 37 43 05 44 07 00 37 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      12     33     41     Any
        //  33     41     33     41     Ljava/lang/StringIndexOutOfBoundsException;
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
