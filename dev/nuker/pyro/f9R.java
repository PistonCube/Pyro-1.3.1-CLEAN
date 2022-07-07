// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f9R extends fH
{
    public f0a c;
    
    @f06
    @LauncherEventHide
    public void c(final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1297
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1289
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1281
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    39: if_acmpne       1237
        //    42: aload_1        
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //    50: goto            54
        //    53: athrow         
        //    54: instanceof      Lnet/minecraft/network/play/server/SPacketChat;
        //    57: ifeq            1237
        //    60: getstatic       dev/nuker/pyro/fc.c:I
        //    63: ifge            71
        //    66: ldc             409206596
        //    68: goto            73
        //    71: ldc             -2014034125
        //    73: ldc             -106065403
        //    75: ixor           
        //    76: lookupswitch {
        //          -506565311: 71
        //          2119816502: 104
        //          default: 1260
        //        }
        //   104: aload_1        
        //   105: goto            109
        //   108: athrow         
        //   109: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   112: goto            116
        //   115: athrow         
        //   116: checkcast       Lnet/minecraft/network/play/server/SPacketChat;
        //   119: astore_2       
        //   120: aload_2        
        //   121: getstatic       dev/nuker/pyro/fc.c:I
        //   124: ifge            132
        //   127: ldc             -762597904
        //   129: goto            134
        //   132: ldc             -968298862
        //   134: ldc             1471088176
        //   136: ixor           
        //   137: lookupswitch {
        //          -2061194304: 132
        //          -1847072606: 164
        //          default: 1268
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   net/minecraft/network/play/server/SPacketChat.func_192590_c:()Lnet/minecraft/util/text/ChatType;
        //   171: goto            175
        //   174: athrow         
        //   175: getstatic       net/minecraft/util/text/ChatType.CHAT:Lnet/minecraft/util/text/ChatType;
        //   178: if_acmpne       1237
        //   181: aload_2        
        //   182: goto            186
        //   185: athrow         
        //   186: invokevirtual   net/minecraft/network/play/server/SPacketChat.func_148915_c:()Lnet/minecraft/util/text/ITextComponent;
        //   189: goto            193
        //   192: athrow         
        //   193: astore_3       
        //   194: aload_3        
        //   195: instanceof      Lnet/minecraft/util/text/TextComponentTranslation;
        //   198: ifeq            1237
        //   201: aload_3        
        //   202: checkcast       Lnet/minecraft/util/text/TextComponentTranslation;
        //   205: astore          4
        //   207: getstatic       dev/nuker/pyro/fc.0:I
        //   210: ifeq            218
        //   213: ldc             -269595430
        //   215: goto            220
        //   218: ldc             684885411
        //   220: ldc             -1434412462
        //   222: ixor           
        //   223: lookupswitch {
        //          -622579039: 218
        //          1164891784: 1238
        //          default: 248
        //        }
        //   248: aload           4
        //   250: getstatic       dev/nuker/pyro/fc.0:I
        //   253: ifeq            261
        //   256: ldc             1229372811
        //   258: goto            263
        //   261: ldc             -1560602788
        //   263: ldc             1378744541
        //   265: ixor           
        //   266: lookupswitch {
        //          -542568689: 261
        //          460014934: 1244
        //          default: 292
        //        }
        //   292: goto            296
        //   295: athrow         
        //   296: invokevirtual   net/minecraft/util/text/TextComponentTranslation.func_150271_j:()[Ljava/lang/Object;
        //   299: goto            303
        //   302: athrow         
        //   303: arraylength    
        //   304: ifle            1237
        //   307: getstatic       dev/nuker/pyro/fc.c:I
        //   310: ifge            318
        //   313: ldc             1164528719
        //   315: goto            320
        //   318: ldc             809212022
        //   320: ldc             1933068898
        //   322: ixor           
        //   323: lookupswitch {
        //          -1091897268: 318
        //          911279661: 1258
        //          default: 348
        //        }
        //   348: aload           4
        //   350: goto            354
        //   353: athrow         
        //   354: invokevirtual   net/minecraft/util/text/TextComponentTranslation.func_150271_j:()[Ljava/lang/Object;
        //   357: goto            361
        //   360: athrow         
        //   361: iconst_0       
        //   362: aaload         
        //   363: instanceof      Lnet/minecraft/util/text/TextComponentString;
        //   366: ifeq            1237
        //   369: aload           4
        //   371: goto            375
        //   374: athrow         
        //   375: invokevirtual   net/minecraft/util/text/TextComponentTranslation.func_150271_j:()[Ljava/lang/Object;
        //   378: goto            382
        //   381: athrow         
        //   382: iconst_0       
        //   383: aaload         
        //   384: checkcast       Lnet/minecraft/util/text/TextComponentString;
        //   387: astore          5
        //   389: aload           5
        //   391: getstatic       dev/nuker/pyro/fc.1:I
        //   394: ifeq            402
        //   397: ldc             957386181
        //   399: goto            404
        //   402: ldc             -895589821
        //   404: ldc             -216041372
        //   406: ixor           
        //   407: lookupswitch {
        //          -904923743: 402
        //          964762151: 432
        //          default: 1262
        //        }
        //   432: goto            436
        //   435: athrow         
        //   436: invokevirtual   net/minecraft/util/text/TextComponentString.func_150253_a:()Ljava/util/List;
        //   439: goto            443
        //   442: athrow         
        //   443: goto            447
        //   446: athrow         
        //   447: invokeinterface java/util/List.isEmpty:()Z
        //   452: goto            456
        //   455: athrow         
        //   456: ifne            1237
        //   459: aload           5
        //   461: goto            465
        //   464: athrow         
        //   465: invokevirtual   net/minecraft/util/text/TextComponentString.func_150253_a:()Ljava/util/List;
        //   468: goto            472
        //   471: athrow         
        //   472: iconst_0       
        //   473: getstatic       dev/nuker/pyro/fc.1:I
        //   476: ifeq            484
        //   479: ldc             1596823274
        //   481: goto            486
        //   484: ldc             -1163300091
        //   486: ldc             735955840
        //   488: ixor           
        //   489: lookupswitch {
        //          -1065804586: 484
        //          1961909610: 1246
        //          default: 516
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   525: goto            529
        //   528: athrow         
        //   529: instanceof      Lnet/minecraft/util/text/TextComponentString;
        //   532: ifeq            1237
        //   535: aload           5
        //   537: goto            541
        //   540: athrow         
        //   541: invokevirtual   net/minecraft/util/text/TextComponentString.func_150253_a:()Ljava/util/List;
        //   544: goto            548
        //   547: athrow         
        //   548: iconst_0       
        //   549: goto            553
        //   552: athrow         
        //   553: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   558: goto            562
        //   561: athrow         
        //   562: checkcast       Lnet/minecraft/util/text/TextComponentString;
        //   565: astore          6
        //   567: getstatic       dev/nuker/pyro/fc.1:I
        //   570: ifeq            578
        //   573: ldc             823792603
        //   575: goto            580
        //   578: ldc             -1359372697
        //   580: ldc             -1753235560
        //   582: ixor           
        //   583: lookupswitch {
        //          -1503286205: 1250
        //          123368623: 578
        //          default: 608
        //        }
        //   608: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   611: aload           6
        //   613: goto            617
        //   616: athrow         
        //   617: invokevirtual   net/minecraft/util/text/TextComponentString.func_150265_g:()Ljava/lang/String;
        //   620: goto            624
        //   623: athrow         
        //   624: goto            628
        //   627: athrow         
        //   628: invokevirtual   dev/nuker/pyro/FriendManager$Companion.getFriend:(Ljava/lang/String;)Ldev/nuker/pyro/f8;
        //   631: goto            635
        //   634: athrow         
        //   635: astore          7
        //   637: aload           7
        //   639: ifnull          1237
        //   642: getstatic       dev/nuker/pyro/fc.0:I
        //   645: ifeq            653
        //   648: ldc             80284659
        //   650: goto            655
        //   653: ldc             607893544
        //   655: ldc             891888365
        //   657: ixor           
        //   658: lookupswitch {
        //          -113108475: 653
        //          836774174: 1240
        //          default: 684
        //        }
        //   684: aload_0        
        //   685: getfield        dev/nuker/pyro/f9R.c:Ldev/nuker/pyro/f0a;
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   695: goto            699
        //   698: athrow         
        //   699: checkcast       Ljava/lang/Boolean;
        //   702: goto            706
        //   705: athrow         
        //   706: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   709: goto            713
        //   712: athrow         
        //   713: ifeq            721
        //   716: ldc             -867650649
        //   718: goto            723
        //   721: ldc             -867650650
        //   723: ldc             438660195
        //   725: ixor           
        //   726: tableswitch {
        //          -1394884728: 748
        //          -1394884727: 1097
        //          default: 716
        //        }
        //   748: aload           5
        //   750: goto            754
        //   753: athrow         
        //   754: invokevirtual   net/minecraft/util/text/TextComponentString.func_150253_a:()Ljava/util/List;
        //   757: goto            761
        //   760: athrow         
        //   761: iconst_0       
        //   762: new             Lnet/minecraft/util/text/TextComponentString;
        //   765: dup            
        //   766: getstatic       dev/nuker/pyro/fc.1:I
        //   769: ifeq            777
        //   772: ldc             390898879
        //   774: goto            779
        //   777: ldc             -1736342265
        //   779: ldc             1359935642
        //   781: ixor           
        //   782: lookupswitch {
        //          -913343075: 808
        //          1178754085: 777
        //          default: 1242
        //        }
        //   808: aload           7
        //   810: getstatic       dev/nuker/pyro/fc.1:I
        //   813: ifeq            821
        //   816: ldc             658790246
        //   818: goto            823
        //   821: ldc             -424869526
        //   823: ldc             -1183914693
        //   825: ixor           
        //   826: lookupswitch {
        //          -1641368995: 821
        //          1606673489: 852
        //          default: 1256
        //        }
        //   852: goto            856
        //   855: athrow         
        //   856: invokevirtual   dev/nuker/pyro/f8.c:()Ljava/lang/String;
        //   859: goto            863
        //   862: athrow         
        //   863: getstatic       dev/nuker/pyro/fc.0:I
        //   866: ifeq            874
        //   869: ldc             84128843
        //   871: goto            876
        //   874: ldc             2022022512
        //   876: ldc             -157301099
        //   878: ixor           
        //   879: lookupswitch {
        //          -207850786: 1266
        //          111051437: 874
        //          default: 904
        //        }
        //   904: goto            908
        //   907: athrow         
        //   908: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
        //   911: goto            915
        //   914: athrow         
        //   915: new             Lnet/minecraft/util/text/Style;
        //   918: dup            
        //   919: goto            923
        //   922: athrow         
        //   923: invokespecial   net/minecraft/util/text/Style.<init>:()V
        //   926: goto            930
        //   929: athrow         
        //   930: getstatic       net/minecraft/util/text/TextFormatting.DARK_AQUA:Lnet/minecraft/util/text/TextFormatting;
        //   933: getstatic       dev/nuker/pyro/fc.0:I
        //   936: ifeq            944
        //   939: ldc             854694642
        //   941: goto            946
        //   944: ldc             1523519820
        //   946: ldc             1333118421
        //   948: ixor           
        //   949: lookupswitch {
        //          364565657: 976
        //          2105827111: 944
        //          default: 1254
        //        }
        //   976: goto            980
        //   979: athrow         
        //   980: invokevirtual   net/minecraft/util/text/Style.func_150238_a:(Lnet/minecraft/util/text/TextFormatting;)Lnet/minecraft/util/text/Style;
        //   983: goto            987
        //   986: athrow         
        //   987: getstatic       dev/nuker/pyro/fc.1:I
        //   990: ifeq            998
        //   993: ldc             -718354847
        //   995: goto            1000
        //   998: ldc             1151010595
        //  1000: ldc             -2103348739
        //  1002: ixor           
        //  1003: lookupswitch {
        //          1469036444: 1252
        //          1988193276: 998
        //          default: 1028
        //        }
        //  1028: goto            1032
        //  1031: athrow         
        //  1032: invokevirtual   net/minecraft/util/text/TextComponentString.func_150255_a:(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/ITextComponent;
        //  1035: goto            1039
        //  1038: athrow         
        //  1039: getstatic       dev/nuker/pyro/fc.c:I
        //  1042: ifge            1050
        //  1045: ldc             -316499912
        //  1047: goto            1052
        //  1050: ldc             -525359401
        //  1052: ldc             -136011355
        //  1054: ixor           
        //  1055: lookupswitch {
        //          -1182906078: 1050
        //          449198493: 1248
        //          default: 1080
        //        }
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  1089: goto            1093
        //  1092: athrow         
        //  1093: pop            
        //  1094: goto            1237
        //  1097: aload           5
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: invokevirtual   net/minecraft/util/text/TextComponentString.func_150253_a:()Ljava/util/List;
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: iconst_0       
        //  1111: new             Lnet/minecraft/util/text/TextComponentString;
        //  1114: dup            
        //  1115: aload           7
        //  1117: getstatic       dev/nuker/pyro/fc.0:I
        //  1120: ifeq            1128
        //  1123: ldc             1386364856
        //  1125: goto            1130
        //  1128: ldc             353894138
        //  1130: ldc             -565153603
        //  1132: ixor           
        //  1133: lookupswitch {
        //          -1930277115: 1270
        //          251210409: 1128
        //          default: 1160
        //        }
        //  1160: goto            1164
        //  1163: athrow         
        //  1164: invokevirtual   dev/nuker/pyro/f8.c:()Ljava/lang/String;
        //  1167: goto            1171
        //  1170: athrow         
        //  1171: getstatic       dev/nuker/pyro/fc.1:I
        //  1174: ifeq            1182
        //  1177: ldc             1559209630
        //  1179: goto            1184
        //  1182: ldc             2022740846
        //  1184: ldc             2141790081
        //  1186: ixor           
        //  1187: lookupswitch {
        //          340123752: 1182
        //          591837471: 1264
        //          default: 1212
        //        }
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: pop            
        //  1237: return         
        //  1238: aconst_null    
        //  1239: athrow         
        //  1240: aconst_null    
        //  1241: athrow         
        //  1242: aconst_null    
        //  1243: athrow         
        //  1244: aconst_null    
        //  1245: athrow         
        //  1246: aconst_null    
        //  1247: athrow         
        //  1248: aconst_null    
        //  1249: athrow         
        //  1250: aconst_null    
        //  1251: athrow         
        //  1252: aconst_null    
        //  1253: athrow         
        //  1254: aconst_null    
        //  1255: athrow         
        //  1256: aconst_null    
        //  1257: athrow         
        //  1258: aconst_null    
        //  1259: athrow         
        //  1260: aconst_null    
        //  1261: athrow         
        //  1262: aconst_null    
        //  1263: athrow         
        //  1264: aconst_null    
        //  1265: athrow         
        //  1266: aconst_null    
        //  1267: athrow         
        //  1268: aconst_null    
        //  1269: athrow         
        //  1270: aconst_null    
        //  1271: athrow         
        //  1272: pop            
        //  1273: goto            24
        //  1276: pop            
        //  1277: aconst_null    
        //  1278: goto            1272
        //  1281: dup            
        //  1282: ifnull          1272
        //  1285: checkcast       Ljava/lang/Throwable;
        //  1288: athrow         
        //  1289: dup            
        //  1290: ifnull          1276
        //  1293: checkcast       Ljava/lang/Throwable;
        //  1296: athrow         
        //  1297: aconst_null    
        //  1298: athrow         
        //    StackMapTable: 00 C7 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FD 00 03 07 00 03 07 00 34 43 07 00 12 40 07 00 34 45 07 00 32 40 07 00 39 49 07 00 32 40 07 00 34 45 07 00 32 40 07 00 DE 10 41 01 1E 43 07 00 32 40 07 00 34 45 07 00 32 40 07 00 DE FF 00 0F 00 03 07 00 03 07 00 34 07 00 41 00 01 07 00 41 FF 00 01 00 03 07 00 03 07 00 34 07 00 41 00 02 07 00 41 01 5D 07 00 41 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 03 07 00 03 07 00 34 07 00 41 00 01 07 00 41 45 07 00 32 40 07 00 4F 49 07 00 32 40 07 00 41 45 07 00 32 40 07 00 E0 FD 00 18 07 00 E0 07 00 59 41 01 1B 4C 07 00 59 FF 00 01 00 05 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 00 02 07 00 59 01 5C 07 00 59 42 07 00 32 40 07 00 59 45 07 00 32 40 07 00 E2 0E 41 01 1B FF 00 04 00 00 00 01 07 00 32 FF 00 00 00 05 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 00 01 07 00 59 45 07 00 32 40 07 00 E2 4C 07 00 32 40 07 00 59 45 07 00 32 40 07 00 E2 FF 00 13 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 01 07 00 6B FF 00 01 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 6B 01 5B 07 00 6B 42 07 00 32 40 07 00 6B 45 07 00 32 40 07 00 74 42 07 00 32 40 07 00 74 47 07 00 32 40 01 FF 00 07 00 00 00 01 07 00 32 FF 00 00 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 01 07 00 6B 45 07 00 32 40 07 00 74 FF 00 0B 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 74 01 FF 00 01 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 03 07 00 74 01 01 FF 00 1D 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 74 01 42 07 00 32 FF 00 00 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 74 01 47 07 00 32 40 07 00 E4 4A 07 00 32 40 07 00 6B 45 07 00 32 40 07 00 74 43 07 00 32 FF 00 00 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 74 01 47 07 00 32 40 07 00 E4 FC 00 0F 07 00 6B 41 01 1B 47 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 00 02 07 00 8E 07 00 6B 45 07 00 32 FF 00 00 00 07 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 00 02 07 00 8E 07 00 E6 42 07 00 10 FF 00 00 00 07 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 00 02 07 00 8E 07 00 E6 45 07 00 32 40 07 00 AD FC 00 11 07 00 AD 41 01 1C FF 00 06 00 00 00 01 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 01 07 00 99 45 07 00 32 40 07 00 E4 45 07 00 14 40 07 00 9F 45 07 00 32 40 01 02 04 41 01 18 FF 00 04 00 00 00 01 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 01 07 00 6B 45 07 00 32 40 07 00 74 FF 00 0F 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 08 02 FA 08 02 FA FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 01 FF 00 1C 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 08 02 FA 08 02 FA FF 00 0C 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 AD FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 06 07 00 74 01 08 02 FA 08 02 FA 07 00 AD 01 FF 00 1C 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 AD 42 07 00 20 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 AD 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 FF 00 0A 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 06 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 01 FF 00 1B 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 42 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 6B 46 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 08 03 93 08 03 93 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 FF 00 0D 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 07 00 B8 07 00 BD FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 06 07 00 74 01 07 00 6B 07 00 B8 07 00 BD 01 FF 00 1D 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 07 00 B8 07 00 BD 42 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 07 00 B8 07 00 BD 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 FF 00 0A 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 07 00 B8 01 FF 00 1B 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 42 07 00 1C FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 E0 FF 00 0A 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 E0 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 E0 01 FF 00 1B 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 E0 42 07 00 10 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 E0 47 07 00 32 40 07 00 E4 03 FF 00 04 00 00 00 01 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 01 07 00 6B 45 07 00 32 40 07 00 74 FF 00 11 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 AD FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 06 07 00 74 01 08 04 57 08 04 57 07 00 AD 01 FF 00 1D 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 AD 42 07 00 2A FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 AD 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 E6 FF 00 0A 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 E6 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 06 07 00 74 01 08 04 57 08 04 57 07 00 E6 01 FF 00 1B 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 E6 42 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 E6 45 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 6B 42 07 00 32 FF 00 00 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 6B 47 07 00 32 40 07 00 E4 FF 00 00 00 02 07 00 03 07 00 34 00 00 FE 00 00 07 00 41 07 00 E0 07 00 59 FE 00 01 07 00 6B 07 00 6B 07 00 AD FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 08 02 FA 08 02 FA FF 00 01 00 05 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 00 01 07 00 59 FF 00 01 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 02 07 00 74 01 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 03 07 00 74 01 07 00 E0 FA 00 01 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 04 07 00 74 01 07 00 6B 07 00 B8 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 07 00 6B 07 00 B8 07 00 BD FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 AD F8 00 01 F8 00 01 FF 00 01 00 06 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 00 01 07 00 6B FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 E6 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 02 FA 08 02 FA 07 00 E6 FF 00 01 00 03 07 00 03 07 00 34 07 00 41 00 01 07 00 41 FF 00 01 00 08 07 00 03 07 00 34 07 00 41 07 00 E0 07 00 59 07 00 6B 07 00 6B 07 00 AD 00 05 07 00 74 01 08 04 57 08 04 57 07 00 AD FF 00 01 00 02 07 00 03 07 00 34 00 01 07 00 32 43 05 44 07 00 32 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1281   1289   Any
        //  1281   1289   1281   1289   Any
        //  1297   1299   3      8      Any
        //  28     35     35     36     Any
        //  28     35     3      8      Ljava/util/NoSuchElementException;
        //  29     35     3      8      Ljava/lang/AssertionError;
        //  29     35     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  28     35     28     29     Ljava/lang/NumberFormatException;
        //  46     53     53     54     Any
        //  47     53     46     47     Any
        //  46     53     53     54     Ljava/lang/IndexOutOfBoundsException;
        //  46     53     46     47     Any
        //  47     53     53     54     Ljava/lang/EnumConstantNotPresentException;
        //  108    115    115    116    Any
        //  109    115    3      8      Any
        //  108    115    108    109    Any
        //  108    115    108    109    Any
        //  109    115    3      8      Any
        //  168    174    174    175    Any
        //  168    174    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  168    174    3      8      Any
        //  168    174    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  168    174    3      8      Any
        //  185    192    192    193    Any
        //  185    192    192    193    Ljava/lang/NullPointerException;
        //  186    192    192    193    Ljava/lang/EnumConstantNotPresentException;
        //  185    192    185    186    Any
        //  186    192    185    186    Any
        //  295    302    302    303    Any
        //  295    302    295    296    Any
        //  295    302    3      8      Any
        //  296    302    295    296    Any
        //  295    302    302    303    Any
        //  354    360    360    361    Any
        //  354    360    3      8      Ljava/lang/UnsupportedOperationException;
        //  354    360    3      8      Ljava/lang/ArithmeticException;
        //  354    360    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  354    360    3      8      Any
        //  374    381    381    382    Any
        //  374    381    374    375    Any
        //  375    381    3      8      Ljava/lang/NumberFormatException;
        //  374    381    3      8      Ljava/util/ConcurrentModificationException;
        //  375    381    374    375    Ljava/lang/ArithmeticException;
        //  435    442    442    443    Any
        //  435    442    435    436    Any
        //  436    442    442    443    Any
        //  435    442    3      8      Ljava/lang/ArithmeticException;
        //  435    442    435    436    Ljava/lang/IllegalStateException;
        //  446    455    455    456    Any
        //  447    455    446    447    Ljava/lang/EnumConstantNotPresentException;
        //  447    455    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  447    455    3      8      Any
        //  447    455    446    447    Any
        //  465    471    471    472    Any
        //  465    471    3      8      Any
        //  465    471    471    472    Any
        //  465    471    3      8      Any
        //  465    471    471    472    Ljava/lang/NegativeArraySizeException;
        //  519    528    528    529    Any
        //  519    528    528    529    Any
        //  520    528    528    529    Any
        //  519    528    3      8      Ljava/util/NoSuchElementException;
        //  520    528    519    520    Any
        //  540    547    547    548    Any
        //  540    547    547    548    Any
        //  540    547    540    541    Any
        //  541    547    540    541    Ljava/lang/IllegalArgumentException;
        //  541    547    3      8      Any
        //  552    561    561    562    Any
        //  553    561    552    553    Any
        //  553    561    552    553    Ljava/lang/StringIndexOutOfBoundsException;
        //  552    561    552    553    Ljava/lang/EnumConstantNotPresentException;
        //  553    561    3      8      Any
        //  616    623    623    624    Any
        //  617    623    623    624    Any
        //  617    623    616    617    Ljava/lang/IllegalArgumentException;
        //  617    623    616    617    Ljava/lang/IndexOutOfBoundsException;
        //  617    623    3      8      Ljava/lang/ClassCastException;
        //  627    634    634    635    Any
        //  628    634    627    628    Ljava/lang/IndexOutOfBoundsException;
        //  627    634    634    635    Any
        //  627    634    3      8      Ljava/lang/IllegalArgumentException;
        //  627    634    627    628    Ljava/lang/StringIndexOutOfBoundsException;
        //  692    698    698    699    Any
        //  692    698    3      8      Any
        //  692    698    3      8      Any
        //  692    698    698    699    Any
        //  692    698    698    699    Ljava/lang/AssertionError;
        //  705    712    712    713    Any
        //  705    712    712    713    Ljava/lang/ArithmeticException;
        //  705    712    3      8      Ljava/lang/UnsupportedOperationException;
        //  705    712    705    706    Ljava/lang/EnumConstantNotPresentException;
        //  705    712    3      8      Any
        //  754    760    760    761    Any
        //  754    760    760    761    Any
        //  754    760    760    761    Any
        //  754    760    760    761    Any
        //  754    760    760    761    Any
        //  855    862    862    863    Any
        //  856    862    3      8      Ljava/lang/NumberFormatException;
        //  856    862    855    856    Ljava/lang/IllegalStateException;
        //  855    862    3      8      Any
        //  855    862    862    863    Ljava/lang/EnumConstantNotPresentException;
        //  907    914    914    915    Any
        //  908    914    3      8      Ljava/lang/NumberFormatException;
        //  908    914    914    915    Ljava/util/NoSuchElementException;
        //  908    914    907    908    Any
        //  907    914    3      8      Ljava/util/ConcurrentModificationException;
        //  922    929    929    930    Any
        //  922    929    922    923    Any
        //  922    929    3      8      Any
        //  922    929    929    930    Any
        //  923    929    929    930    Ljava/lang/IllegalStateException;
        //  979    986    986    987    Any
        //  980    986    986    987    Any
        //  979    986    986    987    Ljava/lang/RuntimeException;
        //  979    986    986    987    Any
        //  979    986    979    980    Any
        //  1031   1038   1038   1039   Any
        //  1032   1038   1038   1039   Any
        //  1031   1038   1031   1032   Ljava/lang/ArithmeticException;
        //  1032   1038   1038   1039   Ljava/lang/RuntimeException;
        //  1031   1038   1038   1039   Any
        //  1083   1092   1092   1093   Any
        //  1083   1092   1092   1093   Ljava/lang/StringIndexOutOfBoundsException;
        //  1084   1092   1092   1093   Ljava/lang/IllegalStateException;
        //  1083   1092   1083   1084   Ljava/lang/IndexOutOfBoundsException;
        //  1083   1092   1092   1093   Any
        //  1103   1109   1109   1110   Any
        //  1103   1109   3      8      Any
        //  1103   1109   1109   1110   Ljava/util/ConcurrentModificationException;
        //  1103   1109   1109   1110   Any
        //  1103   1109   1109   1110   Ljava/lang/UnsupportedOperationException;
        //  1163   1170   1170   1171   Any
        //  1164   1170   1170   1171   Any
        //  1163   1170   1170   1171   Any
        //  1163   1170   1163   1164   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1163   1170   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1215   1222   1222   1223   Any
        //  1216   1222   1215   1216   Any
        //  1215   1222   1222   1223   Ljava/util/NoSuchElementException;
        //  1215   1222   1215   1216   Any
        //  1215   1222   1215   1216   Ljava/lang/NullPointerException;
        //  1226   1235   1235   1236   Any
        //  1227   1235   1226   1227   Ljava/lang/ClassCastException;
        //  1227   1235   1226   1227   Any
        //  1226   1235   1235   1236   Any
        //  1227   1235   3      8      Ljava/lang/ArithmeticException;
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
    
    static {
        throw t;
    }
    
    public f9R() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2265\u1492\u8b6f\ub3dc\uc948\uec7f\ub22b\ue75b\ud96d\ue928\ua6b9"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2245\u1492\u8b6f\ub3dc\uc968\uec7f\ub22b\ue75b\ud96d\ue928\ua6b9"
        //     8: getstatic       dev/nuker/pyro/fc.1:I
        //    11: ifeq            19
        //    14: ldc             999053412
        //    16: goto            21
        //    19: ldc             311143306
        //    21: ldc             -1409049447
        //    23: ixor           
        //    24: lookupswitch {
        //          -1752185603: 97
        //          -1073368921: 19
        //          default: 52
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u224f\u149a\u8b71\ub3c9\uc954\uec6c\ub23d\ue75c\ud928\ue92d\ua6bf\u1e45\ue06e\uc5a9\u81a8\u88e5\u57e4\u7684\ubd3c\uc09a\u2a9c\uc228\u6bc2\u2d41\ud740\u341a\u7d23\u8861\u8005\u8c04\u852e\ufb3b\u714f\u9a56\u1b1f\uf0e0\u4975\u89ef\uca95\uffb9\ub740\u41b3\ub872\ub346\u4cae\u8b70\u7c68\ucfa7\u7d4b\uea4d\ue752\u16df\uefca\u37ce\u4630\ue079\u0a13\u871e\u19d6\u0fd1\u7697\u7299"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: iconst_1       
        //    61: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    64: aload_0        
        //    65: new             Ldev/nuker/pyro/f0a;
        //    68: dup            
        //    69: ldc             "\u2268\u149c\u8b6e\ub3d6\uc94a"
        //    71: invokestatic    invokestatic   !!! ERROR
        //    74: ldc             "\u2248\u149c\u8b6e\ub3d6\uc94a"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: aconst_null    
        //    80: iconst_1       
        //    81: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    84: putfield        dev/nuker/pyro/f9R.c:Ldev/nuker/pyro/f0a;
        //    87: aload_0        
        //    88: aload_0        
        //    89: getfield        dev/nuker/pyro/f9R.c:Ldev/nuker/pyro/f0a;
        //    92: invokevirtual   dev/nuker/pyro/f9R.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    95: pop            
        //    96: return         
        //    97: aconst_null    
        //    98: athrow         
        //    StackMapTable: 00 04 FF 00 13 00 01 06 00 03 06 07 00 E6 07 00 E6 FF 00 01 00 01 06 00 04 06 07 00 E6 07 00 E6 01 FF 00 1E 00 01 06 00 03 06 07 00 E6 07 00 E6 FF 00 2C 00 01 06 00 03 06 07 00 E6 07 00 E6
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
}
