// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.client.entity.EntityPlayerSP;
import kotlin.jvm.internal.Ref;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.util.math.BlockPos;
import java.util.LinkedHashMap;

public class f6z extends fH
{
    public int 1;
    public boolean c;
    @NotNull
    public LinkedHashMap<BlockPos, AtomicInteger> c;
    public int 2;
    @NotNull
    public LinkedHashMap<fbm, BlockPos[]> 0;
    @Nullable
    public BlockPos c;
    @Nullable
    public BlockPos 0;
    @Nullable
    public BlockPos 1;
    
    public void 4(final int n) {
        fbS.62(this, 828369114, n);
    }
    
    public void c(@Nullable final BlockPos blockPos) {
        fbS.3Z(this, 110723365, blockPos);
    }
    
    public int 4() {
        return fbS.bt(this, 1843089794);
    }
    
    public void 3(final int n) {
        fbS.6x(this, 439583393, n);
    }
    
    public void c(final boolean b) {
        fbS.46(this, 1290090817, b);
    }
    
    public void 0(@NotNull final LinkedHashMap linkedHashMap) {
        fbS.hw(this, 954064971, linkedHashMap);
    }
    
    @Nullable
    public BlockPos 5() {
        return fbS.7R(this, 860375338);
    }
    
    public BlockPos 3(final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          899
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            891
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            883
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.1:I
        //    42: ifeq            50
        //    45: ldc             -951876211
        //    47: goto            52
        //    50: ldc             -1570603654
        //    52: ldc             2009779755
        //    54: ixor           
        //    55: lookupswitch {
        //          -1333179482: 50
        //          -710364335: 80
        //          default: 846
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    89: goto            93
        //    92: athrow         
        //    93: astore_2       
        //    94: aload_2        
        //    95: goto            99
        //    98: athrow         
        //    99: invokeinterface java/util/Iterator.hasNext:()Z
        //   104: goto            108
        //   107: athrow         
        //   108: ifeq            844
        //   111: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   114: dup            
        //   115: getstatic       dev/nuker/pyro/fc.c:I
        //   118: ifge            126
        //   121: ldc             35705825
        //   123: goto            128
        //   126: ldc             -916661111
        //   128: ldc             1904260599
        //   130: ixor           
        //   131: lookupswitch {
        //          64334166: 126
        //          1939891734: 864
        //          default: 156
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   163: goto            167
        //   166: athrow         
        //   167: astore_3       
        //   168: getstatic       dev/nuker/pyro/fc.c:I
        //   171: ifge            179
        //   174: ldc             -1970040962
        //   176: goto            181
        //   179: ldc             -1299473184
        //   181: ldc             1046637136
        //   183: ixor           
        //   184: lookupswitch {
        //          -1930824016: 212
        //          -1259215570: 179
        //          default: 862
        //        }
        //   212: aload_2        
        //   213: goto            217
        //   216: athrow         
        //   217: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   222: goto            226
        //   225: athrow         
        //   226: astore          5
        //   228: iconst_0       
        //   229: getstatic       dev/nuker/pyro/fc.0:I
        //   232: ifeq            240
        //   235: ldc             -1365943297
        //   237: goto            242
        //   240: ldc             -1014852896
        //   242: ldc             -976901537
        //   244: ixor           
        //   245: lookupswitch {
        //          105330879: 272
        //          1800466848: 240
        //          default: 870
        //        }
        //   272: istore          6
        //   274: iconst_0       
        //   275: istore          7
        //   277: aload           5
        //   279: checkcast       Ljava/util/Map$Entry;
        //   282: astore          8
        //   284: iconst_0       
        //   285: istore          9
        //   287: getstatic       dev/nuker/pyro/fc.1:I
        //   290: ifeq            298
        //   293: ldc             -1448190508
        //   295: goto            300
        //   298: ldc             423210027
        //   300: ldc             -703068651
        //   302: ixor           
        //   303: lookupswitch {
        //          -819877314: 328
        //          2142657473: 298
        //          default: 850
        //        }
        //   328: aload_3        
        //   329: getstatic       dev/nuker/pyro/fc.1:I
        //   332: ifeq            340
        //   335: ldc             -564647501
        //   337: goto            342
        //   340: ldc             -687416702
        //   342: ldc             640941287
        //   344: ixor           
        //   345: lookupswitch {
        //          -248175003: 372
        //          -127150764: 340
        //          default: 866
        //        }
        //   372: aload           8
        //   374: getstatic       dev/nuker/pyro/fc.1:I
        //   377: ifeq            385
        //   380: ldc             -1309617664
        //   382: goto            387
        //   385: ldc             1016412773
        //   387: ldc             305325209
        //   389: ixor           
        //   390: lookupswitch {
        //          -1955704445: 385
        //          -1547553127: 868
        //          default: 416
        //        }
        //   416: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   419: getstatic       dev/nuker/pyro/fc.0:I
        //   422: ifeq            430
        //   425: ldc             1005376872
        //   427: goto            432
        //   430: ldc             1975534135
        //   432: ldc             -855213893
        //   434: ixor           
        //   435: lookupswitch {
        //          -1194968436: 460
        //          -152392237: 430
        //          default: 856
        //        }
        //   460: aload           5
        //   462: checkcast       Ljava/util/Map$Entry;
        //   465: goto            469
        //   468: athrow         
        //   469: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   474: goto            478
        //   477: athrow         
        //   478: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   481: getstatic       dev/nuker/pyro/fc.1:I
        //   484: ifeq            492
        //   487: ldc             193744023
        //   489: goto            494
        //   492: ldc             -2097862886
        //   494: ldc             733429898
        //   496: ixor           
        //   497: lookupswitch {
        //          -1455265904: 524
        //          540740637: 492
        //          default: 852
        //        }
        //   524: astore          4
        //   526: getstatic       dev/nuker/pyro/fc.1:I
        //   529: ifeq            537
        //   532: ldc             -1524176810
        //   534: goto            539
        //   537: ldc             172101588
        //   539: ldc             1612747604
        //   541: ixor           
        //   542: lookupswitch {
        //          -989431038: 848
        //          326645286: 537
        //          default: 568
        //        }
        //   568: aload_3        
        //   569: getstatic       dev/nuker/pyro/fc.1:I
        //   572: ifeq            580
        //   575: ldc             -539706598
        //   577: goto            582
        //   580: ldc             367927325
        //   582: ldc             -699964903
        //   584: ixor           
        //   585: lookupswitch {
        //          -1012317692: 612
        //          160684291: 580
        //          default: 860
        //        }
        //   612: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   615: checkcast       Ljava/util/Map$Entry;
        //   618: goto            622
        //   621: athrow         
        //   622: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   627: goto            631
        //   630: athrow         
        //   631: checkcast       Ljava/util/concurrent/atomic/AtomicInteger;
        //   634: getstatic       dev/nuker/pyro/fc.c:I
        //   637: ifge            645
        //   640: ldc             565414152
        //   642: goto            647
        //   645: ldc             -716084861
        //   647: ldc             -1141909106
        //   649: ixor           
        //   650: lookupswitch {
        //          -1891626243: 645
        //          -1705226106: 858
        //          default: 676
        //        }
        //   676: astore          5
        //   678: aload           4
        //   680: ifnull          841
        //   683: getstatic       dev/nuker/pyro/fc.0:I
        //   686: ifeq            694
        //   689: ldc             343649635
        //   691: goto            696
        //   694: ldc             -734487354
        //   696: ldc             -1258068237
        //   698: ixor           
        //   699: lookupswitch {
        //          -1585919088: 872
        //          -426318935: 694
        //          default: 724
        //        }
        //   724: aload           4
        //   726: aload_1        
        //   727: dup            
        //   728: ifnonnull       760
        //   731: new             Lkotlin/TypeCastException;
        //   734: dup            
        //   735: ldc             "\u2228\u1486\u8b3b\ub194\ucfec\uec23\ub225\ue714\udb27\uefd0\ua6f4\u1e0c\ue03c\uc7e3\u8718\u88b8\u57a5\u76cc\ubf68\uc623\u2ac0\uc234\u6b97\u2f19\ud1b2\u344d\u7d66\u887a\u8245\u8af4\u856a\ufb72\u711c\u984e\u1dfa\uf0a4\u493c\u89b0\uc8c8\uf95c\ub712\u41fa\ub820\ub147\u4a3b\u8b3d\u7c70"
        //   737: goto            741
        //   740: athrow         
        //   741: invokestatic    invokestatic   !!! ERROR
        //   744: goto            748
        //   747: athrow         
        //   748: goto            752
        //   751: athrow         
        //   752: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   755: goto            759
        //   758: athrow         
        //   759: athrow         
        //   760: checkcast       Ljava/lang/Object;
        //   763: goto            767
        //   766: athrow         
        //   767: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   770: goto            774
        //   773: athrow         
        //   774: iconst_1       
        //   775: ixor           
        //   776: ifeq            841
        //   779: aload           5
        //   781: getstatic       dev/nuker/pyro/fc.1:I
        //   784: ifeq            792
        //   787: ldc             -643764381
        //   789: goto            794
        //   792: ldc             -149350818
        //   794: ldc             1276258456
        //   796: ixor           
        //   797: lookupswitch {
        //          -1783445509: 854
        //          -1646761987: 792
        //          default: 824
        //        }
        //   824: goto            828
        //   827: athrow         
        //   828: invokevirtual   java/util/concurrent/atomic/AtomicInteger.intValue:()I
        //   831: goto            835
        //   834: athrow         
        //   835: ifle            841
        //   838: aload           4
        //   840: areturn        
        //   841: goto            94
        //   844: aconst_null    
        //   845: areturn        
        //   846: aconst_null    
        //   847: athrow         
        //   848: aconst_null    
        //   849: athrow         
        //   850: aconst_null    
        //   851: athrow         
        //   852: aconst_null    
        //   853: athrow         
        //   854: aconst_null    
        //   855: athrow         
        //   856: aconst_null    
        //   857: athrow         
        //   858: aconst_null    
        //   859: athrow         
        //   860: aconst_null    
        //   861: athrow         
        //   862: aconst_null    
        //   863: athrow         
        //   864: aconst_null    
        //   865: athrow         
        //   866: aconst_null    
        //   867: athrow         
        //   868: aconst_null    
        //   869: athrow         
        //   870: aconst_null    
        //   871: athrow         
        //   872: aconst_null    
        //   873: athrow         
        //   874: pop            
        //   875: goto            24
        //   878: pop            
        //   879: aconst_null    
        //   880: goto            874
        //   883: dup            
        //   884: ifnull          874
        //   887: checkcast       Ljava/lang/Throwable;
        //   890: athrow         
        //   891: dup            
        //   892: ifnull          878
        //   895: checkcast       Ljava/lang/Throwable;
        //   898: athrow         
        //   899: aconst_null    
        //   900: athrow         
        //    StackMapTable: 00 71 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FD 00 03 07 00 03 07 00 A4 46 07 00 5F 40 07 00 63 45 07 00 5F 40 07 00 6C 4A 07 00 6C FF 00 01 00 02 07 00 03 07 00 A4 00 02 07 00 6C 01 5B 07 00 6C 42 07 00 47 40 07 00 6C 47 07 00 5F 40 07 00 72 FC 00 00 07 00 72 43 07 00 5F 40 07 00 72 47 07 00 5F 40 01 FF 00 11 00 03 07 00 03 07 00 A4 07 00 72 00 02 08 00 6F 08 00 6F FF 00 01 00 03 07 00 03 07 00 A4 07 00 72 00 03 08 00 6F 08 00 6F 01 FF 00 1B 00 03 07 00 03 07 00 A4 07 00 72 00 02 08 00 6F 08 00 6F 42 07 00 5F FF 00 00 00 03 07 00 03 07 00 A4 07 00 72 00 02 08 00 6F 08 00 6F 45 07 00 5F 40 07 00 78 FC 00 0B 07 00 78 41 01 1E 43 07 00 5F 40 07 00 72 47 07 00 5F 40 07 00 C6 FF 00 0D 00 06 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 00 01 01 FF 00 01 00 06 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 00 02 01 01 5D 01 FF 00 19 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 00 41 01 1B 4B 07 00 78 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 02 07 00 78 01 5D 07 00 78 FF 00 0C 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 02 07 00 78 07 00 8F FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 03 07 00 78 07 00 8F 01 FF 00 1C 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 02 07 00 78 07 00 8F 0D 41 01 1B 47 07 00 4D 40 07 00 8F 47 07 00 5F 40 07 00 C6 4D 07 00 A4 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 02 07 00 A4 01 5D 07 00 A4 FF 00 0C 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 C6 01 01 07 00 8F 01 00 00 41 01 1C 4B 07 00 78 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 C6 01 01 07 00 8F 01 00 02 07 00 78 01 5D 07 00 78 48 07 00 43 40 07 00 8F 47 07 00 5F 40 07 00 C6 4D 07 00 B2 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 C6 01 01 07 00 8F 01 00 02 07 00 B2 01 5C 07 00 B2 FF 00 11 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 00 41 01 1B 4F 07 00 55 FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 05 07 00 A4 07 00 A4 08 02 DB 08 02 DB 07 00 D4 45 07 00 5F FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 05 07 00 A4 07 00 A4 08 02 DB 08 02 DB 07 00 D4 FF 00 02 00 00 00 01 07 00 5F FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 05 07 00 A4 07 00 A4 08 02 DB 08 02 DB 07 00 D4 45 07 00 5F FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 03 07 00 A4 07 00 A4 07 00 BA FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 02 07 00 A4 07 00 A4 45 07 00 5F FF 00 00 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 02 07 00 A4 07 00 C6 45 07 00 5F 40 01 51 07 00 B2 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 02 07 00 B2 01 5D 07 00 B2 42 07 00 5F 40 07 00 B2 45 07 00 5F 40 01 05 FF 00 02 00 03 07 00 03 07 00 A4 07 00 72 00 00 FF 00 01 00 02 07 00 03 07 00 A4 00 01 07 00 6C FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 C6 01 01 07 00 8F 01 00 00 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 00 41 07 00 A4 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 01 07 00 B2 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 00 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 C6 01 01 07 00 8F 01 00 01 07 00 B2 41 07 00 78 FF 00 01 00 04 07 00 03 07 00 A4 07 00 72 07 00 78 00 00 FF 00 01 00 03 07 00 03 07 00 A4 07 00 72 00 02 08 00 6F 08 00 6F FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 01 07 00 78 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 01 01 07 00 8F 01 00 02 07 00 78 07 00 8F FF 00 01 00 06 07 00 03 07 00 A4 07 00 72 07 00 78 00 07 00 C6 00 01 01 FF 00 01 00 0A 07 00 03 07 00 A4 07 00 72 07 00 78 07 00 A4 07 00 B2 01 01 07 00 8F 01 00 00 FF 00 01 00 02 07 00 03 07 00 A4 00 01 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     883    891    Ljava/lang/NumberFormatException;
        //  883    891    883    891    Any
        //  899    901    3      8      Any
        //  31     38     38     39     Any
        //  32     38     31     32     Ljava/lang/NegativeArraySizeException;
        //  32     38     3      8      Ljava/lang/RuntimeException;
        //  31     38     31     32     Any
        //  32     38     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  83     92     92     93     Any
        //  84     92     92     93     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  84     92     3      8      Any
        //  84     92     83     84     Ljava/lang/EnumConstantNotPresentException;
        //  83     92     3      8      Ljava/lang/IllegalArgumentException;
        //  98     107    107    108    Any
        //  99     107    3      8      Any
        //  98     107    3      8      Any
        //  99     107    98     99     Any
        //  98     107    98     99     Ljava/lang/ArithmeticException;
        //  159    166    166    167    Any
        //  160    166    3      8      Any
        //  159    166    159    160    Any
        //  159    166    3      8      Any
        //  159    166    166    167    Any
        //  216    225    225    226    Any
        //  216    225    3      8      Ljava/lang/UnsupportedOperationException;
        //  217    225    216    217    Ljava/lang/EnumConstantNotPresentException;
        //  216    225    216    217    Any
        //  217    225    225    226    Ljava/util/ConcurrentModificationException;
        //  468    477    477    478    Any
        //  468    477    477    478    Ljava/lang/IndexOutOfBoundsException;
        //  468    477    477    478    Any
        //  469    477    468    469    Ljava/lang/ArithmeticException;
        //  469    477    3      8      Any
        //  621    630    630    631    Any
        //  622    630    630    631    Ljava/lang/ClassCastException;
        //  621    630    621    622    Ljava/lang/NegativeArraySizeException;
        //  621    630    3      8      Any
        //  621    630    3      8      Any
        //  740    747    747    748    Any
        //  740    747    747    748    Ljava/lang/IndexOutOfBoundsException;
        //  741    747    3      8      Any
        //  741    747    747    748    Any
        //  740    747    740    741    Ljava/lang/ClassCastException;
        //  752    758    758    759    Any
        //  752    758    3      8      Any
        //  752    758    3      8      Any
        //  752    758    758    759    Any
        //  752    758    758    759    Ljava/lang/NullPointerException;
        //  766    773    773    774    Any
        //  766    773    3      8      Any
        //  766    773    766    767    Any
        //  767    773    766    767    Ljava/util/NoSuchElementException;
        //  766    773    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  827    834    834    835    Any
        //  827    834    827    828    Any
        //  828    834    834    835    Any
        //  827    834    3      8      Any
        //  828    834    3      8      Ljava/lang/ArithmeticException;
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
    
    public void 1(final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          97
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            89
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            81
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: ifnull          71
        //    28: aload_0        
        //    29: aload_1        
        //    30: putfield        dev/nuker/pyro/f6z.c:Lnet/minecraft/util/math/BlockPos;
        //    33: aload_0        
        //    34: getfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //    37: checkcast       Ljava/util/Map;
        //    40: aload_1        
        //    41: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //    44: dup            
        //    45: iconst_m1      
        //    46: goto            50
        //    49: athrow         
        //    50: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //    53: goto            57
        //    56: athrow         
        //    57: goto            61
        //    60: athrow         
        //    61: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    66: goto            70
        //    69: athrow         
        //    70: pop            
        //    71: return         
        //    72: pop            
        //    73: goto            24
        //    76: pop            
        //    77: aconst_null    
        //    78: goto            72
        //    81: dup            
        //    82: ifnull          72
        //    85: checkcast       Ljava/lang/Throwable;
        //    88: athrow         
        //    89: dup            
        //    90: ifnull          76
        //    93: checkcast       Ljava/lang/Throwable;
        //    96: athrow         
        //    97: aconst_null    
        //    98: athrow         
        //    StackMapTable: 00 12 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FD 00 03 07 00 03 07 00 A4 58 07 00 5F FF 00 00 00 02 07 00 03 07 00 A4 00 05 07 00 D8 07 00 A4 08 00 29 08 00 29 01 45 07 00 5F FF 00 00 00 02 07 00 03 07 00 A4 00 03 07 00 D8 07 00 A4 07 00 B2 42 07 00 5F FF 00 00 00 02 07 00 03 07 00 A4 00 03 07 00 D8 07 00 A4 07 00 B2 47 07 00 5F 40 07 00 C6 00 40 07 00 45 43 05 44 07 00 45 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     81     89     Ljava/util/ConcurrentModificationException;
        //  81     89     81     89     Ljava/lang/IllegalArgumentException;
        //  97     99     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  49     56     56     57     Any
        //  50     56     49     50     Any
        //  50     56     56     57     Any
        //  49     56     3      8      Any
        //  49     56     49     50     Ljava/lang/NullPointerException;
        //  60     69     69     70     Any
        //  60     69     60     61     Any
        //  60     69     3      8      Any
        //  61     69     60     61     Ljava/lang/ArithmeticException;
        //  60     69     60     61     Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 49 out of bounds for length 49
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
    
    public void c(@NotNull final LinkedHashMap linkedHashMap) {
        fbS.hw(this, 954064970, linkedHashMap);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3i p0) {
        public class f6y implements Consumer
        {
            public f6z c;
            public Ref.ObjectRef c;
            
            @Override
            public void accept(final Object o) {
                fbS.2J(this, 1707489967, o);
            }
            
            public void c(final EntityPlayerSP p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          1349
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            1341
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            1333
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.c:I
                //    27: ifge            35
                //    30: ldc             480641493
                //    32: goto            37
                //    35: ldc             -1630715174
                //    37: ldc             2137600183
                //    39: ixor           
                //    40: lookupswitch {
                //          -1649046788: 35
                //          1674522978: 1318
                //          default: 68
                //        }
                //    68: aload_0        
                //    69: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //    72: goto            76
                //    75: athrow         
                //    76: invokevirtual   dev/nuker/pyro/f6z.4:()I
                //    79: goto            83
                //    82: athrow         
                //    83: ifne            91
                //    86: ldc             -867324785
                //    88: goto            93
                //    91: ldc             -867324786
                //    93: ldc             -1033988343
                //    95: ixor           
                //    96: tableswitch {
                //          472282892: 120
                //          472282893: 804
                //          default: 86
                //        }
                //   120: aload_0        
                //   121: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   124: getstatic       dev/nuker/pyro/fc.1:I
                //   127: ifeq            135
                //   130: ldc             447990919
                //   132: goto            137
                //   135: ldc             -897729947
                //   137: ldc             1902365656
                //   139: ixor           
                //   140: lookupswitch {
                //          -1155632707: 168
                //          1808795487: 135
                //          default: 1320
                //        }
                //   168: goto            172
                //   171: athrow         
                //   172: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //   175: goto            179
                //   178: athrow         
                //   179: ifnull          804
                //   182: getstatic       dev/nuker/pyro/fc.0:I
                //   185: ifeq            193
                //   188: ldc             -163398713
                //   190: goto            195
                //   193: ldc             -458230337
                //   195: ldc             -71955377
                //   197: ixor           
                //   198: lookupswitch {
                //          234141576: 193
                //          521796080: 224
                //          default: 1304
                //        }
                //   224: aload_0        
                //   225: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   228: goto            232
                //   231: athrow         
                //   232: invokestatic    dev/nuker/pyro/f6z.c:(Ldev/nuker/pyro/f6z;)Lnet/minecraft/client/Minecraft;
                //   235: goto            239
                //   238: athrow         
                //   239: dup            
                //   240: pop            
                //   241: getstatic       dev/nuker/pyro/fc.1:I
                //   244: ifeq            252
                //   247: ldc             1465904964
                //   249: goto            254
                //   252: ldc             -1795422648
                //   254: ldc             -1761862138
                //   256: ixor           
                //   257: lookupswitch {
                //          -1345674270: 252
                //          -1046220478: 1298
                //          default: 284
                //        }
                //   284: goto            288
                //   287: athrow         
                //   288: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
                //   291: goto            295
                //   294: athrow         
                //   295: dup            
                //   296: ifnonnull       310
                //   299: goto            303
                //   302: athrow         
                //   303: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   306: goto            310
                //   309: athrow         
                //   310: new             Lnet/minecraft/network/play/client/CPacketPlayerDigging;
                //   313: dup            
                //   314: getstatic       net/minecraft/network/play/client/CPacketPlayerDigging$Action.START_DESTROY_BLOCK:Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
                //   317: getstatic       dev/nuker/pyro/fc.0:I
                //   320: ifeq            328
                //   323: ldc             -211369716
                //   325: goto            330
                //   328: ldc             1283016964
                //   330: ldc             -104580641
                //   332: ixor           
                //   333: lookupswitch {
                //          178452691: 1322
                //          1349351234: 328
                //          default: 360
                //        }
                //   360: aload_0        
                //   361: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   364: goto            368
                //   367: athrow         
                //   368: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //   371: goto            375
                //   374: athrow         
                //   375: getstatic       dev/nuker/pyro/fc.1:I
                //   378: ifeq            386
                //   381: ldc             -1656197563
                //   383: goto            388
                //   386: ldc             1142258882
                //   388: ldc             1801439793
                //   390: ixor           
                //   391: lookupswitch {
                //          -1862921934: 386
                //          -166222732: 1308
                //          default: 416
                //        }
                //   416: aload_0        
                //   417: getstatic       dev/nuker/pyro/fc.1:I
                //   420: ifeq            428
                //   423: ldc             -1108720127
                //   425: goto            430
                //   428: ldc             -1006661215
                //   430: ldc             454419555
                //   432: ixor           
                //   433: lookupswitch {
                //          -1493196190: 1310
                //          816083731: 428
                //          default: 460
                //        }
                //   460: getfield        dev/nuker/pyro/f6y.c:Lkotlin/jvm/internal/Ref$ObjectRef;
                //   463: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
                //   466: checkcast       Lnet/minecraft/util/EnumFacing;
                //   469: getstatic       dev/nuker/pyro/fc.1:I
                //   472: ifeq            480
                //   475: ldc             -1110737843
                //   477: goto            482
                //   480: ldc             -1014678981
                //   482: ldc             1268076720
                //   484: ixor           
                //   485: lookupswitch {
                //          -2012190069: 512
                //          -161600259: 480
                //          default: 1300
                //        }
                //   512: goto            516
                //   515: athrow         
                //   516: invokespecial   net/minecraft/network/play/client/CPacketPlayerDigging.<init>:(Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
                //   519: goto            523
                //   522: athrow         
                //   523: checkcast       Lnet/minecraft/network/Packet;
                //   526: goto            530
                //   529: athrow         
                //   530: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
                //   533: goto            537
                //   536: athrow         
                //   537: getstatic       dev/nuker/pyro/fc.c:I
                //   540: ifge            548
                //   543: ldc             38341926
                //   545: goto            550
                //   548: ldc             -51574772
                //   550: ldc             -88409282
                //   552: ixor           
                //   553: lookupswitch {
                //          -118229480: 548
                //          106427186: 580
                //          default: 1316
                //        }
                //   580: aload_0        
                //   581: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   584: goto            588
                //   587: athrow         
                //   588: invokestatic    dev/nuker/pyro/f6z.c:(Ldev/nuker/pyro/f6z;)Lnet/minecraft/client/Minecraft;
                //   591: goto            595
                //   594: athrow         
                //   595: dup            
                //   596: pop            
                //   597: goto            601
                //   600: athrow         
                //   601: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
                //   604: goto            608
                //   607: athrow         
                //   608: dup            
                //   609: ifnonnull       623
                //   612: goto            616
                //   615: athrow         
                //   616: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   619: goto            623
                //   622: athrow         
                //   623: new             Lnet/minecraft/network/play/client/CPacketPlayerDigging;
                //   626: dup            
                //   627: getstatic       dev/nuker/pyro/fc.c:I
                //   630: ifge            638
                //   633: ldc             -312574626
                //   635: goto            640
                //   638: ldc             1870695923
                //   640: ldc             1935124511
                //   642: ixor           
                //   643: lookupswitch {
                //          -1832176116: 638
                //          -1643522751: 1292
                //          default: 668
                //        }
                //   668: getstatic       net/minecraft/network/play/client/CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK:Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
                //   671: aload_0        
                //   672: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   675: goto            679
                //   678: athrow         
                //   679: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //   682: goto            686
                //   685: athrow         
                //   686: aload_0        
                //   687: getstatic       dev/nuker/pyro/fc.c:I
                //   690: ifge            698
                //   693: ldc             -110900223
                //   695: goto            700
                //   698: ldc             478755836
                //   700: ldc             515315005
                //   702: ixor           
                //   703: lookupswitch {
                //          -405481156: 698
                //          37629633: 728
                //          default: 1302
                //        }
                //   728: getfield        dev/nuker/pyro/f6y.c:Lkotlin/jvm/internal/Ref$ObjectRef;
                //   731: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
                //   734: checkcast       Lnet/minecraft/util/EnumFacing;
                //   737: goto            741
                //   740: athrow         
                //   741: invokespecial   net/minecraft/network/play/client/CPacketPlayerDigging.<init>:(Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
                //   744: goto            748
                //   747: athrow         
                //   748: checkcast       Lnet/minecraft/network/Packet;
                //   751: getstatic       dev/nuker/pyro/fc.c:I
                //   754: ifge            762
                //   757: ldc             -2114412907
                //   759: goto            764
                //   762: ldc             -1067314703
                //   764: ldc             1192382780
                //   766: ixor           
                //   767: lookupswitch {
                //          -957689943: 1306
                //          614835957: 762
                //          default: 792
                //        }
                //   792: goto            796
                //   795: athrow         
                //   796: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
                //   799: goto            803
                //   802: athrow         
                //   803: return         
                //   804: getstatic       dev/nuker/pyro/fc.c:I
                //   807: ifge            815
                //   810: ldc             435847217
                //   812: goto            817
                //   815: ldc             -942810031
                //   817: ldc             -760620502
                //   819: ixor           
                //   820: lookupswitch {
                //          -883729893: 1314
                //          -338951715: 815
                //          default: 848
                //        }
                //   848: aload_0        
                //   849: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   852: goto            856
                //   855: athrow         
                //   856: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //   859: goto            863
                //   862: athrow         
                //   863: ifnull          1289
                //   866: aload_0        
                //   867: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   870: getstatic       dev/nuker/pyro/fc.1:I
                //   873: ifeq            881
                //   876: ldc             700130695
                //   878: goto            883
                //   881: ldc             -1938925864
                //   883: ldc             499267672
                //   885: ixor           
                //   886: lookupswitch {
                //          -1850970496: 912
                //          880352735: 881
                //          default: 1290
                //        }
                //   912: goto            916
                //   915: athrow         
                //   916: invokevirtual   dev/nuker/pyro/f6z.0:()Ljava/util/LinkedHashMap;
                //   919: goto            923
                //   922: athrow         
                //   923: aload_0        
                //   924: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //   927: getstatic       dev/nuker/pyro/fc.c:I
                //   930: ifge            938
                //   933: ldc             1365454376
                //   935: goto            940
                //   938: ldc             -1212847843
                //   940: ldc             293804587
                //   942: ixor           
                //   943: lookupswitch {
                //          -1506381002: 968
                //          1088435203: 938
                //          default: 1294
                //        }
                //   968: goto            972
                //   971: athrow         
                //   972: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //   975: goto            979
                //   978: athrow         
                //   979: dup            
                //   980: ifnonnull       988
                //   983: ldc             -1203904318
                //   985: goto            990
                //   988: ldc             -1203904291
                //   990: ldc             772214541
                //   992: ixor           
                //   993: tableswitch {
                //          745922462: 1016
                //          745922463: 1027
                //          default: 983
                //        }
                //  1016: goto            1020
                //  1019: athrow         
                //  1020: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //  1023: goto            1027
                //  1026: athrow         
                //  1027: goto            1031
                //  1030: athrow         
                //  1031: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
                //  1034: goto            1038
                //  1037: athrow         
                //  1038: dup            
                //  1039: ifnonnull       1047
                //  1042: ldc             -1186504453
                //  1044: goto            1049
                //  1047: ldc             -1186504454
                //  1049: ldc             101765739
                //  1051: ixor           
                //  1052: tableswitch {
                //          2125423904: 1076
                //          2125423905: 1087
                //          default: 1042
                //        }
                //  1076: goto            1080
                //  1079: athrow         
                //  1080: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //  1083: goto            1087
                //  1086: athrow         
                //  1087: checkcast       Ljava/util/concurrent/atomic/AtomicInteger;
                //  1090: goto            1094
                //  1093: athrow         
                //  1094: invokevirtual   java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
                //  1097: goto            1101
                //  1100: athrow         
                //  1101: pop            
                //  1102: getstatic       dev/nuker/pyro/fc.0:I
                //  1105: ifeq            1113
                //  1108: ldc             1406748532
                //  1110: goto            1115
                //  1113: ldc             259019261
                //  1115: ldc             91093969
                //  1117: ixor           
                //  1118: lookupswitch {
                //          169716268: 1144
                //          1454685349: 1113
                //          default: 1312
                //        }
                //  1144: aload_0        
                //  1145: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //  1148: goto            1152
                //  1151: athrow         
                //  1152: invokestatic    dev/nuker/pyro/f6z.c:(Ldev/nuker/pyro/f6z;)Lnet/minecraft/client/Minecraft;
                //  1155: goto            1159
                //  1158: athrow         
                //  1159: dup            
                //  1160: pop            
                //  1161: goto            1165
                //  1164: athrow         
                //  1165: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
                //  1168: goto            1172
                //  1171: athrow         
                //  1172: dup            
                //  1173: ifnonnull       1187
                //  1176: goto            1180
                //  1179: athrow         
                //  1180: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //  1183: goto            1187
                //  1186: athrow         
                //  1187: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
                //  1190: dup            
                //  1191: aload_0        
                //  1192: getfield        dev/nuker/pyro/f6y.c:Ldev/nuker/pyro/f6z;
                //  1195: goto            1199
                //  1198: athrow         
                //  1199: invokevirtual   dev/nuker/pyro/f6z.2:()Lnet/minecraft/util/math/BlockPos;
                //  1202: goto            1206
                //  1205: athrow         
                //  1206: aload_0        
                //  1207: getfield        dev/nuker/pyro/f6y.c:Lkotlin/jvm/internal/Ref$ObjectRef;
                //  1210: getstatic       dev/nuker/pyro/fc.0:I
                //  1213: ifeq            1221
                //  1216: ldc             1831521013
                //  1218: goto            1223
                //  1221: ldc             -1388161236
                //  1223: ldc             619823620
                //  1225: ixor           
                //  1226: lookupswitch {
                //          -624578777: 1221
                //          1239091441: 1296
                //          default: 1252
                //        }
                //  1252: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
                //  1255: checkcast       Lnet/minecraft/util/EnumFacing;
                //  1258: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
                //  1261: fconst_0       
                //  1262: fconst_0       
                //  1263: fconst_0       
                //  1264: goto            1268
                //  1267: athrow         
                //  1268: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
                //  1271: goto            1275
                //  1274: athrow         
                //  1275: checkcast       Lnet/minecraft/network/Packet;
                //  1278: goto            1282
                //  1281: athrow         
                //  1282: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
                //  1285: goto            1289
                //  1288: athrow         
                //  1289: return         
                //  1290: aconst_null    
                //  1291: athrow         
                //  1292: aconst_null    
                //  1293: athrow         
                //  1294: aconst_null    
                //  1295: athrow         
                //  1296: aconst_null    
                //  1297: athrow         
                //  1298: aconst_null    
                //  1299: athrow         
                //  1300: aconst_null    
                //  1301: athrow         
                //  1302: aconst_null    
                //  1303: athrow         
                //  1304: aconst_null    
                //  1305: athrow         
                //  1306: aconst_null    
                //  1307: athrow         
                //  1308: aconst_null    
                //  1309: athrow         
                //  1310: aconst_null    
                //  1311: athrow         
                //  1312: aconst_null    
                //  1313: athrow         
                //  1314: aconst_null    
                //  1315: athrow         
                //  1316: aconst_null    
                //  1317: athrow         
                //  1318: aconst_null    
                //  1319: athrow         
                //  1320: aconst_null    
                //  1321: athrow         
                //  1322: aconst_null    
                //  1323: athrow         
                //  1324: pop            
                //  1325: goto            24
                //  1328: pop            
                //  1329: aconst_null    
                //  1330: goto            1324
                //  1333: dup            
                //  1334: ifnull          1324
                //  1337: checkcast       Ljava/lang/Throwable;
                //  1340: athrow         
                //  1341: dup            
                //  1342: ifnull          1328
                //  1345: checkcast       Ljava/lang/Throwable;
                //  1348: athrow         
                //  1349: aconst_null    
                //  1350: athrow         
                //    StackMapTable: 00 C6 43 07 00 3F 04 FF 00 0B 00 00 00 01 07 00 3F FD 00 03 07 00 03 07 00 D6 0A 41 01 1E 46 07 00 3F 40 07 00 09 45 07 00 3F 40 01 02 04 41 01 1A 4E 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 09 01 5E 07 00 09 42 07 00 3F 40 07 00 09 45 07 00 3F 40 07 00 D8 0D 41 01 1C FF 00 06 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 01 07 00 09 45 07 00 3F 40 07 00 63 4C 07 00 63 FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 63 01 5D 07 00 63 42 07 00 24 40 07 00 63 45 07 00 3F 40 07 00 93 46 07 00 20 40 07 00 93 45 07 00 3F 40 07 00 93 FF 00 11 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 01 36 08 01 36 07 00 71 FF 00 01 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 01 FF 00 1D 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 01 36 08 01 36 07 00 71 46 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 07 00 09 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 FF 00 0A 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 FF 00 01 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 01 FF 00 1B 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 FF 00 0B 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 03 FF 00 01 00 02 07 00 03 07 00 D6 00 07 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 03 FF 00 13 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 88 FF 00 01 00 02 07 00 03 07 00 D6 00 07 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 88 01 FF 00 1D 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 88 42 07 00 1E FF 00 00 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 88 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 6F 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 45 07 00 3F 00 0A 41 01 1D 46 07 00 1C 40 07 00 09 45 07 00 3F 40 07 00 63 FF 00 04 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 01 07 00 63 45 07 00 3F 40 07 00 93 FF 00 06 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 01 07 00 93 45 07 00 3F 40 07 00 93 FF 00 0E 00 02 07 00 03 07 00 D6 00 03 07 00 93 08 02 6F 08 02 6F FF 00 01 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 02 6F 08 02 6F 01 FF 00 1B 00 02 07 00 03 07 00 D6 00 03 07 00 93 08 02 6F 08 02 6F FF 00 09 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 09 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 FF 00 0B 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 07 00 03 FF 00 01 00 02 07 00 03 07 00 D6 00 07 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 07 00 03 01 FF 00 1B 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 07 00 03 4B 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 07 00 88 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 6F FF 00 0D 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 FF 00 01 00 02 07 00 03 07 00 D6 00 03 07 00 93 07 00 91 01 FF 00 1B 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 42 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 45 07 00 3F 00 00 0A 41 01 1E 46 07 00 20 40 07 00 09 45 07 00 3F 40 07 00 D8 51 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 09 01 5C 07 00 09 42 07 00 3F 40 07 00 09 45 07 00 3F 40 07 00 B7 FF 00 0E 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 03 07 00 B7 07 00 09 01 FF 00 1B 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 09 42 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 09 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 FF 00 03 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 FF 00 04 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 FF 00 01 00 02 07 00 03 07 00 D6 00 03 07 00 B7 07 00 D8 01 FF 00 19 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 FF 00 02 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 D8 45 07 00 3F 40 07 00 05 43 07 00 05 44 07 00 05 FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 05 01 5A 07 00 05 42 07 00 3F 40 07 00 05 45 07 00 3F 40 07 00 05 45 07 00 3F 40 07 00 C0 45 07 00 3F 40 01 0B 41 01 1C 46 07 00 3F 40 07 00 09 45 07 00 3F 40 07 00 63 44 07 00 3F 40 07 00 63 45 07 00 3F 40 07 00 93 46 07 00 3F 40 07 00 93 45 07 00 3F 40 07 00 93 4A 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 04 A3 08 04 A3 07 00 09 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 04 A3 08 04 A3 07 00 D8 FF 00 0E 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 04 A3 08 04 A3 07 00 D8 07 00 82 FF 00 01 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 04 A3 08 04 A3 07 00 D8 07 00 82 01 FF 00 1C 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 04 A3 08 04 A3 07 00 D8 07 00 82 FF 00 0E 00 00 00 01 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 09 07 00 93 08 04 A3 08 04 A3 07 00 D8 07 00 88 07 00 CD 02 02 02 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 C8 45 07 00 3F FF 00 00 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 45 07 00 3F 00 40 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 03 07 00 93 08 02 6F 08 02 6F FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 B7 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 04 A3 08 04 A3 07 00 D8 07 00 82 41 07 00 63 FF 00 01 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 88 FF 00 01 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 02 6F 08 02 6F 07 00 71 07 00 D8 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 D6 00 02 07 00 93 07 00 91 FF 00 01 00 02 07 00 03 07 00 D6 00 05 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 FF 00 01 00 02 07 00 03 07 00 D6 00 06 07 00 93 08 01 36 08 01 36 07 00 71 07 00 D8 07 00 03 01 01 01 01 41 07 00 09 FF 00 01 00 02 07 00 03 07 00 D6 00 04 07 00 93 08 01 36 08 01 36 07 00 71 41 07 00 3F 43 05 44 07 00 3F 47 05 47 07 00 3F
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     1333   1341   Ljava/lang/ArithmeticException;
                //  1333   1341   1333   1341   Any
                //  1349   1351   3      8      Any
                //  75     82     82     83     Any
                //  76     82     75     76     Any
                //  75     82     75     76     Ljava/lang/UnsupportedOperationException;
                //  75     82     3      8      Ljava/lang/RuntimeException;
                //  76     82     3      8      Ljava/lang/EnumConstantNotPresentException;
                //  171    178    178    179    Any
                //  171    178    3      8      Any
                //  171    178    3      8      Any
                //  172    178    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  172    178    171    172    Any
                //  232    238    238    239    Any
                //  232    238    238    239    Any
                //  232    238    238    239    Any
                //  232    238    238    239    Any
                //  232    238    3      8      Ljava/lang/ArithmeticException;
                //  287    294    294    295    Any
                //  287    294    287    288    Ljava/lang/NumberFormatException;
                //  287    294    294    295    Ljava/lang/IllegalStateException;
                //  287    294    294    295    Ljava/lang/EnumConstantNotPresentException;
                //  287    294    294    295    Any
                //  302    309    309    310    Any
                //  303    309    3      8      Ljava/lang/UnsupportedOperationException;
                //  302    309    309    310    Any
                //  302    309    309    310    Any
                //  303    309    302    303    Ljava/lang/EnumConstantNotPresentException;
                //  367    374    374    375    Any
                //  368    374    3      8      Ljava/lang/RuntimeException;
                //  368    374    374    375    Ljava/lang/NegativeArraySizeException;
                //  367    374    367    368    Any
                //  368    374    367    368    Any
                //  515    522    522    523    Any
                //  516    522    522    523    Any
                //  515    522    515    516    Ljava/lang/IllegalArgumentException;
                //  516    522    515    516    Ljava/lang/NullPointerException;
                //  516    522    3      8      Any
                //  529    536    536    537    Any
                //  530    536    536    537    Any
                //  529    536    536    537    Ljava/lang/NumberFormatException;
                //  530    536    3      8      Any
                //  529    536    529    530    Any
                //  587    594    594    595    Any
                //  587    594    594    595    Any
                //  587    594    587    588    Ljava/lang/UnsupportedOperationException;
                //  588    594    594    595    Ljava/lang/ArithmeticException;
                //  587    594    3      8      Ljava/lang/RuntimeException;
                //  601    607    607    608    Any
                //  601    607    3      8      Any
                //  601    607    3      8      Any
                //  601    607    607    608    Ljava/lang/ClassCastException;
                //  601    607    607    608    Ljava/lang/StringIndexOutOfBoundsException;
                //  616    622    622    623    Any
                //  616    622    622    623    Ljava/util/NoSuchElementException;
                //  616    622    622    623    Any
                //  616    622    3      8      Any
                //  616    622    3      8      Ljava/lang/IllegalStateException;
                //  679    685    685    686    Any
                //  679    685    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  679    685    3      8      Any
                //  679    685    3      8      Any
                //  679    685    3      8      Any
                //  740    747    747    748    Any
                //  740    747    740    741    Any
                //  741    747    740    741    Any
                //  740    747    747    748    Ljava/lang/NegativeArraySizeException;
                //  740    747    3      8      Ljava/lang/UnsupportedOperationException;
                //  795    802    802    803    Any
                //  795    802    3      8      Ljava/lang/ClassCastException;
                //  795    802    802    803    Ljava/lang/ClassCastException;
                //  796    802    795    796    Any
                //  796    802    802    803    Ljava/lang/ArithmeticException;
                //  855    862    862    863    Any
                //  856    862    3      8      Any
                //  855    862    855    856    Ljava/lang/EnumConstantNotPresentException;
                //  855    862    862    863    Any
                //  856    862    3      8      Any
                //  915    922    922    923    Any
                //  916    922    915    916    Any
                //  916    922    915    916    Ljava/lang/IllegalStateException;
                //  915    922    915    916    Ljava/lang/NegativeArraySizeException;
                //  915    922    3      8      Any
                //  971    978    978    979    Any
                //  972    978    971    972    Ljava/lang/IndexOutOfBoundsException;
                //  972    978    978    979    Ljava/lang/EnumConstantNotPresentException;
                //  972    978    3      8      Ljava/lang/NumberFormatException;
                //  971    978    971    972    Any
                //  1019   1026   1026   1027   Any
                //  1020   1026   1026   1027   Any
                //  1020   1026   1026   1027   Ljava/lang/IllegalStateException;
                //  1019   1026   3      8      Any
                //  1020   1026   1019   1020   Ljava/lang/NegativeArraySizeException;
                //  1031   1037   1037   1038   Any
                //  1031   1037   1037   1038   Any
                //  1031   1037   1037   1038   Any
                //  1031   1037   1037   1038   Any
                //  1031   1037   3      8      Ljava/lang/AssertionError;
                //  1079   1086   1086   1087   Any
                //  1079   1086   1086   1087   Ljava/lang/StringIndexOutOfBoundsException;
                //  1080   1086   1086   1087   Any
                //  1079   1086   1079   1080   Any
                //  1080   1086   1086   1087   Any
                //  1093   1100   1100   1101   Any
                //  1093   1100   1093   1094   Any
                //  1094   1100   3      8      Any
                //  1094   1100   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1093   1100   3      8      Any
                //  1151   1158   1158   1159   Any
                //  1151   1158   3      8      Any
                //  1152   1158   1151   1152   Any
                //  1152   1158   3      8      Any
                //  1151   1158   1151   1152   Ljava/lang/NullPointerException;
                //  1164   1171   1171   1172   Any
                //  1165   1171   3      8      Ljava/lang/ArithmeticException;
                //  1165   1171   1164   1165   Any
                //  1165   1171   1164   1165   Ljava/util/ConcurrentModificationException;
                //  1165   1171   1164   1165   Ljava/lang/EnumConstantNotPresentException;
                //  1179   1186   1186   1187   Any
                //  1180   1186   1179   1180   Ljava/lang/ClassCastException;
                //  1179   1186   3      8      Any
                //  1179   1186   3      8      Any
                //  1179   1186   1179   1180   Any
                //  1198   1205   1205   1206   Any
                //  1198   1205   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  1198   1205   1198   1199   Any
                //  1199   1205   1198   1199   Ljava/lang/ArithmeticException;
                //  1198   1205   1205   1206   Any
                //  1268   1274   1274   1275   Any
                //  1268   1274   3      8      Ljava/lang/IndexOutOfBoundsException;
                //  1268   1274   3      8      Any
                //  1268   1274   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  1268   1274   1274   1275   Ljava/lang/ClassCastException;
                //  1281   1288   1288   1289   Any
                //  1281   1288   3      8      Any
                //  1282   1288   1281   1282   Any
                //  1282   1288   1281   1282   Ljava/lang/IllegalArgumentException;
                //  1282   1288   1288   1289   Ljava/lang/EnumConstantNotPresentException;
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
            
            public f6y(final f6z c, final Ref.ObjectRef c2) {
                this.c = c;
                while (true) {
                    int n = 0;
                    Label_0019: {
                        if (fc.c < 0) {
                            n = -1505104026;
                            break Label_0019;
                        }
                        n = -1897961705;
                    }
                    switch (n ^ 0xB2D5B76) {
                        case -81870147: {
                            continue;
                        }
                        default: {
                            this.c = c2;
                        }
                        case -1385909232: {
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
        //     4: ifnull          1242
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1234
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1226
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //    34: goto            38
        //    37: athrow         
        //    38: ifne            46
        //    41: ldc             -1564747108
        //    43: goto            48
        //    46: ldc             -1564747109
        //    48: ldc             1336613831
        //    50: ixor           
        //    51: tableswitch {
        //          -635338058: 72
        //          -635338057: 1188
        //          default: 41
        //        }
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             -1577695007
        //    80: goto            85
        //    83: ldc             783719913
        //    85: ldc             -1078641026
        //    87: ixor           
        //    88: lookupswitch {
        //          -1862032489: 116
        //          507737759: 83
        //          default: 1203
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   131: if_acmpne       1188
        //   134: getstatic       dev/nuker/pyro/fc.0:I
        //   137: ifeq            145
        //   140: ldc             579593863
        //   142: goto            147
        //   145: ldc             2080705872
        //   147: ldc             -1136315035
        //   149: ixor           
        //   150: lookupswitch {
        //          -1630612510: 1205
        //          -141762419: 145
        //          default: 176
        //        }
        //   176: aload_0        
        //   177: aconst_null    
        //   178: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   181: putfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   184: aload_0        
        //   185: getfield        dev/nuker/pyro/f6z.1:I
        //   188: iconst_1       
        //   189: if_icmpne       428
        //   192: aload_0        
        //   193: aconst_null    
        //   194: goto            198
        //   197: athrow         
        //   198: invokespecial   dev/nuker/pyro/f6z.3:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
        //   201: goto            205
        //   204: athrow         
        //   205: ifnonnull       428
        //   208: aload_0        
        //   209: getstatic       dev/nuker/pyro/fc.c:I
        //   212: ifge            221
        //   215: ldc_w           -1915555977
        //   218: goto            224
        //   221: ldc_w           -1558932131
        //   224: ldc_w           1365886027
        //   227: ixor           
        //   228: lookupswitch {
        //          -1496403315: 221
        //          -591713476: 1191
        //          default: 256
        //        }
        //   256: getfield        dev/nuker/pyro/f6z.c:Z
        //   259: ifeq            318
        //   262: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   265: ldc_w           "\u2200\u149a\u8b39\ub1c1\ucf8f\uec28\ub221\ue71e\udb39\ueffb\ua6f5\u1e42\ue037\uc7b8\u876f\u88f5"
        //   268: goto            272
        //   271: athrow         
        //   272: invokestatic    invokestatic   !!! ERROR
        //   275: goto            279
        //   278: athrow         
        //   279: goto            283
        //   282: athrow         
        //   283: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   286: goto            290
        //   289: athrow         
        //   290: aload_0        
        //   291: getfield        dev/nuker/pyro/f6z.c:Ldev/nuker/pyro/fw;
        //   294: iconst_0       
        //   295: goto            299
        //   298: athrow         
        //   299: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   302: goto            306
        //   305: athrow         
        //   306: goto            310
        //   309: athrow         
        //   310: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   313: goto            317
        //   316: athrow         
        //   317: return         
        //   318: aload_0        
        //   319: iconst_1       
        //   320: putfield        dev/nuker/pyro/f6z.c:Z
        //   323: getstatic       dev/nuker/pyro/fc.0:I
        //   326: ifeq            335
        //   329: ldc_w           1649489171
        //   332: goto            338
        //   335: ldc_w           2053029382
        //   338: ldc_w           2058904125
        //   341: ixor           
        //   342: lookupswitch {
        //          417945390: 1207
        //          1349253149: 335
        //          default: 368
        //        }
        //   368: aload_0        
        //   369: iconst_0       
        //   370: putfield        dev/nuker/pyro/f6z.1:I
        //   373: getstatic       dev/nuker/pyro/fc.1:I
        //   376: ifeq            385
        //   379: ldc_w           -679605348
        //   382: goto            388
        //   385: ldc_w           -315161361
        //   388: ldc_w           -579065364
        //   391: ixor           
        //   392: lookupswitch {
        //          167912048: 1199
        //          1365330813: 385
        //          default: 420
        //        }
        //   420: aload_0        
        //   421: iconst_0       
        //   422: putfield        dev/nuker/pyro/f6z.2:I
        //   425: goto            1188
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f6z.1:I
        //   432: getstatic       dev/nuker/pyro/fc.0:I
        //   435: ifeq            444
        //   438: ldc_w           -1999256496
        //   441: goto            447
        //   444: ldc_w           -1488339535
        //   447: ldc_w           723938345
        //   450: ixor           
        //   451: lookupswitch {
        //          -1938828904: 476
        //          -1544312711: 444
        //          default: 1197
        //        }
        //   476: istore_2       
        //   477: iload_2        
        //   478: ifeq            556
        //   481: aload_0        
        //   482: aload_0        
        //   483: aload_0        
        //   484: getstatic       dev/nuker/pyro/fc.0:I
        //   487: ifeq            496
        //   490: ldc_w           -1552301777
        //   493: goto            499
        //   496: ldc_w           322671902
        //   499: ldc_w           -1485333748
        //   502: ixor           
        //   503: lookupswitch {
        //          -1869358029: 496
        //          68049443: 1209
        //          default: 528
        //        }
        //   528: getfield        dev/nuker/pyro/f6z.1:Lnet/minecraft/util/math/BlockPos;
        //   531: goto            535
        //   534: athrow         
        //   535: invokespecial   dev/nuker/pyro/f6z.3:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;
        //   538: goto            542
        //   541: athrow         
        //   542: putfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   545: aload_0        
        //   546: aload_0        
        //   547: getfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   550: putfield        dev/nuker/pyro/f6z.1:Lnet/minecraft/util/math/BlockPos;
        //   553: goto            985
        //   556: getstatic       dev/nuker/pyro/fc.0:I
        //   559: ifeq            568
        //   562: ldc_w           -1705186362
        //   565: goto            571
        //   568: ldc_w           461938998
        //   571: ldc_w           -841133969
        //   574: ixor           
        //   575: lookupswitch {
        //          -1560495410: 568
        //          1468119977: 1201
        //          default: 600
        //        }
        //   600: aload_0        
        //   601: getfield        dev/nuker/pyro/f6z.2:I
        //   604: sipush          250
        //   607: if_icmpge       985
        //   610: aload_0        
        //   611: getfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   614: ifnonnull       623
        //   617: ldc_w           -1472250308
        //   620: goto            626
        //   623: ldc_w           -1472250307
        //   626: ldc_w           1001026138
        //   629: ixor           
        //   630: tableswitch {
        //          657103052: 652
        //          657103053: 985
        //          default: 617
        //        }
        //   652: getstatic       dev/nuker/pyro/fc.0:I
        //   655: ifeq            664
        //   658: ldc_w           1904510708
        //   661: goto            667
        //   664: ldc_w           -1209964059
        //   667: ldc_w           1660198170
        //   670: ixor           
        //   671: lookupswitch {
        //          -719981313: 696
        //          326114286: 664
        //          default: 1189
        //        }
        //   696: aload_0        
        //   697: aload_0        
        //   698: getfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //   701: goto            705
        //   704: athrow         
        //   705: invokestatic    dev/nuker/pyro/fbm.values:()[Ldev/nuker/pyro/fbm;
        //   708: goto            712
        //   711: athrow         
        //   712: aload_0        
        //   713: getfield        dev/nuker/pyro/f6z.2:I
        //   716: bipush          25
        //   718: idiv           
        //   719: i2d            
        //   720: dstore_3       
        //   721: astore          8
        //   723: getstatic       dev/nuker/pyro/fc.0:I
        //   726: ifeq            735
        //   729: ldc_w           213184572
        //   732: goto            738
        //   735: ldc_w           864288670
        //   738: ldc_w           640124166
        //   741: ixor           
        //   742: lookupswitch {
        //          362579760: 735
        //          714306874: 1195
        //          default: 768
        //        }
        //   768: astore          7
        //   770: astore          6
        //   772: iconst_0       
        //   773: istore          5
        //   775: getstatic       dev/nuker/pyro/fc.c:I
        //   778: ifge            787
        //   781: ldc_w           1645488359
        //   784: goto            790
        //   787: ldc_w           -1874695124
        //   790: ldc_w           -928253139
        //   793: ixor           
        //   794: lookupswitch {
        //          -1430268982: 1215
        //          1487211999: 787
        //          default: 820
        //        }
        //   820: dload_3        
        //   821: getstatic       dev/nuker/pyro/fc.1:I
        //   824: ifeq            833
        //   827: ldc_w           -420208632
        //   830: goto            836
        //   833: ldc_w           -862488540
        //   836: ldc_w           1652876577
        //   839: ixor           
        //   840: lookupswitch {
        //          -2072984279: 1193
        //          845458240: 833
        //          default: 868
        //        }
        //   868: goto            872
        //   871: athrow         
        //   872: invokestatic    java/lang/Math.floor:(D)D
        //   875: goto            879
        //   878: athrow         
        //   879: dstore          9
        //   881: aload           6
        //   883: aload           7
        //   885: aload           8
        //   887: getstatic       dev/nuker/pyro/fc.1:I
        //   890: ifeq            899
        //   893: ldc_w           1585058959
        //   896: goto            902
        //   899: ldc_w           -1766688047
        //   902: ldc_w           -1554808865
        //   905: ixor           
        //   906: lookupswitch {
        //          -47617200: 1211
        //          1152883717: 899
        //          default: 932
        //        }
        //   932: dload           9
        //   934: d2i            
        //   935: aaload         
        //   936: goto            940
        //   939: athrow         
        //   940: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   943: goto            947
        //   946: athrow         
        //   947: checkcast       [Lnet/minecraft/util/math/BlockPos;
        //   950: dup            
        //   951: ifnull          965
        //   954: aload_0        
        //   955: getfield        dev/nuker/pyro/f6z.2:I
        //   958: bipush          25
        //   960: irem           
        //   961: aaload         
        //   962: goto            967
        //   965: pop            
        //   966: aconst_null    
        //   967: putfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   970: aload_0        
        //   971: dup            
        //   972: getfield        dev/nuker/pyro/f6z.2:I
        //   975: dup            
        //   976: istore_3       
        //   977: iconst_1       
        //   978: iadd           
        //   979: putfield        dev/nuker/pyro/f6z.2:I
        //   982: goto            556
        //   985: aload_0        
        //   986: getfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //   989: ifnonnull       993
        //   992: return         
        //   993: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   996: dup            
        //   997: goto            1001
        //  1000: athrow         
        //  1001: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //  1004: goto            1008
        //  1007: athrow         
        //  1008: astore_3       
        //  1009: aload_3        
        //  1010: aload_0        
        //  1011: getfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //  1014: iconst_1       
        //  1015: goto            1019
        //  1018: athrow         
        //  1019: invokestatic    dev/nuker/pyro/fbP.c:(Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/EnumFacing;
        //  1022: goto            1026
        //  1025: athrow         
        //  1026: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1029: goto            1033
        //  1032: athrow         
        //  1033: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: aload_0        
        //  1041: getfield        dev/nuker/pyro/f6z.0:Lnet/minecraft/util/math/BlockPos;
        //  1044: aload_3        
        //  1045: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //  1048: checkcast       Lnet/minecraft/util/EnumFacing;
        //  1051: goto            1055
        //  1054: athrow         
        //  1055: invokevirtual   dev/nuker/pyro/fbP.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)[F
        //  1058: goto            1062
        //  1061: athrow         
        //  1062: astore          4
        //  1064: aload_1        
        //  1065: goto            1069
        //  1068: athrow         
        //  1069: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  1072: goto            1076
        //  1075: athrow         
        //  1076: aload_1        
        //  1077: aload           4
        //  1079: iconst_0       
        //  1080: faload         
        //  1081: goto            1085
        //  1084: athrow         
        //  1085: invokevirtual   dev/nuker/pyro/f3i.c:(F)V
        //  1088: goto            1092
        //  1091: athrow         
        //  1092: aload_1        
        //  1093: getstatic       dev/nuker/pyro/fc.c:I
        //  1096: ifge            1105
        //  1099: ldc_w           1197088514
        //  1102: goto            1108
        //  1105: ldc_w           1843761777
        //  1108: ldc_w           -1005880415
        //  1111: ixor           
        //  1112: lookupswitch {
        //          -2091817821: 1213
        //          2130300104: 1105
        //          default: 1140
        //        }
        //  1140: aload           4
        //  1142: iconst_1       
        //  1143: faload         
        //  1144: goto            1148
        //  1147: athrow         
        //  1148: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  1151: goto            1155
        //  1154: athrow         
        //  1155: aload_1        
        //  1156: new             Ldev/nuker/pyro/f6y;
        //  1159: dup            
        //  1160: aload_0        
        //  1161: aload_3        
        //  1162: goto            1166
        //  1165: athrow         
        //  1166: invokespecial   dev/nuker/pyro/f6y.<init>:(Ldev/nuker/pyro/f6z;Lkotlin/jvm/internal/Ref$ObjectRef;)V
        //  1169: goto            1173
        //  1172: athrow         
        //  1173: checkcast       Ljava/util/function/Consumer;
        //  1176: goto            1180
        //  1179: athrow         
        //  1180: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  1183: goto            1187
        //  1186: athrow         
        //  1187: return         
        //  1188: return         
        //  1189: aconst_null    
        //  1190: athrow         
        //  1191: aconst_null    
        //  1192: athrow         
        //  1193: aconst_null    
        //  1194: athrow         
        //  1195: aconst_null    
        //  1196: athrow         
        //  1197: aconst_null    
        //  1198: athrow         
        //  1199: aconst_null    
        //  1200: athrow         
        //  1201: aconst_null    
        //  1202: athrow         
        //  1203: aconst_null    
        //  1204: athrow         
        //  1205: aconst_null    
        //  1206: athrow         
        //  1207: aconst_null    
        //  1208: athrow         
        //  1209: aconst_null    
        //  1210: athrow         
        //  1211: aconst_null    
        //  1212: athrow         
        //  1213: aconst_null    
        //  1214: athrow         
        //  1215: aconst_null    
        //  1216: athrow         
        //  1217: pop            
        //  1218: goto            24
        //  1221: pop            
        //  1222: aconst_null    
        //  1223: goto            1217
        //  1226: dup            
        //  1227: ifnull          1217
        //  1230: checkcast       Ljava/lang/Throwable;
        //  1233: athrow         
        //  1234: dup            
        //  1235: ifnull          1221
        //  1238: checkcast       Ljava/lang/Throwable;
        //  1241: athrow         
        //  1242: aconst_null    
        //  1243: athrow         
        //    StackMapTable: 00 A1 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FD 00 03 07 00 03 07 00 EA FF 00 05 00 00 00 01 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 01 07 00 EA 45 07 00 5F 40 01 02 04 41 01 17 0A 41 01 1E 43 07 00 5F 40 07 00 EA 45 07 00 5F 40 07 00 F7 10 41 01 1C 54 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 00 03 05 45 07 00 5F 40 07 00 A4 4F 07 00 03 FF 00 02 00 02 07 00 03 07 00 EA 00 02 07 00 03 01 5F 07 00 03 4E 07 00 43 FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 09 07 00 D4 45 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 09 07 00 D4 42 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 09 07 00 D4 45 07 00 5F 00 47 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 1D 01 45 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 1D 07 01 17 42 07 00 5F FF 00 00 00 02 07 00 03 07 00 EA 00 02 07 01 1D 07 01 17 45 07 00 5F 00 00 10 42 01 1D 10 42 01 1F 07 4F 01 FF 00 02 00 02 07 00 03 07 00 EA 00 02 01 01 5C 01 FF 00 13 00 03 07 00 03 07 00 EA 01 00 03 07 00 03 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 07 00 EA 01 00 04 07 00 03 07 00 03 07 00 03 01 FF 00 1C 00 03 07 00 03 07 00 EA 01 00 03 07 00 03 07 00 03 07 00 03 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 EA 01 00 03 07 00 03 07 00 03 07 00 A4 45 07 00 5F FF 00 00 00 03 07 00 03 07 00 EA 01 00 02 07 00 03 07 00 A4 0D 0B 42 01 1C 10 05 42 01 19 0B 42 01 1C FF 00 07 00 00 00 01 07 00 5F FF 00 00 00 03 07 00 03 07 00 EA 01 00 02 07 00 03 07 00 63 45 07 00 5F FF 00 00 00 03 07 00 03 07 00 EA 01 00 03 07 00 03 07 00 63 07 01 7C FF 00 16 00 08 07 00 03 07 00 EA 01 03 00 00 00 07 01 7C 00 02 07 00 03 07 00 63 FF 00 02 00 08 07 00 03 07 00 EA 01 03 00 00 00 07 01 7C 00 03 07 00 03 07 00 63 01 FF 00 1D 00 08 07 00 03 07 00 EA 01 03 00 00 00 07 01 7C 00 02 07 00 03 07 00 63 FF 00 12 00 08 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 00 00 42 01 1D 4C 03 FF 00 02 00 08 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 00 02 03 01 5F 03 42 07 00 45 40 03 45 07 00 5F 40 03 FF 00 13 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 03 07 00 03 07 00 63 07 01 7C FF 00 02 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 04 07 00 03 07 00 63 07 01 7C 01 FF 00 1D 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 03 07 00 03 07 00 63 07 01 7C 46 07 00 5F FF 00 00 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 03 07 00 03 07 00 63 07 01 3D 45 07 00 5F FF 00 00 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 02 07 00 03 07 00 C6 FF 00 11 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 02 07 00 03 07 01 59 FF 00 01 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 02 07 00 03 07 00 A4 FF 00 11 00 03 07 00 03 07 00 EA 01 00 00 07 46 07 00 5F FF 00 00 00 03 07 00 03 07 00 EA 01 00 02 08 03 E1 08 03 E1 45 07 00 5F 40 07 00 78 FF 00 09 00 04 07 00 03 07 00 EA 01 07 00 78 00 01 07 00 E8 FF 00 00 00 04 07 00 03 07 00 EA 01 07 00 78 00 03 07 00 78 07 00 A4 01 45 07 00 5F FF 00 00 00 04 07 00 03 07 00 EA 01 07 00 78 00 02 07 00 78 07 01 63 45 07 00 5F 00 45 07 00 5F 40 07 01 5B 4D 07 00 41 FF 00 00 00 04 07 00 03 07 00 EA 01 07 00 78 00 03 07 01 5B 07 00 A4 07 01 63 45 07 00 5F 40 07 01 7E FF 00 05 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 01 07 00 5F 40 07 00 EA 45 07 00 5F 00 FF 00 07 00 00 00 01 07 00 5F FF 00 00 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 02 07 00 EA 02 45 07 00 5F 00 4C 07 00 EA FF 00 02 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 02 07 00 EA 01 5F 07 00 EA FF 00 06 00 00 00 01 07 00 5F FF 00 00 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 02 07 00 EA 02 45 07 00 5F 00 49 07 00 5F FF 00 00 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 05 07 00 EA 08 04 84 08 04 84 07 00 03 07 00 78 45 07 00 5F FF 00 00 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 02 07 00 EA 07 01 72 FF 00 05 00 00 00 01 07 00 5F FF 00 00 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 02 07 00 EA 07 01 77 45 07 00 5F 00 F8 00 00 FC 00 00 01 FF 00 01 00 02 07 00 03 07 00 EA 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 00 01 03 FF 00 01 00 08 07 00 03 07 00 EA 01 03 00 00 00 07 01 7C 00 02 07 00 03 07 00 63 FF 00 01 00 02 07 00 03 07 00 EA 00 01 01 01 FC 00 01 01 FA 00 01 01 01 FF 00 01 00 03 07 00 03 07 00 EA 01 00 03 07 00 03 07 00 03 07 00 03 FF 00 01 00 09 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 03 00 03 07 00 03 07 00 63 07 01 7C FF 00 01 00 05 07 00 03 07 00 EA 01 07 00 78 07 01 7E 00 01 07 00 EA FF 00 01 00 08 07 00 03 07 00 EA 01 03 01 07 00 03 07 00 63 07 01 7C 00 00 FF 00 01 00 02 07 00 03 07 00 EA 00 01 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1226   1234   Any
        //  1226   1234   1226   1234   Ljava/lang/NegativeArraySizeException;
        //  1242   1244   3      8      Ljava/lang/RuntimeException;
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
        //  120    127    127    128    Any
        //  120    127    120    121    Any
        //  120    127    3      8      Any
        //  121    127    3      8      Any
        //  120    127    3      8      Ljava/util/NoSuchElementException;
        //  197    204    204    205    Any
        //  197    204    197    198    Ljava/lang/AssertionError;
        //  198    204    3      8      Ljava/util/NoSuchElementException;
        //  197    204    204    205    Ljava/util/ConcurrentModificationException;
        //  198    204    197    198    Ljava/lang/ClassCastException;
        //  271    278    278    279    Any
        //  272    278    3      8      Ljava/util/ConcurrentModificationException;
        //  272    278    3      8      Any
        //  271    278    278    279    Any
        //  271    278    271    272    Ljava/lang/NegativeArraySizeException;
        //  282    289    289    290    Any
        //  283    289    289    290    Ljava/lang/StringIndexOutOfBoundsException;
        //  282    289    282    283    Ljava/lang/IllegalStateException;
        //  282    289    282    283    Any
        //  282    289    289    290    Ljava/lang/ArithmeticException;
        //  298    305    305    306    Any
        //  299    305    305    306    Ljava/util/ConcurrentModificationException;
        //  298    305    298    299    Ljava/lang/UnsupportedOperationException;
        //  299    305    298    299    Any
        //  299    305    298    299    Ljava/lang/EnumConstantNotPresentException;
        //  309    316    316    317    Any
        //  310    316    309    310    Any
        //  310    316    316    317    Any
        //  310    316    309    310    Ljava/util/NoSuchElementException;
        //  309    316    309    310    Ljava/lang/IllegalStateException;
        //  534    541    541    542    Any
        //  534    541    3      8      Any
        //  535    541    534    535    Ljava/lang/EnumConstantNotPresentException;
        //  535    541    3      8      Any
        //  534    541    541    542    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  705    711    711    712    Any
        //  705    711    3      8      Any
        //  705    711    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  705    711    711    712    Ljava/lang/ArithmeticException;
        //  705    711    711    712    Ljava/util/ConcurrentModificationException;
        //  871    878    878    879    Any
        //  872    878    871    872    Ljava/lang/IndexOutOfBoundsException;
        //  871    878    871    872    Ljava/lang/IllegalArgumentException;
        //  871    878    3      8      Any
        //  871    878    878    879    Any
        //  939    946    946    947    Any
        //  939    946    939    940    Any
        //  940    946    939    940    Ljava/lang/NumberFormatException;
        //  940    946    946    947    Ljava/lang/NumberFormatException;
        //  940    946    939    940    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1000   1007   1007   1008   Any
        //  1001   1007   1007   1008   Ljava/lang/EnumConstantNotPresentException;
        //  1000   1007   1007   1008   Ljava/lang/NumberFormatException;
        //  1000   1007   1007   1008   Ljava/lang/ArithmeticException;
        //  1001   1007   1000   1001   Any
        //  1018   1025   1025   1026   Any
        //  1018   1025   1025   1026   Any
        //  1018   1025   1025   1026   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1018   1025   1018   1019   Ljava/lang/IllegalStateException;
        //  1018   1025   1025   1026   Any
        //  1032   1039   1039   1040   Any
        //  1032   1039   3      8      Any
        //  1033   1039   3      8      Any
        //  1032   1039   1032   1033   Any
        //  1033   1039   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1054   1061   1061   1062   Any
        //  1055   1061   3      8      Any
        //  1055   1061   3      8      Any
        //  1055   1061   3      8      Ljava/util/ConcurrentModificationException;
        //  1055   1061   1054   1055   Ljava/lang/NumberFormatException;
        //  1068   1075   1075   1076   Any
        //  1068   1075   3      8      Ljava/lang/ClassCastException;
        //  1068   1075   3      8      Any
        //  1068   1075   1068   1069   Ljava/lang/IndexOutOfBoundsException;
        //  1068   1075   1068   1069   Any
        //  1085   1091   1091   1092   Any
        //  1085   1091   1091   1092   Ljava/lang/NullPointerException;
        //  1085   1091   1091   1092   Ljava/lang/NumberFormatException;
        //  1085   1091   1091   1092   Any
        //  1085   1091   1091   1092   Ljava/lang/EnumConstantNotPresentException;
        //  1148   1154   1154   1155   Any
        //  1148   1154   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1148   1154   1154   1155   Any
        //  1148   1154   1154   1155   Any
        //  1148   1154   1154   1155   Any
        //  1165   1172   1172   1173   Any
        //  1166   1172   1165   1166   Any
        //  1166   1172   1172   1173   Ljava/lang/ArithmeticException;
        //  1165   1172   3      8      Any
        //  1166   1172   1165   1166   Ljava/lang/IndexOutOfBoundsException;
        //  1180   1186   1186   1187   Any
        //  1180   1186   3      8      Ljava/lang/NumberFormatException;
        //  1180   1186   1186   1187   Any
        //  1180   1186   1186   1187   Any
        //  1180   1186   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void 0(@Nullable final BlockPos blockPos) {
        fbS.3W(this, 316110031, blockPos);
    }
    
    @Nullable
    public BlockPos 1() {
        return fbS.7Q(this, 707018407);
    }
    
    public static void c(final f6z f6z, final Minecraft c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0085:
            while (true) {
                do {
                    Label_0072: {
                        break Label_0072;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0077;
                            }
                            continue Label_0085;
                            // switch([Lcom.strobel.decompiler.ast.Label;@271efb70, n ^ 0x176066DE)
                            // iftrue(Label_0028:, fc.1 == 0)
                        Block_4_Outer:
                            while (true) {
                                Label_0066: {
                                    throw null;
                                }
                                while (true) {
                                    final int n = -1557875240;
                                    continue Block_4_Outer;
                                    continue;
                                }
                                Label_0028:
                                final int n = 262165587;
                                continue Block_4_Outer;
                            }
                            Label_0060: {
                                f6z.c = c;
                            }
                            return;
                        }
                        catch (NumberFormatException ex) {}
                    }
                    continue Label_0085;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @Nullable
    public BlockPos 2() {
        return fbS.7S(this, 33452620);
    }
    
    public boolean 6() {
        return fbS.ee(this, 665955360);
    }
    
    public f6z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2228\u149c\u8b23\ub3dc\uc979\uec35\ub22a\ue71f\ud97a"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2208\u149c\u8b23\ub3dc\uc959\uec35\ub22a\ue71f\ud97a"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: aconst_null    
        //    14: getstatic       dev/nuker/pyro/fc.0:I
        //    17: ifeq            26
        //    20: ldc_w           124560247
        //    23: goto            29
        //    26: ldc_w           1101272731
        //    29: ldc_w           1417717003
        //    32: ixor           
        //    33: lookupswitch {
        //          354726800: 60
        //          1407977084: 26
        //          default: 86
        //        }
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ljava/util/LinkedHashMap;
        //    67: dup            
        //    68: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    71: putfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //    74: aload_0        
        //    75: new             Ljava/util/LinkedHashMap;
        //    78: dup            
        //    79: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    82: putfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //    85: return         
        //    86: aconst_null    
        //    87: athrow         
        //    StackMapTable: 00 04 FF 00 1A 00 01 06 00 04 06 07 00 D4 07 00 D4 05 FF 00 02 00 01 06 00 05 06 07 00 D4 07 00 D4 05 01 FF 00 1E 00 01 06 00 04 06 07 00 D4 07 00 D4 05 FF 00 19 00 01 06 00 04 06 07 00 D4 07 00 D4 05
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
    
    public static Minecraft c(final f6z p0) {
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
        //    17: getfield        dev/nuker/pyro/f6z.c:Lnet/minecraft/client/Minecraft;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 5F FC 00 03 07 00 03 44 07 00 5F 43 05 44 07 00 5F 47 05
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
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1881
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1873
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1865
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           -5448336
        //    33: goto            39
        //    36: ldc_w           1150533191
        //    39: ldc_w           487729152
        //    42: ixor           
        //    43: lookupswitch {
        //          -703853167: 36
        //          -490801808: 1854
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/f34.0:()Z
        //    78: goto            82
        //    81: athrow         
        //    82: ifne            1805
        //    85: aload_1        
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            98
        //    92: ldc_w           2029669892
        //    95: goto            101
        //    98: ldc_w           -1912023425
        //   101: ldc_w           -638813533
        //   104: ixor           
        //   105: lookupswitch {
        //          -1592380249: 1822
        //          -209387944: 98
        //          default: 132
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //   139: goto            143
        //   142: athrow         
        //   143: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   146: if_acmpne       155
        //   149: ldc_w           -1177495744
        //   152: goto            158
        //   155: ldc_w           -1177495743
        //   158: ldc_w           955289572
        //   161: ixor           
        //   162: tableswitch {
        //          37794120: 184
        //          37794121: 1805
        //          default: 149
        //        }
        //   184: aload_1        
        //   185: goto            189
        //   188: athrow         
        //   189: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   192: goto            196
        //   195: athrow         
        //   196: instanceof      Lnet/minecraft/network/play/server/SPacketBlockAction;
        //   199: ifeq            1805
        //   202: aload_0        
        //   203: getfield        dev/nuker/pyro/f6z.1:I
        //   206: ifne            1805
        //   209: aload_0        
        //   210: getfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //   213: ifnull          1805
        //   216: aload_1        
        //   217: goto            221
        //   220: athrow         
        //   221: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   224: goto            228
        //   227: athrow         
        //   228: dup            
        //   229: ifnonnull       262
        //   232: new             Lkotlin/TypeCastException;
        //   235: dup            
        //   236: ldc_w           "\u2228\u1486\u8b3b\ub1c4\ucfdc\uec23\ub225\ue714\udb77\uefe0\ua6f4\u1e0c\ue03c\uc7b3\u8728\u88b8\u57a5\u76cc\ubf38\uc613\u2ac0\uc234\u6b97\u2f49\ud182\u344d\u7d66\u887a\u8215\u8ac4\u856a\ufb72\u711c\u981e\u1dca\uf0a4\u493c\u89b5\uc892\uf96c\ub750\u41fe\ub827\ub157\u4a2f\u8b30\u7c7b\ucffe\u7f59\uec89\ue750\u16d6\uef89\u358b\u40e2\ue035\u0a05\u8700\u1b8a\u090d\u76d7\u728c\uc629\ub9e5\u9c91\u6bd6\ue2f4\ud1f8\ua739\u2380\u883e\u4f92\u8a9b\u1618\ua588\u7107\u55a3\u1dad\u63fc\u17c9\u89b0\u0535\uf910\u2440\u1f49\ub83e\u7cf1\u4a46\u1842"
        //   239: goto            243
        //   242: athrow         
        //   243: invokestatic    invokestatic   !!! ERROR
        //   246: goto            250
        //   249: athrow         
        //   250: goto            254
        //   253: athrow         
        //   254: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   257: goto            261
        //   260: athrow         
        //   261: athrow         
        //   262: checkcast       Lnet/minecraft/network/play/server/SPacketBlockAction;
        //   265: getstatic       dev/nuker/pyro/fc.0:I
        //   268: ifeq            277
        //   271: ldc_w           -186180324
        //   274: goto            280
        //   277: ldc_w           -1270222431
        //   280: ldc_w           -1009397927
        //   283: ixor           
        //   284: lookupswitch {
        //          926077509: 277
        //          2006728440: 312
        //          default: 1812
        //        }
        //   312: astore_2       
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            325
        //   319: ldc_w           -576012181
        //   322: goto            328
        //   325: ldc_w           -613711864
        //   328: ldc_w           -769917936
        //   331: ixor           
        //   332: lookupswitch {
        //          158366744: 360
        //          263273595: 325
        //          default: 1830
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokestatic    dev/nuker/pyro/fbm.values:()[Ldev/nuker/pyro/fbm;
        //   367: goto            371
        //   370: athrow         
        //   371: aload_2        
        //   372: getstatic       dev/nuker/pyro/fc.c:I
        //   375: ifge            384
        //   378: ldc_w           -1163909183
        //   381: goto            387
        //   384: ldc_w           247812486
        //   387: ldc_w           755289418
        //   390: ixor           
        //   391: lookupswitch {
        //          -1750799733: 1838
        //          1571927991: 384
        //          default: 416
        //        }
        //   416: goto            420
        //   419: athrow         
        //   420: invokevirtual   net/minecraft/network/play/server/SPacketBlockAction.func_148869_g:()I
        //   423: goto            427
        //   426: athrow         
        //   427: aaload         
        //   428: getstatic       dev/nuker/pyro/fc.1:I
        //   431: ifeq            440
        //   434: ldc_w           909848953
        //   437: goto            443
        //   440: ldc_w           1397366196
        //   443: ldc_w           2005680539
        //   446: ixor           
        //   447: lookupswitch {
        //          -523568836: 440
        //          1102541026: 1844
        //          default: 472
        //        }
        //   472: astore_3       
        //   473: aload_2        
        //   474: goto            478
        //   477: athrow         
        //   478: invokevirtual   net/minecraft/network/play/server/SPacketBlockAction.func_148864_h:()I
        //   481: goto            485
        //   484: athrow         
        //   485: istore          4
        //   487: aload_0        
        //   488: getfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //   491: aload_3        
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   499: goto            503
        //   502: athrow         
        //   503: checkcast       [Lnet/minecraft/util/math/BlockPos;
        //   506: getstatic       dev/nuker/pyro/fc.1:I
        //   509: ifeq            518
        //   512: ldc_w           -1040250680
        //   515: goto            521
        //   518: ldc_w           1417528064
        //   521: ldc_w           461066109
        //   524: ixor           
        //   525: lookupswitch {
        //          -628865099: 1808
        //          1452659907: 518
        //          default: 552
        //        }
        //   552: astore          5
        //   554: iconst_0       
        //   555: istore          6
        //   557: iconst_0       
        //   558: istore          7
        //   560: iload           6
        //   562: bipush          25
        //   564: if_icmpge       1805
        //   567: getstatic       dev/nuker/pyro/fc.c:I
        //   570: ifge            579
        //   573: ldc_w           -1731149978
        //   576: goto            582
        //   579: ldc_w           -1209742136
        //   582: ldc_w           1798521716
        //   585: ixor           
        //   586: lookupswitch {
        //          -221730877: 579
        //          -203162606: 1834
        //          default: 612
        //        }
        //   612: aload           5
        //   614: dup            
        //   615: ifnonnull       629
        //   618: goto            622
        //   621: athrow         
        //   622: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   625: goto            629
        //   628: athrow         
        //   629: iload           7
        //   631: aaload         
        //   632: getstatic       dev/nuker/pyro/fc.1:I
        //   635: ifeq            644
        //   638: ldc_w           -163285516
        //   641: goto            647
        //   644: ldc_w           1574525288
        //   647: ldc_w           -550028340
        //   650: ixor           
        //   651: lookupswitch {
        //          -2098306396: 676
        //          695422520: 644
        //          default: 1850
        //        }
        //   676: astore          8
        //   678: aload_2        
        //   679: goto            683
        //   682: athrow         
        //   683: invokevirtual   net/minecraft/network/play/server/SPacketBlockAction.func_179825_a:()Lnet/minecraft/util/math/BlockPos;
        //   686: goto            690
        //   689: athrow         
        //   690: getstatic       dev/nuker/pyro/fc.0:I
        //   693: ifeq            702
        //   696: ldc_w           -1548185590
        //   699: goto            705
        //   702: ldc_w           1354133418
        //   705: ldc_w           483195277
        //   708: ixor           
        //   709: lookupswitch {
        //          -1082889849: 1806
        //          1761456750: 702
        //          default: 736
        //        }
        //   736: aload           8
        //   738: goto            742
        //   741: athrow         
        //   742: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   745: goto            749
        //   748: athrow         
        //   749: ifeq            758
        //   752: ldc_w           -161281393
        //   755: goto            761
        //   758: ldc_w           -161281394
        //   761: ldc_w           -1113233693
        //   764: ixor           
        //   765: tableswitch {
        //          -1752377128: 788
        //          -1752377127: 1795
        //          default: 752
        //        }
        //   788: getstatic       dev/nuker/pyro/fc.1:I
        //   791: ifeq            800
        //   794: ldc_w           925583354
        //   797: goto            803
        //   800: ldc_w           1191299110
        //   803: ldc_w           -2134498402
        //   806: ixor           
        //   807: lookupswitch {
        //          -1209179036: 800
        //          -943199304: 832
        //          default: 1820
        //        }
        //   832: aload_0        
        //   833: getfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //   836: getstatic       dev/nuker/pyro/fc.0:I
        //   839: ifeq            848
        //   842: ldc_w           383307385
        //   845: goto            851
        //   848: ldc_w           828039030
        //   851: ldc_w           113401256
        //   854: ixor           
        //   855: lookupswitch {
        //          270177233: 1832
        //          1579166810: 848
        //          default: 880
        //        }
        //   880: aload           8
        //   882: goto            886
        //   885: athrow         
        //   886: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   889: goto            893
        //   892: athrow         
        //   893: checkcast       Ljava/util/concurrent/atomic/AtomicInteger;
        //   896: astore          9
        //   898: getstatic       dev/nuker/pyro/fc.0:I
        //   901: ifeq            910
        //   904: ldc_w           1141187078
        //   907: goto            913
        //   910: ldc_w           -995842459
        //   913: ldc_w           1259230097
        //   916: ixor           
        //   917: lookupswitch {
        //          252408215: 1840
        //          1152756000: 910
        //          default: 944
        //        }
        //   944: aload           9
        //   946: dup            
        //   947: ifnonnull       956
        //   950: ldc_w           -2144875565
        //   953: goto            959
        //   956: ldc_w           -2144875566
        //   959: ldc_w           -1535944297
        //   962: ixor           
        //   963: tableswitch {
        //          1219044488: 984
        //          1219044489: 995
        //          default: 950
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   991: goto            995
        //   994: athrow         
        //   995: goto            999
        //   998: athrow         
        //   999: invokevirtual   java/util/concurrent/atomic/AtomicInteger.intValue:()I
        //  1002: goto            1006
        //  1005: athrow         
        //  1006: iconst_m1      
        //  1007: if_icmpne       1016
        //  1010: ldc_w           -486414689
        //  1013: goto            1019
        //  1016: ldc_w           -486414692
        //  1019: ldc_w           1755840670
        //  1022: ixor           
        //  1023: tableswitch {
        //          391367682: 1044
        //          391367683: 1493
        //          default: 1010
        //        }
        //  1044: new             Lkotlin/jvm/internal/Ref$IntRef;
        //  1047: dup            
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: astore          10
        //  1061: getstatic       dev/nuker/pyro/fc.c:I
        //  1064: ifge            1073
        //  1067: ldc_w           -939144208
        //  1070: goto            1076
        //  1073: ldc_w           849600081
        //  1076: ldc_w           -391044210
        //  1079: ixor           
        //  1080: lookupswitch {
        //          -636289569: 1108
        //          548726910: 1073
        //          default: 1842
        //        }
        //  1108: iload           7
        //  1110: iload           4
        //  1112: istore          11
        //  1114: getstatic       dev/nuker/pyro/fc.c:I
        //  1117: ifge            1126
        //  1120: ldc_w           834181382
        //  1123: goto            1129
        //  1126: ldc_w           1986246376
        //  1129: ldc_w           -1472789330
        //  1132: ixor           
        //  1133: lookupswitch {
        //          -1718641240: 1126
        //          -564874682: 1160
        //          default: 1818
        //        }
        //  1160: istore          16
        //  1162: iconst_0       
        //  1163: istore          12
        //  1165: iconst_0       
        //  1166: istore          13
        //  1168: getstatic       dev/nuker/pyro/fc.c:I
        //  1171: ifge            1180
        //  1174: ldc_w           966586762
        //  1177: goto            1183
        //  1180: ldc_w           -1369641972
        //  1183: ldc_w           1019714221
        //  1186: ixor           
        //  1187: lookupswitch {
        //          -1835305311: 1212
        //          89877287: 1180
        //          default: 1816
        //        }
        //  1212: iload           11
        //  1214: getstatic       dev/nuker/pyro/fc.c:I
        //  1217: ifge            1226
        //  1220: ldc_w           -1572988547
        //  1223: goto            1229
        //  1226: ldc_w           -2108198050
        //  1229: ldc_w           405042681
        //  1232: ixor           
        //  1233: lookupswitch {
        //          -1172673404: 1814
        //          1178394109: 1226
        //          default: 1260
        //        }
        //  1260: istore          14
        //  1262: iconst_0       
        //  1263: istore          15
        //  1265: aload           10
        //  1267: iload           14
        //  1269: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1272: iload           11
        //  1274: istore          17
        //  1276: iload           16
        //  1278: iload           17
        //  1280: isub           
        //  1281: ifge            1296
        //  1284: aload           10
        //  1286: dup            
        //  1287: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1290: bipush          25
        //  1292: iadd           
        //  1293: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1296: aload_0        
        //  1297: getfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //  1300: aload           8
        //  1302: goto            1306
        //  1305: athrow         
        //  1306: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1309: goto            1313
        //  1312: athrow         
        //  1313: dup            
        //  1314: ifnonnull       1328
        //  1317: goto            1321
        //  1320: athrow         
        //  1321: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1324: goto            1328
        //  1327: athrow         
        //  1328: checkcast       Ljava/util/concurrent/atomic/AtomicInteger;
        //  1331: getstatic       dev/nuker/pyro/fc.0:I
        //  1334: ifeq            1343
        //  1337: ldc_w           -853856231
        //  1340: goto            1346
        //  1343: ldc_w           -1988705118
        //  1346: ldc_w           -1108140009
        //  1349: ixor           
        //  1350: lookupswitch {
        //          881190069: 1376
        //          1894256654: 1343
        //          default: 1836
        //        }
        //  1376: aload           10
        //  1378: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1381: goto            1385
        //  1384: athrow         
        //  1385: invokevirtual   java/util/concurrent/atomic/AtomicInteger.set:(I)V
        //  1388: goto            1392
        //  1391: athrow         
        //  1392: getstatic       dev/nuker/pyro/fc.c:I
        //  1395: ifge            1404
        //  1398: ldc_w           201933596
        //  1401: goto            1407
        //  1404: ldc_w           -2044910939
        //  1407: ldc_w           1508204637
        //  1410: ixor           
        //  1411: lookupswitch {
        //          -537378056: 1436
        //          1441538881: 1404
        //          default: 1846
        //        }
        //  1436: aload           10
        //  1438: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //  1441: ifeq            1493
        //  1444: getstatic       dev/nuker/pyro/fc.0:I
        //  1447: ifeq            1456
        //  1450: ldc_w           -2021535716
        //  1453: goto            1459
        //  1456: ldc_w           1155341833
        //  1459: ldc_w           1092012425
        //  1462: ixor           
        //  1463: lookupswitch {
        //          -963176043: 1810
        //          1416036863: 1456
        //          default: 1488
        //        }
        //  1488: aload_0        
        //  1489: iconst_0       
        //  1490: putfield        dev/nuker/pyro/f6z.c:Z
        //  1493: aload_0        
        //  1494: getfield        dev/nuker/pyro/f6z.c:Lnet/minecraft/util/math/BlockPos;
        //  1497: aload_2        
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: invokevirtual   net/minecraft/network/play/server/SPacketBlockAction.func_179825_a:()Lnet/minecraft/util/math/BlockPos;
        //  1505: goto            1509
        //  1508: athrow         
        //  1509: getstatic       dev/nuker/pyro/fc.0:I
        //  1512: ifeq            1521
        //  1515: ldc_w           -1008479550
        //  1518: goto            1524
        //  1521: ldc_w           1039205580
        //  1524: ldc_w           -1843545481
        //  1527: ixor           
        //  1528: lookupswitch {
        //          -1343439173: 1556
        //          1375627445: 1521
        //          default: 1826
        //        }
        //  1556: goto            1560
        //  1559: athrow         
        //  1560: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1563: goto            1567
        //  1566: athrow         
        //  1567: ifeq            1792
        //  1570: getstatic       dev/nuker/pyro/fc.0:I
        //  1573: ifeq            1582
        //  1576: ldc_w           -716041169
        //  1579: goto            1585
        //  1582: ldc_w           801987915
        //  1585: ldc_w           1734262047
        //  1588: ixor           
        //  1589: lookupswitch {
        //          -1307793104: 1582
        //          1217650772: 1616
        //          default: 1848
        //        }
        //  1616: aload_0        
        //  1617: getstatic       dev/nuker/pyro/fc.1:I
        //  1620: ifeq            1629
        //  1623: ldc_w           1484796689
        //  1626: goto            1632
        //  1629: ldc_w           1600898823
        //  1632: ldc_w           640452688
        //  1635: ixor           
        //  1636: lookupswitch {
        //          2034716503: 1664
        //          2125249345: 1629
        //          default: 1828
        //        }
        //  1664: getfield        dev/nuker/pyro/f6z.2:I
        //  1667: aload_0        
        //  1668: getstatic       dev/nuker/pyro/fc.c:I
        //  1671: ifge            1680
        //  1674: ldc_w           -1771195607
        //  1677: goto            1683
        //  1680: ldc_w           -556646516
        //  1683: ldc_w           1538460931
        //  1686: ixor           
        //  1687: lookupswitch {
        //          -2057227633: 1712
        //          -841040342: 1680
        //          default: 1824
        //        }
        //  1712: getfield        dev/nuker/pyro/f6z.c:Ljava/util/LinkedHashMap;
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //  1722: goto            1726
        //  1725: athrow         
        //  1726: goto            1730
        //  1729: athrow         
        //  1730: invokeinterface java/util/Collection.size:()I
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: if_icmplt       1792
        //  1742: aload_0        
        //  1743: iconst_1       
        //  1744: getstatic       dev/nuker/pyro/fc.1:I
        //  1747: ifeq            1756
        //  1750: ldc_w           37599709
        //  1753: goto            1759
        //  1756: ldc_w           1203158255
        //  1759: ldc_w           -765154054
        //  1762: ixor           
        //  1763: lookupswitch {
        //          -1781395435: 1788
        //          -799468249: 1756
        //          default: 1852
        //        }
        //  1788: putfield        dev/nuker/pyro/f6z.1:I
        //  1791: return         
        //  1792: goto            1805
        //  1795: iinc            7, 1
        //  1798: iload           7
        //  1800: istore          6
        //  1802: goto            560
        //  1805: return         
        //  1806: aconst_null    
        //  1807: athrow         
        //  1808: aconst_null    
        //  1809: athrow         
        //  1810: aconst_null    
        //  1811: athrow         
        //  1812: aconst_null    
        //  1813: athrow         
        //  1814: aconst_null    
        //  1815: athrow         
        //  1816: aconst_null    
        //  1817: athrow         
        //  1818: aconst_null    
        //  1819: athrow         
        //  1820: aconst_null    
        //  1821: athrow         
        //  1822: aconst_null    
        //  1823: athrow         
        //  1824: aconst_null    
        //  1825: athrow         
        //  1826: aconst_null    
        //  1827: athrow         
        //  1828: aconst_null    
        //  1829: athrow         
        //  1830: aconst_null    
        //  1831: athrow         
        //  1832: aconst_null    
        //  1833: athrow         
        //  1834: aconst_null    
        //  1835: athrow         
        //  1836: aconst_null    
        //  1837: athrow         
        //  1838: aconst_null    
        //  1839: athrow         
        //  1840: aconst_null    
        //  1841: athrow         
        //  1842: aconst_null    
        //  1843: athrow         
        //  1844: aconst_null    
        //  1845: athrow         
        //  1846: aconst_null    
        //  1847: athrow         
        //  1848: aconst_null    
        //  1849: athrow         
        //  1850: aconst_null    
        //  1851: athrow         
        //  1852: aconst_null    
        //  1853: athrow         
        //  1854: aconst_null    
        //  1855: athrow         
        //  1856: pop            
        //  1857: goto            24
        //  1860: pop            
        //  1861: aconst_null    
        //  1862: goto            1856
        //  1865: dup            
        //  1866: ifnull          1856
        //  1869: checkcast       Ljava/lang/Throwable;
        //  1872: athrow         
        //  1873: dup            
        //  1874: ifnull          1860
        //  1877: checkcast       Ljava/lang/Throwable;
        //  1880: athrow         
        //  1881: aconst_null    
        //  1882: athrow         
        //    StackMapTable: 00 E4 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FD 00 03 07 00 03 07 01 AD 0B 42 01 1C 45 07 00 4B 40 07 01 AD 45 07 00 5F 40 01 4F 07 01 AD FF 00 02 00 02 07 00 03 07 01 AD 00 02 07 01 AD 01 5E 07 01 AD 42 07 00 4D 40 07 01 AD 45 07 00 5F 40 07 00 F7 05 05 42 01 19 43 07 00 5F 40 07 01 AD 45 07 00 5F 40 07 02 28 FF 00 17 00 00 00 01 07 00 5F FF 00 00 00 02 07 00 03 07 01 AD 00 01 07 01 AD 45 07 00 5F 40 07 02 28 4D 07 00 5F FF 00 00 00 02 07 00 03 07 01 AD 00 04 07 02 28 08 00 E8 08 00 E8 07 00 D4 45 07 00 5F FF 00 00 00 02 07 00 03 07 01 AD 00 04 07 02 28 08 00 E8 08 00 E8 07 00 D4 42 07 00 5F FF 00 00 00 02 07 00 03 07 01 AD 00 04 07 02 28 08 00 E8 08 00 E8 07 00 D4 45 07 00 5F FF 00 00 00 02 07 00 03 07 01 AD 00 02 07 02 28 07 00 BA 40 07 02 28 4E 07 01 BA FF 00 02 00 02 07 00 03 07 01 AD 00 02 07 01 BA 01 5F 07 01 BA FC 00 0C 07 01 BA 42 01 1F 42 07 00 E4 00 45 07 00 5F 40 07 01 7C FF 00 0C 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 7C 07 01 BA FF 00 02 00 03 07 00 03 07 01 AD 07 01 BA 00 03 07 01 7C 07 01 BA 01 FF 00 1C 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 7C 07 01 BA 42 07 00 5F FF 00 00 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 7C 07 01 BA 45 07 00 5F FF 00 00 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 7C 01 4C 07 01 3D FF 00 02 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 3D 01 5C 07 01 3D FF 00 04 00 04 07 00 03 07 01 AD 07 01 BA 07 01 3D 00 01 07 00 5F 40 07 01 BA 45 07 00 5F 40 01 FF 00 09 00 05 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 00 01 07 00 5F FF 00 00 00 05 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 00 02 07 00 63 07 01 3D 45 07 00 5F 40 07 00 C6 4E 07 01 59 FF 00 02 00 05 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 00 02 07 01 59 01 5E 07 01 59 FE 00 07 07 01 59 01 01 12 42 01 1D FF 00 08 00 00 00 01 07 00 5F FF 00 00 00 08 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 00 01 07 01 59 45 07 00 5F 40 07 01 59 4E 07 00 A4 FF 00 02 00 08 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 00 02 07 00 A4 01 5C 07 00 A4 FF 00 05 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 01 07 00 5F 40 07 01 BA 45 07 00 5F 40 07 00 A4 4B 07 00 A4 FF 00 02 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 02 07 00 A4 01 5E 07 00 A4 44 07 00 4F FF 00 00 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 02 07 00 A4 07 00 A4 45 07 00 5F 40 01 02 05 42 01 1A 0B 42 01 1C 4F 07 00 63 FF 00 02 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 02 07 00 63 01 5C 07 00 63 44 07 00 49 FF 00 00 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 02 07 00 63 07 00 A4 45 07 00 5F 40 07 00 C6 FC 00 10 07 00 B2 42 01 1E 45 07 00 B2 45 07 00 B2 FF 00 02 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 B2 01 58 07 00 B2 42 07 00 5F 40 07 00 B2 45 07 00 5F 40 07 00 B2 42 07 00 5F 40 07 00 B2 45 07 00 5F 40 01 03 05 42 01 18 46 07 00 41 FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 08 04 14 08 04 14 45 07 00 5F 40 07 01 F4 FC 00 0D 07 01 F4 42 01 1F FF 00 11 00 0C 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 00 01 01 FF 00 02 00 0C 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 00 02 01 01 5E 01 FF 00 13 00 11 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 00 00 01 00 00 42 01 1C 4D 01 FF 00 02 00 11 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 00 00 01 00 02 01 01 5E 01 FF 00 23 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 00 48 07 00 5F FF 00 00 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 02 07 00 63 07 00 A4 45 07 00 5F 40 07 00 C6 46 07 00 5F 40 07 00 C6 45 07 00 5F 40 07 00 C6 4E 07 00 B2 FF 00 02 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 02 07 00 B2 01 5D 07 00 B2 FF 00 07 00 00 00 01 07 00 5F FF 00 00 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 02 07 00 B2 01 45 07 00 5F 00 0B 42 01 1C 13 42 01 1C FF 00 04 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 00 47 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 01 BA 45 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 00 A4 FF 00 0B 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 00 A4 FF 00 02 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 03 07 00 A4 07 00 A4 01 FF 00 1F 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 00 A4 42 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 00 A4 45 07 00 5F 40 01 0E 42 01 1E 4C 07 00 03 FF 00 02 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 03 01 5F 07 00 03 FF 00 0F 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 00 03 FF 00 02 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 03 01 07 00 03 01 FF 00 1C 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 00 03 FF 00 05 00 00 00 01 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 00 63 45 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 02 20 42 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 02 20 47 07 00 5F FF 00 00 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 01 FF 00 10 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 03 01 FF 00 02 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 03 07 00 03 01 01 FF 00 1C 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 03 01 03 FA 00 02 FF 00 09 00 02 07 00 03 07 01 AD 00 00 FF 00 00 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 01 07 00 A4 FF 00 01 00 05 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 00 01 07 01 59 FF 00 01 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 00 FF 00 01 00 02 07 00 03 07 01 AD 00 01 07 01 BA FF 00 01 00 11 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 00 00 01 00 01 01 01 FF 00 01 00 0C 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 00 01 01 F8 00 01 FF 00 01 00 02 07 00 03 07 01 AD 00 01 07 01 AD FF 00 01 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 01 07 00 03 FF 00 01 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 A4 07 00 A4 41 07 00 03 FF 00 01 00 03 07 00 03 07 01 AD 07 01 BA 00 00 FF 00 01 00 09 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 00 01 07 00 63 FA 00 01 FF 00 01 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 01 07 00 B2 FF 00 01 00 03 07 00 03 07 01 AD 07 01 BA 00 02 07 01 7C 07 01 BA FF 00 01 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 00 FC 00 01 07 01 F4 FF 00 01 00 03 07 00 03 07 01 AD 07 01 BA 00 01 07 01 3D FF 00 01 00 12 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 07 01 F4 01 01 01 01 01 01 01 00 00 FF 00 01 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 00 FF 00 01 00 08 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 00 01 07 00 A4 FF 00 01 00 0A 07 00 03 07 01 AD 07 01 BA 07 01 3D 01 07 01 59 01 01 07 00 A4 07 00 B2 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 01 AD 00 00 41 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1865   1873   Any
        //  1865   1873   1865   1873   Ljava/util/ConcurrentModificationException;
        //  1881   1883   3      8      Any
        //  74     81     81     82     Any
        //  75     81     3      8      Ljava/lang/NumberFormatException;
        //  74     81     74     75     Ljava/lang/IllegalArgumentException;
        //  75     81     3      8      Ljava/lang/ClassCastException;
        //  75     81     3      8      Any
        //  135    142    142    143    Any
        //  135    142    142    143    Ljava/lang/IndexOutOfBoundsException;
        //  136    142    135    136    Ljava/lang/ArithmeticException;
        //  136    142    3      8      Ljava/lang/ArithmeticException;
        //  135    142    3      8      Any
        //  188    195    195    196    Any
        //  188    195    3      8      Ljava/lang/IllegalStateException;
        //  189    195    3      8      Ljava/lang/ArithmeticException;
        //  189    195    3      8      Ljava/lang/IllegalArgumentException;
        //  188    195    188    189    Any
        //  221    227    227    228    Any
        //  221    227    227    228    Any
        //  221    227    227    228    Any
        //  221    227    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  221    227    227    228    Any
        //  242    249    249    250    Any
        //  242    249    242    243    Ljava/lang/AssertionError;
        //  243    249    242    243    Ljava/lang/NegativeArraySizeException;
        //  243    249    3      8      Ljava/lang/UnsupportedOperationException;
        //  243    249    242    243    Ljava/lang/IllegalStateException;
        //  253    260    260    261    Any
        //  253    260    3      8      Ljava/lang/IllegalStateException;
        //  253    260    260    261    Any
        //  254    260    253    254    Any
        //  253    260    253    254    Ljava/lang/AssertionError;
        //  363    370    370    371    Any
        //  363    370    3      8      Ljava/util/NoSuchElementException;
        //  363    370    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  363    370    363    364    Ljava/lang/AssertionError;
        //  363    370    3      8      Ljava/lang/IllegalStateException;
        //  419    426    426    427    Any
        //  420    426    419    420    Any
        //  420    426    426    427    Any
        //  419    426    3      8      Any
        //  420    426    3      8      Any
        //  477    484    484    485    Any
        //  478    484    477    478    Any
        //  477    484    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  477    484    477    478    Ljava/lang/UnsupportedOperationException;
        //  478    484    484    485    Ljava/lang/NumberFormatException;
        //  495    502    502    503    Any
        //  496    502    3      8      Any
        //  495    502    502    503    Ljava/lang/StringIndexOutOfBoundsException;
        //  496    502    3      8      Any
        //  495    502    495    496    Any
        //  622    628    628    629    Any
        //  622    628    628    629    Ljava/lang/ClassCastException;
        //  622    628    3      8      Ljava/util/NoSuchElementException;
        //  622    628    628    629    Any
        //  622    628    3      8      Any
        //  682    689    689    690    Any
        //  682    689    682    683    Any
        //  682    689    682    683    Any
        //  682    689    682    683    Any
        //  683    689    3      8      Any
        //  741    748    748    749    Any
        //  741    748    748    749    Ljava/lang/NumberFormatException;
        //  741    748    3      8      Any
        //  741    748    741    742    Ljava/lang/UnsupportedOperationException;
        //  742    748    3      8      Ljava/lang/ArithmeticException;
        //  885    892    892    893    Any
        //  885    892    892    893    Ljava/util/NoSuchElementException;
        //  885    892    3      8      Any
        //  885    892    3      8      Any
        //  885    892    885    886    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  987    994    994    995    Any
        //  987    994    3      8      Ljava/lang/ArithmeticException;
        //  988    994    987    988    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  988    994    987    988    Any
        //  987    994    987    988    Ljava/lang/IllegalArgumentException;
        //  998    1005   1005   1006   Any
        //  999    1005   998    999    Any
        //  998    1005   3      8      Ljava/lang/IllegalStateException;
        //  998    1005   3      8      Any
        //  999    1005   998    999    Any
        //  1051   1058   1058   1059   Any
        //  1052   1058   3      8      Any
        //  1051   1058   1058   1059   Ljava/lang/NegativeArraySizeException;
        //  1051   1058   1051   1052   Ljava/lang/NumberFormatException;
        //  1051   1058   3      8      Ljava/lang/AssertionError;
        //  1305   1312   1312   1313   Any
        //  1305   1312   1305   1306   Ljava/lang/RuntimeException;
        //  1306   1312   3      8      Any
        //  1306   1312   1305   1306   Any
        //  1306   1312   3      8      Any
        //  1320   1327   1327   1328   Any
        //  1320   1327   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1321   1327   1320   1321   Ljava/util/NoSuchElementException;
        //  1321   1327   1327   1328   Ljava/lang/AssertionError;
        //  1320   1327   1320   1321   Any
        //  1385   1391   1391   1392   Any
        //  1385   1391   1391   1392   Ljava/lang/StringIndexOutOfBoundsException;
        //  1385   1391   1391   1392   Any
        //  1385   1391   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1385   1391   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1501   1508   1508   1509   Any
        //  1502   1508   1508   1509   Any
        //  1501   1508   1501   1502   Ljava/lang/IllegalStateException;
        //  1501   1508   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1501   1508   1501   1502   Any
        //  1559   1566   1566   1567   Any
        //  1560   1566   3      8      Any
        //  1560   1566   3      8      Any
        //  1560   1566   1559   1560   Any
        //  1560   1566   1559   1560   Ljava/lang/AssertionError;
        //  1719   1725   1725   1726   Any
        //  1719   1725   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1719   1725   3      8      Any
        //  1719   1725   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1719   1725   3      8      Ljava/lang/NullPointerException;
        //  1729   1738   1738   1739   Any
        //  1730   1738   1738   1739   Ljava/lang/IndexOutOfBoundsException;
        //  1729   1738   1729   1730   Any
        //  1729   1738   1729   1730   Ljava/lang/NegativeArraySizeException;
        //  1730   1738   1729   1730   Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public int c() {
        return fbS.b9(this, 1411385603);
    }
    
    @NotNull
    public LinkedHashMap 0() {
        return fbS.e5(this, 1915284274);
    }
    
    @NotNull
    public LinkedHashMap 3() {
        return fbS.e5(this, 1915284275);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1151
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1143
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1135
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    35: goto            39
        //    38: athrow         
        //    39: iload_1        
        //    40: ifeq            228
        //    43: getstatic       dev/nuker/pyro/fc.0:I
        //    46: ifeq            55
        //    49: ldc_w           1999683450
        //    52: goto            58
        //    55: ldc_w           993991307
        //    58: ldc_w           -1731055463
        //    61: ixor           
        //    62: lookupswitch {
        //          -1544738286: 88
        //          -270364701: 55
        //          default: 1120
        //        }
        //    88: aload_0        
        //    89: getfield        dev/nuker/pyro/f6z.c:Lnet/minecraft/client/Minecraft;
        //    92: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    95: ifnull          153
        //    98: aload_0        
        //    99: getstatic       dev/nuker/pyro/fc.1:I
        //   102: ifeq            111
        //   105: ldc_w           1681795991
        //   108: goto            114
        //   111: ldc_w           -1678173972
        //   114: ldc_w           1051533175
        //   117: ixor           
        //   118: lookupswitch {
        //          453628086: 111
        //          1519596768: 1104
        //          default: 144
        //        }
        //   144: getfield        dev/nuker/pyro/f6z.c:Lnet/minecraft/client/Minecraft;
        //   147: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   150: ifnonnull       228
        //   153: getstatic       dev/nuker/pyro/fc.1:I
        //   156: ifeq            165
        //   159: ldc_w           1243155077
        //   162: goto            168
        //   165: ldc_w           -1422068649
        //   168: ldc_w           -1400322970
        //   171: ixor           
        //   172: lookupswitch {
        //          -426651933: 1098
        //          2102979265: 165
        //          default: 200
        //        }
        //   200: aload_0        
        //   201: getfield        dev/nuker/pyro/f6z.c:Ldev/nuker/pyro/fw;
        //   204: iconst_0       
        //   205: goto            209
        //   208: athrow         
        //   209: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   212: goto            216
        //   215: athrow         
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   223: goto            227
        //   226: athrow         
        //   227: return         
        //   228: aload_0        
        //   229: iconst_1       
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            242
        //   236: ldc_w           -988863673
        //   239: goto            245
        //   242: ldc_w           -1641875586
        //   245: ldc_w           28533155
        //   248: ixor           
        //   249: lookupswitch {
        //          -994295068: 1118
        //          1604810750: 242
        //          default: 276
        //        }
        //   276: putfield        dev/nuker/pyro/f6z.c:Z
        //   279: getstatic       dev/nuker/pyro/fc.0:I
        //   282: ifeq            291
        //   285: ldc_w           -1258762666
        //   288: goto            294
        //   291: ldc_w           -355329994
        //   294: ldc_w           -143723538
        //   297: ixor           
        //   298: lookupswitch {
        //          498920408: 324
        //          1133919672: 291
        //          default: 1106
        //        }
        //   324: aload_0        
        //   325: getstatic       dev/nuker/pyro/fc.c:I
        //   328: ifge            337
        //   331: ldc_w           -1178991529
        //   334: goto            340
        //   337: ldc_w           -1573738909
        //   340: ldc_w           1367877124
        //   343: ixor           
        //   344: lookupswitch {
        //          -399367597: 1100
        //          1936849796: 337
        //          default: 372
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokestatic    dev/nuker/pyro/fbn.c:()Ljava/util/LinkedHashMap;
        //   379: goto            383
        //   382: athrow         
        //   383: dup            
        //   384: pop            
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            397
        //   391: ldc_w           265640331
        //   394: goto            400
        //   397: ldc_w           1384276935
        //   400: ldc_w           -132610482
        //   403: ixor           
        //   404: lookupswitch {
        //          -137502779: 1122
        //          485437080: 397
        //          default: 432
        //        }
        //   432: putfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //   435: aload_0        
        //   436: getfield        dev/nuker/pyro/f6z.0:Ljava/util/LinkedHashMap;
        //   439: getstatic       dev/nuker/pyro/fc.c:I
        //   442: ifge            451
        //   445: ldc_w           1173683205
        //   448: goto            454
        //   451: ldc_w           2013510159
        //   454: ldc_w           -1259340571
        //   457: ixor           
        //   458: lookupswitch {
        //          -767011976: 451
        //          -249888544: 1096
        //          default: 484
        //        }
        //   484: goto            488
        //   487: athrow         
        //   488: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //   491: goto            495
        //   494: athrow         
        //   495: dup            
        //   496: pop            
        //   497: checkcast       Ljava/lang/Iterable;
        //   500: astore          4
        //   502: iconst_0       
        //   503: istore          5
        //   505: aload           4
        //   507: goto            511
        //   510: athrow         
        //   511: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   516: goto            520
        //   519: athrow         
        //   520: getstatic       dev/nuker/pyro/fc.c:I
        //   523: ifge            532
        //   526: ldc_w           -592908073
        //   529: goto            535
        //   532: ldc_w           1621233721
        //   535: ldc_w           -1433678679
        //   538: ixor           
        //   539: lookupswitch {
        //          450976821: 532
        //          1982020734: 1116
        //          default: 564
        //        }
        //   564: astore          6
        //   566: aload           6
        //   568: goto            572
        //   571: athrow         
        //   572: invokeinterface java/util/Iterator.hasNext:()Z
        //   577: goto            581
        //   580: athrow         
        //   581: ifeq            986
        //   584: getstatic       dev/nuker/pyro/fc.1:I
        //   587: ifeq            596
        //   590: ldc_w           723178857
        //   593: goto            599
        //   596: ldc_w           -1890947081
        //   599: ldc_w           -818090281
        //   602: ixor           
        //   603: lookupswitch {
        //          -467256386: 596
        //          1081508128: 628
        //          default: 1092
        //        }
        //   628: aload           6
        //   630: goto            634
        //   633: athrow         
        //   634: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   639: goto            643
        //   642: athrow         
        //   643: astore          7
        //   645: getstatic       dev/nuker/pyro/fc.0:I
        //   648: ifeq            657
        //   651: ldc_w           1640140836
        //   654: goto            660
        //   657: ldc_w           1258681570
        //   660: ldc_w           -684367075
        //   663: ixor           
        //   664: lookupswitch {
        //          -1674536961: 692
        //          -1225264327: 657
        //          default: 1102
        //        }
        //   692: aload           7
        //   694: checkcast       [Lnet/minecraft/util/math/BlockPos;
        //   697: getstatic       dev/nuker/pyro/fc.c:I
        //   700: ifge            709
        //   703: ldc_w           -1189610177
        //   706: goto            712
        //   709: ldc_w           101461009
        //   712: ldc_w           1600139813
        //   715: ixor           
        //   716: lookupswitch {
        //          -428355814: 709
        //          1500257844: 744
        //          default: 1108
        //        }
        //   744: astore          8
        //   746: iconst_0       
        //   747: istore          9
        //   749: aload           8
        //   751: dup            
        //   752: pop            
        //   753: astore          10
        //   755: iconst_0       
        //   756: istore          11
        //   758: aload           10
        //   760: astore          12
        //   762: aload           12
        //   764: arraylength    
        //   765: istore          13
        //   767: iconst_0       
        //   768: getstatic       dev/nuker/pyro/fc.1:I
        //   771: ifeq            780
        //   774: ldc_w           -2071082405
        //   777: goto            783
        //   780: ldc_w           -544032523
        //   783: ldc_w           -880256620
        //   786: ixor           
        //   787: lookupswitch {
        //          433905836: 780
        //          1325765583: 1094
        //          default: 812
        //        }
        //   812: istore          14
        //   814: iload           14
        //   816: getstatic       dev/nuker/pyro/fc.c:I
        //   819: ifge            828
        //   822: ldc_w           -1635373180
        //   825: goto            831
        //   828: ldc_w           -1184635262
        //   831: ldc_w           -1228120109
        //   834: ixor           
        //   835: lookupswitch {
        //          263174481: 860
        //          675967063: 828
        //          default: 1112
        //        }
        //   860: iload           13
        //   862: if_icmpge       871
        //   865: ldc_w           1760216963
        //   868: goto            874
        //   871: ldc_w           1760216962
        //   874: ldc_w           1192758683
        //   877: ixor           
        //   878: tableswitch {
        //          1608881200: 900
        //          1608881201: 980
        //          default: 865
        //        }
        //   900: aload           12
        //   902: iload           14
        //   904: aaload         
        //   905: astore          15
        //   907: aload           15
        //   909: astore          16
        //   911: iconst_0       
        //   912: istore          17
        //   914: getstatic       dev/nuker/pyro/fc.0:I
        //   917: ifeq            926
        //   920: ldc_w           13705518
        //   923: goto            929
        //   926: ldc_w           -1686634337
        //   929: ldc_w           -2003196205
        //   932: ixor           
        //   933: lookupswitch {
        //          -2008512515: 1114
        //          -111750139: 926
        //          default: 960
        //        }
        //   960: aload_0        
        //   961: aload           16
        //   963: goto            967
        //   966: athrow         
        //   967: invokespecial   dev/nuker/pyro/f6z.1:(Lnet/minecraft/util/math/BlockPos;)V
        //   970: goto            974
        //   973: athrow         
        //   974: iinc            14, 1
        //   977: goto            814
        //   980: nop            
        //   981: nop            
        //   982: nop            
        //   983: goto            566
        //   986: nop            
        //   987: aload_0        
        //   988: iconst_0       
        //   989: getstatic       dev/nuker/pyro/fc.c:I
        //   992: ifge            1001
        //   995: ldc_w           108940016
        //   998: goto            1004
        //  1001: ldc_w           419992660
        //  1004: ldc_w           889497340
        //  1007: ixor           
        //  1008: lookupswitch {
        //          863693836: 1110
        //          1191342446: 1001
        //          default: 1036
        //        }
        //  1036: putfield        dev/nuker/pyro/f6z.1:I
        //  1039: aload_0        
        //  1040: iconst_0       
        //  1041: getstatic       dev/nuker/pyro/fc.c:I
        //  1044: ifge            1053
        //  1047: ldc_w           -1642634792
        //  1050: goto            1056
        //  1053: ldc_w           1338749502
        //  1056: ldc_w           -1674360628
        //  1059: ixor           
        //  1060: lookupswitch {
        //          22673174: 1053
        //          35924244: 1124
        //          default: 1088
        //        }
        //  1088: putfield        dev/nuker/pyro/f6z.2:I
        //  1091: return         
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
        //  1118: aconst_null    
        //  1119: athrow         
        //  1120: aconst_null    
        //  1121: athrow         
        //  1122: aconst_null    
        //  1123: athrow         
        //  1124: aconst_null    
        //  1125: athrow         
        //  1126: pop            
        //  1127: goto            24
        //  1130: pop            
        //  1131: aconst_null    
        //  1132: goto            1126
        //  1135: dup            
        //  1136: ifnull          1126
        //  1139: checkcast       Ljava/lang/Throwable;
        //  1142: athrow         
        //  1143: dup            
        //  1144: ifnull          1130
        //  1147: checkcast       Ljava/lang/Throwable;
        //  1150: athrow         
        //  1151: aconst_null    
        //  1152: athrow         
        //    StackMapTable: 00 7B 43 07 00 5F 04 FF 00 0B 00 00 00 01 07 00 5F FF 00 03 00 04 07 00 03 01 07 02 7F 07 02 81 00 00 46 07 00 45 FF 00 00 00 04 07 00 03 01 07 02 7F 07 02 81 00 04 07 00 03 01 07 02 7F 07 02 81 45 07 00 5F 00 0F 42 01 1D 56 07 00 03 FF 00 02 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 01 5D 07 00 03 08 0B 42 01 1F 47 07 00 45 FF 00 00 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 01 1D 01 45 07 00 5F FF 00 00 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 01 1D 07 01 17 42 07 00 E6 FF 00 00 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 01 1D 07 01 17 45 07 00 5F 00 00 FF 00 0D 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 02 7F 07 02 81 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 01 0E 42 01 1D 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 01 5F 07 00 03 42 07 00 49 40 07 00 03 45 07 00 5F FF 00 00 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 07 00 63 FF 00 0D 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 07 00 63 FF 00 02 00 04 07 00 03 01 07 02 7F 07 02 81 00 03 07 00 03 07 00 63 01 FF 00 1F 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 07 00 63 52 07 00 63 FF 00 02 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 63 01 5D 07 00 63 42 07 00 5F 40 07 00 63 45 07 00 5F 40 07 02 20 FF 00 0E 00 06 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 00 01 07 00 5F 40 07 02 5C 47 07 00 5F 40 07 00 72 4B 07 00 72 FF 00 02 00 06 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 00 02 07 00 72 01 5C 07 00 72 FC 00 01 07 00 72 FF 00 04 00 00 00 01 07 00 5F FF 00 00 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 01 07 00 72 47 07 00 5F 40 01 0E 42 01 1C FF 00 04 00 00 00 01 07 00 5F FF 00 00 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 01 07 00 72 47 07 00 5F 40 07 00 C6 FC 00 0D 07 00 C6 42 01 1F 50 07 01 59 FF 00 02 00 08 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 00 02 07 01 59 01 5F 07 01 59 FF 00 23 00 0E 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 00 01 01 FF 00 02 00 0E 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 00 02 01 01 5C 01 FC 00 01 01 4D 01 FF 00 02 00 0F 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 01 00 02 01 01 5C 01 04 05 42 01 19 FE 00 19 07 00 A4 07 00 A4 01 42 01 1E 45 07 00 5F FF 00 00 00 12 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 01 07 00 A4 07 00 A4 01 00 02 07 00 03 07 00 A4 45 07 00 5F 00 F8 00 05 FF 00 05 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 00 FF 00 0E 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 FF 00 02 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 03 07 00 03 01 01 FF 00 1F 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 FF 00 10 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 FF 00 02 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 03 07 00 03 01 01 FF 00 1F 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 03 FF 00 01 00 0E 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 00 01 01 FF 00 01 00 04 07 00 03 01 07 02 7F 07 02 81 00 01 07 00 63 01 41 07 00 03 FF 00 01 00 08 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 00 00 FF 00 01 00 04 07 00 03 01 07 02 7F 07 02 81 00 01 07 00 03 01 FF 00 01 00 08 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 00 01 07 01 59 FF 00 01 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 FF 00 01 00 0F 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 07 00 C6 07 01 59 01 07 01 59 01 07 01 59 01 01 00 01 01 FE 00 01 07 00 A4 07 00 A4 01 FF 00 01 00 06 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 00 01 07 00 72 FF 00 01 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 01 01 FF 00 01 00 04 07 00 03 01 07 02 7F 07 02 81 00 02 07 00 03 07 00 63 FF 00 01 00 07 07 00 03 01 07 02 7F 07 02 81 07 02 5C 01 07 00 72 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 02 7F 07 02 81 00 01 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 5F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1135   1143   Any
        //  1135   1143   1135   1143   Ljava/lang/RuntimeException;
        //  1151   1153   3      8      Ljava/lang/AssertionError;
        //  31     38     38     39     Any
        //  32     38     3      8      Ljava/util/ConcurrentModificationException;
        //  31     38     38     39     Any
        //  32     38     31     32     Ljava/lang/NumberFormatException;
        //  32     38     31     32     Ljava/util/ConcurrentModificationException;
        //  208    215    215    216    Any
        //  209    215    208    209    Ljava/lang/NegativeArraySizeException;
        //  208    215    208    209    Ljava/lang/NumberFormatException;
        //  209    215    3      8      Any
        //  208    215    215    216    Ljava/lang/NumberFormatException;
        //  219    226    226    227    Any
        //  219    226    219    220    Ljava/lang/StringIndexOutOfBoundsException;
        //  220    226    226    227    Ljava/lang/IllegalArgumentException;
        //  219    226    226    227    Any
        //  220    226    226    227    Ljava/lang/RuntimeException;
        //  375    382    382    383    Any
        //  375    382    375    376    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  376    382    3      8      Any
        //  375    382    382    383    Ljava/lang/IllegalArgumentException;
        //  375    382    382    383    Any
        //  487    494    494    495    Any
        //  488    494    494    495    Any
        //  488    494    494    495    Any
        //  487    494    3      8      Ljava/lang/IllegalArgumentException;
        //  487    494    487    488    Any
        //  510    519    519    520    Any
        //  511    519    3      8      Ljava/lang/NullPointerException;
        //  510    519    519    520    Ljava/lang/NullPointerException;
        //  510    519    510    511    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  511    519    510    511    Any
        //  572    580    580    581    Any
        //  572    580    3      8      Any
        //  572    580    3      8      Any
        //  572    580    3      8      Ljava/lang/NumberFormatException;
        //  572    580    3      8      Any
        //  634    642    642    643    Any
        //  634    642    642    643    Any
        //  634    642    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  634    642    642    643    Ljava/lang/IndexOutOfBoundsException;
        //  634    642    3      8      Ljava/lang/ArithmeticException;
        //  966    973    973    974    Any
        //  966    973    966    967    Ljava/lang/ClassCastException;
        //  966    973    966    967    Ljava/lang/IndexOutOfBoundsException;
        //  967    973    966    967    Any
        //  966    973    3      8      Ljava/lang/AssertionError;
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
    
    public void 2(@Nullable final BlockPos blockPos) {
        fbS.3X(this, 1875399239, blockPos);
    }
}
