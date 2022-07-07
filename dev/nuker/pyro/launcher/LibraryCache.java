// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import java.io.File;
import java.util.Map;
import java.lang.reflect.Field;

public class LibraryCache
{
    public static Field field;
    
    public static Map getResourceCache() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          324
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.0:I
        //    12: ifeq            316
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            308
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/launcher/LibraryCache.field:Ljava/lang/reflect/Field;
        //    27: ifnonnull       40
        //    30: ldc2_w          -1551418332
        //    33: l2i            
        //    34: ldc             -451407165
        //    36: ixor           
        //    37: goto            47
        //    40: ldc2_w          1051933729
        //    43: l2i            
        //    44: ldc             2016154309
        //    46: ixor           
        //    47: ldc2_w          -1912596780
        //    50: l2i            
        //    51: ldc             1653426422
        //    53: ixor           
        //    54: ixor           
        //    55: tableswitch {
        //          1411703178: 76
        //          1411703179: 200
        //          default: 30
        //        }
        //    76: ldc             Lnet/minecraft/launchwrapper/LaunchClassLoader;.class
        //    78: ldc             "\uc1e8\uaf57\ucbda\ud730\u9509\u4818\udcd0\u0519\u706a\u1c55\u8dda\ue489\u9cbf"
        //    80: goto            84
        //    83: athrow         
        //    84: invokestatic    invokestatic   !!! ERROR
        //    87: goto            91
        //    90: athrow         
        //    91: goto            95
        //    94: athrow         
        //    95: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    98: goto            102
        //   101: athrow         
        //   102: getstatic       dev/nuker/pyro/dc.0:I
        //   105: ifgt            118
        //   108: ldc2_w          530628259
        //   111: l2i            
        //   112: ldc             -1620123072
        //   114: ixor           
        //   115: goto            125
        //   118: ldc2_w          -1935059447
        //   121: l2i            
        //   122: ldc             -1935572910
        //   124: ixor           
        //   125: ldc2_w          -1178086627
        //   128: l2i            
        //   129: ldc             -259826822
        //   131: ixor           
        //   132: ixor           
        //   133: lookupswitch {
        //          -913648508: 118
        //          1229741628: 160
        //          default: 295
        //        }
        //   160: putstatic       dev/nuker/pyro/launcher/LibraryCache.field:Ljava/lang/reflect/Field;
        //   163: getstatic       dev/nuker/pyro/launcher/LibraryCache.field:Ljava/lang/reflect/Field;
        //   166: ldc2_w          2102749578
        //   169: l2i            
        //   170: ldc             2102749579
        //   172: ixor           
        //   173: goto            177
        //   176: athrow         
        //   177: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   180: goto            184
        //   183: athrow         
        //   184: goto            200
        //   187: astore_0        /* e */
        //   188: aload_0         /* e */
        //   189: goto            193
        //   192: athrow         
        //   193: invokevirtual   java/lang/NoSuchFieldException.printStackTrace:()V
        //   196: goto            200
        //   199: athrow         
        //   200: getstatic       dev/nuker/pyro/launcher/LibraryCache.field:Ljava/lang/reflect/Field;
        //   203: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   206: goto            210
        //   209: athrow         
        //   210: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   213: goto            217
        //   216: athrow         
        //   217: checkcast       Ljava/util/Map;
        //   220: areturn        
        //   221: getstatic       dev/nuker/pyro/dc.1:I
        //   224: ifge            237
        //   227: ldc2_w          1087502152
        //   230: l2i            
        //   231: ldc             -2104364760
        //   233: ixor           
        //   234: goto            244
        //   237: ldc2_w          -1598723584
        //   240: l2i            
        //   241: ldc             286068020
        //   243: ixor           
        //   244: ldc2_w          -1683044754
        //   247: l2i            
        //   248: ldc             282550174
        //   250: ixor           
        //   251: ixor           
        //   252: lookupswitch {
        //          985792196: 280
        //          1228513168: 237
        //          default: 297
        //        }
        //   280: astore_0        /* e */
        //   281: aload_0         /* e */
        //   282: goto            286
        //   285: athrow         
        //   286: invokevirtual   java/lang/IllegalAccessException.printStackTrace:()V
        //   289: goto            293
        //   292: athrow         
        //   293: aconst_null    
        //   294: areturn        
        //   295: aconst_null    
        //   296: athrow         
        //   297: aconst_null    
        //   298: athrow         
        //   299: pop            
        //   300: goto            24
        //   303: pop            
        //   304: aconst_null    
        //   305: goto            299
        //   308: dup            
        //   309: ifnull          299
        //   312: checkcast       Ljava/lang/Throwable;
        //   315: athrow         
        //   316: dup            
        //   317: ifnull          303
        //   320: checkcast       Ljava/lang/Throwable;
        //   323: athrow         
        //   324: aconst_null    
        //   325: athrow         
        //    StackMapTable: 00 2F 43 07 00 25 04 4B 07 00 25 03 05 09 46 01 1C 46 07 00 25 FF 00 00 00 00 00 02 07 00 3B 07 00 73 45 07 00 25 FF 00 00 00 00 00 02 07 00 3B 07 00 73 42 07 00 25 FF 00 00 00 00 00 02 07 00 3B 07 00 73 45 07 00 25 40 07 00 4D 4F 07 00 4D FF 00 06 00 00 00 02 07 00 4D 01 62 07 00 4D 4F 07 00 13 FF 00 00 00 00 00 02 07 00 4D 01 45 07 00 25 00 42 07 00 0B FF 00 04 00 01 07 00 0B 00 01 07 00 25 40 07 00 0B 45 07 00 25 FA 00 00 48 07 00 25 FF 00 00 00 00 00 02 07 00 4D 07 00 32 45 07 00 25 40 07 00 05 43 07 00 0D 4F 07 00 0D FF 00 06 00 00 00 02 07 00 0D 01 63 07 00 0D 44 07 00 25 FF 00 00 00 01 07 00 0D 00 01 07 00 0D 45 07 00 25 00 FF 00 01 00 00 00 01 07 00 4D 41 07 00 0D 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  76     94     187    200    Ljava/lang/NoSuchFieldException;
        //  95     184    187    200    Ljava/lang/NoSuchFieldException;
        //  200    220    221    295    Ljava/lang/IllegalAccessException;
        //  8      20     308    316    Any
        //  308    316    308    316    Any
        //  324    326    3      8      Any
        //  83     90     90     91     Any
        //  84     90     83     84     Ljava/lang/IndexOutOfBoundsException;
        //  84     90     3      8      Any
        //  83     90     83     84     Any
        //  84     90     90     91     Ljava/lang/StringIndexOutOfBoundsException;
        //  95     101    101    102    Any
        //  95     101    3      8      Any
        //  95     101    101    102    Any
        //  95     101    3      8      Any
        //  95     101    101    102    Ljava/lang/IndexOutOfBoundsException;
        //  176    183    183    184    Any
        //  176    183    176    177    Ljava/lang/EnumConstantNotPresentException;
        //  177    183    183    184    Any
        //  177    183    183    184    Any
        //  177    183    183    184    Ljava/lang/UnsupportedOperationException;
        //  192    199    199    200    Any
        //  193    199    3      8      Any
        //  193    199    192    193    Any
        //  192    199    192    193    Any
        //  193    199    199    200    Any
        //  209    216    216    217    Any
        //  209    216    209    210    Any
        //  210    216    3      8      Ljava/lang/IllegalStateException;
        //  209    216    3      8      Ljava/util/NoSuchElementException;
        //  209    216    209    210    Ljava/lang/IllegalArgumentException;
        //  286    292    292    293    Any
        //  286    292    3      8      Any
        //  286    292    292    293    Any
        //  286    292    3      8      Ljava/lang/UnsupportedOperationException;
        //  286    292    3      8      Ljava/lang/RuntimeException;
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
        LibraryCache.field = null;
    }
    
    public static void initLibrary(final File file) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1084
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.c:I
        //    12: ifeq            1076
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1068
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    dev/nuker/pyro/launcher/LibraryCache.getResourceCache:()Ljava/util/Map;
        //    31: goto            35
        //    34: athrow         
        //    35: astore_1        /* resourceCache */
        //    36: new             Ljava/util/zip/ZipFile;
        //    39: dup            
        //    40: aload_0         /* file */
        //    41: goto            45
        //    44: athrow         
        //    45: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;)V
        //    48: goto            52
        //    51: athrow         
        //    52: getstatic       dev/nuker/pyro/dc.c:I
        //    55: ifne            68
        //    58: ldc2_w          -1770173668
        //    61: l2i            
        //    62: ldc             -475180648
        //    64: ixor           
        //    65: goto            75
        //    68: ldc2_w          -618015835
        //    71: l2i            
        //    72: ldc             1737068387
        //    74: ixor           
        //    75: ldc2_w          1683554408
        //    78: l2i            
        //    79: ldc             1631590499
        //    81: ixor           
        //    82: ixor           
        //    83: lookupswitch {
        //          -1304580893: 68
        //          1892221583: 1057
        //          default: 108
        //        }
        //   108: astore_2        /* zipFile */
        //   109: getstatic       dev/nuker/pyro/dc.c:I
        //   112: ifne            125
        //   115: ldc2_w          2140181797
        //   118: l2i            
        //   119: ldc             839209077
        //   121: ixor           
        //   122: goto            132
        //   125: ldc2_w          -48055120
        //   128: l2i            
        //   129: ldc             308357292
        //   131: ixor           
        //   132: ldc2_w          -67388205
        //   135: l2i            
        //   136: ldc             126197768
        //   138: ixor           
        //   139: ixor           
        //   140: lookupswitch {
        //          -1929404844: 125
        //          -1309943413: 1051
        //          default: 168
        //        }
        //   168: aload_2         /* zipFile */
        //   169: goto            173
        //   172: athrow         
        //   173: invokevirtual   java/util/zip/ZipFile.entries:()Ljava/util/Enumeration;
        //   176: goto            180
        //   179: athrow         
        //   180: getstatic       dev/nuker/pyro/dc.1:I
        //   183: ifge            196
        //   186: ldc2_w          775804304
        //   189: l2i            
        //   190: ldc             -938082410
        //   192: ixor           
        //   193: goto            203
        //   196: ldc2_w          933023799
        //   199: l2i            
        //   200: ldc             252169142
        //   202: ixor           
        //   203: ldc2_w          631183957
        //   206: l2i            
        //   207: ldc             -1233679238
        //   209: ixor           
        //   210: ixor           
        //   211: lookupswitch {
        //          -1418490450: 236
        //          1975565353: 196
        //          default: 1047
        //        }
        //   236: astore_3        /* entries */
        //   237: aload_3         /* entries */
        //   238: goto            242
        //   241: athrow         
        //   242: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   247: goto            251
        //   250: athrow         
        //   251: ifeq            264
        //   254: ldc2_w          -1715588110
        //   257: l2i            
        //   258: ldc             -1790259094
        //   260: ixor           
        //   261: goto            271
        //   264: ldc2_w          -344281725
        //   267: l2i            
        //   268: ldc             -410104294
        //   270: ixor           
        //   271: ldc2_w          -689127623
        //   274: l2i            
        //   275: ldc             1082613227
        //   277: ixor           
        //   278: ixor           
        //   279: tableswitch {
        //          893256340: 300
        //          893256341: 961
        //          default: 254
        //        }
        //   300: aload_3         /* entries */
        //   301: getstatic       dev/nuker/pyro/dc.1:I
        //   304: ifge            317
        //   307: ldc2_w          -243751348
        //   310: l2i            
        //   311: ldc             -51589927
        //   313: ixor           
        //   314: goto            324
        //   317: ldc2_w          -1829121614
        //   320: l2i            
        //   321: ldc             -585045072
        //   323: ixor           
        //   324: ldc2_w          1996495006
        //   327: l2i            
        //   328: ldc             825427379
        //   330: ixor           
        //   331: ixor           
        //   332: lookupswitch {
        //          -1307006396: 317
        //          1269266360: 1053
        //          default: 360
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   369: goto            373
        //   372: athrow         
        //   373: checkcast       Ljava/util/zip/ZipEntry;
        //   376: astore          entry
        //   378: aload           entry
        //   380: goto            384
        //   383: athrow         
        //   384: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   387: goto            391
        //   390: athrow         
        //   391: getstatic       dev/nuker/pyro/dc.0:I
        //   394: ifgt            407
        //   397: ldc2_w          -1379224747
        //   400: l2i            
        //   401: ldc             2026095655
        //   403: ixor           
        //   404: goto            414
        //   407: ldc2_w          -325877739
        //   410: l2i            
        //   411: ldc             649836740
        //   413: ixor           
        //   414: ldc2_w          -813579909
        //   417: l2i            
        //   418: ldc             177386642
        //   420: ixor           
        //   421: ixor           
        //   422: lookupswitch {
        //          -1761673673: 407
        //          270140059: 1039
        //          default: 448
        //        }
        //   448: astore          name
        //   450: aload           name
        //   452: ldc             "\uc1b4\uaf51\ucbc5\u42eb\u0220\u4819"
        //   454: goto            458
        //   457: athrow         
        //   458: invokestatic    invokestatic   !!! ERROR
        //   461: goto            465
        //   464: athrow         
        //   465: getstatic       dev/nuker/pyro/dc.0:I
        //   468: ifgt            481
        //   471: ldc2_w          -592768302
        //   474: l2i            
        //   475: ldc             1665478530
        //   477: ixor           
        //   478: goto            488
        //   481: ldc2_w          1721359864
        //   484: l2i            
        //   485: ldc             1050548565
        //   487: ixor           
        //   488: ldc2_w          -605564578
        //   491: l2i            
        //   492: ldc             814167007
        //   494: ixor           
        //   495: ixor           
        //   496: lookupswitch {
        //          1418649553: 1041
        //          1875307710: 481
        //          default: 524
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   531: goto            535
        //   534: athrow         
        //   535: ifeq            548
        //   538: ldc2_w          1243216680
        //   541: l2i            
        //   542: ldc             -1195857339
        //   544: ixor           
        //   545: goto            555
        //   548: ldc2_w          2001919642
        //   551: l2i            
        //   552: ldc             -2047635466
        //   554: ixor           
        //   555: ldc2_w          -1693375979
        //   558: l2i            
        //   559: ldc             -198838800
        //   561: ixor           
        //   562: ixor           
        //   563: tableswitch {
        //          992677136: 584
        //          992677137: 958
        //          default: 538
        //        }
        //   584: aload           name
        //   586: ldc2_w          -841804846
        //   589: l2i            
        //   590: ldc             -841804846
        //   592: ixor           
        //   593: getstatic       dev/nuker/pyro/dc.1:I
        //   596: ifge            609
        //   599: ldc2_w          -1079064248
        //   602: l2i            
        //   603: ldc             2070214261
        //   605: ixor           
        //   606: goto            616
        //   609: ldc2_w          2039047692
        //   612: l2i            
        //   613: ldc             1503637866
        //   615: ixor           
        //   616: ldc2_w          -2121939623
        //   619: l2i            
        //   620: ldc_w           1110718081
        //   623: ixor           
        //   624: ixor           
        //   625: lookupswitch {
        //          125553893: 1043
        //          670707234: 609
        //          default: 652
        //        }
        //   652: aload           name
        //   654: goto            658
        //   657: athrow         
        //   658: invokevirtual   java/lang/String.length:()I
        //   661: goto            665
        //   664: athrow         
        //   665: ldc2_w          419260113
        //   668: l2i            
        //   669: ldc_w           419260119
        //   672: ixor           
        //   673: swap           
        //   674: ldc2_w          -1461849708
        //   677: l2i            
        //   678: ldc_w           1461849707
        //   681: ixor           
        //   682: ixor           
        //   683: iadd           
        //   684: ldc2_w          465570344
        //   687: l2i            
        //   688: ldc_w           -465570345
        //   691: ixor           
        //   692: ixor           
        //   693: goto            697
        //   696: athrow         
        //   697: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   700: goto            704
        //   703: athrow         
        //   704: ldc2_w          1787653769
        //   707: l2i            
        //   708: ldc_w           1787653798
        //   711: ixor           
        //   712: ldc2_w          2007261740
        //   715: l2i            
        //   716: ldc_w           2007261698
        //   719: ixor           
        //   720: getstatic       dev/nuker/pyro/dc.0:I
        //   723: ifgt            737
        //   726: ldc2_w          -1985624100
        //   729: l2i            
        //   730: ldc_w           -562620811
        //   733: ixor           
        //   734: goto            745
        //   737: ldc2_w          1234791312
        //   740: l2i            
        //   741: ldc_w           -1561271163
        //   744: ixor           
        //   745: ldc2_w          -1352658465
        //   748: l2i            
        //   749: ldc_w           1819316888
        //   752: ixor           
        //   753: ixor           
        //   754: lookupswitch {
        //          -1799204114: 1055
        //          -1276099543: 737
        //          default: 780
        //        }
        //   780: goto            784
        //   783: athrow         
        //   784: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   787: goto            791
        //   790: athrow         
        //   791: astore          name
        //   793: aload_2         /* zipFile */
        //   794: aload           entry
        //   796: getstatic       dev/nuker/pyro/dc.c:I
        //   799: ifne            813
        //   802: ldc2_w          -1151062659
        //   805: l2i            
        //   806: ldc_w           -23079284
        //   809: ixor           
        //   810: goto            821
        //   813: ldc2_w          -815512056
        //   816: l2i            
        //   817: ldc_w           -663876099
        //   820: ixor           
        //   821: ldc2_w          167259697
        //   824: l2i            
        //   825: ldc_w           -920518521
        //   828: ixor           
        //   829: ixor           
        //   830: lookupswitch {
        //          -2061380281: 813
        //          -674208445: 856
        //          default: 1037
        //        }
        //   856: goto            860
        //   859: athrow         
        //   860: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   863: goto            867
        //   866: athrow         
        //   867: astore          in
        //   869: aload_1         /* resourceCache */
        //   870: aload           name
        //   872: aload           in
        //   874: goto            878
        //   877: athrow         
        //   878: invokestatic    org/apache/commons/io/IOUtils.toByteArray:(Ljava/io/InputStream;)[B
        //   881: goto            885
        //   884: athrow         
        //   885: getstatic       dev/nuker/pyro/dc.1:I
        //   888: ifge            902
        //   891: ldc2_w          -1551112156
        //   894: l2i            
        //   895: ldc_w           880303972
        //   898: ixor           
        //   899: goto            910
        //   902: ldc2_w          -1541638481
        //   905: l2i            
        //   906: ldc_w           -1357420532
        //   909: ixor           
        //   910: ldc2_w          726967257
        //   913: l2i            
        //   914: ldc_w           13111766
        //   917: ixor           
        //   918: ixor           
        //   919: lookupswitch {
        //          -1133574833: 1045
        //          -496027693: 902
        //          default: 944
        //        }
        //   944: goto            948
        //   947: athrow         
        //   948: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   953: goto            957
        //   956: athrow         
        //   957: pop            
        //   958: goto            237
        //   961: goto            1036
        //   964: astore_1        /* e */
        //   965: getstatic       dev/nuker/pyro/dc.1:I
        //   968: ifge            982
        //   971: ldc2_w          -1558868103
        //   974: l2i            
        //   975: ldc_w           1186092441
        //   978: ixor           
        //   979: goto            990
        //   982: ldc2_w          -1361022976
        //   985: l2i            
        //   986: ldc_w           252205795
        //   989: ixor           
        //   990: ldc2_w          -2029971969
        //   993: l2i            
        //   994: ldc_w           1623368644
        //   997: ixor           
        //   998: ixor           
        //   999: lookupswitch {
        //          -1520962448: 982
        //          40135899: 1049
        //          default: 1024
        //        }
        //  1024: aload_1         /* e */
        //  1025: goto            1029
        //  1028: athrow         
        //  1029: invokevirtual   java/io/IOException.printStackTrace:()V
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: return         
        //  1037: aconst_null    
        //  1038: athrow         
        //  1039: aconst_null    
        //  1040: athrow         
        //  1041: aconst_null    
        //  1042: athrow         
        //  1043: aconst_null    
        //  1044: athrow         
        //  1045: aconst_null    
        //  1046: athrow         
        //  1047: aconst_null    
        //  1048: athrow         
        //  1049: aconst_null    
        //  1050: athrow         
        //  1051: aconst_null    
        //  1052: athrow         
        //  1053: aconst_null    
        //  1054: athrow         
        //  1055: aconst_null    
        //  1056: athrow         
        //  1057: aconst_null    
        //  1058: athrow         
        //  1059: pop            
        //  1060: goto            24
        //  1063: pop            
        //  1064: aconst_null    
        //  1065: goto            1059
        //  1068: dup            
        //  1069: ifnull          1059
        //  1072: checkcast       Ljava/lang/Throwable;
        //  1075: athrow         
        //  1076: dup            
        //  1077: ifnull          1063
        //  1080: checkcast       Ljava/lang/Throwable;
        //  1083: athrow         
        //  1084: aconst_null    
        //  1085: athrow         
        //    StackMapTable: 00 7D 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 01 60 42 07 00 25 00 45 07 00 25 40 07 00 61 FF 00 08 00 02 07 01 60 07 00 61 00 01 07 00 25 FF 00 00 00 02 07 01 60 07 00 61 00 03 08 00 24 08 00 24 07 01 60 45 07 00 25 40 07 00 8F 4F 07 00 8F FF 00 06 00 02 07 01 60 07 00 61 00 02 07 00 8F 01 60 07 00 8F FC 00 10 07 00 8F 46 01 23 FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 03 07 01 60 07 00 61 07 00 8F 00 01 07 00 8F 45 07 00 25 40 07 00 B3 4F 07 00 B3 FF 00 06 00 03 07 01 60 07 00 61 07 00 8F 00 02 07 00 B3 01 60 07 00 B3 FC 00 00 07 00 B3 FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 04 07 01 60 07 00 61 07 00 8F 07 00 B3 00 01 07 00 B3 47 07 00 25 40 01 02 09 46 01 1C 50 07 00 B3 FF 00 06 00 04 07 01 60 07 00 61 07 00 8F 07 00 B3 00 02 07 00 B3 01 63 07 00 B3 42 07 00 25 40 07 00 B3 47 07 00 25 40 07 00 05 FF 00 09 00 00 00 01 07 00 25 FF 00 00 00 05 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 00 01 07 00 CF 45 07 00 25 40 07 00 73 4F 07 00 73 FF 00 06 00 05 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 00 02 07 00 73 01 61 07 00 73 FF 00 08 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 01 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 45 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 FF 00 0F 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 FF 00 06 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 07 00 73 01 FF 00 23 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 42 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 45 07 00 25 40 01 02 09 46 01 1C FF 00 18 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 01 FF 00 06 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 FF 00 23 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 01 44 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 07 00 73 45 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 5E 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 45 07 00 25 40 07 00 73 FF 00 20 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 FF 00 07 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 04 07 00 73 01 01 01 FF 00 22 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 42 07 00 25 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 45 07 00 25 40 07 00 73 FF 00 15 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 8F 07 00 CF FF 00 07 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 8F 07 00 CF 01 FF 00 22 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 8F 07 00 CF 42 07 00 88 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 8F 07 00 CF 45 07 00 25 40 07 01 62 FF 00 09 00 00 00 01 07 00 25 FF 00 00 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 62 45 07 00 25 FF 00 00 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 64 FF 00 10 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 64 FF 00 07 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 04 07 00 61 07 00 73 07 01 64 01 FF 00 21 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 64 42 07 00 25 FF 00 00 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 64 47 07 00 25 40 07 00 05 FA 00 00 F9 00 02 FF 00 02 00 01 07 01 60 00 01 07 00 78 FC 00 11 07 00 78 47 01 21 FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 02 07 01 60 07 00 78 00 01 07 00 78 45 07 00 25 FF 00 00 00 02 07 01 60 07 00 05 00 00 FF 00 00 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 8F 07 00 CF FF 00 01 00 05 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 00 01 07 00 73 FF 00 01 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 07 00 73 FF 00 01 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 02 07 00 73 01 FF 00 01 00 07 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 07 01 62 00 03 07 00 61 07 00 73 07 01 64 FF 00 01 00 03 07 01 60 07 00 61 07 00 8F 00 01 07 00 B3 FF 00 01 00 02 07 01 60 07 00 78 00 00 FF 00 01 00 03 07 01 60 07 00 61 07 00 8F 00 00 FF 00 01 00 04 07 01 60 07 00 61 07 00 8F 07 00 B3 00 01 07 00 B3 FF 00 01 00 06 07 01 60 07 00 61 07 00 8F 07 00 B3 07 00 CF 07 00 73 00 03 07 00 73 01 01 FF 00 01 00 02 07 01 60 07 00 61 00 01 07 00 8F FF 00 01 00 01 07 01 60 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     172    964    1036   Ljava/io/IOException;
        //  173    241    964    1036   Ljava/io/IOException;
        //  242    383    964    1036   Ljava/io/IOException;
        //  384    877    964    1036   Ljava/io/IOException;
        //  878    961    964    1036   Ljava/io/IOException;
        //  8      20     1068   1076   Ljava/lang/NullPointerException;
        //  1068   1076   1068   1076   Any
        //  1084   1086   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  27     34     34     35     Any
        //  28     34     27     28     Any
        //  27     34     34     35     Ljava/lang/RuntimeException;
        //  27     34     34     35     Ljava/util/ConcurrentModificationException;
        //  27     34     3      8      Any
        //  44     51     51     52     Any
        //  44     51     44     45     Any
        //  44     51     3      8      Any
        //  44     51     3      8      Ljava/util/ConcurrentModificationException;
        //  44     51     44     45     Ljava/lang/RuntimeException;
        //  173    179    179    180    Any
        //  173    179    179    180    Any
        //  173    179    179    180    Any
        //  173    179    3      8      Any
        //  173    179    179    180    Ljava/lang/NullPointerException;
        //  242    250    250    251    Any
        //  242    250    250    251    Any
        //  242    250    250    251    Any
        //  242    250    3      8      Any
        //  242    250    250    251    Ljava/lang/NegativeArraySizeException;
        //  363    372    372    373    Any
        //  363    372    372    373    Ljava/lang/ArithmeticException;
        //  363    372    363    364    Any
        //  363    372    372    373    Any
        //  364    372    372    373    Any
        //  384    390    390    391    Any
        //  384    390    3      8      Ljava/lang/AssertionError;
        //  384    390    390    391    Ljava/lang/NegativeArraySizeException;
        //  384    390    390    391    Ljava/lang/StringIndexOutOfBoundsException;
        //  384    390    390    391    Any
        //  457    464    464    465    Any
        //  458    464    3      8      Any
        //  457    464    457    458    Any
        //  458    464    464    465    Ljava/lang/NumberFormatException;
        //  458    464    464    465    Any
        //  527    534    534    535    Any
        //  528    534    3      8      Ljava/lang/IllegalArgumentException;
        //  528    534    527    528    Any
        //  528    534    527    528    Any
        //  527    534    3      8      Any
        //  657    664    664    665    Any
        //  657    664    3      8      Any
        //  657    664    657    658    Ljava/lang/ClassCastException;
        //  658    664    657    658    Any
        //  657    664    664    665    Any
        //  696    703    703    704    Any
        //  697    703    696    697    Any
        //  696    703    696    697    Ljava/lang/NegativeArraySizeException;
        //  697    703    703    704    Any
        //  697    703    3      8      Any
        //  783    790    790    791    Any
        //  784    790    783    784    Any
        //  783    790    790    791    Ljava/lang/AssertionError;
        //  784    790    790    791    Ljava/lang/IndexOutOfBoundsException;
        //  783    790    783    784    Any
        //  859    866    866    867    Any
        //  859    866    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  859    866    3      8      Ljava/lang/IllegalArgumentException;
        //  860    866    866    867    Ljava/lang/UnsupportedOperationException;
        //  860    866    859    860    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  878    884    884    885    Any
        //  878    884    3      8      Ljava/util/NoSuchElementException;
        //  878    884    884    885    Ljava/lang/StringIndexOutOfBoundsException;
        //  878    884    3      8      Ljava/lang/NegativeArraySizeException;
        //  878    884    3      8      Any
        //  947    956    956    957    Any
        //  948    956    947    948    Any
        //  948    956    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  948    956    947    948    Any
        //  948    956    947    948    Ljava/util/NoSuchElementException;
        //  1029   1035   1035   1036   Any
        //  1029   1035   1035   1036   Ljava/lang/IllegalArgumentException;
        //  1029   1035   1035   1036   Any
        //  1029   1035   1035   1036   Ljava/lang/IndexOutOfBoundsException;
        //  1029   1035   1035   1036   Ljava/util/ConcurrentModificationException;
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
}
