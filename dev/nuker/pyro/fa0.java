// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.Entity;

public class fa0 extends fH
{
    public f0a c;
    public f0k c;
    public f0a 0;
    public f0k 0;
    public f0a 1;
    public f0k 1;
    public static fac c;
    
    @NotNull
    public Vec3d c(@NotNull final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          998
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            990
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            982
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             -498609822
        //    34: goto            39
        //    37: ldc             -1870810318
        //    39: ldc             2052049745
        //    41: ixor           
        //    42: lookupswitch {
        //          -1744299469: 955
        //          1542908406: 37
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: aload_1        
        //    70: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    73: aload_1        
        //    74: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //    77: getstatic       dev/nuker/pyro/fc.1:I
        //    80: ifeq            88
        //    83: ldc             -1991240865
        //    85: goto            90
        //    88: ldc             -1772290038
        //    90: ldc             1744285748
        //    92: ixor           
        //    93: lookupswitch {
        //          -291003541: 88
        //          -240472002: 120
        //          default: 967
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   dev/nuker/pyro/fa0.c:(DD)D
        //   127: goto            131
        //   130: athrow         
        //   131: aload_0        
        //   132: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   135: dup            
        //   136: pop            
        //   137: getstatic       dev/nuker/pyro/fc.1:I
        //   140: ifeq            148
        //   143: ldc             2024066204
        //   145: goto            150
        //   148: ldc             1357199952
        //   150: ldc             34240061
        //   152: ixor           
        //   153: lookupswitch {
        //          1391414381: 180
        //          2058271393: 148
        //          default: 951
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   187: goto            191
        //   190: athrow         
        //   191: dup            
        //   192: ifnonnull       200
        //   195: ldc             -193674599
        //   197: goto            202
        //   200: ldc             -193674598
        //   202: ldc             1012277256
        //   204: ixor           
        //   205: tableswitch {
        //          -1874475742: 228
        //          -1874475741: 257
        //          default: 195
        //        }
        //   228: new             Lkotlin/TypeCastException;
        //   231: dup            
        //   232: ldc             "\u2933\u1486\u8020\ub1c4\uc4c1\ue738\ub225\uec0f\udb77\ue4fd\uadef\u1e0c\ueb27\uc7b3\u8c35\u83a3\u57a5\u7dd7\ubf38\ucd0e\u21db\uc234\u608c\u2f49\uda9f\u3f56\u7d66\u8361\u8215\u81d9\u8e71\ufb72\u7a07\u981e\u16d7\ufbbf\u493c\u82a4\uc892\uf273\ubc4b\u41fd\ub320\ub152\u4132\u803a\u7c27\uc4f4\u7f46\ue792\uec0a\u1696\ue49a\u3596\u4bf0\ueb28\u0a19\u8c5e\u1bf6\u0205\u7dce\u7289\ucd2e\ub9b9\u97b2\u60c9\ue2e8\udaf4\ua73b\u288a\u8379\u4f80\u81b3\u161a\uae93\u7a04\u55b5\u16ad\u63cc"
        //   234: goto            238
        //   237: athrow         
        //   238: invokestatic    invokestatic   !!! ERROR
        //   241: goto            245
        //   244: athrow         
        //   245: goto            249
        //   248: athrow         
        //   249: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   252: goto            256
        //   255: athrow         
        //   256: athrow         
        //   257: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   260: getstatic       dev/nuker/pyro/fc.c:I
        //   263: ifge            271
        //   266: ldc             -1790273697
        //   268: goto            273
        //   271: ldc             -1451578475
        //   273: ldc             -1338316628
        //   275: ixor           
        //   276: lookupswitch {
        //          -1126728951: 271
        //          628129779: 961
        //          default: 304
        //        }
        //   304: goto            308
        //   307: athrow         
        //   308: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosX:()D
        //   313: goto            317
        //   316: athrow         
        //   317: dsub           
        //   318: dstore_2       
        //   319: aload_0        
        //   320: aload_1        
        //   321: getstatic       dev/nuker/pyro/fc.c:I
        //   324: ifge            332
        //   327: ldc             1030964197
        //   329: goto            334
        //   332: ldc             2102252772
        //   334: ldc             -291340804
        //   336: ixor           
        //   337: lookupswitch {
        //          -1813010152: 364
        //          -741261799: 332
        //          default: 959
        //        }
        //   364: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   367: aload_1        
        //   368: getstatic       dev/nuker/pyro/fc.c:I
        //   371: ifge            379
        //   374: ldc             -1263504932
        //   376: goto            381
        //   379: ldc             -769459045
        //   381: ldc             -1203174197
        //   383: ixor           
        //   384: lookupswitch {
        //          217675031: 379
        //          1785460816: 412
        //          default: 949
        //        }
        //   412: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //   415: goto            419
        //   418: athrow         
        //   419: invokevirtual   dev/nuker/pyro/fa0.c:(DD)D
        //   422: goto            426
        //   425: athrow         
        //   426: getstatic       dev/nuker/pyro/fc.1:I
        //   429: ifeq            437
        //   432: ldc             -216691264
        //   434: goto            439
        //   437: ldc             1301056832
        //   439: ldc             1764971307
        //   441: ixor           
        //   442: lookupswitch {
        //          -1708728597: 971
        //          -1058165287: 437
        //          default: 468
        //        }
        //   468: aload_0        
        //   469: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   472: dup            
        //   473: pop            
        //   474: getstatic       dev/nuker/pyro/fc.0:I
        //   477: ifeq            485
        //   480: ldc             -1986112646
        //   482: goto            487
        //   485: ldc             -1756170163
        //   487: ldc             -1210934358
        //   489: ixor           
        //   490: lookupswitch {
        //          545285095: 516
        //          1045219536: 485
        //          default: 953
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   523: goto            527
        //   526: athrow         
        //   527: dup            
        //   528: ifnonnull       604
        //   531: new             Lkotlin/TypeCastException;
        //   534: dup            
        //   535: ldc             "\u2933\u1486\u8020\ub1c4\uc4c1\ue738\ub225\uec0f\udb77\ue4fd\uadef\u1e0c\ueb27\uc7b3\u8c35\u83a3\u57a5\u7dd7\ubf38\ucd0e\u21db\uc234\u608c\u2f49\uda9f\u3f56\u7d66\u8361\u8215\u81d9\u8e71\ufb72\u7a07\u981e\u16d7\ufbbf\u493c\u82a4\uc892\uf273\ubc4b\u41fd\ub320\ub152\u4132\u803a\u7c27\uc4f4\u7f46\ue792\uec0a\u1696\ue49a\u3596\u4bf0\ueb28\u0a19\u8c5e\u1bf6\u0205\u7dce\u7289\ucd2e\ub9b9\u97b2\u60c9\ue2e8\udaf4\ua73b\u288a\u8379\u4f80\u81b3\u161a\uae93\u7a04\u55b5\u16ad\u63cc"
        //   537: goto            541
        //   540: athrow         
        //   541: invokestatic    invokestatic   !!! ERROR
        //   544: goto            548
        //   547: athrow         
        //   548: getstatic       dev/nuker/pyro/fc.c:I
        //   551: ifge            559
        //   554: ldc             1277597817
        //   556: goto            561
        //   559: ldc             571333614
        //   561: ldc             1491256937
        //   563: ixor           
        //   564: lookupswitch {
        //          348413456: 559
        //          2062491015: 592
        //          default: 963
        //        }
        //   592: goto            596
        //   595: athrow         
        //   596: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   599: goto            603
        //   602: athrow         
        //   603: athrow         
        //   604: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   607: goto            611
        //   610: athrow         
        //   611: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosY:()D
        //   616: goto            620
        //   619: athrow         
        //   620: dsub           
        //   621: dstore          4
        //   623: getstatic       dev/nuker/pyro/fc.c:I
        //   626: ifge            634
        //   629: ldc             -969264572
        //   631: goto            636
        //   634: ldc             1442025389
        //   636: ldc             620107802
        //   638: ixor           
        //   639: lookupswitch {
        //          -489936290: 634
        //          1896191927: 664
        //          default: 965
        //        }
        //   664: aload_0        
        //   665: aload_1        
        //   666: getstatic       dev/nuker/pyro/fc.0:I
        //   669: ifeq            677
        //   672: ldc             1356702647
        //   674: goto            679
        //   677: ldc             -349255714
        //   679: ldc             -1249625472
        //   681: ixor           
        //   682: lookupswitch {
        //          -857262046: 677
        //          -447112905: 957
        //          default: 708
        //        }
        //   708: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   711: getstatic       dev/nuker/pyro/fc.1:I
        //   714: ifeq            722
        //   717: ldc             1618642386
        //   719: goto            724
        //   722: ldc             1223990411
        //   724: ldc             1509662343
        //   726: ixor           
        //   727: lookupswitch {
        //          286196236: 752
        //          964762453: 722
        //          default: 945
        //        }
        //   752: aload_1        
        //   753: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //   756: goto            760
        //   759: athrow         
        //   760: invokevirtual   dev/nuker/pyro/fa0.c:(DD)D
        //   763: goto            767
        //   766: athrow         
        //   767: aload_0        
        //   768: getstatic       dev/nuker/pyro/fc.c:I
        //   771: ifge            779
        //   774: ldc             -432277825
        //   776: goto            781
        //   779: ldc             -1188811907
        //   781: ldc             1786633768
        //   783: ixor           
        //   784: lookupswitch {
        //          -1941559145: 947
        //          -1736624419: 779
        //          default: 812
        //        }
        //   812: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   815: dup            
        //   816: pop            
        //   817: goto            821
        //   820: athrow         
        //   821: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   824: goto            828
        //   827: athrow         
        //   828: dup            
        //   829: ifnonnull       861
        //   832: new             Lkotlin/TypeCastException;
        //   835: dup            
        //   836: ldc             "\u2933\u1486\u8020\ub1c4\uc4c1\ue738\ub225\uec0f\udb77\ue4fd\uadef\u1e0c\ueb27\uc7b3\u8c35\u83a3\u57a5\u7dd7\ubf38\ucd0e\u21db\uc234\u608c\u2f49\uda9f\u3f56\u7d66\u8361\u8215\u81d9\u8e71\ufb72\u7a07\u981e\u16d7\ufbbf\u493c\u82a4\uc892\uf273\ubc4b\u41fd\ub320\ub152\u4132\u803a\u7c27\uc4f4\u7f46\ue792\uec0a\u1696\ue49a\u3596\u4bf0\ueb28\u0a19\u8c5e\u1bf6\u0205\u7dce\u7289\ucd2e\ub9b9\u97b2\u60c9\ue2e8\udaf4\ua73b\u288a\u8379\u4f80\u81b3\u161a\uae93\u7a04\u55b5\u16ad\u63cc"
        //   838: goto            842
        //   841: athrow         
        //   842: invokestatic    invokestatic   !!! ERROR
        //   845: goto            849
        //   848: athrow         
        //   849: goto            853
        //   852: athrow         
        //   853: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   856: goto            860
        //   859: athrow         
        //   860: athrow         
        //   861: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   864: goto            868
        //   867: athrow         
        //   868: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosZ:()D
        //   873: goto            877
        //   876: athrow         
        //   877: dsub           
        //   878: dstore          6
        //   880: new             Lnet/minecraft/util/math/Vec3d;
        //   883: dup            
        //   884: getstatic       dev/nuker/pyro/fc.c:I
        //   887: ifge            895
        //   890: ldc             493793438
        //   892: goto            897
        //   895: ldc             -1390103499
        //   897: ldc             -1421604901
        //   899: ixor           
        //   900: lookupswitch {
        //          -1238714555: 969
        //          -729112271: 895
        //          default: 928
        //        }
        //   928: dload_2        
        //   929: dload           4
        //   931: dload           6
        //   933: goto            937
        //   936: athrow         
        //   937: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   940: goto            944
        //   943: athrow         
        //   944: areturn        
        //   945: aconst_null    
        //   946: athrow         
        //   947: aconst_null    
        //   948: athrow         
        //   949: aconst_null    
        //   950: athrow         
        //   951: aconst_null    
        //   952: athrow         
        //   953: aconst_null    
        //   954: athrow         
        //   955: aconst_null    
        //   956: athrow         
        //   957: aconst_null    
        //   958: athrow         
        //   959: aconst_null    
        //   960: athrow         
        //   961: aconst_null    
        //   962: athrow         
        //   963: aconst_null    
        //   964: athrow         
        //   965: aconst_null    
        //   966: athrow         
        //   967: aconst_null    
        //   968: athrow         
        //   969: aconst_null    
        //   970: athrow         
        //   971: aconst_null    
        //   972: athrow         
        //   973: pop            
        //   974: goto            24
        //   977: pop            
        //   978: aconst_null    
        //   979: goto            973
        //   982: dup            
        //   983: ifnull          973
        //   986: checkcast       Ljava/lang/Throwable;
        //   989: athrow         
        //   990: dup            
        //   991: ifnull          977
        //   994: checkcast       Ljava/lang/Throwable;
        //   997: athrow         
        //   998: aconst_null    
        //   999: athrow         
        //    StackMapTable: 00 88 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FD 00 03 07 00 03 07 00 35 0C 41 01 1C FF 00 13 00 02 07 00 03 07 00 35 00 03 07 00 03 03 03 FF 00 01 00 02 07 00 03 07 00 35 00 04 07 00 03 03 03 01 FF 00 1D 00 02 07 00 03 07 00 35 00 03 07 00 03 03 03 42 07 00 1F FF 00 00 00 02 07 00 03 07 00 35 00 03 07 00 03 03 03 45 07 00 2E 40 03 FF 00 10 00 02 07 00 03 07 00 35 00 02 03 07 00 4C FF 00 01 00 02 07 00 03 07 00 35 00 03 03 07 00 4C 01 FF 00 1D 00 02 07 00 03 07 00 35 00 02 03 07 00 4C 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 02 03 07 00 4C 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 02 03 07 00 A0 FF 00 03 00 02 07 00 03 07 00 35 00 02 03 07 00 A0 FF 00 04 00 02 07 00 03 07 00 35 00 02 03 07 00 A0 FF 00 01 00 02 07 00 03 07 00 35 00 03 03 07 00 A0 01 FF 00 19 00 02 07 00 03 07 00 35 00 02 03 07 00 A0 FF 00 08 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 05 03 07 00 A0 08 00 E4 08 00 E4 07 00 A2 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 05 03 07 00 A0 08 00 E4 08 00 E4 07 00 A2 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 05 03 07 00 A0 08 00 E4 08 00 E4 07 00 A2 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 03 03 07 00 A0 07 00 55 FF 00 00 00 02 07 00 03 07 00 35 00 02 03 07 00 A0 FF 00 0D 00 02 07 00 03 07 00 35 00 02 03 07 00 62 FF 00 01 00 02 07 00 03 07 00 35 00 03 03 07 00 62 01 FF 00 1E 00 02 07 00 03 07 00 35 00 02 03 07 00 62 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 02 03 07 00 62 47 07 00 2E FF 00 00 00 02 07 00 03 07 00 35 00 02 03 03 FF 00 0E 00 03 07 00 03 07 00 35 03 00 02 07 00 03 07 00 35 FF 00 01 00 03 07 00 03 07 00 35 03 00 03 07 00 03 07 00 35 01 FF 00 1D 00 03 07 00 03 07 00 35 03 00 02 07 00 03 07 00 35 FF 00 0E 00 03 07 00 03 07 00 35 03 00 03 07 00 03 03 07 00 35 FF 00 01 00 03 07 00 03 07 00 35 03 00 04 07 00 03 03 07 00 35 01 FF 00 1E 00 03 07 00 03 07 00 35 03 00 03 07 00 03 03 07 00 35 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 03 07 00 03 03 03 45 07 00 2E 40 03 4A 03 FF 00 01 00 03 07 00 03 07 00 35 03 00 02 03 01 5C 03 FF 00 10 00 03 07 00 03 07 00 35 03 00 02 03 07 00 4C FF 00 01 00 03 07 00 03 07 00 35 03 00 03 03 07 00 4C 01 FF 00 1C 00 03 07 00 03 07 00 35 03 00 02 03 07 00 4C 42 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 02 03 07 00 4C 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 02 03 07 00 A0 4C 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 FF 00 0A 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 FF 00 01 00 03 07 00 03 07 00 35 03 00 06 03 07 00 A0 08 02 13 08 02 13 07 00 A2 01 FF 00 1E 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 42 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 03 03 07 00 A0 07 00 55 FF 00 00 00 03 07 00 03 07 00 35 03 00 02 03 07 00 A0 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 02 03 07 00 62 47 07 00 2E FF 00 00 00 03 07 00 03 07 00 35 03 00 02 03 03 FC 00 0D 03 41 01 1B FF 00 0C 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 07 00 35 FF 00 01 00 04 07 00 03 07 00 35 03 03 00 03 07 00 03 07 00 35 01 FF 00 1C 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 07 00 35 FF 00 0D 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 03 FF 00 01 00 04 07 00 03 07 00 35 03 03 00 03 07 00 03 03 01 FF 00 1B 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 03 46 07 00 13 FF 00 00 00 04 07 00 03 07 00 35 03 03 00 03 07 00 03 03 03 45 07 00 2E 40 03 FF 00 0B 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 03 FF 00 01 00 04 07 00 03 07 00 35 03 03 00 03 03 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 03 47 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 4C 45 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 A0 4C 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 05 03 07 00 A0 08 03 40 08 03 40 07 00 A2 45 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 05 03 07 00 A0 08 03 40 08 03 40 07 00 A2 42 07 00 1F FF 00 00 00 04 07 00 03 07 00 35 03 03 00 05 03 07 00 A0 08 03 40 08 03 40 07 00 A2 45 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 03 03 07 00 A0 07 00 55 FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 A0 FF 00 05 00 00 00 01 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 62 47 07 00 2E FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 03 03 FF 00 11 00 05 07 00 03 07 00 35 03 03 03 00 02 08 03 70 08 03 70 FF 00 01 00 05 07 00 03 07 00 35 03 03 03 00 03 08 03 70 08 03 70 01 FF 00 1E 00 05 07 00 03 07 00 35 03 03 03 00 02 08 03 70 08 03 70 47 07 00 2E FF 00 00 00 05 07 00 03 07 00 35 03 03 03 00 05 08 03 70 08 03 70 03 03 03 45 07 00 2E 40 07 00 98 FF 00 00 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 03 FF 00 01 00 04 07 00 03 07 00 35 03 03 00 02 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 35 03 00 03 07 00 03 03 07 00 35 FF 00 01 00 02 07 00 03 07 00 35 00 02 03 07 00 4C FF 00 01 00 03 07 00 03 07 00 35 03 00 02 03 07 00 4C FA 00 01 FF 00 01 00 04 07 00 03 07 00 35 03 03 00 02 07 00 03 07 00 35 FF 00 01 00 03 07 00 03 07 00 35 03 00 02 07 00 03 07 00 35 FF 00 01 00 02 07 00 03 07 00 35 00 02 03 07 00 62 FF 00 01 00 03 07 00 03 07 00 35 03 00 05 03 07 00 A0 08 02 13 08 02 13 07 00 A2 FC 00 01 03 FF 00 01 00 02 07 00 03 07 00 35 00 03 07 00 03 03 03 FF 00 01 00 05 07 00 03 07 00 35 03 03 03 00 02 08 03 70 08 03 70 FF 00 01 00 03 07 00 03 07 00 35 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 35 00 01 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     982    990    Ljava/util/NoSuchElementException;
        //  982    990    982    990    Ljava/lang/IllegalArgumentException;
        //  998    1000   3      8      Any
        //  123    130    130    131    Any
        //  123    130    123    124    Ljava/lang/StringIndexOutOfBoundsException;
        //  124    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    123    124    Ljava/lang/ClassCastException;
        //  183    190    190    191    Any
        //  184    190    3      8      Any
        //  184    190    190    191    Any
        //  184    190    3      8      Any
        //  183    190    183    184    Any
        //  238    244    244    245    Any
        //  238    244    3      8      Any
        //  238    244    244    245    Ljava/lang/IllegalArgumentException;
        //  238    244    3      8      Ljava/lang/ArithmeticException;
        //  238    244    244    245    Ljava/lang/NullPointerException;
        //  248    255    255    256    Any
        //  249    255    3      8      Any
        //  248    255    255    256    Any
        //  249    255    248    249    Any
        //  248    255    255    256    Ljava/lang/IllegalStateException;
        //  307    316    316    317    Any
        //  307    316    316    317    Any
        //  307    316    307    308    Any
        //  308    316    316    317    Ljava/lang/NumberFormatException;
        //  307    316    316    317    Ljava/lang/NullPointerException;
        //  418    425    425    426    Any
        //  418    425    418    419    Any
        //  418    425    418    419    Ljava/lang/RuntimeException;
        //  419    425    425    426    Any
        //  419    425    418    419    Ljava/util/NoSuchElementException;
        //  519    526    526    527    Any
        //  519    526    526    527    Ljava/lang/IllegalStateException;
        //  519    526    519    520    Any
        //  520    526    526    527    Ljava/lang/NullPointerException;
        //  519    526    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  540    547    547    548    Any
        //  540    547    3      8      Any
        //  541    547    540    541    Any
        //  541    547    3      8      Any
        //  540    547    3      8      Ljava/lang/RuntimeException;
        //  595    602    602    603    Any
        //  596    602    602    603    Ljava/lang/NullPointerException;
        //  596    602    595    596    Any
        //  596    602    3      8      Any
        //  596    602    602    603    Ljava/util/ConcurrentModificationException;
        //  610    619    619    620    Any
        //  611    619    610    611    Ljava/lang/NumberFormatException;
        //  610    619    619    620    Any
        //  611    619    3      8      Any
        //  610    619    610    611    Any
        //  759    766    766    767    Any
        //  759    766    759    760    Ljava/lang/StringIndexOutOfBoundsException;
        //  760    766    766    767    Ljava/lang/ArithmeticException;
        //  760    766    766    767    Ljava/lang/UnsupportedOperationException;
        //  760    766    766    767    Ljava/util/NoSuchElementException;
        //  820    827    827    828    Any
        //  820    827    3      8      Ljava/lang/UnsupportedOperationException;
        //  821    827    820    821    Ljava/lang/IllegalStateException;
        //  820    827    827    828    Ljava/lang/UnsupportedOperationException;
        //  820    827    820    821    Any
        //  841    848    848    849    Any
        //  842    848    841    842    Any
        //  842    848    841    842    Any
        //  841    848    841    842    Ljava/lang/AssertionError;
        //  841    848    3      8      Any
        //  852    859    859    860    Any
        //  852    859    852    853    Ljava/lang/StringIndexOutOfBoundsException;
        //  852    859    852    853    Ljava/lang/ArithmeticException;
        //  852    859    3      8      Ljava/util/ConcurrentModificationException;
        //  853    859    859    860    Ljava/lang/NullPointerException;
        //  868    876    876    877    Any
        //  868    876    3      8      Any
        //  868    876    876    877    Ljava/lang/IndexOutOfBoundsException;
        //  868    876    3      8      Any
        //  868    876    3      8      Any
        //  936    943    943    944    Any
        //  936    943    936    937    Ljava/lang/IllegalStateException;
        //  936    943    943    944    Ljava/lang/AssertionError;
        //  937    943    936    937    Any
        //  937    943    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:622)
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
    
    public fa0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u292f\u1492\u8022\ub3de\uc697\ue70d\ub22d\uec12\ud97d\ue6e0\uadf7\u1e45\ueb3f\uc5a2\u8e74"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u290f\u1492\u8022\ub3de\uc697\ue70d\ub22d\uec12\ud97d\ue6e0\uadf7\u1e45\ueb3f\uc5a2\u8e74"
        //     8: getstatic       dev/nuker/pyro/fc.c:I
        //    11: ifge            19
        //    14: ldc             -1147995954
        //    16: goto            21
        //    19: ldc             -1632646822
        //    21: ldc             1425484771
        //    23: ixor           
        //    24: lookupswitch {
        //          -900144455: 52
        //          -278539475: 19
        //          default: 915
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u290e\u149b\u8023\ub3ce\uc681\ue77b\ub225\uec41\ud96b\ue6e8\uade9\u1e4f\ueb29\uc5a2\u8e26\u83b7\u57ac\u7dc1\ubd2f\ucf58\u218f\uc222\u60c3\u2d43\ud8c3\u3f59\u7d25\u836b\u8051\u83c3\u8e73\ufb37\u7a1e\u9a1f\u14d1\ufba9\u493c\u82a3\uca87\uf078\ubc45\u41e3\ub339\ub349\u4327\u802d"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0a;
        //    67: dup            
        //    68: ldc             "\u292e\u1496\u8020\ub3df"
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            81
        //    76: ldc             -1152896519
        //    78: goto            83
        //    81: ldc             1419576682
        //    83: ldc             -1997571688
        //    85: ixor           
        //    86: lookupswitch {
        //          -596476686: 112
        //          866601057: 81
        //          default: 929
        //        }
        //   112: invokestatic    invokestatic   !!! ERROR
        //   115: ldc             "\u290e\u1496\u8020\ub3df"
        //   117: invokestatic    invokestatic   !!! ERROR
        //   120: aconst_null    
        //   121: iconst_1       
        //   122: getstatic       dev/nuker/pyro/fc.c:I
        //   125: ifge            133
        //   128: ldc             -647042546
        //   130: goto            135
        //   133: ldc             -3234838
        //   135: ldc             -1166053985
        //   137: ixor           
        //   138: lookupswitch {
        //          -1041785749: 133
        //          1662093201: 939
        //          default: 164
        //        }
        //   164: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   167: putfield        dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/f0a;
        //   170: getstatic       dev/nuker/pyro/fc.1:I
        //   173: ifeq            181
        //   176: ldc             213758140
        //   178: goto            183
        //   181: ldc             1721281443
        //   183: ldc             -1080510633
        //   185: ixor           
        //   186: lookupswitch {
        //          -1289418773: 181
        //          -654304012: 212
        //          default: 935
        //        }
        //   212: aload_0        
        //   213: aload_0        
        //   214: new             Ldev/nuker/pyro/f0k;
        //   217: dup            
        //   218: getstatic       dev/nuker/pyro/fc.0:I
        //   221: ifeq            229
        //   224: ldc             1568182797
        //   226: goto            231
        //   229: ldc             -1455682031
        //   231: ldc             -209159625
        //   233: ixor           
        //   234: lookupswitch {
        //          -1359943622: 229
        //          1521775654: 260
        //          default: 917
        //        }
        //   260: aload_0        
        //   261: getfield        dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/f0a;
        //   264: checkcast       Ldev/nuker/pyro/f0n;
        //   267: getstatic       dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/fac;
        //   270: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   273: sipush          255
        //   276: sipush          255
        //   279: sipush          255
        //   282: sipush          255
        //   285: getstatic       dev/nuker/pyro/fc.1:I
        //   288: ifeq            296
        //   291: ldc             -256844521
        //   293: goto            298
        //   296: ldc             1126237794
        //   298: ldc             137984894
        //   300: ixor           
        //   301: lookupswitch {
        //          -125196695: 296
        //          1259896092: 328
        //          default: 911
        //        }
        //   328: invokevirtual   dev/nuker/pyro/fR.c:(IIII)Ldev/nuker/pyro/fS;
        //   331: getstatic       dev/nuker/pyro/fc.0:I
        //   334: ifeq            342
        //   337: ldc             1946648316
        //   339: goto            344
        //   342: ldc             -498835553
        //   344: ldc             2001405344
        //   346: ixor           
        //   347: lookupswitch {
        //          55343964: 937
        //          1042305662: 342
        //          default: 372
        //        }
        //   372: invokestatic    dev/nuker/pyro/fac.c:(Ldev/nuker/pyro/fac;Ldev/nuker/pyro/fS;)[Ldev/nuker/pyro/f0n;
        //   375: dup            
        //   376: arraylength    
        //   377: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   380: checkcast       [Ldev/nuker/pyro/f0n;
        //   383: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //   386: checkcast       Ldev/nuker/pyro/f0n;
        //   389: getstatic       dev/nuker/pyro/fc.c:I
        //   392: ifge            400
        //   395: ldc             1722550458
        //   397: goto            402
        //   400: ldc             776406933
        //   402: ldc             -2029118870
        //   404: ixor           
        //   405: lookupswitch {
        //          -1454825985: 432
        //          -509472048: 400
        //          default: 923
        //        }
        //   432: invokevirtual   dev/nuker/pyro/fa0.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   435: checkcast       Ldev/nuker/pyro/f0k;
        //   438: getstatic       dev/nuker/pyro/fc.c:I
        //   441: ifge            449
        //   444: ldc             -1457447324
        //   446: goto            451
        //   449: ldc             983689267
        //   451: ldc             350891895
        //   453: ixor           
        //   454: lookupswitch {
        //          -1110757101: 449
        //          776718148: 480
        //          default: 931
        //        }
        //   480: putfield        dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/f0k;
        //   483: getstatic       dev/nuker/pyro/fc.c:I
        //   486: ifge            494
        //   489: ldc             1683494076
        //   491: goto            496
        //   494: ldc             -1186235800
        //   496: ldc             295286809
        //   498: ixor           
        //   499: lookupswitch {
        //          804057270: 494
        //          1975626917: 913
        //          default: 524
        //        }
        //   524: aload_0        
        //   525: new             Ldev/nuker/pyro/f0a;
        //   528: dup            
        //   529: ldc             "\u292d\u149f\u802d\ub3c0\uc697\ue729\ub237"
        //   531: invokestatic    invokestatic   !!! ERROR
        //   534: ldc             "\u290d\u149f\u802d\ub3c0\uc697\ue729\ub237"
        //   536: getstatic       dev/nuker/pyro/fc.0:I
        //   539: ifeq            547
        //   542: ldc             -1583352914
        //   544: goto            550
        //   547: ldc_w           2102935571
        //   550: ldc_w           -493428359
        //   553: ixor           
        //   554: lookupswitch {
        //          -1613848214: 580
        //          1124668119: 547
        //          default: 919
        //        }
        //   580: invokestatic    invokestatic   !!! ERROR
        //   583: aconst_null    
        //   584: iconst_1       
        //   585: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   588: putfield        dev/nuker/pyro/fa0.0:Ldev/nuker/pyro/f0a;
        //   591: aload_0        
        //   592: aload_0        
        //   593: new             Ldev/nuker/pyro/f0k;
        //   596: dup            
        //   597: aload_0        
        //   598: getfield        dev/nuker/pyro/fa0.0:Ldev/nuker/pyro/f0a;
        //   601: checkcast       Ldev/nuker/pyro/f0n;
        //   604: getstatic       dev/nuker/pyro/fc.0:I
        //   607: ifeq            616
        //   610: ldc_w           -1188651164
        //   613: goto            619
        //   616: ldc_w           -526796324
        //   619: ldc_w           -1744322410
        //   622: ixor           
        //   623: lookupswitch {
        //          555835378: 616
        //          2023651658: 648
        //          default: 933
        //        }
        //   648: getstatic       dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/fac;
        //   651: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   654: sipush          255
        //   657: iconst_0       
        //   658: iconst_0       
        //   659: sipush          255
        //   662: invokevirtual   dev/nuker/pyro/fR.c:(IIII)Ldev/nuker/pyro/fS;
        //   665: invokestatic    dev/nuker/pyro/fac.c:(Ldev/nuker/pyro/fac;Ldev/nuker/pyro/fS;)[Ldev/nuker/pyro/f0n;
        //   668: dup            
        //   669: arraylength    
        //   670: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   673: checkcast       [Ldev/nuker/pyro/f0n;
        //   676: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //   679: checkcast       Ldev/nuker/pyro/f0n;
        //   682: invokevirtual   dev/nuker/pyro/fa0.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   685: checkcast       Ldev/nuker/pyro/f0k;
        //   688: putfield        dev/nuker/pyro/fa0.0:Ldev/nuker/pyro/f0k;
        //   691: aload_0        
        //   692: new             Ldev/nuker/pyro/f0a;
        //   695: dup            
        //   696: ldc_w           "\u293b\u1481\u8025\ub3dc\uc69c\ue73f\ub237"
        //   699: invokestatic    invokestatic   !!! ERROR
        //   702: ldc_w           "\u291b\u1481\u8025\ub3dc\uc69c\ue73f\ub237"
        //   705: invokestatic    invokestatic   !!! ERROR
        //   708: aconst_null    
        //   709: iconst_1       
        //   710: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   713: putfield        dev/nuker/pyro/fa0.1:Ldev/nuker/pyro/f0a;
        //   716: aload_0        
        //   717: aload_0        
        //   718: new             Ldev/nuker/pyro/f0k;
        //   721: dup            
        //   722: getstatic       dev/nuker/pyro/fc.c:I
        //   725: ifge            734
        //   728: ldc_w           -1132966585
        //   731: goto            737
        //   734: ldc_w           210163337
        //   737: ldc_w           -969827145
        //   740: ixor           
        //   741: lookupswitch {
        //          -893957570: 768
        //          2051658224: 734
        //          default: 927
        //        }
        //   768: aload_0        
        //   769: getfield        dev/nuker/pyro/fa0.1:Ldev/nuker/pyro/f0a;
        //   772: checkcast       Ldev/nuker/pyro/f0n;
        //   775: getstatic       dev/nuker/pyro/fc.c:I
        //   778: ifge            787
        //   781: ldc_w           -2098866808
        //   784: goto            790
        //   787: ldc_w           1820474661
        //   790: ldc_w           -772642741
        //   793: ixor           
        //   794: lookupswitch {
        //          -1452534951: 787
        //          1394064835: 921
        //          default: 820
        //        }
        //   820: getstatic       dev/nuker/pyro/fa0.c:Ldev/nuker/pyro/fac;
        //   823: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   826: iconst_5       
        //   827: sipush          255
        //   830: sipush          240
        //   833: sipush          255
        //   836: invokevirtual   dev/nuker/pyro/fR.c:(IIII)Ldev/nuker/pyro/fS;
        //   839: getstatic       dev/nuker/pyro/fc.c:I
        //   842: ifge            851
        //   845: ldc_w           1638609915
        //   848: goto            854
        //   851: ldc_w           549545754
        //   854: ldc_w           1031992909
        //   857: ixor           
        //   858: lookupswitch {
        //          956630744: 851
        //          1546241462: 925
        //          default: 884
        //        }
        //   884: invokestatic    dev/nuker/pyro/fac.c:(Ldev/nuker/pyro/fac;Ldev/nuker/pyro/fS;)[Ldev/nuker/pyro/f0n;
        //   887: dup            
        //   888: arraylength    
        //   889: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   892: checkcast       [Ldev/nuker/pyro/f0n;
        //   895: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //   898: checkcast       Ldev/nuker/pyro/f0n;
        //   901: invokevirtual   dev/nuker/pyro/fa0.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   904: checkcast       Ldev/nuker/pyro/f0k;
        //   907: putfield        dev/nuker/pyro/fa0.1:Ldev/nuker/pyro/f0k;
        //   910: return         
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
        //   925: aconst_null    
        //   926: athrow         
        //   927: aconst_null    
        //   928: athrow         
        //   929: aconst_null    
        //   930: athrow         
        //   931: aconst_null    
        //   932: athrow         
        //   933: aconst_null    
        //   934: athrow         
        //   935: aconst_null    
        //   936: athrow         
        //   937: aconst_null    
        //   938: athrow         
        //   939: aconst_null    
        //   940: athrow         
        //    StackMapTable: 00 3C FF 00 13 00 01 06 00 03 06 07 00 A2 07 00 A2 FF 00 01 00 01 06 00 04 06 07 00 A2 07 00 A2 01 FF 00 1E 00 01 06 00 03 06 07 00 A2 07 00 A2 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 A2 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 A2 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 A2 FF 00 14 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 A2 07 00 A2 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 00 40 08 00 40 07 00 A2 07 00 A2 05 01 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 A2 07 00 A2 05 01 10 41 01 1C FF 00 10 00 01 07 00 03 00 04 07 00 03 07 00 03 08 00 D6 08 00 D6 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 D6 08 00 D6 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 07 00 03 08 00 D6 08 00 D6 FF 00 23 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 D6 01 01 01 01 FF 00 01 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 D6 01 01 01 01 01 FF 00 1D 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 D6 01 01 01 01 FF 00 0D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 CE FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 CE 01 FF 00 1B 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 CE FF 00 1B 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 CA FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 CA 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 CA FF 00 10 00 01 07 00 03 00 02 07 00 03 07 00 C5 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 C5 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 C5 0D 41 01 1B FF 00 16 00 01 07 00 03 00 05 07 00 03 08 02 0D 08 02 0D 07 00 A2 07 00 A2 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 02 0D 08 02 0D 07 00 A2 07 00 A2 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 02 0D 08 02 0D 07 00 A2 07 00 A2 FF 00 23 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 51 08 02 51 07 00 CA FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 51 08 02 51 07 00 CA 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 51 08 02 51 07 00 CA FF 00 55 00 01 07 00 03 00 04 07 00 03 07 00 03 08 02 CE 08 02 CE FF 00 02 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 CE 08 02 CE 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 07 00 03 08 02 CE 08 02 CE FF 00 12 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA 07 00 DE 07 00 CE FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA 07 00 DE 07 00 CE 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA 07 00 DE 07 00 CE FF 00 1A 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 D6 01 01 01 01 01 FF 00 01 00 01 06 00 03 06 07 00 A2 07 00 A2 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 08 00 D6 08 00 D6 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 02 0D 08 02 0D 07 00 A2 07 00 A2 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 CA FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 07 00 CA 07 00 DE 07 00 CE FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 08 02 CE 08 02 CE FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 A2 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 C5 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 02 51 08 02 51 07 00 CA 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 D6 08 00 D6 07 00 CA 07 00 DE 07 00 CE FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 A2 07 00 A2 05 01
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
    
    public void c(@NotNull final EntityPlayer p0, @NotNull final fS p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1593
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1585
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1577
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: sipush          770
        //    31: sipush          771
        //    34: goto            38
        //    37: athrow         
        //    38: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179112_b:(II)V
        //    41: goto            45
        //    44: athrow         
        //    45: fconst_2       
        //    46: goto            50
        //    49: athrow         
        //    50: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187441_d:(F)V
        //    53: goto            57
        //    56: athrow         
        //    57: goto            61
        //    60: athrow         
        //    61: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //    64: goto            68
        //    67: athrow         
        //    68: iconst_0       
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //    76: goto            80
        //    79: athrow         
        //    80: goto            84
        //    83: athrow         
        //    84: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179097_i:()V
        //    87: goto            91
        //    90: athrow         
        //    91: aload_2        
        //    92: goto            96
        //    95: athrow         
        //    96: invokevirtual   dev/nuker/pyro/fS.8:()F
        //    99: goto            103
        //   102: athrow         
        //   103: aload_2        
        //   104: goto            108
        //   107: athrow         
        //   108: invokevirtual   dev/nuker/pyro/fS.2:()F
        //   111: goto            115
        //   114: athrow         
        //   115: aload_2        
        //   116: getstatic       dev/nuker/pyro/fc.1:I
        //   119: ifeq            128
        //   122: ldc_w           -56011116
        //   125: goto            131
        //   128: ldc_w           795522855
        //   131: ldc_w           -70352175
        //   134: ixor           
        //   135: lookupswitch {
        //          45883951: 128
        //          124245061: 1528
        //          default: 160
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokevirtual   dev/nuker/pyro/fS.b:()F
        //   167: goto            171
        //   170: athrow         
        //   171: aload_2        
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   dev/nuker/pyro/fS.9:()F
        //   179: goto            183
        //   182: athrow         
        //   183: getstatic       dev/nuker/pyro/fc.0:I
        //   186: ifeq            195
        //   189: ldc_w           -174861949
        //   192: goto            198
        //   195: ldc_w           -411116643
        //   198: ldc_w           1771123983
        //   201: ixor           
        //   202: lookupswitch {
        //          -1896878446: 228
        //          -1677532020: 195
        //          default: 1554
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   235: goto            239
        //   238: athrow         
        //   239: goto            243
        //   242: athrow         
        //   243: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179140_f:()V
        //   246: goto            250
        //   249: athrow         
        //   250: aload_1        
        //   251: aload_0        
        //   252: getstatic       dev/nuker/pyro/fc.0:I
        //   255: ifeq            264
        //   258: ldc_w           1413618430
        //   261: goto            267
        //   264: ldc_w           1207557405
        //   267: ldc_w           -2093055087
        //   270: ixor           
        //   271: lookupswitch {
        //          -993567092: 296
        //          -679700113: 264
        //          default: 1536
        //        }
        //   296: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   299: dup            
        //   300: pop            
        //   301: goto            305
        //   304: athrow         
        //   305: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
        //   308: goto            312
        //   311: athrow         
        //   312: dup            
        //   313: ifnonnull       327
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   323: goto            327
        //   326: athrow         
        //   327: goto            331
        //   330: athrow         
        //   331: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   334: goto            338
        //   337: athrow         
        //   338: ifeq            597
        //   341: goto            345
        //   344: athrow         
        //   345: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179096_D:()V
        //   348: goto            352
        //   351: athrow         
        //   352: aload_0        
        //   353: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   356: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   359: dup            
        //   360: ifnonnull       369
        //   363: ldc_w           124129454
        //   366: goto            372
        //   369: ldc_w           124129453
        //   372: ldc_w           -925376141
        //   375: ixor           
        //   376: tableswitch {
        //          -1620843590: 400
        //          -1620843589: 520
        //          default: 363
        //        }
        //   400: new             Lkotlin/TypeCastException;
        //   403: dup            
        //   404: ldc_w           "\u2933\u1486\u8020\ub1c4\uc4c1\ue738\ub225\uec0f\udb77\ue4fd\uadef\u1e0c\ueb27\uc7b3\u8c35\u83a3\u57a5\u7dd7\ubf38\ucd0e\u21db\uc234\u608c\u2f49\uda9f\u3f56\u7d66\u8361\u8215\u81d9\u8e71\ufb72\u7a07\u981e\u16d7\ufbbf\u493c\u82a4\uc892\uf273\ubc4b\u41fd\ub320\ub152\u4132\u803a\u7c27\uc4f4\u7f46\ue792\uec0a\u1696\ue49a\u3596\u4bf0\ueb28\u0a19\u8c5e\u1be1\u020e\u7dd4\u7284\ucd3f\ub9b2\u97ad\u60cd\ue2e8\udaf1\ua739\u289d\u836e\u4fb3\u8191\u161a\uae95\u7a12\u55b5\u16b1\u63d1\u1cca"
        //   407: getstatic       dev/nuker/pyro/fc.0:I
        //   410: ifeq            419
        //   413: ldc_w           -961227541
        //   416: goto            422
        //   419: ldc_w           2023441224
        //   422: ldc_w           -1639706366
        //   425: ixor           
        //   426: lookupswitch {
        //          -421572022: 452
        //          1492174313: 419
        //          default: 1556
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokestatic    invokestatic   !!! ERROR
        //   459: goto            463
        //   462: athrow         
        //   463: getstatic       dev/nuker/pyro/fc.1:I
        //   466: ifeq            475
        //   469: ldc_w           -478929915
        //   472: goto            478
        //   475: ldc_w           768217560
        //   478: ldc_w           -2106506790
        //   481: ixor           
        //   482: lookupswitch {
        //          -99318794: 475
        //          1627741663: 1548
        //          default: 508
        //        }
        //   508: goto            512
        //   511: athrow         
        //   512: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   515: goto            519
        //   518: athrow         
        //   519: athrow         
        //   520: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //   523: aload_0        
        //   524: getfield        dev/nuker/pyro/fa0.c:Lnet/minecraft/client/Minecraft;
        //   527: dup            
        //   528: pop            
        //   529: goto            533
        //   532: athrow         
        //   533: invokevirtual   net/minecraft/client/Minecraft.func_184121_ak:()F
        //   536: goto            540
        //   539: athrow         
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            552
        //   546: ldc_w           1822927325
        //   549: goto            555
        //   552: ldc_w           -1701169145
        //   555: ldc_w           -663816391
        //   558: ixor           
        //   559: lookupswitch {
        //          -1261871388: 1542
        //          1529621080: 552
        //          default: 584
        //        }
        //   584: goto            588
        //   587: athrow         
        //   588: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.orientCam:(F)V
        //   593: goto            597
        //   596: athrow         
        //   597: aload_0        
        //   598: getstatic       dev/nuker/pyro/fc.1:I
        //   601: ifeq            610
        //   604: ldc_w           1195607182
        //   607: goto            613
        //   610: ldc_w           608470010
        //   613: ldc_w           -626665307
        //   616: ixor           
        //   617: lookupswitch {
        //          -1645847509: 610
        //          -18785441: 644
        //          default: 1550
        //        }
        //   644: aload_1        
        //   645: checkcast       Lnet/minecraft/entity/Entity;
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   dev/nuker/pyro/fa0.c:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;
        //   655: goto            659
        //   658: athrow         
        //   659: astore_3       
        //   660: ldc_w           5.0
        //   663: fstore          4
        //   665: bipush          100
        //   667: istore          5
        //   669: ldc2_w          6.283185307179586
        //   672: dstore          6
        //   674: iconst_2       
        //   675: getstatic       dev/nuker/pyro/fc.c:I
        //   678: ifge            687
        //   681: ldc_w           -45667071
        //   684: goto            690
        //   687: ldc_w           1687152911
        //   690: ldc_w           1698505548
        //   693: ixor           
        //   694: lookupswitch {
        //          -1736831411: 687
        //          28494403: 720
        //          default: 1534
        //        }
        //   720: goto            724
        //   723: athrow         
        //   724: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187447_r:(I)V
        //   727: goto            731
        //   730: athrow         
        //   731: iconst_0       
        //   732: getstatic       dev/nuker/pyro/fc.0:I
        //   735: ifeq            744
        //   738: ldc_w           -150160225
        //   741: goto            747
        //   744: ldc_w           687177836
        //   747: ldc_w           -24039834
        //   750: ixor           
        //   751: lookupswitch {
        //          -552667583: 744
        //          161321721: 1552
        //          default: 776
        //        }
        //   776: istore          8
        //   778: iload           8
        //   780: iload           5
        //   782: if_icmpgt       791
        //   785: ldc_w           1051162089
        //   788: goto            794
        //   791: ldc_w           1051162088
        //   794: ldc_w           -283155561
        //   797: ixor           
        //   798: tableswitch {
        //          -1552929540: 820
        //          -1552929539: 1456
        //          default: 785
        //        }
        //   820: aload_3        
        //   821: getstatic       dev/nuker/pyro/fc.c:I
        //   824: ifge            833
        //   827: ldc_w           334725861
        //   830: goto            836
        //   833: ldc_w           281919507
        //   836: ldc_w           -1196025441
        //   839: ixor           
        //   840: lookupswitch {
        //          -1468278388: 868
        //          -1421501574: 833
        //          default: 1566
        //        }
        //   868: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   871: d2f            
        //   872: getstatic       dev/nuker/pyro/fc.1:I
        //   875: ifeq            884
        //   878: ldc_w           1401731296
        //   881: goto            887
        //   884: ldc_w           1726117272
        //   887: ldc_w           -776850435
        //   890: ixor           
        //   891: lookupswitch {
        //          -2109830371: 1538
        //          2042720307: 884
        //          default: 916
        //        }
        //   916: fload           4
        //   918: iload           8
        //   920: i2d            
        //   921: dload           6
        //   923: dmul           
        //   924: iload           5
        //   926: i2d            
        //   927: ddiv           
        //   928: dstore          9
        //   930: fstore          13
        //   932: fstore          12
        //   934: iconst_0       
        //   935: istore          11
        //   937: getstatic       dev/nuker/pyro/fc.c:I
        //   940: ifge            949
        //   943: ldc_w           -1901340715
        //   946: goto            952
        //   949: ldc_w           1932909509
        //   952: ldc_w           168281181
        //   955: ixor           
        //   956: lookupswitch {
        //          -2069097592: 1530
        //          39347455: 949
        //          default: 984
        //        }
        //   984: dload           9
        //   986: goto            990
        //   989: athrow         
        //   990: invokestatic    java/lang/Math.cos:(D)D
        //   993: goto            997
        //   996: athrow         
        //   997: dstore          14
        //   999: getstatic       dev/nuker/pyro/fc.0:I
        //  1002: ifeq            1011
        //  1005: ldc_w           -1645999800
        //  1008: goto            1014
        //  1011: ldc_w           -492590495
        //  1014: ldc_w           2144708817
        //  1017: ixor           
        //  1018: lookupswitch {
        //          -1653210448: 1044
        //          -500063847: 1011
        //          default: 1558
        //        }
        //  1044: fload           12
        //  1046: fload           13
        //  1048: dload           14
        //  1050: d2f            
        //  1051: fmul           
        //  1052: fadd           
        //  1053: getstatic       dev/nuker/pyro/fc.1:I
        //  1056: ifeq            1065
        //  1059: ldc_w           -1744021913
        //  1062: goto            1068
        //  1065: ldc_w           -1358238227
        //  1068: ldc_w           -1026829960
        //  1071: ixor           
        //  1072: lookupswitch {
        //          -1318250588: 1065
        //          1523025695: 1562
        //          default: 1100
        //        }
        //  1100: aload_3        
        //  1101: getstatic       dev/nuker/pyro/fc.0:I
        //  1104: ifeq            1113
        //  1107: ldc_w           497785972
        //  1110: goto            1116
        //  1113: ldc_w           283540769
        //  1116: ldc_w           -1460921855
        //  1119: ixor           
        //  1120: lookupswitch {
        //          -1253603723: 1113
        //          -1207277792: 1148
        //          default: 1544
        //        }
        //  1148: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //  1151: d2f            
        //  1152: aload_3        
        //  1153: getstatic       dev/nuker/pyro/fc.c:I
        //  1156: ifge            1165
        //  1159: ldc_w           -345207947
        //  1162: goto            1168
        //  1165: ldc_w           -975786316
        //  1168: ldc_w           1076849066
        //  1171: ixor           
        //  1172: lookupswitch {
        //          -2047228130: 1200
        //          -1421614369: 1165
        //          default: 1560
        //        }
        //  1200: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1203: d2f            
        //  1204: fload           4
        //  1206: iload           8
        //  1208: i2d            
        //  1209: getstatic       dev/nuker/pyro/fc.1:I
        //  1212: ifeq            1221
        //  1215: ldc_w           2037009554
        //  1218: goto            1224
        //  1221: ldc_w           -844484906
        //  1224: ldc_w           -1306333099
        //  1227: ixor           
        //  1228: lookupswitch {
        //          -884425529: 1221
        //          2139676291: 1256
        //          default: 1546
        //        }
        //  1256: dload           6
        //  1258: dmul           
        //  1259: iload           5
        //  1261: i2d            
        //  1262: ddiv           
        //  1263: dstore          9
        //  1265: fstore          15
        //  1267: fstore          14
        //  1269: fstore          13
        //  1271: getstatic       dev/nuker/pyro/fc.0:I
        //  1274: ifeq            1283
        //  1277: ldc_w           1446536550
        //  1280: goto            1286
        //  1283: ldc_w           255014323
        //  1286: ldc_w           1696251317
        //  1289: ixor           
        //  1290: lookupswitch {
        //          857921747: 1283
        //          1781106694: 1316
        //          default: 1540
        //        }
        //  1316: fstore          12
        //  1318: iconst_0       
        //  1319: istore          11
        //  1321: dload           9
        //  1323: goto            1327
        //  1326: athrow         
        //  1327: invokestatic    java/lang/Math.sin:(D)D
        //  1330: goto            1334
        //  1333: athrow         
        //  1334: dstore          16
        //  1336: fload           12
        //  1338: fload           13
        //  1340: getstatic       dev/nuker/pyro/fc.c:I
        //  1343: ifge            1352
        //  1346: ldc_w           81408698
        //  1349: goto            1355
        //  1352: ldc_w           1704308449
        //  1355: ldc_w           -1389332295
        //  1358: ixor           
        //  1359: lookupswitch {
        //          -1444263421: 1352
        //          -928655784: 1384
        //          default: 1564
        //        }
        //  1384: fload           14
        //  1386: getstatic       dev/nuker/pyro/fc.c:I
        //  1389: ifge            1398
        //  1392: ldc_w           1300473341
        //  1395: goto            1401
        //  1398: ldc_w           -635862971
        //  1401: ldc_w           1463771785
        //  1404: ixor           
        //  1405: lookupswitch {
        //          -1824329626: 1398
        //          448579444: 1532
        //          default: 1432
        //        }
        //  1432: fload           15
        //  1434: dload           16
        //  1436: d2f            
        //  1437: fmul           
        //  1438: fadd           
        //  1439: goto            1443
        //  1442: athrow         
        //  1443: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187435_e:(FFF)V
        //  1446: goto            1450
        //  1449: athrow         
        //  1450: iinc            8, 1
        //  1453: goto            778
        //  1456: goto            1460
        //  1459: athrow         
        //  1460: invokestatic    net/minecraft/client/renderer/GlStateManager.func_187437_J:()V
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: goto            1471
        //  1470: athrow         
        //  1471: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //  1474: goto            1478
        //  1477: athrow         
        //  1478: iconst_1       
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: goto            1494
        //  1493: athrow         
        //  1494: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //  1497: goto            1501
        //  1500: athrow         
        //  1501: fconst_1       
        //  1502: fconst_1       
        //  1503: fconst_1       
        //  1504: fconst_1       
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //  1512: goto            1516
        //  1515: athrow         
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179145_e:()V
        //  1523: goto            1527
        //  1526: athrow         
        //  1527: return         
        //  1528: aconst_null    
        //  1529: athrow         
        //  1530: aconst_null    
        //  1531: athrow         
        //  1532: aconst_null    
        //  1533: athrow         
        //  1534: aconst_null    
        //  1535: athrow         
        //  1536: aconst_null    
        //  1537: athrow         
        //  1538: aconst_null    
        //  1539: athrow         
        //  1540: aconst_null    
        //  1541: athrow         
        //  1542: aconst_null    
        //  1543: athrow         
        //  1544: aconst_null    
        //  1545: athrow         
        //  1546: aconst_null    
        //  1547: athrow         
        //  1548: aconst_null    
        //  1549: athrow         
        //  1550: aconst_null    
        //  1551: athrow         
        //  1552: aconst_null    
        //  1553: athrow         
        //  1554: aconst_null    
        //  1555: athrow         
        //  1556: aconst_null    
        //  1557: athrow         
        //  1558: aconst_null    
        //  1559: athrow         
        //  1560: aconst_null    
        //  1561: athrow         
        //  1562: aconst_null    
        //  1563: athrow         
        //  1564: aconst_null    
        //  1565: athrow         
        //  1566: aconst_null    
        //  1567: athrow         
        //  1568: pop            
        //  1569: goto            24
        //  1572: pop            
        //  1573: aconst_null    
        //  1574: goto            1568
        //  1577: dup            
        //  1578: ifnull          1568
        //  1581: checkcast       Ljava/lang/Throwable;
        //  1584: athrow         
        //  1585: dup            
        //  1586: ifnull          1572
        //  1589: checkcast       Ljava/lang/Throwable;
        //  1592: athrow         
        //  1593: aconst_null    
        //  1594: athrow         
        //    StackMapTable: 00 DC 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FE 00 03 07 00 03 07 01 D5 07 00 CE 4C 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 01 01 45 07 00 2E 00 FF 00 03 00 00 00 01 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 01 02 45 07 00 2E 00 42 07 00 0F 00 45 07 00 2E 00 43 07 00 2E 40 01 45 07 00 2E 00 42 07 00 2E 00 45 07 00 2E 00 43 07 00 2E 40 07 00 CE 45 07 00 2E 40 02 43 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 02 07 00 CE 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 02 02 FF 00 0C 00 03 07 00 03 07 01 D5 07 00 CE 00 03 02 02 07 00 CE FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 07 00 CE 01 FF 00 1C 00 03 07 00 03 07 01 D5 07 00 CE 00 03 02 02 07 00 CE 42 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 03 02 02 07 00 CE 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 03 02 02 02 43 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 07 00 CE 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 02 FF 00 0B 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 02 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 05 02 02 02 02 01 FF 00 1D 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 02 42 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 02 45 07 00 2E 00 42 07 00 2E 00 45 07 00 2E 00 FF 00 0D 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 03 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 03 07 01 D5 07 00 03 01 FF 00 1C 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 03 47 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 4C 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 35 46 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 35 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 35 42 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 35 45 07 00 2E 40 01 45 07 00 2E 00 45 07 00 2E 00 4A 07 01 D7 45 07 01 D7 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D7 01 5B 07 01 D7 FF 00 12 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 05 07 01 D7 08 01 90 08 01 90 07 00 A2 01 FF 00 1D 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 42 07 00 25 FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 FF 00 0B 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 05 07 01 D7 08 01 90 08 01 90 07 00 A2 01 FF 00 1D 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D7 07 00 55 40 07 01 D7 4B 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 07 00 4C 45 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 02 FF 00 0B 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 02 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 03 07 01 72 02 01 FF 00 1C 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 02 42 07 00 0F FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 02 47 07 00 2E 00 4C 07 00 03 FF 00 02 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 00 03 01 5E 07 00 03 46 07 00 2E FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 00 03 07 00 35 45 07 00 2E 40 07 00 98 FF 00 1B 00 07 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 00 01 01 FF 00 02 00 07 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 00 02 01 01 5D 01 42 07 00 2E 40 01 45 07 00 2E 00 4C 01 FF 00 02 00 07 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 00 02 01 01 5C 01 FC 00 01 01 06 05 42 01 19 4C 07 00 98 FF 00 02 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 02 07 00 98 01 5F 07 00 98 4F 02 FF 00 02 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 02 02 01 5C 02 FF 00 20 00 0C 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 00 00 42 01 1F 44 07 00 2E 40 03 45 07 00 2E 40 03 FC 00 0D 03 42 01 1D 54 02 FF 00 02 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 02 02 01 5F 02 FF 00 0C 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 02 02 07 00 98 FF 00 02 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 03 02 07 00 98 01 FF 00 1F 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 02 02 07 00 98 FF 00 10 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 03 02 02 07 00 98 FF 00 02 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 04 02 02 07 00 98 01 FF 00 1F 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 03 02 02 07 00 98 FF 00 14 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 05 02 02 02 02 03 FF 00 02 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 06 02 02 02 02 03 01 FF 00 1F 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 05 02 02 02 02 03 FF 00 1A 00 0E 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 00 01 02 FF 00 02 00 0E 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 00 02 02 01 5D 02 49 07 00 2E 40 03 45 07 00 2E 40 03 FF 00 11 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 02 02 02 FF 00 02 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 03 02 02 01 FF 00 1C 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 02 02 02 FF 00 0D 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 03 02 02 02 FF 00 02 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 04 02 02 02 01 FF 00 1E 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 03 02 02 02 FF 00 09 00 00 00 01 07 00 2E FF 00 00 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 03 02 02 02 45 07 00 2E 00 FF 00 05 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 00 42 07 00 2E 00 45 07 00 2E 00 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 00 45 07 00 2E 00 43 07 00 2E 40 01 45 07 00 2E 00 42 07 00 15 00 45 07 00 2E 00 46 07 00 2E FF 00 00 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 04 02 02 02 02 45 07 00 2E 00 42 07 00 2E 00 45 07 00 2E 00 FF 00 00 00 03 07 00 03 07 01 D5 07 00 CE 00 03 02 02 07 00 CE FF 00 01 00 0C 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 00 00 FF 00 01 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 03 02 02 02 FF 00 01 00 07 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 00 01 01 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 D5 07 00 03 FF 00 01 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 01 02 FF 00 01 00 0E 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 00 01 02 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 02 07 01 72 02 FF 00 01 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 02 02 07 00 98 FF 00 01 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 05 02 02 02 02 03 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 41 07 00 03 FF 00 01 00 07 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 00 01 01 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 04 02 02 02 02 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 04 07 01 D7 08 01 90 08 01 90 07 00 A2 FF 00 01 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 00 FF 00 01 00 0D 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 03 00 03 02 02 07 00 98 41 02 FF 00 01 00 0F 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 03 01 02 02 02 02 03 00 02 02 02 FF 00 01 00 08 07 00 03 07 01 D5 07 00 CE 07 00 98 02 01 03 01 00 01 07 00 98 FF 00 01 00 03 07 00 03 07 01 D5 07 00 CE 00 01 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1577   1585   Ljava/lang/RuntimeException;
        //  1577   1585   1577   1585   Ljava/util/NoSuchElementException;
        //  1593   1595   3      8      Any
        //  37     44     44     45     Any
        //  38     44     37     38     Any
        //  38     44     3      8      Any
        //  37     44     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  37     44     44     45     Any
        //  50     56     56     57     Any
        //  50     56     3      8      Any
        //  50     56     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  50     56     56     57     Any
        //  50     56     56     57     Any
        //  60     67     67     68     Any
        //  61     67     3      8      Any
        //  61     67     60     61     Ljava/util/NoSuchElementException;
        //  60     67     67     68     Any
        //  61     67     67     68     Any
        //  72     79     79     80     Any
        //  73     79     72     73     Any
        //  72     79     72     73     Any
        //  72     79     79     80     Any
        //  73     79     79     80     Ljava/lang/AssertionError;
        //  83     90     90     91     Any
        //  84     90     3      8      Any
        //  83     90     83     84     Any
        //  84     90     83     84     Ljava/lang/NegativeArraySizeException;
        //  84     90     90     91     Ljava/lang/EnumConstantNotPresentException;
        //  95     102    102    103    Any
        //  96     102    95     96     Ljava/lang/UnsupportedOperationException;
        //  95     102    95     96     Ljava/lang/IllegalArgumentException;
        //  95     102    95     96     Ljava/lang/AssertionError;
        //  95     102    95     96     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  107    114    114    115    Any
        //  107    114    107    108    Any
        //  107    114    3      8      Any
        //  108    114    107    108    Ljava/lang/NegativeArraySizeException;
        //  108    114    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  163    170    170    171    Any
        //  164    170    170    171    Any
        //  164    170    163    164    Any
        //  163    170    170    171    Any
        //  164    170    170    171    Any
        //  175    182    182    183    Any
        //  175    182    175    176    Any
        //  175    182    3      8      Ljava/lang/NegativeArraySizeException;
        //  175    182    175    176    Any
        //  175    182    175    176    Any
        //  231    238    238    239    Any
        //  232    238    3      8      Ljava/lang/UnsupportedOperationException;
        //  232    238    231    232    Ljava/lang/NegativeArraySizeException;
        //  231    238    231    232    Ljava/lang/NegativeArraySizeException;
        //  231    238    231    232    Any
        //  242    249    249    250    Any
        //  243    249    3      8      Ljava/lang/AssertionError;
        //  243    249    3      8      Any
        //  243    249    242    243    Any
        //  242    249    249    250    Ljava/lang/NullPointerException;
        //  304    311    311    312    Any
        //  304    311    311    312    Any
        //  305    311    3      8      Any
        //  304    311    304    305    Any
        //  305    311    311    312    Any
        //  319    326    326    327    Any
        //  319    326    326    327    Any
        //  320    326    319    320    Any
        //  319    326    319    320    Ljava/lang/IndexOutOfBoundsException;
        //  320    326    3      8      Any
        //  330    337    337    338    Any
        //  331    337    3      8      Ljava/util/ConcurrentModificationException;
        //  331    337    330    331    Any
        //  331    337    3      8      Any
        //  331    337    3      8      Any
        //  344    351    351    352    Any
        //  345    351    344    345    Any
        //  344    351    3      8      Ljava/util/NoSuchElementException;
        //  344    351    351    352    Any
        //  344    351    344    345    Ljava/lang/ArithmeticException;
        //  455    462    462    463    Any
        //  456    462    3      8      Ljava/lang/ClassCastException;
        //  456    462    462    463    Any
        //  456    462    462    463    Any
        //  455    462    455    456    Ljava/lang/AssertionError;
        //  512    518    518    519    Any
        //  512    518    3      8      Any
        //  512    518    518    519    Ljava/lang/ArithmeticException;
        //  512    518    3      8      Ljava/util/NoSuchElementException;
        //  512    518    518    519    Any
        //  532    539    539    540    Any
        //  533    539    539    540    Any
        //  533    539    539    540    Any
        //  533    539    532    533    Any
        //  532    539    3      8      Any
        //  587    596    596    597    Any
        //  588    596    3      8      Any
        //  587    596    587    588    Ljava/util/NoSuchElementException;
        //  587    596    3      8      Any
        //  587    596    3      8      Any
        //  651    658    658    659    Any
        //  652    658    651    652    Any
        //  651    658    651    652    Any
        //  652    658    651    652    Any
        //  652    658    658    659    Any
        //  723    730    730    731    Any
        //  724    730    3      8      Any
        //  724    730    730    731    Any
        //  723    730    723    724    Any
        //  723    730    730    731    Any
        //  989    996    996    997    Any
        //  990    996    989    990    Any
        //  990    996    996    997    Any
        //  989    996    989    990    Any
        //  989    996    996    997    Any
        //  1326   1333   1333   1334   Any
        //  1327   1333   1326   1327   Any
        //  1327   1333   3      8      Any
        //  1327   1333   1333   1334   Any
        //  1327   1333   1326   1327   Ljava/lang/IllegalStateException;
        //  1443   1449   1449   1450   Any
        //  1443   1449   1449   1450   Ljava/lang/AssertionError;
        //  1443   1449   1449   1450   Any
        //  1443   1449   1449   1450   Ljava/lang/UnsupportedOperationException;
        //  1443   1449   3      8      Ljava/lang/NumberFormatException;
        //  1459   1466   1466   1467   Any
        //  1460   1466   1466   1467   Ljava/lang/NullPointerException;
        //  1459   1466   1466   1467   Ljava/lang/NegativeArraySizeException;
        //  1459   1466   1459   1460   Any
        //  1459   1466   1459   1460   Any
        //  1471   1477   1477   1478   Any
        //  1471   1477   1477   1478   Ljava/lang/ArithmeticException;
        //  1471   1477   1477   1478   Ljava/lang/ClassCastException;
        //  1471   1477   3      8      Ljava/lang/ArithmeticException;
        //  1471   1477   3      8      Any
        //  1482   1489   1489   1490   Any
        //  1482   1489   1482   1483   Any
        //  1482   1489   1482   1483   Ljava/lang/RuntimeException;
        //  1482   1489   3      8      Any
        //  1482   1489   1482   1483   Any
        //  1493   1500   1500   1501   Any
        //  1494   1500   1493   1494   Ljava/lang/ClassCastException;
        //  1494   1500   1500   1501   Any
        //  1494   1500   1500   1501   Ljava/lang/ArithmeticException;
        //  1494   1500   3      8      Ljava/lang/AssertionError;
        //  1508   1515   1515   1516   Any
        //  1509   1515   1515   1516   Any
        //  1509   1515   1508   1509   Any
        //  1509   1515   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1508   1515   1515   1516   Ljava/lang/StringIndexOutOfBoundsException;
        //  1519   1526   1526   1527   Any
        //  1519   1526   1519   1520   Any
        //  1519   1526   3      8      Ljava/lang/ArithmeticException;
        //  1519   1526   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1520   1526   3      8      Ljava/lang/EnumConstantNotPresentException;
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
    
    @Override
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.91(this, 218559262, vec3d, n);
    }
    
    public double c(final double n, final double n2) {
        return fbS.gA(this, 1122675423, n, n2);
    }
    
    static {
        fa0.c = new fac(null);
    }
}
