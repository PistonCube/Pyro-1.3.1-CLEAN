// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.List;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f89 extends fH
{
    public boolean c;
    @NotNull
    public f0d c;
    @NotNull
    public f0d 0;
    @NotNull
    public f0d 1;
    @NotNull
    public f0d 2;
    @NotNull
    public f0a c;
    @NotNull
    public f0d 3;
    @NotNull
    public f0a 0;
    @NotNull
    public f0a 1;
    @NotNull
    public f0a 2;
    @NotNull
    public f0a 3;
    @NotNull
    public f0a 4;
    @Nullable
    public f8F c;
    @NotNull
    public BlockPos c;
    public float c;
    public float 0;
    public boolean 0;
    public f8b c;
    public List<f8b> c;
    
    @NotNull
    public f0d e() {
        return fbS.gc(this, 551261688);
    }
    
    public f8b c(final EntityPlayerSP p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1456
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1448
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1440
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: nop            
        //    25: aload_0        
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             344930569
        //    34: goto            39
        //    37: ldc             697370262
        //    39: ldc             -1862951510
        //    41: ixor           
        //    42: lookupswitch {
        //          -2072337245: 37
        //          -1184588996: 68
        //          default: 1425
        //        }
        //    68: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //    71: ifnull          79
        //    74: ldc             -425810166
        //    76: goto            81
        //    79: ldc             -425810165
        //    81: ldc             -879428696
        //    83: ixor           
        //    84: tableswitch {
        //          1511307588: 108
        //          1511307589: 1389
        //          default: 74
        //        }
        //   108: getstatic       dev/nuker/pyro/fc.1:I
        //   111: ifeq            119
        //   114: ldc             -1387921111
        //   116: goto            121
        //   119: ldc             -875697653
        //   121: ldc             -672998929
        //   123: ixor           
        //   124: lookupswitch {
        //          472855524: 152
        //          2057623750: 119
        //          default: 1407
        //        }
        //   152: aload_0        
        //   153: getstatic       dev/nuker/pyro/fc.1:I
        //   156: ifeq            164
        //   159: ldc             1621113201
        //   161: goto            166
        //   164: ldc             390121926
        //   166: ldc             -1966322198
        //   168: ixor           
        //   169: lookupswitch {
        //          -1651735508: 196
        //          -361991013: 164
        //          default: 1403
        //        }
        //   196: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   199: dup            
        //   200: ifnonnull       208
        //   203: ldc             -968294493
        //   205: goto            210
        //   208: ldc             -968294494
        //   210: ldc             1216353227
        //   212: ixor           
        //   213: tableswitch {
        //          496097488: 236
        //          496097489: 247
        //          default: 203
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   243: goto            247
        //   246: athrow         
        //   247: goto            251
        //   250: athrow         
        //   251: invokevirtual   dev/nuker/pyro/f8F.0:()Ljava/util/List;
        //   254: goto            258
        //   257: athrow         
        //   258: checkcast       Ljava/lang/Iterable;
        //   261: astore_2       
        //   262: iconst_0       
        //   263: istore_3       
        //   264: getstatic       dev/nuker/pyro/fc.1:I
        //   267: ifeq            275
        //   270: ldc             481534619
        //   272: goto            277
        //   275: ldc             778905605
        //   277: ldc             -1765361094
        //   279: ixor           
        //   280: lookupswitch {
        //          -1972037471: 275
        //          -1196715457: 308
        //          default: 1399
        //        }
        //   308: aload_2        
        //   309: getstatic       dev/nuker/pyro/fc.1:I
        //   312: ifeq            320
        //   315: ldc             74702401
        //   317: goto            322
        //   320: ldc             -558127020
        //   322: ldc             1506083775
        //   324: ixor           
        //   325: lookupswitch {
        //          -1452941035: 320
        //          1572265470: 1427
        //          default: 352
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   361: goto            365
        //   364: athrow         
        //   365: astore          4
        //   367: aload           4
        //   369: getstatic       dev/nuker/pyro/fc.1:I
        //   372: ifeq            380
        //   375: ldc             256628189
        //   377: goto            382
        //   380: ldc             -1144990871
        //   382: ldc             -859609293
        //   384: ixor           
        //   385: lookupswitch {
        //          -1014451474: 380
        //          1996731482: 412
        //          default: 1405
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokeinterface java/util/Iterator.hasNext:()Z
        //   421: goto            425
        //   424: athrow         
        //   425: ifne            433
        //   428: ldc             -80447492
        //   430: goto            435
        //   433: ldc             -80447491
        //   435: ldc             1122020970
        //   437: ixor           
        //   438: tableswitch {
        //          1940501292: 460
        //          1940501293: 464
        //          default: 428
        //        }
        //   460: aconst_null    
        //   461: goto            1340
        //   464: aload           4
        //   466: goto            470
        //   469: athrow         
        //   470: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   475: goto            479
        //   478: athrow         
        //   479: getstatic       dev/nuker/pyro/fc.c:I
        //   482: ifge            490
        //   485: ldc             321940517
        //   487: goto            492
        //   490: ldc             -1631823989
        //   492: ldc             -1452137007
        //   494: ixor           
        //   495: lookupswitch {
        //          -1192782418: 490
        //          -1170060812: 1429
        //          default: 520
        //        }
        //   520: astore          5
        //   522: getstatic       dev/nuker/pyro/fc.c:I
        //   525: ifge            533
        //   528: ldc             188673758
        //   530: goto            535
        //   533: ldc             1217971415
        //   535: ldc             -1098993663
        //   537: ixor           
        //   538: lookupswitch {
        //          -1254072609: 533
        //          -152668970: 564
        //          default: 1419
        //        }
        //   564: aload           4
        //   566: goto            570
        //   569: athrow         
        //   570: invokeinterface java/util/Iterator.hasNext:()Z
        //   575: goto            579
        //   578: athrow         
        //   579: ifne            629
        //   582: getstatic       dev/nuker/pyro/fc.0:I
        //   585: ifeq            593
        //   588: ldc             660246043
        //   590: goto            595
        //   593: ldc             952064309
        //   595: ldc             348925184
        //   597: ixor           
        //   598: lookupswitch {
        //          745763893: 624
        //          865510171: 593
        //          default: 1411
        //        }
        //   624: aload           5
        //   626: goto            1340
        //   629: aload           5
        //   631: checkcast       Ldev/nuker/pyro/f8b;
        //   634: astore          6
        //   636: iconst_0       
        //   637: istore          8
        //   639: aload           6
        //   641: goto            645
        //   644: athrow         
        //   645: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
        //   648: goto            652
        //   651: athrow         
        //   652: getstatic       dev/nuker/pyro/fc.1:I
        //   655: ifeq            663
        //   658: ldc             1854411626
        //   660: goto            665
        //   663: ldc             1437590965
        //   665: ldc             1435740357
        //   667: ixor           
        //   668: lookupswitch {
        //          3951984: 696
        //          991673263: 663
        //          default: 1393
        //        }
        //   696: aload_1        
        //   697: goto            701
        //   700: athrow         
        //   701: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   704: goto            708
        //   707: athrow         
        //   708: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   711: goto            715
        //   714: athrow         
        //   715: invokevirtual   net/minecraft/util/math/BlockPos.func_177951_i:(Lnet/minecraft/util/math/Vec3i;)D
        //   718: goto            722
        //   721: athrow         
        //   722: aload           6
        //   724: getstatic       dev/nuker/pyro/fc.0:I
        //   727: ifeq            735
        //   730: ldc             -601341611
        //   732: goto            737
        //   735: ldc             1638697802
        //   737: ldc             342864228
        //   739: ixor           
        //   740: lookupswitch {
        //          -934809551: 1417
        //          -707729773: 735
        //          default: 768
        //        }
        //   768: goto            772
        //   771: athrow         
        //   772: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //   775: goto            779
        //   778: athrow         
        //   779: getstatic       dev/nuker/pyro/fc.1:I
        //   782: ifeq            790
        //   785: ldc             -1474982141
        //   787: goto            792
        //   790: ldc             1672552880
        //   792: ldc             -1921277792
        //   794: ixor           
        //   795: lookupswitch {
        //          -509706060: 790
        //          627978147: 1391
        //          default: 820
        //        }
        //   820: aload_1        
        //   821: goto            825
        //   824: athrow         
        //   825: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   828: goto            832
        //   831: athrow         
        //   832: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   835: goto            839
        //   838: athrow         
        //   839: invokevirtual   net/minecraft/util/math/BlockPos.func_177951_i:(Lnet/minecraft/util/math/Vec3i;)D
        //   842: goto            846
        //   845: athrow         
        //   846: ldc2_w          0.9
        //   849: dmul           
        //   850: dadd           
        //   851: dstore          6
        //   853: aload           4
        //   855: goto            859
        //   858: athrow         
        //   859: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   864: goto            868
        //   867: athrow         
        //   868: getstatic       dev/nuker/pyro/fc.0:I
        //   871: ifeq            879
        //   874: ldc             1265967076
        //   876: goto            881
        //   879: ldc             1987082637
        //   881: ldc             -1949686997
        //   883: ixor           
        //   884: lookupswitch {
        //          -1061208881: 879
        //          -38118746: 912
        //          default: 1421
        //        }
        //   912: astore          8
        //   914: getstatic       dev/nuker/pyro/fc.0:I
        //   917: ifeq            925
        //   920: ldc             -599067714
        //   922: goto            927
        //   925: ldc             -583826107
        //   927: ldc             1419997941
        //   929: ixor           
        //   930: lookupswitch {
        //          -1997962933: 925
        //          -1986988112: 956
        //          default: 1413
        //        }
        //   956: aload           8
        //   958: checkcast       Ldev/nuker/pyro/f8b;
        //   961: astore          9
        //   963: iconst_0       
        //   964: istore          11
        //   966: getstatic       dev/nuker/pyro/fc.c:I
        //   969: ifge            977
        //   972: ldc             777949589
        //   974: goto            979
        //   977: ldc             -94136313
        //   979: ldc             2042845225
        //   981: ixor           
        //   982: lookupswitch {
        //          -2086617042: 1008
        //          1469958588: 977
        //          default: 1415
        //        }
        //  1008: aload           9
        //  1010: getstatic       dev/nuker/pyro/fc.c:I
        //  1013: ifge            1021
        //  1016: ldc             -2046372575
        //  1018: goto            1023
        //  1021: ldc             1745185714
        //  1023: ldc             900872737
        //  1025: ixor           
        //  1026: lookupswitch {
        //          -1279987968: 1021
        //          1572295059: 1052
        //          default: 1401
        //        }
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: aload_1        
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  1078: getstatic       dev/nuker/pyro/fc.1:I
        //  1081: ifeq            1089
        //  1084: ldc             -815846494
        //  1086: goto            1091
        //  1089: ldc             355097587
        //  1091: ldc             -1110886693
        //  1093: ixor           
        //  1094: lookupswitch {
        //          -1461490392: 1120
        //          1922440569: 1089
        //          default: 1423
        //        }
        //  1120: goto            1124
        //  1123: athrow         
        //  1124: invokevirtual   net/minecraft/util/math/BlockPos.func_177951_i:(Lnet/minecraft/util/math/Vec3i;)D
        //  1127: goto            1131
        //  1130: athrow         
        //  1131: aload           9
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: aload_1        
        //  1145: goto            1149
        //  1148: athrow         
        //  1149: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //  1152: goto            1156
        //  1155: athrow         
        //  1156: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  1159: getstatic       dev/nuker/pyro/fc.c:I
        //  1162: ifge            1170
        //  1165: ldc             1338663424
        //  1167: goto            1172
        //  1170: ldc             -107776959
        //  1172: ldc             -772055697
        //  1174: ixor           
        //  1175: lookupswitch {
        //          -1640939665: 1395
        //          -1100437861: 1170
        //          default: 1200
        //        }
        //  1200: goto            1204
        //  1203: athrow         
        //  1204: invokevirtual   net/minecraft/util/math/BlockPos.func_177951_i:(Lnet/minecraft/util/math/Vec3i;)D
        //  1207: goto            1211
        //  1210: athrow         
        //  1211: ldc2_w          0.9
        //  1214: dmul           
        //  1215: dadd           
        //  1216: dstore          9
        //  1218: dload           6
        //  1220: dload           9
        //  1222: goto            1226
        //  1225: athrow         
        //  1226: invokestatic    java/lang/Double.compare:(DD)I
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: ifle            1241
        //  1236: ldc             -1678843915
        //  1238: goto            1243
        //  1241: ldc             -1678843916
        //  1243: ldc             344661041
        //  1245: ixor           
        //  1246: tableswitch {
        //          516654984: 1268
        //          516654985: 1320
        //          default: 1236
        //        }
        //  1268: getstatic       dev/nuker/pyro/fc.1:I
        //  1271: ifeq            1279
        //  1274: ldc             -1556566028
        //  1276: goto            1281
        //  1279: ldc             486578140
        //  1281: ldc             -213683560
        //  1283: ixor           
        //  1284: lookupswitch {
        //          -297540284: 1312
        //          1350294892: 1279
        //          default: 1409
        //        }
        //  1312: aload           8
        //  1314: astore          5
        //  1316: dload           9
        //  1318: dstore          6
        //  1320: aload           4
        //  1322: goto            1326
        //  1325: athrow         
        //  1326: invokeinterface java/util/Iterator.hasNext:()Z
        //  1331: goto            1335
        //  1334: athrow         
        //  1335: ifne            853
        //  1338: aload           5
        //  1340: checkcast       Ldev/nuker/pyro/f8b;
        //  1343: areturn        
        //  1344: getstatic       dev/nuker/pyro/fc.0:I
        //  1347: ifeq            1355
        //  1350: ldc             811827275
        //  1352: goto            1357
        //  1355: ldc             1132255135
        //  1357: ldc             567520050
        //  1359: ixor           
        //  1360: lookupswitch {
        //          296758137: 1397
        //          1315671732: 1355
        //          default: 1388
        //        }
        //  1388: astore_2       
        //  1389: aconst_null    
        //  1390: areturn        
        //  1391: aconst_null    
        //  1392: athrow         
        //  1393: aconst_null    
        //  1394: athrow         
        //  1395: aconst_null    
        //  1396: athrow         
        //  1397: aconst_null    
        //  1398: athrow         
        //  1399: aconst_null    
        //  1400: athrow         
        //  1401: aconst_null    
        //  1402: athrow         
        //  1403: aconst_null    
        //  1404: athrow         
        //  1405: aconst_null    
        //  1406: athrow         
        //  1407: aconst_null    
        //  1408: athrow         
        //  1409: aconst_null    
        //  1410: athrow         
        //  1411: aconst_null    
        //  1412: athrow         
        //  1413: aconst_null    
        //  1414: athrow         
        //  1415: aconst_null    
        //  1416: athrow         
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: aconst_null    
        //  1420: athrow         
        //  1421: aconst_null    
        //  1422: athrow         
        //  1423: aconst_null    
        //  1424: athrow         
        //  1425: aconst_null    
        //  1426: athrow         
        //  1427: aconst_null    
        //  1428: athrow         
        //  1429: aconst_null    
        //  1430: athrow         
        //  1431: pop            
        //  1432: goto            24
        //  1435: pop            
        //  1436: aconst_null    
        //  1437: goto            1431
        //  1440: dup            
        //  1441: ifnull          1431
        //  1444: checkcast       Ljava/lang/Throwable;
        //  1447: athrow         
        //  1448: dup            
        //  1449: ifnull          1435
        //  1452: checkcast       Ljava/lang/Throwable;
        //  1455: athrow         
        //  1456: aconst_null    
        //  1457: athrow         
        //    StackMapTable: 00 C4 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FD 00 03 07 00 03 07 00 94 4C 07 00 03 FF 00 01 00 02 07 00 03 07 00 94 00 02 07 00 03 01 5C 07 00 03 05 04 41 01 1A 0A 41 01 1E 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 94 00 02 07 00 03 01 5D 07 00 03 46 07 00 60 44 07 00 60 FF 00 01 00 02 07 00 03 07 00 94 00 02 07 00 60 01 59 07 00 60 42 07 00 26 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 26 40 07 00 60 45 07 00 45 40 07 00 CD FD 00 10 07 00 65 01 41 01 1E 4B 07 00 65 FF 00 01 00 04 07 00 03 07 00 94 07 00 65 01 00 02 07 00 65 01 5D 07 00 65 42 07 00 2C 40 07 00 65 47 07 00 45 40 07 00 74 FF 00 0E 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 01 07 00 74 FF 00 01 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 02 07 00 74 01 5D 07 00 74 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 01 07 00 74 47 07 00 45 40 01 02 04 41 01 18 03 44 07 00 45 40 07 00 74 47 07 00 45 40 07 00 CF 4A 07 00 CF FF 00 01 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 02 07 00 CF 01 5B 07 00 CF FC 00 0C 07 00 CF 41 01 1C FF 00 04 00 00 00 01 07 00 45 FF 00 00 00 06 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 00 01 07 00 74 47 07 00 45 40 01 0D 41 01 1C 04 FF 00 0E 00 00 00 01 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 01 07 00 8C 45 07 00 45 40 07 00 9B 4A 07 00 9B FF 00 01 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 01 5E 07 00 9B 43 07 00 36 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 94 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 9B 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 99 45 07 00 45 40 03 FF 00 0C 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 8C FF 00 01 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 03 03 07 00 8C 01 FF 00 1E 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 8C 42 07 00 3C FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 8C 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 9B FF 00 0A 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 9B FF 00 01 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 01 FF 00 1B 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 9B 43 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 94 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 9B 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 99 45 07 00 45 FF 00 00 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 03 FF 00 06 00 07 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 00 00 44 07 00 45 40 07 00 74 47 07 00 45 40 07 00 CF 4A 07 00 CF FF 00 01 00 07 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 00 02 07 00 CF 01 5E 07 00 CF FC 00 0C 07 00 CF 41 01 1C FE 00 14 07 00 8C 00 01 41 01 1C 4C 07 00 8C FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 8C 01 5C 07 00 8C 42 07 00 3A 40 07 00 8C 45 07 00 45 40 07 00 9B 43 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 94 45 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 9B FF 00 0D 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 99 FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 07 00 9B 07 00 99 01 FF 00 1C 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 99 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 99 45 07 00 45 40 03 44 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 03 07 00 8C 45 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 03 07 00 9B 43 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 94 45 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 9B FF 00 0D 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 99 FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 04 03 07 00 9B 07 00 99 01 FF 00 1B 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 99 42 07 00 3C FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 99 45 07 00 45 FF 00 00 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 03 03 FF 00 0D 00 0A 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 03 01 00 01 07 00 45 FF 00 00 00 0A 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 03 01 00 02 03 03 45 07 00 45 40 01 02 04 41 01 18 0A 41 01 1E 07 44 07 00 45 40 07 00 74 47 07 00 45 40 01 FF 00 04 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 01 07 00 CF FF 00 03 00 02 07 00 03 07 00 94 00 01 07 00 22 4A 07 00 22 FF 00 01 00 02 07 00 03 07 00 94 00 02 07 00 22 01 5E 07 00 22 00 FF 00 01 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 9B 41 07 00 9B FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 03 03 07 00 9B 07 00 99 FF 00 01 00 02 07 00 03 07 00 94 00 01 07 00 22 FD 00 01 07 00 65 01 FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 01 07 00 8C FF 00 01 00 02 07 00 03 07 00 94 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 01 07 00 74 F8 00 01 FF 00 01 00 0A 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 03 01 00 00 FF 00 01 00 06 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 00 00 FD 00 01 03 07 00 CF FE 00 01 07 00 8C 00 01 FF 00 01 00 09 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 07 00 8C 00 01 00 02 03 07 00 8C F8 00 01 FF 00 01 00 07 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 00 01 07 00 CF FF 00 01 00 0B 07 00 03 07 00 94 07 00 65 01 07 00 74 07 00 CF 03 07 00 CF 07 00 8C 00 01 00 02 07 00 9B 07 00 99 FF 00 01 00 02 07 00 03 07 00 94 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 94 07 00 65 01 00 01 07 00 65 FF 00 01 00 05 07 00 03 07 00 94 07 00 65 01 07 00 74 00 01 07 00 CF FF 00 01 00 02 07 00 03 07 00 94 00 01 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     415    1344   1389   Ljava/lang/Exception;
        //  416    569    1344   1389   Ljava/lang/Exception;
        //  570    644    1344   1389   Ljava/lang/Exception;
        //  645    1123   1344   1389   Ljava/lang/Exception;
        //  1124   1344   1344   1389   Ljava/lang/Exception;
        //  8      20     1440   1448   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1440   1448   1440   1448   Ljava/lang/AssertionError;
        //  1456   1458   3      8      Any
        //  239    246    246    247    Any
        //  240    246    3      8      Any
        //  239    246    3      8      Any
        //  239    246    239    240    Ljava/lang/AssertionError;
        //  240    246    3      8      Ljava/util/ConcurrentModificationException;
        //  250    257    257    258    Any
        //  251    257    250    251    Ljava/lang/AssertionError;
        //  251    257    257    258    Any
        //  251    257    257    258    Ljava/lang/IndexOutOfBoundsException;
        //  250    257    257    258    Any
        //  355    364    364    365    Any
        //  355    364    3      8      Any
        //  356    364    355    356    Ljava/lang/RuntimeException;
        //  355    364    364    365    Any
        //  355    364    3      8      Ljava/lang/AssertionError;
        //  416    424    424    425    Any
        //  416    424    3      8      Any
        //  416    424    424    425    Ljava/lang/IllegalStateException;
        //  416    424    3      8      Any
        //  416    424    424    425    Any
        //  469    478    478    479    Any
        //  469    478    3      8      Any
        //  470    478    3      8      Ljava/lang/IllegalArgumentException;
        //  470    478    469    470    Any
        //  470    478    469    470    Ljava/util/ConcurrentModificationException;
        //  570    578    578    579    Any
        //  570    578    3      8      Ljava/lang/ArithmeticException;
        //  570    578    578    579    Any
        //  570    578    578    579    Ljava/lang/ClassCastException;
        //  570    578    3      8      Any
        //  645    651    651    652    Any
        //  645    651    651    652    Ljava/lang/IllegalArgumentException;
        //  645    651    651    652    Any
        //  645    651    3      8      Ljava/lang/UnsupportedOperationException;
        //  645    651    3      8      Ljava/lang/NegativeArraySizeException;
        //  700    707    707    708    Any
        //  700    707    3      8      Any
        //  701    707    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  700    707    707    708    Ljava/lang/UnsupportedOperationException;
        //  701    707    700    701    Ljava/lang/UnsupportedOperationException;
        //  714    721    721    722    Any
        //  714    721    714    715    Any
        //  714    721    714    715    Any
        //  714    721    721    722    Ljava/lang/AssertionError;
        //  715    721    721    722    Ljava/lang/NegativeArraySizeException;
        //  771    778    778    779    Any
        //  772    778    3      8      Any
        //  772    778    778    779    Ljava/util/ConcurrentModificationException;
        //  771    778    3      8      Any
        //  771    778    771    772    Ljava/lang/NumberFormatException;
        //  824    831    831    832    Any
        //  824    831    824    825    Any
        //  824    831    831    832    Any
        //  824    831    824    825    Ljava/lang/NumberFormatException;
        //  825    831    824    825    Any
        //  838    845    845    846    Any
        //  839    845    838    839    Ljava/lang/EnumConstantNotPresentException;
        //  838    845    838    839    Any
        //  838    845    838    839    Any
        //  838    845    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  858    867    867    868    Any
        //  859    867    858    859    Ljava/lang/UnsupportedOperationException;
        //  858    867    858    859    Any
        //  858    867    3      8      Ljava/lang/IllegalStateException;
        //  859    867    858    859    Any
        //  1055   1062   1062   1063   Any
        //  1056   1062   3      8      Any
        //  1056   1062   1055   1056   Ljava/lang/EnumConstantNotPresentException;
        //  1055   1062   3      8      Any
        //  1055   1062   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1067   1074   1074   1075   Any
        //  1068   1074   1067   1068   Any
        //  1067   1074   3      8      Ljava/lang/UnsupportedOperationException;
        //  1068   1074   3      8      Any
        //  1068   1074   1067   1068   Ljava/lang/EnumConstantNotPresentException;
        //  1124   1130   1130   1131   Any
        //  1124   1130   1130   1131   Any
        //  1124   1130   1130   1131   Any
        //  1124   1130   3      8      Ljava/lang/NegativeArraySizeException;
        //  1124   1130   1130   1131   Any
        //  1136   1143   1143   1144   Any
        //  1136   1143   1143   1144   Ljava/lang/NullPointerException;
        //  1136   1143   1136   1137   Any
        //  1136   1143   1136   1137   Ljava/lang/NumberFormatException;
        //  1137   1143   1143   1144   Any
        //  1148   1155   1155   1156   Any
        //  1149   1155   1148   1149   Ljava/lang/NullPointerException;
        //  1149   1155   3      8      Any
        //  1148   1155   1148   1149   Any
        //  1148   1155   1155   1156   Ljava/lang/NullPointerException;
        //  1203   1210   1210   1211   Any
        //  1203   1210   3      8      Ljava/lang/NumberFormatException;
        //  1204   1210   1210   1211   Any
        //  1203   1210   1203   1204   Ljava/lang/NumberFormatException;
        //  1204   1210   3      8      Ljava/lang/ClassCastException;
        //  1225   1232   1232   1233   Any
        //  1225   1232   1225   1226   Any
        //  1226   1232   1232   1233   Ljava/lang/ClassCastException;
        //  1226   1232   1225   1226   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1225   1232   1225   1226   Any
        //  1325   1334   1334   1335   Any
        //  1325   1334   1334   1335   Any
        //  1326   1334   1325   1326   Ljava/lang/IllegalStateException;
        //  1325   1334   1325   1326   Any
        //  1326   1334   1334   1335   Any
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
    
    public void 0(final boolean b) {
        fbS.4p(this, 1877585792, b);
    }
    
    @Nullable
    public f8F 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            27
        //    22: ldc             -443261057
        //    24: goto            29
        //    27: ldc             -1342291225
        //    29: ldc             -1455535803
        //    31: ixor           
        //    32: lookupswitch {
        //          1286215226: 65
        //          1806625171: 27
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //    64: areturn        
        //    65: aconst_null    
        //    66: athrow         
        //    67: pop            
        //    68: goto            16
        //    71: pop            
        //    72: aconst_null    
        //    73: goto            67
        //    76: dup            
        //    77: ifnull          67
        //    80: checkcast       Ljava/lang/Throwable;
        //    83: athrow         
        //    84: dup            
        //    85: ifnull          71
        //    88: checkcast       Ljava/lang/Throwable;
        //    91: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 45 FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 45 43 05 44 07 00 45 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     76     84     Any
        //  76     84     76     84     Any
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
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        public class f88 extends Lambda implements Function1
        {
            public f89 c;
            
            static {
                throw t;
            }
            
            public f88(final f89 c) {
                this.c = c;
                while (true) {
                    int n = 0;
                    Label_0018: {
                        if (fc.0 != 0) {
                            n = -433078048;
                            break Label_0018;
                        }
                        n = -524133327;
                    }
                    switch (n ^ 0x9E578C70) {
                        case 2021149840: {
                            continue;
                        }
                        case 2123747393: {
                            final int arity = 1;
                            while (true) {
                                int n2 = 0;
                                Label_0063: {
                                    if (fc.1 != 0) {
                                        n2 = -1243108566;
                                        break Label_0063;
                                    }
                                    n2 = -1390109487;
                                }
                                switch (n2 ^ 0x2184440C) {
                                    case -1597462165: {
                                        continue;
                                    }
                                    default: {
                                        super(arity);
                                        return;
                                    }
                                    case -1805390042: {
                                        throw null;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        default: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public Object invoke(final Object o) {
                return fbS.17(this, 319111367, o);
            }
            
            public void c(@NotNull final f8b p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          497
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.1:I
                //    12: ifgt            489
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            481
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: pop            
                //    26: aload_0        
                //    27: getfield        dev/nuker/pyro/f88.c:Ldev/nuker/pyro/f89;
                //    30: getstatic       dev/nuker/pyro/fc.0:I
                //    33: ifeq            41
                //    36: ldc             -1444964924
                //    38: goto            43
                //    41: ldc             -1597888959
                //    43: ldc             -479262954
                //    45: ixor           
                //    46: lookupswitch {
                //          798775889: 41
                //          1253085906: 466
                //          default: 72
                //        }
                //    72: aload_1        
                //    73: getstatic       dev/nuker/pyro/fc.c:I
                //    76: ifge            84
                //    79: ldc             -708349577
                //    81: goto            86
                //    84: ldc             -1613246345
                //    86: ldc             1881459022
                //    88: ixor           
                //    89: lookupswitch {
                //          -1511802823: 84
                //          -269280967: 116
                //          default: 464
                //        }
                //   116: goto            120
                //   119: athrow         
                //   120: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
                //   123: goto            127
                //   126: athrow         
                //   127: aload_1        
                //   128: getstatic       dev/nuker/pyro/fc.0:I
                //   131: ifeq            139
                //   134: ldc             1821671128
                //   136: goto            141
                //   139: ldc             -1778776358
                //   141: ldc             1671771663
                //   143: ixor           
                //   144: lookupswitch {
                //          254888151: 468
                //          2107608082: 139
                //          default: 172
                //        }
                //   172: goto            176
                //   175: athrow         
                //   176: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
                //   179: goto            183
                //   182: athrow         
                //   183: new             Ljava/awt/Color;
                //   186: dup            
                //   187: iconst_0       
                //   188: sipush          150
                //   191: sipush          255
                //   194: goto            198
                //   197: athrow         
                //   198: invokespecial   java/awt/Color.<init>:(III)V
                //   201: goto            205
                //   204: athrow         
                //   205: goto            209
                //   208: athrow         
                //   209: invokevirtual   java/awt/Color.getRGB:()I
                //   212: goto            216
                //   215: athrow         
                //   216: getstatic       dev/nuker/pyro/fc.c:I
                //   219: ifge            227
                //   222: ldc             -1277861709
                //   224: goto            229
                //   227: ldc             -1067163285
                //   229: ldc             886975290
                //   231: ixor           
                //   232: lookupswitch {
                //          -2029302903: 227
                //          -189117871: 260
                //          default: 470
                //        }
                //   260: goto            264
                //   263: athrow         
                //   264: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;I)V
                //   267: goto            271
                //   270: athrow         
                //   271: getstatic       dev/nuker/pyro/fc.1:I
                //   274: ifeq            282
                //   277: ldc             -1025747707
                //   279: goto            284
                //   282: ldc             -2043651785
                //   284: ldc             -976489182
                //   286: ixor           
                //   287: lookupswitch {
                //          -1342548540: 282
                //          118988839: 460
                //          default: 312
                //        }
                //   312: aload_0        
                //   313: getfield        dev/nuker/pyro/f88.c:Ldev/nuker/pyro/f89;
                //   316: goto            320
                //   319: athrow         
                //   320: invokevirtual   dev/nuker/pyro/f89.8:()Ldev/nuker/pyro/f0a;
                //   323: goto            327
                //   326: athrow         
                //   327: goto            331
                //   330: athrow         
                //   331: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
                //   334: goto            338
                //   337: athrow         
                //   338: checkcast       Ljava/lang/Boolean;
                //   341: goto            345
                //   344: athrow         
                //   345: invokevirtual   java/lang/Boolean.booleanValue:()Z
                //   348: goto            352
                //   351: athrow         
                //   352: ifeq            459
                //   355: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
                //   358: aload_1        
                //   359: getstatic       dev/nuker/pyro/fc.0:I
                //   362: ifeq            370
                //   365: ldc             -727189140
                //   367: goto            372
                //   370: ldc             -2112042122
                //   372: ldc             -490925959
                //   374: ixor           
                //   375: lookupswitch {
                //          907733269: 462
                //          1540466727: 370
                //          default: 400
                //        }
                //   400: goto            404
                //   403: athrow         
                //   404: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
                //   407: goto            411
                //   410: athrow         
                //   411: new             Ljava/awt/Color;
                //   414: dup            
                //   415: iconst_0       
                //   416: sipush          150
                //   419: sipush          255
                //   422: bipush          100
                //   424: goto            428
                //   427: athrow         
                //   428: invokespecial   java/awt/Color.<init>:(IIII)V
                //   431: goto            435
                //   434: athrow         
                //   435: goto            439
                //   438: athrow         
                //   439: invokevirtual   java/awt/Color.getRGB:()I
                //   442: goto            446
                //   445: athrow         
                //   446: bipush          63
                //   448: goto            452
                //   451: athrow         
                //   452: invokevirtual   dev/nuker/pyro/fbr.c:(Lnet/minecraft/util/math/BlockPos;II)V
                //   455: goto            459
                //   458: athrow         
                //   459: return         
                //   460: aconst_null    
                //   461: athrow         
                //   462: aconst_null    
                //   463: athrow         
                //   464: aconst_null    
                //   465: athrow         
                //   466: aconst_null    
                //   467: athrow         
                //   468: aconst_null    
                //   469: athrow         
                //   470: aconst_null    
                //   471: athrow         
                //   472: pop            
                //   473: goto            24
                //   476: pop            
                //   477: aconst_null    
                //   478: goto            472
                //   481: dup            
                //   482: ifnull          472
                //   485: checkcast       Ljava/lang/Throwable;
                //   488: athrow         
                //   489: dup            
                //   490: ifnull          476
                //   493: checkcast       Ljava/lang/Throwable;
                //   496: athrow         
                //   497: aconst_null    
                //   498: athrow         
                //    StackMapTable: 00 51 43 07 00 4C 04 FF 00 0B 00 00 00 01 07 00 4C FD 00 03 07 00 03 07 00 56 50 07 00 09 FF 00 01 00 02 07 00 03 07 00 56 00 02 07 00 09 01 5C 07 00 09 FF 00 0B 00 02 07 00 03 07 00 56 00 02 07 00 09 07 00 56 FF 00 01 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 56 01 FF 00 1D 00 02 07 00 03 07 00 56 00 02 07 00 09 07 00 56 42 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 02 07 00 09 07 00 56 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 02 07 00 09 07 00 92 FF 00 0B 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 92 07 00 56 FF 00 01 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 56 01 FF 00 1E 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 92 07 00 56 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 92 07 00 56 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 92 07 00 92 4D 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 08 07 00 09 07 00 92 07 00 92 08 00 B7 08 00 B7 01 01 01 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 07 00 62 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 07 00 62 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 01 FF 00 0A 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 01 FF 00 01 00 02 07 00 03 07 00 56 00 05 07 00 09 07 00 92 07 00 92 01 01 FF 00 1E 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 01 42 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 01 45 07 00 4C 00 0A 41 01 1B 46 07 00 3E 40 07 00 09 45 07 00 4C 40 07 00 78 42 07 00 4C 40 07 00 78 45 07 00 4C 40 07 00 94 45 07 00 46 40 07 00 7E 45 07 00 4C 40 01 FF 00 11 00 02 07 00 03 07 00 56 00 02 07 00 84 07 00 56 FF 00 01 00 02 07 00 03 07 00 56 00 03 07 00 84 07 00 56 01 FF 00 1B 00 02 07 00 03 07 00 56 00 02 07 00 84 07 00 56 42 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 02 07 00 84 07 00 56 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 02 07 00 84 07 00 92 4F 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 08 07 00 84 07 00 92 08 01 9B 08 01 9B 01 01 01 01 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 03 07 00 84 07 00 92 07 00 62 42 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 03 07 00 84 07 00 92 07 00 62 45 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 03 07 00 84 07 00 92 01 FF 00 04 00 00 00 01 07 00 4C FF 00 00 00 02 07 00 03 07 00 56 00 04 07 00 84 07 00 92 01 01 45 07 00 4C 00 00 FF 00 01 00 02 07 00 03 07 00 56 00 02 07 00 84 07 00 56 FF 00 01 00 02 07 00 03 07 00 56 00 02 07 00 09 07 00 56 41 07 00 09 FF 00 01 00 02 07 00 03 07 00 56 00 03 07 00 09 07 00 92 07 00 56 FF 00 01 00 02 07 00 03 07 00 56 00 04 07 00 09 07 00 92 07 00 92 01 41 07 00 4C 43 05 44 07 00 4C 47 05 47 07 00 4C
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     481    489    Any
                //  481    489    481    489    Ljava/lang/IllegalStateException;
                //  497    499    3      8      Any
                //  119    126    126    127    Any
                //  119    126    3      8      Ljava/lang/NullPointerException;
                //  119    126    119    120    Ljava/lang/UnsupportedOperationException;
                //  119    126    119    120    Any
                //  120    126    3      8      Ljava/lang/UnsupportedOperationException;
                //  175    182    182    183    Any
                //  176    182    3      8      Ljava/lang/AssertionError;
                //  176    182    182    183    Ljava/lang/UnsupportedOperationException;
                //  176    182    175    176    Ljava/util/NoSuchElementException;
                //  175    182    3      8      Any
                //  197    204    204    205    Any
                //  198    204    3      8      Ljava/lang/NumberFormatException;
                //  197    204    197    198    Ljava/util/ConcurrentModificationException;
                //  197    204    197    198    Any
                //  198    204    204    205    Ljava/lang/IllegalArgumentException;
                //  208    215    215    216    Any
                //  209    215    208    209    Ljava/lang/IllegalStateException;
                //  209    215    215    216    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  208    215    3      8      Ljava/lang/NegativeArraySizeException;
                //  209    215    215    216    Any
                //  263    270    270    271    Any
                //  263    270    263    264    Any
                //  264    270    263    264    Any
                //  263    270    270    271    Ljava/util/NoSuchElementException;
                //  263    270    3      8      Any
                //  319    326    326    327    Any
                //  320    326    319    320    Ljava/util/ConcurrentModificationException;
                //  319    326    3      8      Any
                //  320    326    326    327    Any
                //  319    326    3      8      Any
                //  330    337    337    338    Any
                //  331    337    3      8      Any
                //  331    337    337    338    Any
                //  330    337    330    331    Any
                //  330    337    330    331    Any
                //  344    351    351    352    Any
                //  344    351    351    352    Any
                //  345    351    351    352    Ljava/lang/IllegalArgumentException;
                //  345    351    3      8      Ljava/lang/IllegalStateException;
                //  344    351    344    345    Ljava/lang/ClassCastException;
                //  403    410    410    411    Any
                //  404    410    3      8      Any
                //  403    410    403    404    Any
                //  403    410    403    404    Any
                //  403    410    403    404    Ljava/lang/UnsupportedOperationException;
                //  427    434    434    435    Any
                //  427    434    3      8      Ljava/lang/ArithmeticException;
                //  428    434    3      8      Any
                //  428    434    427    428    Any
                //  427    434    3      8      Ljava/lang/NegativeArraySizeException;
                //  438    445    445    446    Any
                //  438    445    438    439    Ljava/lang/IllegalStateException;
                //  439    445    445    446    Any
                //  439    445    3      8      Any
                //  438    445    438    439    Any
                //  452    458    458    459    Any
                //  452    458    3      8      Any
                //  452    458    3      8      Ljava/lang/EnumConstantNotPresentException;
                //  452    458    458    459    Any
                //  452    458    3      8      Ljava/util/NoSuchElementException;
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        public class f87 extends Lambda implements Function1
        {
            public f89 c;
            
            @Override
            public Object invoke(final Object o) {
                return fbS.1g(this, 633546096, o);
            }
            
            public void c(@NotNull final f8b f8b) {
                fbS.6R(this, 1482335037, f8b);
            }
            
            public f87(final f89 c) {
                this.c = c;
                super(1);
            }
            
            static {
                throw t;
            }
        }
        public class f86 extends Lambda implements Function1
        {
            public f89 c;
            
            @Override
            public Object invoke(final Object o) {
                return fbS.0Q(this, 1795992379, o);
            }
            
            public void c(@NotNull final f8b p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          285
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.0:I
                //    12: ifgt            277
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            269
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: pop            
                //    26: aload_0        
                //    27: getfield        dev/nuker/pyro/f86.c:Ldev/nuker/pyro/f89;
                //    30: getstatic       dev/nuker/pyro/fc.1:I
                //    33: ifeq            41
                //    36: ldc             -819428231
                //    38: goto            43
                //    41: ldc             -526770937
                //    43: ldc             -817680912
                //    45: ixor           
                //    46: lookupswitch {
                //          7055753: 41
                //          802762999: 72
                //          default: 252
                //        }
                //    72: aload_1        
                //    73: goto            77
                //    76: athrow         
                //    77: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
                //    80: goto            84
                //    83: athrow         
                //    84: aload_1        
                //    85: getstatic       dev/nuker/pyro/fc.0:I
                //    88: ifeq            96
                //    91: ldc             -1840473969
                //    93: goto            98
                //    96: ldc             840586695
                //    98: ldc             -136328267
                //   100: ixor           
                //   101: lookupswitch {
                //          -976904590: 128
                //          1704153914: 96
                //          default: 256
                //        }
                //   128: goto            132
                //   131: athrow         
                //   132: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
                //   135: goto            139
                //   138: athrow         
                //   139: getstatic       dev/nuker/pyro/fc.1:I
                //   142: ifeq            150
                //   145: ldc             -1666800548
                //   147: goto            152
                //   150: ldc             290201247
                //   152: ldc             -417420474
                //   154: ixor           
                //   155: lookupswitch {
                //          -162351655: 180
                //          2075660058: 150
                //          default: 254
                //        }
                //   180: getstatic       java/awt/Color.PINK:Ljava/awt/Color;
                //   183: dup            
                //   184: pop            
                //   185: goto            189
                //   188: athrow         
                //   189: invokevirtual   java/awt/Color.getRGB:()I
                //   192: goto            196
                //   195: athrow         
                //   196: getstatic       dev/nuker/pyro/fc.c:I
                //   199: ifge            207
                //   202: ldc             873634302
                //   204: goto            209
                //   207: ldc             295648442
                //   209: ldc             1440320984
                //   211: ixor           
                //   212: lookupswitch {
                //          1145483618: 240
                //          1640698918: 207
                //          default: 258
                //        }
                //   240: goto            244
                //   243: athrow         
                //   244: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;I)V
                //   247: goto            251
                //   250: athrow         
                //   251: return         
                //   252: aconst_null    
                //   253: athrow         
                //   254: aconst_null    
                //   255: athrow         
                //   256: aconst_null    
                //   257: athrow         
                //   258: aconst_null    
                //   259: athrow         
                //   260: pop            
                //   261: goto            24
                //   264: pop            
                //   265: aconst_null    
                //   266: goto            260
                //   269: dup            
                //   270: ifnull          260
                //   273: checkcast       Ljava/lang/Throwable;
                //   276: athrow         
                //   277: dup            
                //   278: ifnull          264
                //   281: checkcast       Ljava/lang/Throwable;
                //   284: athrow         
                //   285: aconst_null    
                //   286: athrow         
                //    StackMapTable: 00 29 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FD 00 03 07 00 03 07 00 38 50 07 00 09 FF 00 01 00 02 07 00 03 07 00 38 00 02 07 00 09 01 5C 07 00 09 43 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 02 07 00 09 07 00 38 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 02 07 00 09 07 00 59 FF 00 0B 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 38 FF 00 01 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 38 01 FF 00 1D 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 38 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 38 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 59 FF 00 0A 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 59 FF 00 01 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 FF 00 1B 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 59 FF 00 07 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 07 00 47 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 FF 00 0A 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 FF 00 01 00 02 07 00 03 07 00 38 00 05 07 00 09 07 00 59 07 00 59 01 01 FF 00 1E 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 45 07 00 2E 00 40 07 00 09 FF 00 01 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 59 FF 00 01 00 02 07 00 03 07 00 38 00 03 07 00 09 07 00 59 07 00 38 FF 00 01 00 02 07 00 03 07 00 38 00 04 07 00 09 07 00 59 07 00 59 01 41 07 00 2E 43 05 44 07 00 2E 47 05 47 07 00 2E
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     269    277    Ljava/lang/NumberFormatException;
                //  269    277    269    277    Ljava/lang/AssertionError;
                //  285    287    3      8      Ljava/lang/ArithmeticException;
                //  76     83     83     84     Any
                //  77     83     3      8      Ljava/util/ConcurrentModificationException;
                //  76     83     3      8      Any
                //  77     83     76     77     Any
                //  76     83     83     84     Ljava/lang/RuntimeException;
                //  131    138    138    139    Any
                //  131    138    138    139    Any
                //  131    138    3      8      Any
                //  132    138    131    132    Any
                //  132    138    131    132    Any
                //  189    195    195    196    Any
                //  189    195    3      8      Any
                //  189    195    195    196    Any
                //  189    195    3      8      Any
                //  189    195    3      8      Ljava/lang/UnsupportedOperationException;
                //  243    250    250    251    Any
                //  244    250    250    251    Ljava/lang/IllegalArgumentException;
                //  243    250    243    244    Any
                //  243    250    250    251    Any
                //  244    250    250    251    Any
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
            
            public f86(final f89 c) {
                this.c = c;
                super(1);
            }
            
            static {
                throw t;
            }
        }
        public class f85 extends Lambda implements Function1
        {
            public f89 c;
            
            public void c(@NotNull final f8b f8b) {
                fbS.6R(this, 1482335038, f8b);
            }
            
            static {
                throw t;
            }
            
            public f85(final f89 c) {
                this.c = c;
                super(1);
            }
            
            @Override
            public Object invoke(final Object o) {
                return fbS.1b(this, 1320980069, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4219
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            4211
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4203
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             1586820119
        //    36: goto            41
        //    39: ldc             -1335648289
        //    41: ldc             -251499920
        //    43: ixor           
        //    44: lookupswitch {
        //          -1349083545: 4154
        //          482123566: 39
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: ifnull          4087
        //    78: aload_0        
        //    79: getstatic       dev/nuker/pyro/fc.0:I
        //    82: ifeq            90
        //    85: ldc             -152235890
        //    87: goto            92
        //    90: ldc             -1451995020
        //    92: ldc             1672769680
        //    94: ixor           
        //    95: lookupswitch {
        //          -1789304802: 90
        //          -893378332: 120
        //          default: 4138
        //        }
        //   120: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   123: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   126: ifnull          4087
        //   129: aload_0        
        //   130: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   133: ifnull          141
        //   136: ldc             575068574
        //   138: goto            143
        //   141: ldc             575068573
        //   143: ldc             -1916334433
        //   145: ixor           
        //   146: tableswitch {
        //          1594076674: 168
        //          1594076675: 4087
        //          default: 136
        //        }
        //   168: getstatic       dev/nuker/pyro/fc.1:I
        //   171: ifeq            179
        //   174: ldc             -513264956
        //   176: goto            181
        //   179: ldc             -1458235171
        //   181: ldc             14851656
        //   183: ixor           
        //   184: lookupswitch {
        //          -1443395947: 212
        //          -511005556: 179
        //          default: 4102
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179141_d:()V
        //   219: goto            223
        //   222: athrow         
        //   223: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   226: iconst_1       
        //   227: getstatic       dev/nuker/pyro/fc.1:I
        //   230: ifeq            239
        //   233: ldc_w           1264992399
        //   236: goto            242
        //   239: ldc_w           -182562138
        //   242: ldc_w           -1450793757
        //   245: ixor           
        //   246: lookupswitch {
        //          -488577940: 4188
        //          473782202: 239
        //          default: 272
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   dev/nuker/pyro/fbr.c:(I)V
        //   279: goto            283
        //   282: athrow         
        //   283: ldc_w           1.5
        //   286: goto            290
        //   289: athrow         
        //   290: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187441_d:(F)V
        //   293: goto            297
        //   296: athrow         
        //   297: aload_0        
        //   298: getfield        dev/nuker/pyro/f89.4:Ldev/nuker/pyro/f0a;
        //   301: goto            305
        //   304: athrow         
        //   305: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   308: goto            312
        //   311: athrow         
        //   312: checkcast       Ljava/lang/Boolean;
        //   315: getstatic       dev/nuker/pyro/fc.c:I
        //   318: ifge            327
        //   321: ldc_w           -1071125290
        //   324: goto            330
        //   327: ldc_w           -1258686599
        //   330: ldc_w           1445095130
        //   333: ixor           
        //   334: lookupswitch {
        //          -1778021876: 327
        //          -488926813: 360
        //          default: 4156
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   367: goto            371
        //   370: athrow         
        //   371: ifeq            1748
        //   374: aload_0        
        //   375: getstatic       dev/nuker/pyro/fc.c:I
        //   378: ifge            387
        //   381: ldc_w           271484933
        //   384: goto            390
        //   387: ldc_w           941773072
        //   390: ldc_w           -1150163579
        //   393: ixor           
        //   394: lookupswitch {
        //          -1419809408: 4132
        //          -1085273708: 387
        //          default: 420
        //        }
        //   420: getfield        dev/nuker/pyro/f89.1:Ldev/nuker/pyro/f0a;
        //   423: goto            427
        //   426: athrow         
        //   427: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   430: goto            434
        //   433: athrow         
        //   434: checkcast       Ljava/lang/Boolean;
        //   437: goto            441
        //   440: athrow         
        //   441: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   444: goto            448
        //   447: athrow         
        //   448: ifeq            711
        //   451: aload_0        
        //   452: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   455: dup            
        //   456: ifnonnull       470
        //   459: goto            463
        //   462: athrow         
        //   463: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   466: goto            470
        //   469: athrow         
        //   470: goto            474
        //   473: athrow         
        //   474: invokevirtual   dev/nuker/pyro/f8F.i:()Ljava/util/List;
        //   477: goto            481
        //   480: athrow         
        //   481: astore_3       
        //   482: iconst_0       
        //   483: istore          4
        //   485: iconst_0       
        //   486: istore          5
        //   488: aload_3        
        //   489: monitorenter   
        //   490: nop            
        //   491: iconst_0       
        //   492: istore          6
        //   494: aload_0        
        //   495: aload_0        
        //   496: getstatic       dev/nuker/pyro/fc.0:I
        //   499: ifeq            508
        //   502: ldc_w           776622195
        //   505: goto            511
        //   508: ldc_w           734591428
        //   511: ldc_w           464643101
        //   514: ixor           
        //   515: lookupswitch {
        //          813243865: 540
        //          905688174: 508
        //          default: 4176
        //        }
        //   540: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   543: dup            
        //   544: ifnonnull       558
        //   547: goto            551
        //   550: athrow         
        //   551: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   554: goto            558
        //   557: athrow         
        //   558: getstatic       dev/nuker/pyro/fc.c:I
        //   561: ifge            570
        //   564: ldc_w           1278391963
        //   567: goto            573
        //   570: ldc_w           776766702
        //   573: ldc_w           -1054620220
        //   576: ixor           
        //   577: lookupswitch {
        //          -1928236193: 570
        //          -277921494: 604
        //          default: 4116
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokevirtual   dev/nuker/pyro/f8F.i:()Ljava/util/List;
        //   611: goto            615
        //   614: athrow         
        //   615: checkcast       Ljava/util/Collection;
        //   618: new             Ldev/nuker/pyro/f85;
        //   621: dup            
        //   622: getstatic       dev/nuker/pyro/fc.c:I
        //   625: ifge            634
        //   628: ldc_w           -96664052
        //   631: goto            637
        //   634: ldc_w           -523985244
        //   637: ldc_w           -1698346219
        //   640: ixor           
        //   641: lookupswitch {
        //          1626885401: 4160
        //          2004877073: 634
        //          default: 668
        //        }
        //   668: aload_0        
        //   669: goto            673
        //   672: athrow         
        //   673: invokespecial   dev/nuker/pyro/f85.<init>:(Ldev/nuker/pyro/f89;)V
        //   676: goto            680
        //   679: athrow         
        //   680: checkcast       Lkotlin/jvm/functions/Function1;
        //   683: goto            687
        //   686: athrow         
        //   687: invokespecial   dev/nuker/pyro/f89.c:(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
        //   690: goto            694
        //   693: athrow         
        //   694: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   697: astore          5
        //   699: aload_3        
        //   700: monitorexit    
        //   701: goto            711
        //   704: astore          5
        //   706: aload_3        
        //   707: monitorexit    
        //   708: aload           5
        //   710: athrow         
        //   711: aload_0        
        //   712: getfield        dev/nuker/pyro/f89.3:Ldev/nuker/pyro/f0a;
        //   715: goto            719
        //   718: athrow         
        //   719: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   722: goto            726
        //   725: athrow         
        //   726: checkcast       Ljava/lang/Boolean;
        //   729: goto            733
        //   732: athrow         
        //   733: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   736: goto            740
        //   739: athrow         
        //   740: ifeq            1319
        //   743: aload_0        
        //   744: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   747: dup            
        //   748: ifnonnull       762
        //   751: goto            755
        //   754: athrow         
        //   755: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   758: goto            762
        //   761: athrow         
        //   762: goto            766
        //   765: athrow         
        //   766: invokevirtual   dev/nuker/pyro/f8F.6:()Ljava/util/List;
        //   769: goto            773
        //   772: athrow         
        //   773: getstatic       dev/nuker/pyro/fc.c:I
        //   776: ifge            785
        //   779: ldc_w           1706349922
        //   782: goto            788
        //   785: ldc_w           588866805
        //   788: ldc_w           1033933935
        //   791: ixor           
        //   792: lookupswitch {
        //          129770232: 785
        //          1477722381: 4170
        //          default: 820
        //        }
        //   820: astore_3       
        //   821: iconst_0       
        //   822: getstatic       dev/nuker/pyro/fc.0:I
        //   825: ifeq            834
        //   828: ldc_w           898567002
        //   831: goto            837
        //   834: ldc_w           1662362586
        //   837: ldc_w           -1254780301
        //   840: ixor           
        //   841: lookupswitch {
        //          -2135254743: 4114
        //          995552570: 834
        //          default: 868
        //        }
        //   868: istore          4
        //   870: iconst_0       
        //   871: istore          5
        //   873: getstatic       dev/nuker/pyro/fc.c:I
        //   876: ifge            885
        //   879: ldc_w           -1771967753
        //   882: goto            888
        //   885: ldc_w           -1976762360
        //   888: ldc_w           1983980639
        //   891: ixor           
        //   892: lookupswitch {
        //          -534720856: 4144
        //          300153820: 885
        //          default: 920
        //        }
        //   920: aload_3        
        //   921: monitorenter   
        //   922: nop            
        //   923: iconst_0       
        //   924: istore          6
        //   926: getstatic       dev/nuker/pyro/fc.0:I
        //   929: ifeq            938
        //   932: ldc_w           -879472060
        //   935: goto            941
        //   938: ldc_w           -189846598
        //   941: ldc_w           -1008033642
        //   944: ixor           
        //   945: lookupswitch {
        //          142537426: 938
        //          927304492: 972
        //          default: 4190
        //        }
        //   972: aload_0        
        //   973: aload_0        
        //   974: getstatic       dev/nuker/pyro/fc.c:I
        //   977: ifge            986
        //   980: ldc_w           1841099726
        //   983: goto            989
        //   986: ldc_w           -2142409984
        //   989: ldc_w           602105352
        //   992: ixor           
        //   993: lookupswitch {
        //          1314887110: 4126
        //          1832030947: 986
        //          default: 1020
        //        }
        //  1020: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1023: dup            
        //  1024: ifnonnull       1033
        //  1027: ldc_w           1608315203
        //  1030: goto            1036
        //  1033: ldc_w           1608315200
        //  1036: ldc_w           1089510586
        //  1039: ixor           
        //  1040: tableswitch {
        //          1046010866: 1064
        //          1046010867: 1075
        //          default: 1027
        //        }
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: invokevirtual   dev/nuker/pyro/f8F.6:()Ljava/util/List;
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: checkcast       Ljava/util/Collection;
        //  1089: new             Ldev/nuker/pyro/f86;
        //  1092: dup            
        //  1093: aload_0        
        //  1094: getstatic       dev/nuker/pyro/fc.1:I
        //  1097: ifeq            1106
        //  1100: ldc_w           -1303829917
        //  1103: goto            1109
        //  1106: ldc_w           -773826838
        //  1109: ldc_w           1772381444
        //  1112: ixor           
        //  1113: lookupswitch {
        //          -605206681: 4124
        //          317869338: 1106
        //          default: 1140
        //        }
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: invokespecial   dev/nuker/pyro/f86.<init>:(Ldev/nuker/pyro/f89;)V
        //  1147: goto            1151
        //  1150: athrow         
        //  1151: checkcast       Lkotlin/jvm/functions/Function1;
        //  1154: getstatic       dev/nuker/pyro/fc.0:I
        //  1157: ifeq            1166
        //  1160: ldc_w           -86195215
        //  1163: goto            1169
        //  1166: ldc_w           -1996095688
        //  1169: ldc_w           -330680210
        //  1172: ixor           
        //  1173: lookupswitch {
        //          378993567: 1166
        //          1699727190: 1200
        //          default: 4148
        //        }
        //  1200: goto            1204
        //  1203: athrow         
        //  1204: invokespecial   dev/nuker/pyro/f89.c:(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
        //  1207: goto            1211
        //  1210: athrow         
        //  1211: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1214: getstatic       dev/nuker/pyro/fc.1:I
        //  1217: ifeq            1226
        //  1220: ldc_w           -2109810519
        //  1223: goto            1229
        //  1226: ldc_w           -1998622969
        //  1229: ldc_w           418426146
        //  1232: ixor           
        //  1233: lookupswitch {
        //          -1875918299: 1260
        //          -1697745525: 1226
        //          default: 4106
        //        }
        //  1260: astore          5
        //  1262: aload_3        
        //  1263: monitorexit    
        //  1264: goto            1319
        //  1267: astore          5
        //  1269: aload_3        
        //  1270: monitorexit    
        //  1271: getstatic       dev/nuker/pyro/fc.c:I
        //  1274: ifge            1283
        //  1277: ldc_w           616163630
        //  1280: goto            1286
        //  1283: ldc_w           62883173
        //  1286: ldc_w           1644286421
        //  1289: ixor           
        //  1290: lookupswitch {
        //          -80196785: 1283
        //          1186478331: 4162
        //          default: 1316
        //        }
        //  1316: aload           5
        //  1318: athrow         
        //  1319: aload_0        
        //  1320: getfield        dev/nuker/pyro/f89.2:Ldev/nuker/pyro/f0a;
        //  1323: getstatic       dev/nuker/pyro/fc.1:I
        //  1326: ifeq            1335
        //  1329: ldc_w           707650474
        //  1332: goto            1338
        //  1335: ldc_w           -688336597
        //  1338: ldc_w           -86034373
        //  1341: ixor           
        //  1342: lookupswitch {
        //          -789390447: 1335
        //          740813072: 1368
        //          default: 4168
        //        }
        //  1368: goto            1372
        //  1371: athrow         
        //  1372: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1375: goto            1379
        //  1378: athrow         
        //  1379: checkcast       Ljava/lang/Boolean;
        //  1382: goto            1386
        //  1385: athrow         
        //  1386: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1389: goto            1393
        //  1392: athrow         
        //  1393: ifeq            1748
        //  1396: aload_0        
        //  1397: getstatic       dev/nuker/pyro/fc.c:I
        //  1400: ifge            1409
        //  1403: ldc_w           -1838336578
        //  1406: goto            1412
        //  1409: ldc_w           591782254
        //  1412: ldc_w           -1433404082
        //  1415: ixor           
        //  1416: lookupswitch {
        //          37318208: 1409
        //          954386672: 4108
        //          default: 1444
        //        }
        //  1444: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1447: dup            
        //  1448: ifnonnull       1507
        //  1451: getstatic       dev/nuker/pyro/fc.c:I
        //  1454: ifge            1463
        //  1457: ldc_w           1267171098
        //  1460: goto            1466
        //  1463: ldc_w           551862284
        //  1466: ldc_w           1201759478
        //  1469: ixor           
        //  1470: lookupswitch {
        //          -1535826703: 1463
        //          203824108: 4128
        //          default: 1496
        //        }
        //  1496: goto            1500
        //  1499: athrow         
        //  1500: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1503: goto            1507
        //  1506: athrow         
        //  1507: getstatic       dev/nuker/pyro/fc.c:I
        //  1510: ifge            1519
        //  1513: ldc_w           -2114152875
        //  1516: goto            1522
        //  1519: ldc_w           -947907014
        //  1522: ldc_w           2044874059
        //  1525: ixor           
        //  1526: lookupswitch {
        //          -928482122: 1519
        //          -132195554: 4134
        //          default: 1552
        //        }
        //  1552: goto            1556
        //  1555: athrow         
        //  1556: invokevirtual   dev/nuker/pyro/f8F.r:()Ljava/util/List;
        //  1559: goto            1563
        //  1562: athrow         
        //  1563: astore_3       
        //  1564: iconst_0       
        //  1565: istore          4
        //  1567: iconst_0       
        //  1568: istore          5
        //  1570: aload_3        
        //  1571: monitorenter   
        //  1572: nop            
        //  1573: iconst_0       
        //  1574: istore          6
        //  1576: getstatic       dev/nuker/pyro/fc.c:I
        //  1579: ifge            1588
        //  1582: ldc_w           -346740231
        //  1585: goto            1591
        //  1588: ldc_w           -220849504
        //  1591: ldc_w           336378860
        //  1594: ixor           
        //  1595: lookupswitch {
        //          -544334496: 1588
        //          -10907115: 4142
        //          default: 1620
        //        }
        //  1620: aload_0        
        //  1621: aload_0        
        //  1622: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1625: dup            
        //  1626: ifnonnull       1640
        //  1629: goto            1633
        //  1632: athrow         
        //  1633: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1636: goto            1640
        //  1639: athrow         
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: invokevirtual   dev/nuker/pyro/f8F.r:()Ljava/util/List;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: checkcast       Ljava/util/Collection;
        //  1654: new             Ldev/nuker/pyro/f87;
        //  1657: dup            
        //  1658: aload_0        
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: invokespecial   dev/nuker/pyro/f87.<init>:(Ldev/nuker/pyro/f89;)V
        //  1666: goto            1670
        //  1669: athrow         
        //  1670: checkcast       Lkotlin/jvm/functions/Function1;
        //  1673: goto            1677
        //  1676: athrow         
        //  1677: invokespecial   dev/nuker/pyro/f89.c:(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
        //  1680: goto            1684
        //  1683: athrow         
        //  1684: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1687: astore          5
        //  1689: getstatic       dev/nuker/pyro/fc.1:I
        //  1692: ifeq            1701
        //  1695: ldc_w           1790863624
        //  1698: goto            1704
        //  1701: ldc_w           893052068
        //  1704: ldc_w           -1090183332
        //  1707: ixor           
        //  1708: lookupswitch {
        //          -1975518216: 1736
        //          -709134764: 1701
        //          default: 4158
        //        }
        //  1736: aload_3        
        //  1737: monitorexit    
        //  1738: goto            1748
        //  1741: astore          5
        //  1743: aload_3        
        //  1744: monitorexit    
        //  1745: aload           5
        //  1747: athrow         
        //  1748: aload_0        
        //  1749: aload_0        
        //  1750: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1753: dup            
        //  1754: ifnonnull       1815
        //  1757: getstatic       dev/nuker/pyro/fc.0:I
        //  1760: ifeq            1769
        //  1763: ldc_w           993305540
        //  1766: goto            1772
        //  1769: ldc_w           704657784
        //  1772: ldc_w           -343967083
        //  1775: ixor           
        //  1776: lookupswitch {
        //          -1949470609: 1769
        //          -800335535: 4182
        //          default: 1804
        //        }
        //  1804: goto            1808
        //  1807: athrow         
        //  1808: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1811: goto            1815
        //  1814: athrow         
        //  1815: getstatic       dev/nuker/pyro/fc.0:I
        //  1818: ifeq            1827
        //  1821: ldc_w           383052533
        //  1824: goto            1830
        //  1827: ldc_w           -449601172
        //  1830: ldc_w           811216904
        //  1833: ixor           
        //  1834: lookupswitch {
        //          -714501788: 1860
        //          646896381: 1827
        //          default: 4152
        //        }
        //  1860: goto            1864
        //  1863: athrow         
        //  1864: invokevirtual   dev/nuker/pyro/f8F.0:()Ljava/util/List;
        //  1867: goto            1871
        //  1870: athrow         
        //  1871: checkcast       Ljava/util/Collection;
        //  1874: new             Ldev/nuker/pyro/f88;
        //  1877: dup            
        //  1878: aload_0        
        //  1879: getstatic       dev/nuker/pyro/fc.c:I
        //  1882: ifge            1891
        //  1885: ldc_w           -14890711
        //  1888: goto            1894
        //  1891: ldc_w           665854542
        //  1894: ldc_w           213839693
        //  1897: ixor           
        //  1898: lookupswitch {
        //          -207477148: 4140
        //          804353411: 1891
        //          default: 1924
        //        }
        //  1924: goto            1928
        //  1927: athrow         
        //  1928: invokespecial   dev/nuker/pyro/f88.<init>:(Ldev/nuker/pyro/f89;)V
        //  1931: goto            1935
        //  1934: athrow         
        //  1935: checkcast       Lkotlin/jvm/functions/Function1;
        //  1938: getstatic       dev/nuker/pyro/fc.0:I
        //  1941: ifeq            1950
        //  1944: ldc_w           -1861304108
        //  1947: goto            1953
        //  1950: ldc_w           36581763
        //  1953: ldc_w           1449621235
        //  1956: ixor           
        //  1957: lookupswitch {
        //          -1177964786: 1950
        //          -949373401: 4166
        //          default: 1984
        //        }
        //  1984: goto            1988
        //  1987: athrow         
        //  1988: invokespecial   dev/nuker/pyro/f89.c:(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
        //  1991: goto            1995
        //  1994: athrow         
        //  1995: getstatic       dev/nuker/pyro/fc.0:I
        //  1998: ifeq            2007
        //  2001: ldc_w           -1429677893
        //  2004: goto            2010
        //  2007: ldc_w           1512640015
        //  2010: ldc_w           1171739919
        //  2013: ixor           
        //  2014: lookupswitch {
        //          -283144780: 2007
        //          536763136: 2040
        //          default: 4100
        //        }
        //  2040: aload_0        
        //  2041: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2044: dup            
        //  2045: ifnonnull       2054
        //  2048: ldc_w           -554656788
        //  2051: goto            2057
        //  2054: ldc_w           -554656787
        //  2057: ldc_w           -1293658638
        //  2060: ixor           
        //  2061: tableswitch {
        //          -668361668: 2084
        //          -668361667: 2095
        //          default: 2048
        //        }
        //  2084: goto            2088
        //  2087: athrow         
        //  2088: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2091: goto            2095
        //  2094: athrow         
        //  2095: goto            2099
        //  2098: athrow         
        //  2099: invokevirtual   dev/nuker/pyro/f8F.4:()Ldev/nuker/pyro/f8w;
        //  2102: goto            2106
        //  2105: athrow         
        //  2106: getstatic       dev/nuker/pyro/fc.c:I
        //  2109: ifge            2118
        //  2112: ldc_w           -1684788418
        //  2115: goto            2121
        //  2118: ldc_w           -71841722
        //  2121: ldc_w           444926375
        //  2124: ixor           
        //  2125: lookupswitch {
        //          -2129583463: 2118
        //          -516767263: 2152
        //          default: 4092
        //        }
        //  2152: astore_3       
        //  2153: aload_3        
        //  2154: ifnull          2565
        //  2157: getstatic       dev/nuker/pyro/fc.c:I
        //  2160: ifge            2169
        //  2163: ldc_w           -1383509766
        //  2166: goto            2172
        //  2169: ldc_w           53369292
        //  2172: ldc_w           583687128
        //  2175: ixor           
        //  2176: lookupswitch {
        //          -1891431646: 4150
        //          62888024: 2169
        //          default: 2204
        //        }
        //  2204: aload_3        
        //  2205: getstatic       dev/nuker/pyro/fc.1:I
        //  2208: ifeq            2217
        //  2211: ldc_w           2095539928
        //  2214: goto            2220
        //  2217: ldc_w           1777216849
        //  2220: ldc_w           1667108251
        //  2223: ixor           
        //  2224: lookupswitch {
        //          -363208180: 2217
        //          532245315: 4130
        //          default: 2252
        //        }
        //  2252: astore          4
        //  2254: aload           4
        //  2256: dup            
        //  2257: ifnull          2274
        //  2260: goto            2264
        //  2263: athrow         
        //  2264: invokevirtual   dev/nuker/pyro/f8w.2:()Ldev/nuker/pyro/f8w;
        //  2267: goto            2271
        //  2270: athrow         
        //  2271: goto            2276
        //  2274: pop            
        //  2275: aconst_null    
        //  2276: ifnull          2565
        //  2279: aload_0        
        //  2280: aload           4
        //  2282: getstatic       dev/nuker/pyro/fc.1:I
        //  2285: ifeq            2294
        //  2288: ldc_w           -1349309707
        //  2291: goto            2297
        //  2294: ldc_w           -235954857
        //  2297: ldc_w           2043646182
        //  2300: ixor           
        //  2301: lookupswitch {
        //          -698566125: 4104
        //          167895727: 2294
        //          default: 2328
        //        }
        //  2328: goto            2332
        //  2331: athrow         
        //  2332: invokevirtual   dev/nuker/pyro/f8w.2:()Ldev/nuker/pyro/f8w;
        //  2335: goto            2339
        //  2338: athrow         
        //  2339: dup            
        //  2340: ifnonnull       2349
        //  2343: ldc_w           -1624525699
        //  2346: goto            2352
        //  2349: ldc_w           -1624525702
        //  2352: ldc_w           1717792182
        //  2355: ixor           
        //  2356: tableswitch {
        //          -225332330: 2380
        //          -225332329: 2391
        //          default: 2343
        //        }
        //  2380: goto            2384
        //  2383: athrow         
        //  2384: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2387: goto            2391
        //  2390: athrow         
        //  2391: goto            2395
        //  2394: athrow         
        //  2395: invokevirtual   dev/nuker/pyro/f8w.c:()Lnet/minecraft/util/math/BlockPos;
        //  2398: goto            2402
        //  2401: athrow         
        //  2402: aload           4
        //  2404: goto            2408
        //  2407: athrow         
        //  2408: invokevirtual   dev/nuker/pyro/f8w.c:()Lnet/minecraft/util/math/BlockPos;
        //  2411: goto            2415
        //  2414: athrow         
        //  2415: new             Ljava/awt/Color;
        //  2418: dup            
        //  2419: iconst_0       
        //  2420: iconst_0       
        //  2421: sipush          150
        //  2424: goto            2428
        //  2427: athrow         
        //  2428: invokespecial   java/awt/Color.<init>:(III)V
        //  2431: goto            2435
        //  2434: athrow         
        //  2435: getstatic       dev/nuker/pyro/fc.c:I
        //  2438: ifge            2447
        //  2441: ldc_w           1098831095
        //  2444: goto            2450
        //  2447: ldc_w           -1333066874
        //  2450: ldc_w           984276197
        //  2453: ixor           
        //  2454: lookupswitch {
        //          -1977491613: 2480
        //          2077493266: 2447
        //          default: 4120
        //        }
        //  2480: goto            2484
        //  2483: athrow         
        //  2484: invokevirtual   java/awt/Color.getRGB:()I
        //  2487: goto            2491
        //  2490: athrow         
        //  2491: getstatic       dev/nuker/pyro/fc.c:I
        //  2494: ifge            2503
        //  2497: ldc_w           -583764189
        //  2500: goto            2506
        //  2503: ldc_w           -727797376
        //  2506: ldc_w           244639767
        //  2509: ixor           
        //  2510: lookupswitch {
        //          -744448204: 2503
        //          -636855913: 2536
        //          default: 4178
        //        }
        //  2536: goto            2540
        //  2539: athrow         
        //  2540: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;I)V
        //  2543: goto            2547
        //  2546: athrow         
        //  2547: aload           4
        //  2549: goto            2553
        //  2552: athrow         
        //  2553: invokevirtual   dev/nuker/pyro/f8w.2:()Ldev/nuker/pyro/f8w;
        //  2556: goto            2560
        //  2559: athrow         
        //  2560: astore          4
        //  2562: goto            2254
        //  2565: nop            
        //  2566: iconst_0       
        //  2567: istore          4
        //  2569: aload_0        
        //  2570: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2573: dup            
        //  2574: ifnonnull       2583
        //  2577: ldc_w           1710558636
        //  2580: goto            2586
        //  2583: ldc_w           1710558637
        //  2586: ldc_w           -1582821658
        //  2589: ixor           
        //  2590: tableswitch {
        //          -2001074540: 2612
        //          -2001074539: 2623
        //          default: 2577
        //        }
        //  2612: goto            2616
        //  2615: athrow         
        //  2616: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2619: goto            2623
        //  2622: athrow         
        //  2623: goto            2627
        //  2626: athrow         
        //  2627: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2630: goto            2634
        //  2633: athrow         
        //  2634: checkcast       Ljava/util/Collection;
        //  2637: goto            2641
        //  2640: athrow         
        //  2641: invokeinterface java/util/Collection.size:()I
        //  2646: goto            2650
        //  2649: athrow         
        //  2650: istore          5
        //  2652: iload           4
        //  2654: iload           5
        //  2656: if_icmpge       2665
        //  2659: ldc_w           -605218228
        //  2662: goto            2668
        //  2665: ldc_w           -605218227
        //  2668: ldc_w           1722597504
        //  2671: ixor           
        //  2672: tableswitch {
        //          2055452056: 2696
        //          2055452057: 3826
        //          default: 2659
        //        }
        //  2696: aload_0        
        //  2697: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2700: dup            
        //  2701: ifnonnull       2715
        //  2704: goto            2708
        //  2707: athrow         
        //  2708: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2711: goto            2715
        //  2714: athrow         
        //  2715: goto            2719
        //  2718: athrow         
        //  2719: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2722: goto            2726
        //  2725: athrow         
        //  2726: getstatic       dev/nuker/pyro/fc.c:I
        //  2729: ifge            2738
        //  2732: ldc_w           345564148
        //  2735: goto            2741
        //  2738: ldc_w           27916754
        //  2741: ldc_w           668391832
        //  2744: ixor           
        //  2745: lookupswitch {
        //          -129147590: 2738
        //          860764780: 4088
        //          default: 2772
        //        }
        //  2772: iload           4
        //  2774: goto            2778
        //  2777: athrow         
        //  2778: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2783: goto            2787
        //  2786: athrow         
        //  2787: checkcast       Ldev/nuker/pyro/f8b;
        //  2790: astore          6
        //  2792: aload_0        
        //  2793: aload           6
        //  2795: goto            2799
        //  2798: athrow         
        //  2799: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
        //  2802: goto            2806
        //  2805: athrow         
        //  2806: getstatic       dev/nuker/pyro/fc.c:I
        //  2809: ifge            2818
        //  2812: ldc_w           297560719
        //  2815: goto            2821
        //  2818: ldc_w           -1915337928
        //  2821: ldc_w           965381397
        //  2824: ixor           
        //  2825: lookupswitch {
        //          674686874: 4172
        //          1687209532: 2818
        //          default: 2852
        //        }
        //  2852: aload           6
        //  2854: goto            2858
        //  2857: athrow         
        //  2858: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //  2861: goto            2865
        //  2864: athrow         
        //  2865: getstatic       dev/nuker/pyro/fc.1:I
        //  2868: ifeq            2877
        //  2871: ldc_w           -326184467
        //  2874: goto            2880
        //  2877: ldc_w           1426514951
        //  2880: ldc_w           1485553092
        //  2883: ixor           
        //  2884: lookupswitch {
        //          -1274713047: 2877
        //          227367363: 2912
        //          default: 4184
        //        }
        //  2912: iload           4
        //  2914: aload_0        
        //  2915: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2918: dup            
        //  2919: ifnonnull       2928
        //  2922: ldc_w           1723048249
        //  2925: goto            2931
        //  2928: ldc_w           1723048230
        //  2931: ldc_w           -1368083850
        //  2934: ixor           
        //  2935: tableswitch {
        //          -1852954978: 2956
        //          -1852954977: 2967
        //          default: 2922
        //        }
        //  2956: goto            2960
        //  2959: athrow         
        //  2960: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2963: goto            2967
        //  2966: athrow         
        //  2967: goto            2971
        //  2970: athrow         
        //  2971: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  2974: goto            2978
        //  2977: athrow         
        //  2978: if_icmpge       2987
        //  2981: ldc_w           -1282761339
        //  2984: goto            2990
        //  2987: ldc_w           -1282761318
        //  2990: ldc_w           -1758783638
        //  2993: ixor           
        //  2994: tableswitch {
        //          1229133278: 3016
        //          1229133279: 3598
        //          default: 2981
        //        }
        //  3016: iconst_0       
        //  3017: sipush          200
        //  3020: iconst_0       
        //  3021: bipush          25
        //  3023: iconst_0       
        //  3024: getstatic       dev/nuker/pyro/fc.c:I
        //  3027: ifge            3036
        //  3030: ldc_w           2117768189
        //  3033: goto            3039
        //  3036: ldc_w           246331448
        //  3039: ldc_w           -2053605806
        //  3042: ixor           
        //  3043: lookupswitch {
        //          -1959342486: 3068
        //          -73210449: 3036
        //          default: 4186
        //        }
        //  3068: istore          7
        //  3070: getstatic       dev/nuker/pyro/fc.0:I
        //  3073: ifeq            3082
        //  3076: ldc_w           -2025817070
        //  3079: goto            3085
        //  3082: ldc_w           -1964617615
        //  3085: ldc_w           -743671228
        //  3088: ixor           
        //  3089: lookupswitch {
        //          1030885659: 3082
        //          1424754262: 4090
        //          default: 3116
        //        }
        //  3116: iload           4
        //  3118: aload_0        
        //  3119: getstatic       dev/nuker/pyro/fc.c:I
        //  3122: ifge            3131
        //  3125: ldc_w           -1434000016
        //  3128: goto            3134
        //  3131: ldc_w           -1020485216
        //  3134: ldc_w           -1800221481
        //  3137: ixor           
        //  3138: lookupswitch {
        //          1043605927: 3131
        //          1470000503: 3164
        //          default: 4174
        //        }
        //  3164: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  3167: dup            
        //  3168: ifnonnull       3182
        //  3171: goto            3175
        //  3174: athrow         
        //  3175: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3178: goto            3182
        //  3181: athrow         
        //  3182: goto            3186
        //  3185: athrow         
        //  3186: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  3189: goto            3193
        //  3192: athrow         
        //  3193: isub           
        //  3194: iconst_5       
        //  3195: imul           
        //  3196: istore          8
        //  3198: istore          18
        //  3200: istore          17
        //  3202: istore          16
        //  3204: istore          15
        //  3206: astore          12
        //  3208: getstatic       dev/nuker/pyro/fc.c:I
        //  3211: ifge            3220
        //  3214: ldc_w           -649283908
        //  3217: goto            3223
        //  3220: ldc_w           -1498253689
        //  3223: ldc_w           -817813843
        //  3226: ixor           
        //  3227: lookupswitch {
        //          369987601: 3220
        //          1777553450: 3252
        //          default: 4096
        //        }
        //  3252: astore          11
        //  3254: getstatic       dev/nuker/pyro/fc.0:I
        //  3257: ifeq            3266
        //  3260: ldc_w           -892382321
        //  3263: goto            3269
        //  3266: ldc_w           1684875148
        //  3269: ldc_w           -503154191
        //  3272: ixor           
        //  3273: lookupswitch {
        //          -668111837: 3266
        //          684534398: 4136
        //          default: 3300
        //        }
        //  3300: astore          10
        //  3302: iconst_0       
        //  3303: getstatic       dev/nuker/pyro/fc.c:I
        //  3306: ifge            3315
        //  3309: ldc_w           1882652751
        //  3312: goto            3318
        //  3315: ldc_w           88338544
        //  3318: ldc_w           2125023914
        //  3321: ixor           
        //  3322: lookupswitch {
        //          245254885: 4112
        //          1417497944: 3315
        //          default: 3348
        //        }
        //  3348: istore          9
        //  3350: iload           7
        //  3352: iload           8
        //  3354: goto            3358
        //  3357: athrow         
        //  3358: invokestatic    java/lang/Math.min:(II)I
        //  3361: goto            3365
        //  3364: athrow         
        //  3365: istore          19
        //  3367: aload           10
        //  3369: aload           11
        //  3371: getstatic       dev/nuker/pyro/fc.0:I
        //  3374: ifeq            3383
        //  3377: ldc_w           2131700594
        //  3380: goto            3386
        //  3383: ldc_w           -2111021405
        //  3386: ldc_w           1723993944
        //  3389: ixor           
        //  3390: lookupswitch {
        //          -1441231478: 3383
        //          432874538: 4164
        //          default: 3416
        //        }
        //  3416: aload           12
        //  3418: iload           15
        //  3420: iload           16
        //  3422: getstatic       dev/nuker/pyro/fc.0:I
        //  3425: ifeq            3434
        //  3428: ldc_w           -1915193074
        //  3431: goto            3437
        //  3434: ldc_w           1525484235
        //  3437: ldc_w           1679052958
        //  3440: ixor           
        //  3441: lookupswitch {
        //          -829833659: 3434
        //          -372495984: 4180
        //          default: 3468
        //        }
        //  3468: iload           17
        //  3470: iload           18
        //  3472: iload           19
        //  3474: isub           
        //  3475: istore          20
        //  3477: istore          21
        //  3479: getstatic       dev/nuker/pyro/fc.0:I
        //  3482: ifeq            3491
        //  3485: ldc_w           2032594031
        //  3488: goto            3494
        //  3491: ldc_w           1017815511
        //  3494: ldc_w           1689402896
        //  3497: ixor           
        //  3498: lookupswitch {
        //          -1555961387: 3491
        //          496292479: 4098
        //          default: 3524
        //        }
        //  3524: istore          22
        //  3526: istore          23
        //  3528: new             Ljava/awt/Color;
        //  3531: dup            
        //  3532: iload           23
        //  3534: iload           22
        //  3536: getstatic       dev/nuker/pyro/fc.c:I
        //  3539: ifge            3548
        //  3542: ldc_w           607115969
        //  3545: goto            3551
        //  3548: ldc_w           65994028
        //  3551: ldc_w           1966172400
        //  3554: ixor           
        //  3555: lookupswitch {
        //          -1310341032: 3548
        //          1360966193: 4094
        //          default: 3580
        //        }
        //  3580: iload           21
        //  3582: iload           20
        //  3584: goto            3588
        //  3587: athrow         
        //  3588: invokespecial   java/awt/Color.<init>:(IIII)V
        //  3591: goto            3595
        //  3594: athrow         
        //  3595: goto            3621
        //  3598: new             Ljava/awt/Color;
        //  3601: dup            
        //  3602: iconst_0       
        //  3603: sipush          255
        //  3606: iconst_0       
        //  3607: sipush          255
        //  3610: goto            3614
        //  3613: athrow         
        //  3614: invokespecial   java/awt/Color.<init>:(IIII)V
        //  3617: goto            3621
        //  3620: athrow         
        //  3621: goto            3625
        //  3624: athrow         
        //  3625: invokevirtual   java/awt/Color.getRGB:()I
        //  3628: goto            3632
        //  3631: athrow         
        //  3632: goto            3636
        //  3635: athrow         
        //  3636: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;I)V
        //  3639: goto            3643
        //  3642: athrow         
        //  3643: aload_0        
        //  3644: getstatic       dev/nuker/pyro/fc.c:I
        //  3647: ifge            3656
        //  3650: ldc_w           -897040477
        //  3653: goto            3659
        //  3656: ldc_w           -345077807
        //  3659: ldc_w           -428232907
        //  3662: ixor           
        //  3663: lookupswitch {
        //          219621604: 3688
        //          754028694: 3656
        //          default: 4192
        //        }
        //  3688: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f0a;
        //  3691: goto            3695
        //  3694: athrow         
        //  3695: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  3698: goto            3702
        //  3701: athrow         
        //  3702: checkcast       Ljava/lang/Boolean;
        //  3705: goto            3709
        //  3708: athrow         
        //  3709: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3712: goto            3716
        //  3715: athrow         
        //  3716: ifeq            3725
        //  3719: ldc_w           -2139102092
        //  3722: goto            3728
        //  3725: ldc_w           -2139102089
        //  3728: ldc_w           -1364196779
        //  3731: ixor           
        //  3732: tableswitch {
        //          1570753602: 3756
        //          1570753603: 3818
        //          default: 3719
        //        }
        //  3756: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //  3759: aload           6
        //  3761: goto            3765
        //  3764: athrow         
        //  3765: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //  3768: goto            3772
        //  3771: athrow         
        //  3772: new             Ljava/awt/Color;
        //  3775: dup            
        //  3776: iconst_0       
        //  3777: sipush          255
        //  3780: iconst_0       
        //  3781: bipush          100
        //  3783: goto            3787
        //  3786: athrow         
        //  3787: invokespecial   java/awt/Color.<init>:(IIII)V
        //  3790: goto            3794
        //  3793: athrow         
        //  3794: goto            3798
        //  3797: athrow         
        //  3798: invokevirtual   java/awt/Color.getRGB:()I
        //  3801: goto            3805
        //  3804: athrow         
        //  3805: bipush          63
        //  3807: goto            3811
        //  3810: athrow         
        //  3811: invokevirtual   dev/nuker/pyro/fbr.c:(Lnet/minecraft/util/math/BlockPos;II)V
        //  3814: goto            3818
        //  3817: athrow         
        //  3818: iinc            4, 1
        //  3821: goto            2652
        //  3824: astore          4
        //  3826: aload_0        
        //  3827: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  3830: astore          4
        //  3832: aload           4
        //  3834: ifnull          4027
        //  3837: getstatic       dev/nuker/pyro/fc.0:I
        //  3840: ifeq            3849
        //  3843: ldc_w           1851719832
        //  3846: goto            3852
        //  3849: ldc_w           -642837653
        //  3852: ldc_w           -2079409535
        //  3855: ixor           
        //  3856: lookupswitch {
        //          -363742695: 3849
        //          1570875882: 3884
        //          default: 4146
        //        }
        //  3884: aload_0        
        //  3885: aload           4
        //  3887: getstatic       dev/nuker/pyro/fc.1:I
        //  3890: ifeq            3899
        //  3893: ldc_w           -1454624440
        //  3896: goto            3902
        //  3899: ldc_w           131961261
        //  3902: ldc_w           -832875024
        //  3905: ixor           
        //  3906: lookupswitch {
        //          -913914787: 3932
        //          1729586360: 3899
        //          default: 4118
        //        }
        //  3932: goto            3936
        //  3935: athrow         
        //  3936: invokevirtual   dev/nuker/pyro/f8b.4:()Lnet/minecraft/util/math/BlockPos;
        //  3939: goto            3943
        //  3942: athrow         
        //  3943: aload           4
        //  3945: goto            3949
        //  3948: athrow         
        //  3949: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //  3952: goto            3956
        //  3955: athrow         
        //  3956: getstatic       dev/nuker/pyro/fc.0:I
        //  3959: ifeq            3968
        //  3962: ldc_w           -670959646
        //  3965: goto            3971
        //  3968: ldc_w           1039501558
        //  3971: ldc_w           1926859892
        //  3974: ixor           
        //  3975: lookupswitch {
        //          -1428653162: 4122
        //          1592572554: 3968
        //          default: 4000
        //        }
        //  4000: getstatic       java/awt/Color.MAGENTA:Ljava/awt/Color;
        //  4003: dup            
        //  4004: pop            
        //  4005: goto            4009
        //  4008: athrow         
        //  4009: invokevirtual   java/awt/Color.getRGB:()I
        //  4012: goto            4016
        //  4015: athrow         
        //  4016: goto            4020
        //  4019: athrow         
        //  4020: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;I)V
        //  4023: goto            4027
        //  4026: athrow         
        //  4027: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //  4030: getstatic       dev/nuker/pyro/fc.c:I
        //  4033: ifge            4042
        //  4036: ldc_w           -783912459
        //  4039: goto            4045
        //  4042: ldc_w           1017519995
        //  4045: ldc_w           986947018
        //  4048: ixor           
        //  4049: lookupswitch {
        //          -342496193: 4042
        //          108364465: 4076
        //          default: 4110
        //        }
        //  4076: goto            4080
        //  4079: athrow         
        //  4080: invokevirtual   dev/nuker/pyro/fbr.2:()V
        //  4083: goto            4087
        //  4086: athrow         
        //  4087: return         
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
        //  4190: aconst_null    
        //  4191: athrow         
        //  4192: aconst_null    
        //  4193: athrow         
        //  4194: pop            
        //  4195: goto            24
        //  4198: pop            
        //  4199: aconst_null    
        //  4200: goto            4194
        //  4203: dup            
        //  4204: ifnull          4194
        //  4207: checkcast       Ljava/lang/Throwable;
        //  4210: athrow         
        //  4211: dup            
        //  4212: ifnull          4198
        //  4215: checkcast       Ljava/lang/Throwable;
        //  4218: athrow         
        //  4219: aconst_null    
        //  4220: athrow         
        //    StackMapTable: 02 2F 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FE 00 03 07 00 03 07 02 27 02 4E 07 00 E6 FF 00 01 00 03 07 00 03 07 02 27 02 00 02 07 00 E6 01 5E 07 00 E6 51 07 00 03 FF 00 01 00 03 07 00 03 07 02 27 02 00 02 07 00 03 01 5B 07 00 03 0F 04 41 01 18 0A 41 01 1E 42 07 00 45 00 45 07 00 45 00 FF 00 0F 00 03 07 00 03 07 02 27 02 00 02 07 00 FE 01 FF 00 02 00 03 07 00 03 07 02 27 02 00 03 07 00 FE 01 01 FF 00 1D 00 03 07 00 03 07 02 27 02 00 02 07 00 FE 01 42 07 00 36 FF 00 00 00 03 07 00 03 07 02 27 02 00 02 07 00 FE 01 45 07 00 45 00 45 07 00 32 40 02 45 07 00 45 00 46 07 00 32 40 07 01 10 45 07 00 45 40 07 00 CF 4E 07 01 14 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 01 14 01 5D 07 01 14 42 07 00 DC 40 07 01 14 45 07 00 45 40 01 4F 07 00 03 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 03 01 5D 07 00 03 45 07 00 45 40 07 01 10 45 07 00 45 40 07 00 CF 45 07 00 45 40 07 01 14 45 07 00 45 40 01 4D 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD FF 00 1A 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 00 03 01 FF 00 1C 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 09 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 0B 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 00 60 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 12 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 04 07 00 03 07 01 2A 08 02 6A 08 02 6A FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 02 6A 08 02 6A 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 04 07 00 03 07 01 2A 08 02 6A 08 02 6A FF 00 03 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 02 6A 08 02 6A 07 00 03 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 2C 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 45 07 00 45 00 FF 00 09 00 05 07 00 03 07 02 27 02 07 00 CD 01 00 01 07 00 45 F9 00 06 FF 00 06 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 01 07 01 10 45 07 00 45 40 07 00 CF 45 07 00 45 40 07 01 14 45 07 00 45 40 01 4D 07 00 DC 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD 4B 07 00 CD FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 CD 01 5F 07 00 CD FF 00 0D 00 04 07 00 03 07 02 27 02 07 00 CD 00 01 01 FF 00 02 00 04 07 00 03 07 02 27 02 07 00 CD 00 02 01 01 5E 01 FD 00 10 01 01 42 01 1F FC 00 11 01 42 01 1E FF 00 0D 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 00 03 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 06 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 05 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 00 60 01 FF 00 1B 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 13 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 04 41 08 04 41 07 00 03 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 06 07 00 03 07 01 2A 08 04 41 08 04 41 07 00 03 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 04 41 08 04 41 07 00 03 42 07 00 2C FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 04 41 08 04 41 07 00 03 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 57 FF 00 0E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 04 07 00 03 07 01 2A 07 01 35 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 45 07 00 45 00 4E 07 01 3A FF 00 02 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 01 3A 01 5E 07 01 3A FF 00 06 00 05 07 00 03 07 02 27 02 07 00 CD 01 00 01 07 00 45 FC 00 0F 07 00 45 42 01 1D F8 00 02 4F 07 01 10 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 01 10 01 5D 07 01 10 42 07 00 26 40 07 01 10 45 07 00 45 40 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 01 07 01 14 45 07 00 45 40 01 4F 07 00 03 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 03 01 5F 07 00 03 52 07 00 60 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 60 01 5D 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 4B 07 00 60 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 60 01 5D 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD FF 00 18 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 00 42 01 1C FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD 4A 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 06 76 08 06 76 07 00 03 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 7A 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 45 07 00 45 00 FF 00 10 00 07 07 00 03 07 02 27 02 07 00 CD 01 07 01 3A 01 00 00 42 01 1F FF 00 04 00 05 07 00 03 07 02 27 02 07 00 CD 01 00 01 07 00 45 F9 00 06 FF 00 14 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 FF 00 02 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 00 60 01 FF 00 1F 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 FF 00 0B 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 FF 00 02 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 00 60 01 FF 00 1D 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 42 07 00 DE FF 00 00 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 CD FF 00 13 00 03 07 00 03 07 02 27 02 00 05 07 00 03 07 01 2A 08 07 52 08 07 52 07 00 03 FF 00 02 00 03 07 00 03 07 02 27 02 00 06 07 00 03 07 01 2A 08 07 52 08 07 52 07 00 03 01 FF 00 1D 00 03 07 00 03 07 02 27 02 00 05 07 00 03 07 01 2A 08 07 52 08 07 52 07 00 03 42 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 05 07 00 03 07 01 2A 08 07 52 08 07 52 07 00 03 45 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 01 2A 07 01 86 FF 00 0E 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 01 2A 07 01 35 FF 00 02 00 03 07 00 03 07 02 27 02 00 04 07 00 03 07 01 2A 07 01 35 01 FF 00 1E 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 01 2A 07 01 35 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 01 2A 07 01 35 45 07 00 45 00 0B 42 01 1D 47 07 00 60 45 07 00 60 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 00 60 01 5A 07 00 60 42 07 00 3C 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 01 A1 4B 07 01 A1 FF 00 02 00 03 07 00 03 07 02 27 02 00 02 07 01 A1 01 5E 07 01 A1 FC 00 10 07 01 A1 42 01 1F 4C 07 01 A1 FF 00 02 00 04 07 00 03 07 02 27 02 07 01 A1 00 02 07 01 A1 01 5F 07 01 A1 FC 00 01 07 01 A1 48 07 00 45 40 07 01 A1 45 07 00 45 40 07 01 A1 42 07 01 A1 41 07 01 A1 FF 00 11 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 03 07 00 03 07 01 A1 01 FF 00 1E 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 03 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 05 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 03 07 00 03 07 01 A1 01 FF 00 1B 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 42 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 42 07 00 DE FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 00 9B 44 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 03 07 00 03 07 00 9B 07 01 A1 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 03 07 00 03 07 00 9B 07 00 9B FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 08 07 00 03 07 00 9B 07 00 9B 08 09 6F 08 09 6F 01 01 01 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD FF 00 0B 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 05 07 00 03 07 00 9B 07 00 9B 07 01 AD 01 FF 00 1D 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD 42 07 00 2C FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 0B 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 1D 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 01 45 07 00 45 00 44 07 00 45 40 07 01 A1 45 07 00 45 40 07 01 A1 FA 00 04 FF 00 0B 00 05 07 00 03 07 02 27 02 07 01 A1 01 00 01 07 00 60 45 07 00 60 FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 01 00 02 07 00 60 01 59 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD 45 07 00 45 40 07 01 2A 47 07 00 45 40 01 FC 00 01 01 06 05 42 01 1B 4A 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD 4B 07 00 CD FF 00 02 00 06 07 00 03 07 02 27 02 07 01 A1 01 01 00 02 07 00 CD 01 5E 07 00 CD 44 07 00 30 FF 00 00 00 06 07 00 03 07 02 27 02 07 01 A1 01 01 00 02 07 00 CD 01 47 07 00 45 40 07 00 CF FF 00 0A 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 07 00 8C 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 07 00 9B FF 00 0B 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 07 00 9B FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 01 FF 00 1E 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 07 00 9B 44 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 8C 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 0B 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 1F 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 09 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 FF 00 05 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 06 07 00 03 07 00 9B 07 00 9B 01 07 00 60 01 FF 00 18 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 42 07 00 28 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 05 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 19 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 13 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 08 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 01 FF 00 1C 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 08 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 FF 00 0D 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 07 07 00 03 07 00 9B 07 00 9B 01 01 01 01 FF 00 02 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 08 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 FF 00 1E 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 07 07 00 03 07 00 9B 07 00 9B 01 01 01 01 FF 00 0E 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 03 FF 00 02 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 0A 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 03 01 FF 00 1D 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 03 49 07 00 2A FF 00 00 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 60 45 07 00 45 FF 00 00 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 60 42 07 00 45 FF 00 00 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 60 45 07 00 45 FF 00 00 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 01 FF 00 1A 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 00 07 00 9B 00 00 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 02 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 00 07 00 9B 00 00 01 01 01 01 00 03 07 00 03 07 00 9B 01 FF 00 1C 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 00 07 00 9B 00 00 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 0D 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 07 00 9B 07 00 9B 00 00 01 01 01 01 00 01 07 00 03 FF 00 02 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 07 00 9B 07 00 9B 00 00 01 01 01 01 00 02 07 00 03 01 5E 07 00 03 FF 00 0E 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 00 01 01 FF 00 02 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 00 02 01 01 5D 01 FF 00 08 00 00 00 01 07 00 45 FF 00 00 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 00 02 01 01 45 07 00 45 40 01 FF 00 11 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 02 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 03 07 00 03 07 00 9B 01 FF 00 1D 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 11 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 02 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 06 07 00 03 07 00 9B 07 00 9B 01 01 01 FF 00 1E 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 16 00 16 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 02 00 16 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 00 06 07 00 03 07 00 9B 07 00 9B 01 01 01 FF 00 1D 00 16 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 17 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 07 07 00 03 07 00 9B 07 00 9B 08 0D C8 08 0D C8 01 01 FF 00 02 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 08 07 00 03 07 00 9B 07 00 9B 08 0D C8 08 0D C8 01 01 01 FF 00 1C 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 07 07 00 03 07 00 9B 07 00 9B 08 0D C8 08 0D C8 01 01 46 07 00 45 FF 00 00 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 09 07 00 03 07 00 9B 07 00 9B 08 0D C8 08 0D C8 01 01 01 01 45 07 00 45 FF 00 00 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B 4E 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 09 07 00 03 07 00 9B 07 00 9B 08 0E 0E 08 0E 0E 01 01 01 01 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 45 07 00 45 00 4C 07 00 03 FF 00 02 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 01 5C 07 00 03 45 07 00 2C 40 07 01 10 45 07 00 45 40 07 00 CF 45 07 00 45 40 07 01 14 45 07 00 45 40 01 02 05 42 01 1B FF 00 07 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 FE 07 00 8C 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 FE 07 00 9B 4D 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 08 07 00 FE 07 00 9B 08 0E BC 08 0E BC 01 01 01 01 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 FE 07 00 9B 07 01 AD 42 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 FE 07 00 9B 07 01 AD 45 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 FE 07 00 9B 01 44 07 00 45 FF 00 00 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 04 07 00 FE 07 00 9B 01 01 45 07 00 45 00 FF 00 05 00 04 07 00 03 07 02 27 02 07 01 A1 00 01 07 00 22 01 FC 00 16 07 00 8C 42 01 1F FF 00 0E 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 03 07 00 8C FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 8C 01 FF 00 1D 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 03 07 00 8C FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 03 07 00 8C 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 03 07 00 9B 44 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 9B 07 00 8C 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 0B 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 1C 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 07 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 42 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 04 07 00 03 07 00 9B 07 00 9B 01 45 07 00 45 00 4E 07 00 FE FF 00 02 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 FE 01 5E 07 00 FE 42 07 00 45 40 07 00 FE 45 07 00 45 F9 00 00 FF 00 00 00 06 07 00 03 07 02 27 02 07 01 A1 01 01 00 01 07 00 CD FF 00 01 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 07 07 00 03 07 00 9B 07 00 9B 01 01 01 01 FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 01 A1 FF 00 01 00 18 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 01 01 00 07 07 00 03 07 00 9B 07 00 9B 08 0D C8 08 0D C8 01 01 FF 00 01 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 00 07 00 9B 00 00 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 01 00 16 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 01 00 03 07 00 03 07 02 27 02 00 00 01 FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 02 07 00 03 07 01 A1 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 01 07 01 3A FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 01 07 00 FE FF 00 01 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 00 01 01 FF 00 01 00 04 07 00 03 07 02 27 02 07 00 CD 00 01 01 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 02 07 00 03 07 00 8C FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 07 01 AD FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 05 07 00 03 07 01 2A 08 04 41 08 04 41 07 00 03 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 00 60 FF 00 01 00 04 07 00 03 07 02 27 02 07 01 A1 00 01 07 01 A1 FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 00 03 41 07 00 60 FF 00 01 00 13 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 00 00 07 00 9B 07 00 9B 00 00 01 01 01 01 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 02 27 02 00 05 07 00 03 07 01 2A 08 07 52 08 07 52 07 00 03 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 00 FA 00 01 FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 00 8C 00 00 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 03 07 00 03 07 01 2A 07 01 35 FF 00 01 00 04 07 00 03 07 02 27 02 07 01 A1 00 00 FF 00 01 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 41 07 00 E6 41 07 01 14 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 07 01 3A 01 00 00 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 04 07 00 03 07 01 2A 08 02 6A 08 02 6A FF 00 01 00 06 07 00 03 07 02 27 02 07 00 CD 01 07 00 45 00 00 FF 00 01 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 02 07 00 03 07 00 9B FF 00 01 00 03 07 00 03 07 02 27 02 00 03 07 00 03 07 01 2A 07 01 35 41 07 01 10 41 07 00 CD FF 00 01 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 02 07 00 03 07 00 9B FF 00 01 00 08 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 00 09 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 07 00 03 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 05 07 00 03 07 02 27 02 07 01 A1 07 01 A1 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 01 00 14 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 01 01 01 07 00 03 07 00 9B 07 00 9B 00 00 01 01 01 01 01 00 05 07 00 03 07 00 9B 07 00 9B 01 01 FF 00 01 00 03 07 00 03 07 02 27 02 00 02 07 00 03 07 00 60 FF 00 01 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 03 07 00 03 07 00 9B 07 00 9B FF 00 01 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 08 07 00 03 07 00 9B 07 00 9B 01 01 01 01 01 FF 00 01 00 03 07 00 03 07 02 27 02 00 02 07 00 FE 01 FF 00 01 00 07 07 00 03 07 02 27 02 07 00 CD 01 01 01 00 00 FF 00 01 00 07 07 00 03 07 02 27 02 07 01 A1 01 01 07 00 8C 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 02 27 02 00 01 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  490    550    704    711    Any
        //  551    672    704    711    Any
        //  673    699    704    711    Any
        //  704    706    704    711    Any
        //  922    1067   1267   1319   Any
        //  1068   1262   1267   1319   Any
        //  1267   1269   1267   1319   Any
        //  1572   1632   1741   1748   Any
        //  1633   1689   1741   1748   Any
        //  1741   1743   1741   1748   Any
        //  2565   3357   3824   3826   Ljava/lang/Exception;
        //  3358   3764   3824   3826   Ljava/lang/Exception;
        //  3765   3824   3824   3826   Ljava/lang/Exception;
        //  8      20     4203   4211   Any
        //  4203   4211   4203   4211   Ljava/lang/IllegalArgumentException;
        //  4219   4221   3      8      Ljava/lang/AssertionError;
        //  215    222    222    223    Any
        //  215    222    215    216    Ljava/lang/ArithmeticException;
        //  215    222    3      8      Ljava/lang/NegativeArraySizeException;
        //  215    222    215    216    Any
        //  215    222    3      8      Any
        //  275    282    282    283    Any
        //  275    282    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  276    282    3      8      Any
        //  276    282    282    283    Ljava/lang/IllegalArgumentException;
        //  276    282    275    276    Ljava/lang/UnsupportedOperationException;
        //  289    296    296    297    Any
        //  289    296    296    297    Ljava/lang/IllegalArgumentException;
        //  289    296    289    290    Ljava/lang/ArithmeticException;
        //  289    296    3      8      Any
        //  289    296    296    297    Any
        //  304    311    311    312    Any
        //  304    311    311    312    Any
        //  305    311    311    312    Ljava/lang/IllegalStateException;
        //  305    311    3      8      Any
        //  305    311    304    305    Ljava/lang/ArithmeticException;
        //  363    370    370    371    Any
        //  363    370    370    371    Ljava/lang/AssertionError;
        //  364    370    370    371    Any
        //  364    370    363    364    Ljava/lang/StringIndexOutOfBoundsException;
        //  364    370    370    371    Any
        //  426    433    433    434    Any
        //  427    433    426    427    Any
        //  427    433    426    427    Ljava/lang/StringIndexOutOfBoundsException;
        //  427    433    433    434    Ljava/lang/AssertionError;
        //  426    433    426    427    Any
        //  440    447    447    448    Any
        //  440    447    447    448    Any
        //  441    447    3      8      Any
        //  440    447    447    448    Ljava/lang/NumberFormatException;
        //  440    447    440    441    Any
        //  462    469    469    470    Any
        //  462    469    462    463    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  463    469    469    470    Any
        //  463    469    462    463    Any
        //  463    469    469    470    Any
        //  473    480    480    481    Any
        //  474    480    473    474    Ljava/lang/AssertionError;
        //  474    480    473    474    Ljava/lang/EnumConstantNotPresentException;
        //  473    480    3      8      Ljava/util/NoSuchElementException;
        //  474    480    3      8      Any
        //  551    557    557    558    Any
        //  551    557    3      8      Ljava/lang/UnsupportedOperationException;
        //  551    557    557    558    Any
        //  551    557    3      8      Any
        //  551    557    557    558    Ljava/lang/NumberFormatException;
        //  607    614    614    615    Any
        //  607    614    607    608    Any
        //  607    614    614    615    Ljava/lang/NullPointerException;
        //  607    614    607    608    Any
        //  608    614    607    608    Ljava/lang/NullPointerException;
        //  673    679    679    680    Any
        //  673    679    679    680    Ljava/lang/NegativeArraySizeException;
        //  673    679    3      8      Ljava/lang/NullPointerException;
        //  673    679    679    680    Any
        //  673    679    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  686    693    693    694    Any
        //  686    693    693    694    Ljava/lang/EnumConstantNotPresentException;
        //  686    693    686    687    Any
        //  687    693    693    694    Ljava/util/NoSuchElementException;
        //  687    693    3      8      Ljava/lang/NumberFormatException;
        //  719    725    725    726    Any
        //  719    725    3      8      Any
        //  719    725    3      8      Ljava/lang/IllegalArgumentException;
        //  719    725    725    726    Any
        //  719    725    3      8      Any
        //  732    739    739    740    Any
        //  733    739    732    733    Any
        //  732    739    739    740    Any
        //  732    739    732    733    Any
        //  733    739    3      8      Any
        //  754    761    761    762    Any
        //  755    761    761    762    Ljava/lang/IllegalStateException;
        //  755    761    3      8      Ljava/lang/NegativeArraySizeException;
        //  755    761    754    755    Ljava/lang/StringIndexOutOfBoundsException;
        //  755    761    761    762    Ljava/lang/NegativeArraySizeException;
        //  765    772    772    773    Any
        //  766    772    765    766    Any
        //  766    772    772    773    Any
        //  766    772    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  765    772    772    773    Any
        //  1068   1074   1074   1075   Any
        //  1068   1074   3      8      Any
        //  1068   1074   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1068   1074   1074   1075   Ljava/lang/IndexOutOfBoundsException;
        //  1068   1074   1074   1075   Ljava/lang/IndexOutOfBoundsException;
        //  1078   1085   1085   1086   Any
        //  1078   1085   1085   1086   Ljava/lang/NumberFormatException;
        //  1079   1085   1085   1086   Any
        //  1078   1085   1085   1086   Any
        //  1078   1085   1078   1079   Any
        //  1143   1150   1150   1151   Any
        //  1144   1150   1143   1144   Ljava/lang/ArithmeticException;
        //  1144   1150   3      8      Any
        //  1143   1150   1143   1144   Ljava/lang/IndexOutOfBoundsException;
        //  1144   1150   1150   1151   Any
        //  1203   1210   1210   1211   Any
        //  1203   1210   3      8      Any
        //  1203   1210   1203   1204   Ljava/lang/IndexOutOfBoundsException;
        //  1203   1210   1210   1211   Ljava/lang/IndexOutOfBoundsException;
        //  1203   1210   1203   1204   Any
        //  1371   1378   1378   1379   Any
        //  1371   1378   3      8      Any
        //  1372   1378   1371   1372   Ljava/lang/AssertionError;
        //  1372   1378   1378   1379   Ljava/lang/ClassCastException;
        //  1372   1378   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1386   1392   1392   1393   Any
        //  1386   1392   3      8      Any
        //  1386   1392   1392   1393   Ljava/lang/IndexOutOfBoundsException;
        //  1386   1392   3      8      Any
        //  1386   1392   3      8      Any
        //  1499   1506   1506   1507   Any
        //  1500   1506   1499   1500   Ljava/util/NoSuchElementException;
        //  1499   1506   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1500   1506   1499   1500   Any
        //  1500   1506   3      8      Ljava/lang/NumberFormatException;
        //  1555   1562   1562   1563   Any
        //  1556   1562   3      8      Ljava/lang/IllegalArgumentException;
        //  1556   1562   3      8      Ljava/util/NoSuchElementException;
        //  1556   1562   1555   1556   Any
        //  1555   1562   1562   1563   Ljava/lang/IllegalArgumentException;
        //  1633   1639   1639   1640   Any
        //  1633   1639   3      8      Any
        //  1633   1639   3      8      Any
        //  1633   1639   3      8      Any
        //  1633   1639   1639   1640   Ljava/lang/NullPointerException;
        //  1643   1650   1650   1651   Any
        //  1643   1650   1650   1651   Any
        //  1643   1650   1643   1644   Any
        //  1644   1650   1643   1644   Any
        //  1643   1650   1643   1644   Any
        //  1662   1669   1669   1670   Any
        //  1662   1669   1662   1663   Any
        //  1662   1669   1662   1663   Any
        //  1663   1669   3      8      Any
        //  1662   1669   1669   1670   Ljava/lang/IllegalStateException;
        //  1676   1683   1683   1684   Any
        //  1677   1683   1676   1677   Any
        //  1677   1683   1683   1684   Any
        //  1676   1683   1683   1684   Any
        //  1676   1683   1676   1677   Any
        //  1807   1814   1814   1815   Any
        //  1808   1814   1807   1808   Any
        //  1807   1814   1814   1815   Ljava/lang/NegativeArraySizeException;
        //  1807   1814   1814   1815   Ljava/util/NoSuchElementException;
        //  1807   1814   3      8      Any
        //  1863   1870   1870   1871   Any
        //  1864   1870   1870   1871   Any
        //  1863   1870   1863   1864   Ljava/util/NoSuchElementException;
        //  1864   1870   3      8      Any
        //  1864   1870   1870   1871   Ljava/lang/IndexOutOfBoundsException;
        //  1927   1934   1934   1935   Any
        //  1928   1934   1927   1928   Ljava/lang/IllegalStateException;
        //  1928   1934   3      8      Any
        //  1927   1934   1927   1928   Any
        //  1927   1934   1934   1935   Ljava/lang/ArithmeticException;
        //  1988   1994   1994   1995   Any
        //  1988   1994   1994   1995   Any
        //  1988   1994   1994   1995   Any
        //  1988   1994   1994   1995   Ljava/lang/NullPointerException;
        //  1988   1994   1994   1995   Ljava/lang/ClassCastException;
        //  2087   2094   2094   2095   Any
        //  2087   2094   2087   2088   Ljava/lang/NumberFormatException;
        //  2088   2094   3      8      Any
        //  2088   2094   2094   2095   Ljava/util/ConcurrentModificationException;
        //  2087   2094   3      8      Any
        //  2098   2105   2105   2106   Any
        //  2099   2105   2105   2106   Ljava/lang/NumberFormatException;
        //  2099   2105   2098   2099   Any
        //  2099   2105   2098   2099   Ljava/lang/IndexOutOfBoundsException;
        //  2099   2105   2105   2106   Any
        //  2263   2270   2270   2271   Any
        //  2263   2270   2263   2264   Any
        //  2264   2270   2270   2271   Any
        //  2263   2270   3      8      Any
        //  2264   2270   2263   2264   Ljava/lang/NullPointerException;
        //  2332   2338   2338   2339   Any
        //  2332   2338   3      8      Ljava/lang/ArithmeticException;
        //  2332   2338   2338   2339   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2332   2338   2338   2339   Any
        //  2332   2338   2338   2339   Any
        //  2383   2390   2390   2391   Any
        //  2383   2390   2383   2384   Any
        //  2383   2390   3      8      Ljava/util/NoSuchElementException;
        //  2384   2390   3      8      Any
        //  2384   2390   2390   2391   Any
        //  2394   2401   2401   2402   Any
        //  2395   2401   2401   2402   Ljava/lang/NullPointerException;
        //  2395   2401   3      8      Any
        //  2394   2401   2394   2395   Ljava/util/NoSuchElementException;
        //  2394   2401   2401   2402   Any
        //  2407   2414   2414   2415   Any
        //  2407   2414   3      8      Any
        //  2407   2414   2407   2408   Any
        //  2407   2414   2407   2408   Ljava/lang/IllegalStateException;
        //  2407   2414   2414   2415   Any
        //  2428   2434   2434   2435   Any
        //  2428   2434   3      8      Any
        //  2428   2434   2434   2435   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2428   2434   2434   2435   Ljava/lang/AssertionError;
        //  2428   2434   2434   2435   Any
        //  2483   2490   2490   2491   Any
        //  2483   2490   2483   2484   Ljava/lang/RuntimeException;
        //  2484   2490   2490   2491   Any
        //  2484   2490   2490   2491   Any
        //  2483   2490   3      8      Any
        //  2540   2546   2546   2547   Any
        //  2540   2546   3      8      Ljava/lang/ArithmeticException;
        //  2540   2546   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2540   2546   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2540   2546   3      8      Ljava/lang/AssertionError;
        //  2552   2559   2559   2560   Any
        //  2553   2559   2552   2553   Any
        //  2552   2559   2552   2553   Ljava/lang/IllegalStateException;
        //  2552   2559   2552   2553   Any
        //  2553   2559   3      8      Any
        //  2615   2622   2622   2623   Any
        //  2615   2622   2615   2616   Any
        //  2615   2622   3      8      Any
        //  2616   2622   3      8      Ljava/lang/RuntimeException;
        //  2616   2622   3      8      Ljava/lang/IllegalArgumentException;
        //  2626   2633   2633   2634   Any
        //  2626   2633   3      8      Any
        //  2627   2633   2626   2627   Any
        //  2626   2633   3      8      Any
        //  2626   2633   3      8      Ljava/lang/IllegalStateException;
        //  2640   2649   2649   2650   Any
        //  2641   2649   2649   2650   Any
        //  2640   2649   3      8      Ljava/lang/NegativeArraySizeException;
        //  2641   2649   2649   2650   Ljava/lang/AssertionError;
        //  2640   2649   2640   2641   Any
        //  2707   2714   2714   2715   Any
        //  2708   2714   3      8      Any
        //  2707   2714   3      8      Ljava/lang/AssertionError;
        //  2707   2714   3      8      Ljava/lang/NumberFormatException;
        //  2708   2714   2707   2708   Any
        //  2718   2725   2725   2726   Any
        //  2719   2725   2725   2726   Any
        //  2718   2725   3      8      Any
        //  2718   2725   2725   2726   Any
        //  2719   2725   2718   2719   Any
        //  2777   2786   2786   2787   Any
        //  2777   2786   3      8      Any
        //  2778   2786   2786   2787   Any
        //  2778   2786   2777   2778   Ljava/lang/IllegalArgumentException;
        //  2777   2786   3      8      Any
        //  2798   2805   2805   2806   Any
        //  2798   2805   3      8      Any
        //  2798   2805   2798   2799   Any
        //  2798   2805   3      8      Any
        //  2799   2805   2805   2806   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2857   2864   2864   2865   Any
        //  2857   2864   3      8      Any
        //  2857   2864   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2857   2864   2857   2858   Any
        //  2857   2864   2864   2865   Any
        //  2959   2966   2966   2967   Any
        //  2959   2966   2966   2967   Any
        //  2960   2966   2966   2967   Any
        //  2959   2966   2959   2960   Ljava/util/ConcurrentModificationException;
        //  2960   2966   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2970   2977   2977   2978   Any
        //  2970   2977   3      8      Any
        //  2970   2977   2970   2971   Any
        //  2970   2977   2970   2971   Any
        //  2970   2977   2970   2971   Ljava/lang/ArithmeticException;
        //  3174   3181   3181   3182   Any
        //  3174   3181   3181   3182   Any
        //  3175   3181   3181   3182   Ljava/lang/ArithmeticException;
        //  3174   3181   3181   3182   Ljava/lang/RuntimeException;
        //  3175   3181   3174   3175   Ljava/lang/IndexOutOfBoundsException;
        //  3185   3192   3192   3193   Any
        //  3185   3192   3      8      Ljava/lang/NullPointerException;
        //  3186   3192   3      8      Any
        //  3185   3192   3185   3186   Any
        //  3185   3192   3185   3186   Ljava/lang/UnsupportedOperationException;
        //  3358   3364   3364   3365   Any
        //  3358   3364   3      8      Any
        //  3358   3364   3364   3365   Any
        //  3358   3364   3      8      Ljava/lang/RuntimeException;
        //  3358   3364   3364   3365   Ljava/lang/IllegalStateException;
        //  3587   3594   3594   3595   Any
        //  3587   3594   3587   3588   Any
        //  3588   3594   3594   3595   Ljava/lang/NumberFormatException;
        //  3588   3594   3587   3588   Ljava/lang/EnumConstantNotPresentException;
        //  3587   3594   3594   3595   Ljava/lang/ArithmeticException;
        //  3613   3620   3620   3621   Any
        //  3613   3620   3620   3621   Ljava/lang/RuntimeException;
        //  3613   3620   3613   3614   Any
        //  3614   3620   3613   3614   Ljava/lang/RuntimeException;
        //  3614   3620   3      8      Any
        //  3624   3631   3631   3632   Any
        //  3625   3631   3631   3632   Any
        //  3625   3631   3624   3625   Any
        //  3625   3631   3631   3632   Ljava/lang/ClassCastException;
        //  3625   3631   3631   3632   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3635   3642   3642   3643   Any
        //  3636   3642   3635   3636   Ljava/lang/RuntimeException;
        //  3636   3642   3635   3636   Ljava/lang/IndexOutOfBoundsException;
        //  3635   3642   3      8      Any
        //  3635   3642   3635   3636   Any
        //  3694   3701   3701   3702   Any
        //  3695   3701   3694   3695   Ljava/lang/IllegalArgumentException;
        //  3694   3701   3694   3695   Ljava/lang/ClassCastException;
        //  3694   3701   3701   3702   Any
        //  3694   3701   3701   3702   Any
        //  3708   3715   3715   3716   Any
        //  3709   3715   3708   3709   Any
        //  3708   3715   3      8      Ljava/lang/IllegalStateException;
        //  3708   3715   3715   3716   Any
        //  3709   3715   3708   3709   Ljava/lang/IllegalStateException;
        //  3765   3771   3771   3772   Any
        //  3765   3771   3771   3772   Ljava/lang/ArithmeticException;
        //  3765   3771   3      8      Any
        //  3765   3771   3      8      Any
        //  3765   3771   3771   3772   Any
        //  3786   3793   3793   3794   Any
        //  3786   3793   3      8      Ljava/lang/ArithmeticException;
        //  3786   3793   3793   3794   Any
        //  3786   3793   3786   3787   Any
        //  3786   3793   3      8      Any
        //  3797   3804   3804   3805   Any
        //  3798   3804   3797   3798   Any
        //  3798   3804   3804   3805   Any
        //  3797   3804   3      8      Ljava/lang/NumberFormatException;
        //  3797   3804   3797   3798   Any
        //  3810   3817   3817   3818   Any
        //  3810   3817   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3810   3817   3817   3818   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3811   3817   3817   3818   Ljava/lang/ArithmeticException;
        //  3810   3817   3810   3811   Any
        //  3936   3942   3942   3943   Any
        //  3936   3942   3      8      Ljava/lang/ClassCastException;
        //  3936   3942   3942   3943   Ljava/lang/IndexOutOfBoundsException;
        //  3936   3942   3942   3943   Ljava/lang/UnsupportedOperationException;
        //  3936   3942   3      8      Ljava/lang/NumberFormatException;
        //  3948   3955   3955   3956   Any
        //  3948   3955   3948   3949   Any
        //  3949   3955   3      8      Ljava/lang/ArithmeticException;
        //  3948   3955   3      8      Ljava/lang/NullPointerException;
        //  3948   3955   3955   3956   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4009   4015   4015   4016   Any
        //  4009   4015   4015   4016   Ljava/lang/UnsupportedOperationException;
        //  4009   4015   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  4009   4015   3      8      Any
        //  4009   4015   3      8      Ljava/lang/IllegalStateException;
        //  4019   4026   4026   4027   Any
        //  4019   4026   4026   4027   Any
        //  4020   4026   4019   4020   Any
        //  4019   4026   4019   4020   Ljava/lang/IllegalArgumentException;
        //  4019   4026   4019   4020   Ljava/lang/NumberFormatException;
        //  4079   4086   4086   4087   Any
        //  4080   4086   4086   4087   Any
        //  4080   4086   4079   4080   Any
        //  4079   4086   3      8      Ljava/lang/IllegalArgumentException;
        //  4079   4086   4086   4087   Ljava/lang/RuntimeException;
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
    
    public void c(final Collection p0, final Function1 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          215
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            207
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            199
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: nop            
        //    25: aload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    35: goto            39
        //    38: athrow         
        //    39: astore_3       
        //    40: aload_3        
        //    41: getstatic       dev/nuker/pyro/fc.1:I
        //    44: ifeq            53
        //    47: ldc_w           -1009021422
        //    50: goto            56
        //    53: ldc_w           121423514
        //    56: ldc_w           -2071068233
        //    59: ixor           
        //    60: lookupswitch {
        //          -1336152717: 53
        //          1196789669: 188
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokeinterface java/util/Iterator.hasNext:()Z
        //    97: goto            101
        //   100: athrow         
        //   101: ifeq            185
        //   104: aload_3        
        //   105: goto            109
        //   108: athrow         
        //   109: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   114: goto            118
        //   117: athrow         
        //   118: astore          4
        //   120: aload_2        
        //   121: aload           4
        //   123: goto            127
        //   126: athrow         
        //   127: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   132: goto            136
        //   135: athrow         
        //   136: pop            
        //   137: goto            40
        //   140: getstatic       dev/nuker/pyro/fc.1:I
        //   143: ifeq            152
        //   146: ldc_w           474050802
        //   149: goto            155
        //   152: ldc_w           -61296485
        //   155: ldc_w           -1324301914
        //   158: ixor           
        //   159: lookupswitch {
        //          -1387155116: 152
        //          1296593213: 184
        //          default: 186
        //        }
        //   184: astore_3       
        //   185: return         
        //   186: aconst_null    
        //   187: athrow         
        //   188: aconst_null    
        //   189: athrow         
        //   190: pop            
        //   191: goto            24
        //   194: pop            
        //   195: aconst_null    
        //   196: goto            190
        //   199: dup            
        //   200: ifnull          190
        //   203: checkcast       Ljava/lang/Throwable;
        //   206: athrow         
        //   207: dup            
        //   208: ifnull          194
        //   211: checkcast       Ljava/lang/Throwable;
        //   214: athrow         
        //   215: aconst_null    
        //   216: athrow         
        //    StackMapTable: 00 24 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FE 00 03 07 00 03 07 01 2A 07 01 35 FF 00 04 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 01 2A 07 01 35 00 01 07 01 2A 47 07 00 45 40 07 00 74 FC 00 00 07 00 74 4C 07 00 74 FF 00 02 00 04 07 00 03 07 01 2A 07 01 35 07 00 74 00 02 07 00 74 01 5F 07 00 74 42 07 00 45 40 07 00 74 47 07 00 45 40 01 46 07 00 45 40 07 00 74 47 07 00 45 40 07 00 CF FF 00 07 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 01 2A 07 01 35 07 00 74 07 00 CF 00 02 07 01 35 07 00 CF 47 07 00 45 40 07 00 CF FF 00 03 00 03 07 00 03 07 01 2A 07 01 35 00 01 07 00 22 4B 07 00 22 FF 00 02 00 03 07 00 03 07 01 2A 07 01 35 00 02 07 00 22 01 5C 07 00 22 FC 00 00 07 00 CF FF 00 00 00 03 07 00 03 07 01 2A 07 01 35 00 01 07 00 22 FF 00 01 00 04 07 00 03 07 01 2A 07 01 35 07 00 74 00 01 07 00 74 FF 00 01 00 03 07 00 03 07 01 2A 07 01 35 00 01 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     29     140    185    Ljava/lang/Exception;
        //  30     126    140    185    Ljava/lang/Exception;
        //  127    140    140    185    Ljava/lang/Exception;
        //  8      20     199    207    Ljava/lang/IllegalStateException;
        //  199    207    199    207    Any
        //  215    217    3      8      Ljava/lang/IllegalArgumentException;
        //  30     38     38     39     Any
        //  30     38     3      8      Any
        //  30     38     3      8      Any
        //  30     38     3      8      Any
        //  30     38     38     39     Any
        //  91     100    100    101    Any
        //  91     100    100    101    Ljava/lang/ArithmeticException;
        //  92     100    100    101    Any
        //  91     100    91     92     Any
        //  91     100    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  108    117    117    118    Any
        //  108    117    108    109    Any
        //  108    117    117    118    Any
        //  109    117    3      8      Any
        //  109    117    108    109    Ljava/lang/UnsupportedOperationException;
        //  127    135    135    136    Any
        //  127    135    135    136    Ljava/util/ConcurrentModificationException;
        //  127    135    3      8      Ljava/lang/NullPointerException;
        //  127    135    3      8      Any
        //  127    135    135    136    Any
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
    
    public void c(@NotNull final BlockPos p0, @NotNull final BlockPos p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          299
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            291
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            283
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           85469562
        //    35: goto            41
        //    38: ldc_w           922402257
        //    41: ldc_w           206678309
        //    44: ixor           
        //    45: lookupswitch {
        //          155811935: 272
        //          654706301: 38
        //          default: 72
        //        }
        //    72: aload_2        
        //    73: pop            
        //    74: new             Lnet/minecraft/util/math/Vec3d;
        //    77: dup            
        //    78: aload_1        
        //    79: checkcast       Lnet/minecraft/util/math/Vec3i;
        //    82: goto            86
        //    85: athrow         
        //    86: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //    89: goto            93
        //    92: athrow         
        //    93: ldc2_w          0.5
        //    96: ldc2_w          0.5
        //    99: ldc2_w          0.5
        //   102: goto            106
        //   105: athrow         
        //   106: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   109: goto            113
        //   112: athrow         
        //   113: astore          4
        //   115: new             Lnet/minecraft/util/math/Vec3d;
        //   118: dup            
        //   119: getstatic       dev/nuker/pyro/fc.0:I
        //   122: ifeq            131
        //   125: ldc_w           589130807
        //   128: goto            134
        //   131: ldc_w           -833988851
        //   134: ldc_w           -1518980106
        //   137: ixor           
        //   138: lookupswitch {
        //          -2039783487: 131
        //          1799120123: 164
        //          default: 268
        //        }
        //   164: aload_2        
        //   165: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   168: goto            172
        //   171: athrow         
        //   172: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   175: goto            179
        //   178: athrow         
        //   179: ldc2_w          0.5
        //   182: ldc2_w          0.5
        //   185: ldc2_w          0.5
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   195: goto            199
        //   198: athrow         
        //   199: getstatic       dev/nuker/pyro/fc.0:I
        //   202: ifeq            211
        //   205: ldc_w           1906121975
        //   208: goto            214
        //   211: ldc_w           1137842502
        //   214: ldc_w           70529400
        //   217: ixor           
        //   218: lookupswitch {
        //          -861478262: 211
        //          1974021519: 270
        //          default: 244
        //        }
        //   244: astore          5
        //   246: aload_0        
        //   247: aload           4
        //   249: dup            
        //   250: pop            
        //   251: aload           5
        //   253: dup            
        //   254: pop            
        //   255: iload_3        
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   dev/nuker/pyro/f89.c:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;I)V
        //   263: goto            267
        //   266: athrow         
        //   267: return         
        //   268: aconst_null    
        //   269: athrow         
        //   270: aconst_null    
        //   271: athrow         
        //   272: aconst_null    
        //   273: athrow         
        //   274: pop            
        //   275: goto            24
        //   278: pop            
        //   279: aconst_null    
        //   280: goto            274
        //   283: dup            
        //   284: ifnull          274
        //   287: checkcast       Ljava/lang/Throwable;
        //   290: athrow         
        //   291: dup            
        //   292: ifnull          278
        //   295: checkcast       Ljava/lang/Throwable;
        //   298: athrow         
        //   299: aconst_null    
        //   300: athrow         
        //    StackMapTable: 00 29 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FF 00 03 00 04 07 00 03 07 00 9B 07 00 9B 01 00 00 0D 42 01 1E 4C 07 00 2C FF 00 00 00 04 07 00 03 07 00 9B 07 00 9B 01 00 03 08 00 4A 08 00 4A 07 00 99 45 07 00 45 40 07 02 27 4B 07 00 DE FF 00 00 00 04 07 00 03 07 00 9B 07 00 9B 01 00 04 07 02 27 03 03 03 45 07 00 45 40 07 02 27 FF 00 11 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 02 08 00 73 08 00 73 FF 00 02 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 03 08 00 73 08 00 73 01 FF 00 1D 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 02 08 00 73 08 00 73 FF 00 06 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 03 08 00 73 08 00 73 07 00 99 45 07 00 45 40 07 02 27 4B 07 00 45 FF 00 00 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 04 07 02 27 03 03 03 45 07 00 45 40 07 02 27 4B 07 02 27 FF 00 02 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 02 07 02 27 01 5D 07 02 27 FF 00 0E 00 06 07 00 03 07 00 9B 07 00 9B 01 07 02 27 07 02 27 00 01 07 00 45 FF 00 00 00 06 07 00 03 07 00 9B 07 00 9B 01 07 02 27 07 02 27 00 04 07 00 03 07 02 27 07 02 27 01 45 07 00 45 00 FF 00 00 00 05 07 00 03 07 00 9B 07 00 9B 01 07 02 27 00 02 08 00 73 08 00 73 41 07 02 27 FA 00 01 41 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     283    291    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  283    291    283    291    Any
        //  299    301    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  85     92     92     93     Any
        //  85     92     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  85     92     85     86     Ljava/lang/IllegalArgumentException;
        //  86     92     85     86     Ljava/lang/RuntimeException;
        //  85     92     92     93     Any
        //  105    112    112    113    Any
        //  105    112    112    113    Ljava/lang/UnsupportedOperationException;
        //  106    112    105    106    Ljava/util/NoSuchElementException;
        //  105    112    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  106    112    112    113    Any
        //  172    178    178    179    Any
        //  172    178    178    179    Any
        //  172    178    3      8      Ljava/lang/RuntimeException;
        //  172    178    178    179    Any
        //  172    178    3      8      Any
        //  191    198    198    199    Any
        //  192    198    191    192    Any
        //  192    198    3      8      Any
        //  191    198    3      8      Any
        //  191    198    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  259    266    266    267    Any
        //  259    266    266    267    Any
        //  259    266    266    267    Any
        //  260    266    259    260    Any
        //  260    266    266    267    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 108 out of bounds for length 108
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
    
    public void c(@NotNull final Vec3d p0, @NotNull final Vec3d p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          445
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            437
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            429
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: new             Ljava/awt/Color;
        //    31: dup            
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            44
        //    38: ldc_w           -865188137
        //    41: goto            47
        //    44: ldc_w           2080844959
        //    47: ldc_w           -1197620212
        //    50: ixor           
        //    51: lookupswitch {
        //          1053172500: 44
        //          1962115803: 418
        //          default: 76
        //        }
        //    76: iload_3        
        //    77: goto            81
        //    80: athrow         
        //    81: invokespecial   java/awt/Color.<init>:(I)V
        //    84: goto            88
        //    87: athrow         
        //    88: getstatic       dev/nuker/pyro/fc.c:I
        //    91: ifge            100
        //    94: ldc_w           -64531132
        //    97: goto            103
        //   100: ldc_w           1167377236
        //   103: ldc_w           908072770
        //   106: ixor           
        //   107: lookupswitch {
        //          -905494010: 100
        //          1941230614: 132
        //          default: 412
        //        }
        //   132: astore          4
        //   134: getstatic       dev/nuker/pyro/fc.0:I
        //   137: ifeq            146
        //   140: ldc_w           280627559
        //   143: goto            149
        //   146: ldc_w           -712193534
        //   149: ldc_w           1963225802
        //   152: ixor           
        //   153: lookupswitch {
        //          -1601652536: 180
        //          1706982317: 146
        //          default: 410
        //        }
        //   180: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   183: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   186: goto            190
        //   189: athrow         
        //   190: invokevirtual   dev/nuker/pyro/fbr.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //   193: goto            197
        //   196: athrow         
        //   197: dup            
        //   198: pop            
        //   199: aload_1        
        //   200: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   203: aload_1        
        //   204: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   207: aload_1        
        //   208: getstatic       dev/nuker/pyro/fc.c:I
        //   211: ifge            220
        //   214: ldc_w           613303524
        //   217: goto            223
        //   220: ldc_w           -333048070
        //   223: ldc_w           30706889
        //   226: ixor           
        //   227: lookupswitch {
        //          -302867917: 252
        //          626706477: 220
        //          default: 414
        //        }
        //   252: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   255: aload_2        
        //   256: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   259: aload_2        
        //   260: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   263: aload_2        
        //   264: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   267: iload_3        
        //   268: new             Ljava/awt/Color;
        //   271: dup            
        //   272: aload           4
        //   274: goto            278
        //   277: athrow         
        //   278: invokevirtual   java/awt/Color.getRed:()I
        //   281: goto            285
        //   284: athrow         
        //   285: i2d            
        //   286: ldc2_w          0.5
        //   289: dmul           
        //   290: d2i            
        //   291: aload           4
        //   293: goto            297
        //   296: athrow         
        //   297: invokevirtual   java/awt/Color.getGreen:()I
        //   300: goto            304
        //   303: athrow         
        //   304: i2d            
        //   305: ldc2_w          0.5
        //   308: dmul           
        //   309: d2i            
        //   310: aload           4
        //   312: goto            316
        //   315: athrow         
        //   316: invokevirtual   java/awt/Color.getBlue:()I
        //   319: goto            323
        //   322: athrow         
        //   323: i2d            
        //   324: ldc2_w          0.5
        //   327: dmul           
        //   328: d2i            
        //   329: getstatic       dev/nuker/pyro/fc.1:I
        //   332: ifeq            341
        //   335: ldc_w           -1162965971
        //   338: goto            344
        //   341: ldc_w           238790580
        //   344: ldc_w           -1477027909
        //   347: ixor           
        //   348: lookupswitch {
        //          -1446121457: 376
        //          492362646: 341
        //          default: 416
        //        }
        //   376: goto            380
        //   379: athrow         
        //   380: invokespecial   java/awt/Color.<init>:(III)V
        //   383: goto            387
        //   386: athrow         
        //   387: goto            391
        //   390: athrow         
        //   391: invokevirtual   java/awt/Color.getRGB:()I
        //   394: goto            398
        //   397: athrow         
        //   398: goto            402
        //   401: athrow         
        //   402: invokevirtual   dev/nuker/pyro/fbr.c:(Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDII)V
        //   405: goto            409
        //   408: athrow         
        //   409: return         
        //   410: aconst_null    
        //   411: athrow         
        //   412: aconst_null    
        //   413: athrow         
        //   414: aconst_null    
        //   415: athrow         
        //   416: aconst_null    
        //   417: athrow         
        //   418: aconst_null    
        //   419: athrow         
        //   420: pop            
        //   421: goto            24
        //   424: pop            
        //   425: aconst_null    
        //   426: goto            420
        //   429: dup            
        //   430: ifnull          420
        //   433: checkcast       Ljava/lang/Throwable;
        //   436: athrow         
        //   437: dup            
        //   438: ifnull          424
        //   441: checkcast       Ljava/lang/Throwable;
        //   444: athrow         
        //   445: aconst_null    
        //   446: athrow         
        //    StackMapTable: 00 3D FF 00 03 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 01 07 00 45 FA 00 04 FF 00 0B 00 00 00 01 07 00 45 FF 00 03 00 04 07 00 03 07 02 27 07 02 27 01 00 00 FF 00 13 00 04 07 00 03 07 02 27 07 02 27 01 00 02 08 00 1C 08 00 1C FF 00 02 00 04 07 00 03 07 02 27 07 02 27 01 00 03 08 00 1C 08 00 1C 01 FF 00 1C 00 04 07 00 03 07 02 27 07 02 27 01 00 02 08 00 1C 08 00 1C 43 07 00 45 FF 00 00 00 04 07 00 03 07 02 27 07 02 27 01 00 03 08 00 1C 08 00 1C 01 45 07 00 45 40 07 01 AD 4B 07 01 AD FF 00 02 00 04 07 00 03 07 02 27 07 02 27 01 00 02 07 01 AD 01 5C 07 01 AD FC 00 0D 07 01 AD 42 01 1E 48 07 00 2E FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 02 07 00 FE 07 00 FE 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 02 07 00 FE 07 02 74 FF 00 16 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 05 07 00 FE 07 02 74 03 03 07 02 27 FF 00 02 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 06 07 00 FE 07 02 74 03 03 07 02 27 01 FF 00 1C 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 05 07 00 FE 07 02 74 03 03 07 02 27 58 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0C 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0C 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 4A 07 00 3C FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0D 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0D 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 4A 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 FF 00 11 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 FF 00 02 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0F 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 01 FF 00 1F 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0A 07 00 FE 07 02 74 03 03 03 03 03 03 01 07 01 AD 42 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0A 07 00 FE 07 02 74 03 03 03 03 03 03 01 07 01 AD 45 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0A 07 00 FE 07 02 74 03 03 03 03 03 03 01 01 42 07 00 45 FF 00 00 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0A 07 00 FE 07 02 74 03 03 03 03 03 03 01 01 45 07 00 45 00 00 FF 00 01 00 04 07 00 03 07 02 27 07 02 27 01 00 01 07 01 AD FF 00 01 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 05 07 00 FE 07 02 74 03 03 07 02 27 FF 00 01 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 0E 07 00 FE 07 02 74 03 03 03 03 03 03 01 08 01 0C 08 01 0C 01 01 01 FF 00 01 00 04 07 00 03 07 02 27 07 02 27 01 00 02 08 00 1C 08 00 1C 41 07 00 45 43 05 44 07 00 45 47 05 FF 00 07 00 05 07 00 03 07 02 27 07 02 27 01 07 01 AD 00 01 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     429    437    Any
        //  429    437    429    437    Ljava/lang/RuntimeException;
        //  445    447    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  80     87     87     88     Any
        //  81     87     87     88     Any
        //  80     87     80     81     Ljava/lang/NumberFormatException;
        //  81     87     80     81     Any
        //  81     87     80     81     Ljava/lang/NegativeArraySizeException;
        //  189    196    196    197    Any
        //  189    196    189    190    Ljava/lang/IllegalStateException;
        //  189    196    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  189    196    196    197    Any
        //  190    196    3      8      Any
        //  277    284    284    285    Any
        //  278    284    284    285    Ljava/lang/StringIndexOutOfBoundsException;
        //  278    284    277    278    Any
        //  278    284    277    278    Any
        //  277    284    284    285    Any
        //  296    303    303    304    Any
        //  297    303    303    304    Ljava/lang/NegativeArraySizeException;
        //  297    303    296    297    Ljava/lang/NumberFormatException;
        //  297    303    3      8      Ljava/lang/AssertionError;
        //  297    303    3      8      Ljava/lang/NullPointerException;
        //  315    322    322    323    Any
        //  316    322    315    316    Any
        //  315    322    3      8      Any
        //  316    322    315    316    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  316    322    322    323    Any
        //  380    386    386    387    Any
        //  380    386    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  380    386    3      8      Any
        //  380    386    3      8      Any
        //  380    386    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  390    397    397    398    Any
        //  391    397    3      8      Ljava/lang/ArithmeticException;
        //  391    397    390    391    Ljava/lang/ClassCastException;
        //  391    397    397    398    Ljava/lang/IllegalArgumentException;
        //  390    397    390    391    Any
        //  401    408    408    409    Any
        //  401    408    401    402    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  401    408    401    402    Any
        //  401    408    401    402    Ljava/lang/RuntimeException;
        //  402    408    408    409    Ljava/util/ConcurrentModificationException;
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
    public f0a f() {
        return fbS.0t(this, 415387630);
    }
    
    public void c(@NotNull final BlockPos blockPos) {
        fbS.3W(this, 316110028, blockPos);
    }
    
    @NotNull
    public f0d 5() {
        return fbS.g3(this, 227758775);
    }
    
    @NotNull
    public f0a 8() {
        return fbS.O(this, 938998476);
    }
    
    @NotNull
    public BlockPos 7() {
        return fbS.7M(this, 659526192);
    }
    
    public f89() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            12
        //     6: ldc_w           -733399259
        //     9: goto            15
        //    12: ldc_w           527274752
        //    15: ldc_w           177357418
        //    18: ixor           
        //    19: lookupswitch {
        //          -556042929: 1823
        //          886192899: 12
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u2222\u1486\u8b2e\ub3d6\uc95f\uec35\ub22d\ue71b\ud967\ue907"
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u2202\u1486\u8b2e\ub3d6\uc950\uec2c\ub228\ue718\ud97c"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: aconst_null    
        //    58: getstatic       dev/nuker/pyro/fc.0:I
        //    61: ifeq            70
        //    64: ldc_w           -809330433
        //    67: goto            73
        //    70: ldc_w           -1955263889
        //    73: ldc_w           -805902779
        //    76: ixor           
        //    77: lookupswitch {
        //          3440314: 70
        //          1149496362: 104
        //          default: 1805
        //        }
        //   104: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   107: aload_0        
        //   108: aload_0        
        //   109: new             Ldev/nuker/pyro/f0d;
        //   112: dup            
        //   113: ldc_w           "\u222b\u149e\u8b2f\ub3d5\uc974"
        //   116: invokestatic    invokestatic   !!! ERROR
        //   119: ldc_w           "\u220b\u1496\u8b2f\ub3cb\uc969\uec36\ub230\ue71e\ud96b\ue953\ua6c8\u1e59\ue03f\uc5b3\u819d\u88ae\u57a8\u76db\ubd38\uc0bd"
        //   122: getstatic       dev/nuker/pyro/fc.1:I
        //   125: ifeq            134
        //   128: ldc_w           -1169636333
        //   131: goto            137
        //   134: ldc_w           203612587
        //   137: ldc_w           -291158538
        //   140: ixor           
        //   141: lookupswitch {
        //          -148380123: 134
        //          1424851429: 1795
        //          default: 168
        //        }
        //   168: invokestatic    invokestatic   !!! ERROR
        //   171: aconst_null    
        //   172: ldc2_w          2.0
        //   175: ldc2_w          0.01
        //   178: ldc2_w          100.0
        //   181: dconst_0       
        //   182: bipush          64
        //   184: aconst_null    
        //   185: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   188: checkcast       Ldev/nuker/pyro/f0n;
        //   191: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   194: checkcast       Ldev/nuker/pyro/f0d;
        //   197: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f0d;
        //   200: getstatic       dev/nuker/pyro/fc.1:I
        //   203: ifeq            212
        //   206: ldc_w           1950553009
        //   209: goto            215
        //   212: ldc_w           -2063765731
        //   215: ldc_w           1192569444
        //   218: ixor           
        //   219: lookupswitch {
        //          -1008188039: 244
        //          861288917: 212
        //          default: 1825
        //        }
        //   244: aload_0        
        //   245: aload_0        
        //   246: new             Ldev/nuker/pyro/f0d;
        //   249: dup            
        //   250: ldc_w           "\u2222\u1495\u8b2e\ub3dc\uc972\uec07\ub225\ue705\ud961\ue907\ua6ea\u1e42\ue036\uc583\u819d\u88ad\u57b0"
        //   253: invokestatic    invokestatic   !!! ERROR
        //   256: ldc_w           "\u2213\u149c\u8b29\ub3cd\uc920\uec07\ub225\ue705\ud961\ue907\ua6ea\u1e42\ue036\uc5e7\u81b9\u88b7\u57aa\u7692\ubd19\uc0a6\u2ac2\uc22f"
        //   259: invokestatic    invokestatic   !!! ERROR
        //   262: aconst_null    
        //   263: ldc2_w          50.0
        //   266: ldc2_w          10.0
        //   269: ldc2_w          1000.0
        //   272: dconst_0       
        //   273: bipush          64
        //   275: aconst_null    
        //   276: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   279: checkcast       Ldev/nuker/pyro/f0n;
        //   282: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   285: checkcast       Ldev/nuker/pyro/f0d;
        //   288: putfield        dev/nuker/pyro/f89.0:Ldev/nuker/pyro/f0d;
        //   291: getstatic       dev/nuker/pyro/fc.1:I
        //   294: ifeq            303
        //   297: ldc_w           -456642156
        //   300: goto            306
        //   303: ldc_w           -1459278649
        //   306: ldc_w           1662093726
        //   309: ixor           
        //   310: lookupswitch {
        //          -2015774710: 1793
        //          494679367: 303
        //          default: 336
        //        }
        //   336: aload_0        
        //   337: getstatic       dev/nuker/pyro/fc.c:I
        //   340: ifge            349
        //   343: ldc_w           -2044406312
        //   346: goto            352
        //   349: ldc_w           529918047
        //   352: ldc_w           -932613870
        //   355: ixor           
        //   356: lookupswitch {
        //          -2046915477: 349
        //          1313711306: 1809
        //          default: 384
        //        }
        //   384: aload_0        
        //   385: new             Ldev/nuker/pyro/f0d;
        //   388: dup            
        //   389: ldc_w           "\u2222\u1485\u8b35\ub3d0\uc964\uec12\ub221\ue71e\ud96f\ue91b\ua6f1"
        //   392: invokestatic    invokestatic   !!! ERROR
        //   395: ldc_w           "\u2214\u1492\u8b36\ub3d5\uc920\uec04\ub232\ue718\ud961\ue917\ua6e4\u1e42\ue030\uc5a2\u81d4\u8889\u57a1\u76db\ubd3a\uc0a7\u2ac5"
        //   398: invokestatic    invokestatic   !!! ERROR
        //   401: aconst_null    
        //   402: ldc2_w          15.0
        //   405: dconst_0       
        //   406: ldc2_w          30.0
        //   409: dconst_0       
        //   410: bipush          64
        //   412: aconst_null    
        //   413: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   416: checkcast       Ldev/nuker/pyro/f0n;
        //   419: getstatic       dev/nuker/pyro/fc.c:I
        //   422: ifge            431
        //   425: ldc_w           276735804
        //   428: goto            434
        //   431: ldc_w           -1760279060
        //   434: ldc_w           -1761362322
        //   437: ixor           
        //   438: lookupswitch {
        //          -2021844654: 431
        //          1571714: 464
        //          default: 1799
        //        }
        //   464: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   467: checkcast       Ldev/nuker/pyro/f0d;
        //   470: putfield        dev/nuker/pyro/f89.1:Ldev/nuker/pyro/f0d;
        //   473: aload_0        
        //   474: getstatic       dev/nuker/pyro/fc.1:I
        //   477: ifeq            486
        //   480: ldc_w           -1274377011
        //   483: goto            489
        //   486: ldc_w           673683342
        //   489: ldc_w           -422122523
        //   492: ixor           
        //   493: lookupswitch {
        //          -823034773: 520
        //          1390176040: 486
        //          default: 1807
        //        }
        //   520: aload_0        
        //   521: new             Ldev/nuker/pyro/f0d;
        //   524: dup            
        //   525: ldc_w           "\u222f\u149c\u8b35\ub3c9\uc962\uec24\ub227\ue71c\ud94c\ue91a\ua6f6\u1e58"
        //   528: invokestatic    invokestatic   !!! ERROR
        //   531: ldc_w           "\u220e\u149a\u8b34\ub399\uc94c\uec2a\ub22b\ue707\ud96a\ue912\ua6e6\u1e47\ue073\uc583\u819d\u88ad\u57b0\u76d3\ubd33\uc0ac\u2ad4"
        //   534: invokestatic    invokestatic   !!! ERROR
        //   537: aconst_null    
        //   538: ldc2_w          15.0
        //   541: dconst_0       
        //   542: ldc2_w          100.0
        //   545: dconst_0       
        //   546: bipush          64
        //   548: aconst_null    
        //   549: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   552: checkcast       Ldev/nuker/pyro/f0n;
        //   555: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   558: checkcast       Ldev/nuker/pyro/f0d;
        //   561: putfield        dev/nuker/pyro/f89.2:Ldev/nuker/pyro/f0d;
        //   564: getstatic       dev/nuker/pyro/fc.c:I
        //   567: ifge            576
        //   570: ldc_w           1779618000
        //   573: goto            579
        //   576: ldc_w           1575488372
        //   579: ldc_w           -1318851646
        //   582: ixor           
        //   583: lookupswitch {
        //          -1014797526: 576
        //          -613336302: 1781
        //          default: 608
        //        }
        //   608: aload_0        
        //   609: getstatic       dev/nuker/pyro/fc.0:I
        //   612: ifeq            621
        //   615: ldc_w           125488721
        //   618: goto            624
        //   621: ldc_w           906723643
        //   624: ldc_w           1724468367
        //   627: ixor           
        //   628: lookupswitch {
        //          -1721216844: 621
        //          1639154398: 1817
        //          default: 656
        //        }
        //   656: aload_0        
        //   657: new             Ldev/nuker/pyro/f0a;
        //   660: dup            
        //   661: ldc_w           "\u2230\u149b\u8b35\ub3ce\uc942\uec2a\ub23c\ue712\ud97b"
        //   664: invokestatic    invokestatic   !!! ERROR
        //   667: ldc_w           "\u2210\u149b\u8b35\ub3ce\uc920\uec02\ub22b\ue716\ud964\ue953\ua6c7\u1e43\ue02b\uc5a2\u8187"
        //   670: invokestatic    invokestatic   !!! ERROR
        //   673: aconst_null    
        //   674: iconst_0       
        //   675: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   678: checkcast       Ldev/nuker/pyro/f0n;
        //   681: getstatic       dev/nuker/pyro/fc.0:I
        //   684: ifeq            693
        //   687: ldc_w           -844324966
        //   690: goto            696
        //   693: ldc_w           -736643490
        //   696: ldc_w           2142538400
        //   699: ixor           
        //   700: lookupswitch {
        //          -1307044550: 1787
        //          -1101734399: 693
        //          default: 728
        //        }
        //   728: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   731: checkcast       Ldev/nuker/pyro/f0a;
        //   734: getstatic       dev/nuker/pyro/fc.1:I
        //   737: ifeq            746
        //   740: ldc_w           -927617354
        //   743: goto            749
        //   746: ldc_w           -1986509161
        //   749: ldc_w           425892803
        //   752: ixor           
        //   753: lookupswitch {
        //          -1300766037: 746
        //          -774425227: 1827
        //          default: 780
        //        }
        //   780: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f0a;
        //   783: aload_0        
        //   784: aload_0        
        //   785: new             Ldev/nuker/pyro/f0d;
        //   788: dup            
        //   789: ldc_w           "\u2237\u149a\u8b37\ub3dc\uc96f\uec30\ub230"
        //   792: invokestatic    invokestatic   !!! ERROR
        //   795: ldc_w           "\u220e\u1492\u8b22\ub399\uc950\uec24\ub230\ue71f\ud928\ue927\ua6ec\u1e41\ue036"
        //   798: invokestatic    invokestatic   !!! ERROR
        //   801: aconst_null    
        //   802: ldc2_w          1.5
        //   805: dconst_0       
        //   806: ldc2_w          100.0
        //   809: dconst_0       
        //   810: bipush          64
        //   812: aconst_null    
        //   813: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   816: checkcast       Ldev/nuker/pyro/f0n;
        //   819: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   822: checkcast       Ldev/nuker/pyro/f0d;
        //   825: getstatic       dev/nuker/pyro/fc.c:I
        //   828: ifge            837
        //   831: ldc_w           296637036
        //   834: goto            840
        //   837: ldc_w           -1039830412
        //   840: ldc_w           243692213
        //   843: ixor           
        //   844: lookupswitch {
        //          -863829823: 872
        //          522723545: 837
        //          default: 1833
        //        }
        //   872: putfield        dev/nuker/pyro/f89.3:Ldev/nuker/pyro/f0d;
        //   875: aload_0        
        //   876: aload_0        
        //   877: new             Ldev/nuker/pyro/f0a;
        //   880: dup            
        //   881: ldc_w           "\u2225\u1481\u8b3f\ub3dc\uc96c\uec2a\ub22b\ue71c"
        //   884: invokestatic    invokestatic   !!! ERROR
        //   887: ldc_w           "\u2205\u1481\u8b3f\ub3dc\uc96c\uec2a\ub22b\ue71c"
        //   890: invokestatic    invokestatic   !!! ERROR
        //   893: aconst_null    
        //   894: iconst_1       
        //   895: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   898: checkcast       Ldev/nuker/pyro/f0n;
        //   901: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   904: checkcast       Ldev/nuker/pyro/f0a;
        //   907: putfield        dev/nuker/pyro/f89.0:Ldev/nuker/pyro/f0a;
        //   910: aload_0        
        //   911: aload_0        
        //   912: new             Ldev/nuker/pyro/f0a;
        //   915: dup            
        //   916: ldc_w           "\u2230\u149b\u8b35\ub3ce\uc971"
        //   919: invokestatic    invokestatic   !!! ERROR
        //   922: ldc_w           "\u2210\u149b\u8b35\ub3ce\uc920\uec14"
        //   925: invokestatic    invokestatic   !!! ERROR
        //   928: aconst_null    
        //   929: iconst_0       
        //   930: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   933: checkcast       Ldev/nuker/pyro/f0n;
        //   936: getstatic       dev/nuker/pyro/fc.1:I
        //   939: ifeq            948
        //   942: ldc_w           269641840
        //   945: goto            951
        //   948: ldc_w           1697987534
        //   951: ldc_w           -545193152
        //   954: ixor           
        //   955: lookupswitch {
        //          -812422352: 1785
        //          -576833244: 948
        //          default: 980
        //        }
        //   980: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   983: checkcast       Ldev/nuker/pyro/f0a;
        //   986: putfield        dev/nuker/pyro/f89.1:Ldev/nuker/pyro/f0a;
        //   989: getstatic       dev/nuker/pyro/fc.c:I
        //   992: ifge            1001
        //   995: ldc_w           -819095430
        //   998: goto            1004
        //  1001: ldc_w           -1928006636
        //  1004: ldc_w           -961179730
        //  1007: ixor           
        //  1008: lookupswitch {
        //          -1166457983: 1001
        //          160962516: 1829
        //          default: 1036
        //        }
        //  1036: aload_0        
        //  1037: aload_0        
        //  1038: new             Ldev/nuker/pyro/f0a;
        //  1041: dup            
        //  1042: ldc_w           "\u2230\u149b\u8b35\ub3ce\uc977"
        //  1045: getstatic       dev/nuker/pyro/fc.c:I
        //  1048: ifge            1057
        //  1051: ldc_w           937043150
        //  1054: goto            1060
        //  1057: ldc_w           -1050502242
        //  1060: ldc_w           1390448410
        //  1063: ixor           
        //  1064: lookupswitch {
        //          -1695835806: 1057
        //          1698343892: 1791
        //          default: 1092
        //        }
        //  1092: invokestatic    invokestatic   !!! ERROR
        //  1095: ldc_w           "\u2210\u149b\u8b35\ub3ce\uc920\uec12"
        //  1098: getstatic       dev/nuker/pyro/fc.1:I
        //  1101: ifeq            1110
        //  1104: ldc_w           1926272173
        //  1107: goto            1113
        //  1110: ldc_w           -994137856
        //  1113: ldc_w           -1912861039
        //  1116: ixor           
        //  1117: lookupswitch {
        //          -1244259104: 1110
        //          -13854148: 1801
        //          default: 1144
        //        }
        //  1144: invokestatic    invokestatic   !!! ERROR
        //  1147: aconst_null    
        //  1148: iconst_1       
        //  1149: getstatic       dev/nuker/pyro/fc.1:I
        //  1152: ifeq            1161
        //  1155: ldc_w           -518421609
        //  1158: goto            1164
        //  1161: ldc_w           1764505391
        //  1164: ldc_w           440974413
        //  1167: ixor           
        //  1168: lookupswitch {
        //          -78561318: 1161
        //          1935969122: 1196
        //          default: 1815
        //        }
        //  1196: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1199: checkcast       Ldev/nuker/pyro/f0n;
        //  1202: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1205: checkcast       Ldev/nuker/pyro/f0a;
        //  1208: putfield        dev/nuker/pyro/f89.2:Ldev/nuker/pyro/f0a;
        //  1211: aload_0        
        //  1212: aload_0        
        //  1213: new             Ldev/nuker/pyro/f0a;
        //  1216: dup            
        //  1217: ldc_w           "\u2230\u149b\u8b35\ub3ce\uc966"
        //  1220: getstatic       dev/nuker/pyro/fc.c:I
        //  1223: ifge            1232
        //  1226: ldc_w           1338595061
        //  1229: goto            1235
        //  1232: ldc_w           378289599
        //  1235: ldc_w           1369708558
        //  1238: ixor           
        //  1239: lookupswitch {
        //          510480123: 1813
        //          724789325: 1232
        //          default: 1264
        //        }
        //  1264: invokestatic    invokestatic   !!! ERROR
        //  1267: ldc_w           "\u2210\u149b\u8b35\ub3ce\uc920\uec03"
        //  1270: getstatic       dev/nuker/pyro/fc.0:I
        //  1273: ifeq            1282
        //  1276: ldc_w           -1371583461
        //  1279: goto            1285
        //  1282: ldc_w           -786652611
        //  1285: ldc_w           -464885360
        //  1288: ixor           
        //  1289: lookupswitch {
        //          -1160896323: 1282
        //          1249191307: 1819
        //          default: 1316
        //        }
        //  1316: invokestatic    invokestatic   !!! ERROR
        //  1319: aconst_null    
        //  1320: iconst_0       
        //  1321: getstatic       dev/nuker/pyro/fc.0:I
        //  1324: ifeq            1333
        //  1327: ldc_w           1423023084
        //  1330: goto            1336
        //  1333: ldc_w           -52627012
        //  1336: ldc_w           1365459086
        //  1339: ixor           
        //  1340: lookupswitch {
        //          95607650: 1821
        //          265530085: 1333
        //          default: 1368
        //        }
        //  1368: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1371: checkcast       Ldev/nuker/pyro/f0n;
        //  1374: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1377: checkcast       Ldev/nuker/pyro/f0a;
        //  1380: putfield        dev/nuker/pyro/f89.3:Ldev/nuker/pyro/f0a;
        //  1383: getstatic       dev/nuker/pyro/fc.1:I
        //  1386: ifeq            1395
        //  1389: ldc_w           -861366617
        //  1392: goto            1398
        //  1395: ldc_w           -2029264383
        //  1398: ldc_w           111154795
        //  1401: ixor           
        //  1402: lookupswitch {
        //          -1162924232: 1395
        //          -905412404: 1783
        //          default: 1428
        //        }
        //  1428: aload_0        
        //  1429: aload_0        
        //  1430: new             Ldev/nuker/pyro/f0a;
        //  1433: dup            
        //  1434: ldc_w           "\u2227\u1496\u8b38\ub3cc\uc967"
        //  1437: invokestatic    invokestatic   !!! ERROR
        //  1440: ldc_w           "\u2207\u1496\u8b38\ub3cc\uc967"
        //  1443: invokestatic    invokestatic   !!! ERROR
        //  1446: aconst_null    
        //  1447: iconst_0       
        //  1448: getstatic       dev/nuker/pyro/fc.c:I
        //  1451: ifge            1460
        //  1454: ldc_w           -1306727010
        //  1457: goto            1463
        //  1460: ldc_w           1255543968
        //  1463: ldc_w           92822876
        //  1466: ixor           
        //  1467: lookupswitch {
        //          -1214992190: 1460
        //          1331579388: 1492
        //          default: 1831
        //        }
        //  1492: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1495: checkcast       Ldev/nuker/pyro/f0n;
        //  1498: getstatic       dev/nuker/pyro/fc.c:I
        //  1501: ifge            1510
        //  1504: ldc_w           -1657495226
        //  1507: goto            1513
        //  1510: ldc_w           723139580
        //  1513: ldc_w           1975120407
        //  1516: ixor           
        //  1517: lookupswitch {
        //          -393391279: 1510
        //          1587792363: 1544
        //          default: 1803
        //        }
        //  1544: invokevirtual   dev/nuker/pyro/f89.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1547: checkcast       Ldev/nuker/pyro/f0a;
        //  1550: getstatic       dev/nuker/pyro/fc.0:I
        //  1553: ifeq            1562
        //  1556: ldc_w           18992805
        //  1559: goto            1565
        //  1562: ldc_w           1136403481
        //  1565: ldc_w           411915131
        //  1568: ixor           
        //  1569: lookupswitch {
        //          -434069835: 1562
        //          430743006: 1789
        //          default: 1596
        //        }
        //  1596: putfield        dev/nuker/pyro/f89.4:Ldev/nuker/pyro/f0a;
        //  1599: aload_0        
        //  1600: new             Lnet/minecraft/util/math/BlockPos;
        //  1603: dup            
        //  1604: iconst_0       
        //  1605: iconst_0       
        //  1606: iconst_0       
        //  1607: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //  1610: getstatic       dev/nuker/pyro/fc.c:I
        //  1613: ifge            1622
        //  1616: ldc_w           1475317935
        //  1619: goto            1625
        //  1622: ldc_w           -1050569303
        //  1625: ldc_w           -1805255890
        //  1628: ixor           
        //  1629: lookupswitch {
        //          -1014338687: 1779
        //          1676342864: 1622
        //          default: 1656
        //        }
        //  1656: putfield        dev/nuker/pyro/f89.c:Lnet/minecraft/util/math/BlockPos;
        //  1659: aload_0        
        //  1660: iconst_1       
        //  1661: putfield        dev/nuker/pyro/f89.0:Z
        //  1664: aload_0        
        //  1665: getstatic       dev/nuker/pyro/fc.1:I
        //  1668: ifeq            1677
        //  1671: ldc_w           579528247
        //  1674: goto            1680
        //  1677: ldc_w           1266709407
        //  1680: ldc_w           1612555855
        //  1683: ixor           
        //  1684: lookupswitch {
        //          731764176: 1712
        //          1117208696: 1677
        //          default: 1811
        //        }
        //  1712: astore_2       
        //  1713: iconst_0       
        //  1714: istore_1       
        //  1715: new             Ljava/util/ArrayList;
        //  1718: dup            
        //  1719: invokespecial   java/util/ArrayList.<init>:()V
        //  1722: checkcast       Ljava/util/List;
        //  1725: getstatic       dev/nuker/pyro/fc.1:I
        //  1728: ifeq            1737
        //  1731: ldc_w           1658730384
        //  1734: goto            1740
        //  1737: ldc_w           -1987010054
        //  1740: ldc_w           -581575492
        //  1743: ixor           
        //  1744: lookupswitch {
        //          -1081349332: 1737
        //          1422228806: 1772
        //          default: 1797
        //        }
        //  1772: astore_3       
        //  1773: aload_2        
        //  1774: aload_3        
        //  1775: putfield        dev/nuker/pyro/f89.c:Ljava/util/List;
        //  1778: return         
        //  1779: aconst_null    
        //  1780: athrow         
        //  1781: aconst_null    
        //  1782: athrow         
        //  1783: aconst_null    
        //  1784: athrow         
        //  1785: aconst_null    
        //  1786: athrow         
        //  1787: aconst_null    
        //  1788: athrow         
        //  1789: aconst_null    
        //  1790: athrow         
        //  1791: aconst_null    
        //  1792: athrow         
        //  1793: aconst_null    
        //  1794: athrow         
        //  1795: aconst_null    
        //  1796: athrow         
        //  1797: aconst_null    
        //  1798: athrow         
        //  1799: aconst_null    
        //  1800: athrow         
        //  1801: aconst_null    
        //  1802: athrow         
        //  1803: aconst_null    
        //  1804: athrow         
        //  1805: aconst_null    
        //  1806: athrow         
        //  1807: aconst_null    
        //  1808: athrow         
        //  1809: aconst_null    
        //  1810: athrow         
        //  1811: aconst_null    
        //  1812: athrow         
        //  1813: aconst_null    
        //  1814: athrow         
        //  1815: aconst_null    
        //  1816: athrow         
        //  1817: aconst_null    
        //  1818: athrow         
        //  1819: aconst_null    
        //  1820: athrow         
        //  1821: aconst_null    
        //  1822: athrow         
        //  1823: aconst_null    
        //  1824: athrow         
        //  1825: aconst_null    
        //  1826: athrow         
        //  1827: aconst_null    
        //  1828: athrow         
        //  1829: aconst_null    
        //  1830: athrow         
        //  1831: aconst_null    
        //  1832: athrow         
        //  1833: aconst_null    
        //  1834: athrow         
        //    StackMapTable: 00 70 0C 42 01 1C FF 00 19 00 01 06 00 04 06 07 03 53 07 03 53 05 FF 00 02 00 01 06 00 05 06 07 03 53 07 03 53 05 01 FF 00 1E 00 01 06 00 04 06 07 03 53 07 03 53 05 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 03 53 07 03 53 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 6D 08 00 6D 07 03 53 07 03 53 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 03 53 07 03 53 2B 42 01 1C 3A 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 2E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 B5 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 55 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 37 42 01 1C 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 24 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 B5 01 FF 00 1F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 11 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 10 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 38 00 01 07 00 03 00 02 07 00 03 07 02 A3 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 A3 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 02 A3 FF 00 4B 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 B5 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 14 42 01 1F FF 00 14 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 FF 00 11 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 05 01 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 05 01 FF 00 23 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 FF 00 11 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 05 01 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 05 01 1A 42 01 1D FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 05 96 08 05 96 07 03 53 07 03 53 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 05 96 08 05 96 07 03 53 07 03 53 05 01 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 05 96 08 05 96 07 03 53 07 03 53 05 01 FF 00 11 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 B5 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 11 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 10 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 19 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 9B 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 9B 54 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 18 00 03 07 00 03 01 07 00 03 00 01 07 00 CD FF 00 02 00 03 07 00 03 01 07 00 03 00 02 07 00 CD 01 5F 07 00 CD FF 00 06 00 01 07 00 03 00 02 07 00 03 07 00 9B 01 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 03 53 07 03 53 FF 00 01 00 03 07 00 03 01 07 00 03 00 01 07 00 CD FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 B5 FF 00 01 00 01 06 00 04 06 07 03 53 07 03 53 05 FF 00 01 00 01 07 00 03 00 01 07 00 03 41 07 00 03 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 0E 08 04 0E 07 03 53 07 03 53 05 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 04 BD 08 04 BD 07 03 53 07 03 53 05 01 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 10 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 05 96 08 05 96 07 03 53 07 03 53 05 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 A3
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
    public f0a 1() {
        return fbS.v(this, 488264035);
    }
    
    @NotNull
    public f0a a() {
        return fbS.P(this, 1520801137);
    }
    
    public boolean 0(@NotNull final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          5863
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            5855
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            5847
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/f8F.c:Ldev/nuker/pyro/f8a;
        //    29: aload_0        
        //    30: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //    33: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    36: dup            
        //    37: pop            
        //    38: goto            42
        //    41: athrow         
        //    42: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //    45: goto            49
        //    48: athrow         
        //    49: dup            
        //    50: pop            
        //    51: getstatic       dev/nuker/pyro/fc.0:I
        //    54: ifeq            63
        //    57: ldc_w           546664361
        //    60: goto            66
        //    63: ldc_w           -791190235
        //    66: ldc_w           2057036639
        //    69: ixor           
        //    70: lookupswitch {
        //          272131247: 63
        //          1510903030: 5782
        //          default: 96
        //        }
        //    96: aload_1        
        //    97: getstatic       dev/nuker/pyro/fc.1:I
        //   100: ifeq            109
        //   103: ldc_w           1055178158
        //   106: goto            112
        //   109: ldc_w           1374972371
        //   112: ldc_w           -108392878
        //   115: ixor           
        //   116: lookupswitch {
        //          -949046276: 5812
        //          363520687: 109
        //          default: 144
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   dev/nuker/pyro/f8a.c:(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/math/BlockPos;)Z
        //   151: goto            155
        //   154: athrow         
        //   155: ifeq            160
        //   158: iconst_1       
        //   159: ireturn        
        //   160: nop            
        //   161: aload_0        
        //   162: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   165: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   168: dup            
        //   169: pop            
        //   170: goto            174
        //   173: athrow         
        //   174: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   177: goto            181
        //   180: athrow         
        //   181: getstatic       dev/nuker/pyro/fc.c:I
        //   184: ifge            193
        //   187: ldc_w           -1872136631
        //   190: goto            196
        //   193: ldc_w           -1949824688
        //   196: ldc_w           97684381
        //   199: ixor           
        //   200: lookupswitch {
        //          -1910865203: 228
        //          -1782841900: 193
        //          default: 5710
        //        }
        //   228: getfield        net/minecraft/util/math/AxisAlignedBB.field_72337_e:D
        //   231: aload_1        
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   239: goto            243
        //   242: athrow         
        //   243: iconst_1       
        //   244: iadd           
        //   245: i2d            
        //   246: dcmpg          
        //   247: ifge            3646
        //   250: aload_0        
        //   251: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   254: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   257: dup            
        //   258: pop            
        //   259: getstatic       dev/nuker/pyro/fc.0:I
        //   262: ifeq            271
        //   265: ldc_w           1542024676
        //   268: goto            274
        //   271: ldc_w           974789765
        //   274: ldc_w           507663944
        //   277: ixor           
        //   278: lookupswitch {
        //          107869292: 271
        //          1168849836: 5814
        //          default: 304
        //        }
        //   304: goto            308
        //   307: athrow         
        //   308: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   311: goto            315
        //   314: athrow         
        //   315: getstatic       dev/nuker/pyro/fc.0:I
        //   318: ifeq            327
        //   321: ldc_w           -1929176603
        //   324: goto            330
        //   327: ldc_w           1870617709
        //   330: ldc_w           659548037
        //   333: ixor           
        //   334: lookupswitch {
        //          -1437794720: 327
        //          1211153384: 360
        //          default: 5730
        //        }
        //   360: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   363: aload_1        
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   371: goto            375
        //   374: athrow         
        //   375: i2d            
        //   376: dcmpl          
        //   377: ifle            3646
        //   380: getstatic       dev/nuker/pyro/fc.c:I
        //   383: ifge            392
        //   386: ldc_w           -46839442
        //   389: goto            395
        //   392: ldc_w           -1804279907
        //   395: ldc_w           1983769143
        //   398: ixor           
        //   399: lookupswitch {
        //          -1962368167: 5816
        //          -1838106506: 392
        //          default: 424
        //        }
        //   424: aload_0        
        //   425: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   428: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   431: aload_0        
        //   432: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   435: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   438: dup            
        //   439: pop            
        //   440: getstatic       dev/nuker/pyro/fc.1:I
        //   443: ifeq            452
        //   446: ldc_w           1546604731
        //   449: goto            455
        //   452: ldc_w           862403625
        //   455: ldc_w           1131045343
        //   458: ixor           
        //   459: lookupswitch {
        //          524628324: 5722
        //          1827143809: 452
        //          default: 484
        //        }
        //   484: goto            488
        //   487: athrow         
        //   488: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70090_H:()Z
        //   491: goto            495
        //   494: athrow         
        //   495: ifne            504
        //   498: ldc_w           -631274960
        //   501: goto            507
        //   504: ldc_w           -631274953
        //   507: ldc_w           -881014365
        //   510: ixor           
        //   511: tableswitch {
        //          575051558: 532
        //          575051559: 636
        //          default: 498
        //        }
        //   532: aload_0        
        //   533: getstatic       dev/nuker/pyro/fc.1:I
        //   536: ifeq            545
        //   539: ldc_w           -52301213
        //   542: goto            548
        //   545: ldc_w           2031344517
        //   548: ldc_w           -358671820
        //   551: ixor           
        //   552: lookupswitch {
        //          -1153596457: 545
        //          377415767: 5762
        //          default: 580
        //        }
        //   580: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   583: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   586: dup            
        //   587: pop            
        //   588: goto            592
        //   591: athrow         
        //   592: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180799_ab:()Z
        //   595: goto            599
        //   598: athrow         
        //   599: ifeq            608
        //   602: ldc_w           1675399333
        //   605: goto            611
        //   608: ldc_w           1675399334
        //   611: ldc_w           -1494838108
        //   614: ixor           
        //   615: tableswitch {
        //          -1972107262: 636
        //          -1972107261: 640
        //          default: 602
        //        }
        //   636: dconst_0       
        //   637: goto            759
        //   640: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //   643: ldc_w           "\u2225\u1492\u8b36\ub197\ucf9d\uec36\ub234\ue712\udb2f\uefd5"
        //   646: goto            650
        //   649: athrow         
        //   650: invokestatic    invokestatic   !!! ERROR
        //   653: goto            657
        //   656: athrow         
        //   657: getstatic       dev/nuker/pyro/fc.1:I
        //   660: ifeq            669
        //   663: ldc_w           109450908
        //   666: goto            672
        //   669: ldc_w           1454657415
        //   672: ldc_w           -699065085
        //   675: ixor           
        //   676: lookupswitch {
        //          -2132716924: 704
        //          -791475297: 669
        //          default: 5716
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokevirtual   dev/nuker/pyro/f7p.1:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   711: goto            715
        //   714: athrow         
        //   715: dup            
        //   716: ifnonnull       730
        //   719: goto            723
        //   722: athrow         
        //   723: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   726: goto            730
        //   729: athrow         
        //   730: checkcast       Ldev/nuker/pyro/f0d;
        //   733: goto            737
        //   736: athrow         
        //   737: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   740: goto            744
        //   743: athrow         
        //   744: checkcast       Ljava/lang/Number;
        //   747: goto            751
        //   750: athrow         
        //   751: invokevirtual   java/lang/Number.doubleValue:()D
        //   754: goto            758
        //   757: athrow         
        //   758: dneg           
        //   759: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //   762: getstatic       dev/nuker/pyro/fc.c:I
        //   765: ifge            774
        //   768: ldc_w           1645303500
        //   771: goto            777
        //   774: ldc_w           -625134901
        //   777: ldc_w           -1375856879
        //   780: ixor           
        //   781: lookupswitch {
        //          -806403619: 5700
        //          -473600085: 774
        //          default: 808
        //        }
        //   808: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //   811: aload_1        
        //   812: goto            816
        //   815: athrow         
        //   816: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   819: goto            823
        //   822: athrow         
        //   823: i2d            
        //   824: aload_0        
        //   825: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   828: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   831: goto            835
        //   834: athrow         
        //   835: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   838: goto            842
        //   841: athrow         
        //   842: f2d            
        //   843: dadd           
        //   844: goto            848
        //   847: athrow         
        //   848: invokevirtual   dev/nuker/pyro/f7p.2:(D)V
        //   851: goto            855
        //   854: athrow         
        //   855: aload_0        
        //   856: getfield        dev/nuker/pyro/f89.0:Ldev/nuker/pyro/f0a;
        //   859: goto            863
        //   862: athrow         
        //   863: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   866: goto            870
        //   869: athrow         
        //   870: checkcast       Ljava/lang/Boolean;
        //   873: goto            877
        //   876: athrow         
        //   877: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   880: goto            884
        //   883: athrow         
        //   884: ifeq            1790
        //   887: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //   890: ldc_w           "\u222e\u149c\u8b3e\ub19e"
        //   893: goto            897
        //   896: athrow         
        //   897: invokestatic    invokestatic   !!! ERROR
        //   900: goto            904
        //   903: athrow         
        //   904: goto            908
        //   907: athrow         
        //   908: invokevirtual   dev/nuker/pyro/f7p.1:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   911: goto            915
        //   914: athrow         
        //   915: checkcast       Ldev/nuker/pyro/f0q;
        //   918: getstatic       dev/nuker/pyro/fc.1:I
        //   921: ifeq            930
        //   924: ldc_w           1503786301
        //   927: goto            933
        //   930: ldc_w           -1211409247
        //   933: ldc_w           378720549
        //   936: ixor           
        //   937: lookupswitch {
        //          1328751640: 5748
        //          2116800386: 930
        //          default: 964
        //        }
        //   964: getstatic       dev/nuker/pyro/f7n.0:Ldev/nuker/pyro/f7n;
        //   967: checkcast       Ljava/lang/Enum;
        //   970: ldc_w           "\u223a\u1492\u8b2d\ub1a4\ucfb1\uec35\ub22b\ue718\udb2c\uefd8\ua6eb\u1e4b"
        //   973: goto            977
        //   976: athrow         
        //   977: invokestatic    invokestatic   !!! ERROR
        //   980: goto            984
        //   983: athrow         
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   dev/nuker/pyro/f0q.c:(Ljava/lang/Enum;Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //   991: goto            995
        //   994: athrow         
        //   995: dup            
        //   996: ifnonnull       1055
        //   999: getstatic       dev/nuker/pyro/fc.1:I
        //  1002: ifeq            1011
        //  1005: ldc_w           -1968067572
        //  1008: goto            1014
        //  1011: ldc_w           1048642619
        //  1014: ldc_w           -641580239
        //  1017: ixor           
        //  1018: lookupswitch {
        //          -415021302: 1044
        //          1400106813: 1011
        //          default: 5764
        //        }
        //  1044: goto            1048
        //  1047: athrow         
        //  1048: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1051: goto            1055
        //  1054: athrow         
        //  1055: checkcast       Ldev/nuker/pyro/f0a;
        //  1058: goto            1062
        //  1061: athrow         
        //  1062: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1065: goto            1069
        //  1068: athrow         
        //  1069: checkcast       Ljava/lang/Boolean;
        //  1072: goto            1076
        //  1075: athrow         
        //  1076: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1079: goto            1083
        //  1082: athrow         
        //  1083: ifeq            1205
        //  1086: aload_0        
        //  1087: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  1090: getstatic       dev/nuker/pyro/fc.1:I
        //  1093: ifeq            1102
        //  1096: ldc_w           -1910910907
        //  1099: goto            1105
        //  1102: ldc_w           2066461588
        //  1105: ldc_w           1038683620
        //  1108: ixor           
        //  1109: lookupswitch {
        //          -1276060255: 5776
        //          699091208: 1102
        //          default: 1136
        //        }
        //  1136: goto            1140
        //  1139: athrow         
        //  1140: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  1143: goto            1147
        //  1146: athrow         
        //  1147: new             Lnet/minecraft/util/math/Vec3d;
        //  1150: dup            
        //  1151: aload_1        
        //  1152: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  1162: goto            1166
        //  1165: athrow         
        //  1166: ldc2_w          0.5
        //  1169: ldc2_w          0.5
        //  1172: ldc2_w          0.5
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  1182: goto            1186
        //  1185: athrow         
        //  1186: dup            
        //  1187: pop            
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec2f;
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  1202: putfield        dev/nuker/pyro/f89.0:F
        //  1205: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  1208: getstatic       dev/nuker/pyro/fc.0:I
        //  1211: ifeq            1220
        //  1214: ldc_w           -147762107
        //  1217: goto            1223
        //  1220: ldc_w           -1155332675
        //  1223: ldc_w           -1804335175
        //  1226: ixor           
        //  1227: lookupswitch {
        //          794231300: 1252
        //          1665487868: 1220
        //          default: 5768
        //        }
        //  1252: goto            1256
        //  1255: athrow         
        //  1256: invokevirtual   dev/nuker/pyro/f7p.3:()Ldev/nuker/pyro/f0k;
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: ldc_w           "\u2233\u149a\u8b2e\ub198\ucfaa\uec1a\ub237\ue707\udb25\uefde\ua6e3\u1e45\ue03d\uc7e2"
        //  1266: getstatic       dev/nuker/pyro/fc.c:I
        //  1269: ifge            1278
        //  1272: ldc_w           -1364907492
        //  1275: goto            1281
        //  1278: ldc_w           1753301460
        //  1281: ldc_w           817596325
        //  1284: ixor           
        //  1285: lookupswitch {
        //          -1642156615: 5834
        //          -414248139: 1278
        //          default: 1312
        //        }
        //  1312: goto            1316
        //  1315: athrow         
        //  1316: invokestatic    invokestatic   !!! ERROR
        //  1319: goto            1323
        //  1322: athrow         
        //  1323: goto            1327
        //  1326: athrow         
        //  1327: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  1330: goto            1334
        //  1333: athrow         
        //  1334: dup            
        //  1335: ifnonnull       1395
        //  1338: getstatic       dev/nuker/pyro/fc.c:I
        //  1341: ifge            1350
        //  1344: ldc_w           950236663
        //  1347: goto            1353
        //  1350: ldc_w           -404124743
        //  1353: ldc_w           1291524397
        //  1356: ixor           
        //  1357: lookupswitch {
        //          452861026: 1350
        //          1951952090: 5780
        //          default: 1384
        //        }
        //  1384: goto            1388
        //  1387: athrow         
        //  1388: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1391: goto            1395
        //  1394: athrow         
        //  1395: checkcast       Ldev/nuker/pyro/f0a;
        //  1398: goto            1402
        //  1401: athrow         
        //  1402: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1405: goto            1409
        //  1408: athrow         
        //  1409: checkcast       Ljava/lang/Boolean;
        //  1412: getstatic       dev/nuker/pyro/fc.0:I
        //  1415: ifeq            1424
        //  1418: ldc_w           -100018412
        //  1421: goto            1427
        //  1424: ldc_w           -1918850960
        //  1427: ldc_w           -876354750
        //  1430: ixor           
        //  1431: lookupswitch {
        //          -1694211564: 1424
        //          835335254: 5692
        //          default: 1456
        //        }
        //  1456: goto            1460
        //  1459: athrow         
        //  1460: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: ifeq            2483
        //  1470: getstatic       dev/nuker/pyro/fc.0:I
        //  1473: ifeq            1482
        //  1476: ldc_w           -1286659296
        //  1479: goto            1485
        //  1482: ldc_w           770993070
        //  1485: ldc_w           -78533469
        //  1488: ixor           
        //  1489: lookupswitch {
        //          428701272: 1482
        //          1209962371: 5824
        //          default: 1516
        //        }
        //  1516: aload_0        
        //  1517: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  1520: goto            1524
        //  1523: athrow         
        //  1524: invokevirtual   dev/nuker/pyro/f7p.3:()Ldev/nuker/pyro/f0k;
        //  1527: goto            1531
        //  1530: athrow         
        //  1531: ldc_w           "\u2233\u149a\u8b2e\ub198\ucfaa"
        //  1534: getstatic       dev/nuker/pyro/fc.1:I
        //  1537: ifeq            1546
        //  1540: ldc_w           967217729
        //  1543: goto            1549
        //  1546: ldc_w           -1138290142
        //  1549: ldc_w           -1807778929
        //  1552: ixor           
        //  1553: lookupswitch {
        //          -1382422066: 1546
        //          672688557: 1580
        //          default: 5724
        //        }
        //  1580: goto            1584
        //  1583: athrow         
        //  1584: invokestatic    invokestatic   !!! ERROR
        //  1587: goto            1591
        //  1590: athrow         
        //  1591: goto            1595
        //  1594: athrow         
        //  1595: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  1598: goto            1602
        //  1601: athrow         
        //  1602: dup            
        //  1603: ifnonnull       1663
        //  1606: getstatic       dev/nuker/pyro/fc.0:I
        //  1609: ifeq            1618
        //  1612: ldc_w           1354437395
        //  1615: goto            1621
        //  1618: ldc_w           2025523303
        //  1621: ldc_w           1906613684
        //  1624: ixor           
        //  1625: lookupswitch {
        //          -786624580: 1618
        //          555716263: 5728
        //          default: 1652
        //        }
        //  1652: goto            1656
        //  1655: athrow         
        //  1656: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: checkcast       Ldev/nuker/pyro/f0d;
        //  1666: getstatic       dev/nuker/pyro/fc.0:I
        //  1669: ifeq            1678
        //  1672: ldc_w           -1955886384
        //  1675: goto            1681
        //  1678: ldc_w           368752584
        //  1681: ldc_w           -795616975
        //  1684: ixor           
        //  1685: lookupswitch {
        //          -342928876: 1678
        //          1543001057: 5712
        //          default: 1712
        //        }
        //  1712: goto            1716
        //  1715: athrow         
        //  1716: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1719: goto            1723
        //  1722: athrow         
        //  1723: checkcast       Ljava/lang/Number;
        //  1726: getstatic       dev/nuker/pyro/fc.1:I
        //  1729: ifeq            1738
        //  1732: ldc_w           -217734617
        //  1735: goto            1741
        //  1738: ldc_w           -849876491
        //  1741: ldc_w           -969514349
        //  1744: ixor           
        //  1745: lookupswitch {
        //          190942054: 1772
        //          892584116: 1738
        //          default: 5740
        //        }
        //  1772: goto            1776
        //  1775: athrow         
        //  1776: invokevirtual   java/lang/Number.doubleValue:()D
        //  1779: goto            1783
        //  1782: athrow         
        //  1783: d2f            
        //  1784: putfield        dev/nuker/pyro/f89.c:F
        //  1787: goto            2483
        //  1790: aload_0        
        //  1791: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  1794: getstatic       dev/nuker/pyro/fc.0:I
        //  1797: ifeq            1806
        //  1800: ldc_w           -29930272
        //  1803: goto            1809
        //  1806: ldc_w           -151498861
        //  1809: ldc_w           917604882
        //  1812: ixor           
        //  1813: lookupswitch {
        //          -930691342: 5800
        //          17661930: 1806
        //          default: 1840
        //        }
        //  1840: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1843: getstatic       dev/nuker/pyro/fc.c:I
        //  1846: ifge            1855
        //  1849: ldc_w           415944122
        //  1852: goto            1858
        //  1855: ldc_w           -1102666497
        //  1858: ldc_w           2060728561
        //  1861: ixor           
        //  1862: lookupswitch {
        //          -997024754: 1888
        //          1646196043: 1855
        //          default: 5708
        //        }
        //  1888: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  1891: ldc_w           "\u222e\u149c\u8b3e\ub19e"
        //  1894: goto            1898
        //  1897: athrow         
        //  1898: invokestatic    invokestatic   !!! ERROR
        //  1901: goto            1905
        //  1904: athrow         
        //  1905: goto            1909
        //  1908: athrow         
        //  1909: invokevirtual   dev/nuker/pyro/f7p.1:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  1912: goto            1916
        //  1915: athrow         
        //  1916: dup            
        //  1917: ifnonnull       1931
        //  1920: goto            1924
        //  1923: athrow         
        //  1924: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1927: goto            1931
        //  1930: athrow         
        //  1931: checkcast       Ldev/nuker/pyro/f0q;
        //  1934: ldc_w           "\u2233\u149a\u8b2e\ub198\ucfaa"
        //  1937: goto            1941
        //  1940: athrow         
        //  1941: invokestatic    invokestatic   !!! ERROR
        //  1944: goto            1948
        //  1947: athrow         
        //  1948: goto            1952
        //  1951: athrow         
        //  1952: invokevirtual   dev/nuker/pyro/f0q.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  1955: goto            1959
        //  1958: athrow         
        //  1959: dup            
        //  1960: ifnonnull       1969
        //  1963: ldc_w           -1587646047
        //  1966: goto            1972
        //  1969: ldc_w           -1587646048
        //  1972: ldc_w           -1349381723
        //  1975: ixor           
        //  1976: tableswitch {
        //          496549896: 2000
        //          496549897: 2055
        //          default: 1963
        //        }
        //  2000: getstatic       dev/nuker/pyro/fc.0:I
        //  2003: ifeq            2012
        //  2006: ldc_w           -481355316
        //  2009: goto            2015
        //  2012: ldc_w           1250556887
        //  2015: ldc_w           2097449273
        //  2018: ixor           
        //  2019: lookupswitch {
        //          -1639214859: 2012
        //          932016878: 2044
        //          default: 5786
        //        }
        //  2044: goto            2048
        //  2047: athrow         
        //  2048: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2051: goto            2055
        //  2054: athrow         
        //  2055: checkcast       Ldev/nuker/pyro/f0d;
        //  2058: goto            2062
        //  2061: athrow         
        //  2062: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2065: goto            2069
        //  2068: athrow         
        //  2069: checkcast       Ljava/lang/Number;
        //  2072: goto            2076
        //  2075: athrow         
        //  2076: invokevirtual   java/lang/Number.doubleValue:()D
        //  2079: goto            2083
        //  2082: athrow         
        //  2083: d2f            
        //  2084: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //  2087: getstatic       dev/nuker/pyro/fc.c:I
        //  2090: ifge            2099
        //  2093: ldc_w           2060898229
        //  2096: goto            2102
        //  2099: ldc_w           1420142351
        //  2102: ldc_w           -419668152
        //  2105: ixor           
        //  2106: lookupswitch {
        //          -1674931971: 2099
        //          -1302726585: 2132
        //          default: 5766
        //        }
        //  2132: aload_0        
        //  2133: getstatic       dev/nuker/pyro/fc.0:I
        //  2136: ifeq            2145
        //  2139: ldc_w           1123273023
        //  2142: goto            2148
        //  2145: ldc_w           1934230587
        //  2148: ldc_w           486939396
        //  2151: ixor           
        //  2152: lookupswitch {
        //          1609945659: 2145
        //          1850482495: 2180
        //          default: 5714
        //        }
        //  2180: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2183: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2186: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  2189: getstatic       dev/nuker/pyro/fc.0:I
        //  2192: ifeq            2201
        //  2195: ldc_w           896004011
        //  2198: goto            2204
        //  2201: ldc_w           -282905204
        //  2204: ldc_w           675326977
        //  2207: ixor           
        //  2208: lookupswitch {
        //          -949773939: 2236
        //          489112490: 2201
        //          default: 5754
        //        }
        //  2236: goto            2240
        //  2239: athrow         
        //  2240: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  2243: goto            2247
        //  2246: athrow         
        //  2247: new             Lnet/minecraft/util/math/Vec3d;
        //  2250: dup            
        //  2251: getstatic       dev/nuker/pyro/fc.c:I
        //  2254: ifge            2263
        //  2257: ldc_w           357303610
        //  2260: goto            2266
        //  2263: ldc_w           -1306019135
        //  2266: ldc_w           -130177864
        //  2269: ixor           
        //  2270: lookupswitch {
        //          -311320190: 5694
        //          463220695: 2263
        //          default: 2296
        //        }
        //  2296: aload_1        
        //  2297: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  2300: goto            2304
        //  2303: athrow         
        //  2304: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  2307: goto            2311
        //  2310: athrow         
        //  2311: ldc2_w          0.5
        //  2314: ldc2_w          0.5
        //  2317: ldc2_w          0.5
        //  2320: getstatic       dev/nuker/pyro/fc.1:I
        //  2323: ifeq            2332
        //  2326: ldc_w           -517431520
        //  2329: goto            2335
        //  2332: ldc_w           -42411348
        //  2335: ldc_w           1724673267
        //  2338: ixor           
        //  2339: lookupswitch {
        //          -2015038509: 2332
        //          -1682655649: 2364
        //          default: 5804
        //        }
        //  2364: goto            2368
        //  2367: athrow         
        //  2368: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  2371: goto            2375
        //  2374: athrow         
        //  2375: dup            
        //  2376: pop            
        //  2377: goto            2381
        //  2380: athrow         
        //  2381: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec2f;
        //  2384: goto            2388
        //  2387: athrow         
        //  2388: getstatic       dev/nuker/pyro/fc.c:I
        //  2391: ifge            2400
        //  2394: ldc_w           -1634048137
        //  2397: goto            2403
        //  2400: ldc_w           -641783551
        //  2403: ldc_w           2006854524
        //  2406: ixor           
        //  2407: lookupswitch {
        //          -385594357: 5820
        //          -10713724: 2400
        //          default: 2432
        //        }
        //  2432: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  2435: getstatic       dev/nuker/pyro/fc.0:I
        //  2438: ifeq            2447
        //  2441: ldc_w           -454576016
        //  2444: goto            2450
        //  2447: ldc_w           -1797050402
        //  2450: ldc_w           2087511186
        //  2453: ixor           
        //  2454: lookupswitch {
        //          -1735697182: 2447
        //          -393229492: 2480
        //          default: 5788
        //        }
        //  2480: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //  2483: getstatic       dev/nuker/pyro/fc.1:I
        //  2486: ifeq            2495
        //  2489: ldc_w           -986684181
        //  2492: goto            2498
        //  2495: ldc_w           -1666738434
        //  2498: ldc_w           -1434968245
        //  2501: ixor           
        //  2502: lookupswitch {
        //          920619445: 2528
        //          1867021216: 2495
        //          default: 5696
        //        }
        //  2528: aload_0        
        //  2529: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2532: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2535: aload_0        
        //  2536: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2539: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2542: dup            
        //  2543: pop            
        //  2544: goto            2548
        //  2547: athrow         
        //  2548: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70090_H:()Z
        //  2551: goto            2555
        //  2554: athrow         
        //  2555: ifne            2719
        //  2558: getstatic       dev/nuker/pyro/fc.1:I
        //  2561: ifeq            2570
        //  2564: ldc_w           -1197061644
        //  2567: goto            2573
        //  2570: ldc_w           -33483954
        //  2573: ldc_w           -312097500
        //  2576: ixor           
        //  2577: lookupswitch {
        //          268594231: 2570
        //          1438878928: 5770
        //          default: 2604
        //        }
        //  2604: aload_0        
        //  2605: getstatic       dev/nuker/pyro/fc.c:I
        //  2608: ifge            2617
        //  2611: ldc_w           353817771
        //  2614: goto            2620
        //  2617: ldc_w           -1287711961
        //  2620: ldc_w           -5186243
        //  2623: ixor           
        //  2624: lookupswitch {
        //          -358217322: 2617
        //          1284492826: 2652
        //          default: 5750
        //        }
        //  2652: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2655: getstatic       dev/nuker/pyro/fc.c:I
        //  2658: ifge            2667
        //  2661: ldc_w           -67727159
        //  2664: goto            2670
        //  2667: ldc_w           572477785
        //  2670: ldc_w           -930310534
        //  2673: ixor           
        //  2674: lookupswitch {
        //          -359413981: 2700
        //          863635123: 2667
        //          default: 5772
        //        }
        //  2700: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2703: dup            
        //  2704: pop            
        //  2705: goto            2709
        //  2708: athrow         
        //  2709: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180799_ab:()Z
        //  2712: goto            2716
        //  2715: athrow         
        //  2716: ifeq            2723
        //  2719: dconst_0       
        //  2720: goto            2842
        //  2723: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  2726: ldc_w           "\u2225\u1492\u8b36\ub197\ucf9d\uec36\ub234\ue712\udb2f\uefd5"
        //  2729: getstatic       dev/nuker/pyro/fc.0:I
        //  2732: ifeq            2741
        //  2735: ldc_w           -1628921741
        //  2738: goto            2744
        //  2741: ldc_w           1838007909
        //  2744: ldc_w           -668578527
        //  2747: ixor           
        //  2748: lookupswitch {
        //          -439649557: 2741
        //          1187966290: 5796
        //          default: 2776
        //        }
        //  2776: goto            2780
        //  2779: athrow         
        //  2780: invokestatic    invokestatic   !!! ERROR
        //  2783: goto            2787
        //  2786: athrow         
        //  2787: goto            2791
        //  2790: athrow         
        //  2791: invokevirtual   dev/nuker/pyro/f7p.1:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  2794: goto            2798
        //  2797: athrow         
        //  2798: dup            
        //  2799: ifnonnull       2813
        //  2802: goto            2806
        //  2805: athrow         
        //  2806: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2809: goto            2813
        //  2812: athrow         
        //  2813: checkcast       Ldev/nuker/pyro/f0d;
        //  2816: goto            2820
        //  2819: athrow         
        //  2820: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2823: goto            2827
        //  2826: athrow         
        //  2827: checkcast       Ljava/lang/Number;
        //  2830: goto            2834
        //  2833: athrow         
        //  2834: invokevirtual   java/lang/Number.doubleValue:()D
        //  2837: goto            2841
        //  2840: athrow         
        //  2841: dneg           
        //  2842: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2845: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  2848: aload_0        
        //  2849: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2852: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2855: dup            
        //  2856: pop            
        //  2857: iconst_1       
        //  2858: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  2861: goto            2865
        //  2864: athrow         
        //  2865: invokevirtual   dev/nuker/pyro/f7p.0:()Ldev/nuker/pyro/f0d;
        //  2868: goto            2872
        //  2871: athrow         
        //  2872: goto            2876
        //  2875: athrow         
        //  2876: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2879: goto            2883
        //  2882: athrow         
        //  2883: checkcast       Ljava/lang/Number;
        //  2886: goto            2890
        //  2889: athrow         
        //  2890: invokevirtual   java/lang/Number.doubleValue:()D
        //  2893: goto            2897
        //  2896: athrow         
        //  2897: dstore_2       
        //  2898: aload_0        
        //  2899: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  2902: getstatic       dev/nuker/pyro/fc.c:I
        //  2905: ifge            2914
        //  2908: ldc_w           414230663
        //  2911: goto            2917
        //  2914: ldc_w           -1443720585
        //  2917: ldc_w           -1081363498
        //  2920: ixor           
        //  2921: lookupswitch {
        //          -1489298607: 5684
        //          264648072: 2914
        //          default: 2948
        //        }
        //  2948: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2951: fconst_1       
        //  2952: goto            2956
        //  2955: athrow         
        //  2956: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174824_e:(F)Lnet/minecraft/util/math/Vec3d;
        //  2959: goto            2963
        //  2962: athrow         
        //  2963: aload_1        
        //  2964: goto            2968
        //  2967: athrow         
        //  2968: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  2971: goto            2975
        //  2974: athrow         
        //  2975: i2d            
        //  2976: ldc2_w          0.5
        //  2979: dadd           
        //  2980: aload_1        
        //  2981: goto            2985
        //  2984: athrow         
        //  2985: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  2988: goto            2992
        //  2991: athrow         
        //  2992: i2d            
        //  2993: ldc2_w          0.5
        //  2996: dadd           
        //  2997: aload_1        
        //  2998: getstatic       dev/nuker/pyro/fc.1:I
        //  3001: ifeq            3010
        //  3004: ldc_w           -187073926
        //  3007: goto            3013
        //  3010: ldc_w           987727056
        //  3013: ldc_w           -189610745
        //  3016: ixor           
        //  3017: lookupswitch {
        //          7061373: 5792
        //          1815166704: 3010
        //          default: 3044
        //        }
        //  3044: goto            3048
        //  3047: athrow         
        //  3048: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  3051: goto            3055
        //  3054: athrow         
        //  3055: i2d            
        //  3056: ldc2_w          0.5
        //  3059: dadd           
        //  3060: goto            3064
        //  3063: athrow         
        //  3064: invokevirtual   net/minecraft/util/math/Vec3d.func_186679_c:(DDD)D
        //  3067: goto            3071
        //  3070: athrow         
        //  3071: dstore          4
        //  3073: istore          10
        //  3075: astore          9
        //  3077: astore          8
        //  3079: iconst_0       
        //  3080: getstatic       dev/nuker/pyro/fc.1:I
        //  3083: ifeq            3092
        //  3086: ldc_w           1419464023
        //  3089: goto            3095
        //  3092: ldc_w           242760958
        //  3095: ldc_w           -1826342887
        //  3098: ixor           
        //  3099: lookupswitch {
        //          -1654913817: 3124
        //          -943753906: 3092
        //          default: 5832
        //        }
        //  3124: istore          6
        //  3126: getstatic       dev/nuker/pyro/fc.1:I
        //  3129: ifeq            3138
        //  3132: ldc_w           -1552203816
        //  3135: goto            3141
        //  3138: ldc_w           518781169
        //  3141: ldc_w           313274746
        //  3144: ixor           
        //  3145: lookupswitch {
        //          -1311306078: 3138
        //          206031243: 3172
        //          default: 5774
        //        }
        //  3172: dload           4
        //  3174: goto            3178
        //  3177: athrow         
        //  3178: invokestatic    java/lang/Math.sqrt:(D)D
        //  3181: goto            3185
        //  3184: athrow         
        //  3185: dstore          11
        //  3187: aload           8
        //  3189: aload           9
        //  3191: iload           10
        //  3193: getstatic       dev/nuker/pyro/fc.0:I
        //  3196: ifeq            3205
        //  3199: ldc_w           486530980
        //  3202: goto            3208
        //  3205: ldc_w           -723536769
        //  3208: ldc_w           1381443831
        //  3211: ixor           
        //  3212: lookupswitch {
        //          -2037867384: 3240
        //          1319696211: 3205
        //          default: 5808
        //        }
        //  3240: dload           11
        //  3242: dstore          4
        //  3244: getstatic       dev/nuker/pyro/fc.c:I
        //  3247: ifge            3256
        //  3250: ldc_w           -256834394
        //  3253: goto            3259
        //  3256: ldc_w           -421012562
        //  3259: ldc_w           1037130446
        //  3262: ixor           
        //  3263: lookupswitch {
        //          -849322392: 3256
        //          -617184928: 3288
        //          default: 5688
        //        }
        //  3288: istore          10
        //  3290: getstatic       dev/nuker/pyro/fc.c:I
        //  3293: ifge            3302
        //  3296: ldc_w           -932766155
        //  3299: goto            3305
        //  3302: ldc_w           -1635588027
        //  3305: ldc_w           2078010107
        //  3308: ixor           
        //  3309: lookupswitch {
        //          -2143017148: 3302
        //          -1279462194: 5826
        //          default: 3336
        //        }
        //  3336: astore          9
        //  3338: astore          8
        //  3340: iconst_0       
        //  3341: istore          6
        //  3343: dload_2        
        //  3344: dload           4
        //  3346: goto            3350
        //  3349: athrow         
        //  3350: invokestatic    java/lang/Math.min:(DD)D
        //  3353: goto            3357
        //  3356: athrow         
        //  3357: dstore          11
        //  3359: aload           8
        //  3361: aload           9
        //  3363: iload           10
        //  3365: dload           11
        //  3367: d2f            
        //  3368: ldc_w           0.9
        //  3371: fmul           
        //  3372: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  3375: getstatic       dev/nuker/pyro/fc.0:I
        //  3378: ifeq            3387
        //  3381: ldc_w           540673814
        //  3384: goto            3390
        //  3387: ldc_w           1245827027
        //  3390: ldc_w           1764077068
        //  3393: ixor           
        //  3394: lookupswitch {
        //          593781215: 3420
        //          1226811674: 3387
        //          default: 5830
        //        }
        //  3420: goto            3424
        //  3423: athrow         
        //  3424: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  3427: goto            3431
        //  3430: athrow         
        //  3431: new             Lnet/minecraft/util/math/Vec3d;
        //  3434: dup            
        //  3435: aload_1        
        //  3436: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  3439: goto            3443
        //  3442: athrow         
        //  3443: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  3446: goto            3450
        //  3449: athrow         
        //  3450: ldc2_w          0.5
        //  3453: ldc2_w          0.5
        //  3456: ldc2_w          0.5
        //  3459: goto            3463
        //  3462: athrow         
        //  3463: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  3466: goto            3470
        //  3469: athrow         
        //  3470: dup            
        //  3471: pop            
        //  3472: goto            3476
        //  3475: athrow         
        //  3476: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec2f;
        //  3479: goto            3483
        //  3482: athrow         
        //  3483: getstatic       dev/nuker/pyro/fc.0:I
        //  3486: ifeq            3495
        //  3489: ldc_w           1295562958
        //  3492: goto            3498
        //  3495: ldc_w           689545951
        //  3498: ldc_w           -1894755214
        //  3501: ixor           
        //  3502: lookupswitch {
        //          -1896669099: 3495
        //          -1037505348: 5756
        //          default: 3528
        //        }
        //  3528: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  3531: f2d            
        //  3532: getstatic       dev/nuker/pyro/fc.c:I
        //  3535: ifge            3544
        //  3538: ldc_w           -932607054
        //  3541: goto            3547
        //  3544: ldc_w           440152332
        //  3547: ldc_w           1303696323
        //  3550: ixor           
        //  3551: lookupswitch {
        //          -2049091471: 3544
        //          1468588751: 3576
        //          default: 5784
        //        }
        //  3576: goto            3580
        //  3579: athrow         
        //  3580: invokestatic    java/lang/Math.toRadians:(D)D
        //  3583: goto            3587
        //  3586: athrow         
        //  3587: d2f            
        //  3588: getstatic       dev/nuker/pyro/fc.1:I
        //  3591: ifeq            3600
        //  3594: ldc_w           -54563137
        //  3597: goto            3603
        //  3600: ldc_w           -881975425
        //  3603: ldc_w           -399116946
        //  3606: ixor           
        //  3607: lookupswitch {
        //          344628177: 3600
        //          593226257: 3632
        //          default: 5746
        //        }
        //  3632: goto            3636
        //  3635: athrow         
        //  3636: invokevirtual   dev/nuker/pyro/f7p.c:(Lnet/minecraft/client/entity/EntityPlayerSP;ZFF)V
        //  3639: goto            3643
        //  3642: athrow         
        //  3643: goto            5682
        //  3646: aload_0        
        //  3647: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  3650: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3653: dup            
        //  3654: pop            
        //  3655: goto            3659
        //  3658: athrow         
        //  3659: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  3662: goto            3666
        //  3665: athrow         
        //  3666: getstatic       dev/nuker/pyro/fc.1:I
        //  3669: ifeq            3678
        //  3672: ldc_w           180870286
        //  3675: goto            3681
        //  3678: ldc_w           788972764
        //  3681: ldc_w           -1445531972
        //  3684: ixor           
        //  3685: lookupswitch {
        //          -1559154126: 5836
        //          -244973701: 3678
        //          default: 3712
        //        }
        //  3712: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //  3715: aload_1        
        //  3716: goto            3720
        //  3719: athrow         
        //  3720: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  3723: goto            3727
        //  3726: athrow         
        //  3727: i2d            
        //  3728: dcmpl          
        //  3729: iflt            3738
        //  3732: ldc_w           927066695
        //  3735: goto            3741
        //  3738: ldc_w           927066694
        //  3741: ldc_w           -1318239305
        //  3744: ixor           
        //  3745: tableswitch {
        //          207180768: 3768
        //          207180769: 5638
        //          default: 3732
        //        }
        //  3768: getstatic       dev/nuker/pyro/fc.c:I
        //  3771: ifge            3780
        //  3774: ldc_w           -410098523
        //  3777: goto            3783
        //  3780: ldc_w           1867377327
        //  3783: ldc_w           1296623125
        //  3786: ixor           
        //  3787: lookupswitch {
        //          -1429830992: 5744
        //          342397484: 3780
        //          default: 3812
        //        }
        //  3812: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  3815: goto            3819
        //  3818: athrow         
        //  3819: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  3822: goto            3826
        //  3825: athrow         
        //  3826: new             Lnet/minecraft/util/math/Vec3d;
        //  3829: dup            
        //  3830: aload_1        
        //  3831: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  3834: getstatic       dev/nuker/pyro/fc.0:I
        //  3837: ifeq            3846
        //  3840: ldc_w           1341953966
        //  3843: goto            3849
        //  3846: ldc_w           -509904732
        //  3849: ldc_w           1991929910
        //  3852: ixor           
        //  3853: lookupswitch {
        //          955321605: 3846
        //          960948120: 5818
        //          default: 3880
        //        }
        //  3880: goto            3884
        //  3883: athrow         
        //  3884: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  3887: goto            3891
        //  3890: athrow         
        //  3891: ldc2_w          0.5
        //  3894: ldc2_w          0.5
        //  3897: ldc2_w          0.5
        //  3900: getstatic       dev/nuker/pyro/fc.c:I
        //  3903: ifge            3912
        //  3906: ldc_w           -1346580406
        //  3909: goto            3915
        //  3912: ldc_w           1808116508
        //  3915: ldc_w           2128694250
        //  3918: ixor           
        //  3919: lookupswitch {
        //          -1309758208: 3912
        //          -782394464: 5828
        //          default: 3944
        //        }
        //  3944: goto            3948
        //  3947: athrow         
        //  3948: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  3951: goto            3955
        //  3954: athrow         
        //  3955: dup            
        //  3956: pop            
        //  3957: goto            3961
        //  3960: athrow         
        //  3961: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec2f;
        //  3964: goto            3968
        //  3967: athrow         
        //  3968: astore_2       
        //  3969: aload_0        
        //  3970: getfield        dev/nuker/pyro/f89.0:Ldev/nuker/pyro/f0a;
        //  3973: goto            3977
        //  3976: athrow         
        //  3977: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  3980: goto            3984
        //  3983: athrow         
        //  3984: checkcast       Ljava/lang/Boolean;
        //  3987: goto            3991
        //  3990: athrow         
        //  3991: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3994: goto            3998
        //  3997: athrow         
        //  3998: ifeq            4007
        //  4001: ldc_w           -1426377471
        //  4004: goto            4010
        //  4007: ldc_w           -1426376962
        //  4010: ldc_w           -1449007874
        //  4013: ixor           
        //  4014: tableswitch {
        //          112567294: 4036
        //          112567295: 4609
        //          default: 4001
        //        }
        //  4036: getstatic       dev/nuker/pyro/fc.1:I
        //  4039: ifeq            4048
        //  4042: ldc_w           -1378279401
        //  4045: goto            4051
        //  4048: ldc_w           2101623085
        //  4051: ldc_w           -1354905073
        //  4054: ixor           
        //  4055: lookupswitch {
        //          48556568: 5736
        //          1609335463: 4048
        //          default: 4080
        //        }
        //  4080: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  4083: goto            4087
        //  4086: athrow         
        //  4087: invokevirtual   dev/nuker/pyro/f7p.3:()Ldev/nuker/pyro/f0k;
        //  4090: goto            4094
        //  4093: athrow         
        //  4094: ldc_w           "\u2233\u149a\u8b2e\ub198\ucfaa\uec1a\ub237\ue707\udb25\uefde\ua6e3\u1e45\ue03d\uc7e2"
        //  4097: goto            4101
        //  4100: athrow         
        //  4101: invokestatic    invokestatic   !!! ERROR
        //  4104: goto            4108
        //  4107: athrow         
        //  4108: goto            4112
        //  4111: athrow         
        //  4112: invokevirtual   dev/nuker/pyro/f0k.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  4115: goto            4119
        //  4118: athrow         
        //  4119: dup            
        //  4120: ifnonnull       4179
        //  4123: getstatic       dev/nuker/pyro/fc.1:I
        //  4126: ifeq            4135
        //  4129: ldc_w           -881119756
        //  4132: goto            4138
        //  4135: ldc_w           -1510586325
        //  4138: ldc_w           611962095
        //  4141: ixor           
        //  4142: lookupswitch {
        //          -1037136920: 4135
        //          -285023973: 5698
        //          default: 4168
        //        }
        //  4168: goto            4172
        //  4171: athrow         
        //  4172: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  4175: goto            4179
        //  4178: athrow         
        //  4179: checkcast       Ldev/nuker/pyro/f0a;
        //  4182: goto            4186
        //  4185: athrow         
        //  4186: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4189: goto            4193
        //  4192: athrow         
        //  4193: checkcast       Ljava/lang/Boolean;
        //  4196: goto            4200
        //  4199: athrow         
        //  4200: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4203: goto            4207
        //  4206: athrow         
        //  4207: ifeq            4307
        //  4210: aload_0        
        //  4211: aload_2        
        //  4212: getstatic       dev/nuker/pyro/fc.c:I
        //  4215: ifge            4224
        //  4218: ldc_w           -91629509
        //  4221: goto            4227
        //  4224: ldc_w           303964483
        //  4227: ldc_w           110193983
        //  4230: ixor           
        //  4231: lookupswitch {
        //          -65489660: 4224
        //          344935548: 4256
        //          default: 5806
        //        }
        //  4256: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //  4259: getstatic       dev/nuker/pyro/fc.1:I
        //  4262: ifeq            4271
        //  4265: ldc_w           72948748
        //  4268: goto            4274
        //  4271: ldc_w           702911351
        //  4274: ldc_w           -602279753
        //  4277: ixor           
        //  4278: lookupswitch {
        //          -666833733: 4271
        //          -168008768: 4304
        //          default: 5718
        //        }
        //  4304: putfield        dev/nuker/pyro/f89.c:F
        //  4307: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  4310: ldc_w           "\u222e\u149c\u8b3e\ub19e"
        //  4313: goto            4317
        //  4316: athrow         
        //  4317: invokestatic    invokestatic   !!! ERROR
        //  4320: goto            4324
        //  4323: athrow         
        //  4324: goto            4328
        //  4327: athrow         
        //  4328: invokevirtual   dev/nuker/pyro/f7p.1:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  4331: goto            4335
        //  4334: athrow         
        //  4335: checkcast       Ldev/nuker/pyro/f0q;
        //  4338: getstatic       dev/nuker/pyro/f7n.0:Ldev/nuker/pyro/f7n;
        //  4341: checkcast       Ljava/lang/Enum;
        //  4344: ldc_w           "\u223a\u1492\u8b2d\ub1a4\ucfb1\uec35\ub22b\ue718\udb2c\uefd8\ua6eb\u1e4b"
        //  4347: getstatic       dev/nuker/pyro/fc.0:I
        //  4350: ifeq            4359
        //  4353: ldc_w           -983718471
        //  4356: goto            4362
        //  4359: ldc_w           19578346
        //  4362: ldc_w           2088736890
        //  4365: ixor           
        //  4366: lookupswitch {
        //          -1188938301: 5778
        //          730131431: 4359
        //          default: 4392
        //        }
        //  4392: goto            4396
        //  4395: athrow         
        //  4396: invokestatic    invokestatic   !!! ERROR
        //  4399: goto            4403
        //  4402: athrow         
        //  4403: goto            4407
        //  4406: athrow         
        //  4407: invokevirtual   dev/nuker/pyro/f0q.c:(Ljava/lang/Enum;Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //  4410: goto            4414
        //  4413: athrow         
        //  4414: dup            
        //  4415: ifnonnull       4429
        //  4418: goto            4422
        //  4421: athrow         
        //  4422: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  4425: goto            4429
        //  4428: athrow         
        //  4429: checkcast       Ldev/nuker/pyro/f0a;
        //  4432: getstatic       dev/nuker/pyro/fc.1:I
        //  4435: ifeq            4444
        //  4438: ldc_w           -1950880545
        //  4441: goto            4447
        //  4444: ldc_w           1466459960
        //  4447: ldc_w           -1783514671
        //  4450: ixor           
        //  4451: lookupswitch {
        //          471466587: 4444
        //          503731470: 5758
        //          default: 4476
        //        }
        //  4476: goto            4480
        //  4479: athrow         
        //  4480: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4483: goto            4487
        //  4486: athrow         
        //  4487: checkcast       Ljava/lang/Boolean;
        //  4490: goto            4494
        //  4493: athrow         
        //  4494: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4497: goto            4501
        //  4500: athrow         
        //  4501: ifeq            4775
        //  4504: aload_0        
        //  4505: getstatic       dev/nuker/pyro/fc.0:I
        //  4508: ifeq            4517
        //  4511: ldc_w           -983800441
        //  4514: goto            4520
        //  4517: ldc_w           1698080746
        //  4520: ldc_w           1753849189
        //  4523: ixor           
        //  4524: lookupswitch {
        //          -1378486046: 4517
        //          230636175: 4552
        //          default: 5734
        //        }
        //  4552: aload_2        
        //  4553: getstatic       dev/nuker/pyro/fc.c:I
        //  4556: ifge            4565
        //  4559: ldc_w           -407943621
        //  4562: goto            4568
        //  4565: ldc_w           1282210838
        //  4568: ldc_w           -90322528
        //  4571: ixor           
        //  4572: lookupswitch {
        //          471686562: 4565
        //          489852827: 5752
        //          default: 4600
        //        }
        //  4600: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  4603: putfield        dev/nuker/pyro/f89.0:F
        //  4606: goto            4775
        //  4609: aload_0        
        //  4610: getstatic       dev/nuker/pyro/fc.c:I
        //  4613: ifge            4622
        //  4616: ldc_w           -1802651753
        //  4619: goto            4625
        //  4622: ldc_w           1441658274
        //  4625: ldc_w           1377579537
        //  4628: ixor           
        //  4629: lookupswitch {
        //          -963541626: 5720
        //          1375747805: 4622
        //          default: 4656
        //        }
        //  4656: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  4659: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4662: aload_2        
        //  4663: getstatic       dev/nuker/pyro/fc.0:I
        //  4666: ifeq            4675
        //  4669: ldc_w           138678399
        //  4672: goto            4678
        //  4675: ldc_w           -634627
        //  4678: ldc_w           -99361808
        //  4681: ixor           
        //  4682: lookupswitch {
        //          -229127281: 4675
        //          98929421: 4708
        //          default: 5706
        //        }
        //  4708: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //  4711: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //  4714: aload_0        
        //  4715: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  4718: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4721: getstatic       dev/nuker/pyro/fc.c:I
        //  4724: ifge            4733
        //  4727: ldc_w           1054958190
        //  4730: goto            4736
        //  4733: ldc_w           -178786699
        //  4736: ldc_w           2114783185
        //  4739: ixor           
        //  4740: lookupswitch {
        //          -1956976220: 4768
        //          1089234367: 4733
        //          default: 5822
        //        }
        //  4768: aload_2        
        //  4769: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  4772: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //  4775: getstatic       dev/nuker/pyro/fc.1:I
        //  4778: ifeq            4787
        //  4781: ldc_w           31986967
        //  4784: goto            4790
        //  4787: ldc_w           46975176
        //  4790: ldc_w           1923306665
        //  4793: ixor           
        //  4794: lookupswitch {
        //          382994860: 4787
        //          1934311870: 5760
        //          default: 4820
        //        }
        //  4820: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  4823: iconst_1       
        //  4824: putfield        dev/nuker/pyro/f7p.c:Z
        //  4827: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  4830: aload_0        
        //  4831: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  4834: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4837: dup            
        //  4838: pop            
        //  4839: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  4842: goto            4846
        //  4845: athrow         
        //  4846: invokevirtual   dev/nuker/pyro/f7p.8:()Ldev/nuker/pyro/f0d;
        //  4849: goto            4853
        //  4852: athrow         
        //  4853: goto            4857
        //  4856: athrow         
        //  4857: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  4860: goto            4864
        //  4863: athrow         
        //  4864: checkcast       Ljava/lang/Number;
        //  4867: goto            4871
        //  4870: athrow         
        //  4871: invokevirtual   java/lang/Number.doubleValue:()D
        //  4874: goto            4878
        //  4877: athrow         
        //  4878: dstore_3       
        //  4879: aload_0        
        //  4880: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  4883: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4886: fconst_1       
        //  4887: goto            4891
        //  4890: athrow         
        //  4891: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174824_e:(F)Lnet/minecraft/util/math/Vec3d;
        //  4894: goto            4898
        //  4897: athrow         
        //  4898: aload_1        
        //  4899: getstatic       dev/nuker/pyro/fc.0:I
        //  4902: ifeq            4911
        //  4905: ldc_w           1325347907
        //  4908: goto            4914
        //  4911: ldc_w           1564085113
        //  4914: ldc_w           -2013495462
        //  4917: ixor           
        //  4918: lookupswitch {
        //          -922531047: 5742
        //          947862199: 4911
        //          default: 4944
        //        }
        //  4944: goto            4948
        //  4947: athrow         
        //  4948: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  4951: goto            4955
        //  4954: athrow         
        //  4955: i2d            
        //  4956: ldc2_w          0.5
        //  4959: dadd           
        //  4960: aload_1        
        //  4961: getstatic       dev/nuker/pyro/fc.1:I
        //  4964: ifeq            4973
        //  4967: ldc_w           152246151
        //  4970: goto            4976
        //  4973: ldc_w           -1718137179
        //  4976: ldc_w           -466232395
        //  4979: ixor           
        //  4980: lookupswitch {
        //          -316224462: 4973
        //          2107806992: 5008
        //          default: 5810
        //        }
        //  5008: goto            5012
        //  5011: athrow         
        //  5012: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  5015: goto            5019
        //  5018: athrow         
        //  5019: i2d            
        //  5020: ldc2_w          0.5
        //  5023: dadd           
        //  5024: aload_1        
        //  5025: goto            5029
        //  5028: athrow         
        //  5029: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  5032: goto            5036
        //  5035: athrow         
        //  5036: i2d            
        //  5037: ldc2_w          0.5
        //  5040: dadd           
        //  5041: getstatic       dev/nuker/pyro/fc.c:I
        //  5044: ifge            5053
        //  5047: ldc_w           -970466233
        //  5050: goto            5056
        //  5053: ldc_w           415869158
        //  5056: ldc_w           -31382427
        //  5059: ixor           
        //  5060: lookupswitch {
        //          -1227576916: 5053
        //          939980834: 5690
        //          default: 5088
        //        }
        //  5088: goto            5092
        //  5091: athrow         
        //  5092: invokevirtual   net/minecraft/util/math/Vec3d.func_186679_c:(DDD)D
        //  5095: goto            5099
        //  5098: athrow         
        //  5099: getstatic       dev/nuker/pyro/fc.c:I
        //  5102: ifge            5111
        //  5105: ldc_w           1154903382
        //  5108: goto            5114
        //  5111: ldc_w           -1829397604
        //  5114: ldc_w           -381835314
        //  5117: ixor           
        //  5118: lookupswitch {
        //          -1377056104: 5111
        //          2076720210: 5144
        //          default: 5726
        //        }
        //  5144: dstore          5
        //  5146: astore          9
        //  5148: astore          8
        //  5150: iconst_0       
        //  5151: getstatic       dev/nuker/pyro/fc.c:I
        //  5154: ifge            5163
        //  5157: ldc_w           -1794203138
        //  5160: goto            5166
        //  5163: ldc_w           144320359
        //  5166: ldc_w           -1968591335
        //  5169: ixor           
        //  5170: lookupswitch {
        //          -341019905: 5163
        //          531042279: 5686
        //          default: 5196
        //        }
        //  5196: istore          7
        //  5198: getstatic       dev/nuker/pyro/fc.c:I
        //  5201: ifge            5210
        //  5204: ldc_w           1065716212
        //  5207: goto            5213
        //  5210: ldc_w           1190528494
        //  5213: ldc_w           645632118
        //  5216: ixor           
        //  5217: lookupswitch {
        //          436083074: 5738
        //          1403568606: 5210
        //          default: 5244
        //        }
        //  5244: dload           5
        //  5246: goto            5250
        //  5249: athrow         
        //  5250: invokestatic    java/lang/Math.sqrt:(D)D
        //  5253: goto            5257
        //  5256: athrow         
        //  5257: getstatic       dev/nuker/pyro/fc.0:I
        //  5260: ifeq            5269
        //  5263: ldc_w           -190693367
        //  5266: goto            5272
        //  5269: ldc_w           719532958
        //  5272: ldc_w           -621813389
        //  5275: ixor           
        //  5276: lookupswitch {
        //          -645304125: 5269
        //          776839546: 5790
        //          default: 5304
        //        }
        //  5304: dstore          10
        //  5306: aload           8
        //  5308: aload           9
        //  5310: dload           10
        //  5312: getstatic       dev/nuker/pyro/fc.0:I
        //  5315: ifeq            5324
        //  5318: ldc_w           -257741392
        //  5321: goto            5327
        //  5324: ldc_w           1100754691
        //  5327: ldc_w           -1643324851
        //  5330: ixor           
        //  5331: lookupswitch {
        //          -1936795589: 5324
        //          1857026045: 5702
        //          default: 5356
        //        }
        //  5356: dstore          5
        //  5358: getstatic       dev/nuker/pyro/fc.1:I
        //  5361: ifeq            5370
        //  5364: ldc_w           274869497
        //  5367: goto            5373
        //  5370: ldc_w           475180536
        //  5373: ldc_w           1094775319
        //  5376: ixor           
        //  5377: lookupswitch {
        //          1361239790: 5370
        //          1561485295: 5404
        //          default: 5732
        //        }
        //  5404: astore          9
        //  5406: getstatic       dev/nuker/pyro/fc.0:I
        //  5409: ifeq            5418
        //  5412: ldc_w           1985849730
        //  5415: goto            5421
        //  5418: ldc_w           1423889041
        //  5421: ldc_w           181706995
        //  5424: ixor           
        //  5425: lookupswitch {
        //          1577742946: 5452
        //          2089355633: 5418
        //          default: 5794
        //        }
        //  5452: astore          8
        //  5454: iconst_0       
        //  5455: istore          7
        //  5457: dload_3        
        //  5458: dload           5
        //  5460: getstatic       dev/nuker/pyro/fc.0:I
        //  5463: ifeq            5472
        //  5466: ldc_w           -1269074561
        //  5469: goto            5475
        //  5472: ldc_w           1336621270
        //  5475: ldc_w           559964173
        //  5478: ixor           
        //  5479: lookupswitch {
        //          -1791289998: 5472
        //          1858820315: 5504
        //          default: 5704
        //        }
        //  5504: goto            5508
        //  5507: athrow         
        //  5508: invokestatic    java/lang/Math.min:(DD)D
        //  5511: goto            5515
        //  5514: athrow         
        //  5515: getstatic       dev/nuker/pyro/fc.1:I
        //  5518: ifeq            5527
        //  5521: ldc_w           800874032
        //  5524: goto            5530
        //  5527: ldc_w           1692710008
        //  5530: ldc_w           1400841173
        //  5533: ixor           
        //  5534: lookupswitch {
        //          932943789: 5560
        //          2093186533: 5527
        //          default: 5798
        //        }
        //  5560: dstore          10
        //  5562: aload           8
        //  5564: aload           9
        //  5566: dload           10
        //  5568: ldc2_w          0.9
        //  5571: dmul           
        //  5572: aload_2        
        //  5573: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //  5576: aload_2        
        //  5577: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //  5580: getstatic       dev/nuker/pyro/fc.c:I
        //  5583: ifge            5592
        //  5586: ldc_w           -2046956011
        //  5589: goto            5595
        //  5592: ldc_w           1073613338
        //  5595: ldc_w           -1736526838
        //  5598: ixor           
        //  5599: lookupswitch {
        //          -1310504337: 5592
        //          495147551: 5802
        //          default: 5624
        //        }
        //  5624: goto            5628
        //  5627: athrow         
        //  5628: invokevirtual   dev/nuker/pyro/f7p.c:(Lnet/minecraft/client/entity/EntityPlayerSP;DFF)V
        //  5631: goto            5635
        //  5634: athrow         
        //  5635: goto            5682
        //  5638: ldc_w           "\u2231\u1496\u8b39\ub19a\ucfae\uec26"
        //  5641: goto            5645
        //  5644: athrow         
        //  5645: invokestatic    invokestatic   !!! ERROR
        //  5648: goto            5652
        //  5651: athrow         
        //  5652: astore_2       
        //  5653: iconst_0       
        //  5654: istore_3       
        //  5655: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //  5658: aload_2        
        //  5659: goto            5663
        //  5662: athrow         
        //  5663: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
        //  5666: goto            5670
        //  5669: athrow         
        //  5670: aload_0        
        //  5671: goto            5675
        //  5674: athrow         
        //  5675: invokevirtual   dev/nuker/pyro/f89.d:()V
        //  5678: goto            5682
        //  5681: athrow         
        //  5682: iconst_0       
        //  5683: ireturn        
        //  5684: aconst_null    
        //  5685: athrow         
        //  5686: aconst_null    
        //  5687: athrow         
        //  5688: aconst_null    
        //  5689: athrow         
        //  5690: aconst_null    
        //  5691: athrow         
        //  5692: aconst_null    
        //  5693: athrow         
        //  5694: aconst_null    
        //  5695: athrow         
        //  5696: aconst_null    
        //  5697: athrow         
        //  5698: aconst_null    
        //  5699: athrow         
        //  5700: aconst_null    
        //  5701: athrow         
        //  5702: aconst_null    
        //  5703: athrow         
        //  5704: aconst_null    
        //  5705: athrow         
        //  5706: aconst_null    
        //  5707: athrow         
        //  5708: aconst_null    
        //  5709: athrow         
        //  5710: aconst_null    
        //  5711: athrow         
        //  5712: aconst_null    
        //  5713: athrow         
        //  5714: aconst_null    
        //  5715: athrow         
        //  5716: aconst_null    
        //  5717: athrow         
        //  5718: aconst_null    
        //  5719: athrow         
        //  5720: aconst_null    
        //  5721: athrow         
        //  5722: aconst_null    
        //  5723: athrow         
        //  5724: aconst_null    
        //  5725: athrow         
        //  5726: aconst_null    
        //  5727: athrow         
        //  5728: aconst_null    
        //  5729: athrow         
        //  5730: aconst_null    
        //  5731: athrow         
        //  5732: aconst_null    
        //  5733: athrow         
        //  5734: aconst_null    
        //  5735: athrow         
        //  5736: aconst_null    
        //  5737: athrow         
        //  5738: aconst_null    
        //  5739: athrow         
        //  5740: aconst_null    
        //  5741: athrow         
        //  5742: aconst_null    
        //  5743: athrow         
        //  5744: aconst_null    
        //  5745: athrow         
        //  5746: aconst_null    
        //  5747: athrow         
        //  5748: aconst_null    
        //  5749: athrow         
        //  5750: aconst_null    
        //  5751: athrow         
        //  5752: aconst_null    
        //  5753: athrow         
        //  5754: aconst_null    
        //  5755: athrow         
        //  5756: aconst_null    
        //  5757: athrow         
        //  5758: aconst_null    
        //  5759: athrow         
        //  5760: aconst_null    
        //  5761: athrow         
        //  5762: aconst_null    
        //  5763: athrow         
        //  5764: aconst_null    
        //  5765: athrow         
        //  5766: aconst_null    
        //  5767: athrow         
        //  5768: aconst_null    
        //  5769: athrow         
        //  5770: aconst_null    
        //  5771: athrow         
        //  5772: aconst_null    
        //  5773: athrow         
        //  5774: aconst_null    
        //  5775: athrow         
        //  5776: aconst_null    
        //  5777: athrow         
        //  5778: aconst_null    
        //  5779: athrow         
        //  5780: aconst_null    
        //  5781: athrow         
        //  5782: aconst_null    
        //  5783: athrow         
        //  5784: aconst_null    
        //  5785: athrow         
        //  5786: aconst_null    
        //  5787: athrow         
        //  5788: aconst_null    
        //  5789: athrow         
        //  5790: aconst_null    
        //  5791: athrow         
        //  5792: aconst_null    
        //  5793: athrow         
        //  5794: aconst_null    
        //  5795: athrow         
        //  5796: aconst_null    
        //  5797: athrow         
        //  5798: aconst_null    
        //  5799: athrow         
        //  5800: aconst_null    
        //  5801: athrow         
        //  5802: aconst_null    
        //  5803: athrow         
        //  5804: aconst_null    
        //  5805: athrow         
        //  5806: aconst_null    
        //  5807: athrow         
        //  5808: aconst_null    
        //  5809: athrow         
        //  5810: aconst_null    
        //  5811: athrow         
        //  5812: aconst_null    
        //  5813: athrow         
        //  5814: aconst_null    
        //  5815: athrow         
        //  5816: aconst_null    
        //  5817: athrow         
        //  5818: aconst_null    
        //  5819: athrow         
        //  5820: aconst_null    
        //  5821: athrow         
        //  5822: aconst_null    
        //  5823: athrow         
        //  5824: aconst_null    
        //  5825: athrow         
        //  5826: aconst_null    
        //  5827: athrow         
        //  5828: aconst_null    
        //  5829: athrow         
        //  5830: aconst_null    
        //  5831: athrow         
        //  5832: aconst_null    
        //  5833: athrow         
        //  5834: aconst_null    
        //  5835: athrow         
        //  5836: aconst_null    
        //  5837: athrow         
        //  5838: pop            
        //  5839: goto            24
        //  5842: pop            
        //  5843: aconst_null    
        //  5844: goto            5838
        //  5847: dup            
        //  5848: ifnull          5838
        //  5851: checkcast       Ljava/lang/Throwable;
        //  5854: athrow         
        //  5855: dup            
        //  5856: ifnull          5842
        //  5859: checkcast       Ljava/lang/Throwable;
        //  5862: athrow         
        //  5863: aconst_null    
        //  5864: athrow         
        //    StackMapTable: 03 1B 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FD 00 03 07 00 03 07 00 9B 50 07 00 2C FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 6C 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 6C 07 03 74 FF 00 0D 00 02 07 00 03 07 00 9B 00 02 07 03 6C 07 03 74 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 03 6C 07 03 74 01 FF 00 1D 00 02 07 00 03 07 00 9B 00 02 07 03 6C 07 03 74 FF 00 0C 00 02 07 00 03 07 00 9B 00 03 07 03 6C 07 03 74 07 00 9B FF 00 02 00 02 07 00 03 07 00 9B 00 04 07 03 6C 07 03 74 07 00 9B 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 03 07 03 6C 07 03 74 07 00 9B 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 6C 07 03 74 07 00 9B 45 07 00 45 40 01 04 4C 07 00 45 40 07 00 94 45 07 00 45 40 07 03 74 4B 07 03 74 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 03 74 01 5F 07 03 74 46 07 00 2C FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 07 00 9B 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 01 5B 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 5D 07 00 94 42 07 00 34 40 07 00 94 45 07 00 45 40 07 03 74 4B 07 03 74 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 03 74 01 5D 07 03 74 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 07 00 9B 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 01 10 42 01 1C FF 00 1B 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 00 94 01 FF 00 1C 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 42 07 00 34 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 42 07 00 94 45 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 58 07 00 94 FF 00 0C 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 4A 07 00 2A FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 42 07 00 94 45 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 58 07 00 94 43 07 00 94 FF 00 08 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 0B 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 02 00 02 07 00 03 07 00 9B 00 04 07 00 94 07 03 A4 07 03 53 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 38 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 A3 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 CF 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 AA 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 03 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 03 0E 42 01 1E 46 07 00 34 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 07 00 9B 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 01 FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 A4 03 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 A4 03 02 44 07 00 24 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 03 45 07 00 45 00 46 07 00 2C 40 07 01 10 45 07 00 45 40 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 01 07 01 14 45 07 00 45 40 01 4B 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 07 03 53 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 A4 07 03 53 45 07 00 45 40 07 02 B5 4E 07 03 BF FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 03 BF 01 5E 07 03 BF 4B 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 BF 07 03 C9 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 BF 07 03 C9 07 03 53 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 03 BF 07 03 C9 07 03 53 45 07 00 45 40 07 02 B5 4F 07 02 B5 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 02 B5 01 5D 07 02 B5 42 07 00 3A 40 07 02 B5 45 07 00 45 40 07 02 B5 45 07 00 45 40 07 01 10 45 07 00 45 40 07 00 CF 45 07 00 45 40 07 01 14 45 07 00 45 40 01 FF 00 12 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 DB FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 DB 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 DB 42 07 00 3E FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 DB 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 D3 4A 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 05 07 00 03 07 03 D3 08 04 7B 08 04 7B 07 00 99 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 D3 07 02 27 FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 06 07 00 03 07 03 D3 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 D3 07 02 27 FF 00 04 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 D3 07 02 27 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 E3 05 4E 07 03 A4 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 03 A4 01 5C 07 03 A4 42 07 00 2C 40 07 03 A4 45 07 00 45 40 07 03 F5 FF 00 0E 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 03 F5 07 03 53 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 45 07 00 45 40 07 02 B5 4F 07 02 B5 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 02 B5 01 5E 07 02 B5 42 07 00 45 40 07 02 B5 45 07 00 45 40 07 02 B5 45 07 00 3E 40 07 01 10 45 07 00 45 40 07 00 CF 4E 07 01 14 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 01 14 01 5C 07 01 14 42 07 00 45 40 07 01 14 45 07 00 45 40 01 0E 42 01 1E 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 A4 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 F5 FF 00 0E 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 FF 00 02 00 02 07 00 03 07 00 9B 00 04 07 00 03 07 03 F5 07 03 53 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 42 07 00 34 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 42 07 00 2C FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 FF 00 0F 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 02 B5 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 42 07 00 2C FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 FF 00 0E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 A3 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 02 A3 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 A3 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 A3 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 00 CF FF 00 0E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 AA FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 AA 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 AA 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 AA 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 03 03 06 4F 07 00 E6 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 E6 01 5E 07 00 E6 4E 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 5D 07 00 94 48 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 42 07 00 34 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 48 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 BF 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 BF 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 BF 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 03 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 05 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 02 B5 01 FF 00 1B 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 0B 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 02 B5 01 FF 00 1C 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 42 07 00 3A FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 DC FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 A3 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 CF 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 AA 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 03 0F 42 01 1D 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 03 01 5F 07 00 03 FF 00 14 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 DB FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 DB 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 DB FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 DB 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 D3 FF 00 0F 00 02 07 00 03 07 00 9B 00 04 07 00 94 07 03 D3 08 08 C7 08 08 C7 FF 00 02 00 02 07 00 03 07 00 9B 00 05 07 00 94 07 03 D3 08 08 C7 08 08 C7 01 FF 00 1D 00 02 07 00 03 07 00 9B 00 04 07 00 94 07 03 D3 08 08 C7 08 08 C7 FF 00 06 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 05 07 00 94 07 03 D3 08 08 C7 08 08 C7 07 00 99 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 D3 07 02 27 FF 00 14 00 02 07 00 03 07 00 9B 00 06 07 00 94 07 03 D3 07 02 27 03 03 03 FF 00 02 00 02 07 00 03 07 00 9B 00 07 07 00 94 07 03 D3 07 02 27 03 03 03 01 FF 00 1C 00 02 07 00 03 07 00 9B 00 06 07 00 94 07 03 D3 07 02 27 03 03 03 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 9B 00 06 07 00 94 07 03 D3 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 D3 07 02 27 44 07 00 24 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 D3 07 02 27 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 E3 FF 00 0B 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 E3 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 E3 01 FF 00 1C 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 E3 FF 00 0E 00 02 07 00 03 07 00 9B 00 02 07 00 94 02 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 02 01 FF 00 1D 00 02 07 00 03 07 00 9B 00 02 07 00 94 02 02 0B 42 01 1D 52 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 4E 07 00 94 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 5E 07 00 94 FF 00 0C 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 FF 00 0E 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 E6 FF 00 02 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 00 E6 01 FF 00 1D 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 E6 47 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 01 42 07 00 94 43 07 00 94 FF 00 11 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 02 00 02 07 00 03 07 00 9B 00 04 07 00 94 07 03 A4 07 03 53 01 FF 00 1F 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 45 07 00 36 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 A3 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 CF 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 AA 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 03 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 00 94 03 55 07 00 3E FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 07 03 A4 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 07 02 A3 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 07 02 A3 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 07 03 AA 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 A4 07 00 94 01 03 FF 00 10 00 03 07 00 03 07 00 9B 03 00 04 07 03 A4 07 00 94 01 07 00 E6 FF 00 02 00 03 07 00 03 07 00 9B 03 00 05 07 03 A4 07 00 94 01 07 00 E6 01 FF 00 1E 00 03 07 00 03 07 00 9B 03 00 04 07 03 A4 07 00 94 01 07 00 E6 46 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 05 07 03 A4 07 00 94 01 07 00 94 02 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 04 07 03 A4 07 00 94 01 07 02 27 43 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 05 07 03 A4 07 00 94 01 07 02 27 07 00 9B 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 05 07 03 A4 07 00 94 01 07 02 27 01 48 07 00 3A FF 00 00 00 03 07 00 03 07 00 9B 03 00 06 07 03 A4 07 00 94 01 07 02 27 03 07 00 9B 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 06 07 03 A4 07 00 94 01 07 02 27 03 01 FF 00 11 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 07 00 9B FF 00 02 00 03 07 00 03 07 00 9B 03 00 08 07 03 A4 07 00 94 01 07 02 27 03 03 07 00 9B 01 FF 00 1E 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 07 00 9B 42 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 07 00 9B 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 01 47 07 00 38 FF 00 00 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 03 00 04 07 03 A4 07 00 94 01 03 FF 00 14 00 09 07 00 03 07 00 9B 03 03 00 00 07 03 A4 07 00 94 01 00 01 01 FF 00 02 00 09 07 00 03 07 00 9B 03 03 00 00 07 03 A4 07 00 94 01 00 02 01 01 5C 01 FF 00 0D 00 09 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 00 00 42 01 1E 44 07 00 45 40 03 45 07 00 45 40 03 FF 00 13 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 04 07 03 A4 07 00 94 01 01 FF 00 1F 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 0F 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 04 07 03 A4 07 00 94 01 01 FF 00 1C 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 0D 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 02 07 03 A4 07 00 94 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 1E 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 02 07 03 A4 07 00 94 4C 07 00 38 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 02 03 03 45 07 00 45 40 03 FF 00 1D 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 DB FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 07 03 DB 01 FF 00 1D 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 DB 42 07 00 28 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 DB 45 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 D3 FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 08 07 03 A4 07 00 94 01 02 07 03 D3 08 0D 67 08 0D 67 07 00 99 45 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 07 03 D3 07 02 27 4B 07 00 26 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 09 07 03 A4 07 00 94 01 02 07 03 D3 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 07 03 D3 07 02 27 FF 00 04 00 00 00 01 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 07 03 D3 07 02 27 45 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 E3 FF 00 0B 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 E3 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 07 03 E3 01 FF 00 1D 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 E3 FF 00 0F 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 03 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 03 01 FF 00 1C 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 03 42 07 00 3E FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 03 45 07 00 45 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 03 FF 00 0C 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 02 FF 00 02 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 06 07 03 A4 07 00 94 01 02 02 01 FF 00 1C 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 02 42 07 00 24 FF 00 00 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 02 45 07 00 45 00 FF 00 02 00 02 07 00 03 07 00 9B 00 00 4B 07 00 2C 40 07 00 94 45 07 00 45 40 07 03 74 4B 07 03 74 FF 00 02 00 02 07 00 03 07 00 9B 00 02 07 03 74 01 5E 07 03 74 46 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 07 00 9B 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 03 01 04 05 42 01 1A 0B 42 01 1C 45 07 00 26 40 07 03 DB 45 07 00 45 40 07 03 D3 FF 00 13 00 02 07 00 03 07 00 9B 00 04 07 03 D3 08 0E F2 08 0E F2 07 00 99 FF 00 02 00 02 07 00 03 07 00 9B 00 05 07 03 D3 08 0E F2 08 0E F2 07 00 99 01 FF 00 1E 00 02 07 00 03 07 00 9B 00 04 07 03 D3 08 0E F2 08 0E F2 07 00 99 42 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 04 07 03 D3 08 0E F2 08 0E F2 07 00 99 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 D3 07 02 27 FF 00 14 00 02 07 00 03 07 00 9B 00 05 07 03 D3 07 02 27 03 03 03 FF 00 02 00 02 07 00 03 07 00 9B 00 06 07 03 D3 07 02 27 03 03 03 01 FF 00 1C 00 02 07 00 03 07 00 9B 00 05 07 03 D3 07 02 27 03 03 03 42 07 00 2C FF 00 00 00 02 07 00 03 07 00 9B 00 05 07 03 D3 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 D3 07 02 27 44 07 00 45 FF 00 00 00 02 07 00 03 07 00 9B 00 02 07 03 D3 07 02 27 45 07 00 45 40 07 03 E3 FF 00 07 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 01 10 45 07 00 45 40 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 01 14 45 07 00 45 40 01 02 05 42 01 19 0B 42 01 1C 45 07 00 36 40 07 03 A4 45 07 00 45 40 07 03 F5 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 F5 07 03 53 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 F5 07 03 53 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 F5 07 03 53 45 07 00 45 40 07 02 B5 4F 07 02 B5 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 02 B5 01 5D 07 02 B5 42 07 00 24 40 07 02 B5 45 07 00 45 40 07 02 B5 45 07 00 32 40 07 01 10 45 07 00 45 40 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 01 14 45 07 00 45 40 01 FF 00 10 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 00 03 07 03 E3 01 FF 00 1C 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 FF 00 0E 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 02 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 00 03 02 01 FF 00 1D 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 02 02 48 07 00 2C FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 A4 07 03 53 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 A4 07 03 53 42 07 00 32 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 03 A4 07 03 53 45 07 00 45 40 07 02 B5 FF 00 17 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 04 07 03 BF 07 03 C9 07 03 53 01 FF 00 1D 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 42 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 42 07 00 38 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 45 07 00 45 40 07 02 B5 46 07 00 38 40 07 02 B5 45 07 00 45 40 07 02 B5 4E 07 01 10 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 01 10 01 5C 07 01 10 42 07 00 45 40 07 01 10 45 07 00 45 40 07 00 CF FF 00 05 00 00 00 01 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 01 14 45 07 00 45 40 01 4F 07 00 03 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 00 03 07 03 E3 01 FF 00 1F 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 08 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 01 5E 07 00 03 FF 00 12 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 94 07 03 E3 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 00 94 07 03 E3 01 FF 00 1D 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 94 07 03 E3 58 07 00 94 FF 00 02 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 94 01 5F 07 00 94 06 0B 42 01 1D 58 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 07 03 A4 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 07 02 A3 42 07 00 34 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 07 02 A3 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 07 00 CF 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 07 03 AA 45 07 00 45 FF 00 00 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 A4 07 00 94 03 FF 00 0B 00 04 07 00 03 07 00 9B 07 03 E3 03 00 01 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 00 94 02 45 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 03 07 03 A4 07 00 94 07 02 27 FF 00 0C 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 02 27 07 00 9B FF 00 02 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 07 00 9B 01 FF 00 1D 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 02 27 07 00 9B 42 07 00 DC FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 02 27 07 00 9B 45 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 02 27 01 FF 00 11 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 03 07 00 9B FF 00 02 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 07 00 9B 01 FF 00 1F 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 03 07 00 9B 42 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 03 07 00 9B 45 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 03 01 48 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 07 00 9B 45 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 01 FF 00 10 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 03 FF 00 02 00 04 07 00 03 07 00 9B 07 03 E3 03 00 07 07 03 A4 07 00 94 07 02 27 03 03 03 01 FF 00 1F 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 03 42 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 03 45 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 E3 03 00 03 07 03 A4 07 00 94 03 FF 00 0B 00 04 07 00 03 07 00 9B 07 03 E3 03 00 03 07 03 A4 07 00 94 03 FF 00 02 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 03 01 FF 00 1D 00 04 07 00 03 07 00 9B 07 03 E3 03 00 03 07 03 A4 07 00 94 03 FF 00 12 00 08 07 00 03 07 00 9B 07 03 E3 03 03 00 07 03 A4 07 00 94 00 01 01 FF 00 02 00 08 07 00 03 07 00 9B 07 03 E3 03 03 00 07 03 A4 07 00 94 00 02 01 01 5D 01 FF 00 0D 00 08 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 00 00 42 01 1E 44 07 00 28 40 03 45 07 00 45 40 03 4B 03 FF 00 02 00 08 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 00 02 03 01 5F 03 FF 00 13 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 03 07 03 A4 07 00 94 03 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 04 07 03 A4 07 00 94 03 01 FF 00 1C 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 03 07 03 A4 07 00 94 03 FF 00 0D 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 07 03 A4 07 00 94 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 03 07 03 A4 07 00 94 01 FF 00 1E 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 07 03 A4 07 00 94 4D 07 03 A4 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 07 03 A4 01 5E 07 03 A4 FF 00 13 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 03 03 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 03 03 03 01 FF 00 1C 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 03 03 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 03 03 45 07 00 45 40 03 4B 03 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 03 01 5D 03 FF 00 1F 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 05 07 03 A4 07 00 94 03 02 02 FF 00 02 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 06 07 03 A4 07 00 94 03 02 02 01 FF 00 1C 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 05 07 03 A4 07 00 94 03 02 02 42 07 00 45 FF 00 00 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 05 07 03 A4 07 00 94 03 02 02 45 07 00 45 00 FF 00 02 00 02 07 00 03 07 00 9B 00 00 45 07 00 45 40 07 03 53 45 07 00 45 40 07 03 53 FF 00 09 00 04 07 00 03 07 00 9B 07 03 53 01 00 01 07 00 45 FF 00 00 00 04 07 00 03 07 00 9B 07 03 53 01 00 02 07 04 F7 07 03 53 45 07 00 45 00 43 07 00 45 40 07 00 03 45 07 00 45 F9 00 00 FF 00 01 00 03 07 00 03 07 00 9B 03 00 04 07 03 A4 07 00 94 01 07 00 E6 FF 00 01 00 08 07 00 03 07 00 9B 07 03 E3 03 03 00 07 03 A4 07 00 94 00 01 01 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 01 00 04 07 00 03 07 00 9B 07 03 E3 03 00 06 07 03 A4 07 00 94 07 02 27 03 03 03 FF 00 01 00 02 07 00 03 07 00 9B 00 01 07 01 14 FF 00 01 00 02 07 00 03 07 00 9B 00 04 07 00 94 07 03 D3 08 08 C7 08 08 C7 01 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 02 B5 FA 00 01 FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 03 07 03 A4 07 00 94 03 FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 03 03 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 94 07 03 E3 FF 00 01 00 02 07 00 03 07 00 9B 00 01 07 00 94 41 07 03 74 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 A3 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 02 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 94 FF 00 01 00 02 07 00 03 07 00 9B 00 03 07 00 03 07 03 F5 07 03 53 FF 00 01 00 04 07 00 03 07 00 9B 07 03 E3 03 00 03 07 03 A4 07 00 94 03 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 02 B5 41 07 03 74 FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 02 07 03 A4 07 00 94 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 00 03 01 FF 00 01 00 08 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 00 00 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 AA FF 00 01 00 04 07 00 03 07 00 9B 07 03 E3 03 00 04 07 03 A4 07 00 94 07 02 27 07 00 9B F9 00 01 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 02 FF 00 01 00 02 07 00 03 07 00 9B 00 01 07 03 BF FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 DB FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 E3 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 01 10 01 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 03 41 07 02 B5 01 41 07 03 A4 41 07 00 94 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 00 E6 FF 00 01 00 09 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 00 00 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 03 07 03 DB FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 03 07 03 BF 07 03 C9 07 03 53 FF 00 01 00 02 07 00 03 07 00 9B 00 01 07 02 B5 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 03 6C 07 03 74 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 03 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 02 B5 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 02 FF 00 01 00 08 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 00 01 03 FF 00 01 00 03 07 00 03 07 00 9B 03 00 07 07 03 A4 07 00 94 01 07 02 27 03 03 07 00 9B FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 01 07 03 A4 FF 00 01 00 02 07 00 03 07 00 9B 00 03 07 00 94 07 03 A4 07 03 53 FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 9B 00 01 07 00 E6 FF 00 01 00 09 07 00 03 07 00 9B 07 03 E3 03 03 01 07 03 A4 07 00 94 03 00 05 07 03 A4 07 00 94 03 02 02 FF 00 01 00 02 07 00 03 07 00 9B 00 06 07 00 94 07 03 D3 07 02 27 03 03 03 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 02 07 00 03 07 03 E3 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 03 07 03 A4 07 00 94 01 FF 00 01 00 04 07 00 03 07 00 9B 07 03 E3 03 00 05 07 03 A4 07 00 94 07 02 27 03 07 00 9B FF 00 01 00 02 07 00 03 07 00 9B 00 03 07 03 6C 07 03 74 07 00 9B 41 07 00 94 01 FF 00 01 00 02 07 00 03 07 00 9B 00 04 07 03 D3 08 0E F2 08 0E F2 07 00 99 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 00 94 07 03 E3 FF 00 01 00 03 07 00 03 07 00 9B 07 03 E3 00 01 07 00 94 FA 00 01 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 02 07 03 A4 07 00 94 FF 00 01 00 02 07 00 03 07 00 9B 00 05 07 03 D3 07 02 27 03 03 03 FF 00 01 00 0A 07 00 03 07 00 9B 03 03 01 00 07 03 A4 07 00 94 01 03 00 05 07 03 A4 07 00 94 01 02 07 03 DB FF 00 01 00 09 07 00 03 07 00 9B 03 03 00 00 07 03 A4 07 00 94 01 00 01 01 FF 00 01 00 02 07 00 03 07 00 9B 00 02 07 03 F5 07 03 53 41 07 03 74 41 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     5847   5855   Any
        //  5847   5855   5847   5855   Any
        //  5863   5865   3      8      Ljava/lang/IllegalStateException;
        //  41     48     48     49     Any
        //  41     48     48     49     Ljava/lang/RuntimeException;
        //  42     48     41     42     Ljava/lang/RuntimeException;
        //  42     48     48     49     Ljava/lang/ClassCastException;
        //  42     48     41     42     Ljava/lang/RuntimeException;
        //  147    154    154    155    Any
        //  147    154    3      8      Any
        //  147    154    3      8      Any
        //  148    154    147    148    Any
        //  147    154    154    155    Ljava/lang/NullPointerException;
        //  173    180    180    181    Any
        //  173    180    180    181    Any
        //  173    180    173    174    Ljava/lang/ArithmeticException;
        //  174    180    180    181    Ljava/lang/RuntimeException;
        //  173    180    173    174    Any
        //  235    242    242    243    Any
        //  236    242    235    236    Ljava/lang/EnumConstantNotPresentException;
        //  235    242    235    236    Ljava/lang/ArithmeticException;
        //  236    242    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  236    242    235    236    Ljava/lang/ClassCastException;
        //  307    314    314    315    Any
        //  308    314    314    315    Ljava/lang/RuntimeException;
        //  308    314    314    315    Ljava/lang/EnumConstantNotPresentException;
        //  308    314    307    308    Ljava/lang/ClassCastException;
        //  307    314    3      8      Ljava/util/NoSuchElementException;
        //  367    374    374    375    Any
        //  368    374    367    368    Any
        //  368    374    374    375    Ljava/lang/NumberFormatException;
        //  367    374    3      8      Any
        //  367    374    367    368    Any
        //  487    494    494    495    Any
        //  488    494    494    495    Any
        //  488    494    494    495    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  488    494    487    488    Ljava/lang/ClassCastException;
        //  487    494    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  591    598    598    599    Any
        //  592    598    598    599    Ljava/util/ConcurrentModificationException;
        //  592    598    598    599    Ljava/lang/ArithmeticException;
        //  592    598    3      8      Ljava/lang/AssertionError;
        //  591    598    591    592    Ljava/lang/IndexOutOfBoundsException;
        //  650    656    656    657    Any
        //  650    656    3      8      Any
        //  650    656    3      8      Any
        //  650    656    656    657    Any
        //  650    656    656    657    Any
        //  708    714    714    715    Any
        //  708    714    3      8      Ljava/lang/IllegalStateException;
        //  708    714    714    715    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  708    714    3      8      Ljava/lang/ArithmeticException;
        //  708    714    3      8      Any
        //  722    729    729    730    Any
        //  723    729    722    723    Ljava/lang/ArithmeticException;
        //  722    729    722    723    Ljava/util/NoSuchElementException;
        //  722    729    729    730    Ljava/lang/ArithmeticException;
        //  723    729    722    723    Any
        //  736    743    743    744    Any
        //  737    743    736    737    Ljava/lang/NegativeArraySizeException;
        //  737    743    743    744    Ljava/lang/UnsupportedOperationException;
        //  737    743    3      8      Ljava/lang/ArithmeticException;
        //  736    743    743    744    Ljava/lang/ClassCastException;
        //  750    757    757    758    Any
        //  750    757    757    758    Any
        //  750    757    750    751    Ljava/lang/StringIndexOutOfBoundsException;
        //  751    757    750    751    Any
        //  751    757    750    751    Any
        //  815    822    822    823    Any
        //  816    822    822    823    Any
        //  816    822    3      8      Ljava/lang/UnsupportedOperationException;
        //  816    822    822    823    Any
        //  816    822    815    816    Ljava/lang/ClassCastException;
        //  835    841    841    842    Any
        //  835    841    3      8      Any
        //  835    841    841    842    Ljava/lang/NegativeArraySizeException;
        //  835    841    841    842    Any
        //  835    841    3      8      Any
        //  847    854    854    855    Any
        //  848    854    854    855    Any
        //  848    854    847    848    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  847    854    3      8      Any
        //  848    854    854    855    Any
        //  862    869    869    870    Any
        //  862    869    862    863    Ljava/lang/IndexOutOfBoundsException;
        //  863    869    3      8      Any
        //  863    869    3      8      Ljava/lang/RuntimeException;
        //  862    869    862    863    Ljava/util/NoSuchElementException;
        //  877    883    883    884    Any
        //  877    883    3      8      Any
        //  877    883    3      8      Ljava/lang/UnsupportedOperationException;
        //  877    883    3      8      Any
        //  877    883    883    884    Any
        //  896    903    903    904    Any
        //  896    903    903    904    Any
        //  897    903    903    904    Any
        //  897    903    3      8      Any
        //  897    903    896    897    Any
        //  908    914    914    915    Any
        //  908    914    3      8      Ljava/lang/IllegalArgumentException;
        //  908    914    914    915    Any
        //  908    914    3      8      Ljava/lang/UnsupportedOperationException;
        //  908    914    914    915    Ljava/lang/IllegalStateException;
        //  976    983    983    984    Any
        //  976    983    3      8      Ljava/lang/NumberFormatException;
        //  976    983    983    984    Ljava/lang/ArithmeticException;
        //  976    983    976    977    Any
        //  977    983    3      8      Ljava/lang/NumberFormatException;
        //  987    994    994    995    Any
        //  988    994    3      8      Ljava/lang/RuntimeException;
        //  988    994    3      8      Any
        //  987    994    3      8      Any
        //  987    994    987    988    Ljava/lang/IllegalStateException;
        //  1047   1054   1054   1055   Any
        //  1047   1054   1054   1055   Ljava/lang/ClassCastException;
        //  1047   1054   1047   1048   Ljava/lang/EnumConstantNotPresentException;
        //  1047   1054   1054   1055   Any
        //  1048   1054   3      8      Any
        //  1061   1068   1068   1069   Any
        //  1061   1068   1061   1062   Any
        //  1061   1068   1068   1069   Any
        //  1062   1068   3      8      Any
        //  1061   1068   3      8      Any
        //  1075   1082   1082   1083   Any
        //  1076   1082   1082   1083   Ljava/lang/IllegalArgumentException;
        //  1075   1082   1082   1083   Any
        //  1075   1082   3      8      Any
        //  1075   1082   1075   1076   Any
        //  1139   1146   1146   1147   Any
        //  1139   1146   1146   1147   Ljava/util/NoSuchElementException;
        //  1139   1146   1139   1140   Ljava/lang/NullPointerException;
        //  1139   1146   3      8      Any
        //  1140   1146   1146   1147   Any
        //  1158   1165   1165   1166   Any
        //  1159   1165   3      8      Ljava/util/NoSuchElementException;
        //  1158   1165   1158   1159   Any
        //  1158   1165   3      8      Ljava/util/NoSuchElementException;
        //  1158   1165   1158   1159   Any
        //  1179   1185   1185   1186   Any
        //  1179   1185   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1179   1185   3      8      Ljava/util/ConcurrentModificationException;
        //  1179   1185   1185   1186   Any
        //  1179   1185   3      8      Ljava/lang/UnsupportedOperationException;
        //  1192   1198   1198   1199   Any
        //  1192   1198   1198   1199   Any
        //  1192   1198   1198   1199   Any
        //  1192   1198   1198   1199   Any
        //  1192   1198   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1255   1262   1262   1263   Any
        //  1255   1262   1262   1263   Ljava/lang/AssertionError;
        //  1256   1262   1255   1256   Ljava/util/NoSuchElementException;
        //  1256   1262   1255   1256   Ljava/util/ConcurrentModificationException;
        //  1255   1262   1255   1256   Ljava/util/NoSuchElementException;
        //  1315   1322   1322   1323   Any
        //  1316   1322   1322   1323   Any
        //  1315   1322   1315   1316   Any
        //  1315   1322   1315   1316   Ljava/lang/NumberFormatException;
        //  1315   1322   3      8      Ljava/lang/IllegalStateException;
        //  1326   1333   1333   1334   Any
        //  1327   1333   3      8      Any
        //  1327   1333   1326   1327   Ljava/lang/StringIndexOutOfBoundsException;
        //  1326   1333   1326   1327   Any
        //  1327   1333   3      8      Any
        //  1387   1394   1394   1395   Any
        //  1387   1394   3      8      Any
        //  1387   1394   1387   1388   Any
        //  1387   1394   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1387   1394   1387   1388   Ljava/lang/RuntimeException;
        //  1401   1408   1408   1409   Any
        //  1402   1408   1408   1409   Ljava/lang/RuntimeException;
        //  1401   1408   3      8      Ljava/lang/NumberFormatException;
        //  1401   1408   1401   1402   Ljava/lang/NullPointerException;
        //  1402   1408   1408   1409   Any
        //  1459   1466   1466   1467   Any
        //  1460   1466   3      8      Any
        //  1459   1466   3      8      Ljava/lang/NumberFormatException;
        //  1460   1466   1459   1460   Any
        //  1459   1466   1459   1460   Ljava/lang/ArithmeticException;
        //  1523   1530   1530   1531   Any
        //  1524   1530   1523   1524   Ljava/lang/NegativeArraySizeException;
        //  1523   1530   1530   1531   Any
        //  1524   1530   1523   1524   Any
        //  1523   1530   3      8      Ljava/lang/ArithmeticException;
        //  1583   1590   1590   1591   Any
        //  1584   1590   1590   1591   Any
        //  1584   1590   3      8      Any
        //  1583   1590   1583   1584   Ljava/lang/ClassCastException;
        //  1583   1590   3      8      Any
        //  1594   1601   1601   1602   Any
        //  1595   1601   3      8      Any
        //  1595   1601   1601   1602   Any
        //  1594   1601   1601   1602   Any
        //  1595   1601   1594   1595   Ljava/lang/RuntimeException;
        //  1655   1662   1662   1663   Any
        //  1655   1662   3      8      Ljava/lang/UnsupportedOperationException;
        //  1655   1662   1655   1656   Ljava/lang/RuntimeException;
        //  1655   1662   3      8      Any
        //  1656   1662   3      8      Any
        //  1715   1722   1722   1723   Any
        //  1715   1722   1722   1723   Any
        //  1716   1722   1715   1716   Any
        //  1716   1722   3      8      Ljava/lang/RuntimeException;
        //  1716   1722   3      8      Any
        //  1775   1782   1782   1783   Any
        //  1775   1782   1775   1776   Any
        //  1776   1782   1782   1783   Ljava/lang/IndexOutOfBoundsException;
        //  1775   1782   1775   1776   Ljava/lang/UnsupportedOperationException;
        //  1775   1782   1775   1776   Any
        //  1897   1904   1904   1905   Any
        //  1897   1904   1904   1905   Ljava/lang/StringIndexOutOfBoundsException;
        //  1897   1904   3      8      Ljava/lang/UnsupportedOperationException;
        //  1897   1904   1897   1898   Any
        //  1898   1904   1904   1905   Ljava/lang/NegativeArraySizeException;
        //  1908   1915   1915   1916   Any
        //  1908   1915   1915   1916   Any
        //  1909   1915   1908   1909   Ljava/lang/ClassCastException;
        //  1909   1915   1915   1916   Any
        //  1909   1915   1915   1916   Ljava/lang/NumberFormatException;
        //  1923   1930   1930   1931   Any
        //  1923   1930   1923   1924   Any
        //  1923   1930   3      8      Any
        //  1924   1930   1923   1924   Ljava/lang/UnsupportedOperationException;
        //  1923   1930   3      8      Any
        //  1940   1947   1947   1948   Any
        //  1940   1947   1940   1941   Any
        //  1941   1947   1947   1948   Ljava/lang/IllegalArgumentException;
        //  1941   1947   1947   1948   Any
        //  1940   1947   1940   1941   Any
        //  1951   1958   1958   1959   Any
        //  1952   1958   1958   1959   Ljava/lang/ClassCastException;
        //  1952   1958   1958   1959   Ljava/lang/NumberFormatException;
        //  1951   1958   1951   1952   Ljava/lang/AssertionError;
        //  1951   1958   1951   1952   Any
        //  2047   2054   2054   2055   Any
        //  2048   2054   2047   2048   Ljava/lang/EnumConstantNotPresentException;
        //  2048   2054   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2048   2054   2054   2055   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2047   2054   2054   2055   Ljava/lang/RuntimeException;
        //  2061   2068   2068   2069   Any
        //  2062   2068   2061   2062   Ljava/lang/StringIndexOutOfBoundsException;
        //  2061   2068   2068   2069   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2061   2068   2068   2069   Any
        //  2061   2068   2068   2069   Any
        //  2075   2082   2082   2083   Any
        //  2076   2082   2075   2076   Ljava/lang/NumberFormatException;
        //  2076   2082   2075   2076   Ljava/lang/IllegalArgumentException;
        //  2075   2082   2075   2076   Ljava/lang/AssertionError;
        //  2075   2082   2075   2076   Ljava/lang/ClassCastException;
        //  2240   2246   2246   2247   Any
        //  2240   2246   3      8      Any
        //  2240   2246   2246   2247   Any
        //  2240   2246   3      8      Ljava/lang/UnsupportedOperationException;
        //  2240   2246   2246   2247   Ljava/lang/NullPointerException;
        //  2304   2310   2310   2311   Any
        //  2304   2310   3      8      Any
        //  2304   2310   3      8      Ljava/lang/ClassCastException;
        //  2304   2310   2310   2311   Any
        //  2304   2310   3      8      Any
        //  2367   2374   2374   2375   Any
        //  2367   2374   2367   2368   Ljava/util/ConcurrentModificationException;
        //  2368   2374   2374   2375   Ljava/lang/UnsupportedOperationException;
        //  2368   2374   3      8      Any
        //  2368   2374   3      8      Any
        //  2380   2387   2387   2388   Any
        //  2380   2387   3      8      Any
        //  2380   2387   3      8      Ljava/lang/ArithmeticException;
        //  2380   2387   2380   2381   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2380   2387   3      8      Ljava/lang/NumberFormatException;
        //  2547   2554   2554   2555   Any
        //  2548   2554   2547   2548   Any
        //  2547   2554   3      8      Any
        //  2547   2554   2547   2548   Any
        //  2547   2554   2547   2548   Ljava/lang/NullPointerException;
        //  2708   2715   2715   2716   Any
        //  2708   2715   2708   2709   Any
        //  2708   2715   2708   2709   Ljava/lang/NegativeArraySizeException;
        //  2709   2715   2715   2716   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2709   2715   2715   2716   Any
        //  2779   2786   2786   2787   Any
        //  2780   2786   2786   2787   Ljava/lang/IllegalStateException;
        //  2780   2786   2786   2787   Any
        //  2779   2786   2779   2780   Any
        //  2780   2786   2779   2780   Any
        //  2790   2797   2797   2798   Any
        //  2790   2797   2797   2798   Ljava/lang/NumberFormatException;
        //  2791   2797   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2790   2797   2797   2798   Ljava/lang/NumberFormatException;
        //  2790   2797   2790   2791   Any
        //  2805   2812   2812   2813   Any
        //  2806   2812   2805   2806   Any
        //  2806   2812   2812   2813   Any
        //  2806   2812   3      8      Any
        //  2806   2812   2812   2813   Ljava/lang/RuntimeException;
        //  2819   2826   2826   2827   Any
        //  2819   2826   3      8      Any
        //  2819   2826   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2819   2826   2826   2827   Ljava/util/NoSuchElementException;
        //  2819   2826   2819   2820   Ljava/lang/UnsupportedOperationException;
        //  2833   2840   2840   2841   Any
        //  2833   2840   2840   2841   Ljava/lang/NegativeArraySizeException;
        //  2834   2840   2840   2841   Any
        //  2833   2840   3      8      Any
        //  2833   2840   2833   2834   Ljava/lang/ClassCastException;
        //  2864   2871   2871   2872   Any
        //  2865   2871   2871   2872   Ljava/lang/AssertionError;
        //  2864   2871   2871   2872   Ljava/lang/StringIndexOutOfBoundsException;
        //  2865   2871   2871   2872   Ljava/lang/AssertionError;
        //  2865   2871   2864   2865   Ljava/lang/NullPointerException;
        //  2876   2882   2882   2883   Any
        //  2876   2882   3      8      Any
        //  2876   2882   2882   2883   Any
        //  2876   2882   3      8      Any
        //  2876   2882   3      8      Ljava/lang/ClassCastException;
        //  2890   2896   2896   2897   Any
        //  2890   2896   2896   2897   Any
        //  2890   2896   2896   2897   Ljava/lang/NullPointerException;
        //  2890   2896   2896   2897   Ljava/lang/NullPointerException;
        //  2890   2896   2896   2897   Ljava/lang/IllegalStateException;
        //  2955   2962   2962   2963   Any
        //  2956   2962   2962   2963   Any
        //  2956   2962   2962   2963   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2956   2962   2955   2956   Ljava/lang/NegativeArraySizeException;
        //  2955   2962   2955   2956   Any
        //  2967   2974   2974   2975   Any
        //  2967   2974   2974   2975   Any
        //  2968   2974   2974   2975   Ljava/lang/IllegalStateException;
        //  2967   2974   3      8      Any
        //  2968   2974   2967   2968   Any
        //  2984   2991   2991   2992   Any
        //  2984   2991   2991   2992   Ljava/util/NoSuchElementException;
        //  2985   2991   3      8      Ljava/lang/IllegalStateException;
        //  2984   2991   2991   2992   Any
        //  2984   2991   2984   2985   Ljava/lang/EnumConstantNotPresentException;
        //  3047   3054   3054   3055   Any
        //  3047   3054   3      8      Any
        //  3048   3054   3054   3055   Ljava/util/NoSuchElementException;
        //  3048   3054   3054   3055   Ljava/lang/StringIndexOutOfBoundsException;
        //  3047   3054   3047   3048   Any
        //  3063   3070   3070   3071   Any
        //  3063   3070   3070   3071   Ljava/lang/NullPointerException;
        //  3063   3070   3063   3064   Ljava/lang/NegativeArraySizeException;
        //  3063   3070   3      8      Ljava/lang/IllegalArgumentException;
        //  3064   3070   3070   3071   Any
        //  3177   3184   3184   3185   Any
        //  3178   3184   3177   3178   Ljava/lang/IndexOutOfBoundsException;
        //  3177   3184   3      8      Ljava/lang/ClassCastException;
        //  3178   3184   3      8      Ljava/util/NoSuchElementException;
        //  3178   3184   3177   3178   Any
        //  3349   3356   3356   3357   Any
        //  3349   3356   3      8      Ljava/lang/IllegalStateException;
        //  3350   3356   3356   3357   Any
        //  3349   3356   3356   3357   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3349   3356   3349   3350   Ljava/lang/NegativeArraySizeException;
        //  3423   3430   3430   3431   Any
        //  3423   3430   3      8      Any
        //  3424   3430   3423   3424   Ljava/util/ConcurrentModificationException;
        //  3423   3430   3430   3431   Ljava/lang/RuntimeException;
        //  3424   3430   3      8      Ljava/lang/UnsupportedOperationException;
        //  3443   3449   3449   3450   Any
        //  3443   3449   3      8      Any
        //  3443   3449   3      8      Any
        //  3443   3449   3449   3450   Ljava/lang/NegativeArraySizeException;
        //  3443   3449   3449   3450   Any
        //  3462   3469   3469   3470   Any
        //  3463   3469   3462   3463   Ljava/lang/AssertionError;
        //  3462   3469   3462   3463   Ljava/lang/AssertionError;
        //  3463   3469   3469   3470   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3463   3469   3      8      Any
        //  3476   3482   3482   3483   Any
        //  3476   3482   3482   3483   Any
        //  3476   3482   3482   3483   Ljava/lang/UnsupportedOperationException;
        //  3476   3482   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3476   3482   3      8      Ljava/lang/UnsupportedOperationException;
        //  3579   3586   3586   3587   Any
        //  3580   3586   3      8      Ljava/lang/UnsupportedOperationException;
        //  3579   3586   3      8      Any
        //  3579   3586   3      8      Any
        //  3579   3586   3579   3580   Ljava/lang/NullPointerException;
        //  3635   3642   3642   3643   Any
        //  3635   3642   3635   3636   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3636   3642   3642   3643   Ljava/lang/EnumConstantNotPresentException;
        //  3636   3642   3      8      Any
        //  3635   3642   3      8      Ljava/lang/IllegalStateException;
        //  3658   3665   3665   3666   Any
        //  3658   3665   3658   3659   Ljava/lang/RuntimeException;
        //  3659   3665   3665   3666   Ljava/lang/EnumConstantNotPresentException;
        //  3658   3665   3658   3659   Ljava/lang/ClassCastException;
        //  3658   3665   3665   3666   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3719   3726   3726   3727   Any
        //  3719   3726   3719   3720   Any
        //  3719   3726   3719   3720   Ljava/lang/RuntimeException;
        //  3719   3726   3719   3720   Ljava/lang/StringIndexOutOfBoundsException;
        //  3720   3726   3719   3720   Any
        //  3818   3825   3825   3826   Any
        //  3819   3825   3825   3826   Ljava/lang/NumberFormatException;
        //  3819   3825   3825   3826   Ljava/lang/RuntimeException;
        //  3818   3825   3818   3819   Ljava/lang/AssertionError;
        //  3819   3825   3825   3826   Any
        //  3883   3890   3890   3891   Any
        //  3884   3890   3890   3891   Any
        //  3884   3890   3      8      Ljava/lang/AssertionError;
        //  3884   3890   3883   3884   Any
        //  3884   3890   3883   3884   Any
        //  3947   3954   3954   3955   Any
        //  3948   3954   3947   3948   Ljava/lang/UnsupportedOperationException;
        //  3947   3954   3954   3955   Ljava/lang/NumberFormatException;
        //  3948   3954   3947   3948   Ljava/util/ConcurrentModificationException;
        //  3948   3954   3      8      Ljava/lang/ArithmeticException;
        //  3960   3967   3967   3968   Any
        //  3961   3967   3      8      Ljava/lang/IllegalArgumentException;
        //  3960   3967   3960   3961   Ljava/util/NoSuchElementException;
        //  3961   3967   3      8      Any
        //  3961   3967   3960   3961   Any
        //  3977   3983   3983   3984   Any
        //  3977   3983   3      8      Ljava/lang/UnsupportedOperationException;
        //  3977   3983   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3977   3983   3      8      Ljava/lang/NumberFormatException;
        //  3977   3983   3983   3984   Any
        //  3991   3997   3997   3998   Any
        //  3991   3997   3997   3998   Any
        //  3991   3997   3      8      Ljava/util/ConcurrentModificationException;
        //  3991   3997   3      8      Any
        //  3991   3997   3997   3998   Any
        //  4086   4093   4093   4094   Any
        //  4087   4093   4093   4094   Any
        //  4086   4093   4093   4094   Any
        //  4087   4093   3      8      Any
        //  4087   4093   4086   4087   Ljava/lang/UnsupportedOperationException;
        //  4100   4107   4107   4108   Any
        //  4100   4107   4100   4101   Any
        //  4100   4107   4100   4101   Any
        //  4101   4107   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  4101   4107   4100   4101   Any
        //  4112   4118   4118   4119   Any
        //  4112   4118   4118   4119   Any
        //  4112   4118   4118   4119   Ljava/lang/EnumConstantNotPresentException;
        //  4112   4118   4118   4119   Any
        //  4112   4118   3      8      Any
        //  4171   4178   4178   4179   Any
        //  4171   4178   4171   4172   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4172   4178   3      8      Any
        //  4171   4178   3      8      Any
        //  4172   4178   4178   4179   Any
        //  4185   4192   4192   4193   Any
        //  4185   4192   4192   4193   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4186   4192   4192   4193   Any
        //  4186   4192   4192   4193   Ljava/lang/AssertionError;
        //  4186   4192   4185   4186   Ljava/lang/ArithmeticException;
        //  4200   4206   4206   4207   Any
        //  4200   4206   4206   4207   Any
        //  4200   4206   3      8      Ljava/lang/RuntimeException;
        //  4200   4206   4206   4207   Ljava/lang/NullPointerException;
        //  4200   4206   4206   4207   Any
        //  4316   4323   4323   4324   Any
        //  4317   4323   3      8      Any
        //  4316   4323   4323   4324   Any
        //  4316   4323   4323   4324   Ljava/lang/IllegalArgumentException;
        //  4316   4323   4316   4317   Ljava/lang/RuntimeException;
        //  4327   4334   4334   4335   Any
        //  4328   4334   4327   4328   Ljava/lang/ArithmeticException;
        //  4328   4334   4334   4335   Any
        //  4327   4334   4334   4335   Any
        //  4327   4334   4334   4335   Ljava/util/ConcurrentModificationException;
        //  4395   4402   4402   4403   Any
        //  4395   4402   3      8      Any
        //  4396   4402   4402   4403   Ljava/lang/ArithmeticException;
        //  4396   4402   4395   4396   Any
        //  4395   4402   3      8      Any
        //  4406   4413   4413   4414   Any
        //  4406   4413   3      8      Ljava/lang/ClassCastException;
        //  4407   4413   4413   4414   Any
        //  4407   4413   3      8      Ljava/lang/NullPointerException;
        //  4407   4413   4406   4407   Ljava/lang/NegativeArraySizeException;
        //  4421   4428   4428   4429   Any
        //  4421   4428   4421   4422   Ljava/lang/NegativeArraySizeException;
        //  4421   4428   3      8      Any
        //  4421   4428   4428   4429   Any
        //  4422   4428   3      8      Any
        //  4479   4486   4486   4487   Any
        //  4480   4486   4479   4480   Any
        //  4480   4486   4486   4487   Ljava/lang/IllegalStateException;
        //  4479   4486   4479   4480   Any
        //  4480   4486   4479   4480   Ljava/lang/IllegalArgumentException;
        //  4494   4500   4500   4501   Any
        //  4494   4500   3      8      Ljava/lang/ClassCastException;
        //  4494   4500   3      8      Ljava/lang/IllegalStateException;
        //  4494   4500   3      8      Ljava/lang/AssertionError;
        //  4494   4500   4500   4501   Any
        //  4845   4852   4852   4853   Any
        //  4846   4852   4845   4846   Any
        //  4846   4852   4852   4853   Ljava/lang/NegativeArraySizeException;
        //  4845   4852   4852   4853   Any
        //  4846   4852   3      8      Ljava/lang/NumberFormatException;
        //  4856   4863   4863   4864   Any
        //  4857   4863   4863   4864   Ljava/lang/ArithmeticException;
        //  4856   4863   4856   4857   Ljava/lang/ClassCastException;
        //  4856   4863   3      8      Ljava/lang/NegativeArraySizeException;
        //  4857   4863   4863   4864   Any
        //  4870   4877   4877   4878   Any
        //  4871   4877   3      8      Any
        //  4871   4877   4870   4871   Any
        //  4871   4877   3      8      Ljava/util/NoSuchElementException;
        //  4870   4877   3      8      Any
        //  4890   4897   4897   4898   Any
        //  4890   4897   4890   4891   Any
        //  4891   4897   4890   4891   Ljava/lang/NegativeArraySizeException;
        //  4890   4897   3      8      Ljava/lang/NumberFormatException;
        //  4890   4897   4890   4891   Ljava/lang/AssertionError;
        //  4947   4954   4954   4955   Any
        //  4948   4954   4954   4955   Any
        //  4947   4954   3      8      Ljava/lang/NumberFormatException;
        //  4948   4954   4954   4955   Any
        //  4948   4954   4947   4948   Ljava/lang/StringIndexOutOfBoundsException;
        //  5011   5018   5018   5019   Any
        //  5011   5018   3      8      Ljava/lang/ClassCastException;
        //  5012   5018   5018   5019   Ljava/lang/EnumConstantNotPresentException;
        //  5011   5018   3      8      Any
        //  5012   5018   5011   5012   Any
        //  5028   5035   5035   5036   Any
        //  5028   5035   5028   5029   Ljava/lang/RuntimeException;
        //  5028   5035   5028   5029   Any
        //  5028   5035   5028   5029   Ljava/lang/NumberFormatException;
        //  5029   5035   5028   5029   Ljava/lang/UnsupportedOperationException;
        //  5091   5098   5098   5099   Any
        //  5092   5098   5098   5099   Any
        //  5092   5098   5091   5092   Any
        //  5092   5098   5098   5099   Ljava/lang/ArithmeticException;
        //  5092   5098   3      8      Any
        //  5249   5256   5256   5257   Any
        //  5249   5256   5256   5257   Any
        //  5250   5256   5249   5250   Ljava/util/ConcurrentModificationException;
        //  5250   5256   3      8      Ljava/lang/RuntimeException;
        //  5250   5256   3      8      Any
        //  5508   5514   5514   5515   Any
        //  5508   5514   5514   5515   Any
        //  5508   5514   5514   5515   Any
        //  5508   5514   3      8      Any
        //  5508   5514   5514   5515   Any
        //  5627   5634   5634   5635   Any
        //  5627   5634   3      8      Ljava/lang/IllegalStateException;
        //  5628   5634   3      8      Any
        //  5628   5634   5627   5628   Any
        //  5628   5634   5627   5628   Any
        //  5644   5651   5651   5652   Any
        //  5644   5651   5644   5645   Any
        //  5645   5651   5651   5652   Ljava/util/ConcurrentModificationException;
        //  5645   5651   3      8      Ljava/util/ConcurrentModificationException;
        //  5645   5651   3      8      Ljava/lang/RuntimeException;
        //  5662   5669   5669   5670   Any
        //  5663   5669   5662   5663   Any
        //  5663   5669   3      8      Ljava/lang/UnsupportedOperationException;
        //  5663   5669   5669   5670   Any
        //  5662   5669   3      8      Any
        //  5674   5681   5681   5682   Any
        //  5675   5681   5674   5675   Ljava/lang/NegativeArraySizeException;
        //  5675   5681   5674   5675   Any
        //  5675   5681   3      8      Any
        //  5675   5681   5681   5682   Any
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
    public f0d c() {
        return fbS.fU(this, 1632699207);
    }
    
    public boolean 9() {
        return fbS.es(this, 1524527460);
    }
    
    static {
        throw t;
    }
    
    @f06
    public void c(@NotNull final f3g p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4298
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            4290
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4282
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //    30: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    33: ifnull          4176
        //    36: aload_0        
        //    37: iconst_0       
        //    38: getstatic       dev/nuker/pyro/fc.0:I
        //    41: ifeq            50
        //    44: ldc_w           -73346393
        //    47: goto            53
        //    50: ldc_w           1658916560
        //    53: ldc_w           1084703950
        //    56: ixor           
        //    57: lookupswitch {
        //          -1157130647: 4183
        //          1099883503: 50
        //          default: 84
        //        }
        //    84: putfield        dev/nuker/pyro/f89.c:Z
        //    87: aload_0        
        //    88: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //    91: ifnonnull       212
        //    94: aload_0        
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            107
        //   101: ldc_w           -615999995
        //   104: goto            110
        //   107: ldc_w           753792834
        //   110: ldc_w           -1233877486
        //   113: ixor           
        //   114: lookupswitch {
        //          -1701220016: 140
        //          1832652823: 107
        //          default: 4249
        //        }
        //   140: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/fw;
        //   143: iconst_0       
        //   144: goto            148
        //   147: athrow         
        //   148: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   151: goto            155
        //   154: athrow         
        //   155: getstatic       dev/nuker/pyro/fc.1:I
        //   158: ifeq            167
        //   161: ldc_w           -712141166
        //   164: goto            170
        //   167: ldc_w           -1114074460
        //   170: ldc_w           -773009493
        //   173: ixor           
        //   174: lookupswitch {
        //          73488697: 167
        //          1819565327: 200
        //          default: 4215
        //        }
        //   200: goto            204
        //   203: athrow         
        //   204: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   207: goto            211
        //   210: athrow         
        //   211: return         
        //   212: getstatic       dev/nuker/pyro/fc.c:I
        //   215: ifge            224
        //   218: ldc_w           19144557
        //   221: goto            227
        //   224: ldc_w           239043134
        //   227: ldc_w           -1352952818
        //   230: ixor           
        //   231: lookupswitch {
        //          -1855359720: 224
        //          -1367372957: 4195
        //          default: 256
        //        }
        //   256: aload_0        
        //   257: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   260: dup            
        //   261: ifnonnull       275
        //   264: goto            268
        //   267: athrow         
        //   268: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   271: goto            275
        //   274: athrow         
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   dev/nuker/pyro/f8F.1:()Ljava/lang/String;
        //   282: goto            286
        //   285: athrow         
        //   286: ifnull          644
        //   289: aload_0        
        //   290: getstatic       dev/nuker/pyro/fc.c:I
        //   293: ifge            302
        //   296: ldc_w           1562193634
        //   299: goto            305
        //   302: ldc_w           -463008003
        //   305: ldc_w           -913553864
        //   308: ixor           
        //   309: lookupswitch {
        //          -1802409766: 302
        //          770394309: 336
        //          default: 4185
        //        }
        //   336: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/fw;
        //   339: iconst_0       
        //   340: goto            344
        //   343: athrow         
        //   344: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   347: goto            351
        //   350: athrow         
        //   351: goto            355
        //   354: athrow         
        //   355: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   358: goto            362
        //   361: athrow         
        //   362: goto            366
        //   365: athrow         
        //   366: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   369: goto            373
        //   372: athrow         
        //   373: getfield        net/minecraft/client/Minecraft.field_71456_v:Lnet/minecraft/client/gui/GuiIngame;
        //   376: dup            
        //   377: pop            
        //   378: goto            382
        //   381: athrow         
        //   382: invokevirtual   net/minecraft/client/gui/GuiIngame.func_146158_b:()Lnet/minecraft/client/gui/GuiNewChat;
        //   385: goto            389
        //   388: athrow         
        //   389: new             Lnet/minecraft/util/text/TextComponentString;
        //   392: dup            
        //   393: ldc_w           ""
        //   396: goto            400
        //   399: athrow         
        //   400: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
        //   403: goto            407
        //   406: athrow         
        //   407: getstatic       dev/nuker/pyro/Pyro.prefix:Lnet/minecraft/util/text/ITextComponent;
        //   410: goto            414
        //   413: athrow         
        //   414: invokevirtual   net/minecraft/util/text/TextComponentString.func_150257_a:(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/util/text/ITextComponent;
        //   417: goto            421
        //   420: athrow         
        //   421: new             Ljava/lang/StringBuilder;
        //   424: dup            
        //   425: goto            429
        //   428: athrow         
        //   429: invokespecial   java/lang/StringBuilder.<init>:()V
        //   432: goto            436
        //   435: athrow         
        //   436: aload_0        
        //   437: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   440: dup            
        //   441: ifnonnull       455
        //   444: goto            448
        //   447: athrow         
        //   448: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   451: goto            455
        //   454: athrow         
        //   455: goto            459
        //   458: athrow         
        //   459: invokevirtual   dev/nuker/pyro/f8F.1:()Ljava/lang/String;
        //   462: goto            466
        //   465: athrow         
        //   466: dup            
        //   467: ifnonnull       481
        //   470: goto            474
        //   473: athrow         
        //   474: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   477: goto            481
        //   480: athrow         
        //   481: getstatic       dev/nuker/pyro/fc.c:I
        //   484: ifge            493
        //   487: ldc_w           -2122409259
        //   490: goto            496
        //   493: ldc_w           -1458329043
        //   496: ldc_w           -532908565
        //   499: ixor           
        //   500: lookupswitch {
        //          1227874246: 528
        //          1631776574: 493
        //          default: 4213
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   535: goto            539
        //   538: athrow         
        //   539: ldc_w           "\u226f\u14d3\u8b2b\ub1dd\ucf96\uec31\ub230\ue71e\udb77\uefeb\ua6ab"
        //   542: goto            546
        //   545: athrow         
        //   546: invokestatic    invokestatic   !!! ERROR
        //   549: goto            553
        //   552: athrow         
        //   553: goto            557
        //   556: athrow         
        //   557: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   560: goto            564
        //   563: athrow         
        //   564: goto            568
        //   567: athrow         
        //   568: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   571: goto            575
        //   574: athrow         
        //   575: goto            579
        //   578: athrow         
        //   579: invokeinterface net/minecraft/util/text/ITextComponent.func_150258_a:(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;
        //   584: goto            588
        //   587: athrow         
        //   588: getstatic       dev/nuker/pyro/fc.1:I
        //   591: ifeq            600
        //   594: ldc_w           1879402992
        //   597: goto            603
        //   600: ldc_w           903832369
        //   603: ldc_w           2023021808
        //   606: ixor           
        //   607: lookupswitch {
        //          143766784: 600
        //          1296809921: 632
        //          default: 4263
        //        }
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   net/minecraft/client/gui/GuiNewChat.func_146227_a:(Lnet/minecraft/util/text/ITextComponent;)V
        //   639: goto            643
        //   642: athrow         
        //   643: return         
        //   644: aload_0        
        //   645: getfield        dev/nuker/pyro/f89.0:Z
        //   648: ifne            657
        //   651: ldc_w           1922014748
        //   654: goto            660
        //   657: ldc_w           1922014749
        //   660: ldc_w           704689016
        //   663: ixor           
        //   664: tableswitch {
        //          -1323410744: 688
        //          -1323410743: 936
        //          default: 651
        //        }
        //   688: aload_0        
        //   689: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   692: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   695: dup            
        //   696: pop            
        //   697: goto            701
        //   700: athrow         
        //   701: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //   704: goto            708
        //   707: athrow         
        //   708: ifeq            717
        //   711: ldc_w           1387027165
        //   714: goto            720
        //   717: ldc_w           1387027166
        //   720: ldc_w           1953635512
        //   723: ixor           
        //   724: tableswitch {
        //          1304202442: 748
        //          1304202443: 812
        //          default: 711
        //        }
        //   748: aload_0        
        //   749: new             Lnet/minecraft/util/math/BlockPos;
        //   752: dup            
        //   753: aload_0        
        //   754: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //   757: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   760: dup            
        //   761: pop            
        //   762: goto            766
        //   765: athrow         
        //   766: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174791_d:()Lnet/minecraft/util/math/Vec3d;
        //   769: goto            773
        //   772: athrow         
        //   773: goto            777
        //   776: athrow         
        //   777: invokespecial   net/minecraft/util/math/BlockPos.<init>:(Lnet/minecraft/util/math/Vec3d;)V
        //   780: goto            784
        //   783: athrow         
        //   784: goto            788
        //   787: athrow         
        //   788: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   791: goto            795
        //   794: athrow         
        //   795: dup            
        //   796: pop            
        //   797: goto            801
        //   800: athrow         
        //   801: invokevirtual   dev/nuker/pyro/f89.0:(Lnet/minecraft/util/math/BlockPos;)Z
        //   804: goto            808
        //   807: athrow         
        //   808: pop            
        //   809: goto            935
        //   812: aload_0        
        //   813: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   816: dup            
        //   817: ifnonnull       826
        //   820: ldc_w           -1410272548
        //   823: goto            829
        //   826: ldc_w           -1410272547
        //   829: ldc_w           68493872
        //   832: ixor           
        //   833: tableswitch {
        //          1607180760: 856
        //          1607180761: 911
        //          default: 820
        //        }
        //   856: getstatic       dev/nuker/pyro/fc.0:I
        //   859: ifeq            868
        //   862: ldc_w           -14435065
        //   865: goto            871
        //   868: ldc_w           -1392936885
        //   871: ldc_w           -497640977
        //   874: ixor           
        //   875: lookupswitch {
        //          -1584050552: 868
        //          494216424: 4225
        //          default: 900
        //        }
        //   900: goto            904
        //   903: athrow         
        //   904: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   907: goto            911
        //   910: athrow         
        //   911: goto            915
        //   914: athrow         
        //   915: invokevirtual   dev/nuker/pyro/f8F.5:()V
        //   918: goto            922
        //   921: athrow         
        //   922: aload_0        
        //   923: aconst_null    
        //   924: checkcast       Ldev/nuker/pyro/f8b;
        //   927: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //   930: aload_0        
        //   931: iconst_1       
        //   932: putfield        dev/nuker/pyro/f89.0:Z
        //   935: return         
        //   936: aload_0        
        //   937: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   940: dup            
        //   941: ifnonnull       955
        //   944: goto            948
        //   947: athrow         
        //   948: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   951: goto            955
        //   954: athrow         
        //   955: getstatic       dev/nuker/pyro/fc.c:I
        //   958: ifge            967
        //   961: ldc_w           125727841
        //   964: goto            970
        //   967: ldc_w           -1409122237
        //   970: ldc_w           446314263
        //   973: ixor           
        //   974: lookupswitch {
        //          -1231505580: 1000
        //          501498742: 967
        //          default: 4227
        //        }
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: invokevirtual   dev/nuker/pyro/f8F.9:()Z
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: ifeq            1015
        //  1014: return         
        //  1015: aload_0        
        //  1016: getstatic       dev/nuker/pyro/fc.0:I
        //  1019: ifeq            1028
        //  1022: ldc_w           -1929966012
        //  1025: goto            1031
        //  1028: ldc_w           1456125829
        //  1031: ldc_w           -1439373106
        //  1034: ixor           
        //  1035: lookupswitch {
        //          650372746: 4237
        //          1131662697: 1028
        //          default: 1060
        //        }
        //  1060: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1063: dup            
        //  1064: ifnonnull       1078
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1074: goto            1078
        //  1077: athrow         
        //  1078: getstatic       dev/nuker/pyro/fc.0:I
        //  1081: ifeq            1090
        //  1084: ldc_w           1812568945
        //  1087: goto            1093
        //  1090: ldc_w           -2038582340
        //  1093: ldc_w           497933605
        //  1096: ixor           
        //  1097: lookupswitch {
        //          -1680839015: 1124
        //          1906591316: 1090
        //          default: 4251
        //        }
        //  1124: goto            1128
        //  1127: athrow         
        //  1128: invokevirtual   dev/nuker/pyro/f8F.v:()Z
        //  1131: goto            1135
        //  1134: athrow         
        //  1135: ifeq            4175
        //  1138: aload_0        
        //  1139: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1142: dup            
        //  1143: ifnonnull       1203
        //  1146: getstatic       dev/nuker/pyro/fc.c:I
        //  1149: ifge            1158
        //  1152: ldc_w           -889730340
        //  1155: goto            1161
        //  1158: ldc_w           -50111113
        //  1161: ldc_w           -2117676721
        //  1164: ixor           
        //  1165: lookupswitch {
        //          1261509523: 1158
        //          2093321272: 1192
        //          default: 4191
        //        }
        //  1192: goto            1196
        //  1195: athrow         
        //  1196: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1199: goto            1203
        //  1202: athrow         
        //  1203: getstatic       dev/nuker/pyro/fc.c:I
        //  1206: ifge            1215
        //  1209: ldc_w           2144566977
        //  1212: goto            1218
        //  1215: ldc_w           -1453936829
        //  1218: ldc_w           1401811499
        //  1221: ixor           
        //  1222: lookupswitch {
        //          -86287000: 1248
        //          744393962: 1215
        //          default: 4269
        //        }
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: checkcast       Ljava/util/Collection;
        //  1262: astore_2       
        //  1263: iconst_0       
        //  1264: istore_3       
        //  1265: aload_2        
        //  1266: goto            1270
        //  1269: athrow         
        //  1270: invokeinterface java/util/Collection.isEmpty:()Z
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: ifne            1288
        //  1282: ldc_w           -1172793596
        //  1285: goto            1291
        //  1288: ldc_w           -1172793349
        //  1291: ldc_w           1991969659
        //  1294: ixor           
        //  1295: tableswitch {
        //          -1723385602: 1316
        //          -1723385601: 1320
        //          default: 1282
        //        }
        //  1316: iconst_1       
        //  1317: goto            1321
        //  1320: iconst_0       
        //  1321: ifeq            4175
        //  1324: aload_0        
        //  1325: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  1328: ifnonnull       1638
        //  1331: aload_0        
        //  1332: aload_0        
        //  1333: getstatic       dev/nuker/pyro/fc.1:I
        //  1336: ifeq            1345
        //  1339: ldc_w           -38472536
        //  1342: goto            1348
        //  1345: ldc_w           -1711042627
        //  1348: ldc_w           203748968
        //  1351: ixor           
        //  1352: lookupswitch {
        //          -688972464: 1345
        //          -242220352: 4223
        //          default: 1380
        //        }
        //  1380: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1383: dup            
        //  1384: ifnonnull       1393
        //  1387: ldc_w           579690947
        //  1390: goto            1396
        //  1393: ldc_w           579690944
        //  1396: ldc_w           -484102690
        //  1399: ixor           
        //  1400: tableswitch {
        //          -2091870150: 1424
        //          -2091870149: 1479
        //          default: 1387
        //        }
        //  1424: getstatic       dev/nuker/pyro/fc.c:I
        //  1427: ifge            1436
        //  1430: ldc_w           -1810846130
        //  1433: goto            1439
        //  1436: ldc_w           1551975067
        //  1439: ldc_w           -1295420867
        //  1442: ixor           
        //  1443: lookupswitch {
        //          597786989: 1436
        //          651811955: 4265
        //          default: 1468
        //        }
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1475: goto            1479
        //  1478: athrow         
        //  1479: getstatic       dev/nuker/pyro/fc.1:I
        //  1482: ifeq            1491
        //  1485: ldc_w           1890392246
        //  1488: goto            1494
        //  1491: ldc_w           -631083532
        //  1494: ldc_w           -1438337738
        //  1497: ixor           
        //  1498: lookupswitch {
        //          -622219904: 1491
        //          1881594050: 1524
        //          default: 4229
        //        }
        //  1524: goto            1528
        //  1527: athrow         
        //  1528: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  1531: goto            1535
        //  1534: athrow         
        //  1535: aload_0        
        //  1536: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1539: dup            
        //  1540: ifnonnull       1549
        //  1543: ldc_w           -1523586744
        //  1546: goto            1552
        //  1549: ldc_w           -1523586743
        //  1552: ldc_w           803927146
        //  1555: ixor           
        //  1556: tableswitch {
        //          361380420: 1580
        //          361380421: 1591
        //          default: 1543
        //        }
        //  1580: goto            1584
        //  1583: athrow         
        //  1584: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1587: goto            1591
        //  1590: athrow         
        //  1591: dup            
        //  1592: goto            1596
        //  1595: athrow         
        //  1596: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  1599: goto            1603
        //  1602: athrow         
        //  1603: dup            
        //  1604: istore_2       
        //  1605: iconst_1       
        //  1606: iadd           
        //  1607: goto            1611
        //  1610: athrow         
        //  1611: invokevirtual   dev/nuker/pyro/f8F.c:(I)V
        //  1614: goto            1618
        //  1617: athrow         
        //  1618: iload_2        
        //  1619: goto            1623
        //  1622: athrow         
        //  1623: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1628: goto            1632
        //  1631: athrow         
        //  1632: checkcast       Ldev/nuker/pyro/f8b;
        //  1635: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  1638: aload_0        
        //  1639: getstatic       dev/nuker/pyro/fc.1:I
        //  1642: ifeq            1651
        //  1645: ldc_w           1889467116
        //  1648: goto            1654
        //  1651: ldc_w           789776339
        //  1654: ldc_w           512778151
        //  1657: ixor           
        //  1658: lookupswitch {
        //          170157108: 1651
        //          1846453579: 4199
        //          default: 1684
        //        }
        //  1684: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  1687: getstatic       dev/nuker/pyro/fc.c:I
        //  1690: ifge            1699
        //  1693: ldc_w           177829762
        //  1696: goto            1702
        //  1699: ldc_w           112590778
        //  1702: ldc_w           -628162335
        //  1705: ixor           
        //  1706: lookupswitch {
        //          -803834013: 1699
        //          -600113317: 1732
        //          default: 4239
        //        }
        //  1732: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1735: dup            
        //  1736: pop            
        //  1737: getstatic       dev/nuker/pyro/fc.1:I
        //  1740: ifeq            1749
        //  1743: ldc_w           -521822340
        //  1746: goto            1752
        //  1749: ldc_w           779359358
        //  1752: ldc_w           -1390721081
        //  1755: ixor           
        //  1756: lookupswitch {
        //          -2089856071: 1784
        //          1308547259: 1749
        //          default: 4259
        //        }
        //  1784: goto            1788
        //  1787: athrow         
        //  1788: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //  1791: goto            1795
        //  1794: athrow         
        //  1795: ifeq            1804
        //  1798: ldc_w           2094309557
        //  1801: goto            1807
        //  1804: ldc_w           2094309558
        //  1807: ldc_w           -224570564
        //  1810: ixor           
        //  1811: tableswitch {
        //          479454994: 1832
        //          479454995: 3753
        //          default: 1798
        //        }
        //  1832: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  1835: getstatic       dev/nuker/pyro/fc.1:I
        //  1838: ifeq            1847
        //  1841: ldc_w           -1720528226
        //  1844: goto            1850
        //  1847: ldc_w           -893972042
        //  1850: ldc_w           -676048946
        //  1853: ixor           
        //  1854: lookupswitch {
        //          -178915381: 1847
        //          1321639248: 4261
        //          default: 1880
        //        }
        //  1880: getfield        dev/nuker/pyro/f7p.c:Ldev/nuker/pyro/fw;
        //  1883: goto            1887
        //  1886: athrow         
        //  1887: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  1890: goto            1894
        //  1893: athrow         
        //  1894: dup            
        //  1895: pop            
        //  1896: checkcast       Ljava/lang/Boolean;
        //  1899: goto            1903
        //  1902: athrow         
        //  1903: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1906: goto            1910
        //  1909: athrow         
        //  1910: ifeq            3753
        //  1913: getstatic       dev/nuker/pyro/fc.0:I
        //  1916: ifeq            1925
        //  1919: ldc_w           1197733240
        //  1922: goto            1928
        //  1925: ldc_w           -1578215447
        //  1928: ldc_w           1964697035
        //  1931: ixor           
        //  1932: lookupswitch {
        //          846794931: 4181
        //          1830710535: 1925
        //          default: 1960
        //        }
        //  1960: aload_0        
        //  1961: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1964: dup            
        //  1965: ifnonnull       1979
        //  1968: goto            1972
        //  1971: athrow         
        //  1972: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1975: goto            1979
        //  1978: athrow         
        //  1979: getstatic       dev/nuker/pyro/fc.c:I
        //  1982: ifge            1991
        //  1985: ldc_w           -1005284369
        //  1988: goto            1994
        //  1991: ldc_w           191086766
        //  1994: ldc_w           -1937705203
        //  1997: ixor           
        //  1998: lookupswitch {
        //          -2015152221: 2024
        //          1217684706: 1991
        //          default: 4217
        //        }
        //  2024: goto            2028
        //  2027: athrow         
        //  2028: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2031: goto            2035
        //  2034: athrow         
        //  2035: astore_2       
        //  2036: iconst_0       
        //  2037: istore_3       
        //  2038: iconst_0       
        //  2039: getstatic       dev/nuker/pyro/fc.c:I
        //  2042: ifge            2051
        //  2045: ldc_w           -1560249898
        //  2048: goto            2054
        //  2051: ldc_w           1581869163
        //  2054: ldc_w           1723076688
        //  2057: ixor           
        //  2058: lookupswitch {
        //          -978032250: 2051
        //          956135483: 2084
        //          default: 4219
        //        }
        //  2084: istore          4
        //  2086: aload_2        
        //  2087: monitorenter   
        //  2088: nop            
        //  2089: iconst_0       
        //  2090: getstatic       dev/nuker/pyro/fc.0:I
        //  2093: ifeq            2102
        //  2096: ldc_w           1836391027
        //  2099: goto            2105
        //  2102: ldc_w           469899480
        //  2105: ldc_w           1830577126
        //  2108: ixor           
        //  2109: lookupswitch {
        //          -441903532: 2102
        //          6912405: 4271
        //          default: 2136
        //        }
        //  2136: istore          5
        //  2138: aload_0        
        //  2139: aload_0        
        //  2140: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  2143: dup            
        //  2144: ifnonnull       2153
        //  2147: ldc_w           -1506098954
        //  2150: goto            2156
        //  2153: ldc_w           -1506098953
        //  2156: ldc_w           -281820428
        //  2159: ixor           
        //  2160: tableswitch {
        //          -1844313084: 2184
        //          -1844313083: 2195
        //          default: 2147
        //        }
        //  2184: goto            2188
        //  2187: athrow         
        //  2188: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2191: goto            2195
        //  2194: athrow         
        //  2195: getstatic       dev/nuker/pyro/fc.1:I
        //  2198: ifeq            2207
        //  2201: ldc_w           -547427144
        //  2204: goto            2210
        //  2207: ldc_w           -30522583
        //  2210: ldc_w           1867534961
        //  2213: ixor           
        //  2214: lookupswitch {
        //          -1854009000: 2240
        //          -1341210935: 2207
        //          default: 4189
        //        }
        //  2240: goto            2244
        //  2243: athrow         
        //  2244: invokevirtual   dev/nuker/pyro/f8b.5:()Lnet/minecraft/util/math/BlockPos;
        //  2247: goto            2251
        //  2250: athrow         
        //  2251: goto            2255
        //  2254: athrow         
        //  2255: invokevirtual   dev/nuker/pyro/f89.0:(Lnet/minecraft/util/math/BlockPos;)Z
        //  2258: goto            2262
        //  2261: athrow         
        //  2262: ifeq            3733
        //  2265: aload_0        
        //  2266: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2269: dup            
        //  2270: ifnonnull       2284
        //  2273: goto            2277
        //  2276: athrow         
        //  2277: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2280: goto            2284
        //  2283: athrow         
        //  2284: goto            2288
        //  2287: athrow         
        //  2288: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  2291: goto            2295
        //  2294: athrow         
        //  2295: aload_0        
        //  2296: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2299: dup            
        //  2300: ifnonnull       2314
        //  2303: goto            2307
        //  2306: athrow         
        //  2307: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2310: goto            2314
        //  2313: athrow         
        //  2314: goto            2318
        //  2317: athrow         
        //  2318: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2321: goto            2325
        //  2324: athrow         
        //  2325: goto            2329
        //  2328: athrow         
        //  2329: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //  2332: goto            2336
        //  2335: athrow         
        //  2336: if_icmpgt       2345
        //  2339: ldc_w           -641672189
        //  2342: goto            2348
        //  2345: ldc_w           -641672190
        //  2348: ldc_w           1985047029
        //  2351: ixor           
        //  2352: tableswitch {
        //          1596156908: 2376
        //          1596156909: 3733
        //          default: 2339
        //        }
        //  2376: aload_0        
        //  2377: aload_0        
        //  2378: getstatic       dev/nuker/pyro/fc.1:I
        //  2381: ifeq            2390
        //  2384: ldc_w           -1934681494
        //  2387: goto            2393
        //  2390: ldc_w           2027781911
        //  2393: ldc_w           1219700625
        //  2396: ixor           
        //  2397: lookupswitch {
        //          -1004782085: 2390
        //          812537990: 2424
        //          default: 4243
        //        }
        //  2424: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2427: dup            
        //  2428: ifnonnull       2487
        //  2431: getstatic       dev/nuker/pyro/fc.0:I
        //  2434: ifeq            2443
        //  2437: ldc_w           1367957441
        //  2440: goto            2446
        //  2443: ldc_w           -1269566774
        //  2446: ldc_w           495928939
        //  2449: ixor           
        //  2450: lookupswitch {
        //          -1476549166: 2443
        //          1275468202: 4241
        //          default: 2476
        //        }
        //  2476: goto            2480
        //  2479: athrow         
        //  2480: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2483: goto            2487
        //  2486: athrow         
        //  2487: getstatic       dev/nuker/pyro/fc.c:I
        //  2490: ifge            2499
        //  2493: ldc_w           424995498
        //  2496: goto            2502
        //  2499: ldc_w           1024320226
        //  2502: ldc_w           -2043532139
        //  2505: ixor           
        //  2506: lookupswitch {
        //          -1858349926: 2499
        //          -1620654529: 4177
        //          default: 2532
        //        }
        //  2532: goto            2536
        //  2535: athrow         
        //  2536: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2539: goto            2543
        //  2542: athrow         
        //  2543: getstatic       dev/nuker/pyro/fc.0:I
        //  2546: ifeq            2555
        //  2549: ldc_w           -1587691509
        //  2552: goto            2558
        //  2555: ldc_w           1649540860
        //  2558: ldc_w           729522258
        //  2561: ixor           
        //  2562: lookupswitch {
        //          -1977196455: 4255
        //          1815698953: 2555
        //          default: 2588
        //        }
        //  2588: aload_0        
        //  2589: getstatic       dev/nuker/pyro/fc.0:I
        //  2592: ifeq            2601
        //  2595: ldc_w           522251128
        //  2598: goto            2604
        //  2601: ldc_w           55667591
        //  2604: ldc_w           467235414
        //  2607: ixor           
        //  2608: lookupswitch {
        //          83466542: 2601
        //          411572689: 2636
        //          default: 4245
        //        }
        //  2636: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2639: dup            
        //  2640: ifnonnull       2654
        //  2643: goto            2647
        //  2646: athrow         
        //  2647: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2650: goto            2654
        //  2653: athrow         
        //  2654: dup            
        //  2655: goto            2659
        //  2658: athrow         
        //  2659: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  2662: goto            2666
        //  2665: athrow         
        //  2666: dup            
        //  2667: istore          6
        //  2669: iconst_1       
        //  2670: iadd           
        //  2671: goto            2675
        //  2674: athrow         
        //  2675: invokevirtual   dev/nuker/pyro/f8F.c:(I)V
        //  2678: goto            2682
        //  2681: athrow         
        //  2682: iload           6
        //  2684: goto            2688
        //  2687: athrow         
        //  2688: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2693: goto            2697
        //  2696: athrow         
        //  2697: checkcast       Ldev/nuker/pyro/f8b;
        //  2700: getstatic       dev/nuker/pyro/fc.0:I
        //  2703: ifeq            2712
        //  2706: ldc_w           -1669344134
        //  2709: goto            2715
        //  2712: ldc_w           -327122846
        //  2715: ldc_w           1210105770
        //  2718: ixor           
        //  2719: lookupswitch {
        //          -1533001784: 2744
        //          -731943984: 2712
        //          default: 4197
        //        }
        //  2744: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  2747: aload_0        
        //  2748: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2751: dup            
        //  2752: ifnonnull       2761
        //  2755: ldc_w           584647791
        //  2758: goto            2764
        //  2761: ldc_w           584647790
        //  2764: ldc_w           1628246695
        //  2767: ixor           
        //  2768: tableswitch {
        //          -2019021424: 2792
        //          -2019021423: 2803
        //          default: 2755
        //        }
        //  2792: goto            2796
        //  2795: athrow         
        //  2796: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2799: goto            2803
        //  2802: athrow         
        //  2803: goto            2807
        //  2806: athrow         
        //  2807: invokevirtual   dev/nuker/pyro/f8F.j:()I
        //  2810: goto            2814
        //  2813: athrow         
        //  2814: getstatic       dev/nuker/pyro/fc.c:I
        //  2817: ifge            2826
        //  2820: ldc_w           1084592150
        //  2823: goto            2829
        //  2826: ldc_w           581286566
        //  2829: ldc_w           246605484
        //  2832: ixor           
        //  2833: lookupswitch {
        //          739728394: 2860
        //          1310160570: 2826
        //          default: 4207
        //        }
        //  2860: aload_0        
        //  2861: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2864: dup            
        //  2865: ifnonnull       2879
        //  2868: goto            2872
        //  2871: athrow         
        //  2872: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  2875: goto            2879
        //  2878: athrow         
        //  2879: goto            2883
        //  2882: athrow         
        //  2883: invokevirtual   dev/nuker/pyro/f8F.8:()Ljava/util/List;
        //  2886: goto            2890
        //  2889: athrow         
        //  2890: goto            2894
        //  2893: athrow         
        //  2894: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //  2897: goto            2901
        //  2900: athrow         
        //  2901: if_icmplt       2910
        //  2904: ldc_w           -873264558
        //  2907: goto            2913
        //  2910: ldc_w           -873264559
        //  2913: ldc_w           -599734001
        //  2916: ixor           
        //  2917: tableswitch {
        //          795313850: 2940
        //          795313851: 3730
        //          default: 2904
        //        }
        //  2940: aload_0        
        //  2941: getstatic       dev/nuker/pyro/fc.1:I
        //  2944: ifeq            2953
        //  2947: ldc_w           1852439641
        //  2950: goto            2956
        //  2953: ldc_w           190725947
        //  2956: ldc_w           -1089987230
        //  2959: ixor           
        //  2960: lookupswitch {
        //          -1603831236: 2953
        //          -782114501: 4203
        //          default: 2988
        //        }
        //  2988: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  2991: dup            
        //  2992: ifnonnull       3006
        //  2995: goto            2999
        //  2998: athrow         
        //  2999: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3002: goto            3006
        //  3005: athrow         
        //  3006: goto            3010
        //  3009: athrow         
        //  3010: invokevirtual   dev/nuker/pyro/f8F.m:()Z
        //  3013: goto            3017
        //  3016: athrow         
        //  3017: ifeq            3026
        //  3020: ldc_w           -2108619917
        //  3023: goto            3029
        //  3026: ldc_w           -2108619920
        //  3029: ldc_w           -733812170
        //  3032: ixor           
        //  3033: tableswitch {
        //          -1406676342: 3056
        //          -1406676341: 3518
        //          default: 3020
        //        }
        //  3056: aload_0        
        //  3057: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  3060: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3063: dup            
        //  3064: pop            
        //  3065: goto            3069
        //  3068: athrow         
        //  3069: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //  3072: goto            3076
        //  3075: athrow         
        //  3076: ifeq            3310
        //  3079: aload_0        
        //  3080: new             Lnet/minecraft/util/math/BlockPos;
        //  3083: dup            
        //  3084: aload_0        
        //  3085: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  3088: getstatic       dev/nuker/pyro/fc.1:I
        //  3091: ifeq            3100
        //  3094: ldc_w           -5292358
        //  3097: goto            3103
        //  3100: ldc_w           -680973126
        //  3103: ldc_w           -1197034363
        //  3106: ixor           
        //  3107: lookupswitch {
        //          -1419893394: 3100
        //          1191807551: 4205
        //          default: 3132
        //        }
        //  3132: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3135: dup            
        //  3136: pop            
        //  3137: goto            3141
        //  3140: athrow         
        //  3141: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174791_d:()Lnet/minecraft/util/math/Vec3d;
        //  3144: goto            3148
        //  3147: athrow         
        //  3148: goto            3152
        //  3151: athrow         
        //  3152: invokespecial   net/minecraft/util/math/BlockPos.<init>:(Lnet/minecraft/util/math/Vec3d;)V
        //  3155: goto            3159
        //  3158: athrow         
        //  3159: goto            3163
        //  3162: athrow         
        //  3163: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  3166: goto            3170
        //  3169: athrow         
        //  3170: dup            
        //  3171: pop            
        //  3172: goto            3176
        //  3175: athrow         
        //  3176: invokevirtual   dev/nuker/pyro/f89.0:(Lnet/minecraft/util/math/BlockPos;)Z
        //  3179: goto            3183
        //  3182: athrow         
        //  3183: pop            
        //  3184: aload_0        
        //  3185: getstatic       dev/nuker/pyro/fc.c:I
        //  3188: ifge            3197
        //  3191: ldc_w           -1721940675
        //  3194: goto            3200
        //  3197: ldc_w           1270597604
        //  3200: ldc_w           181049833
        //  3203: ixor           
        //  3204: lookupswitch {
        //          -2040308469: 3197
        //          -1818764076: 4267
        //          default: 3232
        //        }
        //  3232: aload_0        
        //  3233: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  3236: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3239: dup            
        //  3240: pop            
        //  3241: goto            3245
        //  3244: athrow         
        //  3245: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //  3248: goto            3252
        //  3251: athrow         
        //  3252: ifne            3259
        //  3255: iconst_1       
        //  3256: goto            3260
        //  3259: iconst_0       
        //  3260: getstatic       dev/nuker/pyro/fc.0:I
        //  3263: ifeq            3272
        //  3266: ldc_w           -194270931
        //  3269: goto            3275
        //  3272: ldc_w           -770107354
        //  3275: ldc_w           433903578
        //  3278: ixor           
        //  3279: lookupswitch {
        //          -306741513: 4257
        //          -228502223: 3272
        //          default: 3304
        //        }
        //  3304: putfield        dev/nuker/pyro/f89.0:Z
        //  3307: goto            3515
        //  3310: aload_0        
        //  3311: getstatic       dev/nuker/pyro/fc.1:I
        //  3314: ifeq            3323
        //  3317: ldc_w           1321261525
        //  3320: goto            3326
        //  3323: ldc_w           -1429619614
        //  3326: ldc_w           1849377892
        //  3329: ixor           
        //  3330: lookupswitch {
        //          -940066241: 3323
        //          553360817: 4231
        //          default: 3356
        //        }
        //  3356: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  3359: dup            
        //  3360: ifnonnull       3374
        //  3363: goto            3367
        //  3366: athrow         
        //  3367: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3370: goto            3374
        //  3373: athrow         
        //  3374: goto            3378
        //  3377: athrow         
        //  3378: invokevirtual   dev/nuker/pyro/f8F.5:()V
        //  3381: goto            3385
        //  3384: athrow         
        //  3385: aload_0        
        //  3386: aconst_null    
        //  3387: checkcast       Ldev/nuker/pyro/f8b;
        //  3390: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //  3393: aload_0        
        //  3394: getstatic       dev/nuker/pyro/fc.1:I
        //  3397: ifeq            3406
        //  3400: ldc_w           651105230
        //  3403: goto            3409
        //  3406: ldc_w           -2033316727
        //  3409: ldc_w           2135282157
        //  3412: ixor           
        //  3413: lookupswitch {
        //          -108274332: 3440
        //          1502265891: 3406
        //          default: 4233
        //        }
        //  3440: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  3443: dup            
        //  3444: ifnonnull       3503
        //  3447: getstatic       dev/nuker/pyro/fc.c:I
        //  3450: ifge            3459
        //  3453: ldc_w           392728579
        //  3456: goto            3462
        //  3459: ldc_w           1433800069
        //  3462: ldc_w           -478053802
        //  3465: ixor           
        //  3466: lookupswitch {
        //          -642980409: 3459
        //          -185996715: 4193
        //          default: 3492
        //        }
        //  3492: goto            3496
        //  3495: athrow         
        //  3496: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3499: goto            3503
        //  3502: athrow         
        //  3503: iconst_0       
        //  3504: goto            3508
        //  3507: athrow         
        //  3508: invokevirtual   dev/nuker/pyro/f8F.c:(I)V
        //  3511: goto            3515
        //  3514: athrow         
        //  3515: goto            3733
        //  3518: getstatic       dev/nuker/pyro/fc.0:I
        //  3521: ifeq            3530
        //  3524: ldc_w           -1771692720
        //  3527: goto            3533
        //  3530: ldc_w           -1978929066
        //  3533: ldc_w           423614058
        //  3536: ixor           
        //  3537: lookupswitch {
        //          -1889940678: 4235
        //          -465383230: 3530
        //          default: 3564
        //        }
        //  3564: aload_0        
        //  3565: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  3568: dup            
        //  3569: ifnonnull       3583
        //  3572: goto            3576
        //  3575: athrow         
        //  3576: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3579: goto            3583
        //  3582: athrow         
        //  3583: goto            3587
        //  3586: athrow         
        //  3587: invokestatic    java/lang/System.currentTimeMillis:()J
        //  3590: goto            3594
        //  3593: athrow         
        //  3594: aload_0        
        //  3595: getfield        dev/nuker/pyro/f89.3:Ldev/nuker/pyro/f0d;
        //  3598: goto            3602
        //  3601: athrow         
        //  3602: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3605: goto            3609
        //  3608: athrow         
        //  3609: checkcast       Ljava/lang/Number;
        //  3612: goto            3616
        //  3615: athrow         
        //  3616: invokevirtual   java/lang/Number.doubleValue:()D
        //  3619: goto            3623
        //  3622: athrow         
        //  3623: ldc2_w          1000.0
        //  3626: dmul           
        //  3627: d2l            
        //  3628: ladd           
        //  3629: goto            3633
        //  3632: athrow         
        //  3633: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3636: goto            3640
        //  3639: athrow         
        //  3640: goto            3644
        //  3643: athrow         
        //  3644: invokevirtual   dev/nuker/pyro/f8F.c:(Ljava/lang/Long;)V
        //  3647: goto            3651
        //  3650: athrow         
        //  3651: ldc_w           "\u2226\u149d\u8b3e"
        //  3654: goto            3658
        //  3657: athrow         
        //  3658: invokestatic    invokestatic   !!! ERROR
        //  3661: goto            3665
        //  3664: athrow         
        //  3665: astore          6
        //  3667: iconst_0       
        //  3668: getstatic       dev/nuker/pyro/fc.c:I
        //  3671: ifge            3680
        //  3674: ldc_w           1611047646
        //  3677: goto            3683
        //  3680: ldc_w           787260307
        //  3683: ldc_w           1136700128
        //  3686: ixor           
        //  3687: lookupswitch {
        //          600180798: 4221
        //          642033314: 3680
        //          default: 3712
        //        }
        //  3712: istore          7
        //  3714: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //  3717: aload           6
        //  3719: goto            3723
        //  3722: athrow         
        //  3723: invokevirtual   java/io/PrintStream.println:(Ljava/lang/Object;)V
        //  3726: goto            3730
        //  3729: athrow         
        //  3730: goto            2138
        //  3733: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3736: astore          4
        //  3738: aload_2        
        //  3739: monitorexit    
        //  3740: goto            3750
        //  3743: astore          4
        //  3745: aload_2        
        //  3746: monitorexit    
        //  3747: aload           4
        //  3749: athrow         
        //  3750: goto            4175
        //  3753: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7p;
        //  3756: getstatic       dev/nuker/pyro/fc.1:I
        //  3759: ifeq            3768
        //  3762: ldc_w           -966171782
        //  3765: goto            3771
        //  3768: ldc_w           55253952
        //  3771: ldc_w           1574729303
        //  3774: ixor           
        //  3775: lookupswitch {
        //          -1682631379: 4187
        //          656810669: 3768
        //          default: 3800
        //        }
        //  3800: getfield        dev/nuker/pyro/f7p.c:Ldev/nuker/pyro/fw;
        //  3803: goto            3807
        //  3806: athrow         
        //  3807: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  3810: goto            3814
        //  3813: athrow         
        //  3814: dup            
        //  3815: pop            
        //  3816: checkcast       Ljava/lang/Boolean;
        //  3819: goto            3823
        //  3822: athrow         
        //  3823: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3826: goto            3830
        //  3829: athrow         
        //  3830: ifeq            4175
        //  3833: aload_0        
        //  3834: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  3837: dup            
        //  3838: ifnonnull       3899
        //  3841: getstatic       dev/nuker/pyro/fc.0:I
        //  3844: ifeq            3853
        //  3847: ldc_w           -1875554344
        //  3850: goto            3856
        //  3853: ldc_w           993596227
        //  3856: ldc_w           593294696
        //  3859: ixor           
        //  3860: lookupswitch {
        //          -1284916560: 3853
        //          409331243: 3888
        //          default: 4253
        //        }
        //  3888: goto            3892
        //  3891: athrow         
        //  3892: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3895: goto            3899
        //  3898: athrow         
        //  3899: goto            3903
        //  3902: athrow         
        //  3903: invokevirtual   dev/nuker/pyro/f8F.9:()Z
        //  3906: goto            3910
        //  3909: athrow         
        //  3910: ifne            4175
        //  3913: getstatic       dev/nuker/pyro/fc.0:I
        //  3916: ifeq            3925
        //  3919: ldc_w           826151332
        //  3922: goto            3928
        //  3925: ldc_w           836484138
        //  3928: ldc_w           969852977
        //  3931: ixor           
        //  3932: lookupswitch {
        //          135623707: 3960
        //          150002069: 3925
        //          default: 4247
        //        }
        //  3960: aload_0        
        //  3961: iconst_1       
        //  3962: putfield        dev/nuker/pyro/f89.c:Z
        //  3965: aload_0        
        //  3966: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  3969: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3972: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71075_bZ:Lnet/minecraft/entity/player/PlayerCapabilities;
        //  3975: getstatic       dev/nuker/pyro/fc.c:I
        //  3978: ifge            3987
        //  3981: ldc_w           -1307391759
        //  3984: goto            3990
        //  3987: ldc_w           717078848
        //  3990: ldc_w           1404856531
        //  3993: ixor           
        //  3994: lookupswitch {
        //          -508649438: 4209
        //          1489276304: 3987
        //          default: 4020
        //        }
        //  4020: getfield        net/minecraft/entity/player/PlayerCapabilities.field_75100_b:Z
        //  4023: ifeq            4175
        //  4026: aload_0        
        //  4027: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/client/Minecraft;
        //  4030: getstatic       dev/nuker/pyro/fc.0:I
        //  4033: ifeq            4042
        //  4036: ldc_w           1594761030
        //  4039: goto            4045
        //  4042: ldc_w           -309249701
        //  4045: ldc_w           1691285439
        //  4048: ixor           
        //  4049: lookupswitch {
        //          -1990209820: 4076
        //          1002498297: 4042
        //          default: 4211
        //        }
        //  4076: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4079: getstatic       dev/nuker/pyro/fc.0:I
        //  4082: ifeq            4091
        //  4085: ldc_w           413920939
        //  4088: goto            4094
        //  4091: ldc_w           -1280398389
        //  4094: ldc_w           1605771217
        //  4097: ixor           
        //  4098: lookupswitch {
        //          -510626872: 4091
        //          1193144698: 4179
        //          default: 4124
        //        }
        //  4124: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71075_bZ:Lnet/minecraft/entity/player/PlayerCapabilities;
        //  4127: iconst_0       
        //  4128: getstatic       dev/nuker/pyro/fc.0:I
        //  4131: ifeq            4140
        //  4134: ldc_w           868542801
        //  4137: goto            4143
        //  4140: ldc_w           -719127782
        //  4143: ldc_w           352462315
        //  4146: ixor           
        //  4147: lookupswitch {
        //          -1071587599: 4172
        //          650562746: 4140
        //          default: 4201
        //        }
        //  4172: putfield        net/minecraft/entity/player/PlayerCapabilities.field_75100_b:Z
        //  4175: return         
        //  4176: return         
        //  4177: aconst_null    
        //  4178: athrow         
        //  4179: aconst_null    
        //  4180: athrow         
        //  4181: aconst_null    
        //  4182: athrow         
        //  4183: aconst_null    
        //  4184: athrow         
        //  4185: aconst_null    
        //  4186: athrow         
        //  4187: aconst_null    
        //  4188: athrow         
        //  4189: aconst_null    
        //  4190: athrow         
        //  4191: aconst_null    
        //  4192: athrow         
        //  4193: aconst_null    
        //  4194: athrow         
        //  4195: aconst_null    
        //  4196: athrow         
        //  4197: aconst_null    
        //  4198: athrow         
        //  4199: aconst_null    
        //  4200: athrow         
        //  4201: aconst_null    
        //  4202: athrow         
        //  4203: aconst_null    
        //  4204: athrow         
        //  4205: aconst_null    
        //  4206: athrow         
        //  4207: aconst_null    
        //  4208: athrow         
        //  4209: aconst_null    
        //  4210: athrow         
        //  4211: aconst_null    
        //  4212: athrow         
        //  4213: aconst_null    
        //  4214: athrow         
        //  4215: aconst_null    
        //  4216: athrow         
        //  4217: aconst_null    
        //  4218: athrow         
        //  4219: aconst_null    
        //  4220: athrow         
        //  4221: aconst_null    
        //  4222: athrow         
        //  4223: aconst_null    
        //  4224: athrow         
        //  4225: aconst_null    
        //  4226: athrow         
        //  4227: aconst_null    
        //  4228: athrow         
        //  4229: aconst_null    
        //  4230: athrow         
        //  4231: aconst_null    
        //  4232: athrow         
        //  4233: aconst_null    
        //  4234: athrow         
        //  4235: aconst_null    
        //  4236: athrow         
        //  4237: aconst_null    
        //  4238: athrow         
        //  4239: aconst_null    
        //  4240: athrow         
        //  4241: aconst_null    
        //  4242: athrow         
        //  4243: aconst_null    
        //  4244: athrow         
        //  4245: aconst_null    
        //  4246: athrow         
        //  4247: aconst_null    
        //  4248: athrow         
        //  4249: aconst_null    
        //  4250: athrow         
        //  4251: aconst_null    
        //  4252: athrow         
        //  4253: aconst_null    
        //  4254: athrow         
        //  4255: aconst_null    
        //  4256: athrow         
        //  4257: aconst_null    
        //  4258: athrow         
        //  4259: aconst_null    
        //  4260: athrow         
        //  4261: aconst_null    
        //  4262: athrow         
        //  4263: aconst_null    
        //  4264: athrow         
        //  4265: aconst_null    
        //  4266: athrow         
        //  4267: aconst_null    
        //  4268: athrow         
        //  4269: aconst_null    
        //  4270: athrow         
        //  4271: aconst_null    
        //  4272: athrow         
        //  4273: pop            
        //  4274: goto            24
        //  4277: pop            
        //  4278: aconst_null    
        //  4279: goto            4273
        //  4282: dup            
        //  4283: ifnull          4273
        //  4286: checkcast       Ljava/lang/Throwable;
        //  4289: athrow         
        //  4290: dup            
        //  4291: ifnull          4277
        //  4294: checkcast       Ljava/lang/Throwable;
        //  4297: athrow         
        //  4298: aconst_null    
        //  4299: athrow         
        //    StackMapTable: 02 6D 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FD 00 03 07 00 03 07 06 44 FF 00 19 00 02 07 00 03 07 06 44 00 02 07 00 03 01 FF 00 02 00 02 07 00 03 07 06 44 00 03 07 00 03 01 01 FF 00 1E 00 02 07 00 03 07 06 44 00 02 07 00 03 01 56 07 00 03 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 03 01 5D 07 00 03 46 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 01 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 FF 00 0B 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 FF 00 02 00 02 07 00 03 07 06 44 00 03 07 05 1F 07 01 14 01 FF 00 1D 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 45 07 00 45 00 00 0B 42 01 1C FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 01 07 00 60 45 07 00 45 40 07 00 60 42 07 00 3A 40 07 00 60 45 07 00 45 40 07 03 53 4F 07 00 03 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 03 01 5E 07 00 03 46 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 01 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 45 07 00 45 00 42 07 00 45 00 45 07 00 45 40 07 00 E6 47 07 00 45 40 07 05 34 45 07 00 45 40 07 05 63 49 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 08 01 85 08 01 85 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 3A 45 07 00 2A FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 3A 07 05 5A 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A FF 00 06 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 08 01 A5 08 01 A5 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 05 4B 4A 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 00 60 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 00 60 42 07 00 24 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 00 60 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 46 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 FF 00 0B 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 FF 00 02 00 02 07 00 03 07 06 44 00 05 07 05 63 07 05 5A 07 05 4B 07 03 53 01 FF 00 1F 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 05 4B 45 07 00 28 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 05 4B 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 05 4B 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 03 53 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 07 03 53 47 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A FF 00 0B 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A FF 00 02 00 02 07 00 03 07 06 44 00 03 07 05 63 07 05 5A 01 FF 00 1C 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A 45 07 00 45 00 00 06 05 42 01 1B FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 01 07 00 94 45 07 00 45 40 01 02 05 42 01 1B 50 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 00 03 08 02 ED 08 02 ED 07 00 94 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 00 03 08 02 ED 08 02 ED 07 02 27 42 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 04 07 00 03 08 02 ED 08 02 ED 07 02 27 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 00 03 07 00 9B FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 00 03 07 00 9B 45 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 00 03 07 00 9B 44 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 02 07 00 03 07 00 9B 45 07 00 45 40 01 03 47 07 00 60 45 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5A 07 00 60 4B 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5C 07 00 60 42 07 00 2C 40 07 00 60 45 07 00 45 40 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 01 07 00 60 45 07 00 45 00 0C 00 FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 02 07 00 03 07 06 44 00 01 07 00 60 45 07 00 45 40 07 00 60 4B 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5D 07 00 60 42 07 00 2C 40 07 00 60 45 07 00 45 40 01 03 4C 07 00 03 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 03 01 5C 07 00 03 49 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 4B 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5E 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 01 56 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5E 07 00 60 42 07 00 30 40 07 00 60 45 07 00 45 40 07 00 60 4B 07 00 60 FF 00 02 00 02 07 00 03 07 06 44 00 02 07 00 60 01 5D 07 00 60 42 07 00 3A 40 07 00 60 45 07 00 45 40 07 00 CD FF 00 09 00 04 07 00 03 07 06 44 07 01 2A 01 00 01 07 00 45 40 07 01 2A 47 07 00 45 40 01 02 05 42 01 18 03 40 01 FF 00 17 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 03 FF 00 02 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 03 01 FF 00 1F 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 03 FF 00 06 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 05 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 60 01 FF 00 1B 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 0B 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 60 01 FF 00 1C 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 0B 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 60 01 FF 00 1D 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 CD FF 00 07 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 CD 07 00 60 FF 00 05 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 CD 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 07 01 2A 01 00 04 07 00 03 07 00 CD 07 00 60 01 FF 00 1B 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 CD 07 00 60 42 07 00 2C FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 CD 07 00 60 45 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 03 07 00 03 07 00 CD 07 00 60 43 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 04 07 00 03 07 00 CD 07 00 60 07 00 60 45 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 07 01 2A 01 00 04 07 00 03 07 00 CD 07 00 60 01 FF 00 06 00 00 00 01 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 01 01 00 04 07 00 03 07 00 CD 07 00 60 01 45 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 01 01 00 02 07 00 03 07 00 CD 43 07 00 2C FF 00 00 00 04 07 00 03 07 06 44 01 01 00 03 07 00 03 07 00 CD 01 47 07 00 45 FF 00 00 00 04 07 00 03 07 06 44 01 01 00 02 07 00 03 07 00 CF FF 00 05 00 04 07 00 03 07 06 44 00 01 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 03 01 5D 07 00 03 4E 07 00 E6 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 E6 01 5D 07 00 E6 50 07 00 94 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 94 01 5F 07 00 94 42 07 00 28 40 07 00 94 45 07 00 45 40 01 02 05 42 01 18 4E 07 03 A4 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 03 A4 01 5D 07 03 A4 45 07 00 24 40 07 05 1F 45 07 00 45 40 07 00 CF 47 07 00 45 40 07 01 14 45 07 00 45 40 01 0E 42 01 1F 4A 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 4B 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 60 01 5D 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 CD FF 00 0F 00 04 07 00 03 07 06 44 07 00 CD 01 00 01 01 FF 00 02 00 04 07 00 03 07 06 44 07 00 CD 01 00 02 01 01 5D 01 FF 00 11 00 05 07 00 03 07 06 44 07 00 CD 01 01 00 01 01 FF 00 02 00 05 07 00 03 07 06 44 07 00 CD 01 01 00 02 01 01 5E 01 FC 00 01 01 FF 00 08 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 05 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 8C 01 FF 00 1B 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 0B 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 8C 01 FF 00 1D 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C 42 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 9B FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 9B 45 07 00 45 40 01 4D 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 01 07 00 60 45 07 00 45 40 01 4A 07 00 36 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 07 00 60 42 07 00 2C FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 07 00 CD 42 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 07 00 CD 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 01 01 02 05 42 01 1B FF 00 0D 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 03 01 FF 00 1E 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 12 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 60 01 FF 00 1D 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 0B 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 60 01 FF 00 1D 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 42 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 0B 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 01 FF 00 1D 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 0C 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 07 00 03 FF 00 02 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 04 07 00 03 07 00 CD 07 00 03 01 FF 00 1F 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 07 00 03 49 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 07 00 60 43 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 04 07 00 03 07 00 CD 07 00 60 07 00 60 45 07 00 45 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 04 07 00 03 07 00 CD 07 00 60 01 FF 00 07 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 34 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 07 00 CD 07 00 60 01 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 CD 44 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 03 07 00 CD 01 47 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 CF FF 00 0E 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 8C FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 03 07 00 8C 01 FF 00 1C 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 8C 4A 07 00 60 45 07 00 60 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 01 5B 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 60 45 07 00 45 40 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 60 45 07 00 45 40 01 4B 01 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 01 5E 01 FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 07 00 CD 42 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 07 00 CD 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 01 01 02 05 42 01 1A 4C 07 00 03 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 49 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 01 02 05 42 01 1A FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 94 45 07 00 45 40 01 FF 00 17 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 00 E6 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 05 07 00 03 08 0C 08 08 0C 08 07 00 E6 01 FF 00 1C 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 00 E6 47 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 00 94 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 02 27 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 02 27 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 9B 42 07 00 2E FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 9B 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 9B 44 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 9B 45 07 00 45 40 01 4D 07 00 03 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0B 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 94 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 46 07 00 03 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 FF 00 0B 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 03 01 01 FF 00 1C 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 05 4C 07 00 03 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 5D 07 00 03 49 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 00 54 07 00 03 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 5E 07 00 03 52 07 00 60 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 01 5D 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 43 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 01 45 07 00 45 00 02 0B 42 01 1E FF 00 0A 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 60 45 07 00 45 40 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 60 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 04 46 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 60 04 07 02 A3 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 60 04 07 00 CF 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 60 04 07 03 AA 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 03 07 00 60 04 03 48 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 04 45 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 07 06 19 42 07 00 45 FF 00 00 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 60 07 06 19 45 07 00 45 00 45 07 00 2A 40 07 03 53 45 07 00 45 40 07 03 53 FF 00 0E 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 07 03 53 00 01 01 FF 00 02 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 07 03 53 00 02 01 01 5C 01 FF 00 09 00 08 07 00 03 07 06 44 07 00 CD 01 01 01 07 03 53 01 00 01 07 00 45 FF 00 00 00 08 07 00 03 07 06 44 07 00 CD 01 01 01 07 03 53 01 00 02 07 04 F7 07 03 53 45 07 00 45 F9 00 00 02 FF 00 09 00 04 07 00 03 07 06 44 07 00 CD 01 00 01 07 00 45 FD 00 06 07 01 3A 01 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 00 4E 07 03 A4 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 03 A4 01 5C 07 03 A4 45 07 00 38 40 07 05 1F 45 07 00 45 40 07 00 CF 47 07 00 45 40 07 01 14 45 07 00 45 40 01 56 07 00 60 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 60 01 5F 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 01 0E 42 01 1F 5A 07 06 36 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 06 36 01 5D 07 06 36 55 07 00 E6 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 E6 01 5E 07 00 E6 4E 07 00 94 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 02 07 00 94 01 5D 07 00 94 FF 00 0F 00 04 07 00 03 07 06 44 00 01 00 02 07 06 36 01 FF 00 02 00 04 07 00 03 07 06 44 00 01 00 03 07 06 36 01 01 FF 00 1C 00 04 07 00 03 07 06 44 00 01 00 02 07 06 36 01 F9 00 02 00 FF 00 00 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 94 01 FF 00 01 00 02 07 00 03 07 06 44 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 03 A4 FF 00 01 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 8C FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 60 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 60 FF 00 01 00 02 07 00 03 07 06 44 00 00 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 07 00 8C FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 02 07 06 36 01 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 04 07 00 03 08 0C 08 08 0C 08 07 00 E6 41 01 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 06 36 41 07 00 E6 FF 00 01 00 02 07 00 03 07 06 44 00 04 07 05 63 07 05 5A 07 05 4B 07 03 53 FF 00 01 00 02 07 00 03 07 06 44 00 02 07 05 1F 07 01 14 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 60 FF 00 01 00 04 07 00 03 07 06 44 07 00 CD 01 00 01 01 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 07 03 53 00 01 01 FF 00 01 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 60 41 07 00 60 FF 00 01 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 03 41 07 00 03 01 FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 E6 FF 00 01 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 60 FF 00 01 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 03 07 00 03 07 00 CD 07 00 03 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 00 FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 03 41 07 00 60 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 60 FF 00 01 00 06 07 00 03 07 06 44 07 00 CD 01 01 01 00 02 07 00 03 07 00 CD FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 06 44 00 01 00 01 07 00 94 41 07 03 A4 FF 00 01 00 02 07 00 03 07 06 44 00 02 07 05 63 07 05 5A FF 00 01 00 04 07 00 03 07 06 44 07 01 2A 01 00 02 07 00 03 07 00 60 FF 00 01 00 07 07 00 03 07 06 44 07 00 CD 01 01 01 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 60 FF 00 01 00 05 07 00 03 07 06 44 07 00 CD 01 01 00 01 01 FF 00 01 00 02 07 00 03 07 06 44 00 01 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  2088   2187   3743   3750   Any
        //  2188   2254   3743   3750   Any
        //  2255   2287   3743   3750   Any
        //  2288   2795   3743   3750   Any
        //  2796   2806   3743   3750   Any
        //  2807   2871   3743   3750   Any
        //  2872   2882   3743   3750   Any
        //  2883   3068   3743   3750   Any
        //  3069   3151   3743   3750   Any
        //  3152   3244   3743   3750   Any
        //  3245   3575   3743   3750   Any
        //  3576   3586   3743   3750   Any
        //  3587   3738   3743   3750   Any
        //  3743   3745   3743   3750   Any
        //  8      20     4282   4290   Ljava/lang/ClassCastException;
        //  4282   4290   4282   4290   Ljava/lang/StringIndexOutOfBoundsException;
        //  4298   4300   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  147    154    154    155    Any
        //  147    154    147    148    Any
        //  147    154    3      8      Ljava/util/ConcurrentModificationException;
        //  148    154    154    155    Ljava/lang/AssertionError;
        //  148    154    3      8      Any
        //  203    210    210    211    Any
        //  204    210    203    204    Any
        //  203    210    3      8      Any
        //  204    210    203    204    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  204    210    3      8      Any
        //  268    274    274    275    Any
        //  268    274    3      8      Any
        //  268    274    3      8      Any
        //  268    274    3      8      Any
        //  268    274    3      8      Any
        //  278    285    285    286    Any
        //  278    285    285    286    Any
        //  279    285    3      8      Any
        //  279    285    278    279    Ljava/lang/EnumConstantNotPresentException;
        //  278    285    285    286    Any
        //  343    350    350    351    Any
        //  343    350    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  343    350    350    351    Ljava/util/ConcurrentModificationException;
        //  344    350    343    344    Any
        //  343    350    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  354    361    361    362    Any
        //  354    361    354    355    Any
        //  355    361    3      8      Any
        //  355    361    354    355    Ljava/lang/NegativeArraySizeException;
        //  354    361    354    355    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  365    372    372    373    Any
        //  366    372    365    366    Any
        //  365    372    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  365    372    372    373    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  366    372    365    366    Ljava/lang/AssertionError;
        //  381    388    388    389    Any
        //  382    388    381    382    Ljava/lang/StringIndexOutOfBoundsException;
        //  381    388    388    389    Ljava/lang/NegativeArraySizeException;
        //  382    388    381    382    Any
        //  382    388    388    389    Any
        //  399    406    406    407    Any
        //  399    406    399    400    Ljava/lang/ClassCastException;
        //  400    406    3      8      Any
        //  400    406    399    400    Any
        //  400    406    406    407    Ljava/lang/NegativeArraySizeException;
        //  413    420    420    421    Any
        //  414    420    420    421    Ljava/lang/IllegalStateException;
        //  413    420    413    414    Ljava/lang/IndexOutOfBoundsException;
        //  413    420    3      8      Ljava/lang/NullPointerException;
        //  413    420    3      8      Any
        //  429    435    435    436    Any
        //  429    435    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  429    435    435    436    Ljava/lang/ArithmeticException;
        //  429    435    435    436    Any
        //  429    435    435    436    Any
        //  447    454    454    455    Any
        //  448    454    447    448    Ljava/lang/AssertionError;
        //  447    454    447    448    Ljava/lang/IllegalStateException;
        //  447    454    447    448    Any
        //  448    454    454    455    Ljava/lang/ArithmeticException;
        //  458    465    465    466    Any
        //  458    465    458    459    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  458    465    465    466    Ljava/lang/NumberFormatException;
        //  458    465    3      8      Any
        //  458    465    465    466    Ljava/lang/NegativeArraySizeException;
        //  473    480    480    481    Any
        //  474    480    480    481    Ljava/lang/IllegalArgumentException;
        //  473    480    473    474    Any
        //  473    480    3      8      Any
        //  474    480    480    481    Any
        //  531    538    538    539    Any
        //  531    538    3      8      Any
        //  532    538    531    532    Any
        //  531    538    538    539    Any
        //  532    538    531    532    Any
        //  545    552    552    553    Any
        //  546    552    3      8      Any
        //  545    552    545    546    Ljava/util/ConcurrentModificationException;
        //  546    552    3      8      Any
        //  545    552    3      8      Ljava/util/ConcurrentModificationException;
        //  556    563    563    564    Any
        //  556    563    556    557    Any
        //  557    563    3      8      Ljava/lang/RuntimeException;
        //  557    563    563    564    Any
        //  557    563    563    564    Any
        //  567    574    574    575    Any
        //  568    574    567    568    Any
        //  568    574    567    568    Any
        //  567    574    567    568    Any
        //  567    574    3      8      Any
        //  578    587    587    588    Any
        //  578    587    587    588    Ljava/lang/IndexOutOfBoundsException;
        //  578    587    578    579    Any
        //  579    587    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  578    587    587    588    Any
        //  635    642    642    643    Any
        //  636    642    3      8      Any
        //  635    642    3      8      Any
        //  635    642    635    636    Any
        //  636    642    635    636    Any
        //  701    707    707    708    Any
        //  701    707    707    708    Any
        //  701    707    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  701    707    707    708    Any
        //  701    707    707    708    Ljava/lang/UnsupportedOperationException;
        //  765    772    772    773    Any
        //  765    772    772    773    Any
        //  766    772    772    773    Ljava/util/NoSuchElementException;
        //  766    772    772    773    Ljava/lang/ArithmeticException;
        //  765    772    765    766    Any
        //  776    783    783    784    Any
        //  776    783    776    777    Any
        //  777    783    776    777    Any
        //  777    783    3      8      Any
        //  776    783    776    777    Any
        //  788    794    794    795    Any
        //  788    794    794    795    Ljava/lang/NumberFormatException;
        //  788    794    3      8      Any
        //  788    794    3      8      Ljava/util/ConcurrentModificationException;
        //  788    794    794    795    Ljava/util/ConcurrentModificationException;
        //  800    807    807    808    Any
        //  801    807    3      8      Ljava/util/NoSuchElementException;
        //  800    807    800    801    Any
        //  801    807    807    808    Ljava/lang/NegativeArraySizeException;
        //  800    807    807    808    Any
        //  903    910    910    911    Any
        //  903    910    3      8      Any
        //  903    910    3      8      Any
        //  903    910    903    904    Ljava/lang/RuntimeException;
        //  904    910    910    911    Any
        //  915    921    921    922    Any
        //  915    921    3      8      Any
        //  915    921    3      8      Ljava/lang/UnsupportedOperationException;
        //  915    921    921    922    Any
        //  915    921    3      8      Any
        //  948    954    954    955    Any
        //  948    954    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  948    954    954    955    Any
        //  948    954    954    955    Ljava/util/ConcurrentModificationException;
        //  948    954    3      8      Any
        //  1003   1010   1010   1011   Any
        //  1003   1010   1003   1004   Ljava/lang/IndexOutOfBoundsException;
        //  1003   1010   3      8      Any
        //  1004   1010   1010   1011   Ljava/lang/ClassCastException;
        //  1004   1010   1003   1004   Ljava/util/ConcurrentModificationException;
        //  1070   1077   1077   1078   Any
        //  1070   1077   1070   1071   Any
        //  1070   1077   3      8      Any
        //  1070   1077   1070   1071   Ljava/lang/NumberFormatException;
        //  1070   1077   1070   1071   Any
        //  1127   1134   1134   1135   Any
        //  1128   1134   1127   1128   Any
        //  1128   1134   1134   1135   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1128   1134   1134   1135   Any
        //  1128   1134   1127   1128   Any
        //  1195   1202   1202   1203   Any
        //  1195   1202   1195   1196   Ljava/lang/IllegalArgumentException;
        //  1195   1202   3      8      Any
        //  1196   1202   1202   1203   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1196   1202   1202   1203   Any
        //  1251   1258   1258   1259   Any
        //  1251   1258   3      8      Any
        //  1252   1258   1251   1252   Ljava/lang/EnumConstantNotPresentException;
        //  1252   1258   1258   1259   Ljava/lang/ClassCastException;
        //  1252   1258   1258   1259   Ljava/lang/RuntimeException;
        //  1269   1278   1278   1279   Any
        //  1270   1278   1278   1279   Any
        //  1270   1278   1269   1270   Ljava/lang/EnumConstantNotPresentException;
        //  1269   1278   1269   1270   Any
        //  1270   1278   3      8      Any
        //  1471   1478   1478   1479   Any
        //  1472   1478   1471   1472   Ljava/util/ConcurrentModificationException;
        //  1472   1478   1471   1472   Ljava/lang/IndexOutOfBoundsException;
        //  1471   1478   3      8      Any
        //  1472   1478   1471   1472   Any
        //  1527   1534   1534   1535   Any
        //  1528   1534   1527   1528   Any
        //  1527   1534   1527   1528   Ljava/lang/EnumConstantNotPresentException;
        //  1528   1534   1527   1528   Ljava/lang/NumberFormatException;
        //  1527   1534   3      8      Any
        //  1583   1590   1590   1591   Any
        //  1584   1590   3      8      Ljava/util/NoSuchElementException;
        //  1583   1590   1590   1591   Any
        //  1583   1590   1583   1584   Ljava/lang/IllegalArgumentException;
        //  1583   1590   1583   1584   Ljava/lang/EnumConstantNotPresentException;
        //  1595   1602   1602   1603   Any
        //  1596   1602   1595   1596   Ljava/lang/IllegalArgumentException;
        //  1596   1602   1602   1603   Ljava/lang/IllegalStateException;
        //  1595   1602   1602   1603   Ljava/util/NoSuchElementException;
        //  1595   1602   1595   1596   Any
        //  1611   1617   1617   1618   Any
        //  1611   1617   1617   1618   Any
        //  1611   1617   3      8      Any
        //  1611   1617   1617   1618   Ljava/lang/IllegalArgumentException;
        //  1611   1617   1617   1618   Any
        //  1622   1631   1631   1632   Any
        //  1622   1631   1631   1632   Any
        //  1623   1631   1622   1623   Ljava/lang/RuntimeException;
        //  1623   1631   3      8      Any
        //  1623   1631   1622   1623   Ljava/lang/NegativeArraySizeException;
        //  1787   1794   1794   1795   Any
        //  1788   1794   3      8      Ljava/lang/IllegalStateException;
        //  1787   1794   3      8      Any
        //  1787   1794   1787   1788   Ljava/util/ConcurrentModificationException;
        //  1787   1794   1794   1795   Ljava/lang/StringIndexOutOfBoundsException;
        //  1886   1893   1893   1894   Any
        //  1886   1893   3      8      Any
        //  1886   1893   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1887   1893   1886   1887   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1886   1893   1893   1894   Any
        //  1902   1909   1909   1910   Any
        //  1902   1909   1902   1903   Ljava/lang/IndexOutOfBoundsException;
        //  1903   1909   1902   1903   Any
        //  1903   1909   3      8      Ljava/lang/NumberFormatException;
        //  1903   1909   3      8      Any
        //  1971   1978   1978   1979   Any
        //  1972   1978   1978   1979   Any
        //  1971   1978   1971   1972   Any
        //  1971   1978   1971   1972   Ljava/lang/IndexOutOfBoundsException;
        //  1971   1978   1978   1979   Ljava/lang/IllegalStateException;
        //  2027   2034   2034   2035   Any
        //  2027   2034   2034   2035   Any
        //  2027   2034   2027   2028   Any
        //  2028   2034   2027   2028   Any
        //  2028   2034   2034   2035   Any
        //  2188   2194   2194   2195   Any
        //  2188   2194   2194   2195   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2188   2194   3      8      Any
        //  2188   2194   2194   2195   Any
        //  2188   2194   3      8      Any
        //  2243   2250   2250   2251   Any
        //  2244   2250   3      8      Any
        //  2243   2250   2243   2244   Any
        //  2243   2250   2250   2251   Ljava/lang/ClassCastException;
        //  2244   2250   2250   2251   Any
        //  2255   2261   2261   2262   Any
        //  2255   2261   3      8      Any
        //  2255   2261   2261   2262   Any
        //  2255   2261   3      8      Any
        //  2255   2261   2261   2262   Any
        //  2276   2283   2283   2284   Any
        //  2276   2283   2283   2284   Ljava/lang/NumberFormatException;
        //  2277   2283   2276   2277   Any
        //  2276   2283   2276   2277   Any
        //  2277   2283   2283   2284   Any
        //  2288   2294   2294   2295   Any
        //  2288   2294   3      8      Any
        //  2288   2294   2294   2295   Any
        //  2288   2294   2294   2295   Any
        //  2288   2294   3      8      Any
        //  2306   2313   2313   2314   Any
        //  2306   2313   3      8      Ljava/lang/NullPointerException;
        //  2307   2313   2313   2314   Any
        //  2306   2313   2306   2307   Ljava/lang/UnsupportedOperationException;
        //  2306   2313   3      8      Ljava/lang/ClassCastException;
        //  2317   2324   2324   2325   Any
        //  2318   2324   2317   2318   Ljava/lang/EnumConstantNotPresentException;
        //  2317   2324   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2317   2324   2324   2325   Ljava/lang/RuntimeException;
        //  2317   2324   2317   2318   Ljava/util/ConcurrentModificationException;
        //  2328   2335   2335   2336   Any
        //  2328   2335   3      8      Any
        //  2328   2335   2335   2336   Ljava/lang/StringIndexOutOfBoundsException;
        //  2329   2335   3      8      Any
        //  2329   2335   2328   2329   Any
        //  2479   2486   2486   2487   Any
        //  2480   2486   2486   2487   Any
        //  2479   2486   3      8      Any
        //  2480   2486   2479   2480   Any
        //  2479   2486   2479   2480   Ljava/lang/NullPointerException;
        //  2535   2542   2542   2543   Any
        //  2535   2542   2535   2536   Any
        //  2535   2542   3      8      Ljava/util/ConcurrentModificationException;
        //  2535   2542   2535   2536   Any
        //  2536   2542   2542   2543   Any
        //  2646   2653   2653   2654   Any
        //  2647   2653   2653   2654   Any
        //  2646   2653   2646   2647   Any
        //  2647   2653   2646   2647   Ljava/util/NoSuchElementException;
        //  2646   2653   2653   2654   Ljava/lang/IllegalStateException;
        //  2658   2665   2665   2666   Any
        //  2658   2665   2658   2659   Any
        //  2658   2665   3      8      Any
        //  2659   2665   2665   2666   Ljava/lang/StringIndexOutOfBoundsException;
        //  2659   2665   2665   2666   Any
        //  2674   2681   2681   2682   Any
        //  2674   2681   3      8      Ljava/lang/AssertionError;
        //  2674   2681   2681   2682   Ljava/lang/StringIndexOutOfBoundsException;
        //  2674   2681   2674   2675   Ljava/lang/ClassCastException;
        //  2675   2681   2681   2682   Ljava/lang/NullPointerException;
        //  2687   2696   2696   2697   Any
        //  2687   2696   2687   2688   Any
        //  2688   2696   2687   2688   Any
        //  2688   2696   3      8      Any
        //  2688   2696   2696   2697   Any
        //  2796   2802   2802   2803   Any
        //  2796   2802   3      8      Ljava/lang/IllegalStateException;
        //  2796   2802   2802   2803   Any
        //  2796   2802   2802   2803   Any
        //  2796   2802   3      8      Ljava/lang/IllegalStateException;
        //  2807   2813   2813   2814   Any
        //  2807   2813   2813   2814   Ljava/lang/ArithmeticException;
        //  2807   2813   3      8      Ljava/lang/NullPointerException;
        //  2807   2813   2813   2814   Any
        //  2807   2813   2813   2814   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2872   2878   2878   2879   Any
        //  2872   2878   3      8      Any
        //  2872   2878   3      8      Any
        //  2872   2878   3      8      Any
        //  2872   2878   3      8      Ljava/lang/NullPointerException;
        //  2883   2889   2889   2890   Any
        //  2883   2889   2889   2890   Any
        //  2883   2889   2889   2890   Any
        //  2883   2889   3      8      Any
        //  2883   2889   2889   2890   Any
        //  2893   2900   2900   2901   Any
        //  2893   2900   2893   2894   Any
        //  2894   2900   2900   2901   Ljava/lang/NumberFormatException;
        //  2893   2900   2900   2901   Any
        //  2893   2900   3      8      Any
        //  2998   3005   3005   3006   Any
        //  2999   3005   3      8      Any
        //  2999   3005   2998   2999   Any
        //  2999   3005   2998   2999   Any
        //  2998   3005   3      8      Ljava/lang/NullPointerException;
        //  3009   3016   3016   3017   Any
        //  3009   3016   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3009   3016   3016   3017   Ljava/lang/IllegalArgumentException;
        //  3009   3016   3009   3010   Any
        //  3009   3016   3016   3017   Any
        //  3069   3075   3075   3076   Any
        //  3069   3075   3075   3076   Any
        //  3069   3075   3075   3076   Any
        //  3069   3075   3075   3076   Ljava/lang/ClassCastException;
        //  3069   3075   3075   3076   Any
        //  3140   3147   3147   3148   Any
        //  3141   3147   3140   3141   Ljava/lang/IllegalArgumentException;
        //  3140   3147   3140   3141   Ljava/lang/AssertionError;
        //  3141   3147   3147   3148   Any
        //  3140   3147   3140   3141   Any
        //  3152   3158   3158   3159   Any
        //  3152   3158   3      8      Ljava/lang/RuntimeException;
        //  3152   3158   3      8      Any
        //  3152   3158   3158   3159   Any
        //  3152   3158   3      8      Any
        //  3162   3169   3169   3170   Any
        //  3163   3169   3169   3170   Any
        //  3162   3169   3      8      Ljava/lang/ClassCastException;
        //  3162   3169   3162   3163   Ljava/lang/IllegalStateException;
        //  3162   3169   3      8      Any
        //  3175   3182   3182   3183   Any
        //  3175   3182   3175   3176   Any
        //  3175   3182   3      8      Any
        //  3176   3182   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3176   3182   3      8      Ljava/lang/NumberFormatException;
        //  3245   3251   3251   3252   Any
        //  3245   3251   3      8      Ljava/lang/NumberFormatException;
        //  3245   3251   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3245   3251   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3245   3251   3      8      Ljava/lang/NegativeArraySizeException;
        //  3366   3373   3373   3374   Any
        //  3367   3373   3373   3374   Any
        //  3366   3373   3373   3374   Ljava/lang/ArithmeticException;
        //  3366   3373   3366   3367   Any
        //  3366   3373   3      8      Any
        //  3377   3384   3384   3385   Any
        //  3378   3384   3      8      Any
        //  3377   3384   3377   3378   Ljava/lang/IndexOutOfBoundsException;
        //  3378   3384   3384   3385   Ljava/lang/UnsupportedOperationException;
        //  3378   3384   3377   3378   Any
        //  3495   3502   3502   3503   Any
        //  3496   3502   3502   3503   Ljava/lang/IllegalArgumentException;
        //  3495   3502   3495   3496   Ljava/lang/EnumConstantNotPresentException;
        //  3496   3502   3495   3496   Any
        //  3495   3502   3      8      Ljava/lang/AssertionError;
        //  3507   3514   3514   3515   Any
        //  3508   3514   3507   3508   Ljava/lang/AssertionError;
        //  3508   3514   3507   3508   Any
        //  3508   3514   3      8      Any
        //  3507   3514   3514   3515   Ljava/lang/ArithmeticException;
        //  3576   3582   3582   3583   Any
        //  3576   3582   3      8      Ljava/lang/AssertionError;
        //  3576   3582   3      8      Any
        //  3576   3582   3      8      Any
        //  3576   3582   3      8      Any
        //  3587   3593   3593   3594   Any
        //  3587   3593   3593   3594   Ljava/lang/AssertionError;
        //  3587   3593   3593   3594   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3587   3593   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3587   3593   3593   3594   Ljava/lang/ClassCastException;
        //  3601   3608   3608   3609   Any
        //  3602   3608   3601   3602   Any
        //  3602   3608   3608   3609   Ljava/lang/UnsupportedOperationException;
        //  3602   3608   3      8      Any
        //  3601   3608   3608   3609   Ljava/lang/IllegalArgumentException;
        //  3615   3622   3622   3623   Any
        //  3615   3622   3615   3616   Any
        //  3616   3622   3615   3616   Ljava/lang/RuntimeException;
        //  3615   3622   3615   3616   Any
        //  3615   3622   3      8      Ljava/lang/IllegalArgumentException;
        //  3632   3639   3639   3640   Any
        //  3633   3639   3      8      Ljava/lang/ClassCastException;
        //  3632   3639   3632   3633   Any
        //  3633   3639   3632   3633   Ljava/lang/RuntimeException;
        //  3632   3639   3632   3633   Ljava/lang/AssertionError;
        //  3643   3650   3650   3651   Any
        //  3644   3650   3      8      Any
        //  3643   3650   3      8      Ljava/lang/NumberFormatException;
        //  3644   3650   3650   3651   Ljava/lang/ArithmeticException;
        //  3643   3650   3643   3644   Any
        //  3657   3664   3664   3665   Any
        //  3658   3664   3664   3665   Ljava/lang/StringIndexOutOfBoundsException;
        //  3657   3664   3657   3658   Ljava/lang/IndexOutOfBoundsException;
        //  3657   3664   3      8      Ljava/lang/IllegalStateException;
        //  3658   3664   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3722   3729   3729   3730   Any
        //  3723   3729   3722   3723   Any
        //  3723   3729   3729   3730   Any
        //  3723   3729   3729   3730   Any
        //  3722   3729   3729   3730   Any
        //  3806   3813   3813   3814   Any
        //  3806   3813   3813   3814   Ljava/lang/UnsupportedOperationException;
        //  3806   3813   3      8      Any
        //  3807   3813   3806   3807   Ljava/lang/NegativeArraySizeException;
        //  3807   3813   3813   3814   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3822   3829   3829   3830   Any
        //  3823   3829   3      8      Any
        //  3822   3829   3822   3823   Any
        //  3823   3829   3822   3823   Ljava/lang/NumberFormatException;
        //  3823   3829   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3891   3898   3898   3899   Any
        //  3892   3898   3891   3892   Any
        //  3892   3898   3      8      Any
        //  3891   3898   3898   3899   Ljava/lang/StringIndexOutOfBoundsException;
        //  3891   3898   3      8      Ljava/lang/NegativeArraySizeException;
        //  3902   3909   3909   3910   Any
        //  3903   3909   3      8      Any
        //  3903   3909   3902   3903   Any
        //  3902   3909   3902   3903   Any
        //  3903   3909   3902   3903   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0275 (coming from #0274).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
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
    public void c(@NotNull final f3i f3i) {
        fbS.ft(this, 1878199294, f3i);
    }
    
    @NotNull
    public f0d 4() {
        return fbS.gc(this, 551261689);
    }
    
    public void d() {
        fbS.dA(this, 1665040739);
    }
    
    @NotNull
    public f0a 0() {
        return fbS.J(this, 1561027123);
    }
    
    public boolean c(@NotNull final BlockPos p0, @NotNull final EntityPlayerSP p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            87
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            79
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1        
        //    17: pop            
        //    18: getstatic       dev/nuker/pyro/fc.1:I
        //    21: ifeq            30
        //    24: ldc_w           -2044594396
        //    27: goto            33
        //    30: ldc_w           2090147651
        //    33: ldc_w           -2140807892
        //    36: ixor           
        //    37: lookupswitch {
        //          -51330449: 64
        //          105130504: 30
        //          default: 68
        //        }
        //    64: aload_2        
        //    65: pop            
        //    66: iconst_0       
        //    67: ireturn        
        //    68: aconst_null    
        //    69: athrow         
        //    70: pop            
        //    71: goto            16
        //    74: pop            
        //    75: aconst_null    
        //    76: goto            70
        //    79: dup            
        //    80: ifnull          70
        //    83: checkcast       Ljava/lang/Throwable;
        //    86: athrow         
        //    87: dup            
        //    88: ifnull          74
        //    91: checkcast       Ljava/lang/Throwable;
        //    94: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 45 FE 00 03 07 00 03 07 00 9B 07 00 94 0D 42 01 1E 03 41 07 00 45 43 05 44 07 00 45 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     79     87     Any
        //  79     87     79     87     Any
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
    
    public boolean b() {
        return fbS.ep(this, 1375314236);
    }
    
    public void c(@Nullable final f8F c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0088:
            while (true) {
                do {
                    Label_0075: {
                        break Label_0075;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0080;
                            }
                            continue Label_0088;
                            // switch([Lcom.strobel.decompiler.ast.Label;@58b0295a, n ^ 0xDA47DF70)
                            // iftrue(Label_0029:, fc.0 == 0)
                            while (true) {
                                int n = 668083831;
                                continue;
                                Label_0064: {
                                    this.c = c;
                                }
                                return;
                                Label_0029:
                                n = 720980851;
                                continue;
                            }
                            Label_0069: {
                                throw null;
                            }
                        }
                        catch (NumberFormatException ex) {}
                    }
                    continue Label_0088;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(final boolean b) {
        fbS.4l(this, 1142898373, b);
    }
    
    @NotNull
    public f0d 3() {
        return fbS.gh(this, 196518774);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1824
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1816
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1808
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            40
        //    34: ldc_w           1245920849
        //    37: goto            43
        //    40: ldc_w           -120385000
        //    43: ldc_w           758213530
        //    46: ixor           
        //    47: lookupswitch {
        //          -597904259: 40
        //          1735546315: 1785
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: iload_1        
        //    84: ifne            443
        //    87: aload_0        
        //    88: iconst_0       
        //    89: getstatic       dev/nuker/pyro/fc.0:I
        //    92: ifeq            101
        //    95: ldc_w           -278267803
        //    98: goto            104
        //   101: ldc_w           757214481
        //   104: ldc_w           -938725615
        //   107: ixor           
        //   108: lookupswitch {
        //          -449969664: 136
        //          660985716: 101
        //          default: 1795
        //        }
        //   136: putfield        dev/nuker/pyro/f89.c:Z
        //   139: getstatic       dev/nuker/pyro/fc.0:I
        //   142: ifeq            151
        //   145: ldc_w           1540981437
        //   148: goto            154
        //   151: ldc_w           2130262273
        //   154: ldc_w           1303573119
        //   157: ixor           
        //   158: lookupswitch {
        //          -677876776: 151
        //          376139970: 1757
        //          default: 184
        //        }
        //   184: aload_0        
        //   185: getstatic       dev/nuker/pyro/fc.c:I
        //   188: ifge            197
        //   191: ldc_w           -136058134
        //   194: goto            200
        //   197: ldc_w           407092415
        //   200: ldc_w           -1364225958
        //   203: ixor           
        //   204: lookupswitch {
        //          1498184368: 1747
        //          1948555716: 197
        //          default: 232
        //        }
        //   232: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   235: dup            
        //   236: ifnull          245
        //   239: ldc_w           -2018878552
        //   242: goto            248
        //   245: ldc_w           -2018878551
        //   248: ldc_w           2127026794
        //   251: ixor           
        //   252: tableswitch {
        //          -220527740: 276
        //          -220527739: 290
        //          default: 239
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   dev/nuker/pyro/f8F.b:()V
        //   283: goto            287
        //   286: athrow         
        //   287: goto            291
        //   290: pop            
        //   291: aload_0        
        //   292: getstatic       dev/nuker/pyro/fc.c:I
        //   295: ifge            304
        //   298: ldc_w           782305848
        //   301: goto            307
        //   304: ldc_w           426695588
        //   307: ldc_w           -406131100
        //   310: ixor           
        //   311: lookupswitch {
        //          -915676068: 1779
        //          311061473: 304
        //          default: 336
        //        }
        //   336: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   339: dup            
        //   340: ifnull          372
        //   343: goto            347
        //   346: athrow         
        //   347: invokevirtual   dev/nuker/pyro/f8F.f:()Ljava/lang/Thread;
        //   350: goto            354
        //   353: athrow         
        //   354: dup            
        //   355: ifnull          372
        //   358: goto            362
        //   361: athrow         
        //   362: invokevirtual   java/lang/Thread.stop:()V
        //   365: goto            369
        //   368: athrow         
        //   369: goto            373
        //   372: pop            
        //   373: aload_0        
        //   374: aconst_null    
        //   375: checkcast       Ldev/nuker/pyro/f8b;
        //   378: getstatic       dev/nuker/pyro/fc.c:I
        //   381: ifge            390
        //   384: ldc_w           689619118
        //   387: goto            393
        //   390: ldc_w           42077526
        //   393: ldc_w           -1753887588
        //   396: ixor           
        //   397: lookupswitch {
        //          -1100018638: 1765
        //          -714839447: 390
        //          default: 424
        //        }
        //   424: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8b;
        //   427: aload_0        
        //   428: iconst_1       
        //   429: putfield        dev/nuker/pyro/f89.0:Z
        //   432: aload_0        
        //   433: aconst_null    
        //   434: checkcast       Ldev/nuker/pyro/f8F;
        //   437: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //   440: goto            1746
        //   443: getstatic       dev/nuker/pyro/fc.1:I
        //   446: ifeq            455
        //   449: ldc_w           907306523
        //   452: goto            458
        //   455: ldc_w           -1263232817
        //   458: ldc_w           -889737017
        //   461: ixor           
        //   462: lookupswitch {
        //          -52177188: 1751
        //          1625184416: 455
        //          default: 488
        //        }
        //   488: aload_2        
        //   489: ifnull          498
        //   492: ldc_w           -1626127220
        //   495: goto            501
        //   498: ldc_w           -1626127217
        //   501: ldc_w           -632886099
        //   504: ixor           
        //   505: tableswitch {
        //          -1968484286: 528
        //          -1968484285: 1746
        //          default: 492
        //        }
        //   528: aload_0        
        //   529: aload_2        
        //   530: getstatic       dev/nuker/pyro/fc.c:I
        //   533: ifge            542
        //   536: ldc_w           1349471230
        //   539: goto            545
        //   542: ldc_w           -543038732
        //   545: ldc_w           -1274471965
        //   548: ixor           
        //   549: lookupswitch {
        //          -463056355: 542
        //          1806236439: 576
        //          default: 1791
        //        }
        //   576: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   579: getstatic       dev/nuker/pyro/fc.1:I
        //   582: ifeq            591
        //   585: ldc_w           1299028148
        //   588: goto            594
        //   591: ldc_w           -625456714
        //   594: ldc_w           899218537
        //   597: ixor           
        //   598: lookupswitch {
        //          848151201: 591
        //          2029348061: 1773
        //          default: 624
        //        }
        //   624: aload_2        
        //   625: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   628: dstore          4
        //   630: getstatic       dev/nuker/pyro/fc.0:I
        //   633: ifeq            642
        //   636: ldc_w           -245944445
        //   639: goto            645
        //   642: ldc_w           1915357478
        //   645: ldc_w           -1969690603
        //   648: ixor           
        //   649: lookupswitch {
        //          -122494669: 676
        //          2077214614: 642
        //          default: 1787
        //        }
        //   676: dstore          12
        //   678: astore          7
        //   680: iconst_0       
        //   681: getstatic       dev/nuker/pyro/fc.0:I
        //   684: ifeq            693
        //   687: ldc_w           -1535022950
        //   690: goto            696
        //   693: ldc_w           1646822639
        //   696: ldc_w           1355429516
        //   699: ixor           
        //   700: lookupswitch {
        //          -1253692505: 693
        //          -196387306: 1771
        //          default: 728
        //        }
        //   728: istore          6
        //   730: dload           4
        //   732: goto            736
        //   735: athrow         
        //   736: invokestatic    java/lang/Math.floor:(D)D
        //   739: goto            743
        //   742: athrow         
        //   743: dstore          14
        //   745: aload           7
        //   747: dload           12
        //   749: dload           14
        //   751: aload_2        
        //   752: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   755: dstore          16
        //   757: dstore          18
        //   759: dstore          20
        //   761: new             Lnet/minecraft/util/math/BlockPos;
        //   764: dup            
        //   765: dload           20
        //   767: dload           18
        //   769: dload           16
        //   771: goto            775
        //   774: athrow         
        //   775: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   778: goto            782
        //   781: athrow         
        //   782: aload_0        
        //   783: getfield        dev/nuker/pyro/f89.c:Lnet/minecraft/util/math/BlockPos;
        //   786: getstatic       dev/nuker/pyro/fc.0:I
        //   789: ifeq            798
        //   792: ldc_w           -102265093
        //   795: goto            801
        //   798: ldc_w           804352338
        //   801: ldc_w           -6817085
        //   804: ixor           
        //   805: lookupswitch {
        //          108033080: 1781
        //          1372784638: 798
        //          default: 832
        //        }
        //   832: aload_0        
        //   833: getstatic       dev/nuker/pyro/fc.0:I
        //   836: ifeq            845
        //   839: ldc_w           572139412
        //   842: goto            848
        //   845: ldc_w           -161035692
        //   848: ldc_w           2026126518
        //   851: ixor           
        //   852: lookupswitch {
        //          -1901922590: 880
        //          1524505378: 845
        //          default: 1783
        //        }
        //   880: getfield        dev/nuker/pyro/f89.3:Ldev/nuker/pyro/f0d;
        //   883: goto            887
        //   886: athrow         
        //   887: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   890: goto            894
        //   893: athrow         
        //   894: checkcast       Ljava/lang/Number;
        //   897: goto            901
        //   900: athrow         
        //   901: invokevirtual   java/lang/Number.doubleValue:()D
        //   904: goto            908
        //   907: athrow         
        //   908: aload_0        
        //   909: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f0d;
        //   912: getstatic       dev/nuker/pyro/fc.0:I
        //   915: ifeq            924
        //   918: ldc_w           -1832654360
        //   921: goto            927
        //   924: ldc_w           -404168755
        //   927: ldc_w           124546013
        //   930: ixor           
        //   931: lookupswitch {
        //          -1783659979: 1753
        //          1154176129: 924
        //          default: 956
        //        }
        //   956: goto            960
        //   959: athrow         
        //   960: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   963: goto            967
        //   966: athrow         
        //   967: checkcast       Ljava/lang/Number;
        //   970: goto            974
        //   973: athrow         
        //   974: invokevirtual   java/lang/Number.doubleValue:()D
        //   977: goto            981
        //   980: athrow         
        //   981: getstatic       dev/nuker/pyro/fc.c:I
        //   984: ifge            993
        //   987: ldc_w           502942819
        //   990: goto            996
        //   993: ldc_w           2127112899
        //   996: ldc_w           -171666783
        //   999: ixor           
        //  1000: lookupswitch {
        //          -1962035102: 1028
        //          -398532926: 993
        //          default: 1769
        //        }
        //  1028: aload_3        
        //  1029: dup            
        //  1030: ifnonnull       1044
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: getstatic       dev/nuker/pyro/fc.0:I
        //  1047: ifeq            1056
        //  1050: ldc_w           -1188789961
        //  1053: goto            1059
        //  1056: ldc_w           525949581
        //  1059: ldc_w           -1906125289
        //  1062: ixor           
        //  1063: lookupswitch {
        //          -1858368358: 1088
        //          927356704: 1056
        //          default: 1759
        //        }
        //  1088: aload_0        
        //  1089: getfield        dev/nuker/pyro/f89.1:Ldev/nuker/pyro/f0d;
        //  1092: goto            1096
        //  1095: athrow         
        //  1096: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: checkcast       Ljava/lang/Number;
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   java/lang/Number.doubleValue:()D
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: aload_0        
        //  1118: getfield        dev/nuker/pyro/f89.0:Ldev/nuker/pyro/f0d;
        //  1121: getstatic       dev/nuker/pyro/fc.1:I
        //  1124: ifeq            1133
        //  1127: ldc_w           -1087794189
        //  1130: goto            1136
        //  1133: ldc_w           1401309417
        //  1136: ldc_w           2063200196
        //  1139: ixor           
        //  1140: lookupswitch {
        //          -976192457: 1797
        //          1781238217: 1133
        //          default: 1168
        //        }
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: checkcast       Ljava/lang/Number;
        //  1182: goto            1186
        //  1185: athrow         
        //  1186: invokevirtual   java/lang/Number.doubleValue:()D
        //  1189: goto            1193
        //  1192: athrow         
        //  1193: aload_0        
        //  1194: getfield        dev/nuker/pyro/f89.2:Ldev/nuker/pyro/f0d;
        //  1197: getstatic       dev/nuker/pyro/fc.1:I
        //  1200: ifeq            1209
        //  1203: ldc_w           783173915
        //  1206: goto            1212
        //  1209: ldc_w           1631631479
        //  1212: ldc_w           101830707
        //  1215: ixor           
        //  1216: lookupswitch {
        //          683645224: 1209
        //          1733388356: 1244
        //          default: 1793
        //        }
        //  1244: goto            1248
        //  1247: athrow         
        //  1248: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1251: goto            1255
        //  1254: athrow         
        //  1255: checkcast       Ljava/lang/Number;
        //  1258: getstatic       dev/nuker/pyro/fc.0:I
        //  1261: ifeq            1270
        //  1264: ldc_w           1481970399
        //  1267: goto            1273
        //  1270: ldc_w           -1795176260
        //  1273: ldc_w           -564220797
        //  1276: ixor           
        //  1277: lookupswitch {
        //          -2046050724: 1763
        //          -1956141214: 1270
        //          default: 1304
        //        }
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: invokevirtual   java/lang/Number.doubleValue:()D
        //  1311: goto            1315
        //  1314: athrow         
        //  1315: getstatic       dev/nuker/pyro/fc.1:I
        //  1318: ifeq            1327
        //  1321: ldc_w           244265638
        //  1324: goto            1330
        //  1327: ldc_w           -734195588
        //  1330: ldc_w           211546005
        //  1333: ixor           
        //  1334: lookupswitch {
        //          -660144151: 1360
        //          34921779: 1327
        //          default: 1749
        //        }
        //  1360: dstore          22
        //  1362: dstore          24
        //  1364: dstore          26
        //  1366: astore          28
        //  1368: getstatic       dev/nuker/pyro/fc.c:I
        //  1371: ifge            1380
        //  1374: ldc_w           -2073429962
        //  1377: goto            1383
        //  1380: ldc_w           -797871911
        //  1383: ldc_w           1481261514
        //  1386: ixor           
        //  1387: lookupswitch {
        //          -601638404: 1789
        //          465903309: 1380
        //          default: 1412
        //        }
        //  1412: dstore          29
        //  1414: dstore          31
        //  1416: astore          33
        //  1418: getstatic       dev/nuker/pyro/fc.1:I
        //  1421: ifeq            1430
        //  1424: ldc_w           -1574881390
        //  1427: goto            1433
        //  1430: ldc_w           -822911472
        //  1433: ldc_w           -1531109610
        //  1436: ixor           
        //  1437: lookupswitch {
        //          110897284: 1430
        //          1783513350: 1464
        //          default: 1755
        //        }
        //  1464: astore          34
        //  1466: new             Ldev/nuker/pyro/f8F;
        //  1469: dup            
        //  1470: getstatic       dev/nuker/pyro/fc.c:I
        //  1473: ifge            1482
        //  1476: ldc_w           -1576583794
        //  1479: goto            1485
        //  1482: ldc_w           -736934314
        //  1485: ldc_w           964619587
        //  1488: ixor           
        //  1489: lookupswitch {
        //          -1686515507: 1777
        //          877688780: 1482
        //          default: 1516
        //        }
        //  1516: aload           34
        //  1518: aload           33
        //  1520: dload           31
        //  1522: getstatic       dev/nuker/pyro/fc.1:I
        //  1525: ifeq            1534
        //  1528: ldc_w           1276193492
        //  1531: goto            1537
        //  1534: ldc_w           -1304469585
        //  1537: ldc_w           -1416928207
        //  1540: ixor           
        //  1541: lookupswitch {
        //          -409317659: 1534
        //          431242142: 1568
        //          default: 1761
        //        }
        //  1568: dload           29
        //  1570: aload           28
        //  1572: getstatic       dev/nuker/pyro/fc.1:I
        //  1575: ifeq            1584
        //  1578: ldc_w           -1185769612
        //  1581: goto            1587
        //  1584: ldc_w           1129294733
        //  1587: ldc_w           1211182157
        //  1590: ixor           
        //  1591: lookupswitch {
        //          -245122247: 1767
        //          600491325: 1584
        //          default: 1616
        //        }
        //  1616: dload           26
        //  1618: dload           24
        //  1620: dload           22
        //  1622: getstatic       dev/nuker/pyro/fc.0:I
        //  1625: ifeq            1634
        //  1628: ldc_w           999283539
        //  1631: goto            1637
        //  1634: ldc_w           1552905569
        //  1637: ldc_w           523110676
        //  1640: ixor           
        //  1641: lookupswitch {
        //          -627962103: 1634
        //          614584903: 1775
        //          default: 1668
        //        }
        //  1668: goto            1672
        //  1671: athrow         
        //  1672: invokespecial   dev/nuker/pyro/f8F.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;DDLnet/minecraft/world/World;DDD)V
        //  1675: goto            1679
        //  1678: athrow         
        //  1679: putfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1682: aload_0        
        //  1683: getfield        dev/nuker/pyro/f89.c:Ldev/nuker/pyro/f8F;
        //  1686: dup            
        //  1687: ifnonnull       1696
        //  1690: ldc_w           -564071311
        //  1693: goto            1699
        //  1696: ldc_w           -564071312
        //  1699: ldc_w           1964736381
        //  1702: ixor           
        //  1703: tableswitch {
        //          1459033624: 1724
        //          1459033625: 1735
        //          default: 1690
        //        }
        //  1724: goto            1728
        //  1727: athrow         
        //  1728: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1731: goto            1735
        //  1734: athrow         
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: invokevirtual   dev/nuker/pyro/f8F.s:()V
        //  1742: goto            1746
        //  1745: athrow         
        //  1746: return         
        //  1747: aconst_null    
        //  1748: athrow         
        //  1749: aconst_null    
        //  1750: athrow         
        //  1751: aconst_null    
        //  1752: athrow         
        //  1753: aconst_null    
        //  1754: athrow         
        //  1755: aconst_null    
        //  1756: athrow         
        //  1757: aconst_null    
        //  1758: athrow         
        //  1759: aconst_null    
        //  1760: athrow         
        //  1761: aconst_null    
        //  1762: athrow         
        //  1763: aconst_null    
        //  1764: athrow         
        //  1765: aconst_null    
        //  1766: athrow         
        //  1767: aconst_null    
        //  1768: athrow         
        //  1769: aconst_null    
        //  1770: athrow         
        //  1771: aconst_null    
        //  1772: athrow         
        //  1773: aconst_null    
        //  1774: athrow         
        //  1775: aconst_null    
        //  1776: athrow         
        //  1777: aconst_null    
        //  1778: athrow         
        //  1779: aconst_null    
        //  1780: athrow         
        //  1781: aconst_null    
        //  1782: athrow         
        //  1783: aconst_null    
        //  1784: athrow         
        //  1785: aconst_null    
        //  1786: athrow         
        //  1787: aconst_null    
        //  1788: athrow         
        //  1789: aconst_null    
        //  1790: athrow         
        //  1791: aconst_null    
        //  1792: athrow         
        //  1793: aconst_null    
        //  1794: athrow         
        //  1795: aconst_null    
        //  1796: athrow         
        //  1797: aconst_null    
        //  1798: athrow         
        //  1799: pop            
        //  1800: goto            24
        //  1803: pop            
        //  1804: aconst_null    
        //  1805: goto            1799
        //  1808: dup            
        //  1809: ifnull          1799
        //  1812: checkcast       Ljava/lang/Throwable;
        //  1815: athrow         
        //  1816: dup            
        //  1817: ifnull          1803
        //  1820: checkcast       Ljava/lang/Throwable;
        //  1823: athrow         
        //  1824: aconst_null    
        //  1825: athrow         
        //    StackMapTable: 00 D2 43 07 00 45 04 FF 00 0B 00 00 00 01 07 00 45 FF 00 03 00 04 07 00 03 01 07 00 94 07 06 E4 00 00 FF 00 0F 00 04 07 00 03 01 07 00 94 07 06 E4 00 04 07 00 03 01 07 00 94 07 06 E4 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 05 07 00 03 01 07 00 94 07 06 E4 01 FF 00 1C 00 04 07 00 03 01 07 00 94 07 06 E4 00 04 07 00 03 01 07 00 94 07 06 E4 42 07 00 45 FF 00 00 00 04 07 00 03 01 07 00 94 07 06 E4 00 04 07 00 03 01 07 00 94 07 06 E4 45 07 00 45 00 FF 00 11 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 03 07 00 03 01 01 FF 00 1F 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 01 0E 42 01 1D 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 01 5F 07 00 03 46 07 00 60 45 07 00 60 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 60 01 5B 07 00 60 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 04 07 00 03 01 07 00 94 07 06 E4 00 01 07 00 60 45 07 00 45 00 42 07 00 60 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 01 5C 07 00 03 49 07 00 26 40 07 00 60 45 07 00 45 40 07 06 85 46 07 00 45 40 07 06 85 45 07 00 45 00 42 07 00 CF 00 FF 00 10 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 8C FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 03 07 00 03 07 00 8C 01 FF 00 1E 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 8C 12 0B 42 01 1D 03 05 42 01 1A FF 00 0D 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 94 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 03 07 00 03 07 00 94 01 FF 00 1E 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 94 FF 00 0E 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 03 FF 00 02 00 04 07 00 03 01 07 00 94 07 06 E4 00 03 07 00 03 03 01 FF 00 1D 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 03 FF 00 11 00 05 07 00 03 01 07 00 94 07 06 E4 03 00 02 07 00 03 03 FF 00 02 00 05 07 00 03 01 07 00 94 07 06 E4 03 00 03 07 00 03 03 01 FF 00 1E 00 05 07 00 03 01 07 00 94 07 06 E4 03 00 02 07 00 03 03 FF 00 10 00 0C 07 00 03 01 07 00 94 07 06 E4 03 00 07 00 03 00 00 00 00 03 00 01 01 FF 00 02 00 0C 07 00 03 01 07 00 94 07 06 E4 03 00 07 00 03 00 00 00 00 03 00 02 01 01 5F 01 FF 00 06 00 0C 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 00 01 07 00 45 40 03 45 07 00 45 40 03 FF 00 1E 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 01 07 00 DC FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 08 02 F9 08 02 F9 03 03 03 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 02 07 00 03 07 00 9B FF 00 0F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 03 07 00 03 07 00 9B 07 00 9B FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 01 FF 00 1E 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 03 07 00 03 07 00 9B 07 00 9B FF 00 0C 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 00 03 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 07 00 03 01 FF 00 1F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 00 03 45 07 00 2C FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 02 A3 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 00 CF 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 03 AA 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 03 FF 00 0F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 02 A3 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 07 02 A3 01 FF 00 1C 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 02 A3 FF 00 02 00 00 00 01 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 02 A3 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 00 CF 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 03 AA 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 0B 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 01 FF 00 1F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 03 47 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 0B 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 07 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 01 FF 00 1C 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 46 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 07 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 07 02 A3 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 07 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 07 00 CF 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 07 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 07 03 AA 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 07 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 FF 00 0F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 02 A3 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 02 A3 01 FF 00 1F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 02 A3 42 07 00 2E FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 02 A3 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 00 CF 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 03 AA 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 FF 00 0F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 02 A3 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 0A 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 02 A3 01 FF 00 1F 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 02 A3 42 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 02 A3 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 00 CF FF 00 0E 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 03 AA FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 0A 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 03 AA 01 FF 00 1E 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 03 AA 42 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 03 AA 45 07 00 45 FF 00 00 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 0B 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 02 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 0A 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 01 FF 00 1D 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 13 00 14 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 02 00 14 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 00 06 07 00 03 07 00 9B 07 00 9B 03 03 01 FF 00 1C 00 14 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 11 00 17 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 00 02 07 00 03 07 00 9B FF 00 02 00 17 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 00 03 07 00 03 07 00 9B 01 FF 00 1E 00 17 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 00 02 07 00 03 07 00 9B FF 00 11 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 03 07 00 03 08 05 BA 08 05 BA FF 00 02 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 04 07 00 03 08 05 BA 08 05 BA 01 FF 00 1E 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 03 07 00 03 08 05 BA 08 05 BA FF 00 11 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 06 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 FF 00 02 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 07 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 01 FF 00 1E 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 06 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 FF 00 0F 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 08 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 02 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 09 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 01 FF 00 1C 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 08 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 11 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 0B 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 02 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 0C 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 01 FF 00 1E 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 0B 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 42 07 00 3C FF 00 00 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 0B 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 45 07 00 45 FF 00 00 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 02 07 00 03 07 00 60 4A 07 00 60 45 07 00 60 FF 00 02 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 02 07 00 60 01 58 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 40 07 00 60 42 07 00 45 40 07 00 60 45 07 00 45 FF 00 00 00 04 07 00 03 01 07 00 94 07 06 E4 00 00 40 07 00 03 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 00 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 07 02 A3 FF 00 01 00 17 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 00 02 07 00 03 07 00 9B FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 00 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 06 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 01 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 06 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 03 AA FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 8C FF 00 01 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 08 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 01 00 0C 07 00 03 01 07 00 94 07 06 E4 03 00 07 00 03 00 00 00 00 03 00 01 01 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 03 FF 00 01 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 0B 07 00 03 08 05 BA 08 05 BA 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 03 FF 00 01 00 18 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 03 03 07 00 9B 07 00 9B 00 03 07 00 03 08 05 BA 08 05 BA FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 01 07 00 03 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 03 07 00 03 07 00 9B 07 00 9B FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 04 07 00 03 07 00 9B 07 00 9B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 04 07 00 03 01 07 00 94 07 06 E4 FF 00 01 00 05 07 00 03 01 07 00 94 07 06 E4 03 00 02 07 00 03 03 FF 00 01 00 14 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 03 03 03 07 06 E4 00 05 07 00 03 07 00 9B 07 00 9B 03 03 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 07 00 94 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 09 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 03 07 02 A3 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 02 07 00 03 01 FF 00 01 00 10 07 00 03 01 07 00 94 07 06 E4 03 01 07 00 03 00 00 00 00 03 03 03 03 03 00 08 07 00 03 07 00 9B 07 00 9B 03 03 07 06 E4 03 07 02 A3 FF 00 01 00 04 07 00 03 01 07 00 94 07 06 E4 00 01 07 00 45 43 05 44 07 00 45 47 05 47 07 00 45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1808   1816   Any
        //  1808   1816   1808   1816   Any
        //  1824   1826   3      8      Any
        //  75     82     82     83     Any
        //  75     82     75     76     Ljava/lang/ClassCastException;
        //  75     82     75     76     Ljava/lang/AssertionError;
        //  76     82     75     76     Ljava/util/NoSuchElementException;
        //  76     82     82     83     Ljava/lang/StringIndexOutOfBoundsException;
        //  280    286    286    287    Any
        //  280    286    286    287    Any
        //  280    286    3      8      Any
        //  280    286    286    287    Any
        //  280    286    286    287    Ljava/lang/IllegalArgumentException;
        //  346    353    353    354    Any
        //  346    353    353    354    Ljava/util/NoSuchElementException;
        //  347    353    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  347    353    346    347    Ljava/lang/AssertionError;
        //  347    353    3      8      Ljava/lang/UnsupportedOperationException;
        //  361    368    368    369    Any
        //  362    368    3      8      Ljava/lang/IllegalStateException;
        //  361    368    361    362    Any
        //  362    368    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  361    368    3      8      Ljava/util/ConcurrentModificationException;
        //  735    742    742    743    Any
        //  736    742    735    736    Any
        //  735    742    735    736    Ljava/lang/RuntimeException;
        //  736    742    3      8      Ljava/lang/ClassCastException;
        //  736    742    742    743    Ljava/lang/IllegalArgumentException;
        //  774    781    781    782    Any
        //  774    781    781    782    Any
        //  775    781    774    775    Ljava/lang/StringIndexOutOfBoundsException;
        //  775    781    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  774    781    3      8      Any
        //  886    893    893    894    Any
        //  886    893    886    887    Ljava/lang/RuntimeException;
        //  887    893    3      8      Ljava/lang/IllegalArgumentException;
        //  887    893    893    894    Ljava/util/ConcurrentModificationException;
        //  887    893    893    894    Ljava/lang/NumberFormatException;
        //  900    907    907    908    Any
        //  900    907    3      8      Any
        //  901    907    907    908    Any
        //  901    907    900    901    Ljava/lang/NegativeArraySizeException;
        //  900    907    900    901    Any
        //  960    966    966    967    Any
        //  960    966    966    967    Ljava/lang/NumberFormatException;
        //  960    966    3      8      Any
        //  960    966    966    967    Any
        //  960    966    966    967    Any
        //  973    980    980    981    Any
        //  974    980    3      8      Any
        //  974    980    980    981    Ljava/lang/IllegalStateException;
        //  973    980    973    974    Ljava/lang/ArithmeticException;
        //  973    980    973    974    Any
        //  1036   1043   1043   1044   Any
        //  1037   1043   1043   1044   Ljava/lang/NegativeArraySizeException;
        //  1036   1043   1036   1037   Any
        //  1036   1043   3      8      Any
        //  1036   1043   1036   1037   Any
        //  1095   1102   1102   1103   Any
        //  1096   1102   3      8      Ljava/lang/RuntimeException;
        //  1095   1102   1102   1103   Any
        //  1096   1102   1095   1096   Any
        //  1095   1102   1102   1103   Any
        //  1109   1116   1116   1117   Any
        //  1110   1116   1109   1110   Any
        //  1109   1116   3      8      Ljava/lang/IllegalStateException;
        //  1109   1116   1116   1117   Ljava/lang/ArithmeticException;
        //  1110   1116   1109   1110   Any
        //  1171   1178   1178   1179   Any
        //  1171   1178   1171   1172   Ljava/lang/IllegalStateException;
        //  1171   1178   3      8      Ljava/lang/RuntimeException;
        //  1172   1178   1178   1179   Any
        //  1172   1178   1178   1179   Ljava/lang/StringIndexOutOfBoundsException;
        //  1185   1192   1192   1193   Any
        //  1186   1192   3      8      Any
        //  1185   1192   1192   1193   Any
        //  1186   1192   1192   1193   Any
        //  1185   1192   1185   1186   Any
        //  1247   1254   1254   1255   Any
        //  1247   1254   1247   1248   Any
        //  1247   1254   1254   1255   Any
        //  1248   1254   1247   1248   Ljava/lang/ClassCastException;
        //  1247   1254   1254   1255   Any
        //  1307   1314   1314   1315   Any
        //  1307   1314   1307   1308   Any
        //  1307   1314   1314   1315   Ljava/lang/NumberFormatException;
        //  1307   1314   3      8      Any
        //  1308   1314   1307   1308   Ljava/lang/StringIndexOutOfBoundsException;
        //  1671   1678   1678   1679   Any
        //  1671   1678   1678   1679   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1671   1678   1678   1679   Any
        //  1672   1678   1671   1672   Ljava/lang/NumberFormatException;
        //  1672   1678   1678   1679   Any
        //  1727   1734   1734   1735   Any
        //  1727   1734   1727   1728   Any
        //  1727   1734   1734   1735   Ljava/lang/NullPointerException;
        //  1727   1734   3      8      Ljava/lang/UnsupportedOperationException;
        //  1728   1734   1727   1728   Any
        //  1738   1745   1745   1746   Any
        //  1739   1745   1738   1739   Any
        //  1738   1745   1738   1739   Any
        //  1739   1745   1745   1746   Ljava/lang/IllegalArgumentException;
        //  1739   1745   3      8      Any
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
    public f0a 6() {
        return fbS.S(this, 1057737689);
    }
}
