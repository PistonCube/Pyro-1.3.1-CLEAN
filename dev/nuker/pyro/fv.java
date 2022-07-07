// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.concurrent.ConcurrentLinkedQueue;

public class fV
{
    public ConcurrentLinkedQueue<fH> c;
    public ConcurrentLinkedQueue<f49> 0;
    public static fV c;
    
    static {
        final fV c = new fV();
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.1 != 0) {
                    n = -2125335614;
                    break Label_0020;
                }
                n = -1849778206;
            }
            switch (n ^ 0x743397C) {
                case -2045588802: {
                    continue;
                }
                case -1761761634: {
                    fV.c = c;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public fV() {
        this.c = new ConcurrentLinkedQueue<fH>();
        this.0 = new ConcurrentLinkedQueue<f49>();
    }
    
    public void c(final f49 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          221
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            213
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            205
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -1781357592
        //    32: goto            37
        //    35: ldc             -212918603
        //    37: ldc             -1396336175
        //    39: ixor           
        //    40: lookupswitch {
        //          957823545: 35
        //          1602914148: 68
        //          default: 190
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/fV.0:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //    72: aload_1        
        //    73: getstatic       dev/nuker/pyro/fc.c:I
        //    76: ifge            84
        //    79: ldc             -1494922292
        //    81: goto            86
        //    84: ldc             -1344143954
        //    86: ldc             -444328675
        //    88: ixor           
        //    89: lookupswitch {
        //          -1210863161: 84
        //          1130454737: 194
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.contains:(Ljava/lang/Object;)Z
        //   123: goto            127
        //   126: athrow         
        //   127: ifne            189
        //   130: getstatic       dev/nuker/pyro/fc.c:I
        //   133: ifge            141
        //   136: ldc             8155558
        //   138: goto            143
        //   141: ldc             -59158814
        //   143: ldc             -1473806398
        //   145: ixor           
        //   146: lookupswitch {
        //          -1470427548: 192
        //          -535064169: 141
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getfield        dev/nuker/pyro/fV.0:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   176: aload_1        
        //   177: goto            181
        //   180: athrow         
        //   181: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //   184: goto            188
        //   187: athrow         
        //   188: pop            
        //   189: return         
        //   190: aconst_null    
        //   191: athrow         
        //   192: aconst_null    
        //   193: athrow         
        //   194: aconst_null    
        //   195: athrow         
        //   196: pop            
        //   197: goto            24
        //   200: pop            
        //   201: aconst_null    
        //   202: goto            196
        //   205: dup            
        //   206: ifnull          196
        //   209: checkcast       Ljava/lang/Throwable;
        //   212: athrow         
        //   213: dup            
        //   214: ifnull          200
        //   217: checkcast       Ljava/lang/Throwable;
        //   220: athrow         
        //   221: aconst_null    
        //   222: athrow         
        //    StackMapTable: 00 1E 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FD 00 03 07 00 03 07 00 44 0A 41 01 1E FF 00 0F 00 02 07 00 03 07 00 44 00 02 07 00 1E 07 00 44 FF 00 01 00 02 07 00 03 07 00 44 00 03 07 00 1E 07 00 44 01 FF 00 1D 00 02 07 00 03 07 00 44 00 02 07 00 1E 07 00 44 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 44 00 02 07 00 1E 07 00 44 45 07 00 32 40 01 0D 41 01 1C 47 07 00 32 FF 00 00 00 02 07 00 03 07 00 44 00 02 07 00 1E 07 00 44 45 07 00 32 40 01 00 00 01 FF 00 01 00 02 07 00 03 07 00 44 00 02 07 00 1E 07 00 44 41 07 00 32 43 05 44 07 00 32 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     205    213    Ljava/lang/UnsupportedOperationException;
        //  205    213    205    213    Any
        //  221    223    3      8      Any
        //  119    126    126    127    Any
        //  120    126    119    120    Ljava/lang/IllegalStateException;
        //  120    126    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  119    126    3      8      Ljava/lang/NegativeArraySizeException;
        //  119    126    3      8      Ljava/util/NoSuchElementException;
        //  180    187    187    188    Any
        //  180    187    180    181    Any
        //  181    187    3      8      Any
        //  180    187    187    188    Any
        //  180    187    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 72 out of bounds for length 72
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
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1862
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1854
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1846
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             846116982
        //    32: goto            37
        //    35: ldc             1723438149
        //    37: ldc             1947116585
        //    39: ixor           
        //    40: lookupswitch {
        //          777253662: 35
        //          1180703839: 1815
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/Pyro.FOLDER:Ljava/io/File;
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   java/io/File.mkdirs:()Z
        //    78: goto            82
        //    81: athrow         
        //    82: pop            
        //    83: getstatic       dev/nuker/pyro/Pyro.MODULESFOLDER:Ljava/io/File;
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   java/io/File.mkdirs:()Z
        //    93: goto            97
        //    96: athrow         
        //    97: pop            
        //    98: getstatic       dev/nuker/pyro/fc.1:I
        //   101: ifeq            109
        //   104: ldc             -1684356523
        //   106: goto            111
        //   109: ldc             504432240
        //   111: ldc             347408608
        //   113: ixor           
        //   114: lookupswitch {
        //          -1892693323: 1801
        //          66788950: 109
        //          default: 140
        //        }
        //   140: getstatic       dev/nuker/pyro/Pyro.HUDMODULESFOLDER:Ljava/io/File;
        //   143: goto            147
        //   146: athrow         
        //   147: invokevirtual   java/io/File.mkdirs:()Z
        //   150: goto            154
        //   153: athrow         
        //   154: pop            
        //   155: aload_0        
        //   156: getfield        dev/nuker/pyro/fV.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   159: goto            163
        //   162: athrow         
        //   163: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //   166: goto            170
        //   169: athrow         
        //   170: ifne            962
        //   173: new             Lcom/google/gson/GsonBuilder;
        //   176: dup            
        //   177: getstatic       dev/nuker/pyro/fc.c:I
        //   180: ifge            188
        //   183: ldc             -1084379406
        //   185: goto            190
        //   188: ldc             1391279211
        //   190: ldc             -1086544359
        //   192: ixor           
        //   193: lookupswitch {
        //          -305030542: 220
        //          6359275: 188
        //          default: 1827
        //        }
        //   220: goto            224
        //   223: athrow         
        //   224: invokespecial   com/google/gson/GsonBuilder.<init>:()V
        //   227: goto            231
        //   230: athrow         
        //   231: getstatic       dev/nuker/pyro/fc.1:I
        //   234: ifeq            242
        //   237: ldc             320883506
        //   239: goto            244
        //   242: ldc             1723146338
        //   244: ldc             1744781136
        //   246: ixor           
        //   247: lookupswitch {
        //          21634866: 272
        //          1960801378: 242
        //          default: 1833
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   com/google/gson/GsonBuilder.setPrettyPrinting:()Lcom/google/gson/GsonBuilder;
        //   279: goto            283
        //   282: athrow         
        //   283: goto            287
        //   286: athrow         
        //   287: invokevirtual   com/google/gson/GsonBuilder.create:()Lcom/google/gson/Gson;
        //   290: goto            294
        //   293: athrow         
        //   294: astore_1       
        //   295: aload_0        
        //   296: getfield        dev/nuker/pyro/fV.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   299: goto            303
        //   302: athrow         
        //   303: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //   306: goto            310
        //   309: athrow         
        //   310: ifne            962
        //   313: aload_0        
        //   314: getfield        dev/nuker/pyro/fV.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   317: goto            321
        //   320: athrow         
        //   321: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
        //   324: goto            328
        //   327: athrow         
        //   328: checkcast       Ldev/nuker/pyro/fH;
        //   331: astore_2       
        //   332: new             Lcom/google/gson/JsonObject;
        //   335: dup            
        //   336: goto            340
        //   339: athrow         
        //   340: invokespecial   com/google/gson/JsonObject.<init>:()V
        //   343: goto            347
        //   346: athrow         
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            358
        //   353: ldc             1428359515
        //   355: goto            360
        //   358: ldc             1668063578
        //   360: ldc             -1179536676
        //   362: ixor           
        //   363: lookupswitch {
        //          -325928057: 1785
        //          627201945: 358
        //          default: 388
        //        }
        //   388: astore_3       
        //   389: getstatic       dev/nuker/pyro/fc.c:I
        //   392: ifge            400
        //   395: ldc             -538011492
        //   397: goto            402
        //   400: ldc             471475296
        //   402: ldc             -629767579
        //   404: ixor           
        //   405: lookupswitch {
        //          93854457: 1793
        //          646713398: 400
        //          default: 432
        //        }
        //   432: aload_3        
        //   433: aload_2        
        //   434: goto            438
        //   437: athrow         
        //   438: invokevirtual   dev/nuker/pyro/fH.1:()Ljava/lang/String;
        //   441: goto            445
        //   444: athrow         
        //   445: aload_2        
        //   446: goto            450
        //   449: athrow         
        //   450: invokevirtual   dev/nuker/pyro/fH.4:()Lcom/google/gson/JsonObject;
        //   453: goto            457
        //   456: athrow         
        //   457: goto            461
        //   460: athrow         
        //   461: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   464: goto            468
        //   467: athrow         
        //   468: new             Ljava/io/FileWriter;
        //   471: dup            
        //   472: new             Ljava/io/File;
        //   475: dup            
        //   476: getstatic       dev/nuker/pyro/Pyro.MODULESFOLDER:Ljava/io/File;
        //   479: new             Ljava/lang/StringBuilder;
        //   482: dup            
        //   483: goto            487
        //   486: athrow         
        //   487: invokespecial   java/lang/StringBuilder.<init>:()V
        //   490: goto            494
        //   493: athrow         
        //   494: aload_2        
        //   495: goto            499
        //   498: athrow         
        //   499: invokevirtual   dev/nuker/pyro/fH.9:()Ljava/lang/String;
        //   502: goto            506
        //   505: athrow         
        //   506: goto            510
        //   509: athrow         
        //   510: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   513: goto            517
        //   516: athrow         
        //   517: ldc             "\u10b2\u1499\ub9fe\ub1c7\ufecc"
        //   519: getstatic       dev/nuker/pyro/fc.c:I
        //   522: ifge            530
        //   525: ldc             -514458606
        //   527: goto            532
        //   530: ldc             -1331364986
        //   532: ldc             -2036867588
        //   534: ixor           
        //   535: lookupswitch {
        //          458247522: 530
        //          1740775918: 1805
        //          default: 560
        //        }
        //   560: goto            564
        //   563: athrow         
        //   564: invokestatic    invokestatic   !!! ERROR
        //   567: goto            571
        //   570: athrow         
        //   571: goto            575
        //   574: athrow         
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: goto            582
        //   581: athrow         
        //   582: getstatic       dev/nuker/pyro/fc.1:I
        //   585: ifeq            593
        //   588: ldc             1058827196
        //   590: goto            595
        //   593: ldc             157490688
        //   595: ldc             1646293621
        //   597: ixor           
        //   598: lookupswitch {
        //          -415399346: 593
        //          1564219849: 1795
        //          default: 624
        //        }
        //   624: goto            628
        //   627: athrow         
        //   628: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   631: goto            635
        //   634: athrow         
        //   635: getstatic       dev/nuker/pyro/fc.0:I
        //   638: ifeq            646
        //   641: ldc             1890370775
        //   643: goto            648
        //   646: ldc             399072698
        //   648: ldc             356346982
        //   650: ixor           
        //   651: lookupswitch {
        //          49557980: 676
        //          1704044721: 646
        //          default: 1809
        //        }
        //   676: goto            680
        //   679: athrow         
        //   680: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   683: goto            687
        //   686: athrow         
        //   687: iconst_0       
        //   688: getstatic       dev/nuker/pyro/fc.1:I
        //   691: ifeq            699
        //   694: ldc             -1247532701
        //   696: goto            701
        //   699: ldc             1634170746
        //   701: ldc             1784314016
        //   703: ixor           
        //   704: lookupswitch {
        //          -2124751250: 699
        //          -536981053: 1835
        //          default: 732
        //        }
        //   732: goto            736
        //   735: athrow         
        //   736: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;Z)V
        //   739: goto            743
        //   742: athrow         
        //   743: astore          4
        //   745: aload_1        
        //   746: getstatic       dev/nuker/pyro/fc.c:I
        //   749: ifge            757
        //   752: ldc             -114871361
        //   754: goto            759
        //   757: ldc             961521196
        //   759: ldc             322648618
        //   761: ixor           
        //   762: lookupswitch {
        //          -367261291: 757
        //          712285190: 788
        //          default: 1821
        //        }
        //   788: aload_3        
        //   789: aload           4
        //   791: getstatic       dev/nuker/pyro/fc.0:I
        //   794: ifeq            802
        //   797: ldc             99924072
        //   799: goto            804
        //   802: ldc             -588139958
        //   804: ldc             -1317227525
        //   806: ixor           
        //   807: lookupswitch {
        //          -1266152557: 802
        //          1837957553: 832
        //          default: 1787
        //        }
        //   832: goto            836
        //   835: athrow         
        //   836: invokevirtual   com/google/gson/Gson.toJson:(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
        //   839: goto            843
        //   842: athrow         
        //   843: aload           4
        //   845: getstatic       dev/nuker/pyro/fc.0:I
        //   848: ifeq            856
        //   851: ldc             1658573166
        //   853: goto            858
        //   856: ldc             -440913249
        //   858: ldc             802927046
        //   860: ixor           
        //   861: lookupswitch {
        //          -899447975: 888
        //          1291870376: 856
        //          default: 1811
        //        }
        //   888: goto            892
        //   891: athrow         
        //   892: invokevirtual   java/io/FileWriter.close:()V
        //   895: goto            899
        //   898: athrow         
        //   899: goto            959
        //   902: astore          4
        //   904: aload           4
        //   906: getstatic       dev/nuker/pyro/fc.0:I
        //   909: ifeq            917
        //   912: ldc             -785917870
        //   914: goto            919
        //   917: ldc             -1741408872
        //   919: ldc             682169441
        //   921: ixor           
        //   922: lookupswitch {
        //          -1331879431: 948
        //          -108082125: 917
        //          default: 1831
        //        }
        //   948: goto            952
        //   951: athrow         
        //   952: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   955: goto            959
        //   958: athrow         
        //   959: goto            295
        //   962: aload_0        
        //   963: getfield        dev/nuker/pyro/fV.0:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   966: goto            970
        //   969: athrow         
        //   970: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //   973: goto            977
        //   976: athrow         
        //   977: ifne            985
        //   980: ldc             1113636002
        //   982: goto            987
        //   985: ldc             1113636003
        //   987: ldc             1176871350
        //   989: ixor           
        //   990: tableswitch {
        //          143276584: 1012
        //          143276585: 1784
        //          default: 980
        //        }
        //  1012: new             Lcom/google/gson/GsonBuilder;
        //  1015: dup            
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: invokespecial   com/google/gson/GsonBuilder.<init>:()V
        //  1023: goto            1027
        //  1026: athrow         
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: invokevirtual   com/google/gson/GsonBuilder.setPrettyPrinting:()Lcom/google/gson/GsonBuilder;
        //  1034: goto            1038
        //  1037: athrow         
        //  1038: goto            1042
        //  1041: athrow         
        //  1042: invokevirtual   com/google/gson/GsonBuilder.create:()Lcom/google/gson/Gson;
        //  1045: goto            1049
        //  1048: athrow         
        //  1049: getstatic       dev/nuker/pyro/fc.0:I
        //  1052: ifeq            1060
        //  1055: ldc             1158013099
        //  1057: goto            1062
        //  1060: ldc             1974227117
        //  1062: ldc             -1215144583
        //  1064: ixor           
        //  1065: lookupswitch {
        //          -712382506: 1060
        //          -224936494: 1789
        //          default: 1092
        //        }
        //  1092: astore_1       
        //  1093: getstatic       dev/nuker/pyro/fc.1:I
        //  1096: ifeq            1104
        //  1099: ldc             1001912202
        //  1101: goto            1106
        //  1104: ldc             1372069650
        //  1106: ldc             126370867
        //  1108: ixor           
        //  1109: lookupswitch {
        //          -89913659: 1104
        //          1010807737: 1797
        //          default: 1136
        //        }
        //  1136: aload_0        
        //  1137: getstatic       dev/nuker/pyro/fc.c:I
        //  1140: ifge            1148
        //  1143: ldc             1423068204
        //  1145: goto            1150
        //  1148: ldc             1273128530
        //  1150: ldc             818629003
        //  1152: ixor           
        //  1153: lookupswitch {
        //          1679361447: 1819
        //          1880718500: 1148
        //          default: 1180
        //        }
        //  1180: getfield        dev/nuker/pyro/fV.0:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1183: getstatic       dev/nuker/pyro/fc.c:I
        //  1186: ifge            1194
        //  1189: ldc             -1822630123
        //  1191: goto            1196
        //  1194: ldc             548320585
        //  1196: ldc             2133801638
        //  1198: ixor           
        //  1199: lookupswitch {
        //          -327948877: 1194
        //          1602326511: 1224
        //          default: 1825
        //        }
        //  1224: goto            1228
        //  1227: athrow         
        //  1228: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: ifne            1784
        //  1238: aload_0        
        //  1239: getfield        dev/nuker/pyro/fV.0:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1242: goto            1246
        //  1245: athrow         
        //  1246: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: checkcast       Ldev/nuker/pyro/f49;
        //  1256: astore_2       
        //  1257: aload_2        
        //  1258: getstatic       dev/nuker/pyro/fc.0:I
        //  1261: ifeq            1269
        //  1264: ldc             1997947987
        //  1266: goto            1271
        //  1269: ldc             -1072859535
        //  1271: ldc             1800211967
        //  1273: ixor           
        //  1274: lookupswitch {
        //          -1421837426: 1300
        //          475744684: 1269
        //          default: 1807
        //        }
        //  1300: goto            1304
        //  1303: athrow         
        //  1304: invokevirtual   dev/nuker/pyro/f49.2:()Lcom/google/gson/JsonObject;
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: astore_3       
        //  1312: new             Ljava/io/FileWriter;
        //  1315: dup            
        //  1316: new             Ljava/io/File;
        //  1319: dup            
        //  1320: getstatic       dev/nuker/pyro/Pyro.HUDMODULESFOLDER:Ljava/io/File;
        //  1323: new             Ljava/lang/StringBuilder;
        //  1326: dup            
        //  1327: goto            1331
        //  1330: athrow         
        //  1331: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1334: goto            1338
        //  1337: athrow         
        //  1338: aload_2        
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: invokevirtual   dev/nuker/pyro/f49.1:()Ljava/lang/String;
        //  1346: goto            1350
        //  1349: athrow         
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1357: goto            1361
        //  1360: athrow         
        //  1361: ldc             "\u10b2\u1499\ub9fe\ub1c7\ufecc"
        //  1363: goto            1367
        //  1366: athrow         
        //  1367: invokestatic    invokestatic   !!! ERROR
        //  1370: goto            1374
        //  1373: athrow         
        //  1374: getstatic       dev/nuker/pyro/fc.c:I
        //  1377: ifge            1385
        //  1380: ldc             989825432
        //  1382: goto            1387
        //  1385: ldc             1734173627
        //  1387: ldc             1144361452
        //  1389: ixor           
        //  1390: lookupswitch {
        //          818339008: 1385
        //          2127173748: 1823
        //          default: 1416
        //        }
        //  1416: goto            1420
        //  1419: athrow         
        //  1420: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1423: goto            1427
        //  1426: athrow         
        //  1427: getstatic       dev/nuker/pyro/fc.c:I
        //  1430: ifge            1438
        //  1433: ldc             637154435
        //  1435: goto            1440
        //  1438: ldc             197778403
        //  1440: ldc             -1129368371
        //  1442: ixor           
        //  1443: lookupswitch {
        //          -1722482610: 1817
        //          830196086: 1438
        //          default: 1468
        //        }
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1475: goto            1479
        //  1478: athrow         
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: iconst_0       
        //  1491: goto            1495
        //  1494: athrow         
        //  1495: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;Z)V
        //  1498: goto            1502
        //  1501: athrow         
        //  1502: astore          4
        //  1504: aload_1        
        //  1505: getstatic       dev/nuker/pyro/fc.1:I
        //  1508: ifeq            1517
        //  1511: ldc_w           -279382057
        //  1514: goto            1520
        //  1517: ldc_w           673262892
        //  1520: ldc_w           -954965407
        //  1523: ixor           
        //  1524: lookupswitch {
        //          -785614320: 1517
        //          676107702: 1803
        //          default: 1552
        //        }
        //  1552: aload_3        
        //  1553: getstatic       dev/nuker/pyro/fc.c:I
        //  1556: ifge            1565
        //  1559: ldc_w           1465774986
        //  1562: goto            1568
        //  1565: ldc_w           -51991057
        //  1568: ldc_w           341899352
        //  1571: ixor           
        //  1572: lookupswitch {
        //          -393849417: 1600
        //          1128074194: 1565
        //          default: 1791
        //        }
        //  1600: aload           4
        //  1602: goto            1606
        //  1605: athrow         
        //  1606: invokevirtual   com/google/gson/Gson.toJson:(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
        //  1609: goto            1613
        //  1612: athrow         
        //  1613: aload           4
        //  1615: getstatic       dev/nuker/pyro/fc.c:I
        //  1618: ifge            1627
        //  1621: ldc_w           -1777527535
        //  1624: goto            1630
        //  1627: ldc_w           -1402945778
        //  1630: ldc_w           1555208678
        //  1633: ixor           
        //  1634: lookupswitch {
        //          -893416201: 1627
        //          -254662936: 1660
        //          default: 1799
        //        }
        //  1660: goto            1664
        //  1663: athrow         
        //  1664: invokevirtual   java/io/FileWriter.close:()V
        //  1667: goto            1671
        //  1670: athrow         
        //  1671: goto            1781
        //  1674: getstatic       dev/nuker/pyro/fc.c:I
        //  1677: ifge            1686
        //  1680: ldc_w           866441853
        //  1683: goto            1689
        //  1686: ldc_w           2089605715
        //  1689: ldc_w           -441684960
        //  1692: ixor           
        //  1693: lookupswitch {
        //          -1725909389: 1720
        //          -704072099: 1686
        //          default: 1829
        //        }
        //  1720: astore          4
        //  1722: getstatic       dev/nuker/pyro/fc.0:I
        //  1725: ifeq            1734
        //  1728: ldc_w           -452402369
        //  1731: goto            1737
        //  1734: ldc_w           -1012690364
        //  1737: ldc_w           -709460859
        //  1740: ixor           
        //  1741: lookupswitch {
        //          370536129: 1768
        //          817799098: 1734
        //          default: 1813
        //        }
        //  1768: aload           4
        //  1770: goto            1774
        //  1773: athrow         
        //  1774: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  1777: goto            1781
        //  1780: athrow         
        //  1781: goto            1093
        //  1784: return         
        //  1785: aconst_null    
        //  1786: athrow         
        //  1787: aconst_null    
        //  1788: athrow         
        //  1789: aconst_null    
        //  1790: athrow         
        //  1791: aconst_null    
        //  1792: athrow         
        //  1793: aconst_null    
        //  1794: athrow         
        //  1795: aconst_null    
        //  1796: athrow         
        //  1797: aconst_null    
        //  1798: athrow         
        //  1799: aconst_null    
        //  1800: athrow         
        //  1801: aconst_null    
        //  1802: athrow         
        //  1803: aconst_null    
        //  1804: athrow         
        //  1805: aconst_null    
        //  1806: athrow         
        //  1807: aconst_null    
        //  1808: athrow         
        //  1809: aconst_null    
        //  1810: athrow         
        //  1811: aconst_null    
        //  1812: athrow         
        //  1813: aconst_null    
        //  1814: athrow         
        //  1815: aconst_null    
        //  1816: athrow         
        //  1817: aconst_null    
        //  1818: athrow         
        //  1819: aconst_null    
        //  1820: athrow         
        //  1821: aconst_null    
        //  1822: athrow         
        //  1823: aconst_null    
        //  1824: athrow         
        //  1825: aconst_null    
        //  1826: athrow         
        //  1827: aconst_null    
        //  1828: athrow         
        //  1829: aconst_null    
        //  1830: athrow         
        //  1831: aconst_null    
        //  1832: athrow         
        //  1833: aconst_null    
        //  1834: athrow         
        //  1835: aconst_null    
        //  1836: athrow         
        //  1837: pop            
        //  1838: goto            24
        //  1841: pop            
        //  1842: aconst_null    
        //  1843: goto            1837
        //  1846: dup            
        //  1847: ifnull          1837
        //  1850: checkcast       Ljava/lang/Throwable;
        //  1853: athrow         
        //  1854: dup            
        //  1855: ifnull          1841
        //  1858: checkcast       Ljava/lang/Throwable;
        //  1861: athrow         
        //  1862: aconst_null    
        //  1863: athrow         
        //    StackMapTable: 01 23 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FC 00 03 07 00 03 0A 41 01 1E 45 07 00 32 40 07 00 69 45 07 00 32 40 01 46 07 00 4C 40 07 00 69 45 07 00 32 40 01 0B 41 01 1C FF 00 05 00 00 00 01 07 00 32 FF 00 00 00 01 07 00 03 00 01 07 00 69 45 07 00 32 40 01 47 07 00 32 40 07 00 1E 45 07 00 32 40 01 FF 00 11 00 01 07 00 03 00 02 08 00 AD 08 00 AD FF 00 01 00 01 07 00 03 00 03 08 00 AD 08 00 AD 01 FF 00 1D 00 01 07 00 03 00 02 08 00 AD 08 00 AD 42 07 00 32 FF 00 00 00 01 07 00 03 00 02 08 00 AD 08 00 AD 45 07 00 32 40 07 00 7B 4A 07 00 7B FF 00 01 00 01 07 00 03 00 02 07 00 7B 01 5B 07 00 7B 42 07 00 32 40 07 00 7B 45 07 00 32 40 07 00 7B 42 07 00 28 40 07 00 7B 45 07 00 32 40 07 00 D3 FC 00 00 07 00 D3 46 07 00 32 40 07 00 1E 45 07 00 32 40 01 FF 00 09 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 D3 00 01 07 00 1E 45 07 00 32 40 07 00 05 FF 00 0A 00 03 07 00 03 07 00 D3 07 00 90 00 01 07 00 32 FF 00 00 00 03 07 00 03 07 00 D3 07 00 90 00 02 08 01 4C 08 01 4C 45 07 00 32 40 07 00 92 4A 07 00 92 FF 00 01 00 03 07 00 03 07 00 D3 07 00 90 00 02 07 00 92 01 5B 07 00 92 FC 00 0B 07 00 92 41 01 1D 44 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 02 07 00 92 07 00 90 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 02 07 00 92 07 01 10 FF 00 03 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 03 07 00 92 07 01 10 07 00 90 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 03 07 00 92 07 01 10 07 00 92 42 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 03 07 00 92 07 01 10 07 00 92 45 07 00 32 00 51 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 08 01 DF 08 01 DF 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 43 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 00 90 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 FF 00 0C 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 08 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 01 FF 00 1B 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 42 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 FF 00 0A 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 01 FF 00 1C 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 42 07 00 5C FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 FF 00 0A 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 01 FF 00 1B 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 42 07 00 48 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 03 08 01 D4 08 01 D4 07 00 69 FF 00 0B 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 04 08 01 D4 08 01 D4 07 00 69 01 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 05 08 01 D4 08 01 D4 07 00 69 01 01 FF 00 1E 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 04 08 01 D4 08 01 D4 07 00 69 01 42 07 00 28 FF 00 00 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 04 08 01 D4 08 01 D4 07 00 69 01 45 07 00 32 40 07 00 A5 FF 00 0D 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 01 07 00 D3 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 02 07 00 D3 01 5C 07 00 D3 FF 00 0D 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 07 00 A5 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 04 07 00 D3 07 00 92 07 00 A5 01 FF 00 1B 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 07 00 A5 42 07 00 32 FF 00 00 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 07 00 A5 45 07 00 32 00 4C 07 00 A5 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 02 07 00 A5 01 5D 07 00 A5 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 01 07 00 A5 45 07 00 32 00 FF 00 02 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 01 07 00 46 FF 00 0E 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 46 00 01 07 00 46 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 46 00 02 07 00 46 01 5C 07 00 46 42 07 00 32 40 07 00 46 45 07 00 32 FF 00 00 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 05 00 00 FF 00 02 00 01 07 00 03 00 00 46 07 00 32 40 07 00 1E 45 07 00 32 40 01 02 04 41 01 18 46 07 00 54 FF 00 00 00 01 07 00 03 00 02 08 03 F4 08 03 F4 45 07 00 32 40 07 00 7B 42 07 00 32 40 07 00 7B 45 07 00 32 40 07 00 7B 42 07 00 32 40 07 00 7B 45 07 00 32 40 07 00 D3 4A 07 00 D3 FF 00 01 00 01 07 00 03 00 02 07 00 D3 01 5D 07 00 D3 FC 00 00 07 00 D3 0A 41 01 1D 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 D3 00 02 07 00 03 01 5D 07 00 03 4D 07 00 1E FF 00 01 00 02 07 00 03 07 00 D3 00 02 07 00 1E 01 5B 07 00 1E 42 07 00 28 40 07 00 1E 45 07 00 32 40 01 49 07 00 32 40 07 00 1E 45 07 00 32 40 07 00 05 FF 00 0F 00 03 07 00 03 07 00 D3 07 00 44 00 01 07 00 44 FF 00 01 00 03 07 00 03 07 00 D3 07 00 44 00 02 07 00 44 01 5C 07 00 44 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 03 07 00 03 07 00 D3 07 00 44 00 01 07 00 44 45 07 00 32 40 07 00 92 FF 00 12 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 08 05 2B 08 05 2B 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 43 07 00 54 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 00 44 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 42 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 44 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 FF 00 0A 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 FF 00 01 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 08 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 01 FF 00 1C 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 FF 00 0A 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 FF 00 01 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 01 FF 00 1B 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 42 07 00 2E FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 01 10 42 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 01 10 45 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 03 08 05 20 08 05 20 07 00 69 FF 00 03 00 00 00 01 07 00 32 FF 00 00 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 04 08 05 20 08 05 20 07 00 69 01 45 07 00 32 40 07 00 A5 FF 00 0E 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 01 07 00 D3 FF 00 02 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 02 07 00 D3 01 5F 07 00 D3 FF 00 0C 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 02 07 00 D3 07 00 92 FF 00 02 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 01 FF 00 1F 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 02 07 00 D3 07 00 92 44 07 00 32 FF 00 00 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 07 00 A5 45 07 00 32 00 4D 07 00 A5 FF 00 02 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 02 07 00 A5 01 5D 07 00 A5 42 07 00 4A 40 07 00 A5 45 07 00 32 00 FF 00 02 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 01 07 00 46 4B 07 00 46 FF 00 02 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 02 07 00 46 01 5E 07 00 46 FC 00 0D 07 00 46 42 01 1E 44 07 00 52 40 07 00 46 45 07 00 32 FF 00 00 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 05 00 00 FF 00 02 00 01 07 00 03 00 00 FF 00 00 00 03 07 00 03 07 00 D3 07 00 90 00 01 07 00 92 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 03 07 00 D3 07 00 92 07 00 A5 FF 00 01 00 01 07 00 03 00 01 07 00 D3 FF 00 01 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 02 07 00 D3 07 00 92 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 00 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 F9 00 01 FF 00 01 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 01 07 00 A5 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 A5 00 01 07 00 D3 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 07 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 00 A7 07 01 10 FF 00 01 00 03 07 00 03 07 00 D3 07 00 44 00 01 07 00 44 FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 06 08 01 D4 08 01 D4 08 01 D8 08 01 D8 07 00 69 07 01 10 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 01 07 00 A5 FF 00 01 00 05 07 00 03 07 00 D3 07 00 44 07 00 92 07 00 46 00 00 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 06 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 FF 00 01 00 02 07 00 03 07 00 D3 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 A5 00 01 07 00 D3 FF 00 01 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 07 08 05 20 08 05 20 08 05 24 08 05 24 07 00 69 07 00 A7 07 01 10 FF 00 01 00 02 07 00 03 07 00 D3 00 01 07 00 1E FF 00 01 00 01 07 00 03 00 02 08 00 AD 08 00 AD FF 00 01 00 04 07 00 03 07 00 D3 07 00 44 07 00 92 00 01 07 00 46 FF 00 01 00 05 07 00 03 07 00 D3 07 00 90 07 00 92 07 00 46 00 01 07 00 46 FF 00 01 00 01 07 00 03 00 01 07 00 7B FF 00 01 00 04 07 00 03 07 00 D3 07 00 90 07 00 92 00 04 08 01 D4 08 01 D4 07 00 69 01 FF 00 01 00 01 07 00 03 00 01 07 00 32 43 05 44 07 00 32 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  468    509    902    959    Ljava/lang/Exception;
        //  510    563    902    959    Ljava/lang/Exception;
        //  564    891    902    959    Ljava/lang/Exception;
        //  892    899    902    959    Ljava/lang/Exception;
        //  1312   1419   1674   1831   Ljava/lang/Exception;
        //  1420   1494   1674   1831   Ljava/lang/Exception;
        //  1495   1671   1674   1831   Ljava/lang/Exception;
        //  8      20     1846   1854   Ljava/lang/ClassCastException;
        //  1846   1854   1846   1854   Any
        //  1862   1864   3      8      Any
        //  74     81     81     82     Any
        //  74     81     81     82     Ljava/lang/ClassCastException;
        //  74     81     74     75     Any
        //  75     81     81     82     Any
        //  74     81     74     75     Any
        //  89     96     96     97     Any
        //  90     96     96     97     Ljava/lang/StringIndexOutOfBoundsException;
        //  90     96     89     90     Ljava/lang/NullPointerException;
        //  90     96     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  90     96     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  147    153    153    154    Any
        //  147    153    3      8      Any
        //  147    153    3      8      Ljava/lang/UnsupportedOperationException;
        //  147    153    3      8      Any
        //  147    153    153    154    Any
        //  162    169    169    170    Any
        //  162    169    162    163    Ljava/lang/NumberFormatException;
        //  163    169    162    163    Any
        //  163    169    162    163    Any
        //  163    169    162    163    Ljava/lang/UnsupportedOperationException;
        //  223    230    230    231    Any
        //  223    230    223    224    Any
        //  223    230    230    231    Ljava/lang/AssertionError;
        //  223    230    3      8      Any
        //  223    230    230    231    Any
        //  275    282    282    283    Any
        //  276    282    275    276    Any
        //  275    282    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  276    282    282    283    Ljava/lang/RuntimeException;
        //  275    282    3      8      Ljava/util/ConcurrentModificationException;
        //  286    293    293    294    Any
        //  286    293    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  287    293    293    294    Any
        //  287    293    286    287    Ljava/lang/IllegalStateException;
        //  286    293    3      8      Any
        //  302    309    309    310    Any
        //  302    309    302    303    Any
        //  302    309    309    310    Any
        //  302    309    3      8      Any
        //  303    309    302    303    Ljava/util/ConcurrentModificationException;
        //  321    327    327    328    Any
        //  321    327    327    328    Any
        //  321    327    327    328    Any
        //  321    327    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  321    327    327    328    Ljava/lang/AssertionError;
        //  339    346    346    347    Any
        //  340    346    339    340    Any
        //  340    346    3      8      Ljava/util/NoSuchElementException;
        //  339    346    3      8      Any
        //  339    346    3      8      Any
        //  437    444    444    445    Any
        //  438    444    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  438    444    444    445    Ljava/lang/IndexOutOfBoundsException;
        //  437    444    437    438    Any
        //  438    444    437    438    Ljava/lang/ClassCastException;
        //  450    456    456    457    Any
        //  450    456    3      8      Ljava/lang/ArithmeticException;
        //  450    456    3      8      Ljava/lang/IllegalStateException;
        //  450    456    456    457    Ljava/lang/NullPointerException;
        //  450    456    456    457    Any
        //  460    467    467    468    Any
        //  460    467    460    461    Any
        //  461    467    3      8      Any
        //  460    467    467    468    Ljava/lang/RuntimeException;
        //  460    467    3      8      Any
        //  486    493    493    494    Any
        //  487    493    3      8      Ljava/lang/UnsupportedOperationException;
        //  487    493    3      8      Any
        //  487    493    486    487    Any
        //  487    493    486    487    Any
        //  498    505    505    506    Any
        //  498    505    3      8      Any
        //  498    505    505    506    Ljava/lang/IllegalStateException;
        //  498    505    498    499    Ljava/lang/IllegalStateException;
        //  499    505    498    499    Any
        //  510    516    516    517    Any
        //  510    516    516    517    Ljava/lang/NegativeArraySizeException;
        //  510    516    516    517    Ljava/lang/IllegalArgumentException;
        //  510    516    3      8      Any
        //  510    516    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  564    570    570    571    Any
        //  564    570    3      8      Ljava/util/ConcurrentModificationException;
        //  564    570    570    571    Ljava/lang/AssertionError;
        //  564    570    570    571    Any
        //  564    570    3      8      Ljava/lang/ClassCastException;
        //  574    581    581    582    Any
        //  575    581    581    582    Ljava/lang/RuntimeException;
        //  575    581    581    582    Ljava/lang/IllegalStateException;
        //  574    581    3      8      Ljava/lang/NumberFormatException;
        //  575    581    574    575    Any
        //  627    634    634    635    Any
        //  628    634    634    635    Any
        //  627    634    3      8      Any
        //  627    634    3      8      Ljava/util/NoSuchElementException;
        //  628    634    627    628    Ljava/lang/IllegalArgumentException;
        //  679    686    686    687    Any
        //  679    686    679    680    Ljava/lang/ClassCastException;
        //  680    686    686    687    Any
        //  679    686    686    687    Any
        //  679    686    686    687    Any
        //  735    742    742    743    Any
        //  736    742    3      8      Any
        //  736    742    3      8      Ljava/lang/ClassCastException;
        //  735    742    3      8      Any
        //  736    742    735    736    Ljava/lang/IllegalStateException;
        //  835    842    842    843    Any
        //  835    842    835    836    Any
        //  835    842    842    843    Ljava/lang/EnumConstantNotPresentException;
        //  836    842    842    843    Ljava/lang/ArithmeticException;
        //  836    842    842    843    Ljava/lang/EnumConstantNotPresentException;
        //  892    898    898    899    Any
        //  892    898    3      8      Any
        //  892    898    3      8      Any
        //  892    898    898    899    Any
        //  892    898    898    899    Ljava/lang/AssertionError;
        //  951    958    958    959    Any
        //  952    958    951    952    Any
        //  951    958    3      8      Any
        //  952    958    958    959    Any
        //  952    958    958    959    Ljava/lang/IllegalArgumentException;
        //  969    976    976    977    Any
        //  970    976    976    977    Any
        //  969    976    969    970    Any
        //  970    976    969    970    Ljava/util/NoSuchElementException;
        //  970    976    969    970    Ljava/lang/IllegalArgumentException;
        //  1019   1026   1026   1027   Any
        //  1020   1026   1019   1020   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1019   1026   1026   1027   Ljava/util/NoSuchElementException;
        //  1020   1026   1026   1027   Ljava/lang/EnumConstantNotPresentException;
        //  1020   1026   1019   1020   Ljava/lang/ArithmeticException;
        //  1030   1037   1037   1038   Any
        //  1031   1037   1030   1031   Any
        //  1031   1037   1030   1031   Ljava/lang/NumberFormatException;
        //  1030   1037   3      8      Any
        //  1031   1037   1037   1038   Ljava/lang/NegativeArraySizeException;
        //  1041   1048   1048   1049   Any
        //  1042   1048   1041   1042   Ljava/lang/IllegalStateException;
        //  1041   1048   3      8      Ljava/util/ConcurrentModificationException;
        //  1041   1048   1041   1042   Any
        //  1041   1048   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1227   1234   1234   1235   Any
        //  1228   1234   3      8      Any
        //  1228   1234   1227   1228   Ljava/lang/IllegalStateException;
        //  1228   1234   3      8      Any
        //  1228   1234   3      8      Ljava/lang/NegativeArraySizeException;
        //  1245   1252   1252   1253   Any
        //  1245   1252   1252   1253   Any
        //  1245   1252   1252   1253   Any
        //  1246   1252   1245   1246   Any
        //  1246   1252   3      8      Ljava/lang/AssertionError;
        //  1304   1310   1310   1311   Any
        //  1304   1310   3      8      Any
        //  1304   1310   1310   1311   Ljava/lang/NegativeArraySizeException;
        //  1304   1310   3      8      Ljava/lang/UnsupportedOperationException;
        //  1304   1310   1310   1311   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1330   1337   1337   1338   Any
        //  1330   1337   1337   1338   Ljava/lang/NumberFormatException;
        //  1330   1337   3      8      Any
        //  1331   1337   1330   1331   Any
        //  1330   1337   3      8      Ljava/lang/RuntimeException;
        //  1342   1349   1349   1350   Any
        //  1342   1349   1349   1350   Any
        //  1343   1349   1342   1343   Ljava/util/NoSuchElementException;
        //  1343   1349   1342   1343   Ljava/lang/EnumConstantNotPresentException;
        //  1342   1349   1342   1343   Ljava/lang/UnsupportedOperationException;
        //  1353   1360   1360   1361   Any
        //  1353   1360   1353   1354   Any
        //  1354   1360   1353   1354   Any
        //  1353   1360   1360   1361   Any
        //  1354   1360   1353   1354   Ljava/lang/ArithmeticException;
        //  1366   1373   1373   1374   Any
        //  1367   1373   1373   1374   Ljava/lang/NumberFormatException;
        //  1366   1373   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1366   1373   1366   1367   Any
        //  1366   1373   3      8      Any
        //  1420   1426   1426   1427   Any
        //  1420   1426   3      8      Ljava/lang/IllegalStateException;
        //  1420   1426   1426   1427   Any
        //  1420   1426   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1420   1426   1426   1427   Ljava/util/NoSuchElementException;
        //  1471   1478   1478   1479   Any
        //  1471   1478   1478   1479   Ljava/util/NoSuchElementException;
        //  1472   1478   1478   1479   Any
        //  1471   1478   1471   1472   Ljava/util/NoSuchElementException;
        //  1472   1478   3      8      Any
        //  1482   1489   1489   1490   Any
        //  1483   1489   1482   1483   Ljava/lang/StringIndexOutOfBoundsException;
        //  1483   1489   1482   1483   Any
        //  1483   1489   3      8      Ljava/lang/AssertionError;
        //  1482   1489   1482   1483   Any
        //  1495   1501   1501   1502   Any
        //  1495   1501   1501   1502   Any
        //  1495   1501   3      8      Ljava/lang/NegativeArraySizeException;
        //  1495   1501   1501   1502   Any
        //  1495   1501   3      8      Ljava/lang/RuntimeException;
        //  1605   1612   1612   1613   Any
        //  1605   1612   1605   1606   Ljava/util/NoSuchElementException;
        //  1605   1612   3      8      Any
        //  1605   1612   1605   1606   Any
        //  1606   1612   1605   1606   Any
        //  1663   1670   1670   1671   Any
        //  1663   1670   1663   1664   Ljava/lang/StringIndexOutOfBoundsException;
        //  1663   1670   1670   1671   Ljava/lang/ArithmeticException;
        //  1664   1670   1670   1671   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1664   1670   3      8      Any
        //  1773   1780   1780   1781   Any
        //  1773   1780   3      8      Any
        //  1773   1780   1780   1781   Ljava/lang/ArithmeticException;
        //  1773   1780   1773   1774   Ljava/lang/AssertionError;
        //  1773   1780   1780   1781   Any
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
    
    public void c(final fH fh) {
        fbS.6D(this, 1207510389, fh);
    }
}
