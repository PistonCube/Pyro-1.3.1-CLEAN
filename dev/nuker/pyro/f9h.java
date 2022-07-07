// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class f9H extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    public f0b c;
    public f0b 0;
    public f0b 1;
    public f0b 2;
    public f0b 3;
    public f0b 4;
    public f0d c;
    
    static {
        throw t;
    }
    
    public f9H() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u227e\u149f\u8b65\ub3da\uc959\uec7c\ub231\ue748"
        //     3: getstatic       dev/nuker/pyro/fc.0:I
        //     6: ifeq            14
        //     9: ldc             -17759398
        //    11: goto            16
        //    14: ldc             -94375786
        //    16: ldc             784920828
        //    18: ixor           
        //    19: lookupswitch {
        //          -801508442: 2061
        //          1421079313: 14
        //          default: 44
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u225e\u149f\u8b65\ub3da\uc959\uec5c\ub211\ue768"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: aconst_null    
        //    53: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    56: aload_0        
        //    57: aload_0        
        //    58: new             Ldev/nuker/pyro/f0a;
        //    61: dup            
        //    62: ldc             "\u227e\u1486\u8b7f\ub3cd\uc95d\uec76\ub202\ue74e\ud966\ue935"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: ldc             "\u225e\u1486\u8b7f\ub3cd\uc95d\uec76\ub264\ue767\ud967\ue92f\ua6af"
        //    69: invokestatic    invokestatic   !!! ERROR
        //    72: aconst_null    
        //    73: iconst_1       
        //    74: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    77: checkcast       Ldev/nuker/pyro/f0n;
        //    80: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    83: checkcast       Ldev/nuker/pyro/f0a;
        //    86: putfield        dev/nuker/pyro/f9H.c:Ldev/nuker/pyro/f0a;
        //    89: aload_0        
        //    90: aload_0        
        //    91: new             Ldev/nuker/pyro/f0a;
        //    94: dup            
        //    95: ldc             "\u2275\u1486\u8b68\ub3fb\uc953\uec78\ub22f\ue746\ud97a\ue92e\ua6ae\u1e42\ue061"
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: ldc             "\u2255\u14a6\u8b48\ub399\uc970\uec7a\ub227\ue74a\ud96f\ue933\ua6b4\u1e59\ue06b\uc5a3"
        //   102: invokestatic    invokestatic   !!! ERROR
        //   105: aconst_null    
        //   106: iconst_1       
        //   107: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   110: checkcast       Ldev/nuker/pyro/f0n;
        //   113: getstatic       dev/nuker/pyro/fc.0:I
        //   116: ifeq            124
        //   119: ldc             1402165652
        //   121: goto            126
        //   124: ldc             -629169254
        //   126: ldc             161650452
        //   128: ixor           
        //   129: lookupswitch {
        //          1173076424: 124
        //          1513213568: 2025
        //          default: 156
        //        }
        //   156: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   159: checkcast       Ldev/nuker/pyro/f0a;
        //   162: putfield        dev/nuker/pyro/f9H.0:Ldev/nuker/pyro/f0a;
        //   165: aload_0        
        //   166: aload_0        
        //   167: new             Ldev/nuker/pyro/f0b;
        //   170: dup            
        //   171: ldc             "\u226d\u1481\u8b65\ub3d4\uc953\uec69\ub23d\ue77e\ud96b\ue92e\ua6b7\u1e43\ue077"
        //   173: invokestatic    invokestatic   !!! ERROR
        //   176: ldc             "\u224d\u1481\u8b65\ub3d4\uc953\uec69\ub23d\ue701\ud94b\ue92e\ua6b7\u1e43\ue077"
        //   178: getstatic       dev/nuker/pyro/fc.0:I
        //   181: ifeq            189
        //   184: ldc             1176679920
        //   186: goto            191
        //   189: ldc             856571487
        //   191: ldc             1240908858
        //   193: ixor           
        //   194: lookupswitch {
        //          265581002: 189
        //          2063137381: 220
        //          default: 2047
        //        }
        //   220: invokestatic    invokestatic   !!! ERROR
        //   223: aconst_null    
        //   224: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   227: getstatic       dev/nuker/pyro/fc.1:I
        //   230: ifeq            238
        //   233: ldc             -1449677967
        //   235: goto            240
        //   238: ldc             631369927
        //   240: ldc             942472258
        //   242: ixor           
        //   243: lookupswitch {
        //          -1849993421: 2031
        //          1739872187: 238
        //          default: 268
        //        }
        //   268: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   271: getstatic       dev/nuker/pyro/fc.0:I
        //   274: ifeq            282
        //   277: ldc             1980116262
        //   279: goto            284
        //   282: ldc             213857189
        //   284: ldc             -2111526010
        //   286: ixor           
        //   287: lookupswitch {
        //          -1902405597: 312
        //          -199063904: 282
        //          default: 2069
        //        }
        //   312: invokevirtual   dev/nuker/pyro/f0y.3:()Ldev/nuker/pyro/fS;
        //   315: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   318: checkcast       Ldev/nuker/pyro/f0n;
        //   321: getstatic       dev/nuker/pyro/fc.1:I
        //   324: ifeq            332
        //   327: ldc             -2070945732
        //   329: goto            334
        //   332: ldc             -1633052630
        //   334: ldc             1402602633
        //   336: ixor           
        //   337: lookupswitch {
        //          -852255581: 364
        //          -686431051: 332
        //          default: 2039
        //        }
        //   364: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   367: checkcast       Ldev/nuker/pyro/f0b;
        //   370: putfield        dev/nuker/pyro/f9H.c:Ldev/nuker/pyro/f0b;
        //   373: aload_0        
        //   374: getstatic       dev/nuker/pyro/fc.c:I
        //   377: ifge            385
        //   380: ldc             -683732824
        //   382: goto            387
        //   385: ldc             1178394538
        //   387: ldc             -291715503
        //   389: ixor           
        //   390: lookupswitch {
        //          967038713: 2073
        //          1660094823: 385
        //          default: 416
        //        }
        //   416: aload_0        
        //   417: new             Ldev/nuker/pyro/f0b;
        //   420: dup            
        //   421: ldc             "\u227c\u1490\u8b6f\ub3dc\uc95c\uec6f\ub21b\ue742\ud967\ue92d\ua6b4\u1e5e"
        //   423: invokestatic    invokestatic   !!! ERROR
        //   426: ldc             "\u225c\u1490\u8b6f\ub3dc\uc95c\uec6f\ub264\ue762\ud967\ue92d\ua6b4\u1e5e"
        //   428: getstatic       dev/nuker/pyro/fc.1:I
        //   431: ifeq            439
        //   434: ldc             374530298
        //   436: goto            441
        //   439: ldc             1736513551
        //   441: ldc             -663729767
        //   443: ixor           
        //   444: lookupswitch {
        //          -1074703978: 472
        //          -836589213: 439
        //          default: 2059
        //        }
        //   472: invokestatic    invokestatic   !!! ERROR
        //   475: aconst_null    
        //   476: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   479: getstatic       dev/nuker/pyro/fc.0:I
        //   482: ifeq            490
        //   485: ldc             -2003036847
        //   487: goto            492
        //   490: ldc             1445600288
        //   492: ldc             -2042309767
        //   494: ixor           
        //   495: lookupswitch {
        //          249087528: 2023
        //          780841668: 490
        //          default: 520
        //        }
        //   520: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   523: invokevirtual   dev/nuker/pyro/f0y.1:()Ldev/nuker/pyro/fS;
        //   526: getstatic       dev/nuker/pyro/fc.c:I
        //   529: ifge            537
        //   532: ldc             1376161285
        //   534: goto            539
        //   537: ldc             643338074
        //   539: ldc             1882191532
        //   541: ixor           
        //   542: lookupswitch {
        //          573143209: 537
        //          1450670582: 568
        //          default: 2037
        //        }
        //   568: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   571: checkcast       Ldev/nuker/pyro/f0n;
        //   574: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   577: checkcast       Ldev/nuker/pyro/f0b;
        //   580: putfield        dev/nuker/pyro/f9H.0:Ldev/nuker/pyro/f0b;
        //   583: aload_0        
        //   584: aload_0        
        //   585: new             Ldev/nuker/pyro/f0b;
        //   588: dup            
        //   589: ldc             "\u227c\u1490\u8b78\ub3d0\uc944\uec7e\ub21b\ue742\ud967\ue92d\ua6b4\u1e5e"
        //   591: invokestatic    invokestatic   !!! ERROR
        //   594: ldc             "\u225c\u1490\u8b78\ub3d0\uc944\uec7e\ub264\ue762\ud967\ue92d\ua6b4\u1e5e"
        //   596: invokestatic    invokestatic   !!! ERROR
        //   599: aconst_null    
        //   600: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   603: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   606: invokevirtual   dev/nuker/pyro/f0y.b:()Ldev/nuker/pyro/fS;
        //   609: getstatic       dev/nuker/pyro/fc.1:I
        //   612: ifeq            620
        //   615: ldc             147679042
        //   617: goto            622
        //   620: ldc             -372328114
        //   622: ldc             2025617237
        //   624: ixor           
        //   625: lookupswitch {
        //          -145168279: 620
        //          1886457879: 2053
        //          default: 652
        //        }
        //   652: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   655: checkcast       Ldev/nuker/pyro/f0n;
        //   658: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   661: checkcast       Ldev/nuker/pyro/f0b;
        //   664: putfield        dev/nuker/pyro/f9H.1:Ldev/nuker/pyro/f0b;
        //   667: aload_0        
        //   668: getstatic       dev/nuker/pyro/fc.c:I
        //   671: ifge            679
        //   674: ldc             1259360370
        //   676: goto            681
        //   679: ldc             -2119146843
        //   681: ldc             1385965234
        //   683: ixor           
        //   684: lookupswitch {
        //          291870697: 679
        //          428635840: 2027
        //          default: 712
        //        }
        //   712: aload_0        
        //   713: new             Ldev/nuker/pyro/f0b;
        //   716: dup            
        //   717: ldc             "\u2274\u149d\u8b6d\ub3da\uc946\uec72\ub232\ue744\ud957\ue922\ua6b4\u1e40\ue06a\uc5b5"
        //   719: getstatic       dev/nuker/pyro/fc.1:I
        //   722: ifeq            730
        //   725: ldc             196214525
        //   727: goto            732
        //   730: ldc             -1911095172
        //   732: ldc             -468323839
        //   734: ixor           
        //   735: lookupswitch {
        //          -274461444: 730
        //          1778578045: 760
        //          default: 2075
        //        }
        //   760: invokestatic    invokestatic   !!! ERROR
        //   763: ldc             "\u2254\u149d\u8b6f\ub3cd\uc95b\uec6d\ub221\ue701\ud94b\ue92e\ua6b7\u1e43\ue077"
        //   765: invokestatic    invokestatic   !!! ERROR
        //   768: aconst_null    
        //   769: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   772: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   775: invokevirtual   dev/nuker/pyro/f0y.9:()Ldev/nuker/pyro/fS;
        //   778: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   781: checkcast       Ldev/nuker/pyro/f0n;
        //   784: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   787: checkcast       Ldev/nuker/pyro/f0b;
        //   790: putfield        dev/nuker/pyro/f9H.2:Ldev/nuker/pyro/f0b;
        //   793: aload_0        
        //   794: getstatic       dev/nuker/pyro/fc.c:I
        //   797: ifge            805
        //   800: ldc             -1339642563
        //   802: goto            807
        //   805: ldc             -508204396
        //   807: ldc             -1339087060
        //   809: ixor           
        //   810: lookupswitch {
        //           625169: 2009
        //          1955248766: 805
        //          default: 836
        //        }
        //   836: aload_0        
        //   837: new             Ldev/nuker/pyro/f0b;
        //   840: dup            
        //   841: ldc             "\u227f\u1492\u8b6f\ub3d2\uc955\uec69\ub22b\ue754\ud966\ue925\ua684\u1e4f\ue06a\uc5ab\u81a9\u88f2"
        //   843: invokestatic    invokestatic   !!! ERROR
        //   846: ldc             "\u225f\u1492\u8b6f\ub3d2\uc955\uec69\ub22b\ue754\ud966\ue925\ua6fb\u1e6f\ue06a\uc5ab\u81a9\u88f2"
        //   848: getstatic       dev/nuker/pyro/fc.1:I
        //   851: ifeq            859
        //   854: ldc             450464646
        //   856: goto            861
        //   859: ldc             262239163
        //   861: ldc             229108922
        //   863: ixor           
        //   864: lookupswitch {
        //          33988353: 892
        //          394159932: 859
        //          default: 2035
        //        }
        //   892: invokestatic    invokestatic   !!! ERROR
        //   895: aconst_null    
        //   896: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   899: getstatic       dev/nuker/pyro/fc.0:I
        //   902: ifeq            910
        //   905: ldc             -1324132956
        //   907: goto            912
        //   910: ldc             -740115295
        //   912: ldc             30844655
        //   914: ixor           
        //   915: lookupswitch {
        //          -1329204405: 2041
        //          1641226380: 910
        //          default: 940
        //        }
        //   940: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   943: invokevirtual   dev/nuker/pyro/f0y.a:()Ldev/nuker/pyro/fS;
        //   946: getstatic       dev/nuker/pyro/fc.c:I
        //   949: ifge            957
        //   952: ldc             -66254051
        //   954: goto            959
        //   957: ldc             1150588731
        //   959: ldc             621216098
        //   961: ixor           
        //   962: lookupswitch {
        //          -653653377: 2055
        //          2043270367: 957
        //          default: 988
        //        }
        //   988: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   991: checkcast       Ldev/nuker/pyro/f0n;
        //   994: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   997: checkcast       Ldev/nuker/pyro/f0b;
        //  1000: putfield        dev/nuker/pyro/f9H.3:Ldev/nuker/pyro/f0b;
        //  1003: aload_0        
        //  1004: aload_0        
        //  1005: new             Ldev/nuker/pyro/f0b;
        //  1008: dup            
        //  1009: ldc             "\u227f\u1492\u8b6f\ub3d2\uc955\uec69\ub22b\ue754\ud966\ue925\ua684\u1e4f\ue06a\uc5ab\u81a9\u88f2\u579b\u768c\ubd32\uc08b\u2a8a\uc229\u6b89\u2d52"
        //  1011: getstatic       dev/nuker/pyro/fc.0:I
        //  1014: ifeq            1022
        //  1017: ldc             -1325639125
        //  1019: goto            1024
        //  1022: ldc             479845090
        //  1024: ldc             192006494
        //  1026: ixor           
        //  1027: lookupswitch {
        //          -1148349579: 2067
        //          1029499374: 1022
        //          default: 1052
        //        }
        //  1052: invokestatic    invokestatic   !!! ERROR
        //  1055: ldc             "\u2255\u149c\u8b7a\ub397\uc912\uec59\ub225\ue742\ud963\ue926\ua6a9\u1e43\ue070\uc5a9\u81a2\u88a0\u5787\u768b\ubd31\uc092\u2a9d"
        //  1057: invokestatic    invokestatic   !!! ERROR
        //  1060: aconst_null    
        //  1061: getstatic       dev/nuker/pyro/fc.0:I
        //  1064: ifeq            1072
        //  1067: ldc             -710650728
        //  1069: goto            1074
        //  1072: ldc             -1930191026
        //  1074: ldc             -392909338
        //  1076: ixor           
        //  1077: lookupswitch {
        //          1026619774: 1072
        //          1684484776: 1104
        //          default: 2029
        //        }
        //  1104: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //  1107: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //  1110: getstatic       dev/nuker/pyro/fc.1:I
        //  1113: ifeq            1121
        //  1116: ldc             1809194529
        //  1118: goto            1123
        //  1121: ldc             811240890
        //  1123: ldc             -530551959
        //  1125: ixor           
        //  1126: lookupswitch {
        //          -1950976696: 1121
        //          -801446189: 1152
        //          default: 2071
        //        }
        //  1152: invokevirtual   dev/nuker/pyro/f0y.5:()Ldev/nuker/pyro/fS;
        //  1155: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //  1158: checkcast       Ldev/nuker/pyro/f0n;
        //  1161: getstatic       dev/nuker/pyro/fc.1:I
        //  1164: ifeq            1172
        //  1167: ldc             -555978307
        //  1169: goto            1174
        //  1172: ldc             -1167157161
        //  1174: ldc             1428053647
        //  1176: ixor           
        //  1177: lookupswitch {
        //          -1950208206: 1172
        //          -277821736: 1204
        //          default: 2011
        //        }
        //  1204: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1207: checkcast       Ldev/nuker/pyro/f0b;
        //  1210: putfield        dev/nuker/pyro/f9H.4:Ldev/nuker/pyro/f0b;
        //  1213: aload_0        
        //  1214: getstatic       dev/nuker/pyro/fc.0:I
        //  1217: ifeq            1225
        //  1220: ldc             1901433199
        //  1222: goto            1227
        //  1225: ldc             -522553341
        //  1227: ldc             206854590
        //  1229: ixor           
        //  1230: lookupswitch {
        //          -1607345116: 1225
        //          2097268945: 2015
        //          default: 1256
        //        }
        //  1256: aload_0        
        //  1257: new             Ldev/nuker/pyro/f0d;
        //  1260: dup            
        //  1261: ldc             "\u226e\u1490\u8b6d\ub3d5\uc957"
        //  1263: getstatic       dev/nuker/pyro/fc.1:I
        //  1266: ifeq            1274
        //  1269: ldc             624163783
        //  1271: goto            1276
        //  1274: ldc             1423723310
        //  1276: ldc             -1110076857
        //  1278: ixor           
        //  1279: lookupswitch {
        //          -1729730176: 1274
        //          -385230487: 1304
        //          default: 2049
        //        }
        //  1304: invokestatic    invokestatic   !!! ERROR
        //  1307: ldc             "\u224e\u1490\u8b6d\ub3d5\uc957"
        //  1309: invokestatic    invokestatic   !!! ERROR
        //  1312: aconst_null    
        //  1313: dconst_1       
        //  1314: ldc2_w          0.1
        //  1317: ldc2_w          2.0
        //  1320: dconst_0       
        //  1321: bipush          64
        //  1323: aconst_null    
        //  1324: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1327: checkcast       Ldev/nuker/pyro/f0n;
        //  1330: getstatic       dev/nuker/pyro/fc.c:I
        //  1333: ifge            1341
        //  1336: ldc             1932589449
        //  1338: goto            1343
        //  1341: ldc             894270993
        //  1343: ldc             -595572328
        //  1345: ixor           
        //  1346: lookupswitch {
        //          -1347375087: 1341
        //          -372426871: 1372
        //          default: 2045
        //        }
        //  1372: invokevirtual   dev/nuker/pyro/f9H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1375: checkcast       Ldev/nuker/pyro/f0d;
        //  1378: getstatic       dev/nuker/pyro/fc.1:I
        //  1381: ifeq            1389
        //  1384: ldc             83188498
        //  1386: goto            1391
        //  1389: ldc             1388710115
        //  1391: ldc             -1434118343
        //  1393: ixor           
        //  1394: lookupswitch {
        //          -1368372181: 2033
        //          35887315: 1389
        //          default: 1420
        //        }
        //  1420: putfield        dev/nuker/pyro/f9H.c:Ldev/nuker/pyro/f0d;
        //  1423: aload_0        
        //  1424: getstatic       dev/nuker/pyro/fc.c:I
        //  1427: ifge            1435
        //  1430: ldc             -1511214463
        //  1432: goto            1437
        //  1435: ldc             20027666
        //  1437: ldc             2098895973
        //  1439: ixor           
        //  1440: lookupswitch {
        //          -654954780: 2051
        //          1280022827: 1435
        //          default: 1468
        //        }
        //  1468: getfield        dev/nuker/pyro/f9H.c:Ldev/nuker/pyro/f0b;
        //  1471: getstatic       dev/nuker/pyro/fc.0:I
        //  1474: ifeq            1482
        //  1477: ldc             -869291525
        //  1479: goto            1484
        //  1482: ldc             -324592736
        //  1484: ldc             914975208
        //  1486: ixor           
        //  1487: lookupswitch {
        //          -89735149: 2007
        //          328179293: 1482
        //          default: 1512
        //        }
        //  1512: getstatic       dev/nuker/pyro/f9A.c:Ldev/nuker/pyro/f9A;
        //  1515: checkcast       Ljava/util/function/Consumer;
        //  1518: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1521: getstatic       dev/nuker/pyro/fc.0:I
        //  1524: ifeq            1532
        //  1527: ldc             1977988249
        //  1529: goto            1534
        //  1532: ldc             -1412518135
        //  1534: ldc             312724051
        //  1536: ixor           
        //  1537: lookupswitch {
        //          1681343445: 1532
        //          1732673226: 2057
        //          default: 1564
        //        }
        //  1564: aload_0        
        //  1565: getfield        dev/nuker/pyro/f9H.0:Ldev/nuker/pyro/f0b;
        //  1568: getstatic       dev/nuker/pyro/fc.0:I
        //  1571: ifeq            1579
        //  1574: ldc             -1419954098
        //  1576: goto            1581
        //  1579: ldc             -1202590817
        //  1581: ldc             -368849534
        //  1583: ixor           
        //  1584: lookupswitch {
        //          1096742348: 1579
        //          1381115421: 1612
        //          default: 2021
        //        }
        //  1612: getstatic       dev/nuker/pyro/f9B.c:Ldev/nuker/pyro/f9B;
        //  1615: checkcast       Ljava/util/function/Consumer;
        //  1618: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1621: aload_0        
        //  1622: getstatic       dev/nuker/pyro/fc.0:I
        //  1625: ifeq            1633
        //  1628: ldc             533605976
        //  1630: goto            1635
        //  1633: ldc             -1861937047
        //  1635: ldc             1634283318
        //  1637: ixor           
        //  1638: lookupswitch {
        //          1087540261: 1633
        //          2124874094: 2043
        //          default: 1664
        //        }
        //  1664: getfield        dev/nuker/pyro/f9H.1:Ldev/nuker/pyro/f0b;
        //  1667: getstatic       dev/nuker/pyro/f9C.c:Ldev/nuker/pyro/f9C;
        //  1670: checkcast       Ljava/util/function/Consumer;
        //  1673: getstatic       dev/nuker/pyro/fc.0:I
        //  1676: ifeq            1685
        //  1679: ldc_w           662514388
        //  1682: goto            1688
        //  1685: ldc_w           -1564329204
        //  1688: ldc_w           -1385211524
        //  1691: ixor           
        //  1692: lookupswitch {
        //          -1978502232: 2017
        //          -1455787713: 1685
        //          default: 1720
        //        }
        //  1720: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1723: aload_0        
        //  1724: getfield        dev/nuker/pyro/f9H.2:Ldev/nuker/pyro/f0b;
        //  1727: getstatic       dev/nuker/pyro/f9D.c:Ldev/nuker/pyro/f9D;
        //  1730: checkcast       Ljava/util/function/Consumer;
        //  1733: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1736: getstatic       dev/nuker/pyro/fc.c:I
        //  1739: ifge            1748
        //  1742: ldc_w           -1868263816
        //  1745: goto            1751
        //  1748: ldc_w           -844712558
        //  1751: ldc_w           697505329
        //  1754: ixor           
        //  1755: lookupswitch {
        //          -1187538871: 1748
        //          -466246749: 1780
        //          default: 2005
        //        }
        //  1780: aload_0        
        //  1781: getstatic       dev/nuker/pyro/fc.1:I
        //  1784: ifeq            1793
        //  1787: ldc_w           921875461
        //  1790: goto            1796
        //  1793: ldc_w           358404243
        //  1796: ldc_w           2128819654
        //  1799: ixor           
        //  1800: lookupswitch {
        //          1209106883: 1793
        //          1807738197: 1828
        //          default: 2063
        //        }
        //  1828: getfield        dev/nuker/pyro/f9H.3:Ldev/nuker/pyro/f0b;
        //  1831: getstatic       dev/nuker/pyro/f9E.c:Ldev/nuker/pyro/f9E;
        //  1834: checkcast       Ljava/util/function/Consumer;
        //  1837: getstatic       dev/nuker/pyro/fc.1:I
        //  1840: ifeq            1849
        //  1843: ldc_w           1458224442
        //  1846: goto            1852
        //  1849: ldc_w           -296601536
        //  1852: ldc_w           622087590
        //  1855: ixor           
        //  1856: lookupswitch {
        //          -1562329101: 1849
        //          1946087580: 2065
        //          default: 1884
        //        }
        //  1884: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1887: aload_0        
        //  1888: getfield        dev/nuker/pyro/f9H.4:Ldev/nuker/pyro/f0b;
        //  1891: getstatic       dev/nuker/pyro/f9F.c:Ldev/nuker/pyro/f9F;
        //  1894: checkcast       Ljava/util/function/Consumer;
        //  1897: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/util/function/Consumer;)V
        //  1900: getstatic       dev/nuker/pyro/fc.c:I
        //  1903: ifge            1912
        //  1906: ldc_w           -975093327
        //  1909: goto            1915
        //  1912: ldc_w           1913428852
        //  1915: ldc_w           138863851
        //  1918: ixor           
        //  1919: lookupswitch {
        //          -844651174: 1912
        //          2051702687: 1944
        //          default: 2013
        //        }
        //  1944: aload_0        
        //  1945: getstatic       dev/nuker/pyro/fc.c:I
        //  1948: ifge            1957
        //  1951: ldc_w           -882863873
        //  1954: goto            1960
        //  1957: ldc_w           714586587
        //  1960: ldc_w           2056544699
        //  1963: ixor           
        //  1964: lookupswitch {
        //          -1309347516: 1957
        //          1342429280: 1992
        //          default: 2019
        //        }
        //  1992: getfield        dev/nuker/pyro/f9H.c:Ldev/nuker/pyro/f0d;
        //  1995: getstatic       dev/nuker/pyro/f9G.c:Ldev/nuker/pyro/f9G;
        //  1998: checkcast       Ljava/util/function/Consumer;
        //  2001: invokevirtual   dev/nuker/pyro/f0d.c:(Ljava/util/function/Consumer;)V
        //  2004: return         
        //  2005: aconst_null    
        //  2006: athrow         
        //  2007: aconst_null    
        //  2008: athrow         
        //  2009: aconst_null    
        //  2010: athrow         
        //  2011: aconst_null    
        //  2012: athrow         
        //  2013: aconst_null    
        //  2014: athrow         
        //  2015: aconst_null    
        //  2016: athrow         
        //  2017: aconst_null    
        //  2018: athrow         
        //  2019: aconst_null    
        //  2020: athrow         
        //  2021: aconst_null    
        //  2022: athrow         
        //  2023: aconst_null    
        //  2024: athrow         
        //  2025: aconst_null    
        //  2026: athrow         
        //  2027: aconst_null    
        //  2028: athrow         
        //  2029: aconst_null    
        //  2030: athrow         
        //  2031: aconst_null    
        //  2032: athrow         
        //  2033: aconst_null    
        //  2034: athrow         
        //  2035: aconst_null    
        //  2036: athrow         
        //  2037: aconst_null    
        //  2038: athrow         
        //  2039: aconst_null    
        //  2040: athrow         
        //  2041: aconst_null    
        //  2042: athrow         
        //  2043: aconst_null    
        //  2044: athrow         
        //  2045: aconst_null    
        //  2046: athrow         
        //  2047: aconst_null    
        //  2048: athrow         
        //  2049: aconst_null    
        //  2050: athrow         
        //  2051: aconst_null    
        //  2052: athrow         
        //  2053: aconst_null    
        //  2054: athrow         
        //  2055: aconst_null    
        //  2056: athrow         
        //  2057: aconst_null    
        //  2058: athrow         
        //  2059: aconst_null    
        //  2060: athrow         
        //  2061: aconst_null    
        //  2062: athrow         
        //  2063: aconst_null    
        //  2064: athrow         
        //  2065: aconst_null    
        //  2066: athrow         
        //  2067: aconst_null    
        //  2068: athrow         
        //  2069: aconst_null    
        //  2070: athrow         
        //  2071: aconst_null    
        //  2072: athrow         
        //  2073: aconst_null    
        //  2074: athrow         
        //  2075: aconst_null    
        //  2076: athrow         
        //    StackMapTable: 00 90 FF 00 0E 00 01 06 00 02 06 07 01 2C FF 00 01 00 01 06 00 03 06 07 01 2C 01 FF 00 1B 00 01 06 00 02 06 07 01 2C FF 00 4F 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 32 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 20 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C FF 00 11 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 56 FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 56 01 FF 00 1B 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 56 FF 00 0D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 5F FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 5F 01 FF 00 1B 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 5F FF 00 13 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 32 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 54 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 16 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C FF 00 11 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 00 56 FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 00 56 01 FF 00 1B 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 00 56 FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 01 2E FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 01 2E 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 01 2E FF 00 33 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 49 08 02 49 07 01 2C 07 01 2C 05 07 01 2E FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 02 49 08 02 49 07 01 2C 07 01 2C 05 07 01 2E 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 49 08 02 49 07 01 2C 07 01 2C 05 07 01 2E 5A 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 11 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 C9 08 02 C9 07 01 2C FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 C9 08 02 C9 07 01 2C 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 C9 08 02 C9 07 01 2C 6C 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 16 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C FF 00 11 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 00 56 FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 00 56 01 FF 00 1B 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 00 56 FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 01 2E FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 01 2E 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 01 2E FF 00 21 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C FF 00 13 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 FF 00 10 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 07 00 5F FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 07 00 5F 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 07 00 5F FF 00 13 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 32 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 54 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 11 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 E9 08 04 E9 07 01 2C FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 E9 08 04 E9 07 01 2C 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 E9 08 04 E9 07 01 2C FF 00 24 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 32 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 10 00 01 07 00 03 00 02 07 00 03 07 00 CA FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 CA 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 CA 4E 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 4D 07 00 42 FF 00 01 00 01 07 00 03 00 02 07 00 42 01 5B 07 00 42 13 41 01 1D 4E 07 00 42 FF 00 01 00 01 07 00 03 00 02 07 00 42 01 5E 07 00 42 54 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 14 00 01 07 00 03 00 02 07 00 42 07 00 ED FF 00 02 00 01 07 00 03 00 03 07 00 42 07 00 ED 01 FF 00 1F 00 01 07 00 03 00 02 07 00 42 07 00 ED 1B 42 01 1C 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 14 00 01 07 00 03 00 02 07 00 42 07 00 ED FF 00 02 00 01 07 00 03 00 03 07 00 42 07 00 ED 01 FF 00 1F 00 01 07 00 03 00 02 07 00 42 07 00 ED 1B 42 01 1C 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 0C 41 07 00 42 41 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 42 07 00 ED 41 07 00 03 41 07 00 42 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 00 56 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 41 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 56 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 CA FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C 05 07 01 2E FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 00 56 41 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 32 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 E9 08 04 E9 07 01 2C 41 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 49 08 02 49 07 01 2C 07 01 2C 05 07 01 2E FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 45 08 03 45 07 01 2C 07 01 2C 05 07 01 2E 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 A1 08 01 A1 07 01 2C 07 01 2C FF 00 01 00 01 06 00 02 06 07 01 2C FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 42 07 00 ED FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 A7 08 00 A7 07 01 2C 07 01 2C 05 07 00 5F FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 ED 08 03 ED 07 01 2C 07 01 2C 05 07 00 5F 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 C9 08 02 C9 07 01 2C
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
    
    @NotNull
    public f0a c() {
        return fbS.02(this, 517900679);
    }
    
    @NotNull
    public f0a 0() {
        return fbS.0s(this, 498735122);
    }
    
    @Override
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5X(this, 1472826010, b, entityPlayerSP, world);
    }
}
