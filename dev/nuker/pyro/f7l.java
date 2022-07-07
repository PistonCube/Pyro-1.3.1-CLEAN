// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.block.Block;

public class f7L extends fH
{
    public f0d c;
    public boolean c;
    
    public static boolean 0(final Block block) {
        return fbS.3T(null, 183660018, block);
    }
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3d f3d) {
        fbS.78(this, 1690270062, f3d);
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
        //     4: ifnull          1398
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1390
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1382
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //    34: ifeq            85
        //    37: getstatic       dev/nuker/pyro/fc.0:I
        //    40: ifeq            48
        //    43: ldc             -338410849
        //    45: goto            50
        //    48: ldc             1217799354
        //    50: ldc             -77791457
        //    52: ixor           
        //    53: lookupswitch {
        //          -1278551131: 80
        //          277396864: 48
        //          default: 1351
        //        }
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        dev/nuker/pyro/f7L.c:Z
        //    85: aload_0        
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            97
        //    92: ldc             425424036
        //    94: goto            99
        //    97: ldc             -1824647023
        //    99: ldc             -1026176276
        //   101: ixor           
        //   102: lookupswitch {
        //          -611402168: 97
        //          1374409341: 128
        //          default: 1355
        //        }
        //   128: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   131: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   134: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //   137: dconst_0       
        //   138: dcmpl          
        //   139: ifle            147
        //   142: aload_0        
        //   143: iconst_1       
        //   144: putfield        dev/nuker/pyro/f7L.c:Z
        //   147: getstatic       dev/nuker/pyro/fc.0:I
        //   150: ifeq            158
        //   153: ldc             -1478697546
        //   155: goto            160
        //   158: ldc             -1082319472
        //   160: ldc             1206981068
        //   162: ixor           
        //   163: lookupswitch {
        //          -533869446: 158
        //          -125039524: 188
        //          default: 1343
        //        }
        //   188: aload_0        
        //   189: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   192: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   195: goto            199
        //   198: athrow         
        //   199: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   202: goto            206
        //   205: athrow         
        //   206: invokedynamic   BootstrapMethod #0, c:()Ldev/nuker/pyro/fbz;
        //   211: goto            215
        //   214: athrow         
        //   215: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/AxisAlignedBB;Ldev/nuker/pyro/fbz;)Z
        //   218: goto            222
        //   221: athrow         
        //   222: ifne            814
        //   225: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //   228: dup            
        //   229: getstatic       dev/nuker/pyro/fc.0:I
        //   232: ifeq            240
        //   235: ldc             -625591023
        //   237: goto            242
        //   240: ldc             -1395026803
        //   242: ldc             -1629841885
        //   244: ixor           
        //   245: lookupswitch {
        //          839058094: 272
        //          1147972402: 240
        //          default: 1359
        //        }
        //   272: aload_0        
        //   273: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   276: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   279: goto            283
        //   282: athrow         
        //   283: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   286: goto            290
        //   289: athrow         
        //   290: getstatic       dev/nuker/pyro/fc.c:I
        //   293: ifge            301
        //   296: ldc             1818637888
        //   298: goto            303
        //   301: ldc             -1935790028
        //   303: ldc             1469592843
        //   305: ixor           
        //   306: lookupswitch {
        //          250684511: 301
        //          1006502731: 1345
        //          default: 332
        //        }
        //   332: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   335: getstatic       dev/nuker/pyro/fc.0:I
        //   338: ifeq            346
        //   341: ldc             1367460274
        //   343: goto            348
        //   346: ldc             298324819
        //   348: ldc             522879714
        //   350: ixor           
        //   351: lookupswitch {
        //          249729457: 376
        //          1319848784: 346
        //          default: 1367
        //        }
        //   376: aload_0        
        //   377: getstatic       dev/nuker/pyro/fc.0:I
        //   380: ifeq            388
        //   383: ldc             -934578958
        //   385: goto            390
        //   388: ldc             1324108354
        //   390: ldc             879303061
        //   392: ixor           
        //   393: lookupswitch {
        //          -64852633: 388
        //          2055558103: 420
        //          default: 1353
        //        }
        //   420: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   423: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   426: goto            430
        //   429: athrow         
        //   430: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   433: goto            437
        //   436: athrow         
        //   437: getfield        net/minecraft/util/math/AxisAlignedBB.field_72337_e:D
        //   440: getstatic       dev/nuker/pyro/fc.c:I
        //   443: ifge            451
        //   446: ldc             -209819941
        //   448: goto            453
        //   451: ldc             -1546098237
        //   453: ldc             -1967661824
        //   455: ixor           
        //   456: lookupswitch {
        //          695186627: 484
        //          2043263963: 451
        //          default: 1329
        //        }
        //   484: aload_0        
        //   485: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   488: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   491: goto            495
        //   494: athrow         
        //   495: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   498: goto            502
        //   501: athrow         
        //   502: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   505: aload_0        
        //   506: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   509: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   512: getstatic       dev/nuker/pyro/fc.c:I
        //   515: ifge            523
        //   518: ldc             -1607120007
        //   520: goto            525
        //   523: ldc             600013036
        //   525: ldc             1943105340
        //   527: ixor           
        //   528: lookupswitch {
        //          -987846028: 523
        //          -740023227: 1365
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   563: goto            567
        //   566: athrow         
        //   567: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   570: aload_0        
        //   571: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   574: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   577: getstatic       dev/nuker/pyro/fc.0:I
        //   580: ifeq            588
        //   583: ldc             -1173234345
        //   585: goto            590
        //   588: ldc             -1622680485
        //   590: ldc             -1748100706
        //   592: ixor           
        //   593: lookupswitch {
        //          -1430754269: 588
        //          769639625: 1331
        //          default: 620
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   627: goto            631
        //   630: athrow         
        //   631: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   634: ldc2_w          0.01
        //   637: dsub           
        //   638: aload_0        
        //   639: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   642: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   645: getstatic       dev/nuker/pyro/fc.c:I
        //   648: ifge            656
        //   651: ldc             2100317598
        //   653: goto            658
        //   656: ldc             -1934069479
        //   658: ldc             -1260854670
        //   660: ixor           
        //   661: lookupswitch {
        //          -907497492: 1333
        //          1292327599: 656
        //          default: 688
        //        }
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   695: goto            699
        //   698: athrow         
        //   699: getstatic       dev/nuker/pyro/fc.0:I
        //   702: ifeq            710
        //   705: ldc             -1088839710
        //   707: goto            712
        //   710: ldc             964810655
        //   712: ldc             667486073
        //   714: ixor           
        //   715: lookupswitch {
        //          -1731159909: 710
        //          508088550: 740
        //          default: 1335
        //        }
        //   740: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   743: getstatic       dev/nuker/pyro/fc.c:I
        //   746: ifge            754
        //   749: ldc             258118222
        //   751: goto            756
        //   754: ldc             1657157374
        //   756: ldc             587081932
        //   758: ixor           
        //   759: lookupswitch {
        //          765246082: 754
        //          1077419570: 784
        //          default: 1349
        //        }
        //   784: goto            788
        //   787: athrow         
        //   788: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
        //   791: goto            795
        //   794: athrow         
        //   795: invokedynamic   BootstrapMethod #1, c:()Ldev/nuker/pyro/fbz;
        //   800: goto            804
        //   803: athrow         
        //   804: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/AxisAlignedBB;Ldev/nuker/pyro/fbz;)Z
        //   807: goto            811
        //   810: athrow         
        //   811: ifeq            815
        //   814: return         
        //   815: getstatic       dev/nuker/pyro/fc.c:I
        //   818: ifge            826
        //   821: ldc             1197493332
        //   823: goto            828
        //   826: ldc             1656023491
        //   828: ldc             1421359792
        //   830: ixor           
        //   831: lookupswitch {
        //          332953316: 826
        //          906810227: 856
        //          default: 1361
        //        }
        //   856: aload_0        
        //   857: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   860: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   863: getstatic       dev/nuker/pyro/fc.0:I
        //   866: ifeq            874
        //   869: ldc             -597738233
        //   871: goto            876
        //   874: ldc             -139058756
        //   876: ldc             -2032554761
        //   878: ixor           
        //   879: lookupswitch {
        //          -114824261: 874
        //          1518768624: 1369
        //          default: 904
        //        }
        //   904: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   907: ifne            1328
        //   910: aload_0        
        //   911: getstatic       dev/nuker/pyro/fc.1:I
        //   914: ifeq            922
        //   917: ldc             1867600019
        //   919: goto            924
        //   922: ldc             1797133372
        //   924: ldc             -1634837947
        //   926: ixor           
        //   927: lookupswitch {
        //          -237040938: 922
        //          -175092103: 952
        //          default: 1339
        //        }
        //   952: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //   955: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   958: getstatic       dev/nuker/pyro/fc.0:I
        //   961: ifeq            969
        //   964: ldc             673276322
        //   966: goto            971
        //   969: ldc             632221162
        //   971: ldc             -2005096981
        //   973: ixor           
        //   974: lookupswitch {
        //          -1604467639: 969
        //          -1378727935: 1000
        //          default: 1363
        //        }
        //  1000: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //  1003: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //  1006: ifne            1328
        //  1009: getstatic       dev/nuker/pyro/fc.1:I
        //  1012: ifeq            1020
        //  1015: ldc             -1840708772
        //  1017: goto            1022
        //  1020: ldc             -1383037416
        //  1022: ldc             -1739941685
        //  1024: ixor           
        //  1025: lookupswitch {
        //          168008599: 1347
        //          968900080: 1020
        //          default: 1052
        //        }
        //  1052: aload_0        
        //  1053: getstatic       dev/nuker/pyro/fc.c:I
        //  1056: ifge            1064
        //  1059: ldc             302002951
        //  1061: goto            1066
        //  1064: ldc             331643330
        //  1066: ldc             434897853
        //  1068: ixor           
        //  1069: lookupswitch {
        //          200028346: 1337
        //          1445000772: 1064
        //          default: 1096
        //        }
        //  1096: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //  1099: getstatic       dev/nuker/pyro/fc.c:I
        //  1102: ifge            1110
        //  1105: ldc             -2032745867
        //  1107: goto            1112
        //  1110: ldc             2083568582
        //  1112: ldc             -633044042
        //  1114: ixor           
        //  1115: lookupswitch {
        //          -1502332816: 1140
        //          1553088963: 1110
        //          default: 1371
        //        }
        //  1140: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1143: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1146: dconst_0       
        //  1147: dcmpg          
        //  1148: ifgt            1328
        //  1151: aload_0        
        //  1152: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //  1155: getstatic       dev/nuker/pyro/fc.c:I
        //  1158: ifge            1166
        //  1161: ldc             -1434857199
        //  1163: goto            1168
        //  1166: ldc             -419826201
        //  1168: ldc             1429529894
        //  1170: ixor           
        //  1171: lookupswitch {
        //          -1278406463: 1196
        //          -11717577: 1166
        //          default: 1357
        //        }
        //  1196: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1199: getstatic       dev/nuker/pyro/fc.0:I
        //  1202: ifeq            1210
        //  1205: ldc             -971797836
        //  1207: goto            1212
        //  1210: ldc             -250747911
        //  1212: ldc             -620761894
        //  1214: ixor           
        //  1215: lookupswitch {
        //          485254766: 1210
        //          737283875: 1240
        //          default: 1341
        //        }
        //  1240: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70143_R:F
        //  1243: fconst_1       
        //  1244: fcmpg          
        //  1245: ifgt            1328
        //  1248: aload_0        
        //  1249: getfield        dev/nuker/pyro/f7L.c:Z
        //  1252: ifne            1260
        //  1255: ldc             1253271107
        //  1257: goto            1262
        //  1260: ldc             1253271108
        //  1262: ldc             487844064
        //  1264: ixor           
        //  1265: tableswitch {
        //          -1354687162: 1288
        //          -1354687161: 1328
        //          default: 1255
        //        }
        //  1288: aload_0        
        //  1289: getfield        dev/nuker/pyro/f7L.c:Lnet/minecraft/client/Minecraft;
        //  1292: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1295: aload_0        
        //  1296: getfield        dev/nuker/pyro/f7L.c:Ldev/nuker/pyro/f0d;
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1306: goto            1310
        //  1309: athrow         
        //  1310: checkcast       Ljava/lang/Double;
        //  1313: goto            1317
        //  1316: athrow         
        //  1317: invokevirtual   java/lang/Double.doubleValue:()D
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: dneg           
        //  1325: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1328: return         
        //  1329: aconst_null    
        //  1330: athrow         
        //  1331: aconst_null    
        //  1332: athrow         
        //  1333: aconst_null    
        //  1334: athrow         
        //  1335: aconst_null    
        //  1336: athrow         
        //  1337: aconst_null    
        //  1338: athrow         
        //  1339: aconst_null    
        //  1340: athrow         
        //  1341: aconst_null    
        //  1342: athrow         
        //  1343: aconst_null    
        //  1344: athrow         
        //  1345: aconst_null    
        //  1346: athrow         
        //  1347: aconst_null    
        //  1348: athrow         
        //  1349: aconst_null    
        //  1350: athrow         
        //  1351: aconst_null    
        //  1352: athrow         
        //  1353: aconst_null    
        //  1354: athrow         
        //  1355: aconst_null    
        //  1356: athrow         
        //  1357: aconst_null    
        //  1358: athrow         
        //  1359: aconst_null    
        //  1360: athrow         
        //  1361: aconst_null    
        //  1362: athrow         
        //  1363: aconst_null    
        //  1364: athrow         
        //  1365: aconst_null    
        //  1366: athrow         
        //  1367: aconst_null    
        //  1368: athrow         
        //  1369: aconst_null    
        //  1370: athrow         
        //  1371: aconst_null    
        //  1372: athrow         
        //  1373: pop            
        //  1374: goto            24
        //  1377: pop            
        //  1378: aconst_null    
        //  1379: goto            1373
        //  1382: dup            
        //  1383: ifnull          1373
        //  1386: checkcast       Ljava/lang/Throwable;
        //  1389: athrow         
        //  1390: dup            
        //  1391: ifnull          1377
        //  1394: checkcast       Ljava/lang/Throwable;
        //  1397: athrow         
        //  1398: aconst_null    
        //  1399: athrow         
        //    StackMapTable: 00 9A 43 07 00 3C 04 FF 00 0B 00 00 00 01 07 00 3C FD 00 03 07 00 03 07 00 EB 17 41 01 1D 04 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 03 01 5C 07 00 03 12 0A 41 01 1B 49 07 00 22 40 07 00 47 45 07 00 3C 40 07 00 74 47 07 00 26 FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 74 07 00 ED 45 07 00 3C 40 01 FF 00 11 00 02 07 00 03 07 00 EB 00 02 08 00 E1 08 00 E1 FF 00 01 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 01 FF 00 1D 00 02 07 00 03 07 00 EB 00 02 08 00 E1 08 00 E1 FF 00 09 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 07 00 74 FF 00 0A 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 07 00 74 FF 00 01 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 07 00 74 01 FF 00 1C 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 07 00 74 FF 00 0D 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 03 FF 00 01 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 01 FF 00 1B 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 03 FF 00 0B 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 EB 00 05 08 00 E1 08 00 E1 03 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 07 00 03 FF 00 08 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 07 00 74 FF 00 0D 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 03 FF 00 01 00 02 07 00 03 07 00 EB 00 05 08 00 E1 08 00 E1 03 03 01 FF 00 1E 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 03 49 07 00 24 FF 00 00 00 02 07 00 03 07 00 EB 00 05 08 00 E1 08 00 E1 03 03 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 05 08 00 E1 08 00 E1 03 03 07 00 74 FF 00 14 00 02 07 00 03 07 00 EB 00 06 08 00 E1 08 00 E1 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 07 00 47 01 FF 00 1E 00 02 07 00 03 07 00 EB 00 06 08 00 E1 08 00 E1 03 03 03 07 00 47 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 EB 00 06 08 00 E1 08 00 E1 03 03 03 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 06 08 00 E1 08 00 E1 03 03 03 07 00 74 FF 00 14 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 07 00 47 01 FF 00 1D 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 03 07 00 47 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 03 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 03 07 00 74 FF 00 18 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 09 08 00 E1 08 00 E1 03 03 03 03 03 07 00 47 01 FF 00 1D 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 47 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 47 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 74 FF 00 0A 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 74 FF 00 01 00 02 07 00 03 07 00 EB 00 09 08 00 E1 08 00 E1 03 03 03 03 03 07 00 74 01 FF 00 1B 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 74 FF 00 0D 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 03 FF 00 01 00 02 07 00 03 07 00 EB 00 09 08 00 E1 08 00 E1 03 03 03 03 03 03 01 FF 00 1B 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 03 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 03 45 07 00 3C 40 07 00 74 47 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 74 07 00 ED 45 07 00 3C 40 01 02 00 0A 41 01 1B 51 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 47 01 5B 07 00 47 51 07 00 03 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 03 01 5B 07 00 03 50 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 47 01 5C 07 00 47 13 41 01 1D 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 03 01 5D 07 00 03 4D 07 00 41 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 41 01 5B 07 00 41 59 07 00 41 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 41 01 5B 07 00 41 4D 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 02 07 00 47 01 5B 07 00 47 0E 04 41 01 19 FF 00 0D 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 47 07 00 DF 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 47 07 00 EF FF 00 05 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 47 07 00 E5 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 EB 00 02 07 00 47 03 03 FF 00 00 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 03 FF 00 01 00 02 07 00 03 07 00 EB 00 07 08 00 E1 08 00 E1 03 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 07 00 74 41 07 00 03 41 07 00 03 41 07 00 47 01 FF 00 01 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 07 00 74 01 FF 00 01 00 02 07 00 03 07 00 EB 00 08 08 00 E1 08 00 E1 03 03 03 03 03 03 01 FF 00 01 00 02 07 00 03 07 00 EB 00 04 08 00 E1 08 00 E1 03 07 00 03 41 07 00 03 41 07 00 41 FF 00 01 00 02 07 00 03 07 00 EB 00 02 08 00 E1 08 00 E1 01 41 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 06 08 00 E1 08 00 E1 03 03 03 07 00 47 FF 00 01 00 02 07 00 03 07 00 EB 00 03 08 00 E1 08 00 E1 03 41 07 00 47 41 07 00 41 41 07 00 3C 43 05 44 07 00 3C 47 05 47 07 00 3C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1382   1390   Ljava/util/ConcurrentModificationException;
        //  1382   1390   1382   1390   Any
        //  1398   1400   3      8      Ljava/lang/AssertionError;
        //  198    205    205    206    Any
        //  199    205    205    206    Any
        //  199    205    198    199    Ljava/lang/UnsupportedOperationException;
        //  198    205    3      8      Any
        //  199    205    205    206    Ljava/util/ConcurrentModificationException;
        //  214    221    221    222    Any
        //  214    221    221    222    Ljava/lang/IllegalStateException;
        //  214    221    221    222    Any
        //  214    221    214    215    Ljava/util/NoSuchElementException;
        //  214    221    221    222    Any
        //  283    289    289    290    Any
        //  283    289    289    290    Ljava/lang/IndexOutOfBoundsException;
        //  283    289    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  283    289    289    290    Any
        //  283    289    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  430    436    436    437    Any
        //  430    436    436    437    Ljava/lang/IndexOutOfBoundsException;
        //  430    436    436    437    Any
        //  430    436    3      8      Any
        //  430    436    3      8      Any
        //  494    501    501    502    Any
        //  495    501    3      8      Any
        //  495    501    501    502    Any
        //  495    501    501    502    Any
        //  495    501    494    495    Ljava/lang/IllegalStateException;
        //  559    566    566    567    Any
        //  559    566    559    560    Ljava/lang/IllegalStateException;
        //  559    566    3      8      Ljava/util/ConcurrentModificationException;
        //  559    566    566    567    Ljava/lang/IndexOutOfBoundsException;
        //  559    566    3      8      Any
        //  623    630    630    631    Any
        //  623    630    630    631    Any
        //  624    630    623    624    Any
        //  623    630    630    631    Ljava/lang/ClassCastException;
        //  623    630    630    631    Ljava/lang/IndexOutOfBoundsException;
        //  691    698    698    699    Any
        //  692    698    691    692    Any
        //  692    698    698    699    Any
        //  692    698    691    692    Any
        //  692    698    691    692    Ljava/util/ConcurrentModificationException;
        //  787    794    794    795    Any
        //  788    794    794    795    Any
        //  787    794    794    795    Any
        //  788    794    3      8      Ljava/lang/NumberFormatException;
        //  788    794    787    788    Any
        //  803    810    810    811    Any
        //  804    810    810    811    Any
        //  803    810    803    804    Any
        //  804    810    803    804    Ljava/lang/UnsupportedOperationException;
        //  804    810    3      8      Any
        //  1303   1309   1309   1310   Any
        //  1303   1309   3      8      Any
        //  1303   1309   1309   1310   Any
        //  1303   1309   1309   1310   Ljava/lang/NegativeArraySizeException;
        //  1303   1309   1309   1310   Ljava/lang/ClassCastException;
        //  1317   1323   1323   1324   Any
        //  1317   1323   1323   1324   Any
        //  1317   1323   1323   1324   Ljava/lang/EnumConstantNotPresentException;
        //  1317   1323   1323   1324   Ljava/lang/RuntimeException;
        //  1317   1323   1323   1324   Any
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
    
    public f7L() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2225\u1496\u8b30\ub3dc\uc98e\uec22\ub221\ue738\ud97c\ue9ea\ua6e1"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2205\u1496\u8b30\ub3dc\uc98e\uec22\ub221\ue738\ud97c\ue9ea\ua6e1"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    15: aload_0        
        //    16: new             Ldev/nuker/pyro/f0d;
        //    19: dup            
        //    20: ldc             "\u223a\u149c\u8b32\ub3d0\uc993\uec3f"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: ldc_w           "\u221a\u149c\u8b32\ub3d0\uc993\uec3f"
        //    28: invokestatic    invokestatic   !!! ERROR
        //    31: aconst_null    
        //    32: dconst_1       
        //    33: ldc2_w          0.1
        //    36: ldc2_w          2.0
        //    39: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //    42: putfield        dev/nuker/pyro/f7L.c:Ldev/nuker/pyro/f0d;
        //    45: aload_0        
        //    46: aload_0        
        //    47: getfield        dev/nuker/pyro/f7L.c:Ldev/nuker/pyro/f0d;
        //    50: invokevirtual   dev/nuker/pyro/f7L.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    53: pop            
        //    54: return         
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
    
    public static boolean c(final Block block) {
        return fbS.3U(null, 1949455827, block);
    }
}
