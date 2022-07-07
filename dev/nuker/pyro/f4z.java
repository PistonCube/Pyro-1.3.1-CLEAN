// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.inventory.EntityEquipmentSlot;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f4Z extends fH
{
    public f0d c;
    public f0f<f4X> c;
    public f0d 0;
    public f0a c;
    public f0f<f4Y> 0;
    public f0h c;
    public f0q<f4W> c;
    public boolean c;
    public fbu c;
    public fbu 0;
    
    public f4Z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2385\u1486\u8a81\ub3d6\uc9ca\ued90\ub229\ue6b7\ud97a"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23a5\u1486\u8a81\ub3d6\uc9ea\ued90\ub229\ue6b7\ud97a"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: getstatic       dev/nuker/pyro/fc.c:I
        //    15: ifge            23
        //    18: ldc             1768209675
        //    20: goto            25
        //    23: ldc             1148874365
        //    25: ldc             1590477201
        //    27: ixor           
        //    28: lookupswitch {
        //          933788826: 1316
        //          1261276975: 23
        //          default: 56
        //        }
        //    56: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    59: aload_0        
        //    60: new             Ldev/nuker/pyro/f0d;
        //    63: dup            
        //    64: ldc             "\u2380\u1496\u8a99\ub3d8\uc9d2"
        //    66: invokestatic    invokestatic   !!! ERROR
        //    69: ldc             "\u23a0\u1496\u8a99\ub3d8\uc9d2"
        //    71: invokestatic    invokestatic   !!! ERROR
        //    74: aconst_null    
        //    75: dconst_1       
        //    76: dconst_0       
        //    77: ldc2_w          5.0
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            91
        //    86: ldc             1064438578
        //    88: goto            93
        //    91: ldc             -700694402
        //    93: ldc             -1891561109
        //    95: ixor           
        //    96: lookupswitch {
        //          -1338828199: 91
        //          1501384981: 124
        //          default: 1338
        //        }
        //   124: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   127: getstatic       dev/nuker/pyro/fc.c:I
        //   130: ifge            138
        //   133: ldc             1374391047
        //   135: goto            140
        //   138: ldc             -2008856161
        //   140: ldc             683068624
        //   142: ixor           
        //   143: lookupswitch {
        //          -1594522289: 168
        //          2036156375: 138
        //          default: 1324
        //        }
        //   168: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0d;
        //   171: getstatic       dev/nuker/pyro/fc.0:I
        //   174: ifeq            182
        //   177: ldc             2101482842
        //   179: goto            184
        //   182: ldc             -313149782
        //   184: ldc             -1792210599
        //   186: ixor           
        //   187: lookupswitch {
        //          -395371517: 1312
        //          378191816: 182
        //          default: 212
        //        }
        //   212: aload_0        
        //   213: new             Ldev/nuker/pyro/f0f;
        //   216: dup            
        //   217: ldc             "\u2389\u149c\u8a91\ub3dc"
        //   219: invokestatic    invokestatic   !!! ERROR
        //   222: ldc             "\u23a9\u149c\u8a91\ub3dc"
        //   224: invokestatic    invokestatic   !!! ERROR
        //   227: aconst_null    
        //   228: getstatic       dev/nuker/pyro/f4X.c:Ldev/nuker/pyro/f4X;
        //   231: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   234: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0f;
        //   237: aload_0        
        //   238: new             Ldev/nuker/pyro/f0d;
        //   241: dup            
        //   242: ldc             "\u2380\u1486\u8a87\ub3d8\uc9c9\ued8b\ub228\ue6b1\ud97c\ue9a1\ua772\u1e4f\ue188"
        //   244: invokestatic    invokestatic   !!! ERROR
        //   247: ldc             "\u23a0\u1486\u8a87\ub3d8\uc9c9\ued8b\ub228\ue6b1\ud97c\ue9a1\ua772\u1e4f\ue188"
        //   249: invokestatic    invokestatic   !!! ERROR
        //   252: aconst_null    
        //   253: ldc2_w          20.0
        //   256: dconst_0       
        //   257: ldc2_w          100.0
        //   260: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   263: getstatic       dev/nuker/pyro/fc.1:I
        //   266: ifeq            274
        //   269: ldc             -886012041
        //   271: goto            276
        //   274: ldc             467684151
        //   276: ldc             -184857105
        //   278: ixor           
        //   279: lookupswitch {
        //          -1870417439: 274
        //          1070320280: 1298
        //          default: 304
        //        }
        //   304: putfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0d;
        //   307: aload_0        
        //   308: new             Ldev/nuker/pyro/f0a;
        //   311: dup            
        //   312: ldc             "\u2394\u1481\u8a90\ub3df\uc9ce\ued90\ub201\ue6b4\ud971\ue9ac\ua750\u1e4d"
        //   314: invokestatic    invokestatic   !!! ERROR
        //   317: ldc             "\u23b4\u1481\u8a90\ub3df\uc9ce\ued90\ub201\ue6b4\ud971\ue9ac\ua750\u1e4d"
        //   319: invokestatic    invokestatic   !!! ERROR
        //   322: aconst_null    
        //   323: iconst_0       
        //   324: getstatic       dev/nuker/pyro/fc.0:I
        //   327: ifeq            335
        //   330: ldc             -1050960261
        //   332: goto            337
        //   335: ldc             -1618583818
        //   337: ldc             -179723995
        //   339: ixor           
        //   340: lookupswitch {
        //          873611102: 335
        //          1792016339: 368
        //          default: 1326
        //        }
        //   368: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   371: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0a;
        //   374: aload_0        
        //   375: new             Ldev/nuker/pyro/f0f;
        //   378: dup            
        //   379: ldc             "\u2394\u1481\u8a9c\ub3d6\uc9d9\ued8b\ub230\ue6a1"
        //   381: getstatic       dev/nuker/pyro/fc.0:I
        //   384: ifeq            392
        //   387: ldc             -1945032558
        //   389: goto            394
        //   392: ldc             1869569107
        //   394: ldc             1141365349
        //   396: ixor           
        //   397: lookupswitch {
        //          -938020105: 392
        //          728270390: 424
        //          default: 1320
        //        }
        //   424: invokestatic    invokestatic   !!! ERROR
        //   427: ldc             "\u23b4\u1481\u8a9c\ub3d6\uc9d9\ued8b\ub230\ue6a1"
        //   429: getstatic       dev/nuker/pyro/fc.1:I
        //   432: ifeq            440
        //   435: ldc             1587835773
        //   437: goto            442
        //   440: ldc             -327497768
        //   442: ldc             -599884878
        //   444: ixor           
        //   445: lookupswitch {
        //          -2103834417: 1302
        //          1442754798: 440
        //          default: 472
        //        }
        //   472: invokestatic    invokestatic   !!! ERROR
        //   475: aconst_null    
        //   476: getstatic       dev/nuker/pyro/f4Y.c:Ldev/nuker/pyro/f4Y;
        //   479: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   482: putfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0f;
        //   485: aload_0        
        //   486: new             Ldev/nuker/pyro/f0h;
        //   489: dup            
        //   490: ldc             "\u2387\u149b\u8a90\ub3ca\uc9df\uedb1\ub233\ue6b9\ud978\ue993\ua747\u1e55"
        //   492: invokestatic    invokestatic   !!! ERROR
        //   495: ldc             "\u23a7\u149b\u8a90\ub3ca\uc9df\uedb1\ub233\ue6b9\ud978"
        //   497: getstatic       dev/nuker/pyro/fc.1:I
        //   500: ifeq            508
        //   503: ldc             1034671660
        //   505: goto            510
        //   508: ldc             -1347963953
        //   510: ldc             -28850453
        //   512: ixor           
        //   513: lookupswitch {
        //          -1007939385: 1318
        //          1236081949: 508
        //          default: 540
        //        }
        //   540: invokestatic    invokestatic   !!! ERROR
        //   543: aconst_null    
        //   544: iconst_m1      
        //   545: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   548: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0h;
        //   551: aload_0        
        //   552: new             Ldev/nuker/pyro/f0q;
        //   555: dup            
        //   556: ldc             "\u2387\u149b\u8a90\ub3ca\uc9df\uedb1\ub233\ue6b9\ud978\ue995\ua74d\u1e48\ue199"
        //   558: getstatic       dev/nuker/pyro/fc.c:I
        //   561: ifge            569
        //   564: ldc             -311647912
        //   566: goto            571
        //   569: ldc             -761152173
        //   571: ldc             1208613745
        //   573: ixor           
        //   574: lookupswitch {
        //          -1826661205: 569
        //          -1520084439: 1304
        //          default: 600
        //        }
        //   600: invokestatic    invokestatic   !!! ERROR
        //   603: ldc             "\u23a7\u149b\u8a90\ub3ca\uc9df\uedb1\ub233\ue6b9\ud978"
        //   605: invokestatic    invokestatic   !!! ERROR
        //   608: aconst_null    
        //   609: getstatic       dev/nuker/pyro/fc.0:I
        //   612: ifeq            620
        //   615: ldc             2135293645
        //   617: goto            622
        //   620: ldc             613514944
        //   622: ldc             -363351595
        //   624: ixor           
        //   625: lookupswitch {
        //          -1793962216: 620
        //          -825831659: 652
        //          default: 1328
        //        }
        //   652: getstatic       dev/nuker/pyro/f4W.c:Ldev/nuker/pyro/f4W;
        //   655: iconst_2       
        //   656: anewarray       Ljava/util/List;
        //   659: dup            
        //   660: iconst_0       
        //   661: iconst_0       
        //   662: anewarray       Ljava/lang/Object;
        //   665: getstatic       dev/nuker/pyro/fc.0:I
        //   668: ifeq            676
        //   671: ldc             -554725414
        //   673: goto            678
        //   676: ldc             548846709
        //   678: ldc             -1084010773
        //   680: ixor           
        //   681: lookupswitch {
        //          11268777: 676
        //          1636614449: 1294
        //          default: 708
        //        }
        //   708: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   711: aastore        
        //   712: dup            
        //   713: iconst_1       
        //   714: iconst_1       
        //   715: anewarray       Ldev/nuker/pyro/f0h;
        //   718: dup            
        //   719: iconst_0       
        //   720: aload_0        
        //   721: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0h;
        //   724: aastore        
        //   725: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   728: aastore        
        //   729: invokespecial   dev/nuker/pyro/f0q.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;[Ljava/util/List;)V
        //   732: getstatic       dev/nuker/pyro/fc.1:I
        //   735: ifeq            743
        //   738: ldc             -1515493315
        //   740: goto            745
        //   743: ldc             -75490957
        //   745: ldc             -707639886
        //   747: ixor           
        //   748: lookupswitch {
        //          777149633: 776
        //          1886989711: 743
        //          default: 1306
        //        }
        //   776: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0q;
        //   779: aload_0        
        //   780: iconst_0       
        //   781: putfield        dev/nuker/pyro/f4Z.c:Z
        //   784: aload_0        
        //   785: new             Ldev/nuker/pyro/fbu;
        //   788: dup            
        //   789: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   792: putfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/fbu;
        //   795: aload_0        
        //   796: new             Ldev/nuker/pyro/fbu;
        //   799: dup            
        //   800: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   803: putfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/fbu;
        //   806: aload_0        
        //   807: getstatic       dev/nuker/pyro/fc.1:I
        //   810: ifeq            818
        //   813: ldc             -525282832
        //   815: goto            820
        //   818: ldc             -724608486
        //   820: ldc             -1863723600
        //   822: ixor           
        //   823: lookupswitch {
        //          -1713692907: 818
        //          1884881984: 1334
        //          default: 848
        //        }
        //   848: aload_0        
        //   849: getstatic       dev/nuker/pyro/fc.c:I
        //   852: ifge            860
        //   855: ldc             -1475327180
        //   857: goto            862
        //   860: ldc             -469901375
        //   862: ldc             -1541506448
        //   864: ixor           
        //   865: lookupswitch {
        //          202256708: 860
        //          1206101425: 892
        //          default: 1330
        //        }
        //   892: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0d;
        //   895: getstatic       dev/nuker/pyro/fc.c:I
        //   898: ifge            906
        //   901: ldc             -2116527434
        //   903: goto            908
        //   906: ldc             563631301
        //   908: ldc             -198818693
        //   910: ixor           
        //   911: lookupswitch {
        //          -131099612: 906
        //          1979588301: 1300
        //          default: 936
        //        }
        //   936: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   939: pop            
        //   940: aload_0        
        //   941: aload_0        
        //   942: getstatic       dev/nuker/pyro/fc.0:I
        //   945: ifeq            953
        //   948: ldc             -565939898
        //   950: goto            955
        //   953: ldc             -891978207
        //   955: ldc             713359689
        //   957: ixor           
        //   958: lookupswitch {
        //          -531595416: 984
        //          -188649457: 953
        //          default: 1310
        //        }
        //   984: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0f;
        //   987: getstatic       dev/nuker/pyro/fc.1:I
        //   990: ifeq            998
        //   993: ldc             609593117
        //   995: goto            1000
        //   998: ldc             2042312573
        //  1000: ldc             -1469281403
        //  1002: ixor           
        //  1003: lookupswitch {
        //          -1942410088: 998
        //          -774390536: 1028
        //          default: 1314
        //        }
        //  1028: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1031: pop            
        //  1032: aload_0        
        //  1033: aload_0        
        //  1034: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0d;
        //  1037: getstatic       dev/nuker/pyro/fc.0:I
        //  1040: ifeq            1048
        //  1043: ldc             -1787283896
        //  1045: goto            1050
        //  1048: ldc             -739221792
        //  1050: ldc             -1990915863
        //  1052: ixor           
        //  1053: lookupswitch {
        //          472727201: 1296
        //          797379253: 1048
        //          default: 1080
        //        }
        //  1080: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1083: pop            
        //  1084: getstatic       dev/nuker/pyro/fc.1:I
        //  1087: ifeq            1095
        //  1090: ldc             1137081994
        //  1092: goto            1097
        //  1095: ldc             594175084
        //  1097: ldc             130980092
        //  1099: ixor           
        //  1100: lookupswitch {
        //          614792336: 1128
        //          1141433974: 1095
        //          default: 1332
        //        }
        //  1128: aload_0        
        //  1129: aload_0        
        //  1130: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0a;
        //  1133: getstatic       dev/nuker/pyro/fc.0:I
        //  1136: ifeq            1144
        //  1139: ldc             1009182212
        //  1141: goto            1146
        //  1144: ldc             437363717
        //  1146: ldc             -1056319251
        //  1148: ixor           
        //  1149: lookupswitch {
        //          -47235351: 1322
        //          759283290: 1144
        //          default: 1176
        //        }
        //  1176: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1179: pop            
        //  1180: aload_0        
        //  1181: aload_0        
        //  1182: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0f;
        //  1185: getstatic       dev/nuker/pyro/fc.0:I
        //  1188: ifeq            1196
        //  1191: ldc             418139499
        //  1193: goto            1198
        //  1196: ldc             -2120271698
        //  1198: ldc             -313089005
        //  1200: ixor           
        //  1201: lookupswitch {
        //          -172299912: 1196
        //          1825152189: 1228
        //          default: 1336
        //        }
        //  1228: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1231: pop            
        //  1232: aload_0        
        //  1233: aload_0        
        //  1234: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0q;
        //  1237: invokevirtual   dev/nuker/pyro/f4Z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1240: pop            
        //  1241: getstatic       dev/nuker/pyro/fc.c:I
        //  1244: ifge            1252
        //  1247: ldc             -1076955543
        //  1249: goto            1254
        //  1252: ldc             -1137129938
        //  1254: ldc             -828713647
        //  1256: ixor           
        //  1257: lookupswitch {
        //          1901339448: 1252
        //          1923224447: 1284
        //          default: 1308
        //        }
        //  1284: invokestatic    dev/nuker/pyro/Pyro.getEventManager:()Ldev/nuker/pyro/f05;
        //  1287: aload_0        
        //  1288: invokeinterface dev/nuker/pyro/f05.0:(Ljava/lang/Object;)V
        //  1293: return         
        //  1294: aconst_null    
        //  1295: athrow         
        //  1296: aconst_null    
        //  1297: athrow         
        //  1298: aconst_null    
        //  1299: athrow         
        //  1300: aconst_null    
        //  1301: athrow         
        //  1302: aconst_null    
        //  1303: athrow         
        //  1304: aconst_null    
        //  1305: athrow         
        //  1306: aconst_null    
        //  1307: athrow         
        //  1308: aconst_null    
        //  1309: athrow         
        //  1310: aconst_null    
        //  1311: athrow         
        //  1312: aconst_null    
        //  1313: athrow         
        //  1314: aconst_null    
        //  1315: athrow         
        //  1316: aconst_null    
        //  1317: athrow         
        //  1318: aconst_null    
        //  1319: athrow         
        //  1320: aconst_null    
        //  1321: athrow         
        //  1322: aconst_null    
        //  1323: athrow         
        //  1324: aconst_null    
        //  1325: athrow         
        //  1326: aconst_null    
        //  1327: athrow         
        //  1328: aconst_null    
        //  1329: athrow         
        //  1330: aconst_null    
        //  1331: athrow         
        //  1332: aconst_null    
        //  1333: athrow         
        //  1334: aconst_null    
        //  1335: athrow         
        //  1336: aconst_null    
        //  1337: athrow         
        //  1338: aconst_null    
        //  1339: athrow         
        //    StackMapTable: 00 5C FF 00 17 00 01 06 00 04 06 07 00 E8 07 00 E8 05 FF 00 01 00 01 06 00 05 06 07 00 E8 07 00 E8 05 01 FF 00 1E 00 01 06 00 04 06 07 00 E8 07 00 E8 05 FF 00 22 00 01 07 00 03 00 09 07 00 03 08 00 3C 08 00 3C 07 00 E8 07 00 E8 05 03 03 03 FF 00 01 00 01 07 00 03 00 0A 07 00 03 08 00 3C 08 00 3C 07 00 E8 07 00 E8 05 03 03 03 01 FF 00 1E 00 01 07 00 03 00 09 07 00 03 08 00 3C 08 00 3C 07 00 E8 07 00 E8 05 03 03 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 29 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 29 0D 41 01 1B FF 00 3D 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 29 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 01 34 08 01 34 07 00 E8 07 00 E8 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 01 34 08 01 34 07 00 E8 07 00 E8 05 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 01 34 08 01 34 07 00 E8 07 00 E8 05 01 FF 00 17 00 01 07 00 03 00 04 07 00 03 08 01 77 08 01 77 07 00 E8 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 77 08 01 77 07 00 E8 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 01 77 08 01 77 07 00 E8 FF 00 0F 00 01 07 00 03 00 05 07 00 03 08 01 77 08 01 77 07 00 E8 07 00 E8 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 01 77 08 01 77 07 00 E8 07 00 E8 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 01 77 08 01 77 07 00 E8 07 00 E8 FF 00 23 00 01 07 00 03 00 05 07 00 03 08 01 E6 08 01 E6 07 00 E8 07 00 E8 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 01 E6 08 01 E6 07 00 E8 07 00 E8 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 01 E6 08 01 E6 07 00 E8 07 00 E8 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 02 28 08 02 28 07 00 E8 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 02 28 08 02 28 07 00 E8 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 02 28 08 02 28 07 00 E8 FF 00 13 00 01 07 00 03 00 06 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 FF 00 17 00 01 07 00 03 00 0B 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 07 00 98 07 00 EA 07 00 EA 01 07 00 EC FF 00 01 00 01 07 00 03 00 0C 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 07 00 98 07 00 EA 07 00 EA 01 07 00 EC 01 FF 00 1D 00 01 07 00 03 00 0B 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 07 00 98 07 00 EA 07 00 EA 01 07 00 EC FF 00 22 00 01 07 00 03 00 02 07 00 03 07 00 8E FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 8E 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 8E 69 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5B 07 00 03 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 29 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 10 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 41 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 29 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 29 0E 41 01 1E FF 00 0F 00 01 07 00 03 00 02 07 00 03 07 00 61 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 61 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 61 FF 00 13 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 41 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 41 17 41 01 1D FF 00 09 00 01 07 00 03 00 0B 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 07 00 98 07 00 EA 07 00 EA 01 07 00 EC FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 77 08 01 77 07 00 E8 07 00 E8 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 02 28 08 02 28 07 00 E8 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 8E 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 01 00 01 06 00 04 06 07 00 E8 07 00 E8 05 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 E6 08 01 E6 07 00 E8 07 00 E8 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 77 08 01 77 07 00 E8 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 61 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 29 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 01 34 08 01 34 07 00 E8 07 00 E8 05 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 02 28 08 02 28 07 00 E8 07 00 E8 05 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 00 3C 08 00 3C 07 00 E8 07 00 E8 05 03 03 03
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
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5Z(this, 7889786, b, entityPlayerSP, world);
    }
    
    public void 0(final Boolean b) {
        fbS.3y(this, 532118460, b);
    }
    
    static {
        throw t;
    }
    
    public void 2(final Boolean b) {
        fbS.3u(this, 186232097, b);
    }
    
    public void 1(final Boolean b) {
        fbS.3t(this, 173277517, b);
    }
    
    public void c(final Boolean b) {
        fbS.3u(this, 186232096, b);
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
        //     4: ifnull          3803
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            3795
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3787
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           1355843280
        //    33: goto            39
        //    36: ldc_w           -2044535965
        //    39: ldc_w           241732193
        //    42: ixor           
        //    43: lookupswitch {
        //          -2008395518: 68
        //          1589120177: 36
        //          default: 3762
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f4Z.c:Z
        //    72: ifeq            81
        //    75: ldc_w           -801753255
        //    78: goto            84
        //    81: ldc_w           -801753254
        //    84: ldc_w           188075608
        //    87: ixor           
        //    88: tableswitch {
        //          -1240993278: 112
        //          -1240993277: 113
        //          default: 75
        //        }
        //   112: return         
        //   113: aload_0        
        //   114: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   117: getstatic       dev/nuker/pyro/fc.0:I
        //   120: ifeq            129
        //   123: ldc_w           -1646297240
        //   126: goto            132
        //   129: ldc_w           -39596637
        //   132: ldc_w           -77218112
        //   135: ixor           
        //   136: lookupswitch {
        //          -5914217: 129
        //          1723515304: 3740
        //          default: 164
        //        }
        //   164: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   167: instanceof      Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   170: ifeq            361
        //   173: getstatic       dev/nuker/pyro/fc.0:I
        //   176: ifeq            185
        //   179: ldc_w           -1761088898
        //   182: goto            188
        //   185: ldc_w           -1029250845
        //   188: ldc_w           -360308383
        //   191: ixor           
        //   192: lookupswitch {
        //          -415862065: 185
        //          2105658143: 3750
        //          default: 220
        //        }
        //   220: aload_0        
        //   221: getstatic       dev/nuker/pyro/fc.1:I
        //   224: ifeq            233
        //   227: ldc_w           -2102700650
        //   230: goto            236
        //   233: ldc_w           506071842
        //   236: ldc_w           193801286
        //   239: ixor           
        //   240: lookupswitch {
        //          -1993967152: 233
        //          363276132: 268
        //          default: 3736
        //        }
        //   268: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   271: getstatic       dev/nuker/pyro/fc.0:I
        //   274: ifeq            283
        //   277: ldc_w           1436870200
        //   280: goto            286
        //   283: ldc_w           -425842425
        //   286: ldc_w           83045902
        //   289: ixor           
        //   290: lookupswitch {
        //          -1480879281: 283
        //          1364707382: 3722
        //          default: 316
        //        }
        //   316: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   319: instanceof      Lnet/minecraft/client/gui/inventory/GuiInventory;
        //   322: ifne            331
        //   325: ldc_w           -712500657
        //   328: goto            334
        //   331: ldc_w           -712500664
        //   334: ldc_w           -1170056060
        //   337: ixor           
        //   338: tableswitch {
        //          -543912554: 360
        //          -543912553: 361
        //          default: 325
        //        }
        //   360: return         
        //   361: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/faQ;
        //   364: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/fw;
        //   367: goto            371
        //   370: athrow         
        //   371: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   374: goto            378
        //   377: athrow         
        //   378: checkcast       Ljava/lang/Boolean;
        //   381: getstatic       dev/nuker/pyro/fc.1:I
        //   384: ifeq            393
        //   387: ldc_w           -1709284104
        //   390: goto            396
        //   393: ldc_w           -2053202761
        //   396: ldc_w           1844516830
        //   399: ixor           
        //   400: lookupswitch {
        //          -135302362: 3756
        //          1158967445: 393
        //          default: 428
        //        }
        //   428: goto            432
        //   431: athrow         
        //   432: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   435: goto            439
        //   438: athrow         
        //   439: ifeq            518
        //   442: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/faQ;
        //   445: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   448: goto            452
        //   451: athrow         
        //   452: invokevirtual   dev/nuker/pyro/f0h.c:()Z
        //   455: goto            459
        //   458: athrow         
        //   459: ifeq            518
        //   462: getstatic       dev/nuker/pyro/fc.0:I
        //   465: ifeq            474
        //   468: ldc_w           507416262
        //   471: goto            477
        //   474: ldc_w           1324570255
        //   477: ldc_w           737502010
        //   480: ixor           
        //   481: lookupswitch {
        //          902557180: 474
        //          1694905781: 508
        //          default: 3690
        //        }
        //   508: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/faQ;
        //   511: getfield        dev/nuker/pyro/faQ.c:Z
        //   514: ifeq            518
        //   517: return         
        //   518: iconst_0       
        //   519: istore_2       
        //   520: getstatic       dev/nuker/pyro/f4V.c:[I
        //   523: aload_0        
        //   524: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0q;
        //   527: goto            531
        //   530: athrow         
        //   531: invokevirtual   dev/nuker/pyro/f0q.0:()Ldev/nuker/pyro/f0f;
        //   534: goto            538
        //   537: athrow         
        //   538: goto            542
        //   541: athrow         
        //   542: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   545: goto            549
        //   548: athrow         
        //   549: checkcast       Ldev/nuker/pyro/f4W;
        //   552: goto            556
        //   555: athrow         
        //   556: invokevirtual   dev/nuker/pyro/f4W.ordinal:()I
        //   559: goto            563
        //   562: athrow         
        //   563: iaload         
        //   564: lookupswitch {
        //                1: 592
        //                2: 798
        //          default: 860
        //        }
        //   592: aload_0        
        //   593: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   596: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   599: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   602: getstatic       dev/nuker/pyro/fc.0:I
        //   605: ifeq            614
        //   608: ldc_w           -1708219296
        //   611: goto            617
        //   614: ldc_w           374340912
        //   617: ldc_w           1804116543
        //   620: ixor           
        //   621: lookupswitch {
        //          -1224361762: 614
        //          -240777633: 3730
        //          default: 648
        //        }
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   655: goto            659
        //   658: athrow         
        //   659: bipush          6
        //   661: goto            665
        //   664: athrow         
        //   665: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   668: goto            672
        //   671: athrow         
        //   672: checkcast       Lnet/minecraft/item/ItemStack;
        //   675: astore_3       
        //   676: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7l;
        //   679: getstatic       dev/nuker/pyro/fc.1:I
        //   682: ifeq            691
        //   685: ldc_w           2112801627
        //   688: goto            694
        //   691: ldc_w           -428405854
        //   694: ldc_w           1889029564
        //   697: ixor           
        //   698: lookupswitch {
        //          -1762703842: 724
        //          225871591: 691
        //          default: 3772
        //        }
        //   724: getfield        dev/nuker/pyro/f7l.c:Ldev/nuker/pyro/fw;
        //   727: goto            731
        //   730: athrow         
        //   731: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   734: goto            738
        //   737: athrow         
        //   738: checkcast       Ljava/lang/Boolean;
        //   741: goto            745
        //   744: athrow         
        //   745: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   748: goto            752
        //   751: athrow         
        //   752: aload_3        
        //   753: goto            757
        //   756: athrow         
        //   757: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   760: goto            764
        //   763: athrow         
        //   764: instanceof      Lnet/minecraft/item/ItemElytra;
        //   767: ifeq            789
        //   770: aload_3        
        //   771: goto            775
        //   774: athrow         
        //   775: invokestatic    net/minecraft/item/ItemElytra.func_185069_d:(Lnet/minecraft/item/ItemStack;)Z
        //   778: goto            782
        //   781: athrow         
        //   782: ifeq            789
        //   785: iconst_1       
        //   786: goto            790
        //   789: iconst_0       
        //   790: if_icmpeq       860
        //   793: iconst_1       
        //   794: istore_2       
        //   795: goto            860
        //   798: aload_0        
        //   799: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0h;
        //   802: getstatic       dev/nuker/pyro/fc.0:I
        //   805: ifeq            814
        //   808: ldc_w           60017679
        //   811: goto            817
        //   814: ldc_w           1880210375
        //   817: ldc_w           1327115090
        //   820: ixor           
        //   821: lookupswitch {
        //          1057722517: 848
        //          1284106077: 814
        //          default: 3716
        //        }
        //   848: goto            852
        //   851: athrow         
        //   852: invokevirtual   dev/nuker/pyro/f0h.c:()Z
        //   855: goto            859
        //   858: athrow         
        //   859: istore_2       
        //   860: iload_2        
        //   861: ifeq            3355
        //   864: getstatic       dev/nuker/pyro/fc.c:I
        //   867: ifge            876
        //   870: ldc_w           1100088958
        //   873: goto            879
        //   876: ldc_w           -1477265968
        //   879: ldc_w           636061944
        //   882: ixor           
        //   883: lookupswitch {
        //          -1483472893: 876
        //          1685819014: 3752
        //          default: 908
        //        }
        //   908: aload_0        
        //   909: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/fbu;
        //   912: ldc2_w          100.0
        //   915: getstatic       dev/nuker/pyro/fc.1:I
        //   918: ifeq            927
        //   921: ldc_w           1122246234
        //   924: goto            930
        //   927: ldc_w           -758658856
        //   930: ldc_w           1262520533
        //   933: ixor           
        //   934: lookupswitch {
        //          -1719189491: 960
        //          161781391: 927
        //          default: 3746
        //        }
        //   960: goto            964
        //   963: athrow         
        //   964: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   967: goto            971
        //   970: athrow         
        //   971: ifeq            3355
        //   974: aload_0        
        //   975: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   978: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   981: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   984: getstatic       dev/nuker/pyro/fc.1:I
        //   987: ifeq            996
        //   990: ldc_w           -101503725
        //   993: goto            999
        //   996: ldc_w           -994597374
        //   999: ldc_w           615560806
        //  1002: ixor           
        //  1003: lookupswitch {
        //          -582771851: 996
        //          -536407964: 1028
        //          default: 3748
        //        }
        //  1028: goto            1032
        //  1031: athrow         
        //  1032: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //  1035: goto            1039
        //  1038: athrow         
        //  1039: bipush          6
        //  1041: goto            1045
        //  1044: athrow         
        //  1045: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: checkcast       Lnet/minecraft/item/ItemStack;
        //  1055: astore_3       
        //  1056: iconst_0       
        //  1057: getstatic       dev/nuker/pyro/fc.0:I
        //  1060: ifeq            1069
        //  1063: ldc_w           -1627960558
        //  1066: goto            1072
        //  1069: ldc_w           1947739729
        //  1072: ldc_w           2110109310
        //  1075: ixor           
        //  1076: lookupswitch {
        //          -483197588: 3754
        //          569253132: 1069
        //          default: 1104
        //        }
        //  1104: istore          4
        //  1106: aload_0        
        //  1107: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0q;
        //  1110: goto            1114
        //  1113: athrow         
        //  1114: invokevirtual   dev/nuker/pyro/f0q.0:()Ldev/nuker/pyro/f0f;
        //  1117: goto            1121
        //  1120: athrow         
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: getstatic       dev/nuker/pyro/f4W.0:Ldev/nuker/pyro/f4W;
        //  1135: if_acmpne       1174
        //  1138: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7l;
        //  1141: getfield        dev/nuker/pyro/f7l.c:Ldev/nuker/pyro/fw;
        //  1144: goto            1148
        //  1147: athrow         
        //  1148: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  1151: goto            1155
        //  1154: athrow         
        //  1155: checkcast       Ljava/lang/Boolean;
        //  1158: goto            1162
        //  1161: athrow         
        //  1162: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1165: goto            1169
        //  1168: athrow         
        //  1169: istore          4
        //  1171: goto            1285
        //  1174: aload_3        
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  1182: goto            1186
        //  1185: athrow         
        //  1186: ifeq            1223
        //  1189: aload_0        
        //  1190: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0a;
        //  1193: goto            1197
        //  1196: athrow         
        //  1197: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1200: goto            1204
        //  1203: athrow         
        //  1204: checkcast       Ljava/lang/Boolean;
        //  1207: goto            1211
        //  1210: athrow         
        //  1211: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1214: goto            1218
        //  1217: athrow         
        //  1218: istore          4
        //  1220: goto            1285
        //  1223: getstatic       dev/nuker/pyro/fc.1:I
        //  1226: ifeq            1235
        //  1229: ldc_w           732018995
        //  1232: goto            1238
        //  1235: ldc_w           1870826164
        //  1238: ldc_w           -26078343
        //  1241: ixor           
        //  1242: lookupswitch {
        //          -1846502963: 1268
        //          -707548598: 1235
        //          default: 3718
        //        }
        //  1268: aload_3        
        //  1269: goto            1273
        //  1272: athrow         
        //  1273: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1276: goto            1280
        //  1279: athrow         
        //  1280: instanceof      Lnet/minecraft/item/ItemArmor;
        //  1283: istore          4
        //  1285: iconst_m1      
        //  1286: istore          5
        //  1288: iconst_0       
        //  1289: getstatic       dev/nuker/pyro/fc.c:I
        //  1292: ifge            1301
        //  1295: ldc_w           -1053876949
        //  1298: goto            1304
        //  1301: ldc_w           715456289
        //  1304: ldc_w           -2136391326
        //  1307: ixor           
        //  1308: lookupswitch {
        //          289418692: 1301
        //          1099324489: 3758
        //          default: 1336
        //        }
        //  1336: istore          6
        //  1338: bipush          9
        //  1340: istore          7
        //  1342: iload           7
        //  1344: bipush          44
        //  1346: if_icmpge       2850
        //  1349: aload_0        
        //  1350: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //  1353: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1356: getstatic       dev/nuker/pyro/fc.0:I
        //  1359: ifeq            1368
        //  1362: ldc_w           1512218962
        //  1365: goto            1371
        //  1368: ldc_w           1924068249
        //  1371: ldc_w           1698448535
        //  1374: ixor           
        //  1375: lookupswitch {
        //          395491086: 1400
        //          1058989509: 1368
        //          default: 3766
        //        }
        //  1400: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //  1403: goto            1407
        //  1406: athrow         
        //  1407: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: getstatic       dev/nuker/pyro/fc.c:I
        //  1417: ifge            1426
        //  1420: ldc_w           -1334713382
        //  1423: goto            1429
        //  1426: ldc_w           870137354
        //  1429: ldc_w           -1902817502
        //  1432: ixor           
        //  1433: lookupswitch {
        //          1055173880: 3724
        //          1100395675: 1426
        //          default: 1460
        //        }
        //  1460: iload           7
        //  1462: goto            1466
        //  1465: athrow         
        //  1466: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  1469: goto            1473
        //  1472: athrow         
        //  1473: checkcast       Lnet/minecraft/item/ItemStack;
        //  1476: astore          8
        //  1478: aload           8
        //  1480: goto            1484
        //  1483: athrow         
        //  1484: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  1487: goto            1491
        //  1490: athrow         
        //  1491: ifeq            1497
        //  1494: goto            2844
        //  1497: iload           4
        //  1499: ifeq            1671
        //  1502: getstatic       dev/nuker/pyro/fc.0:I
        //  1505: ifeq            1514
        //  1508: ldc_w           85634565
        //  1511: goto            1517
        //  1514: ldc_w           -1018006776
        //  1517: ldc_w           782312572
        //  1520: ixor           
        //  1521: lookupswitch {
        //          733710969: 3760
        //          1697408825: 1514
        //          default: 1548
        //        }
        //  1548: aload           8
        //  1550: goto            1554
        //  1553: athrow         
        //  1554: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1557: goto            1561
        //  1560: athrow         
        //  1561: instanceof      Lnet/minecraft/item/ItemElytra;
        //  1564: ifeq            1671
        //  1567: aload           8
        //  1569: goto            1573
        //  1572: athrow         
        //  1573: invokestatic    net/minecraft/item/ItemElytra.func_185069_d:(Lnet/minecraft/item/ItemStack;)Z
        //  1576: goto            1580
        //  1579: athrow         
        //  1580: ifeq            1589
        //  1583: ldc_w           -262171073
        //  1586: goto            1592
        //  1589: ldc_w           -262171074
        //  1592: ldc_w           -1544286965
        //  1595: ixor           
        //  1596: tableswitch {
        //          -1487456664: 1620
        //          -1487456663: 1671
        //          default: 1583
        //        }
        //  1620: getstatic       dev/nuker/pyro/fc.1:I
        //  1623: ifeq            1632
        //  1626: ldc_w           -1017236967
        //  1629: goto            1635
        //  1632: ldc_w           -484119330
        //  1635: ldc_w           1470600151
        //  1638: ixor           
        //  1639: lookupswitch {
        //          -1795579442: 3710
        //          -1087167002: 1632
        //          default: 1664
        //        }
        //  1664: iload           7
        //  1666: istore          5
        //  1668: goto            2850
        //  1671: getstatic       dev/nuker/pyro/fc.0:I
        //  1674: ifeq            1683
        //  1677: ldc_w           -516820388
        //  1680: goto            1686
        //  1683: ldc_w           -814461164
        //  1686: ldc_w           -977995252
        //  1689: ixor           
        //  1690: lookupswitch {
        //          180401432: 1716
        //          612698192: 1683
        //          default: 3684
        //        }
        //  1716: aload           8
        //  1718: goto            1722
        //  1721: athrow         
        //  1722: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1725: goto            1729
        //  1728: athrow         
        //  1729: instanceof      Lnet/minecraft/item/ItemArmor;
        //  1732: ifeq            2844
        //  1735: aload           8
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: checkcast       Lnet/minecraft/item/ItemArmor;
        //  1751: astore          9
        //  1753: getstatic       dev/nuker/pyro/fc.0:I
        //  1756: ifeq            1765
        //  1759: ldc_w           1420494132
        //  1762: goto            1768
        //  1765: ldc_w           -755774345
        //  1768: ldc_w           106737949
        //  1771: ixor           
        //  1772: lookupswitch {
        //          -726696598: 1800
        //          1391965225: 1765
        //          default: 3700
        //        }
        //  1800: aload           9
        //  1802: getstatic       dev/nuker/pyro/fc.1:I
        //  1805: ifeq            1814
        //  1808: ldc_w           -701325002
        //  1811: goto            1817
        //  1814: ldc_w           -428197942
        //  1817: ldc_w           1923751921
        //  1820: ixor           
        //  1821: lookupswitch {
        //          -1533493561: 3694
        //          -448355874: 1814
        //          default: 1848
        //        }
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: invokevirtual   net/minecraft/item/ItemArmor.func_185083_B_:()Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  1855: goto            1859
        //  1858: athrow         
        //  1859: getstatic       dev/nuker/pyro/fc.1:I
        //  1862: ifeq            1871
        //  1865: ldc_w           -1079934008
        //  1868: goto            1874
        //  1871: ldc_w           -987069528
        //  1874: ldc_w           -368512917
        //  1877: ixor           
        //  1878: lookupswitch {
        //          1437168547: 3768
        //          2050762961: 1871
        //          default: 1904
        //        }
        //  1904: getstatic       net/minecraft/inventory/EntityEquipmentSlot.CHEST:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  1907: if_acmpne       2844
        //  1910: aload           8
        //  1912: goto            1916
        //  1915: athrow         
        //  1916: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //  1919: goto            1923
        //  1922: athrow         
        //  1923: getstatic       dev/nuker/pyro/fc.1:I
        //  1926: ifeq            1935
        //  1929: ldc_w           -120361505
        //  1932: goto            1938
        //  1935: ldc_w           1505017115
        //  1938: ldc_w           48259627
        //  1941: ixor           
        //  1942: lookupswitch {
        //          -1302326520: 1935
        //          -97316876: 3686
        //          default: 1968
        //        }
        //  1968: goto            1972
        //  1971: athrow         
        //  1972: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1977: goto            1981
        //  1980: athrow         
        //  1981: goto            1985
        //  1984: athrow         
        //  1985: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1990: goto            1994
        //  1993: athrow         
        //  1994: astore          10
        //  1996: getstatic       dev/nuker/pyro/fc.0:I
        //  1999: ifeq            2008
        //  2002: ldc_w           621353231
        //  2005: goto            2011
        //  2008: ldc_w           1593358976
        //  2011: ldc_w           -339971396
        //  2014: ixor           
        //  2015: lookupswitch {
        //          -826971213: 3682
        //          1572205349: 2008
        //          default: 2040
        //        }
        //  2040: aload           10
        //  2042: goto            2046
        //  2045: athrow         
        //  2046: invokeinterface java/util/Iterator.hasNext:()Z
        //  2051: goto            2055
        //  2054: athrow         
        //  2055: ifeq            2789
        //  2058: aload           10
        //  2060: getstatic       dev/nuker/pyro/fc.c:I
        //  2063: ifge            2072
        //  2066: ldc_w           1762112583
        //  2069: goto            2075
        //  2072: ldc_w           1586368229
        //  2075: ldc_w           721027836
        //  2078: ixor           
        //  2079: lookupswitch {
        //          1140700859: 2072
        //          1953762329: 2104
        //          default: 3774
        //        }
        //  2104: goto            2108
        //  2107: athrow         
        //  2108: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2113: goto            2117
        //  2116: athrow         
        //  2117: checkcast       Lnet/minecraft/enchantment/Enchantment;
        //  2120: astore          11
        //  2122: aload           11
        //  2124: instanceof      Lnet/minecraft/enchantment/EnchantmentProtection;
        //  2127: ifeq            2786
        //  2130: aload           11
        //  2132: checkcast       Lnet/minecraft/enchantment/EnchantmentProtection;
        //  2135: getstatic       dev/nuker/pyro/fc.1:I
        //  2138: ifeq            2147
        //  2141: ldc_w           -966732216
        //  2144: goto            2150
        //  2147: ldc_w           -646887767
        //  2150: ldc_w           -1631537706
        //  2153: ixor           
        //  2154: lookupswitch {
        //          1202844543: 2180
        //          1486906270: 2147
        //          default: 3734
        //        }
        //  2180: astore          12
        //  2182: aload           11
        //  2184: getstatic       dev/nuker/pyro/fc.0:I
        //  2187: ifeq            2196
        //  2190: ldc_w           10720453
        //  2193: goto            2199
        //  2196: ldc_w           973606404
        //  2199: ldc_w           -680319147
        //  2202: ixor           
        //  2203: lookupswitch {
        //          -674188400: 2196
        //          -310695599: 2228
        //          default: 3776
        //        }
        //  2228: aload           8
        //  2230: goto            2234
        //  2233: athrow         
        //  2234: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77506_a:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //  2237: goto            2241
        //  2240: athrow         
        //  2241: istore          13
        //  2243: getstatic       dev/nuker/pyro/f4V.0:[I
        //  2246: aload           12
        //  2248: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2251: getstatic       dev/nuker/pyro/fc.c:I
        //  2254: ifge            2263
        //  2257: ldc_w           1231439786
        //  2260: goto            2266
        //  2263: ldc_w           1503492985
        //  2266: ldc_w           -1385027928
        //  2269: ixor           
        //  2270: lookupswitch {
        //          -1820963485: 2263
        //          -468426494: 3696
        //          default: 2296
        //        }
        //  2296: goto            2300
        //  2299: athrow         
        //  2300: invokevirtual   net/minecraft/enchantment/EnchantmentProtection$Type.ordinal:()I
        //  2303: goto            2307
        //  2306: athrow         
        //  2307: iaload         
        //  2308: lookupswitch {
        //                1: 2336
        //                2: 2336
        //          default: 2443
        //        }
        //  2336: iload           13
        //  2338: iload           6
        //  2340: if_icmple       2443
        //  2343: getstatic       dev/nuker/pyro/fc.c:I
        //  2346: ifge            2355
        //  2349: ldc_w           1852672455
        //  2352: goto            2358
        //  2355: ldc_w           -1139281462
        //  2358: ldc_w           -778475782
        //  2361: ixor           
        //  2362: lookupswitch {
        //          -1074467011: 2355
        //          1838061360: 2388
        //          default: 3726
        //        }
        //  2388: iload           7
        //  2390: istore          5
        //  2392: getstatic       dev/nuker/pyro/fc.1:I
        //  2395: ifeq            2404
        //  2398: ldc_w           1059952529
        //  2401: goto            2407
        //  2404: ldc_w           2050318477
        //  2407: ldc_w           -1432983643
        //  2410: ixor           
        //  2411: lookupswitch {
        //          -1782845388: 3706
        //          -1256417198: 2404
        //          default: 2436
        //        }
        //  2436: iload           13
        //  2438: istore          6
        //  2440: goto            1996
        //  2443: iload           13
        //  2445: getstatic       dev/nuker/pyro/fc.0:I
        //  2448: ifeq            2457
        //  2451: ldc_w           -671414981
        //  2454: goto            2460
        //  2457: ldc_w           1756958471
        //  2460: ldc_w           1258293224
        //  2463: ixor           
        //  2464: lookupswitch {
        //          -1661271341: 2457
        //          599329007: 2492
        //          default: 3712
        //        }
        //  2492: iload           6
        //  2494: if_icmpne       2786
        //  2497: getstatic       dev/nuker/pyro/fc.0:I
        //  2500: ifeq            2509
        //  2503: ldc_w           -850202457
        //  2506: goto            2512
        //  2509: ldc_w           1718207622
        //  2512: ldc_w           -2101194501
        //  2515: ixor           
        //  2516: lookupswitch {
        //          -458517379: 2544
        //          1334878300: 2509
        //          default: 3742
        //        }
        //  2544: getstatic       dev/nuker/pyro/f4V.1:[I
        //  2547: getstatic       dev/nuker/pyro/fc.1:I
        //  2550: ifeq            2559
        //  2553: ldc_w           788813071
        //  2556: goto            2562
        //  2559: ldc_w           -153781111
        //  2562: ldc_w           -1715491858
        //  2565: ixor           
        //  2566: lookupswitch {
        //          -1229193503: 2559
        //          1869272935: 2592
        //          default: 3732
        //        }
        //  2592: aload_0        
        //  2593: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0f;
        //  2596: goto            2600
        //  2599: athrow         
        //  2600: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2603: goto            2607
        //  2606: athrow         
        //  2607: checkcast       Ldev/nuker/pyro/f4Y;
        //  2610: goto            2614
        //  2613: athrow         
        //  2614: invokevirtual   dev/nuker/pyro/f4Y.ordinal:()I
        //  2617: goto            2621
        //  2620: athrow         
        //  2621: iaload         
        //  2622: lookupswitch {
        //                1: 2648
        //                2: 2764
        //          default: 2786
        //        }
        //  2648: iload           13
        //  2650: getstatic       dev/nuker/pyro/fc.c:I
        //  2653: ifge            2662
        //  2656: ldc_w           -1759117278
        //  2659: goto            2665
        //  2662: ldc_w           1394847218
        //  2665: ldc_w           1537265383
        //  2668: ixor           
        //  2669: lookupswitch {
        //          -863580475: 3764
        //          -746334953: 2662
        //          default: 2696
        //        }
        //  2696: iload           6
        //  2698: if_icmpne       2786
        //  2701: aload           12
        //  2703: getstatic       dev/nuker/pyro/fc.1:I
        //  2706: ifeq            2715
        //  2709: ldc_w           1832996936
        //  2712: goto            2718
        //  2715: ldc_w           2061212201
        //  2718: ldc_w           1462680928
        //  2721: ixor           
        //  2722: lookupswitch {
        //          771041097: 2748
        //          980413736: 2715
        //          default: 3714
        //        }
        //  2748: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2751: getstatic       net/minecraft/enchantment/EnchantmentProtection$Type.EXPLOSION:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2754: if_acmpne       2786
        //  2757: iload           7
        //  2759: istore          5
        //  2761: goto            2786
        //  2764: iload           13
        //  2766: iload           6
        //  2768: if_icmpne       2786
        //  2771: aload           12
        //  2773: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2776: getstatic       net/minecraft/enchantment/EnchantmentProtection$Type.ALL:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2779: if_acmpne       2786
        //  2782: iload           7
        //  2784: istore          5
        //  2786: goto            1996
        //  2789: iload           5
        //  2791: iconst_m1      
        //  2792: if_icmpne       2844
        //  2795: getstatic       dev/nuker/pyro/fc.1:I
        //  2798: ifeq            2807
        //  2801: ldc_w           -196356171
        //  2804: goto            2810
        //  2807: ldc_w           -270849968
        //  2810: ldc_w           1475695706
        //  2813: ixor           
        //  2814: lookupswitch {
        //          -1547795473: 2807
        //          -1204913142: 2840
        //          default: 3704
        //        }
        //  2840: iload           7
        //  2842: istore          5
        //  2844: iinc            7, 1
        //  2847: goto            1342
        //  2850: iload           5
        //  2852: iconst_m1      
        //  2853: if_icmpeq       3354
        //  2856: getstatic       dev/nuker/pyro/fc.c:I
        //  2859: ifge            2868
        //  2862: ldc_w           -308958455
        //  2865: goto            2871
        //  2868: ldc_w           1429681450
        //  2871: ldc_w           -962231561
        //  2874: ixor           
        //  2875: lookupswitch {
        //          -1819101219: 2900
        //          724576766: 2868
        //          default: 3698
        //        }
        //  2900: aload_0        
        //  2901: getstatic       dev/nuker/pyro/fc.c:I
        //  2904: ifge            2913
        //  2907: ldc_w           -940422585
        //  2910: goto            2916
        //  2913: ldc_w           1192073620
        //  2916: ldc_w           1759599224
        //  2919: ixor           
        //  2920: lookupswitch {
        //          -1357705153: 2913
        //          804045804: 2948
        //          default: 3692
        //        }
        //  2948: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/fbu;
        //  2951: getstatic       dev/nuker/pyro/fc.c:I
        //  2954: ifge            2963
        //  2957: ldc_w           1631663098
        //  2960: goto            2966
        //  2963: ldc_w           1677280424
        //  2966: ldc_w           -1759617981
        //  2969: ixor           
        //  2970: lookupswitch {
        //          -655336519: 2963
        //          -161517639: 3744
        //          default: 2996
        //        }
        //  2996: goto            3000
        //  2999: athrow         
        //  3000: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  3003: goto            3007
        //  3006: athrow         
        //  3007: iload           5
        //  3009: iconst_m1      
        //  3010: if_icmpeq       3354
        //  3013: aload_0        
        //  3014: iconst_1       
        //  3015: putfield        dev/nuker/pyro/f4Z.c:Z
        //  3018: aload_0        
        //  3019: getstatic       dev/nuker/pyro/fc.0:I
        //  3022: ifeq            3031
        //  3025: ldc_w           76555986
        //  3028: goto            3034
        //  3031: ldc_w           -754144648
        //  3034: ldc_w           1201781323
        //  3037: ixor           
        //  3038: lookupswitch {
        //          1127324825: 3688
        //          1713701835: 3031
        //          default: 3064
        //        }
        //  3064: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //  3067: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3070: getstatic       dev/nuker/pyro/fc.0:I
        //  3073: ifeq            3082
        //  3076: ldc_w           -333123211
        //  3079: goto            3085
        //  3082: ldc_w           -1288836300
        //  3085: ldc_w           -1051910917
        //  3088: ixor           
        //  3089: lookupswitch {
        //          761916814: 3082
        //          1918957519: 3116
        //          default: 3728
        //        }
        //  3116: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //  3119: getstatic       dev/nuker/pyro/fc.0:I
        //  3122: ifeq            3131
        //  3125: ldc_w           -1567530228
        //  3128: goto            3134
        //  3131: ldc_w           889275600
        //  3134: ldc_w           -875345602
        //  3137: ixor           
        //  3138: lookupswitch {
        //          -19788306: 3164
        //          1765943858: 3131
        //          default: 3720
        //        }
        //  3164: goto            3168
        //  3167: athrow         
        //  3168: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //  3171: goto            3175
        //  3174: athrow         
        //  3175: bipush          6
        //  3177: getstatic       dev/nuker/pyro/fc.c:I
        //  3180: ifge            3189
        //  3183: ldc_w           2115777234
        //  3186: goto            3192
        //  3189: ldc_w           164233881
        //  3192: ldc_w           -1569777077
        //  3195: ixor           
        //  3196: lookupswitch {
        //          -1415243566: 3224
        //          -596432743: 3189
        //          default: 3680
        //        }
        //  3224: goto            3228
        //  3227: athrow         
        //  3228: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  3231: goto            3235
        //  3234: athrow         
        //  3235: checkcast       Lnet/minecraft/item/ItemStack;
        //  3238: goto            3242
        //  3241: athrow         
        //  3242: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  3245: goto            3249
        //  3248: athrow         
        //  3249: ifeq            3326
        //  3252: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  3255: iconst_0       
        //  3256: getstatic       dev/nuker/pyro/fc.1:I
        //  3259: ifeq            3268
        //  3262: ldc_w           -1079361279
        //  3265: goto            3271
        //  3268: ldc_w           -1606932221
        //  3271: ldc_w           -710033139
        //  3274: ixor           
        //  3275: lookupswitch {
        //          1778876428: 3268
        //          1972758542: 3300
        //          default: 3738
        //        }
        //  3300: iload           5
        //  3302: iconst_0       
        //  3303: getstatic       net/minecraft/inventory/ClickType.QUICK_MOVE:Lnet/minecraft/inventory/ClickType;
        //  3306: aload_0        
        //  3307: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f4Z;)Ljava/util/function/Consumer;
        //  3312: goto            3316
        //  3315: athrow         
        //  3316: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //  3319: goto            3323
        //  3322: athrow         
        //  3323: goto            3354
        //  3326: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  3329: iconst_0       
        //  3330: iload           5
        //  3332: bipush          6
        //  3334: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  3337: aload_0        
        //  3338: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f4Z;)Ljava/util/function/Consumer;
        //  3343: goto            3347
        //  3346: athrow         
        //  3347: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //  3350: goto            3354
        //  3353: athrow         
        //  3354: return         
        //  3355: aload_0        
        //  3356: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/fw;
        //  3359: goto            3363
        //  3362: athrow         
        //  3363: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  3366: goto            3370
        //  3369: athrow         
        //  3370: checkcast       Ljava/lang/Boolean;
        //  3373: goto            3377
        //  3376: athrow         
        //  3377: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3380: goto            3384
        //  3383: athrow         
        //  3384: ifne            3388
        //  3387: return         
        //  3388: aload_0        
        //  3389: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/fbu;
        //  3392: aload_0        
        //  3393: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0d;
        //  3396: getstatic       dev/nuker/pyro/fc.0:I
        //  3399: ifeq            3408
        //  3402: ldc_w           1770579966
        //  3405: goto            3411
        //  3408: ldc_w           -1238536170
        //  3411: ldc_w           -821875558
        //  3414: ixor           
        //  3415: lookupswitch {
        //          -1500787868: 3702
        //          1158223137: 3408
        //          default: 3440
        //        }
        //  3440: goto            3444
        //  3443: athrow         
        //  3444: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3447: goto            3451
        //  3450: athrow         
        //  3451: checkcast       Ljava/lang/Double;
        //  3454: goto            3458
        //  3457: athrow         
        //  3458: invokevirtual   java/lang/Double.doubleValue:()D
        //  3461: goto            3465
        //  3464: athrow         
        //  3465: ldc2_w          1000.0
        //  3468: dmul           
        //  3469: goto            3473
        //  3472: athrow         
        //  3473: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  3476: goto            3480
        //  3479: athrow         
        //  3480: ifne            3489
        //  3483: ldc_w           -1762928255
        //  3486: goto            3492
        //  3489: ldc_w           -1762928254
        //  3492: ldc_w           1101798976
        //  3495: ixor           
        //  3496: tableswitch {
        //          -1366323326: 3520
        //          -1366323325: 3521
        //          default: 3483
        //        }
        //  3520: return         
        //  3521: aload_0        
        //  3522: iconst_5       
        //  3523: getstatic       net/minecraft/inventory/EntityEquipmentSlot.HEAD:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  3526: goto            3530
        //  3529: athrow         
        //  3530: invokevirtual   dev/nuker/pyro/f4Z.c:(ILnet/minecraft/inventory/EntityEquipmentSlot;)V
        //  3533: goto            3537
        //  3536: athrow         
        //  3537: aload_0        
        //  3538: bipush          6
        //  3540: getstatic       dev/nuker/pyro/fc.c:I
        //  3543: ifge            3552
        //  3546: ldc_w           -1837266621
        //  3549: goto            3555
        //  3552: ldc_w           1736738819
        //  3555: ldc_w           -1973229050
        //  3558: ixor           
        //  3559: lookupswitch {
        //          -405549970: 3552
        //          404710213: 3708
        //          default: 3584
        //        }
        //  3584: getstatic       net/minecraft/inventory/EntityEquipmentSlot.CHEST:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  3587: goto            3591
        //  3590: athrow         
        //  3591: invokevirtual   dev/nuker/pyro/f4Z.c:(ILnet/minecraft/inventory/EntityEquipmentSlot;)V
        //  3594: goto            3598
        //  3597: athrow         
        //  3598: aload_0        
        //  3599: bipush          7
        //  3601: getstatic       net/minecraft/inventory/EntityEquipmentSlot.LEGS:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  3604: goto            3608
        //  3607: athrow         
        //  3608: invokevirtual   dev/nuker/pyro/f4Z.c:(ILnet/minecraft/inventory/EntityEquipmentSlot;)V
        //  3611: goto            3615
        //  3614: athrow         
        //  3615: aload_0        
        //  3616: bipush          8
        //  3618: getstatic       net/minecraft/inventory/EntityEquipmentSlot.FEET:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  3621: getstatic       dev/nuker/pyro/fc.1:I
        //  3624: ifeq            3633
        //  3627: ldc_w           -1765037618
        //  3630: goto            3636
        //  3633: ldc_w           -1718665055
        //  3636: ldc_w           495932203
        //  3639: ixor           
        //  3640: lookupswitch {
        //          -2080369782: 3668
        //          -1958413595: 3633
        //          default: 3770
        //        }
        //  3668: goto            3672
        //  3671: athrow         
        //  3672: invokevirtual   dev/nuker/pyro/f4Z.c:(ILnet/minecraft/inventory/EntityEquipmentSlot;)V
        //  3675: goto            3679
        //  3678: athrow         
        //  3679: return         
        //  3680: aconst_null    
        //  3681: athrow         
        //  3682: aconst_null    
        //  3683: athrow         
        //  3684: aconst_null    
        //  3685: athrow         
        //  3686: aconst_null    
        //  3687: athrow         
        //  3688: aconst_null    
        //  3689: athrow         
        //  3690: aconst_null    
        //  3691: athrow         
        //  3692: aconst_null    
        //  3693: athrow         
        //  3694: aconst_null    
        //  3695: athrow         
        //  3696: aconst_null    
        //  3697: athrow         
        //  3698: aconst_null    
        //  3699: athrow         
        //  3700: aconst_null    
        //  3701: athrow         
        //  3702: aconst_null    
        //  3703: athrow         
        //  3704: aconst_null    
        //  3705: athrow         
        //  3706: aconst_null    
        //  3707: athrow         
        //  3708: aconst_null    
        //  3709: athrow         
        //  3710: aconst_null    
        //  3711: athrow         
        //  3712: aconst_null    
        //  3713: athrow         
        //  3714: aconst_null    
        //  3715: athrow         
        //  3716: aconst_null    
        //  3717: athrow         
        //  3718: aconst_null    
        //  3719: athrow         
        //  3720: aconst_null    
        //  3721: athrow         
        //  3722: aconst_null    
        //  3723: athrow         
        //  3724: aconst_null    
        //  3725: athrow         
        //  3726: aconst_null    
        //  3727: athrow         
        //  3728: aconst_null    
        //  3729: athrow         
        //  3730: aconst_null    
        //  3731: athrow         
        //  3732: aconst_null    
        //  3733: athrow         
        //  3734: aconst_null    
        //  3735: athrow         
        //  3736: aconst_null    
        //  3737: athrow         
        //  3738: aconst_null    
        //  3739: athrow         
        //  3740: aconst_null    
        //  3741: athrow         
        //  3742: aconst_null    
        //  3743: athrow         
        //  3744: aconst_null    
        //  3745: athrow         
        //  3746: aconst_null    
        //  3747: athrow         
        //  3748: aconst_null    
        //  3749: athrow         
        //  3750: aconst_null    
        //  3751: athrow         
        //  3752: aconst_null    
        //  3753: athrow         
        //  3754: aconst_null    
        //  3755: athrow         
        //  3756: aconst_null    
        //  3757: athrow         
        //  3758: aconst_null    
        //  3759: athrow         
        //  3760: aconst_null    
        //  3761: athrow         
        //  3762: aconst_null    
        //  3763: athrow         
        //  3764: aconst_null    
        //  3765: athrow         
        //  3766: aconst_null    
        //  3767: athrow         
        //  3768: aconst_null    
        //  3769: athrow         
        //  3770: aconst_null    
        //  3771: athrow         
        //  3772: aconst_null    
        //  3773: athrow         
        //  3774: aconst_null    
        //  3775: athrow         
        //  3776: aconst_null    
        //  3777: athrow         
        //  3778: pop            
        //  3779: goto            24
        //  3782: pop            
        //  3783: aconst_null    
        //  3784: goto            3778
        //  3787: dup            
        //  3788: ifnull          3778
        //  3791: checkcast       Ljava/lang/Throwable;
        //  3794: athrow         
        //  3795: dup            
        //  3796: ifnull          3782
        //  3799: checkcast       Ljava/lang/Throwable;
        //  3802: athrow         
        //  3803: aconst_null    
        //  3804: athrow         
        //    StackMapTable: 01 D8 43 07 01 2C 04 FF 00 0B 00 00 00 01 07 01 2C FD 00 03 07 00 03 07 02 B0 0B 42 01 1C 06 05 42 01 1B 00 4F 07 01 3A FF 00 02 00 02 07 00 03 07 02 B0 00 02 07 01 3A 01 5F 07 01 3A 14 42 01 1F 4C 07 00 03 FF 00 02 00 02 07 00 03 07 02 B0 00 02 07 00 03 01 5F 07 00 03 4E 07 01 3A FF 00 02 00 02 07 00 03 07 02 B0 00 02 07 01 3A 01 5D 07 01 3A 08 05 42 01 19 00 FF 00 08 00 00 00 01 07 01 2C FF 00 00 00 02 07 00 03 07 02 B0 00 01 07 01 5A 45 07 01 2C 40 07 00 9F 4E 07 01 5F FF 00 02 00 02 07 00 03 07 02 B0 00 02 07 01 5F 01 5F 07 01 5F 42 07 01 18 40 07 01 5F 45 07 01 2C 40 01 4B 07 01 2C 40 07 00 80 45 07 01 2C 40 01 0E 42 01 1E 09 FF 00 0B 00 03 07 00 03 07 02 B0 01 00 01 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 07 00 8E 45 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 07 00 41 42 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 07 00 41 45 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 07 00 98 45 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 02 B1 01 1C 55 07 01 8B FF 00 02 00 03 07 00 03 07 02 B0 01 00 02 07 01 8B 01 5E 07 01 8B 42 07 01 2C 40 07 01 8B 45 07 01 2C 40 07 01 91 44 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F FF 00 12 00 04 07 00 03 07 02 B0 01 07 01 97 00 01 07 01 9F FF 00 02 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 07 01 9F 01 5D 07 01 9F 45 07 01 2C 40 07 01 5A 45 07 01 2C 40 07 00 9F 45 07 01 1C 40 07 01 5F 45 07 01 2C 40 01 43 07 01 24 FF 00 00 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 07 01 97 45 07 01 2C FF 00 00 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 07 02 B3 49 07 01 2C FF 00 00 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 07 01 97 45 07 01 2C FF 00 00 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 01 46 01 FF 00 00 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 01 FA 00 07 4F 07 00 80 FF 00 02 00 03 07 00 03 07 02 B0 01 00 02 07 00 80 01 5E 07 00 80 42 07 01 16 40 07 00 80 45 07 01 2C 40 01 00 0F 42 01 1C FF 00 12 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 FF 00 02 00 03 07 00 03 07 02 B0 01 00 03 07 00 B4 03 01 FF 00 1D 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 42 07 01 26 FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 45 07 01 2C 40 01 58 07 01 8B FF 00 02 00 03 07 00 03 07 02 B0 01 00 02 07 01 8B 01 5C 07 01 8B 42 07 01 2C 40 07 01 8B 45 07 01 2C 40 07 01 91 44 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F FF 00 10 00 04 07 00 03 07 02 B0 01 07 01 97 00 01 01 FF 00 02 00 04 07 00 03 07 02 B0 01 07 01 97 00 02 01 01 5F 01 FF 00 08 00 05 07 00 03 07 02 B0 01 07 01 97 01 00 01 07 01 2C 40 07 00 8E 45 07 01 2C 40 07 00 41 42 07 01 1C 40 07 00 41 45 07 01 2C 40 07 00 9F 4E 07 01 2C 40 07 01 5A 45 07 01 2C 40 07 00 9F 45 07 01 16 40 07 01 5F 45 07 01 2C 40 01 04 43 07 01 2C 40 07 01 97 45 07 01 2C 40 01 49 07 01 22 40 07 00 61 45 07 01 2C 40 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 05 07 00 03 07 02 B0 01 07 01 97 01 00 01 07 01 5F 45 07 01 2C 40 01 04 0B 42 01 1D 43 07 01 2C 40 07 01 97 45 07 01 2C 40 07 02 B3 04 FF 00 0F 00 06 07 00 03 07 02 B0 01 07 01 97 01 01 00 01 01 FF 00 02 00 06 07 00 03 07 02 B0 01 07 01 97 01 01 00 02 01 01 5F 01 FD 00 05 01 01 59 07 01 82 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 82 01 5C 07 01 82 45 07 01 2C 40 07 01 8B 45 07 01 2C 40 07 01 91 4B 07 01 91 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 5E 07 01 91 44 07 01 26 FF 00 00 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F FF 00 09 00 09 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 00 01 07 01 2C 40 07 01 97 45 07 01 2C 40 01 05 10 42 01 1E 44 07 01 2C 40 07 01 97 45 07 01 2C 40 07 02 B3 FF 00 0A 00 00 00 01 07 01 2C FF 00 00 00 09 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 00 01 07 01 97 45 07 01 2C 40 01 02 05 42 01 1B 0B 42 01 1C 06 0B 42 01 1D FF 00 04 00 00 00 01 07 01 2C FF 00 00 00 09 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 00 01 07 01 97 45 07 01 2C 40 07 02 B3 FF 00 0A 00 00 00 01 07 01 2C FF 00 00 00 09 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 00 01 07 01 97 45 07 01 2C 40 07 02 B3 FC 00 10 07 01 C7 42 01 1F 4D 07 01 C7 FF 00 02 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 02 07 01 C7 01 5E 07 01 C7 FF 00 02 00 00 00 01 07 01 2C FF 00 00 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 C7 45 07 01 2C 40 07 01 EB 4B 07 01 EB FF 00 02 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 02 07 01 EB 01 5D 07 01 EB 4A 07 01 2C 40 07 01 97 45 07 01 2C 40 07 01 FA 4B 07 01 FA FF 00 02 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 02 07 01 FA 01 5D 07 01 FA 42 07 01 2C 40 07 01 FA 47 07 01 2C 40 07 02 00 FF 00 02 00 00 00 01 07 01 2C FF 00 00 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 01 07 02 00 47 07 01 2C 40 07 02 09 FC 00 01 07 02 09 0B 42 01 1C FF 00 04 00 00 00 01 07 01 2C FF 00 00 00 0B 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 00 01 07 02 09 47 07 01 2C 40 01 50 07 02 09 FF 00 02 00 0B 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 00 02 07 02 09 01 5C 07 02 09 42 07 01 16 40 07 02 09 47 07 01 2C 40 07 00 9F FF 00 1D 00 0C 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 00 01 07 02 16 FF 00 02 00 0C 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 00 02 07 02 16 01 5D 07 02 16 FF 00 0F 00 0D 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 01 07 02 14 FF 00 02 00 0D 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 02 07 02 14 01 5C 07 02 14 44 07 01 12 FF 00 00 00 0D 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 02 07 02 14 07 01 97 45 07 01 2C 40 01 FF 00 15 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 02 2B FF 00 02 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 03 07 02 B1 07 02 2B 01 FF 00 1D 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 02 2B 42 07 01 16 FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 02 2B 45 07 01 2C FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 01 1C 12 42 01 1D 0F 42 01 1C 06 4D 01 FF 00 02 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 01 01 5F 01 10 42 01 1F 4E 07 02 B1 FF 00 02 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 01 5D 07 02 B1 FF 00 06 00 00 00 01 07 01 2C FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 41 45 07 01 2C FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 9F 45 07 01 10 FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 79 45 07 01 2C FF 00 00 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 01 1A 4D 01 FF 00 02 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 01 01 5E 01 52 07 02 16 FF 00 02 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 16 01 5D 07 02 16 0F F9 00 15 FA 00 02 11 42 01 1D F9 00 03 FA 00 05 11 42 01 1C 4C 07 00 03 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 4E 07 00 B4 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 00 B4 01 5D 07 00 B4 42 07 01 24 40 07 00 B4 45 07 01 2C 00 57 07 00 03 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 00 03 01 5D 07 00 03 51 07 01 82 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 82 01 5E 07 01 82 4E 07 01 8B FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 8B 01 5D 07 01 8B 42 07 01 1C 40 07 01 8B 45 07 01 2C 40 07 01 91 FF 00 0D 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 03 07 01 91 01 01 FF 00 1F 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 42 07 01 2C FF 00 00 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F 45 07 01 2C 40 07 01 97 45 07 01 2C 40 01 FF 00 12 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 02 66 01 FF 00 02 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 03 07 02 66 01 01 FF 00 1C 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 02 66 01 FF 00 0E 00 00 00 01 07 01 2C FF 00 00 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 45 07 01 2C 00 02 FF 00 13 00 00 00 01 07 01 2C FF 00 00 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 45 07 01 2C 00 FF 00 00 00 03 07 00 03 07 02 B0 01 00 00 46 07 01 2C 40 07 01 5A 45 07 01 2C 40 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 01 07 01 5F 45 07 01 2C 40 01 03 FF 00 13 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 00 29 FF 00 02 00 03 07 00 03 07 02 B0 01 00 03 07 00 B4 07 00 29 01 FF 00 1C 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 00 29 42 07 01 24 FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 00 29 45 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 02 93 45 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 46 07 01 0C FF 00 00 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 45 07 01 2C 40 01 02 05 42 01 1B 00 47 07 01 0C FF 00 00 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB 45 07 01 2C 00 FF 00 0E 00 03 07 00 03 07 02 B0 01 00 02 07 00 03 01 FF 00 02 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 01 FF 00 1C 00 03 07 00 03 07 02 B0 01 00 02 07 00 03 01 45 07 01 0C FF 00 00 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB 45 07 01 2C 00 FF 00 08 00 00 00 01 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB 45 07 01 2C 00 FF 00 11 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB FF 00 02 00 03 07 00 03 07 02 B0 01 00 04 07 00 03 01 07 01 EB 01 FF 00 1F 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB 42 07 01 2C FF 00 00 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB 45 07 01 2C 00 FF 00 00 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 01 91 01 FE 00 01 07 01 97 07 01 C7 07 02 09 F9 00 01 FF 00 01 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 FA FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 02 B0 00 00 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 C7 FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 02 2B FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 00 FD 00 01 07 01 97 07 01 C7 FF 00 01 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 07 00 29 FF 00 01 00 0B 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 00 00 FE 00 01 07 02 14 07 02 16 01 FF 00 01 00 03 07 00 03 07 02 B0 01 00 02 07 00 03 01 FF 00 01 00 09 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 00 00 FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 01 41 07 02 16 FF 00 01 00 03 07 00 03 07 02 B0 01 00 01 07 00 80 FD 00 01 07 01 97 01 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 01 8B FF 00 01 00 02 07 00 03 07 02 B0 00 01 07 01 3A FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 01 91 FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 00 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 01 82 FF 00 01 00 03 07 00 03 07 02 B0 01 00 01 07 01 8B FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 07 02 B1 FF 00 01 00 0C 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 00 01 07 02 16 FF 00 01 00 02 07 00 03 07 02 B0 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 02 07 02 66 01 FF 00 01 00 02 07 00 03 07 02 B0 00 01 07 01 3A FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 00 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 00 B4 FF 00 01 00 03 07 00 03 07 02 B0 01 00 02 07 00 B4 03 41 07 01 8B FA 00 01 FC 00 01 01 FF 00 01 00 04 07 00 03 07 02 B0 01 07 01 97 00 01 01 FF 00 01 00 02 07 00 03 07 02 B0 00 01 07 01 5F FF 00 01 00 06 07 00 03 07 02 B0 01 07 01 97 01 01 00 01 01 FE 00 01 01 01 07 01 97 FF 00 01 00 02 07 00 03 07 02 B0 00 00 FF 00 01 00 0E 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 01 FF 00 01 00 08 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 00 01 07 01 82 FF 00 01 00 0A 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 EB FF 00 01 00 03 07 00 03 07 02 B0 01 00 03 07 00 03 01 07 01 EB FF 00 01 00 04 07 00 03 07 02 B0 01 07 01 97 00 01 07 01 9F FF 00 01 00 0B 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 00 01 07 02 09 FF 00 01 00 0D 07 00 03 07 02 B0 01 07 01 97 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 01 07 02 14 FF 00 01 00 02 07 00 03 07 02 B0 00 01 07 01 2C 43 05 44 07 01 2C 47 05 47 07 01 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3787   3795   Any
        //  3787   3795   3787   3795   Ljava/lang/EnumConstantNotPresentException;
        //  3803   3805   3      8      Ljava/lang/NumberFormatException;
        //  371    377    377    378    Any
        //  371    377    3      8      Ljava/lang/UnsupportedOperationException;
        //  371    377    3      8      Ljava/lang/AssertionError;
        //  371    377    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  371    377    3      8      Any
        //  431    438    438    439    Any
        //  432    438    438    439    Any
        //  432    438    438    439    Ljava/lang/ArithmeticException;
        //  432    438    438    439    Any
        //  431    438    431    432    Ljava/lang/IllegalArgumentException;
        //  451    458    458    459    Any
        //  452    458    451    452    Ljava/lang/NumberFormatException;
        //  451    458    451    452    Any
        //  451    458    458    459    Any
        //  451    458    3      8      Ljava/lang/NegativeArraySizeException;
        //  530    537    537    538    Any
        //  531    537    530    531    Any
        //  530    537    530    531    Any
        //  530    537    537    538    Ljava/lang/RuntimeException;
        //  531    537    537    538    Ljava/lang/AssertionError;
        //  541    548    548    549    Any
        //  542    548    541    542    Any
        //  542    548    541    542    Ljava/lang/ArithmeticException;
        //  542    548    548    549    Any
        //  541    548    541    542    Ljava/lang/EnumConstantNotPresentException;
        //  556    562    562    563    Any
        //  556    562    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  556    562    3      8      Any
        //  556    562    562    563    Ljava/lang/IndexOutOfBoundsException;
        //  556    562    3      8      Any
        //  651    658    658    659    Any
        //  651    658    658    659    Any
        //  651    658    651    652    Any
        //  652    658    651    652    Any
        //  652    658    658    659    Ljava/lang/IndexOutOfBoundsException;
        //  664    671    671    672    Any
        //  665    671    664    665    Any
        //  664    671    664    665    Any
        //  665    671    3      8      Any
        //  665    671    3      8      Ljava/util/NoSuchElementException;
        //  730    737    737    738    Any
        //  730    737    3      8      Any
        //  731    737    730    731    Any
        //  731    737    730    731    Any
        //  730    737    737    738    Any
        //  744    751    751    752    Any
        //  745    751    3      8      Any
        //  744    751    744    745    Ljava/lang/EnumConstantNotPresentException;
        //  744    751    744    745    Ljava/lang/IllegalArgumentException;
        //  745    751    751    752    Ljava/lang/StringIndexOutOfBoundsException;
        //  756    763    763    764    Any
        //  757    763    3      8      Any
        //  756    763    3      8      Any
        //  757    763    3      8      Any
        //  756    763    756    757    Ljava/lang/ClassCastException;
        //  774    781    781    782    Any
        //  774    781    774    775    Any
        //  774    781    781    782    Any
        //  774    781    3      8      Any
        //  775    781    774    775    Ljava/lang/EnumConstantNotPresentException;
        //  851    858    858    859    Any
        //  851    858    851    852    Ljava/lang/ArithmeticException;
        //  851    858    858    859    Any
        //  852    858    858    859    Ljava/util/NoSuchElementException;
        //  852    858    858    859    Any
        //  963    970    970    971    Any
        //  963    970    963    964    Ljava/util/ConcurrentModificationException;
        //  963    970    970    971    Any
        //  963    970    3      8      Any
        //  963    970    970    971    Ljava/lang/EnumConstantNotPresentException;
        //  1031   1038   1038   1039   Any
        //  1031   1038   1031   1032   Any
        //  1031   1038   1031   1032   Ljava/lang/AssertionError;
        //  1031   1038   1038   1039   Any
        //  1032   1038   1038   1039   Any
        //  1044   1051   1051   1052   Any
        //  1045   1051   1051   1052   Ljava/util/NoSuchElementException;
        //  1044   1051   1044   1045   Any
        //  1045   1051   1051   1052   Any
        //  1045   1051   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1113   1120   1120   1121   Any
        //  1113   1120   1120   1121   Any
        //  1114   1120   1113   1114   Ljava/lang/IllegalArgumentException;
        //  1113   1120   1113   1114   Any
        //  1113   1120   3      8      Ljava/lang/AssertionError;
        //  1124   1131   1131   1132   Any
        //  1124   1131   1131   1132   Ljava/lang/NullPointerException;
        //  1124   1131   1124   1125   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1125   1131   1131   1132   Any
        //  1124   1131   1124   1125   Ljava/lang/NegativeArraySizeException;
        //  1147   1154   1154   1155   Any
        //  1147   1154   1154   1155   Any
        //  1148   1154   3      8      Any
        //  1148   1154   1147   1148   Any
        //  1147   1154   3      8      Any
        //  1161   1168   1168   1169   Any
        //  1162   1168   1168   1169   Any
        //  1161   1168   1168   1169   Ljava/lang/RuntimeException;
        //  1161   1168   1168   1169   Any
        //  1161   1168   1161   1162   Ljava/lang/ArithmeticException;
        //  1178   1185   1185   1186   Any
        //  1179   1185   1178   1179   Any
        //  1179   1185   1178   1179   Any
        //  1179   1185   1185   1186   Any
        //  1179   1185   1178   1179   Any
        //  1196   1203   1203   1204   Any
        //  1197   1203   1203   1204   Ljava/lang/RuntimeException;
        //  1196   1203   1196   1197   Ljava/lang/StringIndexOutOfBoundsException;
        //  1196   1203   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1196   1203   1203   1204   Ljava/lang/UnsupportedOperationException;
        //  1211   1217   1217   1218   Any
        //  1211   1217   1217   1218   Ljava/util/NoSuchElementException;
        //  1211   1217   3      8      Any
        //  1211   1217   1217   1218   Any
        //  1211   1217   1217   1218   Any
        //  1272   1279   1279   1280   Any
        //  1273   1279   3      8      Any
        //  1273   1279   1279   1280   Any
        //  1272   1279   1272   1273   Any
        //  1272   1279   1272   1273   Ljava/lang/ClassCastException;
        //  1406   1413   1413   1414   Any
        //  1407   1413   3      8      Any
        //  1406   1413   1406   1407   Any
        //  1406   1413   1413   1414   Ljava/lang/ClassCastException;
        //  1406   1413   3      8      Any
        //  1465   1472   1472   1473   Any
        //  1465   1472   3      8      Any
        //  1465   1472   3      8      Ljava/lang/UnsupportedOperationException;
        //  1466   1472   3      8      Any
        //  1466   1472   1465   1466   Ljava/util/ConcurrentModificationException;
        //  1483   1490   1490   1491   Any
        //  1483   1490   1490   1491   Any
        //  1483   1490   1483   1484   Any
        //  1484   1490   3      8      Ljava/lang/AssertionError;
        //  1483   1490   1490   1491   Ljava/lang/IllegalStateException;
        //  1553   1560   1560   1561   Any
        //  1554   1560   1553   1554   Any
        //  1554   1560   1560   1561   Ljava/lang/ArithmeticException;
        //  1554   1560   3      8      Any
        //  1553   1560   1553   1554   Any
        //  1573   1579   1579   1580   Any
        //  1573   1579   3      8      Any
        //  1573   1579   3      8      Ljava/util/ConcurrentModificationException;
        //  1573   1579   1579   1580   Any
        //  1573   1579   3      8      Any
        //  1722   1728   1728   1729   Any
        //  1722   1728   1728   1729   Any
        //  1722   1728   1728   1729   Ljava/lang/ArithmeticException;
        //  1722   1728   1728   1729   Any
        //  1722   1728   3      8      Ljava/lang/IllegalArgumentException;
        //  1741   1747   1747   1748   Any
        //  1741   1747   3      8      Ljava/lang/NegativeArraySizeException;
        //  1741   1747   1747   1748   Ljava/lang/EnumConstantNotPresentException;
        //  1741   1747   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1741   1747   3      8      Ljava/lang/IllegalStateException;
        //  1852   1858   1858   1859   Any
        //  1852   1858   3      8      Ljava/lang/IllegalArgumentException;
        //  1852   1858   3      8      Any
        //  1852   1858   3      8      Ljava/util/ConcurrentModificationException;
        //  1852   1858   1858   1859   Any
        //  1915   1922   1922   1923   Any
        //  1915   1922   1915   1916   Any
        //  1916   1922   1915   1916   Ljava/lang/IllegalArgumentException;
        //  1916   1922   3      8      Ljava/lang/ArithmeticException;
        //  1916   1922   3      8      Ljava/util/NoSuchElementException;
        //  1971   1980   1980   1981   Any
        //  1971   1980   1980   1981   Ljava/lang/IllegalStateException;
        //  1971   1980   1980   1981   Any
        //  1971   1980   1971   1972   Any
        //  1972   1980   3      8      Any
        //  1985   1993   1993   1994   Any
        //  1985   1993   3      8      Ljava/lang/RuntimeException;
        //  1985   1993   3      8      Any
        //  1985   1993   1993   1994   Ljava/util/ConcurrentModificationException;
        //  1985   1993   3      8      Ljava/lang/ArithmeticException;
        //  2046   2054   2054   2055   Any
        //  2046   2054   2054   2055   Any
        //  2046   2054   2054   2055   Any
        //  2046   2054   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2046   2054   3      8      Any
        //  2107   2116   2116   2117   Any
        //  2108   2116   2107   2108   Ljava/lang/ArithmeticException;
        //  2107   2116   3      8      Ljava/lang/UnsupportedOperationException;
        //  2108   2116   2116   2117   Ljava/lang/IndexOutOfBoundsException;
        //  2108   2116   2116   2117   Any
        //  2233   2240   2240   2241   Any
        //  2233   2240   2233   2234   Ljava/lang/AssertionError;
        //  2234   2240   3      8      Ljava/lang/UnsupportedOperationException;
        //  2233   2240   2240   2241   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2234   2240   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2299   2306   2306   2307   Any
        //  2300   2306   3      8      Ljava/lang/UnsupportedOperationException;
        //  2299   2306   2306   2307   Any
        //  2299   2306   3      8      Any
        //  2300   2306   2299   2300   Ljava/lang/ArithmeticException;
        //  2600   2606   2606   2607   Any
        //  2600   2606   2606   2607   Any
        //  2600   2606   2606   2607   Ljava/lang/NegativeArraySizeException;
        //  2600   2606   3      8      Any
        //  2600   2606   2606   2607   Any
        //  2613   2620   2620   2621   Any
        //  2613   2620   2620   2621   Ljava/util/NoSuchElementException;
        //  2614   2620   2613   2614   Ljava/lang/UnsupportedOperationException;
        //  2613   2620   3      8      Any
        //  2614   2620   3      8      Ljava/lang/NegativeArraySizeException;
        //  2999   3006   3006   3007   Any
        //  2999   3006   2999   3000   Ljava/lang/ClassCastException;
        //  2999   3006   3      8      Any
        //  2999   3006   3      8      Any
        //  2999   3006   3006   3007   Ljava/lang/IllegalArgumentException;
        //  3167   3174   3174   3175   Any
        //  3168   3174   3174   3175   Any
        //  3168   3174   3167   3168   Ljava/lang/RuntimeException;
        //  3167   3174   3167   3168   Ljava/lang/EnumConstantNotPresentException;
        //  3168   3174   3174   3175   Ljava/lang/IllegalStateException;
        //  3227   3234   3234   3235   Any
        //  3228   3234   3227   3228   Any
        //  3227   3234   3      8      Any
        //  3227   3234   3234   3235   Ljava/lang/NumberFormatException;
        //  3228   3234   3227   3228   Any
        //  3241   3248   3248   3249   Any
        //  3241   3248   3241   3242   Any
        //  3242   3248   3241   3242   Ljava/lang/AssertionError;
        //  3242   3248   3241   3242   Ljava/lang/RuntimeException;
        //  3242   3248   3241   3242   Ljava/lang/NegativeArraySizeException;
        //  3316   3322   3322   3323   Any
        //  3316   3322   3322   3323   Any
        //  3316   3322   3      8      Ljava/util/NoSuchElementException;
        //  3316   3322   3      8      Any
        //  3316   3322   3      8      Ljava/lang/ArithmeticException;
        //  3347   3353   3353   3354   Any
        //  3347   3353   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3347   3353   3      8      Ljava/lang/ArithmeticException;
        //  3347   3353   3      8      Ljava/lang/AssertionError;
        //  3347   3353   3353   3354   Any
        //  3362   3369   3369   3370   Any
        //  3363   3369   3362   3363   Ljava/lang/NumberFormatException;
        //  3362   3369   3362   3363   Ljava/lang/NumberFormatException;
        //  3363   3369   3      8      Any
        //  3363   3369   3362   3363   Any
        //  3377   3383   3383   3384   Any
        //  3377   3383   3383   3384   Any
        //  3377   3383   3383   3384   Ljava/lang/UnsupportedOperationException;
        //  3377   3383   3383   3384   Ljava/lang/ClassCastException;
        //  3377   3383   3      8      Ljava/lang/IllegalArgumentException;
        //  3443   3450   3450   3451   Any
        //  3443   3450   3443   3444   Ljava/lang/ClassCastException;
        //  3444   3450   3450   3451   Any
        //  3443   3450   3450   3451   Ljava/lang/ClassCastException;
        //  3443   3450   3      8      Ljava/lang/ClassCastException;
        //  3458   3464   3464   3465   Any
        //  3458   3464   3464   3465   Ljava/lang/ArithmeticException;
        //  3458   3464   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3458   3464   3464   3465   Ljava/lang/EnumConstantNotPresentException;
        //  3458   3464   3      8      Any
        //  3472   3479   3479   3480   Any
        //  3473   3479   3479   3480   Any
        //  3473   3479   3472   3473   Ljava/lang/EnumConstantNotPresentException;
        //  3472   3479   3      8      Ljava/lang/NegativeArraySizeException;
        //  3473   3479   3      8      Any
        //  3529   3536   3536   3537   Any
        //  3530   3536   3536   3537   Ljava/lang/StringIndexOutOfBoundsException;
        //  3529   3536   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3529   3536   3529   3530   Ljava/lang/EnumConstantNotPresentException;
        //  3530   3536   3536   3537   Ljava/lang/NullPointerException;
        //  3590   3597   3597   3598   Any
        //  3591   3597   3597   3598   Ljava/lang/ClassCastException;
        //  3591   3597   3597   3598   Ljava/lang/IndexOutOfBoundsException;
        //  3590   3597   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3590   3597   3590   3591   Ljava/lang/EnumConstantNotPresentException;
        //  3608   3614   3614   3615   Any
        //  3608   3614   3614   3615   Any
        //  3608   3614   3614   3615   Any
        //  3608   3614   3      8      Any
        //  3608   3614   3      8      Any
        //  3671   3678   3678   3679   Any
        //  3671   3678   3671   3672   Ljava/lang/RuntimeException;
        //  3672   3678   3      8      Ljava/util/ConcurrentModificationException;
        //  3672   3678   3      8      Any
        //  3672   3678   3671   3672   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:629)
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
    
    public void c(final int p0, final EntityEquipmentSlot p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2937
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2929
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2921
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_0       
        //    25: istore_3       
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //    30: getstatic       dev/nuker/pyro/fc.c:I
        //    33: ifge            42
        //    36: ldc_w           -1822271633
        //    39: goto            45
        //    42: ldc_w           2006974445
        //    45: ldc_w           -543110527
        //    48: ixor           
        //    49: lookupswitch {
        //          -1472252564: 76
        //          1287822830: 42
        //          default: 2894
        //        }
        //    76: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    79: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //    82: getstatic       dev/nuker/pyro/fc.1:I
        //    85: ifeq            94
        //    88: ldc_w           -1731893187
        //    91: goto            97
        //    94: ldc_w           -1763966679
        //    97: ldc_w           -672567871
        //   100: ixor           
        //   101: lookupswitch {
        //          1094020328: 128
        //          1328285180: 94
        //          default: 2876
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   135: goto            139
        //   138: athrow         
        //   139: iload_1        
        //   140: getstatic       dev/nuker/pyro/fc.1:I
        //   143: ifeq            152
        //   146: ldc_w           -203566631
        //   149: goto            155
        //   152: ldc_w           814915710
        //   155: ldc_w           901470008
        //   158: ixor           
        //   159: lookupswitch {
        //          -966359327: 2886
        //          1851212469: 152
        //          default: 184
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   191: goto            195
        //   194: athrow         
        //   195: checkcast       Lnet/minecraft/item/ItemStack;
        //   198: getstatic       dev/nuker/pyro/fc.c:I
        //   201: ifge            210
        //   204: ldc_w           736818682
        //   207: goto            213
        //   210: ldc_w           561600901
        //   213: ldc_w           1417524664
        //   216: ixor           
        //   217: lookupswitch {
        //          507081109: 210
        //          2140618818: 2858
        //          default: 244
        //        }
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   251: goto            255
        //   254: athrow         
        //   255: ifne            725
        //   258: aload_0        
        //   259: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0f;
        //   262: goto            266
        //   265: athrow         
        //   266: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   269: goto            273
        //   272: athrow         
        //   273: getstatic       dev/nuker/pyro/f4X.c:Ldev/nuker/pyro/f4X;
        //   276: if_acmpne       280
        //   279: return         
        //   280: aload_0        
        //   281: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   284: getstatic       dev/nuker/pyro/fc.0:I
        //   287: ifeq            296
        //   290: ldc_w           -809943919
        //   293: goto            299
        //   296: ldc_w           499189698
        //   299: ldc_w           1512495434
        //   302: ixor           
        //   303: lookupswitch {
        //          -1784683045: 296
        //          1206378120: 328
        //          default: 2892
        //        }
        //   328: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   331: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   334: getstatic       dev/nuker/pyro/fc.c:I
        //   337: ifge            346
        //   340: ldc_w           723753901
        //   343: goto            349
        //   346: ldc_w           -2036790204
        //   349: ldc_w           -2090678362
        //   352: ixor           
        //   353: lookupswitch {
        //          -1472111605: 346
        //          100387810: 380
        //          default: 2904
        //        }
        //   380: goto            384
        //   383: athrow         
        //   384: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   387: goto            391
        //   390: athrow         
        //   391: getstatic       dev/nuker/pyro/fc.0:I
        //   394: ifeq            403
        //   397: ldc_w           -846547637
        //   400: goto            406
        //   403: ldc_w           -993345310
        //   406: ldc_w           1708290568
        //   409: ixor           
        //   410: lookupswitch {
        //          -1592216854: 436
        //          -1470576829: 403
        //          default: 2898
        //        }
        //   436: iload_1        
        //   437: goto            441
        //   440: athrow         
        //   441: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   444: goto            448
        //   447: athrow         
        //   448: checkcast       Lnet/minecraft/item/ItemStack;
        //   451: getstatic       dev/nuker/pyro/fc.c:I
        //   454: ifge            463
        //   457: ldc_w           -1851544962
        //   460: goto            466
        //   463: ldc_w           -129181840
        //   466: ldc_w           193812381
        //   469: ixor           
        //   470: lookupswitch {
        //          -1708196381: 463
        //          -205422355: 496
        //          default: 2850
        //        }
        //   496: astore          4
        //   498: getstatic       dev/nuker/pyro/fc.c:I
        //   501: ifge            510
        //   504: ldc_w           -1757683566
        //   507: goto            513
        //   510: ldc_w           860715180
        //   513: ldc_w           377245214
        //   516: ixor           
        //   517: lookupswitch {
        //          -2126008692: 510
        //          623982258: 544
        //          default: 2852
        //        }
        //   544: aload           4
        //   546: goto            550
        //   549: athrow         
        //   550: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   553: goto            557
        //   556: athrow         
        //   557: aload           4
        //   559: goto            563
        //   562: athrow         
        //   563: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //   566: goto            570
        //   569: athrow         
        //   570: isub           
        //   571: i2f            
        //   572: aload           4
        //   574: getstatic       dev/nuker/pyro/fc.1:I
        //   577: ifeq            586
        //   580: ldc_w           -708237683
        //   583: goto            589
        //   586: ldc_w           -1557747280
        //   589: ldc_w           197057407
        //   592: ixor           
        //   593: lookupswitch {
        //          -562561550: 2864
        //          328120687: 586
        //          default: 620
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //   627: goto            631
        //   630: athrow         
        //   631: i2f            
        //   632: fdiv           
        //   633: ldc_w           100.0
        //   636: fmul           
        //   637: fstore          5
        //   639: fload           5
        //   641: f2d            
        //   642: aload_0        
        //   643: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0d;
        //   646: getstatic       dev/nuker/pyro/fc.c:I
        //   649: ifge            658
        //   652: ldc_w           -472607177
        //   655: goto            661
        //   658: ldc_w           301594602
        //   661: ldc_w           -130185631
        //   664: ixor           
        //   665: lookupswitch {
        //          313678163: 658
        //          468258902: 2842
        //          default: 692
        //        }
        //   692: goto            696
        //   695: athrow         
        //   696: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   699: goto            703
        //   702: athrow         
        //   703: checkcast       Ljava/lang/Double;
        //   706: goto            710
        //   709: athrow         
        //   710: invokevirtual   java/lang/Double.doubleValue:()D
        //   713: goto            717
        //   716: athrow         
        //   717: dcmpl          
        //   718: ifle            722
        //   721: return         
        //   722: goto            727
        //   725: iconst_1       
        //   726: istore_3       
        //   727: iconst_m1      
        //   728: istore          4
        //   730: iconst_0       
        //   731: getstatic       dev/nuker/pyro/fc.1:I
        //   734: ifeq            743
        //   737: ldc_w           890710768
        //   740: goto            746
        //   743: ldc_w           -958743341
        //   746: ldc_w           1881500439
        //   749: ixor           
        //   750: lookupswitch {
        //          -1224747068: 776
        //          1160921575: 743
        //          default: 2874
        //        }
        //   776: istore          5
        //   778: bipush          9
        //   780: istore          6
        //   782: iload           6
        //   784: bipush          44
        //   786: if_icmpge       795
        //   789: ldc_w           2079114535
        //   792: goto            798
        //   795: ldc_w           2079114534
        //   798: ldc_w           -1688019327
        //   801: ixor           
        //   802: tableswitch {
        //          -1055115444: 824
        //          -1055115443: 2503
        //          default: 789
        //        }
        //   824: aload_0        
        //   825: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //   828: getstatic       dev/nuker/pyro/fc.0:I
        //   831: ifeq            840
        //   834: ldc_w           -1667325953
        //   837: goto            843
        //   840: ldc_w           -901124249
        //   843: ldc_w           13858520
        //   846: ixor           
        //   847: lookupswitch {
        //          -1672615641: 840
        //          -895837761: 872
        //          default: 2896
        //        }
        //   872: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   875: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   878: getstatic       dev/nuker/pyro/fc.c:I
        //   881: ifge            890
        //   884: ldc_w           -1046680489
        //   887: goto            893
        //   890: ldc_w           2100257122
        //   893: ldc_w           -470024864
        //   896: ixor           
        //   897: lookupswitch {
        //          577179959: 2860
        //          1475544004: 890
        //          default: 924
        //        }
        //   924: goto            928
        //   927: athrow         
        //   928: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //   931: goto            935
        //   934: athrow         
        //   935: iload           6
        //   937: goto            941
        //   940: athrow         
        //   941: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //   944: goto            948
        //   947: athrow         
        //   948: checkcast       Lnet/minecraft/item/ItemStack;
        //   951: astore          7
        //   953: aload           7
        //   955: goto            959
        //   958: athrow         
        //   959: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   962: goto            966
        //   965: athrow         
        //   966: ifeq            975
        //   969: ldc_w           7864174
        //   972: goto            978
        //   975: ldc_w           7864173
        //   978: ldc_w           1364749071
        //   981: ixor           
        //   982: tableswitch {
        //          -1570821950: 1004
        //          -1570821949: 1007
        //          default: 969
        //        }
        //  1004: goto            2497
        //  1007: iload_3        
        //  1008: ifeq            1280
        //  1011: aload           7
        //  1013: goto            1017
        //  1016: athrow         
        //  1017: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: aload           7
        //  1026: getstatic       dev/nuker/pyro/fc.c:I
        //  1029: ifge            1038
        //  1032: ldc_w           -1469049710
        //  1035: goto            1041
        //  1038: ldc_w           -385253911
        //  1041: ldc_w           -1234664913
        //  1044: ixor           
        //  1045: lookupswitch {
        //          -1698384827: 1038
        //          504927933: 2872
        //          default: 1072
        //        }
        //  1072: goto            1076
        //  1075: athrow         
        //  1076: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //  1079: goto            1083
        //  1082: athrow         
        //  1083: isub           
        //  1084: i2f            
        //  1085: aload           7
        //  1087: getstatic       dev/nuker/pyro/fc.c:I
        //  1090: ifge            1099
        //  1093: ldc_w           1644223176
        //  1096: goto            1102
        //  1099: ldc_w           1899248000
        //  1102: ldc_w           396984969
        //  1105: ixor           
        //  1106: lookupswitch {
        //          376816935: 1099
        //          1974032449: 2882
        //          default: 1132
        //        }
        //  1132: goto            1136
        //  1135: athrow         
        //  1136: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //  1139: goto            1143
        //  1142: athrow         
        //  1143: i2f            
        //  1144: fdiv           
        //  1145: ldc_w           100.0
        //  1148: fmul           
        //  1149: fstore          8
        //  1151: getstatic       dev/nuker/pyro/fc.1:I
        //  1154: ifeq            1163
        //  1157: ldc_w           1086979602
        //  1160: goto            1166
        //  1163: ldc_w           1310774855
        //  1166: ldc_w           287253079
        //  1169: ixor           
        //  1170: lookupswitch {
        //          1373035589: 1163
        //          1598026768: 1196
        //          default: 2878
        //        }
        //  1196: fload           8
        //  1198: f2d            
        //  1199: getstatic       dev/nuker/pyro/fc.1:I
        //  1202: ifeq            1211
        //  1205: ldc_w           -1850348918
        //  1208: goto            1214
        //  1211: ldc_w           -281280402
        //  1214: ldc_w           496450254
        //  1217: ixor           
        //  1218: lookupswitch {
        //          -1943875516: 1211
        //          -223659360: 1244
        //          default: 2902
        //        }
        //  1244: aload_0        
        //  1245: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0d;
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: checkcast       Ljava/lang/Double;
        //  1262: goto            1266
        //  1265: athrow         
        //  1266: invokevirtual   java/lang/Double.doubleValue:()D
        //  1269: goto            1273
        //  1272: athrow         
        //  1273: dcmpg          
        //  1274: ifge            1280
        //  1277: goto            2497
        //  1280: getstatic       dev/nuker/pyro/fc.1:I
        //  1283: ifeq            1292
        //  1286: ldc_w           -1010916315
        //  1289: goto            1295
        //  1292: ldc_w           547924839
        //  1295: ldc_w           1009581596
        //  1298: ixor           
        //  1299: lookupswitch {
        //          -2147449374: 1292
        //          -7185863: 2880
        //          default: 1324
        //        }
        //  1324: aload_2        
        //  1325: getstatic       net/minecraft/inventory/EntityEquipmentSlot.CHEST:Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  1328: if_acmpne       1545
        //  1331: aload           7
        //  1333: getstatic       dev/nuker/pyro/fc.c:I
        //  1336: ifge            1345
        //  1339: ldc_w           -931779409
        //  1342: goto            1348
        //  1345: ldc_w           -333385456
        //  1348: ldc_w           1404465428
        //  1351: ixor           
        //  1352: lookupswitch {
        //          -1681891909: 1345
        //          -1080655868: 1380
        //          default: 2838
        //        }
        //  1380: goto            1384
        //  1383: athrow         
        //  1384: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1387: goto            1391
        //  1390: athrow         
        //  1391: instanceof      Lnet/minecraft/item/ItemElytra;
        //  1394: ifeq            1545
        //  1397: aload_0        
        //  1398: getstatic       dev/nuker/pyro/fc.c:I
        //  1401: ifge            1410
        //  1404: ldc_w           -1606558070
        //  1407: goto            1413
        //  1410: ldc_w           1274383216
        //  1413: ldc_w           124631278
        //  1416: ixor           
        //  1417: lookupswitch {
        //          -1487903132: 2870
        //          -721185648: 1410
        //          default: 1444
        //        }
        //  1444: getfield        dev/nuker/pyro/f4Z.c:Ldev/nuker/pyro/f0a;
        //  1447: goto            1451
        //  1450: athrow         
        //  1451: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1454: goto            1458
        //  1457: athrow         
        //  1458: checkcast       Ljava/lang/Boolean;
        //  1461: getstatic       dev/nuker/pyro/fc.0:I
        //  1464: ifeq            1473
        //  1467: ldc_w           1200739177
        //  1470: goto            1476
        //  1473: ldc_w           171600432
        //  1476: ldc_w           -1607203322
        //  1479: ixor           
        //  1480: lookupswitch {
        //          -408562321: 2844
        //          1516916095: 1473
        //          default: 1508
        //        }
        //  1508: goto            1512
        //  1511: athrow         
        //  1512: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1515: goto            1519
        //  1518: athrow         
        //  1519: ifeq            1545
        //  1522: aload           7
        //  1524: goto            1528
        //  1527: athrow         
        //  1528: invokestatic    net/minecraft/item/ItemElytra.func_185069_d:(Lnet/minecraft/item/ItemStack;)Z
        //  1531: goto            1535
        //  1534: athrow         
        //  1535: ifeq            1545
        //  1538: iload           6
        //  1540: istore          4
        //  1542: goto            2503
        //  1545: aload           7
        //  1547: goto            1551
        //  1550: athrow         
        //  1551: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1554: goto            1558
        //  1557: athrow         
        //  1558: instanceof      Lnet/minecraft/item/ItemArmor;
        //  1561: ifeq            2497
        //  1564: aload           7
        //  1566: goto            1570
        //  1569: athrow         
        //  1570: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1573: goto            1577
        //  1576: athrow         
        //  1577: checkcast       Lnet/minecraft/item/ItemArmor;
        //  1580: astore          8
        //  1582: aload           8
        //  1584: goto            1588
        //  1587: athrow         
        //  1588: invokevirtual   net/minecraft/item/ItemArmor.func_185083_B_:()Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  1591: goto            1595
        //  1594: athrow         
        //  1595: aload_2        
        //  1596: if_acmpne       2497
        //  1599: aload           7
        //  1601: goto            1605
        //  1604: athrow         
        //  1605: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //  1608: goto            1612
        //  1611: athrow         
        //  1612: goto            1616
        //  1615: athrow         
        //  1616: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1621: goto            1625
        //  1624: athrow         
        //  1625: goto            1629
        //  1628: athrow         
        //  1629: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1634: goto            1638
        //  1637: athrow         
        //  1638: astore          9
        //  1640: getstatic       dev/nuker/pyro/fc.1:I
        //  1643: ifeq            1652
        //  1646: ldc_w           211141545
        //  1649: goto            1655
        //  1652: ldc_w           1283003681
        //  1655: ldc_w           1422835845
        //  1658: ixor           
        //  1659: lookupswitch {
        //          35831766: 1652
        //          1482359596: 2854
        //          default: 1684
        //        }
        //  1684: aload           9
        //  1686: goto            1690
        //  1689: athrow         
        //  1690: invokeinterface java/util/Iterator.hasNext:()Z
        //  1695: goto            1699
        //  1698: athrow         
        //  1699: ifeq            1708
        //  1702: ldc_w           -1816299201
        //  1705: goto            1711
        //  1708: ldc_w           -1816299204
        //  1711: ldc_w           -1707569782
        //  1714: ixor           
        //  1715: tableswitch {
        //          319547754: 1736
        //          319547755: 2487
        //          default: 1702
        //        }
        //  1736: aload           9
        //  1738: goto            1742
        //  1741: athrow         
        //  1742: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1747: goto            1751
        //  1750: athrow         
        //  1751: checkcast       Lnet/minecraft/enchantment/Enchantment;
        //  1754: astore          10
        //  1756: getstatic       dev/nuker/pyro/fc.1:I
        //  1759: ifeq            1768
        //  1762: ldc_w           -1933286183
        //  1765: goto            1771
        //  1768: ldc_w           1322500724
        //  1771: ldc_w           1329315319
        //  1774: ixor           
        //  1775: lookupswitch {
        //          -1006642898: 2848
        //          507961398: 1768
        //          default: 1800
        //        }
        //  1800: aload           10
        //  1802: instanceof      Lnet/minecraft/enchantment/EnchantmentProtection;
        //  1805: ifeq            2484
        //  1808: getstatic       dev/nuker/pyro/fc.0:I
        //  1811: ifeq            1820
        //  1814: ldc_w           -1804025533
        //  1817: goto            1823
        //  1820: ldc_w           -1732445716
        //  1823: ldc_w           -1960712121
        //  1826: ixor           
        //  1827: lookupswitch {
        //          329060779: 1852
        //          525936900: 1820
        //          default: 2888
        //        }
        //  1852: aload           10
        //  1854: checkcast       Lnet/minecraft/enchantment/EnchantmentProtection;
        //  1857: astore          11
        //  1859: getstatic       dev/nuker/pyro/fc.c:I
        //  1862: ifge            1871
        //  1865: ldc_w           -1623639015
        //  1868: goto            1874
        //  1871: ldc_w           -1078174843
        //  1874: ldc_w           -670792835
        //  1877: ixor           
        //  1878: lookupswitch {
        //          -1348646654: 1871
        //          1195229028: 2862
        //          default: 1904
        //        }
        //  1904: aload           10
        //  1906: aload           7
        //  1908: goto            1912
        //  1911: athrow         
        //  1912: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77506_a:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //  1915: goto            1919
        //  1918: athrow         
        //  1919: getstatic       dev/nuker/pyro/fc.0:I
        //  1922: ifeq            1931
        //  1925: ldc_w           -646979537
        //  1928: goto            1934
        //  1931: ldc_w           -1935536939
        //  1934: ldc_w           1971158086
        //  1937: ixor           
        //  1938: lookupswitch {
        //          -1408066455: 1931
        //          -102797165: 1964
        //          default: 2846
        //        }
        //  1964: istore          12
        //  1966: getstatic       dev/nuker/pyro/f4V.0:[I
        //  1969: aload           11
        //  1971: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  1974: goto            1978
        //  1977: athrow         
        //  1978: invokevirtual   net/minecraft/enchantment/EnchantmentProtection$Type.ordinal:()I
        //  1981: goto            1985
        //  1984: athrow         
        //  1985: iaload         
        //  1986: lookupswitch {
        //                1: 2012
        //                2: 2012
        //          default: 2030
        //        }
        //  2012: iload           12
        //  2014: iload           5
        //  2016: if_icmple       2030
        //  2019: iload           6
        //  2021: istore          4
        //  2023: iload           12
        //  2025: istore          5
        //  2027: goto            1640
        //  2030: iload           12
        //  2032: iload           5
        //  2034: if_icmpne       2043
        //  2037: ldc_w           1836776043
        //  2040: goto            2046
        //  2043: ldc_w           1836776044
        //  2046: ldc_w           835930288
        //  2049: ixor           
        //  2050: tableswitch {
        //          -1185716810: 2072
        //          -1185716809: 2484
        //          default: 2037
        //        }
        //  2072: getstatic       dev/nuker/pyro/fc.0:I
        //  2075: ifeq            2084
        //  2078: ldc_w           -1380147804
        //  2081: goto            2087
        //  2084: ldc_w           1447711846
        //  2087: ldc_w           1125281832
        //  2090: ixor           
        //  2091: lookupswitch {
        //          -290525812: 2884
        //          1040996548: 2084
        //          default: 2116
        //        }
        //  2116: getstatic       dev/nuker/pyro/f4V.1:[I
        //  2119: aload_0        
        //  2120: getfield        dev/nuker/pyro/f4Z.0:Ldev/nuker/pyro/f0f;
        //  2123: getstatic       dev/nuker/pyro/fc.c:I
        //  2126: ifge            2135
        //  2129: ldc_w           -816854223
        //  2132: goto            2138
        //  2135: ldc_w           -730277388
        //  2138: ldc_w           -2098063126
        //  2141: ixor           
        //  2142: lookupswitch {
        //          1304286171: 2135
        //          1451933982: 2168
        //          default: 2900
        //        }
        //  2168: goto            2172
        //  2171: athrow         
        //  2172: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2175: goto            2179
        //  2178: athrow         
        //  2179: checkcast       Ldev/nuker/pyro/f4Y;
        //  2182: goto            2186
        //  2185: athrow         
        //  2186: invokevirtual   dev/nuker/pyro/f4Y.ordinal:()I
        //  2189: goto            2193
        //  2192: athrow         
        //  2193: iaload         
        //  2194: lookupswitch {
        //                1: 2220
        //                2: 2371
        //          default: 2484
        //        }
        //  2220: getstatic       dev/nuker/pyro/fc.c:I
        //  2223: ifge            2232
        //  2226: ldc_w           222584244
        //  2229: goto            2235
        //  2232: ldc_w           -812224526
        //  2235: ldc_w           2001624086
        //  2238: ixor           
        //  2239: lookupswitch {
        //          -273163679: 2232
        //          2047476130: 2906
        //          default: 2264
        //        }
        //  2264: iload           12
        //  2266: iload           5
        //  2268: if_icmpne       2484
        //  2271: aload           11
        //  2273: getstatic       dev/nuker/pyro/fc.1:I
        //  2276: ifeq            2285
        //  2279: ldc_w           1447354105
        //  2282: goto            2288
        //  2285: ldc_w           245743466
        //  2288: ldc_w           -1956018565
        //  2291: ixor           
        //  2292: lookupswitch {
        //          -2050213615: 2320
        //          -584230782: 2285
        //          default: 2866
        //        }
        //  2320: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2323: getstatic       net/minecraft/enchantment/EnchantmentProtection$Type.EXPLOSION:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2326: if_acmpne       2335
        //  2329: ldc_w           -1553993412
        //  2332: goto            2338
        //  2335: ldc_w           -1553993411
        //  2338: ldc_w           -924353542
        //  2341: ixor           
        //  2342: tableswitch {
        //          -680454772: 2364
        //          -680454771: 2484
        //          default: 2329
        //        }
        //  2364: iload           6
        //  2366: istore          4
        //  2368: goto            2484
        //  2371: iload           12
        //  2373: getstatic       dev/nuker/pyro/fc.1:I
        //  2376: ifeq            2385
        //  2379: ldc_w           -1621434375
        //  2382: goto            2388
        //  2385: ldc_w           1306165174
        //  2388: ldc_w           162985765
        //  2391: ixor           
        //  2392: lookupswitch {
        //          -1762907940: 2840
        //          -183014494: 2385
        //          default: 2420
        //        }
        //  2420: iload           5
        //  2422: if_icmpne       2484
        //  2425: aload           11
        //  2427: getfield        net/minecraft/enchantment/EnchantmentProtection.field_77356_a:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2430: getstatic       net/minecraft/enchantment/EnchantmentProtection$Type.ALL:Lnet/minecraft/enchantment/EnchantmentProtection$Type;
        //  2433: if_acmpne       2484
        //  2436: getstatic       dev/nuker/pyro/fc.c:I
        //  2439: ifge            2448
        //  2442: ldc_w           -128252575
        //  2445: goto            2451
        //  2448: ldc_w           279185902
        //  2451: ldc_w           647993429
        //  2454: ixor           
        //  2455: lookupswitch {
        //          -2032532933: 2448
        //          -557540044: 2856
        //          default: 2480
        //        }
        //  2480: iload           6
        //  2482: istore          4
        //  2484: goto            1640
        //  2487: iload           4
        //  2489: iconst_m1      
        //  2490: if_icmpne       2497
        //  2493: iload           6
        //  2495: istore          4
        //  2497: iinc            6, 1
        //  2500: goto            782
        //  2503: iload           4
        //  2505: iconst_m1      
        //  2506: if_icmpeq       2515
        //  2509: ldc_w           572689285
        //  2512: goto            2518
        //  2515: ldc_w           572689284
        //  2518: ldc_w           518903633
        //  2521: ixor           
        //  2522: tableswitch {
        //          2040445352: 2544
        //          2040445353: 2837
        //          default: 2509
        //        }
        //  2544: aload_0        
        //  2545: iconst_1       
        //  2546: putfield        dev/nuker/pyro/f4Z.c:Z
        //  2549: getstatic       dev/nuker/pyro/fc.1:I
        //  2552: ifeq            2561
        //  2555: ldc_w           -672953610
        //  2558: goto            2564
        //  2561: ldc_w           265972274
        //  2564: ldc_w           -549413217
        //  2567: ixor           
        //  2568: lookupswitch {
        //          -1856594682: 2561
        //          144905321: 2890
        //          default: 2596
        //        }
        //  2596: aload_0        
        //  2597: getfield        dev/nuker/pyro/f4Z.c:Lnet/minecraft/client/Minecraft;
        //  2600: getstatic       dev/nuker/pyro/fc.0:I
        //  2603: ifeq            2612
        //  2606: ldc_w           1622553983
        //  2609: goto            2615
        //  2612: ldc_w           -780644929
        //  2615: ldc_w           1319101047
        //  2618: ixor           
        //  2619: lookupswitch {
        //          -1612206136: 2644
        //          774493960: 2612
        //          default: 2868
        //        }
        //  2644: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2647: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //  2650: goto            2654
        //  2653: athrow         
        //  2654: invokevirtual   net/minecraft/inventory/Container.func_75138_a:()Lnet/minecraft/util/NonNullList;
        //  2657: goto            2661
        //  2660: athrow         
        //  2661: iload_1        
        //  2662: goto            2666
        //  2665: athrow         
        //  2666: invokevirtual   net/minecraft/util/NonNullList.get:(I)Ljava/lang/Object;
        //  2669: goto            2673
        //  2672: athrow         
        //  2673: checkcast       Lnet/minecraft/item/ItemStack;
        //  2676: goto            2680
        //  2679: athrow         
        //  2680: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  2683: goto            2687
        //  2686: athrow         
        //  2687: ifeq            2810
        //  2690: getstatic       dev/nuker/pyro/fc.c:I
        //  2693: ifge            2702
        //  2696: ldc_w           -86512404
        //  2699: goto            2705
        //  2702: ldc_w           1562400277
        //  2705: ldc_w           -1556233526
        //  2708: ixor           
        //  2709: lookupswitch {
        //          -31615777: 2736
        //          1508519462: 2702
        //          default: 2908
        //        }
        //  2736: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  2739: iconst_0       
        //  2740: iload           4
        //  2742: iconst_0       
        //  2743: getstatic       net/minecraft/inventory/ClickType.QUICK_MOVE:Lnet/minecraft/inventory/ClickType;
        //  2746: aload_0        
        //  2747: invokedynamic   BootstrapMethod #2, accept:(Ldev/nuker/pyro/f4Z;)Ljava/util/function/Consumer;
        //  2752: getstatic       dev/nuker/pyro/fc.1:I
        //  2755: ifeq            2764
        //  2758: ldc_w           92592210
        //  2761: goto            2767
        //  2764: ldc_w           -206115333
        //  2767: ldc_w           -343196852
        //  2770: ixor           
        //  2771: lookupswitch {
        //          -300948706: 2764
        //          406705847: 2796
        //          default: 2910
        //        }
        //  2796: goto            2800
        //  2799: athrow         
        //  2800: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //  2803: goto            2807
        //  2806: athrow         
        //  2807: goto            2837
        //  2810: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  2813: iconst_0       
        //  2814: iload           4
        //  2816: iload_1        
        //  2817: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  2820: aload_0        
        //  2821: invokedynamic   BootstrapMethod #3, accept:(Ldev/nuker/pyro/f4Z;)Ljava/util/function/Consumer;
        //  2826: goto            2830
        //  2829: athrow         
        //  2830: invokevirtual   dev/nuker/pyro/fbi.c:(IIILnet/minecraft/inventory/ClickType;Ljava/util/function/Consumer;)V
        //  2833: goto            2837
        //  2836: athrow         
        //  2837: return         
        //  2838: aconst_null    
        //  2839: athrow         
        //  2840: aconst_null    
        //  2841: athrow         
        //  2842: aconst_null    
        //  2843: athrow         
        //  2844: aconst_null    
        //  2845: athrow         
        //  2846: aconst_null    
        //  2847: athrow         
        //  2848: aconst_null    
        //  2849: athrow         
        //  2850: aconst_null    
        //  2851: athrow         
        //  2852: aconst_null    
        //  2853: athrow         
        //  2854: aconst_null    
        //  2855: athrow         
        //  2856: aconst_null    
        //  2857: athrow         
        //  2858: aconst_null    
        //  2859: athrow         
        //  2860: aconst_null    
        //  2861: athrow         
        //  2862: aconst_null    
        //  2863: athrow         
        //  2864: aconst_null    
        //  2865: athrow         
        //  2866: aconst_null    
        //  2867: athrow         
        //  2868: aconst_null    
        //  2869: athrow         
        //  2870: aconst_null    
        //  2871: athrow         
        //  2872: aconst_null    
        //  2873: athrow         
        //  2874: aconst_null    
        //  2875: athrow         
        //  2876: aconst_null    
        //  2877: athrow         
        //  2878: aconst_null    
        //  2879: athrow         
        //  2880: aconst_null    
        //  2881: athrow         
        //  2882: aconst_null    
        //  2883: athrow         
        //  2884: aconst_null    
        //  2885: athrow         
        //  2886: aconst_null    
        //  2887: athrow         
        //  2888: aconst_null    
        //  2889: athrow         
        //  2890: aconst_null    
        //  2891: athrow         
        //  2892: aconst_null    
        //  2893: athrow         
        //  2894: aconst_null    
        //  2895: athrow         
        //  2896: aconst_null    
        //  2897: athrow         
        //  2898: aconst_null    
        //  2899: athrow         
        //  2900: aconst_null    
        //  2901: athrow         
        //  2902: aconst_null    
        //  2903: athrow         
        //  2904: aconst_null    
        //  2905: athrow         
        //  2906: aconst_null    
        //  2907: athrow         
        //  2908: aconst_null    
        //  2909: athrow         
        //  2910: aconst_null    
        //  2911: athrow         
        //  2912: pop            
        //  2913: goto            24
        //  2916: pop            
        //  2917: aconst_null    
        //  2918: goto            2912
        //  2921: dup            
        //  2922: ifnull          2912
        //  2925: checkcast       Ljava/lang/Throwable;
        //  2928: athrow         
        //  2929: dup            
        //  2930: ifnull          2916
        //  2933: checkcast       Ljava/lang/Throwable;
        //  2936: athrow         
        //  2937: aconst_null    
        //  2938: athrow         
        //    StackMapTable: 01 67 FF 00 03 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 2C FA 00 04 FF 00 0B 00 00 00 01 07 01 2C FE 00 03 07 00 03 01 07 01 EB FF 00 11 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 3A FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 3A 01 5E 07 01 3A 51 07 01 8B FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 8B 01 5E 07 01 8B 42 07 01 2C 40 07 01 8B 45 07 01 2C 40 07 01 91 FF 00 0C 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 03 07 01 91 01 01 FF 00 1C 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 42 07 01 2C FF 00 00 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F 4E 07 01 97 FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 97 01 5E 07 01 97 42 07 01 2C 40 07 01 97 45 07 01 2C 40 01 49 07 01 2C 40 07 00 41 45 07 01 2C 40 07 00 9F 06 4F 07 01 3A FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 3A 01 5C 07 01 3A 51 07 01 8B FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 8B 01 5E 07 01 8B 42 07 01 2C 40 07 01 8B 45 07 01 2C 40 07 01 91 4B 07 01 91 FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 5D 07 01 91 43 07 01 1C FF 00 00 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F 4E 07 01 97 FF 00 02 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 97 01 5D 07 01 97 FC 00 0D 07 01 97 42 01 1E 44 07 01 2C 40 07 01 97 45 07 01 2C 40 01 44 07 01 2C FF 00 00 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 01 07 01 97 45 07 01 2C FF 00 00 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 01 01 FF 00 0F 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 02 07 01 97 FF 00 02 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 03 02 07 01 97 01 FF 00 1E 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 02 07 01 97 FF 00 02 00 00 00 01 07 01 2C FF 00 00 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 02 07 01 97 45 07 01 2C FF 00 00 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 02 01 FF 00 1A 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 00 29 FF 00 02 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 03 03 07 00 29 01 FF 00 1E 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 00 29 42 07 01 2C FF 00 00 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 00 29 45 07 01 2C FF 00 00 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 02 93 45 07 01 2C FF 00 00 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 03 04 F9 00 02 01 FF 00 0F 00 05 07 00 03 01 07 01 EB 01 01 00 01 01 FF 00 02 00 05 07 00 03 01 07 01 EB 01 01 00 02 01 01 5D 01 FD 00 05 01 01 06 05 42 01 19 4F 07 01 3A FF 00 02 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 02 07 01 3A 01 5C 07 01 3A 51 07 01 8B FF 00 02 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 02 07 01 8B 01 5E 07 01 8B 42 07 01 20 40 07 01 8B 45 07 01 2C 40 07 01 91 44 07 01 2C FF 00 00 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F FF 00 09 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 01 07 01 2C 40 07 01 97 45 07 01 2C 40 01 02 05 42 01 19 02 48 07 01 2C 40 07 01 97 45 07 01 2C 40 01 FF 00 0D 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 01 07 01 97 FF 00 02 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 03 01 07 01 97 01 FF 00 1E 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 01 07 01 97 42 07 01 0C FF 00 00 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 01 07 01 97 45 07 01 2C FF 00 00 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 01 01 FF 00 0F 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 02 07 01 97 FF 00 02 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 03 02 07 01 97 01 FF 00 1D 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 02 07 01 97 42 07 01 2C FF 00 00 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 02 07 01 97 45 07 01 2C FF 00 00 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 02 01 FC 00 13 02 42 01 1D 4E 03 FF 00 02 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 02 03 01 5D 03 46 07 01 1C FF 00 00 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 02 03 07 00 29 45 07 01 2C FF 00 00 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 02 03 07 00 9F 45 07 01 18 FF 00 00 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 02 03 07 02 93 45 07 01 2C FF 00 00 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 02 03 03 FA 00 06 0B 42 01 1C 54 07 01 97 FF 00 02 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 07 01 97 01 5F 07 01 97 42 07 01 2C 40 07 01 97 45 07 01 2C 40 07 02 B3 52 07 00 03 FF 00 02 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 07 00 03 01 5E 07 00 03 45 07 01 2C 40 07 00 61 45 07 01 2C 40 07 00 9F 4E 07 01 5F FF 00 02 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 07 01 5F 01 5F 07 01 5F 42 07 01 1E 40 07 01 5F 45 07 01 2C 40 01 47 07 01 16 40 07 01 97 45 07 01 2C 40 01 09 44 07 01 22 40 07 01 97 45 07 01 2C 40 07 02 B3 4A 07 01 2C 40 07 01 97 45 07 01 2C 40 07 02 B3 FF 00 09 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 0E 40 07 01 C7 45 07 01 2C 40 07 01 EB 48 07 01 2C 40 07 01 97 45 07 01 2C 40 07 01 FA FF 00 02 00 00 00 01 07 01 2C FF 00 00 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 00 01 07 01 FA 47 07 01 2C 40 07 02 00 42 07 01 2C 40 07 02 00 47 07 01 2C 40 07 02 09 FC 00 01 07 02 09 0B 42 01 1C 44 07 01 24 40 07 02 09 47 07 01 2C 40 01 02 05 42 01 18 44 07 01 28 40 07 02 09 47 07 01 2C 40 07 00 9F FC 00 10 07 02 14 42 01 1C 13 42 01 1C FC 00 12 07 02 16 42 01 1D 46 07 01 2C FF 00 00 00 0C 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 02 07 02 14 07 01 97 45 07 01 2C 40 01 4B 01 FF 00 02 00 0C 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 02 01 01 5D 01 FF 00 0C 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 07 01 1C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 02 2B 45 07 01 2C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 01 1A 11 06 05 42 01 19 0B 42 01 1C FF 00 12 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 41 FF 00 02 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 03 07 02 B1 07 00 41 01 FF 00 1D 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 41 42 07 01 2C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 41 45 07 01 2C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 9F FF 00 05 00 00 00 01 07 01 2C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 79 45 07 01 2C FF 00 00 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 01 1A 0B 42 01 1C 54 07 02 16 FF 00 02 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 16 01 5F 07 02 16 08 05 42 01 19 06 4D 01 FF 00 02 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 01 01 5F 01 1B 42 01 1C F9 00 03 FA 00 02 F9 00 09 FA 00 05 05 05 42 01 19 10 42 01 1F 4F 07 01 3A FF 00 02 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 02 07 01 3A 01 5C 07 01 3A 48 07 01 1A 40 07 01 8B 45 07 01 2C 40 07 01 91 43 07 01 2C FF 00 00 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 02 07 01 91 01 45 07 01 2C 40 07 00 9F 45 07 01 2C 40 07 01 97 45 07 01 2C 40 01 0E 42 01 1E FF 00 1B 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 FF 00 02 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 07 07 02 66 01 01 01 07 02 6E 07 02 B5 01 FF 00 1C 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 FF 00 02 00 00 00 01 07 01 2C FF 00 00 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 45 07 01 2C 00 02 52 07 01 24 FF 00 00 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 45 07 01 2C 00 FF 00 00 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 01 07 01 97 FF 00 01 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 01 FF 00 01 00 06 07 00 03 01 07 01 EB 01 07 01 97 02 00 02 03 07 00 29 FF 00 01 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 01 07 01 5F FF 00 01 00 0C 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 01 01 FA 00 01 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 97 FC 00 01 07 01 97 FF 00 01 00 0A 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 00 00 FE 00 01 07 02 14 07 02 16 01 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 97 FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 01 07 01 8B FF 00 01 00 0C 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 00 00 FF 00 01 00 05 07 00 03 01 07 01 EB 01 07 01 97 00 02 02 07 01 97 FF 00 01 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 01 07 02 16 FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 01 07 01 3A FF 00 01 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 01 07 00 03 FF 00 01 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 01 07 01 97 FF 00 01 00 05 07 00 03 01 07 01 EB 01 01 00 01 01 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 8B FF 00 01 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 00 FA 00 01 FF 00 01 00 08 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 00 02 02 07 01 97 FF 00 01 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 00 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 02 07 01 91 01 FF 00 01 00 0B 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 00 00 FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 00 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 3A 41 07 01 3A FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 01 07 01 3A FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 91 FF 00 01 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 02 07 02 B1 07 00 41 FF 00 01 00 09 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 02 00 01 03 FF 00 01 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 8B FF 00 01 00 0D 07 00 03 01 07 01 EB 01 01 01 01 07 01 97 07 01 C7 07 02 09 07 02 14 07 02 16 01 00 00 FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 00 FF 00 01 00 07 07 00 03 01 07 01 EB 01 01 01 01 00 06 07 02 66 01 01 01 07 02 6E 07 02 B5 FF 00 01 00 03 07 00 03 01 07 01 EB 00 01 07 01 2C 43 05 44 07 01 2C 47 05 FF 00 07 00 04 07 00 03 01 07 01 EB 01 00 01 07 01 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2921   2929   Any
        //  2921   2929   2921   2929   Any
        //  2937   2939   3      8      Ljava/util/ConcurrentModificationException;
        //  131    138    138    139    Any
        //  132    138    138    139    Ljava/lang/IllegalStateException;
        //  132    138    3      8      Any
        //  131    138    3      8      Ljava/lang/ClassCastException;
        //  132    138    131    132    Any
        //  187    194    194    195    Any
        //  187    194    3      8      Ljava/lang/IllegalStateException;
        //  187    194    187    188    Any
        //  188    194    3      8      Any
        //  188    194    194    195    Any
        //  247    254    254    255    Any
        //  248    254    254    255    Ljava/lang/NumberFormatException;
        //  248    254    3      8      Ljava/lang/NullPointerException;
        //  247    254    3      8      Any
        //  248    254    247    248    Any
        //  265    272    272    273    Any
        //  266    272    265    266    Any
        //  265    272    265    266    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  266    272    3      8      Ljava/lang/IllegalArgumentException;
        //  265    272    272    273    Ljava/lang/AssertionError;
        //  383    390    390    391    Any
        //  383    390    383    384    Ljava/lang/ArithmeticException;
        //  383    390    383    384    Any
        //  383    390    3      8      Any
        //  383    390    383    384    Any
        //  440    447    447    448    Any
        //  441    447    447    448    Any
        //  441    447    440    441    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  440    447    440    441    Ljava/lang/RuntimeException;
        //  440    447    440    441    Ljava/lang/IllegalStateException;
        //  549    556    556    557    Any
        //  549    556    549    550    Ljava/lang/IllegalStateException;
        //  550    556    3      8      Any
        //  549    556    549    550    Any
        //  550    556    549    550    Any
        //  562    569    569    570    Any
        //  562    569    569    570    Any
        //  563    569    569    570    Ljava/lang/IllegalArgumentException;
        //  562    569    562    563    Any
        //  562    569    569    570    Any
        //  624    630    630    631    Any
        //  624    630    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  624    630    630    631    Ljava/lang/EnumConstantNotPresentException;
        //  624    630    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  624    630    630    631    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  695    702    702    703    Any
        //  695    702    702    703    Ljava/lang/StringIndexOutOfBoundsException;
        //  696    702    695    696    Any
        //  695    702    702    703    Ljava/util/NoSuchElementException;
        //  695    702    702    703    Ljava/lang/IndexOutOfBoundsException;
        //  710    716    716    717    Any
        //  710    716    716    717    Ljava/lang/ArithmeticException;
        //  710    716    3      8      Any
        //  710    716    716    717    Ljava/lang/EnumConstantNotPresentException;
        //  710    716    3      8      Any
        //  927    934    934    935    Any
        //  927    934    927    928    Ljava/util/NoSuchElementException;
        //  928    934    934    935    Ljava/util/NoSuchElementException;
        //  927    934    3      8      Ljava/lang/NegativeArraySizeException;
        //  928    934    934    935    Ljava/lang/IndexOutOfBoundsException;
        //  940    947    947    948    Any
        //  941    947    947    948    Any
        //  940    947    940    941    Any
        //  941    947    947    948    Any
        //  941    947    940    941    Any
        //  958    965    965    966    Any
        //  958    965    965    966    Any
        //  959    965    965    966    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  959    965    965    966    Ljava/lang/EnumConstantNotPresentException;
        //  958    965    958    959    Any
        //  1016   1023   1023   1024   Any
        //  1017   1023   3      8      Any
        //  1017   1023   1023   1024   Ljava/lang/ArithmeticException;
        //  1017   1023   1016   1017   Any
        //  1017   1023   1023   1024   Any
        //  1075   1082   1082   1083   Any
        //  1075   1082   3      8      Ljava/util/ConcurrentModificationException;
        //  1075   1082   1082   1083   Ljava/util/ConcurrentModificationException;
        //  1075   1082   1075   1076   Ljava/lang/EnumConstantNotPresentException;
        //  1076   1082   3      8      Ljava/lang/ClassCastException;
        //  1135   1142   1142   1143   Any
        //  1135   1142   1135   1136   Any
        //  1135   1142   3      8      Any
        //  1135   1142   1142   1143   Ljava/lang/AssertionError;
        //  1135   1142   3      8      Any
        //  1251   1258   1258   1259   Any
        //  1252   1258   1251   1252   Ljava/lang/IllegalArgumentException;
        //  1252   1258   1258   1259   Any
        //  1252   1258   1251   1252   Ljava/lang/IllegalStateException;
        //  1252   1258   1258   1259   Any
        //  1265   1272   1272   1273   Any
        //  1266   1272   1265   1266   Ljava/lang/IllegalArgumentException;
        //  1266   1272   1272   1273   Any
        //  1265   1272   3      8      Ljava/lang/RuntimeException;
        //  1265   1272   1265   1266   Ljava/lang/IllegalArgumentException;
        //  1383   1390   1390   1391   Any
        //  1384   1390   3      8      Ljava/util/ConcurrentModificationException;
        //  1384   1390   1383   1384   Any
        //  1384   1390   1390   1391   Ljava/lang/NullPointerException;
        //  1383   1390   1390   1391   Any
        //  1450   1457   1457   1458   Any
        //  1450   1457   3      8      Ljava/lang/IllegalArgumentException;
        //  1450   1457   1457   1458   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1450   1457   1450   1451   Any
        //  1451   1457   1450   1451   Ljava/lang/IllegalStateException;
        //  1511   1518   1518   1519   Any
        //  1511   1518   3      8      Any
        //  1511   1518   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1511   1518   1511   1512   Ljava/lang/StringIndexOutOfBoundsException;
        //  1511   1518   1511   1512   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1527   1534   1534   1535   Any
        //  1528   1534   3      8      Any
        //  1527   1534   1527   1528   Ljava/lang/ArithmeticException;
        //  1528   1534   3      8      Ljava/lang/NumberFormatException;
        //  1527   1534   1534   1535   Any
        //  1550   1557   1557   1558   Any
        //  1550   1557   3      8      Ljava/lang/NegativeArraySizeException;
        //  1551   1557   1557   1558   Any
        //  1550   1557   1550   1551   Ljava/lang/StringIndexOutOfBoundsException;
        //  1550   1557   1557   1558   Any
        //  1569   1576   1576   1577   Any
        //  1570   1576   1569   1570   Any
        //  1570   1576   1576   1577   Any
        //  1569   1576   1569   1570   Ljava/lang/EnumConstantNotPresentException;
        //  1569   1576   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1587   1594   1594   1595   Any
        //  1588   1594   1587   1588   Ljava/lang/NumberFormatException;
        //  1587   1594   3      8      Any
        //  1587   1594   3      8      Ljava/util/ConcurrentModificationException;
        //  1588   1594   3      8      Ljava/lang/IllegalArgumentException;
        //  1604   1611   1611   1612   Any
        //  1605   1611   1604   1605   Ljava/lang/UnsupportedOperationException;
        //  1604   1611   3      8      Any
        //  1604   1611   1611   1612   Ljava/lang/IllegalStateException;
        //  1605   1611   1604   1605   Ljava/lang/AssertionError;
        //  1616   1624   1624   1625   Any
        //  1616   1624   1624   1625   Ljava/lang/ArithmeticException;
        //  1616   1624   1624   1625   Ljava/lang/ArithmeticException;
        //  1616   1624   3      8      Any
        //  1616   1624   1624   1625   Any
        //  1628   1637   1637   1638   Any
        //  1629   1637   1637   1638   Ljava/lang/NegativeArraySizeException;
        //  1629   1637   1628   1629   Any
        //  1628   1637   1637   1638   Any
        //  1628   1637   1637   1638   Ljava/lang/UnsupportedOperationException;
        //  1689   1698   1698   1699   Any
        //  1690   1698   1698   1699   Ljava/lang/EnumConstantNotPresentException;
        //  1689   1698   1689   1690   Ljava/lang/ClassCastException;
        //  1689   1698   1698   1699   Any
        //  1690   1698   3      8      Ljava/util/NoSuchElementException;
        //  1741   1750   1750   1751   Any
        //  1741   1750   1741   1742   Ljava/lang/NullPointerException;
        //  1742   1750   1750   1751   Ljava/lang/UnsupportedOperationException;
        //  1741   1750   3      8      Ljava/lang/ArithmeticException;
        //  1742   1750   1750   1751   Any
        //  1911   1918   1918   1919   Any
        //  1912   1918   1918   1919   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1911   1918   3      8      Any
        //  1911   1918   1911   1912   Any
        //  1912   1918   1918   1919   Any
        //  1977   1984   1984   1985   Any
        //  1978   1984   3      8      Ljava/lang/UnsupportedOperationException;
        //  1977   1984   3      8      Ljava/lang/IllegalArgumentException;
        //  1978   1984   1977   1978   Ljava/lang/StringIndexOutOfBoundsException;
        //  1978   1984   1977   1978   Ljava/util/ConcurrentModificationException;
        //  2171   2178   2178   2179   Any
        //  2171   2178   3      8      Any
        //  2171   2178   2171   2172   Any
        //  2171   2178   2178   2179   Any
        //  2171   2178   3      8      Ljava/lang/ClassCastException;
        //  2186   2192   2192   2193   Any
        //  2186   2192   2192   2193   Ljava/lang/IllegalStateException;
        //  2186   2192   3      8      Ljava/lang/AssertionError;
        //  2186   2192   3      8      Ljava/lang/AssertionError;
        //  2186   2192   3      8      Any
        //  2653   2660   2660   2661   Any
        //  2653   2660   2653   2654   Ljava/lang/NegativeArraySizeException;
        //  2654   2660   2660   2661   Any
        //  2654   2660   2660   2661   Any
        //  2654   2660   3      8      Any
        //  2665   2672   2672   2673   Any
        //  2666   2672   3      8      Ljava/util/ConcurrentModificationException;
        //  2665   2672   2665   2666   Any
        //  2666   2672   3      8      Ljava/lang/UnsupportedOperationException;
        //  2665   2672   2672   2673   Ljava/lang/NullPointerException;
        //  2679   2686   2686   2687   Any
        //  2680   2686   2679   2680   Any
        //  2679   2686   2679   2680   Any
        //  2679   2686   3      8      Any
        //  2680   2686   2686   2687   Any
        //  2800   2806   2806   2807   Any
        //  2800   2806   2806   2807   Any
        //  2800   2806   2806   2807   Any
        //  2800   2806   3      8      Ljava/lang/AssertionError;
        //  2800   2806   3      8      Ljava/lang/AssertionError;
        //  2829   2836   2836   2837   Any
        //  2830   2836   2829   2830   Ljava/lang/ClassCastException;
        //  2830   2836   2836   2837   Ljava/lang/IndexOutOfBoundsException;
        //  2830   2836   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2830   2836   2836   2837   Any
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
}
