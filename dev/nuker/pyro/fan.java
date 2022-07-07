// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.Vec3d;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.function.Consumer;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

public class faN extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    @NotNull
    public f0b c;
    @NotNull
    public f0b 0;
    @Nullable
    public BlockPos c;
    
    @NotNull
    public f0b 0() {
        return fbS.1x(this, 1204511178);
    }
    
    public boolean c(@NotNull final IBlockState blockState, @NotNull final BlockPos blockPos, @NotNull final Block block) {
        return fbS.70(this, 796453117, blockState, blockPos, block);
    }
    
    @NotNull
    public f0a 2() {
        return fbS.A(this, 166449582);
    }
    
    @NotNull
    public EnumFacing c() {
        return fbS.7n(this, 91236385);
    }
    
    @NotNull
    public f0a 4() {
        return fbS.H(this, 1420325093);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3i p0) {
        public class faM implements Consumer
        {
            public faN c;
            
            @Override
            public void accept(final Object o) {
                fbS.2O(this, 933368250, o);
            }
            
            public faM(final faN c) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.c < 0) {
                            n = 485901474;
                            break Label_0015;
                        }
                        n = -614628954;
                    }
                    switch (n ^ 0x2D108C67) {
                        case -1822282536: {
                            continue;
                        }
                        default: {
                            this.c = c;
                        }
                        case 837208261: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            public void c(final Boolean b) {
                fbS.3w(this, 1377568723, b);
            }
            
            static {
                throw t;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2011
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2003
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1995
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //    34: goto            38
        //    37: athrow         
        //    38: ifeq            42
        //    41: return         
        //    42: aload_1        
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    50: goto            54
        //    53: athrow         
        //    54: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    57: if_acmpeq       61
        //    60: return         
        //    61: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //    64: dup            
        //    65: pop            
        //    66: getstatic       dev/nuker/pyro/fc.c:I
        //    69: ifge            77
        //    72: ldc             -566911908
        //    74: goto            79
        //    77: ldc             1877211911
        //    79: ldc             656511303
        //    81: ixor           
        //    82: lookupswitch {
        //          -116126437: 77
        //          1220700736: 108
        //          default: 1950
        //        }
        //   108: goto            112
        //   111: athrow         
        //   112: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   115: goto            119
        //   118: athrow         
        //   119: ifnull          127
        //   122: ldc             -1595532918
        //   124: goto            129
        //   127: ldc             -1595532917
        //   129: ldc             -1381305644
        //   131: ixor           
        //   132: tableswitch {
        //          446289596: 156
        //          446289597: 193
        //          default: 122
        //        }
        //   156: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   159: dup            
        //   160: pop            
        //   161: goto            165
        //   164: athrow         
        //   165: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   168: goto            172
        //   171: athrow         
        //   172: aload_0        
        //   173: checkcast       Ldev/nuker/pyro/faN;
        //   176: goto            180
        //   179: athrow         
        //   180: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   183: goto            187
        //   186: athrow         
        //   187: iconst_1       
        //   188: ixor           
        //   189: ifeq            193
        //   192: return         
        //   193: getstatic       dev/nuker/pyro/fc.c:I
        //   196: ifge            204
        //   199: ldc             -1645668534
        //   201: goto            206
        //   204: ldc             -1233473749
        //   206: ldc             -1446193633
        //   208: ixor           
        //   209: lookupswitch {
        //          700590133: 204
        //          874889557: 1942
        //          default: 236
        //        }
        //   236: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   239: dup            
        //   240: pop            
        //   241: goto            245
        //   244: athrow         
        //   245: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   248: goto            252
        //   251: athrow         
        //   252: aload_0        
        //   253: checkcast       Ldev/nuker/pyro/faN;
        //   256: goto            260
        //   259: athrow         
        //   260: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   263: goto            267
        //   266: athrow         
        //   267: ifeq            275
        //   270: ldc             -2083332241
        //   272: goto            277
        //   275: ldc             -2083332242
        //   277: ldc             1469164055
        //   279: ixor           
        //   280: tableswitch {
        //          -1467553040: 304
        //          -1467553039: 388
        //          default: 270
        //        }
        //   304: aload_0        
        //   305: getstatic       dev/nuker/pyro/fc.1:I
        //   308: ifeq            316
        //   311: ldc             -1201137494
        //   313: goto            318
        //   316: ldc             944124466
        //   318: ldc             2098270951
        //   320: ixor           
        //   321: lookupswitch {
        //          -981923251: 316
        //          1163337941: 348
        //          default: 1956
        //        }
        //   348: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/util/math/BlockPos;
        //   351: ifnull          388
        //   354: aload_0        
        //   355: aload_1        
        //   356: aload_0        
        //   357: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/util/math/BlockPos;
        //   360: dup            
        //   361: ifnonnull       375
        //   364: goto            368
        //   367: athrow         
        //   368: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   371: goto            375
        //   374: athrow         
        //   375: goto            379
        //   378: athrow         
        //   379: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f3i;Lnet/minecraft/util/math/BlockPos;)Z
        //   382: goto            386
        //   385: athrow         
        //   386: pop            
        //   387: return         
        //   388: getstatic       dev/nuker/pyro/fc.0:I
        //   391: ifeq            399
        //   394: ldc             -545684412
        //   396: goto            401
        //   399: ldc             -2098458197
        //   401: ldc             -1408861500
        //   403: ixor           
        //   404: lookupswitch {
        //          723525269: 399
        //          1937768064: 1980
        //          default: 432
        //        }
        //   432: aload_0        
        //   433: goto            437
        //   436: athrow         
        //   437: invokevirtual   dev/nuker/pyro/faN.c:()Lnet/minecraft/util/EnumFacing;
        //   440: goto            444
        //   443: athrow         
        //   444: astore_2       
        //   445: aload_2        
        //   446: ifnull          1933
        //   449: new             Lnet/minecraft/util/math/BlockPos;
        //   452: dup            
        //   453: aload_0        
        //   454: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //   457: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   460: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   463: goto            467
        //   466: athrow         
        //   467: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   470: goto            474
        //   473: athrow         
        //   474: aload_0        
        //   475: getstatic       dev/nuker/pyro/fc.c:I
        //   478: ifge            486
        //   481: ldc             -1894690632
        //   483: goto            488
        //   486: ldc             -625916022
        //   488: ldc             -284068372
        //   490: ixor           
        //   491: lookupswitch {
        //          899691110: 516
        //          1610622292: 486
        //          default: 1964
        //        }
        //   516: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //   519: getstatic       dev/nuker/pyro/fc.1:I
        //   522: ifeq            530
        //   525: ldc             1764173023
        //   527: goto            532
        //   530: ldc             -472547703
        //   532: ldc             -1722751025
        //   534: ixor           
        //   535: lookupswitch {
        //          -1917309037: 530
        //          -260586736: 1952
        //          default: 560
        //        }
        //   560: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   563: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   566: goto            570
        //   569: athrow         
        //   570: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   573: goto            577
        //   576: athrow         
        //   577: aload_0        
        //   578: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //   581: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   584: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   587: getstatic       dev/nuker/pyro/fc.0:I
        //   590: ifeq            598
        //   593: ldc             1257936270
        //   595: goto            600
        //   598: ldc             -1151783224
        //   600: ldc             -506178870
        //   602: ixor           
        //   603: lookupswitch {
        //          -1422997692: 1984
        //          -766475196: 598
        //          default: 628
        //        }
        //   628: goto            632
        //   631: athrow         
        //   632: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   635: goto            639
        //   638: athrow         
        //   639: getstatic       dev/nuker/pyro/fc.0:I
        //   642: ifeq            650
        //   645: ldc             -532404604
        //   647: goto            652
        //   650: ldc             1818565974
        //   652: ldc             2010009180
        //   654: ixor           
        //   655: lookupswitch {
        //          -1752536872: 1936
        //          2033059783: 650
        //          default: 680
        //        }
        //   680: goto            684
        //   683: athrow         
        //   684: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   687: goto            691
        //   690: athrow         
        //   691: aload_2        
        //   692: goto            696
        //   695: athrow         
        //   696: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   699: goto            703
        //   702: athrow         
        //   703: astore_3       
        //   704: new             Ljava/util/ArrayList;
        //   707: dup            
        //   708: goto            712
        //   711: athrow         
        //   712: invokespecial   java/util/ArrayList.<init>:()V
        //   715: goto            719
        //   718: athrow         
        //   719: getstatic       dev/nuker/pyro/fc.0:I
        //   722: ifeq            730
        //   725: ldc             -1866756731
        //   727: goto            732
        //   730: ldc             -1695104280
        //   732: ldc             895858505
        //   734: ixor           
        //   735: lookupswitch {
        //          -1837397831: 730
        //          -1512162612: 1934
        //          default: 760
        //        }
        //   760: astore          4
        //   762: iconst_0       
        //   763: istore          5
        //   765: iconst_3       
        //   766: istore          6
        //   768: iload           5
        //   770: iload           6
        //   772: if_icmpgt       1144
        //   775: getstatic       dev/nuker/pyro/fc.c:I
        //   778: ifge            786
        //   781: ldc             2043729167
        //   783: goto            788
        //   786: ldc             -544907659
        //   788: ldc             -403252154
        //   790: ixor           
        //   791: lookupswitch {
        //          -1641674423: 1958
        //          -1045268326: 786
        //          default: 816
        //        }
        //   816: aload           4
        //   818: getstatic       dev/nuker/pyro/fc.c:I
        //   821: ifge            829
        //   824: ldc             1652691520
        //   826: goto            831
        //   829: ldc             -550422165
        //   831: ldc             1552734703
        //   833: ixor           
        //   834: lookupswitch {
        //          1041157039: 1962
        //          1136153035: 829
        //          default: 860
        //        }
        //   860: aload_3        
        //   861: aload_2        
        //   862: getstatic       dev/nuker/pyro/fc.0:I
        //   865: ifeq            873
        //   868: ldc             1350959884
        //   870: goto            875
        //   873: ldc             -1835199711
        //   875: ldc             -824871937
        //   877: ixor           
        //   878: lookupswitch {
        //          -1638698765: 873
        //          1548247262: 904
        //          default: 1982
        //        }
        //   904: iload           5
        //   906: goto            910
        //   909: athrow         
        //   910: invokevirtual   net/minecraft/util/math/BlockPos.func_177967_a:(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos;
        //   913: goto            917
        //   916: athrow         
        //   917: goto            921
        //   920: athrow         
        //   921: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   924: goto            928
        //   927: athrow         
        //   928: pop            
        //   929: aload           4
        //   931: getstatic       dev/nuker/pyro/fc.1:I
        //   934: ifeq            942
        //   937: ldc             567090240
        //   939: goto            944
        //   942: ldc             2113993357
        //   944: ldc             390910762
        //   946: ixor           
        //   947: lookupswitch {
        //          914476906: 942
        //          1766599079: 972
        //          default: 1978
        //        }
        //   972: aload_3        
        //   973: getstatic       dev/nuker/pyro/fc.c:I
        //   976: ifge            984
        //   979: ldc             -274231502
        //   981: goto            986
        //   984: ldc             2067869523
        //   986: ldc             -2052397120
        //   988: ixor           
        //   989: lookupswitch {
        //          -18102125: 1016
        //          1779263730: 984
        //          default: 1966
        //        }
        //  1016: aload_2        
        //  1017: getstatic       dev/nuker/pyro/fc.1:I
        //  1020: ifeq            1028
        //  1023: ldc             -141245315
        //  1025: goto            1030
        //  1028: ldc             -434862312
        //  1030: ldc             -797260860
        //  1032: ixor           
        //  1033: lookupswitch {
        //          669910969: 1028
        //          913196252: 1060
        //          default: 1968
        //        }
        //  1060: iload           5
        //  1062: getstatic       dev/nuker/pyro/fc.c:I
        //  1065: ifge            1073
        //  1068: ldc             1178062601
        //  1070: goto            1075
        //  1073: ldc             25731824
        //  1075: ldc             1655050079
        //  1077: ixor           
        //  1078: lookupswitch {
        //          613531734: 1073
        //          1664003503: 1104
        //          default: 1944
        //        }
        //  1104: goto            1108
        //  1107: athrow         
        //  1108: invokevirtual   net/minecraft/util/math/BlockPos.func_177967_a:(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos;
        //  1111: goto            1115
        //  1114: athrow         
        //  1115: goto            1119
        //  1118: athrow         
        //  1119: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1122: goto            1126
        //  1125: athrow         
        //  1126: goto            1130
        //  1129: athrow         
        //  1130: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: pop            
        //  1138: iinc            5, 1
        //  1141: goto            768
        //  1144: aload           4
        //  1146: goto            1150
        //  1149: athrow         
        //  1150: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1153: goto            1157
        //  1156: athrow         
        //  1157: astore          6
        //  1159: aload           6
        //  1161: getstatic       dev/nuker/pyro/fc.0:I
        //  1164: ifeq            1172
        //  1167: ldc             1192822083
        //  1169: goto            1174
        //  1172: ldc             -1855438232
        //  1174: ldc             1806220837
        //  1176: ixor           
        //  1177: lookupswitch {
        //          -88015795: 1204
        //          749845350: 1172
        //          default: 1974
        //        }
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: invokeinterface java/util/Iterator.hasNext:()Z
        //  1213: goto            1217
        //  1216: athrow         
        //  1217: ifeq            1933
        //  1220: getstatic       dev/nuker/pyro/fc.0:I
        //  1223: ifeq            1231
        //  1226: ldc             -278352462
        //  1228: goto            1233
        //  1231: ldc             112462671
        //  1233: ldc             -1210743258
        //  1235: ixor           
        //  1236: lookupswitch {
        //          -1319006871: 1264
        //          1488792468: 1231
        //          default: 1938
        //        }
        //  1264: aload           6
        //  1266: goto            1270
        //  1269: athrow         
        //  1270: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  1282: astore          5
        //  1284: aload_0        
        //  1285: getstatic       dev/nuker/pyro/fc.c:I
        //  1288: ifge            1297
        //  1291: ldc_w           1251502005
        //  1294: goto            1300
        //  1297: ldc_w           1563066903
        //  1300: ldc_w           1908114501
        //  1303: ixor           
        //  1304: lookupswitch {
        //          311681238: 1297
        //          992207856: 1976
        //          default: 1332
        //        }
        //  1332: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //  1335: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1338: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1341: aload           5
        //  1343: dup            
        //  1344: pop            
        //  1345: goto            1349
        //  1348: athrow         
        //  1349: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  1352: goto            1356
        //  1355: athrow         
        //  1356: i2d            
        //  1357: ldc2_w          0.5
        //  1360: dadd           
        //  1361: dsub           
        //  1362: dstore          7
        //  1364: aload_0        
        //  1365: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //  1368: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1371: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1374: aload           5
        //  1376: goto            1380
        //  1379: athrow         
        //  1380: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: i2d            
        //  1388: ldc2_w          0.5
        //  1391: dadd           
        //  1392: dsub           
        //  1393: ldc2_w          1.5
        //  1396: dadd           
        //  1397: dstore          9
        //  1399: aload_0        
        //  1400: getfield        dev/nuker/pyro/faN.c:Lnet/minecraft/client/Minecraft;
        //  1403: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1406: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1409: aload           5
        //  1411: goto            1415
        //  1414: athrow         
        //  1415: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1418: goto            1422
        //  1421: athrow         
        //  1422: i2d            
        //  1423: ldc2_w          0.5
        //  1426: dadd           
        //  1427: dsub           
        //  1428: dstore          11
        //  1430: dload           7
        //  1432: getstatic       dev/nuker/pyro/fc.0:I
        //  1435: ifeq            1444
        //  1438: ldc_w           -1528261717
        //  1441: goto            1447
        //  1444: ldc_w           1202749106
        //  1447: ldc_w           1494557481
        //  1450: ixor           
        //  1451: lookupswitch {
        //          -33705854: 1444
        //          514153883: 1476
        //          default: 1954
        //        }
        //  1476: dload           7
        //  1478: dmul           
        //  1479: dload           9
        //  1481: getstatic       dev/nuker/pyro/fc.1:I
        //  1484: ifeq            1493
        //  1487: ldc_w           1040920718
        //  1490: goto            1496
        //  1493: ldc_w           -1121234379
        //  1496: ldc_w           56182191
        //  1499: ixor           
        //  1500: lookupswitch {
        //          -1099819110: 1528
        //          1028814113: 1493
        //          default: 1960
        //        }
        //  1528: dload           9
        //  1530: dmul           
        //  1531: dadd           
        //  1532: dload           11
        //  1534: dload           11
        //  1536: dmul           
        //  1537: dadd           
        //  1538: getstatic       dev/nuker/pyro/fc.c:I
        //  1541: ifge            1550
        //  1544: ldc_w           -1837435957
        //  1547: goto            1553
        //  1550: ldc_w           -1821465710
        //  1553: ldc_w           -1527669280
        //  1556: ixor           
        //  1557: lookupswitch {
        //          -1311493431: 1550
        //          915107371: 1946
        //          default: 1584
        //        }
        //  1584: dstore          13
        //  1586: getstatic       dev/nuker/pyro/fc.1:I
        //  1589: ifeq            1598
        //  1592: ldc_w           -942424131
        //  1595: goto            1601
        //  1598: ldc_w           -1521125531
        //  1601: ldc_w           819711608
        //  1604: ixor           
        //  1605: lookupswitch {
        //          -150441531: 1972
        //          1500054360: 1598
        //          default: 1632
        //        }
        //  1632: dload           13
        //  1634: ldc2_w          36.0
        //  1637: dcmpl          
        //  1638: ifle            1644
        //  1641: goto            1930
        //  1644: aload           5
        //  1646: goto            1650
        //  1649: athrow         
        //  1650: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  1653: goto            1657
        //  1656: athrow         
        //  1657: astore          15
        //  1659: aload_0        
        //  1660: aload           5
        //  1662: getstatic       dev/nuker/pyro/fc.c:I
        //  1665: ifge            1674
        //  1668: ldc_w           1122558005
        //  1671: goto            1677
        //  1674: ldc_w           984600578
        //  1677: ldc_w           -1701623800
        //  1680: ixor           
        //  1681: lookupswitch {
        //          -1606641654: 1708
        //          -662984643: 1674
        //          default: 1948
        //        }
        //  1708: goto            1712
        //  1711: athrow         
        //  1712: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: dup            
        //  1720: pop            
        //  1721: aload           5
        //  1723: aload           15
        //  1725: dup            
        //  1726: pop            
        //  1727: goto            1731
        //  1730: athrow         
        //  1731: invokevirtual   dev/nuker/pyro/faN.c:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)Z
        //  1734: goto            1738
        //  1737: athrow         
        //  1738: ifne            1744
        //  1741: goto            1930
        //  1744: aload_0        
        //  1745: aload_1        
        //  1746: aload           5
        //  1748: goto            1752
        //  1751: athrow         
        //  1752: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f3i;Lnet/minecraft/util/math/BlockPos;)Z
        //  1755: goto            1759
        //  1758: athrow         
        //  1759: ifeq            1930
        //  1762: aload_0        
        //  1763: aload           5
        //  1765: putfield        dev/nuker/pyro/faN.c:Lnet/minecraft/util/math/BlockPos;
        //  1768: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //  1771: getstatic       dev/nuker/pyro/fc.1:I
        //  1774: ifeq            1783
        //  1777: ldc_w           -1858432600
        //  1780: goto            1786
        //  1783: ldc_w           1192197033
        //  1786: ldc_w           -145993401
        //  1789: ixor           
        //  1790: lookupswitch {
        //          1616232978: 1783
        //          1719058671: 1940
        //          default: 1816
        //        }
        //  1816: aload_0        
        //  1817: checkcast       Ldev/nuker/pyro/fH;
        //  1820: aload           5
        //  1822: aload_0        
        //  1823: getfield        dev/nuker/pyro/faN.0:Ldev/nuker/pyro/f0a;
        //  1826: goto            1830
        //  1829: athrow         
        //  1830: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1833: goto            1837
        //  1836: athrow         
        //  1837: checkcast       Ljava/lang/Boolean;
        //  1840: goto            1844
        //  1843: athrow         
        //  1844: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1847: goto            1851
        //  1850: athrow         
        //  1851: new             Ldev/nuker/pyro/faM;
        //  1854: dup            
        //  1855: aload_0        
        //  1856: goto            1860
        //  1859: athrow         
        //  1860: invokespecial   dev/nuker/pyro/faM.<init>:(Ldev/nuker/pyro/faN;)V
        //  1863: goto            1867
        //  1866: athrow         
        //  1867: checkcast       Ljava/util/function/Consumer;
        //  1870: getstatic       dev/nuker/pyro/fc.1:I
        //  1873: ifeq            1882
        //  1876: ldc_w           71704847
        //  1879: goto            1885
        //  1882: ldc_w           -1551915191
        //  1885: ldc_w           -1510378801
        //  1888: ixor           
        //  1889: lookupswitch {
        //          -1581296704: 1970
        //          -762816834: 1882
        //          default: 1916
        //        }
        //  1916: goto            1920
        //  1919: athrow         
        //  1920: invokevirtual   dev/nuker/pyro/fx.c:(Ldev/nuker/pyro/fH;Lnet/minecraft/util/math/BlockPos;ZLjava/util/function/Consumer;)V
        //  1923: goto            1927
        //  1926: athrow         
        //  1927: goto            1933
        //  1930: goto            1159
        //  1933: return         
        //  1934: aconst_null    
        //  1935: athrow         
        //  1936: aconst_null    
        //  1937: athrow         
        //  1938: aconst_null    
        //  1939: athrow         
        //  1940: aconst_null    
        //  1941: athrow         
        //  1942: aconst_null    
        //  1943: athrow         
        //  1944: aconst_null    
        //  1945: athrow         
        //  1946: aconst_null    
        //  1947: athrow         
        //  1948: aconst_null    
        //  1949: athrow         
        //  1950: aconst_null    
        //  1951: athrow         
        //  1952: aconst_null    
        //  1953: athrow         
        //  1954: aconst_null    
        //  1955: athrow         
        //  1956: aconst_null    
        //  1957: athrow         
        //  1958: aconst_null    
        //  1959: athrow         
        //  1960: aconst_null    
        //  1961: athrow         
        //  1962: aconst_null    
        //  1963: athrow         
        //  1964: aconst_null    
        //  1965: athrow         
        //  1966: aconst_null    
        //  1967: athrow         
        //  1968: aconst_null    
        //  1969: athrow         
        //  1970: aconst_null    
        //  1971: athrow         
        //  1972: aconst_null    
        //  1973: athrow         
        //  1974: aconst_null    
        //  1975: athrow         
        //  1976: aconst_null    
        //  1977: athrow         
        //  1978: aconst_null    
        //  1979: athrow         
        //  1980: aconst_null    
        //  1981: athrow         
        //  1982: aconst_null    
        //  1983: athrow         
        //  1984: aconst_null    
        //  1985: athrow         
        //  1986: pop            
        //  1987: goto            24
        //  1990: pop            
        //  1991: aconst_null    
        //  1992: goto            1986
        //  1995: dup            
        //  1996: ifnull          1986
        //  1999: checkcast       Ljava/lang/Throwable;
        //  2002: athrow         
        //  2003: dup            
        //  2004: ifnull          1990
        //  2007: checkcast       Ljava/lang/Throwable;
        //  2010: athrow         
        //  2011: aconst_null    
        //  2012: athrow         
        //    StackMapTable: 01 10 43 07 00 57 04 FF 00 0B 00 00 00 01 07 00 57 FD 00 03 07 00 03 07 00 59 45 07 00 57 40 07 00 59 45 07 00 57 40 01 03 FF 00 03 00 00 00 01 07 00 57 FF 00 00 00 02 07 00 03 07 00 59 00 01 07 00 59 45 07 00 57 40 07 00 61 06 4F 07 00 66 FF 00 01 00 02 07 00 03 07 00 59 00 02 07 00 66 01 5C 07 00 66 42 07 00 3B 40 07 00 66 45 07 00 57 40 07 00 05 02 04 41 01 1A 47 07 00 3F 40 07 00 66 45 07 00 57 40 07 00 05 46 07 00 57 FF 00 00 00 02 07 00 03 07 00 59 00 02 07 00 05 07 00 03 45 07 00 57 40 01 05 0A 41 01 1D 47 07 00 49 40 07 00 66 45 07 00 57 40 07 00 05 46 07 00 49 FF 00 00 00 02 07 00 03 07 00 59 00 02 07 00 05 07 00 03 45 07 00 57 40 01 02 04 41 01 1A 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 59 00 02 07 00 03 01 5D 07 00 03 FF 00 12 00 00 00 01 07 00 57 FF 00 00 00 02 07 00 03 07 00 59 00 03 07 00 03 07 00 59 07 00 95 45 07 00 57 FF 00 00 00 02 07 00 03 07 00 59 00 03 07 00 03 07 00 59 07 00 95 FF 00 02 00 00 00 01 07 00 57 FF 00 00 00 02 07 00 03 07 00 59 00 03 07 00 03 07 00 59 07 00 95 45 07 00 57 40 01 01 0A 41 01 1E 43 07 00 3F 40 07 00 03 45 07 00 57 40 07 01 49 FF 00 15 00 00 00 01 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 03 08 01 C1 08 01 C1 03 45 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 03 08 01 C1 08 01 C1 01 FF 00 0B 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 07 00 03 01 FF 00 1B 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 03 FF 00 0D 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 9A FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 07 00 9A 01 FF 00 1B 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 9A 48 07 00 49 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 03 45 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 01 FF 00 14 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 03 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 06 08 01 C1 08 01 C1 01 01 03 01 FF 00 1B 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 03 42 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 03 45 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 01 FF 00 0A 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 01 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 06 08 01 C1 08 01 C1 01 01 01 01 FF 00 1B 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 01 42 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 01 45 07 00 57 40 07 00 95 FF 00 03 00 00 00 01 07 00 57 FF 00 00 00 03 07 00 03 07 00 59 07 01 49 00 02 07 00 95 07 01 49 45 07 00 57 40 07 00 95 FF 00 07 00 04 07 00 03 07 00 59 07 01 49 07 00 95 00 01 07 00 57 FF 00 00 00 04 07 00 03 07 00 59 07 01 49 07 00 95 00 02 08 02 C0 08 02 C0 45 07 00 57 40 07 00 C6 4A 07 00 C6 FF 00 01 00 04 07 00 03 07 00 59 07 01 49 07 00 95 00 02 07 00 C6 01 5B 07 00 C6 FE 00 07 07 00 C6 01 01 11 41 01 1B 4C 07 00 C6 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 01 5C 07 00 C6 FF 00 0C 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 FF 00 1C 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 44 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 45 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 42 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 45 07 00 57 40 01 4D 07 00 C6 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 01 5B 07 00 C6 FF 00 0B 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 01 FF 00 1D 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 FF 00 0B 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 FF 00 1D 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 FF 00 0C 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 05 07 00 C6 07 00 95 07 01 49 01 01 FF 00 1C 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 42 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 45 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 42 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 45 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 42 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 45 07 00 57 40 01 06 44 07 00 4D 40 07 00 C6 45 07 00 57 40 07 00 F5 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 00 07 00 F5 00 00 4C 07 00 F5 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 00 07 00 F5 00 02 07 00 F5 01 5D 07 00 F5 42 07 00 57 40 07 00 F5 47 07 00 57 40 01 0D 41 01 1E 44 07 00 49 40 07 00 F5 47 07 00 57 40 07 01 4B FF 00 11 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 00 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 00 02 07 00 03 01 5F 07 00 03 4F 07 00 4D FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 00 02 03 07 00 95 45 07 00 57 FF 00 00 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 00 02 03 01 FF 00 16 00 08 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 00 01 07 00 57 FF 00 00 00 08 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 00 02 03 07 00 95 45 07 00 57 FF 00 00 00 08 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 00 02 03 01 FF 00 1A 00 09 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 00 01 07 00 57 FF 00 00 00 09 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 00 02 03 07 00 95 45 07 00 57 FF 00 00 00 09 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 00 02 03 01 FF 00 15 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 01 03 FF 00 02 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 02 03 01 5C 03 FF 00 10 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 02 03 03 FF 00 02 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 03 03 03 01 FF 00 1F 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 02 03 03 55 03 FF 00 02 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 02 03 01 5E 03 FC 00 0D 03 42 01 1E 0B 44 07 00 31 40 07 00 95 45 07 00 57 40 07 01 4D FF 00 10 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 03 07 00 95 FF 00 02 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 03 07 00 03 07 00 95 01 FF 00 1E 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 03 07 00 95 42 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 03 07 00 95 45 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 03 07 01 4F 4A 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 04 07 00 03 07 01 4F 07 00 95 07 01 4D 45 07 00 57 40 01 05 46 07 00 3F FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 03 07 00 03 07 00 59 07 00 95 45 07 00 57 40 01 57 07 00 66 FF 00 02 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 66 01 5D 07 00 66 FF 00 0C 00 00 00 01 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 04 07 00 66 07 00 05 07 00 95 07 01 32 45 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 04 07 00 66 07 00 05 07 00 95 07 01 4B 45 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 04 07 00 66 07 00 05 07 00 95 07 01 37 45 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 04 07 00 66 07 00 05 07 00 95 01 FF 00 07 00 00 00 01 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 07 07 00 66 07 00 05 07 00 95 01 08 07 3B 08 07 3B 07 00 03 45 07 00 57 FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 05 07 00 66 07 00 05 07 00 95 01 07 01 3C FF 00 0E 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 05 07 00 66 07 00 05 07 00 95 01 07 01 41 FF 00 02 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 06 07 00 66 07 00 05 07 00 95 01 07 01 41 01 FF 00 1E 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 05 07 00 66 07 00 05 07 00 95 01 07 01 41 42 07 00 3D FF 00 00 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 05 07 00 66 07 00 05 07 00 95 01 07 01 41 45 07 00 57 00 FA 00 02 FF 00 02 00 03 07 00 03 07 00 59 07 01 49 00 00 FF 00 00 00 04 07 00 03 07 00 59 07 01 49 07 00 95 00 01 07 00 C6 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 01 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 00 07 00 F5 00 00 FF 00 01 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 01 07 00 66 FF 00 01 00 02 07 00 03 07 00 59 00 00 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 04 07 00 C6 07 00 95 07 01 49 01 FF 00 01 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 01 03 FF 00 01 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 02 07 00 03 07 00 95 FF 00 01 00 02 07 00 03 07 00 59 00 01 07 00 66 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 9A FF 00 01 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 59 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 00 FF 00 01 00 0A 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 00 02 03 03 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 01 07 00 C6 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 04 08 01 C1 08 01 C1 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 02 07 00 C6 07 00 95 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 FF 00 01 00 0C 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 03 03 03 03 07 01 4D 00 05 07 00 66 07 00 05 07 00 95 01 07 01 41 FA 00 01 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 00 07 00 F5 00 01 07 00 F5 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 07 00 95 07 00 F5 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 01 07 00 C6 FF 00 01 00 02 07 00 03 07 00 59 00 00 FF 00 01 00 07 07 00 03 07 00 59 07 01 49 07 00 95 07 00 C6 01 01 00 03 07 00 C6 07 00 95 07 01 49 FF 00 01 00 03 07 00 03 07 00 59 07 01 49 00 05 08 01 C1 08 01 C1 01 01 03 FF 00 01 00 02 07 00 03 07 00 59 00 01 07 00 49 43 05 44 07 00 49 47 05 47 07 00 57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1995   2003   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1995   2003   1995   2003   Ljava/lang/IllegalStateException;
        //  2011   2013   3      8      Ljava/lang/AssertionError;
        //  30     37     37     38     Any
        //  30     37     30     31     Any
        //  31     37     3      8      Any
        //  31     37     37     38     Ljava/lang/NullPointerException;
        //  30     37     3      8      Ljava/lang/IllegalStateException;
        //  47     53     53     54     Any
        //  47     53     3      8      Any
        //  47     53     3      8      Any
        //  47     53     53     54     Any
        //  47     53     3      8      Ljava/lang/IllegalArgumentException;
        //  111    118    118    119    Any
        //  112    118    3      8      Ljava/lang/IllegalArgumentException;
        //  112    118    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  112    118    118    119    Ljava/lang/StringIndexOutOfBoundsException;
        //  112    118    111    112    Ljava/lang/StringIndexOutOfBoundsException;
        //  164    171    171    172    Any
        //  164    171    171    172    Any
        //  164    171    3      8      Ljava/lang/ArithmeticException;
        //  165    171    3      8      Ljava/lang/NullPointerException;
        //  165    171    164    165    Ljava/lang/NumberFormatException;
        //  179    186    186    187    Any
        //  179    186    186    187    Ljava/lang/NullPointerException;
        //  179    186    179    180    Any
        //  180    186    3      8      Any
        //  179    186    186    187    Ljava/lang/AssertionError;
        //  244    251    251    252    Any
        //  245    251    244    245    Ljava/lang/EnumConstantNotPresentException;
        //  245    251    244    245    Ljava/lang/IllegalArgumentException;
        //  244    251    3      8      Any
        //  244    251    251    252    Any
        //  259    266    266    267    Any
        //  260    266    259    260    Ljava/lang/IllegalArgumentException;
        //  259    266    266    267    Ljava/lang/NegativeArraySizeException;
        //  260    266    259    260    Ljava/lang/NullPointerException;
        //  259    266    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  368    374    374    375    Any
        //  368    374    3      8      Ljava/util/NoSuchElementException;
        //  368    374    3      8      Any
        //  368    374    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  368    374    374    375    Any
        //  379    385    385    386    Any
        //  379    385    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  379    385    3      8      Ljava/lang/UnsupportedOperationException;
        //  379    385    3      8      Any
        //  379    385    3      8      Any
        //  436    443    443    444    Any
        //  436    443    443    444    Any
        //  436    443    443    444    Any
        //  437    443    436    437    Ljava/lang/NumberFormatException;
        //  436    443    3      8      Any
        //  467    473    473    474    Any
        //  467    473    3      8      Any
        //  467    473    3      8      Any
        //  467    473    473    474    Ljava/lang/IllegalArgumentException;
        //  467    473    473    474    Any
        //  569    576    576    577    Any
        //  570    576    3      8      Ljava/lang/IllegalStateException;
        //  569    576    569    570    Ljava/lang/IllegalArgumentException;
        //  570    576    569    570    Ljava/lang/UnsupportedOperationException;
        //  570    576    3      8      Any
        //  631    638    638    639    Any
        //  631    638    3      8      Ljava/lang/RuntimeException;
        //  631    638    3      8      Any
        //  632    638    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  631    638    631    632    Any
        //  683    690    690    691    Any
        //  683    690    690    691    Ljava/lang/StringIndexOutOfBoundsException;
        //  683    690    3      8      Ljava/lang/AssertionError;
        //  684    690    683    684    Any
        //  684    690    683    684    Any
        //  696    702    702    703    Any
        //  696    702    702    703    Any
        //  696    702    702    703    Any
        //  696    702    702    703    Ljava/lang/UnsupportedOperationException;
        //  696    702    702    703    Any
        //  711    718    718    719    Any
        //  712    718    711    712    Ljava/util/ConcurrentModificationException;
        //  711    718    718    719    Ljava/lang/NumberFormatException;
        //  712    718    711    712    Ljava/lang/AssertionError;
        //  711    718    3      8      Ljava/lang/ArithmeticException;
        //  909    916    916    917    Any
        //  909    916    3      8      Any
        //  910    916    909    910    Any
        //  909    916    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  910    916    916    917    Any
        //  920    927    927    928    Any
        //  921    927    927    928    Any
        //  921    927    927    928    Ljava/lang/NumberFormatException;
        //  921    927    927    928    Any
        //  921    927    920    921    Any
        //  1107   1114   1114   1115   Any
        //  1107   1114   1107   1108   Any
        //  1108   1114   3      8      Ljava/lang/IllegalStateException;
        //  1107   1114   1114   1115   Any
        //  1108   1114   3      8      Ljava/lang/RuntimeException;
        //  1118   1125   1125   1126   Any
        //  1119   1125   1118   1119   Ljava/lang/ClassCastException;
        //  1118   1125   1118   1119   Any
        //  1119   1125   3      8      Any
        //  1119   1125   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1129   1136   1136   1137   Any
        //  1129   1136   3      8      Ljava/util/ConcurrentModificationException;
        //  1129   1136   1129   1130   Any
        //  1129   1136   1129   1130   Any
        //  1129   1136   1129   1130   Any
        //  1149   1156   1156   1157   Any
        //  1150   1156   1149   1150   Ljava/lang/IndexOutOfBoundsException;
        //  1149   1156   3      8      Any
        //  1150   1156   1156   1157   Ljava/util/NoSuchElementException;
        //  1150   1156   1156   1157   Ljava/lang/NegativeArraySizeException;
        //  1207   1216   1216   1217   Any
        //  1207   1216   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1208   1216   1216   1217   Ljava/lang/IllegalArgumentException;
        //  1208   1216   1207   1208   Any
        //  1207   1216   1207   1208   Ljava/lang/IndexOutOfBoundsException;
        //  1269   1278   1278   1279   Any
        //  1269   1278   1278   1279   Ljava/lang/IndexOutOfBoundsException;
        //  1270   1278   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1270   1278   1269   1270   Ljava/lang/EnumConstantNotPresentException;
        //  1269   1278   1269   1270   Ljava/lang/ClassCastException;
        //  1348   1355   1355   1356   Any
        //  1348   1355   1355   1356   Any
        //  1349   1355   1355   1356   Ljava/lang/AssertionError;
        //  1349   1355   1355   1356   Any
        //  1349   1355   1348   1349   Ljava/lang/IndexOutOfBoundsException;
        //  1379   1386   1386   1387   Any
        //  1379   1386   1379   1380   Any
        //  1380   1386   1386   1387   Ljava/util/ConcurrentModificationException;
        //  1380   1386   3      8      Any
        //  1379   1386   3      8      Ljava/lang/IllegalArgumentException;
        //  1414   1421   1421   1422   Any
        //  1415   1421   1414   1415   Any
        //  1414   1421   3      8      Any
        //  1414   1421   1414   1415   Ljava/util/ConcurrentModificationException;
        //  1414   1421   1421   1422   Any
        //  1649   1656   1656   1657   Any
        //  1650   1656   3      8      Ljava/lang/IllegalStateException;
        //  1649   1656   1656   1657   Ljava/lang/NegativeArraySizeException;
        //  1649   1656   1656   1657   Any
        //  1649   1656   1649   1650   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1711   1718   1718   1719   Any
        //  1712   1718   1711   1712   Any
        //  1711   1718   3      8      Ljava/lang/ArithmeticException;
        //  1712   1718   1718   1719   Any
        //  1712   1718   1711   1712   Any
        //  1730   1737   1737   1738   Any
        //  1731   1737   1730   1731   Ljava/util/NoSuchElementException;
        //  1731   1737   1730   1731   Any
        //  1731   1737   3      8      Ljava/util/ConcurrentModificationException;
        //  1731   1737   1737   1738   Any
        //  1751   1758   1758   1759   Any
        //  1751   1758   1758   1759   Any
        //  1752   1758   1751   1752   Ljava/lang/NumberFormatException;
        //  1752   1758   1758   1759   Any
        //  1751   1758   3      8      Ljava/lang/NumberFormatException;
        //  1830   1836   1836   1837   Any
        //  1830   1836   3      8      Any
        //  1830   1836   1836   1837   Ljava/util/ConcurrentModificationException;
        //  1830   1836   1836   1837   Any
        //  1830   1836   3      8      Any
        //  1843   1850   1850   1851   Any
        //  1843   1850   3      8      Any
        //  1844   1850   1843   1844   Any
        //  1843   1850   1850   1851   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1843   1850   1843   1844   Ljava/lang/NegativeArraySizeException;
        //  1860   1866   1866   1867   Any
        //  1860   1866   3      8      Ljava/lang/IllegalArgumentException;
        //  1860   1866   3      8      Ljava/util/NoSuchElementException;
        //  1860   1866   3      8      Ljava/util/ConcurrentModificationException;
        //  1860   1866   1866   1867   Any
        //  1919   1926   1926   1927   Any
        //  1919   1926   3      8      Any
        //  1919   1926   1926   1927   Any
        //  1919   1926   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1919   1926   1919   1920   Ljava/lang/ArithmeticException;
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
    
    @Nullable
    public BlockPos 3() {
        return fbS.7U(this, 1007290933);
    }
    
    static {
        throw t;
    }
    
    @Override
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.9c(this, 429710228, vec3d, n);
    }
    
    public void c(@Nullable final BlockPos blockPos) {
        fbS.41(this, 420291662, blockPos);
    }
    
    public boolean c(@NotNull final f3i f3i, @NotNull final BlockPos blockPos) {
        return fbS.a(this, 105532313, f3i, blockPos);
    }
    
    public faN() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u291e\u1486\u801a\ub3d6\uc660\ue70c\ub22a\uec2d\ud96d\ue60b"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u293e\u1486\u801a\ub3d6\uc640\ue70c\ub22a\uec2d\ud96d\ue60b"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: aconst_null    
        //    14: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    17: aload_0        
        //    18: aload_0        
        //    19: new             Ldev/nuker/pyro/f0a;
        //    22: dup            
        //    23: ldc_w           "\u290d\u149c\u801a\ub3d8\uc660\ue71c"
        //    26: invokestatic    invokestatic   !!! ERROR
        //    29: ldc_w           "\u292d\u149c\u801a\ub3d8\uc660\ue71c"
        //    32: getstatic       dev/nuker/pyro/fc.1:I
        //    35: ifeq            44
        //    38: ldc_w           -1378305920
        //    41: goto            47
        //    44: ldc_w           1089221528
        //    47: ldc_w           19294582
        //    50: ixor           
        //    51: lookupswitch {
        //          -1392586250: 44
        //          1103780590: 76
        //          default: 704
        //        }
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: aconst_null    
        //    80: iconst_1       
        //    81: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    84: checkcast       Ldev/nuker/pyro/f0n;
        //    87: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    90: checkcast       Ldev/nuker/pyro/f0a;
        //    93: getstatic       dev/nuker/pyro/fc.c:I
        //    96: ifge            105
        //    99: ldc_w           -1890930460
        //   102: goto            108
        //   105: ldc_w           -1660686440
        //   108: ldc_w           -879917220
        //   111: ixor           
        //   112: lookupswitch {
        //          1153906616: 105
        //          1452173508: 140
        //          default: 706
        //        }
        //   140: putfield        dev/nuker/pyro/faN.c:Ldev/nuker/pyro/f0a;
        //   143: aload_0        
        //   144: getstatic       dev/nuker/pyro/fc.0:I
        //   147: ifeq            156
        //   150: ldc_w           -662690453
        //   153: goto            159
        //   156: ldc_w           1323614614
        //   159: ldc_w           1992066919
        //   162: ixor           
        //   163: lookupswitch {
        //          -1371758068: 688
        //          324257622: 156
        //          default: 188
        //        }
        //   188: aload_0        
        //   189: new             Ldev/nuker/pyro/f0a;
        //   192: dup            
        //   193: ldc_w           "\u290d\u1492\u8017\ub3cd\uc666\ue718\ub227\uec26"
        //   196: invokestatic    invokestatic   !!! ERROR
        //   199: ldc_w           "\u292d\u1492\u8017\ub3cd\uc666\ue718\ub227\uec26"
        //   202: invokestatic    invokestatic   !!! ERROR
        //   205: aconst_null    
        //   206: iconst_1       
        //   207: getstatic       dev/nuker/pyro/fc.1:I
        //   210: ifeq            219
        //   213: ldc_w           94224763
        //   216: goto            222
        //   219: ldc_w           922300314
        //   222: ldc_w           -588186441
        //   225: ixor           
        //   226: lookupswitch {
        //          -647152180: 219
        //          -368454867: 252
        //          default: 698
        //        }
        //   252: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   255: checkcast       Ldev/nuker/pyro/f0n;
        //   258: getstatic       dev/nuker/pyro/fc.0:I
        //   261: ifeq            270
        //   264: ldc_w           260877067
        //   267: goto            273
        //   270: ldc_w           1280170824
        //   273: ldc_w           -1300340514
        //   276: ixor           
        //   277: lookupswitch {
        //          -1108161579: 270
        //          -30164074: 304
        //          default: 702
        //        }
        //   304: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   307: checkcast       Ldev/nuker/pyro/f0a;
        //   310: putfield        dev/nuker/pyro/faN.0:Ldev/nuker/pyro/f0a;
        //   313: aload_0        
        //   314: getstatic       dev/nuker/pyro/fc.c:I
        //   317: ifge            326
        //   320: ldc_w           -1617779387
        //   323: goto            329
        //   326: ldc_w           673257920
        //   329: ldc_w           -1401074537
        //   332: ixor           
        //   333: lookupswitch {
        //          -2074323625: 360
        //          871360978: 326
        //          default: 708
        //        }
        //   360: aload_0        
        //   361: new             Ldev/nuker/pyro/f0b;
        //   364: dup            
        //   365: ldc_w           "\u290d\u1496\u8000\ub3dd\uc671\ue70b\ub207\uec2c\ud964\ue608\uadcb"
        //   368: invokestatic    invokestatic   !!! ERROR
        //   371: ldc_w           "\u292d\u1496\u8000\ub3dd\uc671\ue70b\ub207\uec2c\ud964\ue608\uadcb"
        //   374: invokestatic    invokestatic   !!! ERROR
        //   377: aconst_null    
        //   378: new             Ldev/nuker/pyro/fS;
        //   381: dup            
        //   382: fconst_1       
        //   383: fconst_1       
        //   384: ldc_w           0.5
        //   387: ldc_w           0.3
        //   390: getstatic       dev/nuker/pyro/fc.c:I
        //   393: ifge            402
        //   396: ldc_w           -469970906
        //   399: goto            405
        //   402: ldc_w           557695167
        //   405: ldc_w           -1412736031
        //   408: ixor           
        //   409: lookupswitch {
        //          -1963549858: 436
        //          1211599815: 402
        //          default: 694
        //        }
        //   436: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   439: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   442: checkcast       Ldev/nuker/pyro/f0n;
        //   445: getstatic       dev/nuker/pyro/fc.c:I
        //   448: ifge            457
        //   451: ldc_w           82832942
        //   454: goto            460
        //   457: ldc_w           -663630135
        //   460: ldc_w           802894978
        //   463: ixor           
        //   464: lookupswitch {
        //          -139789749: 492
        //          724884140: 457
        //          default: 692
        //        }
        //   492: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   495: checkcast       Ldev/nuker/pyro/f0b;
        //   498: putfield        dev/nuker/pyro/faN.c:Ldev/nuker/pyro/f0b;
        //   501: getstatic       dev/nuker/pyro/fc.0:I
        //   504: ifeq            513
        //   507: ldc_w           1856811021
        //   510: goto            516
        //   513: ldc_w           1461835597
        //   516: ldc_w           -5525887
        //   519: ixor           
        //   520: lookupswitch {
        //          -1861804404: 690
        //          204059820: 513
        //          default: 548
        //        }
        //   548: aload_0        
        //   549: aload_0        
        //   550: new             Ldev/nuker/pyro/f0b;
        //   553: dup            
        //   554: ldc_w           "\u290d\u1496\u8000\ub3dd\uc671\ue70b\ub20b\uec36\ud97c\ue60b\uadd0\u1e42\ueb02"
        //   557: invokestatic    invokestatic   !!! ERROR
        //   560: ldc_w           "\u292d\u1496\u8000\ub3dd\uc671\ue70b\ub20b\uec36\ud97c\ue60b\uadd0\u1e42\ueb02"
        //   563: invokestatic    invokestatic   !!! ERROR
        //   566: aconst_null    
        //   567: new             Ldev/nuker/pyro/fS;
        //   570: dup            
        //   571: fconst_1       
        //   572: fconst_1       
        //   573: ldc_w           0.5
        //   576: fconst_1       
        //   577: getstatic       dev/nuker/pyro/fc.1:I
        //   580: ifeq            589
        //   583: ldc_w           600956925
        //   586: goto            592
        //   589: ldc_w           -160393750
        //   592: ldc_w           976291366
        //   595: ixor           
        //   596: lookupswitch {
        //          -1128927929: 589
        //          434166235: 696
        //          default: 624
        //        }
        //   624: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   627: getstatic       dev/nuker/pyro/fc.c:I
        //   630: ifge            639
        //   633: ldc_w           1666374555
        //   636: goto            642
        //   639: ldc_w           1909843743
        //   642: ldc_w           1577159446
        //   645: ixor           
        //   646: lookupswitch {
        //          802450441: 672
        //          1028870285: 639
        //          default: 700
        //        }
        //   672: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   675: checkcast       Ldev/nuker/pyro/f0n;
        //   678: invokevirtual   dev/nuker/pyro/faN.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   681: checkcast       Ldev/nuker/pyro/f0b;
        //   684: putfield        dev/nuker/pyro/faN.0:Ldev/nuker/pyro/f0b;
        //   687: return         
        //   688: aconst_null    
        //   689: athrow         
        //   690: aconst_null    
        //   691: athrow         
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
        //    StackMapTable: 00 2C FF 00 2C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 13 08 00 13 07 01 C0 07 01 C0 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 13 08 00 13 07 01 C0 07 01 C0 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 13 08 00 13 07 01 C0 07 01 C0 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 01 32 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 32 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 01 32 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 1E 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 BD 08 00 BD 07 01 C0 07 01 C0 05 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 BD 08 00 BD 07 01 C0 07 01 C0 05 01 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 BD 08 00 BD 07 01 C0 07 01 C0 05 01 FF 00 11 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 7F 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F 55 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 29 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 69 08 01 69 07 01 C0 07 01 C0 05 08 01 7A 08 01 7A 02 02 02 02 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 01 69 08 01 69 07 01 C0 07 01 C0 05 08 01 7A 08 01 7A 02 02 02 02 01 FF 00 1E 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 69 08 01 69 07 01 C0 07 01 C0 05 08 01 7A 08 01 7A 02 02 02 02 FF 00 14 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 7F 01 FF 00 1F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F 14 42 01 1F FF 00 28 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 08 02 37 08 02 37 02 02 02 02 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 08 02 37 08 02 37 02 02 02 02 01 FF 00 1F 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 08 02 37 08 02 37 02 02 02 02 FF 00 0E 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 07 01 9F FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 07 01 9F 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 07 01 9F 4F 07 00 03 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 69 08 01 69 07 01 C0 07 01 C0 05 08 01 7A 08 01 7A 02 02 02 02 FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 08 02 37 08 02 37 02 02 02 02 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 BD 08 00 BD 07 01 C0 07 01 C0 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 26 08 02 26 07 01 C0 07 01 C0 05 07 01 9F FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 7F FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 13 08 00 13 07 01 C0 07 01 C0 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 32 41 07 00 03
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          412
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            404
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            396
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           -1070487709
        //    34: goto            40
        //    37: ldc_w           -755760986
        //    40: ldc_w           -740855271
        //    43: ixor           
        //    44: lookupswitch {
        //          19100351: 72
        //          333895034: 37
        //          default: 381
        //        }
        //    72: iload_1        
        //    73: getstatic       dev/nuker/pyro/fc.0:I
        //    76: ifeq            85
        //    79: ldc_w           1251973283
        //    82: goto            88
        //    85: ldc_w           1887050333
        //    88: ldc_w           -1463659145
        //    91: ixor           
        //    92: lookupswitch {
        //          -659009750: 120
        //          -497168940: 85
        //          default: 379
        //        }
        //   120: aload_2        
        //   121: aload_3        
        //   122: goto            126
        //   125: athrow         
        //   126: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   129: goto            133
        //   132: athrow         
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            145
        //   139: ldc_w           1196628136
        //   142: goto            148
        //   145: ldc_w           700797581
        //   148: ldc_w           527160864
        //   151: ixor           
        //   152: lookupswitch {
        //          917406893: 180
        //          1480117896: 145
        //          default: 385
        //        }
        //   180: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   183: dup            
        //   184: pop            
        //   185: getstatic       dev/nuker/pyro/fc.1:I
        //   188: ifeq            197
        //   191: ldc_w           -499992105
        //   194: goto            200
        //   197: ldc_w           1100820784
        //   200: ldc_w           -2029606565
        //   203: ixor           
        //   204: lookupswitch {
        //          -2081010940: 197
        //          1697910924: 377
        //          default: 232
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   239: goto            243
        //   242: athrow         
        //   243: ifnull          376
        //   246: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   249: dup            
        //   250: pop            
        //   251: goto            255
        //   254: athrow         
        //   255: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   258: goto            262
        //   261: athrow         
        //   262: aload_0        
        //   263: checkcast       Ldev/nuker/pyro/faN;
        //   266: goto            270
        //   269: athrow         
        //   270: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   273: goto            277
        //   276: athrow         
        //   277: ifeq            286
        //   280: ldc_w           1957503276
        //   283: goto            289
        //   286: ldc_w           1957503277
        //   289: ldc_w           2061445438
        //   292: ixor           
        //   293: tableswitch {
        //          484708388: 316
        //          484708389: 376
        //          default: 280
        //        }
        //   316: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   319: iconst_0       
        //   320: getstatic       dev/nuker/pyro/fc.0:I
        //   323: ifeq            332
        //   326: ldc_w           -2129971448
        //   329: goto            335
        //   332: ldc_w           1744335427
        //   335: ldc_w           1950093516
        //   338: ixor           
        //   339: lookupswitch {
        //          -180934716: 332
        //          331637391: 364
        //          default: 383
        //        }
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/fx.c:(Z)V
        //   371: goto            375
        //   374: athrow         
        //   375: return         
        //   376: return         
        //   377: aconst_null    
        //   378: athrow         
        //   379: aconst_null    
        //   380: athrow         
        //   381: aconst_null    
        //   382: athrow         
        //   383: aconst_null    
        //   384: athrow         
        //   385: aconst_null    
        //   386: athrow         
        //   387: pop            
        //   388: goto            24
        //   391: pop            
        //   392: aconst_null    
        //   393: goto            387
        //   396: dup            
        //   397: ifnull          387
        //   400: checkcast       Ljava/lang/Throwable;
        //   403: athrow         
        //   404: dup            
        //   405: ifnull          391
        //   408: checkcast       Ljava/lang/Throwable;
        //   411: athrow         
        //   412: aconst_null    
        //   413: athrow         
        //    StackMapTable: 00 36 43 07 00 57 04 FF 00 0B 00 00 00 01 07 00 57 FF 00 03 00 04 07 00 03 01 07 00 A0 07 01 DA 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 00 A0 07 01 DA 00 03 07 00 03 01 01 FF 00 1F 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 03 01 44 07 00 49 FF 00 00 00 04 07 00 03 01 07 00 A0 07 01 DA 00 04 07 00 03 01 07 00 A0 07 01 DA 45 07 00 57 00 0B 42 01 1F 50 07 00 66 FF 00 02 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 66 01 5F 07 00 66 42 07 00 31 40 07 00 66 45 07 00 57 40 07 00 05 FF 00 0A 00 00 00 01 07 00 57 FF 00 00 00 04 07 00 03 01 07 00 A0 07 01 DA 00 01 07 00 66 45 07 00 57 40 07 00 05 46 07 00 57 FF 00 00 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 05 07 00 03 45 07 00 57 40 01 02 05 42 01 1A FF 00 0F 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 66 01 FF 00 02 00 04 07 00 03 01 07 00 A0 07 01 DA 00 03 07 00 66 01 01 FF 00 1C 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 66 01 42 07 00 31 FF 00 00 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 66 01 45 07 00 57 00 00 40 07 00 66 FF 00 01 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 A0 07 01 DA 00 02 07 00 66 01 01 41 07 00 57 43 05 44 07 00 57 47 05 47 07 00 57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     396    404    Any
        //  396    404    396    404    Ljava/util/ConcurrentModificationException;
        //  412    414    3      8      Any
        //  125    132    132    133    Any
        //  126    132    132    133    Ljava/lang/NegativeArraySizeException;
        //  125    132    125    126    Ljava/lang/RuntimeException;
        //  126    132    125    126    Ljava/lang/IllegalArgumentException;
        //  126    132    3      8      Any
        //  235    242    242    243    Any
        //  236    242    242    243    Any
        //  235    242    235    236    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  235    242    242    243    Ljava/lang/NullPointerException;
        //  235    242    242    243    Ljava/util/NoSuchElementException;
        //  255    261    261    262    Any
        //  255    261    3      8      Any
        //  255    261    3      8      Any
        //  255    261    261    262    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  255    261    3      8      Any
        //  269    276    276    277    Any
        //  269    276    269    270    Any
        //  269    276    276    277    Any
        //  270    276    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  269    276    276    277    Any
        //  367    374    374    375    Any
        //  368    374    3      8      Any
        //  368    374    374    375    Ljava/lang/ClassCastException;
        //  367    374    3      8      Any
        //  367    374    367    368    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    @NotNull
    public f0b 1() {
        return fbS.1D(this, 1675907773);
    }
}
