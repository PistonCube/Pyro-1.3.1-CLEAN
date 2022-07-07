// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ArrayList;
import net.minecraft.client.gui.GuiScreen;

public class f3z extends GuiScreen
{
    public int c;
    public ArrayList<f3A> c;
    public f3A c;
    
    public void func_73864_a(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1124
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1116
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1108
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             1024904060
        //    33: goto            38
        //    36: ldc             -236904955
        //    38: ldc             1562884198
        //    40: ixor           
        //    41: lookupswitch {
        //          -2056852615: 36
        //          1613853466: 1089
        //          default: 68
        //        }
        //    68: iload_1        
        //    69: iload_2        
        //    70: iload_3        
        //    71: goto            75
        //    74: athrow         
        //    75: invokespecial   net/minecraft/client/gui/GuiScreen.func_73864_a:(III)V
        //    78: goto            82
        //    81: athrow         
        //    82: aconst_null    
        //    83: astore          4
        //    85: aload_0        
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            97
        //    92: ldc             -892313835
        //    94: goto            99
        //    97: ldc             1815775495
        //    99: ldc             227393184
        //   101: ixor           
        //   102: lookupswitch {
        //          -950148683: 1091
        //          56457542: 97
        //          default: 128
        //        }
        //   128: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   138: goto            142
        //   141: athrow         
        //   142: astore          5
        //   144: getstatic       dev/nuker/pyro/fc.c:I
        //   147: ifge            155
        //   150: ldc             1081882403
        //   152: goto            157
        //   155: ldc             -487497362
        //   157: ldc             1468239566
        //   159: ixor           
        //   160: lookupswitch {
        //          402635245: 1075
        //          1135279835: 155
        //          default: 188
        //        }
        //   188: aload           5
        //   190: goto            194
        //   193: athrow         
        //   194: invokeinterface java/util/Iterator.hasNext:()Z
        //   199: goto            203
        //   202: athrow         
        //   203: ifeq            211
        //   206: ldc             1183703185
        //   208: goto            213
        //   211: ldc             1183703184
        //   213: ldc             1567564595
        //   215: ixor           
        //   216: tableswitch {
        //          935692100: 240
        //          935692101: 696
        //          default: 206
        //        }
        //   240: aload           5
        //   242: goto            246
        //   245: athrow         
        //   246: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   251: goto            255
        //   254: athrow         
        //   255: checkcast       Ldev/nuker/pyro/f3A;
        //   258: astore          6
        //   260: getstatic       dev/nuker/pyro/fc.1:I
        //   263: ifeq            271
        //   266: ldc             1780396433
        //   268: goto            273
        //   271: ldc             460579405
        //   273: ldc             -1595912416
        //   275: ixor           
        //   276: lookupswitch {
        //          -1147949715: 304
        //          -889258319: 271
        //          default: 1071
        //        }
        //   304: iload_1        
        //   305: i2f            
        //   306: aload           6
        //   308: goto            312
        //   311: athrow         
        //   312: invokevirtual   dev/nuker/pyro/f3A.5:()F
        //   315: goto            319
        //   318: athrow         
        //   319: fcmpl          
        //   320: iflt            693
        //   323: iload_1        
        //   324: i2f            
        //   325: aload           6
        //   327: goto            331
        //   330: athrow         
        //   331: invokevirtual   dev/nuker/pyro/f3A.5:()F
        //   334: goto            338
        //   337: athrow         
        //   338: aload           6
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   dev/nuker/pyro/f3A.1:()F
        //   347: goto            351
        //   350: athrow         
        //   351: fadd           
        //   352: fcmpg          
        //   353: ifgt            361
        //   356: ldc             -1662355271
        //   358: goto            363
        //   361: ldc             -1662355272
        //   363: ldc             202663251
        //   365: ixor           
        //   366: tableswitch {
        //          570178516: 388
        //          570178517: 693
        //          default: 356
        //        }
        //   388: iload_2        
        //   389: i2f            
        //   390: getstatic       dev/nuker/pyro/fc.0:I
        //   393: ifeq            401
        //   396: ldc             -969624744
        //   398: goto            403
        //   401: ldc             1242474290
        //   403: ldc             -1677919281
        //   405: ixor           
        //   406: lookupswitch {
        //          -772645635: 432
        //          1573406871: 401
        //          default: 1069
        //        }
        //   432: aload           6
        //   434: getstatic       dev/nuker/pyro/fc.0:I
        //   437: ifeq            445
        //   440: ldc             -155874988
        //   442: goto            447
        //   445: ldc             303479198
        //   447: ldc             -1113773770
        //   449: ixor           
        //   450: lookupswitch {
        //          -1928106612: 445
        //          1260953698: 1097
        //          default: 476
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokevirtual   dev/nuker/pyro/f3A.2:()F
        //   483: goto            487
        //   486: athrow         
        //   487: fcmpl          
        //   488: iflt            496
        //   491: ldc             1900155340
        //   493: goto            498
        //   496: ldc             1900155341
        //   498: ldc             807023408
        //   500: ixor           
        //   501: tableswitch {
        //          -2102376968: 524
        //          -2102376967: 693
        //          default: 491
        //        }
        //   524: getstatic       dev/nuker/pyro/fc.c:I
        //   527: ifge            535
        //   530: ldc             -420212783
        //   532: goto            537
        //   535: ldc             -1307206442
        //   537: ldc             1366964402
        //   539: ixor           
        //   540: lookupswitch {
        //          -1215416477: 1077
        //          860361183: 535
        //          default: 568
        //        }
        //   568: iload_2        
        //   569: i2f            
        //   570: aload           6
        //   572: goto            576
        //   575: athrow         
        //   576: invokevirtual   dev/nuker/pyro/f3A.2:()F
        //   579: goto            583
        //   582: athrow         
        //   583: getstatic       dev/nuker/pyro/fc.1:I
        //   586: ifeq            594
        //   589: ldc             -259371191
        //   591: goto            596
        //   594: ldc             -1665469890
        //   596: ldc             -1879936038
        //   598: ixor           
        //   599: lookupswitch {
        //          323518948: 624
        //          2138586259: 594
        //          default: 1079
        //        }
        //   624: aload           6
        //   626: goto            630
        //   629: athrow         
        //   630: invokevirtual   dev/nuker/pyro/f3A.3:()F
        //   633: goto            637
        //   636: athrow         
        //   637: fadd           
        //   638: fcmpg          
        //   639: ifgt            693
        //   642: aload           6
        //   644: getstatic       dev/nuker/pyro/fc.0:I
        //   647: ifeq            655
        //   650: ldc             -110852338
        //   652: goto            657
        //   655: ldc             1078770089
        //   657: ldc             1222802355
        //   659: ixor           
        //   660: lookupswitch {
        //          -1316553539: 655
        //          145670682: 688
        //          default: 1087
        //        }
        //   688: astore          4
        //   690: goto            696
        //   693: goto            144
        //   696: getstatic       dev/nuker/pyro/fc.0:I
        //   699: ifeq            707
        //   702: ldc             1828337124
        //   704: goto            709
        //   707: ldc             548560718
        //   709: ldc             -976786487
        //   711: ixor           
        //   712: lookupswitch {
        //          -1455595987: 1093
        //          1077722108: 707
        //          default: 740
        //        }
        //   740: aload           4
        //   742: ifnull          750
        //   745: ldc             419754699
        //   747: goto            752
        //   750: ldc             419754698
        //   752: ldc             -1936191177
        //   754: ixor           
        //   755: tableswitch {
        //          725207032: 776
        //          725207033: 1068
        //          default: 745
        //        }
        //   776: getstatic       dev/nuker/pyro/f0y.c:Ldev/nuker/pyro/f0y;
        //   779: goto            783
        //   782: athrow         
        //   783: invokevirtual   dev/nuker/pyro/f0y.4:()D
        //   786: goto            790
        //   789: athrow         
        //   790: getstatic       dev/nuker/pyro/fc.1:I
        //   793: ifeq            801
        //   796: ldc             340260932
        //   798: goto            803
        //   801: ldc             -1330757705
        //   803: ldc             -136733440
        //   805: ixor           
        //   806: lookupswitch {
        //          -476158652: 801
        //          1199022775: 832
        //          default: 1073
        //        }
        //   832: dstore          5
        //   834: iload_1        
        //   835: i2f            
        //   836: getstatic       dev/nuker/pyro/fc.0:I
        //   839: ifeq            847
        //   842: ldc             312223338
        //   844: goto            849
        //   847: ldc             -1469717648
        //   849: ldc             641733155
        //   851: ixor           
        //   852: lookupswitch {
        //          -953218459: 847
        //          886846537: 1083
        //          default: 880
        //        }
        //   880: fstore          7
        //   882: iload_2        
        //   883: i2f            
        //   884: fstore          8
        //   886: getstatic       dev/nuker/pyro/fc.c:I
        //   889: ifge            897
        //   892: ldc             1702079107
        //   894: goto            899
        //   897: ldc             556538612
        //   899: ldc             2107992853
        //   901: ixor           
        //   902: lookupswitch {
        //          416727446: 897
        //          1552511457: 928
        //          default: 1085
        //        }
        //   928: aload_0        
        //   929: getstatic       dev/nuker/pyro/fc.1:I
        //   932: ifeq            940
        //   935: ldc             -852401950
        //   937: goto            942
        //   940: ldc             -1672632346
        //   942: ldc             -504622596
        //   944: ixor           
        //   945: lookupswitch {
        //          -1852693534: 940
        //          752709918: 1081
        //          default: 972
        //        }
        //   972: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   975: aload           4
        //   977: goto            981
        //   980: athrow         
        //   981: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   984: goto            988
        //   987: athrow         
        //   988: pop            
        //   989: aload_0        
        //   990: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   993: iconst_0       
        //   994: aload           4
        //   996: goto            1000
        //   999: athrow         
        //  1000: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //  1003: goto            1007
        //  1006: athrow         
        //  1007: getstatic       dev/nuker/pyro/fc.1:I
        //  1010: ifeq            1018
        //  1013: ldc             1627516602
        //  1015: goto            1020
        //  1018: ldc             54543784
        //  1020: ldc             807977509
        //  1022: ixor           
        //  1023: lookupswitch {
        //          -798197156: 1018
        //          1361652895: 1095
        //          default: 1048
        //        }
        //  1048: aload           4
        //  1050: fload           7
        //  1052: f2i            
        //  1053: fload           8
        //  1055: f2i            
        //  1056: iload_3        
        //  1057: goto            1061
        //  1060: athrow         
        //  1061: invokevirtual   dev/nuker/pyro/f3A.c:(III)V
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: return         
        //  1069: aconst_null    
        //  1070: athrow         
        //  1071: aconst_null    
        //  1072: athrow         
        //  1073: aconst_null    
        //  1074: athrow         
        //  1075: aconst_null    
        //  1076: athrow         
        //  1077: aconst_null    
        //  1078: athrow         
        //  1079: aconst_null    
        //  1080: athrow         
        //  1081: aconst_null    
        //  1082: athrow         
        //  1083: aconst_null    
        //  1084: athrow         
        //  1085: aconst_null    
        //  1086: athrow         
        //  1087: aconst_null    
        //  1088: athrow         
        //  1089: aconst_null    
        //  1090: athrow         
        //  1091: aconst_null    
        //  1092: athrow         
        //  1093: aconst_null    
        //  1094: athrow         
        //  1095: aconst_null    
        //  1096: athrow         
        //  1097: aconst_null    
        //  1098: athrow         
        //  1099: pop            
        //  1100: goto            24
        //  1103: pop            
        //  1104: aconst_null    
        //  1105: goto            1099
        //  1108: dup            
        //  1109: ifnull          1099
        //  1112: checkcast       Ljava/lang/Throwable;
        //  1115: athrow         
        //  1116: dup            
        //  1117: ifnull          1103
        //  1120: checkcast       Ljava/lang/Throwable;
        //  1123: athrow         
        //  1124: aconst_null    
        //  1125: athrow         
        //    StackMapTable: 00 90 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FF 00 03 00 04 07 00 03 01 01 01 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 45 07 00 10 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 30 00 FF 00 0E 00 05 07 00 03 01 01 01 05 00 01 07 00 03 FF 00 01 00 05 07 00 03 01 01 01 05 00 02 07 00 03 01 5C 07 00 03 45 07 00 30 40 07 00 3F 45 07 00 30 40 07 00 48 FC 00 01 07 00 48 0A 41 01 1E 44 07 00 10 40 07 00 48 47 07 00 30 40 01 02 04 41 01 1A 44 07 00 30 40 07 00 48 47 07 00 30 40 07 00 A6 FC 00 0F 07 00 55 41 01 1E 46 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 4A 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 FF 00 04 00 00 00 01 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 02 02 04 04 41 01 18 4C 02 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 01 5C 02 FF 00 0C 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 07 00 55 01 FF 00 1C 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 42 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 03 04 41 01 19 0A 41 01 1E FF 00 06 00 00 00 01 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 FF 00 0A 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 02 01 FF 00 1B 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 FF 00 04 00 00 00 01 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 03 02 02 02 51 07 00 55 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 07 00 55 01 5E 07 00 55 04 FF 00 02 00 06 07 00 03 01 01 01 07 00 55 07 00 48 00 00 0A 41 01 1E 04 04 41 01 17 45 07 00 1C 40 07 00 84 45 07 00 30 40 03 4A 03 FF 00 01 00 06 07 00 03 01 01 01 07 00 55 07 00 48 00 02 03 01 5C 03 FF 00 0E 00 06 07 00 03 01 01 01 07 00 55 03 00 01 02 FF 00 01 00 06 07 00 03 01 01 01 07 00 55 03 00 02 02 01 5E 02 FD 00 10 02 02 41 01 1C 4B 07 00 03 FF 00 01 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 02 07 00 03 01 5D 07 00 03 47 07 00 30 FF 00 00 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 02 07 00 3F 07 00 55 45 07 00 30 40 01 FF 00 0A 00 00 00 01 07 00 30 FF 00 00 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 03 07 00 3F 01 07 00 55 45 07 00 30 00 0A 41 01 1B FF 00 0B 00 00 00 01 07 00 30 FF 00 00 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 04 07 00 55 01 01 01 45 07 00 30 F8 00 00 FF 00 00 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 01 02 01 FF 00 01 00 06 07 00 03 01 01 01 07 00 55 07 00 48 00 01 03 FF 00 01 00 06 07 00 03 01 01 01 05 07 00 48 00 00 FC 00 01 07 00 55 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 02 FF 00 01 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 01 07 00 03 FF 00 01 00 06 07 00 03 01 01 01 07 00 55 03 00 01 02 FD 00 01 02 02 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 01 07 00 55 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 03 FF 00 01 00 05 07 00 03 01 01 01 05 00 01 07 00 03 FF 00 01 00 06 07 00 03 01 01 01 07 00 55 07 00 48 00 00 FF 00 01 00 08 07 00 03 01 01 01 07 00 55 03 02 02 00 00 FF 00 01 00 07 07 00 03 01 01 01 05 07 00 48 07 00 55 00 02 02 07 00 55 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1108   1116   Any
        //  1108   1116   1108   1116   Any
        //  1124   1126   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  74     81     81     82     Any
        //  75     81     74     75     Ljava/lang/IllegalArgumentException;
        //  74     81     74     75     Ljava/lang/NumberFormatException;
        //  74     81     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  74     81     3      8      Ljava/lang/RuntimeException;
        //  134    141    141    142    Any
        //  134    141    141    142    Any
        //  134    141    134    135    Ljava/lang/NegativeArraySizeException;
        //  135    141    141    142    Ljava/lang/IllegalArgumentException;
        //  135    141    134    135    Any
        //  193    202    202    203    Any
        //  193    202    193    194    Ljava/lang/IllegalArgumentException;
        //  194    202    3      8      Ljava/lang/NullPointerException;
        //  193    202    202    203    Ljava/util/ConcurrentModificationException;
        //  193    202    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  245    254    254    255    Any
        //  246    254    254    255    Ljava/util/NoSuchElementException;
        //  246    254    254    255    Any
        //  246    254    3      8      Any
        //  246    254    245    246    Any
        //  311    318    318    319    Any
        //  311    318    3      8      Ljava/lang/AssertionError;
        //  311    318    311    312    Ljava/lang/IllegalArgumentException;
        //  311    318    311    312    Any
        //  312    318    318    319    Ljava/lang/IllegalArgumentException;
        //  330    337    337    338    Any
        //  331    337    3      8      Any
        //  331    337    337    338    Any
        //  331    337    330    331    Any
        //  330    337    330    331    Any
        //  344    350    350    351    Any
        //  344    350    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  344    350    350    351    Any
        //  344    350    350    351    Any
        //  344    350    3      8      Ljava/lang/UnsupportedOperationException;
        //  479    486    486    487    Any
        //  479    486    3      8      Any
        //  480    486    486    487    Any
        //  480    486    479    480    Any
        //  480    486    486    487    Any
        //  576    582    582    583    Any
        //  576    582    582    583    Any
        //  576    582    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  576    582    3      8      Ljava/lang/ClassCastException;
        //  576    582    3      8      Any
        //  630    636    636    637    Any
        //  630    636    636    637    Ljava/lang/ArithmeticException;
        //  630    636    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  630    636    636    637    Any
        //  630    636    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  782    789    789    790    Any
        //  783    789    789    790    Any
        //  782    789    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  782    789    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  782    789    782    783    Ljava/util/ConcurrentModificationException;
        //  980    987    987    988    Any
        //  980    987    3      8      Any
        //  980    987    980    981    Ljava/lang/NumberFormatException;
        //  981    987    980    981    Any
        //  980    987    980    981    Ljava/lang/AssertionError;
        //  1000   1006   1006   1007   Any
        //  1000   1006   3      8      Any
        //  1000   1006   3      8      Any
        //  1000   1006   3      8      Ljava/lang/RuntimeException;
        //  1000   1006   1006   1007   Any
        //  1061   1067   1067   1068   Any
        //  1061   1067   1067   1068   Any
        //  1061   1067   3      8      Ljava/lang/ArithmeticException;
        //  1061   1067   1067   1068   Ljava/lang/UnsupportedOperationException;
        //  1061   1067   1067   1068   Any
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
    
    public static void c(final char p0, final int p1, final f3A p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          64
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            56
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            48
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_2        
        //    25: iload_0        
        //    26: iload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f3A.c:(CI)V
        //    34: goto            38
        //    37: athrow         
        //    38: return         
        //    39: pop            
        //    40: goto            24
        //    43: pop            
        //    44: aconst_null    
        //    45: goto            39
        //    48: dup            
        //    49: ifnull          39
        //    52: checkcast       Ljava/lang/Throwable;
        //    55: athrow         
        //    56: dup            
        //    57: ifnull          43
        //    60: checkcast       Ljava/lang/Throwable;
        //    63: athrow         
        //    64: aconst_null    
        //    65: athrow         
        //    StackMapTable: 00 0D 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FE 00 03 01 01 07 00 55 45 07 00 30 FF 00 00 00 03 01 01 07 00 55 00 03 07 00 55 01 01 45 07 00 30 00 40 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     48     56     Ljava/lang/ClassCastException;
        //  48     56     48     56     Any
        //  64     66     3      8      Ljava/lang/RuntimeException;
        //  30     37     37     38     Any
        //  30     37     37     38     Ljava/lang/NumberFormatException;
        //  30     37     30     31     Any
        //  31     37     3      8      Ljava/lang/AssertionError;
        //  30     37     3      8      Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 34 out of bounds for length 34
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
    
    public int c() {
        return fbS.bx(this, 420865770);
    }
    
    public void func_73869_a(final char p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          129
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            121
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            113
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: goto            31
        //    30: athrow         
        //    31: invokespecial   net/minecraft/client/gui/GuiScreen.func_73869_a:(CI)V
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: getstatic       dev/nuker/pyro/fc.1:I
        //    42: ifeq            50
        //    45: ldc             480229154
        //    47: goto            52
        //    50: ldc             826647187
        //    52: ldc             1255798649
        //    54: ixor           
        //    55: lookupswitch {
        //          -1005546019: 50
        //          1447444571: 102
        //          default: 80
        //        }
        //    80: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //    83: iload_1        
        //    84: iload_2        
        //    85: invokedynamic   BootstrapMethod #0, accept:(CI)Ljava/util/function/Consumer;
        //    90: goto            94
        //    93: athrow         
        //    94: invokevirtual   java/util/ArrayList.forEach:(Ljava/util/function/Consumer;)V
        //    97: goto            101
        //   100: athrow         
        //   101: return         
        //   102: aconst_null    
        //   103: athrow         
        //   104: pop            
        //   105: goto            24
        //   108: pop            
        //   109: aconst_null    
        //   110: goto            104
        //   113: dup            
        //   114: ifnull          104
        //   117: checkcast       Ljava/lang/Throwable;
        //   120: athrow         
        //   121: dup            
        //   122: ifnull          108
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: aconst_null    
        //   130: athrow         
        //    StackMapTable: 00 15 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FE 00 03 07 00 03 01 01 45 07 00 2A FF 00 00 00 03 07 00 03 01 01 00 03 07 00 03 01 01 45 07 00 30 00 4B 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 5B 07 00 03 4C 07 00 B5 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 3F 07 00 D2 45 07 00 30 00 40 07 00 03 41 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     113    121    Ljava/lang/EnumConstantNotPresentException;
        //  113    121    113    121    Any
        //  129    131    3      8      Any
        //  30     37     37     38     Any
        //  31     37     30     31     Ljava/lang/ArithmeticException;
        //  30     37     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  31     37     37     38     Any
        //  31     37     37     38     Ljava/lang/AssertionError;
        //  93     100    100    101    Any
        //  93     100    100    101    Any
        //  94     100    3      8      Any
        //  93     100    93     94     Ljava/lang/IllegalStateException;
        //  93     100    3      8      Ljava/util/ConcurrentModificationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 54 out of bounds for length 54
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    public void c(final f3G c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    while (true) {
                        break Label_0026;
                        try {
                            o = null;
                            if (fc.1 > 0) {
                                continue Label_0039;
                            }
                            null;
                            this.c = c;
                            return;
                        }
                        catch (IllegalArgumentException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            continue;
                        }
                        break;
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        throw t;
    }
    
    public f3z() {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = 1136246533;
                    break Label_0014;
                }
                n = -227132330;
            }
            switch (n ^ 0x83EBDF67) {
                case -2069523154: {
                    continue;
                }
                default: {
                    this.c = 10;
                    while (true) {
                        int n2 = 0;
                        Label_0071: {
                            if (fc.c < 0) {
                                n2 = -1613961027;
                                break Label_0071;
                            }
                            n2 = -659591392;
                        }
                        switch (n2 ^ 0xC211E21) {
                            case -1813121380: {
                                continue;
                            }
                            case -728862463: {
                                this.c = new ArrayList<f3A>();
                                this.c = null;
                                return;
                            }
                            default: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -1068343198: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void func_146286_b(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          275
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            267
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            259
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: iload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   net/minecraft/client/gui/GuiScreen.func_146286_b:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/f0y.c:Ldev/nuker/pyro/f0y;
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   dev/nuker/pyro/f0y.4:()D
        //    49: goto            53
        //    52: athrow         
        //    53: dstore          4
        //    55: iload_1        
        //    56: i2f            
        //    57: fstore          6
        //    59: iload_2        
        //    60: i2f            
        //    61: fstore          7
        //    63: fload           6
        //    65: f2d            
        //    66: dload           4
        //    68: ddiv           
        //    69: d2f            
        //    70: getstatic       dev/nuker/pyro/fc.0:I
        //    73: ifeq            81
        //    76: ldc             -306507583
        //    78: goto            83
        //    81: ldc             -830529916
        //    83: ldc             -1824695747
        //    85: ixor           
        //    86: lookupswitch {
        //          544482060: 81
        //          2122730236: 248
        //          default: 112
        //        }
        //   112: fstore          6
        //   114: fload           7
        //   116: f2d            
        //   117: dload           4
        //   119: ddiv           
        //   120: d2f            
        //   121: getstatic       dev/nuker/pyro/fc.c:I
        //   124: ifge            132
        //   127: ldc             -1412174792
        //   129: goto            134
        //   132: ldc             -445660116
        //   134: ldc             137400583
        //   136: ixor           
        //   137: lookupswitch {
        //          -1545372353: 246
        //          -439568702: 132
        //          default: 164
        //        }
        //   164: fstore          7
        //   166: fload           6
        //   168: f2i            
        //   169: istore          8
        //   171: fload           7
        //   173: f2i            
        //   174: istore          9
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   180: iload           8
        //   182: getstatic       dev/nuker/pyro/fc.0:I
        //   185: ifeq            193
        //   188: ldc             804413589
        //   190: goto            195
        //   193: ldc             -707697892
        //   195: ldc             1310186961
        //   197: ixor           
        //   198: lookupswitch {
        //          -1681473843: 224
        //          1642446148: 193
        //          default: 244
        //        }
        //   224: iload           9
        //   226: iload_3        
        //   227: invokedynamic   BootstrapMethod #1, accept:(III)Ljava/util/function/Consumer;
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   java/util/ArrayList.forEach:(Ljava/util/function/Consumer;)V
        //   239: goto            243
        //   242: athrow         
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: pop            
        //   251: goto            24
        //   254: pop            
        //   255: aconst_null    
        //   256: goto            250
        //   259: dup            
        //   260: ifnull          250
        //   263: checkcast       Ljava/lang/Throwable;
        //   266: athrow         
        //   267: dup            
        //   268: ifnull          254
        //   271: checkcast       Ljava/lang/Throwable;
        //   274: athrow         
        //   275: aconst_null    
        //   276: athrow         
        //    StackMapTable: 00 21 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FF 00 03 00 04 07 00 03 01 01 01 00 00 46 07 00 10 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 30 00 45 07 00 30 40 07 00 84 45 07 00 30 40 03 FF 00 1B 00 07 07 00 03 01 01 01 03 02 02 00 01 02 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 02 01 5C 02 53 02 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 02 01 5D 02 FF 00 1C 00 09 07 00 03 01 01 01 03 02 02 01 01 00 02 07 00 3F 01 FF 00 01 00 09 07 00 03 01 01 01 03 02 02 01 01 00 03 07 00 3F 01 01 FF 00 1C 00 09 07 00 03 01 01 01 03 02 02 01 01 00 02 07 00 3F 01 4A 07 00 30 FF 00 00 00 09 07 00 03 01 01 01 03 02 02 01 01 00 02 07 00 3F 07 00 D2 45 07 00 30 00 FF 00 00 00 09 07 00 03 01 01 01 03 02 02 01 01 00 02 07 00 3F 01 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 01 02 41 02 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 16 43 05 44 07 00 16 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     259    267    Ljava/util/NoSuchElementException;
        //  259    267    259    267    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  275    277    3      8      Any
        //  31     38     38     39     Any
        //  32     38     38     39     Ljava/lang/IllegalStateException;
        //  32     38     3      8      Any
        //  32     38     31     32     Ljava/lang/IllegalArgumentException;
        //  32     38     38     39     Any
        //  45     52     52     53     Any
        //  46     52     3      8      Any
        //  46     52     45     46     Ljava/lang/ClassCastException;
        //  46     52     45     46     Ljava/lang/UnsupportedOperationException;
        //  46     52     45     46     Any
        //  235    242    242    243    Any
        //  236    242    242    243    Ljava/lang/IllegalStateException;
        //  235    242    242    243    Ljava/lang/AssertionError;
        //  236    242    235    236    Ljava/lang/AssertionError;
        //  236    242    235    236    Any
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
    
    public static void c(final int p0, final int p1, final int p2, final f3A p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          65
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            57
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            49
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_3        
        //    25: iload_0        
        //    26: iload_1        
        //    27: iload_2        
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   dev/nuker/pyro/f3A.0:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: return         
        //    40: pop            
        //    41: goto            24
        //    44: pop            
        //    45: aconst_null    
        //    46: goto            40
        //    49: dup            
        //    50: ifnull          40
        //    53: checkcast       Ljava/lang/Throwable;
        //    56: athrow         
        //    57: dup            
        //    58: ifnull          44
        //    61: checkcast       Ljava/lang/Throwable;
        //    64: athrow         
        //    65: aconst_null    
        //    66: athrow         
        //    StackMapTable: 00 0D 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FF 00 03 00 04 01 01 01 07 00 55 00 00 46 07 00 28 FF 00 00 00 04 01 01 01 07 00 55 00 04 07 00 55 01 01 01 45 07 00 30 00 40 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  8      20     49     57     Any
        //  49     57     49     57     Ljava/lang/ArithmeticException;
        //  65     67     3      7      Ljava/lang/ClassCastException;
        //  31     38     38     39     Any
        //  31     38     31     32     Ljava/lang/ClassCastException;
        //  32     38     38     39     Any
        //  31     38     38     39     Any
        //  31     38     3      7      Any
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
    
    public void func_73863_a(final int p0, final int p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1143
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1135
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1127
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1981825212
        //    32: goto            37
        //    35: ldc             727828887
        //    37: ldc             444717565
        //    39: ixor           
        //    40: lookupswitch {
        //          836767850: 68
        //          1822529857: 35
        //          default: 1102
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            81
        //    75: ldc_w           -618508311
        //    78: goto            84
        //    81: ldc_w           -456411471
        //    84: ldc_w           1746090602
        //    87: ixor           
        //    88: lookupswitch {
        //          -1931965221: 116
        //          -1288604285: 81
        //          default: 1088
        //        }
        //   116: iload_1        
        //   117: iload_2        
        //   118: fload_3        
        //   119: getstatic       dev/nuker/pyro/fc.0:I
        //   122: ifeq            131
        //   125: ldc_w           1278250257
        //   128: goto            134
        //   131: ldc_w           1207377635
        //   134: ldc_w           438285646
        //   137: ixor           
        //   138: lookupswitch {
        //          -1711877824: 131
        //          1445935199: 1086
        //          default: 164
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokespecial   net/minecraft/client/gui/GuiScreen.func_73863_a:(IIF)V
        //   171: goto            175
        //   174: athrow         
        //   175: aload_0        
        //   176: getstatic       dev/nuker/pyro/fc.c:I
        //   179: ifge            188
        //   182: ldc_w           1608041142
        //   185: goto            191
        //   188: ldc_w           2019132510
        //   191: ldc_w           -206029494
        //   194: ixor           
        //   195: lookupswitch {
        //          -1948141292: 220
        //          -1402929156: 188
        //          default: 1090
        //        }
        //   220: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   223: getstatic       dev/nuker/pyro/fc.c:I
        //   226: ifge            235
        //   229: ldc_w           93770879
        //   232: goto            238
        //   235: ldc_w           1525655667
        //   238: ldc_w           -1082444199
        //   241: ixor           
        //   242: lookupswitch {
        //          -2052680494: 235
        //          -1158815194: 1092
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   java/util/ArrayList.size:()I
        //   275: goto            279
        //   278: athrow         
        //   279: iconst_1       
        //   280: isub           
        //   281: getstatic       dev/nuker/pyro/fc.0:I
        //   284: ifeq            293
        //   287: ldc_w           476617030
        //   290: goto            296
        //   293: ldc_w           -215694010
        //   296: ldc_w           -834757253
        //   299: ixor           
        //   300: lookupswitch {
        //          -1145658770: 293
        //          -766114755: 1114
        //          default: 328
        //        }
        //   328: istore          4
        //   330: getstatic       dev/nuker/pyro/fc.0:I
        //   333: ifeq            342
        //   336: ldc_w           -1956487113
        //   339: goto            345
        //   342: ldc_w           1497330775
        //   345: ldc_w           -1994510229
        //   348: ixor           
        //   349: lookupswitch {
        //          -803126212: 376
        //          41701468: 342
        //          default: 1094
        //        }
        //   376: iload           4
        //   378: iflt            986
        //   381: getstatic       dev/nuker/pyro/fc.1:I
        //   384: ifeq            393
        //   387: ldc_w           1140560154
        //   390: goto            396
        //   393: ldc_w           1419294255
        //   396: ldc_w           1515623201
        //   399: ixor           
        //   400: lookupswitch {
        //          248390926: 428
        //          430768699: 393
        //          default: 1106
        //        }
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   432: iload           4
        //   434: goto            438
        //   437: athrow         
        //   438: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   441: goto            445
        //   444: athrow         
        //   445: checkcast       Ldev/nuker/pyro/f3A;
        //   448: astore          5
        //   450: getstatic       dev/nuker/pyro/fc.0:I
        //   453: ifeq            462
        //   456: ldc_w           143087617
        //   459: goto            465
        //   462: ldc_w           -1084921948
        //   465: ldc_w           -1993574258
        //   468: ixor           
        //   469: lookupswitch {
        //          -2119491441: 1098
        //          1955741068: 462
        //          default: 496
        //        }
        //   496: goto            500
        //   499: athrow         
        //   500: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   503: goto            507
        //   506: athrow         
        //   507: getstatic       dev/nuker/pyro/fc.1:I
        //   510: ifeq            519
        //   513: ldc_w           -71039892
        //   516: goto            522
        //   519: ldc_w           -1367884805
        //   522: ldc_w           678310251
        //   525: ixor           
        //   526: lookupswitch {
        //          -2045146480: 552
        //          -743820025: 519
        //          default: 1108
        //        }
        //   552: aload           5
        //   554: getstatic       dev/nuker/pyro/fc.c:I
        //   557: ifge            566
        //   560: ldc_w           184131754
        //   563: goto            569
        //   566: ldc_w           -719215328
        //   569: ldc_w           411049061
        //   572: ixor           
        //   573: lookupswitch {
        //          -959724992: 566
        //          309968079: 1104
        //          default: 600
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   dev/nuker/pyro/f3A.5:()F
        //   607: goto            611
        //   610: athrow         
        //   611: aload           5
        //   613: goto            617
        //   616: athrow         
        //   617: invokevirtual   dev/nuker/pyro/f3A.2:()F
        //   620: goto            624
        //   623: athrow         
        //   624: fconst_0       
        //   625: getstatic       dev/nuker/pyro/fc.1:I
        //   628: ifeq            637
        //   631: ldc_w           990026091
        //   634: goto            640
        //   637: ldc_w           106147574
        //   640: ldc_w           314117699
        //   643: ixor           
        //   644: lookupswitch {
        //          350920885: 672
        //          700159784: 637
        //          default: 1116
        //        }
        //   672: goto            676
        //   675: athrow         
        //   676: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   679: goto            683
        //   682: athrow         
        //   683: getstatic       dev/nuker/pyro/fc.0:I
        //   686: ifeq            695
        //   689: ldc_w           -500011664
        //   692: goto            698
        //   695: ldc_w           -1408496791
        //   698: ldc_w           -1441566981
        //   701: ixor           
        //   702: lookupswitch {
        //          1210123147: 1100
        //          1226995292: 695
        //          default: 728
        //        }
        //   728: getstatic       dev/nuker/pyro/f0y.c:Ldev/nuker/pyro/f0y;
        //   731: goto            735
        //   734: athrow         
        //   735: invokevirtual   dev/nuker/pyro/f0y.4:()D
        //   738: goto            742
        //   741: athrow         
        //   742: dstore          6
        //   744: dload           6
        //   746: dload           6
        //   748: dload           6
        //   750: goto            754
        //   753: athrow         
        //   754: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179139_a:(DDD)V
        //   757: goto            761
        //   760: athrow         
        //   761: iload_1        
        //   762: i2f            
        //   763: aload           5
        //   765: goto            769
        //   768: athrow         
        //   769: invokevirtual   dev/nuker/pyro/f3A.5:()F
        //   772: goto            776
        //   775: athrow         
        //   776: fsub           
        //   777: fstore          8
        //   779: getstatic       dev/nuker/pyro/fc.0:I
        //   782: ifeq            791
        //   785: ldc_w           932608368
        //   788: goto            794
        //   791: ldc_w           165763926
        //   794: ldc_w           -626708283
        //   797: ixor           
        //   798: lookupswitch {
        //          -750490733: 824
        //          -315405899: 791
        //          default: 1084
        //        }
        //   824: iload_2        
        //   825: i2f            
        //   826: aload           5
        //   828: goto            832
        //   831: athrow         
        //   832: invokevirtual   dev/nuker/pyro/f3A.2:()F
        //   835: goto            839
        //   838: athrow         
        //   839: fsub           
        //   840: fstore          9
        //   842: fload           8
        //   844: f2d            
        //   845: dload           6
        //   847: ddiv           
        //   848: d2f            
        //   849: fstore          8
        //   851: fload           9
        //   853: f2d            
        //   854: dload           6
        //   856: ddiv           
        //   857: d2f            
        //   858: fstore          9
        //   860: aload           5
        //   862: getstatic       dev/nuker/pyro/fc.1:I
        //   865: ifeq            874
        //   868: ldc_w           -1013770020
        //   871: goto            877
        //   874: ldc_w           1152030773
        //   877: ldc_w           -635027936
        //   880: ixor           
        //   881: lookupswitch {
        //          -1583650207: 874
        //          431302396: 1110
        //          default: 908
        //        }
        //   908: fload           8
        //   910: fload           9
        //   912: getstatic       dev/nuker/pyro/fc.0:I
        //   915: ifeq            924
        //   918: ldc_w           -1999672566
        //   921: goto            927
        //   924: ldc_w           1362174208
        //   927: ldc_w           630803802
        //   930: ixor           
        //   931: lookupswitch {
        //          -1386863024: 1112
        //          1716835634: 924
        //          default: 956
        //        }
        //   956: fload_3        
        //   957: goto            961
        //   960: athrow         
        //   961: invokevirtual   dev/nuker/pyro/f3A.c:(FFF)Z
        //   964: goto            968
        //   967: athrow         
        //   968: pop            
        //   969: goto            973
        //   972: athrow         
        //   973: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   976: goto            980
        //   979: athrow         
        //   980: iinc            4, -1
        //   983: goto            330
        //   986: aload_0        
        //   987: getfield        dev/nuker/pyro/f3z.c:Ldev/nuker/pyro/f3A;
        //   990: ifnull          1083
        //   993: aload_0        
        //   994: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //   997: aload_0        
        //   998: getfield        dev/nuker/pyro/f3z.c:Ldev/nuker/pyro/f3A;
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //  1008: goto            1012
        //  1011: athrow         
        //  1012: pop            
        //  1013: aload_0        
        //  1014: getfield        dev/nuker/pyro/f3z.c:Ljava/util/ArrayList;
        //  1017: iconst_0       
        //  1018: aload_0        
        //  1019: getfield        dev/nuker/pyro/f3z.c:Ldev/nuker/pyro/f3A;
        //  1022: goto            1026
        //  1025: athrow         
        //  1026: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //  1029: goto            1033
        //  1032: athrow         
        //  1033: aload_0        
        //  1034: aconst_null    
        //  1035: getstatic       dev/nuker/pyro/fc.0:I
        //  1038: ifeq            1047
        //  1041: ldc_w           181341612
        //  1044: goto            1050
        //  1047: ldc_w           -1956490318
        //  1050: ldc_w           674885776
        //  1053: ixor           
        //  1054: lookupswitch {
        //          -1554275550: 1080
        //          586612028: 1047
        //          default: 1096
        //        }
        //  1080: putfield        dev/nuker/pyro/f3z.c:Ldev/nuker/pyro/f3A;
        //  1083: return         
        //  1084: aconst_null    
        //  1085: athrow         
        //  1086: aconst_null    
        //  1087: athrow         
        //  1088: aconst_null    
        //  1089: athrow         
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
        //  1118: pop            
        //  1119: goto            24
        //  1122: pop            
        //  1123: aconst_null    
        //  1124: goto            1118
        //  1127: dup            
        //  1128: ifnull          1118
        //  1131: checkcast       Ljava/lang/Throwable;
        //  1134: athrow         
        //  1135: dup            
        //  1136: ifnull          1122
        //  1139: checkcast       Ljava/lang/Throwable;
        //  1142: athrow         
        //  1143: aconst_null    
        //  1144: athrow         
        //    StackMapTable: 00 8C 43 07 00 30 04 FF 00 0B 00 00 00 01 07 00 30 FF 00 03 00 04 07 00 03 01 01 02 00 00 0A 41 01 1E 4C 07 00 03 FF 00 02 00 04 07 00 03 01 01 02 00 02 07 00 03 01 5F 07 00 03 FF 00 0E 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 FF 00 02 00 04 07 00 03 01 01 02 00 05 07 00 03 01 01 02 01 FF 00 1D 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 FF 00 02 00 00 00 01 07 00 30 FF 00 00 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 45 07 00 30 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 01 02 00 02 07 00 03 01 5C 07 00 03 4E 07 00 3F FF 00 02 00 04 07 00 03 01 01 02 00 02 07 00 3F 01 5D 07 00 3F 42 07 00 30 40 07 00 3F 45 07 00 30 40 01 4D 01 FF 00 02 00 04 07 00 03 01 01 02 00 02 01 01 5F 01 FC 00 01 01 0B 42 01 1E 10 42 01 1F 48 07 00 30 FF 00 00 00 05 07 00 03 01 01 02 01 00 02 07 00 3F 01 45 07 00 30 40 07 00 A6 FC 00 10 07 00 55 42 01 1E 42 07 00 30 00 45 07 00 30 00 0B 42 01 1D 4D 07 00 55 FF 00 02 00 06 07 00 03 01 01 02 01 07 00 55 00 02 07 00 55 01 5E 07 00 55 FF 00 02 00 00 00 01 07 00 30 FF 00 00 00 06 07 00 03 01 01 02 01 07 00 55 00 01 07 00 55 45 07 00 30 40 02 44 07 00 30 FF 00 00 00 06 07 00 03 01 01 02 01 07 00 55 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 06 07 00 03 01 01 02 01 07 00 55 00 02 02 02 FF 00 0C 00 06 07 00 03 01 01 02 01 07 00 55 00 03 02 02 02 FF 00 02 00 06 07 00 03 01 01 02 01 07 00 55 00 04 02 02 02 01 FF 00 1F 00 06 07 00 03 01 01 02 01 07 00 55 00 03 02 02 02 42 07 00 30 FF 00 00 00 06 07 00 03 01 01 02 01 07 00 55 00 03 02 02 02 45 07 00 30 00 0B 42 01 1D 45 07 00 30 40 07 00 84 45 07 00 30 40 03 FF 00 0A 00 07 07 00 03 01 01 02 01 07 00 55 03 00 01 07 00 30 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 55 03 00 03 03 03 03 45 07 00 30 00 46 07 00 10 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 55 03 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 55 03 00 02 02 02 FC 00 0E 02 42 01 1D 46 07 00 30 FF 00 00 00 08 07 00 03 01 01 02 01 07 00 55 03 02 00 02 02 07 00 55 45 07 00 30 FF 00 00 00 08 07 00 03 01 01 02 01 07 00 55 03 02 00 02 02 02 FF 00 22 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 01 07 00 55 FF 00 02 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 02 07 00 55 01 5E 07 00 55 FF 00 0F 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 03 07 00 55 02 02 FF 00 02 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 04 07 00 55 02 02 01 FF 00 1C 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 03 07 00 55 02 02 43 07 00 30 FF 00 00 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 04 07 00 55 02 02 02 45 07 00 30 40 01 FF 00 03 00 00 00 01 07 00 30 FF 00 00 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 00 45 07 00 30 00 FF 00 05 00 05 07 00 03 01 01 02 01 00 00 51 07 00 30 FF 00 00 00 05 07 00 03 01 01 02 01 00 02 07 00 3F 07 00 55 45 07 00 30 40 01 4C 07 00 30 FF 00 00 00 05 07 00 03 01 01 02 01 00 03 07 00 3F 01 07 00 55 45 07 00 30 00 FF 00 0D 00 05 07 00 03 01 01 02 01 00 02 07 00 03 05 FF 00 02 00 05 07 00 03 01 01 02 01 00 03 07 00 03 05 01 FF 00 1D 00 05 07 00 03 01 01 02 01 00 02 07 00 03 05 02 FE 00 00 07 00 55 03 02 FF 00 01 00 04 07 00 03 01 01 02 00 04 07 00 03 01 01 02 41 07 00 03 41 07 00 03 41 07 00 3F FC 00 01 01 FF 00 01 00 05 07 00 03 01 01 02 01 00 02 07 00 03 05 FC 00 01 07 00 55 01 F9 00 01 FF 00 01 00 06 07 00 03 01 01 02 01 07 00 55 00 01 07 00 55 FA 00 01 FC 00 01 07 00 55 FF 00 01 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 01 07 00 55 FF 00 01 00 09 07 00 03 01 01 02 01 07 00 55 03 02 02 00 03 07 00 55 02 02 FF 00 01 00 04 07 00 03 01 01 02 00 01 01 FF 00 01 00 06 07 00 03 01 01 02 01 07 00 55 00 03 02 02 02 FF 00 01 00 04 07 00 03 01 01 02 00 01 07 00 30 43 05 44 07 00 30 47 05 47 07 00 30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1127   1135   Any
        //  1127   1135   1127   1135   Any
        //  1143   1145   3      8      Any
        //  168    174    174    175    Any
        //  168    174    174    175    Ljava/lang/StringIndexOutOfBoundsException;
        //  168    174    3      8      Ljava/lang/AssertionError;
        //  168    174    3      8      Any
        //  168    174    174    175    Any
        //  271    278    278    279    Any
        //  272    278    271    272    Ljava/lang/EnumConstantNotPresentException;
        //  272    278    271    272    Any
        //  271    278    3      8      Any
        //  272    278    3      8      Any
        //  437    444    444    445    Any
        //  437    444    444    445    Any
        //  438    444    437    438    Any
        //  437    444    3      8      Any
        //  438    444    437    438    Any
        //  499    506    506    507    Any
        //  500    506    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  500    506    499    500    Ljava/lang/StringIndexOutOfBoundsException;
        //  500    506    3      8      Any
        //  500    506    499    500    Any
        //  604    610    610    611    Any
        //  604    610    610    611    Ljava/lang/StringIndexOutOfBoundsException;
        //  604    610    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  604    610    3      8      Any
        //  604    610    610    611    Ljava/lang/RuntimeException;
        //  616    623    623    624    Any
        //  616    623    616    617    Any
        //  617    623    616    617    Ljava/lang/RuntimeException;
        //  616    623    616    617    Any
        //  616    623    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  675    682    682    683    Any
        //  676    682    675    676    Any
        //  675    682    675    676    Ljava/lang/RuntimeException;
        //  676    682    3      8      Any
        //  676    682    3      8      Any
        //  734    741    741    742    Any
        //  735    741    741    742    Ljava/lang/IllegalArgumentException;
        //  734    741    741    742    Any
        //  734    741    741    742    Any
        //  735    741    734    735    Any
        //  753    760    760    761    Any
        //  754    760    3      8      Ljava/lang/NumberFormatException;
        //  754    760    753    754    Any
        //  754    760    760    761    Any
        //  753    760    753    754    Ljava/lang/AssertionError;
        //  768    775    775    776    Any
        //  769    775    775    776    Any
        //  768    775    768    769    Ljava/lang/IllegalArgumentException;
        //  768    775    3      8      Ljava/lang/IllegalStateException;
        //  769    775    3      8      Ljava/lang/ClassCastException;
        //  831    838    838    839    Any
        //  832    838    838    839    Any
        //  831    838    3      8      Ljava/lang/NumberFormatException;
        //  832    838    831    832    Any
        //  832    838    838    839    Ljava/lang/IllegalArgumentException;
        //  960    967    967    968    Any
        //  960    967    3      8      Ljava/lang/NullPointerException;
        //  961    967    960    961    Any
        //  961    967    3      8      Ljava/lang/ArithmeticException;
        //  961    967    967    968    Any
        //  973    979    979    980    Any
        //  973    979    979    980    Any
        //  973    979    979    980    Ljava/lang/AssertionError;
        //  973    979    979    980    Ljava/util/ConcurrentModificationException;
        //  973    979    3      8      Any
        //  1004   1011   1011   1012   Any
        //  1005   1011   1004   1005   Ljava/lang/NegativeArraySizeException;
        //  1005   1011   1004   1005   Any
        //  1004   1011   3      8      Any
        //  1005   1011   1011   1012   Ljava/lang/AssertionError;
        //  1025   1032   1032   1033   Any
        //  1026   1032   3      8      Any
        //  1025   1032   1025   1026   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1025   1032   1025   1026   Any
        //  1026   1032   3      8      Any
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
    
    public boolean func_73868_f() {
        return fbS.eQ(this, 862454963);
    }
}
