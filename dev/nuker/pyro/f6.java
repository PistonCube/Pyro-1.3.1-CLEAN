// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;

public class f6 extends fbk
{
    public boolean c;
    public f3y c;
    @JvmField
    @NotNull
    public static f6 c;
    public static f5 c;
    
    @f06
    public void c(@NotNull final f2X p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1163
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1155
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1147
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -927945232
        //    32: goto            37
        //    35: ldc             976717638
        //    37: ldc             -96765146
        //    39: ixor           
        //    40: lookupswitch {
        //          -1072890784: 68
        //          848025302: 35
        //          default: 1126
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/f2X.c:()Z
        //    78: goto            82
        //    81: athrow         
        //    82: ifeq            1109
        //    85: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //    88: getstatic       dev/nuker/pyro/fc.0:I
        //    91: ifeq            99
        //    94: ldc             1144675283
        //    96: goto            101
        //    99: ldc             1481276323
        //   101: ldc             -1718348992
        //   103: ixor           
        //   104: lookupswitch {
        //          -1042388765: 132
        //          -575780717: 99
        //          default: 1124
        //        }
        //   132: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   135: ifnonnull       143
        //   138: ldc             -1146720976
        //   140: goto            145
        //   143: ldc             -1146720975
        //   145: ldc             -220307184
        //   147: ixor           
        //   148: tableswitch {
        //          -1829758912: 172
        //          -1829758911: 1109
        //          default: 138
        //        }
        //   172: getstatic       dev/nuker/pyro/fc.c:I
        //   175: ifge            183
        //   178: ldc             -259022705
        //   180: goto            185
        //   183: ldc             -1570725493
        //   185: ldc             1379140958
        //   187: ixor           
        //   188: lookupswitch {
        //          -1564760623: 1134
        //          -778551356: 183
        //          default: 216
        //        }
        //   216: goto            220
        //   219: athrow         
        //   220: invokestatic    org/lwjgl/input/Keyboard.getEventKey:()I
        //   223: goto            227
        //   226: athrow         
        //   227: istore_2       
        //   228: iload_2        
        //   229: getstatic       dev/nuker/pyro/fc.c:I
        //   232: ifge            240
        //   235: ldc             -1573783354
        //   237: goto            242
        //   240: ldc             -480220807
        //   242: ldc             -636821508
        //   244: ixor           
        //   245: lookupswitch {
        //          1289775108: 240
        //          2017142586: 1112
        //          default: 272
        //        }
        //   272: getstatic       dev/nuker/pyro/Pyro.KEY:Lnet/minecraft/client/settings/KeyBinding;
        //   275: dup            
        //   276: pop            
        //   277: goto            281
        //   280: athrow         
        //   281: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   284: goto            288
        //   287: athrow         
        //   288: if_icmpne       502
        //   291: aload_0        
        //   292: getfield        dev/nuker/pyro/f6.c:Ldev/nuker/pyro/f3y;
        //   295: ifnonnull       303
        //   298: ldc             731316883
        //   300: goto            305
        //   303: ldc             731316884
        //   305: ldc             -1227410480
        //   307: ixor           
        //   308: tableswitch {
        //          981492358: 332
        //          981492359: 395
        //          default: 298
        //        }
        //   332: getstatic       dev/nuker/pyro/fc.1:I
        //   335: ifeq            343
        //   338: ldc             -1648001743
        //   340: goto            345
        //   343: ldc             1859613328
        //   345: ldc             -456486180
        //   347: ixor           
        //   348: lookupswitch {
        //          -993180767: 343
        //          2031087597: 1132
        //          default: 376
        //        }
        //   376: aload_0        
        //   377: new             Ldev/nuker/pyro/f3y;
        //   380: dup            
        //   381: goto            385
        //   384: athrow         
        //   385: invokespecial   dev/nuker/pyro/f3y.<init>:()V
        //   388: goto            392
        //   391: athrow         
        //   392: putfield        dev/nuker/pyro/f6.c:Ldev/nuker/pyro/f3y;
        //   395: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //   398: aload_0        
        //   399: getstatic       dev/nuker/pyro/fc.c:I
        //   402: ifge            410
        //   405: ldc             205832231
        //   407: goto            412
        //   410: ldc             26116903
        //   412: ldc             2030122642
        //   414: ixor           
        //   415: lookupswitch {
        //          1967519413: 410
        //          2022684085: 440
        //          default: 1116
        //        }
        //   440: getfield        dev/nuker/pyro/f6.c:Ldev/nuker/pyro/f3y;
        //   443: checkcast       Lnet/minecraft/client/gui/GuiScreen;
        //   446: getstatic       dev/nuker/pyro/fc.1:I
        //   449: ifeq            457
        //   452: ldc             1596773822
        //   454: goto            459
        //   457: ldc             1542280141
        //   459: ldc             -1679979356
        //   461: ixor           
        //   462: lookupswitch {
        //          -1070538903: 488
        //          -990815974: 457
        //          default: 1130
        //        }
        //   488: goto            492
        //   491: athrow         
        //   492: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
        //   495: goto            499
        //   498: athrow         
        //   499: goto            559
        //   502: getstatic       dev/nuker/pyro/fc.c:I
        //   505: ifge            513
        //   508: ldc             -1822217949
        //   510: goto            515
        //   513: ldc             1585688208
        //   515: ldc             -403202954
        //   517: ixor           
        //   518: lookupswitch {
        //          1075019674: 513
        //          1955902805: 1110
        //          default: 544
        //        }
        //   544: getstatic       dev/nuker/pyro/fQ.c:Ldev/nuker/pyro/fQ;
        //   547: iload_2        
        //   548: goto            552
        //   551: athrow         
        //   552: invokevirtual   dev/nuker/pyro/fQ.c:(I)V
        //   555: goto            559
        //   558: athrow         
        //   559: getstatic       dev/nuker/pyro/fc.c:I
        //   562: ifge            570
        //   565: ldc             1352010606
        //   567: goto            572
        //   570: ldc             421396343
        //   572: ldc             -866916649
        //   574: ixor           
        //   575: lookupswitch {
        //          -1664750151: 570
        //          -716301920: 600
        //          default: 1118
        //        }
        //   600: iload_2        
        //   601: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //   604: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   607: getstatic       dev/nuker/pyro/fc.1:I
        //   610: ifeq            618
        //   613: ldc             -1059500112
        //   615: goto            620
        //   618: ldc             2099532604
        //   620: ldc             454318456
        //   622: ixor           
        //   623: lookupswitch {
        //          -607316280: 1128
        //          1480802619: 618
        //          default: 648
        //        }
        //   648: getfield        net/minecraft/client/settings/GameSettings.field_74311_E:Lnet/minecraft/client/settings/KeyBinding;
        //   651: dup            
        //   652: pop            
        //   653: goto            657
        //   656: athrow         
        //   657: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   660: goto            664
        //   663: athrow         
        //   664: if_icmpne       672
        //   667: ldc             -1905291732
        //   669: goto            674
        //   672: ldc             -1905291729
        //   674: ldc             -773354591
        //   676: ixor           
        //   677: tableswitch {
        //          -1089467622: 700
        //          -1089467621: 1109
        //          default: 667
        //        }
        //   700: getstatic       dev/nuker/pyro/fc.0:I
        //   703: ifeq            711
        //   706: ldc             -1414511407
        //   708: goto            713
        //   711: ldc             673917597
        //   713: ldc             1984275941
        //   715: ixor           
        //   716: lookupswitch {
        //          -571088588: 711
        //          1584303992: 744
        //          default: 1114
        //        }
        //   744: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7e;
        //   747: getstatic       dev/nuker/pyro/fc.1:I
        //   750: ifeq            758
        //   753: ldc             -1032085582
        //   755: goto            760
        //   758: ldc             997660822
        //   760: ldc             1173166483
        //   762: ixor           
        //   763: lookupswitch {
        //          -2020178399: 1136
        //          541499247: 758
        //          default: 788
        //        }
        //   788: goto            792
        //   791: athrow         
        //   792: invokevirtual   dev/nuker/pyro/f7e.5:()Z
        //   795: goto            799
        //   798: athrow         
        //   799: ifeq            807
        //   802: ldc             1678008898
        //   804: goto            809
        //   807: ldc             1678008897
        //   809: ldc             -1158563045
        //   811: ixor           
        //   812: tableswitch {
        //          -1108626766: 836
        //          -1108626765: 1109
        //          default: 802
        //        }
        //   836: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7e;
        //   839: goto            843
        //   842: athrow         
        //   843: invokevirtual   dev/nuker/pyro/f7e.7:()Ldev/nuker/pyro/f0a;
        //   846: goto            850
        //   849: athrow         
        //   850: goto            854
        //   853: athrow         
        //   854: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   857: goto            861
        //   860: athrow         
        //   861: checkcast       Ljava/lang/Boolean;
        //   864: goto            868
        //   867: athrow         
        //   868: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   871: goto            875
        //   874: athrow         
        //   875: ifeq            1109
        //   878: goto            882
        //   881: athrow         
        //   882: invokestatic    baritone/api/BaritoneAPI.getProvider:()Lbaritone/api/IBaritoneProvider;
        //   885: goto            889
        //   888: athrow         
        //   889: dup            
        //   890: pop            
        //   891: getstatic       dev/nuker/pyro/fc.1:I
        //   894: ifeq            902
        //   897: ldc             2040888865
        //   899: goto            904
        //   902: ldc             -1738098986
        //   904: ldc             73430261
        //   906: ixor           
        //   907: lookupswitch {
        //          -1592570432: 902
        //          2110065364: 1120
        //          default: 932
        //        }
        //   932: goto            936
        //   935: athrow         
        //   936: invokeinterface baritone/api/IBaritoneProvider.getPrimaryBaritone:()Lbaritone/api/IBaritone;
        //   941: goto            945
        //   944: athrow         
        //   945: dup            
        //   946: pop            
        //   947: goto            951
        //   950: athrow         
        //   951: invokeinterface baritone/api/IBaritone.getPathingBehavior:()Lbaritone/api/behavior/IPathingBehavior;
        //   956: goto            960
        //   959: athrow         
        //   960: dup            
        //   961: pop            
        //   962: getstatic       dev/nuker/pyro/fc.c:I
        //   965: ifge            973
        //   968: ldc             -1837006295
        //   970: goto            975
        //   973: ldc             548236020
        //   975: ldc             -1421589642
        //   977: ixor           
        //   978: lookupswitch {
        //          -1947653758: 1004
        //          969261407: 973
        //          default: 1122
        //        }
        //  1004: goto            1008
        //  1007: athrow         
        //  1008: invokeinterface baritone/api/behavior/IPathingBehavior.isPathing:()Z
        //  1013: goto            1017
        //  1016: athrow         
        //  1017: ifeq            1109
        //  1020: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9z;
        //  1023: getfield        dev/nuker/pyro/f9z.c:Ldev/nuker/pyro/fw;
        //  1026: goto            1030
        //  1029: athrow         
        //  1030: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: checkcast       Ljava/lang/Boolean;
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1047: goto            1051
        //  1050: athrow         
        //  1051: ifne            1109
        //  1054: goto            1058
        //  1057: athrow         
        //  1058: invokestatic    baritone/api/BaritoneAPI.getProvider:()Lbaritone/api/IBaritoneProvider;
        //  1061: goto            1065
        //  1064: athrow         
        //  1065: dup            
        //  1066: pop            
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: invokeinterface baritone/api/IBaritoneProvider.getPrimaryBaritone:()Lbaritone/api/IBaritone;
        //  1076: goto            1080
        //  1079: athrow         
        //  1080: dup            
        //  1081: pop            
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: invokeinterface baritone/api/IBaritone.getPathingBehavior:()Lbaritone/api/behavior/IPathingBehavior;
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: goto            1099
        //  1098: athrow         
        //  1099: invokeinterface baritone/api/behavior/IPathingBehavior.cancelEverything:()Z
        //  1104: goto            1108
        //  1107: athrow         
        //  1108: pop            
        //  1109: return         
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
        //  1138: pop            
        //  1139: goto            24
        //  1142: pop            
        //  1143: aconst_null    
        //  1144: goto            1138
        //  1147: dup            
        //  1148: ifnull          1138
        //  1151: checkcast       Ljava/lang/Throwable;
        //  1154: athrow         
        //  1155: dup            
        //  1156: ifnull          1142
        //  1159: checkcast       Ljava/lang/Throwable;
        //  1162: athrow         
        //  1163: aconst_null    
        //  1164: athrow         
        //    StackMapTable: 00 A8 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FD 00 03 07 00 03 07 00 3D 0A 41 01 1E 45 07 00 35 40 07 00 3D 45 07 00 35 40 01 50 07 00 4B FF 00 01 00 02 07 00 03 07 00 3D 00 02 07 00 4B 01 5E 07 00 4B 05 04 41 01 1A 0A 41 01 1E FF 00 02 00 00 00 01 07 00 35 FD 00 00 07 00 03 07 00 3D 45 07 00 35 40 01 FF 00 0C 00 03 07 00 03 07 00 3D 01 00 01 01 FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 01 01 5D 01 47 07 00 10 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 01 07 00 66 45 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 01 01 09 04 41 01 1A 0A 41 01 1E 47 07 00 10 FF 00 00 00 03 07 00 03 07 00 3D 01 00 03 07 00 03 08 01 79 08 01 79 45 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 07 00 03 07 00 73 02 FF 00 0E 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 3D 01 00 03 07 00 4B 07 00 03 01 FF 00 1B 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 03 FF 00 10 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 7C FF 00 01 00 03 07 00 03 07 00 3D 01 00 03 07 00 4B 07 00 7C 01 FF 00 1C 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 7C 42 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 7C 45 07 00 35 00 02 0A 41 01 1C 46 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 07 00 88 01 45 07 00 35 00 0A 41 01 1B FF 00 11 00 03 07 00 03 07 00 3D 01 00 02 01 07 00 9A FF 00 01 00 03 07 00 03 07 00 3D 01 00 03 01 07 00 9A 01 FF 00 1B 00 03 07 00 03 07 00 3D 01 00 02 01 07 00 9A 47 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 01 07 00 66 45 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 02 01 01 02 04 41 01 19 0A 41 01 1E 4D 07 00 AD FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 07 00 AD 01 5B 07 00 AD 42 07 00 35 40 07 00 AD 45 07 00 35 40 01 02 04 41 01 1A 45 07 00 35 40 07 00 AD 45 07 00 35 40 07 00 B9 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 01 07 00 B9 45 07 00 35 40 07 00 F0 45 07 00 35 40 07 00 BF 45 07 00 35 40 01 45 07 00 22 00 45 07 00 35 40 07 00 CD 4C 07 00 CD FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 07 00 CD 01 5B 07 00 CD 42 07 00 35 40 07 00 CD 47 07 00 35 40 07 00 D3 44 07 00 2A 40 07 00 D3 47 07 00 35 40 07 00 DC 4C 07 00 DC FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 07 00 DC 01 5C 07 00 DC FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 01 07 00 DC 47 07 00 35 40 01 4B 07 00 35 40 07 00 E9 45 07 00 35 40 07 00 F0 45 07 00 35 40 07 00 BF 45 07 00 35 40 01 45 07 00 35 00 45 07 00 35 40 07 00 CD FF 00 04 00 00 00 01 07 00 35 FF 00 00 00 03 07 00 03 07 00 3D 01 00 01 07 00 CD 47 07 00 35 40 07 00 D3 44 07 00 35 40 07 00 D3 47 07 00 35 40 07 00 DC 42 07 00 35 40 07 00 DC 47 07 00 35 40 01 FA 00 00 FC 00 00 01 41 01 01 FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 03 01 41 07 00 CD 41 07 00 DC FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 4B 01 FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 01 07 00 9A FF 00 01 00 03 07 00 03 07 00 3D 01 00 02 07 00 4B 07 00 7C 01 FA 00 01 FF 00 01 00 03 07 00 03 07 00 3D 01 00 01 07 00 AD FF 00 01 00 02 07 00 03 07 00 3D 00 01 07 00 22 43 05 44 07 00 22 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1147   1155   Ljava/lang/EnumConstantNotPresentException;
        //  1147   1155   1147   1155   Ljava/lang/ArithmeticException;
        //  1163   1165   3      8      Any
        //  74     81     81     82     Any
        //  74     81     81     82     Ljava/lang/IllegalArgumentException;
        //  74     81     81     82     Ljava/util/NoSuchElementException;
        //  74     81     81     82     Ljava/lang/IllegalArgumentException;
        //  75     81     74     75     Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    3      8      Ljava/lang/IllegalStateException;
        //  220    226    3      8      Any
        //  280    287    287    288    Any
        //  281    287    3      8      Any
        //  281    287    3      8      Ljava/lang/IllegalArgumentException;
        //  280    287    287    288    Any
        //  280    287    280    281    Ljava/lang/EnumConstantNotPresentException;
        //  384    391    391    392    Any
        //  384    391    3      8      Ljava/lang/NegativeArraySizeException;
        //  385    391    384    385    Ljava/lang/EnumConstantNotPresentException;
        //  385    391    3      8      Any
        //  385    391    3      8      Any
        //  491    498    498    499    Any
        //  492    498    3      8      Any
        //  492    498    498    499    Any
        //  492    498    498    499    Ljava/lang/ClassCastException;
        //  492    498    491    492    Any
        //  551    558    558    559    Any
        //  552    558    558    559    Ljava/lang/NullPointerException;
        //  551    558    3      8      Any
        //  552    558    551    552    Any
        //  551    558    3      8      Any
        //  656    663    663    664    Any
        //  657    663    663    664    Ljava/lang/IndexOutOfBoundsException;
        //  657    663    656    657    Any
        //  657    663    663    664    Any
        //  656    663    663    664    Ljava/lang/RuntimeException;
        //  791    798    798    799    Any
        //  791    798    791    792    Any
        //  792    798    791    792    Ljava/lang/RuntimeException;
        //  792    798    3      8      Any
        //  792    798    798    799    Ljava/util/NoSuchElementException;
        //  842    849    849    850    Any
        //  842    849    842    843    Ljava/lang/UnsupportedOperationException;
        //  843    849    849    850    Ljava/lang/NullPointerException;
        //  843    849    842    843    Any
        //  843    849    842    843    Ljava/util/NoSuchElementException;
        //  854    860    860    861    Any
        //  854    860    860    861    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  854    860    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  854    860    3      8      Ljava/lang/AssertionError;
        //  854    860    3      8      Any
        //  867    874    874    875    Any
        //  867    874    874    875    Any
        //  867    874    874    875    Ljava/lang/RuntimeException;
        //  867    874    3      8      Ljava/util/NoSuchElementException;
        //  867    874    867    868    Any
        //  881    888    888    889    Any
        //  882    888    881    882    Ljava/lang/EnumConstantNotPresentException;
        //  882    888    881    882    Ljava/lang/IllegalStateException;
        //  881    888    888    889    Any
        //  882    888    3      8      Any
        //  935    944    944    945    Any
        //  936    944    944    945    Any
        //  936    944    944    945    Any
        //  935    944    935    936    Any
        //  936    944    944    945    Any
        //  950    959    959    960    Any
        //  950    959    959    960    Any
        //  951    959    3      8      Any
        //  950    959    3      8      Any
        //  950    959    950    951    Ljava/util/ConcurrentModificationException;
        //  1008   1016   1016   1017   Any
        //  1008   1016   3      8      Any
        //  1008   1016   3      8      Any
        //  1008   1016   3      8      Any
        //  1008   1016   1016   1017   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1029   1036   1036   1037   Any
        //  1029   1036   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1030   1036   1029   1030   Ljava/lang/NumberFormatException;
        //  1030   1036   1029   1030   Any
        //  1030   1036   1036   1037   Any
        //  1043   1050   1050   1051   Any
        //  1043   1050   3      8      Any
        //  1044   1050   3      8      Ljava/util/NoSuchElementException;
        //  1043   1050   1050   1051   Any
        //  1044   1050   1043   1044   Any
        //  1057   1064   1064   1065   Any
        //  1057   1064   1057   1058   Any
        //  1057   1064   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1057   1064   1057   1058   Ljava/lang/NumberFormatException;
        //  1057   1064   1064   1065   Any
        //  1071   1079   1079   1080   Any
        //  1071   1079   1079   1080   Any
        //  1071   1079   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1071   1079   1079   1080   Any
        //  1071   1079   1079   1080   Ljava/lang/NullPointerException;
        //  1085   1094   1094   1095   Any
        //  1085   1094   1085   1086   Ljava/lang/ClassCastException;
        //  1086   1094   3      8      Ljava/util/NoSuchElementException;
        //  1085   1094   1085   1086   Any
        //  1085   1094   1085   1086   Any
        //  1098   1107   1107   1108   Any
        //  1099   1107   1098   1099   Any
        //  1098   1107   3      8      Any
        //  1099   1107   1107   1108   Any
        //  1098   1107   3      8      Ljava/lang/NullPointerException;
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
        f6.c = new f5(null);
        f6.c = new f6();
    }
    
    @f06
    public void c(@NotNull final f2Y p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          312
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            304
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            296
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             1048040162
        //    34: goto            39
        //    37: ldc             23477154
        //    39: ldc             936113575
        //    41: ixor           
        //    42: lookupswitch {
        //          163325765: 281
        //          1150493107: 37
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            81
        //    75: ldc_w           1763536173
        //    78: goto            84
        //    81: ldc_w           1631938325
        //    84: ldc_w           772103112
        //    87: ixor           
        //    88: lookupswitch {
        //          1192769253: 81
        //          1329609949: 116
        //          default: 279
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/f2Y.c:()Z
        //   123: goto            127
        //   126: athrow         
        //   127: ifeq            136
        //   130: ldc_w           -1776768502
        //   133: goto            139
        //   136: ldc_w           -1776768499
        //   139: ldc_w           -1361206431
        //   142: ixor           
        //   143: tableswitch {
        //          1904874198: 164
        //          1904874199: 278
        //          default: 130
        //        }
        //   164: getstatic       dev/nuker/pyro/fc.0:I
        //   167: ifeq            176
        //   170: ldc_w           -1871930402
        //   173: goto            179
        //   176: ldc_w           1515370494
        //   179: ldc_w           -997614115
        //   182: ixor           
        //   183: lookupswitch {
        //          252510104: 176
        //          1424295427: 285
        //          default: 208
        //        }
        //   208: getstatic       dev/nuker/pyro/fQ.c:Ldev/nuker/pyro/fQ;
        //   211: getstatic       dev/nuker/pyro/fc.1:I
        //   214: ifeq            223
        //   217: ldc_w           1540961549
        //   220: goto            226
        //   223: ldc_w           -1699799183
        //   226: ldc_w           -1349892820
        //   229: ixor           
        //   230: lookupswitch {
        //          -195858399: 283
        //          1791133154: 223
        //          default: 256
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokestatic    org/lwjgl/input/Mouse.getEventButton:()I
        //   263: goto            267
        //   266: athrow         
        //   267: goto            271
        //   270: athrow         
        //   271: invokevirtual   dev/nuker/pyro/fQ.0:(I)V
        //   274: goto            278
        //   277: athrow         
        //   278: return         
        //   279: aconst_null    
        //   280: athrow         
        //   281: aconst_null    
        //   282: athrow         
        //   283: aconst_null    
        //   284: athrow         
        //   285: aconst_null    
        //   286: athrow         
        //   287: pop            
        //   288: goto            24
        //   291: pop            
        //   292: aconst_null    
        //   293: goto            287
        //   296: dup            
        //   297: ifnull          287
        //   300: checkcast       Ljava/lang/Throwable;
        //   303: athrow         
        //   304: dup            
        //   305: ifnull          291
        //   308: checkcast       Ljava/lang/Throwable;
        //   311: athrow         
        //   312: aconst_null    
        //   313: athrow         
        //    StackMapTable: 00 29 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FD 00 03 07 00 03 07 01 04 0C 41 01 1C 4C 07 01 04 FF 00 02 00 02 07 00 03 07 01 04 00 02 07 01 04 01 5F 07 01 04 42 07 00 22 40 07 01 04 45 07 00 35 40 01 02 05 42 01 18 0B 42 01 1C 4E 07 00 88 FF 00 02 00 02 07 00 03 07 01 04 00 02 07 00 88 01 5D 07 00 88 42 07 00 35 40 07 00 88 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 04 00 02 07 00 88 01 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 04 00 02 07 00 88 01 45 07 00 35 00 40 07 01 04 01 41 07 00 88 01 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     296    304    Any
        //  296    304    296    304    Any
        //  312    314    3      8      Ljava/lang/NullPointerException;
        //  119    126    126    127    Any
        //  120    126    126    127    Any
        //  120    126    3      8      Any
        //  119    126    119    120    Ljava/lang/RuntimeException;
        //  119    126    126    127    Ljava/lang/IllegalArgumentException;
        //  259    266    266    267    Any
        //  260    266    266    267    Any
        //  259    266    3      8      Any
        //  260    266    3      8      Ljava/lang/RuntimeException;
        //  259    266    259    260    Any
        //  270    277    277    278    Any
        //  270    277    270    271    Ljava/lang/IllegalStateException;
        //  271    277    3      8      Any
        //  270    277    270    271    Any
        //  271    277    3      8      Any
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
    
    public void c() {
        fbS.dD(this, 787981218);
    }
    
    @f06
    public void c(@NotNull final f2V f2V) {
        fbS.2n(this, 956109199, f2V);
    }
    
    public f6() {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.1 != 0) {
                    n = -1697931686;
                    break Label_0015;
                }
                n = 1652739095;
            }
            switch (n ^ 0xA4965E73) {
                case 792431931: {
                    continue;
                }
                default: {
                    this.c = true;
                }
                case 1046331433: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @f06
    public void c(@NotNull final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2181
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2173
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2165
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           841813223
        //    33: goto            39
        //    36: ldc_w           -1575367744
        //    39: ldc_w           593299271
        //    42: ixor           
        //    43: lookupswitch {
        //          290418441: 36
        //          292555680: 2144
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    78: goto            82
        //    81: athrow         
        //    82: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    85: if_acmpne       2044
        //    88: aload_1        
        //    89: goto            93
        //    92: athrow         
        //    93: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //    96: goto            100
        //    99: athrow         
        //   100: instanceof      Lnet/minecraft/network/play/server/SPacketPlayerListItem;
        //   103: ifeq            1347
        //   106: aload_1        
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   114: goto            118
        //   117: athrow         
        //   118: dup            
        //   119: ifnonnull       152
        //   122: new             Lkotlin/TypeCastException;
        //   125: dup            
        //   126: ldc_w           "\u1092\u1486\ub981\ub1c4\ufea2\ude99\ub225\ud5ae\udb77\ude9e\u944e\u1e0c\ud286\uc7b3\ub656\uba02\u57a5\u4476\ubf38\uf76d\u187a\uc234\u592d\u2f49\ue0fc\u06f7\u7d66\ubac0\u8215\ubbba\ub7d0\ufb72\u43a6\u981e\u2cb4\uc21e\u493c\ubb0f\uc892\uc812\u85ea\u41fe\u8a9d\ub157\u7b51\ub98a\u7c7b\ufd44\u7f59\uddf7\ud5ea\u16d6\udd33\u358b\u719c\ud28f\u0a05\ub5ba\u1b8a\u3873\u446d\u728c\uf493\ub9e5\uadef\u596c\ue2f4\ue342\ua739\u12fe\uba84\u4f92\ub821\u1618\u94f6\u43bd\u55a3\u2f17\u63ee\u26b7\ubb04\u052f\ucba4\u2473\u2e18\u8a99\u7ceb\u78e7\u1865\u13ba\ufd44\ub2f3"
        //   129: goto            133
        //   132: athrow         
        //   133: invokestatic    invokestatic   !!! ERROR
        //   136: goto            140
        //   139: athrow         
        //   140: goto            144
        //   143: athrow         
        //   144: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   147: goto            151
        //   150: athrow         
        //   151: athrow         
        //   152: checkcast       Lnet/minecraft/network/play/server/SPacketPlayerListItem;
        //   155: astore_2       
        //   156: nop            
        //   157: aload_2        
        //   158: goto            162
        //   161: athrow         
        //   162: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem.func_179767_a:()Ljava/util/List;
        //   165: goto            169
        //   168: athrow         
        //   169: dup            
        //   170: pop            
        //   171: checkcast       Ljava/lang/Iterable;
        //   174: astore_3       
        //   175: iconst_0       
        //   176: getstatic       dev/nuker/pyro/fc.c:I
        //   179: ifge            188
        //   182: ldc_w           -363547823
        //   185: goto            191
        //   188: ldc_w           1546886969
        //   191: ldc_w           899765221
        //   194: ixor           
        //   195: lookupswitch {
        //          -537534284: 188
        //          1771228380: 220
        //          default: 2136
        //        }
        //   220: istore          4
        //   222: aload_3        
        //   223: getstatic       dev/nuker/pyro/fc.0:I
        //   226: ifeq            235
        //   229: ldc_w           781206544
        //   232: goto            238
        //   235: ldc_w           1937251143
        //   238: ldc_w           -1404034370
        //   241: ixor           
        //   242: lookupswitch {
        //          -2101320018: 235
        //          -551011847: 268
        //          default: 2138
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   277: goto            281
        //   280: athrow         
        //   281: astore          5
        //   283: aload           5
        //   285: goto            289
        //   288: athrow         
        //   289: invokeinterface java/util/Iterator.hasNext:()Z
        //   294: goto            298
        //   297: athrow         
        //   298: ifeq            1285
        //   301: aload           5
        //   303: goto            307
        //   306: athrow         
        //   307: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   312: goto            316
        //   315: athrow         
        //   316: astore          6
        //   318: getstatic       dev/nuker/pyro/fc.c:I
        //   321: ifge            330
        //   324: ldc_w           -2079782195
        //   327: goto            333
        //   330: ldc_w           1658950079
        //   333: ldc_w           -1731471630
        //   336: ixor           
        //   337: lookupswitch {
        //          482532415: 2118
        //          905949098: 330
        //          default: 364
        //        }
        //   364: aload           6
        //   366: checkcast       Lnet/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData;
        //   369: astore          7
        //   371: iconst_0       
        //   372: istore          8
        //   374: aload           7
        //   376: ifnull          385
        //   379: ldc_w           -1739129567
        //   382: goto            388
        //   385: ldc_w           -1739129566
        //   388: ldc_w           329447408
        //   391: ixor           
        //   392: tableswitch {
        //          401085858: 416
        //          401085859: 1281
        //          default: 379
        //        }
        //   416: aload           7
        //   418: goto            422
        //   421: athrow         
        //   422: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   425: goto            429
        //   428: athrow         
        //   429: ifnull          1281
        //   432: aload           7
        //   434: getstatic       dev/nuker/pyro/fc.c:I
        //   437: ifge            446
        //   440: ldc_w           680957962
        //   443: goto            449
        //   446: ldc_w           1384961900
        //   449: ldc_w           -2003319329
        //   452: ixor           
        //   453: lookupswitch {
        //          -1610523179: 2112
        //          -706280906: 446
        //          default: 480
        //        }
        //   480: goto            484
        //   483: athrow         
        //   484: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   487: goto            491
        //   490: athrow         
        //   491: dup            
        //   492: pop            
        //   493: goto            497
        //   496: athrow         
        //   497: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   500: goto            504
        //   503: athrow         
        //   504: ifnull          1281
        //   507: aload_2        
        //   508: goto            512
        //   511: athrow         
        //   512: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem.func_179768_b:()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //   515: goto            519
        //   518: athrow         
        //   519: getstatic       net/minecraft/network/play/server/SPacketPlayerListItem$Action.REMOVE_PLAYER:Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //   522: if_acmpne       1028
        //   525: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //   528: dup            
        //   529: pop            
        //   530: goto            534
        //   533: athrow         
        //   534: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   537: goto            541
        //   540: athrow         
        //   541: dup            
        //   542: ifnonnull       556
        //   545: goto            549
        //   548: athrow         
        //   549: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   552: goto            556
        //   555: athrow         
        //   556: dup            
        //   557: pop            
        //   558: getstatic       dev/nuker/pyro/fc.c:I
        //   561: ifge            570
        //   564: ldc_w           56529304
        //   567: goto            573
        //   570: ldc_w           -375038230
        //   573: ldc_w           -1613576928
        //   576: ixor           
        //   577: lookupswitch {
        //          -1668524872: 2120
        //          1137887565: 570
        //          default: 604
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_175106_d:()Ljava/util/Collection;
        //   611: goto            615
        //   614: athrow         
        //   615: goto            619
        //   618: athrow         
        //   619: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   624: goto            628
        //   627: athrow         
        //   628: astore          9
        //   630: getstatic       dev/nuker/pyro/fc.1:I
        //   633: ifeq            642
        //   636: ldc_w           89997722
        //   639: goto            645
        //   642: ldc_w           -874157130
        //   645: ldc_w           425224412
        //   648: ixor           
        //   649: lookupswitch {
        //          -759364758: 676
        //          470100294: 642
        //          default: 2130
        //        }
        //   676: aload           9
        //   678: goto            682
        //   681: athrow         
        //   682: invokeinterface java/util/Iterator.hasNext:()Z
        //   687: goto            691
        //   690: athrow         
        //   691: ifeq            1281
        //   694: aload           9
        //   696: goto            700
        //   699: athrow         
        //   700: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   705: goto            709
        //   708: athrow         
        //   709: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   712: astore          10
        //   714: aload           10
        //   716: dup            
        //   717: pop            
        //   718: goto            722
        //   721: athrow         
        //   722: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //   725: goto            729
        //   728: athrow         
        //   729: dup            
        //   730: pop            
        //   731: goto            735
        //   734: athrow         
        //   735: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //   738: goto            742
        //   741: athrow         
        //   742: aload           7
        //   744: goto            748
        //   747: athrow         
        //   748: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   751: goto            755
        //   754: athrow         
        //   755: dup            
        //   756: pop            
        //   757: getstatic       dev/nuker/pyro/fc.0:I
        //   760: ifeq            769
        //   763: ldc_w           -1035355465
        //   766: goto            772
        //   769: ldc_w           1303388302
        //   772: ldc_w           1214669521
        //   775: ixor           
        //   776: lookupswitch {
        //          -1976575898: 2122
        //          82472609: 769
        //          default: 804
        //        }
        //   804: goto            808
        //   807: athrow         
        //   808: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //   811: goto            815
        //   814: athrow         
        //   815: getstatic       dev/nuker/pyro/fc.c:I
        //   818: ifge            827
        //   821: ldc_w           768257195
        //   824: goto            830
        //   827: ldc_w           -551371025
        //   830: ldc_w           -650921842
        //   833: ixor           
        //   834: lookupswitch {
        //          -185002971: 2154
        //          1063182837: 827
        //          default: 860
        //        }
        //   860: goto            864
        //   863: athrow         
        //   864: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   867: goto            871
        //   870: athrow         
        //   871: ifeq            880
        //   874: ldc_w           -431516597
        //   877: goto            883
        //   880: ldc_w           -431516598
        //   883: ldc_w           2084958753
        //   886: ixor           
        //   887: tableswitch {
        //          872729812: 908
        //          872729813: 1025
        //          default: 874
        //        }
        //   908: goto            912
        //   911: athrow         
        //   912: invokestatic    dev/nuker/pyro/Pyro.getEventManager:()Ldev/nuker/pyro/f05;
        //   915: goto            919
        //   918: athrow         
        //   919: new             Ldev/nuker/pyro/f33;
        //   922: dup            
        //   923: aload           7
        //   925: getstatic       dev/nuker/pyro/fc.1:I
        //   928: ifeq            937
        //   931: ldc_w           -183694743
        //   934: goto            940
        //   937: ldc_w           -981573427
        //   940: ldc_w           -1344623397
        //   943: ixor           
        //   944: lookupswitch {
        //          -522380100: 937
        //          1524082354: 2150
        //          default: 972
        //        }
        //   972: goto            976
        //   975: athrow         
        //   976: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   979: goto            983
        //   982: athrow         
        //   983: dup            
        //   984: pop            
        //   985: goto            989
        //   988: athrow         
        //   989: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   992: goto            996
        //   995: athrow         
        //   996: dup            
        //   997: pop            
        //   998: goto            1002
        //  1001: athrow         
        //  1002: invokespecial   dev/nuker/pyro/f33.<init>:(Ljava/lang/String;)V
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: goto            1013
        //  1012: athrow         
        //  1013: invokeinterface dev/nuker/pyro/f05.c:(Ljava/lang/Object;)V
        //  1018: goto            1022
        //  1021: athrow         
        //  1022: goto            1281
        //  1025: goto            630
        //  1028: getstatic       dev/nuker/pyro/fc.1:I
        //  1031: ifeq            1040
        //  1034: ldc_w           1168164968
        //  1037: goto            1043
        //  1040: ldc_w           -394100503
        //  1043: ldc_w           1659155221
        //  1046: ixor           
        //  1047: lookupswitch {
        //          -1973013508: 1072
        //          658799485: 1040
        //          default: 2134
        //        }
        //  1072: aload_2        
        //  1073: goto            1077
        //  1076: athrow         
        //  1077: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem.func_179768_b:()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: getstatic       net/minecraft/network/play/server/SPacketPlayerListItem$Action.ADD_PLAYER:Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //  1087: if_acmpne       1096
        //  1090: ldc_w           -227600441
        //  1093: goto            1099
        //  1096: ldc_w           -227600448
        //  1099: ldc_w           1801601388
        //  1102: ixor           
        //  1103: tableswitch {
        //          840609110: 1124
        //          840609111: 1281
        //          default: 1090
        //        }
        //  1124: getstatic       dev/nuker/pyro/fc.1:I
        //  1127: ifeq            1136
        //  1130: ldc_w           2006907761
        //  1133: goto            1139
        //  1136: ldc_w           -207560592
        //  1139: ldc_w           544802406
        //  1142: ixor           
        //  1143: lookupswitch {
        //          -740694506: 1168
        //          1474821399: 1136
        //          default: 2140
        //        }
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokestatic    dev/nuker/pyro/Pyro.getEventManager:()Ldev/nuker/pyro/f05;
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: new             Ldev/nuker/pyro/f32;
        //  1182: dup            
        //  1183: aload           7
        //  1185: goto            1189
        //  1188: athrow         
        //  1189: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //  1192: goto            1196
        //  1195: athrow         
        //  1196: dup            
        //  1197: pop            
        //  1198: getstatic       dev/nuker/pyro/fc.c:I
        //  1201: ifge            1210
        //  1204: ldc_w           1224337081
        //  1207: goto            1213
        //  1210: ldc_w           -1518141534
        //  1213: ldc_w           804663464
        //  1216: ixor           
        //  1217: lookupswitch {
        //          -1972056310: 1244
        //          1729091089: 1210
        //          default: 2148
        //        }
        //  1244: goto            1248
        //  1247: athrow         
        //  1248: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //  1251: goto            1255
        //  1254: athrow         
        //  1255: dup            
        //  1256: pop            
        //  1257: goto            1261
        //  1260: athrow         
        //  1261: invokespecial   dev/nuker/pyro/f32.<init>:(Ljava/lang/String;)V
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: goto            1272
        //  1271: athrow         
        //  1272: invokeinterface dev/nuker/pyro/f05.c:(Ljava/lang/Object;)V
        //  1277: goto            1281
        //  1280: athrow         
        //  1281: nop            
        //  1282: goto            283
        //  1285: goto            1347
        //  1288: astore_3       
        //  1289: aload_3        
        //  1290: getstatic       dev/nuker/pyro/fc.1:I
        //  1293: ifeq            1302
        //  1296: ldc_w           -1236040896
        //  1299: goto            1305
        //  1302: ldc_w           -1703741386
        //  1305: ldc_w           -473357666
        //  1308: ixor           
        //  1309: lookupswitch {
        //          1436197342: 2132
        //          1569292024: 1302
        //          default: 1336
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //  1350: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1353: ifnull          1362
        //  1356: ldc_w           1435825367
        //  1359: goto            1365
        //  1362: ldc_w           1435825366
        //  1365: ldc_w           385178785
        //  1368: ixor           
        //  1369: tableswitch {
        //          -2034020116: 1392
        //          -2034020115: 2111
        //          default: 1356
        //        }
        //  1392: aload_0        
        //  1393: getfield        dev/nuker/pyro/f6.c:Z
        //  1396: ifeq            2111
        //  1399: getstatic       dev/nuker/pyro/fc.0:I
        //  1402: ifeq            1411
        //  1405: ldc_w           1956045815
        //  1408: goto            1414
        //  1411: ldc_w           -1986127501
        //  1414: ldc_w           669736451
        //  1417: ixor           
        //  1418: lookupswitch {
        //          -1096865798: 1411
        //          1400749556: 2142
        //          default: 1444
        //        }
        //  1444: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7e;
        //  1447: goto            1451
        //  1450: athrow         
        //  1451: invokevirtual   dev/nuker/pyro/f7e.3:()V
        //  1454: goto            1458
        //  1457: athrow         
        //  1458: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9z;
        //  1461: getfield        dev/nuker/pyro/f9z.c:Ldev/nuker/pyro/fw;
        //  1464: iconst_0       
        //  1465: goto            1469
        //  1468: athrow         
        //  1469: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1472: goto            1476
        //  1475: athrow         
        //  1476: goto            1480
        //  1479: athrow         
        //  1480: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1483: goto            1487
        //  1486: athrow         
        //  1487: getstatic       dev/nuker/pyro/fbq.c:Ldev/nuker/pyro/fbq;
        //  1490: goto            1494
        //  1493: athrow         
        //  1494: invokevirtual   dev/nuker/pyro/fbq.c:()V
        //  1497: goto            1501
        //  1500: athrow         
        //  1501: getstatic       dev/nuker/pyro/fc.0:I
        //  1504: ifeq            1513
        //  1507: ldc_w           1411256689
        //  1510: goto            1516
        //  1513: ldc_w           1353449702
        //  1516: ldc_w           -415545867
        //  1519: ixor           
        //  1520: lookupswitch {
        //          -1289399164: 1513
        //          -1214823149: 1548
        //          default: 2114
        //        }
        //  1548: getstatic       dev/nuker/pyro/f1w.c:Ldev/nuker/pyro/f1w;
        //  1551: goto            1555
        //  1554: athrow         
        //  1555: invokevirtual   dev/nuker/pyro/f1w.1:()V
        //  1558: goto            1562
        //  1561: athrow         
        //  1562: getstatic       dev/nuker/pyro/fc.1:I
        //  1565: ifeq            1574
        //  1568: ldc_w           789042514
        //  1571: goto            1577
        //  1574: ldc_w           -75902022
        //  1577: ldc_w           -208382169
        //  1580: ixor           
        //  1581: lookupswitch {
        //          -603068434: 1574
        //          -594312587: 2128
        //          default: 1608
        //        }
        //  1608: getstatic       dev/nuker/pyro/WaypointManager.INSTANCE:Ldev/nuker/pyro/WaypointManager;
        //  1611: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //  1614: dup            
        //  1615: pop            
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: invokevirtual   net/minecraft/client/Minecraft.func_147104_D:()Lnet/minecraft/client/multiplayer/ServerData;
        //  1623: goto            1627
        //  1626: athrow         
        //  1627: ifnonnull       1881
        //  1630: new             Ljava/lang/StringBuilder;
        //  1633: dup            
        //  1634: goto            1638
        //  1637: athrow         
        //  1638: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1641: goto            1645
        //  1644: athrow         
        //  1645: ldc_w           "\u108f\u149a\ub983\ub1cf\ufeee\ude9f\ub234\ud5ac\udb78\ude88\u945f\u1e5e\ud2cb"
        //  1648: goto            1652
        //  1651: athrow         
        //  1652: invokestatic    invokestatic   !!! ERROR
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: goto            1663
        //  1662: athrow         
        //  1663: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1666: goto            1670
        //  1669: athrow         
        //  1670: goto            1674
        //  1673: athrow         
        //  1674: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  1677: goto            1681
        //  1680: athrow         
        //  1681: dup            
        //  1682: pop            
        //  1683: getstatic       dev/nuker/pyro/fc.0:I
        //  1686: ifeq            1695
        //  1689: ldc_w           -763282892
        //  1692: goto            1698
        //  1695: ldc_w           -640759129
        //  1698: ldc_w           -1484879477
        //  1701: ixor           
        //  1702: lookupswitch {
        //          1979691967: 1695
        //          2125480748: 1728
        //          default: 2152
        //        }
        //  1728: goto            1732
        //  1731: athrow         
        //  1732: invokevirtual   net/minecraft/client/Minecraft.func_71401_C:()Lnet/minecraft/server/integrated/IntegratedServer;
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: dup            
        //  1740: ifnonnull       1754
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1750: goto            1754
        //  1753: athrow         
        //  1754: dup            
        //  1755: pop            
        //  1756: getstatic       dev/nuker/pyro/fc.1:I
        //  1759: ifeq            1768
        //  1762: ldc_w           942235579
        //  1765: goto            1771
        //  1768: ldc_w           -2040575983
        //  1771: ldc_w           -1173049739
        //  1774: ixor           
        //  1775: lookupswitch {
        //          -2109869618: 2146
        //          -278822073: 1768
        //          default: 1800
        //        }
        //  1800: goto            1804
        //  1803: athrow         
        //  1804: invokevirtual   net/minecraft/server/integrated/IntegratedServer.func_71270_I:()Ljava/lang/String;
        //  1807: goto            1811
        //  1810: athrow         
        //  1811: getstatic       dev/nuker/pyro/fc.0:I
        //  1814: ifeq            1823
        //  1817: ldc_w           -1399796460
        //  1820: goto            1826
        //  1823: ldc_w           470677289
        //  1826: ldc_w           38987497
        //  1829: ixor           
        //  1830: lookupswitch {
        //          -1363006467: 1823
        //          509546944: 1856
        //          default: 2116
        //        }
        //  1856: goto            1860
        //  1859: athrow         
        //  1860: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1863: goto            1867
        //  1866: athrow         
        //  1867: goto            1871
        //  1870: athrow         
        //  1871: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1874: goto            1878
        //  1877: athrow         
        //  1878: goto            2025
        //  1881: goto            1885
        //  1884: athrow         
        //  1885: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  1888: goto            1892
        //  1891: athrow         
        //  1892: dup            
        //  1893: pop            
        //  1894: goto            1898
        //  1897: athrow         
        //  1898: invokevirtual   net/minecraft/client/Minecraft.func_147104_D:()Lnet/minecraft/client/multiplayer/ServerData;
        //  1901: goto            1905
        //  1904: athrow         
        //  1905: dup            
        //  1906: ifnonnull       1915
        //  1909: ldc_w           -1433307457
        //  1912: goto            1918
        //  1915: ldc_w           -1433307464
        //  1918: ldc_w           -1213306652
        //  1921: ixor           
        //  1922: tableswitch {
        //          981351606: 1944
        //          981351607: 1955
        //          default: 1909
        //        }
        //  1944: goto            1948
        //  1947: athrow         
        //  1948: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1951: goto            1955
        //  1954: athrow         
        //  1955: getstatic       dev/nuker/pyro/fc.0:I
        //  1958: ifeq            1967
        //  1961: ldc_w           2090362605
        //  1964: goto            1970
        //  1967: ldc_w           -962514598
        //  1970: ldc_w           -159402370
        //  1973: ixor           
        //  1974: lookupswitch {
        //          -1964519277: 1967
        //          819889956: 2000
        //          default: 2124
        //        }
        //  2000: getfield        net/minecraft/client/multiplayer/ServerData.field_78845_b:Ljava/lang/String;
        //  2003: dup            
        //  2004: pop            
        //  2005: ldc_w           ":"
        //  2008: ldc_w           ""
        //  2011: iconst_0       
        //  2012: iconst_4       
        //  2013: aconst_null    
        //  2014: goto            2018
        //  2017: athrow         
        //  2018: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //  2021: goto            2025
        //  2024: athrow         
        //  2025: goto            2029
        //  2028: athrow         
        //  2029: invokevirtual   dev/nuker/pyro/WaypointManager.load:(Ljava/lang/String;)V
        //  2032: goto            2036
        //  2035: athrow         
        //  2036: aload_0        
        //  2037: iconst_0       
        //  2038: putfield        dev/nuker/pyro/f6.c:Z
        //  2041: goto            2111
        //  2044: aload_1        
        //  2045: goto            2049
        //  2048: athrow         
        //  2049: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //  2052: goto            2056
        //  2055: athrow         
        //  2056: instanceof      Lnet/minecraft/network/play/server/SPacketDisconnect;
        //  2059: ifeq            2111
        //  2062: aload_0        
        //  2063: iconst_1       
        //  2064: getstatic       dev/nuker/pyro/fc.c:I
        //  2067: ifge            2076
        //  2070: ldc_w           763377497
        //  2073: goto            2079
        //  2076: ldc_w           119715119
        //  2079: ldc_w           1945530693
        //  2082: ixor           
        //  2083: lookupswitch {
        //          -395766534: 2076
        //          1584809500: 2126
        //          default: 2108
        //        }
        //  2108: putfield        dev/nuker/pyro/f6.c:Z
        //  2111: return         
        //  2112: aconst_null    
        //  2113: athrow         
        //  2114: aconst_null    
        //  2115: athrow         
        //  2116: aconst_null    
        //  2117: athrow         
        //  2118: aconst_null    
        //  2119: athrow         
        //  2120: aconst_null    
        //  2121: athrow         
        //  2122: aconst_null    
        //  2123: athrow         
        //  2124: aconst_null    
        //  2125: athrow         
        //  2126: aconst_null    
        //  2127: athrow         
        //  2128: aconst_null    
        //  2129: athrow         
        //  2130: aconst_null    
        //  2131: athrow         
        //  2132: aconst_null    
        //  2133: athrow         
        //  2134: aconst_null    
        //  2135: athrow         
        //  2136: aconst_null    
        //  2137: athrow         
        //  2138: aconst_null    
        //  2139: athrow         
        //  2140: aconst_null    
        //  2141: athrow         
        //  2142: aconst_null    
        //  2143: athrow         
        //  2144: aconst_null    
        //  2145: athrow         
        //  2146: aconst_null    
        //  2147: athrow         
        //  2148: aconst_null    
        //  2149: athrow         
        //  2150: aconst_null    
        //  2151: athrow         
        //  2152: aconst_null    
        //  2153: athrow         
        //  2154: aconst_null    
        //  2155: athrow         
        //  2156: pop            
        //  2157: goto            24
        //  2160: pop            
        //  2161: aconst_null    
        //  2162: goto            2156
        //  2165: dup            
        //  2166: ifnull          2156
        //  2169: checkcast       Ljava/lang/Throwable;
        //  2172: athrow         
        //  2173: dup            
        //  2174: ifnull          2160
        //  2177: checkcast       Ljava/lang/Throwable;
        //  2180: athrow         
        //  2181: aconst_null    
        //  2182: athrow         
        //    StackMapTable: 01 63 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FD 00 03 07 00 03 07 01 30 0B 42 01 1C 45 07 00 26 40 07 01 30 45 07 00 35 40 07 01 35 49 07 00 22 40 07 01 30 45 07 00 35 40 07 02 46 49 07 00 20 40 07 01 30 45 07 00 35 40 07 02 46 4D 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 04 07 02 46 08 00 7A 08 00 7A 07 02 48 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 04 07 02 46 08 00 7A 08 00 7A 07 02 48 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 04 07 02 46 08 00 7A 08 00 7A 07 02 48 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 02 46 07 01 3F 40 07 02 46 FF 00 08 00 03 07 00 03 07 01 30 07 01 3D 00 01 07 00 26 40 07 01 3D 45 07 00 35 40 07 02 4A FF 00 12 00 04 07 00 03 07 01 30 07 01 3D 07 01 4F 00 01 01 FF 00 02 00 04 07 00 03 07 01 30 07 01 3D 07 01 4F 00 02 01 01 5C 01 FF 00 0E 00 05 07 00 03 07 01 30 07 01 3D 07 01 4F 01 00 01 07 01 4F FF 00 02 00 05 07 00 03 07 01 30 07 01 3D 07 01 4F 01 00 02 07 01 4F 01 5D 07 01 4F 42 07 00 20 40 07 01 4F 47 07 00 35 40 07 01 5B FC 00 01 07 01 5B FF 00 04 00 00 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 00 01 07 01 5B 47 07 00 35 40 01 47 07 00 35 40 07 01 5B 47 07 00 35 40 07 00 F0 FC 00 0D 07 00 F0 42 01 1E FD 00 0E 07 01 66 01 05 42 01 1B 44 07 00 35 40 07 01 66 45 07 00 35 40 07 01 72 50 07 01 66 FF 00 02 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 02 07 01 66 01 5E 07 01 66 42 07 00 35 40 07 01 66 45 07 00 35 40 07 01 72 44 07 00 35 40 07 01 72 45 07 00 35 40 07 02 48 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 01 07 01 3D 45 07 00 35 40 07 01 7C 4D 07 00 35 40 07 00 4B 45 07 00 35 40 07 01 8E 46 07 00 35 40 07 01 8E 45 07 00 35 40 07 01 8E 4D 07 01 8E FF 00 02 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 02 07 01 8E 01 5E 07 01 8E 42 07 00 35 40 07 01 8E 45 07 00 35 40 07 01 94 42 07 00 35 40 07 01 94 47 07 00 35 40 07 01 5B FC 00 01 07 01 5B 0B 42 01 1E FF 00 04 00 00 00 01 07 00 35 FF 00 00 00 0A 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 00 01 07 01 5B 47 07 00 35 40 01 FF 00 07 00 00 00 01 07 00 35 FF 00 00 00 0A 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 00 01 07 01 5B 47 07 00 35 40 07 00 F0 FF 00 0B 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 01 07 00 35 40 07 01 9A 45 07 00 35 40 07 01 72 44 07 00 35 40 07 01 72 45 07 00 35 40 07 02 4C 44 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 66 45 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 72 FF 00 0D 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 72 FF 00 02 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 03 07 02 4C 07 01 72 01 FF 00 1F 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 72 42 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 72 45 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 02 4C FF 00 0B 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 02 4C FF 00 02 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 03 07 02 4C 07 02 4C 01 FF 00 1D 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 02 4C 42 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 02 4C 45 07 00 35 40 01 02 05 42 01 18 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 00 45 07 00 35 40 07 01 BA FF 00 11 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 66 FF 00 02 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 05 07 01 BA 08 03 97 08 03 97 07 01 66 01 FF 00 1F 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 66 42 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 66 45 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 72 44 07 00 2C FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 72 45 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 02 48 44 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 02 48 45 07 00 35 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 01 BA 07 01 B4 42 07 00 22 FF 00 00 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 01 BA 07 01 B4 47 07 00 35 00 02 F9 00 02 0B 42 01 1C FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 01 07 01 3D 45 07 00 35 40 07 01 7C 05 05 42 01 18 0B 42 01 1C 42 07 00 22 00 45 07 00 35 40 07 01 BA 48 07 00 14 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 66 45 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 72 FF 00 0D 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 72 FF 00 02 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 05 07 01 BA 08 04 9B 08 04 9B 07 01 72 01 FF 00 1E 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 72 42 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 72 45 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 02 48 44 07 00 20 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 02 48 45 07 00 35 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 02 07 01 BA 07 01 CB 42 07 00 2A FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 02 07 01 BA 07 01 CB 47 07 00 35 00 F8 00 03 FF 00 02 00 03 07 00 03 07 01 30 07 01 3D 00 01 07 01 2B FF 00 0D 00 04 07 00 03 07 01 30 07 01 3D 07 01 2B 00 01 07 01 2B FF 00 02 00 04 07 00 03 07 01 30 07 01 3D 07 01 2B 00 02 07 01 2B 01 5E 07 01 2B 42 07 00 20 40 07 01 2B 45 07 00 35 F9 00 00 08 05 42 01 1A 12 42 01 1D 45 07 00 35 40 07 00 AD 45 07 00 35 00 49 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 00 E9 01 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 00 E9 07 00 BF 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 00 E9 07 00 BF 45 07 00 35 00 45 07 00 10 40 07 01 E8 45 07 00 35 00 0B 42 01 1F 45 07 00 35 40 07 01 F2 45 07 00 35 00 0B 42 01 1E 4A 07 00 22 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 00 4B 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E 49 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 08 06 5E 08 06 5E 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 06 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 06 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 06 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 00 4B FF 00 0D 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 00 4B FF 00 02 00 02 07 00 03 07 01 30 00 04 07 01 FC 07 02 06 07 00 4B 01 FF 00 1D 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 00 4B 42 07 00 24 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 00 4B 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D 46 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D FF 00 0D 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D FF 00 02 00 02 07 00 03 07 01 30 00 04 07 01 FC 07 02 06 07 02 1D 01 FF 00 1C 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D 42 07 00 2E FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 FF 00 0B 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 FF 00 02 00 02 07 00 03 07 01 30 00 04 07 01 FC 07 02 06 07 02 48 01 FF 00 1D 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 06 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 06 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 48 42 07 01 FC FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 01 07 01 FC 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 00 4B 44 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 00 4B 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 03 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 05 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 02 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 2E 01 FF 00 19 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E 42 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 0B 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 02 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 2E 01 FF 00 1D 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E 50 07 00 22 FF 00 00 00 02 07 00 03 07 01 30 00 07 07 01 FC 07 02 48 07 02 48 07 02 48 01 01 05 45 07 00 35 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 48 42 07 00 24 FF 00 00 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 48 45 07 00 35 00 07 43 07 00 35 40 07 01 30 45 07 00 35 40 07 02 46 FF 00 13 00 02 07 00 03 07 01 30 00 02 07 00 03 01 FF 00 02 00 02 07 00 03 07 01 30 00 03 07 00 03 01 01 FF 00 1C 00 02 07 00 03 07 01 30 00 02 07 00 03 01 02 FF 00 00 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 01 07 01 66 FF 00 01 00 02 07 00 03 07 01 30 00 00 FF 00 01 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 48 FF 00 01 00 07 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 00 00 FF 00 01 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 01 07 01 8E FF 00 01 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 01 72 FF 00 01 00 02 07 00 03 07 01 30 00 02 07 01 FC 07 02 2E FF 00 01 00 02 07 00 03 07 01 30 00 02 07 00 03 01 01 FF 00 01 00 0A 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 00 00 FF 00 01 00 04 07 00 03 07 01 30 07 01 3D 07 01 2B 00 01 07 01 2B FF 00 01 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 00 FF 00 01 00 04 07 00 03 07 01 30 07 01 3D 07 01 4F 00 01 01 FF 00 01 00 05 07 00 03 07 01 30 07 01 3D 07 01 4F 01 00 01 07 01 4F FF 00 01 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 00 FF 00 01 00 02 07 00 03 07 01 30 00 00 01 FF 00 01 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 02 1D FF 00 01 00 09 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 00 04 07 01 BA 08 04 9B 08 04 9B 07 01 72 FF 00 01 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 04 07 01 BA 08 03 97 08 03 97 07 01 66 FF 00 01 00 02 07 00 03 07 01 30 00 03 07 01 FC 07 02 06 07 00 4B FF 00 01 00 0B 07 00 03 07 01 30 07 01 3D 07 01 4F 01 07 01 5B 07 00 F0 07 01 66 01 07 01 5B 07 01 9A 00 02 07 02 4C 07 02 4C FF 00 01 00 02 07 00 03 07 01 30 00 01 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  156    288    1288   1347   Ljava/lang/Exception;
        //  289    511    1288   1347   Ljava/lang/Exception;
        //  512    681    1288   1347   Ljava/lang/Exception;
        //  682    699    1288   1347   Ljava/lang/Exception;
        //  700    911    1288   1347   Ljava/lang/Exception;
        //  912    1076   1288   1347   Ljava/lang/Exception;
        //  1077   1285   1288   1347   Ljava/lang/Exception;
        //  8      20     2165   2173   Ljava/lang/EnumConstantNotPresentException;
        //  2165   2173   2165   2173   Any
        //  2181   2183   3      8      Ljava/lang/IllegalStateException;
        //  74     81     81     82     Any
        //  75     81     74     75     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  74     81     81     82     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  74     81     81     82     Any
        //  74     81     3      8      Any
        //  92     99     99     100    Any
        //  92     99     92     93     Ljava/lang/NullPointerException;
        //  93     99     3      8      Ljava/lang/UnsupportedOperationException;
        //  92     99     99     100    Any
        //  92     99     92     93     Ljava/lang/StringIndexOutOfBoundsException;
        //  110    117    117    118    Any
        //  111    117    117    118    Any
        //  110    117    117    118    Ljava/lang/IllegalArgumentException;
        //  110    117    110    111    Ljava/lang/IndexOutOfBoundsException;
        //  110    117    117    118    Ljava/lang/ClassCastException;
        //  132    139    139    140    Any
        //  132    139    132    133    Ljava/lang/IndexOutOfBoundsException;
        //  132    139    132    133    Ljava/util/NoSuchElementException;
        //  133    139    132    133    Any
        //  132    139    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  143    150    150    151    Any
        //  144    150    143    144    Any
        //  143    150    143    144    Any
        //  144    150    150    151    Ljava/lang/IllegalArgumentException;
        //  143    150    150    151    Any
        //  161    168    168    169    Any
        //  162    168    168    169    Any
        //  162    168    3      8      Ljava/lang/NullPointerException;
        //  161    168    161    162    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  162    168    3      8      Ljava/lang/NegativeArraySizeException;
        //  271    280    280    281    Any
        //  272    280    280    281    Ljava/util/NoSuchElementException;
        //  272    280    3      8      Any
        //  271    280    280    281    Ljava/lang/NumberFormatException;
        //  271    280    271    272    Ljava/lang/IndexOutOfBoundsException;
        //  289    297    297    298    Any
        //  289    297    297    298    Ljava/lang/NegativeArraySizeException;
        //  289    297    297    298    Ljava/lang/IllegalStateException;
        //  289    297    297    298    Ljava/util/NoSuchElementException;
        //  289    297    297    298    Ljava/lang/EnumConstantNotPresentException;
        //  306    315    315    316    Any
        //  307    315    315    316    Ljava/lang/UnsupportedOperationException;
        //  306    315    306    307    Ljava/lang/IllegalArgumentException;
        //  307    315    306    307    Any
        //  307    315    315    316    Any
        //  421    428    428    429    Any
        //  422    428    421    422    Any
        //  421    428    3      8      Any
        //  422    428    428    429    Any
        //  422    428    421    422    Any
        //  483    490    490    491    Any
        //  483    490    483    484    Any
        //  484    490    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  483    490    483    484    Any
        //  483    490    490    491    Ljava/lang/IllegalArgumentException;
        //  496    503    503    504    Any
        //  497    503    503    504    Any
        //  496    503    503    504    Any
        //  496    503    3      8      Any
        //  497    503    496    497    Any
        //  512    518    518    519    Any
        //  512    518    3      8      Ljava/lang/NullPointerException;
        //  512    518    3      8      Ljava/lang/RuntimeException;
        //  512    518    518    519    Ljava/lang/UnsupportedOperationException;
        //  512    518    518    519    Any
        //  533    540    540    541    Any
        //  533    540    3      8      Ljava/lang/ArithmeticException;
        //  533    540    540    541    Any
        //  534    540    533    534    Any
        //  534    540    533    534    Ljava/util/ConcurrentModificationException;
        //  548    555    555    556    Any
        //  549    555    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  548    555    555    556    Any
        //  549    555    555    556    Ljava/lang/IllegalStateException;
        //  548    555    548    549    Any
        //  607    614    614    615    Any
        //  608    614    607    608    Any
        //  608    614    607    608    Any
        //  608    614    614    615    Any
        //  608    614    3      8      Any
        //  618    627    627    628    Any
        //  618    627    618    619    Any
        //  619    627    627    628    Ljava/lang/IllegalArgumentException;
        //  618    627    618    619    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  619    627    3      8      Ljava/lang/NumberFormatException;
        //  682    690    690    691    Any
        //  682    690    3      8      Any
        //  682    690    690    691    Ljava/lang/IllegalArgumentException;
        //  682    690    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  682    690    690    691    Any
        //  700    708    708    709    Any
        //  700    708    3      8      Any
        //  700    708    708    709    Any
        //  700    708    708    709    Any
        //  700    708    3      8      Ljava/lang/ClassCastException;
        //  721    728    728    729    Any
        //  722    728    728    729    Any
        //  722    728    721    722    Any
        //  721    728    721    722    Ljava/util/NoSuchElementException;
        //  722    728    3      8      Any
        //  734    741    741    742    Any
        //  734    741    734    735    Any
        //  735    741    3      8      Any
        //  734    741    734    735    Ljava/lang/IllegalStateException;
        //  735    741    734    735    Ljava/lang/NegativeArraySizeException;
        //  747    754    754    755    Any
        //  748    754    754    755    Ljava/lang/UnsupportedOperationException;
        //  748    754    747    748    Any
        //  748    754    747    748    Any
        //  748    754    3      8      Ljava/lang/NegativeArraySizeException;
        //  807    814    814    815    Any
        //  808    814    807    808    Ljava/lang/NumberFormatException;
        //  808    814    3      8      Any
        //  808    814    807    808    Any
        //  807    814    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  863    870    870    871    Any
        //  864    870    870    871    Ljava/util/ConcurrentModificationException;
        //  864    870    863    864    Any
        //  863    870    3      8      Any
        //  864    870    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  912    918    918    919    Any
        //  912    918    918    919    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  912    918    3      8      Any
        //  912    918    3      8      Any
        //  912    918    3      8      Any
        //  975    982    982    983    Any
        //  976    982    975    976    Any
        //  976    982    3      8      Any
        //  976    982    975    976    Any
        //  975    982    3      8      Ljava/lang/IllegalArgumentException;
        //  988    995    995    996    Any
        //  988    995    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  988    995    995    996    Any
        //  988    995    988    989    Ljava/lang/NumberFormatException;
        //  989    995    995    996    Any
        //  1001   1008   1008   1009   Any
        //  1002   1008   1001   1002   Ljava/lang/NullPointerException;
        //  1001   1008   1001   1002   Ljava/lang/NullPointerException;
        //  1001   1008   1001   1002   Any
        //  1001   1008   1008   1009   Any
        //  1012   1021   1021   1022   Any
        //  1013   1021   1012   1013   Ljava/lang/IllegalStateException;
        //  1013   1021   1021   1022   Any
        //  1013   1021   1012   1013   Ljava/lang/NumberFormatException;
        //  1012   1021   3      8      Any
        //  1077   1083   1083   1084   Any
        //  1077   1083   1083   1084   Ljava/lang/EnumConstantNotPresentException;
        //  1077   1083   3      8      Any
        //  1077   1083   3      8      Any
        //  1077   1083   3      8      Any
        //  1171   1178   1178   1179   Any
        //  1171   1178   1178   1179   Any
        //  1172   1178   1171   1172   Ljava/lang/UnsupportedOperationException;
        //  1172   1178   3      8      Any
        //  1172   1178   1171   1172   Ljava/lang/StringIndexOutOfBoundsException;
        //  1188   1195   1195   1196   Any
        //  1188   1195   1195   1196   Ljava/util/NoSuchElementException;
        //  1188   1195   1188   1189   Ljava/lang/IllegalArgumentException;
        //  1188   1195   1195   1196   Ljava/lang/AssertionError;
        //  1189   1195   3      8      Any
        //  1247   1254   1254   1255   Any
        //  1247   1254   1254   1255   Ljava/lang/StringIndexOutOfBoundsException;
        //  1248   1254   3      8      Ljava/lang/IllegalArgumentException;
        //  1248   1254   1247   1248   Any
        //  1248   1254   3      8      Any
        //  1260   1267   1267   1268   Any
        //  1260   1267   3      8      Ljava/lang/NumberFormatException;
        //  1260   1267   3      8      Any
        //  1260   1267   1267   1268   Ljava/lang/NullPointerException;
        //  1261   1267   1260   1261   Ljava/lang/IndexOutOfBoundsException;
        //  1271   1280   1280   1281   Any
        //  1272   1280   1280   1281   Ljava/util/ConcurrentModificationException;
        //  1271   1280   3      8      Any
        //  1271   1280   1271   1272   Ljava/util/ConcurrentModificationException;
        //  1272   1280   1280   1281   Ljava/lang/NegativeArraySizeException;
        //  1339   1346   1346   1347   Any
        //  1340   1346   1346   1347   Any
        //  1340   1346   1346   1347   Ljava/lang/EnumConstantNotPresentException;
        //  1339   1346   1339   1340   Ljava/lang/IndexOutOfBoundsException;
        //  1339   1346   1346   1347   Any
        //  1450   1457   1457   1458   Any
        //  1450   1457   1457   1458   Ljava/lang/IllegalStateException;
        //  1450   1457   1457   1458   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1451   1457   1450   1451   Any
        //  1451   1457   3      8      Any
        //  1468   1475   1475   1476   Any
        //  1468   1475   1475   1476   Any
        //  1468   1475   1468   1469   Any
        //  1468   1475   1475   1476   Ljava/lang/RuntimeException;
        //  1469   1475   1468   1469   Ljava/lang/UnsupportedOperationException;
        //  1479   1486   1486   1487   Any
        //  1479   1486   1479   1480   Any
        //  1479   1486   1479   1480   Any
        //  1480   1486   1479   1480   Any
        //  1479   1486   1486   1487   Ljava/lang/UnsupportedOperationException;
        //  1493   1500   1500   1501   Any
        //  1494   1500   3      8      Any
        //  1493   1500   1493   1494   Ljava/lang/EnumConstantNotPresentException;
        //  1493   1500   3      8      Ljava/lang/UnsupportedOperationException;
        //  1494   1500   3      8      Any
        //  1554   1561   1561   1562   Any
        //  1554   1561   1554   1555   Any
        //  1555   1561   1561   1562   Any
        //  1554   1561   1554   1555   Any
        //  1554   1561   3      8      Any
        //  1619   1626   1626   1627   Any
        //  1619   1626   1626   1627   Ljava/lang/IllegalArgumentException;
        //  1620   1626   1619   1620   Ljava/lang/ClassCastException;
        //  1620   1626   3      8      Any
        //  1619   1626   1619   1620   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1637   1644   1644   1645   Any
        //  1638   1644   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1637   1644   1644   1645   Any
        //  1637   1644   1637   1638   Any
        //  1638   1644   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1651   1658   1658   1659   Any
        //  1651   1658   1658   1659   Ljava/lang/ArithmeticException;
        //  1651   1658   1651   1652   Any
        //  1652   1658   1651   1652   Any
        //  1652   1658   3      8      Any
        //  1662   1669   1669   1670   Any
        //  1662   1669   1662   1663   Any
        //  1662   1669   1669   1670   Any
        //  1662   1669   3      8      Any
        //  1662   1669   1662   1663   Any
        //  1673   1680   1680   1681   Any
        //  1673   1680   3      8      Ljava/lang/ArithmeticException;
        //  1674   1680   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1674   1680   1673   1674   Any
        //  1674   1680   1673   1674   Ljava/lang/AssertionError;
        //  1731   1738   1738   1739   Any
        //  1731   1738   1731   1732   Ljava/lang/UnsupportedOperationException;
        //  1732   1738   3      8      Any
        //  1732   1738   3      8      Any
        //  1731   1738   3      8      Ljava/lang/NullPointerException;
        //  1746   1753   1753   1754   Any
        //  1746   1753   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1747   1753   1746   1747   Any
        //  1747   1753   1753   1754   Ljava/lang/AssertionError;
        //  1746   1753   3      8      Ljava/lang/IllegalArgumentException;
        //  1803   1810   1810   1811   Any
        //  1803   1810   3      8      Ljava/util/ConcurrentModificationException;
        //  1803   1810   1803   1804   Ljava/lang/StringIndexOutOfBoundsException;
        //  1804   1810   1810   1811   Ljava/lang/EnumConstantNotPresentException;
        //  1803   1810   3      8      Any
        //  1860   1866   1866   1867   Any
        //  1860   1866   1866   1867   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1860   1866   3      8      Ljava/lang/NumberFormatException;
        //  1860   1866   1866   1867   Ljava/lang/NumberFormatException;
        //  1860   1866   1866   1867   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1871   1877   1877   1878   Any
        //  1871   1877   1877   1878   Ljava/lang/UnsupportedOperationException;
        //  1871   1877   1877   1878   Any
        //  1871   1877   3      8      Ljava/lang/ArithmeticException;
        //  1871   1877   1877   1878   Any
        //  1885   1891   1891   1892   Any
        //  1885   1891   1891   1892   Ljava/lang/NegativeArraySizeException;
        //  1885   1891   3      8      Ljava/lang/IllegalArgumentException;
        //  1885   1891   1891   1892   Any
        //  1885   1891   3      8      Any
        //  1897   1904   1904   1905   Any
        //  1898   1904   1904   1905   Ljava/lang/EnumConstantNotPresentException;
        //  1897   1904   3      8      Any
        //  1897   1904   1897   1898   Any
        //  1898   1904   1897   1898   Ljava/lang/RuntimeException;
        //  1947   1954   1954   1955   Any
        //  1947   1954   1954   1955   Ljava/lang/RuntimeException;
        //  1948   1954   1954   1955   Any
        //  1947   1954   1954   1955   Ljava/util/ConcurrentModificationException;
        //  1948   1954   1947   1948   Any
        //  2017   2024   2024   2025   Any
        //  2018   2024   2017   2018   Ljava/lang/RuntimeException;
        //  2017   2024   2017   2018   Ljava/lang/IllegalArgumentException;
        //  2017   2024   3      8      Any
        //  2018   2024   3      8      Ljava/lang/NullPointerException;
        //  2028   2035   2035   2036   Any
        //  2028   2035   2035   2036   Any
        //  2028   2035   2035   2036   Ljava/lang/AssertionError;
        //  2029   2035   2035   2036   Any
        //  2028   2035   2028   2029   Ljava/lang/UnsupportedOperationException;
        //  2048   2055   2055   2056   Any
        //  2048   2055   2055   2056   Ljava/lang/NumberFormatException;
        //  2048   2055   2048   2049   Any
        //  2049   2055   2055   2056   Ljava/lang/IllegalArgumentException;
        //  2048   2055   2048   2049   Any
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
}
