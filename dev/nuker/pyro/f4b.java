// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4B extends f4C
{
    public float[] c;
    public String 0;
    
    public float 0() {
        return fbS.ar(this, 828162592);
    }
    
    @Override
    public String 2() {
        return fbS.5h(this, 1426987074);
    }
    
    @f06
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1065
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1057
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1049
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f4B.c:Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    30: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    33: getstatic       dev/nuker/pyro/f4B.c:Lnet/minecraft/client/Minecraft;
        //    36: getstatic       dev/nuker/pyro/fc.1:I
        //    39: ifeq            47
        //    42: ldc             633110090
        //    44: goto            49
        //    47: ldc             607552953
        //    49: ldc             1137984739
        //    51: ixor           
        //    52: lookupswitch {
        //          1031389914: 47
        //          1718106793: 1030
        //          default: 80
        //        }
        //    80: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    83: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70169_q:D
        //    86: dsub           
        //    87: getstatic       dev/nuker/pyro/fc.c:I
        //    90: ifge            98
        //    93: ldc             1085514394
        //    95: goto            100
        //    98: ldc             -625101678
        //   100: ldc             613895088
        //   102: ixor           
        //   103: lookupswitch {
        //          -30736606: 128
        //          1680140586: 98
        //          default: 1024
        //        }
        //   128: dstore_2       
        //   129: getstatic       dev/nuker/pyro/f4B.c:Lnet/minecraft/client/Minecraft;
        //   132: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   135: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            149
        //   144: ldc             915002992
        //   146: goto            151
        //   149: ldc             -1232517402
        //   151: ldc             548373517
        //   153: ixor           
        //   154: lookupswitch {
        //          -1775844629: 180
        //          371610237: 149
        //          default: 1018
        //        }
        //   180: getstatic       dev/nuker/pyro/f4B.c:Lnet/minecraft/client/Minecraft;
        //   183: getstatic       dev/nuker/pyro/fc.0:I
        //   186: ifeq            194
        //   189: ldc             423024054
        //   191: goto            196
        //   194: ldc             -1691435528
        //   196: ldc             1458260298
        //   198: ixor           
        //   199: lookupswitch {
        //          1339923708: 1012
        //          1416870330: 194
        //          default: 224
        //        }
        //   224: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   227: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70166_s:D
        //   230: dsub           
        //   231: dstore          4
        //   233: dload_2        
        //   234: dload_2        
        //   235: dmul           
        //   236: getstatic       dev/nuker/pyro/fc.0:I
        //   239: ifeq            247
        //   242: ldc             1293772550
        //   244: goto            249
        //   247: ldc             -367556576
        //   249: ldc             -1066649650
        //   251: ixor           
        //   252: lookupswitch {
        //          -1921953592: 247
        //          712753134: 280
        //          default: 1014
        //        }
        //   280: dload           4
        //   282: dload           4
        //   284: dmul           
        //   285: dadd           
        //   286: goto            290
        //   289: athrow         
        //   290: invokestatic    java/lang/Math.sqrt:(D)D
        //   293: goto            297
        //   296: athrow         
        //   297: getstatic       dev/nuker/pyro/fc.c:I
        //   300: ifge            308
        //   303: ldc             -1317565344
        //   305: goto            310
        //   308: ldc             1464608108
        //   310: ldc             1649786755
        //   312: ixor           
        //   313: lookupswitch {
        //          -752733213: 1022
        //          1661057497: 308
        //          default: 340
        //        }
        //   340: dstore          6
        //   342: ldc             3600.0
        //   344: ldc             50.0
        //   346: getstatic       dev/nuker/pyro/f4B.c:Lnet/minecraft/client/Minecraft;
        //   349: checkcast       Ldev/nuker/pyro/mixin/MinecraftAccessor;
        //   352: goto            356
        //   355: athrow         
        //   356: invokeinterface dev/nuker/pyro/mixin/MinecraftAccessor.getTimer:()Lnet/minecraft/util/Timer;
        //   361: goto            365
        //   364: athrow         
        //   365: checkcast       Ldev/nuker/pyro/mixin/TimerAccessor;
        //   368: goto            372
        //   371: athrow         
        //   372: invokeinterface dev/nuker/pyro/mixin/TimerAccessor.getTickLength:()F
        //   377: goto            381
        //   380: athrow         
        //   381: fdiv           
        //   382: fmul           
        //   383: getstatic       dev/nuker/pyro/fc.1:I
        //   386: ifeq            394
        //   389: ldc             -847424368
        //   391: goto            396
        //   394: ldc             -563182046
        //   396: ldc             -636777447
        //   398: ixor           
        //   399: lookupswitch {
        //          73730619: 424
        //          393664649: 394
        //          default: 1034
        //        }
        //   424: fstore          8
        //   426: dload           6
        //   428: ldc2_w          1000.0
        //   431: ddiv           
        //   432: ldc             0.05
        //   434: fload           8
        //   436: fdiv           
        //   437: f2d            
        //   438: ddiv           
        //   439: goto            443
        //   442: athrow         
        //   443: invokestatic    java/lang/Math.floor:(D)D
        //   446: goto            450
        //   449: athrow         
        //   450: dstore          9
        //   452: iconst_0       
        //   453: istore          11
        //   455: iload           11
        //   457: aload_0        
        //   458: getstatic       dev/nuker/pyro/fc.1:I
        //   461: ifeq            469
        //   464: ldc             -1707983595
        //   466: goto            471
        //   469: ldc             -2004884847
        //   471: ldc             998374138
        //   473: ixor           
        //   474: lookupswitch {
        //          -1582053393: 1008
        //          -561948347: 469
        //          default: 500
        //        }
        //   500: getfield        dev/nuker/pyro/f4B.c:[F
        //   503: arraylength    
        //   504: iconst_1       
        //   505: isub           
        //   506: if_icmpge       660
        //   509: getstatic       dev/nuker/pyro/fc.0:I
        //   512: ifeq            520
        //   515: ldc             1736458516
        //   517: goto            522
        //   520: ldc             -1613696112
        //   522: ldc             1381379850
        //   524: ixor           
        //   525: lookupswitch {
        //          -1145705550: 520
        //          903245342: 1036
        //          default: 552
        //        }
        //   552: aload_0        
        //   553: getfield        dev/nuker/pyro/f4B.c:[F
        //   556: getstatic       dev/nuker/pyro/fc.1:I
        //   559: ifeq            567
        //   562: ldc             -1657613520
        //   564: goto            569
        //   567: ldc             2072771555
        //   569: ldc             -294932686
        //   571: ixor           
        //   572: lookupswitch {
        //          -1780460335: 600
        //          1935244290: 567
        //          default: 1016
        //        }
        //   600: iload           11
        //   602: aload_0        
        //   603: getfield        dev/nuker/pyro/f4B.c:[F
        //   606: getstatic       dev/nuker/pyro/fc.1:I
        //   609: ifeq            617
        //   612: ldc             -1163056859
        //   614: goto            619
        //   617: ldc             1723389849
        //   619: ldc             480433087
        //   621: ixor           
        //   622: lookupswitch {
        //          -1508902246: 1010
        //          -834613648: 617
        //          default: 648
        //        }
        //   648: iload           11
        //   650: iconst_1       
        //   651: iadd           
        //   652: faload         
        //   653: fastore        
        //   654: iinc            11, 1
        //   657: goto            455
        //   660: aload_0        
        //   661: getfield        dev/nuker/pyro/f4B.c:[F
        //   664: getstatic       dev/nuker/pyro/fc.0:I
        //   667: ifeq            675
        //   670: ldc             -935435436
        //   672: goto            677
        //   675: ldc             1571797625
        //   677: ldc             2132130897
        //   679: ixor           
        //   680: lookupswitch {
        //          -1221861627: 675
        //          582616616: 708
        //          default: 1020
        //        }
        //   708: aload_0        
        //   709: getfield        dev/nuker/pyro/f4B.c:[F
        //   712: arraylength    
        //   713: iconst_1       
        //   714: isub           
        //   715: getstatic       dev/nuker/pyro/fc.c:I
        //   718: ifge            726
        //   721: ldc             -1070317919
        //   723: goto            728
        //   726: ldc             -3979141
        //   728: ldc             1757803361
        //   730: ixor           
        //   731: lookupswitch {
        //          -1724028310: 726
        //          -1460548160: 1028
        //          default: 756
        //        }
        //   756: dload           9
        //   758: d2f            
        //   759: fastore        
        //   760: aload_0        
        //   761: new             Ljava/lang/StringBuilder;
        //   764: dup            
        //   765: ldc             "\u23af\u1483\u8a88\ub1cd\ucfe6\uedda"
        //   767: goto            771
        //   770: athrow         
        //   771: invokestatic    invokestatic   !!! ERROR
        //   774: goto            778
        //   777: athrow         
        //   778: goto            782
        //   781: athrow         
        //   782: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   785: goto            789
        //   788: athrow         
        //   789: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   792: goto            796
        //   795: athrow         
        //   796: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   799: goto            803
        //   802: athrow         
        //   803: ldc             "\u23d9\u14dd\u8adf\ub1ce\ucfa2\ued91\ub229\ue6ef\udb71"
        //   805: goto            809
        //   808: athrow         
        //   809: invokestatic    invokestatic   !!! ERROR
        //   812: goto            816
        //   815: athrow         
        //   816: iconst_1       
        //   817: anewarray       Ljava/lang/Object;
        //   820: dup            
        //   821: iconst_0       
        //   822: aload_0        
        //   823: goto            827
        //   826: athrow         
        //   827: invokespecial   dev/nuker/pyro/f4B.0:()F
        //   830: goto            834
        //   833: athrow         
        //   834: goto            838
        //   837: athrow         
        //   838: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   841: goto            845
        //   844: athrow         
        //   845: aastore        
        //   846: getstatic       dev/nuker/pyro/fc.c:I
        //   849: ifge            857
        //   852: ldc             892752648
        //   854: goto            859
        //   857: ldc             2141650932
        //   859: ldc             2040101476
        //   861: ixor           
        //   862: lookupswitch {
        //          1286547820: 1026
        //          1720691733: 857
        //          default: 888
        //        }
        //   888: goto            892
        //   891: athrow         
        //   892: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   895: goto            899
        //   898: athrow         
        //   899: goto            903
        //   902: athrow         
        //   903: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   906: goto            910
        //   909: athrow         
        //   910: getstatic       dev/nuker/pyro/fc.0:I
        //   913: ifeq            921
        //   916: ldc             821555000
        //   918: goto            923
        //   921: ldc             262727466
        //   923: ldc             442173930
        //   925: ixor           
        //   926: lookupswitch {
        //          368307904: 952
        //          715974354: 921
        //          default: 1038
        //        }
        //   952: goto            956
        //   955: athrow         
        //   956: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   959: goto            963
        //   962: athrow         
        //   963: getstatic       dev/nuker/pyro/fc.0:I
        //   966: ifeq            974
        //   969: ldc             -2114354760
        //   971: goto            976
        //   974: ldc             -698010684
        //   976: ldc             -1412382059
        //   978: ixor           
        //   979: lookupswitch {
        //          707347245: 1032
        //          783948051: 974
        //          default: 1004
        //        }
        //  1004: putfield        dev/nuker/pyro/f4B.0:Ljava/lang/String;
        //  1007: return         
        //  1008: aconst_null    
        //  1009: athrow         
        //  1010: aconst_null    
        //  1011: athrow         
        //  1012: aconst_null    
        //  1013: athrow         
        //  1014: aconst_null    
        //  1015: athrow         
        //  1016: aconst_null    
        //  1017: athrow         
        //  1018: aconst_null    
        //  1019: athrow         
        //  1020: aconst_null    
        //  1021: athrow         
        //  1022: aconst_null    
        //  1023: athrow         
        //  1024: aconst_null    
        //  1025: athrow         
        //  1026: aconst_null    
        //  1027: athrow         
        //  1028: aconst_null    
        //  1029: athrow         
        //  1030: aconst_null    
        //  1031: athrow         
        //  1032: aconst_null    
        //  1033: athrow         
        //  1034: aconst_null    
        //  1035: athrow         
        //  1036: aconst_null    
        //  1037: athrow         
        //  1038: aconst_null    
        //  1039: athrow         
        //  1040: pop            
        //  1041: goto            24
        //  1044: pop            
        //  1045: aconst_null    
        //  1046: goto            1040
        //  1049: dup            
        //  1050: ifnull          1040
        //  1053: checkcast       Ljava/lang/Throwable;
        //  1056: athrow         
        //  1057: dup            
        //  1058: ifnull          1044
        //  1061: checkcast       Ljava/lang/Throwable;
        //  1064: athrow         
        //  1065: aconst_null    
        //  1066: athrow         
        //    StackMapTable: 00 7F FF 00 03 00 04 07 00 03 07 00 D4 03 03 00 01 07 00 39 F9 00 04 FF 00 0B 00 00 00 01 07 00 39 FD 00 03 07 00 03 07 00 D4 FF 00 16 00 02 07 00 03 07 00 D4 00 02 03 07 00 3E FF 00 01 00 02 07 00 03 07 00 D4 00 03 03 07 00 3E 01 FF 00 1E 00 02 07 00 03 07 00 D4 00 02 03 07 00 3E 51 03 FF 00 01 00 02 07 00 03 07 00 D4 00 02 03 01 5B 03 FF 00 14 00 03 07 00 03 07 00 D4 03 00 01 03 FF 00 01 00 03 07 00 03 07 00 D4 03 00 02 03 01 5C 03 FF 00 0D 00 03 07 00 03 07 00 D4 03 00 02 03 07 00 3E FF 00 01 00 03 07 00 03 07 00 D4 03 00 03 03 07 00 3E 01 FF 00 1B 00 03 07 00 03 07 00 D4 03 00 02 03 07 00 3E FF 00 16 00 04 07 00 03 07 00 D4 03 03 00 01 03 FF 00 01 00 04 07 00 03 07 00 D4 03 03 00 02 03 01 5E 03 48 07 00 20 40 03 45 07 00 39 40 03 4A 03 FF 00 01 00 04 07 00 03 07 00 D4 03 03 00 02 03 01 5D 03 FF 00 0E 00 05 07 00 03 07 00 D4 03 03 03 00 01 07 00 24 FF 00 00 00 05 07 00 03 07 00 D4 03 03 03 00 03 02 02 07 00 72 47 07 00 39 FF 00 00 00 05 07 00 03 07 00 D4 03 03 03 00 03 02 02 07 00 D6 45 07 00 39 FF 00 00 00 05 07 00 03 07 00 D4 03 03 03 00 03 02 02 07 00 78 47 07 00 39 FF 00 00 00 05 07 00 03 07 00 D4 03 03 03 00 03 02 02 02 4C 02 FF 00 01 00 05 07 00 03 07 00 D4 03 03 03 00 02 02 01 5B 02 FF 00 11 00 06 07 00 03 07 00 D4 03 03 03 02 00 01 07 00 1E 40 03 45 07 00 39 40 03 FD 00 04 03 01 FF 00 0D 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 01 07 00 03 01 FF 00 1C 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 01 07 00 03 13 41 01 1D 4E 07 00 D7 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 D7 01 5E 07 00 D7 FF 00 10 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 D7 01 07 00 D7 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 D7 01 07 00 D7 01 FF 00 1C 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 D7 01 07 00 D7 0B 4E 07 00 D7 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 D7 01 5E 07 00 D7 FF 00 11 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 D7 01 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 D7 01 01 FF 00 1B 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 D7 01 4D 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 08 02 F9 08 02 F9 07 00 C0 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 08 02 F9 08 02 F9 07 00 C0 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 08 02 F9 08 02 F9 07 00 C0 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 07 00 A7 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A 44 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 07 00 C0 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 07 00 C0 FF 00 09 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 07 07 00 03 07 00 9A 07 00 C0 07 00 D9 07 00 D9 01 07 00 03 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 07 07 00 03 07 00 9A 07 00 C0 07 00 D9 07 00 D9 01 02 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 07 07 00 03 07 00 9A 07 00 C0 07 00 D9 07 00 D9 01 02 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 07 07 00 03 07 00 9A 07 00 C0 07 00 D9 07 00 D9 01 07 00 B7 FF 00 0B 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 07 00 9A 07 00 C0 07 00 D9 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 05 07 00 03 07 00 9A 07 00 C0 07 00 D9 01 FF 00 1C 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 07 00 9A 07 00 C0 07 00 D9 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 07 00 9A 07 00 C0 07 00 D9 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 07 00 C0 42 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 07 00 C0 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A FF 00 0A 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 9A 01 FF 00 1C 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A 42 07 00 1C FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 C0 FF 00 0A 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 C0 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 03 07 00 C0 01 FF 00 1B 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 C0 FF 00 03 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 03 07 00 D7 01 07 00 D7 FF 00 01 00 03 07 00 03 07 00 D4 03 00 02 03 07 00 3E FF 00 01 00 04 07 00 03 07 00 D4 03 03 00 01 03 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 01 07 00 D7 FF 00 01 00 03 07 00 03 07 00 D4 03 00 01 03 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 01 07 00 D7 FF 00 01 00 04 07 00 03 07 00 D4 03 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 D4 00 01 03 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 04 07 00 03 07 00 9A 07 00 C0 07 00 D9 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 D7 01 FF 00 01 00 02 07 00 03 07 00 D4 00 02 03 07 00 3E FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 C0 FF 00 01 00 05 07 00 03 07 00 D4 03 03 03 00 01 02 FE 00 01 02 03 01 FF 00 01 00 08 07 00 03 07 00 D4 03 03 03 02 03 01 00 02 07 00 03 07 00 9A FF 00 01 00 02 07 00 03 07 00 D4 00 01 07 00 39 43 05 44 07 00 39 47 05 FF 00 07 00 04 07 00 03 07 00 D4 03 03 00 01 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1049   1057   Any
        //  1049   1057   1049   1057   Any
        //  1065   1067   3      8      Any
        //  289    296    296    297    Any
        //  289    296    296    297    Ljava/lang/EnumConstantNotPresentException;
        //  289    296    296    297    Ljava/lang/IllegalStateException;
        //  289    296    289    290    Ljava/lang/ArithmeticException;
        //  290    296    3      8      Any
        //  355    364    364    365    Any
        //  355    364    3      8      Ljava/lang/RuntimeException;
        //  356    364    355    356    Ljava/lang/UnsupportedOperationException;
        //  356    364    3      8      Ljava/lang/NumberFormatException;
        //  356    364    364    365    Ljava/lang/EnumConstantNotPresentException;
        //  371    380    380    381    Any
        //  371    380    371    372    Any
        //  371    380    371    372    Any
        //  371    380    380    381    Any
        //  372    380    380    381    Any
        //  442    449    449    450    Any
        //  443    449    442    443    Ljava/lang/IllegalStateException;
        //  443    449    449    450    Ljava/lang/NullPointerException;
        //  443    449    449    450    Ljava/lang/ArithmeticException;
        //  442    449    449    450    Any
        //  770    777    777    778    Any
        //  770    777    770    771    Ljava/lang/AssertionError;
        //  771    777    770    771    Ljava/util/NoSuchElementException;
        //  770    777    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  770    777    770    771    Ljava/lang/NegativeArraySizeException;
        //  781    788    788    789    Any
        //  782    788    788    789    Any
        //  782    788    781    782    Any
        //  782    788    781    782    Ljava/lang/IllegalStateException;
        //  782    788    3      8      Ljava/lang/NullPointerException;
        //  795    802    802    803    Any
        //  796    802    802    803    Any
        //  796    802    795    796    Any
        //  795    802    795    796    Any
        //  796    802    795    796    Ljava/lang/NumberFormatException;
        //  808    815    815    816    Any
        //  808    815    815    816    Any
        //  809    815    808    809    Any
        //  809    815    815    816    Ljava/lang/EnumConstantNotPresentException;
        //  808    815    808    809    Any
        //  827    833    833    834    Any
        //  827    833    3      8      Any
        //  827    833    3      8      Any
        //  827    833    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  827    833    833    834    Ljava/lang/IllegalStateException;
        //  838    844    844    845    Any
        //  838    844    844    845    Any
        //  838    844    844    845    Any
        //  838    844    844    845    Ljava/lang/RuntimeException;
        //  838    844    3      8      Ljava/lang/ArithmeticException;
        //  891    898    898    899    Any
        //  891    898    891    892    Any
        //  891    898    891    892    Any
        //  892    898    3      8      Any
        //  891    898    3      8      Any
        //  902    909    909    910    Any
        //  903    909    909    910    Any
        //  903    909    909    910    Ljava/util/ConcurrentModificationException;
        //  902    909    902    903    Any
        //  903    909    902    903    Ljava/lang/ArithmeticException;
        //  955    962    962    963    Any
        //  955    962    962    963    Ljava/lang/ArithmeticException;
        //  955    962    962    963    Ljava/lang/NumberFormatException;
        //  956    962    955    956    Ljava/lang/EnumConstantNotPresentException;
        //  956    962    3      8      Any
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
    
    static {
        throw t;
    }
    
    public f4B() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             -180134055
        //     8: goto            13
        //    11: ldc             -63594935
        //    13: ldc             -1189198871
        //    15: ixor           
        //    16: lookupswitch {
        //          -444116487: 11
        //          1281170608: 117
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u238f\u1483\u8a88\ub3dc\uc9f7"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: invokespecial   dev/nuker/pyro/f4C.<init>:(Ljava/lang/String;)V
        //    53: aload_0        
        //    54: bipush          30
        //    56: newarray        F
        //    58: putfield        dev/nuker/pyro/f4B.c:[F
        //    61: aload_0        
        //    62: ldc             "\u23af\u1483\u8a88\ub3dc\uc9f7\uedda\ub274\ue6ee\ud938\ue9c0\ua751\u1e41\ue1cb\uc5af"
        //    64: getstatic       dev/nuker/pyro/fc.c:I
        //    67: ifge            75
        //    70: ldc             970710785
        //    72: goto            77
        //    75: ldc             494757931
        //    77: ldc             -528340707
        //    79: ixor           
        //    80: lookupswitch {
        //          -648415716: 115
        //          1590916410: 75
        //          default: 108
        //        }
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: putfield        dev/nuker/pyro/f4B.0:Ljava/lang/String;
        //   114: return         
        //   115: aconst_null    
        //   116: athrow         
        //   117: aconst_null    
        //   118: athrow         
        //    StackMapTable: 00 08 0B 41 01 1E FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 C0 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 C0 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 C0 FF 00 06 00 01 07 00 03 00 02 07 00 03 07 00 C0 FF 00 01 00 01 06 00 00
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
    public int c(final ScaledResolution scaledResolution, final float n, final float n2) {
        return fbS.9E(this, 1182545334, scaledResolution, n, n2);
    }
}
