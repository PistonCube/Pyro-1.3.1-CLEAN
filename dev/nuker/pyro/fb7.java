// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.EntityLivingBase;

public class fb7 extends fbk
{
    public static float c(final double p0, final double p1, final double p2, final EntityLivingBase p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1201
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1193
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1185
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload           6
        //    26: getstatic       dev/nuker/pyro/fb7.c:Lnet/minecraft/client/Minecraft;
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            40
        //    35: ldc             1853938525
        //    37: goto            42
        //    40: ldc             588325311
        //    42: ldc             1908711340
        //    44: ixor           
        //    45: lookupswitch {
        //          81381930: 40
        //          524567793: 1168
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: if_acmpne       83
        //    78: ldc             -1472640573
        //    80: goto            85
        //    83: ldc             -1472640574
        //    85: ldc             62249285
        //    87: ixor           
        //    88: tableswitch {
        //          1461264652: 112
        //          1461264653: 215
        //          default: 78
        //        }
        //   112: getstatic       dev/nuker/pyro/fc.c:I
        //   115: ifge            123
        //   118: ldc             767839452
        //   120: goto            125
        //   123: ldc             1800055363
        //   125: ldc             645609542
        //   127: ixor           
        //   128: lookupswitch {
        //          197096602: 1148
        //          1430422084: 123
        //          default: 156
        //        }
        //   156: getstatic       dev/nuker/pyro/fb7.c:Lnet/minecraft/client/Minecraft;
        //   159: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   162: getstatic       dev/nuker/pyro/fc.0:I
        //   165: ifeq            173
        //   168: ldc             320816418
        //   170: goto            175
        //   173: ldc             -839706273
        //   175: ldc             792075891
        //   177: ixor           
        //   178: lookupswitch {
        //          360936962: 173
        //          1009343313: 1150
        //          default: 204
        //        }
        //   204: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71075_bZ:Lnet/minecraft/entity/player/PlayerCapabilities;
        //   207: getfield        net/minecraft/entity/player/PlayerCapabilities.field_75098_d:Z
        //   210: ifeq            215
        //   213: fconst_0       
        //   214: freturn        
        //   215: aload           6
        //   217: getstatic       dev/nuker/pyro/fc.1:I
        //   220: ifeq            228
        //   223: ldc             -636313720
        //   225: goto            230
        //   228: ldc             -1575641956
        //   230: ldc             -1452395299
        //   232: ixor           
        //   233: lookupswitch {
        //          192653377: 260
        //          1937550165: 228
        //          default: 1166
        //        }
        //   260: dload_0        
        //   261: dload_2        
        //   262: getstatic       dev/nuker/pyro/fc.c:I
        //   265: ifge            273
        //   268: ldc             1262824374
        //   270: goto            275
        //   273: ldc             1027522044
        //   275: ldc             95770383
        //   277: ixor           
        //   278: lookupswitch {
        //          948693747: 304
        //          1324383417: 273
        //          default: 1144
        //        }
        //   304: dload           4
        //   306: getstatic       dev/nuker/pyro/fc.0:I
        //   309: ifeq            317
        //   312: ldc             -277284195
        //   314: goto            319
        //   317: ldc             303451292
        //   319: ldc             112912625
        //   321: ixor           
        //   322: lookupswitch {
        //          -1517439252: 317
        //          -373157268: 1146
        //          default: 348
        //        }
        //   348: goto            352
        //   351: athrow         
        //   352: invokevirtual   net/minecraft/entity/EntityLivingBase.func_70011_f:(DDD)D
        //   355: goto            359
        //   358: athrow         
        //   359: ldc2_w          12.0
        //   362: ddiv           
        //   363: dup2           
        //   364: dstore          7
        //   366: dconst_1       
        //   367: dcmpl          
        //   368: ifle            373
        //   371: fconst_0       
        //   372: freturn        
        //   373: dconst_1       
        //   374: dload           7
        //   376: dsub           
        //   377: aload           6
        //   379: getfield        net/minecraft/entity/EntityLivingBase.field_70170_p:Lnet/minecraft/world/World;
        //   382: new             Lnet/minecraft/util/math/Vec3d;
        //   385: dup            
        //   386: getstatic       dev/nuker/pyro/fc.0:I
        //   389: ifeq            397
        //   392: ldc             -839126125
        //   394: goto            399
        //   397: ldc             233850976
        //   399: ldc             1724275093
        //   401: ixor           
        //   402: lookupswitch {
        //          -1422022138: 1158
        //          -1335779286: 397
        //          default: 428
        //        }
        //   428: dload_0        
        //   429: dload_2        
        //   430: dload           4
        //   432: getstatic       dev/nuker/pyro/fc.c:I
        //   435: ifge            443
        //   438: ldc             257722464
        //   440: goto            445
        //   443: ldc             -1170163653
        //   445: ldc             928506792
        //   447: ixor           
        //   448: lookupswitch {
        //          -1375211621: 443
        //          940272584: 1174
        //          default: 476
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   483: goto            487
        //   486: athrow         
        //   487: aload           6
        //   489: goto            493
        //   492: athrow         
        //   493: invokevirtual   net/minecraft/entity/EntityLivingBase.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   496: goto            500
        //   499: athrow         
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   net/minecraft/world/World.func_72842_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/AxisAlignedBB;)F
        //   507: goto            511
        //   510: athrow         
        //   511: f2d            
        //   512: dmul           
        //   513: dstore          9
        //   515: dload           9
        //   517: dload           9
        //   519: dmul           
        //   520: dload           9
        //   522: dadd           
        //   523: ldc2_w          2.0
        //   526: ddiv           
        //   527: ldc2_w          7.0
        //   530: dmul           
        //   531: ldc2_w          12.0
        //   534: dmul           
        //   535: dconst_1       
        //   536: dadd           
        //   537: d2i            
        //   538: i2f            
        //   539: goto            543
        //   542: athrow         
        //   543: invokestatic    dev/nuker/pyro/fb7.c:(F)F
        //   546: goto            550
        //   549: athrow         
        //   550: getstatic       dev/nuker/pyro/fc.1:I
        //   553: ifeq            561
        //   556: ldc             -501856762
        //   558: goto            563
        //   561: ldc             -901142625
        //   563: ldc             2043476996
        //   565: ixor           
        //   566: lookupswitch {
        //          -1680164350: 561
        //          -1283105893: 592
        //          default: 1170
        //        }
        //   592: fstore          11
        //   594: new             Lnet/minecraft/world/Explosion;
        //   597: dup            
        //   598: getstatic       dev/nuker/pyro/fb7.c:Lnet/minecraft/client/Minecraft;
        //   601: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   604: getstatic       dev/nuker/pyro/fb7.c:Lnet/minecraft/client/Minecraft;
        //   607: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   610: getstatic       dev/nuker/pyro/fc.1:I
        //   613: ifeq            621
        //   616: ldc             1831599239
        //   618: goto            623
        //   621: ldc             682535206
        //   623: ldc             -394336971
        //   625: ixor           
        //   626: lookupswitch {
        //          -2058020430: 1164
        //          -8926493: 621
        //          default: 652
        //        }
        //   652: dload_0        
        //   653: dload_2        
        //   654: dload           4
        //   656: ldc             6.0
        //   658: iconst_0       
        //   659: iconst_1       
        //   660: getstatic       dev/nuker/pyro/fc.1:I
        //   663: ifeq            671
        //   666: ldc             124980331
        //   668: goto            673
        //   671: ldc             982836154
        //   673: ldc             -1455540911
        //   675: ixor           
        //   676: lookupswitch {
        //          -1370670790: 1156
        //          1814619: 671
        //          default: 704
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokespecial   net/minecraft/world/Explosion.<init>:(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;DDDFZZ)V
        //   711: goto            715
        //   714: athrow         
        //   715: goto            719
        //   718: athrow         
        //   719: invokestatic    net/minecraft/util/DamageSource.func_94539_a:(Lnet/minecraft/world/Explosion;)Lnet/minecraft/util/DamageSource;
        //   722: goto            726
        //   725: athrow         
        //   726: astore          12
        //   728: fload           11
        //   730: getstatic       dev/nuker/pyro/fc.1:I
        //   733: ifeq            741
        //   736: ldc             -1394048191
        //   738: goto            743
        //   741: ldc             920975648
        //   743: ldc             678220195
        //   745: ixor           
        //   746: lookupswitch {
        //          -2071702814: 1160
        //          -721197479: 741
        //          default: 772
        //        }
        //   772: aload           6
        //   774: goto            778
        //   777: athrow         
        //   778: invokevirtual   net/minecraft/entity/EntityLivingBase.func_70658_aO:()I
        //   781: goto            785
        //   784: athrow         
        //   785: i2f            
        //   786: getstatic       dev/nuker/pyro/fc.0:I
        //   789: ifeq            797
        //   792: ldc             1033859912
        //   794: goto            799
        //   797: ldc             -1063442262
        //   799: ldc             -630194461
        //   801: ixor           
        //   802: lookupswitch {
        //          -403665493: 797
        //          452122185: 828
        //          default: 1172
        //        }
        //   828: aload           6
        //   830: getstatic       net/minecraft/entity/SharedMonsterAttributes.field_189429_h:Lnet/minecraft/entity/ai/attributes/IAttribute;
        //   833: goto            837
        //   836: athrow         
        //   837: invokevirtual   net/minecraft/entity/EntityLivingBase.func_110148_a:(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
        //   840: goto            844
        //   843: athrow         
        //   844: goto            848
        //   847: athrow         
        //   848: invokeinterface net/minecraft/entity/ai/attributes/IAttributeInstance.func_111126_e:()D
        //   853: goto            857
        //   856: athrow         
        //   857: d2f            
        //   858: goto            862
        //   861: athrow         
        //   862: invokestatic    net/minecraft/util/CombatRules.func_189427_a:(FFF)F
        //   865: goto            869
        //   868: athrow         
        //   869: fstore          13
        //   871: aload           6
        //   873: goto            877
        //   876: athrow         
        //   877: invokevirtual   net/minecraft/entity/EntityLivingBase.func_184193_aE:()Ljava/lang/Iterable;
        //   880: goto            884
        //   883: athrow         
        //   884: aload           12
        //   886: getstatic       dev/nuker/pyro/fc.c:I
        //   889: ifge            897
        //   892: ldc             937177334
        //   894: goto            899
        //   897: ldc             -520869699
        //   899: ldc             1723183772
        //   901: ixor           
        //   902: lookupswitch {
        //          -2042521055: 928
        //          1365869162: 897
        //          default: 1154
        //        }
        //   928: goto            932
        //   931: athrow         
        //   932: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77508_a:(Ljava/lang/Iterable;Lnet/minecraft/util/DamageSource;)I
        //   935: goto            939
        //   938: athrow         
        //   939: dup            
        //   940: istore          14
        //   942: ifle            1045
        //   945: fload           13
        //   947: getstatic       dev/nuker/pyro/fc.1:I
        //   950: ifeq            958
        //   953: ldc             915631328
        //   955: goto            960
        //   958: ldc             1852171339
        //   960: ldc             1335186273
        //   962: ixor           
        //   963: lookupswitch {
        //          569423658: 988
        //          2030452609: 958
        //          default: 1152
        //        }
        //   988: iload           14
        //   990: i2f            
        //   991: getstatic       dev/nuker/pyro/fc.c:I
        //   994: ifge            1002
        //   997: ldc             2011610746
        //   999: goto            1004
        //  1002: ldc             -1214403371
        //  1004: ldc             -1514074971
        //  1006: ixor           
        //  1007: lookupswitch {
        //          -1848913875: 1002
        //          -769150241: 1162
        //          default: 1032
        //        }
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: invokestatic    net/minecraft/util/CombatRules.func_188401_b:(FF)F
        //  1039: goto            1043
        //  1042: athrow         
        //  1043: fstore          13
        //  1045: aload           6
        //  1047: getstatic       net/minecraft/init/MobEffects.field_76429_m:Lnet/minecraft/potion/Potion;
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: invokevirtual   net/minecraft/entity/EntityLivingBase.func_70660_b:(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;
        //  1057: goto            1061
        //  1060: athrow         
        //  1061: dup            
        //  1062: astore          15
        //  1064: ifnull          1072
        //  1067: ldc             -1609363657
        //  1069: goto            1074
        //  1072: ldc             -1609363660
        //  1074: ldc             284271698
        //  1076: ixor           
        //  1077: tableswitch {
        //          1640322762: 1100
        //          1640322763: 1129
        //          default: 1067
        //        }
        //  1100: fload           13
        //  1102: bipush          25
        //  1104: aload           15
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   net/minecraft/potion/PotionEffect.func_76458_c:()I
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: iconst_1       
        //  1118: iadd           
        //  1119: iconst_5       
        //  1120: imul           
        //  1121: isub           
        //  1122: i2f            
        //  1123: fmul           
        //  1124: ldc             25.0
        //  1126: fdiv           
        //  1127: fstore          13
        //  1129: fload           13
        //  1131: fconst_0       
        //  1132: goto            1136
        //  1135: athrow         
        //  1136: invokestatic    java/lang/Math.max:(FF)F
        //  1139: goto            1143
        //  1142: athrow         
        //  1143: freturn        
        //  1144: aconst_null    
        //  1145: athrow         
        //  1146: aconst_null    
        //  1147: athrow         
        //  1148: aconst_null    
        //  1149: athrow         
        //  1150: aconst_null    
        //  1151: athrow         
        //  1152: aconst_null    
        //  1153: athrow         
        //  1154: aconst_null    
        //  1155: athrow         
        //  1156: aconst_null    
        //  1157: athrow         
        //  1158: aconst_null    
        //  1159: athrow         
        //  1160: aconst_null    
        //  1161: athrow         
        //  1162: aconst_null    
        //  1163: athrow         
        //  1164: aconst_null    
        //  1165: athrow         
        //  1166: aconst_null    
        //  1167: athrow         
        //  1168: aconst_null    
        //  1169: athrow         
        //  1170: aconst_null    
        //  1171: athrow         
        //  1172: aconst_null    
        //  1173: athrow         
        //  1174: aconst_null    
        //  1175: athrow         
        //  1176: pop            
        //  1177: goto            24
        //  1180: pop            
        //  1181: aconst_null    
        //  1182: goto            1176
        //  1185: dup            
        //  1186: ifnull          1176
        //  1189: checkcast       Ljava/lang/Throwable;
        //  1192: athrow         
        //  1193: dup            
        //  1194: ifnull          1180
        //  1197: checkcast       Ljava/lang/Throwable;
        //  1200: athrow         
        //  1201: aconst_null    
        //  1202: athrow         
        //    StackMapTable: 00 99 FF 00 03 00 05 03 03 03 07 00 5C 03 00 01 07 00 2A FA 00 04 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 04 03 03 03 07 00 5C 00 00 FF 00 0F 00 04 03 03 03 07 00 5C 00 02 07 00 5C 07 00 35 FF 00 01 00 04 03 03 03 07 00 5C 00 03 07 00 5C 07 00 35 01 FF 00 1D 00 04 03 03 03 07 00 5C 00 02 07 00 5C 07 00 35 05 04 41 01 1A 0A 41 01 1E 50 07 00 47 FF 00 01 00 04 03 03 03 07 00 5C 00 02 07 00 47 01 5C 07 00 47 0A 4C 07 00 5C FF 00 01 00 04 03 03 03 07 00 5C 00 02 07 00 5C 01 5D 07 00 5C FF 00 0C 00 04 03 03 03 07 00 5C 00 03 07 00 5C 03 03 FF 00 01 00 04 03 03 03 07 00 5C 00 04 07 00 5C 03 03 01 FF 00 1C 00 04 03 03 03 07 00 5C 00 03 07 00 5C 03 03 FF 00 0C 00 04 03 03 03 07 00 5C 00 04 07 00 5C 03 03 03 FF 00 01 00 04 03 03 03 07 00 5C 00 05 07 00 5C 03 03 03 01 FF 00 1C 00 04 03 03 03 07 00 5C 00 04 07 00 5C 03 03 03 42 07 00 09 FF 00 00 00 04 03 03 03 07 00 5C 00 04 07 00 5C 03 03 03 45 07 00 2A 40 03 FC 00 0D 03 FF 00 17 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 08 01 7E 08 01 7E FF 00 01 00 05 03 03 03 07 00 5C 03 00 05 03 07 00 78 08 01 7E 08 01 7E 01 FF 00 1C 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 08 01 7E 08 01 7E FF 00 0E 00 05 03 03 03 07 00 5C 03 00 07 03 07 00 78 08 01 7E 08 01 7E 03 03 03 FF 00 01 00 05 03 03 03 07 00 5C 03 00 08 03 07 00 78 08 01 7E 08 01 7E 03 03 03 01 FF 00 1E 00 05 03 03 03 07 00 5C 03 00 07 03 07 00 78 08 01 7E 08 01 7E 03 03 03 42 07 00 2A FF 00 00 00 05 03 03 03 07 00 5C 03 00 07 03 07 00 78 08 01 7E 08 01 7E 03 03 03 45 07 00 2A FF 00 00 00 05 03 03 03 07 00 5C 03 00 03 03 07 00 78 07 00 68 44 07 00 2A FF 00 00 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 07 00 68 07 00 5C 45 07 00 2A FF 00 00 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 07 00 68 07 00 ED 42 07 00 11 FF 00 00 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 07 00 68 07 00 ED 45 07 00 2A FF 00 00 00 05 03 03 03 07 00 5C 03 00 02 03 02 FF 00 1E 00 06 03 03 03 07 00 5C 03 03 00 01 07 00 11 40 02 45 07 00 2A 40 02 4A 02 FF 00 01 00 06 03 03 03 07 00 5C 03 03 00 02 02 01 5C 02 FF 00 1C 00 07 03 03 03 07 00 5C 03 03 02 00 04 08 02 52 08 02 52 07 00 EF 07 00 47 FF 00 01 00 07 03 03 03 07 00 5C 03 03 02 00 05 08 02 52 08 02 52 07 00 EF 07 00 47 01 FF 00 1C 00 07 03 03 03 07 00 5C 03 03 02 00 04 08 02 52 08 02 52 07 00 EF 07 00 47 FF 00 12 00 07 03 03 03 07 00 5C 03 03 02 00 0A 08 02 52 08 02 52 07 00 EF 07 00 47 03 03 03 02 01 01 FF 00 01 00 07 03 03 03 07 00 5C 03 03 02 00 0B 08 02 52 08 02 52 07 00 EF 07 00 47 03 03 03 02 01 01 01 FF 00 1E 00 07 03 03 03 07 00 5C 03 03 02 00 0A 08 02 52 08 02 52 07 00 EF 07 00 47 03 03 03 02 01 01 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 07 03 03 03 07 00 5C 03 03 02 00 0A 08 02 52 08 02 52 07 00 EF 07 00 47 03 03 03 02 01 01 45 07 00 2A 40 07 00 88 42 07 00 2A 40 07 00 88 45 07 00 2A 40 07 00 98 FF 00 0E 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 01 02 FF 00 01 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 01 5C 02 FF 00 04 00 00 00 01 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 07 00 5C 45 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 01 FF 00 0B 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 02 FF 00 01 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 03 02 02 01 FF 00 1C 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 02 47 07 00 09 FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 04 02 02 07 00 5C 07 00 F1 45 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 03 02 02 07 00 B2 42 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 03 02 02 07 00 B2 47 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 03 02 02 03 43 07 00 2A FF 00 00 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 03 02 02 02 45 07 00 2A 40 02 FF 00 06 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 01 07 00 1F 40 07 00 5C 45 07 00 2A 40 07 00 F3 FF 00 0C 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 02 07 00 F3 07 00 98 FF 00 01 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 03 07 00 F3 07 00 98 01 FF 00 1C 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 02 07 00 F3 07 00 98 42 07 00 2A FF 00 00 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 02 07 00 F3 07 00 98 45 07 00 2A 40 01 FF 00 12 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 01 02 FF 00 01 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 02 01 5B 02 FF 00 0D 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 02 02 FF 00 01 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 03 02 02 01 FF 00 1B 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 02 02 42 07 00 0D FF 00 00 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 02 02 45 07 00 2A 40 02 01 FF 00 07 00 00 00 01 07 00 2A FF 00 00 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 07 00 5C 07 00 F5 45 07 00 2A 40 07 00 E2 FC 00 05 07 00 E2 04 41 01 19 48 07 00 1F FF 00 00 00 0B 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 07 00 E2 00 03 02 01 07 00 E2 45 07 00 2A FF 00 00 00 0B 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 07 00 E2 00 03 02 01 01 0B 45 07 00 2A FF 00 00 00 0B 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 07 00 E2 00 02 02 02 45 07 00 2A 40 02 FF 00 00 00 04 03 03 03 07 00 5C 00 03 07 00 5C 03 03 FF 00 01 00 04 03 03 03 07 00 5C 00 04 07 00 5C 03 03 03 01 41 07 00 47 FF 00 01 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 01 02 FF 00 01 00 09 03 03 03 07 00 5C 03 03 02 07 00 98 02 00 02 07 00 F3 07 00 98 FF 00 01 00 07 03 03 03 07 00 5C 03 03 02 00 0A 08 02 52 08 02 52 07 00 EF 07 00 47 03 03 03 02 01 01 FF 00 01 00 05 03 03 03 07 00 5C 03 00 04 03 07 00 78 08 01 7E 08 01 7E FF 00 01 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 01 02 FF 00 01 00 0A 03 03 03 07 00 5C 03 03 02 07 00 98 02 01 00 02 02 02 FF 00 01 00 07 03 03 03 07 00 5C 03 03 02 00 04 08 02 52 08 02 52 07 00 EF 07 00 47 FF 00 01 00 04 03 03 03 07 00 5C 00 01 07 00 5C FF 00 01 00 04 03 03 03 07 00 5C 00 02 07 00 5C 07 00 35 FF 00 01 00 06 03 03 03 07 00 5C 03 03 00 01 02 FF 00 01 00 08 03 03 03 07 00 5C 03 03 02 07 00 98 00 02 02 02 FF 00 01 00 05 03 03 03 07 00 5C 03 00 07 03 07 00 78 08 01 7E 08 01 7E 03 03 03 FF 00 01 00 04 03 03 03 07 00 5C 00 01 07 00 2A 43 05 44 07 00 2A 47 05 FF 00 07 00 05 03 03 03 07 00 5C 03 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1185   1193   Any
        //  1185   1193   1185   1193   Any
        //  1201   1203   3      8      Any
        //  351    358    358    359    Any
        //  351    358    358    359    Any
        //  351    358    351    352    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  351    358    358    359    Ljava/lang/IllegalStateException;
        //  352    358    358    359    Any
        //  479    486    486    487    Any
        //  480    486    479    480    Any
        //  479    486    3      8      Any
        //  480    486    486    487    Any
        //  480    486    479    480    Any
        //  492    499    499    500    Any
        //  492    499    499    500    Any
        //  492    499    3      8      Ljava/lang/NullPointerException;
        //  492    499    3      8      Ljava/lang/AssertionError;
        //  492    499    492    493    Any
        //  503    510    510    511    Any
        //  503    510    3      8      Any
        //  504    510    503    504    Ljava/lang/NumberFormatException;
        //  503    510    3      8      Any
        //  504    510    510    511    Any
        //  542    549    549    550    Any
        //  543    549    549    550    Ljava/util/NoSuchElementException;
        //  542    549    542    543    Ljava/lang/NumberFormatException;
        //  543    549    549    550    Ljava/lang/IllegalStateException;
        //  542    549    549    550    Ljava/lang/IllegalArgumentException;
        //  708    714    714    715    Any
        //  708    714    714    715    Any
        //  708    714    3      8      Any
        //  708    714    3      8      Ljava/lang/IllegalStateException;
        //  708    714    714    715    Any
        //  718    725    725    726    Any
        //  718    725    725    726    Ljava/lang/NegativeArraySizeException;
        //  718    725    3      8      Any
        //  719    725    718    719    Ljava/lang/NumberFormatException;
        //  718    725    718    719    Any
        //  778    784    784    785    Any
        //  778    784    3      8      Any
        //  778    784    784    785    Any
        //  778    784    3      8      Ljava/util/NoSuchElementException;
        //  778    784    784    785    Ljava/lang/IllegalStateException;
        //  836    843    843    844    Any
        //  837    843    836    837    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  836    843    3      8      Any
        //  836    843    843    844    Any
        //  836    843    3      8      Any
        //  847    856    856    857    Any
        //  848    856    847    848    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  847    856    3      8      Any
        //  847    856    847    848    Any
        //  848    856    3      8      Ljava/lang/UnsupportedOperationException;
        //  861    868    868    869    Any
        //  862    868    861    862    Any
        //  861    868    868    869    Ljava/lang/IndexOutOfBoundsException;
        //  862    868    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  861    868    868    869    Ljava/lang/NullPointerException;
        //  876    883    883    884    Any
        //  876    883    876    877    Ljava/lang/NullPointerException;
        //  876    883    3      8      Ljava/lang/RuntimeException;
        //  876    883    876    877    Ljava/lang/UnsupportedOperationException;
        //  877    883    883    884    Ljava/util/ConcurrentModificationException;
        //  931    938    938    939    Any
        //  932    938    931    932    Ljava/lang/ClassCastException;
        //  932    938    3      8      Ljava/util/NoSuchElementException;
        //  931    938    938    939    Any
        //  932    938    931    932    Any
        //  1035   1042   1042   1043   Any
        //  1035   1042   1035   1036   Ljava/lang/NullPointerException;
        //  1035   1042   1042   1043   Any
        //  1036   1042   1042   1043   Ljava/lang/IllegalArgumentException;
        //  1035   1042   3      8      Any
        //  1054   1060   1060   1061   Any
        //  1054   1060   1060   1061   Any
        //  1054   1060   1060   1061   Any
        //  1054   1060   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1054   1060   1060   1061   Ljava/lang/UnsupportedOperationException;
        //  1109   1116   1116   1117   Any
        //  1110   1116   1116   1117   Ljava/lang/IllegalArgumentException;
        //  1109   1116   1109   1110   Ljava/lang/NullPointerException;
        //  1109   1116   1109   1110   Ljava/lang/IllegalStateException;
        //  1109   1116   1116   1117   Any
        //  1135   1142   1142   1143   Any
        //  1136   1142   1135   1136   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1136   1142   1142   1143   Any
        //  1135   1142   3      8      Any
        //  1136   1142   1135   1136   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:586)
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
    
    public static float c(final EntityEnderCrystal p0, final EntityLivingBase p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          170
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            162
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            154
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        net/minecraft/entity/item/EntityEnderCrystal.field_70165_t:D
        //    28: aload_0        
        //    29: getfield        net/minecraft/entity/item/EntityEnderCrystal.field_70163_u:D
        //    32: aload_0        
        //    33: getstatic       dev/nuker/pyro/fc.c:I
        //    36: ifge            45
        //    39: ldc_w           760091574
        //    42: goto            48
        //    45: ldc_w           227506595
        //    48: ldc_w           -893873614
        //    51: ixor           
        //    52: lookupswitch {
        //          -1272634318: 45
        //          -403275388: 141
        //          default: 80
        //        }
        //    80: getfield        net/minecraft/entity/item/EntityEnderCrystal.field_70161_v:D
        //    83: getstatic       dev/nuker/pyro/fc.1:I
        //    86: ifeq            95
        //    89: ldc_w           -1280281322
        //    92: goto            98
        //    95: ldc_w           -889154180
        //    98: ldc_w           -1243293722
        //   101: ixor           
        //   102: lookupswitch {
        //          106210032: 143
        //          1049915265: 95
        //          default: 128
        //        }
        //   128: aload_1        
        //   129: goto            133
        //   132: athrow         
        //   133: invokestatic    dev/nuker/pyro/fb7.c:(DDDLnet/minecraft/entity/EntityLivingBase;)F
        //   136: goto            140
        //   139: athrow         
        //   140: freturn        
        //   141: aconst_null    
        //   142: athrow         
        //   143: aconst_null    
        //   144: athrow         
        //   145: pop            
        //   146: goto            24
        //   149: pop            
        //   150: aconst_null    
        //   151: goto            145
        //   154: dup            
        //   155: ifnull          145
        //   158: checkcast       Ljava/lang/Throwable;
        //   161: athrow         
        //   162: dup            
        //   163: ifnull          149
        //   166: checkcast       Ljava/lang/Throwable;
        //   169: athrow         
        //   170: aconst_null    
        //   171: athrow         
        //    StackMapTable: 00 15 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 FA 07 00 5C FF 00 14 00 02 07 00 FA 07 00 5C 00 03 03 03 07 00 FA FF 00 02 00 02 07 00 FA 07 00 5C 00 04 03 03 07 00 FA 01 FF 00 1F 00 02 07 00 FA 07 00 5C 00 03 03 03 07 00 FA FF 00 0E 00 02 07 00 FA 07 00 5C 00 03 03 03 03 FF 00 02 00 02 07 00 FA 07 00 5C 00 04 03 03 03 01 FF 00 1D 00 02 07 00 FA 07 00 5C 00 03 03 03 03 43 07 00 2A FF 00 00 00 02 07 00 FA 07 00 5C 00 04 03 03 03 07 00 5C 45 07 00 2A 40 02 FF 00 00 00 02 07 00 FA 07 00 5C 00 03 03 03 07 00 FA FF 00 01 00 02 07 00 FA 07 00 5C 00 03 03 03 03 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     154    162    Ljava/lang/IllegalStateException;
        //  154    162    154    162    Ljava/lang/ArithmeticException;
        //  170    172    3      8      Any
        //  132    139    139    140    Any
        //  133    139    139    140    Ljava/lang/NullPointerException;
        //  133    139    3      8      Ljava/lang/NumberFormatException;
        //  132    139    132    133    Any
        //  132    139    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 58 out of bounds for length 58
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
    
    static {
        throw t;
    }
    
    public static float c(final float n) {
        return fbS.7z(null, 1004599219, n);
    }
    
    public static float c(final BlockPos p0, final EntityLivingBase p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          255
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            247
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            239
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           299970657
        //    33: goto            39
        //    36: ldc_w           -305866002
        //    39: ldc_w           -967857227
        //    42: ixor           
        //    43: lookupswitch {
        //          -676422700: 36
        //          730558811: 68
        //          default: 224
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //    76: goto            80
        //    79: athrow         
        //    80: i2d            
        //    81: ldc2_w          0.5
        //    84: dadd           
        //    85: getstatic       dev/nuker/pyro/fc.0:I
        //    88: ifeq            97
        //    91: ldc_w           1758213001
        //    94: goto            100
        //    97: ldc_w           -412823904
        //   100: ldc_w           1835710669
        //   103: ixor           
        //   104: lookupswitch {
        //          -1978763667: 132
        //          94800708: 97
        //          default: 226
        //        }
        //   132: aload_0        
        //   133: getstatic       dev/nuker/pyro/fc.c:I
        //   136: ifge            145
        //   139: ldc_w           1452654800
        //   142: goto            148
        //   145: ldc_w           199991828
        //   148: ldc_w           778946581
        //   151: ixor           
        //   152: lookupswitch {
        //          -1679560875: 145
        //          2029521093: 228
        //          default: 180
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   187: goto            191
        //   190: athrow         
        //   191: iconst_1       
        //   192: iadd           
        //   193: i2d            
        //   194: aload_0        
        //   195: goto            199
        //   198: athrow         
        //   199: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   202: goto            206
        //   205: athrow         
        //   206: i2d            
        //   207: ldc2_w          0.5
        //   210: dadd           
        //   211: aload_1        
        //   212: goto            216
        //   215: athrow         
        //   216: invokestatic    dev/nuker/pyro/fb7.c:(DDDLnet/minecraft/entity/EntityLivingBase;)F
        //   219: goto            223
        //   222: athrow         
        //   223: freturn        
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: aconst_null    
        //   229: athrow         
        //   230: pop            
        //   231: goto            24
        //   234: pop            
        //   235: aconst_null    
        //   236: goto            230
        //   239: dup            
        //   240: ifnull          230
        //   243: checkcast       Ljava/lang/Throwable;
        //   246: athrow         
        //   247: dup            
        //   248: ifnull          234
        //   251: checkcast       Ljava/lang/Throwable;
        //   254: athrow         
        //   255: aconst_null    
        //   256: athrow         
        //    StackMapTable: 00 25 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 01 1B 07 00 5C 0B 42 01 1C 43 07 00 1F 40 07 01 1B 45 07 00 2A 40 01 50 03 FF 00 02 00 02 07 01 1B 07 00 5C 00 02 03 01 5F 03 FF 00 0C 00 02 07 01 1B 07 00 5C 00 02 03 07 01 1B FF 00 02 00 02 07 01 1B 07 00 5C 00 03 03 07 01 1B 01 FF 00 1F 00 02 07 01 1B 07 00 5C 00 02 03 07 01 1B 42 07 00 2A FF 00 00 00 02 07 01 1B 07 00 5C 00 02 03 07 01 1B 45 07 00 2A FF 00 00 00 02 07 01 1B 07 00 5C 00 02 03 01 46 07 00 1F FF 00 00 00 02 07 01 1B 07 00 5C 00 03 03 03 07 01 1B 45 07 00 2A FF 00 00 00 02 07 01 1B 07 00 5C 00 03 03 03 01 48 07 00 2A FF 00 00 00 02 07 01 1B 07 00 5C 00 04 03 03 03 07 00 5C 45 07 00 2A 40 02 00 41 03 FF 00 01 00 02 07 01 1B 07 00 5C 00 02 03 07 01 1B 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     239    247    Any
        //  239    247    239    247    Any
        //  255    257    3      8      Ljava/lang/IllegalArgumentException;
        //  72     79     79     80     Any
        //  72     79     3      8      Ljava/lang/AssertionError;
        //  72     79     72     73     Ljava/util/ConcurrentModificationException;
        //  73     79     72     73     Ljava/lang/IllegalStateException;
        //  73     79     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  183    190    190    191    Any
        //  183    190    190    191    Any
        //  184    190    183    184    Any
        //  184    190    190    191    Any
        //  184    190    183    184    Ljava/lang/ArithmeticException;
        //  198    205    205    206    Any
        //  198    205    198    199    Ljava/util/NoSuchElementException;
        //  198    205    3      8      Any
        //  198    205    198    199    Ljava/lang/ArithmeticException;
        //  199    205    3      8      Any
        //  215    222    222    223    Any
        //  216    222    222    223    Ljava/util/ConcurrentModificationException;
        //  216    222    3      8      Any
        //  215    222    215    216    Any
        //  216    222    215    216    Ljava/lang/AssertionError;
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
}
