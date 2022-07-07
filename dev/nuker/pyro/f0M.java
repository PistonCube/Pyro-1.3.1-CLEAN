// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.Tuple;
import java.util.function.Supplier;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;
import java.util.List;

public class f0M implements f0V
{
    @JvmField
    @NotNull
    public List<f0w> c;
    @JvmField
    @Nullable
    public f0w c;
    @NotNull
    public fw<Boolean> c;
    @Nullable
    public f0V c;
    @NotNull
    public List<? extends f0V> 0;
    
    public f0M(@Nullable final f0V c, @NotNull final List 0, @NotNull final fw c2) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = -1483466322;
                    break Label_0013;
                }
                n = 1570035227;
            }
            switch (n ^ 0xA064A739) {
                case 133217943: {
                    continue;
                }
                case -34574046: {
                    this.c = c;
                    this.0 = (List<? extends f0V>)0;
                    this.c = new ArrayList<f0w>();
                    this.c = (fw<Boolean>)c2;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public List c() {
        return fbS.gK(this, 374966082);
    }
    
    @Override
    public void c(@NotNull final f0w p0, @NotNull final f0y p1, @NotNull final f0Z p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1406
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1398
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1390
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             1707405992
        //    32: goto            37
        //    35: ldc             250286259
        //    37: ldc             966726292
        //    39: ixor           
        //    40: lookupswitch {
        //          930349607: 68
        //          1549525052: 35
        //          default: 1345
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_2        
        //    71: pop            
        //    72: aload_3        
        //    73: pop            
        //    74: aload_3        
        //    75: instanceof      Ldev/nuker/pyro/f0X;
        //    78: ifeq            86
        //    81: ldc             2018598005
        //    83: goto            88
        //    86: ldc             2018598002
        //    88: ldc             -701212026
        //    90: ixor           
        //    91: tableswitch {
        //          1556745702: 112
        //          1556745703: 174
        //          default: 81
        //        }
        //   112: aload_3        
        //   113: checkcast       Ldev/nuker/pyro/f0X;
        //   116: getstatic       dev/nuker/pyro/fc.0:I
        //   119: ifeq            127
        //   122: ldc             1671205909
        //   124: goto            129
        //   127: ldc             -1936823051
        //   129: ldc             -51626287
        //   131: ixor           
        //   132: lookupswitch {
        //          -1620006204: 1349
        //          -885403035: 127
        //          default: 160
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokevirtual   dev/nuker/pyro/f0X.0:()D
        //   167: goto            171
        //   170: athrow         
        //   171: goto            186
        //   174: aload_3        
        //   175: goto            179
        //   178: athrow         
        //   179: invokevirtual   dev/nuker/pyro/f0Z.4:()D
        //   182: goto            186
        //   185: athrow         
        //   186: getstatic       dev/nuker/pyro/fc.0:I
        //   189: ifeq            197
        //   192: ldc             878898351
        //   194: goto            199
        //   197: ldc             946631456
        //   199: ldc             -797598924
        //   201: ixor           
        //   202: lookupswitch {
        //          -468224101: 1355
        //          -309473236: 197
        //          default: 228
        //        }
        //   228: dstore          4
        //   230: aload_3        
        //   231: instanceof      Ldev/nuker/pyro/f0X;
        //   234: ifeq            242
        //   237: ldc             -990761177
        //   239: goto            244
        //   242: ldc             -990761178
        //   244: ldc             141585999
        //   246: ixor           
        //   247: tableswitch {
        //          -1727757616: 268
        //          -1727757615: 374
        //          default: 237
        //        }
        //   268: getstatic       dev/nuker/pyro/fc.0:I
        //   271: ifeq            279
        //   274: ldc             2053535354
        //   276: goto            281
        //   279: ldc             -1903424602
        //   281: ldc             -1530530330
        //   283: ixor           
        //   284: lookupswitch {
        //          -559709284: 279
        //          709492288: 312
        //          default: 1361
        //        }
        //   312: aload_3        
        //   313: checkcast       Ldev/nuker/pyro/f0X;
        //   316: getstatic       dev/nuker/pyro/fc.0:I
        //   319: ifeq            327
        //   322: ldc             -519539021
        //   324: goto            329
        //   327: ldc             -437035300
        //   329: ldc             -48642161
        //   331: ixor           
        //   332: lookupswitch {
        //          470921532: 1367
        //          1081459024: 327
        //          default: 360
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   dev/nuker/pyro/f0X.1:()D
        //   367: goto            371
        //   370: athrow         
        //   371: goto            386
        //   374: aload_3        
        //   375: goto            379
        //   378: athrow         
        //   379: invokevirtual   dev/nuker/pyro/f0Z.3:()D
        //   382: goto            386
        //   385: athrow         
        //   386: dstore          6
        //   388: aload_0        
        //   389: getstatic       dev/nuker/pyro/fc.1:I
        //   392: ifeq            400
        //   395: ldc             945062802
        //   397: goto            402
        //   400: ldc             -1842547768
        //   402: ldc             1171129372
        //   404: ixor           
        //   405: lookupswitch {
        //          -672991276: 432
        //          2107279246: 400
        //          default: 1365
        //        }
        //   432: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   435: dup            
        //   436: ifnonnull       491
        //   439: getstatic       dev/nuker/pyro/fc.c:I
        //   442: ifge            450
        //   445: ldc             1838633161
        //   447: goto            452
        //   450: ldc             528637563
        //   452: ldc             -532804199
        //   454: ixor           
        //   455: lookupswitch {
        //          -1918280368: 1347
        //          617556462: 450
        //          default: 480
        //        }
        //   480: goto            484
        //   483: athrow         
        //   484: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   487: goto            491
        //   490: athrow         
        //   491: aload_0        
        //   492: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   495: dup            
        //   496: ifnonnull       510
        //   499: goto            503
        //   502: athrow         
        //   503: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   506: goto            510
        //   509: athrow         
        //   510: dload           4
        //   512: dload           6
        //   514: aload_2        
        //   515: goto            519
        //   518: athrow         
        //   519: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   524: goto            528
        //   527: athrow         
        //   528: ifeq            610
        //   531: aload_0        
        //   532: getstatic       dev/nuker/pyro/fc.c:I
        //   535: ifge            543
        //   538: ldc             1806789006
        //   540: goto            545
        //   543: ldc             -1706803949
        //   545: ldc             538791259
        //   547: ixor           
        //   548: lookupswitch {
        //          927301226: 543
        //          1269572821: 1373
        //          default: 576
        //        }
        //   576: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   579: dup            
        //   580: ifnonnull       594
        //   583: goto            587
        //   586: athrow         
        //   587: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   590: goto            594
        //   593: athrow         
        //   594: aload_1        
        //   595: aload_2        
        //   596: aload_3        
        //   597: goto            601
        //   600: athrow         
        //   601: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;Ldev/nuker/pyro/f0Z;)V
        //   606: goto            610
        //   609: athrow         
        //   610: aload_0        
        //   611: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   614: goto            618
        //   617: athrow         
        //   618: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   621: goto            625
        //   624: athrow         
        //   625: dup            
        //   626: pop            
        //   627: checkcast       Ljava/lang/Boolean;
        //   630: goto            634
        //   633: athrow         
        //   634: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   637: goto            641
        //   640: athrow         
        //   641: ifeq            649
        //   644: ldc             -564558235
        //   646: goto            651
        //   649: ldc             -564558230
        //   651: ldc             -603031694
        //   653: ixor           
        //   654: tableswitch {
        //          78635566: 676
        //          78635567: 1344
        //          default: 644
        //        }
        //   676: aload_0        
        //   677: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   680: dup            
        //   681: ifnonnull       695
        //   684: goto            688
        //   687: athrow         
        //   688: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   691: goto            695
        //   694: athrow         
        //   695: goto            699
        //   698: athrow         
        //   699: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   702: goto            706
        //   705: athrow         
        //   706: istore          8
        //   708: iconst_0       
        //   709: istore          9
        //   711: aload_0        
        //   712: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   715: checkcast       Ljava/util/Collection;
        //   718: getstatic       dev/nuker/pyro/fc.0:I
        //   721: ifeq            729
        //   724: ldc             1353018372
        //   726: goto            731
        //   729: ldc             417224000
        //   731: ldc             1171262287
        //   733: ixor           
        //   734: lookupswitch {
        //          360015691: 1371
        //          1668608260: 729
        //          default: 760
        //        }
        //   760: goto            764
        //   763: athrow         
        //   764: invokeinterface java/util/Collection.size:()I
        //   769: goto            773
        //   772: athrow         
        //   773: getstatic       dev/nuker/pyro/fc.c:I
        //   776: ifge            784
        //   779: ldc             -2083109917
        //   781: goto            786
        //   784: ldc             17727616
        //   786: ldc             1325210067
        //   788: ixor           
        //   789: lookupswitch {
        //          -1840854448: 784
        //          -852796880: 1363
        //          default: 816
        //        }
        //   816: istore          10
        //   818: getstatic       dev/nuker/pyro/fc.0:I
        //   821: ifeq            829
        //   824: ldc             1951971778
        //   826: goto            831
        //   829: ldc             -2066847053
        //   831: ldc             803461776
        //   833: ixor           
        //   834: lookupswitch {
        //          -1735516597: 829
        //          1539007314: 1369
        //          default: 860
        //        }
        //   860: iload           9
        //   862: iload           10
        //   864: if_icmpge       872
        //   867: ldc             -484155707
        //   869: goto            874
        //   872: ldc             -484155702
        //   874: ldc             1368144930
        //   876: ixor           
        //   877: tableswitch {
        //          1699792334: 900
        //          1699792335: 1344
        //          default: 867
        //        }
        //   900: aload_0        
        //   901: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   904: iload           9
        //   906: goto            910
        //   909: athrow         
        //   910: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   915: goto            919
        //   918: athrow         
        //   919: checkcast       Ldev/nuker/pyro/f0V;
        //   922: astore          11
        //   924: aload_0        
        //   925: getstatic       dev/nuker/pyro/fc.0:I
        //   928: ifeq            936
        //   931: ldc             -1785853137
        //   933: goto            938
        //   936: ldc             -658708487
        //   938: ldc             1928444010
        //   940: ixor           
        //   941: lookupswitch {
        //          -1437769837: 968
        //          -411061435: 936
        //          default: 1357
        //        }
        //   968: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   971: getstatic       dev/nuker/pyro/fc.c:I
        //   974: ifge            982
        //   977: ldc             -513339772
        //   979: goto            984
        //   982: ldc             -380968063
        //   984: ldc             -1486988375
        //   986: ixor           
        //   987: lookupswitch {
        //          -1333711578: 982
        //          1178162477: 1375
        //          default: 1012
        //        }
        //  1012: iload           9
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: dup            
        //  1028: ifnonnull       1042
        //  1031: goto            1035
        //  1034: athrow         
        //  1035: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1038: goto            1042
        //  1041: athrow         
        //  1042: checkcast       Ldev/nuker/pyro/f0w;
        //  1045: astore          12
        //  1047: aload           11
        //  1049: aload           12
        //  1051: dload           4
        //  1053: dload           6
        //  1055: iload           8
        //  1057: i2d            
        //  1058: dsub           
        //  1059: aload_2        
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //  1069: goto            1073
        //  1072: athrow         
        //  1073: ifeq            1192
        //  1076: aload           11
        //  1078: aload_1        
        //  1079: aload_2        
        //  1080: aload_3        
        //  1081: dconst_0       
        //  1082: getstatic       dev/nuker/pyro/fc.0:I
        //  1085: ifeq            1093
        //  1088: ldc             -1698082222
        //  1090: goto            1095
        //  1093: ldc             -1223875959
        //  1095: ldc             1876097365
        //  1097: ixor           
        //  1098: lookupswitch {
        //          -2067950862: 1093
        //          -182736121: 1359
        //          default: 1124
        //        }
        //  1124: iload           8
        //  1126: i2d            
        //  1127: getstatic       dev/nuker/pyro/fc.c:I
        //  1130: ifge            1138
        //  1133: ldc             -106571977
        //  1135: goto            1140
        //  1138: ldc             1556453265
        //  1140: ldc             -1803777918
        //  1142: ixor           
        //  1143: lookupswitch {
        //          -927391981: 1168
        //          1842962357: 1138
        //          default: 1351
        //        }
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokevirtual   dev/nuker/pyro/f0Z.c:(DD)Ldev/nuker/pyro/f0Z;
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: goto            1183
        //  1182: athrow         
        //  1183: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;Ldev/nuker/pyro/f0Z;)V
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: iload           8
        //  1194: getstatic       dev/nuker/pyro/fc.c:I
        //  1197: ifge            1205
        //  1200: ldc             1480118234
        //  1202: goto            1207
        //  1205: ldc             -596867261
        //  1207: ldc             -1926744276
        //  1209: ixor           
        //  1210: lookupswitch {
        //          -1553782294: 1205
        //          -720307978: 1379
        //          default: 1236
        //        }
        //  1236: aload           12
        //  1238: getstatic       dev/nuker/pyro/fc.1:I
        //  1241: ifeq            1249
        //  1244: ldc             -751867732
        //  1246: goto            1251
        //  1249: ldc             2080591013
        //  1251: ldc             -569123416
        //  1253: ixor           
        //  1254: lookupswitch {
        //          -1575972595: 1280
        //          222082308: 1249
        //          default: 1377
        //        }
        //  1280: goto            1284
        //  1283: athrow         
        //  1284: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1287: goto            1291
        //  1290: athrow         
        //  1291: iadd           
        //  1292: getstatic       dev/nuker/pyro/fc.1:I
        //  1295: ifeq            1303
        //  1298: ldc             -2076199880
        //  1300: goto            1305
        //  1303: ldc             710441313
        //  1305: ldc             303713101
        //  1307: ixor           
        //  1308: lookupswitch {
        //          -1775894667: 1353
        //          365946562: 1303
        //          default: 1336
        //        }
        //  1336: istore          8
        //  1338: iinc            9, 1
        //  1341: goto            818
        //  1344: return         
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
        //  1373: aconst_null    
        //  1374: athrow         
        //  1375: aconst_null    
        //  1376: athrow         
        //  1377: aconst_null    
        //  1378: athrow         
        //  1379: aconst_null    
        //  1380: athrow         
        //  1381: pop            
        //  1382: goto            24
        //  1385: pop            
        //  1386: aconst_null    
        //  1387: goto            1381
        //  1390: dup            
        //  1391: ifnull          1381
        //  1394: checkcast       Ljava/lang/Throwable;
        //  1397: athrow         
        //  1398: dup            
        //  1399: ifnull          1385
        //  1402: checkcast       Ljava/lang/Throwable;
        //  1405: athrow         
        //  1406: aconst_null    
        //  1407: athrow         
        //    StackMapTable: 00 B9 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 00 0A 41 01 1E 0C 04 41 01 17 4E 07 00 62 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 62 01 5E 07 00 62 42 07 00 39 40 07 00 62 45 07 00 5B 40 03 02 FF 00 03 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 07 00 6D 45 07 00 5B 40 03 4A 03 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 01 5C 03 FC 00 08 03 04 41 01 17 0A 41 01 1E 4E 07 00 62 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 00 02 07 00 62 01 5E 07 00 62 42 07 00 5B 40 07 00 62 45 07 00 5B 40 03 02 43 07 00 5B 40 07 00 6D 45 07 00 5B 40 03 FF 00 0D 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 02 07 00 03 01 5D 07 00 03 51 07 00 07 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 02 07 00 07 01 5B 07 00 07 42 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 4A 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 02 07 00 07 07 00 A6 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 4E 07 00 03 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 02 07 00 03 01 5E 07 00 03 49 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 45 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 04 07 00 07 07 00 A6 07 00 D8 07 00 6D 47 07 00 5B 00 46 07 00 5B 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 02 04 41 01 18 4A 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 01 FF 00 16 00 08 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 00 01 07 00 AB FF 00 01 00 08 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 00 02 07 00 AB 01 5C 07 00 AB 42 07 00 5B 40 07 00 AB 47 07 00 5B 40 01 4A 01 FF 00 01 00 08 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 00 02 01 01 5D 01 FC 00 01 01 0A 41 01 1C 06 04 41 01 19 48 07 00 51 FF 00 00 00 09 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FF 00 10 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 02 07 00 03 01 5D 07 00 03 4D 07 00 2A FF 00 01 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 02 07 00 2A 01 5B 07 00 2A FF 00 04 00 00 00 01 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FF 00 06 00 00 00 01 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 01 07 00 05 45 07 00 5B 40 07 00 05 FF 00 14 00 00 00 01 07 00 5B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 FF 00 13 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 01 FF 00 1C 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 FF 00 0D 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 07 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 01 FF 00 1B 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 42 07 00 4B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 45 07 00 5B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 07 00 D8 07 00 6D 42 07 00 5B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 07 00 D8 07 00 6D 47 07 00 5B 00 4C 01 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 01 5C 01 FF 00 0C 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 03 01 07 00 A6 01 FF 00 1C 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 42 07 00 5B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 01 4B 01 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 01 5E 01 FF 00 07 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 00 F9 00 00 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 01 07 00 07 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 07 00 62 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 41 01 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 03 FF 00 01 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 01 07 00 03 FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 00 00 FF 00 01 00 08 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 00 01 01 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 00 01 07 00 62 FF 00 01 00 09 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 00 00 FF 00 01 00 08 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 00 01 07 00 AB FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 00 01 07 00 2A FF 00 01 00 0B 07 00 03 07 00 A6 07 00 D8 07 00 6D 03 03 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 41 01 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 07 00 39 43 05 44 07 00 39 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1390   1398   Ljava/lang/RuntimeException;
        //  1390   1398   1390   1398   Ljava/util/NoSuchElementException;
        //  1406   1408   3      8      Any
        //  163    170    170    171    Any
        //  164    170    170    171    Any
        //  164    170    163    164    Ljava/lang/NullPointerException;
        //  164    170    163    164    Ljava/lang/ClassCastException;
        //  163    170    170    171    Any
        //  179    185    185    186    Any
        //  179    185    3      8      Any
        //  179    185    185    186    Ljava/lang/RuntimeException;
        //  179    185    3      8      Any
        //  179    185    185    186    Ljava/lang/UnsupportedOperationException;
        //  363    370    370    371    Any
        //  364    370    370    371    Any
        //  364    370    363    364    Ljava/lang/NullPointerException;
        //  363    370    3      8      Ljava/lang/UnsupportedOperationException;
        //  364    370    363    364    Any
        //  378    385    385    386    Any
        //  379    385    378    379    Any
        //  379    385    378    379    Any
        //  378    385    385    386    Ljava/lang/StringIndexOutOfBoundsException;
        //  378    385    3      8      Any
        //  483    490    490    491    Any
        //  484    490    490    491    Ljava/lang/ArithmeticException;
        //  484    490    483    484    Ljava/util/NoSuchElementException;
        //  484    490    3      8      Ljava/lang/NegativeArraySizeException;
        //  483    490    483    484    Any
        //  502    509    509    510    Any
        //  502    509    509    510    Ljava/lang/IndexOutOfBoundsException;
        //  503    509    502    503    Any
        //  502    509    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  502    509    509    510    Any
        //  519    527    527    528    Any
        //  519    527    3      8      Ljava/lang/NullPointerException;
        //  519    527    3      8      Ljava/lang/ArithmeticException;
        //  519    527    3      8      Ljava/lang/NegativeArraySizeException;
        //  519    527    3      8      Ljava/lang/NegativeArraySizeException;
        //  586    593    593    594    Any
        //  586    593    586    587    Any
        //  587    593    3      8      Any
        //  586    593    586    587    Ljava/lang/NegativeArraySizeException;
        //  586    593    593    594    Any
        //  600    609    609    610    Any
        //  600    609    600    601    Any
        //  601    609    600    601    Any
        //  601    609    609    610    Any
        //  601    609    3      8      Ljava/lang/IllegalStateException;
        //  617    624    624    625    Any
        //  617    624    617    618    Any
        //  617    624    624    625    Ljava/lang/UnsupportedOperationException;
        //  617    624    3      8      Ljava/lang/ClassCastException;
        //  617    624    624    625    Any
        //  633    640    640    641    Any
        //  633    640    633    634    Any
        //  633    640    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  633    640    633    634    Ljava/lang/ArithmeticException;
        //  634    640    633    634    Any
        //  687    694    694    695    Any
        //  687    694    3      8      Any
        //  688    694    694    695    Ljava/lang/IllegalArgumentException;
        //  688    694    694    695    Ljava/lang/NumberFormatException;
        //  687    694    687    688    Any
        //  698    705    705    706    Any
        //  698    705    705    706    Any
        //  698    705    698    699    Any
        //  699    705    705    706    Ljava/lang/EnumConstantNotPresentException;
        //  699    705    705    706    Ljava/lang/StringIndexOutOfBoundsException;
        //  763    772    772    773    Any
        //  764    772    772    773    Ljava/util/ConcurrentModificationException;
        //  764    772    763    764    Any
        //  763    772    763    764    Ljava/lang/UnsupportedOperationException;
        //  763    772    772    773    Ljava/lang/IndexOutOfBoundsException;
        //  909    918    918    919    Any
        //  909    918    3      8      Ljava/lang/UnsupportedOperationException;
        //  909    918    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  910    918    918    919    Any
        //  910    918    909    910    Ljava/lang/NumberFormatException;
        //  1018   1026   1026   1027   Any
        //  1018   1026   1026   1027   Ljava/lang/ClassCastException;
        //  1018   1026   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1018   1026   3      8      Ljava/lang/IllegalStateException;
        //  1018   1026   1026   1027   Ljava/util/NoSuchElementException;
        //  1035   1041   1041   1042   Any
        //  1035   1041   1041   1042   Ljava/lang/NullPointerException;
        //  1035   1041   3      8      Ljava/lang/NegativeArraySizeException;
        //  1035   1041   1041   1042   Ljava/lang/NullPointerException;
        //  1035   1041   1041   1042   Any
        //  1064   1072   1072   1073   Any
        //  1064   1072   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1064   1072   3      8      Any
        //  1064   1072   3      8      Any
        //  1064   1072   1072   1073   Any
        //  1171   1178   1178   1179   Any
        //  1171   1178   1171   1172   Ljava/lang/IllegalStateException;
        //  1172   1178   3      8      Ljava/util/NoSuchElementException;
        //  1171   1178   3      8      Any
        //  1172   1178   1178   1179   Ljava/lang/EnumConstantNotPresentException;
        //  1182   1191   1191   1192   Any
        //  1182   1191   1182   1183   Ljava/lang/AssertionError;
        //  1183   1191   3      8      Ljava/lang/AssertionError;
        //  1183   1191   1182   1183   Ljava/lang/IllegalArgumentException;
        //  1183   1191   1191   1192   Any
        //  1283   1290   1290   1291   Any
        //  1284   1290   1290   1291   Ljava/lang/IndexOutOfBoundsException;
        //  1283   1290   1283   1284   Any
        //  1283   1290   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1284   1290   1283   1284   Ljava/lang/EnumConstantNotPresentException;
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
    
    public void c(@NotNull final fw fw) {
        fbS.3N(this, 1515598388, fw);
    }
    
    static {
        throw t;
    }
    
    public void 0(@NotNull final f0w p0) {
        public class f0K implements Supplier
        {
            public f0w c;
            
            static {
                throw t;
            }
            
            @Override
            public Object get() {
                return fbS.3p(this, 1825001823);
            }
            
            public f0K(final f0w c) {
                while (true) {
                    int n = 0;
                    Label_0014: {
                        if (fc.1 != 0) {
                            n = 1432348906;
                            break Label_0014;
                        }
                        n = 2115994687;
                    }
                    switch (n ^ 0xAEFAAE8C) {
                        case -73054618: {
                            continue;
                        }
                        case -790287693: {
                            this.c = c;
                        }
                        default: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            public int c() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          94
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            86
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            78
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_0        
                //    25: getfield        dev/nuker/pyro/f0K.c:Ldev/nuker/pyro/f0w;
                //    28: goto            32
                //    31: athrow         
                //    32: invokevirtual   dev/nuker/pyro/f0w.3:()Ljava/util/function/Supplier;
                //    35: goto            39
                //    38: athrow         
                //    39: goto            43
                //    42: athrow         
                //    43: invokeinterface java/util/function/Supplier.get:()Ljava/lang/Object;
                //    48: goto            52
                //    51: athrow         
                //    52: checkcast       Ljava/lang/Number;
                //    55: goto            59
                //    58: athrow         
                //    59: invokevirtual   java/lang/Number.intValue:()I
                //    62: goto            66
                //    65: athrow         
                //    66: iconst_1       
                //    67: isub           
                //    68: ireturn        
                //    69: pop            
                //    70: goto            24
                //    73: pop            
                //    74: aconst_null    
                //    75: goto            69
                //    78: dup            
                //    79: ifnull          69
                //    82: checkcast       Ljava/lang/Throwable;
                //    85: athrow         
                //    86: dup            
                //    87: ifnull          73
                //    90: checkcast       Ljava/lang/Throwable;
                //    93: athrow         
                //    94: aconst_null    
                //    95: athrow         
                //    StackMapTable: 00 15 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FC 00 03 07 00 03 46 07 00 37 40 07 00 2A 45 07 00 37 40 07 00 07 42 07 00 37 40 07 00 07 47 07 00 37 40 07 00 05 45 07 00 37 40 07 00 3F 45 07 00 37 40 01 42 07 00 44 43 05 44 07 00 44 47 05 47 07 00 37
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     78     86     Ljava/lang/EnumConstantNotPresentException;
                //  78     86     78     86     Ljava/lang/NullPointerException;
                //  94     96     3      8      Any
                //  31     38     38     39     Any
                //  32     38     3      8      Ljava/lang/UnsupportedOperationException;
                //  31     38     3      8      Any
                //  31     38     31     32     Any
                //  31     38     38     39     Ljava/lang/UnsupportedOperationException;
                //  42     51     51     52     Any
                //  43     51     3      8      Ljava/lang/NullPointerException;
                //  43     51     3      8      Any
                //  42     51     3      8      Any
                //  43     51     42     43     Any
                //  58     65     65     66     Any
                //  58     65     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  58     65     3      8      Any
                //  58     65     65     66     Any
                //  58     65     58     59     Any
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          373
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            365
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            357
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -1234418134
        //    32: goto            37
        //    35: ldc             -1227300560
        //    37: ldc             -1690014283
        //    39: ixor           
        //    40: lookupswitch {
        //          757607327: 35
        //          765234309: 68
        //          default: 342
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //    74: goto            78
        //    77: athrow         
        //    78: invokeinterface java/util/List.clear:()V
        //    83: goto            87
        //    86: athrow         
        //    87: iconst_0       
        //    88: getstatic       dev/nuker/pyro/fc.c:I
        //    91: ifge            99
        //    94: ldc             -719489631
        //    96: goto            101
        //    99: ldc             1411015674
        //   101: ldc             -884679204
        //   103: ixor           
        //   104: lookupswitch {
        //          -1621180890: 132
        //          509192317: 99
        //          default: 344
        //        }
        //   132: istore_2       
        //   133: aload_0        
        //   134: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   137: checkcast       Ljava/util/Collection;
        //   140: goto            144
        //   143: athrow         
        //   144: invokeinterface java/util/Collection.size:()I
        //   149: goto            153
        //   152: athrow         
        //   153: istore_3       
        //   154: iload_2        
        //   155: iload_3        
        //   156: if_icmpge       339
        //   159: getstatic       dev/nuker/pyro/fc.c:I
        //   162: ifge            170
        //   165: ldc             1430721045
        //   167: goto            172
        //   170: ldc             -294768873
        //   172: ldc             1544448896
        //   174: ixor           
        //   175: lookupswitch {
        //          -1429731663: 170
        //          155810197: 346
        //          default: 200
        //        }
        //   200: aload_0        
        //   201: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   204: new             Ldev/nuker/pyro/f0w;
        //   207: dup            
        //   208: new             Ldev/nuker/pyro/f0K;
        //   211: dup            
        //   212: aload_1        
        //   213: goto            217
        //   216: athrow         
        //   217: invokespecial   dev/nuker/pyro/f0K.<init>:(Ldev/nuker/pyro/f0w;)V
        //   220: goto            224
        //   223: athrow         
        //   224: checkcast       Ljava/util/function/Supplier;
        //   227: aload_1        
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   dev/nuker/pyro/f0w.2:()Ljava/lang/Runnable;
        //   235: goto            239
        //   238: athrow         
        //   239: iconst_0       
        //   240: aload_1        
        //   241: goto            245
        //   244: athrow         
        //   245: invokevirtual   dev/nuker/pyro/f0w.c:()Ljava/util/function/BiFunction;
        //   248: goto            252
        //   251: athrow         
        //   252: aload_1        
        //   253: goto            257
        //   256: athrow         
        //   257: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   260: goto            264
        //   263: athrow         
        //   264: getstatic       dev/nuker/pyro/fc.1:I
        //   267: ifeq            275
        //   270: ldc             829916354
        //   272: goto            277
        //   275: ldc             -1216389417
        //   277: ldc_w           1267715786
        //   280: ixor           
        //   281: lookupswitch {
        //          -51343331: 308
        //          2063092232: 275
        //          default: 340
        //        }
        //   308: goto            312
        //   311: athrow         
        //   312: invokespecial   dev/nuker/pyro/f0w.<init>:(Ljava/util/function/Supplier;Ljava/lang/Runnable;ILjava/util/function/BiFunction;Lnet/minecraft/client/gui/FontRenderer;)V
        //   315: goto            319
        //   318: athrow         
        //   319: goto            323
        //   322: athrow         
        //   323: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   328: goto            332
        //   331: athrow         
        //   332: pop            
        //   333: iinc            2, 1
        //   336: goto            154
        //   339: return         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //   344: aconst_null    
        //   345: athrow         
        //   346: aconst_null    
        //   347: athrow         
        //   348: pop            
        //   349: goto            24
        //   352: pop            
        //   353: aconst_null    
        //   354: goto            348
        //   357: dup            
        //   358: ifnull          348
        //   361: checkcast       Ljava/lang/Throwable;
        //   364: athrow         
        //   365: dup            
        //   366: ifnull          352
        //   369: checkcast       Ljava/lang/Throwable;
        //   372: athrow         
        //   373: aconst_null    
        //   374: athrow         
        //    StackMapTable: 00 3B 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FD 00 03 07 00 03 07 00 A6 0A 41 01 1E 48 07 00 39 40 07 00 2A 47 07 00 5B 00 4B 01 FF 00 01 00 02 07 00 03 07 00 A6 00 02 01 01 5E 01 FF 00 0A 00 03 07 00 03 07 00 A6 01 00 01 07 00 5B 40 07 00 AB 47 07 00 5B 40 01 FC 00 00 01 0F 41 01 1B 4F 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 06 07 00 2A 08 00 CC 08 00 CC 08 00 D0 08 00 D0 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 04 07 00 2A 08 00 CC 08 00 CC 07 00 EF 46 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 05 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 05 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 44 07 00 51 FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 07 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 07 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 43 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D FF 00 0A 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D FF 00 01 00 04 07 00 03 07 00 A6 01 01 00 09 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 01 FF 00 1E 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 42 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 02 07 00 2A 07 00 A6 42 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 02 07 00 2A 07 00 A6 47 07 00 5B 40 01 06 FF 00 00 00 04 07 00 03 07 00 A6 01 01 00 08 07 00 2A 08 00 CC 08 00 CC 07 00 F3 07 01 09 01 07 01 0B 07 01 0D F9 00 01 41 01 FD 00 01 01 01 FF 00 01 00 02 07 00 03 07 00 A6 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     357    365    Any
        //  357    365    357    365    Ljava/lang/ArithmeticException;
        //  373    375    3      8      Any
        //  77     86     86     87     Any
        //  78     86     3      8      Any
        //  78     86     86     87     Any
        //  77     86     86     87     Ljava/lang/StringIndexOutOfBoundsException;
        //  77     86     77     78     Ljava/lang/RuntimeException;
        //  143    152    152    153    Any
        //  143    152    143    144    Any
        //  144    152    143    144    Any
        //  143    152    152    153    Ljava/lang/NumberFormatException;
        //  143    152    152    153    Any
        //  216    223    223    224    Any
        //  216    223    223    224    Ljava/lang/StringIndexOutOfBoundsException;
        //  216    223    216    217    Any
        //  216    223    3      8      Ljava/util/ConcurrentModificationException;
        //  217    223    223    224    Ljava/lang/NullPointerException;
        //  231    238    238    239    Any
        //  232    238    3      8      Ljava/lang/RuntimeException;
        //  231    238    238    239    Ljava/lang/ArithmeticException;
        //  232    238    231    232    Any
        //  232    238    231    232    Ljava/lang/IndexOutOfBoundsException;
        //  244    251    251    252    Any
        //  245    251    251    252    Ljava/lang/IllegalStateException;
        //  244    251    244    245    Ljava/lang/NumberFormatException;
        //  244    251    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  244    251    3      8      Any
        //  256    263    263    264    Any
        //  257    263    256    257    Ljava/util/ConcurrentModificationException;
        //  256    263    263    264    Ljava/lang/RuntimeException;
        //  256    263    263    264    Any
        //  257    263    256    257    Any
        //  311    318    318    319    Any
        //  311    318    3      8      Any
        //  311    318    318    319    Any
        //  312    318    311    312    Any
        //  311    318    311    312    Any
        //  322    331    331    332    Any
        //  322    331    322    323    Ljava/lang/UnsupportedOperationException;
        //  322    331    322    323    Any
        //  322    331    322    323    Any
        //  322    331    322    323    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 5.
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
    
    @Override
    public int c(@NotNull final f0w p0, @NotNull final f0y p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1173
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1165
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1157
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           73862045
        //    33: goto            39
        //    36: ldc_w           -1957839750
        //    39: ldc_w           980647995
        //    42: ixor           
        //    43: lookupswitch {
        //          -1099600930: 36
        //          1041533862: 1128
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_2        
        //    71: pop            
        //    72: aload_0        
        //    73: aload_1        
        //    74: goto            78
        //    77: athrow         
        //    78: invokevirtual   dev/nuker/pyro/f0M.c:(Ldev/nuker/pyro/f0w;)V
        //    81: goto            85
        //    84: athrow         
        //    85: aload_0        
        //    86: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //    89: dup            
        //    90: ifnonnull       104
        //    93: goto            97
        //    96: athrow         
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   100: goto            104
        //   103: athrow         
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            116
        //   110: ldc_w           -1678134336
        //   113: goto            119
        //   116: ldc_w           475755457
        //   119: ldc_w           -798051180
        //   122: ixor           
        //   123: lookupswitch {
        //          -1850092442: 116
        //          1268189012: 1124
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   152: dup            
        //   153: ifnonnull       167
        //   156: goto            160
        //   159: athrow         
        //   160: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   163: goto            167
        //   166: athrow         
        //   167: aload_2        
        //   168: getstatic       dev/nuker/pyro/fc.0:I
        //   171: ifeq            180
        //   174: ldc_w           -1781836739
        //   177: goto            183
        //   180: ldc_w           -334810341
        //   183: ldc_w           368078252
        //   186: ixor           
        //   187: lookupswitch {
        //          -2143602287: 180
        //          -100966729: 212
        //          default: 1138
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //   221: goto            225
        //   224: athrow         
        //   225: istore_3       
        //   226: aload_0        
        //   227: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   230: dup            
        //   231: ifnonnull       240
        //   234: ldc_w           -293952341
        //   237: goto            243
        //   240: ldc_w           -293952340
        //   243: ldc_w           -958443896
        //   246: ixor           
        //   247: tableswitch {
        //          1363924038: 268
        //          1363924039: 279
        //          default: 234
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   275: goto            279
        //   278: athrow         
        //   279: iload_3        
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   dev/nuker/pyro/f0w.c:(I)V
        //   287: goto            291
        //   290: athrow         
        //   291: aload_0        
        //   292: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   295: goto            299
        //   298: athrow         
        //   299: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   302: goto            306
        //   305: athrow         
        //   306: dup            
        //   307: pop            
        //   308: checkcast       Ljava/lang/Boolean;
        //   311: goto            315
        //   314: athrow         
        //   315: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   318: goto            322
        //   321: athrow         
        //   322: ifeq            331
        //   325: ldc_w           1713987449
        //   328: goto            334
        //   331: ldc_w           1713987448
        //   334: ldc_w           586851943
        //   337: ixor           
        //   338: tableswitch {
        //          -1985482180: 360
        //          -1985482179: 1116
        //          default: 325
        //        }
        //   360: iconst_0       
        //   361: istore          4
        //   363: aload_0        
        //   364: getstatic       dev/nuker/pyro/fc.0:I
        //   367: ifeq            376
        //   370: ldc_w           -84019823
        //   373: goto            379
        //   376: ldc_w           -209758535
        //   379: ldc_w           -1113245966
        //   382: ixor           
        //   383: lookupswitch {
        //          -2126455674: 376
        //          1196999523: 1140
        //          default: 408
        //        }
        //   408: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   411: checkcast       Ljava/util/Collection;
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            426
        //   420: ldc_w           -1688359361
        //   423: goto            429
        //   426: ldc_w           1640139195
        //   429: ldc_w           -542541134
        //   432: ixor           
        //   433: lookupswitch {
        //          -1100221687: 460
        //          1156895885: 426
        //          default: 1130
        //        }
        //   460: goto            464
        //   463: athrow         
        //   464: invokeinterface java/util/Collection.size:()I
        //   469: goto            473
        //   472: athrow         
        //   473: getstatic       dev/nuker/pyro/fc.c:I
        //   476: ifge            485
        //   479: ldc_w           -257705278
        //   482: goto            488
        //   485: ldc_w           874831122
        //   488: ldc_w           -1521098197
        //   491: ixor           
        //   492: lookupswitch {
        //          -1727822339: 485
        //          1442207977: 1118
        //          default: 520
        //        }
        //   520: istore          5
        //   522: getstatic       dev/nuker/pyro/fc.c:I
        //   525: ifge            534
        //   528: ldc_w           -1613434082
        //   531: goto            537
        //   534: ldc_w           -1948597796
        //   537: ldc_w           -1346101019
        //   540: ixor           
        //   541: lookupswitch {
        //          806409211: 1146
        //          1220301345: 534
        //          default: 568
        //        }
        //   568: iload           4
        //   570: getstatic       dev/nuker/pyro/fc.0:I
        //   573: ifeq            582
        //   576: ldc_w           152469887
        //   579: goto            585
        //   582: ldc_w           -1928105902
        //   585: ldc_w           1929242251
        //   588: ixor           
        //   589: lookupswitch {
        //          -1141031: 616
        //          2079025140: 582
        //          default: 1122
        //        }
        //   616: iload           5
        //   618: if_icmpge       627
        //   621: ldc_w           1250565875
        //   624: goto            630
        //   627: ldc_w           1250565872
        //   630: ldc_w           1803328130
        //   633: ixor           
        //   634: tableswitch {
        //          1139607778: 656
        //          1139607779: 1116
        //          default: 621
        //        }
        //   656: aload_0        
        //   657: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   660: iload           4
        //   662: goto            666
        //   665: athrow         
        //   666: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   671: goto            675
        //   674: athrow         
        //   675: checkcast       Ldev/nuker/pyro/f0V;
        //   678: getstatic       dev/nuker/pyro/fc.c:I
        //   681: ifge            690
        //   684: ldc_w           689395259
        //   687: goto            693
        //   690: ldc_w           -1108784835
        //   693: ldc_w           -1357156381
        //   696: ixor           
        //   697: lookupswitch {
        //          -2046019112: 1144
        //          422417416: 690
        //          default: 724
        //        }
        //   724: astore          6
        //   726: getstatic       dev/nuker/pyro/fc.1:I
        //   729: ifeq            738
        //   732: ldc_w           1999727625
        //   735: goto            741
        //   738: ldc_w           1710504925
        //   741: ldc_w           1969837912
        //   744: ixor           
        //   745: lookupswitch {
        //          39336785: 738
        //          278752389: 772
        //          default: 1136
        //        }
        //   772: aload           6
        //   774: getstatic       dev/nuker/pyro/fc.1:I
        //   777: ifeq            786
        //   780: ldc_w           826780821
        //   783: goto            789
        //   786: ldc_w           166535708
        //   789: ldc_w           -305108228
        //   792: ixor           
        //   793: lookupswitch {
        //          -1956568128: 786
        //          -594033047: 1126
        //          default: 820
        //        }
        //   820: aload_0        
        //   821: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   824: iload           4
        //   826: getstatic       dev/nuker/pyro/fc.0:I
        //   829: ifeq            838
        //   832: ldc_w           -343812744
        //   835: goto            841
        //   838: ldc_w           -1344299360
        //   841: ldc_w           -1386407545
        //   844: ixor           
        //   845: lookupswitch {
        //          -907388439: 838
        //          1188875519: 1142
        //          default: 872
        //        }
        //   872: goto            876
        //   875: athrow         
        //   876: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   881: goto            885
        //   884: athrow         
        //   885: dup            
        //   886: ifnonnull       900
        //   889: goto            893
        //   892: athrow         
        //   893: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   896: goto            900
        //   899: athrow         
        //   900: checkcast       Ldev/nuker/pyro/f0w;
        //   903: aload_2        
        //   904: getstatic       dev/nuker/pyro/fc.1:I
        //   907: ifeq            916
        //   910: ldc_w           -538889855
        //   913: goto            919
        //   916: ldc_w           1090568987
        //   919: ldc_w           -30677592
        //   922: ixor           
        //   923: lookupswitch {
        //          -1087691085: 948
        //          566940713: 916
        //          default: 1120
        //        }
        //   948: goto            952
        //   951: athrow         
        //   952: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //   957: goto            961
        //   960: athrow         
        //   961: istore          7
        //   963: aload_0        
        //   964: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   967: getstatic       dev/nuker/pyro/fc.1:I
        //   970: ifeq            979
        //   973: ldc_w           1184885840
        //   976: goto            982
        //   979: ldc_w           -1042476024
        //   982: ldc_w           2067542817
        //   985: ixor           
        //   986: lookupswitch {
        //          -1159649495: 1012
        //          1034149745: 979
        //          default: 1132
        //        }
        //  1012: iload           4
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: dup            
        //  1028: ifnonnull       1042
        //  1031: goto            1035
        //  1034: athrow         
        //  1035: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1038: goto            1042
        //  1041: athrow         
        //  1042: checkcast       Ldev/nuker/pyro/f0w;
        //  1045: getstatic       dev/nuker/pyro/fc.1:I
        //  1048: ifeq            1057
        //  1051: ldc_w           -230112449
        //  1054: goto            1060
        //  1057: ldc_w           -1681871412
        //  1060: ldc_w           -34555413
        //  1063: ixor           
        //  1064: lookupswitch {
        //          164337941: 1057
        //          263748308: 1134
        //          default: 1092
        //        }
        //  1092: iload           7
        //  1094: goto            1098
        //  1097: athrow         
        //  1098: invokevirtual   dev/nuker/pyro/f0w.c:(I)V
        //  1101: goto            1105
        //  1104: athrow         
        //  1105: iload_3        
        //  1106: iload           7
        //  1108: iadd           
        //  1109: istore_3       
        //  1110: iinc            4, 1
        //  1113: goto            522
        //  1116: iload_3        
        //  1117: ireturn        
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
        //  1138: aconst_null    
        //  1139: athrow         
        //  1140: aconst_null    
        //  1141: athrow         
        //  1142: aconst_null    
        //  1143: athrow         
        //  1144: aconst_null    
        //  1145: athrow         
        //  1146: aconst_null    
        //  1147: athrow         
        //  1148: pop            
        //  1149: goto            24
        //  1152: pop            
        //  1153: aconst_null    
        //  1154: goto            1148
        //  1157: dup            
        //  1158: ifnull          1148
        //  1161: checkcast       Ljava/lang/Throwable;
        //  1164: athrow         
        //  1165: dup            
        //  1166: ifnull          1152
        //  1169: checkcast       Ljava/lang/Throwable;
        //  1172: athrow         
        //  1173: aconst_null    
        //  1174: athrow         
        //    StackMapTable: 00 93 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FE 00 03 07 00 03 07 00 A6 07 00 D8 0B 42 01 1C FF 00 08 00 00 00 01 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 03 07 00 A6 45 07 00 5B 00 4A 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 4B 07 00 07 FF 00 02 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 01 5C 07 00 07 4A 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 0C 00 03 07 00 03 07 00 A6 07 00 D8 00 03 07 00 07 07 00 A6 07 00 D8 FF 00 02 00 03 07 00 03 07 00 A6 07 00 D8 00 04 07 00 07 07 00 A6 07 00 D8 01 FF 00 1C 00 03 07 00 03 07 00 A6 07 00 D8 00 03 07 00 07 07 00 A6 07 00 D8 42 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 03 07 00 07 07 00 A6 07 00 D8 47 07 00 5B 40 01 FF 00 08 00 04 07 00 03 07 00 A6 07 00 D8 01 00 01 07 00 A6 45 07 00 A6 FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 01 00 02 07 00 A6 01 58 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 43 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 01 00 02 07 00 A6 01 45 07 00 5B 00 46 07 00 3D 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 02 05 42 01 19 FF 00 0F 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 02 07 00 03 01 5C 07 00 03 51 07 00 AB FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 02 07 00 AB 01 5E 07 00 AB 42 07 00 5B 40 07 00 AB 47 07 00 5B 40 01 4B 01 FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 02 01 01 5F 01 FC 00 01 01 0B 42 01 1E 4D 01 FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 02 01 01 5E 01 04 05 42 01 19 48 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 4E 07 00 07 FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 02 07 00 07 01 5E 07 00 07 FC 00 0D 07 00 07 42 01 1E 4D 07 00 07 FF 00 02 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 01 5E 07 00 07 FF 00 11 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 FF 00 02 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 04 07 00 07 07 00 2A 01 01 FF 00 1E 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 47 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 46 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 45 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 FF 00 0F 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 A6 07 00 D8 FF 00 02 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 04 07 00 07 07 00 A6 07 00 D8 01 FF 00 1C 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 A6 07 00 D8 42 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 A6 07 00 D8 47 07 00 5B 40 01 FF 00 11 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 01 07 00 2A FF 00 02 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 02 07 00 2A 01 5D 07 00 2A 44 07 00 39 FF 00 00 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 46 07 00 57 40 07 00 05 45 07 00 5B 40 07 00 05 4E 07 00 A6 FF 00 02 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 02 07 00 A6 01 5F 07 00 A6 44 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 02 07 00 A6 01 45 07 00 5B 00 FF 00 0A 00 04 07 00 03 07 00 A6 07 00 D8 01 00 00 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 A6 07 00 D8 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 01 01 FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 01 07 00 07 FF 00 01 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 01 07 00 07 FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 00 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 07 00 AB FF 00 01 00 08 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 01 00 01 07 00 2A 41 07 00 A6 FA 00 01 FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 03 07 00 07 07 00 A6 07 00 D8 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 01 07 00 07 01 FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 01 07 00 39 43 05 44 07 00 39 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1157   1165   Ljava/util/ConcurrentModificationException;
        //  1157   1165   1157   1165   Ljava/lang/IndexOutOfBoundsException;
        //  1173   1175   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  78     84     84     85     Any
        //  78     84     84     85     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  78     84     3      8      Ljava/util/ConcurrentModificationException;
        //  78     84     3      8      Ljava/util/ConcurrentModificationException;
        //  78     84     3      8      Any
        //  96     103    103    104    Any
        //  96     103    3      8      Ljava/lang/IllegalStateException;
        //  97     103    96     97     Any
        //  97     103    96     97     Any
        //  96     103    3      8      Any
        //  159    166    166    167    Any
        //  160    166    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  159    166    159    160    Any
        //  160    166    166    167    Any
        //  159    166    159    160    Any
        //  215    224    224    225    Any
        //  216    224    215    216    Any
        //  216    224    224    225    Ljava/util/ConcurrentModificationException;
        //  215    224    3      8      Any
        //  216    224    224    225    Ljava/lang/AssertionError;
        //  271    278    278    279    Any
        //  272    278    271    272    Any
        //  272    278    278    279    Any
        //  271    278    278    279    Ljava/util/NoSuchElementException;
        //  271    278    278    279    Ljava/lang/RuntimeException;
        //  283    290    290    291    Any
        //  284    290    290    291    Any
        //  284    290    283    284    Ljava/util/ConcurrentModificationException;
        //  284    290    290    291    Ljava/lang/UnsupportedOperationException;
        //  284    290    283    284    Any
        //  298    305    305    306    Any
        //  299    305    305    306    Any
        //  298    305    305    306    Any
        //  298    305    298    299    Ljava/lang/NullPointerException;
        //  299    305    305    306    Ljava/lang/EnumConstantNotPresentException;
        //  314    321    321    322    Any
        //  314    321    3      8      Any
        //  314    321    314    315    Any
        //  314    321    321    322    Any
        //  314    321    321    322    Any
        //  463    472    472    473    Any
        //  464    472    3      8      Any
        //  464    472    463    464    Any
        //  463    472    472    473    Any
        //  464    472    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  665    674    674    675    Any
        //  666    674    665    666    Any
        //  666    674    674    675    Any
        //  666    674    665    666    Ljava/lang/IllegalStateException;
        //  666    674    665    666    Any
        //  876    884    884    885    Any
        //  876    884    3      8      Any
        //  876    884    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  876    884    3      8      Any
        //  876    884    3      8      Any
        //  892    899    899    900    Any
        //  892    899    899    900    Any
        //  893    899    3      8      Any
        //  893    899    3      8      Ljava/lang/ArithmeticException;
        //  892    899    892    893    Any
        //  951    960    960    961    Any
        //  951    960    951    952    Any
        //  952    960    3      8      Ljava/lang/IllegalStateException;
        //  952    960    960    961    Ljava/lang/AssertionError;
        //  952    960    960    961    Ljava/lang/RuntimeException;
        //  1017   1026   1026   1027   Any
        //  1017   1026   1026   1027   Any
        //  1017   1026   1026   1027   Any
        //  1017   1026   1017   1018   Ljava/lang/ArithmeticException;
        //  1018   1026   1017   1018   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1034   1041   1041   1042   Any
        //  1035   1041   3      8      Any
        //  1035   1041   3      8      Ljava/lang/ArithmeticException;
        //  1035   1041   1034   1035   Ljava/lang/AssertionError;
        //  1034   1041   1041   1042   Any
        //  1097   1104   1104   1105   Any
        //  1098   1104   1104   1105   Ljava/lang/AssertionError;
        //  1098   1104   3      8      Any
        //  1097   1104   1097   1098   Any
        //  1097   1104   3      8      Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0104 (coming from #0103).
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
    
    public void c(@Nullable final f0V f0V) {
        fbS.6U(this, 768123862, f0V);
    }
    
    @Override
    public void 2(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1356
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1348
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1340
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           -1809434492
        //    33: goto            39
        //    36: ldc_w           -2047073765
        //    39: ldc_w           909004142
        //    42: ixor           
        //    43: lookupswitch {
        //          -1576503830: 36
        //          -1278054539: 68
        //          default: 1295
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload           6
        //    72: pop            
        //    73: getstatic       dev/nuker/pyro/fc.0:I
        //    76: ifeq            85
        //    79: ldc_w           475910059
        //    82: goto            88
        //    85: ldc_w           2087297709
        //    88: ldc_w           -418889640
        //    91: ixor           
        //    92: lookupswitch {
        //          -78278669: 1297
        //          -552838: 85
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: aload_1        
        //   122: getstatic       dev/nuker/pyro/fc.c:I
        //   125: ifge            134
        //   128: ldc_w           2127420964
        //   131: goto            137
        //   134: ldc_w           -298902071
        //   137: ldc_w           -353545527
        //   140: ixor           
        //   141: lookupswitch {
        //          -1809806099: 134
        //          79843072: 168
        //          default: 1313
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   dev/nuker/pyro/f0M.c:(Ldev/nuker/pyro/f0w;)V
        //   175: goto            179
        //   178: athrow         
        //   179: aload_0        
        //   180: getstatic       dev/nuker/pyro/fc.c:I
        //   183: ifge            192
        //   186: ldc_w           -1854284172
        //   189: goto            195
        //   192: ldc_w           -1801827406
        //   195: ldc_w           -1152152679
        //   198: ixor           
        //   199: lookupswitch {
        //          707417581: 192
        //          801751083: 224
        //          default: 1311
        //        }
        //   224: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   227: dup            
        //   228: ifnonnull       242
        //   231: goto            235
        //   234: athrow         
        //   235: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   238: goto            242
        //   241: athrow         
        //   242: aload_1        
        //   243: goto            247
        //   246: athrow         
        //   247: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   250: goto            254
        //   253: athrow         
        //   254: goto            258
        //   257: athrow         
        //   258: invokevirtual   dev/nuker/pyro/f0w.c:(Lnet/minecraft/client/gui/FontRenderer;)V
        //   261: goto            265
        //   264: athrow         
        //   265: aload_0        
        //   266: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   269: dup            
        //   270: ifnonnull       284
        //   273: goto            277
        //   276: athrow         
        //   277: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   280: goto            284
        //   283: athrow         
        //   284: aload_0        
        //   285: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   288: dup            
        //   289: ifnonnull       303
        //   292: goto            296
        //   295: athrow         
        //   296: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   299: goto            303
        //   302: athrow         
        //   303: dload_2        
        //   304: dload           4
        //   306: aload           6
        //   308: getstatic       dev/nuker/pyro/fc.0:I
        //   311: ifeq            320
        //   314: ldc_w           1603548709
        //   317: goto            323
        //   320: ldc_w           681581789
        //   323: ldc_w           -133374199
        //   326: ixor           
        //   327: lookupswitch {
        //          -2042216573: 320
        //          -1483151060: 1303
        //          default: 352
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokeinterface dev/nuker/pyro/f0V.2:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   361: goto            365
        //   364: athrow         
        //   365: aload_0        
        //   366: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   369: getstatic       dev/nuker/pyro/fc.0:I
        //   372: ifeq            381
        //   375: ldc_w           289443399
        //   378: goto            384
        //   381: ldc_w           -505367533
        //   384: ldc_w           1220381533
        //   387: ixor           
        //   388: lookupswitch {
        //          -1625959958: 381
        //          1509754138: 1299
        //          default: 416
        //        }
        //   416: goto            420
        //   419: athrow         
        //   420: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   423: goto            427
        //   426: athrow         
        //   427: dup            
        //   428: pop            
        //   429: checkcast       Ljava/lang/Boolean;
        //   432: goto            436
        //   435: athrow         
        //   436: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   439: goto            443
        //   442: athrow         
        //   443: ifeq            452
        //   446: ldc_w           371391917
        //   449: goto            455
        //   452: ldc_w           371391916
        //   455: ldc_w           1475649299
        //   458: ixor           
        //   459: tableswitch {
        //          -2085829252: 480
        //          -2085829251: 1294
        //          default: 446
        //        }
        //   480: aload_0        
        //   481: getstatic       dev/nuker/pyro/fc.1:I
        //   484: ifeq            493
        //   487: ldc_w           -1254357035
        //   490: goto            496
        //   493: ldc_w           731668597
        //   496: ldc_w           -400234592
        //   499: ixor           
        //   500: lookupswitch {
        //          -340054798: 493
        //          1561911413: 1307
        //          default: 528
        //        }
        //   528: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   531: dup            
        //   532: ifnonnull       546
        //   535: goto            539
        //   538: athrow         
        //   539: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   542: goto            546
        //   545: athrow         
        //   546: goto            550
        //   549: athrow         
        //   550: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   553: goto            557
        //   556: athrow         
        //   557: istore          7
        //   559: iconst_0       
        //   560: istore          8
        //   562: aload_0        
        //   563: getstatic       dev/nuker/pyro/fc.c:I
        //   566: ifge            575
        //   569: ldc_w           504111626
        //   572: goto            578
        //   575: ldc_w           2028958113
        //   578: ldc_w           987562049
        //   581: ixor           
        //   582: lookupswitch {
        //          617685579: 575
        //          1110602208: 608
        //          default: 1323
        //        }
        //   608: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   611: checkcast       Ljava/util/Collection;
        //   614: getstatic       dev/nuker/pyro/fc.0:I
        //   617: ifeq            626
        //   620: ldc_w           504943803
        //   623: goto            629
        //   626: ldc_w           -797271387
        //   629: ldc_w           1653990879
        //   632: ixor           
        //   633: lookupswitch {
        //          -1292927110: 660
        //          2089628004: 626
        //          default: 1329
        //        }
        //   660: goto            664
        //   663: athrow         
        //   664: invokeinterface java/util/Collection.size:()I
        //   669: goto            673
        //   672: athrow         
        //   673: istore          9
        //   675: iload           8
        //   677: iload           9
        //   679: if_icmpge       1100
        //   682: aload_0        
        //   683: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   686: iload           8
        //   688: goto            692
        //   691: athrow         
        //   692: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   697: goto            701
        //   700: athrow         
        //   701: checkcast       Ldev/nuker/pyro/f0V;
        //   704: getstatic       dev/nuker/pyro/fc.0:I
        //   707: ifeq            716
        //   710: ldc_w           -385666199
        //   713: goto            719
        //   716: ldc_w           364296995
        //   719: ldc_w           -952222144
        //   722: ixor           
        //   723: lookupswitch {
        //          -762804893: 748
        //          775753001: 716
        //          default: 1325
        //        }
        //   748: astore          10
        //   750: getstatic       dev/nuker/pyro/fc.c:I
        //   753: ifge            762
        //   756: ldc_w           -788421799
        //   759: goto            765
        //   762: ldc_w           -1741049150
        //   765: ldc_w           1300573727
        //   768: ixor           
        //   769: lookupswitch {
        //          -1669034682: 1315
        //          540667672: 762
        //          default: 796
        //        }
        //   796: aload_0        
        //   797: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   800: iload           8
        //   802: goto            806
        //   805: athrow         
        //   806: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   811: goto            815
        //   814: athrow         
        //   815: dup            
        //   816: ifnonnull       830
        //   819: goto            823
        //   822: athrow         
        //   823: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   826: goto            830
        //   829: athrow         
        //   830: checkcast       Ldev/nuker/pyro/f0w;
        //   833: astore          11
        //   835: goto            839
        //   838: athrow         
        //   839: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   842: goto            846
        //   845: athrow         
        //   846: fconst_1       
        //   847: iload           7
        //   849: i2f            
        //   850: fconst_0       
        //   851: goto            855
        //   854: athrow         
        //   855: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   858: goto            862
        //   861: athrow         
        //   862: aload           10
        //   864: aload           11
        //   866: dload_2        
        //   867: getstatic       dev/nuker/pyro/fc.c:I
        //   870: ifge            879
        //   873: ldc_w           -90854318
        //   876: goto            882
        //   879: ldc_w           1949852098
        //   882: ldc_w           2054234509
        //   885: ixor           
        //   886: lookupswitch {
        //          -2132505121: 879
        //          239681615: 912
        //          default: 1327
        //        }
        //   912: dload           4
        //   914: iload           7
        //   916: i2d            
        //   917: dsub           
        //   918: aload           6
        //   920: getstatic       dev/nuker/pyro/fc.c:I
        //   923: ifge            932
        //   926: ldc_w           622560844
        //   929: goto            935
        //   932: ldc_w           -823432602
        //   935: ldc_w           -1296640366
        //   938: ixor           
        //   939: lookupswitch {
        //          -1750249250: 1319
        //          1203511261: 932
        //          default: 964
        //        }
        //   964: goto            968
        //   967: athrow         
        //   968: invokeinterface dev/nuker/pyro/f0V.2:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   973: goto            977
        //   976: athrow         
        //   977: goto            981
        //   980: athrow         
        //   981: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   984: goto            988
        //   987: athrow         
        //   988: iload           7
        //   990: aload           11
        //   992: getstatic       dev/nuker/pyro/fc.1:I
        //   995: ifeq            1004
        //   998: ldc_w           1963040905
        //  1001: goto            1007
        //  1004: ldc_w           -1497880010
        //  1007: ldc_w           -26197238
        //  1010: ixor           
        //  1011: lookupswitch {
        //          -1955470461: 1305
        //          -1245276000: 1004
        //          default: 1036
        //        }
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: iadd           
        //  1048: getstatic       dev/nuker/pyro/fc.1:I
        //  1051: ifeq            1060
        //  1054: ldc_w           -1859442659
        //  1057: goto            1063
        //  1060: ldc_w           -793672055
        //  1063: ldc_w           942687708
        //  1066: ixor           
        //  1067: lookupswitch {
        //          -1457820223: 1060
        //          -394149035: 1092
        //          default: 1301
        //        }
        //  1092: istore          7
        //  1094: iinc            8, 1
        //  1097: goto            675
        //  1100: iconst_1       
        //  1101: aload_0        
        //  1102: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //  1105: dup            
        //  1106: ifnonnull       1167
        //  1109: getstatic       dev/nuker/pyro/fc.c:I
        //  1112: ifge            1121
        //  1115: ldc_w           1614560530
        //  1118: goto            1124
        //  1121: ldc_w           -638137377
        //  1124: ldc_w           -998123690
        //  1127: ixor           
        //  1128: lookupswitch {
        //          -1531057596: 1121
        //          494345353: 1156
        //          default: 1309
        //        }
        //  1156: goto            1160
        //  1159: athrow         
        //  1160: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1163: goto            1167
        //  1166: athrow         
        //  1167: getstatic       dev/nuker/pyro/fc.0:I
        //  1170: ifeq            1179
        //  1173: ldc_w           -1216273882
        //  1176: goto            1182
        //  1179: ldc_w           -1120541253
        //  1182: ldc_w           163116630
        //  1185: ixor           
        //  1186: lookupswitch {
        //          -1265822739: 1212
        //          -1103506320: 1179
        //          default: 1317
        //        }
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: iconst_2       
        //  1224: getstatic       dev/nuker/pyro/fc.0:I
        //  1227: ifeq            1236
        //  1230: ldc_w           1858843776
        //  1233: goto            1239
        //  1236: ldc_w           -204714654
        //  1239: ldc_w           -1317246147
        //  1242: ixor           
        //  1243: lookupswitch {
        //          -1319950079: 1236
        //          -541597763: 1321
        //          default: 1268
        //        }
        //  1268: iload           7
        //  1270: aload           6
        //  1272: goto            1276
        //  1275: athrow         
        //  1276: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //  1279: goto            1283
        //  1282: athrow         
        //  1283: goto            1287
        //  1286: athrow         
        //  1287: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //  1290: goto            1294
        //  1293: athrow         
        //  1294: return         
        //  1295: aconst_null    
        //  1296: athrow         
        //  1297: aconst_null    
        //  1298: athrow         
        //  1299: aconst_null    
        //  1300: athrow         
        //  1301: aconst_null    
        //  1302: athrow         
        //  1303: aconst_null    
        //  1304: athrow         
        //  1305: aconst_null    
        //  1306: athrow         
        //  1307: aconst_null    
        //  1308: athrow         
        //  1309: aconst_null    
        //  1310: athrow         
        //  1311: aconst_null    
        //  1312: athrow         
        //  1313: aconst_null    
        //  1314: athrow         
        //  1315: aconst_null    
        //  1316: athrow         
        //  1317: aconst_null    
        //  1318: athrow         
        //  1319: aconst_null    
        //  1320: athrow         
        //  1321: aconst_null    
        //  1322: athrow         
        //  1323: aconst_null    
        //  1324: athrow         
        //  1325: aconst_null    
        //  1326: athrow         
        //  1327: aconst_null    
        //  1328: athrow         
        //  1329: aconst_null    
        //  1330: athrow         
        //  1331: pop            
        //  1332: goto            24
        //  1335: pop            
        //  1336: aconst_null    
        //  1337: goto            1331
        //  1340: dup            
        //  1341: ifnull          1331
        //  1344: checkcast       Ljava/lang/Throwable;
        //  1347: athrow         
        //  1348: dup            
        //  1349: ifnull          1335
        //  1352: checkcast       Ljava/lang/Throwable;
        //  1355: athrow         
        //  1356: aconst_null    
        //  1357: athrow         
        //    StackMapTable: 00 B7 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 0B 42 01 1C 10 42 01 1F FF 00 0D 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 07 00 A6 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 03 07 00 03 07 00 A6 01 FF 00 1E 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 07 00 A6 42 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 07 00 A6 45 07 00 5B 00 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 01 5C 07 00 03 49 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 43 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 A6 07 00 A6 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 A6 07 01 0D FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 A6 07 01 0D 45 07 00 5B 00 4A 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 4A 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 10 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 06 07 00 07 07 00 A6 03 03 07 00 D8 01 FF 00 1C 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 42 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 00 4F 07 00 98 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 98 01 5F 07 00 98 42 07 00 5B 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 02 05 42 01 18 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 01 5F 07 00 03 49 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 A6 45 07 00 5B 40 01 FF 00 11 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 03 01 5D 07 00 03 51 07 00 AB FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 AB 01 5E 07 00 AB 42 07 00 55 40 07 00 AB 47 07 00 5B 40 01 FC 00 01 01 FF 00 0F 00 00 00 01 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 4E 07 00 07 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 07 01 5C 07 00 07 FC 00 0D 07 00 07 42 01 1E 48 07 00 5B FF 00 00 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 46 07 00 5B 40 07 00 05 45 07 00 5B 40 07 00 05 FF 00 07 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 07 00 3B 00 45 07 00 5B 00 47 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 02 02 02 45 07 00 5B 00 FF 00 10 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 01 FF 00 1D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 13 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 03 03 07 00 D8 01 FF 00 1C 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 42 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 00 42 07 00 5B 00 45 07 00 5B 00 FF 00 0F 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 01 07 00 A6 01 FF 00 1C 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 42 07 00 39 FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 4C 01 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 5C 01 F9 00 07 FF 00 14 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 01 07 00 A6 01 FF 00 1F 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 FF 00 0B 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 01 07 00 A6 01 FF 00 1D 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 01 FF 00 0C 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 01 01 01 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 04 01 01 01 01 FF 00 1C 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 01 01 01 46 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 05 01 01 01 01 07 00 D8 45 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 05 01 01 01 01 01 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 05 01 01 01 01 01 45 07 00 5B F8 00 00 00 01 41 07 00 98 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 01 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 07 00 A6 FF 00 01 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 00 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 01 07 00 A6 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 01 01 01 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 01 07 00 07 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1340   1348   Any
        //  1340   1348   1340   1348   Any
        //  1356   1358   3      8      Ljava/lang/AssertionError;
        //  171    178    178    179    Any
        //  172    178    171    172    Ljava/lang/AssertionError;
        //  171    178    171    172    Ljava/lang/IndexOutOfBoundsException;
        //  171    178    178    179    Any
        //  171    178    178    179    Ljava/lang/ClassCastException;
        //  234    241    241    242    Any
        //  234    241    241    242    Ljava/lang/StringIndexOutOfBoundsException;
        //  234    241    3      8      Ljava/lang/NegativeArraySizeException;
        //  234    241    234    235    Any
        //  235    241    234    235    Any
        //  246    253    253    254    Any
        //  247    253    253    254    Ljava/util/ConcurrentModificationException;
        //  246    253    246    247    Any
        //  246    253    246    247    Any
        //  247    253    3      8      Any
        //  258    264    264    265    Any
        //  258    264    264    265    Any
        //  258    264    3      8      Any
        //  258    264    3      8      Any
        //  258    264    3      8      Any
        //  276    283    283    284    Any
        //  276    283    276    277    Any
        //  276    283    276    277    Ljava/lang/UnsupportedOperationException;
        //  276    283    3      8      Ljava/lang/ArithmeticException;
        //  277    283    3      8      Any
        //  295    302    302    303    Any
        //  296    302    302    303    Ljava/lang/NegativeArraySizeException;
        //  295    302    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  295    302    295    296    Any
        //  295    302    302    303    Ljava/util/NoSuchElementException;
        //  355    364    364    365    Any
        //  356    364    355    356    Any
        //  356    364    364    365    Ljava/util/NoSuchElementException;
        //  355    364    364    365    Any
        //  355    364    355    356    Ljava/lang/IllegalStateException;
        //  419    426    426    427    Any
        //  419    426    3      8      Any
        //  419    426    419    420    Any
        //  419    426    3      8      Any
        //  420    426    419    420    Ljava/lang/AssertionError;
        //  435    442    442    443    Any
        //  435    442    435    436    Any
        //  435    442    3      8      Any
        //  436    442    3      8      Ljava/lang/NumberFormatException;
        //  435    442    435    436    Any
        //  538    545    545    546    Any
        //  539    545    3      8      Any
        //  538    545    3      8      Any
        //  538    545    538    539    Any
        //  539    545    545    546    Any
        //  550    556    556    557    Any
        //  550    556    556    557    Ljava/lang/ClassCastException;
        //  550    556    3      8      Any
        //  550    556    556    557    Ljava/util/NoSuchElementException;
        //  550    556    3      8      Any
        //  663    672    672    673    Any
        //  664    672    672    673    Any
        //  663    672    3      8      Any
        //  664    672    663    664    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  663    672    3      8      Any
        //  692    700    700    701    Any
        //  692    700    3      8      Any
        //  692    700    3      8      Any
        //  692    700    700    701    Ljava/lang/AssertionError;
        //  692    700    700    701    Any
        //  805    814    814    815    Any
        //  806    814    3      8      Any
        //  806    814    814    815    Ljava/lang/IllegalStateException;
        //  805    814    805    806    Any
        //  805    814    814    815    Any
        //  822    829    829    830    Any
        //  823    829    822    823    Ljava/lang/EnumConstantNotPresentException;
        //  822    829    822    823    Any
        //  822    829    822    823    Any
        //  822    829    3      8      Any
        //  838    845    845    846    Any
        //  838    845    845    846    Ljava/lang/ArithmeticException;
        //  839    845    3      8      Ljava/lang/IllegalArgumentException;
        //  838    845    838    839    Ljava/util/NoSuchElementException;
        //  838    845    3      8      Any
        //  854    861    861    862    Any
        //  854    861    3      8      Any
        //  854    861    3      8      Ljava/lang/UnsupportedOperationException;
        //  855    861    854    855    Ljava/lang/ClassCastException;
        //  854    861    854    855    Any
        //  967    976    976    977    Any
        //  968    976    967    968    Any
        //  968    976    3      8      Ljava/util/ConcurrentModificationException;
        //  968    976    967    968    Ljava/lang/IndexOutOfBoundsException;
        //  968    976    967    968    Ljava/lang/RuntimeException;
        //  980    987    987    988    Any
        //  981    987    3      8      Any
        //  981    987    987    988    Ljava/lang/NumberFormatException;
        //  981    987    980    981    Ljava/lang/IllegalArgumentException;
        //  981    987    980    981    Any
        //  1039   1046   1046   1047   Any
        //  1039   1046   3      8      Ljava/lang/NullPointerException;
        //  1039   1046   1046   1047   Any
        //  1039   1046   1039   1040   Ljava/lang/RuntimeException;
        //  1040   1046   3      8      Any
        //  1159   1166   1166   1167   Any
        //  1160   1166   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1160   1166   1159   1160   Ljava/lang/NumberFormatException;
        //  1159   1166   3      8      Any
        //  1160   1166   1159   1160   Ljava/lang/NegativeArraySizeException;
        //  1215   1222   1222   1223   Any
        //  1215   1222   1215   1216   Ljava/lang/EnumConstantNotPresentException;
        //  1216   1222   1215   1216   Ljava/lang/RuntimeException;
        //  1215   1222   1222   1223   Ljava/lang/IllegalStateException;
        //  1215   1222   3      8      Any
        //  1275   1282   1282   1283   Any
        //  1276   1282   1282   1283   Any
        //  1276   1282   1282   1283   Ljava/lang/ClassCastException;
        //  1275   1282   1275   1276   Any
        //  1275   1282   1282   1283   Ljava/lang/StringIndexOutOfBoundsException;
        //  1286   1293   1293   1294   Any
        //  1287   1293   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1286   1293   1286   1287   Ljava/lang/RuntimeException;
        //  1286   1293   1286   1287   Ljava/lang/NegativeArraySizeException;
        //  1287   1293   1293   1294   Ljava/lang/NumberFormatException;
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
    
    @Override
    public int 0(@NotNull final f0w p0, @NotNull final f0y p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          631
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            623
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            615
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_0        
        //    29: aload_1        
        //    30: goto            34
        //    33: athrow         
        //    34: invokevirtual   dev/nuker/pyro/f0M.c:(Ldev/nuker/pyro/f0w;)V
        //    37: goto            41
        //    40: athrow         
        //    41: getstatic       dev/nuker/pyro/fc.0:I
        //    44: ifeq            53
        //    47: ldc_w           834941942
        //    50: goto            56
        //    53: ldc_w           -1335919133
        //    56: ldc_w           -960984487
        //    59: ixor           
        //    60: lookupswitch {
        //          -790999007: 53
        //          -142820945: 596
        //          default: 88
        //        }
        //    88: aload_0        
        //    89: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //    92: dup            
        //    93: ifnonnull       107
        //    96: goto            100
        //    99: athrow         
        //   100: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   103: goto            107
        //   106: athrow         
        //   107: getstatic       dev/nuker/pyro/fc.c:I
        //   110: ifge            119
        //   113: ldc_w           1564643277
        //   116: goto            122
        //   119: ldc_w           896978057
        //   122: ldc_w           -1776006385
        //   125: ixor           
        //   126: lookupswitch {
        //          -1554872442: 152
        //          -882457406: 119
        //          default: 592
        //        }
        //   152: aload_0        
        //   153: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   156: dup            
        //   157: ifnonnull       171
        //   160: goto            164
        //   163: athrow         
        //   164: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   167: goto            171
        //   170: athrow         
        //   171: aload_2        
        //   172: goto            176
        //   175: athrow         
        //   176: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //   181: goto            185
        //   184: athrow         
        //   185: getstatic       dev/nuker/pyro/fc.1:I
        //   188: ifeq            197
        //   191: ldc_w           -835299121
        //   194: goto            200
        //   197: ldc_w           1994428729
        //   200: ldc_w           -1456073833
        //   203: ixor           
        //   204: lookupswitch {
        //          1728072536: 594
        //          1972321939: 197
        //          default: 232
        //        }
        //   232: istore_3       
        //   233: iconst_0       
        //   234: istore          4
        //   236: aload_0        
        //   237: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   240: checkcast       Ljava/util/Collection;
        //   243: getstatic       dev/nuker/pyro/fc.1:I
        //   246: ifeq            255
        //   249: ldc_w           -1445882456
        //   252: goto            258
        //   255: ldc_w           -710151324
        //   258: ldc_w           1532788507
        //   261: ixor           
        //   262: lookupswitch {
        //          -1896379265: 288
        //          -225580365: 255
        //          default: 598
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokeinterface java/util/Collection.size:()I
        //   297: goto            301
        //   300: athrow         
        //   301: istore          5
        //   303: iload           4
        //   305: iload           5
        //   307: if_icmpge       542
        //   310: getstatic       dev/nuker/pyro/fc.1:I
        //   313: ifeq            322
        //   316: ldc_w           534330457
        //   319: goto            325
        //   322: ldc_w           1163994498
        //   325: ldc_w           -1667307922
        //   328: ixor           
        //   329: lookupswitch {
        //          -2092443081: 322
        //          -637549588: 356
        //          default: 602
        //        }
        //   356: aload_0        
        //   357: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   360: getstatic       dev/nuker/pyro/fc.0:I
        //   363: ifeq            372
        //   366: ldc_w           -1411025091
        //   369: goto            375
        //   372: ldc_w           1961749792
        //   375: ldc_w           1775701833
        //   378: ixor           
        //   379: lookupswitch {
        //          -1036879756: 604
        //          531544554: 372
        //          default: 404
        //        }
        //   404: iload           4
        //   406: goto            410
        //   409: athrow         
        //   410: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   415: goto            419
        //   418: athrow         
        //   419: checkcast       Ldev/nuker/pyro/f0V;
        //   422: astore          6
        //   424: aload           6
        //   426: aload_0        
        //   427: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   430: getstatic       dev/nuker/pyro/fc.1:I
        //   433: ifeq            442
        //   436: ldc_w           -1163172842
        //   439: goto            445
        //   442: ldc_w           -2141903860
        //   445: ldc_w           749320819
        //   448: ixor           
        //   449: lookupswitch {
        //          -1778196891: 590
        //          872598880: 442
        //          default: 476
        //        }
        //   476: iload           4
        //   478: goto            482
        //   481: athrow         
        //   482: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   487: goto            491
        //   490: athrow         
        //   491: dup            
        //   492: ifnonnull       506
        //   495: goto            499
        //   498: athrow         
        //   499: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   502: goto            506
        //   505: athrow         
        //   506: checkcast       Ldev/nuker/pyro/f0w;
        //   509: aload_2        
        //   510: goto            514
        //   513: athrow         
        //   514: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //   519: goto            523
        //   522: athrow         
        //   523: iconst_1       
        //   524: iadd           
        //   525: istore          7
        //   527: iload           7
        //   529: iload_3        
        //   530: if_icmple       536
        //   533: iload           7
        //   535: istore_3       
        //   536: iinc            4, 1
        //   539: goto            303
        //   542: getstatic       dev/nuker/pyro/fc.c:I
        //   545: ifge            554
        //   548: ldc_w           -853557685
        //   551: goto            557
        //   554: ldc_w           2030845015
        //   557: ldc_w           -1813450592
        //   560: ixor           
        //   561: lookupswitch {
        //          1193848533: 554
        //          1593265899: 600
        //          default: 588
        //        }
        //   588: iload_3        
        //   589: ireturn        
        //   590: aconst_null    
        //   591: athrow         
        //   592: aconst_null    
        //   593: athrow         
        //   594: aconst_null    
        //   595: athrow         
        //   596: aconst_null    
        //   597: athrow         
        //   598: aconst_null    
        //   599: athrow         
        //   600: aconst_null    
        //   601: athrow         
        //   602: aconst_null    
        //   603: athrow         
        //   604: aconst_null    
        //   605: athrow         
        //   606: pop            
        //   607: goto            24
        //   610: pop            
        //   611: aconst_null    
        //   612: goto            606
        //   615: dup            
        //   616: ifnull          606
        //   619: checkcast       Ljava/lang/Throwable;
        //   622: athrow         
        //   623: dup            
        //   624: ifnull          610
        //   627: checkcast       Ljava/lang/Throwable;
        //   630: athrow         
        //   631: aconst_null    
        //   632: athrow         
        //    StackMapTable: 00 50 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FE 00 03 07 00 03 07 00 A6 07 00 D8 48 07 00 3D FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 03 07 00 A6 45 07 00 5B 00 0B 42 01 1F 4A 07 00 49 40 07 00 07 45 07 00 5B 40 07 00 07 4B 07 00 07 FF 00 02 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 01 5D 07 00 07 4A 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 02 07 00 07 07 00 A6 43 07 00 41 FF 00 00 00 03 07 00 03 07 00 A6 07 00 D8 00 03 07 00 07 07 00 A6 07 00 D8 47 07 00 5B 40 01 4B 01 FF 00 02 00 03 07 00 03 07 00 A6 07 00 D8 00 02 01 01 5F 01 FF 00 16 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 07 00 AB FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 02 07 00 AB 01 5D 07 00 AB 42 07 00 5B 40 07 00 AB 47 07 00 5B 40 01 FC 00 01 01 12 42 01 1E 4F 07 00 2A FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 02 07 00 2A 01 5C 07 00 2A 44 07 00 4F FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FF 00 16 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 2A FF 00 02 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 FF 00 1E 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 2A 44 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 2A 01 47 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 46 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 45 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 05 46 07 00 45 FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 03 07 00 07 07 00 A6 07 00 D8 47 07 00 5B 40 01 FC 00 0C 01 F9 00 05 0B 42 01 1E FF 00 01 00 07 07 00 03 07 00 A6 07 00 D8 01 01 01 07 00 07 00 02 07 00 07 07 00 2A FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 01 07 00 07 41 01 01 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 01 01 00 01 07 00 AB FC 00 01 01 01 41 07 00 2A FF 00 01 00 03 07 00 03 07 00 A6 07 00 D8 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     615    623    Ljava/util/NoSuchElementException;
        //  615    623    615    623    Any
        //  631    633    3      8      Any
        //  33     40     40     41     Any
        //  33     40     40     41     Any
        //  34     40     40     41     Any
        //  34     40     33     34     Ljava/lang/NullPointerException;
        //  34     40     3      8      Ljava/lang/ClassCastException;
        //  99     106    106    107    Any
        //  100    106    106    107    Any
        //  99     106    3      8      Ljava/lang/NegativeArraySizeException;
        //  99     106    99     100    Ljava/lang/IndexOutOfBoundsException;
        //  100    106    106    107    Ljava/lang/IndexOutOfBoundsException;
        //  163    170    170    171    Any
        //  164    170    163    164    Any
        //  164    170    170    171    Ljava/lang/ArithmeticException;
        //  163    170    163    164    Ljava/lang/NullPointerException;
        //  164    170    163    164    Any
        //  175    184    184    185    Any
        //  176    184    184    185    Ljava/lang/NegativeArraySizeException;
        //  176    184    175    176    Ljava/lang/UnsupportedOperationException;
        //  176    184    184    185    Ljava/lang/RuntimeException;
        //  175    184    3      8      Ljava/lang/IllegalArgumentException;
        //  291    300    300    301    Any
        //  291    300    3      8      Ljava/lang/NumberFormatException;
        //  292    300    300    301    Any
        //  292    300    291    292    Any
        //  292    300    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  409    418    418    419    Any
        //  410    418    409    410    Ljava/lang/IllegalArgumentException;
        //  410    418    418    419    Any
        //  409    418    418    419    Any
        //  410    418    3      8      Ljava/util/ConcurrentModificationException;
        //  481    490    490    491    Any
        //  482    490    481    482    Ljava/lang/IllegalArgumentException;
        //  481    490    490    491    Any
        //  482    490    481    482    Any
        //  482    490    490    491    Any
        //  498    505    505    506    Any
        //  499    505    498    499    Ljava/lang/UnsupportedOperationException;
        //  498    505    498    499    Any
        //  498    505    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  498    505    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  513    522    522    523    Any
        //  514    522    522    523    Any
        //  513    522    522    523    Ljava/lang/NumberFormatException;
        //  513    522    3      8      Ljava/util/NoSuchElementException;
        //  513    522    513    514    Ljava/lang/ArithmeticException;
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
    
    @Override
    public boolean 0(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1177
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1169
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1161
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           192193772
        //    33: goto            39
        //    36: ldc_w           -1124307477
        //    39: ldc_w           -550771617
        //    42: ixor           
        //    43: lookupswitch {
        //          -731955021: 36
        //          1675069876: 68
        //          default: 1140
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload           6
        //    72: pop            
        //    73: aload_0        
        //    74: getstatic       dev/nuker/pyro/fc.1:I
        //    77: ifeq            86
        //    80: ldc_w           1027692136
        //    83: goto            89
        //    86: ldc_w           1241991714
        //    89: ldc_w           -1151838774
        //    92: ixor           
        //    93: lookupswitch {
        //          -2045181022: 1124
        //          -982402651: 86
        //          default: 120
        //        }
        //   120: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   123: dup            
        //   124: ifnonnull       138
        //   127: goto            131
        //   130: athrow         
        //   131: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   134: goto            138
        //   137: athrow         
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            150
        //   144: ldc_w           -651748848
        //   147: goto            153
        //   150: ldc_w           -1629959185
        //   153: ldc_w           300579229
        //   156: ixor           
        //   157: lookupswitch {
        //          -1892502926: 184
        //          -926063731: 150
        //          default: 1128
        //        }
        //   184: aload_0        
        //   185: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   188: dup            
        //   189: ifnonnull       203
        //   192: goto            196
        //   195: athrow         
        //   196: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   199: goto            203
        //   202: athrow         
        //   203: dload_2        
        //   204: dload           4
        //   206: aload           6
        //   208: getstatic       dev/nuker/pyro/fc.c:I
        //   211: ifge            220
        //   214: ldc_w           -173411793
        //   217: goto            223
        //   220: ldc_w           -1826423858
        //   223: ldc_w           -1131038856
        //   226: ixor           
        //   227: lookupswitch {
        //          800541878: 252
        //          1228686679: 220
        //          default: 1136
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   261: goto            265
        //   264: athrow         
        //   265: ifeq            270
        //   268: iconst_1       
        //   269: ireturn        
        //   270: aload_0        
        //   271: getstatic       dev/nuker/pyro/fc.0:I
        //   274: ifeq            283
        //   277: ldc_w           -1376550163
        //   280: goto            286
        //   283: ldc_w           -771252824
        //   286: ldc_w           438418360
        //   289: ixor           
        //   290: lookupswitch {
        //          -1210959531: 283
        //          -937023984: 316
        //          default: 1150
        //        }
        //   316: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   319: getstatic       dev/nuker/pyro/fc.1:I
        //   322: ifeq            331
        //   325: ldc_w           -739362372
        //   328: goto            334
        //   331: ldc_w           -1246262313
        //   334: ldc_w           1337509059
        //   337: ixor           
        //   338: lookupswitch {
        //          -1672020609: 1146
        //          1183574465: 331
        //          default: 364
        //        }
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   371: goto            375
        //   374: athrow         
        //   375: dup            
        //   376: pop            
        //   377: checkcast       Ljava/lang/Boolean;
        //   380: goto            384
        //   383: athrow         
        //   384: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   387: goto            391
        //   390: athrow         
        //   391: ifeq            1116
        //   394: getstatic       dev/nuker/pyro/fc.c:I
        //   397: ifge            406
        //   400: ldc_w           1342586292
        //   403: goto            409
        //   406: ldc_w           -2100242659
        //   409: ldc_w           -299537865
        //   412: ixor           
        //   413: lookupswitch {
        //          -1104980093: 406
        //          1828044074: 440
        //          default: 1118
        //        }
        //   440: aload_0        
        //   441: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   444: dup            
        //   445: ifnonnull       459
        //   448: goto            452
        //   451: athrow         
        //   452: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   455: goto            459
        //   458: athrow         
        //   459: goto            463
        //   462: athrow         
        //   463: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   466: goto            470
        //   469: athrow         
        //   470: istore          7
        //   472: iconst_0       
        //   473: istore          8
        //   475: getstatic       dev/nuker/pyro/fc.1:I
        //   478: ifeq            487
        //   481: ldc_w           1518753480
        //   484: goto            490
        //   487: ldc_w           -1083624493
        //   490: ldc_w           151101674
        //   493: ixor           
        //   494: lookupswitch {
        //          1179931923: 487
        //          1401419298: 1120
        //          default: 520
        //        }
        //   520: aload_0        
        //   521: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   524: checkcast       Ljava/util/Collection;
        //   527: getstatic       dev/nuker/pyro/fc.c:I
        //   530: ifge            539
        //   533: ldc_w           1831801543
        //   536: goto            542
        //   539: ldc_w           2093325287
        //   542: ldc_w           353702318
        //   545: ixor           
        //   546: lookupswitch {
        //          463254315: 539
        //          2017067881: 1130
        //          default: 572
        //        }
        //   572: goto            576
        //   575: athrow         
        //   576: invokeinterface java/util/Collection.size:()I
        //   581: goto            585
        //   584: athrow         
        //   585: getstatic       dev/nuker/pyro/fc.c:I
        //   588: ifge            597
        //   591: ldc_w           -2069730916
        //   594: goto            600
        //   597: ldc_w           -1688625217
        //   600: ldc_w           1976855752
        //   603: ixor           
        //   604: lookupswitch {
        //          -1336983295: 597
        //          -243923628: 1132
        //          default: 632
        //        }
        //   632: istore          9
        //   634: iload           8
        //   636: iload           9
        //   638: if_icmpge       1116
        //   641: aload_0        
        //   642: getstatic       dev/nuker/pyro/fc.0:I
        //   645: ifeq            654
        //   648: ldc_w           237886132
        //   651: goto            657
        //   654: ldc_w           203705543
        //   657: ldc_w           527499930
        //   660: ixor           
        //   661: lookupswitch {
        //          291297326: 654
        //          324357725: 688
        //          default: 1134
        //        }
        //   688: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   691: iload           8
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            705
        //   699: ldc_w           1568463
        //   702: goto            708
        //   705: ldc_w           1053211079
        //   708: ldc_w           -1473360695
        //   711: ixor           
        //   712: lookupswitch {
        //          -1472617978: 1144
        //          1604515104: 705
        //          default: 740
        //        }
        //   740: goto            744
        //   743: athrow         
        //   744: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   749: goto            753
        //   752: athrow         
        //   753: checkcast       Ldev/nuker/pyro/f0V;
        //   756: astore          10
        //   758: getstatic       dev/nuker/pyro/fc.0:I
        //   761: ifeq            770
        //   764: ldc_w           662101239
        //   767: goto            773
        //   770: ldc_w           1212065605
        //   773: ldc_w           352750164
        //   776: ixor           
        //   777: lookupswitch {
        //          -1283869339: 770
        //          846223011: 1126
        //          default: 804
        //        }
        //   804: aload_0        
        //   805: getstatic       dev/nuker/pyro/fc.0:I
        //   808: ifeq            817
        //   811: ldc_w           360946789
        //   814: goto            820
        //   817: ldc_w           -273038215
        //   820: ldc_w           -515553382
        //   823: ixor           
        //   824: lookupswitch {
        //          -188294145: 817
        //          251429859: 852
        //          default: 1122
        //        }
        //   852: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   855: iload           8
        //   857: goto            861
        //   860: athrow         
        //   861: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   866: goto            870
        //   869: athrow         
        //   870: dup            
        //   871: ifnonnull       885
        //   874: goto            878
        //   877: athrow         
        //   878: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   881: goto            885
        //   884: athrow         
        //   885: checkcast       Ldev/nuker/pyro/f0w;
        //   888: astore          11
        //   890: getstatic       dev/nuker/pyro/fc.1:I
        //   893: ifeq            902
        //   896: ldc_w           -154665919
        //   899: goto            905
        //   902: ldc_w           1410791404
        //   905: ldc_w           490272793
        //   908: ixor           
        //   909: lookupswitch {
        //          -335608744: 1142
        //          1724697647: 902
        //          default: 936
        //        }
        //   936: aload           10
        //   938: aload           11
        //   940: dload_2        
        //   941: dload           4
        //   943: iload           7
        //   945: i2d            
        //   946: dsub           
        //   947: aload           6
        //   949: goto            953
        //   952: athrow         
        //   953: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   958: goto            962
        //   961: athrow         
        //   962: ifeq            971
        //   965: ldc_w           395025438
        //   968: goto            974
        //   971: ldc_w           395025437
        //   974: ldc_w           726552507
        //   977: ixor           
        //   978: tableswitch {
        //          2039195466: 1000
        //          2039195467: 1002
        //          default: 965
        //        }
        //  1000: iconst_1       
        //  1001: ireturn        
        //  1002: getstatic       dev/nuker/pyro/fc.c:I
        //  1005: ifge            1014
        //  1008: ldc_w           678468191
        //  1011: goto            1017
        //  1014: ldc_w           -633677012
        //  1017: ldc_w           1820141031
        //  1020: ixor           
        //  1021: lookupswitch {
        //          -1236795701: 1048
        //          1141751736: 1014
        //          default: 1148
        //        }
        //  1048: iload           7
        //  1050: aload           11
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: iadd           
        //  1064: getstatic       dev/nuker/pyro/fc.1:I
        //  1067: ifeq            1076
        //  1070: ldc_w           1455106350
        //  1073: goto            1079
        //  1076: ldc_w           952763751
        //  1079: ldc_w           1317608202
        //  1082: ixor           
        //  1083: lookupswitch {
        //          405942820: 1076
        //          1984110189: 1108
        //          default: 1138
        //        }
        //  1108: istore          7
        //  1110: iinc            8, 1
        //  1113: goto            634
        //  1116: iconst_0       
        //  1117: ireturn        
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
        //  1138: aconst_null    
        //  1139: athrow         
        //  1140: aconst_null    
        //  1141: athrow         
        //  1142: aconst_null    
        //  1143: athrow         
        //  1144: aconst_null    
        //  1145: athrow         
        //  1146: aconst_null    
        //  1147: athrow         
        //  1148: aconst_null    
        //  1149: athrow         
        //  1150: aconst_null    
        //  1151: athrow         
        //  1152: pop            
        //  1153: goto            24
        //  1156: pop            
        //  1157: aconst_null    
        //  1158: goto            1152
        //  1161: dup            
        //  1162: ifnull          1152
        //  1165: checkcast       Ljava/lang/Throwable;
        //  1168: athrow         
        //  1169: dup            
        //  1170: ifnull          1156
        //  1173: checkcast       Ljava/lang/Throwable;
        //  1176: athrow         
        //  1177: aconst_null    
        //  1178: athrow         
        //    StackMapTable: 00 89 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 0B 42 01 1C 51 07 00 03 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 01 5E 07 00 03 49 07 00 39 40 07 00 07 45 07 00 5B 40 07 00 07 4B 07 00 07 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 01 5E 07 00 07 4A 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 10 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 06 07 00 07 07 00 A6 03 03 07 00 D8 01 FF 00 1C 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 42 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 04 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 03 01 5D 07 00 03 4E 07 00 98 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 98 01 5D 07 00 98 42 07 00 5B 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 0E 42 01 1E 4A 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 42 07 00 53 40 07 00 A6 45 07 00 5B 40 01 FD 00 10 01 01 42 01 1D 52 07 00 AB FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 AB 01 5D 07 00 AB FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB 47 07 00 5B 40 01 4B 01 FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 01 01 5F 01 FC 00 01 01 53 07 00 03 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 03 01 5E 07 00 03 FF 00 10 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 03 07 00 2A 01 01 FF 00 1F 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 42 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FC 00 10 07 00 07 42 01 1E 4C 07 00 03 FF 00 02 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 03 01 5F 07 00 03 47 07 00 5B FF 00 00 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 46 07 00 5B 40 07 00 05 45 07 00 5B 40 07 00 05 FC 00 10 07 00 A6 42 01 1E 4F 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 02 05 42 01 19 01 0B 42 01 1E 46 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 4C 01 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 5C 01 FF 00 07 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 01 FD 00 01 01 01 FF 00 01 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 00 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 07 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB 41 01 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 01 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 00 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 98 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 00 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 03 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1161   1169   Any
        //  1161   1169   1161   1169   Ljava/lang/IndexOutOfBoundsException;
        //  1177   1179   3      8      Any
        //  130    137    137    138    Any
        //  130    137    130    131    Ljava/lang/NumberFormatException;
        //  131    137    3      8      Any
        //  131    137    137    138    Any
        //  131    137    130    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  195    202    202    203    Any
        //  196    202    3      8      Any
        //  195    202    3      8      Ljava/util/NoSuchElementException;
        //  196    202    202    203    Any
        //  195    202    195    196    Any
        //  255    264    264    265    Any
        //  256    264    3      8      Any
        //  256    264    255    256    Ljava/util/ConcurrentModificationException;
        //  255    264    255    256    Any
        //  255    264    255    256    Any
        //  367    374    374    375    Any
        //  368    374    3      8      Any
        //  367    374    367    368    Ljava/util/ConcurrentModificationException;
        //  367    374    374    375    Any
        //  367    374    367    368    Any
        //  383    390    390    391    Any
        //  383    390    383    384    Any
        //  383    390    383    384    Ljava/lang/StringIndexOutOfBoundsException;
        //  384    390    383    384    Ljava/util/ConcurrentModificationException;
        //  384    390    390    391    Any
        //  451    458    458    459    Any
        //  451    458    451    452    Ljava/lang/NullPointerException;
        //  451    458    451    452    Any
        //  451    458    451    452    Any
        //  452    458    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  462    469    469    470    Any
        //  463    469    3      8      Ljava/lang/UnsupportedOperationException;
        //  463    469    462    463    Ljava/util/ConcurrentModificationException;
        //  462    469    3      8      Ljava/lang/IllegalStateException;
        //  463    469    3      8      Ljava/lang/AssertionError;
        //  576    584    584    585    Any
        //  576    584    584    585    Any
        //  576    584    584    585    Ljava/lang/RuntimeException;
        //  576    584    584    585    Ljava/util/NoSuchElementException;
        //  576    584    3      8      Any
        //  743    752    752    753    Any
        //  743    752    752    753    Any
        //  743    752    743    744    Any
        //  744    752    752    753    Ljava/lang/StringIndexOutOfBoundsException;
        //  744    752    743    744    Any
        //  860    869    869    870    Any
        //  861    869    860    861    Any
        //  860    869    860    861    Any
        //  861    869    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  860    869    3      8      Ljava/lang/IllegalStateException;
        //  877    884    884    885    Any
        //  877    884    877    878    Any
        //  878    884    884    885    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  878    884    884    885    Ljava/lang/NullPointerException;
        //  878    884    877    878    Any
        //  952    961    961    962    Any
        //  952    961    952    953    Any
        //  953    961    3      8      Any
        //  953    961    952    953    Ljava/lang/AssertionError;
        //  953    961    3      8      Any
        //  1055   1062   1062   1063   Any
        //  1056   1062   3      8      Any
        //  1056   1062   1055   1056   Any
        //  1055   1062   1055   1056   Ljava/lang/NumberFormatException;
        //  1056   1062   1055   1056   Ljava/util/ConcurrentModificationException;
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
    
    public void c(@NotNull final f0w p0) {
        public class f0L implements Supplier
        {
            public f0w c;
            
            static {
                throw t;
            }
            
            @NotNull
            public Integer c() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          81
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.0:I
                //    12: ifgt            73
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            65
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_0        
                //    25: getfield        dev/nuker/pyro/f0L.c:Ldev/nuker/pyro/f0w;
                //    28: goto            32
                //    31: athrow         
                //    32: invokevirtual   dev/nuker/pyro/f0w.3:()Ljava/util/function/Supplier;
                //    35: goto            39
                //    38: athrow         
                //    39: goto            43
                //    42: athrow         
                //    43: invokeinterface java/util/function/Supplier.get:()Ljava/lang/Object;
                //    48: goto            52
                //    51: athrow         
                //    52: checkcast       Ljava/lang/Integer;
                //    55: areturn        
                //    56: pop            
                //    57: goto            24
                //    60: pop            
                //    61: aconst_null    
                //    62: goto            56
                //    65: dup            
                //    66: ifnull          56
                //    69: checkcast       Ljava/lang/Throwable;
                //    72: athrow         
                //    73: dup            
                //    74: ifnull          60
                //    77: checkcast       Ljava/lang/Throwable;
                //    80: athrow         
                //    81: aconst_null    
                //    82: athrow         
                //    StackMapTable: 00 11 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 01 07 00 29 45 07 00 25 40 07 00 07 42 07 00 25 40 07 00 07 47 07 00 25 40 07 00 05 43 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     65     73     Ljava/lang/AssertionError;
                //  65     73     65     73     Ljava/lang/EnumConstantNotPresentException;
                //  81     83     3      8      Ljava/lang/ClassCastException;
                //  32     38     38     39     Any
                //  32     38     38     39     Ljava/lang/UnsupportedOperationException;
                //  32     38     3      8      Any
                //  32     38     3      8      Ljava/lang/ArithmeticException;
                //  32     38     38     39     Any
                //  42     51     51     52     Any
                //  42     51     51     52     Ljava/lang/RuntimeException;
                //  43     51     3      8      Any
                //  43     51     3      8      Any
                //  42     51     42     43     Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IndexOutOfBoundsException: Index 38 out of bounds for length 38
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
            
            public f0L(final f0w c) {
                this.c = c;
            }
            
            @Override
            public Object get() {
                return fbS.3h(this, 670586850);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          327
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            319
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            311
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           1293932025
        //    35: goto            41
        //    38: ldc_w           667471213
        //    41: ldc_w           1717093360
        //    44: ixor           
        //    45: lookupswitch {
        //          726078985: 38
        //          1099959965: 72
        //          default: 300
        //        }
        //    72: aload_0        
        //    73: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //    76: ifnonnull       85
        //    79: ldc_w           -310115307
        //    82: goto            88
        //    85: ldc_w           -310115302
        //    88: ldc_w           1578189378
        //    91: ixor           
        //    92: tableswitch {
        //          1730841774: 116
        //          1730841775: 295
        //          default: 79
        //        }
        //   116: aload_0        
        //   117: new             Ldev/nuker/pyro/f0w;
        //   120: dup            
        //   121: new             Ldev/nuker/pyro/f0L;
        //   124: dup            
        //   125: getstatic       dev/nuker/pyro/fc.c:I
        //   128: ifge            137
        //   131: ldc_w           1078896338
        //   134: goto            140
        //   137: ldc_w           1303978804
        //   140: ldc_w           11792116
        //   143: ixor           
        //   144: lookupswitch {
        //          1090340902: 137
        //          1292553664: 172
        //          default: 296
        //        }
        //   172: aload_1        
        //   173: goto            177
        //   176: athrow         
        //   177: invokespecial   dev/nuker/pyro/f0L.<init>:(Ldev/nuker/pyro/f0w;)V
        //   180: goto            184
        //   183: athrow         
        //   184: checkcast       Ljava/util/function/Supplier;
        //   187: aload_1        
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   dev/nuker/pyro/f0w.2:()Ljava/lang/Runnable;
        //   195: goto            199
        //   198: athrow         
        //   199: iconst_0       
        //   200: aload_1        
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   dev/nuker/pyro/f0w.c:()Ljava/util/function/BiFunction;
        //   208: goto            212
        //   211: athrow         
        //   212: aload_1        
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   220: goto            224
        //   223: athrow         
        //   224: getstatic       dev/nuker/pyro/fc.c:I
        //   227: ifge            236
        //   230: ldc_w           -1638395053
        //   233: goto            239
        //   236: ldc_w           -1556801430
        //   239: ldc_w           999897275
        //   242: ixor           
        //   243: lookupswitch {
        //          -1887667037: 236
        //          -1514066968: 298
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokespecial   dev/nuker/pyro/f0w.<init>:(Ljava/util/function/Supplier;Ljava/lang/Runnable;ILjava/util/function/BiFunction;Lnet/minecraft/client/gui/FontRenderer;)V
        //   275: goto            279
        //   278: athrow         
        //   279: putfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   282: aload_0        
        //   283: aload_1        
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   dev/nuker/pyro/f0M.0:(Ldev/nuker/pyro/f0w;)V
        //   291: goto            295
        //   294: athrow         
        //   295: return         
        //   296: aconst_null    
        //   297: athrow         
        //   298: aconst_null    
        //   299: athrow         
        //   300: aconst_null    
        //   301: athrow         
        //   302: pop            
        //   303: goto            24
        //   306: pop            
        //   307: aconst_null    
        //   308: goto            302
        //   311: dup            
        //   312: ifnull          302
        //   315: checkcast       Ljava/lang/Throwable;
        //   318: athrow         
        //   319: dup            
        //   320: ifnull          306
        //   323: checkcast       Ljava/lang/Throwable;
        //   326: athrow         
        //   327: aconst_null    
        //   328: athrow         
        //    StackMapTable: 00 31 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FD 00 03 07 00 03 07 00 A6 0D 42 01 1E 06 05 42 01 1B FF 00 14 00 02 07 00 03 07 00 A6 00 05 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 FF 00 02 00 02 07 00 03 07 00 A6 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 01 FF 00 1F 00 02 07 00 03 07 00 A6 00 05 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 43 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 A6 45 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 04 07 00 03 08 00 75 08 00 75 07 01 FD 46 07 00 53 FF 00 00 00 02 07 00 03 07 00 A6 00 05 07 00 03 08 00 75 08 00 75 07 00 F3 07 00 A6 45 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 05 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 44 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 07 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 00 A6 45 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 07 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B FF 00 03 00 00 00 01 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 00 A6 45 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D FF 00 0B 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D FF 00 02 00 02 07 00 03 07 00 A6 00 09 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 01 FF 00 1C 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 42 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 45 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 02 07 00 03 07 00 A6 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 02 07 00 03 07 00 A6 00 02 07 00 03 07 00 A6 45 07 00 5B 00 FF 00 00 00 02 07 00 03 07 00 A6 00 05 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 FF 00 01 00 02 07 00 03 07 00 A6 00 08 07 00 03 08 00 75 08 00 75 07 00 F3 07 01 09 01 07 01 0B 07 01 0D 01 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     311    319    Any
        //  311    319    311    319    Ljava/lang/UnsupportedOperationException;
        //  327    329    3      8      Any
        //  176    183    183    184    Any
        //  177    183    183    184    Any
        //  176    183    3      8      Ljava/util/NoSuchElementException;
        //  177    183    176    177    Any
        //  177    183    183    184    Ljava/util/NoSuchElementException;
        //  191    198    198    199    Any
        //  191    198    191    192    Ljava/util/ConcurrentModificationException;
        //  191    198    3      8      Ljava/lang/NegativeArraySizeException;
        //  191    198    3      8      Any
        //  192    198    3      8      Ljava/lang/NumberFormatException;
        //  204    211    211    212    Any
        //  204    211    204    205    Any
        //  205    211    211    212    Any
        //  204    211    211    212    Any
        //  204    211    211    212    Ljava/lang/StringIndexOutOfBoundsException;
        //  217    223    223    224    Any
        //  217    223    223    224    Any
        //  217    223    3      8      Ljava/lang/IllegalStateException;
        //  217    223    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  217    223    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  271    278    278    279    Any
        //  272    278    3      8      Any
        //  271    278    3      8      Ljava/lang/AssertionError;
        //  272    278    271    272    Any
        //  271    278    3      8      Ljava/lang/UnsupportedOperationException;
        //  288    294    294    295    Any
        //  288    294    3      8      Ljava/lang/ClassCastException;
        //  288    294    294    295    Ljava/lang/IllegalArgumentException;
        //  288    294    3      8      Any
        //  288    294    3      8      Ljava/lang/NegativeArraySizeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 78 out of bounds for length 78
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
    public void c(final char p0, final int p1) {
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
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           1802859892
        //    33: goto            39
        //    36: ldc_w           -1458873794
        //    39: ldc_w           1375709801
        //    42: ixor           
        //    43: lookupswitch {
        //          801774777: 36
        //          982179613: 144
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //    72: goto            76
        //    75: athrow         
        //    76: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    81: goto            85
        //    84: athrow         
        //    85: astore          4
        //    87: aload           4
        //    89: goto            93
        //    92: athrow         
        //    93: invokeinterface java/util/Iterator.hasNext:()Z
        //    98: goto            102
        //   101: athrow         
        //   102: ifeq            143
        //   105: aload           4
        //   107: goto            111
        //   110: athrow         
        //   111: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   116: goto            120
        //   119: athrow         
        //   120: checkcast       Ldev/nuker/pyro/f0V;
        //   123: astore_3       
        //   124: aload_3        
        //   125: iload_1        
        //   126: iload_2        
        //   127: goto            131
        //   130: athrow         
        //   131: invokeinterface dev/nuker/pyro/f0V.c:(CI)V
        //   136: goto            140
        //   139: athrow         
        //   140: goto            87
        //   143: return         
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
        //    StackMapTable: 00 1F FF 00 03 00 05 07 00 03 01 01 00 07 02 10 00 01 07 00 5B F9 00 04 FF 00 0B 00 00 00 01 07 00 5B FE 00 03 07 00 03 01 01 0B 42 01 1C 46 07 00 39 40 07 00 2A 47 07 00 5B 40 07 02 10 FD 00 01 00 07 02 10 44 07 00 5B 40 07 02 10 47 07 00 5B 40 01 47 07 00 5B 40 07 02 10 47 07 00 5B 40 07 00 05 FF 00 09 00 05 07 00 03 01 01 07 00 07 07 02 10 00 01 07 00 5B FF 00 00 00 05 07 00 03 01 01 07 00 07 07 02 10 00 03 07 00 07 01 01 47 07 00 5B 00 FF 00 02 00 05 07 00 03 01 01 00 07 02 10 00 00 F9 00 00 41 07 00 39 43 05 44 07 00 39 47 05 FF 00 07 00 05 07 00 03 01 01 00 07 02 10 00 01 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     155    163    Ljava/lang/StringIndexOutOfBoundsException;
        //  155    163    155    163    Ljava/lang/RuntimeException;
        //  171    173    3      8      Any
        //  75     84     84     85     Any
        //  75     84     84     85     Any
        //  76     84     75     76     Ljava/lang/IllegalStateException;
        //  75     84     84     85     Ljava/lang/UnsupportedOperationException;
        //  76     84     75     76     Ljava/util/ConcurrentModificationException;
        //  92     101    101    102    Any
        //  92     101    101    102    Any
        //  93     101    92     93     Any
        //  93     101    92     93     Any
        //  92     101    92     93     Any
        //  110    119    119    120    Any
        //  110    119    3      8      Any
        //  110    119    3      8      Any
        //  110    119    110    111    Any
        //  111    119    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  130    139    139    140    Any
        //  130    139    130    131    Any
        //  130    139    3      8      Any
        //  131    139    3      8      Any
        //  131    139    139    140    Any
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
    
    @Nullable
    public f0V 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 5B FC 00 03 07 00 03 44 07 00 5B 43 05 44 07 00 5B 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/lang/NullPointerException;
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
    
    public void c(@NotNull final List list) {
        fbS.fH(this, 941771004, list);
    }
    
    @NotNull
    public fw 0() {
        return fbS.82(this, 1737311727);
    }
    
    @Nullable
    public Tuple c(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1010
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1002
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            994
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -1214274577
        //    33: goto            39
        //    36: ldc_w           -1048868899
        //    39: ldc_w           -618462843
        //    42: ixor           
        //    43: lookupswitch {
        //          1045342912: 36
        //          1824301674: 971
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //    72: dup            
        //    73: ifnonnull       131
        //    76: getstatic       dev/nuker/pyro/fc.c:I
        //    79: ifge            88
        //    82: ldc_w           9804338
        //    85: goto            91
        //    88: ldc_w           389211419
        //    91: ldc_w           1540258023
        //    94: ixor           
        //    95: lookupswitch {
        //          1291623932: 120
        //          1532748501: 88
        //          default: 977
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   127: goto            131
        //   130: athrow         
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   138: goto            142
        //   141: athrow         
        //   142: istore_3       
        //   143: dload_1        
        //   144: iload_3        
        //   145: i2d            
        //   146: dcmpg          
        //   147: ifgt            339
        //   150: new             Lnet/minecraft/util/Tuple;
        //   153: dup            
        //   154: new             Lnet/minecraft/util/Tuple;
        //   157: dup            
        //   158: aload_0        
        //   159: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   162: dup            
        //   163: ifnonnull       172
        //   166: ldc_w           1996458269
        //   169: goto            175
        //   172: ldc_w           1996458270
        //   175: ldc_w           1202301904
        //   178: ixor           
        //   179: tableswitch {
        //          1655457178: 200
        //          1655457179: 211
        //          default: 166
        //        }
        //   200: goto            204
        //   203: athrow         
        //   204: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   207: goto            211
        //   210: athrow         
        //   211: aload_0        
        //   212: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   215: getstatic       dev/nuker/pyro/fc.0:I
        //   218: ifeq            227
        //   221: ldc_w           -918737865
        //   224: goto            230
        //   227: ldc_w           -1564629938
        //   230: ldc_w           1301085171
        //   233: ixor           
        //   234: lookupswitch {
        //          -2068719676: 227
        //          -281976899: 260
        //          default: 973
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   267: goto            271
        //   270: athrow         
        //   271: iconst_0       
        //   272: getstatic       dev/nuker/pyro/fc.1:I
        //   275: ifeq            284
        //   278: ldc_w           753623119
        //   281: goto            287
        //   284: ldc_w           -685810741
        //   287: ldc_w           265954025
        //   290: ixor           
        //   291: lookupswitch {
        //          112387795: 284
        //          590430886: 981
        //          default: 316
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   323: goto            327
        //   326: athrow         
        //   327: goto            331
        //   330: athrow         
        //   331: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   334: goto            338
        //   337: athrow         
        //   338: areturn        
        //   339: iconst_0       
        //   340: getstatic       dev/nuker/pyro/fc.0:I
        //   343: ifeq            352
        //   346: ldc_w           458040281
        //   349: goto            355
        //   352: ldc_w           1264736333
        //   355: ldc_w           -871373681
        //   358: ixor           
        //   359: lookupswitch {
        //          -1441057685: 352
        //          -683489450: 969
        //          default: 384
        //        }
        //   384: istore          4
        //   386: getstatic       dev/nuker/pyro/fc.0:I
        //   389: ifeq            398
        //   392: ldc_w           205496506
        //   395: goto            401
        //   398: ldc_w           -1161129408
        //   401: ldc_w           372442902
        //   404: ixor           
        //   405: lookupswitch {
        //          437036972: 959
        //          1545391398: 398
        //          default: 432
        //        }
        //   432: aload_0        
        //   433: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   436: checkcast       Ljava/util/Collection;
        //   439: goto            443
        //   442: athrow         
        //   443: invokeinterface java/util/Collection.size:()I
        //   448: goto            452
        //   451: athrow         
        //   452: getstatic       dev/nuker/pyro/fc.1:I
        //   455: ifeq            464
        //   458: ldc_w           160280795
        //   461: goto            467
        //   464: ldc_w           -2109829623
        //   467: ldc_w           -44909820
        //   470: ixor           
        //   471: lookupswitch {
        //          -186709025: 464
        //          2137797901: 496
        //          default: 979
        //        }
        //   496: istore          5
        //   498: iload           4
        //   500: iload           5
        //   502: if_icmpge       511
        //   505: ldc_w           309662373
        //   508: goto            514
        //   511: ldc_w           309662374
        //   514: ldc_w           2078854764
        //   517: ixor           
        //   518: tableswitch {
        //          -751060590: 540
        //          -751060589: 957
        //          default: 505
        //        }
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            552
        //   546: ldc_w           978210726
        //   549: goto            555
        //   552: ldc_w           2129254590
        //   555: ldc_w           -65323676
        //   558: ixor           
        //   559: lookupswitch {
        //          -967478590: 983
        //          442697138: 552
        //          default: 584
        //        }
        //   584: aload_0        
        //   585: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   588: getstatic       dev/nuker/pyro/fc.1:I
        //   591: ifeq            600
        //   594: ldc_w           -1212510712
        //   597: goto            603
        //   600: ldc_w           1702208075
        //   603: ldc_w           -1704167363
        //   606: ixor           
        //   607: lookupswitch {
        //          -1231756474: 600
        //          769062453: 975
        //          default: 632
        //        }
        //   632: iload           4
        //   634: goto            638
        //   637: athrow         
        //   638: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   643: goto            647
        //   646: athrow         
        //   647: dup            
        //   648: ifnonnull       662
        //   651: goto            655
        //   654: athrow         
        //   655: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   658: goto            662
        //   661: athrow         
        //   662: checkcast       Ldev/nuker/pyro/f0w;
        //   665: astore          6
        //   667: iload_3        
        //   668: aload           6
        //   670: goto            674
        //   673: athrow         
        //   674: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   677: goto            681
        //   680: athrow         
        //   681: iadd           
        //   682: istore_3       
        //   683: dload_1        
        //   684: iload_3        
        //   685: i2d            
        //   686: dcmpg          
        //   687: ifgt            951
        //   690: new             Lnet/minecraft/util/Tuple;
        //   693: dup            
        //   694: new             Lnet/minecraft/util/Tuple;
        //   697: dup            
        //   698: aload_0        
        //   699: getstatic       dev/nuker/pyro/fc.c:I
        //   702: ifge            711
        //   705: ldc_w           1874945773
        //   708: goto            714
        //   711: ldc_w           -1902664659
        //   714: ldc_w           -1490931047
        //   717: ixor           
        //   718: lookupswitch {
        //          -1843115090: 711
        //          -924625804: 965
        //          default: 744
        //        }
        //   744: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   747: iload           4
        //   749: goto            753
        //   752: athrow         
        //   753: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   758: goto            762
        //   761: athrow         
        //   762: getstatic       dev/nuker/pyro/fc.0:I
        //   765: ifeq            774
        //   768: ldc_w           -264810005
        //   771: goto            777
        //   774: ldc_w           1336898529
        //   777: ldc_w           946267724
        //   780: ixor           
        //   781: lookupswitch {
        //          -934168665: 961
        //          439297129: 774
        //          default: 808
        //        }
        //   808: aload           6
        //   810: getstatic       dev/nuker/pyro/fc.c:I
        //   813: ifge            822
        //   816: ldc_w           -1979345117
        //   819: goto            825
        //   822: ldc_w           -2051070624
        //   825: ldc_w           -931464378
        //   828: ixor           
        //   829: lookupswitch {
        //          -696511745: 822
        //          1115647077: 967
        //          default: 856
        //        }
        //   856: goto            860
        //   859: athrow         
        //   860: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   863: goto            867
        //   866: athrow         
        //   867: iload_3        
        //   868: aload           6
        //   870: getstatic       dev/nuker/pyro/fc.1:I
        //   873: ifeq            882
        //   876: ldc_w           -257721364
        //   879: goto            885
        //   882: ldc_w           -1517835825
        //   885: ldc_w           -1517910228
        //   888: ixor           
        //   889: lookupswitch {
        //            77539: 916
        //          1428552896: 882
        //          default: 963
        //        }
        //   916: goto            920
        //   919: athrow         
        //   920: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   923: goto            927
        //   926: athrow         
        //   927: isub           
        //   928: goto            932
        //   931: athrow         
        //   932: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   935: goto            939
        //   938: athrow         
        //   939: goto            943
        //   942: athrow         
        //   943: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   946: goto            950
        //   949: athrow         
        //   950: areturn        
        //   951: iinc            4, 1
        //   954: goto            498
        //   957: aconst_null    
        //   958: areturn        
        //   959: aconst_null    
        //   960: athrow         
        //   961: aconst_null    
        //   962: athrow         
        //   963: aconst_null    
        //   964: athrow         
        //   965: aconst_null    
        //   966: athrow         
        //   967: aconst_null    
        //   968: athrow         
        //   969: aconst_null    
        //   970: athrow         
        //   971: aconst_null    
        //   972: athrow         
        //   973: aconst_null    
        //   974: athrow         
        //   975: aconst_null    
        //   976: athrow         
        //   977: aconst_null    
        //   978: athrow         
        //   979: aconst_null    
        //   980: athrow         
        //   981: aconst_null    
        //   982: athrow         
        //   983: aconst_null    
        //   984: athrow         
        //   985: pop            
        //   986: goto            24
        //   989: pop            
        //   990: aconst_null    
        //   991: goto            985
        //   994: dup            
        //   995: ifnull          985
        //   998: checkcast       Ljava/lang/Throwable;
        //  1001: athrow         
        //  1002: dup            
        //  1003: ifnull          989
        //  1006: checkcast       Ljava/lang/Throwable;
        //  1009: athrow         
        //  1010: aconst_null    
        //  1011: athrow         
        //    StackMapTable: 00 85 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FD 00 03 07 00 03 03 0B 42 01 1C 53 07 00 A6 FF 00 02 00 02 07 00 03 03 00 02 07 00 A6 01 5C 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 02 07 00 03 03 00 01 07 00 A6 45 07 00 5B 40 01 FF 00 17 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 FF 00 05 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 FF 00 02 00 03 07 00 03 03 01 00 06 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 01 FF 00 18 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 42 07 00 39 FF 00 00 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 45 07 00 5B FF 00 00 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 FF 00 0F 00 03 07 00 03 03 01 00 06 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 07 00 A6 FF 00 02 00 03 07 00 03 03 01 00 07 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 07 00 A6 01 FF 00 1D 00 03 07 00 03 03 01 00 06 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 07 00 A6 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 03 07 00 03 03 01 00 06 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 03 07 00 03 03 01 00 03 08 00 96 08 00 96 07 02 2E FF 00 0C 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 01 FF 00 02 00 03 07 00 03 03 01 00 05 08 00 96 08 00 96 07 02 2E 01 01 FF 00 1C 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 01 42 07 00 5B FF 00 00 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 01 45 07 00 5B FF 00 00 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 07 02 3C 42 07 00 43 FF 00 00 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 07 02 3C 45 07 00 5B 40 07 02 2E 00 4C 01 FF 00 02 00 03 07 00 03 03 01 00 02 01 01 5C 01 FC 00 0D 01 42 01 1E 49 07 00 5B 40 07 00 AB 47 07 00 5B 40 01 4B 01 FF 00 02 00 04 07 00 03 03 01 01 00 02 01 01 5C 01 FC 00 01 01 06 05 42 01 19 0B 42 01 1C 4F 07 00 2A FF 00 02 00 05 07 00 03 03 01 01 01 00 02 07 00 2A 01 5C 07 00 2A 44 07 00 5B FF 00 00 00 05 07 00 03 03 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 46 07 00 5B 40 07 00 05 45 07 00 5B 40 07 00 05 FF 00 0A 00 00 00 01 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 02 01 01 FF 00 1D 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 03 FF 00 02 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 03 01 FF 00 1D 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 03 47 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 2A 01 47 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 FF 00 0B 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 FF 00 02 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 01 FF 00 1E 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 FF 00 0D 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 07 00 A6 FF 00 02 00 06 07 00 03 03 01 01 01 07 00 A6 00 07 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 07 00 A6 01 FF 00 1E 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 07 00 A6 42 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 07 00 A6 45 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 03 08 02 B2 08 02 B2 07 02 2E FF 00 0E 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 07 02 2E 01 07 00 A6 FF 00 02 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 07 02 2E 01 07 00 A6 01 FF 00 1E 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 07 02 2E 01 07 00 A6 42 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 07 02 2E 01 07 00 A6 45 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 07 02 2E 01 01 43 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 04 08 02 B2 08 02 B2 07 02 2E 01 45 07 00 5B FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 04 08 02 B2 08 02 B2 07 02 2E 07 02 3C 42 07 00 4F FF 00 00 00 06 07 00 03 03 01 01 01 07 00 A6 00 04 08 02 B2 08 02 B2 07 02 2E 07 02 3C 45 07 00 5B 40 07 02 2E 00 FA 00 05 FA 00 01 FF 00 01 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 FF 00 01 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 07 02 2E 01 07 00 A6 FF 00 01 00 06 07 00 03 03 01 01 01 07 00 A6 00 05 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 03 FF 00 01 00 06 07 00 03 03 01 01 01 07 00 A6 00 06 08 02 B2 08 02 B2 08 02 B6 08 02 B6 07 00 05 07 00 A6 FF 00 01 00 03 07 00 03 03 01 00 01 01 FA 00 01 FF 00 01 00 03 07 00 03 03 01 00 06 08 00 96 08 00 96 08 00 9A 08 00 9A 07 00 07 07 00 A6 FF 00 01 00 05 07 00 03 03 01 01 01 00 01 07 00 2A FF 00 01 00 02 07 00 03 03 00 01 07 00 A6 FF 00 01 00 04 07 00 03 03 01 01 00 01 01 FF 00 01 00 03 07 00 03 03 01 00 04 08 00 96 08 00 96 07 02 2E 01 FD 00 01 01 01 FF 00 01 00 02 07 00 03 03 00 01 07 00 39 43 05 44 07 00 39 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     994    1002   Ljava/lang/NegativeArraySizeException;
        //  994    1002   994    1002   Ljava/util/ConcurrentModificationException;
        //  1010   1012   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  123    130    130    131    Any
        //  124    130    3      8      Any
        //  123    130    123    124    Any
        //  123    130    130    131    Any
        //  123    130    3      8      Any
        //  135    141    141    142    Any
        //  135    141    141    142    Ljava/lang/StringIndexOutOfBoundsException;
        //  135    141    141    142    Ljava/lang/EnumConstantNotPresentException;
        //  135    141    141    142    Ljava/lang/IndexOutOfBoundsException;
        //  135    141    3      8      Any
        //  203    210    210    211    Any
        //  204    210    210    211    Ljava/util/NoSuchElementException;
        //  203    210    210    211    Ljava/lang/IndexOutOfBoundsException;
        //  204    210    210    211    Ljava/lang/IndexOutOfBoundsException;
        //  204    210    203    204    Ljava/lang/RuntimeException;
        //  264    270    270    271    Any
        //  264    270    3      8      Any
        //  264    270    3      8      Any
        //  264    270    270    271    Any
        //  264    270    3      8      Any
        //  319    326    326    327    Any
        //  320    326    319    320    Any
        //  320    326    3      8      Ljava/util/NoSuchElementException;
        //  320    326    319    320    Any
        //  319    326    319    320    Ljava/lang/NegativeArraySizeException;
        //  330    337    337    338    Any
        //  331    337    3      8      Any
        //  331    337    330    331    Ljava/lang/StringIndexOutOfBoundsException;
        //  331    337    337    338    Any
        //  331    337    3      8      Any
        //  442    451    451    452    Any
        //  443    451    442    443    Any
        //  443    451    451    452    Any
        //  442    451    3      8      Ljava/util/NoSuchElementException;
        //  442    451    442    443    Ljava/lang/UnsupportedOperationException;
        //  637    646    646    647    Any
        //  637    646    637    638    Ljava/lang/ClassCastException;
        //  638    646    3      8      Ljava/lang/AssertionError;
        //  638    646    637    638    Any
        //  637    646    637    638    Any
        //  654    661    661    662    Any
        //  654    661    3      8      Ljava/lang/ClassCastException;
        //  655    661    654    655    Any
        //  654    661    661    662    Any
        //  654    661    661    662    Any
        //  674    680    680    681    Any
        //  674    680    680    681    Ljava/lang/ArithmeticException;
        //  674    680    3      8      Ljava/lang/RuntimeException;
        //  674    680    3      8      Any
        //  674    680    3      8      Ljava/lang/UnsupportedOperationException;
        //  752    761    761    762    Any
        //  753    761    3      8      Any
        //  752    761    761    762    Any
        //  753    761    752    753    Any
        //  752    761    3      8      Ljava/lang/IllegalStateException;
        //  859    866    866    867    Any
        //  860    866    3      8      Ljava/lang/IllegalArgumentException;
        //  859    866    866    867    Ljava/lang/NullPointerException;
        //  860    866    859    860    Any
        //  860    866    866    867    Ljava/lang/StringIndexOutOfBoundsException;
        //  919    926    926    927    Any
        //  920    926    3      8      Any
        //  919    926    3      8      Any
        //  920    926    919    920    Any
        //  919    926    919    920    Any
        //  931    938    938    939    Any
        //  932    938    931    932    Ljava/lang/IllegalArgumentException;
        //  932    938    3      8      Any
        //  932    938    931    932    Any
        //  931    938    3      8      Ljava/lang/ClassCastException;
        //  942    949    949    950    Any
        //  942    949    3      8      Any
        //  943    949    942    943    Ljava/lang/IllegalArgumentException;
        //  943    949    3      8      Any
        //  942    949    3      8      Ljava/lang/ClassCastException;
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
    
    @Override
    public boolean 1(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1145
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1137
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1129
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           201468116
        //    33: goto            39
        //    36: ldc_w           1317284093
        //    39: ldc_w           -1649425669
        //    42: ixor           
        //    43: lookupswitch {
        //          -1850873297: 36
        //          -752096762: 68
        //          default: 1102
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload           6
        //    72: pop            
        //    73: aload_0        
        //    74: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //    77: dup            
        //    78: ifnonnull       92
        //    81: goto            85
        //    84: athrow         
        //    85: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    88: goto            92
        //    91: athrow         
        //    92: aload_0        
        //    93: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //    96: dup            
        //    97: ifnonnull       155
        //   100: getstatic       dev/nuker/pyro/fc.c:I
        //   103: ifge            112
        //   106: ldc_w           -624529871
        //   109: goto            115
        //   112: ldc_w           -1719829314
        //   115: ldc_w           -554328427
        //   118: ixor           
        //   119: lookupswitch {
        //          -552477190: 112
        //          70512804: 1098
        //          default: 144
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   151: goto            155
        //   154: athrow         
        //   155: dload_2        
        //   156: dload           4
        //   158: getstatic       dev/nuker/pyro/fc.c:I
        //   161: ifge            170
        //   164: ldc_w           -877775822
        //   167: goto            173
        //   170: ldc_w           -959404699
        //   173: ldc_w           -1538946222
        //   176: ixor           
        //   177: lookupswitch {
        //          -595755932: 170
        //          1877720928: 1096
        //          default: 204
        //        }
        //   204: aload           6
        //   206: goto            210
        //   209: athrow         
        //   210: invokeinterface dev/nuker/pyro/f0V.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   215: goto            219
        //   218: athrow         
        //   219: ifeq            224
        //   222: iconst_1       
        //   223: ireturn        
        //   224: getstatic       dev/nuker/pyro/fc.0:I
        //   227: ifeq            236
        //   230: ldc_w           -1047975108
        //   233: goto            239
        //   236: ldc_w           -1786203516
        //   239: ldc_w           1955052935
        //   242: ixor           
        //   243: lookupswitch {
        //          -1257335109: 236
        //          -519106813: 268
        //          default: 1116
        //        }
        //   268: aload_0        
        //   269: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   272: getstatic       dev/nuker/pyro/fc.c:I
        //   275: ifge            284
        //   278: ldc_w           1320638641
        //   281: goto            287
        //   284: ldc_w           313953955
        //   287: ldc_w           -401323726
        //   290: ixor           
        //   291: lookupswitch {
        //          -1499262589: 1092
        //          1757879220: 284
        //          default: 316
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   323: goto            327
        //   326: athrow         
        //   327: dup            
        //   328: pop            
        //   329: checkcast       Ljava/lang/Boolean;
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   339: goto            343
        //   342: athrow         
        //   343: ifeq            1088
        //   346: getstatic       dev/nuker/pyro/fc.c:I
        //   349: ifge            358
        //   352: ldc_w           -372821687
        //   355: goto            361
        //   358: ldc_w           -305847664
        //   361: ldc_w           -1383111959
        //   364: ixor           
        //   365: lookupswitch {
        //          1145590688: 1090
        //          2100618122: 358
        //          default: 392
        //        }
        //   392: aload_0        
        //   393: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   396: dup            
        //   397: ifnonnull       406
        //   400: ldc_w           -319307398
        //   403: goto            409
        //   406: ldc_w           -319307419
        //   409: ldc_w           -1852688715
        //   412: ixor           
        //   413: tableswitch {
        //          -87298146: 436
        //          -87298145: 447
        //          default: 400
        //        }
        //   436: goto            440
        //   439: athrow         
        //   440: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   443: goto            447
        //   446: athrow         
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   454: goto            458
        //   457: athrow         
        //   458: istore          7
        //   460: iconst_0       
        //   461: istore          8
        //   463: aload_0        
        //   464: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   467: checkcast       Ljava/util/Collection;
        //   470: getstatic       dev/nuker/pyro/fc.c:I
        //   473: ifge            482
        //   476: ldc_w           -592598519
        //   479: goto            485
        //   482: ldc_w           1504961377
        //   485: ldc_w           1899341869
        //   488: ixor           
        //   489: lookupswitch {
        //          -1382546908: 482
        //          679889740: 516
        //          default: 1110
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokeinterface java/util/Collection.size:()I
        //   525: goto            529
        //   528: athrow         
        //   529: istore          9
        //   531: getstatic       dev/nuker/pyro/fc.0:I
        //   534: ifeq            543
        //   537: ldc_w           -1994881827
        //   540: goto            546
        //   543: ldc_w           610205998
        //   546: ldc_w           -1713217131
        //   549: ixor           
        //   550: lookupswitch {
        //          284878152: 1114
        //          2142636737: 543
        //          default: 576
        //        }
        //   576: iload           8
        //   578: iload           9
        //   580: if_icmpge       1088
        //   583: getstatic       dev/nuker/pyro/fc.c:I
        //   586: ifge            595
        //   589: ldc_w           522221513
        //   592: goto            598
        //   595: ldc_w           -865377927
        //   598: ldc_w           190604359
        //   601: ixor           
        //   602: lookupswitch {
        //          -1300250258: 595
        //          343675790: 1106
        //          default: 628
        //        }
        //   628: aload_0        
        //   629: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   632: iload           8
        //   634: goto            638
        //   637: athrow         
        //   638: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   643: goto            647
        //   646: athrow         
        //   647: checkcast       Ldev/nuker/pyro/f0V;
        //   650: getstatic       dev/nuker/pyro/fc.c:I
        //   653: ifge            662
        //   656: ldc_w           -166343705
        //   659: goto            665
        //   662: ldc_w           143454528
        //   665: ldc_w           -1225999785
        //   668: ixor           
        //   669: lookupswitch {
        //          644931956: 662
        //          1090089392: 1112
        //          default: 696
        //        }
        //   696: astore          10
        //   698: aload_0        
        //   699: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   702: iload           8
        //   704: goto            708
        //   707: athrow         
        //   708: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   713: goto            717
        //   716: athrow         
        //   717: dup            
        //   718: ifnonnull       727
        //   721: ldc_w           1046096782
        //   724: goto            730
        //   727: ldc_w           1046096781
        //   730: ldc_w           834762139
        //   733: ixor           
        //   734: tableswitch {
        //          523680810: 756
        //          523680811: 767
        //          default: 721
        //        }
        //   756: goto            760
        //   759: athrow         
        //   760: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   763: goto            767
        //   766: athrow         
        //   767: checkcast       Ldev/nuker/pyro/f0w;
        //   770: astore          11
        //   772: getstatic       dev/nuker/pyro/fc.0:I
        //   775: ifeq            784
        //   778: ldc_w           -580293043
        //   781: goto            787
        //   784: ldc_w           -273909702
        //   787: ldc_w           1063055294
        //   790: ixor           
        //   791: lookupswitch {
        //          -499809805: 1100
        //          -443845576: 784
        //          default: 816
        //        }
        //   816: aload           10
        //   818: getstatic       dev/nuker/pyro/fc.1:I
        //   821: ifeq            830
        //   824: ldc_w           -891912745
        //   827: goto            833
        //   830: ldc_w           1741397509
        //   833: ldc_w           -2113041116
        //   836: ixor           
        //   837: lookupswitch {
        //          -440003807: 864
        //          1222373619: 830
        //          default: 1104
        //        }
        //   864: aload           11
        //   866: getstatic       dev/nuker/pyro/fc.c:I
        //   869: ifge            878
        //   872: ldc_w           28063689
        //   875: goto            881
        //   878: ldc_w           -1029098495
        //   881: ldc_w           1061992603
        //   884: ixor           
        //   885: lookupswitch {
        //          -35287910: 912
        //          1054904146: 878
        //          default: 1108
        //        }
        //   912: dload_2        
        //   913: dload           4
        //   915: getstatic       dev/nuker/pyro/fc.c:I
        //   918: ifge            927
        //   921: ldc_w           56435107
        //   924: goto            930
        //   927: ldc_w           2098946325
        //   930: ldc_w           2032994113
        //   933: ixor           
        //   934: lookupswitch {
        //          70674004: 960
        //          2054170338: 927
        //          default: 1094
        //        }
        //   960: iload           7
        //   962: i2d            
        //   963: dsub           
        //   964: aload           6
        //   966: goto            970
        //   969: athrow         
        //   970: invokeinterface dev/nuker/pyro/f0V.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   975: goto            979
        //   978: athrow         
        //   979: ifeq            988
        //   982: ldc_w           719658890
        //   985: goto            991
        //   988: ldc_w           719658885
        //   991: ldc_w           -625691411
        //   994: ixor           
        //   995: tableswitch {
        //          -526166322: 1016
        //          -526166321: 1018
        //          default: 982
        //        }
        //  1016: iconst_1       
        //  1017: ireturn        
        //  1018: iload           7
        //  1020: aload           11
        //  1022: goto            1026
        //  1025: athrow         
        //  1026: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1029: goto            1033
        //  1032: athrow         
        //  1033: iadd           
        //  1034: getstatic       dev/nuker/pyro/fc.c:I
        //  1037: ifge            1046
        //  1040: ldc_w           569787844
        //  1043: goto            1049
        //  1046: ldc_w           394928095
        //  1049: ldc_w           -495114461
        //  1052: ixor           
        //  1053: lookupswitch {
        //          -1014275353: 1046
        //          -168347396: 1080
        //          default: 1118
        //        }
        //  1080: istore          7
        //  1082: iinc            8, 1
        //  1085: goto            531
        //  1088: iconst_0       
        //  1089: ireturn        
        //  1090: aconst_null    
        //  1091: athrow         
        //  1092: aconst_null    
        //  1093: athrow         
        //  1094: aconst_null    
        //  1095: athrow         
        //  1096: aconst_null    
        //  1097: athrow         
        //  1098: aconst_null    
        //  1099: athrow         
        //  1100: aconst_null    
        //  1101: athrow         
        //  1102: aconst_null    
        //  1103: athrow         
        //  1104: aconst_null    
        //  1105: athrow         
        //  1106: aconst_null    
        //  1107: athrow         
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
        //  1120: pop            
        //  1121: goto            24
        //  1124: pop            
        //  1125: aconst_null    
        //  1126: goto            1120
        //  1129: dup            
        //  1130: ifnull          1120
        //  1133: checkcast       Ljava/lang/Throwable;
        //  1136: athrow         
        //  1137: dup            
        //  1138: ifnull          1124
        //  1141: checkcast       Ljava/lang/Throwable;
        //  1144: athrow         
        //  1145: aconst_null    
        //  1146: athrow         
        //    StackMapTable: 00 89 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 0B 42 01 1C 4F 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 FF 00 13 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 03 07 00 07 07 00 A6 01 FF 00 1C 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 42 07 00 4D FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 0E 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 04 07 00 07 07 00 A6 03 03 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 01 FF 00 1E 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 04 07 00 07 07 00 A6 03 03 44 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 04 0B 42 01 1C 4F 07 00 98 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 98 01 5C 07 00 98 42 07 00 39 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 0E 42 01 1E 47 07 00 A6 45 07 00 A6 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 A6 01 5A 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 01 FF 00 17 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 AB 01 5E 07 00 AB FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB 47 07 00 5B 40 01 FC 00 01 01 0B 42 01 1D 12 42 01 1D FF 00 08 00 00 00 01 07 00 5B FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 4E 07 00 07 FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 07 01 5E 07 00 07 FF 00 0A 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 01 07 00 5B FF 00 00 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 43 07 00 05 45 07 00 05 FF 00 02 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 05 01 59 07 00 05 42 07 00 5B 40 07 00 05 45 07 00 5B 40 07 00 05 FC 00 10 07 00 A6 42 01 1C 4D 07 00 07 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 01 5E 07 00 07 FF 00 0D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 01 FF 00 1E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 FF 00 0E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 01 FF 00 1D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 48 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 02 05 42 01 18 01 46 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 4C 01 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 5E 01 FF 00 07 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 01 41 07 00 98 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 04 07 00 07 07 00 A6 03 03 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 00 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 07 00 07 F9 00 01 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 01 07 00 07 01 F8 00 01 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 01 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1129   1137   Any
        //  1129   1137   1129   1137   Any
        //  1145   1147   3      8      Any
        //  84     91     91     92     Any
        //  84     91     91     92     Any
        //  84     91     91     92     Any
        //  85     91     3      8      Ljava/lang/NumberFormatException;
        //  85     91     84     85     Any
        //  147    154    154    155    Any
        //  148    154    154    155    Ljava/util/ConcurrentModificationException;
        //  148    154    147    148    Ljava/lang/EnumConstantNotPresentException;
        //  148    154    3      8      Any
        //  147    154    154    155    Ljava/lang/NullPointerException;
        //  209    218    218    219    Any
        //  209    218    209    210    Ljava/lang/EnumConstantNotPresentException;
        //  209    218    218    219    Any
        //  210    218    209    210    Ljava/lang/AssertionError;
        //  210    218    209    210    Any
        //  319    326    326    327    Any
        //  320    326    319    320    Ljava/lang/NullPointerException;
        //  319    326    3      8      Any
        //  320    326    319    320    Ljava/lang/UnsupportedOperationException;
        //  320    326    319    320    Ljava/lang/IndexOutOfBoundsException;
        //  335    342    342    343    Any
        //  336    342    3      8      Any
        //  335    342    335    336    Any
        //  335    342    335    336    Ljava/lang/UnsupportedOperationException;
        //  336    342    342    343    Any
        //  439    446    446    447    Any
        //  439    446    3      8      Any
        //  439    446    3      8      Ljava/lang/UnsupportedOperationException;
        //  439    446    439    440    Any
        //  439    446    446    447    Any
        //  450    457    457    458    Any
        //  451    457    3      8      Any
        //  451    457    450    451    Any
        //  451    457    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  450    457    457    458    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  520    528    528    529    Any
        //  520    528    528    529    Ljava/lang/NegativeArraySizeException;
        //  520    528    3      8      Ljava/lang/IllegalArgumentException;
        //  520    528    528    529    Any
        //  520    528    3      8      Any
        //  638    646    646    647    Any
        //  638    646    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  638    646    646    647    Ljava/lang/IllegalStateException;
        //  638    646    646    647    Any
        //  638    646    646    647    Ljava/lang/IllegalStateException;
        //  707    716    716    717    Any
        //  708    716    3      8      Any
        //  708    716    707    708    Any
        //  707    716    716    717    Ljava/lang/AssertionError;
        //  707    716    716    717    Any
        //  759    766    766    767    Any
        //  760    766    759    760    Ljava/lang/RuntimeException;
        //  759    766    759    760    Any
        //  759    766    3      8      Ljava/lang/IllegalArgumentException;
        //  759    766    766    767    Ljava/lang/AssertionError;
        //  969    978    978    979    Any
        //  970    978    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  970    978    969    970    Any
        //  969    978    978    979    Ljava/lang/RuntimeException;
        //  970    978    969    970    Any
        //  1025   1032   1032   1033   Any
        //  1026   1032   1025   1026   Ljava/lang/ArithmeticException;
        //  1026   1032   1025   1026   Any
        //  1026   1032   3      8      Ljava/lang/RuntimeException;
        //  1025   1032   1032   1033   Ljava/lang/IllegalStateException;
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
    
    @Override
    public void 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          293
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            285
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            277
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //    28: dup            
        //    29: ifnonnull       43
        //    32: goto            36
        //    35: athrow         
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    39: goto            43
        //    42: athrow         
        //    43: goto            47
        //    46: athrow         
        //    47: invokeinterface dev/nuker/pyro/f0V.1:()V
        //    52: goto            56
        //    55: athrow         
        //    56: getstatic       dev/nuker/pyro/fc.c:I
        //    59: ifge            68
        //    62: ldc_w           1427626489
        //    65: goto            71
        //    68: ldc_w           -662601651
        //    71: ldc_w           -454529068
        //    74: ixor           
        //    75: lookupswitch {
        //          -2092434825: 68
        //          -1308641747: 262
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: getstatic       dev/nuker/pyro/fc.0:I
        //   104: ifeq            113
        //   107: ldc_w           1011103522
        //   110: goto            116
        //   113: ldc_w           -1565070533
        //   116: ldc_w           -1393387261
        //   119: ixor           
        //   120: lookupswitch {
        //          -1867076063: 264
        //          1016958153: 113
        //          default: 148
        //        }
        //   148: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   151: goto            155
        //   154: athrow         
        //   155: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   160: goto            164
        //   163: athrow         
        //   164: getstatic       dev/nuker/pyro/fc.c:I
        //   167: ifge            176
        //   170: ldc_w           622228212
        //   173: goto            179
        //   176: ldc_w           -350454643
        //   179: ldc_w           153555900
        //   182: ixor           
        //   183: lookupswitch {
        //          -499421391: 208
        //          741433672: 176
        //          default: 266
        //        }
        //   208: astore_2       
        //   209: aload_2        
        //   210: goto            214
        //   213: athrow         
        //   214: invokeinterface java/util/Iterator.hasNext:()Z
        //   219: goto            223
        //   222: athrow         
        //   223: ifeq            261
        //   226: aload_2        
        //   227: goto            231
        //   230: athrow         
        //   231: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   236: goto            240
        //   239: athrow         
        //   240: checkcast       Ldev/nuker/pyro/f0V;
        //   243: astore_1       
        //   244: aload_1        
        //   245: goto            249
        //   248: athrow         
        //   249: invokeinterface dev/nuker/pyro/f0V.1:()V
        //   254: goto            258
        //   257: athrow         
        //   258: goto            209
        //   261: return         
        //   262: aconst_null    
        //   263: athrow         
        //   264: aconst_null    
        //   265: athrow         
        //   266: aconst_null    
        //   267: athrow         
        //   268: pop            
        //   269: goto            24
        //   272: pop            
        //   273: aconst_null    
        //   274: goto            268
        //   277: dup            
        //   278: ifnull          268
        //   281: checkcast       Ljava/lang/Throwable;
        //   284: athrow         
        //   285: dup            
        //   286: ifnull          272
        //   289: checkcast       Ljava/lang/Throwable;
        //   292: athrow         
        //   293: aconst_null    
        //   294: athrow         
        //    StackMapTable: 00 2F 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FC 00 03 07 00 03 4A 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 42 07 00 5B 40 07 00 07 47 07 00 5B 00 0B 42 01 1C 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 45 07 00 5B 40 07 00 2A 47 07 00 5B 40 07 02 10 4B 07 02 10 FF 00 02 00 01 07 00 03 00 02 07 02 10 01 5C 07 02 10 FD 00 00 00 07 02 10 FF 00 03 00 00 00 01 07 00 5B FF 00 00 00 03 07 00 03 00 07 02 10 00 01 07 02 10 47 07 00 5B 40 01 FF 00 06 00 00 00 01 07 00 5B FF 00 00 00 03 07 00 03 00 07 02 10 00 01 07 02 10 47 07 00 5B 40 07 00 05 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 03 07 00 03 07 00 07 07 02 10 00 01 07 00 07 47 07 00 5B 00 FF 00 02 00 03 07 00 03 00 07 02 10 00 00 F9 00 00 41 07 00 03 41 07 02 10 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     277    285    Ljava/lang/EnumConstantNotPresentException;
        //  277    285    277    285    Any
        //  293    295    3      8      Ljava/lang/NullPointerException;
        //  35     42     42     43     Any
        //  35     42     35     36     Ljava/lang/RuntimeException;
        //  35     42     35     36     Any
        //  35     42     42     43     Ljava/lang/AssertionError;
        //  35     42     35     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  46     55     55     56     Any
        //  47     55     46     47     Any
        //  47     55     55     56     Any
        //  47     55     55     56     Any
        //  46     55     3      8      Any
        //  154    163    163    164    Any
        //  155    163    154    155    Ljava/lang/AssertionError;
        //  155    163    3      8      Any
        //  155    163    154    155    Ljava/lang/NumberFormatException;
        //  154    163    163    164    Ljava/lang/NegativeArraySizeException;
        //  214    222    222    223    Any
        //  214    222    222    223    Ljava/lang/UnsupportedOperationException;
        //  214    222    222    223    Any
        //  214    222    3      8      Any
        //  214    222    222    223    Ljava/lang/NegativeArraySizeException;
        //  231    239    239    240    Any
        //  231    239    3      8      Ljava/lang/UnsupportedOperationException;
        //  231    239    239    240    Ljava/lang/IllegalArgumentException;
        //  231    239    3      8      Any
        //  231    239    239    240    Any
        //  249    257    257    258    Any
        //  249    257    257    258    Ljava/lang/NumberFormatException;
        //  249    257    257    258    Any
        //  249    257    257    258    Ljava/lang/NumberFormatException;
        //  249    257    3      8      Ljava/util/ConcurrentModificationException;
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
    
    @Override
    public void 0(@NotNull final f0w p0, @NotNull final f0y p1, @NotNull final f0Z p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1512
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1504
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1496
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -65245081
        //    33: goto            39
        //    36: ldc_w           1351805518
        //    39: ldc_w           1436631096
        //    42: ixor           
        //    43: lookupswitch {
        //          -1447219105: 36
        //          87272054: 68
        //          default: 1481
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_2        
        //    71: pop            
        //    72: getstatic       dev/nuker/pyro/fc.0:I
        //    75: ifeq            84
        //    78: ldc_w           -1146641329
        //    81: goto            87
        //    84: ldc_w           965340518
        //    87: ldc_w           -767001444
        //    90: ixor           
        //    91: lookupswitch {
        //          -339635718: 116
        //          1777326291: 84
        //          default: 1463
        //        }
        //   116: aload_3        
        //   117: pop            
        //   118: aload_3        
        //   119: instanceof      Ldev/nuker/pyro/f0W;
        //   122: ifeq            131
        //   125: ldc_w           1489706388
        //   128: goto            134
        //   131: ldc_w           1489706389
        //   134: ldc_w           132551840
        //   137: ixor           
        //   138: tableswitch {
        //          -1101327768: 160
        //          -1101327767: 739
        //          default: 125
        //        }
        //   160: aload_3        
        //   161: getstatic       dev/nuker/pyro/fc.c:I
        //   164: ifge            173
        //   167: ldc_w           -367512822
        //   170: goto            176
        //   173: ldc_w           849757590
        //   176: ldc_w           -41486847
        //   179: ixor           
        //   180: lookupswitch {
        //          396281099: 1467
        //          1137939598: 173
        //          default: 208
        //        }
        //   208: goto            212
        //   211: athrow         
        //   212: invokevirtual   dev/nuker/pyro/f0Z.c:()I
        //   215: goto            219
        //   218: athrow         
        //   219: iconst_1       
        //   220: if_icmpne       739
        //   223: aload_3        
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   dev/nuker/pyro/f0Z.3:()D
        //   231: goto            235
        //   234: athrow         
        //   235: aload_0        
        //   236: getstatic       dev/nuker/pyro/fc.0:I
        //   239: ifeq            248
        //   242: ldc_w           1193027607
        //   245: goto            251
        //   248: ldc_w           -1573488255
        //   251: ldc_w           1594994091
        //   254: ixor           
        //   255: lookupswitch {
        //          403539388: 1465
        //          1120072017: 248
        //          default: 280
        //        }
        //   280: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   283: dup            
        //   284: ifnonnull       298
        //   287: goto            291
        //   290: athrow         
        //   291: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   294: goto            298
        //   297: athrow         
        //   298: goto            302
        //   301: athrow         
        //   302: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   305: goto            309
        //   308: athrow         
        //   309: i2d            
        //   310: dcmpg          
        //   311: ifge            739
        //   314: aload_0        
        //   315: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   318: aload_0        
        //   319: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   322: getstatic       dev/nuker/pyro/fc.1:I
        //   325: ifeq            334
        //   328: ldc_w           226483036
        //   331: goto            337
        //   334: ldc_w           1919180764
        //   337: ldc_w           -1008565378
        //   340: ixor           
        //   341: lookupswitch {
        //          -828549086: 1479
        //          1154085094: 334
        //          default: 368
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   375: goto            379
        //   378: athrow         
        //   379: checkcast       Ljava/lang/Boolean;
        //   382: goto            386
        //   385: athrow         
        //   386: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   389: goto            393
        //   392: athrow         
        //   393: ifne            400
        //   396: iconst_1       
        //   397: goto            401
        //   400: iconst_0       
        //   401: goto            405
        //   404: athrow         
        //   405: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   408: goto            412
        //   411: athrow         
        //   412: goto            416
        //   415: athrow         
        //   416: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   419: goto            423
        //   422: athrow         
        //   423: getstatic       dev/nuker/pyro/fc.0:I
        //   426: ifeq            435
        //   429: ldc_w           236786093
        //   432: goto            438
        //   435: ldc_w           -1117551208
        //   438: ldc_w           136523398
        //   441: ixor           
        //   442: lookupswitch {
        //          -1254053090: 468
        //          104742699: 435
        //          default: 1457
        //        }
        //   468: aload_0        
        //   469: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   472: getstatic       dev/nuker/pyro/fc.1:I
        //   475: ifeq            484
        //   478: ldc_w           -1620926708
        //   481: goto            487
        //   484: ldc_w           64359431
        //   487: ldc_w           -137325039
        //   490: ixor           
        //   491: lookupswitch {
        //          -1317392381: 484
        //          1756498205: 1455
        //          default: 516
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   525: goto            529
        //   528: athrow         
        //   529: astore          5
        //   531: aload           5
        //   533: goto            537
        //   536: athrow         
        //   537: invokeinterface java/util/Iterator.hasNext:()Z
        //   542: goto            546
        //   545: athrow         
        //   546: ifeq            724
        //   549: getstatic       dev/nuker/pyro/fc.1:I
        //   552: ifeq            561
        //   555: ldc_w           1231809918
        //   558: goto            564
        //   561: ldc_w           1386860284
        //   564: ldc_w           499416528
        //   567: ixor           
        //   568: lookupswitch {
        //          1332589356: 596
        //          1420791982: 561
        //          default: 1469
        //        }
        //   596: aload           5
        //   598: getstatic       dev/nuker/pyro/fc.1:I
        //   601: ifeq            610
        //   604: ldc_w           -433989756
        //   607: goto            613
        //   610: ldc_w           1156777570
        //   613: ldc_w           104130427
        //   616: ixor           
        //   617: lookupswitch {
        //          -535482113: 1461
        //          1328861159: 610
        //          default: 644
        //        }
        //   644: goto            648
        //   647: athrow         
        //   648: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   653: goto            657
        //   656: athrow         
        //   657: checkcast       Ldev/nuker/pyro/f0V;
        //   660: getstatic       dev/nuker/pyro/fc.1:I
        //   663: ifeq            672
        //   666: ldc_w           1950964089
        //   669: goto            675
        //   672: ldc_w           -50590241
        //   675: ldc_w           -529785111
        //   678: ixor           
        //   679: lookupswitch {
        //          -1809496176: 1471
        //          -179578055: 672
        //          default: 704
        //        }
        //   704: astore          4
        //   706: aload           4
        //   708: goto            712
        //   711: athrow         
        //   712: invokeinterface dev/nuker/pyro/f0V.1:()V
        //   717: goto            721
        //   720: athrow         
        //   721: goto            531
        //   724: aload_1        
        //   725: goto            729
        //   728: athrow         
        //   729: invokevirtual   dev/nuker/pyro/f0w.0:()V
        //   732: goto            736
        //   735: athrow         
        //   736: goto            1454
        //   739: aload_0        
        //   740: aload_3        
        //   741: instanceof      Ldev/nuker/pyro/f0X;
        //   744: ifeq            810
        //   747: getstatic       dev/nuker/pyro/fc.0:I
        //   750: ifeq            759
        //   753: ldc_w           1275193742
        //   756: goto            762
        //   759: ldc_w           -461287445
        //   762: ldc_w           398537067
        //   765: ixor           
        //   766: lookupswitch {
        //          1539365093: 1473
        //          1561075419: 759
        //          default: 792
        //        }
        //   792: aload_3        
        //   793: checkcast       Ldev/nuker/pyro/f0X;
        //   796: goto            800
        //   799: athrow         
        //   800: invokevirtual   dev/nuker/pyro/f0X.1:()D
        //   803: goto            807
        //   806: athrow         
        //   807: goto            847
        //   810: aload_3        
        //   811: instanceof      Ldev/nuker/pyro/f0Y;
        //   814: ifeq            835
        //   817: aload_3        
        //   818: checkcast       Ldev/nuker/pyro/f0Y;
        //   821: goto            825
        //   824: athrow         
        //   825: invokevirtual   dev/nuker/pyro/f0Y.c:()D
        //   828: goto            832
        //   831: athrow         
        //   832: goto            847
        //   835: aload_3        
        //   836: goto            840
        //   839: athrow         
        //   840: invokevirtual   dev/nuker/pyro/f0Z.3:()D
        //   843: goto            847
        //   846: athrow         
        //   847: goto            851
        //   850: athrow         
        //   851: invokevirtual   dev/nuker/pyro/f0M.c:(D)Lnet/minecraft/util/Tuple;
        //   854: goto            858
        //   857: athrow         
        //   858: dup            
        //   859: ifnonnull       868
        //   862: ldc_w           -1250938291
        //   865: goto            871
        //   868: ldc_w           -1250938290
        //   871: ldc_w           -1581433848
        //   874: ixor           
        //   875: tableswitch {
        //          697965706: 896
        //          697965707: 907
        //          default: 862
        //        }
        //   896: goto            900
        //   899: athrow         
        //   900: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   903: goto            907
        //   906: athrow         
        //   907: astore          4
        //   909: aload           4
        //   911: goto            915
        //   914: athrow         
        //   915: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   918: goto            922
        //   921: athrow         
        //   922: dup            
        //   923: pop            
        //   924: checkcast       Lnet/minecraft/util/Tuple;
        //   927: getstatic       dev/nuker/pyro/fc.1:I
        //   930: ifeq            939
        //   933: ldc_w           -1305229050
        //   936: goto            942
        //   939: ldc_w           -14768007
        //   942: ldc_w           -1280869981
        //   945: ixor           
        //   946: lookupswitch {
        //          -1575207312: 939
        //          26521765: 1485
        //          default: 972
        //        }
        //   972: goto            976
        //   975: athrow         
        //   976: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   979: goto            983
        //   982: athrow         
        //   983: checkcast       Ldev/nuker/pyro/f0V;
        //   986: aload           4
        //   988: goto            992
        //   991: athrow         
        //   992: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   995: goto            999
        //   998: athrow         
        //   999: dup            
        //  1000: pop            
        //  1001: checkcast       Lnet/minecraft/util/Tuple;
        //  1004: goto            1008
        //  1007: athrow         
        //  1008: invokevirtual   net/minecraft/util/Tuple.func_76340_b:()Ljava/lang/Object;
        //  1011: goto            1015
        //  1014: athrow         
        //  1015: dup            
        //  1016: ifnonnull       1025
        //  1019: ldc_w           -1606891331
        //  1022: goto            1028
        //  1025: ldc_w           -1606891332
        //  1028: ldc_w           1450924267
        //  1031: ixor           
        //  1032: tableswitch {
        //          -326688596: 1056
        //          -326688595: 1067
        //          default: 1019
        //        }
        //  1056: goto            1060
        //  1059: athrow         
        //  1060: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1063: goto            1067
        //  1066: athrow         
        //  1067: checkcast       Ldev/nuker/pyro/f0w;
        //  1070: getstatic       dev/nuker/pyro/fc.0:I
        //  1073: ifeq            1082
        //  1076: ldc_w           305942264
        //  1079: goto            1085
        //  1082: ldc_w           242150273
        //  1085: ldc_w           2094963207
        //  1088: ixor           
        //  1089: lookupswitch {
        //          1860359423: 1082
        //          1924166022: 1116
        //          default: 1475
        //        }
        //  1116: aload_2        
        //  1117: aload_3        
        //  1118: dconst_1       
        //  1119: aload           4
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: invokevirtual   net/minecraft/util/Tuple.func_76340_b:()Ljava/lang/Object;
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: checkcast       Ljava/lang/Number;
        //  1135: goto            1139
        //  1138: athrow         
        //  1139: invokevirtual   java/lang/Number.intValue:()I
        //  1142: goto            1146
        //  1145: athrow         
        //  1146: i2d            
        //  1147: getstatic       dev/nuker/pyro/fc.c:I
        //  1150: ifge            1159
        //  1153: ldc_w           929244518
        //  1156: goto            1162
        //  1159: ldc_w           545419860
        //  1162: ldc_w           -468647513
        //  1165: ixor           
        //  1166: lookupswitch {
        //          -747494207: 1459
        //          674022318: 1159
        //          default: 1192
        //        }
        //  1192: goto            1196
        //  1195: athrow         
        //  1196: invokevirtual   dev/nuker/pyro/f0Z.c:(DD)Ldev/nuker/pyro/f0Z;
        //  1199: goto            1203
        //  1202: athrow         
        //  1203: goto            1207
        //  1206: athrow         
        //  1207: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;Ldev/nuker/pyro/f0Z;)V
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: aload_0        
        //  1217: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //  1220: getstatic       dev/nuker/pyro/fc.1:I
        //  1223: ifeq            1232
        //  1226: ldc_w           315619438
        //  1229: goto            1235
        //  1232: ldc_w           1022713473
        //  1235: ldc_w           -1419682364
        //  1238: ixor           
        //  1239: lookupswitch {
        //          -1751907515: 1264
        //          -1179736662: 1232
        //          default: 1483
        //        }
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1273: goto            1277
        //  1276: athrow         
        //  1277: astore          6
        //  1279: aload           6
        //  1281: goto            1285
        //  1284: athrow         
        //  1285: invokeinterface java/util/Iterator.hasNext:()Z
        //  1290: goto            1294
        //  1293: athrow         
        //  1294: ifeq            1454
        //  1297: aload           6
        //  1299: goto            1303
        //  1302: athrow         
        //  1303: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1308: goto            1312
        //  1311: athrow         
        //  1312: checkcast       Ldev/nuker/pyro/f0V;
        //  1315: astore          5
        //  1317: getstatic       dev/nuker/pyro/fc.0:I
        //  1320: ifeq            1329
        //  1323: ldc_w           -2045789479
        //  1326: goto            1332
        //  1329: ldc_w           -1459996331
        //  1332: ldc_w           -1028586852
        //  1335: ixor           
        //  1336: lookupswitch {
        //          1153349701: 1329
        //          1783315401: 1364
        //          default: 1477
        //        }
        //  1364: aload           5
        //  1366: aload           4
        //  1368: goto            1372
        //  1371: athrow         
        //  1372: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1375: goto            1379
        //  1378: athrow         
        //  1379: dup            
        //  1380: pop            
        //  1381: checkcast       Lnet/minecraft/util/Tuple;
        //  1384: goto            1388
        //  1387: athrow         
        //  1388: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1391: goto            1395
        //  1394: athrow         
        //  1395: checkcast       Ldev/nuker/pyro/f0V;
        //  1398: if_acmpeq       1407
        //  1401: ldc_w           -1696838435
        //  1404: goto            1410
        //  1407: ldc_w           -1696838438
        //  1410: ldc_w           1491004710
        //  1413: ixor           
        //  1414: tableswitch {
        //          -2080029706: 1436
        //          -2080029705: 1451
        //          default: 1401
        //        }
        //  1436: aload           5
        //  1438: goto            1442
        //  1441: athrow         
        //  1442: invokeinterface dev/nuker/pyro/f0V.1:()V
        //  1447: goto            1451
        //  1450: athrow         
        //  1451: goto            1279
        //  1454: return         
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
        //  1479: aconst_null    
        //  1480: athrow         
        //  1481: aconst_null    
        //  1482: athrow         
        //  1483: aconst_null    
        //  1484: athrow         
        //  1485: aconst_null    
        //  1486: athrow         
        //  1487: pop            
        //  1488: goto            24
        //  1491: pop            
        //  1492: aconst_null    
        //  1493: goto            1487
        //  1496: dup            
        //  1497: ifnull          1487
        //  1500: checkcast       Ljava/lang/Throwable;
        //  1503: athrow         
        //  1504: dup            
        //  1505: ifnull          1491
        //  1508: checkcast       Ljava/lang/Throwable;
        //  1511: athrow         
        //  1512: aconst_null    
        //  1513: athrow         
        //    StackMapTable: 00 E6 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 00 0B 42 01 1C 0F 42 01 1C 08 05 42 01 19 4C 07 00 6D FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 6D 01 5F 07 00 6D 42 07 00 5B 40 07 00 6D 45 07 00 5B 40 01 47 07 00 5B 40 07 00 6D 45 07 00 5B 40 03 FF 00 0C 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 03 03 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 03 FF 00 09 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 A6 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 A6 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 01 FF 00 18 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 98 FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 03 07 00 98 07 00 98 01 FF 00 1E 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 98 42 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 98 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 05 45 07 00 39 FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 9D 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 01 46 07 00 98 FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 01 42 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 01 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 9D FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 9D 45 07 00 5B 00 0B 42 01 1D 4F 07 00 2A FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 2A 01 5C 07 00 2A 42 07 00 5B 40 07 00 2A 47 07 00 5B 40 07 02 10 FD 00 01 00 07 02 10 44 07 00 39 40 07 02 10 47 07 00 5B 40 01 0E 42 01 1F 4D 07 02 10 FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 07 02 10 00 02 07 02 10 01 5E 07 02 10 42 07 00 5B 40 07 02 10 47 07 00 5B 40 07 00 05 4E 07 00 07 FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 07 02 10 00 02 07 00 07 01 5C 07 00 07 FF 00 06 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 00 07 07 02 10 00 01 07 00 5B 40 07 00 07 47 07 00 5B 00 FF 00 02 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 07 02 10 00 00 FF 00 03 00 00 00 01 07 00 5B FF 00 00 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 07 02 10 00 01 07 00 A6 45 07 00 5B 00 F9 00 02 53 07 00 03 FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 01 5D 07 00 03 46 07 00 45 FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 07 00 62 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 03 42 07 00 03 4D 07 00 39 FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 07 02 D3 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 03 42 07 00 03 43 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 07 00 6D 45 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 03 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 03 03 45 07 00 5B 40 07 02 2E 43 07 02 2E 45 07 02 2E FF 00 02 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 02 2E 01 58 07 02 2E 42 07 00 4F 40 07 02 2E 45 07 00 5B 40 07 02 2E FF 00 06 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 01 07 00 5B 40 07 02 2E 45 07 00 5B 40 07 00 05 50 07 02 2E FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 02 2E 01 5D 07 02 2E 42 07 00 5B 40 07 02 2E 45 07 00 5B 40 07 00 05 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 02 2E 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 02 2E 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 FF 00 03 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 FF 00 05 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 03 07 00 07 07 00 05 01 FF 00 1B 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 42 07 00 51 FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 05 FF 00 0E 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 A6 FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 03 07 00 07 07 00 A6 01 FF 00 1E 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 A6 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 07 02 2E 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 07 00 05 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 07 02 EB 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 01 FF 00 0C 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 07 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 01 FF 00 1D 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 42 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 04 07 00 07 07 00 A6 07 00 D8 07 00 6D 42 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 04 07 00 07 07 00 A6 07 00 D8 07 00 6D 47 07 00 5B 00 4F 07 00 2A FF 00 02 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 2A 01 5C 07 00 2A 42 07 00 53 40 07 00 2A 47 07 00 5B 40 07 02 10 FD 00 01 00 07 02 10 44 07 00 5B 40 07 02 10 47 07 00 5B 40 01 47 07 00 5B 40 07 02 10 47 07 00 5B 40 07 00 05 FF 00 10 00 07 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 07 00 07 07 02 10 00 00 42 01 1F 46 07 00 49 FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 07 00 07 07 02 10 00 02 07 00 07 07 02 2E 45 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 07 00 07 07 02 10 00 02 07 00 07 07 00 05 47 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 07 00 07 07 02 10 00 02 07 00 07 07 02 2E 45 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 07 00 07 07 02 10 00 02 07 00 07 07 00 05 05 05 42 01 19 44 07 00 41 40 07 00 07 47 07 00 5B 00 F8 00 02 40 07 00 2A 01 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 06 07 00 07 07 00 A6 07 00 D8 07 00 6D 03 03 FF 00 01 00 06 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 07 02 10 00 01 07 02 10 F9 00 01 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 03 07 00 03 41 07 00 6D FD 00 01 00 07 02 10 41 07 00 07 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 02 07 00 07 07 00 A6 FD 00 01 07 00 07 07 02 10 FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 02 07 00 98 07 00 98 01 FF 00 01 00 05 07 00 03 07 00 A6 07 00 D8 07 00 6D 07 02 2E 00 01 07 00 2A 41 07 02 2E FF 00 01 00 04 07 00 03 07 00 A6 07 00 D8 07 00 6D 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1496   1504   Any
        //  1496   1504   1496   1504   Ljava/lang/RuntimeException;
        //  1512   1514   3      8      Ljava/lang/IllegalArgumentException;
        //  211    218    218    219    Any
        //  211    218    3      8      Any
        //  211    218    211    212    Any
        //  212    218    3      8      Ljava/lang/RuntimeException;
        //  211    218    218    219    Any
        //  227    234    234    235    Any
        //  228    234    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  228    234    227    228    Ljava/lang/NumberFormatException;
        //  228    234    234    235    Ljava/lang/RuntimeException;
        //  228    234    227    228    Any
        //  291    297    297    298    Any
        //  291    297    297    298    Any
        //  291    297    297    298    Any
        //  291    297    297    298    Any
        //  291    297    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  302    308    308    309    Any
        //  302    308    308    309    Ljava/lang/EnumConstantNotPresentException;
        //  302    308    3      8      Any
        //  302    308    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  302    308    308    309    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  371    378    378    379    Any
        //  371    378    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  371    378    371    372    Ljava/lang/NumberFormatException;
        //  371    378    378    379    Ljava/lang/ClassCastException;
        //  372    378    371    372    Any
        //  385    392    392    393    Any
        //  386    392    3      8      Ljava/lang/NegativeArraySizeException;
        //  385    392    385    386    Ljava/lang/NullPointerException;
        //  385    392    385    386    Ljava/lang/StringIndexOutOfBoundsException;
        //  385    392    3      8      Ljava/lang/ClassCastException;
        //  404    411    411    412    Any
        //  405    411    411    412    Any
        //  405    411    404    405    Any
        //  405    411    411    412    Any
        //  404    411    3      8      Any
        //  416    422    422    423    Any
        //  416    422    422    423    Any
        //  416    422    422    423    Any
        //  416    422    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  416    422    3      8      Any
        //  519    528    528    529    Any
        //  520    528    519    520    Any
        //  520    528    528    529    Any
        //  520    528    528    529    Ljava/lang/ArithmeticException;
        //  519    528    3      8      Ljava/lang/IllegalArgumentException;
        //  536    545    545    546    Any
        //  536    545    3      8      Ljava/lang/ArithmeticException;
        //  536    545    536    537    Ljava/lang/ArithmeticException;
        //  537    545    536    537    Ljava/lang/IllegalStateException;
        //  537    545    536    537    Ljava/util/ConcurrentModificationException;
        //  647    656    656    657    Any
        //  647    656    3      8      Ljava/lang/ArithmeticException;
        //  647    656    647    648    Any
        //  647    656    647    648    Ljava/lang/IllegalArgumentException;
        //  647    656    3      8      Any
        //  711    720    720    721    Any
        //  711    720    711    712    Any
        //  711    720    720    721    Any
        //  712    720    3      8      Any
        //  712    720    711    712    Any
        //  729    735    735    736    Any
        //  729    735    3      8      Any
        //  729    735    735    736    Ljava/lang/AssertionError;
        //  729    735    3      8      Any
        //  729    735    3      8      Ljava/lang/IllegalArgumentException;
        //  799    806    806    807    Any
        //  799    806    799    800    Ljava/lang/ArithmeticException;
        //  800    806    3      8      Ljava/lang/ClassCastException;
        //  799    806    806    807    Ljava/lang/AssertionError;
        //  800    806    806    807    Ljava/lang/ArithmeticException;
        //  824    831    831    832    Any
        //  824    831    824    825    Ljava/lang/RuntimeException;
        //  825    831    831    832    Any
        //  825    831    3      8      Any
        //  824    831    3      8      Any
        //  839    846    846    847    Any
        //  840    846    839    840    Any
        //  840    846    846    847    Any
        //  839    846    839    840    Any
        //  840    846    839    840    Ljava/lang/AssertionError;
        //  851    857    857    858    Any
        //  851    857    3      8      Any
        //  851    857    3      8      Any
        //  851    857    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  851    857    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  899    906    906    907    Any
        //  900    906    3      8      Any
        //  900    906    899    900    Ljava/lang/IllegalArgumentException;
        //  900    906    3      8      Any
        //  899    906    906    907    Ljava/lang/NullPointerException;
        //  914    921    921    922    Any
        //  915    921    921    922    Any
        //  914    921    914    915    Any
        //  914    921    914    915    Any
        //  914    921    914    915    Any
        //  975    982    982    983    Any
        //  976    982    982    983    Ljava/lang/IllegalStateException;
        //  976    982    975    976    Any
        //  976    982    982    983    Ljava/lang/StringIndexOutOfBoundsException;
        //  976    982    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  992    998    998    999    Any
        //  992    998    998    999    Ljava/lang/RuntimeException;
        //  992    998    3      8      Ljava/lang/UnsupportedOperationException;
        //  992    998    998    999    Any
        //  992    998    998    999    Any
        //  1008   1014   1014   1015   Any
        //  1008   1014   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1008   1014   3      8      Any
        //  1008   1014   1014   1015   Ljava/lang/AssertionError;
        //  1008   1014   1014   1015   Ljava/lang/IllegalStateException;
        //  1059   1066   1066   1067   Any
        //  1060   1066   1066   1067   Ljava/lang/NumberFormatException;
        //  1060   1066   3      8      Any
        //  1060   1066   1059   1060   Ljava/lang/NumberFormatException;
        //  1059   1066   3      8      Any
        //  1125   1131   1131   1132   Any
        //  1125   1131   3      8      Ljava/lang/NegativeArraySizeException;
        //  1125   1131   1131   1132   Any
        //  1125   1131   1131   1132   Any
        //  1125   1131   1131   1132   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1138   1145   1145   1146   Any
        //  1138   1145   3      8      Ljava/lang/AssertionError;
        //  1139   1145   1138   1139   Any
        //  1139   1145   1145   1146   Ljava/lang/NumberFormatException;
        //  1138   1145   1145   1146   Any
        //  1195   1202   1202   1203   Any
        //  1196   1202   3      8      Any
        //  1195   1202   1202   1203   Ljava/lang/EnumConstantNotPresentException;
        //  1195   1202   1195   1196   Any
        //  1196   1202   3      8      Ljava/lang/ClassCastException;
        //  1206   1215   1215   1216   Any
        //  1206   1215   1215   1216   Ljava/util/ConcurrentModificationException;
        //  1207   1215   1206   1207   Any
        //  1207   1215   1215   1216   Ljava/lang/NegativeArraySizeException;
        //  1206   1215   1215   1216   Any
        //  1267   1276   1276   1277   Any
        //  1268   1276   3      8      Any
        //  1267   1276   1276   1277   Ljava/lang/RuntimeException;
        //  1267   1276   1267   1268   Ljava/util/ConcurrentModificationException;
        //  1268   1276   1276   1277   Ljava/lang/UnsupportedOperationException;
        //  1284   1293   1293   1294   Any
        //  1285   1293   1293   1294   Ljava/lang/EnumConstantNotPresentException;
        //  1284   1293   1293   1294   Ljava/lang/StringIndexOutOfBoundsException;
        //  1284   1293   1284   1285   Any
        //  1284   1293   1284   1285   Ljava/lang/AssertionError;
        //  1302   1311   1311   1312   Any
        //  1302   1311   1302   1303   Any
        //  1302   1311   1311   1312   Any
        //  1303   1311   1311   1312   Ljava/util/ConcurrentModificationException;
        //  1302   1311   3      8      Ljava/lang/NullPointerException;
        //  1371   1378   1378   1379   Any
        //  1371   1378   3      8      Any
        //  1371   1378   1378   1379   Ljava/lang/UnsupportedOperationException;
        //  1372   1378   1371   1372   Ljava/lang/IndexOutOfBoundsException;
        //  1372   1378   3      8      Ljava/util/NoSuchElementException;
        //  1387   1394   1394   1395   Any
        //  1388   1394   1387   1388   Any
        //  1388   1394   1387   1388   Ljava/lang/EnumConstantNotPresentException;
        //  1388   1394   1387   1388   Ljava/util/ConcurrentModificationException;
        //  1388   1394   1387   1388   Any
        //  1441   1450   1450   1451   Any
        //  1441   1450   1441   1442   Ljava/lang/UnsupportedOperationException;
        //  1441   1450   1450   1451   Any
        //  1441   1450   1450   1451   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1441   1450   1450   1451   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0298 (coming from #0297).
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
    
    @Override
    public void c(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1290
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1282
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1274
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: aload_0        
        //    30: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //    33: dup            
        //    34: ifnonnull       48
        //    37: goto            41
        //    40: athrow         
        //    41: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    44: goto            48
        //    47: athrow         
        //    48: getstatic       dev/nuker/pyro/fc.0:I
        //    51: ifeq            60
        //    54: ldc_w           -1066325825
        //    57: goto            63
        //    60: ldc_w           -1955589646
        //    63: ldc_w           -488670329
        //    66: ixor           
        //    67: lookupswitch {
        //          581849912: 60
        //          1773103733: 92
        //          default: 1263
        //        }
        //    92: aload_1        
        //    93: dload_2        
        //    94: dload           4
        //    96: aload           6
        //    98: goto            102
        //   101: athrow         
        //   102: invokeinterface dev/nuker/pyro/f0V.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   107: goto            111
        //   110: athrow         
        //   111: ifeq            170
        //   114: aload_0        
        //   115: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0V;
        //   118: dup            
        //   119: ifnonnull       133
        //   122: goto            126
        //   125: athrow         
        //   126: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   129: goto            133
        //   132: athrow         
        //   133: aload_0        
        //   134: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   137: dup            
        //   138: ifnonnull       152
        //   141: goto            145
        //   144: athrow         
        //   145: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   148: goto            152
        //   151: athrow         
        //   152: dload_2        
        //   153: dload           4
        //   155: aload           6
        //   157: goto            161
        //   160: athrow         
        //   161: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   166: goto            170
        //   169: athrow         
        //   170: aload_0        
        //   171: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/fw;
        //   174: goto            178
        //   177: athrow         
        //   178: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   181: goto            185
        //   184: athrow         
        //   185: dup            
        //   186: pop            
        //   187: checkcast       Ljava/lang/Boolean;
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   197: goto            201
        //   200: athrow         
        //   201: ifeq            1228
        //   204: aload_0        
        //   205: getfield        dev/nuker/pyro/f0M.c:Ldev/nuker/pyro/f0w;
        //   208: dup            
        //   209: ifnonnull       223
        //   212: goto            216
        //   215: athrow         
        //   216: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   219: goto            223
        //   222: athrow         
        //   223: goto            227
        //   226: athrow         
        //   227: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   230: goto            234
        //   233: athrow         
        //   234: istore          7
        //   236: iconst_0       
        //   237: getstatic       dev/nuker/pyro/fc.0:I
        //   240: ifeq            249
        //   243: ldc_w           -340577019
        //   246: goto            252
        //   249: ldc_w           -520953736
        //   252: ldc_w           -225617906
        //   255: ixor           
        //   256: lookupswitch {
        //          310360182: 284
        //          423521547: 249
        //          default: 1241
        //        }
        //   284: istore          8
        //   286: aload_0        
        //   287: getstatic       dev/nuker/pyro/fc.c:I
        //   290: ifge            299
        //   293: ldc_w           -2018431145
        //   296: goto            302
        //   299: ldc_w           984192093
        //   302: ldc_w           1945990640
        //   305: ixor           
        //   306: lookupswitch {
        //          -196322649: 299
        //          1230299565: 332
        //          default: 1255
        //        }
        //   332: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   335: checkcast       Ljava/util/Collection;
        //   338: getstatic       dev/nuker/pyro/fc.c:I
        //   341: ifge            350
        //   344: ldc_w           -845221823
        //   347: goto            353
        //   350: ldc_w           1208601564
        //   353: ldc_w           -40493125
        //   356: ixor           
        //   357: lookupswitch {
        //          -1247816601: 384
        //          805892090: 350
        //          default: 1243
        //        }
        //   384: goto            388
        //   387: athrow         
        //   388: invokeinterface java/util/Collection.size:()I
        //   393: goto            397
        //   396: athrow         
        //   397: getstatic       dev/nuker/pyro/fc.c:I
        //   400: ifge            409
        //   403: ldc_w           22804110
        //   406: goto            412
        //   409: ldc_w           -1296036814
        //   412: ldc_w           1558198832
        //   415: ixor           
        //   416: lookupswitch {
        //          375403667: 409
        //          1572588734: 1261
        //          default: 444
        //        }
        //   444: istore          9
        //   446: iload           8
        //   448: iload           9
        //   450: if_icmpge       1228
        //   453: aload_0        
        //   454: getfield        dev/nuker/pyro/f0M.0:Ljava/util/List;
        //   457: getstatic       dev/nuker/pyro/fc.0:I
        //   460: ifeq            469
        //   463: ldc_w           -2030206522
        //   466: goto            472
        //   469: ldc_w           -1337649798
        //   472: ldc_w           -687572508
        //   475: ixor           
        //   476: lookupswitch {
        //          -2030857013: 469
        //          1375336482: 1247
        //          default: 504
        //        }
        //   504: iload           8
        //   506: goto            510
        //   509: athrow         
        //   510: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   515: goto            519
        //   518: athrow         
        //   519: checkcast       Ldev/nuker/pyro/f0V;
        //   522: astore          10
        //   524: aload_0        
        //   525: getfield        dev/nuker/pyro/f0M.c:Ljava/util/List;
        //   528: iload           8
        //   530: goto            534
        //   533: athrow         
        //   534: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   539: goto            543
        //   542: athrow         
        //   543: dup            
        //   544: ifnonnull       558
        //   547: goto            551
        //   550: athrow         
        //   551: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   554: goto            558
        //   557: athrow         
        //   558: checkcast       Ldev/nuker/pyro/f0w;
        //   561: getstatic       dev/nuker/pyro/fc.0:I
        //   564: ifeq            573
        //   567: ldc_w           96839271
        //   570: goto            576
        //   573: ldc_w           1430615802
        //   576: ldc_w           -930483243
        //   579: ixor           
        //   580: lookupswitch {
        //          -1647540945: 608
        //          -850635342: 573
        //          default: 1237
        //        }
        //   608: astore          11
        //   610: getstatic       dev/nuker/pyro/fc.0:I
        //   613: ifeq            622
        //   616: ldc_w           1244223109
        //   619: goto            625
        //   622: ldc_w           -1133796960
        //   625: ldc_w           780625330
        //   628: ixor           
        //   629: lookupswitch {
        //          -1020449250: 622
        //          1689137975: 1231
        //          default: 656
        //        }
        //   656: aload           10
        //   658: aload_1        
        //   659: getstatic       dev/nuker/pyro/fc.1:I
        //   662: ifeq            671
        //   665: ldc_w           809655406
        //   668: goto            674
        //   671: ldc_w           -1817217522
        //   674: ldc_w           1328967354
        //   677: ixor           
        //   678: lookupswitch {
        //          -593946444: 704
        //          2138321620: 671
        //          default: 1251
        //        }
        //   704: dload_2        
        //   705: getstatic       dev/nuker/pyro/fc.c:I
        //   708: ifge            717
        //   711: ldc_w           -874148103
        //   714: goto            720
        //   717: ldc_w           -1535378297
        //   720: ldc_w           -361760192
        //   723: ixor           
        //   724: lookupswitch {
        //          -972806255: 717
        //          562721977: 1233
        //          default: 752
        //        }
        //   752: dload           4
        //   754: iload           7
        //   756: i2d            
        //   757: dsub           
        //   758: getstatic       dev/nuker/pyro/fc.0:I
        //   761: ifeq            770
        //   764: ldc_w           1853509224
        //   767: goto            773
        //   770: ldc_w           -954015238
        //   773: ldc_w           1125167428
        //   776: ixor           
        //   777: lookupswitch {
        //          -2077077314: 804
        //          761986860: 770
        //          default: 1245
        //        }
        //   804: aload           6
        //   806: getstatic       dev/nuker/pyro/fc.1:I
        //   809: ifeq            818
        //   812: ldc_w           718216593
        //   815: goto            821
        //   818: ldc_w           -1319781354
        //   821: ldc_w           -1746431543
        //   824: ixor           
        //   825: lookupswitch {
        //          -1121416104: 1257
        //          2109336087: 818
        //          default: 852
        //        }
        //   852: goto            856
        //   855: athrow         
        //   856: invokeinterface dev/nuker/pyro/f0V.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   861: goto            865
        //   864: athrow         
        //   865: ifeq            1070
        //   868: getstatic       dev/nuker/pyro/fc.1:I
        //   871: ifeq            880
        //   874: ldc_w           -1960718845
        //   877: goto            883
        //   880: ldc_w           -2147305666
        //   883: ldc_w           1317750236
        //   886: ixor           
        //   887: lookupswitch {
        //          -978678817: 880
        //          -829820190: 912
        //          default: 1259
        //        }
        //   912: goto            916
        //   915: athrow         
        //   916: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   919: goto            923
        //   922: athrow         
        //   923: fconst_1       
        //   924: iload           7
        //   926: i2f            
        //   927: fconst_0       
        //   928: goto            932
        //   931: athrow         
        //   932: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   935: goto            939
        //   938: athrow         
        //   939: aload           10
        //   941: getstatic       dev/nuker/pyro/fc.c:I
        //   944: ifge            953
        //   947: ldc_w           -1209673104
        //   950: goto            956
        //   953: ldc_w           -305054831
        //   956: ldc_w           705148919
        //   959: ixor           
        //   960: lookupswitch {
        //          -1646105209: 953
        //          -942240666: 988
        //          default: 1239
        //        }
        //   988: aload           11
        //   990: dload_2        
        //   991: dload           4
        //   993: iload           7
        //   995: i2d            
        //   996: dsub           
        //   997: getstatic       dev/nuker/pyro/fc.1:I
        //  1000: ifeq            1009
        //  1003: ldc_w           1942238623
        //  1006: goto            1012
        //  1009: ldc_w           -907559696
        //  1012: ldc_w           994329970
        //  1015: ixor           
        //  1016: lookupswitch {
        //          -224134782: 1044
        //          1216377069: 1009
        //          default: 1229
        //        }
        //  1044: aload           6
        //  1046: goto            1050
        //  1049: athrow         
        //  1050: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: iload           7
        //  1072: getstatic       dev/nuker/pyro/fc.1:I
        //  1075: ifeq            1084
        //  1078: ldc_w           1264635863
        //  1081: goto            1087
        //  1084: ldc_w           2076241766
        //  1087: ldc_w           -61699973
        //  1090: ixor           
        //  1091: lookupswitch {
        //          -2020448483: 1116
        //          -1221441620: 1084
        //          default: 1249
        //        }
        //  1116: aload           11
        //  1118: getstatic       dev/nuker/pyro/fc.0:I
        //  1121: ifeq            1130
        //  1124: ldc_w           -1192726641
        //  1127: goto            1133
        //  1130: ldc_w           1058542142
        //  1133: ldc_w           -568398499
        //  1136: ixor           
        //  1137: lookupswitch {
        //          -330553295: 1130
        //          1727431378: 1235
        //          default: 1164
        //        }
        //  1164: goto            1168
        //  1167: athrow         
        //  1168: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1171: goto            1175
        //  1174: athrow         
        //  1175: iadd           
        //  1176: getstatic       dev/nuker/pyro/fc.0:I
        //  1179: ifeq            1188
        //  1182: ldc_w           -1484701978
        //  1185: goto            1191
        //  1188: ldc_w           1699414871
        //  1191: ldc_w           646003375
        //  1194: ixor           
        //  1195: lookupswitch {
        //          -2130705335: 1253
        //          1500253913: 1188
        //          default: 1220
        //        }
        //  1220: istore          7
        //  1222: iinc            8, 1
        //  1225: goto            446
        //  1228: return         
        //  1229: aconst_null    
        //  1230: athrow         
        //  1231: aconst_null    
        //  1232: athrow         
        //  1233: aconst_null    
        //  1234: athrow         
        //  1235: aconst_null    
        //  1236: athrow         
        //  1237: aconst_null    
        //  1238: athrow         
        //  1239: aconst_null    
        //  1240: athrow         
        //  1241: aconst_null    
        //  1242: athrow         
        //  1243: aconst_null    
        //  1244: athrow         
        //  1245: aconst_null    
        //  1246: athrow         
        //  1247: aconst_null    
        //  1248: athrow         
        //  1249: aconst_null    
        //  1250: athrow         
        //  1251: aconst_null    
        //  1252: athrow         
        //  1253: aconst_null    
        //  1254: athrow         
        //  1255: aconst_null    
        //  1256: athrow         
        //  1257: aconst_null    
        //  1258: athrow         
        //  1259: aconst_null    
        //  1260: athrow         
        //  1261: aconst_null    
        //  1262: athrow         
        //  1263: aconst_null    
        //  1264: athrow         
        //  1265: pop            
        //  1266: goto            24
        //  1269: pop            
        //  1270: aconst_null    
        //  1271: goto            1265
        //  1274: dup            
        //  1275: ifnull          1265
        //  1278: checkcast       Ljava/lang/Throwable;
        //  1281: athrow         
        //  1282: dup            
        //  1283: ifnull          1269
        //  1286: checkcast       Ljava/lang/Throwable;
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
        //    StackMapTable: 00 9F 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 4F 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 4B 07 00 07 FF 00 02 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 01 5C 07 00 07 FF 00 08 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 4D 07 00 5B 40 07 00 07 45 07 00 5B 40 07 00 07 4A 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 45 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 02 07 00 07 07 00 A6 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 00 46 07 00 5B 40 07 00 98 45 07 00 5B 40 07 00 05 47 07 00 5B 40 07 00 9D 45 07 00 5B 40 01 4D 07 00 3B 40 07 00 A6 45 07 00 5B 40 07 00 A6 42 07 00 5B 40 07 00 A6 45 07 00 5B 40 01 FF 00 0E 00 06 07 00 03 07 00 A6 03 03 07 00 D8 01 00 01 01 FF 00 02 00 06 07 00 03 07 00 A6 03 03 07 00 D8 01 00 02 01 01 5F 01 FF 00 0E 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 03 01 5D 07 00 03 51 07 00 AB FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 07 00 AB 01 5E 07 00 AB FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB 47 07 00 5B 40 01 4B 01 FF 00 02 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 02 01 01 5F 01 FC 00 01 01 56 07 00 2A FF 00 02 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 5F 07 00 2A 44 07 00 57 FF 00 00 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FF 00 0D 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 01 07 00 5B FF 00 00 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 2A 01 47 07 00 5B 40 07 00 05 FF 00 06 00 00 00 01 07 00 5B FF 00 00 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 01 07 00 05 45 07 00 5B 40 07 00 05 4E 07 00 A6 FF 00 02 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 02 07 00 A6 01 5F 07 00 A6 FC 00 0D 07 00 A6 42 01 1E FF 00 0E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 01 FF 00 1D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 FF 00 0C 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 01 FF 00 1F 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 11 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 01 FF 00 1E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 0D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 06 07 00 07 07 00 A6 03 03 07 00 D8 01 FF 00 1E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 42 07 00 3B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 40 01 0E 42 01 1C 42 07 00 5B 00 45 07 00 5B 00 47 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 02 02 02 45 07 00 5B 00 4D 07 00 07 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 01 5F 07 00 07 FF 00 14 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 01 FF 00 1F 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 44 07 00 39 FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 47 07 00 5B 00 42 07 00 5B 00 45 07 00 5B 00 4D 01 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 5C 01 FF 00 0D 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 01 07 00 A6 01 FF 00 1E 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 42 07 00 39 FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 45 07 00 5B FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 4C 01 FF 00 02 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 01 5C 01 FF 00 07 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 00 FF 00 00 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 01 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 03 07 00 07 07 00 A6 03 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 01 07 00 A6 FF 00 01 00 09 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 00 01 07 00 A6 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 07 00 07 FF 00 01 00 06 07 00 03 07 00 A6 03 03 07 00 D8 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 AB FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 04 07 00 07 07 00 A6 03 03 FF 00 01 00 08 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 00 01 07 00 2A FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 01 01 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 02 07 00 07 07 00 A6 41 01 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 A6 03 03 07 00 D8 01 01 01 07 00 07 07 00 A6 00 05 07 00 07 07 00 A6 03 03 07 00 D8 01 FF 00 01 00 07 07 00 03 07 00 A6 03 03 07 00 D8 01 01 00 01 01 FF 00 01 00 05 07 00 03 07 00 A6 03 03 07 00 D8 00 01 07 00 07 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1274   1282   Ljava/lang/NegativeArraySizeException;
        //  1274   1282   1274   1282   Any
        //  1290   1292   3      8      Any
        //  40     47     47     48     Any
        //  40     47     3      8      Any
        //  41     47     3      8      Ljava/lang/IllegalArgumentException;
        //  40     47     40     41     Any
        //  40     47     47     48     Any
        //  102    110    110    111    Any
        //  102    110    3      8      Any
        //  102    110    110    111    Ljava/lang/NullPointerException;
        //  102    110    3      8      Ljava/lang/ClassCastException;
        //  102    110    3      8      Any
        //  125    132    132    133    Any
        //  126    132    132    133    Ljava/lang/AssertionError;
        //  125    132    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  126    132    125    126    Any
        //  126    132    3      8      Any
        //  144    151    151    152    Any
        //  145    151    3      8      Any
        //  145    151    144    145    Any
        //  144    151    3      8      Any
        //  144    151    3      8      Any
        //  161    169    169    170    Any
        //  161    169    169    170    Any
        //  161    169    169    170    Any
        //  161    169    169    170    Ljava/lang/StringIndexOutOfBoundsException;
        //  161    169    3      8      Any
        //  177    184    184    185    Any
        //  177    184    3      8      Any
        //  177    184    3      8      Ljava/lang/RuntimeException;
        //  177    184    3      8      Ljava/lang/ArithmeticException;
        //  178    184    177    178    Any
        //  193    200    200    201    Any
        //  193    200    193    194    Any
        //  193    200    193    194    Any
        //  193    200    200    201    Any
        //  194    200    193    194    Any
        //  215    222    222    223    Any
        //  216    222    222    223    Any
        //  215    222    3      8      Any
        //  215    222    222    223    Ljava/lang/StringIndexOutOfBoundsException;
        //  215    222    215    216    Ljava/util/NoSuchElementException;
        //  226    233    233    234    Any
        //  227    233    233    234    Any
        //  227    233    226    227    Any
        //  227    233    226    227    Ljava/lang/ClassCastException;
        //  227    233    233    234    Any
        //  388    396    396    397    Any
        //  388    396    396    397    Any
        //  388    396    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  388    396    396    397    Any
        //  388    396    396    397    Ljava/lang/NegativeArraySizeException;
        //  509    518    518    519    Any
        //  509    518    3      8      Any
        //  510    518    3      8      Ljava/lang/ClassCastException;
        //  510    518    518    519    Any
        //  509    518    509    510    Ljava/lang/AssertionError;
        //  533    542    542    543    Any
        //  534    542    542    543    Any
        //  533    542    533    534    Any
        //  533    542    533    534    Any
        //  533    542    3      8      Any
        //  551    557    557    558    Any
        //  551    557    557    558    Any
        //  551    557    557    558    Ljava/util/NoSuchElementException;
        //  551    557    3      8      Any
        //  551    557    557    558    Any
        //  855    864    864    865    Any
        //  856    864    864    865    Any
        //  855    864    3      8      Ljava/lang/NumberFormatException;
        //  855    864    864    865    Any
        //  856    864    855    856    Ljava/util/NoSuchElementException;
        //  915    922    922    923    Any
        //  916    922    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  915    922    915    916    Any
        //  916    922    915    916    Ljava/lang/IllegalStateException;
        //  915    922    922    923    Any
        //  931    938    938    939    Any
        //  931    938    938    939    Any
        //  932    938    938    939    Any
        //  931    938    3      8      Ljava/lang/IllegalArgumentException;
        //  932    938    931    932    Any
        //  1049   1058   1058   1059   Any
        //  1049   1058   1049   1050   Ljava/lang/ClassCastException;
        //  1050   1058   1049   1050   Ljava/lang/ClassCastException;
        //  1050   1058   1058   1059   Any
        //  1049   1058   1049   1050   Ljava/lang/IllegalStateException;
        //  1062   1069   1069   1070   Any
        //  1062   1069   1062   1063   Any
        //  1062   1069   1062   1063   Any
        //  1063   1069   3      8      Any
        //  1063   1069   1069   1070   Any
        //  1167   1174   1174   1175   Any
        //  1168   1174   3      8      Any
        //  1168   1174   1174   1175   Ljava/lang/NegativeArraySizeException;
        //  1168   1174   3      8      Any
        //  1167   1174   1167   1168   Ljava/lang/RuntimeException;
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
