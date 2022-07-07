// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4i extends f4C
{
    public String 0;
    
    @Override
    public String 2() {
        return fbS.58(this, 1510384156);
    }
    
    @f06
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1835
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1827
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1819
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             133892496
        //    32: goto            37
        //    35: ldc             -445295057
        //    37: ldc             515205820
        //    39: ixor           
        //    40: lookupswitch {
        //          -1228498488: 35
        //          424567596: 1796
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //    71: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    74: ifnonnull       82
        //    77: ldc             -2001651155
        //    79: goto            84
        //    82: ldc             -2001651158
        //    84: ldc             -1574216330
        //    86: ixor           
        //    87: tableswitch {
        //          1429524150: 108
        //          1429524151: 156
        //          default: 77
        //        }
        //   108: aload_0        
        //   109: ldc             ""
        //   111: getstatic       dev/nuker/pyro/fc.0:I
        //   114: ifeq            122
        //   117: ldc             -960471245
        //   119: goto            124
        //   122: ldc             -1965430171
        //   124: ldc             -175438915
        //   126: ixor           
        //   127: lookupswitch {
        //          860576910: 122
        //          2136140248: 152
        //          default: 1782
        //        }
        //   152: putfield        dev/nuker/pyro/f4i.0:Ljava/lang/String;
        //   155: return         
        //   156: new             Ljava/lang/StringBuilder;
        //   159: dup            
        //   160: ldc             "\u23cf\u14aa\u8adc\ub188"
        //   162: goto            166
        //   165: athrow         
        //   166: invokestatic    invokestatic   !!! ERROR
        //   169: goto            173
        //   172: athrow         
        //   173: goto            177
        //   176: athrow         
        //   177: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   180: goto            184
        //   183: athrow         
        //   184: ldc             "("
        //   186: goto            190
        //   189: athrow         
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: goto            197
        //   196: athrow         
        //   197: getstatic       dev/nuker/pyro/fc.0:I
        //   200: ifeq            208
        //   203: ldc             1558223599
        //   205: goto            210
        //   208: ldc             -7115524
        //   210: ldc             1436204508
        //   212: ixor           
        //   213: lookupswitch {
        //          159000371: 1806
        //          439709096: 208
        //          default: 240
        //        }
        //   240: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   243: getstatic       dev/nuker/pyro/fc.1:I
        //   246: ifeq            254
        //   249: ldc             1975141344
        //   251: goto            256
        //   254: ldc             1476416196
        //   256: ldc             1681129157
        //   258: ixor           
        //   259: lookupswitch {
        //          -330968640: 254
        //          294239525: 1770
        //          default: 284
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   291: goto            295
        //   294: athrow         
        //   295: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //   297: goto            301
        //   300: athrow         
        //   301: invokestatic    invokestatic   !!! ERROR
        //   304: goto            308
        //   307: athrow         
        //   308: iconst_1       
        //   309: anewarray       Ljava/lang/Object;
        //   312: dup            
        //   313: iconst_0       
        //   314: getstatic       dev/nuker/pyro/fc.c:I
        //   317: ifge            325
        //   320: ldc             907739556
        //   322: goto            327
        //   325: ldc             1732544084
        //   327: ldc             -1798000389
        //   329: ixor           
        //   330: lookupswitch {
        //          -1563446945: 325
        //          -208652625: 356
        //          default: 1788
        //        }
        //   356: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //   359: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   362: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   365: getstatic       dev/nuker/pyro/fc.1:I
        //   368: ifeq            376
        //   371: ldc             -99741886
        //   373: goto            378
        //   376: ldc             -1953341982
        //   378: ldc             -274792391
        //   380: ixor           
        //   381: lookupswitch {
        //          361828219: 1800
        //          1684600727: 376
        //          default: 408
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   415: goto            419
        //   418: athrow         
        //   419: aastore        
        //   420: getstatic       dev/nuker/pyro/fc.1:I
        //   423: ifeq            431
        //   426: ldc             1105322125
        //   428: goto            433
        //   431: ldc             922174402
        //   433: ldc             -974858804
        //   435: ixor           
        //   436: lookupswitch {
        //          -2080033471: 1792
        //          -1560901300: 431
        //          default: 464
        //        }
        //   464: goto            468
        //   467: athrow         
        //   468: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   471: goto            475
        //   474: athrow         
        //   475: goto            479
        //   478: athrow         
        //   479: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   482: goto            486
        //   485: athrow         
        //   486: ldc             "\u23bb\u14d3"
        //   488: goto            492
        //   491: athrow         
        //   492: invokestatic    invokestatic   !!! ERROR
        //   495: goto            499
        //   498: athrow         
        //   499: goto            503
        //   502: athrow         
        //   503: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   506: goto            510
        //   509: athrow         
        //   510: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   513: getstatic       dev/nuker/pyro/fc.c:I
        //   516: ifge            524
        //   519: ldc             -1442909358
        //   521: goto            526
        //   524: ldc             1023164540
        //   526: ldc             -1722404821
        //   528: ixor           
        //   529: lookupswitch {
        //          -639851378: 524
        //          816366457: 1802
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   563: goto            567
        //   566: athrow         
        //   567: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //   569: goto            573
        //   572: athrow         
        //   573: invokestatic    invokestatic   !!! ERROR
        //   576: goto            580
        //   579: athrow         
        //   580: iconst_1       
        //   581: anewarray       Ljava/lang/Object;
        //   584: dup            
        //   585: iconst_0       
        //   586: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //   589: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   592: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   595: goto            599
        //   598: athrow         
        //   599: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   602: goto            606
        //   605: athrow         
        //   606: aastore        
        //   607: goto            611
        //   610: athrow         
        //   611: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   614: goto            618
        //   617: athrow         
        //   618: goto            622
        //   621: athrow         
        //   622: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   625: goto            629
        //   628: athrow         
        //   629: ldc             "\u23bb\u14d3"
        //   631: goto            635
        //   634: athrow         
        //   635: invokestatic    invokestatic   !!! ERROR
        //   638: goto            642
        //   641: athrow         
        //   642: goto            646
        //   645: athrow         
        //   646: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   649: goto            653
        //   652: athrow         
        //   653: getstatic       dev/nuker/pyro/fc.1:I
        //   656: ifeq            664
        //   659: ldc             -1170856197
        //   661: goto            666
        //   664: ldc             915458674
        //   666: ldc             -1506640260
        //   668: ixor           
        //   669: lookupswitch {
        //          -1868385266: 696
        //          470046855: 664
        //          default: 1798
        //        }
        //   696: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   699: goto            703
        //   702: athrow         
        //   703: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   706: goto            710
        //   709: athrow         
        //   710: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //   712: getstatic       dev/nuker/pyro/fc.c:I
        //   715: ifge            723
        //   718: ldc             -968962132
        //   720: goto            725
        //   723: ldc             1512298999
        //   725: ldc             -37561260
        //   727: ixor           
        //   728: lookupswitch {
        //          -1478425181: 756
        //          1006375928: 723
        //          default: 1774
        //        }
        //   756: goto            760
        //   759: athrow         
        //   760: invokestatic    invokestatic   !!! ERROR
        //   763: goto            767
        //   766: athrow         
        //   767: iconst_1       
        //   768: anewarray       Ljava/lang/Object;
        //   771: dup            
        //   772: iconst_0       
        //   773: getstatic       dev/nuker/pyro/fc.1:I
        //   776: ifeq            784
        //   779: ldc             -841915196
        //   781: goto            786
        //   784: ldc             -959599010
        //   786: ldc             -1708475628
        //   788: ixor           
        //   789: lookupswitch {
        //          1476124624: 784
        //          1558648138: 816
        //          default: 1780
        //        }
        //   816: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //   819: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   822: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   825: goto            829
        //   828: athrow         
        //   829: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   832: goto            836
        //   835: athrow         
        //   836: aastore        
        //   837: goto            841
        //   840: athrow         
        //   841: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   844: goto            848
        //   847: athrow         
        //   848: goto            852
        //   851: athrow         
        //   852: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   855: goto            859
        //   858: athrow         
        //   859: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   862: goto            866
        //   865: athrow         
        //   866: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   869: goto            873
        //   872: athrow         
        //   873: ldc             "\u23be\u14d3"
        //   875: goto            879
        //   878: athrow         
        //   879: invokestatic    invokestatic   !!! ERROR
        //   882: goto            886
        //   885: athrow         
        //   886: goto            890
        //   889: athrow         
        //   890: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   893: goto            897
        //   896: athrow         
        //   897: astore_2       
        //   898: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //   901: getstatic       dev/nuker/pyro/fc.1:I
        //   904: ifeq            912
        //   907: ldc             1265110934
        //   909: goto            914
        //   912: ldc             693026670
        //   914: ldc             -443213576
        //   916: ixor           
        //   917: lookupswitch {
        //          -1359145106: 1772
        //          -989706544: 912
        //          default: 944
        //        }
        //   944: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   947: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71093_bK:I
        //   950: iconst_1       
        //   951: if_icmpeq       958
        //   954: iconst_1       
        //   955: goto            959
        //   958: iconst_0       
        //   959: istore_3       
        //   960: getstatic       dev/nuker/pyro/fc.0:I
        //   963: ifeq            971
        //   966: ldc             299820034
        //   968: goto            973
        //   971: ldc             -2004099366
        //   973: ldc             -1313504262
        //   975: ixor           
        //   976: lookupswitch {
        //          -1603573768: 971
        //          960388384: 1004
        //          default: 1768
        //        }
        //  1004: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: getfield        net/minecraft/entity/Entity.field_71093_bK:I
        //  1021: ifne            1048
        //  1024: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1034: goto            1038
        //  1037: athrow         
        //  1038: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //  1041: ldc2_w          8.0
        //  1044: ddiv           
        //  1045: goto            1061
        //  1048: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1051: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1054: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1057: ldc2_w          8.0
        //  1060: dmul           
        //  1061: dstore          4
        //  1063: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: getstatic       dev/nuker/pyro/fc.1:I
        //  1080: ifeq            1088
        //  1083: ldc             -193519433
        //  1085: goto            1090
        //  1088: ldc             1089473232
        //  1090: ldc             965054521
        //  1092: ixor           
        //  1093: lookupswitch {
        //          -839733106: 1804
        //          1675687417: 1088
        //          default: 1120
        //        }
        //  1120: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //  1123: dstore          6
        //  1125: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1135: goto            1139
        //  1138: athrow         
        //  1139: getfield        net/minecraft/entity/Entity.field_71093_bK:I
        //  1142: ifne            1169
        //  1145: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //  1162: ldc2_w          8.0
        //  1165: ddiv           
        //  1166: goto            1266
        //  1169: getstatic       dev/nuker/pyro/fc.0:I
        //  1172: ifeq            1180
        //  1175: ldc             -576377319
        //  1177: goto            1182
        //  1180: ldc             1374539615
        //  1182: ldc             -292426991
        //  1184: ixor           
        //  1185: lookupswitch {
        //          -486163126: 1180
        //          859096328: 1790
        //          default: 1212
        //        }
        //  1212: getstatic       dev/nuker/pyro/f4i.c:Lnet/minecraft/client/Minecraft;
        //  1215: getstatic       dev/nuker/pyro/fc.c:I
        //  1218: ifge            1226
        //  1221: ldc             -929112607
        //  1223: goto            1228
        //  1226: ldc             -697085004
        //  1228: ldc             -1616157866
        //  1230: ixor           
        //  1231: lookupswitch {
        //          -1751056539: 1226
        //          1463140023: 1776
        //          default: 1256
        //        }
        //  1256: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1259: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1262: ldc2_w          8.0
        //  1265: dmul           
        //  1266: dstore          8
        //  1268: iload_3        
        //  1269: ifeq            1710
        //  1272: aload_2        
        //  1273: ldc             "["
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1282: goto            1286
        //  1285: athrow         
        //  1286: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1289: goto            1293
        //  1292: athrow         
        //  1293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1296: goto            1300
        //  1299: athrow         
        //  1300: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //  1302: goto            1306
        //  1305: athrow         
        //  1306: invokestatic    invokestatic   !!! ERROR
        //  1309: goto            1313
        //  1312: athrow         
        //  1313: iconst_1       
        //  1314: anewarray       Ljava/lang/Object;
        //  1317: dup            
        //  1318: iconst_0       
        //  1319: dload           4
        //  1321: getstatic       dev/nuker/pyro/fc.1:I
        //  1324: ifeq            1332
        //  1327: ldc             -2118675011
        //  1329: goto            1334
        //  1332: ldc             -278130550
        //  1334: ldc             838283459
        //  1336: ixor           
        //  1337: lookupswitch {
        //          -1337940610: 1332
        //          -560258999: 1364
        //          default: 1808
        //        }
        //  1364: goto            1368
        //  1367: athrow         
        //  1368: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1371: goto            1375
        //  1374: athrow         
        //  1375: aastore        
        //  1376: goto            1380
        //  1379: athrow         
        //  1380: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: goto            1391
        //  1390: athrow         
        //  1391: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1394: goto            1398
        //  1397: athrow         
        //  1398: ldc             "\u23bb\u14d3"
        //  1400: goto            1404
        //  1403: athrow         
        //  1404: invokestatic    invokestatic   !!! ERROR
        //  1407: goto            1411
        //  1410: athrow         
        //  1411: goto            1415
        //  1414: athrow         
        //  1415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1418: goto            1422
        //  1421: athrow         
        //  1422: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //  1424: goto            1428
        //  1427: athrow         
        //  1428: invokestatic    invokestatic   !!! ERROR
        //  1431: goto            1435
        //  1434: athrow         
        //  1435: iconst_1       
        //  1436: anewarray       Ljava/lang/Object;
        //  1439: dup            
        //  1440: iconst_0       
        //  1441: getstatic       dev/nuker/pyro/fc.0:I
        //  1444: ifeq            1452
        //  1447: ldc             -1034325855
        //  1449: goto            1454
        //  1452: ldc             870533890
        //  1454: ldc             572397586
        //  1456: ixor           
        //  1457: lookupswitch {
        //          -532191053: 1786
        //          1668088834: 1452
        //          default: 1484
        //        }
        //  1484: dload           6
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1493: goto            1497
        //  1496: athrow         
        //  1497: aastore        
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: goto            1513
        //  1512: athrow         
        //  1513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: ldc             "\u23bb\u14d3"
        //  1522: getstatic       dev/nuker/pyro/fc.c:I
        //  1525: ifge            1533
        //  1528: ldc             -1896721453
        //  1530: goto            1535
        //  1533: ldc             -1111588532
        //  1535: ldc             -454022450
        //  1537: ixor           
        //  1538: lookupswitch {
        //          1498327938: 1564
        //          1778546973: 1533
        //          default: 1794
        //        }
        //  1564: goto            1568
        //  1567: athrow         
        //  1568: invokestatic    invokestatic   !!! ERROR
        //  1571: goto            1575
        //  1574: athrow         
        //  1575: getstatic       dev/nuker/pyro/fc.0:I
        //  1578: ifeq            1586
        //  1581: ldc             632727396
        //  1583: goto            1588
        //  1586: ldc             -1049541354
        //  1588: ldc             -14676653
        //  1590: ixor           
        //  1591: lookupswitch {
        //          -1824555591: 1586
        //          -627660233: 1778
        //          default: 1616
        //        }
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1623: goto            1627
        //  1626: athrow         
        //  1627: ldc             "\u23b2\u14dd\u8ab7\ub1ce"
        //  1629: goto            1633
        //  1632: athrow         
        //  1633: invokestatic    invokestatic   !!! ERROR
        //  1636: goto            1640
        //  1639: athrow         
        //  1640: iconst_1       
        //  1641: anewarray       Ljava/lang/Object;
        //  1644: dup            
        //  1645: iconst_0       
        //  1646: dload           8
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: aastore        
        //  1660: goto            1664
        //  1663: athrow         
        //  1664: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1667: goto            1671
        //  1670: athrow         
        //  1671: goto            1675
        //  1674: athrow         
        //  1675: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1678: goto            1682
        //  1681: athrow         
        //  1682: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1685: goto            1689
        //  1688: athrow         
        //  1689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1692: goto            1696
        //  1695: athrow         
        //  1696: ldc             "]"
        //  1698: goto            1702
        //  1701: athrow         
        //  1702: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1705: goto            1709
        //  1708: athrow         
        //  1709: pop            
        //  1710: aload_0        
        //  1711: getstatic       dev/nuker/pyro/fc.1:I
        //  1714: ifeq            1722
        //  1717: ldc             -1929460846
        //  1719: goto            1724
        //  1722: ldc             456963057
        //  1724: ldc             947802520
        //  1726: ixor           
        //  1727: lookupswitch {
        //          -1266642422: 1784
        //          -617410204: 1722
        //          default: 1752
        //        }
        //  1752: aload_2        
        //  1753: goto            1757
        //  1756: athrow         
        //  1757: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1760: goto            1764
        //  1763: athrow         
        //  1764: putfield        dev/nuker/pyro/f4i.0:Ljava/lang/String;
        //  1767: return         
        //  1768: aconst_null    
        //  1769: athrow         
        //  1770: aconst_null    
        //  1771: athrow         
        //  1772: aconst_null    
        //  1773: athrow         
        //  1774: aconst_null    
        //  1775: athrow         
        //  1776: aconst_null    
        //  1777: athrow         
        //  1778: aconst_null    
        //  1779: athrow         
        //  1780: aconst_null    
        //  1781: athrow         
        //  1782: aconst_null    
        //  1783: athrow         
        //  1784: aconst_null    
        //  1785: athrow         
        //  1786: aconst_null    
        //  1787: athrow         
        //  1788: aconst_null    
        //  1789: athrow         
        //  1790: aconst_null    
        //  1791: athrow         
        //  1792: aconst_null    
        //  1793: athrow         
        //  1794: aconst_null    
        //  1795: athrow         
        //  1796: aconst_null    
        //  1797: athrow         
        //  1798: aconst_null    
        //  1799: athrow         
        //  1800: aconst_null    
        //  1801: athrow         
        //  1802: aconst_null    
        //  1803: athrow         
        //  1804: aconst_null    
        //  1805: athrow         
        //  1806: aconst_null    
        //  1807: athrow         
        //  1808: aconst_null    
        //  1809: athrow         
        //  1810: pop            
        //  1811: goto            24
        //  1814: pop            
        //  1815: aconst_null    
        //  1816: goto            1810
        //  1819: dup            
        //  1820: ifnull          1810
        //  1823: checkcast       Ljava/lang/Throwable;
        //  1826: athrow         
        //  1827: dup            
        //  1828: ifnull          1814
        //  1831: checkcast       Ljava/lang/Throwable;
        //  1834: athrow         
        //  1835: aconst_null    
        //  1836: athrow         
        //    StackMapTable: 01 35 43 07 00 3B 04 FF 00 0B 00 00 00 01 07 00 3B FD 00 03 07 00 03 07 00 E5 0A 41 01 1E 08 04 41 01 17 FF 00 0D 00 02 07 00 03 07 00 E5 00 02 07 00 03 07 00 92 FF 00 01 00 02 07 00 03 07 00 E5 00 03 07 00 03 07 00 92 01 FF 00 1B 00 02 07 00 03 07 00 E5 00 02 07 00 03 07 00 92 03 FF 00 08 00 00 00 01 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 03 08 00 9C 08 00 9C 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 03 08 00 9C 08 00 9C 07 00 92 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 03 08 00 9C 08 00 9C 07 00 92 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 4A 07 00 55 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 55 01 5D 07 00 55 FF 00 0D 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B FF 00 01 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 6B 01 FF 00 1B 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 FF 00 04 00 00 00 01 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 FF 00 10 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 01 FF 00 1C 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 13 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 FF 00 01 00 02 07 00 03 07 00 E5 00 07 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 01 FF 00 1D 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 FF 00 0B 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 FF 00 01 00 02 07 00 03 07 00 E5 00 04 07 00 55 07 00 92 07 00 E7 01 FF 00 1E 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 21 FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 FF 00 0D 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B FF 00 01 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 6B 01 FF 00 1D 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 42 07 00 1F FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 51 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 FF 00 03 00 00 00 01 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 1D FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 4A 07 00 55 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 55 01 5D 07 00 55 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 FF 00 0C 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 FF 00 01 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 01 FF 00 1E 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 FF 00 10 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 01 FF 00 1D 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 4B 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 43 07 00 19 FF 00 00 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 19 FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 44 07 00 2F FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 FF 00 0E 00 03 07 00 03 07 00 E5 07 00 55 00 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 E5 07 00 55 00 02 07 00 43 01 5D 07 00 43 0D 40 01 FC 00 0B 01 41 01 1E FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 04 07 00 03 07 00 E5 07 00 55 01 00 01 07 00 43 45 07 00 3B 40 07 00 BE 4B 07 00 19 40 07 00 43 45 07 00 3B 40 07 00 BE 09 4C 03 FF 00 07 00 05 07 00 03 07 00 E5 07 00 55 01 03 00 01 07 00 19 40 07 00 43 45 07 00 3B 40 07 00 BE 4A 07 00 BE FF 00 01 00 05 07 00 03 07 00 E5 07 00 55 01 03 00 02 07 00 BE 01 5D 07 00 BE FF 00 0A 00 06 07 00 03 07 00 E5 07 00 55 01 03 03 00 01 07 00 33 40 07 00 43 45 07 00 3B 40 07 00 BE 4B 07 00 15 40 07 00 43 45 07 00 3B 40 07 00 BE 09 0A 41 01 1D 4D 07 00 43 FF 00 01 00 06 07 00 03 07 00 E5 07 00 55 01 03 03 00 02 07 00 43 01 5B 07 00 43 49 03 FF 00 0B 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 01 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 45 07 00 21 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 12 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 07 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 01 FF 00 1D 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 43 07 00 23 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 FF 00 04 00 00 00 01 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 10 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 01 FF 00 1D 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 44 07 00 17 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 43 07 00 1F FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 19 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 FF 00 0C 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 03 07 00 55 07 00 92 01 FF 00 1C 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 31 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 0A 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 03 07 00 55 07 00 92 01 FF 00 1B 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 19 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 44 07 00 23 FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 4A 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 07 00 89 43 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 03 07 00 55 07 00 92 07 00 E7 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 42 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 45 07 00 1D FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 6B 45 07 00 3B 40 07 00 55 44 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 45 07 00 3B 40 07 00 55 00 4B 07 00 03 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 03 01 5B 07 00 03 43 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 03 07 00 55 45 07 00 3B FF 00 00 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 03 07 00 92 F8 00 03 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B FF 00 01 00 03 07 00 03 07 00 E5 07 00 55 00 01 07 00 43 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 92 FF 00 01 00 06 07 00 03 07 00 E5 07 00 55 01 03 03 00 01 07 00 43 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 01 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 03 07 00 92 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 02 07 00 03 07 00 E5 00 05 07 00 55 07 00 92 07 00 E7 07 00 E7 01 FF 00 01 00 06 07 00 03 07 00 E5 07 00 55 01 03 03 00 00 FF 00 01 00 02 07 00 03 07 00 E5 00 03 07 00 55 07 00 92 07 00 E7 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 02 07 00 55 07 00 92 FF 00 01 00 02 07 00 03 07 00 E5 00 00 41 07 00 55 FF 00 01 00 02 07 00 03 07 00 E5 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 55 07 00 6B FF 00 01 00 05 07 00 03 07 00 E5 07 00 55 01 03 00 01 07 00 BE FF 00 01 00 02 07 00 03 07 00 E5 00 01 07 00 55 FF 00 01 00 07 07 00 03 07 00 E5 07 00 55 01 03 03 03 00 06 07 00 55 07 00 92 07 00 E7 07 00 E7 01 03 FF 00 01 00 02 07 00 03 07 00 E5 00 01 07 00 3B 43 05 44 07 00 3B 47 05 47 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1819   1827   Ljava/lang/IllegalStateException;
        //  1819   1827   1819   1827   Any
        //  1835   1837   3      8      Ljava/lang/IllegalStateException;
        //  166    172    172    173    Any
        //  166    172    3      8      Any
        //  166    172    172    173    Ljava/lang/IllegalArgumentException;
        //  166    172    3      8      Any
        //  166    172    172    173    Ljava/lang/IllegalArgumentException;
        //  176    183    183    184    Any
        //  176    183    3      8      Ljava/lang/IllegalStateException;
        //  177    183    3      8      Any
        //  176    183    183    184    Ljava/lang/RuntimeException;
        //  176    183    176    177    Any
        //  189    196    196    197    Any
        //  190    196    196    197    Ljava/lang/UnsupportedOperationException;
        //  189    196    196    197    Any
        //  189    196    189    190    Any
        //  190    196    196    197    Ljava/lang/IllegalStateException;
        //  287    294    294    295    Any
        //  287    294    287    288    Ljava/util/ConcurrentModificationException;
        //  287    294    287    288    Ljava/util/ConcurrentModificationException;
        //  287    294    287    288    Any
        //  287    294    294    295    Any
        //  301    307    307    308    Any
        //  301    307    307    308    Ljava/lang/NullPointerException;
        //  301    307    307    308    Ljava/lang/UnsupportedOperationException;
        //  301    307    3      8      Ljava/util/ConcurrentModificationException;
        //  301    307    3      8      Any
        //  411    418    418    419    Any
        //  412    418    411    412    Any
        //  411    418    3      8      Ljava/lang/NullPointerException;
        //  411    418    418    419    Ljava/lang/IndexOutOfBoundsException;
        //  411    418    411    412    Ljava/lang/NegativeArraySizeException;
        //  467    474    474    475    Any
        //  468    474    467    468    Any
        //  467    474    467    468    Any
        //  468    474    467    468    Ljava/util/ConcurrentModificationException;
        //  468    474    474    475    Ljava/lang/NegativeArraySizeException;
        //  478    485    485    486    Any
        //  479    485    485    486    Any
        //  479    485    3      8      Any
        //  478    485    478    479    Any
        //  479    485    485    486    Ljava/lang/EnumConstantNotPresentException;
        //  491    498    498    499    Any
        //  491    498    491    492    Any
        //  492    498    3      8      Ljava/lang/RuntimeException;
        //  491    498    498    499    Any
        //  491    498    491    492    Any
        //  502    509    509    510    Any
        //  502    509    3      8      Any
        //  502    509    502    503    Ljava/lang/IndexOutOfBoundsException;
        //  502    509    3      8      Any
        //  503    509    3      8      Ljava/util/ConcurrentModificationException;
        //  559    566    566    567    Any
        //  559    566    559    560    Ljava/lang/NullPointerException;
        //  560    566    566    567    Any
        //  560    566    566    567    Ljava/util/ConcurrentModificationException;
        //  560    566    566    567    Any
        //  572    579    579    580    Any
        //  572    579    572    573    Any
        //  572    579    579    580    Ljava/lang/NullPointerException;
        //  572    579    3      8      Any
        //  572    579    3      8      Ljava/lang/IllegalStateException;
        //  598    605    605    606    Any
        //  598    605    598    599    Ljava/lang/NullPointerException;
        //  599    605    598    599    Any
        //  599    605    598    599    Ljava/lang/IllegalArgumentException;
        //  599    605    3      8      Ljava/lang/AssertionError;
        //  611    617    617    618    Any
        //  611    617    617    618    Any
        //  611    617    617    618    Any
        //  611    617    617    618    Any
        //  611    617    3      8      Any
        //  621    628    628    629    Any
        //  622    628    628    629    Ljava/lang/IndexOutOfBoundsException;
        //  621    628    628    629    Ljava/lang/NullPointerException;
        //  622    628    3      8      Any
        //  622    628    621    622    Ljava/util/ConcurrentModificationException;
        //  634    641    641    642    Any
        //  635    641    634    635    Any
        //  634    641    3      8      Any
        //  635    641    634    635    Ljava/lang/NegativeArraySizeException;
        //  634    641    634    635    Any
        //  645    652    652    653    Any
        //  645    652    3      8      Any
        //  645    652    3      8      Any
        //  646    652    645    646    Ljava/util/ConcurrentModificationException;
        //  645    652    645    646    Any
        //  702    709    709    710    Any
        //  702    709    3      8      Any
        //  702    709    702    703    Any
        //  703    709    709    710    Any
        //  703    709    702    703    Any
        //  759    766    766    767    Any
        //  760    766    3      8      Any
        //  760    766    759    760    Any
        //  760    766    766    767    Ljava/util/NoSuchElementException;
        //  760    766    3      8      Ljava/util/NoSuchElementException;
        //  828    835    835    836    Any
        //  828    835    828    829    Any
        //  829    835    3      8      Any
        //  828    835    828    829    Ljava/lang/UnsupportedOperationException;
        //  828    835    828    829    Any
        //  840    847    847    848    Any
        //  841    847    3      8      Ljava/lang/RuntimeException;
        //  840    847    840    841    Ljava/lang/RuntimeException;
        //  840    847    3      8      Any
        //  840    847    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  851    858    858    859    Any
        //  851    858    858    859    Any
        //  851    858    3      8      Any
        //  852    858    851    852    Ljava/lang/UnsupportedOperationException;
        //  852    858    851    852    Ljava/lang/NumberFormatException;
        //  865    872    872    873    Any
        //  865    872    3      8      Ljava/lang/NullPointerException;
        //  866    872    872    873    Ljava/lang/IndexOutOfBoundsException;
        //  866    872    865    866    Any
        //  866    872    865    866    Any
        //  878    885    885    886    Any
        //  878    885    3      8      Any
        //  878    885    885    886    Any
        //  878    885    885    886    Ljava/util/ConcurrentModificationException;
        //  878    885    878    879    Ljava/lang/StringIndexOutOfBoundsException;
        //  889    896    896    897    Any
        //  889    896    3      8      Ljava/lang/IllegalArgumentException;
        //  889    896    889    890    Any
        //  889    896    889    890    Any
        //  889    896    889    890    Any
        //  1011   1017   1017   1018   Any
        //  1011   1017   1017   1018   Any
        //  1011   1017   1017   1018   Ljava/lang/UnsupportedOperationException;
        //  1011   1017   3      8      Any
        //  1011   1017   3      8      Any
        //  1030   1037   1037   1038   Any
        //  1031   1037   1030   1031   Ljava/lang/RuntimeException;
        //  1030   1037   1037   1038   Any
        //  1030   1037   1037   1038   Any
        //  1031   1037   1037   1038   Any
        //  1069   1076   1076   1077   Any
        //  1070   1076   3      8      Any
        //  1069   1076   3      8      Any
        //  1069   1076   1069   1070   Ljava/lang/RuntimeException;
        //  1070   1076   1076   1077   Any
        //  1131   1138   1138   1139   Any
        //  1132   1138   1138   1139   Any
        //  1132   1138   3      8      Ljava/lang/ClassCastException;
        //  1131   1138   1138   1139   Any
        //  1131   1138   1131   1132   Ljava/lang/ArithmeticException;
        //  1151   1158   1158   1159   Any
        //  1151   1158   3      8      Any
        //  1152   1158   1151   1152   Ljava/lang/IllegalStateException;
        //  1152   1158   3      8      Any
        //  1151   1158   3      8      Ljava/lang/NegativeArraySizeException;
        //  1278   1285   1285   1286   Any
        //  1278   1285   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1279   1285   1278   1279   Any
        //  1278   1285   1278   1279   Any
        //  1278   1285   1278   1279   Any
        //  1292   1299   1299   1300   Any
        //  1292   1299   1299   1300   Any
        //  1292   1299   1292   1293   Ljava/lang/IndexOutOfBoundsException;
        //  1292   1299   1299   1300   Any
        //  1292   1299   3      8      Ljava/lang/ArithmeticException;
        //  1305   1312   1312   1313   Any
        //  1305   1312   1305   1306   Any
        //  1305   1312   1312   1313   Ljava/lang/UnsupportedOperationException;
        //  1305   1312   1312   1313   Ljava/lang/NullPointerException;
        //  1305   1312   3      8      Any
        //  1368   1374   1374   1375   Any
        //  1368   1374   3      8      Ljava/lang/ArithmeticException;
        //  1368   1374   1374   1375   Any
        //  1368   1374   1374   1375   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1368   1374   1374   1375   Ljava/lang/RuntimeException;
        //  1379   1386   1386   1387   Any
        //  1380   1386   3      8      Ljava/lang/RuntimeException;
        //  1379   1386   1386   1387   Ljava/lang/StringIndexOutOfBoundsException;
        //  1379   1386   1386   1387   Ljava/util/NoSuchElementException;
        //  1379   1386   1379   1380   Ljava/lang/NegativeArraySizeException;
        //  1390   1397   1397   1398   Any
        //  1391   1397   1397   1398   Any
        //  1390   1397   1397   1398   Any
        //  1390   1397   3      8      Any
        //  1391   1397   1390   1391   Any
        //  1403   1410   1410   1411   Any
        //  1404   1410   1410   1411   Any
        //  1403   1410   1403   1404   Any
        //  1404   1410   3      8      Any
        //  1403   1410   1410   1411   Ljava/lang/IndexOutOfBoundsException;
        //  1414   1421   1421   1422   Any
        //  1415   1421   1414   1415   Any
        //  1414   1421   1414   1415   Ljava/lang/NegativeArraySizeException;
        //  1415   1421   3      8      Ljava/util/NoSuchElementException;
        //  1415   1421   1421   1422   Any
        //  1428   1434   1434   1435   Any
        //  1428   1434   1434   1435   Any
        //  1428   1434   1434   1435   Any
        //  1428   1434   3      8      Any
        //  1428   1434   3      8      Ljava/lang/ClassCastException;
        //  1489   1496   1496   1497   Any
        //  1490   1496   1496   1497   Any
        //  1490   1496   1489   1490   Ljava/lang/IllegalArgumentException;
        //  1489   1496   1489   1490   Ljava/lang/IllegalArgumentException;
        //  1490   1496   3      8      Any
        //  1501   1508   1508   1509   Any
        //  1502   1508   3      8      Any
        //  1502   1508   1501   1502   Ljava/lang/NullPointerException;
        //  1501   1508   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1501   1508   3      8      Any
        //  1512   1519   1519   1520   Any
        //  1513   1519   1519   1520   Ljava/lang/NegativeArraySizeException;
        //  1513   1519   1512   1513   Ljava/util/ConcurrentModificationException;
        //  1513   1519   1512   1513   Ljava/lang/StringIndexOutOfBoundsException;
        //  1512   1519   1519   1520   Any
        //  1567   1574   1574   1575   Any
        //  1567   1574   3      8      Any
        //  1568   1574   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1568   1574   1567   1568   Ljava/lang/ClassCastException;
        //  1567   1574   3      8      Any
        //  1619   1626   1626   1627   Any
        //  1620   1626   3      8      Ljava/util/NoSuchElementException;
        //  1620   1626   1619   1620   Ljava/lang/IllegalArgumentException;
        //  1619   1626   1619   1620   Ljava/lang/ArithmeticException;
        //  1620   1626   3      8      Any
        //  1632   1639   1639   1640   Any
        //  1633   1639   3      8      Any
        //  1633   1639   1632   1633   Ljava/lang/NegativeArraySizeException;
        //  1633   1639   1639   1640   Any
        //  1633   1639   3      8      Ljava/lang/RuntimeException;
        //  1651   1658   1658   1659   Any
        //  1651   1658   1651   1652   Any
        //  1652   1658   3      8      Ljava/lang/NumberFormatException;
        //  1652   1658   1651   1652   Any
        //  1651   1658   1658   1659   Ljava/lang/IllegalStateException;
        //  1663   1670   1670   1671   Any
        //  1663   1670   3      8      Ljava/lang/ArithmeticException;
        //  1663   1670   1663   1664   Any
        //  1664   1670   1670   1671   Ljava/util/ConcurrentModificationException;
        //  1664   1670   1670   1671   Ljava/lang/NullPointerException;
        //  1674   1681   1681   1682   Any
        //  1675   1681   3      8      Any
        //  1675   1681   1681   1682   Any
        //  1674   1681   1674   1675   Any
        //  1675   1681   1674   1675   Ljava/lang/AssertionError;
        //  1688   1695   1695   1696   Any
        //  1689   1695   1695   1696   Ljava/util/NoSuchElementException;
        //  1688   1695   1688   1689   Ljava/util/ConcurrentModificationException;
        //  1688   1695   3      8      Any
        //  1688   1695   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1701   1708   1708   1709   Any
        //  1701   1708   1708   1709   Any
        //  1702   1708   1708   1709   Any
        //  1702   1708   3      8      Any
        //  1702   1708   1701   1702   Any
        //  1756   1763   1763   1764   Any
        //  1757   1763   1756   1757   Any
        //  1757   1763   3      8      Ljava/lang/RuntimeException;
        //  1756   1763   1756   1757   Any
        //  1757   1763   3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 1.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    @Override
    public int c(final ScaledResolution scaledResolution, final float n, final float n2) {
        return fbS.9G(this, 116141210, scaledResolution, n, n2);
    }
    
    public f4i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23f4\u149c\u8ae9\ub3cb\uc9d8\uede2"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: invokespecial   dev/nuker/pyro/f4C.<init>:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: ldc             ""
        //    12: putfield        dev/nuker/pyro/f4i.0:Ljava/lang/String;
        //    15: return         
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
