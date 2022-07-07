// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.renderer.BufferBuilder;

public class f3V extends f3A
{
    public f0b c;
    public fS c;
    public int c;
    
    @Override
    public void 0(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          325
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            317
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            309
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             2107051772
        //    32: goto            37
        //    35: ldc             -1579387519
        //    37: ldc             285871921
        //    39: ixor           
        //    40: lookupswitch {
        //          -1328121168: 68
        //          1822228941: 35
        //          default: 292
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: iload_2        
        //    71: iload_3        
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             1803400909
        //    80: goto            85
        //    83: ldc             125819216
        //    85: ldc             -473492711
        //    87: ixor           
        //    88: lookupswitch {
        //          -2001033772: 83
        //          -457651639: 116
        //          default: 294
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokespecial   dev/nuker/pyro/f3A.0:(III)V
        //   123: goto            127
        //   126: athrow         
        //   127: aload_0        
        //   128: iconst_0       
        //   129: getstatic       dev/nuker/pyro/fc.1:I
        //   132: ifeq            140
        //   135: ldc             -1801991603
        //   137: goto            142
        //   140: ldc             -139623885
        //   142: ldc             1178407736
        //   144: ixor           
        //   145: lookupswitch {
        //          -760555147: 296
        //          32076131: 140
        //          default: 172
        //        }
        //   172: putfield        dev/nuker/pyro/f3V.c:I
        //   175: getstatic       dev/nuker/pyro/fc.1:I
        //   178: ifeq            186
        //   181: ldc             2040987266
        //   183: goto            188
        //   186: ldc             1389751251
        //   188: ldc             1319364876
        //   190: ixor           
        //   191: lookupswitch {
        //          3681131: 186
        //          923080590: 290
        //          default: 216
        //        }
        //   216: aload_0        
        //   217: getstatic       dev/nuker/pyro/fc.c:I
        //   220: ifge            228
        //   223: ldc             -672156303
        //   225: goto            230
        //   228: ldc             468185458
        //   230: ldc             -2030477623
        //   232: ixor           
        //   233: lookupswitch {
        //          -1658933317: 260
        //          1360456632: 228
        //          default: 298
        //        }
        //   260: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/f0b;
        //   263: aload_0        
        //   264: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //   267: goto            271
        //   270: athrow         
        //   271: invokevirtual   dev/nuker/pyro/fS.0:()Ldev/nuker/pyro/fS;
        //   274: goto            278
        //   277: athrow         
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   dev/nuker/pyro/f0b.c:(Ljava/lang/Object;)V
        //   285: goto            289
        //   288: athrow         
        //   289: return         
        //   290: aconst_null    
        //   291: athrow         
        //   292: aconst_null    
        //   293: athrow         
        //   294: aconst_null    
        //   295: athrow         
        //   296: aconst_null    
        //   297: athrow         
        //   298: aconst_null    
        //   299: athrow         
        //   300: pop            
        //   301: goto            24
        //   304: pop            
        //   305: aconst_null    
        //   306: goto            300
        //   309: dup            
        //   310: ifnull          300
        //   313: checkcast       Ljava/lang/Throwable;
        //   316: athrow         
        //   317: dup            
        //   318: ifnull          304
        //   321: checkcast       Ljava/lang/Throwable;
        //   324: athrow         
        //   325: aconst_null    
        //   326: athrow         
        //    StackMapTable: 00 29 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 04 07 00 03 01 01 01 00 00 0A 41 01 1E FF 00 0E 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 05 07 00 03 01 01 01 01 FF 00 1E 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 42 07 00 1D FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 1D 00 FF 00 0C 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 07 00 03 01 0D 41 01 1B 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 49 07 00 1D FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 3D 07 00 38 45 07 00 1D FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 3D 07 00 38 42 07 00 1D FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 3D 07 00 38 45 07 00 1D 00 00 01 FF 00 01 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 41 07 00 03 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     309    317    Any
        //  309    317    309    317    Ljava/lang/IllegalArgumentException;
        //  325    327    3      8      Ljava/lang/NegativeArraySizeException;
        //  119    126    126    127    Any
        //  120    126    126    127    Any
        //  119    126    126    127    Ljava/lang/EnumConstantNotPresentException;
        //  120    126    119    120    Ljava/lang/AssertionError;
        //  119    126    119    120    Ljava/lang/ArithmeticException;
        //  270    277    277    278    Any
        //  270    277    270    271    Ljava/lang/AssertionError;
        //  271    277    270    271    Any
        //  270    277    277    278    Ljava/lang/NegativeArraySizeException;
        //  271    277    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  281    288    288    289    Any
        //  281    288    288    289    Ljava/lang/AssertionError;
        //  282    288    281    282    Ljava/lang/StringIndexOutOfBoundsException;
        //  281    288    281    282    Any
        //  282    288    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 89 out of bounds for length 89
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    
    public void c(final BufferBuilder p0, final int p1, final int p2, final int p3, final int p4, final float p5, final float[] p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1444
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1436
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1428
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_2        
        //    25: i2f            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             1428660368
        //    34: goto            39
        //    37: ldc             964949434
        //    39: ldc             -1613767140
        //    41: ixor           
        //    42: lookupswitch {
        //          -1504957530: 68
        //          -890732916: 37
        //          default: 1387
        //        }
        //    68: fload           6
        //    70: iload           4
        //    72: i2f            
        //    73: fmul           
        //    74: fadd           
        //    75: ldc             0.5
        //    77: fsub           
        //    78: fstore          8
        //    80: getstatic       dev/nuker/pyro/fc.0:I
        //    83: ifeq            91
        //    86: ldc             -1689640144
        //    88: goto            93
        //    91: ldc             480158401
        //    93: ldc             -182153116
        //    95: ixor           
        //    96: lookupswitch {
        //          -373673307: 124
        //          1852748628: 91
        //          default: 1407
        //        }
        //   124: aload_1        
        //   125: fload           8
        //   127: f2d            
        //   128: dconst_1       
        //   129: dsub           
        //   130: iload_3        
        //   131: getstatic       dev/nuker/pyro/fc.1:I
        //   134: ifeq            142
        //   137: ldc             -1549670600
        //   139: goto            144
        //   142: ldc             1797290236
        //   144: ldc             -1956450968
        //   146: ixor           
        //   147: lookupswitch {
        //          -197631404: 142
        //          683870800: 1393
        //          default: 172
        //        }
        //   172: iload           5
        //   174: iadd           
        //   175: i2d            
        //   176: dconst_1       
        //   177: dadd           
        //   178: dconst_0       
        //   179: goto            183
        //   182: athrow         
        //   183: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   186: goto            190
        //   189: athrow         
        //   190: sipush          255
        //   193: sipush          255
        //   196: sipush          255
        //   199: sipush          255
        //   202: goto            206
        //   205: athrow         
        //   206: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   209: goto            213
        //   212: athrow         
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   220: goto            224
        //   223: athrow         
        //   224: aload_1        
        //   225: getstatic       dev/nuker/pyro/fc.c:I
        //   228: ifge            236
        //   231: ldc             -1674053403
        //   233: goto            238
        //   236: ldc             286704164
        //   238: ldc             -1477549000
        //   240: ixor           
        //   241: lookupswitch {
        //          -1225218532: 268
        //          1004117213: 236
        //          default: 1391
        //        }
        //   268: fload           8
        //   270: fconst_2       
        //   271: fadd           
        //   272: f2d            
        //   273: iload_3        
        //   274: getstatic       dev/nuker/pyro/fc.1:I
        //   277: ifeq            285
        //   280: ldc             1729576037
        //   282: goto            287
        //   285: ldc             1014428993
        //   287: ldc             2003889463
        //   289: ixor           
        //   290: lookupswitch {
        //          275239250: 285
        //          1258690678: 316
        //          default: 1381
        //        }
        //   316: iload           5
        //   318: iadd           
        //   319: i2d            
        //   320: dconst_1       
        //   321: dadd           
        //   322: dconst_0       
        //   323: goto            327
        //   326: athrow         
        //   327: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   330: goto            334
        //   333: athrow         
        //   334: sipush          255
        //   337: sipush          255
        //   340: sipush          255
        //   343: sipush          255
        //   346: goto            350
        //   349: athrow         
        //   350: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   353: goto            357
        //   356: athrow         
        //   357: goto            361
        //   360: athrow         
        //   361: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   364: goto            368
        //   367: athrow         
        //   368: getstatic       dev/nuker/pyro/fc.1:I
        //   371: ifeq            379
        //   374: ldc             2046291932
        //   376: goto            381
        //   379: ldc             1405579719
        //   381: ldc             725142786
        //   383: ixor           
        //   384: lookupswitch {
        //          1389306590: 379
        //          2030025925: 412
        //          default: 1415
        //        }
        //   412: aload_1        
        //   413: fload           8
        //   415: fconst_2       
        //   416: fadd           
        //   417: f2d            
        //   418: iload_3        
        //   419: i2d            
        //   420: dconst_1       
        //   421: dsub           
        //   422: dconst_0       
        //   423: getstatic       dev/nuker/pyro/fc.1:I
        //   426: ifeq            434
        //   429: ldc             2094199401
        //   431: goto            436
        //   434: ldc             -273096961
        //   436: ldc             -2013739874
        //   438: ixor           
        //   439: lookupswitch {
        //          -1888334593: 434
        //          -81119497: 1395
        //          default: 464
        //        }
        //   464: goto            468
        //   467: athrow         
        //   468: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   471: goto            475
        //   474: athrow         
        //   475: sipush          255
        //   478: sipush          255
        //   481: sipush          255
        //   484: sipush          255
        //   487: goto            491
        //   490: athrow         
        //   491: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   494: goto            498
        //   497: athrow         
        //   498: goto            502
        //   501: athrow         
        //   502: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   505: goto            509
        //   508: athrow         
        //   509: getstatic       dev/nuker/pyro/fc.0:I
        //   512: ifeq            520
        //   515: ldc             1213868943
        //   517: goto            522
        //   520: ldc             376501904
        //   522: ldc             -822942532
        //   524: ixor           
        //   525: lookupswitch {
        //          -2035757261: 1379
        //          791284397: 520
        //          default: 552
        //        }
        //   552: aload_1        
        //   553: getstatic       dev/nuker/pyro/fc.c:I
        //   556: ifge            564
        //   559: ldc             1904005204
        //   561: goto            566
        //   564: ldc             -1006972734
        //   566: ldc             -1399430256
        //   568: ixor           
        //   569: lookupswitch {
        //          -571821116: 564
        //          1869394770: 596
        //          default: 1383
        //        }
        //   596: fload           8
        //   598: f2d            
        //   599: dconst_1       
        //   600: dsub           
        //   601: iload_3        
        //   602: i2d            
        //   603: dconst_1       
        //   604: dsub           
        //   605: dconst_0       
        //   606: getstatic       dev/nuker/pyro/fc.1:I
        //   609: ifeq            617
        //   612: ldc             -1131256487
        //   614: goto            619
        //   617: ldc             132286882
        //   619: ldc             -470360858
        //   621: ixor           
        //   622: lookupswitch {
        //          392026065: 617
        //          1600436671: 1417
        //          default: 648
        //        }
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   655: goto            659
        //   658: athrow         
        //   659: sipush          255
        //   662: sipush          255
        //   665: sipush          255
        //   668: sipush          255
        //   671: goto            675
        //   674: athrow         
        //   675: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //   678: goto            682
        //   681: athrow         
        //   682: getstatic       dev/nuker/pyro/fc.c:I
        //   685: ifge            693
        //   688: ldc             -1529014704
        //   690: goto            695
        //   693: ldc             -995270816
        //   695: ldc             1783784162
        //   697: ixor           
        //   698: lookupswitch {
        //          -829459278: 1389
        //          2139152966: 693
        //          default: 724
        //        }
        //   724: goto            728
        //   727: athrow         
        //   728: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   731: goto            735
        //   734: athrow         
        //   735: aload_0        
        //   736: aload_1        
        //   737: fload           8
        //   739: iload_3        
        //   740: i2f            
        //   741: iconst_1       
        //   742: iload           5
        //   744: iconst_1       
        //   745: iconst_2       
        //   746: goto            750
        //   749: athrow         
        //   750: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;FFIIII)V
        //   753: goto            757
        //   756: athrow         
        //   757: getstatic       dev/nuker/pyro/fc.0:I
        //   760: ifeq            768
        //   763: ldc             -2123794997
        //   765: goto            770
        //   768: ldc             854031193
        //   770: ldc             -1460000233
        //   772: ixor           
        //   773: lookupswitch {
        //          -1709354674: 800
        //          697524188: 768
        //          default: 1403
        //        }
        //   800: aload_1        
        //   801: fload           8
        //   803: f2d            
        //   804: iload_3        
        //   805: iload           5
        //   807: iadd           
        //   808: i2d            
        //   809: dconst_0       
        //   810: goto            814
        //   813: athrow         
        //   814: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   817: goto            821
        //   820: athrow         
        //   821: aload           7
        //   823: iconst_0       
        //   824: faload         
        //   825: aload           7
        //   827: iconst_1       
        //   828: faload         
        //   829: aload           7
        //   831: iconst_2       
        //   832: faload         
        //   833: aload           7
        //   835: iconst_3       
        //   836: faload         
        //   837: goto            841
        //   840: athrow         
        //   841: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   844: goto            848
        //   847: athrow         
        //   848: goto            852
        //   851: athrow         
        //   852: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   855: goto            859
        //   858: athrow         
        //   859: getstatic       dev/nuker/pyro/fc.0:I
        //   862: ifeq            870
        //   865: ldc             -608026634
        //   867: goto            872
        //   870: ldc             2136371914
        //   872: ldc             1731657847
        //   874: ixor           
        //   875: lookupswitch {
        //          -1124778111: 870
        //          409039549: 900
        //          default: 1405
        //        }
        //   900: aload_1        
        //   901: getstatic       dev/nuker/pyro/fc.0:I
        //   904: ifeq            912
        //   907: ldc             -71072805
        //   909: goto            914
        //   912: ldc             -885671833
        //   914: ldc             1031635642
        //   916: ixor           
        //   917: lookupswitch {
        //          -960626335: 912
        //          -163038499: 944
        //          default: 1409
        //        }
        //   944: fload           8
        //   946: f2d            
        //   947: dconst_1       
        //   948: dadd           
        //   949: iload_3        
        //   950: iload           5
        //   952: iadd           
        //   953: i2d            
        //   954: dconst_0       
        //   955: goto            959
        //   958: athrow         
        //   959: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   962: goto            966
        //   965: athrow         
        //   966: getstatic       dev/nuker/pyro/fc.0:I
        //   969: ifeq            977
        //   972: ldc             -1483297331
        //   974: goto            979
        //   977: ldc             -2032202007
        //   979: ldc             1355948074
        //   981: ixor           
        //   982: lookupswitch {
        //          -146502169: 1399
        //          1945467709: 977
        //          default: 1008
        //        }
        //  1008: aload           7
        //  1010: iconst_0       
        //  1011: faload         
        //  1012: getstatic       dev/nuker/pyro/fc.c:I
        //  1015: ifge            1023
        //  1018: ldc             958075306
        //  1020: goto            1025
        //  1023: ldc             1920617376
        //  1025: ldc             -1959644971
        //  1027: ixor           
        //  1028: lookupswitch {
        //          -1305927297: 1401
        //          -1231844467: 1023
        //          default: 1056
        //        }
        //  1056: aload           7
        //  1058: iconst_1       
        //  1059: faload         
        //  1060: aload           7
        //  1062: iconst_2       
        //  1063: faload         
        //  1064: aload           7
        //  1066: iconst_3       
        //  1067: faload         
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: goto            1083
        //  1082: athrow         
        //  1083: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1086: goto            1090
        //  1089: athrow         
        //  1090: aload_1        
        //  1091: fload           8
        //  1093: f2d            
        //  1094: dconst_1       
        //  1095: dadd           
        //  1096: iload_3        
        //  1097: i2d            
        //  1098: dconst_0       
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: getstatic       dev/nuker/pyro/fc.1:I
        //  1113: ifeq            1121
        //  1116: ldc             54855830
        //  1118: goto            1123
        //  1121: ldc             368449160
        //  1123: ldc             -1588487130
        //  1125: ixor           
        //  1126: lookupswitch {
        //          -1575709520: 1385
        //          -1334929580: 1121
        //          default: 1152
        //        }
        //  1152: aload           7
        //  1154: iconst_0       
        //  1155: faload         
        //  1156: aload           7
        //  1158: iconst_1       
        //  1159: faload         
        //  1160: getstatic       dev/nuker/pyro/fc.c:I
        //  1163: ifge            1171
        //  1166: ldc             -1623379793
        //  1168: goto            1173
        //  1171: ldc             1708118361
        //  1173: ldc             595722800
        //  1175: ixor           
        //  1176: lookupswitch {
        //          -1128320353: 1411
        //          -44419608: 1171
        //          default: 1204
        //        }
        //  1204: aload           7
        //  1206: iconst_2       
        //  1207: faload         
        //  1208: aload           7
        //  1210: iconst_3       
        //  1211: faload         
        //  1212: goto            1216
        //  1215: athrow         
        //  1216: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1219: goto            1223
        //  1222: athrow         
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1230: goto            1234
        //  1233: athrow         
        //  1234: aload_1        
        //  1235: fload           8
        //  1237: f2d            
        //  1238: iload_3        
        //  1239: i2d            
        //  1240: dconst_0       
        //  1241: goto            1245
        //  1244: athrow         
        //  1245: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: aload           7
        //  1254: iconst_0       
        //  1255: faload         
        //  1256: getstatic       dev/nuker/pyro/fc.1:I
        //  1259: ifeq            1267
        //  1262: ldc             610038990
        //  1264: goto            1269
        //  1267: ldc             1586128532
        //  1269: ldc             -1213145892
        //  1271: ixor           
        //  1272: lookupswitch {
        //          -1813207022: 1267
        //          -382027192: 1300
        //          default: 1397
        //        }
        //  1300: aload           7
        //  1302: iconst_1       
        //  1303: faload         
        //  1304: getstatic       dev/nuker/pyro/fc.c:I
        //  1307: ifge            1315
        //  1310: ldc             656703605
        //  1312: goto            1317
        //  1315: ldc             -503370093
        //  1317: ldc             -1178891433
        //  1319: ixor           
        //  1320: lookupswitch {
        //          -1633744094: 1413
        //          -1456525329: 1315
        //          default: 1348
        //        }
        //  1348: aload           7
        //  1350: iconst_2       
        //  1351: faload         
        //  1352: aload           7
        //  1354: iconst_3       
        //  1355: faload         
        //  1356: goto            1360
        //  1359: athrow         
        //  1360: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1363: goto            1367
        //  1366: athrow         
        //  1367: goto            1371
        //  1370: athrow         
        //  1371: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1374: goto            1378
        //  1377: athrow         
        //  1378: return         
        //  1379: aconst_null    
        //  1380: athrow         
        //  1381: aconst_null    
        //  1382: athrow         
        //  1383: aconst_null    
        //  1384: athrow         
        //  1385: aconst_null    
        //  1386: athrow         
        //  1387: aconst_null    
        //  1388: athrow         
        //  1389: aconst_null    
        //  1390: athrow         
        //  1391: aconst_null    
        //  1392: athrow         
        //  1393: aconst_null    
        //  1394: athrow         
        //  1395: aconst_null    
        //  1396: athrow         
        //  1397: aconst_null    
        //  1398: athrow         
        //  1399: aconst_null    
        //  1400: athrow         
        //  1401: aconst_null    
        //  1402: athrow         
        //  1403: aconst_null    
        //  1404: athrow         
        //  1405: aconst_null    
        //  1406: athrow         
        //  1407: aconst_null    
        //  1408: athrow         
        //  1409: aconst_null    
        //  1410: athrow         
        //  1411: aconst_null    
        //  1412: athrow         
        //  1413: aconst_null    
        //  1414: athrow         
        //  1415: aconst_null    
        //  1416: athrow         
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: pop            
        //  1420: goto            24
        //  1423: pop            
        //  1424: aconst_null    
        //  1425: goto            1419
        //  1428: dup            
        //  1429: ifnull          1419
        //  1432: checkcast       Ljava/lang/Throwable;
        //  1435: athrow         
        //  1436: dup            
        //  1437: ifnull          1423
        //  1440: checkcast       Ljava/lang/Throwable;
        //  1443: athrow         
        //  1444: aconst_null    
        //  1445: athrow         
        //    StackMapTable: 00 BD FF 00 03 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 01 07 00 1D FA 00 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 00 00 4C 02 FF 00 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 00 02 02 01 5C 02 FC 00 16 02 41 01 1E FF 00 11 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 01 01 FF 00 1B 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 49 07 00 43 FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4E 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4B 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5D 07 00 63 FF 00 10 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 01 01 FF 00 1C 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 FF 00 09 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4E 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0A 41 01 1E FF 00 15 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 03 03 03 01 FF 00 1B 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 42 07 00 4B FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0E 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0A 41 01 1D 4B 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5D 07 00 63 FF 00 14 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 03 03 03 01 FF 00 1C 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4E 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5C 07 00 63 42 07 00 4B 40 07 00 63 45 07 00 1D 00 4D 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 08 07 00 03 07 00 63 02 02 01 01 01 01 45 07 00 1D 00 0A 41 01 1D 4C 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 52 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 55 40 07 00 63 45 07 00 1D 00 0A 41 01 1B 4B 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5D 07 00 63 FF 00 0D 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5C 07 00 63 FF 00 0E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 01 FF 00 1E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 FF 00 0E 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 49 40 07 00 63 45 07 00 1D 00 4B 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 01 5C 07 00 63 FF 00 12 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 02 02 01 FF 00 1E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 4A 07 00 15 FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 0D 40 07 00 63 45 07 00 1D 00 49 07 00 4B FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 01 FF 00 1E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 FF 00 0E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 02 02 01 FF 00 1E 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 FF 00 0A 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 00 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 41 07 00 63 41 07 00 63 FF 00 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 00 01 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 01 07 00 63 41 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 03 01 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 41 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 02 07 00 63 02 01 01 01 41 07 00 63 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 03 07 00 63 02 02 01 FF 00 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 04 07 00 63 03 03 03 FF 00 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 02 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1428   1436   Any
        //  1428   1436   1428   1436   Any
        //  1444   1446   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  182    189    189    190    Any
        //  182    189    189    190    Any
        //  183    189    182    183    Ljava/util/NoSuchElementException;
        //  182    189    3      8      Any
        //  183    189    189    190    Any
        //  205    212    212    213    Any
        //  205    212    205    206    Any
        //  206    212    3      8      Ljava/util/NoSuchElementException;
        //  206    212    212    213    Any
        //  206    212    205    206    Ljava/lang/IndexOutOfBoundsException;
        //  216    223    223    224    Any
        //  216    223    216    217    Any
        //  216    223    223    224    Ljava/lang/AssertionError;
        //  217    223    223    224    Ljava/lang/StringIndexOutOfBoundsException;
        //  217    223    223    224    Any
        //  327    333    333    334    Any
        //  327    333    3      8      Ljava/lang/AssertionError;
        //  327    333    3      8      Any
        //  327    333    333    334    Ljava/util/ConcurrentModificationException;
        //  327    333    333    334    Any
        //  349    356    356    357    Any
        //  350    356    356    357    Any
        //  349    356    349    350    Any
        //  349    356    3      8      Ljava/util/NoSuchElementException;
        //  349    356    3      8      Ljava/lang/NullPointerException;
        //  360    367    367    368    Any
        //  361    367    360    361    Any
        //  361    367    3      8      Ljava/lang/RuntimeException;
        //  360    367    360    361    Ljava/lang/NullPointerException;
        //  361    367    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  467    474    474    475    Any
        //  468    474    467    468    Ljava/lang/IndexOutOfBoundsException;
        //  467    474    3      8      Any
        //  467    474    467    468    Ljava/lang/NumberFormatException;
        //  468    474    3      8      Ljava/lang/ArithmeticException;
        //  491    497    497    498    Any
        //  491    497    3      8      Any
        //  491    497    3      8      Any
        //  491    497    3      8      Any
        //  491    497    3      8      Ljava/lang/ClassCastException;
        //  501    508    508    509    Any
        //  502    508    501    502    Any
        //  502    508    501    502    Ljava/lang/NumberFormatException;
        //  502    508    3      8      Any
        //  501    508    3      8      Any
        //  651    658    658    659    Any
        //  652    658    651    652    Any
        //  651    658    3      8      Ljava/lang/NumberFormatException;
        //  652    658    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  652    658    658    659    Ljava/lang/ArithmeticException;
        //  674    681    681    682    Any
        //  674    681    674    675    Any
        //  674    681    674    675    Any
        //  674    681    681    682    Ljava/lang/UnsupportedOperationException;
        //  675    681    3      8      Any
        //  727    734    734    735    Any
        //  728    734    3      8      Ljava/lang/NegativeArraySizeException;
        //  728    734    727    728    Ljava/util/NoSuchElementException;
        //  727    734    727    728    Ljava/lang/EnumConstantNotPresentException;
        //  728    734    727    728    Ljava/lang/ArithmeticException;
        //  749    756    756    757    Any
        //  750    756    749    750    Ljava/lang/IllegalArgumentException;
        //  749    756    756    757    Ljava/lang/IllegalArgumentException;
        //  749    756    749    750    Ljava/lang/AssertionError;
        //  749    756    756    757    Ljava/lang/IllegalArgumentException;
        //  813    820    820    821    Any
        //  813    820    3      8      Any
        //  814    820    820    821    Ljava/lang/IllegalArgumentException;
        //  814    820    813    814    Any
        //  813    820    820    821    Any
        //  840    847    847    848    Any
        //  841    847    840    841    Any
        //  840    847    847    848    Any
        //  840    847    847    848    Ljava/lang/StringIndexOutOfBoundsException;
        //  840    847    840    841    Any
        //  851    858    858    859    Any
        //  852    858    851    852    Ljava/lang/IllegalStateException;
        //  851    858    858    859    Any
        //  852    858    858    859    Ljava/lang/StringIndexOutOfBoundsException;
        //  852    858    3      8      Ljava/lang/NegativeArraySizeException;
        //  959    965    965    966    Any
        //  959    965    965    966    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  959    965    3      8      Ljava/lang/AssertionError;
        //  959    965    3      8      Ljava/lang/RuntimeException;
        //  959    965    3      8      Ljava/lang/UnsupportedOperationException;
        //  1072   1078   1078   1079   Any
        //  1072   1078   1078   1079   Any
        //  1072   1078   1078   1079   Any
        //  1072   1078   3      8      Any
        //  1072   1078   1078   1079   Any
        //  1082   1089   1089   1090   Any
        //  1083   1089   3      8      Ljava/lang/ArithmeticException;
        //  1083   1089   1089   1090   Ljava/util/ConcurrentModificationException;
        //  1082   1089   3      8      Any
        //  1082   1089   1082   1083   Ljava/lang/NullPointerException;
        //  1102   1109   1109   1110   Any
        //  1102   1109   3      8      Ljava/util/NoSuchElementException;
        //  1102   1109   1102   1103   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1102   1109   1102   1103   Any
        //  1102   1109   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1215   1222   1222   1223   Any
        //  1216   1222   1215   1216   Ljava/lang/ArithmeticException;
        //  1215   1222   1222   1223   Any
        //  1215   1222   3      8      Ljava/lang/IllegalStateException;
        //  1215   1222   1222   1223   Any
        //  1226   1233   1233   1234   Any
        //  1226   1233   3      8      Ljava/lang/NumberFormatException;
        //  1227   1233   1226   1227   Ljava/lang/IllegalArgumentException;
        //  1227   1233   3      8      Ljava/util/ConcurrentModificationException;
        //  1227   1233   1233   1234   Ljava/lang/AssertionError;
        //  1244   1251   1251   1252   Any
        //  1245   1251   1251   1252   Ljava/lang/NegativeArraySizeException;
        //  1244   1251   1244   1245   Ljava/lang/NegativeArraySizeException;
        //  1244   1251   3      8      Ljava/lang/NegativeArraySizeException;
        //  1245   1251   1244   1245   Ljava/lang/IllegalStateException;
        //  1360   1366   1366   1367   Any
        //  1360   1366   1366   1367   Any
        //  1360   1366   3      8      Any
        //  1360   1366   3      8      Ljava/lang/NumberFormatException;
        //  1360   1366   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1370   1377   1377   1378   Any
        //  1370   1377   3      8      Any
        //  1371   1377   1377   1378   Any
        //  1371   1377   1370   1371   Any
        //  1370   1377   3      8      Any
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
    
    public void c(final BufferBuilder bufferBuilder) {
        fbS.9u(this, 422573750, bufferBuilder);
    }
    
    public void c(final int p0, final int p1, final int p2, final int p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1940
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1932
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1924
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //    31: goto            35
        //    34: athrow         
        //    35: getstatic       dev/nuker/pyro/fc.c:I
        //    38: ifge            46
        //    41: ldc             619194684
        //    43: goto            48
        //    46: ldc             -2066934518
        //    48: ldc             -1337805753
        //    50: ixor           
        //    51: lookupswitch {
        //          -1800757893: 1909
        //          -1632779272: 46
        //          default: 76
        //        }
        //    76: astore          6
        //    78: aload           6
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //    87: goto            91
        //    90: athrow         
        //    91: astore          7
        //    93: aload_0        
        //    94: getstatic       dev/nuker/pyro/fc.c:I
        //    97: ifge            105
        //   100: ldc             241463878
        //   102: goto            107
        //   105: ldc             -904744645
        //   107: ldc             1410856130
        //   109: ixor           
        //   110: lookupswitch {
        //          -1643821575: 136
        //          1517520516: 105
        //          default: 1893
        //        }
        //   136: aload           7
        //   138: goto            142
        //   141: athrow         
        //   142: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;)V
        //   145: goto            149
        //   148: athrow         
        //   149: fconst_0       
        //   150: fstore          8
        //   152: iload_1        
        //   153: getstatic       dev/nuker/pyro/fc.0:I
        //   156: ifeq            164
        //   159: ldc             58227006
        //   161: goto            166
        //   164: ldc             1527852239
        //   166: ldc             640631466
        //   168: ixor           
        //   169: lookupswitch {
        //          626473876: 164
        //          2101243493: 196
        //          default: 1913
        //        }
        //   196: istore          9
        //   198: iload_1        
        //   199: iload_3        
        //   200: iadd           
        //   201: istore          10
        //   203: iload           9
        //   205: iload           10
        //   207: if_icmpge       1225
        //   210: iload           9
        //   212: iload_1        
        //   213: isub           
        //   214: i2f            
        //   215: iload_3        
        //   216: i2f            
        //   217: fdiv           
        //   218: fstore          11
        //   220: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   223: fload           8
        //   225: fconst_1       
        //   226: fconst_1       
        //   227: fconst_1       
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   235: goto            239
        //   238: athrow         
        //   239: astore          12
        //   241: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   244: fload           11
        //   246: fconst_1       
        //   247: fconst_1       
        //   248: fconst_1       
        //   249: getstatic       dev/nuker/pyro/fc.0:I
        //   252: ifeq            260
        //   255: ldc             -450859021
        //   257: goto            262
        //   260: ldc             -935752952
        //   262: ldc             959505147
        //   264: ixor           
        //   265: lookupswitch {
        //          -2018621274: 260
        //          -602895096: 1865
        //          default: 292
        //        }
        //   292: goto            296
        //   295: athrow         
        //   296: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   299: goto            303
        //   302: athrow         
        //   303: getstatic       dev/nuker/pyro/fc.c:I
        //   306: ifge            314
        //   309: ldc             1711099603
        //   311: goto            316
        //   314: ldc             2056520350
        //   316: ldc             -939769342
        //   318: ixor           
        //   319: lookupswitch {
        //          -1576989487: 314
        //          -1117241188: 344
        //          default: 1871
        //        }
        //   344: astore          13
        //   346: aload           7
        //   348: iload           9
        //   350: i2d            
        //   351: iload_2        
        //   352: iload           4
        //   354: iadd           
        //   355: i2d            
        //   356: dconst_0       
        //   357: goto            361
        //   360: athrow         
        //   361: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   364: goto            368
        //   367: athrow         
        //   368: getstatic       dev/nuker/pyro/fc.c:I
        //   371: ifge            379
        //   374: ldc             1862619785
        //   376: goto            381
        //   379: ldc             800676560
        //   381: ldc             -1950305812
        //   383: ixor           
        //   384: lookupswitch {
        //          -456793243: 1895
        //          326281831: 379
        //          default: 412
        //        }
        //   412: aload           12
        //   414: iconst_0       
        //   415: faload         
        //   416: getstatic       dev/nuker/pyro/fc.1:I
        //   419: ifeq            427
        //   422: ldc             1133803619
        //   424: goto            429
        //   427: ldc             1921900561
        //   429: ldc             1015904450
        //   431: ixor           
        //   432: lookupswitch {
        //          -186295982: 427
        //          2132344993: 1899
        //          default: 460
        //        }
        //   460: aload           12
        //   462: iconst_1       
        //   463: faload         
        //   464: getstatic       dev/nuker/pyro/fc.0:I
        //   467: ifeq            475
        //   470: ldc             -1795589415
        //   472: goto            477
        //   475: ldc             -2652965
        //   477: ldc             -2047931124
        //   479: ixor           
        //   480: lookupswitch {
        //          286685141: 1861
        //          1986541521: 475
        //          default: 508
        //        }
        //   508: aload           12
        //   510: iconst_2       
        //   511: faload         
        //   512: aload           12
        //   514: iconst_3       
        //   515: faload         
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   523: goto            527
        //   526: athrow         
        //   527: goto            531
        //   530: athrow         
        //   531: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   534: goto            538
        //   537: athrow         
        //   538: aload           7
        //   540: iload           9
        //   542: i2d            
        //   543: dconst_1       
        //   544: dadd           
        //   545: iload_2        
        //   546: iload           4
        //   548: iadd           
        //   549: i2d            
        //   550: dconst_0       
        //   551: getstatic       dev/nuker/pyro/fc.c:I
        //   554: ifge            562
        //   557: ldc             -1661486736
        //   559: goto            564
        //   562: ldc             1330558603
        //   564: ldc             -1935051142
        //   566: ixor           
        //   567: lookupswitch {
        //          -1008221967: 592
        //          274648842: 562
        //          default: 1903
        //        }
        //   592: goto            596
        //   595: athrow         
        //   596: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   599: goto            603
        //   602: athrow         
        //   603: aload           13
        //   605: iconst_0       
        //   606: faload         
        //   607: aload           13
        //   609: iconst_1       
        //   610: faload         
        //   611: aload           13
        //   613: iconst_2       
        //   614: faload         
        //   615: getstatic       dev/nuker/pyro/fc.0:I
        //   618: ifeq            626
        //   621: ldc             1095710721
        //   623: goto            628
        //   626: ldc             -2135413917
        //   628: ldc             -707765532
        //   630: ixor           
        //   631: lookupswitch {
        //          -1801493787: 626
        //          1432908167: 656
        //          default: 1905
        //        }
        //   656: aload           13
        //   658: iconst_3       
        //   659: faload         
        //   660: goto            664
        //   663: athrow         
        //   664: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   667: goto            671
        //   670: athrow         
        //   671: goto            675
        //   674: athrow         
        //   675: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   678: goto            682
        //   681: athrow         
        //   682: aload           7
        //   684: iload           9
        //   686: i2d            
        //   687: dconst_1       
        //   688: dadd           
        //   689: iload_2        
        //   690: iload           4
        //   692: iadd           
        //   693: i2f            
        //   694: iload           9
        //   696: iload_1        
        //   697: isub           
        //   698: iconst_1       
        //   699: iadd           
        //   700: i2f            
        //   701: iload_3        
        //   702: i2f            
        //   703: fdiv           
        //   704: iload           4
        //   706: i2f            
        //   707: fmul           
        //   708: fsub           
        //   709: f2d            
        //   710: dconst_0       
        //   711: goto            715
        //   714: athrow         
        //   715: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   718: goto            722
        //   721: athrow         
        //   722: aload           13
        //   724: iconst_0       
        //   725: faload         
        //   726: aload           13
        //   728: iconst_1       
        //   729: faload         
        //   730: getstatic       dev/nuker/pyro/fc.0:I
        //   733: ifeq            741
        //   736: ldc             1821819293
        //   738: goto            743
        //   741: ldc             1514766547
        //   743: ldc             -1265897428
        //   745: ixor           
        //   746: lookupswitch {
        //          -669175375: 1901
        //          1086613575: 741
        //          default: 772
        //        }
        //   772: aload           13
        //   774: iconst_2       
        //   775: faload         
        //   776: getstatic       dev/nuker/pyro/fc.c:I
        //   779: ifge            787
        //   782: ldc             148151362
        //   784: goto            789
        //   787: ldc             1156553418
        //   789: ldc             355313676
        //   791: ixor           
        //   792: lookupswitch {
        //          502871118: 787
        //          1371681478: 820
        //          default: 1875
        //        }
        //   820: aload           13
        //   822: iconst_3       
        //   823: faload         
        //   824: getstatic       dev/nuker/pyro/fc.c:I
        //   827: ifge            835
        //   830: ldc             80187454
        //   832: goto            837
        //   835: ldc             -709184971
        //   837: ldc             242385972
        //   839: ixor           
        //   840: lookupswitch {
        //          -1079817032: 835
        //          179639306: 1883
        //          default: 868
        //        }
        //   868: goto            872
        //   871: athrow         
        //   872: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   875: goto            879
        //   878: athrow         
        //   879: getstatic       dev/nuker/pyro/fc.c:I
        //   882: ifge            890
        //   885: ldc             -948927304
        //   887: goto            892
        //   890: ldc             365829429
        //   892: ldc             638856967
        //   894: ixor           
        //   895: lookupswitch {
        //          -513496129: 1881
        //          1084211103: 890
        //          default: 920
        //        }
        //   920: goto            924
        //   923: athrow         
        //   924: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   927: goto            931
        //   930: athrow         
        //   931: aload           7
        //   933: iload           9
        //   935: i2d            
        //   936: iload_2        
        //   937: iload           4
        //   939: iadd           
        //   940: i2f            
        //   941: iload           9
        //   943: getstatic       dev/nuker/pyro/fc.0:I
        //   946: ifeq            954
        //   949: ldc             -1217735232
        //   951: goto            956
        //   954: ldc             -655562451
        //   956: ldc             411121831
        //   958: ixor           
        //   959: lookupswitch {
        //          -1735451247: 954
        //          -1343492761: 1873
        //          default: 984
        //        }
        //   984: iload_1        
        //   985: isub           
        //   986: i2f            
        //   987: getstatic       dev/nuker/pyro/fc.c:I
        //   990: ifge            998
        //   993: ldc             597088711
        //   995: goto            1000
        //   998: ldc             1502597378
        //  1000: ldc             -1211392374
        //  1002: ixor           
        //  1003: lookupswitch {
        //          -1805826227: 998
        //          -297513080: 1028
        //          default: 1889
        //        }
        //  1028: iload_3        
        //  1029: i2f            
        //  1030: fdiv           
        //  1031: iload           4
        //  1033: i2f            
        //  1034: fmul           
        //  1035: fsub           
        //  1036: f2d            
        //  1037: dconst_0       
        //  1038: getstatic       dev/nuker/pyro/fc.1:I
        //  1041: ifeq            1049
        //  1044: ldc             -60030267
        //  1046: goto            1051
        //  1049: ldc             158378709
        //  1051: ldc             1437685583
        //  1053: ixor           
        //  1054: lookupswitch {
        //          -1445112438: 1867
        //          1311739912: 1049
        //          default: 1080
        //        }
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1087: goto            1091
        //  1090: athrow         
        //  1091: aload           12
        //  1093: iconst_0       
        //  1094: faload         
        //  1095: aload           12
        //  1097: iconst_1       
        //  1098: faload         
        //  1099: aload           12
        //  1101: iconst_2       
        //  1102: faload         
        //  1103: aload           12
        //  1105: iconst_3       
        //  1106: faload         
        //  1107: getstatic       dev/nuker/pyro/fc.0:I
        //  1110: ifeq            1118
        //  1113: ldc             29899594
        //  1115: goto            1120
        //  1118: ldc             -1937250662
        //  1120: ldc             -1966133347
        //  1122: ixor           
        //  1123: lookupswitch {
        //          -1962470185: 1891
        //          497034154: 1118
        //          default: 1148
        //        }
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: getstatic       dev/nuker/pyro/fc.0:I
        //  1162: ifeq            1170
        //  1165: ldc             513203930
        //  1167: goto            1173
        //  1170: ldc_w           1829266834
        //  1173: ldc_w           -1303848940
        //  1176: ixor           
        //  1177: lookupswitch {
        //          -1394735410: 1869
        //          -1386062965: 1170
        //          default: 1204
        //        }
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: fload           11
        //  1217: fstore          8
        //  1219: iinc            9, 1
        //  1222: goto            203
        //  1225: iload_1        
        //  1226: i2f            
        //  1227: fload           5
        //  1229: iload_3        
        //  1230: i2f            
        //  1231: fmul           
        //  1232: fadd           
        //  1233: ldc             0.5
        //  1235: fsub           
        //  1236: fstore          9
        //  1238: aload           7
        //  1240: getstatic       dev/nuker/pyro/fc.1:I
        //  1243: ifeq            1252
        //  1246: ldc_w           2139877216
        //  1249: goto            1255
        //  1252: ldc_w           1613418015
        //  1255: ldc_w           -1467399328
        //  1258: ixor           
        //  1259: lookupswitch {
        //          -928805505: 1284
        //          -687690752: 1252
        //          default: 1879
        //        }
        //  1284: fload           9
        //  1286: f2d            
        //  1287: iload_2        
        //  1288: iload           4
        //  1290: iadd           
        //  1291: i2d            
        //  1292: dconst_1       
        //  1293: dadd           
        //  1294: dconst_0       
        //  1295: getstatic       dev/nuker/pyro/fc.c:I
        //  1298: ifge            1307
        //  1301: ldc_w           -1860941877
        //  1304: goto            1310
        //  1307: ldc_w           1118519013
        //  1310: ldc_w           567476979
        //  1313: ixor           
        //  1314: lookupswitch {
        //          -1329117896: 1897
        //          1656656963: 1307
        //          default: 1340
        //        }
        //  1340: goto            1344
        //  1343: athrow         
        //  1344: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1347: goto            1351
        //  1350: athrow         
        //  1351: sipush          255
        //  1354: sipush          255
        //  1357: sipush          255
        //  1360: sipush          255
        //  1363: getstatic       dev/nuker/pyro/fc.0:I
        //  1366: ifeq            1375
        //  1369: ldc_w           39326929
        //  1372: goto            1378
        //  1375: ldc_w           -1168529687
        //  1378: ldc_w           -957439399
        //  1381: ixor           
        //  1382: lookupswitch {
        //          -994658680: 1877
        //          906543465: 1375
        //          default: 1408
        //        }
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1415: goto            1419
        //  1418: athrow         
        //  1419: goto            1423
        //  1422: athrow         
        //  1423: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1426: goto            1430
        //  1429: athrow         
        //  1430: aload           7
        //  1432: fload           9
        //  1434: f2d            
        //  1435: dconst_1       
        //  1436: dadd           
        //  1437: getstatic       dev/nuker/pyro/fc.0:I
        //  1440: ifeq            1449
        //  1443: ldc_w           1835998152
        //  1446: goto            1452
        //  1449: ldc_w           -1243669630
        //  1452: ldc_w           -1735328970
        //  1455: ixor           
        //  1456: lookupswitch {
        //          -229190102: 1449
        //          -167780098: 1907
        //          default: 1484
        //        }
        //  1484: iload_2        
        //  1485: getstatic       dev/nuker/pyro/fc.c:I
        //  1488: ifge            1497
        //  1491: ldc_w           1031056448
        //  1494: goto            1500
        //  1497: ldc_w           -722498684
        //  1500: ldc_w           -1463504814
        //  1503: ixor           
        //  1504: lookupswitch {
        //          -1783620590: 1497
        //          2083208150: 1532
        //          default: 1887
        //        }
        //  1532: iload           4
        //  1534: iadd           
        //  1535: i2d            
        //  1536: dconst_1       
        //  1537: dadd           
        //  1538: dconst_0       
        //  1539: goto            1543
        //  1542: athrow         
        //  1543: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1546: goto            1550
        //  1549: athrow         
        //  1550: sipush          255
        //  1553: sipush          255
        //  1556: sipush          255
        //  1559: sipush          255
        //  1562: goto            1566
        //  1565: athrow         
        //  1566: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1569: goto            1573
        //  1572: athrow         
        //  1573: goto            1577
        //  1576: athrow         
        //  1577: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1580: goto            1584
        //  1583: athrow         
        //  1584: aload           7
        //  1586: fload           9
        //  1588: f2d            
        //  1589: dconst_1       
        //  1590: dadd           
        //  1591: getstatic       dev/nuker/pyro/fc.0:I
        //  1594: ifeq            1603
        //  1597: ldc_w           -737768756
        //  1600: goto            1606
        //  1603: ldc_w           869508319
        //  1606: ldc_w           691160944
        //  1609: ixor           
        //  1610: lookupswitch {
        //          -46871108: 1603
        //          451011503: 1636
        //          default: 1863
        //        }
        //  1636: iload_2        
        //  1637: i2d            
        //  1638: dconst_1       
        //  1639: dsub           
        //  1640: dconst_0       
        //  1641: getstatic       dev/nuker/pyro/fc.1:I
        //  1644: ifeq            1653
        //  1647: ldc_w           906681097
        //  1650: goto            1656
        //  1653: ldc_w           1311049633
        //  1656: ldc_w           -1655112408
        //  1659: ixor           
        //  1660: lookupswitch {
        //          -1420679647: 1911
        //          -806102139: 1653
        //          default: 1688
        //        }
        //  1688: goto            1692
        //  1691: athrow         
        //  1692: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1695: goto            1699
        //  1698: athrow         
        //  1699: sipush          255
        //  1702: sipush          255
        //  1705: sipush          255
        //  1708: sipush          255
        //  1711: goto            1715
        //  1714: athrow         
        //  1715: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1718: goto            1722
        //  1721: athrow         
        //  1722: goto            1726
        //  1725: athrow         
        //  1726: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1729: goto            1733
        //  1732: athrow         
        //  1733: aload           7
        //  1735: fload           9
        //  1737: f2d            
        //  1738: iload_2        
        //  1739: i2d            
        //  1740: dconst_1       
        //  1741: dsub           
        //  1742: dconst_0       
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1750: goto            1754
        //  1753: athrow         
        //  1754: sipush          255
        //  1757: sipush          255
        //  1760: sipush          255
        //  1763: sipush          255
        //  1766: goto            1770
        //  1769: athrow         
        //  1770: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1773: goto            1777
        //  1776: athrow         
        //  1777: goto            1781
        //  1780: athrow         
        //  1781: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1784: goto            1788
        //  1787: athrow         
        //  1788: aload           6
        //  1790: goto            1794
        //  1793: athrow         
        //  1794: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //  1797: goto            1801
        //  1800: athrow         
        //  1801: getstatic       dev/nuker/pyro/fc.c:I
        //  1804: ifge            1813
        //  1807: ldc_w           -1022531483
        //  1810: goto            1816
        //  1813: ldc_w           1851811094
        //  1816: ldc_w           -1328054083
        //  1819: ixor           
        //  1820: lookupswitch {
        //          608693489: 1813
        //          1943726296: 1885
        //          default: 1848
        //        }
        //  1848: aload_0        
        //  1849: goto            1853
        //  1852: athrow         
        //  1853: invokespecial   dev/nuker/pyro/f3V.c:()V
        //  1856: goto            1860
        //  1859: athrow         
        //  1860: return         
        //  1861: aconst_null    
        //  1862: athrow         
        //  1863: aconst_null    
        //  1864: athrow         
        //  1865: aconst_null    
        //  1866: athrow         
        //  1867: aconst_null    
        //  1868: athrow         
        //  1869: aconst_null    
        //  1870: athrow         
        //  1871: aconst_null    
        //  1872: athrow         
        //  1873: aconst_null    
        //  1874: athrow         
        //  1875: aconst_null    
        //  1876: athrow         
        //  1877: aconst_null    
        //  1878: athrow         
        //  1879: aconst_null    
        //  1880: athrow         
        //  1881: aconst_null    
        //  1882: athrow         
        //  1883: aconst_null    
        //  1884: athrow         
        //  1885: aconst_null    
        //  1886: athrow         
        //  1887: aconst_null    
        //  1888: athrow         
        //  1889: aconst_null    
        //  1890: athrow         
        //  1891: aconst_null    
        //  1892: athrow         
        //  1893: aconst_null    
        //  1894: athrow         
        //  1895: aconst_null    
        //  1896: athrow         
        //  1897: aconst_null    
        //  1898: athrow         
        //  1899: aconst_null    
        //  1900: athrow         
        //  1901: aconst_null    
        //  1902: athrow         
        //  1903: aconst_null    
        //  1904: athrow         
        //  1905: aconst_null    
        //  1906: athrow         
        //  1907: aconst_null    
        //  1908: athrow         
        //  1909: aconst_null    
        //  1910: athrow         
        //  1911: aconst_null    
        //  1912: athrow         
        //  1913: aconst_null    
        //  1914: athrow         
        //  1915: pop            
        //  1916: goto            24
        //  1919: pop            
        //  1920: aconst_null    
        //  1921: goto            1915
        //  1924: dup            
        //  1925: ifnull          1915
        //  1928: checkcast       Ljava/lang/Throwable;
        //  1931: athrow         
        //  1932: dup            
        //  1933: ifnull          1919
        //  1936: checkcast       Ljava/lang/Throwable;
        //  1939: athrow         
        //  1940: aconst_null    
        //  1941: athrow         
        //    StackMapTable: 00 F3 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 06 07 00 03 01 01 01 01 02 00 00 42 07 00 55 00 45 07 00 1D 40 07 00 B6 4A 07 00 B6 FF 00 01 00 06 07 00 03 01 01 01 01 02 00 02 07 00 B6 01 5B 07 00 B6 FF 00 06 00 07 07 00 03 01 01 01 01 02 07 00 B6 00 01 07 00 1D 40 07 00 B6 45 07 00 1D 40 07 00 63 FF 00 0D 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 01 07 00 03 FF 00 01 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 01 5C 07 00 03 44 07 00 11 FF 00 00 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 45 07 00 1D 00 FF 00 0E 00 09 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 00 01 01 FF 00 01 00 09 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 00 02 01 01 5D 01 FD 00 06 01 01 FF 00 1B 00 0C 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 00 01 07 00 51 FF 00 00 00 0C 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FF 00 14 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 FF 00 01 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 06 07 00 CE 02 02 02 02 01 FF 00 1D 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 42 07 00 1D FF 00 00 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB 4A 07 00 AB FF 00 01 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 02 07 00 AB 01 5B 07 00 AB FF 00 0F 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 FF 00 0E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 0E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 0A 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 FF 00 17 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 16 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 46 07 00 43 FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 4B 40 07 00 63 45 07 00 1D 00 FF 00 1F 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 12 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 0E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 FF 00 0E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 42 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5B 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 FF 00 16 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 02 01 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 01 FF 00 0D 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 02 02 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 02 FF 00 14 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 0D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 1A 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4A 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 42 07 00 4B 40 07 00 63 45 07 00 1D 00 F8 00 09 FF 00 1A 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 01 07 00 63 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 01 5C 07 00 63 FF 00 16 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 03 03 03 01 FF 00 1D 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 42 07 00 47 FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 17 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 06 07 00 63 01 01 01 01 01 FF 00 1D 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 42 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 FF 00 12 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 03 07 00 63 03 01 FF 00 1F 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 0C 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 03 07 00 63 03 01 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 01 01 FF 00 1F 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 03 07 00 63 03 01 FF 00 09 00 00 00 01 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4E 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 01 07 00 63 45 07 00 1D 00 FF 00 12 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 03 07 00 63 03 01 FF 00 1D 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 10 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 03 03 03 01 FF 00 1F 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4E 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4C 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0E 00 00 00 01 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 44 07 00 0F 40 07 00 B6 45 07 00 1D 00 0B 42 01 1F 43 07 00 53 40 07 00 03 45 07 00 1D 00 FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 01 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 41 07 00 63 FF 00 01 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 01 07 00 AB FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 05 07 00 63 01 01 01 01 41 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 00 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 03 07 00 63 03 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 01 07 00 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 02 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 02 07 00 63 03 FF 00 01 00 06 07 00 03 01 01 01 01 02 00 01 07 00 B6 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 02 01 00 04 07 00 63 03 03 03 FF 00 01 00 09 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 00 01 01 FF 00 01 00 06 07 00 03 01 01 01 01 02 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1924   1932   Any
        //  1924   1932   1924   1932   Any
        //  1940   1942   3      8      Any
        //  27     34     34     35     Any
        //  28     34     34     35     Any
        //  28     34     3      8      Ljava/lang/ClassCastException;
        //  28     34     27     28     Ljava/lang/IllegalStateException;
        //  27     34     34     35     Ljava/lang/StringIndexOutOfBoundsException;
        //  83     90     90     91     Any
        //  84     90     83     84     Any
        //  83     90     3      8      Ljava/lang/NullPointerException;
        //  83     90     83     84     Any
        //  83     90     3      8      Ljava/lang/NullPointerException;
        //  141    148    148    149    Any
        //  141    148    141    142    Ljava/lang/EnumConstantNotPresentException;
        //  141    148    148    149    Ljava/lang/AssertionError;
        //  141    148    3      8      Any
        //  141    148    141    142    Ljava/lang/EnumConstantNotPresentException;
        //  231    238    238    239    Any
        //  232    238    3      8      Ljava/util/ConcurrentModificationException;
        //  231    238    3      8      Ljava/lang/AssertionError;
        //  232    238    231    232    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  231    238    238    239    Ljava/lang/RuntimeException;
        //  295    302    302    303    Any
        //  295    302    3      8      Ljava/lang/UnsupportedOperationException;
        //  296    302    3      8      Any
        //  296    302    295    296    Any
        //  295    302    302    303    Any
        //  360    367    367    368    Any
        //  360    367    367    368    Any
        //  361    367    3      8      Ljava/lang/NullPointerException;
        //  360    367    360    361    Ljava/util/NoSuchElementException;
        //  361    367    360    361    Any
        //  520    526    526    527    Any
        //  520    526    526    527    Ljava/lang/StringIndexOutOfBoundsException;
        //  520    526    3      8      Any
        //  520    526    3      8      Any
        //  520    526    526    527    Ljava/lang/IndexOutOfBoundsException;
        //  530    537    537    538    Any
        //  531    537    537    538    Any
        //  530    537    530    531    Ljava/lang/EnumConstantNotPresentException;
        //  531    537    530    531    Ljava/lang/IllegalStateException;
        //  531    537    530    531    Any
        //  595    602    602    603    Any
        //  596    602    595    596    Ljava/lang/IllegalStateException;
        //  595    602    595    596    Any
        //  595    602    595    596    Any
        //  595    602    595    596    Any
        //  663    670    670    671    Any
        //  664    670    670    671    Ljava/lang/NullPointerException;
        //  663    670    3      8      Ljava/lang/ClassCastException;
        //  663    670    663    664    Ljava/util/NoSuchElementException;
        //  664    670    670    671    Ljava/lang/ClassCastException;
        //  674    681    681    682    Any
        //  674    681    674    675    Ljava/lang/RuntimeException;
        //  674    681    681    682    Any
        //  675    681    681    682    Ljava/lang/NumberFormatException;
        //  675    681    674    675    Ljava/lang/IllegalStateException;
        //  715    721    721    722    Any
        //  715    721    3      8      Any
        //  715    721    3      8      Any
        //  715    721    3      8      Ljava/lang/IllegalStateException;
        //  715    721    721    722    Any
        //  871    878    878    879    Any
        //  871    878    871    872    Any
        //  871    878    871    872    Ljava/lang/UnsupportedOperationException;
        //  871    878    3      8      Any
        //  871    878    878    879    Any
        //  923    930    930    931    Any
        //  924    930    930    931    Ljava/lang/UnsupportedOperationException;
        //  924    930    3      8      Any
        //  923    930    923    924    Any
        //  923    930    930    931    Any
        //  1083   1090   1090   1091   Any
        //  1083   1090   1090   1091   Ljava/lang/NullPointerException;
        //  1083   1090   1083   1084   Ljava/lang/IllegalArgumentException;
        //  1083   1090   3      8      Ljava/lang/ArithmeticException;
        //  1084   1090   1090   1091   Any
        //  1152   1158   1158   1159   Any
        //  1152   1158   1158   1159   Ljava/util/ConcurrentModificationException;
        //  1152   1158   3      8      Any
        //  1152   1158   1158   1159   Ljava/lang/UnsupportedOperationException;
        //  1152   1158   3      8      Any
        //  1207   1214   1214   1215   Any
        //  1207   1214   1207   1208   Ljava/util/ConcurrentModificationException;
        //  1208   1214   1214   1215   Any
        //  1207   1214   1207   1208   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1208   1214   1207   1208   Ljava/lang/IllegalStateException;
        //  1343   1350   1350   1351   Any
        //  1344   1350   1343   1344   Ljava/util/ConcurrentModificationException;
        //  1344   1350   1350   1351   Any
        //  1344   1350   3      8      Ljava/util/ConcurrentModificationException;
        //  1344   1350   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1411   1418   1418   1419   Any
        //  1412   1418   1411   1412   Any
        //  1411   1418   1411   1412   Ljava/lang/ClassCastException;
        //  1412   1418   1418   1419   Ljava/lang/NegativeArraySizeException;
        //  1412   1418   3      8      Any
        //  1422   1429   1429   1430   Any
        //  1423   1429   1429   1430   Any
        //  1423   1429   3      8      Ljava/util/ConcurrentModificationException;
        //  1423   1429   1422   1423   Any
        //  1422   1429   1429   1430   Any
        //  1543   1549   1549   1550   Any
        //  1543   1549   1549   1550   Ljava/lang/ArithmeticException;
        //  1543   1549   1549   1550   Any
        //  1543   1549   3      8      Ljava/util/NoSuchElementException;
        //  1543   1549   1549   1550   Any
        //  1565   1572   1572   1573   Any
        //  1565   1572   3      8      Any
        //  1566   1572   1565   1566   Any
        //  1566   1572   3      8      Any
        //  1565   1572   3      8      Any
        //  1577   1583   1583   1584   Any
        //  1577   1583   3      8      Any
        //  1577   1583   1583   1584   Ljava/lang/ClassCastException;
        //  1577   1583   3      8      Ljava/lang/RuntimeException;
        //  1577   1583   3      8      Any
        //  1691   1698   1698   1699   Any
        //  1692   1698   3      8      Ljava/util/NoSuchElementException;
        //  1691   1698   1691   1692   Ljava/lang/ArithmeticException;
        //  1692   1698   1698   1699   Any
        //  1691   1698   1691   1692   Any
        //  1714   1721   1721   1722   Any
        //  1715   1721   1714   1715   Any
        //  1714   1721   1721   1722   Ljava/lang/NumberFormatException;
        //  1714   1721   3      8      Any
        //  1715   1721   3      8      Ljava/lang/UnsupportedOperationException;
        //  1725   1732   1732   1733   Any
        //  1725   1732   1732   1733   Any
        //  1725   1732   1725   1726   Any
        //  1725   1732   1732   1733   Any
        //  1725   1732   1725   1726   Any
        //  1746   1753   1753   1754   Any
        //  1747   1753   1746   1747   Any
        //  1747   1753   1746   1747   Ljava/lang/ArithmeticException;
        //  1747   1753   1753   1754   Ljava/util/NoSuchElementException;
        //  1747   1753   3      8      Any
        //  1770   1776   1776   1777   Any
        //  1770   1776   3      8      Any
        //  1770   1776   1776   1777   Ljava/lang/IndexOutOfBoundsException;
        //  1770   1776   1776   1777   Ljava/lang/RuntimeException;
        //  1770   1776   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1780   1787   1787   1788   Any
        //  1781   1787   3      8      Any
        //  1781   1787   1780   1781   Any
        //  1781   1787   1787   1788   Any
        //  1781   1787   3      8      Ljava/util/ConcurrentModificationException;
        //  1793   1800   1800   1801   Any
        //  1794   1800   1793   1794   Ljava/lang/NegativeArraySizeException;
        //  1794   1800   1800   1801   Any
        //  1794   1800   1800   1801   Ljava/lang/ArithmeticException;
        //  1794   1800   1800   1801   Any
        //  1852   1859   1859   1860   Any
        //  1853   1859   1859   1860   Ljava/lang/NumberFormatException;
        //  1852   1859   1859   1860   Any
        //  1853   1859   1852   1853   Ljava/lang/UnsupportedOperationException;
        //  1852   1859   3      8      Any
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
    
    @Override
    public void c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2219
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2211
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2203
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: iload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/f3A.c:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: bipush          8
        //    41: getstatic       dev/nuker/pyro/fc.0:I
        //    44: ifeq            53
        //    47: ldc_w           -1392678132
        //    50: goto            56
        //    53: ldc_w           -1379433457
        //    56: ldc_w           1188040195
        //    59: ixor           
        //    60: lookupswitch {
        //          -366123761: 53
        //          -350778868: 88
        //          default: 2156
        //        }
        //    88: istore          4
        //    90: iconst_1       
        //    91: getstatic       dev/nuker/pyro/fc.c:I
        //    94: ifge            103
        //    97: ldc_w           1899141333
        //   100: goto            106
        //   103: ldc_w           -545898820
        //   106: ldc_w           -466541540
        //   109: ixor           
        //   110: lookupswitch {
        //          -1794917175: 103
        //          994515616: 136
        //          default: 2168
        //        }
        //   136: istore          5
        //   138: iload           5
        //   140: iconst_2       
        //   141: imul           
        //   142: iload           4
        //   144: iadd           
        //   145: i2f            
        //   146: aload_0        
        //   147: goto            151
        //   150: athrow         
        //   151: invokevirtual   dev/nuker/pyro/f3V.2:()F
        //   154: goto            158
        //   157: athrow         
        //   158: fadd           
        //   159: f2i            
        //   160: bipush          10
        //   162: isub           
        //   163: istore          6
        //   165: iload           4
        //   167: iload           5
        //   169: iadd           
        //   170: istore          7
        //   172: aload_0        
        //   173: goto            177
        //   176: athrow         
        //   177: invokevirtual   dev/nuker/pyro/f3V.1:()F
        //   180: goto            184
        //   183: athrow         
        //   184: getstatic       dev/nuker/pyro/fc.c:I
        //   187: ifge            196
        //   190: ldc_w           711780182
        //   193: goto            199
        //   196: ldc_w           2039740206
        //   199: ldc_w           -312653439
        //   202: ixor           
        //   203: lookupswitch {
        //          -953045289: 2178
        //          -19464575: 196
        //          default: 228
        //        }
        //   228: iload           5
        //   230: iconst_2       
        //   231: imul           
        //   232: i2f            
        //   233: fsub           
        //   234: ldc_w           0.41666666
        //   237: fmul           
        //   238: f2i            
        //   239: istore          8
        //   241: iload           8
        //   243: iload           5
        //   245: iconst_2       
        //   246: imul           
        //   247: iadd           
        //   248: i2f            
        //   249: getstatic       dev/nuker/pyro/fc.c:I
        //   252: ifge            261
        //   255: ldc_w           -1935748353
        //   258: goto            264
        //   261: ldc_w           327202279
        //   264: ldc_w           1651246359
        //   267: ixor           
        //   268: lookupswitch {
        //          -286074904: 2184
        //          904509203: 261
        //          default: 296
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokestatic    dev/nuker/pyro/fbs.4:()F
        //   303: goto            307
        //   306: athrow         
        //   307: fadd           
        //   308: ldc_w           3.0
        //   311: fadd           
        //   312: f2i            
        //   313: istore          9
        //   315: getstatic       dev/nuker/pyro/fc.0:I
        //   318: ifeq            327
        //   321: ldc_w           -242680637
        //   324: goto            330
        //   327: ldc_w           -922779732
        //   330: ldc_w           -2001305501
        //   333: ixor           
        //   334: lookupswitch {
        //          1078591439: 360
        //          2034138272: 327
        //          default: 2148
        //        }
        //   360: aload_0        
        //   361: goto            365
        //   364: athrow         
        //   365: invokevirtual   dev/nuker/pyro/f3V.1:()F
        //   368: goto            372
        //   371: athrow         
        //   372: getstatic       dev/nuker/pyro/fc.0:I
        //   375: ifeq            384
        //   378: ldc_w           1975657244
        //   381: goto            387
        //   384: ldc_w           171419850
        //   387: ldc_w           -687875435
        //   390: ixor           
        //   391: lookupswitch {
        //          -1556219511: 2146
        //          -67082098: 384
        //          default: 416
        //        }
        //   416: iload           5
        //   418: iconst_3       
        //   419: imul           
        //   420: i2f            
        //   421: fsub           
        //   422: iload           8
        //   424: i2f            
        //   425: fsub           
        //   426: goto            430
        //   429: athrow         
        //   430: invokestatic    dev/nuker/pyro/fbs.4:()F
        //   433: goto            437
        //   436: athrow         
        //   437: fsub           
        //   438: ldc_w           3.0
        //   441: fsub           
        //   442: f2i            
        //   443: istore          10
        //   445: iload           10
        //   447: iload           4
        //   449: isub           
        //   450: getstatic       dev/nuker/pyro/fc.1:I
        //   453: ifeq            462
        //   456: ldc_w           -850447450
        //   459: goto            465
        //   462: ldc_w           204891069
        //   465: ldc_w           -1602791740
        //   468: ixor           
        //   469: lookupswitch {
        //          -1405012615: 496
        //          1832412514: 462
        //          default: 2188
        //        }
        //   496: istore          11
        //   498: iload_1        
        //   499: iload           5
        //   501: if_icmplt       565
        //   504: getstatic       dev/nuker/pyro/fc.0:I
        //   507: ifeq            516
        //   510: ldc_w           491235796
        //   513: goto            519
        //   516: ldc_w           1746883022
        //   519: ldc_w           -1180261665
        //   522: ixor           
        //   523: lookupswitch {
        //          -1528755445: 516
        //          -776342767: 548
        //          default: 2142
        //        }
        //   548: iload_1        
        //   549: iload           5
        //   551: iload           8
        //   553: iadd           
        //   554: if_icmpgt       565
        //   557: aload_0        
        //   558: iconst_1       
        //   559: putfield        dev/nuker/pyro/f3V.c:I
        //   562: goto            2135
        //   565: iload_1        
        //   566: getstatic       dev/nuker/pyro/fc.c:I
        //   569: ifge            578
        //   572: ldc_w           -1261152205
        //   575: goto            581
        //   578: ldc_w           -2025029027
        //   581: ldc_w           -1631648977
        //   584: ixor           
        //   585: lookupswitch {
        //          435388786: 612
        //          711678748: 578
        //          default: 2164
        //        }
        //   612: iload           5
        //   614: iload           8
        //   616: iadd           
        //   617: iconst_3       
        //   618: iadd           
        //   619: if_icmplt       774
        //   622: iload_1        
        //   623: iload           5
        //   625: getstatic       dev/nuker/pyro/fc.0:I
        //   628: ifeq            637
        //   631: ldc_w           -445445899
        //   634: goto            640
        //   637: ldc_w           -1589868954
        //   640: ldc_w           1381848934
        //   643: ixor           
        //   644: lookupswitch {
        //          -1221697645: 2166
        //          -680267256: 637
        //          default: 672
        //        }
        //   672: iload           8
        //   674: iadd           
        //   675: iconst_3       
        //   676: iadd           
        //   677: iload           4
        //   679: iadd           
        //   680: if_icmpgt       689
        //   683: ldc_w           -329341785
        //   686: goto            692
        //   689: ldc_w           -329341788
        //   692: ldc_w           -1089039802
        //   695: ixor           
        //   696: tableswitch {
        //          -1500484158: 720
        //          -1500484157: 774
        //          default: 683
        //        }
        //   720: aload_0        
        //   721: iconst_2       
        //   722: getstatic       dev/nuker/pyro/fc.0:I
        //   725: ifeq            734
        //   728: ldc_w           1867780101
        //   731: goto            737
        //   734: ldc_w           1956539615
        //   737: ldc_w           474540223
        //   740: ixor           
        //   741: lookupswitch {
        //          1758889056: 768
        //          1931278522: 734
        //          default: 2138
        //        }
        //   768: putfield        dev/nuker/pyro/f3V.c:I
        //   771: goto            2135
        //   774: iload_1        
        //   775: iload           9
        //   777: iload           4
        //   779: iadd           
        //   780: if_icmplt       789
        //   783: ldc_w           1257885114
        //   786: goto            792
        //   789: ldc_w           1257885115
        //   792: ldc_w           165827960
        //   795: ixor           
        //   796: tableswitch {
        //          -2043203196: 820
        //          -2043203195: 1072
        //          default: 783
        //        }
        //   820: getstatic       dev/nuker/pyro/fc.c:I
        //   823: ifge            832
        //   826: ldc_w           656622309
        //   829: goto            835
        //   832: ldc_w           -1685332991
        //   835: ldc_w           -172875243
        //   838: ixor           
        //   839: lookupswitch {
        //          -762224400: 832
        //          1849294356: 864
        //          default: 2190
        //        }
        //   864: iload_1        
        //   865: iload           9
        //   867: iload           4
        //   869: iadd           
        //   870: getstatic       dev/nuker/pyro/fc.c:I
        //   873: ifge            882
        //   876: ldc_w           -172647154
        //   879: goto            885
        //   882: ldc_w           -974206775
        //   885: ldc_w           -400908832
        //   888: ixor           
        //   889: lookupswitch {
        //          498008302: 882
        //          770987305: 916
        //          default: 2136
        //        }
        //   916: iload           11
        //   918: iadd           
        //   919: if_icmpgt       1072
        //   922: iload_2        
        //   923: iload           6
        //   925: if_icmplt       1072
        //   928: iload_2        
        //   929: getstatic       dev/nuker/pyro/fc.c:I
        //   932: ifge            941
        //   935: ldc_w           -246913083
        //   938: goto            944
        //   941: ldc_w           -222622484
        //   944: ldc_w           89169133
        //   947: ixor           
        //   948: lookupswitch {
        //          -199689432: 941
        //          -135557119: 976
        //          default: 2172
        //        }
        //   976: iload           6
        //   978: iload           4
        //   980: iadd           
        //   981: if_icmpgt       990
        //   984: ldc_w           866672918
        //   987: goto            993
        //   990: ldc_w           866672919
        //   993: ldc_w           -1644991016
        //   996: ixor           
        //   997: tableswitch {
        //          1555437980: 1020
        //          1555437981: 1072
        //          default: 984
        //        }
        //  1020: getstatic       dev/nuker/pyro/fc.1:I
        //  1023: ifeq            1032
        //  1026: ldc_w           571883101
        //  1029: goto            1035
        //  1032: ldc_w           -756501956
        //  1035: ldc_w           -595005851
        //  1038: ixor           
        //  1039: lookupswitch {
        //          -759663354: 1032
        //          -23146440: 2176
        //          default: 1064
        //        }
        //  1064: aload_0        
        //  1065: iconst_3       
        //  1066: putfield        dev/nuker/pyro/f3V.c:I
        //  1069: goto            2135
        //  1072: iload_1        
        //  1073: iload           9
        //  1075: iload           4
        //  1077: iadd           
        //  1078: if_icmplt       1248
        //  1081: iload_1        
        //  1082: iload           9
        //  1084: iload           4
        //  1086: iadd           
        //  1087: getstatic       dev/nuker/pyro/fc.0:I
        //  1090: ifeq            1099
        //  1093: ldc_w           1770151548
        //  1096: goto            1102
        //  1099: ldc_w           961016648
        //  1102: ldc_w           1391015260
        //  1105: ixor           
        //  1106: lookupswitch {
        //          996895520: 2158
        //          2139921078: 1099
        //          default: 1132
        //        }
        //  1132: iload           11
        //  1134: iadd           
        //  1135: if_icmpgt       1144
        //  1138: ldc_w           -792636101
        //  1141: goto            1147
        //  1144: ldc_w           -792636102
        //  1147: ldc_w           325511875
        //  1150: ixor           
        //  1151: tableswitch {
        //          -2024833040: 1172
        //          -2024833039: 1248
        //          default: 1138
        //        }
        //  1172: iload_2        
        //  1173: getstatic       dev/nuker/pyro/fc.c:I
        //  1176: ifge            1185
        //  1179: ldc_w           1060859543
        //  1182: goto            1188
        //  1185: ldc_w           1356351051
        //  1188: ldc_w           372316538
        //  1191: ixor           
        //  1192: lookupswitch {
        //          688551917: 1185
        //          1189699377: 1220
        //          default: 2160
        //        }
        //  1220: iload           6
        //  1222: iload           7
        //  1224: iadd           
        //  1225: if_icmplt       1248
        //  1228: iload_2        
        //  1229: iload           6
        //  1231: iload           4
        //  1233: iadd           
        //  1234: iload           7
        //  1236: iadd           
        //  1237: if_icmpgt       1248
        //  1240: aload_0        
        //  1241: iconst_4       
        //  1242: putfield        dev/nuker/pyro/f3V.c:I
        //  1245: goto            2135
        //  1248: iload_1        
        //  1249: getstatic       dev/nuker/pyro/fc.1:I
        //  1252: ifeq            1261
        //  1255: ldc_w           -502425902
        //  1258: goto            1264
        //  1261: ldc_w           1090488346
        //  1264: ldc_w           -1535616241
        //  1267: ixor           
        //  1268: lookupswitch {
        //          -353280986: 1261
        //          1182125533: 2162
        //          default: 1296
        //        }
        //  1296: iload           9
        //  1298: iload           4
        //  1300: iadd           
        //  1301: if_icmplt       1488
        //  1304: iload_1        
        //  1305: iload           9
        //  1307: iload           4
        //  1309: iadd           
        //  1310: iload           11
        //  1312: iadd           
        //  1313: if_icmpgt       1488
        //  1316: iload_2        
        //  1317: getstatic       dev/nuker/pyro/fc.1:I
        //  1320: ifeq            1329
        //  1323: ldc_w           -323655078
        //  1326: goto            1332
        //  1329: ldc_w           1454164063
        //  1332: ldc_w           40339265
        //  1335: ixor           
        //  1336: lookupswitch {
        //          -288166629: 2170
        //          133931507: 1329
        //          default: 1364
        //        }
        //  1364: iload           6
        //  1366: iload           7
        //  1368: iconst_2       
        //  1369: imul           
        //  1370: iadd           
        //  1371: if_icmplt       1488
        //  1374: getstatic       dev/nuker/pyro/fc.0:I
        //  1377: ifeq            1386
        //  1380: ldc_w           -505952918
        //  1383: goto            1389
        //  1386: ldc_w           -1404218697
        //  1389: ldc_w           -227629734
        //  1392: ixor           
        //  1393: lookupswitch {
        //          330915888: 1386
        //          1579415533: 1420
        //          default: 2174
        //        }
        //  1420: iload_2        
        //  1421: iload           6
        //  1423: iload           4
        //  1425: iadd           
        //  1426: getstatic       dev/nuker/pyro/fc.1:I
        //  1429: ifeq            1438
        //  1432: ldc_w           1180990490
        //  1435: goto            1441
        //  1438: ldc_w           321990967
        //  1441: ldc_w           -1829044092
        //  1444: ixor           
        //  1445: lookupswitch {
        //          -2117455437: 1472
        //          -727745378: 1438
        //          default: 2152
        //        }
        //  1472: iload           7
        //  1474: iconst_2       
        //  1475: imul           
        //  1476: iadd           
        //  1477: if_icmpgt       1488
        //  1480: aload_0        
        //  1481: iconst_5       
        //  1482: putfield        dev/nuker/pyro/f3V.c:I
        //  1485: goto            2135
        //  1488: iload_1        
        //  1489: iload           9
        //  1491: iload           4
        //  1493: iadd           
        //  1494: if_icmplt       1503
        //  1497: ldc_w           464334545
        //  1500: goto            1506
        //  1503: ldc_w           464334550
        //  1506: ldc_w           -2003010230
        //  1509: ixor           
        //  1510: tableswitch {
        //          643999542: 1532
        //          643999543: 1741
        //          default: 1497
        //        }
        //  1532: iload_1        
        //  1533: iload           9
        //  1535: iload           4
        //  1537: iadd           
        //  1538: iload           11
        //  1540: iadd           
        //  1541: if_icmpgt       1550
        //  1544: ldc_w           303459265
        //  1547: goto            1553
        //  1550: ldc_w           303459266
        //  1553: ldc_w           -735949368
        //  1556: ixor           
        //  1557: tableswitch {
        //          -1939321838: 1580
        //          -1939321837: 1741
        //          default: 1544
        //        }
        //  1580: iload_2        
        //  1581: iload           6
        //  1583: iload           7
        //  1585: iconst_3       
        //  1586: imul           
        //  1587: iadd           
        //  1588: if_icmplt       1741
        //  1591: getstatic       dev/nuker/pyro/fc.c:I
        //  1594: ifge            1603
        //  1597: ldc_w           1344937270
        //  1600: goto            1606
        //  1603: ldc_w           1436916814
        //  1606: ldc_w           -1345097710
        //  1609: ixor           
        //  1610: lookupswitch {
        //          -430812: 2180
        //          708553538: 1603
        //          default: 1636
        //        }
        //  1636: iload_2        
        //  1637: iload           6
        //  1639: getstatic       dev/nuker/pyro/fc.1:I
        //  1642: ifeq            1651
        //  1645: ldc_w           1791892985
        //  1648: goto            1654
        //  1651: ldc_w           1238363081
        //  1654: ldc_w           -2072564852
        //  1657: ixor           
        //  1658: lookupswitch {
        //          -714325321: 1651
        //          -289851787: 2186
        //          default: 1684
        //        }
        //  1684: iload           4
        //  1686: iadd           
        //  1687: iload           7
        //  1689: iconst_3       
        //  1690: imul           
        //  1691: iadd           
        //  1692: if_icmpgt       1701
        //  1695: ldc_w           1501724303
        //  1698: goto            1704
        //  1701: ldc_w           1501724300
        //  1704: ldc_w           -801856870
        //  1707: ixor           
        //  1708: tableswitch {
        //          325957674: 1732
        //          325957675: 1741
        //          default: 1695
        //        }
        //  1732: aload_0        
        //  1733: bipush          6
        //  1735: putfield        dev/nuker/pyro/f3V.c:I
        //  1738: goto            2135
        //  1741: iload_1        
        //  1742: iload           9
        //  1744: iload           4
        //  1746: iadd           
        //  1747: if_icmplt       1756
        //  1750: ldc_w           -892999619
        //  1753: goto            1759
        //  1756: ldc_w           -892999620
        //  1759: ldc_w           -963037703
        //  1762: ixor           
        //  1763: tableswitch {
        //          414825352: 1784
        //          414825353: 2135
        //          default: 1750
        //        }
        //  1784: iload_1        
        //  1785: getstatic       dev/nuker/pyro/fc.1:I
        //  1788: ifeq            1797
        //  1791: ldc_w           2096654134
        //  1794: goto            1800
        //  1797: ldc_w           -1185661343
        //  1800: ldc_w           1215804641
        //  1803: ixor           
        //  1804: lookupswitch {
        //          -249329024: 1832
        //          881841111: 1797
        //          default: 2192
        //        }
        //  1832: iload           9
        //  1834: iload           4
        //  1836: iadd           
        //  1837: iload           11
        //  1839: iadd           
        //  1840: if_icmpgt       1849
        //  1843: ldc_w           1440235657
        //  1846: goto            1852
        //  1849: ldc_w           1440235656
        //  1852: ldc_w           650838681
        //  1855: ixor           
        //  1856: tableswitch {
        //          -433683424: 1880
        //          -433683423: 2135
        //          default: 1843
        //        }
        //  1880: getstatic       dev/nuker/pyro/fc.c:I
        //  1883: ifge            1892
        //  1886: ldc_w           1807574894
        //  1889: goto            1895
        //  1892: ldc_w           -494648784
        //  1895: ldc_w           175219562
        //  1898: ixor           
        //  1899: lookupswitch {
        //          631018236: 1892
        //          1640809476: 2150
        //          default: 1924
        //        }
        //  1924: iload_2        
        //  1925: iload           6
        //  1927: iload           7
        //  1929: iconst_4       
        //  1930: imul           
        //  1931: iadd           
        //  1932: if_icmplt       2135
        //  1935: getstatic       dev/nuker/pyro/fc.c:I
        //  1938: ifge            1947
        //  1941: ldc_w           296761846
        //  1944: goto            1950
        //  1947: ldc_w           1377099475
        //  1950: ldc_w           1071055085
        //  1953: ixor           
        //  1954: lookupswitch {
        //          778516763: 1947
        //          1841552958: 1980
        //          default: 2140
        //        }
        //  1980: iload_2        
        //  1981: iload           6
        //  1983: iload           4
        //  1985: iadd           
        //  1986: getstatic       dev/nuker/pyro/fc.1:I
        //  1989: ifeq            1998
        //  1992: ldc_w           -418933979
        //  1995: goto            2001
        //  1998: ldc_w           -233792815
        //  2001: ldc_w           376403375
        //  2004: ixor           
        //  2005: lookupswitch {
        //          -244783478: 2154
        //          1370423384: 1998
        //          default: 2032
        //        }
        //  2032: iload           7
        //  2034: iconst_4       
        //  2035: imul           
        //  2036: iadd           
        //  2037: if_icmpgt       2135
        //  2040: getstatic       dev/nuker/pyro/fc.c:I
        //  2043: ifge            2052
        //  2046: ldc_w           1117267349
        //  2049: goto            2055
        //  2052: ldc_w           -1617951109
        //  2055: ldc_w           495514014
        //  2058: ixor           
        //  2059: lookupswitch {
        //          -1885178265: 2052
        //          1594938379: 2182
        //          default: 2084
        //        }
        //  2084: aload_0        
        //  2085: bipush          7
        //  2087: getstatic       dev/nuker/pyro/fc.0:I
        //  2090: ifeq            2099
        //  2093: ldc_w           -347570107
        //  2096: goto            2102
        //  2099: ldc_w           -1379638862
        //  2102: ldc_w           820974705
        //  2105: ixor           
        //  2106: lookupswitch {
        //          -1658096189: 2132
        //          -609774540: 2099
        //          default: 2144
        //        }
        //  2132: putfield        dev/nuker/pyro/f3V.c:I
        //  2135: return         
        //  2136: aconst_null    
        //  2137: athrow         
        //  2138: aconst_null    
        //  2139: athrow         
        //  2140: aconst_null    
        //  2141: athrow         
        //  2142: aconst_null    
        //  2143: athrow         
        //  2144: aconst_null    
        //  2145: athrow         
        //  2146: aconst_null    
        //  2147: athrow         
        //  2148: aconst_null    
        //  2149: athrow         
        //  2150: aconst_null    
        //  2151: athrow         
        //  2152: aconst_null    
        //  2153: athrow         
        //  2154: aconst_null    
        //  2155: athrow         
        //  2156: aconst_null    
        //  2157: athrow         
        //  2158: aconst_null    
        //  2159: athrow         
        //  2160: aconst_null    
        //  2161: athrow         
        //  2162: aconst_null    
        //  2163: athrow         
        //  2164: aconst_null    
        //  2165: athrow         
        //  2166: aconst_null    
        //  2167: athrow         
        //  2168: aconst_null    
        //  2169: athrow         
        //  2170: aconst_null    
        //  2171: athrow         
        //  2172: aconst_null    
        //  2173: athrow         
        //  2174: aconst_null    
        //  2175: athrow         
        //  2176: aconst_null    
        //  2177: athrow         
        //  2178: aconst_null    
        //  2179: athrow         
        //  2180: aconst_null    
        //  2181: athrow         
        //  2182: aconst_null    
        //  2183: athrow         
        //  2184: aconst_null    
        //  2185: athrow         
        //  2186: aconst_null    
        //  2187: athrow         
        //  2188: aconst_null    
        //  2189: athrow         
        //  2190: aconst_null    
        //  2191: athrow         
        //  2192: aconst_null    
        //  2193: athrow         
        //  2194: pop            
        //  2195: goto            24
        //  2198: pop            
        //  2199: aconst_null    
        //  2200: goto            2194
        //  2203: dup            
        //  2204: ifnull          2194
        //  2207: checkcast       Ljava/lang/Throwable;
        //  2210: athrow         
        //  2211: dup            
        //  2212: ifnull          2198
        //  2215: checkcast       Ljava/lang/Throwable;
        //  2218: athrow         
        //  2219: aconst_null    
        //  2220: athrow         
        //    StackMapTable: 00 C0 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 04 07 00 03 01 01 01 00 00 46 07 00 45 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 1D 00 4D 01 FF 00 02 00 04 07 00 03 01 01 01 00 02 01 01 5F 01 FF 00 0E 00 05 07 00 03 01 01 01 01 00 01 01 FF 00 02 00 05 07 00 03 01 01 01 01 00 02 01 01 5D 01 FF 00 0D 00 06 07 00 03 01 01 01 01 01 00 01 07 00 47 FF 00 00 00 06 07 00 03 01 01 01 01 01 00 02 02 07 00 03 45 07 00 1D FF 00 00 00 06 07 00 03 01 01 01 01 01 00 02 02 02 FF 00 11 00 08 07 00 03 01 01 01 01 01 01 01 00 01 07 00 1D 40 07 00 03 45 07 00 1D 40 02 4B 02 FF 00 02 00 08 07 00 03 01 01 01 01 01 01 01 00 02 02 01 5C 02 FF 00 20 00 09 07 00 03 01 01 01 01 01 01 01 01 00 01 02 FF 00 02 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 02 01 5F 02 42 07 00 1D 40 02 45 07 00 1D FF 00 00 00 09 07 00 03 01 01 01 01 01 01 01 01 00 02 02 02 FC 00 13 01 42 01 1D FF 00 03 00 00 00 01 07 00 1D FF 00 00 00 0A 07 00 03 01 01 01 01 01 01 01 01 01 00 01 07 00 03 45 07 00 1D 40 02 4B 02 FF 00 02 00 0A 07 00 03 01 01 01 01 01 01 01 01 01 00 02 02 01 5C 02 4C 07 00 4B 40 02 45 07 00 1D FF 00 00 00 0A 07 00 03 01 01 01 01 01 01 01 01 01 00 02 02 02 FF 00 18 00 0B 07 00 03 01 01 01 01 01 01 01 01 01 01 00 01 01 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5E 01 FC 00 13 01 42 01 1C 10 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5E 01 FF 00 18 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1F 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 0A 05 42 01 1B FF 00 0D 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 07 00 03 01 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 05 08 05 42 01 1B 0B 42 01 1C FF 00 11 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 58 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5F 01 07 05 42 01 1A 0B 42 01 1C 07 FF 00 1A 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1D 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 05 05 42 01 18 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5F 01 1B 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5F 01 60 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5F 01 15 42 01 1E FF 00 11 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 0F 08 05 42 01 19 0B 05 42 01 1A 16 42 01 1D FF 00 0E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1D 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 0A 05 42 01 1B 08 08 05 42 01 18 4C 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 5F 01 0A 05 42 01 1B 0B 42 01 1C 16 42 01 1D FF 00 11 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 13 42 01 1C FF 00 0E 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 02 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 07 00 03 01 FF 00 01 00 0A 07 00 03 01 01 01 01 01 01 01 01 01 00 01 02 01 FD 00 01 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 41 01 41 01 41 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 01 00 05 07 00 03 01 01 01 01 00 01 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 01 01 41 01 01 01 FF 00 01 00 08 07 00 03 01 01 01 01 01 01 01 00 01 02 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 00 01 FF 00 01 00 09 07 00 03 01 01 01 01 01 01 01 01 00 01 02 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 01 01 01 00 02 01 01 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 01 01 00 01 01 FC 00 01 01 41 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2203   2211   Ljava/util/ConcurrentModificationException;
        //  2203   2211   2203   2211   Any
        //  2219   2221   3      8      Any
        //  31     38     38     39     Any
        //  32     38     31     32     Ljava/lang/StringIndexOutOfBoundsException;
        //  32     38     31     32     Ljava/lang/IndexOutOfBoundsException;
        //  31     38     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  32     38     38     39     Ljava/util/NoSuchElementException;
        //  150    157    157    158    Any
        //  150    157    3      8      Ljava/lang/ArithmeticException;
        //  151    157    150    151    Ljava/util/ConcurrentModificationException;
        //  150    157    3      8      Ljava/lang/NegativeArraySizeException;
        //  151    157    3      8      Any
        //  176    183    183    184    Any
        //  176    183    3      8      Any
        //  176    183    176    177    Any
        //  177    183    176    177    Any
        //  176    183    176    177    Any
        //  299    306    306    307    Any
        //  299    306    3      8      Ljava/util/ConcurrentModificationException;
        //  299    306    306    307    Ljava/lang/IndexOutOfBoundsException;
        //  300    306    3      8      Ljava/util/NoSuchElementException;
        //  300    306    299    300    Any
        //  365    371    371    372    Any
        //  365    371    3      8      Ljava/lang/ArithmeticException;
        //  365    371    371    372    Ljava/util/ConcurrentModificationException;
        //  365    371    371    372    Any
        //  365    371    3      8      Any
        //  429    436    436    437    Any
        //  429    436    429    430    Ljava/lang/IllegalStateException;
        //  430    436    429    430    Ljava/lang/StringIndexOutOfBoundsException;
        //  430    436    429    430    Ljava/util/NoSuchElementException;
        //  430    436    436    437    Ljava/util/NoSuchElementException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:618)
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
    public void c() {
        fbS.dq(this, 943128878);
    }
    
    public void 0(final BufferBuilder bufferBuilder, final int n, final int n2, final int n3, final int n4, final float n5, final float[] array) {
        fbS.3C(this, 1988793195, bufferBuilder, n, n2, n3, n4, n5, array);
    }
    
    public f3V(final f0b c, final float n) {
        super(c.0(), 0.0f, 0.0f, n, 48.0f);
        this.c = 0;
        while (true) {
            int n2 = 0;
            Label_0035: {
                if (fc.0 != 0) {
                    n2 = 513946996;
                    break Label_0035;
                }
                n2 = -1420486766;
            }
            switch (n2 ^ 0xAD0F6355) {
                case 1948493884: {
                    continue;
                }
                default: {
                    this.c = c;
                    while (true) {
                        int n3 = 0;
                        Label_0084: {
                            if (fc.0 != 0) {
                                n3 = -2061973459;
                                break Label_0084;
                            }
                            n3 = -948172772;
                        }
                        switch (n3 ^ 0x54596B68) {
                            case -784227515: {
                                continue;
                            }
                            case -1826266252: {
                                this.c = (fS)c.3();
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
                case -1280485855: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public boolean c(final float p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3963
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            3955
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3947
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: bipush          8
        //    26: istore          4
        //    28: iconst_1       
        //    29: getstatic       dev/nuker/pyro/fc.c:I
        //    32: ifge            41
        //    35: ldc_w           314470703
        //    38: goto            44
        //    41: ldc_w           -5568728
        //    44: ldc_w           -433584243
        //    47: ixor           
        //    48: lookupswitch {
        //          -191465822: 41
        //          428015781: 76
        //          default: 3824
        //        }
        //    76: istore          5
        //    78: iload           5
        //    80: iconst_2       
        //    81: imul           
        //    82: iload           4
        //    84: iadd           
        //    85: i2f            
        //    86: aload_0        
        //    87: goto            91
        //    90: athrow         
        //    91: invokevirtual   dev/nuker/pyro/f3V.2:()F
        //    94: goto            98
        //    97: athrow         
        //    98: fadd           
        //    99: f2i            
        //   100: bipush          10
        //   102: isub           
        //   103: getstatic       dev/nuker/pyro/fc.1:I
        //   106: ifeq            115
        //   109: ldc_w           -862652798
        //   112: goto            118
        //   115: ldc_w           978023059
        //   118: ldc_w           -1600706461
        //   121: ixor           
        //   122: lookupswitch {
        //          -1696834832: 148
        //          1812192993: 115
        //          default: 3888
        //        }
        //   148: istore          6
        //   150: getstatic       dev/nuker/pyro/fc.0:I
        //   153: ifeq            162
        //   156: ldc_w           2075696961
        //   159: goto            165
        //   162: ldc_w           -1935450822
        //   165: ldc_w           585538531
        //   168: ixor           
        //   169: lookupswitch {
        //          -1371158823: 196
        //          1499333794: 162
        //          default: 3920
        //        }
        //   196: iload           4
        //   198: iload           5
        //   200: iadd           
        //   201: istore          7
        //   203: aload_0        
        //   204: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //   207: getstatic       dev/nuker/pyro/fc.c:I
        //   210: ifge            219
        //   213: ldc_w           -750659484
        //   216: goto            222
        //   219: ldc_w           1334171054
        //   222: ldc_w           -2075333566
        //   225: ixor           
        //   226: lookupswitch {
        //          630842333: 219
        //          1460483110: 3880
        //          default: 252
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokevirtual   dev/nuker/pyro/fS.a:()[F
        //   259: goto            263
        //   262: athrow         
        //   263: astore          8
        //   265: aload_0        
        //   266: goto            270
        //   269: athrow         
        //   270: invokevirtual   dev/nuker/pyro/f3V.1:()F
        //   273: goto            277
        //   276: athrow         
        //   277: getstatic       dev/nuker/pyro/fc.0:I
        //   280: ifeq            289
        //   283: ldc_w           2137068239
        //   286: goto            292
        //   289: ldc_w           73393464
        //   292: ldc_w           -685730594
        //   295: ixor           
        //   296: lookupswitch {
        //          -1472100847: 289
        //          -746622490: 324
        //          default: 3930
        //        }
        //   324: iload           5
        //   326: iconst_2       
        //   327: imul           
        //   328: i2f            
        //   329: fsub           
        //   330: ldc_w           0.41666666
        //   333: fmul           
        //   334: f2i            
        //   335: getstatic       dev/nuker/pyro/fc.1:I
        //   338: ifeq            347
        //   341: ldc_w           1539895701
        //   344: goto            350
        //   347: ldc_w           835639494
        //   350: ldc_w           -1569301712
        //   353: ixor           
        //   354: lookupswitch {
        //          -1537643029: 347
        //          -104944987: 3884
        //          default: 380
        //        }
        //   380: istore          9
        //   382: getstatic       dev/nuker/pyro/fc.c:I
        //   385: ifge            394
        //   388: ldc_w           2097655737
        //   391: goto            397
        //   394: ldc_w           1919957330
        //   397: ldc_w           -470003999
        //   400: ixor           
        //   401: lookupswitch {
        //          -1852231213: 394
        //          -1627659944: 3936
        //          default: 428
        //        }
        //   428: iload           9
        //   430: getstatic       dev/nuker/pyro/fc.c:I
        //   433: ifge            442
        //   436: ldc_w           34706142
        //   439: goto            445
        //   442: ldc_w           1859580075
        //   445: ldc_w           -596639292
        //   448: ixor           
        //   449: lookupswitch {
        //          -1297682065: 476
        //          -564030694: 442
        //          default: 3914
        //        }
        //   476: iload           5
        //   478: iconst_2       
        //   479: imul           
        //   480: iadd           
        //   481: i2f            
        //   482: goto            486
        //   485: athrow         
        //   486: invokestatic    dev/nuker/pyro/fbs.4:()F
        //   489: goto            493
        //   492: athrow         
        //   493: fadd           
        //   494: ldc_w           3.0
        //   497: fadd           
        //   498: f2i            
        //   499: istore          10
        //   501: aload_0        
        //   502: goto            506
        //   505: athrow         
        //   506: invokevirtual   dev/nuker/pyro/f3V.1:()F
        //   509: goto            513
        //   512: athrow         
        //   513: iload           5
        //   515: iconst_3       
        //   516: imul           
        //   517: i2f            
        //   518: fsub           
        //   519: iload           9
        //   521: i2f            
        //   522: fsub           
        //   523: getstatic       dev/nuker/pyro/fc.1:I
        //   526: ifeq            535
        //   529: ldc_w           -2105449320
        //   532: goto            538
        //   535: ldc_w           1985838003
        //   538: ldc_w           1698484050
        //   541: ixor           
        //   542: lookupswitch {
        //          -407000118: 535
        //          325170401: 568
        //          default: 3872
        //        }
        //   568: goto            572
        //   571: athrow         
        //   572: invokestatic    dev/nuker/pyro/fbs.4:()F
        //   575: goto            579
        //   578: athrow         
        //   579: fsub           
        //   580: ldc_w           3.0
        //   583: fsub           
        //   584: f2i            
        //   585: istore          11
        //   587: aload_0        
        //   588: iload           5
        //   590: iload           6
        //   592: iload           9
        //   594: iload           9
        //   596: aload           8
        //   598: iconst_0       
        //   599: faload         
        //   600: aload           8
        //   602: iconst_1       
        //   603: faload         
        //   604: getstatic       dev/nuker/pyro/fc.0:I
        //   607: ifeq            616
        //   610: ldc_w           -488694230
        //   613: goto            619
        //   616: ldc_w           635197516
        //   619: ldc_w           -948578322
        //   622: ixor           
        //   623: lookupswitch {
        //          156175498: 616
        //          631949764: 3846
        //          default: 648
        //        }
        //   648: aload           8
        //   650: iconst_2       
        //   651: faload         
        //   652: goto            656
        //   655: athrow         
        //   656: invokespecial   dev/nuker/pyro/f3V.c:(IIIIFFF)V
        //   659: goto            663
        //   662: athrow         
        //   663: aload_0        
        //   664: iload           5
        //   666: iload           9
        //   668: iadd           
        //   669: iconst_3       
        //   670: iadd           
        //   671: iload           6
        //   673: iload           4
        //   675: iload           9
        //   677: aload           8
        //   679: iconst_0       
        //   680: faload         
        //   681: getstatic       dev/nuker/pyro/fc.c:I
        //   684: ifge            693
        //   687: ldc_w           -1100926915
        //   690: goto            696
        //   693: ldc_w           1537450694
        //   696: ldc_w           -1981558037
        //   699: ixor           
        //   700: lookupswitch {
        //          931324630: 3898
        //          1408602906: 693
        //          default: 728
        //        }
        //   728: goto            732
        //   731: athrow         
        //   732: invokespecial   dev/nuker/pyro/f3V.0:(IIIIF)V
        //   735: goto            739
        //   738: athrow         
        //   739: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   742: aload           8
        //   744: iconst_0       
        //   745: faload         
        //   746: aload           8
        //   748: iconst_1       
        //   749: faload         
        //   750: aload           8
        //   752: iconst_2       
        //   753: faload         
        //   754: aload           8
        //   756: iconst_3       
        //   757: faload         
        //   758: goto            762
        //   761: athrow         
        //   762: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   765: goto            769
        //   768: athrow         
        //   769: getstatic       dev/nuker/pyro/fc.0:I
        //   772: ifeq            781
        //   775: ldc_w           853255763
        //   778: goto            784
        //   781: ldc_w           750279846
        //   784: ldc_w           -888464929
        //   787: ixor           
        //   788: lookupswitch {
        //          -407681671: 816
        //          -103759988: 781
        //          default: 3858
        //        }
        //   816: astore          12
        //   818: iload           11
        //   820: iload           4
        //   822: isub           
        //   823: istore          13
        //   825: ldc_w           "R"
        //   828: iload           10
        //   830: i2f            
        //   831: iload           6
        //   833: iconst_1       
        //   834: iadd           
        //   835: i2f            
        //   836: iconst_m1      
        //   837: goto            841
        //   840: athrow         
        //   841: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //   844: goto            848
        //   847: athrow         
        //   848: aload_0        
        //   849: iload           10
        //   851: iload           4
        //   853: iadd           
        //   854: getstatic       dev/nuker/pyro/fc.c:I
        //   857: ifge            866
        //   860: ldc_w           501785891
        //   863: goto            869
        //   866: ldc_w           1974246400
        //   869: ldc_w           136387367
        //   872: ixor           
        //   873: lookupswitch {
        //          365542916: 866
        //          2106427175: 900
        //          default: 3900
        //        }
        //   900: iload           6
        //   902: iload           13
        //   904: iload           4
        //   906: aload           12
        //   908: iconst_0       
        //   909: faload         
        //   910: aload           12
        //   912: iconst_1       
        //   913: faload         
        //   914: getstatic       dev/nuker/pyro/fc.0:I
        //   917: ifeq            926
        //   920: ldc_w           -2121650114
        //   923: goto            929
        //   926: ldc_w           407709823
        //   929: ldc_w           95419785
        //   932: ixor           
        //   933: lookupswitch {
        //          -2077897289: 926
        //          501405174: 960
        //          default: 3852
        //        }
        //   960: aload           12
        //   962: iconst_2       
        //   963: faload         
        //   964: aload           12
        //   966: iconst_3       
        //   967: faload         
        //   968: iconst_0       
        //   969: goto            973
        //   972: athrow         
        //   973: invokespecial   dev/nuker/pyro/f3V.c:(IIIIFFFFI)V
        //   976: goto            980
        //   979: athrow         
        //   980: ldc_w           "G"
        //   983: getstatic       dev/nuker/pyro/fc.0:I
        //   986: ifeq            995
        //   989: ldc_w           315900558
        //   992: goto            998
        //   995: ldc_w           -954944105
        //   998: ldc_w           1072497307
        //  1001: ixor           
        //  1002: lookupswitch {
        //          432276041: 995
        //          758726677: 3878
        //          default: 1028
        //        }
        //  1028: iload           10
        //  1030: i2f            
        //  1031: iload           6
        //  1033: iconst_1       
        //  1034: iadd           
        //  1035: iload           7
        //  1037: iadd           
        //  1038: i2f            
        //  1039: iconst_m1      
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1047: goto            1051
        //  1050: athrow         
        //  1051: getstatic       dev/nuker/pyro/fc.1:I
        //  1054: ifeq            1063
        //  1057: ldc_w           1405219419
        //  1060: goto            1066
        //  1063: ldc_w           -1551813358
        //  1066: ldc_w           -1614857426
        //  1069: ixor           
        //  1070: lookupswitch {
        //          -864106123: 1063
        //          1010699836: 1096
        //          default: 3834
        //        }
        //  1096: aload_0        
        //  1097: iload           10
        //  1099: iload           4
        //  1101: iadd           
        //  1102: iload           6
        //  1104: iload           7
        //  1106: iadd           
        //  1107: getstatic       dev/nuker/pyro/fc.c:I
        //  1110: ifge            1119
        //  1113: ldc_w           112678327
        //  1116: goto            1122
        //  1119: ldc_w           -1742723333
        //  1122: ldc_w           9835357
        //  1125: ixor           
        //  1126: lookupswitch {
        //          102844138: 3902
        //          1945541613: 1119
        //          default: 1152
        //        }
        //  1152: iload           13
        //  1154: iload           4
        //  1156: getstatic       dev/nuker/pyro/fc.1:I
        //  1159: ifeq            1168
        //  1162: ldc_w           1384540476
        //  1165: goto            1171
        //  1168: ldc_w           1192751569
        //  1171: ldc_w           -269113501
        //  1174: ixor           
        //  1175: lookupswitch {
        //          -1461561678: 1200
        //          -1116484001: 1168
        //          default: 3918
        //        }
        //  1200: aload           12
        //  1202: iconst_0       
        //  1203: faload         
        //  1204: aload           12
        //  1206: iconst_1       
        //  1207: faload         
        //  1208: getstatic       dev/nuker/pyro/fc.0:I
        //  1211: ifeq            1220
        //  1214: ldc_w           -721944257
        //  1217: goto            1223
        //  1220: ldc_w           183638430
        //  1223: ldc_w           -800052497
        //  1226: ixor           
        //  1227: lookupswitch {
        //          55260904: 1220
        //          78130128: 3926
        //          default: 1252
        //        }
        //  1252: aload           12
        //  1254: iconst_2       
        //  1255: faload         
        //  1256: aload           12
        //  1258: iconst_3       
        //  1259: faload         
        //  1260: iconst_1       
        //  1261: goto            1265
        //  1264: athrow         
        //  1265: invokespecial   dev/nuker/pyro/f3V.c:(IIIIFFFFI)V
        //  1268: goto            1272
        //  1271: athrow         
        //  1272: ldc_w           "B"
        //  1275: iload           10
        //  1277: i2f            
        //  1278: getstatic       dev/nuker/pyro/fc.0:I
        //  1281: ifeq            1290
        //  1284: ldc_w           -1926944204
        //  1287: goto            1293
        //  1290: ldc_w           225441972
        //  1293: ldc_w           -1113822923
        //  1296: ixor           
        //  1297: lookupswitch {
        //          -1326214783: 1324
        //          817447681: 1290
        //          default: 3932
        //        }
        //  1324: iload           6
        //  1326: iconst_1       
        //  1327: iadd           
        //  1328: iload           7
        //  1330: iconst_2       
        //  1331: imul           
        //  1332: iadd           
        //  1333: i2f            
        //  1334: iconst_m1      
        //  1335: getstatic       dev/nuker/pyro/fc.1:I
        //  1338: ifeq            1347
        //  1341: ldc_w           -613449920
        //  1344: goto            1350
        //  1347: ldc_w           1386392974
        //  1350: ldc_w           -1541362731
        //  1353: ixor           
        //  1354: lookupswitch {
        //          -308180155: 1347
        //          2135938197: 3922
        //          default: 1380
        //        }
        //  1380: goto            1384
        //  1383: athrow         
        //  1384: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1387: goto            1391
        //  1390: athrow         
        //  1391: getstatic       dev/nuker/pyro/fc.0:I
        //  1394: ifeq            1403
        //  1397: ldc_w           1920213234
        //  1400: goto            1406
        //  1403: ldc_w           768057958
        //  1406: ldc_w           643250522
        //  1409: ixor           
        //  1410: lookupswitch {
        //          194026300: 1436
        //          1411586472: 1403
        //          default: 3868
        //        }
        //  1436: aload_0        
        //  1437: getstatic       dev/nuker/pyro/fc.1:I
        //  1440: ifeq            1449
        //  1443: ldc_w           -1886447270
        //  1446: goto            1452
        //  1449: ldc_w           -1049205146
        //  1452: ldc_w           1523854888
        //  1455: ixor           
        //  1456: lookupswitch {
        //          -715442318: 3916
        //          -1780504: 1449
        //          default: 1484
        //        }
        //  1484: iload           10
        //  1486: iload           4
        //  1488: iadd           
        //  1489: iload           6
        //  1491: getstatic       dev/nuker/pyro/fc.c:I
        //  1494: ifge            1503
        //  1497: ldc_w           759872107
        //  1500: goto            1506
        //  1503: ldc_w           1292304922
        //  1506: ldc_w           -538621801
        //  1509: ixor           
        //  1510: lookupswitch {
        //          -1830663539: 1536
        //          -223350020: 1503
        //          default: 3828
        //        }
        //  1536: iload           7
        //  1538: iconst_2       
        //  1539: imul           
        //  1540: iadd           
        //  1541: iload           13
        //  1543: getstatic       dev/nuker/pyro/fc.1:I
        //  1546: ifeq            1555
        //  1549: ldc_w           -1525485493
        //  1552: goto            1558
        //  1555: ldc_w           -1536824261
        //  1558: ldc_w           -525506253
        //  1561: ixor           
        //  1562: lookupswitch {
        //          1170184568: 3870
        //          1931565242: 1555
        //          default: 1588
        //        }
        //  1588: iload           4
        //  1590: getstatic       dev/nuker/pyro/fc.c:I
        //  1593: ifge            1602
        //  1596: ldc_w           1702268763
        //  1599: goto            1605
        //  1602: ldc_w           -1798820205
        //  1605: ldc_w           -1512191128
        //  1608: ixor           
        //  1609: lookupswitch {
        //          -1357183157: 1602
        //          -1062517709: 3928
        //          default: 1636
        //        }
        //  1636: aload           12
        //  1638: iconst_0       
        //  1639: faload         
        //  1640: aload           12
        //  1642: iconst_1       
        //  1643: faload         
        //  1644: aload           12
        //  1646: iconst_2       
        //  1647: faload         
        //  1648: aload           12
        //  1650: iconst_3       
        //  1651: faload         
        //  1652: iconst_2       
        //  1653: goto            1657
        //  1656: athrow         
        //  1657: invokespecial   dev/nuker/pyro/f3V.c:(IIIIFFFFI)V
        //  1660: goto            1664
        //  1663: athrow         
        //  1664: ldc_w           "A"
        //  1667: iload           10
        //  1669: i2f            
        //  1670: iload           6
        //  1672: iconst_1       
        //  1673: iadd           
        //  1674: getstatic       dev/nuker/pyro/fc.c:I
        //  1677: ifge            1686
        //  1680: ldc_w           1784306146
        //  1683: goto            1689
        //  1686: ldc_w           -1214686835
        //  1689: ldc_w           -2067889832
        //  1692: ixor           
        //  1693: lookupswitch {
        //          -1281819255: 1686
        //          -286992198: 3874
        //          default: 1720
        //        }
        //  1720: iload           7
        //  1722: iconst_3       
        //  1723: imul           
        //  1724: iadd           
        //  1725: i2f            
        //  1726: iconst_m1      
        //  1727: goto            1731
        //  1730: athrow         
        //  1731: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  1734: goto            1738
        //  1737: athrow         
        //  1738: getstatic       dev/nuker/pyro/fc.1:I
        //  1741: ifeq            1750
        //  1744: ldc_w           188088533
        //  1747: goto            1753
        //  1750: ldc_w           -91519819
        //  1753: ldc_w           -214536376
        //  1756: ixor           
        //  1757: lookupswitch {
        //          -521149348: 1750
        //          -134189155: 3860
        //          default: 1784
        //        }
        //  1784: aload_0        
        //  1785: iload           10
        //  1787: iload           4
        //  1789: iadd           
        //  1790: iload           6
        //  1792: getstatic       dev/nuker/pyro/fc.c:I
        //  1795: ifge            1804
        //  1798: ldc_w           -980888478
        //  1801: goto            1807
        //  1804: ldc_w           -1322847117
        //  1807: ldc_w           -347649092
        //  1810: ixor           
        //  1811: lookupswitch {
        //          -1468521905: 1804
        //          785358814: 3822
        //          default: 1836
        //        }
        //  1836: iload           7
        //  1838: iconst_3       
        //  1839: imul           
        //  1840: iadd           
        //  1841: getstatic       dev/nuker/pyro/fc.1:I
        //  1844: ifeq            1853
        //  1847: ldc_w           94964817
        //  1850: goto            1856
        //  1853: ldc_w           -2093038358
        //  1856: ldc_w           1799132404
        //  1859: ixor           
        //  1860: lookupswitch {
        //          -402501602: 1888
        //          1855297701: 1853
        //          default: 3896
        //        }
        //  1888: iload           13
        //  1890: iload           4
        //  1892: getstatic       dev/nuker/pyro/fc.1:I
        //  1895: ifeq            1904
        //  1898: ldc_w           -398396599
        //  1901: goto            1907
        //  1904: ldc_w           2058571632
        //  1907: ldc_w           1530140372
        //  1910: ixor           
        //  1911: lookupswitch {
        //          -1284184675: 1904
        //          562518436: 1936
        //          default: 3934
        //        }
        //  1936: aload           12
        //  1938: iconst_0       
        //  1939: faload         
        //  1940: getstatic       dev/nuker/pyro/fc.c:I
        //  1943: ifge            1952
        //  1946: ldc_w           -1947853188
        //  1949: goto            1955
        //  1952: ldc_w           1648678528
        //  1955: ldc_w           -1508190277
        //  1958: ixor           
        //  1959: lookupswitch {
        //          -1000472261: 1984
        //          771541447: 1952
        //          default: 3832
        //        }
        //  1984: aload           12
        //  1986: iconst_1       
        //  1987: faload         
        //  1988: aload           12
        //  1990: iconst_2       
        //  1991: faload         
        //  1992: aload           12
        //  1994: iconst_3       
        //  1995: faload         
        //  1996: iconst_3       
        //  1997: goto            2001
        //  2000: athrow         
        //  2001: invokespecial   dev/nuker/pyro/f3V.c:(IIIIFFFFI)V
        //  2004: goto            2008
        //  2007: athrow         
        //  2008: ldc_w           "R"
        //  2011: iload           10
        //  2013: i2f            
        //  2014: iload           6
        //  2016: iload           7
        //  2018: iconst_4       
        //  2019: imul           
        //  2020: iadd           
        //  2021: i2f            
        //  2022: iconst_m1      
        //  2023: getstatic       dev/nuker/pyro/fc.c:I
        //  2026: ifge            2035
        //  2029: ldc_w           -902205231
        //  2032: goto            2038
        //  2035: ldc_w           1553835307
        //  2038: ldc_w           -152394158
        //  2041: ixor           
        //  2042: lookupswitch {
        //          -1996861878: 2035
        //          1020515971: 3906
        //          default: 2068
        //        }
        //  2068: goto            2072
        //  2071: athrow         
        //  2072: invokestatic    dev/nuker/pyro/fbs.1:(Ljava/lang/String;FFI)V
        //  2075: goto            2079
        //  2078: athrow         
        //  2079: getstatic       dev/nuker/pyro/fc.c:I
        //  2082: ifge            2091
        //  2085: ldc_w           -1228261408
        //  2088: goto            2094
        //  2091: ldc_w           -1858909532
        //  2094: ldc_w           -1288599053
        //  2097: ixor           
        //  2098: lookupswitch {
        //          100384275: 2091
        //          570606423: 2124
        //          default: 3886
        //        }
        //  2124: aload_0        
        //  2125: iload           10
        //  2127: iload           4
        //  2129: iadd           
        //  2130: iload           6
        //  2132: iload           7
        //  2134: iconst_4       
        //  2135: imul           
        //  2136: iadd           
        //  2137: getstatic       dev/nuker/pyro/fc.0:I
        //  2140: ifeq            2149
        //  2143: ldc_w           1768491192
        //  2146: goto            2152
        //  2149: ldc_w           1680512082
        //  2152: ldc_w           2020749913
        //  2155: ixor           
        //  2156: lookupswitch {
        //          -312486203: 2149
        //          286997217: 3894
        //          default: 2184
        //        }
        //  2184: iload           13
        //  2186: iload           4
        //  2188: getstatic       dev/nuker/pyro/fc.1:I
        //  2191: ifeq            2200
        //  2194: ldc_w           -1549202406
        //  2197: goto            2203
        //  2200: ldc_w           -493123913
        //  2203: ldc_w           1384578201
        //  2206: ixor           
        //  2207: lookupswitch {
        //          -1469420978: 2200
        //          -248516477: 3904
        //          default: 2232
        //        }
        //  2232: aload_0        
        //  2233: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  2236: goto            2240
        //  2239: athrow         
        //  2240: invokevirtual   dev/nuker/pyro/fS.1:()F
        //  2243: goto            2247
        //  2246: athrow         
        //  2247: getstatic       dev/nuker/pyro/fc.0:I
        //  2250: ifeq            2259
        //  2253: ldc_w           -1085255588
        //  2256: goto            2262
        //  2259: ldc_w           1751255433
        //  2262: ldc_w           -1516239273
        //  2265: ixor           
        //  2266: lookupswitch {
        //          -842919970: 2292
        //          451958283: 2259
        //          default: 3908
        //        }
        //  2292: goto            2296
        //  2295: athrow         
        //  2296: invokespecial   dev/nuker/pyro/f3V.c:(IIIIF)V
        //  2299: goto            2303
        //  2302: athrow         
        //  2303: iload           6
        //  2305: i2f            
        //  2306: aload_0        
        //  2307: goto            2311
        //  2310: athrow         
        //  2311: invokevirtual   dev/nuker/pyro/f3V.2:()F
        //  2314: goto            2318
        //  2317: athrow         
        //  2318: fsub           
        //  2319: f2i            
        //  2320: istore          6
        //  2322: getstatic       dev/nuker/pyro/fc.0:I
        //  2325: ifeq            2334
        //  2328: ldc_w           1747255584
        //  2331: goto            2337
        //  2334: ldc_w           -1739479580
        //  2337: ldc_w           2061120306
        //  2340: ixor           
        //  2341: lookupswitch {
        //          -494168362: 2368
        //          318714386: 2334
        //          default: 3862
        //        }
        //  2368: aload_0        
        //  2369: getfield        dev/nuker/pyro/f3V.c:I
        //  2372: tableswitch {
        //                2: 2416
        //                3: 2791
        //                4: 2942
        //                5: 3216
        //                6: 3356
        //                7: 3492
        //                8: 3680
        //          default: 3816
        //        }
        //  2416: fload_1        
        //  2417: iload           5
        //  2419: i2f            
        //  2420: fsub           
        //  2421: getstatic       dev/nuker/pyro/fc.c:I
        //  2424: ifge            2433
        //  2427: ldc_w           1304855749
        //  2430: goto            2436
        //  2433: ldc_w           -1315752915
        //  2436: ldc_w           -1954824372
        //  2439: ixor           
        //  2440: lookupswitch {
        //          -960676983: 3882
        //          117663043: 2433
        //          default: 2468
        //        }
        //  2468: iload           9
        //  2470: i2f            
        //  2471: fdiv           
        //  2472: fconst_0       
        //  2473: fconst_1       
        //  2474: goto            2478
        //  2477: athrow         
        //  2478: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  2481: goto            2485
        //  2484: athrow         
        //  2485: fstore          14
        //  2487: fconst_1       
        //  2488: getstatic       dev/nuker/pyro/fc.c:I
        //  2491: ifge            2500
        //  2494: ldc_w           -114765120
        //  2497: goto            2503
        //  2500: ldc_w           -1518841604
        //  2503: ldc_w           -1998331058
        //  2506: ixor           
        //  2507: lookupswitch {
        //          -1636061467: 2500
        //          1909141902: 3840
        //          default: 2532
        //        }
        //  2532: fload_2        
        //  2533: aload_0        
        //  2534: goto            2538
        //  2537: athrow         
        //  2538: invokevirtual   dev/nuker/pyro/f3V.2:()F
        //  2541: goto            2545
        //  2544: athrow         
        //  2545: fsub           
        //  2546: iload           6
        //  2548: i2f            
        //  2549: fsub           
        //  2550: iload           9
        //  2552: i2f            
        //  2553: fdiv           
        //  2554: fsub           
        //  2555: fconst_0       
        //  2556: fconst_1       
        //  2557: getstatic       dev/nuker/pyro/fc.0:I
        //  2560: ifeq            2569
        //  2563: ldc_w           -730404408
        //  2566: goto            2572
        //  2569: ldc_w           -2119006644
        //  2572: ldc_w           1213076248
        //  2575: ixor           
        //  2576: lookupswitch {
        //          -1673987376: 3818
        //          -1592375942: 2569
        //          default: 2604
        //        }
        //  2604: goto            2608
        //  2607: athrow         
        //  2608: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  2611: goto            2615
        //  2614: athrow         
        //  2615: fstore          15
        //  2617: getstatic       dev/nuker/pyro/fc.1:I
        //  2620: ifeq            2629
        //  2623: ldc_w           1383782717
        //  2626: goto            2632
        //  2629: ldc_w           -717814867
        //  2632: ldc_w           334081046
        //  2635: ixor           
        //  2636: lookupswitch {
        //          -958484549: 2664
        //          1100182827: 2629
        //          default: 3854
        //        }
        //  2664: aload_0        
        //  2665: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  2668: fload           14
        //  2670: getstatic       dev/nuker/pyro/fc.0:I
        //  2673: ifeq            2682
        //  2676: ldc_w           505306004
        //  2679: goto            2685
        //  2682: ldc_w           2113130195
        //  2685: ldc_w           -1765621098
        //  2688: ixor           
        //  2689: lookupswitch {
        //          -1998808830: 2682
        //          -349107131: 2716
        //          default: 3820
        //        }
        //  2716: goto            2720
        //  2719: athrow         
        //  2720: invokevirtual   dev/nuker/pyro/fS.2:(F)V
        //  2723: goto            2727
        //  2726: athrow         
        //  2727: aload_0        
        //  2728: getstatic       dev/nuker/pyro/fc.0:I
        //  2731: ifeq            2740
        //  2734: ldc_w           1830881850
        //  2737: goto            2743
        //  2740: ldc_w           -1825454626
        //  2743: ldc_w           -1343197787
        //  2746: ixor           
        //  2747: lookupswitch {
        //          -1026463841: 2740
        //          1019324539: 2772
        //          default: 3924
        //        }
        //  2772: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  2775: fload           15
        //  2777: goto            2781
        //  2780: athrow         
        //  2781: invokevirtual   dev/nuker/pyro/fS.5:(F)V
        //  2784: goto            2788
        //  2787: athrow         
        //  2788: goto            3816
        //  2791: fload_2        
        //  2792: aload_0        
        //  2793: goto            2797
        //  2796: athrow         
        //  2797: invokevirtual   dev/nuker/pyro/f3V.2:()F
        //  2800: goto            2804
        //  2803: athrow         
        //  2804: fsub           
        //  2805: iload           6
        //  2807: i2f            
        //  2808: fsub           
        //  2809: getstatic       dev/nuker/pyro/fc.c:I
        //  2812: ifge            2821
        //  2815: ldc_w           1229394905
        //  2818: goto            2824
        //  2821: ldc_w           -831475751
        //  2824: ldc_w           345116994
        //  2827: ixor           
        //  2828: lookupswitch {
        //          -622674277: 2856
        //          1574240923: 2821
        //          default: 3892
        //        }
        //  2856: iload           9
        //  2858: i2f            
        //  2859: fdiv           
        //  2860: fconst_0       
        //  2861: fconst_1       
        //  2862: goto            2866
        //  2865: athrow         
        //  2866: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  2869: goto            2873
        //  2872: athrow         
        //  2873: getstatic       dev/nuker/pyro/fc.1:I
        //  2876: ifeq            2885
        //  2879: ldc_w           -356056845
        //  2882: goto            2888
        //  2885: ldc_w           756038315
        //  2888: ldc_w           -209001863
        //  2891: ixor           
        //  2892: lookupswitch {
        //          424534666: 3848
        //          1283645924: 2885
        //          default: 2920
        //        }
        //  2920: fstore          16
        //  2922: aload_0        
        //  2923: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  2926: fload           16
        //  2928: goto            2932
        //  2931: athrow         
        //  2932: invokevirtual   dev/nuker/pyro/fS.6:(F)V
        //  2935: goto            2939
        //  2938: athrow         
        //  2939: goto            3816
        //  2942: fload_1        
        //  2943: iload           10
        //  2945: i2f            
        //  2946: fsub           
        //  2947: getstatic       dev/nuker/pyro/fc.1:I
        //  2950: ifeq            2959
        //  2953: ldc_w           1282655872
        //  2956: goto            2962
        //  2959: ldc_w           -677607192
        //  2962: ldc_w           84793164
        //  2965: ixor           
        //  2966: lookupswitch {
        //          91881035: 2959
        //          1232998860: 3838
        //          default: 2992
        //        }
        //  2992: iload           4
        //  2994: i2f            
        //  2995: fsub           
        //  2996: iload           13
        //  2998: i2f            
        //  2999: fdiv           
        //  3000: fconst_0       
        //  3001: fconst_1       
        //  3002: getstatic       dev/nuker/pyro/fc.0:I
        //  3005: ifeq            3014
        //  3008: ldc_w           -1779844649
        //  3011: goto            3017
        //  3014: ldc_w           549867414
        //  3017: ldc_w           -1773777796
        //  3020: ixor           
        //  3021: lookupswitch {
        //          61863339: 3842
        //          685758289: 3014
        //          default: 3048
        //        }
        //  3048: goto            3052
        //  3051: athrow         
        //  3052: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  3055: goto            3059
        //  3058: athrow         
        //  3059: getstatic       dev/nuker/pyro/fc.1:I
        //  3062: ifeq            3071
        //  3065: ldc_w           -1067381294
        //  3068: goto            3074
        //  3071: ldc_w           1410794652
        //  3074: ldc_w           1560944640
        //  3077: ixor           
        //  3078: lookupswitch {
        //          -1653920302: 3071
        //          152904860: 3104
        //          default: 3866
        //        }
        //  3104: fstore          17
        //  3106: getstatic       dev/nuker/pyro/fc.c:I
        //  3109: ifge            3118
        //  3112: ldc_w           1927624479
        //  3115: goto            3121
        //  3118: ldc_w           1768340288
        //  3121: ldc_w           -1904783469
        //  3124: ixor           
        //  3125: lookupswitch {
        //          -960900891: 3118
        //          -57509748: 3844
        //          default: 3152
        //        }
        //  3152: aload_0        
        //  3153: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  3156: getstatic       dev/nuker/pyro/fc.1:I
        //  3159: ifeq            3168
        //  3162: ldc_w           1545786617
        //  3165: goto            3171
        //  3168: ldc_w           1509281711
        //  3171: ldc_w           -41647430
        //  3174: ixor           
        //  3175: lookupswitch {
        //          -1582934461: 3168
        //          -1536078571: 3200
        //          default: 3856
        //        }
        //  3200: fload           17
        //  3202: goto            3206
        //  3205: athrow         
        //  3206: invokevirtual   dev/nuker/pyro/fS.3:(F)V
        //  3209: goto            3213
        //  3212: athrow         
        //  3213: goto            3816
        //  3216: fload_1        
        //  3217: getstatic       dev/nuker/pyro/fc.0:I
        //  3220: ifeq            3229
        //  3223: ldc_w           1129301424
        //  3226: goto            3232
        //  3229: ldc_w           -1960529865
        //  3232: ldc_w           409166499
        //  3235: ixor           
        //  3236: lookupswitch {
        //          -1824009580: 3264
        //          1529653011: 3229
        //          default: 3850
        //        }
        //  3264: iload           10
        //  3266: i2f            
        //  3267: fsub           
        //  3268: iload           4
        //  3270: i2f            
        //  3271: fsub           
        //  3272: iload           13
        //  3274: i2f            
        //  3275: fdiv           
        //  3276: fconst_0       
        //  3277: fconst_1       
        //  3278: goto            3282
        //  3281: athrow         
        //  3282: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  3285: goto            3289
        //  3288: athrow         
        //  3289: fstore          18
        //  3291: aload_0        
        //  3292: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  3295: getstatic       dev/nuker/pyro/fc.0:I
        //  3298: ifeq            3307
        //  3301: ldc_w           812948143
        //  3304: goto            3310
        //  3307: ldc_w           -1939000449
        //  3310: ldc_w           -1553210274
        //  3313: ixor           
        //  3314: lookupswitch {
        //          -1826652431: 3830
        //          2040265573: 3307
        //          default: 3340
        //        }
        //  3340: fload           18
        //  3342: goto            3346
        //  3345: athrow         
        //  3346: invokevirtual   dev/nuker/pyro/fS.1:(F)V
        //  3349: goto            3353
        //  3352: athrow         
        //  3353: goto            3816
        //  3356: fload_1        
        //  3357: iload           10
        //  3359: i2f            
        //  3360: fsub           
        //  3361: iload           4
        //  3363: i2f            
        //  3364: fsub           
        //  3365: iload           13
        //  3367: i2f            
        //  3368: fdiv           
        //  3369: fconst_0       
        //  3370: fconst_1       
        //  3371: goto            3375
        //  3374: athrow         
        //  3375: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  3378: goto            3382
        //  3381: athrow         
        //  3382: fstore          19
        //  3384: getstatic       dev/nuker/pyro/fc.1:I
        //  3387: ifeq            3396
        //  3390: ldc_w           -883576069
        //  3393: goto            3399
        //  3396: ldc_w           796054707
        //  3399: ldc_w           -1078506079
        //  3402: ixor           
        //  3403: lookupswitch {
        //          -1866098414: 3428
        //          1961033562: 3396
        //          default: 3912
        //        }
        //  3428: aload_0        
        //  3429: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  3432: getstatic       dev/nuker/pyro/fc.c:I
        //  3435: ifge            3444
        //  3438: ldc_w           -1842405476
        //  3441: goto            3447
        //  3444: ldc_w           81514444
        //  3447: ldc_w           -865409201
        //  3450: ixor           
        //  3451: lookupswitch {
        //          -1430315091: 3444
        //          1581643987: 3864
        //          default: 3476
        //        }
        //  3476: fload           19
        //  3478: goto            3482
        //  3481: athrow         
        //  3482: invokevirtual   dev/nuker/pyro/fS.0:(F)V
        //  3485: goto            3489
        //  3488: athrow         
        //  3489: goto            3816
        //  3492: fload_1        
        //  3493: getstatic       dev/nuker/pyro/fc.1:I
        //  3496: ifeq            3505
        //  3499: ldc_w           1794824574
        //  3502: goto            3508
        //  3505: ldc_w           -355814777
        //  3508: ldc_w           994801384
        //  3511: ixor           
        //  3512: lookupswitch {
        //          -780024721: 3540
        //          1370599318: 3505
        //          default: 3826
        //        }
        //  3540: iload           10
        //  3542: i2f            
        //  3543: fsub           
        //  3544: iload           4
        //  3546: i2f            
        //  3547: fsub           
        //  3548: iload           13
        //  3550: i2f            
        //  3551: fdiv           
        //  3552: fconst_0       
        //  3553: fconst_1       
        //  3554: getstatic       dev/nuker/pyro/fc.c:I
        //  3557: ifge            3566
        //  3560: ldc_w           1377036374
        //  3563: goto            3569
        //  3566: ldc_w           2007738159
        //  3569: ldc_w           -428169303
        //  3572: ixor           
        //  3573: lookupswitch {
        //          -1848573818: 3600
        //          -1268166657: 3566
        //          default: 3876
        //        }
        //  3600: goto            3604
        //  3603: athrow         
        //  3604: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  3607: goto            3611
        //  3610: athrow         
        //  3611: fstore          20
        //  3613: aload_0        
        //  3614: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  3617: getstatic       dev/nuker/pyro/fc.0:I
        //  3620: ifeq            3629
        //  3623: ldc_w           -409742092
        //  3626: goto            3632
        //  3629: ldc_w           273120569
        //  3632: ldc_w           1435456921
        //  3635: ixor           
        //  3636: lookupswitch {
        //          -1306754707: 3890
        //          -155753526: 3629
        //          default: 3664
        //        }
        //  3664: fload           20
        //  3666: goto            3670
        //  3669: athrow         
        //  3670: invokevirtual   dev/nuker/pyro/fS.7:(F)V
        //  3673: goto            3677
        //  3676: athrow         
        //  3677: goto            3816
        //  3680: getstatic       dev/nuker/pyro/fc.0:I
        //  3683: ifeq            3692
        //  3686: ldc_w           -859303984
        //  3689: goto            3695
        //  3692: ldc_w           1267292195
        //  3695: ldc_w           764809710
        //  3698: ixor           
        //  3699: lookupswitch {
        //          -513925570: 3910
        //          1576002342: 3692
        //          default: 3724
        //        }
        //  3724: fload_1        
        //  3725: iload           10
        //  3727: i2f            
        //  3728: fsub           
        //  3729: iload           4
        //  3731: i2f            
        //  3732: fsub           
        //  3733: iload           13
        //  3735: i2f            
        //  3736: fdiv           
        //  3737: fconst_0       
        //  3738: fconst_1       
        //  3739: goto            3743
        //  3742: athrow         
        //  3743: invokestatic    net/minecraft/util/math/MathHelper.func_76131_a:(FFF)F
        //  3746: goto            3750
        //  3749: athrow         
        //  3750: fstore          21
        //  3752: aload_0        
        //  3753: getstatic       dev/nuker/pyro/fc.c:I
        //  3756: ifge            3765
        //  3759: ldc_w           1631281043
        //  3762: goto            3768
        //  3765: ldc_w           1507224155
        //  3768: ldc_w           -1991305134
        //  3771: ixor           
        //  3772: lookupswitch {
        //          -795250167: 3800
        //          -395032639: 3765
        //          default: 3836
        //        }
        //  3800: getfield        dev/nuker/pyro/f3V.c:Ldev/nuker/pyro/fS;
        //  3803: fload           21
        //  3805: goto            3809
        //  3808: athrow         
        //  3809: invokevirtual   dev/nuker/pyro/fS.4:(F)V
        //  3812: goto            3816
        //  3815: athrow         
        //  3816: iconst_0       
        //  3817: ireturn        
        //  3818: aconst_null    
        //  3819: athrow         
        //  3820: aconst_null    
        //  3821: athrow         
        //  3822: aconst_null    
        //  3823: athrow         
        //  3824: aconst_null    
        //  3825: athrow         
        //  3826: aconst_null    
        //  3827: athrow         
        //  3828: aconst_null    
        //  3829: athrow         
        //  3830: aconst_null    
        //  3831: athrow         
        //  3832: aconst_null    
        //  3833: athrow         
        //  3834: aconst_null    
        //  3835: athrow         
        //  3836: aconst_null    
        //  3837: athrow         
        //  3838: aconst_null    
        //  3839: athrow         
        //  3840: aconst_null    
        //  3841: athrow         
        //  3842: aconst_null    
        //  3843: athrow         
        //  3844: aconst_null    
        //  3845: athrow         
        //  3846: aconst_null    
        //  3847: athrow         
        //  3848: aconst_null    
        //  3849: athrow         
        //  3850: aconst_null    
        //  3851: athrow         
        //  3852: aconst_null    
        //  3853: athrow         
        //  3854: aconst_null    
        //  3855: athrow         
        //  3856: aconst_null    
        //  3857: athrow         
        //  3858: aconst_null    
        //  3859: athrow         
        //  3860: aconst_null    
        //  3861: athrow         
        //  3862: aconst_null    
        //  3863: athrow         
        //  3864: aconst_null    
        //  3865: athrow         
        //  3866: aconst_null    
        //  3867: athrow         
        //  3868: aconst_null    
        //  3869: athrow         
        //  3870: aconst_null    
        //  3871: athrow         
        //  3872: aconst_null    
        //  3873: athrow         
        //  3874: aconst_null    
        //  3875: athrow         
        //  3876: aconst_null    
        //  3877: athrow         
        //  3878: aconst_null    
        //  3879: athrow         
        //  3880: aconst_null    
        //  3881: athrow         
        //  3882: aconst_null    
        //  3883: athrow         
        //  3884: aconst_null    
        //  3885: athrow         
        //  3886: aconst_null    
        //  3887: athrow         
        //  3888: aconst_null    
        //  3889: athrow         
        //  3890: aconst_null    
        //  3891: athrow         
        //  3892: aconst_null    
        //  3893: athrow         
        //  3894: aconst_null    
        //  3895: athrow         
        //  3896: aconst_null    
        //  3897: athrow         
        //  3898: aconst_null    
        //  3899: athrow         
        //  3900: aconst_null    
        //  3901: athrow         
        //  3902: aconst_null    
        //  3903: athrow         
        //  3904: aconst_null    
        //  3905: athrow         
        //  3906: aconst_null    
        //  3907: athrow         
        //  3908: aconst_null    
        //  3909: athrow         
        //  3910: aconst_null    
        //  3911: athrow         
        //  3912: aconst_null    
        //  3913: athrow         
        //  3914: aconst_null    
        //  3915: athrow         
        //  3916: aconst_null    
        //  3917: athrow         
        //  3918: aconst_null    
        //  3919: athrow         
        //  3920: aconst_null    
        //  3921: athrow         
        //  3922: aconst_null    
        //  3923: athrow         
        //  3924: aconst_null    
        //  3925: athrow         
        //  3926: aconst_null    
        //  3927: athrow         
        //  3928: aconst_null    
        //  3929: athrow         
        //  3930: aconst_null    
        //  3931: athrow         
        //  3932: aconst_null    
        //  3933: athrow         
        //  3934: aconst_null    
        //  3935: athrow         
        //  3936: aconst_null    
        //  3937: athrow         
        //  3938: pop            
        //  3939: goto            24
        //  3942: pop            
        //  3943: aconst_null    
        //  3944: goto            3938
        //  3947: dup            
        //  3948: ifnull          3938
        //  3951: checkcast       Ljava/lang/Throwable;
        //  3954: athrow         
        //  3955: dup            
        //  3956: ifnull          3942
        //  3959: checkcast       Ljava/lang/Throwable;
        //  3962: athrow         
        //  3963: aconst_null    
        //  3964: athrow         
        //    StackMapTable: 01 9C FF 00 03 00 08 07 00 03 02 02 02 01 01 01 01 00 01 07 00 1D FF 00 04 00 04 07 00 03 02 02 02 00 00 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 04 07 00 03 02 02 02 00 00 FF 00 10 00 05 07 00 03 02 02 02 01 00 01 01 FF 00 02 00 05 07 00 03 02 02 02 01 00 02 01 01 5F 01 FF 00 0D 00 06 07 00 03 02 02 02 01 01 00 01 07 00 1D FF 00 00 00 06 07 00 03 02 02 02 01 01 00 02 02 07 00 03 45 07 00 1D FF 00 00 00 06 07 00 03 02 02 02 01 01 00 02 02 02 50 01 FF 00 02 00 06 07 00 03 02 02 02 01 01 00 02 01 01 5D 01 FC 00 0D 01 42 01 1E FF 00 16 00 08 07 00 03 02 02 02 01 01 01 01 00 01 07 00 38 FF 00 02 00 08 07 00 03 02 02 02 01 01 01 01 00 02 07 00 38 01 5D 07 00 38 42 07 00 17 40 07 00 38 45 07 00 1D 40 07 00 AB FF 00 05 00 09 07 00 03 02 02 02 01 01 01 01 07 00 AB 00 01 07 00 1D 40 07 00 03 45 07 00 1D 40 02 4B 02 FF 00 02 00 09 07 00 03 02 02 02 01 01 01 01 07 00 AB 00 02 02 01 5F 02 56 01 FF 00 02 00 09 07 00 03 02 02 02 01 01 01 01 07 00 AB 00 02 01 01 5D 01 FC 00 0D 01 42 01 1E 4D 01 FF 00 02 00 0A 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 00 02 01 01 5E 01 48 07 00 53 40 02 45 07 00 1D FF 00 00 00 0A 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 00 02 02 02 FF 00 0B 00 0B 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 00 01 07 00 1D 40 07 00 03 45 07 00 1D 40 02 55 02 FF 00 02 00 0B 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 00 02 02 01 5D 02 42 07 00 1D 40 02 45 07 00 1D FF 00 00 00 0B 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 00 02 02 02 FF 00 24 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 02 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 08 07 00 03 01 01 01 01 02 02 01 FF 00 1C 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 06 00 00 00 01 07 00 1D FF 00 00 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 08 07 00 03 01 01 01 01 02 02 02 45 07 00 1D 00 FF 00 1D 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 06 07 00 03 01 01 01 01 02 FF 00 02 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 07 07 00 03 01 01 01 01 02 01 FF 00 1F 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 06 07 00 03 01 01 01 01 02 42 07 00 45 FF 00 00 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 06 07 00 03 01 01 01 01 02 45 07 00 1D 00 55 07 00 4F FF 00 00 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB 4B 07 00 AB FF 00 02 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 02 07 00 AB 01 5F 07 00 AB FF 00 17 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 45 07 00 1D 00 FF 00 11 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 00 03 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 00 03 01 FF 00 19 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 08 07 00 03 01 01 01 01 02 02 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 0B 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 45 07 00 1D 00 4E 07 02 A7 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 02 A7 01 5D 07 02 A7 4E 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 45 07 00 1D 00 0B 42 01 1D FF 00 16 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 0F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 13 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 08 07 00 03 01 01 01 01 02 02 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 4B 07 00 55 FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 45 07 00 1D 00 FF 00 11 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 02 A7 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 02 A7 02 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 02 A7 02 FF 00 16 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 02 A7 02 02 01 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 45 07 00 1D 00 0B 42 01 1D 4C 07 00 03 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 00 03 01 5F 07 00 03 FF 00 12 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 12 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 0D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 53 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 45 07 00 1D 00 FF 00 15 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 02 A7 02 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 01 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 02 A7 02 01 49 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 45 07 00 1D 00 0B 42 01 1E FF 00 13 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 10 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 1F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 0F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 0F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 4F 07 00 43 FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 45 07 00 1D 00 FF 00 1A 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 02 A7 02 02 01 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 42 07 00 49 FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 45 07 00 1D 00 0B 42 01 1D FF 00 18 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 1F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 0F 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 01 FF 00 1C 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 46 07 00 45 FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 07 00 38 45 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 FF 00 0B 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 01 FF 00 1D 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 45 07 00 1D 00 46 07 00 4B FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 07 00 03 45 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 02 0F 42 01 1E 2F 50 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5F 02 48 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 FF 00 0E 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 01 02 FF 00 02 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 02 02 01 5C 02 FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 07 00 03 45 07 00 1D FF 00 00 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 02 FF 00 17 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 02 FF 00 02 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 04 02 02 02 01 FF 00 1F 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 02 42 07 00 1D FF 00 00 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 02 45 07 00 1D 40 02 FC 00 0D 02 42 01 1F FF 00 11 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 38 02 FF 00 02 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 03 07 00 38 02 01 FF 00 1E 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 38 02 42 07 00 1D FF 00 00 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 38 02 45 07 00 1D 00 4C 07 00 03 FF 00 02 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 03 01 5C 07 00 03 47 07 00 1D FF 00 00 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 38 02 45 07 00 1D 00 F9 00 02 44 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 07 00 03 45 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 02 50 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5F 02 FF 00 08 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 4B 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5F 02 FF 00 0A 00 11 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 02 00 01 07 00 1D FF 00 00 00 11 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 02 00 02 07 00 38 02 45 07 00 1D 00 F8 00 02 50 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5D 02 FF 00 15 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 02 02 02 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 42 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 4B 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5D 02 FF 00 0D 00 12 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 02 00 00 42 01 1E 4F 07 00 38 FF 00 02 00 12 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 02 00 02 07 00 38 01 5C 07 00 38 44 07 00 1D FF 00 00 00 12 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 02 00 02 07 00 38 02 45 07 00 1D 00 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 4C 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5F 02 50 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 FF 00 11 00 13 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 02 00 01 07 00 38 FF 00 02 00 13 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 02 00 02 07 00 38 01 5D 07 00 38 44 07 00 4B FF 00 00 00 13 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 02 00 02 07 00 38 02 45 07 00 1D 00 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 51 07 00 4B FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 FF 00 0D 00 14 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 02 00 00 42 01 1C 4F 07 00 38 FF 00 02 00 14 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 02 00 02 07 00 38 01 5C 07 00 38 FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 14 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 02 00 02 07 00 38 02 45 07 00 1D 00 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 4C 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 02 01 5F 02 FF 00 19 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 02 02 02 01 FF 00 1E 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 42 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 FF 00 11 00 15 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 02 00 01 07 00 38 FF 00 02 00 15 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 02 00 02 07 00 38 01 5F 07 00 38 44 07 00 1D FF 00 00 00 15 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 02 00 02 07 00 38 02 45 07 00 1D 00 FF 00 02 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 0B 42 01 1C FF 00 11 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 45 07 00 1D 40 02 FF 00 0E 00 16 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 00 02 00 01 07 00 03 FF 00 02 00 16 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 00 02 00 02 07 00 03 01 5F 07 00 03 47 07 00 55 FF 00 00 00 16 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 00 02 00 02 07 00 38 02 45 07 00 1D FF 00 00 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 FF 00 01 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 03 02 02 02 FF 00 01 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 02 07 00 38 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 01 00 05 07 00 03 02 02 02 01 00 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 01 00 13 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 02 00 01 07 00 38 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 01 FF 00 01 00 16 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 00 02 00 01 07 00 03 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 FF 00 01 00 0F 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 00 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 FF 00 01 00 12 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 02 00 00 FF 00 01 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 41 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 FD 00 01 02 02 FF 00 01 00 12 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 02 00 01 07 00 38 FF 00 01 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 01 07 00 AB FD 00 01 07 00 AB 01 01 FF 00 01 00 14 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 02 00 01 07 00 38 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 00 03 01 01 01 FF 00 01 00 0B 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 00 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 02 A7 02 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 02 02 02 41 07 02 A7 FF 00 01 00 08 07 00 03 02 02 02 01 01 01 01 00 01 07 00 38 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 FF 00 01 00 09 07 00 03 02 02 02 01 01 01 01 07 00 AB 00 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 FF 00 01 00 06 07 00 03 02 02 02 01 01 00 01 01 FF 00 01 00 15 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 00 02 00 01 07 00 38 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 01 00 0C 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 00 06 07 00 03 01 01 01 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 00 03 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 03 07 00 03 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 06 07 00 03 01 01 01 01 02 01 FF 00 01 00 14 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 00 00 00 00 02 00 00 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 00 01 01 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 01 07 00 03 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 01 00 07 07 00 03 02 02 02 01 01 01 00 00 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 04 07 02 A7 02 02 01 FF 00 01 00 10 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 02 02 00 01 07 00 03 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 07 07 00 03 01 01 01 01 02 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 01 00 09 07 00 03 02 02 02 01 01 01 01 07 00 AB 00 01 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 02 07 02 A7 02 FF 00 01 00 0E 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 01 01 07 00 AB 01 00 05 07 00 03 01 01 01 01 FF 00 01 00 0A 07 00 03 02 02 02 01 01 01 01 07 00 AB 01 00 00 FF 00 01 00 04 07 00 03 02 02 02 00 01 07 00 4B 43 05 44 07 00 4B 47 05 FF 00 07 00 08 07 00 03 02 02 02 01 01 01 01 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3947   3955   Ljava/lang/NullPointerException;
        //  3947   3955   3947   3955   Ljava/lang/IllegalStateException;
        //  3963   3965   3      8      Any
        //  90     97     97     98     Any
        //  90     97     97     98     Any
        //  91     97     90     91     Any
        //  90     97     90     91     Ljava/lang/NullPointerException;
        //  91     97     97     98     Any
        //  255    262    262    263    Any
        //  256    262    3      8      Ljava/lang/NullPointerException;
        //  255    262    262    263    Any
        //  256    262    3      8      Ljava/lang/ArithmeticException;
        //  255    262    255    256    Ljava/lang/StringIndexOutOfBoundsException;
        //  269    276    276    277    Any
        //  270    276    3      8      Ljava/util/ConcurrentModificationException;
        //  269    276    269    270    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  269    276    3      8      Ljava/lang/NegativeArraySizeException;
        //  270    276    269    270    Any
        //  485    492    492    493    Any
        //  486    492    3      8      Ljava/lang/NumberFormatException;
        //  486    492    492    493    Ljava/lang/NumberFormatException;
        //  485    492    485    486    Ljava/lang/UnsupportedOperationException;
        //  485    492    3      8      Any
        //  505    512    512    513    Any
        //  505    512    505    506    Ljava/lang/IllegalStateException;
        //  505    512    512    513    Ljava/lang/IllegalArgumentException;
        //  505    512    512    513    Any
        //  505    512    505    506    Any
        //  571    578    578    579    Any
        //  572    578    578    579    Ljava/util/ConcurrentModificationException;
        //  571    578    578    579    Any
        //  571    578    571    572    Any
        //  572    578    578    579    Any
        //  656    662    662    663    Any
        //  656    662    3      8      Ljava/lang/NullPointerException;
        //  656    662    3      8      Ljava/lang/ArithmeticException;
        //  656    662    662    663    Ljava/lang/ArithmeticException;
        //  656    662    662    663    Any
        //  731    738    738    739    Any
        //  731    738    731    732    Ljava/lang/IndexOutOfBoundsException;
        //  732    738    738    739    Any
        //  732    738    738    739    Any
        //  731    738    738    739    Ljava/lang/ClassCastException;
        //  761    768    768    769    Any
        //  762    768    768    769    Any
        //  762    768    768    769    Any
        //  762    768    768    769    Ljava/lang/NumberFormatException;
        //  761    768    761    762    Ljava/lang/ClassCastException;
        //  841    847    847    848    Any
        //  841    847    3      8      Any
        //  841    847    3      8      Ljava/lang/ArithmeticException;
        //  841    847    847    848    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  841    847    847    848    Ljava/lang/NumberFormatException;
        //  973    979    979    980    Any
        //  973    979    3      8      Ljava/lang/IllegalArgumentException;
        //  973    979    979    980    Any
        //  973    979    979    980    Ljava/lang/NumberFormatException;
        //  973    979    3      8      Any
        //  1043   1050   1050   1051   Any
        //  1044   1050   1043   1044   Any
        //  1043   1050   1050   1051   Ljava/lang/StringIndexOutOfBoundsException;
        //  1043   1050   3      8      Any
        //  1044   1050   3      8      Ljava/lang/RuntimeException;
        //  1264   1271   1271   1272   Any
        //  1264   1271   1271   1272   Ljava/lang/RuntimeException;
        //  1264   1271   1264   1265   Ljava/lang/IllegalStateException;
        //  1265   1271   3      8      Any
        //  1264   1271   1271   1272   Ljava/lang/IllegalArgumentException;
        //  1384   1390   1390   1391   Any
        //  1384   1390   1390   1391   Any
        //  1384   1390   3      8      Ljava/lang/IllegalArgumentException;
        //  1384   1390   3      8      Ljava/lang/IllegalArgumentException;
        //  1384   1390   1390   1391   Any
        //  1656   1663   1663   1664   Any
        //  1656   1663   3      8      Ljava/lang/NullPointerException;
        //  1657   1663   1656   1657   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1657   1663   3      8      Any
        //  1656   1663   1656   1657   Any
        //  1730   1737   1737   1738   Any
        //  1730   1737   1730   1731   Any
        //  1731   1737   3      8      Ljava/lang/IllegalArgumentException;
        //  1730   1737   1737   1738   Ljava/util/NoSuchElementException;
        //  1731   1737   1737   1738   Ljava/lang/NegativeArraySizeException;
        //  2000   2007   2007   2008   Any
        //  2000   2007   2007   2008   Ljava/lang/IndexOutOfBoundsException;
        //  2000   2007   2000   2001   Ljava/util/NoSuchElementException;
        //  2001   2007   3      8      Any
        //  2001   2007   2007   2008   Ljava/lang/IllegalStateException;
        //  2071   2078   2078   2079   Any
        //  2072   2078   3      8      Any
        //  2071   2078   3      8      Ljava/util/ConcurrentModificationException;
        //  2072   2078   2078   2079   Ljava/lang/ArithmeticException;
        //  2072   2078   2071   2072   Ljava/lang/NullPointerException;
        //  2239   2246   2246   2247   Any
        //  2239   2246   2246   2247   Any
        //  2239   2246   2239   2240   Ljava/lang/IndexOutOfBoundsException;
        //  2240   2246   2246   2247   Any
        //  2240   2246   2246   2247   Ljava/lang/UnsupportedOperationException;
        //  2296   2302   2302   2303   Any
        //  2296   2302   3      8      Any
        //  2296   2302   2302   2303   Ljava/lang/IllegalStateException;
        //  2296   2302   2302   2303   Ljava/lang/IllegalStateException;
        //  2296   2302   2302   2303   Ljava/util/NoSuchElementException;
        //  2310   2317   2317   2318   Any
        //  2310   2317   2310   2311   Ljava/util/ConcurrentModificationException;
        //  2310   2317   2317   2318   Any
        //  2310   2317   3      8      Ljava/lang/ArithmeticException;
        //  2310   2317   2310   2311   Ljava/lang/ClassCastException;
        //  2477   2484   2484   2485   Any
        //  2477   2484   2477   2478   Any
        //  2477   2484   3      8      Ljava/lang/UnsupportedOperationException;
        //  2477   2484   2484   2485   Any
        //  2478   2484   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2538   2544   2544   2545   Any
        //  2538   2544   2544   2545   Ljava/lang/NumberFormatException;
        //  2538   2544   2544   2545   Ljava/lang/NullPointerException;
        //  2538   2544   3      8      Any
        //  2538   2544   2544   2545   Any
        //  2607   2614   2614   2615   Any
        //  2607   2614   2614   2615   Any
        //  2608   2614   2607   2608   Any
        //  2608   2614   2614   2615   Ljava/lang/IndexOutOfBoundsException;
        //  2608   2614   2614   2615   Ljava/lang/AssertionError;
        //  2719   2726   2726   2727   Any
        //  2720   2726   2719   2720   Any
        //  2720   2726   2726   2727   Any
        //  2719   2726   2726   2727   Ljava/lang/AssertionError;
        //  2719   2726   2719   2720   Ljava/lang/StringIndexOutOfBoundsException;
        //  2780   2787   2787   2788   Any
        //  2781   2787   2780   2781   Any
        //  2780   2787   3      8      Ljava/lang/ArithmeticException;
        //  2780   2787   2780   2781   Any
        //  2780   2787   2787   2788   Ljava/lang/NegativeArraySizeException;
        //  2796   2803   2803   2804   Any
        //  2797   2803   2796   2797   Ljava/lang/RuntimeException;
        //  2796   2803   2796   2797   Ljava/lang/EnumConstantNotPresentException;
        //  2796   2803   2796   2797   Ljava/lang/RuntimeException;
        //  2796   2803   2796   2797   Any
        //  2866   2872   2872   2873   Any
        //  2866   2872   3      8      Ljava/lang/NumberFormatException;
        //  2866   2872   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2866   2872   3      8      Any
        //  2866   2872   3      8      Ljava/lang/NegativeArraySizeException;
        //  2931   2938   2938   2939   Any
        //  2932   2938   2931   2932   Any
        //  2931   2938   2938   2939   Ljava/lang/AssertionError;
        //  2932   2938   2938   2939   Any
        //  2931   2938   2938   2939   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3051   3058   3058   3059   Any
        //  3052   3058   3051   3052   Ljava/lang/StringIndexOutOfBoundsException;
        //  3051   3058   3058   3059   Any
        //  3052   3058   3051   3052   Any
        //  3051   3058   3058   3059   Any
        //  3205   3212   3212   3213   Any
        //  3205   3212   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3206   3212   3212   3213   Ljava/lang/StringIndexOutOfBoundsException;
        //  3206   3212   3212   3213   Any
        //  3206   3212   3205   3206   Any
        //  3281   3288   3288   3289   Any
        //  3281   3288   3288   3289   Ljava/lang/NegativeArraySizeException;
        //  3282   3288   3281   3282   Any
        //  3282   3288   3288   3289   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3281   3288   3      8      Ljava/lang/UnsupportedOperationException;
        //  3345   3352   3352   3353   Any
        //  3345   3352   3352   3353   Any
        //  3345   3352   3345   3346   Ljava/lang/NullPointerException;
        //  3345   3352   3352   3353   Ljava/lang/ClassCastException;
        //  3346   3352   3345   3346   Ljava/lang/IndexOutOfBoundsException;
        //  3374   3381   3381   3382   Any
        //  3374   3381   3374   3375   Ljava/lang/EnumConstantNotPresentException;
        //  3374   3381   3374   3375   Ljava/lang/IndexOutOfBoundsException;
        //  3375   3381   3374   3375   Ljava/util/NoSuchElementException;
        //  3375   3381   3381   3382   Any
        //  3482   3488   3488   3489   Any
        //  3482   3488   3      8      Ljava/lang/ArithmeticException;
        //  3482   3488   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3482   3488   3488   3489   Any
        //  3482   3488   3      8      Any
        //  3603   3610   3610   3611   Any
        //  3604   3610   3603   3604   Any
        //  3603   3610   3      8      Any
        //  3603   3610   3603   3604   Any
        //  3603   3610   3603   3604   Ljava/lang/NumberFormatException;
        //  3669   3676   3676   3677   Any
        //  3669   3676   3676   3677   Ljava/lang/IllegalStateException;
        //  3670   3676   3669   3670   Any
        //  3669   3676   3676   3677   Any
        //  3669   3676   3      8      Any
        //  3743   3749   3749   3750   Any
        //  3743   3749   3      8      Ljava/lang/ClassCastException;
        //  3743   3749   3749   3750   Any
        //  3743   3749   3749   3750   Any
        //  3743   3749   3749   3750   Ljava/lang/ClassCastException;
        //  3808   3815   3815   3816   Any
        //  3808   3815   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3809   3815   3815   3816   Ljava/lang/AssertionError;
        //  3808   3815   3808   3809   Ljava/lang/IllegalStateException;
        //  3808   3815   3815   3816   Ljava/util/ConcurrentModificationException;
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
    
    public void c(final BufferBuilder bufferBuilder, final float n, final float n2, final int n3, final int n4, final int n5, final int n6) {
        fbS.4K(this, 1575724677, bufferBuilder, n, n2, n3, n4, n5, n6);
    }
    
    public void c(final int p0, final int p1, final int p2, final int p3, final float p4, final float p5, final float p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3315
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            3307
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3299
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //    31: goto            35
        //    34: athrow         
        //    35: astore          8
        //    37: aload           8
        //    39: getstatic       dev/nuker/pyro/fc.c:I
        //    42: ifge            51
        //    45: ldc_w           -469704530
        //    48: goto            54
        //    51: ldc_w           1422176225
        //    54: ldc_w           -1980190510
        //    57: ixor           
        //    58: lookupswitch {
        //          -583262413: 84
        //          1844990076: 51
        //          default: 3202
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //    91: goto            95
        //    94: athrow         
        //    95: astore          9
        //    97: aload_0        
        //    98: getstatic       dev/nuker/pyro/fc.c:I
        //   101: ifge            110
        //   104: ldc_w           1383474640
        //   107: goto            113
        //   110: ldc_w           -49062282
        //   113: ldc_w           -1484919080
        //   116: ixor           
        //   117: lookupswitch {
        //          -183776504: 110
        //          1517203630: 144
        //          default: 3256
        //        }
        //   144: aload           9
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            158
        //   152: ldc_w           -652540454
        //   155: goto            161
        //   158: ldc_w           -829463212
        //   161: ldc_w           -1161503620
        //   164: ixor           
        //   165: lookupswitch {
        //          366821767: 158
        //          1675614630: 3216
        //          default: 192
        //        }
        //   192: goto            196
        //   195: athrow         
        //   196: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;)V
        //   199: goto            203
        //   202: athrow         
        //   203: fconst_0       
        //   204: getstatic       dev/nuker/pyro/fc.1:I
        //   207: ifeq            216
        //   210: ldc_w           -1407816795
        //   213: goto            219
        //   216: ldc_w           -488084884
        //   219: ldc_w           -756144343
        //   222: ixor           
        //   223: lookupswitch {
        //          805719365: 248
        //          2130201740: 216
        //          default: 3278
        //        }
        //   248: fstore          10
        //   250: iload_1        
        //   251: istore          11
        //   253: getstatic       dev/nuker/pyro/fc.0:I
        //   256: ifeq            265
        //   259: ldc_w           -585324563
        //   262: goto            268
        //   265: ldc_w           1052364010
        //   268: ldc_w           1274231761
        //   271: ixor           
        //   272: lookupswitch {
        //          -1762681796: 265
        //          1967847227: 300
        //          default: 3234
        //        }
        //   300: iload_1        
        //   301: iload_3        
        //   302: iadd           
        //   303: getstatic       dev/nuker/pyro/fc.0:I
        //   306: ifeq            315
        //   309: ldc_w           1384629665
        //   312: goto            318
        //   315: ldc_w           1650304398
        //   318: ldc_w           1018071804
        //   321: ixor           
        //   322: lookupswitch {
        //          1466254216: 315
        //          1848201053: 3222
        //          default: 348
        //        }
        //   348: istore          12
        //   350: iload           11
        //   352: getstatic       dev/nuker/pyro/fc.1:I
        //   355: ifeq            364
        //   358: ldc_w           1907483102
        //   361: goto            367
        //   364: ldc_w           -452340471
        //   367: ldc_w           -1954992575
        //   370: ixor           
        //   371: lookupswitch {
        //          -87502945: 364
        //          1852898120: 396
        //          default: 3206
        //        }
        //   396: iload           12
        //   398: if_icmpge       1640
        //   401: iload           11
        //   403: iload_1        
        //   404: isub           
        //   405: i2f            
        //   406: iload_3        
        //   407: i2f            
        //   408: fdiv           
        //   409: fstore          13
        //   411: fconst_1       
        //   412: getstatic       dev/nuker/pyro/fc.c:I
        //   415: ifge            424
        //   418: ldc_w           1532822902
        //   421: goto            427
        //   424: ldc_w           1431841785
        //   427: ldc_w           -1464947961
        //   430: ixor           
        //   431: lookupswitch {
        //          -202133903: 424
        //          -34176770: 456
        //          default: 3230
        //        }
        //   456: fstore          14
        //   458: iload_2        
        //   459: istore          15
        //   461: getstatic       dev/nuker/pyro/fc.1:I
        //   464: ifeq            473
        //   467: ldc_w           871148996
        //   470: goto            476
        //   473: ldc_w           -164285933
        //   476: ldc_w           1853264843
        //   479: ixor           
        //   480: lookupswitch {
        //          -1386174756: 473
        //          1570389519: 3258
        //          default: 508
        //        }
        //   508: iload_2        
        //   509: iload           4
        //   511: iadd           
        //   512: istore          16
        //   514: iload           15
        //   516: iload           16
        //   518: if_icmpge       527
        //   521: ldc_w           459727974
        //   524: goto            530
        //   527: ldc_w           459727973
        //   530: ldc_w           -112567185
        //   533: ixor           
        //   534: tableswitch {
        //          -1000771566: 556
        //          -1000771565: 1584
        //          default: 521
        //        }
        //   556: fconst_1       
        //   557: iload           15
        //   559: iload_2        
        //   560: isub           
        //   561: i2f            
        //   562: iload           4
        //   564: i2f            
        //   565: fdiv           
        //   566: fsub           
        //   567: getstatic       dev/nuker/pyro/fc.1:I
        //   570: ifeq            579
        //   573: ldc_w           -115024168
        //   576: goto            582
        //   579: ldc_w           -704420164
        //   582: ldc_w           -1441252116
        //   585: ixor           
        //   586: lookupswitch {
        //          1396498996: 3244
        //          1868778211: 579
        //          default: 612
        //        }
        //   612: fstore          17
        //   614: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   617: fload           5
        //   619: fload           10
        //   621: fload           14
        //   623: fconst_1       
        //   624: goto            628
        //   627: athrow         
        //   628: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   631: goto            635
        //   634: athrow         
        //   635: astore          18
        //   637: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   640: fload           5
        //   642: fload           10
        //   644: getstatic       dev/nuker/pyro/fc.0:I
        //   647: ifeq            656
        //   650: ldc_w           1410159857
        //   653: goto            659
        //   656: ldc_w           -1071234189
        //   659: ldc_w           458467439
        //   662: ixor           
        //   663: lookupswitch {
        //          -530773627: 656
        //          1331625118: 3248
        //          default: 688
        //        }
        //   688: fload           17
        //   690: fconst_1       
        //   691: goto            695
        //   694: athrow         
        //   695: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   698: goto            702
        //   701: athrow         
        //   702: astore          19
        //   704: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   707: fload           5
        //   709: fload           13
        //   711: fload           14
        //   713: fconst_1       
        //   714: goto            718
        //   717: athrow         
        //   718: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   721: goto            725
        //   724: athrow         
        //   725: getstatic       dev/nuker/pyro/fc.0:I
        //   728: ifeq            737
        //   731: ldc_w           528701162
        //   734: goto            740
        //   737: ldc_w           -1829295724
        //   740: ldc_w           -1931419624
        //   743: ixor           
        //   744: lookupswitch {
        //          -1822181646: 3196
        //          -17581335: 737
        //          default: 772
        //        }
        //   772: astore          20
        //   774: getstatic       dev/nuker/pyro/fc.c:I
        //   777: ifge            786
        //   780: ldc_w           1937824410
        //   783: goto            789
        //   786: ldc_w           -1171307128
        //   789: ldc_w           -927100683
        //   792: ixor           
        //   793: lookupswitch {
        //          -1153611153: 786
        //          1922225533: 820
        //          default: 3212
        //        }
        //   820: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   823: fload           5
        //   825: fload           13
        //   827: getstatic       dev/nuker/pyro/fc.1:I
        //   830: ifeq            839
        //   833: ldc_w           -1469885508
        //   836: goto            842
        //   839: ldc_w           161158453
        //   842: ldc_w           1157557085
        //   845: ixor           
        //   846: lookupswitch {
        //          -325207839: 839
        //          1298529896: 872
        //          default: 3218
        //        }
        //   872: fload           17
        //   874: fconst_1       
        //   875: getstatic       dev/nuker/pyro/fc.1:I
        //   878: ifeq            887
        //   881: ldc_w           -1464081120
        //   884: goto            890
        //   887: ldc_w           -1062791585
        //   890: ldc_w           37817100
        //   893: ixor           
        //   894: lookupswitch {
        //          -1871777082: 887
        //          -1426395604: 3260
        //          default: 920
        //        }
        //   920: goto            924
        //   923: athrow         
        //   924: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   927: goto            931
        //   930: athrow         
        //   931: astore          21
        //   933: aload           9
        //   935: iload           11
        //   937: i2d            
        //   938: getstatic       dev/nuker/pyro/fc.0:I
        //   941: ifeq            950
        //   944: ldc_w           -1936459022
        //   947: goto            953
        //   950: ldc_w           -1476822446
        //   953: ldc_w           -931660928
        //   956: ixor           
        //   957: lookupswitch {
        //          1155793266: 950
        //          1871610322: 984
        //          default: 3214
        //        }
        //   984: iload           15
        //   986: i2d            
        //   987: dconst_1       
        //   988: dadd           
        //   989: dconst_0       
        //   990: goto            994
        //   993: athrow         
        //   994: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   997: goto            1001
        //  1000: athrow         
        //  1001: aload           19
        //  1003: iconst_0       
        //  1004: faload         
        //  1005: aload           19
        //  1007: iconst_1       
        //  1008: faload         
        //  1009: aload           19
        //  1011: iconst_2       
        //  1012: faload         
        //  1013: fconst_1       
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1021: goto            1025
        //  1024: athrow         
        //  1025: goto            1029
        //  1028: athrow         
        //  1029: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: aload           9
        //  1038: iload           11
        //  1040: i2d            
        //  1041: dconst_1       
        //  1042: dadd           
        //  1043: iload           15
        //  1045: i2d            
        //  1046: dconst_1       
        //  1047: dadd           
        //  1048: dconst_0       
        //  1049: goto            1053
        //  1052: athrow         
        //  1053: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1056: goto            1060
        //  1059: athrow         
        //  1060: aload           21
        //  1062: iconst_0       
        //  1063: faload         
        //  1064: aload           21
        //  1066: iconst_1       
        //  1067: faload         
        //  1068: getstatic       dev/nuker/pyro/fc.1:I
        //  1071: ifeq            1080
        //  1074: ldc_w           -986306023
        //  1077: goto            1083
        //  1080: ldc_w           555400987
        //  1083: ldc_w           -242504917
        //  1086: ixor           
        //  1087: lookupswitch {
        //          -1796856749: 1080
        //          884834610: 3232
        //          default: 1112
        //        }
        //  1112: aload           21
        //  1114: iconst_2       
        //  1115: faload         
        //  1116: fconst_1       
        //  1117: getstatic       dev/nuker/pyro/fc.0:I
        //  1120: ifeq            1129
        //  1123: ldc_w           224580767
        //  1126: goto            1132
        //  1129: ldc_w           1136815211
        //  1132: ldc_w           757892414
        //  1135: ixor           
        //  1136: lookupswitch {
        //          -2113940860: 1129
        //          542003617: 3228
        //          default: 1164
        //        }
        //  1164: goto            1168
        //  1167: athrow         
        //  1168: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1171: goto            1175
        //  1174: athrow         
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1182: goto            1186
        //  1185: athrow         
        //  1186: getstatic       dev/nuker/pyro/fc.1:I
        //  1189: ifeq            1198
        //  1192: ldc_w           2104601092
        //  1195: goto            1201
        //  1198: ldc_w           -1847721915
        //  1201: ldc_w           201704182
        //  1204: ixor           
        //  1205: lookupswitch {
        //          -1646542157: 1232
        //          1903454450: 1198
        //          default: 3240
        //        }
        //  1232: aload           9
        //  1234: getstatic       dev/nuker/pyro/fc.0:I
        //  1237: ifeq            1246
        //  1240: ldc_w           761876596
        //  1243: goto            1249
        //  1246: ldc_w           -523960263
        //  1249: ldc_w           666420295
        //  1252: ixor           
        //  1253: lookupswitch {
        //          -948059010: 1280
        //          181507123: 1246
        //          default: 3266
        //        }
        //  1280: iload           11
        //  1282: i2d            
        //  1283: dconst_1       
        //  1284: dadd           
        //  1285: iload           15
        //  1287: i2d            
        //  1288: dconst_0       
        //  1289: goto            1293
        //  1292: athrow         
        //  1293: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1296: goto            1300
        //  1299: athrow         
        //  1300: aload           20
        //  1302: iconst_0       
        //  1303: faload         
        //  1304: aload           20
        //  1306: iconst_1       
        //  1307: faload         
        //  1308: aload           20
        //  1310: iconst_2       
        //  1311: faload         
        //  1312: fconst_1       
        //  1313: goto            1317
        //  1316: athrow         
        //  1317: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: goto            1328
        //  1327: athrow         
        //  1328: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1331: goto            1335
        //  1334: athrow         
        //  1335: aload           9
        //  1337: getstatic       dev/nuker/pyro/fc.0:I
        //  1340: ifeq            1349
        //  1343: ldc_w           1194269413
        //  1346: goto            1352
        //  1349: ldc_w           -1408672916
        //  1352: ldc_w           -842773639
        //  1355: ixor           
        //  1356: lookupswitch {
        //          -1964289636: 3220
        //          1966428995: 1349
        //          default: 1384
        //        }
        //  1384: iload           11
        //  1386: i2d            
        //  1387: iload           15
        //  1389: i2d            
        //  1390: dconst_0       
        //  1391: getstatic       dev/nuker/pyro/fc.1:I
        //  1394: ifeq            1403
        //  1397: ldc_w           567681347
        //  1400: goto            1406
        //  1403: ldc_w           -66436436
        //  1406: ldc_w           1392885749
        //  1409: ixor           
        //  1410: lookupswitch {
        //          -1357906599: 1436
        //          1926471350: 1403
        //          default: 3204
        //        }
        //  1436: goto            1440
        //  1439: athrow         
        //  1440: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1443: goto            1447
        //  1446: athrow         
        //  1447: aload           18
        //  1449: iconst_0       
        //  1450: faload         
        //  1451: aload           18
        //  1453: iconst_1       
        //  1454: faload         
        //  1455: aload           18
        //  1457: iconst_2       
        //  1458: faload         
        //  1459: fconst_1       
        //  1460: goto            1464
        //  1463: athrow         
        //  1464: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1467: goto            1471
        //  1470: athrow         
        //  1471: goto            1475
        //  1474: athrow         
        //  1475: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1478: goto            1482
        //  1481: athrow         
        //  1482: getstatic       dev/nuker/pyro/fc.c:I
        //  1485: ifge            1494
        //  1488: ldc_w           -1100566023
        //  1491: goto            1497
        //  1494: ldc_w           -1479285549
        //  1497: ldc_w           -1394622220
        //  1500: ixor           
        //  1501: lookupswitch {
        //          185345063: 1528
        //          314142989: 1494
        //          default: 3250
        //        }
        //  1528: fload           17
        //  1530: getstatic       dev/nuker/pyro/fc.c:I
        //  1533: ifge            1542
        //  1536: ldc_w           -2078462563
        //  1539: goto            1545
        //  1542: ldc_w           1778283856
        //  1545: ldc_w           1934007143
        //  1548: ixor           
        //  1549: lookupswitch {
        //          -144984326: 3274
        //          990834659: 1542
        //          default: 1576
        //        }
        //  1576: fstore          14
        //  1578: iinc            15, 1
        //  1581: goto            514
        //  1584: fload           13
        //  1586: getstatic       dev/nuker/pyro/fc.1:I
        //  1589: ifeq            1598
        //  1592: ldc_w           -578691293
        //  1595: goto            1601
        //  1598: ldc_w           -1169921128
        //  1601: ldc_w           -554578830
        //  1604: ixor           
        //  1605: lookupswitch {
        //          57676625: 1598
        //          1689626602: 1632
        //          default: 3226
        //        }
        //  1632: fstore          10
        //  1634: iinc            11, 1
        //  1637: goto            350
        //  1640: iload_1        
        //  1641: i2f            
        //  1642: fload           6
        //  1644: iload_3        
        //  1645: i2f            
        //  1646: fmul           
        //  1647: fadd           
        //  1648: ldc             0.5
        //  1650: fsub           
        //  1651: fstore          11
        //  1653: iload_2        
        //  1654: i2f            
        //  1655: fconst_1       
        //  1656: fload           7
        //  1658: fsub           
        //  1659: getstatic       dev/nuker/pyro/fc.0:I
        //  1662: ifeq            1671
        //  1665: ldc_w           1076966589
        //  1668: goto            1674
        //  1671: ldc_w           -1818233709
        //  1674: ldc_w           -1770967573
        //  1677: ixor           
        //  1678: lookupswitch {
        //          -2044347152: 1671
        //          -700442282: 3262
        //          default: 1704
        //        }
        //  1704: iload           4
        //  1706: i2f            
        //  1707: fmul           
        //  1708: fadd           
        //  1709: ldc             0.5
        //  1711: fsub           
        //  1712: fstore          12
        //  1714: fload           7
        //  1716: f2d            
        //  1717: ldc2_w          0.5
        //  1720: dcmpl          
        //  1721: ifle            1738
        //  1724: fload           6
        //  1726: f2d            
        //  1727: ldc2_w          0.5
        //  1730: dcmpg          
        //  1731: ifge            1738
        //  1734: iconst_0       
        //  1735: goto            1741
        //  1738: sipush          255
        //  1741: istore          13
        //  1743: aload           9
        //  1745: fload           11
        //  1747: f2d            
        //  1748: dconst_1       
        //  1749: dsub           
        //  1750: fload           12
        //  1752: fconst_2       
        //  1753: fadd           
        //  1754: f2d            
        //  1755: dconst_0       
        //  1756: goto            1760
        //  1759: athrow         
        //  1760: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1763: goto            1767
        //  1766: athrow         
        //  1767: iload           13
        //  1769: iload           13
        //  1771: getstatic       dev/nuker/pyro/fc.c:I
        //  1774: ifge            1783
        //  1777: ldc_w           -1026994753
        //  1780: goto            1786
        //  1783: ldc_w           121976916
        //  1786: ldc_w           1889793149
        //  1789: ixor           
        //  1790: lookupswitch {
        //          -1301628478: 3224
        //          -826798537: 1783
        //          default: 1816
        //        }
        //  1816: iload           13
        //  1818: sipush          255
        //  1821: getstatic       dev/nuker/pyro/fc.c:I
        //  1824: ifge            1833
        //  1827: ldc_w           -417897203
        //  1830: goto            1836
        //  1833: ldc_w           -28339773
        //  1836: ldc_w           983000562
        //  1839: ixor           
        //  1840: lookupswitch {
        //          -992414671: 1868
        //          -578813697: 1833
        //          default: 3268
        //        }
        //  1868: goto            1872
        //  1871: athrow         
        //  1872: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1875: goto            1879
        //  1878: athrow         
        //  1879: goto            1883
        //  1882: athrow         
        //  1883: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1886: goto            1890
        //  1889: athrow         
        //  1890: aload           9
        //  1892: getstatic       dev/nuker/pyro/fc.0:I
        //  1895: ifeq            1904
        //  1898: ldc_w           1616147199
        //  1901: goto            1907
        //  1904: ldc_w           -1356145887
        //  1907: ldc_w           1583298520
        //  1910: ixor           
        //  1911: lookupswitch {
        //          -243929863: 1936
        //          1040925991: 1904
        //          default: 3284
        //        }
        //  1936: fload           11
        //  1938: fconst_2       
        //  1939: fadd           
        //  1940: f2d            
        //  1941: fload           12
        //  1943: fconst_2       
        //  1944: fadd           
        //  1945: f2d            
        //  1946: dconst_0       
        //  1947: goto            1951
        //  1950: athrow         
        //  1951: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1954: goto            1958
        //  1957: athrow         
        //  1958: getstatic       dev/nuker/pyro/fc.c:I
        //  1961: ifge            1970
        //  1964: ldc_w           -776729451
        //  1967: goto            1973
        //  1970: ldc_w           1343007911
        //  1973: ldc_w           -1015100992
        //  1976: ixor           
        //  1977: lookupswitch {
        //          315278677: 3270
        //          650665820: 1970
        //          default: 2004
        //        }
        //  2004: iload           13
        //  2006: getstatic       dev/nuker/pyro/fc.c:I
        //  2009: ifge            2018
        //  2012: ldc_w           -2096267940
        //  2015: goto            2021
        //  2018: ldc_w           -311236687
        //  2021: ldc_w           120769054
        //  2024: ixor           
        //  2025: lookupswitch {
        //          -2076199102: 3252
        //          -1757348659: 2018
        //          default: 2052
        //        }
        //  2052: iload           13
        //  2054: iload           13
        //  2056: sipush          255
        //  2059: goto            2063
        //  2062: athrow         
        //  2063: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2066: goto            2070
        //  2069: athrow         
        //  2070: goto            2074
        //  2073: athrow         
        //  2074: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2077: goto            2081
        //  2080: athrow         
        //  2081: getstatic       dev/nuker/pyro/fc.c:I
        //  2084: ifge            2093
        //  2087: ldc_w           1879709874
        //  2090: goto            2096
        //  2093: ldc_w           2117621584
        //  2096: ldc_w           1848858998
        //  2099: ixor           
        //  2100: lookupswitch {
        //          -1838283428: 2093
        //          507068868: 3208
        //          default: 2128
        //        }
        //  2128: aload           9
        //  2130: fload           11
        //  2132: fconst_2       
        //  2133: fadd           
        //  2134: f2d            
        //  2135: fload           12
        //  2137: f2d            
        //  2138: dconst_1       
        //  2139: dsub           
        //  2140: dconst_0       
        //  2141: goto            2145
        //  2144: athrow         
        //  2145: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2148: goto            2152
        //  2151: athrow         
        //  2152: getstatic       dev/nuker/pyro/fc.c:I
        //  2155: ifge            2164
        //  2158: ldc_w           1865165830
        //  2161: goto            2167
        //  2164: ldc_w           -1777422654
        //  2167: ldc_w           -630665297
        //  2170: ixor           
        //  2171: lookupswitch {
        //          -1253776471: 2164
        //          1281778029: 2196
        //          default: 3276
        //        }
        //  2196: iload           13
        //  2198: getstatic       dev/nuker/pyro/fc.0:I
        //  2201: ifeq            2210
        //  2204: ldc_w           -113015458
        //  2207: goto            2213
        //  2210: ldc_w           656374663
        //  2213: ldc_w           1106535063
        //  2216: ixor           
        //  2217: lookupswitch {
        //          -1195907127: 3286
        //          -1143629136: 2210
        //          default: 2244
        //        }
        //  2244: iload           13
        //  2246: iload           13
        //  2248: sipush          255
        //  2251: goto            2255
        //  2254: athrow         
        //  2255: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2258: goto            2262
        //  2261: athrow         
        //  2262: goto            2266
        //  2265: athrow         
        //  2266: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2269: goto            2273
        //  2272: athrow         
        //  2273: aload           9
        //  2275: fload           11
        //  2277: f2d            
        //  2278: dconst_1       
        //  2279: dsub           
        //  2280: fload           12
        //  2282: f2d            
        //  2283: dconst_1       
        //  2284: dsub           
        //  2285: dconst_0       
        //  2286: goto            2290
        //  2289: athrow         
        //  2290: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2293: goto            2297
        //  2296: athrow         
        //  2297: iload           13
        //  2299: iload           13
        //  2301: iload           13
        //  2303: sipush          255
        //  2306: getstatic       dev/nuker/pyro/fc.0:I
        //  2309: ifeq            2318
        //  2312: ldc_w           -1743231570
        //  2315: goto            2321
        //  2318: ldc_w           847813869
        //  2321: ldc_w           1192080118
        //  2324: ixor           
        //  2325: lookupswitch {
        //          -552216744: 3246
        //          643546472: 2318
        //          default: 2352
        //        }
        //  2352: goto            2356
        //  2355: athrow         
        //  2356: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181669_b:(IIII)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2359: goto            2363
        //  2362: athrow         
        //  2363: getstatic       dev/nuker/pyro/fc.0:I
        //  2366: ifeq            2375
        //  2369: ldc_w           155834248
        //  2372: goto            2378
        //  2375: ldc_w           1349836087
        //  2378: ldc_w           -1894006532
        //  2381: ixor           
        //  2382: lookupswitch {
        //          -2041440396: 3236
        //          -92810120: 2375
        //          default: 2408
        //        }
        //  2408: goto            2412
        //  2411: athrow         
        //  2412: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2415: goto            2419
        //  2418: athrow         
        //  2419: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //  2422: fload           5
        //  2424: fload           6
        //  2426: fload           7
        //  2428: fconst_1       
        //  2429: goto            2433
        //  2432: athrow         
        //  2433: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //  2436: goto            2440
        //  2439: athrow         
        //  2440: astore          14
        //  2442: aload           9
        //  2444: getstatic       dev/nuker/pyro/fc.1:I
        //  2447: ifeq            2456
        //  2450: ldc_w           627934008
        //  2453: goto            2459
        //  2456: ldc_w           -116406328
        //  2459: ldc_w           -1216525684
        //  2462: ixor           
        //  2463: lookupswitch {
        //          -1844393548: 2456
        //          1316130116: 2488
        //          default: 3272
        //        }
        //  2488: fload           11
        //  2490: f2d            
        //  2491: fload           12
        //  2493: f2d            
        //  2494: dconst_1       
        //  2495: dadd           
        //  2496: dconst_0       
        //  2497: goto            2501
        //  2500: athrow         
        //  2501: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2504: goto            2508
        //  2507: athrow         
        //  2508: aload           14
        //  2510: iconst_0       
        //  2511: faload         
        //  2512: aload           14
        //  2514: iconst_1       
        //  2515: faload         
        //  2516: aload           14
        //  2518: iconst_2       
        //  2519: faload         
        //  2520: fconst_1       
        //  2521: getstatic       dev/nuker/pyro/fc.1:I
        //  2524: ifeq            2533
        //  2527: ldc_w           -423942051
        //  2530: goto            2536
        //  2533: ldc_w           359975485
        //  2536: ldc_w           -998837275
        //  2539: ixor           
        //  2540: lookupswitch {
        //          -788383272: 2568
        //          583916472: 2533
        //          default: 3198
        //        }
        //  2568: goto            2572
        //  2571: athrow         
        //  2572: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2575: goto            2579
        //  2578: athrow         
        //  2579: getstatic       dev/nuker/pyro/fc.c:I
        //  2582: ifge            2591
        //  2585: ldc_w           1585025784
        //  2588: goto            2594
        //  2591: ldc_w           -2087871984
        //  2594: ldc_w           -1229513106
        //  2597: ixor           
        //  2598: lookupswitch {
        //          -389116778: 2591
        //          893027454: 2624
        //          default: 3254
        //        }
        //  2624: goto            2628
        //  2627: athrow         
        //  2628: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2631: goto            2635
        //  2634: athrow         
        //  2635: aload           9
        //  2637: fload           11
        //  2639: f2d            
        //  2640: dconst_1       
        //  2641: dadd           
        //  2642: fload           12
        //  2644: f2d            
        //  2645: dconst_1       
        //  2646: dadd           
        //  2647: dconst_0       
        //  2648: getstatic       dev/nuker/pyro/fc.1:I
        //  2651: ifeq            2660
        //  2654: ldc_w           1402717542
        //  2657: goto            2663
        //  2660: ldc_w           -1951454
        //  2663: ldc_w           -609865617
        //  2666: ixor           
        //  2667: lookupswitch {
        //          -2009205495: 2660
        //          608438605: 2692
        //          default: 3282
        //        }
        //  2692: goto            2696
        //  2695: athrow         
        //  2696: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2699: goto            2703
        //  2702: athrow         
        //  2703: aload           14
        //  2705: iconst_0       
        //  2706: faload         
        //  2707: aload           14
        //  2709: iconst_1       
        //  2710: faload         
        //  2711: getstatic       dev/nuker/pyro/fc.1:I
        //  2714: ifeq            2723
        //  2717: ldc_w           -278550303
        //  2720: goto            2726
        //  2723: ldc_w           824271233
        //  2726: ldc_w           -2116658887
        //  2729: ixor           
        //  2730: lookupswitch {
        //          -1325975368: 2756
        //          1857286616: 2723
        //          default: 3238
        //        }
        //  2756: aload           14
        //  2758: iconst_2       
        //  2759: faload         
        //  2760: fconst_1       
        //  2761: goto            2765
        //  2764: athrow         
        //  2765: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2768: goto            2772
        //  2771: athrow         
        //  2772: goto            2776
        //  2775: athrow         
        //  2776: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2779: goto            2783
        //  2782: athrow         
        //  2783: aload           9
        //  2785: getstatic       dev/nuker/pyro/fc.0:I
        //  2788: ifeq            2797
        //  2791: ldc_w           1988919882
        //  2794: goto            2800
        //  2797: ldc_w           1551032475
        //  2800: ldc_w           -514834945
        //  2803: ixor           
        //  2804: lookupswitch {
        //          -1747140683: 3200
        //          -913832490: 2797
        //          default: 2832
        //        }
        //  2832: fload           11
        //  2834: f2d            
        //  2835: dconst_1       
        //  2836: dadd           
        //  2837: getstatic       dev/nuker/pyro/fc.1:I
        //  2840: ifeq            2849
        //  2843: ldc_w           -639430672
        //  2846: goto            2852
        //  2849: ldc_w           -1771018719
        //  2852: ldc_w           150585112
        //  2855: ixor           
        //  2856: lookupswitch {
        //          -1635133127: 2884
        //          -786779928: 2849
        //          default: 3264
        //        }
        //  2884: fload           12
        //  2886: f2d            
        //  2887: dconst_0       
        //  2888: goto            2892
        //  2891: athrow         
        //  2892: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2895: goto            2899
        //  2898: athrow         
        //  2899: aload           14
        //  2901: iconst_0       
        //  2902: faload         
        //  2903: aload           14
        //  2905: iconst_1       
        //  2906: faload         
        //  2907: aload           14
        //  2909: iconst_2       
        //  2910: faload         
        //  2911: fconst_1       
        //  2912: goto            2916
        //  2915: athrow         
        //  2916: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  2919: goto            2923
        //  2922: athrow         
        //  2923: getstatic       dev/nuker/pyro/fc.c:I
        //  2926: ifge            2935
        //  2929: ldc_w           1140167806
        //  2932: goto            2938
        //  2935: ldc_w           1802923728
        //  2938: ldc_w           -685066517
        //  2941: ixor           
        //  2942: lookupswitch {
        //          -1797315947: 2935
        //          -1134766021: 2968
        //          default: 3210
        //        }
        //  2968: goto            2972
        //  2971: athrow         
        //  2972: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  2975: goto            2979
        //  2978: athrow         
        //  2979: getstatic       dev/nuker/pyro/fc.1:I
        //  2982: ifeq            2991
        //  2985: ldc_w           1583207238
        //  2988: goto            2994
        //  2991: ldc_w           1576995300
        //  2994: ldc_w           -2018646782
        //  2997: ixor           
        //  2998: lookupswitch {
        //          -638568892: 2991
        //          -632099610: 3024
        //          default: 3288
        //        }
        //  3024: aload           9
        //  3026: fload           11
        //  3028: f2d            
        //  3029: fload           12
        //  3031: f2d            
        //  3032: dconst_0       
        //  3033: getstatic       dev/nuker/pyro/fc.1:I
        //  3036: ifeq            3045
        //  3039: ldc_w           -1873685826
        //  3042: goto            3048
        //  3045: ldc_w           253413572
        //  3048: ldc_w           998866250
        //  3051: ixor           
        //  3052: lookupswitch {
        //          -1411862540: 3242
        //          1993721161: 3045
        //          default: 3080
        //        }
        //  3080: goto            3084
        //  3083: athrow         
        //  3084: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3087: goto            3091
        //  3090: athrow         
        //  3091: aload           14
        //  3093: iconst_0       
        //  3094: faload         
        //  3095: aload           14
        //  3097: iconst_1       
        //  3098: faload         
        //  3099: aload           14
        //  3101: iconst_2       
        //  3102: faload         
        //  3103: fconst_1       
        //  3104: getstatic       dev/nuker/pyro/fc.1:I
        //  3107: ifeq            3116
        //  3110: ldc_w           -367223675
        //  3113: goto            3119
        //  3116: ldc_w           159799080
        //  3119: ldc_w           1707701274
        //  3122: ixor           
        //  3123: lookupswitch {
        //          -1881806689: 3280
        //          1561942789: 3116
        //          default: 3148
        //        }
        //  3148: goto            3152
        //  3151: athrow         
        //  3152: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  3155: goto            3159
        //  3158: athrow         
        //  3159: goto            3163
        //  3162: athrow         
        //  3163: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  3166: goto            3170
        //  3169: athrow         
        //  3170: aload           8
        //  3172: goto            3176
        //  3175: athrow         
        //  3176: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //  3179: goto            3183
        //  3182: athrow         
        //  3183: aload_0        
        //  3184: goto            3188
        //  3187: athrow         
        //  3188: invokespecial   dev/nuker/pyro/f3V.c:()V
        //  3191: goto            3195
        //  3194: athrow         
        //  3195: return         
        //  3196: aconst_null    
        //  3197: athrow         
        //  3198: aconst_null    
        //  3199: athrow         
        //  3200: aconst_null    
        //  3201: athrow         
        //  3202: aconst_null    
        //  3203: athrow         
        //  3204: aconst_null    
        //  3205: athrow         
        //  3206: aconst_null    
        //  3207: athrow         
        //  3208: aconst_null    
        //  3209: athrow         
        //  3210: aconst_null    
        //  3211: athrow         
        //  3212: aconst_null    
        //  3213: athrow         
        //  3214: aconst_null    
        //  3215: athrow         
        //  3216: aconst_null    
        //  3217: athrow         
        //  3218: aconst_null    
        //  3219: athrow         
        //  3220: aconst_null    
        //  3221: athrow         
        //  3222: aconst_null    
        //  3223: athrow         
        //  3224: aconst_null    
        //  3225: athrow         
        //  3226: aconst_null    
        //  3227: athrow         
        //  3228: aconst_null    
        //  3229: athrow         
        //  3230: aconst_null    
        //  3231: athrow         
        //  3232: aconst_null    
        //  3233: athrow         
        //  3234: aconst_null    
        //  3235: athrow         
        //  3236: aconst_null    
        //  3237: athrow         
        //  3238: aconst_null    
        //  3239: athrow         
        //  3240: aconst_null    
        //  3241: athrow         
        //  3242: aconst_null    
        //  3243: athrow         
        //  3244: aconst_null    
        //  3245: athrow         
        //  3246: aconst_null    
        //  3247: athrow         
        //  3248: aconst_null    
        //  3249: athrow         
        //  3250: aconst_null    
        //  3251: athrow         
        //  3252: aconst_null    
        //  3253: athrow         
        //  3254: aconst_null    
        //  3255: athrow         
        //  3256: aconst_null    
        //  3257: athrow         
        //  3258: aconst_null    
        //  3259: athrow         
        //  3260: aconst_null    
        //  3261: athrow         
        //  3262: aconst_null    
        //  3263: athrow         
        //  3264: aconst_null    
        //  3265: athrow         
        //  3266: aconst_null    
        //  3267: athrow         
        //  3268: aconst_null    
        //  3269: athrow         
        //  3270: aconst_null    
        //  3271: athrow         
        //  3272: aconst_null    
        //  3273: athrow         
        //  3274: aconst_null    
        //  3275: athrow         
        //  3276: aconst_null    
        //  3277: athrow         
        //  3278: aconst_null    
        //  3279: athrow         
        //  3280: aconst_null    
        //  3281: athrow         
        //  3282: aconst_null    
        //  3283: athrow         
        //  3284: aconst_null    
        //  3285: athrow         
        //  3286: aconst_null    
        //  3287: athrow         
        //  3288: aconst_null    
        //  3289: athrow         
        //  3290: pop            
        //  3291: goto            24
        //  3294: pop            
        //  3295: aconst_null    
        //  3296: goto            3290
        //  3299: dup            
        //  3300: ifnull          3290
        //  3303: checkcast       Ljava/lang/Throwable;
        //  3306: athrow         
        //  3307: dup            
        //  3308: ifnull          3294
        //  3311: checkcast       Ljava/lang/Throwable;
        //  3314: athrow         
        //  3315: aconst_null    
        //  3316: athrow         
        //    StackMapTable: 01 87 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 08 07 00 03 01 01 01 01 02 02 02 00 00 42 07 00 1D 00 45 07 00 1D 40 07 00 B6 FF 00 0F 00 09 07 00 03 01 01 01 01 02 02 02 07 00 B6 00 01 07 00 B6 FF 00 02 00 09 07 00 03 01 01 01 01 02 02 02 07 00 B6 00 02 07 00 B6 01 5D 07 00 B6 42 07 00 1D 40 07 00 B6 45 07 00 1D 40 07 00 63 FF 00 0E 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 01 07 00 03 FF 00 02 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 07 00 03 01 5E 07 00 03 FF 00 0D 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 FF 00 02 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 03 07 00 03 07 00 63 01 FF 00 1E 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 42 07 00 1D FF 00 00 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 45 07 00 1D 00 4C 02 FF 00 02 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 02 01 5C 02 FD 00 10 02 01 42 01 1F 4E 01 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 00 02 01 01 5D 01 FC 00 01 01 4D 01 FF 00 02 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 00 02 01 01 5C 01 FF 00 1B 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 00 01 02 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 00 02 02 01 5C 02 FD 00 10 02 01 42 01 1F FC 00 05 01 06 05 42 01 19 56 02 FF 00 02 00 11 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 00 02 02 01 5D 02 FF 00 0E 00 12 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 00 01 07 00 1D FF 00 00 00 12 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FF 00 14 00 13 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 00 03 07 00 CE 02 02 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 00 04 07 00 CE 02 02 01 FF 00 1C 00 13 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 00 03 07 00 CE 02 02 FF 00 05 00 00 00 01 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FF 00 0E 00 00 00 01 07 00 1D FF 00 00 00 14 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB 4B 07 00 AB FF 00 02 00 14 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 AB 01 5F 07 00 AB FC 00 0D 07 00 AB 42 01 1E FF 00 12 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 CE 02 02 FF 00 02 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 CE 02 02 01 FF 00 1D 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 CE 02 02 FF 00 0E 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 CE 02 02 02 02 FF 00 02 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 06 07 00 CE 02 02 02 02 01 FF 00 1D 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 CE 02 02 02 02 42 07 00 15 FF 00 00 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FF 00 12 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 63 03 01 FF 00 1E 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 07 00 63 03 48 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4F 07 00 0D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4F 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 13 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1C 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 10 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1F 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 42 07 00 4B FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 4B 40 07 00 63 45 07 00 1D 00 0B 42 01 1E 4D 07 00 63 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 4B 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4F 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4D 07 00 63 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 07 00 63 01 5F 07 00 63 FF 00 12 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1D 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0F 00 00 00 01 07 00 1D FF 00 00 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0B 42 01 1E 4D 02 FF 00 02 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 02 01 5E 02 FF 00 07 00 11 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 00 00 4D 02 FF 00 02 00 11 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 00 02 02 01 5E 02 FF 00 07 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 00 00 FF 00 1E 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 01 00 02 02 02 FF 00 02 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 01 00 03 02 02 01 FF 00 1D 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 01 00 02 02 02 FF 00 21 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 00 00 42 01 FF 00 11 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 01 07 00 43 FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0F 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 03 07 00 63 01 01 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 04 07 00 63 01 01 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 03 07 00 63 01 01 FF 00 10 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 06 07 00 63 01 01 01 01 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 42 07 00 13 FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4D 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 5C 07 00 63 4D 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 5E 07 00 63 FF 00 0D 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 03 07 00 63 01 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 49 07 00 4D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0B 42 01 1F 4F 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 5C 07 00 63 FF 00 0D 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 03 07 00 63 01 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 49 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4F 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 14 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 06 07 00 63 01 01 01 01 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 42 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 5D 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4C 07 00 49 FF 00 00 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FF 00 0F 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 01 07 00 63 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 01 5C 07 00 63 FF 00 0B 00 00 00 01 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 18 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1F 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 01 5D 07 00 63 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 01 07 00 63 45 07 00 1D 00 FF 00 18 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1C 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 13 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 03 07 00 63 02 02 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1D 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 03 07 00 63 02 02 47 07 00 4F FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4D 07 00 63 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 01 5F 07 00 63 FF 00 10 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 03 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 03 07 00 63 03 01 FF 00 1F 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 03 46 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0F 00 00 00 01 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 01 5D 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0B 42 01 1D FF 00 14 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1F 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 51 FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 18 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1C 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 42 07 00 1D FF 00 00 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 0D 40 07 00 63 45 07 00 1D 00 44 07 00 1D 40 07 00 B6 45 07 00 1D 00 43 07 00 49 40 07 00 03 45 07 00 1D 00 FF 00 00 00 14 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 AB FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 41 07 00 63 FF 00 01 00 09 07 00 03 01 01 01 01 02 02 02 07 00 B6 00 01 07 00 B6 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 00 01 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 00 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 01 07 00 63 FF 00 01 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 00 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 01 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 FF 00 01 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 CE 02 02 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 00 01 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 03 07 00 63 01 01 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 00 01 02 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 00 01 02 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 00 00 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 01 07 00 63 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 00 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 00 01 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 00 03 07 00 CE 02 02 FE 00 01 07 00 AB 07 00 AB 07 00 AB FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 01 07 00 63 FF 00 01 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 01 07 00 03 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 00 00 FF 00 01 00 15 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 00 05 07 00 CE 02 02 02 02 FF 00 01 00 0D 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 01 00 02 02 02 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 02 07 00 63 03 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 05 07 00 63 01 01 01 01 41 07 00 63 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 01 07 00 63 FF 00 01 00 16 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 01 01 02 02 01 01 02 07 00 AB 07 00 AB 07 00 AB 07 00 AB 00 01 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 01 07 00 63 FF 00 01 00 0A 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 00 01 02 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 0F 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 01 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 02 02 07 00 B6 07 00 63 02 02 02 01 00 02 07 00 63 01 FC 00 01 07 00 AB FF 00 01 00 08 07 00 03 01 01 01 01 02 02 02 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3299   3307   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3299   3307   3299   3307   Any
        //  3315   3317   3      8      Ljava/lang/ArithmeticException;
        //  27     34     34     35     Any
        //  27     34     27     28     Any
        //  28     34     34     35     Any
        //  27     34     3      8      Any
        //  28     34     27     28     Ljava/util/NoSuchElementException;
        //  87     94     94     95     Any
        //  87     94     94     95     Ljava/lang/UnsupportedOperationException;
        //  87     94     94     95     Ljava/lang/ClassCastException;
        //  88     94     87     88     Any
        //  87     94     87     88     Any
        //  195    202    202    203    Any
        //  196    202    195    196    Any
        //  195    202    195    196    Ljava/util/ConcurrentModificationException;
        //  196    202    202    203    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  195    202    202    203    Ljava/lang/NumberFormatException;
        //  627    634    634    635    Any
        //  628    634    3      8      Any
        //  627    634    627    628    Any
        //  628    634    634    635    Any
        //  628    634    3      8      Any
        //  695    701    701    702    Any
        //  695    701    3      8      Ljava/lang/RuntimeException;
        //  695    701    701    702    Any
        //  695    701    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  695    701    701    702    Any
        //  718    724    724    725    Any
        //  718    724    3      8      Any
        //  718    724    724    725    Any
        //  718    724    724    725    Any
        //  718    724    724    725    Ljava/lang/ClassCastException;
        //  923    930    930    931    Any
        //  923    930    923    924    Ljava/lang/ArithmeticException;
        //  923    930    3      8      Ljava/lang/AssertionError;
        //  923    930    3      8      Any
        //  924    930    3      8      Ljava/lang/ArithmeticException;
        //  993    1000   1000   1001   Any
        //  994    1000   1000   1001   Ljava/lang/UnsupportedOperationException;
        //  994    1000   993    994    Any
        //  994    1000   3      8      Ljava/lang/UnsupportedOperationException;
        //  993    1000   1000   1001   Any
        //  1017   1024   1024   1025   Any
        //  1018   1024   1017   1018   Ljava/lang/IllegalArgumentException;
        //  1017   1024   3      8      Ljava/lang/AssertionError;
        //  1018   1024   1024   1025   Ljava/lang/NegativeArraySizeException;
        //  1017   1024   3      8      Ljava/util/NoSuchElementException;
        //  1028   1035   1035   1036   Any
        //  1029   1035   1035   1036   Ljava/lang/IllegalStateException;
        //  1028   1035   1028   1029   Any
        //  1029   1035   1035   1036   Ljava/lang/IllegalArgumentException;
        //  1029   1035   1035   1036   Any
        //  1052   1059   1059   1060   Any
        //  1052   1059   1052   1053   Ljava/lang/NumberFormatException;
        //  1052   1059   1052   1053   Any
        //  1052   1059   3      8      Ljava/lang/ClassCastException;
        //  1052   1059   1059   1060   Any
        //  1167   1174   1174   1175   Any
        //  1168   1174   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1167   1174   1174   1175   Any
        //  1168   1174   1174   1175   Any
        //  1167   1174   1167   1168   Ljava/lang/RuntimeException;
        //  1178   1185   1185   1186   Any
        //  1178   1185   1178   1179   Ljava/lang/ArithmeticException;
        //  1178   1185   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1179   1185   1178   1179   Ljava/lang/EnumConstantNotPresentException;
        //  1178   1185   3      8      Ljava/lang/NegativeArraySizeException;
        //  1292   1299   1299   1300   Any
        //  1292   1299   1292   1293   Any
        //  1293   1299   1299   1300   Ljava/lang/ClassCastException;
        //  1292   1299   1292   1293   Ljava/lang/IllegalArgumentException;
        //  1292   1299   1292   1293   Any
        //  1316   1323   1323   1324   Any
        //  1316   1323   1323   1324   Ljava/lang/StringIndexOutOfBoundsException;
        //  1316   1323   3      8      Ljava/lang/IllegalStateException;
        //  1317   1323   1316   1317   Any
        //  1316   1323   3      8      Any
        //  1327   1334   1334   1335   Any
        //  1327   1334   1334   1335   Any
        //  1328   1334   3      8      Ljava/lang/AssertionError;
        //  1328   1334   1327   1328   Any
        //  1327   1334   1327   1328   Ljava/lang/NullPointerException;
        //  1440   1446   1446   1447   Any
        //  1440   1446   1446   1447   Any
        //  1440   1446   3      8      Any
        //  1440   1446   3      8      Ljava/util/ConcurrentModificationException;
        //  1440   1446   1446   1447   Ljava/util/NoSuchElementException;
        //  1464   1470   1470   1471   Any
        //  1464   1470   3      8      Ljava/lang/NullPointerException;
        //  1464   1470   1470   1471   Any
        //  1464   1470   3      8      Any
        //  1464   1470   1470   1471   Ljava/lang/IndexOutOfBoundsException;
        //  1474   1481   1481   1482   Any
        //  1475   1481   3      8      Ljava/util/NoSuchElementException;
        //  1474   1481   1481   1482   Any
        //  1475   1481   1481   1482   Any
        //  1474   1481   1474   1475   Any
        //  1759   1766   1766   1767   Any
        //  1759   1766   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1760   1766   1759   1760   Ljava/util/NoSuchElementException;
        //  1760   1766   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1759   1766   1766   1767   Any
        //  1871   1878   1878   1879   Any
        //  1872   1878   1878   1879   Any
        //  1872   1878   1871   1872   Ljava/lang/AssertionError;
        //  1871   1878   3      8      Ljava/lang/NegativeArraySizeException;
        //  1871   1878   3      8      Ljava/lang/NullPointerException;
        //  1882   1889   1889   1890   Any
        //  1882   1889   1889   1890   Any
        //  1883   1889   3      8      Any
        //  1882   1889   3      8      Any
        //  1882   1889   1882   1883   Any
        //  1950   1957   1957   1958   Any
        //  1951   1957   3      8      Ljava/lang/AssertionError;
        //  1951   1957   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1950   1957   1950   1951   Any
        //  1951   1957   1957   1958   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2062   2069   2069   2070   Any
        //  2063   2069   3      8      Any
        //  2062   2069   3      8      Ljava/lang/IllegalStateException;
        //  2063   2069   2069   2070   Any
        //  2063   2069   2062   2063   Ljava/lang/NumberFormatException;
        //  2073   2080   2080   2081   Any
        //  2074   2080   2073   2074   Ljava/lang/IllegalStateException;
        //  2073   2080   2073   2074   Any
        //  2073   2080   2073   2074   Ljava/lang/IllegalArgumentException;
        //  2073   2080   2080   2081   Ljava/lang/AssertionError;
        //  2144   2151   2151   2152   Any
        //  2144   2151   2144   2145   Ljava/lang/UnsupportedOperationException;
        //  2145   2151   3      8      Any
        //  2144   2151   2144   2145   Ljava/lang/AssertionError;
        //  2145   2151   2144   2145   Any
        //  2254   2261   2261   2262   Any
        //  2254   2261   2254   2255   Ljava/lang/NegativeArraySizeException;
        //  2255   2261   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2254   2261   3      8      Ljava/lang/AssertionError;
        //  2255   2261   2254   2255   Any
        //  2265   2272   2272   2273   Any
        //  2266   2272   2272   2273   Any
        //  2265   2272   2265   2266   Any
        //  2266   2272   3      8      Any
        //  2265   2272   3      8      Ljava/lang/ClassCastException;
        //  2289   2296   2296   2297   Any
        //  2289   2296   2289   2290   Any
        //  2290   2296   2296   2297   Ljava/lang/NullPointerException;
        //  2290   2296   3      8      Ljava/lang/NullPointerException;
        //  2290   2296   2289   2290   Any
        //  2355   2362   2362   2363   Any
        //  2355   2362   2362   2363   Any
        //  2355   2362   2355   2356   Ljava/lang/IllegalStateException;
        //  2356   2362   2355   2356   Any
        //  2356   2362   2355   2356   Ljava/util/ConcurrentModificationException;
        //  2411   2418   2418   2419   Any
        //  2412   2418   2418   2419   Any
        //  2411   2418   3      8      Any
        //  2412   2418   2411   2412   Any
        //  2411   2418   2411   2412   Ljava/lang/EnumConstantNotPresentException;
        //  2432   2439   2439   2440   Any
        //  2432   2439   2439   2440   Any
        //  2432   2439   3      8      Ljava/lang/RuntimeException;
        //  2432   2439   2439   2440   Ljava/lang/UnsupportedOperationException;
        //  2433   2439   2432   2433   Ljava/lang/NullPointerException;
        //  2501   2507   2507   2508   Any
        //  2501   2507   3      8      Ljava/lang/ClassCastException;
        //  2501   2507   3      8      Any
        //  2501   2507   3      8      Ljava/util/ConcurrentModificationException;
        //  2501   2507   3      8      Any
        //  2572   2578   2578   2579   Any
        //  2572   2578   3      8      Ljava/lang/AssertionError;
        //  2572   2578   2578   2579   Any
        //  2572   2578   2578   2579   Any
        //  2572   2578   3      8      Ljava/util/NoSuchElementException;
        //  2628   2634   2634   2635   Any
        //  2628   2634   2634   2635   Ljava/lang/NumberFormatException;
        //  2628   2634   3      8      Any
        //  2628   2634   2634   2635   Ljava/lang/EnumConstantNotPresentException;
        //  2628   2634   2634   2635   Any
        //  2695   2702   2702   2703   Any
        //  2695   2702   2702   2703   Any
        //  2695   2702   2695   2696   Ljava/lang/IllegalStateException;
        //  2695   2702   2695   2696   Any
        //  2696   2702   2702   2703   Any
        //  2764   2771   2771   2772   Any
        //  2765   2771   3      8      Any
        //  2765   2771   2771   2772   Any
        //  2764   2771   2771   2772   Ljava/lang/NullPointerException;
        //  2764   2771   2764   2765   Ljava/lang/ClassCastException;
        //  2775   2782   2782   2783   Any
        //  2775   2782   3      8      Ljava/util/NoSuchElementException;
        //  2775   2782   2775   2776   Any
        //  2776   2782   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2775   2782   3      8      Ljava/lang/RuntimeException;
        //  2891   2898   2898   2899   Any
        //  2892   2898   3      8      Ljava/util/NoSuchElementException;
        //  2891   2898   2891   2892   Ljava/lang/NegativeArraySizeException;
        //  2891   2898   2891   2892   Any
        //  2892   2898   2898   2899   Ljava/lang/NullPointerException;
        //  2916   2922   2922   2923   Any
        //  2916   2922   3      8      Any
        //  2916   2922   2922   2923   Ljava/lang/NullPointerException;
        //  2916   2922   2922   2923   Any
        //  2916   2922   2922   2923   Ljava/lang/IllegalStateException;
        //  2971   2978   2978   2979   Any
        //  2971   2978   2971   2972   Any
        //  2972   2978   2971   2972   Ljava/lang/StringIndexOutOfBoundsException;
        //  2972   2978   2971   2972   Any
        //  2971   2978   2978   2979   Any
        //  3083   3090   3090   3091   Any
        //  3084   3090   3083   3084   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3083   3090   3      8      Any
        //  3084   3090   3090   3091   Any
        //  3083   3090   3      8      Any
        //  3151   3158   3158   3159   Any
        //  3151   3158   3151   3152   Ljava/lang/UnsupportedOperationException;
        //  3152   3158   3      8      Ljava/lang/NullPointerException;
        //  3152   3158   3151   3152   Ljava/lang/NumberFormatException;
        //  3152   3158   3151   3152   Any
        //  3162   3169   3169   3170   Any
        //  3162   3169   3162   3163   Ljava/lang/IllegalArgumentException;
        //  3163   3169   3169   3170   Ljava/util/ConcurrentModificationException;
        //  3163   3169   3      8      Any
        //  3162   3169   3169   3170   Any
        //  3175   3182   3182   3183   Any
        //  3176   3182   3175   3176   Any
        //  3176   3182   3182   3183   Ljava/lang/IllegalArgumentException;
        //  3175   3182   3175   3176   Ljava/lang/ArithmeticException;
        //  3175   3182   3182   3183   Any
        //  3187   3194   3194   3195   Any
        //  3188   3194   3194   3195   Any
        //  3188   3194   3187   3188   Ljava/lang/NullPointerException;
        //  3187   3194   3194   3195   Any
        //  3188   3194   3194   3195   Ljava/lang/IllegalStateException;
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
    
    public void c(final int p0, final int p1, final int p2, final int p3, final float p4, final float p5, final float p6, final float p7, final int p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2273
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2265
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2257
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           1916774193
        //    33: goto            39
        //    36: ldc_w           -1080284109
        //    39: ldc_w           1336979225
        //    42: ixor           
        //    43: lookupswitch {
        //          -265518294: 68
        //          1032783912: 36
        //          default: 2200
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //    75: goto            79
        //    78: athrow         
        //    79: astore          10
        //    81: getstatic       dev/nuker/pyro/fc.1:I
        //    84: ifeq            93
        //    87: ldc_w           989937719
        //    90: goto            96
        //    93: ldc_w           -282809963
        //    96: ldc_w           -74220342
        //    99: ixor           
        //   100: lookupswitch {
        //          -1064157955: 93
        //          347592031: 128
        //          default: 2246
        //        }
        //   128: aload           10
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //   137: goto            141
        //   140: athrow         
        //   141: getstatic       dev/nuker/pyro/fc.1:I
        //   144: ifeq            153
        //   147: ldc_w           -514951852
        //   150: goto            156
        //   153: ldc_w           -1391428494
        //   156: ldc_w           1115810448
        //   159: ixor           
        //   160: lookupswitch {
        //          -1546674236: 2220
        //          326186246: 153
        //          default: 188
        //        }
        //   188: astore          11
        //   190: aload_0        
        //   191: getstatic       dev/nuker/pyro/fc.c:I
        //   194: ifge            203
        //   197: ldc_w           -1636412652
        //   200: goto            206
        //   203: ldc_w           1703129230
        //   206: ldc_w           402035327
        //   209: ixor           
        //   210: lookupswitch {
        //          -1988050581: 2186
        //          -1678402578: 203
        //          default: 236
        //        }
        //   236: aload           11
        //   238: goto            242
        //   241: athrow         
        //   242: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;)V
        //   245: goto            249
        //   248: athrow         
        //   249: aload_0        
        //   250: aload           11
        //   252: iload_1        
        //   253: i2f            
        //   254: getstatic       dev/nuker/pyro/fc.c:I
        //   257: ifge            266
        //   260: ldc_w           1804199299
        //   263: goto            269
        //   266: ldc_w           -1551921778
        //   269: ldc_w           -491904547
        //   272: ixor           
        //   273: lookupswitch {
        //          -1993882530: 2234
        //          122963781: 266
        //          default: 300
        //        }
        //   300: iload_2        
        //   301: i2f            
        //   302: getstatic       dev/nuker/pyro/fc.c:I
        //   305: ifge            314
        //   308: ldc_w           1370541240
        //   311: goto            317
        //   314: ldc_w           -367299023
        //   317: ldc_w           370871605
        //   320: ixor           
        //   321: lookupswitch {
        //          -67077372: 348
        //          1202438541: 314
        //          default: 2198
        //        }
        //   348: iload_3        
        //   349: iload           4
        //   351: iload_3        
        //   352: iload           4
        //   354: idiv           
        //   355: iconst_2       
        //   356: idiv           
        //   357: iconst_2       
        //   358: getstatic       dev/nuker/pyro/fc.0:I
        //   361: ifeq            370
        //   364: ldc_w           975917978
        //   367: goto            373
        //   370: ldc_w           -806992728
        //   373: ldc_w           1336195092
        //   376: ixor           
        //   377: lookupswitch {
        //          663379731: 370
        //          1972366222: 2190
        //          default: 404
        //        }
        //   404: goto            408
        //   407: athrow         
        //   408: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;FFIIII)V
        //   411: goto            415
        //   414: athrow         
        //   415: iload           9
        //   417: ifne            469
        //   420: getstatic       dev/nuker/pyro/fc.c:I
        //   423: ifge            432
        //   426: ldc_w           -1638797259
        //   429: goto            435
        //   432: ldc_w           -1229493059
        //   435: ldc_w           806659358
        //   438: ixor           
        //   439: lookupswitch {
        //          -1371187925: 2216
        //          2120706305: 432
        //          default: 464
        //        }
        //   464: fload           5
        //   466: goto            537
        //   469: iload           9
        //   471: iconst_1       
        //   472: if_icmpne       480
        //   475: fload           6
        //   477: goto            537
        //   480: getstatic       dev/nuker/pyro/fc.0:I
        //   483: ifeq            492
        //   486: ldc_w           1154225512
        //   489: goto            495
        //   492: ldc_w           1245572721
        //   495: ldc_w           -1910439095
        //   498: ixor           
        //   499: lookupswitch {
        //          -890431967: 2214
        //          1085910435: 492
        //          default: 524
        //        }
        //   524: iload           9
        //   526: iconst_2       
        //   527: if_icmpne       535
        //   530: fload           7
        //   532: goto            537
        //   535: fload           8
        //   537: getstatic       dev/nuker/pyro/fc.1:I
        //   540: ifeq            549
        //   543: ldc_w           1068510126
        //   546: goto            552
        //   549: ldc_w           -1278917233
        //   552: ldc_w           -1867670363
        //   555: ixor           
        //   556: lookupswitch {
        //          -1357007093: 2210
        //          1338593884: 549
        //          default: 584
        //        }
        //   584: fstore          12
        //   586: fconst_0       
        //   587: fstore          13
        //   589: getstatic       dev/nuker/pyro/fc.1:I
        //   592: ifeq            601
        //   595: ldc_w           -18777805
        //   598: goto            604
        //   601: ldc_w           -2126813292
        //   604: ldc_w           -1973580656
        //   607: ixor           
        //   608: lookupswitch {
        //          1958540707: 2244
        //          2121136743: 601
        //          default: 636
        //        }
        //   636: iload_1        
        //   637: istore          14
        //   639: iload_1        
        //   640: iload_3        
        //   641: iadd           
        //   642: istore          15
        //   644: iload           14
        //   646: iload           15
        //   648: if_icmpge       657
        //   651: ldc_w           1716344218
        //   654: goto            660
        //   657: ldc_w           1716344217
        //   660: ldc_w           1865083419
        //   663: ixor           
        //   664: tableswitch {
        //          315588354: 688
        //          315588355: 1840
        //          default: 651
        //        }
        //   688: iload           14
        //   690: getstatic       dev/nuker/pyro/fc.1:I
        //   693: ifeq            702
        //   696: ldc_w           -1661506240
        //   699: goto            705
        //   702: ldc_w           416889632
        //   705: ldc_w           1300367737
        //   708: ixor           
        //   709: lookupswitch {
        //          -780835783: 702
        //          1432040025: 736
        //          default: 2236
        //        }
        //   736: iload_1        
        //   737: isub           
        //   738: i2f            
        //   739: iload_3        
        //   740: i2f            
        //   741: fdiv           
        //   742: fstore          16
        //   744: iconst_4       
        //   745: newarray        F
        //   747: dup            
        //   748: iconst_0       
        //   749: iload           9
        //   751: ifne            759
        //   754: fload           13
        //   756: goto            761
        //   759: fload           5
        //   761: fastore        
        //   762: dup            
        //   763: iconst_1       
        //   764: iload           9
        //   766: iconst_1       
        //   767: if_icmpne       775
        //   770: fload           13
        //   772: goto            822
        //   775: getstatic       dev/nuker/pyro/fc.0:I
        //   778: ifeq            787
        //   781: ldc_w           1742977404
        //   784: goto            790
        //   787: ldc_w           1522344612
        //   790: ldc_w           894691418
        //   793: ixor           
        //   794: lookupswitch {
        //          1387286822: 787
        //          1877920510: 820
        //          default: 2208
        //        }
        //   820: fload           6
        //   822: fastore        
        //   823: dup            
        //   824: iconst_2       
        //   825: iload           9
        //   827: iconst_2       
        //   828: if_icmpne       836
        //   831: fload           13
        //   833: goto            838
        //   836: fload           7
        //   838: fastore        
        //   839: dup            
        //   840: iconst_3       
        //   841: iload           9
        //   843: iconst_3       
        //   844: if_icmpne       852
        //   847: fload           13
        //   849: goto            898
        //   852: getstatic       dev/nuker/pyro/fc.c:I
        //   855: ifge            864
        //   858: ldc_w           2128255177
        //   861: goto            867
        //   864: ldc_w           1996399112
        //   867: ldc_w           -1744538692
        //   870: ixor           
        //   871: lookupswitch {
        //          -421598347: 864
        //          -285552204: 896
        //          default: 2222
        //        }
        //   896: fload           8
        //   898: fastore        
        //   899: astore          17
        //   901: iconst_4       
        //   902: newarray        F
        //   904: dup            
        //   905: iconst_0       
        //   906: getstatic       dev/nuker/pyro/fc.0:I
        //   909: ifeq            918
        //   912: ldc_w           -1188775195
        //   915: goto            921
        //   918: ldc_w           2147397026
        //   921: ldc_w           94214165
        //   924: ixor           
        //   925: lookupswitch {
        //          -1128717584: 918
        //          2053322167: 952
        //          default: 2212
        //        }
        //   952: iload           9
        //   954: ifne            962
        //   957: fload           16
        //   959: goto            964
        //   962: fload           5
        //   964: fastore        
        //   965: dup            
        //   966: iconst_1       
        //   967: iload           9
        //   969: iconst_1       
        //   970: if_icmpne       978
        //   973: fload           16
        //   975: goto            980
        //   978: fload           6
        //   980: fastore        
        //   981: dup            
        //   982: iconst_2       
        //   983: iload           9
        //   985: iconst_2       
        //   986: if_icmpne       994
        //   989: fload           16
        //   991: goto            996
        //   994: fload           7
        //   996: fastore        
        //   997: dup            
        //   998: iconst_3       
        //   999: getstatic       dev/nuker/pyro/fc.1:I
        //  1002: ifeq            1011
        //  1005: ldc_w           -497447626
        //  1008: goto            1014
        //  1011: ldc_w           596396348
        //  1014: ldc_w           470878412
        //  1017: ixor           
        //  1018: lookupswitch {
        //          -28801542: 1011
        //          1067270640: 1044
        //          default: 2232
        //        }
        //  1044: iload           9
        //  1046: iconst_3       
        //  1047: if_icmpne       1056
        //  1050: ldc_w           1961455513
        //  1053: goto            1059
        //  1056: ldc_w           1961455514
        //  1059: ldc_w           -598474228
        //  1062: ixor           
        //  1063: tableswitch {
        //          1367005994: 1084
        //          1367005995: 1089
        //          default: 1050
        //        }
        //  1084: fload           16
        //  1086: goto            1091
        //  1089: fload           8
        //  1091: fastore        
        //  1092: astore          18
        //  1094: aload           11
        //  1096: iload           14
        //  1098: i2d            
        //  1099: getstatic       dev/nuker/pyro/fc.c:I
        //  1102: ifge            1111
        //  1105: ldc_w           1495752882
        //  1108: goto            1114
        //  1111: ldc_w           346413283
        //  1114: ldc_w           1604651688
        //  1117: ixor           
        //  1118: lookupswitch {
        //          109210138: 1111
        //          1258345035: 1144
        //          default: 2192
        //        }
        //  1144: iload_2        
        //  1145: iload           4
        //  1147: iadd           
        //  1148: i2d            
        //  1149: dconst_0       
        //  1150: goto            1154
        //  1153: athrow         
        //  1154: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1157: goto            1161
        //  1160: athrow         
        //  1161: getstatic       dev/nuker/pyro/fc.1:I
        //  1164: ifeq            1173
        //  1167: ldc_w           -1640481325
        //  1170: goto            1176
        //  1173: ldc_w           493099192
        //  1176: ldc_w           626451315
        //  1179: ixor           
        //  1180: lookupswitch {
        //          -1150361952: 1173
        //          942865355: 1208
        //          default: 2182
        //        }
        //  1208: aload           17
        //  1210: iconst_0       
        //  1211: faload         
        //  1212: aload           17
        //  1214: iconst_1       
        //  1215: faload         
        //  1216: aload           17
        //  1218: iconst_2       
        //  1219: faload         
        //  1220: aload           17
        //  1222: iconst_3       
        //  1223: faload         
        //  1224: goto            1228
        //  1227: athrow         
        //  1228: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: goto            1239
        //  1238: athrow         
        //  1239: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1242: goto            1246
        //  1245: athrow         
        //  1246: getstatic       dev/nuker/pyro/fc.c:I
        //  1249: ifge            1258
        //  1252: ldc_w           2124326868
        //  1255: goto            1261
        //  1258: ldc_w           832268946
        //  1261: ldc_w           297495551
        //  1264: ixor           
        //  1265: lookupswitch {
        //          538968429: 1292
        //          1864748075: 1258
        //          default: 2228
        //        }
        //  1292: aload           11
        //  1294: getstatic       dev/nuker/pyro/fc.c:I
        //  1297: ifge            1306
        //  1300: ldc_w           1923070598
        //  1303: goto            1309
        //  1306: ldc_w           12875200
        //  1309: ldc_w           -2006199631
        //  1312: ixor           
        //  1313: lookupswitch {
        //          -2001754255: 1340
        //          -84645833: 1306
        //          default: 2230
        //        }
        //  1340: iload           14
        //  1342: i2d            
        //  1343: dconst_1       
        //  1344: dadd           
        //  1345: iload_2        
        //  1346: iload           4
        //  1348: iadd           
        //  1349: i2d            
        //  1350: dconst_0       
        //  1351: goto            1355
        //  1354: athrow         
        //  1355: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1358: goto            1362
        //  1361: athrow         
        //  1362: getstatic       dev/nuker/pyro/fc.0:I
        //  1365: ifeq            1374
        //  1368: ldc_w           359158176
        //  1371: goto            1377
        //  1374: ldc_w           -1707364992
        //  1377: ldc_w           1174418313
        //  1380: ixor           
        //  1381: lookupswitch {
        //          -990284727: 1374
        //          1399349801: 2204
        //          default: 1408
        //        }
        //  1408: aload           18
        //  1410: iconst_0       
        //  1411: faload         
        //  1412: getstatic       dev/nuker/pyro/fc.c:I
        //  1415: ifge            1424
        //  1418: ldc_w           -1772647295
        //  1421: goto            1427
        //  1424: ldc_w           -616583297
        //  1427: ldc_w           -748330741
        //  1430: ixor           
        //  1431: lookupswitch {
        //          140168820: 1456
        //          1160965514: 1424
        //          default: 2202
        //        }
        //  1456: aload           18
        //  1458: iconst_1       
        //  1459: faload         
        //  1460: aload           18
        //  1462: iconst_2       
        //  1463: faload         
        //  1464: aload           18
        //  1466: iconst_3       
        //  1467: faload         
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1475: goto            1479
        //  1478: athrow         
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: aload           11
        //  1492: iload           14
        //  1494: i2d            
        //  1495: dconst_1       
        //  1496: dadd           
        //  1497: iload_2        
        //  1498: i2d            
        //  1499: dconst_0       
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: aload           18
        //  1513: iconst_0       
        //  1514: faload         
        //  1515: aload           18
        //  1517: iconst_1       
        //  1518: faload         
        //  1519: getstatic       dev/nuker/pyro/fc.0:I
        //  1522: ifeq            1531
        //  1525: ldc_w           262579970
        //  1528: goto            1534
        //  1531: ldc_w           -2128075808
        //  1534: ldc_w           1091222716
        //  1537: ixor           
        //  1538: lookupswitch {
        //          -1071472804: 1564
        //          1319902142: 1531
        //          default: 2184
        //        }
        //  1564: aload           18
        //  1566: iconst_2       
        //  1567: faload         
        //  1568: aload           18
        //  1570: iconst_3       
        //  1571: faload         
        //  1572: getstatic       dev/nuker/pyro/fc.0:I
        //  1575: ifeq            1584
        //  1578: ldc_w           100339541
        //  1581: goto            1587
        //  1584: ldc_w           144495921
        //  1587: ldc_w           1304466809
        //  1590: ixor           
        //  1591: lookupswitch {
        //          1163673672: 1616
        //          1211865644: 1584
        //          default: 2224
        //        }
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1623: goto            1627
        //  1626: athrow         
        //  1627: goto            1631
        //  1630: athrow         
        //  1631: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1634: goto            1638
        //  1637: athrow         
        //  1638: aload           11
        //  1640: iload           14
        //  1642: i2d            
        //  1643: getstatic       dev/nuker/pyro/fc.0:I
        //  1646: ifeq            1655
        //  1649: ldc_w           -736542332
        //  1652: goto            1658
        //  1655: ldc_w           1527593170
        //  1658: ldc_w           2121449925
        //  1661: ixor           
        //  1662: lookupswitch {
        //          -1435795391: 1655
        //          629143831: 1688
        //          default: 2226
        //        }
        //  1688: iload_2        
        //  1689: i2d            
        //  1690: dconst_0       
        //  1691: getstatic       dev/nuker/pyro/fc.0:I
        //  1694: ifeq            1703
        //  1697: ldc_w           -964957250
        //  1700: goto            1706
        //  1703: ldc_w           -1106639102
        //  1706: ldc_w           1200684195
        //  1709: ixor           
        //  1710: lookupswitch {
        //          -2115299555: 1703
        //          -107283551: 1736
        //          default: 2206
        //        }
        //  1736: goto            1740
        //  1739: athrow         
        //  1740: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1743: goto            1747
        //  1746: athrow         
        //  1747: aload           17
        //  1749: iconst_0       
        //  1750: faload         
        //  1751: getstatic       dev/nuker/pyro/fc.1:I
        //  1754: ifeq            1763
        //  1757: ldc_w           -679495373
        //  1760: goto            1766
        //  1763: ldc_w           -1354781442
        //  1766: ldc_w           693003721
        //  1769: ixor           
        //  1770: lookupswitch {
        //          -2039363273: 1796
        //          -30286598: 1763
        //          default: 2240
        //        }
        //  1796: aload           17
        //  1798: iconst_1       
        //  1799: faload         
        //  1800: aload           17
        //  1802: iconst_2       
        //  1803: faload         
        //  1804: aload           17
        //  1806: iconst_3       
        //  1807: faload         
        //  1808: goto            1812
        //  1811: athrow         
        //  1812: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1815: goto            1819
        //  1818: athrow         
        //  1819: goto            1823
        //  1822: athrow         
        //  1823: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1826: goto            1830
        //  1829: athrow         
        //  1830: fload           16
        //  1832: fstore          13
        //  1834: iinc            14, 1
        //  1837: goto            644
        //  1840: aload_0        
        //  1841: getstatic       dev/nuker/pyro/fc.0:I
        //  1844: ifeq            1853
        //  1847: ldc_w           -837662218
        //  1850: goto            1856
        //  1853: ldc_w           -1968396256
        //  1856: ldc_w           -903059958
        //  1859: ixor           
        //  1860: lookupswitch {
        //          71184380: 1853
        //          1082183210: 1888
        //          default: 2188
        //        }
        //  1888: aload           11
        //  1890: iload_1        
        //  1891: getstatic       dev/nuker/pyro/fc.1:I
        //  1894: ifeq            1903
        //  1897: ldc_w           1235701488
        //  1900: goto            1906
        //  1903: ldc_w           1568426393
        //  1906: ldc_w           1709145037
        //  1909: ixor           
        //  1910: lookupswitch {
        //          746075453: 1903
        //          950219348: 1936
        //          default: 2218
        //        }
        //  1936: iload_2        
        //  1937: iload_3        
        //  1938: iload           4
        //  1940: fload           12
        //  1942: iconst_4       
        //  1943: newarray        F
        //  1945: dup            
        //  1946: iconst_0       
        //  1947: getstatic       dev/nuker/pyro/fc.1:I
        //  1950: ifeq            1959
        //  1953: ldc_w           -1106297927
        //  1956: goto            1962
        //  1959: ldc_w           -2068697055
        //  1962: ldc_w           -1248378358
        //  1965: ixor           
        //  1966: lookupswitch {
        //          -1245939577: 1959
        //          194542003: 2242
        //          default: 1992
        //        }
        //  1992: fload           5
        //  1994: fastore        
        //  1995: dup            
        //  1996: iconst_1       
        //  1997: fload           6
        //  1999: fastore        
        //  2000: dup            
        //  2001: iconst_2       
        //  2002: fload           7
        //  2004: fastore        
        //  2005: dup            
        //  2006: iconst_3       
        //  2007: getstatic       dev/nuker/pyro/fc.0:I
        //  2010: ifeq            2019
        //  2013: ldc_w           1862770411
        //  2016: goto            2022
        //  2019: ldc_w           1958262476
        //  2022: ldc_w           1866759143
        //  2025: ixor           
        //  2026: lookupswitch {
        //          4449548: 2019
        //          469552427: 2052
        //          default: 2238
        //        }
        //  2052: fload           8
        //  2054: fastore        
        //  2055: getstatic       dev/nuker/pyro/fc.1:I
        //  2058: ifeq            2067
        //  2061: ldc_w           -825035175
        //  2064: goto            2070
        //  2067: ldc_w           -658620847
        //  2070: ldc_w           920979547
        //  2073: ixor           
        //  2074: lookupswitch {
        //          -296012278: 2100
        //          -130548222: 2067
        //          default: 2194
        //        }
        //  2100: goto            2104
        //  2103: athrow         
        //  2104: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;IIIIF[F)V
        //  2107: goto            2111
        //  2110: athrow         
        //  2111: getstatic       dev/nuker/pyro/fc.1:I
        //  2114: ifeq            2123
        //  2117: ldc_w           755635020
        //  2120: goto            2126
        //  2123: ldc_w           -685977310
        //  2126: ldc_w           -553540947
        //  2129: ixor           
        //  2130: lookupswitch {
        //          -234114591: 2196
        //          15003932: 2123
        //          default: 2156
        //        }
        //  2156: aload           10
        //  2158: goto            2162
        //  2161: athrow         
        //  2162: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //  2165: goto            2169
        //  2168: athrow         
        //  2169: aload_0        
        //  2170: goto            2174
        //  2173: athrow         
        //  2174: invokespecial   dev/nuker/pyro/f3V.c:()V
        //  2177: goto            2181
        //  2180: athrow         
        //  2181: return         
        //  2182: aconst_null    
        //  2183: athrow         
        //  2184: aconst_null    
        //  2185: athrow         
        //  2186: aconst_null    
        //  2187: athrow         
        //  2188: aconst_null    
        //  2189: athrow         
        //  2190: aconst_null    
        //  2191: athrow         
        //  2192: aconst_null    
        //  2193: athrow         
        //  2194: aconst_null    
        //  2195: athrow         
        //  2196: aconst_null    
        //  2197: athrow         
        //  2198: aconst_null    
        //  2199: athrow         
        //  2200: aconst_null    
        //  2201: athrow         
        //  2202: aconst_null    
        //  2203: athrow         
        //  2204: aconst_null    
        //  2205: athrow         
        //  2206: aconst_null    
        //  2207: athrow         
        //  2208: aconst_null    
        //  2209: athrow         
        //  2210: aconst_null    
        //  2211: athrow         
        //  2212: aconst_null    
        //  2213: athrow         
        //  2214: aconst_null    
        //  2215: athrow         
        //  2216: aconst_null    
        //  2217: athrow         
        //  2218: aconst_null    
        //  2219: athrow         
        //  2220: aconst_null    
        //  2221: athrow         
        //  2222: aconst_null    
        //  2223: athrow         
        //  2224: aconst_null    
        //  2225: athrow         
        //  2226: aconst_null    
        //  2227: athrow         
        //  2228: aconst_null    
        //  2229: athrow         
        //  2230: aconst_null    
        //  2231: athrow         
        //  2232: aconst_null    
        //  2233: athrow         
        //  2234: aconst_null    
        //  2235: athrow         
        //  2236: aconst_null    
        //  2237: athrow         
        //  2238: aconst_null    
        //  2239: athrow         
        //  2240: aconst_null    
        //  2241: athrow         
        //  2242: aconst_null    
        //  2243: athrow         
        //  2244: aconst_null    
        //  2245: athrow         
        //  2246: aconst_null    
        //  2247: athrow         
        //  2248: pop            
        //  2249: goto            24
        //  2252: pop            
        //  2253: aconst_null    
        //  2254: goto            2248
        //  2257: dup            
        //  2258: ifnull          2248
        //  2261: checkcast       Ljava/lang/Throwable;
        //  2264: athrow         
        //  2265: dup            
        //  2266: ifnull          2252
        //  2269: checkcast       Ljava/lang/Throwable;
        //  2272: athrow         
        //  2273: aconst_null    
        //  2274: athrow         
        //    StackMapTable: 00 F7 FF 00 03 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 01 07 00 1D F9 00 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 00 00 0B 42 01 1C 42 07 00 1D 00 45 07 00 1D 40 07 00 B6 FC 00 0D 07 00 B6 42 01 1F 44 07 00 1D 40 07 00 B6 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0B 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 00 02 07 00 63 01 5F 07 00 63 FF 00 0E 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 01 07 00 03 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 02 07 00 03 01 5D 07 00 03 44 07 00 1D FF 00 00 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 45 07 00 1D 00 FF 00 10 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 03 07 00 03 07 00 63 02 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 04 07 00 03 07 00 63 02 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 03 07 00 03 07 00 63 02 FF 00 0D 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 04 07 00 03 07 00 63 02 02 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 05 07 00 03 07 00 63 02 02 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 04 07 00 03 07 00 63 02 02 FF 00 15 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 08 07 00 03 07 00 63 02 02 01 01 01 01 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 09 07 00 03 07 00 63 02 02 01 01 01 01 01 FF 00 1E 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 08 07 00 03 07 00 63 02 02 01 01 01 01 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 08 07 00 03 07 00 63 02 02 01 01 01 01 45 07 00 1D 00 10 42 01 1C 04 0A 0B 42 01 1C 0A 41 02 4B 02 FF 00 02 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 02 02 01 5F 02 FD 00 10 02 02 42 01 1F FD 00 07 01 01 06 05 42 01 1B 4D 01 FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 02 01 01 5E 01 FF 00 16 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 02 FF 00 0D 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 0B 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 02 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 01 FF 00 1D 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 02 FF 00 0D 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 02 FF 00 0D 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 0B 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 02 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 01 FF 00 1C 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 04 07 00 AB 07 00 AB 01 02 FF 00 13 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 02 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 01 FF 00 1E 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 09 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 02 FF 00 0D 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 02 FF 00 0D 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 02 FF 00 0E 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 02 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 01 FF 00 1D 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 05 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 05 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 02 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 01 FF 00 18 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 04 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 04 07 00 AB 07 00 AB 01 02 FF 00 13 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 03 01 FF 00 1D 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 48 07 00 0D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5F 07 00 63 52 07 00 4B FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 55 40 07 00 63 45 07 00 1D 00 0B 42 01 1E 4D 07 00 63 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 FF 00 0D 00 00 00 01 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 FF 00 0F 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 01 FF 00 1C 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 4E 07 00 11 FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 4C 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 13 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1D 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 13 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 06 07 00 63 02 02 02 02 01 FF 00 1C 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 42 07 00 53 FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 45 07 00 1D 00 FF 00 10 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 03 01 FF 00 1D 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 0E 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1D 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0F 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 02 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 01 FF 00 1D 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 0E 00 00 00 01 07 00 1D FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 4B 40 07 00 63 45 07 00 1D 00 F8 00 09 4C 07 00 03 FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0E 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 03 07 00 03 07 00 63 01 FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 04 07 00 03 07 00 63 01 01 FF 00 1D 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 03 07 00 03 07 00 63 01 FF 00 16 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0B 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 01 FF 00 1D 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 FF 00 1A 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0B 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 01 FF 00 1D 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 FF 00 0E 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB FF 00 02 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 09 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 01 FF 00 1D 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 42 07 00 1D FF 00 00 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 45 07 00 1D 00 0B 42 01 1D 44 07 00 1D 40 07 00 B6 45 07 00 1D 00 43 07 00 4B 40 07 00 03 45 07 00 1D 00 FF 00 00 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 01 07 00 03 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 01 07 00 03 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 08 07 00 03 07 00 63 02 02 01 01 01 01 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 01 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 04 07 00 03 07 00 63 02 02 F9 00 01 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 41 07 00 63 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 01 02 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 00 01 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 03 07 00 03 07 00 63 01 FF 00 01 00 0B 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 00 01 07 00 63 FF 00 01 00 11 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 01 41 07 00 63 FF 00 01 00 12 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 00 03 07 00 AB 07 00 AB 01 FF 00 01 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 03 07 00 03 07 00 63 02 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 01 01 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 FF 00 01 00 13 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 01 00 10 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 02 02 01 01 00 0A 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 07 00 AB 01 F9 00 01 F8 00 01 FF 00 01 00 0A 07 00 03 01 01 01 01 02 02 02 02 01 00 01 07 00 4B 43 05 44 07 00 4B 47 05 FF 00 07 00 0C 07 00 03 01 01 01 01 02 02 02 02 01 07 00 B6 07 00 63 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2257   2265   Ljava/lang/NegativeArraySizeException;
        //  2257   2265   2257   2265   Ljava/lang/ClassCastException;
        //  2273   2275   3      8      Ljava/lang/NullPointerException;
        //  71     78     78     79     Any
        //  72     78     71     72     Ljava/lang/EnumConstantNotPresentException;
        //  72     78     71     72     Any
        //  72     78     71     72     Any
        //  72     78     71     72     Ljava/lang/IndexOutOfBoundsException;
        //  133    140    140    141    Any
        //  133    140    140    141    Any
        //  133    140    140    141    Any
        //  133    140    133    134    Any
        //  133    140    133    134    Any
        //  241    248    248    249    Any
        //  242    248    248    249    Any
        //  242    248    241    242    Any
        //  242    248    248    249    Ljava/lang/ClassCastException;
        //  242    248    3      8      Ljava/lang/ClassCastException;
        //  408    414    414    415    Any
        //  408    414    3      8      Ljava/util/NoSuchElementException;
        //  408    414    3      8      Ljava/lang/IllegalArgumentException;
        //  408    414    414    415    Ljava/lang/ClassCastException;
        //  408    414    414    415    Any
        //  1153   1160   1160   1161   Any
        //  1154   1160   1160   1161   Any
        //  1154   1160   1153   1154   Ljava/lang/IllegalArgumentException;
        //  1154   1160   1160   1161   Any
        //  1153   1160   3      8      Ljava/util/NoSuchElementException;
        //  1227   1234   1234   1235   Any
        //  1228   1234   1227   1228   Ljava/lang/EnumConstantNotPresentException;
        //  1227   1234   1227   1228   Ljava/lang/IndexOutOfBoundsException;
        //  1227   1234   3      8      Ljava/util/ConcurrentModificationException;
        //  1228   1234   1234   1235   Any
        //  1238   1245   1245   1246   Any
        //  1238   1245   3      8      Ljava/lang/IllegalArgumentException;
        //  1239   1245   1245   1246   Ljava/lang/AssertionError;
        //  1238   1245   3      8      Any
        //  1239   1245   1238   1239   Ljava/lang/IllegalStateException;
        //  1355   1361   1361   1362   Any
        //  1355   1361   3      8      Any
        //  1355   1361   3      8      Any
        //  1355   1361   3      8      Any
        //  1355   1361   3      8      Any
        //  1471   1478   1478   1479   Any
        //  1472   1478   1478   1479   Ljava/lang/ClassCastException;
        //  1471   1478   1478   1479   Any
        //  1471   1478   1478   1479   Any
        //  1472   1478   1471   1472   Ljava/lang/EnumConstantNotPresentException;
        //  1482   1489   1489   1490   Any
        //  1483   1489   1482   1483   Any
        //  1483   1489   1482   1483   Any
        //  1482   1489   1489   1490   Ljava/lang/ClassCastException;
        //  1483   1489   1482   1483   Any
        //  1503   1510   1510   1511   Any
        //  1503   1510   1510   1511   Ljava/lang/UnsupportedOperationException;
        //  1503   1510   1510   1511   Any
        //  1504   1510   1503   1504   Any
        //  1503   1510   1510   1511   Any
        //  1619   1626   1626   1627   Any
        //  1619   1626   1626   1627   Any
        //  1619   1626   1619   1620   Ljava/lang/UnsupportedOperationException;
        //  1620   1626   3      8      Any
        //  1620   1626   3      8      Any
        //  1631   1637   1637   1638   Any
        //  1631   1637   3      8      Any
        //  1631   1637   1637   1638   Any
        //  1631   1637   1637   1638   Ljava/util/ConcurrentModificationException;
        //  1631   1637   3      8      Ljava/lang/NegativeArraySizeException;
        //  1739   1746   1746   1747   Any
        //  1740   1746   1739   1740   Any
        //  1739   1746   1746   1747   Any
        //  1740   1746   1746   1747   Ljava/lang/ClassCastException;
        //  1740   1746   1746   1747   Any
        //  1812   1818   1818   1819   Any
        //  1812   1818   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1812   1818   1818   1819   Ljava/lang/StringIndexOutOfBoundsException;
        //  1812   1818   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1812   1818   3      8      Any
        //  1822   1829   1829   1830   Any
        //  1822   1829   1822   1823   Ljava/lang/ClassCastException;
        //  1823   1829   1822   1823   Ljava/lang/IllegalStateException;
        //  1823   1829   1822   1823   Ljava/lang/IndexOutOfBoundsException;
        //  1823   1829   3      8      Any
        //  2103   2110   2110   2111   Any
        //  2104   2110   3      8      Ljava/lang/NegativeArraySizeException;
        //  2104   2110   3      8      Any
        //  2104   2110   2110   2111   Ljava/lang/NullPointerException;
        //  2103   2110   2103   2104   Any
        //  2161   2168   2168   2169   Any
        //  2161   2168   3      8      Ljava/lang/NegativeArraySizeException;
        //  2161   2168   3      8      Any
        //  2161   2168   2161   2162   Any
        //  2162   2168   3      8      Any
        //  2173   2180   2180   2181   Any
        //  2174   2180   2173   2174   Ljava/lang/NegativeArraySizeException;
        //  2174   2180   3      8      Any
        //  2174   2180   2173   2174   Ljava/util/ConcurrentModificationException;
        //  2174   2180   3      8      Any
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
    
    public void 0(final int p0, final int p1, final int p2, final int p3, final float p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1359
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1351
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1343
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/renderer/Tessellator.func_178181_a:()Lnet/minecraft/client/renderer/Tessellator;
        //    31: goto            35
        //    34: athrow         
        //    35: getstatic       dev/nuker/pyro/fc.1:I
        //    38: ifeq            47
        //    41: ldc_w           1163167853
        //    44: goto            50
        //    47: ldc_w           -446391085
        //    50: ldc_w           -1596126745
        //    53: ixor           
        //    54: lookupswitch {
        //          -443973238: 47
        //          1169790260: 80
        //          default: 1314
        //        }
        //    80: astore          6
        //    82: aload           6
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   net/minecraft/client/renderer/Tessellator.func_178180_c:()Lnet/minecraft/client/renderer/BufferBuilder;
        //    91: goto            95
        //    94: athrow         
        //    95: astore          7
        //    97: aload_0        
        //    98: aload           7
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            112
        //   106: ldc_w           -2107203302
        //   109: goto            115
        //   112: ldc_w           -269998471
        //   115: ldc_w           714079779
        //   118: ixor           
        //   119: lookupswitch {
        //          -1461100743: 112
        //          -983050150: 144
        //          default: 1316
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokespecial   dev/nuker/pyro/f3V.c:(Lnet/minecraft/client/renderer/BufferBuilder;)V
        //   151: goto            155
        //   154: athrow         
        //   155: fconst_0       
        //   156: fstore          8
        //   158: iload_2        
        //   159: istore          9
        //   161: iload_2        
        //   162: iload           4
        //   164: iadd           
        //   165: getstatic       dev/nuker/pyro/fc.c:I
        //   168: ifge            177
        //   171: ldc_w           707185354
        //   174: goto            180
        //   177: ldc_w           1284667908
        //   180: ldc_w           -431478589
        //   183: ixor           
        //   184: lookupswitch {
        //          -1665480656: 177
        //          -865148407: 1318
        //          default: 212
        //        }
        //   212: istore          10
        //   214: iload           9
        //   216: iload           10
        //   218: if_icmpge       1097
        //   221: iload           9
        //   223: iload_2        
        //   224: isub           
        //   225: i2f            
        //   226: iload           4
        //   228: i2f            
        //   229: fdiv           
        //   230: getstatic       dev/nuker/pyro/fc.0:I
        //   233: ifeq            242
        //   236: ldc_w           -159239943
        //   239: goto            245
        //   242: ldc_w           646482091
        //   245: ldc_w           585706196
        //   248: ixor           
        //   249: lookupswitch {
        //          -731178451: 1330
        //          986085331: 242
        //          default: 276
        //        }
        //   276: fstore          11
        //   278: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   281: fload           8
        //   283: fconst_1       
        //   284: fconst_1       
        //   285: fconst_1       
        //   286: goto            290
        //   289: athrow         
        //   290: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   293: goto            297
        //   296: athrow         
        //   297: astore          12
        //   299: getstatic       dev/nuker/pyro/fc.c:I
        //   302: ifge            311
        //   305: ldc_w           1324638963
        //   308: goto            314
        //   311: ldc_w           -352516443
        //   314: ldc_w           1440692015
        //   317: ixor           
        //   318: lookupswitch {
        //          -1088278134: 344
        //          455824860: 311
        //          default: 1304
        //        }
        //   344: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            359
        //   353: ldc_w           1491506001
        //   356: goto            362
        //   359: ldc_w           1795932381
        //   362: ldc_w           -1247149212
        //   365: ixor           
        //   366: lookupswitch {
        //          -948168613: 359
        //          -313749451: 1302
        //          default: 392
        //        }
        //   392: fload           11
        //   394: fconst_1       
        //   395: fconst_1       
        //   396: fconst_1       
        //   397: goto            401
        //   400: athrow         
        //   401: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   404: goto            408
        //   407: athrow         
        //   408: astore          13
        //   410: getstatic       dev/nuker/pyro/fc.1:I
        //   413: ifeq            422
        //   416: ldc_w           -1689426572
        //   419: goto            425
        //   422: ldc_w           840578443
        //   425: ldc_w           343391948
        //   428: ixor           
        //   429: lookupswitch {
        //          -1891968072: 1296
        //          -1083408991: 422
        //          default: 456
        //        }
        //   456: aload           7
        //   458: iload_1        
        //   459: i2d            
        //   460: getstatic       dev/nuker/pyro/fc.1:I
        //   463: ifeq            472
        //   466: ldc_w           478854252
        //   469: goto            475
        //   472: ldc_w           -2057803809
        //   475: ldc_w           2053341765
        //   478: ixor           
        //   479: lookupswitch {
        //          -1416810405: 472
        //          1726561833: 1324
        //          default: 504
        //        }
        //   504: iload           9
        //   506: i2d            
        //   507: dconst_1       
        //   508: dadd           
        //   509: dconst_0       
        //   510: getstatic       dev/nuker/pyro/fc.0:I
        //   513: ifeq            522
        //   516: ldc_w           -1308534989
        //   519: goto            525
        //   522: ldc_w           -599381472
        //   525: ldc_w           1045179888
        //   528: ixor           
        //   529: lookupswitch {
        //          -1941079357: 522
        //          -502659120: 556
        //          default: 1320
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   563: goto            567
        //   566: athrow         
        //   567: aload           13
        //   569: iconst_0       
        //   570: faload         
        //   571: aload           13
        //   573: iconst_1       
        //   574: faload         
        //   575: aload           13
        //   577: iconst_2       
        //   578: faload         
        //   579: fconst_1       
        //   580: goto            584
        //   583: athrow         
        //   584: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   587: goto            591
        //   590: athrow         
        //   591: goto            595
        //   594: athrow         
        //   595: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   598: goto            602
        //   601: athrow         
        //   602: aload           7
        //   604: getstatic       dev/nuker/pyro/fc.0:I
        //   607: ifeq            616
        //   610: ldc_w           1984671215
        //   613: goto            619
        //   616: ldc_w           1135434432
        //   619: ldc_w           -602389616
        //   622: ixor           
        //   623: lookupswitch {
        //          -1437340033: 1306
        //          2059213604: 616
        //          default: 648
        //        }
        //   648: iload_1        
        //   649: iload_3        
        //   650: iadd           
        //   651: i2d            
        //   652: iload           9
        //   654: i2d            
        //   655: dconst_1       
        //   656: dadd           
        //   657: dconst_0       
        //   658: goto            662
        //   661: athrow         
        //   662: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   665: goto            669
        //   668: athrow         
        //   669: aload           13
        //   671: iconst_0       
        //   672: faload         
        //   673: aload           13
        //   675: iconst_1       
        //   676: faload         
        //   677: aload           13
        //   679: iconst_2       
        //   680: faload         
        //   681: fconst_1       
        //   682: goto            686
        //   685: athrow         
        //   686: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   689: goto            693
        //   692: athrow         
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            705
        //   699: ldc_w           -73211215
        //   702: goto            708
        //   705: ldc_w           -1351280312
        //   708: ldc_w           484838115
        //   711: ixor           
        //   712: lookupswitch {
        //          -1282206805: 740
        //          -414914478: 705
        //          default: 1322
        //        }
        //   740: goto            744
        //   743: athrow         
        //   744: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   747: goto            751
        //   750: athrow         
        //   751: getstatic       dev/nuker/pyro/fc.0:I
        //   754: ifeq            763
        //   757: ldc_w           523585398
        //   760: goto            766
        //   763: ldc_w           1334615430
        //   766: ldc_w           629208697
        //   769: ixor           
        //   770: lookupswitch {
        //          984985871: 763
        //          1779198975: 796
        //          default: 1308
        //        }
        //   796: aload           7
        //   798: iload_1        
        //   799: iload_3        
        //   800: iadd           
        //   801: i2d            
        //   802: iload           9
        //   804: i2d            
        //   805: dconst_0       
        //   806: goto            810
        //   809: athrow         
        //   810: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   813: goto            817
        //   816: athrow         
        //   817: aload           12
        //   819: iconst_0       
        //   820: faload         
        //   821: getstatic       dev/nuker/pyro/fc.c:I
        //   824: ifge            833
        //   827: ldc_w           1446215191
        //   830: goto            836
        //   833: ldc_w           703838356
        //   836: ldc_w           -325459394
        //   839: ixor           
        //   840: lookupswitch {
        //          -1163224023: 833
        //          -982885718: 868
        //          default: 1310
        //        }
        //   868: aload           12
        //   870: iconst_1       
        //   871: faload         
        //   872: getstatic       dev/nuker/pyro/fc.0:I
        //   875: ifeq            884
        //   878: ldc_w           437605551
        //   881: goto            887
        //   884: ldc_w           -940102607
        //   887: ldc_w           -568426364
        //   890: ixor           
        //   891: lookupswitch {
        //          -1106160271: 884
        //          -1005857749: 1300
        //          default: 916
        //        }
        //   916: aload           12
        //   918: iconst_2       
        //   919: faload         
        //   920: fconst_1       
        //   921: goto            925
        //   924: athrow         
        //   925: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //   928: goto            932
        //   931: athrow         
        //   932: goto            936
        //   935: athrow         
        //   936: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //   939: goto            943
        //   942: athrow         
        //   943: aload           7
        //   945: iload_1        
        //   946: i2d            
        //   947: iload           9
        //   949: i2d            
        //   950: dconst_0       
        //   951: goto            955
        //   954: athrow         
        //   955: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181662_b:(DDD)Lnet/minecraft/client/renderer/BufferBuilder;
        //   958: goto            962
        //   961: athrow         
        //   962: getstatic       dev/nuker/pyro/fc.0:I
        //   965: ifeq            974
        //   968: ldc_w           1014484392
        //   971: goto            977
        //   974: ldc_w           -641853067
        //   977: ldc_w           752823449
        //   980: ixor           
        //   981: lookupswitch {
        //          -178178580: 1008
        //          279503153: 974
        //          default: 1326
        //        }
        //  1008: aload           12
        //  1010: iconst_0       
        //  1011: faload         
        //  1012: aload           12
        //  1014: iconst_1       
        //  1015: faload         
        //  1016: aload           12
        //  1018: iconst_2       
        //  1019: faload         
        //  1020: fconst_1       
        //  1021: goto            1025
        //  1024: athrow         
        //  1025: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181666_a:(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
        //  1028: goto            1032
        //  1031: athrow         
        //  1032: getstatic       dev/nuker/pyro/fc.c:I
        //  1035: ifge            1044
        //  1038: ldc_w           253804773
        //  1041: goto            1047
        //  1044: ldc_w           -1168518570
        //  1047: ldc_w           -388020219
        //  1050: ixor           
        //  1051: lookupswitch {
        //          -424991505: 1044
        //          -402683680: 1332
        //          default: 1076
        //        }
        //  1076: goto            1080
        //  1079: athrow         
        //  1080: invokevirtual   net/minecraft/client/renderer/BufferBuilder.func_181675_d:()V
        //  1083: goto            1087
        //  1086: athrow         
        //  1087: fload           11
        //  1089: fstore          8
        //  1091: iinc            9, 1
        //  1094: goto            214
        //  1097: aload_0        
        //  1098: aload           7
        //  1100: iload_1        
        //  1101: iload_2        
        //  1102: iload_3        
        //  1103: getstatic       dev/nuker/pyro/fc.0:I
        //  1106: ifeq            1115
        //  1109: ldc_w           1773720908
        //  1112: goto            1118
        //  1115: ldc_w           -1964411853
        //  1118: ldc_w           1976108564
        //  1121: ixor           
        //  1122: lookupswitch {
        //          -1515740344: 1115
        //          477221720: 1312
        //          default: 1148
        //        }
        //  1148: iload           4
        //  1150: fload           5
        //  1152: getstatic       dev/nuker/pyro/fc.c:I
        //  1155: ifge            1164
        //  1158: ldc_w           -1264723217
        //  1161: goto            1167
        //  1164: ldc_w           -146368649
        //  1167: ldc_w           -1141544782
        //  1170: ixor           
        //  1171: lookupswitch {
        //          258519645: 1164
        //          1286864837: 1196
        //          default: 1298
        //        }
        //  1196: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //  1199: fload           5
        //  1201: fconst_1       
        //  1202: fconst_1       
        //  1203: fconst_1       
        //  1204: getstatic       dev/nuker/pyro/fc.c:I
        //  1207: ifge            1216
        //  1210: ldc_w           -1488817485
        //  1213: goto            1219
        //  1216: ldc_w           -1917348227
        //  1219: ldc_w           -1562621797
        //  1222: ixor           
        //  1223: lookupswitch {
        //          94255656: 1328
        //          736488996: 1216
        //          default: 1248
        //        }
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: invokespecial   dev/nuker/pyro/f3V.0:(Lnet/minecraft/client/renderer/BufferBuilder;IIIIF[F)V
        //  1266: goto            1270
        //  1269: athrow         
        //  1270: aload           6
        //  1272: goto            1276
        //  1275: athrow         
        //  1276: invokevirtual   net/minecraft/client/renderer/Tessellator.func_78381_a:()V
        //  1279: goto            1283
        //  1282: athrow         
        //  1283: aload_0        
        //  1284: goto            1288
        //  1287: athrow         
        //  1288: invokespecial   dev/nuker/pyro/f3V.c:()V
        //  1291: goto            1295
        //  1294: athrow         
        //  1295: return         
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
        //  1324: aconst_null    
        //  1325: athrow         
        //  1326: aconst_null    
        //  1327: athrow         
        //  1328: aconst_null    
        //  1329: athrow         
        //  1330: aconst_null    
        //  1331: athrow         
        //  1332: aconst_null    
        //  1333: athrow         
        //  1334: pop            
        //  1335: goto            24
        //  1338: pop            
        //  1339: aconst_null    
        //  1340: goto            1334
        //  1343: dup            
        //  1344: ifnull          1334
        //  1347: checkcast       Ljava/lang/Throwable;
        //  1350: athrow         
        //  1351: dup            
        //  1352: ifnull          1338
        //  1355: checkcast       Ljava/lang/Throwable;
        //  1358: athrow         
        //  1359: aconst_null    
        //  1360: athrow         
        //    StackMapTable: 00 AB 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 06 07 00 03 01 01 01 01 02 00 00 42 07 00 1D 00 45 07 00 1D 40 07 00 B6 4B 07 00 B6 FF 00 02 00 06 07 00 03 01 01 01 01 02 00 02 07 00 B6 01 5D 07 00 B6 FF 00 06 00 07 07 00 03 01 01 01 01 02 07 00 B6 00 01 07 00 4B 40 07 00 B6 45 07 00 1D 40 07 00 63 FF 00 10 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 FF 00 02 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 03 07 00 03 07 00 63 01 FF 00 1C 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 42 07 00 0F FF 00 00 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 45 07 00 1D 00 FF 00 15 00 0A 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 00 01 01 FF 00 02 00 0A 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 00 02 01 01 5F 01 FC 00 01 01 5B 02 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 02 02 01 5E 02 FF 00 0C 00 0C 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 00 01 07 00 1D FF 00 00 00 0C 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FC 00 0D 07 00 AB 42 01 1D 4E 07 00 CE FF 00 02 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 02 07 00 CE 01 5D 07 00 CE 47 07 00 0D FF 00 00 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 05 07 00 CE 02 02 02 02 45 07 00 1D 40 07 00 AB FC 00 0D 07 00 AB 42 01 1E FF 00 0F 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 03 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 FF 00 11 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 03 03 03 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 42 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4F 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 51 40 07 00 63 45 07 00 1D 00 4D 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5C 07 00 63 FF 00 0C 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4F 07 00 51 FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5F 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 0B 42 01 1D 4C 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 FF 00 0F 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 0F 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 02 02 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 47 07 00 45 FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 42 07 00 1D 40 07 00 63 45 07 00 1D 00 FF 00 0A 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5E 07 00 63 4F 07 00 1D FF 00 00 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 05 07 00 63 02 02 02 02 45 07 00 1D 40 07 00 63 4B 07 00 63 FF 00 02 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 01 5C 07 00 63 42 07 00 0D 40 07 00 63 45 07 00 1D 00 F8 00 09 FF 00 11 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 05 07 00 03 07 00 63 01 01 01 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 06 07 00 03 07 00 63 01 01 01 01 FF 00 1D 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 05 07 00 03 07 00 63 01 01 01 FF 00 0F 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 07 07 00 03 07 00 63 01 01 01 01 02 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 01 FF 00 1C 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 07 07 00 03 07 00 63 01 01 01 01 02 FF 00 13 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 0C 07 00 03 07 00 63 01 01 01 01 02 07 00 CE 02 02 02 02 FF 00 02 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 0D 07 00 03 07 00 63 01 01 01 01 02 07 00 CE 02 02 02 02 01 FF 00 1C 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 0C 07 00 03 07 00 63 01 01 01 01 02 07 00 CE 02 02 02 02 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 0C 07 00 03 07 00 63 01 01 01 01 02 07 00 CE 02 02 02 02 45 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 42 07 00 43 FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 08 07 00 03 07 00 63 01 01 01 01 02 07 00 AB 45 07 00 1D 00 44 07 00 55 40 07 00 B6 45 07 00 1D 00 FF 00 03 00 00 00 01 07 00 1D FF 00 00 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 01 07 00 03 45 07 00 1D 00 FE 00 00 02 07 00 AB 07 00 AB FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 07 07 00 03 07 00 63 01 01 01 01 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 03 07 00 63 02 02 FF 00 01 00 0D 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 00 01 07 00 CE 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 02 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 05 07 00 03 07 00 63 01 01 01 FF 00 01 00 06 07 00 03 01 01 01 01 02 00 01 07 00 B6 FF 00 01 00 08 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 00 02 07 00 03 07 00 63 FF 00 01 00 0A 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 00 01 01 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 04 07 00 63 03 03 03 41 07 00 63 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 02 07 00 63 03 41 07 00 63 FF 00 01 00 0B 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 00 0C 07 00 03 07 00 63 01 01 01 01 02 07 00 CE 02 02 02 02 41 02 FF 00 01 00 0E 07 00 03 01 01 01 01 02 07 00 B6 07 00 63 02 01 01 02 07 00 AB 07 00 AB 00 01 07 00 63 FF 00 01 00 06 07 00 03 01 01 01 01 02 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1343   1351   Any
        //  1343   1351   1343   1351   Any
        //  1359   1361   3      8      Ljava/lang/IllegalArgumentException;
        //  27     34     34     35     Any
        //  28     34     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  28     34     27     28     Any
        //  27     34     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  27     34     3      8      Any
        //  87     94     94     95     Any
        //  88     94     87     88     Ljava/util/NoSuchElementException;
        //  87     94     94     95     Any
        //  88     94     87     88     Ljava/lang/ArithmeticException;
        //  87     94     3      8      Ljava/lang/NumberFormatException;
        //  147    154    154    155    Any
        //  147    154    154    155    Any
        //  147    154    147    148    Ljava/lang/NegativeArraySizeException;
        //  147    154    3      8      Ljava/lang/ClassCastException;
        //  148    154    154    155    Any
        //  289    296    296    297    Any
        //  289    296    3      8      Ljava/lang/NullPointerException;
        //  289    296    3      8      Ljava/util/NoSuchElementException;
        //  289    296    289    290    Any
        //  289    296    296    297    Ljava/lang/IllegalStateException;
        //  400    407    407    408    Any
        //  400    407    3      8      Ljava/lang/RuntimeException;
        //  400    407    400    401    Ljava/lang/IllegalArgumentException;
        //  400    407    407    408    Any
        //  401    407    407    408    Any
        //  559    566    566    567    Any
        //  559    566    559    560    Ljava/lang/AssertionError;
        //  559    566    566    567    Ljava/lang/ClassCastException;
        //  560    566    559    560    Ljava/lang/ArithmeticException;
        //  559    566    3      8      Any
        //  583    590    590    591    Any
        //  583    590    583    584    Any
        //  584    590    3      8      Ljava/lang/NumberFormatException;
        //  583    590    590    591    Any
        //  583    590    590    591    Any
        //  594    601    601    602    Any
        //  594    601    601    602    Any
        //  594    601    601    602    Any
        //  595    601    3      8      Ljava/lang/RuntimeException;
        //  594    601    594    595    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  662    668    668    669    Any
        //  662    668    668    669    Ljava/lang/EnumConstantNotPresentException;
        //  662    668    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  662    668    3      8      Any
        //  662    668    3      8      Ljava/util/NoSuchElementException;
        //  685    692    692    693    Any
        //  686    692    692    693    Any
        //  685    692    692    693    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  685    692    692    693    Ljava/lang/NullPointerException;
        //  685    692    685    686    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  743    750    750    751    Any
        //  744    750    743    744    Any
        //  743    750    750    751    Ljava/lang/NumberFormatException;
        //  744    750    3      8      Any
        //  744    750    3      8      Ljava/lang/IllegalArgumentException;
        //  809    816    816    817    Any
        //  810    816    809    810    Any
        //  810    816    816    817    Any
        //  809    816    3      8      Any
        //  809    816    816    817    Any
        //  924    931    931    932    Any
        //  924    931    3      8      Ljava/lang/ClassCastException;
        //  924    931    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  925    931    931    932    Ljava/lang/NullPointerException;
        //  925    931    924    925    Ljava/lang/IndexOutOfBoundsException;
        //  935    942    942    943    Any
        //  936    942    942    943    Ljava/lang/AssertionError;
        //  936    942    935    936    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  935    942    942    943    Ljava/util/NoSuchElementException;
        //  935    942    935    936    Any
        //  955    961    961    962    Any
        //  955    961    3      8      Any
        //  955    961    3      8      Ljava/util/ConcurrentModificationException;
        //  955    961    3      8      Any
        //  955    961    961    962    Ljava/lang/IllegalStateException;
        //  1024   1031   1031   1032   Any
        //  1025   1031   1024   1025   Any
        //  1024   1031   1031   1032   Ljava/lang/IllegalStateException;
        //  1024   1031   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1025   1031   1024   1025   Any
        //  1079   1086   1086   1087   Any
        //  1079   1086   1079   1080   Ljava/lang/NumberFormatException;
        //  1079   1086   1079   1080   Ljava/lang/IllegalArgumentException;
        //  1079   1086   3      8      Ljava/lang/UnsupportedOperationException;
        //  1079   1086   1086   1087   Ljava/lang/EnumConstantNotPresentException;
        //  1252   1258   1258   1259   Any
        //  1252   1258   1258   1259   Ljava/lang/NumberFormatException;
        //  1252   1258   1258   1259   Ljava/lang/AssertionError;
        //  1252   1258   1258   1259   Ljava/util/NoSuchElementException;
        //  1252   1258   1258   1259   Any
        //  1262   1269   1269   1270   Any
        //  1262   1269   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1263   1269   1262   1263   Ljava/util/NoSuchElementException;
        //  1263   1269   1269   1270   Any
        //  1262   1269   3      8      Any
        //  1275   1282   1282   1283   Any
        //  1276   1282   3      8      Any
        //  1276   1282   3      8      Ljava/lang/RuntimeException;
        //  1275   1282   1275   1276   Ljava/lang/IllegalStateException;
        //  1275   1282   1282   1283   Any
        //  1288   1294   1294   1295   Any
        //  1288   1294   1294   1295   Any
        //  1288   1294   1294   1295   Any
        //  1288   1294   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1288   1294   3      8      Any
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
}
