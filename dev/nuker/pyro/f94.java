// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f94 extends f8W
{
    public fbu c;
    
    @Override
    public void c() {
        fbS.d8(this, 1933728453);
    }
    
    @Override
    public void 0() {
        fbS.dW(this, 998275034);
    }
    
    public f94() {
        final fbu c = new fbu();
        while (true) {
            int n = 0;
            Label_0025: {
                if (fc.1 != 0) {
                    n = 702536041;
                    break Label_0025;
                }
                n = 310649181;
            }
            switch (n ^ 0xD7CE8051) {
                case 1029828221: {
                    continue;
                }
                default: {
                    this.c = c;
                }
                case -32417480: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void c(@NotNull final f3e f3e) {
        fbS.5M(this, 2094766815, f3e);
    }
    
    @Override
    public void c(@NotNull final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1260
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1252
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1244
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -1418575889
        //    34: goto            39
        //    37: ldc             358312200
        //    39: ldc             -259452797
        //    41: ixor           
        //    42: lookupswitch {
        //          1425506729: 37
        //          1543188332: 1233
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             -913133409
        //    77: goto            82
        //    80: ldc             195766237
        //    82: ldc             304930479
        //    84: ixor           
        //    85: lookupswitch {
        //          -608276944: 1225
        //          1595564750: 80
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //   119: goto            123
        //   122: athrow         
        //   123: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   126: if_acmpeq       130
        //   129: return         
        //   130: aload_0        
        //   131: getfield        dev/nuker/pyro/f94.c:Ldev/nuker/pyro/fbu;
        //   134: ldc2_w          100.0
        //   137: getstatic       dev/nuker/pyro/fc.c:I
        //   140: ifge            148
        //   143: ldc             -49593062
        //   145: goto            150
        //   148: ldc             -1217337176
        //   150: ldc             1356912617
        //   152: ixor           
        //   153: lookupswitch {
        //          -1377070349: 148
        //          -409977023: 180
        //          default: 1211
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   187: goto            191
        //   190: athrow         
        //   191: ifne            195
        //   194: return         
        //   195: goto            199
        //   198: athrow         
        //   199: invokestatic    dev/nuker/pyro/fbl.7:()Z
        //   202: goto            206
        //   205: athrow         
        //   206: ifne            343
        //   209: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   212: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   215: dconst_0       
        //   216: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   219: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   222: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   225: dconst_0       
        //   226: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   229: getstatic       dev/nuker/pyro/fc.1:I
        //   232: ifeq            240
        //   235: ldc             -1685225290
        //   237: goto            242
        //   240: ldc             -276646477
        //   242: ldc             1036856613
        //   244: ixor           
        //   245: lookupswitch {
        //          -1505710701: 240
        //          -766535530: 272
        //          default: 1217
        //        }
        //   272: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   275: ldc             "\u221a\u1483\u8b05\ub1cd\ucf71\uec07\ub225\ue735"
        //   277: getstatic       dev/nuker/pyro/fc.c:I
        //   280: ifge            288
        //   283: ldc             828602873
        //   285: goto            290
        //   288: ldc             2102094340
        //   290: ldc             1705023020
        //   292: ixor           
        //   293: lookupswitch {
        //          -2115018993: 288
        //          1422127061: 1219
        //          default: 320
        //        }
        //   320: goto            324
        //   323: athrow         
        //   324: invokestatic    invokestatic   !!! ERROR
        //   327: goto            331
        //   330: athrow         
        //   331: goto            335
        //   334: athrow         
        //   335: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   338: goto            342
        //   341: athrow         
        //   342: return         
        //   343: getstatic       dev/nuker/pyro/fc.1:I
        //   346: ifeq            354
        //   349: ldc             243437176
        //   351: goto            356
        //   354: ldc             2050010403
        //   356: ldc             -1806362155
        //   358: ixor           
        //   359: lookupswitch {
        //          -1697146963: 354
        //          -295324426: 384
        //          default: 1207
        //        }
        //   384: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   387: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   390: getstatic       dev/nuker/pyro/fc.c:I
        //   393: ifge            401
        //   396: ldc             -1805384355
        //   398: goto            403
        //   401: ldc             -655509973
        //   403: ldc             -974136448
        //   405: ixor           
        //   406: lookupswitch {
        //          -1087868610: 401
        //          1368121053: 1215
        //          default: 432
        //        }
        //   432: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   435: getstatic       dev/nuker/pyro/fc.c:I
        //   438: ifge            446
        //   441: ldc             -1017329418
        //   443: goto            448
        //   446: ldc             -2034346957
        //   448: ldc             1760914243
        //   450: ixor           
        //   451: lookupswitch {
        //          -1414945867: 446
        //          -297058448: 476
        //          default: 1227
        //        }
        //   476: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //   479: ifne            1202
        //   482: getstatic       dev/nuker/pyro/fc.c:I
        //   485: ifge            493
        //   488: ldc             -718454037
        //   490: goto            495
        //   493: ldc             -1216517318
        //   495: ldc             325907378
        //   497: ixor           
        //   498: lookupswitch {
        //          -1542350712: 524
        //          -968773287: 493
        //          default: 1205
        //        }
        //   524: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   527: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   530: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   533: ifeq            541
        //   536: ldc             938063412
        //   538: goto            543
        //   541: ldc             938063415
        //   543: ldc             -985406691
        //   545: ixor           
        //   546: tableswitch {
        //          -447436206: 568
        //          -447436205: 1202
        //          default: 536
        //        }
        //   568: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   571: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   574: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70173_aa:I
        //   577: iconst_2       
        //   578: irem           
        //   579: ifne            887
        //   582: aload_1        
        //   583: getstatic       dev/nuker/pyro/fc.1:I
        //   586: ifeq            594
        //   589: ldc             -219866313
        //   591: goto            596
        //   594: ldc             -982160763
        //   596: ldc             308870983
        //   598: ixor           
        //   599: lookupswitch {
        //          -685926974: 624
        //          -527571856: 594
        //          default: 1229
        //        }
        //   624: goto            628
        //   627: athrow         
        //   628: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //   631: goto            635
        //   634: athrow         
        //   635: getstatic       dev/nuker/pyro/fc.0:I
        //   638: ifeq            646
        //   641: ldc             1859522084
        //   643: goto            648
        //   646: ldc             1615296811
        //   648: ldc             904903083
        //   650: ixor           
        //   651: lookupswitch {
        //          1437122688: 676
        //          1530509199: 646
        //          default: 1231
        //        }
        //   676: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   679: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   682: dup            
        //   683: pop            
        //   684: goto            688
        //   687: athrow         
        //   688: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   691: goto            695
        //   694: athrow         
        //   695: goto            699
        //   698: athrow         
        //   699: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   702: goto            706
        //   705: athrow         
        //   706: goto            710
        //   709: athrow         
        //   710: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   713: goto            717
        //   716: athrow         
        //   717: goto            721
        //   720: athrow         
        //   721: invokestatic    dev/nuker/pyro/fbA.c:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/Material;
        //   724: goto            728
        //   727: athrow         
        //   728: goto            732
        //   731: athrow         
        //   732: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //   735: goto            739
        //   738: athrow         
        //   739: ifeq            817
        //   742: aload_1        
        //   743: aload_1        
        //   744: getstatic       dev/nuker/pyro/fc.1:I
        //   747: ifeq            755
        //   750: ldc             -952373540
        //   752: goto            757
        //   755: ldc             -2117469162
        //   757: ldc             165475794
        //   759: ixor           
        //   760: lookupswitch {
        //          -2011887164: 788
        //          -823715058: 755
        //          default: 1221
        //        }
        //   788: goto            792
        //   791: athrow         
        //   792: invokevirtual   dev/nuker/pyro/f3i.4:()D
        //   795: goto            799
        //   798: athrow         
        //   799: ldc2_w          0.2
        //   802: dadd           
        //   803: goto            807
        //   806: athrow         
        //   807: invokevirtual   dev/nuker/pyro/f3i.c:(D)V
        //   810: goto            814
        //   813: athrow         
        //   814: goto            887
        //   817: aload_1        
        //   818: getstatic       dev/nuker/pyro/fc.c:I
        //   821: ifge            829
        //   824: ldc             -1666816241
        //   826: goto            831
        //   829: ldc             -97844294
        //   831: ldc             1116889257
        //   833: ixor           
        //   834: lookupswitch {
        //          -567015514: 1223
        //          1534168397: 829
        //          default: 860
        //        }
        //   860: aload_1        
        //   861: goto            865
        //   864: athrow         
        //   865: invokevirtual   dev/nuker/pyro/f3i.4:()D
        //   868: goto            872
        //   871: athrow         
        //   872: ldc2_w          0.424999997
        //   875: dadd           
        //   876: goto            880
        //   879: athrow         
        //   880: invokevirtual   dev/nuker/pyro/f3i.c:(D)V
        //   883: goto            887
        //   886: athrow         
        //   887: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7Y;
        //   890: goto            894
        //   893: athrow         
        //   894: invokevirtual   dev/nuker/pyro/f7Y.1:()Ldev/nuker/pyro/f0a;
        //   897: goto            901
        //   900: athrow         
        //   901: goto            905
        //   904: athrow         
        //   905: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   908: goto            912
        //   911: athrow         
        //   912: checkcast       Ljava/lang/Boolean;
        //   915: goto            919
        //   918: athrow         
        //   919: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   922: goto            926
        //   925: athrow         
        //   926: ifeq            1047
        //   929: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   932: ldc             "\u221a\u1483\u8b05\ub1cd\ucf71\uec07\ub225\ue735"
        //   934: getstatic       dev/nuker/pyro/fc.0:I
        //   937: ifeq            945
        //   940: ldc             -1221027026
        //   942: goto            947
        //   945: ldc             -497402375
        //   947: ldc             200127847
        //   949: ixor           
        //   950: lookupswitch {
        //          -1126879671: 945
        //          -373847906: 976
        //          default: 1213
        //        }
        //   976: goto            980
        //   979: athrow         
        //   980: invokestatic    invokestatic   !!! ERROR
        //   983: goto            987
        //   986: athrow         
        //   987: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   990: ldc             1.3
        //   992: getstatic       dev/nuker/pyro/fc.1:I
        //   995: ifeq            1003
        //   998: ldc             1713894271
        //  1000: goto            1005
        //  1003: ldc             -707042404
        //  1005: ldc_w           608027831
        //  1008: ixor           
        //  1009: lookupswitch {
        //          -236542165: 1036
        //          1109014472: 1003
        //          default: 1209
        //        }
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1050: getstatic       dev/nuker/pyro/fc.0:I
        //  1053: ifeq            1062
        //  1056: ldc_w           2021846832
        //  1059: goto            1065
        //  1062: ldc_w           1076316213
        //  1065: ldc_w           230215053
        //  1068: ixor           
        //  1069: lookupswitch {
        //          1302300088: 1096
        //          1966744253: 1062
        //          default: 1203
        //        }
        //  1096: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1099: dup            
        //  1100: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //  1103: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1106: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1109: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70173_aa:I
        //  1112: iconst_2       
        //  1113: irem           
        //  1114: ifeq            1123
        //  1117: ldc_w           -2019737025
        //  1120: goto            1126
        //  1123: ldc_w           -2019737026
        //  1126: ldc_w           1506939961
        //  1129: ixor           
        //  1130: tableswitch {
        //          -1130451956: 1152
        //          -1130451955: 1158
        //          default: 1117
        //        }
        //  1152: ldc2_w          2.0
        //  1155: goto            1161
        //  1158: ldc2_w          0.705
        //  1161: dmul           
        //  1162: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //  1165: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1168: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1171: dup            
        //  1172: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //  1175: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1178: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1181: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70173_aa:I
        //  1184: iconst_2       
        //  1185: irem           
        //  1186: ifeq            1195
        //  1189: ldc2_w          2.0
        //  1192: goto            1198
        //  1195: ldc2_w          0.705
        //  1198: dmul           
        //  1199: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //  1202: return         
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
        //  1235: pop            
        //  1236: goto            24
        //  1239: pop            
        //  1240: aconst_null    
        //  1241: goto            1235
        //  1244: dup            
        //  1245: ifnull          1235
        //  1248: checkcast       Ljava/lang/Throwable;
        //  1251: athrow         
        //  1252: dup            
        //  1253: ifnull          1239
        //  1256: checkcast       Ljava/lang/Throwable;
        //  1259: athrow         
        //  1260: aconst_null    
        //  1261: athrow         
        //    StackMapTable: 00 AA 43 07 00 4D 04 FF 00 0B 00 00 00 01 07 00 4D FD 00 03 07 00 03 07 00 55 0C 41 01 1C 4B 07 00 55 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 55 01 5D 07 00 55 42 07 00 41 40 07 00 55 45 07 00 4D 40 07 00 5A 06 FF 00 11 00 02 07 00 03 07 00 55 00 02 07 00 19 03 FF 00 01 00 02 07 00 03 07 00 55 00 03 07 00 19 03 01 FF 00 1D 00 02 07 00 03 07 00 55 00 02 07 00 19 03 42 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 19 03 45 07 00 4D 40 01 03 FF 00 02 00 00 00 01 07 00 4D FD 00 00 07 00 03 07 00 55 45 07 00 4D 40 01 21 41 01 1D FF 00 0F 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F FF 00 01 00 02 07 00 03 07 00 55 00 03 07 00 84 07 01 0F 01 FF 00 1D 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 42 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 45 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 42 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 45 07 00 4D 00 00 0A 41 01 1B 50 07 00 78 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 78 01 5C 07 00 78 4D 07 00 A3 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 A3 01 5B 07 00 A3 10 41 01 1C 0B 04 41 01 18 59 07 00 55 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 55 01 5B 07 00 55 FF 00 02 00 00 00 01 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 01 07 00 55 45 07 00 4D 00 0A 41 01 1B 4A 07 00 4D 40 07 00 78 45 07 00 4D 40 07 00 C1 42 07 00 4D 40 07 00 C1 45 07 00 4D 40 07 00 C1 42 07 00 4D 40 07 00 C1 45 07 00 4D 40 07 00 C1 42 07 00 31 40 07 00 C1 45 07 00 4D 40 07 00 CB 42 07 00 41 40 07 00 CB 45 07 00 4D 40 01 FF 00 0F 00 02 07 00 03 07 00 55 00 02 07 00 55 07 00 55 FF 00 01 00 02 07 00 03 07 00 55 00 03 07 00 55 07 00 55 01 FF 00 1E 00 02 07 00 03 07 00 55 00 02 07 00 55 07 00 55 42 07 00 31 FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 07 00 55 45 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 03 46 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 03 45 07 00 4D 00 02 4B 07 00 55 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 55 01 5C 07 00 55 43 07 00 47 FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 07 00 55 45 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 03 FF 00 06 00 00 00 01 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 55 03 45 07 00 4D 00 45 07 00 4D 40 07 00 E6 45 07 00 4D 40 07 00 EB 42 07 00 41 40 07 00 EB 45 07 00 4D 40 07 01 11 FF 00 05 00 00 00 01 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 01 07 00 F1 45 07 00 4D 40 01 FF 00 12 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F FF 00 01 00 02 07 00 03 07 00 55 00 03 07 00 84 07 01 0F 01 FF 00 1C 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 42 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 45 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F FF 00 0F 00 02 07 00 03 07 00 55 00 04 07 00 84 07 01 0F 07 00 F9 02 FF 00 01 00 02 07 00 03 07 00 55 00 05 07 00 84 07 01 0F 07 00 F9 02 01 FF 00 1E 00 02 07 00 03 07 00 55 00 04 07 00 84 07 01 0F 07 00 F9 02 42 07 00 4D FF 00 00 00 02 07 00 03 07 00 55 00 04 07 00 84 07 01 0F 07 00 F9 02 45 07 00 4D 00 4E 07 00 72 FF 00 02 00 02 07 00 03 07 00 55 00 02 07 00 72 01 5E 07 00 72 FF 00 14 00 02 07 00 03 07 00 55 00 02 07 00 78 03 FF 00 05 00 02 07 00 03 07 00 55 00 02 07 00 78 03 FF 00 02 00 02 07 00 03 07 00 55 00 03 07 00 78 03 01 FF 00 19 00 02 07 00 03 07 00 55 00 02 07 00 78 03 FF 00 05 00 02 07 00 03 07 00 55 00 02 07 00 78 03 FF 00 02 00 02 07 00 03 07 00 55 00 03 07 00 78 03 03 FF 00 21 00 02 07 00 03 07 00 55 00 02 07 00 78 03 FF 00 02 00 02 07 00 03 07 00 55 00 03 07 00 78 03 03 03 40 07 00 72 01 01 FF 00 01 00 02 07 00 03 07 00 55 00 04 07 00 84 07 01 0F 07 00 F9 02 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 19 03 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F 41 07 00 78 01 FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 84 07 01 0F FF 00 01 00 02 07 00 03 07 00 55 00 02 07 00 55 07 00 55 41 07 00 55 41 07 00 55 41 07 00 A3 41 07 00 55 01 01 41 07 00 4D 43 05 44 07 00 4D 47 05 47 07 00 4D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1244   1252   Ljava/lang/ClassCastException;
        //  1244   1252   1244   1252   Any
        //  1260   1262   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  115    122    122    123    Any
        //  116    122    122    123    Ljava/lang/ArithmeticException;
        //  115    122    115    116    Ljava/lang/IllegalStateException;
        //  116    122    115    116    Ljava/lang/IndexOutOfBoundsException;
        //  115    122    3      8      Ljava/lang/UnsupportedOperationException;
        //  183    190    190    191    Any
        //  183    190    183    184    Ljava/lang/IndexOutOfBoundsException;
        //  183    190    183    184    Any
        //  184    190    3      8      Ljava/lang/AssertionError;
        //  184    190    3      8      Any
        //  199    205    205    206    Any
        //  199    205    205    206    Any
        //  199    205    205    206    Any
        //  199    205    3      8      Any
        //  199    205    205    206    Any
        //  323    330    330    331    Any
        //  324    330    330    331    Any
        //  324    330    323    324    Any
        //  323    330    3      8      Ljava/lang/IllegalStateException;
        //  324    330    3      8      Ljava/lang/ArithmeticException;
        //  334    341    341    342    Any
        //  335    341    341    342    Any
        //  334    341    3      8      Ljava/lang/IllegalArgumentException;
        //  335    341    334    335    Any
        //  334    341    341    342    Ljava/lang/AssertionError;
        //  628    634    634    635    Any
        //  628    634    3      8      Any
        //  628    634    634    635    Ljava/lang/UnsupportedOperationException;
        //  628    634    3      8      Ljava/lang/ArithmeticException;
        //  628    634    634    635    Ljava/util/NoSuchElementException;
        //  687    694    694    695    Any
        //  687    694    687    688    Ljava/lang/NullPointerException;
        //  688    694    694    695    Any
        //  688    694    687    688    Any
        //  687    694    3      8      Ljava/lang/UnsupportedOperationException;
        //  698    705    705    706    Any
        //  699    705    698    699    Any
        //  698    705    705    706    Ljava/lang/RuntimeException;
        //  699    705    698    699    Any
        //  699    705    698    699    Any
        //  709    716    716    717    Any
        //  709    716    716    717    Any
        //  710    716    709    710    Any
        //  709    716    716    717    Ljava/lang/EnumConstantNotPresentException;
        //  709    716    716    717    Any
        //  720    727    727    728    Any
        //  721    727    3      8      Ljava/lang/AssertionError;
        //  721    727    720    721    Ljava/lang/IndexOutOfBoundsException;
        //  721    727    3      8      Ljava/lang/UnsupportedOperationException;
        //  721    727    3      8      Any
        //  731    738    738    739    Any
        //  731    738    738    739    Any
        //  732    738    3      8      Any
        //  732    738    731    732    Ljava/lang/IndexOutOfBoundsException;
        //  731    738    731    732    Ljava/lang/NullPointerException;
        //  791    798    798    799    Any
        //  791    798    3      8      Any
        //  792    798    791    792    Ljava/lang/IndexOutOfBoundsException;
        //  792    798    3      8      Ljava/lang/ArithmeticException;
        //  791    798    791    792    Ljava/lang/StringIndexOutOfBoundsException;
        //  806    813    813    814    Any
        //  806    813    3      8      Any
        //  806    813    806    807    Any
        //  807    813    806    807    Ljava/lang/StringIndexOutOfBoundsException;
        //  806    813    813    814    Any
        //  864    871    871    872    Any
        //  865    871    871    872    Any
        //  864    871    3      8      Ljava/lang/IllegalArgumentException;
        //  864    871    864    865    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  865    871    871    872    Ljava/util/ConcurrentModificationException;
        //  880    886    886    887    Any
        //  880    886    886    887    Any
        //  880    886    886    887    Ljava/lang/ArithmeticException;
        //  880    886    886    887    Any
        //  880    886    3      8      Ljava/lang/AssertionError;
        //  893    900    900    901    Any
        //  894    900    3      8      Any
        //  893    900    893    894    Any
        //  893    900    893    894    Ljava/util/NoSuchElementException;
        //  893    900    3      8      Any
        //  904    911    911    912    Any
        //  905    911    911    912    Ljava/lang/IllegalStateException;
        //  904    911    911    912    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  905    911    904    905    Ljava/lang/RuntimeException;
        //  905    911    3      8      Any
        //  919    925    925    926    Any
        //  919    925    925    926    Any
        //  919    925    925    926    Any
        //  919    925    925    926    Ljava/lang/AssertionError;
        //  919    925    925    926    Any
        //  979    986    986    987    Any
        //  980    986    3      8      Any
        //  979    986    979    980    Any
        //  979    986    986    987    Any
        //  980    986    3      8      Any
        //  1039   1046   1046   1047   Any
        //  1040   1046   1039   1040   Any
        //  1039   1046   1039   1040   Any
        //  1039   1046   3      8      Any
        //  1039   1046   3      8      Any
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
    
    static {
        throw t;
    }
}
