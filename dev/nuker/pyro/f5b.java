// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;

public class f5B extends fH
{
    public f0f<f5A> c;
    public f0d c;
    public f0a c;
    public f0a 0;
    
    @f06(4)
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2511
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2503
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2495
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
        //    39: if_acmpne       47
        //    42: ldc             -249752142
        //    44: goto            49
        //    47: ldc             -249752141
        //    49: ldc             -1950986776
        //    51: ixor           
        //    52: tableswitch {
        //          -178868044: 76
        //          -178868043: 91
        //          default: 42
        //        }
        //    76: aload_1        
        //    77: goto            81
        //    80: athrow         
        //    81: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //    84: goto            88
        //    87: athrow         
        //    88: ifeq            92
        //    91: return         
        //    92: getstatic       net/minecraft/init/Blocks.field_150321_G:Lnet/minecraft/block/Block;
        //    95: goto            99
        //    98: athrow         
        //    99: invokestatic    dev/nuker/pyro/fbG.c:(Lnet/minecraft/block/Block;)I
        //   102: goto            106
        //   105: athrow         
        //   106: istore_2       
        //   107: getstatic       dev/nuker/pyro/fc.0:I
        //   110: ifeq            118
        //   113: ldc             2113568168
        //   115: goto            120
        //   118: ldc             -2050882904
        //   120: ldc             -57151558
        //   122: ixor           
        //   123: lookupswitch {
        //          -2123525614: 118
        //          2035674386: 148
        //          default: 2474
        //        }
        //   148: iload_2        
        //   149: iconst_m1      
        //   150: if_icmpne       456
        //   153: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: getstatic       dev/nuker/pyro/fc.c:I
        //   163: ifge            171
        //   166: ldc             -1569156568
        //   168: goto            173
        //   171: ldc             1745436815
        //   173: ldc             -439670091
        //   175: ixor           
        //   176: lookupswitch {
        //          -1123642660: 171
        //          1202960541: 2440
        //          default: 204
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokespecial   java/lang/StringBuilder.<init>:()V
        //   211: goto            215
        //   214: athrow         
        //   215: ldc             "\u23c4\u14a0\u8aeb\ub1c4\ucfc5\uedce\ub221\ue6c1\udb44\uefea\ua779"
        //   217: getstatic       dev/nuker/pyro/fc.0:I
        //   220: ifeq            228
        //   223: ldc             -1576228545
        //   225: goto            230
        //   228: ldc             1149468985
        //   230: ldc             -1665458775
        //   232: ixor           
        //   233: lookupswitch {
        //          -667378544: 260
        //          1052226710: 228
        //          default: 2428
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokestatic    invokestatic   !!! ERROR
        //   267: goto            271
        //   270: athrow         
        //   271: goto            275
        //   274: athrow         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: goto            282
        //   281: athrow         
        //   282: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   285: getstatic       dev/nuker/pyro/fc.1:I
        //   288: ifeq            296
        //   291: ldc             146356220
        //   293: goto            298
        //   296: ldc             -1282787916
        //   298: ldc             -638432846
        //   300: ixor           
        //   301: lookupswitch {
        //          -783581618: 2436
        //          1149617735: 296
        //          default: 328
        //        }
        //   328: goto            332
        //   331: athrow         
        //   332: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   335: goto            339
        //   338: athrow         
        //   339: ldc             "\u23c6\u149c\u8afb\ub188\ucfc0\uedec\ub236\ue6d1\udb7c\uefbe\ua72d\u1e40\ue1fe\uc7f6\u8733\u896d\u57e4\u7708\ubf23\uc618\u2b4d\uc233\u6a0f\u2f51\ud1d7\u35da\u7d2a\u89a3\u8219\u8ad7\u84bc\ufb3d\u70d3\u9810\u1d80\uf17a\u496f\u8822\uc89e\uf929\ub687\u41ea\ub9f8\ub14c\u4a67\u8aaa\u7c61\uce29\u7f4b\uecc0\ue6c6\u16ca\uee14"
        //   341: goto            345
        //   344: athrow         
        //   345: invokestatic    invokestatic   !!! ERROR
        //   348: goto            352
        //   351: athrow         
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: goto            363
        //   362: athrow         
        //   363: goto            367
        //   366: athrow         
        //   367: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   370: goto            374
        //   373: athrow         
        //   374: goto            378
        //   377: athrow         
        //   378: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   381: goto            385
        //   384: athrow         
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            396
        //   391: ldc             92439123
        //   393: goto            398
        //   396: ldc             -1401285029
        //   398: ldc             -166553059
        //   400: ixor           
        //   401: lookupswitch {
        //          -208660402: 2430
        //          1548843988: 396
        //          default: 428
        //        }
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/fw;
        //   432: iconst_0       
        //   433: goto            437
        //   436: athrow         
        //   437: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   440: goto            444
        //   443: athrow         
        //   444: goto            448
        //   447: athrow         
        //   448: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   451: goto            455
        //   454: athrow         
        //   455: return         
        //   456: aload_0        
        //   457: getfield        dev/nuker/pyro/f5B.0:Ldev/nuker/pyro/f0a;
        //   460: goto            464
        //   463: athrow         
        //   464: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   467: goto            471
        //   470: athrow         
        //   471: checkcast       Ljava/lang/Boolean;
        //   474: goto            478
        //   477: athrow         
        //   478: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   481: goto            485
        //   484: athrow         
        //   485: ifeq            769
        //   488: aload_0        
        //   489: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   492: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   495: getstatic       dev/nuker/pyro/fc.0:I
        //   498: ifeq            506
        //   501: ldc             618001233
        //   503: goto            508
        //   506: ldc             211368762
        //   508: ldc             1882102989
        //   510: ixor           
        //   511: lookupswitch {
        //          1425764252: 506
        //          2092410871: 536
        //          default: 2442
        //        }
        //   536: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //   539: goto            543
        //   542: athrow         
        //   543: invokestatic    dev/nuker/pyro/fbv.c:(Lnet/minecraft/entity/Entity;Lnet/minecraft/block/Block;)Z
        //   546: goto            550
        //   549: athrow         
        //   550: ifne            769
        //   553: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   556: new             Ljava/lang/StringBuilder;
        //   559: dup            
        //   560: goto            564
        //   563: athrow         
        //   564: invokespecial   java/lang/StringBuilder.<init>:()V
        //   567: goto            571
        //   570: athrow         
        //   571: ldc             "\u23c4\u14a0\u8aeb\ub1c4\ucfc5\uedce\ub221\ue6c1\udb44\uefea"
        //   573: getstatic       dev/nuker/pyro/fc.0:I
        //   576: ifeq            584
        //   579: ldc             598153255
        //   581: goto            586
        //   584: ldc             536851385
        //   586: ldc             -341679581
        //   588: ixor           
        //   589: lookupswitch {
        //          -1280659787: 584
        //          -939165180: 2434
        //          default: 616
        //        }
        //   616: goto            620
        //   619: athrow         
        //   620: invokestatic    invokestatic   !!! ERROR
        //   623: goto            627
        //   626: athrow         
        //   627: goto            631
        //   630: athrow         
        //   631: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   634: goto            638
        //   637: athrow         
        //   638: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RED:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   641: goto            645
        //   644: athrow         
        //   645: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   648: goto            652
        //   651: athrow         
        //   652: ldc             "\u23bf\u14aa\u8ae1\ub1dd\ucf83\uedf8\ub236\ue6c6\udb39\uefbe\ua736\u1e58\ue1a7\uc7bf\u8739\u8922\u57a5\u7746\ubf24\uc603\u2b01\uc23e\u6a42\u2f07\ud1c6\u3595\u7d2c\u89aa\u820c\u8a9e\u84b1\ufb35\u7090"
        //   654: goto            658
        //   657: athrow         
        //   658: invokestatic    invokestatic   !!! ERROR
        //   661: goto            665
        //   664: athrow         
        //   665: getstatic       dev/nuker/pyro/fc.0:I
        //   668: ifeq            676
        //   671: ldc             -477001393
        //   673: goto            678
        //   676: ldc             2101371044
        //   678: ldc             1564913383
        //   680: ixor           
        //   681: lookupswitch {
        //          -1093195864: 2450
        //          854725983: 676
        //          default: 708
        //        }
        //   708: goto            712
        //   711: athrow         
        //   712: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   715: goto            719
        //   718: athrow         
        //   719: goto            723
        //   722: athrow         
        //   723: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   726: goto            730
        //   729: athrow         
        //   730: goto            734
        //   733: athrow         
        //   734: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   737: goto            741
        //   740: athrow         
        //   741: aload_0        
        //   742: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/fw;
        //   745: iconst_0       
        //   746: goto            750
        //   749: athrow         
        //   750: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   753: goto            757
        //   756: athrow         
        //   757: goto            761
        //   760: athrow         
        //   761: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   764: goto            768
        //   767: athrow         
        //   768: return         
        //   769: new             Lnet/minecraft/util/math/BlockPos;
        //   772: dup            
        //   773: aload_0        
        //   774: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   777: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   780: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   783: goto            787
        //   786: athrow         
        //   787: invokestatic    java/lang/Math.floor:(D)D
        //   790: goto            794
        //   793: athrow         
        //   794: getstatic       dev/nuker/pyro/fc.1:I
        //   797: ifeq            805
        //   800: ldc             1807354736
        //   802: goto            807
        //   805: ldc             -527469461
        //   807: ldc             -2057921109
        //   809: ixor           
        //   810: lookupswitch {
        //          -286484773: 2484
        //          1395393419: 805
        //          default: 836
        //        }
        //   836: aload_0        
        //   837: getstatic       dev/nuker/pyro/fc.1:I
        //   840: ifeq            848
        //   843: ldc             -118483497
        //   845: goto            850
        //   848: ldc             1789068107
        //   850: ldc             -1849717261
        //   852: ixor           
        //   853: lookupswitch {
        //          -577915781: 848
        //          1766823972: 2472
        //          default: 880
        //        }
        //   880: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   883: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   886: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   889: goto            893
        //   892: athrow         
        //   893: invokestatic    java/lang/Math.floor:(D)D
        //   896: goto            900
        //   899: athrow         
        //   900: getstatic       dev/nuker/pyro/fc.0:I
        //   903: ifeq            911
        //   906: ldc             1829256970
        //   908: goto            913
        //   911: ldc             1523618319
        //   913: ldc             1009670011
        //   915: ixor           
        //   916: lookupswitch {
        //          1361471601: 911
        //          1727972724: 944
        //          default: 2464
        //        }
        //   944: aload_0        
        //   945: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   948: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   951: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   954: goto            958
        //   957: athrow         
        //   958: invokestatic    java/lang/Math.floor:(D)D
        //   961: goto            965
        //   964: athrow         
        //   965: goto            969
        //   968: athrow         
        //   969: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   972: goto            976
        //   975: athrow         
        //   976: astore_3       
        //   977: aload_3        
        //   978: goto            982
        //   981: athrow         
        //   982: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   985: goto            989
        //   988: athrow         
        //   989: astore          4
        //   991: getstatic       dev/nuker/pyro/fc.1:I
        //   994: ifeq            1002
        //   997: ldc             418102860
        //   999: goto            1004
        //  1002: ldc             712580477
        //  1004: ldc             -1349259625
        //  1006: ixor           
        //  1007: lookupswitch {
        //          -1593780717: 1002
        //          -1216851749: 2458
        //          default: 1032
        //        }
        //  1032: aload_3        
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: getstatic       net/minecraft/init/Blocks.field_150321_G:Lnet/minecraft/block/Block;
        //  1047: goto            1051
        //  1050: athrow         
        //  1051: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1054: goto            1058
        //  1057: athrow         
        //  1058: istore          5
        //  1060: iload           5
        //  1062: ifeq            1255
        //  1065: aload_0        
        //  1066: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0a;
        //  1069: goto            1073
        //  1072: athrow         
        //  1073: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1076: goto            1080
        //  1079: athrow         
        //  1080: checkcast       Ljava/lang/Boolean;
        //  1083: getstatic       dev/nuker/pyro/fc.c:I
        //  1086: ifge            1094
        //  1089: ldc             1871722394
        //  1091: goto            1096
        //  1094: ldc             -1909417058
        //  1096: ldc             -267360363
        //  1098: ixor           
        //  1099: lookupswitch {
        //          -1644562763: 1094
        //          -1618980849: 2432
        //          default: 1124
        //        }
        //  1124: goto            1128
        //  1127: athrow         
        //  1128: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1131: goto            1135
        //  1134: athrow         
        //  1135: ifne            1255
        //  1138: getstatic       dev/nuker/pyro/fc.1:I
        //  1141: ifeq            1149
        //  1144: ldc             1750066177
        //  1146: goto            1151
        //  1149: ldc             540669922
        //  1151: ldc_w           1298110578
        //  1154: ixor           
        //  1155: lookupswitch {
        //          621837427: 2462
        //          1208850241: 1149
        //          default: 1180
        //        }
        //  1180: aload_0        
        //  1181: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/fw;
        //  1184: iconst_0       
        //  1185: getstatic       dev/nuker/pyro/fc.0:I
        //  1188: ifeq            1197
        //  1191: ldc_w           -197938225
        //  1194: goto            1200
        //  1197: ldc_w           1216403553
        //  1200: ldc_w           -1793413456
        //  1203: ixor           
        //  1204: lookupswitch {
        //          661484723: 1197
        //          1630084479: 2470
        //          default: 1232
        //        }
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1239: goto            1243
        //  1242: athrow         
        //  1243: goto            1247
        //  1246: athrow         
        //  1247: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1250: goto            1254
        //  1253: athrow         
        //  1254: return         
        //  1255: aload_0        
        //  1256: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0a;
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1266: goto            1270
        //  1269: athrow         
        //  1270: checkcast       Ljava/lang/Boolean;
        //  1273: getstatic       dev/nuker/pyro/fc.c:I
        //  1276: ifge            1285
        //  1279: ldc_w           -387347812
        //  1282: goto            1288
        //  1285: ldc_w           1946107959
        //  1288: ldc_w           1047017731
        //  1291: ixor           
        //  1292: lookupswitch {
        //          -696142945: 1285
        //          1301772596: 1320
        //          default: 2444
        //        }
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1327: goto            1331
        //  1330: athrow         
        //  1331: ifeq            1523
        //  1334: iload           5
        //  1336: ifeq            1523
        //  1339: aload           4
        //  1341: goto            1345
        //  1344: athrow         
        //  1345: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  1348: goto            1352
        //  1351: athrow         
        //  1352: getstatic       net/minecraft/init/Blocks.field_150321_G:Lnet/minecraft/block/Block;
        //  1355: goto            1359
        //  1358: athrow         
        //  1359: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: ifeq            1375
        //  1369: ldc_w           402420497
        //  1372: goto            1378
        //  1375: ldc_w           402420498
        //  1378: ldc_w           1497539992
        //  1381: ixor           
        //  1382: tableswitch {
        //          -1652708078: 1404
        //          -1652708077: 1523
        //          default: 1369
        //        }
        //  1404: getstatic       dev/nuker/pyro/fc.0:I
        //  1407: ifeq            1416
        //  1410: ldc_w           1352023947
        //  1413: goto            1419
        //  1416: ldc_w           -1835240904
        //  1419: ldc_w           484913220
        //  1422: ixor           
        //  1423: lookupswitch {
        //          30406636: 1416
        //          1282478031: 2454
        //          default: 1448
        //        }
        //  1448: aload_0        
        //  1449: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/fw;
        //  1452: iconst_0       
        //  1453: getstatic       dev/nuker/pyro/fc.c:I
        //  1456: ifge            1465
        //  1459: ldc_w           1072835943
        //  1462: goto            1468
        //  1465: ldc_w           1554691940
        //  1468: ldc_w           -214316376
        //  1471: ixor           
        //  1472: lookupswitch {
        //          -1349288500: 1500
        //          -859052081: 1465
        //          default: 2478
        //        }
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: goto            1515
        //  1514: athrow         
        //  1515: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1518: goto            1522
        //  1521: athrow         
        //  1522: return         
        //  1523: getstatic       dev/nuker/pyro/fc.c:I
        //  1526: ifge            1535
        //  1529: ldc_w           1250564960
        //  1532: goto            1538
        //  1535: ldc_w           -524267489
        //  1538: ldc_w           -928390327
        //  1541: ixor           
        //  1542: lookupswitch {
        //          -2111571927: 2452
        //          1315286747: 1535
        //          default: 1568
        //        }
        //  1568: aload_0        
        //  1569: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0f;
        //  1572: goto            1576
        //  1575: athrow         
        //  1576: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  1579: goto            1583
        //  1582: athrow         
        //  1583: checkcast       Ldev/nuker/pyro/f5A;
        //  1586: getstatic       dev/nuker/pyro/fc.c:I
        //  1589: ifge            1598
        //  1592: ldc_w           19165344
        //  1595: goto            1601
        //  1598: ldc_w           1980234348
        //  1601: ldc_w           1938649218
        //  1604: ixor           
        //  1605: lookupswitch {
        //          92965614: 1632
        //          1923678242: 1598
        //          default: 2480
        //        }
        //  1632: getstatic       dev/nuker/pyro/f5A.0:Ldev/nuker/pyro/f5A;
        //  1635: goto            1639
        //  1638: athrow         
        //  1639: invokevirtual   dev/nuker/pyro/f5A.equals:(Ljava/lang/Object;)Z
        //  1642: goto            1646
        //  1645: athrow         
        //  1646: ifeq            2285
        //  1649: iconst_0       
        //  1650: istore          6
        //  1652: aload_0        
        //  1653: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //  1656: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1659: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //  1662: goto            1666
        //  1665: athrow         
        //  1666: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1671: goto            1675
        //  1674: athrow         
        //  1675: astore          7
        //  1677: aload           7
        //  1679: goto            1683
        //  1682: athrow         
        //  1683: invokeinterface java/util/Iterator.hasNext:()Z
        //  1688: goto            1692
        //  1691: athrow         
        //  1692: ifeq            1701
        //  1695: ldc_w           1543799195
        //  1698: goto            1704
        //  1701: ldc_w           1543799194
        //  1704: ldc_w           1362247959
        //  1707: ixor           
        //  1708: tableswitch {
        //          443384088: 1732
        //          443384089: 2245
        //          default: 1695
        //        }
        //  1732: aload           7
        //  1734: goto            1738
        //  1737: athrow         
        //  1738: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1750: getstatic       dev/nuker/pyro/fc.c:I
        //  1753: ifge            1762
        //  1756: ldc_w           -1002348647
        //  1759: goto            1765
        //  1762: ldc_w           1004317429
        //  1765: ldc_w           623314080
        //  1768: ixor           
        //  1769: lookupswitch {
        //          -926034722: 1762
        //          -513385671: 2466
        //          default: 1796
        //        }
        //  1796: astore          8
        //  1798: aload           8
        //  1800: instanceof      Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1803: ifne            1677
        //  1806: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1809: aload           8
        //  1811: goto            1815
        //  1814: athrow         
        //  1815: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  1818: goto            1822
        //  1821: athrow         
        //  1822: ifne            1677
        //  1825: aload           8
        //  1827: goto            1831
        //  1830: athrow         
        //  1831: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70005_c_:()Ljava/lang/String;
        //  1834: goto            1838
        //  1837: athrow         
        //  1838: getstatic       dev/nuker/pyro/fc.0:I
        //  1841: ifeq            1850
        //  1844: ldc_w           499369158
        //  1847: goto            1853
        //  1850: ldc_w           -658927998
        //  1853: ldc_w           1765321623
        //  1856: ixor           
        //  1857: lookupswitch {
        //          245125494: 1850
        //          1962635089: 2446
        //          default: 1884
        //        }
        //  1884: aload_0        
        //  1885: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //  1888: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1891: getstatic       dev/nuker/pyro/fc.0:I
        //  1894: ifeq            1903
        //  1897: ldc_w           -1997005837
        //  1900: goto            1906
        //  1903: ldc_w           -1873238142
        //  1906: ldc_w           -1820947935
        //  1909: ixor           
        //  1910: lookupswitch {
        //          53357987: 1936
        //          462328274: 1903
        //          default: 2476
        //        }
        //  1936: goto            1940
        //  1939: athrow         
        //  1940: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70005_c_:()Ljava/lang/String;
        //  1943: goto            1947
        //  1946: athrow         
        //  1947: goto            1951
        //  1950: athrow         
        //  1951: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1954: goto            1958
        //  1957: athrow         
        //  1958: ifeq            1964
        //  1961: goto            1677
        //  1964: getstatic       dev/nuker/pyro/fc.0:I
        //  1967: ifeq            1976
        //  1970: ldc_w           972580999
        //  1973: goto            1979
        //  1976: ldc_w           -1718188087
        //  1979: ldc_w           -1545200861
        //  1982: ixor           
        //  1983: lookupswitch {
        //          -1709280348: 1976
        //          980458730: 2008
        //          default: 2482
        //        }
        //  2008: aload_0        
        //  2009: getstatic       dev/nuker/pyro/fc.1:I
        //  2012: ifeq            2021
        //  2015: ldc_w           -1244776873
        //  2018: goto            2024
        //  2021: ldc_w           -5404597
        //  2024: ldc_w           -940237728
        //  2027: ixor           
        //  2028: lookupswitch {
        //          945329195: 2056
        //          1916480055: 2021
        //          default: 2438
        //        }
        //  2056: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //  2059: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2062: aload           8
        //  2064: goto            2068
        //  2067: athrow         
        //  2068: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //  2071: goto            2075
        //  2074: athrow         
        //  2075: f2d            
        //  2076: aload_0        
        //  2077: getstatic       dev/nuker/pyro/fc.0:I
        //  2080: ifeq            2089
        //  2083: ldc_w           804724608
        //  2086: goto            2092
        //  2089: ldc_w           109411069
        //  2092: ldc_w           11883448
        //  2095: ixor           
        //  2096: lookupswitch {
        //          103819589: 2124
        //          792874040: 2089
        //          default: 2448
        //        }
        //  2124: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0d;
        //  2127: getstatic       dev/nuker/pyro/fc.c:I
        //  2130: ifge            2139
        //  2133: ldc_w           1130404933
        //  2136: goto            2142
        //  2139: ldc_w           1360794330
        //  2142: ldc_w           -1986014433
        //  2145: ixor           
        //  2146: lookupswitch {
        //          -889237670: 2139
        //          -662453819: 2172
        //          default: 2456
        //        }
        //  2172: goto            2176
        //  2175: athrow         
        //  2176: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2179: goto            2183
        //  2182: athrow         
        //  2183: checkcast       Ljava/lang/Double;
        //  2186: goto            2190
        //  2189: athrow         
        //  2190: invokevirtual   java/lang/Double.doubleValue:()D
        //  2193: goto            2197
        //  2196: athrow         
        //  2197: dcmpg          
        //  2198: ifgt            2207
        //  2201: ldc_w           -1219778573
        //  2204: goto            2210
        //  2207: ldc_w           -1219778576
        //  2210: ldc_w           2136186050
        //  2213: ixor           
        //  2214: tableswitch {
        //          -1875872158: 2236
        //          -1875872157: 2242
        //          default: 2201
        //        }
        //  2236: iconst_1       
        //  2237: istore          6
        //  2239: goto            2245
        //  2242: goto            1677
        //  2245: iload           6
        //  2247: ifne            2256
        //  2250: ldc_w           7224485
        //  2253: goto            2259
        //  2256: ldc_w           7224484
        //  2259: ldc_w           1505129891
        //  2262: ixor           
        //  2263: tableswitch {
        //          -1280273908: 2284
        //          -1280273907: 2285
        //          default: 2250
        //        }
        //  2284: return         
        //  2285: getstatic       dev/nuker/pyro/fc.0:I
        //  2288: ifeq            2297
        //  2291: ldc_w           721723344
        //  2294: goto            2300
        //  2297: ldc_w           736829737
        //  2300: ldc_w           1358810890
        //  2303: ixor           
        //  2304: lookupswitch {
        //          -90672307: 2297
        //          2079936730: 2460
        //          default: 2332
        //        }
        //  2332: aload_1        
        //  2333: goto            2337
        //  2336: athrow         
        //  2337: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  2340: goto            2344
        //  2343: athrow         
        //  2344: aload_1        
        //  2345: ldc_w           90.0
        //  2348: goto            2352
        //  2351: athrow         
        //  2352: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  2355: goto            2359
        //  2358: athrow         
        //  2359: aload_1        
        //  2360: aload_0        
        //  2361: iload_2        
        //  2362: iload           5
        //  2364: aload           4
        //  2366: aload_3        
        //  2367: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5B;IZLnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Ljava/util/function/Consumer;
        //  2372: getstatic       dev/nuker/pyro/fc.1:I
        //  2375: ifeq            2384
        //  2378: ldc_w           2105253702
        //  2381: goto            2387
        //  2384: ldc_w           -1368297651
        //  2387: ldc_w           371701524
        //  2390: ixor           
        //  2391: lookupswitch {
        //          1079388711: 2384
        //          1801201746: 2468
        //          default: 2416
        //        }
        //  2416: goto            2420
        //  2419: athrow         
        //  2420: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  2423: goto            2427
        //  2426: athrow         
        //  2427: return         
        //  2428: aconst_null    
        //  2429: athrow         
        //  2430: aconst_null    
        //  2431: athrow         
        //  2432: aconst_null    
        //  2433: athrow         
        //  2434: aconst_null    
        //  2435: athrow         
        //  2436: aconst_null    
        //  2437: athrow         
        //  2438: aconst_null    
        //  2439: athrow         
        //  2440: aconst_null    
        //  2441: athrow         
        //  2442: aconst_null    
        //  2443: athrow         
        //  2444: aconst_null    
        //  2445: athrow         
        //  2446: aconst_null    
        //  2447: athrow         
        //  2448: aconst_null    
        //  2449: athrow         
        //  2450: aconst_null    
        //  2451: athrow         
        //  2452: aconst_null    
        //  2453: athrow         
        //  2454: aconst_null    
        //  2455: athrow         
        //  2456: aconst_null    
        //  2457: athrow         
        //  2458: aconst_null    
        //  2459: athrow         
        //  2460: aconst_null    
        //  2461: athrow         
        //  2462: aconst_null    
        //  2463: athrow         
        //  2464: aconst_null    
        //  2465: athrow         
        //  2466: aconst_null    
        //  2467: athrow         
        //  2468: aconst_null    
        //  2469: athrow         
        //  2470: aconst_null    
        //  2471: athrow         
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
        //  2486: pop            
        //  2487: goto            24
        //  2490: pop            
        //  2491: aconst_null    
        //  2492: goto            2486
        //  2495: dup            
        //  2496: ifnull          2486
        //  2499: checkcast       Ljava/lang/Throwable;
        //  2502: athrow         
        //  2503: dup            
        //  2504: ifnull          2490
        //  2507: checkcast       Ljava/lang/Throwable;
        //  2510: athrow         
        //  2511: aconst_null    
        //  2512: athrow         
        //    StackMapTable: 01 84 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 00 38 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 02 07 00 03 07 00 38 00 01 07 00 38 45 07 00 36 40 07 00 3D 05 04 41 01 1A 43 07 00 15 40 07 00 38 45 07 00 36 40 01 02 00 45 07 00 36 40 07 01 9D 45 07 00 36 40 01 FC 00 0B 01 41 01 1B FF 00 16 00 03 07 00 03 07 00 38 01 00 03 07 00 56 08 00 9C 08 00 9C FF 00 01 00 03 07 00 03 07 00 38 01 00 04 07 00 56 08 00 9C 08 00 9C 01 FF 00 1E 00 03 07 00 03 07 00 38 01 00 03 07 00 56 08 00 9C 08 00 9C 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 08 00 9C 08 00 9C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C FF 00 0C 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 07 00 56 07 00 5C 07 01 58 01 FF 00 1D 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C FF 00 0D 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 00 75 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 07 00 56 07 00 5C 07 00 75 01 FF 00 1D 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 00 75 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 00 75 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 44 07 00 11 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 01 58 45 07 00 36 00 0A 41 01 1D 47 07 00 17 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 07 00 94 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 07 00 94 45 07 00 36 00 00 46 07 00 36 40 07 00 A1 45 07 00 36 40 07 00 F4 45 07 00 36 40 07 00 94 45 07 00 36 40 01 54 07 00 CA FF 00 01 00 03 07 00 03 07 00 38 01 00 02 07 00 CA 01 5B 07 00 CA FF 00 05 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 CA 07 01 9D 45 07 00 36 40 01 4C 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 08 02 2C 08 02 2C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C FF 00 0C 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 07 00 56 07 00 5C 07 01 58 01 FF 00 1D 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 00 75 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 44 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 0A 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 07 00 56 07 00 5C 07 01 58 01 FF 00 1D 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 00 5C 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 01 58 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 56 07 01 58 45 07 00 36 00 47 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 01 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 07 00 94 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 02 07 00 9A 07 00 94 45 07 00 36 00 00 FF 00 10 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 08 03 01 08 03 01 03 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 08 03 01 08 03 01 03 FF 00 0A 00 03 07 00 03 07 00 38 01 00 03 08 03 01 08 03 01 03 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 01 FF 00 1C 00 03 07 00 03 07 00 38 01 00 03 08 03 01 08 03 01 03 FF 00 0B 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 38 01 00 05 08 03 01 08 03 01 03 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 07 00 03 FF 00 0B 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 03 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 03 FF 00 0A 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 03 FF 00 01 00 03 07 00 03 07 00 38 01 00 05 08 03 01 08 03 01 03 03 01 FF 00 1E 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 03 FF 00 0C 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 05 08 03 01 08 03 01 03 03 03 45 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 05 08 03 01 08 03 01 03 03 03 42 07 00 36 FF 00 00 00 03 07 00 03 07 00 38 01 00 05 08 03 01 08 03 01 03 03 03 45 07 00 36 40 07 00 C8 FF 00 04 00 04 07 00 03 07 00 38 01 07 00 C8 00 01 07 00 36 40 07 00 C8 45 07 00 36 40 07 00 C8 FC 00 0C 07 00 C8 41 01 1B 43 07 00 36 40 07 00 C8 45 07 00 36 40 07 01 9D 45 07 00 27 FF 00 00 00 05 07 00 03 07 00 38 01 07 00 C8 07 00 C8 00 02 07 01 9D 07 01 9D 45 07 00 36 40 01 FF 00 0D 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 01 07 00 36 40 07 00 A1 45 07 00 36 40 07 00 F4 4D 07 00 94 FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 94 01 5B 07 00 94 42 07 00 36 40 07 00 94 45 07 00 36 40 01 0D 41 01 1C FF 00 10 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 FF 00 02 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 03 07 00 9A 01 01 FF 00 1F 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 42 07 00 25 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 45 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 07 00 94 42 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 07 00 94 45 07 00 36 00 00 46 07 00 36 40 07 00 A1 45 07 00 36 40 07 00 F4 4E 07 00 94 FF 00 02 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 94 01 5F 07 00 94 42 07 00 25 40 07 00 94 45 07 00 36 40 01 4C 07 00 36 40 07 00 C8 45 07 00 36 40 07 01 9D 45 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 01 9D 07 01 9D 45 07 00 36 40 01 02 05 42 01 19 0B 42 01 1C FF 00 10 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 FF 00 02 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 03 07 00 9A 01 01 FF 00 1F 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 45 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 07 00 94 42 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 07 00 94 45 07 00 36 00 00 0B 42 01 1D 46 07 00 2F 40 07 01 16 45 07 00 36 40 07 00 F4 4E 07 01 19 FF 00 02 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 01 19 01 5E 07 01 19 45 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 01 19 07 01 19 45 07 00 36 40 01 FF 00 12 00 07 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 00 01 07 00 36 40 07 01 2C 47 07 00 36 40 07 01 32 FC 00 01 07 01 32 44 07 00 1D 40 07 01 32 47 07 00 36 40 01 02 05 42 01 1B 44 07 00 27 40 07 01 32 47 07 00 36 40 07 00 F4 4E 07 01 3D FF 00 02 00 08 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 00 02 07 01 3D 01 5E 07 01 3D FF 00 11 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 01 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 48 07 01 3D 45 07 00 36 40 01 47 07 00 36 40 07 01 3D 45 07 00 36 40 07 01 58 4B 07 01 58 FF 00 02 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 01 5E 07 01 58 FF 00 12 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 00 CA FF 00 02 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 03 07 01 58 07 00 CA 01 FF 00 1D 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 00 CA 42 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 00 CA 45 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 01 58 42 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 01 58 45 07 00 36 40 01 05 0B 42 01 1C 4C 07 00 03 FF 00 02 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 00 03 01 5F 07 00 03 4A 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 00 CA 07 01 3D 45 07 00 36 40 02 FF 00 0D 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 00 03 FF 00 02 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 03 03 07 00 03 01 FF 00 1F 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 00 03 FF 00 0E 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 01 6D FF 00 02 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 03 03 07 01 6D 01 FF 00 1D 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 01 6D 42 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 01 6D 45 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 00 F4 45 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 01 70 45 07 00 36 FF 00 00 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 03 03 05 42 01 19 05 FA 00 02 04 05 42 01 18 F9 00 00 0B 42 01 1F 43 07 00 36 40 07 00 38 45 07 00 36 00 46 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 38 02 45 07 00 36 00 FF 00 18 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 38 07 01 9F FF 00 02 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 03 07 00 38 07 01 9F 01 FF 00 1C 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 38 07 01 9F 42 07 00 36 FF 00 00 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 38 07 01 9F 45 07 00 36 00 FF 00 00 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 01 FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 01 07 00 94 FF 00 01 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FF 00 01 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 00 75 FF 00 01 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 38 01 00 03 07 00 56 08 00 9C 08 00 9C 41 07 00 CA FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 01 07 00 94 FF 00 01 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 01 07 01 58 FF 00 01 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 38 01 00 03 07 00 56 07 00 5C 07 01 58 FE 00 01 07 00 C8 07 00 C8 01 01 FF 00 01 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 03 07 01 6D FF 00 01 00 05 07 00 03 07 00 38 01 07 00 C8 07 00 C8 00 00 FC 00 01 01 01 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 03 FF 00 01 00 08 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 00 01 07 01 3D FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 38 07 01 9F FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 FF 00 01 00 03 07 00 03 07 00 38 01 00 04 08 03 01 08 03 01 03 07 00 03 01 FF 00 01 00 09 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 01 07 01 32 07 01 3D 00 02 07 01 58 07 00 CA FF 00 01 00 06 07 00 03 07 00 38 01 07 00 C8 07 00 C8 01 00 02 07 00 9A 01 41 07 01 19 FE 00 01 01 07 01 32 07 01 3D FF 00 01 00 03 07 00 03 07 00 38 01 00 03 08 03 01 08 03 01 03 FF 00 01 00 02 07 00 03 07 00 38 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2495   2503   Ljava/util/NoSuchElementException;
        //  2495   2503   2495   2503   Ljava/lang/IndexOutOfBoundsException;
        //  2511   2513   3      8      Any
        //  29     35     35     36     Any
        //  29     35     35     36     Any
        //  29     35     35     36     Any
        //  29     35     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  29     35     35     36     Any
        //  80     87     87     88     Any
        //  80     87     80     81     Ljava/lang/StringIndexOutOfBoundsException;
        //  80     87     80     81     Ljava/lang/StringIndexOutOfBoundsException;
        //  81     87     3      8      Any
        //  80     87     87     88     Ljava/util/NoSuchElementException;
        //  98     105    105    106    Any
        //  98     105    98     99     Ljava/util/NoSuchElementException;
        //  98     105    98     99     Any
        //  99     105    3      8      Any
        //  98     105    105    106    Any
        //  207    214    214    215    Any
        //  208    214    207    208    Ljava/util/NoSuchElementException;
        //  208    214    207    208    Any
        //  207    214    207    208    Any
        //  207    214    3      8      Any
        //  263    270    270    271    Any
        //  263    270    3      8      Any
        //  264    270    270    271    Ljava/lang/IndexOutOfBoundsException;
        //  264    270    270    271    Ljava/lang/NegativeArraySizeException;
        //  263    270    263    264    Any
        //  274    281    281    282    Any
        //  274    281    3      8      Ljava/lang/IllegalStateException;
        //  275    281    3      8      Any
        //  274    281    274    275    Ljava/lang/IllegalArgumentException;
        //  275    281    274    275    Any
        //  332    338    338    339    Any
        //  332    338    338    339    Ljava/lang/NegativeArraySizeException;
        //  332    338    338    339    Ljava/lang/EnumConstantNotPresentException;
        //  332    338    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  332    338    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  344    351    351    352    Any
        //  344    351    351    352    Ljava/util/ConcurrentModificationException;
        //  344    351    3      8      Ljava/lang/NegativeArraySizeException;
        //  345    351    3      8      Any
        //  344    351    344    345    Ljava/util/NoSuchElementException;
        //  355    362    362    363    Any
        //  355    362    362    363    Any
        //  355    362    355    356    Any
        //  356    362    3      8      Ljava/lang/ArithmeticException;
        //  356    362    355    356    Ljava/lang/IllegalArgumentException;
        //  367    373    373    374    Any
        //  367    373    373    374    Any
        //  367    373    373    374    Ljava/lang/UnsupportedOperationException;
        //  367    373    373    374    Ljava/lang/IndexOutOfBoundsException;
        //  367    373    3      8      Any
        //  377    384    384    385    Any
        //  378    384    3      8      Any
        //  377    384    384    385    Any
        //  378    384    3      8      Any
        //  377    384    377    378    Any
        //  436    443    443    444    Any
        //  437    443    3      8      Any
        //  436    443    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  436    443    436    437    Ljava/lang/NegativeArraySizeException;
        //  437    443    443    444    Any
        //  447    454    454    455    Any
        //  447    454    454    455    Ljava/lang/RuntimeException;
        //  448    454    3      8      Any
        //  448    454    454    455    Any
        //  447    454    447    448    Any
        //  463    470    470    471    Any
        //  463    470    463    464    Any
        //  464    470    470    471    Any
        //  464    470    470    471    Ljava/lang/AssertionError;
        //  464    470    463    464    Any
        //  477    484    484    485    Any
        //  477    484    477    478    Any
        //  478    484    484    485    Any
        //  478    484    477    478    Any
        //  477    484    484    485    Any
        //  543    549    549    550    Any
        //  543    549    3      8      Any
        //  543    549    3      8      Ljava/lang/NumberFormatException;
        //  543    549    3      8      Ljava/lang/IllegalStateException;
        //  543    549    3      8      Any
        //  563    570    570    571    Any
        //  564    570    3      8      Ljava/lang/NullPointerException;
        //  564    570    570    571    Any
        //  563    570    563    564    Any
        //  563    570    570    571    Any
        //  620    626    626    627    Any
        //  620    626    626    627    Ljava/lang/IllegalArgumentException;
        //  620    626    626    627    Any
        //  620    626    626    627    Any
        //  620    626    3      8      Any
        //  631    637    637    638    Any
        //  631    637    637    638    Ljava/util/ConcurrentModificationException;
        //  631    637    637    638    Ljava/lang/IndexOutOfBoundsException;
        //  631    637    3      8      Any
        //  631    637    3      8      Ljava/lang/IllegalStateException;
        //  644    651    651    652    Any
        //  645    651    644    645    Ljava/lang/StringIndexOutOfBoundsException;
        //  644    651    651    652    Ljava/lang/NullPointerException;
        //  644    651    644    645    Ljava/util/ConcurrentModificationException;
        //  644    651    644    645    Any
        //  657    664    664    665    Any
        //  658    664    664    665    Ljava/lang/ArithmeticException;
        //  658    664    657    658    Any
        //  657    664    664    665    Any
        //  658    664    3      8      Any
        //  711    718    718    719    Any
        //  711    718    711    712    Any
        //  712    718    711    712    Ljava/lang/NegativeArraySizeException;
        //  711    718    3      8      Any
        //  712    718    711    712    Any
        //  722    729    729    730    Any
        //  723    729    3      8      Any
        //  722    729    3      8      Any
        //  723    729    3      8      Any
        //  723    729    722    723    Any
        //  733    740    740    741    Any
        //  734    740    733    734    Any
        //  733    740    740    741    Ljava/lang/StringIndexOutOfBoundsException;
        //  733    740    3      8      Ljava/util/NoSuchElementException;
        //  733    740    740    741    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  749    756    756    757    Any
        //  750    756    3      8      Ljava/lang/IllegalArgumentException;
        //  750    756    749    750    Any
        //  749    756    749    750    Ljava/lang/IllegalArgumentException;
        //  749    756    3      8      Any
        //  760    767    767    768    Any
        //  760    767    767    768    Any
        //  761    767    3      8      Any
        //  761    767    767    768    Ljava/lang/UnsupportedOperationException;
        //  761    767    760    761    Any
        //  787    793    793    794    Any
        //  787    793    3      8      Ljava/lang/ArithmeticException;
        //  787    793    793    794    Any
        //  787    793    3      8      Any
        //  787    793    3      8      Ljava/lang/ClassCastException;
        //  893    899    899    900    Any
        //  893    899    899    900    Ljava/lang/ClassCastException;
        //  893    899    899    900    Any
        //  893    899    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  893    899    899    900    Ljava/lang/IllegalStateException;
        //  958    964    964    965    Any
        //  958    964    964    965    Any
        //  958    964    964    965    Any
        //  958    964    964    965    Ljava/util/NoSuchElementException;
        //  958    964    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  968    975    975    976    Any
        //  968    975    975    976    Ljava/lang/EnumConstantNotPresentException;
        //  969    975    3      8      Ljava/lang/UnsupportedOperationException;
        //  968    975    968    969    Any
        //  969    975    975    976    Ljava/lang/IndexOutOfBoundsException;
        //  981    988    988    989    Any
        //  981    988    981    982    Any
        //  981    988    981    982    Ljava/lang/IllegalArgumentException;
        //  981    988    981    982    Any
        //  981    988    981    982    Any
        //  1036   1043   1043   1044   Any
        //  1037   1043   1036   1037   Ljava/lang/AssertionError;
        //  1037   1043   1036   1037   Any
        //  1037   1043   1043   1044   Ljava/lang/NumberFormatException;
        //  1036   1043   1036   1037   Any
        //  1050   1057   1057   1058   Any
        //  1050   1057   1050   1051   Ljava/lang/RuntimeException;
        //  1051   1057   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1050   1057   1057   1058   Ljava/util/NoSuchElementException;
        //  1050   1057   3      8      Any
        //  1072   1079   1079   1080   Any
        //  1073   1079   3      8      Ljava/lang/IllegalArgumentException;
        //  1072   1079   1072   1073   Ljava/lang/IllegalArgumentException;
        //  1072   1079   1072   1073   Any
        //  1073   1079   3      8      Ljava/util/NoSuchElementException;
        //  1127   1134   1134   1135   Any
        //  1128   1134   1127   1128   Any
        //  1127   1134   3      8      Ljava/lang/NullPointerException;
        //  1127   1134   1127   1128   Any
        //  1128   1134   3      8      Any
        //  1235   1242   1242   1243   Any
        //  1236   1242   1235   1236   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1236   1242   1242   1243   Any
        //  1235   1242   1242   1243   Ljava/lang/RuntimeException;
        //  1235   1242   3      8      Ljava/lang/IllegalStateException;
        //  1246   1253   1253   1254   Any
        //  1247   1253   3      8      Ljava/lang/ClassCastException;
        //  1246   1253   3      8      Ljava/lang/ArithmeticException;
        //  1247   1253   1246   1247   Any
        //  1247   1253   3      8      Ljava/lang/UnsupportedOperationException;
        //  1262   1269   1269   1270   Any
        //  1262   1269   1269   1270   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1263   1269   1262   1263   Any
        //  1262   1269   1269   1270   Ljava/lang/EnumConstantNotPresentException;
        //  1263   1269   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1323   1330   1330   1331   Any
        //  1324   1330   1330   1331   Any
        //  1323   1330   1323   1324   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1324   1330   3      8      Ljava/lang/IllegalStateException;
        //  1323   1330   3      8      Ljava/lang/NegativeArraySizeException;
        //  1344   1351   1351   1352   Any
        //  1344   1351   1351   1352   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1345   1351   3      8      Any
        //  1344   1351   3      8      Ljava/lang/UnsupportedOperationException;
        //  1345   1351   1344   1345   Any
        //  1358   1365   1365   1366   Any
        //  1359   1365   1358   1359   Any
        //  1358   1365   1358   1359   Ljava/util/ConcurrentModificationException;
        //  1358   1365   3      8      Any
        //  1358   1365   3      8      Any
        //  1504   1510   1510   1511   Any
        //  1504   1510   3      8      Any
        //  1504   1510   3      8      Any
        //  1504   1510   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1504   1510   3      8      Ljava/lang/NegativeArraySizeException;
        //  1514   1521   1521   1522   Any
        //  1515   1521   1514   1515   Ljava/lang/RuntimeException;
        //  1515   1521   1514   1515   Any
        //  1514   1521   3      8      Any
        //  1514   1521   3      8      Ljava/lang/IllegalArgumentException;
        //  1575   1582   1582   1583   Any
        //  1575   1582   1575   1576   Ljava/lang/ClassCastException;
        //  1575   1582   3      8      Any
        //  1575   1582   3      8      Any
        //  1576   1582   1582   1583   Ljava/lang/IllegalStateException;
        //  1638   1645   1645   1646   Any
        //  1639   1645   3      8      Any
        //  1639   1645   1645   1646   Any
        //  1639   1645   1638   1639   Any
        //  1638   1645   1638   1639   Ljava/lang/RuntimeException;
        //  1665   1674   1674   1675   Any
        //  1665   1674   1665   1666   Any
        //  1666   1674   1665   1666   Any
        //  1666   1674   3      8      Ljava/lang/IllegalArgumentException;
        //  1666   1674   3      8      Any
        //  1682   1691   1691   1692   Any
        //  1683   1691   3      8      Any
        //  1682   1691   1691   1692   Ljava/lang/NumberFormatException;
        //  1683   1691   1682   1683   Ljava/lang/EnumConstantNotPresentException;
        //  1682   1691   1691   1692   Any
        //  1737   1746   1746   1747   Any
        //  1737   1746   1737   1738   Ljava/util/NoSuchElementException;
        //  1737   1746   1737   1738   Ljava/lang/RuntimeException;
        //  1737   1746   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1738   1746   3      8      Any
        //  1814   1821   1821   1822   Any
        //  1815   1821   3      8      Ljava/lang/IllegalStateException;
        //  1814   1821   1814   1815   Ljava/lang/RuntimeException;
        //  1815   1821   3      8      Any
        //  1815   1821   1814   1815   Any
        //  1830   1837   1837   1838   Any
        //  1831   1837   1837   1838   Any
        //  1831   1837   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1830   1837   3      8      Any
        //  1830   1837   1830   1831   Any
        //  1939   1946   1946   1947   Any
        //  1940   1946   1946   1947   Any
        //  1940   1946   1946   1947   Ljava/lang/NegativeArraySizeException;
        //  1940   1946   1939   1940   Any
        //  1940   1946   3      8      Ljava/util/NoSuchElementException;
        //  1950   1957   1957   1958   Any
        //  1951   1957   1957   1958   Any
        //  1950   1957   3      8      Any
        //  1950   1957   1950   1951   Ljava/lang/NullPointerException;
        //  1951   1957   1950   1951   Any
        //  2067   2074   2074   2075   Any
        //  2067   2074   3      8      Ljava/util/NoSuchElementException;
        //  2067   2074   2067   2068   Any
        //  2067   2074   2067   2068   Any
        //  2068   2074   2067   2068   Any
        //  2175   2182   2182   2183   Any
        //  2176   2182   3      8      Ljava/lang/AssertionError;
        //  2175   2182   2175   2176   Any
        //  2176   2182   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2175   2182   2182   2183   Ljava/lang/ArithmeticException;
        //  2189   2196   2196   2197   Any
        //  2190   2196   2189   2190   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2189   2196   2196   2197   Ljava/lang/StringIndexOutOfBoundsException;
        //  2190   2196   2196   2197   Any
        //  2190   2196   2189   2190   Any
        //  2336   2343   2343   2344   Any
        //  2336   2343   3      8      Any
        //  2337   2343   2336   2337   Ljava/lang/ClassCastException;
        //  2336   2343   2336   2337   Any
        //  2336   2343   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2351   2358   2358   2359   Any
        //  2351   2358   2351   2352   Any
        //  2352   2358   2358   2359   Ljava/util/NoSuchElementException;
        //  2352   2358   3      8      Any
        //  2352   2358   2358   2359   Ljava/lang/NullPointerException;
        //  2419   2426   2426   2427   Any
        //  2420   2426   3      8      Ljava/lang/RuntimeException;
        //  2419   2426   3      8      Any
        //  2419   2426   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2419   2426   2419   2420   Any
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
    
    public f5B() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u23ec\u1496\u8ae2\ub3df\uc9c3\uedfc\ub226"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u23cc\u1496\u8ae2\ub3df\uc9e3\uedfc\ub226"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u23de\u1486\u8afa\ub3d6\uc9d9\uedf8\ub230\ue6ca\ud96b\ue9a6\ua735\u1e40\ue1fe\uc5e7\u8130\u896e\u57a5\u7705\ubd38\uc008\u2b4d\uc23a\u6a4e\u2d41\ud7c0\u3598\u7d6b\u89ac\u8005\u8cc0\u84a6\ufb3d\u70c4\u9a04\u1bd2\uf17e\u4979\u8867\uca92"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: new             Ldev/nuker/pyro/f0f;
        //    26: dup            
        //    27: ldc_w           "\u23f2\u149c\u8aea\ub3dc"
        //    30: invokestatic    invokestatic   !!! ERROR
        //    33: ldc_w           "\u23d2\u149c\u8aea\ub3dc"
        //    36: invokestatic    invokestatic   !!! ERROR
        //    39: aconst_null    
        //    40: getstatic       dev/nuker/pyro/f5A.c:Ldev/nuker/pyro/f5A;
        //    43: getstatic       dev/nuker/pyro/fc.1:I
        //    46: ifeq            55
        //    49: ldc_w           560256517
        //    52: goto            58
        //    55: ldc_w           1685657826
        //    58: ldc_w           912365493
        //    61: ixor           
        //    62: lookupswitch {
        //          -1790138840: 55
        //          386220464: 450
        //          default: 88
        //        }
        //    88: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    91: putfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0f;
        //    94: aload_0        
        //    95: new             Ldev/nuker/pyro/f0d;
        //    98: dup            
        //    99: ldc_w           "\u23fb\u149a\u8afd\ub3cd\uc9d5\uedf7\ub227\ue6c6"
        //   102: invokestatic    invokestatic   !!! ERROR
        //   105: ldc_w           "\u23db\u149a\u8afd\ub3cd\uc9d5\uedf7\ub227\ue6c6"
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: aconst_null    
        //   112: ldc2_w          3.0
        //   115: dconst_0       
        //   116: ldc2_w          5.0
        //   119: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   122: putfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0d;
        //   125: aload_0        
        //   126: new             Ldev/nuker/pyro/f0a;
        //   129: dup            
        //   130: ldc_w           "\u23fb\u149c\u8afb\ub3db\uc9d8\uedfc\ub237"
        //   133: invokestatic    invokestatic   !!! ERROR
        //   136: ldc_w           "\u23db\u149c\u8afb\ub3db\uc9d8\uedfc\ub237"
        //   139: invokestatic    invokestatic   !!! ERROR
        //   142: ldc_w           "\u23de\u149f\u8afd\ub3d6\uc994\uede9\ub228\ue6c2\ud96b\ue9a2\ua72a\u1e0c\ue1e6\uc5e7\u8137\u8967\u57a6\u7746\ubd3c\uc00f\u2b4d\uc222\u6a01\u2d43\ud7d7\u35da\u7d23\u89a8\u8010\u8c84"
        //   145: getstatic       dev/nuker/pyro/fc.0:I
        //   148: ifeq            157
        //   151: ldc_w           -306170437
        //   154: goto            160
        //   157: ldc_w           -1320585695
        //   160: ldc_w           669665389
        //   163: ixor           
        //   164: lookupswitch {
        //          -1767686580: 192
        //          -903184938: 157
        //          default: 446
        //        }
        //   192: invokestatic    invokestatic   !!! ERROR
        //   195: iconst_1       
        //   196: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   199: putfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0a;
        //   202: getstatic       dev/nuker/pyro/fc.1:I
        //   205: ifeq            214
        //   208: ldc_w           -2136714444
        //   211: goto            217
        //   214: ldc_w           -1059777854
        //   217: ldc_w           1570087144
        //   220: ixor           
        //   221: lookupswitch {
        //          -1656704470: 248
        //          -583928868: 214
        //          default: 448
        //        }
        //   248: aload_0        
        //   249: new             Ldev/nuker/pyro/f0a;
        //   252: dup            
        //   253: ldc_w           "\u23f7\u149c\u8ae2\ub3dc\uc9d7\uedf1\ub221\ue6c0\ud963"
        //   256: invokestatic    invokestatic   !!! ERROR
        //   259: ldc_w           "\u23d7\u149c\u8ae2\ub3dc\uc9f7\uedf1\ub221\ue6c0\ud963"
        //   262: invokestatic    invokestatic   !!! ERROR
        //   265: aconst_null    
        //   266: iconst_0       
        //   267: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   270: putfield        dev/nuker/pyro/f5B.0:Ldev/nuker/pyro/f0a;
        //   273: getstatic       dev/nuker/pyro/fc.c:I
        //   276: ifge            285
        //   279: ldc_w           984485165
        //   282: goto            288
        //   285: ldc_w           -945258985
        //   288: ldc_w           1244598422
        //   291: ixor           
        //   292: lookupswitch {
        //          -1920504191: 320
        //          1887509947: 285
        //          default: 454
        //        }
        //   320: aload_0        
        //   321: aload_0        
        //   322: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0f;
        //   325: invokevirtual   dev/nuker/pyro/f5B.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   328: pop            
        //   329: aload_0        
        //   330: aload_0        
        //   331: getstatic       dev/nuker/pyro/fc.c:I
        //   334: ifge            343
        //   337: ldc_w           1395814883
        //   340: goto            346
        //   343: ldc_w           -286271544
        //   346: ldc_w           316834156
        //   349: ixor           
        //   350: lookupswitch {
        //          -66234716: 376
        //          1104212111: 343
        //          default: 452
        //        }
        //   376: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0d;
        //   379: invokevirtual   dev/nuker/pyro/f5B.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   382: pop            
        //   383: aload_0        
        //   384: getstatic       dev/nuker/pyro/fc.1:I
        //   387: ifeq            396
        //   390: ldc_w           -855475248
        //   393: goto            399
        //   396: ldc_w           1360478593
        //   399: ldc_w           944902279
        //   402: ixor           
        //   403: lookupswitch {
        //          -179279017: 396
        //          1766150406: 428
        //          default: 456
        //        }
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f5B.c:Ldev/nuker/pyro/f0a;
        //   432: invokevirtual   dev/nuker/pyro/f5B.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   435: pop            
        //   436: aload_0        
        //   437: aload_0        
        //   438: getfield        dev/nuker/pyro/f5B.0:Ldev/nuker/pyro/f0a;
        //   441: invokevirtual   dev/nuker/pyro/f5B.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   444: pop            
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
        //    StackMapTable: 00 18 FF 00 37 00 01 07 00 03 00 07 07 00 03 08 00 17 08 00 17 07 01 58 07 01 58 05 07 01 19 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 00 17 08 00 17 07 01 58 07 01 58 05 07 01 19 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 00 17 08 00 17 07 01 58 07 01 58 05 07 01 19 FF 00 44 00 01 07 00 03 00 06 07 00 03 08 00 7E 08 00 7E 07 01 58 07 01 58 07 01 58 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 00 7E 08 00 7E 07 01 58 07 01 58 07 01 58 01 FF 00 1F 00 01 07 00 03 00 06 07 00 03 08 00 7E 08 00 7E 07 01 58 07 01 58 07 01 58 15 42 01 1E 24 42 01 1F FF 00 16 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 53 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 11 00 01 07 00 03 00 06 07 00 03 08 00 7E 08 00 7E 07 01 58 07 01 58 07 01 58 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 17 08 00 17 07 01 58 07 01 58 05 07 01 19 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 01 41 07 00 03
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
    
    static {
        throw t;
    }
    
    public void c(final int p0, final boolean p1, final BlockPos p2, final BlockPos p3, final EntityPlayerSP p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          438
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            430
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            422
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //    34: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //    37: istore          6
        //    39: getstatic       dev/nuker/pyro/fc.c:I
        //    42: ifge            51
        //    45: ldc_w           1047658355
        //    48: goto            54
        //    51: ldc_w           1760763051
        //    54: ldc_w           -1833166995
        //    57: ixor           
        //    58: lookupswitch {
        //          -1395791842: 51
        //          -95482938: 84
        //          default: 407
        //        }
        //    84: aload_0        
        //    85: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //    88: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    91: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //    94: iload_1        
        //    95: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //    98: aload_0        
        //    99: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   102: getstatic       dev/nuker/pyro/fc.1:I
        //   105: ifeq            114
        //   108: ldc_w           2064034340
        //   111: goto            117
        //   114: ldc_w           -1119053562
        //   117: ldc_w           1164202981
        //   120: ixor           
        //   121: lookupswitch {
        //          1030873644: 114
        //          1046673857: 403
        //          default: 148
        //        }
        //   148: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   151: getstatic       dev/nuker/pyro/fc.0:I
        //   154: ifeq            163
        //   157: ldc_w           -15451951
        //   160: goto            166
        //   163: ldc_w           -1105845656
        //   166: ldc_w           1185778456
        //   169: ixor           
        //   170: lookupswitch {
        //          -1179012151: 411
        //          391074175: 163
        //          default: 196
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   203: goto            207
        //   206: athrow         
        //   207: getstatic       dev/nuker/pyro/fc.c:I
        //   210: ifge            219
        //   213: ldc_w           -276608842
        //   216: goto            222
        //   219: ldc_w           -82852352
        //   222: ldc_w           548393563
        //   225: ixor           
        //   226: lookupswitch {
        //          -1150027961: 219
        //          -819160339: 405
        //          default: 252
        //        }
        //   252: iload_2        
        //   253: ifeq            260
        //   256: aload_3        
        //   257: goto            306
        //   260: getstatic       dev/nuker/pyro/fc.1:I
        //   263: ifeq            272
        //   266: ldc_w           -67864389
        //   269: goto            275
        //   272: ldc_w           -828217234
        //   275: ldc_w           1206755159
        //   278: ixor           
        //   279: lookupswitch {
        //          -1486964302: 272
        //          -1139152916: 401
        //          default: 304
        //        }
        //   304: aload           4
        //   306: ldc_w           5.0
        //   309: iconst_1       
        //   310: goto            314
        //   313: athrow         
        //   314: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZ)Ldev/nuker/pyro/fbw;
        //   317: goto            321
        //   320: athrow         
        //   321: pop            
        //   322: aload_0        
        //   323: getstatic       dev/nuker/pyro/fc.c:I
        //   326: ifge            335
        //   329: ldc_w           -450759885
        //   332: goto            338
        //   335: ldc_w           -352250413
        //   338: ldc_w           793406011
        //   341: ixor           
        //   342: lookupswitch {
        //          -1652089517: 335
        //          -898918136: 409
        //          default: 368
        //        }
        //   368: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   371: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   374: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   377: iload           6
        //   379: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   382: aload_0        
        //   383: getfield        dev/nuker/pyro/f5B.c:Lnet/minecraft/client/Minecraft;
        //   386: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   389: goto            393
        //   392: athrow         
        //   393: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   396: goto            400
        //   399: athrow         
        //   400: return         
        //   401: aconst_null    
        //   402: athrow         
        //   403: aconst_null    
        //   404: athrow         
        //   405: aconst_null    
        //   406: athrow         
        //   407: aconst_null    
        //   408: athrow         
        //   409: aconst_null    
        //   410: athrow         
        //   411: aconst_null    
        //   412: athrow         
        //   413: pop            
        //   414: goto            24
        //   417: pop            
        //   418: aconst_null    
        //   419: goto            413
        //   422: dup            
        //   423: ifnull          413
        //   426: checkcast       Ljava/lang/Throwable;
        //   429: athrow         
        //   430: dup            
        //   431: ifnull          417
        //   434: checkcast       Ljava/lang/Throwable;
        //   437: athrow         
        //   438: aconst_null    
        //   439: athrow         
        //    StackMapTable: 00 2F FF 00 03 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 01 07 00 36 FA 00 04 FF 00 0B 00 00 00 01 07 00 36 FF 00 03 00 06 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 00 00 FC 00 1A 01 42 01 1D 5D 07 00 AD FF 00 02 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 02 07 00 AD 01 5E 07 00 AD 4E 07 01 F8 FF 00 02 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 02 07 01 F8 01 5D 07 01 F8 42 07 00 36 40 07 01 F8 45 07 00 36 00 0B 42 01 1D 07 0B 42 01 1C 41 07 00 C8 46 07 00 36 FF 00 00 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 03 07 00 C8 02 01 45 07 00 36 40 07 02 0C 4D 07 00 03 FF 00 02 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 02 07 00 03 01 5D 07 00 03 57 07 00 36 40 07 01 F8 45 07 00 36 00 00 41 07 00 AD 01 01 41 07 00 03 41 07 01 F8 FF 00 01 00 06 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 00 01 07 00 27 43 05 44 07 00 27 47 05 FF 00 07 00 07 07 00 03 01 01 07 00 C8 07 00 C8 07 00 CA 01 00 01 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     422    430    Ljava/lang/IllegalStateException;
        //  422    430    422    430    Ljava/lang/IndexOutOfBoundsException;
        //  438    440    3      8      Any
        //  199    206    206    207    Any
        //  199    206    206    207    Ljava/lang/RuntimeException;
        //  200    206    199    200    Ljava/lang/NullPointerException;
        //  199    206    199    200    Any
        //  199    206    3      8      Ljava/lang/NumberFormatException;
        //  313    320    320    321    Any
        //  313    320    313    314    Any
        //  313    320    320    321    Any
        //  313    320    313    314    Any
        //  313    320    3      8      Any
        //  392    399    399    400    Any
        //  392    399    392    393    Any
        //  392    399    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  393    399    3      8      Ljava/util/NoSuchElementException;
        //  393    399    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 133 out of bounds for length 133
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
}
