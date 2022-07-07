// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.NoSuchElementException;
import java.util.ArrayList;
import dev.nuker.pyro.hacks.stashfinder.StashFinderConfig;
import org.jetbrains.annotations.Nullable;
import java.io.File;
import net.minecraft.world.chunk.Chunk;
import java.util.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class faG
{
    @NotNull
    public List<faB> c;
    @NotNull
    public List<fax> 0;
    @NotNull
    public List<faB> 1;
    public ArrayDeque<Chunk> c;
    public Thread c;
    public Thread 0;
    @Nullable
    public static File c;
    @NotNull
    public static StashFinderConfig c;
    @NotNull
    public static faG c;
    public static faC c;
    
    @NotNull
    public List 4() {
        return fbS.gF(this, 1894950694);
    }
    
    public static void c(final File file) {
        fbS.8I(null, 1487231406, file);
    }
    
    public void 1(@NotNull final List list) {
        fbS.fC(this, 108954439, list);
    }
    
    public static StashFinderConfig c() {
        return fbS.3E(null, 448931672);
    }
    
    public void c(@NotNull final Chunk chunk) {
        fbS.3D(this, 1154127008, chunk);
    }
    
    public static File 6() {
        return fbS.2r(null, 1999017689);
    }
    
    public void c(@NotNull final List list) {
        fbS.fA(this, 193477730, list);
    }
    
    public void c(@NotNull final fax p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          922
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            914
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            906
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -870830838
        //    35: goto            40
        //    38: ldc             -371179898
        //    40: ldc             878087938
        //    42: ixor           
        //    43: lookupswitch {
        //          -129064440: 877
        //          2007249734: 38
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/faG.1:Ljava/util/List;
        //    71: goto            75
        //    74: athrow         
        //    75: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    80: goto            84
        //    83: athrow         
        //    84: getstatic       dev/nuker/pyro/fc.c:I
        //    87: ifge            95
        //    90: ldc             2109003515
        //    92: goto            97
        //    95: ldc             -1870420562
        //    97: ldc             -989476875
        //    99: ixor           
        //   100: lookupswitch {
        //          -1196355314: 95
        //          1434870363: 128
        //          default: 875
        //        }
        //   128: astore_3       
        //   129: getstatic       dev/nuker/pyro/fc.c:I
        //   132: ifge            140
        //   135: ldc             -1092228598
        //   137: goto            142
        //   140: ldc             249885034
        //   142: ldc             562958735
        //   144: ixor           
        //   145: lookupswitch {
        //          -1620313211: 140
        //          795533541: 172
        //          default: 891
        //        }
        //   172: aload_3        
        //   173: goto            177
        //   176: athrow         
        //   177: invokeinterface java/util/Iterator.hasNext:()Z
        //   182: goto            186
        //   185: athrow         
        //   186: ifeq            646
        //   189: aload_3        
        //   190: goto            194
        //   193: athrow         
        //   194: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   199: goto            203
        //   202: athrow         
        //   203: checkcast       Ldev/nuker/pyro/faB;
        //   206: astore_2       
        //   207: aload_2        
        //   208: goto            212
        //   211: athrow         
        //   212: invokevirtual   dev/nuker/pyro/faB.1:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   215: goto            219
        //   218: athrow         
        //   219: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   222: getstatic       dev/nuker/pyro/fc.0:I
        //   225: ifeq            233
        //   228: ldc             -1677225578
        //   230: goto            235
        //   233: ldc             -1865521694
        //   235: ldc             -1354544128
        //   237: ixor           
        //   238: lookupswitch {
        //          860151190: 233
        //          1066215906: 264
        //          default: 879
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.getInterestGroups:()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;
        //   271: goto            275
        //   274: athrow         
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig.getGroupDistance:()I
        //   282: goto            286
        //   285: athrow         
        //   286: i2d            
        //   287: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   290: goto            294
        //   293: athrow         
        //   294: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.getInterestGroups:()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;
        //   297: goto            301
        //   300: athrow         
        //   301: goto            305
        //   304: athrow         
        //   305: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig.getGroupDistance:()I
        //   308: goto            312
        //   311: athrow         
        //   312: i2d            
        //   313: getstatic       dev/nuker/pyro/fc.c:I
        //   316: ifge            324
        //   319: ldc             826489912
        //   321: goto            326
        //   324: ldc             1574778220
        //   326: ldc             1102944891
        //   328: ixor           
        //   329: lookupswitch {
        //          -556366280: 324
        //          1895736899: 881
        //          default: 356
        //        }
        //   356: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   359: goto            363
        //   362: athrow         
        //   363: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.getInterestGroups:()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;
        //   366: goto            370
        //   369: athrow         
        //   370: getstatic       dev/nuker/pyro/fc.0:I
        //   373: ifeq            381
        //   376: ldc             -1156369480
        //   378: goto            383
        //   381: ldc             1805414989
        //   383: ldc             -796837680
        //   385: ixor           
        //   386: lookupswitch {
        //          -1155708259: 412
        //          1804733288: 381
        //          default: 889
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig.getGroupDistance:()I
        //   419: goto            423
        //   422: athrow         
        //   423: i2d            
        //   424: getstatic       dev/nuker/pyro/fc.c:I
        //   427: ifge            435
        //   430: ldc             -893517992
        //   432: goto            437
        //   435: ldc             1454048603
        //   437: ldc             -1998901238
        //   439: ixor           
        //   440: lookupswitch {
        //          -563071663: 468
        //          1114034002: 435
        //          default: 873
        //        }
        //   468: goto            472
        //   471: athrow         
        //   472: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72321_a:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   475: goto            479
        //   478: athrow         
        //   479: new             Lnet/minecraft/util/math/Vec3d;
        //   482: dup            
        //   483: aload_1        
        //   484: goto            488
        //   487: athrow         
        //   488: invokevirtual   dev/nuker/pyro/fax.c:()Lnet/minecraft/util/math/BlockPos;
        //   491: goto            495
        //   494: athrow         
        //   495: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   498: goto            502
        //   501: athrow         
        //   502: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   505: goto            509
        //   508: athrow         
        //   509: goto            513
        //   512: athrow         
        //   513: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72318_a:(Lnet/minecraft/util/math/Vec3d;)Z
        //   516: goto            520
        //   519: athrow         
        //   520: ifeq            643
        //   523: aload_2        
        //   524: getstatic       dev/nuker/pyro/fc.1:I
        //   527: ifeq            535
        //   530: ldc             -1957986545
        //   532: goto            537
        //   535: ldc             -39444159
        //   537: ldc             989906835
        //   539: ixor           
        //   540: lookupswitch {
        //          -1337214820: 883
        //          -1016808174: 535
        //          default: 568
        //        }
        //   568: aload_1        
        //   569: getstatic       dev/nuker/pyro/fc.c:I
        //   572: ifge            580
        //   575: ldc             -930944847
        //   577: goto            582
        //   580: ldc             1921238355
        //   582: ldc             1853903249
        //   584: ixor           
        //   585: lookupswitch {
        //          -1509770976: 893
        //          1139127160: 580
        //          default: 612
        //        }
        //   612: goto            616
        //   615: athrow         
        //   616: invokevirtual   dev/nuker/pyro/faB.c:(Ldev/nuker/pyro/fax;)V
        //   619: goto            623
        //   622: athrow         
        //   623: aload_0        
        //   624: getfield        dev/nuker/pyro/faG.c:Ljava/util/List;
        //   627: aload_2        
        //   628: goto            632
        //   631: athrow         
        //   632: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   637: goto            641
        //   640: athrow         
        //   641: pop            
        //   642: return         
        //   643: goto            129
        //   646: new             Ldev/nuker/pyro/faB;
        //   649: dup            
        //   650: getstatic       dev/nuker/pyro/fc.c:I
        //   653: ifge            661
        //   656: ldc             391650001
        //   658: goto            663
        //   661: ldc             -553498142
        //   663: ldc             1855431020
        //   665: ixor           
        //   666: lookupswitch {
        //          1088329759: 661
        //          2043657149: 887
        //          default: 692
        //        }
        //   692: aload_1        
        //   693: goto            697
        //   696: athrow         
        //   697: invokespecial   dev/nuker/pyro/faB.<init>:(Ldev/nuker/pyro/fax;)V
        //   700: goto            704
        //   703: athrow         
        //   704: astore_2       
        //   705: aload_0        
        //   706: getfield        dev/nuker/pyro/faG.1:Ljava/util/List;
        //   709: getstatic       dev/nuker/pyro/fc.0:I
        //   712: ifeq            720
        //   715: ldc             -757102138
        //   717: goto            722
        //   720: ldc             830714380
        //   722: ldc             -1892616625
        //   724: ixor           
        //   725: lookupswitch {
        //          740698850: 720
        //          1575976841: 871
        //          default: 752
        //        }
        //   752: aload_2        
        //   753: getstatic       dev/nuker/pyro/fc.0:I
        //   756: ifeq            764
        //   759: ldc             -59060824
        //   761: goto            766
        //   764: ldc             38359157
        //   766: ldc             -1198782804
        //   768: ixor           
        //   769: lookupswitch {
        //          1157024516: 885
        //          1717359719: 764
        //          default: 796
        //        }
        //   796: goto            800
        //   799: athrow         
        //   800: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   805: goto            809
        //   808: athrow         
        //   809: pop            
        //   810: aload_0        
        //   811: getstatic       dev/nuker/pyro/fc.0:I
        //   814: ifeq            822
        //   817: ldc             2051410233
        //   819: goto            824
        //   822: ldc             643666271
        //   824: ldc             74681703
        //   826: ixor           
        //   827: lookupswitch {
        //          -663400681: 822
        //          2117436510: 895
        //          default: 852
        //        }
        //   852: getfield        dev/nuker/pyro/faG.c:Ljava/util/List;
        //   855: aload_2        
        //   856: goto            860
        //   859: athrow         
        //   860: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   865: goto            869
        //   868: athrow         
        //   869: pop            
        //   870: return         
        //   871: aconst_null    
        //   872: athrow         
        //   873: aconst_null    
        //   874: athrow         
        //   875: aconst_null    
        //   876: athrow         
        //   877: aconst_null    
        //   878: athrow         
        //   879: aconst_null    
        //   880: athrow         
        //   881: aconst_null    
        //   882: athrow         
        //   883: aconst_null    
        //   884: athrow         
        //   885: aconst_null    
        //   886: athrow         
        //   887: aconst_null    
        //   888: athrow         
        //   889: aconst_null    
        //   890: athrow         
        //   891: aconst_null    
        //   892: athrow         
        //   893: aconst_null    
        //   894: athrow         
        //   895: aconst_null    
        //   896: athrow         
        //   897: pop            
        //   898: goto            24
        //   901: pop            
        //   902: aconst_null    
        //   903: goto            897
        //   906: dup            
        //   907: ifnull          897
        //   910: checkcast       Ljava/lang/Throwable;
        //   913: athrow         
        //   914: dup            
        //   915: ifnull          901
        //   918: checkcast       Ljava/lang/Throwable;
        //   921: athrow         
        //   922: aconst_null    
        //   923: athrow         
        //    StackMapTable: 00 8C 43 07 00 66 04 FF 00 0B 00 00 00 01 07 00 66 FD 00 03 07 00 03 07 00 AE 4D 07 00 03 FF 00 01 00 02 07 00 03 07 00 AE 00 02 07 00 03 01 5B 07 00 03 FF 00 05 00 00 00 01 07 00 66 FF 00 00 00 02 07 00 03 07 00 AE 00 01 07 00 6F 47 07 00 66 40 07 00 7B 4A 07 00 7B FF 00 01 00 02 07 00 03 07 00 AE 00 02 07 00 7B 01 5E 07 00 7B FD 00 00 00 07 00 7B 0A 41 01 1D 43 07 00 66 40 07 00 7B 47 07 00 66 40 01 46 07 00 66 40 07 00 7B 47 07 00 66 40 07 00 05 FF 00 07 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 01 07 00 85 45 07 00 66 40 07 00 A6 FF 00 0D 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 91 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 07 00 91 01 FF 00 1C 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 91 42 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 91 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 97 FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 97 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 01 46 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 07 00 91 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 07 00 97 FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 07 00 97 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 01 FF 00 0B 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 03 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 01 FF 00 1D 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 03 45 07 00 53 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 91 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 97 FF 00 0A 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 97 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 05 07 00 A6 03 03 07 00 97 01 FF 00 1C 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 97 42 07 00 45 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 97 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 01 FF 00 0B 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 03 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 05 07 00 A6 03 03 03 01 FF 00 1E 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 03 42 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 03 45 07 00 66 40 07 00 A6 FF 00 07 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 08 01 DF 08 01 DF 07 00 AE 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 08 01 DF 08 01 DF 07 00 D9 FF 00 05 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 08 01 DF 08 01 DF 07 00 B3 45 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 AC FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 AC 45 07 00 66 40 01 4E 07 00 85 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 85 01 5E 07 00 85 FF 00 0B 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 85 07 00 AE FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 85 07 00 AE 01 FF 00 1D 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 85 07 00 AE 42 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 85 07 00 AE 45 07 00 66 00 47 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 47 07 00 66 40 01 01 FF 00 02 00 04 07 00 03 07 00 AE 00 07 00 7B 00 00 FF 00 0E 00 04 07 00 03 07 00 AE 00 07 00 7B 00 02 08 02 86 08 02 86 FF 00 01 00 04 07 00 03 07 00 AE 00 07 00 7B 00 03 08 02 86 08 02 86 01 FF 00 1C 00 04 07 00 03 07 00 AE 00 07 00 7B 00 02 08 02 86 08 02 86 43 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 00 07 00 7B 00 03 08 02 86 08 02 86 07 00 AE 45 07 00 66 40 07 00 85 FF 00 0F 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 01 07 00 6F FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 01 5D 07 00 6F FF 00 0B 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 6F 07 00 85 01 FF 00 1D 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 42 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 47 07 00 66 40 01 4C 07 00 03 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 03 01 5B 07 00 03 FF 00 06 00 00 00 01 07 00 66 FF 00 00 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 47 07 00 66 40 01 41 07 00 6F FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 03 FF 00 01 00 02 07 00 03 07 00 AE 00 01 07 00 7B 41 07 00 03 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 A6 07 00 91 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 03 07 00 A6 03 03 41 07 00 85 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 6F 07 00 85 FF 00 01 00 04 07 00 03 07 00 AE 00 07 00 7B 00 02 08 02 86 08 02 86 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 04 07 00 A6 03 03 07 00 97 FF 00 01 00 04 07 00 03 07 00 AE 00 07 00 7B 00 00 FF 00 01 00 04 07 00 03 07 00 AE 07 00 85 07 00 7B 00 02 07 00 85 07 00 AE 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 AE 00 01 07 00 66 43 05 44 07 00 66 47 05 47 07 00 66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     906    914    Any
        //  906    914    906    914    Ljava/lang/RuntimeException;
        //  922    924    3      8      Any
        //  75     83     83     84     Any
        //  75     83     83     84     Ljava/lang/IllegalStateException;
        //  75     83     3      8      Ljava/lang/NullPointerException;
        //  75     83     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  75     83     83     84     Ljava/lang/ArithmeticException;
        //  176    185    185    186    Any
        //  177    185    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  177    185    185    186    Any
        //  176    185    176    177    Any
        //  177    185    3      8      Any
        //  193    202    202    203    Any
        //  194    202    193    194    Ljava/lang/IllegalArgumentException;
        //  193    202    3      8      Any
        //  194    202    202    203    Ljava/lang/AssertionError;
        //  193    202    193    194    Any
        //  212    218    218    219    Any
        //  212    218    3      8      Any
        //  212    218    3      8      Any
        //  212    218    218    219    Ljava/lang/EnumConstantNotPresentException;
        //  212    218    3      8      Ljava/lang/AssertionError;
        //  267    274    274    275    Any
        //  267    274    3      8      Ljava/lang/NumberFormatException;
        //  267    274    267    268    Any
        //  268    274    3      8      Any
        //  268    274    3      8      Ljava/lang/IllegalArgumentException;
        //  279    285    285    286    Any
        //  279    285    3      8      Any
        //  279    285    3      8      Ljava/lang/NumberFormatException;
        //  279    285    3      8      Ljava/lang/AssertionError;
        //  279    285    3      8      Any
        //  293    300    300    301    Any
        //  293    300    3      8      Any
        //  294    300    293    294    Any
        //  294    300    3      8      Any
        //  294    300    300    301    Any
        //  305    311    311    312    Any
        //  305    311    311    312    Any
        //  305    311    3      8      Any
        //  305    311    3      8      Any
        //  305    311    311    312    Ljava/lang/StringIndexOutOfBoundsException;
        //  362    369    369    370    Any
        //  363    369    3      8      Any
        //  363    369    362    363    Ljava/lang/EnumConstantNotPresentException;
        //  362    369    369    370    Ljava/lang/NegativeArraySizeException;
        //  362    369    3      8      Ljava/lang/ClassCastException;
        //  415    422    422    423    Any
        //  416    422    422    423    Any
        //  416    422    415    416    Ljava/lang/IllegalStateException;
        //  416    422    3      8      Ljava/lang/RuntimeException;
        //  415    422    422    423    Any
        //  471    478    478    479    Any
        //  472    478    471    472    Any
        //  472    478    471    472    Ljava/lang/NegativeArraySizeException;
        //  471    478    478    479    Ljava/lang/AssertionError;
        //  472    478    471    472    Ljava/lang/IllegalStateException;
        //  488    494    494    495    Any
        //  488    494    3      8      Ljava/lang/AssertionError;
        //  488    494    494    495    Any
        //  488    494    3      8      Any
        //  488    494    3      8      Any
        //  502    508    508    509    Any
        //  502    508    508    509    Ljava/lang/ClassCastException;
        //  502    508    508    509    Any
        //  502    508    508    509    Ljava/lang/IndexOutOfBoundsException;
        //  502    508    508    509    Ljava/lang/ClassCastException;
        //  513    519    519    520    Any
        //  513    519    3      8      Any
        //  513    519    3      8      Ljava/lang/NumberFormatException;
        //  513    519    519    520    Ljava/util/ConcurrentModificationException;
        //  513    519    3      8      Any
        //  615    622    622    623    Any
        //  615    622    622    623    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  616    622    615    616    Any
        //  615    622    622    623    Any
        //  616    622    3      8      Ljava/lang/ClassCastException;
        //  631    640    640    641    Any
        //  632    640    3      8      Any
        //  632    640    640    641    Ljava/util/NoSuchElementException;
        //  632    640    631    632    Any
        //  632    640    640    641    Any
        //  696    703    703    704    Any
        //  697    703    703    704    Ljava/lang/IllegalArgumentException;
        //  697    703    696    697    Ljava/util/ConcurrentModificationException;
        //  696    703    703    704    Any
        //  697    703    696    697    Any
        //  799    808    808    809    Any
        //  800    808    3      8      Any
        //  799    808    808    809    Any
        //  799    808    3      8      Any
        //  799    808    799    800    Any
        //  860    868    868    869    Any
        //  860    868    868    869    Any
        //  860    868    868    869    Any
        //  860    868    868    869    Any
        //  860    868    3      8      Any
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
    
    public void 5() {
        public class faF implements Runnable
        {
            public faG c;
            
            static {
                throw t;
            }
            
            @Override
            public void run() {
                fbS.e0(this, 1718967180);
            }
            
            public faF(final faG c) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.c < 0) {
                            n = -693048343;
                            break Label_0015;
                        }
                        n = -55224349;
                    }
                    switch (n ^ 0xA3BCBACC) {
                        case 1963741477: {
                            continue;
                        }
                        case 1594486063: {
                            this.c = c;
                        }
                        default: {
                            throw null;
                        }
                    }
                    break;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          427
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            419
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            411
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            36
        //    31: ldc             1391339193
        //    33: goto            38
        //    36: ldc             -1985853981
        //    38: ldc             1985150397
        //    40: ixor           
        //    41: lookupswitch {
        //          616356612: 394
        //          1078064011: 36
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/faG.c:Ljava/lang/Thread;
        //    71: ifnonnull       314
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            85
        //    80: ldc             1871842372
        //    82: goto            87
        //    85: ldc             -1015392908
        //    87: ldc             -296985825
        //    89: ixor           
        //    90: lookupswitch {
        //          -2116135077: 398
        //          1400869189: 85
        //          default: 116
        //        }
        //   116: aload_0        
        //   117: new             Ljava/lang/Thread;
        //   120: dup            
        //   121: new             Ldev/nuker/pyro/faF;
        //   124: dup            
        //   125: aload_0        
        //   126: getstatic       dev/nuker/pyro/fc.1:I
        //   129: ifeq            137
        //   132: ldc             1685671559
        //   134: goto            139
        //   137: ldc             -2081566797
        //   139: ldc             -196556539
        //   141: ixor           
        //   142: lookupswitch {
        //          -1875802238: 137
        //          2007303862: 168
        //          default: 396
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokespecial   dev/nuker/pyro/faF.<init>:(Ldev/nuker/pyro/faG;)V
        //   175: goto            179
        //   178: athrow         
        //   179: checkcast       Ljava/lang/Runnable;
        //   182: goto            186
        //   185: athrow         
        //   186: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //   189: goto            193
        //   192: athrow         
        //   193: putfield        dev/nuker/pyro/faG.c:Ljava/lang/Thread;
        //   196: aload_0        
        //   197: getfield        dev/nuker/pyro/faG.c:Ljava/lang/Thread;
        //   200: dup            
        //   201: ifnonnull       259
        //   204: getstatic       dev/nuker/pyro/fc.0:I
        //   207: ifeq            215
        //   210: ldc             1680071749
        //   212: goto            217
        //   215: ldc             -895020219
        //   217: ldc             -1117629662
        //   219: ixor           
        //   220: lookupswitch {
        //          -650014873: 215
        //          2009415783: 248
        //          default: 400
        //        }
        //   248: goto            252
        //   251: athrow         
        //   252: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   255: goto            259
        //   258: athrow         
        //   259: getstatic       dev/nuker/pyro/fc.1:I
        //   262: ifeq            270
        //   265: ldc             -1361219115
        //   267: goto            272
        //   270: ldc             -1310108161
        //   272: ldc             307786976
        //   274: ixor           
        //   275: lookupswitch {
        //          -1548672737: 300
        //          -1132133067: 270
        //          default: 392
        //        }
        //   300: goto            304
        //   303: athrow         
        //   304: invokevirtual   java/lang/Thread.start:()V
        //   307: goto            311
        //   310: athrow         
        //   311: goto            389
        //   314: aload_0        
        //   315: getstatic       dev/nuker/pyro/fc.c:I
        //   318: ifge            327
        //   321: ldc_w           599869039
        //   324: goto            330
        //   327: ldc_w           -92843498
        //   330: ldc_w           839230446
        //   333: ixor           
        //   334: lookupswitch {
        //          -832319185: 327
        //          298116481: 390
        //          default: 360
        //        }
        //   360: getfield        dev/nuker/pyro/faG.c:Ljava/lang/Thread;
        //   363: dup            
        //   364: ifnonnull       378
        //   367: goto            371
        //   370: athrow         
        //   371: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   374: goto            378
        //   377: athrow         
        //   378: goto            382
        //   381: athrow         
        //   382: invokevirtual   java/lang/Thread.resume:()V
        //   385: goto            389
        //   388: athrow         
        //   389: return         
        //   390: aconst_null    
        //   391: athrow         
        //   392: aconst_null    
        //   393: athrow         
        //   394: aconst_null    
        //   395: athrow         
        //   396: aconst_null    
        //   397: athrow         
        //   398: aconst_null    
        //   399: athrow         
        //   400: aconst_null    
        //   401: athrow         
        //   402: pop            
        //   403: goto            24
        //   406: pop            
        //   407: aconst_null    
        //   408: goto            402
        //   411: dup            
        //   412: ifnull          402
        //   415: checkcast       Ljava/lang/Throwable;
        //   418: athrow         
        //   419: dup            
        //   420: ifnull          406
        //   423: checkcast       Ljava/lang/Throwable;
        //   426: athrow         
        //   427: aconst_null    
        //   428: athrow         
        //    StackMapTable: 00 3A 43 07 00 66 04 FF 00 0B 00 00 00 01 07 00 66 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 10 41 01 1C FF 00 14 00 01 07 00 03 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 03 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 03 42 07 00 66 FF 00 00 00 01 07 00 03 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 03 45 07 00 66 FF 00 00 00 01 07 00 03 00 04 07 00 03 08 00 75 08 00 75 07 00 E7 45 07 00 66 FF 00 00 00 01 07 00 03 00 04 07 00 03 08 00 75 08 00 75 07 00 EF 45 07 00 66 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 E5 55 07 00 E5 FF 00 01 00 01 07 00 03 00 02 07 00 E5 01 5E 07 00 E5 42 07 00 66 40 07 00 E5 45 07 00 66 40 07 00 E5 4A 07 00 E5 FF 00 01 00 01 07 00 03 00 02 07 00 E5 01 5B 07 00 E5 FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 01 07 00 03 00 01 07 00 E5 45 07 00 66 00 02 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 49 07 00 45 40 07 00 E5 45 07 00 66 40 07 00 E5 FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 01 07 00 03 00 01 07 00 E5 45 07 00 66 00 40 07 00 03 41 07 00 E5 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 75 08 00 75 08 00 79 08 00 79 07 00 03 01 41 07 00 E5 41 07 00 66 43 05 44 07 00 66 47 05 47 07 00 66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     411    419    Any
        //  411    419    411    419    Any
        //  427    429    3      8      Ljava/lang/RuntimeException;
        //  171    178    178    179    Any
        //  171    178    171    172    Ljava/lang/StringIndexOutOfBoundsException;
        //  171    178    171    172    Any
        //  172    178    178    179    Any
        //  172    178    178    179    Any
        //  185    192    192    193    Any
        //  185    192    185    186    Any
        //  186    192    3      8      Any
        //  186    192    192    193    Ljava/lang/IllegalArgumentException;
        //  185    192    185    186    Ljava/lang/IllegalArgumentException;
        //  251    258    258    259    Any
        //  252    258    251    252    Any
        //  251    258    258    259    Any
        //  251    258    258    259    Ljava/lang/NegativeArraySizeException;
        //  251    258    251    252    Any
        //  304    310    310    311    Any
        //  304    310    310    311    Ljava/lang/NumberFormatException;
        //  304    310    310    311    Any
        //  304    310    3      8      Ljava/util/ConcurrentModificationException;
        //  304    310    310    311    Ljava/lang/IllegalArgumentException;
        //  370    377    377    378    Any
        //  371    377    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  370    377    370    371    Ljava/lang/IllegalStateException;
        //  370    377    377    378    Any
        //  371    377    377    378    Any
        //  382    388    388    389    Any
        //  382    388    388    389    Any
        //  382    388    388    389    Any
        //  382    388    3      8      Any
        //  382    388    3      8      Ljava/lang/ArithmeticException;
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
    
    public static Thread 0(final faG p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/faG.0:Ljava/lang/Thread;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 66 FC 00 03 07 00 03 44 07 00 66 43 05 44 07 00 66 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
    
    public void 0(@NotNull final Chunk p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1186
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1178
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1170
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -7024012
        //    33: goto            39
        //    36: ldc_w           1447780215
        //    39: ldc_w           -571223183
        //    42: ixor           
        //    43: lookupswitch {
        //          -1950839802: 68
        //          577175813: 36
        //          default: 1143
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            82
        //    76: ldc_w           -1303991777
        //    79: goto            85
        //    82: ldc_w           -1860088053
        //    85: ldc_w           1869185918
        //    88: ixor           
        //    89: lookupswitch {
        //          -584111775: 1135
        //          220484758: 82
        //          default: 116
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   net/minecraft/world/chunk/Chunk.func_177434_r:()Ljava/util/Map;
        //   124: goto            128
        //   127: athrow         
        //   128: dup            
        //   129: pop            
        //   130: astore          4
        //   132: iconst_0       
        //   133: istore          5
        //   135: aload           4
        //   137: goto            141
        //   140: athrow         
        //   141: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   146: goto            150
        //   149: athrow         
        //   150: goto            154
        //   153: athrow         
        //   154: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   159: goto            163
        //   162: athrow         
        //   163: getstatic       dev/nuker/pyro/fc.0:I
        //   166: ifeq            175
        //   169: ldc_w           -1119212960
        //   172: goto            178
        //   175: ldc_w           -7196268
        //   178: ldc_w           -1460868974
        //   181: ixor           
        //   182: lookupswitch {
        //          363250418: 1149
        //          1366124619: 175
        //          default: 208
        //        }
        //   208: astore_3       
        //   209: aload_3        
        //   210: goto            214
        //   213: athrow         
        //   214: invokeinterface java/util/Iterator.hasNext:()Z
        //   219: goto            223
        //   222: athrow         
        //   223: ifeq            1130
        //   226: aload_3        
        //   227: goto            231
        //   230: athrow         
        //   231: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   236: goto            240
        //   239: athrow         
        //   240: checkcast       Ljava/util/Map$Entry;
        //   243: getstatic       dev/nuker/pyro/fc.c:I
        //   246: ifge            255
        //   249: ldc_w           -2134683224
        //   252: goto            258
        //   255: ldc_w           2127228735
        //   258: ldc_w           -1443615106
        //   261: ixor           
        //   262: lookupswitch {
        //          458024662: 255
        //          691503062: 1145
        //          default: 288
        //        }
        //   288: astore_2       
        //   289: aload_2        
        //   290: getstatic       dev/nuker/pyro/fc.c:I
        //   293: ifge            302
        //   296: ldc_w           -323110517
        //   299: goto            305
        //   302: ldc_w           540323947
        //   305: ldc_w           543423771
        //   308: ixor           
        //   309: lookupswitch {
        //          -857848688: 302
        //          5721456: 336
        //          default: 1139
        //        }
        //   336: astore          6
        //   338: iconst_0       
        //   339: istore          7
        //   341: aload           6
        //   343: goto            347
        //   346: athrow         
        //   347: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   352: goto            356
        //   355: athrow         
        //   356: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   359: astore          4
        //   361: aload_2        
        //   362: astore          6
        //   364: iconst_0       
        //   365: istore          7
        //   367: aload           6
        //   369: goto            373
        //   372: athrow         
        //   373: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   378: goto            382
        //   381: athrow         
        //   382: checkcast       Lnet/minecraft/tileentity/TileEntity;
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            397
        //   391: ldc_w           1559173847
        //   394: goto            400
        //   397: ldc_w           1690160915
        //   400: ldc_w           -1347744184
        //   403: ixor           
        //   404: lookupswitch {
        //          -213642081: 1131
        //          1187517416: 397
        //          default: 432
        //        }
        //   432: astore          5
        //   434: getstatic       dev/nuker/pyro/fc.1:I
        //   437: ifeq            446
        //   440: ldc_w           1342536471
        //   443: goto            449
        //   446: ldc_w           517666530
        //   449: ldc_w           -2138914726
        //   452: ixor           
        //   453: lookupswitch {
        //          -1026098514: 446
        //          -796411059: 1151
        //          default: 480
        //        }
        //   480: getstatic       net/minecraft/block/Block.field_149771_c:Lnet/minecraft/util/registry/RegistryNamespacedDefaultedByKey;
        //   483: aload_1        
        //   484: aload           4
        //   486: goto            490
        //   489: athrow         
        //   490: invokevirtual   net/minecraft/world/chunk/Chunk.func_177435_g:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   493: goto            497
        //   496: athrow         
        //   497: dup            
        //   498: pop            
        //   499: getstatic       dev/nuker/pyro/fc.0:I
        //   502: ifeq            511
        //   505: ldc_w           -208247482
        //   508: goto            514
        //   511: ldc_w           208037950
        //   514: ldc_w           -2053961709
        //   517: ixor           
        //   518: lookupswitch {
        //          -1980407763: 544
        //          1980067157: 511
        //          default: 1157
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   553: goto            557
        //   556: athrow         
        //   557: getstatic       dev/nuker/pyro/fc.1:I
        //   560: ifeq            569
        //   563: ldc_w           332624617
        //   566: goto            572
        //   569: ldc_w           -1308371317
        //   572: ldc_w           -466238090
        //   575: ixor           
        //   576: lookupswitch {
        //          -135874657: 1133
        //          1962610147: 569
        //          default: 604
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokevirtual   net/minecraft/util/registry/RegistryNamespacedDefaultedByKey.func_177774_c:(Ljava/lang/Object;)Ljava/lang/Object;
        //   611: goto            615
        //   614: athrow         
        //   615: checkcast       Lnet/minecraft/util/ResourceLocation;
        //   618: goto            622
        //   621: athrow         
        //   622: invokevirtual   net/minecraft/util/ResourceLocation.toString:()Ljava/lang/String;
        //   625: goto            629
        //   628: athrow         
        //   629: dup            
        //   630: pop            
        //   631: getstatic       dev/nuker/pyro/fc.0:I
        //   634: ifeq            643
        //   637: ldc_w           831570094
        //   640: goto            646
        //   643: ldc_w           670467824
        //   646: ldc_w           879223071
        //   649: ixor           
        //   650: lookupswitch {
        //          100082097: 643
        //          328296431: 676
        //          default: 1153
        //        }
        //   676: astore          6
        //   678: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   681: goto            685
        //   684: athrow         
        //   685: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.getInterestGroups:()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;
        //   688: goto            692
        //   691: athrow         
        //   692: getstatic       dev/nuker/pyro/fc.0:I
        //   695: ifeq            704
        //   698: ldc_w           878138736
        //   701: goto            707
        //   704: ldc_w           1466228140
        //   707: ldc_w           409389521
        //   710: ixor           
        //   711: lookupswitch {
        //          741448865: 704
        //          1325536381: 736
        //          default: 1137
        //        }
        //   736: goto            740
        //   739: athrow         
        //   740: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig.getScanBlocks:()Ljava/util/List;
        //   743: goto            747
        //   746: athrow         
        //   747: aload           6
        //   749: goto            753
        //   752: athrow         
        //   753: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   758: goto            762
        //   761: athrow         
        //   762: ifeq            771
        //   765: ldc_w           -1270206455
        //   768: goto            774
        //   771: ldc_w           -1270206450
        //   774: ldc_w           -2124911622
        //   777: ixor           
        //   778: tableswitch {
        //          1780791270: 800
        //          1780791271: 990
        //          default: 765
        //        }
        //   800: new             Ldev/nuker/pyro/fax;
        //   803: dup            
        //   804: aload           4
        //   806: dup            
        //   807: pop            
        //   808: getstatic       dev/nuker/pyro/fc.0:I
        //   811: ifeq            820
        //   814: ldc_w           1276827886
        //   817: goto            823
        //   820: ldc_w           -200742888
        //   823: ldc_w           1194412179
        //   826: ixor           
        //   827: lookupswitch {
        //          -1288068981: 852
        //          187404413: 820
        //          default: 1141
        //        }
        //   852: aload_1        
        //   853: getstatic       dev/nuker/pyro/fc.0:I
        //   856: ifeq            865
        //   859: ldc_w           -188517863
        //   862: goto            868
        //   865: ldc_w           -1176494586
        //   868: ldc_w           664005388
        //   871: ixor           
        //   872: lookupswitch {
        //          -1636567798: 900
        //          -749692651: 865
        //          default: 1155
        //        }
        //   900: aload           4
        //   902: goto            906
        //   905: athrow         
        //   906: invokevirtual   net/minecraft/world/chunk/Chunk.func_177435_g:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   909: goto            913
        //   912: athrow         
        //   913: dup            
        //   914: pop            
        //   915: aload           5
        //   917: goto            921
        //   920: athrow         
        //   921: invokespecial   dev/nuker/pyro/fax.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;)V
        //   924: goto            928
        //   927: athrow         
        //   928: astore          7
        //   930: getstatic       dev/nuker/pyro/fc.c:I
        //   933: ifge            942
        //   936: ldc_w           429044369
        //   939: goto            945
        //   942: ldc_w           744690609
        //   945: ldc_w           -1223171925
        //   948: ixor           
        //   949: lookupswitch {
        //          -1686834406: 976
        //          -1366994374: 942
        //          default: 1159
        //        }
        //   976: aload_0        
        //   977: aload           7
        //   979: goto            983
        //   982: athrow         
        //   983: invokevirtual   dev/nuker/pyro/faG.c:(Ldev/nuker/pyro/fax;)V
        //   986: goto            990
        //   989: athrow         
        //   990: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   993: goto            997
        //   996: athrow         
        //   997: invokevirtual   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.getLogBlocks:()Ljava/util/List;
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: aload           6
        //  1006: goto            1010
        //  1009: athrow         
        //  1010: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1015: goto            1019
        //  1018: athrow         
        //  1019: ifeq            1127
        //  1022: new             Ldev/nuker/pyro/fax;
        //  1025: dup            
        //  1026: aload           4
        //  1028: dup            
        //  1029: pop            
        //  1030: aload_1        
        //  1031: aload           4
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: invokevirtual   net/minecraft/world/chunk/Chunk.func_177435_g:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: dup            
        //  1045: pop            
        //  1046: getstatic       dev/nuker/pyro/fc.1:I
        //  1049: ifeq            1058
        //  1052: ldc_w           1528584436
        //  1055: goto            1061
        //  1058: ldc_w           2067787890
        //  1061: ldc_w           -140215918
        //  1064: ixor           
        //  1065: lookupswitch {
        //          -1935963680: 1092
        //          -1397218970: 1058
        //          default: 1147
        //        }
        //  1092: aload           5
        //  1094: goto            1098
        //  1097: athrow         
        //  1098: invokespecial   dev/nuker/pyro/fax.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;)V
        //  1101: goto            1105
        //  1104: athrow         
        //  1105: astore          7
        //  1107: aload_0        
        //  1108: getfield        dev/nuker/pyro/faG.0:Ljava/util/List;
        //  1111: aload           7
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1122: goto            1126
        //  1125: athrow         
        //  1126: pop            
        //  1127: goto            209
        //  1130: return         
        //  1131: aconst_null    
        //  1132: athrow         
        //  1133: aconst_null    
        //  1134: athrow         
        //  1135: aconst_null    
        //  1136: athrow         
        //  1137: aconst_null    
        //  1138: athrow         
        //  1139: aconst_null    
        //  1140: athrow         
        //  1141: aconst_null    
        //  1142: athrow         
        //  1143: aconst_null    
        //  1144: athrow         
        //  1145: aconst_null    
        //  1146: athrow         
        //  1147: aconst_null    
        //  1148: athrow         
        //  1149: aconst_null    
        //  1150: athrow         
        //  1151: aconst_null    
        //  1152: athrow         
        //  1153: aconst_null    
        //  1154: athrow         
        //  1155: aconst_null    
        //  1156: athrow         
        //  1157: aconst_null    
        //  1158: athrow         
        //  1159: aconst_null    
        //  1160: athrow         
        //  1161: pop            
        //  1162: goto            24
        //  1165: pop            
        //  1166: aconst_null    
        //  1167: goto            1161
        //  1170: dup            
        //  1171: ifnull          1161
        //  1174: checkcast       Ljava/lang/Throwable;
        //  1177: athrow         
        //  1178: dup            
        //  1179: ifnull          1165
        //  1182: checkcast       Ljava/lang/Throwable;
        //  1185: athrow         
        //  1186: aconst_null    
        //  1187: athrow         
        //    StackMapTable: 00 A4 FF 00 03 00 05 07 00 03 07 01 13 00 00 07 00 05 00 01 07 00 66 F8 00 04 FF 00 0B 00 00 00 01 07 00 66 FD 00 03 07 00 03 07 01 13 0B 42 01 1C 0D 42 01 1E 43 07 00 66 40 07 01 13 45 07 00 66 40 07 01 19 FF 00 0B 00 06 07 00 03 07 01 13 00 00 07 01 19 01 00 01 07 00 66 40 07 01 19 47 07 00 66 40 07 01 1F FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 06 07 00 03 07 01 13 00 00 07 01 19 01 00 01 07 01 1F 47 07 00 66 40 07 00 7B 4B 07 00 7B FF 00 02 00 06 07 00 03 07 01 13 00 00 07 01 19 01 00 02 07 00 7B 01 5D 07 00 7B FF 00 00 00 05 07 00 03 07 01 13 00 07 00 7B 07 00 05 00 00 FF 00 03 00 00 00 01 07 00 66 FF 00 00 00 05 07 00 03 07 01 13 00 07 00 7B 07 00 05 00 01 07 00 7B 47 07 00 66 40 01 46 07 00 66 40 07 00 7B 47 07 00 66 40 07 00 05 4E 07 01 25 FF 00 02 00 05 07 00 03 07 01 13 00 07 00 7B 07 00 05 00 02 07 01 25 01 5D 07 01 25 FF 00 0D 00 05 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 05 00 01 07 01 25 FF 00 02 00 05 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 05 00 02 07 01 25 01 5E 07 01 25 FF 00 09 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 05 00 07 01 25 01 00 01 07 00 5D 40 07 01 25 47 07 00 66 40 07 00 05 FF 00 0F 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 00 07 01 25 01 00 01 07 00 49 40 07 01 25 47 07 00 66 40 07 00 05 4E 07 01 33 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 00 07 01 25 01 00 02 07 01 33 01 5F 07 01 33 FF 00 0D 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 00 42 01 1E 48 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 03 07 01 51 07 01 13 07 00 D9 45 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 48 FF 00 0D 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 48 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 03 07 01 51 07 01 48 01 FF 00 1D 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 48 42 07 00 43 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 48 47 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 3B FF 00 0B 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 3B FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 03 07 01 51 07 01 3B 01 FF 00 1F 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 3B FF 00 02 00 00 00 01 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 3B 45 07 00 66 40 07 00 05 45 07 00 66 40 07 01 57 45 07 00 66 40 07 01 81 4D 07 01 81 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 81 01 5D 07 01 81 FF 00 07 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 01 07 00 66 40 07 00 91 45 07 00 66 40 07 00 97 4B 07 00 97 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 02 07 00 97 01 5C 07 00 97 42 07 00 66 40 07 00 97 45 07 00 66 40 07 00 6F 44 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 02 07 00 6F 07 01 81 47 07 00 66 40 01 02 05 42 01 19 FF 00 13 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 03 08 03 20 08 03 20 07 00 D9 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 04 08 03 20 08 03 20 07 00 D9 01 FF 00 1C 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 03 08 03 20 08 03 20 07 00 D9 FF 00 0C 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 04 08 03 20 08 03 20 07 00 D9 07 01 13 FF 00 02 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 05 08 03 20 08 03 20 07 00 D9 07 01 13 01 FF 00 1F 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 04 08 03 20 08 03 20 07 00 D9 07 01 13 44 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 05 08 03 20 08 03 20 07 00 D9 07 01 13 07 00 D9 45 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 04 08 03 20 08 03 20 07 00 D9 07 01 48 46 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 05 08 03 20 08 03 20 07 00 D9 07 01 48 07 01 33 45 07 00 66 40 07 00 AE FF 00 0D 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 07 00 AE 00 00 42 01 1E 45 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 07 00 AE 00 02 07 00 03 07 00 AE 45 07 00 66 FA 00 00 45 07 00 66 40 07 00 91 45 07 00 66 40 07 00 6F 44 07 00 55 FF 00 00 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 02 07 00 6F 07 01 81 47 07 00 66 40 01 50 07 00 66 FF 00 00 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 05 08 03 FE 08 03 FE 07 00 D9 07 01 13 07 00 D9 45 07 00 66 FF 00 00 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 04 08 03 FE 08 03 FE 07 00 D9 07 01 48 FF 00 0D 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 04 08 03 FE 08 03 FE 07 00 D9 07 01 48 FF 00 02 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 05 08 03 FE 08 03 FE 07 00 D9 07 01 48 01 FF 00 1E 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 04 08 03 FE 08 03 FE 07 00 D9 07 01 48 44 07 00 66 FF 00 00 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 05 08 03 FE 08 03 FE 07 00 D9 07 01 48 07 01 33 45 07 00 66 40 07 00 AE FF 00 0A 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 07 00 AE 00 01 07 00 66 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 07 00 AE 00 02 07 00 6F 07 00 AE 47 07 00 66 40 01 FA 00 00 FF 00 02 00 05 07 00 03 07 01 13 00 07 00 7B 07 00 05 00 00 FF 00 00 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 00 07 01 25 01 00 01 07 01 33 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 3B FF 00 01 00 02 07 00 03 07 01 13 00 00 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 01 07 00 97 FF 00 01 00 05 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 05 00 01 07 01 25 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 03 08 03 20 08 03 20 07 00 D9 FF 00 01 00 02 07 00 03 07 01 13 00 00 FF 00 01 00 05 07 00 03 07 01 13 00 07 00 7B 07 00 05 00 01 07 01 25 FF 00 01 00 07 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 00 04 08 03 FE 08 03 FE 07 00 D9 07 01 48 FF 00 01 00 06 07 00 03 07 01 13 00 00 07 01 19 01 00 01 07 00 7B FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 00 41 07 01 81 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 01 00 04 08 03 20 08 03 20 07 00 D9 07 01 13 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 25 01 00 02 07 01 51 07 01 48 FF 00 01 00 08 07 00 03 07 01 13 07 01 25 07 00 7B 07 00 D9 07 01 33 07 01 81 07 00 AE 00 00 FF 00 01 00 02 07 00 03 07 01 13 00 01 07 00 43 43 05 44 07 00 43 47 05 FF 00 07 00 05 07 00 03 07 01 13 00 00 07 00 05 00 01 07 00 66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1170   1178   Ljava/lang/EnumConstantNotPresentException;
        //  1170   1178   1170   1178   Ljava/lang/UnsupportedOperationException;
        //  1186   1188   3      8      Any
        //  120    127    127    128    Any
        //  121    127    120    121    Any
        //  121    127    120    121    Ljava/lang/EnumConstantNotPresentException;
        //  121    127    120    121    Ljava/lang/NullPointerException;
        //  120    127    127    128    Ljava/lang/ArithmeticException;
        //  140    149    149    150    Any
        //  140    149    149    150    Ljava/lang/RuntimeException;
        //  141    149    140    141    Ljava/lang/EnumConstantNotPresentException;
        //  141    149    140    141    Any
        //  141    149    3      8      Any
        //  154    162    162    163    Any
        //  154    162    162    163    Ljava/lang/EnumConstantNotPresentException;
        //  154    162    162    163    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  154    162    3      8      Any
        //  154    162    162    163    Any
        //  214    222    222    223    Any
        //  214    222    222    223    Any
        //  214    222    222    223    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  214    222    222    223    Any
        //  214    222    222    223    Any
        //  230    239    239    240    Any
        //  231    239    230    231    Any
        //  231    239    239    240    Any
        //  230    239    239    240    Ljava/lang/EnumConstantNotPresentException;
        //  230    239    3      8      Any
        //  346    355    355    356    Any
        //  346    355    3      8      Any
        //  346    355    346    347    Ljava/util/ConcurrentModificationException;
        //  346    355    355    356    Any
        //  347    355    3      8      Any
        //  372    381    381    382    Any
        //  372    381    3      8      Ljava/lang/IllegalStateException;
        //  373    381    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  373    381    3      8      Ljava/lang/ClassCastException;
        //  373    381    372    373    Ljava/lang/IndexOutOfBoundsException;
        //  489    496    496    497    Any
        //  489    496    489    490    Ljava/lang/AssertionError;
        //  490    496    489    490    Ljava/lang/RuntimeException;
        //  489    496    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  489    496    489    490    Any
        //  547    556    556    557    Any
        //  547    556    3      8      Any
        //  548    556    547    548    Ljava/lang/IndexOutOfBoundsException;
        //  548    556    3      8      Ljava/lang/NumberFormatException;
        //  547    556    547    548    Ljava/lang/NumberFormatException;
        //  608    614    614    615    Any
        //  608    614    614    615    Ljava/util/NoSuchElementException;
        //  608    614    614    615    Any
        //  608    614    614    615    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  608    614    3      8      Any
        //  621    628    628    629    Any
        //  621    628    628    629    Any
        //  622    628    621    622    Any
        //  621    628    621    622    Ljava/lang/NegativeArraySizeException;
        //  622    628    628    629    Ljava/lang/IllegalArgumentException;
        //  684    691    691    692    Any
        //  685    691    691    692    Ljava/lang/NumberFormatException;
        //  684    691    3      8      Any
        //  685    691    684    685    Any
        //  685    691    691    692    Ljava/lang/IllegalArgumentException;
        //  739    746    746    747    Any
        //  740    746    739    740    Any
        //  740    746    739    740    Any
        //  739    746    746    747    Any
        //  739    746    739    740    Any
        //  752    761    761    762    Any
        //  752    761    761    762    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  753    761    3      8      Ljava/lang/ClassCastException;
        //  753    761    752    753    Any
        //  752    761    761    762    Ljava/lang/AssertionError;
        //  905    912    912    913    Any
        //  905    912    912    913    Any
        //  906    912    905    906    Ljava/util/NoSuchElementException;
        //  906    912    3      8      Ljava/lang/IllegalArgumentException;
        //  905    912    905    906    Any
        //  920    927    927    928    Any
        //  921    927    927    928    Any
        //  921    927    920    921    Any
        //  921    927    927    928    Any
        //  921    927    927    928    Ljava/lang/RuntimeException;
        //  982    989    989    990    Any
        //  983    989    3      8      Ljava/lang/AssertionError;
        //  982    989    982    983    Any
        //  982    989    989    990    Ljava/lang/UnsupportedOperationException;
        //  983    989    3      8      Ljava/lang/UnsupportedOperationException;
        //  996    1003   1003   1004   Any
        //  997    1003   996    997    Any
        //  996    1003   1003   1004   Ljava/lang/NullPointerException;
        //  996    1003   996    997    Any
        //  996    1003   3      8      Ljava/lang/ArithmeticException;
        //  1009   1018   1018   1019   Any
        //  1010   1018   1009   1010   Ljava/lang/NumberFormatException;
        //  1009   1018   1018   1019   Any
        //  1010   1018   3      8      Any
        //  1009   1018   3      8      Ljava/lang/RuntimeException;
        //  1036   1043   1043   1044   Any
        //  1036   1043   1043   1044   Any
        //  1036   1043   1036   1037   Ljava/lang/ClassCastException;
        //  1036   1043   1043   1044   Any
        //  1036   1043   1036   1037   Any
        //  1097   1104   1104   1105   Any
        //  1098   1104   1097   1098   Any
        //  1098   1104   1097   1098   Any
        //  1097   1104   1097   1098   Any
        //  1098   1104   3      8      Any
        //  1116   1125   1125   1126   Any
        //  1117   1125   3      8      Ljava/lang/ClassCastException;
        //  1117   1125   1116   1117   Any
        //  1117   1125   3      8      Any
        //  1116   1125   1116   1117   Ljava/lang/EnumConstantNotPresentException;
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
    
    public void 0(@NotNull final List list) {
        fbS.fJ(this, 237657055, list);
    }
    
    public static ArrayDeque c(final faG p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/faG.c:Ljava/util/ArrayDeque;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 66 FC 00 03 07 00 03 44 07 00 66 43 05 44 07 00 66 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/lang/NumberFormatException;
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
    
    public void 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          213
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            205
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            197
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: new             Ljava/lang/Thread;
        //    28: dup            
        //    29: new             Ldev/nuker/pyro/faE;
        //    32: dup            
        //    33: aload_0        
        //    34: getstatic       dev/nuker/pyro/fc.1:I
        //    37: ifeq            46
        //    40: ldc_w           -1006358505
        //    43: goto            49
        //    46: ldc_w           -975520485
        //    49: ldc_w           1543366433
        //    52: ixor           
        //    53: lookupswitch {
        //          -1611016394: 184
        //          712111936: 46
        //          default: 80
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokespecial   dev/nuker/pyro/faE.<init>:(Ldev/nuker/pyro/faG;)V
        //    87: goto            91
        //    90: athrow         
        //    91: checkcast       Ljava/lang/Runnable;
        //    94: goto            98
        //    97: athrow         
        //    98: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //   101: goto            105
        //   104: athrow         
        //   105: putfield        dev/nuker/pyro/faG.0:Ljava/lang/Thread;
        //   108: aload_0        
        //   109: getfield        dev/nuker/pyro/faG.0:Ljava/lang/Thread;
        //   112: dup            
        //   113: ifnonnull       127
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            139
        //   133: ldc_w           997266345
        //   136: goto            142
        //   139: ldc_w           17684595
        //   142: ldc_w           175264164
        //   145: ixor           
        //   146: lookupswitch {
        //          23816643: 139
        //          822297101: 186
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   java/lang/Thread.start:()V
        //   179: goto            183
        //   182: athrow         
        //   183: return         
        //   184: aconst_null    
        //   185: athrow         
        //   186: aconst_null    
        //   187: athrow         
        //   188: pop            
        //   189: goto            24
        //   192: pop            
        //   193: aconst_null    
        //   194: goto            188
        //   197: dup            
        //   198: ifnull          188
        //   201: checkcast       Ljava/lang/Throwable;
        //   204: athrow         
        //   205: dup            
        //   206: ifnull          192
        //   209: checkcast       Ljava/lang/Throwable;
        //   212: athrow         
        //   213: aconst_null    
        //   214: athrow         
        //    StackMapTable: 00 21 43 07 00 66 04 FF 00 0B 00 00 00 01 07 00 66 FC 00 03 07 00 03 FF 00 15 00 01 07 00 03 00 06 07 00 03 08 00 19 08 00 19 08 00 1D 08 00 1D 07 00 03 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 00 19 08 00 19 08 00 1D 08 00 1D 07 00 03 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 08 00 19 08 00 19 08 00 1D 08 00 1D 07 00 03 42 07 00 66 FF 00 00 00 01 07 00 03 00 06 07 00 03 08 00 19 08 00 19 08 00 1D 08 00 1D 07 00 03 45 07 00 66 FF 00 00 00 01 07 00 03 00 04 07 00 03 08 00 19 08 00 19 07 01 8B 45 07 00 66 FF 00 00 00 01 07 00 03 00 04 07 00 03 08 00 19 08 00 19 07 00 EF 45 07 00 66 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 E5 4D 07 00 43 40 07 00 E5 45 07 00 66 40 07 00 E5 4B 07 00 E5 FF 00 02 00 01 07 00 03 00 02 07 00 E5 01 5D 07 00 E5 42 07 00 66 40 07 00 E5 45 07 00 66 00 FF 00 00 00 01 07 00 03 00 06 07 00 03 08 00 19 08 00 19 08 00 1D 08 00 1D 07 00 03 41 07 00 E5 41 07 00 66 43 05 44 07 00 66 47 05 47 07 00 66
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     197    205    Ljava/lang/ClassCastException;
        //  197    205    197    205    Any
        //  213    215    3      8      Ljava/util/NoSuchElementException;
        //  83     90     90     91     Any
        //  84     90     3      8      Ljava/lang/NumberFormatException;
        //  84     90     83     84     Any
        //  84     90     90     91     Ljava/lang/IllegalStateException;
        //  83     90     90     91     Ljava/lang/ClassCastException;
        //  97     104    104    105    Any
        //  97     104    3      8      Any
        //  98     104    3      8      Any
        //  98     104    97     98     Ljava/lang/IllegalStateException;
        //  98     104    97     98     Any
        //  119    126    126    127    Any
        //  119    126    126    127    Ljava/lang/UnsupportedOperationException;
        //  119    126    3      8      Any
        //  120    126    126    127    Ljava/lang/ArithmeticException;
        //  120    126    119    120    Ljava/lang/RuntimeException;
        //  175    182    182    183    Any
        //  176    182    175    176    Any
        //  175    182    175    176    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  175    182    175    176    Any
        //  176    182    175    176    Ljava/lang/NullPointerException;
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aconst_null    
        //     5: invokespecial   dev/nuker/pyro/faC.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //     8: putstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/faC;
        //    11: new             Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //    14: dup            
        //    15: invokespecial   dev/nuker/pyro/hacks/stashfinder/StashFinderConfig.<init>:()V
        //    18: putstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //    21: new             Ldev/nuker/pyro/faG;
        //    24: dup            
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           1123995762
        //    34: goto            40
        //    37: ldc_w           108299473
        //    40: ldc_w           1316333077
        //    43: ixor           
        //    44: lookupswitch {
        //          210466407: 37
        //          1208033988: 72
        //          default: 153
        //        }
        //    72: invokespecial   dev/nuker/pyro/faG.<init>:()V
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            87
        //    81: ldc_w           723502574
        //    84: goto            90
        //    87: ldc_w           790650805
        //    90: ldc_w           1381569912
        //    93: ixor           
        //    94: lookupswitch {
        //          -975796277: 87
        //          2034684054: 155
        //          default: 120
        //        }
        //   120: putstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/faG;
        //   123: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/faC;
        //   126: ldc_w           "\u2937\u1487\u8034\ubf11\ufa2c\ue727\ub237\uec57"
        //   129: invokestatic    invokestatic   !!! ERROR
        //   132: invokevirtual   dev/nuker/pyro/faC.c:(Ljava/lang/String;)Ljava/io/File;
        //   135: putstatic       dev/nuker/pyro/faG.c:Ljava/io/File;
        //   138: getstatic       dev/nuker/pyro/faG.c:Ljava/io/File;
        //   141: dup            
        //   142: ifnonnull       148
        //   145: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   148: invokevirtual   java/io/File.mkdirs:()Z
        //   151: pop            
        //   152: return         
        //   153: aconst_null    
        //   154: athrow         
        //   155: aconst_null    
        //   156: athrow         
        //    StackMapTable: 00 09 FF 00 25 00 00 00 02 08 00 15 08 00 15 FF 00 02 00 00 00 03 08 00 15 08 00 15 01 FF 00 1F 00 00 00 02 08 00 15 08 00 15 4E 07 00 03 FF 00 02 00 00 00 02 07 00 03 01 5D 07 00 03 5B 07 01 B3 FF 00 04 00 00 00 02 08 00 15 08 00 15 41 07 00 03
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1072)
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
    public List 3() {
        return fbS.gL(this, 1791446357);
    }
    
    public static void c(final StashFinderConfig stashFinderConfig) {
        fbS.ff(null, 1593552135, stashFinderConfig);
    }
    
    public faG() {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.1 != 0) {
                    n = 1790211112;
                    break Label_0015;
                }
                n = 272764419;
            }
            switch (n ^ 0x6AB7A8E4) {
                case 625257193: {
                    continue;
                }
                default: {
                    this.c = new ArrayList<faB>();
                    this.0 = new ArrayList<fax>();
                    while (true) {
                        int n2 = 0;
                        Label_0091: {
                            if (fc.c < 0) {
                                n2 = 784156944;
                                break Label_0091;
                            }
                            n2 = -531597326;
                        }
                        switch (n2 ^ 0x5F1FF566) {
                            case 958286480: {
                                continue;
                            }
                            default: {
                                this.1 = new ArrayList<faB>();
                                this.c = new ArrayDeque<Chunk>();
                                return;
                            }
                            case 1906490486: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 253132: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static void 1(final faG faG) {
        fbS.6S(null, 203781865, faG);
    }
    
    public static void c(final faG faG, final Thread 0) {
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
                            if (fc.c < 0) {
                                continue Label_0039;
                            }
                            null;
                            faG.0 = 0;
                            return;
                        }
                        catch (NoSuchElementException ex) {
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
    
    public static faG 1() {
        return fbS.8X(null, 118935799);
    }
    
    @NotNull
    public List 0() {
        return fbS.gQ(this, 1252482468);
    }
}
