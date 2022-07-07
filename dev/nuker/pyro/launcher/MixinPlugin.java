// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import java.util.Set;
import java.util.NoSuchElementException;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.lib.tree.ClassNode;
import java.util.ArrayList;
import dev.nuker.pyro.dc;
import java.util.List;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;

public class MixinPlugin implements IMixinConfigPlugin
{
    public static List<String> mixins;
    
    @Override
    public void onLoad(final String mixinPackage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          835
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            827
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            819
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/PyroClientLoadingPlugin.LOG:Lorg/apache/logging/log4j/Logger;
        //    27: ldc             "\ubf0d\uaf5d\ub513\uf800\u39c9\u36df\udcd4\u7b87\u5f7f\ub081\uf31a\ue488\ue26f\u080f\udd5a\u5eef\u3994\u2b9e\ufc21\u3fdb\u7843"
        //    29: goto            33
        //    32: athrow         
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: goto            40
        //    39: athrow         
        //    40: goto            44
        //    43: athrow         
        //    44: invokeinterface org/apache/logging/log4j/Logger.info:(Ljava/lang/String;)V
        //    49: goto            53
        //    52: athrow         
        //    53: getstatic       dev/nuker/pyro/dc.0:I
        //    56: ifgt            69
        //    59: ldc2_w          -1589377411
        //    62: l2i            
        //    63: ldc             -1278027191
        //    65: ixor           
        //    66: goto            76
        //    69: ldc2_w          1855288524
        //    72: l2i            
        //    73: ldc             -1214098767
        //    75: ixor           
        //    76: ldc2_w          2060978336
        //    79: l2i            
        //    80: ldc             -436181998
        //    82: ixor           
        //    83: ixor           
        //    84: lookupswitch {
        //          -1907445626: 794
        //          -1335587226: 69
        //          default: 112
        //        }
        //   112: getstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mixins:Ljava/util/List;
        //   115: goto            119
        //   118: athrow         
        //   119: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   124: goto            128
        //   127: athrow         
        //   128: astore_2       
        //   129: getstatic       dev/nuker/pyro/dc.0:I
        //   132: ifgt            145
        //   135: ldc2_w          389565280
        //   138: l2i            
        //   139: ldc             1371821590
        //   141: ixor           
        //   142: goto            152
        //   145: ldc2_w          -657958528
        //   148: l2i            
        //   149: ldc             -1299085142
        //   151: ixor           
        //   152: ldc2_w          -103999921
        //   155: l2i            
        //   156: ldc             -939807298
        //   158: ixor           
        //   159: ixor           
        //   160: lookupswitch {
        //          1910712715: 145
        //          2026546823: 796
        //          default: 188
        //        }
        //   188: aload_2        
        //   189: goto            193
        //   192: athrow         
        //   193: invokeinterface java/util/Iterator.hasNext:()Z
        //   198: goto            202
        //   201: athrow         
        //   202: ifeq            505
        //   205: aload_2        
        //   206: goto            210
        //   209: athrow         
        //   210: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   215: goto            219
        //   218: athrow         
        //   219: checkcast       Ljava/lang/String;
        //   222: astore_3        /* clazz */
        //   223: getstatic       dev/nuker/pyro/launcher/MixinPlugin.mixins:Ljava/util/List;
        //   226: getstatic       dev/nuker/pyro/dc.c:I
        //   229: ifne            242
        //   232: ldc2_w          1188992653
        //   235: l2i            
        //   236: ldc             33363713
        //   238: ixor           
        //   239: goto            249
        //   242: ldc2_w          -1424435308
        //   245: l2i            
        //   246: ldc             1493346225
        //   248: ixor           
        //   249: ldc2_w          1860836804
        //   252: l2i            
        //   253: ldc             -1142882951
        //   255: ixor           
        //   256: ixor           
        //   257: lookupswitch {
        //          -1842781903: 242
        //          655397016: 284
        //          default: 798
        //        }
        //   284: aload_3         /* clazz */
        //   285: aload_3         /* clazz */
        //   286: ldc             "."
        //   288: getstatic       dev/nuker/pyro/dc.1:I
        //   291: ifge            304
        //   294: ldc2_w          -1375850522
        //   297: l2i            
        //   298: ldc             -1894645553
        //   300: ixor           
        //   301: goto            311
        //   304: ldc2_w          1168645844
        //   307: l2i            
        //   308: ldc             -827402051
        //   310: ixor           
        //   311: ldc2_w          1154852993
        //   314: l2i            
        //   315: ldc             1936444786
        //   317: ixor           
        //   318: ixor           
        //   319: lookupswitch {
        //          -1128750182: 344
        //          357714650: 304
        //          default: 800
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   351: goto            355
        //   354: athrow         
        //   355: ldc2_w          -122172166
        //   358: l2i            
        //   359: ldc             -122172165
        //   361: ixor           
        //   362: iadd           
        //   363: getstatic       dev/nuker/pyro/dc.c:I
        //   366: ifne            379
        //   369: ldc2_w          -659176890
        //   372: l2i            
        //   373: ldc             1692103563
        //   375: ixor           
        //   376: goto            386
        //   379: ldc2_w          1070911686
        //   382: l2i            
        //   383: ldc             -450760630
        //   385: ixor           
        //   386: ldc2_w          -2118260140
        //   389: l2i            
        //   390: ldc             1161495813
        //   392: ixor           
        //   393: ixor           
        //   394: lookupswitch {
        //          1543288773: 379
        //          2028494492: 790
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   427: goto            431
        //   430: athrow         
        //   431: getstatic       dev/nuker/pyro/dc.c:I
        //   434: ifne            447
        //   437: ldc2_w          1936959168
        //   440: l2i            
        //   441: ldc             1320129054
        //   443: ixor           
        //   444: goto            454
        //   447: ldc2_w          -1272275847
        //   450: l2i            
        //   451: ldc             -1322897380
        //   453: ixor           
        //   454: ldc2_w          382197032
        //   457: l2i            
        //   458: ldc             1990572811
        //   460: ixor           
        //   461: ixor           
        //   462: lookupswitch {
        //          1572754173: 447
        //          1701759558: 488
        //          default: 802
        //        }
        //   488: goto            492
        //   491: athrow         
        //   492: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   497: goto            501
        //   500: athrow         
        //   501: pop            
        //   502: goto            129
        //   505: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   508: getstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mf:Ljava/io/File;
        //   511: getstatic       dev/nuker/pyro/dc.c:I
        //   514: ifne            527
        //   517: ldc2_w          -567660208
        //   520: l2i            
        //   521: ldc             -1825348555
        //   523: ixor           
        //   524: goto            534
        //   527: ldc2_w          -270673455
        //   530: l2i            
        //   531: ldc             -950686134
        //   533: ixor           
        //   534: ldc2_w          -948458125
        //   537: l2i            
        //   538: ldc             -2124763942
        //   540: ixor           
        //   541: ixor           
        //   542: lookupswitch {
        //          187978956: 527
        //          1856337458: 568
        //          default: 808
        //        }
        //   568: goto            572
        //   571: athrow         
        //   572: invokevirtual   java/io/File.toURI:()Ljava/net/URI;
        //   575: goto            579
        //   578: athrow         
        //   579: getstatic       dev/nuker/pyro/dc.0:I
        //   582: ifgt            595
        //   585: ldc2_w          1389150334
        //   588: l2i            
        //   589: ldc             -2084907727
        //   591: ixor           
        //   592: goto            602
        //   595: ldc2_w          -518861308
        //   598: l2i            
        //   599: ldc             -835475792
        //   601: ixor           
        //   602: ldc2_w          1732936865
        //   605: l2i            
        //   606: ldc             -152824807
        //   608: ixor           
        //   609: ixor           
        //   610: lookupswitch {
        //          -1097861108: 636
        //          1087931895: 595
        //          default: 792
        //        }
        //   636: goto            640
        //   639: athrow         
        //   640: invokevirtual   java/net/URI.toURL:()Ljava/net/URL;
        //   643: goto            647
        //   646: athrow         
        //   647: getstatic       dev/nuker/pyro/dc.1:I
        //   650: ifge            663
        //   653: ldc2_w          1501794866
        //   656: l2i            
        //   657: ldc             -1820782318
        //   659: ixor           
        //   660: goto            670
        //   663: ldc2_w          825905547
        //   666: l2i            
        //   667: ldc             107854949
        //   669: ixor           
        //   670: ldc2_w          -1238875649
        //   673: l2i            
        //   674: ldc             -767038879
        //   676: ixor           
        //   677: ixor           
        //   678: lookupswitch {
        //          -1365956418: 663
        //          1396196976: 704
        //          default: 806
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokevirtual   net/minecraft/launchwrapper/LaunchClassLoader.addURL:(Ljava/net/URL;)V
        //   711: goto            715
        //   714: athrow         
        //   715: goto            789
        //   718: getstatic       dev/nuker/pyro/dc.1:I
        //   721: ifge            734
        //   724: ldc2_w          -1633712707
        //   727: l2i            
        //   728: ldc             -153358299
        //   730: ixor           
        //   731: goto            741
        //   734: ldc2_w          1986204386
        //   737: l2i            
        //   738: ldc             1614687642
        //   740: ixor           
        //   741: ldc2_w          548194203
        //   744: l2i            
        //   745: ldc             216930223
        //   747: ixor           
        //   748: ixor           
        //   749: lookupswitch {
        //          -365824148: 734
        //          1141286316: 804
        //          default: 776
        //        }
        //   776: astore_2        /* e */
        //   777: aload_2         /* e */
        //   778: goto            782
        //   781: athrow         
        //   782: invokevirtual   java/net/MalformedURLException.printStackTrace:()V
        //   785: goto            789
        //   788: athrow         
        //   789: return         
        //   790: aconst_null    
        //   791: athrow         
        //   792: aconst_null    
        //   793: athrow         
        //   794: aconst_null    
        //   795: athrow         
        //   796: aconst_null    
        //   797: athrow         
        //   798: aconst_null    
        //   799: athrow         
        //   800: aconst_null    
        //   801: athrow         
        //   802: aconst_null    
        //   803: athrow         
        //   804: aconst_null    
        //   805: athrow         
        //   806: aconst_null    
        //   807: athrow         
        //   808: aconst_null    
        //   809: athrow         
        //   810: pop            
        //   811: goto            24
        //   814: pop            
        //   815: aconst_null    
        //   816: goto            810
        //   819: dup            
        //   820: ifnull          810
        //   823: checkcast       Ljava/lang/Throwable;
        //   826: athrow         
        //   827: dup            
        //   828: ifnull          814
        //   831: checkcast       Ljava/lang/Throwable;
        //   834: athrow         
        //   835: aconst_null    
        //   836: athrow         
        //    StackMapTable: 00 64 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 02 07 00 2D 47 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 00 37 07 00 2D 45 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 00 37 07 00 2D 42 07 00 15 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 00 37 07 00 2D 47 07 00 25 00 0F 46 01 23 45 07 00 25 40 07 00 51 47 07 00 25 40 07 00 57 FC 00 00 07 00 57 0F 46 01 23 43 07 00 17 40 07 00 57 47 07 00 25 40 01 46 07 00 25 40 07 00 57 47 07 00 25 40 07 00 04 FF 00 16 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 01 07 00 51 FF 00 06 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 01 62 07 00 51 FF 00 13 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 04 07 00 51 07 00 2D 07 00 2D 07 00 2D FF 00 06 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 05 07 00 51 07 00 2D 07 00 2D 07 00 2D 01 FF 00 20 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 04 07 00 51 07 00 2D 07 00 2D 07 00 2D FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 04 07 00 51 07 00 2D 07 00 2D 07 00 2D 45 07 00 25 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 FF 00 17 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 FF 00 06 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 04 07 00 51 07 00 2D 01 01 FF 00 21 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 45 07 00 25 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 07 00 2D FF 00 0F 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 07 00 2D FF 00 06 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 FF 00 21 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 07 00 2D 42 07 00 17 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 07 00 2D 47 07 00 25 40 01 FA 00 03 FF 00 15 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 B2 FF 00 06 00 03 07 00 02 07 00 2D 07 00 57 00 03 07 00 B0 07 00 B2 01 FF 00 21 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 B2 42 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 B2 45 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 BE FF 00 0F 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 BE FF 00 06 00 03 07 00 02 07 00 2D 07 00 57 00 03 07 00 B0 07 00 BE 01 FF 00 21 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 BE 42 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 BE 45 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 CD FF 00 0F 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 CD FF 00 06 00 03 07 00 02 07 00 2D 07 00 57 00 03 07 00 B0 07 00 CD 01 FF 00 21 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 CD 42 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 CD 45 07 00 25 00 42 07 00 0D 4F 07 00 0D FF 00 06 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 0D 01 62 07 00 0D FF 00 04 00 03 07 00 02 07 00 2D 07 00 0D 00 01 07 00 25 40 07 00 0D 45 07 00 25 FF 00 00 00 03 07 00 02 07 00 2D 07 00 04 00 00 FF 00 00 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 03 07 00 51 07 00 2D 01 FF 00 01 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 BE FA 00 01 FC 00 01 07 00 57 FF 00 01 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 01 07 00 51 FF 00 01 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 04 07 00 51 07 00 2D 07 00 2D 07 00 2D FF 00 01 00 04 07 00 02 07 00 2D 07 00 57 07 00 2D 00 02 07 00 51 07 00 2D FF 00 01 00 03 07 00 02 07 00 2D 07 00 57 00 01 07 00 0D FF 00 01 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 CD FF 00 01 00 03 07 00 02 07 00 2D 07 00 57 00 02 07 00 B0 07 00 B2 FF 00 01 00 02 07 00 02 07 00 2D 00 01 07 00 E9 43 05 44 07 00 E9 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  505    715    718    789    Ljava/net/MalformedURLException;
        //  8      20     819    827    Ljava/util/NoSuchElementException;
        //  819    827    819    827    Ljava/lang/IndexOutOfBoundsException;
        //  835    837    3      8      Any
        //  32     39     39     40     Any
        //  32     39     32     33     Any
        //  33     39     39     40     Any
        //  33     39     39     40     Ljava/util/ConcurrentModificationException;
        //  33     39     32     33     Ljava/lang/ArithmeticException;
        //  43     52     52     53     Any
        //  43     52     3      8      Ljava/util/ConcurrentModificationException;
        //  44     52     43     44     Ljava/lang/ArithmeticException;
        //  43     52     3      8      Any
        //  44     52     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  118    127    127    128    Any
        //  119    127    118    119    Ljava/lang/IndexOutOfBoundsException;
        //  119    127    127    128    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  119    127    118    119    Any
        //  119    127    127    128    Any
        //  192    201    201    202    Any
        //  193    201    201    202    Any
        //  192    201    3      8      Any
        //  192    201    201    202    Any
        //  192    201    192    193    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  209    218    218    219    Any
        //  209    218    209    210    Any
        //  210    218    218    219    Any
        //  210    218    209    210    Ljava/lang/IndexOutOfBoundsException;
        //  210    218    209    210    Any
        //  348    354    354    355    Any
        //  348    354    354    355    Any
        //  348    354    3      8      Any
        //  348    354    354    355    Ljava/lang/UnsupportedOperationException;
        //  348    354    354    355    Any
        //  424    430    430    431    Any
        //  424    430    430    431    Ljava/lang/UnsupportedOperationException;
        //  424    430    430    431    Any
        //  424    430    430    431    Ljava/lang/UnsupportedOperationException;
        //  424    430    3      8      Ljava/util/ConcurrentModificationException;
        //  491    500    500    501    Any
        //  492    500    500    501    Ljava/lang/NumberFormatException;
        //  492    500    491    492    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  491    500    3      8      Any
        //  492    500    500    501    Ljava/lang/StringIndexOutOfBoundsException;
        //  571    578    578    579    Any
        //  571    578    571    572    Any
        //  571    578    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  572    578    578    579    Ljava/util/ConcurrentModificationException;
        //  571    578    3      8      Ljava/lang/UnsupportedOperationException;
        //  639    646    646    647    Any
        //  640    646    639    640    Any
        //  639    646    3      8      Ljava/lang/AssertionError;
        //  639    646    646    647    Any
        //  640    646    646    647    Ljava/util/ConcurrentModificationException;
        //  707    714    714    715    Any
        //  708    714    707    708    Any
        //  708    714    714    715    Ljava/util/NoSuchElementException;
        //  707    714    3      8      Ljava/lang/AssertionError;
        //  707    714    707    708    Ljava/lang/EnumConstantNotPresentException;
        //  781    788    788    789    Any
        //  782    788    788    789    Ljava/lang/IllegalStateException;
        //  781    788    781    782    Any
        //  782    788    781    782    Ljava/util/ConcurrentModificationException;
        //  781    788    3      8      Ljava/util/NoSuchElementException;
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
    
    static {
        while (true) {
            int n = 0;
            Label_0027: {
                if (dc.1 < 0) {
                    n = ((int)(-1726225810L) ^ 0x48284F63);
                    break Label_0027;
                }
                n = ((int)1463389791L ^ 0x5456FE16);
            }
            switch (n ^ ((int)56885172L ^ 0x1C92C3D8)) {
                case 1297076040: {
                    continue;
                }
                default: {
                    final ArrayList<String> mixins = new ArrayList<String>();
                    while (true) {
                        int n2 = 0;
                        Label_0088: {
                            if (dc.1 < 0) {
                                n2 = ((int)(-221266859L) ^ 0xE2187F45);
                                break Label_0088;
                            }
                            n2 = ((int)(-1496887570L) ^ 0x2DCA6CCC);
                        }
                        switch (n2 ^ ((int)943480698L ^ 0xD056BFCB)) {
                            case -121822303: {
                                continue;
                            }
                            case 1667744403: {
                                MixinPlugin.mixins = mixins;
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
                case -826109599: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void preApply(final String targetClassName, final ClassNode targetClass, final String mixinClassName, final IMixinInfo mixinInfo) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.1:I
        //     4: iflt            34
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            26
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: return         
        //    17: pop            
        //    18: goto            16
        //    21: pop            
        //    22: aconst_null    
        //    23: goto            17
        //    26: dup            
        //    27: ifnull          17
        //    30: checkcast       Ljava/lang/Throwable;
        //    33: athrow         
        //    34: dup            
        //    35: ifnull          21
        //    38: checkcast       Ljava/lang/Throwable;
        //    41: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 25 FF 00 03 00 05 07 00 02 07 00 2D 07 01 0C 07 00 2D 07 01 0E 00 00 40 07 00 25 43 05 44 07 00 25 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     26     34     Any
        //  26     34     26     34     Ljava/lang/ArithmeticException;
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
    public void postApply(final String targetClassName, final ClassNode targetClass, final String mixinClassName, final IMixinInfo mixinInfo) {
        Object o = null;
        Block_0: {
            break Block_0;
            do {
                return;
                try {
                    o = null;
                    if (dc.c != 0) {
                        null;
                        goto Label_0026;
                    }
                    continue;
                }
                catch (ArithmeticException ex) {}
            } while (o == null);
        }
        throw (Throwable)o;
    }
    
    @Override
    public String getRefMapperConfig() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          437
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.0:I
        //    12: ifeq            429
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            421
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/launcher/LoadingPluginImpl.mf:Ljava/io/File;
        //    27: getstatic       dev/nuker/pyro/dc.1:I
        //    30: ifge            44
        //    33: ldc2_w          -524661652
        //    36: l2i            
        //    37: ldc_w           -1230680714
        //    40: ixor           
        //    41: goto            52
        //    44: ldc2_w          -1108371360
        //    47: l2i            
        //    48: ldc_w           -2119905156
        //    51: ixor           
        //    52: ldc2_w          -197083010
        //    55: l2i            
        //    56: ldc_w           -920609015
        //    59: ixor           
        //    60: ixor           
        //    61: lookupswitch {
        //          -2109322585: 44
        //          1803509357: 404
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    95: goto            99
        //    98: athrow         
        //    99: getstatic       dev/nuker/pyro/dc.0:I
        //   102: ifgt            116
        //   105: ldc2_w          325211016
        //   108: l2i            
        //   109: ldc_w           -1316954526
        //   112: ixor           
        //   113: goto            124
        //   116: ldc2_w          -1120291720
        //   119: l2i            
        //   120: ldc_w           1994689264
        //   123: ixor           
        //   124: ldc2_w          -3305023
        //   127: l2i            
        //   128: ldc_w           502540481
        //   131: ixor           
        //   132: ixor           
        //   133: lookupswitch {
        //          -1736947990: 116
        //          1088107754: 406
        //          default: 160
        //        }
        //   160: getstatic       java/io/File.separatorChar:C
        //   163: ldc2_w          1069423869
        //   166: l2i            
        //   167: ldc_w           1069423826
        //   170: ixor           
        //   171: getstatic       dev/nuker/pyro/dc.0:I
        //   174: ifgt            188
        //   177: ldc2_w          897718364
        //   180: l2i            
        //   181: ldc_w           -2059609192
        //   184: ixor           
        //   185: goto            196
        //   188: ldc2_w          -1037931342
        //   191: l2i            
        //   192: ldc_w           1218959171
        //   195: ixor           
        //   196: ldc2_w          -450790574
        //   199: l2i            
        //   200: ldc_w           -1772355284
        //   203: ixor           
        //   204: ixor           
        //   205: lookupswitch {
        //          -1010583110: 410
        //          -452471858: 188
        //          default: 232
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   239: goto            243
        //   242: athrow         
        //   243: astore_1        /* path */
        //   244: new             Ljava/lang/StringBuilder;
        //   247: dup            
        //   248: goto            252
        //   251: athrow         
        //   252: invokespecial   java/lang/StringBuilder.<init>:()V
        //   255: goto            259
        //   258: athrow         
        //   259: aload_1         /* path */
        //   260: ldc_w           "/"
        //   263: goto            267
        //   266: athrow         
        //   267: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   270: goto            274
        //   273: athrow         
        //   274: ifeq            294
        //   277: ldc_w           "\ubf27\uaf5b\ub51e\u9584\u451f"
        //   280: goto            284
        //   283: athrow         
        //   284: invokestatic    invokestatic   !!! ERROR
        //   287: goto            291
        //   290: athrow         
        //   291: goto            308
        //   294: ldc_w           "\ubf27\uaf5b\ub51e\u9584\u451f\u369e"
        //   297: goto            301
        //   300: athrow         
        //   301: invokestatic    invokestatic   !!! ERROR
        //   304: goto            308
        //   307: athrow         
        //   308: goto            312
        //   311: athrow         
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: goto            319
        //   318: athrow         
        //   319: getstatic       dev/nuker/pyro/dc.1:I
        //   322: ifge            336
        //   325: ldc2_w          699137394
        //   328: l2i            
        //   329: ldc_w           -982017021
        //   332: ixor           
        //   333: goto            344
        //   336: ldc2_w          -1187645018
        //   339: l2i            
        //   340: ldc_w           645829559
        //   343: ixor           
        //   344: ldc2_w          107647469
        //   347: l2i            
        //   348: ldc_w           -1438411221
        //   351: ixor           
        //   352: ixor           
        //   353: lookupswitch {
        //          -6814024: 336
        //          1089824439: 408
        //          default: 380
        //        }
        //   380: aload_1         /* path */
        //   381: goto            385
        //   384: athrow         
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: goto            392
        //   391: athrow         
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   399: goto            403
        //   402: athrow         
        //   403: areturn        
        //   404: aconst_null    
        //   405: athrow         
        //   406: aconst_null    
        //   407: athrow         
        //   408: aconst_null    
        //   409: athrow         
        //   410: aconst_null    
        //   411: athrow         
        //   412: pop            
        //   413: goto            24
        //   416: pop            
        //   417: aconst_null    
        //   418: goto            412
        //   421: dup            
        //   422: ifnull          412
        //   425: checkcast       Ljava/lang/Throwable;
        //   428: athrow         
        //   429: dup            
        //   430: ifnull          416
        //   433: checkcast       Ljava/lang/Throwable;
        //   436: athrow         
        //   437: aconst_null    
        //   438: athrow         
        //    StackMapTable: 00 3E 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 02 53 07 00 B2 FF 00 07 00 01 07 00 02 00 02 07 00 B2 01 63 07 00 B2 42 07 00 25 40 07 00 B2 45 07 00 25 40 07 00 2D 50 07 00 2D FF 00 07 00 01 07 00 02 00 02 07 00 2D 01 63 07 00 2D FF 00 1B 00 01 07 00 02 00 03 07 00 2D 01 01 FF 00 07 00 01 07 00 02 00 04 07 00 2D 01 01 01 FF 00 23 00 01 07 00 02 00 03 07 00 2D 01 01 42 07 00 25 FF 00 00 00 01 07 00 02 00 03 07 00 2D 01 01 45 07 00 25 40 07 00 2D FF 00 07 00 02 07 00 02 07 00 2D 00 01 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 08 00 F4 08 00 F4 45 07 00 25 40 07 01 4A 46 07 00 1B FF 00 00 00 02 07 00 02 07 00 2D 00 03 07 01 4A 07 00 2D 07 00 2D 45 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 01 48 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 45 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 42 07 01 4A FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 45 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 42 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 45 07 00 25 40 07 01 4A 50 07 01 4A FF 00 07 00 02 07 00 02 07 00 2D 00 02 07 01 4A 01 63 07 01 4A 43 07 00 25 FF 00 00 00 02 07 00 02 07 00 2D 00 02 07 01 4A 07 00 2D 45 07 00 25 40 07 01 4A 42 07 00 19 40 07 01 4A 45 07 00 25 40 07 00 2D FF 00 00 00 01 07 00 02 00 01 07 00 B2 41 07 00 2D FF 00 01 00 02 07 00 02 07 00 2D 00 01 07 01 4A FF 00 01 00 01 07 00 02 00 03 07 00 2D 01 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     421    429    Any
        //  421    429    421    429    Any
        //  437    439    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  91     98     98     99     Any
        //  91     98     98     99     Any
        //  92     98     91     92     Any
        //  91     98     91     92     Ljava/lang/UnsupportedOperationException;
        //  92     98     91     92     Ljava/lang/RuntimeException;
        //  235    242    242    243    Any
        //  236    242    242    243    Any
        //  235    242    3      8      Ljava/lang/NumberFormatException;
        //  235    242    235    236    Any
        //  235    242    235    236    Ljava/lang/ArithmeticException;
        //  251    258    258    259    Any
        //  251    258    251    252    Any
        //  251    258    258    259    Ljava/lang/IndexOutOfBoundsException;
        //  251    258    3      8      Ljava/lang/AssertionError;
        //  252    258    258    259    Any
        //  266    273    273    274    Any
        //  266    273    273    274    Any
        //  267    273    266    267    Ljava/lang/NumberFormatException;
        //  266    273    3      8      Ljava/util/ConcurrentModificationException;
        //  266    273    273    274    Any
        //  283    290    290    291    Any
        //  283    290    3      8      Any
        //  284    290    3      8      Any
        //  283    290    3      8      Any
        //  283    290    283    284    Any
        //  301    307    307    308    Any
        //  301    307    307    308    Ljava/util/ConcurrentModificationException;
        //  301    307    307    308    Any
        //  301    307    3      8      Any
        //  301    307    307    308    Ljava/lang/IllegalArgumentException;
        //  311    318    318    319    Any
        //  312    318    311    312    Ljava/lang/AssertionError;
        //  312    318    311    312    Ljava/lang/ClassCastException;
        //  311    318    3      8      Ljava/util/ConcurrentModificationException;
        //  311    318    311    312    Ljava/lang/NegativeArraySizeException;
        //  384    391    391    392    Any
        //  385    391    3      8      Ljava/lang/NegativeArraySizeException;
        //  385    391    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  384    391    391    392    Any
        //  385    391    384    385    Any
        //  395    402    402    403    Any
        //  395    402    402    403    Ljava/lang/NullPointerException;
        //  395    402    3      8      Any
        //  396    402    395    396    Ljava/lang/UnsupportedOperationException;
        //  395    402    402    403    Any
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
    
    @Override
    public boolean shouldApplyMixin(final String targetClassName, final String mixinClassName) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0042:
            while (true) {
                do {
                    Label_0029: {
                        break Label_0029;
                        try {
                            o = null;
                            if (dc.c != 0) {
                                null;
                                goto Label_0034;
                            }
                            continue Label_0042;
                            return ((int)(-203355084L) ^ 0xF3E10C34) != 0x0;
                        }
                        catch (NoSuchElementException ex) {}
                    }
                    continue Label_0042;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @Override
    public void acceptTargets(final Set myTargets, final Set otherTargets) {
        Object o = null;
        Block_0: {
            break Block_0;
            do {
                return;
                try {
                    o = null;
                    if (dc.0 == 0) {
                        continue;
                    }
                    null;
                    return;
                }
                catch (NegativeArraySizeException ex) {
                    if (ex != null) {
                        throw ex;
                    }
                    return;
                }
            } while (o == null);
        }
        throw (Throwable)o;
    }
    
    @Override
    public List getMixins() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0037:
            while (true) {
                do {
                    Label_0024: {
                        break Label_0024;
                        try {
                            o = null;
                            if (dc.c == 0) {
                                continue Label_0037;
                            }
                            null;
                            return MixinPlugin.mixins;
                            return MixinPlugin.mixins;
                        }
                        catch (ArithmeticException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return MixinPlugin.mixins;
                        }
                    }
                    continue Label_0037;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
}
