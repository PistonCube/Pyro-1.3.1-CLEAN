// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.util.math.Vec3d;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumFacing;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;

public class faZ extends fH
{
    @JvmField
    @NotNull
    public f0a c;
    @NotNull
    public f0g c;
    @NotNull
    public f0a 0;
    @NotNull
    public f0g 0;
    @NotNull
    public f0a 1;
    @NotNull
    public f0f<f4O> c;
    @NotNull
    public f0b c;
    @NotNull
    public f0f<fbH> 0;
    @Nullable
    public BlockPos c;
    public int 1;
    public boolean c;
    public int 2;
    @NotNull
    public static BlockPos[][][][][] c;
    public static faY c;
    
    public faZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             1707493300
        //     8: goto            13
        //    11: ldc             -395914964
        //    13: ldc             851410183
        //    15: ixor           
        //    16: lookupswitch {
        //          -623268821: 44
        //          1467562675: 11
        //          default: 1012
        //        }
        //    44: aload_0        
        //    45: ldc             "\u2918\u1490\u8003\ub3df\uc67e\ue702\ub228\uec2b"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u2938\u1490\u8003\ub3df\uc67e\ue702\ub228\uec2b"
        //    52: getstatic       dev/nuker/pyro/fc.0:I
        //    55: ifeq            63
        //    58: ldc             291390457
        //    60: goto            65
        //    63: ldc             1687719336
        //    65: ldc             396336310
        //    67: ixor           
        //    68: lookupswitch {
        //          113368911: 63
        //          1929842974: 96
        //          default: 1008
        //        }
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: aconst_null    
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: getstatic       dev/nuker/pyro/fc.1:I
        //   107: ifeq            115
        //   110: ldc             -2056402890
        //   112: goto            117
        //   115: ldc             526550923
        //   117: ldc             -511064744
        //   119: ixor           
        //   120: lookupswitch {
        //          -887547474: 115
        //          1692667246: 1010
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: new             Ldev/nuker/pyro/f0a;
        //   152: dup            
        //   153: ldc             "\u2918\u1492\u8004\ub3dc\uc66f\ue70c\ub228\uec24"
        //   155: invokestatic    invokestatic   !!! ERROR
        //   158: ldc             "\u2938\u1492\u8004\ub3dc\uc66f\ue70c\ub228\uec24"
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: ldc             "\u292a\u1487\u8016\ub3dc\uc675\ue71d\ub230\uec6f\ud97c\ue604\uad8d\u1e5c\ueb19\uc5a2\u8e9a\u8393\u57aa\u7dfe\ubd7d\ucfb1\u21f8\uc237\u60ee\u2d5f\ud867\u3f69\u7d6b\u834e\u8017\u832a\u8e0b\ufb33\u7a7d\u9a1a\u143b\ufb88\u497b\u828b\ucac6\uf08b\ubc3b\u41fa\ub317\ub34d\u438e\u800d\u7c6a\uc4cb\u7d48\ue57f\uec3c\u16d4\ue4bd\u3787\u491f\ueb10\u0a59"
        //   165: invokestatic    invokestatic   !!! ERROR
        //   168: iconst_1       
        //   169: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   172: checkcast       Ldev/nuker/pyro/f0n;
        //   175: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   178: checkcast       Ldev/nuker/pyro/f0a;
        //   181: putfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0a;
        //   184: aload_0        
        //   185: getstatic       dev/nuker/pyro/fc.0:I
        //   188: ifeq            196
        //   191: ldc             -28181421
        //   193: goto            198
        //   196: ldc             -1826469242
        //   198: ldc             -2077749838
        //   200: ixor           
        //   201: lookupswitch {
        //          386549556: 228
        //          2054812129: 196
        //          default: 1006
        //        }
        //   228: aload_0        
        //   229: new             Ldev/nuker/pyro/f0g;
        //   232: dup            
        //   233: ldc             "\u291f\u149b\u800b\ub3da\uc673\ue703\ub221\uec3c\ud97b"
        //   235: invokestatic    invokestatic   !!! ERROR
        //   238: ldc             "\u293f\u149b\u800b\ub3da\uc673\ue703\ub221\uec3c\ud97b"
        //   240: invokestatic    invokestatic   !!! ERROR
        //   243: ldc             "\u293c\u149a\u8006\ub3cd\uc670\ue74d\ub22b\uec29\ud928\ue618\uadce\u1e4d\ueb0d\uc5a1\u8e83\u839a\u57a0\u7daa\ubd2d\ucfbb\u21f8\uc22f\u60e4\u2d59\ud87b\u3f63"
        //   245: invokestatic    invokestatic   !!! ERROR
        //   248: iconst_1       
        //   249: iconst_1       
        //   250: getstatic       dev/nuker/pyro/faZ.c:[[[[[Lnet/minecraft/util/math/BlockPos;
        //   253: checkcast       [Ljava/lang/Object;
        //   256: arraylength    
        //   257: iconst_0       
        //   258: bipush          64
        //   260: aconst_null    
        //   261: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   264: checkcast       Ldev/nuker/pyro/f0n;
        //   267: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   270: checkcast       Ldev/nuker/pyro/f0g;
        //   273: putfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0g;
        //   276: aload_0        
        //   277: getstatic       dev/nuker/pyro/fc.c:I
        //   280: ifge            288
        //   283: ldc             1126243357
        //   285: goto            290
        //   288: ldc             1928413548
        //   290: ldc             -1263583454
        //   292: ixor           
        //   293: lookupswitch {
        //          -966885810: 320
        //          -141679809: 288
        //          default: 992
        //        }
        //   320: aload_0        
        //   321: new             Ldev/nuker/pyro/f0a;
        //   324: dup            
        //   325: ldc             "\u2918\u1483\u800e\ub3d0\uc66c"
        //   327: invokestatic    invokestatic   !!! ERROR
        //   330: ldc             "\u2926\u149a\u8006\ub3e9\uc674\ue70c\ub230\uec29\ud967\ue619\uadc0\u1e0c\ueb26\uc5a8\u8e88\u8393"
        //   332: getstatic       dev/nuker/pyro/fc.c:I
        //   335: ifge            343
        //   338: ldc             33865663
        //   340: goto            345
        //   343: ldc             1240243773
        //   345: ldc             376196484
        //   347: ixor           
        //   348: lookupswitch {
        //          342422075: 343
        //          1602278329: 376
        //          default: 1000
        //        }
        //   376: invokestatic    invokestatic   !!! ERROR
        //   379: ldc             "\u2928\u149b\u8003\ub3d7\uc67f\ue708\ub264\uec27\ud967\ue61c\uad8d\u1e4e\ueb07\uc5a8\u8e8f\u839d\u57b7\u7daa\ubd3c\ucfa5\u21fc\uc27b\u60f2\u2d5a\ud868\u3f6d\u7d2e\u8345"
        //   381: getstatic       dev/nuker/pyro/fc.c:I
        //   384: ifge            392
        //   387: ldc             1175308950
        //   389: goto            394
        //   392: ldc             -476983434
        //   394: ldc             -814783847
        //   396: ixor           
        //   397: lookupswitch {
        //          -1990023153: 996
        //          -1764164605: 392
        //          default: 424
        //        }
        //   424: invokestatic    invokestatic   !!! ERROR
        //   427: iconst_0       
        //   428: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   431: checkcast       Ldev/nuker/pyro/f0n;
        //   434: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   437: checkcast       Ldev/nuker/pyro/f0a;
        //   440: getstatic       dev/nuker/pyro/fc.c:I
        //   443: ifge            451
        //   446: ldc             133727706
        //   448: goto            453
        //   451: ldc             -886839438
        //   453: ldc             -2126629720
        //   455: ixor           
        //   456: lookupswitch {
        //          -2033798798: 1002
        //          -637208376: 451
        //          default: 484
        //        }
        //   484: putfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0a;
        //   487: aload_0        
        //   488: aload_0        
        //   489: new             Ldev/nuker/pyro/f0g;
        //   492: dup            
        //   493: ldc             "\u2909\u149f\u800d\ub3da\uc673\ue71e\ub21b\uec3f\ud96d\ue619\uadf2\u1e58\ueb02\uc5a4\u8e87"
        //   495: invokestatic    invokestatic   !!! ERROR
        //   498: ldc             "\u2929\u149f\u800d\ub3da\uc673\ue71e\ub264\uec3f\ud96d\ue619\uad8d\u1e78\ueb02\uc5a4\u8e87"
        //   500: invokestatic    invokestatic   !!! ERROR
        //   503: ldc             "\u2929\u149f\u800d\ub3da\uc673\ue71e\ub264\uec3b\ud967\ue64b\uaddd\u1e40\ueb0a\uc5a4\u8e89\u83d6\u57b4\u7def\ubd2f\ucff7\u21ed\uc232\u60e1\u2d5d"
        //   505: getstatic       dev/nuker/pyro/fc.c:I
        //   508: ifge            516
        //   511: ldc             149443737
        //   513: goto            518
        //   516: ldc             34673640
        //   518: ldc             -1926282049
        //   520: ixor           
        //   521: lookupswitch {
        //          -2050551770: 516
        //          -1891739817: 548
        //          default: 1014
        //        }
        //   548: invokestatic    invokestatic   !!! ERROR
        //   551: iconst_1       
        //   552: iconst_1       
        //   553: bipush          49
        //   555: iconst_0       
        //   556: bipush          64
        //   558: aconst_null    
        //   559: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   562: checkcast       Ldev/nuker/pyro/f0n;
        //   565: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   568: checkcast       Ldev/nuker/pyro/f0g;
        //   571: putfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0g;
        //   574: aload_0        
        //   575: aload_0        
        //   576: new             Ldev/nuker/pyro/f0a;
        //   579: dup            
        //   580: ldc             "\u290f\u1496\u800e\ub3d8\uc661"
        //   582: getstatic       dev/nuker/pyro/fc.1:I
        //   585: ifeq            593
        //   588: ldc             -176537948
        //   590: goto            595
        //   593: ldc             186095113
        //   595: ldc             202027102
        //   597: ixor           
        //   598: lookupswitch {
        //          -888278199: 593
        //          -110063878: 1018
        //          default: 624
        //        }
        //   624: invokestatic    invokestatic   !!! ERROR
        //   627: ldc             "\u292f\u1496\u800e\ub3d8\uc661\ue74d\ub209\uec20\ud96c\ue60e"
        //   629: invokestatic    invokestatic   !!! ERROR
        //   632: ldc             "\u2928\u149b\u8003\ub3d7\uc67f\ue708\ub264\uec2d\ud964\ue604\uadce\u1e47\ueb18\uc5e7\u8e9c\u8393\u57b6\u7daa\ubd29\ucfbe\u21fa\uc230\u60a2\u2d42\ud866\u3f2e\u7d3f\u8348\u8012\u8327\u8e58\ufb72\u7a2d\u9a13\u142c\ufbcc\u497e\u8282\uca89\uf09f\ubc38"
        //   634: invokestatic    invokestatic   !!! ERROR
        //   637: iconst_0       
        //   638: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   641: checkcast       Ldev/nuker/pyro/f0n;
        //   644: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   647: checkcast       Ldev/nuker/pyro/f0a;
        //   650: putfield        dev/nuker/pyro/faZ.1:Ldev/nuker/pyro/f0a;
        //   653: aload_0        
        //   654: aload_0        
        //   655: new             Ldev/nuker/pyro/f0f;
        //   658: dup            
        //   659: ldc             "\u2919\u149c\u8016\ub3d8\uc66c\ue708\ub21b\uec22\ud967\ue60f\uadc8"
        //   661: invokestatic    invokestatic   !!! ERROR
        //   664: ldc             "\u2939\u149c\u8016\ub3d8\uc66c\ue704\ub22b\uec21\ud928\ue626\uadc2\u1e48\ueb0e"
        //   666: invokestatic    invokestatic   !!! ERROR
        //   669: aconst_null    
        //   670: getstatic       dev/nuker/pyro/f4O.1:Ldev/nuker/pyro/f4O;
        //   673: checkcast       Ljava/lang/Enum;
        //   676: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   679: checkcast       Ldev/nuker/pyro/f0n;
        //   682: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   685: checkcast       Ldev/nuker/pyro/f0f;
        //   688: getstatic       dev/nuker/pyro/fc.c:I
        //   691: ifge            699
        //   694: ldc             1563168694
        //   696: goto            701
        //   699: ldc             -1675828812
        //   701: ldc             -1531594177
        //   703: ixor           
        //   704: lookupswitch {
        //          -107367031: 994
        //          1550838987: 699
        //          default: 732
        //        }
        //   732: putfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0f;
        //   735: aload_0        
        //   736: aload_0        
        //   737: new             Ldev/nuker/pyro/f0b;
        //   740: dup            
        //   741: ldc             "\u2908\u149c\u800e\ub3d6\uc66a"
        //   743: getstatic       dev/nuker/pyro/fc.0:I
        //   746: ifeq            754
        //   749: ldc             2143869171
        //   751: goto            756
        //   754: ldc             832555171
        //   756: ldc             292000020
        //   758: ixor           
        //   759: lookupswitch {
        //          1025447835: 754
        //          1856981479: 1004
        //          default: 784
        //        }
        //   784: invokestatic    invokestatic   !!! ERROR
        //   787: ldc             "\u2924\u1485\u8007\ub3cb\uc674\ue70c\ub23d\uec6f\ud94b\ue604\uadc1\u1e43\ueb19"
        //   789: invokestatic    invokestatic   !!! ERROR
        //   792: aconst_null    
        //   793: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   796: iconst_0       
        //   797: iconst_0       
        //   798: sipush          200
        //   801: bipush          50
        //   803: invokevirtual   dev/nuker/pyro/fR.c:(IIII)Ldev/nuker/pyro/fS;
        //   806: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   809: checkcast       Ldev/nuker/pyro/f0n;
        //   812: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   815: checkcast       Ldev/nuker/pyro/f0b;
        //   818: putfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0b;
        //   821: aload_0        
        //   822: aload_0        
        //   823: new             Ldev/nuker/pyro/f0f;
        //   826: dup            
        //   827: ldc             "\u2904\u1485\u8007\ub3cb\uc674\ue70c\ub23d\uec10\ud965\ue604\uadc9\u1e49"
        //   829: getstatic       dev/nuker/pyro/fc.1:I
        //   832: ifeq            840
        //   835: ldc             -2052823957
        //   837: goto            842
        //   840: ldc             -2055054659
        //   842: ldc             1589062260
        //   844: ixor           
        //   845: lookupswitch {
        //          -619491809: 1020
        //          1522274501: 840
        //          default: 872
        //        }
        //   872: invokestatic    invokestatic   !!! ERROR
        //   875: ldc             "\u2924\u1485\u8007\ub3cb\uc674\ue70c\ub23d\uec6f\ud95c\ue612\uaddd\u1e49"
        //   877: invokestatic    invokestatic   !!! ERROR
        //   880: aconst_null    
        //   881: getstatic       dev/nuker/pyro/fbH.0:Ldev/nuker/pyro/fbH;
        //   884: checkcast       Ljava/lang/Enum;
        //   887: getstatic       dev/nuker/pyro/fc.c:I
        //   890: ifge            898
        //   893: ldc             -676641273
        //   895: goto            900
        //   898: ldc             -975999568
        //   900: ldc             20346622
        //   902: ixor           
        //   903: lookupswitch {
        //          -991618226: 928
        //          -694341383: 898
        //          default: 998
        //        }
        //   928: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   931: checkcast       Ldev/nuker/pyro/f0n;
        //   934: invokevirtual   dev/nuker/pyro/faZ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   937: checkcast       Ldev/nuker/pyro/f0f;
        //   940: putfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0f;
        //   943: aload_0        
        //   944: iconst_m1      
        //   945: getstatic       dev/nuker/pyro/fc.1:I
        //   948: ifeq            956
        //   951: ldc             1394673758
        //   953: goto            958
        //   956: ldc             -1050869316
        //   958: ldc             -940651445
        //   960: ixor           
        //   961: lookupswitch {
        //          -1909321390: 956
        //          -1798323179: 1016
        //          default: 988
        //        }
        //   988: putfield        dev/nuker/pyro/faZ.1:I
        //   991: return         
        //   992: aconst_null    
        //   993: athrow         
        //   994: aconst_null    
        //   995: athrow         
        //   996: aconst_null    
        //   997: athrow         
        //   998: aconst_null    
        //   999: athrow         
        //  1000: aconst_null    
        //  1001: athrow         
        //  1002: aconst_null    
        //  1003: athrow         
        //  1004: aconst_null    
        //  1005: athrow         
        //  1006: aconst_null    
        //  1007: athrow         
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
        //    StackMapTable: 00 3C 0B 41 01 1E FF 00 12 00 01 06 00 03 06 07 00 CA 07 00 CA FF 00 01 00 01 06 00 04 06 07 00 CA 07 00 CA 01 FF 00 1E 00 01 06 00 03 06 07 00 CA 07 00 CA FF 00 12 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 6F 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 7B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 16 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA FF 00 0F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA 07 00 CA 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA 07 00 CA FF 00 1A 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 38 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 E9 08 01 E9 07 00 CA 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 E9 08 01 E9 07 00 CA 07 00 CA 07 00 CA 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 E9 08 01 E9 07 00 CA 07 00 CA 07 00 CA FF 00 2C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 40 08 02 40 07 00 CA FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 40 08 02 40 07 00 CA 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 40 08 02 40 07 00 CA FF 00 4A 00 01 07 00 03 00 02 07 00 03 07 00 88 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 88 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 88 FF 00 15 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 E1 08 02 E1 07 00 CA FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 E1 08 02 E1 07 00 CA 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 E1 08 02 E1 07 00 CA FF 00 37 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA FF 00 19 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA 07 00 CA 05 07 00 93 FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA 07 00 CA 05 07 00 93 01 FF 00 1B 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA 07 00 CA 05 07 00 93 FF 00 1B 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 01 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 01 43 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 88 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA 07 00 CA 05 07 00 93 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 41 08 01 41 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 E1 08 02 E1 07 00 CA 41 07 00 03 FF 00 01 00 01 06 00 03 06 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 E9 08 01 E9 07 00 CA 07 00 CA 07 00 CA FF 00 01 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 40 08 02 40 07 00 CA FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 37 08 03 37 07 00 CA
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
    
    @NotNull
    public BlockPos[] c(@NotNull final EnumFacing p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          573
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            565
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            557
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             950271328
        //    34: goto            39
        //    37: ldc             -303849917
        //    39: ldc             253254548
        //    41: ixor           
        //    42: lookupswitch {
        //          -486816297: 68
        //          935044852: 37
        //          default: 540
        //        }
        //    68: getstatic       dev/nuker/pyro/faZ.c:[[[[[Lnet/minecraft/util/math/BlockPos;
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1488987513
        //    79: goto            84
        //    82: ldc             -1770667272
        //    84: ldc             -888812511
        //    86: ixor           
        //    87: lookupswitch {
        //          -1815746216: 82
        //          1567624921: 112
        //          default: 542
        //        }
        //   112: iload_2        
        //   113: aaload         
        //   114: dup            
        //   115: ifnonnull       129
        //   118: goto            122
        //   121: athrow         
        //   122: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   125: goto            129
        //   128: athrow         
        //   129: aload_1        
        //   130: getstatic       dev/nuker/pyro/fc.1:I
        //   133: ifeq            141
        //   136: ldc             1662827055
        //   138: goto            143
        //   141: ldc             -1142788759
        //   143: ldc             -1386313358
        //   145: ixor           
        //   146: lookupswitch {
        //          -834522275: 532
        //          1080501990: 141
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   net/minecraft/util/EnumFacing.func_176745_a:()I
        //   179: goto            183
        //   182: athrow         
        //   183: iconst_2       
        //   184: isub           
        //   185: aaload         
        //   186: dup            
        //   187: ifnonnull       243
        //   190: getstatic       dev/nuker/pyro/fc.0:I
        //   193: ifeq            201
        //   196: ldc             1199503382
        //   198: goto            203
        //   201: ldc             -1865945444
        //   203: ldc             1630581651
        //   205: ixor           
        //   206: lookupswitch {
        //          -235447025: 232
        //          642665349: 201
        //          default: 544
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   239: goto            243
        //   242: athrow         
        //   243: iload_3        
        //   244: ifeq            252
        //   247: ldc             -1530396187
        //   249: goto            254
        //   252: ldc             -1530396188
        //   254: ldc             681833949
        //   256: ixor           
        //   257: tableswitch {
        //          416802928: 280
        //          416802929: 284
        //          default: 247
        //        }
        //   280: iconst_1       
        //   281: goto            285
        //   284: iconst_0       
        //   285: aaload         
        //   286: dup            
        //   287: ifnonnull       301
        //   290: goto            294
        //   293: athrow         
        //   294: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   297: goto            301
        //   300: athrow         
        //   301: getstatic       dev/nuker/pyro/fc.1:I
        //   304: ifeq            312
        //   307: ldc             1350099784
        //   309: goto            314
        //   312: ldc             -280457453
        //   314: ldc             484543885
        //   316: ixor           
        //   317: lookupswitch {
        //          -1260958428: 312
        //          1285123781: 536
        //          default: 344
        //        }
        //   344: aload_0        
        //   345: getstatic       dev/nuker/pyro/fc.0:I
        //   348: ifeq            356
        //   351: ldc             1235052766
        //   353: goto            359
        //   356: ldc_w           1469589859
        //   359: ldc_w           905819872
        //   362: ixor           
        //   363: lookupswitch {
        //          1650827139: 388
        //          2086723134: 356
        //          default: 546
        //        }
        //   388: getfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0a;
        //   391: getstatic       dev/nuker/pyro/fc.0:I
        //   394: ifeq            403
        //   397: ldc_w           136049099
        //   400: goto            406
        //   403: ldc_w           -1078016347
        //   406: ldc_w           -976353053
        //   409: ixor           
        //   410: lookupswitch {
        //          -1876702558: 403
        //          -841615064: 538
        //          default: 436
        //        }
        //   436: goto            440
        //   439: athrow         
        //   440: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   443: goto            447
        //   446: athrow         
        //   447: checkcast       Ljava/lang/Boolean;
        //   450: getstatic       dev/nuker/pyro/fc.0:I
        //   453: ifeq            462
        //   456: ldc_w           963324347
        //   459: goto            465
        //   462: ldc_w           -1276347877
        //   465: ldc_w           -1333942291
        //   468: ixor           
        //   469: lookupswitch {
        //          -1995010474: 462
        //          59891190: 496
        //          default: 534
        //        }
        //   496: goto            500
        //   499: athrow         
        //   500: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   503: goto            507
        //   506: athrow         
        //   507: ifeq            514
        //   510: iconst_1       
        //   511: goto            515
        //   514: iconst_0       
        //   515: aaload         
        //   516: dup            
        //   517: ifnonnull       531
        //   520: goto            524
        //   523: athrow         
        //   524: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   527: goto            531
        //   530: athrow         
        //   531: areturn        
        //   532: aconst_null    
        //   533: athrow         
        //   534: aconst_null    
        //   535: athrow         
        //   536: aconst_null    
        //   537: athrow         
        //   538: aconst_null    
        //   539: athrow         
        //   540: aconst_null    
        //   541: athrow         
        //   542: aconst_null    
        //   543: athrow         
        //   544: aconst_null    
        //   545: athrow         
        //   546: aconst_null    
        //   547: athrow         
        //   548: pop            
        //   549: goto            24
        //   552: pop            
        //   553: aconst_null    
        //   554: goto            548
        //   557: dup            
        //   558: ifnull          548
        //   561: checkcast       Ljava/lang/Throwable;
        //   564: athrow         
        //   565: dup            
        //   566: ifnull          552
        //   569: checkcast       Ljava/lang/Throwable;
        //   572: athrow         
        //   573: aconst_null    
        //   574: athrow         
        //    StackMapTable: 00 4D 43 07 00 CF 04 FF 00 0B 00 00 00 01 07 00 E1 FF 00 03 00 04 07 00 03 07 00 F1 01 01 00 00 0C 41 01 1C 4D 07 01 12 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 12 01 5B 07 01 12 FF 00 08 00 00 00 01 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 01 07 01 14 45 07 00 E1 40 07 01 14 FF 00 0B 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 14 07 00 F1 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 03 07 01 14 07 00 F1 01 FF 00 1C 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 14 07 00 F1 42 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 14 07 00 F1 45 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 14 01 51 07 01 16 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 16 01 5C 07 01 16 42 07 00 CF 40 07 01 16 45 07 00 E1 40 07 01 16 43 07 01 16 44 07 01 16 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 16 01 59 07 01 16 43 07 01 16 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 16 01 FF 00 07 00 00 00 01 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 01 07 01 18 45 07 00 E1 40 07 01 18 4A 07 01 18 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 01 5D 07 01 18 FF 00 0B 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 03 FF 00 02 00 04 07 00 03 07 00 F1 01 01 00 03 07 01 18 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 03 FF 00 0E 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 38 FF 00 02 00 04 07 00 03 07 00 F1 01 01 00 03 07 01 18 07 00 38 01 FF 00 1D 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 38 42 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 38 45 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 01 1A FF 00 0E 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 01 0A FF 00 02 00 04 07 00 03 07 00 F1 01 01 00 03 07 01 18 07 01 0A 01 FF 00 1E 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 01 0A 42 07 00 CF FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 01 0A 45 07 00 E1 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 01 46 07 01 18 FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 01 47 07 00 E1 40 07 01 1C 45 07 00 E1 40 07 01 1C FF 00 00 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 14 07 00 F1 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 01 0A 41 07 01 18 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 38 01 41 07 01 12 41 07 01 16 FF 00 01 00 04 07 00 03 07 00 F1 01 01 00 02 07 01 18 07 00 03 41 07 00 E1 43 05 44 07 00 E1 47 05 47 07 00 CF
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     557    565    Any
        //  557    565    557    565    Ljava/lang/IndexOutOfBoundsException;
        //  573    575    3      8      Ljava/lang/RuntimeException;
        //  122    128    128    129    Any
        //  122    128    128    129    Ljava/util/NoSuchElementException;
        //  122    128    128    129    Any
        //  122    128    128    129    Any
        //  122    128    128    129    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  175    182    182    183    Any
        //  175    182    175    176    Ljava/lang/EnumConstantNotPresentException;
        //  176    182    175    176    Any
        //  176    182    182    183    Any
        //  175    182    182    183    Any
        //  235    242    242    243    Any
        //  236    242    242    243    Any
        //  236    242    235    236    Ljava/lang/ClassCastException;
        //  236    242    235    236    Ljava/lang/StringIndexOutOfBoundsException;
        //  235    242    242    243    Any
        //  294    300    300    301    Any
        //  294    300    300    301    Ljava/util/NoSuchElementException;
        //  294    300    300    301    Any
        //  294    300    300    301    Any
        //  294    300    300    301    Ljava/lang/RuntimeException;
        //  439    446    446    447    Any
        //  439    446    439    440    Any
        //  439    446    439    440    Ljava/lang/RuntimeException;
        //  439    446    446    447    Ljava/lang/NumberFormatException;
        //  439    446    3      8      Ljava/lang/UnsupportedOperationException;
        //  499    506    506    507    Any
        //  499    506    506    507    Any
        //  499    506    499    500    Ljava/util/NoSuchElementException;
        //  499    506    499    500    Ljava/lang/ArithmeticException;
        //  499    506    506    507    Any
        //  523    530    530    531    Any
        //  523    530    523    524    Any
        //  523    530    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  524    530    530    531    Any
        //  523    530    523    524    Ljava/lang/ArithmeticException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:630)
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
    public f0b 0() {
        return fbS.1E(this, 532232989);
    }
    
    public boolean 5() {
        return fbS.ed(this, 420999316);
    }
    
    public void c(@NotNull final f0a f0a) {
        fbS.6Q(this, 1763525239, f0a);
    }
    
    @NotNull
    public f0f 7() {
        return fbS.h9(this, 462030549);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          483
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            475
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            467
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            39
        //    33: ldc_w           171086220
        //    36: goto            42
        //    39: ldc_w           -1915657781
        //    42: ldc_w           1991715303
        //    45: ixor           
        //    46: lookupswitch {
        //          -77182932: 72
        //          2089138283: 39
        //          default: 452
        //        }
        //    72: aload_3        
        //    73: goto            77
        //    76: athrow         
        //    77: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    80: goto            84
        //    83: athrow         
        //    84: iload_1        
        //    85: ifne            443
        //    88: getstatic       dev/nuker/pyro/fc.c:I
        //    91: ifge            100
        //    94: ldc_w           2023230698
        //    97: goto            103
        //   100: ldc_w           -1892812539
        //   103: ldc_w           -1051174905
        //   106: ixor           
        //   107: lookupswitch {
        //          -1856429193: 100
        //          -1178577683: 444
        //          default: 132
        //        }
        //   132: aload_0        
        //   133: getfield        dev/nuker/pyro/faZ.1:I
        //   136: iconst_m1      
        //   137: if_icmpeq       146
        //   140: ldc_w           -1333492394
        //   143: goto            149
        //   146: ldc_w           -1333492393
        //   149: ldc_w           -227075384
        //   152: ixor           
        //   153: tableswitch {
        //          -2048442564: 176
        //          -2048442563: 443
        //          default: 140
        //        }
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   180: getstatic       dev/nuker/pyro/fc.1:I
        //   183: ifeq            192
        //   186: ldc_w           1817338589
        //   189: goto            195
        //   192: ldc_w           1587218946
        //   195: ldc_w           -520405969
        //   198: ixor           
        //   199: lookupswitch {
        //          -1935057166: 192
        //          -1100990931: 224
        //          default: 450
        //        }
        //   224: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   227: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   230: aload_0        
        //   231: getfield        dev/nuker/pyro/faZ.1:I
        //   234: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   237: aload_0        
        //   238: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   241: getstatic       dev/nuker/pyro/fc.0:I
        //   244: ifeq            253
        //   247: ldc_w           -737252841
        //   250: goto            256
        //   253: ldc_w           -247781537
        //   256: ldc_w           1045381089
        //   259: ixor           
        //   260: lookupswitch {
        //          -364816906: 448
        //          2128967674: 253
        //          default: 288
        //        }
        //   288: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   291: getstatic       dev/nuker/pyro/fc.c:I
        //   294: ifge            303
        //   297: ldc_w           1922049144
        //   300: goto            306
        //   303: ldc_w           -744553715
        //   306: ldc_w           -960765439
        //   309: ixor           
        //   310: lookupswitch {
        //          -1272199559: 446
        //          1281647765: 303
        //          default: 336
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   343: goto            347
        //   346: athrow         
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            359
        //   353: ldc_w           -625124259
        //   356: goto            362
        //   359: ldc_w           -461799154
        //   362: ldc_w           -1621570036
        //   365: ixor           
        //   366: lookupswitch {
        //          1172673105: 359
        //          2065780482: 392
        //          default: 454
        //        }
        //   392: aload_0        
        //   393: iconst_m1      
        //   394: getstatic       dev/nuker/pyro/fc.c:I
        //   397: ifge            406
        //   400: ldc_w           1516089925
        //   403: goto            409
        //   406: ldc_w           -1368299093
        //   409: ldc_w           -2102106751
        //   412: ixor           
        //   413: lookupswitch {
        //          -655763516: 456
        //          2097116011: 406
        //          default: 440
        //        }
        //   440: putfield        dev/nuker/pyro/faZ.1:I
        //   443: return         
        //   444: aconst_null    
        //   445: athrow         
        //   446: aconst_null    
        //   447: athrow         
        //   448: aconst_null    
        //   449: athrow         
        //   450: aconst_null    
        //   451: athrow         
        //   452: aconst_null    
        //   453: athrow         
        //   454: aconst_null    
        //   455: athrow         
        //   456: aconst_null    
        //   457: athrow         
        //   458: pop            
        //   459: goto            24
        //   462: pop            
        //   463: aconst_null    
        //   464: goto            458
        //   467: dup            
        //   468: ifnull          458
        //   471: checkcast       Ljava/lang/Throwable;
        //   474: athrow         
        //   475: dup            
        //   476: ifnull          462
        //   479: checkcast       Ljava/lang/Throwable;
        //   482: athrow         
        //   483: aconst_null    
        //   484: athrow         
        //    StackMapTable: 00 32 43 07 00 E1 04 FF 00 0B 00 00 00 01 07 00 E1 FF 00 03 00 04 07 00 03 01 07 01 59 07 01 79 00 00 FF 00 0E 00 04 07 00 03 01 07 01 59 07 01 79 00 03 07 00 03 01 07 01 59 FF 00 02 00 04 07 00 03 01 07 01 59 07 01 79 00 04 07 00 03 01 07 01 59 01 FF 00 1D 00 04 07 00 03 01 07 01 59 07 01 79 00 03 07 00 03 01 07 01 59 43 07 00 E1 FF 00 00 00 04 07 00 03 01 07 01 59 07 01 79 00 04 07 00 03 01 07 01 59 07 01 79 45 07 00 E1 00 0F 42 01 1C 07 05 42 01 1A 4F 07 01 53 FF 00 02 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 01 53 01 5C 07 01 53 5C 07 01 53 FF 00 02 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 01 53 01 5F 07 01 53 4E 07 01 6E FF 00 02 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 01 6E 01 5D 07 01 6E 42 07 01 3E 40 07 01 6E 45 07 00 E1 00 0B 42 01 1D FF 00 0D 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 01 59 07 01 79 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 00 03 01 02 00 41 07 01 6E 41 07 01 53 41 07 01 53 FF 00 01 00 04 07 00 03 01 07 01 59 07 01 79 00 03 07 00 03 01 07 01 59 01 FF 00 01 00 04 07 00 03 01 07 01 59 07 01 79 00 02 07 00 03 01 41 07 00 E1 43 05 44 07 00 E1 47 05 47 07 00 E1
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     467    475    Any
        //  467    475    467    475    Ljava/util/ConcurrentModificationException;
        //  483    485    3      8      Any
        //  76     83     83     84     Any
        //  77     83     3      8      Ljava/lang/IllegalStateException;
        //  76     83     76     77     Any
        //  77     83     76     77     Any
        //  76     83     3      8      Any
        //  339    346    346    347    Any
        //  339    346    3      8      Ljava/util/NoSuchElementException;
        //  340    346    339    340    Ljava/lang/NullPointerException;
        //  339    346    346    347    Ljava/lang/AssertionError;
        //  339    346    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 128 out of bounds for length 128
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
    
    @Nullable
    public BlockPos 6() {
        return fbS.7P(this, 166591371);
    }
    
    @NotNull
    public f0f 8() {
        return fbS.hb(this, 749955655);
    }
    
    public void 3(final int n) {
        fbS.6d(this, 516463269, n);
    }
    
    @NotNull
    public List c(@Nullable final World p0, @NotNull final EnumFacing p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          950
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            942
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            934
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_2        
        //    25: pop            
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: goto            34
        //    33: athrow         
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: goto            41
        //    40: athrow         
        //    41: checkcast       Ljava/util/List;
        //    44: astore_3       
        //    45: aload_0        
        //    46: aload_2        
        //    47: getstatic       dev/nuker/pyro/fc.0:I
        //    50: ifeq            59
        //    53: ldc_w           530277629
        //    56: goto            62
        //    59: ldc_w           -85702357
        //    62: ldc_w           -1846512821
        //    65: ixor           
        //    66: lookupswitch {
        //          -1905584202: 905
        //          627355734: 59
        //          default: 92
        //        }
        //    92: aload_0        
        //    93: getfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0g;
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            108
        //   102: ldc_w           377923588
        //   105: goto            111
        //   108: ldc_w           -139773829
        //   111: ldc_w           -1983808964
        //   114: ixor           
        //   115: lookupswitch {
        //          -1622683080: 903
        //          -1549272927: 108
        //          default: 140
        //        }
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //   147: goto            151
        //   150: athrow         
        //   151: checkcast       Ljava/lang/Number;
        //   154: goto            158
        //   157: athrow         
        //   158: invokevirtual   java/lang/Number.intValue:()I
        //   161: goto            165
        //   164: athrow         
        //   165: iconst_1       
        //   166: isub           
        //   167: getstatic       dev/nuker/pyro/fc.c:I
        //   170: ifge            179
        //   173: ldc_w           1055554164
        //   176: goto            182
        //   179: ldc_w           2121479410
        //   182: ldc_w           -633440703
        //   185: ixor           
        //   186: lookupswitch {
        //          -455865291: 907
        //          1149611848: 179
        //          default: 212
        //        }
        //   212: aload_2        
        //   213: getstatic       dev/nuker/pyro/fc.0:I
        //   216: ifeq            225
        //   219: ldc_w           -1049292137
        //   222: goto            228
        //   225: ldc_w           -431563647
        //   228: ldc_w           751101993
        //   231: ixor           
        //   232: lookupswitch {
        //          -307103042: 921
        //          1952756271: 225
        //          default: 260
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   net/minecraft/util/EnumFacing.func_176740_k:()Lnet/minecraft/util/EnumFacing$Axis;
        //   267: goto            271
        //   270: athrow         
        //   271: getstatic       dev/nuker/pyro/fc.1:I
        //   274: ifeq            283
        //   277: ldc_w           -614957732
        //   280: goto            286
        //   283: ldc_w           1742743430
        //   286: ldc_w           -43119528
        //   289: ixor           
        //   290: lookupswitch {
        //          386312752: 283
        //          641102084: 923
        //          default: 316
        //        }
        //   316: getstatic       net/minecraft/util/EnumFacing$Axis.X:Lnet/minecraft/util/EnumFacing$Axis;
        //   319: if_acmpne       365
        //   322: aload_0        
        //   323: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   326: dup            
        //   327: ifnonnull       341
        //   330: goto            334
        //   333: athrow         
        //   334: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   337: goto            341
        //   340: athrow         
        //   341: goto            345
        //   344: athrow         
        //   345: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   348: goto            352
        //   351: athrow         
        //   352: iconst_2       
        //   353: irem           
        //   354: ifne            361
        //   357: iconst_1       
        //   358: goto            405
        //   361: iconst_0       
        //   362: goto            405
        //   365: aload_0        
        //   366: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   369: dup            
        //   370: ifnonnull       384
        //   373: goto            377
        //   376: athrow         
        //   377: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   380: goto            384
        //   383: athrow         
        //   384: goto            388
        //   387: athrow         
        //   388: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   391: goto            395
        //   394: athrow         
        //   395: iconst_2       
        //   396: irem           
        //   397: ifne            404
        //   400: iconst_1       
        //   401: goto            405
        //   404: iconst_0       
        //   405: getstatic       dev/nuker/pyro/fc.c:I
        //   408: ifge            417
        //   411: ldc_w           -1602365029
        //   414: goto            420
        //   417: ldc_w           843324933
        //   420: ldc_w           -326758883
        //   423: ixor           
        //   424: lookupswitch {
        //          -1094735697: 417
        //          1291573126: 901
        //          default: 452
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokevirtual   dev/nuker/pyro/faZ.c:(Lnet/minecraft/util/EnumFacing;IZ)[Lnet/minecraft/util/math/BlockPos;
        //   459: goto            463
        //   462: athrow         
        //   463: astore          6
        //   465: aload           6
        //   467: arraylength    
        //   468: istore          7
        //   470: iconst_0       
        //   471: istore          5
        //   473: iload           5
        //   475: iload           7
        //   477: if_icmpge       899
        //   480: aload           6
        //   482: iload           5
        //   484: aaload         
        //   485: astore          4
        //   487: aload_1        
        //   488: dup            
        //   489: ifnonnull       503
        //   492: goto            496
        //   495: athrow         
        //   496: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   499: goto            503
        //   502: athrow         
        //   503: getstatic       dev/nuker/pyro/fc.0:I
        //   506: ifeq            515
        //   509: ldc_w           1426342718
        //   512: goto            518
        //   515: ldc_w           -956153687
        //   518: ldc_w           -1113934676
        //   521: ixor           
        //   522: lookupswitch {
        //          -392235118: 515
        //          2056844293: 548
        //          default: 919
        //        }
        //   548: aload           4
        //   550: dup            
        //   551: ifnonnull       565
        //   554: goto            558
        //   557: athrow         
        //   558: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   561: goto            565
        //   564: athrow         
        //   565: getstatic       dev/nuker/pyro/fc.c:I
        //   568: ifge            577
        //   571: ldc_w           -1591485697
        //   574: goto            580
        //   577: ldc_w           -518371145
        //   580: ldc_w           -1271222007
        //   583: ixor           
        //   584: lookupswitch {
        //          353987574: 577
        //          1428224446: 612
        //          default: 913
        //        }
        //   612: aload_0        
        //   613: getstatic       dev/nuker/pyro/fc.1:I
        //   616: ifeq            625
        //   619: ldc_w           462209405
        //   622: goto            628
        //   625: ldc_w           -214333540
        //   628: ldc_w           1905496296
        //   631: ixor           
        //   632: lookupswitch {
        //          -1388780679: 625
        //          1780437397: 909
        //          default: 660
        //        }
        //   660: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   663: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   666: getstatic       dev/nuker/pyro/fc.0:I
        //   669: ifeq            678
        //   672: ldc_w           -1978883875
        //   675: goto            681
        //   678: ldc_w           269900610
        //   681: ldc_w           1978390315
        //   684: ixor           
        //   685: lookupswitch {
        //          -1607690: 915
        //          868494534: 678
        //          default: 712
        //        }
        //   712: goto            716
        //   715: athrow         
        //   716: invokevirtual   net/minecraft/util/math/BlockPos.func_177971_a:(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
        //   719: goto            723
        //   722: athrow         
        //   723: getstatic       dev/nuker/pyro/fc.1:I
        //   726: ifeq            735
        //   729: ldc_w           -1840414590
        //   732: goto            738
        //   735: ldc_w           -901677248
        //   738: ldc_w           -1187494617
        //   741: ixor           
        //   742: lookupswitch {
        //          -1146950120: 735
        //          729138597: 917
        //          default: 768
        //        }
        //   768: goto            772
        //   771: athrow         
        //   772: invokevirtual   net/minecraft/world/World.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   775: goto            779
        //   778: athrow         
        //   779: dup            
        //   780: pop            
        //   781: goto            785
        //   784: athrow         
        //   785: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   790: goto            794
        //   793: athrow         
        //   794: dup            
        //   795: pop            
        //   796: goto            800
        //   799: athrow         
        //   800: invokevirtual   net/minecraft/block/material/Material.func_76222_j:()Z
        //   803: goto            807
        //   806: athrow         
        //   807: ifeq            893
        //   810: getstatic       dev/nuker/pyro/fc.1:I
        //   813: ifeq            822
        //   816: ldc_w           -142139961
        //   819: goto            825
        //   822: ldc_w           157915454
        //   825: ldc_w           -1301159995
        //   828: ixor           
        //   829: lookupswitch {
        //          1173799426: 911
        //          1919446371: 822
        //          default: 856
        //        }
        //   856: aload_3        
        //   857: aload           4
        //   859: aload_0        
        //   860: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   863: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   866: goto            870
        //   869: athrow         
        //   870: invokevirtual   net/minecraft/util/math/BlockPos.func_177971_a:(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
        //   873: goto            877
        //   876: athrow         
        //   877: dup            
        //   878: pop            
        //   879: goto            883
        //   882: athrow         
        //   883: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   888: goto            892
        //   891: athrow         
        //   892: pop            
        //   893: iinc            5, 1
        //   896: goto            473
        //   899: aload_3        
        //   900: areturn        
        //   901: aconst_null    
        //   902: athrow         
        //   903: aconst_null    
        //   904: athrow         
        //   905: aconst_null    
        //   906: athrow         
        //   907: aconst_null    
        //   908: athrow         
        //   909: aconst_null    
        //   910: athrow         
        //   911: aconst_null    
        //   912: athrow         
        //   913: aconst_null    
        //   914: athrow         
        //   915: aconst_null    
        //   916: athrow         
        //   917: aconst_null    
        //   918: athrow         
        //   919: aconst_null    
        //   920: athrow         
        //   921: aconst_null    
        //   922: athrow         
        //   923: aconst_null    
        //   924: athrow         
        //   925: pop            
        //   926: goto            24
        //   929: pop            
        //   930: aconst_null    
        //   931: goto            925
        //   934: dup            
        //   935: ifnull          925
        //   938: checkcast       Ljava/lang/Throwable;
        //   941: athrow         
        //   942: dup            
        //   943: ifnull          929
        //   946: checkcast       Ljava/lang/Throwable;
        //   949: athrow         
        //   950: aconst_null    
        //   951: athrow         
        //    StackMapTable: 00 84 43 07 00 E1 04 FF 00 0B 00 00 00 01 07 00 E1 FE 00 03 07 00 03 07 01 79 07 00 F1 48 07 00 E1 FF 00 00 00 03 07 00 03 07 01 79 07 00 F1 00 02 08 00 1A 08 00 1A 45 07 00 E1 40 07 01 92 FF 00 11 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 02 07 00 03 07 00 F1 FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 1D 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 02 07 00 03 07 00 F1 FF 00 0F 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 00 4D FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 07 00 4D 01 FF 00 1C 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 00 4D FF 00 02 00 00 00 01 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 00 4D 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 01 1A 45 07 00 DD FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 01 9F 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 0D 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 1D 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 0C 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 00 F1 FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 05 07 00 03 07 00 F1 01 07 00 F1 01 FF 00 1F 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 00 F1 FF 00 02 00 00 00 01 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 00 F1 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B1 FF 00 0B 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B1 FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 05 07 00 03 07 00 F1 01 07 01 B1 01 FF 00 1D 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B1 FF 00 10 00 00 00 01 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 42 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 08 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 03 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 4A 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 42 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B9 45 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 08 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 0B 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 02 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 05 07 00 03 07 00 F1 01 01 01 FF 00 1F 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 42 07 00 E1 FF 00 00 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 45 07 00 E1 40 07 01 1C FF 00 09 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 00 01 07 01 1C 01 00 00 FF 00 15 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 01 07 00 E1 40 07 01 79 45 07 00 E1 40 07 01 79 4B 07 01 79 FF 00 02 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 01 5D 07 01 79 FF 00 08 00 00 00 01 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 45 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 0B 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 02 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 01 FF 00 1F 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 0C 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 00 03 FF 00 02 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 04 07 01 79 07 01 B9 07 00 03 01 FF 00 1F 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 00 03 FF 00 11 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 01 CF FF 00 02 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 04 07 01 79 07 01 B9 07 01 CF 01 FF 00 1E 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 01 CF 42 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 01 CF 45 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 0B 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 02 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 01 FF 00 1D 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 02 00 00 00 01 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 45 07 00 E1 40 07 01 DF 44 07 00 E1 40 07 01 DF 47 07 00 E1 40 07 01 E5 44 07 01 3E 40 07 01 E5 45 07 00 E1 40 01 0E 42 01 1E 4C 07 01 3A FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 96 07 01 B9 07 01 CF 45 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 96 07 01 B9 FF 00 04 00 00 00 01 07 00 E1 FF 00 00 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 96 07 01 B9 47 07 00 E1 40 01 00 FF 00 05 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 00 01 07 01 1C 01 00 00 FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 01 FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 07 00 4D FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 02 07 00 03 07 00 F1 FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 03 07 00 03 07 00 F1 01 FF 00 01 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 00 03 01 FF 00 01 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 FF 00 01 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 03 07 01 79 07 01 B9 07 01 CF FF 00 01 00 08 07 00 03 07 01 79 07 00 F1 07 01 96 07 01 B9 01 07 01 1C 01 00 02 07 01 79 07 01 B9 41 07 01 79 FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 00 F1 FF 00 01 00 04 07 00 03 07 01 79 07 00 F1 07 01 96 00 04 07 00 03 07 00 F1 01 07 01 B1 FF 00 01 00 03 07 00 03 07 01 79 07 00 F1 00 01 07 00 CF 43 05 44 07 00 CF 47 05 47 07 00 E1
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     934    942    Ljava/lang/IllegalStateException;
        //  934    942    934    942    Ljava/lang/NegativeArraySizeException;
        //  950    952    3      8      Any
        //  33     40     40     41     Any
        //  34     40     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  33     40     40     41     Any
        //  33     40     33     34     Any
        //  34     40     33     34     Any
        //  144    150    150    151    Any
        //  144    150    3      8      Ljava/lang/NumberFormatException;
        //  144    150    3      8      Any
        //  144    150    150    151    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  144    150    3      8      Any
        //  157    164    164    165    Any
        //  158    164    157    158    Ljava/lang/UnsupportedOperationException;
        //  157    164    164    165    Any
        //  158    164    3      8      Ljava/lang/NegativeArraySizeException;
        //  157    164    164    165    Any
        //  264    270    270    271    Any
        //  264    270    270    271    Any
        //  264    270    3      8      Ljava/util/NoSuchElementException;
        //  264    270    3      8      Ljava/lang/IllegalArgumentException;
        //  264    270    270    271    Any
        //  334    340    340    341    Any
        //  334    340    340    341    Any
        //  334    340    3      8      Ljava/lang/NullPointerException;
        //  334    340    3      8      Ljava/lang/AssertionError;
        //  334    340    340    341    Any
        //  344    351    351    352    Any
        //  344    351    344    345    Ljava/lang/NumberFormatException;
        //  345    351    344    345    Ljava/lang/AssertionError;
        //  345    351    344    345    Ljava/lang/ClassCastException;
        //  344    351    3      8      Ljava/lang/IllegalStateException;
        //  376    383    383    384    Any
        //  377    383    3      8      Ljava/lang/NegativeArraySizeException;
        //  376    383    376    377    Ljava/lang/NumberFormatException;
        //  377    383    376    377    Any
        //  376    383    3      8      Any
        //  387    394    394    395    Any
        //  388    394    394    395    Ljava/lang/AssertionError;
        //  388    394    387    388    Any
        //  387    394    387    388    Ljava/lang/NumberFormatException;
        //  387    394    387    388    Ljava/lang/ClassCastException;
        //  455    462    462    463    Any
        //  456    462    3      8      Ljava/lang/RuntimeException;
        //  456    462    455    456    Any
        //  455    462    455    456    Any
        //  456    462    462    463    Ljava/lang/IllegalStateException;
        //  495    502    502    503    Any
        //  496    502    502    503    Any
        //  496    502    495    496    Any
        //  496    502    495    496    Ljava/lang/ClassCastException;
        //  496    502    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  558    564    564    565    Any
        //  558    564    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  558    564    564    565    Ljava/lang/RuntimeException;
        //  558    564    564    565    Any
        //  558    564    3      8      Ljava/lang/IllegalStateException;
        //  715    722    722    723    Any
        //  716    722    715    716    Ljava/lang/IllegalStateException;
        //  716    722    3      8      Any
        //  716    722    3      8      Any
        //  715    722    715    716    Any
        //  772    778    778    779    Any
        //  772    778    3      8      Ljava/lang/IllegalArgumentException;
        //  772    778    778    779    Ljava/lang/NullPointerException;
        //  772    778    778    779    Any
        //  772    778    778    779    Ljava/lang/RuntimeException;
        //  784    793    793    794    Any
        //  784    793    784    785    Ljava/lang/NullPointerException;
        //  785    793    784    785    Any
        //  785    793    784    785    Any
        //  784    793    3      8      Any
        //  799    806    806    807    Any
        //  800    806    3      8      Ljava/lang/ArithmeticException;
        //  799    806    806    807    Ljava/lang/AssertionError;
        //  799    806    799    800    Ljava/lang/NullPointerException;
        //  799    806    3      8      Ljava/lang/AssertionError;
        //  869    876    876    877    Any
        //  869    876    3      8      Ljava/lang/ArithmeticException;
        //  870    876    869    870    Ljava/util/ConcurrentModificationException;
        //  869    876    3      8      Ljava/lang/ClassCastException;
        //  870    876    3      8      Any
        //  883    891    891    892    Any
        //  883    891    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  883    891    3      8      Ljava/lang/ArithmeticException;
        //  883    891    3      8      Ljava/lang/ArithmeticException;
        //  883    891    891    892    Any
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
    
    public void 4(final int n) {
        fbS.6m(this, 428724085, n);
    }
    
    @Override
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.8Z(this, 474521680, vec3d, n);
    }
    
    @NotNull
    public f0a 4() {
        return fbS.07(this, 1497575842);
    }
    
    @NotNull
    public f0g 3() {
        return fbS.8N(this, 116197546);
    }
    
    public static BlockPos[][][][][] 2() {
        return fbS.20(null, 1940931933);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f2V p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3469
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            3461
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3453
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           938865888
        //    33: goto            39
        //    36: ldc_w           -581598240
        //    39: ldc_w           1220125762
        //    42: ixor           
        //    43: lookupswitch {
        //          1945250154: 36
        //          2135707810: 3382
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: getstatic       dev/nuker/pyro/fc.c:I
        //    74: ifge            83
        //    77: ldc_w           1754712402
        //    80: goto            86
        //    83: ldc_w           1998543940
        //    86: ldc_w           203546310
        //    89: ixor           
        //    90: lookupswitch {
        //          1689720724: 83
        //          2067694210: 116
        //          default: 3386
        //        }
        //   116: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   119: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   122: ifnull          131
        //   125: ldc_w           1704898482
        //   128: goto            134
        //   131: ldc_w           1704898483
        //   134: ldc_w           49006866
        //   137: ixor           
        //   138: tableswitch {
        //          -823472832: 160
        //          -823472831: 3343
        //          default: 125
        //        }
        //   160: aload_0        
        //   161: new             Lnet/minecraft/util/math/BlockPos;
        //   164: dup            
        //   165: aload_0        
        //   166: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            181
        //   175: ldc_w           1289042152
        //   178: goto            184
        //   181: ldc_w           354913400
        //   184: ldc_w           -1443648478
        //   187: ixor           
        //   188: lookupswitch {
        //          -450456374: 3370
        //          504918051: 181
        //          default: 216
        //        }
        //   216: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   219: dup            
        //   220: pop            
        //   221: goto            225
        //   224: athrow         
        //   225: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174791_d:()Lnet/minecraft/util/math/Vec3d;
        //   228: goto            232
        //   231: athrow         
        //   232: goto            236
        //   235: athrow         
        //   236: invokespecial   net/minecraft/util/math/BlockPos.<init>:(Lnet/minecraft/util/math/Vec3d;)V
        //   239: goto            243
        //   242: athrow         
        //   243: putfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   246: aload_0        
        //   247: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   250: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   253: dup            
        //   254: ifnonnull       268
        //   257: goto            261
        //   260: athrow         
        //   261: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   264: goto            268
        //   267: athrow         
        //   268: getstatic       dev/nuker/pyro/fc.c:I
        //   271: ifge            280
        //   274: ldc_w           900783975
        //   277: goto            283
        //   280: ldc_w           925015726
        //   283: ldc_w           -279605778
        //   286: ixor           
        //   287: lookupswitch {
        //          -622505335: 3424
        //          -484539893: 280
        //          default: 312
        //        }
        //   312: aload_0        
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            325
        //   319: ldc_w           92259327
        //   322: goto            328
        //   325: ldc_w           787693993
        //   328: ldc_w           -1686414104
        //   331: ixor           
        //   332: lookupswitch {
        //          -1643864297: 3360
        //          -1090152758: 325
        //          default: 360
        //        }
        //   360: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   363: goto            367
        //   366: athrow         
        //   367: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175623_d:(Lnet/minecraft/util/math/BlockPos;)Z
        //   370: goto            374
        //   373: athrow         
        //   374: ifeq            501
        //   377: aload_0        
        //   378: getstatic       dev/nuker/pyro/fc.c:I
        //   381: ifge            390
        //   384: ldc_w           -88567669
        //   387: goto            393
        //   390: ldc_w           1558030499
        //   393: ldc_w           342452075
        //   396: ixor           
        //   397: lookupswitch {
        //          -288229408: 390
        //          1219809224: 424
        //          default: 3436
        //        }
        //   424: aload_0        
        //   425: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   428: dup            
        //   429: ifnonnull       487
        //   432: getstatic       dev/nuker/pyro/fc.1:I
        //   435: ifeq            444
        //   438: ldc_w           -1914810620
        //   441: goto            447
        //   444: ldc_w           -1643708997
        //   447: ldc_w           1737307620
        //   450: ixor           
        //   451: lookupswitch {
        //          -363627808: 3412
        //          864874649: 444
        //          default: 476
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   483: goto            487
        //   486: athrow         
        //   487: goto            491
        //   490: athrow         
        //   491: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   494: goto            498
        //   497: athrow         
        //   498: putfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/util/math/BlockPos;
        //   501: iconst_m1      
        //   502: istore_2       
        //   503: iconst_0       
        //   504: istore_3       
        //   505: bipush          8
        //   507: istore          4
        //   509: iload_3        
        //   510: getstatic       dev/nuker/pyro/fc.c:I
        //   513: ifge            522
        //   516: ldc_w           199936516
        //   519: goto            525
        //   522: ldc_w           646086080
        //   525: ldc_w           1095369074
        //   528: ixor           
        //   529: lookupswitch {
        //          1252051830: 522
        //          1741192370: 556
        //          default: 3416
        //        }
        //   556: iload           4
        //   558: if_icmpgt       567
        //   561: ldc_w           1117173887
        //   564: goto            570
        //   567: ldc_w           1117173880
        //   570: ldc_w           -781245404
        //   573: ixor           
        //   574: tableswitch {
        //          670251190: 596
        //          670251191: 982
        //          default: 561
        //        }
        //   596: getstatic       dev/nuker/pyro/fc.0:I
        //   599: ifeq            608
        //   602: ldc_w           -1964423007
        //   605: goto            611
        //   608: ldc_w           -1291453840
        //   611: ldc_w           1062315870
        //   614: ixor           
        //   615: lookupswitch {
        //          -1940628178: 640
        //          -1246171137: 608
        //          default: 3354
        //        }
        //   640: aload_0        
        //   641: getstatic       dev/nuker/pyro/fc.c:I
        //   644: ifge            653
        //   647: ldc_w           1708311693
        //   650: goto            656
        //   653: ldc_w           -662248187
        //   656: ldc_w           388074511
        //   659: ixor           
        //   660: lookupswitch {
        //          -1814145965: 653
        //          1928546434: 3400
        //          default: 688
        //        }
        //   688: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //   691: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   694: getstatic       dev/nuker/pyro/fc.c:I
        //   697: ifge            706
        //   700: ldc_w           -1108480891
        //   703: goto            709
        //   706: ldc_w           -1563759811
        //   709: ldc_w           2097232463
        //   712: ixor           
        //   713: lookupswitch {
        //          -1515595455: 706
        //          -1058220342: 3430
        //          default: 740
        //        }
        //   740: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   743: getstatic       dev/nuker/pyro/fc.1:I
        //   746: ifeq            755
        //   749: ldc_w           1199979128
        //   752: goto            758
        //   755: ldc_w           528809143
        //   758: ldc_w           1195728420
        //   761: ixor           
        //   762: lookupswitch {
        //          12805212: 755
        //          1489085075: 788
        //          default: 3404
        //        }
        //   788: iload_3        
        //   789: goto            793
        //   792: athrow         
        //   793: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   796: goto            800
        //   799: athrow         
        //   800: astore          5
        //   802: aload           5
        //   804: getstatic       dev/nuker/pyro/fc.c:I
        //   807: ifge            816
        //   810: ldc_w           2009471165
        //   813: goto            819
        //   816: ldc_w           1698962511
        //   819: ldc_w           -2034307945
        //   822: ixor           
        //   823: lookupswitch {
        //          -470093608: 848
        //          -243731414: 816
        //          default: 3388
        //        }
        //   848: getstatic       net/minecraft/item/ItemStack.field_190927_a:Lnet/minecraft/item/ItemStack;
        //   851: goto            855
        //   854: athrow         
        //   855: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   858: goto            862
        //   861: athrow         
        //   862: iconst_1       
        //   863: ixor           
        //   864: ifeq            976
        //   867: aload           5
        //   869: dup            
        //   870: pop            
        //   871: goto            875
        //   874: athrow         
        //   875: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   878: goto            882
        //   881: athrow         
        //   882: instanceof      Lnet/minecraft/item/ItemBlock;
        //   885: ifeq            894
        //   888: ldc_w           327168459
        //   891: goto            897
        //   894: ldc_w           327168456
        //   897: ldc_w           804656526
        //   900: ixor           
        //   901: tableswitch {
        //          2028750986: 924
        //          2028750987: 976
        //          default: 888
        //        }
        //   924: iload_3        
        //   925: getstatic       dev/nuker/pyro/fc.1:I
        //   928: ifeq            937
        //   931: ldc_w           727942663
        //   934: goto            940
        //   937: ldc_w           773456337
        //   940: ldc_w           -872418394
        //   943: ixor           
        //   944: lookupswitch {
        //          -526617183: 937
        //          -437915017: 972
        //          default: 3440
        //        }
        //   972: istore_2       
        //   973: goto            982
        //   976: iinc            3, 1
        //   979: goto            509
        //   982: getstatic       dev/nuker/pyro/fc.c:I
        //   985: ifge            994
        //   988: ldc_w           -1156844549
        //   991: goto            997
        //   994: ldc_w           849446939
        //   997: ldc_w           544787832
        //  1000: ixor           
        //  1001: lookupswitch {
        //          -1686946173: 3376
        //          -822320162: 994
        //          default: 1028
        //        }
        //  1028: aload_0        
        //  1029: getfield        dev/nuker/pyro/faZ.c:Z
        //  1032: istore_3       
        //  1033: getstatic       dev/nuker/pyro/fc.0:I
        //  1036: ifeq            1045
        //  1039: ldc_w           1114395078
        //  1042: goto            1048
        //  1045: ldc_w           2053173411
        //  1048: ldc_w           743555833
        //  1051: ixor           
        //  1052: lookupswitch {
        //          1446064730: 1080
        //          1849529151: 1045
        //          default: 3428
        //        }
        //  1080: aload_0        
        //  1081: iconst_0       
        //  1082: putfield        dev/nuker/pyro/faZ.c:Z
        //  1085: iload_2        
        //  1086: iconst_m1      
        //  1087: if_icmpeq       3065
        //  1090: aload_0        
        //  1091: getstatic       dev/nuker/pyro/fc.0:I
        //  1094: ifeq            1103
        //  1097: ldc_w           -858290497
        //  1100: goto            1106
        //  1103: ldc_w           1368900571
        //  1106: ldc_w           465991477
        //  1109: ixor           
        //  1110: lookupswitch {
        //          -686689910: 1103
        //          1246868718: 1136
        //          default: 3432
        //        }
        //  1136: aload_0        
        //  1137: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  1140: getstatic       dev/nuker/pyro/fc.1:I
        //  1143: ifeq            1152
        //  1146: ldc_w           1775824580
        //  1149: goto            1155
        //  1152: ldc_w           1247188275
        //  1155: ldc_w           1639089571
        //  1158: ixor           
        //  1159: lookupswitch {
        //          141192039: 1152
        //          736366736: 1184
        //          default: 3426
        //        }
        //  1184: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1187: checkcast       Lnet/minecraft/world/World;
        //  1190: getstatic       dev/nuker/pyro/fc.c:I
        //  1193: ifge            1202
        //  1196: ldc_w           199943465
        //  1199: goto            1205
        //  1202: ldc_w           -973289904
        //  1205: ldc_w           824459946
        //  1208: ixor           
        //  1209: lookupswitch {
        //          -533264994: 1202
        //          986621827: 3378
        //          default: 1236
        //        }
        //  1236: aload_0        
        //  1237: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  1240: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1243: dup            
        //  1244: pop            
        //  1245: goto            1249
        //  1248: athrow         
        //  1249: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174811_aO:()Lnet/minecraft/util/EnumFacing;
        //  1252: goto            1256
        //  1255: athrow         
        //  1256: dup            
        //  1257: pop            
        //  1258: getstatic       dev/nuker/pyro/fc.0:I
        //  1261: ifeq            1270
        //  1264: ldc_w           1021562668
        //  1267: goto            1273
        //  1270: ldc_w           635555418
        //  1273: ldc_w           -1885517110
        //  1276: ixor           
        //  1277: lookupswitch {
        //          -1434680176: 1304
        //          -1283553818: 1270
        //          default: 3352
        //        }
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: invokevirtual   dev/nuker/pyro/faZ.c:(Lnet/minecraft/world/World;Lnet/minecraft/util/EnumFacing;)Ljava/util/List;
        //  1311: goto            1315
        //  1314: athrow         
        //  1315: astore          4
        //  1317: getstatic       dev/nuker/pyro/fc.0:I
        //  1320: ifeq            1329
        //  1323: ldc_w           1476084058
        //  1326: goto            1332
        //  1329: ldc_w           -386907030
        //  1332: ldc_w           2049900454
        //  1335: ixor           
        //  1336: lookupswitch {
        //          -714307331: 1329
        //          768982780: 3384
        //          default: 1364
        //        }
        //  1364: aload           4
        //  1366: goto            1370
        //  1369: athrow         
        //  1370: invokeinterface java/util/List.isEmpty:()Z
        //  1375: goto            1379
        //  1378: athrow         
        //  1379: ifne            3065
        //  1382: getstatic       dev/nuker/pyro/fc.1:I
        //  1385: ifeq            1394
        //  1388: ldc_w           797289799
        //  1391: goto            1397
        //  1394: ldc_w           -1821781288
        //  1397: ldc_w           -1680704123
        //  1400: ixor           
        //  1401: lookupswitch {
        //          -1517011169: 1394
        //          -1269313342: 3420
        //          default: 1428
        //        }
        //  1428: aload_0        
        //  1429: getstatic       dev/nuker/pyro/fc.c:I
        //  1432: ifge            1441
        //  1435: ldc_w           -583025398
        //  1438: goto            1444
        //  1441: ldc_w           1900045324
        //  1444: ldc_w           -1527755505
        //  1447: ixor           
        //  1448: lookupswitch {
        //          -791350531: 1441
        //          2043670533: 3394
        //          default: 1476
        //        }
        //  1476: getfield        dev/nuker/pyro/faZ.1:I
        //  1479: iconst_m1      
        //  1480: if_icmpne       1500
        //  1483: aload_0        
        //  1484: aload_0        
        //  1485: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  1488: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1491: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1494: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1497: putfield        dev/nuker/pyro/faZ.1:I
        //  1500: aload_0        
        //  1501: getstatic       dev/nuker/pyro/fc.1:I
        //  1504: ifeq            1513
        //  1507: ldc_w           -324668178
        //  1510: goto            1516
        //  1513: ldc_w           -1766353472
        //  1516: ldc_w           -2059265929
        //  1519: ixor           
        //  1520: lookupswitch {
        //          334859703: 1548
        //          1776807065: 1513
        //          default: 3410
        //        }
        //  1548: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  1551: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1554: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1557: getstatic       dev/nuker/pyro/fc.0:I
        //  1560: ifeq            1569
        //  1563: ldc_w           -622408743
        //  1566: goto            1572
        //  1569: ldc_w           1738143561
        //  1572: ldc_w           1410624939
        //  1575: ixor           
        //  1576: lookupswitch {
        //          -1896700302: 1569
        //          864918242: 1604
        //          default: 3362
        //        }
        //  1604: iload_2        
        //  1605: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1608: aload_0        
        //  1609: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  1612: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1615: goto            1619
        //  1618: athrow         
        //  1619: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  1622: goto            1626
        //  1625: athrow         
        //  1626: iconst_0       
        //  1627: getstatic       dev/nuker/pyro/fc.c:I
        //  1630: ifge            1639
        //  1633: ldc_w           1937758443
        //  1636: goto            1642
        //  1639: ldc_w           1479900148
        //  1642: ldc_w           1827587676
        //  1645: ixor           
        //  1646: lookupswitch {
        //          529604279: 1639
        //          886816168: 1672
        //          default: 3356
        //        }
        //  1672: istore          5
        //  1674: aload_0        
        //  1675: getstatic       dev/nuker/pyro/fc.0:I
        //  1678: ifeq            1687
        //  1681: ldc_w           -997730324
        //  1684: goto            1690
        //  1687: ldc_w           -521196525
        //  1690: ldc_w           276419244
        //  1693: ixor           
        //  1694: lookupswitch {
        //          -721550016: 1687
        //          -258539841: 1720
        //          default: 3348
        //        }
        //  1720: getfield        dev/nuker/pyro/faZ.1:Ldev/nuker/pyro/f0a;
        //  1723: goto            1727
        //  1726: athrow         
        //  1727: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1730: goto            1734
        //  1733: athrow         
        //  1734: checkcast       Ljava/lang/Boolean;
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: ifeq            1757
        //  1751: ldc_w           1204063619
        //  1754: goto            1760
        //  1757: ldc_w           1204063618
        //  1760: ldc_w           -155403585
        //  1763: ixor           
        //  1764: tableswitch {
        //          1659924088: 1788
        //          1659924089: 1915
        //          default: 1751
        //        }
        //  1788: aload_0        
        //  1789: getstatic       dev/nuker/pyro/fc.c:I
        //  1792: ifge            1801
        //  1795: ldc_w           -2012614469
        //  1798: goto            1804
        //  1801: ldc_w           -1904234052
        //  1804: ldc_w           -1896870717
        //  1807: ixor           
        //  1808: lookupswitch {
        //          117046392: 3344
        //          1543578537: 1801
        //          default: 1836
        //        }
        //  1836: getfield        dev/nuker/pyro/faZ.2:I
        //  1839: aload_0        
        //  1840: getstatic       dev/nuker/pyro/fc.0:I
        //  1843: ifeq            1852
        //  1846: ldc_w           1916614811
        //  1849: goto            1855
        //  1852: ldc_w           -1609380654
        //  1855: ldc_w           -159142301
        //  1858: ixor           
        //  1859: lookupswitch {
        //          -2067884296: 1852
        //          1452368561: 1884
        //          default: 3392
        //        }
        //  1884: getfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0g;
        //  1887: goto            1891
        //  1890: athrow         
        //  1891: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  1894: goto            1898
        //  1897: athrow         
        //  1898: checkcast       Ljava/lang/Number;
        //  1901: goto            1905
        //  1904: athrow         
        //  1905: invokevirtual   java/lang/Number.intValue:()I
        //  1908: goto            1912
        //  1911: athrow         
        //  1912: if_icmplt       3052
        //  1915: iconst_0       
        //  1916: istore          6
        //  1918: iload           6
        //  1920: aload           4
        //  1922: goto            1926
        //  1925: athrow         
        //  1926: invokeinterface java/util/List.size:()I
        //  1931: goto            1935
        //  1934: athrow         
        //  1935: aload_0        
        //  1936: getfield        dev/nuker/pyro/faZ.1:Ldev/nuker/pyro/f0a;
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1946: goto            1950
        //  1949: athrow         
        //  1950: checkcast       Ljava/lang/Boolean;
        //  1953: goto            1957
        //  1956: athrow         
        //  1957: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1960: goto            1964
        //  1963: athrow         
        //  1964: ifeq            1971
        //  1967: iconst_1       
        //  1968: goto            2135
        //  1971: aload_0        
        //  1972: getstatic       dev/nuker/pyro/fc.c:I
        //  1975: ifge            1984
        //  1978: ldc_w           1198302568
        //  1981: goto            1987
        //  1984: ldc_w           1112630693
        //  1987: ldc_w           1324796310
        //  1990: ixor           
        //  1991: lookupswitch {
        //          161115390: 3374
        //          670167112: 1984
        //          default: 2016
        //        }
        //  2016: getfield        dev/nuker/pyro/faZ.0:Ldev/nuker/pyro/f0g;
        //  2019: getstatic       dev/nuker/pyro/fc.0:I
        //  2022: ifeq            2031
        //  2025: ldc_w           -761397960
        //  2028: goto            2034
        //  2031: ldc_w           1903726732
        //  2034: ldc_w           -53367727
        //  2037: ixor           
        //  2038: lookupswitch {
        //          -551475876: 2031
        //          776753513: 3442
        //          default: 2064
        //        }
        //  2064: goto            2068
        //  2067: athrow         
        //  2068: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  2071: goto            2075
        //  2074: athrow         
        //  2075: checkcast       Ljava/lang/Number;
        //  2078: getstatic       dev/nuker/pyro/fc.c:I
        //  2081: ifge            2090
        //  2084: ldc_w           639142451
        //  2087: goto            2093
        //  2090: ldc_w           809676371
        //  2093: ldc_w           -2024472923
        //  2096: ixor           
        //  2097: lookupswitch {
        //          -1588824938: 3414
        //          539173671: 2090
        //          default: 2124
        //        }
        //  2124: goto            2128
        //  2127: athrow         
        //  2128: invokevirtual   java/lang/Number.intValue:()I
        //  2131: goto            2135
        //  2134: athrow         
        //  2135: getstatic       dev/nuker/pyro/fc.0:I
        //  2138: ifeq            2147
        //  2141: ldc_w           77191003
        //  2144: goto            2150
        //  2147: ldc_w           -888213351
        //  2150: ldc_w           -1713636240
        //  2153: ixor           
        //  2154: lookupswitch {
        //          -1881969211: 2147
        //          -1656607957: 3406
        //          default: 2180
        //        }
        //  2180: goto            2184
        //  2183: athrow         
        //  2184: invokestatic    java/lang/Math.min:(II)I
        //  2187: goto            2191
        //  2190: athrow         
        //  2191: if_icmpge       2947
        //  2194: iload           5
        //  2196: aload           4
        //  2198: goto            2202
        //  2201: athrow         
        //  2202: invokeinterface java/util/List.size:()I
        //  2207: goto            2211
        //  2210: athrow         
        //  2211: if_icmplt       2217
        //  2214: goto            2947
        //  2217: getstatic       dev/nuker/pyro/fc.0:I
        //  2220: ifeq            2229
        //  2223: ldc_w           1063170180
        //  2226: goto            2232
        //  2229: ldc_w           -1221764234
        //  2232: ldc_w           -554604895
        //  2235: ixor           
        //  2236: lookupswitch {
        //          -1433872728: 2229
        //          -508570075: 3358
        //          default: 2264
        //        }
        //  2264: aload           4
        //  2266: getstatic       dev/nuker/pyro/fc.c:I
        //  2269: ifge            2278
        //  2272: ldc_w           -314214411
        //  2275: goto            2281
        //  2278: ldc_w           1928449257
        //  2281: ldc_w           -1200391158
        //  2284: ixor           
        //  2285: lookupswitch {
        //          -897404701: 2312
        //          1429605375: 2278
        //          default: 3434
        //        }
        //  2312: iload           5
        //  2314: goto            2318
        //  2317: athrow         
        //  2318: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2323: goto            2327
        //  2326: athrow         
        //  2327: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  2330: astore          7
        //  2332: getstatic       dev/nuker/pyro/fc.1:I
        //  2335: ifeq            2344
        //  2338: ldc_w           -1885253659
        //  2341: goto            2347
        //  2344: ldc_w           -1799423945
        //  2347: ldc_w           2037254269
        //  2350: ixor           
        //  2351: lookupswitch {
        //          -154187880: 3438
        //          1714029722: 2344
        //          default: 2376
        //        }
        //  2376: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  2379: goto            2383
        //  2382: athrow         
        //  2383: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  2386: goto            2390
        //  2389: athrow         
        //  2390: aload           7
        //  2392: goto            2396
        //  2395: athrow         
        //  2396: invokevirtual   dev/nuker/pyro/fbg.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/Tuple;
        //  2399: goto            2403
        //  2402: athrow         
        //  2403: ifnull          2935
        //  2406: getstatic       dev/nuker/pyro/fc.1:I
        //  2409: ifeq            2418
        //  2412: ldc_w           -2601422
        //  2415: goto            2421
        //  2418: ldc_w           -802849783
        //  2421: ldc_w           -553394874
        //  2424: ixor           
        //  2425: lookupswitch {
        //          -1705091041: 2418
        //          551261044: 3402
        //          default: 2452
        //        }
        //  2452: getstatic       dev/nuker/pyro/fbg.c:Ldev/nuker/pyro/fbd;
        //  2455: goto            2459
        //  2458: athrow         
        //  2459: invokevirtual   dev/nuker/pyro/fbd.c:()Ldev/nuker/pyro/fbg;
        //  2462: goto            2466
        //  2465: athrow         
        //  2466: getstatic       dev/nuker/pyro/fc.0:I
        //  2469: ifeq            2478
        //  2472: ldc_w           -2057945052
        //  2475: goto            2481
        //  2478: ldc_w           -1260513802
        //  2481: ldc_w           1222710065
        //  2484: ixor           
        //  2485: lookupswitch {
        //          -843623659: 3380
        //          -647289111: 2478
        //          default: 2512
        //        }
        //  2512: aload           7
        //  2514: getstatic       dev/nuker/pyro/fc.0:I
        //  2517: ifeq            2526
        //  2520: ldc_w           2003900857
        //  2523: goto            2529
        //  2526: ldc_w           2121142320
        //  2529: ldc_w           79191457
        //  2532: ixor           
        //  2533: lookupswitch {
        //          1942570008: 2526
        //          2060864913: 2560
        //          default: 3390
        //        }
        //  2560: aload_0        
        //  2561: getfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0f;
        //  2564: getstatic       dev/nuker/pyro/fc.0:I
        //  2567: ifeq            2576
        //  2570: ldc_w           -475004912
        //  2573: goto            2579
        //  2576: ldc_w           -715576724
        //  2579: ldc_w           898096662
        //  2582: ixor           
        //  2583: lookupswitch {
        //          -700981754: 2576
        //          -522259334: 2608
        //          default: 3408
        //        }
        //  2608: goto            2612
        //  2611: athrow         
        //  2612: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2615: goto            2619
        //  2618: athrow         
        //  2619: checkcast       Ldev/nuker/pyro/f4O;
        //  2622: getstatic       dev/nuker/pyro/f4O.c:Ldev/nuker/pyro/f4O;
        //  2625: if_acmpne       2634
        //  2628: ldc_w           -1164970429
        //  2631: goto            2637
        //  2634: ldc_w           -1164970428
        //  2637: ldc_w           -1871930096
        //  2640: ixor           
        //  2641: tableswitch {
        //          1439094438: 2664
        //          1439094439: 2670
        //          default: 2628
        //        }
        //  2664: getstatic       dev/nuker/pyro/fbe.c:Ldev/nuker/pyro/fbe;
        //  2667: goto            2875
        //  2670: getstatic       dev/nuker/pyro/fc.c:I
        //  2673: ifge            2682
        //  2676: ldc_w           -906472119
        //  2679: goto            2685
        //  2682: ldc_w           17038199
        //  2685: ldc_w           -1721923825
        //  2688: ixor           
        //  2689: lookupswitch {
        //          -1231083674: 2682
        //          1353044550: 3350
        //          default: 2716
        //        }
        //  2716: aload_0        
        //  2717: getfield        dev/nuker/pyro/faZ.c:Ldev/nuker/pyro/f0f;
        //  2720: goto            2724
        //  2723: athrow         
        //  2724: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2727: goto            2731
        //  2730: athrow         
        //  2731: checkcast       Ldev/nuker/pyro/f4O;
        //  2734: getstatic       dev/nuker/pyro/f4O.0:Ldev/nuker/pyro/f4O;
        //  2737: if_acmpne       2746
        //  2740: ldc_w           -1339660068
        //  2743: goto            2749
        //  2746: ldc_w           -1339660065
        //  2749: ldc_w           -431012099
        //  2752: ixor           
        //  2753: tableswitch {
        //          -1395499966: 2776
        //          -1395499965: 2826
        //          default: 2740
        //        }
        //  2776: getstatic       dev/nuker/pyro/fc.c:I
        //  2779: ifge            2788
        //  2782: ldc_w           -742941087
        //  2785: goto            2791
        //  2788: ldc_w           1583860149
        //  2791: ldc_w           -1829063786
        //  2794: ixor           
        //  2795: lookupswitch {
        //          -862094813: 2820
        //          1095577079: 2788
        //          default: 3346
        //        }
        //  2820: getstatic       dev/nuker/pyro/fbe.0:Ldev/nuker/pyro/fbe;
        //  2823: goto            2875
        //  2826: getstatic       dev/nuker/pyro/fc.0:I
        //  2829: ifeq            2838
        //  2832: ldc_w           2000949442
        //  2835: goto            2841
        //  2838: ldc_w           1735279721
        //  2841: ldc_w           1279314950
        //  2844: ixor           
        //  2845: lookupswitch {
        //          724469871: 2872
        //          990174404: 2838
        //          default: 3364
        //        }
        //  2872: getstatic       dev/nuker/pyro/fbe.1:Ldev/nuker/pyro/fbe;
        //  2875: iconst_0       
        //  2876: getstatic       dev/nuker/pyro/fc.0:I
        //  2879: ifeq            2888
        //  2882: ldc_w           1413589547
        //  2885: goto            2891
        //  2888: ldc_w           -669783835
        //  2891: ldc_w           -1088220502
        //  2894: ixor           
        //  2895: lookupswitch {
        //          -345851775: 2888
        //          1731263055: 2920
        //          default: 3366
        //        }
        //  2920: goto            2924
        //  2923: athrow         
        //  2924: invokevirtual   dev/nuker/pyro/fbg.c:(Lnet/minecraft/util/math/BlockPos;Ldev/nuker/pyro/fbe;Z)Z
        //  2927: goto            2931
        //  2930: athrow         
        //  2931: pop            
        //  2932: goto            2938
        //  2935: iinc            6, -1
        //  2938: iinc            5, 1
        //  2941: iinc            6, 1
        //  2944: goto            1918
        //  2947: getstatic       dev/nuker/pyro/fc.c:I
        //  2950: ifge            2959
        //  2953: ldc_w           -1643393496
        //  2956: goto            2962
        //  2959: ldc_w           115700639
        //  2962: ldc_w           -945588913
        //  2965: ixor           
        //  2966: lookupswitch {
        //          -1468406530: 2959
        //          1504230247: 3418
        //          default: 2992
        //        }
        //  2992: aload_0        
        //  2993: iconst_1       
        //  2994: putfield        dev/nuker/pyro/faZ.c:Z
        //  2997: getstatic       dev/nuker/pyro/fc.1:I
        //  3000: ifeq            3009
        //  3003: ldc_w           -198357987
        //  3006: goto            3012
        //  3009: ldc_w           -1808433990
        //  3012: ldc_w           308948982
        //  3015: ixor           
        //  3016: lookupswitch {
        //          -2040573108: 3044
        //          -431528981: 3009
        //          default: 3368
        //        }
        //  3044: aload_0        
        //  3045: iconst_0       
        //  3046: putfield        dev/nuker/pyro/faZ.2:I
        //  3049: goto            3065
        //  3052: aload_0        
        //  3053: dup            
        //  3054: getfield        dev/nuker/pyro/faZ.2:I
        //  3057: dup            
        //  3058: istore          6
        //  3060: iconst_1       
        //  3061: iadd           
        //  3062: putfield        dev/nuker/pyro/faZ.2:I
        //  3065: aload_0        
        //  3066: getfield        dev/nuker/pyro/faZ.c:Z
        //  3069: ifne            3343
        //  3072: iload_3        
        //  3073: ifeq            3343
        //  3076: getstatic       dev/nuker/pyro/fc.1:I
        //  3079: ifeq            3088
        //  3082: ldc_w           -841366837
        //  3085: goto            3091
        //  3088: ldc_w           -694239509
        //  3091: ldc_w           398380040
        //  3094: ixor           
        //  3095: lookupswitch {
        //          -630780221: 3396
        //          433157562: 3088
        //          default: 3120
        //        }
        //  3120: aload_0        
        //  3121: getfield        dev/nuker/pyro/faZ.1:I
        //  3124: iconst_m1      
        //  3125: if_icmpeq       3134
        //  3128: ldc_w           1129797132
        //  3131: goto            3137
        //  3134: ldc_w           1129797131
        //  3137: ldc_w           -1247845729
        //  3140: ixor           
        //  3141: tableswitch {
        //          -309303002: 3164
        //          -309303001: 3343
        //          default: 3128
        //        }
        //  3164: aload_0        
        //  3165: getstatic       dev/nuker/pyro/fc.1:I
        //  3168: ifeq            3177
        //  3171: ldc_w           -1052873649
        //  3174: goto            3180
        //  3177: ldc_w           126321769
        //  3180: ldc_w           801406657
        //  3183: ixor           
        //  3184: lookupswitch {
        //          -285601138: 3177
        //          675543720: 3212
        //          default: 3372
        //        }
        //  3212: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  3215: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3218: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3221: aload_0        
        //  3222: getfield        dev/nuker/pyro/faZ.1:I
        //  3225: getstatic       dev/nuker/pyro/fc.0:I
        //  3228: ifeq            3237
        //  3231: ldc_w           -1139317048
        //  3234: goto            3240
        //  3237: ldc_w           1016315654
        //  3240: ldc_w           594709647
        //  3243: ixor           
        //  3244: lookupswitch {
        //          -1620710841: 3237
        //          534852489: 3272
        //          default: 3422
        //        }
        //  3272: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  3275: aload_0        
        //  3276: getfield        dev/nuker/pyro/faZ.c:Lnet/minecraft/client/Minecraft;
        //  3279: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  3282: goto            3286
        //  3285: athrow         
        //  3286: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  3289: goto            3293
        //  3292: athrow         
        //  3293: aload_0        
        //  3294: iconst_m1      
        //  3295: getstatic       dev/nuker/pyro/fc.1:I
        //  3298: ifeq            3307
        //  3301: ldc_w           1239791502
        //  3304: goto            3310
        //  3307: ldc_w           964634945
        //  3310: ldc_w           -1274464410
        //  3313: ixor           
        //  3314: lookupswitch {
        //          -1921638873: 3340
        //          -34832152: 3307
        //          default: 3398
        //        }
        //  3340: putfield        dev/nuker/pyro/faZ.1:I
        //  3343: return         
        //  3344: aconst_null    
        //  3345: athrow         
        //  3346: aconst_null    
        //  3347: athrow         
        //  3348: aconst_null    
        //  3349: athrow         
        //  3350: aconst_null    
        //  3351: athrow         
        //  3352: aconst_null    
        //  3353: athrow         
        //  3354: aconst_null    
        //  3355: athrow         
        //  3356: aconst_null    
        //  3357: athrow         
        //  3358: aconst_null    
        //  3359: athrow         
        //  3360: aconst_null    
        //  3361: athrow         
        //  3362: aconst_null    
        //  3363: athrow         
        //  3364: aconst_null    
        //  3365: athrow         
        //  3366: aconst_null    
        //  3367: athrow         
        //  3368: aconst_null    
        //  3369: athrow         
        //  3370: aconst_null    
        //  3371: athrow         
        //  3372: aconst_null    
        //  3373: athrow         
        //  3374: aconst_null    
        //  3375: athrow         
        //  3376: aconst_null    
        //  3377: athrow         
        //  3378: aconst_null    
        //  3379: athrow         
        //  3380: aconst_null    
        //  3381: athrow         
        //  3382: aconst_null    
        //  3383: athrow         
        //  3384: aconst_null    
        //  3385: athrow         
        //  3386: aconst_null    
        //  3387: athrow         
        //  3388: aconst_null    
        //  3389: athrow         
        //  3390: aconst_null    
        //  3391: athrow         
        //  3392: aconst_null    
        //  3393: athrow         
        //  3394: aconst_null    
        //  3395: athrow         
        //  3396: aconst_null    
        //  3397: athrow         
        //  3398: aconst_null    
        //  3399: athrow         
        //  3400: aconst_null    
        //  3401: athrow         
        //  3402: aconst_null    
        //  3403: athrow         
        //  3404: aconst_null    
        //  3405: athrow         
        //  3406: aconst_null    
        //  3407: athrow         
        //  3408: aconst_null    
        //  3409: athrow         
        //  3410: aconst_null    
        //  3411: athrow         
        //  3412: aconst_null    
        //  3413: athrow         
        //  3414: aconst_null    
        //  3415: athrow         
        //  3416: aconst_null    
        //  3417: athrow         
        //  3418: aconst_null    
        //  3419: athrow         
        //  3420: aconst_null    
        //  3421: athrow         
        //  3422: aconst_null    
        //  3423: athrow         
        //  3424: aconst_null    
        //  3425: athrow         
        //  3426: aconst_null    
        //  3427: athrow         
        //  3428: aconst_null    
        //  3429: athrow         
        //  3430: aconst_null    
        //  3431: athrow         
        //  3432: aconst_null    
        //  3433: athrow         
        //  3434: aconst_null    
        //  3435: athrow         
        //  3436: aconst_null    
        //  3437: athrow         
        //  3438: aconst_null    
        //  3439: athrow         
        //  3440: aconst_null    
        //  3441: athrow         
        //  3442: aconst_null    
        //  3443: athrow         
        //  3444: pop            
        //  3445: goto            24
        //  3448: pop            
        //  3449: aconst_null    
        //  3450: goto            3444
        //  3453: dup            
        //  3454: ifnull          3444
        //  3457: checkcast       Ljava/lang/Throwable;
        //  3460: athrow         
        //  3461: dup            
        //  3462: ifnull          3448
        //  3465: checkcast       Ljava/lang/Throwable;
        //  3468: athrow         
        //  3469: aconst_null    
        //  3470: athrow         
        //    StackMapTable: 01 7F 43 07 00 E1 04 FF 00 0B 00 00 00 01 07 00 E1 FD 00 03 07 00 03 07 03 1C 0B 42 01 1C 4E 07 00 03 FF 00 02 00 02 07 00 03 07 03 1C 00 02 07 00 03 01 5D 07 00 03 08 05 42 01 19 FF 00 14 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 01 53 FF 00 02 00 02 07 00 03 07 03 1C 00 05 07 00 03 08 00 A1 08 00 A1 07 01 53 01 FF 00 1F 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 01 53 47 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 01 59 45 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 03 1E 42 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 03 1E 45 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 50 07 00 E1 40 07 02 2E 45 07 00 E1 40 07 02 2E 4B 07 02 2E FF 00 02 00 02 07 00 03 07 03 1C 00 02 07 02 2E 01 5C 07 02 2E FF 00 0C 00 02 07 00 03 07 03 1C 00 02 07 02 2E 07 00 03 FF 00 02 00 02 07 00 03 07 03 1C 00 03 07 02 2E 07 00 03 01 FF 00 1F 00 02 07 00 03 07 03 1C 00 02 07 02 2E 07 00 03 45 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 02 2E 07 01 B9 45 07 00 E1 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 03 1C 00 02 07 00 03 01 5E 07 00 03 FF 00 13 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 FF 00 02 00 02 07 00 03 07 03 1C 00 03 07 00 03 07 01 B9 01 FF 00 1C 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 42 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 45 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 42 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 45 07 00 E1 FF 00 00 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 02 FE 00 07 01 01 01 4C 01 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 02 01 01 5E 01 04 05 42 01 19 0B 42 01 1C 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 01 5F 07 00 03 51 07 01 59 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 01 59 01 5E 07 01 59 4E 07 01 5F FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 01 5F 01 5D 07 01 5F 43 07 00 E1 FF 00 00 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 01 5F 01 45 07 00 E1 40 07 02 56 FF 00 0F 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 01 07 02 56 FF 00 02 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 02 07 02 56 01 5C 07 02 56 45 07 00 CF FF 00 00 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 02 07 02 56 07 02 56 45 07 00 E1 40 01 FF 00 0B 00 00 00 01 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 01 07 02 56 45 07 00 E1 40 07 03 20 05 05 42 01 1A 4C 01 FF 00 02 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 02 01 01 5F 01 03 FA 00 05 0B 42 01 1E 10 42 01 1F 56 07 00 03 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 0F 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 53 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 53 01 FF 00 1C 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 53 FF 00 11 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 79 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 01 FF 00 1E 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 79 4B 07 00 E1 FF 00 00 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 01 59 45 07 00 E1 FF 00 00 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 00 F1 FF 00 0D 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 00 F1 FF 00 02 00 05 07 00 03 07 03 1C 01 01 01 00 04 07 00 03 07 01 79 07 00 F1 01 FF 00 1E 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 00 F1 42 07 00 E1 FF 00 00 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 00 F1 45 07 00 E1 40 07 01 96 FF 00 0D 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 00 42 01 1F 44 07 01 8E 40 07 01 96 47 07 00 E1 40 01 0E 42 01 1E 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 02 07 00 03 01 5F 07 00 03 17 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 02 07 00 03 01 5F 07 00 03 54 07 01 5F FF 00 02 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 02 07 01 5F 01 5F 07 01 5F 4D 07 01 8E 40 07 01 6E 45 07 00 E1 00 4C 01 FF 00 02 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 02 01 01 5D 01 FF 00 0E 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 01 07 00 03 FF 00 02 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 00 00 01 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 01 07 00 38 45 07 00 E1 40 07 01 1A FF 00 05 00 00 00 01 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 01 07 01 0A 45 07 00 E1 40 01 02 05 42 01 1B 4C 07 00 03 FF 00 02 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0F 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 00 03 FF 00 02 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 03 01 07 00 03 01 FF 00 1C 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 00 03 FF 00 05 00 00 00 01 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 00 4D 45 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 01 1A 45 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 01 9F 45 07 00 E1 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 01 02 FC 00 02 01 FF 00 06 00 00 00 01 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 07 01 96 47 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 01 46 07 00 CF FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 38 45 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 1A 45 07 00 D5 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 0A 45 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 FF 00 06 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 01 FF 00 0C 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 03 FF 00 02 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 04 01 01 07 00 03 01 FF 00 1C 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 03 FF 00 0E 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 4D FF 00 02 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 04 01 01 07 00 4D 01 FF 00 1D 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 4D 42 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 4D 45 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 1A FF 00 0E 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 9F FF 00 02 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 04 01 01 07 01 9F 01 FF 00 1E 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 9F 42 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 9F 45 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 FF 00 0B 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 FF 00 02 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 04 01 01 01 01 FF 00 1D 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 42 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 45 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 01 49 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 07 01 96 47 07 00 E1 FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 01 01 05 0B 42 01 1F 4D 07 01 96 FF 00 02 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 07 01 96 01 5E 07 01 96 44 07 00 CD FF 00 00 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 02 07 01 96 01 47 07 00 E1 40 07 01 1A FC 00 10 07 01 B9 42 01 1C FF 00 05 00 00 00 01 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 01 07 02 D0 45 07 00 E1 40 07 02 CB 44 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 45 07 00 E1 40 07 03 22 0E 42 01 1E 45 07 00 E1 40 07 02 D0 45 07 00 E1 40 07 02 CB 4B 07 02 CB FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 01 5E 07 02 CB FF 00 0D 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1E 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 0F 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 00 88 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 04 07 02 CB 07 01 B9 07 00 88 01 FF 00 1C 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 00 88 42 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 00 88 45 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 01 1A FF 00 08 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 05 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1A 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 05 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 0B 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1E 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 06 00 00 00 01 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 00 88 45 07 00 E1 FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 01 1A FF 00 08 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 05 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1A 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 0B 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1C 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 05 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 0B 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 01 FF 00 1E 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 02 EA FF 00 0C 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 04 07 02 CB 07 01 B9 07 02 EA 01 FF 00 02 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 05 07 02 CB 07 01 B9 07 02 EA 01 01 FF 00 1C 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 04 07 02 CB 07 01 B9 07 02 EA 01 42 07 00 CF FF 00 00 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 04 07 02 CB 07 01 B9 07 02 EA 01 45 07 00 E1 40 01 03 02 FA 00 08 0B 42 01 1D 10 42 01 1F FA 00 07 F9 00 0C 16 42 01 1C 07 05 42 01 1A 4C 07 00 03 FF 00 02 00 04 07 00 03 07 03 1C 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 18 00 04 07 00 03 07 03 1C 01 01 00 02 07 01 5F 01 FF 00 02 00 04 07 00 03 07 03 1C 01 01 00 03 07 01 5F 01 01 FF 00 1F 00 04 07 00 03 07 03 1C 01 01 00 02 07 01 5F 01 4C 07 00 E1 40 07 01 6E 45 07 00 E1 00 FF 00 0D 00 04 07 00 03 07 03 1C 01 01 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 07 03 1C 01 01 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 07 03 1C 01 01 00 02 07 00 03 01 F9 00 02 FF 00 00 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 01 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 03 07 00 03 07 01 79 07 00 F1 01 FF 00 01 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 01 01 FD 00 01 01 01 FF 00 01 00 02 07 00 03 07 03 1C 00 02 07 02 2E 07 00 03 FF 00 01 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 01 07 01 5F FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 04 07 02 CB 07 01 B9 07 02 EA 01 FA 00 01 FF 00 01 00 02 07 00 03 07 03 1C 00 04 07 00 03 08 00 A1 08 00 A1 07 01 53 FF 00 01 00 04 07 00 03 07 03 1C 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 03 FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 00 FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 79 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 01 07 02 CB FF 00 01 00 02 07 00 03 07 03 1C 00 00 FE 00 01 01 01 07 01 96 FF 00 01 00 02 07 00 03 07 03 1C 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 01 07 02 56 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 02 07 02 CB 07 01 B9 FF 00 01 00 06 07 00 03 07 03 1C 01 01 07 01 96 01 00 02 01 07 00 03 FF 00 01 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 01 07 00 03 FA 00 01 FF 00 01 00 04 07 00 03 07 03 1C 01 01 00 02 07 00 03 01 FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 00 FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 01 07 01 5F FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 01 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 03 07 02 CB 07 01 B9 07 00 88 FF 00 01 00 05 07 00 03 07 03 1C 01 01 07 01 96 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 03 1C 00 02 07 00 03 07 01 B9 FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 01 9F FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 01 01 FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 00 F9 00 01 FF 00 01 00 04 07 00 03 07 03 1C 01 01 00 02 07 01 5F 01 FF 00 01 00 02 07 00 03 07 03 1C 00 01 07 02 2E FF 00 01 00 05 07 00 03 07 03 1C 01 01 01 00 02 07 00 03 07 01 53 01 41 07 01 59 41 07 00 03 FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 01 07 01 96 FF 00 01 00 02 07 00 03 07 03 1C 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 03 1C 01 01 07 01 96 01 01 07 01 B9 00 00 FF 00 01 00 06 07 00 03 07 03 1C 01 01 01 07 02 56 00 01 01 FF 00 01 00 07 07 00 03 07 03 1C 01 01 07 01 96 01 01 00 03 01 01 07 00 4D FF 00 01 00 02 07 00 03 07 03 1C 00 01 07 00 E1 43 05 44 07 00 E1 47 05 47 07 00 E1
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3453   3461   Any
        //  3453   3461   3453   3461   Any
        //  3469   3471   3      8      Ljava/lang/RuntimeException;
        //  224    231    231    232    Any
        //  225    231    224    225    Any
        //  224    231    224    225    Ljava/lang/RuntimeException;
        //  224    231    231    232    Ljava/util/ConcurrentModificationException;
        //  224    231    231    232    Ljava/lang/IndexOutOfBoundsException;
        //  235    242    242    243    Any
        //  236    242    235    236    Any
        //  236    242    242    243    Ljava/lang/NegativeArraySizeException;
        //  236    242    3      8      Ljava/util/ConcurrentModificationException;
        //  236    242    3      8      Ljava/lang/AssertionError;
        //  260    267    267    268    Any
        //  260    267    260    261    Ljava/lang/UnsupportedOperationException;
        //  260    267    267    268    Any
        //  260    267    260    261    Ljava/lang/UnsupportedOperationException;
        //  261    267    260    261    Any
        //  366    373    373    374    Any
        //  367    373    366    367    Any
        //  367    373    373    374    Any
        //  366    373    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  366    373    366    367    Ljava/lang/NumberFormatException;
        //  479    486    486    487    Any
        //  480    486    479    480    Any
        //  480    486    3      8      Any
        //  480    486    3      8      Ljava/lang/ArithmeticException;
        //  479    486    479    480    Ljava/lang/NumberFormatException;
        //  490    497    497    498    Any
        //  490    497    490    491    Ljava/lang/RuntimeException;
        //  490    497    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  491    497    490    491    Ljava/lang/NumberFormatException;
        //  491    497    490    491    Any
        //  792    799    799    800    Any
        //  792    799    792    793    Any
        //  792    799    792    793    Any
        //  793    799    792    793    Ljava/lang/UnsupportedOperationException;
        //  793    799    3      8      Ljava/lang/UnsupportedOperationException;
        //  854    861    861    862    Any
        //  854    861    854    855    Ljava/util/NoSuchElementException;
        //  854    861    3      8      Any
        //  854    861    3      8      Any
        //  854    861    854    855    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  875    881    881    882    Any
        //  875    881    3      8      Any
        //  875    881    881    882    Ljava/lang/ArithmeticException;
        //  875    881    881    882    Any
        //  875    881    881    882    Ljava/lang/IllegalStateException;
        //  1248   1255   1255   1256   Any
        //  1248   1255   3      8      Any
        //  1249   1255   1248   1249   Any
        //  1248   1255   1248   1249   Ljava/lang/IllegalArgumentException;
        //  1248   1255   1248   1249   Ljava/lang/ClassCastException;
        //  1307   1314   1314   1315   Any
        //  1308   1314   1307   1308   Ljava/lang/ClassCastException;
        //  1308   1314   3      8      Ljava/lang/ArithmeticException;
        //  1308   1314   1307   1308   Ljava/lang/NumberFormatException;
        //  1308   1314   1307   1308   Any
        //  1369   1378   1378   1379   Any
        //  1369   1378   1378   1379   Any
        //  1370   1378   3      8      Ljava/lang/IllegalStateException;
        //  1370   1378   1369   1370   Ljava/lang/NegativeArraySizeException;
        //  1370   1378   3      8      Ljava/util/ConcurrentModificationException;
        //  1618   1625   1625   1626   Any
        //  1619   1625   1625   1626   Any
        //  1619   1625   1618   1619   Ljava/lang/NegativeArraySizeException;
        //  1618   1625   1625   1626   Ljava/lang/RuntimeException;
        //  1619   1625   1625   1626   Any
        //  1727   1733   1733   1734   Any
        //  1727   1733   3      8      Ljava/lang/IllegalArgumentException;
        //  1727   1733   3      8      Ljava/util/ConcurrentModificationException;
        //  1727   1733   1733   1734   Any
        //  1727   1733   1733   1734   Any
        //  1741   1747   1747   1748   Any
        //  1741   1747   1747   1748   Ljava/lang/RuntimeException;
        //  1741   1747   1747   1748   Ljava/lang/IllegalStateException;
        //  1741   1747   1747   1748   Any
        //  1741   1747   3      8      Any
        //  1891   1897   1897   1898   Any
        //  1891   1897   1897   1898   Ljava/util/ConcurrentModificationException;
        //  1891   1897   1897   1898   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1891   1897   3      8      Any
        //  1891   1897   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1904   1911   1911   1912   Any
        //  1904   1911   1911   1912   Any
        //  1905   1911   3      8      Any
        //  1905   1911   1904   1905   Any
        //  1905   1911   3      8      Ljava/lang/IllegalStateException;
        //  1926   1934   1934   1935   Any
        //  1926   1934   1934   1935   Ljava/lang/UnsupportedOperationException;
        //  1926   1934   1934   1935   Any
        //  1926   1934   1934   1935   Any
        //  1926   1934   3      8      Ljava/lang/NullPointerException;
        //  1942   1949   1949   1950   Any
        //  1942   1949   1949   1950   Ljava/util/ConcurrentModificationException;
        //  1942   1949   3      8      Ljava/lang/IllegalStateException;
        //  1943   1949   1942   1943   Ljava/util/ConcurrentModificationException;
        //  1942   1949   1942   1943   Ljava/lang/EnumConstantNotPresentException;
        //  1956   1963   1963   1964   Any
        //  1957   1963   1956   1957   Ljava/lang/EnumConstantNotPresentException;
        //  1956   1963   1963   1964   Any
        //  1957   1963   1963   1964   Ljava/lang/ClassCastException;
        //  1956   1963   3      8      Any
        //  2067   2074   2074   2075   Any
        //  2067   2074   3      8      Ljava/util/NoSuchElementException;
        //  2068   2074   3      8      Any
        //  2067   2074   2067   2068   Any
        //  2067   2074   3      8      Any
        //  2127   2134   2134   2135   Any
        //  2128   2134   2127   2128   Any
        //  2128   2134   3      8      Any
        //  2127   2134   2134   2135   Any
        //  2127   2134   2127   2128   Any
        //  2183   2190   2190   2191   Any
        //  2184   2190   2183   2184   Any
        //  2184   2190   2190   2191   Any
        //  2184   2190   3      8      Any
        //  2183   2190   2183   2184   Ljava/util/NoSuchElementException;
        //  2201   2210   2210   2211   Any
        //  2202   2210   2210   2211   Ljava/lang/StringIndexOutOfBoundsException;
        //  2202   2210   2201   2202   Any
        //  2201   2210   2201   2202   Ljava/lang/RuntimeException;
        //  2202   2210   3      8      Any
        //  2317   2326   2326   2327   Any
        //  2317   2326   3      8      Any
        //  2317   2326   3      8      Any
        //  2318   2326   2317   2318   Ljava/lang/IndexOutOfBoundsException;
        //  2318   2326   3      8      Ljava/lang/NullPointerException;
        //  2383   2389   2389   2390   Any
        //  2383   2389   3      8      Any
        //  2383   2389   2389   2390   Any
        //  2383   2389   2389   2390   Ljava/lang/NumberFormatException;
        //  2383   2389   2389   2390   Any
        //  2395   2402   2402   2403   Any
        //  2396   2402   2395   2396   Any
        //  2395   2402   2402   2403   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2395   2402   2402   2403   Ljava/lang/IllegalStateException;
        //  2396   2402   3      8      Any
        //  2458   2465   2465   2466   Any
        //  2458   2465   2458   2459   Ljava/lang/UnsupportedOperationException;
        //  2458   2465   2458   2459   Any
        //  2458   2465   2458   2459   Ljava/lang/NumberFormatException;
        //  2459   2465   3      8      Any
        //  2611   2618   2618   2619   Any
        //  2611   2618   3      8      Any
        //  2612   2618   2611   2612   Any
        //  2612   2618   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2612   2618   2611   2612   Any
        //  2724   2730   2730   2731   Any
        //  2724   2730   2730   2731   Any
        //  2724   2730   2730   2731   Ljava/lang/IndexOutOfBoundsException;
        //  2724   2730   2730   2731   Any
        //  2724   2730   2730   2731   Any
        //  2923   2930   2930   2931   Any
        //  2924   2930   2923   2924   Ljava/lang/RuntimeException;
        //  2924   2930   2930   2931   Ljava/lang/UnsupportedOperationException;
        //  2923   2930   3      8      Ljava/lang/AssertionError;
        //  2924   2930   2930   2931   Any
        //  3285   3292   3292   3293   Any
        //  3286   3292   3285   3286   Ljava/util/ConcurrentModificationException;
        //  3285   3292   3285   3286   Ljava/lang/AssertionError;
        //  3285   3292   3285   3286   Ljava/lang/AssertionError;
        //  3286   3292   3292   3293   Ljava/lang/NumberFormatException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:559)
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
    
    public void c(final boolean b) {
        fbS.4u(this, 917442724, b);
    }
    
    static {
        faZ.c = new faY(null);
        (faZ.c = new BlockPos[4][][][][])[0] = faZ.c.c(0);
        while (true) {
            int n = 0;
            Label_0045: {
                if (fc.c < 0) {
                    n = -1901560791;
                    break Label_0045;
                }
                n = 1636300492;
            }
            switch (n ^ 0x810796F0) {
                case 263187161: {
                    continue;
                }
                case -528457668: {
                    faZ.c[1] = faZ.c.c(1);
                    final BlockPos[][][][][] c = faZ.c;
                    final int n2 = 2;
                    while (true) {
                        int n3 = 0;
                        Label_0107: {
                            if (fc.1 != 0) {
                                n3 = -74499064;
                                break Label_0107;
                            }
                            n3 = -1154478533;
                        }
                        switch (n3 ^ 0x5904A043) {
                            case -1567908789: {
                                continue;
                            }
                            case -499863944: {
                                c[n2] = faZ.c.c(2);
                                while (true) {
                                    int n4 = 0;
                                    Label_0159: {
                                        if (fc.c < 0) {
                                            n4 = -895167224;
                                            break Label_0159;
                                        }
                                        n4 = 2025980635;
                                    }
                                    switch (n4 ^ 0x910F2F73) {
                                        case 1537997435: {
                                            continue;
                                        }
                                        case -372429400: {
                                            final BlockPos[][][][][] c2 = faZ.c;
                                            final int n5 = 3;
                                            while (true) {
                                                int n6 = 0;
                                                Label_0207: {
                                                    if (fc.0 != 0) {
                                                        n6 = -1533157160;
                                                        break Label_0207;
                                                    }
                                                    n6 = -1694858566;
                                                }
                                                switch (n6 ^ 0xB8A1C53B) {
                                                    case 106613452: {
                                                        continue;
                                                    }
                                                    default: {
                                                        c2[n5] = faZ.c.c(3);
                                                        return;
                                                    }
                                                    case 473703907: {
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(@Nullable final BlockPos blockPos) {
        fbS.42(this, 1602746244, blockPos);
    }
    
    public int a() {
        return fbS.bd(this, 1218239425);
    }
    
    public int c() {
        return fbS.bJ(this, 1672352560);
    }
    
    @NotNull
    public f0a 9() {
        return fbS.R(this, 602162849);
    }
    
    @NotNull
    public f0g 1() {
        return fbS.8L(this, 1201811478);
    }
}
