// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f7r extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0d c;
    @NotNull
    public fbu c;
    @NotNull
    public fbu 0;
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4337
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            4329
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4321
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             2058927582
        //    33: goto            38
        //    36: ldc             866543735
        //    38: ldc             -297923821
        //    40: ixor           
        //    41: lookupswitch {
        //          -1803110707: 4198
        //          -1046662582: 36
        //          default: 68
        //        }
        //    68: getstatic       kotlin/jvm/internal/StringCompanionObject.INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
        //    71: astore_2       
        //    72: ldc             "\u224c\u14dd\u8b51\ub1ce"
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            85
        //    80: ldc             955862372
        //    82: goto            87
        //    85: ldc             1983297599
        //    87: ldc             321722739
        //    89: ixor           
        //    90: lookupswitch {
        //          735335447: 85
        //          1696309580: 116
        //          default: 4206
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: goto            127
        //   126: athrow         
        //   127: astore_3       
        //   128: iconst_1       
        //   129: anewarray       Ljava/lang/Object;
        //   132: dup            
        //   133: iconst_0       
        //   134: aload_0        
        //   135: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0d;
        //   138: goto            142
        //   141: athrow         
        //   142: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   145: goto            149
        //   148: athrow         
        //   149: aastore        
        //   150: getstatic       dev/nuker/pyro/fc.0:I
        //   153: ifeq            161
        //   156: ldc             343706005
        //   158: goto            163
        //   161: ldc             498348997
        //   163: ldc             1155722615
        //   165: ixor           
        //   166: lookupswitch {
        //          -2053461914: 161
        //          1352557794: 4288
        //          default: 192
        //        }
        //   192: astore          4
        //   194: astore          9
        //   196: iconst_0       
        //   197: istore          5
        //   199: aload_3        
        //   200: aload           4
        //   202: dup            
        //   203: arraylength    
        //   204: goto            208
        //   207: athrow         
        //   208: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   211: goto            215
        //   214: athrow         
        //   215: goto            219
        //   218: athrow         
        //   219: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   222: goto            226
        //   225: athrow         
        //   226: dup            
        //   227: pop            
        //   228: astore          10
        //   230: aload           9
        //   232: getstatic       dev/nuker/pyro/fc.0:I
        //   235: ifeq            243
        //   238: ldc             -440163004
        //   240: goto            245
        //   243: ldc             -635692288
        //   245: ldc             -555190342
        //   247: ixor           
        //   248: lookupswitch {
        //          992727806: 4202
        //          1797546850: 243
        //          default: 276
        //        }
        //   276: aload           10
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   dev/nuker/pyro/f7r.4:(Ljava/lang/String;)V
        //   285: goto            289
        //   288: athrow         
        //   289: aload_0        
        //   290: getstatic       dev/nuker/pyro/fc.1:I
        //   293: ifeq            301
        //   296: ldc             1666526639
        //   298: goto            303
        //   301: ldc             -1903701236
        //   303: ldc             -730961792
        //   305: ixor           
        //   306: lookupswitch {
        //          -1220852433: 301
        //          1525267340: 332
        //          default: 4284
        //        }
        //   332: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   335: getstatic       dev/nuker/pyro/fc.c:I
        //   338: ifge            346
        //   341: ldc             1685398310
        //   343: goto            348
        //   346: ldc             844928159
        //   348: ldc             1788175141
        //   350: ixor           
        //   351: lookupswitch {
        //          249577475: 4246
        //          462520654: 346
        //          default: 376
        //        }
        //   376: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   379: dup            
        //   380: pop            
        //   381: goto            385
        //   384: athrow         
        //   385: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184218_aH:()Z
        //   388: goto            392
        //   391: athrow         
        //   392: ifeq            400
        //   395: ldc             -1801513050
        //   397: goto            402
        //   400: ldc             -1801513049
        //   402: ldc             2022674288
        //   404: ixor           
        //   405: tableswitch {
        //          -668913236: 428
        //          -668913235: 4189
        //          default: 395
        //        }
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   432: getstatic       dev/nuker/pyro/fc.0:I
        //   435: ifeq            443
        //   438: ldc             -24752051
        //   440: goto            445
        //   443: ldc             -1342715852
        //   445: ldc             -142828376
        //   447: ixor           
        //   448: lookupswitch {
        //          -2034040959: 443
        //          167431397: 4192
        //          default: 476
        //        }
        //   476: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   479: getstatic       dev/nuker/pyro/fc.1:I
        //   482: ifeq            490
        //   485: ldc             1416737445
        //   487: goto            492
        //   490: ldc             1123575375
        //   492: ldc             1590882970
        //   494: ixor           
        //   495: lookupswitch {
        //          178470975: 490
        //          472552661: 520
        //          default: 4232
        //        }
        //   520: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   523: ldc             90.0
        //   525: fadd           
        //   526: f2d            
        //   527: goto            531
        //   530: athrow         
        //   531: invokestatic    java/lang/Math.toRadians:(D)D
        //   534: goto            538
        //   537: athrow         
        //   538: getstatic       dev/nuker/pyro/fc.0:I
        //   541: ifeq            549
        //   544: ldc             -1530669031
        //   546: goto            551
        //   549: ldc             626963166
        //   551: ldc             -498918298
        //   553: ixor           
        //   554: lookupswitch {
        //          -954356040: 580
        //          1182844031: 549
        //          default: 4214
        //        }
        //   580: dstore          4
        //   582: iconst_0       
        //   583: istore          6
        //   585: dload           4
        //   587: goto            591
        //   590: athrow         
        //   591: invokestatic    java/lang/Math.cos:(D)D
        //   594: goto            598
        //   597: athrow         
        //   598: dstore_2       
        //   599: aload_0        
        //   600: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   603: getstatic       dev/nuker/pyro/fc.c:I
        //   606: ifge            614
        //   609: ldc             1388324312
        //   611: goto            616
        //   614: ldc             -1677100175
        //   616: ldc             313421835
        //   618: ixor           
        //   619: lookupswitch {
        //          -1901655174: 644
        //          1080972755: 614
        //          default: 4248
        //        }
        //   644: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   647: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   650: ldc             90.0
        //   652: fadd           
        //   653: f2d            
        //   654: goto            658
        //   657: athrow         
        //   658: invokestatic    java/lang/Math.toRadians:(D)D
        //   661: goto            665
        //   664: athrow         
        //   665: dstore          6
        //   667: iconst_0       
        //   668: getstatic       dev/nuker/pyro/fc.c:I
        //   671: ifge            679
        //   674: ldc             -783032453
        //   676: goto            681
        //   679: ldc             -1877563252
        //   681: ldc             663915621
        //   683: ixor           
        //   684: lookupswitch {
        //          -1216076567: 712
        //          -155102434: 679
        //          default: 4258
        //        }
        //   712: istore          8
        //   714: getstatic       dev/nuker/pyro/fc.c:I
        //   717: ifge            725
        //   720: ldc             -889025919
        //   722: goto            727
        //   725: ldc             1012960679
        //   727: ldc             1094452485
        //   729: ixor           
        //   730: lookupswitch {
        //          -1975611516: 725
        //          2103216290: 756
        //          default: 4264
        //        }
        //   756: dload           6
        //   758: goto            762
        //   761: athrow         
        //   762: invokestatic    java/lang/Math.sin:(D)D
        //   765: goto            769
        //   768: athrow         
        //   769: dstore          4
        //   771: new             Lnet/minecraft/util/math/BlockPos;
        //   774: dup            
        //   775: getstatic       dev/nuker/pyro/fc.0:I
        //   778: ifeq            786
        //   781: ldc             -1543431467
        //   783: goto            788
        //   786: ldc             -1773115206
        //   788: ldc             1295334198
        //   790: ixor           
        //   791: lookupswitch {
        //          -614116468: 816
        //          -382459421: 786
        //          default: 4308
        //        }
        //   816: aload_0        
        //   817: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   820: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   823: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   826: ldc2_w          2.0
        //   829: dload_2        
        //   830: dmul           
        //   831: dconst_0       
        //   832: dload           4
        //   834: dmul           
        //   835: dadd           
        //   836: dadd           
        //   837: aload_0        
        //   838: getstatic       dev/nuker/pyro/fc.c:I
        //   841: ifge            849
        //   844: ldc             476200615
        //   846: goto            851
        //   849: ldc             415801987
        //   851: ldc             900376237
        //   853: ixor           
        //   854: lookupswitch {
        //          701011978: 849
        //          761398318: 880
        //          default: 4220
        //        }
        //   880: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   883: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   886: getstatic       dev/nuker/pyro/fc.c:I
        //   889: ifge            897
        //   892: ldc             -2049847329
        //   894: goto            899
        //   897: ldc             -1941048526
        //   899: ldc             -526048139
        //   901: ixor           
        //   902: lookupswitch {
        //          1702161322: 897
        //          1827198791: 928
        //          default: 4296
        //        }
        //   928: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   931: dconst_1       
        //   932: dsub           
        //   933: aload_0        
        //   934: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //   937: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   940: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   943: ldc2_w          2.0
        //   946: dload           4
        //   948: dmul           
        //   949: dconst_0       
        //   950: dload_2        
        //   951: dmul           
        //   952: dsub           
        //   953: dadd           
        //   954: goto            958
        //   957: athrow         
        //   958: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   961: goto            965
        //   964: athrow         
        //   965: astore          6
        //   967: new             Lnet/minecraft/util/math/BlockPos;
        //   970: dup            
        //   971: aload_0        
        //   972: getstatic       dev/nuker/pyro/fc.0:I
        //   975: ifeq            983
        //   978: ldc             1291225414
        //   980: goto            985
        //   983: ldc             -1797933627
        //   985: ldc             373765099
        //   987: ixor           
        //   988: lookupswitch {
        //          -2104326610: 1016
        //          1521597101: 983
        //          default: 4194
        //        }
        //  1016: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1019: getstatic       dev/nuker/pyro/fc.c:I
        //  1022: ifge            1030
        //  1025: ldc             -637516168
        //  1027: goto            1032
        //  1030: ldc             620388534
        //  1032: ldc             -1596489785
        //  1034: ixor           
        //  1035: lookupswitch {
        //          -2077417615: 1060
        //          2060925375: 1030
        //          default: 4204
        //        }
        //  1060: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1063: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1066: ldc2_w          2.0
        //  1069: dload_2        
        //  1070: dmul           
        //  1071: dconst_0       
        //  1072: dload           4
        //  1074: dmul           
        //  1075: dadd           
        //  1076: dadd           
        //  1077: aload_0        
        //  1078: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1081: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1084: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1087: ldc2_w          2.0
        //  1090: dsub           
        //  1091: aload_0        
        //  1092: getstatic       dev/nuker/pyro/fc.c:I
        //  1095: ifge            1103
        //  1098: ldc             -551498948
        //  1100: goto            1105
        //  1103: ldc             -2095555572
        //  1105: ldc             2084638419
        //  1107: ixor           
        //  1108: lookupswitch {
        //          -1553873425: 1103
        //          -10923297: 1136
        //          default: 4276
        //        }
        //  1136: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1139: getstatic       dev/nuker/pyro/fc.c:I
        //  1142: ifge            1150
        //  1145: ldc             -357363847
        //  1147: goto            1152
        //  1150: ldc             -2007800963
        //  1152: ldc             -589587212
        //  1154: ixor           
        //  1155: lookupswitch {
        //          912823181: 1150
        //          1418264457: 1180
        //          default: 4190
        //        }
        //  1180: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1183: getstatic       dev/nuker/pyro/fc.0:I
        //  1186: ifeq            1194
        //  1189: ldc             -501714667
        //  1191: goto            1196
        //  1194: ldc             449408635
        //  1196: ldc             -735005104
        //  1198: ixor           
        //  1199: lookupswitch {
        //          -822486997: 1224
        //          908642117: 1194
        //          default: 4294
        //        }
        //  1224: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1227: ldc2_w          2.0
        //  1230: dload           4
        //  1232: dmul           
        //  1233: dconst_0       
        //  1234: getstatic       dev/nuker/pyro/fc.1:I
        //  1237: ifeq            1245
        //  1240: ldc             -1163211049
        //  1242: goto            1247
        //  1245: ldc             -2139103083
        //  1247: ldc             -1237213628
        //  1249: ixor           
        //  1250: lookupswitch {
        //          216748179: 4228
        //          1640711103: 1245
        //          default: 1276
        //        }
        //  1276: dload_2        
        //  1277: dmul           
        //  1278: dsub           
        //  1279: dadd           
        //  1280: goto            1284
        //  1283: athrow         
        //  1284: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  1287: goto            1291
        //  1290: athrow         
        //  1291: getstatic       dev/nuker/pyro/fc.c:I
        //  1294: ifge            1302
        //  1297: ldc             -66486095
        //  1299: goto            1304
        //  1302: ldc             1606222370
        //  1304: ldc             1905936772
        //  1306: ixor           
        //  1307: lookupswitch {
        //          -1919694539: 1302
        //          774327206: 1332
        //          default: 4226
        //        }
        //  1332: astore          7
        //  1334: aload_0        
        //  1335: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1338: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1341: dup            
        //  1342: pop            
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: dup            
        //  1355: ifnonnull       1369
        //  1358: goto            1362
        //  1361: athrow         
        //  1362: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1365: goto            1369
        //  1368: athrow         
        //  1369: getfield        net/minecraft/entity/Entity.field_70122_E:Z
        //  1372: ifne            1744
        //  1375: aload_0        
        //  1376: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1379: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1382: aload           6
        //  1384: goto            1388
        //  1387: athrow         
        //  1388: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1391: goto            1395
        //  1394: athrow         
        //  1395: dup            
        //  1396: pop            
        //  1397: goto            1401
        //  1400: athrow         
        //  1401: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //  1406: goto            1410
        //  1409: athrow         
        //  1410: getstatic       dev/nuker/pyro/fc.1:I
        //  1413: ifeq            1421
        //  1416: ldc             -903630582
        //  1418: goto            1423
        //  1421: ldc             -1307995576
        //  1423: ldc             -2467359
        //  1425: ixor           
        //  1426: lookupswitch {
        //          905570539: 1421
        //          1305725865: 1452
        //          default: 4250
        //        }
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: ifne            1472
        //  1466: ldc_w           857579411
        //  1469: goto            1475
        //  1472: ldc_w           857579410
        //  1475: ldc_w           974820609
        //  1478: ixor           
        //  1479: tableswitch {
        //          302912804: 1500
        //          302912805: 1744
        //          default: 1466
        //        }
        //  1500: getstatic       dev/nuker/pyro/fc.c:I
        //  1503: ifge            1512
        //  1506: ldc_w           908145406
        //  1509: goto            1515
        //  1512: ldc_w           2138603532
        //  1515: ldc_w           -223959854
        //  1518: ixor           
        //  1519: lookupswitch {
        //          -997747156: 4304
        //          1738808043: 1512
        //          default: 1544
        //        }
        //  1544: aload_0        
        //  1545: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1548: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1551: aload           7
        //  1553: goto            1557
        //  1556: athrow         
        //  1557: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1560: goto            1564
        //  1563: athrow         
        //  1564: dup            
        //  1565: pop            
        //  1566: goto            1570
        //  1569: athrow         
        //  1570: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //  1575: goto            1579
        //  1578: athrow         
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //  1586: goto            1590
        //  1589: athrow         
        //  1590: ifne            1744
        //  1593: getstatic       dev/nuker/pyro/fc.c:I
        //  1596: ifge            1605
        //  1599: ldc_w           -1227215682
        //  1602: goto            1608
        //  1605: ldc_w           -92708333
        //  1608: ldc_w           -1133740502
        //  1611: ixor           
        //  1612: lookupswitch {
        //          179720852: 1605
        //          1175788601: 1640
        //          default: 4244
        //        }
        //  1640: aload_0        
        //  1641: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0a;
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1651: goto            1655
        //  1654: athrow         
        //  1655: checkcast       Ljava/lang/Boolean;
        //  1658: goto            1662
        //  1661: athrow         
        //  1662: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1665: goto            1669
        //  1668: athrow         
        //  1669: ifeq            1744
        //  1672: dconst_0       
        //  1673: goto            1677
        //  1676: athrow         
        //  1677: invokestatic    dev/nuker/pyro/fbl.3:(D)V
        //  1680: goto            1684
        //  1683: athrow         
        //  1684: getstatic       dev/nuker/pyro/fc.c:I
        //  1687: ifge            1696
        //  1690: ldc_w           1357303926
        //  1693: goto            1699
        //  1696: ldc_w           1490090633
        //  1699: ldc_w           -1724651889
        //  1702: ixor           
        //  1703: lookupswitch {
        //          -1042080762: 1728
        //          -908773639: 1696
        //          default: 4242
        //        }
        //  1728: aload_0        
        //  1729: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/fbu;
        //  1732: goto            1736
        //  1735: athrow         
        //  1736: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  1739: goto            1743
        //  1742: athrow         
        //  1743: return         
        //  1744: aload_0        
        //  1745: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1748: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1751: new             Lnet/minecraft/util/math/BlockPos;
        //  1754: dup            
        //  1755: aload_0        
        //  1756: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1759: getstatic       dev/nuker/pyro/fc.0:I
        //  1762: ifeq            1771
        //  1765: ldc_w           2128462640
        //  1768: goto            1774
        //  1771: ldc_w           -202078426
        //  1774: ldc_w           718228553
        //  1777: ixor           
        //  1778: lookupswitch {
        //          1410502521: 4290
        //          1879701621: 1771
        //          default: 1804
        //        }
        //  1804: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1807: getstatic       dev/nuker/pyro/fc.0:I
        //  1810: ifeq            1819
        //  1813: ldc_w           -82337266
        //  1816: goto            1822
        //  1819: ldc_w           115203311
        //  1822: ldc_w           -877655470
        //  1825: ixor           
        //  1826: lookupswitch {
        //          816293980: 4262
        //          1548426161: 1819
        //          default: 1852
        //        }
        //  1852: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1855: ldc2_w          2.0
        //  1858: getstatic       dev/nuker/pyro/fc.0:I
        //  1861: ifeq            1870
        //  1864: ldc_w           1222880038
        //  1867: goto            1873
        //  1870: ldc_w           782621033
        //  1873: ldc_w           -1181016479
        //  1876: ixor           
        //  1877: lookupswitch {
        //          -1757493496: 1904
        //          -243747513: 1870
        //          default: 4298
        //        }
        //  1904: dload_2        
        //  1905: dmul           
        //  1906: dconst_0       
        //  1907: dload           4
        //  1909: dmul           
        //  1910: dadd           
        //  1911: dadd           
        //  1912: aload_0        
        //  1913: getstatic       dev/nuker/pyro/fc.c:I
        //  1916: ifge            1925
        //  1919: ldc_w           592037867
        //  1922: goto            1928
        //  1925: ldc_w           832359494
        //  1928: ldc_w           1125057155
        //  1931: ixor           
        //  1932: lookupswitch {
        //          459977495: 1925
        //          1615250792: 4272
        //          default: 1960
        //        }
        //  1960: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  1963: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1966: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1969: getstatic       dev/nuker/pyro/fc.c:I
        //  1972: ifge            1981
        //  1975: ldc_w           -626086383
        //  1978: goto            1984
        //  1981: ldc_w           -1409035025
        //  1984: ldc_w           -1812905900
        //  1987: ixor           
        //  1988: lookupswitch {
        //          1072862395: 2016
        //          1231023685: 1981
        //          default: 4234
        //        }
        //  2016: aload_0        
        //  2017: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  2020: getstatic       dev/nuker/pyro/fc.1:I
        //  2023: ifeq            2032
        //  2026: ldc_w           1308150110
        //  2029: goto            2035
        //  2032: ldc_w           -966817383
        //  2035: ldc_w           487207491
        //  2038: ixor           
        //  2039: lookupswitch {
        //          -615138342: 2064
        //          1358101277: 2032
        //          default: 4222
        //        }
        //  2064: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2067: getstatic       dev/nuker/pyro/fc.1:I
        //  2070: ifeq            2079
        //  2073: ldc_w           974299499
        //  2076: goto            2082
        //  2079: ldc_w           -2048002268
        //  2082: ldc_w           -1743995025
        //  2085: ixor           
        //  2086: lookupswitch {
        //          -1575084540: 2079
        //          501303371: 2112
        //          default: 4274
        //        }
        //  2112: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2115: ldc2_w          2.0
        //  2118: dload           4
        //  2120: dmul           
        //  2121: dconst_0       
        //  2122: dload_2        
        //  2123: dmul           
        //  2124: dsub           
        //  2125: dadd           
        //  2126: goto            2130
        //  2129: athrow         
        //  2130: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  2133: goto            2137
        //  2136: athrow         
        //  2137: getstatic       dev/nuker/pyro/fc.0:I
        //  2140: ifeq            2149
        //  2143: ldc_w           -1197382167
        //  2146: goto            2152
        //  2149: ldc_w           416459566
        //  2152: ldc_w           1676865069
        //  2155: ixor           
        //  2156: lookupswitch {
        //          -615281724: 4200
        //          526941850: 2149
        //          default: 2184
        //        }
        //  2184: goto            2188
        //  2187: athrow         
        //  2188: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  2191: goto            2195
        //  2194: athrow         
        //  2195: dup            
        //  2196: pop            
        //  2197: goto            2201
        //  2200: athrow         
        //  2201: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //  2206: goto            2210
        //  2209: athrow         
        //  2210: goto            2214
        //  2213: athrow         
        //  2214: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //  2217: goto            2221
        //  2220: athrow         
        //  2221: ifeq            2372
        //  2224: getstatic       dev/nuker/pyro/fc.c:I
        //  2227: ifge            2236
        //  2230: ldc_w           1900306073
        //  2233: goto            2239
        //  2236: ldc_w           -445386016
        //  2239: ldc_w           -128540610
        //  2242: ixor           
        //  2243: lookupswitch {
        //          -1995243865: 4230
        //          -936567261: 2236
        //          default: 2268
        //        }
        //  2268: aload_0        
        //  2269: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0a;
        //  2272: getstatic       dev/nuker/pyro/fc.c:I
        //  2275: ifge            2284
        //  2278: ldc_w           -375250185
        //  2281: goto            2287
        //  2284: ldc_w           -1600886605
        //  2287: ldc_w           756778562
        //  2290: ixor           
        //  2291: lookupswitch {
        //          -1919947023: 2316
        //          -994466635: 2284
        //          default: 4260
        //        }
        //  2316: goto            2320
        //  2319: athrow         
        //  2320: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2323: goto            2327
        //  2326: athrow         
        //  2327: checkcast       Ljava/lang/Boolean;
        //  2330: goto            2334
        //  2333: athrow         
        //  2334: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2337: goto            2341
        //  2340: athrow         
        //  2341: ifeq            2372
        //  2344: dconst_0       
        //  2345: goto            2349
        //  2348: athrow         
        //  2349: invokestatic    dev/nuker/pyro/fbl.3:(D)V
        //  2352: goto            2356
        //  2355: athrow         
        //  2356: aload_0        
        //  2357: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/fbu;
        //  2360: goto            2364
        //  2363: athrow         
        //  2364: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  2367: goto            2371
        //  2370: athrow         
        //  2371: return         
        //  2372: aload_0        
        //  2373: getstatic       dev/nuker/pyro/fc.c:I
        //  2376: ifge            2385
        //  2379: ldc_w           -1320562819
        //  2382: goto            2388
        //  2385: ldc_w           -591820310
        //  2388: ldc_w           1651168205
        //  2391: ixor           
        //  2392: lookupswitch {
        //          -1671957278: 2385
        //          -752673616: 4280
        //          default: 2420
        //        }
        //  2420: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  2423: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2426: new             Lnet/minecraft/util/math/BlockPos;
        //  2429: dup            
        //  2430: aload_0        
        //  2431: getstatic       dev/nuker/pyro/fc.1:I
        //  2434: ifeq            2443
        //  2437: ldc_w           -2039267250
        //  2440: goto            2446
        //  2443: ldc_w           -2051914752
        //  2446: ldc_w           -337827203
        //  2449: ixor           
        //  2450: lookupswitch {
        //          -579913435: 2443
        //          1840146995: 4252
        //          default: 2476
        //        }
        //  2476: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  2479: getstatic       dev/nuker/pyro/fc.c:I
        //  2482: ifge            2491
        //  2485: ldc_w           2042385854
        //  2488: goto            2494
        //  2491: ldc_w           229180032
        //  2494: ldc_w           -1464087833
        //  2497: ixor           
        //  2498: lookupswitch {
        //          -788029607: 4238
        //          1420277687: 2491
        //          default: 2524
        //        }
        //  2524: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2527: getstatic       dev/nuker/pyro/fc.0:I
        //  2530: ifeq            2539
        //  2533: ldc_w           -1512966374
        //  2536: goto            2542
        //  2539: ldc_w           -145900144
        //  2542: ldc_w           1577571815
        //  2545: ixor           
        //  2546: lookupswitch {
        //          -1454741385: 2572
        //          -69852419: 2539
        //          default: 4210
        //        }
        //  2572: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2575: dconst_1       
        //  2576: getstatic       dev/nuker/pyro/fc.c:I
        //  2579: ifge            2588
        //  2582: ldc_w           1698606371
        //  2585: goto            2591
        //  2588: ldc_w           -79662631
        //  2591: ldc_w           -468582539
        //  2594: ixor           
        //  2595: lookupswitch {
        //          -2127605162: 2588
        //          525438636: 2620
        //          default: 4236
        //        }
        //  2620: dload_2        
        //  2621: dmul           
        //  2622: dconst_0       
        //  2623: dload           4
        //  2625: dmul           
        //  2626: dadd           
        //  2627: dadd           
        //  2628: aload_0        
        //  2629: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  2632: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2635: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  2638: dconst_1       
        //  2639: dadd           
        //  2640: aload_0        
        //  2641: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  2644: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2647: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2650: dconst_1       
        //  2651: dload           4
        //  2653: dmul           
        //  2654: dconst_0       
        //  2655: dload_2        
        //  2656: dmul           
        //  2657: dsub           
        //  2658: dadd           
        //  2659: goto            2663
        //  2662: athrow         
        //  2663: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //  2666: goto            2670
        //  2669: athrow         
        //  2670: goto            2674
        //  2673: athrow         
        //  2674: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  2677: goto            2681
        //  2680: athrow         
        //  2681: dup            
        //  2682: pop            
        //  2683: goto            2687
        //  2686: athrow         
        //  2687: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //  2692: goto            2696
        //  2695: athrow         
        //  2696: goto            2700
        //  2699: athrow         
        //  2700: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //  2703: goto            2707
        //  2706: athrow         
        //  2707: ifeq            2716
        //  2710: ldc_w           760207271
        //  2713: goto            2719
        //  2716: ldc_w           760207268
        //  2719: ldc_w           1348488442
        //  2722: ixor           
        //  2723: tableswitch {
        //          -94423366: 2744
        //          -94423365: 3032
        //          default: 2710
        //        }
        //  2744: getstatic       dev/nuker/pyro/fc.c:I
        //  2747: ifge            2756
        //  2750: ldc_w           1275537614
        //  2753: goto            2759
        //  2756: ldc_w           876615424
        //  2759: ldc_w           -960308892
        //  2762: ixor           
        //  2763: lookupswitch {
        //          -1966739030: 4300
        //          -1734503884: 2756
        //          default: 2788
        //        }
        //  2788: aload_0        
        //  2789: getstatic       dev/nuker/pyro/fc.1:I
        //  2792: ifeq            2801
        //  2795: ldc_w           818690572
        //  2798: goto            2804
        //  2801: ldc_w           621829314
        //  2804: ldc_w           340495260
        //  2807: ixor           
        //  2808: lookupswitch {
        //          -349176816: 2801
        //          612872592: 4240
        //          default: 2836
        //        }
        //  2836: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0a;
        //  2839: getstatic       dev/nuker/pyro/fc.1:I
        //  2842: ifeq            2851
        //  2845: ldc_w           263635964
        //  2848: goto            2854
        //  2851: ldc_w           1765683534
        //  2854: ldc_w           40054191
        //  2857: ixor           
        //  2858: lookupswitch {
        //          -1507860490: 2851
        //          232123987: 4292
        //          default: 2884
        //        }
        //  2884: goto            2888
        //  2887: athrow         
        //  2888: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2891: goto            2895
        //  2894: athrow         
        //  2895: checkcast       Ljava/lang/Boolean;
        //  2898: goto            2902
        //  2901: athrow         
        //  2902: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2905: goto            2909
        //  2908: athrow         
        //  2909: ifeq            3032
        //  2912: dconst_0       
        //  2913: goto            2917
        //  2916: athrow         
        //  2917: invokestatic    dev/nuker/pyro/fbl.3:(D)V
        //  2920: goto            2924
        //  2923: athrow         
        //  2924: aload_0        
        //  2925: getstatic       dev/nuker/pyro/fc.c:I
        //  2928: ifge            2937
        //  2931: ldc_w           -834665192
        //  2934: goto            2940
        //  2937: ldc_w           73668834
        //  2940: ldc_w           -1442810917
        //  2943: ixor           
        //  2944: lookupswitch {
        //          -1369150663: 2972
        //          1681946307: 2937
        //          default: 4218
        //        }
        //  2972: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/fbu;
        //  2975: getstatic       dev/nuker/pyro/fc.1:I
        //  2978: ifeq            2987
        //  2981: ldc_w           -1193831159
        //  2984: goto            2990
        //  2987: ldc_w           1917349951
        //  2990: ldc_w           -1348544210
        //  2993: ixor           
        //  2994: lookupswitch {
        //          -573134575: 3020
        //          390679591: 2987
        //          default: 4268
        //        }
        //  3020: goto            3024
        //  3023: athrow         
        //  3024: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  3027: goto            3031
        //  3030: athrow         
        //  3031: return         
        //  3032: aload_0        
        //  3033: getstatic       dev/nuker/pyro/fc.0:I
        //  3036: ifeq            3045
        //  3039: ldc_w           1555034912
        //  3042: goto            3048
        //  3045: ldc_w           -1224837368
        //  3048: ldc_w           2038188968
        //  3051: ixor           
        //  3052: lookupswitch {
        //          634632328: 4282
        //          775323377: 3045
        //          default: 3080
        //        }
        //  3080: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  3083: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3086: getstatic       dev/nuker/pyro/fc.1:I
        //  3089: ifeq            3098
        //  3092: ldc_w           219589891
        //  3095: goto            3101
        //  3098: ldc_w           -69862491
        //  3101: ldc_w           1724027605
        //  3104: ixor           
        //  3105: lookupswitch {
        //          396893707: 3098
        //          1809072086: 4254
        //          default: 3132
        //        }
        //  3132: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //  3135: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //  3138: ifeq            3202
        //  3141: aload_0        
        //  3142: getstatic       dev/nuker/pyro/fc.1:I
        //  3145: ifeq            3154
        //  3148: ldc_w           -1790331504
        //  3151: goto            3157
        //  3154: ldc_w           370072074
        //  3157: ldc_w           1850085218
        //  3160: ixor           
        //  3161: lookupswitch {
        //          -82855182: 3154
        //          2018039144: 3188
        //          default: 4196
        //        }
        //  3188: getfield        dev/nuker/pyro/f7r.0:Ldev/nuker/pyro/fbu;
        //  3191: goto            3195
        //  3194: athrow         
        //  3195: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  3198: goto            3202
        //  3201: athrow         
        //  3202: aload_0        
        //  3203: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/fbu;
        //  3206: ldc2_w          10000.0
        //  3209: getstatic       dev/nuker/pyro/fc.0:I
        //  3212: ifeq            3221
        //  3215: ldc_w           940066717
        //  3218: goto            3224
        //  3221: ldc_w           1293074757
        //  3224: ldc_w           -1408305210
        //  3227: ixor           
        //  3228: lookupswitch {
        //          -1811500965: 3221
        //          -518244733: 3256
        //          default: 4216
        //        }
        //  3256: goto            3260
        //  3259: athrow         
        //  3260: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  3263: goto            3267
        //  3266: athrow         
        //  3267: ifne            3302
        //  3270: aload_0        
        //  3271: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0a;
        //  3274: goto            3278
        //  3277: athrow         
        //  3278: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  3281: goto            3285
        //  3284: athrow         
        //  3285: checkcast       Ljava/lang/Boolean;
        //  3288: goto            3292
        //  3291: athrow         
        //  3292: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3295: goto            3299
        //  3298: athrow         
        //  3299: ifne            4189
        //  3302: getstatic       dev/nuker/pyro/fc.c:I
        //  3305: ifge            3314
        //  3308: ldc_w           2023049090
        //  3311: goto            3317
        //  3314: ldc_w           1550097920
        //  3317: ldc_w           1840598547
        //  3320: ixor           
        //  3321: lookupswitch {
        //          -1166738174: 3314
        //          354421137: 4306
        //          default: 3348
        //        }
        //  3348: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7i;
        //  3351: astore          8
        //  3353: aload_0        
        //  3354: getstatic       dev/nuker/pyro/fc.0:I
        //  3357: ifeq            3366
        //  3360: ldc_w           -22365980
        //  3363: goto            3369
        //  3366: ldc_w           -179394088
        //  3369: ldc_w           576043150
        //  3372: ixor           
        //  3373: lookupswitch {
        //          -587267990: 4286
        //          482809051: 3366
        //          default: 3400
        //        }
        //  3400: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  3403: getstatic       dev/nuker/pyro/fc.0:I
        //  3406: ifeq            3415
        //  3409: ldc_w           399750796
        //  3412: goto            3418
        //  3415: ldc_w           1732130198
        //  3418: ldc_w           -1862331431
        //  3421: ixor           
        //  3422: lookupswitch {
        //          -2027117227: 4256
        //          264227684: 3415
        //          default: 3448
        //        }
        //  3448: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3451: dup            
        //  3452: pop            
        //  3453: goto            3457
        //  3456: athrow         
        //  3457: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  3460: goto            3464
        //  3463: athrow         
        //  3464: dup            
        //  3465: ifnonnull       3474
        //  3468: ldc_w           -1900220065
        //  3471: goto            3477
        //  3474: ldc_w           -1900220068
        //  3477: ldc_w           -1620491294
        //  3480: ixor           
        //  3481: tableswitch {
        //          598435194: 3504
        //          598435195: 3559
        //          default: 3468
        //        }
        //  3504: getstatic       dev/nuker/pyro/fc.0:I
        //  3507: ifeq            3516
        //  3510: ldc_w           1046613635
        //  3513: goto            3519
        //  3516: ldc_w           -621081474
        //  3519: ldc_w           -580917448
        //  3522: ixor           
        //  3523: lookupswitch {
        //          -482481733: 4310
        //          1502095799: 3516
        //          default: 3548
        //        }
        //  3548: goto            3552
        //  3551: athrow         
        //  3552: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3555: goto            3559
        //  3558: athrow         
        //  3559: goto            3563
        //  3562: athrow         
        //  3563: invokevirtual   net/minecraft/entity/Entity.func_70090_H:()Z
        //  3566: goto            3570
        //  3569: athrow         
        //  3570: ifne            4149
        //  3573: aload           8
        //  3575: getstatic       dev/nuker/pyro/fc.0:I
        //  3578: ifeq            3587
        //  3581: ldc_w           2094956678
        //  3584: goto            3590
        //  3587: ldc_w           -1949810581
        //  3590: ldc_w           -2117028800
        //  3593: ixor           
        //  3594: lookupswitch {
        //          -49400634: 3587
        //          169407531: 3620
        //          default: 4208
        //        }
        //  3620: getfield        dev/nuker/pyro/f7i.c:Ldev/nuker/pyro/fw;
        //  3623: goto            3627
        //  3626: athrow         
        //  3627: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  3630: goto            3634
        //  3633: athrow         
        //  3634: checkcast       Ljava/lang/Boolean;
        //  3637: goto            3641
        //  3640: athrow         
        //  3641: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3644: goto            3648
        //  3647: athrow         
        //  3648: ifne            4149
        //  3651: aload_0        
        //  3652: getstatic       dev/nuker/pyro/fc.0:I
        //  3655: ifeq            3664
        //  3658: ldc_w           -1830492096
        //  3661: goto            3667
        //  3664: ldc_w           1037801337
        //  3667: ldc_w           400931185
        //  3670: ixor           
        //  3671: lookupswitch {
        //          -2063511247: 3664
        //          708718088: 3696
        //          default: 4302
        //        }
        //  3696: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  3699: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3702: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //  3705: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //  3708: ifne            4149
        //  3711: aload_0        
        //  3712: getfield        dev/nuker/pyro/f7r.0:Ldev/nuker/pyro/fbu;
        //  3715: ldc2_w          1000.0
        //  3718: goto            3722
        //  3721: athrow         
        //  3722: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  3725: goto            3729
        //  3728: athrow         
        //  3729: ifeq            4149
        //  3732: aload_0        
        //  3733: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  3736: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3739: dup            
        //  3740: pop            
        //  3741: goto            3745
        //  3744: athrow         
        //  3745: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  3748: goto            3752
        //  3751: athrow         
        //  3752: dup            
        //  3753: ifnonnull       3767
        //  3756: goto            3760
        //  3759: athrow         
        //  3760: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  3763: goto            3767
        //  3766: athrow         
        //  3767: getstatic       dev/nuker/pyro/fc.0:I
        //  3770: ifeq            3779
        //  3773: ldc_w           -951269254
        //  3776: goto            3782
        //  3779: ldc_w           165846245
        //  3782: ldc_w           -1520803079
        //  3785: ixor           
        //  3786: lookupswitch {
        //          419870526: 3779
        //          1645652611: 4266
        //          default: 3812
        //        }
        //  3812: getfield        net/minecraft/entity/Entity.field_70122_E:Z
        //  3815: ifeq            3824
        //  3818: ldc_w           1978797562
        //  3821: goto            3827
        //  3824: ldc_w           1978797561
        //  3827: ldc_w           910305315
        //  3830: ixor           
        //  3831: tableswitch {
        //          -2023732302: 3852
        //          -2023732301: 4017
        //          default: 3818
        //        }
        //  3852: getstatic       dev/nuker/pyro/fc.1:I
        //  3855: ifeq            3864
        //  3858: ldc_w           -58803954
        //  3861: goto            3867
        //  3864: ldc_w           28441089
        //  3867: ldc_w           -1500473799
        //  3870: ixor           
        //  3871: lookupswitch {
        //          -1490981832: 3896
        //          1525559095: 3864
        //          default: 4224
        //        }
        //  3896: aload_0        
        //  3897: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  3900: getstatic       dev/nuker/pyro/fc.1:I
        //  3903: ifeq            3912
        //  3906: ldc_w           664734474
        //  3909: goto            3915
        //  3912: ldc_w           -1006971758
        //  3915: ldc_w           766099846
        //  3918: ixor           
        //  3919: lookupswitch {
        //          -296545004: 3944
        //          171362956: 3912
        //          default: 4270
        //        }
        //  3944: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3947: dup            
        //  3948: pop            
        //  3949: goto            3953
        //  3952: athrow         
        //  3953: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  3956: goto            3960
        //  3959: athrow         
        //  3960: dup            
        //  3961: ifnonnull       3970
        //  3964: ldc_w           -1296080538
        //  3967: goto            3973
        //  3970: ldc_w           -1296080537
        //  3973: ldc_w           -146239686
        //  3976: ixor           
        //  3977: tableswitch {
        //          -1947214664: 4000
        //          -1947214663: 4011
        //          default: 3964
        //        }
        //  4000: goto            4004
        //  4003: athrow         
        //  4004: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  4007: goto            4011
        //  4010: athrow         
        //  4011: ldc2_w          0.4
        //  4014: putfield        net/minecraft/entity/Entity.field_70181_x:D
        //  4017: aload_0        
        //  4018: getfield        dev/nuker/pyro/f7r.c:Lnet/minecraft/client/Minecraft;
        //  4021: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4024: dup            
        //  4025: pop            
        //  4026: getstatic       dev/nuker/pyro/fc.0:I
        //  4029: ifeq            4038
        //  4032: ldc_w           278363805
        //  4035: goto            4041
        //  4038: ldc_w           1843963856
        //  4041: ldc_w           1277265321
        //  4044: ixor           
        //  4045: lookupswitch {
        //          1293030333: 4038
        //          1555495732: 4278
        //          default: 4072
        //        }
        //  4072: goto            4076
        //  4075: athrow         
        //  4076: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //  4079: goto            4083
        //  4082: athrow         
        //  4083: dup            
        //  4084: ifnonnull       4143
        //  4087: getstatic       dev/nuker/pyro/fc.c:I
        //  4090: ifge            4099
        //  4093: ldc_w           1285502126
        //  4096: goto            4102
        //  4099: ldc_w           996387665
        //  4102: ldc_w           2000651552
        //  4105: ixor           
        //  4106: lookupswitch {
        //          -2103596367: 4099
        //          1000386958: 4212
        //          default: 4132
        //        }
        //  4132: goto            4136
        //  4135: athrow         
        //  4136: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  4139: goto            4143
        //  4142: athrow         
        //  4143: ldc2_w          -0.4
        //  4146: putfield        net/minecraft/entity/Entity.field_70181_x:D
        //  4149: aload_0        
        //  4150: getfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0d;
        //  4153: goto            4157
        //  4156: athrow         
        //  4157: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  4160: goto            4164
        //  4163: athrow         
        //  4164: checkcast       Ljava/lang/Number;
        //  4167: goto            4171
        //  4170: athrow         
        //  4171: invokevirtual   java/lang/Number.doubleValue:()D
        //  4174: goto            4178
        //  4177: athrow         
        //  4178: goto            4182
        //  4181: athrow         
        //  4182: invokestatic    dev/nuker/pyro/fbl.3:(D)V
        //  4185: goto            4189
        //  4188: athrow         
        //  4189: return         
        //  4190: aconst_null    
        //  4191: athrow         
        //  4192: aconst_null    
        //  4193: athrow         
        //  4194: aconst_null    
        //  4195: athrow         
        //  4196: aconst_null    
        //  4197: athrow         
        //  4198: aconst_null    
        //  4199: athrow         
        //  4200: aconst_null    
        //  4201: athrow         
        //  4202: aconst_null    
        //  4203: athrow         
        //  4204: aconst_null    
        //  4205: athrow         
        //  4206: aconst_null    
        //  4207: athrow         
        //  4208: aconst_null    
        //  4209: athrow         
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
        //  4312: pop            
        //  4313: goto            24
        //  4316: pop            
        //  4317: aconst_null    
        //  4318: goto            4312
        //  4321: dup            
        //  4322: ifnull          4312
        //  4325: checkcast       Ljava/lang/Throwable;
        //  4328: athrow         
        //  4329: dup            
        //  4330: ifnull          4316
        //  4333: checkcast       Ljava/lang/Throwable;
        //  4336: athrow         
        //  4337: aconst_null    
        //  4338: athrow         
        //    StackMapTable: 02 07 43 07 00 38 04 FF 00 0B 00 00 00 01 07 00 38 FD 00 03 07 00 03 07 01 CB 4B 07 00 03 FF 00 01 00 02 07 00 03 07 01 CB 00 02 07 00 03 01 5D 07 00 03 FF 00 10 00 03 07 00 03 07 01 CB 07 00 40 00 02 07 00 03 07 00 65 FF 00 01 00 03 07 00 03 07 01 CB 07 00 40 00 03 07 00 03 07 00 65 01 FF 00 1C 00 03 07 00 03 07 01 CB 07 00 40 00 02 07 00 03 07 00 65 42 07 00 15 FF 00 00 00 03 07 00 03 07 01 CB 07 00 40 00 02 07 00 03 07 00 65 45 07 00 38 FF 00 00 00 03 07 00 03 07 01 CB 07 00 40 00 02 07 00 03 07 00 65 FF 00 0D 00 00 00 01 07 00 38 FF 00 00 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 05 07 00 03 07 01 CD 07 01 CD 01 07 00 54 45 07 00 38 FF 00 00 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 05 07 00 03 07 01 CD 07 01 CD 01 07 00 50 FF 00 0B 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 02 07 00 03 07 01 CD FF 00 01 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 03 07 00 03 07 01 CD 01 FF 00 1C 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 02 07 00 03 07 01 CD FF 00 0E 00 0A 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 00 01 07 00 38 FF 00 00 00 0A 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 00 03 07 00 65 07 01 CD 01 45 07 00 38 FF 00 00 00 0A 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 00 02 07 00 65 07 01 CD FF 00 02 00 00 00 01 07 00 38 FF 00 00 00 0A 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 00 02 07 00 65 07 01 CD 45 07 00 38 40 07 00 65 FF 00 10 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 03 01 5E 07 00 03 44 07 00 2F FF 00 00 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 03 07 00 65 45 07 00 38 00 4B 07 00 03 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 03 01 5C 07 00 03 4D 07 00 7B FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 7B 01 5B 07 00 7B 47 07 00 38 40 07 00 81 45 07 00 38 40 01 02 04 41 01 19 4E 07 00 7B FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 7B 01 5E 07 00 7B 4D 07 00 81 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 07 00 81 01 5B 07 00 81 FF 00 09 00 00 00 01 07 00 38 FF 00 00 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 03 45 07 00 38 40 03 4A 03 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 02 03 01 5C 03 FF 00 09 00 0A 07 00 03 07 01 CB 07 00 40 07 00 65 03 01 00 00 07 00 03 07 00 65 00 01 07 00 38 40 03 45 07 00 38 40 03 FF 00 0F 00 09 07 00 03 07 01 CB 03 03 01 00 00 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 01 00 00 07 00 03 07 00 65 00 02 07 00 7B 01 5B 07 00 7B FF 00 0C 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 01 00 00 07 00 03 07 00 65 00 01 03 45 07 00 38 40 03 FF 00 0D 00 08 07 00 03 07 01 CB 03 03 03 00 07 00 03 07 00 65 00 01 01 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 00 07 00 03 07 00 65 00 02 01 01 5E 01 FF 00 0C 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 00 41 01 1C 44 07 00 38 40 03 45 07 00 38 40 03 FF 00 10 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 02 08 03 03 08 03 03 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 03 08 03 03 08 03 03 01 FF 00 1B 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 02 08 03 03 08 03 03 FF 00 20 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 03 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 05 08 03 03 08 03 03 03 07 00 03 01 FF 00 1C 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 03 FF 00 10 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 81 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 05 08 03 03 08 03 03 03 07 00 81 01 FF 00 1C 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 81 5C 07 00 38 FF 00 00 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 05 08 03 03 08 03 03 03 03 03 45 07 00 38 40 07 00 AD FF 00 11 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 04 08 03 C7 08 03 C7 07 00 03 01 FF 00 1E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 03 FF 00 0D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 04 08 03 C7 08 03 C7 07 00 7B 01 FF 00 1B 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 7B FF 00 2A 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 06 08 03 C7 08 03 C7 03 03 07 00 03 01 FF 00 1E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 03 FF 00 0D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 06 08 03 C7 08 03 C7 03 03 07 00 7B 01 FF 00 1B 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 7B FF 00 0D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 06 08 03 C7 08 03 C7 03 03 07 00 81 01 FF 00 1B 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 81 FF 00 14 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 07 08 03 C7 08 03 C7 03 03 03 03 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 08 08 03 C7 08 03 C7 03 03 03 03 03 01 FF 00 1C 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 07 08 03 C7 08 03 C7 03 03 03 03 03 46 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 03 45 07 00 38 40 07 00 AD 4A 07 00 AD FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 02 07 00 AD 01 5B 07 00 AD FF 00 0D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 00 31 40 07 00 81 45 07 00 38 40 07 00 E7 FF 00 06 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 00 E7 45 07 00 38 40 07 00 E7 51 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 45 07 00 38 40 07 00 F7 44 07 00 38 40 07 00 F7 47 07 00 38 40 07 01 00 4A 07 01 00 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 00 01 5C 07 01 00 42 07 00 21 40 07 01 00 45 07 00 38 40 01 02 05 42 01 18 0B 42 01 1C 4B 07 00 27 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 45 07 00 38 40 07 00 F7 44 07 00 38 40 07 00 F7 47 07 00 38 40 07 01 00 FF 00 02 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 00 45 07 00 38 40 01 0E 42 01 1F 46 07 00 38 40 07 01 10 45 07 00 38 40 07 00 50 45 07 00 21 40 07 01 13 45 07 00 38 40 01 46 07 00 38 40 03 45 07 00 38 00 0B 42 01 1C 46 07 00 38 40 07 01 22 45 07 00 38 00 00 FF 00 1A 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 7B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 07 00 7B 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 7B FF 00 0E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 81 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 07 00 81 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 81 FF 00 11 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 01 FF 00 1E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 FF 00 14 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 07 00 03 01 FF 00 1F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 07 00 03 FF 00 14 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 01 FF 00 1F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 FF 00 0F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 7B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 07 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 7B 01 FF 00 1C 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 7B FF 00 0E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 81 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 07 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 81 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 81 FF 00 10 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 03 45 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD FF 00 0B 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 03 07 00 F1 07 00 AD 01 FF 00 1F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 42 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 45 07 00 38 40 07 00 F7 44 07 00 13 40 07 00 F7 47 07 00 38 40 07 01 00 42 07 00 31 40 07 01 00 45 07 00 38 40 01 0E 42 01 1C 4F 07 01 10 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 10 01 5C 07 01 10 FF 00 02 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 10 45 07 00 38 40 07 00 50 45 07 00 2F 40 07 01 13 45 07 00 38 40 01 46 07 00 38 40 03 45 07 00 38 00 46 07 00 38 40 07 01 22 45 07 00 38 00 00 4C 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 03 01 5F 07 00 03 FF 00 16 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 07 00 03 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 03 FF 00 0E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 7B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 07 00 7B 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 7B FF 00 0E 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 81 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 07 00 81 01 FF 00 1D 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 81 FF 00 0F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 03 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 09 7A 08 09 7A 03 03 01 FF 00 1C 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 03 03 FF 00 29 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 09 7A 08 09 7A 03 03 03 45 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 42 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD 45 07 00 38 40 07 00 F7 FF 00 04 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 00 F7 47 07 00 38 40 07 01 00 42 07 00 2F 40 07 01 00 45 07 00 38 40 01 02 05 42 01 18 0B 42 01 1C 4C 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 03 01 5F 07 00 03 4E 07 01 10 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 10 01 5D 07 01 10 42 07 00 38 40 07 01 10 45 07 00 38 40 07 00 50 FF 00 05 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 13 45 07 00 38 40 01 46 07 00 2F 40 03 45 07 00 38 00 4C 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 03 01 5F 07 00 03 4E 07 01 22 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 22 01 5D 07 01 22 42 07 00 38 40 07 01 22 45 07 00 38 00 00 4C 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 03 01 5F 07 00 03 51 07 00 81 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 81 01 5E 07 00 81 55 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 03 01 5E 07 00 03 FF 00 05 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 22 45 07 00 38 00 FF 00 12 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 22 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 03 07 01 22 03 01 FF 00 1F 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 22 03 42 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 22 03 45 07 00 38 40 01 49 07 00 38 40 07 01 10 45 07 00 38 40 07 00 50 45 07 00 17 40 07 01 13 45 07 00 38 40 01 02 0B 42 01 1E FF 00 11 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 03 01 5E 07 00 03 4E 07 00 7B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 7B 01 5D 07 00 7B 47 07 00 38 40 07 00 81 45 07 00 38 40 07 00 E7 43 07 00 E7 45 07 00 E7 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 E7 01 5A 07 00 E7 4B 07 00 E7 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 E7 01 5C 07 00 E7 42 07 00 38 40 07 00 E7 45 07 00 38 40 07 00 E7 42 07 00 38 40 07 00 E7 45 07 00 38 40 01 50 07 01 9B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 01 9B 01 5D 07 01 9B 45 07 00 1B 40 07 01 A0 45 07 00 38 40 07 00 50 45 07 00 2F 40 07 01 13 45 07 00 38 40 01 4F 07 00 03 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 03 01 5C 07 00 03 58 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 01 22 03 45 07 00 38 40 01 FF 00 0E 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 81 45 07 00 38 40 07 00 E7 FF 00 06 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 E7 45 07 00 38 40 07 00 E7 4B 07 00 E7 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 E7 01 5D 07 00 E7 05 05 42 01 18 0B 42 01 1C 4F 07 00 7B FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 7B 01 5C 07 00 7B 47 07 00 38 40 07 00 81 45 07 00 38 40 07 00 E7 43 07 00 E7 45 07 00 E7 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 E7 01 5A 07 00 E7 42 07 00 38 40 07 00 E7 45 07 00 38 40 07 00 E7 05 54 07 00 81 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 81 01 5E 07 00 81 42 07 00 31 40 07 00 81 45 07 00 38 40 07 00 E7 4F 07 00 E7 FF 00 02 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 02 07 00 E7 01 5D 07 00 E7 42 07 00 1B 40 07 00 E7 45 07 00 38 40 07 00 E7 05 46 07 00 38 40 07 00 54 45 07 00 38 40 07 00 50 FF 00 05 00 00 00 01 07 00 38 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 01 C5 45 07 00 38 40 03 42 07 00 38 40 03 45 07 00 38 FF 00 00 00 0B 07 00 03 07 01 CB 00 00 00 00 00 00 00 07 00 03 07 00 65 00 00 FF 00 00 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 7B FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 01 CB 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 00 F1 07 00 AD FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 03 08 03 C7 08 03 C7 07 00 7B FF 00 01 00 03 07 00 03 07 01 CB 07 00 40 00 02 07 00 03 07 00 65 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 01 9B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 E7 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 02 07 01 22 03 41 07 00 03 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 00 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 01 07 00 AD FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 07 08 03 C7 08 03 C7 03 03 03 03 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 00 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 09 7A 08 09 7A 03 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 7B 41 07 00 03 01 01 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 01 00 00 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 00 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 09 7A 08 09 7A 07 00 03 41 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 00 07 00 03 07 00 65 00 01 01 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 10 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 81 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 00 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 E7 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 01 22 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 7B FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 06 07 00 F1 08 06 D7 08 06 D7 03 03 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 01 07 00 03 41 07 00 03 FF 00 01 00 0B 07 00 03 07 01 CB 07 00 40 07 00 65 07 01 CD 01 00 00 00 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 01 CB 07 00 40 07 00 65 00 02 07 00 03 07 01 CD FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 04 07 00 F1 08 06 D7 08 06 D7 07 00 7B 41 07 01 10 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 00 01 07 00 03 07 00 65 00 05 08 03 C7 08 03 C7 03 03 07 00 81 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 04 08 03 03 08 03 03 03 07 00 81 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 05 07 00 F1 08 06 D7 08 06 D7 03 03 01 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 01 07 00 03 07 00 65 00 00 01 FF 00 01 00 08 07 00 03 07 01 CB 03 03 03 01 07 00 03 07 00 65 00 02 08 03 03 08 03 03 FF 00 01 00 09 07 00 03 07 01 CB 03 03 07 00 AD 07 00 AD 07 01 9B 07 00 03 07 00 65 00 01 07 00 E7 FF 00 01 00 02 07 00 03 07 01 CB 00 01 07 00 38 43 05 44 07 00 38 47 05 47 07 00 38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4321   4329   Any
        //  4321   4329   4321   4329   Any
        //  4337   4339   3      8      Ljava/lang/IllegalStateException;
        //  119    126    126    127    Any
        //  120    126    119    120    Ljava/lang/NumberFormatException;
        //  119    126    126    127    Any
        //  120    126    126    127    Ljava/util/ConcurrentModificationException;
        //  119    126    3      8      Any
        //  142    148    148    149    Any
        //  142    148    148    149    Any
        //  142    148    3      8      Ljava/lang/IllegalArgumentException;
        //  142    148    3      8      Ljava/util/ConcurrentModificationException;
        //  142    148    3      8      Ljava/lang/NumberFormatException;
        //  207    214    214    215    Any
        //  208    214    214    215    Any
        //  208    214    207    208    Any
        //  208    214    207    208    Any
        //  207    214    207    208    Any
        //  219    225    225    226    Any
        //  219    225    3      8      Ljava/util/NoSuchElementException;
        //  219    225    225    226    Any
        //  219    225    3      8      Any
        //  219    225    3      8      Any
        //  281    288    288    289    Any
        //  281    288    281    282    Ljava/lang/NumberFormatException;
        //  281    288    3      8      Ljava/util/NoSuchElementException;
        //  282    288    3      8      Ljava/util/ConcurrentModificationException;
        //  282    288    281    282    Ljava/lang/EnumConstantNotPresentException;
        //  384    391    391    392    Any
        //  384    391    3      8      Ljava/lang/ArithmeticException;
        //  384    391    384    385    Any
        //  385    391    384    385    Any
        //  385    391    3      8      Any
        //  531    537    537    538    Any
        //  531    537    537    538    Ljava/lang/NegativeArraySizeException;
        //  531    537    3      8      Any
        //  531    537    3      8      Any
        //  531    537    3      8      Ljava/lang/NumberFormatException;
        //  590    597    597    598    Any
        //  591    597    3      8      Ljava/lang/NullPointerException;
        //  590    597    3      8      Ljava/lang/AssertionError;
        //  590    597    590    591    Ljava/util/ConcurrentModificationException;
        //  591    597    590    591    Any
        //  658    664    664    665    Any
        //  658    664    664    665    Ljava/lang/IndexOutOfBoundsException;
        //  658    664    3      8      Any
        //  658    664    3      8      Ljava/lang/ClassCastException;
        //  658    664    3      8      Ljava/lang/NegativeArraySizeException;
        //  761    768    768    769    Any
        //  762    768    761    762    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  761    768    761    762    Any
        //  761    768    3      8      Ljava/util/NoSuchElementException;
        //  761    768    761    762    Any
        //  957    964    964    965    Any
        //  958    964    3      8      Any
        //  958    964    957    958    Any
        //  958    964    964    965    Any
        //  957    964    957    958    Ljava/lang/UnsupportedOperationException;
        //  1283   1290   1290   1291   Any
        //  1284   1290   1290   1291   Ljava/lang/RuntimeException;
        //  1283   1290   1283   1284   Any
        //  1284   1290   1290   1291   Any
        //  1283   1290   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1346   1353   1353   1354   Any
        //  1347   1353   3      8      Any
        //  1347   1353   1346   1347   Ljava/lang/StringIndexOutOfBoundsException;
        //  1347   1353   1353   1354   Ljava/lang/NumberFormatException;
        //  1347   1353   1346   1347   Ljava/lang/StringIndexOutOfBoundsException;
        //  1362   1368   1368   1369   Any
        //  1362   1368   3      8      Any
        //  1362   1368   1368   1369   Any
        //  1362   1368   1368   1369   Ljava/lang/NegativeArraySizeException;
        //  1362   1368   1368   1369   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1387   1394   1394   1395   Any
        //  1387   1394   1387   1388   Any
        //  1388   1394   3      8      Any
        //  1388   1394   3      8      Ljava/lang/ClassCastException;
        //  1388   1394   1394   1395   Ljava/lang/AssertionError;
        //  1400   1409   1409   1410   Any
        //  1401   1409   1400   1401   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1401   1409   3      8      Ljava/lang/RuntimeException;
        //  1400   1409   1400   1401   Any
        //  1400   1409   1409   1410   Any
        //  1455   1462   1462   1463   Any
        //  1456   1462   3      8      Any
        //  1456   1462   1455   1456   Ljava/lang/NegativeArraySizeException;
        //  1455   1462   3      8      Ljava/lang/NegativeArraySizeException;
        //  1455   1462   3      8      Ljava/lang/ClassCastException;
        //  1556   1563   1563   1564   Any
        //  1557   1563   1563   1564   Any
        //  1557   1563   1556   1557   Ljava/lang/IndexOutOfBoundsException;
        //  1556   1563   1563   1564   Ljava/lang/RuntimeException;
        //  1556   1563   1563   1564   Any
        //  1569   1578   1578   1579   Any
        //  1570   1578   1569   1570   Any
        //  1569   1578   1569   1570   Any
        //  1570   1578   1578   1579   Any
        //  1570   1578   3      8      Ljava/lang/AssertionError;
        //  1583   1589   1589   1590   Any
        //  1583   1589   3      8      Any
        //  1583   1589   1589   1590   Any
        //  1583   1589   3      8      Any
        //  1583   1589   3      8      Ljava/lang/NegativeArraySizeException;
        //  1647   1654   1654   1655   Any
        //  1648   1654   3      8      Any
        //  1647   1654   1647   1648   Any
        //  1647   1654   1654   1655   Ljava/lang/NegativeArraySizeException;
        //  1648   1654   1654   1655   Ljava/lang/NegativeArraySizeException;
        //  1661   1668   1668   1669   Any
        //  1661   1668   1668   1669   Ljava/lang/ClassCastException;
        //  1661   1668   1668   1669   Any
        //  1661   1668   1661   1662   Ljava/lang/NegativeArraySizeException;
        //  1661   1668   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1676   1683   1683   1684   Any
        //  1676   1683   1683   1684   Any
        //  1677   1683   1676   1677   Ljava/lang/ArithmeticException;
        //  1677   1683   1676   1677   Any
        //  1677   1683   1676   1677   Any
        //  1735   1742   1742   1743   Any
        //  1735   1742   1742   1743   Ljava/lang/NullPointerException;
        //  1735   1742   1735   1736   Any
        //  1735   1742   1735   1736   Any
        //  1735   1742   1735   1736   Ljava/lang/NegativeArraySizeException;
        //  2130   2136   2136   2137   Any
        //  2130   2136   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2130   2136   3      8      Ljava/lang/IllegalArgumentException;
        //  2130   2136   2136   2137   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2130   2136   2136   2137   Any
        //  2187   2194   2194   2195   Any
        //  2187   2194   2187   2188   Any
        //  2187   2194   3      8      Ljava/lang/UnsupportedOperationException;
        //  2187   2194   2187   2188   Ljava/lang/NumberFormatException;
        //  2188   2194   2187   2188   Any
        //  2200   2209   2209   2210   Any
        //  2200   2209   3      8      Any
        //  2200   2209   2200   2201   Ljava/lang/IllegalStateException;
        //  2200   2209   3      8      Ljava/lang/IllegalArgumentException;
        //  2200   2209   3      8      Any
        //  2213   2220   2220   2221   Any
        //  2213   2220   2220   2221   Any
        //  2213   2220   2213   2214   Ljava/lang/StringIndexOutOfBoundsException;
        //  2213   2220   2213   2214   Ljava/lang/StringIndexOutOfBoundsException;
        //  2214   2220   2220   2221   Ljava/lang/NullPointerException;
        //  2320   2326   2326   2327   Any
        //  2320   2326   2326   2327   Any
        //  2320   2326   2326   2327   Any
        //  2320   2326   3      8      Any
        //  2320   2326   3      8      Ljava/util/ConcurrentModificationException;
        //  2333   2340   2340   2341   Any
        //  2333   2340   2333   2334   Ljava/lang/RuntimeException;
        //  2334   2340   3      8      Any
        //  2334   2340   2340   2341   Any
        //  2333   2340   3      8      Ljava/lang/UnsupportedOperationException;
        //  2348   2355   2355   2356   Any
        //  2349   2355   2348   2349   Any
        //  2348   2355   2348   2349   Ljava/lang/IllegalArgumentException;
        //  2348   2355   3      8      Any
        //  2348   2355   2348   2349   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2363   2370   2370   2371   Any
        //  2364   2370   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2363   2370   2370   2371   Ljava/lang/IllegalArgumentException;
        //  2363   2370   3      8      Any
        //  2363   2370   2363   2364   Any
        //  2663   2669   2669   2670   Any
        //  2663   2669   3      8      Any
        //  2663   2669   2669   2670   Ljava/lang/RuntimeException;
        //  2663   2669   2669   2670   Any
        //  2663   2669   3      8      Any
        //  2673   2680   2680   2681   Any
        //  2673   2680   2673   2674   Any
        //  2674   2680   2673   2674   Ljava/lang/ClassCastException;
        //  2673   2680   2673   2674   Ljava/lang/UnsupportedOperationException;
        //  2674   2680   2680   2681   Ljava/lang/UnsupportedOperationException;
        //  2687   2695   2695   2696   Any
        //  2687   2695   3      8      Any
        //  2687   2695   2695   2696   Any
        //  2687   2695   2695   2696   Ljava/lang/StringIndexOutOfBoundsException;
        //  2687   2695   2695   2696   Any
        //  2699   2706   2706   2707   Any
        //  2700   2706   2706   2707   Any
        //  2700   2706   2699   2700   Ljava/util/NoSuchElementException;
        //  2699   2706   2699   2700   Ljava/util/NoSuchElementException;
        //  2700   2706   2699   2700   Ljava/lang/NumberFormatException;
        //  2887   2894   2894   2895   Any
        //  2888   2894   2887   2888   Any
        //  2888   2894   2887   2888   Ljava/lang/NegativeArraySizeException;
        //  2887   2894   2887   2888   Any
        //  2888   2894   3      8      Any
        //  2902   2908   2908   2909   Any
        //  2902   2908   2908   2909   Any
        //  2902   2908   2908   2909   Ljava/lang/AssertionError;
        //  2902   2908   2908   2909   Ljava/lang/ClassCastException;
        //  2902   2908   3      8      Any
        //  2916   2923   2923   2924   Any
        //  2917   2923   2916   2917   Ljava/lang/ClassCastException;
        //  2916   2923   2916   2917   Ljava/lang/RuntimeException;
        //  2917   2923   2923   2924   Ljava/lang/NullPointerException;
        //  2916   2923   3      8      Ljava/util/ConcurrentModificationException;
        //  3023   3030   3030   3031   Any
        //  3024   3030   3030   3031   Ljava/util/NoSuchElementException;
        //  3023   3030   3030   3031   Any
        //  3024   3030   3023   3024   Ljava/util/NoSuchElementException;
        //  3023   3030   3023   3024   Any
        //  3195   3201   3201   3202   Any
        //  3195   3201   3201   3202   Any
        //  3195   3201   3      8      Ljava/lang/AssertionError;
        //  3195   3201   3201   3202   Ljava/util/ConcurrentModificationException;
        //  3195   3201   3      8      Any
        //  3259   3266   3266   3267   Any
        //  3259   3266   3266   3267   Any
        //  3260   3266   3259   3260   Any
        //  3260   3266   3266   3267   Ljava/lang/UnsupportedOperationException;
        //  3259   3266   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3277   3284   3284   3285   Any
        //  3278   3284   3277   3278   Ljava/util/NoSuchElementException;
        //  3278   3284   3277   3278   Any
        //  3278   3284   3277   3278   Ljava/lang/ClassCastException;
        //  3277   3284   3      8      Any
        //  3291   3298   3298   3299   Any
        //  3291   3298   3      8      Ljava/lang/AssertionError;
        //  3291   3298   3291   3292   Ljava/util/ConcurrentModificationException;
        //  3292   3298   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3292   3298   3298   3299   Ljava/lang/RuntimeException;
        //  3456   3463   3463   3464   Any
        //  3457   3463   3456   3457   Any
        //  3457   3463   3463   3464   Any
        //  3456   3463   3463   3464   Ljava/lang/UnsupportedOperationException;
        //  3457   3463   3456   3457   Ljava/lang/ArithmeticException;
        //  3551   3558   3558   3559   Any
        //  3551   3558   3551   3552   Any
        //  3551   3558   3558   3559   Any
        //  3551   3558   3      8      Any
        //  3552   3558   3      8      Any
        //  3562   3569   3569   3570   Any
        //  3562   3569   3      8      Ljava/lang/ClassCastException;
        //  3563   3569   3      8      Any
        //  3562   3569   3569   3570   Ljava/lang/IllegalArgumentException;
        //  3562   3569   3562   3563   Any
        //  3626   3633   3633   3634   Any
        //  3627   3633   3633   3634   Ljava/util/NoSuchElementException;
        //  3627   3633   3633   3634   Any
        //  3627   3633   3633   3634   Any
        //  3626   3633   3626   3627   Ljava/util/NoSuchElementException;
        //  3640   3647   3647   3648   Any
        //  3640   3647   3640   3641   Ljava/lang/UnsupportedOperationException;
        //  3640   3647   3640   3641   Ljava/lang/IndexOutOfBoundsException;
        //  3640   3647   3647   3648   Any
        //  3641   3647   3640   3641   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3721   3728   3728   3729   Any
        //  3722   3728   3721   3722   Any
        //  3721   3728   3728   3729   Any
        //  3722   3728   3721   3722   Ljava/lang/ArithmeticException;
        //  3721   3728   3      8      Ljava/lang/NegativeArraySizeException;
        //  3745   3751   3751   3752   Any
        //  3745   3751   3751   3752   Any
        //  3745   3751   3      8      Ljava/lang/UnsupportedOperationException;
        //  3745   3751   3      8      Ljava/lang/NegativeArraySizeException;
        //  3745   3751   3      8      Any
        //  3760   3766   3766   3767   Any
        //  3760   3766   3766   3767   Ljava/lang/IllegalArgumentException;
        //  3760   3766   3766   3767   Ljava/lang/ClassCastException;
        //  3760   3766   3766   3767   Any
        //  3760   3766   3766   3767   Any
        //  3952   3959   3959   3960   Any
        //  3953   3959   3959   3960   Ljava/lang/UnsupportedOperationException;
        //  3953   3959   3952   3953   Any
        //  3952   3959   3959   3960   Any
        //  3953   3959   3      8      Ljava/lang/NumberFormatException;
        //  4003   4010   4010   4011   Any
        //  4004   4010   4010   4011   Ljava/lang/NullPointerException;
        //  4003   4010   3      8      Any
        //  4004   4010   4003   4004   Ljava/lang/IndexOutOfBoundsException;
        //  4004   4010   4003   4004   Any
        //  4075   4082   4082   4083   Any
        //  4076   4082   3      8      Ljava/util/NoSuchElementException;
        //  4075   4082   4082   4083   Any
        //  4075   4082   3      8      Any
        //  4076   4082   4075   4076   Ljava/lang/StringIndexOutOfBoundsException;
        //  4135   4142   4142   4143   Any
        //  4135   4142   4135   4136   Ljava/util/NoSuchElementException;
        //  4135   4142   3      8      Ljava/util/ConcurrentModificationException;
        //  4136   4142   4142   4143   Ljava/lang/IllegalArgumentException;
        //  4136   4142   4142   4143   Any
        //  4156   4163   4163   4164   Any
        //  4156   4163   4163   4164   Ljava/util/NoSuchElementException;
        //  4157   4163   4156   4157   Any
        //  4156   4163   3      8      Any
        //  4157   4163   4156   4157   Ljava/lang/StringIndexOutOfBoundsException;
        //  4171   4177   4177   4178   Any
        //  4171   4177   3      8      Any
        //  4171   4177   3      8      Ljava/lang/NullPointerException;
        //  4171   4177   4177   4178   Any
        //  4171   4177   3      8      Any
        //  4181   4188   4188   4189   Any
        //  4181   4188   4188   4189   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4181   4188   4181   4182   Any
        //  4181   4188   3      8      Any
        //  4181   4188   3      8      Any
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
    
    @NotNull
    public f0d 0() {
        return fbS.gb(this, 67154393);
    }
    
    @NotNull
    public fbu 1() {
        return fbS.72(this, 1099174982);
    }
    
    @NotNull
    public f0a c() {
        return fbS.J(this, 1561027122);
    }
    
    @NotNull
    public fbu 2() {
        return fbS.76(this, 1520363393);
    }
    
    public f7r() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u220c\u149d\u8b14\ub3d0\uc952\uec16\ub237\ue73d\ud96d\ue930\ua6cb"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u222c\u149d\u8b14\ub3d0\uc952\uec16\ub217\ue73d\ud96d\ue930\ua6cb"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u222a\u149c\u8b0e\ub3cd\uc954\uec00\ub228\ue76d\ud97c\ue93d\ua6ca\u1e0c\ue01a\uc5b7\u81b7\u8891\u57a0\u76a8\ubd32\uc08f\u2abb\uc222\u6bef\u2d43\ud745\u342c\u7d39\u884a\u8015\u8c1b\u8547\ufb35\u717f\u9a13\u1b0e\uf09a\u4975\u8998\uca9f"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: getstatic       dev/nuker/pyro/fc.1:I
        //    26: ifeq            35
        //    29: ldc_w           1098357166
        //    32: goto            38
        //    35: ldc_w           1265342758
        //    38: ldc_w           1678957844
        //    41: ixor           
        //    42: lookupswitch {
        //          -1687396210: 35
        //          627393722: 308
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: new             Ldev/nuker/pyro/f0a;
        //    72: dup            
        //    73: ldc_w           "\u2208\u149d\u8b14\ub3d0\uc975\uec1b\ub231\ue72e\ud963"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: ldc_w           "\u2228\u149d\u8b14\ub3d0\uc975\uec1b\ub231\ue72e\ud963"
        //    82: invokestatic    invokestatic   !!! ERROR
        //    85: aconst_null    
        //    86: iconst_0       
        //    87: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    90: checkcast       Ldev/nuker/pyro/f0n;
        //    93: invokevirtual   dev/nuker/pyro/f7r.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    96: checkcast       Ldev/nuker/pyro/f0a;
        //    99: getstatic       dev/nuker/pyro/fc.c:I
        //   102: ifge            111
        //   105: ldc_w           -1678390987
        //   108: goto            114
        //   111: ldc_w           -794731044
        //   114: ldc_w           1344249842
        //   117: ixor           
        //   118: lookupswitch {
        //          -1558085936: 111
        //          -873834809: 310
        //          default: 144
        //        }
        //   144: putfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0a;
        //   147: aload_0        
        //   148: aload_0        
        //   149: new             Ldev/nuker/pyro/f0d;
        //   152: dup            
        //   153: ldc_w           "\u221a\u1483\u8b05\ub3dc\uc942"
        //   156: invokestatic    invokestatic   !!! ERROR
        //   159: ldc_w           "\u223a\u1483\u8b05\ub3dc\uc942"
        //   162: getstatic       dev/nuker/pyro/fc.0:I
        //   165: ifeq            174
        //   168: ldc_w           -688267820
        //   171: goto            177
        //   174: ldc_w           -96790281
        //   177: ldc_w           174451071
        //   180: ixor           
        //   181: lookupswitch {
        //          -593742677: 174
        //          -262213240: 208
        //          default: 314
        //        }
        //   208: invokestatic    invokestatic   !!! ERROR
        //   211: aconst_null    
        //   212: ldc2_w          0.5
        //   215: ldc2_w          0.1
        //   218: ldc2_w          3.8
        //   221: dconst_0       
        //   222: bipush          64
        //   224: aconst_null    
        //   225: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   228: checkcast       Ldev/nuker/pyro/f0n;
        //   231: invokevirtual   dev/nuker/pyro/f7r.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   234: checkcast       Ldev/nuker/pyro/f0d;
        //   237: putfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/f0d;
        //   240: aload_0        
        //   241: new             Ldev/nuker/pyro/fbu;
        //   244: dup            
        //   245: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   248: putfield        dev/nuker/pyro/f7r.c:Ldev/nuker/pyro/fbu;
        //   251: getstatic       dev/nuker/pyro/fc.c:I
        //   254: ifge            263
        //   257: ldc_w           -817389432
        //   260: goto            266
        //   263: ldc_w           858424592
        //   266: ldc_w           104618815
        //   269: ixor           
        //   270: lookupswitch {
        //          -914621513: 263
        //          890691119: 296
        //          default: 312
        //        }
        //   296: aload_0        
        //   297: new             Ldev/nuker/pyro/fbu;
        //   300: dup            
        //   301: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   304: putfield        dev/nuker/pyro/f7r.0:Ldev/nuker/pyro/fbu;
        //   307: return         
        //   308: aconst_null    
        //   309: athrow         
        //   310: aconst_null    
        //   311: athrow         
        //   312: aconst_null    
        //   313: athrow         
        //   314: aconst_null    
        //   315: athrow         
        //    StackMapTable: 00 10 FF 00 23 00 01 07 00 03 00 01 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 2A 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 10 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 01 10 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 95 08 00 95 07 00 65 07 00 65 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 95 08 00 95 07 00 65 07 00 65 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 95 08 00 95 07 00 65 07 00 65 36 42 01 1D 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 10 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 95 08 00 95 07 00 65 07 00 65
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
}
