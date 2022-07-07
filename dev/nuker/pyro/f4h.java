// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;

public class f4H extends f4C
{
    public int c;
    public boolean c;
    @NotNull
    public String 0;
    public int 0;
    
    public void 0(final int n) {
        fbS.66(this, 1091369133, n);
    }
    
    public boolean c() {
        return fbS.el(this, 1089910149);
    }
    
    @Override
    public int c(@Nullable final ScaledResolution scaledResolution, final float n, final float n2) {
        return fbS.9F(this, 1885828333, scaledResolution, n, n2);
    }
    
    static {
        throw t;
    }
    
    public int 0() {
        return fbS.bg(this, 2031075167);
    }
    
    @NotNull
    public String 3() {
        return fbS.55(this, 663944312);
    }
    
    public void c(final int n) {
        fbS.61(this, 1482926561, n);
    }
    
    public void c(@NotNull final String s) {
        fbS.9i(this, 772409408, s);
    }
    
    public void c(final boolean b) {
        fbS.45(this, 1136078102, b);
    }
    
    public void 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          927
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            919
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            911
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f4C.c:Lnet/minecraft/client/Minecraft;
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             -148625113
        //    35: goto            40
        //    38: ldc             -1929738330
        //    40: ldc             1776450033
        //    42: ixor           
        //    43: lookupswitch {
        //          -1631170346: 38
        //          -451346857: 68
        //          default: 886
        //        }
        //    68: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    71: aload_0        
        //    72: getfield        dev/nuker/pyro/f4H.0:I
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73045_a:(I)Lnet/minecraft/entity/Entity;
        //    82: goto            86
        //    85: athrow         
        //    86: astore_1       
        //    87: aload_1        
        //    88: ifnull          96
        //    91: ldc             614359250
        //    93: goto            98
        //    96: ldc             614359249
        //    98: ldc             -579169745
        //   100: ixor           
        //   101: tableswitch {
        //          -204872198: 124
        //          -204872197: 875
        //          default: 91
        //        }
        //   124: getstatic       dev/nuker/pyro/fc.1:I
        //   127: ifeq            135
        //   130: ldc             -2041600639
        //   132: goto            137
        //   135: ldc             646426577
        //   137: ldc             66042438
        //   139: ixor           
        //   140: lookupswitch {
        //          -2053103673: 880
        //          567260202: 135
        //          default: 168
        //        }
        //   168: aload_0        
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            180
        //   175: ldc             -1650288589
        //   177: goto            182
        //   180: ldc             -585913964
        //   182: ldc             -1089539129
        //   184: ixor           
        //   185: lookupswitch {
        //          581725172: 180
        //          1646090835: 212
        //          default: 894
        //        }
        //   212: getstatic       kotlin/jvm/internal/StringCompanionObject.INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
        //   215: astore_2       
        //   216: ldc             "\u23d3\u1480\u8ac7\ub1a1\uce7b\uedde\ub275\ue6ac\udb16"
        //   218: goto            222
        //   221: athrow         
        //   222: invokestatic    invokestatic   !!! ERROR
        //   225: goto            229
        //   228: athrow         
        //   229: getstatic       dev/nuker/pyro/fc.c:I
        //   232: ifge            240
        //   235: ldc             1849283807
        //   237: goto            242
        //   240: ldc             634774837
        //   242: ldc             1645228965
        //   244: ixor           
        //   245: lookupswitch {
        //          -1466617408: 240
        //          204072826: 896
        //          default: 272
        //        }
        //   272: astore_3       
        //   273: iconst_2       
        //   274: anewarray       Ljava/lang/Object;
        //   277: dup            
        //   278: iconst_0       
        //   279: aload_1        
        //   280: getstatic       dev/nuker/pyro/fc.0:I
        //   283: ifeq            291
        //   286: ldc             -465666799
        //   288: goto            293
        //   291: ldc             739323621
        //   293: ldc             504458142
        //   295: ixor           
        //   296: lookupswitch {
        //          -97577329: 291
        //          838878587: 324
        //          default: 900
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   331: goto            335
        //   334: athrow         
        //   335: aastore        
        //   336: dup            
        //   337: iconst_1       
        //   338: getstatic       dev/nuker/pyro/f4C.c:Lnet/minecraft/client/Minecraft;
        //   341: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   344: getstatic       dev/nuker/pyro/fc.0:I
        //   347: ifeq            355
        //   350: ldc             -891656903
        //   352: goto            357
        //   355: ldc             -2119620072
        //   357: ldc             -86654630
        //   359: ixor           
        //   360: lookupswitch {
        //          806331491: 890
        //          1878710146: 355
        //          default: 388
        //        }
        //   388: aload_1        
        //   389: goto            393
        //   392: athrow         
        //   393: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   396: goto            400
        //   399: athrow         
        //   400: goto            404
        //   403: athrow         
        //   404: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   407: goto            411
        //   410: athrow         
        //   411: aastore        
        //   412: astore          4
        //   414: astore          6
        //   416: iconst_0       
        //   417: istore          5
        //   419: aload_3        
        //   420: aload           4
        //   422: dup            
        //   423: arraylength    
        //   424: goto            428
        //   427: athrow         
        //   428: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   431: goto            435
        //   434: athrow         
        //   435: goto            439
        //   438: athrow         
        //   439: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   442: goto            446
        //   445: athrow         
        //   446: dup            
        //   447: pop            
        //   448: getstatic       dev/nuker/pyro/fc.1:I
        //   451: ifeq            459
        //   454: ldc             -795059731
        //   456: goto            461
        //   459: ldc             -115410737
        //   461: ldc             2047213224
        //   463: ixor           
        //   464: lookupswitch {
        //          -2095380889: 492
        //          -1432770747: 459
        //          default: 888
        //        }
        //   492: astore          7
        //   494: getstatic       dev/nuker/pyro/fc.c:I
        //   497: ifge            505
        //   500: ldc             973685357
        //   502: goto            507
        //   505: ldc             -861626613
        //   507: ldc             -1388039325
        //   509: ixor           
        //   510: lookupswitch {
        //          -1756532466: 505
        //          1642114152: 536
        //          default: 892
        //        }
        //   536: aload           6
        //   538: aload           7
        //   540: putfield        dev/nuker/pyro/f4H.0:Ljava/lang/String;
        //   543: aload_1        
        //   544: getstatic       dev/nuker/pyro/f4C.c:Lnet/minecraft/client/Minecraft;
        //   547: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   550: checkcast       Lnet/minecraft/entity/Entity;
        //   553: goto            557
        //   556: athrow         
        //   557: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   560: goto            564
        //   563: athrow         
        //   564: fstore_2       
        //   565: getstatic       dev/nuker/pyro/fc.1:I
        //   568: ifeq            576
        //   571: ldc             -543865706
        //   573: goto            578
        //   576: ldc             697628781
        //   578: ldc             -313806492
        //   580: ixor           
        //   581: lookupswitch {
        //          -991999735: 608
        //          853472754: 576
        //          default: 876
        //        }
        //   608: fload_2        
        //   609: ldc             60.0
        //   611: fcmpl          
        //   612: iflt            620
        //   615: ldc             179314718
        //   617: goto            622
        //   620: ldc             179314719
        //   622: ldc             1008175090
        //   624: ixor           
        //   625: tableswitch {
        //          1833914328: 648
        //          1833914329: 653
        //          default: 615
        //        }
        //   648: ldc             120.0
        //   650: goto            656
        //   653: fload_2        
        //   654: fload_2        
        //   655: fadd           
        //   656: fstore_3       
        //   657: getstatic       dev/nuker/pyro/fc.1:I
        //   660: ifeq            668
        //   663: ldc             -591890865
        //   665: goto            670
        //   668: ldc             -1415502457
        //   670: ldc             95358496
        //   672: ixor           
        //   673: lookupswitch {
        //          -1374803033: 700
        //          -652773265: 668
        //          default: 882
        //        }
        //   700: aload_0        
        //   701: new             Ldev/nuker/pyro/fbI;
        //   704: dup            
        //   705: getstatic       dev/nuker/pyro/fc.c:I
        //   708: ifge            716
        //   711: ldc             -1306778123
        //   713: goto            718
        //   716: ldc             -1309673925
        //   718: ldc             1518249765
        //   720: ixor           
        //   721: lookupswitch {
        //          -396197168: 716
        //          -342798050: 748
        //          default: 884
        //        }
        //   748: fload_3        
        //   749: ldc             100.0
        //   751: ldc             50.0
        //   753: fconst_1       
        //   754: getstatic       dev/nuker/pyro/fc.0:I
        //   757: ifeq            765
        //   760: ldc             1095708413
        //   762: goto            767
        //   765: ldc             616917694
        //   767: ldc             -461838344
        //   769: ixor           
        //   770: lookupswitch {
        //          -1523070715: 765
        //          -1061319354: 796
        //          default: 898
        //        }
        //   796: goto            800
        //   799: athrow         
        //   800: invokespecial   dev/nuker/pyro/fbI.<init>:(FFFF)V
        //   803: goto            807
        //   806: athrow         
        //   807: getstatic       dev/nuker/pyro/fc.c:I
        //   810: ifge            818
        //   813: ldc             -1055568191
        //   815: goto            820
        //   818: ldc             -1559089631
        //   820: ldc             -1555796405
        //   822: ixor           
        //   823: lookupswitch {
        //          -2058410849: 818
        //          1649483914: 878
        //          default: 848
        //        }
        //   848: goto            852
        //   851: athrow         
        //   852: invokevirtual   dev/nuker/pyro/fbI.2:()Ljava/awt/Color;
        //   855: goto            859
        //   858: athrow         
        //   859: dup            
        //   860: pop            
        //   861: goto            865
        //   864: athrow         
        //   865: invokevirtual   java/awt/Color.getRGB:()I
        //   868: goto            872
        //   871: athrow         
        //   872: putfield        dev/nuker/pyro/f4H.c:I
        //   875: return         
        //   876: aconst_null    
        //   877: athrow         
        //   878: aconst_null    
        //   879: athrow         
        //   880: aconst_null    
        //   881: athrow         
        //   882: aconst_null    
        //   883: athrow         
        //   884: aconst_null    
        //   885: athrow         
        //   886: aconst_null    
        //   887: athrow         
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
        //   902: pop            
        //   903: goto            24
        //   906: pop            
        //   907: aconst_null    
        //   908: goto            902
        //   911: dup            
        //   912: ifnull          902
        //   915: checkcast       Ljava/lang/Throwable;
        //   918: athrow         
        //   919: dup            
        //   920: ifnull          906
        //   923: checkcast       Ljava/lang/Throwable;
        //   926: athrow         
        //   927: aconst_null    
        //   928: athrow         
        //    StackMapTable: 00 74 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FC 00 03 07 00 03 4D 07 00 67 FF 00 01 00 01 07 00 03 00 02 07 00 67 01 5B 07 00 67 FF 00 09 00 00 00 01 07 00 5F FF 00 00 00 01 07 00 03 00 02 07 00 6F 01 45 07 00 5F 40 07 00 96 FC 00 04 07 00 96 04 41 01 19 0A 41 01 1E 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 96 00 02 07 00 03 01 5D 07 00 03 FF 00 08 00 03 07 00 03 07 00 96 07 00 7E 00 01 07 00 5F FF 00 00 00 03 07 00 03 07 00 96 07 00 7E 00 02 07 00 03 07 00 B4 45 07 00 5F FF 00 00 00 03 07 00 03 07 00 96 07 00 7E 00 02 07 00 03 07 00 B4 FF 00 0A 00 03 07 00 03 07 00 96 07 00 7E 00 02 07 00 03 07 00 B4 FF 00 01 00 03 07 00 03 07 00 96 07 00 7E 00 03 07 00 03 07 00 B4 01 FF 00 1D 00 03 07 00 03 07 00 96 07 00 7E 00 02 07 00 03 07 00 B4 FF 00 12 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 96 FF 00 01 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 06 07 00 03 07 00 E9 07 00 E9 01 07 00 96 01 FF 00 1E 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 96 42 07 00 5F FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 96 45 07 00 5F FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 B4 FF 00 13 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 A2 FF 00 01 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 06 07 00 03 07 00 E9 07 00 E9 01 07 00 A2 01 FF 00 1E 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 A2 43 07 00 49 FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 06 07 00 03 07 00 E9 07 00 E9 01 07 00 A2 07 00 96 45 07 00 5F FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 02 42 07 00 5F FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 02 45 07 00 5F FF 00 00 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 A8 FF 00 0F 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 01 07 00 5F FF 00 00 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 03 07 00 B4 07 00 E9 01 45 07 00 5F FF 00 00 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 02 07 00 B4 07 00 E9 42 07 00 55 FF 00 00 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 02 07 00 B4 07 00 E9 45 07 00 5F 40 07 00 B4 4C 07 00 B4 FF 00 01 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 02 07 00 B4 01 5E 07 00 B4 FC 00 0C 07 00 B4 41 01 1C FF 00 13 00 00 00 01 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 96 07 00 96 45 07 00 5F 40 02 FF 00 0B 00 08 07 00 03 07 00 96 02 07 00 B4 07 00 E9 01 07 00 03 07 00 B4 00 00 41 01 1D 06 04 41 01 19 04 42 02 FF 00 0B 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 00 41 01 1D FF 00 0F 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 03 07 00 03 08 02 BD 08 02 BD FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 04 07 00 03 08 02 BD 08 02 BD 01 FF 00 1D 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 03 07 00 03 08 02 BD 08 02 BD FF 00 10 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 07 07 00 03 08 02 BD 08 02 BD 02 02 02 02 FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 08 07 00 03 08 02 BD 08 02 BD 02 02 02 02 01 FF 00 1C 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 07 07 00 03 08 02 BD 08 02 BD 02 02 02 02 42 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 07 07 00 03 08 02 BD 08 02 BD 02 02 02 02 45 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 CE FF 00 0A 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 CE FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 03 07 00 03 07 00 CE 01 FF 00 1B 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 CE FF 00 02 00 00 00 01 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 CE 45 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 E3 44 07 00 53 FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 E3 45 07 00 5F FF 00 00 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 01 FF 00 02 00 02 07 00 03 07 00 96 00 00 FF 00 00 00 08 07 00 03 07 00 96 02 07 00 B4 07 00 E9 01 07 00 03 07 00 B4 00 00 FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 02 07 00 03 07 00 CE FF 00 01 00 02 07 00 03 07 00 96 00 00 FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 00 FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 03 07 00 03 08 02 BD 08 02 BD FF 00 01 00 01 07 00 03 00 01 07 00 67 FF 00 01 00 07 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 00 01 07 00 B4 FF 00 01 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 A2 FF 00 01 00 08 07 00 03 07 00 96 07 00 7E 07 00 B4 07 00 E9 01 07 00 03 07 00 B4 00 00 FF 00 01 00 02 07 00 03 07 00 96 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 96 07 00 7E 00 02 07 00 03 07 00 B4 FF 00 01 00 08 07 00 03 07 00 96 02 02 07 00 E9 01 07 00 03 07 00 B4 00 07 07 00 03 08 02 BD 08 02 BD 02 02 02 02 FF 00 01 00 04 07 00 03 07 00 96 07 00 7E 07 00 B4 00 05 07 00 03 07 00 E9 07 00 E9 01 07 00 96 FF 00 01 00 01 07 00 03 00 01 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     911    919    Any
        //  911    919    911    919    Any
        //  927    929    3      8      Any
        //  79     85     85     86     Any
        //  79     85     3      8      Ljava/util/NoSuchElementException;
        //  79     85     85     86     Ljava/util/NoSuchElementException;
        //  79     85     3      8      Any
        //  79     85     3      8      Any
        //  221    228    228    229    Any
        //  221    228    221    222    Any
        //  221    228    221    222    Ljava/lang/NegativeArraySizeException;
        //  222    228    228    229    Ljava/lang/IllegalStateException;
        //  221    228    221    222    Ljava/lang/EnumConstantNotPresentException;
        //  327    334    334    335    Any
        //  328    334    3      8      Ljava/lang/NegativeArraySizeException;
        //  328    334    334    335    Ljava/lang/ClassCastException;
        //  327    334    334    335    Any
        //  327    334    327    328    Any
        //  392    399    399    400    Any
        //  392    399    3      8      Any
        //  392    399    3      8      Ljava/util/NoSuchElementException;
        //  393    399    399    400    Ljava/util/ConcurrentModificationException;
        //  392    399    392    393    Ljava/lang/EnumConstantNotPresentException;
        //  403    410    410    411    Any
        //  404    410    410    411    Any
        //  404    410    403    404    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  403    410    403    404    Any
        //  403    410    403    404    Ljava/lang/ClassCastException;
        //  427    434    434    435    Any
        //  428    434    434    435    Any
        //  428    434    434    435    Any
        //  428    434    3      8      Any
        //  428    434    427    428    Any
        //  438    445    445    446    Any
        //  439    445    438    439    Ljava/lang/NumberFormatException;
        //  438    445    438    439    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  438    445    445    446    Any
        //  438    445    445    446    Ljava/lang/IllegalArgumentException;
        //  557    563    563    564    Any
        //  557    563    3      8      Ljava/lang/IllegalArgumentException;
        //  557    563    563    564    Any
        //  557    563    3      8      Ljava/lang/RuntimeException;
        //  557    563    563    564    Any
        //  799    806    806    807    Any
        //  800    806    806    807    Any
        //  800    806    799    800    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  799    806    3      8      Ljava/lang/NullPointerException;
        //  800    806    799    800    Any
        //  852    858    858    859    Any
        //  852    858    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  852    858    3      8      Any
        //  852    858    858    859    Any
        //  852    858    3      8      Any
        //  864    871    871    872    Any
        //  864    871    3      8      Ljava/util/ConcurrentModificationException;
        //  864    871    871    872    Any
        //  865    871    871    872    Any
        //  865    871    864    865    Ljava/lang/IllegalArgumentException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
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
    
    public int 2() {
        return fbS.bC(this, 445567829);
    }
    
    @NotNull
    @Override
    public String 2() {
        return fbS.4X(this, 1689997989);
    }
    
    public f4H(@NotNull final String s, final boolean c, @NotNull final String 0, final int 2) {
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.1 != 0) {
                    n = -1052779059;
                    break Label_0019;
                }
                n = -147242822;
            }
            switch (n ^ 0xC5975C02) {
                case 1682429900: {
                    continue;
                }
                default: {
                    super(s);
                    while (true) {
                        int n2 = 0;
                        Label_0064: {
                            if (fc.0 != 0) {
                                n2 = -169802672;
                                break Label_0064;
                            }
                            n2 = 154685746;
                        }
                        switch (n2 ^ 0xFA753F91) {
                            case 1066590872: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                this.0 = 0;
                                while (true) {
                                    int n3 = 0;
                                    Label_0115: {
                                        if (fc.c < 0) {
                                            n3 = 70781189;
                                            break Label_0115;
                                        }
                                        n3 = 525223374;
                                    }
                                    switch (n3 ^ 0x245613D5) {
                                        case -1032574321: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0162: {
                                                    if (fc.1 != 0) {
                                                        n4 = 1290483816;
                                                        break Label_0162;
                                                    }
                                                    n4 = 1180788618;
                                                }
                                                switch (n4 ^ 0xA8936615) {
                                                    case -461873539: {
                                                        continue;
                                                    }
                                                    case -286129761: {
                                                        this.0 = 2;
                                                        this.c = -1;
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
                                        case 544086736: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 261372865: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 78152143: {
                    throw null;
                }
            }
            break;
        }
    }
}
