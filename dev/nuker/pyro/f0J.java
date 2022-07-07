// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f0J extends f0P
{
    public fw<Integer> c;
    public String c;
    public boolean c;
    
    public f0J(@NotNull final String c, @NotNull final fw c2) {
        super(null);
        this.c = c;
        while (true) {
            int n = 0;
            Label_0029: {
                if (fc.0 != 0) {
                    n = 174461191;
                    break Label_0029;
                }
                n = -1005353831;
            }
            switch (n ^ 0x7BE44C38) {
                case 1904368959: {
                    continue;
                }
                case -1074280287: {
                    this.c = (fw<Integer>)c2;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    @Override
    public void 2(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          941
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            933
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            925
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: aload_0        
        //    30: aload_1        
        //    31: getstatic       dev/nuker/pyro/fc.1:I
        //    34: ifeq            42
        //    37: ldc             946265051
        //    39: goto            44
        //    42: ldc             1417613204
        //    44: ldc             1884010615
        //    46: ixor           
        //    47: lookupswitch {
        //          -1779961195: 42
        //          1210934188: 900
        //          default: 72
        //        }
        //    72: dload_2        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            84
        //    79: ldc             -259232166
        //    81: goto            86
        //    84: ldc             -802105304
        //    86: ldc             -2112263848
        //    88: ixor           
        //    89: lookupswitch {
        //          359163970: 84
        //          1922369282: 906
        //          default: 116
        //        }
        //   116: dload           4
        //   118: aload           6
        //   120: getstatic       dev/nuker/pyro/fc.0:I
        //   123: ifeq            131
        //   126: ldc             -1291856026
        //   128: goto            133
        //   131: ldc             -1692535278
        //   133: ldc             -798598343
        //   135: ixor           
        //   136: lookupswitch {
        //          1266396459: 164
        //          1654230111: 131
        //          default: 908
        //        }
        //   164: goto            168
        //   167: athrow         
        //   168: invokespecial   dev/nuker/pyro/f0P.2:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   171: goto            175
        //   174: athrow         
        //   175: getstatic       dev/nuker/pyro/fc.0:I
        //   178: ifeq            186
        //   181: ldc             -1316541929
        //   183: goto            188
        //   186: ldc             -153194637
        //   188: ldc             1589214028
        //   190: ixor           
        //   191: lookupswitch {
        //          -1469639617: 216
        //          -281128613: 186
        //          default: 888
        //        }
        //   216: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //   219: getstatic       dev/nuker/pyro/fc.c:I
        //   222: ifge            230
        //   225: ldc             1483867931
        //   227: goto            232
        //   230: ldc             -2052073046
        //   232: ldc             -2022687870
        //   234: ixor           
        //   235: lookupswitch {
        //          -553501543: 230
        //          48226856: 260
        //          default: 904
        //        }
        //   260: aload_1        
        //   261: goto            265
        //   264: athrow         
        //   265: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   268: goto            272
        //   271: athrow         
        //   272: getstatic       dev/nuker/pyro/fc.1:I
        //   275: ifeq            283
        //   278: ldc             549073558
        //   280: goto            285
        //   283: ldc             797385484
        //   285: ldc             -235702020
        //   287: ixor           
        //   288: lookupswitch {
        //          -783725974: 283
        //          -562799632: 316
        //          default: 894
        //        }
        //   316: aload_0        
        //   317: getfield        dev/nuker/pyro/f0J.c:Ljava/lang/String;
        //   320: iconst_0       
        //   321: getstatic       dev/nuker/pyro/f0y.c:I
        //   324: aload_1        
        //   325: goto            329
        //   328: athrow         
        //   329: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   332: goto            336
        //   335: athrow         
        //   336: iconst_4       
        //   337: isub           
        //   338: aload_1        
        //   339: goto            343
        //   342: athrow         
        //   343: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   346: goto            350
        //   349: athrow         
        //   350: getstatic       dev/nuker/pyro/fc.1:I
        //   353: ifeq            361
        //   356: ldc             1325605671
        //   358: goto            363
        //   361: ldc             -1862587735
        //   363: ldc             -389042034
        //   365: ixor           
        //   366: lookupswitch {
        //          -1479765079: 896
        //          1808361383: 361
        //          default: 392
        //        }
        //   392: getstatic       dev/nuker/pyro/f0y.c:I
        //   395: iconst_2       
        //   396: imul           
        //   397: isub           
        //   398: iconst_4       
        //   399: isub           
        //   400: getstatic       dev/nuker/pyro/f0x.c:Ldev/nuker/pyro/f0x;
        //   403: getstatic       dev/nuker/pyro/f0y.c:I
        //   406: aload           6
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //   415: goto            419
        //   418: athrow         
        //   419: iconst_0       
        //   420: sipush          512
        //   423: aconst_null    
        //   424: goto            428
        //   427: athrow         
        //   428: invokestatic    dev/nuker/pyro/f0A.c:(Ldev/nuker/pyro/f0A;Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;IIIILdev/nuker/pyro/f0x;IIZILjava/lang/Object;)V
        //   431: goto            435
        //   434: athrow         
        //   435: getstatic       dev/nuker/pyro/fc.0:I
        //   438: ifeq            446
        //   441: ldc             1419791264
        //   443: goto            448
        //   446: ldc             -2007687423
        //   448: ldc             -102197720
        //   450: ixor           
        //   451: lookupswitch {
        //          -1387733624: 914
        //          160450022: 446
        //          default: 476
        //        }
        //   476: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //   479: aload_1        
        //   480: getstatic       dev/nuker/pyro/fc.c:I
        //   483: ifge            491
        //   486: ldc             -1380279496
        //   488: goto            493
        //   491: ldc             1673326006
        //   493: ldc             1126490917
        //   495: ixor           
        //   496: lookupswitch {
        //          -291604451: 491
        //          546836115: 524
        //          default: 892
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   531: goto            535
        //   534: athrow         
        //   535: aload_0        
        //   536: aload_0        
        //   537: getfield        dev/nuker/pyro/f0J.c:Ldev/nuker/pyro/fw;
        //   540: goto            544
        //   543: athrow         
        //   544: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   547: goto            551
        //   550: athrow         
        //   551: dup            
        //   552: pop            
        //   553: checkcast       Ljava/lang/Number;
        //   556: getstatic       dev/nuker/pyro/fc.1:I
        //   559: ifeq            567
        //   562: ldc             1903910606
        //   564: goto            569
        //   567: ldc             806217127
        //   569: ldc             -1067019429
        //   571: ixor           
        //   572: lookupswitch {
        //          -1323446891: 567
        //          -261392644: 600
        //          default: 890
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   java/lang/Number.intValue:()I
        //   607: goto            611
        //   610: athrow         
        //   611: goto            615
        //   614: athrow         
        //   615: invokevirtual   dev/nuker/pyro/f0J.c:(I)Ljava/lang/String;
        //   618: goto            622
        //   621: athrow         
        //   622: iconst_0       
        //   623: getstatic       dev/nuker/pyro/f0y.c:I
        //   626: aload_1        
        //   627: goto            631
        //   630: athrow         
        //   631: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   634: goto            638
        //   637: athrow         
        //   638: iconst_4       
        //   639: isub           
        //   640: aload_1        
        //   641: getstatic       dev/nuker/pyro/fc.0:I
        //   644: ifeq            652
        //   647: ldc             1786415080
        //   649: goto            654
        //   652: ldc             -1435520704
        //   654: ldc             587415678
        //   656: ixor           
        //   657: lookupswitch {
        //          286737090: 652
        //          1232717718: 910
        //          default: 684
        //        }
        //   684: goto            688
        //   687: athrow         
        //   688: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   691: goto            695
        //   694: athrow         
        //   695: getstatic       dev/nuker/pyro/f0y.c:I
        //   698: iconst_2       
        //   699: imul           
        //   700: isub           
        //   701: iconst_4       
        //   702: isub           
        //   703: getstatic       dev/nuker/pyro/f0x.0:Ldev/nuker/pyro/f0x;
        //   706: getstatic       dev/nuker/pyro/fc.c:I
        //   709: ifge            717
        //   712: ldc             -569868846
        //   714: goto            719
        //   717: ldc             465383542
        //   719: ldc             -1325702383
        //   721: ixor           
        //   722: lookupswitch {
        //          1861426883: 912
        //          1960351275: 717
        //          default: 748
        //        }
        //   748: getstatic       dev/nuker/pyro/f0y.c:I
        //   751: aload_0        
        //   752: getfield        dev/nuker/pyro/f0J.c:Z
        //   755: ifeq            816
        //   758: getstatic       dev/nuker/pyro/fc.0:I
        //   761: ifeq            769
        //   764: ldc             -585615200
        //   766: goto            771
        //   769: ldc             671335375
        //   771: ldc             1720721055
        //   773: ixor           
        //   774: lookupswitch {
        //          -1148705217: 769
        //          1318313296: 800
        //          default: 902
        //        }
        //   800: aload           6
        //   802: goto            806
        //   805: athrow         
        //   806: invokevirtual   dev/nuker/pyro/f0y.8:()I
        //   809: goto            813
        //   812: athrow         
        //   813: goto            871
        //   816: aload           6
        //   818: getstatic       dev/nuker/pyro/fc.0:I
        //   821: ifeq            829
        //   824: ldc             -1199771141
        //   826: goto            831
        //   829: ldc             1754628883
        //   831: ldc             -721310870
        //   833: ixor           
        //   834: lookupswitch {
        //          1720283204: 829
        //          1836931729: 898
        //          default: 860
        //        }
        //   860: goto            864
        //   863: athrow         
        //   864: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //   867: goto            871
        //   870: athrow         
        //   871: iconst_0       
        //   872: sipush          512
        //   875: aconst_null    
        //   876: goto            880
        //   879: athrow         
        //   880: invokestatic    dev/nuker/pyro/f0A.c:(Ldev/nuker/pyro/f0A;Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;IIIILdev/nuker/pyro/f0x;IIZILjava/lang/Object;)V
        //   883: goto            887
        //   886: athrow         
        //   887: return         
        //   888: aconst_null    
        //   889: athrow         
        //   890: aconst_null    
        //   891: athrow         
        //   892: aconst_null    
        //   893: athrow         
        //   894: aconst_null    
        //   895: athrow         
        //   896: aconst_null    
        //   897: athrow         
        //   898: aconst_null    
        //   899: athrow         
        //   900: aconst_null    
        //   901: athrow         
        //   902: aconst_null    
        //   903: athrow         
        //   904: aconst_null    
        //   905: athrow         
        //   906: aconst_null    
        //   907: athrow         
        //   908: aconst_null    
        //   909: athrow         
        //   910: aconst_null    
        //   911: athrow         
        //   912: aconst_null    
        //   913: athrow         
        //   914: aconst_null    
        //   915: athrow         
        //   916: pop            
        //   917: goto            24
        //   920: pop            
        //   921: aconst_null    
        //   922: goto            916
        //   925: dup            
        //   926: ifnull          916
        //   929: checkcast       Ljava/lang/Throwable;
        //   932: athrow         
        //   933: dup            
        //   934: ifnull          920
        //   937: checkcast       Ljava/lang/Throwable;
        //   940: athrow         
        //   941: aconst_null    
        //   942: athrow         
        //    StackMapTable: 00 7E 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FF 00 03 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 00 FF 00 11 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 03 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 03 07 00 62 01 FF 00 1B 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 03 07 00 62 FF 00 0B 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 03 07 00 62 03 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 03 07 00 62 03 01 FF 00 1D 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 03 07 00 62 03 FF 00 0E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 05 07 00 03 07 00 62 03 03 07 00 6A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 06 07 00 03 07 00 62 03 03 07 00 6A 01 FF 00 1E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 05 07 00 03 07 00 62 03 03 07 00 6A FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 05 07 00 03 07 00 62 03 03 07 00 6A 45 07 00 47 00 0A 41 01 1B 4D 07 00 5A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 01 5B 07 00 5A FF 00 03 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 A8 FF 00 0A 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 A8 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 5A 07 00 A8 01 FF 00 1E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 A8 4B 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 06 07 00 5A 07 00 A8 07 00 1F 01 01 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 06 07 00 5A 07 00 A8 07 00 1F 01 01 01 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 FF 00 0A 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 08 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 01 FF 00 1C 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 52 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 47 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0D 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 01 01 05 45 07 00 47 00 0A 41 01 1B FF 00 0E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 5A 07 00 62 01 FF 00 1E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 62 42 07 00 2B FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 A8 FF 00 07 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 21 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 AA FF 00 0F 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 8A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 05 07 00 5A 07 00 A8 07 00 03 07 00 8A 01 FF 00 1E 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 8A 42 07 00 2B FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 8A 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 01 42 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 01 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 5A 07 00 A8 07 00 1F 47 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 06 07 00 5A 07 00 A8 07 00 1F 01 01 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 06 07 00 5A 07 00 A8 07 00 1F 01 01 01 FF 00 0D 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 08 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 01 FF 00 1D 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 FF 00 15 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 08 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 09 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 FF 00 1C 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 08 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 FF 00 14 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 09 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 FF 00 1C 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 09 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 44 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 FF 00 02 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 09 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 FF 00 0C 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0B 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A 01 FF 00 1C 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A 42 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A 45 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 47 07 00 47 FF 00 00 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0D 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 01 01 01 05 45 07 00 47 00 00 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 04 07 00 5A 07 00 A8 07 00 03 07 00 8A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 5A 07 00 A8 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 0A 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 07 00 6A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 02 07 00 03 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 09 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 41 07 00 5A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 03 07 00 03 07 00 62 03 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 05 07 00 03 07 00 62 03 03 07 00 6A FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 07 07 00 5A 07 00 A8 07 00 1F 01 01 01 07 00 62 FF 00 01 00 05 07 00 03 07 00 62 03 03 07 00 6A 00 08 07 00 5A 07 00 A8 07 00 1F 01 01 01 01 07 00 77 01 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     925    933    Any
        //  925    933    925    933    Any
        //  941    943    3      8      Any
        //  168    174    174    175    Any
        //  168    174    3      8      Ljava/util/NoSuchElementException;
        //  168    174    174    175    Ljava/lang/ArithmeticException;
        //  168    174    3      8      Ljava/lang/RuntimeException;
        //  168    174    3      8      Any
        //  265    271    271    272    Any
        //  265    271    3      8      Any
        //  265    271    271    272    Ljava/lang/EnumConstantNotPresentException;
        //  265    271    3      8      Any
        //  265    271    271    272    Ljava/lang/NegativeArraySizeException;
        //  328    335    335    336    Any
        //  328    335    335    336    Any
        //  328    335    3      8      Ljava/util/NoSuchElementException;
        //  329    335    328    329    Any
        //  329    335    3      8      Ljava/lang/ArithmeticException;
        //  342    349    349    350    Any
        //  343    349    342    343    Any
        //  343    349    349    350    Ljava/lang/StringIndexOutOfBoundsException;
        //  342    349    3      8      Ljava/lang/RuntimeException;
        //  343    349    3      8      Ljava/lang/ClassCastException;
        //  411    418    418    419    Any
        //  412    418    418    419    Any
        //  411    418    418    419    Any
        //  412    418    418    419    Any
        //  412    418    411    412    Any
        //  427    434    434    435    Any
        //  427    434    427    428    Ljava/lang/UnsupportedOperationException;
        //  427    434    434    435    Ljava/lang/AssertionError;
        //  427    434    427    428    Any
        //  428    434    434    435    Any
        //  527    534    534    535    Any
        //  527    534    534    535    Ljava/lang/NullPointerException;
        //  527    534    527    528    Ljava/lang/UnsupportedOperationException;
        //  528    534    527    528    Ljava/lang/NegativeArraySizeException;
        //  527    534    3      8      Any
        //  544    550    550    551    Any
        //  544    550    3      8      Any
        //  544    550    3      8      Any
        //  544    550    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  544    550    3      8      Any
        //  603    610    610    611    Any
        //  603    610    610    611    Ljava/util/NoSuchElementException;
        //  604    610    603    604    Ljava/lang/StringIndexOutOfBoundsException;
        //  603    610    610    611    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  604    610    603    604    Ljava/lang/EnumConstantNotPresentException;
        //  614    621    621    622    Any
        //  614    621    621    622    Ljava/util/ConcurrentModificationException;
        //  614    621    614    615    Any
        //  615    621    621    622    Any
        //  614    621    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  630    637    637    638    Any
        //  630    637    630    631    Any
        //  630    637    630    631    Any
        //  631    637    3      8      Any
        //  631    637    637    638    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  688    694    694    695    Any
        //  688    694    694    695    Any
        //  688    694    694    695    Ljava/lang/IndexOutOfBoundsException;
        //  688    694    694    695    Ljava/util/ConcurrentModificationException;
        //  688    694    3      8      Any
        //  805    812    812    813    Any
        //  805    812    812    813    Ljava/lang/ClassCastException;
        //  806    812    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  805    812    805    806    Any
        //  806    812    812    813    Any
        //  863    870    870    871    Any
        //  863    870    3      8      Any
        //  864    870    863    864    Any
        //  864    870    870    871    Ljava/lang/IllegalArgumentException;
        //  863    870    3      8      Any
        //  879    886    886    887    Any
        //  880    886    879    880    Ljava/lang/IndexOutOfBoundsException;
        //  879    886    3      8      Ljava/lang/IllegalStateException;
        //  880    886    3      8      Ljava/lang/ArithmeticException;
        //  879    886    879    880    Any
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
    
    public f0J(@NotNull final f0h f0h) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = -447430303;
                    break Label_0013;
                }
                n = 1885865074;
            }
            switch (n ^ 0xDF6BA51F) {
                case 451991492: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0059: {
                            if (fc.0 != 0) {
                                n2 = 1539813160;
                                break Label_0059;
                            }
                            n2 = 1944270213;
                        }
                        switch (n2 ^ 0x38DB7C93) {
                            case -1576753862: {
                                continue;
                            }
                            default: {
                                super(f0h);
                                while (true) {
                                    int n3 = 0;
                                    Label_0109: {
                                        if (fc.c < 0) {
                                            n3 = 1560919280;
                                            break Label_0109;
                                        }
                                        n3 = -1859439310;
                                    }
                                    switch (n3 ^ 0x2F430341) {
                                        case 1917501361: {
                                            continue;
                                        }
                                        case -1100466573: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0154: {
                                                    if (fc.1 != 0) {
                                                        n4 = 1207973859;
                                                        break Label_0154;
                                                    }
                                                    n4 = -323348995;
                                                }
                                                switch (n4 ^ 0x66AD53E1) {
                                                    case 783115266: {
                                                        continue;
                                                    }
                                                    case -1978186212: {
                                                        this.c = f0h.c();
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0205: {
                                                                if (fc.1 != 0) {
                                                                    n5 = -1072055164;
                                                                    break Label_0205;
                                                                }
                                                                n5 = -1469759719;
                                                            }
                                                            switch (n5 ^ 0x2A69FE1E) {
                                                                case -361741670: {
                                                                    continue;
                                                                }
                                                                case -2113093369: {
                                                                    this.c = (fw<Integer>)f0h.5();
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
                                                    default: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        default: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1662833595: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 977233022: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void 0(@NotNull final f0w f0w, @NotNull final f0y f0y, @NotNull final f0Z f0Z) {
        fbS.4P(this, 760661344, f0w, f0y, f0Z);
    }
    
    @Override
    public void 1() {
        fbS.df(this, 73643101);
    }
    
    @NotNull
    public String c(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          131
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            123
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            115
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             2144647699
        //    32: goto            37
        //    35: ldc             -600402479
        //    37: ldc             -1637192892
        //    39: ixor           
        //    40: lookupswitch {
        //          -2127948392: 35
        //          -507588265: 104
        //          default: 68
        //        }
        //    68: iload_1        
        //    69: iconst_m1      
        //    70: if_icmpne       89
        //    73: ldc             "\u2326\u14bc\u8a2f\ub1ed"
        //    75: goto            79
        //    78: athrow         
        //    79: invokestatic    invokestatic   !!! ERROR
        //    82: goto            86
        //    85: athrow         
        //    86: goto            103
        //    89: iload_1        
        //    90: goto            94
        //    93: athrow         
        //    94: invokestatic    org/lwjgl/input/Keyboard.getKeyName:(I)Ljava/lang/String;
        //    97: goto            101
        //   100: athrow         
        //   101: dup            
        //   102: pop            
        //   103: areturn        
        //   104: aconst_null    
        //   105: athrow         
        //   106: pop            
        //   107: goto            24
        //   110: pop            
        //   111: aconst_null    
        //   112: goto            106
        //   115: dup            
        //   116: ifnull          106
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: athrow         
        //   123: dup            
        //   124: ifnull          110
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: aconst_null    
        //   132: athrow         
        //    StackMapTable: 00 17 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FD 00 03 07 00 03 01 0A 41 01 1E 49 07 00 47 40 07 00 1F 45 07 00 47 40 07 00 1F 02 43 07 00 3B 40 01 45 07 00 47 40 07 00 1F 41 07 00 1F 00 41 07 00 2B 43 05 44 07 00 2B 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     115    123    Ljava/lang/ClassCastException;
        //  115    123    115    123    Ljava/lang/NullPointerException;
        //  131    133    3      8      Ljava/lang/UnsupportedOperationException;
        //  78     85     85     86     Any
        //  78     85     78     79     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  79     85     3      8      Ljava/lang/NullPointerException;
        //  79     85     78     79     Any
        //  78     85     85     86     Any
        //  93     100    100    101    Any
        //  94     100    3      8      Any
        //  94     100    3      8      Ljava/util/NoSuchElementException;
        //  94     100    93     94     Ljava/lang/IndexOutOfBoundsException;
        //  93     100    100    101    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    @Override
    public void c(final char p0, final int p1) {
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
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             870721385
        //    33: goto            38
        //    36: ldc             -1291983837
        //    38: ldc             -1643091926
        //    40: ixor           
        //    41: lookupswitch {
        //          -1376366781: 36
        //          753765385: 68
        //          default: 300
        //        }
        //    68: getfield        dev/nuker/pyro/f0J.c:Z
        //    71: ifeq            79
        //    74: ldc             1959281944
        //    76: goto            81
        //    79: ldc             1959281945
        //    81: ldc             800734098
        //    83: ixor           
        //    84: tableswitch {
        //          -1226506988: 108
        //          -1226506987: 295
        //          default: 74
        //        }
        //   108: iload_2        
        //   109: bipush          14
        //   111: if_icmpne       119
        //   114: ldc             -412338778
        //   116: goto            121
        //   119: ldc             -412338777
        //   121: ldc             1747853968
        //   123: ixor           
        //   124: tableswitch {
        //          511979116: 148
        //          511979117: 221
        //          default: 114
        //        }
        //   148: aload_0        
        //   149: getstatic       dev/nuker/pyro/fc.1:I
        //   152: ifeq            160
        //   155: ldc             330100918
        //   157: goto            162
        //   160: ldc             834457156
        //   162: ldc             353497265
        //   164: ixor           
        //   165: lookupswitch {
        //          113049607: 160
        //          615333621: 192
        //          default: 296
        //        }
        //   192: getfield        dev/nuker/pyro/f0J.c:Ldev/nuker/pyro/fw;
        //   195: iconst_m1      
        //   196: goto            200
        //   199: athrow         
        //   200: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   203: goto            207
        //   206: athrow         
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   214: goto            218
        //   217: athrow         
        //   218: goto            248
        //   221: aload_0        
        //   222: getfield        dev/nuker/pyro/f0J.c:Ldev/nuker/pyro/fw;
        //   225: iload_2        
        //   226: goto            230
        //   229: athrow         
        //   230: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   233: goto            237
        //   236: athrow         
        //   237: goto            241
        //   240: athrow         
        //   241: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   244: goto            248
        //   247: athrow         
        //   248: aload_0        
        //   249: iconst_0       
        //   250: getstatic       dev/nuker/pyro/fc.0:I
        //   253: ifeq            261
        //   256: ldc             48977103
        //   258: goto            263
        //   261: ldc             -802345940
        //   263: ldc             1009708768
        //   265: ixor           
        //   266: lookupswitch {
        //          -335297844: 292
        //          1053145647: 261
        //          default: 298
        //        }
        //   292: putfield        dev/nuker/pyro/f0J.c:Z
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
        //    StackMapTable: 00 2F 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FE 00 03 07 00 03 01 01 4B 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 5D 07 00 03 05 04 41 01 1A 05 04 41 01 1A 4B 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 5D 07 00 03 46 07 00 47 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 01 45 07 00 47 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 07 00 F2 42 07 00 47 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 07 00 F2 45 07 00 47 00 02 47 07 00 E4 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 01 45 07 00 47 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 07 00 F2 42 07 00 37 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 21 07 00 F2 45 07 00 47 00 FF 00 0C 00 03 07 00 03 01 01 00 02 07 00 03 01 FF 00 01 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 1C 00 03 07 00 03 01 01 00 02 07 00 03 01 02 40 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 41 07 00 03 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     311    319    Any
        //  311    319    311    319    Any
        //  327    329    3      8      Ljava/lang/NegativeArraySizeException;
        //  199    206    206    207    Any
        //  199    206    199    200    Any
        //  200    206    199    200    Ljava/util/ConcurrentModificationException;
        //  199    206    206    207    Ljava/lang/IllegalArgumentException;
        //  199    206    206    207    Ljava/lang/RuntimeException;
        //  210    217    217    218    Any
        //  211    217    217    218    Ljava/util/ConcurrentModificationException;
        //  210    217    210    211    Any
        //  211    217    210    211    Ljava/lang/IllegalStateException;
        //  210    217    217    218    Ljava/lang/ClassCastException;
        //  229    236    236    237    Any
        //  230    236    3      8      Any
        //  229    236    229    230    Ljava/lang/NumberFormatException;
        //  229    236    236    237    Ljava/lang/IndexOutOfBoundsException;
        //  230    236    3      8      Any
        //  240    247    247    248    Any
        //  240    247    247    248    Any
        //  240    247    3      8      Any
        //  241    247    247    248    Ljava/lang/AssertionError;
        //  241    247    240    241    Ljava/lang/AssertionError;
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
    
    @Override
    public int 0(@NotNull final f0w p0, @NotNull final f0y p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          385
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            377
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            369
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             1713571158
        //    34: goto            39
        //    37: ldc             -37950899
        //    39: ldc_w           483407300
        //    42: ixor           
        //    43: lookupswitch {
        //          2062758034: 354
        //          2146502942: 37
        //          default: 68
        //        }
        //    68: aload_2        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            82
        //    76: ldc_w           1559236575
        //    79: goto            85
        //    82: ldc_w           -16748284
        //    85: ldc_w           427462723
        //    88: ixor           
        //    89: lookupswitch {
        //          -2015164909: 82
        //          1166712732: 350
        //          default: 116
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   124: goto            128
        //   127: athrow         
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: goto            136
        //   135: athrow         
        //   136: invokespecial   java/lang/StringBuilder.<init>:()V
        //   139: goto            143
        //   142: athrow         
        //   143: getstatic       dev/nuker/pyro/fc.0:I
        //   146: ifeq            155
        //   149: ldc_w           1782328855
        //   152: goto            158
        //   155: ldc_w           -1052561638
        //   158: ldc_w           1417713605
        //   161: ixor           
        //   162: lookupswitch {
        //          155124578: 155
        //          1052555730: 356
        //          default: 188
        //        }
        //   188: aload_0        
        //   189: getfield        dev/nuker/pyro/f0J.c:Ljava/lang/String;
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: goto            203
        //   202: athrow         
        //   203: ldc_w           "\u2348\u14d3\u8a41\ub1db\ucef9\ued4e\ub264\ue66c\udb6a\uee8a\ua78e"
        //   206: goto            210
        //   209: athrow         
        //   210: invokestatic    invokestatic   !!! ERROR
        //   213: goto            217
        //   216: athrow         
        //   217: getstatic       dev/nuker/pyro/fc.c:I
        //   220: ifge            229
        //   223: ldc_w           -1219365911
        //   226: goto            232
        //   229: ldc_w           2117303861
        //   232: ldc_w           -1265910450
        //   235: ixor           
        //   236: lookupswitch {
        //          -893860997: 264
        //          64638631: 229
        //          default: 352
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: goto            275
        //   274: athrow         
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   282: goto            286
        //   285: athrow         
        //   286: getstatic       dev/nuker/pyro/fc.1:I
        //   289: ifeq            298
        //   292: ldc_w           1795430696
        //   295: goto            301
        //   298: ldc_w           706194370
        //   301: ldc_w           1923211142
        //   304: ixor           
        //   305: lookupswitch {
        //          -2058119706: 298
        //          430294702: 358
        //          default: 332
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //   339: goto            343
        //   342: athrow         
        //   343: getstatic       dev/nuker/pyro/f0y.c:I
        //   346: iconst_2       
        //   347: imul           
        //   348: iadd           
        //   349: ireturn        
        //   350: aconst_null    
        //   351: athrow         
        //   352: aconst_null    
        //   353: athrow         
        //   354: aconst_null    
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //   358: aconst_null    
        //   359: athrow         
        //   360: pop            
        //   361: goto            24
        //   364: pop            
        //   365: aconst_null    
        //   366: goto            360
        //   369: dup            
        //   370: ifnull          360
        //   373: checkcast       Ljava/lang/Throwable;
        //   376: athrow         
        //   377: dup            
        //   378: ifnull          364
        //   381: checkcast       Ljava/lang/Throwable;
        //   384: athrow         
        //   385: aconst_null    
        //   386: athrow         
        //    StackMapTable: 00 39 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FE 00 03 07 00 03 07 00 62 07 00 6A 0C 41 01 1C 0D 42 01 1E 43 07 00 47 40 07 00 62 45 07 00 47 40 07 00 A8 46 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 08 00 80 08 00 80 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 FF 00 0B 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 FF 00 02 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 01 FF 00 1D 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 46 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F FF 00 0B 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F FF 00 02 00 03 07 00 03 07 00 62 07 00 6A 00 04 07 00 A8 07 01 05 07 00 1F 01 FF 00 1F 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F 42 07 00 2B FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 42 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 00 1F FF 00 0B 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 00 1F FF 00 02 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 00 1F 01 FF 00 1E 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 00 1F 42 07 00 47 FF 00 00 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 00 1F 45 07 00 47 40 01 06 FF 00 01 00 03 07 00 03 07 00 62 07 00 6A 00 03 07 00 A8 07 01 05 07 00 1F 01 FF 00 01 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 01 05 FF 00 01 00 03 07 00 03 07 00 62 07 00 6A 00 02 07 00 A8 07 00 1F 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     369    377    Any
        //  369    377    369    377    Any
        //  385    387    3      8      Any
        //  120    127    127    128    Any
        //  120    127    120    121    Ljava/lang/UnsupportedOperationException;
        //  120    127    3      8      Ljava/lang/IllegalStateException;
        //  120    127    120    121    Any
        //  121    127    120    121    Any
        //  135    142    142    143    Any
        //  136    142    142    143    Ljava/lang/IllegalStateException;
        //  136    142    135    136    Any
        //  136    142    135    136    Ljava/util/NoSuchElementException;
        //  136    142    142    143    Ljava/util/NoSuchElementException;
        //  195    202    202    203    Any
        //  195    202    195    196    Any
        //  195    202    202    203    Ljava/lang/UnsupportedOperationException;
        //  195    202    195    196    Any
        //  195    202    195    196    Ljava/util/NoSuchElementException;
        //  209    216    216    217    Any
        //  210    216    216    217    Ljava/lang/EnumConstantNotPresentException;
        //  209    216    209    210    Any
        //  210    216    216    217    Any
        //  210    216    209    210    Any
        //  267    274    274    275    Any
        //  267    274    274    275    Ljava/lang/NumberFormatException;
        //  268    274    3      8      Ljava/lang/NumberFormatException;
        //  268    274    274    275    Any
        //  267    274    267    268    Ljava/lang/RuntimeException;
        //  278    285    285    286    Any
        //  278    285    3      8      Ljava/lang/NegativeArraySizeException;
        //  279    285    3      8      Ljava/lang/AssertionError;
        //  279    285    278    279    Any
        //  278    285    3      8      Ljava/lang/AssertionError;
        //  335    342    342    343    Any
        //  336    342    3      8      Any
        //  335    342    335    336    Any
        //  336    342    335    336    Any
        //  335    342    342    343    Ljava/lang/IndexOutOfBoundsException;
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
    public int c(@NotNull final f0w f0w, @NotNull final f0y f0y) {
        return fbS.93(this, 6907568, f0w, f0y);
    }
}
